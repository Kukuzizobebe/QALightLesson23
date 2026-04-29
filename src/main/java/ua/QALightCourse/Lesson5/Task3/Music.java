package ua.QALightCourse.Lesson5.Task3;

public class Music extends Media {

    private String artist;

    public Music(String title, int duration, String artist) {
        super(duration, title);
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Music '" + getTitle() + "' is playing by '" + artist + "'");
    }
}
