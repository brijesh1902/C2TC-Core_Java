public class Example4 implements Int, Def {
    public static void main(String[] args) {
        Int.show();
        Def i = new Example4();
        i.say();
        i.sayMore("Say something moreee.....");
    }

    @Override
    public void sayMore(String s) {
        // TODO Auto-generated method stub
        System.out.println(s);
    }
}

interface Int{
    int a = 10;
    static void show(){
        System.out.println("Static method");   
    }
}

interface Def{
    default void say(){
        System.out.println("Default method");
    }

    void sayMore(String string);
}