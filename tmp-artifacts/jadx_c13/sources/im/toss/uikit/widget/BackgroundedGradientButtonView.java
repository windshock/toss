package im.toss.uikit.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda10;
import im.toss.uikit.gradient.TdsRadialGradientView;
import im.toss.uikit.widget.BackgroundedGradientButtonView$;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Address;
import o.AnrPluginExternalSyntheticLambda1;
import o.AppLovinSdkSettings;
import o.HttpException;
import o.M_;
import o.attachAppLovinSdk;
import o.deprecated_dns;
import o.getExtraParameters;
import o.isFireOS;
import o.isMuted;
import o.pxToDp;
import o.readIntokhttp;
import o.runOnUiThreadDelayed;
import o.setTagsokhttp;
import o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BackgroundedGradientButtonView extends ConstraintLayout {
    private static int asInterface = 1;
    private static int onTransact;
    private final Lazy IAuthTabCallback;
    private runOnUiThreadDelayed IAuthTabCallbackStub;
    private final int asBinder;
    private final HttpException onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private Function0<Unit> onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackgroundedGradientButtonView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackgroundedGradientButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Interpolator IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Interpolator interpolatorOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i3 = asInterface + 9;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 72 / 0;
        }
        return interpolatorOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BackgroundedGradientButtonView backgroundedGradientButtonView) {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        Unit unit = (Unit) onExtraCallback(1949182811, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), new Object[]{backgroundedGradientButtonView}, -1949182811, iOnExtraCallback, iOnExtraCallback2, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback());
        int i4 = asInterface + 55;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BackgroundedGradientButtonView backgroundedGradientButtonView, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(backgroundedGradientButtonView, attachapplovinsdk);
        int i4 = onTransact + 63;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(attachapplovinsdk);
        }
        onNavigationEvent(attachapplovinsdk);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~((~i4) | i7);
        int i9 = (~i) | (~(i7 | i4));
        int i10 = i4 | i | i7;
        int i11 = i + i3 + i5 + (1635157569 * i2) + ((-1141649966) * i6);
        int i12 = i11 * i11;
        int i13 = (((-1186836012) * i) - 711983104) + (488484398 * i3) + (i8 * 1309823443) + (1309823443 * i9) + ((-1309823443) * i10) + (1798307840 * i5) + (1462763520 * i2) + (1566572544 * i6) + (1631846400 * i12);
        int i14 = (i * 1521345644) + 2088555610 + (i3 * 1521346098) + (i8 * (-227)) + (i9 * (-227)) + (i10 * 227) + (i5 * 1521345871) + (i2 * (-1382509809)) + (i6 * 37969358) + (i12 * (-671350784));
        int i15 = i13 + (i14 * i14 * (-1069809664));
        return i15 != 1 ? i15 != 2 ? onExtraCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(attachapplovinsdk);
        int i4 = asInterface + 49;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(BackgroundedGradientButtonView backgroundedGradientButtonView, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(backgroundedGradientButtonView, attachapplovinsdk);
        int i4 = asInterface + 79;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ boolean onNavigationEvent(BackgroundedGradientButtonView backgroundedGradientButtonView) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(backgroundedGradientButtonView);
        int i4 = onTransact + 95;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BackgroundedGradientButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        HttpException httpExceptionOnExtraCallbackWithResult = HttpException.onExtraCallbackWithResult(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(httpExceptionOnExtraCallbackWithResult, "");
        this.onExtraCallback = httpExceptionOnExtraCallbackWithResult;
        this.IAuthTabCallback = LazyKt__LazyJVMKt.lazy(new BackgroundedGradientButtonView$.ExternalSyntheticLambda0());
        this.onNavigationEvent = LazyKt__LazyJVMKt.lazy(new BackgroundedGradientButtonView$.ExternalSyntheticLambda1(this));
        Object[] objArr = {M_.onExtraCallback, context};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        this.asBinder = ((Integer) M_.onNavigationEvent(-2118175014, objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, 2118175019, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2)).intValue();
        setAlpha(0.0f);
        int iOnExtraCallback = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        onExtraCallback(2118896866, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, -2118896865, iOnExtraCallback, iOnExtraCallback2, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BackgroundedGradientButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = asInterface + 25;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 / 4;
            } else {
                int i5 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = onTransact + 77;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private static final Interpolator onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolatorAsBinder = Address.onNavigationEvent.asBinder();
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        return interpolatorAsBinder;
    }

    private final Interpolator onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallback.getValue();
        if (i3 == 0) {
            return (Interpolator) value;
        }
        int i4 = 44 / 0;
        return (Interpolator) value;
    }

    public final void setOnActionUp(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        this.onWarmupCompleted = function0;
        int i5 = i3 + 125;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        BackgroundedGradientButtonView backgroundedGradientButtonView = (BackgroundedGradientButtonView) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) backgroundedGradientButtonView.onNavigationEvent.getValue();
        if (i3 != 0) {
            bool.booleanValue();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = asInterface + 21;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    public final void setTitle(@NotNull CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.onExtraCallback.IAuthTabCallback.setText(charSequence);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.onExtraCallback.IAuthTabCallback.setText(charSequence);
        int i3 = onTransact + 95;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    public final Typography5 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Typography5 typography5 = this.onExtraCallback.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(typography5, "");
            return typography5;
        }
        Intrinsics.checkNotNullExpressionValue(this.onExtraCallback.IAuthTabCallback, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setBackgroundColors(@NotNull AnrPluginExternalSyntheticLambda1 anrPluginExternalSyntheticLambda1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(anrPluginExternalSyntheticLambda1, "");
        int iOnExtraCallback = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        if (!((Boolean) onExtraCallback(271261653, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, -271261651, iOnExtraCallback, iOnExtraCallback2, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback())).booleanValue()) {
            this.onExtraCallback.onExtraCallbackWithResult.setBackgroundColor(anrPluginExternalSyntheticLambda1.onMessageChannelReady());
            this.onExtraCallback.onWarmupCompleted.setGradientColor(anrPluginExternalSyntheticLambda1.onMinimized(), 0);
            return;
        }
        int i2 = asInterface + 43;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.onExtraCallbackWithResult.setBackgroundColor(anrPluginExternalSyntheticLambda1.asInterface());
        this.onExtraCallback.onWarmupCompleted.setGradientColor(anrPluginExternalSyntheticLambda1.onTransact(), 0);
        int i4 = asInterface + 113;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [android.view.View, im.toss.uikit.widget.BackgroundedGradientButtonView] */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ?? r5 = (BackgroundedGradientButtonView) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        HttpException httpException = ((BackgroundedGradientButtonView) r5).onExtraCallback;
        httpException.onExtraCallbackWithResult.setRadius(setTagsokhttp.onExtraCallbackWithResult((View) r5, 16));
        float f = ((BackgroundedGradientButtonView) r5).asBinder;
        ViewGroup.LayoutParams layoutParams = httpException.onWarmupCompleted.getLayoutParams();
        int i4 = (int) (f * 2.0f);
        layoutParams.width = i4;
        layoutParams.height = i4;
        httpException.onNavigationEvent.setBackgroundColor(Color.argb(12, 217, 244, 255));
        int i5 = onTransact + 91;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final void onNavigationEvent(@NotNull Function2<? super Float, ? super Float, Unit> function2) {
        int i = 2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        Intrinsics.checkNotNullParameter(function2, "");
        HttpException httpException = this.onExtraCallback;
        float alpha = httpException.onWarmupCompleted.getAlpha();
        Float fValueOf2 = Float.valueOf(1.0f);
        if (alpha < 1.0f) {
            int i2 = onTransact;
            int i3 = i2 + 41;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            runOnUiThreadDelayed runonuithreaddelayed = this.IAuthTabCallbackStub;
            if (runonuithreaddelayed != null) {
                int i5 = i2 + 101;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                if (runonuithreaddelayed.postMessage()) {
                    int i7 = asInterface + 93;
                    onTransact = i7 % 128;
                    int i8 = i7 % 2;
                    return;
                }
            }
            pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
            Interpolator interpolatorOnNavigationEvent = onNavigationEvent();
            Rally rallyIAuthTabCallback = RallysKt.IAuthTabCallback(new onNavigationEvent(function2), isMuted.onExtraCallback(isMuted.getInterfaceDescriptor(new AppLovinSdkSettings(), Float.valueOf(300.0f), fValueOf, new Function1() { // from class: im.toss.uikit.widget.BackgroundedGradientButtonView$$ExternalSyntheticLambda2
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallbackWithResult + 109;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitOnExtraCallbackWithResult = BackgroundedGradientButtonView.onExtraCallbackWithResult((attachAppLovinSdk) obj);
                    if (i11 == 0) {
                        int i12 = 54 / 0;
                    }
                    return unitOnExtraCallbackWithResult;
                }
            }), fValueOf, fValueOf2, new Function1() { // from class: im.toss.uikit.widget.BackgroundedGradientButtonView$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i9 = 2 % 2;
                    int i10 = onNavigationEvent + 63;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitIAuthTabCallback = BackgroundedGradientButtonView.IAuthTabCallback((attachAppLovinSdk) obj);
                    int i12 = onNavigationEvent + 9;
                    IAuthTabCallback = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 28 / 0;
                    }
                    return unitIAuthTabCallback;
                }
            }), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 700, 0L, false, 1788, (Object) null);
            TdsRadialGradientView tdsRadialGradientView = httpException.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(tdsRadialGradientView, "");
            this.IAuthTabCallbackStub = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onNavigationEvent(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{rallyIAuthTabCallback, (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRadialGradientView, isMuted.onExtraCallback(isMuted.onTransact(new AppLovinSdkSettings(), fValueOf, fValueOf2, new Function1() { // from class: im.toss.uikit.widget.BackgroundedGradientButtonView$$ExternalSyntheticLambda4
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallback + 105;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    BackgroundedGradientButtonView backgroundedGradientButtonView = this.f$0;
                    attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                    if (i11 == 0) {
                        return BackgroundedGradientButtonView.onNavigationEvent(backgroundedGradientButtonView, attachapplovinsdk);
                    }
                    BackgroundedGradientButtonView.onNavigationEvent(backgroundedGradientButtonView, attachapplovinsdk);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }), fValueOf, fValueOf2, new Function1() { // from class: im.toss.uikit.widget.BackgroundedGradientButtonView$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallbackWithResult + 15;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    BackgroundedGradientButtonView backgroundedGradientButtonView = this.f$0;
                    attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                    if (i11 != 0) {
                        return BackgroundedGradientButtonView.IAuthTabCallback(backgroundedGradientButtonView, attachapplovinsdk);
                    }
                    BackgroundedGradientButtonView.IAuthTabCallback(backgroundedGradientButtonView, attachapplovinsdk);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }), 0, null, 0, null, null, null, 1100, 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, interpolatorOnNavigationEvent, 1200, Boolean.FALSE, 1000, 0L, false, 3129, (Object) null), (Object) null, new Function0() { // from class: im.toss.uikit.widget.BackgroundedGradientButtonView$$ExternalSyntheticLambda6
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i9 = 2 % 2;
                    int i10 = onNavigationEvent + 51;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitIAuthTabCallback = BackgroundedGradientButtonView.IAuthTabCallback(this.f$0);
                    int i12 = onExtraCallbackWithResult + 85;
                    onNavigationEvent = i12 % 128;
                    if (i12 % 2 == 0) {
                        return unitIAuthTabCallback;
                    }
                    throw null;
                }
            }, 1, (Object) null), false, 1, (Object) null);
        }
    }

    public static final class onNavigationEvent implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Function2<Float, Float, Unit> onExtraCallbackWithResult;

        /* JADX WARN: Multi-variable type inference failed */
        onNavigationEvent(Function2<? super Float, ? super Float, Unit> function2) {
            this.onExtraCallbackWithResult = function2;
        }

        public /* bridge */ void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.IAuthTabCallback(f);
            int i4 = onExtraCallback + 105;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* bridge */ void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(f);
            int i4 = IAuthTabCallback + 71;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* bridge */ void onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(obj);
            int i4 = IAuthTabCallback + 71;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public /* bridge */ void onWarmupCompleted(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(f);
            if (i3 != 0) {
                int i4 = 36 / 0;
            }
            int i5 = onExtraCallback + 21;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        public void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                BackgroundedGradientButtonView.this.setTranslationY(f);
                this.onExtraCallbackWithResult.invoke(Float.valueOf(BackgroundedGradientButtonView.this.getTranslationY()), Float.valueOf(BackgroundedGradientButtonView.this.getAlpha()));
            } else {
                BackgroundedGradientButtonView.this.setTranslationY(f);
                this.onExtraCallbackWithResult.invoke(Float.valueOf(BackgroundedGradientButtonView.this.getTranslationY()), Float.valueOf(BackgroundedGradientButtonView.this.getAlpha()));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public void onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            BackgroundedGradientButtonView.this.setAlpha(f);
            if (i3 == 0) {
                int i4 = 39 / 0;
            }
        }
    }

    private static final Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(new deprecated_dns(200.0d, 50.0d));
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(new deprecated_dns(200.0d, 50.0d));
        attachapplovinsdk.onExtraCallback(0);
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 21;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(BackgroundedGradientButtonView backgroundedGradientButtonView, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(backgroundedGradientButtonView.onNavigationEvent());
        attachapplovinsdk.IAuthTabCallback(3000);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 105;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(BackgroundedGradientButtonView backgroundedGradientButtonView, attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 61;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(backgroundedGradientButtonView.onNavigationEvent());
            i = 11939;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(backgroundedGradientButtonView.onNavigationEvent());
            i = 1000;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        BackgroundedGradientButtonView backgroundedGradientButtonView = (BackgroundedGradientButtonView) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 119;
        onTransact = i2 % 128;
        backgroundedGradientButtonView.onExtraCallbackWithResult = i2 % 2 == 0;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (this.onExtraCallbackWithResult) {
            return super/*android.view.View*/.onTouchEvent(motionEvent);
        }
        int i4 = asInterface + 99;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.View*/.onDetachedFromWindow();
        runOnUiThreadDelayed runonuithreaddelayed = this.IAuthTabCallbackStub;
        if (runonuithreaddelayed != null) {
            int i4 = onTransact + 99;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            runonuithreaddelayed.onNavigationEvent();
            if (i5 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean onWarmupCompleted(BackgroundedGradientButtonView backgroundedGradientButtonView) {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = backgroundedGradientButtonView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        boolean zOnExtraCallback = readIntokhttp.onExtraCallback(configuration);
        int i4 = asInterface + 17;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    private final void onExtraCallback() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        onExtraCallback(2118896866, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, -2118896865, iOnExtraCallback, iOnExtraCallback2, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback());
    }

    private final boolean IAuthTabCallbackStub() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        return ((Boolean) onExtraCallback(271261653, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, -271261651, iOnExtraCallback, iOnExtraCallback2, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback())).booleanValue();
    }

    private static final Unit onExtraCallback(BackgroundedGradientButtonView backgroundedGradientButtonView) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        return (Unit) onExtraCallback(1949182811, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), new Object[]{backgroundedGradientButtonView}, -1949182811, iOnExtraCallback, iOnExtraCallback2, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback());
    }
}
