package im.toss.features.home.core.remote.request;

import im.toss.features.home.core.remote.request.ConsumptionHiddenSaveParameterRequest$;
import im.toss.features.home.core.remote.request.ConsumptionHiddenSaveParameterRequest$HiddenTransaction$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
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
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ConsumptionHiddenSaveParameterRequest {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final List<HiddenTransaction> items;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new ConsumptionHiddenSaveParameterRequest$.ExternalSyntheticLambda0())};

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent();
        }
        onNavigationEvent();
        throw null;
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(ConsumptionHiddenSaveParameterRequest$HiddenTransaction$.serializer.INSTANCE);
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumptionHiddenSaveParameterRequest)) {
            int i2 = onNavigationEvent + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.items, ((ConsumptionHiddenSaveParameterRequest) obj).items)) {
            return true;
        }
        int i4 = onNavigationEvent + 11;
        onExtraCallback = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.items.hashCode();
        int i4 = onNavigationEvent + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConsumptionHiddenSaveParameterRequest(items=" + this.items + ")";
        int i2 = onExtraCallback + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 62 / 0;
        }
        return str;
    }

    static {
        int i = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ ConsumptionHiddenSaveParameterRequest(int i, List list, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 1;
        if (1 != (i & 1)) {
            int i3 = onNavigationEvent + 85;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = ConsumptionHiddenSaveParameterRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 0;
            } else {
                descriptor = ConsumptionHiddenSaveParameterRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onNavigationEvent + 29;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.items = list;
    }

    public ConsumptionHiddenSaveParameterRequest(@NotNull List<HiddenTransaction> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.items = list;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            int i4 = 10 / 0;
        } else {
            lazyArr = $childSerializers;
        }
        int i5 = i3 + 5;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(ConsumptionHiddenSaveParameterRequest consumptionHiddenSaveParameterRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), consumptionHiddenSaveParameterRequest.items);
        int i4 = onExtraCallback + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
