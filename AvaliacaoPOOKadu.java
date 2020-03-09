import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class AvaliacaoPOOKadu {
    public static void main(String[] args) {
        System.out.println("Kadu Floresta - Avaliação POO Java");
        System.out.printf("\nConteúdo do Arquivo Texto:\n");
        
        try {
            // Lendo os dados do TXT
            FileReader arq = new FileReader("avaliacaoimport.txt");
            BufferedReader lerArq = new BufferedReader(arq);
                       
            // String recebendo valores do TXT.
            String[] arrayA = lerArq.readLine().split(",");
            System.out.println(Arrays.toString(arrayA));
            int[] solucaoA = new int[arrayA.length]; 
          
            // String em Int
            for (int i = 0; i < arrayA.length; i++) {
                solucaoA[i] = Integer.parseInt(arrayA[i]);
            }
            // Encerrando o Buffer de leitura do TXT
            lerArq.close();

            // Insertion Sort
            System.out.println("\nProcesso de Ordenação: ");
            for (int i = 0; i < solucaoA.length; i++) {
                int atual = solucaoA[i];
                int j = i - 1;
                while (j >= 0 && solucaoA[j] >= atual) {
                    solucaoA[j + 1] = solucaoA[j];
                    j--;
                }
                solucaoA[j + 1] = atual;

            // Impressão do Processo de Ordenação.
            System.out.println(Arrays.toString(solucaoA));
            }
            // Collection 
            ArrayList<Integer> listA = new ArrayList<>();
            // Lista da Collection
            for (int i = 0; i < solucaoA.length; i++) {
                listA.add(solucaoA[i]);
            }
            // Exportando os dados em TXT
            FileWriter arq2 = new FileWriter("avaliacaoexport.txt");
            BufferedWriter expArq = new BufferedWriter(arq2);

            // Impressão do Array Ordenado
            System.out.println("\nARRAY: ");
            for (int i = 0; i < solucaoA.length; i++) {
                System.out.println(solucaoA[i]);
                //
                expArq.append(" " + solucaoA[i]);
            }
            // Impressão da Collection Ordenada
            System.out.println("\nCOLLECTION: ");
            for (int numA:listA){
                System.out.println(numA);
            }             
            //Espaço
            System.out.println("\n");

            // Encerrando o Buffer de exportação do TXT
            expArq.close();

            // Exceção caso não leia o TXT
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
    }
}