package o;

import android.graphics.Paint;
import android.graphics.RectF;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno {
    private static int extraCallback = 0;
    private static int extraCallbackWithResult = 1;
    private final long IAuthTabCallback;
    private final Paint IAuthTabCallbackDefault;
    private final RectF IAuthTabCallbackStub;
    private final removeTimestamp IAuthTabCallbackStubProxy;
    private final long IAuthTabCallback_Parcel;
    private final float access000;
    private final long access100;
    private final float asBinder;
    private final long asInterface;
    private final float getInterfaceDescriptor;
    private final readFully onExtraCallback;
    private final float onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final x2ExternalSyntheticLambda0 onTransact;
    private final long onWarmupCompleted;

    public /* synthetic */ r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno(x2ExternalSyntheticLambda0 x2externalsyntheticlambda0, long j, long j2, long j3, removeTimestamp removetimestamp, float f, long j4, RectF rectF, Paint paint, readFully readfully, long j5, long j6, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(x2externalsyntheticlambda0, j, j2, j3, removetimestamp, f, j4, rectF, paint, readfully, j5, j6, f2, f3, f4);
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | (~(i3 | i4)) | (~(i5 | i4));
        int i10 = ~i5;
        int i11 = (~(i10 | i4)) | i3;
        int i12 = (~(i4 | i3 | i5)) | (~(i8 | i10));
        int i13 = i3 + i5 + i2 + ((-373584967) * i6) + ((-1711780345) * i);
        int i14 = i13 * i13;
        int i15 = (i3 * 1075882953) + 1902575616 + (1075882953 * i5) + ((-462509112) * i9) + (925018224 * i11) + (462509112 * i12) + (1538392064 * i2) + ((-375259136) * i6) + ((-1109524480) * i) + (585564160 * i14);
        int i16 = ((i3 * 235012993) - 778813113) + (i5 * 235012993) + (i9 * (-632)) + (i11 * 1264) + (i12 * 632) + (i2 * 235013625) + (i6 * 915899377) + (i * (-1709701169)) + (i14 * 1974403072);
        int i17 = i15 + (i16 * i16 * (-848756736));
        return i17 != 1 ? i17 != 2 ? onExtraCallback(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno)) {
            return false;
        }
        r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno r8lambdapqixvm4k_wfc1_gg0aalci54lno = (r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno) obj;
        if (!Intrinsics.areEqual(this.onTransact, r8lambdapqixvm4k_wfc1_gg0aalci54lno.onTransact)) {
            return false;
        }
        if (!setUseCaseAttached.onWarmupCompleted(this.access100, r8lambdapqixvm4k_wfc1_gg0aalci54lno.access100)) {
            int i2 = extraCallback + 85;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!setUseCaseDetached.onExtraCallback(this.IAuthTabCallback_Parcel, r8lambdapqixvm4k_wfc1_gg0aalci54lno.IAuthTabCallback_Parcel)) {
            int i4 = extraCallbackWithResult + 7;
            extraCallback = i4 % 128;
            return i4 % 2 != 0;
        }
        if ((!getAttachedUseCaseConfigs.onWarmupCompleted(this.IAuthTabCallback, r8lambdapqixvm4k_wfc1_gg0aalci54lno.IAuthTabCallback)) || !Intrinsics.areEqual(this.IAuthTabCallbackStubProxy, r8lambdapqixvm4k_wfc1_gg0aalci54lno.IAuthTabCallbackStubProxy)) {
            return false;
        }
        if (Float.compare(this.asBinder, r8lambdapqixvm4k_wfc1_gg0aalci54lno.asBinder) != 0) {
            int i5 = extraCallbackWithResult + 51;
            extraCallback = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!setUseCaseDetached.onExtraCallback(this.asInterface, r8lambdapqixvm4k_wfc1_gg0aalci54lno.asInterface) || (!Intrinsics.areEqual(this.IAuthTabCallbackStub, r8lambdapqixvm4k_wfc1_gg0aalci54lno.IAuthTabCallbackStub)) || !Intrinsics.areEqual(this.IAuthTabCallbackDefault, r8lambdapqixvm4k_wfc1_gg0aalci54lno.IAuthTabCallbackDefault) || !Intrinsics.areEqual(this.onExtraCallback, r8lambdapqixvm4k_wfc1_gg0aalci54lno.onExtraCallback)) {
            return false;
        }
        if (!setUseCaseAttached.onWarmupCompleted(this.onWarmupCompleted, r8lambdapqixvm4k_wfc1_gg0aalci54lno.onWarmupCompleted)) {
            int i6 = extraCallbackWithResult + 125;
            extraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!setUseCaseDetached.onExtraCallback(this.onNavigationEvent, r8lambdapqixvm4k_wfc1_gg0aalci54lno.onNavigationEvent)) {
            int i8 = extraCallback + 33;
            extraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Float.compare(this.onExtraCallbackWithResult, r8lambdapqixvm4k_wfc1_gg0aalci54lno.onExtraCallbackWithResult) == 0) {
            return Float.compare(this.access000, r8lambdapqixvm4k_wfc1_gg0aalci54lno.access000) == 0 && Float.compare(this.getInterfaceDescriptor, r8lambdapqixvm4k_wfc1_gg0aalci54lno.getInterfaceDescriptor) == 0;
        }
        int i10 = extraCallback + 3;
        extraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 121;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((((((((this.onTransact.hashCode() * 31) + setUseCaseAttached.IAuthTabCallbackStub(this.access100)) * 31) + setUseCaseDetached.asInterface(this.IAuthTabCallback_Parcel)) * 31) + getAttachedUseCaseConfigs.onWarmupCompleted(this.IAuthTabCallback)) * 31) + this.IAuthTabCallbackStubProxy.hashCode()) * 31) + Float.hashCode(this.asBinder)) * 31) + setUseCaseDetached.asInterface(this.asInterface)) * 31) + this.IAuthTabCallbackStub.hashCode()) * 31) + this.IAuthTabCallbackDefault.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + setUseCaseAttached.IAuthTabCallbackStub(this.onWarmupCompleted)) * 31) + setUseCaseDetached.asInterface(this.onNavigationEvent)) * 31) + Float.hashCode(this.onExtraCallbackWithResult)) * 31) + Float.hashCode(this.access000)) * 31) + Float.hashCode(this.getInterfaceDescriptor);
        int i4 = extraCallback + 91;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerticalProgressTrackCache(key=" + this.onTransact + ", trackOffset=" + setUseCaseAttached.IAuthTabCallbackDefault(this.access100) + ", trackSize=" + setUseCaseDetached.asBinder(this.IAuthTabCallback_Parcel) + ", cornerRadius=" + getAttachedUseCaseConfigs.onNavigationEvent(this.IAuthTabCallback) + ", trackClipPath=" + this.IAuthTabCallbackStubProxy + ", progressEnd=" + this.asBinder + ", progressSize=" + setUseCaseDetached.asBinder(this.asInterface) + ", progressShadowRect=" + this.IAuthTabCallbackStub + ", progressShadowPaint=" + this.IAuthTabCallbackDefault + ", gradientBrush=" + this.onExtraCallback + ", borderOffset=" + setUseCaseAttached.IAuthTabCallbackDefault(this.onWarmupCompleted) + ", borderSize=" + setUseCaseDetached.asBinder(this.onNavigationEvent) + ", borderWidth=" + this.onExtraCallbackWithResult + ", trackRadius=" + this.access000 + ", trackTop=" + this.getInterfaceDescriptor + ")";
        int i2 = extraCallback + 59;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno(x2ExternalSyntheticLambda0 x2externalsyntheticlambda0, long j, long j2, long j3, removeTimestamp removetimestamp, float f, long j4, RectF rectF, Paint paint, readFully readfully, long j5, long j6, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(x2externalsyntheticlambda0, "");
        Intrinsics.checkNotNullParameter(removetimestamp, "");
        Intrinsics.checkNotNullParameter(rectF, "");
        Intrinsics.checkNotNullParameter(paint, "");
        Intrinsics.checkNotNullParameter(readfully, "");
        this.onTransact = x2externalsyntheticlambda0;
        this.access100 = j;
        this.IAuthTabCallback_Parcel = j2;
        this.IAuthTabCallback = j3;
        this.IAuthTabCallbackStubProxy = removetimestamp;
        this.asBinder = f;
        this.asInterface = j4;
        this.IAuthTabCallbackStub = rectF;
        this.IAuthTabCallbackDefault = paint;
        this.onExtraCallback = readfully;
        this.onWarmupCompleted = j5;
        this.onNavigationEvent = j6;
        this.onExtraCallbackWithResult = f2;
        this.access000 = f3;
        this.getInterfaceDescriptor = f4;
    }

    public final x2ExternalSyntheticLambda0 asInterface() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 91;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        x2ExternalSyntheticLambda0 x2externalsyntheticlambda0 = this.onTransact;
        int i5 = i2 + 109;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return x2externalsyntheticlambda0;
    }

    public final long IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 55;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.access100;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        long j;
        r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno r8lambdapqixvm4k_wfc1_gg0aalci54lno = (r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 3;
        extraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            j = r8lambdapqixvm4k_wfc1_gg0aalci54lno.IAuthTabCallback_Parcel;
            int i4 = 61 / 0;
        } else {
            j = r8lambdapqixvm4k_wfc1_gg0aalci54lno.IAuthTabCallback_Parcel;
        }
        int i5 = i2 + 55;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return Long.valueOf(j);
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 35;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }

    public final removeTimestamp access100() {
        int i = 2 % 2;
        int i2 = extraCallback + 7;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        removeTimestamp removetimestamp = this.IAuthTabCallbackStubProxy;
        int i5 = i3 + 97;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return removetimestamp;
        }
        throw null;
    }

    public final float onTransact() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 33;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = this.asBinder;
        int i4 = i2 + 7;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public final long asBinder() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 79;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long j = this.asInterface;
        int i5 = i2 + 63;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno r8lambdapqixvm4k_wfc1_gg0aalci54lno = (r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 125;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        RectF rectF = r8lambdapqixvm4k_wfc1_gg0aalci54lno.IAuthTabCallbackStub;
        int i5 = i2 + 13;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return rectF;
    }

    public final Paint IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 117;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Paint paint = this.IAuthTabCallbackDefault;
        int i5 = i2 + 101;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return paint;
    }

    public final readFully IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 65;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        readFully readfully = this.onExtraCallback;
        int i5 = i2 + 25;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return readfully;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallback + 55;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 45;
        int i3 = i2 % 128;
        extraCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        long j = this.onNavigationEvent;
        int i4 = i3 + 41;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 109;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno r8lambdapqixvm4k_wfc1_gg0aalci54lno = (r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 125;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        float f = r8lambdapqixvm4k_wfc1_gg0aalci54lno.access000;
        if (i3 == 0) {
            return Float.valueOf(f);
        }
        throw null;
    }

    public final float IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 113;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        float f = this.getInterfaceDescriptor;
        int i5 = i3 + 17;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final RectF IAuthTabCallbackStub() {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return (RectF) onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback2, -814806163, iOnExtraCallback, 814806165, iOnExtraCallback3, new Object[]{this});
    }

    public final float getInterfaceDescriptor() {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return ((Float) onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback2, -1436391294, iOnExtraCallback, 1436391295, iOnExtraCallback3, new Object[]{this})).floatValue();
    }

    public final long access000() {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return ((Long) onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback2, -2014608152, iOnExtraCallback, 2014608152, iOnExtraCallback3, new Object[]{this})).longValue();
    }
}
