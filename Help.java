import java.util.stream.IntStream;

public class Help {
    public static void main(String[] args) {
        IntStream.iterate(0, i -> i + 1)
                 .forEach(System.out::println);
    }
}
