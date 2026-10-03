package viva.republica.toss.network.model.electronicdocument.wallet;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EDocBannerInfo {
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = EDocBannerInfo.onExtraCallbackWithResult();
            int i4 = onExtraCallback + 55;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    })};
    public static final Companion Companion;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final boolean available;
    private final List<EDocBanner> banners;

    /* JADX WARN: Illegal instructions before constructor call */
    public EDocBannerInfo() {
        List list = null;
        this(false, list, 3, (DefaultConstructorMarker) list);
    }

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(EDocBanner$$serializer.INSTANCE);
        int i2 = onNavigationEvent + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        int i4 = onNavigationEvent + 47;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 23;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof EDocBannerInfo)) {
            int i3 = onWarmupCompleted + 57;
            onNavigationEvent = i3 % 128;
            return i3 % 2 != 0;
        }
        EDocBannerInfo eDocBannerInfo = (EDocBannerInfo) obj;
        if (this.available != eDocBannerInfo.available) {
            return false;
        }
        if (Intrinsics.areEqual(this.banners, eDocBannerInfo.banners)) {
            return true;
        }
        int i4 = onWarmupCompleted;
        int i5 = i4 + 63;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 23;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027 A[PHI: r1 r3
      0x0027: PHI (r1v9 int) = (r1v5 int), (r1v11 int) binds: [B:8:0x0024, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]
      0x0027: PHI (r3v1 java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.EDocBanner>) = 
      (r3v0 java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.EDocBanner>)
      (r3v5 java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.EDocBanner>)
     binds: [B:8:0x0024, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo.onNavigationEvent
            int r1 = r1 + 65
            int r2 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo.onWarmupCompleted = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1c
            boolean r1 = r5.available
            int r1 = java.lang.Boolean.hashCode(r1)
            java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.EDocBanner> r3 = r5.banners
            r4 = 4
            int r4 = r4 / r2
            if (r3 != 0) goto L27
            goto L34
        L1c:
            boolean r1 = r5.available
            int r1 = java.lang.Boolean.hashCode(r1)
            java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.EDocBanner> r3 = r5.banners
            if (r3 != 0) goto L27
            goto L34
        L27:
            int r2 = r3.hashCode()
            int r3 = viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo.onNavigationEvent
            int r3 = r3 + 91
            int r4 = r3 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo.onWarmupCompleted = r4
            int r3 = r3 % r0
        L34:
            int r1 = r1 * 31
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EDocBannerInfo(available=" + this.available + ", banners=" + this.banners + ")";
        int i2 = onNavigationEvent + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EDocBannerInfo> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            EDocBannerInfo$.serializer serializerVar = EDocBannerInfo$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallbackWithResult + 95;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ EDocBannerInfo(int i, boolean z, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i2 = onNavigationEvent + 91;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 / 3;
            } else {
                int i4 = 2 % 2;
            }
            z = false;
        }
        this.available = z;
        if ((i & 2) != 0) {
            this.banners = list;
            int i5 = onWarmupCompleted + 43;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 89 / 0;
                return;
            }
            return;
        }
        Object obj = null;
        this.banners = null;
        int i7 = onNavigationEvent + 65;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public EDocBannerInfo(boolean z, @Nullable List<EDocBanner> list) {
        this.available = z;
        this.banners = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo.$childSerializers
            r2 = 0
            boolean r3 = r7.onWarmupCompleted(r8, r2)
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L24
            int r3 = viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo.onNavigationEvent
            int r3 = r3 + r4
            int r5 = r3 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo.onWarmupCompleted = r5
            int r3 = r3 % r0
            if (r3 == 0) goto L1d
            boolean r3 = r6.available
            if (r3 == 0) goto L29
            goto L24
        L1d:
            boolean r6 = r6.available
            r6 = 0
            r6.hashCode()
            throw r6
        L24:
            boolean r3 = r6.available
            r7.onNavigationEvent(r8, r2, r3)
        L29:
            boolean r2 = r7.onWarmupCompleted(r8, r4)
            if (r2 != 0) goto L3c
            int r2 = viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo.onWarmupCompleted
            int r2 = r2 + 119
            int r3 = r2 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo.onNavigationEvent = r3
            int r2 = r2 % r0
            java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.EDocBanner> r2 = r6.banners
            if (r2 == 0) goto L56
        L3c:
            r1 = r1[r4]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.EDocBanner> r6 = r6.banners
            r7.onExtraCallbackWithResult(r8, r4, r1, r6)
            int r6 = viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo.onNavigationEvent
            int r6 = r6 + 61
            int r7 = r6 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo.onWarmupCompleted = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L56
            r6 = 4
            int r6 = r6 % r6
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo.IAuthTabCallback(viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 107;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 41;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EDocBannerInfo(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 67;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 81;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 / 2;
            } else {
                int i7 = 2 % 2;
            }
            z = false;
        }
        if ((i & 2) != 0) {
            int i8 = onWarmupCompleted + 91;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            list = null;
        }
        this(z, list);
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        boolean z = this.available;
        int i5 = i3 + 55;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final List<EDocBanner> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 23;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<EDocBanner> list = this.banners;
        int i4 = i2 + 75;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }
}
