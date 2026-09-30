package com.th3rdwave.safeareacontext;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.StaggeredGridLayoutManager;
import o.access8100;
import o.createScroller;
import o.destroyCallbacks;
import o.getWrite;
import org.jetbrains.annotations.Nullable;

@ReactModule(IAuthTabCallback = "RNCSafeAreaContext")
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SafeAreaContextModule extends NativeSafeAreaContextSpec {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final String NAME = "RNCSafeAreaContext";

    public SafeAreaContextModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.th3rdwave.safeareacontext.NativeSafeAreaContextSpec
    public String getName() {
        return "RNCSafeAreaContext";
    }

    @Override // com.th3rdwave.safeareacontext.NativeSafeAreaContextSpec
    public Map<String, Object> getTypedExportedConstants() {
        return access8100.onNavigationEvent(getWrite.IAuthTabCallback("initialWindowMetrics", getInitialWindowMetrics()));
    }

    private final Map<String, Object> getInitialWindowMetrics() {
        View viewFindViewById;
        Window window;
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        ViewGroup viewGroup = (ViewGroup) ((currentActivity == null || (window = currentActivity.getWindow()) == null) ? null : window.getDecorView());
        if (viewGroup != null && (viewFindViewById = viewGroup.findViewById(R.id.content)) != null) {
            destroyCallbacks destroycallbacksOnNavigationEvent = createScroller.onNavigationEvent(viewGroup);
            Rect rectOnNavigationEvent = createScroller.onNavigationEvent(viewGroup, viewFindViewById);
            if (destroycallbacksOnNavigationEvent != null && rectOnNavigationEvent != null) {
                return access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("insets", StaggeredGridLayoutManager.onExtraCallbackWithResult(destroycallbacksOnNavigationEvent)), getWrite.IAuthTabCallback("frame", StaggeredGridLayoutManager.onExtraCallbackWithResult(rectOnNavigationEvent))});
            }
        }
        return null;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
