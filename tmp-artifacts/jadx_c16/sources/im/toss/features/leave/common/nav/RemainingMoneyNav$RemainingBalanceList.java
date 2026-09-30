package im.toss.features.leave.common.nav;

import im.toss.features.leave.common.nav.RemainingMoneyNav$RemainingBalanceList$;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf1;
import o.liq;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingMoneyNav$RemainingBalanceList implements RemainingMoneyNav {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    public static final RemainingMoneyNav$RemainingBalanceList INSTANCE = new RemainingMoneyNav$RemainingBalanceList();
    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new RemainingMoneyNav$RemainingBalanceList$.ExternalSyntheticLambda0());

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback();
            throw null;
        }
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        int i3 = IAuthTabCallback + 63;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerOnExtraCallback;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            return obj instanceof RemainingMoneyNav$RemainingBalanceList;
        }
        int i5 = i3 + 33;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 103;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return -1244956280;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 117;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return "RemainingBalanceList";
    }

    static {
        int i = onExtraCallback + 27;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private RemainingMoneyNav$RemainingBalanceList() {
    }

    private final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer = (KSerializer) $cachedSerializer$delegate.getValue();
        int i4 = onWarmupCompleted + 33;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return kSerializer;
    }

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        htf1 htf1Var = new htf1("im.toss.features.leave.common.nav.RemainingMoneyNav.RemainingBalanceList", INSTANCE, new Annotation[0]);
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return htf1Var;
        }
        throw null;
    }

    public final KSerializer<RemainingMoneyNav$RemainingBalanceList> serializer() {
        KSerializer<RemainingMoneyNav$RemainingBalanceList> kSerializerIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerIAuthTabCallback = IAuthTabCallback();
            int i3 = 79 / 0;
        } else {
            kSerializerIAuthTabCallback = IAuthTabCallback();
        }
        int i4 = IAuthTabCallback + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallback;
    }
}
