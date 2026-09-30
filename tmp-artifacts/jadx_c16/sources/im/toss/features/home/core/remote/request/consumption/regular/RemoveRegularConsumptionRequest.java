package im.toss.features.home.core.remote.request.consumption.regular;

import im.toss.features.home.core.remote.request.consumption.regular.RemoveRegularConsumptionRequest$;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.ff;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.setIsH5Mode;
import o.sp;
import o.ul1;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemoveRegularConsumptionRequest extends setIsH5Mode {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Map<String, String> schemeParams;
    private final Set<Map<String, Object>> transactions;

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = onWarmupCompleted + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerIAuthTabCallbackDefault;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        ul1 ul1Var = new ul1(new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(new ff(Reflection.getOrCreateKotlinClass(Object.class), (KSerializer) null, new KSerializer[0]))));
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 39 / 0;
        }
        return ul1Var;
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout));
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return getmutilbackgrounddrawable;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnNavigationEvent = onNavigationEvent();
        int i4 = onExtraCallback + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnNavigationEvent;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoveRegularConsumptionRequest)) {
            return false;
        }
        RemoveRegularConsumptionRequest removeRegularConsumptionRequest = (RemoveRegularConsumptionRequest) obj;
        if (!Intrinsics.areEqual(this.schemeParams, removeRegularConsumptionRequest.schemeParams)) {
            int i2 = onWarmupCompleted + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.transactions, removeRegularConsumptionRequest.transactions)) {
            return true;
        }
        int i4 = onWarmupCompleted + 3;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.schemeParams.hashCode() * 31) + this.transactions.hashCode();
        int i4 = onWarmupCompleted + 111;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoveRegularConsumptionRequest(schemeParams=" + this.schemeParams + ", transactions=" + this.transactions + ")";
        int i2 = onWarmupCompleted + 73;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 28 / 0;
        }
        return str;
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new RemoveRegularConsumptionRequest$.ExternalSyntheticLambda0()), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new RemoveRegularConsumptionRequest$.ExternalSyntheticLambda1())};
        int i = onExtraCallbackWithResult + 5;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ RemoveRegularConsumptionRequest(int i, Map map, Set set, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onWarmupCompleted + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, RemoveRegularConsumptionRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 85;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.schemeParams = map;
        this.transactions = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RemoveRegularConsumptionRequest(@NotNull Map<String, String> map, @NotNull Set<? extends Map<String, ? extends Object>> set) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(set, "");
        this.schemeParams = map;
        this.transactions = set;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 81;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(RemoveRegularConsumptionRequest removeRegularConsumptionRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), removeRegularConsumptionRequest.onExtraCallback());
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), removeRegularConsumptionRequest.transactions);
        int i4 = onExtraCallback + 21;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public Map<String, String> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Map<String, String> map = this.schemeParams;
        int i5 = i3 + 47;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }
}
