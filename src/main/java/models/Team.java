package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teams")
public class Team {

    private int id;
    private String name;
    private League league;
    private List<Player> players;
    private Manager manager;

    public Team(){}

    public Team(String name, League league) {
        this.name = name;
        this.league = league;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "team", fetch = FetchType.LAZY)
    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @OneToOne(mappedBy = "team", fetch = FetchType.LAZY)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @ManyToOne
    @JoinColumn(name = "league_id", nullable = false)
    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }
}
