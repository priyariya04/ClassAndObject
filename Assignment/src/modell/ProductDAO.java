package modell;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import daoImpl.Product;

public class ProductDAO extends ConnectionManager implements Product {
Item item = new Item();
	
	public boolean save(Item item) {
		String sql = "insert into items(pd_id,pd_name,minsellquantity,price,total,transaction) values(?,?,?,?,?,?)";
		try
		{
			PreparedStatement ps = ConnectionManager.getConnection().prepareStatement(sql);
			ps.setInt(1, item.getPdId());
			ps.setString(2, item.getPdName());
			ps.setInt(3, item.getMinSellQuantity());
			ps.setInt(4, item.getPrice());
			ps.setInt(5, item.getTotal());
			ps.setString(6, item.getTransaction());
			
			boolean resultset = ps.execute();
			if(resultset)
				return true;
				else
					return false;
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 /*catch(ClassNotFoundException e) {
			e.printStackTrace();
		}*/
		return false;
	}

	@Override   
	public List<Item> displayAllItems() {
		// TODO Auto-generated method stub
		//User user = new User();
		String sql = "Select * from items";
		List<Item> list = new LinkedList<Item>();
		try {
			PreparedStatement ps = ConnectionManager.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Item item = new Item();
				item.setPdId(rs.getInt("pd_id"));
				item.setPdName(rs.getString("pd_name"));
				item.setMinSellQuantity(rs.getInt("minsellquantity"));
				item.setPrice(rs.getInt("price"));
				item.setTotal(rs.getInt("total"));
				item.setTransaction(rs.getString("transaction"));
				list.add(item);
				
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	

	

}
