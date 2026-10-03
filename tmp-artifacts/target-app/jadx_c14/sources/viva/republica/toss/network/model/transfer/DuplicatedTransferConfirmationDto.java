package viva.republica.toss.network.model.transfer;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.DuplicatedTransferConfirmationDto$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DuplicatedTransferConfirmationDto {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final boolean confirmed;

    static {
        int i = onExtraCallbackWithResult + 83;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            return (obj instanceof DuplicatedTransferConfirmationDto) && this.confirmed == ((DuplicatedTransferConfirmationDto) obj).confirmed;
        }
        int i5 = i3 + 123;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.confirmed);
        int i4 = onExtraCallback + 5;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DuplicatedTransferConfirmationDto(confirmed=" + this.confirmed + ")";
        int i2 = onExtraCallback + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DuplicatedTransferConfirmationDto> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            DuplicatedTransferConfirmationDto$.serializer serializerVar = DuplicatedTransferConfirmationDto$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 27;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ DuplicatedTransferConfirmationDto(int i, boolean z, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallback + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, DuplicatedTransferConfirmationDto$.serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 9;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.confirmed = z;
    }

    public DuplicatedTransferConfirmationDto(boolean z) {
        this.confirmed = z;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(DuplicatedTransferConfirmationDto duplicatedTransferConfirmationDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, duplicatedTransferConfirmationDto.confirmed);
        int i4 = onWarmupCompleted + 121;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
