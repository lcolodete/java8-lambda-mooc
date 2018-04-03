package test.lesson1;

import java.util.function.Consumer;

public class LambdaScopeTest2 {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        Consumer<Integer> methodInFirstLevel(int x) {
            
            // The following statement causes the compiler to generate
            // the error "local variables referenced from a lambda expression
            // must be final or effectively final" in statement A:
            //
//            x = 99;
//        	System.out.println(x);
//        	System.out.println(this.x);
//        	System.out.println(LambdaScopeTest.this.x);
        	
        	String localString = "Just a local string";
            
            Consumer<Integer> myConsumer = (y) -> 
            {
            	System.out.println("localString=" + localString);
                System.out.println("x = " + x); // Statement A
                System.out.println("y = " + y);
                System.out.println("this.x = " + this.x);
                System.out.println("LambdaScopeTest.this.x = " +
                    LambdaScopeTest2.this.x);
            };

            return myConsumer;

        }
    }

    public static void main(String... args) {
        LambdaScopeTest2 st = new LambdaScopeTest2();
        LambdaScopeTest2.FirstLevel fl = st.new FirstLevel();
        Consumer<Integer> consumer = fl.methodInFirstLevel(23);
        consumer.accept(59);
    }
}