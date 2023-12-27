public class Job {
    private int jobId;
    private String jobAddress;
    private JobPosition jobPosition;

    public Job(int jobId, String jobAddress, JobPosition jobPosition) {
        this.jobId = jobId;
        this.jobAddress = jobAddress;
        this.jobPosition = jobPosition;
    }

    public int getJobId() {
        return jobId;
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public JobPosition getJobPosition() {
        return jobPosition;
    }
}
