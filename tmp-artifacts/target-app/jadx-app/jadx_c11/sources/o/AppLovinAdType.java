package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinAdType {
    private static int IAuthTabCallback_Parcel = 0;
    private static int access100 = 1;
    private static int asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    public static final AppLovinAdType onExtraCallbackWithResult = new AppLovinAdType();
    private static final float onNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(44.0f);
    private static final float IAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(38.0f);
    private static final float onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f);
    private static final float onExtraCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(48.0f);
    private static final float onTransact = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
    private static final float IAuthTabCallbackDefault = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(52.0f);
    private static final float IAuthTabCallbackStub = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f);
    private static final float asBinder = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(56.0f);

    private AppLovinAdType() {
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 105;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        float f = onNavigationEvent;
        int i5 = i2 + 109;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100 + 65;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        float f = IAuthTabCallback;
        int i5 = i3 + 67;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 71;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = onWarmupCompleted;
        int i4 = i2 + 109;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 41;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        float f = onExtraCallback;
        int i5 = i2 + 39;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float asInterface() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 27;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = asBinder;
        int i4 = i2 + 59;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return f;
    }

    static {
        int i = getInterfaceDescriptor + 9;
        asInterface = i % 128;
        int i2 = i % 2;
    }
}
