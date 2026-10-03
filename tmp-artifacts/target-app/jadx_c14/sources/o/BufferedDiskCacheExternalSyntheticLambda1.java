package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.AppliedLoan;
import viva.republica.toss.network.model.loan.LoanProductStatus;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BufferedDiskCacheExternalSyntheticLambda1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final int count;
    private final List<AppliedLoan> creditLoans;
    private final String subtitle;
    private final String title;

    public BufferedDiskCacheExternalSyntheticLambda1() {
        this(null, null, 0, null, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BufferedDiskCacheExternalSyntheticLambda1)) {
            int i2 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        BufferedDiskCacheExternalSyntheticLambda1 bufferedDiskCacheExternalSyntheticLambda1 = (BufferedDiskCacheExternalSyntheticLambda1) obj;
        if (!Intrinsics.areEqual(this.title, bufferedDiskCacheExternalSyntheticLambda1.title)) {
            int i4 = onExtraCallbackWithResult;
            int i5 = i4 + 107;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 75;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.subtitle, bufferedDiskCacheExternalSyntheticLambda1.subtitle)) {
            int i8 = onExtraCallbackWithResult + 11;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.count == bufferedDiskCacheExternalSyntheticLambda1.count) {
            return Intrinsics.areEqual(this.creditLoans, bufferedDiskCacheExternalSyntheticLambda1.creditLoans);
        }
        int i10 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.title.hashCode();
        return i3 == 0 ? (((((iHashCode >> 83) % this.subtitle.hashCode()) >> 6) + Integer.hashCode(this.count)) >> 33) - this.creditLoans.hashCode() : (((((iHashCode * 31) + this.subtitle.hashCode()) * 31) + Integer.hashCode(this.count)) * 31) + this.creditLoans.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppliedLoanInfo(title=" + this.title + ", subtitle=" + this.subtitle + ", count=" + this.count + ", creditLoans=" + this.creditLoans + ")";
        int i2 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public BufferedDiskCacheExternalSyntheticLambda1(@NotNull String str, @NotNull String str2, int i, @NotNull List<AppliedLoan> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.title = str;
        this.subtitle = str2;
        this.count = i;
        this.creditLoans = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BufferedDiskCacheExternalSyntheticLambda1(String str, String str2, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i2 & 1) != 0 ? "" : str;
        if ((i2 & 2) != 0) {
            int i3 = 2 % 2;
            str2 = "";
        }
        if ((i2 & 4) != 0) {
            int i4 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 5;
            } else {
                int i6 = 2 % 2;
            }
            i = 0;
        }
        if ((i2 & 8) != 0) {
            int i7 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                list = CollectionsKt.emptyList();
                int i8 = 14 / 0;
            } else {
                list = CollectionsKt.emptyList();
            }
            int i9 = 2 % 2;
        }
        this(str, str2, i, list);
    }

    public final String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            str = this.subtitle;
            int i4 = 9 / 0;
        } else {
            str = this.subtitle;
        }
        int i5 = i3 + 21;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.count;
        int i5 = i3 + 87;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final List<AppliedLoan> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.creditLoans;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AppliedLoan onExtraCallbackWithResult() {
        int i = 2 % 2;
        Iterator<T> it = this.creditLoans.iterator();
        Object obj = null;
        if (it.hasNext()) {
            Object next = it.next();
            Object obj2 = next;
            if (it.hasNext()) {
                String strIAuthTabCallbackStub = ((AppliedLoan) next).IAuthTabCallbackStub();
                if (strIAuthTabCallbackStub == null) {
                    int i2 = onWarmupCompleted + 21;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    strIAuthTabCallbackStub = "";
                }
                do {
                    Object next2 = it.next();
                    String strIAuthTabCallbackStub2 = ((AppliedLoan) next2).IAuthTabCallbackStub();
                    if (strIAuthTabCallbackStub2 == null) {
                        int i4 = onExtraCallbackWithResult + 43;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 != 0) {
                            throw null;
                        }
                        strIAuthTabCallbackStub2 = "";
                    }
                    next = next;
                    if (strIAuthTabCallbackStub.compareTo(strIAuthTabCallbackStub2) < 0) {
                        next = next2;
                        strIAuthTabCallbackStub = strIAuthTabCallbackStub2;
                    }
                } while (it.hasNext());
                int i5 = onExtraCallbackWithResult + 19;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                obj2 = next;
            }
            obj = obj2;
            int i7 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        return (AppliedLoan) obj;
    }

    public final List<AppliedLoan> onNavigationEvent() {
        int i = 2 % 2;
        List<AppliedLoan> list = this.creditLoans;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        int i2 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                ((AppliedLoan) it.next()).asBinder();
                LoanProductStatus loanProductStatus = LoanProductStatus.LOAN_APPLY;
                throw null;
            }
            Object next = it.next();
            if (((AppliedLoan) next).asBinder() == LoanProductStatus.LOAN_APPLY) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
