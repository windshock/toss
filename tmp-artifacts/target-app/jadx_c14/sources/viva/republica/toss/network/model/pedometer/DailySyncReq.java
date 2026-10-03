package viva.republica.toss.network.model.pedometer;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.pedometer.DailySyncReq$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DailySyncReq {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final boolean background;
    private final int count;
    private final String yyyyMMdd;

    static {
        int i = onNavigationEvent + 119;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailySyncReq)) {
            int i2 = IAuthTabCallback + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        DailySyncReq dailySyncReq = (DailySyncReq) obj;
        if (this.count == dailySyncReq.count) {
            return Intrinsics.areEqual(this.yyyyMMdd, dailySyncReq.yyyyMMdd) && this.background == dailySyncReq.background;
        }
        int i4 = onExtraCallback + 67;
        IAuthTabCallback = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Integer.hashCode(this.count) * 31) + this.yyyyMMdd.hashCode()) * 31) + Boolean.hashCode(this.background);
        int i4 = IAuthTabCallback + 39;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DailySyncReq(count=" + this.count + ", yyyyMMdd=" + this.yyyyMMdd + ", background=" + this.background + ")";
        int i2 = IAuthTabCallback + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DailySyncReq> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                DailySyncReq$.serializer serializerVar = DailySyncReq$.serializer.INSTANCE;
                throw null;
            }
            DailySyncReq$.serializer serializerVar2 = DailySyncReq$.serializer.INSTANCE;
            int i3 = onNavigationEvent + 69;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 22 / 0;
            }
            return serializerVar2;
        }
    }

    public /* synthetic */ DailySyncReq(int i, int i2, String str, boolean z, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i3 = 7;
        if (7 != (i & 7)) {
            int i4 = onExtraCallback + 17;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                descriptor = DailySyncReq$.serializer.INSTANCE.getDescriptor();
                i3 = 62;
            } else {
                descriptor = DailySyncReq$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i3, descriptor);
            int i5 = IAuthTabCallback + 89;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this.count = i2;
        this.yyyyMMdd = str;
        this.background = z;
    }

    public DailySyncReq(int i, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.count = i;
        this.yyyyMMdd = str;
        this.background = z;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(DailySyncReq dailySyncReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, dailySyncReq.count);
            vylVar.onExtraCallback(serialDescriptor, 1, dailySyncReq.yyyyMMdd);
            vylVar.onNavigationEvent(serialDescriptor, 3, dailySyncReq.background);
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, dailySyncReq.count);
            vylVar.onExtraCallback(serialDescriptor, 1, dailySyncReq.yyyyMMdd);
            vylVar.onNavigationEvent(serialDescriptor, 2, dailySyncReq.background);
        }
        int i3 = onExtraCallback + 103;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 93 / 0;
        }
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.yyyyMMdd;
        }
        throw null;
    }
}
