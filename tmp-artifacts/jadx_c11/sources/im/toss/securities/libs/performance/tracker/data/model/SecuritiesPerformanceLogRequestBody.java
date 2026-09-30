package im.toss.securities.libs.performance.tracker.data.model;

import java.util.List;
import java.util.Map;
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
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class SecuritiesPerformanceLogRequestBody {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final Map<String, String> customDimension;
    private final String logType;
    private final String metricName;
    private final List<MetricRequestBody> metrics;
    private final String sourceType;
    private final String viewName;

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(MetricRequestBody$$serializer.INSTANCE);
        int i2 = onNavigationEvent + 93;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getwrigglelayout, getwrigglelayout);
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return getmutilbackgrounddrawable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        int i4 = IAuthTabCallback + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 39;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecuritiesPerformanceLogRequestBody)) {
            int i4 = i2 + 63;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        SecuritiesPerformanceLogRequestBody securitiesPerformanceLogRequestBody = (SecuritiesPerformanceLogRequestBody) obj;
        if (!Intrinsics.areEqual(this.logType, securitiesPerformanceLogRequestBody.logType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.metrics, securitiesPerformanceLogRequestBody.metrics)) {
            int i6 = onNavigationEvent + 45;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.customDimension, securitiesPerformanceLogRequestBody.customDimension)) {
            int i8 = onNavigationEvent + 77;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.viewName, securitiesPerformanceLogRequestBody.viewName)) {
            return false;
        }
        if (Intrinsics.areEqual(this.sourceType, securitiesPerformanceLogRequestBody.sourceType)) {
            return Intrinsics.areEqual(this.metricName, securitiesPerformanceLogRequestBody.metricName);
        }
        int i10 = IAuthTabCallback + 57;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.logType.hashCode() * 31) + this.metrics.hashCode()) * 31) + this.customDimension.hashCode()) * 31) + this.viewName.hashCode()) * 31) + this.sourceType.hashCode()) * 31) + this.metricName.hashCode();
        int i4 = IAuthTabCallback + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SecuritiesPerformanceLogRequestBody(logType=" + this.logType + ", metrics=" + this.metrics + ", customDimension=" + this.customDimension + ", viewName=" + this.viewName + ", sourceType=" + this.sourceType + ", metricName=" + this.metricName + ")";
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SecuritiesPerformanceLogRequestBody> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            SecuritiesPerformanceLogRequestBody$$serializer securitiesPerformanceLogRequestBody$$serializer = SecuritiesPerformanceLogRequestBody$$serializer.INSTANCE;
            int i4 = onExtraCallback + 9;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return securitiesPerformanceLogRequestBody$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.libs.performance.tracker.data.model.SecuritiesPerformanceLogRequestBody$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 63;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    SecuritiesPerformanceLogRequestBody.onNavigationEvent();
                    throw null;
                }
                KSerializer kSerializerOnNavigationEvent = SecuritiesPerformanceLogRequestBody.onNavigationEvent();
                int i3 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return kSerializerOnNavigationEvent;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.libs.performance.tracker.data.model.SecuritiesPerformanceLogRequestBody$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 101;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return SecuritiesPerformanceLogRequestBody.onWarmupCompleted();
                }
                SecuritiesPerformanceLogRequestBody.onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), null, null, null};
        int i = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ SecuritiesPerformanceLogRequestBody(int i, String str, List list, Map map, String str2, String str3, String str4, okycx okycxVar) {
        if (63 != (i & 63)) {
            int i2 = IAuthTabCallback + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 63, SecuritiesPerformanceLogRequestBody$$serializer.INSTANCE.getDescriptor());
            int i4 = onNavigationEvent + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.logType = str;
        this.metrics = list;
        this.customDimension = map;
        this.viewName = str2;
        this.sourceType = str3;
        this.metricName = str4;
    }

    public SecuritiesPerformanceLogRequestBody(@NotNull String str, @NotNull List<MetricRequestBody> list, @NotNull Map<String, String> map, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.logType = str;
        this.metrics = list;
        this.customDimension = map;
        this.viewName = str2;
        this.sourceType = str3;
        this.metricName = str4;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(SecuritiesPerformanceLogRequestBody securitiesPerformanceLogRequestBody, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, securitiesPerformanceLogRequestBody.logType);
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), securitiesPerformanceLogRequestBody.metrics);
        vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), securitiesPerformanceLogRequestBody.customDimension);
        vylVar.onExtraCallback(serialDescriptor, 3, securitiesPerformanceLogRequestBody.viewName);
        vylVar.onExtraCallback(serialDescriptor, 4, securitiesPerformanceLogRequestBody.sourceType);
        vylVar.onExtraCallback(serialDescriptor, 5, securitiesPerformanceLogRequestBody.metricName);
        int i4 = onNavigationEvent + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i3 + 89;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return lazyArr;
        }
        throw null;
    }
}
