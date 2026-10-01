package im.toss.features.home.core.remote.model.dst.widget;

import im.toss.features.home.core.remote.model.dst.widget.ConsumptionTransactionActionCellResponse;
import im.toss.features.home.core.remote.model.dst.widget.ConsumptionTransactionActionCellResponse$OrderResponse$Last$;
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
public final class ConsumptionTransactionActionCellResponse$OrderResponse$Last extends ConsumptionTransactionActionCellResponse.OrderResponse {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final ConsumptionTransactionActionCellResponse$OrderResponse$Last INSTANCE = new ConsumptionTransactionActionCellResponse$OrderResponse$Last();
    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new ConsumptionTransactionActionCellResponse$OrderResponse$Last$.ExternalSyntheticLambda0());

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult();
            throw null;
        }
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i3 = onNavigationEvent + 125;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj || (obj instanceof ConsumptionTransactionActionCellResponse$OrderResponse$Last)) {
            return true;
        }
        int i2 = onNavigationEvent;
        int i3 = i2 + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 47;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 71;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 19;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return 1906189323;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 13;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return "Last";
    }

    static {
        int i = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private ConsumptionTransactionActionCellResponse$OrderResponse$Last() {
        super((DefaultConstructorMarker) null);
    }

    private final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializer = (KSerializer) $cachedSerializer$delegate.getValue();
        int i3 = onNavigationEvent + 115;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializer;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        htf1 htf1Var = new htf1("im.toss.features.home.core.remote.model.dst.widget.ConsumptionTransactionActionCellResponse.OrderResponse.Last", INSTANCE, new Annotation[0]);
        int i2 = onNavigationEvent + 113;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 62 / 0;
        }
        return htf1Var;
    }

    public final KSerializer<ConsumptionTransactionActionCellResponse$OrderResponse$Last> serializer() {
        KSerializer<ConsumptionTransactionActionCellResponse$OrderResponse$Last> kSerializerIAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerIAuthTabCallback = IAuthTabCallback();
            int i3 = 0 / 0;
        } else {
            kSerializerIAuthTabCallback = IAuthTabCallback();
        }
        int i4 = IAuthTabCallback + 125;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallback;
    }

    public /* synthetic */ Object toDto() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        showSoftInput.onWarmupCompleted.onExtraCallback onextracallbackOnNavigationEvent = onNavigationEvent();
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        return onextracallbackOnNavigationEvent;
    }

    public showSoftInput.onWarmupCompleted.onExtraCallback onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        showSoftInput.onWarmupCompleted.onExtraCallback.onNavigationEvent onnavigationevent = showSoftInput.onWarmupCompleted.onExtraCallback.onNavigationEvent.onExtraCallback;
        int i4 = IAuthTabCallback + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationevent;
    }
}
