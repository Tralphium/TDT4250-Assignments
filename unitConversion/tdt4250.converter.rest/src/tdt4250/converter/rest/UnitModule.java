package tdt4250.converter.rest;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleSerializers;

import tdt4250.converter.api.UnitConversionResult;

public class UnitModule extends Module {
	
	private final SimpleSerializers serializers = new SimpleSerializers();

	@Override
	public String getModuleName() {
		return "UnitModule";
	}
	
	public UnitModule() {
		serializers.addSerializer(UnitConversionResult.class, new JsonSerializer<UnitConversionResult>() {
			@Override
			public void serialize(UnitConversionResult unitConversionResult, JsonGenerator jsonGen,
					SerializerProvider serializerProvider) throws IOException {
				jsonGen.writeStartObject(unitConversionResult);
				jsonGen.writeBooleanField("success", unitConversionResult.isSuccess());
				jsonGen.writeStringField("message", unitConversionResult.getMessage());
				if (unitConversionResult.getLink() != null) {
					jsonGen.writeStringField("link", unitConversionResult.getLink().toString());
				}
			}
		});
	}

	@Override
	public void setupModule(final SetupContext context) {
		context.addSerializers(serializers);
	}

	@Override
	public Version version() {
		return Version.unknownVersion();
	}
	

}
