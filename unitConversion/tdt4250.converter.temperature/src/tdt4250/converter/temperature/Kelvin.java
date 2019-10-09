package tdt4250.converter.temperature;


import tdt4250.converter.api.Unit;
import tdt4250.converter.util.UnitConverter;

public class Kelvin extends UnitConverter implements Unit {

	@Override
	public String getUnitSymbol() {
		return "k";
	}

	@Override
	public String convert(Unit initialUnit, Unit targetUnit, String value) {
		return null;
	}

}
