
import java.util.ArrayList;

public class GradeBook {

    private ArrayList<Integer> scores;
    private ArrayList<Integer> grades;

    public GradeBook() {
        this.scores = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    // Add grade to scores
    public void add(int score) {
        if (score < 0) {
            return;
        }

        this.scores.add(score);
        this.scoreToGrade(score);
    }

    public void scoreToGrade(int score) {
        if (score < 50) {
            this.grades.add(0);
            return;
        } else if (score < 60) {
            this.grades.add(1);
            return;
        } else if (score < 70) {
            this.grades.add(2);
            return;
        } else if (score < 80) {
            this.grades.add(3);
            return;
        } else if (score < 90) {
            this.grades.add(4);
            return;
        } else if (score < 100) {
            this.grades.add(5);
            return;
        }
    }

    public double averageScore() {

        // Exit if list empty
        if (scores.isEmpty()) {
            return 0;
        }

        int sum = 0;
        int count = 0;
        for (int score : this.scores) {
            sum += score;
            count++;
        }

        return (double) sum / count;
    }

    public double averageOfPassingScores() {

        int sum = 0;
        int count = 0;
        for (int score : this.scores) {
            if (score >= 50) {
                sum += score;
                count++;
            }
        }
        // if no passing scores return -1
        if (count == 0) {
            System.out.print("-");
            return -1;
        }
        
        return (double) sum / count;
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int g : this.grades) {
            if (g == grade) {
                count++;
            }
        }

        return count;
    }
    
    public double passPercentage() {
        return 100 - (double) this.numberOfGrades(0) / this.grades.size() * 100;
    }
    
    public String printDist(int scores) {
        String string = "";
        for (int i = 0; i < scores; i++) {
            string = string + "*";
        }
        
        return string;
    }
}
