package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeI18nManagerSpec {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final long amount;
    private final String memo;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 31;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof NativeI18nManagerSpec)) {
            return false;
        }
        NativeI18nManagerSpec nativeI18nManagerSpec = (NativeI18nManagerSpec) obj;
        return this.amount == nativeI18nManagerSpec.amount && Intrinsics.areEqual(this.memo, nativeI18nManagerSpec.memo);
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Long.hashCode(this.amount);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = Long.hashCode(this.amount);
        String str = this.memo;
        int iHashCode2 = (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        int i3 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HenemBoxAmountRequest(amount=" + this.amount + ", memo=" + this.memo + ")";
        int i2 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public NativeI18nManagerSpec(long j, @Nullable String str) {
        this.amount = j;
        this.memo = str;
    }
}
