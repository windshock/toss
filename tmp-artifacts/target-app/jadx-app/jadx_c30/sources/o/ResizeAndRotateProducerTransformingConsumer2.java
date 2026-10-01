package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ResizeAndRotateProducerTransformingConsumer2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("approveAmount")
    private final Long approveAmount;

    @SerializedName("approveNum")
    private final String approveNum;

    @SerializedName("cancelAmount")
    private final Long cancelAmount;

    @SerializedName("diffAmount")
    private final Long diffAmount;

    @SerializedName("paymentMethod")
    private final String paymentMethod;

    public ResizeAndRotateProducerTransformingConsumer2() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 57;
        onExtraCallbackWithResult = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 99;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 88 / 0;
            }
            return true;
        }
        if (!(obj instanceof ResizeAndRotateProducerTransformingConsumer2)) {
            int i6 = i2 + 119;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        ResizeAndRotateProducerTransformingConsumer2 resizeAndRotateProducerTransformingConsumer2 = (ResizeAndRotateProducerTransformingConsumer2) obj;
        if (!Intrinsics.areEqual(this.approveAmount, resizeAndRotateProducerTransformingConsumer2.approveAmount)) {
            int i8 = onExtraCallbackWithResult;
            int i9 = i8 + 109;
            onWarmupCompleted = i9 % 128;
            boolean z = i9 % 2 == 0;
            int i10 = i8 + 85;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 != 0) {
                return z;
            }
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.approveNum, resizeAndRotateProducerTransformingConsumer2.approveNum)) {
            int i11 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.cancelAmount, resizeAndRotateProducerTransformingConsumer2.cancelAmount)) {
            int i13 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.diffAmount, resizeAndRotateProducerTransformingConsumer2.diffAmount)) {
            int i15 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.paymentMethod, resizeAndRotateProducerTransformingConsumer2.paymentMethod)) {
            return true;
        }
        int i17 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i17 % 128;
        return i17 % 2 != 0;
    }

    public int hashCode() {
        Long l;
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0 ? (l = this.approveAmount) != null : (l = this.approveAmount) != null) {
            iHashCode = l.hashCode();
            int i3 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        } else {
            iHashCode = 0;
        }
        int iHashCode2 = this.approveNum.hashCode();
        Long l2 = this.cancelAmount;
        int iHashCode3 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.diffAmount;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l3 != null ? l3.hashCode() : 0)) * 31) + this.paymentMethod.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccTransactionFullInfo(approveAmount=" + this.approveAmount + ", approveNum=" + this.approveNum + ", cancelAmount=" + this.cancelAmount + ", diffAmount=" + this.diffAmount + ", paymentMethod=" + this.paymentMethod + ")";
        int i2 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public ResizeAndRotateProducerTransformingConsumer2(@Nullable Long l, @NotNull String str, @Nullable Long l2, @Nullable Long l3, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.approveAmount = l;
        this.approveNum = str;
        this.cancelAmount = l2;
        this.diffAmount = l3;
        this.paymentMethod = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ResizeAndRotateProducerTransformingConsumer2(Long l, String str, Long l2, Long l3, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Long l4;
        Long l5;
        String str3;
        Long l6 = (i & 1) != 0 ? null : l;
        String str4 = (i & 2) != 0 ? BuildConfig.FLAVOR : str;
        if ((i & 4) != 0) {
            int i2 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            l4 = null;
        } else {
            l4 = l2;
        }
        if ((i & 8) != 0) {
            int i3 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            l5 = null;
        } else {
            l5 = l3;
        }
        if ((i & 16) != 0) {
            int i5 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            int i6 = 2 % 2;
            str3 = BuildConfig.FLAVOR;
        } else {
            str3 = str2;
        }
        this(l6, str4, l4, l5, str3);
    }
}
