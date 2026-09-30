package im.toss.features.credit.data.response.kcbsurvey;

import im.toss.features.credit.data.response.DisclaimerV2;
import im.toss.features.credit.data.response.DisclaimerV2$$serializer;
import im.toss.features.credit.data.response.kcbsurvey.KcbSurveyIntroResponse$;
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
public final class KcbSurveyIntroResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final DisclaimerV2 disclaimer;

    static {
        int i = onWarmupCompleted + 105;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 87 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof KcbSurveyIntroResponse) {
            if (!(!Intrinsics.areEqual(this.disclaimer, ((KcbSurveyIntroResponse) obj).disclaimer))) {
                return true;
            }
            int i2 = IAuthTabCallback + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onExtraCallbackWithResult;
        int i5 = i4 + 75;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 115;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        DisclaimerV2 disclaimerV2 = this.disclaimer;
        if (disclaimerV2 == null) {
            int i2 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return 0;
            }
            throw null;
        }
        int iHashCode = disclaimerV2.hashCode();
        int i3 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "KcbSurveyIntroResponse(disclaimer=" + this.disclaimer + ")";
        int i2 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ KcbSurveyIntroResponse(int i, DisclaimerV2 disclaimerV2, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, KcbSurveyIntroResponse$.serializer.INSTANCE.getDescriptor());
            int i4 = 2 % 2;
        }
        this.disclaimer = disclaimerV2;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(KcbSurveyIntroResponse kcbSurveyIntroResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, DisclaimerV2$$serializer.INSTANCE, kcbSurveyIntroResponse.disclaimer);
        int i4 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final DisclaimerV2 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 121;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        DisclaimerV2 disclaimerV2 = this.disclaimer;
        int i5 = i2 + 101;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return disclaimerV2;
    }
}
