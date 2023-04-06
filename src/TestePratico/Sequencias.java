package TestePratico;

public class Sequencias {
    public static void main(String[] args) {
        // Sequ�ncia a)
        int[] sequenciaA = {1, 3, 5, 7};
        int proximoElementoA = sequenciaA[sequenciaA.length - 1] + 2;
        System.out.println("Pr�ximo elemento da sequ�ncia a): " + proximoElementoA);

        // Sequ�ncia b)
        int[] sequenciaB = {2, 4, 8, 16, 32, 64};
        int proximoElementoB = sequenciaB[sequenciaB.length - 1] * 2;
        System.out.println("Pr�ximo elemento da sequ�ncia b): " + proximoElementoB);

        // Sequ�ncia c)
        int[] sequenciaC = {0, 1, 4, 9, 16, 25, 36};
        int proximoElementoC = (int) Math.pow(sequenciaC.length, 2);
        System.out.println("Pr�ximo elemento da sequ�ncia c): " + proximoElementoC);

        // Sequ�ncia d)
        int[] sequenciaD = {4, 16, 36, 64};
        int proximoElementoD = (int) Math.pow(sequenciaD.length + 1, 2);
        System.out.println("Pr�ximo elemento da sequ�ncia d): " + proximoElementoD);

        // Sequ�ncia e)
        int[] sequenciaE = {1, 1, 2, 3, 5, 8};
        int proximoElementoE = sequenciaE[sequenciaE.length - 2] + sequenciaE[sequenciaE.length - 1];
        System.out.println("Pr�ximo elemento da sequ�ncia e): " + proximoElementoE);

        // Sequ�ncia f)
        int[] sequenciaF = {2, 10, 12, 16, 17, 18, 19};
        int proximoElementoF = sequenciaF[sequenciaF.length - 1] + 1;
        System.out.println("Pr�ximo elemento da sequ�ncia f): " + proximoElementoF);
    }
}

