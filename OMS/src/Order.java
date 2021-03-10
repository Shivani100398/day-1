
public class Order {

	public Order(int itemNo,String Itemname)
	{
		this.itemNo=itemNo;
		this.itemName=itemName;
		
		
	}
	private int itemNo;
	private String itemName;
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itenName) {
		this.itemName = itenName;
	}
	
	
	
}
