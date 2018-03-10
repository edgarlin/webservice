package sample.pkg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SampleClass {

	private static final Logger LOG = LogManager.getLogger(SampleClass.class);
	
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public static void main(String[] args) {
		LOG.info("INFO");
	}
	
	

}
