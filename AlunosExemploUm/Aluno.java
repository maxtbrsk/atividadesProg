package AlunosExemploUm;

public class Aluno {
    String nome;
    String sobrenome;
    String email;
    int codigo;
    float notaUm;
    float notaDois;

    float obterMedia() {
        return (notaUm + notaDois) / 2;
    }

    String obterStatus() {
        float media = obterMedia();
        if (media >= 8)
            return "aprovado";
        else if (media >= 6)
            return "recuperação";
        else
            return "reprovado";
    }
}
