package practice.cloudtech;

import java.util.StringJoiner;

public class InfoCode {

    public static void main(String[] args) {
        StringJoiner obJoiner = new StringJoiner(",", "[", "]");
        obJoiner.add("A").add("B").add("C");
        System.out.println(obJoiner);
        StringJoiner obj = new StringJoiner(":");
        obj.add("P").add("Q");
        System.out.println(obj);
        obJoiner.merge(obj); //merging using predifine method
        System.out.println(obJoiner);
    }
}
