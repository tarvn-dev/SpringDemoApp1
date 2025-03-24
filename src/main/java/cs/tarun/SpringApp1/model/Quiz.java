package cs.tarun.SpringApp1.model;

public class Quiz {
    private String name;
    private String category;
    private String difficulty;

    public Quiz(){

    }

    public Quiz(String name, String category, String difficulty) {
        this.name = name;
        this.category = category;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}


