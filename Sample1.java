//package org.optframework.jni;

public class Sample1 {
    // Native keyword can be used only with methods.
    //The native keyword tells the Java compiler that a method is implemented in native code outside of the Java class in which it is being declared.
    //A native method cannot have a body
    public native int intMethod(int i);
//    public native boolean booleanMethod(boolean bool);
//    public native String stringMethod(String text);
//    public native int intArrayMethod(int[] intArray);

    public static void main(String[] args) {
        // We load the shared library file containing the implementation for these native methods
         System.loadLibrary("Sample1");
        //System.load("/Users/Hessam/Desktop/java/test/libSample1.jnilib");
        Sample1 sample = new Sample1();
        int square = sample.intMethod(5);
//        boolean bool = sample.booleanMethod(true);
//        String text = sample.stringMethod("JAVA");
//        int sum = sample.intArrayMethod(new int[]{1,1,2,3,5,8,13});

        System.out.println("intMethod: "+ square);
//        System.out.println("booleanMethod: "+ bool);
//        System.out.println("stringMethod: "+ text);
//        System.out.println("intArrayMethod: "+ sum);
    }
}
