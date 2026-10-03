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
import o.getBgColor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.pedometer.DailySyncRes$;
import viva.republica.toss.network.model.pedometer.DailySyncRes$StreakWalking$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DailySyncRes {
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.pedometer.DailySyncRes$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return DailySyncRes.onNavigationEvent();
            }
            DailySyncRes.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }), null};
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final int stepCount;
    private final List<StepStage> stepStages;
    private final StreakWalking streakWalking;

    public DailySyncRes() {
        this(0, (List) null, (StreakWalking) null, 7, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(DailySyncRes$StepStage$$serializer.INSTANCE);
        int i2 = onNavigationEvent + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsBinder = asBinder();
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        return kSerializerAsBinder;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailySyncRes)) {
            return false;
        }
        DailySyncRes dailySyncRes = (DailySyncRes) obj;
        if (this.stepCount != dailySyncRes.stepCount) {
            return false;
        }
        if (!Intrinsics.areEqual(this.stepStages, dailySyncRes.stepStages)) {
            int i4 = onNavigationEvent + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.streakWalking, dailySyncRes.streakWalking)) {
            return true;
        }
        int i6 = onWarmupCompleted + 7;
        int i7 = i6 % 128;
        onNavigationEvent = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 39;
        onWarmupCompleted = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034 A[PHI: r1 r3 r4
      0x0034: PHI (r1v11 int) = (r1v5 int), (r1v13 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r3v3 int) = (r3v1 int), (r3v5 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r4v1 viva.republica.toss.network.model.pedometer.DailySyncRes$StreakWalking) = 
      (r4v0 viva.republica.toss.network.model.pedometer.DailySyncRes$StreakWalking)
      (r4v5 viva.republica.toss.network.model.pedometer.DailySyncRes$StreakWalking)
     binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.pedometer.DailySyncRes.onWarmupCompleted
            int r1 = r1 + 1
            int r2 = r1 % 128
            viva.republica.toss.network.model.pedometer.DailySyncRes.onNavigationEvent = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L23
            int r1 = r6.stepCount
            int r1 = java.lang.Integer.hashCode(r1)
            java.util.List<viva.republica.toss.network.model.pedometer.DailySyncRes$StepStage> r3 = r6.stepStages
            int r3 = r3.hashCode()
            viva.republica.toss.network.model.pedometer.DailySyncRes$StreakWalking r4 = r6.streakWalking
            r5 = 16
            int r5 = r5 / r2
            if (r4 != 0) goto L34
            goto L41
        L23:
            int r1 = r6.stepCount
            int r1 = java.lang.Integer.hashCode(r1)
            java.util.List<viva.republica.toss.network.model.pedometer.DailySyncRes$StepStage> r3 = r6.stepStages
            int r3 = r3.hashCode()
            viva.republica.toss.network.model.pedometer.DailySyncRes$StreakWalking r4 = r6.streakWalking
            if (r4 != 0) goto L34
            goto L41
        L34:
            int r2 = r4.hashCode()
            int r4 = viva.republica.toss.network.model.pedometer.DailySyncRes.onNavigationEvent
            int r4 = r4 + 1
            int r5 = r4 % 128
            viva.republica.toss.network.model.pedometer.DailySyncRes.onWarmupCompleted = r5
            int r4 = r4 % r0
        L41:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.pedometer.DailySyncRes.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DailySyncRes(stepCount=" + this.stepCount + ", stepStages=" + this.stepStages + ", streakWalking=" + this.streakWalking + ")";
        int i2 = onWarmupCompleted + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DailySyncRes> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                DailySyncRes$.serializer serializerVar = DailySyncRes$.serializer.INSTANCE;
                throw null;
            }
            DailySyncRes$.serializer serializerVar2 = DailySyncRes$.serializer.INSTANCE;
            int i3 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return serializerVar2;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ DailySyncRes(int i, int i2, List list, StreakWalking streakWalking, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i3 = onNavigationEvent + 123;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 / 2;
            } else {
                int i5 = 2 % 2;
            }
            i2 = 0;
        }
        this.stepCount = i2;
        if ((i & 2) == 0) {
            list = CollectionsKt.emptyList();
            int i6 = onWarmupCompleted + 121;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        }
        this.stepStages = list;
        if ((i & 4) == 0) {
            this.streakWalking = null;
            return;
        }
        this.streakWalking = streakWalking;
        int i9 = onWarmupCompleted + 117;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
    }

    public DailySyncRes(int i, @NotNull List<StepStage> list, @Nullable StreakWalking streakWalking) {
        Intrinsics.checkNotNullParameter(list, "");
        this.stepCount = i;
        this.stepStages = list;
        this.streakWalking = streakWalking;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return $childSerializers;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.pedometer.DailySyncRes r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.pedometer.DailySyncRes.onWarmupCompleted
            int r1 = r1 + 97
            int r2 = r1 % 128
            viva.republica.toss.network.model.pedometer.DailySyncRes.onNavigationEvent = r2
            int r1 = r1 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.pedometer.DailySyncRes.$childSerializers
            r2 = 0
            boolean r3 = r7.onWarmupCompleted(r8, r2)
            r4 = 0
            if (r3 != 0) goto L2c
            int r3 = viva.republica.toss.network.model.pedometer.DailySyncRes.onWarmupCompleted
            int r3 = r3 + 47
            int r5 = r3 % 128
            viva.republica.toss.network.model.pedometer.DailySyncRes.onNavigationEvent = r5
            int r3 = r3 % r0
            if (r3 != 0) goto L26
            int r3 = r6.stepCount
            if (r3 == 0) goto L31
            goto L2c
        L26:
            int r6 = r6.stepCount
            r4.hashCode()
            throw r4
        L2c:
            int r3 = r6.stepCount
            r7.onExtraCallback(r8, r2, r3)
        L31:
            r2 = 1
            boolean r3 = r7.onWarmupCompleted(r8, r2)
            if (r3 != 0) goto L5a
            int r3 = viva.republica.toss.network.model.pedometer.DailySyncRes.onWarmupCompleted
            int r3 = r3 + 97
            int r5 = r3 % 128
            viva.republica.toss.network.model.pedometer.DailySyncRes.onNavigationEvent = r5
            int r3 = r3 % r0
            if (r3 != 0) goto L50
            java.util.List<viva.republica.toss.network.model.pedometer.DailySyncRes$StepStage> r3 = r6.stepStages
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L67
            goto L5a
        L50:
            java.util.List<viva.republica.toss.network.model.pedometer.DailySyncRes$StepStage> r6 = r6.stepStages
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            throw r4
        L5a:
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<viva.republica.toss.network.model.pedometer.DailySyncRes$StepStage> r3 = r6.stepStages
            r7.onNavigationEvent(r8, r2, r1, r3)
        L67:
            boolean r1 = r7.onWarmupCompleted(r8, r0)
            if (r1 != 0) goto L71
            viva.republica.toss.network.model.pedometer.DailySyncRes$StreakWalking r1 = r6.streakWalking
            if (r1 == 0) goto L78
        L71:
            viva.republica.toss.network.model.pedometer.DailySyncRes$StreakWalking$$serializer r1 = viva.republica.toss.network.model.pedometer.DailySyncRes$StreakWalking$.serializer.INSTANCE
            viva.republica.toss.network.model.pedometer.DailySyncRes$StreakWalking r6 = r6.streakWalking
            r7.onExtraCallbackWithResult(r8, r0, r1, r6)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.pedometer.DailySyncRes.onWarmupCompleted(viva.republica.toss.network.model.pedometer.DailySyncRes, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.stepCount;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DailySyncRes(int i, List list, StreakWalking streakWalking, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        i = (i2 & 1) != 0 ? 0 : i;
        list = (i2 & 2) != 0 ? CollectionsKt.emptyList() : list;
        if ((i2 & 4) != 0) {
            int i3 = onNavigationEvent + 9;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 89;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            streakWalking = null;
        }
        this(i, list, streakWalking);
    }

    public final List<StepStage> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        List<StepStage> list = this.stepStages;
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        return list;
    }

    @liq
    public static final class StepStage {
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final Boolean canFinish;

        static {
            int i = onExtraCallback + 33;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public StepStage() {
            Boolean bool = null;
            this(bool, 1, (DefaultConstructorMarker) bool);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 73;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 71 / 0;
                }
                return true;
            }
            if (obj instanceof StepStage) {
                return !(Intrinsics.areEqual(this.canFinish, ((StepStage) obj).canFinish) ^ true);
            }
            int i4 = IAuthTabCallback + 5;
            onWarmupCompleted = i4 % 128;
            return i4 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            Boolean bool = this.canFinish;
            Object obj = null;
            if (bool != null) {
                int iHashCode = bool.hashCode();
                int i2 = onWarmupCompleted + 25;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return iHashCode;
                }
                throw null;
            }
            int i3 = IAuthTabCallback;
            int i4 = i3 + 101;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 103;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return 0;
            }
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "StepStage(canFinish=" + this.canFinish + ")";
            int i2 = onWarmupCompleted + 117;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class Companion {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<StepStage> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 101;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                DailySyncRes$StepStage$$serializer dailySyncRes$StepStage$$serializer = DailySyncRes$StepStage$$serializer.INSTANCE;
                int i4 = onWarmupCompleted + 49;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return dailySyncRes$StepStage$$serializer;
            }
        }

        public /* synthetic */ StepStage(int i, Boolean bool, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.canFinish = null;
                int i2 = onWarmupCompleted + 49;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            this.canFinish = bool;
            int i3 = IAuthTabCallback + 37;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        public StepStage(@Nullable Boolean bool) {
            this.canFinish = bool;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallback(StepStage stepStage, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || stepStage.canFinish != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getBgColor.IAuthTabCallback, stepStage.canFinish);
            }
            int i4 = onWarmupCompleted + 35;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ StepStage(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onWarmupCompleted;
                int i3 = i2 + 117;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 121;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                bool = null;
            }
            this(bool);
        }

        public final Boolean onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            Boolean bool = this.canFinish;
            int i4 = i3 + 35;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return bool;
            }
            obj.hashCode();
            throw null;
        }
    }

    public final StreakWalking IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        StreakWalking streakWalking = this.streakWalking;
        int i5 = i3 + 115;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return streakWalking;
    }

    @liq
    public static final class StreakWalking {
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final boolean isCheckedToday;
        private final boolean isShieldAvailable;
        private final boolean isStreakBrokenToday;
        private final int streakCount;

        static {
            int i = onWarmupCompleted + 9;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public StreakWalking() {
            this(false, false, false, 0, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                int i5 = i3 + 37;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return true;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof StreakWalking)) {
                return false;
            }
            StreakWalking streakWalking = (StreakWalking) obj;
            if (this.isShieldAvailable != streakWalking.isShieldAvailable) {
                return false;
            }
            if (this.isCheckedToday != streakWalking.isCheckedToday) {
                int i6 = i3 + 111;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (this.isStreakBrokenToday == streakWalking.isStreakBrokenToday) {
                return this.streakCount == streakWalking.streakCount;
            }
            int i8 = i3 + 65;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((Boolean.hashCode(this.isShieldAvailable) * 31) + Boolean.hashCode(this.isCheckedToday)) * 31) + Boolean.hashCode(this.isStreakBrokenToday)) * 31) + Integer.hashCode(this.streakCount);
            int i4 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "StreakWalking(isShieldAvailable=" + this.isShieldAvailable + ", isCheckedToday=" + this.isCheckedToday + ", isStreakBrokenToday=" + this.isStreakBrokenToday + ", streakCount=" + this.streakCount + ")";
            int i2 = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<StreakWalking> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 31;
                onWarmupCompleted = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    DailySyncRes$StreakWalking$.serializer serializerVar = DailySyncRes$StreakWalking$.serializer.INSTANCE;
                    obj.hashCode();
                    throw null;
                }
                DailySyncRes$StreakWalking$.serializer serializerVar2 = DailySyncRes$StreakWalking$.serializer.INSTANCE;
                int i3 = onWarmupCompleted + 9;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return serializerVar2;
                }
                obj.hashCode();
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ StreakWalking(int r2, boolean r3, boolean r4, boolean r5, int r6, o.okycx r7) {
            /*
                r1 = this;
                r1.<init>()
                r7 = r2 & 1
                r0 = 0
                if (r7 != 0) goto Lb
                r1.isShieldAvailable = r0
                goto Ld
            Lb:
                r1.isShieldAvailable = r3
            Ld:
                r3 = r2 & 2
                r7 = 2
                if (r3 != 0) goto L17
                r1.isCheckedToday = r0
            L14:
                int r3 = r7 % r7
                goto L26
            L17:
                r1.isCheckedToday = r4
                int r3 = viva.republica.toss.network.model.pedometer.DailySyncRes.StreakWalking.IAuthTabCallback
                int r3 = r3 + 61
                int r4 = r3 % 128
                viva.republica.toss.network.model.pedometer.DailySyncRes.StreakWalking.onExtraCallbackWithResult = r4
                int r3 = r3 % r7
                if (r3 == 0) goto L14
                r3 = 3
                int r3 = r3 % r7
            L26:
                r3 = r2 & 4
                if (r3 != 0) goto L36
                int r3 = viva.republica.toss.network.model.pedometer.DailySyncRes.StreakWalking.IAuthTabCallback
                int r3 = r3 + 53
                int r4 = r3 % 128
                viva.republica.toss.network.model.pedometer.DailySyncRes.StreakWalking.onExtraCallbackWithResult = r4
                int r3 = r3 % r7
                r1.isStreakBrokenToday = r0
                goto L3a
            L36:
                r1.isStreakBrokenToday = r5
                int r3 = r7 % r7
            L3a:
                r2 = r2 & 8
                if (r2 != 0) goto L4a
                int r2 = viva.republica.toss.network.model.pedometer.DailySyncRes.StreakWalking.IAuthTabCallback
                int r2 = r2 + 51
                int r3 = r2 % 128
                viva.republica.toss.network.model.pedometer.DailySyncRes.StreakWalking.onExtraCallbackWithResult = r3
                int r2 = r2 % r7
                r1.streakCount = r0
                return
            L4a:
                r1.streakCount = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.pedometer.DailySyncRes.StreakWalking.<init>(int, boolean, boolean, boolean, int, o.okycx):void");
        }

        public StreakWalking(boolean z, boolean z2, boolean z3, int i) {
            this.isShieldAvailable = z;
            this.isCheckedToday = z2;
            this.isStreakBrokenToday = z3;
            this.streakCount = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.pedometer.DailySyncRes.StreakWalking r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
            /*
                r0 = 2
                int r1 = r0 % r0
                r1 = 0
                boolean r2 = r5.onWarmupCompleted(r6, r1)
                if (r2 != 0) goto L17
                int r2 = viva.republica.toss.network.model.pedometer.DailySyncRes.StreakWalking.IAuthTabCallback
                int r2 = r2 + 49
                int r3 = r2 % 128
                viva.republica.toss.network.model.pedometer.DailySyncRes.StreakWalking.onExtraCallbackWithResult = r3
                int r2 = r2 % r0
                boolean r2 = r4.isShieldAvailable
                if (r2 == 0) goto L1c
            L17:
                boolean r2 = r4.isShieldAvailable
                r5.onNavigationEvent(r6, r1, r2)
            L1c:
                r2 = 1
                boolean r3 = r5.onWarmupCompleted(r6, r2)
                if (r3 != 0) goto L27
                boolean r3 = r4.isCheckedToday
                if (r3 == 0) goto L2c
            L27:
                boolean r3 = r4.isCheckedToday
                r5.onNavigationEvent(r6, r2, r3)
            L2c:
                boolean r2 = r5.onWarmupCompleted(r6, r0)
                if (r2 != 0) goto L49
                int r2 = viva.republica.toss.network.model.pedometer.DailySyncRes.StreakWalking.IAuthTabCallback
                int r2 = r2 + 109
                int r3 = r2 % 128
                viva.republica.toss.network.model.pedometer.DailySyncRes.StreakWalking.onExtraCallbackWithResult = r3
                int r2 = r2 % r0
                if (r2 == 0) goto L45
                boolean r2 = r4.isStreakBrokenToday
                r3 = 27
                int r3 = r3 / r1
                if (r2 == 0) goto L4e
                goto L49
            L45:
                boolean r1 = r4.isStreakBrokenToday
                if (r1 == 0) goto L4e
            L49:
                boolean r1 = r4.isStreakBrokenToday
                r5.onNavigationEvent(r6, r0, r1)
            L4e:
                r0 = 3
                boolean r1 = r5.onWarmupCompleted(r6, r0)
                if (r1 != 0) goto L59
                int r1 = r4.streakCount
                if (r1 == 0) goto L5e
            L59:
                int r4 = r4.streakCount
                r5.onExtraCallback(r6, r0, r4)
            L5e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.pedometer.DailySyncRes.StreakWalking.IAuthTabCallback(viva.republica.toss.network.model.pedometer.DailySyncRes$StreakWalking, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ StreakWalking(boolean z, boolean z2, boolean z3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 1) != 0) {
                int i3 = 2 % 2;
                z = false;
            }
            if ((i2 & 2) != 0) {
                int i4 = onExtraCallbackWithResult + 85;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
                z2 = false;
            }
            if ((i2 & 4) != 0) {
                int i6 = onExtraCallbackWithResult + 29;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                z3 = false;
            }
            this(z, z2, z3, (i2 & 8) != 0 ? 0 : i);
        }

        public final boolean onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            boolean z = this.isShieldAvailable;
            int i5 = i3 + 55;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public final boolean onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 73;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.isCheckedToday;
            int i5 = i2 + 93;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            boolean z = this.isStreakBrokenToday;
            int i5 = i3 + 21;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            throw null;
        }

        public final int onExtraCallbackWithResult() {
            int i;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 29;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                i = this.streakCount;
                int i5 = 80 / 0;
            } else {
                i = this.streakCount;
            }
            int i6 = i3 + 81;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return i;
        }
    }
}
