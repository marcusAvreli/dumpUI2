package dumpUI2.gui;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dumpUI2.entity.Report;
import dumpUI2.gui.components.detailspanel.GenericDetailPanel;
import dumpUI2.gui.components.detailspanel.ReportDetailPanel;
import dumpUI2.gui.components.itemslist.GenericDynamicItemsListPanel;
import dumpUI2.gui.components.itemslist.ReportListPanel;

public class MainFrame extends JFrame {
	private JPanel mainPanel;
	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(MainFrame.class);

	public MainFrame() {

		logger.info("CheckPost_1");
		initComponents();
		logger.info("CheckPost_2");

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	public void clearMainPanel() {

		this.mainPanel.removeAll();
		this.mainPanel.validate();
		this.mainPanel.repaint();
	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		mainPanel = new JPanel();
		 mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		//GenericDetailPanel<Report> panel = new ReportDetailPanel();
		GenericDynamicItemsListPanel<Report> panel = new ReportListPanel();
		mainPanel.add(panel);
		
		 GroupLayout layout = new GroupLayout(getContentPane());
		    getContentPane().setLayout(layout);
		    layout.setHorizontalGroup(
		      layout.createParallelGroup(GroupLayout.Alignment.LEADING)		      
		      .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
		    );
		    layout.setVerticalGroup(
		      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
		      .addGroup(layout.createSequentialGroup()
		        
		        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
		        .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE))
		    );

		pack();
	}// </editor-fold>//GEN-END:initComponents

}
