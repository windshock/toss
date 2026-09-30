package o;

import com.google.android.gms.internal.ads.zziea;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinSdkConfigurationConsentDialogState {
    private static int ICustomTabsCallback = 0;
    private static int extraCallback = 1;
    private float IAuthTabCallback;
    private float IAuthTabCallbackDefault;
    private float IAuthTabCallbackStub;
    private float IAuthTabCallbackStubProxy;
    private float IAuthTabCallback_Parcel;
    private float access000;
    private float access100;
    private float asBinder;
    private float asInterface;
    private float extraCallbackWithResult;
    private Integer getInterfaceDescriptor;
    private float onExtraCallback;
    private float onExtraCallbackWithResult;
    private float onNavigationEvent;
    private float onTransact;
    private Float onWarmupCompleted;
    private float readTypedObject;
    private Float writeTypedObject;

    public AppLovinSdkConfigurationConsentDialogState() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 0.0f, 0.0f, null, 262143, null);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = (~i2) | i8;
        int i10 = ~(i2 | i8);
        int i11 = i6 + i5 + i4 + ((-714989572) * i) + (1142003473 * i3);
        int i12 = i11 * i11;
        int i13 = (((-190873766) * i6) - 1983905792) + (1136689320 * i5) + (i7 * (-1483702105)) + (1483702105 * i9) + ((-1483702105) * i10) + ((-1674575872) * i4) + ((-1891631104) * i) + ((-1355808768) * i3) + ((-1882259456) * i12);
        int i14 = (i6 * (-1158907614)) + 1427560840 + (i5 * (-1158905656)) + (i7 * 979) + (i9 * (-979)) + (i10 * 979) + (i4 * (-1158906635)) + (i * 1387703340) + (i3 * 1202573125) + (i12 * (-451215360));
        switch (i13 + (i14 * i14 * (-310837248))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                AppLovinSdkConfigurationConsentDialogState appLovinSdkConfigurationConsentDialogState = (AppLovinSdkConfigurationConsentDialogState) objArr[0];
                int i15 = 2 % 2;
                int i16 = ICustomTabsCallback + 9;
                int i17 = i16 % 128;
                extraCallback = i17;
                int i18 = i16 % 2;
                float f = appLovinSdkConfigurationConsentDialogState.onExtraCallback;
                int i19 = i17 + 5;
                ICustomTabsCallback = i19 % 128;
                int i20 = i19 % 2;
                return Float.valueOf(f);
            case 6:
                return asBinder(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public AppLovinSdkConfigurationConsentDialogState(@Nullable Float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, @Nullable Integer num, float f15, float f16, @Nullable Float f17) {
        this.writeTypedObject = f;
        this.extraCallbackWithResult = f2;
        this.readTypedObject = f3;
        this.IAuthTabCallbackStubProxy = f4;
        this.access100 = f5;
        this.asInterface = f6;
        this.IAuthTabCallbackStub = f7;
        this.IAuthTabCallback = f8;
        this.onExtraCallbackWithResult = f9;
        this.onTransact = f10;
        this.IAuthTabCallbackDefault = f11;
        this.asBinder = f12;
        this.IAuthTabCallback_Parcel = f13;
        this.access000 = f14;
        this.getInterfaceDescriptor = num;
        this.onNavigationEvent = f15;
        this.onExtraCallback = f16;
        this.onWarmupCompleted = f17;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AppLovinSdkConfigurationConsentDialogState(Float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, Integer num, float f15, float f16, Float f17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        Float f27;
        Float f28 = (i & 1) != 0 ? null : f;
        if ((i & 2) != 0) {
            int i2 = extraCallback + 55;
            ICustomTabsCallback = i2 % 128;
            f18 = i2 % 2 != 0 ? 1.0f : 0.0f;
        } else {
            f18 = f2;
        }
        float f29 = (i & 4) != 0 ? 0.0f : f3;
        if ((i & 8) != 0) {
            int i3 = extraCallback + 61;
            ICustomTabsCallback = i3 % 128;
            f19 = i3 % 2 != 0 ? 2.0f : 0.0f;
        } else {
            f19 = f4;
        }
        float f30 = (i & 16) != 0 ? 0.0f : f5;
        float f31 = (i & 32) != 0 ? 0.0f : f6;
        if ((i & 64) != 0) {
            int i4 = 2 % 2;
            f20 = 0.0f;
        } else {
            f20 = f7;
        }
        if ((i & 128) != 0) {
            int i5 = ICustomTabsCallback + 69;
            extraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            f21 = 0.0f;
        } else {
            f21 = f8;
        }
        float f32 = (i & 256) != 0 ? 1.0f : f9;
        if ((i & 512) != 0) {
            int i7 = extraCallback + 75;
            ICustomTabsCallback = i7 % 128;
            f22 = i7 % 2 != 0 ? 0.0f : 1.0f;
            int i8 = 2 % 2;
        } else {
            f22 = f10;
        }
        float f33 = (i & 1024) != 0 ? 1.0f : f11;
        if ((i & 2048) != 0) {
            int i9 = 2 % 2;
            f23 = 1.0f;
        } else {
            f23 = f12;
        }
        float f34 = 0.5f;
        if ((i & 4096) != 0) {
            int i10 = extraCallback + 99;
            ICustomTabsCallback = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 6 / 0;
            }
            f24 = 0.5f;
        } else {
            f24 = f13;
        }
        if ((i & 8192) != 0) {
            int i12 = extraCallback + 97;
            f25 = f24;
            ICustomTabsCallback = i12 % 128;
            int i13 = i12 % 2;
        } else {
            f25 = f24;
            f34 = f14;
        }
        Integer num2 = (i & 16384) != 0 ? null : num;
        float f35 = (32768 & i) != 0 ? 1.0f : f15;
        float f36 = (i & 65536) != 0 ? 0.0f : f16;
        if ((i & 131072) != 0) {
            int i14 = ICustomTabsCallback + 67;
            f26 = f35;
            extraCallback = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 2 % 2;
            f27 = null;
        } else {
            f26 = f35;
            f27 = f17;
        }
        this(f28, f18, f29, f19, f30, f31, f20, f21, f32, f22, f33, f23, f25, f34, num2, f26, f36, f27);
    }

    public final void onWarmupCompleted(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 113;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        this.writeTypedObject = f;
        int i5 = i2 + 83;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final Float readTypedObject() {
        int i = 2 % 2;
        int i2 = extraCallback + 73;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Float f = this.writeTypedObject;
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        return f;
    }

    public final void IAuthTabCallbackStubProxy(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 59;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        this.extraCallbackWithResult = f;
        int i5 = i3 + 63;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float writeTypedObject() {
        int i = 2 % 2;
        int i2 = extraCallback + 19;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.extraCallbackWithResult;
        }
        throw null;
    }

    public final float ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 25;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        float f = this.readTypedObject;
        int i4 = i2 + 101;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public final void access100(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 3;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.readTypedObject = f;
        if (i3 == 0) {
            throw null;
        }
    }

    public final float access000() {
        int i = 2 % 2;
        int i2 = extraCallback + 7;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        float f = this.IAuthTabCallbackStubProxy;
        int i5 = i3 + 45;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final void getInterfaceDescriptor(float f) {
        int i = 2 % 2;
        int i2 = extraCallback + 47;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallbackStubProxy = f;
        int i5 = i3 + 31;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback_Parcel(float f) {
        int i = 2 % 2;
        int i2 = extraCallback + 5;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        this.access100 = f;
        int i5 = i3 + 15;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
    }

    public final float getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = extraCallback + 17;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        float f = this.access100;
        int i5 = i3 + 25;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AppLovinSdkConfigurationConsentDialogState appLovinSdkConfigurationConsentDialogState = (AppLovinSdkConfigurationConsentDialogState) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 99;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        float f = appLovinSdkConfigurationConsentDialogState.asInterface;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 29;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return Float.valueOf(f);
    }

    public final void onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 5;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        this.asInterface = f;
        int i5 = i2 + 31;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float onTransact() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 27;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        float f = this.IAuthTabCallbackStub;
        int i5 = i2 + 25;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final void onTransact(float f) {
        int i = 2 % 2;
        int i2 = extraCallback + 109;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallbackStub = f;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 59;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AppLovinSdkConfigurationConsentDialogState appLovinSdkConfigurationConsentDialogState = (AppLovinSdkConfigurationConsentDialogState) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 71;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        float f = appLovinSdkConfigurationConsentDialogState.IAuthTabCallback;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 113;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return Float.valueOf(f);
    }

    public final void onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = extraCallback + 81;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback = f;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 59;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallbackWithResult = f;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 63;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallback + 31;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        float f = this.onExtraCallbackWithResult;
        int i4 = i3 + 63;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AppLovinSdkConfigurationConsentDialogState appLovinSdkConfigurationConsentDialogState = (AppLovinSdkConfigurationConsentDialogState) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 47;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        float f = appLovinSdkConfigurationConsentDialogState.onTransact;
        int i5 = i2 + 23;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return Float.valueOf(f);
    }

    public final void asBinder(float f) {
        int i = 2 % 2;
        int i2 = extraCallback + 33;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onTransact = f;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 121;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallbackDefault(float f) {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 43;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackDefault = f;
        int i5 = i2 + 107;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final float asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 115;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        float f = this.asBinder;
        int i5 = i3 + 45;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AppLovinSdkConfigurationConsentDialogState appLovinSdkConfigurationConsentDialogState = (AppLovinSdkConfigurationConsentDialogState) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = extraCallback + 107;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        Object obj = null;
        appLovinSdkConfigurationConsentDialogState.IAuthTabCallback_Parcel = fFloatValue;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 99;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final float IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 9;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        float f = this.IAuthTabCallback_Parcel;
        int i5 = i2 + 89;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        AppLovinSdkConfigurationConsentDialogState appLovinSdkConfigurationConsentDialogState = (AppLovinSdkConfigurationConsentDialogState) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 1;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        float f = appLovinSdkConfigurationConsentDialogState.access000;
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        return Float.valueOf(f);
    }

    public final void IAuthTabCallbackStub(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 19;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        this.access000 = f;
        int i5 = i2 + 77;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Integer IAuthTabCallback_Parcel() {
        Integer num;
        int i = 2 % 2;
        int i2 = extraCallback + 77;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        if (i2 % 2 != 0) {
            num = this.getInterfaceDescriptor;
            int i4 = 5 / 0;
        } else {
            num = this.getInterfaceDescriptor;
        }
        int i5 = i3 + 69;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return num;
    }

    public final void onExtraCallbackWithResult(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 93;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        this.getInterfaceDescriptor = num;
        int i5 = i2 + 25;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 117;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        float f = this.onNavigationEvent;
        int i5 = i2 + 59;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final void onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 57;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent = f;
        int i5 = i2 + 97;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 93;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback = f;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AppLovinSdkConfigurationConsentDialogState appLovinSdkConfigurationConsentDialogState = (AppLovinSdkConfigurationConsentDialogState) objArr[0];
        Float f = (Float) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallback + 123;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        appLovinSdkConfigurationConsentDialogState.onWarmupCompleted = f;
        if (i4 != 0) {
            int i5 = 44 / 0;
        }
        int i6 = i3 + 123;
        extraCallback = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public final Float onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 111;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Float f = this.onWarmupCompleted;
        int i4 = i3 + 5;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final float IAuthTabCallback() {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        return ((Float) IAuthTabCallback(zziea.IAuthTabCallback(), iIAuthTabCallback, zziea.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback2, -485618801, 485618806)).floatValue();
    }

    public final float onWarmupCompleted() {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        return ((Float) IAuthTabCallback(zziea.IAuthTabCallback(), iIAuthTabCallback, zziea.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback2, 928198490, -928198490)).floatValue();
    }

    public final float IAuthTabCallbackStub() {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        return ((Float) IAuthTabCallback(zziea.IAuthTabCallback(), iIAuthTabCallback, zziea.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback2, 28336792, -28336789)).floatValue();
    }

    public final float asBinder() {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        return ((Float) IAuthTabCallback(zziea.IAuthTabCallback(), iIAuthTabCallback, zziea.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback2, -488248815, 488248817)).floatValue();
    }

    public final float access100() {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        return ((Float) IAuthTabCallback(zziea.IAuthTabCallback(), iIAuthTabCallback, zziea.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback2, 1720941521, -1720941515)).floatValue();
    }

    public final void IAuthTabCallback(@Nullable Float f) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        IAuthTabCallback(zziea.IAuthTabCallback(), iIAuthTabCallback, zziea.IAuthTabCallback(), new Object[]{this, f}, iIAuthTabCallback2, 357041807, -357041806);
    }

    public final void asInterface(float f) {
        Object[] objArr = {this, Float.valueOf(f)};
        IAuthTabCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), objArr, zziea.IAuthTabCallback(), 1546639579, -1546639575);
    }
}
