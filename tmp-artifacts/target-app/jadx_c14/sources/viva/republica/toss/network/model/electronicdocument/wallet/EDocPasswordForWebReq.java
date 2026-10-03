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
import o.oty1;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebReq$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EDocPasswordForWebReq {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<Long> docIds;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebReq$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                EDocPasswordForWebReq.IAuthTabCallback();
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerIAuthTabCallback = EDocPasswordForWebReq.IAuthTabCallback();
            int i3 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return kSerializerIAuthTabCallback;
            }
            throw null;
        }
    })};

    /* JADX WARN: Illegal instructions before constructor call */
    public EDocPasswordForWebReq() {
        List list = null;
        this(list, 1, (DefaultConstructorMarker) list);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = onExtraCallback + 73;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return kSerializerOnWarmupCompleted;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(oty1.onExtraCallback);
        int i2 = IAuthTabCallback + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EDocPasswordForWebReq) || !Intrinsics.areEqual(this.docIds, ((EDocPasswordForWebReq) obj).docIds)) {
            return false;
        }
        int i3 = onExtraCallback + 105;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 99;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        List<Long> list = this.docIds;
        if (list != null) {
            return list.hashCode();
        }
        int i4 = i2 + 67;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EDocPasswordForWebReq(docIds=" + this.docIds + ")";
        int i2 = onExtraCallback + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EDocPasswordForWebReq> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            EDocPasswordForWebReq$.serializer serializerVar = EDocPasswordForWebReq$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 13;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ EDocPasswordForWebReq(int i, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.docIds = null;
            int i2 = IAuthTabCallback + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.docIds = list;
        int i4 = IAuthTabCallback + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public EDocPasswordForWebReq(@Nullable List<Long> list) {
        this.docIds = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024 A[PHI: r1
      0x0024: PHI (r1v9 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[PHI: r1
      0x0033: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v9 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0021, B:13:0x0031, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebReq r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebReq.IAuthTabCallback
            int r1 = r1 + 13
            int r2 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebReq.onExtraCallback = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L1b
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebReq.$childSerializers
            boolean r4 = r7.onWarmupCompleted(r8, r3)
            r5 = 1
            r4 = r4 ^ r5
            if (r4 == r5) goto L24
            goto L33
        L1b:
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebReq.$childSerializers
            boolean r4 = r7.onWarmupCompleted(r8, r3)
            if (r4 == 0) goto L24
            goto L33
        L24:
            int r4 = viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebReq.IAuthTabCallback
            int r4 = r4 + 33
            int r5 = r4 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebReq.onExtraCallback = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L50
            java.util.List<java.lang.Long> r4 = r6.docIds
            if (r4 == 0) goto L40
        L33:
            r1 = r1[r3]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<java.lang.Long> r6 = r6.docIds
            r7.onExtraCallbackWithResult(r8, r3, r1, r6)
        L40:
            int r6 = viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebReq.onExtraCallback
            int r6 = r6 + 59
            int r7 = r6 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebReq.IAuthTabCallback = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L4c
            return
        L4c:
            r2.hashCode()
            throw r2
        L50:
            java.util.List<java.lang.Long> r6 = r6.docIds
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebReq.onExtraCallback(viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebReq, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 49;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i2 + 53;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EDocPasswordForWebReq(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 61;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 15;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            list = null;
        }
        this(list);
    }
}
