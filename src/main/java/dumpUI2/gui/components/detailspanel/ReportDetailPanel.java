package dumpUI2.gui.components.detailspanel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dumpUI2.context.Context;
import dumpUI2.entity.Report;
import dumpUI2.gui.MainFrame;



public class ReportDetailPanel extends GenericDetailPanel<Report> {

	private static final Logger logger = LoggerFactory.getLogger(ReportDetailPanel.class);
	private static final long serialVersionUID = 1L;

	public ReportDetailPanel() {
		initComponents();
		Context.getInstance().getKbObserver().addReportObserver(this);
	}

	@Override
	public void entityUpdated(List<Report> items)  {
		// TODO Auto-generated method stub
		logger.info("hello entityUpdated" );
		int position;

	    position = items.indexOf(this.report);

	    if (position != -1) {

	      refreshItem(items.get(position));

	    }
	}

	@Override
	public void entityAdded(List<Report> items)  {
		// TODO Auto-generated method stub
		logger.info("hello entityAdded" );
		
		 idTextField.setText(String.valueOf(items.get(0).getId()));
	      reportTextField.setText(items.get(0).getName());
	}

	@Override
	public void entityRemoved(List<Report> items)  {
		// TODO Auto-generated method stub

	}

	@Override
	public void entityRefresh()  {
		// TODO Auto-generated method stub

	}

	@Override
	public void refreshItem(Report report) {
		// TODO Auto-generated method stub
		this.report = report;

	    if (this.report != null) {

	      idTextField.setText(String.valueOf(this.report.getId()));
	      reportTextField.setText(this.report.getName());
	      
	      setEnableTextField(true);

	    } else {

	      reset();

	    }

	}
	public void reset() {

	    idTextField.setText("");
	    reportTextField.setText("");

	    setEnableTextField(false);
	  }
	public void setEnableTextField(boolean enabled) {

	    idTextField.setEnabled(enabled);
	    reportTextField.setEnabled(enabled);
	  }

	public String getReport() {

		return reportTextField.getText();
	}

	private void initComponents() {

		idDescriptionLabel = new JLabel();
		idTextField = new JTextField();
		reportDescriptionLabel = new JLabel();
		reportTextField = new JTextField();

		idDescriptionLabel.setText("ID:");

		idTextField.setEnabled(false);

		reportDescriptionLabel.setText("Report:");

		GroupLayout layout = new GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(idDescriptionLabel).addComponent(reportDescriptionLabel))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(idTextField, GroupLayout.PREFERRED_SIZE, 89,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
						.addComponent(reportTextField, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(idDescriptionLabel).addComponent(idTextField,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(reportDescriptionLabel).addComponent(reportTextField,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))));
	}

	private JLabel reportDescriptionLabel;
	private JTextField reportTextField;
	private JLabel idDescriptionLabel;
	private JTextField idTextField;

	private Report report = null;
}
