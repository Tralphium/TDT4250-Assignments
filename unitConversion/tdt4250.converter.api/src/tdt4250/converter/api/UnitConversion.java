package tdt4250.converter.api;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UnitConversion {

	private static final String DEFAULT_MESSAGE = "Sorry, unit(s) are not supported ";
	
	
	public UnitConversionResult convert(String initialUnit, String value, String targetUnit, String q) {
		StringBuilder messages = new StringBuilder();
		URI link = null;
		boolean success = false;
		Unit u = 
		
		for (Unit u : units) {
			UnitConversionResult result = u.convert(value);
			if (result.isSuccess()) {
				messages.append(result.getMessage());
				messages.append("(" + u.getUnit() + ")\n");
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
}
