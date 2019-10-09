package tdt4250.converter.api;

public class UnitConversion {

	private UnitMap unitMap;
	
	public UnitConversion(Unit... units) {
		this.unitMap = new UnitMap();
		
		for (Unit unit : units) {
			addUnit(unit);
		}
	}
	
	public void addUnit(Unit unit) {
		unitMap.putUnitsFrom(unit);
	}
	
	public void removeUnit(Unit unit) {
		unitMap.removeUnitsFrom(unit);
	}
	
	public Unit getUnitBySymbol(String unit) {
		return unitMap.get(unit);
	}
	
	
	public UnitConversionResult convert(Unit initialUnit, Unit targetUnit, String value) {
		UnitConversionResult result = new UnitConversionResult(initialUnit.convert(initialUnit, targetUnit, value), initialUnit, targetUnit);
		return result;
	}
}
