package ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Candidat> candidates = Arrays.asList(new Candidat("Ion", 0), new Candidat("Vasile", 0), new Candidat("Maria", 0));


        Election election1 = new Election(candidates);
        System.out.println(election1.toString());
        try {
            election1.vote("Ion");
            election1.vote("Ion");
            election1.vote("Ion");
            election1.vote("Maria");
            election1.vote("Vasile");
            election1.vote("Vasile");
            election1.vote("Vasile");
        }catch(Exception e){
            System.out.println(e.getMessage()+" Acest nume nu exista");
        }

        System.out.println(election1.toString());
        System.out.println(election1.declareWiner().toString());



    }
}
