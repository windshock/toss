package com.swmansion.rnscreens.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.material.appbar.AppBarLayout;
import com.swmansion.rnscreens.ScreenStackHeaderConfig;
import com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper$;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ScreenDummyLayoutHelper implements LifecycleEventListener {
    private static final String DEFAULT_HEADER_TITLE = "FontSize123!#$";
    public static final int FONT_SIZE_UNSET = -1;
    public static final String LIBRARY_NAME = "react_codegen_rnscreens";
    public static final String TAG = "ScreenDummyLayoutHelper";
    private AppBarLayout appBarLayout;
    private CacheEntry cache;
    private CoordinatorLayout coordinatorLayout;
    private int defaultContentInsetStartWithNavigation;
    private float defaultFontSize;
    private View dummyContentView;
    private volatile boolean isLayoutInitialized;
    private WeakReference<ReactApplicationContext> reactContextRef;
    private Toolbar toolbar;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static WeakReference<ScreenDummyLayoutHelper> weakInstance = new WeakReference<>(null);

    @JvmStatic
    public static final ScreenDummyLayoutHelper getInstance() {
        return Companion.getInstance();
    }

    public void onHostPause() {
    }

    public ScreenDummyLayoutHelper(@NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        this.cache = CacheEntry.Companion.getEMPTY();
        this.reactContextRef = new WeakReference<>(reactApplicationContext);
        try {
            System.loadLibrary(LIBRARY_NAME);
        } catch (UnsatisfiedLinkError unused) {
        }
        weakInstance = new WeakReference<>(this);
        if (reactApplicationContext.hasCurrentActivity()) {
            maybeInitDummyLayoutWithHeader(reactApplicationContext);
        }
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private final boolean maybeInitDummyLayoutWithHeader(ReactApplicationContext reactApplicationContext) {
        if (this.isLayoutInitialized) {
            return true;
        }
        if (!reactApplicationContext.hasCurrentActivity()) {
            return false;
        }
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalArgumentException("[RNScreens] Attempt to use context detached from activity. This could happen only due to race-condition.");
        }
        synchronized (this) {
            if (this.isLayoutInitialized) {
                return true;
            }
            initDummyLayoutWithHeader(currentActivity);
            Unit unit = Unit.INSTANCE;
            return true;
        }
    }

    private final void initDummyLayoutWithHeader(Context context) {
        this.coordinatorLayout = new CoordinatorLayout(context);
        AppBarLayout appBarLayout = new AppBarLayout(context);
        appBarLayout.setLayoutParams(new CoordinatorLayout.onExtraCallbackWithResult(-1, -2));
        this.appBarLayout = appBarLayout;
        Toolbar toolbar = new Toolbar(context);
        toolbar.setTitle(DEFAULT_HEADER_TITLE);
        AppBarLayout.LayoutParams layoutParams = new AppBarLayout.LayoutParams(-1, -2);
        layoutParams.setScrollFlags(0);
        toolbar.setLayoutParams(layoutParams);
        this.toolbar = toolbar;
        ScreenStackHeaderConfig.Companion companion = ScreenStackHeaderConfig.Companion;
        Intrinsics.checkNotNull(toolbar);
        TextView textViewFindTitleTextViewInToolbar = companion.findTitleTextViewInToolbar(toolbar);
        Intrinsics.checkNotNull(textViewFindTitleTextViewInToolbar);
        this.defaultFontSize = textViewFindTitleTextViewInToolbar.getTextSize();
        Toolbar toolbar2 = this.toolbar;
        Intrinsics.checkNotNull(toolbar2);
        this.defaultContentInsetStartWithNavigation = toolbar2.getContentInsetStartWithNavigation();
        AppBarLayout appBarLayout2 = this.appBarLayout;
        Intrinsics.checkNotNull(appBarLayout2);
        appBarLayout2.addView(this.toolbar);
        View view = new View(context);
        view.setLayoutParams(new CoordinatorLayout.onExtraCallbackWithResult(-1, -1));
        this.dummyContentView = view;
        CoordinatorLayout coordinatorLayout = this.coordinatorLayout;
        Intrinsics.checkNotNull(coordinatorLayout);
        coordinatorLayout.addView(this.appBarLayout);
        coordinatorLayout.addView(this.dummyContentView);
        this.isLayoutInitialized = true;
    }

    private final float computeDummyLayout(int i, boolean z) {
        if (!this.isLayoutInitialized && !maybeInitDummyLayoutWithHeader(requireReactContext(new ScreenDummyLayoutHelper$.ExternalSyntheticLambda0()))) {
            return 0.0f;
        }
        synchronized (this) {
            CoordinatorLayout coordinatorLayout = this.coordinatorLayout;
            if (coordinatorLayout == null) {
                return 0.0f;
            }
            if (this.appBarLayout == null) {
                return 0.0f;
            }
            Toolbar toolbar = this.toolbar;
            if (toolbar == null) {
                return 0.0f;
            }
            if (this.cache.hasKey(new CacheKey(i, z))) {
                return this.cache.getHeaderHeight();
            }
            View decorView = requireActivity().getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "");
            int decorViewTopInset = DecorViewInsetsUtilsKt.getDecorViewTopInset(decorView);
            int width = decorView.getWidth();
            int height = decorView.getHeight();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
            if (z) {
                toolbar.setTitle("");
                toolbar.setContentInsetStartWithNavigation(0);
            } else {
                toolbar.setTitle(DEFAULT_HEADER_TITLE);
                toolbar.setContentInsetStartWithNavigation(this.defaultContentInsetStartWithNavigation);
            }
            TextView textViewFindTitleTextViewInToolbar = ScreenStackHeaderConfig.Companion.findTitleTextViewInToolbar(toolbar);
            if (textViewFindTitleTextViewInToolbar != null) {
                textViewFindTitleTextViewInToolbar.setTextSize(i != -1 ? i : this.defaultFontSize);
            }
            coordinatorLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            coordinatorLayout.layout(0, 0, width, height);
            float fOnExtraCallback = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(r2.getHeight() + decorViewTopInset);
            this.cache = new CacheEntry(new CacheKey(i, z), fOnExtraCallback);
            return fOnExtraCallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object computeDummyLayout$lambda$0() {
        return "[RNScreens] Context was null-ed before dummy layout was initialized";
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ ReactApplicationContext requireReactContext$default(ScreenDummyLayoutHelper screenDummyLayoutHelper, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        return screenDummyLayoutHelper.requireReactContext(function0);
    }

    private final ReactApplicationContext requireReactContext(Function0<? extends Object> function0) {
        ReactApplicationContext reactApplicationContext = this.reactContextRef.get();
        if (function0 == null) {
            function0 = new ScreenDummyLayoutHelper$.ExternalSyntheticLambda1<>();
        }
        if (reactApplicationContext != null) {
            return reactApplicationContext;
        }
        throw new IllegalArgumentException(function0.invoke().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object requireReactContext$lambda$0() {
        return "[RNScreens] Attempt to require missing react context";
    }

    private final Activity requireActivity() {
        Activity currentActivity = requireReactContext$default(this, null, 1, null).getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity;
        }
        throw new IllegalArgumentException("[RNScreens] Attempt to use context detached from activity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onHostResume$lambda$0() {
        return "[RNScreens] ReactContext missing in onHostResume! This should not happen.";
    }

    public void onHostResume() {
        maybeInitDummyLayoutWithHeader(requireReactContext(new ScreenDummyLayoutHelper$.ExternalSyntheticLambda2()));
    }

    public void onHostDestroy() {
        synchronized (this) {
            this.coordinatorLayout = null;
            this.appBarLayout = null;
            this.dummyContentView = null;
            this.toolbar = null;
            this.cache = CacheEntry.Companion.getEMPTY();
            this.isLayoutInitialized = false;
            Unit unit = Unit.INSTANCE;
        }
    }
}
