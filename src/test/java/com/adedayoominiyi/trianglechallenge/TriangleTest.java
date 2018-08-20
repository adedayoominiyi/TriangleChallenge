package com.adedayoominiyi.trianglechallenge;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adedayo Ominiyi
 */
public class TriangleTest {

    public TriangleTest() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void instantiationThrowsExceptionWhenSidesIsNull() {
        Triangle triangle = new Triangle(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void instantiationThrowsExceptionWhenSidesArrayLengthIsGreaterThanThree() {
        Triangle triangle = new Triangle(new int[]{1, 2, 3, 4});
    }

    @Test(expected = IllegalArgumentException.class)
    public void instantiationThrowsExceptionWhenSidesArrayLengthIsLessThanThree() {
        Triangle triangle = new Triangle(new int[]{1, 2});
    }

    @Test(expected = IllegalArgumentException.class)
    public void instantiationThrowsExceptionWhenAnySideIsLessThanOne() {
        Triangle triangle = new Triangle(new int[]{0, 1, 2});
    }

    @Test
    public void triangleIsScaleneWhenNoSidesAreEqual() {
        Triangle triangle = new Triangle(new int[]{1, 2, 3});
        assertEquals(TriangleTypeEnum.SCALENE, triangle.getTriangleType());
    }

    @Test
    public void triangleIsIsoscelesWhenTwoSidesAreEqual() {
        Triangle triangle = new Triangle(new int[]{1, 2, 2});
        assertEquals(TriangleTypeEnum.ISOSCELES, triangle.getTriangleType());
    }

    @Test
    public void triangleIsEquilateralWhenAllSidesAreEqual() {
        Triangle triangle = new Triangle(new int[]{1, 1, 1});
        assertEquals(TriangleTypeEnum.EQUILATERAL, triangle.getTriangleType());
    }
}
