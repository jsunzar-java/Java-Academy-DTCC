package assignment_2.data_types;

public class PrimitiveDataTypes {
    public static void main (String args[]) {
        boolean b1 = true;
        byte b8 = 69;
        char c4 = 'A';
        short s = 23;
        long l = 32L;
        float f = 65F;
        double d1 = 6.9;
        int i = 3;

        float c = (float) (f * d1);
        double d2 = (double) i;
        int i2 = (int) c;
        char c2 = 'D';
        int i3 = (int) c2;
        System.out.println(i3);

        if (i==i3) {
            System.out.println("Equal");
        }else System.out.println("Not Equal");
    }
}

