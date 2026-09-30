package mozilla.components.support.base.observer;

import android.view.View;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0;
import o.TextLinkScopeExternalSyntheticLambda5;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ObserverRegistry<T> {
    private final Set<T> onExtraCallbackWithResult = new LinkedHashSet();
    private final WeakHashMap<T, LifecycleBoundObserver<T>> IAuthTabCallback = new WeakHashMap<>();
    private final WeakHashMap<T, IAuthTabCallback<T>> onExtraCallback = new WeakHashMap<>();
    private final Set<T> onNavigationEvent = Collections.newSetFromMap(new WeakHashMap());
    private final LinkedList<Function1<T, Unit>> onWarmupCompleted = new LinkedList<>();

    public void onNavigationEvent(T t) {
        synchronized (this) {
            this.onExtraCallbackWithResult.add(t);
            while (!this.onWarmupCompleted.isEmpty()) {
                Function1<T, Unit> function1Poll = this.onWarmupCompleted.poll();
                if (function1Poll != null) {
                    function1Poll.invoke(t);
                }
            }
        }
    }

    public void onExtraCallback(T t) {
        synchronized (this) {
            this.onExtraCallbackWithResult.remove(t);
            this.onNavigationEvent.remove(t);
            LifecycleBoundObserver<T> lifecycleBoundObserver = this.IAuthTabCallback.get(t);
            if (lifecycleBoundObserver != null) {
                lifecycleBoundObserver.onExtraCallbackWithResult();
            }
            IAuthTabCallback<T> iAuthTabCallback = this.onExtraCallback.get(t);
            if (iAuthTabCallback != null) {
                iAuthTabCallback.onExtraCallbackWithResult();
            }
            this.IAuthTabCallback.remove(t);
            this.onExtraCallback.remove(t);
        }
    }

    public void onWarmupCompleted(T t) {
        synchronized (this) {
            this.onNavigationEvent.add(t);
        }
    }

    public void onExtraCallbackWithResult(T t) {
        synchronized (this) {
            this.onNavigationEvent.remove(t);
        }
    }

    static class LifecycleBoundObserver<T> implements TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 {
        private final TextFieldScrollKtExternalSyntheticLambda0 onExtraCallback;
        private final T onNavigationEvent;
        private final ObserverRegistry<T> onWarmupCompleted;

        protected final ObserverRegistry<T> onNavigationEvent() {
            return this.onWarmupCompleted;
        }

        protected final T onExtraCallback() {
            return this.onNavigationEvent;
        }

        @TextLinkScopeExternalSyntheticLambda5(onExtraCallbackWithResult = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_DESTROY)
        public final void onDestroy() {
            this.onWarmupCompleted.onExtraCallback(this.onNavigationEvent);
        }

        public final void onExtraCallbackWithResult() {
            this.onExtraCallback.getLifecycle().onExtraCallbackWithResult(this);
        }
    }

    static final class AutoPauseLifecycleBoundObserver<T> extends LifecycleBoundObserver<T> {
        @TextLinkScopeExternalSyntheticLambda5(onExtraCallbackWithResult = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_PAUSE)
        public final void onPause() {
            onNavigationEvent().onWarmupCompleted(onExtraCallback());
        }

        @TextLinkScopeExternalSyntheticLambda5(onExtraCallbackWithResult = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_RESUME)
        public final void onResume() {
            onNavigationEvent().onExtraCallbackWithResult(onExtraCallback());
        }
    }

    static final class IAuthTabCallback<T> implements View.OnAttachStateChangeListener {
        private final View onExtraCallback;
        private final ObserverRegistry<T> onExtraCallbackWithResult;
        private final T onWarmupCompleted;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            this.onExtraCallbackWithResult.onExtraCallback(this.onWarmupCompleted);
        }

        public final void onExtraCallbackWithResult() {
            this.onExtraCallback.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            this.onExtraCallbackWithResult.onNavigationEvent(this.onWarmupCompleted);
        }
    }
}
