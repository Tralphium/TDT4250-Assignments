package tdt4250.converter.api;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public abstract class UnitConverterApi implements Unit {
	private final Collection<Unit> validUnits;

	public UnitConverterApi(Unit[] validUnits) {
		this.validUnits = Collections.unmodifiableCollection(Arrays.asList(validUnits));
	}
	
	@Override
	public abstract String getUnitSymbol();

	@Override
	public abstract String convert(String value, String targetUnit);

	@Override
	public Collection<Unit> getValidUnits() {
		return validUnits;
	}
	
	protected boolean validCombination(Unit unit1, Unit unit2) {
		return validUnits.contains(unit1) && validUnits.contains(unit2);
	}

}
