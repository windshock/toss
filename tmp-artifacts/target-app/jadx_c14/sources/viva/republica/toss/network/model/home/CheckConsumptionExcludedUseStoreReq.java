package viva.republica.toss.network.model.home;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.getFormatWidth;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.home.CheckConsumptionExcludedUseStoreReq$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CheckConsumptionExcludedUseStoreReq {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String methodType;
    private final getFormatWidth transactionType;
    private final String useStore;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.home.CheckConsumptionExcludedUseStoreReq$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            KSerializer kSerializerIAuthTabCallback;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                kSerializerIAuthTabCallback = CheckConsumptionExcludedUseStoreReq.IAuthTabCallback();
                int i3 = 43 / 0;
            } else {
                kSerializerIAuthTabCallback = CheckConsumptionExcludedUseStoreReq.IAuthTabCallback();
            }
            int i4 = onNavigationEvent + 121;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }), null};

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnNavigationEvent = onNavigationEvent();
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return kSerializerOnNavigationEvent;
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.home.TransactionType", getFormatWidth.values());
        int i4 = onNavigationEvent + 91;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckConsumptionExcludedUseStoreReq)) {
            int i5 = i3 + 91;
            onExtraCallback = i5 % 128;
            return i5 % 2 == 0;
        }
        CheckConsumptionExcludedUseStoreReq checkConsumptionExcludedUseStoreReq = (CheckConsumptionExcludedUseStoreReq) obj;
        if (Intrinsics.areEqual(this.methodType, checkConsumptionExcludedUseStoreReq.methodType)) {
            return this.transactionType == checkConsumptionExcludedUseStoreReq.transactionType && Intrinsics.areEqual(this.useStore, checkConsumptionExcludedUseStoreReq.useStore);
        }
        int i6 = onNavigationEvent + 13;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 67;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            this.methodType.hashCode();
            throw null;
        }
        int iHashCode = this.methodType.hashCode();
        getFormatWidth getformatwidth = this.transactionType;
        if (getformatwidth == null) {
            int i4 = onExtraCallback + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            i = 0;
        } else {
            int iHashCode2 = getformatwidth.hashCode();
            int i6 = onExtraCallback + 119;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            i = iHashCode2;
        }
        return (((iHashCode * 31) + i) * 31) + this.useStore.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CheckConsumptionExcludedUseStoreReq(methodType=" + this.methodType + ", transactionType=" + this.transactionType + ", useStore=" + this.useStore + ")";
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CheckConsumptionExcludedUseStoreReq> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            CheckConsumptionExcludedUseStoreReq$.serializer serializerVar = CheckConsumptionExcludedUseStoreReq$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 85;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 24 / 0;
            }
            return serializerVar;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ CheckConsumptionExcludedUseStoreReq(int i, String str, getFormatWidth getformatwidth, String str2, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = onExtraCallback + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, CheckConsumptionExcludedUseStoreReq$.serializer.INSTANCE.getDescriptor());
            int i4 = onNavigationEvent + 101;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 2;
            } else {
                int i6 = 2 % 2;
            }
        }
        this.methodType = str;
        this.transactionType = getformatwidth;
        this.useStore = str2;
    }

    public CheckConsumptionExcludedUseStoreReq(@NotNull String str, @Nullable getFormatWidth getformatwidth, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.methodType = str;
        this.transactionType = getformatwidth;
        this.useStore = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(CheckConsumptionExcludedUseStoreReq checkConsumptionExcludedUseStoreReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, checkConsumptionExcludedUseStoreReq.methodType);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazyArr[1].getValue(), checkConsumptionExcludedUseStoreReq.transactionType);
        vylVar.onExtraCallback(serialDescriptor, 2, checkConsumptionExcludedUseStoreReq.useStore);
        int i4 = onExtraCallback + 121;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        return lazyArr;
    }
}
