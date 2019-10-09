package tdt4250.converter.temperature;


import org.osgi.service.component.annotations.Component;

import tdt4250.converter.api.Unit;
import tdt4250.converter.util.UnitConverter;

@Component(
		property = {
				UnitConverter.UNIT_NAME_PROP + "=c",
				UnitConverter.UNIT_TYPE_PROP + "=temperature"
		})


public class Celsius extends UnitConverter implements Unit {
	
	public String toKelvin(String value) {
		return String.valueOf(Float.valueOf(value) + 275.15);
	}
	
	public String fromKelvin(String value) {
		return String.valueOf(Float.valueOf(value) - 275.15);
	}

	@Override
	public String getUnitSymbol() {
		return "c";
	}

	@Override
	public String convert(Unit initialUnit, Unit targetUnit, String value) {
		if (targetUnit.getUnitSymbol() == "k") {
			return toKelvin(value);
		} else {
			return fromKelvin(value);
		}
	}
	

}
