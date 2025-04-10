package java5;

public enum pgm2 {
    int a=10;
    static int b =20;
    static float c;

    public static void main(String[] args){
        variable obj1=new variable();
        obj1.method1();

        System.out.println(b);
        System.out.println(c);
        System.out.println(obj1.a);
    }
    public void mmethod1(){
        int d=50;
        float f=1.1f;

        System.out.println(d);
        System.out.println(f);
        System.out.println(a);
        System.out.println(b);
    }
    
}
