import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    private List<Integer> listOfPrimeFactors;

    public List<Integer> calculateListOfPrimeFactors (int n) {
        listOfPrimeFactors = new ArrayList<>();

        while (n % 2 == 0) {
            listOfPrimeFactors.add(2);
            n = n / 2;
        }
        for (int i = 3; i < n * n ; i += 2) {
            while (n % i == 0)
            {
                listOfPrimeFactors.add(i);
                n= n / i ;
            }
        }
        return listOfPrimeFactors;
    }
}
