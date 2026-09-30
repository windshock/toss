package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.ScreenFragment$;
import com.swmansion.rnscreens.events.HeaderBackButtonClickedEvent;
import com.swmansion.rnscreens.events.ScreenAppearEvent;
import com.swmansion.rnscreens.events.ScreenDisappearEvent;
import com.swmansion.rnscreens.events.ScreenDismissedEvent;
import com.swmansion.rnscreens.events.ScreenTransitionProgressEvent;
import com.swmansion.rnscreens.events.ScreenWillAppearEvent;
import com.swmansion.rnscreens.events.ScreenWillDisappearEvent;
import com.swmansion.rnscreens.ext.ViewExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class ScreenFragment extends Fragment implements ScreenFragmentWrapper {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "ScreenFragment";
    private boolean canDispatchAppear;
    private boolean canDispatchWillAppear;
    private final List<ScreenContainer> childScreenContainers;
    private boolean isTransitioning;
    public Screen screen;
    private boolean shouldUpdateOnResume;
    private float transitionProgress;

    public static /* synthetic */ void getScreen$annotations() {
    }

    @Override // com.swmansion.rnscreens.FragmentHolder
    public Fragment getFragment() {
        return this;
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public boolean isTranslucent() {
        return false;
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public Screen getScreen() {
        Screen screen = this.screen;
        if (screen != null) {
            return screen;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public void setScreen(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "");
        this.screen = screen;
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public List<ScreenContainer> getChildScreenContainers() {
        return this.childScreenContainers;
    }

    public ScreenFragment() {
        this.childScreenContainers = new ArrayList();
        this.transitionProgress = -1.0f;
        this.canDispatchWillAppear = true;
        this.canDispatchAppear = true;
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    public ScreenFragment(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "");
        this.childScreenContainers = new ArrayList();
        this.transitionProgress = -1.0f;
        this.canDispatchWillAppear = true;
        this.canDispatchAppear = true;
        setScreen(screen);
    }

    public void onResume() {
        super.onResume();
        if (this.shouldUpdateOnResume) {
            this.shouldUpdateOnResume = false;
            ScreenWindowTraits.INSTANCE.trySetWindowTraits$react_native_screens_release(getScreen(), tryGetActivity(), tryGetContext());
        }
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        getScreen().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = getContext();
        if (context == null) {
            return null;
        }
        ScreensFrameLayout screensFrameLayout = new ScreensFrameLayout(context);
        screensFrameLayout.addView(ViewExtKt.recycle(getScreen()));
        return screensFrameLayout;
    }

    static final class ScreensFrameLayout extends FrameLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScreensFrameLayout(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "");
        }

        @Override // android.view.ViewGroup, android.view.View
        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public void onContainerUpdate() {
        updateWindowTraits();
    }

    private final void updateWindowTraits() {
        Activity activity = getActivity();
        if (activity == null) {
            this.shouldUpdateOnResume = true;
        } else {
            ScreenWindowTraits.INSTANCE.trySetWindowTraits$react_native_screens_release(getScreen(), activity, tryGetContext());
        }
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public Activity tryGetActivity() {
        Fragment fragment;
        FragmentActivity activity;
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            return activity2;
        }
        ReactContext context = getScreen().getContext();
        if (context instanceof ReactContext) {
            ReactContext reactContext = context;
            if (reactContext.getCurrentActivity() != null) {
                return reactContext.getCurrentActivity();
            }
        }
        for (ViewParent container = getScreen().getContainer(); container != null; container = container.getParent()) {
            if ((container instanceof Screen) && (fragment = ((Screen) container).getFragment()) != null && (activity = fragment.getActivity()) != null) {
                return activity;
            }
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public ReactContext tryGetContext() {
        if (getContext() instanceof ReactContext) {
            ReactContext context = getContext();
            Intrinsics.checkNotNull(context, "");
            return context;
        }
        if (getScreen().getContext() instanceof ReactContext) {
            ReactContext context2 = getScreen().getContext();
            Intrinsics.checkNotNull(context2, "");
            return context2;
        }
        for (ViewParent container = getScreen().getContainer(); container != null; container = container.getParent()) {
            if (container instanceof Screen) {
                Screen screen = (Screen) container;
                if (screen.getContext() instanceof ReactContext) {
                    ReactContext context3 = screen.getContext();
                    Intrinsics.checkNotNull(context3, "");
                    return context3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public boolean canDispatchLifecycleEvent(@NotNull ScreenLifecycleEvent screenLifecycleEvent) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(screenLifecycleEvent, "");
        int i = WhenMappings.$EnumSwitchMapping$0[screenLifecycleEvent.ordinal()];
        if (i == 1) {
            return this.canDispatchWillAppear;
        }
        if (i == 2) {
            return this.canDispatchAppear;
        }
        if (i == 3) {
            return !this.canDispatchWillAppear;
        }
        if (i == 4) {
            return !this.canDispatchAppear;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public void updateLastEventDispatched(@NotNull ScreenLifecycleEvent screenLifecycleEvent) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(screenLifecycleEvent, "");
        int i = WhenMappings.$EnumSwitchMapping$0[screenLifecycleEvent.ordinal()];
        if (i == 1) {
            this.canDispatchWillAppear = false;
            return;
        }
        if (i == 2) {
            this.canDispatchAppear = false;
        } else if (i == 3) {
            this.canDispatchWillAppear = true;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            this.canDispatchAppear = true;
        }
    }

    private final void dispatchOnWillAppear() throws NoWhenBranchMatchedException {
        dispatchLifecycleEvent(ScreenLifecycleEvent.WILL_APPEAR, this);
        dispatchTransitionProgressEvent(0.0f, false);
    }

    private final void dispatchOnAppear() throws NoWhenBranchMatchedException {
        dispatchLifecycleEvent(ScreenLifecycleEvent.DID_APPEAR, this);
        dispatchTransitionProgressEvent(1.0f, false);
    }

    private final void dispatchOnWillDisappear() throws NoWhenBranchMatchedException {
        dispatchLifecycleEvent(ScreenLifecycleEvent.WILL_DISAPPEAR, this);
        dispatchTransitionProgressEvent(0.0f, true);
    }

    private final void dispatchOnDisappear() throws NoWhenBranchMatchedException {
        dispatchLifecycleEvent(ScreenLifecycleEvent.DID_DISAPPEAR, this);
        dispatchTransitionProgressEvent(1.0f, true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public void dispatchLifecycleEvent(@NotNull ScreenLifecycleEvent screenLifecycleEvent, @NotNull ScreenFragmentWrapper screenFragmentWrapper) throws NoWhenBranchMatchedException {
        Event screenWillAppearEvent;
        Intrinsics.checkNotNullParameter(screenLifecycleEvent, "");
        Intrinsics.checkNotNullParameter(screenFragmentWrapper, "");
        Fragment fragment = screenFragmentWrapper.getFragment();
        if (fragment instanceof ScreenStackFragment) {
            ScreenStackFragment screenStackFragment = (ScreenStackFragment) fragment;
            if (screenStackFragment.canDispatchLifecycleEvent(screenLifecycleEvent)) {
                Screen screen = screenStackFragment.getScreen();
                screenFragmentWrapper.updateLastEventDispatched(screenLifecycleEvent);
                int iOnExtraCallback = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallback(screen);
                int i = WhenMappings.$EnumSwitchMapping$0[screenLifecycleEvent.ordinal()];
                if (i == 1) {
                    screenWillAppearEvent = new ScreenWillAppearEvent(iOnExtraCallback, screen.getId());
                } else if (i == 2) {
                    screenWillAppearEvent = new ScreenAppearEvent(iOnExtraCallback, screen.getId());
                } else if (i == 3) {
                    screenWillAppearEvent = new ScreenWillDisappearEvent(iOnExtraCallback, screen.getId());
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    screenWillAppearEvent = new ScreenDisappearEvent(iOnExtraCallback, screen.getId());
                }
                ReactContext context = getScreen().getContext();
                Intrinsics.checkNotNull(context, "");
                EventDispatcher eventDispatcherOnExtraCallbackWithResult = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallbackWithResult(context, getScreen().getId());
                if (eventDispatcherOnExtraCallbackWithResult != null) {
                    eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(screenWillAppearEvent);
                }
                screenFragmentWrapper.dispatchLifecycleEventInChildContainers(screenLifecycleEvent);
            }
        }
    }

    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public void dispatchLifecycleEventInChildContainers(@NotNull ScreenLifecycleEvent screenLifecycleEvent) throws NoWhenBranchMatchedException {
        ScreenFragmentWrapper fragmentWrapper;
        Intrinsics.checkNotNullParameter(screenLifecycleEvent, "");
        List<ScreenContainer> childScreenContainers = getChildScreenContainers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : childScreenContainers) {
            if (((ScreenContainer) obj).getScreenCount() > 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Screen topScreen = ((ScreenContainer) it.next()).getTopScreen();
            if (topScreen != null && (fragmentWrapper = topScreen.getFragmentWrapper()) != null) {
                dispatchLifecycleEvent(screenLifecycleEvent, fragmentWrapper);
            }
        }
    }

    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public void dispatchHeaderBackButtonClickedEvent() {
        ReactContext context = getScreen().getContext();
        Intrinsics.checkNotNull(context, "");
        ReactContext reactContext = context;
        int iOnWarmupCompleted = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onWarmupCompleted(reactContext);
        EventDispatcher eventDispatcherOnExtraCallbackWithResult = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallbackWithResult(reactContext, getScreen().getId());
        if (eventDispatcherOnExtraCallbackWithResult != null) {
            eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(new HeaderBackButtonClickedEvent(iOnWarmupCompleted, getScreen().getId()));
        }
    }

    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public void dispatchTransitionProgressEvent(float f, boolean z) {
        if (!(this instanceof ScreenStackFragment) || this.transitionProgress == f) {
            return;
        }
        float fMax = Math.max(0.0f, Math.min(1.0f, f));
        this.transitionProgress = fMax;
        short coalescingKey = Companion.getCoalescingKey(fMax);
        ScreenStackFragment screenStackFragment = (ScreenStackFragment) this;
        ScreenContainer container = screenStackFragment.getScreen().getContainer();
        boolean goingForward = container instanceof ScreenStack ? ((ScreenStack) container).getGoingForward() : false;
        ReactContext context = screenStackFragment.getScreen().getContext();
        Intrinsics.checkNotNull(context, "");
        ReactContext reactContext = context;
        EventDispatcher eventDispatcherOnExtraCallbackWithResult = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallbackWithResult(reactContext, screenStackFragment.getScreen().getId());
        if (eventDispatcherOnExtraCallbackWithResult != null) {
            eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(new ScreenTransitionProgressEvent(r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onWarmupCompleted(reactContext), screenStackFragment.getScreen().getId(), this.transitionProgress, z, goingForward, coalescingKey));
        }
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public void addChildScreenContainer(@NotNull ScreenContainer screenContainer) {
        Intrinsics.checkNotNullParameter(screenContainer, "");
        getChildScreenContainers().add(screenContainer);
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public void removeChildScreenContainer(@NotNull ScreenContainer screenContainer) {
        Intrinsics.checkNotNullParameter(screenContainer, "");
        getChildScreenContainers().remove(screenContainer);
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public void onViewAnimationStart() throws NoWhenBranchMatchedException {
        dispatchViewAnimationEvent(false);
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public void onViewAnimationEnd() throws NoWhenBranchMatchedException {
        dispatchViewAnimationEvent(true);
    }

    private final void dispatchViewAnimationEvent(boolean z) throws NoWhenBranchMatchedException {
        this.isTransitioning = !z;
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || ((parentFragment instanceof ScreenFragment) && !((ScreenFragment) parentFragment).isTransitioning)) {
            if (isResumed()) {
                UiThreadUtil.runOnUiThread(new ScreenFragment$.ExternalSyntheticLambda0(z, this));
            } else if (z) {
                dispatchOnDisappear();
            } else {
                dispatchOnWillDisappear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchViewAnimationEvent$lambda$0(boolean z, ScreenFragment screenFragment) throws NoWhenBranchMatchedException {
        if (z) {
            screenFragment.dispatchOnAppear();
        } else {
            screenFragment.dispatchOnWillAppear();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ScreenContainer container = getScreen().getContainer();
        if (container == null || !container.hasScreen(getScreen().getFragmentWrapper())) {
            ReactContext context = getScreen().getContext();
            if (context instanceof ReactContext) {
                int iOnWarmupCompleted = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onWarmupCompleted(context);
                EventDispatcher eventDispatcherOnExtraCallbackWithResult = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallbackWithResult(context, getScreen().getId());
                if (eventDispatcherOnExtraCallbackWithResult != null) {
                    eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(new ScreenDismissedEvent(iOnWarmupCompleted, getScreen().getId()));
                }
            }
        }
        getChildScreenContainers().clear();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final short getCoalescingKey(float f) {
            return (short) (f == 0.0f ? 1 : f == 1.0f ? 2 : 3);
        }

        private Companion() {
        }
    }
}
