package com.reactlibrary;

public class Sinus{

  public native double SinC(double a); // informs the java compiler that the implementation for this method is native

  static{
    System.loadLibrary("SinC"); //loading the library SinC
  }

  //testing
  public static void main(String[] args ){
    Sinus sample = new Sinus();
    double msg = sample.SinC((double) 3.14);
    System.out.println(msg);
  }
}
