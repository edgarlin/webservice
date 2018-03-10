package sample.pkg;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class SampleServlet
 */
public class SampleServlet extends HttpServlet {

	private static final Logger LOG = LogManager.getLogger(SampleServlet.class);

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SampleServlet() {
		super();
		LOG.info("INFO");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LOG.info("INFO");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LOG.info("INFO");
		doGet(request, response);
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		for (Enumeration<String> parmNames = config.getInitParameterNames(); parmNames.hasMoreElements();) {
			String parmName = parmNames.nextElement();
			LOG.info(parmName + ":" + config.getInitParameter(parmName));
		}
	}

}
