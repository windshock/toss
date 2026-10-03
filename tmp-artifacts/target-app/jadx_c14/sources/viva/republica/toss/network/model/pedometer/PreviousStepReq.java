package viva.republica.toss.network.model.pedometer;

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
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.pedometer.PreviousStepReq$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PreviousStepReq {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final List<Log> logs;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.pedometer.PreviousStepReq$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                PreviousStepReq.onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerOnNavigationEvent = PreviousStepReq.onNavigationEvent();
            int i3 = IAuthTabCallback + 119;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnNavigationEvent;
        }
    })};

    /* JADX WARN: Illegal instructions before constructor call */
    public PreviousStepReq() {
        List list = null;
        this(list, 1, (DefaultConstructorMarker) list);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(PreviousStepReq$Log$$serializer.INSTANCE);
        int i2 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 12 / 0;
        }
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i4 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            return (obj instanceof PreviousStepReq) && Intrinsics.areEqual(this.logs, ((PreviousStepReq) obj).logs);
        }
        int i5 = i3 + 111;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.logs.hashCode();
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.logs.hashCode();
        int i3 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PreviousStepReq(logs=" + this.logs + ")";
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PreviousStepReq> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                PreviousStepReq$.serializer serializerVar = PreviousStepReq$.serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            PreviousStepReq$.serializer serializerVar2 = PreviousStepReq$.serializer.INSTANCE;
            int i3 = onWarmupCompleted + 99;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return serializerVar2;
        }
    }

    static {
        int i = onExtraCallback + 53;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ PreviousStepReq(int i, List list, okycx okycxVar) {
        if ((i & 1) != 0) {
            this.logs = list;
            int i2 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.logs = CollectionsKt.emptyList();
        int i4 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
    }

    public PreviousStepReq(@NotNull List<Log> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.logs = list;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 45;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 27;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(PreviousStepReq previousStepReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(previousStepReq.logs, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), previousStepReq.logs);
            int i2 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PreviousStepReq(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
            int i4 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 4;
            } else {
                int i6 = 2 % 2;
            }
        }
        this(list);
    }

    @liq
    public static final class Log {
        public static final Companion Companion = new Companion(null);
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        private final boolean background;
        private final int count;
        private final String type;
        private final String yyyyMMdd;

        static {
            int i = onNavigationEvent + 87;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Log)) {
                return false;
            }
            Log log = (Log) obj;
            if (!Intrinsics.areEqual(this.yyyyMMdd, log.yyyyMMdd)) {
                return false;
            }
            if (this.count != log.count) {
                int i3 = onWarmupCompleted + 1;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (this.background != log.background) {
                return false;
            }
            if (Intrinsics.areEqual(this.type, log.type)) {
                return true;
            }
            int i5 = onExtraCallback + 31;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0040 A[PHI: r1 r3 r4 r5
          0x0040: PHI (r1v13 int) = (r1v5 int), (r1v15 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
          0x0040: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
          0x0040: PHI (r4v3 int) = (r4v1 int), (r4v5 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
          0x0040: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v2 java.lang.String) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int hashCode() {
            /*
                r7 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.pedometer.PreviousStepReq.Log.onExtraCallback
                int r1 = r1 + 93
                int r2 = r1 % 128
                viva.republica.toss.network.model.pedometer.PreviousStepReq.Log.onWarmupCompleted = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 != 0) goto L29
                java.lang.String r1 = r7.yyyyMMdd
                int r1 = r1.hashCode()
                int r3 = r7.count
                int r3 = java.lang.Integer.hashCode(r3)
                boolean r4 = r7.background
                int r4 = java.lang.Boolean.hashCode(r4)
                java.lang.String r5 = r7.type
                r6 = 60
                int r6 = r6 / r2
                if (r5 != 0) goto L40
                goto L44
            L29:
                java.lang.String r1 = r7.yyyyMMdd
                int r1 = r1.hashCode()
                int r3 = r7.count
                int r3 = java.lang.Integer.hashCode(r3)
                boolean r4 = r7.background
                int r4 = java.lang.Boolean.hashCode(r4)
                java.lang.String r5 = r7.type
                if (r5 != 0) goto L40
                goto L44
            L40:
                int r2 = r5.hashCode()
            L44:
                int r1 = r1 * 31
                int r1 = r1 + r3
                int r1 = r1 * 31
                int r1 = r1 + r4
                int r1 = r1 * 31
                int r1 = r1 + r2
                int r2 = viva.republica.toss.network.model.pedometer.PreviousStepReq.Log.onWarmupCompleted
                int r2 = r2 + 47
                int r3 = r2 % 128
                viva.republica.toss.network.model.pedometer.PreviousStepReq.Log.onExtraCallback = r3
                int r2 = r2 % r0
                if (r2 != 0) goto L59
                return r1
            L59:
                r0 = 0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.pedometer.PreviousStepReq.Log.hashCode():int");
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Log(yyyyMMdd=" + this.yyyyMMdd + ", count=" + this.count + ", background=" + this.background + ", type=" + this.type + ")";
            int i2 = onWarmupCompleted + 31;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Log> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 63;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                PreviousStepReq$Log$$serializer previousStepReq$Log$$serializer = PreviousStepReq$Log$$serializer.INSTANCE;
                int i4 = onWarmupCompleted + 15;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return previousStepReq$Log$$serializer;
            }
        }

        public /* synthetic */ Log(int i, String str, int i2, boolean z, String str2, okycx okycxVar) {
            if (7 != (i & 7)) {
                int i3 = onWarmupCompleted + 17;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                htf31.onExtraCallbackWithResult(i, 7, PreviousStepReq$Log$$serializer.INSTANCE.getDescriptor());
                int i5 = onWarmupCompleted + 29;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            }
            this.yyyyMMdd = str;
            this.count = i2;
            this.background = z;
            if ((i & 8) != 0) {
                this.type = str2;
                return;
            }
            this.type = null;
            int i8 = onWarmupCompleted + 53;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
        }

        public Log(@NotNull String str, int i, boolean z, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.yyyyMMdd = str;
            this.count = i;
            this.background = z;
            this.type = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.pedometer.PreviousStepReq.Log r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.pedometer.PreviousStepReq.Log.onExtraCallback
                int r1 = r1 + 7
                int r2 = r1 % 128
                viva.republica.toss.network.model.pedometer.PreviousStepReq.Log.onWarmupCompleted = r2
                int r1 = r1 % r0
                r2 = 3
                r3 = 0
                r4 = 1
                if (r1 != 0) goto L28
                java.lang.String r1 = r5.yyyyMMdd
                r6.onExtraCallback(r7, r4, r1)
                int r1 = r5.count
                r6.onExtraCallback(r7, r3, r1)
                boolean r1 = r5.background
                r6.onNavigationEvent(r7, r0, r1)
                r1 = 5
                boolean r1 = r6.onWarmupCompleted(r7, r1)
                if (r1 != 0) goto L4a
                goto L3e
            L28:
                java.lang.String r1 = r5.yyyyMMdd
                r6.onExtraCallback(r7, r3, r1)
                int r1 = r5.count
                r6.onExtraCallback(r7, r4, r1)
                boolean r1 = r5.background
                r6.onNavigationEvent(r7, r0, r1)
                boolean r1 = r6.onWarmupCompleted(r7, r2)
                if (r1 == 0) goto L3e
                goto L4a
            L3e:
                int r1 = viva.republica.toss.network.model.pedometer.PreviousStepReq.Log.onWarmupCompleted
                int r1 = r1 + r4
                int r3 = r1 % 128
                viva.republica.toss.network.model.pedometer.PreviousStepReq.Log.onExtraCallback = r3
                int r1 = r1 % r0
                java.lang.String r0 = r5.type
                if (r0 == 0) goto L51
            L4a:
                o.getWriggleLayout r0 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r5 = r5.type
                r6.onExtraCallbackWithResult(r7, r2, r0, r5)
            L51:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.pedometer.PreviousStepReq.Log.onExtraCallbackWithResult(viva.republica.toss.network.model.pedometer.PreviousStepReq$Log, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Log(String str, int i, boolean z, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 8) != 0) {
                int i3 = onExtraCallback + 115;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 55 / 0;
                }
                int i5 = 2 % 2;
                str2 = null;
            }
            this(str, i, z, str2);
        }
    }
}
