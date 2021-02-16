

/****  Callbacks.c  ********************************************
**
**  This example show how to involke Java methods from the C
**  environment.
**
**  This shared library does not requires the SIOUX console environment
**  to be linked in as printing is done by way of a callback into the
**  Java environment.  This shared libary is about 1 Kbytes.
**
**  NB: Linking will produce over 100 warning messages.
**
**
**  Will Gilbert, Informagen, Inc., 1999
**  Gilbert@Informagen.com
*/


#include <jni.h>



#pragma export on
#include "Callbacks.h"
#pragma export reset


JNIEXPORT void JNICALL Java_Callbacks_nativeMethod(JNIEnv* env, jobject obj, jint depth) {

	// Resolve the involking instance object
	
	jclass cls = (*env)->GetObjectClass(env, obj);
	
	jmethodID callbackMID = (*env)->GetMethodID(env, cls, "callback", "(I)V");
	jmethodID printMID = (*env)->GetMethodID(env, cls, "print", "(Ljava/lang/String;ILjava/lang/String;)V");
	
	char* from = "C";
	char* to   = ", about to enter Java";
	
	jstring fromString = NULL;
	jstring toString = NULL;
	
	
	// 
		
	if ( printMID == 0 )
		return;
		
		
	if ( callbackMID == 0 )
		return;

	
	
	fromString = (*env)->NewStringUTF(env, from);
	toString = (*env)->NewStringUTF(env, to);
	
	(*env)->CallVoidMethod(env, obj, printMID, fromString, depth, toString );
			
	(*env)->CallVoidMethod(env, obj, callbackMID, depth);
	
}