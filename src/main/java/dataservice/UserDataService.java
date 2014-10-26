package dataservice;

import message.ResultMessage;
import po.UserPO;

/**
 * 提供用户集体载入、保存、增删改查服务
 * @author cylong
 * @version Oct 26, 2014 3:51:54 PM
 */
public interface UserDataService {
	/**
	 * 向序列化文件中添加一个用户
	 * @param po
	 * @return 处理结果
	 */
	public ResultMessage insert(UserPO po);
	/**
	 * 根据用户名查找用户
	 * @param username
	 * @return
	 */
	public ResultMessage find(String username);
	/**
	 * 根据用户名删除
	 * @param po
	 * @return
	 */
	public ResultMessage delete (String username);
	/**
	 * 更新用户
	 * @param po
	 * @return
	 */
	public ResultMessage update (UserPO po);
	public void init();
}