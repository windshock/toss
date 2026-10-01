package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getInitialNumberFormatStyle {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final int transactionCount;
    private final String yearMonth;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 45;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 49;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof getInitialNumberFormatStyle)) {
            int i6 = IAuthTabCallback + 37;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        getInitialNumberFormatStyle getinitialnumberformatstyle = (getInitialNumberFormatStyle) obj;
        if (Intrinsics.areEqual(this.yearMonth, getinitialnumberformatstyle.yearMonth)) {
            return this.transactionCount == getinitialnumberformatstyle.transactionCount;
        }
        int i8 = IAuthTabCallback + 31;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 1 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.yearMonth.hashCode() * 31) + Integer.hashCode(this.transactionCount);
        int i4 = IAuthTabCallback + 97;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UpdateTransaction(yearMonth=" + this.yearMonth + ", transactionCount=" + this.transactionCount + ")";
        int i2 = IAuthTabCallback + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
