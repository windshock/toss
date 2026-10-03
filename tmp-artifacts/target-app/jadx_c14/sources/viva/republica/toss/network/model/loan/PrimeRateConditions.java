package viva.republica.toss.network.model.loan;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PrimeRateConditions {
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String bottomSheetHeader;
    private final String bottomSheetMessage;
    private boolean isOn;
    private final String lowerText;
    private final float primeRate;
    private final String upperText;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = IAuthTabCallback + 15;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public PrimeRateConditions() {
        this((String) null, (String) null, false, (String) null, (String) null, 0.0f, 63, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrimeRateConditions)) {
            return false;
        }
        PrimeRateConditions primeRateConditions = (PrimeRateConditions) obj;
        if (!Intrinsics.areEqual(this.upperText, primeRateConditions.upperText)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.lowerText, primeRateConditions.lowerText)) {
            int i2 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 == 0;
        }
        if (this.isOn != primeRateConditions.isOn) {
            int i3 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.bottomSheetHeader, primeRateConditions.bottomSheetHeader) || !Intrinsics.areEqual(this.bottomSheetMessage, primeRateConditions.bottomSheetMessage)) {
            return false;
        }
        if (Float.compare(this.primeRate, primeRateConditions.primeRate) == 0) {
            return true;
        }
        int i5 = onExtraCallbackWithResult;
        int i6 = i5 + 27;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 11;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 62 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.upperText.hashCode() * 31) + this.lowerText.hashCode()) * 31) + Boolean.hashCode(this.isOn)) * 31) + this.bottomSheetHeader.hashCode()) * 31) + this.bottomSheetMessage.hashCode()) * 31) + Float.hashCode(this.primeRate);
        int i4 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PrimeRateConditions(upperText=" + this.upperText + ", lowerText=" + this.lowerText + ", isOn=" + this.isOn + ", bottomSheetHeader=" + this.bottomSheetHeader + ", bottomSheetMessage=" + this.bottomSheetMessage + ", primeRate=" + this.primeRate + ")";
        int i2 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PrimeRateConditions> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            PrimeRateConditions$$serializer primeRateConditions$$serializer = PrimeRateConditions$$serializer.INSTANCE;
            int i4 = onNavigationEvent + 41;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return primeRateConditions$$serializer;
        }
    }

    public /* synthetic */ PrimeRateConditions(int i, String str, String str2, boolean z, String str3, String str4, float f, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.upperText = "";
            int i2 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        } else {
            this.upperText = str;
        }
        if ((i & 2) == 0) {
            int i4 = onExtraCallbackWithResult + 15;
            int i5 = i4 % 128;
            onWarmupCompleted = i5;
            int i6 = i4 % 2;
            this.lowerText = "";
            if (i6 == 0) {
                throw null;
            }
            int i7 = i5 + 11;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        } else {
            this.lowerText = str2;
        }
        if ((i & 4) == 0) {
            int i10 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            this.isOn = false;
        } else {
            this.isOn = z;
        }
        if ((i & 8) == 0) {
            this.bottomSheetHeader = "";
        } else {
            this.bottomSheetHeader = str3;
        }
        int i12 = 2 % 2;
        if ((i & 16) == 0) {
            this.bottomSheetMessage = "";
        } else {
            this.bottomSheetMessage = str4;
        }
        if ((i & 32) == 0) {
            this.primeRate = 0.0f;
        } else {
            this.primeRate = f;
        }
    }

    public PrimeRateConditions(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.upperText = str;
        this.lowerText = str2;
        this.isOn = z;
        this.bottomSheetHeader = str3;
        this.bottomSheetMessage = str4;
        this.primeRate = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.loan.PrimeRateConditions r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.PrimeRateConditions.onWarmupCompleted
            int r1 = r1 + 45
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.PrimeRateConditions.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r1 = 0
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            java.lang.String r3 = ""
            if (r2 != 0) goto L1d
            java.lang.String r2 = r5.upperText
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L22
        L1d:
            java.lang.String r2 = r5.upperText
            r6.onExtraCallback(r7, r1, r2)
        L22:
            r1 = 1
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            if (r2 != 0) goto L31
            java.lang.String r2 = r5.lowerText
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L36
        L31:
            java.lang.String r2 = r5.lowerText
            r6.onExtraCallback(r7, r1, r2)
        L36:
            boolean r1 = r6.onWarmupCompleted(r7, r0)
            if (r1 != 0) goto L40
            boolean r1 = r5.isOn
            if (r1 == 0) goto L45
        L40:
            boolean r1 = r5.isOn
            r6.onNavigationEvent(r7, r0, r1)
        L45:
            r1 = 3
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            if (r2 != 0) goto L5d
            int r2 = viva.republica.toss.network.model.loan.PrimeRateConditions.onExtraCallbackWithResult
            int r2 = r2 + 73
            int r4 = r2 % 128
            viva.republica.toss.network.model.loan.PrimeRateConditions.onWarmupCompleted = r4
            int r2 = r2 % r0
            java.lang.String r2 = r5.bottomSheetHeader
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L62
        L5d:
            java.lang.String r2 = r5.bottomSheetHeader
            r6.onExtraCallback(r7, r1, r2)
        L62:
            r1 = 4
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            if (r2 != 0) goto L71
            java.lang.String r2 = r5.bottomSheetMessage
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L76
        L71:
            java.lang.String r2 = r5.bottomSheetMessage
            r6.onExtraCallback(r7, r1, r2)
        L76:
            r1 = 5
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            if (r2 != 0) goto L9a
            int r2 = viva.republica.toss.network.model.loan.PrimeRateConditions.onWarmupCompleted
            int r2 = r2 + 15
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.PrimeRateConditions.onExtraCallbackWithResult = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L92
            float r2 = r5.primeRate
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto La8
            goto L9a
        L92:
            float r2 = r5.primeRate
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto La8
        L9a:
            float r5 = r5.primeRate
            r6.onExtraCallback(r7, r1, r5)
            int r5 = viva.republica.toss.network.model.loan.PrimeRateConditions.onExtraCallbackWithResult
            int r5 = r5 + 55
            int r6 = r5 % 128
            viva.republica.toss.network.model.loan.PrimeRateConditions.onWarmupCompleted = r6
            int r5 = r5 % r0
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.PrimeRateConditions.IAuthTabCallback(viva.republica.toss.network.model.loan.PrimeRateConditions, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PrimeRateConditions(String str, String str2, boolean z, String str3, String str4, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        boolean z2 = false;
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 56 / 0;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            str5 = "";
        } else {
            str5 = str2;
        }
        if ((i & 4) != 0) {
            int i6 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
        } else {
            z2 = z;
        }
        String str6 = (i & 8) != 0 ? "" : str3;
        String str7 = (i & 16) == 0 ? str4 : "";
        if ((i & 32) != 0) {
            int i8 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 2;
            }
            f = 0.0f;
        }
        this(str, str5, z2, str6, str7, f);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.upperText;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.lowerText;
        }
        throw null;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isOn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 47;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.isOn = z;
        int i5 = i2 + 85;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 79;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bottomSheetHeader;
        int i5 = i2 + 1;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 45;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bottomSheetMessage;
        int i5 = i2 + 11;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 27;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        float f = this.primeRate;
        int i5 = i2 + 87;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }
}
