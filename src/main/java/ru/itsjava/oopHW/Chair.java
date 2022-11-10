package ru.itsjava.oopHW;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract class Chair {
    private final int maxLoad;
    private final int amountSupportPoint;
    private String sheathingMaterial;
    private final boolean recliningBack;
    private final boolean lumbarSupport;
    public final static String DELIVERY_METHOD = "Самовывоз";

    public void song() {
        System.out.println("Скрип-скрип");
    }
}
