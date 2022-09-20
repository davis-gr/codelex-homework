package io.codelex.classesandobjects.practice.videostore;

public class VideoStore {

    static Video[] allVideos = new Video[VideoStoreTest.COUNT_OF_MOVIES];
    private static int totalVideos = -1;

    static Video addVideo(String title) {
        totalVideos++;
        allVideos[totalVideos] = new Video(title);
        return allVideos[totalVideos];
    }

    static String checkOutVideo(String title) {
        Video video = findVideo(title);
        if (video == null) {
            return "Video not found!";
        }
        if (video.isCheckedOut()) {
            return "Video not available!";
        }
        video.setCheckedOut();
        return "Video checked out successfully!";
    }

    static String returnVideo(String title) {
        Video video = findVideo(title);
        if (video == null) {
            return "Video not found!";
        }
        if (!video.isCheckedOut()) {
            return "Impossible to return a video that's not checked out!";
        }
        video.setReturned();
        return "Video returned successfully!";
    }

    static String rateVideo(String title, int rating) {
        Video video = findVideo(title);
        if (video == null) {
            return "Video not found!";
        }
        video.setRating(rating);
        return "Video rated successfully! This video is liked by " + video.getLikedBy() + "% of people.";
    }

    static String isAvailable(String title) {
        Video video = findVideo(title);
        if (video == null) {
            return "Video not found!";
        }
        if (video.isCheckedOut()) {
            return "Video not available.";
        }
        return "Video available!";
    }

    static Video findVideo(String title) {
        for (int i = 0; i < allVideos.length; i++) {
            if (allVideos[i].getTitle().equals(title)) {
                return allVideos[i];
            }
        }
        return null;
    }

    static void listVideos() {
        String isAvailable = "";
        for (int i = 0; i < allVideos.length; i++) {
            if (allVideos[i].isCheckedOut()) {
                isAvailable = "No";
            } else {
                isAvailable = "Yes";
            }
            System.out.println("#" + (i+1) + " - " + allVideos[i].getTitle() + " - rating: " + allVideos[i].getAvgRating() +
                    " - liked by: " + allVideos[i].getLikedBy() + "% of people. Is available: " + isAvailable + ".");
        }
    }


}
