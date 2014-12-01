package po;

/**
 * 商品持久化对象
 * @author cylong
 * @version Oct 26, 2014 12:59:30 PM
 */
public class CommodityPO extends PersistentObject {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	/** 商品名称 */
	private String name;
	/** 商品型号 */
	private String type;
	/** 商品分类ID */
	private String sortID;
	/** 商品库存数量 */
	private int inventoryNum;
	/** 商品进价 */
	private double purPrice;
	/** 商品售价 */
	private double salePrice;
	/** 商品最近进价 */
	private double recentPurPrice;
	/** 商品最近售价 */
	private double recentSalePrice;
	/** 商品警戒数量 */
	private int alarmNumber;

	/**
	 * @param ID 商品ID
	 * @param name 商品名称
	 * @param type 商品类型
	 * @param purPrice 商品默认进价
	 * @param salePrice 商品默认售价
	 * @author cylong
	 * @version Oct 26, 2014 1:21:03 PM
	 */
	public CommodityPO(String ID, String name, String sortID, String type, double purPrice, double salePrice) {
		super(ID);
		this.name = name;
		this.type = type;
		this.sortID = sortID;
		this.purPrice = purPrice;
		this.salePrice = salePrice;
		this.setAlarmNumber(0);
	}

	/**
	 * 模糊查询的时候使用
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return name + type + inventoryNum + purPrice + salePrice + recentPurPrice + recentSalePrice + alarmNumber + ID;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommodityPO other = (CommodityPO)obj;
		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!this.name.equals(other.name))
			return false;
		if (this.type == null) {
			if (other.type != null)
				return false;
		} else if (!this.type.equals(other.type))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getSortID() {
		return this.sortID;
	}

	public int getInventoryNum() {
		return inventoryNum;
	}

	public double getPurPrice() {
		return purPrice;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public double getRecentPurPrice() {
		return recentPurPrice;
	}

	public double getRecentSalePrice() {
		return recentSalePrice;
	}

	public int getAlarmNumber() {
		return alarmNumber;
	}

	public void setAlarmNumber(int alarmNumber) {
		this.alarmNumber = alarmNumber;
	}

}
