package o;

import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.nativead.NativeAd;
import im.toss.features.benefit.admob.AdMobNativeAdContent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BasicSystemInfoExtension extends SensorBridgeExtension3 implements SensorBridgeExtension, handleThread {
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    private final String IAuthTabCallback;
    private final NativeAd onExtraCallback;
    private final AdMobNativeAdContent onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private boolean onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asInterface + 17;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 9;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof BasicSystemInfoExtension)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, ((BasicSystemInfoExtension) obj).onExtraCallback)) {
            if (!(!Intrinsics.areEqual(this.onNavigationEvent, r6.onNavigationEvent))) {
                return true;
            }
            int i7 = asInterface + 93;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = IAuthTabCallbackStub;
        int i10 = i9 + 57;
        asInterface = i10 % 128;
        boolean z = i10 % 2 != 0;
        int i11 = i9 + 55;
        asInterface = i11 % 128;
        int i12 = i11 % 2;
        return z;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.onExtraCallback.hashCode();
        String str = this.onNavigationEvent;
        if (str == null) {
            int i2 = IAuthTabCallbackStub + 33;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 27;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ThumbnailBannerAdMobItem(nativeAd=" + this.onExtraCallback + ", requestId=" + this.onNavigationEvent + ")";
        int i2 = asInterface + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public BasicSystemInfoExtension(@NotNull NativeAd nativeAd, @Nullable String str) {
        String str2;
        Intrinsics.checkNotNullParameter(nativeAd, "");
        this.onExtraCallback = nativeAd;
        this.onNavigationEvent = str;
        this.onExtraCallbackWithResult = AdMobNativeAdContent.Companion.onWarmupCompleted(nativeAd);
        MediaContent mediaContent = nativeAd.getMediaContent();
        if (mediaContent != null && mediaContent.hasVideoContent()) {
            int i = asInterface + 17;
            IAuthTabCallbackStub = i % 128;
            if (i % 2 == 0) {
                int i2 = 31 / 0;
            }
            int i3 = 2 % 2;
            str2 = "VIDEO";
        } else {
            int i4 = IAuthTabCallbackStub + 15;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            str2 = "IMAGE";
        }
        this.IAuthTabCallback = str2;
    }

    public final NativeAd IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 33;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        NativeAd nativeAd = this.onExtraCallback;
        int i4 = i2 + 59;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return nativeAd;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        String str = this.onNavigationEvent;
        int i5 = i3 + 125;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return str;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        throw null;
    }

    public final AdMobNativeAdContent onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = asInterface + 29;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            str = this.IAuthTabCallback;
            int i4 = 67 / 0;
        } else {
            str = this.IAuthTabCallback;
        }
        int i5 = i3 + 67;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
