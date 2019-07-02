class A{
    public int a;
    public int b;
    public int c;
    public A(int a,int b,int c){
        this.a = a;
        this.b = b;
        if(c>4){
            this.c = c;
        }else{
            retrun;
        }
    }
}

public class ReturnInsideConstructor
{
	public static void main(String[] args) {
		A a = new A(10,20,3);
		System.out.println("a ="+a.a+",b = "+a.b+",c = "+a.c);
	}
}
