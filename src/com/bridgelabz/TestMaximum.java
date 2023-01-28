package com.bridgelabz;

public class TestMaximum {
    //We can create a class that can be used with any type of data. Such a class is known as Generics Class.
//    Integer numOne;
//    Integer numTwo;
//    Integer numThree;
    Integer maxNum;

    void getMaximumNumber(Integer numOne, Integer numTwo, Integer numThree) {
//        this.numOne = numOne;
//        this.numTwo = numTwo;
//        this.numThree = numThree;
        maxNum = numOne;    //assume numOne is initially the largest
        if (numTwo.compareTo(maxNum) > 0) {
            System.out.println(numTwo + " Num Two is greater");
        } else if (numThree.compareTo(maxNum) > 0) {
            System.out.println(numThree + " Num Three is greater");
        } else {
            System.out.println(maxNum + " Num One is greater");
        }
    }

    public static void main(String[] args) {

        TestMaximum testMaximum = new TestMaximum();
        testMaximum.getMaximumNumber(16, 21, 14);
    }
}
