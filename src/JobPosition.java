public class JobPosition {
    private int jobPositionId;
    private String jobPositionName;

    public JobPosition(int jobPositionId, String jobPositionName) {
        this.jobPositionId = jobPositionId;
        this.jobPositionName = jobPositionName;
    }

    public int getJobPositionId() {
        return jobPositionId;
    }

    public String getJobPositionName() {
        return jobPositionName;
    }
}
