package com.adedayoominiyi.trianglechallenge;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Adedayo Ominiyi
 */
public class Triangle {

    private final int MAXIMUM_SIDES = 3;
    private final int[] sidesArray;
    private TriangleTypeEnum triangleType;

    public Triangle(int[] _sidesArray) {
        if (_sidesArray == null) {
            throw new IllegalArgumentException("The sides array cannot "
                    + "be null.");
        }

        if (_sidesArray.length != MAXIMUM_SIDES) {
            throw new IllegalArgumentException(
                    String.format("The length of the sides array must be "
                            + "equal to %s.", MAXIMUM_SIDES));
        }

        for (int side : _sidesArray) {
            if (side <= 0) {
                throw new IllegalArgumentException("None of the length of the "
                        + "sides in the sides array should be less than 1.");
            }
        }

        this.sidesArray = _sidesArray;
    }

    public int[] getSides() {
        int[] sidesCopyArray = new int[sidesArray.length];

        // Maintain immutability of the Triangle class by returning a copy of 
        // the sides array.
        System.arraycopy(sidesArray, 0, sidesCopyArray, 0, this.sidesArray.length);
        return sidesCopyArray;
    }

    public TriangleTypeEnum getTriangleType() {
        // As this class is immutable and for performance we can cache 
        // the computation of triangle type;
        if (triangleType == null) {
            triangleType = computeTriangleType();
        }
        
        return triangleType;
    }

    private TriangleTypeEnum computeTriangleType() {
        // Use a set to determine the number of unique sides in this 
        // triangle.
        Set<Integer> sidesLengthSet = new HashSet<>(MAXIMUM_SIDES);

        for (int side : this.sidesArray) {
            sidesLengthSet.add(side);
        }

        int sidesLengthSetSize = sidesLengthSet.size();
        switch (sidesLengthSetSize) {
            case 1:
                return TriangleTypeEnum.EQUILATERAL;
            case 2:
                return TriangleTypeEnum.ISOSCELES;
            case 3:
                return TriangleTypeEnum.SCALENE;
            default:
                return null;
        }
    }
}
