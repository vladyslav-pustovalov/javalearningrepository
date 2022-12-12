package thirdhomework;

public class CollegeStudent extends Student {

    private String collegeName;
    private int rating;
    private long id;

    public CollegeStudent (String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent (String lastName, Course[] courseTaken) {
        super(lastName, courseTaken);
    }

    public CollegeStudent (String collegeName, int rating, long id) {
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    protected CollegeStudent () {
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
