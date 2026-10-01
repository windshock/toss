package im.toss.uikit.widget.dialog;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.gms.internal.ads.zzgc;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.tosscert.ui.R;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.logging.automation.scope.AutoLogDialogLifecycleObserver;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography4;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.R;
import im.toss.uikit.widget.MaxHeightScrollView;
import im.toss.uikit.widget.buttons.DialogButton;
import im.toss.uikit.widget.dialog.TdsDialogV1$;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFj1uSDK5;
import o.Address;
import o.AppLovinSdkSettings;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.EasingFunctionsKtExternalSyntheticLambda0;
import o.ICrashFilter;
import o.IOOMCallback;
import o.M_;
import o.RepeatableSpec;
import o.RequestBodyCompanion;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.VideoEncoderInfoImplExternalSyntheticLambda0;
import o.access8000;
import o.authParams;
import o.certificatePinner;
import o.deprecated_certificatePinner;
import o.deprecated_proxy;
import o.deprecated_proxySelector;
import o.deprecated_scheme;
import o.enableMessageDump;
import o.enableThreadsBoost;
import o.getConfigManager;
import o.getDid;
import o.getExtraParameters;
import o.getInstallVersion;
import o.getReferrerClickTimestampSeconds;
import o.getWrite;
import o.hasVaryAll;
import o.initMiniApp;
import o.initSDK;
import o.isANREnable;
import o.isFireOS;
import o.isMuted;
import o.matchesCertificate;
import o.minFresh;
import o.noStore;
import o.onCrash;
import o.onInstallReferrerServiceDisconnected;
import o.onInstallReferrerSetupFinished;
import o.pxToDp;
import o.r8lambdaYN2sJNglMasTWVNShwkasqH6K1o;
import o.setProtocolsokhttp;
import o.varyFields;
import o.varyMatches;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsDialogV1 extends r8lambdaYN2sJNglMasTWVNShwkasqH6K1o implements ViewTreeObserver.OnGlobalLayoutListener, getConfigManager {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static char IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    private static int access100 = 1;
    private static char asBinder;
    private static char asInterface;
    private static char getInterfaceDescriptor;
    private Map<String, Object> IAuthTabCallbackDefault;
    private AFj1uSDK5 onExtraCallback;
    private final onExtraCallbackWithResult.IAuthTabCallback<?> onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private Rally onTransact;
    private final AutoLogDialogLifecycleObserver onWarmupCompleted;

    static {
        onMessageChannelReady();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        int i = access100 + 23;
        access000 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        TdsDialogV1 tdsDialogV1 = (TdsDialogV1) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(zBooleanValue, tdsDialogV1, view);
        int i4 = IAuthTabCallback_Parcel + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(TdsDialogV1 tdsDialogV1, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(tdsDialogV1, view);
        int i4 = IAuthTabCallback_Parcel + 73;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallback(onExtraCallbackWithResult.IAuthTabCallback.C0007onExtraCallbackWithResult c0007onExtraCallbackWithResult, TdsDialogV1 tdsDialogV1, int i, View view) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 91;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted(-1173351717, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{c0007onExtraCallbackWithResult, tdsDialogV1, Integer.valueOf(i), view}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1173351722);
        int i5 = IAuthTabCallback_Parcel + 67;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void onExtraCallback(TdsDialogV1 tdsDialogV1, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 61;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onTransact(tdsDialogV1, view);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TdsDialogV1 tdsDialogV1, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        onWarmupCompleted(-683108314, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsDialogV1, view}, iOnNavigationEvent, iOnNavigationEvent2, 683108320);
        int i4 = IAuthTabCallback_Parcel + 69;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = (~i4) | i7;
        int i9 = ~i8;
        int i10 = (~(i7 | i6)) | i9;
        int i11 = (~(i7 | (~i6) | i4)) | (~(i8 | i6)) | (~(i | i6 | i4));
        int i12 = (~(i4 | i)) | i6 | i9;
        int i13 = i + i6 + i5 + (5090439 * i2) + ((-1076018391) * i3);
        int i14 = i13 * i13;
        int i15 = ((1425068070 * i) - 1475346432) + (1088368604 * i6) + (i10 * (-168349733)) + ((-168349733) * i11) + (168349733 * i12) + (1256718336 * i5) + (1616379904 * i2) + ((-1222115328) * i3) + (1028194304 * i14);
        int i16 = (i * (-1092730454)) + 799718796 + (i6 * (-1092731068)) + (i10 * (-307)) + (i11 * (-307)) + (i12 * 307) + (i5 * (-1092730761)) + (i2 * 1582232257) + (i3 * 741505039) + (i14 * (-1125187584));
        switch (i15 + (i16 * i16 * (-410583040))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsDialogV1 tdsDialogV1, initSDK.onNavigationEvent onnavigationevent) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(tdsDialogV1, onnavigationevent);
        int i4 = IAuthTabCallbackStubProxy + 103;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(TdsRoundLayout tdsRoundLayout, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(tdsRoundLayout, valueAnimator);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(Pair pair, TdsDialogV1 tdsDialogV1, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(pair, tdsDialogV1, view);
        int i4 = IAuthTabCallback_Parcel + 19;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onNavigationEvent implements View.OnLayoutChangeListener {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public onNavigationEvent() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            AFj1uSDK5 aFj1uSDK5;
            ViewGroup.MarginLayoutParams marginLayoutParams;
            int i9;
            ViewGroup.MarginLayoutParams marginLayoutParams2;
            int i10 = 2 % 2;
            int i11 = onExtraCallback + 77;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            view.removeOnLayoutChangeListener(this);
            AFj1uSDK5 aFj1uSDK52 = (AFj1uSDK5) TdsDialogV1.onWarmupCompleted(785598908, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{TdsDialogV1.this}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -785598904);
            if (aFj1uSDK52 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK52 = null;
            }
            FlexboxLayout flexboxLayout = aFj1uSDK52.onExtraCallback;
            int width = flexboxLayout.getWidth();
            int paddingLeft = flexboxLayout.getPaddingLeft();
            int paddingRight = flexboxLayout.getPaddingRight();
            AFj1uSDK5 aFj1uSDK53 = (AFj1uSDK5) TdsDialogV1.onWarmupCompleted(785598908, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{TdsDialogV1.this}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -785598904);
            if (aFj1uSDK53 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK53 = null;
            }
            FlexboxLayout flexboxLayout2 = aFj1uSDK53.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(flexboxLayout2, "");
            int childCount = flexboxLayout2.getChildCount();
            int i13 = 0;
            while (i13 < childCount) {
                View childAt = flexboxLayout2.getChildAt(i13);
                FlexboxLayout.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
                }
                FlexboxLayout.LayoutParams layoutParams2 = layoutParams;
                int i14 = ((width - paddingLeft) - paddingRight) / 2;
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    int i15 = onExtraCallback + 15;
                    onWarmupCompleted = i15 % 128;
                    int i16 = i15 % 2;
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                } else {
                    marginLayoutParams = null;
                }
                if (marginLayoutParams != null) {
                    int i17 = onExtraCallback + 63;
                    onWarmupCompleted = i17 % 128;
                    int i18 = i17 % 2;
                    i9 = marginLayoutParams.leftMargin;
                } else {
                    i9 = 0;
                }
                ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                    int i19 = onWarmupCompleted + 15;
                    onExtraCallback = i19 % 128;
                    int i20 = i19 % 2;
                    marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                } else {
                    marginLayoutParams2 = null;
                }
                layoutParams2.setMinWidth((i14 - i9) - (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0));
                childAt.setLayoutParams(layoutParams2);
                i13++;
                int i21 = onExtraCallback + 107;
                onWarmupCompleted = i21 % 128;
                int i22 = i21 % 2;
            }
            AFj1uSDK5 aFj1uSDK54 = (AFj1uSDK5) TdsDialogV1.onWarmupCompleted(785598908, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{TdsDialogV1.this}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -785598904);
            if (aFj1uSDK54 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK5 = null;
            } else {
                aFj1uSDK5 = aFj1uSDK54;
            }
            aFj1uSDK5.onExtraCallback.post(TdsDialogV1.this.new onExtraCallback());
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TdsDialogV1 tdsDialogV1 = (TdsDialogV1) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 5;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        AFj1uSDK5 aFj1uSDK5 = tdsDialogV1.onExtraCallback;
        int i5 = i2 + 77;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return aFj1uSDK5;
        }
        throw null;
    }

    public /* bridge */ String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        int i4 = IAuthTabCallback_Parcel + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback;
    }

    public /* synthetic */ initSDK IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        enableMessageDump enablemessagedumpExtraCallbackWithResult = extraCallbackWithResult();
        int i4 = IAuthTabCallback_Parcel + 69;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return enablemessagedumpExtraCallbackWithResult;
    }

    public /* bridge */ Set<String> IAuthTabCallbackStub() {
        Set<String> setIAuthTabCallbackStub;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            setIAuthTabCallbackStub = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
            int i3 = 71 / 0;
        } else {
            setIAuthTabCallbackStub = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        }
        int i4 = IAuthTabCallbackStubProxy + 47;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return setIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ initSDK IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        initSDK initsdkIAuthTabCallbackStubProxy = super.IAuthTabCallbackStubProxy();
        int i4 = IAuthTabCallbackStubProxy + 71;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return initsdkIAuthTabCallbackStubProxy;
    }

    public /* bridge */ enableThreadsBoost.onNavigationEvent access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        enableThreadsBoost.onNavigationEvent onnavigationeventAccess000 = super.access000();
        int i4 = IAuthTabCallback_Parcel + 115;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationeventAccess000;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean access100() {
        boolean zAccess100;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 69;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            zAccess100 = super/*o.initSDK*/.access100();
            int i3 = 80 / 0;
        } else {
            zAccess100 = super/*o.initSDK*/.access100();
        }
        int i4 = IAuthTabCallbackStubProxy + 29;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zAccess100;
    }

    public /* bridge */ Function1<ICrashFilter, Boolean> asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Function1<ICrashFilter, Boolean> function1AsBinder = super/*o.MonitorCrashConfig*/.asBinder();
        int i4 = IAuthTabCallback_Parcel + 91;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return function1AsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ View asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ICustomTabsCallback();
            throw null;
        }
        ViewGroup viewGroupICustomTabsCallback = ICustomTabsCallback();
        int i3 = IAuthTabCallback_Parcel + 59;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return viewGroupICustomTabsCallback;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ initSDK.onNavigationEvent getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 9;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        initSDK.onNavigationEvent interfaceDescriptor = super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
        int i4 = IAuthTabCallback_Parcel + 45;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return interfaceDescriptor;
    }

    public /* bridge */ initSDK.onNavigationEvent onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.onExtraCallback();
        }
        super/*o.MonitorCrashConfig*/.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ initMiniApp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp initminiappOnExtraCallbackWithResult = super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback_Parcel + 111;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return initminiappOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ enableThreadsBoost onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        enableThreadsBoost enablethreadsboostOnNavigationEvent = super/*o.MonitorCrashConfig*/.onNavigationEvent();
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        return enablethreadsboostOnNavigationEvent;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull ICrashFilter iCrashFilter) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super.onNavigationEvent(iCrashFilter);
        int i4 = IAuthTabCallback_Parcel + 79;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public /* bridge */ getDid onTransact() {
        getDid getdidOnTransact;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            getdidOnTransact = super/*o.MonitorCrashConfig*/.onTransact();
            int i3 = 75 / 0;
        } else {
            getdidOnTransact = super/*o.MonitorCrashConfig*/.onTransact();
        }
        int i4 = IAuthTabCallbackStubProxy + 69;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return getdidOnTransact;
        }
        throw null;
    }

    public /* bridge */ Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        }
        super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setAsCtaButton() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.initSDK*/.setAsCtaButton();
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ void setComponentKey(@Nullable enableThreadsBoost enablethreadsboost) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setComponentKey(enablethreadsboost);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setCustomParam(@NotNull String str, @NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParam(str, function1);
        int i4 = IAuthTabCallback_Parcel + 49;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
    }

    public /* bridge */ void setCustomParams(@NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParams(function1);
        int i4 = IAuthTabCallbackStubProxy + 3;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setEventLoggableChecker(@Nullable Function1<? super ICrashFilter, Boolean> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setEventLoggableChecker(function1);
        int i4 = IAuthTabCallback_Parcel + 109;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setMaskingWords(@NotNull Set<String> set) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMaskingWords(set);
        int i4 = IAuthTabCallbackStubProxy + 59;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setMetadata(@NotNull getDid getdid) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMetadata(getdid);
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsDialogV1(@NotNull onExtraCallbackWithResult.IAuthTabCallback<?> iAuthTabCallback) {
        super(iAuthTabCallback.asBinder(), R.style.Base_CustomDialog);
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.onExtraCallbackWithResult = iAuthTabCallback;
        this.onNavigationEvent = isANREnable.onExtraCallback(this, IOOMCallback.Dialog, iAuthTabCallback.IAuthTabCallbackStubProxy(), false, (Function1) null, iAuthTabCallback.getInterfaceDescriptor(), new Function1() { // from class: im.toss.uikit.widget.dialog.TdsDialogV1$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 87;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = TdsDialogV1.onWarmupCompleted(this.f$0, (initSDK.onNavigationEvent) obj);
                int i4 = onExtraCallback + 119;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unitOnWarmupCompleted;
            }
        }, 8, (Object) null);
        this.onWarmupCompleted = new AutoLogDialogLifecycleObserver(this);
        this.IAuthTabCallbackDefault = new LinkedHashMap();
    }

    public ViewGroup ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            View viewFindViewById = findViewById(android.R.id.content);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        View viewFindViewById2 = findViewById(android.R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2;
        int i3 = IAuthTabCallback_Parcel + 91;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return viewGroup;
    }

    public enableMessageDump extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        enableMessageDump enablemessagedump = (enableMessageDump) this.onNavigationEvent.getValue();
        int i3 = IAuthTabCallbackStubProxy + 55;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return enablemessagedump;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 45;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 95;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (asBinder ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getInterfaceDescriptor);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cArgb = (char) Color.argb(i3, i3, i3, i3);
                        int iAxisFromString = 9 - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET);
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(i3) + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cArgb, iAxisFromString, bitsPerPixel, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (asInterface ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallbackStub)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 11, AndroidCharacter.getMirror('0') + 12386, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 14 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 19900, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(TdsDialogV1 tdsDialogV1, initSDK.onNavigationEvent onnavigationevent) throws Throwable {
        onExtraCallbackWithResult.IAuthTabCallback.C0007onExtraCallbackWithResult c0007onExtraCallbackWithResultOnMinimized;
        CharSequence charSequenceIAuthTabCallback;
        CharSequence charSequenceIAuthTabCallback2;
        CharSequence charSequenceIAuthTabCallback3;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequence = _UrlKt.FRAGMENT_ENCODE_SET;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        CharSequence[] charSequenceArr = {tdsDialogV1.onExtraCallbackWithResult.access100(), tdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback_Parcel()};
        Object[] objArr = new Object[1];
        b(new char[]{51945, 44967, 20818, 8182}, TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') + 5, objArr);
        getReferrerClickTimestampSeconds.onWarmupCompleted(onnavigationevent, ((String) objArr[0]).intern(), charSequenceArr);
        onExtraCallbackWithResult.IAuthTabCallback<?> iAuthTabCallback = tdsDialogV1.onExtraCallbackWithResult;
        boolean z = iAuthTabCallback instanceof onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted;
        onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = null;
        if (z) {
            onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted2 = z ? (onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) iAuthTabCallback : null;
            if (onwarmupcompleted2 != null) {
                int i4 = IAuthTabCallback_Parcel + 115;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 != 0) {
                    onwarmupcompleted2.extraCallbackWithResult();
                    throw null;
                }
                onExtraCallbackWithResult.IAuthTabCallback.C0007onExtraCallbackWithResult c0007onExtraCallbackWithResultExtraCallbackWithResult = onwarmupcompleted2.extraCallbackWithResult();
                if (c0007onExtraCallbackWithResultExtraCallbackWithResult == null || (charSequenceIAuthTabCallback2 = c0007onExtraCallbackWithResultExtraCallbackWithResult.IAuthTabCallback()) == null) {
                    charSequenceIAuthTabCallback2 = _UrlKt.FRAGMENT_ENCODE_SET;
                }
                onExtraCallbackWithResult.IAuthTabCallback<?> iAuthTabCallback2 = tdsDialogV1.onExtraCallbackWithResult;
                if (iAuthTabCallback2 instanceof onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) {
                    int i5 = IAuthTabCallbackStubProxy + 37;
                    IAuthTabCallback_Parcel = i5 % 128;
                    if (i5 % 2 == 0) {
                        onwarmupcompleted = (onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) iAuthTabCallback2;
                        int i6 = 18 / 0;
                    } else {
                        onwarmupcompleted = (onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) iAuthTabCallback2;
                    }
                }
                if (onwarmupcompleted != null) {
                    int i7 = IAuthTabCallback_Parcel + 27;
                    IAuthTabCallbackStubProxy = i7 % 128;
                    int i8 = i7 % 2;
                    onExtraCallbackWithResult.IAuthTabCallback.C0007onExtraCallbackWithResult c0007onExtraCallbackWithResultICustomTabsCallback = onwarmupcompleted.ICustomTabsCallback();
                    if (c0007onExtraCallbackWithResultICustomTabsCallback != null && (charSequenceIAuthTabCallback3 = c0007onExtraCallbackWithResultICustomTabsCallback.IAuthTabCallback()) != null) {
                        charSequence = charSequenceIAuthTabCallback3;
                    }
                }
                tdsDialogV1.onExtraCallback(onnavigationevent, charSequenceIAuthTabCallback2, charSequence);
            }
        } else {
            boolean z2 = iAuthTabCallback instanceof onExtraCallbackWithResult.IAuthTabCallback.C0006IAuthTabCallback;
            if (!(!z2)) {
                onExtraCallbackWithResult.IAuthTabCallback.C0006IAuthTabCallback c0006IAuthTabCallback = z2 ? (onExtraCallbackWithResult.IAuthTabCallback.C0006IAuthTabCallback) iAuthTabCallback : null;
                if (c0006IAuthTabCallback != null && (c0007onExtraCallbackWithResultOnMinimized = c0006IAuthTabCallback.onMinimized()) != null && (charSequenceIAuthTabCallback = c0007onExtraCallbackWithResultOnMinimized.IAuthTabCallback()) != null) {
                    onnavigationevent.onExtraCallback("button_text", charSequenceIAuthTabCallback);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public boolean extraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCallback = extraCallbackWithResult().extraCallback();
        int i4 = IAuthTabCallbackStubProxy + 119;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return zExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTrackable(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        extraCallbackWithResult().setTrackable(z);
        int i4 = IAuthTabCallbackStubProxy + 53;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static abstract class IAuthTabCallback<T> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onMinimized = 0;
            private static int onPostMessage = 1;
            private String IAuthTabCallback;
            private boolean IAuthTabCallbackDefault;
            private DialogInterface.OnDismissListener IAuthTabCallbackStub;
            private initMiniApp IAuthTabCallbackStubProxy;
            private final Set<String> IAuthTabCallback_Parcel;
            private CharSequence access000;
            private CharSequence access100;
            private boolean asBinder;
            private final Context asInterface;
            private String extraCallback;
            private int getInterfaceDescriptor;
            private int onExtraCallback;
            private DialogInterface.OnCancelListener onExtraCallbackWithResult;
            private int onNavigationEvent;
            private boolean onTransact;
            private String onWarmupCompleted;
            private final Map<String, Object> readTypedObject;
            private static char[] ICustomTabsCallback = {32632, 32576, 32626, 32588, 32582, 32625, 32580, 32633};
            private static int writeTypedObject = -1184333843;
            private static boolean extraCallbackWithResult = true;
            private static boolean onMessageChannelReady = true;

            public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
                int i7 = ~i5;
                int i8 = ~(i7 | i2);
                int i9 = (~(i7 | i6)) | i8 | (~(i2 | i6));
                int i10 = (~(i7 | (~i6))) | i8;
                int i11 = (~(i6 | i5)) | (~((~i2) | i5));
                int i12 = i5 + i2 + i3 + (929125522 * i4) + (1849324972 * i);
                int i13 = i12 * i12;
                int i14 = (1419820811 * i5) + 1146290176 + ((-1462591364) * i2) + (i9 * 470851707) + (470851707 * i10) + ((-470851707) * i11) + ((-1933443072) * i3) + ((-291241984) * i4) + (1012400128 * i) + ((-1810169856) * i13);
                int i15 = ((i5 * (-2058557531)) - 518432259) + (i2 * (-2058559676)) + (i9 * (-715)) + (i10 * (-715)) + (i11 * 715) + (i3 * (-2058558961)) + (i4 * 548722830) + (i * 1549712660) + (i13 * (-2087387136));
                int i16 = i14 + (i15 * i15 * (-343605248));
                return i16 != 1 ? i16 != 2 ? i16 != 3 ? i16 != 4 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
            }

            private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
                char[] cArr2 = ICustomTabsCallback;
                long j = 0;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i3 = 0;
                    while (i3 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 78 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                            }
                            cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            i3++;
                            j = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                try {
                    Object[] objArr3 = {Integer.valueOf(writeTypedObject)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 74, TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    int i4 = 1052772399;
                    if (onMessageChannelReady) {
                        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                        char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 63, 12214 - TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), 260110015, false, "v", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            i4 = 1052772399;
                        }
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    if (!extraCallbackWithResult) {
                        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                        char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                            int i5 = $11 + 7;
                            $10 = i5 % 128;
                            int i6 = i5 % 2;
                            cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                        }
                        objArr[0] = new String(cArr5);
                        return;
                    }
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                    char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i7 = $11 + 91;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 63 - View.resolveSize(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                    objArr[0] = new String(cArr6);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            public IAuthTabCallback(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "");
                this.asInterface = context;
                this.extraCallback = _UrlKt.FRAGMENT_ENCODE_SET;
                this.IAuthTabCallback = _UrlKt.FRAGMENT_ENCODE_SET;
                this.onWarmupCompleted = _UrlKt.FRAGMENT_ENCODE_SET;
                this.onTransact = true;
                this.IAuthTabCallbackDefault = true;
                this.IAuthTabCallback_Parcel = new LinkedHashSet();
                this.readTypedObject = new LinkedHashMap();
                if (this.IAuthTabCallbackStubProxy == null && !(!(context instanceof initMiniApp))) {
                    int i = onPostMessage + 3;
                    onMinimized = i % 128;
                    int i2 = i % 2;
                    this.IAuthTabCallbackStubProxy = (initMiniApp) context;
                    int i3 = 2 % 2;
                }
                int i4 = onPostMessage + Imgproc.COLOR_YUV2RGB_YVYU;
                onMinimized = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 68 / 0;
                }
            }

            public final Context asBinder() {
                int i = 2 % 2;
                int i2 = onPostMessage;
                int i3 = i2 + 89;
                onMinimized = i3 % 128;
                int i4 = i3 % 2;
                Context context = this.asInterface;
                int i5 = i2 + 103;
                onMinimized = i5 % 128;
                int i6 = i5 % 2;
                return context;
            }

            public final CharSequence access100() {
                int i = 2 % 2;
                int i2 = onPostMessage + 95;
                int i3 = i2 % 128;
                onMinimized = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                CharSequence charSequence = this.access100;
                int i4 = i3 + 107;
                onPostMessage = i4 % 128;
                int i5 = i4 % 2;
                return charSequence;
            }

            public final CharSequence IAuthTabCallback_Parcel() {
                int i = 2 % 2;
                int i2 = onPostMessage + 35;
                onMinimized = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.access000;
                }
                throw null;
            }

            public final int access000() {
                int i = 2 % 2;
                int i2 = onMinimized + 7;
                onPostMessage = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.getInterfaceDescriptor;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final String extraCallback() {
                int i = 2 % 2;
                int i2 = onMinimized;
                int i3 = i2 + 1;
                onPostMessage = i3 % 128;
                int i4 = i3 % 2;
                String str = this.extraCallback;
                int i5 = i2 + 43;
                onPostMessage = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final int IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onMinimized + 21;
                onPostMessage = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.onNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onPostMessage;
                int i3 = i2 + 41;
                onMinimized = i3 % 128;
                if (i3 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                String str = this.IAuthTabCallback;
                int i4 = i2 + 57;
                onMinimized = i4 % 128;
                int i5 = i4 % 2;
                return str;
            }

            public final int onNavigationEvent() {
                int i;
                int i2 = 2 % 2;
                int i3 = onPostMessage;
                int i4 = i3 + 33;
                onMinimized = i4 % 128;
                if (i4 % 2 != 0) {
                    i = this.onExtraCallback;
                    int i5 = 41 / 0;
                } else {
                    i = this.onExtraCallback;
                }
                int i6 = i3 + 31;
                onMinimized = i6 % 128;
                int i7 = i6 % 2;
                return i;
            }

            public final String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onPostMessage + 73;
                int i3 = i2 % 128;
                onMinimized = i3;
                if (i2 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                String str = this.onWarmupCompleted;
                int i4 = i3 + 17;
                onPostMessage = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 66 / 0;
                }
                return str;
            }

            private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
                IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
                int i = 2 % 2;
                int i2 = onMinimized;
                int i3 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
                onPostMessage = i3 % 128;
                int i4 = i3 % 2;
                boolean z = iAuthTabCallback.onTransact;
                int i5 = i2 + 71;
                onPostMessage = i5 % 128;
                int i6 = i5 % 2;
                return Boolean.valueOf(z);
            }

            private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
                IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
                int i = 2 % 2;
                int i2 = onPostMessage + 73;
                int i3 = i2 % 128;
                onMinimized = i3;
                int i4 = i2 % 2;
                boolean z = iAuthTabCallback.IAuthTabCallbackDefault;
                int i5 = i3 + 19;
                onPostMessage = i5 % 128;
                int i6 = i5 % 2;
                return Boolean.valueOf(z);
            }

            public final DialogInterface.OnCancelListener onTransact() {
                int i = 2 % 2;
                int i2 = onPostMessage;
                int i3 = i2 + 125;
                onMinimized = i3 % 128;
                int i4 = i3 % 2;
                DialogInterface.OnCancelListener onCancelListener = this.onExtraCallbackWithResult;
                int i5 = i2 + 3;
                onMinimized = i5 % 128;
                if (i5 % 2 == 0) {
                    return onCancelListener;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final DialogInterface.OnDismissListener asInterface() {
                int i = 2 % 2;
                int i2 = onMinimized;
                int i3 = i2 + 3;
                onPostMessage = i3 % 128;
                int i4 = i3 % 2;
                DialogInterface.OnDismissListener onDismissListener = this.IAuthTabCallbackStub;
                int i5 = i2 + 123;
                onPostMessage = i5 % 128;
                int i6 = i5 % 2;
                return onDismissListener;
            }

            public final boolean writeTypedObject() {
                int i = 2 % 2;
                int i2 = onMinimized + 97;
                int i3 = i2 % 128;
                onPostMessage = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                boolean z = this.asBinder;
                int i4 = i3 + 9;
                onMinimized = i4 % 128;
                int i5 = i4 % 2;
                return z;
            }

            public final initMiniApp IAuthTabCallbackStubProxy() {
                int i = 2 % 2;
                int i2 = onMinimized;
                int i3 = i2 + 81;
                onPostMessage = i3 % 128;
                int i4 = i3 % 2;
                initMiniApp initminiapp = this.IAuthTabCallbackStubProxy;
                int i5 = i2 + 67;
                onPostMessage = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 52 / 0;
                }
                return initminiapp;
            }

            public final Set<String> getInterfaceDescriptor() {
                Set<String> set;
                int i = 2 % 2;
                int i2 = onPostMessage;
                int i3 = i2 + 79;
                onMinimized = i3 % 128;
                if (i3 % 2 != 0) {
                    set = this.IAuthTabCallback_Parcel;
                    int i4 = 65 / 0;
                } else {
                    set = this.IAuthTabCallback_Parcel;
                }
                int i5 = i2 + 51;
                onMinimized = i5 % 128;
                if (i5 % 2 == 0) {
                    return set;
                }
                throw null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final T onNavigationEvent(@NotNull initMiniApp initminiapp) {
                int i = 2 % 2;
                int i2 = onMinimized + 109;
                onPostMessage = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(initminiapp, "");
                    this.IAuthTabCallbackStubProxy = initminiapp;
                    return this;
                }
                Intrinsics.checkNotNullParameter(initminiapp, "");
                this.IAuthTabCallbackStubProxy = initminiapp;
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final T onNavigationEvent(@NotNull CharSequence charSequence) throws Throwable {
                int i = 2 % 2;
                int i2 = onPostMessage + 23;
                onMinimized = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(charSequence, "");
                this.access100 = charSequence;
                Map<String, Object> map = this.readTypedObject;
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-126, -120, -122, -121, -122}, 127 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
                map.put(((String) objArr[0]).intern(), charSequence);
                int i4 = onPostMessage + 13;
                onMinimized = i4 % 128;
                int i5 = i4 % 2;
                return this;
            }

            public final T onNavigationEvent(int i) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onPostMessage + 5;
                onMinimized = i3 % 128;
                int i4 = i3 % 2;
                String string = this.asInterface.getString(i);
                Intrinsics.checkNotNullExpressionValue(string, "");
                T tOnNavigationEvent = onNavigationEvent(string);
                int i5 = onPostMessage + 99;
                onMinimized = i5 % 128;
                int i6 = i5 % 2;
                return tOnNavigationEvent;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final T onExtraCallbackWithResult(@NotNull CharSequence charSequence) throws Throwable {
                Map<String, Object> map;
                Object obj;
                int i = 2 % 2;
                int i2 = onPostMessage + 113;
                onMinimized = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(charSequence, "");
                    this.access000 = charSequence;
                    map = this.readTypedObject;
                    Object[] objArr = new Object[1];
                    a(null, null, new byte[]{-126, -123, -124, -125, -125, -126, -127}, 56 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
                    obj = objArr[0];
                } else {
                    Intrinsics.checkNotNullParameter(charSequence, "");
                    this.access000 = charSequence;
                    map = this.readTypedObject;
                    Object[] objArr2 = new Object[1];
                    a(null, null, new byte[]{-126, -123, -124, -125, -125, -126, -127}, 127 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
                    obj = objArr2[0];
                }
                map.put(((String) obj).intern(), charSequence);
                int i3 = onMinimized + 105;
                onPostMessage = i3 % 128;
                int i4 = i3 % 2;
                return this;
            }

            private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
                IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i = 2 % 2;
                int i2 = onPostMessage + 19;
                onMinimized = i2 % 128;
                int i3 = i2 % 2;
                String string = iAuthTabCallback.asInterface.getString(iIntValue);
                Intrinsics.checkNotNullExpressionValue(string, "");
                Object objOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(string);
                int i4 = onPostMessage + 29;
                onMinimized = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 92 / 0;
                }
                return objOnExtraCallbackWithResult;
            }

            private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
                IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i = 2 % 2;
                int i2 = onMinimized;
                int i3 = i2 + 89;
                onPostMessage = i3 % 128;
                int i4 = i3 % 2;
                iAuthTabCallback.getInterfaceDescriptor = iIntValue;
                int i5 = i2 + 47;
                onPostMessage = i5 % 128;
                int i6 = i5 % 2;
                return iAuthTabCallback;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final T onNavigationEvent(boolean z) {
                int i = 2 % 2;
                int i2 = onMinimized + 77;
                int i3 = i2 % 128;
                onPostMessage = i3;
                int i4 = i2 % 2;
                this.onTransact = z;
                if (i4 == 0) {
                    int i5 = 29 / 0;
                }
                int i6 = i3 + 37;
                onMinimized = i6 % 128;
                int i7 = i6 % 2;
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final T IAuthTabCallback(@NotNull DialogInterface.OnCancelListener onCancelListener) {
                int i = 2 % 2;
                int i2 = onMinimized + 31;
                onPostMessage = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(onCancelListener, "");
                    this.onExtraCallbackWithResult = onCancelListener;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(onCancelListener, "");
                this.onExtraCallbackWithResult = onCancelListener;
                int i3 = onMinimized + 91;
                onPostMessage = i3 % 128;
                int i4 = i3 % 2;
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final T IAuthTabCallback(@NotNull DialogInterface.OnDismissListener onDismissListener) {
                int i = 2 % 2;
                int i2 = onMinimized + 59;
                onPostMessage = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(onDismissListener, "");
                    this.IAuthTabCallbackStub = onDismissListener;
                    return this;
                }
                Intrinsics.checkNotNullParameter(onDismissListener, "");
                this.IAuthTabCallbackStub = onDismissListener;
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
                IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
                String[] strArr = (String[]) objArr[1];
                int i = 2 % 2;
                int i2 = onPostMessage + 47;
                onMinimized = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(strArr, "");
                    iAuthTabCallback.IAuthTabCallback_Parcel.clear();
                    CollectionsKt__MutableCollectionsKt.addAll(iAuthTabCallback.IAuthTabCallback_Parcel, strArr);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(strArr, "");
                iAuthTabCallback.IAuthTabCallback_Parcel.clear();
                CollectionsKt__MutableCollectionsKt.addAll(iAuthTabCallback.IAuthTabCallback_Parcel, strArr);
                int i3 = onPostMessage + 15;
                onMinimized = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 8 / 0;
                }
                return iAuthTabCallback;
            }

            public final TdsDialogV1 onExtraCallback() {
                int i = 2 % 2;
                TdsDialogV1 tdsDialogV1 = new TdsDialogV1(this);
                TdsDialogV1.onWarmupCompleted(-2061227946, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsDialogV1, access8000.access100(getInstallVersion.onNavigationEvent(this.readTypedObject, this.IAuthTabCallback_Parcel))}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 2061227946);
                int i2 = onPostMessage + 57;
                onMinimized = i2 % 128;
                int i3 = i2 % 2;
                return tdsDialogV1;
            }

            public final TdsDialogV1 readTypedObject() {
                int i = 2 % 2;
                int i2 = onPostMessage + 55;
                onMinimized = i2 % 128;
                int i3 = i2 % 2;
                TdsDialogV1 tdsDialogV1OnExtraCallback = onExtraCallback();
                tdsDialogV1OnExtraCallback.show();
                int i4 = onPostMessage + 3;
                onMinimized = i4 % 128;
                if (i4 % 2 == 0) {
                    return tdsDialogV1OnExtraCallback;
                }
                throw null;
            }

            public final boolean IAuthTabCallbackDefault() {
                int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                return ((Boolean) onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1660598739, iOnExtraCallback2, iOnExtraCallback3, -1660598738, new Object[]{this}, iOnExtraCallback)).booleanValue();
            }

            /* renamed from: im.toss.uikit.widget.dialog.TdsDialogV1$onExtraCallbackWithResult$IAuthTabCallback$onExtraCallbackWithResult, reason: collision with other inner class name */
            public static final class C0007onExtraCallbackWithResult {
                private static int onTransact = 1;
                private static int onWarmupCompleted;
                private final DialogInterface.OnClickListener IAuthTabCallback;
                private final TdsButtonV1View.asInterface onExtraCallback;
                private final boolean onExtraCallbackWithResult;
                private final CharSequence onNavigationEvent;

                public C0007onExtraCallbackWithResult(@NotNull CharSequence charSequence, @Nullable DialogInterface.OnClickListener onClickListener, @Nullable TdsButtonV1View.asInterface asinterface, boolean z) {
                    Intrinsics.checkNotNullParameter(charSequence, "");
                    this.onNavigationEvent = charSequence;
                    this.IAuthTabCallback = onClickListener;
                    this.onExtraCallback = asinterface;
                    this.onExtraCallbackWithResult = z;
                }

                public final CharSequence IAuthTabCallback() {
                    int i = 2 % 2;
                    int i2 = onTransact;
                    int i3 = i2 + 103;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    CharSequence charSequence = this.onNavigationEvent;
                    int i5 = i2 + 25;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return charSequence;
                }

                public final DialogInterface.OnClickListener onExtraCallback() {
                    int i = 2 % 2;
                    int i2 = onTransact;
                    int i3 = i2 + 57;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    DialogInterface.OnClickListener onClickListener = this.IAuthTabCallback;
                    int i5 = i2 + 13;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return onClickListener;
                }

                public final TdsButtonV1View.asInterface onWarmupCompleted() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 105;
                    int i3 = i2 % 128;
                    onTransact = i3;
                    int i4 = i2 % 2;
                    TdsButtonV1View.asInterface asinterface = this.onExtraCallback;
                    int i5 = i3 + 115;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return asinterface;
                }

                public final boolean onExtraCallbackWithResult() {
                    int i = 2 % 2;
                    int i2 = onTransact;
                    int i3 = i2 + 57;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    boolean z = this.onExtraCallbackWithResult;
                    int i5 = i2 + 37;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return z;
                }
            }

            public final boolean IAuthTabCallbackStub() {
                int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                return ((Boolean) onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1374093804, iOnExtraCallback2, iOnExtraCallback3, 1374093804, new Object[]{this}, iOnExtraCallback)).booleanValue();
            }

            public final T onExtraCallbackWithResult(int i) {
                Object[] objArr = {this, Integer.valueOf(i)};
                int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                return (T) onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -868633265, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 868633269, objArr, iOnExtraCallback);
            }

            public final T onExtraCallbackWithResult(@NotNull String... strArr) {
                int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                return (T) onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 427718757, iOnExtraCallback2, iOnExtraCallback3, -427718754, new Object[]{this, strArr}, iOnExtraCallback);
            }

            public final T onExtraCallback(int i) {
                Object[] objArr = {this, Integer.valueOf(i)};
                int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                return (T) onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -963962278, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 963962280, objArr, iOnExtraCallback);
            }

            public static final class onWarmupCompleted extends IAuthTabCallback<onWarmupCompleted> {
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;
                private C0007onExtraCallbackWithResult IAuthTabCallback;
                private C0007onExtraCallbackWithResult onExtraCallbackWithResult;

                public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
                    int i7 = ~i5;
                    int i8 = ~i4;
                    int i9 = ~(i7 | i8);
                    int i10 = (~(i7 | i3)) | i9;
                    int i11 = (~((~i3) | i7 | i4)) | (~(i8 | i5));
                    int i12 = i5 + i4 + i6 + (531708263 * i2) + ((-608630064) * i);
                    int i13 = i12 * i12;
                    int i14 = (i5 * (-228234701)) + 730857472 + ((-228234701) * i4) + (i9 * (-1010133554)) + (i10 * (-1010133554)) + ((-1010133554) * i11) + ((-1238368256) * i6) + ((-45088768) * i2) + ((-419430400) * i) + ((-1471938560) * i13);
                    int i15 = ((i5 * (-1679524527)) - 150938974) + (i4 * (-1679524527)) + (i9 * 282) + (i10 * 282) + (i11 * 282) + (i6 * (-1679524245)) + (i2 * (-166744051)) + (i * 2062148848) + (i13 * (-865337344));
                    if (i14 + (i15 * i15 * (-1617166336)) == 1) {
                        return onNavigationEvent(objArr);
                    }
                    boolean z = false;
                    onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[0];
                    CharSequence charSequence = (CharSequence) objArr[1];
                    DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) objArr[2];
                    TdsButtonV1View.asInterface asinterface = (TdsButtonV1View.asInterface) objArr[3];
                    boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
                    int iIntValue = ((Number) objArr[5]).intValue();
                    Object obj = objArr[6];
                    int i16 = 2 % 2;
                    int i17 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
                    int i18 = i17 % 128;
                    onExtraCallback = i18;
                    int i19 = i17 % 2;
                    if ((iIntValue & 2) != 0) {
                        int i20 = i18 + 93;
                        onWarmupCompleted = i20 % 128;
                        int i21 = i20 % 2;
                        onClickListener = null;
                    }
                    if ((iIntValue & 4) != 0) {
                        int i22 = onWarmupCompleted + 37;
                        onExtraCallback = i22 % 128;
                        int i23 = i22 % 2;
                        asinterface = null;
                    }
                    if ((iIntValue & 8) != 0) {
                        int i24 = onWarmupCompleted + 67;
                        onExtraCallback = i24 % 128;
                        int i25 = i24 % 2;
                    } else {
                        z = zBooleanValue;
                    }
                    return onwarmupcompleted.onNavigationEvent(charSequence, onClickListener, asinterface, z);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public onWarmupCompleted(@NotNull Context context) {
                    super(context);
                    Intrinsics.checkNotNullParameter(context, "");
                }

                public final C0007onExtraCallbackWithResult extraCallbackWithResult() {
                    C0007onExtraCallbackWithResult c0007onExtraCallbackWithResult;
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted;
                    int i3 = i2 + 71;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        c0007onExtraCallbackWithResult = this.onExtraCallbackWithResult;
                        int i4 = 3 / 0;
                    } else {
                        c0007onExtraCallbackWithResult = this.onExtraCallbackWithResult;
                    }
                    int i5 = i2 + 123;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        return c0007onExtraCallbackWithResult;
                    }
                    throw null;
                }

                public final C0007onExtraCallbackWithResult ICustomTabsCallback() {
                    C0007onExtraCallbackWithResult c0007onExtraCallbackWithResult;
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 123;
                    int i3 = i2 % 128;
                    onWarmupCompleted = i3;
                    if (i2 % 2 != 0) {
                        c0007onExtraCallbackWithResult = this.IAuthTabCallback;
                        int i4 = 58 / 0;
                    } else {
                        c0007onExtraCallbackWithResult = this.IAuthTabCallback;
                    }
                    int i5 = i3 + 9;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        return c0007onExtraCallbackWithResult;
                    }
                    throw null;
                }

                public static /* synthetic */ onWarmupCompleted onExtraCallback(onWarmupCompleted onwarmupcompleted, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, TdsButtonV1View.asInterface asinterface, boolean z, int i, Object obj) {
                    int i2 = 2 % 2;
                    if ((i & 2) != 0) {
                        int i3 = onWarmupCompleted + 11;
                        onExtraCallback = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i4 = 2 / 0;
                        }
                        onClickListener = null;
                    }
                    if ((i & 4) != 0) {
                        asinterface = null;
                    }
                    if ((i & 8) != 0) {
                        int i5 = onExtraCallback + 125;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        z = false;
                    }
                    onWarmupCompleted onWarmupCompleted2 = onwarmupcompleted.onWarmupCompleted(charSequence, onClickListener, asinterface, z);
                    int i7 = onExtraCallback + 11;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    return onWarmupCompleted2;
                }

                public final onWarmupCompleted onWarmupCompleted(@NotNull CharSequence charSequence, @Nullable DialogInterface.OnClickListener onClickListener, @Nullable TdsButtonV1View.asInterface asinterface, boolean z) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(charSequence, "");
                    this.onExtraCallbackWithResult = new C0007onExtraCallbackWithResult(charSequence, onClickListener, asinterface, z);
                    int i2 = onWarmupCompleted + 53;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return this;
                }

                public static /* synthetic */ onWarmupCompleted onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted, int i, DialogInterface.OnClickListener onClickListener, TdsButtonV1View.asInterface asinterface, boolean z, int i2, Object obj) {
                    int i3 = 2 % 2;
                    if ((i2 & 2) != 0) {
                        int i4 = onExtraCallback + 47;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        onClickListener = null;
                    }
                    if ((i2 & 4) != 0) {
                        asinterface = null;
                    }
                    if ((i2 & 8) != 0) {
                        int i6 = onWarmupCompleted + 5;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        z = false;
                    }
                    return (onWarmupCompleted) onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), new Object[]{onwarmupcompleted, Integer.valueOf(i), onClickListener, asinterface, Boolean.valueOf(z)}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -241032027, 241032028, JsParamKeys.onExtraCallbackWithResult());
                }

                private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
                    onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[0];
                    int iIntValue = ((Number) objArr[1]).intValue();
                    DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) objArr[2];
                    TdsButtonV1View.asInterface asinterface = (TdsButtonV1View.asInterface) objArr[3];
                    boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 15;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    String string = onwarmupcompleted.asBinder().getString(iIntValue);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    onWarmupCompleted onWarmupCompleted2 = onwarmupcompleted.onWarmupCompleted(string, onClickListener, asinterface, zBooleanValue);
                    int i4 = onWarmupCompleted + 35;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        return onWarmupCompleted2;
                    }
                    throw null;
                }

                public final onWarmupCompleted onNavigationEvent(@NotNull CharSequence charSequence, @Nullable DialogInterface.OnClickListener onClickListener, @Nullable TdsButtonV1View.asInterface asinterface, boolean z) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(charSequence, "");
                    this.IAuthTabCallback = new C0007onExtraCallbackWithResult(charSequence, onClickListener, asinterface, z);
                    int i2 = onWarmupCompleted + 115;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        return this;
                    }
                    throw null;
                }

                public static /* synthetic */ onWarmupCompleted onExtraCallback(onWarmupCompleted onwarmupcompleted, int i, DialogInterface.OnClickListener onClickListener, TdsButtonV1View.asInterface asinterface, boolean z, int i2, Object obj) {
                    int i3 = 2 % 2;
                    int i4 = onWarmupCompleted;
                    int i5 = i4 + 85;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    if ((i2 & 2) != 0) {
                        onClickListener = null;
                    }
                    if ((i2 & 4) != 0) {
                        asinterface = null;
                    }
                    if ((i2 & 8) != 0) {
                        int i7 = i4 + 35;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        z = false;
                    }
                    onWarmupCompleted onWarmupCompleted2 = onwarmupcompleted.onWarmupCompleted(i, onClickListener, asinterface, z);
                    int i9 = onExtraCallback + 107;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    return onWarmupCompleted2;
                }

                public final onWarmupCompleted onWarmupCompleted(int i, @Nullable DialogInterface.OnClickListener onClickListener, @Nullable TdsButtonV1View.asInterface asinterface, boolean z) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 39;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    String string = asBinder().getString(i);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    onWarmupCompleted onwarmupcompletedOnNavigationEvent = onNavigationEvent(string, onClickListener, asinterface, z);
                    int i5 = onWarmupCompleted + 81;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        return onwarmupcompletedOnNavigationEvent;
                    }
                    throw null;
                }

                public static /* synthetic */ onWarmupCompleted onWarmupCompleted(onWarmupCompleted onwarmupcompleted, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, TdsButtonV1View.asInterface asinterface, boolean z, int i, Object obj) {
                    Object[] objArr = {onwarmupcompleted, charSequence, onClickListener, asinterface, Boolean.valueOf(z), Integer.valueOf(i), obj};
                    int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
                    return (onWarmupCompleted) onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), objArr, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1871975236, 1871975236, iOnExtraCallbackWithResult2);
                }

                public final onWarmupCompleted IAuthTabCallback(int i, @Nullable DialogInterface.OnClickListener onClickListener, @Nullable TdsButtonV1View.asInterface asinterface, boolean z) {
                    Object[] objArr = {this, Integer.valueOf(i), onClickListener, asinterface, Boolean.valueOf(z)};
                    int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
                    return (onWarmupCompleted) onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), objArr, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -241032027, 241032028, iOnExtraCallbackWithResult2);
                }
            }

            /* renamed from: im.toss.uikit.widget.dialog.TdsDialogV1$onExtraCallbackWithResult$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
            public static final class C0006IAuthTabCallback extends IAuthTabCallback<C0006IAuthTabCallback> {
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;
                private C0007onExtraCallbackWithResult IAuthTabCallback;
                private Pair<? extends CharSequence, ? extends DialogInterface.OnClickListener> onExtraCallback;
                private int onWarmupCompleted;

                public final int ICustomTabsCallback() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 15;
                    int i3 = i2 % 128;
                    onExtraCallbackWithResult = i3;
                    if (i2 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int i4 = this.onWarmupCompleted;
                    int i5 = i3 + 53;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 11 / 0;
                    }
                    return i4;
                }

                public final C0007onExtraCallbackWithResult onMinimized() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 61;
                    int i3 = i2 % 128;
                    onNavigationEvent = i3;
                    int i4 = i2 % 2;
                    C0007onExtraCallbackWithResult c0007onExtraCallbackWithResult = this.IAuthTabCallback;
                    int i5 = i3 + 57;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return c0007onExtraCallbackWithResult;
                }

                public final Pair<CharSequence, DialogInterface.OnClickListener> extraCallbackWithResult() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 125;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        return this.onExtraCallback;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        }

        private onExtraCallbackWithResult() {
        }

        @JvmStatic
        public final IAuthTabCallback.onWarmupCompleted onExtraCallback(@NotNull Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            IAuthTabCallback.onWarmupCompleted onwarmupcompleted = new IAuthTabCallback.onWarmupCompleted(context);
            int i2 = onWarmupCompleted + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0118  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.onCreate(bundle);
            AFj1uSDK5 aFj1uSDK5OnExtraCallbackWithResult = AFj1uSDK5.onExtraCallbackWithResult(getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(aFj1uSDK5OnExtraCallbackWithResult, "");
            this.onExtraCallback = aFj1uSDK5OnExtraCallbackWithResult;
            obj.hashCode();
            throw null;
        }
        super.onCreate(bundle);
        AFj1uSDK5 aFj1uSDK5OnExtraCallbackWithResult2 = AFj1uSDK5.onExtraCallbackWithResult(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(aFj1uSDK5OnExtraCallbackWithResult2, "");
        this.onExtraCallback = aFj1uSDK5OnExtraCallbackWithResult2;
        if (aFj1uSDK5OnExtraCallbackWithResult2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK5OnExtraCallbackWithResult2 = null;
        }
        TdsRoundLayout tdsRoundLayout = aFj1uSDK5OnExtraCallbackWithResult2.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout.getContext(), "");
        tdsRoundLayout.setRadius(varyMatches.IAuthTabCallback(Float.valueOf(24.0f), r1));
        onActivityResized();
        AFj1uSDK5 aFj1uSDK5 = this.onExtraCallback;
        if (aFj1uSDK5 == null) {
            int i3 = IAuthTabCallbackStubProxy + 59;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK5 = null;
        }
        setContentView((View) aFj1uSDK5.onWarmupCompleted());
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().setImportantForAccessibility(2);
            RepeatableSpec.onExtraCallbackWithResult(window, false);
            window.setLayout(-1, -1);
        }
        onWarmupCompleted(-1699559296, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{this}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1699559297);
        onExtraCallbackWithResult(this.onExtraCallbackWithResult.access100());
        IAuthTabCallback(this.onExtraCallbackWithResult.IAuthTabCallback_Parcel());
        setCancelable(((Boolean) onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1660598739, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1660598738, new Object[]{this.onExtraCallbackWithResult}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback())).booleanValue());
        setOnCancelListener(this.onExtraCallbackWithResult.onTransact());
        setOnDismissListener(this.onExtraCallbackWithResult.asInterface());
        onExtraCallbackWithResult.IAuthTabCallback<?> iAuthTabCallback = this.onExtraCallbackWithResult;
        if (iAuthTabCallback instanceof onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) {
            int i4 = IAuthTabCallbackStubProxy + 63;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            onPostMessage();
            CharSequence charSequenceAccess100 = ((onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) this.onExtraCallbackWithResult).access100();
            if (charSequenceAccess100 != null) {
                int i6 = IAuthTabCallbackStubProxy + 13;
                IAuthTabCallback_Parcel = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 3 / 0;
                    if (charSequenceAccess100.length() == 0) {
                        onExtraCallbackWithResult(((onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) this.onExtraCallbackWithResult).IAuthTabCallback_Parcel());
                        IAuthTabCallback((CharSequence) null);
                    }
                    IAuthTabCallback(0);
                    onExtraCallbackWithResult(0);
                    onWarmupCompleted(0);
                    onNavigationEvent((onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) this.onExtraCallbackWithResult);
                } else {
                    if (charSequenceAccess100.length() == 0) {
                    }
                    IAuthTabCallback(0);
                    onExtraCallbackWithResult(0);
                    onWarmupCompleted(0);
                    onNavigationEvent((onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) this.onExtraCallbackWithResult);
                }
            }
        } else if (iAuthTabCallback instanceof onExtraCallbackWithResult.IAuthTabCallback.C0006IAuthTabCallback) {
            int i8 = IAuthTabCallback_Parcel + 55;
            IAuthTabCallbackStubProxy = i8 % 128;
            if (i8 % 2 != 0) {
                ((onExtraCallbackWithResult.IAuthTabCallback.C0006IAuthTabCallback) iAuthTabCallback).extraCallback().length();
                obj.hashCode();
                throw null;
            }
            if (((onExtraCallbackWithResult.IAuthTabCallback.C0006IAuthTabCallback) iAuthTabCallback).extraCallback().length() > 0) {
                onExtraCallbackWithResult(((onExtraCallbackWithResult.IAuthTabCallback.C0006IAuthTabCallback) this.onExtraCallbackWithResult).extraCallback());
            } else {
                onWarmupCompleted(((onExtraCallbackWithResult.IAuthTabCallback.C0006IAuthTabCallback) this.onExtraCallbackWithResult).access000());
            }
            if (((onExtraCallbackWithResult.IAuthTabCallback.C0006IAuthTabCallback) this.onExtraCallbackWithResult).onExtraCallbackWithResult().length() > 0) {
                onExtraCallback(((onExtraCallbackWithResult.IAuthTabCallback.C0006IAuthTabCallback) this.onExtraCallbackWithResult).onExtraCallbackWithResult());
            } else {
                onExtraCallbackWithResult(((onExtraCallbackWithResult.IAuthTabCallback.C0006IAuthTabCallback) this.onExtraCallbackWithResult).IAuthTabCallback());
            }
            if (((onExtraCallbackWithResult.IAuthTabCallback.C0006IAuthTabCallback) this.onExtraCallbackWithResult).onWarmupCompleted().length() > 0) {
                onNavigationEvent(((onExtraCallbackWithResult.IAuthTabCallback.C0006IAuthTabCallback) this.onExtraCallbackWithResult).onWarmupCompleted());
            } else {
                IAuthTabCallback(((onExtraCallbackWithResult.IAuthTabCallback.C0006IAuthTabCallback) this.onExtraCallbackWithResult).onNavigationEvent());
            }
            onWarmupCompleted((onExtraCallbackWithResult.IAuthTabCallback.C0006IAuthTabCallback) this.onExtraCallbackWithResult);
            int i9 = IAuthTabCallbackStubProxy + 59;
            IAuthTabCallback_Parcel = i9 % 128;
            int i10 = i9 % 2;
        }
        onMinimized();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r7.length() > 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r7.length() > 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        r5.onExtraCallback("button_text", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(initSDK.onNavigationEvent onnavigationevent, CharSequence charSequence, CharSequence charSequence2) {
        int i = 2 % 2;
        if (charSequence.length() > 0 && charSequence2.length() == 0) {
            int i2 = IAuthTabCallback_Parcel + 43;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                onnavigationevent.onExtraCallback("button_text", charSequence);
                return;
            }
            onnavigationevent.onExtraCallback("button_text", charSequence);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (charSequence.length() == 0) {
            int i3 = IAuthTabCallback_Parcel + 103;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 0;
            }
        }
        if (charSequence.length() > 0) {
            int i5 = IAuthTabCallback_Parcel + 23;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            if (charSequence2.length() > 0) {
                onnavigationevent.onExtraCallback("primary_button_text", charSequence);
                onnavigationevent.onExtraCallback("secondary_button_text", charSequence2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onActivityResized() {
        AFj1uSDK5 aFj1uSDK5;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        AFj1uSDK5 aFj1uSDK52 = null;
        if (i2 % 2 != 0) {
            aFj1uSDK5 = this.onExtraCallback;
            int i3 = 50 / 0;
            if (aFj1uSDK5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK5 = null;
            }
        } else {
            aFj1uSDK5 = this.onExtraCallback;
            if (aFj1uSDK5 == null) {
            }
        }
        View view = aFj1uSDK5.getInterfaceDescriptor;
        Context context = getContext();
        int i4 = R.string.uikit_content_desc_close;
        view.setContentDescription(context.getString(i4));
        AFj1uSDK5 aFj1uSDK53 = this.onExtraCallback;
        if (aFj1uSDK53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK53 = null;
        }
        View view2 = aFj1uSDK53.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        SuspendAnimationKtExternalSyntheticLambda4.IAuthTabCallback iAuthTabCallback = SuspendAnimationKtExternalSyntheticLambda4.IAuthTabCallback.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(iAuthTabCallback, "");
        setProtocolsokhttp.IAuthTabCallback(view2, iAuthTabCallback, getContext().getString(i4));
        AFj1uSDK5 aFj1uSDK54 = this.onExtraCallback;
        if (aFj1uSDK54 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK54 = null;
        }
        ConstraintLayout constraintLayoutOnWarmupCompleted = aFj1uSDK54.onWarmupCompleted();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnWarmupCompleted, "");
        Iterator itIAuthTabCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(constraintLayoutOnWarmupCompleted).IAuthTabCallback();
        Object obj = null;
        while (itIAuthTabCallback.hasNext()) {
            Object next = itIAuthTabCallback.next();
            View view3 = (View) next;
            if (view3.getVisibility() == 0 && view3.isImportantForAccessibility()) {
                obj = next;
            }
        }
        View view4 = (View) obj;
        if (view4 != null) {
            int i5 = IAuthTabCallbackStubProxy;
            int i6 = i5 + 113;
            IAuthTabCallback_Parcel = i6 % 128;
            if (i6 % 2 == 0) {
                aFj1uSDK52.hashCode();
                throw null;
            }
            AFj1uSDK5 aFj1uSDK55 = this.onExtraCallback;
            if (aFj1uSDK55 == null) {
                int i7 = i5 + 1;
                IAuthTabCallback_Parcel = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK55 = null;
            }
            aFj1uSDK55.getInterfaceDescriptor.setAccessibilityTraversalAfter(view4.getId());
        }
        AFj1uSDK5 aFj1uSDK56 = this.onExtraCallback;
        if (aFj1uSDK56 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            aFj1uSDK52 = aFj1uSDK56;
        }
        aFj1uSDK52.getInterfaceDescriptor.setOnClickListener(new TdsDialogV1$.ExternalSyntheticLambda0(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(TdsDialogV1 tdsDialogV1, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Context context = tdsDialogV1.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (varyFields.onWarmupCompleted(context)) {
            int i4 = IAuthTabCallbackStubProxy + 11;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 37 / 0;
                if (tdsDialogV1.isShowing()) {
                    int i6 = IAuthTabCallback_Parcel + 105;
                    IAuthTabCallbackStubProxy = i6 % 128;
                    int i7 = i6 % 2;
                    tdsDialogV1.dismiss();
                    if (i7 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }
            } else if (tdsDialogV1.isShowing()) {
            }
        }
        int i8 = IAuthTabCallback_Parcel + 89;
        IAuthTabCallbackStubProxy = i8 % 128;
        int i9 = i8 % 2;
    }

    private final void onMinimized() {
        int i = 2 % 2;
        if (onInstallReferrerSetupFinished.onWarmupCompleted.IAuthTabCallbackStub()) {
            int i2 = IAuthTabCallbackStubProxy + 125;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            if (this.onExtraCallbackWithResult.IAuthTabCallbackStubProxy() != null && onInstallReferrerServiceDisconnected.onExtraCallback.onExtraCallback()) {
                AFj1uSDK5 aFj1uSDK5 = this.onExtraCallback;
                if (aFj1uSDK5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    aFj1uSDK5 = null;
                }
                TextView textView = aFj1uSDK5.IAuthTabCallbackStubProxy;
                textView.setVisibility(0);
                textView.setOnClickListener(new TdsDialogV1$.ExternalSyntheticLambda6(this));
            }
        }
        int i4 = IAuthTabCallback_Parcel + 57;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        TdsDialogV1 tdsDialogV1 = (TdsDialogV1) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onInstallReferrerServiceDisconnected.onExtraCallback.onNavigationEvent(tdsDialogV1);
        int i4 = IAuthTabCallback_Parcel + 89;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCancelable(final boolean z) {
        AFj1uSDK5 aFj1uSDK5;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 105;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            super.setCancelable(z);
            aFj1uSDK5 = this.onExtraCallback;
            int i3 = 83 / 0;
            if (aFj1uSDK5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i4 = IAuthTabCallbackStubProxy + 91;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                aFj1uSDK5 = null;
            }
        } else {
            super.setCancelable(z);
            aFj1uSDK5 = this.onExtraCallback;
            if (aFj1uSDK5 == null) {
            }
        }
        aFj1uSDK5.getInterfaceDescriptor.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.dialog.TdsDialogV1$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 17;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                boolean z2 = z;
                if (i8 != 0) {
                    TdsDialogV1.onWarmupCompleted(939312641, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{Boolean.valueOf(z2), this, view}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -939312639);
                    return;
                }
                TdsDialogV1.onWarmupCompleted(939312641, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{Boolean.valueOf(z2), this, view}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -939312639);
                throw null;
            }
        });
    }

    private static final void IAuthTabCallback(boolean z, TdsDialogV1 tdsDialogV1, View view) {
        int i = 2 % 2;
        if (z) {
            tdsDialogV1.cancel();
            int i2 = IAuthTabCallback_Parcel + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        Rally rally = tdsDialogV1.onTransact;
        if (rally == null || !rally.postMessage()) {
            AFj1uSDK5 aFj1uSDK5 = tdsDialogV1.onExtraCallback;
            if (aFj1uSDK5 == null) {
                int i4 = IAuthTabCallback_Parcel + 107;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK5 = null;
            }
            TdsRoundLayout tdsRoundLayout = aFj1uSDK5.asInterface;
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
            tdsDialogV1.onTransact = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted(tdsRoundLayout, deprecated_proxy.onNavigationEvent.onExtraCallbackWithResult(deprecated_proxySelector.SMALL, certificatePinner.X).onNavigationEvent(), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null), false, 1, (Object) null);
            Context context = tdsDialogV1.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            minFresh.onNavigationEvent(context, noStore.Companion.access100());
            int i5 = IAuthTabCallbackStubProxy + 53;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static final void onNavigationEvent(TdsRoundLayout tdsRoundLayout, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        tdsRoundLayout.setTranslationY(((Float) animatedValue).floatValue());
        int i4 = IAuthTabCallbackStubProxy + 61;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fb, code lost:
    
        if (r3 == null) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[PHI: r2 r6 r7 r8
      0x003c: PHI (r2v6 java.lang.Float) = (r2v5 java.lang.Float), (r2v31 java.lang.Float) binds: [B:8:0x003a, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x003c: PHI (r6v1 java.lang.Float) = (r6v0 java.lang.Float), (r6v30 java.lang.Float) binds: [B:8:0x003a, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x003c: PHI (r7v1 java.lang.Integer) = (r7v0 int), (r7v5 int) binds: [B:8:0x003a, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x003c: PHI (r8v1 android.view.Window) = (r8v0 android.view.Window), (r8v22 android.view.Window) binds: [B:8:0x003a, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onPostMessage() {
        Float fValueOf;
        int i;
        Float fValueOf2;
        Window window;
        onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted;
        onExtraCallbackWithResult.IAuthTabCallback.C0007onExtraCallbackWithResult c0007onExtraCallbackWithResultICustomTabsCallback;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 37;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            fValueOf = Float.valueOf(2.0f);
            i = 1;
            fValueOf2 = Float.valueOf(2.0f);
            window = getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.Base_CustomDialog_WindowAnimation);
            }
        } else {
            fValueOf = Float.valueOf(1.0f);
            i = 0;
            fValueOf2 = Float.valueOf(0.0f);
            window = getWindow();
            if (window != null) {
            }
        }
        Object systemService = getContext().getSystemService("power");
        AFj1uSDK5 aFj1uSDK5 = null;
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        int iOnExtraCallback = RequestBodyCompanion.onExtraCallback(this, authParams.BackgroundDim);
        if (powerManager != null && powerManager.isPowerSaveMode()) {
            AFj1uSDK5 aFj1uSDK52 = this.onExtraCallback;
            if (aFj1uSDK52 == null) {
                int i4 = IAuthTabCallbackStubProxy + 71;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK52 = null;
            }
            aFj1uSDK52.getInterfaceDescriptor.setBackgroundColor(iOnExtraCallback);
            AFj1uSDK5 aFj1uSDK53 = this.onExtraCallback;
            if (aFj1uSDK53 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i6 = IAuthTabCallback_Parcel + 27;
                IAuthTabCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
            } else {
                aFj1uSDK5 = aFj1uSDK53;
            }
            TdsRoundLayout tdsRoundLayout = aFj1uSDK5.asInterface;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(M_.onExtraCallback.onNavigationEvent(), 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new TdsDialogV1$.ExternalSyntheticLambda3(tdsRoundLayout));
            valueAnimatorOfFloat.setInterpolator(Address.onNavigationEvent.onExtraCallbackWithResult());
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.start();
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (!this.onExtraCallbackWithResult.writeTypedObject()) {
            int i8 = IAuthTabCallback_Parcel + 47;
            int i9 = i8 % 128;
            IAuthTabCallbackStubProxy = i9;
            int i10 = i8 % 2;
            onExtraCallbackWithResult.IAuthTabCallback<?> iAuthTabCallback = this.onExtraCallbackWithResult;
            boolean z = iAuthTabCallback instanceof onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted;
            if (z) {
                int i11 = i9 + 39;
                IAuthTabCallback_Parcel = i11 % 128;
                int i12 = i11 % 2;
                if (z) {
                    int i13 = i9 + 35;
                    IAuthTabCallback_Parcel = i13 % 128;
                    int i14 = i13 % 2;
                    onwarmupcompleted = (onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) iAuthTabCallback;
                } else {
                    onwarmupcompleted = null;
                }
                if (onwarmupcompleted != null) {
                    int i15 = IAuthTabCallback_Parcel + 93;
                    IAuthTabCallbackStubProxy = i15 % 128;
                    int i16 = i15 % 2;
                    c0007onExtraCallbackWithResultICustomTabsCallback = onwarmupcompleted.ICustomTabsCallback();
                } else {
                    c0007onExtraCallbackWithResultICustomTabsCallback = null;
                }
            }
            pxToDp.IAuthTabCallback iAuthTabCallback2 = pxToDp.IAuthTabCallback.onExtraCallback;
            AFj1uSDK5 aFj1uSDK54 = this.onExtraCallback;
            if (aFj1uSDK54 == null) {
                int i17 = IAuthTabCallback_Parcel + 25;
                IAuthTabCallbackStubProxy = i17 % 128;
                if (i17 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    aFj1uSDK5.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK54 = null;
            }
            TdsRoundLayout tdsRoundLayout2 = aFj1uSDK54.asInterface;
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, "");
            deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
            Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRoundLayout2, isMuted.getInterfaceDescriptor(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), fValueOf2, fValueOf, (Function1) null, 4, (Object) null), Float.valueOf(((Integer) varyMatches.onNavigationEvent(486882314, -486882312, new Object[]{getContext(), 100}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback())).intValue()), fValueOf2, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            AFj1uSDK5 aFj1uSDK55 = this.onExtraCallback;
            if (aFj1uSDK55 == null) {
                int i18 = IAuthTabCallbackStubProxy + 65;
                IAuthTabCallback_Parcel = i18 % 128;
                int i19 = i18 % 2;
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK55 = null;
            }
            View view = aFj1uSDK55.getInterfaceDescriptor;
            Intrinsics.checkNotNullExpressionValue(view, "");
            isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback2, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{rally, (Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.onWarmupCompleted((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), i, Integer.valueOf(iOnExtraCallback), (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null), false, 1, (Object) null);
            return;
        }
        int i20 = IAuthTabCallbackStubProxy + 109;
        IAuthTabCallback_Parcel = i20 % 128;
        int i21 = i20 % 2;
        pxToDp.IAuthTabCallback iAuthTabCallback3 = pxToDp.IAuthTabCallback.onExtraCallback;
        AFj1uSDK5 aFj1uSDK56 = this.onExtraCallback;
        if (aFj1uSDK56 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK56 = null;
        }
        TdsRoundLayout tdsRoundLayout3 = aFj1uSDK56.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout3, "");
        deprecated_certificatePinner deprecated_certificatepinner2 = deprecated_certificatePinner.onExtraCallbackWithResult;
        Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRoundLayout3, isMuted.asBinder(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner2.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), fValueOf2, fValueOf, (Function1) null, 4, (Object) null), Float.valueOf(0.8f), fValueOf, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        AFj1uSDK5 aFj1uSDK57 = this.onExtraCallback;
        if (aFj1uSDK57 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK57 = null;
        }
        View view2 = aFj1uSDK57.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback3, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{rally2, (Rally) RallysKt.onWarmupCompleted(new Object[]{view2, isMuted.onWarmupCompleted((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner2.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), i, Integer.valueOf(iOnExtraCallback), (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null), false, 1, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onGlobalLayout() {
        float f;
        int i = 2 % 2;
        AFj1uSDK5 aFj1uSDK5 = this.onExtraCallback;
        AFj1uSDK5 aFj1uSDK52 = null;
        if (aFj1uSDK5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK5 = null;
        }
        int measuredHeight = aFj1uSDK5.onExtraCallbackWithResult.getMeasuredHeight();
        AFj1uSDK5 aFj1uSDK53 = this.onExtraCallback;
        if (aFj1uSDK53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK53 = null;
        }
        MaxHeightScrollView maxHeightScrollView = aFj1uSDK53.ICustomTabsCallback;
        AFj1uSDK5 aFj1uSDK54 = this.onExtraCallback;
        if (aFj1uSDK54 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK54 = null;
        }
        maxHeightScrollView.setMaxHeight(aFj1uSDK54.asInterface.getMaxHeight() - measuredHeight);
        if (this.onExtraCallbackWithResult instanceof onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) {
            AFj1uSDK5 aFj1uSDK55 = this.onExtraCallback;
            if (aFj1uSDK55 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK55 = null;
            }
            int i2 = 0;
            if (!aFj1uSDK55.ICustomTabsCallback.canScrollVertically(-1)) {
                int i3 = IAuthTabCallback_Parcel + 81;
                int i4 = i3 % 128;
                IAuthTabCallbackStubProxy = i4;
                if (i3 % 2 != 0) {
                    aFj1uSDK52.hashCode();
                    throw null;
                }
                AFj1uSDK5 aFj1uSDK56 = this.onExtraCallback;
                if (aFj1uSDK56 == null) {
                    int i5 = i4 + 123;
                    IAuthTabCallback_Parcel = i5 % 128;
                    int i6 = i5 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    aFj1uSDK56 = null;
                }
                boolean z = aFj1uSDK56.ICustomTabsCallback.canScrollVertically(1);
                AFj1uSDK5 aFj1uSDK57 = this.onExtraCallback;
                if (aFj1uSDK57 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    aFj1uSDK57 = null;
                }
                Typography6 typography6 = aFj1uSDK57.access100;
                Intrinsics.checkNotNullExpressionValue(typography6, "");
                if (!(!z)) {
                    int i7 = IAuthTabCallback_Parcel + 13;
                    IAuthTabCallbackStubProxy = i7 % 128;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                    f = 20.0f;
                } else {
                    f = 4.0f;
                }
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                typography6.setPadding(0, 0, 0, varyMatches.IAuthTabCallback(Float.valueOf(f), context));
                AFj1uSDK5 aFj1uSDK58 = this.onExtraCallback;
                if (aFj1uSDK58 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    aFj1uSDK58 = null;
                }
                View view = aFj1uSDK58.IAuthTabCallbackDefault;
                if (z) {
                    int i8 = IAuthTabCallbackStubProxy + Imgproc.COLOR_YUV2RGBA_YVYU;
                    IAuthTabCallback_Parcel = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    i2 = 4;
                }
                view.setVisibility(i2);
            }
        }
        AFj1uSDK5 aFj1uSDK59 = this.onExtraCallback;
        if (aFj1uSDK59 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            aFj1uSDK52 = aFj1uSDK59;
        }
        aFj1uSDK52.asInterface.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted) {
        AFj1uSDK5 aFj1uSDK5;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        AFj1uSDK5 aFj1uSDK52 = null;
        if (i2 % 2 != 0) {
            aFj1uSDK5 = this.onExtraCallback;
            int i3 = 44 / 0;
            if (aFj1uSDK5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK5 = null;
            }
        } else {
            aFj1uSDK5 = this.onExtraCallback;
            if (aFj1uSDK5 == null) {
            }
        }
        aFj1uSDK5.asInterface.setBackgroundColor(RequestBodyCompanion.onExtraCallback(this, authParams.BackgroundFloated100));
        AFj1uSDK5 aFj1uSDK53 = this.onExtraCallback;
        if (aFj1uSDK53 == null) {
            int i4 = IAuthTabCallback_Parcel + 43;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i5 = 67 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            }
            int i6 = IAuthTabCallbackStubProxy + 37;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            aFj1uSDK53 = null;
        }
        aFj1uSDK53.extraCallbackWithResult.setTextColor(RequestBodyCompanion.onExtraCallback(this, authParams.TextPrimary));
        AFj1uSDK5 aFj1uSDK54 = this.onExtraCallback;
        if (aFj1uSDK54 == null) {
            int i8 = IAuthTabCallback_Parcel + 33;
            IAuthTabCallbackStubProxy = i8 % 128;
            int i9 = i8 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK54 = null;
        }
        aFj1uSDK54.access100.setTextColor(RequestBodyCompanion.onExtraCallback(this, authParams.TextTertiary));
        IAuthTabCallback(onwarmupcompleted.extraCallbackWithResult());
        onExtraCallbackWithResult(onwarmupcompleted.ICustomTabsCallback());
        AFj1uSDK5 aFj1uSDK55 = this.onExtraCallback;
        if (aFj1uSDK55 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            aFj1uSDK52 = aFj1uSDK55;
        }
        TdsRoundLayout tdsRoundLayout = aFj1uSDK52.IAuthTabCallback_Parcel;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        setProtocolsokhttp.onExtraCallback(tdsRoundLayout);
        onWarmupCompleted(-1725777819, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{this}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1725777822);
    }

    private final void onWarmupCompleted(onExtraCallbackWithResult.IAuthTabCallback.C0006IAuthTabCallback c0006IAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        IAuthTabCallback_Parcel = i2 % 128;
        AFj1uSDK5 aFj1uSDK5 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        AFj1uSDK5 aFj1uSDK52 = this.onExtraCallback;
        if (aFj1uSDK52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK52 = null;
        }
        aFj1uSDK52.asInterface.setBackgroundColor(c0006IAuthTabCallback.ICustomTabsCallback());
        if (VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(c0006IAuthTabCallback.ICustomTabsCallback()) > 0.5d) {
            AFj1uSDK5 aFj1uSDK53 = this.onExtraCallback;
            if (aFj1uSDK53 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK53 = null;
            }
            Typography4 typography4 = aFj1uSDK53.extraCallbackWithResult;
            deprecated_scheme deprecated_schemeVar = deprecated_scheme.onExtraCallbackWithResult;
            int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            typography4.setTextColor(((Integer) deprecated_scheme.onNavigationEvent(-1038990432, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, new Object[]{deprecated_schemeVar}, 1038990433, iOnNavigationEvent)).intValue());
            AFj1uSDK5 aFj1uSDK54 = this.onExtraCallback;
            if (aFj1uSDK54 == null) {
                int i3 = IAuthTabCallbackStubProxy + 71;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                aFj1uSDK5 = aFj1uSDK54;
            }
            aFj1uSDK5.access100.setTextColor(deprecated_schemeVar.IEngagementSignalsCallback_Parcel());
        } else {
            AFj1uSDK5 aFj1uSDK55 = this.onExtraCallback;
            if (aFj1uSDK55 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK55 = null;
            }
            Typography4 typography42 = aFj1uSDK55.extraCallbackWithResult;
            matchesCertificate matchescertificate = matchesCertificate.onExtraCallback;
            typography42.setTextColor(matchescertificate.onSessionEnded());
            AFj1uSDK5 aFj1uSDK56 = this.onExtraCallback;
            if (aFj1uSDK56 == null) {
                int i5 = IAuthTabCallbackStubProxy + 59;
                IAuthTabCallback_Parcel = i5 % 128;
                if (i5 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    int i6 = 11 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                }
            } else {
                aFj1uSDK5 = aFj1uSDK56;
            }
            aFj1uSDK5.access100.setTextColor(matchescertificate.IEngagementSignalsCallback_Parcel());
        }
        onExtraCallback(c0006IAuthTabCallback.onMinimized());
        onNavigationEvent(c0006IAuthTabCallback.extraCallbackWithResult());
    }

    private final void onExtraCallbackWithResult(CharSequence charSequence) {
        int i;
        int i2 = 2 % 2;
        AFj1uSDK5 aFj1uSDK5 = this.onExtraCallback;
        Object obj = null;
        if (aFj1uSDK5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK5 = null;
        }
        aFj1uSDK5.extraCallbackWithResult.setText(charSequence);
        AFj1uSDK5 aFj1uSDK52 = this.onExtraCallback;
        if (aFj1uSDK52 == null) {
            int i3 = IAuthTabCallback_Parcel + 115;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK52 = null;
        }
        Typography4 typography4 = aFj1uSDK52.extraCallbackWithResult;
        AFj1uSDK5 aFj1uSDK53 = this.onExtraCallback;
        if (aFj1uSDK53 == null) {
            int i5 = IAuthTabCallbackStubProxy + 109;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK53 = null;
        }
        if (aFj1uSDK53.extraCallbackWithResult.length() > 0) {
            int i7 = IAuthTabCallbackStubProxy + 33;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            i = 0;
        } else {
            i = 8;
        }
        typography4.setVisibility(i);
        AFj1uSDK5 aFj1uSDK54 = this.onExtraCallback;
        if (aFj1uSDK54 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK54 = null;
        }
        aFj1uSDK54.extraCallbackWithResult.setMovementMethod(LinkMovementMethod.getInstance());
        AFj1uSDK5 aFj1uSDK55 = this.onExtraCallback;
        if (aFj1uSDK55 == null) {
            int i9 = IAuthTabCallbackStubProxy + 103;
            IAuthTabCallback_Parcel = i9 % 128;
            int i10 = i9 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            if (i10 == 0) {
                obj.hashCode();
                throw null;
            }
            aFj1uSDK55 = null;
        }
        ViewCompat.IAuthTabCallback(aFj1uSDK55.extraCallbackWithResult, true);
        int i11 = IAuthTabCallback_Parcel + 95;
        IAuthTabCallbackStubProxy = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public final void IAuthTabCallback(@Nullable CharSequence charSequence) {
        int i;
        int i2 = 2 % 2;
        AFj1uSDK5 aFj1uSDK5 = this.onExtraCallback;
        AFj1uSDK5 aFj1uSDK52 = null;
        if (aFj1uSDK5 == null) {
            int i3 = IAuthTabCallback_Parcel + 75;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK5 = null;
        }
        aFj1uSDK5.access100.setText(charSequence);
        AFj1uSDK5 aFj1uSDK53 = this.onExtraCallback;
        if (aFj1uSDK53 == null) {
            int i5 = IAuthTabCallback_Parcel + 77;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i7 = IAuthTabCallback_Parcel + 93;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            aFj1uSDK53 = null;
        }
        Typography6 typography6 = aFj1uSDK53.access100;
        AFj1uSDK5 aFj1uSDK54 = this.onExtraCallback;
        if (aFj1uSDK54 == null) {
            int i9 = IAuthTabCallbackStubProxy + 21;
            IAuthTabCallback_Parcel = i9 % 128;
            int i10 = i9 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK54 = null;
        }
        if (aFj1uSDK54.access100.length() > 0) {
            int i11 = IAuthTabCallbackStubProxy + 111;
            IAuthTabCallback_Parcel = i11 % 128;
            int i12 = i11 % 2;
            i = 0;
        } else {
            i = 8;
        }
        typography6.setVisibility(i);
        AFj1uSDK5 aFj1uSDK55 = this.onExtraCallback;
        if (aFj1uSDK55 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            aFj1uSDK52 = aFj1uSDK55;
        }
        aFj1uSDK52.access100.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 99;
        IAuthTabCallbackStubProxy = i3 % 128;
        AFj1uSDK5 aFj1uSDK5 = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (i == 0) {
            AFj1uSDK5 aFj1uSDK52 = this.onExtraCallback;
            if (aFj1uSDK52 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                aFj1uSDK5 = aFj1uSDK52;
            }
            aFj1uSDK5.writeTypedObject.setVisibility(8);
            return;
        }
        AFj1uSDK5 aFj1uSDK53 = this.onExtraCallback;
        if (aFj1uSDK53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK53 = null;
        }
        aFj1uSDK53.writeTypedObject.setVisibility(0);
        AFj1uSDK5 aFj1uSDK54 = this.onExtraCallback;
        if (aFj1uSDK54 == null) {
            int i4 = IAuthTabCallbackStubProxy + 45;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            aFj1uSDK5 = aFj1uSDK54;
        }
        aFj1uSDK5.writeTypedObject.setImageResource(i);
    }

    public final void onExtraCallbackWithResult(@Nullable String str) {
        int i = 2 % 2;
        AFj1uSDK5 aFj1uSDK5 = null;
        if (str != null) {
            int i2 = IAuthTabCallbackStubProxy + 119;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                str.length();
                aFj1uSDK5.hashCode();
                throw null;
            }
            if (str.length() != 0) {
                int i3 = IAuthTabCallback_Parcel + 119;
                IAuthTabCallbackStubProxy = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                AFj1uSDK5 aFj1uSDK52 = this.onExtraCallback;
                if (aFj1uSDK52 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    aFj1uSDK52 = null;
                }
                aFj1uSDK52.writeTypedObject.setVisibility(0);
                AFj1uSDK5 aFj1uSDK53 = this.onExtraCallback;
                if (aFj1uSDK53 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                } else {
                    aFj1uSDK5 = aFj1uSDK53;
                }
                TdsImageView tdsImageView = aFj1uSDK5.writeTypedObject;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                TdsImageView.setImage$default(tdsImageView, str, (Function1) null, (Function1) null, 6, (Object) null);
                return;
            }
        }
        AFj1uSDK5 aFj1uSDK54 = this.onExtraCallback;
        if (aFj1uSDK54 == null) {
            int i4 = IAuthTabCallbackStubProxy + 89;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            aFj1uSDK5 = aFj1uSDK54;
        }
        aFj1uSDK5.writeTypedObject.setVisibility(8);
    }

    public final void onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        AFj1uSDK5 aFj1uSDK5 = null;
        if (i == 0) {
            AFj1uSDK5 aFj1uSDK52 = this.onExtraCallback;
            if (aFj1uSDK52 == null) {
                int i3 = IAuthTabCallbackStubProxy + 57;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                aFj1uSDK5 = aFj1uSDK52;
            }
            aFj1uSDK5.onNavigationEvent.setVisibility(8);
            return;
        }
        AFj1uSDK5 aFj1uSDK53 = this.onExtraCallback;
        if (aFj1uSDK53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK53 = null;
        }
        aFj1uSDK53.onNavigationEvent.setVisibility(0);
        AFj1uSDK5 aFj1uSDK54 = this.onExtraCallback;
        if (aFj1uSDK54 == null) {
            int i5 = IAuthTabCallbackStubProxy + 31;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            aFj1uSDK5 = aFj1uSDK54;
        }
        aFj1uSDK5.onNavigationEvent.setImageResource(i);
    }

    public final void onExtraCallback(@Nullable String str) {
        int i = 2 % 2;
        AFj1uSDK5 aFj1uSDK5 = null;
        if (str == null || str.length() == 0) {
            AFj1uSDK5 aFj1uSDK52 = this.onExtraCallback;
            if (aFj1uSDK52 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                aFj1uSDK5 = aFj1uSDK52;
            }
            aFj1uSDK5.onNavigationEvent.setVisibility(8);
            return;
        }
        int i2 = IAuthTabCallbackStubProxy + 65;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        AFj1uSDK5 aFj1uSDK53 = this.onExtraCallback;
        if (aFj1uSDK53 == null) {
            int i5 = i3 + 23;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK5.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK53 = null;
        }
        aFj1uSDK53.onNavigationEvent.setVisibility(0);
        AFj1uSDK5 aFj1uSDK54 = this.onExtraCallback;
        if (aFj1uSDK54 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            aFj1uSDK5 = aFj1uSDK54;
        }
        TdsImageView tdsImageView = aFj1uSDK5.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        TdsImageView.setImage$default(tdsImageView, str, (Function1) null, (Function1) null, 6, (Object) null);
    }

    public final void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        AFj1uSDK5 aFj1uSDK5 = null;
        if (i == 0) {
            AFj1uSDK5 aFj1uSDK52 = this.onExtraCallback;
            if (aFj1uSDK52 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i3 = IAuthTabCallback_Parcel + 9;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
            } else {
                int i5 = IAuthTabCallback_Parcel + 9;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                aFj1uSDK5 = aFj1uSDK52;
            }
            aFj1uSDK5.onWarmupCompleted.setVisibility(8);
            return;
        }
        AFj1uSDK5 aFj1uSDK53 = this.onExtraCallback;
        if (aFj1uSDK53 == null) {
            int i7 = IAuthTabCallback_Parcel + 63;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK53 = null;
        }
        aFj1uSDK53.onWarmupCompleted.setVisibility(0);
        AFj1uSDK5 aFj1uSDK54 = this.onExtraCallback;
        if (aFj1uSDK54 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            aFj1uSDK5 = aFj1uSDK54;
        }
        aFj1uSDK5.onWarmupCompleted.setImageResource(i);
    }

    public final void onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        AFj1uSDK5 aFj1uSDK5 = null;
        if (str == null || str.length() == 0) {
            AFj1uSDK5 aFj1uSDK52 = this.onExtraCallback;
            if (aFj1uSDK52 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                aFj1uSDK5 = aFj1uSDK52;
            }
            aFj1uSDK5.onWarmupCompleted.setVisibility(8);
            return;
        }
        int i2 = IAuthTabCallback_Parcel + 17;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        AFj1uSDK5 aFj1uSDK53 = this.onExtraCallback;
        if (aFj1uSDK53 == null) {
            int i5 = i3 + 33;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK5.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK53 = null;
        }
        aFj1uSDK53.onWarmupCompleted.setVisibility(0);
        AFj1uSDK5 aFj1uSDK54 = this.onExtraCallback;
        if (aFj1uSDK54 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            aFj1uSDK5 = aFj1uSDK54;
        }
        TdsImageView tdsImageView = aFj1uSDK5.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        TdsImageView.setImage$default(tdsImageView, str, (Function1) null, (Function1) null, 6, (Object) null);
    }

    private final void IAuthTabCallback(onExtraCallbackWithResult.IAuthTabCallback.C0007onExtraCallbackWithResult c0007onExtraCallbackWithResult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 33;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        AFj1uSDK5 aFj1uSDK5 = this.onExtraCallback;
        if (aFj1uSDK5 == null) {
            int i5 = i3 + 47;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i7 = IAuthTabCallbackStubProxy + 3;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            aFj1uSDK5 = null;
        }
        DialogButton dialogButton = aFj1uSDK5.readTypedObject;
        Intrinsics.checkNotNullExpressionValue(dialogButton, "");
        onExtraCallbackWithResult(dialogButton, c0007onExtraCallbackWithResult, -1);
    }

    private final void onExtraCallbackWithResult(onExtraCallbackWithResult.IAuthTabCallback.C0007onExtraCallbackWithResult c0007onExtraCallbackWithResult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 109;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        AFj1uSDK5 aFj1uSDK5 = this.onExtraCallback;
        if (aFj1uSDK5 == null) {
            int i5 = i2 + 65;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK5 = null;
        }
        DialogButton dialogButton = aFj1uSDK5.access000;
        Intrinsics.checkNotNullExpressionValue(dialogButton, "");
        onExtraCallbackWithResult(dialogButton, c0007onExtraCallbackWithResult, -2);
    }

    private static final void onTransact(TdsDialogV1 tdsDialogV1, View view) {
        Pair pairIAuthTabCallback;
        int i = 2 % 2;
        onExtraCallbackWithResult.IAuthTabCallback<?> iAuthTabCallback = tdsDialogV1.onExtraCallbackWithResult;
        Intrinsics.checkNotNull(iAuthTabCallback, "");
        onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = (onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) iAuthTabCallback;
        if (onwarmupcompleted.extraCallbackWithResult() != null) {
            pairIAuthTabCallback = getWrite.IAuthTabCallback(onwarmupcompleted.extraCallbackWithResult(), -1);
        } else if (onwarmupcompleted.ICustomTabsCallback() != null) {
            int i2 = IAuthTabCallbackStubProxy + 63;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            pairIAuthTabCallback = getWrite.IAuthTabCallback(onwarmupcompleted.ICustomTabsCallback(), -2);
        } else {
            pairIAuthTabCallback = getWrite.IAuthTabCallback(null, null);
        }
        onExtraCallbackWithResult.IAuthTabCallback.C0007onExtraCallbackWithResult c0007onExtraCallbackWithResult = (onExtraCallbackWithResult.IAuthTabCallback.C0007onExtraCallbackWithResult) pairIAuthTabCallback.onExtraCallbackWithResult();
        Integer num = (Integer) pairIAuthTabCallback.IAuthTabCallback();
        if (c0007onExtraCallbackWithResult != null && num != null) {
            int i4 = IAuthTabCallbackStubProxy + 55;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            DialogInterface.OnClickListener onClickListenerOnExtraCallback = c0007onExtraCallbackWithResult.onExtraCallback();
            if (onClickListenerOnExtraCallback != null) {
                onClickListenerOnExtraCallback.onClick(tdsDialogV1, num.intValue());
            }
        }
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        if (((Boolean) onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1374093804, iOnExtraCallback2, iOnExtraCallback3, 1374093804, new Object[]{onwarmupcompleted}, iOnExtraCallback)).booleanValue()) {
            tdsDialogV1.dismiss();
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TdsButtonV1View tdsButtonV1View;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2 = 0;
        final TdsDialogV1 tdsDialogV1 = (TdsDialogV1) objArr[0];
        int i3 = 2 % 2;
        AFj1uSDK5 aFj1uSDK5 = tdsDialogV1.onExtraCallback;
        if (aFj1uSDK5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK5 = null;
        }
        FlexboxLayout flexboxLayout = aFj1uSDK5.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(flexboxLayout, "");
        if (!flexboxLayout.isLaidOut() || flexboxLayout.isLayoutRequested()) {
            flexboxLayout.addOnLayoutChangeListener(tdsDialogV1.new onNavigationEvent());
        } else {
            AFj1uSDK5 aFj1uSDK52 = (AFj1uSDK5) onWarmupCompleted(785598908, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsDialogV1}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -785598904);
            if (aFj1uSDK52 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK52 = null;
            }
            FlexboxLayout flexboxLayout2 = aFj1uSDK52.onExtraCallback;
            int width = flexboxLayout2.getWidth();
            int paddingLeft = flexboxLayout2.getPaddingLeft();
            int paddingRight = flexboxLayout2.getPaddingRight();
            AFj1uSDK5 aFj1uSDK53 = (AFj1uSDK5) onWarmupCompleted(785598908, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsDialogV1}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -785598904);
            if (aFj1uSDK53 == null) {
                int i4 = IAuthTabCallback_Parcel + 65;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK53 = null;
            }
            FlexboxLayout flexboxLayout3 = aFj1uSDK53.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(flexboxLayout3, "");
            int childCount = flexboxLayout3.getChildCount();
            int i6 = 0;
            while (i6 < childCount) {
                int i7 = IAuthTabCallbackStubProxy + 87;
                IAuthTabCallback_Parcel = i7 % 128;
                int i8 = i7 % 2;
                View childAt = flexboxLayout3.getChildAt(i6);
                FlexboxLayout.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
                }
                FlexboxLayout.LayoutParams layoutParams2 = layoutParams;
                int i9 = ((width - paddingLeft) - paddingRight) / 2;
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if (marginLayoutParams2 != null) {
                    int i10 = IAuthTabCallback_Parcel + 43;
                    IAuthTabCallbackStubProxy = i10 % 128;
                    int i11 = i10 % 2;
                    i = marginLayoutParams2.leftMargin;
                } else {
                    i = i2;
                }
                ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                    int i12 = IAuthTabCallback_Parcel + 109;
                    IAuthTabCallbackStubProxy = i12 % 128;
                    if (i12 % 2 != 0) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
                        int i13 = 74 / 0;
                    } else {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
                    }
                } else {
                    marginLayoutParams = null;
                }
                layoutParams2.setMinWidth((i9 - i) - (marginLayoutParams != null ? marginLayoutParams.rightMargin : 0));
                childAt.setLayoutParams(layoutParams2);
                i6++;
                i2 = 0;
            }
            AFj1uSDK5 aFj1uSDK54 = (AFj1uSDK5) onWarmupCompleted(785598908, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsDialogV1}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -785598904);
            if (aFj1uSDK54 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK54 = null;
            }
            aFj1uSDK54.onExtraCallback.post(tdsDialogV1.new onExtraCallback());
        }
        AFj1uSDK5 aFj1uSDK55 = tdsDialogV1.onExtraCallback;
        if (aFj1uSDK55 == null) {
            int i14 = IAuthTabCallbackStubProxy + 21;
            IAuthTabCallback_Parcel = i14 % 128;
            if (i14 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK55 = null;
        }
        if (aFj1uSDK55.readTypedObject.getVisibility() == 0) {
            AFj1uSDK5 aFj1uSDK56 = tdsDialogV1.onExtraCallback;
            if (aFj1uSDK56 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK56 = null;
            }
            if (aFj1uSDK56.access000.getVisibility() == 0) {
                AFj1uSDK5 aFj1uSDK57 = tdsDialogV1.onExtraCallback;
                if (aFj1uSDK57 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    aFj1uSDK57 = null;
                }
                aFj1uSDK57.IAuthTabCallback_Parcel.setVisibility(8);
                return null;
            }
        }
        AFj1uSDK5 aFj1uSDK58 = tdsDialogV1.onExtraCallback;
        if (aFj1uSDK58 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK58 = null;
        }
        if (aFj1uSDK58.readTypedObject.getVisibility() != 0) {
            int i15 = IAuthTabCallback_Parcel;
            int i16 = i15 + 71;
            IAuthTabCallbackStubProxy = i16 % 128;
            int i17 = i16 % 2;
            AFj1uSDK5 aFj1uSDK59 = tdsDialogV1.onExtraCallback;
            if (aFj1uSDK59 == null) {
                int i18 = i15 + 51;
                IAuthTabCallbackStubProxy = i18 % 128;
                int i19 = i18 % 2;
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK59 = null;
            }
            if (aFj1uSDK59.access000.getVisibility() != 0) {
                return null;
            }
        }
        AFj1uSDK5 aFj1uSDK510 = tdsDialogV1.onExtraCallback;
        if (aFj1uSDK510 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK510 = null;
        }
        if (aFj1uSDK510.readTypedObject.getVisibility() == 0) {
            AFj1uSDK5 aFj1uSDK511 = tdsDialogV1.onExtraCallback;
            if (aFj1uSDK511 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK511 = null;
            }
            tdsButtonV1View = aFj1uSDK511.readTypedObject;
        } else {
            AFj1uSDK5 aFj1uSDK512 = tdsDialogV1.onExtraCallback;
            if (aFj1uSDK512 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK512 = null;
            }
            tdsButtonV1View = aFj1uSDK512.access000;
        }
        Intrinsics.checkNotNull(tdsButtonV1View);
        AFj1uSDK5 aFj1uSDK513 = tdsDialogV1.onExtraCallback;
        if (aFj1uSDK513 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK513 = null;
        }
        aFj1uSDK513.extraCallback.setText(tdsButtonV1View.getText());
        AFj1uSDK5 aFj1uSDK514 = tdsDialogV1.onExtraCallback;
        if (aFj1uSDK514 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i20 = IAuthTabCallbackStubProxy + 99;
            IAuthTabCallback_Parcel = i20 % 128;
            int i21 = i20 % 2;
            aFj1uSDK514 = null;
        }
        aFj1uSDK514.IAuthTabCallback_Parcel.setMetadata(onCrash.DialogButton);
        AFj1uSDK5 aFj1uSDK515 = tdsDialogV1.onExtraCallback;
        if (aFj1uSDK515 == null) {
            int i22 = IAuthTabCallback_Parcel + 79;
            IAuthTabCallbackStubProxy = i22 % 128;
            if (i22 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK515 = null;
        }
        aFj1uSDK515.IAuthTabCallback_Parcel.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.dialog.TdsDialogV1$$ExternalSyntheticLambda4
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i23 = 2 % 2;
                int i24 = onWarmupCompleted + 15;
                onExtraCallback = i24 % 128;
                int i25 = i24 % 2;
                TdsDialogV1.onExtraCallback(this.f$0, view);
                if (i25 == 0) {
                    int i26 = 19 / 0;
                }
            }
        });
        tdsButtonV1View.setVisibility(8);
        AFj1uSDK5 aFj1uSDK516 = tdsDialogV1.onExtraCallback;
        if (aFj1uSDK516 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i23 = IAuthTabCallback_Parcel + 49;
            IAuthTabCallbackStubProxy = i23 % 128;
            int i24 = i23 % 2;
            aFj1uSDK516 = null;
        }
        aFj1uSDK516.IAuthTabCallback_Parcel.setVisibility(0);
        return null;
    }

    private final void onExtraCallback(onExtraCallbackWithResult.IAuthTabCallback.C0007onExtraCallbackWithResult c0007onExtraCallbackWithResult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 115;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        AFj1uSDK5 aFj1uSDK5 = this.onExtraCallback;
        if (aFj1uSDK5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i4 = IAuthTabCallbackStubProxy + 81;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 % 5;
            }
            aFj1uSDK5 = null;
        }
        DialogButton dialogButton = aFj1uSDK5.onTransact;
        Intrinsics.checkNotNullExpressionValue(dialogButton, "");
        onExtraCallbackWithResult(dialogButton, c0007onExtraCallbackWithResult, -1);
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        onExtraCallbackWithResult.IAuthTabCallback.C0007onExtraCallbackWithResult c0007onExtraCallbackWithResult = (onExtraCallbackWithResult.IAuthTabCallback.C0007onExtraCallbackWithResult) objArr[0];
        TdsDialogV1 tdsDialogV1 = (TdsDialogV1) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        DialogInterface.OnClickListener onClickListenerOnExtraCallback = c0007onExtraCallbackWithResult.onExtraCallback();
        if (onClickListenerOnExtraCallback != null) {
            onClickListenerOnExtraCallback.onClick(tdsDialogV1, iIntValue);
        }
        Object[] objArr2 = {tdsDialogV1.onExtraCallbackWithResult};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        Object obj = null;
        if (!(!((Boolean) onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1374093804, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1374093804, objArr2, iOnExtraCallback)).booleanValue())) {
            int i4 = IAuthTabCallback_Parcel + 29;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            tdsDialogV1.dismiss();
            if (i5 != 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i6 = IAuthTabCallbackStubProxy + 19;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private final void onExtraCallbackWithResult(TdsButtonV1View tdsButtonV1View, onExtraCallbackWithResult.IAuthTabCallback.C0007onExtraCallbackWithResult c0007onExtraCallbackWithResult, int i) {
        int i2 = 2 % 2;
        if (c0007onExtraCallbackWithResult == null) {
            int i3 = IAuthTabCallbackStubProxy + 19;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            tdsButtonV1View.setVisibility(8);
            return;
        }
        tdsButtonV1View.setVisibility(0);
        tdsButtonV1View.setText(c0007onExtraCallbackWithResult.IAuthTabCallback());
        tdsButtonV1View.setAllCaps(c0007onExtraCallbackWithResult.onExtraCallbackWithResult());
        tdsButtonV1View.setOnClickListener(new TdsDialogV1$.ExternalSyntheticLambda7(c0007onExtraCallbackWithResult, this, i));
        TdsButtonV1View.asInterface asinterfaceOnWarmupCompleted = c0007onExtraCallbackWithResult.onWarmupCompleted();
        if (asinterfaceOnWarmupCompleted != null) {
            tdsButtonV1View.setTheme(asinterfaceOnWarmupCompleted);
        }
        int i5 = IAuthTabCallback_Parcel + 111;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.app.Dialog
    protected void onStop() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            super.onStop();
            ICustomTabsCallbackDefault();
            int i3 = IAuthTabCallbackStubProxy + 91;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onStop();
        ICustomTabsCallbackDefault();
        throw null;
    }

    @Override // android.app.Dialog
    public void show() {
        String simpleName;
        Boolean boolValueOf;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
        if (activityIAuthTabCallback == null || activityIAuthTabCallback.isFinishing() || activityIAuthTabCallback.isDestroyed()) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            if (activityIAuthTabCallback != null) {
                int i4 = IAuthTabCallback_Parcel + 27;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                simpleName = activityIAuthTabCallback.getClass().getSimpleName();
            } else {
                simpleName = null;
            }
            if (activityIAuthTabCallback != null) {
                int i6 = IAuthTabCallbackStubProxy + 57;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                boolValueOf = Boolean.valueOf(activityIAuthTabCallback.isFinishing());
            } else {
                boolValueOf = null;
            }
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, "TdsDialogV1", "Cannot show dialog: activity is not valid (activity=" + simpleName + ", isFinishing=" + boolValueOf + ", isDestroyed=" + (activityIAuthTabCallback != null ? Boolean.valueOf(activityIAuthTabCallback.isDestroyed()) : null) + ")", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            return;
        }
        int i8 = IAuthTabCallback_Parcel + 103;
        IAuthTabCallbackStubProxy = i8 % 128;
        int i9 = i8 % 2;
        onActivityLayout();
        try {
            super.show();
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TdsDialogV1", "Cannot show dialog: " + e.getMessage(), e, (Map) null, 8, (Object) null);
        }
    }

    private final void onActivityLayout() {
        ComponentActivity componentActivity;
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle;
        int i = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ComponentActivity componentActivityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
        String simpleName = null;
        if (componentActivityIAuthTabCallback instanceof ComponentActivity) {
            int i2 = IAuthTabCallback_Parcel + 25;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            componentActivity = componentActivityIAuthTabCallback;
        } else {
            componentActivity = null;
        }
        if (componentActivity != null && (lifecycle = componentActivity.getLifecycle()) != null) {
            int i4 = IAuthTabCallbackStubProxy + 49;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                lifecycle.IAuthTabCallback(this.onWarmupCompleted);
                return;
            } else {
                lifecycle.IAuthTabCallback(this.onWarmupCompleted);
                throw null;
            }
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context2);
        if (activityIAuthTabCallback != null) {
            int i5 = IAuthTabCallbackStubProxy + 33;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            Class<?> cls = activityIAuthTabCallback.getClass();
            if (i6 == 0) {
                cls.getSimpleName();
                throw null;
            }
            simpleName = cls.getSimpleName();
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, "TdsDialogV1", "addImpressionObserver context.activity:" + simpleName, (Throwable) null, (Map) null, 12, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[PHI: r1
      0x0033: PHI (r1v6 android.app.Activity) = (r1v5 android.app.Activity), (r1v15 android.app.Activity) binds: [B:8:0x0031, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void ICustomTabsCallbackDefault() {
        Activity activityIAuthTabCallback;
        ComponentActivity componentActivity;
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
            int i3 = 44 / 0;
            if (activityIAuthTabCallback instanceof ComponentActivity) {
                componentActivity = (ComponentActivity) activityIAuthTabCallback;
                int i4 = IAuthTabCallbackStubProxy + 55;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
            } else {
                int i6 = IAuthTabCallbackStubProxy + 51;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                componentActivity = null;
            }
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context2);
            if (activityIAuthTabCallback instanceof ComponentActivity) {
            }
        }
        if (componentActivity == null || (lifecycle = componentActivity.getLifecycle()) == null) {
            return;
        }
        lifecycle.onExtraCallbackWithResult(this.onWarmupCompleted);
    }

    private final void onNavigationEvent(Pair<? extends CharSequence, ? extends DialogInterface.OnClickListener> pair) {
        int i = 2 % 2;
        AFj1uSDK5 aFj1uSDK5 = null;
        if (pair == null) {
            AFj1uSDK5 aFj1uSDK52 = this.onExtraCallback;
            if (aFj1uSDK52 == null) {
                int i2 = IAuthTabCallback_Parcel + 61;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                aFj1uSDK5 = aFj1uSDK52;
            }
            aFj1uSDK5.IAuthTabCallbackStub.setVisibility(8);
            int i4 = IAuthTabCallbackStubProxy + 111;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 69 / 0;
                return;
            }
            return;
        }
        AFj1uSDK5 aFj1uSDK53 = this.onExtraCallback;
        if (aFj1uSDK53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK53 = null;
        }
        aFj1uSDK53.IAuthTabCallbackStub.setVisibility(0);
        AFj1uSDK5 aFj1uSDK54 = this.onExtraCallback;
        if (aFj1uSDK54 == null) {
            int i6 = IAuthTabCallbackStubProxy + 95;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK54 = null;
        }
        aFj1uSDK54.IAuthTabCallbackStub.setText(pair.getFirst());
        AFj1uSDK5 aFj1uSDK55 = this.onExtraCallback;
        if (aFj1uSDK55 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i8 = IAuthTabCallback_Parcel + 73;
            IAuthTabCallbackStubProxy = i8 % 128;
            int i9 = i8 % 2;
            aFj1uSDK55 = null;
        }
        aFj1uSDK55.IAuthTabCallbackStub.setOnClickListener(new TdsDialogV1$.ExternalSyntheticLambda5(pair, this));
        int i10 = IAuthTabCallback_Parcel + 119;
        IAuthTabCallbackStubProxy = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        aFj1uSDK5.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(Pair pair, TdsDialogV1 tdsDialogV1, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 113;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) pair.getSecond();
        if (onClickListener != null) {
            onClickListener.onClick(tdsDialogV1, -1);
        }
        Object[] objArr = {tdsDialogV1.onExtraCallbackWithResult};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        if (!(!((Boolean) onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1374093804, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1374093804, objArr, iOnExtraCallback)).booleanValue())) {
            tdsDialogV1.dismiss();
            int i4 = IAuthTabCallbackStubProxy + 105;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = IAuthTabCallbackStubProxy + 69;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TdsDialogV1 tdsDialogV1 = (TdsDialogV1) objArr[0];
        Map<String, Object> map = (Map) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        tdsDialogV1.IAuthTabCallbackDefault = map;
        int i4 = IAuthTabCallback_Parcel + 7;
        IAuthTabCallbackStubProxy = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final Map<String, Object> writeTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 61;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackDefault;
        }
        throw null;
    }

    @Override // o.r8lambdaYN2sJNglMasTWVNShwkasqH6K1o, o.L_
    public void onPrepareTrackViewParams(@NotNull Map<String, Object> map) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            super.onPrepareTrackViewParams(map);
            map.putAll(this.IAuthTabCallbackDefault);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        super.onPrepareTrackViewParams(map);
        map.putAll(this.IAuthTabCallbackDefault);
        int i3 = IAuthTabCallbackStubProxy + 1;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        TdsDialogV1 tdsDialogV1 = (TdsDialogV1) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        AFj1uSDK5 aFj1uSDK5 = null;
        AFj1uSDK5 aFj1uSDK52 = tdsDialogV1.onExtraCallback;
        if (i3 == 0) {
            throw null;
        }
        if (aFj1uSDK52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i4 = IAuthTabCallback_Parcel + 39;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 2;
            }
        } else {
            aFj1uSDK5 = aFj1uSDK52;
        }
        TdsImageView tdsImageView = aFj1uSDK5.writeTypedObject;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        return tdsImageView;
    }

    static final class onExtraCallback implements Runnable {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        onExtraCallback() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 2 % 2;
            AFj1uSDK5 aFj1uSDK5 = (AFj1uSDK5) TdsDialogV1.onWarmupCompleted(785598908, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{TdsDialogV1.this}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -785598904);
            AFj1uSDK5 aFj1uSDK52 = null;
            if (aFj1uSDK5 == null) {
                int i2 = onWarmupCompleted + 97;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    aFj1uSDK52.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK5 = null;
            }
            if (aFj1uSDK5.onExtraCallback.getFlexLines().size() > 1) {
                int i3 = onNavigationEvent + 63;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                AFj1uSDK5 aFj1uSDK53 = (AFj1uSDK5) TdsDialogV1.onWarmupCompleted(785598908, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{TdsDialogV1.this}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -785598904);
                if (aFj1uSDK53 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    aFj1uSDK53 = null;
                }
                TdsButtonV1View tdsButtonV1View = aFj1uSDK53.readTypedObject;
                Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
                ViewGroup.LayoutParams layoutParams = tdsButtonV1View.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
                }
                int i5 = onNavigationEvent + 119;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                ViewGroup.LayoutParams layoutParams2 = (FlexboxLayout.LayoutParams) layoutParams;
                layoutParams2.setOrder(1);
                tdsButtonV1View.setLayoutParams(layoutParams2);
                AFj1uSDK5 aFj1uSDK54 = (AFj1uSDK5) TdsDialogV1.onWarmupCompleted(785598908, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{TdsDialogV1.this}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -785598904);
                if (aFj1uSDK54 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                } else {
                    aFj1uSDK52 = aFj1uSDK54;
                }
                TdsButtonV1View tdsButtonV1View2 = aFj1uSDK52.access000;
                Intrinsics.checkNotNullExpressionValue(tdsButtonV1View2, "");
                ViewGroup.LayoutParams layoutParams3 = tdsButtonV1View2.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
                }
                ViewGroup.LayoutParams layoutParams4 = (FlexboxLayout.LayoutParams) layoutParams3;
                layoutParams4.setOrder(2);
                tdsButtonV1View2.setLayoutParams(layoutParams4);
                return;
            }
            AFj1uSDK5 aFj1uSDK55 = (AFj1uSDK5) TdsDialogV1.onWarmupCompleted(785598908, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{TdsDialogV1.this}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -785598904);
            if (aFj1uSDK55 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK55 = null;
            }
            TdsButtonV1View tdsButtonV1View3 = aFj1uSDK55.readTypedObject;
            Intrinsics.checkNotNullExpressionValue(tdsButtonV1View3, "");
            ViewGroup.LayoutParams layoutParams5 = tdsButtonV1View3.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
            }
            ViewGroup.LayoutParams layoutParams6 = (FlexboxLayout.LayoutParams) layoutParams5;
            layoutParams6.setOrder(2);
            tdsButtonV1View3.setLayoutParams(layoutParams6);
            AFj1uSDK5 aFj1uSDK56 = (AFj1uSDK5) TdsDialogV1.onWarmupCompleted(785598908, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{TdsDialogV1.this}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -785598904);
            if (aFj1uSDK56 == null) {
                int i7 = onNavigationEvent + 67;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                aFj1uSDK52 = aFj1uSDK56;
            }
            TdsButtonV1View tdsButtonV1View4 = aFj1uSDK52.access000;
            Intrinsics.checkNotNullExpressionValue(tdsButtonV1View4, "");
            ViewGroup.LayoutParams layoutParams7 = tdsButtonV1View4.getLayoutParams();
            if (layoutParams7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
            }
            int i8 = onWarmupCompleted + 79;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                ViewGroup.LayoutParams layoutParams8 = (FlexboxLayout.LayoutParams) layoutParams7;
                layoutParams8.setOrder(1);
                tdsButtonV1View4.setLayoutParams(layoutParams8);
            } else {
                ViewGroup.LayoutParams layoutParams9 = (FlexboxLayout.LayoutParams) layoutParams7;
                layoutParams9.setOrder(1);
                tdsButtonV1View4.setLayoutParams(layoutParams9);
            }
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TdsDialogV1 tdsDialogV1 = (TdsDialogV1) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            AFj1uSDK5 aFj1uSDK5 = tdsDialogV1.onExtraCallback;
            obj.hashCode();
            throw null;
        }
        AFj1uSDK5 aFj1uSDK52 = tdsDialogV1.onExtraCallback;
        if (aFj1uSDK52 == null) {
            int i4 = i3 + 87;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK52 = null;
        }
        TdsRoundLayout tdsRoundLayout = aFj1uSDK52.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        ViewGroup.LayoutParams layoutParams = tdsRoundLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        int i5 = IAuthTabCallback_Parcel + 55;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = (ConstraintLayout.onExtraCallbackWithResult) layoutParams;
        Context context = tdsDialogV1.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iIAuthTabCallback = varyMatches.IAuthTabCallback(Float.valueOf(32.0f), context);
        M_ m_ = M_.onExtraCallback;
        int iAsInterface = m_.asInterface();
        Context context2 = tdsDialogV1.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).width = Math.min(varyMatches.IAuthTabCallback(320, context2), iAsInterface - (iIAuthTabCallback << 1));
        tdsRoundLayout.setLayoutParams(onextracallbackwithresult);
        Context context3 = tdsDialogV1.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        int iIAuthTabCallback2 = varyMatches.IAuthTabCallback(Float.valueOf(80.0f), context3);
        int iIAuthTabCallbackDefault = m_.IAuthTabCallbackDefault();
        AFj1uSDK5 aFj1uSDK53 = tdsDialogV1.onExtraCallback;
        if (aFj1uSDK53 == null) {
            int i7 = IAuthTabCallback_Parcel + 39;
            IAuthTabCallbackStubProxy = i7 % 128;
            if (i7 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1uSDK53 = null;
        }
        aFj1uSDK53.asInterface.setMaxHeight(iIAuthTabCallbackDefault - (iIAuthTabCallback2 << 1));
        AFj1uSDK5 aFj1uSDK54 = tdsDialogV1.onExtraCallback;
        if (aFj1uSDK54 == null) {
            int i8 = IAuthTabCallbackStubProxy + 125;
            IAuthTabCallback_Parcel = i8 % 128;
            if (i8 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i9 = 72 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            }
            aFj1uSDK54 = null;
        }
        aFj1uSDK54.asInterface.getViewTreeObserver().addOnGlobalLayoutListener(tdsDialogV1);
        int i10 = IAuthTabCallback_Parcel + 67;
        IAuthTabCallbackStubProxy = i10 % 128;
        int i11 = i10 % 2;
        return null;
    }

    public static final /* synthetic */ AFj1uSDK5 onExtraCallbackWithResult(TdsDialogV1 tdsDialogV1) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (AFj1uSDK5) onWarmupCompleted(785598908, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsDialogV1}, iOnNavigationEvent, iOnNavigationEvent2, -785598904);
    }

    private static final void IAuthTabCallback(onExtraCallbackWithResult.IAuthTabCallback.C0007onExtraCallbackWithResult c0007onExtraCallbackWithResult, TdsDialogV1 tdsDialogV1, int i, View view) {
        onWarmupCompleted(-1173351717, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{c0007onExtraCallbackWithResult, tdsDialogV1, Integer.valueOf(i), view}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1173351722);
    }

    private static final void onWarmupCompleted(TdsDialogV1 tdsDialogV1, View view) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        onWarmupCompleted(-683108314, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsDialogV1, view}, iOnNavigationEvent, iOnNavigationEvent2, 683108320);
    }

    private final void onUnminimized() {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        onWarmupCompleted(-1699559296, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, iOnNavigationEvent2, 1699559297);
    }

    private final void onRelationshipValidationResult() {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        onWarmupCompleted(-1725777819, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, iOnNavigationEvent2, 1725777822);
    }

    public final TdsImageView readTypedObject() {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (TdsImageView) onWarmupCompleted(162690133, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, iOnNavigationEvent2, -162690126);
    }

    public final void onExtraCallbackWithResult(@NotNull Map<String, Object> map) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        onWarmupCompleted(-2061227946, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{this, map}, iOnNavigationEvent, iOnNavigationEvent2, 2061227946);
    }

    static void onMessageChannelReady() {
        asInterface = (char) 19652;
        IAuthTabCallbackStub = (char) 39566;
        asBinder = (char) 16812;
        getInterfaceDescriptor = (char) 50538;
    }
}
