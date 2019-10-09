package tdt4150.converter.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletPattern;
import tdt4250.converter.api.Unit;
import tdt4250.converter.api.UnitConversion;
import tdt4250.converter.api.UnitConversionResult;

@Component
@HttpWhiteboardServletPattern("/convert/*")

public class ConverterServlet extends HttpServlet implements Servlet{
	
	private static final long serialVersionUID = 1L;
	
	private static final String VALUE_PARAM = "v";
	private static final String FROM_PARAM = "from";
	private static final String TO_PARAM = "to";
	
	private UnitConversion unitConversion = new UnitConversion();
	
	@Reference(
					cardinality = ReferenceCardinality.MULTIPLE,
					policy = ReferencePolicy.DYNAMIC,
					bind = "addUnit",
					unbind = "removeUnit"
	)
	
	public void addUnit(Unit unit) {
		unitConversion.addUnit(unit);
	}
	
	public void removeUnit(Unit unit) {
		unitConversion.removeUnit(unit);
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String[]> parameterMap = request.getParameterMap();
		if (!parameterMap.containsKey(VALUE_PARAM)
				|| !parameterMap.containsKey(FROM_PARAM)
				|| !parameterMap.containsKey(TO_PARAM)) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST,
					"Request must contain all three parameters: "
							+ VALUE_PARAM + ", " + FROM_PARAM + " and " + TO_PARAM);
			return;
		}

		String value = request.getParameter(VALUE_PARAM);
		Unit fromUnit = parseUnitSymbol(request.getParameter(FROM_PARAM), response);
		Unit toUnit = parseUnitSymbol(request.getParameter(TO_PARAM), response);
		if (fromUnit == null || toUnit == null)
			return;

		UnitConversionResult result = unitConversion.convert(fromUnit, toUnit, value);
		sendResponse(result, response);
	}

	private void sendResponse(UnitConversionResult result, HttpServletResponse response) throws IOException {
		if (!result.success) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND,
					"Could not convert between " + result.initialUnit.getUnitSymbol() + " and " + result.targetUnit.getUnitSymbol());
		}

		response.setContentType("text/plain");
		PrintWriter writer = response.getWriter();
		writer.println("--- Conversion from " + result.initialUnit.getUnitSymbol() + " to " + result.targetUnit.getUnitSymbol() + " ---");
		writer.println(result.value + " " + result.initialUnit + " = " + result.result + " " + result.targetUnit);
		
	}

	private Unit parseUnitSymbol(String unitParam, HttpServletResponse response) throws IOException {
		unitParam = unitParam.trim();
		if (unitParam.length() != 1) {
			throw new IllegalArgumentException(
					"Cannot convert a unit with a symbol of more than one character: '" + unitParam + "'");
		}

		Unit unit = unitConversion.getUnitBySymbol(unitParam);
		if (unit == null) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND,
					"No registered unit " + unitParam.toUpperCase());
		}
		return unit;
	}
	
}
