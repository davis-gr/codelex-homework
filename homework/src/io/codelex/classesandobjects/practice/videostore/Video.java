package io.codelex.classesandobjects.practice.videostore;

public class Video {

    private String title;
    private boolean isCheckedOut;
    private double avgRating;
    private int ratingCount;
    private int highRating;
    private int ratingSum;
    private double likedBy;

    public Video(String title) {
        this.title = title;
        this.isCheckedOut = false;
        this.avgRating = 0;
        this.ratingCount = 0;
        this.ratingSum = 0;
        this.highRating = 0;
        this.likedBy = 0;
    }

    public void setRating(int rating) {
        this.ratingSum += rating;
        this.ratingCount++;
        if (rating > 6) {
            this.highRating++;
        }
        this.avgRating = (double) this.ratingSum / this.ratingCount;
        this.likedBy = ((double) this.highRating / this.ratingCount) * 100;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut() {
        isCheckedOut = true;
    }

    public void setReturned() {
        isCheckedOut = false;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public double getLikedBy() {
        return likedBy;
    }

}
