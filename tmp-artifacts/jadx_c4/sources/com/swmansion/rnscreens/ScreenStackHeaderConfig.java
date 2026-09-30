package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.swmansion.rnscreens.ScreenStackHeaderConfig$;
import com.swmansion.rnscreens.ScreenStackHeaderSubview;
import com.swmansion.rnscreens.events.HeaderAttachedEvent;
import com.swmansion.rnscreens.events.HeaderDetachedEvent;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1;
import o.IPostMessageServiceStubProxy;
import o.r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ScreenStackHeaderConfig extends FabricEnabledHeaderConfigViewGroup implements ReactPointerEventsView {
    public static final Companion Companion = new Companion(null);
    private boolean backButtonInCustomView;
    private final View.OnClickListener backClickListener;
    private Integer backgroundColor;
    private final ArrayList<ScreenStackHeaderSubview> configSubviews;
    private final int defaultStartInset;
    private final int defaultStartInsetWithNavigation;
    private String direction;
    private final ScreenStackHeaderHeightUpdateProxy headerHeightUpdateProxy;
    private boolean isAttachedToWindow;
    private boolean isBackButtonHidden;
    private boolean isDestroyed;
    private boolean isHeaderHidden;
    private boolean isHeaderTranslucent;
    private boolean isShadowHidden;
    private boolean isTitleEmpty;
    private boolean isUpdating;
    private final ReactPointerEventsView pointerEventsImpl;
    private int tintColor;
    private String title;
    private int titleColor;
    private String titleFontFamily;
    private float titleFontSize;
    private int titleFontWeight;
    private final CustomToolbar toolbar;

    public CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1 getPointerEvents() {
        return this.pointerEventsImpl.getPointerEvents();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View, android.view.ViewGroup, androidx.appcompat.widget.Toolbar, com.swmansion.rnscreens.CustomToolbar] */
    public ScreenStackHeaderConfig(@NotNull Context context, @NotNull ReactPointerEventsView reactPointerEventsView) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(reactPointerEventsView, "");
        this.pointerEventsImpl = reactPointerEventsView;
        this.configSubviews = new ArrayList<>(3);
        this.backClickListener = new ScreenStackHeaderConfig$.ExternalSyntheticLambda0(this);
        this.headerHeightUpdateProxy = new ScreenStackHeaderHeightUpdateProxy();
        setVisibility(8);
        ?? customToolbar = new CustomToolbar(context, this);
        this.toolbar = customToolbar;
        this.defaultStartInset = customToolbar.getContentInsetStart();
        this.defaultStartInsetWithNavigation = customToolbar.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(android.R.attr.colorPrimary, typedValue, true)) {
            customToolbar.setBackgroundColor(typedValue.data);
        }
        customToolbar.setClipChildren(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScreenStackHeaderConfig(@NotNull Context context) {
        this(context, new PointerEventsBoxNoneImpl());
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final CustomToolbar getToolbar() {
        return this.toolbar;
    }

    public final boolean isHeaderHidden() {
        return this.isHeaderHidden;
    }

    public final void setHeaderHidden(boolean z) {
        this.isHeaderHidden = z;
    }

    public final boolean isHeaderTranslucent() {
        return this.isHeaderTranslucent;
    }

    public final void setHeaderTranslucent(boolean z) {
        this.isHeaderTranslucent = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void backClickListener$lambda$0(ScreenStackHeaderConfig screenStackHeaderConfig, View view) {
        ScreenStackFragment screenFragment = screenStackHeaderConfig.getScreenFragment();
        if (screenFragment != null) {
            ScreenStack screenStack = screenStackHeaderConfig.getScreenStack();
            if (screenStack != null && Intrinsics.areEqual(screenStack.getRootScreen(), screenFragment.getScreen())) {
                Fragment parentFragment = screenFragment.getParentFragment();
                if (parentFragment instanceof ScreenStackFragment) {
                    ScreenStackFragment screenStackFragment = (ScreenStackFragment) parentFragment;
                    if (screenStackFragment.getScreen().getNativeBackButtonDismissalEnabled()) {
                        screenStackFragment.dismissFromContainer();
                        return;
                    } else {
                        screenStackFragment.dispatchHeaderBackButtonClickedEvent();
                        return;
                    }
                }
                return;
            }
            if (screenFragment.getScreen().getNativeBackButtonDismissalEnabled()) {
                screenFragment.dismissFromContainer();
            } else {
                screenFragment.dispatchHeaderBackButtonClickedEvent();
            }
        }
    }

    public final boolean isTitleEmpty() {
        return this.isTitleEmpty;
    }

    public final void setTitleEmpty(boolean z) {
        this.isTitleEmpty = z;
    }

    public final int getPreferredContentInsetStart() {
        return this.defaultStartInset;
    }

    public final int getPreferredContentInsetEnd() {
        return this.defaultStartInset;
    }

    public final int getPreferredContentInsetStartWithNavigation() {
        if (this.isTitleEmpty) {
            return 0;
        }
        return this.defaultStartInsetWithNavigation;
    }

    public final ScreenStackHeaderHeightUpdateProxy getHeaderHeightUpdateProxy() {
        return this.headerHeightUpdateProxy;
    }

    public final void destroy() {
        this.isDestroyed = true;
    }

    public final void onNativeToolbarLayout(@NotNull Toolbar toolbar, boolean z) {
        int iMax;
        Object next;
        Intrinsics.checkNotNullParameter(toolbar, "");
        if (z) {
            if (toolbar.getNavigationIcon() != null) {
                iMax = toolbar.getCurrentContentInsetStart() + toolbar.getPaddingStart();
            } else {
                iMax = Math.max(toolbar.getCurrentContentInsetStart(), toolbar.getPaddingStart());
            }
            Iterator<T> it = this.configSubviews.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((ScreenStackHeaderSubview) next).getType() == ScreenStackHeaderSubview.Type.LEFT) {
                        break;
                    }
                }
            }
            ScreenStackHeaderSubview screenStackHeaderSubview = (ScreenStackHeaderSubview) next;
            if (screenStackHeaderSubview != null) {
                iMax = screenStackHeaderSubview.getLeft();
            }
            int currentContentInsetEnd = toolbar.getCurrentContentInsetEnd();
            int paddingEnd = toolbar.getPaddingEnd();
            this.headerHeightUpdateProxy.updateHeaderHeightIfNeeded(this, getScreen());
            updateHeaderConfigState(toolbar.getWidth(), toolbar.getHeight(), iMax, currentContentInsetEnd + paddingEnd);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        int iOnExtraCallback = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallback(this);
        ReactContext context = getContext();
        Intrinsics.checkNotNull(context, "");
        EventDispatcher eventDispatcherOnExtraCallbackWithResult = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallbackWithResult(context, getId());
        if (eventDispatcherOnExtraCallbackWithResult != null) {
            eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(new HeaderAttachedEvent(iOnExtraCallback, getId()));
        }
        onUpdate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        int iOnExtraCallback = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallback(this);
        ReactContext context = getContext();
        Intrinsics.checkNotNull(context, "");
        EventDispatcher eventDispatcherOnExtraCallbackWithResult = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallbackWithResult(context, getId());
        if (eventDispatcherOnExtraCallbackWithResult != null) {
            eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(new HeaderDetachedEvent(iOnExtraCallback, getId()));
        }
    }

    private final Screen getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof Screen) {
            return (Screen) parent;
        }
        return null;
    }

    private final ScreenStack getScreenStack() {
        Screen screen = getScreen();
        ScreenContainer container = screen != null ? screen.getContainer() : null;
        if (container instanceof ScreenStack) {
            return (ScreenStack) container;
        }
        return null;
    }

    public final ScreenStackFragment getScreenFragment() {
        ViewParent parent = getParent();
        if (!(parent instanceof Screen)) {
            return null;
        }
        Fragment fragment = ((Screen) parent).getFragment();
        if (fragment instanceof ScreenStackFragment) {
            return (ScreenStackFragment) fragment;
        }
        return null;
    }

    public final void onUpdate() {
        Drawable navigationIcon;
        ScreenStackFragment screenFragment;
        ScreenStackFragment screenFragment2;
        ReactContext reactContextTryGetContext;
        if (this.isUpdating) {
            return;
        }
        ScreenStack screenStack = getScreenStack();
        boolean z = screenStack == null || Intrinsics.areEqual(screenStack.getTopScreen(), getParent());
        if (this.isAttachedToWindow && z && !this.isDestroyed) {
            this.isUpdating = true;
            try {
                ScreenStackFragment screenFragment3 = getScreenFragment();
                Activity activity = (AppCompatActivity) (screenFragment3 != null ? screenFragment3.getActivity() : null);
                if (activity == null) {
                    return;
                }
                String str = this.direction;
                if (str != null) {
                    if (Intrinsics.areEqual(str, "rtl")) {
                        this.toolbar.setLayoutDirection(1);
                    } else if (Intrinsics.areEqual(this.direction, "ltr")) {
                        this.toolbar.setLayoutDirection(0);
                    }
                }
                Screen screen = getScreen();
                if (screen != null) {
                    if (getContext() instanceof ReactContext) {
                        Context context = getContext();
                        Intrinsics.checkNotNull(context, "");
                        reactContextTryGetContext = (ReactContext) context;
                    } else {
                        ScreenFragmentWrapper fragmentWrapper = screen.getFragmentWrapper();
                        reactContextTryGetContext = fragmentWrapper != null ? fragmentWrapper.tryGetContext() : null;
                    }
                    ScreenWindowTraits.INSTANCE.trySetWindowTraits$react_native_screens_release(screen, activity, reactContextTryGetContext);
                }
                if (this.isHeaderHidden) {
                    if (this.toolbar.getParent() != null && (screenFragment2 = getScreenFragment()) != null) {
                        screenFragment2.removeToolbar();
                    }
                    this.headerHeightUpdateProxy.updateHeaderHeightIfNeeded(this, getScreen());
                    return;
                }
                if (this.toolbar.getParent() == null && (screenFragment = getScreenFragment()) != null) {
                    screenFragment.setToolbar(this.toolbar);
                }
                activity.setSupportActionBar(this.toolbar);
                IPostMessageServiceStubProxy supportActionBar = activity.getSupportActionBar();
                if (supportActionBar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ScreenStackFragment screenFragment4 = getScreenFragment();
                supportActionBar.onNavigationEvent((screenFragment4 == null || !screenFragment4.canNavigateBack() || this.isBackButtonHidden) ? false : true);
                supportActionBar.onExtraCallbackWithResult(this.title);
                if (TextUtils.isEmpty(this.title)) {
                    this.isTitleEmpty = true;
                }
                this.toolbar.updateContentInsets();
                this.toolbar.setNavigationOnClickListener(this.backClickListener);
                ScreenStackFragment screenFragment5 = getScreenFragment();
                if (screenFragment5 != null) {
                    screenFragment5.setToolbarShadowHidden(this.isShadowHidden);
                }
                ScreenStackFragment screenFragment6 = getScreenFragment();
                if (screenFragment6 != null) {
                    screenFragment6.setToolbarTranslucent(this.isHeaderTranslucent);
                }
                TextView textViewFindTitleTextViewInToolbar = Companion.findTitleTextViewInToolbar(this.toolbar);
                int i = this.titleColor;
                if (i != 0) {
                    this.toolbar.setTitleTextColor(i);
                }
                if (textViewFindTitleTextViewInToolbar != null) {
                    String str2 = this.titleFontFamily;
                    if (str2 != null || this.titleFontWeight > 0) {
                        int i2 = this.titleFontWeight;
                        AssetManager assets = getContext().getAssets();
                        Intrinsics.checkNotNullExpressionValue(assets, "");
                        textViewFindTitleTextViewInToolbar.setTypeface(ReactTypefaceUtils.onExtraCallbackWithResult((Typeface) null, 0, i2, str2, assets));
                    }
                    float f = this.titleFontSize;
                    if (f > 0.0f) {
                        textViewFindTitleTextViewInToolbar.setTextSize(f);
                    }
                }
                Integer num = this.backgroundColor;
                if (num != null) {
                    this.toolbar.setBackgroundColor(num.intValue());
                }
                if (this.tintColor != 0 && (navigationIcon = this.toolbar.getNavigationIcon()) != null) {
                    navigationIcon.setColorFilter(new PorterDuffColorFilter(this.tintColor, PorterDuff.Mode.SRC_ATOP));
                }
                for (int childCount = this.toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
                    if (this.toolbar.getChildAt(childCount) instanceof ScreenStackHeaderSubview) {
                        this.toolbar.removeViewAt(childCount);
                    }
                }
                int size = this.configSubviews.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ScreenStackHeaderSubview screenStackHeaderSubview = this.configSubviews.get(i3);
                    Intrinsics.checkNotNullExpressionValue(screenStackHeaderSubview, "");
                    ScreenStackHeaderSubview screenStackHeaderSubview2 = screenStackHeaderSubview;
                    ScreenStackHeaderSubview.Type type = screenStackHeaderSubview2.getType();
                    if (type == ScreenStackHeaderSubview.Type.BACK) {
                        View childAt = screenStackHeaderSubview2.getChildAt(0);
                        ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
                        if (imageView == null) {
                            throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
                        }
                        supportActionBar.onExtraCallbackWithResult(imageView.getDrawable());
                    } else {
                        Toolbar.IAuthTabCallback iAuthTabCallback = new Toolbar.IAuthTabCallback(-2, -1);
                        int i4 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                        if (i4 == 1) {
                            if (!this.backButtonInCustomView) {
                                this.toolbar.setNavigationIcon((Drawable) null);
                            }
                            this.toolbar.setTitle((CharSequence) null);
                            ((IPostMessageServiceStubProxy.onExtraCallbackWithResult) iAuthTabCallback).onWarmupCompleted = 8388611;
                        } else if (i4 == 2) {
                            ((IPostMessageServiceStubProxy.onExtraCallbackWithResult) iAuthTabCallback).onWarmupCompleted = 8388613;
                        } else if (i4 == 3) {
                            ((ViewGroup.MarginLayoutParams) iAuthTabCallback).width = -1;
                            ((IPostMessageServiceStubProxy.onExtraCallbackWithResult) iAuthTabCallback).onWarmupCompleted = 1;
                            this.toolbar.setTitle((CharSequence) null);
                        }
                        screenStackHeaderSubview2.setLayoutParams(iAuthTabCallback);
                        ViewParent parent = screenStackHeaderSubview2.getParent();
                        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup != null) {
                            viewGroup.removeView(screenStackHeaderSubview2);
                        }
                        if (screenStackHeaderSubview2.getParent() == null) {
                            this.toolbar.addView(screenStackHeaderSubview2);
                        }
                    }
                }
                this.headerHeightUpdateProxy.updateHeaderHeightIfNeeded(this, getScreen());
            } finally {
                this.isUpdating = false;
            }
        }
    }

    private final void maybeUpdate() {
        Screen screen;
        if (getParent() == null || this.isDestroyed || (screen = getScreen()) == null || screen.isBeingRemoved()) {
            return;
        }
        onUpdate();
    }

    public final ScreenStackHeaderSubview getConfigSubview(int i) {
        ScreenStackHeaderSubview screenStackHeaderSubview = this.configSubviews.get(i);
        Intrinsics.checkNotNullExpressionValue(screenStackHeaderSubview, "");
        return screenStackHeaderSubview;
    }

    public final int getConfigSubviewsCount() {
        return this.configSubviews.size();
    }

    public final void removeConfigSubview(int i) {
        this.configSubviews.remove(i);
        maybeUpdate();
    }

    public final void removeAllConfigSubviews() {
        this.configSubviews.clear();
        maybeUpdate();
    }

    public final void addConfigSubview(@NotNull ScreenStackHeaderSubview screenStackHeaderSubview, int i) {
        Intrinsics.checkNotNullParameter(screenStackHeaderSubview, "");
        this.configSubviews.add(i, screenStackHeaderSubview);
        maybeUpdate();
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTitleFontFamily(@Nullable String str) {
        this.titleFontFamily = str;
    }

    public final void setTitleFontWeight(@Nullable String str) {
        this.titleFontWeight = ReactTypefaceUtils.onNavigationEvent(str);
    }

    public final void setTitleFontSize(float f) {
        this.titleFontSize = f;
    }

    public final void setTitleColor(int i) {
        this.titleColor = i;
    }

    public final void setTintColor(int i) {
        this.tintColor = i;
    }

    public final void setBackgroundColor(@Nullable Integer num) {
        this.backgroundColor = num;
    }

    public final void setHideShadow(boolean z) {
        this.isShadowHidden = z;
    }

    public final void setHideBackButton(boolean z) {
        this.isBackButtonHidden = z;
    }

    public final void setHidden(boolean z) {
        this.isHeaderHidden = z;
    }

    public final void setTranslucent(boolean z) {
        this.isHeaderTranslucent = z;
    }

    public final void setBackButtonInCustomView(boolean z) {
        this.backButtonInCustomView = z;
    }

    public final void setDirection(@Nullable String str) {
        this.direction = str;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TextView findTitleTextViewInToolbar(@NotNull Toolbar toolbar) {
            Intrinsics.checkNotNullParameter(toolbar, "");
            int childCount = toolbar.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = toolbar.getChildAt(i);
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    if (TextUtils.equals(textView.getText(), toolbar.getTitle())) {
                        return textView;
                    }
                }
            }
            return null;
        }
    }
}
