package im.toss.features.alltab.feature.total_service.data.model;

import im.toss.features.alltab.feature.total_service.data.model.MiniAppReviewRequest$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class MiniAppReviewRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final int rating;
    private final String reviewText;

    static {
        int i = onWarmupCompleted + 25;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniAppReviewRequest)) {
            int i2 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        MiniAppReviewRequest miniAppReviewRequest = (MiniAppReviewRequest) obj;
        if (this.rating != miniAppReviewRequest.rating) {
            return false;
        }
        if (Intrinsics.areEqual(this.reviewText, miniAppReviewRequest.reviewText)) {
            return true;
        }
        int i4 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Integer.hashCode(this.rating);
        String str = this.reviewText;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = (iHashCode2 * 31) + iHashCode;
        int i5 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MiniAppReviewRequest(rating=" + this.rating + ", reviewText=" + this.reviewText + ")";
        int i2 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ MiniAppReviewRequest(int i, int i2, String str, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i3 = 1;
        if (1 != (i & 1)) {
            int i4 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                descriptor = MiniAppReviewRequest$.serializer.INSTANCE.getDescriptor();
                i3 = 0;
            } else {
                descriptor = MiniAppReviewRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i3, descriptor);
            int i5 = 2 % 2;
        }
        this.rating = i2;
        if ((i & 2) != 0) {
            this.reviewText = str;
            return;
        }
        this.reviewText = null;
        int i6 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public MiniAppReviewRequest(int i, @Nullable String str) {
        this.rating = i;
        this.reviewText = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(MiniAppReviewRequest miniAppReviewRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            vylVar.onExtraCallback(serialDescriptor, 0, miniAppReviewRequest.rating);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                if (miniAppReviewRequest.reviewText == null) {
                    return;
                }
            }
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, miniAppReviewRequest.rating);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, miniAppReviewRequest.reviewText);
        int i3 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MiniAppReviewRequest(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 73 / 0;
            }
            int i5 = 2 % 2;
            str = null;
        }
        this(i, str);
    }
}
