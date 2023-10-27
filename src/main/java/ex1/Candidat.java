package ex1;

public class Candidat {

    private String name;

    private int numberOfVotes;

    public Candidat(String name, int numberOfVotes) {
        this.name = name;
        this.numberOfVotes = numberOfVotes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    public void setNumberOfVotes(int numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }

    @Override
    public String toString() {
        return "Candidat{" +
                "name='" + name + '\'' +
                ", numberOfVotes=" + numberOfVotes +
                '}';
    }
}
