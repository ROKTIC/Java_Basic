public class MainMethodExample {
    public static void main(String[] args) {

        boolean stop = true;
        System.out.println("Java Program run");
        foo();
        if (stop) {
           return;
        }

        System.out.println("Java Program end");
    } // main end

    public static void foo(){
        System.out.println("foo method running");
        return;
    }

} // MainMethodExample end

