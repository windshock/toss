package viva.republica.toss.network.model.home;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import o.NativeRedBoxSpec;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RelatedTransactions {
    public static final int $stable = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final long totalUsedAmount;
    private final ArrayList<NativeRedBoxSpec> transactions;
    private final long usedCount;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedTransactions)) {
            return false;
        }
        RelatedTransactions relatedTransactions = (RelatedTransactions) obj;
        if (this.usedCount != relatedTransactions.usedCount) {
            int i5 = i3 + 71;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (this.totalUsedAmount != relatedTransactions.totalUsedAmount) {
            return false;
        }
        if (Intrinsics.areEqual(this.transactions, relatedTransactions.transactions)) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 25;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Long.hashCode(this.usedCount) * 31) + Long.hashCode(this.totalUsedAmount)) * 31) + this.transactions.hashCode();
        int i4 = onExtraCallback + 89;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RelatedTransactions(usedCount=" + this.usedCount + ", totalUsedAmount=" + this.totalUsedAmount + ", transactions=" + this.transactions + ")";
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 97;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.usedCount;
        int i5 = i2 + 73;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.totalUsedAmount;
        }
        int i3 = 80 / 0;
        return this.totalUsedAmount;
    }

    public final ArrayList<NativeRedBoxSpec> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ArrayList<NativeRedBoxSpec> arrayList = this.transactions;
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        return arrayList;
    }

    public final void IAuthTabCallback() {
        Iterator it;
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            it = this.transactions.iterator();
            int i3 = 96 / 0;
        } else {
            it = this.transactions.iterator();
        }
        while (it.hasNext()) {
            int i4 = onExtraCallback + 35;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            ((NativeRedBoxSpec) it.next()).access000();
        }
    }
}
