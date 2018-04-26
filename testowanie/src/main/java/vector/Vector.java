package vector;

import java.util.Arrays;

public class Vector {

    int[] components;

    public Vector(int x, int y, int z) {
        components = new int[]{x, y, z};
    }

    public int get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index smaller than 0");
        }
        if (index > 2) {
            throw new IndexOutOfBoundsException("Index greater than 2");
        }
        return components[index];
    }

    public double length() {
//        if (components[0] == 0 && components[1] == 0 && components[2] == 0) {
//            return 0;
//        }
//        return Math.sqrt(components[0] * components[0] + components[1] * components[1] + components[2] * components[2]);
        return Math.sqrt(Arrays.stream(components).map(x -> x * x).sum());
    }

    public Vector addVector(Vector v2) {
        if (v2 == null) {
            throw new IllegalArgumentException("cannot add null vector");
        }
        return new Vector(get(0) + v2.get(0), get(1) + v2.get(1), get(2) + v2.get(2));
    }

    @Override
    public boolean equals(Object v1) {
        if (v1 == null) {
            return false;
        }
        if (!v1.getClass().equals(getClass())) {
            return false;
        }
        Vector v2 = (Vector) v1;
        for (int i = 0; i < 3; i++) {
            if (get(i) != v2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public int[] toArray() {
        int x = get(0), y = get(1), z = get(2);
        int[] array = new int[3];
        array[0] = x;
        array[1] = y;
        array[2] = z;
        return array;
    }
}
