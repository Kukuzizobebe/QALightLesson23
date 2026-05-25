package ua.QALightCourse.AQALesson7.enums;

public enum ApplicationStore {
    GOOGLE_PLAY("Google Play"),
    APP_STORE("App Store");

    private final String storeName;

    ApplicationStore(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }
}