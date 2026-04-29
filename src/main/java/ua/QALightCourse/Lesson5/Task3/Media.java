package ua.QALightCourse.Lesson5.Task3;

public class Media {

    private String title;
    private int duration;

    public Media(int duration, String title) {
        this.duration = duration;
        this.title = title;
    }

    public void play(){
        System.out.println("Multimedia playback!");
    }

    public String getTitle() {
        return title;
    }
}
