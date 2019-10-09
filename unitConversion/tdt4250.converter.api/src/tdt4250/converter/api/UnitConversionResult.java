package tdt4250.converter.api;

import org.osgi.annotation.versioning.ConsumerType;

@ConsumerType
public class UnitConversionResult {

	public final String value;
	public final Unit initialUnit;
	public final Unit targetUnit;
	public final String result;
	public final boolean success;
	
	public UnitConversionResult(String value, Unit initialUnit, String result, Unit targetUnit, boolean success) {
		this.value = value;
		this.initialUnit = initialUnit;
		this.targetUnit= targetUnit;
		this.result = result;
		this.success= success;
	}
	
	public UnitConversionResult(String value, Unit initialUnit, Unit targetUnit) {
		this(value, initialUnit, "F", targetUnit, false);
	}
	
	
}
