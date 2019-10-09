package tdt4250.converter.temperature;

import org.osgi.service.component.annotations.Component;

import tdt4250.converter.api.Unit;
import tdt4250.converter.util.UnitConverter;

@Component(
		property = { 
				UnitConverter.UNIT_NAME_PROP + "=temp",
				UnitConverter.UNIT_TYPE_PROP + "=temperature"})

public class Temprature extends UnitConverter implements Unit{

	public Temprature() {
		addValidUnit(new Celsius());
		addValidUnit(new Fahrenheit());
	}
	
	@Override
	public String getUnitSymbol() {
		return null;
	}

	@Override
	public String convert(Unit initialUnit, Unit targetUnit, String value) {
		if (initialUnit.getUnitSymbol() == "k") {
			return targetUnit.convert(initialUnit, targetUnit, value);
		}
		else {
			return targetUnit.convert(initialUnit, targetUnit, initialUnit.convert(initialUnit, new Kelvin(), value));
		}
	}

}
