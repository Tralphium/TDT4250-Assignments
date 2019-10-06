package tdt4150.converter.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
import org.osgi.service.log.Logger;
import org.osgi.service.log.LoggerFactory;

import tdt4250.converter.api.Unit;
import tdt4250.converter.api.UnitConversion;
import tdt4250.converter.api.UnitConversionResult;

@Component
@HttpWhiteboardServletPattern("/convert/*")

public class ConverterServlet extends HttpServlet implements Servlet{
	
	private static final long serialVersionUID = 1L;
	
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
	
	@Reference(cardinality = ReferenceCardinality.OPTIONAL)
	private volatile LoggerFactory loggerFactory;
	
	private Logger getLogger() {
		if (loggerFactory != null) {
			return loggerFactory.getLogger(ConverterServlet.class);
		}
		return null;
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> segments = new ArrayList<>();
		String path = request.getPathTranslated(); 
		Logger logger = getLogger();
		logger.info("Received request for " + path);
		if (path != null) {
			segments.addAll(Arrays.asList(path.split("\\/")));
		}
		if (segments.size() > 0 && segments.get(0).length() == 0) {
			segments.remove(0);
		}
		if (segments.size() > 3) {
			response.sendError(HttpServletResponse.SC_NOT_ACCEPTABLE, "Request must contain max 3 path segments");
			return;
		}
		String q = request.getParameter("q");
		UnitConversionResult result = unitConversion.convert(segments.get(0), segments.get(1), segments.get(2), q);
		logger.info("Conversion result " + (result.isSuccess() ? "succeeded" : "failed"));
		response.setContentType("text/plain");
		PrintWriter writer = response.getWriter();
		if (result.getLink() != null) {
			writer.print(result.getLink());
		}
		writer.print(result.getMessage());
	}
}
