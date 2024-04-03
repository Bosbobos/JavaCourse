package io.datajek.UnitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {

    @Test
    void testfindIndex_numberInArray() {
        ArrayMethods arrayMethods = new ArrayMethods();

        int result = arrayMethods.findIndex(new int[] {8, 4, 5}, 4);

        assertEquals(1, result, "findIndex finds element's index in array");
    }

    @Test
    public void testfindIndex_numberNotInArray() {
        ArrayMethods arrayMethods = new ArrayMethods();
        assertEquals(-1, arrayMethods.findIndex(new int[]{8,4,5}, 1));
    }

    @Test
    public void testfindIndex_emptyArray() {
        ArrayMethods arrayMethods = new ArrayMethods();
        assertEquals(-1, arrayMethods.findIndex(new int[]{}, 1));
    }

    @Test
    public void testMergeSort_normalArray() {
        ArrayMethods arrayMethods = new ArrayMethods();
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        arrayMethods.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchForNumber_numExists() {
        ArrayMethods arrayMethods = new ArrayMethods();
        int[] array = { 5, 1, 6, 2, 3, 4 };
        boolean result = arrayMethods.searchForNumber(array, 2);
        assertTrue(result);
    }

    @Test
    void testAssert() {
        // fail("unimplemented method");
        String str = null;
        assertEquals(null, str);
        assertNull(str);
    }

    @Test
    public void testfindIndex_indexOutOfBound() {
        ArrayMethods arrayMethods = new ArrayMethods();
        assertThrows(ArrayIndexOutOfBoundsException.class, ()->arrayMethods.getByIndex(
                new int[] {1,8,5}, 3));
    }

    @Test
    public void testfindIndex() {
        ArrayMethods arrayMethods = new ArrayMethods();
        assertAll(
                () -> assertEquals(1, arrayMethods.findIndex(new int[]{8,4,5}, 4)),
                () -> assertEquals(-1, arrayMethods.findIndex(new int[]{8,4,5}, 1)),
                () -> assertEquals(-1, arrayMethods.findIndex(new int[]{}, 1))
        );
    }
}
