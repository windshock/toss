package viva.republica.toss.network.model.transfer;

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
import viva.republica.toss.network.model.transfer.TransferSummaryDto$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferSummaryDto {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String depositSummary;

    static {
        int i = onNavigationEvent + 1;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 75 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 95;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            if (obj instanceof TransferSummaryDto) {
                return Intrinsics.areEqual(this.depositSummary, ((TransferSummaryDto) obj).depositSummary);
            }
            int i4 = i2 + 15;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = i2 + 17;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i2 + 7;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.depositSummary.hashCode();
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferSummaryDto(depositSummary=" + this.depositSummary + ")";
        int i2 = IAuthTabCallback + 73;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferSummaryDto> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            TransferSummaryDto$.serializer serializerVar = TransferSummaryDto$.serializer.INSTANCE;
            int i4 = onExtraCallback + 1;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ TransferSummaryDto(int i, String str, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 1;
        if (1 != (i & 1)) {
            int i3 = IAuthTabCallback + 103;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = TransferSummaryDto$.serializer.INSTANCE.getDescriptor();
                i2 = 0;
            } else {
                descriptor = TransferSummaryDto$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.depositSummary = str;
    }

    public TransferSummaryDto(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.depositSummary = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(TransferSummaryDto transferSummaryDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallback = i2 % 128;
        vylVar.onExtraCallback(serialDescriptor, i2 % 2 == 0 ? 1 : 0, transferSummaryDto.depositSummary);
    }
}
