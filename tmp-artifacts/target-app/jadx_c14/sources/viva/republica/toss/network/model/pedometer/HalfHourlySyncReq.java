package viva.republica.toss.network.model.pedometer;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import viva.republica.toss.network.model.pedometer.HalfHourlySyncReq$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class HalfHourlySyncReq {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final boolean background;
    private final List<Step> steps;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.pedometer.HalfHourlySyncReq$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = HalfHourlySyncReq.onExtraCallbackWithResult();
            int i4 = onNavigationEvent + 81;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }
    }), null};

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(HalfHourlySyncReq$Step$$serializer.INSTANCE);
        int i2 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HalfHourlySyncReq)) {
            int i2 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        HalfHourlySyncReq halfHourlySyncReq = (HalfHourlySyncReq) obj;
        if (!Intrinsics.areEqual(this.steps, halfHourlySyncReq.steps)) {
            int i4 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.background == halfHourlySyncReq.background) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.steps.hashCode() + 59) % Boolean.hashCode(this.background) : (this.steps.hashCode() * 31) + Boolean.hashCode(this.background);
        int i3 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HalfHourlySyncReq(steps=" + this.steps + ", background=" + this.background + ")";
        int i2 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<HalfHourlySyncReq> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            HalfHourlySyncReq$.serializer serializerVar = HalfHourlySyncReq$.serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 58 / 0;
            }
            return serializerVar;
        }
    }

    static {
        int i = onNavigationEvent + 69;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ HalfHourlySyncReq(int i, List list, boolean z, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onExtraCallbackWithResult + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, HalfHourlySyncReq$.serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.steps = list;
        this.background = z;
    }

    public HalfHourlySyncReq(@NotNull List<Step> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.steps = list;
        this.background = z;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i3 + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(HalfHourlySyncReq halfHourlySyncReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), halfHourlySyncReq.steps);
        vylVar.onNavigationEvent(serialDescriptor, 1, halfHourlySyncReq.background);
        int i4 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @liq
    public static final class Step {
        public static final Companion Companion = new Companion(null);
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final int stepCount;
        private final String time;

        static {
            int i = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                int i2 = 83 / 0;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            if ((r6 instanceof viva.republica.toss.network.model.pedometer.HalfHourlySyncReq.Step) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            r6 = (viva.republica.toss.network.model.pedometer.HalfHourlySyncReq.Step) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.time, r6.time) != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
        
            if (r5.stepCount == r6.stepCount) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
        
            r6 = viva.republica.toss.network.model.pedometer.HalfHourlySyncReq.Step.onNavigationEvent + 49;
            viva.republica.toss.network.model.pedometer.HalfHourlySyncReq.Step.onExtraCallback = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        
            if ((r6 % 2) == 0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
        
            r6 = null;
            r6.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r1 = r1 + 69;
            viva.republica.toss.network.model.pedometer.HalfHourlySyncReq.Step.onExtraCallback = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.pedometer.HalfHourlySyncReq.Step.onNavigationEvent
                int r2 = r1 + 65
                int r3 = r2 % 128
                viva.republica.toss.network.model.pedometer.HalfHourlySyncReq.Step.onExtraCallback = r3
                int r2 = r2 % r0
                r3 = 1
                r4 = 0
                if (r2 != 0) goto L16
                r2 = 69
                int r2 = r2 / r4
                if (r5 != r6) goto L20
                goto L18
            L16:
                if (r5 != r6) goto L20
            L18:
                int r1 = r1 + 69
                int r6 = r1 % 128
                viva.republica.toss.network.model.pedometer.HalfHourlySyncReq.Step.onExtraCallback = r6
                int r1 = r1 % r0
                return r3
            L20:
                boolean r1 = r6 instanceof viva.republica.toss.network.model.pedometer.HalfHourlySyncReq.Step
                if (r1 != 0) goto L25
                return r4
            L25:
                viva.republica.toss.network.model.pedometer.HalfHourlySyncReq$Step r6 = (viva.republica.toss.network.model.pedometer.HalfHourlySyncReq.Step) r6
                java.lang.String r1 = r5.time
                java.lang.String r2 = r6.time
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                if (r1 != 0) goto L32
                return r4
            L32:
                int r1 = r5.stepCount
                int r6 = r6.stepCount
                if (r1 == r6) goto L49
                int r6 = viva.republica.toss.network.model.pedometer.HalfHourlySyncReq.Step.onNavigationEvent
                int r6 = r6 + 49
                int r1 = r6 % 128
                viva.republica.toss.network.model.pedometer.HalfHourlySyncReq.Step.onExtraCallback = r1
                int r6 = r6 % r0
                if (r6 == 0) goto L44
                return r4
            L44:
                r6 = 0
                r6.hashCode()
                throw r6
            L49:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.pedometer.HalfHourlySyncReq.Step.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.time.hashCode() * 31) + Integer.hashCode(this.stepCount);
            int i4 = onNavigationEvent + 99;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Step(time=" + this.time + ", stepCount=" + this.stepCount + ")";
            int i2 = onNavigationEvent + 17;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class Companion {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Step> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 35;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                HalfHourlySyncReq$Step$$serializer halfHourlySyncReq$Step$$serializer = HalfHourlySyncReq$Step$$serializer.INSTANCE;
                if (i3 != 0) {
                    return halfHourlySyncReq$Step$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public /* synthetic */ Step(int i, String str, int i2, okycx okycxVar) {
            if (3 != (i & 3)) {
                int i3 = onExtraCallback + 117;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                htf31.onExtraCallbackWithResult(i, 3, HalfHourlySyncReq$Step$$serializer.INSTANCE.getDescriptor());
                int i5 = onExtraCallback + 93;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            }
            this.time = str;
            this.stepCount = i2;
        }

        public Step(@NotNull String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            this.time = str;
            this.stepCount = i;
        }

        @JvmStatic
        public static final /* synthetic */ void onWarmupCompleted(Step step, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                vylVar.onExtraCallback(serialDescriptor, 1, step.time);
                vylVar.onExtraCallback(serialDescriptor, 0, step.stepCount);
            } else {
                vylVar.onExtraCallback(serialDescriptor, 0, step.time);
                vylVar.onExtraCallback(serialDescriptor, 1, step.stepCount);
            }
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.time;
            int i5 = i3 + 39;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final int onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 83;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.stepCount;
            int i6 = i2 + 107;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            throw null;
        }
    }
}
