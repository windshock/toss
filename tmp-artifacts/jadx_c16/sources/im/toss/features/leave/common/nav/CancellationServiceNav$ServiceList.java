package im.toss.features.leave.common.nav;

import im.toss.features.leave.common.nav.CancellationServiceNav$ServiceList$;
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
public final class CancellationServiceNav$ServiceList implements CancellationServiceNav {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public static final CancellationServiceNav$ServiceList INSTANCE = new CancellationServiceNav$ServiceList();
    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new CancellationServiceNav$ServiceList$.ExternalSyntheticLambda0());

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerOnNavigationEvent = onNavigationEvent();
        int i3 = onExtraCallback + 111;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerOnNavigationEvent;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 39;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 13;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof CancellationServiceNav$ServiceList) {
            return true;
        }
        int i8 = i2 + 39;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i2 + 5;
        onExtraCallback = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 64 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return -1423341915;
        }
        int i3 = 47 / 0;
        return -1423341915;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return "ServiceList";
        }
        int i3 = 52 / 0;
        return "ServiceList";
    }

    static {
        int i = onWarmupCompleted + 63;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private CancellationServiceNav$ServiceList() {
    }

    private final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer = (KSerializer) $cachedSerializer$delegate.getValue();
        int i4 = onExtraCallback + 23;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer;
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        htf1 htf1Var = new htf1("im.toss.features.leave.common.nav.CancellationServiceNav.ServiceList", INSTANCE, new Annotation[0]);
        int i2 = onExtraCallbackWithResult + 23;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 25 / 0;
        }
        return htf1Var;
    }

    public final KSerializer<CancellationServiceNav$ServiceList> serializer() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<CancellationServiceNav$ServiceList> kSerializerOnExtraCallback = onExtraCallback();
        int i4 = onExtraCallbackWithResult + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallback;
    }
}
