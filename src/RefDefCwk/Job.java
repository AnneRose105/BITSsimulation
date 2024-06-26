package RefDefCwk;

import java.io.Serializable;
import java.util.Map;

class Job implements Serializable {

    private final int jobNum;
    private final JobType jobType;
    private final int expRequired;
    private final int jobHours;
    private final int jobPenalty;

    /**
     * Creates a new Job object with the specified attributes.
     *
     * @param jobNum      the job number, which uniquely identifies the job
     * @param jobType     the type of job (e.g., Design, Hardware, Software)
     * @param expRequired the amount of experience required for the job, in years
     * @param jobHours    the number of hours required to complete the job
     * @param jobPenalty  the penalty incurred if the job is not completed on time
     */
    public Job(int jobNum, JobType jobType, int expRequired, int jobHours, int jobPenalty) {

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

    public JobType getJobType() {
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

    public static JobType getJobTypeFromString(String type){
        if (type.equalsIgnoreCase("Design")){
            return JobType.DESIGN;
        }else if(type.equalsIgnoreCase("Hardware")){
            return JobType.HARDWARE;
        }
        else {
            return JobType.SOFTWARE;
        }
    }

}
