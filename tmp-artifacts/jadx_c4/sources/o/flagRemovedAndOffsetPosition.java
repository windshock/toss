package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootHelper;
import com.swmansion.gesturehandler.react.RNViewConfigurationHelper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.addChangePayload;
import o.flagRemovedAndOffsetPosition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class flagRemovedAndOffsetPosition extends addChangePayload {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final RNViewConfigurationHelper onWarmupCompleted = new RNViewConfigurationHelper();
    private Handler onExtraCallbackWithResult;
    private Runnable onNavigationEvent = new Runnable() { // from class: com.swmansion.gesturehandler.core.HoverGestureHandler$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            flagRemovedAndOffsetPosition.onExtraCallback(this.f$0);
        }
    };
    private isAttachedToTransitionOverlay IAuthTabCallback = new isAttachedToTransitionOverlay(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(flagRemovedAndOffsetPosition flagremovedandoffsetposition) {
        flagremovedandoffsetposition.newSession();
    }

    public final isAttachedToTransitionOverlay postMessage() {
        return this.IAuthTabCallback;
    }

    private final boolean IAuthTabCallbackStub(addChangePayload addchangepayload) {
        View viewICustomTabsCallbackStub = addchangepayload.ICustomTabsCallbackStub();
        while (viewICustomTabsCallbackStub != null) {
            if (Intrinsics.areEqual(viewICustomTabsCallbackStub, ICustomTabsCallbackStub())) {
                return true;
            }
            Object parent = viewICustomTabsCallbackStub.getParent();
            viewICustomTabsCallbackStub = parent instanceof View ? (View) parent : null;
        }
        return false;
    }

    static /* synthetic */ Boolean onNavigationEvent(flagRemovedAndOffsetPosition flagremovedandoffsetposition, View view, View view2, View view3, int i, Object obj) {
        if ((i & 4) != 0) {
            view3 = view.getRootView();
            Intrinsics.checkNotNullExpressionValue(view3, "");
        }
        return flagremovedandoffsetposition.IAuthTabCallback(view, view2, view3);
    }

    private final Boolean IAuthTabCallback(View view, View view2, View view3) {
        if (Intrinsics.areEqual(view3, view2)) {
            return Boolean.TRUE;
        }
        if (Intrinsics.areEqual(view3, view)) {
            return Boolean.FALSE;
        }
        if (!(view3 instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view3;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Boolean boolIAuthTabCallback = IAuthTabCallback(view, view2, onWarmupCompleted.onWarmupCompleted(viewGroup, i));
            if (boolIAuthTabCallback != null) {
                return boolIAuthTabCallback;
            }
        }
        return null;
    }

    @Override // o.addChangePayload
    public boolean asBinder(@NotNull addChangePayload addchangepayload) {
        Intrinsics.checkNotNullParameter(addchangepayload, "");
        if ((addchangepayload instanceof flagRemovedAndOffsetPosition) && !((flagRemovedAndOffsetPosition) addchangepayload).IAuthTabCallbackStub((addChangePayload) this)) {
            View viewICustomTabsCallbackStub = addchangepayload.ICustomTabsCallbackStub();
            Intrinsics.checkNotNull(viewICustomTabsCallbackStub);
            View viewICustomTabsCallbackStub2 = ICustomTabsCallbackStub();
            Intrinsics.checkNotNull(viewICustomTabsCallbackStub2);
            Boolean boolOnNavigationEvent = onNavigationEvent(this, viewICustomTabsCallbackStub, viewICustomTabsCallbackStub2, null, 4, null);
            Intrinsics.checkNotNull(boolOnNavigationEvent);
            return boolOnNavigationEvent.booleanValue();
        }
        return super.asBinder(addchangepayload);
    }

    @Override // o.addChangePayload
    public boolean IAuthTabCallbackDefault(@NotNull addChangePayload addchangepayload) {
        Intrinsics.checkNotNullParameter(addchangepayload, "");
        if ((addchangepayload instanceof flagRemovedAndOffsetPosition) && !IAuthTabCallbackStub(addchangepayload) && !((flagRemovedAndOffsetPosition) addchangepayload).IAuthTabCallbackStub((addChangePayload) this)) {
            View viewICustomTabsCallbackStub = ICustomTabsCallbackStub();
            Intrinsics.checkNotNull(viewICustomTabsCallbackStub);
            View viewICustomTabsCallbackStub2 = addchangepayload.ICustomTabsCallbackStub();
            Intrinsics.checkNotNull(viewICustomTabsCallbackStub2);
            Boolean boolOnNavigationEvent = onNavigationEvent(this, viewICustomTabsCallbackStub, viewICustomTabsCallbackStub2, null, 4, null);
            if (boolOnNavigationEvent != null) {
                return boolOnNavigationEvent.booleanValue();
            }
        }
        return super.IAuthTabCallbackDefault(addchangepayload);
    }

    @Override // o.addChangePayload
    public boolean onTransact(@NotNull addChangePayload addchangepayload) {
        Intrinsics.checkNotNullParameter(addchangepayload, "");
        if (((addchangepayload instanceof flagRemovedAndOffsetPosition) && (IAuthTabCallbackStub(addchangepayload) || ((flagRemovedAndOffsetPosition) addchangepayload).IAuthTabCallbackStub((addChangePayload) this))) || (addchangepayload instanceof RNGestureHandlerRootHelper.RootViewGestureHandler)) {
            return true;
        }
        return super.onTransact(addchangepayload);
    }

    @Override // o.addChangePayload
    protected void onExtraCallbackWithResult(@NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        Intrinsics.checkNotNullParameter(motionEvent2, "");
        if (motionEvent.getAction() == 0) {
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.onExtraCallbackWithResult = null;
            return;
        }
        if (motionEvent.getAction() != 1 || extraCommand()) {
            return;
        }
        newSession();
    }

    @Override // o.addChangePayload
    protected void onWarmupCompleted(@NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        Intrinsics.checkNotNullParameter(motionEvent2, "");
        if (motionEvent.getAction() == 10) {
            if (this.onExtraCallbackWithResult == null) {
                this.onExtraCallbackWithResult = new Handler(Looper.getMainLooper());
            }
            Handler handler = this.onExtraCallbackWithResult;
            Intrinsics.checkNotNull(handler);
            handler.postDelayed(this.onNavigationEvent, 4L);
            return;
        }
        if (!extraCommand()) {
            newSession();
            return;
        }
        if (onRelationshipValidationResult() == 4 && motionEvent.getToolType(0) == 2) {
            this.IAuthTabCallback = isAttachedToTransitionOverlay.Companion.onNavigationEvent(motionEvent);
            return;
        }
        if (onRelationshipValidationResult() == 0) {
            if (motionEvent.getAction() == 7 || motionEvent.getAction() == 9) {
                IAuthTabCallbackStub();
                asInterface();
            }
        }
    }

    @Override // o.addChangePayload
    protected void onNavigationEvent() {
        super.onNavigationEvent();
        this.IAuthTabCallback = new isAttachedToTransitionOverlay(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }

    private final void newSession() {
        int iOnRelationshipValidationResult = onRelationshipValidationResult();
        if (iOnRelationshipValidationResult == 0) {
            onTransact();
        } else if (iOnRelationshipValidationResult == 2) {
            access000();
        } else {
            if (iOnRelationshipValidationResult != 4) {
                return;
            }
            getInterfaceDescriptor();
        }
    }

    public static final class onNavigationEvent extends addChangePayload.IAuthTabCallback<flagRemovedAndOffsetPosition> {
        private final Class<flagRemovedAndOffsetPosition> onNavigationEvent = flagRemovedAndOffsetPosition.class;
        private final String IAuthTabCallback = "HoverGestureHandler";

        @Override // o.addChangePayload.IAuthTabCallback
        public Class<flagRemovedAndOffsetPosition> onWarmupCompleted() {
            return this.onNavigationEvent;
        }

        @Override // o.addChangePayload.IAuthTabCallback
        public String IAuthTabCallback() {
            return this.IAuthTabCallback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.addChangePayload.IAuthTabCallback
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public flagRemovedAndOffsetPosition IAuthTabCallback(@Nullable Context context) {
            return new flagRemovedAndOffsetPosition();
        }

        @Override // o.addChangePayload.IAuthTabCallback
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public onEnteredHiddenState onExtraCallback(@NotNull flagRemovedAndOffsetPosition flagremovedandoffsetposition) {
            Intrinsics.checkNotNullParameter(flagremovedandoffsetposition, "");
            return new onEnteredHiddenState(flagremovedandoffsetposition);
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
