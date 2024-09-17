import java.util.ArrayList;
import java.util.List;

public class Team {
    private int teamId;
    private Employee teamLead;
    private List<Employee> members;

    public Team(int teamId, Employee teamLead) {
        this.teamId = teamId;
        this.teamLead = teamLead;
        this.members = new ArrayList<>();
    }

    // Add and remove members
    public void addMember(Employee employee) {
        members.add(employee);
    }

    public void removeMember(Employee employee) {
        members.remove(employee);
    }

    // Change team lead
    public void changeTeamLead(Employee newLead) {
        if (members.contains(newLead)) {
            this.teamLead.setTeamLead(false);
            newLead.setTeamLead(true);
            this.teamLead = newLead;
        }
    }

    // Getters
    public Employee getTeamLead() { return teamLead; }
    public List<Employee> getMembers() { return members; }
}

