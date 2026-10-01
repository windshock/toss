package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxNativeAdImpl {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder;
    private final String IAuthTabCallback;
    private final Long IAuthTabCallbackStub;
    private final boolean onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onTransact;
    private final boolean onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaxNativeAdImpl)) {
            return false;
        }
        MaxNativeAdImpl maxNativeAdImpl = (MaxNativeAdImpl) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, maxNativeAdImpl.onExtraCallbackWithResult)) {
            int i2 = asBinder + 101;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, maxNativeAdImpl.IAuthTabCallback)) {
            int i4 = IAuthTabCallbackDefault + 29;
            asBinder = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.onTransact, maxNativeAdImpl.onTransact)) {
            int i5 = IAuthTabCallbackDefault + 39;
            asBinder = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, maxNativeAdImpl.onNavigationEvent) || !Intrinsics.areEqual(this.IAuthTabCallbackStub, maxNativeAdImpl.IAuthTabCallbackStub) || this.onExtraCallback != maxNativeAdImpl.onExtraCallback) {
            return false;
        }
        if (this.onWarmupCompleted == maxNativeAdImpl.onWarmupCompleted) {
            return true;
        }
        int i6 = asBinder + 117;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
        int iHashCode3 = this.IAuthTabCallback.hashCode();
        int iHashCode4 = this.onTransact.hashCode();
        int iHashCode5 = this.onNavigationEvent.hashCode();
        Long l = this.IAuthTabCallbackStub;
        if (l == null) {
            int i2 = asBinder + 37;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
            int i4 = i3 + 19;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iHashCode = l.hashCode();
        }
        int iHashCode6 = (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + Boolean.hashCode(this.onExtraCallback)) * 31) + Boolean.hashCode(this.onWarmupCompleted);
        int i6 = asBinder + 21;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return iHashCode6;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnSharedBundleLoadRequest(bundleName=" + this.onExtraCallbackWithResult + ", bundleUrl=" + this.IAuthTabCallback + ", region=" + this.onTransact + ", company=" + this.onNavigationEvent + ", maxAge=" + this.IAuthTabCallbackStub + ", isForceLoadRemote=" + this.onExtraCallback + ", isRetry=" + this.onWarmupCompleted + ")";
        int i2 = IAuthTabCallbackDefault + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public MaxNativeAdImpl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable Long l, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.onExtraCallbackWithResult = str;
        this.IAuthTabCallback = str2;
        this.onTransact = str3;
        this.onNavigationEvent = str4;
        this.IAuthTabCallbackStub = l;
        this.onExtraCallback = z;
        this.onWarmupCompleted = z2;
        if (StringsKt.isBlank(str)) {
            throw new IllegalArgumentException("bundleName must not be blank");
        }
        if (StringsKt.isBlank(str2)) {
            throw new IllegalArgumentException("bundleUrl must not be blank");
        }
        int i = asBinder + 73;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
        if (StringsKt.isBlank(str3)) {
            throw new IllegalArgumentException("region must not be blank");
        }
        int i3 = IAuthTabCallbackDefault + 49;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            StringsKt.isBlank(str4);
            throw null;
        }
        if (StringsKt.isBlank(str4)) {
            throw new IllegalArgumentException("company must not be blank");
        }
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 95;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.onExtraCallbackWithResult;
        int i4 = i2 + 93;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.IAuthTabCallback;
        int i4 = i3 + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }
}
