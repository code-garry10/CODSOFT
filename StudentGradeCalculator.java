import java.util.Scanner;

public class StudentGradeCalculator {

    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int totalMarks = 0; 
            int numberOfSubjects; 
            double averagePercentage; 
            char grade; 
    
            // Take input for the number of subjects
            System.out.print("Enter the number of subjects: ");
            numberOfSubjects = scanner.nextInt();
    
            // Loop to take input for each subject's marks
            for (int i = 1; i <= numberOfSubjects; i++) {
                System.out.print("Enter marks for subject " + i + " (out of 100): ");
                int marks = scanner.nextInt();
                totalMarks += marks; // Add the marks to the total marks
            }
    
            // Calculate average percentage
            averagePercentage = (double) totalMarks / numberOfSubjects;
    
            // Determine grade based on the average percentage
            if (averagePercentage >= 90) {
                grade = 'A';
            } else if (averagePercentage >= 80) {
                grade = 'B';
            } else if (averagePercentage >= 70) {
                grade = 'C';
            } else if (averagePercentage >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
    
            // results
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage + "%");
            System.out.println("Grade: " + grade);
    
            
            scanner.close();
        }
    }
    
    

