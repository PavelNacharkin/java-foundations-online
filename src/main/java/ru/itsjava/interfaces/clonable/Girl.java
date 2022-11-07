package ru.itsjava.interfaces.clonable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Girl implements Cloneable {
    private final String name;
    private double high;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", high=" + high +
                '}';
    }
}
