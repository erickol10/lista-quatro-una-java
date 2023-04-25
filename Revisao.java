import java.util.Scanner;

public class Revisao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Revisão - Exercício 01");

        String cartaoVacina;
        String sintomas;
        String contato;
        String retornoViagem;

        int cartaoVacinaResposta=0;
        int sintomasResposta=0;
        int contatoResposta=0;
        int retornoViagemResposta=0;

        int[] tentativas = {0,0,0,0};

        System.out.println("Informe o seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Informe a sua idade: ");
        int idade = scan.nextInt();

        scan.nextLine();
        
        System.out.println("\nResponda as perguntas com 'SIM' ou 'NAO': ");

    do {
        System.out.println("Seu cartão de vacina está em dia?");
        cartaoVacina=scan.nextLine();

        tentativas[0]++;

    } while (tentativas[0] <= 3 && !cartaoVacina.equals("SIM") && !cartaoVacina.equals("NAO"));

    if (tentativas[0] == 4) {

        System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");

    } else {

    do { 
        System.out.println("Teve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe)");
        sintomas = scan.nextLine();

        tentativas[1]++;

    } while (tentativas[1] <= 3 && !sintomas.equals("SIM") && !sintomas.equals("NAO"));

    if (tentativas[1] == 4) {

        System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
    
    } else {

    do {
        System.out.println("Teve contato com pessoas com sintomas gripais nos últimos dias?");
        contato = scan.nextLine();

        tentativas[2]++;

    } while (tentativas[2] <= 4 && !contato.equals("SIM") && !contato.equals("NAO"));
        
    if (tentativas[2] == 3) {

        System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
    
    } else {
    

    do {
        System.out.println("Está retornando de viagem realizada no exterior?");
        retornoViagem = scan.nextLine();

        tentativas[3]++;

    } while (tentativas[3] <= 4 && !retornoViagem.equals("SIM") && !retornoViagem.equals("NAO"));

    if (tentativas[3] == 3) {

        System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
    
    } else {
    

    if (cartaoVacina.equals( "NAO")){

        cartaoVacinaResposta=10;

    } if (sintomas.equals( "SIM")){

        sintomasResposta=30;

    } if (contato.equals( "SIM")){

        contatoResposta=30;

    } if (retornoViagem.equals( "SIM")){

        retornoViagemResposta=30;

    }

        int resultado=(cartaoVacinaResposta+sintomasResposta+contatoResposta+retornoViagemResposta);

        System.out.println("\nRelatório final: ");
    
        System.out.println("Nome: "+nome);

        System.out.println("Idade: "+idade);

        System.out.println("O cartão de vacina está em dia? " +cartaoVacina);

        System.out.println("Teve sintomas recentemente? " +sintomas);

        System.out.println("Teve contato com pessoas infectadas? " +contato);

        System.out.println("Está retornando de viagem? " +retornoViagem);

        System.out.printf("Probabilidade de infecção: %d%%\n",resultado);

        System.out.println("Orientação final do atendimento: ");

    if (retornoViagem.equals( "SIM")){

        System.out.printf("Você ficará sob observação por 05 dias, por está retornando de viagem.");

    } else { 

    if (resultado<=30){

        System.out.println("Paciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.");
        
    } else if (resultado <= 60 && resultado > 30) {

        System.out.println("Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.");

    } else if (resultado > 60 && resultado < 90) {

        System.out.println("Paciente com alto reico de estar infectado! Gentileza aguardar em lockdown por 7 dias para ser acompanhado.");

    } else if (resultado > 90) {

        System.out.println("Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado.");

                     }
                 } 
            }
        }
    }
}

        scan.close();

    } 

}
