package im.toss.features.leave.common.nav;

import im.toss.features.leave.common.nav.LeaveNav$CancellationServiceNavRoot$;
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
public final class LeaveNav$CancellationServiceNavRoot extends LeaveNav {
    public static final int $stable = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final LeaveNav$CancellationServiceNavRoot INSTANCE = new LeaveNav$CancellationServiceNavRoot();
    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new LeaveNav$CancellationServiceNavRoot$.ExternalSyntheticLambda0());

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent();
        }
        onNavigationEvent();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 107;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj || (obj instanceof LeaveNav$CancellationServiceNavRoot)) {
            return true;
        }
        int i5 = i2 + 57;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return 725524902;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            int i4 = 33 / 0;
        }
        int i5 = i3 + 113;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return "CancellationServiceNavRoot";
    }

    static {
        int i = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private LeaveNav$CancellationServiceNavRoot() {
        super((DefaultConstructorMarker) null);
    }

    private final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer = (KSerializer) $cachedSerializer$delegate.getValue();
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        return kSerializer;
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        htf1 htf1Var = new htf1("im.toss.features.leave.common.nav.LeaveNav.CancellationServiceNavRoot", INSTANCE, new Annotation[0]);
        int i2 = onNavigationEvent + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return htf1Var;
    }

    public final KSerializer<LeaveNav$CancellationServiceNavRoot> serializer() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<LeaveNav$CancellationServiceNavRoot> kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onExtraCallback + 49;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }
}
