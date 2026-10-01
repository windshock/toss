package o;

import android.os.Process;
import kotlin.Deprecated;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GeckoHubImp;
import o.access13700;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class GeckoHubImp extends AbstractCoroutineContextElement implements access13700 {
    public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback(null);

    public boolean onExtraCallbackWithResult(@NotNull CoroutineContext coroutineContext) {
        return true;
    }

    public abstract void onWarmupCompleted(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable);

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.onExtraCallback<E> onextracallback) {
        return (E) access13700.IAuthTabCallback.IAuthTabCallback(this, onextracallback);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(@NotNull CoroutineContext.onExtraCallback<?> onextracallback) {
        return access13700.IAuthTabCallback.onExtraCallbackWithResult(this, onextracallback);
    }

    public GeckoHubImp() {
        super(access13700.onWarmupCompleted);
    }

    public static final class IAuthTabCallback extends hasFaultAdjacentMetadata<access13700, GeckoHubImp> {
        public static int onNavigationEvent;
        public static int onWarmupCompleted;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
            super(access13700.onWarmupCompleted, new Function1() { // from class: kotlinx.coroutines.CoroutineDispatcher$Key$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GeckoHubImp.IAuthTabCallback.IAuthTabCallback((CoroutineContext.Element) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final GeckoHubImp IAuthTabCallback(CoroutineContext.Element element) {
            if (element instanceof GeckoHubImp) {
                return (GeckoHubImp) element;
            }
            return null;
        }

        public static int IAuthTabCallback() {
            int i = onNavigationEvent;
            int i2 = i % 8351099;
            onNavigationEvent = i + 1;
            if (i2 != 0) {
                return onWarmupCompleted;
            }
            int iMyUid = Process.myUid();
            onWarmupCompleted = iMyUid;
            return iMyUid;
        }
    }

    public static /* synthetic */ GeckoHubImp onNavigationEvent(GeckoHubImp geckoHubImp, int i, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return geckoHubImp.onWarmupCompleted(i, str);
    }

    public GeckoHubImp onWarmupCompleted(int i, @Nullable String str) {
        setShowDividerHorizontal.onNavigationEvent(i);
        return new setShowDivider(this, i, str);
    }

    @Deprecated
    public /* synthetic */ GeckoHubImp onWarmupCompleted(int i) {
        return onWarmupCompleted(i, (String) null);
    }

    public void onExtraCallback(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        setMaxLine.IAuthTabCallback(this, coroutineContext, runnable);
    }

    @Override // o.access13700
    public final <T> access13800<T> onWarmupCompleted(@NotNull access13800<? super T> access13800Var) {
        return new setFlexWrap(this, access13800Var);
    }

    @Override // o.access13700
    public final void onExtraCallback(@NotNull access13800<?> access13800Var) {
        Intrinsics.checkNotNull(access13800Var, "");
        ((setFlexWrap) access13800Var).onNavigationEvent();
    }

    public String toString() {
        return getResCount.IAuthTabCallback(this) + '@' + getResCount.onExtraCallbackWithResult(this);
    }
}
