package viva.republica.toss.network.model.pedometer;

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
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.pedometer.HalfHourlySyncReq;
import viva.republica.toss.network.model.pedometer.TodayStepRes$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TodayStepRes {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String date;
    private final List<HalfHourlySyncReq.Step> halfHourlySteps;
    private final String timezone;
    private final int totalSteps;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.pedometer.TodayStepRes$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallback = TodayStepRes.IAuthTabCallback();
            int i4 = onNavigationEvent + 11;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 55 / 0;
            }
            return kSerializerIAuthTabCallback;
        }
    })};

    public TodayStepRes() {
        this((String) null, (String) null, 0, (List) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        KSerializer kSerializerAsInterface;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerAsInterface = asInterface();
            int i3 = 52 / 0;
        } else {
            kSerializerAsInterface = asInterface();
        }
        int i4 = IAuthTabCallback + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerAsInterface;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(HalfHourlySyncReq$Step$$serializer.INSTANCE);
        int i2 = IAuthTabCallback + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof TodayStepRes)) {
                return false;
            }
            TodayStepRes todayStepRes = (TodayStepRes) obj;
            return !(Intrinsics.areEqual(this.date, todayStepRes.date) ^ true) && Intrinsics.areEqual(this.timezone, todayStepRes.timezone) && this.totalSteps == todayStepRes.totalSteps && Intrinsics.areEqual(this.halfHourlySteps, todayStepRes.halfHourlySteps);
        }
        int i5 = i3 + 53;
        int i6 = i5 % 128;
        IAuthTabCallback = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 39;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.date.hashCode() * 31) + this.timezone.hashCode()) * 31) + Integer.hashCode(this.totalSteps)) * 31) + this.halfHourlySteps.hashCode();
        int i4 = IAuthTabCallback + 69;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TodayStepRes(date=" + this.date + ", timezone=" + this.timezone + ", totalSteps=" + this.totalSteps + ", halfHourlySteps=" + this.halfHourlySteps + ")";
        int i2 = IAuthTabCallback + 33;
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

        public final KSerializer<TodayStepRes> serializer() {
            TodayStepRes$.serializer serializerVar;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                serializerVar = TodayStepRes$.serializer.INSTANCE;
                int i3 = 35 / 0;
            } else {
                serializerVar = TodayStepRes$.serializer.INSTANCE;
            }
            int i4 = onNavigationEvent + 125;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        int i = onExtraCallback + 87;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ TodayStepRes(int i, String str, String str2, int i2, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.date = "";
        } else {
            this.date = str;
        }
        if ((i & 2) == 0) {
            this.timezone = "";
            int i3 = IAuthTabCallback + 13;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        } else {
            this.timezone = str2;
        }
        if ((i & 4) == 0) {
            int i5 = IAuthTabCallback + 33;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            this.totalSteps = 0;
        } else {
            this.totalSteps = i2;
            int i7 = IAuthTabCallback + 1;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = 2 % 2;
        if ((i & 8) != 0) {
            this.halfHourlySteps = list;
            return;
        }
        this.halfHourlySteps = CollectionsKt.emptyList();
        int i10 = onWarmupCompleted + 67;
        IAuthTabCallback = i10 % 128;
        int i11 = i10 % 2;
    }

    public TodayStepRes(@NotNull String str, @NotNull String str2, int i, @NotNull List<HalfHourlySyncReq.Step> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.date = str;
        this.timezone = str2;
        this.totalSteps = i;
        this.halfHourlySteps = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.pedometer.TodayStepRes r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.pedometer.TodayStepRes.$childSerializers
            r2 = 0
            boolean r3 = r7.onWarmupCompleted(r8, r2)
            java.lang.String r4 = ""
            if (r3 != 0) goto L1f
            int r3 = viva.republica.toss.network.model.pedometer.TodayStepRes.onWarmupCompleted
            int r3 = r3 + 47
            int r5 = r3 % 128
            viva.republica.toss.network.model.pedometer.TodayStepRes.IAuthTabCallback = r5
            int r3 = r3 % r0
            java.lang.String r3 = r6.date
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L24
        L1f:
            java.lang.String r3 = r6.date
            r7.onExtraCallback(r8, r2, r3)
        L24:
            r3 = 1
            boolean r5 = r7.onWarmupCompleted(r8, r3)
            if (r5 != 0) goto L34
            java.lang.String r5 = r6.timezone
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r4)
            if (r4 == 0) goto L34
            goto L39
        L34:
            java.lang.String r4 = r6.timezone
            r7.onExtraCallback(r8, r3, r4)
        L39:
            boolean r3 = r7.onWarmupCompleted(r8, r0)
            if (r3 != 0) goto L56
            int r3 = viva.republica.toss.network.model.pedometer.TodayStepRes.onWarmupCompleted
            int r3 = r3 + 83
            int r4 = r3 % 128
            viva.republica.toss.network.model.pedometer.TodayStepRes.IAuthTabCallback = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L52
            int r3 = r6.totalSteps
            r4 = 93
            int r4 = r4 / r2
            if (r3 == 0) goto L68
            goto L56
        L52:
            int r2 = r6.totalSteps
            if (r2 == 0) goto L68
        L56:
            int r2 = r6.totalSteps
            r7.onExtraCallback(r8, r0, r2)
            int r2 = viva.republica.toss.network.model.pedometer.TodayStepRes.onWarmupCompleted
            int r2 = r2 + 31
            int r3 = r2 % 128
            viva.republica.toss.network.model.pedometer.TodayStepRes.IAuthTabCallback = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L68
            r2 = 5
            int r2 = r2 % r2
        L68:
            r2 = 3
            boolean r3 = r7.onWarmupCompleted(r8, r2)
            if (r3 != 0) goto L84
            int r3 = viva.republica.toss.network.model.pedometer.TodayStepRes.onWarmupCompleted
            int r3 = r3 + 81
            int r4 = r3 % 128
            viva.republica.toss.network.model.pedometer.TodayStepRes.IAuthTabCallback = r4
            int r3 = r3 % r0
            java.util.List<viva.republica.toss.network.model.pedometer.HalfHourlySyncReq$Step> r0 = r6.halfHourlySteps
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 != 0) goto L91
        L84:
            r0 = r1[r2]
            java.lang.Object r0 = r0.getValue()
            o.py r0 = (o.py) r0
            java.util.List<viva.republica.toss.network.model.pedometer.HalfHourlySyncReq$Step> r6 = r6.halfHourlySteps
            r7.onNavigationEvent(r8, r2, r0, r6)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.pedometer.TodayStepRes.IAuthTabCallback(viva.republica.toss.network.model.pedometer.TodayStepRes, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 43;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 57;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TodayStepRes(String str, String str2, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = IAuthTabCallback + 89;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str = "";
        }
        if ((i2 & 2) != 0) {
            int i4 = onWarmupCompleted;
            int i5 = i4 + 113;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 29;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str2 = "";
        }
        i = (i2 & 4) != 0 ? 0 : i;
        if ((i2 & 8) != 0) {
            list = CollectionsKt.emptyList();
            int i10 = onWarmupCompleted + 17;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
        }
        this(str, str2, i, list);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.date;
        int i5 = i3 + 43;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.timezone;
        int i5 = i3 + 99;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final int IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.totalSteps;
        }
        throw null;
    }

    public final List<HalfHourlySyncReq.Step> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.halfHourlySteps;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
