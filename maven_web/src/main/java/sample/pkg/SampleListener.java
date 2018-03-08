package sample.pkg;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Application Lifecycle Listener implementation class SampleListener
 *
 */
public class SampleListener implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener,
		HttpSessionAttributeListener, HttpSessionActivationListener, HttpSessionBindingListener, ServletRequestListener,
		ServletRequestAttributeListener {

	private static final Logger LOG = LogManager.getLogger(SampleListener.class);

	/**
	 * Default constructor.
	 */
	public SampleListener() {
		LOG.info("INFO");
	}

	/**
	 * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
	 */
	public void sessionCreated(HttpSessionEvent se) {
		LOG.info("INFO");
	}

	/**
	 * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
	 */
	public void attributeRemoved(ServletContextAttributeEvent event) {
		LOG.info("INFO");
	}

	/**
	 * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
	 */
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		LOG.info("INFO");
	}

	/**
	 * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
	 */
	public void attributeReplaced(HttpSessionBindingEvent event) {
		LOG.info("INFO");
	}

	/**
	 * @see HttpSessionActivationListener#sessionWillPassivate(HttpSessionEvent)
	 */
	public void sessionWillPassivate(HttpSessionEvent se) {
		LOG.info("INFO");
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent sce) {
		LOG.info("INFO");
	}

	/**
	 * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
	 */
	public void attributeAdded(ServletContextAttributeEvent event) {
		LOG.info("INFO");
	}

	/**
	 * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
	 */
	public void requestDestroyed(ServletRequestEvent sre) {
		LOG.info("INFO");
	}

	/**
	 * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
	 */
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		LOG.info("INFO");
	}

	/**
	 * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
	 */
	public void valueBound(HttpSessionBindingEvent event) {
		LOG.info("INFO");
	}

	/**
	 * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
	 */
	public void requestInitialized(ServletRequestEvent sre) {
		LOG.info("INFO");
	}

	/**
	 * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
	 */
	public void sessionDestroyed(HttpSessionEvent se) {
		LOG.info("INFO");
	}

	/**
	 * @see HttpSessionActivationListener#sessionDidActivate(HttpSessionEvent)
	 */
	public void sessionDidActivate(HttpSessionEvent se) {
		LOG.info("INFO");
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent sce) {
		LOG.info("INFO");
	}

	/**
	 * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
	 */
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		LOG.info("INFO");
	}

	/**
	 * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
	 */
	public void attributeAdded(HttpSessionBindingEvent event) {
		LOG.info("INFO");
	}

	/**
	 * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
	 */
	public void attributeRemoved(HttpSessionBindingEvent event) {
		LOG.info("INFO");
	}

	/**
	 * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
	 */
	public void attributeReplaced(ServletContextAttributeEvent event) {
		LOG.info("INFO");
	}

	/**
	 * @see HttpSessionBindingListener#valueUnbound(HttpSessionBindingEvent)
	 */
	public void valueUnbound(HttpSessionBindingEvent event) {
		LOG.info("INFO");
	}

}
