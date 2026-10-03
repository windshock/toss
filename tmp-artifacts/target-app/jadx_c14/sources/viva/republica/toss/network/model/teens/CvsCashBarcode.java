package viva.republica.toss.network.model.teens;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.teens.CvsCashBarcode$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CvsCashBarcode {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final long amount;
    private final String barcode;
    private final String expiredAt;
    private final String status;

    static {
        int i = onWarmupCompleted + 17;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CvsCashBarcode)) {
            int i2 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        CvsCashBarcode cvsCashBarcode = (CvsCashBarcode) obj;
        if (this.amount != cvsCashBarcode.amount || !Intrinsics.areEqual(this.barcode, cvsCashBarcode.barcode) || !Intrinsics.areEqual(this.expiredAt, cvsCashBarcode.expiredAt) || !Intrinsics.areEqual(this.status, cvsCashBarcode.status)) {
            return false;
        }
        int i4 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((Long.hashCode(this.amount) * 31) + this.barcode.hashCode()) * 31) + this.expiredAt.hashCode()) * 31) + this.status.hashCode();
        int i4 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CvsCashBarcode(amount=" + this.amount + ", barcode=" + this.barcode + ", expiredAt=" + this.expiredAt + ", status=" + this.status + ")";
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CvsCashBarcode> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                CvsCashBarcode$.serializer serializerVar = CvsCashBarcode$.serializer.INSTANCE;
                throw null;
            }
            CvsCashBarcode$.serializer serializerVar2 = CvsCashBarcode$.serializer.INSTANCE;
            int i3 = onWarmupCompleted + 87;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 40 / 0;
            }
            return serializerVar2;
        }
    }

    public /* synthetic */ CvsCashBarcode(int i, long j, String str, String str2, String str3, okycx okycxVar) {
        if (15 != (i & 15)) {
            int i2 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 15, CvsCashBarcode$.serializer.INSTANCE.getDescriptor());
            int i4 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.amount = j;
        this.barcode = str;
        this.expiredAt = str2;
        this.status = str3;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(CvsCashBarcode cvsCashBarcode, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, cvsCashBarcode.amount);
        vylVar.onExtraCallback(serialDescriptor, 1, cvsCashBarcode.barcode);
        vylVar.onExtraCallback(serialDescriptor, 2, cvsCashBarcode.expiredAt);
        vylVar.onExtraCallback(serialDescriptor, 3, cvsCashBarcode.status);
        int i4 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 99;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.barcode;
        int i5 = i2 + 117;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.expiredAt;
        int i4 = i3 + 39;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.status;
        int i5 = i3 + 115;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
