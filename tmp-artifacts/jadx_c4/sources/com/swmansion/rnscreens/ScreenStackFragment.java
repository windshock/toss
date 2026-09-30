package com.swmansion.rnscreens;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.animation.Animation;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.swmansion.rnscreens.ScreenStackHeaderSubview;
import com.swmansion.rnscreens.bottomsheet.BottomSheetTransitionCoordinator;
import com.swmansion.rnscreens.bottomsheet.BottomSheetWindowInsetListenerChain;
import com.swmansion.rnscreens.bottomsheet.DimmingViewManager;
import com.swmansion.rnscreens.bottomsheet.SheetDelegate;
import com.swmansion.rnscreens.bottomsheet.SheetUtilsKt;
import com.swmansion.rnscreens.events.ScreenDismissedEvent;
import com.swmansion.rnscreens.ext.ViewExtKt;
import com.swmansion.rnscreens.stack.views.ScreensCoordinatorLayout;
import com.swmansion.rnscreens.utils.DeviceUtils;
import com.swmansion.rnscreens.utils.ViewBackgroundUtilsKt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.RenderInTransitionOverlayNodeElement;
import o.r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ScreenStackFragment extends ScreenFragment implements ScreenStackFragmentWrapper {
    private CustomAppBarLayout appBarLayout;
    private BottomSheetWindowInsetListenerChain bottomSheetWindowInsetListenerChain;
    private ScreensCoordinatorLayout coordinatorLayout;
    private DimmingViewManager dimmingDelegate;
    private boolean isToolbarShadowHidden;
    private boolean isToolbarTranslucent;
    private View lastFocusedChild;
    private WindowInsetsCompat lastInsetsCompat;
    private Function1<? super CustomSearchView, Unit> onSearchViewCreate;
    private CustomSearchView searchView;
    private SheetDelegate sheetDelegate;
    private BottomSheetTransitionCoordinator sheetTransitionCoordinator;
    private Toolbar toolbar;

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public final CustomSearchView getSearchView() {
        return this.searchView;
    }

    public final void setSearchView(@Nullable CustomSearchView customSearchView) {
        this.searchView = customSearchView;
    }

    public final Function1<CustomSearchView, Unit> getOnSearchViewCreate() {
        return this.onSearchViewCreate;
    }

    public final void setOnSearchViewCreate(@Nullable Function1<? super CustomSearchView, Unit> function1) {
        this.onSearchViewCreate = function1;
    }

    private final ScreenStack getScreenStack() {
        ScreenContainer container = getScreen().getContainer();
        if (!(container instanceof ScreenStack)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
        }
        return (ScreenStack) container;
    }

    public final SheetDelegate getSheetDelegate$react_native_screens_release() {
        return this.sheetDelegate;
    }

    public final void setSheetDelegate$react_native_screens_release(@Nullable SheetDelegate sheetDelegate) {
        this.sheetDelegate = sheetDelegate;
    }

    public final BottomSheetWindowInsetListenerChain getBottomSheetWindowInsetListenerChain$react_native_screens_release() {
        return this.bottomSheetWindowInsetListenerChain;
    }

    public final void setBottomSheetWindowInsetListenerChain$react_native_screens_release(@Nullable BottomSheetWindowInsetListenerChain bottomSheetWindowInsetListenerChain) {
        this.bottomSheetWindowInsetListenerChain = bottomSheetWindowInsetListenerChain;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenStackFragment(@NotNull Screen screen) {
        super(screen);
        Intrinsics.checkNotNullParameter(screen, "");
    }

    public ScreenStackFragment() {
        throw new IllegalStateException("ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    @Override // com.swmansion.rnscreens.ScreenFragment, com.swmansion.rnscreens.ScreenFragmentWrapper
    public boolean isTranslucent() {
        return getScreen().isTranslucent();
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void removeToolbar() {
        View view;
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout != null && (view = this.toolbar) != null && view.getParent() == appBarLayout) {
            appBarLayout.removeView(view);
        }
        this.toolbar = null;
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void setToolbar(@NotNull Toolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "");
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout != null) {
            appBarLayout.addView(toolbar);
        }
        AppBarLayout.LayoutParams layoutParams = new AppBarLayout.LayoutParams(-1, -2);
        layoutParams.setScrollFlags(0);
        toolbar.setLayoutParams(layoutParams);
        this.toolbar = toolbar;
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void setToolbarShadowHidden(boolean z) {
        if (this.isToolbarShadowHidden != z) {
            CustomAppBarLayout customAppBarLayout = this.appBarLayout;
            if (customAppBarLayout != null) {
                customAppBarLayout.setElevation(z ? 0.0f : CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onWarmupCompleted(4.0f));
            }
            AppBarLayout appBarLayout = this.appBarLayout;
            if (appBarLayout != null) {
                appBarLayout.setStateListAnimator(null);
            }
            this.isToolbarShadowHidden = z;
        }
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void setToolbarTranslucent(boolean z) {
        if (this.isToolbarTranslucent != z) {
            CoordinatorLayout.onExtraCallbackWithResult layoutParams = getScreen().getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "");
            layoutParams.onExtraCallbackWithResult(z ? null : new AppBarLayout.ScrollingViewBehavior());
            this.isToolbarTranslucent = z;
        }
    }

    @Override // com.swmansion.rnscreens.ScreenFragment, com.swmansion.rnscreens.ScreenFragmentWrapper
    public void onContainerUpdate() {
        super.onContainerUpdate();
        ScreenStackHeaderConfig headerConfig = getScreen().getHeaderConfig();
        if (headerConfig != null) {
            headerConfig.onUpdate();
        }
    }

    @Override // com.swmansion.rnscreens.ScreenFragment, com.swmansion.rnscreens.ScreenFragmentWrapper
    public void onViewAnimationEnd() throws NoWhenBranchMatchedException {
        super.onViewAnimationEnd();
        notifyViewAppearTransitionEnd();
        getScreen().endRemovalTransition();
    }

    private final void notifyViewAppearTransitionEnd() {
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        if (parent instanceof ScreenStack) {
            ((ScreenStack) parent).onViewAppearTransitionEnd();
        }
    }

    public final void dismissSelf$react_native_screens_release() {
        if (isRemoving() && isDetached()) {
            return;
        }
        CredentialProviderGetSignInIntentControllerhandleResponse2 reactContext = getScreen().getReactContext();
        int iOnWarmupCompleted = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onWarmupCompleted(reactContext);
        EventDispatcher eventDispatcherOnExtraCallbackWithResult = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallbackWithResult(reactContext, getScreen().getId());
        if (eventDispatcherOnExtraCallbackWithResult != null) {
            eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(new ScreenDismissedEvent(iOnWarmupCompleted, getScreen().getId()));
        }
    }

    public final void onSheetCornerRadiusChange$react_native_screens_release() {
        getScreen().onSheetCornerRadiusChange$react_native_screens_release();
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.swmansion.rnscreens.ScreenFragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        BottomSheetBehavior<Screen> scrollingViewBehavior;
        CustomAppBarLayout customAppBarLayout;
        AppBarLayout appBarLayout;
        CustomAppBarLayout customAppBarLayout2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        this.coordinatorLayout = new ScreensCoordinatorLayout(contextRequireContext, this);
        Screen screen = getScreen();
        CoordinatorLayout.onExtraCallbackWithResult onextracallbackwithresult = new CoordinatorLayout.onExtraCallbackWithResult(-1, -1);
        if (SheetUtilsKt.usesFormSheetPresentation(getScreen())) {
            scrollingViewBehavior = createBottomSheetBehaviour();
        } else {
            scrollingViewBehavior = this.isToolbarTranslucent ? null : new AppBarLayout.ScrollingViewBehavior<>();
        }
        onextracallbackwithresult.onExtraCallbackWithResult(scrollingViewBehavior);
        screen.setLayoutParams(onextracallbackwithresult);
        CoordinatorLayout coordinatorLayout = this.coordinatorLayout;
        if (coordinatorLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            coordinatorLayout = null;
        }
        coordinatorLayout.addView(ViewExtKt.recycle(getScreen()));
        if (!SheetUtilsKt.usesFormSheetPresentation(getScreen())) {
            Context context = getContext();
            if (context != null) {
                AppBarLayout customAppBarLayout3 = new CustomAppBarLayout(context);
                customAppBarLayout3.setBackgroundColor(0);
                customAppBarLayout3.setLayoutParams(new AppBarLayout.LayoutParams(-1, -2));
                customAppBarLayout = customAppBarLayout3;
            } else {
                customAppBarLayout = null;
            }
            this.appBarLayout = customAppBarLayout;
            CoordinatorLayout coordinatorLayout2 = this.coordinatorLayout;
            if (coordinatorLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                coordinatorLayout2 = null;
            }
            coordinatorLayout2.addView(this.appBarLayout);
            if (this.isToolbarShadowHidden && (customAppBarLayout2 = this.appBarLayout) != null) {
                customAppBarLayout2.setTargetElevation(0.0f);
            }
            Toolbar toolbar = this.toolbar;
            if (toolbar != null && (appBarLayout = this.appBarLayout) != null) {
                appBarLayout.addView(ViewExtKt.recycle(toolbar));
            }
            setHasOptionsMenu(true);
        } else {
            getScreen().setClipToOutline(true);
            attachShapeToScreen(getScreen());
            getScreen().setElevation(getScreen().getSheetElevation());
            final SheetDelegate sheetDelegateRequireSheetDelegate = requireSheetDelegate();
            BottomSheetBehavior<Screen> sheetBehavior = getScreen().getSheetBehavior();
            Intrinsics.checkNotNull(sheetBehavior);
            SheetDelegate.configureBottomSheetBehaviour$react_native_screens_release$default(sheetDelegateRequireSheetDelegate, sheetBehavior, null, 0, 6, null);
            DimmingViewManager dimmingViewManagerRequireDimmingDelegate = requireDimmingDelegate(true);
            Screen screen2 = getScreen();
            CoordinatorLayout coordinatorLayout3 = this.coordinatorLayout;
            if (coordinatorLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                coordinatorLayout3 = null;
            }
            dimmingViewManagerRequireDimmingDelegate.onViewHierarchyCreated(screen2, coordinatorLayout3);
            Screen screen3 = getScreen();
            BottomSheetBehavior<Screen> sheetBehavior2 = getScreen().getSheetBehavior();
            Intrinsics.checkNotNull(sheetBehavior2);
            dimmingViewManagerRequireDimmingDelegate.onBehaviourAttached(screen3, sheetBehavior2);
            if (!getScreen().getSheetShouldOverflowTopInset()) {
                BottomSheetTransitionCoordinator bottomSheetTransitionCoordinator = new BottomSheetTransitionCoordinator();
                this.sheetTransitionCoordinator = bottomSheetTransitionCoordinator;
                attachInsetsAndLayoutListenersToBottomSheet(bottomSheetTransitionCoordinator);
            }
            ScreenContainer container = getScreen().getContainer();
            Intrinsics.checkNotNull(container);
            CoordinatorLayout coordinatorLayout4 = this.coordinatorLayout;
            if (coordinatorLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                coordinatorLayout4 = null;
            }
            coordinatorLayout4.measure(View.MeasureSpec.makeMeasureSpec(container.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(container.getHeight(), 1073741824));
            CoordinatorLayout coordinatorLayout5 = this.coordinatorLayout;
            if (coordinatorLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                coordinatorLayout5 = null;
            }
            coordinatorLayout5.layout(0, 0, container.getWidth(), container.getHeight());
            if (Build.VERSION.SDK_INT < 30) {
                BottomSheetWindowInsetListenerChain bottomSheetWindowInsetListenerChainRequireBottomSheetWindowInsetsListenerChain$react_native_screens_release = requireBottomSheetWindowInsetsListenerChain$react_native_screens_release();
                bottomSheetWindowInsetListenerChainRequireBottomSheetWindowInsetsListenerChain$react_native_screens_release.addListener(new RenderInTransitionOverlayNodeElement() { // from class: com.swmansion.rnscreens.ScreenStackFragment$$ExternalSyntheticLambda0
                    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                        return ScreenStackFragment.onCreateView$lambda$4(sheetDelegateRequireSheetDelegate, view, windowInsetsCompat);
                    }
                });
                ViewCompat.onWarmupCompleted(getScreen(), bottomSheetWindowInsetListenerChainRequireBottomSheetWindowInsetsListenerChain$react_native_screens_release);
            }
            ViewCompat.onExtraCallback(getScreen(), new WindowInsetsAnimationCompat.Callback() { // from class: com.swmansion.rnscreens.ScreenStackFragment$onCreateView$insetsAnimationCallback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List<WindowInsetsAnimationCompat> list) {
                    Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
                    Intrinsics.checkNotNullParameter(list, "");
                    if (Build.VERSION.SDK_INT >= 30) {
                        sheetDelegateRequireSheetDelegate.handleKeyboardInsetsProgress$react_native_screens_release(windowInsetsCompat);
                    }
                    return windowInsetsCompat;
                }

                public void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
                    Intrinsics.checkNotNullParameter(windowInsetsAnimationCompat, "");
                    super.onEnd(windowInsetsAnimationCompat);
                    this.getScreen().onSheetYTranslationChanged$react_native_screens_release();
                }
            });
        }
        CoordinatorLayout coordinatorLayout6 = this.coordinatorLayout;
        if (coordinatorLayout6 != null) {
            return coordinatorLayout6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat onCreateView$lambda$4(SheetDelegate sheetDelegate, View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        sheetDelegate.handleKeyboardInsetsProgress$react_native_screens_release(windowInsetsCompat);
        return windowInsetsCompat;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        if (SheetUtilsKt.usesFormSheetPresentation(getScreen())) {
            return z ? createSheetEnterAnimator() : createSheetExitAnimator();
        }
        return null;
    }

    private final Animator createSheetEnterAnimator() {
        SheetDelegate sheetDelegateRequireSheetDelegate = requireSheetDelegate();
        ScreensCoordinatorLayout screensCoordinatorLayout = null;
        DimmingViewManager dimmingViewManagerRequireDimmingDelegate$default = requireDimmingDelegate$default(this, false, 1, null);
        Screen screen = getScreen();
        ScreensCoordinatorLayout screensCoordinatorLayout2 = this.coordinatorLayout;
        if (screensCoordinatorLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            screensCoordinatorLayout = screensCoordinatorLayout2;
        }
        return sheetDelegateRequireSheetDelegate.createSheetEnterAnimator$react_native_screens_release(new SheetDelegate.SheetAnimationContext(this, screen, screensCoordinatorLayout, dimmingViewManagerRequireDimmingDelegate$default));
    }

    private final Animator createSheetExitAnimator() {
        SheetDelegate sheetDelegateRequireSheetDelegate = requireSheetDelegate();
        ScreensCoordinatorLayout screensCoordinatorLayout = null;
        DimmingViewManager dimmingViewManagerRequireDimmingDelegate$default = requireDimmingDelegate$default(this, false, 1, null);
        Screen screen = getScreen();
        ScreensCoordinatorLayout screensCoordinatorLayout2 = this.coordinatorLayout;
        if (screensCoordinatorLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            screensCoordinatorLayout = screensCoordinatorLayout2;
        }
        return sheetDelegateRequireSheetDelegate.createSheetExitAnimator$react_native_screens_release(new SheetDelegate.SheetAnimationContext(this, screen, screensCoordinatorLayout, dimmingViewManagerRequireDimmingDelegate$default));
    }

    private final BottomSheetBehavior<Screen> createBottomSheetBehaviour() {
        return new BottomSheetBehavior<>();
    }

    private final Integer resolveBackgroundColor(Screen screen) {
        Integer numValueOf;
        ColorStateList tintList;
        Drawable background = screen.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            numValueOf = Integer.valueOf(colorDrawable.getColor());
        } else {
            MaterialShapeDrawable background2 = screen.getBackground();
            MaterialShapeDrawable materialShapeDrawable = background2 instanceof MaterialShapeDrawable ? background2 : null;
            numValueOf = (materialShapeDrawable == null || (tintList = materialShapeDrawable.getTintList()) == null) ? null : Integer.valueOf(tintList.getDefaultColor());
        }
        if (numValueOf != null) {
            return numValueOf;
        }
        ScreenContentWrapper contentWrapper = screen.getContentWrapper();
        if (contentWrapper == null) {
            return null;
        }
        return ViewBackgroundUtilsKt.resolveBackgroundColor(contentWrapper);
    }

    private final void attachShapeToScreen(Screen screen) {
        float fMax = Math.max(CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onWarmupCompleted(screen.getSheetCornerRadius()), 0.0f);
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
        builder.setTopLeftCorner(0, fMax);
        builder.setTopRightCorner(0, fMax);
        ShapeAppearanceModel shapeAppearanceModelBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(shapeAppearanceModelBuild, "");
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelBuild);
        Integer numResolveBackgroundColor = resolveBackgroundColor(screen);
        materialShapeDrawable.setTint(numResolveBackgroundColor != null ? numResolveBackgroundColor.intValue() : 0);
        screen.setBackground(materialShapeDrawable);
    }

    public void onStart() {
        View view = this.lastFocusedChild;
        if (view != null) {
            view.requestFocus();
        }
        super.onStart();
    }

    public void onStop() {
        if (DeviceUtils.INSTANCE.isPlatformAndroidTV(getContext())) {
            this.lastFocusedChild = findLastFocusedChild();
        }
        super.onStop();
    }

    public void onPrepareOptionsMenu(@NotNull Menu menu) {
        ScreenStackHeaderConfig headerConfig;
        Intrinsics.checkNotNullParameter(menu, "");
        if (!getScreen().isTranslucent() || ((headerConfig = getScreen().getHeaderConfig()) != null && !headerConfig.isHeaderHidden())) {
            updateToolbarMenu(menu);
        }
        super.onPrepareOptionsMenu(menu);
    }

    public void onCreateOptionsMenu(@NotNull Menu menu, @NotNull MenuInflater menuInflater) {
        Intrinsics.checkNotNullParameter(menu, "");
        Intrinsics.checkNotNullParameter(menuInflater, "");
        updateToolbarMenu(menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    private final boolean shouldShowSearchBar() {
        ScreenStackHeaderConfig headerConfig = getScreen().getHeaderConfig();
        int configSubviewsCount = headerConfig != null ? headerConfig.getConfigSubviewsCount() : 0;
        if (headerConfig != null && configSubviewsCount > 0) {
            for (int i = 0; i < configSubviewsCount; i++) {
                if (headerConfig.getConfigSubview(i).getType() == ScreenStackHeaderSubview.Type.SEARCH_BAR) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void updateToolbarMenu(Menu menu) {
        menu.clear();
        if (shouldShowSearchBar()) {
            Context context = getContext();
            if (this.searchView == null && context != null) {
                CustomSearchView customSearchView = new CustomSearchView(context, this);
                this.searchView = customSearchView;
                Function1<? super CustomSearchView, Unit> function1 = this.onSearchViewCreate;
                if (function1 != null) {
                    function1.invoke(customSearchView);
                }
            }
            MenuItem menuItemAdd = menu.add("");
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setActionView((View) this.searchView);
        }
    }

    private final View findLastFocusedChild() {
        View screen = getScreen();
        while (screen != null) {
            if (screen.isFocused()) {
                return screen;
            }
            screen = screen instanceof ViewGroup ? ((ViewGroup) screen).getFocusedChild() : null;
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public boolean canNavigateBack() {
        ScreenContainer container = getScreen().getContainer();
        if (!(container instanceof ScreenStack)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
        }
        if (!Intrinsics.areEqual(((ScreenStack) container).getRootScreen(), getScreen())) {
            return true;
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof ScreenStackFragment) {
            return ((ScreenStackFragment) parentFragment).canNavigateBack();
        }
        return false;
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void dismissFromContainer() {
        getScreenStack().dismiss(this);
    }

    private final void attachInsetsAndLayoutListenersToBottomSheet(final BottomSheetTransitionCoordinator bottomSheetTransitionCoordinator) {
        final ScreenContainer container = getScreen().getContainer();
        if (container != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                container.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.swmansion.rnscreens.ScreenStackFragment$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        return ScreenStackFragment.attachInsetsAndLayoutListenersToBottomSheet$lambda$0$0(container, this, view, windowInsets);
                    }
                });
            } else {
                requireBottomSheetWindowInsetsListenerChain$react_native_screens_release().addListener(new RenderInTransitionOverlayNodeElement() { // from class: com.swmansion.rnscreens.ScreenStackFragment$$ExternalSyntheticLambda2
                    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                        return ScreenStackFragment.attachInsetsAndLayoutListenersToBottomSheet$lambda$0$1(this.f$0, view, windowInsetsCompat);
                    }
                });
            }
        }
        ScreenContainer container2 = getScreen().getContainer();
        if (container2 != null) {
            container2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.swmansion.rnscreens.ScreenStackFragment$$ExternalSyntheticLambda3
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    ScreenStackFragment.attachInsetsAndLayoutListenersToBottomSheet$lambda$1(bottomSheetTransitionCoordinator, this, view, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets attachInsetsAndLayoutListenersToBottomSheet$lambda$0$0(ScreenContainer screenContainer, ScreenStackFragment screenStackFragment, View view, WindowInsets windowInsets) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsets, "");
        WindowInsetsCompat windowInsetsCompatIAuthTabCallback = WindowInsetsCompat.IAuthTabCallback(windowInsets, screenContainer);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatIAuthTabCallback, "");
        screenStackFragment.handleInsetsUpdateAndNotifyTransition(windowInsetsCompatIAuthTabCallback);
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat attachInsetsAndLayoutListenersToBottomSheet$lambda$0$1(ScreenStackFragment screenStackFragment, View view, WindowInsetsCompat windowInsetsCompat) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        screenStackFragment.handleInsetsUpdateAndNotifyTransition(windowInsetsCompat);
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachInsetsAndLayoutListenersToBottomSheet$lambda$1(BottomSheetTransitionCoordinator bottomSheetTransitionCoordinator, ScreenStackFragment screenStackFragment, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        bottomSheetTransitionCoordinator.onScreenContainerLayoutChanged$react_native_screens_release(screenStackFragment.getScreen());
    }

    private final void handleInsetsUpdateAndNotifyTransition(WindowInsetsCompat windowInsetsCompat) throws NoWhenBranchMatchedException {
        if (Intrinsics.areEqual(this.lastInsetsCompat, windowInsetsCompat)) {
            return;
        }
        this.lastInsetsCompat = windowInsetsCompat;
        SheetDelegate sheetDelegateRequireSheetDelegate = requireSheetDelegate();
        BottomSheetBehavior<Screen> sheetBehavior = getScreen().getSheetBehavior();
        Intrinsics.checkNotNull(sheetBehavior);
        sheetDelegateRequireSheetDelegate.updateBottomSheetMetrics$react_native_screens_release(sheetBehavior);
        ScreenContainer container = getScreen().getContainer();
        BottomSheetTransitionCoordinator bottomSheetTransitionCoordinator = null;
        if (container != null) {
            CoordinatorLayout coordinatorLayout = this.coordinatorLayout;
            if (coordinatorLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                coordinatorLayout = null;
            }
            coordinatorLayout.forceLayout();
            CoordinatorLayout coordinatorLayout2 = this.coordinatorLayout;
            if (coordinatorLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                coordinatorLayout2 = null;
            }
            coordinatorLayout2.measure(View.MeasureSpec.makeMeasureSpec(container.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(container.getHeight(), 1073741824));
            CoordinatorLayout coordinatorLayout3 = this.coordinatorLayout;
            if (coordinatorLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                coordinatorLayout3 = null;
            }
            coordinatorLayout3.layout(0, 0, container.getWidth(), container.getHeight());
        }
        getScreen().onBottomSheetBehaviorDidLayout$react_native_screens_release(true);
        BottomSheetTransitionCoordinator bottomSheetTransitionCoordinator2 = this.sheetTransitionCoordinator;
        if (bottomSheetTransitionCoordinator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            bottomSheetTransitionCoordinator = bottomSheetTransitionCoordinator2;
        }
        bottomSheetTransitionCoordinator.onScreenContainerInsetsApplied$react_native_screens_release(getScreen());
    }

    static /* synthetic */ DimmingViewManager requireDimmingDelegate$default(ScreenStackFragment screenStackFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return screenStackFragment.requireDimmingDelegate(z);
    }

    private final DimmingViewManager requireDimmingDelegate(boolean z) {
        DimmingViewManager dimmingViewManager = this.dimmingDelegate;
        if (dimmingViewManager == null || z) {
            if (dimmingViewManager != null) {
                dimmingViewManager.invalidate(getScreen().getSheetBehavior());
            }
            this.dimmingDelegate = new DimmingViewManager(getScreen().getReactContext(), getScreen());
        }
        DimmingViewManager dimmingViewManager2 = this.dimmingDelegate;
        Intrinsics.checkNotNull(dimmingViewManager2);
        return dimmingViewManager2;
    }

    private final SheetDelegate requireSheetDelegate() {
        if (this.sheetDelegate == null) {
            this.sheetDelegate = new SheetDelegate(getScreen());
        }
        SheetDelegate sheetDelegate = this.sheetDelegate;
        Intrinsics.checkNotNull(sheetDelegate);
        return sheetDelegate;
    }

    public final BottomSheetWindowInsetListenerChain requireBottomSheetWindowInsetsListenerChain$react_native_screens_release() {
        if (this.bottomSheetWindowInsetListenerChain == null) {
            this.bottomSheetWindowInsetListenerChain = new BottomSheetWindowInsetListenerChain();
        }
        BottomSheetWindowInsetListenerChain bottomSheetWindowInsetListenerChain = this.bottomSheetWindowInsetListenerChain;
        Intrinsics.checkNotNull(bottomSheetWindowInsetListenerChain);
        return bottomSheetWindowInsetListenerChain;
    }
}
