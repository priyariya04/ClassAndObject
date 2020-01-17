package daoImpl;

import java.util.List;

import modell.Item;



public interface Product {
	public boolean save(Item item);
	public List<Item> displayAllItems();

}
