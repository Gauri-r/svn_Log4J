package Alpha;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	
	private static Logger log=LogManager.getLogger(Log4jDemo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("M Debugging");
		
		log.error("Error in a program");
		
		log.info("INfo");
		
		log.fatal("Fatal Error");
	}

}
