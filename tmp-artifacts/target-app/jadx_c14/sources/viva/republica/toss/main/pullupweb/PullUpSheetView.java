package viva.republica.toss.main.pullupweb;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import im.toss.core.widget.TdsWebSmoothProgressBarV1View;
import im.toss.features.tosscert.ui.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AdError;
import o.AdListener;
import o.AdSDKNotificationManager;
import o.Cacheurls1;
import o.CameraControllerExternalSyntheticLambda0;
import o.ITrustedWebActivityServiceStub;
import o.M_;
import o.RenderInTransitionOverlayNodeElement;
import o.TransitionKtExternalSyntheticLambda3;
import o.generateLink;
import o.getAdService;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getSpecialFeatureOptInStatus;
import o.readIntokhttp;
import o.setIconColor;
import o.setIconSizeDp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PullUpSheetView extends FrameLayout {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int onWarmupCompleted = 8;
    private float IAuthTabCallback;
    private final float IAuthTabCallbackDefault;
    private float IAuthTabCallbackStub;
    private final PullUpSheetHeaderView IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private Function0<Unit> ICustomTabsCallback;
    private setIconSizeDp ICustomTabsCallbackDefault;
    private VelocityTracker ICustomTabsCallbackStub;
    private float ICustomTabsCallbackStubProxy;
    private final int ICustomTabsCallback_Parcel;
    private setIconSizeDp access000;
    private boolean access100;
    private float asBinder;
    private float asInterface;
    private Function0<Unit> extraCallback;
    private final TdsWebSmoothProgressBarV1View extraCallbackWithResult;
    private final float getInterfaceDescriptor;
    private final FrameLayout isEngagementSignalsApiAvailable;
    private final FrameLayout mayLaunchUrl;
    private final LinearLayout onActivityLayout;
    private ValueAnimator onActivityResized;
    private float onExtraCallback;
    private ValueAnimator onExtraCallbackWithResult;
    private final boolean onMessageChannelReady;
    private final SheetShadowView onMinimized;
    private Function0<Boolean> onNavigationEvent;
    private final AdListener onPostMessage;
    private float onRelationshipValidationResult;
    private final float onTransact;
    private final int onUnminimized;
    private float readTypedObject;
    private Function1<? super Float, Unit> writeTypedObject;

    /* JADX WARN: Illegal instructions before constructor call */
    public PullUpSheetView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getInterfaceDescriptor() {
        return false;
    }

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public onNavigationEvent(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullUpSheetView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        float f = getResources().getDisplayMetrics().density;
        this.onTransact = f;
        this.onPostMessage = AdListener.Companion.onExtraCallback();
        this.onUnminimized = ViewConfiguration.get(context).getScaledTouchSlop();
        this.onMessageChannelReady = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f;
        float f2 = 54.0f * f;
        this.getInterfaceDescriptor = f2;
        setIconSizeDp seticonsizedp = setIconSizeDp.Half;
        this.access000 = seticonsizedp;
        this.ICustomTabsCallbackDefault = seticonsizedp;
        this.readTypedObject = -1.0f;
        this.onNavigationEvent = new Function0() { // from class: viva.republica.toss.main.pullupweb.PullUpSheetView$$ExternalSyntheticLambda1
            public final Object invoke() {
                return Boolean.valueOf(PullUpSheetView.getInterfaceDescriptor());
            }
        };
        this.extraCallback = new Function0() { // from class: viva.republica.toss.main.pullupweb.PullUpSheetView$$ExternalSyntheticLambda2
            public final Object invoke() {
                return PullUpSheetView.IAuthTabCallbackStubProxy();
            }
        };
        this.writeTypedObject = new Function1() { // from class: viva.republica.toss.main.pullupweb.PullUpSheetView$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return PullUpSheetView.onExtraCallback(((Float) obj).floatValue());
            }
        };
        int i = R.id.pull_up_web_content_container;
        this.ICustomTabsCallback_Parcel = i;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(i);
        this.isEngagementSignalsApiAvailable = frameLayout;
        TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View = new TdsWebSmoothProgressBarV1View(context, (AttributeSet) null, androidx.appcompat.R.style.Widget_AppCompat_ProgressBar_Horizontal);
        tdsWebSmoothProgressBarV1View.setMax(1000);
        tdsWebSmoothProgressBarV1View.setProgressDrawable(ITrustedWebActivityServiceStub.onExtraCallbackWithResult(context, R.drawable.web_progressbar));
        tdsWebSmoothProgressBarV1View.setVisibility(4);
        this.extraCallbackWithResult = tdsWebSmoothProgressBarV1View;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.addView((View) tdsWebSmoothProgressBarV1View, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(-1, (int) (2.0f * f)));
        this.mayLaunchUrl = frameLayout2;
        PullUpSheetHeaderView pullUpSheetHeaderView = new PullUpSheetHeaderView(context, null, 2, null);
        pullUpSheetHeaderView.setOnClose(new Function0() { // from class: viva.republica.toss.main.pullupweb.PullUpSheetView$$ExternalSyntheticLambda4
            public final Object invoke() {
                return PullUpSheetView.onTransact(this.f$0);
            }
        });
        this.IAuthTabCallbackStubProxy = pullUpSheetHeaderView;
        this.IAuthTabCallbackDefault = M_.onExtraCallback.onExtraCallback(context) != null ? r10.left : 0;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        linearLayout.setBackgroundColor(((Integer) getDEFAULT_CONNECTION_SPECSokhttp.onExtraCallbackWithResult(1656360527, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{new getDEFAULT_CONNECTION_SPECSokhttp(new onNavigationEvent(configuration))}, R.drawable.IAuthTabCallback(), -1656360525)).intValue());
        linearLayout.setClipToOutline(true);
        linearLayout.setOutlineProvider(new IAuthTabCallback());
        this.onActivityLayout = linearLayout;
        SheetShadowView sheetShadowView = new SheetShadowView(context, f);
        this.onMinimized = sheetShadowView;
        setBackgroundColor(0);
        linearLayout.addView(pullUpSheetHeaderView, new LinearLayout.LayoutParams(-1, (int) f2));
        linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        addView(sheetShadowView, new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        ViewCompat.onWarmupCompleted(this, new RenderInTransitionOverlayNodeElement() { // from class: viva.republica.toss.main.pullupweb.PullUpSheetView$$ExternalSyntheticLambda5
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return PullUpSheetView.IAuthTabCallback(this.f$0, view, windowInsetsCompat);
            }
        });
        IAuthTabCallback_Parcel();
    }

    public /* synthetic */ PullUpSheetView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final void setCanWebViewScrollUp(@NotNull Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.onNavigationEvent = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackStubProxy() {
        return Unit.INSTANCE;
    }

    public final void setOnDismiss(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.extraCallback = function0;
    }

    public final void setOnBackPressed(@Nullable Function0<Unit> function0) {
        this.ICustomTabsCallback = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(float f) {
        return Unit.INSTANCE;
    }

    public final void setOnChromeProgress(@NotNull Function1<? super Float, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.writeTypedObject = function1;
    }

    public final int asInterface() {
        return this.ICustomTabsCallback_Parcel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTransact(PullUpSheetView pullUpSheetView) {
        pullUpSheetView.asBinder();
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallback extends ViewOutlineProvider {
        IAuthTabCallback() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(outline, "");
            float f = PullUpSheetView.this.IAuthTabCallback;
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + ((int) f), f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat IAuthTabCallback(PullUpSheetView pullUpSheetView, View view, WindowInsetsCompat windowInsetsCompat) {
        ValueAnimator valueAnimator;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.asBinder());
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        pullUpSheetView.onRelationshipValidationResult = cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted;
        int i = cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback;
        pullUpSheetView.ICustomTabsCallbackStubProxy = i;
        FrameLayout frameLayout = pullUpSheetView.isEngagementSignalsApiAvailable;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), i);
        if (pullUpSheetView.IAuthTabCallback_Parcel || ((valueAnimator = pullUpSheetView.onActivityResized) != null && valueAnimator.isRunning())) {
            return windowInsetsCompat;
        }
        pullUpSheetView.IAuthTabCallback(pullUpSheetView.ICustomTabsCallbackDefault);
        return windowInsetsCompat;
    }

    private final void IAuthTabCallback_Parcel() {
        this.IAuthTabCallbackStubProxy.setImportantForAccessibility(1);
        ViewCompat.onExtraCallbackWithResult(this.IAuthTabCallbackStubProxy, "전체 화면으로 펼치기", new TransitionKtExternalSyntheticLambda3() { // from class: viva.republica.toss.main.pullupweb.PullUpSheetView$$ExternalSyntheticLambda6
            public final boolean perform(View view, TransitionKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback) {
                return PullUpSheetView.onNavigationEvent(this.f$0, view, iAuthTabCallback);
            }
        });
        ViewCompat.onExtraCallbackWithResult(this.IAuthTabCallbackStubProxy, "원래 크기로 줄이기", new TransitionKtExternalSyntheticLambda3() { // from class: viva.republica.toss.main.pullupweb.PullUpSheetView$$ExternalSyntheticLambda7
            public final boolean perform(View view, TransitionKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback) {
                return PullUpSheetView.onWarmupCompleted(this.f$0, view, iAuthTabCallback);
            }
        });
        ViewCompat.onExtraCallbackWithResult(this.IAuthTabCallbackStubProxy, "닫기", new TransitionKtExternalSyntheticLambda3() { // from class: viva.republica.toss.main.pullupweb.PullUpSheetView$$ExternalSyntheticLambda8
            public final boolean perform(View view, TransitionKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback) {
                return PullUpSheetView.IAuthTabCallbackDefault(this.f$0, view, iAuthTabCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onNavigationEvent(PullUpSheetView pullUpSheetView, View view, TransitionKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(view, "");
        pullUpSheetView.IAuthTabCallbackStub();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onWarmupCompleted(PullUpSheetView pullUpSheetView, View view, TransitionKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(view, "");
        pullUpSheetView.onNavigationEvent();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IAuthTabCallbackDefault(PullUpSheetView pullUpSheetView, View view, TransitionKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(view, "");
        pullUpSheetView.asBinder();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@NotNull KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "");
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        Function0<Unit> function0 = this.ICustomTabsCallback;
        if (keyEvent.getKeyCode() != 4 || function0 == null) {
            return false;
        }
        if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
            function0.invoke();
        }
        return true;
    }

    public final void setInitialState(@NotNull setIconSizeDp seticonsizedp) {
        Intrinsics.checkNotNullParameter(seticonsizedp, "");
        this.access000 = seticonsizedp;
        this.ICustomTabsCallbackDefault = seticonsizedp;
    }

    public final setIconSizeDp onExtraCallback() {
        return this.ICustomTabsCallbackDefault;
    }

    public final boolean IAuthTabCallbackDefault() {
        return this.access100;
    }

    public final void onExtraCallback(@NotNull setIconSizeDp seticonsizedp, boolean z) {
        Intrinsics.checkNotNullParameter(seticonsizedp, "");
        this.ICustomTabsCallbackDefault = seticonsizedp;
        this.access100 = z;
    }

    public final void setTitle(@Nullable CharSequence charSequence) {
        this.IAuthTabCallbackStubProxy.setTitle(charSequence);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != 0) {
            if (!this.access100) {
                extraCallback();
                return;
            }
            if (this.IAuthTabCallback_Parcel) {
                return;
            }
            ValueAnimator valueAnimator = this.onActivityResized;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                IAuthTabCallback(this.ICustomTabsCallbackDefault);
            }
        }
    }

    private final AdSDKNotificationManager readTypedObject() {
        return new AdSDKNotificationManager(0.0f, getHeight(), this.onRelationshipValidationResult, this.ICustomTabsCallbackStubProxy);
    }

    private final float onNavigationEvent(setIconSizeDp seticonsizedp) {
        return setIconColor.onWarmupCompleted.onExtraCallbackWithResult(seticonsizedp, readTypedObject(), this.onPostMessage, this.onTransact);
    }

    private final float onWarmupCompleted(setIconSizeDp seticonsizedp) {
        return seticonsizedp == setIconSizeDp.Fullscreen ? 1.0f : 0.0f;
    }

    private final float access000() {
        return setIconColor.onWarmupCompleted.onExtraCallback(this.asInterface, 0.0f, 40.0f, this.onTransact) * (1.0f - this.onExtraCallback);
    }

    private final void access100() {
        this.onActivityLayout.setTranslationY(this.asInterface);
        LinearLayout linearLayout = this.onActivityLayout;
        linearLayout.setPadding(linearLayout.getPaddingLeft(), (int) (this.onRelationshipValidationResult * this.onExtraCallback), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        float fAccess000 = access000();
        this.IAuthTabCallbackStubProxy.setTranslationY(fAccess000);
        this.mayLaunchUrl.setTranslationY(fAccess000);
        this.onMinimized.setTranslationY(this.asInterface - (this.onTransact * 80.0f));
        this.onMinimized.setAlpha(1.0f - this.onExtraCallback);
        float fOnNavigationEvent = setIconColor.onWarmupCompleted.onNavigationEvent(this.onExtraCallback, this.onRelationshipValidationResult > 0.0f ? this.IAuthTabCallbackDefault : 0.0f, this.onPostMessage, this.onTransact);
        if (fOnNavigationEvent != this.IAuthTabCallback) {
            this.IAuthTabCallback = fOnNavigationEvent;
            this.onActivityLayout.invalidateOutline();
        }
        this.onMinimized.setCornerRadiusPx(fOnNavigationEvent);
        this.IAuthTabCallbackStubProxy.setChromeProgress(this.onExtraCallback);
        if (this.onRelationshipValidationResult <= 0.0f) {
            float f = this.onExtraCallback;
            if (f == this.readTypedObject) {
                return;
            }
            this.readTypedObject = f;
            this.writeTypedObject.invoke(Float.valueOf(f));
        }
    }

    private final void IAuthTabCallback(setIconSizeDp seticonsizedp) {
        this.asInterface = onNavigationEvent(seticonsizedp);
        this.onExtraCallback = onWarmupCompleted(seticonsizedp);
        access100();
    }

    public final void asBinder() {
        this.ICustomTabsCallbackDefault = setIconSizeDp.Dismissed;
        onExtraCallback(setIconColor.onWarmupCompleted.onExtraCallbackWithResult(readTypedObject(), this.onTransact), 0.0f, 260L, new Function0() { // from class: viva.republica.toss.main.pullupweb.PullUpSheetView$$ExternalSyntheticLambda10
            public final Object invoke() {
                return PullUpSheetView.onNavigationEvent(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(PullUpSheetView pullUpSheetView) {
        pullUpSheetView.extraCallback.invoke();
        return Unit.INSTANCE;
    }

    public final void IAuthTabCallbackStub() {
        onExtraCallback(setIconSizeDp.Fullscreen);
    }

    public final void onNavigationEvent() {
        onExtraCallback(this.access000);
    }

    private final void onExtraCallback(setIconSizeDp seticonsizedp) {
        this.ICustomTabsCallbackDefault = seticonsizedp;
        onNavigationEvent(this, onNavigationEvent(seticonsizedp), onWarmupCompleted(seticonsizedp), 340L, null, 8, null);
    }

    private final void extraCallback() {
        this.access100 = true;
        float fOnNavigationEvent = onNavigationEvent(this.ICustomTabsCallbackDefault);
        this.asInterface = setIconColor.onWarmupCompleted.onExtraCallbackWithResult(readTypedObject(), this.onTransact);
        this.onExtraCallback = 0.0f;
        access100();
        onNavigationEvent(this, fOnNavigationEvent, onWarmupCompleted(this.ICustomTabsCallbackDefault), this.onPostMessage.onNavigationEvent(), null, 8, null);
    }

    private final void onNavigationEvent(float f) {
        setIconSizeDp seticonsizedpOnWarmupCompleted = onWarmupCompleted(f);
        this.ICustomTabsCallbackDefault = seticonsizedpOnWarmupCompleted;
        if (seticonsizedpOnWarmupCompleted == setIconSizeDp.Dismissed) {
            onExtraCallback(setIconColor.onWarmupCompleted.onExtraCallbackWithResult(readTypedObject(), this.onTransact), 0.0f, 260L, new Function0() { // from class: viva.republica.toss.main.pullupweb.PullUpSheetView$$ExternalSyntheticLambda9
                public final Object invoke() {
                    return PullUpSheetView.IAuthTabCallbackStub(this.f$0);
                }
            });
        } else {
            onNavigationEvent(this, onNavigationEvent(seticonsizedpOnWarmupCompleted), onWarmupCompleted(seticonsizedpOnWarmupCompleted), 340L, null, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackStub(PullUpSheetView pullUpSheetView) {
        pullUpSheetView.extraCallback.invoke();
        return Unit.INSTANCE;
    }

    private final setIconSizeDp onWarmupCompleted(float f) {
        float f2 = f / this.onTransact;
        float f3 = this.asInterface;
        AdSDKNotificationManager typedObject = readTypedObject();
        float fOnNavigationEvent = onNavigationEvent(this.access000);
        float fOnWarmupCompleted = setIconColor.onWarmupCompleted.onWarmupCompleted(typedObject);
        float fOnExtraCallback = this.onPostMessage.onExtraCallback();
        float fOnExtraCallbackWithResult = typedObject.onExtraCallbackWithResult();
        if (f2 > 1450.0f) {
            return setIconSizeDp.Dismissed;
        }
        if (f2 < -620.0f) {
            return setIconSizeDp.Fullscreen;
        }
        if (f3 >= (fOnExtraCallback * (fOnExtraCallbackWithResult - fOnNavigationEvent)) + fOnNavigationEvent) {
            return setIconSizeDp.Dismissed;
        }
        if (f3 <= (fOnNavigationEvent + fOnWarmupCompleted) / 2.0f) {
            return setIconSizeDp.Fullscreen;
        }
        return this.access000;
    }

    static /* synthetic */ void onNavigationEvent(PullUpSheetView pullUpSheetView, float f, float f2, long j, Function0 function0, int i, Object obj) {
        if ((i & 8) != 0) {
            function0 = new Function0() { // from class: viva.republica.toss.main.pullupweb.PullUpSheetView$$ExternalSyntheticLambda11
                public final Object invoke() {
                    return PullUpSheetView.onTransact();
                }
            };
        }
        pullUpSheetView.onExtraCallback(f, f2, j, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTransact() {
        return Unit.INSTANCE;
    }

    private final void onExtraCallback(final float f, final float f2, long j, Function0<Unit> function0) {
        ValueAnimator valueAnimator = this.onActivityResized;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.onExtraCallbackWithResult;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        final float f3 = this.asInterface;
        final float f4 = this.onExtraCallback;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (this.onMessageChannelReady) {
            j = Math.min(j, 180L);
        }
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.main.pullupweb.PullUpSheetView$$ExternalSyntheticLambda12
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                PullUpSheetView.IAuthTabCallback(this.f$0, f3, f, f4, f2, valueAnimator3);
            }
        });
        valueAnimatorOfFloat.addListener(AdError.onWarmupCompleted(function0));
        valueAnimatorOfFloat.start();
        this.onActivityResized = valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(PullUpSheetView pullUpSheetView, float f, float f2, float f3, float f4, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        pullUpSheetView.asInterface = f + ((f2 - f) * fFloatValue);
        pullUpSheetView.onExtraCallback = f3 + ((f4 - f3) * fFloatValue);
        pullUpSheetView.access100();
    }

    private final void onExtraCallbackWithResult(final float f) {
        ValueAnimator valueAnimator = this.onExtraCallbackWithResult;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final float f2 = this.onExtraCallback;
        if (f2 == f) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.onMessageChannelReady ? Math.min(150L, 180L) : 150L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.main.pullupweb.PullUpSheetView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                PullUpSheetView.onWarmupCompleted(this.f$0, f2, f, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.start();
        this.onExtraCallbackWithResult = valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(PullUpSheetView pullUpSheetView, float f, float f2, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        pullUpSheetView.onExtraCallback = f + ((f2 - f) * ((Float) animatedValue).floatValue());
        pullUpSheetView.access100();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                float rawY = motionEvent.getRawY() - this.IAuthTabCallbackStub;
                if (!this.IAuthTabCallback_Parcel && Math.abs(rawY) > this.onUnminimized && onExtraCallback(motionEvent.getY(), rawY)) {
                    onNavigationEvent(motionEvent.getRawY(), rawY > 0.0f);
                    return true;
                }
            }
        } else {
            if (motionEvent.getY() < this.asInterface) {
                return false;
            }
            this.IAuthTabCallbackStub = motionEvent.getRawY();
            this.asBinder = this.asInterface;
            this.IAuthTabCallback_Parcel = false;
            ValueAnimator valueAnimator = this.onActivityResized;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            android.view.VelocityTracker r0 = r6.ICustomTabsCallbackStub
            if (r0 != 0) goto Lf
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.ICustomTabsCallbackStub = r0
        Lf:
            r0.addMovement(r7)
            int r1 = r7.getActionMasked()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L9a
            if (r1 == r3) goto L7d
            r4 = 2
            if (r1 == r4) goto L24
            r7 = 3
            if (r1 == r7) goto L7d
            goto L99
        L24:
            boolean r0 = r6.IAuthTabCallback_Parcel
            if (r0 != 0) goto L51
            float r0 = r7.getRawY()
            float r1 = r6.IAuthTabCallbackStub
            float r0 = r0 - r1
            float r1 = java.lang.Math.abs(r0)
            int r4 = r6.onUnminimized
            float r4 = (float) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L51
            float r1 = r7.getY()
            boolean r1 = r6.onExtraCallback(r1, r0)
            if (r1 == 0) goto L51
            float r1 = r7.getRawY()
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L4e
            r2 = r3
        L4e:
            r6.onNavigationEvent(r1, r2)
        L51:
            boolean r0 = r6.IAuthTabCallback_Parcel
            if (r0 == 0) goto L99
            float r7 = r7.getRawY()
            float r0 = r6.IAuthTabCallbackStub
            o.setIconColor r1 = o.setIconColor.onWarmupCompleted
            o.AdSDKNotificationManager r2 = r6.readTypedObject()
            float r2 = r1.onWarmupCompleted(r2)
            o.AdSDKNotificationManager r4 = r6.readTypedObject()
            float r5 = r6.onTransact
            float r1 = r1.onExtraCallbackWithResult(r4, r5)
            float r4 = r6.asBinder
            float r7 = r7 - r0
            float r4 = r4 + r7
            float r7 = kotlin.ranges.RangesKt.coerceIn(r4, r2, r1)
            r6.asInterface = r7
            r6.access100()
            goto L99
        L7d:
            boolean r7 = r6.IAuthTabCallback_Parcel
            if (r7 == 0) goto L8d
            r7 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r7)
            float r7 = r0.getYVelocity()
            r6.onNavigationEvent(r7)
        L8d:
            r6.IAuthTabCallback_Parcel = r2
            android.view.VelocityTracker r7 = r6.ICustomTabsCallbackStub
            if (r7 == 0) goto L96
            r7.recycle()
        L96:
            r7 = 0
            r6.ICustomTabsCallbackStub = r7
        L99:
            return r3
        L9a:
            float r0 = r7.getY()
            float r1 = r6.asInterface
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto La5
            return r2
        La5:
            float r7 = r7.getRawY()
            r6.IAuthTabCallbackStub = r7
            float r7 = r6.asInterface
            r6.asBinder = r7
            android.animation.ValueAnimator r7 = r6.onActivityResized
            if (r7 == 0) goto Lb6
            r7.cancel()
        Lb6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.pullupweb.PullUpSheetView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private final void onNavigationEvent(float f, boolean z) {
        this.IAuthTabCallback_Parcel = true;
        this.IAuthTabCallbackStub = f;
        this.asBinder = this.asInterface;
        onExtraCallbackWithResult((this.ICustomTabsCallbackDefault != setIconSizeDp.Fullscreen || z) ? 0.0f : 1.0f);
    }

    private final boolean onExtraCallback(float f, float f2) {
        float f3 = this.asInterface;
        if (f >= f3 && f <= f3 + this.getInterfaceDescriptor) {
            return true;
        }
        boolean z = f2 > 0.0f;
        if (((Boolean) this.onNavigationEvent.invoke()).booleanValue()) {
            return false;
        }
        if (z && this.onPostMessage.asBinder()) {
            return true;
        }
        return (z || !this.onPostMessage.IAuthTabCallbackDefault() || this.ICustomTabsCallbackDefault == setIconSizeDp.Fullscreen) ? false : true;
    }

    static final class SheetShadowView extends View {
        private float onExtraCallback;
        private final RectF onExtraCallbackWithResult;
        private final Paint onNavigationEvent;
        private final float onWarmupCompleted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SheetShadowView(@NotNull Context context, float f) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "");
            this.onWarmupCompleted = f;
            this.onExtraCallbackWithResult = new RectF();
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setMaskFilter(new BlurMaskFilter(f * 80.0f, BlurMaskFilter.Blur.NORMAL));
            this.onNavigationEvent = paint;
            setLayerType(1, null);
            setClickable(false);
        }

        public final void setCornerRadiusPx(float f) {
            if (f == this.onExtraCallback) {
                return;
            }
            this.onExtraCallback = f;
            invalidate();
        }

        @Override // android.view.View
        protected void onDraw(@NotNull Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "");
            Paint paint = this.onNavigationEvent;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            paint.setColor(((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue() ? Cacheurls1.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted.onNavigationEvent() : Cacheurls1.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted.onWarmupCompleted());
            float f = this.onWarmupCompleted;
            float f2 = 4.0f * f;
            this.onExtraCallbackWithResult.set(-f2, ((80.0f * f) + (f * 18.0f)) - f2, getWidth() + f2, getHeight() + f2);
            RectF rectF = this.onExtraCallbackWithResult;
            float f3 = this.onExtraCallback;
            canvas.drawRoundRect(rectF, f3, f3, this.onNavigationEvent);
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
