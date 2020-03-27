import java.util.Arrays;

public class Utils {

    public String concatenateWords(String ... strings){
        final String[] concatString = {""};
        Arrays.stream(strings).filter(x -> x != null).forEach(x -> concatString[0] += x);;
        return concatString[0];
    }

    public long computeFactorial(int number){
        if(number < 0){
            return 0;
        }
        long result = 1L;
        for(int i=number; i>0; i--){
            result*=i;
        }
        return result;
    }
}