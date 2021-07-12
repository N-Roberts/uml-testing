package prototype.core;
import java.util.*;

public abstract class BasicRoom {

	//Instance Variables for BasicRoom
	public String description;
	public String name;
	public ArrayList<BasicItem> items;
	public ArrayList<BasicBeing> beings;
	public ArrayList<BasicRoom> doors;

	//Constructor for BasicRoom
	public BasicRoom(String description, String name, ArrayList<BasicItem> items, 
					ArrayList<BasicBeing> beings, ArrayList<BasicRoom> doors) {
		this.description = description;
		this.name = name;
		this.items = items;
		this.beings = beings;
		this.doors = doors;
	}

	public void printDescription(){
		System.out.println(description);
	}
	
	public String getDescription() {
		return this.description;
	}

	public String getName() {
		return this.name;
	}
	public void printName(){
		System.out.println(name);
	}
	
	public ArrayList<BasicRoom> getDoors(){
		return this.doors;
	}
	
	public ArrayList<BasicBeing> getBeings(){
		return this.beings;
	}

	public ArrayList<BasicItem> getItems(){
		return this.items;
	}

	public void addBeing(BasicBeing being) {
		this.getBeings().add(being);
	}
	
	public void removeBeing(BasicBeing being) {
		this.getBeings().remove(being);
	}

}
