package im.toss.securities.libs.performance.tracker.data.model;

import im.toss.securities.libs.performance.tracker.data.model.DeviceOption$;
import im.toss.securities.libs.performance.tracker.data.model.SecuritiesPerformanceReqeustBody$;
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

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class SecuritiesPerformanceReqeustBody {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final DeviceOption deviceOption;
    private final List<SecuritiesPerformanceLogRequestBody> logBody;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.libs.performance.tracker.data.model.SecuritiesPerformanceReqeustBody$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallback = SecuritiesPerformanceReqeustBody.IAuthTabCallback();
            int i4 = IAuthTabCallback + 7;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerIAuthTabCallback;
        }
    })};

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        throw null;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(SecuritiesPerformanceLogRequestBody$$serializer.INSTANCE);
        int i2 = onExtraCallback + 123;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 65 / 0;
        }
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof SecuritiesPerformanceReqeustBody)) {
            int i4 = onNavigationEvent + 9;
            onExtraCallback = i4 % 128;
            return i4 % 2 == 0;
        }
        SecuritiesPerformanceReqeustBody securitiesPerformanceReqeustBody = (SecuritiesPerformanceReqeustBody) obj;
        if (!Intrinsics.areEqual(this.deviceOption, securitiesPerformanceReqeustBody.deviceOption)) {
            int i5 = onExtraCallback + 107;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.logBody, securitiesPerformanceReqeustBody.logBody)) {
            return true;
        }
        int i7 = onNavigationEvent + 93;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onNavigationEvent = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.deviceOption.hashCode() >> 46) << this.logBody.hashCode() : (this.deviceOption.hashCode() * 31) + this.logBody.hashCode();
        int i3 = onExtraCallback + 119;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SecuritiesPerformanceReqeustBody(deviceOption=" + this.deviceOption + ", logBody=" + this.logBody + ")";
        int i2 = onExtraCallback + 107;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SecuritiesPerformanceReqeustBody> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            SecuritiesPerformanceReqeustBody$.serializer serializerVar = SecuritiesPerformanceReqeustBody$.serializer.INSTANCE;
            int i4 = onExtraCallback + 113;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        int i = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 85 / 0;
        }
    }

    public /* synthetic */ SecuritiesPerformanceReqeustBody(int i, DeviceOption deviceOption, List list, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onNavigationEvent + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, SecuritiesPerformanceReqeustBody$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 95;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.deviceOption = deviceOption;
        this.logBody = list;
    }

    public SecuritiesPerformanceReqeustBody(@NotNull DeviceOption deviceOption, @NotNull List<SecuritiesPerformanceLogRequestBody> list) {
        Intrinsics.checkNotNullParameter(deviceOption, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.deviceOption = deviceOption;
        this.logBody = list;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            lazyArr = $childSerializers;
            int i4 = 88 / 0;
        } else {
            lazyArr = $childSerializers;
        }
        int i5 = i3 + 71;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(SecuritiesPerformanceReqeustBody securitiesPerformanceReqeustBody, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onNavigationEvent(serialDescriptor, 1, DeviceOption$.serializer.INSTANCE, securitiesPerformanceReqeustBody.deviceOption);
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), securitiesPerformanceReqeustBody.logBody);
        } else {
            Lazy<KSerializer<Object>>[] lazyArr2 = $childSerializers;
            vylVar.onNavigationEvent(serialDescriptor, 0, DeviceOption$.serializer.INSTANCE, securitiesPerformanceReqeustBody.deviceOption);
            vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr2[1].getValue(), securitiesPerformanceReqeustBody.logBody);
        }
    }
}
