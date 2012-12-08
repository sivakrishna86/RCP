package travels;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class TravelPageThree extends WizardPage {
  
  private Composite container;
  private Label agent;
  private Label selectedDate;
  private DateTime dt;
  final static String[] agents = {"Orange","Kesineni","SRS Travels"};
  private Combo tourAgents;
  public TravelPageThree() {
    super("Travel World");
    
    setTitle("Travel Agent and Date");
    setDescription("Enter travel agent and date");
  }

  @Override
  public void createControl(Composite parent) {
    container = new Composite(parent, SWT.NULL);
    GridLayout layout = new GridLayout();
    container.setLayout(layout);
    //GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    
    agent= new Label(container,SWT.NONE);
    agent.setText("Agent: ");
    tourAgents= new Combo(container, SWT.BORDER|SWT.READ_ONLY);
    tourAgents.setItems(agents);
    tourAgents.addSelectionListener(new SelectionListener() {
		
		@Override
		public void widgetSelected(SelectionEvent e) {
			// TODO Auto-generated method stub
			setPageComplete(true);
		}
		
		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
    
    selectedDate = new Label(container, SWT.NONE);
    selectedDate.setText("Select a Date: ");
    
    dt = new DateTime(container, SWT.CALENDAR);
    
    setControl(container);
    setPageComplete(false);
    
    
  }
  public String getAgentName(){
	  return tourAgents.getItem(tourAgents.getSelectionIndex());
  }
  public String getDate(){
	  String tempDate="";
	  tempDate=dt.getDay()+"/"+dt.getMonth()+"/"+dt.getYear();
	  return tempDate;
  }
 
} 