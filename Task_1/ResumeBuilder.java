package mypack;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ResumeBuilder {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Get the applicant's name.
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Get the applicant's contact information.
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();

        // Get the applicant's education.
        System.out.print("Enter your educational institutions: ");
        String education = scanner.nextLine();

        // Get the applicant's work experience.
        System.out.print("Enter your work experience: ");
        String experience = scanner.nextLine();

        // Get the applicant's educational institutions.
        System.out.print("Enter your 10th school: ");
        String school10th = scanner.nextLine();
        System.out.print("Enter your 12th school: ");
        String school12th = scanner.nextLine();

        // Get the applicant's field of expertise.
        System.out.print("Enter your field of expertise: ");
        String field = scanner.nextLine();

        // Get the applicant's personal details.
        System.out.print("Enter your personal details: ");
        String personalDetails = scanner.nextLine();

        // Get the applicant's achievements.
        System.out.print("Enter your achievements: ");
        String achievements = scanner.nextLine();

        // Get the applicant's awards.
        System.out.print("Enter your awards: ");
        String awards = scanner.nextLine();

        // Get the applicant's professional profile.
        System.out.print("Enter your professional profile: ");
        String profile = scanner.nextLine();

        // Get the applicant's about section.
        System.out.print("Enter about yourself: ");
        String about = scanner.nextLine();
        System.out.print("Enter about Skills add using commas: ");
        String skills = scanner.nextLine();
        System.out.print("Enter about summary: ");
        String summary = scanner.nextLine();






        // Generate the resume.
        String resume = generateResume(name, email, phone, education, experience,
                                     summary, skills, school10th, school12th,
                                     field, personalDetails, achievements, awards,
                                     profile, about);

        // Write the resume to a PDF file.
        String pdfFileName = generateRandomFileName();
        PdfGenerator.writeResume(resume, pdfFileName);

        // Download the PDF file.
        System.out.println("Your PDF file is ready to download.");
        System.out.println("The file name is: " + pdfFileName);
        scanner.close();
    }


    private static String generateResume(String name, String email, String phone, String education, String experience,
                                     String summary, String skills, String school10th, String school12th,
                                     String field, String personalDetails, String achievements, String awards,
                                     String profile, String about) {
    String resume = "";

    // Add the applicant's name to the resume.
    resume += "**Name:** " + name + "\n";

    // Add the applicant's email address to the resume.
    resume += "**Email:** " + email + "\n";

    // Add the applicant's phone number to the resume.
    resume += "**Phone:** " + phone + "\n";

    // Add the applicant's education to the resume.
    resume += "**Education:** " + education + "\n";

    // Add the applicant's work experience to the resume.
    resume += "**Experience:** " + experience + "\n";

    // Add the applicant's professional summary to the resume.
    resume += "**Summary:** " + summary + "\n";

    // Add the applicant's skills to the resume.
    resume += "**Skills:** " + skills + "\n";

    // Add the applicant's 10th school to the resume.
    resume += "**10th School:** " + school10th + "\n";

    // Add the applicant's 12th school to the resume.
    resume += "**12th School:** " + school12th + "\n";

    // Add the applicant's field of expertise to the resume.
    resume += "**Field of Expertise:** " + field + "\n";

    // Add the applicant's personal details to the resume.
    resume += "**Personal Details:** " + personalDetails + "\n";

    // Add the applicant's achievements to the resume.
    resume += "**Achievements:** " + achievements + "\n";

    // Add the applicant's awards to the resume.
    resume += "**Awards:** " + awards + "\n";

    // Add the applicant's professional profile to the resume.
    resume += "**Professional Profile:** " + profile + "\n";

    // Add the applicant's about section to the resume.
    resume += "**About:** " + about + "\n";

    return resume;
}



    private static String generateRandomFileName() {
        return "resume-" + Math.random() + ".pdf";
    }

    static class PdfGenerator {

        public static void writeResume(String resumeText, String pdfFileName) throws Exception {
            // Create a new PDF file.
            File pdfFile = new File(pdfFileName);
            FileOutputStream fileOutputStream = new FileOutputStream(pdfFile);

            // Write the resume text to the PDF file.
            PrintWriter printWriter = new PrintWriter(fileOutputStream);
            printWriter.print(resumeText);
            printWriter.close();

            // Close the PDF file.
            fileOutputStream.close();
        }
    }
}
