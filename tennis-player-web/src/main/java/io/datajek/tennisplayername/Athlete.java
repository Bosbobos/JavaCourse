package io.datajek.tennisplayername;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

public class Athlete {
    private String firstName;
    @NotEmpty(message = "This is a required field.")
    private String lastName;
    @NotNull(message = "This is a required field.")
    @Min(value = 1, message = "Rank cannot be less than 1.")
    @Max(value = 100, message = "Rank  cannot be greater than 100.")
    private Integer rank;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Past(message = "The date must be in the past.")
    private Date lastWon;
    @Pattern(regexp ="^\\$([0-9]{1,3},([0-9]{3},)*[0-9]{3})$", message="Incorrect format")
    private String prizeMoney;
    private String country;
    private String handedness;
    private String[] grandSlams;

    public Athlete() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getLastWon() {
        return lastWon;
    }

    public void setLastWon(Date lastWon) {
        this.lastWon = lastWon;
    }

    public String getPrizeMoney() {
        return prizeMoney;
    }

    public void setPrizeMoney(String prizeMoney) {
        this.prizeMoney = prizeMoney;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHandedness() {
        return handedness;
    }

    public void setHandedness(String handedness) {
        this.handedness = handedness;
    }

    public String[] getGrandSlams() {
        return grandSlams;
    }

    public void setGrandSlams(String[] grandSlams) {
        this.grandSlams = grandSlams;
    }
}
