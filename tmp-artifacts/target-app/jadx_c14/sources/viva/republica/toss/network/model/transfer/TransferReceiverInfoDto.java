package viva.republica.toss.network.model.transfer;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.TransferReceiverInfoDto$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferReceiverInfoDto {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final boolean maskRealName;
    private final String receiverNameOnContact;
    private final String receiverRealName;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallback + 29;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 53;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 57;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i4 + 35;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof TransferReceiverInfoDto)) {
            return false;
        }
        TransferReceiverInfoDto transferReceiverInfoDto = (TransferReceiverInfoDto) obj;
        if (this.maskRealName != transferReceiverInfoDto.maskRealName) {
            int i9 = i2 + 31;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.receiverRealName, transferReceiverInfoDto.receiverRealName)) {
            return false;
        }
        if (Intrinsics.areEqual(this.receiverNameOnContact, transferReceiverInfoDto.receiverNameOnContact)) {
            return true;
        }
        int i11 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = Boolean.hashCode(this.maskRealName);
        int iHashCode2 = this.receiverRealName.hashCode();
        String str = this.receiverNameOnContact;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode3 = str.hashCode();
            int i5 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode3;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferReceiverInfoDto(maskRealName=" + this.maskRealName + ", receiverRealName=" + this.receiverRealName + ", receiverNameOnContact=" + this.receiverNameOnContact + ")";
        int i2 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferReceiverInfoDto> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            TransferReceiverInfoDto$.serializer serializerVar = TransferReceiverInfoDto$.serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 92 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ TransferReceiverInfoDto(int i, boolean z, String str, String str2, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, TransferReceiverInfoDto$.serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.maskRealName = z;
        this.receiverRealName = str;
        this.receiverNameOnContact = str2;
    }

    public TransferReceiverInfoDto(boolean z, @NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maskRealName = z;
        this.receiverRealName = str;
        this.receiverNameOnContact = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(TransferReceiverInfoDto transferReceiverInfoDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, transferReceiverInfoDto.maskRealName);
        vylVar.onExtraCallback(serialDescriptor, 1, transferReceiverInfoDto.receiverRealName);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, transferReceiverInfoDto.receiverNameOnContact);
        int i4 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
