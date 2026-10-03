package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class attachAdComponentViewApi {
    public static final int $stable = 8;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("message")
    private final String message;

    @SerializedName("subscriptions")
    private final List<VideoStartReason> subscriptions;

    @SerializedName("success")
    private final Boolean success;

    public attachAdComponentViewApi() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 37;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof attachAdComponentViewApi)) {
            return false;
        }
        attachAdComponentViewApi attachadcomponentviewapi = (attachAdComponentViewApi) obj;
        if (!Intrinsics.areEqual(this.success, attachadcomponentviewapi.success)) {
            int i3 = onWarmupCompleted + 107;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.message, attachadcomponentviewapi.message)) {
            int i5 = onWarmupCompleted + 7;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.subscriptions, attachadcomponentviewapi.subscriptions))) {
            int i7 = onNavigationEvent + 23;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        int i9 = onNavigationEvent + 57;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        Boolean bool;
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0 ? (bool = this.success) != null : (bool = this.success) != null) {
            iHashCode = bool.hashCode();
            int i3 = onWarmupCompleted + 35;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        } else {
            iHashCode = 0;
        }
        String str = this.message;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List<VideoStartReason> list = this.subscriptions;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountNotificationSetResp(success=" + this.success + ", message=" + this.message + ", subscriptions=" + this.subscriptions + ")";
        int i2 = onNavigationEvent + 47;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public attachAdComponentViewApi(@Nullable Boolean bool, @Nullable String str, @Nullable List<VideoStartReason> list) {
        this.success = bool;
        this.message = str;
        this.subscriptions = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ attachAdComponentViewApi(Boolean bool, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            bool = null;
        }
        str = (i & 2) != 0 ? null : str;
        if ((i & 4) != 0) {
            int i3 = onNavigationEvent;
            int i4 = i3 + 9;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 41;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
            list = null;
        }
        this(bool, str, list);
    }

    public final Boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Boolean bool = this.success;
        int i4 = i3 + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.message;
        int i5 = i2 + 89;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final List<VideoStartReason> onExtraCallbackWithResult() {
        List<VideoStartReason> list;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            list = this.subscriptions;
            int i4 = 54 / 0;
        } else {
            list = this.subscriptions;
        }
        int i5 = i3 + 77;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
