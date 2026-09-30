package im.toss.features.leave.common.nav;

import im.toss.features.leave.common.nav.RemainingMoneyNav$PendingTransfer$;
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
public final class RemainingMoneyNav$PendingTransfer implements RemainingMoneyNav {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final RemainingMoneyNav$PendingTransfer INSTANCE = new RemainingMoneyNav$PendingTransfer();
    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new RemainingMoneyNav$PendingTransfer$.ExternalSyntheticLambda0());

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i4 = IAuthTabCallback + 33;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 57;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj || !(!(obj instanceof RemainingMoneyNav$PendingTransfer))) {
            return true;
        }
        int i5 = i2 + 115;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 117;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return -1697094562;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return "PendingTransfer";
        }
        throw null;
    }

    static {
        int i = onExtraCallbackWithResult + 111;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private RemainingMoneyNav$PendingTransfer() {
    }

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        htf1 htf1Var = new htf1("im.toss.features.leave.common.nav.RemainingMoneyNav.PendingTransfer", INSTANCE, new Annotation[0]);
        int i2 = IAuthTabCallback + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return htf1Var;
    }

    private final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializer = (KSerializer) $cachedSerializer$delegate.getValue();
        int i3 = IAuthTabCallback + 101;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializer;
        }
        obj.hashCode();
        throw null;
    }

    public final KSerializer<RemainingMoneyNav$PendingTransfer> serializer() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<RemainingMoneyNav$PendingTransfer> kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = IAuthTabCallback + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
        return kSerializerOnWarmupCompleted;
    }
}
