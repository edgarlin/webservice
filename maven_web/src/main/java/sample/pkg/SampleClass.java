package sample.pkg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SampleClass {

	private static final Logger LOG = LogManager.getLogger(SampleListener.class);

	public static void main(String[] args) {
		LOG.info("INFO");
	}

}
