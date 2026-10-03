package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeAdViewAttributesApi {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final List<FbValidationUtils> backgroundJobs;
    private final long cardId;
    private final String funnelId;
    private final List<RCTCodelessLoggingEventListener> layouts;
    private final int nextCursor;
    private final isRemoteRenderingProcess preventChurnBottomSheet;
    private final String sessionId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeAdViewAttributesApi)) {
            int i2 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        NativeAdViewAttributesApi nativeAdViewAttributesApi = (NativeAdViewAttributesApi) obj;
        if (!Intrinsics.areEqual(this.funnelId, nativeAdViewAttributesApi.funnelId)) {
            int i4 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.sessionId, nativeAdViewAttributesApi.sessionId)) {
            return false;
        }
        if (this.nextCursor != nativeAdViewAttributesApi.nextCursor) {
            int i6 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.backgroundJobs, nativeAdViewAttributesApi.backgroundJobs)) {
            int i7 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i7 % 128;
            return i7 % 2 == 0;
        }
        if (this.cardId != nativeAdViewAttributesApi.cardId || !Intrinsics.areEqual(this.layouts, nativeAdViewAttributesApi.layouts) || (!Intrinsics.areEqual(this.preventChurnBottomSheet, nativeAdViewAttributesApi.preventChurnBottomSheet))) {
            return false;
        }
        int i8 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.funnelId.hashCode();
        int iHashCode3 = this.sessionId.hashCode();
        int iHashCode4 = Integer.hashCode(this.nextCursor);
        int iHashCode5 = this.backgroundJobs.hashCode();
        int iHashCode6 = Long.hashCode(this.cardId);
        int iHashCode7 = this.layouts.hashCode();
        isRemoteRenderingProcess isremoterenderingprocess = this.preventChurnBottomSheet;
        if (isremoterenderingprocess == null) {
            int i4 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i4 % 128;
            iHashCode = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = isremoterenderingprocess.hashCode();
        }
        int i5 = (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode;
        int i6 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardIssueFunnelResp(funnelId=" + this.funnelId + ", sessionId=" + this.sessionId + ", nextCursor=" + this.nextCursor + ", backgroundJobs=" + this.backgroundJobs + ", cardId=" + this.cardId + ", layouts=" + this.layouts + ", preventChurnBottomSheet=" + this.preventChurnBottomSheet + ")";
        int i2 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.sessionId;
        int i5 = i3 + 9;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.nextCursor;
        int i6 = i2 + 9;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final List<FbValidationUtils> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        List<FbValidationUtils> list = this.backgroundJobs;
        int i5 = i3 + 63;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 109;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j = this.cardId;
        int i4 = i2 + 23;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final List<RCTCodelessLoggingEventListener> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<RCTCodelessLoggingEventListener> list = this.layouts;
        int i4 = i3 + 5;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final isRemoteRenderingProcess onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        isRemoteRenderingProcess isremoterenderingprocess = this.preventChurnBottomSheet;
        int i5 = i3 + 33;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return isremoterenderingprocess;
        }
        throw null;
    }
}
