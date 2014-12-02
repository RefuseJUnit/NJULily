package businesslogic.clientbl;

import java.util.ArrayList;
import java.util.HashMap;

import vo.ClientVO;
import businesslogic.accountbillbl.ClientInfo_AccountBill;
import businesslogic.purchasebl.ClientInfo_Purchase;
import businesslogic.salebl.ClientInfo_Sale;

/**
 * 共外部获得Client信息
 * @author cylong
 * @version 2014年12月1日 下午2:49:21
 */
public class ClientInfo implements ClientInfo_AccountBill, ClientInfo_Sale, ClientInfo_Purchase {

	private Client client;
	
	public ClientInfo() {
		client = new Client();
	}
	/**
	 * @see businesslogic.accountbillbl.ClientInfo_AccountBill#getAllClients()
	 */
	@Override
	public HashMap<String, String> getAllClients() {
		ArrayList<ClientVO> clientsVO = client.show();
		HashMap<String, String> clients = new HashMap<String, String>();
		for(int i = 0; i < clientsVO.size(); i++) {
			ClientVO vo = clientsVO.get(i);
			clients.put(vo.ID, vo.name);
		}
		return clients;
	}

	/**
	 * @see businesslogic.salebl.ClientInfo_Purchase#getSalesman(java.lang.String)
	 */
	public String getSalesman(String ID) {
		ClientVO vo = client.findClient(ID);
		return vo.salesman;
	}

	/**
	 * @see businesslogic.salebl.ClientInfo_Purchase#getName(java.lang.String)
	 */
	public String getName(String ID) {
		ClientVO vo = client.findClient(ID);
		return vo.name;
	}
}