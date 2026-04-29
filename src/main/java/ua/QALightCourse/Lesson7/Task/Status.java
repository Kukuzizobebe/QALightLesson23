package ua.QALightCourse.Lesson7.Task;

public enum Status {
    NEW("NEW"), CANCELED("CANCELED"), COMPLETED("COMPLETED");

    private String statusName;

    Status(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }
}
