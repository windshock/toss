package im.toss.features.leave.common.nav;

import im.toss.features.leave.common.nav.CancellationServiceNav$CancelInProgress$;
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
public final class CancellationServiceNav$CancelInProgress implements CancellationServiceNav {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final CancellationServiceNav$CancelInProgress INSTANCE = new CancellationServiceNav$CancelInProgress();
    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new CancellationServiceNav$CancelInProgress$.ExternalSyntheticLambda0());

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 71;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj || (obj instanceof CancellationServiceNav$CancelInProgress)) {
            return true;
        }
        int i5 = i2 + 47;
        IAuthTabCallback = i5 % 128;
        return i5 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 115;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 7 / 0;
        }
        int i5 = i2 + 35;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return -1485522406;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return "CancelInProgress";
        }
        int i3 = 18 / 0;
        return "CancelInProgress";
    }

    static {
        int i = onNavigationEvent + 51;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private CancellationServiceNav$CancelInProgress() {
    }

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        htf1 htf1Var = new htf1("im.toss.features.leave.common.nav.CancellationServiceNav.CancelInProgress", INSTANCE, new Annotation[0]);
        int i2 = onWarmupCompleted + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return htf1Var;
    }

    private final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object value = $cachedSerializer$delegate.getValue();
        if (i3 == 0) {
            return (KSerializer) value;
        }
        throw null;
    }

    public final KSerializer<CancellationServiceNav$CancelInProgress> serializer() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<CancellationServiceNav$CancelInProgress> kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }
}
