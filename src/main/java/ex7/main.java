package ex7;

public class main {
    public static void main(String[] args) {
        //7. Scrie o functie care accepta un array bidimensional (o matrice) si doua numere: n si m.
        //Interschimba coloanele cu indicii n si m din matrice.

        int[][] twoDimArray = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 3}
        };
        System.out.println("normal array:");
        toString(twoDimArray);
        System.out.println();
        System.out.println("mixed columns array:");
        toString(mixedBidimensionalArray(twoDimArray, 1,2));

    }

    public static int[][] mixedBidimensionalArray (int[][]biDimensionalArray, int n, int k){
        //cu primul for, parcurg lungimea array-ului bidimensional, adica numarul de randuri
         //cu al doilea for, parcurg fiecare element din fiecare rand;
          
        for(int i=0;i<biDimensionalArray.length;i++){
            int[] tempLine = biDimensionalArray[i];
            for(int j=0;j<tempLine.length;j++){
                if((k-1)==j){
                    int temp = tempLine[j];
                    tempLine[j] = tempLine[n-1];
                    tempLine[n-1] = temp;
                }
            }
        }
        return biDimensionalArray;
    }
    public static void toString (int[][] biDimArray){
        for (int i = 0; i < biDimArray.length; i++) {
            for(int j = 0; j < biDimArray[i].length; j++){
                System.out.print(biDimArray[i][j]+ " ");
            }
            System.out.println();
        }
    }

}
