package ru.itsjava.oopHW;

public class ComputerChair extends Chair {
    public ComputerChair() {
        super(120, 5, "Кожзам", true, true);
    }

    public ComputerChair(int maxLoad, int amountSupportPoint, String sheathingMaterial, boolean recliningBack, boolean lumbarSupport) {
        super(maxLoad, amountSupportPoint, sheathingMaterial, recliningBack, lumbarSupport);
    }

}
