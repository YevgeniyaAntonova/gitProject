package module2.task1;


import java.util.ArrayList;
import java.util.Scanner;

public class RunnerProject {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter budget of city:");
        int budget = scanner.nextInt();
        System.out.println("enter specType of city:");
        String specType = scanner.next();
        System.out.println("enter count of project:");
        int projSize = scanner.nextInt();
        System.out.println();

        Project project1 = new Project("HeavyMetallInc", 15000, TypeProject.FACTORY, false);
        Project project2 = new Project("RapResearchLab", 10000, TypeProject.SCIENCE, true);
        Project project3 = new Project("OmegaTRC3", 20000, TypeProject.BUSSINESS, false);

        ArrayList<Project> projects = new ArrayList<>();
        projects.add(project1);
        projects.add(project2);
        projects.add(project3);

        int totalCostProjects = 0;
        int costProjectFromGov = 0;
        for (int i = 0; i < projSize; i++) {
            totalCostProjects += projects.get(i).costProject(projects.get(i).cost, specType, projects.get(i).type, projects.get(i).isGovermental);
            if (projects.get(i).isGovermental == true) {
                if (specType.equals(String.valueOf(projects.get(i).type))) {
                    costProjectFromGov = (int) (projects.get(i).cost - 0.2 * projects.get(i).cost);
                } else {
                    costProjectFromGov = projects.get(i).cost;
                }

            }
        }
        int budgetFromGov = 0;
        if (totalCostProjects > budget) {
            budgetFromGov = totalCostProjects - budget + costProjectFromGov;
        } else {
        }
        System.out.printf("budgetFromGov = %d", budgetFromGov);
    }
}



