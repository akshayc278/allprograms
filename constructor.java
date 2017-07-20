
//constructor overloading

class constructor{
	String name;
	constructor(){
		System.out.println(" this is default one");
	}
	constructor(String name){
		this.name=name;
		System.out.print(name);
	}
	
	public static void main (String[] args) {
     constructor cst=new constructor();
      constructor cst1=new constructor("hello");
   }
}