package ru.itsjava.oopHW;

public class OfficeChair extends Chair {
    public OfficeChair() {
        super(150, 4, "Ткань", false, false);
    }

    public OfficeChair(int maxLoad, int amountSupportPoint, String sheathingMaterial, boolean recliningBack, boolean lumbarSupport) {
        super(maxLoad, amountSupportPoint, sheathingMaterial, recliningBack, lumbarSupport);
    }
}
