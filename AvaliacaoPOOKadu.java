import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AvaliacaoPOOKadu {
    public static void main(String[] args) {
    Scanner leituratxt = new Scanner(System.in);
    System.out.println("Kadu Floresta");
    
    /*
    O programa deverá receber uma lista de valores de um arquivo de texto,
    onde esta lista não terá uma determinação de quantidade fixa,
    podendo variar de arquivo para arquivo. Após, deverá ser alocado os
    valores dentro da estrutura de Array (não poderão ser aplicadas Collections
    para solução), e realizada a ordenção dos valores, imprimindo em tela os passos
    ocorridos desta ordenação. Após, deverá ser utilizado uma Collection para o
    recebimento dos mesmos valores, de maneira que estes valores já estejam ordenados.
    Ao final, deverá ser impresso em tela o valor ordenado do Array e da Collection,
    garantindo que estejam iguais, e deverá ser exportado em um arquivo de texto 
    esses valores.
    */ 

    System.out.printf("\nConteúdo do Arquivo Texto:\n");
        try {
            FileReader arq = new FileReader("avaliacao.txt");
            BufferedReader lerArq = new BufferedReader(arq);
    
            /*
            lê 1º linha a variável "linha" recebe o valor "null" quando o
            processo de repetição atingir o final do arquivo texto
            */
            String str; 
                while ((str = lerArq.readLine()) !=null) {
                System.out.printf(str + "\n");
            
            }
        lerArq.close();
        }
            catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
            e.getMessage());
        }
    leituratxt.close();
    System.out.println();
    }
}