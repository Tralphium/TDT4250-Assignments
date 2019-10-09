package tdt4250.converter.api;

import java.util.ArrayList;
import java.util.Collection;

public abstract class UnitConverterApi implements Unit {
	private final Collection<Unit> validUnits = new ArrayList<>();
	
	@Override
	public abstract String getUnitSymbol();

	@Override
	public abstract String convert(Unit initialUnit, Unit targetUnit, String value);

	@Override
	public Collection<Unit> getValidUnits() {
		return validUnits;
	}
	
	public void addValidUnit(Unit unit) {
		validUnits.add(unit);
	}
	
	protected boolean validCombination(Unit unit1, Unit unit2) {
		return validUnits.contains(unit1) && validUnits.contains(unit2);
	}

}
