#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <jni.h> //jni.h is the header file that provides the java to C mapping
#include "Sinus.h" // Sinus.h is the header file that was generated from the java source file

double calcSinus(double v){
  printf("calculating sin for %f \n ", v); //for the java test
  return sin(v);
}

JNIEXPORT jdouble JNICALL Java_Sinus_SinC(JNIEnv*env, jobject thiz, jdouble a){
  jdouble value = calcSinus(a);
  return (value);
}

// then we compile the C source file and generate the shared library file .dll
