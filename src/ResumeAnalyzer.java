import java.util.*;

public class ResumeAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your resume text:");
        String resume = scanner.nextLine().toLowerCase();

        System.out.println("Enter job description:");
        String jobDescription = scanner.nextLine().toLowerCase();

        int matchScore = analyzeResume(resume, jobDescription);
        System.out.println("Resume Match Score: " + matchScore + "%");
    }

    public static int analyzeResume(String resume, String jobDescription) {
        String[] jobKeywords = jobDescription.split(" ");
        int matchCount = 0;

        for (String keyword : jobKeywords) {
            if (resume.contains(keyword)) {
                matchCount++;
            }
        }

        return (int) (((double) matchCount / jobKeywords.length) * 100);
    }
}
