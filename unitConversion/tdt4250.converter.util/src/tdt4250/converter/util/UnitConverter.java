package tdt4250.converter.util;

import java.net.MalformedURLException;
import java.net.URL;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Modified;

import tdt4250.converter.api.Unit;
import tdt4250.converter.api.UnitConversionResult;

@Component(
		
				configurationPid = UnitConverter.FACTORY_PID,
				configurationPolicy = ConfigurationPolicy.REQUIRE)
public class UnitConverter implements Unit {
	
	public static final String FACTORY_PID = "tdt4250.converter.util.UnitConverter";
	
	public static final String UNIT_CONVERTER_PROP = "unitConverter";
	public static final String UNIT_RESOURCE_PROP = "unitResource";
	public static final String UNIT_NAME_PROP = "unitName";
	
	private String name;
	private Units unit;

	@Override
	public String getUnitName() {
		return name;
	}
	
	protected void setUnitName(String name) {
		this.name = name;
	}
	
	public @interface UnitConverterConfig {
		String unitName();
		String unitResource() default "";
		String[] unitConverter() default {};
	}
	
	@Activate
	public void activate(BundleContext bc, UnitConverterConfig config) {
		update(bc, config);
	}
	
	@Modified
	public void modify(BundleContext bc, UnitConverterConfig config) {
		update(bc, config);
	}
	
	protected void update(BundleContext bc, UnitConverterConfig config) {
		setUnitName(config.unitName());
		String unitUrl = config.unitResource();
		if (unitUrl.length() > 0) {
			URL url = null;
			try {
				url = new URL(unitUrl);
			} catch (MalformedURLException e) {
				int pos = unitUrl.indexOf('#');
				String bundleId = unitUrl.substring(0, pos);
				String resourcePath = unitUrl.substring(pos + 1);
				for (Bundle bundle : bc.getBundles()) {
					if (bundle.getSymbolicName().equals(bundleId)) {
						url = bundle.getResource(resourcePath);
					}
				}
			}
			
		}
	}

	@Override
	public UnitConversionResult convert(String conversionValue) {
		// TODO Auto-generated method stub
		return null;
	}

}
