package viva.republica.toss.network.model.loan;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanHomeInventoryInformation$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanHomeInventoryInformation {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final String disclaimer;
    private final List<LoanHomeExtensiveFeature> features;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanHomeInventoryInformation$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return LoanHomeInventoryInformation.onWarmupCompleted();
            }
            LoanHomeInventoryInformation.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }), null};

    /* JADX WARN: Multi-variable type inference failed */
    public LoanHomeInventoryInformation() {
        this((List) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoanHomeExtensiveFeature$$serializer.INSTANCE);
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 60 / 0;
        }
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        KSerializer kSerializerOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerOnNavigationEvent = onNavigationEvent();
            int i3 = 34 / 0;
        } else {
            kSerializerOnNavigationEvent = onNavigationEvent();
        }
        int i4 = onExtraCallbackWithResult + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnNavigationEvent;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 125;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoanHomeInventoryInformation) {
            LoanHomeInventoryInformation loanHomeInventoryInformation = (LoanHomeInventoryInformation) obj;
            return Intrinsics.areEqual(this.features, loanHomeInventoryInformation.features) && Intrinsics.areEqual(this.disclaimer, loanHomeInventoryInformation.disclaimer);
        }
        int i4 = i2 + 111;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[PHI: r1 r3
      0x0030: PHI (r1v10 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0024, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r3v4 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:8:0x0024, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r1
      0x0026: PHI (r1v6 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0024, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.LoanHomeInventoryInformation.onExtraCallback
            int r1 = r1 + 107
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanHomeInventoryInformation.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1c
            java.util.List<viva.republica.toss.network.model.loan.LoanHomeExtensiveFeature> r1 = r5.features
            int r1 = r1.hashCode()
            java.lang.String r3 = r5.disclaimer
            int r4 = r2 / r2
            if (r3 != 0) goto L30
            goto L26
        L1c:
            java.util.List<viva.republica.toss.network.model.loan.LoanHomeExtensiveFeature> r1 = r5.features
            int r1 = r1.hashCode()
            java.lang.String r3 = r5.disclaimer
            if (r3 != 0) goto L30
        L26:
            int r3 = viva.republica.toss.network.model.loan.LoanHomeInventoryInformation.onExtraCallback
            int r3 = r3 + 107
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.LoanHomeInventoryInformation.onExtraCallbackWithResult = r4
            int r3 = r3 % r0
            goto L34
        L30:
            int r2 = r3.hashCode()
        L34:
            int r1 = r1 * 31
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeInventoryInformation.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanHomeInventoryInformation(features=" + this.features + ", disclaimer=" + this.disclaimer + ")";
        int i2 = onExtraCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
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

        public final KSerializer<LoanHomeInventoryInformation> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            LoanHomeInventoryInformation$.serializer serializerVar = LoanHomeInventoryInformation$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 89;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        int i = IAuthTabCallback + 41;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ LoanHomeInventoryInformation(int i, List list, String str, okycx okycxVar) {
        if ((i & 1) == 0) {
            list = CollectionsKt.emptyList();
            int i2 = onExtraCallbackWithResult + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.features = list;
        if ((i & 2) != 0) {
            this.disclaimer = str;
            return;
        }
        int i5 = onExtraCallbackWithResult + 57;
        int i6 = i5 % 128;
        onExtraCallback = i6;
        int i7 = i5 % 2;
        this.disclaimer = null;
        int i8 = i6 + 23;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
    }

    public LoanHomeInventoryInformation(@NotNull List<LoanHomeExtensiveFeature> list, @Nullable String str) {
        Intrinsics.checkNotNullParameter(list, "");
        this.features = list;
        this.disclaimer = str;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(LoanHomeInventoryInformation loanHomeInventoryInformation, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(loanHomeInventoryInformation.features, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), loanHomeInventoryInformation.features);
            int i2 = onExtraCallback + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onExtraCallbackWithResult + 41;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                String str = loanHomeInventoryInformation.disclaimer;
                throw null;
            }
            if (loanHomeInventoryInformation.disclaimer == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, loanHomeInventoryInformation.disclaimer);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanHomeInventoryInformation(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            list = CollectionsKt.emptyList();
            int i2 = onExtraCallback + 55;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallback + 99;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            str = null;
        }
        this(list, str);
    }

    public final List<LoanHomeExtensiveFeature> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        List<LoanHomeExtensiveFeature> list = this.features;
        int i4 = i3 + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final String onExtraCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            str = this.disclaimer;
            int i4 = 26 / 0;
        } else {
            str = this.disclaimer;
        }
        int i5 = i3 + 97;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
