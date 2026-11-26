package day9;

public class thiskeyword {
	// when global var name and parameter name are same
		// to pass the value to global variable
		// we use this as a keyword
		int a;
		int b;
		
		thiskeyword(){
			this("ram");
			System.out.println("this is default constructor");
		}
		
		thiskeyword(String name){
			//this();
			System.out.println("this is parameterized constructor");
		}
		void add(int a, int b) {
			this.a=a;
			this.b=b;
		}
		
		void display() {
			System.out.println(a+b);
		}
		
		void m() {
			this.n();
			System.out.println("this is method m");
		}
		
		void n() {
			System.out.println("this is method n");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskeyword obj=new thiskeyword();
	obj.add(10,20);
	//	obj.display();
	//obj.n();

	}

}
