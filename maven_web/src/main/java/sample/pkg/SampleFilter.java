package sample.pkg;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet Filter implementation class SampleFilter
 */
public class SampleFilter implements Filter {

	private static final Logger LOG = LogManager.getLogger(SampleListener.class);

	/**
	 * Default constructor.
	 */
	public SampleFilter() {
		LOG.info("INFO");
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		LOG.info("INFO");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		LOG.info("INFO");

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		LOG.info("INFO");
	}

}
