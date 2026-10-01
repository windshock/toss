package com.swmansion.rnscreens.bottomsheet;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ReactCompoundViewGroup;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.swmansion.rnscreens.ext.NumericExtKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DimmingView extends ViewGroup implements ReactCompoundViewGroup, ReactPointerEventsView {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "DimmingView";
    private final DimmingViewPointerEventsProxy pointerEventsProxy;

    public CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1 getPointerEvents() {
        return this.pointerEventsProxy.getPointerEvents();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DimmingView(@NotNull Context context, float f, @NotNull DimmingViewPointerEventsProxy dimmingViewPointerEventsProxy) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dimmingViewPointerEventsProxy, "");
        this.pointerEventsProxy = dimmingViewPointerEventsProxy;
        dimmingViewPointerEventsProxy.setPointerEventsImpl(new DimmingViewPointerEventsImpl(this));
        setBackgroundColor(-16777216);
        setAlpha(f);
    }

    public /* synthetic */ DimmingView(Context context, float f, DimmingViewPointerEventsProxy dimmingViewPointerEventsProxy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? 0.6f : f, dimmingViewPointerEventsProxy);
    }

    public /* synthetic */ DimmingView(Context context, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? 0.6f : f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DimmingView(@NotNull Context context, float f) {
        this(context, f, new DimmingViewPointerEventsProxy(null));
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final boolean getBlockGestures$react_native_screens_release() {
        return !NumericExtKt.equalWithRespectToEps$default(getAlpha(), 0.0f, 0.0f, 2, null);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        if (getBlockGestures$react_native_screens_release()) {
            callOnClick();
        }
        return getBlockGestures$react_native_screens_release();
    }

    public int reactTagForTouch(float f, float f2) {
        throw new IllegalStateException("[RNScreens] DimmingView should never be asked for the view tag!");
    }

    public boolean interceptsTouchEvent(float f, float f2) {
        return getBlockGestures$react_native_screens_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.pointerEventsProxy.setPointerEventsImpl(null);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
