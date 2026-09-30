package o;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class registerSensor extends SensorBridgeExtension3 {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private static int onTransact;
    private final boolean onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final NativeAdsDto.AdAsset onWarmupCompleted;
    public static final onWarmupCompleted Companion = new onWarmupCompleted((DefaultConstructorMarker) null);
    public static final int onExtraCallback = 8;
    private static final registerSensor IAuthTabCallback = new registerSensor(null, null, false);

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof registerSensor)) {
            int i4 = i3 + 59;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        registerSensor registersensor = (registerSensor) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, registersensor.onNavigationEvent)) {
            int i6 = IAuthTabCallbackDefault + 7;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, registersensor.onWarmupCompleted)) {
            return this.onExtraCallbackWithResult == registersensor.onExtraCallbackWithResult;
        }
        int i8 = onTransact + 67;
        IAuthTabCallbackDefault = i8 % 128;
        return !(i8 % 2 != 0);
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 95;
        IAuthTabCallbackDefault = i3 % 128;
        int iHashCode2 = 0;
        if (i3 % 2 == 0) {
            str = this.onNavigationEvent;
            iHashCode = 1;
            if (str != null) {
                iHashCode2 = 1;
                iHashCode = iHashCode2;
                iHashCode2 = str.hashCode();
            }
            int i4 = i2 + 111;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = this.onNavigationEvent;
            if (str == null) {
                iHashCode = 0;
                int i42 = i2 + 111;
                IAuthTabCallbackDefault = i42 % 128;
                int i52 = i42 % 2;
            }
            iHashCode = iHashCode2;
            iHashCode2 = str.hashCode();
        }
        NativeAdsDto.AdAsset adAsset = this.onWarmupCompleted;
        if (adAsset != null) {
            iHashCode = adAsset.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NativeAdsItem(requestId=" + this.onNavigationEvent + ", adAsset=" + this.onWarmupCompleted + ", showAdBadge=" + this.onExtraCallbackWithResult + ")";
        int i2 = IAuthTabCallbackDefault + 79;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 36 / 0;
        }
        return str;
    }

    public registerSensor(@Nullable String str, @Nullable NativeAdsDto.AdAsset adAsset, boolean z) {
        this.onNavigationEvent = str;
        this.onWarmupCompleted = adAsset;
        this.onExtraCallbackWithResult = z;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 39;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onNavigationEvent;
        int i5 = i2 + 53;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final NativeAdsDto.AdAsset onExtraCallbackWithResult() {
        NativeAdsDto.AdAsset adAsset;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 107;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            adAsset = this.onWarmupCompleted;
            int i4 = 36 / 0;
        } else {
            adAsset = this.onWarmupCompleted;
        }
        int i5 = i2 + 79;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return adAsset;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.onExtraCallbackWithResult;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return z;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        if (this.onWarmupCompleted == null) {
            int i2 = onTransact + 99;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onTransact + 31;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    static {
        Object obj = null;
        int i = IAuthTabCallbackStub + 53;
        asBinder = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
