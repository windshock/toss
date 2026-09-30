package o;

import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4 {
    private static int extraCallback = 1;
    private static int writeTypedObject;
    private final long IAuthTabCallback;
    private final float IAuthTabCallbackDefault;
    private final long IAuthTabCallbackStub;
    private final float IAuthTabCallbackStubProxy;
    private final float IAuthTabCallback_Parcel;
    private final long access000;
    private final removeTimestamp access100;
    private final r8lambdaR67rFjO_P8h7SpCUFgnHuCLzjx4 asBinder;
    private final RectF asInterface;
    private final long extraCallbackWithResult;
    private final long getInterfaceDescriptor;
    private final float onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final readFully onNavigationEvent;
    private final Paint onTransact;
    private final long onWarmupCompleted;

    public /* synthetic */ r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4(r8lambdaR67rFjO_P8h7SpCUFgnHuCLzjx4 r8lambdar67rfjo_p8h7spcufgnhuclzjx4, long j, long j2, long j3, removeTimestamp removetimestamp, float f, long j4, long j5, RectF rectF, Paint paint, readFully readfully, long j6, long j7, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(r8lambdar67rfjo_p8h7spcufgnhuclzjx4, j, j2, j3, removetimestamp, f, j4, j5, rectF, paint, readfully, j6, j7, f2, f3, f4);
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | i6;
        int i10 = ~(i5 | i);
        int i11 = i9 | i10;
        int i12 = ~i6;
        int i13 = (~(i12 | i)) | (~(i12 | i5)) | i10;
        int i14 = (~(i7 | i)) | (~(i8 | i5));
        int i15 = i5 + i + i4 + (1040777104 * i3) + ((-1861505373) * i2);
        int i16 = i15 * i15;
        int i17 = (i5 * (-1036928585)) + 527892480 + ((-1036928585) * i) + ((-562525036) * i11) + (562525036 * i13) + ((-281262518) * i14) + ((-1318191104) * i4) + (1608515584 * i3) + ((-1123418112) * i2) + ((-2114519040) * i16);
        int i18 = (i5 * 1703033811) + 1712528133 + (i * 1703033811) + (i11 * 1508) + (i13 * (-1508)) + (i14 * 754) + (i4 * 1703034565) + (i3 * (-2114876976)) + (i2 * 1880022383) + (i16 * (-720175104));
        int i19 = i17 + (i18 * i18 * (-739180544));
        return i19 != 1 ? i19 != 2 ? onWarmupCompleted(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 97;
        int i3 = i2 % 128;
        extraCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 109;
            writeTypedObject = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!(obj instanceof r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4)) {
            return false;
        }
        r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4 r8lambdar55qr61tuz1pubmfypcurugk0r4 = (r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4) obj;
        if (!Intrinsics.areEqual(this.asBinder, r8lambdar55qr61tuz1pubmfypcurugk0r4.asBinder)) {
            return false;
        }
        if (!setUseCaseAttached.onWarmupCompleted(this.access000, r8lambdar55qr61tuz1pubmfypcurugk0r4.access000)) {
            int i5 = writeTypedObject + 7;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!setUseCaseDetached.onExtraCallback(this.extraCallbackWithResult, r8lambdar55qr61tuz1pubmfypcurugk0r4.extraCallbackWithResult)) {
            return false;
        }
        if (!getAttachedUseCaseConfigs.onWarmupCompleted(this.onExtraCallbackWithResult, r8lambdar55qr61tuz1pubmfypcurugk0r4.onExtraCallbackWithResult)) {
            int i7 = extraCallback + 65;
            writeTypedObject = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.access100, r8lambdar55qr61tuz1pubmfypcurugk0r4.access100)) {
            int i9 = writeTypedObject + 39;
            extraCallback = i9 % 128;
            return i9 % 2 == 0;
        }
        if (Float.compare(this.IAuthTabCallbackDefault, r8lambdar55qr61tuz1pubmfypcurugk0r4.IAuthTabCallbackDefault) != 0 || !setUseCaseAttached.onWarmupCompleted(this.IAuthTabCallbackStub, r8lambdar55qr61tuz1pubmfypcurugk0r4.IAuthTabCallbackStub) || !setUseCaseDetached.onExtraCallback(this.getInterfaceDescriptor, r8lambdar55qr61tuz1pubmfypcurugk0r4.getInterfaceDescriptor) || (!Intrinsics.areEqual(this.asInterface, r8lambdar55qr61tuz1pubmfypcurugk0r4.asInterface))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onTransact, r8lambdar55qr61tuz1pubmfypcurugk0r4.onTransact)) {
            int i10 = extraCallback + 69;
            writeTypedObject = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, r8lambdar55qr61tuz1pubmfypcurugk0r4.onNavigationEvent)) {
            return false;
        }
        if (setUseCaseAttached.onWarmupCompleted(this.onWarmupCompleted, r8lambdar55qr61tuz1pubmfypcurugk0r4.onWarmupCompleted)) {
            return setUseCaseDetached.onExtraCallback(this.IAuthTabCallback, r8lambdar55qr61tuz1pubmfypcurugk0r4.IAuthTabCallback) && Float.compare(this.onExtraCallback, r8lambdar55qr61tuz1pubmfypcurugk0r4.onExtraCallback) == 0 && Float.compare(this.IAuthTabCallback_Parcel, r8lambdar55qr61tuz1pubmfypcurugk0r4.IAuthTabCallback_Parcel) == 0 && Float.compare(this.IAuthTabCallbackStubProxy, r8lambdar55qr61tuz1pubmfypcurugk0r4.IAuthTabCallbackStubProxy) == 0;
        }
        int i12 = extraCallback + 83;
        writeTypedObject = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 65;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((((((((((this.asBinder.hashCode() * 31) + setUseCaseAttached.IAuthTabCallbackStub(this.access000)) * 31) + setUseCaseDetached.asInterface(this.extraCallbackWithResult)) * 31) + getAttachedUseCaseConfigs.onWarmupCompleted(this.onExtraCallbackWithResult)) * 31) + this.access100.hashCode()) * 31) + Float.hashCode(this.IAuthTabCallbackDefault)) * 31) + setUseCaseAttached.IAuthTabCallbackStub(this.IAuthTabCallbackStub)) * 31) + setUseCaseDetached.asInterface(this.getInterfaceDescriptor)) * 31) + this.asInterface.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + setUseCaseAttached.IAuthTabCallbackStub(this.onWarmupCompleted)) * 31) + setUseCaseDetached.asInterface(this.IAuthTabCallback)) * 31) + Float.hashCode(this.onExtraCallback)) * 31) + Float.hashCode(this.IAuthTabCallback_Parcel)) * 31) + Float.hashCode(this.IAuthTabCallbackStubProxy);
        int i4 = extraCallback + 105;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HorizontalProgressTrackCache(key=" + this.asBinder + ", trackOffset=" + setUseCaseAttached.IAuthTabCallbackDefault(this.access000) + ", trackSize=" + setUseCaseDetached.asBinder(this.extraCallbackWithResult) + ", cornerRadius=" + getAttachedUseCaseConfigs.onNavigationEvent(this.onExtraCallbackWithResult) + ", trackClipPath=" + this.access100 + ", progressEnd=" + this.IAuthTabCallbackDefault + ", progressOffset=" + setUseCaseAttached.IAuthTabCallbackDefault(this.IAuthTabCallbackStub) + ", progressSize=" + setUseCaseDetached.asBinder(this.getInterfaceDescriptor) + ", progressShadowRect=" + this.asInterface + ", progressShadowPaint=" + this.onTransact + ", gradientBrush=" + this.onNavigationEvent + ", borderOffset=" + setUseCaseAttached.IAuthTabCallbackDefault(this.onWarmupCompleted) + ", borderSize=" + setUseCaseDetached.asBinder(this.IAuthTabCallback) + ", borderWidth=" + this.onExtraCallback + ", trackRadius=" + this.IAuthTabCallback_Parcel + ", trackLeft=" + this.IAuthTabCallbackStubProxy + ")";
        int i2 = writeTypedObject + 125;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4(r8lambdaR67rFjO_P8h7SpCUFgnHuCLzjx4 r8lambdar67rfjo_p8h7spcufgnhuclzjx4, long j, long j2, long j3, removeTimestamp removetimestamp, float f, long j4, long j5, RectF rectF, Paint paint, readFully readfully, long j6, long j7, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(r8lambdar67rfjo_p8h7spcufgnhuclzjx4, "");
        Intrinsics.checkNotNullParameter(removetimestamp, "");
        Intrinsics.checkNotNullParameter(rectF, "");
        Intrinsics.checkNotNullParameter(paint, "");
        Intrinsics.checkNotNullParameter(readfully, "");
        this.asBinder = r8lambdar67rfjo_p8h7spcufgnhuclzjx4;
        this.access000 = j;
        this.extraCallbackWithResult = j2;
        this.onExtraCallbackWithResult = j3;
        this.access100 = removetimestamp;
        this.IAuthTabCallbackDefault = f;
        this.IAuthTabCallbackStub = j4;
        this.getInterfaceDescriptor = j5;
        this.asInterface = rectF;
        this.onTransact = paint;
        this.onNavigationEvent = readfully;
        this.onWarmupCompleted = j6;
        this.IAuthTabCallback = j7;
        this.onExtraCallback = f2;
        this.IAuthTabCallback_Parcel = f3;
        this.IAuthTabCallbackStubProxy = f4;
    }

    public final r8lambdaR67rFjO_P8h7SpCUFgnHuCLzjx4 IAuthTabCallbackDefault() {
        r8lambdaR67rFjO_P8h7SpCUFgnHuCLzjx4 r8lambdar67rfjo_p8h7spcufgnhuclzjx4;
        int i = 2 % 2;
        int i2 = writeTypedObject + 11;
        int i3 = i2 % 128;
        extraCallback = i3;
        if (i2 % 2 == 0) {
            r8lambdar67rfjo_p8h7spcufgnhuclzjx4 = this.asBinder;
            int i4 = 72 / 0;
        } else {
            r8lambdar67rfjo_p8h7spcufgnhuclzjx4 = this.asBinder;
        }
        int i5 = i3 + 21;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return r8lambdar67rfjo_p8h7spcufgnhuclzjx4;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        long j;
        r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4 r8lambdar55qr61tuz1pubmfypcurugk0r4 = (r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 19;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            j = r8lambdar55qr61tuz1pubmfypcurugk0r4.access000;
            int i3 = 81 / 0;
        } else {
            j = r8lambdar55qr61tuz1pubmfypcurugk0r4.access000;
        }
        return Long.valueOf(j);
    }

    public final long ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 21;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return this.extraCallbackWithResult;
        }
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 111;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onExtraCallbackWithResult;
        int i5 = i2 + 17;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final removeTimestamp IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = extraCallback + 93;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        removeTimestamp removetimestamp = this.access100;
        int i5 = i3 + 9;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return removetimestamp;
    }

    public final float IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 109;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        float f = this.IAuthTabCallbackDefault;
        int i5 = i2 + 111;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 97;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackStub;
        }
        throw null;
    }

    public final long access000() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        long j = this.getInterfaceDescriptor;
        int i5 = i3 + 39;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return j;
    }

    public final RectF asBinder() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 1;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.asInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Paint asInterface() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 35;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Paint paint = this.onTransact;
        int i5 = i2 + 19;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return paint;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final readFully onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallback + 37;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        readFully readfully = this.onNavigationEvent;
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return readfully;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4 r8lambdar55qr61tuz1pubmfypcurugk0r4 = (r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 113;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        long j = r8lambdar55qr61tuz1pubmfypcurugk0r4.onWarmupCompleted;
        int i5 = i2 + 51;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return Long.valueOf(j);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 67;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.IAuthTabCallback;
        int i4 = i2 + 51;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 53;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        float f = this.onExtraCallback;
        int i5 = i3 + 91;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4 r8lambdar55qr61tuz1pubmfypcurugk0r4 = (r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 119;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        float f = r8lambdar55qr61tuz1pubmfypcurugk0r4.IAuthTabCallback_Parcel;
        int i5 = i3 + 17;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return Float.valueOf(f);
        }
        throw null;
    }

    public final float access100() {
        int i = 2 % 2;
        int i2 = extraCallback + 33;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = this.IAuthTabCallbackStubProxy;
        int i4 = i3 + 23;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return f;
    }

    public final long onNavigationEvent() {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return ((Long) onWarmupCompleted(-60704401, new Object[]{this}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, 60704402, iOnExtraCallback)).longValue();
    }

    public final long getInterfaceDescriptor() {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return ((Long) onWarmupCompleted(-1140370258, new Object[]{this}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, 1140370260, iOnExtraCallback)).longValue();
    }

    public final float IAuthTabCallback_Parcel() {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return ((Float) onWarmupCompleted(-1871850479, new Object[]{this}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, 1871850479, iOnExtraCallback)).floatValue();
    }
}
