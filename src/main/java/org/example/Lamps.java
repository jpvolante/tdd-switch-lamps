package org.example;

public class Lamps {
    public static int minSwitches(int IA, int IB, int FA, int FB) {
        int switches = 0;


        if (IA != FA) {
            switches += 1;
        }


        if (IB != FB) {
            if (IA == FA) {
                switches += 1;
            } else {
                switches += 1;
            }
        }

        return switches;
    }
}
