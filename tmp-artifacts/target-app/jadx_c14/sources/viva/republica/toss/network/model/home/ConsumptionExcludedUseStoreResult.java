package viva.republica.toss.network.model.home;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.home.ConsumptionExcludedUseStoreResult$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ConsumptionExcludedUseStoreResult {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private boolean excluded;
    private String useStore;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    static {
        int i = onNavigationEvent + 101;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ConsumptionExcludedUseStoreResult() {
        String str = null;
        this(str, false, 3, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumptionExcludedUseStoreResult)) {
            return false;
        }
        ConsumptionExcludedUseStoreResult consumptionExcludedUseStoreResult = (ConsumptionExcludedUseStoreResult) obj;
        if (Intrinsics.areEqual(this.useStore, consumptionExcludedUseStoreResult.useStore)) {
            return this.excluded == consumptionExcludedUseStoreResult.excluded;
        }
        int i3 = onWarmupCompleted + 11;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.useStore.hashCode() * 31) + Boolean.hashCode(this.excluded);
        int i4 = onWarmupCompleted + 39;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConsumptionExcludedUseStoreResult(useStore=" + this.useStore + ", excluded=" + this.excluded + ")";
        int i2 = onWarmupCompleted + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ConsumptionExcludedUseStoreResult> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ConsumptionExcludedUseStoreResult$.serializer serializerVar = ConsumptionExcludedUseStoreResult$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 111;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ ConsumptionExcludedUseStoreResult(int i, String str, boolean z, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i2 = onExtraCallback + 37;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            str = "";
        }
        this.useStore = str;
        if ((i & 2) == 0) {
            int i4 = onExtraCallback + 17;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            this.excluded = false;
            return;
        }
        this.excluded = z;
        int i6 = onWarmupCompleted + 13;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public ConsumptionExcludedUseStoreResult(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.useStore = str;
        this.excluded = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.home.ConsumptionExcludedUseStoreResult r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == r3) goto Ld
            goto L22
        Ld:
            int r2 = viva.republica.toss.network.model.home.ConsumptionExcludedUseStoreResult.onWarmupCompleted
            int r2 = r2 + 69
            int r4 = r2 % 128
            viva.republica.toss.network.model.home.ConsumptionExcludedUseStoreResult.onExtraCallback = r4
            int r2 = r2 % r0
            java.lang.String r2 = r5.useStore
            java.lang.String r4 = ""
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            r2 = r2 ^ r3
            if (r2 == r3) goto L22
            goto L30
        L22:
            java.lang.String r2 = r5.useStore
            r6.onExtraCallback(r7, r1, r2)
            int r1 = viva.republica.toss.network.model.home.ConsumptionExcludedUseStoreResult.onExtraCallback
            int r1 = r1 + 109
            int r2 = r1 % 128
            viva.republica.toss.network.model.home.ConsumptionExcludedUseStoreResult.onWarmupCompleted = r2
            int r1 = r1 % r0
        L30:
            boolean r1 = r6.onWarmupCompleted(r7, r3)
            r1 = r1 ^ r3
            if (r1 == r3) goto L38
            goto L47
        L38:
            int r1 = viva.republica.toss.network.model.home.ConsumptionExcludedUseStoreResult.onWarmupCompleted
            int r1 = r1 + 91
            int r2 = r1 % 128
            viva.republica.toss.network.model.home.ConsumptionExcludedUseStoreResult.onExtraCallback = r2
            int r1 = r1 % r0
            boolean r0 = r5.excluded
            r0 = r0 ^ r3
            if (r0 == 0) goto L47
            goto L4c
        L47:
            boolean r5 = r5.excluded
            r6.onNavigationEvent(r7, r3, r5)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.home.ConsumptionExcludedUseStoreResult.onExtraCallbackWithResult(viva.republica.toss.network.model.home.ConsumptionExcludedUseStoreResult, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ConsumptionExcludedUseStoreResult(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback;
            int i3 = i2 + 51;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 88 / 0;
            }
            int i5 = i2 + 89;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str = "";
        }
        this(str, (i & 2) != 0 ? false : z);
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.excluded;
        }
        throw null;
    }
}
