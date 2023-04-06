package TestePratico;

public class Sequencias {
    public static void main(String[] args) {
        // Sequência a)
        int[] sequenciaA = {1, 3, 5, 7};
        int proximoElementoA = sequenciaA[sequenciaA.length - 1] + 2;
        System.out.println("Próximo elemento da sequência a): " + proximoElementoA);

        // Sequência b)
        int[] sequenciaB = {2, 4, 8, 16, 32, 64};
        int proximoElementoB = sequenciaB[sequenciaB.length - 1] * 2;
        System.out.println("Próximo elemento da sequência b): " + proximoElementoB);

        // Sequência c)
        int[] sequenciaC = {0, 1, 4, 9, 16, 25, 36};
        int proximoElementoC = (int) Math.pow(sequenciaC.length, 2);
        System.out.println("Próximo elemento da sequência c): " + proximoElementoC);

        // Sequência d)
        int[] sequenciaD = {4, 16, 36, 64};
        int proximoElementoD = (int) Math.pow(sequenciaD.length + 1, 2);
        System.out.println("Próximo elemento da sequência d): " + proximoElementoD);

        // Sequência e)
        int[] sequenciaE = {1, 1, 2, 3, 5, 8};
        int proximoElementoE = sequenciaE[sequenciaE.length - 2] + sequenciaE[sequenciaE.length - 1];
        System.out.println("Próximo elemento da sequência e): " + proximoElementoE);

        // Sequência f)
        int[] sequenciaF = {2, 10, 12, 16, 17, 18, 19};
        int proximoElementoF = sequenciaF[sequenciaF.length - 1] + 1;
        System.out.println("Próximo elemento da sequência f): " + proximoElementoF);
    }
}

