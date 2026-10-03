package viva.republica.toss.network.model.electronicdocument.wallet;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocPrintSchemeResp$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EDocPrintSchemeResp {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final EDocDialog dialogue;
    private final String scheme;

    static {
        int i = IAuthTabCallback + 45;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EDocPrintSchemeResp() {
        this((String) null, (EDocDialog) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 63;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EDocPrintSchemeResp)) {
            int i5 = i2 + 81;
            onExtraCallbackWithResult = i5 % 128;
            return i5 % 2 != 0;
        }
        EDocPrintSchemeResp eDocPrintSchemeResp = (EDocPrintSchemeResp) obj;
        if (!Intrinsics.areEqual(this.scheme, eDocPrintSchemeResp.scheme)) {
            int i6 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.dialogue, eDocPrintSchemeResp.dialogue)) {
            return true;
        }
        int i8 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 57 / 0;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[PHI: r1 r3
      0x0035: PHI (r1v10 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r3v6 viva.republica.toss.network.model.electronicdocument.wallet.EDocDialog) = 
      (r3v0 viva.republica.toss.network.model.electronicdocument.wallet.EDocDialog)
      (r3v7 viva.republica.toss.network.model.electronicdocument.wallet.EDocDialog)
     binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
      0x0027: PHI (r1v6 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.EDocPrintSchemeResp.onWarmupCompleted
            int r1 = r1 + 53
            int r2 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocPrintSchemeResp.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1d
            java.lang.String r1 = r5.scheme
            int r1 = r1.hashCode()
            viva.republica.toss.network.model.electronicdocument.wallet.EDocDialog r3 = r5.dialogue
            r4 = 98
            int r4 = r4 / r2
            if (r3 != 0) goto L35
            goto L27
        L1d:
            java.lang.String r1 = r5.scheme
            int r1 = r1.hashCode()
            viva.republica.toss.network.model.electronicdocument.wallet.EDocDialog r3 = r5.dialogue
            if (r3 != 0) goto L35
        L27:
            int r3 = viva.republica.toss.network.model.electronicdocument.wallet.EDocPrintSchemeResp.onWarmupCompleted
            int r3 = r3 + 107
            int r4 = r3 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocPrintSchemeResp.onExtraCallbackWithResult = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L39
            r3 = 4
            int r3 = r3 % r0
            goto L39
        L35:
            int r2 = r3.hashCode()
        L39:
            int r1 = r1 * 31
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.EDocPrintSchemeResp.hashCode():int");
    }

    public final EDocDialog onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        EDocDialog eDocDialog = this.dialogue;
        int i5 = i3 + 91;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return eDocDialog;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 57;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.scheme;
        int i5 = i2 + 39;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EDocPrintSchemeResp(scheme=" + this.scheme + ", dialogue=" + this.dialogue + ")";
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EDocPrintSchemeResp> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                EDocPrintSchemeResp$.serializer serializerVar = EDocPrintSchemeResp$.serializer.INSTANCE;
                throw null;
            }
            EDocPrintSchemeResp$.serializer serializerVar2 = EDocPrintSchemeResp$.serializer.INSTANCE;
            int i3 = onExtraCallback + 31;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return serializerVar2;
        }
    }

    public /* synthetic */ EDocPrintSchemeResp(int i, String str, EDocDialog eDocDialog, okycx okycxVar) {
        if ((i & 1) == 0) {
            str = "";
            int i2 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        this.scheme = str;
        if ((i & 2) != 0) {
            this.dialogue = eDocDialog;
            return;
        }
        int i4 = onWarmupCompleted;
        int i5 = i4 + 97;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        this.dialogue = null;
        if (i6 != 0) {
            throw null;
        }
        int i7 = i4 + 117;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public EDocPrintSchemeResp(@NotNull String str, @Nullable EDocDialog eDocDialog) {
        Intrinsics.checkNotNullParameter(str, "");
        this.scheme = str;
        this.dialogue = eDocDialog;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(EDocPrintSchemeResp eDocPrintSchemeResp, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(eDocPrintSchemeResp.scheme, "")) {
            vylVar.onExtraCallback(serialDescriptor, 0, eDocPrintSchemeResp.scheme);
            int i4 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || eDocPrintSchemeResp.dialogue != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, EDocDialog$$serializer.INSTANCE, eDocPrintSchemeResp.dialogue);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EDocPrintSchemeResp(String str, EDocDialog eDocDialog, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 99;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 85;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 % 2;
            } else {
                int i7 = 2 % 2;
            }
            str = "";
        }
        this(str, (i & 2) != 0 ? null : eDocDialog);
    }
}
