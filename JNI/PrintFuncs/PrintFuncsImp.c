// Native C++ code that implements printStringNative(...)


#include "PrintFuncs.h"    

JNIEXPORT void JNICALL Java_PrintFuncs_printStringNative(JNIEnv *env, jobject obj, jstring s) 
{
    // Get the class associated with this object (class PrintFuncs)
  jclass cls = env->GetObjectClass(obj);

    // The the ID for its 'printStringJ(string)' method
  jmethodID mid = env->GetMethodID(cls, "printStringJava", "(Ljava/lang/String;)V");
  
    // If the method does not exist
  if (mid == 0)
    return;

    // Call the method, which returns a String
  env->CallVoidMethod(obj, mid, s);
}

