package org.log.com;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Log {
	static final Logger logger=LogManager.getLogger(Log.class.getName());
	public static void log(int a)
	{
		if(a==1)
		{
			logger.trace("Tracking");
		}
		else if(a==2)
		{
			logger.info("Information");
		}
		else if(a==3)
		{
			logger.error("Error Message");
		}
		else if(a==4)
		{
			logger.warn("Warnning Message");
		}
		else if(a==5)
		{
			logger.fatal("Fatal Error");
		}
		
	}
	

}
