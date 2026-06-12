package reflection;

import java.lang.reflect.Array;

public class array {
    static void main() {
        int[] ints=new int[5];
        short[] shorts=new short[5];
        long[] longs=new long[5];
        float[] floats=new float[5];
        double[] doubles=new double[5];
        byte[] bytes=new byte[5];
        boolean[] booleans=new boolean[5];
        String[] strings=new String[5];
        System.out.println(ints.getClass().getName());
        System.out.println(shorts.getClass().getName());
        System.out.println(longs.getClass().getName());
        System.out.println(floats.getClass().getName());
        System.out.println(doubles.getClass().getName());
        System.out.println(bytes.getClass().getName());
        System.out.println(booleans.getClass().getName());
        System.out.println(strings.getClass().getName());
        System.out.println(ints.getClass().getComponentType().getName());
        System.out.println(shorts.getClass().getComponentType().getName());
        System.out.println(longs.getClass().getComponentType().getName());
        System.out.println(floats.getClass().getComponentType().getName());
        System.out.println(doubles.getClass().getComponentType().getName());
        System.out.println(bytes.getClass().getComponentType().getName());
        System.out.println(booleans.getClass().getComponentType().getName());
        System.out.println(strings.getClass().getComponentType().getName());
        Object obj=Array.newInstance(int.class, ints.length);
        for (int i = 0; i < ints.length; i++) {
            Array.setInt(obj, i, (i+1)*10);
        }
        for (int object : (int[]) obj) {
            System.out.println(object);
        }
    }
}
