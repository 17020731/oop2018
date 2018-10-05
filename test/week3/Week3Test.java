package week3;

import org.junit.Test;

import java.util.Arrays;
import static org.junit.Assert.*;
public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax1(){
        assertEquals(5, Week3.max(4,5));
    }
    @Test
    public void testMax2(){
        assertEquals(-100, Week3.max(-922, -100));
    }
    @Test
    public void testMax3(){
        assertEquals(0, Week3.max(-2,0));
    }
    @Test
    public void testMax4(){
        assertEquals(1, Week3.max(-66, 1));
    }
    @Test
    public void testMax5(){
        assertEquals(98, Week3.max(50, 98));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMin1(){
        int arr [] = {9, 10 , 100, 7, 5};
        assertEquals(5, Week3.minOfArray(arr));
    }
    @Test
    public void testMin2(){
        int arr1 []={9, 10 , 100, 7, 5, 1, 2};
        assertEquals(1, Week3.minOfArray(arr1));
    }
    @Test
    public void testMin3(){
        int arr2 [] = {-100, -98, -87, -10000, 0, -6};
        assertEquals(-10000, Week3.minOfArray(arr2));
    }
    @Test
    public void testMin4(){
        int arr3 [] ={0, 1, 2, 3, 6, 8, 9, -56, 82, 9};
        assertEquals(-56, Week3.minOfArray(arr3));

    }
    @Test
    public void testMin5(){
        int arr4 [] = {9, 10 , 100, 7, 5, -52, 69, 3, 58, -20};
        assertEquals(-52, Week3.minOfArray(arr4));

    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testBMI1() {
        assertEquals("Thiếu cân", Week3.calculateBMI(49.5, 1.68));
    }

    @Test
    public void testBMI2(){
        assertEquals("Bình thường", Week3.calculateBMI(60, 1.7));

    }
    @Test
    public void testBMI3(){
        assertEquals("Thiếu cân", Week3.calculateBMI(50, 1.72));

    }
    @Test
    public void testBMI4(){
        assertEquals("Béo phì", Week3.calculateBMI(80, 1.7));

    }
    @Test
    public void testBMI5(){
            assertEquals("Thiếu cân", Week3.calculateBMI(52, 1.82));
    }

}
