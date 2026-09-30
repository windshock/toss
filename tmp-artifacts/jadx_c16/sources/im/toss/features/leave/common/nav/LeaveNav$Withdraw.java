package im.toss.features.leave.common.nav;

import im.toss.features.leave.common.nav.LeaveNav$Withdraw$;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf1;
import o.liq;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LeaveNav$Withdraw extends LeaveNav {
    public static final int $stable = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final LeaveNav$Withdraw INSTANCE = new LeaveNav$Withdraw();
    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new LeaveNav$Withdraw$.ExternalSyntheticLambda0());

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        int i4 = onExtraCallbackWithResult + 37;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj || (obj instanceof LeaveNav$Withdraw)) {
            return true;
        }
        int i4 = i3 + 103;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 75;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return 679413597;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 99;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 45;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return "Withdraw";
    }

    static {
        int i = onWarmupCompleted + 105;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private LeaveNav$Withdraw() {
        super((DefaultConstructorMarker) null);
    }

    private final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object value = $cachedSerializer$delegate.getValue();
        if (i3 == 0) {
            return (KSerializer) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        htf1 htf1Var = new htf1("im.toss.features.leave.common.nav.LeaveNav.Withdraw", INSTANCE, new Annotation[0]);
        int i2 = onExtraCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 99 / 0;
        }
        return htf1Var;
    }

    public final KSerializer<LeaveNav$Withdraw> serializer() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback();
            throw null;
        }
        KSerializer<LeaveNav$Withdraw> kSerializerIAuthTabCallback = IAuthTabCallback();
        int i3 = onExtraCallbackWithResult + 11;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }
}
