package im.toss.features.home.core.remote.model.dst.widget;

import im.toss.features.home.core.remote.model.dst.widget.ConsumptionTransactionActionCellResponse;
import im.toss.features.home.core.remote.model.dst.widget.ConsumptionTransactionActionCellResponse$OrderResponse$Front$;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf1;
import o.liq;
import o.showSoftInput;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ConsumptionTransactionActionCellResponse$OrderResponse$Front extends ConsumptionTransactionActionCellResponse.OrderResponse {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final ConsumptionTransactionActionCellResponse$OrderResponse$Front INSTANCE = new ConsumptionTransactionActionCellResponse$OrderResponse$Front();
    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new ConsumptionTransactionActionCellResponse$OrderResponse$Front$.ExternalSyntheticLambda0());

    public static /* synthetic */ KSerializer onNavigationEvent() {
        KSerializer kSerializerOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerOnWarmupCompleted = onWarmupCompleted();
            int i3 = 18 / 0;
        } else {
            kSerializerOnWarmupCompleted = onWarmupCompleted();
        }
        int i4 = onNavigationEvent + 1;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnWarmupCompleted;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof ConsumptionTransactionActionCellResponse$OrderResponse$Front) {
                return true;
            }
            int i2 = onNavigationEvent + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onWarmupCompleted + 93;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 61;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return -1042711724;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 21;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return "Front";
    }

    static {
        int i = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private ConsumptionTransactionActionCellResponse$OrderResponse$Front() {
        super((DefaultConstructorMarker) null);
    }

    private final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer = (KSerializer) $cachedSerializer$delegate.getValue();
        int i4 = onWarmupCompleted + 125;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        htf1 htf1Var = new htf1("im.toss.features.home.core.remote.model.dst.widget.ConsumptionTransactionActionCellResponse.OrderResponse.Front", INSTANCE, new Annotation[0]);
        int i2 = onWarmupCompleted + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return htf1Var;
    }

    public final KSerializer<ConsumptionTransactionActionCellResponse$OrderResponse$Front> serializer() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback();
        }
        onExtraCallback();
        throw null;
    }

    public /* synthetic */ Object toDto() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        showSoftInput.onWarmupCompleted.onExtraCallback onextracallbackOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 97;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return onextracallbackOnExtraCallbackWithResult;
        }
        throw null;
    }

    public showSoftInput.onWarmupCompleted.onExtraCallback onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        showSoftInput.onWarmupCompleted.onExtraCallback.IAuthTabCallback iAuthTabCallback = showSoftInput.onWarmupCompleted.onExtraCallback.IAuthTabCallback.onNavigationEvent;
        int i4 = onWarmupCompleted + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iAuthTabCallback;
    }
}
