package ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Election {
    private List<Candidat> candidates;

    public Election(List<Candidat> candidates) {
        this.candidates = candidates;
    }

    public List<Candidat> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidat> candidates) {
        this.candidates = candidates;
    }

    public boolean vote (String name) throws Exception {
       boolean nameNotFound = true;
        for(Candidat candidat: candidates){
            if(candidat.getName().equals(name)){
                candidat.setNumberOfVotes(candidat.getNumberOfVotes()+1);
                nameNotFound= false;
            }

        }
        if(nameNotFound){
            throw new Exception();
        }else {
            return true;
        }




    }
    public List<Candidat> declareWiner (){

        //sortez lista de candidati
        //compar ultimul candidat cu ceilalti la numarul de voturi
        //formez lista cu candidatii cu acelasi numar de voturi

        List<Candidat> winners = new ArrayList<>();
        candidates.sort(new VotesComparator());
        int maxNumberOfVotes = candidates.get(candidates.size()-1).getNumberOfVotes();

        for(Candidat candidate: candidates){
            if(candidate.getNumberOfVotes() == maxNumberOfVotes){
                winners.add(candidate);
            }
        }

        return winners;
    }

    @Override
    public String toString() {
        return "Election{" +
                "candidates=" + candidates +
                '}';
    }
}
