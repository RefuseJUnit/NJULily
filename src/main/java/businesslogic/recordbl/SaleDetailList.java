package businesslogic.recordbl;

import java.util.ArrayList;

import dataenum.Storage;
import vo.SaleDetailVO;
import businesslogic.recordbl.info.SaleInfo_Record;
import businesslogic.salebl.SaleInfo;

public class SaleDetailList {

	/** 客户名 */
	public String clientName;
	/** 业务员 */
	public String salesman;
	/** 仓库 */
	public Storage storage;
	/** 商品名 */
	public String commodityName;
	
	public String saleID;
	
	public SaleInfo_Record info;
	
	SaleDetailListItem item;
		
	public SaleDetailList(String commodityName, String clientName, String salesman, Storage storage) {
		this.clientName = clientName;
		this.salesman = salesman;
		this.storage = storage;
		this.commodityName = commodityName;
	}
	
	public ArrayList<SaleDetailVO> getSaleDetail(ArrayList<String> IDs) {
		info = new SaleInfo();
		ArrayList<SaleDetailVO> VOs = new ArrayList<SaleDetailVO>();
		for (int i = 0; i < IDs.size(); i++) {
			String ID = info.getID(IDs.get(i), clientName, salesman, storage);
			if (ID != null) {
				item = new SaleDetailListItem(ID, commodityName);
				if (item.ID != null) {
					String date = item.ID.substring(4, 12);
					SaleDetailVO vo = new SaleDetailVO(date, item.name, item.type, item.number, item.price);
					VOs.add(vo);
				}
			}
		}
		return VOs;
	}
	
}
