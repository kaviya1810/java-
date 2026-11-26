package day12;

public class superkeyword2 extends superkeyword{
	superkeyword2(){
		super();//will call parten  class from  superkeyword
	}
		String color="Black";
		void displaycolor() {
			System.out.println(super.color);
		}
	void eat() {
		super.eat();//will call parten  class  eat from superkeyword class 
		System.out.println("this is eating bread...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
superkeyword2 k= new superkeyword2();
k.eat();
System.out.println(k.color);
	}

}
//frist  superkeword2  method  will  execute 
//super()--> will  go  to  before class superkeyword class   will  print  this isdefault 1 cons
//next  k.eat()-->in that  super.eat  is will check to  before class superkeyword  and  will print  eating...... which is  under  eat method 
//and   will  print  this is eating bread...
//then  color black 
