import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PrimeFactorTest {
    private static PrimeFactor primeFactor;

    @Before
    public void setUp() {
        primeFactor = new PrimeFactor();
    }

    @Test
    public void allShouldBePrimeFactor() {
        List<Integer> listOfPrimeFactorOf124 = Arrays.asList(2, 2, 31);
        assertThat(listOfPrimeFactorOf124, is(primeFactor.calculateListOfPrimeFactors(124)));
    }
}
