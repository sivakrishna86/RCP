package travels;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.handlers.HandlerUtil;



public class TravelWizardHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		WizardDialog wizardDialog = new WizardDialog(HandlerUtil.getActiveShell(event),
			     new TravelWizard());
		
			   if (wizardDialog.open() == Window.OK) {
			     System.out.println("Ok pressed");
			   } else {
			     System.out.println("Cancel pressed");
			      }
		return null;
	}

}
