public class Student {
    private long controlNomber;
    private String name;
    private String lastname;
    private String career;
    private int semester;

    public long getControlNomber() {
        return controlNomber;
    }

    public void setControlNomber(long controlNomber) {
        this.controlNomber = controlNomber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
