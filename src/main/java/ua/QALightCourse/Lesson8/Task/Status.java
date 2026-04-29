package ua.QALightCourse.Lesson8.Task;

public enum Status {
    NEW("NEW"), CANCELED("CANCELED"), COMPLETED("COMPLETED");

    private final String statusName;

    Status(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }
}
