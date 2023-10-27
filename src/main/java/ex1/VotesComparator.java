package ex1;

import java.util.Comparator;

public class VotesComparator implements Comparator<Candidat> {
    @Override
    public int compare(Candidat o1, Candidat o2) {
        return Integer.compare(o1.getNumberOfVotes(), o2.getNumberOfVotes());
    }
}
