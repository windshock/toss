package im.toss.appsintoss.leaderboard.model;

import im.toss.appsintoss.leaderboard.model.SubmitGameCenterLeaderBoardScoreRequest$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SubmitGameCenterLeaderBoardScoreRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String score;

    static {
        int i = onWarmupCompleted + 31;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof SubmitGameCenterLeaderBoardScoreRequest)) {
                return false;
            }
            if (Intrinsics.areEqual(this.score, ((SubmitGameCenterLeaderBoardScoreRequest) obj).score)) {
                return true;
            }
            int i2 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = IAuthTabCallback;
        int i5 = i4 + 11;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 109;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 91 / 0;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = this.score.hashCode();
            int i3 = 95 / 0;
        } else {
            iHashCode = this.score.hashCode();
        }
        int i4 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SubmitGameCenterLeaderBoardScoreRequest(score=" + this.score + ")";
        int i2 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ SubmitGameCenterLeaderBoardScoreRequest(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, SubmitGameCenterLeaderBoardScoreRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.score = str;
    }

    public SubmitGameCenterLeaderBoardScoreRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.score = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(SubmitGameCenterLeaderBoardScoreRequest submitGameCenterLeaderBoardScoreRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, submitGameCenterLeaderBoardScoreRequest.score);
    }
}
