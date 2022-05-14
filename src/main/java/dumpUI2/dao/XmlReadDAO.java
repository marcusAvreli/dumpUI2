package dumpUI2.dao;

import dumpUI2.entity.Report;
import dumpUI2.event.ReadXmlEvent;
import dumpUI2.events.EventsReceiver;

public class XmlReadDAO {
	public boolean  xmlReadDAO() {
		boolean notifyObservers=true;
		Report report = new Report();
		
		report.setId(1);
		report.setName("testName");
	
	    if (notifyObservers) {	  
	    	
	      EventsReceiver.getInstance().addEvent(new ReadXmlEvent(report));
	      return true;
	    }
	    return true;
	}
}
