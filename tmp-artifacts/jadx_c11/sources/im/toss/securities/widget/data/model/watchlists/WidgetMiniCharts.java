package im.toss.securities.widget.data.model.watchlists;

import im.toss.securities.widget.data.model.watchlists.WidgetMiniCharts;
import im.toss.securities.widget.data.model.watchlists.WidgetMiniCharts$;
import im.toss.tosssecurities.core.base.model.SessionType;
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
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.setVideoListener;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class WidgetMiniCharts {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<IndexMiniChart> indexMiniCharts;
    private final List<ProductMiniChart> productMiniCharts;

    /* JADX WARN: Illegal instructions before constructor call */
    public WidgetMiniCharts() {
        List list = null;
        this(list, list, 3, (DefaultConstructorMarker) list);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(WidgetMiniCharts$IndexMiniChart$$serializer.INSTANCE);
        int i2 = onWarmupCompleted + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(WidgetMiniCharts$ProductMiniChart$$serializer.INSTANCE);
        int i2 = onWarmupCompleted + 113;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = onExtraCallback + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return kSerializerIAuthTabCallbackDefault;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            asInterface();
            throw null;
        }
        KSerializer kSerializerAsInterface = asInterface();
        int i3 = onWarmupCompleted + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerAsInterface;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetMiniCharts)) {
            int i2 = onExtraCallback + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        WidgetMiniCharts widgetMiniCharts = (WidgetMiniCharts) obj;
        if (!Intrinsics.areEqual(this.indexMiniCharts, widgetMiniCharts.indexMiniCharts)) {
            int i4 = onExtraCallback + 95;
            onWarmupCompleted = i4 % 128;
            return i4 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.productMiniCharts, widgetMiniCharts.productMiniCharts)) {
            return true;
        }
        int i5 = onExtraCallback + 29;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        List<IndexMiniChart> list = this.indexMiniCharts;
        if (list == null) {
            int i2 = onWarmupCompleted + 61;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 5;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        List<ProductMiniChart> list2 = this.productMiniCharts;
        return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WidgetMiniCharts(indexMiniCharts=" + this.indexMiniCharts + ", productMiniCharts=" + this.productMiniCharts + ")";
        int i2 = onExtraCallback + 59;
        onWarmupCompleted = i2 % 128;
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

        public final KSerializer<WidgetMiniCharts> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            WidgetMiniCharts$.serializer serializerVar = WidgetMiniCharts$.serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.data.model.watchlists.WidgetMiniCharts$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 59;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return WidgetMiniCharts.onExtraCallback();
                }
                WidgetMiniCharts.onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.data.model.watchlists.WidgetMiniCharts$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 87;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    WidgetMiniCharts.onNavigationEvent();
                    throw null;
                }
                KSerializer kSerializerOnNavigationEvent = WidgetMiniCharts.onNavigationEvent();
                int i3 = IAuthTabCallback + 63;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return kSerializerOnNavigationEvent;
            }
        })};
        int i = IAuthTabCallback + 77;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ WidgetMiniCharts(int i, List list, List list2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.indexMiniCharts = null;
            int i2 = 2 % 2;
        } else {
            this.indexMiniCharts = list;
        }
        if ((i & 2) != 0) {
            this.productMiniCharts = list2;
            int i3 = onWarmupCompleted + 41;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i4 = onExtraCallback;
        int i5 = i4 + 39;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        this.productMiniCharts = null;
        if (i6 != 0) {
            throw null;
        }
        int i7 = i4 + 37;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
    }

    public WidgetMiniCharts(@Nullable List<IndexMiniChart> list, @Nullable List<ProductMiniChart> list2) {
        this.indexMiniCharts = list;
        this.productMiniCharts = list2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[PHI: r1
      0x002d: PHI (r1v7 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v8 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001f, B:10:0x002b, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
      0x0021: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v8 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(WidgetMiniCharts widgetMiniCharts, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i3 = onExtraCallback + 1;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (widgetMiniCharts.indexMiniCharts != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, (py) lazyArr[0].getValue(), widgetMiniCharts.indexMiniCharts);
                }
            }
        } else {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || widgetMiniCharts.productMiniCharts != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazyArr[1].getValue(), widgetMiniCharts.productMiniCharts);
        }
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WidgetMiniCharts(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 1;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 77;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            list = null;
        }
        if ((i & 2) != 0) {
            int i8 = onWarmupCompleted + 77;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            list2 = null;
        }
        this(list, list2);
    }

    public final List<IndexMiniChart> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 35;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        List<IndexMiniChart> list = this.indexMiniCharts;
        int i5 = i2 + 87;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    @liq
    public static final class IndexMiniChart {
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final double base;
        private final double close;
        private final String code;
        private final MiniChart miniChart;
        private final String name;

        static {
            int i = onExtraCallback + 107;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                int i5 = i3 + 7;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof IndexMiniChart)) {
                return false;
            }
            IndexMiniChart indexMiniChart = (IndexMiniChart) obj;
            if (Double.compare(this.base, indexMiniChart.base) != 0) {
                int i7 = onWarmupCompleted + 17;
                onExtraCallbackWithResult = i7 % 128;
                return i7 % 2 == 0;
            }
            if (Double.compare(this.close, indexMiniChart.close) == 0) {
                return !(Intrinsics.areEqual(this.code, indexMiniChart.code) ^ true) && Intrinsics.areEqual(this.miniChart, indexMiniChart.miniChart) && Intrinsics.areEqual(this.name, indexMiniChart.name);
            }
            int i8 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Double.hashCode(this.base);
                Double.hashCode(this.close);
                this.code.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode2 = Double.hashCode(this.base);
            int iHashCode3 = Double.hashCode(this.close);
            int iHashCode4 = this.code.hashCode();
            MiniChart miniChart = this.miniChart;
            if (miniChart == null) {
                int i3 = onExtraCallbackWithResult + 3;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                iHashCode = 0;
            } else {
                iHashCode = miniChart.hashCode();
            }
            return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + this.name.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "IndexMiniChart(base=" + this.base + ", close=" + this.close + ", code=" + this.code + ", miniChart=" + this.miniChart + ", name=" + this.name + ")";
            int i2 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
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

            public final KSerializer<IndexMiniChart> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 13;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                WidgetMiniCharts$IndexMiniChart$$serializer widgetMiniCharts$IndexMiniChart$$serializer = WidgetMiniCharts$IndexMiniChart$$serializer.INSTANCE;
                int i4 = onNavigationEvent + 107;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 84 / 0;
                }
                return widgetMiniCharts$IndexMiniChart$$serializer;
            }
        }

        public /* synthetic */ IndexMiniChart(int i, double d, double d2, String str, MiniChart miniChart, String str2, okycx okycxVar) {
            if (23 != (i & 23)) {
                htf31.onExtraCallbackWithResult(i, 23, WidgetMiniCharts$IndexMiniChart$$serializer.INSTANCE.getDescriptor());
            }
            this.base = d;
            this.close = d2;
            this.code = str;
            if ((i & 8) == 0) {
                this.miniChart = null;
                int i2 = onExtraCallbackWithResult + 91;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                }
                this.name = str2;
            }
            this.miniChart = miniChart;
            int i3 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            this.name = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onWarmupCompleted(IndexMiniChart indexMiniChart, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, indexMiniChart.base);
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, indexMiniChart.close);
                vylVar.onExtraCallback(serialDescriptor, 2, indexMiniChart.code);
                if (!(!vylVar.onWarmupCompleted(serialDescriptor, 3))) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 3, WidgetMiniCharts$IndexMiniChart$MiniChart$$serializer.INSTANCE, indexMiniChart.miniChart);
                    int i3 = onWarmupCompleted + 83;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 4 / 4;
                    }
                } else if (indexMiniChart.miniChart != null) {
                }
            } else {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, indexMiniChart.base);
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, indexMiniChart.close);
                vylVar.onExtraCallback(serialDescriptor, 2, indexMiniChart.code);
                if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                }
            }
            vylVar.onExtraCallback(serialDescriptor, 4, indexMiniChart.name);
        }

        public final double onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            double d = this.base;
            int i4 = i3 + 45;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 94 / 0;
            }
            return d;
        }

        public final double IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            double d = this.close;
            int i5 = i3 + 43;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 68 / 0;
            }
            return d;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.code;
            int i5 = i3 + 125;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final MiniChart onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 47;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            MiniChart miniChart = this.miniChart;
            int i5 = i2 + 19;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return miniChart;
        }

        @liq
        public static final class MiniChart {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted = 1;
            private final List<Candle> candles;
            private final String code;
            private final String timezone;
            private final String tradingEnd;
            private final String tradingStart;
            public static final Companion Companion = new Companion(null);
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.data.model.watchlists.WidgetMiniCharts$IndexMiniChart$MiniChart$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 31;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerOnExtraCallback = WidgetMiniCharts.IndexMiniChart.MiniChart.onExtraCallback();
                    int i4 = onExtraCallback + 69;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        return kSerializerOnExtraCallback;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }), null, null, null, null};

            public MiniChart() {
                this((List) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ KSerializer onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 47;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return onTransact();
                }
                onTransact();
                throw null;
            }

            private static final /* synthetic */ KSerializer onTransact() {
                int i = 2 % 2;
                checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(WidgetMiniCharts$IndexMiniChart$MiniChart$Candle$$serializer.INSTANCE);
                int i2 = IAuthTabCallback + 49;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return checkcanopenlandingpage;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onWarmupCompleted + 107;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(obj instanceof MiniChart)) {
                    int i4 = IAuthTabCallback + 57;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                MiniChart miniChart = (MiniChart) obj;
                if (!Intrinsics.areEqual(this.candles, miniChart.candles) || !Intrinsics.areEqual(this.code, miniChart.code)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.timezone, miniChart.timezone)) {
                    int i6 = onWarmupCompleted + 9;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.tradingEnd, miniChart.tradingEnd)) {
                    return Intrinsics.areEqual(this.tradingStart, miniChart.tradingStart);
                }
                int i8 = IAuthTabCallback + 121;
                onWarmupCompleted = i8 % 128;
                return i8 % 2 == 0;
            }

            public int hashCode() {
                int iHashCode;
                int iHashCode2;
                int iHashCode3;
                int i = 2 % 2;
                List<Candle> list = this.candles;
                int iHashCode4 = 0;
                if (list == null) {
                    int i2 = IAuthTabCallback;
                    int i3 = i2 + 27;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = i2 + 101;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = list.hashCode();
                }
                String str = this.code;
                int iHashCode5 = str == null ? 0 : str.hashCode();
                String str2 = this.timezone;
                if (str2 == null) {
                    int i7 = IAuthTabCallback + 27;
                    onWarmupCompleted = i7 % 128;
                    iHashCode2 = i7 % 2 == 0 ? 1 : 0;
                } else {
                    iHashCode2 = str2.hashCode();
                }
                String str3 = this.tradingEnd;
                if (str3 == null) {
                    int i8 = IAuthTabCallback + 101;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    iHashCode3 = 0;
                } else {
                    iHashCode3 = str3.hashCode();
                }
                String str4 = this.tradingStart;
                if (str4 != null) {
                    int i10 = IAuthTabCallback + 45;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 == 0) {
                        str4.hashCode();
                        throw null;
                    }
                    iHashCode4 = str4.hashCode();
                }
                int i11 = (((((((iHashCode * 31) + iHashCode5) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4;
                int i12 = IAuthTabCallback + 55;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                return i11;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "MiniChart(candles=" + this.candles + ", code=" + this.code + ", timezone=" + this.timezone + ", tradingEnd=" + this.tradingEnd + ", tradingStart=" + this.tradingStart + ")";
                int i2 = IAuthTabCallback + 29;
                onWarmupCompleted = i2 % 128;
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

                public final KSerializer<MiniChart> serializer() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 45;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    WidgetMiniCharts$IndexMiniChart$MiniChart$$serializer widgetMiniCharts$IndexMiniChart$MiniChart$$serializer = WidgetMiniCharts$IndexMiniChart$MiniChart$$serializer.INSTANCE;
                    int i4 = onExtraCallback + 51;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        return widgetMiniCharts$IndexMiniChart$MiniChart$$serializer;
                    }
                    throw null;
                }
            }

            static {
                int i = onExtraCallback + 113;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            public /* synthetic */ MiniChart(int i, List list, String str, String str2, String str3, String str4, okycx okycxVar) {
                Object obj = null;
                if ((i & 1) == 0) {
                    this.candles = null;
                } else {
                    this.candles = list;
                }
                int i2 = 2 % 2;
                if ((i & 2) == 0) {
                    this.code = null;
                    int i3 = 2 % 2;
                } else {
                    this.code = str;
                }
                if ((i & 4) == 0) {
                    int i4 = onWarmupCompleted + 97;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    this.timezone = null;
                } else {
                    this.timezone = str2;
                    int i6 = 2 % 2;
                }
                if ((i & 8) == 0) {
                    int i7 = onWarmupCompleted + 31;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    this.tradingEnd = null;
                    if (i8 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i9 = 2 % 2;
                } else {
                    this.tradingEnd = str3;
                }
                if ((i & 16) != 0) {
                    this.tradingStart = str4;
                    return;
                }
                int i10 = onWarmupCompleted + 15;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                this.tradingStart = null;
                if (i11 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            public MiniChart(@Nullable List<Candle> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
                this.candles = list;
                this.code = str;
                this.timezone = str2;
                this.tradingEnd = str3;
                this.tradingStart = str4;
            }

            public static final /* synthetic */ Lazy[] IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 107;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                int i5 = i3 + 7;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return lazyArr;
                }
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[PHI: r1
              0x0025: PHI (r1v19 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
              (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
              (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
              (r1v26 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
             binds: [B:8:0x001f, B:10:0x0023, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
              0x0021: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
              (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
              (r1v26 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
             binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
            @JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final /* synthetic */ void onWarmupCompleted(MiniChart miniChart, vyl vylVar, SerialDescriptor serialDescriptor) {
                Lazy<KSerializer<Object>>[] lazyArr;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 65;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    lazyArr = $childSerializers;
                    if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                        if (miniChart.candles != null) {
                            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, (py) lazyArr[0].getValue(), miniChart.candles);
                            int i3 = IAuthTabCallback + 123;
                            onWarmupCompleted = i3 % 128;
                            int i4 = i3 % 2;
                        }
                    }
                } else {
                    lazyArr = $childSerializers;
                    if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                    int i5 = onWarmupCompleted + 119;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        String str = miniChart.code;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (miniChart.code != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, miniChart.code);
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 2) || miniChart.timezone != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, miniChart.timezone);
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                    int i6 = onWarmupCompleted + 25;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (miniChart.tradingEnd != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, miniChart.tradingEnd);
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 4) || miniChart.tradingStart != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, miniChart.tradingStart);
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ MiniChart(List list, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                String str5;
                String str6 = null;
                if ((i & 1) != 0) {
                    int i2 = onWarmupCompleted + 53;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    list = null;
                }
                String str7 = (i & 2) != 0 ? null : str;
                if ((i & 4) != 0) {
                    int i4 = IAuthTabCallback + 99;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    str5 = null;
                } else {
                    str5 = str2;
                }
                String str8 = (i & 8) != 0 ? null : str3;
                if ((i & 16) != 0) {
                    int i6 = IAuthTabCallback + 89;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = 2 % 2;
                } else {
                    str6 = str4;
                }
                this(list, str7, str5, str8, str6);
            }

            public final List<Candle> onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 59;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                List<Candle> list = this.candles;
                int i4 = i3 + 95;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return list;
            }

            public final String onNavigationEvent() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 67;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                String str = this.tradingEnd;
                int i5 = i3 + 123;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @liq
            public static final class Candle {
                public static final Companion Companion = new Companion(null);
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted = 1;
                private final String endDate;
                private final double price;
                private final String startDate;

                static {
                    int i = onExtraCallbackWithResult + 57;
                    onNavigationEvent = i % 128;
                    int i2 = i % 2;
                }

                public boolean equals(@Nullable Object obj) {
                    int i = 2 % 2;
                    if (this == obj) {
                        int i2 = onExtraCallback + 69;
                        onWarmupCompleted = i2 % 128;
                        int i3 = i2 % 2;
                        return true;
                    }
                    if (!(obj instanceof Candle)) {
                        return false;
                    }
                    Candle candle = (Candle) obj;
                    if (!Intrinsics.areEqual(this.endDate, candle.endDate)) {
                        int i4 = onExtraCallback + 25;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        return false;
                    }
                    if (Double.compare(this.price, candle.price) != 0) {
                        int i6 = onWarmupCompleted + 41;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        return false;
                    }
                    if (Intrinsics.areEqual(this.startDate, candle.startDate)) {
                        return true;
                    }
                    int i8 = onWarmupCompleted + 73;
                    onExtraCallback = i8 % 128;
                    return i8 % 2 != 0;
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 7;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    int iHashCode = (((this.endDate.hashCode() * 31) + Double.hashCode(this.price)) * 31) + this.startDate.hashCode();
                    int i4 = onWarmupCompleted + 63;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return iHashCode;
                    }
                    throw null;
                }

                public String toString() {
                    int i = 2 % 2;
                    String str = "Candle(endDate=" + this.endDate + ", price=" + this.price + ", startDate=" + this.startDate + ")";
                    int i2 = onWarmupCompleted + 35;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return str;
                }

                public static final class Companion {
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<Candle> serializer() {
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 63;
                        onExtraCallback = i2 % 128;
                        int i3 = i2 % 2;
                        WidgetMiniCharts$IndexMiniChart$MiniChart$Candle$$serializer widgetMiniCharts$IndexMiniChart$MiniChart$Candle$$serializer = WidgetMiniCharts$IndexMiniChart$MiniChart$Candle$$serializer.INSTANCE;
                        if (i3 != 0) {
                            int i4 = 70 / 0;
                        }
                        return widgetMiniCharts$IndexMiniChart$MiniChart$Candle$$serializer;
                    }
                }

                public /* synthetic */ Candle(int i, String str, double d, String str2, okycx okycxVar) {
                    SerialDescriptor descriptor;
                    int i2 = 7;
                    if (7 != (i & 7)) {
                        int i3 = onWarmupCompleted + 3;
                        onExtraCallback = i3 % 128;
                        if (i3 % 2 != 0) {
                            descriptor = WidgetMiniCharts$IndexMiniChart$MiniChart$Candle$$serializer.INSTANCE.getDescriptor();
                            i2 = 97;
                        } else {
                            descriptor = WidgetMiniCharts$IndexMiniChart$MiniChart$Candle$$serializer.INSTANCE.getDescriptor();
                        }
                        htf31.onExtraCallbackWithResult(i, i2, descriptor);
                        int i4 = 2 % 2;
                    }
                    this.endDate = str;
                    this.price = d;
                    this.startDate = str2;
                }

                @JvmStatic
                public static final /* synthetic */ void onExtraCallback(Candle candle, vyl vylVar, SerialDescriptor serialDescriptor) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 53;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    vylVar.onExtraCallback(serialDescriptor, 0, candle.endDate);
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, candle.price);
                    vylVar.onExtraCallback(serialDescriptor, 2, candle.startDate);
                    int i4 = onExtraCallback + 101;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 67 / 0;
                    }
                }

                public final String onWarmupCompleted() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback;
                    int i3 = i2 + 101;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    String str = this.endDate;
                    int i5 = i2 + 15;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        return str;
                    }
                    throw null;
                }

                public final double onExtraCallback() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 37;
                    int i3 = i2 % 128;
                    onWarmupCompleted = i3;
                    int i4 = i2 % 2;
                    double d = this.price;
                    int i5 = i3 + 5;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return d;
                }

                public final String IAuthTabCallback() {
                    String str;
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 85;
                    int i3 = i2 % 128;
                    onWarmupCompleted = i3;
                    if (i2 % 2 == 0) {
                        str = this.startDate;
                        int i4 = 77 / 0;
                    } else {
                        str = this.startDate;
                    }
                    int i5 = i3 + 33;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        return str;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            public final String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 81;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                String str = this.tradingStart;
                if (i3 != 0) {
                    int i4 = 47 / 0;
                }
                return str;
            }
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.name;
            int i5 = i3 + 97;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final List<ProductMiniChart> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.productMiniCharts;
        }
        throw null;
    }

    @liq
    public static final class ProductMiniChart {
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final Price base;
        private final Price baseWithoutAfter;
        private final Price close;
        private final Price closeWithoutAfter;
        private final String code;
        private final MiniChart miniChart;
        private final String name;

        static {
            int i = onWarmupCompleted + 13;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductMiniChart)) {
                return false;
            }
            ProductMiniChart productMiniChart = (ProductMiniChart) obj;
            if (!Intrinsics.areEqual(this.base, productMiniChart.base) || !Intrinsics.areEqual(this.close, productMiniChart.close) || !Intrinsics.areEqual(this.baseWithoutAfter, productMiniChart.baseWithoutAfter) || (!Intrinsics.areEqual(this.closeWithoutAfter, productMiniChart.closeWithoutAfter)) || !Intrinsics.areEqual(this.code, productMiniChart.code)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.miniChart, productMiniChart.miniChart)) {
                int i4 = onExtraCallbackWithResult + 5;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.name, productMiniChart.name)) {
                return true;
            }
            int i6 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
          0x001c: PHI (r1v19 im.toss.securities.widget.data.model.watchlists.Price) = 
          (r1v4 im.toss.securities.widget.data.model.watchlists.Price)
          (r1v21 im.toss.securities.widget.data.model.watchlists.Price)
         binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
          0x001c: PHI (r3v9 int) = (r3v0 int), (r3v10 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
          0x001a: PHI (r3v1 int) = (r3v0 int), (r3v10 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int hashCode() {
            Price price;
            int iHashCode;
            int iHashCode2;
            int iHashCode3;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i2 % 128;
            int iHashCode4 = 0;
            if (i2 % 2 != 0) {
                price = this.base;
                iHashCode = 1;
                iHashCode2 = price == null ? 0 : price.hashCode();
            } else {
                price = this.base;
                iHashCode = 0;
                if (price == null) {
                }
            }
            Price price2 = this.close;
            int iHashCode5 = price2 == null ? 0 : price2.hashCode();
            Price price3 = this.baseWithoutAfter;
            if (price3 == null) {
                iHashCode3 = 0;
            } else {
                iHashCode3 = price3.hashCode();
                int i3 = onExtraCallbackWithResult + 79;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 / 3;
                }
            }
            Price price4 = this.closeWithoutAfter;
            if (price4 == null) {
                int i5 = IAuthTabCallback;
                int i6 = i5 + 103;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i5 + 107;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
            } else {
                iHashCode4 = price4.hashCode();
            }
            int iHashCode6 = this.code.hashCode();
            MiniChart miniChart = this.miniChart;
            if (miniChart != null) {
                int i10 = IAuthTabCallback + 11;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    miniChart.hashCode();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                iHashCode = miniChart.hashCode();
            }
            int iHashCode7 = (((((((((((iHashCode2 * 31) + iHashCode5) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode6) * 31) + iHashCode) * 31) + this.name.hashCode();
            int i11 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            return iHashCode7;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ProductMiniChart(base=" + this.base + ", close=" + this.close + ", baseWithoutAfter=" + this.baseWithoutAfter + ", closeWithoutAfter=" + this.closeWithoutAfter + ", code=" + this.code + ", miniChart=" + this.miniChart + ", name=" + this.name + ")";
            int i2 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ProductMiniChart> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 3;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    WidgetMiniCharts$ProductMiniChart$$serializer widgetMiniCharts$ProductMiniChart$$serializer = WidgetMiniCharts$ProductMiniChart$$serializer.INSTANCE;
                    throw null;
                }
                WidgetMiniCharts$ProductMiniChart$$serializer widgetMiniCharts$ProductMiniChart$$serializer2 = WidgetMiniCharts$ProductMiniChart$$serializer.INSTANCE;
                int i3 = onWarmupCompleted + 53;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return widgetMiniCharts$ProductMiniChart$$serializer2;
            }
        }

        public /* synthetic */ ProductMiniChart(int i, Price price, Price price2, Price price3, Price price4, String str, MiniChart miniChart, String str2, okycx okycxVar) {
            if (80 != (i & 80)) {
                htf31.onExtraCallbackWithResult(i, 80, WidgetMiniCharts$ProductMiniChart$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.base = null;
            } else {
                this.base = price;
            }
            if ((i & 2) == 0) {
                int i2 = IAuthTabCallback + 67;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                this.close = null;
                int i4 = 2 % 2;
            } else {
                this.close = price2;
            }
            if ((i & 4) == 0) {
                this.baseWithoutAfter = null;
            } else {
                this.baseWithoutAfter = price3;
                int i5 = onExtraCallbackWithResult + 51;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            }
            if ((i & 8) == 0) {
                int i8 = IAuthTabCallback + 17;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                this.closeWithoutAfter = null;
            } else {
                this.closeWithoutAfter = price4;
                int i10 = 2 % 2;
            }
            this.code = str;
            if ((i & 32) == 0) {
                int i11 = IAuthTabCallback + 23;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                this.miniChart = null;
            } else {
                this.miniChart = miniChart;
            }
            this.name = str2;
            int i13 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void IAuthTabCallback(ProductMiniChart productMiniChart, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || productMiniChart.base != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, Price$$serializer.INSTANCE, productMiniChart.base);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i4 = IAuthTabCallback + 69;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                if (productMiniChart.close != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, Price$$serializer.INSTANCE, productMiniChart.close);
                    int i6 = onExtraCallbackWithResult + 95;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 2) || productMiniChart.baseWithoutAfter != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, Price$$serializer.INSTANCE, productMiniChart.baseWithoutAfter);
                int i8 = IAuthTabCallback + 5;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
            }
            if (!(!vylVar.onWarmupCompleted(serialDescriptor, 3)) || productMiniChart.closeWithoutAfter != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, Price$$serializer.INSTANCE, productMiniChart.closeWithoutAfter);
                int i10 = IAuthTabCallback + 79;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
            }
            vylVar.onExtraCallback(serialDescriptor, 4, productMiniChart.code);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
                int i12 = IAuthTabCallback + 43;
                onExtraCallbackWithResult = i12 % 128;
                if (i12 % 2 != 0) {
                    MiniChart miniChart = productMiniChart.miniChart;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (productMiniChart.miniChart != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 5, WidgetMiniCharts$ProductMiniChart$MiniChart$$serializer.INSTANCE, productMiniChart.miniChart);
                }
            }
            vylVar.onExtraCallback(serialDescriptor, 6, productMiniChart.name);
        }

        public final Price onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Price price = this.base;
            int i5 = i3 + 59;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return price;
        }

        public final Price onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Price price = this.close;
            if (i3 == 0) {
                int i4 = 70 / 0;
            }
            return price;
        }

        public final Price IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 25;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Price price = this.baseWithoutAfter;
            int i5 = i2 + 73;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return price;
        }

        public final Price onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 105;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Price price = this.closeWithoutAfter;
            int i4 = i2 + 121;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return price;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 49;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.code;
            int i5 = i2 + 103;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 60 / 0;
            }
            return str;
        }

        public final MiniChart IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.miniChart;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @liq
        public static final class MiniChart {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            private final List<Candle> candles;
            private final String code;
            private final String timezone;
            private final String tradingEnd;
            private final String tradingStart;
            public static final Companion Companion = new Companion(null);
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.data.model.watchlists.WidgetMiniCharts$ProductMiniChart$MiniChart$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 35;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerOnExtraCallback = WidgetMiniCharts.ProductMiniChart.MiniChart.onExtraCallback();
                    int i4 = onNavigationEvent + 39;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializerOnExtraCallback;
                }
            }), null, null, null, null};

            public MiniChart() {
                this((List) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
            }

            private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
                int i = 2 % 2;
                checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(WidgetMiniCharts$ProductMiniChart$MiniChart$Candle$$serializer.INSTANCE);
                int i2 = IAuthTabCallback + 65;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return checkcanopenlandingpage;
            }

            public static /* synthetic */ KSerializer onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 125;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
                int i4 = onExtraCallbackWithResult + 99;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 19 / 0;
                }
                return kSerializerIAuthTabCallbackDefault;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 125;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MiniChart)) {
                    return false;
                }
                MiniChart miniChart = (MiniChart) obj;
                if (!Intrinsics.areEqual(this.candles, miniChart.candles)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.code, miniChart.code)) {
                    int i3 = onExtraCallbackWithResult + 123;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.timezone, miniChart.timezone)) {
                    int i5 = onExtraCallbackWithResult + 37;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.tradingEnd, miniChart.tradingEnd)) {
                    int i7 = IAuthTabCallback + 53;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.tradingStart, miniChart.tradingStart)) {
                    return true;
                }
                int i9 = onExtraCallbackWithResult + 55;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                List<Candle> list = this.candles;
                int iHashCode2 = list == null ? 0 : list.hashCode();
                String str = this.code;
                if (str == null) {
                    int i2 = onExtraCallbackWithResult + 15;
                    int i3 = i2 % 128;
                    IAuthTabCallback = i3;
                    int i4 = i2 % 2;
                    int i5 = i3 + 47;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = str.hashCode();
                }
                String str2 = this.timezone;
                int iHashCode3 = str2 == null ? 0 : str2.hashCode();
                String str3 = this.tradingEnd;
                int iHashCode4 = str3 == null ? 0 : str3.hashCode();
                String str4 = this.tradingStart;
                return (((((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
            }

            public String toString() {
                int i = 2 % 2;
                String str = "MiniChart(candles=" + this.candles + ", code=" + this.code + ", timezone=" + this.timezone + ", tradingEnd=" + this.tradingEnd + ", tradingStart=" + this.tradingStart + ")";
                int i2 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i2 % 128;
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

                public final KSerializer<MiniChart> serializer() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 29;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 == 0) {
                        WidgetMiniCharts$ProductMiniChart$MiniChart$$serializer widgetMiniCharts$ProductMiniChart$MiniChart$$serializer = WidgetMiniCharts$ProductMiniChart$MiniChart$$serializer.INSTANCE;
                        throw null;
                    }
                    WidgetMiniCharts$ProductMiniChart$MiniChart$$serializer widgetMiniCharts$ProductMiniChart$MiniChart$$serializer2 = WidgetMiniCharts$ProductMiniChart$MiniChart$$serializer.INSTANCE;
                    int i3 = onWarmupCompleted + 91;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        return widgetMiniCharts$ProductMiniChart$MiniChart$$serializer2;
                    }
                    throw null;
                }
            }

            static {
                int i = onNavigationEvent + 61;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            public /* synthetic */ MiniChart(int i, List list, String str, String str2, String str3, String str4, okycx okycxVar) {
                if ((i & 1) == 0) {
                    this.candles = null;
                } else {
                    this.candles = list;
                    int i2 = IAuthTabCallback + 119;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                }
                if ((i & 2) == 0) {
                    int i5 = IAuthTabCallback + 79;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    this.code = null;
                } else {
                    this.code = str;
                    int i7 = 2 % 2;
                }
                if ((i & 4) == 0) {
                    this.timezone = null;
                } else {
                    this.timezone = str2;
                    int i8 = onExtraCallbackWithResult + 103;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 2 % 2;
                    }
                }
                if ((i & 8) == 0) {
                    int i10 = onExtraCallbackWithResult + 15;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    this.tradingEnd = null;
                } else {
                    this.tradingEnd = str3;
                }
                if ((i & 16) == 0) {
                    this.tradingStart = null;
                } else {
                    this.tradingStart = str4;
                }
            }

            public MiniChart(@Nullable List<Candle> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
                this.candles = list;
                this.code = str;
                this.timezone = str2;
                this.tradingEnd = str3;
                this.tradingStart = str4;
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
            @JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final /* synthetic */ void onExtraCallback(MiniChart miniChart, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                if (vylVar.onWarmupCompleted(serialDescriptor, 0) || miniChart.candles != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, (py) lazyArr[0].getValue(), miniChart.candles);
                    int i2 = onExtraCallbackWithResult + 37;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 1) || miniChart.code != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, miniChart.code);
                }
                Object obj = null;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                    int i4 = onExtraCallbackWithResult + 55;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        String str = miniChart.timezone;
                        obj.hashCode();
                        throw null;
                    }
                    if (miniChart.timezone != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, miniChart.timezone);
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                    int i5 = IAuthTabCallback + 33;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    if (miniChart.tradingEnd != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, miniChart.tradingEnd);
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
                    int i7 = IAuthTabCallback + 69;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 == 0) {
                        String str2 = miniChart.tradingStart;
                        obj.hashCode();
                        throw null;
                    }
                    if (miniChart.tradingStart == null) {
                        return;
                    }
                }
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, miniChart.tradingStart);
            }

            public static final /* synthetic */ Lazy[] onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 3;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                int i5 = i2 + 1;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return lazyArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ MiniChart(List list, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                String str5;
                String str6;
                String str7;
                if ((i & 1) != 0) {
                    int i2 = 2 % 2;
                    list = null;
                }
                if ((i & 2) != 0) {
                    int i3 = IAuthTabCallback + 13;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 35 / 0;
                    }
                    int i5 = 2 % 2;
                    str5 = null;
                } else {
                    str5 = str;
                }
                if ((i & 4) != 0) {
                    int i6 = onExtraCallbackWithResult + 17;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 81 / 0;
                    }
                    int i8 = 2 % 2;
                    str6 = null;
                } else {
                    str6 = str2;
                }
                if ((i & 8) != 0) {
                    int i9 = 2 % 2;
                    str7 = null;
                } else {
                    str7 = str3;
                }
                this(list, str5, str6, str7, (i & 16) == 0 ? str4 : null);
            }

            public final List<Candle> onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 29;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.candles;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 21;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                String str = this.tradingEnd;
                int i5 = i3 + 65;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @liq
            public static final class Candle {
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;
                private static int onWarmupCompleted;
                private final Double base;
                private final double close;
                private final String endDate;
                private final Double high;
                private final Double low;
                private final Double open;
                private final SessionType sessionType;
                private final String startDate;
                public static final Companion Companion = new Companion(null);
                private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.data.model.watchlists.WidgetMiniCharts$ProductMiniChart$MiniChart$Candle$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i = 2 % 2;
                        int i2 = onNavigationEvent + 35;
                        IAuthTabCallback = i2 % 128;
                        int i3 = i2 % 2;
                        KSerializer kSerializerOnWarmupCompleted = WidgetMiniCharts.ProductMiniChart.MiniChart.Candle.onWarmupCompleted();
                        int i4 = IAuthTabCallback + 71;
                        onNavigationEvent = i4 % 128;
                        if (i4 % 2 == 0) {
                            return kSerializerOnWarmupCompleted;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                })};

                private static final /* synthetic */ KSerializer asInterface() {
                    KSerializer kSerializerSerializer;
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 95;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        kSerializerSerializer = SessionType.Companion.serializer();
                        int i3 = 19 / 0;
                    } else {
                        kSerializerSerializer = SessionType.Companion.serializer();
                    }
                    int i4 = onNavigationEvent + 45;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializerSerializer;
                }

                public static /* synthetic */ KSerializer onWarmupCompleted() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 85;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        return asInterface();
                    }
                    asInterface();
                    throw null;
                }

                public boolean equals(@Nullable Object obj) {
                    int i = 2 % 2;
                    if (this == obj) {
                        int i2 = onExtraCallbackWithResult + 113;
                        onNavigationEvent = i2 % 128;
                        return i2 % 2 == 0;
                    }
                    if (!(obj instanceof Candle)) {
                        int i3 = onExtraCallbackWithResult + 9;
                        onNavigationEvent = i3 % 128;
                        int i4 = i3 % 2;
                        return false;
                    }
                    Candle candle = (Candle) obj;
                    if (!Intrinsics.areEqual(this.base, candle.base)) {
                        int i5 = onExtraCallbackWithResult + 23;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        return false;
                    }
                    if (Double.compare(this.close, candle.close) != 0) {
                        return false;
                    }
                    if (!Intrinsics.areEqual(this.endDate, candle.endDate)) {
                        int i7 = onNavigationEvent + 121;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        return false;
                    }
                    if (Intrinsics.areEqual(this.high, candle.high)) {
                        return Intrinsics.areEqual(this.low, candle.low) && Intrinsics.areEqual(this.open, candle.open) && Intrinsics.areEqual(this.startDate, candle.startDate) && this.sessionType == candle.sessionType;
                    }
                    int i9 = onExtraCallbackWithResult + 9;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    return false;
                }

                public int hashCode() {
                    int iHashCode;
                    int iHashCode2;
                    int i = 2 % 2;
                    Double d = this.base;
                    int iHashCode3 = 0;
                    if (d == null) {
                        int i2 = onNavigationEvent + 3;
                        onExtraCallbackWithResult = i2 % 128;
                        int i3 = i2 % 2;
                        iHashCode = 0;
                    } else {
                        iHashCode = d.hashCode();
                    }
                    int iHashCode4 = Double.hashCode(this.close);
                    int iHashCode5 = this.endDate.hashCode();
                    Double d2 = this.high;
                    int iHashCode6 = d2 == null ? 0 : d2.hashCode();
                    Double d3 = this.low;
                    int iHashCode7 = d3 == null ? 0 : d3.hashCode();
                    Double d4 = this.open;
                    if (d4 == null) {
                        int i4 = onExtraCallbackWithResult + 11;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                        iHashCode2 = 0;
                    } else {
                        iHashCode2 = d4.hashCode();
                    }
                    int iHashCode8 = this.startDate.hashCode();
                    SessionType sessionType = this.sessionType;
                    if (sessionType != null) {
                        int i6 = onNavigationEvent + 51;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        iHashCode3 = sessionType.hashCode();
                    }
                    return (((((((((((((iHashCode * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode8) * 31) + iHashCode3;
                }

                public String toString() {
                    int i = 2 % 2;
                    String str = "Candle(base=" + this.base + ", close=" + this.close + ", endDate=" + this.endDate + ", high=" + this.high + ", low=" + this.low + ", open=" + this.open + ", startDate=" + this.startDate + ", sessionType=" + this.sessionType + ")";
                    int i2 = onNavigationEvent + 61;
                    onExtraCallbackWithResult = i2 % 128;
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

                    public final KSerializer<Candle> serializer() {
                        WidgetMiniCharts$ProductMiniChart$MiniChart$Candle$$serializer widgetMiniCharts$ProductMiniChart$MiniChart$Candle$$serializer;
                        int i = 2 % 2;
                        int i2 = onWarmupCompleted + 1;
                        onExtraCallbackWithResult = i2 % 128;
                        if (i2 % 2 == 0) {
                            widgetMiniCharts$ProductMiniChart$MiniChart$Candle$$serializer = WidgetMiniCharts$ProductMiniChart$MiniChart$Candle$$serializer.INSTANCE;
                            int i3 = 35 / 0;
                        } else {
                            widgetMiniCharts$ProductMiniChart$MiniChart$Candle$$serializer = WidgetMiniCharts$ProductMiniChart$MiniChart$Candle$$serializer.INSTANCE;
                        }
                        int i4 = onExtraCallbackWithResult + 7;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 == 0) {
                            return widgetMiniCharts$ProductMiniChart$MiniChart$Candle$$serializer;
                        }
                        throw null;
                    }
                }

                static {
                    int i = IAuthTabCallback + 27;
                    onWarmupCompleted = i % 128;
                    if (i % 2 != 0) {
                        int i2 = 23 / 0;
                    }
                }

                public /* synthetic */ Candle(int i, Double d, double d2, String str, Double d3, Double d4, Double d5, String str2, SessionType sessionType, okycx okycxVar) {
                    SerialDescriptor descriptor;
                    int i2 = 70;
                    if (70 != (i & 70)) {
                        int i3 = onNavigationEvent + 53;
                        onExtraCallbackWithResult = i3 % 128;
                        if (i3 % 2 == 0) {
                            descriptor = WidgetMiniCharts$ProductMiniChart$MiniChart$Candle$$serializer.INSTANCE.getDescriptor();
                            i2 = 32;
                        } else {
                            descriptor = WidgetMiniCharts$ProductMiniChart$MiniChart$Candle$$serializer.INSTANCE.getDescriptor();
                        }
                        htf31.onExtraCallbackWithResult(i, i2, descriptor);
                        int i4 = 2 % 2;
                    }
                    if ((i & 1) == 0) {
                        this.base = null;
                        int i5 = onNavigationEvent + 107;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 2 % 2;
                        }
                    } else {
                        this.base = d;
                    }
                    this.close = d2;
                    this.endDate = str;
                    if ((i & 8) == 0) {
                        this.high = null;
                    } else {
                        this.high = d3;
                    }
                    if ((i & 16) == 0) {
                        int i7 = onNavigationEvent + 63;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        this.low = null;
                    } else {
                        this.low = d4;
                    }
                    if ((i & 32) == 0) {
                        this.open = null;
                    } else {
                        this.open = d5;
                        int i9 = 2 % 2;
                    }
                    this.startDate = str2;
                    if ((i & 128) != 0) {
                        this.sessionType = sessionType;
                        return;
                    }
                    int i10 = onNavigationEvent + 65;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    this.sessionType = null;
                    if (i11 == 0) {
                        int i12 = 91 / 0;
                    }
                }

                public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent;
                    int i3 = i2 + 11;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                    int i5 = i2 + 99;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        return lazyArr;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
                @JvmStatic
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final /* synthetic */ void onNavigationEvent(Candle candle, vyl vylVar, SerialDescriptor serialDescriptor) {
                    int i = 2 % 2;
                    Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                    if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                        int i2 = onNavigationEvent + 107;
                        onExtraCallbackWithResult = i2 % 128;
                        int i3 = i2 % 2;
                        if (candle.base != null) {
                            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, setVideoListener.onWarmupCompleted, candle.base);
                        }
                    }
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, candle.close);
                    vylVar.onExtraCallback(serialDescriptor, 2, candle.endDate);
                    if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                        int i4 = onExtraCallbackWithResult + 33;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                        if (candle.high != null) {
                            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, setVideoListener.onWarmupCompleted, candle.high);
                        }
                    }
                    if (vylVar.onWarmupCompleted(serialDescriptor, 4) || candle.low != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, setVideoListener.onWarmupCompleted, candle.low);
                    }
                    if (vylVar.onWarmupCompleted(serialDescriptor, 5) || candle.open != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 5, setVideoListener.onWarmupCompleted, candle.open);
                    }
                    vylVar.onExtraCallback(serialDescriptor, 6, candle.startDate);
                    if ((!vylVar.onWarmupCompleted(serialDescriptor, 7)) && candle.sessionType == null) {
                        return;
                    }
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 7, (py) lazyArr[7].getValue(), candle.sessionType);
                }

                public final double IAuthTabCallback() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 79;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        return this.close;
                    }
                    throw null;
                }

                public final String onNavigationEvent() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 55;
                    int i3 = i2 % 128;
                    onExtraCallbackWithResult = i3;
                    int i4 = i2 % 2;
                    String str = this.endDate;
                    int i5 = i3 + 75;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return str;
                }

                public final String IAuthTabCallbackDefault() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 51;
                    int i3 = i2 % 128;
                    onExtraCallbackWithResult = i3;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    String str = this.startDate;
                    int i4 = i3 + 93;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return str;
                }

                public final SessionType onExtraCallback() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 11;
                    int i3 = i2 % 128;
                    onNavigationEvent = i3;
                    int i4 = i2 % 2;
                    SessionType sessionType = this.sessionType;
                    int i5 = i3 + 29;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 24 / 0;
                    }
                    return sessionType;
                }
            }

            public final String IAuthTabCallback() {
                String str;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 111;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    str = this.tradingStart;
                    int i4 = 11 / 0;
                } else {
                    str = this.tradingStart;
                }
                int i5 = i2 + 69;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }
        }

        public final String onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.name;
            int i5 = i3 + 121;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }
}
