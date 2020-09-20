package utm.isa;

public class Vector2 {
    public float x;
    public float y;

    public Vector2() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return getClass().getName() + "[x=" + this.x + ",y=" + this.y + "]";
    }

    public boolean equals(Vector2 other) {
        return (Float.compare(this.x, other.x) == 0 &&
                Float.compare(this.y, other.y) == 0);
    }
}
