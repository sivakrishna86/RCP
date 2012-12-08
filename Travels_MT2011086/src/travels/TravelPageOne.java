package travels;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class TravelPageOne extends WizardPage {
  private Text travelsName;
  

private Composite container;
private Label travelsNameLabel;
  public TravelPageOne() {
    super("Travel World");
    
    setTitle("Travel World");
    setDescription("Welcome To Travel World.. Enter the name of the travels");
  }

  @Override
  public void createControl(Composite parent) {
    container = new Composite(parent, SWT.NULL);
    GridLayout layout = new GridLayout();
    container.setLayout(layout);
    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    
    layout.numColumns = 2;
    travelsNameLabel = new Label(container, SWT.NULL);
    travelsNameLabel.setText("Enter the name of the travels: ");

    travelsName = new Text(container, SWT.BORDER | SWT.SINGLE);
    travelsName.setLayoutData(gd);
    travelsName.setText("");
    travelsName.addKeyListener(new KeyListener() {

      @Override
      public void keyPressed(KeyEvent e) {
      }

      @Override
      public void keyReleased(KeyEvent e) {
        if (!travelsName.getText().isEmpty()) {
          setPageComplete(true);

        }
      }

    });
    
    // Required to avoid an error in the system
    setControl(container);
    setPageComplete(false);

  }

  public String getTravelsName() {
		return travelsName.getText();
	}
 
} 