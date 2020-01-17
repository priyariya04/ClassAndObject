package Registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import daoImpl.Product;
import modell.ConnectionManager;
import modell.Item;
import modell.ProductDAO;
import modell.User;

public class Main extends ConnectionManager{


	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String firstname; //variables
		String lastname;
		String username;
		String password;
		String confirmpassword;
		String email;
		String mobile;
		String username1;
		String password1;
	/*******************************************************************************************************/
		
		Scanner m = new Scanner(System.in);
		int ch;
		do {
	    System.out.println("Welcome to Login \n");	
		System.out.println("1.Admin Login \n2.Agent Login \n3.Logout");
	    ch = m.nextInt();
		
			switch(ch)  //main sc1
			{ 
			
				case 1 :
					
					User user = new User();
					System.out.println("Enter Username :");
					username =m.next();
					System.out.println("Enter Password");
					password =m.next();
					System.out.println("Enter Confirm Password");
					confirmpassword = m.next();
					int choice;
					if(password.equals(confirmpassword))
					{       
						
					do {
							System.out.println("Welcome Admin");
							System.out.println("1. Add Product \n2.Display Details \n3.Logout");
							choice = m.nextInt();
							switch(choice)  //sc2
							{
				
							case 1 : 
								System.out.println("Enter Product ID : ");
								int pdId = m.nextInt();
								System.out.println("Enter Product Name : ");
								String pdName = m.next();
								System.out.println("Enter Min Sell Quantity : ");
								int minSellQuantity = m.nextInt();
								System.out.println("Enter Price : ");
								int price = m.nextInt();
								Item item = new Item();
								//user.display();
					
								item.setPdId(pdId);
								item.setPdName(pdName);
								item.setMinSellQuantity(minSellQuantity);
								item.setPrice(price);
								int total = minSellQuantity * price;
								item.setTotal(total);
					
								//ConnectionManager.getConnection();
					
								Product product = new ProductDAO();//register is interface it implements registerDao
								if(product.save(item)) {
									System.out.println("Data inserted successfully");
								}
								else
									System.out.println("Check your query");
					
								//Product product = new ProductDAO();
								
					
						break; // end of sc2 case1
						case 2 : System.out.println("Display All Details ");
									Product product1 = new ProductDAO();
									List<Item> list = product1.displayAllItems();
									for(Item items:list) {
										System.out.println(items.getPdId());
										System.out.println(items.getPdName());
										System.out.println(items.getMinSellQuantity());
										System.out.println(items.getPrice());
										System.out.println(items.getTotal());     } //end of for loop
						break;
						case 3 : 
							//System.exit(1);
							break;
						
							}   //end of switch
					}while(choice!=3);
					}  //end of if
							break;
			// end of sc1 case 1
			/*****************************************************************************************************/
		case 2 : 
			System.out.println("Enter Username");
				username =m.next();
				System.out.println("Enter Password");
				password =m.next();
				System.out.println("Enter Confirm Password");
				confirmpassword = m.next();
				int history;
				if(password.equals(confirmpassword)) 
				{
					do {
						System.out.println("Welcome Agent");
						System.out.println("Enter Choice : 1.Buy/Sell \n2.Display All Details \n3.Exit");
						history = m.nextInt();
						
						switch(history)
						{
						case 1:
						
							System.out.println("Enter Product ID : ");
							int pdId = m.nextInt();
					
							System.out.println("Enter value in String Buy/Sell: \n1.Buy 2.Sell");
							String bs = m.next();
							switch(bs)
							{
							case "buy" :  
								Item item = new Item();
								item.setTransaction(bs);
								String sql = "update items set transaction ='buy' where pd_id = "+pdId;
								PreparedStatement ps1 = ConnectionManager.getConnection().prepareStatement(sql);
								boolean rs1 = ps1.execute();
							break;
							case "sell" :
								Item item1 = new Item();
								item1.setTransaction(bs);
								String sql1 = "update items set transaction ='sell' where pd_id = "+pdId;
								PreparedStatement ps2 = ConnectionManager.getConnection().prepareStatement(sql1);
								boolean rs2 = ps2.execute();
							break;
							}
					
							System.out.println("Enter the quantity :");
							int quan = m.nextInt();
					
							String sql2 = "Select * from items where pd_id ="+pdId;
							PreparedStatement ps = ConnectionManager.getConnection().prepareStatement(sql2);
							ResultSet rs = ps.executeQuery();
							int flag=0;
							int pid = 0;
							int total = 0;
							String pname = null;
							while(rs.next())
							{
								pid = rs.getInt("pd_id");
								pname = rs.getString("pd_name");
								int min = rs.getInt("minSellQuantity");
								int p = rs.getInt("price");
						
								if(quan <= min) {
									flag = 1;
									total = quan*p;
								}
								else
								{
									flag=0;
								}
							}
							if(flag==1) {
								System.out.println("Product Id :"+pid+ "\nProduct Name : "+pname);
								System.out.println("Total :"+total);
							}
							else
							{
								System.out.println("Product Not Available");
							}
					break;
						case 2:
								Product product = new ProductDAO();
								List<Item> list = product .displayAllItems();
								for(Item items:list) {
									System.out.println(items.getPdId());
									System.out.println(items.getPdName());
									System.out.println(items.getMinSellQuantity());
									System.out.println(items.getPrice());
									System.out.println(items.getTotal());
									System.out.println(items.getTransaction());      } //end of for loop
						break;
						case 3:
							//System.exit(1);
							break;
						}
					}while(history!=3);
				}  //end of if
		break; // end main sc1 case 2
						
		case 3 : //System.exit(1); // end main sc1 case 3
			break;
			}
		}while(ch!=3);
		/*****************************************************************************/
	}
}