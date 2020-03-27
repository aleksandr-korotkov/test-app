import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Providers {

    public static Stream<Arguments> testCalcFactorialProvider(){
        return Stream.of(Arguments.arguments(1,1),
                Arguments.arguments(5,120),
                Arguments.arguments(10,3628800),
                Arguments.arguments(-10,0),
                Arguments.arguments(1,1),
                Arguments.arguments(2,2));
    }

    public static Stream<Arguments> testConcatenateWordsProvider(){
        return Stream.of(Arguments.arguments(new String[]{"odin","dva"},"odindva"),
                Arguments.arguments(new String[]{"john","week",null},"johnweek"),
                Arguments.arguments(new String[]{""," "}," "),
                Arguments.arguments(new String[]{"2"},"2"),
                Arguments.arguments(new String[]{"русский","язык"},"русскийязык"));
    }
}