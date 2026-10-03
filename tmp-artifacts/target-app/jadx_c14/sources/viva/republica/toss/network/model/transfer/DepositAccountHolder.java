package viva.republica.toss.network.model.transfer;

import com.google.gson.annotations.SerializedName;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.DepositAccountHolder$;
import viva.republica.toss.network.model.transfer.TransferProvider;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DepositAccountHolder {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("name")
    private final String name;

    @SerializedName("transferProvider")
    private final TransferProvider transferProvider;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.DepositAccountHolder$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                DepositAccountHolder.onWarmupCompleted();
                throw null;
            }
            KSerializer kSerializerOnWarmupCompleted = DepositAccountHolder.onWarmupCompleted();
            int i3 = IAuthTabCallback + 5;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return kSerializerOnWarmupCompleted;
            }
            obj.hashCode();
            throw null;
        }
    })};

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TransferProvider.Companion companion = TransferProvider.Companion;
        if (i3 != 0) {
            return companion.serializer();
        }
        companion.serializer();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback();
        }
        onExtraCallback();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositAccountHolder)) {
            int i2 = IAuthTabCallback + 13;
            onExtraCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        DepositAccountHolder depositAccountHolder = (DepositAccountHolder) obj;
        if (Intrinsics.areEqual(this.name, depositAccountHolder.name)) {
            return this.transferProvider == depositAccountHolder.transferProvider;
        }
        int i3 = onExtraCallback + 79;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[PHI: r1 r3
      0x0028: PHI (r1v9 int) = (r1v5 int), (r1v11 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
      0x0028: PHI (r3v1 viva.republica.toss.network.model.transfer.TransferProvider) = 
      (r3v0 viva.republica.toss.network.model.transfer.TransferProvider)
      (r3v5 viva.republica.toss.network.model.transfer.TransferProvider)
     binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.DepositAccountHolder.IAuthTabCallback
            int r1 = r1 + 67
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.DepositAccountHolder.onExtraCallback = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1d
            java.lang.String r1 = r5.name
            int r1 = r1.hashCode()
            viva.republica.toss.network.model.transfer.TransferProvider r3 = r5.transferProvider
            r4 = 46
            int r4 = r4 / r2
            if (r3 != 0) goto L28
            goto L35
        L1d:
            java.lang.String r1 = r5.name
            int r1 = r1.hashCode()
            viva.republica.toss.network.model.transfer.TransferProvider r3 = r5.transferProvider
            if (r3 != 0) goto L28
            goto L35
        L28:
            int r2 = r3.hashCode()
            int r3 = viva.republica.toss.network.model.transfer.DepositAccountHolder.IAuthTabCallback
            int r3 = r3 + 41
            int r4 = r3 % 128
            viva.republica.toss.network.model.transfer.DepositAccountHolder.onExtraCallback = r4
            int r3 = r3 % r0
        L35:
            int r1 = r1 * 31
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.DepositAccountHolder.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DepositAccountHolder(name=" + this.name + ", transferProvider=" + this.transferProvider + ")";
        int i2 = IAuthTabCallback + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DepositAccountHolder> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            DepositAccountHolder$.serializer serializerVar = DepositAccountHolder$.serializer.INSTANCE;
            int i4 = onExtraCallback + 5;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        int i = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 60 / 0;
        }
    }

    public /* synthetic */ DepositAccountHolder(int i, String str, TransferProvider transferProvider, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = IAuthTabCallback + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, DepositAccountHolder$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 23;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.name = str;
        this.transferProvider = transferProvider;
    }

    public DepositAccountHolder(@NotNull String str, @Nullable TransferProvider transferProvider) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.transferProvider = transferProvider;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 81;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 99;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(DepositAccountHolder depositAccountHolder, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 1, depositAccountHolder.name);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, (py) lazyArr[0].getValue(), depositAccountHolder.transferProvider);
        } else {
            Lazy<KSerializer<Object>>[] lazyArr2 = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, depositAccountHolder.name);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazyArr2[1].getValue(), depositAccountHolder.transferProvider);
        }
        int i3 = IAuthTabCallback + 23;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
