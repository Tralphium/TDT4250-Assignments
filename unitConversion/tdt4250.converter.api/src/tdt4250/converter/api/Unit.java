package tdt4250.converter.api;

import java.util.Collection;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface Unit {
	String getUnitSymbol();
	String convert(String value, String targetUnit);
	
	Collection<Unit> getValidUnits();

}
