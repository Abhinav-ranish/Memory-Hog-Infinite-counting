import java.util.stream.IntStream;

public class Crash {
    public static void main(String[] args) {
        IntStream.iterate(0, i -> i + 1)
                 .forEach(System.out::println);
    }
}
