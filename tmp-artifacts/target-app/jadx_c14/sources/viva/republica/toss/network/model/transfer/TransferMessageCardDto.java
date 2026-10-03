package viva.republica.toss.network.model.transfer;

import im.toss.features.transfer.message_card.library.model.TransferMessageCard;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.htf31;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.TransferMessageCardDto$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferMessageCardDto {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String emoji;
    private final String message;
    private final String templateId;
    private final String type;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onWarmupCompleted + 89;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 75;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 29;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof TransferMessageCardDto)) {
            return false;
        }
        TransferMessageCardDto transferMessageCardDto = (TransferMessageCardDto) obj;
        if (!Intrinsics.areEqual(this.type, transferMessageCardDto.type)) {
            int i6 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.emoji, transferMessageCardDto.emoji)) {
            int i7 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.message, transferMessageCardDto.message))) {
            if (Intrinsics.areEqual(this.templateId, transferMessageCardDto.templateId)) {
                return true;
            }
            int i9 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        int i11 = onNavigationEvent + 71;
        int i12 = i11 % 128;
        onExtraCallbackWithResult = i12;
        int i13 = i11 % 2;
        int i14 = i12 + 27;
        onNavigationEvent = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 42 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.type.hashCode();
        String str = this.emoji;
        int iHashCode3 = 0;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.message;
        if (str2 == null) {
            int i4 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.templateId;
        if (str3 != null) {
            int i6 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = str3.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferMessageCardDto(type=" + this.type + ", emoji=" + this.emoji + ", message=" + this.message + ", templateId=" + this.templateId + ")";
        int i2 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ TransferMessageCardDto(int i, String str, String str2, String str3, String str4, okycx okycxVar) {
        if (1 != (i & 1)) {
            htf31.onExtraCallbackWithResult(i, 1, TransferMessageCardDto$.serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        Object obj = null;
        if ((i & 2) == 0) {
            this.emoji = null;
        } else {
            this.emoji = str2;
        }
        if ((i & 4) == 0) {
            this.message = null;
            int i2 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            this.message = str3;
        }
        if ((i & 8) == 0) {
            this.templateId = null;
            return;
        }
        this.templateId = str4;
        int i5 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public TransferMessageCardDto(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
        this.emoji = str2;
        this.message = str3;
        this.templateId = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.transfer.TransferMessageCardDto r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.TransferMessageCardDto.onNavigationEvent
            int r1 = r1 + 25
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.TransferMessageCardDto.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            java.lang.String r1 = r4.type
            r2 = 0
            r5.onExtraCallback(r6, r2, r1)
            r1 = 1
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 != 0) goto L26
            int r2 = viva.republica.toss.network.model.transfer.TransferMessageCardDto.onExtraCallbackWithResult
            int r2 = r2 + 87
            int r3 = r2 % 128
            viva.republica.toss.network.model.transfer.TransferMessageCardDto.onNavigationEvent = r3
            int r2 = r2 % r0
            java.lang.String r2 = r4.emoji
            if (r2 == 0) goto L36
        L26:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r4.emoji
            r5.onExtraCallbackWithResult(r6, r1, r2, r3)
            int r1 = viva.republica.toss.network.model.transfer.TransferMessageCardDto.onNavigationEvent
            int r1 = r1 + 71
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.TransferMessageCardDto.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
        L36:
            boolean r1 = r5.onWarmupCompleted(r6, r0)
            if (r1 != 0) goto L40
            java.lang.String r1 = r4.message
            if (r1 == 0) goto L47
        L40:
            o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r2 = r4.message
            r5.onExtraCallbackWithResult(r6, r0, r1, r2)
        L47:
            r1 = 3
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 != 0) goto L52
            java.lang.String r2 = r4.templateId
            if (r2 == 0) goto L62
        L52:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r4.templateId
            r5.onExtraCallbackWithResult(r6, r1, r2, r4)
            int r4 = viva.republica.toss.network.model.transfer.TransferMessageCardDto.onNavigationEvent
            int r4 = r4 + 23
            int r5 = r4 % 128
            viva.republica.toss.network.model.transfer.TransferMessageCardDto.onExtraCallbackWithResult = r5
            int r4 = r4 % r0
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferMessageCardDto.onWarmupCompleted(viva.republica.toss.network.model.transfer.TransferMessageCardDto, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TransferMessageCardDto(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            str2 = null;
        }
        str3 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            int i4 = onExtraCallbackWithResult + 17;
            int i5 = i4 % 128;
            onNavigationEvent = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 25;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
            str4 = null;
        }
        this(str, str2, str3, str4);
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferMessageCardDto> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                TransferMessageCardDto$.serializer serializerVar = TransferMessageCardDto$.serializer.INSTANCE;
                throw null;
            }
            TransferMessageCardDto$.serializer serializerVar2 = TransferMessageCardDto$.serializer.INSTANCE;
            int i3 = onExtraCallback + 7;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return serializerVar2;
            }
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final TransferMessageCardDto onExtraCallback(@Nullable TransferMessageCard transferMessageCard) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 83;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (transferMessageCard != null) {
                if (transferMessageCard instanceof TransferMessageCard.IAuthTabCallback) {
                    TransferMessageCard.IAuthTabCallback iAuthTabCallback = (TransferMessageCard.IAuthTabCallback) transferMessageCard;
                    return new TransferMessageCardDto(iAuthTabCallback.IAuthTabCallbackDefault(), (String) null, (String) null, iAuthTabCallback.IAuthTabCallback(), 6, (DefaultConstructorMarker) null);
                }
                if (!(transferMessageCard instanceof TransferMessageCard.onWarmupCompleted)) {
                    throw new NoWhenBranchMatchedException();
                }
                TransferMessageCard.onWarmupCompleted onwarmupcompleted = (TransferMessageCard.onWarmupCompleted) transferMessageCard;
                return new TransferMessageCardDto(onwarmupcompleted.IAuthTabCallbackStub(), onwarmupcompleted.IAuthTabCallback(), onwarmupcompleted.onNavigationEvent(), (String) null, 8, (DefaultConstructorMarker) null);
            }
            int i5 = i2 + 85;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i2 + 9;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 30 / 0;
            }
            return null;
        }
    }
}
