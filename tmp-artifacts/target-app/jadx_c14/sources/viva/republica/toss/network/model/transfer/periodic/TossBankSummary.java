package viva.republica.toss.network.model.transfer.periodic;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.periodic.TossBankSummary$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TossBankSummary {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final int count;
    private final String scheme;

    static {
        int i = IAuthTabCallback + 81;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TossBankSummary() {
        String str = null;
        this(0, str, 3, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof TossBankSummary) {
            TossBankSummary tossBankSummary = (TossBankSummary) obj;
            if (this.count != tossBankSummary.count) {
                return false;
            }
            if (Intrinsics.areEqual(this.scheme, tossBankSummary.scheme)) {
                return true;
            }
            int i4 = onNavigationEvent + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = i3 + 65;
        int i7 = i6 % 128;
        onExtraCallback = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 69;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.count);
        return i3 != 0 ? (iHashCode + 42) >>> this.scheme.hashCode() : (iHashCode * 31) + this.scheme.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossBankSummary(count=" + this.count + ", scheme=" + this.scheme + ")";
        int i2 = onExtraCallback + 69;
        onNavigationEvent = i2 % 128;
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

        public final KSerializer<TossBankSummary> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            TossBankSummary$.serializer serializerVar = TossBankSummary$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 109;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ TossBankSummary(int i, int i2, String str, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i3 = 2 % 2;
            i2 = 0;
        }
        this.count = i2;
        Object obj = null;
        if ((i & 2) != 0) {
            this.scheme = str;
            int i4 = onExtraCallback + 21;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i5 = onExtraCallback + 119;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        this.scheme = "";
        if (i6 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public TossBankSummary(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.count = i;
        this.scheme = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.transfer.periodic.TossBankSummary r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.periodic.TossBankSummary.onExtraCallback
            int r1 = r1 + 57
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.periodic.TossBankSummary.onNavigationEvent = r2
            int r1 = r1 % r0
            r1 = 0
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 != 0) goto L2a
            int r2 = viva.republica.toss.network.model.transfer.periodic.TossBankSummary.onExtraCallback
            int r2 = r2 + 49
            int r3 = r2 % 128
            viva.republica.toss.network.model.transfer.periodic.TossBankSummary.onNavigationEvent = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L23
            int r2 = r4.count
            if (r2 == 0) goto L3d
            goto L2a
        L23:
            int r4 = r4.count
            r4 = 0
            r4.hashCode()
            throw r4
        L2a:
            int r2 = r4.count
            r5.onExtraCallback(r6, r1, r2)
            int r1 = viva.republica.toss.network.model.transfer.periodic.TossBankSummary.onNavigationEvent
            int r1 = r1 + 45
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.periodic.TossBankSummary.onExtraCallback = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L3d
            r0 = 3
            int r0 = r0 % 5
        L3d:
            r0 = 1
            boolean r1 = r5.onWarmupCompleted(r6, r0)
            if (r1 != 0) goto L4f
            java.lang.String r1 = r4.scheme
            java.lang.String r2 = ""
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r1 = r1 ^ r0
            if (r1 == 0) goto L54
        L4f:
            java.lang.String r4 = r4.scheme
            r5.onExtraCallback(r6, r0, r4)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.TossBankSummary.onExtraCallback(viva.republica.toss.network.model.transfer.periodic.TossBankSummary, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TossBankSummary(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = onExtraCallback + 85;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 45;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
            i = 0;
        }
        this(i, (i2 & 2) != 0 ? "" : str);
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.count;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.scheme;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
