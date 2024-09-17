import java.util.Arrays;
import java.util.List;

public class ConstructionApp {
    public static void main(String[] args) {
        // Create employees with different roles
        Employee emp1 = new Employee(1, "Oyz Bastard", "oyz.bastard@example.com", Role.ENGINEER, false);
        Employee emp2 = new Employee(2, "Reeves Bastard", "reeves.bastard@example.com", Role.ENGINEER, false);
        Employee emp3 = new Employee(4, "Pablo Bastard", "pablo.bastard@example.com", Role.MANAGER, false);
        Employee teamLead = new Employee(3, "Maddu Bastard", "maddu.bastard@example.com", Role.ADMIN, false);

        // Create a team and add members
        Team team = new Team(1, teamLead);
        team.addMember(emp1);
        team.addMember(emp2);
        team.addMember(emp3);  // Added new Manager employee to the team

        // Create a project and add teams and resources
        Project project = new Project(1, "Skyscraper", "NYC");
        project.addTeam(team);
        project.addAvailableResource(new Resource(1, "Cement", 100));
        project.addNeededResource(new Resource(2, "Steel", 50));

        // Manager interacting with the project
        Manager manager = new Manager("manager", "password");
        manager.viewProjectResources(project);
        manager.viewTeams(project);

        // Manager changes the team lead
        manager.changeTeamLead(team, emp2);

        // Manager sends an announcement to all employees
        List<Employee> employees = Arrays.asList(emp1, emp2, teamLead, emp3);  // Include the new Manager employee
        manager.sendAnnouncement("Company meeting at 10 AM tomorrow.", employees);
    }
}


