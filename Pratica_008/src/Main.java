public class Main {
    public static void main(String[] args) {
        // Criando expressões terminais
        Expression terminal1 = new TerminalExpression(10);
        Expression terminal2 = new TerminalExpression(5);

        // Criando expressões de adição e subtração com as expressões terminais
        Expression addition = new AddExpression(terminal1, terminal2);
        Expression subtraction = new SubtractExpression(terminal1, terminal2);

        // Avaliando as expressões e imprimindo os resultados
        System.out.println("Resultado da Adição: " + addition.interpret());
        System.out.println("Resultado da Subtração: " + subtraction.interpret());
    }
}