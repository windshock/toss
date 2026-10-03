package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class VideoAutoplayBehavior {
    public static final int $stable = 8;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("accounts")
    private final List<VideoStartReason> accounts;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 29;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 119;
            onExtraCallback = i6 % 128;
            return i6 % 2 == 0;
        }
        if (obj instanceof VideoAutoplayBehavior) {
            return Intrinsics.areEqual(this.accounts, ((VideoAutoplayBehavior) obj).accounts);
        }
        int i7 = i2 + 103;
        onExtraCallbackWithResult = i7 % 128;
        return i7 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.accounts.hashCode();
            throw null;
        }
        int iHashCode = this.accounts.hashCode();
        int i3 = onExtraCallbackWithResult + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountNotificationSetReq(accounts=" + this.accounts + ")";
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public VideoAutoplayBehavior(@NotNull List<VideoStartReason> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.accounts = list;
    }
}
