add_library(backend SHARED
            hello-jni.c)

# Include libraries needed for hello-jni lib
target_link_libraries(backend
                      android
                      log)
