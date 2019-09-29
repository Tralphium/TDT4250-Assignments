package tdt4250.converter.api;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UnitConversion {

	private static final String DEFAULT_MESSAGE = "Sorry, unsupported unit";
	private Collection<Unit> units = new ArrayList<>();
	
	public void addUnit(Unit unit) {
		units.add(unit);
	}
	
	public void removeUnit(Unit unit) {
		units.remove(unit);
	}
	
	public UnitConversion(Unit...units ) {
		this.units.addAll(Arrays.asList(units));
	}
	
	private UnitConversionResult convert(String conversionValue, Iterable<Unit> units) {
		StringBuilder messages = new StringBuilder();
		URI link = null;
		boolean success = false;
		for (Unit u : units) {
			UnitConversionResult result = u.convert(conversionValue);
			if (result.isSuccess()) {
				messages.append(result.getMessage());
				messages.append("(" + u.getUnitName() + ")\n");
				success = true;
				if (link == null) {
					link = result.getLink();
				}
			}
		}
		if (messages.length() == 0) {
			messages.append(DEFAULT_MESSAGE);
		}
		return new UnitConversionResult(success, messages.toString(), link);
	}
	
	public UnitConversionResult convert(String unitKey, String conversionValue) {
		return convert(conversionValue, this.units.stream().filter(unit -> unit.getUnitName().equals(unitKey)).collect(Collectors.toList()));
	}
	
	public UnitConversionResult convert(String conversionValue) {
		return convert(conversionValue, units);
	}
	
}
