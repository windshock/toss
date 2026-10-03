package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getJavaScriptContext {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("remainingTimeDay")
    private final long remainingTimeDay;

    @SerializedName("remainingTimeHour")
    private final long remainingTimeHour;

    @SerializedName("remainingTimeMinute")
    private final long remainingTimeMinute;

    @SerializedName("remainingTimeSecond")
    private final long remainingTimeSecond;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getJavaScriptContext)) {
            int i2 = onWarmupCompleted + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        getJavaScriptContext getjavascriptcontext = (getJavaScriptContext) obj;
        if (this.remainingTimeDay != getjavascriptcontext.remainingTimeDay) {
            int i4 = IAuthTabCallback + 91;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.remainingTimeHour != getjavascriptcontext.remainingTimeHour || this.remainingTimeMinute != getjavascriptcontext.remainingTimeMinute) {
            return false;
        }
        if (this.remainingTimeSecond == getjavascriptcontext.remainingTimeSecond) {
            return true;
        }
        int i6 = IAuthTabCallback + 5;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((Long.hashCode(this.remainingTimeDay) * 31) + Long.hashCode(this.remainingTimeHour)) * 31) + Long.hashCode(this.remainingTimeMinute)) * 31) + Long.hashCode(this.remainingTimeSecond);
        int i4 = onWarmupCompleted + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuestGuardianCertifyRemainTimeResponse(remainingTimeDay=" + this.remainingTimeDay + ", remainingTimeHour=" + this.remainingTimeHour + ", remainingTimeMinute=" + this.remainingTimeMinute + ", remainingTimeSecond=" + this.remainingTimeSecond + ")";
        int i2 = onWarmupCompleted + 67;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 83 / 0;
        }
        return str;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        long j = this.remainingTimeDay;
        int i5 = i3 + 107;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.remainingTimeHour;
        }
        int i3 = 16 / 0;
        return this.remainingTimeHour;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.remainingTimeMinute;
        }
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        long j = this.remainingTimeSecond;
        int i5 = i3 + 35;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
