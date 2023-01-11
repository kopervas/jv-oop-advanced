package core.basesyntax.supplier;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    private Color[] colors = Color.values();

    public String getRandomColor() {
        Random random = new Random();
        return colors[random.nextInt(colors.length)].name();
    }
}
