import java.util.Arrays;

public class Student {
    String name;
    int age;
    double[] scores;

    Student(String name, int age, double[] scores) {
        this.name = name;
        this.age = age;
        this.scores = scores;
    }

    void setName(String name) {
       this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setScores(double[] scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }

    double calculateScoreAvg() {
        double total = 0;
        for (double s: scores) {
            total += s;
        }
        return total  / this.scores.length;
    }
}
