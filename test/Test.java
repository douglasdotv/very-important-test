package test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
    
    public static void main(String[] args) {
        System.out.println(IntStream.range(0, 25).mapToObj(i -> "" + (char)(Math.random() * ('~' - ' ') + ' ')).collect(Collectors.joining()));
    }
    
}
