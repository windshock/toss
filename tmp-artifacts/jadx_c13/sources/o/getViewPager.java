package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.UpdatePackageStrategy;
import o.getViewPager;
import o.ycxzb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getViewPager {
    public static final djExternalSyntheticApiModelOutline0 IAuthTabCallback = new djExternalSyntheticApiModelOutline0("NO_THREAD_ELEMENTS");
    private static final Function2<Object, CoroutineContext.Element, Object> onWarmupCompleted = new Function2() { // from class: kotlinx.coroutines.internal.ThreadContextKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return getViewPager.onNavigationEvent(obj, (CoroutineContext.Element) obj2);
        }
    };
    private static final Function2<UpdatePackageStrategy<?>, CoroutineContext.Element, UpdatePackageStrategy<?>> onNavigationEvent = new Function2() { // from class: kotlinx.coroutines.internal.ThreadContextKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return getViewPager.onWarmupCompleted((UpdatePackageStrategy<?>) obj, (CoroutineContext.Element) obj2);
        }
    };
    private static final Function2<ycxzb, CoroutineContext.Element, ycxzb> onExtraCallback = new Function2() { // from class: kotlinx.coroutines.internal.ThreadContextKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return getViewPager.onExtraCallback((ycxzb) obj, (CoroutineContext.Element) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onNavigationEvent(Object obj, CoroutineContext.Element element) {
        if (!(element instanceof UpdatePackageStrategy)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? element : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpdatePackageStrategy<?> onWarmupCompleted(UpdatePackageStrategy<?> updatePackageStrategy, CoroutineContext.Element element) {
        if (updatePackageStrategy != null) {
            return updatePackageStrategy;
        }
        if (element instanceof UpdatePackageStrategy) {
            return (UpdatePackageStrategy) element;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ycxzb onExtraCallback(ycxzb ycxzbVar, CoroutineContext.Element element) {
        if (element instanceof UpdatePackageStrategy) {
            UpdatePackageStrategy<?> updatePackageStrategy = (UpdatePackageStrategy) element;
            ycxzbVar.IAuthTabCallback(updatePackageStrategy, updatePackageStrategy.onWarmupCompleted(ycxzbVar.onWarmupCompleted));
        }
        return ycxzbVar;
    }

    public static final Object onExtraCallback(@NotNull CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, onWarmupCompleted);
        Intrinsics.checkNotNull(objFold);
        return objFold;
    }

    public static final Object onNavigationEvent(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == null) {
            obj = onExtraCallback(coroutineContext);
        }
        if (obj == 0) {
            return IAuthTabCallback;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new ycxzb(coroutineContext, ((Number) obj).intValue()), onExtraCallback);
        }
        Intrinsics.checkNotNull(obj, "");
        return ((UpdatePackageStrategy) obj).onWarmupCompleted(coroutineContext);
    }

    public static final void onExtraCallbackWithResult(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == IAuthTabCallback) {
            return;
        }
        if (obj instanceof ycxzb) {
            ((ycxzb) obj).onWarmupCompleted(coroutineContext);
            return;
        }
        Object objFold = coroutineContext.fold(null, onNavigationEvent);
        Intrinsics.checkNotNull(objFold, "");
        ((UpdatePackageStrategy) objFold).onExtraCallbackWithResult(coroutineContext, obj);
    }
}
