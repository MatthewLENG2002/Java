public class Vector {
    private int x, y, z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int quadrant() {
        int quad;
        if (x == 0 || y == 0 || z == 0)
            quad = -1;
        else if (x > 0 & y > 0 & z > 0)
            quad = 1;
        else if (x < 0 & y > 0 & z > 0)
            quad = 2;
        else if (x < 0 & y < 0 & z > 0)
            quad = 3;
        else if (x > 0 & y < 0 & z > 0)
            quad = 4;
        else if (x > 0 & y > 0)
            quad = 5;
        else if (x < 0 & y > 0)
            quad = 6;
        else if (x < 0)
            quad = 7;
        else
            quad = 8;
        return quad;
    }

    public double modulus() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public Vector add(Vector vector) {
        return new Vector((x + vector.x), (y + vector.y), (z + vector.z));
    }

    public double area(Vector vector) {
        return 0.5 * (Math.sqrt(Math.pow((y * vector.z - z * vector.y), 2) + Math.pow((z * vector.x - x * vector.z), 2) + Math.pow((x * vector.y - y * vector.x), 2)));
    }

    public static Vector add(Vector a, Vector b) {
        return new Vector((a.x + b.x), (a.y + b.y), (a.z + b.z));
    }

    public static double area(Vector a, Vector b) {
        return 0.5 * (Math.sqrt(Math.pow((a.y * b.z - a.z * b.y), 2) + Math.pow((a.z * b.x - a.x * b.z), 2) + Math.pow((a.x * b.y - a.y * b.x), 2)));
    }

    public String toString() {
        return String.format("(%d,%d,%d)", x, y, z);
    }
}
