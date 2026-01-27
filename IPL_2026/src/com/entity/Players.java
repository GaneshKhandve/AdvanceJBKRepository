package com.entity;

public class Players {
    private int p_Id;
    private String p_Name;
    private String team_name;
    private String category;
    private  int score;
    private  int catches;
    private int wickets;

    public Players(int p_Id, String p_Name, String team_name, String category, int score, int catches, int wickets) {
        this.p_Id = p_Id;
        this.p_Name = p_Name;
        this.team_name = team_name;
        this.category = category;
        this.score = score;
        this.catches = catches;
        this.wickets = wickets;
    }

    public Players() {
        super();
    }

    public int getP_Id() {
        return p_Id;
    }

    public void setP_Id(int p_Id) {
        this.p_Id = p_Id;
    }

    public String getP_Name() {
        return p_Name;
    }

    public void setP_Name(String p_Name) {
        this.p_Name = p_Name;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCatches() {
        return catches;
    }

    public void setCatches(int catches) {
        this.catches = catches;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    @Override
    public String toString() {
        return "Players{" +
                "p_Id=" + p_Id +
                ", p_Name='" + p_Name + '\'' +
                ", team_name='" + team_name + '\'' +
                ", category='" + category + '\'' +
                ", score=" + score +
                ", catches=" + catches +
                ", wickets=" + wickets +
                '}';
    }
}
