package ex2;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;
import java.util.List;

public class main {
    //2. Scrie un program care citește un șir de numere întregi și două numere n și m.
    // Programul trebuie să verifice că n și m nu apar niciodată unul lângă celălalt (în orice ordine) în șir.

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        //prcurg lista
        //verific daca numarul curent din lista este n
           //daca este , atunci la numarul respectiv verific in stanga sau in dreapta daca este m
              //daca da, returnez false
        //verific daca numarul curent din lista este m
            //daca este , atunci la numarul respectiv verific in stanga sau in dreapta daca este n
              //daca da, returnez false
        //returnes true dupa parcurgere in cazul in care nu am gasit nimic

        //cazuri speciale : cand primul numar sau ultimul numar sunt egale cu n sau m
        if(areNotNumbersInList(numbers,8,5)){
            System.out.println("Numerele nu sunt unul dupa celalalt in lista");
        }else{
            System.out.println("Numerele  sunt unul dupa celalalt in lista");
        }

    }
    public static boolean areNotNumbersInList(int[] numbers, int n, int m) {
        if (numbers[0] == n && numbers[numbers.length-1] == m)  {
                return false;
        }
        if (numbers[0] == m && numbers[numbers.length-1] == n)  {
            return false;
        }

        if (numbers[numbers.length-1] == n && numbers[numbers.length-2] == m)  {
            return false;
        }
        if (numbers[numbers.length-1] == m && numbers[numbers.length-2] == n)  {
            return false;
        }

        for (int i = 1; i < numbers.length; i++) {
            if ((numbers[i] == n) && (numbers[i - 2] == m || numbers[i + 1] == m)){
                    return false;
            }
            if ((numbers[i] == m) && (numbers[i - 2] == n || numbers[i + 1] == n)){
                    return false;
            }

        }
        return true;
    }
}
