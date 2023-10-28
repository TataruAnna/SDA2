package ex3;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        //3. Scrie un program care citește un șir de numere întregi și afișează numărul de "triplete" din șir.
        //Un "triplet" reprezintă trei numere întregi consecutive în ordine crescătoare,
        // care diferă cu 1 (de exemplu, 3,4,5 este un triplet, dar 5,4,3 și 2,4,6 nu sunt).


        //verific pentru fiecare cifra daca urmatoarele doua sunt cu 1, respectiv cu 2 mai mari ca valori
        //merg de la al trilea element si tratez capatul separat
        //daca gaseste tripletul il retine intr-un new array[] cu lungime 3 si il adauga la o lista de array-uri;


        int[] numbers = {1,2,3,5,8,9,11,12,13,15};
        System.out.println(toString(finAllTriplets(numbers)));

    }
    public static List<int[]> finAllTriplets (int[] numbers){
       List<int[]> allTriplets = new ArrayList<>();
        for (int i = 2; i < numbers.length-1 ; i++) {
            if(numbers[i-1]==numbers[i]-1 && numbers[i-2]==numbers[i-1]-1){
                int[] tempArray ={numbers[i-2], numbers[i-1], numbers[i]};
                allTriplets.add(tempArray);
            }

        }
       return allTriplets;

    }

    public static String toString(List<int[]>numbers){
        for(int[] number: numbers){
            for (int i = 0; i <number.length ; i++) {
               System.out.print(number[i] + " ");

            }
            System.out.println(" ");
        }
        return " ";

    }


}

