package im.toss.features.leave.common.nav;

import im.toss.features.leave.common.nav.RemainingMoneyNav$InputAccountNotice$;
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
public final class RemainingMoneyNav$InputAccountNotice implements RemainingMoneyNav {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final RemainingMoneyNav$InputAccountNotice INSTANCE = new RemainingMoneyNav$InputAccountNotice();
    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new RemainingMoneyNav$InputAccountNotice$.ExternalSyntheticLambda0());

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnNavigationEvent = onNavigationEvent();
        int i4 = IAuthTabCallback + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return kSerializerOnNavigationEvent;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 107;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 39;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof RemainingMoneyNav$InputAccountNotice) {
            return true;
        }
        int i8 = i2 + 81;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 107;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 87;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return -610903937;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 33;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return "InputAccountNotice";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = onNavigationEvent + 113;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private RemainingMoneyNav$InputAccountNotice() {
    }

    private final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializer = (KSerializer) $cachedSerializer$delegate.getValue();
        int i3 = IAuthTabCallback + 23;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializer;
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        htf1 htf1Var = new htf1("im.toss.features.leave.common.nav.RemainingMoneyNav.InputAccountNotice", INSTANCE, new Annotation[0]);
        int i2 = IAuthTabCallback + 17;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return htf1Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final KSerializer<RemainingMoneyNav$InputAccountNotice> serializer() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<RemainingMoneyNav$InputAccountNotice> kSerializerIAuthTabCallback = IAuthTabCallback();
        int i4 = IAuthTabCallback + 97;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return kSerializerIAuthTabCallback;
    }
}
