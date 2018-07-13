package models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "league")
public class League {

    private int id;
    private String name;
    private List<Team> teams;

    public League(String name, List<Team> teams) {
        this.name = name;
        this.teams = teams;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}
