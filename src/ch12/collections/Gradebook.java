package ch12.collections;

import java.util.Map;

/* Given two Maps of test scores, update the student's grades
 * only if they did better on the makeup exam.
 * Then print the final grades.
 */

public class Gradebook {
    public static void main(String args[]) {

        TestResults grade = new TestResults();

        Map<String, Integer> originalGrades = grade.getOriginalGrades();
        Map<String, Integer> makeUpGrades = grade.getMakeUpGrades();

        String keyName1 = null;
        Integer firstScore = null;

        String keyName2 = null;
        Integer secondScore = null;

        int finalGrade = 0;

        for (var score1 : originalGrades.entrySet()) {
            keyName1 = score1.getKey();
            firstScore = score1.getValue();

            for (var score2 : makeUpGrades.entrySet()) {
                keyName2 = score2.getKey();
                secondScore = score2.getValue();

                if (keyName1 == keyName2) {
                    if (firstScore >= secondScore) {
                        finalGrade = firstScore;
                    } else {
                        finalGrade = secondScore;
                    }
                    System.out.println(keyName1 + " " + finalGrade);
                }
            }
        }
    }
}
