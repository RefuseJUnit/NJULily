package businesslogic.approvalbl.info;

import vo.PurchaseVO;
import message.ResultMessage;

public interface PurchaseInfo_Approval {
	/**
	 * 更改一个在进行审批的单子
	 * @param vo
	 * @return
	 * @author Zing
	 * @version Dec 2, 2014 2:20:52 PM
	 */
	public ResultMessage update(PurchaseVO vo);
}