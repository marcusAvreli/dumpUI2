package dumpUI2.context;

import java.util.LinkedList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dumpUI2.Observer;
import dumpUI2.dao.XmlReadDAO;



public class Context {

	  
	private static final Logger logger = LoggerFactory.getLogger(Context.class);
	  
	  private Observer kbObserver = new Observer();
	  

	  private Context() {
	  
	  }
	public XmlReadDAO getXmlReadDAO() {
		return new XmlReadDAO();
	}
	  public static Context getInstance() {
	    return ContextSingleton.INSTANCE;
	  }

	
	  private static class ContextSingleton {
	    private static final Context INSTANCE = new Context();
	  }

	

	
	  public Observer getKbObserver() {
	    return kbObserver;
	  }

	

	

	

	

	}
