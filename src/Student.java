public class Student {

    private String name;
    private String sureName;
    private int studentTicketId;
    private int course;
    private int averageScoreMath;
    private int averageScoreEconomy;
    private int averageScoreForegnLanguage;

    public Student(String name, String sureName, int studentTicketId, int course, int averageScoreMath, int averageScoreEconomy, int averageScoreForegnLanguage) {
        this.name = name;
        this.sureName = sureName;
        this.studentTicketId = studentTicketId;
        this.course = course;
        this.averageScoreMath = averageScoreMath;
        this.averageScoreEconomy = averageScoreEconomy;
        this.averageScoreForegnLanguage = averageScoreForegnLanguage;
    }

    public double calculateAverageScore() {
        return (averageScoreMath + averageScoreEconomy + averageScoreForegnLanguage) / 3;
    }

    public void displayInfo() {
        System.out.println("Student: " + name + " " + sureName);
        System.out.println("Average score: " + String.format("%.2f", calculateAverageScore()));
    }
}
