package im.toss.features.credit.data.response.kcbsurvey;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class KcbSurveyUrlResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String url;

    static {
        Object obj = null;
        int i = IAuthTabCallback + 125;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KcbSurveyUrlResponse() {
        String str = null;
        this(str, 1, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof KcbSurveyUrlResponse)) {
            int i4 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i4 % 128;
            return i4 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.url, ((KcbSurveyUrlResponse) obj).url)) {
            return true;
        }
        int i5 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.url.hashCode();
        int i4 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "KcbSurveyUrlResponse(url=" + this.url + ")";
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ KcbSurveyUrlResponse(int i, String str, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.url = "";
            int i2 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.url = str;
        int i4 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public KcbSurveyUrlResponse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(KcbSurveyUrlResponse kcbSurveyUrlResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.areEqual(kcbSurveyUrlResponse.url, "");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (Intrinsics.areEqual(kcbSurveyUrlResponse.url, "")) {
                return;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 0, kcbSurveyUrlResponse.url);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KcbSurveyUrlResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 91;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 111;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = "";
        }
        this(str);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.url;
        int i4 = i3 + 123;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return str;
    }
}
