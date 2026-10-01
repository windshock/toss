package viva.republica.toss.network.model.bank;

import java.util.ArrayList;
import java.util.Iterator;
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
import net.sf.scuba.smartcards.BuildConfig;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.dj3;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TossBankCurrencyTrendResponse$TossBankCurrencyTrend {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<Dot> dots;
    private final List<Float> graphEntries;
    private final float maxRate;
    private final float minRate;

    public TossBankCurrencyTrendResponse$TossBankCurrencyTrend() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface();
        }
        asInterface();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(dj3.onWarmupCompleted);
        int i2 = onNavigationEvent + 33;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 43 / 0;
        }
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = onWarmupCompleted + 89;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(TossBankCurrencyTrendResponse$TossBankCurrencyTrend$Dot$$serializer.INSTANCE);
        int i2 = onWarmupCompleted + 33;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 89 / 0;
        }
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TossBankCurrencyTrendResponse$TossBankCurrencyTrend)) {
            int i2 = onWarmupCompleted + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        TossBankCurrencyTrendResponse$TossBankCurrencyTrend tossBankCurrencyTrendResponse$TossBankCurrencyTrend = (TossBankCurrencyTrendResponse$TossBankCurrencyTrend) obj;
        if (Float.compare(this.minRate, tossBankCurrencyTrendResponse$TossBankCurrencyTrend.minRate) != 0) {
            return false;
        }
        if (Float.compare(this.maxRate, tossBankCurrencyTrendResponse$TossBankCurrencyTrend.maxRate) != 0) {
            int i4 = onWarmupCompleted + 43;
            onNavigationEvent = i4 % 128;
            return i4 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.dots, tossBankCurrencyTrendResponse$TossBankCurrencyTrend.dots)) {
            return true;
        }
        int i5 = onNavigationEvent + 103;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Float.hashCode(this.minRate) * 31) + Float.hashCode(this.maxRate)) * 31) + this.dots.hashCode();
        int i4 = onWarmupCompleted + 79;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossBankCurrencyTrend(minRate=" + this.minRate + ", maxRate=" + this.maxRate + ", dots=" + this.dots + ")";
        int i2 = onNavigationEvent + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 49 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TossBankCurrencyTrendResponse$TossBankCurrencyTrend> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            TossBankCurrencyTrendResponse$TossBankCurrencyTrend$$serializer tossBankCurrencyTrendResponse$TossBankCurrencyTrend$$serializer = TossBankCurrencyTrendResponse$TossBankCurrencyTrend$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return tossBankCurrencyTrendResponse$TossBankCurrencyTrend$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.bank.TossBankCurrencyTrendResponse$TossBankCurrencyTrend$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 5;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = TossBankCurrencyTrendResponse$TossBankCurrencyTrend.onExtraCallbackWithResult();
                int i4 = onWarmupCompleted + 33;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializerOnExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.bank.TossBankCurrencyTrendResponse$TossBankCurrencyTrend$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 67;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = TossBankCurrencyTrendResponse$TossBankCurrencyTrend.IAuthTabCallback();
                int i4 = IAuthTabCallback + 59;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializerIAuthTabCallback;
                }
                throw null;
            }
        })};
        int i = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public TossBankCurrencyTrendResponse$TossBankCurrencyTrend(float f, float f2, @NotNull List<Dot> list) {
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        this.minRate = f;
        this.maxRate = f2;
        this.dots = list;
        List<Dot> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        int i = 2 % 2;
        while (it.hasNext()) {
            int i2 = onWarmupCompleted + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            arrayList.add(Float.valueOf(((Dot) it.next()).onExtraCallback()));
        }
        this.graphEntries = arrayList;
        int i4 = onWarmupCompleted + 79;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ TossBankCurrencyTrendResponse$TossBankCurrencyTrend(int i, float f, float f2, List list, List list2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.minRate = 0.0f;
        } else {
            this.minRate = f;
        }
        if ((i & 2) == 0) {
            int i2 = onWarmupCompleted + 19;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                this.maxRate = 1.0f;
            } else {
                this.maxRate = 0.0f;
            }
            int i3 = 2 % 2;
        } else {
            this.maxRate = f2;
        }
        Object obj = null;
        if ((i & 4) == 0) {
            int i4 = onNavigationEvent + 53;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                CollectionsKt.emptyList();
                obj.hashCode();
                throw null;
            }
            list = CollectionsKt.emptyList();
            int i5 = onNavigationEvent + 89;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this.dots = list;
        if ((i & 8) != 0) {
            this.graphEntries = list2;
            return;
        }
        List list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            int i8 = onWarmupCompleted + 51;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                arrayList.add(Float.valueOf(((Dot) it.next()).onExtraCallback()));
                throw null;
            }
            arrayList.add(Float.valueOf(((Dot) it.next()).onExtraCallback()));
        }
        this.graphEntries = arrayList;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(TossBankCurrencyTrendResponse$TossBankCurrencyTrend tossBankCurrencyTrendResponse$TossBankCurrencyTrend, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = onNavigationEvent + 89;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (Float.compare(tossBankCurrencyTrendResponse$TossBankCurrencyTrend.minRate, 0.0f) != 0) {
                vylVar.onExtraCallback(serialDescriptor, 0, tossBankCurrencyTrendResponse$TossBankCurrencyTrend.minRate);
                int i6 = onNavigationEvent + 11;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 / 5;
                }
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || Float.compare(tossBankCurrencyTrendResponse$TossBankCurrencyTrend.maxRate, 0.0f) != 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, tossBankCurrencyTrendResponse$TossBankCurrencyTrend.maxRate);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i8 = onNavigationEvent + 35;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            if (!Intrinsics.areEqual(tossBankCurrencyTrendResponse$TossBankCurrencyTrend.dots, CollectionsKt.emptyList())) {
                vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), tossBankCurrencyTrendResponse$TossBankCurrencyTrend.dots);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            List<Float> list = tossBankCurrencyTrendResponse$TossBankCurrencyTrend.graphEntries;
            List<Dot> list2 = tossBankCurrencyTrendResponse$TossBankCurrencyTrend.dots;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (!(!it.hasNext())) {
                arrayList.add(Float.valueOf(((Dot) it.next()).onExtraCallback()));
            }
            if (Intrinsics.areEqual(list, arrayList)) {
                return;
            }
        }
        vylVar.onNavigationEvent(serialDescriptor, 3, (py) lazyArr[3].getValue(), tossBankCurrencyTrendResponse$TossBankCurrencyTrend.graphEntries);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TossBankCurrencyTrendResponse$TossBankCurrencyTrend(float f, float f2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 121;
            onWarmupCompleted = i2 % 128;
            f = i2 % 2 != 0 ? 1.0f : 0.0f;
        }
        if ((i & 2) != 0) {
            int i3 = onNavigationEvent + 119;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            int i6 = onWarmupCompleted + 11;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            list = CollectionsKt.emptyList();
        }
        this(f, f2, list);
    }

    @liq
    public static final class Dot {
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final float rate;

        static {
            int i = onWarmupCompleted + 107;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public Dot() {
            this(0.0f, 1, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 119;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof Dot)) {
                return false;
            }
            if (Float.compare(this.rate, ((Dot) obj).rate) == 0) {
                return true;
            }
            int i4 = IAuthTabCallback + 75;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Float.hashCode(this.rate);
            int i4 = onExtraCallback + 107;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Dot(rate=" + this.rate + ")";
            int i2 = IAuthTabCallback + 79;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Dot> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 19;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                TossBankCurrencyTrendResponse$TossBankCurrencyTrend$Dot$$serializer tossBankCurrencyTrendResponse$TossBankCurrencyTrend$Dot$$serializer = TossBankCurrencyTrendResponse$TossBankCurrencyTrend$Dot$$serializer.INSTANCE;
                if (i3 != 0) {
                    int i4 = 29 / 0;
                }
                return tossBankCurrencyTrendResponse$TossBankCurrencyTrend$Dot$$serializer;
            }
        }

        public Dot(float f) {
            this.rate = f;
        }

        public /* synthetic */ Dot(int i, float f, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.rate = 0.0f;
                int i2 = IAuthTabCallback + 117;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            this.rate = f;
            int i4 = onExtraCallback + 49;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallback(Dot dot, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0 ? (!vylVar.onWarmupCompleted(serialDescriptor, 0)) : !vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i3 = IAuthTabCallback + 87;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (Float.compare(dot.rate, 0.0f) == 0) {
                    return;
                }
            }
            vylVar.onExtraCallback(serialDescriptor, 0, dot.rate);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Dot(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallback + 11;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 75;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                f = 0.0f;
            }
            this(f);
        }

        public final float onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 41;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            float f = this.rate;
            int i5 = i2 + 41;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final List<Float> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        List<Float> list = this.graphEntries;
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
        return list;
    }
}
