package viva.republica.toss.network.model.transfer;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.TransferClientLog$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferClientLog {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String authCompletedAt;
    private final String depositTargetInputMethod;
    private final String depositTargetType;
    private final boolean isFavoriteDepositTarget;
    private final String referrer;
    private final String sendCtaClickedAt;
    private final String sessionKey;
    private final String sessionKeyStartedAt;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallbackWithResult + 109;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public TransferClientLog() {
        this((String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 117;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 37;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 22 / 0;
            }
            return true;
        }
        if (!(obj instanceof TransferClientLog)) {
            int i8 = i2 + 97;
            int i9 = i8 % 128;
            onWarmupCompleted = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 5;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        TransferClientLog transferClientLog = (TransferClientLog) obj;
        if (!Intrinsics.areEqual(this.sendCtaClickedAt, transferClientLog.sendCtaClickedAt)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.authCompletedAt, transferClientLog.authCompletedAt)) {
            int i12 = onNavigationEvent + 99;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.depositTargetType, transferClientLog.depositTargetType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.depositTargetInputMethod, transferClientLog.depositTargetInputMethod)) {
            int i14 = onNavigationEvent + 49;
            onWarmupCompleted = i14 % 128;
            return i14 % 2 != 0;
        }
        if (this.isFavoriteDepositTarget != transferClientLog.isFavoriteDepositTarget || !Intrinsics.areEqual(this.sessionKey, transferClientLog.sessionKey)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.sessionKeyStartedAt, transferClientLog.sessionKeyStartedAt)) {
            int i15 = onWarmupCompleted + 103;
            onNavigationEvent = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.referrer, transferClientLog.referrer)) {
            return true;
        }
        int i17 = onWarmupCompleted + 67;
        onNavigationEvent = i17 % 128;
        int i18 = i17 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.sendCtaClickedAt;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.authCompletedAt;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.depositTargetType;
        if (str3 == null) {
            int i4 = onWarmupCompleted + 75;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
        }
        String str4 = this.depositTargetInputMethod;
        if (str4 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
            int i6 = onNavigationEvent + 111;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        int iHashCode5 = Boolean.hashCode(this.isFavoriteDepositTarget);
        String str5 = this.sessionKey;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.sessionKeyStartedAt;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.referrer;
        return (((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferClientLog(sendCtaClickedAt=" + this.sendCtaClickedAt + ", authCompletedAt=" + this.authCompletedAt + ", depositTargetType=" + this.depositTargetType + ", depositTargetInputMethod=" + this.depositTargetInputMethod + ", isFavoriteDepositTarget=" + this.isFavoriteDepositTarget + ", sessionKey=" + this.sessionKey + ", sessionKeyStartedAt=" + this.sessionKeyStartedAt + ", referrer=" + this.referrer + ")";
        int i2 = onNavigationEvent + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferClientLog> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return TransferClientLog$.serializer.INSTANCE;
            }
            int i3 = 2 / 0;
            return TransferClientLog$.serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransferClientLog(int i, String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.sendCtaClickedAt = null;
        } else {
            this.sendCtaClickedAt = str;
        }
        if ((i & 2) == 0) {
            this.authCompletedAt = null;
        } else {
            this.authCompletedAt = str2;
            int i2 = 2 % 2;
        }
        if ((i & 4) == 0) {
            int i3 = onNavigationEvent + 59;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            this.depositTargetType = null;
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.depositTargetType = str3;
            int i5 = 2 % 2;
        }
        if ((i & 8) == 0) {
            int i6 = onWarmupCompleted + 51;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            this.depositTargetInputMethod = null;
            if (i7 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.depositTargetInputMethod = str4;
        }
        if ((i & 16) == 0) {
            this.isFavoriteDepositTarget = false;
        } else {
            this.isFavoriteDepositTarget = z;
        }
        if ((i & 32) == 0) {
            int i8 = onWarmupCompleted + 51;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            this.sessionKey = null;
            if (i9 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.sessionKey = str5;
            int i10 = 2 % 2;
        }
        if ((i & 64) == 0) {
            this.sessionKeyStartedAt = null;
        } else {
            this.sessionKeyStartedAt = str6;
        }
        if ((i & 128) == 0) {
            this.referrer = null;
        } else {
            this.referrer = str7;
        }
    }

    public TransferClientLog(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.sendCtaClickedAt = str;
        this.authCompletedAt = str2;
        this.depositTargetType = str3;
        this.depositTargetInputMethod = str4;
        this.isFavoriteDepositTarget = z;
        this.sessionKey = str5;
        this.sessionKeyStartedAt = str6;
        this.referrer = str7;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.TransferClientLog r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            if (r2 != 0) goto Le
            java.lang.String r2 = r5.sendCtaClickedAt
            if (r2 == 0) goto L15
        Le:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r5.sendCtaClickedAt
            r6.onExtraCallbackWithResult(r7, r1, r2, r3)
        L15:
            r1 = 1
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            if (r2 != 0) goto L20
            java.lang.String r2 = r5.authCompletedAt
            if (r2 == 0) goto L27
        L20:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r5.authCompletedAt
            r6.onExtraCallbackWithResult(r7, r1, r2, r3)
        L27:
            boolean r2 = r6.onWarmupCompleted(r7, r0)
            if (r2 != 0) goto L31
            java.lang.String r2 = r5.depositTargetType
            if (r2 == 0) goto L38
        L31:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r5.depositTargetType
            r6.onExtraCallbackWithResult(r7, r0, r2, r3)
        L38:
            r2 = 3
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L43
            java.lang.String r3 = r5.depositTargetInputMethod
            if (r3 == 0) goto L4a
        L43:
            o.getWriggleLayout r3 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r5.depositTargetInputMethod
            r6.onExtraCallbackWithResult(r7, r2, r3, r4)
        L4a:
            r2 = 4
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L55
            boolean r3 = r5.isFavoriteDepositTarget
            if (r3 == 0) goto L5a
        L55:
            boolean r3 = r5.isFavoriteDepositTarget
            r6.onNavigationEvent(r7, r2, r3)
        L5a:
            r2 = 5
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L6e
            int r3 = viva.republica.toss.network.model.transfer.TransferClientLog.onNavigationEvent
            int r3 = r3 + 117
            int r4 = r3 % 128
            viva.republica.toss.network.model.transfer.TransferClientLog.onWarmupCompleted = r4
            int r3 = r3 % r0
            java.lang.String r3 = r5.sessionKey
            if (r3 == 0) goto L75
        L6e:
            o.getWriggleLayout r3 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r5.sessionKey
            r6.onExtraCallbackWithResult(r7, r2, r3, r4)
        L75:
            r2 = 6
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L89
            int r3 = viva.republica.toss.network.model.transfer.TransferClientLog.onNavigationEvent
            int r3 = r3 + 79
            int r4 = r3 % 128
            viva.republica.toss.network.model.transfer.TransferClientLog.onWarmupCompleted = r4
            int r3 = r3 % r0
            java.lang.String r3 = r5.sessionKeyStartedAt
            if (r3 == 0) goto L90
        L89:
            o.getWriggleLayout r3 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r5.sessionKeyStartedAt
            r6.onExtraCallbackWithResult(r7, r2, r3, r4)
        L90:
            r2 = 7
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            r1 = r1 ^ r3
            if (r1 == 0) goto L9c
            java.lang.String r1 = r5.referrer
            if (r1 == 0) goto Lac
        L9c:
            o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r5 = r5.referrer
            r6.onExtraCallbackWithResult(r7, r2, r1, r5)
            int r5 = viva.republica.toss.network.model.transfer.TransferClientLog.onWarmupCompleted
            int r5 = r5 + 69
            int r6 = r5 % 128
            viva.republica.toss.network.model.transfer.TransferClientLog.onNavigationEvent = r6
            int r5 = r5 % r0
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferClientLog.onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.TransferClientLog, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TransferClientLog(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str8;
        String str9;
        String str10;
        boolean z2;
        String str11;
        String str12;
        String str13 = null;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str8 = null;
        } else {
            str8 = str;
        }
        if ((i & 2) != 0) {
            int i3 = 2 % 2;
            str9 = null;
        } else {
            str9 = str2;
        }
        if ((i & 4) != 0) {
            int i4 = onNavigationEvent + 111;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str10 = null;
        } else {
            str10 = str3;
        }
        String str14 = (i & 8) != 0 ? null : str4;
        if ((i & 16) != 0) {
            int i7 = onWarmupCompleted + 117;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 32) != 0) {
            int i9 = onWarmupCompleted + 71;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            str11 = null;
        } else {
            str11 = str5;
        }
        if ((i & 64) != 0) {
            int i11 = onWarmupCompleted + 75;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 3 / 4;
            } else {
                int i13 = 2 % 2;
            }
            str12 = null;
        } else {
            str12 = str6;
        }
        if ((i & 128) != 0) {
            int i14 = onNavigationEvent + 105;
            onWarmupCompleted = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
            int i15 = 2 % 2;
        } else {
            str13 = str7;
        }
        this(str8, str9, str10, str14, z2, str11, str12, str13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TransferClientLog(Long l, Long l2, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = onWarmupCompleted + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 8) != 0) {
            int i5 = onWarmupCompleted + 59;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            map = null;
        }
        this(l, l2, str, map);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7 A[PHI: r13
      0x00b7: PHI (r13v10 java.lang.Object) = (r13v9 java.lang.Object), (r13v12 java.lang.Object) binds: [B:34:0x00b5, B:31:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TransferClientLog(@org.jetbrains.annotations.Nullable java.lang.Long r12, @org.jetbrains.annotations.Nullable java.lang.Long r13, @org.jetbrains.annotations.Nullable java.lang.String r14, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r15) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferClientLog.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.util.Map):void");
    }
}
