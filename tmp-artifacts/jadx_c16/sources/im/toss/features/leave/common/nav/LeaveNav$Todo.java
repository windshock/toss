package im.toss.features.leave.common.nav;

import im.toss.features.leave.common.nav.LeaveNav$Todo$;
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
public final class LeaveNav$Todo extends LeaveNav {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final LeaveNav$Todo INSTANCE = new LeaveNav$Todo();
    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new LeaveNav$Todo$.ExternalSyntheticLambda0());

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 55;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 61;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            return obj instanceof LeaveNav$Todo;
        }
        int i4 = i2 + 17;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 + 99;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return 1442416153;
        }
        int i3 = 75 / 0;
        return 1442416153;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 39;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 103;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return "Todo";
    }

    static {
        int i = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 91 / 0;
        }
    }

    private LeaveNav$Todo() {
        super((DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        htf1 htf1Var = new htf1("im.toss.features.leave.common.nav.LeaveNav.Todo", INSTANCE, new Annotation[0]);
        int i2 = IAuthTabCallback + 83;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return htf1Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer = (KSerializer) $cachedSerializer$delegate.getValue();
        int i4 = onNavigationEvent + 75;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return kSerializer;
    }

    public final KSerializer<LeaveNav$Todo> serializer() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<LeaveNav$Todo> kSerializerOnNavigationEvent = onNavigationEvent();
        int i4 = IAuthTabCallback + 43;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnNavigationEvent;
    }
}
