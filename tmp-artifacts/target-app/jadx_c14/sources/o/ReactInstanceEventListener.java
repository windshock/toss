package o;

import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactInstanceEventListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("accounts")
    private final List<ReactHostExternalSyntheticLambda0> accounts;

    @SerializedName("balance")
    private final long balance;

    @SerializedName("isCloseToLimit")
    private final boolean isCloseToLimit;

    @SerializedName("tossMoneyId")
    private final long tossMoneyId;

    @SerializedName("totalBalanceLimit")
    private final long totalBalanceLimit;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ReactInstanceEventListener)) {
            return false;
        }
        ReactInstanceEventListener reactInstanceEventListener = (ReactInstanceEventListener) obj;
        if (!Intrinsics.areEqual(this.accounts, reactInstanceEventListener.accounts)) {
            int i4 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.balance != reactInstanceEventListener.balance) {
            return false;
        }
        if (this.totalBalanceLimit != reactInstanceEventListener.totalBalanceLimit) {
            int i6 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.tossMoneyId != reactInstanceEventListener.tossMoneyId) {
            int i8 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (this.isCloseToLimit != reactInstanceEventListener.isCloseToLimit) {
            return false;
        }
        int i9 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        List<ReactHostExternalSyntheticLambda0> list = this.accounts;
        if (list == null) {
            int i3 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode = list.hashCode();
            int i5 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode;
        }
        return (((((((i * 31) + Long.hashCode(this.balance)) * 31) + Long.hashCode(this.totalBalanceLimit)) * 31) + Long.hashCode(this.tossMoneyId)) * 31) + Boolean.hashCode(this.isCloseToLimit);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensTossMoneyResponse(accounts=" + this.accounts + ", balance=" + this.balance + ", totalBalanceLimit=" + this.totalBalanceLimit + ", tossMoneyId=" + this.tossMoneyId + ", isCloseToLimit=" + this.isCloseToLimit + ")";
        int i2 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 27 / 0;
        }
        return str;
    }

    public final List<ReactHostExternalSyntheticLambda0> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        List<ReactHostExternalSyntheticLambda0> list = this.accounts;
        int i5 = i3 + 51;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        long j = this.balance;
        if (i4 != 0) {
            int i5 = 73 / 0;
        }
        int i6 = i3 + 53;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.totalBalanceLimit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 113;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.tossMoneyId;
        int i5 = i2 + 1;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 71;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isCloseToLimit;
        int i5 = i2 + 41;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean IAuthTabCallbackStub() {
        Long lValueOf;
        int i = 2 % 2;
        List<ReactHostExternalSyntheticLambda0> list = this.accounts;
        if (list != null) {
            Iterator<T> it = list.iterator();
            int i2 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            long jIAuthTabCallback = 0;
            while (it.hasNext()) {
                int i4 = IAuthTabCallback + 1;
                onExtraCallbackWithResult = i4 % 128;
                jIAuthTabCallback = i4 % 2 != 0 ? jIAuthTabCallback ^ ((ReactHostExternalSyntheticLambda0) it.next()).IAuthTabCallback() : jIAuthTabCallback + ((ReactHostExternalSyntheticLambda0) it.next()).IAuthTabCallback();
            }
            lValueOf = Long.valueOf(jIAuthTabCallback);
        } else {
            lValueOf = null;
        }
        if (!this.isCloseToLimit) {
            return false;
        }
        long j = this.totalBalanceLimit;
        if (lValueOf == null || lValueOf.longValue() != j) {
            return false;
        }
        int i5 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
