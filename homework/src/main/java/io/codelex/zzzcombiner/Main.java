package io.codelex.zzzcombiner;

public class Main {
    public static void main(String[] args) {

        Combiner<Integer, String> combiner = new Combiner<>(10, "Teksts");
        String result = combiner.combine();
        System.out.println(result);

    }
}
