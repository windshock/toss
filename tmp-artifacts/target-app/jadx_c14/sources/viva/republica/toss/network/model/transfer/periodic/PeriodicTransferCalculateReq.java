package viva.republica.toss.network.model.transfer.periodic;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferCalculateReq$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PeriodicTransferCalculateReq {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final PeriodicTransferFrequency detail;
    private final String uniqueId;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferCalculateReq$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                PeriodicTransferCalculateReq.onExtraCallback();
                throw null;
            }
            KSerializer kSerializerOnExtraCallback = PeriodicTransferCalculateReq.onExtraCallback();
            int i3 = onWarmupCompleted + 95;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnExtraCallback;
        }
    })};

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<PeriodicTransferFrequency> kSerializerSerializer = PeriodicTransferFrequency.Companion.serializer();
        int i4 = onNavigationEvent + 27;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return kSerializerSerializer;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i3 = onNavigationEvent + 11;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 17 / 0;
        }
        return kSerializerIAuthTabCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PeriodicTransferCalculateReq)) {
            int i2 = onNavigationEvent + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        PeriodicTransferCalculateReq periodicTransferCalculateReq = (PeriodicTransferCalculateReq) obj;
        if (!Intrinsics.areEqual(this.uniqueId, periodicTransferCalculateReq.uniqueId)) {
            return false;
        }
        if (Intrinsics.areEqual(this.detail, periodicTransferCalculateReq.detail)) {
            return true;
        }
        int i4 = onNavigationEvent + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[PHI: r2
      0x0023: PHI (r2v5 java.lang.String) = (r2v2 java.lang.String), (r2v6 java.lang.String) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferCalculateReq.onNavigationEvent
            int r2 = r1 + 115
            int r3 = r2 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferCalculateReq.onExtraCallback = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L17
            java.lang.String r2 = r5.uniqueId
            r4 = 34
            int r4 = r4 / r3
            if (r2 != 0) goto L23
            goto L1b
        L17:
            java.lang.String r2 = r5.uniqueId
            if (r2 != 0) goto L23
        L1b:
            int r1 = r1 + 29
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferCalculateReq.onExtraCallback = r2
            int r1 = r1 % r0
            goto L27
        L23:
            int r3 = r2.hashCode()
        L27:
            int r3 = r3 * 31
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency r1 = r5.detail
            int r1 = r1.hashCode()
            int r3 = r3 + r1
            int r1 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferCalculateReq.onExtraCallback
            int r1 = r1 + 103
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferCalculateReq.onNavigationEvent = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L3c
            return r3
        L3c:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferCalculateReq.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PeriodicTransferCalculateReq(uniqueId=" + this.uniqueId + ", detail=" + this.detail + ")";
        int i2 = onNavigationEvent + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PeriodicTransferCalculateReq> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            PeriodicTransferCalculateReq$.serializer serializerVar = PeriodicTransferCalculateReq$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 109;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 93;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ PeriodicTransferCalculateReq(int i, String str, PeriodicTransferFrequency periodicTransferFrequency, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onNavigationEvent + 101;
            onExtraCallback = i2 % 128;
            htf31.onExtraCallbackWithResult(i, 3, (i2 % 2 == 0 ? PeriodicTransferCalculateReq$.serializer.INSTANCE : PeriodicTransferCalculateReq$.serializer.INSTANCE).getDescriptor());
            int i3 = 2 % 2;
        }
        this.uniqueId = str;
        this.detail = periodicTransferFrequency;
    }

    public PeriodicTransferCalculateReq(@Nullable String str, @NotNull PeriodicTransferFrequency periodicTransferFrequency) {
        Intrinsics.checkNotNullParameter(periodicTransferFrequency, "");
        this.uniqueId = str;
        this.detail = periodicTransferFrequency;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(PeriodicTransferCalculateReq periodicTransferCalculateReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>> lazy;
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, periodicTransferCalculateReq.uniqueId);
            lazy = lazyArr[0];
        } else {
            Lazy<KSerializer<Object>>[] lazyArr2 = $childSerializers;
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, periodicTransferCalculateReq.uniqueId);
            lazy = lazyArr2[1];
        }
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazy.getValue(), periodicTransferCalculateReq.detail);
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        throw null;
    }
}
