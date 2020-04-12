import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class newSortingTester {
    //5 methods
    //assume size at least 1
    @Test
    public void testNewSorting(){
        //create an array
        int[] given = {3,2,1};
        int[] exp = {1,2,3};
        newSorting test = new newSorting();
        test.newSorting(given,2);
        assertArrayEquals(exp, given);
        //expected output was 2,2,3 and is supposed to bet 1,2,3
        //testing the values to see if it runs properly with positive numbers
    }
    @Test
    public void testNewSorting2(){
        //create an array
        int[] given = {1,2,3};
        int[] exp = {1,2,3};
        newSorting test = new newSorting();
        test.newSorting(given,4);
        assertArrayEquals(exp, given);
        //expected output was the 1,2,3 and ran properly
        // Testing to see if the given array would still run with a greater starting size
    }
    @Test
    public void testNewSorting3(){
        //create an array
        int[] given = {-3,-1,-2};
        int[] exp = {-3,-2,-1};
        newSorting test = new newSorting();
        test.newSorting(given,2);
        assertArrayEquals(exp, given);
        //expected output was -3,-2,-1
        //wanted to see if the negative values would be shown
        //test is important to see if any numbers would work
    }
    @Test
    public void testNewSorting4(){
        //create an array
        int[] given = {};
        int[] exp = {};
        newSorting test = new newSorting();
        test.newSorting(given,2);
        assertArrayEquals(exp, given);
        //Testing to see if the code would run because it was given an empty array
        //Passes through, possibly should make it at least an array with just one 0
    }
    @Test
    public void testNewSorting5(){
        //create an array
        int[] given = {3,2,1};
        int[] exp = {1,2,3};
        newSorting test = new newSorting();
        test.newSorting(given,0);
        assertArrayEquals(exp, given);
        //The test was to see if a size of less than one would run properly
        //expected output was not given, rather I was given stackoverflow
        //The way to correct is to give it an if statement to change size to at least 1
    }
}
