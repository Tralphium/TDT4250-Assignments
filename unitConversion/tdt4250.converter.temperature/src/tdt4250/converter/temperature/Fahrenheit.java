package tdt4250.converter.temperature;


import org.osgi.service.component.annotations.Component;

import tdt4250.converter.api.Unit;
import tdt4250.converter.util.UnitConverter;

@Component(
		property = {
				UnitConverter.UNIT_NAME_PROP + "=f",
				UnitConverter.UNIT_TYPE_PROP + "=temperature"
		})


public class Fahrenheit extends UnitConverter implements Unit {
	
	public String toKelvin(String value) {
		return String.valueOf((Float.valueOf(value) - 32) * (5/9) + 275.15);
	}
	
	public String fromKelvin(String value) {
		return String.valueOf((Float.valueOf(value) - 275.15) * (9/5) + 32);
	}

	@Override
	public String getUnitSymbol() {
		return "f";
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
