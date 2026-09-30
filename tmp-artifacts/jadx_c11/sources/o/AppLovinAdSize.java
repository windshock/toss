package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinAdSize {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100 = 0;
    private static int getInterfaceDescriptor = 1;
    public static final AppLovinAdSize onWarmupCompleted = new AppLovinAdSize();
    private static final float onNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(999.0f);
    private static final float IAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
    private static final float onExtraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f);
    private static final float onExtraCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f);
    private static final float asBinder = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f);
    private static final float asInterface = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f);
    private static final float onTransact = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
    private static final float IAuthTabCallbackStub = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
    private static final float IAuthTabCallbackDefault = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f);

    private AppLovinAdSize() {
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 7;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        float f = onNavigationEvent;
        int i5 = i2 + 99;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100 + 77;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback;
        }
        throw null;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 79;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        float f = onExtraCallbackWithResult;
        int i5 = i3 + 107;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100 + 37;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        float f = onExtraCallback;
        int i5 = i3 + 61;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return f;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 73;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        float f = asBinder;
        int i5 = i2 + 101;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 59;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        float f = asInterface;
        int i5 = i2 + 119;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float asBinder() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 19;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        float f = IAuthTabCallbackStub;
        int i5 = i2 + 27;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float onTransact() {
        int i = 2 % 2;
        int i2 = access100 + 41;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        float f = IAuthTabCallbackDefault;
        int i5 = i3 + 121;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    static {
        int i = IAuthTabCallback_Parcel + 123;
        IAuthTabCallbackStubProxy = i % 128;
        if (i % 2 != 0) {
            int i2 = 20 / 0;
        }
    }
}
