package im.toss.core.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.core.widget.TdsWebSmoothProgressBarV1View$;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallyCanvas;
import im.toss.tds.foundation.anim.rally.RallysKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Address;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.AppLovinSdkSettings;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.deprecated_certificatePinner;
import o.findResAndMsg;
import o.formatMsgs;
import o.getAdService;
import o.getExtraParameters;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.isFireOS;
import o.isMuted;
import o.matches;
import o.maybeUpdateAnimatable;
import o.readIntokhttp;
import o.setHeadersokhttp;
import o.setRandomHost;
import o.setVisitUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TdsWebSmoothProgressBarV1View extends ProgressBar {
    public static final onNavigationEvent Companion;
    private static int extraCallback = 0;
    private static int onActivityResized = 0;
    private static int onPostMessage = 1;
    private static int readTypedObject = 1;
    private final Paint IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private ValueAnimator IAuthTabCallbackStub;
    private final RallyCanvas IAuthTabCallbackStubProxy;
    private long IAuthTabCallback_Parcel;
    private final Runnable ICustomTabsCallback;
    private final RallyCanvas access000;
    private Rally access100;
    private float asBinder;
    private boolean asInterface;
    private final Handler extraCallbackWithResult;
    private final Handler getInterfaceDescriptor;
    private final Handler.Callback onExtraCallback;
    private final Paint onExtraCallbackWithResult;
    private final Paint onNavigationEvent;
    private boolean onTransact;
    private float onWarmupCompleted;
    private long writeTypedObject;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onNavigationEvent(defaultConstructorMarker);
        int i = onActivityResized + 7;
        onPostMessage = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsWebSmoothProgressBarV1View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsWebSmoothProgressBarV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View = (TdsWebSmoothProgressBarV1View) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        Canvas canvas = (Canvas) objArr[2];
        int i = 2 % 2;
        int i2 = readTypedObject + 21;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {tdsWebSmoothProgressBarV1View, Float.valueOf(fFloatValue), canvas};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1330699095, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1330699092, objArr2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int i4 = extraCallback + 65;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = readTypedObject + 45;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onExtraCallbackWithResult(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -136139457, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 136139457, new Object[]{tdsWebSmoothProgressBarV1View, valueAnimator}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int i4 = readTypedObject + 89;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = i8 | i2;
        int i10 = (~(i7 | i8)) | (~(i7 | i2)) | (~i9);
        int i11 = ~i2;
        int i12 = (~(i4 | i11 | i5)) | (~(i7 | i11 | i8)) | (~(i9 | i5));
        int i13 = ~(i8 | i11 | i5);
        int i14 = i2 + i5 + i3 + ((-973178360) * i) + (1542423572 * i6);
        int i15 = i14 * i14;
        int i16 = (((-1657973228) * i2) - 1073741824) + ((-187520530) * i5) + ((-735226349) * i10) + (i12 * 735226349) + (735226349 * i13) + ((-922746880) * i3) + (1207959552 * i) + ((-1275068416) * i6) + (196542464 * i15);
        int i17 = (i2 * (-490823948)) + 944362368 + (i5 * (-490821954)) + (i10 * (-997)) + (i12 * 997) + (i13 * 997) + (i3 * (-490822951)) + (i * 2145288392) + (i6 * 779328756) + (i15 * (-1138819072));
        int i18 = i16 + (i17 * i17 * 1440284672);
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? i18 != 5 ? onExtraCallbackWithResult(objArr) : onTransact(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = readTypedObject + 73;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(tdsWebSmoothProgressBarV1View, valueAnimator);
        int i4 = extraCallback + 115;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View, Canvas canvas) {
        int i = 2 % 2;
        int i2 = extraCallback + 51;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(tdsWebSmoothProgressBarV1View, canvas);
        int i4 = extraCallback + 21;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onWarmupCompleted(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = extraCallback + 43;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(tdsWebSmoothProgressBarV1View, valueAnimator);
        int i4 = extraCallback + 93;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onWarmupCompleted(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View, Message message) {
        int i = 2 % 2;
        int i2 = extraCallback + 57;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(tdsWebSmoothProgressBarV1View, message);
        int i4 = extraCallback + 121;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    public static final class onExtraCallbackWithResult implements View.OnLayoutChangeListener {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public onExtraCallbackWithResult() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int iIAuthTabCallbackStub;
            int i9 = 2 % 2;
            int i10 = onNavigationEvent + 13;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            if (!TdsWebSmoothProgressBarV1View.this.isAttachedToWindow()) {
                return;
            }
            int i12 = IAuthTabCallback + 9;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 != 0) {
                TdsWebSmoothProgressBarV1View.this.getWidth();
                throw null;
            }
            if (TdsWebSmoothProgressBarV1View.this.getWidth() <= 0 || TdsWebSmoothProgressBarV1View.this.getHeight() <= 0) {
                return;
            }
            Context context = TdsWebSmoothProgressBarV1View.this.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            int iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new asInterface(configuration))}, -1612582679, 1612582689, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            RadialGradient radialGradient = new RadialGradient(TdsWebSmoothProgressBarV1View.this.getWidth() / 2.0f, TdsWebSmoothProgressBarV1View.this.getHeight() / 2.0f, TdsWebSmoothProgressBarV1View.this.getWidth() / 4.0f, iIntValue, 0, tileMode);
            float width = TdsWebSmoothProgressBarV1View.this.getWidth() / 2.0f;
            float height = TdsWebSmoothProgressBarV1View.this.getHeight() / 2.0f;
            float width2 = TdsWebSmoothProgressBarV1View.this.getWidth() / 2.0f;
            Context context2 = TdsWebSmoothProgressBarV1View.this.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Resources resources = context2.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration2 = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            if (readIntokhttp.onExtraCallback(configuration2)) {
                Context context3 = TdsWebSmoothProgressBarV1View.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                Configuration configuration3 = context3.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration3, "");
                iIAuthTabCallbackStub = ((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new asBinder(configuration3)).getInterfaceDescriptor()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue();
            } else {
                Context context4 = TdsWebSmoothProgressBarV1View.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                Configuration configuration4 = context4.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration4, "");
                iIAuthTabCallbackStub = new getUrlokhttp(new onTransact(configuration4)).requestPostMessageChannel().IAuthTabCallbackStub();
            }
            RadialGradient radialGradient2 = new RadialGradient(width, height, width2, iIAuthTabCallbackStub, 0, tileMode);
            Object[] objArr = {TdsWebSmoothProgressBarV1View.this};
            ((Paint) TdsWebSmoothProgressBarV1View.onExtraCallbackWithResult(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 47613948, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -47613946, objArr, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())).setShader(radialGradient);
            Object[] objArr2 = {TdsWebSmoothProgressBarV1View.this};
            ((Paint) TdsWebSmoothProgressBarV1View.onExtraCallbackWithResult(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 510113453, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -510113452, objArr2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())).setShader(radialGradient2);
            TdsWebSmoothProgressBarV1View.IAuthTabCallback(TdsWebSmoothProgressBarV1View.this).setStyle(Paint.Style.FILL);
            Paint paintIAuthTabCallback = TdsWebSmoothProgressBarV1View.IAuthTabCallback(TdsWebSmoothProgressBarV1View.this);
            Context context5 = TdsWebSmoothProgressBarV1View.this.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            Configuration configuration5 = context5.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration5, "");
            paintIAuthTabCallback.setColor(new getUrlokhttp(new access100(configuration5)).IAuthTabCallbackDefault());
            float width3 = TdsWebSmoothProgressBarV1View.this.getWidth();
            TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View = TdsWebSmoothProgressBarV1View.this;
            Object[] objArr3 = {tdsWebSmoothProgressBarV1View, isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted(TdsWebSmoothProgressBarV1View.onWarmupCompleted(tdsWebSmoothProgressBarV1View), CollectionsKt.listOf(isMuted.IAuthTabCallback_Parcel((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(Address.onNavigationEvent.asInterface()), 1000}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), Float.valueOf(((-1.0f) * width3) / 2.0f), Float.valueOf(width3 / 2.0f), (Function1) null, 4, (Object) null)), -1, getExtraParameters.Normal, 100, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2016, (Object) null), false, 1, (Object) null)};
            TdsWebSmoothProgressBarV1View.onExtraCallbackWithResult(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1626143489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1626143494, objArr3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            int i13 = onNavigationEvent + 65;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsWebSmoothProgressBarV1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.access000 = new RallyCanvas(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (Integer) null, (Float) null, (Float) null, (Float) null, (Integer) null, (Float) null, (Float) null, 0.0f, 2097150, (DefaultConstructorMarker) null);
        this.IAuthTabCallbackStubProxy = new RallyCanvas(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (Integer) null, (Float) null, (Float) null, (Float) null, (Integer) null, (Float) null, (Float) null, 0.0f, 2097150, (DefaultConstructorMarker) null);
        this.IAuthTabCallback = new Paint();
        this.onNavigationEvent = new Paint();
        this.onExtraCallbackWithResult = new Paint();
        Handler.Callback callback = new Handler.Callback() { // from class: im.toss.core.widget.TdsWebSmoothProgressBarV1View$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 77;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                boolean zOnWarmupCompleted = TdsWebSmoothProgressBarV1View.onWarmupCompleted(this.f$0, message);
                int i5 = onNavigationEvent + 107;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return zOnWarmupCompleted;
            }
        };
        this.onExtraCallback = callback;
        this.getInterfaceDescriptor = new Handler(Looper.getMainLooper(), callback);
        this.extraCallbackWithResult = new Handler(Looper.getMainLooper());
        setIndeterminate(false);
        IAuthTabCallbackDefault();
        this.ICustomTabsCallback = new getInterfaceDescriptor();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsWebSmoothProgressBarV1View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = readTypedObject + 113;
            extraCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = readTypedObject + 57;
            extraCallback = i5 % 128;
            i = i5 % 2 != 0 ? 1 : 0;
            int i6 = 2 % 2;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ Paint IAuthTabCallback(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View) {
        int i = 2 % 2;
        int i2 = readTypedObject + 107;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        Paint paint = tdsWebSmoothProgressBarV1View.onExtraCallbackWithResult;
        int i5 = i3 + 125;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return paint;
        }
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallbackDefault(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View) {
        int i = 2 % 2;
        int i2 = extraCallback + 55;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        tdsWebSmoothProgressBarV1View.onExtraCallbackWithResult();
        int i4 = extraCallback + 33;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
    }

    public static final /* synthetic */ Runnable IAuthTabCallbackStub(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View) {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 5;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Runnable runnable = tdsWebSmoothProgressBarV1View.ICustomTabsCallback;
        int i5 = i2 + 49;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return runnable;
    }

    public static final /* synthetic */ boolean asBinder(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View) {
        int i = 2 % 2;
        int i2 = extraCallback + 59;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean z = tdsWebSmoothProgressBarV1View.onTransact;
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return z;
    }

    public static final /* synthetic */ boolean asInterface(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View) {
        int i = 2 % 2;
        int i2 = extraCallback + 67;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        boolean z = tdsWebSmoothProgressBarV1View.asInterface;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 67;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View = (TdsWebSmoothProgressBarV1View) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 121;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        Paint paint = tdsWebSmoothProgressBarV1View.IAuthTabCallback;
        int i5 = i3 + 35;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return paint;
    }

    public static final /* synthetic */ void onExtraCallback(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View, long j) {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 117;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        tdsWebSmoothProgressBarV1View.writeTypedObject = j;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 35;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
    }

    public static final /* synthetic */ Handler onExtraCallbackWithResult(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View) {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 75;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Handler handler = tdsWebSmoothProgressBarV1View.extraCallbackWithResult;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 125;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return handler;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View = (TdsWebSmoothProgressBarV1View) objArr[0];
        Rally rally = (Rally) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 47;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        tdsWebSmoothProgressBarV1View.access100 = rally;
        if (i4 == 0) {
            int i5 = 77 / 0;
        }
        int i6 = i2 + 93;
        readTypedObject = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 63 / 0;
        }
        return null;
    }

    public static final /* synthetic */ void onTransact(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View) {
        int i = 2 % 2;
        int i2 = extraCallback + 23;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        tdsWebSmoothProgressBarV1View.onNavigationEvent();
        int i4 = extraCallback + 65;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ RallyCanvas onWarmupCompleted(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View) {
        int i = 2 % 2;
        int i2 = readTypedObject + 105;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        RallyCanvas rallyCanvas = tdsWebSmoothProgressBarV1View.IAuthTabCallbackStubProxy;
        if (i3 == 0) {
            return rallyCanvas;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View = (TdsWebSmoothProgressBarV1View) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 25;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        Paint paint = tdsWebSmoothProgressBarV1View.onNavigationEvent;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 21;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return paint;
    }

    public final void setShowing(boolean z) {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 23;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackDefault = z;
        int i5 = i2 + 29;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setNoMoreLoadingDelayTime(long j) {
        int i = 2 % 2;
        int i2 = extraCallback + 109;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.IAuthTabCallback_Parcel = j;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 93;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = IAuthTabCallback + 5;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onNavigationEvent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallback + 11;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                int i6 = 58 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class access100 implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public access100(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.onExtraCallback))) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class asBinder implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onNavigationEvent;

        public asBinder(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onExtraCallbackWithResult + 99;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                return getspecialfeatureoptinstatus2;
            }
            throw null;
        }
    }

    public static final class asInterface implements getAdService {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public asInterface(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallbackWithResult + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                int i6 = 55 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onTransact implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onTransact(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = IAuthTabCallback + 3;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 14 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallback implements Animator.AnimatorListener {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        public IAuthTabCallback() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            TdsWebSmoothProgressBarV1View.this.setVisibility(4);
            int i4 = onExtraCallbackWithResult + 35;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted implements Animator.AnimatorListener {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 80 / 0;
            }
        }

        public onWarmupCompleted() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onExtraCallback = i2 % 128;
            TdsWebSmoothProgressBarV1View.this.setVisibility(i2 % 2 == 0 ? 3 : 4);
        }
    }

    private static final boolean IAuthTabCallback(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View, Message message) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(message, "");
        int i2 = message.what;
        if (i2 == 1) {
            int i3 = readTypedObject + 49;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = message.arg1;
            Object obj = message.obj;
            Intrinsics.checkNotNull(obj, "");
            int iIntValue = ((Integer) obj).intValue();
            int iCeil = (int) Math.ceil((iIntValue - i5) / (message.arg2 / 16.0f));
            i = iIntValue > i5 ? 1 : 0;
            Handler handler = tdsWebSmoothProgressBarV1View.getInterfaceDescriptor;
            handler.sendMessage(handler.obtainMessage(2, iCeil, iIntValue, Integer.valueOf(i)));
        } else if (i2 == 2) {
            int progress = tdsWebSmoothProgressBarV1View.getProgress();
            int i6 = message.arg1;
            int i7 = message.arg2;
            Object obj2 = message.obj;
            Intrinsics.checkNotNull(obj2, "");
            Integer num = (Integer) obj2;
            int i8 = progress + i6;
            int iMin = num.intValue() == 1 ? Math.min(i7, i8) : Math.max(i7, i8);
            if (iMin == i7) {
                int i9 = readTypedObject + 83;
                extraCallback = i9 % 128;
                int i10 = i9 % 2;
                i = 1;
            }
            tdsWebSmoothProgressBarV1View.setProgress(iMin);
            tdsWebSmoothProgressBarV1View.invalidate();
            if (i == 0) {
                int i11 = extraCallback + 117;
                readTypedObject = i11 % 128;
                int i12 = i11 % 2;
                Handler handler2 = tdsWebSmoothProgressBarV1View.getInterfaceDescriptor;
                handler2.sendMessage(i12 == 0 ? handler2.obtainMessage(3, i6, i7, num) : handler2.obtainMessage(2, i6, i7, num));
                int i13 = readTypedObject + 111;
                extraCallback = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        return true;
    }

    public static final class getInterfaceDescriptor implements Runnable {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        getInterfaceDescriptor() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 59 / 0;
                if (!TdsWebSmoothProgressBarV1View.this.isAttachedToWindow()) {
                    return;
                }
            } else if (!TdsWebSmoothProgressBarV1View.this.isAttachedToWindow()) {
                return;
            }
            if (TdsWebSmoothProgressBarV1View.this.getWidth() > 0) {
                int i4 = onNavigationEvent + 61;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int height = TdsWebSmoothProgressBarV1View.this.getHeight();
                if (i5 != 0) {
                    int i6 = 88 / 0;
                    if (height <= 0) {
                        return;
                    }
                } else if (height <= 0) {
                    return;
                }
                if (TdsWebSmoothProgressBarV1View.asInterface(TdsWebSmoothProgressBarV1View.this) || TdsWebSmoothProgressBarV1View.asBinder(TdsWebSmoothProgressBarV1View.this)) {
                    return;
                }
                TdsWebSmoothProgressBarV1View.this.setShowing(true);
                TdsWebSmoothProgressBarV1View.this.setVisibility(0);
                TdsWebSmoothProgressBarV1View.IAuthTabCallbackDefault(TdsWebSmoothProgressBarV1View.this);
            }
        }
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallback + 65;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.IAuthTabCallbackDefault) {
                return;
            }
            this.asInterface = false;
            this.onTransact = false;
            this.extraCallbackWithResult.postDelayed(this.ICustomTabsCallback, Math.max(500L, this.IAuthTabCallback_Parcel));
            int i3 = readTypedObject + 55;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = extraCallback + 107;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        tdsWebSmoothProgressBarV1View.onWarmupCompleted = ((Float) animatedValue).floatValue();
        tdsWebSmoothProgressBarV1View.invalidate();
        int i4 = readTypedObject + 41;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ long $timeDiff;
        float F$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(long j, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$timeDiff = j;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = TdsWebSmoothProgressBarV1View.this.new onExtraCallback(this.$timeDiff, access13800Var);
            int i2 = onExtraCallback + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
                int i3 = 55 / 0;
            } else {
                objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            int i4 = onExtraCallback + 109;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 99;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback;
                int i4 = i3 + 123;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i3 + 11;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                float progress = TdsWebSmoothProgressBarV1View.this.getProgress() / TdsWebSmoothProgressBarV1View.this.getMax();
                TdsWebSmoothProgressBarV1View.onExtraCallback(TdsWebSmoothProgressBarV1View.this, -1L);
                if (progress >= 0.8f) {
                    TdsWebSmoothProgressBarV1View.onExtraCallbackWithResult(TdsWebSmoothProgressBarV1View.this).removeCallbacks(TdsWebSmoothProgressBarV1View.IAuthTabCallbackStub(TdsWebSmoothProgressBarV1View.this));
                    TdsWebSmoothProgressBarV1View.onTransact(TdsWebSmoothProgressBarV1View.this);
                    return Unit.INSTANCE;
                }
                long j = this.$timeDiff;
                this.F$0 = progress;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(j, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            TdsWebSmoothProgressBarV1View.onExtraCallbackWithResult(TdsWebSmoothProgressBarV1View.this).removeCallbacks(TdsWebSmoothProgressBarV1View.IAuthTabCallbackStub(TdsWebSmoothProgressBarV1View.this));
            TdsWebSmoothProgressBarV1View.this.onExtraCallback();
            return Unit.INSTANCE;
        }
    }

    private static final void onExtraCallback(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = extraCallback + 27;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            tdsWebSmoothProgressBarV1View.onWarmupCompleted = ((Float) animatedValue).floatValue();
            tdsWebSmoothProgressBarV1View.invalidate();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "");
        tdsWebSmoothProgressBarV1View.onWarmupCompleted = ((Float) animatedValue2).floatValue();
        tdsWebSmoothProgressBarV1View.invalidate();
        int i3 = extraCallback + 33;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 56 / 0;
        }
    }

    public final void onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = extraCallback + 109;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        int progress = getProgress();
        this.getInterfaceDescriptor.removeMessages(1);
        this.getInterfaceDescriptor.removeMessages(2);
        Handler handler = this.getInterfaceDescriptor;
        handler.sendMessage(handler.obtainMessage(1, progress, 300, Integer.valueOf(i)));
        int i5 = readTypedObject + 67;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View = (TdsWebSmoothProgressBarV1View) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallback + 41;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            tdsWebSmoothProgressBarV1View.asBinder = ((Float) animatedValue).floatValue();
            tdsWebSmoothProgressBarV1View.invalidate();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "");
        tdsWebSmoothProgressBarV1View.asBinder = ((Float) animatedValue2).floatValue();
        tdsWebSmoothProgressBarV1View.invalidate();
        int i3 = extraCallback + 21;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        this.writeTypedObject = System.currentTimeMillis();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.core.widget.TdsWebSmoothProgressBarV1View$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 125;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                TdsWebSmoothProgressBarV1View.IAuthTabCallback(this.f$0, valueAnimator);
                if (i4 != 0) {
                    int i5 = 72 / 0;
                }
            }
        });
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setInterpolator(Address.onNavigationEvent.asBinder());
        this.IAuthTabCallbackStub = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
        int i2 = extraCallback + 39;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 23;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        setVisibility(8);
        clearAnimation();
        this.getInterfaceDescriptor.removeCallbacksAndMessages(null);
        int i4 = extraCallback + 115;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onWarmupCompleted(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View, Canvas canvas) {
        float interpolation;
        float interpolation2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        if (tdsWebSmoothProgressBarV1View.onWarmupCompleted > 0.65d) {
            interpolation = deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent().getInterpolation(1.0f - ((tdsWebSmoothProgressBarV1View.onWarmupCompleted - 0.65f) / 0.35f));
            int i2 = extraCallback + 53;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
        } else {
            interpolation = 1.0f;
        }
        if (tdsWebSmoothProgressBarV1View.onWarmupCompleted > 0.65d) {
            int i4 = readTypedObject + 21;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            interpolation2 = deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent().getInterpolation(1.0f - ((tdsWebSmoothProgressBarV1View.onWarmupCompleted - 0.65f) / 0.7f));
        } else {
            interpolation2 = 1.0f;
        }
        canvas.scale(1.0f, interpolation2);
        int i6 = (int) (interpolation * 255.0f);
        tdsWebSmoothProgressBarV1View.getBackground().setAlpha(i6);
        tdsWebSmoothProgressBarV1View.getProgressDrawable().setAlpha(i6);
        tdsWebSmoothProgressBarV1View.getBackground().draw(canvas);
        tdsWebSmoothProgressBarV1View.getProgressDrawable().draw(canvas);
        Unit unit = Unit.INSTANCE;
        int i7 = extraCallback + 87;
        readTypedObject = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 73 / 0;
        }
        return unit;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = readTypedObject + 35;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        float progress = getProgress() / getMax();
        if (!(!this.onTransact)) {
            int i4 = readTypedObject + 29;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = (int) ((1.0f - this.onWarmupCompleted) * 255.0f);
            getBackground().setAlpha(i6);
            getProgressDrawable().setAlpha(i6);
            getBackground().draw(canvas);
            getProgressDrawable().draw(canvas);
            return;
        }
        if (this.asInterface) {
            this.access000.onNavigationEvent(canvas, new TdsWebSmoothProgressBarV1View$.ExternalSyntheticLambda0(this));
            onExtraCallback(canvas, progress);
            IAuthTabCallback(canvas);
            onExtraCallbackWithResult(canvas);
            return;
        }
        getBackground().setAlpha((int) (this.asBinder * 255.0f));
        getProgressDrawable().setAlpha((int) (this.asBinder * 255.0f));
        getBackground().draw(canvas);
        getProgressDrawable().draw(canvas);
    }

    private final void IAuthTabCallback(Canvas canvas) {
        float interpolation;
        float interpolation2;
        int i = 2 % 2;
        canvas.save();
        if (this.onWarmupCompleted <= 0.65d) {
            int i2 = extraCallback + 115;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            interpolation = Address.onNavigationEvent.asBinder().getInterpolation(this.onWarmupCompleted / 0.65f);
        } else {
            interpolation = deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent().getInterpolation(1.0f - ((this.onWarmupCompleted - 0.65f) / 0.35f));
        }
        if (this.onWarmupCompleted <= 0.65d) {
            interpolation2 = 1.0f;
        } else {
            interpolation2 = deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent().getInterpolation(1.0f - ((this.onWarmupCompleted - 0.65f) / 0.7f));
            int i4 = readTypedObject + 69;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        canvas.scale(1.0f, interpolation2);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (interpolation * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.onExtraCallbackWithResult);
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(Canvas canvas) {
        float interpolation;
        int i = 2 % 2;
        int i2 = readTypedObject + 63;
        extraCallback = i2 % 128;
        float interpolation2 = 1.0f;
        if (i2 % 2 != 0) {
            canvas.save();
            interpolation = ((double) this.onWarmupCompleted) <= 0.35d ? Address.onNavigationEvent.asBinder().getInterpolation(this.onWarmupCompleted / 0.35f) : deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent().getInterpolation(1.0f - ((this.onWarmupCompleted - 0.35f) / 0.65f));
        } else {
            canvas.save();
            if (this.onWarmupCompleted <= 0.35d) {
            }
        }
        if (this.onWarmupCompleted <= 0.65d) {
            int i3 = extraCallback + 79;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            interpolation2 = Address.onNavigationEvent.asBinder().getInterpolation(this.onWarmupCompleted / 0.65f);
            int i5 = readTypedObject + 71;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        canvas.scale(interpolation2, interpolation2);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (interpolation * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.onNavigationEvent);
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[PHI: r4
      0x0045: PHI (r4v14 float) = (r4v5 float), (r4v6 float), (r4v16 float) binds: [B:8:0x003b, B:10:0x003f, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r4
      0x003d: PHI (r4v6 float) = (r4v5 float), (r4v16 float) binds: [B:8:0x003b, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        float width;
        float f;
        float interpolation;
        TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View = (TdsWebSmoothProgressBarV1View) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        Canvas canvas = (Canvas) objArr[2];
        int i = 2 % 2;
        int i2 = readTypedObject + 117;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(canvas, "");
            width = tdsWebSmoothProgressBarV1View.getWidth();
            if (!tdsWebSmoothProgressBarV1View.asInterface) {
                if (tdsWebSmoothProgressBarV1View.onTransact) {
                    interpolation = 1.0f - deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent().getInterpolation(tdsWebSmoothProgressBarV1View.onWarmupCompleted);
                    int i3 = extraCallback + 27;
                    readTypedObject = i3 % 128;
                    int i4 = i3 % 2;
                    f = width;
                } else {
                    f = width;
                    interpolation = 1.0f;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(canvas, "");
            width = tdsWebSmoothProgressBarV1View.getWidth();
            if (!tdsWebSmoothProgressBarV1View.asInterface) {
            }
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, tdsWebSmoothProgressBarV1View.getWidth(), tdsWebSmoothProgressBarV1View.getHeight(), (int) (interpolation * 255.0f * tdsWebSmoothProgressBarV1View.asBinder));
        canvas.translate(f * ((fFloatValue * 1.5f) - 1.0f), 0.0f);
        canvas.drawCircle(tdsWebSmoothProgressBarV1View.getWidth() / 2.0f, tdsWebSmoothProgressBarV1View.getHeight() / 2.0f, tdsWebSmoothProgressBarV1View.getWidth() / 2.0f, tdsWebSmoothProgressBarV1View.IAuthTabCallback);
        Unit unit = Unit.INSTANCE;
        int i5 = extraCallback + 41;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 93 / 0;
        }
        return unit;
    }

    private final void onExtraCallback(Canvas canvas, float f) {
        int i = 2 % 2;
        canvas.save();
        Path path = new Path();
        path.addRect(0.0f, 0.0f, getWidth() * f, getHeight(), Path.Direction.CW);
        canvas.clipPath(path);
        this.IAuthTabCallbackStubProxy.onNavigationEvent(canvas, new TdsWebSmoothProgressBarV1View$.ExternalSyntheticLambda1(this, f));
        canvas.restore();
        int i2 = extraCallback + 27;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
      0x0021: PHI (r1v5 im.toss.tds.foundation.anim.rally.Rally) = (r1v4 im.toss.tds.foundation.anim.rally.Rally), (r1v12 im.toss.tds.foundation.anim.rally.Rally) binds: [B:8:0x001f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.ProgressBar, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDetachedFromWindow() {
        Rally rally;
        int i = 2 % 2;
        int i2 = extraCallback + 35;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDetachedFromWindow();
            rally = this.access100;
            int i3 = 10 / 0;
            if (rally != null) {
                rally.ICustomTabsServiceStub();
                int i4 = readTypedObject + 55;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            super.onDetachedFromWindow();
            rally = this.access100;
            if (rally != null) {
            }
        }
        ValueAnimator valueAnimator = this.IAuthTabCallbackStub;
        if (valueAnimator != null) {
            int i6 = extraCallback + 121;
            readTypedObject = i6 % 128;
            if (i6 % 2 != 0) {
                valueAnimator.cancel();
            } else {
                valueAnimator.cancel();
                int i7 = 27 / 0;
            }
        }
        this.extraCallbackWithResult.removeCallbacks(this.ICustomTabsCallback);
        this.getInterfaceDescriptor.removeCallbacksAndMessages(null);
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    private final void IAuthTabCallbackDefault() {
        int iICustomTabsCallback_Parcel;
        int iIAuthTabCallbackStub;
        int i = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (readIntokhttp.onExtraCallback(configuration)) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iICustomTabsCallback_Parcel = new getUrlokhttp(new IAuthTabCallbackDefault(configuration2)).getInterfaceDescriptor().extraCommand();
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration3 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            iICustomTabsCallback_Parcel = new getUrlokhttp(new IAuthTabCallbackStub(configuration3)).requestPostMessageChannel().ICustomTabsCallback_Parcel();
        }
        setBackgroundColor(iICustomTabsCallback_Parcel);
        if (isLaidOut()) {
            int i2 = readTypedObject + 89;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!isLayoutRequested()) {
                if (!isAttachedToWindow()) {
                    return;
                }
                int i4 = readTypedObject + 41;
                extraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    getWidth();
                    throw null;
                }
                if (getWidth() <= 0 || getHeight() <= 0) {
                    return;
                }
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                Configuration configuration4 = context4.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration4, "");
                int iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new asInterface(configuration4))}, -1612582679, 1612582689, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                RadialGradient radialGradient = new RadialGradient(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 4.0f, iIntValue, 0, tileMode);
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float width2 = getWidth() / 2.0f;
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                Resources resources2 = context5.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "");
                Configuration configuration5 = resources2.getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration5, "");
                if (readIntokhttp.onExtraCallback(configuration5)) {
                    Context context6 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "");
                    Configuration configuration6 = context6.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration6, "");
                    int iIntValue2 = ((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new asBinder(configuration6)).getInterfaceDescriptor()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue();
                    int i5 = extraCallback + 87;
                    readTypedObject = i5 % 128;
                    int i6 = i5 % 2;
                    iIAuthTabCallbackStub = iIntValue2;
                } else {
                    Context context7 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context7, "");
                    Configuration configuration7 = context7.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration7, "");
                    iIAuthTabCallbackStub = new getUrlokhttp(new onTransact(configuration7)).requestPostMessageChannel().IAuthTabCallbackStub();
                }
                RadialGradient radialGradient2 = new RadialGradient(width, height, width2, iIAuthTabCallbackStub, 0, tileMode);
                int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
                ((Paint) onExtraCallbackWithResult(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 47613948, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -47613946, new Object[]{this}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())).setShader(radialGradient);
                int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
                ((Paint) onExtraCallbackWithResult(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 510113453, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -510113452, new Object[]{this}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())).setShader(radialGradient2);
                IAuthTabCallback(this).setStyle(Paint.Style.FILL);
                Paint paintIAuthTabCallback = IAuthTabCallback(this);
                Context context8 = getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "");
                Configuration configuration8 = context8.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration8, "");
                paintIAuthTabCallback.setColor(new getUrlokhttp(new access100(configuration8)).IAuthTabCallbackDefault());
                float width3 = getWidth();
                Object[] objArr = {this, isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted(onWarmupCompleted(this), CollectionsKt.listOf(isMuted.IAuthTabCallback_Parcel((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(Address.onNavigationEvent.asInterface()), 1000}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), Float.valueOf(((-1.0f) * width3) / 2.0f), Float.valueOf(width3 / 2.0f), (Function1) null, 4, (Object) null)), -1, getExtraParameters.Normal, 100, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2016, (Object) null), false, 1, (Object) null)};
                onExtraCallbackWithResult(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1626143489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1626143494, objArr, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
                return;
            }
        }
        addOnLayoutChangeListener(new onExtraCallbackWithResult());
    }

    private final void onNavigationEvent() {
        int i = 2 % 2;
        if (!this.asInterface) {
            int i2 = extraCallback;
            int i3 = i2 + 47;
            readTypedObject = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this.onTransact) {
                return;
            }
            int i4 = i2 + 97;
            int i5 = i4 % 128;
            readTypedObject = i5;
            int i6 = i4 % 2;
            ValueAnimator valueAnimator = this.IAuthTabCallbackStub;
            if (valueAnimator != null) {
                int i7 = i5 + 11;
                extraCallback = i7 % 128;
                int i8 = i7 % 2;
                valueAnimator.end();
            }
            this.IAuthTabCallbackDefault = false;
            this.asInterface = false;
            this.onTransact = true;
            invalidate();
            Rally rally = this.access100;
            if (rally != null) {
                int i9 = extraCallback + 67;
                readTypedObject = i9 % 128;
                int i10 = i9 % 2;
                rally.ICustomTabsServiceStub();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new TdsWebSmoothProgressBarV1View$.ExternalSyntheticLambda4(this));
            deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
            valueAnimatorOfFloat.setDuration(deprecated_certificatepinner.onNavigationEvent().IAuthTabCallback());
            valueAnimatorOfFloat.setInterpolator(deprecated_certificatepinner.onNavigationEvent());
            valueAnimatorOfFloat.start();
            Intrinsics.checkNotNull(valueAnimatorOfFloat);
            valueAnimatorOfFloat.addListener(new IAuthTabCallback());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 android.animation.ValueAnimator) = (r1v4 android.animation.ValueAnimator), (r1v25 android.animation.ValueAnimator) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback() {
        ValueAnimator valueAnimator;
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
        int i = 2 % 2;
        int i2 = extraCallback + 27;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            valueAnimator = this.IAuthTabCallbackStub;
            int i3 = 74 / 0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        } else {
            valueAnimator = this.IAuthTabCallbackStub;
            if (valueAnimator != null) {
            }
        }
        this.extraCallbackWithResult.removeCallbacks(this.ICustomTabsCallback);
        if (this.IAuthTabCallbackDefault) {
            int i4 = readTypedObject + 121;
            int i5 = i4 % 128;
            extraCallback = i5;
            Object obj = null;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if ((!this.asInterface) && !this.onTransact) {
                int i6 = i5 + 105;
                readTypedObject = i6 % 128;
                int i7 = i6 % 2;
                long jCurrentTimeMillis = System.currentTimeMillis() - this.writeTypedObject;
                if (this.IAuthTabCallback_Parcel > 0) {
                    int i8 = readTypedObject;
                    int i9 = i8 + 99;
                    extraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    if (jCurrentTimeMillis < 500) {
                        int i11 = i8 + 69;
                        extraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
                        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult == null || (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult)) == null) {
                            return;
                        }
                        maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(jCurrentTimeMillis, null), 3, (Object) null);
                        return;
                    }
                }
                ValueAnimator valueAnimator2 = this.IAuthTabCallbackStub;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.IAuthTabCallbackDefault = false;
                this.asInterface = true;
                this.onTransact = false;
                Rally rally = this.access100;
                if (rally != null) {
                    rally.ICustomTabsServiceStub();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new TdsWebSmoothProgressBarV1View$.ExternalSyntheticLambda2(this));
                valueAnimatorOfFloat.setDuration(1000L);
                valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat.start();
                Intrinsics.checkNotNull(valueAnimatorOfFloat);
                valueAnimatorOfFloat.addListener(new onWarmupCompleted());
            }
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View, float f, Canvas canvas) {
        Object[] objArr = {tdsWebSmoothProgressBarV1View, Float.valueOf(f), canvas};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -116907378, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 116907382, objArr, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ Paint onExtraCallback(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Paint) onExtraCallbackWithResult(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 510113453, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -510113452, new Object[]{tdsWebSmoothProgressBarV1View}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ Paint onNavigationEvent(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Paint) onExtraCallbackWithResult(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 47613948, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -47613946, new Object[]{tdsWebSmoothProgressBarV1View}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ void onExtraCallback(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View, Rally rally) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onExtraCallbackWithResult(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1626143489, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1626143494, new Object[]{tdsWebSmoothProgressBarV1View, rally}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private static final Unit IAuthTabCallback(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View, float f, Canvas canvas) {
        Object[] objArr = {tdsWebSmoothProgressBarV1View, Float.valueOf(f), canvas};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1330699095, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1330699092, objArr, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private static final void IAuthTabCallbackDefault(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View, ValueAnimator valueAnimator) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onExtraCallbackWithResult(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -136139457, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 136139457, new Object[]{tdsWebSmoothProgressBarV1View, valueAnimator}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }
}
