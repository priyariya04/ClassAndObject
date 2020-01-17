package modell;

public class Item {
	private int pdId; //object properties
	private String pdName;
	private int minSellQuantity;
	private int price;
	private int total;
	private String transaction;
	
	public Item() {
		//super();
		this.pdId = pdId;
		this.pdName = pdName;
		this.minSellQuantity = minSellQuantity;
		this.price = price;
		this.total = total;
		this.transaction = transaction;
	}
	
	
	public String getTransaction() {
		return transaction;
	}


	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}


	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPdId() {
		return pdId;
	}
	public void setPdId(int pdId) {
		this.pdId = pdId;
	}
	public String getPdName() {
		return pdName;
	}
	public void setPdName(String pdName) {
		this.pdName = pdName;
	}
	public int getMinSellQuantity() {
		return minSellQuantity;
	}
	public void setMinSellQuantity(int minSellQuantity) {
		this.minSellQuantity = minSellQuantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void display() {
		System.out.println("Product Id : "+this.pdId); //attributes of user
		System.out.println("Product Name : "+this.pdName);
		System.out.println("Min Sell Quantity :"+this.minSellQuantity);
		System.out.println("Price : "+this.price);
		System.out.println("Total : "+this.total);
	}

}
