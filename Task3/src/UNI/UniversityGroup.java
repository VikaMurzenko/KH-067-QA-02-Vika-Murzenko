package UNI;

public class UniversityGroup {
    private String groupName;
    private int startYear;
    private int endYear;
    private String[] studentArray;


    public UniversityGroup(String groupName, int startYear) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.endYear = startYear + 5;
    }

    public UniversityGroup(String groupName, int startYear, String[] studentArray) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.studentArray = studentArray;
        this.endYear = startYear + 5;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public void setGroupName(String name) {
        this.groupName = name;
    }

    public String[] getStudentArray() {
        return studentArray;
    }

    public void setStudentArray(String[] studentArray) {
        this.studentArray = studentArray;
    }

    public void addStudents(String[] students) {
        if (students != null) {
            this.studentArray = students;

        }
    }

    public void getGroupDescription() {
        System.out.println("Group name: " + getGroupName());
        System.out.println("Start of studying: " + getStartYear());
        System.out.println("Graduation: " + getEndYear());
        System.out.println("List of students:");
        String[] students = getStudentArray();
        for (int i = 0; i < students.length; i++) {
             System.out.println(students[i]);
        }
    }
}


