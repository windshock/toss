package o;

import im.toss.securities.core.router.spec.TossSecRoute;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface qExternalSyntheticLambda0 {
    LiveDataObservableExternalSyntheticLambda1<setTermsOfServiceUri> IAuthTabCallback();

    boolean IAuthTabCallback(@NotNull KClass<? extends TossSecRoute> kClass, boolean z);

    boolean IAuthTabCallbackDefault();

    String onExtraCallback(@NotNull TossSecRoute tossSecRoute, @NotNull List<Pair<String, String>> list);

    String onExtraCallbackWithResult(@NotNull TossSecRoute tossSecRoute, @Nullable KClass<? extends TossSecRoute> kClass, boolean z, @NotNull List<Pair<String, String>> list);

    void onWarmupCompleted();

    default setTermsOfServiceUri onNavigationEvent() {
        int i = 2 % 2;
        return (setTermsOfServiceUri) CollectionsKt.lastOrNull(IAuthTabCallback());
    }

    default setTermsOfServiceUri onTransact() {
        int i = 2 % 2;
        return (setTermsOfServiceUri) CollectionsKt.getOrNull(IAuthTabCallback(), CollectionsKt.getLastIndex(IAuthTabCallback()) - 1);
    }

    default TossSecRoute onExtraCallback() {
        int i = 2 % 2;
        setTermsOfServiceUri settermsofserviceuriOnNavigationEvent = onNavigationEvent();
        if (settermsofserviceuriOnNavigationEvent != null) {
            return settermsofserviceuriOnNavigationEvent.IAuthTabCallback();
        }
        return null;
    }

    default TossSecRoute IAuthTabCallbackStub() {
        int i = 2 % 2;
        setTermsOfServiceUri settermsofserviceuriOnTransact = onTransact();
        if (settermsofserviceuriOnTransact != null) {
            return settermsofserviceuriOnTransact.IAuthTabCallback();
        }
        return null;
    }

    default String onExtraCallbackWithResult() {
        int i = 2 % 2;
        setTermsOfServiceUri settermsofserviceuriOnNavigationEvent = onNavigationEvent();
        if (settermsofserviceuriOnNavigationEvent != null) {
            return settermsofserviceuriOnNavigationEvent.onExtraCallback();
        }
        return null;
    }

    default String asBinder() {
        int i = 2 % 2;
        setTermsOfServiceUri settermsofserviceuriOnTransact = onTransact();
        if (settermsofserviceuriOnTransact != null) {
            return settermsofserviceuriOnTransact.onExtraCallback();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ String onExtraCallbackWithResult(qExternalSyntheticLambda0 qexternalsyntheticlambda0, TossSecRoute tossSecRoute, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        return qexternalsyntheticlambda0.onExtraCallback(tossSecRoute, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ String IAuthTabCallback(qExternalSyntheticLambda0 qexternalsyntheticlambda0, TossSecRoute tossSecRoute, KClass kClass, boolean z, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateSingleTop");
        }
        if ((i & 2) != 0) {
            kClass = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            list = CollectionsKt.emptyList();
        }
        return qexternalsyntheticlambda0.onExtraCallbackWithResult(tossSecRoute, kClass, z, list);
    }

    default boolean onExtraCallbackWithResult(@NotNull KClass<? extends TossSecRoute> kClass) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(kClass, "");
        TossSecRoute tossSecRouteOnExtraCallback = onExtraCallback();
        if (tossSecRouteOnExtraCallback != null) {
            return kClass.isInstance(tossSecRouteOnExtraCallback);
        }
        return false;
    }
}
