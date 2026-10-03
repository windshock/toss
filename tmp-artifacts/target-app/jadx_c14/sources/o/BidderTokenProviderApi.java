package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BidderTokenProviderApi {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("subscriptions")
    private final List<isUnity> subscriptions;

    /* JADX WARN: Illegal instructions before constructor call */
    public BidderTokenProviderApi() {
        List list = null;
        this(list, 1, list);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BidderTokenProviderApi)) {
            int i2 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.subscriptions, ((BidderTokenProviderApi) obj).subscriptions)) {
            return true;
        }
        int i4 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<isUnity> list = this.subscriptions;
        if (list == null) {
            int i4 = i3 + 91;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return 0;
            }
            throw null;
        }
        int iHashCode = list.hashCode();
        int i5 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardNotificationSetReq(subscriptions=" + this.subscriptions + ")";
        int i2 = onExtraCallbackWithResult + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public BidderTokenProviderApi(@Nullable List<isUnity> list) {
        this.subscriptions = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BidderTokenProviderApi(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i3 = 2 % 2;
            list = null;
        }
        this(list);
    }
}
