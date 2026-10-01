package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ycx11 {
    public static final <T> sz<T> onWarmupCompleted(@NotNull IAnimation<? extends T> iAnimation) {
        sz<T> szVar = iAnimation instanceof sz ? (sz) iAnimation : null;
        return szVar == null ? new setScroller(iAnimation, null, 0, null, 14, null) : szVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> setRipple<T> IAuthTabCallback(setRipple<? super T> setripple, CoroutineContext coroutineContext) {
        return ((setripple instanceof getAlignItems) || (setripple instanceof syaycx)) ? setripple : new getDividerDrawableVertical(setripple, coroutineContext);
    }

    public static /* synthetic */ Object IAuthTabCallback(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, access13800 access13800Var, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = getViewPager.onExtraCallback(coroutineContext);
        }
        return onExtraCallback(coroutineContext, obj, obj2, function2, access13800Var);
    }

    public static final <T, V> Object onExtraCallback(@NotNull CoroutineContext coroutineContext, V v, @NotNull Object obj, @NotNull Function2<? super V, ? super access13800<? super T>, ? extends Object> function2, @NotNull access13800<? super T> access13800Var) {
        Object objOnNavigationEvent = getViewPager.onNavigationEvent(coroutineContext, obj);
        try {
            getAlignContent getaligncontent = new getAlignContent(access13800Var, coroutineContext);
            Object objOnWarmupCompleted = !(function2 instanceof BaseContinuationImpl) ? access14200.onWarmupCompleted(function2, v, getaligncontent) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(v, getaligncontent);
            getViewPager.onExtraCallbackWithResult(coroutineContext, objOnNavigationEvent);
            if (objOnWarmupCompleted == access14100.onExtraCallback()) {
                access14600.IAuthTabCallback(access13800Var);
            }
            return objOnWarmupCompleted;
        } catch (Throwable th) {
            getViewPager.onExtraCallbackWithResult(coroutineContext, objOnNavigationEvent);
            throw th;
        }
    }
}
