package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.foundation.graphics.drawable.RoundDrawable;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setCertificatePinnerokhttp {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int ICustomTabsCallback = 1;
    private static int extraCallbackWithResult = 1;
    private static int readTypedObject;
    private final float IAuthTabCallback;
    private final int IAuthTabCallbackDefault;
    private final float IAuthTabCallbackStub;
    private final int IAuthTabCallback_Parcel;
    private final float access000;
    private final int access100;
    private final float asBinder;
    private final float asInterface;
    private final int getInterfaceDescriptor;
    private final int onExtraCallback;
    private final int onNavigationEvent;
    private final float onTransact;
    private final float onWarmupCompleted;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final Float[] onExtraCallbackWithResult = {Float.valueOf(16.0f), Float.valueOf(14.0f), Float.valueOf(10.0f), Float.valueOf(8.0f)};

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i5);
        int i9 = ~i2;
        int i10 = ~(i9 | i5);
        int i11 = i8 | i10;
        int i12 = ~i5;
        int i13 = ~(i12 | i);
        int i14 = (~(i2 | i7)) | i13 | i10;
        int i15 = (~(i9 | i)) | (~(i12 | i9)) | i13;
        int i16 = i5 + i + i3 + ((-954185507) * i6) + (2055044340 * i4);
        int i17 = i16 * i16;
        int i18 = ((1110557339 * i5) - 760807424) + ((-878567756) * i) + ((-1537228134) * i11) + (i14 * 768614067) + (768614067 * i15) + ((-1647181824) * i3) + (1313472512 * i6) + (606601216 * i4) + ((-1232666624) * i17);
        int i19 = (i5 * 1290134917) + 267690129 + (i * 1290136780) + (i11 * (-1242)) + (i14 * 621) + (i15 * 621) + (i3 * 1290136159) + (i6 * 826674179) + (i4 * 1594648204) + (i17 * 572063744);
        if (i18 + (i19 * i19 * 607715328) == 1) {
            return onWarmupCompleted(objArr);
        }
        setCertificatePinnerokhttp setcertificatepinnerokhttp = (setCertificatePinnerokhttp) objArr[0];
        int i20 = 2 % 2;
        int i21 = readTypedObject + 23;
        int i22 = i21 % 128;
        extraCallbackWithResult = i22;
        int i23 = i21 % 2;
        int i24 = setcertificatepinnerokhttp.onExtraCallback;
        int i25 = i22 + 61;
        readTypedObject = i25 % 128;
        int i26 = i25 % 2;
        return Integer.valueOf(i24);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 91;
        int i4 = i3 % 128;
        readTypedObject = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setCertificatePinnerokhttp)) {
            int i5 = i2 + 59;
            readTypedObject = i5 % 128;
            return i5 % 2 != 0;
        }
        setCertificatePinnerokhttp setcertificatepinnerokhttp = (setCertificatePinnerokhttp) obj;
        if (this.onExtraCallback != setcertificatepinnerokhttp.onExtraCallback) {
            return false;
        }
        if (this.IAuthTabCallback_Parcel != setcertificatepinnerokhttp.IAuthTabCallback_Parcel) {
            int i6 = i4 + 41;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Float.compare(this.IAuthTabCallbackStub, setcertificatepinnerokhttp.IAuthTabCallbackStub) != 0) {
            int i8 = extraCallbackWithResult + 85;
            readTypedObject = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.getInterfaceDescriptor != setcertificatepinnerokhttp.getInterfaceDescriptor || this.IAuthTabCallbackDefault != setcertificatepinnerokhttp.IAuthTabCallbackDefault || Float.compare(this.onTransact, setcertificatepinnerokhttp.onTransact) != 0 || Float.compare(this.asInterface, setcertificatepinnerokhttp.asInterface) != 0) {
            return false;
        }
        if (this.access100 != setcertificatepinnerokhttp.access100) {
            int i10 = extraCallbackWithResult + 43;
            readTypedObject = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (Float.compare(this.asBinder, setcertificatepinnerokhttp.asBinder) != 0) {
            int i12 = readTypedObject + 43;
            extraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (this.onNavigationEvent != setcertificatepinnerokhttp.onNavigationEvent) {
            int i14 = extraCallbackWithResult + 89;
            readTypedObject = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (Float.compare(this.onWarmupCompleted, setcertificatepinnerokhttp.onWarmupCompleted) != 0) {
            return false;
        }
        if (Float.compare(this.access000, setcertificatepinnerokhttp.access000) != 0) {
            int i16 = extraCallbackWithResult + 35;
            readTypedObject = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }
        if (Float.compare(this.IAuthTabCallback, setcertificatepinnerokhttp.IAuthTabCallback) == 0) {
            return true;
        }
        int i18 = readTypedObject + 41;
        extraCallbackWithResult = i18 % 128;
        int i19 = i18 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = readTypedObject + 91;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((((Integer.hashCode(this.onExtraCallback) * 31) + Integer.hashCode(this.IAuthTabCallback_Parcel)) * 31) + Float.hashCode(this.IAuthTabCallbackStub)) * 31) + Integer.hashCode(this.getInterfaceDescriptor)) * 31) + Integer.hashCode(this.IAuthTabCallbackDefault)) * 31) + Float.hashCode(this.onTransact)) * 31) + Float.hashCode(this.asInterface)) * 31) + Integer.hashCode(this.access100)) * 31) + Float.hashCode(this.asBinder)) * 31) + Integer.hashCode(this.onNavigationEvent)) * 31) + Float.hashCode(this.onWarmupCompleted)) * 31) + Float.hashCode(this.access000)) * 31) + Float.hashCode(this.IAuthTabCallback);
        int i4 = readTypedObject + 121;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Colors(backgroundColor=" + this.onExtraCallback + ", textColor=" + this.IAuthTabCallback_Parcel + ", disabledTextAlpha=" + this.IAuthTabCallbackStub + ", gradientStartColor=" + this.getInterfaceDescriptor + ", gradientEndColor=" + this.IAuthTabCallbackDefault + ", gradientAlpha=" + this.onTransact + ", disabledGradientAlpha=" + this.asInterface + ", loaderColor=" + this.access100 + ", disabledLoaderAlpha=" + this.asBinder + ", dimColor=" + this.onNavigationEvent + ", dimAlpha=" + this.onWarmupCompleted + ", loadingDimAlpha=" + this.access000 + ", disabledComponentAlpha=" + this.IAuthTabCallback + ")";
        int i2 = extraCallbackWithResult + 83;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public setCertificatePinnerokhttp(int i, int i2, float f, int i3, int i4, float f2, float f3, int i5, float f4, int i6, float f5, float f6, float f7) {
        this.onExtraCallback = i;
        this.IAuthTabCallback_Parcel = i2;
        this.IAuthTabCallbackStub = f;
        this.getInterfaceDescriptor = i3;
        this.IAuthTabCallbackDefault = i4;
        this.onTransact = f2;
        this.asInterface = f3;
        this.access100 = i5;
        this.asBinder = f4;
        this.onNavigationEvent = i6;
        this.onWarmupCompleted = f5;
        this.access000 = f6;
        this.IAuthTabCallback = f7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setCertificatePinnerokhttp(int i, int i2, float f, int i3, int i4, float f2, float f3, int i5, float f4, int i6, float f5, float f6, float f7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        float f8;
        float f9;
        float f10;
        if ((i7 & 4) != 0) {
            int i8 = extraCallbackWithResult + 75;
            readTypedObject = i8 % 128;
            int i9 = i8 % 2;
            f8 = 1.0f;
        } else {
            f8 = f;
        }
        float f11 = (i7 & 256) != 0 ? 1.0f : f4;
        if ((i7 & 1024) != 0) {
            int i10 = extraCallbackWithResult + 117;
            readTypedObject = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            f9 = 0.26f;
        } else {
            f9 = f5;
        }
        float f12 = (i7 & 2048) != 0 ? 0.13f : f6;
        if ((i7 & 4096) != 0) {
            int i13 = extraCallbackWithResult;
            int i14 = i13 + 77;
            readTypedObject = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
            int i15 = i13 + 17;
            readTypedObject = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 2 % 2;
            }
            f10 = 0.3f;
        } else {
            f10 = f7;
        }
        this(i, i2, f8, i3, i4, f2, f3, i5, f11, i6, f9, f12, f10);
    }

    public final Drawable onWarmupCompleted(@NotNull Context context, @NotNull TdsButtonV1View.onWarmupCompleted onwarmupcompleted, @NotNull TdsButtonV1View.IAuthTabCallback iAuthTabCallback, @Nullable Float f, boolean z) {
        float fIntValue;
        int i = 2 % 2;
        int i2 = readTypedObject + 61;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            ((Integer) onExtraCallbackWithResult(new Object[]{this}, -1833968944, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1833968944, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).intValue();
            TdsButtonV1View.IAuthTabCallback iAuthTabCallback2 = TdsButtonV1View.IAuthTabCallback.FULL;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        int iIntValue = ((Integer) onExtraCallbackWithResult(new Object[]{this}, -1833968944, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1833968944, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).intValue();
        if (iAuthTabCallback == TdsButtonV1View.IAuthTabCallback.FULL) {
            int i3 = readTypedObject + 73;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            fIntValue = 0.0f;
        } else {
            fIntValue = ((Integer) varyMatches.onNavigationEvent(486882314, -486882312, new Object[]{context, onExtraCallbackWithResult[onwarmupcompleted.getIndex()]}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback())).intValue();
        }
        if (f != null) {
            fIntValue = f.floatValue();
        }
        RoundDrawable roundDrawable = new RoundDrawable(iIntValue, fIntValue, 0, z, 4, null);
        int i5 = readTypedObject + 3;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return roundDrawable;
        }
        obj.hashCode();
        throw null;
    }

    public final int onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 73;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        if (!z) {
            return setBodyokhttp.IAuthTabCallback(this.IAuthTabCallback_Parcel, this.IAuthTabCallbackStub);
        }
        int i5 = i3 + 73;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.IAuthTabCallback_Parcel;
        int i8 = i3 + 81;
        extraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 25;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.getInterfaceDescriptor;
        int i6 = i2 + 81;
        readTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 4 / 0;
        }
        return i5;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 17;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.IAuthTabCallbackDefault;
        int i6 = i2 + 59;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final float IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 39;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (!z) {
            return this.asInterface;
        }
        int i5 = i2 + 23;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return this.onTransact;
        }
        throw null;
    }

    public final int onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = readTypedObject + 13;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if (!z) {
            return setBodyokhttp.IAuthTabCallback(this.access100, this.asBinder);
        }
        int i5 = this.access100;
        int i6 = i3 + 25;
        readTypedObject = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final int onNavigationEvent() {
        int i;
        int i2 = 2 % 2;
        int i3 = readTypedObject + 19;
        int i4 = i3 % 128;
        extraCallbackWithResult = i4;
        if (i3 % 2 == 0) {
            i = this.onNavigationEvent;
            int i5 = 24 / 0;
        } else {
            i = this.onNavigationEvent;
        }
        int i6 = i4 + 93;
        readTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final float onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 61;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (!z) {
            return this.onWarmupCompleted;
        }
        float f = this.access000;
        int i5 = i2 + 29;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        setCertificatePinnerokhttp setcertificatepinnerokhttp = (setCertificatePinnerokhttp) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = readTypedObject + 85;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if (zBooleanValue) {
            return Float.valueOf(1.0f);
        }
        float f = setcertificatepinnerokhttp.IAuthTabCallback;
        int i5 = i3 + 103;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return Float.valueOf(f);
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    static {
        int i = ICustomTabsCallback + 5;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    public final int onWarmupCompleted() {
        return ((Integer) onExtraCallbackWithResult(new Object[]{this}, -1833968944, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1833968944, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).intValue();
    }

    public final float onExtraCallback(boolean z) {
        return ((Float) onExtraCallbackWithResult(new Object[]{this, Boolean.valueOf(z)}, 319612355, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -319612354, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).floatValue();
    }
}
