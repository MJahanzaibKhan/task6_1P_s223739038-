package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "223739038";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Muhammad Jahanzaib Khan";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
	public void testFalseNumberIsEven() {
	    Assert.assertFalse("Number is even", WeatherAndMathUtils.isEven(3));
	}
	
    @Test
    public void testCancelWeatherAdvice() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    
    @Test
    public void testAllClearWeatherAdviceForNormalConditions() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30.0, 3.0));
    }

    @Test
    public void testWarnWeatherAdviceForHighWindSpeed() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 2.5));
    }

    @Test
    public void testWarnWeatherAdviceForHighPrecipitation() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(30.0, 5.0));
    }

    @Test
    public void testIsEvenForEvenNumbers() {
        Assert.assertTrue(WeatherAndMathUtils.isEven(4));
    }

    @Test
    public void testIsEvenForOddNumbers() {
        Assert.assertFalse(WeatherAndMathUtils.isEven(3));
    }

    @Test
    public void testIsPrimeForPrimeNumbers() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(17));
    }

    @Test
    public void testIsPrimeForNonPrimeNumbers() {
        Assert.assertFalse(WeatherAndMathUtils.isPrime(15));
    }
    
    @Test
    public void testSumOfNumbers() {
        Assert.assertEquals(15, LoopExample.sumOfNumbers(5));
    }

    @Test
    public void testFactorial() {
        Assert.assertEquals(120, LoopExample.factorial(5));
    }
}
