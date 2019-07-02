class DrivedEx extends Exception{
    public String toString(){
        return "Unable to create object";
    }
}
class A{
    public int a;
    public int b;
    public int c;
    public A(int a,int b,int c)throws DrivedEx{
        this.a = a;
        this.b = b;
        if(c>4){
            this.c = c;
        }else{
            throw new DrivedEx();
        }
    }
}
public class PreventingToCreateObject
{
	public static void main(String[] args) {
		A a=null;
		try{
            a = new A(10,20,3);
		}catch(DrivedEx e){
		    System.out.println(e.toString());
		}
		System.out.println("a ="+a.a+",b = "+a.b+",c = "+a.c);
	}
}
