package dumpUI2.gui.components.itemslist;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dumpUI2.gui.components.tablemodel.ReportTableModel;
import dumpUI2.entity.Report;
import dumpUI2.context.Context;
import dumpUI2.EntityObserver;

public class ReportListPanel extends GenericDynamicItemsListPanel<Report> implements EntityObserver<Report> {
	private static final Logger logger = LoggerFactory.getLogger(ReportListPanel.class);

	public ReportListPanel() {
		super(new ReportTableModel());

		// TODO Auto-generated constructor stub
		Context.getInstance().getKbObserver().addReportObserver(this);

	}

	@Override
	public void entityUpdated(List<Report> items) {
		updateItems(items);

	}

	@Override
	public void entityAdded(List<Report> items) {
		addItems(items);

	}

	@Override
	public void entityRemoved(List<Report> items) {
		// TODO Auto-generated method stub
		removeItems(items);

	}

	@Override
	public void entityRefresh() {
		// TODO Auto-generated method stub
		logger.info("Entity Report Refresh");
		// refreshItems(Context.getInstance().getFactoryDAO().getReportDAO().getReports());
	}

}
