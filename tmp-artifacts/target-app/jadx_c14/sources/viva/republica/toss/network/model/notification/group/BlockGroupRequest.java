package viva.republica.toss.network.model.notification.group;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.notification.group.BlockGroupRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BlockGroupRequest {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final List<String> serviceCorporationCodes;
    private final long serviceId;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.notification.group.BlockGroupRequest$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnNavigationEvent = BlockGroupRequest.onNavigationEvent();
            if (i3 == 0) {
                int i4 = 57 / 0;
            }
            return kSerializerOnNavigationEvent;
        }
    })};

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted();
            throw null;
        }
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i3 = onExtraCallback + 105;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerOnWarmupCompleted;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (this != obj) {
            if (!(obj instanceof BlockGroupRequest)) {
                return false;
            }
            BlockGroupRequest blockGroupRequest = (BlockGroupRequest) obj;
            if (this.serviceId == blockGroupRequest.serviceId) {
                return Intrinsics.areEqual(this.serviceCorporationCodes, blockGroupRequest.serviceCorporationCodes);
            }
            int i5 = i2 + 123;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i2 + 47;
        int i8 = i7 % 128;
        onWarmupCompleted = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 85;
        onExtraCallback = i10 % 128;
        if (i10 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onExtraCallback = i2 % 128;
        int iHashCode = (i2 % 2 == 0 ? Long.hashCode(this.serviceId) / 0 : Long.hashCode(this.serviceId) * 31) + this.serviceCorporationCodes.hashCode();
        int i3 = onWarmupCompleted + 45;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BlockGroupRequest(serviceId=" + this.serviceId + ", serviceCorporationCodes=" + this.serviceCorporationCodes + ")";
        int i2 = onWarmupCompleted + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BlockGroupRequest> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            BlockGroupRequest$.serializer serializerVar = BlockGroupRequest$.serializer.INSTANCE;
            if (i3 != 0) {
                int i4 = 0 / 0;
            }
            return serializerVar;
        }
    }

    static {
        int i = IAuthTabCallback + 95;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ BlockGroupRequest(int i, long j, List list, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallback + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, BlockGroupRequest$.serializer.INSTANCE.getDescriptor());
        }
        this.serviceId = j;
        if ((i & 2) == 0) {
            this.serviceCorporationCodes = CollectionsKt.emptyList();
            return;
        }
        this.serviceCorporationCodes = list;
        int i4 = onExtraCallback + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public BlockGroupRequest(long j, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.serviceId = j;
        this.serviceCorporationCodes = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[PHI: r1
      0x0038: PHI (r1v6 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0029, B:10:0x0036, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r1
      0x002b: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0029, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.notification.group.BlockGroupRequest r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.notification.group.BlockGroupRequest.onExtraCallback
            int r1 = r1 + 25
            int r2 = r1 % 128
            viva.republica.toss.network.model.notification.group.BlockGroupRequest.onWarmupCompleted = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.notification.group.BlockGroupRequest.$childSerializers
            long r4 = r6.serviceId
            r7.onExtraCallback(r8, r2, r4)
            boolean r2 = r7.onWarmupCompleted(r8, r3)
            if (r2 == r3) goto L38
            goto L2b
        L1e:
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.notification.group.BlockGroupRequest.$childSerializers
            long r4 = r6.serviceId
            r7.onExtraCallback(r8, r2, r4)
            boolean r2 = r7.onWarmupCompleted(r8, r3)
            if (r2 != 0) goto L38
        L2b:
            java.util.List<java.lang.String> r2 = r6.serviceCorporationCodes
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            r2 = r2 ^ r3
            if (r2 == 0) goto L45
        L38:
            r1 = r1[r3]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<java.lang.String> r6 = r6.serviceCorporationCodes
            r7.onNavigationEvent(r8, r3, r1, r6)
        L45:
            int r6 = viva.republica.toss.network.model.notification.group.BlockGroupRequest.onExtraCallback
            int r6 = r6 + 55
            int r7 = r6 % 128
            viva.republica.toss.network.model.notification.group.BlockGroupRequest.onWarmupCompleted = r7
            int r6 = r6 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.notification.group.BlockGroupRequest.IAuthTabCallback(viva.republica.toss.network.model.notification.group.BlockGroupRequest, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i3 + 89;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return lazyArr;
        }
        throw null;
    }
}
