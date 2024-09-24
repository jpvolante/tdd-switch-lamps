package org.example;

public class Lamps {
    public static int minSwitches(int IA, int IB, int FA, int FB) {
        int switches = 0;

        // Verifica se o estado de A precisa ser alterado
        if (IA != FA) {
            switches += 1;  // Se for diferente, precisa apertar C1
        }

        // Verifica se o estado de B precisa ser alterado ou se ambos A e B precisam
        if (IB != FB) {
            if (IA == FA) {
                switches += 1;  // Se o estado de A já está correto, só precisa apertar C2 para alterar B
            } else {
                switches += 1;  // Se A e B precisam ser alterados, um apertar de C2 resolve ambos
            }
        }

        return switches;
    }
}
