package com.timbuchalka;
public class Bucket {

    public static void main(String[] args) {
        System.out.println("===============");
        System.out.println("getBucketCount(-3.4, 2.1, 1.5, 2)");
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println("===============");
        System.out.println("getBucketCount(2.75, 3.25, 2.5, 1)");
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println("===============");
        System.out.println("getBucketCount(3.4, 2.1, 1.5, 2)");
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println("===============");
        System.out.println("getBucketCount(-3.4, 2.1, 1.5)");
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println("===============");
        System.out.println("getBucketCount(7.25, 4.3, 2.35)");
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println("===============");
        System.out.println("getBucketCount(3.4, 2.1, 1.5)");
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println("===============");
        System.out.println("getBucketCount(3.4, 1.5)");
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println("===============");
        System.out.println("getBucketCount(6.26, 2.2)");
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println("===============");
        System.out.println("getBucketCount(3.26, 0.75)");
        System.out.println(getBucketCount(3.26, 0.75));
    }

    /**
     * The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work.
     * Validate the parameters
     * If all parameters are valid, the method needs to calculate the number of buckets and return it.
     * @param width
     * @param height
     * @param areaPerBucket
     * @param extraBuckets
     * @return
     */
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if(width <= 0 || height <=0 || areaPerBucket <=0 || extraBuckets<0) return -1;

        // if all parameters are valid, the method needs to calculate the number of buckets and return it.

        // calculate the area (a = w * h)
        int totalBuckets;
        double area = width * height;
        System.out.println("area = " + area);
        // Apply unitary method from maths.
        // since areaPerBucket=1.5, it means that one bucket covers the area of 1.5. So we need to calculate the number of buckets
        // we need to cover the area=7.14
        // 1.5 area = 1 bucket
        // 7.14 area = ?? buckets
        // therefore, by cross-multiplication, (7.14*1)/1.5 = number of buckets to paint area of 7.14
        totalBuckets = (int)Math.ceil(area/areaPerBucket);
        System.out.println("totalBuckets = " + totalBuckets);
        // Now we have the total number of buckets required to paint. But Bob already has some extra buckets at home.
        // the purpose of the method is to calculate and return the number of buckets Bob needs to buy to paint.
        // hence, we subtract the extraBuckets from totalBuckets
        int bucketsToBuy = totalBuckets - extraBuckets;
        System.out.println("bucketsToBuy = " + bucketsToBuy);
        return bucketsToBuy;
    }

    /**
     * This method is an overloaded method for getBucketCount and returns the total number of buckets required to paint
     * the logic remains same for this method as for the one above, except this has no extraBuckets, so totalBuckets is returned
     * @param width
     * @param height
     * @param areaPerBucket
     * @return
     */
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <=0) return -1;

        double area = width * height;
        System.out.println("area = " + area);

        int totalBuckets = (int) Math.ceil(area/areaPerBucket);
        System.out.println("totalBuckets = " + totalBuckets);

        return totalBuckets;
    }

    /**
     * This method is another overloaded method for getBucketCount that returns the total number of buckets Bob needs to buy before going to work
     * @param area
     * @param areaPerBucket
     * @return
     */
    public static int getBucketCount(double area, double areaPerBucket) {
        if(area <=0 || areaPerBucket<=0) return -1;

        int totalBuckets = (int) Math.ceil(area/areaPerBucket);
        System.out.println("totalBuckets = " + totalBuckets);

        return totalBuckets;
    }
}