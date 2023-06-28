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
public class Aluno {

    //Criar Atributos e variaveis
    float A1, A2, A3, A4;

    //Dar valores iniciais    
    {
        A1 = A2 = A3 = A4 = 0.0f;
    }
    //Processamento

    float[] notasObtidas() {
        if ((A1 < A2) && (A1 < A3) && (A1 < A4)) {
            return new float[]{A2, A3, A4};
        }
        if ((A2 < A1) && (A2 < A3) && (A2 < A4)) {
            return new float[]{A1, A3, A4};
        }
        if ((A3 < A1) && (A3 < A2) && (A3 < A4)) {
            return new float[]{A1, A2, A4};
        } else {
            return new float[]{A1, A2, A3};
        }
    }

    float media() {
        float[] notas = notasObtidas();
        float soma = notas[0] + notas[1] + notas[2];

        return soma / 3;
    }

    String situacao() {
        return (media() > 7.0f)
                ? "APROVADO" : "REPROVADO";
    }
    //Mostrar saida

    String exibeResultado() {
        float[] notas = notasObtidas();
        float media = media();
        String situacao = situacao();
        String texto = "Notas obtidas: " + notas[0] + " – " + notas[1] + "–" + notas[2]
                + "\nMédia do Aluno: " + media
                + "\nSituação:" + situacao;

        return texto;
    }
}
