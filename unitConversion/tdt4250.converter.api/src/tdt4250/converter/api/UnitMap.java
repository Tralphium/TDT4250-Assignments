package tdt4250.converter.api;

import java.util.HashMap;
import java.util.Map;

public class UnitMap {
	private final Map<String, Unit> unitMap;
	
	public UnitMap() {
		unitMap = new HashMap<>();
	}
	
	public Unit get(String unit) {
		return unitMap.get(unit);
	}
	
	public void putUnitsFrom(Unit unit) {
		for (Unit validUnit : unit.getValidUnits()) {
			String unitSymbol = validUnit.getUnitSymbol();
			if (unitMap.containsKey(unitSymbol)) {
				throw new IllegalArgumentException("Allready registered");
			}
			unitMap.put(unitSymbol, validUnit);
		}
	}
	
	public void removeUnitsFrom(Unit unit) {
		for (Unit validUnit : unit.getValidUnits()) {
			String unitSymbol = validUnit.getUnitSymbol();
			unitMap.remove(unitSymbol);
		}
	}

}
