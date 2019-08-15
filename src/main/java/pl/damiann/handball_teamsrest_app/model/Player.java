package pl.damiann.handball_teamsrest_app.model;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "players")
public class Player {

    @Id
    private int number;
    private String firstName;
    private String lastName;
    private int age;
    private String position;
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    public Player() {
    }

    public Player(String firstName, String lastName, int age, int number, String position, Team team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.number = number;
        this.position = position;
        this.team = team;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return getAge() == player.getAge() &&
                getNumber() == player.getNumber() &&
                Objects.equals(getFirstName(), player.getFirstName()) &&
                Objects.equals(getLastName(), player.getLastName()) &&
                Objects.equals(getPosition(), player.getPosition()) &&
                Objects.equals(getTeam(), player.getTeam());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getAge(), getNumber(), getPosition(), getTeam());
    }
}
