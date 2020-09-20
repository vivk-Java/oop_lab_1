package utm.isa;

import java.awt.*;

public class Monitor {
    public Color color;
    public Vector2 dimension;
    public Vector2 resolution;

    public Monitor() {
        color = Color.BLACK;
        dimension = new Vector2();
        resolution = new Vector2();
    }

    public Monitor(Color color, Vector2 dimension, Vector2 resolution) {
        this.color = color;
        this.dimension = dimension;
        this.resolution = resolution;
    }

    public String toString() {
        return getClass().getName() + "[color=" + this.color +
                ",dimension=" + this.dimension +
                ",resolution=" + this.resolution + "]";
    }

    public boolean equals(Monitor other) {
        return (this.color == other.color &&
                this.dimension.equals(other.dimension) &&
                this.resolution.equals(other.resolution));
    }
}
