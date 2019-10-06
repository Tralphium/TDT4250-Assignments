package tdt4250.converter.util;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import tdt4250.converter.api.Unit;
import tdt4250.converter.api.UnitConverterApi;

@Component(
		
				configurationPid = UnitConverter.FACTORY_PID,
				configurationPolicy = ConfigurationPolicy.REQUIRE)
public abstract class UnitConverter extends UnitConverterApi {
	public static final String FACTORY_PID = "tdt4250.converter.util.UnitConverter";
	
	public static final String UNIT_TYPE_PROP = "unitType";
	public static final String UNIT_NAME_PROP = "unitName";
	
	public UnitConverter(Unit[] validUnits) {
		super(validUnits);
	}

	

}
