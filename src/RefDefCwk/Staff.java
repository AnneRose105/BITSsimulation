package RefDefCwk;


import java.io.Serializable;

class Staff implements Serializable {


    private String name;
    private int experience;
    private double retainer;
    private String cisco;
    private String programs;
    private double hourlyRate;
    private String role;
    private StaffState staffState;

    public Staff(String name,
                 int experience,
                 double retainer,
                 String cisco,
                 String programs,
                 double hourlyRate,
                 String role,
                 StaffState staffState) {

        this.name = name;
        this.experience = experience;
        this.retainer = retainer;
        this.cisco = cisco;
        this.programs = programs;
        this.hourlyRate = hourlyRate;
        this.role = role;
        this.staffState = staffState;
    }

    public Staff() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name : ").append(name).append("\n");
        sb.append("experience : ").append(experience).append("\n");
        sb.append("retainer : ").append(retainer).append("\n");
        sb.append("cisco : ").append(cisco).append("\n");
        sb.append("programs : ").append(programs).append("\n");
        sb.append("hourlyRate : ").append(hourlyRate).append("\n");
        sb.append("role : ").append(role).append("\n");
        sb.append("status : ").append(staffState);
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public StaffState getStaffState() {
        return staffState;
    }

    public void setStaffState(StaffState staffState) {
        this.staffState = staffState;
    }

    public double getRetainer() {
        return retainer;
    }

    public int getExperience() {
        return experience;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public boolean canProgram() {
        return programs.equals("true") ? true : false;
    }


}