package im.toss.features.credit.data.request;

import im.toss.features.credit.data.request.QuizAnswerRequest$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getBgColor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class QuizAnswerRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final Boolean answer;
    private final long creditQuizId;

    static {
        Object obj = null;
        int i = onNavigationEvent + 99;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof QuizAnswerRequest)) {
            return false;
        }
        QuizAnswerRequest quizAnswerRequest = (QuizAnswerRequest) obj;
        if (this.creditQuizId != quizAnswerRequest.creditQuizId || !Intrinsics.areEqual(this.answer, quizAnswerRequest.answer)) {
            return false;
        }
        int i4 = onExtraCallback + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 43;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = Long.hashCode(this.creditQuizId);
        Boolean bool = this.answer;
        if (bool == null) {
            i = 0;
        } else {
            int iHashCode2 = bool.hashCode();
            int i5 = onWarmupCompleted + 47;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QuizAnswerRequest(creditQuizId=" + this.creditQuizId + ", answer=" + this.answer + ")";
        int i2 = onWarmupCompleted + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ QuizAnswerRequest(int i, long j, Boolean bool, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 3;
        if (3 != (i & 3)) {
            int i3 = onWarmupCompleted + 89;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = QuizAnswerRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 5;
            } else {
                descriptor = QuizAnswerRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onWarmupCompleted + 123;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.creditQuizId = j;
        this.answer = bool;
    }

    public QuizAnswerRequest(long j, @Nullable Boolean bool) {
        this.creditQuizId = j;
        this.answer = bool;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(QuizAnswerRequest quizAnswerRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, quizAnswerRequest.creditQuizId);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getBgColor.IAuthTabCallback, quizAnswerRequest.answer);
        int i4 = onExtraCallback + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
