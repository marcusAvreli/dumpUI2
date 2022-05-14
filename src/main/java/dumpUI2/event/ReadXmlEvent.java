package dumpUI2.event;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dumpUI2.context.Context;
import dumpUI2.entity.Report;

public class ReadXmlEvent implements Event {
	private static final Logger logger = LoggerFactory.getLogger(ReadXmlEvent.class);
	private List<Report> documents;

	@Override
	public void fireEvent() {

		logger.info("firing event");
		Context.getInstance().getKbObserver().fireReportAdded(documents);
	}

	public ReadXmlEvent(List<Report> documents) {
		this.documents = (List<Report>) documents;
	}

	public ReadXmlEvent(Report document) {
		this.documents = new ArrayList<Report>();
		this.documents.add(document);
	}

}