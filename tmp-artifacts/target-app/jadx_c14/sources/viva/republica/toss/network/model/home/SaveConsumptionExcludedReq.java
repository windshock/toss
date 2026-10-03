package viva.republica.toss.network.model.home;

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
import o.supportedLocalesOf;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.home.SaveConsumptionExcludedReq$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SaveConsumptionExcludedReq implements supportedLocalesOf {
    public static final int $stable = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final boolean excluded;
    private final List<String> sourceIds;
    private final String timelineTime;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.home.SaveConsumptionExcludedReq$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                SaveConsumptionExcludedReq.onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerOnExtraCallback = SaveConsumptionExcludedReq.onExtraCallback();
            int i3 = onExtraCallback + 63;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 41 / 0;
            }
            return kSerializerOnExtraCallback;
        }
    }), null, null};

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnNavigationEvent = onNavigationEvent();
        int i4 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return kSerializerOnNavigationEvent;
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveConsumptionExcludedReq)) {
            int i2 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        SaveConsumptionExcludedReq saveConsumptionExcludedReq = (SaveConsumptionExcludedReq) obj;
        if (!Intrinsics.areEqual(this.sourceIds, saveConsumptionExcludedReq.sourceIds) || !Intrinsics.areEqual(this.timelineTime, saveConsumptionExcludedReq.timelineTime)) {
            return false;
        }
        if (this.excluded == saveConsumptionExcludedReq.excluded) {
            return true;
        }
        int i4 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i4 % 128;
        return !(i4 % 2 == 0);
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.sourceIds.hashCode() * 31) + this.timelineTime.hashCode()) * 31) + Boolean.hashCode(this.excluded);
        int i4 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SaveConsumptionExcludedReq(sourceIds=" + this.sourceIds + ", timelineTime=" + this.timelineTime + ", excluded=" + this.excluded + ")";
        int i2 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i2 % 128;
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

        public final KSerializer<SaveConsumptionExcludedReq> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            SaveConsumptionExcludedReq$.serializer serializerVar = SaveConsumptionExcludedReq$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 77;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ SaveConsumptionExcludedReq(int i, List list, String str, boolean z, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 7;
        if (7 != (i & 7)) {
            int i3 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = SaveConsumptionExcludedReq$.serializer.INSTANCE.getDescriptor();
                i2 = 121;
            } else {
                descriptor = SaveConsumptionExcludedReq$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.sourceIds = list;
        this.timelineTime = str;
        this.excluded = z;
    }

    public SaveConsumptionExcludedReq(@NotNull List<String> list, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.sourceIds = list;
        this.timelineTime = str;
        this.excluded = z;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return $childSerializers;
        }
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(SaveConsumptionExcludedReq saveConsumptionExcludedReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), saveConsumptionExcludedReq.onExtraCallbackWithResult());
            vylVar.onExtraCallback(serialDescriptor, 1, saveConsumptionExcludedReq.onWarmupCompleted());
            vylVar.onNavigationEvent(serialDescriptor, 3, saveConsumptionExcludedReq.excluded);
        } else {
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), saveConsumptionExcludedReq.onExtraCallbackWithResult());
            vylVar.onExtraCallback(serialDescriptor, 1, saveConsumptionExcludedReq.onWarmupCompleted());
            vylVar.onNavigationEvent(serialDescriptor, 2, saveConsumptionExcludedReq.excluded);
        }
        int i3 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    public List<String> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.sourceIds;
        int i5 = i2 + 37;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.timelineTime;
        int i4 = i3 + 23;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }
}
