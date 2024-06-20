package RefDefCwk;

import java.io.Serializable;

class Job implements Serializable {

    private final int jobNum;
    private final String jobType;
    private final int expRequired;
    private final int jobHours;
    private final int jobPenalty;

    public Job(int jobNum, String jobType, int expRequired, int jobHours, int jobPenalty){

        this.jobNum = jobNum;
        this.jobType = jobType;
        this.expRequired = expRequired;
        this.jobHours = jobHours;
        this.jobPenalty = jobPenalty;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
//        sb.append("Job details: \n");
        sb.append("Job Number: ").append(jobNum).append("\n");
        sb.append("Job Type: ").append(jobType).append("\n");
        sb.append("Experience Required: ").append(expRequired).append("\n");
        sb.append("Job Hours: ").append(jobHours).append("\n");
        sb.append("Job Penalty: ").append(jobPenalty).append("\n");
        return sb.toString();
    }

    public int getJobNum() {
        return jobNum;
    }

    public String getJobType() {
        return jobType;
    }
    public int getExpRequired() {
        return expRequired;
    }

    public int getJobHours() {
        return jobHours;
    }

    public int getJobPenalty() {
        return jobPenalty;
    }

}
