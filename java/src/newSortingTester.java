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
        //expected output was not given, rather I was given a array index out of bounds
        //testing the values to see if it runs properly
    }
    @Test
    public void testNewSorting2(){
        //create an array
        int[] given = {1,2,3};
        int[] exp = {1,2,3};
        newSorting test = new newSorting();
        test.newSorting(given,3);
        assertArrayEquals(exp, given);
        //expected output was not given, rather I was given a array index out of bounds
        //wanted to see if it would just not call the part method but it still call it
    }
    @Test
    public void testNewSorting3(){
        //create an array
        int[] given = {-3,-1,-2};
        int[] exp = {-3,-2,-1};
        newSorting test = new newSorting();
        test.newSorting(given,2);
        assertArrayEquals(exp, given);
        //expected output was not given, rather I was given stack overflow error
        //wanted to see if the negative values would be shown
    }
    @Test
    public void testNewSorting4(){
        //create an array
        int[] given = {};
        int[] exp = {};
        newSorting test = new newSorting();
        test.newSorting(given,2);
        assertArrayEquals(exp, given);
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
        //expected output was not given, rather I was given stackoverflow
        //The way to correct is to give it an if statement to change size to at least 1
    }
}
