#include "Sample1.h"
#include <String.h>

JNIEXPORT jint JNICALL Java_Sample1_intMethod
  (JNIEnv *, jobject, jint num){
    return num * num;
}

int main(){
     return 0;
}
