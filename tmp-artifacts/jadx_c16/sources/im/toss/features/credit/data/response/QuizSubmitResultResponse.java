package im.toss.features.credit.data.response;

import im.toss.features.credit.data.response.QuizBanner$;
import im.toss.features.credit.data.response.QuizNextTimeInfo$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getBgColor;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.oty1;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class QuizSubmitResultResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Long balance;
    private final QuizBanner banner;
    private final String fullScreenBannerScheme;
    private final Boolean isCorrect;
    private final QuizNextTimeInfo nextTimeQuizInfo;
    private final Long rewardPoint;
    private final Boolean successReward;

    static {
        int i = IAuthTabCallback + 121;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 71 / 0;
        }
    }

    public QuizSubmitResultResponse() {
        this((Boolean) null, (Long) null, (Long) null, (Boolean) null, (String) null, (QuizNextTimeInfo) null, (QuizBanner) null, 127, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuizSubmitResultResponse)) {
            return false;
        }
        QuizSubmitResultResponse quizSubmitResultResponse = (QuizSubmitResultResponse) obj;
        if (!Intrinsics.areEqual(this.isCorrect, quizSubmitResultResponse.isCorrect)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.balance, quizSubmitResultResponse.balance)) {
            int i2 = onNavigationEvent + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.rewardPoint, quizSubmitResultResponse.rewardPoint)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.successReward, quizSubmitResultResponse.successReward)) {
            int i4 = onNavigationEvent + 43;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.fullScreenBannerScheme, quizSubmitResultResponse.fullScreenBannerScheme)) {
            return Intrinsics.areEqual(this.nextTimeQuizInfo, quizSubmitResultResponse.nextTimeQuizInfo) && Intrinsics.areEqual(this.banner, quizSubmitResultResponse.banner);
        }
        int i6 = onNavigationEvent + 125;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        Boolean bool = this.isCorrect;
        if (bool == null) {
            int i2 = onNavigationEvent + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bool.hashCode();
        }
        Long l = this.balance;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        Long l2 = this.rewardPoint;
        int iHashCode4 = l2 == null ? 0 : l2.hashCode();
        Boolean bool2 = this.successReward;
        int iHashCode5 = bool2 == null ? 0 : bool2.hashCode();
        String str = this.fullScreenBannerScheme;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        QuizNextTimeInfo quizNextTimeInfo = this.nextTimeQuizInfo;
        if (quizNextTimeInfo == null) {
            int i4 = onNavigationEvent + 119;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = quizNextTimeInfo.hashCode();
        }
        QuizBanner quizBanner = this.banner;
        return (((((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + (quizBanner != null ? quizBanner.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QuizSubmitResultResponse(isCorrect=" + this.isCorrect + ", balance=" + this.balance + ", rewardPoint=" + this.rewardPoint + ", successReward=" + this.successReward + ", fullScreenBannerScheme=" + this.fullScreenBannerScheme + ", nextTimeQuizInfo=" + this.nextTimeQuizInfo + ", banner=" + this.banner + ")";
        int i2 = onWarmupCompleted + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public QuizSubmitResultResponse(@Nullable Boolean bool, @Nullable Long l, @Nullable Long l2, @Nullable Boolean bool2, @Nullable String str, @Nullable QuizNextTimeInfo quizNextTimeInfo, @Nullable QuizBanner quizBanner) {
        this.isCorrect = bool;
        this.balance = l;
        this.rewardPoint = l2;
        this.successReward = bool2;
        this.fullScreenBannerScheme = str;
        this.nextTimeQuizInfo = quizNextTimeInfo;
        this.banner = quizBanner;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e4  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(QuizSubmitResultResponse quizSubmitResultResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        Long l;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(quizSubmitResultResponse.isCorrect, Boolean.FALSE)) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getBgColor.IAuthTabCallback, quizSubmitResultResponse.isCorrect);
        }
        Object obj = null;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onWarmupCompleted + 43;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                Long l2 = quizSubmitResultResponse.balance;
                obj.hashCode();
                throw null;
            }
            Long l3 = quizSubmitResultResponse.balance;
            if (l3 == null || l3.longValue() != 0) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, quizSubmitResultResponse.balance);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || (l = quizSubmitResultResponse.rewardPoint) == null || l.longValue() != 0) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, oty1.onExtraCallback, quizSubmitResultResponse.rewardPoint);
            int i5 = onWarmupCompleted + 69;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i7 = onNavigationEvent + 53;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 15 / 0;
                if (!Intrinsics.areEqual(quizSubmitResultResponse.successReward, Boolean.FALSE)) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getBgColor.IAuthTabCallback, quizSubmitResultResponse.successReward);
                }
            } else if (!Intrinsics.areEqual(quizSubmitResultResponse.successReward, Boolean.FALSE)) {
            }
        }
        if (true ^ vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i9 = onWarmupCompleted + 93;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            if (!Intrinsics.areEqual(quizSubmitResultResponse.fullScreenBannerScheme, "")) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, quizSubmitResultResponse.fullScreenBannerScheme);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
            int i11 = onNavigationEvent + 87;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 != 0) {
                QuizNextTimeInfo quizNextTimeInfo = quizSubmitResultResponse.nextTimeQuizInfo;
                throw null;
            }
            if (quizSubmitResultResponse.nextTimeQuizInfo != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 5, QuizNextTimeInfo$.serializer.INSTANCE, quizSubmitResultResponse.nextTimeQuizInfo);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || quizSubmitResultResponse.banner != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, QuizBanner$.serializer.INSTANCE, quizSubmitResultResponse.banner);
        }
    }

    public final Boolean asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Boolean bool = this.isCorrect;
        int i5 = i3 + 15;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    public /* synthetic */ QuizSubmitResultResponse(int i, Boolean bool, Long l, Long l2, Boolean bool2, String str, QuizNextTimeInfo quizNextTimeInfo, QuizBanner quizBanner, okycx okycxVar) {
        this.isCorrect = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.balance = 0L;
        } else {
            this.balance = l;
        }
        if ((i & 4) == 0) {
            int i2 = onNavigationEvent + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.rewardPoint = 0L;
            if (i3 != 0) {
                throw null;
            }
        } else {
            this.rewardPoint = l2;
            int i4 = 2 % 2;
        }
        if ((i & 8) == 0) {
            this.successReward = Boolean.FALSE;
        } else {
            this.successReward = bool2;
        }
        if ((i & 16) == 0) {
            this.fullScreenBannerScheme = "";
            int i5 = onWarmupCompleted + 105;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } else {
            this.fullScreenBannerScheme = str;
        }
        if ((i & 32) == 0) {
            this.nextTimeQuizInfo = null;
            int i8 = 2 % 2;
        } else {
            this.nextTimeQuizInfo = quizNextTimeInfo;
        }
        if ((i & 64) != 0) {
            this.banner = quizBanner;
            return;
        }
        int i9 = onWarmupCompleted + 71;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        this.banner = null;
        if (i10 == 0) {
            int i11 = 29 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ QuizSubmitResultResponse(Boolean bool, Long l, Long l2, Boolean bool2, String str, QuizNextTimeInfo quizNextTimeInfo, QuizBanner quizBanner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Boolean bool3;
        Long l3;
        Boolean bool4;
        QuizNextTimeInfo quizNextTimeInfo2;
        if ((i & 1) != 0) {
            bool3 = Boolean.FALSE;
            int i2 = 2 % 2;
        } else {
            bool3 = bool;
        }
        if ((i & 2) != 0) {
            int i3 = 2 % 2;
            l3 = l;
        } else {
            l3 = l;
        }
        l = (i & 4) == 0 ? l2 : 0L;
        QuizBanner quizBanner2 = null;
        if ((i & 8) != 0) {
            int i4 = onNavigationEvent + 71;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                bool4 = Boolean.FALSE;
                int i5 = onWarmupCompleted + 99;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
            } else {
                Boolean bool5 = Boolean.FALSE;
                throw null;
            }
        } else {
            bool4 = bool2;
        }
        String str2 = (i & 16) != 0 ? "" : str;
        if ((i & 32) != 0) {
            int i7 = onNavigationEvent + 119;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            quizNextTimeInfo2 = null;
        } else {
            quizNextTimeInfo2 = quizNextTimeInfo;
        }
        if ((i & 64) != 0) {
            int i8 = onNavigationEvent + 21;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 2;
            }
        } else {
            quizBanner2 = quizBanner;
        }
        this(bool3, l3, l, bool4, str2, quizNextTimeInfo2, quizBanner2);
    }

    public final Long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Long l = this.balance;
        int i5 = i3 + 55;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    public final Long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Long l = this.rewardPoint;
        int i4 = i3 + 63;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return l;
    }

    public final Boolean onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 3;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.successReward;
        int i4 = i2 + 57;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.fullScreenBannerScheme;
        }
        throw null;
    }

    public final QuizNextTimeInfo onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        QuizNextTimeInfo quizNextTimeInfo = this.nextTimeQuizInfo;
        int i4 = i3 + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return quizNextTimeInfo;
    }

    public final QuizBanner onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        QuizBanner quizBanner = this.banner;
        int i5 = i3 + 79;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return quizBanner;
    }
}
