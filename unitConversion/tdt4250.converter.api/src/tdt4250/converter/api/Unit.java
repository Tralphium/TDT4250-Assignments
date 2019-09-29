package tdt4250.converter.api;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface Unit {
	String getUnitName();
	UnitConversionResult convert(String conversionValue);

}
