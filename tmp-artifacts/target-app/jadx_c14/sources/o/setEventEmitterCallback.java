package o;

import com.google.gson.annotations.SerializedName;
import im.toss.features.verify.model.RealNameVerifyMethod;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setEventEmitterCallback {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("sessionId")
    private final long sessionId;

    @SerializedName("verifyId")
    private final Long verifyId;

    @SerializedName("verifyType")
    private final RealNameVerifyMethod verifyType;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setEventEmitterCallback)) {
            int i2 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        setEventEmitterCallback seteventemittercallback = (setEventEmitterCallback) obj;
        if (this.sessionId != seteventemittercallback.sessionId) {
            return false;
        }
        if (!Intrinsics.areEqual(this.verifyId, seteventemittercallback.verifyId)) {
            int i4 = onExtraCallbackWithResult + 19;
            onNavigationEvent = i4 % 128;
            return i4 % 2 == 0;
        }
        if (this.verifyType == seteventemittercallback.verifyType) {
            int i5 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Long.hashCode(this.sessionId);
        Long l = this.verifyId;
        if (l == null) {
            int i4 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
        }
        int iHashCode3 = (((iHashCode2 * 31) + iHashCode) * 31) + this.verifyType.hashCode();
        int i6 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AddRealNameVerifyRequest(sessionId=" + this.sessionId + ", verifyId=" + this.verifyId + ", verifyType=" + this.verifyType + ")";
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public setEventEmitterCallback(long j, @Nullable Long l, @NotNull RealNameVerifyMethod realNameVerifyMethod) {
        Intrinsics.checkNotNullParameter(realNameVerifyMethod, "");
        this.sessionId = j;
        this.verifyId = l;
        this.verifyType = realNameVerifyMethod;
    }
}
