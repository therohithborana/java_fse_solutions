public class Example {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger();

        System.out.println(logger1.hashCode());

        Logger logger2 = Logger.getLogger();
        System.out.println(logger2.hashCode());
    }
    
}
//