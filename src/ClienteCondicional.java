//Card 7
public class ClienteCondicional {
    public static void main(String[] args) {
        int dataNascimentoFulano = 1980;
        int idadeFulano = 43;
        String nomeFulano = "Fulano";
        String classificacaoEtariaFulano;

        if (idadeFulano <= 17){
            classificacaoEtariaFulano = "ADOLESCENTE";
        } else if (idadeFulano >= 18 && idadeFulano <= 29) {
            classificacaoEtariaFulano = "JOVEM";
        } else if (idadeFulano >= 30 && idadeFulano <= 59) {
            classificacaoEtariaFulano = "ADULTO";
        }else
            classificacaoEtariaFulano = "IDOSO";

        System.out.println(">>> Listagem dos Clientes <<<");
        System.out.println(">>> Ano atual: 2023 <<<");
        System.out.println("_____________________________");
        System.out.println("Nome: " + nomeFulano);
        System.out.println("Data de nascimento: " + dataNascimentoFulano);
        System.out.println("Idade: " + idadeFulano);
        System.out.println("Classificação etária: " + classificacaoEtariaFulano);
    }
}
