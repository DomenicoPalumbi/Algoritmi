package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("Dato un array ordinato di numeri interi e un valore target, scrivere un programma che trovi la posizione del valore all’interno dell’array utilizzando la ricerca binaria.\n" +
              "Se il valore non è presente, restituire -1.\n");
        algoritmo1();
        System.out.println("-------------------------");
        System.out.println("Ho eseguito l'algoritmo 1");
        System.out.println("-------------------------");
//
//        System.out.println("-------------------------");
//        System.out.println("Dato un array di numeri interi e un numero target, scrivere un programma che restituisca gli indici dei due numeri la cui somma è uguale al target.\n" +
//               "Si può assumere che ogni input abbia una sola soluzione e che non si possa usare lo stesso elemento due volte.\n");
//        algoritmo2();
//        System.out.println("-------------------------");
//        System.out.println("Ho eseguito l'algoritmo 2");
//        System.out.println("-------------------------");
//
//
//        System.out.println("-------------------------");
//        System.out.println("Scrivere un programma che controlli se una stringa è un palindromo, ignorando spazi, punteggiatura e differenze tra maiuscole e minuscole.\n" +
//                "Una parola o frase è palindroma se si legge uguale da sinistra a destra e viceversa.");
        algoritmo3();
        System.out.println("-------------------------");
        System.out.println("Ho eseguito l'algoritmo 3");
        System.out.println("-------------------------");
    }

    private static void algoritmo1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci il valore target");
        int target = sc.nextInt();
        int[] array = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        numeroTrovato( array,target);

    }
    private static void numeroTrovato(int[] array,int target  ){
        boolean trovato =false;
        int i = 0;
        int j = array.length - 1;
        while(i<=j) {
            int k= (i+j)/2;
            if(target==array[k] && !trovato){
                System.out.println("La posizione del valore target all'interno dell'array è : " + k);
                trovato=true;
            } else if (array[k]<target) {
                i=k+1;
            }else{
                j=k-1;
            }
        }
        if (trovato==false){

            System.out.println("-1 (Il valore non è presente nell'array)");
        }
    }


    private static void algoritmo2(){
        Scanner scan=new Scanner(System.in);
        int[] array ={1,2,3,4,5,6};
        int a=0;
        int b=0;
        System.out.println("Inserisci la target sum ");
        int ts= scan.nextInt();
        int i=0;
        boolean trovato=false;

        int j=i+1;
        while(i< array.length-1 && !trovato)
        {
            while(j< array.length && !trovato )
            {
                if(array[i]+array[j]==ts)
                {
                    a=i;
                    b=j;
                    trovato=true;
                }
                j++;
            }
            i++;
            j=i+1;
        }
        if (trovato) {
            System.out.println("I valori che sommati restituiscono la target sum si trovano negli indici : " +a+ " e " +b);
        } else {
            System.out.println("Nessuna coppia trovata per la somma target.");
        }

    }

    private static void algoritmo3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la stringa da controllare : ");
        String frase = scanner.nextLine();
        frase = frase.toLowerCase();
        boolean palindromo=true;
        StringBuilder frasepulita = new StringBuilder();
        puliziaFrase(frase , frasepulita);
        String risultato = frasepulita.toString();
        System.out.println(risultato);
        isPalindromo( risultato, palindromo);
    }
    private static void puliziaFrase(String frase, StringBuilder frasepulita){
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                frasepulita.append(c);
            }
        }
    }
    private static void isPalindromo(String risultato, boolean palindromo){
        int i = 0;
        int j = risultato.length()-1;
        while (i<j){
            if(risultato.charAt(i)!= risultato.charAt(j) && palindromo){
                palindromo=false;
            }
            i++;
            j--;
        }
        if(palindromo){
            System.out.println("La stringa è palindroma");
        }else{
            System.out.println("La stringa non è palindroma");
        }
    }
}


