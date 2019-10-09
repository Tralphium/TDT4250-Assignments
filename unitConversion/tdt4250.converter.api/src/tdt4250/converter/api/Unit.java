package tdt4250.converter.api;

import java.util.Collection;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface Unit {
	String getUnitSymbol();
	String convert(Unit initialUnit, Unit targetUnit, String value);
	
	Collection<Unit> getValidUnits();

}
