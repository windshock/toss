package viva.republica.toss.network.model.transfer.deposit;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.deposit.TransferHistoryRange$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferHistoryRange {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String endDate;
    private final String startDate;

    static {
        int i = onExtraCallbackWithResult + 23;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferHistoryRange)) {
            int i2 = onWarmupCompleted + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        TransferHistoryRange transferHistoryRange = (TransferHistoryRange) obj;
        if (!Intrinsics.areEqual(this.startDate, transferHistoryRange.startDate)) {
            int i4 = onWarmupCompleted + 29;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.endDate, transferHistoryRange.endDate)) {
            return true;
        }
        int i6 = IAuthTabCallback + 93;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.startDate.hashCode() * 31) + this.endDate.hashCode();
        int i4 = IAuthTabCallback + 69;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferHistoryRange(startDate=" + this.startDate + ", endDate=" + this.endDate + ")";
        int i2 = onWarmupCompleted + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferHistoryRange> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TransferHistoryRange$.serializer serializerVar = TransferHistoryRange$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ TransferHistoryRange(int i, String str, String str2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = IAuthTabCallback + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, TransferHistoryRange$.serializer.INSTANCE.getDescriptor());
            int i4 = IAuthTabCallback + 41;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.startDate = str;
        this.endDate = str2;
    }

    public TransferHistoryRange(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.startDate = str;
        this.endDate = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(TransferHistoryRange transferHistoryRange, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, transferHistoryRange.startDate);
        vylVar.onExtraCallback(serialDescriptor, 1, transferHistoryRange.endDate);
        int i4 = onWarmupCompleted + 69;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
