package org.eric.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
public class RestaurantManagementSystem {
    private static final int MaxComboNum = 20;

    private int comboNum = 0;
    private Combo[] combos;

    public RestaurantManagementSystem() {
        this.combos = new Combo[MaxComboNum];
    }

    public void addCombo(Combo combo) {
        if (comboNum < MaxComboNum) {
            // add the combo
            combos[comboNum] = combo;
        } else {
            // reach the cap
            System.out.printf("There are %d combos already. Add combo failed.", MaxComboNum);
        }
    }

    @Override
    public String toString() {
        String comboStr = "[";
        for (Combo combo : combos) {
            if (combo != null) {
                comboStr += combo + ", ";
            }
        }
        comboStr += "]";

        return "RestaurantManagementSystem{" +
                "combos=" + comboStr +
                '}';
    }
}
