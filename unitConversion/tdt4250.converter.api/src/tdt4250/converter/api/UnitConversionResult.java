package tdt4250.converter.api;

import org.osgi.annotation.versioning.ConsumerType;

@ConsumerType
public class UnitConversionResult {

	private final String value;
	private final Unit initialUnit;
	private final Unit targetUnit;
	private final String result;
	private final boolean success;
	
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
