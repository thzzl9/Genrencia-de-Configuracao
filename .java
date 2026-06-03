public class CalculadoraIdade {
    public static void main(String[] args) {
        
        int anoAtual = 2026;
        int anoNascimento = 2000;
        int idade = anoAtual - anoNascimento;
        

        System.out.println("Quem nasceu em " + anoNascimento + " faz " + idade + " anos em " + anoAtual + "!");
    }
}