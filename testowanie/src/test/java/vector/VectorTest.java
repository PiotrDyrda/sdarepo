package vector;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class VectorTest {

    @Test
    public void whenCorrectIndexPassedReturnsComponent() {
        Vector v = new Vector(4, -3, 4);
        assertEquals(4, v.get(0));
        assertEquals(-3, v.get(1));
        assertEquals(4, v.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenIndexOutOfBound() {
        Vector v = new Vector(3, -4, 7);
        v.get(-2);
        v.get(3);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenIndexNegative() {
        Vector v = new Vector(3, -4, 7);
        v.get(-2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenIndexGreaterThan2() {
        Vector v = new Vector(-12, -45, 21);
        v.get(3);
    }

    @Test
    public void zeroVectotHasZeroLength() {
        Vector v = new Vector(0, 0, 0);
        assertEquals(0.0, v.length(), 0.0001);
    }

    @Test
    public void nonZeroVectorHasCorrectLength() {
        Vector v = new Vector(2, -3, 7);
        assertEquals(Math.sqrt(62), v.length(), 1e-10);
    }

    @Test
    public void vectorIsCorrectlyAdded() {
        Vector v1 = new Vector(3, 4, 9);
        Vector v2 = new Vector(1, -2, 5);
        Vector v3 = v1.addVector(v2);
        assertEquals(4, v3.get(0));
        assertEquals(2, v3.get(1));
        assertEquals(14, v3.get(2));
    }

    @Test
    public void addedVectorIsZero() {
        Vector v1 = new Vector(-3, 7, 6);
        Vector v2 = new Vector(0, 0, 0);
        Vector v3 = v1.addVector(v2);
        assertEquals(v1.get(0), v3.get(0));
        assertEquals(v1.get(1), v3.get(1));
        assertEquals(v1.get(2), v3.get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addedVectorIsNullThrowException() {
        Vector v1 = new Vector(3, 1, -2);
        Vector v2 = null;
        Vector v3 = v1.addVector(v2);
    }

    @Test
    public void addingVectorsAreUnchanged() {
        Vector v1 = new Vector(3, -2, 6);
        Vector v2 = new Vector(4, 7, -6);
        assertEquals(3, v1.get(0));
        assertEquals(-2, v1.get(1));
        assertEquals(6, v1.get(2));
        assertEquals(4, v2.get(0));
        assertEquals(7, v2.get(1));
        assertEquals(-6, v2.get(2));
    }

    @Test
    public void whenComparedToNullReturnFalse() {
        Vector v1 = new Vector(5, -5, 1);
        assertFalse(v1.equals(null));
    }

    @Test
    public void whenSecondObjectIsNotVector() {
        Vector v1 = new Vector(5, -5, 1);
        assertFalse(v1.getClass().equals("afas"));
        assertFalse(v1.getClass().equals(45));
    }

    @Test
    public void whenVectorsAreTheSame(){
        Vector v1 = new Vector(3,5,2);
        Vector v2 = new Vector(3,5,2);
        Vector v3 = new Vector(5,2,1);
        Vector v4 = new Vector(5,2,1);
        assertTrue(v1.equals(v2));
        assertTrue(v3.equals(v4));
    }

    @Test
    public void whenComparedToDifferentVectorReturnFalse(){
        Vector v1 = new Vector(3,5,2);
        Vector v2 = new Vector(5,2,1);
        assertFalse(v1.equals(v2));
    }

    @Test
    public void toArrayCreatesCopy(){
        Vector v = new Vector(1,3,6);
        int[] arr = v.toArray();
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        assertEquals(1,v.get(0));
        assertEquals(3,v.get(1));
        assertEquals(6,v.get(2));
    }

    @Test
    public void toArrayHasCorrectElements(){
        Vector v = new Vector(2,4,7);
        int[] arr = v.toArray();
        assertEquals(2,arr[0]);
        assertEquals(4,arr[1]);
        assertEquals(7,arr[2]);
    }
}