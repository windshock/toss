package im.toss.appsintoss.leaderboard.model;

import im.toss.appsintoss.leaderboard.model.SubmitGameCenterLeaderBoardScoreResponse$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SubmitGameCenterLeaderBoardScoreResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final String statusCode;

    static {
        int i = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitGameCenterLeaderBoardScoreResponse)) {
            int i2 = onWarmupCompleted + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.statusCode, ((SubmitGameCenterLeaderBoardScoreResponse) obj).statusCode)) {
            return true;
        }
        int i4 = onExtraCallback + 79;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            this.statusCode.hashCode();
            throw null;
        }
        int iHashCode = this.statusCode.hashCode();
        int i3 = onWarmupCompleted + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SubmitGameCenterLeaderBoardScoreResponse(statusCode=" + this.statusCode + ")";
        int i2 = onExtraCallback + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ SubmitGameCenterLeaderBoardScoreResponse(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onWarmupCompleted + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, SubmitGameCenterLeaderBoardScoreResponse$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 15;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.statusCode = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(SubmitGameCenterLeaderBoardScoreResponse submitGameCenterLeaderBoardScoreResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, submitGameCenterLeaderBoardScoreResponse.statusCode);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 9;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.statusCode;
        int i5 = i2 + 107;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
