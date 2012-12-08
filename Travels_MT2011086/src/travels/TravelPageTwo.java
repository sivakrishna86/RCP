package travels;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import java.util.*;

public class TravelPageTwo extends WizardPage {
	int flag;
	private Text source;
	private Text destination;
	private Text via1;
	private Text via2;
	private Text via3;
	private Label sourceLabel;
	private Label destinationLabel;
	private Label via1Label;
	private Label via2Label;
	private Label via3Label;
	
	ArrayList<Text> arr = new ArrayList<Text>();

	private Composite container;

	public TravelPageTwo() {
		super("Second Page");
		setTitle("Source,Destination, Via Stations");
		setDescription("Enter the names of source, destination, via stations ");

	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		container.setLayout(layout);
		layout.numColumns = 2;

		sourceLabel = new Label(container, SWT.NONE);
		sourceLabel.setText("Source Station: ");
		source = new Text(container, SWT.BORDER | SWT.SINGLE);
		source.setLayoutData(gd);
		source.setText("");
		source.addKeyListener(new PageListener());
		arr.add(source);

		destinationLabel = new Label(container, SWT.NONE);
		destinationLabel.setText("Destination Station: ");
		destination = new Text(container, SWT.BORDER | SWT.SINGLE);
		destination.setLayoutData(gd);
		destination.setText("");
		destination.addKeyListener(new PageListener());
		arr.add(destination);
		
		via1Label = new Label(container, SWT.NONE);
		via1Label.setText("Via1: ");
		via1 = new Text(container, SWT.BORDER | SWT.SINGLE);
		via1.setLayoutData(gd);
		via1.setText("");
		via1.addKeyListener(new PageListener());
		arr.add(via1);
		
		via2Label = new Label(container, SWT.NONE);
		via2Label.setText("Via2: ");
		via2 = new Text(container, SWT.BORDER | SWT.SINGLE);
		via2.setLayoutData(gd);
		via2.setText("");
		via2.addKeyListener(new PageListener());
		arr.add(via2);
		
		via3Label = new Label(container, SWT.NONE);
		via3Label.setText("Via3: ");
		via3 = new Text(container, SWT.BORDER | SWT.SINGLE);
		via3.setLayoutData(gd);
		via3.setText("");
		via3.addKeyListener(new PageListener());
		arr.add(via3);
		
		
		setControl(container);
		setPageComplete(false);
		
		
	}

	class PageListener implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			flag=0;
			for(Text tempText:arr){
				if(tempText.getText().length()==0){
					flag=1;
				}
			}
			
			if(flag==0)
			setPageComplete(true);
			else{
				flag=0;
			}
			
			
		}
		
	}

	public String getSource() {
		return source.getText();
	}

	public String getDestination() {
		return destination.getText();
	}

	public String getVia1() {
		return via1.getText();
	}

	public String getVia2() {
		return via2.getText();
	}

	public String getVia3() {
		return via3.getText();
	}
	
	
}
