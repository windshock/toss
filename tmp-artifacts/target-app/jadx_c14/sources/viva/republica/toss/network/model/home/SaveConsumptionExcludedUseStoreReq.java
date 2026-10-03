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
import viva.republica.toss.network.model.home.SaveConsumptionExcludedUseStoreReq$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SaveConsumptionExcludedUseStoreReq {
    public static final int $stable = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final boolean excluded;
    private final String methodType;
    private final getFormatWidth transactionType;
    private final String useStore;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.home.SaveConsumptionExcludedUseStoreReq$$ExternalSyntheticLambda0
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnWarmupCompleted = SaveConsumptionExcludedUseStoreReq.onWarmupCompleted();
            int i4 = onWarmupCompleted + 43;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 86 / 0;
            }
            return kSerializerOnWarmupCompleted;
        }
    }), null, null};

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.home.TransactionType", getFormatWidth.values());
        }
        updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.home.TransactionType", getFormatWidth.values());
        throw null;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof SaveConsumptionExcludedUseStoreReq)) {
            return false;
        }
        SaveConsumptionExcludedUseStoreReq saveConsumptionExcludedUseStoreReq = (SaveConsumptionExcludedUseStoreReq) obj;
        if ((!Intrinsics.areEqual(this.methodType, saveConsumptionExcludedUseStoreReq.methodType)) || this.transactionType != saveConsumptionExcludedUseStoreReq.transactionType || !Intrinsics.areEqual(this.useStore, saveConsumptionExcludedUseStoreReq.useStore)) {
            return false;
        }
        if (this.excluded == saveConsumptionExcludedUseStoreReq.excluded) {
            return true;
        }
        int i3 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.methodType.hashCode();
        getFormatWidth getformatwidth = this.transactionType;
        if (getformatwidth == null) {
            int i5 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        } else {
            int iHashCode2 = getformatwidth.hashCode();
            int i7 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            i = iHashCode2;
        }
        return (((((iHashCode * 31) + i) * 31) + this.useStore.hashCode()) * 31) + Boolean.hashCode(this.excluded);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SaveConsumptionExcludedUseStoreReq(methodType=" + this.methodType + ", transactionType=" + this.transactionType + ", useStore=" + this.useStore + ", excluded=" + this.excluded + ")";
        int i2 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SaveConsumptionExcludedUseStoreReq> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            SaveConsumptionExcludedUseStoreReq$.serializer serializerVar = SaveConsumptionExcludedUseStoreReq$.serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 107;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ SaveConsumptionExcludedUseStoreReq(int i, String str, getFormatWidth getformatwidth, String str2, boolean z, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 15;
        if (15 != (i & 15)) {
            int i3 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = SaveConsumptionExcludedUseStoreReq$.serializer.INSTANCE.getDescriptor();
                i2 = 58;
            } else {
                descriptor = SaveConsumptionExcludedUseStoreReq$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.methodType = str;
        this.transactionType = getformatwidth;
        this.useStore = str2;
        this.excluded = z;
    }

    public SaveConsumptionExcludedUseStoreReq(@NotNull String str, @Nullable getFormatWidth getformatwidth, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.methodType = str;
        this.transactionType = getformatwidth;
        this.useStore = str2;
        this.excluded = z;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(SaveConsumptionExcludedUseStoreReq saveConsumptionExcludedUseStoreReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, saveConsumptionExcludedUseStoreReq.methodType);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazyArr[1].getValue(), saveConsumptionExcludedUseStoreReq.transactionType);
        vylVar.onExtraCallback(serialDescriptor, 2, saveConsumptionExcludedUseStoreReq.useStore);
        vylVar.onNavigationEvent(serialDescriptor, 3, saveConsumptionExcludedUseStoreReq.excluded);
        int i4 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
