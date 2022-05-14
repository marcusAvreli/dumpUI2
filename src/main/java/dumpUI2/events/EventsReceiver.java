package dumpUI2.events;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dumpUI2.event.Event;

public class EventsReceiver {
	private static final Logger logger = LoggerFactory.getLogger(EventsReceiver.class);

	private ArrayList<Event> events;

	private EventsReceiver() {

		this.events = new ArrayList<Event>();
	}

	public static EventsReceiver getInstance() {
		return EventsReceiverSingleton.INSTANCE;
	}

	private static class EventsReceiverSingleton {
		private static final EventsReceiver INSTANCE = new EventsReceiver();
	}

	public void addEvent(Event event) {

		this.events.add(event);
	}

	public void fireEvents() {
		logger.info("fire_events");
		int i;

		for (i = 0; i < this.events.size(); i++) {

			this.events.get(i).fireEvent();
		}

		this.events.clear();
	}

}