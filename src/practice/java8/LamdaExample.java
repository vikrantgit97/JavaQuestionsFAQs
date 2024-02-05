package practice.java8;

public class LamdaExample {

    public static void main(String[] args) {
        FunctionalExample f = x -> x + x;
        System.out.println(f.getDouble(5));
    }
}

@FunctionalInterface
interface FunctionalExample {
    int getDouble(int x);
}