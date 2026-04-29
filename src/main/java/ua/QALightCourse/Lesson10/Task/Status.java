package ua.QALightCourse.Lesson10.Task;

public enum Status {
    NEW("NEW"), CANCELED("CANCELED"), COMPLETED("COMPLETED"), NULL("NULL");

    private final String statusName;

    Status(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }
}
