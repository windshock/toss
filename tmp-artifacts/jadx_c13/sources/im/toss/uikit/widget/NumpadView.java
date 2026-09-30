package im.toss.uikit.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.zziea;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.tosscert.ui.R;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography1;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.uikit.widget.NumpadView;
import im.toss.uikit.widget.NumpadView$;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.AppLovinSdkSettings;
import o.M_;
import o.NetConverter3;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.clearNumber;
import o.clearSelinuxLabel;
import o.clearTid;
import o.deprecated_certificatePinner;
import o.deprecated_minFreshSeconds;
import o.ensureCausesIsMutable;
import o.getAdService;
import o.getMetrics;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.head;
import o.isFireOS;
import o.isMuted;
import o.isOneShot;
import o.noStore;
import o.readIntokhttp;
import o.setProtocolsokhttp;
import o.setVisitUrl;
import o.varyMatches;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NumpadView extends LinearLayout {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int IAuthTabCallback = 8;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 0;
    private static int access100 = 1;
    private static int getInterfaceDescriptor = 1;
    private ValueAnimator IAuthTabCallbackDefault;
    private Rally IAuthTabCallbackStub;
    private onWarmupCompleted asBinder;
    private boolean asInterface;
    private onExtraCallbackWithResult onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private Runnable onNavigationEvent;
    private int onTransact;
    private final getMetrics onWarmupCompleted;

    static {
        int i = getInterfaceDescriptor + 125;
        access000 = i % 128;
        if (i % 2 != 0) {
            int i2 = 20 / 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NumpadView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NumpadView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getMetrics getmetrics = (getMetrics) objArr[0];
        NumpadView numpadView = (NumpadView) objArr[1];
        head headVar = (head) objArr[2];
        View view = (View) objArr[3];
        MotionEvent motionEvent = (MotionEvent) objArr[4];
        int i = 2 % 2;
        int i2 = access100 + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(getmetrics, numpadView, headVar, view, motionEvent);
        int i4 = access100 + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zOnNavigationEvent);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(View view, NumpadView numpadView, Long l) {
        int i = 2 % 2;
        int i2 = access100 + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(view, numpadView, l);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(view, numpadView, l);
        int i3 = access100 + 123;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NumpadView numpadView, View view) {
        int i = 2 % 2;
        int i2 = access100 + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(numpadView, view);
        int i4 = IAuthTabCallbackStubProxy + 25;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, View view, View view2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, view, view2);
        int i4 = IAuthTabCallbackStubProxy + 65;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(getMetrics getmetrics, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = access100 + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(-1608253592, zziea.IAuthTabCallback(), new Object[]{getmetrics, valueAnimator}, 1608253597, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
            int i3 = 59 / 0;
        } else {
            onExtraCallback(-1608253592, zziea.IAuthTabCallback(), new Object[]{getmetrics, valueAnimator}, 1608253597, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
        }
        int i4 = IAuthTabCallbackStubProxy + 65;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i2);
        int i9 = (~(i7 | (~i2) | i3)) | (~(i3 | i | i2));
        int i10 = ~i3;
        int i11 = (~(i2 | i)) | (~(i10 | i2)) | (~(i10 | i));
        int i12 = i3 + i + i5 + (1698977638 * i6) + (1466394737 * i4);
        int i13 = i12 * i12;
        int i14 = (((-1250291696) * i3) - 490274816) + ((-1116082190) * i) + (i8 * (-67104753)) + ((-67104753) * i9) + (67104753 * i11) + ((-1183186944) * i5) + (1553727488 * i6) + (1859780608 * i4) + (925827072 * i13);
        int i15 = ((i3 * (-1787956080)) - 1478154965) + (i * (-1787955198)) + (i8 * (-441)) + (i9 * (-441)) + (i11 * 441) + (i5 * (-1787955639)) + (i6 * 552005654) + (i4 * (-2013897159)) + (i13 * (-429457408));
        switch (i14 + (i15 * i15 * (-402587648))) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                NumpadView numpadView = (NumpadView) objArr[0];
                int i16 = 2 % 2;
                int i17 = IAuthTabCallbackStubProxy + 53;
                access100 = i17 % 128;
                int i18 = i17 % 2;
                onExtraCallback(2136931238, zziea.IAuthTabCallback(), new Object[]{numpadView}, -2136931236, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
                int i19 = access100 + 43;
                IAuthTabCallbackStubProxy = i19 % 128;
                int i20 = i19 % 2;
                return null;
            case 7:
                return IAuthTabCallbackStub(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent(th);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(th);
        int i3 = access100 + 55;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(NumpadView numpadView, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onTransact(numpadView, view);
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        int i5 = access100 + 5;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NumpadView numpadView, int i, View view) {
        int i2 = 2 % 2;
        int i3 = access100 + 63;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(numpadView, i, view);
        int i5 = IAuthTabCallbackStubProxy + 21;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NumpadView numpadView, View view) {
        int i = 2 % 2;
        int i2 = access100 + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(numpadView, view);
        }
        onNavigationEvent(numpadView, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(1714076564, zziea.IAuthTabCallback(), new Object[]{function1, obj}, -1714076564, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
        int i4 = IAuthTabCallbackStubProxy + 107;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
        Unit unit;
        int i = 2 % 2;
        int i2 = access100 + 65;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            unit = (Unit) onExtraCallback(914114867, zziea.IAuthTabCallback(), new Object[]{view, suspendAnimationKtExternalSyntheticLambda4}, -914114866, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
            int i3 = 83 / 0;
        } else {
            unit = (Unit) onExtraCallback(914114867, zziea.IAuthTabCallback(), new Object[]{view, suspendAnimationKtExternalSyntheticLambda4}, -914114866, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
        }
        int i4 = access100 + 41;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return unit;
    }

    public static /* synthetic */ boolean onNavigationEvent(NumpadView numpadView, View view, Function1 function1, head headVar, View view2, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = access100 + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(numpadView, view, function1, headVar, view2, motionEvent);
        int i4 = access100 + 91;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 19;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumpadView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        Object[] objArr = {new getUrlokhttp(new asInterface(configuration))};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        this.onTransact = ((Integer) getUrlokhttp.onNavigationEvent(objArr, 2109422447, -2109422438, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
        this.onExtraCallback = onExtraCallbackWithResult.CLEAR;
        setOrientation(1);
        getMetrics getmetricsOnWarmupCompleted = getMetrics.onWarmupCompleted(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(getmetricsOnWarmupCompleted, "");
        this.onWarmupCompleted = getmetricsOnWarmupCompleted;
        setFocusable(true);
        setFocusableInTouchMode(true);
        onNavigationEvent();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NumpadView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallbackStubProxy + Imgproc.COLOR_YUV2RGBA_YVYU;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 42 / 0;
            }
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = IAuthTabCallbackStubProxy + 87;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void setRippleBackgroundColor(int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 25;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            this.onTransact = i;
            onNavigationEvent();
            int i4 = 82 / 0;
        } else {
            this.onTransact = i;
            onNavigationEvent();
        }
    }

    public final void setNumpadListener(@Nullable onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 45;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        this.asBinder = onwarmupcompleted;
        int i5 = i2 + 125;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setAnimating(boolean z) {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 115;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        this.asInterface = z;
        int i5 = i2 + 83;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class asInterface implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public asInterface(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onExtraCallback + 23;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        NumpadView numpadView = (NumpadView) objArr[0];
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 93;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = numpadView.onExtraCallback;
        int i5 = i2 + 23;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
        return onextracallbackwithresult;
    }

    public final void setExtraButtonType(@NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = access100 + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.onExtraCallback = onextracallbackwithresult;
        IAuthTabCallback(onextracallbackwithresult);
        int i4 = access100 + 97;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(NumpadView numpadView, View view) {
        int i = 2 % 2;
        int i2 = access100 + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        onWarmupCompleted onwarmupcompleted = numpadView.asBinder;
        if (onwarmupcompleted != null) {
            int i4 = access100 + 27;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            onwarmupcompleted.onWarmupCompleted();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(NumpadView numpadView, View view) {
        int i = 2 % 2;
        int i2 = access100 + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            onWarmupCompleted onwarmupcompleted = numpadView.asBinder;
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        onWarmupCompleted onwarmupcompleted2 = numpadView.asBinder;
        if (onwarmupcompleted2 != null) {
            onwarmupcompleted2.onExtraCallbackWithResult(2);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = access100 + 69;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onTransact(NumpadView numpadView, View view) {
        int i = 2 % 2;
        int i2 = access100 + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted onwarmupcompleted = numpadView.asBinder;
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (onwarmupcompleted != null) {
            onwarmupcompleted.onNavigationEvent();
            int i4 = IAuthTabCallbackStubProxy + 13;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void onNavigationEvent() {
        int i = 2 % 2;
        getMetrics getmetrics = this.onWarmupCompleted;
        onWarmupCompleted();
        Typography5 typography5 = getmetrics.access000;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        onWarmupCompleted((View) typography5, (Function1<? super View, Unit>) new NumpadView$.ExternalSyntheticLambda5(this));
        Typography1 typography1 = getmetrics.access100;
        Intrinsics.checkNotNullExpressionValue(typography1, "");
        onWarmupCompleted((View) typography1, (Function1<? super View, Unit>) new NumpadView$.ExternalSyntheticLambda6(this));
        getmetrics.IAuthTabCallbackStubProxy.setOnClickListener(new NumpadView$.ExternalSyntheticLambda7(this));
        getmetrics.IAuthTabCallbackStubProxy.setBackground(onExtraCallback());
        IAuthTabCallback iAuthTabCallback = Companion;
        TdsImageView tdsImageView = getmetrics.IAuthTabCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        getmetrics.IAuthTabCallbackStubProxy.setOnTouchListener(new NumpadView$.ExternalSyntheticLambda8(getmetrics, this, IAuthTabCallback.onWarmupCompleted(iAuthTabCallback, tdsImageView, 0.0f, 2, null)));
        int i2 = IAuthTabCallbackStubProxy + 55;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 60 / 0;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        int i5 = access100 + 93;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final Unit onExtraCallback(View view, NumpadView numpadView, Long l) {
        int i = 2 % 2;
        int i2 = access100 + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (!(!view.isPressed())) {
            int i4 = access100 + 3;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            numpadView.onExtraCallbackWithResult();
        }
        return Unit.INSTANCE;
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = access100 + 41;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
    }

    private static final Unit onNavigationEvent(Throwable th) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            unit = Unit.INSTANCE;
            int i3 = 60 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallbackStubProxy + 79;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final boolean onNavigationEvent(getMetrics getmetrics, NumpadView numpadView, head headVar, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 29;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (!getmetrics.IAuthTabCallbackStubProxy.isClickable()) {
            int i4 = access100 + 79;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            if (!view.isPressed()) {
                int i6 = IAuthTabCallbackStubProxy + 35;
                access100 = i6 % 128;
                int i7 = i6 % 2;
                if (numpadView.onExtraCallbackWithResult) {
                    onExtraCallback(-1244398092, zziea.IAuthTabCallback(), new Object[]{numpadView}, 1244398096, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
                }
                return false;
            }
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setPressed(true);
            Rally rally = numpadView.IAuthTabCallbackStub;
            if (rally != null) {
                rally.ICustomTabsServiceStub();
            }
            Intrinsics.checkNotNull(view);
            numpadView.IAuthTabCallbackStub = isFireOS.onExtraCallbackWithResult(numpadView.onNavigationEvent(view), false, 1, (Object) null);
            view.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
            writeRaw.onExtraCallback(200L, TimeUnit.MILLISECONDS).onNavigationEvent(clearTid.onExtraCallback()).IAuthTabCallback(NetConverter3.onExtraCallback()).onNavigationEvent(new NumpadView$.ExternalSyntheticLambda11(new NumpadView$.ExternalSyntheticLambda10(view, numpadView)), new NumpadView$.ExternalSyntheticLambda13(new NumpadView$.ExternalSyntheticLambda12()));
            headVar.onNavigationEvent(true);
            Intrinsics.checkNotNull(motionEvent);
            headVar.onNavigationEvent(motionEvent);
            return true;
        }
        if (action == 1) {
            Rally rally2 = numpadView.IAuthTabCallbackStub;
            if (rally2 != null) {
                rally2.ICustomTabsServiceStub();
            }
            Intrinsics.checkNotNull(view);
            numpadView.IAuthTabCallbackStub = isFireOS.onExtraCallbackWithResult(numpadView.onWarmupCompleted(view), false, 1, (Object) null);
            view.getBackground().setState(new int[0]);
            Object[] objArr = {noStore.Companion};
            int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
            isOneShot.onExtraCallbackWithResult(view, (noStore) noStore.onExtraCallback.onWarmupCompleted(objArr, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted));
            view.setPressed(false);
            numpadView.onExtraCallbackWithResult();
            onExtraCallback(-1244398092, zziea.IAuthTabCallback(), new Object[]{numpadView}, 1244398096, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
            headVar.onNavigationEvent(false);
            Intrinsics.checkNotNull(motionEvent);
            headVar.onNavigationEvent(motionEvent);
            return true;
        }
        int i8 = access100 + 101;
        int i9 = i8 % 128;
        IAuthTabCallbackStubProxy = i9;
        if (i8 % 2 == 0 ? action != 3 : action != 4) {
            if (action != 4) {
                int i10 = i9 + Imgproc.COLOR_YUV2RGB_YVYU;
                access100 = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
        }
        Rally rally3 = numpadView.IAuthTabCallbackStub;
        if (rally3 != null) {
            int i12 = i9 + 41;
            access100 = i12 % 128;
            int i13 = i12 % 2;
            rally3.ICustomTabsServiceStub();
        }
        Intrinsics.checkNotNull(view);
        numpadView.IAuthTabCallbackStub = isFireOS.onExtraCallbackWithResult(numpadView.onWarmupCompleted(view), false, 1, (Object) null);
        view.getBackground().setState(new int[0]);
        view.setPressed(false);
        onExtraCallback(-1244398092, zziea.IAuthTabCallback(), new Object[]{numpadView}, 1244398096, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
        headVar.onNavigationEvent(false);
        Intrinsics.checkNotNull(motionEvent);
        headVar.onNavigationEvent(motionEvent);
        return true;
    }

    private static final Unit IAuthTabCallback(NumpadView numpadView, int i, View view) {
        int i2 = 2 % 2;
        int i3 = access100 + 17;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        onWarmupCompleted onwarmupcompleted = numpadView.asBinder;
        if (onwarmupcompleted != null) {
            int i5 = IAuthTabCallbackStubProxy + 65;
            access100 = i5 % 128;
            if (i5 % 2 == 0) {
                onwarmupcompleted.onNavigationEvent(i);
                throw null;
            }
            onwarmupcompleted.onNavigationEvent(i);
        }
        return Unit.INSTANCE;
    }

    private final void onWarmupCompleted() {
        int i = 2 % 2;
        getMetrics getmetrics = this.onWarmupCompleted;
        int i2 = 0;
        Sequence sequenceOnExtraCallback = clearSelinuxLabel.onExtraCallback((Object[]) new Typography1[]{getmetrics.onWarmupCompleted, getmetrics.IAuthTabCallback, getmetrics.onExtraCallback, getmetrics.onNavigationEvent, getmetrics.onExtraCallbackWithResult, getmetrics.asInterface, getmetrics.IAuthTabCallbackDefault, getmetrics.onTransact, getmetrics.asBinder, getmetrics.IAuthTabCallbackStub});
        Iterator itIAuthTabCallback = sequenceOnExtraCallback.IAuthTabCallback();
        int i3 = access100 + 95;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        while (itIAuthTabCallback.hasNext()) {
            int i5 = access100 + 123;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            Object next = itIAuthTabCallback.next();
            if (i2 < 0) {
                int i7 = access100 + 83;
                IAuthTabCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                int i9 = IAuthTabCallbackStubProxy + 87;
                access100 = i9 % 128;
                int i10 = i9 % 2;
            }
            Typography1 typography1 = (Typography1) next;
            Intrinsics.checkNotNull(typography1);
            onWarmupCompleted((View) typography1, (Function1<? super View, Unit>) new NumpadView$.ExternalSyntheticLambda1(this, i2));
            i2++;
        }
        Typography5 typography5 = getmetrics.access000;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        Typography1 typography12 = getmetrics.access100;
        Intrinsics.checkNotNullExpressionValue(typography12, "");
        TdsImageView tdsImageView = getmetrics.IAuthTabCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        Iterator itIAuthTabCallback2 = ensureCausesIsMutable.onWarmupCompleted(sequenceOnExtraCallback, clearNumber.asBinder(typography5, typography12, tdsImageView)).IAuthTabCallback();
        while (itIAuthTabCallback2.hasNext()) {
            setProtocolsokhttp.IAuthTabCallback((View) itIAuthTabCallback2.next(), new NumpadView$.ExternalSyntheticLambda2());
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4 = (SuspendAnimationKtExternalSyntheticLambda4) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (suspendAnimationKtExternalSyntheticLambda4 != null) {
            suspendAnimationKtExternalSyntheticLambda4.onMessageChannelReady(true);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 23;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(@NotNull Configuration configuration) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        asBinder();
        int i4 = IAuthTabCallbackStubProxy + 39;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult) {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 33;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        getMetrics getmetrics = this.onWarmupCompleted;
        int i5 = onNavigationEvent.onExtraCallback[onextracallbackwithresult.ordinal()];
        int i6 = 0;
        boolean z = true;
        if (i5 != 1) {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i7 = IAuthTabCallbackStubProxy + 125;
            access100 = i7 % 128;
            if (i7 % 2 != 0) {
                z = false;
            }
        }
        Typography5 typography5 = getmetrics.access000;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        if (z) {
            i = 8;
        } else {
            int i8 = access100 + 119;
            IAuthTabCallbackStubProxy = i8 % 128;
            int i9 = i8 % 2;
            i = 0;
        }
        typography5.setVisibility(i);
        Typography1 typography1 = getmetrics.access100;
        Intrinsics.checkNotNullExpressionValue(typography1, "");
        if (!z) {
            int i10 = IAuthTabCallbackStubProxy + 67;
            access100 = i10 % 128;
            int i11 = i10 % 2;
            i6 = 8;
        } else {
            int i12 = access100 + 93;
            IAuthTabCallbackStubProxy = i12 % 128;
            int i13 = i12 % 2;
        }
        typography1.setVisibility(i6);
        getmetrics.IAuthTabCallbackStubProxy.setAlpha(z ? 1.0f : 0.0f);
        getmetrics.IAuthTabCallbackStubProxy.setClickable(z);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        NumpadView numpadView = (NumpadView) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        int i3 = i2 % 128;
        access100 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted onwarmupcompleted = numpadView.asBinder;
            if (onwarmupcompleted != null) {
                int i4 = i3 + 51;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 == 0) {
                    onwarmupcompleted.onNavigationEvent();
                } else {
                    onwarmupcompleted.onNavigationEvent();
                    throw null;
                }
            }
            Handler handler = numpadView.getHandler();
            Runnable runnable = numpadView.onNavigationEvent;
            Intrinsics.checkNotNull(runnable);
            handler.postDelayed(runnable, 30L);
            return null;
        }
        onWarmupCompleted onwarmupcompleted2 = numpadView.asBinder;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        if (this.onExtraCallbackWithResult) {
            return;
        }
        int i2 = IAuthTabCallbackStubProxy + 11;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        this.onExtraCallbackWithResult = true;
        onWarmupCompleted onwarmupcompleted = this.asBinder;
        if (onwarmupcompleted != null) {
            int i5 = i3 + 51;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                onwarmupcompleted.onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onwarmupcompleted.onNavigationEvent();
        }
        this.onNavigationEvent = new NumpadView$.ExternalSyntheticLambda9(this);
        Handler handler = getHandler();
        Runnable runnable = this.onNavigationEvent;
        Intrinsics.checkNotNull(runnable);
        handler.postDelayed(runnable, 300L);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        NumpadView numpadView = (NumpadView) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        numpadView.onExtraCallbackWithResult = false;
        Runnable runnable = numpadView.onNavigationEvent;
        if (runnable != null) {
            numpadView.getHandler().removeCallbacks(runnable);
            int i4 = access100 + 23;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        numpadView.onNavigationEvent = null;
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        super.onDetachedFromWindow();
        Runnable runnable = this.onNavigationEvent;
        if (runnable != null) {
            int i2 = access100 + 89;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                getHandler().removeCallbacks(runnable);
                throw null;
            }
            getHandler().removeCallbacks(runnable);
            int i3 = access100 + 91;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public final void onExtraCallbackWithResult(boolean z) {
        float f;
        int i = 2 % 2;
        int i2 = access100 + 73;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        getMetrics getmetrics = this.onWarmupCompleted;
        ValueAnimator valueAnimator = this.IAuthTabCallbackDefault;
        if (valueAnimator != null) {
            int i5 = i3 + 59;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            valueAnimator.cancel();
            int i7 = IAuthTabCallbackStubProxy + 125;
            access100 = i7 % 128;
            int i8 = i7 % 2;
        }
        float alpha = getmetrics.IAuthTabCallbackStubProxy.getAlpha();
        if (z) {
            int i9 = access100 + 59;
            IAuthTabCallbackStubProxy = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 3 / 5;
            }
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(alpha, f);
        valueAnimatorOfFloat.addUpdateListener(new NumpadView$.ExternalSyntheticLambda0(getmetrics));
        valueAnimatorOfFloat.addListener(new onExtraCallback(z, getmetrics));
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.start();
        this.IAuthTabCallbackDefault = valueAnimatorOfFloat;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getMetrics getmetrics = (getMetrics) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        getmetrics.IAuthTabCallbackStubProxy.setAlpha(fFloatValue);
        getmetrics.access000.setAlpha(fFloatValue);
        int i4 = IAuthTabCallbackStubProxy + 35;
        access100 = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback extends AnimatorListenerAdapter {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ boolean IAuthTabCallback;
        final /* synthetic */ getMetrics onWarmupCompleted;

        onExtraCallback(boolean z, getMetrics getmetrics) {
            this.IAuthTabCallback = z;
            this.onWarmupCompleted = getmetrics;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(animator, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(animator, "");
            if (this.IAuthTabCallback) {
                this.onWarmupCompleted.IAuthTabCallbackStubProxy.setClickable(true);
                this.onWarmupCompleted.access000.setClickable(true);
            }
            int i3 = onExtraCallback + 3;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            if (this.IAuthTabCallback) {
                return;
            }
            int i4 = onExtraCallback + 107;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            this.onWarmupCompleted.IAuthTabCallbackStubProxy.setClickable(false);
            Typography5 typography5 = this.onWarmupCompleted.access000;
            typography5.setClickable(false);
            typography5.setPressed(false);
            int i6 = onExtraCallbackWithResult + 43;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static final void onNavigationEvent(Function1 function1, View view, View view2) {
        int i = 2 % 2;
        int i2 = access100 + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(view);
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        int i5 = access100 + 67;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
    }

    private final void onWarmupCompleted(View view, Function1<? super View, Unit> function1) {
        int i = 2 % 2;
        view.setBackground(onExtraCallback());
        head headVarOnWarmupCompleted = IAuthTabCallback.onWarmupCompleted(Companion, view, 0.0f, 2, null);
        view.setOnClickListener(new NumpadView$.ExternalSyntheticLambda3(function1, view));
        view.setOnTouchListener(new NumpadView$.ExternalSyntheticLambda4(this, view, function1, headVarOnWarmupCompleted));
        int i2 = IAuthTabCallbackStubProxy + 107;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final boolean onWarmupCompleted(NumpadView numpadView, View view, Function1 function1, head headVar, View view2, MotionEvent motionEvent) {
        int i = 2 % 2;
        int action = motionEvent.getAction();
        Object obj = null;
        if (action == 0) {
            view2.setPressed(true);
            Rally rally = numpadView.IAuthTabCallbackStub;
            if (rally != null) {
                int i2 = IAuthTabCallbackStubProxy + Imgproc.COLOR_YUV2RGB_YVYU;
                access100 = i2 % 128;
                if (i2 % 2 == 0) {
                    rally.ICustomTabsServiceStub();
                    int i3 = 67 / 0;
                } else {
                    rally.ICustomTabsServiceStub();
                }
            }
            Intrinsics.checkNotNull(view2);
            numpadView.IAuthTabCallbackStub = isFireOS.onExtraCallbackWithResult(numpadView.onNavigationEvent(view2), false, 1, (Object) null);
            view.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
        } else if (action != 1) {
            int i4 = access100 + 75;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0 ? action == 3 : action == 3) {
                view2.setPressed(false);
                Rally rally2 = numpadView.IAuthTabCallbackStub;
                if (rally2 != null) {
                    int i5 = IAuthTabCallbackStubProxy + 11;
                    access100 = i5 % 128;
                    if (i5 % 2 == 0) {
                        rally2.ICustomTabsServiceStub();
                        obj.hashCode();
                        throw null;
                    }
                    rally2.ICustomTabsServiceStub();
                }
                Intrinsics.checkNotNull(view2);
                numpadView.IAuthTabCallbackStub = isFireOS.onExtraCallbackWithResult(numpadView.onWarmupCompleted(view2), false, 1, (Object) null);
                view.getBackground().setState(new int[0]);
            }
        } else {
            float width = view2.getWidth();
            float x = motionEvent.getX();
            if (0.0f <= x && x <= width) {
                float height = view2.getHeight();
                float y = motionEvent.getY();
                if (0.0f <= y && y <= height) {
                    Intrinsics.checkNotNull(view2);
                    isOneShot.onExtraCallbackWithResult(view2, (noStore) noStore.onExtraCallback.onWarmupCompleted(new Object[]{noStore.Companion}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted()));
                    function1.invoke(view2);
                }
            }
            view2.setPressed(false);
            Rally rally3 = numpadView.IAuthTabCallbackStub;
            if (rally3 != null) {
                rally3.ICustomTabsServiceStub();
                int i6 = IAuthTabCallbackStubProxy + 35;
                access100 = i6 % 128;
                int i7 = i6 % 2;
            }
            Intrinsics.checkNotNull(view2);
            numpadView.IAuthTabCallbackStub = isFireOS.onExtraCallbackWithResult(numpadView.onWarmupCompleted(view2), false, 1, (Object) null);
            view.getBackground().setState(new int[0]);
        }
        headVar.onNavigationEvent(view2.isPressed());
        Intrinsics.checkNotNull(motionEvent);
        headVar.onNavigationEvent(motionEvent);
        return true;
    }

    private final Rally onWarmupCompleted(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onWarmupCompleted()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        Float fValueOf = Float.valueOf(0.5f);
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.access000(isMuted.asInterface(appLovinSdkSettings, (Float) null, fValueOf, (Function1) null, 5, (Object) null), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        int i4 = IAuthTabCallbackStubProxy + 15;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return rally;
    }

    private final Rally onNavigationEvent(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        Float fValueOf = Float.valueOf(0.5f);
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.access000(isMuted.asInterface(appLovinSdkSettings, (Float) null, fValueOf, (Function1) null, 5, (Object) null), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        int i4 = access100 + 77;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return rally;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Drawable onExtraCallback() {
        RippleDrawable rippleDrawable;
        int i = 2 % 2;
        int i2 = access100 + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        M_ m_ = M_.onExtraCallback;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Intrinsics.checkNotNullExpressionValue(getContext().getResources().getDisplayMetrics(), "");
        RippleDrawable rippleDrawable2 = (deprecated_minFreshSeconds) M_.onNavigationEvent(-556734050, new Object[]{m_, context, Float.valueOf(varyMatches.onNavigationEvent(20, r4))}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 556734051, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
        if (rippleDrawable2 != null) {
            rippleDrawable = rippleDrawable2;
        } else {
            int i4 = IAuthTabCallbackStubProxy + 105;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            rippleDrawable = null;
        }
        if (rippleDrawable != null) {
            rippleDrawable.setColor(ColorStateList.valueOf(this.onTransact));
        }
        return rippleDrawable2;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = access100 + 11;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            isEnabled();
            obj.hashCode();
            throw null;
        }
        if (isEnabled() && !this.asInterface) {
            int i3 = IAuthTabCallbackStubProxy + 81;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = IAuthTabCallbackStubProxy + 75;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult(View view, float f, boolean z) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = onNavigationEvent(view, f, z);
            int i4 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 24 / 0;
            }
            return appLovinSdkSettingsOnNavigationEvent;
        }

        private IAuthTabCallback() {
        }

        public static /* synthetic */ head onWarmupCompleted(IAuthTabCallback iAuthTabCallback, View view, float f, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 83;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 4) != 0) {
                int i5 = i4 + 21;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 31;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                f = 0.92f;
            }
            return iAuthTabCallback.onNavigationEvent(view, f);
        }

        public final head onNavigationEvent(@NotNull final View view, final float f) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            head headVar = new head(view, (View) null, false, new Function1() { // from class: im.toss.uikit.widget.NumpadView$Companion$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = NumpadView.IAuthTabCallback.onExtraCallbackWithResult(view, f, ((Boolean) obj).booleanValue());
                    int i5 = onExtraCallbackWithResult + 11;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return appLovinSdkSettingsOnExtraCallbackWithResult;
                }
            }, 6, (DefaultConstructorMarker) null);
            int i2 = IAuthTabCallback + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return headVar;
        }

        private static final AppLovinSdkSettings onNavigationEvent(View view, float f, boolean z) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
            AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{!z ? deprecated_certificatepinner.onNavigationEvent() : deprecated_certificatepinner.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
            float scaleX = view.getScaleX();
            if (!z) {
                int i4 = IAuthTabCallback;
                int i5 = i4 + 67;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 11;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                f = 1.0f;
            }
            return isMuted.asBinder(appLovinSdkSettings, Float.valueOf(scaleX), Float.valueOf(f), (Function1) null, 4, (Object) null);
        }
    }

    private final void asBinder() throws Resources.NotFoundException {
        int i = 2 % 2;
        getMetrics getmetrics = this.onWarmupCompleted;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(im.toss.uikit.R.dimen.numpad_line_height);
        Iterator itIAuthTabCallback = clearSelinuxLabel.onExtraCallback((Object[]) new LinearLayout[]{getmetrics.getInterfaceDescriptor, getmetrics.IAuthTabCallback_Parcel, getmetrics.writeTypedObject, getmetrics.extraCallbackWithResult}).IAuthTabCallback();
        int i2 = access100 + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        while (itIAuthTabCallback.hasNext()) {
            int i4 = access100 + 69;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            LinearLayout linearLayout = (LinearLayout) itIAuthTabCallback.next();
            Intrinsics.checkNotNull(linearLayout);
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = dimensionPixelSize;
            linearLayout.setLayoutParams(layoutParams);
        }
    }

    private static final void onNavigationEvent(getMetrics getmetrics, ValueAnimator valueAnimator) {
        onExtraCallback(-1608253592, zziea.IAuthTabCallback(), new Object[]{getmetrics, valueAnimator}, 1608253597, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        onExtraCallback(1714076564, zziea.IAuthTabCallback(), new Object[]{function1, obj}, -1714076564, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
    }

    private static final Unit onExtraCallbackWithResult(View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
        return (Unit) onExtraCallback(914114867, zziea.IAuthTabCallback(), new Object[]{view, suspendAnimationKtExternalSyntheticLambda4}, -914114866, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
    }

    private static final void onWarmupCompleted(NumpadView numpadView) {
        onExtraCallback(2136931238, zziea.IAuthTabCallback(), new Object[]{numpadView}, -2136931236, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
    }

    private final void onTransact() {
        onExtraCallback(-1244398092, zziea.IAuthTabCallback(), new Object[]{this}, 1244398096, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
    }

    public final onExtraCallbackWithResult IAuthTabCallback() {
        return (onExtraCallbackWithResult) onExtraCallback(135165286, zziea.IAuthTabCallback(), new Object[]{this}, -135165279, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
    }
}
