package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.react.R;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerDelegate;
import com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.EasingFunctionsKtExternalSyntheticLambda0;
import o.addChangePayload;
import o.getBindingAdapter;
import o.isTmpDetached;
import o.r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(IAuthTabCallback = RNGestureHandlerButtonViewManager.REACT_CLASS)
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RNGestureHandlerButtonViewManager extends ViewGroupManager<ButtonViewGroup> implements RNGestureHandlerButtonManagerInterface<ButtonViewGroup> {
    public static final Companion Companion = new Companion(null);
    public static final String REACT_CLASS = "RNGestureHandlerButton";
    private final r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<ButtonViewGroup> mDelegate;

    public RNGestureHandlerButtonViewManager() {
        super((ReactApplicationContext) null, 1, (DefaultConstructorMarker) null);
        this.mDelegate = new RNGestureHandlerButtonManagerDelegate(this);
    }

    public String getName() {
        return REACT_CLASS;
    }

    public ButtonViewGroup createViewInstance(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        return new ButtonViewGroup(credentialProviderGetSignInIntentControllerhandleResponse2);
    }

    @ReactProp(IAuthTabCallbackStub = "foreground")
    public void setForeground(@NotNull ButtonViewGroup buttonViewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(buttonViewGroup, "");
        buttonViewGroup.setUseDrawableOnForeground(z);
    }

    @ReactProp(IAuthTabCallbackStub = "backgroundColor")
    public void setBackgroundColor(@NotNull ButtonViewGroup buttonViewGroup, int i) {
        Intrinsics.checkNotNullParameter(buttonViewGroup, "");
        buttonViewGroup.setBackgroundColor(i);
    }

    @ReactProp(IAuthTabCallbackStub = "borderless")
    public void setBorderless(@NotNull ButtonViewGroup buttonViewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(buttonViewGroup, "");
        buttonViewGroup.setUseBorderlessDrawable(z);
    }

    @ReactProp(IAuthTabCallbackStub = "enabled")
    public void setEnabled(@NotNull ButtonViewGroup buttonViewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(buttonViewGroup, "");
        buttonViewGroup.setEnabled(z);
    }

    @ReactProp(IAuthTabCallbackStub = "borderRadius")
    public void setBorderRadius(@NotNull ButtonViewGroup buttonViewGroup, float f) {
        Intrinsics.checkNotNullParameter(buttonViewGroup, "");
        buttonViewGroup.setBorderRadius(f);
    }

    @ReactProp(IAuthTabCallbackStub = "borderTopLeftRadius")
    public void setBorderTopLeftRadius(@NotNull ButtonViewGroup buttonViewGroup, float f) {
        Intrinsics.checkNotNullParameter(buttonViewGroup, "");
        buttonViewGroup.setBorderTopLeftRadius(f);
    }

    @ReactProp(IAuthTabCallbackStub = "borderTopRightRadius")
    public void setBorderTopRightRadius(@NotNull ButtonViewGroup buttonViewGroup, float f) {
        Intrinsics.checkNotNullParameter(buttonViewGroup, "");
        buttonViewGroup.setBorderTopRightRadius(f);
    }

    @ReactProp(IAuthTabCallbackStub = "borderBottomLeftRadius")
    public void setBorderBottomLeftRadius(@NotNull ButtonViewGroup buttonViewGroup, float f) {
        Intrinsics.checkNotNullParameter(buttonViewGroup, "");
        buttonViewGroup.setBorderBottomLeftRadius(f);
    }

    @ReactProp(IAuthTabCallbackStub = "borderBottomRightRadius")
    public void setBorderBottomRightRadius(@NotNull ButtonViewGroup buttonViewGroup, float f) {
        Intrinsics.checkNotNullParameter(buttonViewGroup, "");
        buttonViewGroup.setBorderBottomRightRadius(f);
    }

    @ReactProp(IAuthTabCallbackStub = "borderWidth")
    public void setBorderWidth(@NotNull ButtonViewGroup buttonViewGroup, float f) {
        Intrinsics.checkNotNullParameter(buttonViewGroup, "");
        buttonViewGroup.setBorderWidth(f);
    }

    @ReactProp(IAuthTabCallbackStub = "borderColor")
    public void setBorderColor(@NotNull ButtonViewGroup buttonViewGroup, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(buttonViewGroup, "");
        buttonViewGroup.setBorderColor(num);
    }

    @ReactProp(IAuthTabCallbackStub = "borderStyle")
    public void setBorderStyle(@NotNull ButtonViewGroup buttonViewGroup, @Nullable String str) {
        Intrinsics.checkNotNullParameter(buttonViewGroup, "");
        buttonViewGroup.setBorderStyle(str);
    }

    @ReactProp(IAuthTabCallbackStub = "rippleColor")
    public void setRippleColor(@NotNull ButtonViewGroup buttonViewGroup, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(buttonViewGroup, "");
        buttonViewGroup.setRippleColor(num);
    }

    @ReactProp(IAuthTabCallbackStub = "rippleRadius")
    public void setRippleRadius(@NotNull ButtonViewGroup buttonViewGroup, int i) {
        Intrinsics.checkNotNullParameter(buttonViewGroup, "");
        buttonViewGroup.setRippleRadius(Integer.valueOf(i));
    }

    @ReactProp(IAuthTabCallbackStub = "exclusive")
    public void setExclusive(@NotNull ButtonViewGroup buttonViewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(buttonViewGroup, "");
        buttonViewGroup.setExclusive(z);
    }

    @ReactProp(IAuthTabCallbackStub = "touchSoundDisabled")
    public void setTouchSoundDisabled(@NotNull ButtonViewGroup buttonViewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(buttonViewGroup, "");
        buttonViewGroup.setSoundEffectsEnabled(!z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onAfterUpdateTransaction(@NotNull ButtonViewGroup buttonViewGroup) {
        Intrinsics.checkNotNullParameter(buttonViewGroup, "");
        super/*com.facebook.react.uimanager.BaseViewManager*/.onAfterUpdateTransaction(buttonViewGroup);
        buttonViewGroup.onExtraCallback();
    }

    public r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<ButtonViewGroup> getDelegate() {
        return this.mDelegate;
    }

    public static final class ButtonViewGroup extends ViewGroup implements getBindingAdapter.onWarmupCompleted {
        private static ButtonViewGroup onNavigationEvent;
        private static ButtonViewGroup onWarmupCompleted;
        private float IAuthTabCallbackDefault;
        private float IAuthTabCallbackStub;
        private int IAuthTabCallbackStubProxy;
        private boolean IAuthTabCallback_Parcel;
        private long ICustomTabsCallback;
        private boolean access000;
        private float access100;
        private float asBinder;
        private Integer asInterface;
        private int extraCallback;
        private boolean extraCallbackWithResult;
        private float getInterfaceDescriptor;
        private boolean onActivityLayout;
        private boolean onActivityResized;
        private float onExtraCallbackWithResult;
        private Integer onMinimized;
        private String onTransact;
        private boolean readTypedObject;
        private Integer writeTypedObject;
        public static final Companion Companion = new Companion(null);
        private static TypedValue onExtraCallback = new TypedValue();
        private static View.OnClickListener IAuthTabCallback = new View.OnClickListener() { // from class: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$ButtonViewGroup$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RNGestureHandlerButtonViewManager.ButtonViewGroup.onExtraCallbackWithResult(view);
            }
        };

        public static /* synthetic */ void onExtraCallbackWithResult(View view) {
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDrawableHotspotChanged(float f, float f2) {
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        public ButtonViewGroup(@Nullable Context context) {
            super(context);
            this.onTransact = "solid";
            this.access000 = true;
            this.ICustomTabsCallback = -1L;
            this.extraCallback = -1;
            setOnClickListener(IAuthTabCallback);
            setClickable(true);
            setFocusable(true);
            this.readTypedObject = true;
            setClipChildren(false);
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

        public final void setRippleColor(@Nullable Integer num) {
            this.writeTypedObject = num;
            this.readTypedObject = true;
        }

        public final void setRippleRadius(@Nullable Integer num) {
            this.onMinimized = num;
            this.readTypedObject = true;
        }

        public final void setUseDrawableOnForeground(boolean z) {
            this.onActivityLayout = z;
            this.readTypedObject = true;
        }

        public final void setUseBorderlessDrawable(boolean z) {
            this.onActivityResized = z;
        }

        public final void setBorderRadius(float f) {
            this.IAuthTabCallbackStub = f * getResources().getDisplayMetrics().density;
            this.readTypedObject = true;
        }

        public final void setBorderTopLeftRadius(float f) {
            this.asBinder = f * getResources().getDisplayMetrics().density;
            this.readTypedObject = true;
        }

        public final void setBorderTopRightRadius(float f) {
            this.getInterfaceDescriptor = f * getResources().getDisplayMetrics().density;
            this.readTypedObject = true;
        }

        public final void setBorderBottomLeftRadius(float f) {
            this.onExtraCallbackWithResult = f * getResources().getDisplayMetrics().density;
            this.readTypedObject = true;
        }

        public final void setBorderBottomRightRadius(float f) {
            this.IAuthTabCallbackDefault = f * getResources().getDisplayMetrics().density;
            this.readTypedObject = true;
        }

        public final void setBorderWidth(float f) {
            this.access100 = f * getResources().getDisplayMetrics().density;
            this.readTypedObject = true;
        }

        public final void setBorderColor(@Nullable Integer num) {
            this.asInterface = num;
            this.readTypedObject = true;
        }

        public final void setBorderStyle(@Nullable String str) {
            this.onTransact = str;
            this.readTypedObject = true;
        }

        private final boolean IAuthTabCallbackDefault() {
            return (this.IAuthTabCallbackStub == 0.0f && this.asBinder == 0.0f && this.getInterfaceDescriptor == 0.0f && this.onExtraCallbackWithResult == 0.0f && this.IAuthTabCallbackDefault == 0.0f) ? false : true;
        }

        public final void setExclusive(boolean z) {
            this.access000 = z;
        }

        public final void setTouched(boolean z) {
            this.IAuthTabCallback_Parcel = z;
        }

        private final float[] onExtraCallbackWithResult() {
            float f = this.asBinder;
            float f2 = this.getInterfaceDescriptor;
            float f3 = this.IAuthTabCallbackDefault;
            float f4 = this.onExtraCallbackWithResult;
            float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
            ArrayList arrayList = new ArrayList(8);
            for (int i = 0; i < 8; i++) {
                float f5 = fArr[i];
                if (f5 == 0.0f) {
                    f5 = this.IAuthTabCallbackStub;
                }
                arrayList.add(Float.valueOf(f5));
            }
            return CollectionsKt.toFloatArray(arrayList);
        }

        private final PathEffect onWarmupCompleted() {
            String str = this.onTransact;
            if (Intrinsics.areEqual(str, "dotted")) {
                float f = this.access100;
                return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
            }
            if (!Intrinsics.areEqual(str, "dashed")) {
                return null;
            }
            float f2 = this.access100 * 3.0f;
            return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
        }

        @Override // android.view.View
        public void setBackgroundColor(int i) {
            this.IAuthTabCallbackStubProxy = i;
            this.readTypedObject = true;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@NotNull AccessibilityNodeInfo accessibilityNodeInfo) {
            Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            Object tag = super.getTag(R.id.react_test_id);
            if (tag instanceof String) {
                accessibilityNodeInfo.setViewIdResourceName((String) tag);
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            if (super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            onTouchEvent(motionEvent);
            return isPressed();
        }

        @Override // android.view.View
        public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            long eventTime = motionEvent.getEventTime();
            int action = motionEvent.getAction();
            ButtonViewGroup buttonViewGroup = onNavigationEvent;
            if (buttonViewGroup != null && buttonViewGroup != this) {
                Intrinsics.checkNotNull(buttonViewGroup);
                if (buttonViewGroup.access000) {
                    if (isPressed()) {
                        setPressed(false);
                    }
                    this.ICustomTabsCallback = eventTime;
                    this.extraCallback = action;
                    return false;
                }
            }
            if (motionEvent.getAction() == 3) {
                IAuthTabCallbackStub();
            }
            if (this.ICustomTabsCallback == eventTime && this.extraCallback == action && action != 3) {
                return false;
            }
            this.ICustomTabsCallback = eventTime;
            this.extraCallback = action;
            return super.onTouchEvent(motionEvent);
        }

        private final void onNavigationEvent(int i, Drawable drawable, Drawable drawable2) {
            Drawable[] drawableArr;
            PaintDrawable paintDrawable = new PaintDrawable(i);
            if (IAuthTabCallbackDefault()) {
                paintDrawable.setCornerRadii(onExtraCallbackWithResult());
            }
            if (drawable2 != null) {
                drawableArr = new Drawable[]{paintDrawable, drawable2, drawable};
            } else {
                drawableArr = new Drawable[]{paintDrawable, drawable};
            }
            setBackground(new LayerDrawable(drawableArr));
        }

        public final void onExtraCallback() {
            if (this.readTypedObject) {
                this.readTypedObject = false;
                if (this.IAuthTabCallbackStubProxy == 0) {
                    setBackground(null);
                }
                setForeground(null);
                Drawable drawableAsInterface = asInterface();
                Drawable drawableOnTransact = onTransact();
                if (IAuthTabCallbackDefault() && (drawableAsInterface instanceof RippleDrawable)) {
                    PaintDrawable paintDrawable = new PaintDrawable(-1);
                    paintDrawable.setCornerRadii(onExtraCallbackWithResult());
                    ((RippleDrawable) drawableAsInterface).setDrawableByLayerId(android.R.id.mask, paintDrawable);
                }
                if (this.onActivityLayout) {
                    setForeground(drawableAsInterface);
                    int i = this.IAuthTabCallbackStubProxy;
                    if (i != 0) {
                        onNavigationEvent(i, drawableOnTransact, null);
                        return;
                    }
                    return;
                }
                int i2 = this.IAuthTabCallbackStubProxy;
                if (i2 == 0 && this.writeTypedObject == null) {
                    setBackground(new LayerDrawable(new Drawable[]{drawableAsInterface, drawableOnTransact}));
                } else {
                    onNavigationEvent(i2, drawableOnTransact, drawableAsInterface);
                }
            }
        }

        private final Drawable onTransact() {
            PaintDrawable paintDrawable = new PaintDrawable(0);
            if (IAuthTabCallbackDefault()) {
                paintDrawable.setCornerRadii(onExtraCallbackWithResult());
            }
            if (this.access100 > 0.0f) {
                Paint paint = paintDrawable.getPaint();
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(this.access100);
                Integer num = this.asInterface;
                paint.setColor(num != null ? num.intValue() : -16777216);
                paint.setPathEffect(onWarmupCompleted());
            }
            return paintDrawable;
        }

        private final Drawable asInterface() {
            ColorStateList colorStateList;
            Integer num = this.writeTypedObject;
            if (num != null && num.intValue() == 0) {
                return null;
            }
            int[][] iArr = {new int[]{android.R.attr.state_enabled}};
            Integer num2 = this.onMinimized;
            Integer num3 = this.writeTypedObject;
            if (num3 != null) {
                Intrinsics.checkNotNull(num3);
                colorStateList = new ColorStateList(iArr, new int[]{num3.intValue()});
            } else {
                getContext().getTheme().resolveAttribute(android.R.attr.colorControlHighlight, onExtraCallback, true);
                colorStateList = new ColorStateList(iArr, new int[]{onExtraCallback.data});
            }
            RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, null, this.onActivityResized ? null : new ShapeDrawable(new RectShape()));
            if (num2 != null) {
                rippleDrawable.setRadius((int) CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onWarmupCompleted(num2.intValue()));
            }
            return rippleDrawable;
        }

        @Override // android.view.View
        public void drawableHotspotChanged(float f, float f2) {
            ButtonViewGroup buttonViewGroup = onNavigationEvent;
            if (buttonViewGroup == null || buttonViewGroup == this) {
                super.drawableHotspotChanged(f, f2);
            }
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public boolean onNavigationEvent(@NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getActionMasked() == 6) {
                return false;
            }
            boolean zIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
            if (zIAuthTabCallback_Parcel) {
                this.IAuthTabCallback_Parcel = true;
            }
            return zIAuthTabCallback_Parcel;
        }

        @Override // o.getBindingAdapter.onWarmupCompleted
        public void onExtraCallbackWithResult(@NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            IAuthTabCallbackStub();
            this.IAuthTabCallback_Parcel = false;
        }

        private final void IAuthTabCallbackStub() {
            if (onNavigationEvent == this) {
                onNavigationEvent = null;
                onWarmupCompleted = this;
            }
        }

        private final boolean IAuthTabCallback_Parcel() {
            if (IAuthTabCallback(this, null, 1, null)) {
                return false;
            }
            ButtonViewGroup buttonViewGroup = onNavigationEvent;
            if (buttonViewGroup != null) {
                return this.access000 ? buttonViewGroup == this : buttonViewGroup == null || !buttonViewGroup.access000;
            }
            onNavigationEvent = this;
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ boolean IAuthTabCallback(ButtonViewGroup buttonViewGroup, Sequence sequence, int i, Object obj) {
            if ((i & 1) != 0) {
                sequence = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(buttonViewGroup);
            }
            return buttonViewGroup.onNavigationEvent((Sequence<? extends View>) sequence);
        }

        private final boolean onNavigationEvent(Sequence<? extends View> sequence) {
            Iterator itIAuthTabCallback = sequence.IAuthTabCallback();
            while (itIAuthTabCallback.hasNext()) {
                View view = (View) itIAuthTabCallback.next();
                if (view instanceof ButtonViewGroup) {
                    ButtonViewGroup buttonViewGroup = (ButtonViewGroup) view;
                    if (buttonViewGroup.IAuthTabCallback_Parcel || buttonViewGroup.isPressed()) {
                        return true;
                    }
                }
                if ((view instanceof ViewGroup) && onNavigationEvent(EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback((ViewGroup) view))) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyUp(int i, @Nullable KeyEvent keyEvent) {
            this.extraCallbackWithResult = true;
            return super.onKeyUp(i, keyEvent);
        }

        @Override // android.view.View
        public boolean performClick() {
            if (!IAuthTabCallback(this, null, 1, null)) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                if (isTmpDetached.IAuthTabCallback(context)) {
                    RNGestureHandlerRootView rNGestureHandlerRootViewAsBinder = asBinder();
                    if (rNGestureHandlerRootViewAsBinder != null) {
                        rNGestureHandlerRootViewAsBinder.onExtraCallback(this);
                    }
                } else if (this.extraCallbackWithResult) {
                    RNGestureHandlerRootView rNGestureHandlerRootViewAsBinder2 = asBinder();
                    if (rNGestureHandlerRootViewAsBinder2 != null) {
                        rNGestureHandlerRootViewAsBinder2.onExtraCallback(this);
                    }
                    this.extraCallbackWithResult = false;
                }
                if (onWarmupCompleted == this) {
                    IAuthTabCallbackStub();
                    onWarmupCompleted = null;
                    return super.performClick();
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void setPressed(boolean z) {
            boolean z2;
            if (!this.access000) {
                ButtonViewGroup buttonViewGroup = onNavigationEvent;
                z2 = (buttonViewGroup == null || !buttonViewGroup.access000) && !IAuthTabCallback(this, null, 1, null);
            }
            if (!z || onNavigationEvent == this || z2) {
                this.IAuthTabCallback_Parcel = z;
                super.setPressed(z);
            }
            if (z || onNavigationEvent != this) {
                return;
            }
            this.IAuthTabCallback_Parcel = false;
        }

        private final RNGestureHandlerRootView asBinder() {
            RNGestureHandlerRootView rNGestureHandlerRootView = null;
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof RNGestureHandlerRootView) {
                    rNGestureHandlerRootView = (RNGestureHandlerRootView) parent;
                }
            }
            return rNGestureHandlerRootView;
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
