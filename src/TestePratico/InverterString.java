package TestePratico;

public class InverterString {
    public static void main(String[] args) {
        // String de exemplo
        String original = "Hello, world!";

        // Conversão da string em um array de caracteres
        char[] chars = original.toCharArray();

        // Índice do início e fim do array
        int inicio = 0;
        int fim = chars.length - 1;

        // Loop para inverter os caracteres
        while (inicio < fim) {
            // Troca de posição dos caracteres do início e fim do array
            char temp = chars[inicio];
            chars[inicio] = chars[fim];
            chars[fim] = temp;

            // Atualização dos índices
            inicio++;
            fim--;
        }

        // Conversão do array de caracteres de volta para uma string
        String invertida = new String(chars);

        // Exibição do resultado
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }
}
