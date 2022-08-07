package com.timbuchalka;

public class Main {

    // GOOGLE SEARCH = math.ceil in java what it means
    public static void main(String[] args) {
        // write your code here
//        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
//        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
//        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
//        System.out.println(getBucketCount(-3.4,2.1,1.5));
//        System.out.println(getBucketCount(3.4,2.1,1.5));
//        System.out.println(getBucketCount(7.25,4.3,2.35));
        System.out.println(getBucketCount(3.4, 1.5));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        int totalBuckets;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;
        totalBuckets = (int) Math.ceil(width * height / areaPerBucket);
        int buckets = (int) totalBuckets - (int) extraBuckets;
        return buckets;
}
    public static int getBucketCount(double width, double height,double areaPerBucket) {
        int number=0;
        if (width <= 0 || height <=0 || areaPerBucket <= 0) {
            return -1;
        } else {
            number = (int) Math.ceil(width*height / areaPerBucket);
            return number;
        }
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        int number;
        if (area < 0 || areaPerBucket < 0) {
            return -1;
        } else {
            number = (int) Math.ceil(area / areaPerBucket);
            return number;
        }
    }
}