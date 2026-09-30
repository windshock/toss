package com.swmansion.rnscreens;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import o.RenderInTransitionOverlayNodeElement;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class InsetsObserverProxy implements RenderInTransitionOverlayNodeElement, LifecycleEventListener {
    private static boolean hasBeenRegistered;
    private static boolean isObservingContextLifetime;
    public static final InsetsObserverProxy INSTANCE = new InsetsObserverProxy();
    private static final HashSet<RenderInTransitionOverlayNodeElement> listeners = new HashSet<>();
    private static WeakReference<View> eventSourceView = new WeakReference<>(null);
    private static boolean shouldForwardInsetsToView = true;

    public void onHostPause() {
    }

    public void onHostResume() {
    }

    private InsetsObserverProxy() {
    }

    private final boolean getAllowRegistration() {
        return !hasBeenRegistered || eventSourceView.get() == null;
    }

    public WindowInsetsCompat onApplyWindowInsets(@NotNull View view, @NotNull WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        WindowInsetsCompat windowInsetsCompatOnNavigationEvent = shouldForwardInsetsToView ? ViewCompat.onNavigationEvent(view, windowInsetsCompat) : windowInsetsCompat;
        Intrinsics.checkNotNull(windowInsetsCompatOnNavigationEvent);
        Iterator<T> it = listeners.iterator();
        while (it.hasNext()) {
            windowInsetsCompatOnNavigationEvent = ((RenderInTransitionOverlayNodeElement) it.next()).onApplyWindowInsets(view, windowInsetsCompat);
            Intrinsics.checkNotNullExpressionValue(windowInsetsCompatOnNavigationEvent, "");
        }
        return windowInsetsCompatOnNavigationEvent;
    }

    public final void registerWithContext(@NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        isObservingContextLifetime = true;
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public void onHostDestroy() {
        View observedView = getObservedView();
        if (hasBeenRegistered && observedView != null) {
            ViewCompat.onWarmupCompleted(observedView, (RenderInTransitionOverlayNodeElement) null);
            hasBeenRegistered = false;
            eventSourceView.clear();
        }
        isObservingContextLifetime = false;
    }

    public final void addOnApplyWindowInsetsListener(@NotNull RenderInTransitionOverlayNodeElement renderInTransitionOverlayNodeElement) {
        Intrinsics.checkNotNullParameter(renderInTransitionOverlayNodeElement, "");
        listeners.add(renderInTransitionOverlayNodeElement);
    }

    public final void removeOnApplyWindowInsetsListener(@NotNull RenderInTransitionOverlayNodeElement renderInTransitionOverlayNodeElement) {
        Intrinsics.checkNotNullParameter(renderInTransitionOverlayNodeElement, "");
        listeners.remove(renderInTransitionOverlayNodeElement);
    }

    public final boolean registerOnView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (!getAllowRegistration()) {
            return false;
        }
        ViewCompat.onWarmupCompleted(view, this);
        eventSourceView = new WeakReference<>(view);
        hasBeenRegistered = true;
        return true;
    }

    public final void unregister() {
        View observedView = getObservedView();
        if (observedView != null) {
            if (!hasBeenRegistered) {
                observedView = null;
            }
            if (observedView != null) {
                ViewCompat.onWarmupCompleted(observedView, (RenderInTransitionOverlayNodeElement) null);
            }
        }
    }

    private final View getObservedView() {
        return eventSourceView.get();
    }
}
