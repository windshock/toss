package viva.republica.toss.network.model.transfer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.htf31;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.TransferInputLimitResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferInputLimitResponse {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String amountSuggestionMessage;
    private final long inputLimit;
    private final PreSendAlert overLimitDisplayInfo;
    private final String overLimitLogType;
    private final String overLimitMessage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    static {
        int i = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 71 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r10 instanceof viva.republica.toss.network.model.transfer.TransferInputLimitResponse) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 73;
        viva.republica.toss.network.model.transfer.TransferInputLimitResponse.onExtraCallback = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r10 = (viva.republica.toss.network.model.transfer.TransferInputLimitResponse) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r9.inputLimit == r10.inputLimit) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        r2 = r2 + 13;
        viva.republica.toss.network.model.transfer.TransferInputLimitResponse.onExtraCallback = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.overLimitMessage, r10.overLimitMessage) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.overLimitDisplayInfo, r10.overLimitDisplayInfo) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        r10 = viva.republica.toss.network.model.transfer.TransferInputLimitResponse.IAuthTabCallback + 71;
        viva.republica.toss.network.model.transfer.TransferInputLimitResponse.onExtraCallback = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.overLimitLogType, r10.overLimitLogType) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.amountSuggestionMessage, r10.amountSuggestionMessage) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r9 == r10) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r9 == r10) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.TransferInputLimitResponse.onExtraCallback
            int r1 = r1 + 27
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.TransferInputLimitResponse.IAuthTabCallback = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L16
            r1 = 73
            int r1 = r1 / r4
            if (r9 != r10) goto L19
            goto L18
        L16:
            if (r9 != r10) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r10 instanceof viva.republica.toss.network.model.transfer.TransferInputLimitResponse
            if (r1 != 0) goto L25
            int r2 = r2 + 73
            int r10 = r2 % 128
            viva.republica.toss.network.model.transfer.TransferInputLimitResponse.onExtraCallback = r10
            int r2 = r2 % r0
            return r4
        L25:
            viva.republica.toss.network.model.transfer.TransferInputLimitResponse r10 = (viva.republica.toss.network.model.transfer.TransferInputLimitResponse) r10
            long r5 = r9.inputLimit
            long r7 = r10.inputLimit
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L37
            int r2 = r2 + 13
            int r10 = r2 % 128
            viva.republica.toss.network.model.transfer.TransferInputLimitResponse.onExtraCallback = r10
            int r2 = r2 % r0
            return r4
        L37:
            java.lang.String r1 = r9.overLimitMessage
            java.lang.String r2 = r10.overLimitMessage
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L42
            return r4
        L42:
            viva.republica.toss.network.model.transfer.PreSendAlert r1 = r9.overLimitDisplayInfo
            viva.republica.toss.network.model.transfer.PreSendAlert r2 = r10.overLimitDisplayInfo
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L56
            int r10 = viva.republica.toss.network.model.transfer.TransferInputLimitResponse.IAuthTabCallback
            int r10 = r10 + 71
            int r1 = r10 % 128
            viva.republica.toss.network.model.transfer.TransferInputLimitResponse.onExtraCallback = r1
            int r10 = r10 % r0
            return r4
        L56:
            java.lang.String r0 = r9.overLimitLogType
            java.lang.String r1 = r10.overLimitLogType
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L61
            return r4
        L61:
            java.lang.String r0 = r9.amountSuggestionMessage
            java.lang.String r10 = r10.amountSuggestionMessage
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r10)
            if (r10 == 0) goto L6c
            return r3
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferInputLimitResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Long.hashCode(this.inputLimit);
        int iHashCode3 = this.overLimitMessage.hashCode();
        PreSendAlert preSendAlert = this.overLimitDisplayInfo;
        int iHashCode4 = 0;
        if (preSendAlert == null) {
            int i2 = onExtraCallback + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = preSendAlert.hashCode();
        }
        int iHashCode5 = this.overLimitLogType.hashCode();
        String str = this.amountSuggestionMessage;
        if (str != null) {
            int i4 = onExtraCallback + 23;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode4 = str.hashCode();
            int i6 = onExtraCallback + 27;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferInputLimitResponse(inputLimit=" + this.inputLimit + ", overLimitMessage=" + this.overLimitMessage + ", overLimitDisplayInfo=" + this.overLimitDisplayInfo + ", overLimitLogType=" + this.overLimitLogType + ", amountSuggestionMessage=" + this.amountSuggestionMessage + ")";
        int i2 = onExtraCallback + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 0;
        }
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

        public final KSerializer<TransferInputLimitResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            TransferInputLimitResponse$.serializer serializerVar = TransferInputLimitResponse$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ TransferInputLimitResponse(int i, long j, String str, PreSendAlert preSendAlert, String str2, String str3, okycx okycxVar) {
        if (3 != (i & 3)) {
            htf31.onExtraCallbackWithResult(i, 3, TransferInputLimitResponse$.serializer.INSTANCE.getDescriptor());
            int i2 = IAuthTabCallback + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.inputLimit = j;
        this.overLimitMessage = str;
        Object obj = null;
        if ((i & 4) == 0) {
            this.overLimitDisplayInfo = null;
        } else {
            this.overLimitDisplayInfo = preSendAlert;
            int i5 = 2 % 2;
        }
        if ((i & 8) == 0) {
            int i6 = IAuthTabCallback + 19;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            this.overLimitLogType = "";
            if (i7 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.overLimitLogType = str2;
        }
        if ((i & 16) == 0) {
            this.amountSuggestionMessage = null;
        } else {
            this.amountSuggestionMessage = str3;
        }
    }

    public TransferInputLimitResponse(long j, @NotNull String str, @Nullable PreSendAlert preSendAlert, @NotNull String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.inputLimit = j;
        this.overLimitMessage = str;
        this.overLimitDisplayInfo = preSendAlert;
        this.overLimitLogType = str2;
        this.amountSuggestionMessage = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.transfer.TransferInputLimitResponse r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            long r2 = r4.inputLimit
            r5.onExtraCallback(r6, r1, r2)
            java.lang.String r1 = r4.overLimitMessage
            r2 = 1
            r5.onExtraCallback(r6, r2, r1)
            boolean r1 = r5.onWarmupCompleted(r6, r0)
            r1 = r1 ^ r2
            if (r1 == 0) goto L1a
            viva.republica.toss.network.model.transfer.PreSendAlert r1 = r4.overLimitDisplayInfo
            if (r1 == 0) goto L21
        L1a:
            o.onHostResume r1 = o.onHostResume.INSTANCE
            viva.republica.toss.network.model.transfer.PreSendAlert r2 = r4.overLimitDisplayInfo
            r5.onExtraCallbackWithResult(r6, r0, r1, r2)
        L21:
            r1 = 3
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 != 0) goto L3b
            int r2 = viva.republica.toss.network.model.transfer.TransferInputLimitResponse.IAuthTabCallback
            int r2 = r2 + 13
            int r3 = r2 % 128
            viva.republica.toss.network.model.transfer.TransferInputLimitResponse.onExtraCallback = r3
            int r2 = r2 % r0
            java.lang.String r2 = r4.overLimitLogType
            java.lang.String r3 = ""
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L40
        L3b:
            java.lang.String r2 = r4.overLimitLogType
            r5.onExtraCallback(r6, r1, r2)
        L40:
            r1 = 4
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 == 0) goto L48
            goto L55
        L48:
            int r2 = viva.republica.toss.network.model.transfer.TransferInputLimitResponse.onExtraCallback
            int r2 = r2 + 103
            int r3 = r2 % 128
            viva.republica.toss.network.model.transfer.TransferInputLimitResponse.IAuthTabCallback = r3
            int r2 = r2 % r0
            java.lang.String r0 = r4.amountSuggestionMessage
            if (r0 == 0) goto L5c
        L55:
            o.getWriggleLayout r0 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r4.amountSuggestionMessage
            r5.onExtraCallbackWithResult(r6, r1, r0, r4)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferInputLimitResponse.IAuthTabCallback(viva.republica.toss.network.model.transfer.TransferInputLimitResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TransferInputLimitResponse(long j, String str, PreSendAlert preSendAlert, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        String str5;
        PreSendAlert preSendAlert2 = (i & 4) != 0 ? null : preSendAlert;
        if ((i & 8) != 0) {
            int i2 = IAuthTabCallback + 75;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                int i4 = 21 / 0;
            }
            int i5 = i3 + 73;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 5;
            } else {
                int i7 = 2 % 2;
            }
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 16) != 0) {
            int i8 = IAuthTabCallback + 13;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str5 = null;
        } else {
            str5 = str3;
        }
        this(j, str, preSendAlert2, str4, str5);
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        long j = this.inputLimit;
        int i5 = i3 + 59;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.overLimitMessage;
        int i5 = i3 + 47;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final PreSendAlert onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.overLimitDisplayInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.overLimitLogType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 109;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amountSuggestionMessage;
        int i5 = i2 + 19;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
