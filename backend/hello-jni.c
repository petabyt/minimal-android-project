#include <string.h>
#include <jni.h>

JNIEXPORT jstring JNICALL
Java_pl_czak_minimal_MainActivity_stringFromJNI
(JNIEnv* env, jobject thiz) {
	char *string = "I'm C99";

    return (*env)->NewStringUTF(env, string);
}
