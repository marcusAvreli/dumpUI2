package dumpUI2.command;

import javax.sql.rowset.spi.XmlReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dumpUI2.Command;
import dumpUI2.context.Context;
import dumpUI2.events.EventsReceiver;

public class ReadXml implements Command{
	private static final Logger logger = LoggerFactory.getLogger(ReadXml.class);
	private XmlReader xmlReader;
	public XmlReader getXmlReader() {
		return xmlReader;
	}
	public void setXmlReader(XmlReader xmlReader) {
		this.xmlReader = xmlReader;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		logger.info("read xml");
		boolean successful = Context.getInstance().getXmlReadDAO().xmlReadDAO();
		EventsReceiver.getInstance().fireEvents();
	
	}

}