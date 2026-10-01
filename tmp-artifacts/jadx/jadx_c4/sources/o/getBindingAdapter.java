package o;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.scroll.ReactHorizontalScrollView;
import com.facebook.react.views.scroll.ReactScrollView;
import com.facebook.react.views.swiperefresh.ReactSwipeRefreshLayout;
import com.facebook.react.views.text.ReactTextView;
import com.facebook.react.views.textinput.ReactEditText;
import com.facebook.react.views.view.ReactViewGroup;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.addChangePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getBindingAdapter extends addChangePayload {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final onExtraCallback onExtraCallback = new onExtraCallback();
    private onWarmupCompleted IAuthTabCallback = onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private boolean onWarmupCompleted;

    public getBindingAdapter() {
        onExtraCallbackWithResult(true);
    }

    public final boolean postMessage() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.addChangePayload
    public void onExtraCallbackWithResult() {
        super.onExtraCallbackWithResult();
        this.onWarmupCompleted = false;
        this.onExtraCallbackWithResult = false;
        onExtraCallbackWithResult(true);
    }

    @Override // o.addChangePayload
    public boolean onTransact(@NotNull addChangePayload addchangepayload) {
        Intrinsics.checkNotNullParameter(addchangepayload, "");
        Boolean boolOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent(addchangepayload);
        if (boolOnNavigationEvent != null) {
            return boolOnNavigationEvent.booleanValue();
        }
        if (super.onTransact(addchangepayload)) {
            return true;
        }
        if ((addchangepayload instanceof getBindingAdapter) && addchangepayload.onRelationshipValidationResult() == 4 && ((getBindingAdapter) addchangepayload).onExtraCallbackWithResult) {
            return false;
        }
        boolean z = this.onExtraCallbackWithResult;
        return !(onRelationshipValidationResult() == 4 && addchangepayload.onRelationshipValidationResult() == 4 && !z) && onRelationshipValidationResult() == 4 && !z && (!this.IAuthTabCallback.onNavigationEvent() || addchangepayload.onUnminimized() > 0);
    }

    @Override // o.addChangePayload
    public boolean asBinder(@NotNull addChangePayload addchangepayload) {
        Intrinsics.checkNotNullParameter(addchangepayload, "");
        return !this.onExtraCallbackWithResult;
    }

    @Override // o.addChangePayload
    protected void prefetch() {
        ReactEditText reactEditTextICustomTabsCallbackStub = ICustomTabsCallbackStub();
        if (reactEditTextICustomTabsCallbackStub instanceof onWarmupCompleted) {
            this.IAuthTabCallback = (onWarmupCompleted) reactEditTextICustomTabsCallbackStub;
            return;
        }
        if (reactEditTextICustomTabsCallbackStub instanceof ReactEditText) {
            this.IAuthTabCallback = new IAuthTabCallback(this, reactEditTextICustomTabsCallbackStub);
            return;
        }
        if (reactEditTextICustomTabsCallbackStub instanceof ReactSwipeRefreshLayout) {
            this.IAuthTabCallback = new onTransact(this, (ReactSwipeRefreshLayout) reactEditTextICustomTabsCallbackStub);
            return;
        }
        if (reactEditTextICustomTabsCallbackStub instanceof ReactScrollView) {
            this.IAuthTabCallback = new IAuthTabCallbackDefault();
            return;
        }
        if (reactEditTextICustomTabsCallbackStub instanceof ReactHorizontalScrollView) {
            this.IAuthTabCallback = new IAuthTabCallbackDefault();
        } else if (reactEditTextICustomTabsCallbackStub instanceof ReactTextView) {
            this.IAuthTabCallback = new asBinder();
        } else if (reactEditTextICustomTabsCallbackStub instanceof ReactViewGroup) {
            this.IAuthTabCallback = new asInterface();
        }
    }

    @Override // o.addChangePayload
    protected void onExtraCallbackWithResult(@NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        Intrinsics.checkNotNullParameter(motionEvent2, "");
        View viewICustomTabsCallbackStub = ICustomTabsCallbackStub();
        Intrinsics.checkNotNull(viewICustomTabsCallbackStub);
        Context context = viewICustomTabsCallbackStub.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        boolean zIAuthTabCallback = isTmpDetached.IAuthTabCallback(context);
        if ((viewICustomTabsCallbackStub instanceof RNGestureHandlerButtonViewManager.ButtonViewGroup) && zIAuthTabCallback) {
            return;
        }
        if (motionEvent.getActionMasked() == 1) {
            if (onRelationshipValidationResult() == 0 && !this.IAuthTabCallback.onNavigationEvent(motionEvent)) {
                onTransact();
            } else {
                this.IAuthTabCallback.onNavigationEvent(viewICustomTabsCallbackStub, motionEvent);
                if ((onRelationshipValidationResult() == 0 || onRelationshipValidationResult() == 2) && this.IAuthTabCallback.IAuthTabCallback(viewICustomTabsCallbackStub)) {
                    asInterface();
                }
                if (onRelationshipValidationResult() == 0) {
                    onTransact();
                } else {
                    getInterfaceDescriptor();
                }
            }
            this.IAuthTabCallback.onExtraCallbackWithResult(motionEvent);
            return;
        }
        if (onRelationshipValidationResult() == 0 || onRelationshipValidationResult() == 2) {
            if (this.onWarmupCompleted) {
                Companion.onNavigationEvent(viewICustomTabsCallbackStub, motionEvent);
                this.IAuthTabCallback.onNavigationEvent(viewICustomTabsCallbackStub, motionEvent);
                asInterface();
                return;
            } else if (Companion.onNavigationEvent(viewICustomTabsCallbackStub, motionEvent)) {
                this.IAuthTabCallback.onNavigationEvent(viewICustomTabsCallbackStub, motionEvent);
                asInterface();
                return;
            } else if (this.IAuthTabCallback.IAuthTabCallback()) {
                this.IAuthTabCallback.IAuthTabCallback(motionEvent);
                return;
            } else {
                if (onRelationshipValidationResult() == 2 || !this.IAuthTabCallback.onNavigationEvent(motionEvent)) {
                    return;
                }
                IAuthTabCallbackStub();
                return;
            }
        }
        if (onRelationshipValidationResult() == 4) {
            this.IAuthTabCallback.onNavigationEvent(viewICustomTabsCallbackStub, motionEvent);
        }
    }

    private final void newSession() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setAction(3);
        onWarmupCompleted onwarmupcompleted = this.IAuthTabCallback;
        View viewICustomTabsCallbackStub = ICustomTabsCallbackStub();
        Intrinsics.checkNotNull(motionEventObtain);
        onwarmupcompleted.onNavigationEvent(viewICustomTabsCallbackStub, motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // o.addChangePayload
    protected void onWarmupCompleted() {
        newSession();
    }

    @Override // o.addChangePayload
    protected void ICustomTabsCallback_Parcel() {
        newSession();
    }

    @Override // o.addChangePayload
    protected void onNavigationEvent() {
        this.IAuthTabCallback = onExtraCallback;
    }

    public static final class onNavigationEvent extends addChangePayload.IAuthTabCallback<getBindingAdapter> {
        public static final C0026onNavigationEvent Companion = new C0026onNavigationEvent(null);
        private final Class<getBindingAdapter> onNavigationEvent = getBindingAdapter.class;
        private final String onExtraCallback = "NativeViewGestureHandler";

        @Override // o.addChangePayload.IAuthTabCallback
        public Class<getBindingAdapter> onWarmupCompleted() {
            return this.onNavigationEvent;
        }

        @Override // o.addChangePayload.IAuthTabCallback
        public String IAuthTabCallback() {
            return this.onExtraCallback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.addChangePayload.IAuthTabCallback
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public getBindingAdapter IAuthTabCallback(@Nullable Context context) {
            return new getBindingAdapter();
        }

        @Override // o.addChangePayload.IAuthTabCallback
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public void onNavigationEvent(@NotNull getBindingAdapter getbindingadapter, @NotNull ReadableMap readableMap) {
            Intrinsics.checkNotNullParameter(getbindingadapter, "");
            Intrinsics.checkNotNullParameter(readableMap, "");
            super.onNavigationEvent(getbindingadapter, readableMap);
            if (readableMap.hasKey("shouldActivateOnStart")) {
                getbindingadapter.onWarmupCompleted = readableMap.getBoolean("shouldActivateOnStart");
            }
            if (readableMap.hasKey("disallowInterruption")) {
                getbindingadapter.onExtraCallbackWithResult = readableMap.getBoolean("disallowInterruption");
            }
        }

        @Override // o.addChangePayload.IAuthTabCallback
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public onLeftHiddenState onExtraCallback(@NotNull getBindingAdapter getbindingadapter) {
            Intrinsics.checkNotNullParameter(getbindingadapter, "");
            return new onLeftHiddenState(getbindingadapter);
        }

        /* renamed from: o.getBindingAdapter$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static final class C0026onNavigationEvent {
            public /* synthetic */ C0026onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0026onNavigationEvent() {
            }
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean onNavigationEvent(View view, MotionEvent motionEvent) {
            return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
        }
    }

    public static final class onExtraCallback implements onWarmupCompleted {
        onExtraCallback() {
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ void IAuthTabCallback(MotionEvent motionEvent) {
            super.IAuthTabCallback(motionEvent);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ boolean IAuthTabCallback() {
            return super.IAuthTabCallback();
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ boolean IAuthTabCallback(View view) {
            return super.IAuthTabCallback(view);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ void onExtraCallbackWithResult(MotionEvent motionEvent) {
            super.onExtraCallbackWithResult(motionEvent);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ Boolean onNavigationEvent(View view, MotionEvent motionEvent) {
            return super.onNavigationEvent(view, motionEvent);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ Boolean onNavigationEvent(addChangePayload addchangepayload) {
            return super.onNavigationEvent(addchangepayload);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ boolean onNavigationEvent() {
            return super.onNavigationEvent();
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ boolean onNavigationEvent(MotionEvent motionEvent) {
            return super.onNavigationEvent(motionEvent);
        }
    }

    public interface onWarmupCompleted {
        default void IAuthTabCallback(@NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
        }

        default boolean IAuthTabCallback() {
            return false;
        }

        default void onExtraCallbackWithResult(@NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
        }

        default Boolean onNavigationEvent(@NotNull addChangePayload addchangepayload) {
            Intrinsics.checkNotNullParameter(addchangepayload, "");
            return null;
        }

        default boolean onNavigationEvent() {
            return false;
        }

        default boolean onNavigationEvent(@NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            return true;
        }

        default boolean IAuthTabCallback(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return view.isPressed();
        }

        default Boolean onNavigationEvent(@Nullable View view, @NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            if (view != null) {
                return Boolean.valueOf(view.onTouchEvent(motionEvent));
            }
            return null;
        }
    }

    static final class asBinder implements onWarmupCompleted {
        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ void IAuthTabCallback(@NotNull MotionEvent motionEvent) {
            super.IAuthTabCallback(motionEvent);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ boolean IAuthTabCallback() {
            return super.IAuthTabCallback();
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ void onExtraCallbackWithResult(@NotNull MotionEvent motionEvent) {
            super.onExtraCallbackWithResult(motionEvent);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ Boolean onNavigationEvent(@Nullable View view, @NotNull MotionEvent motionEvent) {
            return super.onNavigationEvent(view, motionEvent);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ boolean onNavigationEvent() {
            return super.onNavigationEvent();
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ boolean onNavigationEvent(@NotNull MotionEvent motionEvent) {
            return super.onNavigationEvent(motionEvent);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public Boolean onNavigationEvent(@NotNull addChangePayload addchangepayload) {
            Intrinsics.checkNotNullParameter(addchangepayload, "");
            return Boolean.FALSE;
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public boolean IAuthTabCallback(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return view instanceof ReactTextView;
        }
    }

    static final class IAuthTabCallback implements onWarmupCompleted {
        private int IAuthTabCallback;
        private float onExtraCallback;
        private float onExtraCallbackWithResult;
        private final getBindingAdapter onNavigationEvent;
        private final ReactEditText onWarmupCompleted;

        @Override // o.getBindingAdapter.onWarmupCompleted
        public boolean IAuthTabCallback() {
            return true;
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public boolean onNavigationEvent() {
            return true;
        }

        public IAuthTabCallback(@NotNull getBindingAdapter getbindingadapter, @NotNull ReactEditText reactEditText) {
            Intrinsics.checkNotNullParameter(getbindingadapter, "");
            Intrinsics.checkNotNullParameter(reactEditText, "");
            this.onNavigationEvent = getbindingadapter;
            this.onWarmupCompleted = reactEditText;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(reactEditText.getContext());
            this.IAuthTabCallback = viewConfiguration.getScaledTouchSlop() * viewConfiguration.getScaledTouchSlop();
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ boolean IAuthTabCallback(@NotNull View view) {
            return super.IAuthTabCallback(view);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ Boolean onNavigationEvent(@Nullable View view, @NotNull MotionEvent motionEvent) {
            return super.onNavigationEvent(view, motionEvent);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ boolean onNavigationEvent(@NotNull MotionEvent motionEvent) {
            return super.onNavigationEvent(motionEvent);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public void onExtraCallbackWithResult(@NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            if (((motionEvent.getX() - this.onExtraCallbackWithResult) * (motionEvent.getX() - this.onExtraCallbackWithResult)) + ((motionEvent.getY() - this.onExtraCallback) * (motionEvent.getY() - this.onExtraCallback)) < this.IAuthTabCallback) {
                this.onWarmupCompleted.readTypedObject();
            }
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public Boolean onNavigationEvent(@NotNull addChangePayload addchangepayload) {
            Intrinsics.checkNotNullParameter(addchangepayload, "");
            return Boolean.valueOf(addchangepayload.onUnminimized() > 0 && !(addchangepayload instanceof getBindingAdapter));
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public void IAuthTabCallback(@NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            this.onNavigationEvent.asInterface();
            this.onWarmupCompleted.onTouchEvent(motionEvent);
            this.onExtraCallbackWithResult = motionEvent.getX();
            this.onExtraCallback = motionEvent.getY();
        }
    }

    static final class onTransact implements onWarmupCompleted {
        private final ReactSwipeRefreshLayout onExtraCallback;
        private final getBindingAdapter onNavigationEvent;

        @Override // o.getBindingAdapter.onWarmupCompleted
        public boolean IAuthTabCallback() {
            return true;
        }

        public onTransact(@NotNull getBindingAdapter getbindingadapter, @NotNull ReactSwipeRefreshLayout reactSwipeRefreshLayout) {
            Intrinsics.checkNotNullParameter(getbindingadapter, "");
            Intrinsics.checkNotNullParameter(reactSwipeRefreshLayout, "");
            this.onNavigationEvent = getbindingadapter;
            this.onExtraCallback = reactSwipeRefreshLayout;
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ boolean IAuthTabCallback(@NotNull View view) {
            return super.IAuthTabCallback(view);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ void onExtraCallbackWithResult(@NotNull MotionEvent motionEvent) {
            super.onExtraCallbackWithResult(motionEvent);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ Boolean onNavigationEvent(@Nullable View view, @NotNull MotionEvent motionEvent) {
            return super.onNavigationEvent(view, motionEvent);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ Boolean onNavigationEvent(@NotNull addChangePayload addchangepayload) {
            return super.onNavigationEvent(addchangepayload);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ boolean onNavigationEvent() {
            return super.onNavigationEvent();
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ boolean onNavigationEvent(@NotNull MotionEvent motionEvent) {
            return super.onNavigationEvent(motionEvent);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public void IAuthTabCallback(@NotNull MotionEvent motionEvent) {
            ArrayList<addChangePayload> arrayListOnExtraCallbackWithResult;
            Intrinsics.checkNotNullParameter(motionEvent, "");
            View childAt = this.onExtraCallback.getChildAt(0);
            addchangepayload = null;
            ScrollView scrollView = childAt instanceof ScrollView ? (ScrollView) childAt : null;
            if (scrollView != null) {
                doesTransientStatePreventRecycling doestransientstatepreventrecyclingOnPostMessage = this.onNavigationEvent.onPostMessage();
                if (doestransientstatepreventrecyclingOnPostMessage != null && (arrayListOnExtraCallbackWithResult = doestransientstatepreventrecyclingOnPostMessage.onExtraCallbackWithResult(scrollView)) != null) {
                    for (addChangePayload addchangepayload : arrayListOnExtraCallbackWithResult) {
                        if (addchangepayload instanceof getBindingAdapter) {
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                if (addchangepayload == null || addchangepayload.onRelationshipValidationResult() != 4 || scrollView.getScrollY() <= 0) {
                    return;
                }
                this.onNavigationEvent.access000();
            }
        }
    }

    static final class IAuthTabCallbackDefault implements onWarmupCompleted {
        @Override // o.getBindingAdapter.onWarmupCompleted
        public boolean onNavigationEvent() {
            return true;
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ void IAuthTabCallback(@NotNull MotionEvent motionEvent) {
            super.IAuthTabCallback(motionEvent);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ boolean IAuthTabCallback() {
            return super.IAuthTabCallback();
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ boolean IAuthTabCallback(@NotNull View view) {
            return super.IAuthTabCallback(view);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ void onExtraCallbackWithResult(@NotNull MotionEvent motionEvent) {
            super.onExtraCallbackWithResult(motionEvent);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ Boolean onNavigationEvent(@Nullable View view, @NotNull MotionEvent motionEvent) {
            return super.onNavigationEvent(view, motionEvent);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ Boolean onNavigationEvent(@NotNull addChangePayload addchangepayload) {
            return super.onNavigationEvent(addchangepayload);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ boolean onNavigationEvent(@NotNull MotionEvent motionEvent) {
            return super.onNavigationEvent(motionEvent);
        }
    }

    static final class asInterface implements onWarmupCompleted {
        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ void IAuthTabCallback(@NotNull MotionEvent motionEvent) {
            super.IAuthTabCallback(motionEvent);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ boolean IAuthTabCallback() {
            return super.IAuthTabCallback();
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ boolean IAuthTabCallback(@NotNull View view) {
            return super.IAuthTabCallback(view);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ void onExtraCallbackWithResult(@NotNull MotionEvent motionEvent) {
            super.onExtraCallbackWithResult(motionEvent);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ Boolean onNavigationEvent(@NotNull addChangePayload addchangepayload) {
            return super.onNavigationEvent(addchangepayload);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ boolean onNavigationEvent() {
            return super.onNavigationEvent();
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public /* bridge */ boolean onNavigationEvent(@NotNull MotionEvent motionEvent) {
            return super.onNavigationEvent(motionEvent);
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public Boolean onNavigationEvent(@Nullable View view, @NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            if (view != null) {
                return Boolean.valueOf(view.dispatchTouchEvent(motionEvent));
            }
            return null;
        }
    }
}
