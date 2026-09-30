package com.swmansion.rnscreens;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenContainer$;
import com.swmansion.rnscreens.events.ScreenDismissedEvent;
import com.swmansion.rnscreens.gamma.common.FragmentProviding;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.FlowRowOverflowCompanionExternalSyntheticLambda4;
import o.r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class ScreenContainer extends ViewGroup {
    protected FlowMeasureLazyPolicyExternalSyntheticLambda3 fragmentManager;
    private boolean isAttached;
    private boolean isLayoutEnqueued;
    private final Choreographer.FrameCallback layoutCallback;
    private boolean needsUpdate;
    private ScreenFragmentWrapper parentScreenWrapper;
    protected final ArrayList<ScreenFragmentWrapper> screenWrappers;

    public ScreenContainer(@Nullable Context context) {
        super(context);
        this.screenWrappers = new ArrayList<>();
        this.layoutCallback = new Choreographer.FrameCallback() { // from class: com.swmansion.rnscreens.ScreenContainer$layoutCallback$1
            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                this.this$0.isLayoutEnqueued = false;
                ScreenContainer screenContainer = this.this$0;
                screenContainer.measure(View.MeasureSpec.makeMeasureSpec(screenContainer.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.this$0.getHeight(), 1073741824));
                ScreenContainer screenContainer2 = this.this$0;
                screenContainer2.layout(screenContainer2.getLeft(), this.this$0.getTop(), this.this$0.getRight(), this.this$0.getBottom());
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (view == getFocusedChild()) {
            Object systemService = getContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 2);
        }
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.isLayoutEnqueued || this.layoutCallback == null) {
            return;
        }
        this.isLayoutEnqueued = true;
        ReactChoreographer.Companion.IAuthTabCallback().onWarmupCompleted(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.layoutCallback);
    }

    public final boolean isNested() {
        return this.parentScreenWrapper != null;
    }

    public final void onChildUpdate() {
        performUpdatesNow();
    }

    protected ScreenFragmentWrapper adapt(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "");
        return new ScreenFragment(screen);
    }

    public final void addScreen(@NotNull Screen screen, int i) {
        Intrinsics.checkNotNullParameter(screen, "");
        ScreenFragmentWrapper screenFragmentWrapperAdapt = adapt(screen);
        screen.setFragmentWrapper(screenFragmentWrapperAdapt);
        this.screenWrappers.add(i, screenFragmentWrapperAdapt);
        screen.setContainer(this);
        onScreenChanged();
    }

    public void removeScreenAt(int i) {
        this.screenWrappers.get(i).getScreen().setContainer(null);
        this.screenWrappers.remove(i);
        onScreenChanged();
    }

    public void removeAllScreens() {
        Iterator<ScreenFragmentWrapper> it = this.screenWrappers.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            ScreenFragmentWrapper next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            next.getScreen().setContainer(null);
        }
        this.screenWrappers.clear();
        onScreenChanged();
    }

    public final int getScreenCount() {
        return this.screenWrappers.size();
    }

    public final Screen getScreenAt(int i) {
        return this.screenWrappers.get(i).getScreen();
    }

    public final ScreenFragmentWrapper getScreenFragmentWrapperAt(int i) {
        ScreenFragmentWrapper screenFragmentWrapper = this.screenWrappers.get(i);
        Intrinsics.checkNotNullExpressionValue(screenFragmentWrapper, "");
        return screenFragmentWrapper;
    }

    public Screen getTopScreen() {
        Object next;
        Iterator<T> it = this.screenWrappers.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (getActivityState((ScreenFragmentWrapper) next) == Screen.ActivityState.ON_TOP) {
                break;
            }
        }
        ScreenFragmentWrapper screenFragmentWrapper = (ScreenFragmentWrapper) next;
        if (screenFragmentWrapper != null) {
            return screenFragmentWrapper.getScreen();
        }
        return null;
    }

    private final void setFragmentManager(FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3) {
        this.fragmentManager = flowMeasureLazyPolicyExternalSyntheticLambda3;
        performUpdatesNow();
    }

    private final FlowMeasureLazyPolicyExternalSyntheticLambda3 findFragmentManagerForReactRootView(ReactRootView reactRootView) {
        boolean z;
        FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager;
        Context context = reactRootView.getContext();
        while (true) {
            z = context instanceof FragmentActivity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!z) {
            throw new IllegalStateException("In order to use RNScreens components your app's activity need to extend ReactActivity");
        }
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        if (fragmentActivity.getSupportFragmentManager().onActivityLayout().isEmpty()) {
            FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager2 = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNull(supportFragmentManager2);
            return supportFragmentManager2;
        }
        try {
            supportFragmentManager = FlowMeasureLazyPolicyExternalSyntheticLambda3.IAuthTabCallback(reactRootView).getChildFragmentManager();
        } catch (IllegalStateException unused) {
            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        }
        Intrinsics.checkNotNull(supportFragmentManager);
        return supportFragmentManager;
    }

    private final void setupFragmentManager() {
        boolean z;
        Unit unit;
        ViewParent parent = this;
        while (true) {
            z = parent instanceof ReactRootView;
            if (z || (parent instanceof FragmentProviding) || parent.getParent() == null) {
                break;
            }
            parent = parent.getParent();
            Intrinsics.checkNotNullExpressionValue(parent, "");
        }
        if (parent instanceof Screen) {
            ScreenFragmentWrapper fragmentWrapper = ((Screen) parent).getFragmentWrapper();
            if (fragmentWrapper != null) {
                this.parentScreenWrapper = fragmentWrapper;
                fragmentWrapper.addChildScreenContainer(this);
                FlowMeasureLazyPolicyExternalSyntheticLambda3 childFragmentManager = fragmentWrapper.getFragment().getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                setFragmentManager(childFragmentManager);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IllegalStateException("Parent Screen does not have its Fragment attached");
            }
            return;
        }
        if (!(parent instanceof FragmentProviding)) {
            if (!z) {
                throw new IllegalStateException("ScreenContainer is not attached under ReactRootView");
            }
            setFragmentManager(findFragmentManagerForReactRootView((ReactRootView) parent));
            return;
        }
        Fragment associatedFragment = ((FragmentProviding) parent).getAssociatedFragment();
        if (associatedFragment != null) {
            FlowMeasureLazyPolicyExternalSyntheticLambda3 childFragmentManager2 = associatedFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
            setFragmentManager(childFragmentManager2);
        } else {
            throw new IllegalStateException(("[RNScreens] Parent " + parent + " returned nullish fragment").toString());
        }
    }

    protected final FlowRowOverflowCompanionExternalSyntheticLambda4 createTransaction() {
        FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3 = this.fragmentManager;
        if (flowMeasureLazyPolicyExternalSyntheticLambda3 == null) {
            throw new IllegalArgumentException("fragment manager is null when creating transaction");
        }
        FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4IAuthTabCallback = flowMeasureLazyPolicyExternalSyntheticLambda3.onExtraCallbackWithResult().IAuthTabCallback(true);
        Intrinsics.checkNotNullExpressionValue(flowRowOverflowCompanionExternalSyntheticLambda4IAuthTabCallback, "");
        return flowRowOverflowCompanionExternalSyntheticLambda4IAuthTabCallback;
    }

    private final void attachScreen(FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4, Fragment fragment) {
        flowRowOverflowCompanionExternalSyntheticLambda4.IAuthTabCallback(getId(), fragment);
    }

    public final void attachBelowTop() {
        if (this.screenWrappers.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction = createTransaction();
        Screen topScreen = getTopScreen();
        Intrinsics.checkNotNull(topScreen, "");
        Fragment fragment = topScreen.getFragment();
        Intrinsics.checkNotNull(fragment, "");
        detachScreen(flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction, fragment);
        ArrayList<ScreenFragmentWrapper> arrayList = this.screenWrappers;
        attachScreen(flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction, arrayList.get(arrayList.size() - 2).getFragment());
        Fragment fragment2 = topScreen.getFragment();
        Intrinsics.checkNotNull(fragment2, "");
        attachScreen(flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction, fragment2);
        flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction.onExtraCallback();
    }

    public final void detachBelowTop() {
        if (this.screenWrappers.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction = createTransaction();
        ArrayList<ScreenFragmentWrapper> arrayList = this.screenWrappers;
        detachScreen(flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction, arrayList.get(arrayList.size() - 2).getFragment());
        flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction.onExtraCallback();
    }

    public final void notifyScreenDetached(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "");
        if (getContext() instanceof ReactContext) {
            int iOnWarmupCompleted = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onWarmupCompleted(getContext());
            ReactContext context = getContext();
            Intrinsics.checkNotNull(context, "");
            EventDispatcher eventDispatcherOnExtraCallbackWithResult = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallbackWithResult(context, screen.getId());
            if (eventDispatcherOnExtraCallbackWithResult != null) {
                eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(new ScreenDismissedEvent(iOnWarmupCompleted, screen.getId()));
            }
        }
    }

    public final void notifyTopDetached() {
        Screen topScreen = getTopScreen();
        Intrinsics.checkNotNull(topScreen, "");
        if (getContext() instanceof ReactContext) {
            int iOnWarmupCompleted = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onWarmupCompleted(getContext());
            ReactContext context = getContext();
            Intrinsics.checkNotNull(context, "");
            EventDispatcher eventDispatcherOnExtraCallbackWithResult = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallbackWithResult(context, topScreen.getId());
            if (eventDispatcherOnExtraCallbackWithResult != null) {
                eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(new ScreenDismissedEvent(iOnWarmupCompleted, topScreen.getId()));
            }
        }
    }

    private final void detachScreen(FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4, Fragment fragment) {
        flowRowOverflowCompanionExternalSyntheticLambda4.onNavigationEvent(fragment);
    }

    private final Screen.ActivityState getActivityState(ScreenFragmentWrapper screenFragmentWrapper) {
        return screenFragmentWrapper.getScreen().getActivityState();
    }

    public boolean hasScreen(@Nullable ScreenFragmentWrapper screenFragmentWrapper) {
        return CollectionsKt.contains(this.screenWrappers, screenFragmentWrapper);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttached = true;
        setupFragmentManager();
    }

    private final void removeMyFragments(FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3) {
        FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult = flowMeasureLazyPolicyExternalSyntheticLambda3.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult, "");
        boolean z = false;
        for (Fragment fragment : flowMeasureLazyPolicyExternalSyntheticLambda3.onActivityLayout()) {
            if ((fragment instanceof ScreenFragment) && ((ScreenFragment) fragment).getScreen().getContainer() == this) {
                flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onNavigationEvent(fragment);
                z = true;
            }
        }
        if (z) {
            flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallback();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3 = this.fragmentManager;
        if (flowMeasureLazyPolicyExternalSyntheticLambda3 != null && !flowMeasureLazyPolicyExternalSyntheticLambda3.mayLaunchUrl()) {
            removeMyFragments(flowMeasureLazyPolicyExternalSyntheticLambda3);
            flowMeasureLazyPolicyExternalSyntheticLambda3.ICustomTabsCallback();
        }
        ScreenFragmentWrapper screenFragmentWrapper = this.parentScreenWrapper;
        if (screenFragmentWrapper != null) {
            screenFragmentWrapper.removeChildScreenContainer(this);
        }
        this.parentScreenWrapper = null;
        super.onDetachedFromWindow();
        this.isAttached = false;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            removeViewAt(childCount);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(i, i2);
        }
    }

    private final void onScreenChanged() {
        this.needsUpdate = true;
        CredentialProviderGetSignInIntentControllerhandleResponse2 context = getContext();
        Intrinsics.checkNotNull(context, "");
        context.onExtraCallbackWithResult().runOnUiQueueThread(new ScreenContainer$.ExternalSyntheticLambda0(this));
    }

    protected final void performUpdatesNow() {
        this.needsUpdate = true;
        performUpdates();
    }

    public final void performUpdates() {
        FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3;
        if (this.needsUpdate && this.isAttached && (flowMeasureLazyPolicyExternalSyntheticLambda3 = this.fragmentManager) != null) {
            if (flowMeasureLazyPolicyExternalSyntheticLambda3 == null || !flowMeasureLazyPolicyExternalSyntheticLambda3.mayLaunchUrl()) {
                this.needsUpdate = false;
                onUpdate();
                notifyContainerUpdate();
            }
        }
    }

    public void onUpdate() {
        FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction = createTransaction();
        FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3 = this.fragmentManager;
        if (flowMeasureLazyPolicyExternalSyntheticLambda3 != null) {
            HashSet hashSet = new HashSet(flowMeasureLazyPolicyExternalSyntheticLambda3.onActivityLayout());
            Iterator<ScreenFragmentWrapper> it = this.screenWrappers.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                ScreenFragmentWrapper next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                ScreenFragmentWrapper screenFragmentWrapper = next;
                if (getActivityState(screenFragmentWrapper) == Screen.ActivityState.INACTIVE && screenFragmentWrapper.getFragment().isAdded()) {
                    detachScreen(flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction, screenFragmentWrapper.getFragment());
                }
                hashSet.remove(screenFragmentWrapper.getFragment());
            }
            boolean z = false;
            if (!hashSet.isEmpty()) {
                for (Fragment fragment : (Fragment[]) hashSet.toArray(new Fragment[0])) {
                    if ((fragment instanceof ScreenFragment) && ((ScreenFragment) fragment).getScreen().getContainer() == null) {
                        detachScreen(flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction, fragment);
                    }
                }
            }
            boolean z2 = getTopScreen() == null;
            ArrayList arrayList = new ArrayList();
            Iterator<ScreenFragmentWrapper> it2 = this.screenWrappers.iterator();
            Intrinsics.checkNotNullExpressionValue(it2, "");
            while (it2.hasNext()) {
                ScreenFragmentWrapper next2 = it2.next();
                Intrinsics.checkNotNullExpressionValue(next2, "");
                ScreenFragmentWrapper screenFragmentWrapper2 = next2;
                screenFragmentWrapper2.getScreen().setTransitioning(z2);
                if (getActivityState(screenFragmentWrapper2) != Screen.ActivityState.INACTIVE) {
                    if (screenFragmentWrapper2.getFragment().isAdded()) {
                        if (z) {
                            detachScreen(flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction, screenFragmentWrapper2.getFragment());
                            arrayList.add(screenFragmentWrapper2);
                        }
                    } else if (z) {
                        arrayList.add(screenFragmentWrapper2);
                    } else {
                        attachScreen(flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction, screenFragmentWrapper2.getFragment());
                        z = true;
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it3, "");
            while (it3.hasNext()) {
                Object next3 = it3.next();
                Intrinsics.checkNotNullExpressionValue(next3, "");
                attachScreen(flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction, ((ScreenFragmentWrapper) next3).getFragment());
            }
            flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction.onExtraCallback();
            return;
        }
        throw new IllegalArgumentException("fragment manager is null when performing update in ScreenContainer");
    }

    protected void notifyContainerUpdate() {
        ScreenFragmentWrapper fragmentWrapper;
        Screen topScreen = getTopScreen();
        if (topScreen == null || (fragmentWrapper = topScreen.getFragmentWrapper()) == null) {
            return;
        }
        fragmentWrapper.onContainerUpdate();
    }
}
