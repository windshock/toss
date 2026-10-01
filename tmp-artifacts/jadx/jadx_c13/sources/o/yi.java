package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface yi {
    void IAuthTabCallback(@Nullable Integer num);

    jni_YGNodeStyleSetMinHeightPercentJNI IAuthTabCallbackDefault();

    Integer IAuthTabCallbackStub();

    Integer IAuthTabCallbackStubProxy();

    Integer IAuthTabCallback_Parcel();

    void asInterface(@Nullable Integer num);

    Integer extraCallbackWithResult();

    void getInterfaceDescriptor(@Nullable Integer num);

    void onExtraCallback(@Nullable jni_YGNodeStyleSetMinHeightPercentJNI jni_ygnodestylesetminheightpercentjni);

    Integer onTransact();

    void onTransact(@Nullable Integer num);

    void onWarmupCompleted(@Nullable Integer num);

    default invalidateSelf asBinder() {
        Integer numIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        if (numIAuthTabCallbackStubProxy != null) {
            return new invalidateSelf(numIAuthTabCallbackStubProxy.intValue(), 9);
        }
        return null;
    }

    default void IAuthTabCallback(@Nullable invalidateSelf invalidateself) {
        asInterface(invalidateself != null ? Integer.valueOf(invalidateself.onWarmupCompleted(9)) : null);
    }
}
