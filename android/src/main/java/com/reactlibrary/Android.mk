LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := SinC
LOCAL_SRC_FILES := SinC.c

include $(BUILD_SHARED_LIBRARY)
