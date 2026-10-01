package o;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class createScroller {
    private static final destroyCallbacks onExtraCallbackWithResult(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        if (rootWindowInsets.getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar()) != null) {
            return new destroyCallbacks(getSavedStateRegistryControllerannotations.de_(r4), onBackPressedDispatcher_delegatelambda0.df_(r4), getOnBackPressedInput.dg_(r4), onBackPressedDispatcher_delegatelambda00.dd_(r4));
        }
        return null;
    }

    private static final destroyCallbacks IAuthTabCallback(View view) {
        if (view.getRootWindowInsets() == null) {
            return null;
        }
        return new destroyCallbacks(r4.getSystemWindowInsetTop(), r4.getSystemWindowInsetRight(), Math.min(r4.getSystemWindowInsetBottom(), r4.getStableInsetBottom()), r4.getSystemWindowInsetLeft());
    }

    private static final destroyCallbacks onExtraCallback(View view) {
        return Build.VERSION.SDK_INT >= 30 ? onExtraCallbackWithResult(view) : IAuthTabCallback(view);
    }

    public static final destroyCallbacks onNavigationEvent(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (view.getHeight() == 0) {
            return null;
        }
        View rootView = view.getRootView();
        Intrinsics.checkNotNull(rootView);
        destroyCallbacks destroycallbacksOnExtraCallback = onExtraCallback(rootView);
        if (destroycallbacksOnExtraCallback == null) {
            return null;
        }
        float width = rootView.getWidth();
        float height = rootView.getHeight();
        view.getGlobalVisibleRect(new Rect());
        return new destroyCallbacks(Math.max(destroycallbacksOnExtraCallback.onExtraCallback() - r3.top, 0.0f), Math.max(Math.min((r3.left + view.getWidth()) - width, 0.0f) + destroycallbacksOnExtraCallback.IAuthTabCallback(), 0.0f), Math.max(Math.min((r3.top + view.getHeight()) - height, 0.0f) + destroycallbacksOnExtraCallback.onWarmupCompleted(), 0.0f), Math.max(destroycallbacksOnExtraCallback.onExtraCallbackWithResult() - r3.left, 0.0f));
    }

    public static final com.th3rdwave.safeareacontext.Rect onNavigationEvent(@NotNull ViewGroup viewGroup, @NotNull View view) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(view, "");
        if (view.getParent() == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        try {
            viewGroup.offsetDescendantRectToMyCoords(view, rect);
            return new com.th3rdwave.safeareacontext.Rect(rect.left, rect.top, view.getWidth(), view.getHeight());
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
