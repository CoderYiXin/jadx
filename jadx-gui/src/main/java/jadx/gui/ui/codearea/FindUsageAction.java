package jadx.gui.ui.codearea;

import jadx.gui.treemodel.JNode;
import jadx.gui.ui.action.ActionModel;
import jadx.gui.ui.dialog.UsageDialog;

public final class FindUsageAction extends JNodeAction {
	private static final long serialVersionUID = 4692546569977976384L;

	public FindUsageAction(CodeArea codeArea) {
		super(ActionModel.FIND_USAGE, codeArea);
	}

	@Override
	public void runAction(JNode node) {
		UsageDialog.open(getCodeArea().getMainWindow(), node);
	}
}
