package dumpUI2.gui.components.detailspanel;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dumpUI2.EntityObserver;





public abstract class GenericDetailPanel <E extends Comparable<E>> extends JPanel implements EntityObserver<E>{
	private static final Logger logger = LoggerFactory.getLogger(GenericDetailPanel.class);
	  /** Creates new form GenericDetailPanel */
	  public GenericDetailPanel() {
	    initComponents();
	  }
	  
	  public abstract void refreshItem(E item);

	 
	  @SuppressWarnings("unchecked")
	
	  private void initComponents() {

	    GroupLayout layout = new GroupLayout(this);
	    this.setLayout(layout);
	    layout.setHorizontalGroup(
	      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	      .addGap(0, 139, Short.MAX_VALUE)
	    );
	    layout.setVerticalGroup(
	      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	      .addGap(0, 105, Short.MAX_VALUE)
	    );
	  }
}
