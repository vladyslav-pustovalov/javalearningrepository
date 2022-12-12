package thirdhomework;

public class Solutions {

    public static void main(String[] args) {
        Course math, language, literature, biology, sport;
        math = new Course(1, "Olena");
        language = new Course(2, "Natalya");
        literature = new Course(3, "Ylia");
        biology = new Course(4, "Iryna");
        sport = new Course(5, "Stitlana");

        Student ivan, igor;
        ivan = new Student("Ivan", "Ivanov", 111);
        igor = new Student("Igor","Igorov", 222);
    }
}
