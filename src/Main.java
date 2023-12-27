import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Job> jobList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            printMenu();
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addJob();
                    break;
                case 2:
                    printAllJobs();
                    break;
                case 3:
                    deleteJob();
                    break;
                case 4:
                    System.out.println("Exiting DigiJobs!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    System.out.println();
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("======== DIGIJOBS ========");
        System.out.println("Please choose following commands:");
        System.out.println("1. Add new job");
        System.out.println("2. Print all jobs");
        System.out.println("3. Delete job");
        System.out.println("4. Exit");
    }

    private static void addJob() {
        System.out.print("Enter job id: ");
        int jobId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter job address: ");
        String jobAddress = scanner.nextLine();

        System.out.print("Enter job position id: ");
        int jobPositionId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter job position name: ");
        String jobPositionName = scanner.nextLine();

        JobPosition jobPosition = new JobPosition(jobPositionId, jobPositionName);
        Job newJob = new Job(jobId, jobAddress, jobPosition);
        jobList.add(newJob);

        System.out.println("Job added.");
        System.out.println();
    }

    private static void printAllJobs() {
        if (jobList.isEmpty()) {
            System.out.println("No jobs available.");
        } else {
            System.out.println("Your current jobs:");
            for (Job job : jobList) {
                System.out.println("Job ID: " + job.getJobId());
                System.out.println("Job Address: " + job.getJobAddress());
                System.out.println("Job Position ID: " + job.getJobPosition().getJobPositionId());
                System.out.println("Job Position Name: " + job.getJobPosition().getJobPositionName());
                System.out.println("--------------");
            }
        }
        System.out.println();
    }

    private static void deleteJob() {
        if (jobList.isEmpty()) {
            System.out.println("No jobs available for deletion.");
        } else {
            System.out.print("Enter the job ID to delete: ");
            int jobIdToDelete = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            boolean jobFound = false;
            for (Job job : jobList) {
                if (job.getJobId() == jobIdToDelete) {
                    jobList.remove(job);
                    jobFound = true;
                    System.out.println("Job ID " + jobIdToDelete + " deleted successfully.");
                    break;
                }
            }

            if (!jobFound) {
                System.out.println("Job ID " + jobIdToDelete + " not found.");
            }
        }
        System.out.println();
    }
}
