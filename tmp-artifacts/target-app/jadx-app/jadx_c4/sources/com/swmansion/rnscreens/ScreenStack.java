package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenStack$;
import com.swmansion.rnscreens.bottomsheet.SheetUtilsKt;
import com.swmansion.rnscreens.events.StackFinishTransitioningEvent;
import com.swmansion.rnscreens.stack.views.ChildrenDrawingOrderStrategy;
import com.swmansion.rnscreens.stack.views.ReverseFromIndex;
import com.swmansion.rnscreens.stack.views.ReverseOrder;
import com.swmansion.rnscreens.stack.views.ScreensCoordinatorLayout;
import com.swmansion.rnscreens.utils.FragmentTransactionKtKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import o.FlowRowOverflowCompanionExternalSyntheticLambda4;
import o.clearRevision;
import o.r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ScreenStack extends ScreenContainer {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "ScreenStack";
    private ChildrenDrawingOrderStrategy childrenDrawingOrderStrategy;
    private List<View> disappearingTransitioningChildren;
    private final Set<ScreenStackFragmentWrapper> dismissedWrappers;
    private final List<DrawingOp> drawingOpPool;
    private List<DrawingOp> drawingOps;
    private boolean goingForward;
    private List<? extends ScreenFragmentWrapper> preloadedWrappers;
    private boolean removalTransitionStarted;
    private final ArrayList<ScreenStackFragmentWrapper> stack;
    private ScreenStackFragmentWrapper topScreenWrapper;

    public ScreenStack(@Nullable Context context) {
        super(context);
        this.stack = new ArrayList<>();
        this.dismissedWrappers = new HashSet();
        this.preloadedWrappers = new ArrayList();
        this.drawingOpPool = new ArrayList();
        this.drawingOps = new ArrayList();
        this.disappearingTransitioningChildren = new ArrayList();
    }

    public final boolean getGoingForward() {
        return this.goingForward;
    }

    public final void setGoingForward(boolean z) {
        this.goingForward = z;
    }

    public final void dismiss(@NotNull ScreenStackFragmentWrapper screenStackFragmentWrapper) {
        Intrinsics.checkNotNullParameter(screenStackFragmentWrapper, "");
        this.dismissedWrappers.add(screenStackFragmentWrapper);
        performUpdatesNow();
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public Screen getTopScreen() {
        ScreenStackFragmentWrapper screenStackFragmentWrapper = this.topScreenWrapper;
        if (screenStackFragmentWrapper != null) {
            return screenStackFragmentWrapper.getScreen();
        }
        return null;
    }

    public final ArrayList<ScreenStackFragmentWrapper> getFragments() {
        return this.stack;
    }

    public final Screen getRootScreen() {
        Object next;
        Screen screen;
        Iterator<T> it = this.screenWrappers.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!CollectionsKt.contains(this.dismissedWrappers, (ScreenFragmentWrapper) next)) {
                break;
            }
        }
        ScreenFragmentWrapper screenFragmentWrapper = (ScreenFragmentWrapper) next;
        if (screenFragmentWrapper == null || (screen = screenFragmentWrapper.getScreen()) == null) {
            throw new IllegalStateException("[RNScreens] Stack has no root screen set");
        }
        return screen;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.rnscreens.ScreenContainer
    public ScreenStackFragmentWrapper adapt(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "");
        if (WhenMappings.$EnumSwitchMapping$0[screen.getStackPresentation().ordinal()] == 1) {
            return new ScreenStackFragment(screen);
        }
        return new ScreenStackFragment(screen);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void startViewTransition(@NotNull View view) {
        ChildrenDrawingOrderStrategy childrenDrawingOrderStrategy;
        Intrinsics.checkNotNullParameter(view, "");
        if (!(view instanceof ScreensCoordinatorLayout)) {
            throw new IllegalStateException(("[RNScreens] Unexpected type of ScreenStack direct subview " + view.getClass()).toString());
        }
        super.startViewTransition(view);
        if (((ScreensCoordinatorLayout) view).getFragment$react_native_screens_release().isRemoving()) {
            this.disappearingTransitioningChildren.add(view);
        }
        if (!this.disappearingTransitioningChildren.isEmpty() && (childrenDrawingOrderStrategy = this.childrenDrawingOrderStrategy) != null) {
            childrenDrawingOrderStrategy.enable();
        }
        this.removalTransitionStarted = true;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(@NotNull View view) {
        ChildrenDrawingOrderStrategy childrenDrawingOrderStrategy;
        Intrinsics.checkNotNullParameter(view, "");
        super.endViewTransition(view);
        this.disappearingTransitioningChildren.remove(view);
        if (this.disappearingTransitioningChildren.isEmpty() && (childrenDrawingOrderStrategy = this.childrenDrawingOrderStrategy) != null) {
            childrenDrawingOrderStrategy.disable();
        }
        if (this.removalTransitionStarted) {
            this.removalTransitionStarted = false;
            dispatchOnFinishTransitioning();
        }
    }

    public final void onViewAppearTransitionEnd() {
        if (this.removalTransitionStarted) {
            return;
        }
        dispatchOnFinishTransitioning();
    }

    public final List<String> getScreenIds() {
        ArrayList<ScreenFragmentWrapper> arrayList = this.screenWrappers;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ScreenFragmentWrapper) it.next()).getScreen().getScreenId());
        }
        return arrayList2;
    }

    private final void dispatchOnFinishTransitioning() {
        int iOnExtraCallback = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallback(this);
        ReactContext context = getContext();
        Intrinsics.checkNotNull(context, "");
        EventDispatcher eventDispatcherOnExtraCallbackWithResult = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallbackWithResult(context, getId());
        if (eventDispatcherOnExtraCallbackWithResult != null) {
            eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(new StackFinishTransitioningEvent(iOnExtraCallback, getId()));
        }
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public void removeScreenAt(int i) {
        Set<ScreenStackFragmentWrapper> set = this.dismissedWrappers;
        TypeIntrinsics.asMutableCollection(set).remove(getScreenFragmentWrapperAt(i));
        super.removeScreenAt(i);
    }

    public final boolean popToRoot() {
        int iNextIndex;
        Iterator<ScreenFragmentWrapper> it = this.screenWrappers.iterator();
        int i = 0;
        while (true) {
            iNextIndex = -1;
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().getScreen().getActivityState() != Screen.ActivityState.INACTIVE) {
                break;
            }
            i++;
        }
        ArrayList<ScreenFragmentWrapper> arrayList = this.screenWrappers;
        ListIterator<ScreenFragmentWrapper> listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            if (listIterator.previous().getScreen().getActivityState() != Screen.ActivityState.INACTIVE) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (i < 0 || iNextIndex <= i) {
            return false;
        }
        int i2 = i + 1;
        if (i2 <= iNextIndex) {
            while (true) {
                notifyScreenDetached(this.screenWrappers.get(i2).getScreen());
                if (i2 == iNextIndex) {
                    break;
                }
                i2++;
            }
        }
        return true;
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public void removeAllScreens() {
        this.dismissedWrappers.clear();
        super.removeAllScreens();
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public boolean hasScreen(@Nullable ScreenFragmentWrapper screenFragmentWrapper) {
        return super.hasScreen(screenFragmentWrapper) && !CollectionsKt.contains(this.dismissedWrappers, screenFragmentWrapper);
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public void onUpdate() {
        Screen.StackAnimation stackAnimation;
        boolean z;
        Screen screen;
        ScreenStackFragmentWrapper screenStackFragmentWrapper;
        int iOnWarmupCompleted;
        Object obj;
        Screen screen2;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        this.childrenDrawingOrderStrategy = null;
        Sequence sequenceOnWarmupCompleted = clearRevision.onWarmupCompleted(CollectionsKt.asSequence(CollectionsKt.asReversedMutable(this.screenWrappers)), new ScreenStack$.ExternalSyntheticLambda0(this));
        objectRef.element = clearRevision.asBinder(sequenceOnWarmupCompleted);
        ScreenFragmentWrapper screenFragmentWrapper = (ScreenFragmentWrapper) clearRevision.asBinder(clearRevision.onExtraCallback(sequenceOnWarmupCompleted, new ScreenStack$.ExternalSyntheticLambda1()));
        if (screenFragmentWrapper == null || screenFragmentWrapper == objectRef.element) {
            screenFragmentWrapper = null;
        }
        objectRef2.element = screenFragmentWrapper;
        boolean z2 = CollectionsKt.contains(this.stack, objectRef.element) && !CollectionsKt.contains(this.preloadedWrappers, objectRef.element);
        Object obj2 = objectRef.element;
        ScreenStackFragmentWrapper screenStackFragmentWrapper2 = this.topScreenWrapper;
        boolean z3 = obj2 != screenStackFragmentWrapper2;
        if (obj2 == null || z2) {
            if (obj2 == null || screenStackFragmentWrapper2 == null || !z3) {
                stackAnimation = null;
                z = true;
            } else {
                stackAnimation = (screenStackFragmentWrapper2 == null || (screen = screenStackFragmentWrapper2.getScreen()) == null) ? null : screen.getStackAnimation();
                z = false;
            }
        } else if (screenStackFragmentWrapper2 != null) {
            z = (screenStackFragmentWrapper2 != null && this.screenWrappers.contains(screenStackFragmentWrapper2)) || (((ScreenFragmentWrapper) objectRef.element).getScreen().getReplaceAnimation() == Screen.ReplaceAnimation.PUSH);
            if (z) {
                screen2 = ((ScreenFragmentWrapper) objectRef.element).getScreen();
            } else {
                ScreenStackFragmentWrapper screenStackFragmentWrapper3 = this.topScreenWrapper;
                if (screenStackFragmentWrapper3 == null || (screen2 = screenStackFragmentWrapper3.getScreen()) == null) {
                    stackAnimation = null;
                }
            }
            stackAnimation = screen2.getStackAnimation();
        } else {
            Screen.StackAnimation stackAnimation2 = Screen.StackAnimation.NONE;
            this.goingForward = true;
            stackAnimation = stackAnimation2;
            z = true;
        }
        this.goingForward = z;
        if (z && (obj = objectRef.element) != null && Companion.needsDrawReordering((ScreenFragmentWrapper) obj, stackAnimation) && objectRef2.element == null) {
            this.childrenDrawingOrderStrategy = new ReverseOrder();
        } else if (objectRef.element != null && z2 && (screenStackFragmentWrapper = this.topScreenWrapper) != null && screenStackFragmentWrapper.isTranslucent() && !((ScreenFragmentWrapper) objectRef.element).isTranslucent() && (iOnWarmupCompleted = clearRevision.onWarmupCompleted(clearRevision.onTransact(CollectionsKt.asSequence(CollectionsKt.asReversedMutable(this.stack)), new ScreenStack$.ExternalSyntheticLambda2(objectRef)))) > 1) {
            this.childrenDrawingOrderStrategy = new ReverseFromIndex(Math.max((CollectionsKt.getLastIndex(this.stack) - iOnWarmupCompleted) + 1, 0));
        }
        FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction = createTransaction();
        if (stackAnimation != null) {
            FragmentTransactionKtKt.setTweenAnimations(flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction, stackAnimation, z);
        }
        Iterator itIAuthTabCallback = clearRevision.onWarmupCompleted(CollectionsKt.asSequence(this.stack), new ScreenStack$.ExternalSyntheticLambda3(this)).IAuthTabCallback();
        while (itIAuthTabCallback.hasNext()) {
            flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction.onNavigationEvent(((ScreenStackFragmentWrapper) itIAuthTabCallback.next()).getFragment());
        }
        Iterator itIAuthTabCallback2 = clearRevision.onWarmupCompleted(clearRevision.onTransact(CollectionsKt.asSequence(this.screenWrappers), new ScreenStack$.ExternalSyntheticLambda4(objectRef2)), new ScreenStack$.ExternalSyntheticLambda5(objectRef, this)).IAuthTabCallback();
        while (itIAuthTabCallback2.hasNext()) {
            flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction.onNavigationEvent(((ScreenFragmentWrapper) itIAuthTabCallback2.next()).getFragment());
        }
        Object obj3 = objectRef2.element;
        if (obj3 != null && !((ScreenFragmentWrapper) obj3).getFragment().isAdded()) {
            ScreenFragmentWrapper screenFragmentWrapper2 = (ScreenFragmentWrapper) objectRef.element;
            Iterator itIAuthTabCallback3 = clearRevision.onExtraCallback(CollectionsKt.asSequence(this.screenWrappers), new ScreenStack$.ExternalSyntheticLambda6(objectRef2)).IAuthTabCallback();
            while (itIAuthTabCallback3.hasNext()) {
                flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction.IAuthTabCallback(getId(), ((ScreenFragmentWrapper) itIAuthTabCallback3.next()).getFragment()).onExtraCallback(new ScreenStack$.ExternalSyntheticLambda7(screenFragmentWrapper2));
            }
        } else {
            Object obj4 = objectRef.element;
            if (obj4 != null && !((ScreenFragmentWrapper) obj4).getFragment().isAdded()) {
                if (SheetUtilsKt.requiresEnterTransitionPostponing(((ScreenFragmentWrapper) objectRef.element).getScreen())) {
                    ((ScreenFragmentWrapper) objectRef.element).getFragment().postponeEnterTransition();
                }
                flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction.IAuthTabCallback(getId(), ((ScreenFragmentWrapper) objectRef.element).getFragment());
            }
        }
        Object obj5 = objectRef.element;
        this.topScreenWrapper = obj5 instanceof ScreenStackFragmentWrapper ? (ScreenStackFragmentWrapper) obj5 : null;
        this.stack.clear();
        CollectionsKt.addAll(this.stack, clearRevision.asBinder(CollectionsKt.asSequence(this.screenWrappers), new ScreenStack$.ExternalSyntheticLambda8()));
        this.preloadedWrappers = clearRevision.access000(clearRevision.onWarmupCompleted(CollectionsKt.asSequence(this.screenWrappers), new ScreenStack$.ExternalSyntheticLambda9()));
        turnOffA11yUnderTransparentScreen((ScreenFragmentWrapper) objectRef2.element);
        flowRowOverflowCompanionExternalSyntheticLambda4CreateTransaction.onExtraCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$0(ScreenStack screenStack, ScreenFragmentWrapper screenFragmentWrapper) {
        Intrinsics.checkNotNullParameter(screenFragmentWrapper, "");
        return (CollectionsKt.contains(screenStack.dismissedWrappers, screenFragmentWrapper) || screenFragmentWrapper.getScreen().getActivityState() == Screen.ActivityState.INACTIVE) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$1(ScreenFragmentWrapper screenFragmentWrapper) {
        Intrinsics.checkNotNullParameter(screenFragmentWrapper, "");
        return screenFragmentWrapper.isTranslucent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$4(Ref.ObjectRef objectRef, ScreenStackFragmentWrapper screenStackFragmentWrapper) {
        Intrinsics.checkNotNullParameter(screenStackFragmentWrapper, "");
        return screenStackFragmentWrapper != objectRef.element && screenStackFragmentWrapper.isTranslucent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$5$0(ScreenStack screenStack, ScreenStackFragmentWrapper screenStackFragmentWrapper) {
        Intrinsics.checkNotNullParameter(screenStackFragmentWrapper, "");
        return !screenStack.screenWrappers.contains(screenStackFragmentWrapper) || screenStack.dismissedWrappers.contains(screenStackFragmentWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$5$2(Ref.ObjectRef objectRef, ScreenFragmentWrapper screenFragmentWrapper) {
        Intrinsics.checkNotNullParameter(screenFragmentWrapper, "");
        return screenFragmentWrapper != objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$5$3(Ref.ObjectRef objectRef, ScreenStack screenStack, ScreenFragmentWrapper screenFragmentWrapper) {
        Intrinsics.checkNotNullParameter(screenFragmentWrapper, "");
        return !(screenFragmentWrapper == objectRef.element || CollectionsKt.contains(screenStack.dismissedWrappers, screenFragmentWrapper)) || screenFragmentWrapper.getScreen().getActivityState() == Screen.ActivityState.INACTIVE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$5$5(Ref.ObjectRef objectRef, ScreenFragmentWrapper screenFragmentWrapper) {
        Intrinsics.checkNotNullParameter(screenFragmentWrapper, "");
        return screenFragmentWrapper != objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUpdate$lambda$5$6$0(ScreenFragmentWrapper screenFragmentWrapper) {
        Screen screen;
        if (screenFragmentWrapper == null || (screen = screenFragmentWrapper.getScreen()) == null) {
            return;
        }
        screen.bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScreenStackFragmentWrapper onUpdate$lambda$5$7(ScreenFragmentWrapper screenFragmentWrapper) {
        Intrinsics.checkNotNullParameter(screenFragmentWrapper, "");
        return (ScreenStackFragmentWrapper) screenFragmentWrapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$5$8(ScreenFragmentWrapper screenFragmentWrapper) {
        Intrinsics.checkNotNullParameter(screenFragmentWrapper, "");
        return screenFragmentWrapper.getScreen().getActivityState() == Screen.ActivityState.INACTIVE;
    }

    private final void turnOffA11yUnderTransparentScreen(ScreenFragmentWrapper screenFragmentWrapper) {
        ScreenStackFragmentWrapper screenStackFragmentWrapper;
        if (this.screenWrappers.size() > 1 && screenFragmentWrapper != null && (screenStackFragmentWrapper = this.topScreenWrapper) != null && screenStackFragmentWrapper.isTranslucent()) {
            ArrayList<ScreenFragmentWrapper> arrayList = this.screenWrappers;
            for (ScreenFragmentWrapper screenFragmentWrapper2 : CollectionsKt.asReversed(CollectionsKt.slice(arrayList, RangesKt.until(0, arrayList.size() - 1)))) {
                screenFragmentWrapper2.getScreen().changeAccessibilityMode(4);
                if (Intrinsics.areEqual(screenFragmentWrapper2, screenFragmentWrapper)) {
                    break;
                }
            }
        }
        Screen topScreen = getTopScreen();
        if (topScreen != null) {
            topScreen.changeAccessibilityMode(0);
        }
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    protected void notifyContainerUpdate() {
        Iterator<T> it = this.stack.iterator();
        while (it.hasNext()) {
            ((ScreenStackFragmentWrapper) it.next()).onContainerUpdate();
        }
    }

    private final void drawAndRelease() {
        List<DrawingOp> list = this.drawingOps;
        this.drawingOps = new ArrayList();
        for (DrawingOp drawingOp : list) {
            drawingOp.draw();
            this.drawingOpPool.add(drawingOp);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.dispatchDraw(canvas);
        ChildrenDrawingOrderStrategy childrenDrawingOrderStrategy = this.childrenDrawingOrderStrategy;
        if (childrenDrawingOrderStrategy != null) {
            childrenDrawingOrderStrategy.apply(this.drawingOps);
        }
        drawAndRelease();
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(@NotNull Canvas canvas, @NotNull View view, long j) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(view, "");
        List<DrawingOp> list = this.drawingOps;
        DrawingOp drawingOpObtainDrawingOp = obtainDrawingOp();
        drawingOpObtainDrawingOp.setCanvas(canvas);
        drawingOpObtainDrawingOp.setChild(view);
        drawingOpObtainDrawingOp.setDrawingTime(j);
        list.add(drawingOpObtainDrawingOp);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performDraw(DrawingOp drawingOp) {
        Canvas canvas = drawingOp.getCanvas();
        Intrinsics.checkNotNull(canvas);
        super.drawChild(canvas, drawingOp.getChild(), drawingOp.getDrawingTime());
    }

    private final DrawingOp obtainDrawingOp() {
        if (this.drawingOpPool.isEmpty()) {
            return new DrawingOp();
        }
        List<DrawingOp> list = this.drawingOpPool;
        return list.remove(CollectionsKt.getLastIndex(list));
    }

    public final class DrawingOp {
        private Canvas canvas;
        private View child;
        private long drawingTime;

        public DrawingOp() {
        }

        public final Canvas getCanvas() {
            return this.canvas;
        }

        public final void setCanvas(@Nullable Canvas canvas) {
            this.canvas = canvas;
        }

        public final View getChild() {
            return this.child;
        }

        public final void setChild(@Nullable View view) {
            this.child = view;
        }

        public final long getDrawingTime() {
            return this.drawingTime;
        }

        public final void setDrawingTime(long j) {
            this.drawingTime = j;
        }

        public final void draw() {
            ScreenStack.this.performDraw(this);
            this.canvas = null;
            this.child = null;
            this.drawingTime = 0L;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean needsDrawReordering(ScreenFragmentWrapper screenFragmentWrapper, Screen.StackAnimation stackAnimation) {
            if (stackAnimation == null) {
                stackAnimation = screenFragmentWrapper.getScreen().getStackAnimation();
            }
            return (Build.VERSION.SDK_INT >= 33 || stackAnimation == Screen.StackAnimation.SLIDE_FROM_BOTTOM || stackAnimation == Screen.StackAnimation.FADE_FROM_BOTTOM || stackAnimation == Screen.StackAnimation.IOS_FROM_RIGHT || stackAnimation == Screen.StackAnimation.IOS_FROM_LEFT) && stackAnimation != Screen.StackAnimation.NONE;
        }
    }
}
