package o;

import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class isValidString extends SupportedOutputSizesSorterLegacy<prefixToIndex> {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private final Camera2CameraMetadataExternalSyntheticLambda1 IAuthTabCallback;
    private final setContentInsetsRelative onExtraCallback;
    private final MaxInterstitialAd onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final toFullSHA1Hash onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isValidString)) {
            return false;
        }
        isValidString isvalidstring = (isValidString) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, isvalidstring.onWarmupCompleted)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, isvalidstring.onExtraCallback)) {
            int i2 = IAuthTabCallbackStub + 73;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, isvalidstring.IAuthTabCallback)) {
            if (this.onNavigationEvent != isvalidstring.onNavigationEvent) {
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, isvalidstring.onExtraCallbackWithResult)) {
                return true;
            }
            int i4 = asBinder + 63;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = IAuthTabCallbackStub;
        int i7 = i6 + 103;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 + 37;
        asBinder = i9 % 128;
        if (i9 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = asBinder + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.onWarmupCompleted.hashCode();
        setContentInsetsRelative setcontentinsetsrelative = this.onExtraCallback;
        int iHashCode3 = 0;
        if (setcontentinsetsrelative == null) {
            int i4 = asBinder + 31;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = setcontentinsetsrelative.hashCode();
        }
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = this.IAuthTabCallback;
        if (camera2CameraMetadataExternalSyntheticLambda1 != null) {
            int i6 = IAuthTabCallbackStub + 97;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = camera2CameraMetadataExternalSyntheticLambda1.hashCode();
            int i8 = IAuthTabCallbackStub + 49;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
        }
        return (((((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3) * 31) + Integer.hashCode(this.onNavigationEvent)) * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AnimateStackElement(state=" + this.onWarmupCompleted + ", scrollState=" + this.onExtraCallback + ", lazyListState=" + this.IAuthTabCallback + ", motionIndex=" + this.onNavigationEvent + ", target=" + this.onExtraCallbackWithResult + ")";
        int i2 = asBinder + 73;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public isValidString(@NotNull toFullSHA1Hash tofullsha1hash, @Nullable setContentInsetsRelative setcontentinsetsrelative, @Nullable Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, int i, @NotNull MaxInterstitialAd maxInterstitialAd) {
        Intrinsics.checkNotNullParameter(tofullsha1hash, "");
        Intrinsics.checkNotNullParameter(maxInterstitialAd, "");
        this.onWarmupCompleted = tofullsha1hash;
        this.onExtraCallback = setcontentinsetsrelative;
        this.IAuthTabCallback = camera2CameraMetadataExternalSyntheticLambda1;
        this.onNavigationEvent = i;
        this.onExtraCallbackWithResult = maxInterstitialAd;
    }

    public /* synthetic */ QuirksExternalSyntheticBackport0.onWarmupCompleted onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        prefixToIndex prefixtoindexOnWarmupCompleted = onWarmupCompleted();
        int i4 = asBinder + 123;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return prefixtoindexOnWarmupCompleted;
    }

    public /* synthetic */ void onNavigationEvent(QuirksExternalSyntheticBackport0.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((prefixToIndex) onwarmupcompleted);
        if (i3 == 0) {
            throw null;
        }
    }

    public prefixToIndex onWarmupCompleted() {
        int i = 2 % 2;
        prefixToIndex prefixtoindex = new prefixToIndex(this.onWarmupCompleted, this.onExtraCallback, this.IAuthTabCallback, this.onNavigationEvent, this.onExtraCallbackWithResult);
        int i2 = asBinder + 23;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return prefixtoindex;
        }
        throw null;
    }

    public void IAuthTabCallback(@NotNull prefixToIndex prefixtoindex) {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(prefixtoindex, "");
        prefixtoindex.onExtraCallbackWithResult(this.onNavigationEvent, this.onExtraCallbackWithResult);
        int i4 = asBinder + 79;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
