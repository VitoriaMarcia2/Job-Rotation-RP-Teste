package TestePratico;

public class InverterString {
    public static void main(String[] args) {
        // String de exemplo
        String original = "Hello, world!";

        // Convers�o da string em um array de caracteres
        char[] chars = original.toCharArray();

        // �ndice do in�cio e fim do array
        int inicio = 0;
        int fim = chars.length - 1;

        // Loop para inverter os caracteres
        while (inicio < fim) {
            // Troca de posi��o dos caracteres do in�cio e fim do array
            char temp = chars[inicio];
            chars[inicio] = chars[fim];
            chars[fim] = temp;

            // Atualiza��o dos �ndices
            inicio++;
            fim--;
        }

        // Convers�o do array de caracteres de volta para uma string
        String invertida = new String(chars);

        // Exibi��o do resultado
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }
}
