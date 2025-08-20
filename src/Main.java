public class Main {

    private final static TestClass testClass = new TestClass();
    private final static TakeTestClass takeTestClass = new TakeTestClass();
    int min(int x,int y){
        return x < y ? x : y;
    }
    static int[] array = {1,5,3,8,9};

    public static void main(String[] args) {
       
       System.out.println("Hello");
       
       testClass.testTeller();
       
       System.out.println("call take test class");
       
       takeTestClass.takeTestClass().haha();
        TestClass testClass1 = new TestClass();
        String name = "John";

        if (name instanceof String) {
            System.out.println("Yes, it's a String!");
        }
        if (testClass1 instanceof TestClass){
            System.out.println("Object testClass1 is instance of TestClass");
        }

    }
}