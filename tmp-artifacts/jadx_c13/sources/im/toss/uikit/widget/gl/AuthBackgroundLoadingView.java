package im.toss.uikit.widget.gl;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.R;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFk1ySDK;
import o.Address;
import o.AppLovinSdkSettings;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.InstallReferrerClientInstallReferrerResponse;
import o.addErrorStateInfobugsnag_plugin_android_anr_release;
import o.attachAppLovinSdk;
import o.deprecated_dns;
import o.generateLink;
import o.getExtraParameters;
import o.isFireOS;
import o.isMuted;
import o.nSetPosition;
import o.pxToDp;
import o.runOnUiThreadDelayed;
import o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AuthBackgroundLoadingView extends ConstraintLayout {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int extraCallbackWithResult = 1;
    private ValueAnimator IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private runOnUiThreadDelayed IAuthTabCallback_Parcel;
    private Rally asBinder;
    private final Lazy asInterface;
    private final Lazy getInterfaceDescriptor;
    private AFk1ySDK onExtraCallback;
    private addErrorStateInfobugsnag_plugin_android_anr_release onExtraCallbackWithResult;
    private final onExtraCallback onNavigationEvent;
    private ValueAnimator onTransact;
    private FragmentActivity onWarmupCompleted;
    private static char[] access100 = {64989, 64988, 64971, 64926, 64986, 64987, 64979, 64982, 64976, 64984, 64991, 64960, 64961, 64978, 64897, 64905, 64980, 64977, 64924, 64925, 64990, 64963, 64981, 64967, 64983};
    private static char access000 = 51244;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthBackgroundLoadingView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthBackgroundLoadingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ int onExtraCallback(AuthBackgroundLoadingView authBackgroundLoadingView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 77;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            return ((Integer) onExtraCallback(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, -532500757, new Object[]{authBackgroundLoadingView}, iOnWarmupCompleted3, 532500757)).intValue();
        }
        int iOnWarmupCompleted4 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted5 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted6 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        ((Integer) onExtraCallback(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted5, iOnWarmupCompleted4, -532500757, new Object[]{authBackgroundLoadingView}, iOnWarmupCompleted6, 532500757)).intValue();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = (~(i7 | i3)) | i6;
        int i9 = (~(i7 | (~i3))) | (~((~i6) | i7)) | (~(i6 | i4 | i3));
        int i10 = ~(i3 | i6);
        int i11 = i6 + i4 + i2 + ((-813770285) * i5) + (135932771 * i);
        int i12 = i11 * i11;
        int i13 = (526900465 * i6) + 74317824 + ((-1745228167) * i4) + ((-249289968) * i8) + (2022838664 * i9) + ((-2022838664) * i10) + (277610496 * i2) + (1331953664 * i5) + ((-366739456) * i) + ((-1308753920) * i12);
        int i14 = (i6 * 1149714451) + 247108311 + (i4 * 1149714091) + (i8 * (-720)) + (i9 * (-360)) + (i10 * 360) + (i2 * 1149713731) + (i5 * 1918847289) + (i * (-2006650391)) + (i12 * 460980224);
        int i15 = i13 + (i14 * i14 * (-1418592256));
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? i15 != 4 ? i15 != 5 ? onExtraCallback(objArr) : asBinder(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AuthBackgroundLoadingView authBackgroundLoadingView, GLSurfaceView gLSurfaceView, float f) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 97;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {authBackgroundLoadingView, gLSurfaceView, Float.valueOf(f)};
            unit = (Unit) onExtraCallback(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -1425938199, objArr, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1425938202);
            int i3 = 57 / 0;
        } else {
            Object[] objArr2 = {authBackgroundLoadingView, gLSurfaceView, Float.valueOf(f)};
            unit = (Unit) onExtraCallback(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -1425938199, objArr2, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1425938202);
        }
        int i4 = extraCallbackWithResult + 69;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AuthBackgroundLoadingView authBackgroundLoadingView = (AuthBackgroundLoadingView) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        float fFloatValue2 = ((Number) objArr[2]).floatValue();
        float fFloatValue3 = ((Number) objArr[3]).floatValue();
        float fFloatValue4 = ((Number) objArr[4]).floatValue();
        float fFloatValue5 = ((Number) objArr[5]).floatValue();
        ValueAnimator valueAnimator = (ValueAnimator) objArr[6];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(authBackgroundLoadingView, fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, fFloatValue5, valueAnimator);
        int i4 = IAuthTabCallbackStubProxy + 15;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Resources.NotFoundException {
        Context context = (Context) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback(context);
            obj.hashCode();
            throw null;
        }
        float fIAuthTabCallback = IAuthTabCallback(context);
        int i3 = IAuthTabCallbackStubProxy + Imgproc.COLOR_YUV2RGBA_YVYU;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return Float.valueOf(fIAuthTabCallback);
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AuthBackgroundLoadingView authBackgroundLoadingView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 105;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return access100(authBackgroundLoadingView);
        }
        access100(authBackgroundLoadingView);
        throw null;
    }

    public static final class access000 implements View.OnLayoutChangeListener {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ AFk1ySDK IAuthTabCallback;

        public access000(AFk1ySDK aFk1ySDK) {
            this.IAuthTabCallback = aFk1ySDK;
        }

        /* JADX WARN: Type inference failed for: r2v8, types: [android.view.View, im.toss.uikit.widget.gl.AuthBackgroundLoadingView] */
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = onExtraCallback + 73;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            Float fValueOf = Float.valueOf(1.0f);
            Float fValueOf2 = Float.valueOf(0.0f);
            view.removeOnLayoutChangeListener(this);
            float fAsInterface = AuthBackgroundLoadingView.asInterface(AuthBackgroundLoadingView.this);
            AuthBackgroundLoadingView.onWarmupCompleted(AuthBackgroundLoadingView.this, false);
            AuthBackgroundLoadingView.onWarmupCompleted(AuthBackgroundLoadingView.this, fAsInterface);
            runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallbackStub = AuthBackgroundLoadingView.IAuthTabCallbackStub(AuthBackgroundLoadingView.this);
            if (runonuithreaddelayedIAuthTabCallbackStub != null) {
                int i12 = onExtraCallbackWithResult + 43;
                onExtraCallback = i12 % 128;
                if (i12 % 2 == 0) {
                    runonuithreaddelayedIAuthTabCallbackStub.onNavigationEvent();
                } else {
                    runonuithreaddelayedIAuthTabCallbackStub.onNavigationEvent();
                    int i13 = 47 / 0;
                }
            }
            AuthBackgroundLoadingView authBackgroundLoadingView = AuthBackgroundLoadingView.this;
            pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.IAuthTabCallback);
            getExtraParameters getextraparameters = getExtraParameters.Normal;
            AuthBackgroundLoadingView.onNavigationEvent(authBackgroundLoadingView, RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{RallysKt.IAuthTabCallback(onwarmupcompleted, isMuted.onExtraCallback(isMuted.getInterfaceDescriptor(isMuted.onWarmupCompleted(isMuted.onTransact(new AppLovinSdkSettings(), fValueOf2, fValueOf, asInterface.onWarmupCompleted), Float.valueOf(100.0f), Float.valueOf(-60.0f), IAuthTabCallbackDefault.onWarmupCompleted), Float.valueOf(fAsInterface), Float.valueOf((fAsInterface - AuthBackgroundLoadingView.asInterface(AuthBackgroundLoadingView.this)) - (AuthBackgroundLoadingView.onNavigationEvent(AuthBackgroundLoadingView.this) / 4.0f)), onTransact.onWarmupCompleted), fValueOf, fValueOf2, IAuthTabCallbackStub.onExtraCallback), -1, getextraparameters, 1800, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2016, (Object) null), RallysKt.IAuthTabCallback(new asBinder(this.IAuthTabCallback), isMuted.onExtraCallback(isMuted.getInterfaceDescriptor(isMuted.onWarmupCompleted(isMuted.onTransact(new AppLovinSdkSettings(), fValueOf2, fValueOf, IAuthTabCallback_Parcel.onExtraCallbackWithResult), Float.valueOf(60.0f), Float.valueOf(-100.0f), getInterfaceDescriptor.onNavigationEvent), Float.valueOf(fAsInterface), Float.valueOf((fAsInterface - AuthBackgroundLoadingView.asInterface(AuthBackgroundLoadingView.this)) - (AuthBackgroundLoadingView.onNavigationEvent(AuthBackgroundLoadingView.this) / 4.0f)), IAuthTabCallbackStubProxy.onWarmupCompleted), fValueOf, fValueOf2, onNavigationEvent.onExtraCallback), -1, getextraparameters, 1800, (Interpolator) null, (Integer) null, (Boolean) null, 2000, 0L, false, 1760, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null));
            ?? r2 = AuthBackgroundLoadingView.this;
            r2.postDelayed(new IAuthTabCallback(), 1000L);
            int i14 = onExtraCallbackWithResult + 27;
            onExtraCallback = i14 % 128;
            int i15 = i14 % 2;
        }
    }

    public static final class access100 implements View.OnLayoutChangeListener {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public access100() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = onExtraCallback + 23;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            AnimateMaskedImageView animateMaskedImageView = AuthBackgroundLoadingView.IAuthTabCallback(AuthBackgroundLoadingView.this).onExtraCallback;
            Intrinsics.checkNotNull(animateMaskedImageView);
            AnimateMaskedImageView.setRenderer$default(animateMaskedImageView, AuthBackgroundLoadingView.onNavigationEvent(AuthBackgroundLoadingView.this), false, 2, null);
            animateMaskedImageView.setImageUrl(AuthBackgroundLoadingView.onExtraCallbackWithResult(AuthBackgroundLoadingView.this), AuthBackgroundLoadingView.onNavigationEvent(AuthBackgroundLoadingView.this), AuthBackgroundLoadingView.onNavigationEvent(AuthBackgroundLoadingView.this));
            AnimateMaskedImageView animateMaskedImageView2 = AuthBackgroundLoadingView.IAuthTabCallback(AuthBackgroundLoadingView.this).onWarmupCompleted;
            Intrinsics.checkNotNull(animateMaskedImageView2);
            AnimateMaskedImageView.setRenderer$default(animateMaskedImageView2, AuthBackgroundLoadingView.onNavigationEvent(AuthBackgroundLoadingView.this), false, 2, null);
            animateMaskedImageView2.setImageUrl(AuthBackgroundLoadingView.onExtraCallbackWithResult(AuthBackgroundLoadingView.this), AuthBackgroundLoadingView.onNavigationEvent(AuthBackgroundLoadingView.this), AuthBackgroundLoadingView.onNavigationEvent(AuthBackgroundLoadingView.this));
            int i12 = onExtraCallbackWithResult + 103;
            onExtraCallback = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 51 / 0;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuthBackgroundLoadingView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) throws Throwable {
        String strIntern;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AFk1ySDK aFk1ySDKIAuthTabCallback = AFk1ySDK.IAuthTabCallback(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(aFk1ySDKIAuthTabCallback, "");
        this.onExtraCallback = aFk1ySDKIAuthTabCallback;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        if (generateLink.IAuthTabCallback(resources)) {
            Object[] objArr = new Object[1];
            a(new char[]{'\b', 20, 24, 22, '\n', 16, 13872, 13872, '\r', 21, 18, 3, 3, '\t', 18, 24, 6, 16, 14, 16, 0, 24, 19, 3, 3, 17, 24, 1, 3, 15, 23, 14, 14, 7, 2, 23, 18, '\r', '\t', 2, 23, 4, 14, 2, 1, 15, 4, '\r', 16, 24, 1, 15}, (byte) (124 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 51 - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET), objArr);
            strIntern = ((String) objArr[0]).intern();
            int i2 = IAuthTabCallbackStubProxy + 67;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        } else {
            Object[] objArr2 = new Object[1];
            a(new char[]{'\b', 20, 24, 22, '\n', 16, 13778, 13778, '\r', 21, 18, 3, 3, '\t', 18, 24, 6, 16, 14, 16, 0, 24, 19, 3, 3, 17, 24, 1, 3, 15, 14, 0, 15, 6, 3, '\b', 23, '\f', '\t', '\b', '\t', 4, 2, '\r', 0, 1, 17, 15, 20, 1, 13850}, (byte) (View.getDefaultSize(0, 0) + 29), 51 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), objArr2);
            strIntern = ((String) objArr2[0]).intern();
        }
        int i4 = 2 % 2;
        this.IAuthTabCallbackStub = strIntern;
        this.getInterfaceDescriptor = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.gl.AuthBackgroundLoadingView$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = 2 % 2;
                int i6 = onWarmupCompleted + 47;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    Object[] objArr3 = {context};
                    int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
                    Float.valueOf(((Float) AuthBackgroundLoadingView.onExtraCallback(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, 1213220514, objArr3, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -1213220512)).floatValue());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object[] objArr4 = {context};
                int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
                Float fValueOf = Float.valueOf(((Float) AuthBackgroundLoadingView.onExtraCallback(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, 1213220514, objArr4, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -1213220512)).floatValue());
                int i7 = onExtraCallbackWithResult + 7;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 30 / 0;
                }
                return fValueOf;
            }
        });
        this.asInterface = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.gl.AuthBackgroundLoadingView$$ExternalSyntheticLambda5
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = 2 % 2;
                int i6 = onExtraCallback + 81;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                int iOnExtraCallback = AuthBackgroundLoadingView.onExtraCallback(this.f$0);
                if (i7 == 0) {
                    return Integer.valueOf(iOnExtraCallback);
                }
                Integer.valueOf(iOnExtraCallback);
                throw null;
            }
        });
        this.onNavigationEvent = new onExtraCallback();
        if (getId() == -1) {
            setId(R.id.auth_loading);
            int i5 = 2 % 2;
        }
        if (getLayoutParams() == null) {
            setLayoutParams(new ConstraintLayout.onExtraCallbackWithResult(-1, -1));
        }
        if ((!isLaidOut()) || isLayoutRequested()) {
            addOnLayoutChangeListener(new access100());
            return;
        }
        int i6 = IAuthTabCallbackStubProxy + 11;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        AnimateMaskedImageView animateMaskedImageView = IAuthTabCallback(this).onExtraCallback;
        Intrinsics.checkNotNull(animateMaskedImageView);
        AnimateMaskedImageView.setRenderer$default(animateMaskedImageView, onNavigationEvent(this), false, 2, null);
        animateMaskedImageView.setImageUrl(onExtraCallbackWithResult(this), onNavigationEvent(this), onNavigationEvent(this));
        AnimateMaskedImageView animateMaskedImageView2 = IAuthTabCallback(this).onWarmupCompleted;
        Intrinsics.checkNotNull(animateMaskedImageView2);
        AnimateMaskedImageView.setRenderer$default(animateMaskedImageView2, onNavigationEvent(this), false, 2, null);
        animateMaskedImageView2.setImageUrl(onExtraCallbackWithResult(this), onNavigationEvent(this), onNavigationEvent(this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AuthBackgroundLoadingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallbackStubProxy + Imgproc.COLOR_YUV2RGB_YVYU;
            extraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = extraCallbackWithResult + 119;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ AFk1ySDK IAuthTabCallback(AuthBackgroundLoadingView authBackgroundLoadingView) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 41;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        AFk1ySDK aFk1ySDK = authBackgroundLoadingView.onExtraCallback;
        int i5 = i2 + 69;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return aFk1ySDK;
    }

    public static final /* synthetic */ void IAuthTabCallbackDefault(AuthBackgroundLoadingView authBackgroundLoadingView) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        authBackgroundLoadingView.onTransact();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallbackWithResult + 113;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ runOnUiThreadDelayed IAuthTabCallbackStub(AuthBackgroundLoadingView authBackgroundLoadingView) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 105;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = authBackgroundLoadingView.IAuthTabCallback_Parcel;
        int i5 = i3 + 33;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return runonuithreaddelayed;
    }

    public static final /* synthetic */ boolean asBinder(AuthBackgroundLoadingView authBackgroundLoadingView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        boolean z = authBackgroundLoadingView.IAuthTabCallbackDefault;
        if (i4 == 0) {
            int i5 = 7 / 0;
        }
        int i6 = i3 + 81;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 80 / 0;
        }
        return z;
    }

    public static final /* synthetic */ float asInterface(AuthBackgroundLoadingView authBackgroundLoadingView) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 25;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback = authBackgroundLoadingView.IAuthTabCallback();
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        int i5 = extraCallbackWithResult + 69;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return fIAuthTabCallback;
    }

    public static final /* synthetic */ String onExtraCallbackWithResult(AuthBackgroundLoadingView authBackgroundLoadingView) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 39;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        String str = authBackgroundLoadingView.IAuthTabCallbackStub;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 73;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final /* synthetic */ int onNavigationEvent(AuthBackgroundLoadingView authBackgroundLoadingView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = authBackgroundLoadingView.onExtraCallback();
        int i4 = extraCallbackWithResult + 109;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return iOnExtraCallback;
    }

    public static final /* synthetic */ void onNavigationEvent(AuthBackgroundLoadingView authBackgroundLoadingView, runOnUiThreadDelayed runonuithreaddelayed) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 57;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        authBackgroundLoadingView.IAuthTabCallback_Parcel = runonuithreaddelayed;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 59;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onTransact(AuthBackgroundLoadingView authBackgroundLoadingView) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        authBackgroundLoadingView.asInterface();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 123;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(AuthBackgroundLoadingView authBackgroundLoadingView, float f) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        authBackgroundLoadingView.onWarmupCompleted(f);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 55;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(AuthBackgroundLoadingView authBackgroundLoadingView, boolean z) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 51;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        authBackgroundLoadingView.IAuthTabCallbackDefault = z;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 125;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 80 / 0;
        }
    }

    private final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 49;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) this.getInterfaceDescriptor.getValue()).floatValue();
        int i4 = extraCallbackWithResult + 9;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    private static final float IAuthTabCallback(Context context) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = generateLink.onNavigationEvent(context);
        int i4 = IAuthTabCallbackStubProxy + 123;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    private final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            ((Number) this.asInterface.getValue()).intValue();
            throw null;
        }
        int iIntValue = ((Number) this.asInterface.getValue()).intValue();
        int i3 = extraCallbackWithResult + 83;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return iIntValue;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View, im.toss.uikit.widget.gl.AuthBackgroundLoadingView] */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int iIntValue;
        ?? r8 = (AuthBackgroundLoadingView) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int width = r8.getWidth();
        AFk1ySDK aFk1ySDK = ((AuthBackgroundLoadingView) r8).onExtraCallback;
        if (i3 != 0) {
            Object[] objArr2 = {aFk1ySDK.onExtraCallback};
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            iIntValue = width >> ((Integer) AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1135725072, iOnWarmupCompleted, -1135725069, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr2)).intValue();
        } else {
            Object[] objArr3 = {aFk1ySDK.onExtraCallback};
            int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            iIntValue = ((Integer) AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1135725072, iOnWarmupCompleted2, -1135725069, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr3)).intValue() * width;
        }
        return Integer.valueOf(iIntValue);
    }

    public static final class onExtraCallback implements InstallReferrerClientInstallReferrerResponse {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        onExtraCallback() {
        }

        public /* bridge */ void onActivityCreated(Activity activity, Bundle bundle) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onActivityCreated(activity, bundle);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onExtraCallback + 27;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* bridge */ void onActivityDestroyed(Activity activity) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onActivityDestroyed(activity);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onExtraCallbackWithResult + 37;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* bridge */ void onActivityPaused(Activity activity) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onActivityPaused(activity);
            int i4 = onExtraCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* bridge */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onActivitySaveInstanceState(activity, bundle);
            int i4 = onExtraCallbackWithResult + 59;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onActivityStopped(Activity activity) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(activity, "");
                AuthBackgroundLoadingView.IAuthTabCallbackDefault(AuthBackgroundLoadingView.this);
                super.onActivityStopped(activity);
            } else {
                Intrinsics.checkNotNullParameter(activity, "");
                AuthBackgroundLoadingView.IAuthTabCallbackDefault(AuthBackgroundLoadingView.this);
                super.onActivityStopped(activity);
                throw null;
            }
        }

        public void onActivityResumed(Activity activity) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(activity, "");
                super.onActivityResumed(activity);
                AuthBackgroundLoadingView.this.onNavigationEvent();
            } else {
                Intrinsics.checkNotNullParameter(activity, "");
                super.onActivityResumed(activity);
                AuthBackgroundLoadingView.this.onNavigationEvent();
                int i3 = 62 / 0;
            }
        }

        public void onActivityStarted(Activity activity) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            super.onActivityStarted(activity);
            AuthBackgroundLoadingView.this.onNavigationEvent();
            int i4 = onExtraCallbackWithResult + 115;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class onExtraCallbackWithResult implements Animator.AnimatorListener {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        public onExtraCallbackWithResult() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ConstraintLayout constraintLayout;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                AuthBackgroundLoadingView.onTransact(AuthBackgroundLoadingView.this);
                AuthBackgroundLoadingView.onWarmupCompleted(AuthBackgroundLoadingView.this, false);
                constraintLayout = AuthBackgroundLoadingView.this;
            } else {
                AuthBackgroundLoadingView.onTransact(AuthBackgroundLoadingView.this);
                AuthBackgroundLoadingView.onWarmupCompleted(AuthBackgroundLoadingView.this, false);
                constraintLayout = AuthBackgroundLoadingView.this;
            }
            constraintLayout.setVisibility(8);
            AuthBackgroundLoadingView.IAuthTabCallbackDefault(AuthBackgroundLoadingView.this);
            int i3 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 86 / 0;
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AuthBackgroundLoadingView authBackgroundLoadingView = (AuthBackgroundLoadingView) objArr[0];
        GLSurfaceView gLSurfaceView = (GLSurfaceView) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        addErrorStateInfobugsnag_plugin_android_anr_release adderrorstateinfobugsnag_plugin_android_anr_release = authBackgroundLoadingView.onExtraCallbackWithResult;
        if (adderrorstateinfobugsnag_plugin_android_anr_release != null) {
            adderrorstateinfobugsnag_plugin_android_anr_release.IAuthTabCallback(15.0f * fFloatValue, fFloatValue * 3.0f, 0.0f);
        }
        gLSurfaceView.requestRender();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 47;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(new deprecated_dns(250.0d, 40.0d));
        attachapplovinsdk.onExtraCallback(0);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + Imgproc.COLOR_YUV2RGB_YVYU;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit access100(AuthBackgroundLoadingView authBackgroundLoadingView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 15;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        addErrorStateInfobugsnag_plugin_android_anr_release adderrorstateinfobugsnag_plugin_android_anr_release = authBackgroundLoadingView.onExtraCallbackWithResult;
        if (adderrorstateinfobugsnag_plugin_android_anr_release != null) {
            int i5 = i2 + 65;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                adderrorstateinfobugsnag_plugin_android_anr_release.IAuthTabCallback(2.0f, 2.0f, 0.0f);
            } else {
                adderrorstateinfobugsnag_plugin_android_anr_release.IAuthTabCallback(0.0f, 0.0f, 0.0f);
            }
        }
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackStubProxy + 69;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public final void onNavigationEvent(@NotNull FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        this.onWarmupCompleted = fragmentActivity;
        fragmentActivity.getApplication().registerActivityLifecycleCallbacks(this.onNavigationEvent);
        int i4 = extraCallbackWithResult + 81;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onWarmupCompleted implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ AFk1ySDK onExtraCallback;

        onWarmupCompleted(AFk1ySDK aFk1ySDK) {
            this.onExtraCallback = aFk1ySDK;
        }

        public /* bridge */ void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(f);
            int i4 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public /* bridge */ void onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(obj);
            if (i3 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public void onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {this.onExtraCallback.onExtraCallback, Float.valueOf(f)};
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1410514566, iOnWarmupCompleted, 1410514570, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr);
            int i4 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        public void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {this.onExtraCallback.onExtraCallback, Float.valueOf(f)};
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 263438331, iOnWarmupCompleted, -263438330, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr);
            int i4 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                this.onExtraCallback.onExtraCallback.onExtraCallbackWithResult(f);
                int i3 = 20 / 0;
            } else {
                this.onExtraCallback.onExtraCallback.onExtraCallbackWithResult(f);
            }
            int i4 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 6 / 0;
            }
        }

        public void onWarmupCompleted(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {this.onExtraCallback.onExtraCallback, Float.valueOf(f)};
            AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -992799876, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 992799878, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr);
            int i4 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final class asInterface implements Function1<attachAppLovinSdk, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        public static final asInterface onWarmupCompleted = new asInterface();

        static {
            int i = onExtraCallbackWithResult + 107;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        asInterface() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(attachAppLovinSdk attachapplovinsdk) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(attachapplovinsdk);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 119;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 113;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                i = 32639;
            } else {
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                i = 1200;
            }
            attachapplovinsdk.IAuthTabCallback(i);
        }
    }

    static final class IAuthTabCallbackDefault implements Function1<attachAppLovinSdk, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        public static final IAuthTabCallbackDefault onWarmupCompleted = new IAuthTabCallbackDefault();

        static {
            int i = onNavigationEvent + 29;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 62 / 0;
            }
        }

        IAuthTabCallbackDefault() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(attachAppLovinSdk attachapplovinsdk) {
            int i = 2 % 2;
            int i2 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(attachapplovinsdk);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 35;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 61;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                i = 29624;
            } else {
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                i = 2200;
            }
            attachapplovinsdk.IAuthTabCallback(i);
        }
    }

    static final class onTransact implements Function1<attachAppLovinSdk, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        public static final onTransact onWarmupCompleted = new onTransact();

        static {
            int i = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        onTransact() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(attachAppLovinSdk attachapplovinsdk) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent(attachapplovinsdk);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 93;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
            int i;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 93;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback((Interpolator) Address.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{Address.onNavigationEvent, Float.valueOf(0.12f), Float.valueOf(1.0f), Float.valueOf(0.39f), Float.valueOf(2.0f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131));
                i = 10598;
            } else {
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback((Interpolator) Address.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{Address.onNavigationEvent, Float.valueOf(0.12f), Float.valueOf(0.0f), Float.valueOf(0.39f), Float.valueOf(0.0f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131));
                i = 2200;
            }
            attachapplovinsdk.IAuthTabCallback(i);
            int i4 = onExtraCallback + 23;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final class IAuthTabCallbackStub implements Function1<attachAppLovinSdk, Unit> {
        private static int IAuthTabCallback = 1;
        public static final IAuthTabCallbackStub onExtraCallback = new IAuthTabCallbackStub();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        IAuthTabCallbackStub() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(attachAppLovinSdk attachapplovinsdk) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(attachapplovinsdk);
            if (i3 != 0) {
                return Unit.INSTANCE;
            }
            int i4 = 18 / 0;
            return Unit.INSTANCE;
        }

        public final void IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            attachapplovinsdk.IAuthTabCallback(700);
            attachapplovinsdk.onExtraCallback(1000);
            int i4 = onWarmupCompleted + 59;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class asBinder implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ AFk1ySDK onNavigationEvent;

        asBinder(AFk1ySDK aFk1ySDK) {
            this.onNavigationEvent = aFk1ySDK;
        }

        public /* bridge */ void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            super.onExtraCallbackWithResult(f);
            if (i3 == 0) {
                throw null;
            }
            int i4 = onExtraCallbackWithResult + 95;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public /* bridge */ void onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(obj);
            int i4 = onExtraCallback + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {this.onNavigationEvent.onWarmupCompleted, Float.valueOf(f)};
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1410514566, iOnWarmupCompleted, 1410514570, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr);
            int i4 = onExtraCallback + 19;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {this.onNavigationEvent.onWarmupCompleted, Float.valueOf(f)};
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 263438331, iOnWarmupCompleted, -263438330, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr);
            int i4 = onExtraCallback + 11;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.onWarmupCompleted.onExtraCallbackWithResult(f);
            int i4 = onExtraCallbackWithResult + 27;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onWarmupCompleted(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {this.onNavigationEvent.onWarmupCompleted, Float.valueOf(f)};
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            if (i3 != 0) {
                AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -992799876, iOnWarmupCompleted, 992799878, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr);
            } else {
                AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -992799876, iOnWarmupCompleted, 992799878, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    static final class IAuthTabCallback_Parcel implements Function1<attachAppLovinSdk, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        public static final IAuthTabCallback_Parcel onExtraCallbackWithResult = new IAuthTabCallback_Parcel();
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 109;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        IAuthTabCallback_Parcel() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(attachAppLovinSdk attachapplovinsdk) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(attachapplovinsdk);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 6 / 0;
            }
            return unit;
        }

        public final void IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
            int i;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 33;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                i = 27466;
            } else {
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                i = 1200;
            }
            attachapplovinsdk.IAuthTabCallback(i);
            int i4 = IAuthTabCallback + 17;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final class getInterfaceDescriptor implements Function1<attachAppLovinSdk, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        public static final getInterfaceDescriptor onNavigationEvent = new getInterfaceDescriptor();
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 23;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        getInterfaceDescriptor() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(attachAppLovinSdk attachapplovinsdk) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(attachapplovinsdk);
            if (i3 != 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            attachapplovinsdk.IAuthTabCallback(2200);
            int i4 = onExtraCallbackWithResult + 75;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final class IAuthTabCallbackStubProxy implements Function1<attachAppLovinSdk, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final IAuthTabCallbackStubProxy onWarmupCompleted = new IAuthTabCallbackStubProxy();

        static {
            int i = IAuthTabCallback + 113;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 99 / 0;
            }
        }

        IAuthTabCallbackStubProxy() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(attachAppLovinSdk attachapplovinsdk) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(attachapplovinsdk);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback((Interpolator) Address.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{Address.onNavigationEvent, Float.valueOf(0.12f), Float.valueOf(0.0f), Float.valueOf(0.39f), Float.valueOf(0.0f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131));
            attachapplovinsdk.IAuthTabCallback(2200);
            int i4 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final class onNavigationEvent implements Function1<attachAppLovinSdk, Unit> {
        private static int IAuthTabCallback = 0;
        public static final onNavigationEvent onExtraCallback = new onNavigationEvent();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 49;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        onNavigationEvent() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(attachAppLovinSdk attachapplovinsdk) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(attachapplovinsdk);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 83 / 0;
            }
            return unit;
        }

        public final void IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                attachapplovinsdk.IAuthTabCallback(32365);
                i = 20401;
            } else {
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                attachapplovinsdk.IAuthTabCallback(700);
                i = 1000;
            }
            attachapplovinsdk.onExtraCallback(i);
            int i4 = onWarmupCompleted + 9;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final class IAuthTabCallback implements Runnable {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        IAuthTabCallback() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallbackStub;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (AuthBackgroundLoadingView.asBinder(AuthBackgroundLoadingView.this) || !AuthBackgroundLoadingView.this.isAttachedToWindow() || (runonuithreaddelayedIAuthTabCallbackStub = AuthBackgroundLoadingView.IAuthTabCallbackStub(AuthBackgroundLoadingView.this)) == null) {
                    return;
                }
                int i3 = onNavigationEvent + 59;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                isFireOS.onExtraCallbackWithResult(runonuithreaddelayedIAuthTabCallbackStub, false, 1, (Object) null);
                return;
            }
            AuthBackgroundLoadingView.asBinder(AuthBackgroundLoadingView.this);
            obj.hashCode();
            throw null;
        }
    }

    private final void onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        AFk1ySDK aFk1ySDK = this.onExtraCallback;
        Object[] objArr = {aFk1ySDK.onExtraCallback, Float.valueOf(0.0f)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1410514566, iOnWarmupCompleted, 1410514570, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr);
        Object[] objArr2 = {aFk1ySDK.onExtraCallback, Float.valueOf(100.0f)};
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -992799876, iOnWarmupCompleted2, 992799878, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr2);
        Object[] objArr3 = {aFk1ySDK.onExtraCallback, Float.valueOf(0.0f)};
        int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 263438331, iOnWarmupCompleted3, -263438330, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr3);
        aFk1ySDK.onExtraCallback.onExtraCallbackWithResult(f);
        Object[] objArr4 = {aFk1ySDK.onWarmupCompleted, Float.valueOf(0.0f)};
        int iOnWarmupCompleted4 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1410514566, iOnWarmupCompleted4, 1410514570, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr4);
        Object[] objArr5 = {aFk1ySDK.onWarmupCompleted, Float.valueOf(60.0f)};
        int iOnWarmupCompleted5 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -992799876, iOnWarmupCompleted5, 992799878, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr5);
        Object[] objArr6 = {aFk1ySDK.onWarmupCompleted, Float.valueOf(0.0f)};
        int iOnWarmupCompleted6 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 263438331, iOnWarmupCompleted6, -263438330, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr6);
        aFk1ySDK.onWarmupCompleted.onExtraCallbackWithResult(f);
        int i4 = extraCallbackWithResult + 61;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        AuthBackgroundLoadingView authBackgroundLoadingView = (AuthBackgroundLoadingView) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            runOnUiThreadDelayed runonuithreaddelayed = authBackgroundLoadingView.IAuthTabCallback_Parcel;
            if (runonuithreaddelayed != null) {
                runonuithreaddelayed.updateVisuals();
            }
            ValueAnimator valueAnimator = authBackgroundLoadingView.IAuthTabCallback;
            if (valueAnimator != null) {
                int i3 = IAuthTabCallbackStubProxy + 7;
                extraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                valueAnimator.pause();
            }
            return null;
        }
        runOnUiThreadDelayed runonuithreaddelayed2 = authBackgroundLoadingView.IAuthTabCallback_Parcel;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049 A[PHI: r1 r3 r5
      0x0049: PHI (r1v19 float) = (r1v7 float), (r1v23 float) binds: [B:8:0x003f, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r3v5 float) = (r3v2 float), (r3v8 float) binds: [B:8:0x003f, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r5v3 float) = (r5v0 float), (r5v4 float) binds: [B:8:0x003f, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[PHI: r1 r3 r4 r5
      0x0041: PHI (r1v8 float) = (r1v7 float), (r1v23 float) binds: [B:8:0x003f, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0041: PHI (r3v3 float) = (r3v2 float), (r3v8 float) binds: [B:8:0x003f, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0041: PHI (r4v1 o.addErrorStateInfobugsnag_plugin_android_anr_release) = 
      (r4v0 o.addErrorStateInfobugsnag_plugin_android_anr_release)
      (r4v3 o.addErrorStateInfobugsnag_plugin_android_anr_release)
     binds: [B:8:0x003f, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0041: PHI (r5v1 float) = (r5v0 float), (r5v4 float) binds: [B:8:0x003f, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent() {
        float fOnNavigationEvent;
        float fOnNavigationEvent2;
        addErrorStateInfobugsnag_plugin_android_anr_release adderrorstateinfobugsnag_plugin_android_anr_release;
        float f;
        final float f2;
        final float f3;
        final float fIAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            this.IAuthTabCallbackDefault = false;
            fOnNavigationEvent = this.onExtraCallback.onExtraCallback.onNavigationEvent();
            fOnNavigationEvent2 = this.onExtraCallback.onWarmupCompleted.onNavigationEvent();
            adderrorstateinfobugsnag_plugin_android_anr_release = this.onExtraCallbackWithResult;
            f = 1.0f;
            if (adderrorstateinfobugsnag_plugin_android_anr_release != null) {
                f2 = fOnNavigationEvent;
                f3 = fOnNavigationEvent2;
                fIAuthTabCallback = adderrorstateinfobugsnag_plugin_android_anr_release.IAuthTabCallback();
            } else {
                f2 = fOnNavigationEvent;
                fIAuthTabCallback = 0.0f;
                f3 = fOnNavigationEvent2;
            }
        } else {
            this.IAuthTabCallbackDefault = true;
            fOnNavigationEvent = this.onExtraCallback.onExtraCallback.onNavigationEvent();
            fOnNavigationEvent2 = this.onExtraCallback.onWarmupCompleted.onNavigationEvent();
            adderrorstateinfobugsnag_plugin_android_anr_release = this.onExtraCallbackWithResult;
            f = 0.0f;
            if (adderrorstateinfobugsnag_plugin_android_anr_release != null) {
            }
        }
        addErrorStateInfobugsnag_plugin_android_anr_release adderrorstateinfobugsnag_plugin_android_anr_release2 = this.onExtraCallbackWithResult;
        final float fOnExtraCallbackWithResult = adderrorstateinfobugsnag_plugin_android_anr_release2 != null ? adderrorstateinfobugsnag_plugin_android_anr_release2.onExtraCallbackWithResult() : 0.0f;
        addErrorStateInfobugsnag_plugin_android_anr_release adderrorstateinfobugsnag_plugin_android_anr_release3 = this.onExtraCallbackWithResult;
        final float fOnExtraCallback = adderrorstateinfobugsnag_plugin_android_anr_release3 != null ? adderrorstateinfobugsnag_plugin_android_anr_release3.onExtraCallback() : f;
        Rally rally = this.asBinder;
        if (rally != null) {
            int i3 = extraCallbackWithResult + 23;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            rally.ICustomTabsServiceStub();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ValueAnimator.setFrameDelay(16L);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(Address.onNavigationEvent.asBinder());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.gl.AuthBackgroundLoadingView$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = 2 % 2;
                int i6 = IAuthTabCallback + 73;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    Object[] objArr = {this.f$0, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(fIAuthTabCallback), Float.valueOf(fOnExtraCallbackWithResult), Float.valueOf(fOnExtraCallback), valueAnimator};
                    int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
                    AuthBackgroundLoadingView.onExtraCallback(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, 314998187, objArr, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -314998186);
                    return;
                }
                Object[] objArr2 = {this.f$0, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(fIAuthTabCallback), Float.valueOf(fOnExtraCallbackWithResult), Float.valueOf(fOnExtraCallback), valueAnimator};
                int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
                AuthBackgroundLoadingView.onExtraCallback(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, 314998187, objArr2, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -314998186);
                int i7 = 8 / 0;
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new onExtraCallbackWithResult());
        valueAnimatorOfFloat.start();
        this.onTransact = valueAnimatorOfFloat;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = access100;
        int i4 = -1310771303;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1))), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 26, 23138 - ExpandableListView.getPackedPositionChild(j), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    i4 = -1310771303;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $10 + 13;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(access000)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 26 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i8 = $10 + 57;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - Color.green(0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 73, Color.blue(0) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), (Process.myPid() >> 22) + 30, 19488 - ((Process.getThreadPriority(0) + 20) >> 6), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                        } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i11 = $10 + 19;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                        } else {
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                }
            }
            for (int i17 = 0; i17 < i; i17++) {
                cArr4[i17] = (char) (cArr4[i17] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallback(AuthBackgroundLoadingView authBackgroundLoadingView, float f, float f2, float f3, float f4, float f5, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            ((Float) animatedValue).floatValue();
            authBackgroundLoadingView.isAttachedToWindow();
            throw null;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "");
        float fFloatValue = ((Float) animatedValue2).floatValue();
        if (authBackgroundLoadingView.isAttachedToWindow()) {
            Object[] objArr = {authBackgroundLoadingView.onExtraCallback.onExtraCallback, Float.valueOf(f - (f * fFloatValue))};
            AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1410514566, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1410514570, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr);
            Object[] objArr2 = {authBackgroundLoadingView.onExtraCallback.onWarmupCompleted, Float.valueOf(f2 - (f2 * fFloatValue))};
            AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1410514566, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1410514570, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr2);
            addErrorStateInfobugsnag_plugin_android_anr_release adderrorstateinfobugsnag_plugin_android_anr_release = authBackgroundLoadingView.onExtraCallbackWithResult;
            if (adderrorstateinfobugsnag_plugin_android_anr_release != null) {
                int i3 = extraCallbackWithResult + 107;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                adderrorstateinfobugsnag_plugin_android_anr_release.IAuthTabCallback(f3 - (f3 * fFloatValue), f4 - (f4 * fFloatValue), f5 - (fFloatValue * f5));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onTransact() {
        ViewGroup viewGroup;
        int i = 2 % 2;
        asInterface();
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            int i2 = extraCallbackWithResult + 119;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 % 2;
            }
            viewGroup = null;
        }
        if (viewGroup != null) {
            int i4 = IAuthTabCallbackStubProxy + 119;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                viewGroup.removeView(this);
                throw null;
            }
            viewGroup.removeView(this);
        }
        this.onExtraCallback.onExtraCallback.asBinder();
        this.onExtraCallback.onWarmupCompleted.asBinder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 21;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.View*/.onDetachedFromWindow();
        asInterface();
        int i4 = extraCallbackWithResult + 7;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void asInterface() {
        int i = 2 % 2;
        Rally rally = this.asBinder;
        if (rally != null) {
            rally.ICustomTabsServiceStub();
        }
        ValueAnimator valueAnimator = this.onTransact;
        Object obj = null;
        if (valueAnimator != null) {
            int i2 = IAuthTabCallbackStubProxy + 3;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                valueAnimator.cancel();
                obj.hashCode();
                throw null;
            }
            valueAnimator.cancel();
            int i3 = extraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 % 2;
            }
        }
        runOnUiThreadDelayed runonuithreaddelayed = this.IAuthTabCallback_Parcel;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
        }
        ValueAnimator valueAnimator2 = this.IAuthTabCallback;
        if (valueAnimator2 != null) {
            int i5 = extraCallbackWithResult + 37;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                valueAnimator2.cancel();
                throw null;
            }
            valueAnimator2.cancel();
        }
        this.asBinder = null;
        this.IAuthTabCallback_Parcel = null;
        this.IAuthTabCallback = null;
        this.onTransact = null;
        FragmentActivity fragmentActivity = this.onWarmupCompleted;
        if (fragmentActivity != null) {
            int i6 = extraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallbackStubProxy = i6 % 128;
            if (i6 % 2 != 0) {
                fragmentActivity.getApplication();
                throw null;
            }
            Application application = fragmentActivity.getApplication();
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this.onNavigationEvent);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034 A[PHI: r2 r3 r4
      0x0034: PHI (r2v5 java.lang.Float) = (r2v4 java.lang.Float), (r2v16 java.lang.Float) binds: [B:8:0x0032, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r3v4 java.lang.Float) = (r3v3 java.lang.Float), (r3v9 java.lang.Float) binds: [B:8:0x0032, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r4v1 o.AFk1ySDK) = (r4v0 o.AFk1ySDK), (r4v8 o.AFk1ySDK) binds: [B:8:0x0032, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted() {
        Float fValueOf;
        Float fValueOf2;
        AFk1ySDK aFk1ySDK;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            fValueOf = Float.valueOf(1.0f);
            fValueOf2 = Float.valueOf(1.0f);
            aFk1ySDK = this.onExtraCallback;
            if (isLaidOut()) {
                if (!isLayoutRequested()) {
                    float fAsInterface = asInterface(this);
                    onWarmupCompleted(this, false);
                    onWarmupCompleted(this, fAsInterface);
                    runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallbackStub = IAuthTabCallbackStub(this);
                    if (runonuithreaddelayedIAuthTabCallbackStub != null) {
                        runonuithreaddelayedIAuthTabCallbackStub.onNavigationEvent();
                    }
                    pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
                    onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(aFk1ySDK);
                    getExtraParameters getextraparameters = getExtraParameters.Normal;
                    onNavigationEvent(this, RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{RallysKt.IAuthTabCallback(onwarmupcompleted, isMuted.onExtraCallback(isMuted.getInterfaceDescriptor(isMuted.onWarmupCompleted(isMuted.onTransact(new AppLovinSdkSettings(), fValueOf2, fValueOf, asInterface.onWarmupCompleted), Float.valueOf(100.0f), Float.valueOf(-60.0f), IAuthTabCallbackDefault.onWarmupCompleted), Float.valueOf(fAsInterface), Float.valueOf((fAsInterface - asInterface(this)) - (onNavigationEvent(this) / 4.0f)), onTransact.onWarmupCompleted), fValueOf, fValueOf2, IAuthTabCallbackStub.onExtraCallback), -1, getextraparameters, 1800, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2016, (Object) null), RallysKt.IAuthTabCallback(new asBinder(aFk1ySDK), isMuted.onExtraCallback(isMuted.getInterfaceDescriptor(isMuted.onWarmupCompleted(isMuted.onTransact(new AppLovinSdkSettings(), fValueOf2, fValueOf, IAuthTabCallback_Parcel.onExtraCallbackWithResult), Float.valueOf(60.0f), Float.valueOf(-100.0f), getInterfaceDescriptor.onNavigationEvent), Float.valueOf(fAsInterface), Float.valueOf((fAsInterface - asInterface(this)) - (onNavigationEvent(this) / 4.0f)), IAuthTabCallbackStubProxy.onWarmupCompleted), fValueOf, fValueOf2, onNavigationEvent.onExtraCallback), -1, getextraparameters, 1800, (Interpolator) null, (Integer) null, (Boolean) null, 2000, 0L, false, 1760, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null));
                    postDelayed(new IAuthTabCallback(), 1000L);
                    int i3 = extraCallbackWithResult + 83;
                    IAuthTabCallbackStubProxy = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
            }
        } else {
            fValueOf = Float.valueOf(1.0f);
            fValueOf2 = Float.valueOf(0.0f);
            aFk1ySDK = this.onExtraCallback;
            if (isLaidOut()) {
            }
        }
        addOnLayoutChangeListener(new access000(aFk1ySDK));
        int i5 = extraCallbackWithResult + 41;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(AuthBackgroundLoadingView authBackgroundLoadingView, float f, float f2, float f3, float f4, float f5, ValueAnimator valueAnimator) {
        Object[] objArr = {authBackgroundLoadingView, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), valueAnimator};
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        onExtraCallback(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, 314998187, objArr, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -314998186);
    }

    public static /* synthetic */ float onExtraCallbackWithResult(Context context) {
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        return ((Float) onExtraCallback(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, 1213220514, new Object[]{context}, iOnWarmupCompleted3, -1213220512)).floatValue();
    }

    public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onExtraCallback(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, -59759626, new Object[]{attachapplovinsdk}, iOnWarmupCompleted3, 59759630);
    }

    private static final int IAuthTabCallback_Parcel(AuthBackgroundLoadingView authBackgroundLoadingView) {
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        return ((Integer) onExtraCallback(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, -532500757, new Object[]{authBackgroundLoadingView}, iOnWarmupCompleted3, 532500757)).intValue();
    }

    private static final Unit onWarmupCompleted(AuthBackgroundLoadingView authBackgroundLoadingView, GLSurfaceView gLSurfaceView, float f) {
        Object[] objArr = {authBackgroundLoadingView, gLSurfaceView, Float.valueOf(f)};
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onExtraCallback(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, -1425938199, objArr, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1425938202);
    }

    public final void onExtraCallbackWithResult() {
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        onExtraCallback(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, 472389948, new Object[]{this}, iOnWarmupCompleted3, -472389943);
    }
}
