package org.java.annotaion;

@Details(value="org.java.annotaion.Person",className="Person",fields={"id","name"})
public class Person {

	@Details(value = "id", className="Person", fields={"id"})
	private int id;
	
	@Details(value = "name", className="Person", fields={"name"})
	private String name;
	
	@Details(value = "getId", className="Person", fields={"getId"})
	public int getId() {
		return id;
	}
	
	@Details(value = "setId", className="Person", fields={"setId"})
	public void setId(int id) {
		this.id = id;
	}
	
	@Details(value = "getName", className="Person", fields={"getName"})
	public String getName(){
		return name;
	}
	
	@Details(value = "setName", className="Person", fields={"setName"})
	public void setName(String name){
		this.name = name;
	}
}
