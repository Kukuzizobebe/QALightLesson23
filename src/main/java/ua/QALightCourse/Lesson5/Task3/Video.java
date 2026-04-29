package ua.QALightCourse.Lesson5.Task3;

public class Video extends Media {

    private String resolution;

    public Video(String title, int duration, String resolution) {
        super(duration, title);
        this.resolution = resolution;
    }

    @Override
    public void play() {
        System.out.println("Video '" + getTitle() + "' is playing with resolution: " + resolution);
    }
}
