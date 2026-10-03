package viva.republica.toss.network.model.pedometer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.pedometer.PedometerInfo$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PedometerInfo {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final boolean enablePedometer;
    private final String landingScheme;
    private final boolean v2User;

    static {
        int i = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public PedometerInfo() {
        this(false, (String) null, false, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PedometerInfo)) {
            int i2 = onExtraCallback + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        PedometerInfo pedometerInfo = (PedometerInfo) obj;
        if (this.v2User == pedometerInfo.v2User) {
            if (!Intrinsics.areEqual(this.landingScheme, pedometerInfo.landingScheme)) {
                return false;
            }
            if (this.enablePedometer == pedometerInfo.enablePedometer) {
                return true;
            }
            int i4 = onNavigationEvent + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = onExtraCallback + 55;
        int i7 = i6 % 128;
        onNavigationEvent = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 97;
        onExtraCallback = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 73;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = Boolean.hashCode(this.v2User);
        String str = this.landingScheme;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i5 = onExtraCallback + 7;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return (((iHashCode * 31) + i) * 31) + Boolean.hashCode(this.enablePedometer);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PedometerInfo(v2User=" + this.v2User + ", landingScheme=" + this.landingScheme + ", enablePedometer=" + this.enablePedometer + ")";
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
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

        public final KSerializer<PedometerInfo> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            PedometerInfo$.serializer serializerVar = PedometerInfo$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 117;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ PedometerInfo(int i, boolean z, String str, boolean z2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.v2User = false;
        } else {
            this.v2User = z;
            int i2 = onNavigationEvent + 101;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 2) == 0) {
            int i4 = onExtraCallback + 61;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            this.landingScheme = null;
            if (i5 != 0) {
                throw null;
            }
            int i6 = 2 % 2;
        } else {
            this.landingScheme = str;
        }
        if ((i & 4) != 0) {
            this.enablePedometer = z2;
            int i7 = onExtraCallback + 71;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        int i9 = onExtraCallback + 115;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 != 0) {
            this.enablePedometer = true;
        } else {
            this.enablePedometer = false;
        }
    }

    public PedometerInfo(boolean z, @Nullable String str, boolean z2) {
        this.v2User = z;
        this.landingScheme = str;
        this.enablePedometer = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.pedometer.PedometerInfo r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 != 0) goto Le
            boolean r2 = r4.v2User
            if (r2 == 0) goto L13
        Le:
            boolean r2 = r4.v2User
            r5.onNavigationEvent(r6, r1, r2)
        L13:
            r1 = 1
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 != 0) goto L27
            int r2 = viva.republica.toss.network.model.pedometer.PedometerInfo.onNavigationEvent
            int r2 = r2 + 75
            int r3 = r2 % 128
            viva.republica.toss.network.model.pedometer.PedometerInfo.onExtraCallback = r3
            int r2 = r2 % r0
            java.lang.String r2 = r4.landingScheme
            if (r2 == 0) goto L2e
        L27:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r4.landingScheme
            r5.onExtraCallbackWithResult(r6, r1, r2, r3)
        L2e:
            boolean r1 = r5.onWarmupCompleted(r6, r0)
            if (r1 != 0) goto L41
            int r1 = viva.republica.toss.network.model.pedometer.PedometerInfo.onNavigationEvent
            int r1 = r1 + 81
            int r2 = r1 % 128
            viva.republica.toss.network.model.pedometer.PedometerInfo.onExtraCallback = r2
            int r1 = r1 % r0
            boolean r1 = r4.enablePedometer
            if (r1 == 0) goto L4f
        L41:
            boolean r4 = r4.enablePedometer
            r5.onNavigationEvent(r6, r0, r4)
            int r4 = viva.republica.toss.network.model.pedometer.PedometerInfo.onExtraCallback
            int r4 = r4 + 59
            int r5 = r4 % 128
            viva.republica.toss.network.model.pedometer.PedometerInfo.onNavigationEvent = r5
            int r4 = r4 % r0
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.pedometer.PedometerInfo.onWarmupCompleted(viva.republica.toss.network.model.pedometer.PedometerInfo, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PedometerInfo(boolean z, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 65;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 9;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 4;
            } else {
                int i7 = 2 % 2;
            }
            z = false;
        }
        str = (i & 2) != 0 ? null : str;
        if ((i & 4) != 0) {
            int i8 = onNavigationEvent;
            int i9 = i8 + 33;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i8 + 19;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
            z2 = false;
        }
        this(z, str, z2);
    }

    public final boolean IAuthTabCallback() {
        boolean z;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            z = this.v2User;
            int i4 = 73 / 0;
        } else {
            z = this.v2User;
        }
        int i5 = i3 + 19;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.landingScheme;
        int i5 = i3 + 23;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        boolean z;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 103;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            z = this.enablePedometer;
            int i4 = 98 / 0;
        } else {
            z = this.enablePedometer;
        }
        int i5 = i2 + 117;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
