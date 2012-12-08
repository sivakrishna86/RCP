package travels;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.Workbench;


public class TravelWizard extends Wizard {

  protected TravelPageOne one;
  protected TravelPageTwo two;
  protected TravelPageThree three;
  public TravelWizard() {
    super();
    setNeedsProgressMonitor(true);
  }

  @Override
  public void addPages() {
    one = new TravelPageOne();
    two = new TravelPageTwo();
    three = new TravelPageThree();
    addPage(one);
    addPage(two);
    addPage(three);
   
  }
  
  @Override
  public boolean performFinish() {
    String result="Travels Name: "+one.getTravelsName();
    result+="\nSource: "+two.getSource()+"\nDestination: "+two.getDestination()+"\nvia1: "+two.getVia1()+"\nvia2: "+two.getVia2()+"\nvia3: "+two.getVia3();
    result+="\nAgent Name: "+three.getAgentName()+"\nDate: "+three.getDate();
    System.out.println(result);
    
    MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), 
    		"Travel info", result);
    return true;
  }
} 