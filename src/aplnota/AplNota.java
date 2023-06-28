/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplnota;

/**
 *
 * @author lumbr
 */
public class AplNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Declarar as variáveis - Objetos
        Aluno aluno;
        
        //Dar valores Iniciais
        aluno = new Aluno();
        //Processamento - Entrada de dados
        aluno.A1 = 8.0f;
        aluno.A2 = 1.5f;
        aluno.A3 = 3.0f;
        aluno.A4 = 7.0f;
        
        //Saída
        System.out.println( aluno.exibeResultado() );
        
    }
    
}
