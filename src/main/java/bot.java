
import java.io.*;
import java.nio.charset.Charset;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class bot {

    public static void main(String[] args) {



        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o nome do arquivo de texto: \n");
        String nome = ler.nextLine();

        System.out.print("\nConteúdo do arquivo de texto: \n");

        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerarq = new BufferedReader(arq);

            String linha = lerarq.readLine();

            while (linha != null) {
                System.out.printf("Tweetando: %s\n", linha);


                System.out.printf("Sleeping for 30 minutes...");
                try {
                    Thread.sleep(180000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            arq.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



