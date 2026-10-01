package im.toss.securities.libs.performance.tracker.data.model;

import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import im.toss.securities.libs.performance.tracker.data.model.v1.MetricBody;
import im.toss.securities.libs.performance.tracker.data.model.v1.MetricBody$$serializer;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.GetMotionInteractionState;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.nc;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@nc(IAuthTabCallback = "metric_v1")
@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MetricV1LogBody extends SecuritiesPerformanceLogBody {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final Map<String, Object> customDimension;
    private final String logId;
    private final String metricName;
    private final List<MetricBody> metrics;
    private final String sourceType;
    private final String viewName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private static final /* synthetic */ KSerializer access100() {
        int i = 2 % 2;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, GetMotionInteractionState.onExtraCallback);
        int i2 = onWarmupCompleted + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return getmutilbackgrounddrawable;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        KSerializer kSerializer = (KSerializer) onNavigationEvent(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[0], MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, -446665583, iOnExtraCallback2, 446665584);
        int i4 = onWarmupCompleted + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i6 | i4);
        int i8 = ~(i4 | i3);
        int i9 = i7 | i8;
        int i10 = ~i6;
        int i11 = ~i4;
        int i12 = (~(i10 | i3)) | (~(i10 | i11)) | (~(i11 | i3));
        int i13 = ~i3;
        int i14 = i12 | (~(i13 | i6 | i4));
        int i15 = (~(i13 | i11)) | i6 | i8;
        int i16 = i6 + i4 + i5 + (1962400304 * i) + (1167700406 * i2);
        int i17 = i16 * i16;
        int i18 = ((i6 * (-1019457937)) - 559939584) + ((-1019457937) * i4) + (2001489518 * i9) + (i14 * (-2001489518)) + ((-2001489518) * i15) + (1274019840 * i5) + ((-1660944384) * i) + ((-325058560) * i2) + (867827712 * i17);
        int i19 = ((i6 * (-1629562239)) - 1134582380) + (i4 * (-1629562239)) + (i9 * (-910)) + (i14 * 910) + (i15 * 910) + (i5 * (-1629561329)) + (i * (-1621399344)) + (i2 * (-873382486)) + (i17 * 1407582208);
        return i18 + ((i19 * i19) * (-1895432192)) != 1 ? onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return access100();
        }
        access100();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(MetricBody$$serializer.INSTANCE);
        int i2 = IAuthTabCallback + 53;
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
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetricV1LogBody)) {
            return false;
        }
        MetricV1LogBody metricV1LogBody = (MetricV1LogBody) obj;
        if (!Intrinsics.areEqual(this.metrics, metricV1LogBody.metrics)) {
            int i2 = onWarmupCompleted + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.customDimension, metricV1LogBody.customDimension)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.viewName, metricV1LogBody.viewName)) {
            int i4 = onWarmupCompleted + 31;
            IAuthTabCallback = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.sourceType, metricV1LogBody.sourceType)) {
            int i5 = IAuthTabCallback + 121;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.metricName, metricV1LogBody.metricName)) {
            return false;
        }
        if (Intrinsics.areEqual(this.logId, metricV1LogBody.logId)) {
            return true;
        }
        int i6 = onWarmupCompleted + 57;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.metrics.hashCode() * 31) + this.customDimension.hashCode()) * 31) + this.viewName.hashCode()) * 31) + this.sourceType.hashCode()) * 31) + this.metricName.hashCode()) * 31) + this.logId.hashCode();
        int i4 = onWarmupCompleted + 75;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MetricV1LogBody(metrics=" + this.metrics + ", customDimension=" + this.customDimension + ", viewName=" + this.viewName + ", sourceType=" + this.sourceType + ", metricName=" + this.metricName + ", logId=" + this.logId + ")";
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MetricV1LogBody> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            MetricV1LogBody$$serializer metricV1LogBody$$serializer = MetricV1LogBody$$serializer.INSTANCE;
            if (i3 != 0) {
                int i4 = 7 / 0;
            }
            return metricV1LogBody$$serializer;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.libs.performance.tracker.data.model.MetricV1LogBody$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                KSerializer kSerializerOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 121;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    kSerializerOnExtraCallbackWithResult = MetricV1LogBody.onExtraCallbackWithResult();
                    int i3 = 74 / 0;
                } else {
                    kSerializerOnExtraCallbackWithResult = MetricV1LogBody.onExtraCallbackWithResult();
                }
                int i4 = onWarmupCompleted + 105;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 69 / 0;
                }
                return kSerializerOnExtraCallbackWithResult;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.libs.performance.tracker.data.model.MetricV1LogBody$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                KSerializer kSerializerOnNavigationEvent;
                int i = 2 % 2;
                int i2 = onExtraCallback + 25;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    kSerializerOnNavigationEvent = MetricV1LogBody.onNavigationEvent();
                    int i3 = 61 / 0;
                } else {
                    kSerializerOnNavigationEvent = MetricV1LogBody.onNavigationEvent();
                }
                int i4 = onNavigationEvent + 41;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializerOnNavigationEvent;
                }
                throw null;
            }
        }), null, null, null, null};
        int i = onExtraCallback + 19;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MetricV1LogBody(int i, List list, Map map, String str, String str2, String str3, String str4, okycx okycxVar) {
        super(i, okycxVar);
        if (31 != (i & 31)) {
            int i2 = onWarmupCompleted + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 31, MetricV1LogBody$$serializer.INSTANCE.getDescriptor());
            int i4 = 2 % 2;
        }
        this.metrics = list;
        this.customDimension = map;
        this.viewName = str;
        this.sourceType = str2;
        this.metricName = str3;
        if ((i & 32) != 0) {
            this.logId = str4;
            return;
        }
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.logId = string;
        int i5 = onWarmupCompleted + 47;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricV1LogBody(@NotNull List<MetricBody> list, @NotNull Map<String, ? extends Object> map, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.metrics = list;
        this.customDimension = map;
        this.viewName = str;
        this.sourceType = str2;
        this.metricName = str3;
        this.logId = str4;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 5;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 53;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0063  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(MetricV1LogBody metricV1LogBody, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), metricV1LogBody.metrics);
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), metricV1LogBody.customDimension);
        vylVar.onExtraCallback(serialDescriptor, 2, metricV1LogBody.viewName);
        vylVar.onExtraCallback(serialDescriptor, 3, metricV1LogBody.sourceType);
        vylVar.onExtraCallback(serialDescriptor, 4, metricV1LogBody.metricName);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
            int i4 = onWarmupCompleted + 27;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            String strAsInterface = metricV1LogBody.asInterface();
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (!Intrinsics.areEqual(strAsInterface, string)) {
                vylVar.onExtraCallback(serialDescriptor, 5, metricV1LogBody.asInterface());
                int i6 = onWarmupCompleted + 49;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 / 4;
                }
            }
        }
        int i8 = IAuthTabCallback + 113;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MetricV1LogBody(List list, Map map, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 32) != 0) {
            int i2 = onWarmupCompleted + 79;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                str4 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str4, "");
                int i3 = IAuthTabCallback + 95;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 5 / 2;
                } else {
                    int i5 = 2 % 2;
                }
            } else {
                Intrinsics.checkNotNullExpressionValue(UUID.randomUUID().toString(), "");
                throw null;
            }
        }
        this(list, map, str, str2, str3, str4);
    }

    public final List<MetricBody> asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<MetricBody> list = this.metrics;
        int i4 = i3 + 47;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        MetricV1LogBody metricV1LogBody = (MetricV1LogBody) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 59;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = metricV1LogBody.customDimension;
        int i5 = i2 + 115;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.viewName;
        int i5 = i3 + 29;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.sourceType;
        int i5 = i3 + 23;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String onTransact() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 109;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.metricName;
            int i4 = 35 / 0;
        } else {
            str = this.metricName;
        }
        int i5 = i2 + 113;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // im.toss.securities.libs.performance.tracker.data.model.SecuritiesPerformanceLogBody
    public String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 13;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.logId;
        int i5 = i2 + 51;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static final /* synthetic */ KSerializer getInterfaceDescriptor() {
        int iOnExtraCallback = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (KSerializer) onNavigationEvent(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[0], MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, -446665583, iOnExtraCallback2, 446665584);
    }

    public final Map<String, Object> IAuthTabCallback() {
        int iOnExtraCallback = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (Map) onNavigationEvent(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, 1343709777, iOnExtraCallback2, -1343709777);
    }
}
