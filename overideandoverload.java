
//overriding
class class1{
	public void run(){
		System.out.println("dog1 is running");
	}	
}
class class2 extends class1{
	public void run(){
		System.out.println("dog2 is running");
	}
	public void sup(){super.run();
	}
	
   public static void main (String[] args) {
    class2 obj=new class2();
    obj.sup();
    obj.run();
    
  }
}


//overloading
class overrd{
	public void animal(String name,int legs){
		System.out.println("name"+name+"no of legs"+legs);
	}
	public void animal(String name,int legs, int height){
		System.out.println("name"+name+"no of legs"+legs+"height"+height);
	}
	public static void main (String[] args) {  
		overrd ovr=new overrd();
		ovr.animal("dog",4);
		ovr.animal("dog",4,2);


 }
}


