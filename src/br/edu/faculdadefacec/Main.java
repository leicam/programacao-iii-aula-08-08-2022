package br.edu.faculdadefacec;

import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
	    try {
            int[] array = new int[] { 1, 3, 5, 7, 9, 11};
            System.out.println("O indice do valor 3 é "
                    + binarySearch(array, 3));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static int binarySearch(int[] array, int valor) {
        int inicioArray = 0;
        int finalArray = array.length - 1;

        while ( inicioArray <= finalArray)
        {
            int chute = (inicioArray + finalArray) / 2;
            int randomico = array[chute];

            if (randomico == valor)
                return chute;

            if (randomico > valor)
                finalArray = chute -1;
            else
                inicioArray = chute + 1;
        }

        throw new NoSuchElementException("Indice não foi encontrado.");
    }
}
