package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactInstanceManager {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("logs")
    private final List<ReactInstanceManagerReactInstanceEventListener> transactionLogs;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 23;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 1;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (obj instanceof ReactInstanceManager) {
            return !(Intrinsics.areEqual(this.transactionLogs, ((ReactInstanceManager) obj).transactionLogs) ^ true);
        }
        int i6 = i2 + 45;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.transactionLogs.hashCode();
        int i4 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensTransportationCardTransactionLogReq(transactionLogs=" + this.transactionLogs + ")";
        int i2 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ReactInstanceManager(@NotNull List<ReactInstanceManagerReactInstanceEventListener> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.transactionLogs = list;
    }

    public final List<ReactInstanceManagerReactInstanceEventListener> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.transactionLogs;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
