package palkage;
/*production enviornment we take support form  log4j .
 * its use to find massage like  success, information,waring, error, debug. 
 * by default any massage show on console temporary.
 * to see all problem start  to end,
 * Log4j can write problem or error to the file, database and console;
 * ---How to implement log4j----
 * add first dependency form MVN
 * then upgrade mvn project.
 * 1.create logger object(object should be private, static, final )/ Logger log = Logger.getlogger(use class name.class);
 * 2.create layout (simple, HTML,XML,pattern)/------ layout name-reference name = new layout name----
 * 3.create appender (Appender app = new ConsoleAppender(layout object);)
 * 4.print massage by calling priority method form logger object.
 * 
 */


import java.io.Console;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class Employee {

	private static Logger logger = Logger.getLogger(Employee.class);
	
	public static void main(String[] args) {
		
		//SimpleLayout layout = new SimpleLayout();
		//HTMLLayout layout = new HTMLLayout();
		//XMLLayout xmlay= new XMLLayout();
		PatternLayout pLayout = new PatternLayout("%d %p %C %M %m %n");
		ConsoleAppender console = new ConsoleAppender(pLayout);
		logger.addAppender(console);
		logger.debug("this for debug");
		logger.info("this from information");
		logger.warn("this from warn");
		logger.error("this from error ");
		logger.fatal("this from fatal");
	}
	
	
	
	
	
	
	
	
	
}
