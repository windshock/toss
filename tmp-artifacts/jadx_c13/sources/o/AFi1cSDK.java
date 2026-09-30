package o;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.internal.ads.zziea;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.securities.core.router.spec.TossSecRoute;
import im.toss.tosssecurities.webview.TossSecuritiesWebView;
import im.toss.tosssecurities.webview.composable.TossSecWebSwipeRefreshLayout;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda10;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewModel;
import im.toss.uikit.R;
import im.toss.uikit.widget.TdsSkeletonV1View;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import o.AFh1zSDK;
import o.AFi1cSDK;
import o.AFi1dSDK;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.decrementVideoUsage;
import o.findResAndMsg;
import o.isInVideoUsage;
import o.lambdaonInstallReferrerSetupFinished0;
import o.newKnownLengthSink;
import o.setHorizontalGravity;
import o.toPreviewOnlyRange;
import o.w_;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFi1cSDK {
    private static final byte[] $$a = {2, 105, -126, -86};
    private static final int $$b = 99;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallback = 1;
    private static long IAuthTabCallback = 7798559133331975163L;
    private static int onExtraCallbackWithResult = -1776194565;
    private static char onNavigationEvent = 44243;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.values().length];
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_PAUSE.ordinal()] = 2;
                int i = onExtraCallbackWithResult + 19;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
            int i4 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3 = 4 - (i * 4);
        byte[] bArr = $$a;
        int i4 = 110 - s;
        int i5 = s2 * 4;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i3;
            int i8 = i6;
            int i9 = 0;
            i4 = (-i4) + i8;
            i3 = i7 + 1;
            i2 = i9;
            bArr2[i2] = (byte) i4;
            i9 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            int i10 = bArr[i3];
            int i11 = i3;
            i8 = i4;
            i4 = i10;
            i7 = i11;
            i4 = (-i4) + i8;
            i3 = i7 + 1;
            i2 = i9;
            bArr2[i2] = (byte) i4;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(TossSecuritiesWebView tossSecuritiesWebView) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(tossSecuritiesWebView);
        int i4 = onExtraCallback + 61;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TossSecWebSwipeRefreshLayout tossSecWebSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(tossSecWebSwipeRefreshLayout);
        }
        onWarmupCompleted(tossSecWebSwipeRefreshLayout);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, TossSecuritiesWebView tossSecuritiesWebView, r8lambdaNCvR6EZjAYpz_owCtw_Vfp2Jx0 r8lambdancvr6ezjaypz_owctw_vfp2jx0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, WarmUpWebViewModel warmUpWebViewModel, getDebugUserGeography getdebugusergeography, TossSecWebSwipeRefreshLayout tossSecWebSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, tossSecuritiesWebView, r8lambdancvr6ezjaypz_owctw_vfp2jx0, getsupportedhighspeedresolutionsfor, warmUpWebViewModel, getdebugusergeography, tossSecWebSwipeRefreshLayout);
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        return unitOnExtraCallback;
    }

    private static final Unit IAuthTabCallback(w_ w_Var, WarmUpWebViewModel warmUpWebViewModel, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(w_Var, warmUpWebViewModel, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 107;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ void IAuthTabCallback(findResAndMsg findresandmsg, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, TossSecuritiesWebView tossSecuritiesWebView) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(findresandmsg, getsupportedhighspeedresolutionsfor, tossSecuritiesWebView);
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        TossSecuritiesWebView tossSecuritiesWebView = (TossSecuritiesWebView) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tossSecuritiesWebView);
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ TossSecWebSwipeRefreshLayout onExtraCallback(TossSecuritiesWebView tossSecuritiesWebView, WarmUpWebViewModel warmUpWebViewModel, findResAndMsg findresandmsg, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(tossSecuritiesWebView, warmUpWebViewModel, findresandmsg, getsupportedhighspeedresolutionsfor, context);
        }
        onNavigationEvent(tossSecuritiesWebView, warmUpWebViewModel, findresandmsg, getsupportedhighspeedresolutionsfor, context);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        w_ w_Var = (w_) objArr[0];
        WarmUpWebViewModel warmUpWebViewModel = (WarmUpWebViewModel) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(w_Var, warmUpWebViewModel, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i4 = onExtraCallback + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Pair onExtraCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Pair pairOnNavigationEvent = onNavigationEvent(str, str2);
        int i4 = onWarmupCompleted + 25;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return pairOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(TossSecRoute.Web web, String str, w_ w_Var, WarmUpWebViewModel warmUpWebViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 115;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {web, str, w_Var, warmUpWebViewModel, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 2096397355, iOnNavigationEvent2, iOnNavigationEvent, -2096397348);
        int i7 = onExtraCallback + 65;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, useandconfigureprogramwithtexture);
        int i4 = onExtraCallback + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, WarmUpWebViewModel warmUpWebViewModel, getDebugUserGeography getdebugusergeography, TossSecuritiesWebView tossSecuritiesWebView, getTimebase gettimebase, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnNavigationEvent4 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent5 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent6 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        decrementVideoUsage decrementvideousage = (decrementVideoUsage) onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{textFieldScrollKtExternalSyntheticLambda0, warmUpWebViewModel, getdebugusergeography, tossSecuritiesWebView, gettimebase, isinvideousage}, iOnNavigationEvent6, 250711962, iOnNavigationEvent5, iOnNavigationEvent4, -250711958);
        int i3 = onExtraCallback + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return decrementvideousage;
    }

    public static /* synthetic */ boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback();
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return zIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(z);
        int i4 = onWarmupCompleted + 23;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 115;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ WarmUpWebViewModel onNavigationEvent(TossSecRoute.Web web, String str, w_ w_Var, AFi1dSDK aFi1dSDK) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        WarmUpWebViewModel warmUpWebViewModel = (WarmUpWebViewModel) onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{web, str, w_Var, aFi1dSDK}, iOnNavigationEvent3, -696485095, iOnNavigationEvent2, iOnNavigationEvent, 696485100);
        int i4 = onWarmupCompleted + 43;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return warmUpWebViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(float f, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, TossSecuritiesWebView tossSecuritiesWebView, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 83;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {Float.valueOf(f), cameraPresenceProviderExternalSyntheticLambda6, tossSecuritiesWebView, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -335046935, iOnNavigationEvent2, iOnNavigationEvent, 335046938);
        int i5 = onExtraCallback + 9;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallback = i3 % 128;
        boolean z = i3 % 2 != 0;
        int i4 = i2 + 67;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r1 = r1 + 105;
        o.AFi1cSDK.onExtraCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        return 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((!r5) != true) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r5 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        r3 = r3 + 89;
        o.AFi1cSDK.onWarmupCompleted = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 123;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 == 0) {
            int i5 = 52 / 0;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = i7 | i3;
        int i11 = (~i10) | i9;
        int i12 = ~i3;
        int i13 = (~(i5 | i10)) | (~(i8 | i12)) | (~(i12 | i6));
        int i14 = i6 + i3 + i4 + ((-1017789379) * i2) + (461141949 * i);
        int i15 = i14 * i14;
        int i16 = ((i6 * (-1063000396)) - 360994079) + (i3 * (-1063001374)) + (i11 * (-978)) + (i13 * 489) + (i9 * 489) + ((-1063000885) * i4) + ((-90181537) * i2) + ((-1548859681) * i) + (i15 * 816250880);
        switch (((-551480932) * i6) + 431816704 + ((-1613042074) * i3) + ((-1061561142) * i11) + (i13 * (-1616703077)) + ((-1616703077) * i9) + (1065222144 * i4) + ((-1727660032) * i2) + (1912995840 * i) + ((-1005256704) * i15) + (i16 * i16 * 1493368832)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                float fFloatValue = ((Number) objArr[0]).floatValue();
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[1];
                final TossSecuritiesWebView tossSecuritiesWebView = (TossSecuritiesWebView) objArr[2];
                setHorizontalGravity sethorizontalgravity = (setHorizontalGravity) objArr[3];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
                int iIntValue = ((Number) objArr[5]).intValue();
                int i17 = 2 % 2;
                Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i18 = onWarmupCompleted + 19;
                    onExtraCallback = i18 % 128;
                    int i19 = i18 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1057051095, iIntValue, -1, "im.toss.tosssecurities.webview.composable.WarmUpWebViewContent.<anonymous>.<anonymous> (WarmUpWebViewComposable.kt:203)");
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null), 0.0f, fFloatValue, 0.0f, 0.0f, 13, (Object) null);
                FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub();
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    int i20 = onWarmupCompleted + 81;
                    onExtraCallback = i20 % 128;
                    int i21 = i20 % 2;
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                if (onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<? extends AFh1zSDK>) cameraPresenceProviderExternalSyntheticLambda6) instanceof AFh1zSDK.onExtraCallbackWithResult) {
                    int i22 = onExtraCallback + 69;
                    onWarmupCompleted = i22 % 128;
                    int i23 = i22 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-597749455);
                    QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = onextracallbackwithresult.onExtraCallback();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (!(!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout())) {
                        int i24 = onWarmupCompleted + 101;
                        onExtraCallback = i24 % 128;
                        int i25 = i24 % 2;
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(tossSecuritiesWebView);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new Function0() { // from class: im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda9
                            private static int onNavigationEvent = 1;
                            private static int onWarmupCompleted;

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i26 = 2 % 2;
                                int i27 = onNavigationEvent + 9;
                                onWarmupCompleted = i27 % 128;
                                int i28 = i27 % 2;
                                Object[] objArr2 = {tossSecuritiesWebView};
                                int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                                int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                                Unit unit = (Unit) AFi1cSDK.onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr2, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -607581405, iOnNavigationEvent2, iOnNavigationEvent, 607581413);
                                int i29 = onNavigationEvent + 55;
                                onWarmupCompleted = i29 % 128;
                                int i30 = i29 % 2;
                                return unit;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    AFf1rSDK.onExtraCallbackWithResult(null, null, null, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0, 7);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-597306868);
                    removeAllUpdateListeners.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), false, false, (TdsSkeletonV1View.onWarmupCompleted) null, (TdsSkeletonV1View.IAuthTabCallback) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 30);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                return Unit.INSTANCE;
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                TossSecRoute.Web web = (TossSecRoute.Web) objArr[0];
                String str = (String) objArr[1];
                w_ w_Var = (w_) objArr[2];
                WarmUpWebViewModel warmUpWebViewModel = (WarmUpWebViewModel) objArr[3];
                int iIntValue2 = ((Number) objArr[4]).intValue();
                int iIntValue3 = ((Number) objArr[5]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
                ((Number) objArr[7]).intValue();
                int i26 = 2 % 2;
                int i27 = onExtraCallback + 33;
                onWarmupCompleted = i27 % 128;
                if (i27 % 2 != 0) {
                    Object[] objArr2 = {web, str, w_Var, warmUpWebViewModel, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2)), Integer.valueOf(iIntValue3)};
                    int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                    onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr2, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1085198032, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, 1085198038);
                } else {
                    Object[] objArr3 = {web, str, w_Var, warmUpWebViewModel, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2 | 1)), Integer.valueOf(iIntValue3)};
                    int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                    onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr3, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1085198032, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2, 1085198038);
                }
                return Unit.INSTANCE;
            case 8:
                return asBinder(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ void onWarmupCompleted(WarmUpWebViewModel warmUpWebViewModel, getDebugUserGeography getdebugusergeography, TossSecuritiesWebView tossSecuritiesWebView, getTimebase gettimebase, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(warmUpWebViewModel, getdebugusergeography, tossSecuritiesWebView, gettimebase, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
        int i4 = onExtraCallback + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onWarmupCompleted implements decrementVideoUsage {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 IAuthTabCallback;
        final /* synthetic */ LifecycleEventObserver onExtraCallback;

        public onWarmupCompleted(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, LifecycleEventObserver lifecycleEventObserver) {
            this.IAuthTabCallback = textFieldScrollKtExternalSyntheticLambda0;
            this.onExtraCallback = lifecycleEventObserver;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.getLifecycle().onExtraCallbackWithResult(this.onExtraCallback);
            int i4 = onNavigationEvent + 23;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TossSecRoute.Web web = (TossSecRoute.Web) objArr[0];
        String str = (String) objArr[1];
        w_ w_Var = (w_) objArr[2];
        AFi1dSDK aFi1dSDK = (AFi1dSDK) objArr[3];
        int i = 2 % 2;
        int i2 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aFi1dSDK, "");
        String strOnExtraCallback = web.onExtraCallback();
        if (strOnExtraCallback != null) {
            str = strOnExtraCallback;
        }
        WarmUpWebViewModel warmUpWebViewModelOnExtraCallbackWithResult = aFi1dSDK.onExtraCallbackWithResult(w_Var, new lambdaonInstallReferrerSetupFinished0.onWarmupCompleted(str), web);
        int i4 = onExtraCallback + 55;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return warmUpWebViewModelOnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        int i;
        boolean z;
        AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult;
        int i2;
        final TossSecRoute.Web web = (TossSecRoute.Web) objArr[0];
        final String str = (String) objArr[1];
        final w_ w_Var = (w_) objArr[2];
        final WarmUpWebViewModel warmUpWebViewModel = (WarmUpWebViewModel) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        final int iIntValue = ((Number) objArr[5]).intValue();
        final int iIntValue2 = ((Number) objArr[6]).intValue();
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(web, "");
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1274482820);
        if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(web) ^ true ? 2 : 4) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            int i4 = onWarmupCompleted + 5;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                throw null;
            }
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= ((iIntValue2 & 4) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(w_Var)) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            if ((iIntValue2 & 8) == 0) {
                int i5 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 7 / 0;
                    i2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(warmUpWebViewModel) ? 2048 : 1024;
                } else if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(warmUpWebViewModel)) {
                }
                i |= i2;
            }
        }
        if ((i & 1171) != 1170) {
            int i7 = onExtraCallback + 1;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((iIntValue & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if ((iIntValue2 & 4) != 0) {
                    w_Var = (w_) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AFi1sSDK.IAuthTabCallback());
                    i &= -897;
                }
                int i9 = i;
                if ((iIntValue2 & 8) != 0) {
                    String strOnExtraCallbackWithResult = w_Var.onExtraCallbackWithResult();
                    boolean z2 = (i9 & 14) == 4;
                    boolean z3 = (i9 & 112) == 32;
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(w_Var);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((z3 | z2 | zOnExtraCallback) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new Function1() { // from class: im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda13
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i10 = 2 % 2;
                                int i11 = onExtraCallbackWithResult + 91;
                                IAuthTabCallback = i11 % 128;
                                int i12 = i11 % 2;
                                TossSecRoute.Web web2 = web;
                                if (i12 == 0) {
                                    return AFi1cSDK.onNavigationEvent(web2, str, w_Var, (AFi1dSDK) obj);
                                }
                                AFi1cSDK.onNavigationEvent(web2, str, w_Var, (AFi1dSDK) obj);
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    Function1 function1 = (Function1) objOnMinimized;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-83599083);
                    TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onWarmupCompleted);
                    if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.onWarmupCompleted onwarmupcompletedIAuthTabCallback = LongPressTextDragObserverKtExternalSyntheticLambda3.IAuthTabCallback(textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                        int i10 = onExtraCallback + 95;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                        androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult = matchItemIds.onExtraCallbackWithResult(textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras(), function1);
                    } else {
                        androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult = matchItemIds.onExtraCallbackWithResult(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult, function1);
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(1729797275);
                    ViewModel viewModelIAuthTabCallback = DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.IAuthTabCallback(WarmUpWebViewModel.class, textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, strOnExtraCallbackWithResult, onwarmupcompletedIAuthTabCallback, androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 36936, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                    warmUpWebViewModel = (WarmUpWebViewModel) viewModelIAuthTabCallback;
                    i = i9 & (-7169);
                } else {
                    i = i9;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((iIntValue2 & 4) != 0) {
                    i &= -897;
                }
                if ((iIntValue2 & 8) != 0) {
                    int i12 = onExtraCallback + 107;
                    int i13 = i12 % 128;
                    onWarmupCompleted = i13;
                    int i14 = i12 % 2;
                    i &= -7169;
                    int i15 = i13 + 1;
                    onExtraCallback = i15 % 128;
                    int i16 = i15 % 2;
                }
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1274482820, i, -1, "im.toss.tosssecurities.webview.composable.WarmUpWebViewComposable (WarmUpWebViewComposable.kt:76)");
            }
            onExtraCallbackWithResult(w_Var, warmUpWebViewModel, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i >> 6) & 126);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i17 = onExtraCallback + 113;
                onWarmupCompleted = i17 % 128;
                if (i17 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i18 = 30 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda14
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = 2 % 2;
                    int i20 = onExtraCallbackWithResult + 93;
                    onExtraCallback = i20 % 128;
                    if (i20 % 2 == 0) {
                        return AFi1cSDK.onExtraCallback(web, str, w_Var, warmUpWebViewModel, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    Unit unitOnExtraCallback = AFi1cSDK.onExtraCallback(web, str, w_Var, warmUpWebViewModel, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i21 = 31 / 0;
                    return unitOnExtraCallback;
                }
            });
        }
        return null;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ getDebugUserGeography $landingParams;
        final /* synthetic */ WarmUpWebViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(WarmUpWebViewModel warmUpWebViewModel, getDebugUserGeography getdebugusergeography, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$viewModel = warmUpWebViewModel;
            this.$landingParams = getdebugusergeography;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$viewModel, this.$landingParams, access13800Var);
            int i2 = onExtraCallbackWithResult + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 != 0) {
                objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg2, access13800Var2);
                int i3 = 44 / 0;
            } else {
                objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg2, access13800Var2);
            }
            int i4 = onExtraCallbackWithResult + 3;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onExtraCallbackWithResult) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 89;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                access14100.onExtraCallback();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                getTileModeX<Unit> gettilemodexOnNavigationEvent = this.$viewModel.onNavigationEvent();
                final WarmUpWebViewModel warmUpWebViewModel = this.$viewModel;
                final getDebugUserGeography getdebugusergeography = this.$landingParams;
                setRipple<? super Unit> setripple = new setRipple() { // from class: o.AFi1cSDK.onExtraCallbackWithResult.2
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    @Override // o.setRipple
                    public /* synthetic */ Object emit(Object obj3, access13800 access13800Var) {
                        int i4 = 2 % 2;
                        int i5 = onNavigationEvent + 31;
                        onExtraCallbackWithResult = i5 % 128;
                        Unit unit = (Unit) obj3;
                        if (i5 % 2 != 0) {
                            return onNavigationEvent(unit, access13800Var);
                        }
                        onNavigationEvent(unit, access13800Var);
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }

                    public final Object onNavigationEvent(Unit unit, access13800<? super Unit> access13800Var) {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallbackWithResult + 93;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        warmUpWebViewModel.onWarmupCompleted(getdebugusergeography.IAuthTabCallbackDefault());
                        Unit unit2 = Unit.INSTANCE;
                        int i7 = onNavigationEvent + 5;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        return unit2;
                    }
                };
                this.label = 1;
                if (gettilemodexOnNavigationEvent.collect(setripple, this) == objOnExtraCallback) {
                    int i4 = onExtraCallbackWithResult;
                    int i5 = i4 + 41;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = i4 + 45;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnExtraCallback;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            throw new setWrite();
        }
    }

    private static final Unit IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 95;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(TossSecuritiesWebView tossSecuritiesWebView) {
        int i = 2 % 2;
        if (!tossSecuritiesWebView.onExtraCallbackWithResult(new Function1() { // from class: im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda11
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 97;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = AFi1cSDK.onExtraCallbackWithResult(((Boolean) obj).booleanValue());
                int i5 = onExtraCallbackWithResult + 105;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 94 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        })) {
            int i2 = onWarmupCompleted + 101;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (getOptimalPreviewSize.IAuthTabCallback(tossSecuritiesWebView)) {
                    getOptimalPreviewSize.onNavigationEvent(tossSecuritiesWebView);
                }
            } else {
                getOptimalPreviewSize.IAuthTabCallback(tossSecuritiesWebView);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        TossSecuritiesWebView.onNavigationEvent(iIAuthTabCallback, 116648509, zziea.IAuthTabCallback(), iIAuthTabCallback2, zziea.IAuthTabCallback(), new Object[]{tossSecuritiesWebView}, -116648504);
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 89;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 30 / 0;
        }
        return unit;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i3 = $11 + 27;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 44 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1451 - View.MeasureSpec.makeMeasureSpec(0, 0), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 49123);
                    int mirror = '\\' - AndroidCharacter.getMirror('0');
                    int iIndexOf = 1494 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0);
                    byte b3 = (byte) ($$b & 5);
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionGroup, mirror, iIndexOf, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 23972), 51 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 22940 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (KeyEvent.getMaxKeyCode() >> 16)), View.combineMeasuredStates(0, 0) + 29, ImageFormat.getBitsPerPixel(0) + 12578, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i5 = $11 + 115;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }

    private static final void onExtraCallbackWithResult(WarmUpWebViewModel warmUpWebViewModel, getDebugUserGeography getdebugusergeography, TossSecuritiesWebView tossSecuritiesWebView, getTimebase gettimebase, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        int i4 = IAuthTabCallback.onWarmupCompleted[onextracallbackwithresult.ordinal()];
        if (i4 == 1) {
            warmUpWebViewModel.onNavigationEvent(getdebugusergeography.IAuthTabCallbackDefault());
            IAuthTabCallback(gettimebase, onExtraCallbackWithResult(gettimebase) + 1);
            return;
        }
        int i5 = onExtraCallback + 85;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            if (i4 != 5) {
                return;
            }
        } else if (i4 != 2) {
            return;
        }
        tossSecuritiesWebView.onPause();
    }

    private static final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        newKnownLengthSink.IAuthTabCallback iAuthTabCallback = newKnownLengthSink.Companion;
        if (i3 != 0) {
            return iAuthTabCallback.onWarmupCompleted(Http1ExchangeCodecAbstractSource.SEAND_4200);
        }
        iAuthTabCallback.onWarmupCompleted(Http1ExchangeCodecAbstractSource.SEAND_4200);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.ViewGroup, androidx.swiperefreshlayout.widget.SwipeRefreshLayout, im.toss.tosssecurities.webview.composable.TossSecWebSwipeRefreshLayout] */
    private static final TossSecWebSwipeRefreshLayout onNavigationEvent(final TossSecuritiesWebView tossSecuritiesWebView, WarmUpWebViewModel warmUpWebViewModel, final findResAndMsg findresandmsg, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        ?? tossSecWebSwipeRefreshLayout = new TossSecWebSwipeRefreshLayout(context, tossSecuritiesWebView, new Function0() { // from class: im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda7
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 125;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolValueOf = Boolean.valueOf(AFi1cSDK.onExtraCallback());
                if (i4 != 0) {
                    int i5 = 46 / 0;
                }
                return boolValueOf;
            }
        });
        warmUpWebViewModel.onNavigationEvent((ViewGroup) tossSecWebSwipeRefreshLayout);
        tossSecWebSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.IAuthTabCallback() { // from class: im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda8
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final void onRefresh() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 109;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                findResAndMsg findresandmsg2 = findresandmsg;
                if (i4 != 0) {
                    AFi1cSDK.IAuthTabCallback(findresandmsg2, getsupportedhighspeedresolutionsfor, tossSecuritiesWebView);
                } else {
                    AFi1cSDK.IAuthTabCallback(findresandmsg2, getsupportedhighspeedresolutionsfor, tossSecuritiesWebView);
                    throw null;
                }
            }
        });
        int i2 = onWarmupCompleted + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return tossSecWebSwipeRefreshLayout;
        }
        throw null;
    }

    private static final void onExtraCallback(findResAndMsg findresandmsg, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, TossSecuritiesWebView tossSecuritiesWebView) {
        int i = 2 % 2;
        Object obj = null;
        onLoadStarted.onExtraCallback(findresandmsg, null, null, new onNavigationEvent(getsupportedhighspeedresolutionsfor, tossSecuritiesWebView, null), 3, null);
        int i2 = onExtraCallback + 13;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $loading;
        final /* synthetic */ TossSecuritiesWebView $webView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, TossSecuritiesWebView tossSecuritiesWebView, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$loading = getsupportedhighspeedresolutionsfor;
            this.$webView = tossSecuritiesWebView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$loading, this.$webView, access13800Var);
            int i2 = onExtraCallback + 11;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i4 = onWarmupCompleted + 23;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onNavigationEvent) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 15;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.$loading.IAuthTabCallback(access14000.onNavigationEvent(true));
                this.$webView.reload();
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(500L, this) == objOnExtraCallback) {
                    int i5 = onWarmupCompleted + 21;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnExtraCallback;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            this.$loading.IAuthTabCallback(access14000.onNavigationEvent(false));
            Unit unit = Unit.INSTANCE;
            int i7 = onExtraCallback + 49;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 40 / 0;
            }
            return unit;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(String str, TossSecuritiesWebView tossSecuritiesWebView, r8lambdaNCvR6EZjAYpz_owCtw_Vfp2Jx0 r8lambdancvr6ezjaypz_owctw_vfp2jx0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, WarmUpWebViewModel warmUpWebViewModel, getDebugUserGeography getdebugusergeography, TossSecWebSwipeRefreshLayout tossSecWebSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tossSecWebSwipeRefreshLayout, "");
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tossSecWebSwipeRefreshLayout, str}, iOnNavigationEvent3, 69386014, iOnNavigationEvent2, iOnNavigationEvent, -69386013);
        IAuthTabCallback(tossSecuritiesWebView, str, r8lambdancvr6ezjaypz_owctw_vfp2jx0);
        tossSecWebSwipeRefreshLayout.setEnabled(tossSecuritiesWebView.extraCommand());
        tossSecWebSwipeRefreshLayout.setRefreshing(((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue());
        tossSecuritiesWebView.setImportantForAccessibility(onWarmupCompleted(((Boolean) warmUpWebViewModel.onWarmupCompleted().onExtraCallbackWithResult()).booleanValue()));
        Object[] objArr = {tossSecuritiesWebView, tossSecWebSwipeRefreshLayout, Boolean.valueOf(onNavigationEvent())};
        TossSecuritiesWebView.onNavigationEvent(zziea.IAuthTabCallback(), -416369150, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), objArr, 416369159);
        warmUpWebViewModel.onWarmupCompleted(getdebugusergeography.IAuthTabCallbackDefault());
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 81;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(TossSecWebSwipeRefreshLayout tossSecWebSwipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tossSecWebSwipeRefreshLayout, "");
            onExtraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(tossSecWebSwipeRefreshLayout, "");
        if (onExtraCallbackWithResult()) {
            int i3 = onExtraCallback + 51;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                tossSecWebSwipeRefreshLayout.removeAllViews();
                obj.hashCode();
                throw null;
            }
            tossSecWebSwipeRefreshLayout.removeAllViews();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(TossSecuritiesWebView tossSecuritiesWebView) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        tossSecuritiesWebView.receiveFile();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(final w_ w_Var, final WarmUpWebViewModel warmUpWebViewModel, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        String str;
        CameraPresenceProviderExternalSyntheticLambda6<AFh1zSDK> cameraPresenceProviderExternalSyntheticLambda6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        final findResAndMsg findresandmsg;
        String str2;
        getDebugUserGeography getdebugusergeography;
        boolean z;
        boolean z2;
        Object obj;
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(737755083);
        Object obj2 = null;
        if ((i & 48) == 0) {
            int i4 = onExtraCallback + 43;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(warmUpWebViewModel);
                throw null;
            }
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(warmUpWebViewModel) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 17) != 16, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(737755083, i2, -1, "im.toss.tosssecurities.webview.composable.WarmUpWebViewContent (WarmUpWebViewComposable.kt:84)");
            }
            final TossSecuritiesWebView tossSecuritiesWebViewIAuthTabCallback = warmUpWebViewModel.IAuthTabCallback();
            CameraPresenceProviderExternalSyntheticLambda6<AFh1zSDK> cameraPresenceProviderExternalSyntheticLambda6NewSession = tossSecuritiesWebViewIAuthTabCallback.newSession();
            final TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = notifyPublicListeners.onWarmupCompleted(0);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            final getTimebase gettimebase = (getTimebase) objOnMinimized;
            final getDebugUserGeography getdebugusergeography2 = (getDebugUserGeography) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(getTermsOfServiceUri.onNavigationEvent());
            final float fOnExtraCallbackWithResult = DefaultSurfaceProcessorExternalSyntheticLambda1.onExtraCallbackWithResult(R.dimen.actionBarSize, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(warmUpWebViewModel.onExtraCallback().onWarmupCompleted());
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!zOnNavigationEvent) {
                Object obj3 = objOnMinimized2;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    String strOnWarmupCompleted = onWarmupCompleted(warmUpWebViewModel.onExtraCallback().onWarmupCompleted());
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(strOnWarmupCompleted);
                    obj3 = strOnWarmupCompleted;
                }
                String str3 = (String) obj3;
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!zOnNavigationEvent2) {
                    int i5 = onExtraCallback + 79;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        onwarmupcompleted.onExtraCallback();
                        throw null;
                    }
                    Object obj4 = objOnMinimized3;
                    if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        r8lambdaNCvR6EZjAYpz_owCtw_Vfp2Jx0 r8lambdancvr6ezjaypz_owctw_vfp2jx0 = new r8lambdaNCvR6EZjAYpz_owCtw_Vfp2Jx0(str3);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(r8lambdancvr6ezjaypz_owctw_vfp2jx0);
                        int i6 = onExtraCallback + 125;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        obj4 = r8lambdancvr6ezjaypz_owctw_vfp2jx0;
                    }
                    final r8lambdaNCvR6EZjAYpz_owCtw_Vfp2Jx0 r8lambdancvr6ezjaypz_owctw_vfp2jx02 = (r8lambdaNCvR6EZjAYpz_owCtw_Vfp2Jx0) obj4;
                    Unit unit = Unit.INSTANCE;
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(warmUpWebViewModel);
                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getdebugusergeography2);
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((zOnExtraCallback | zOnNavigationEvent3) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized4 = new onExtraCallbackWithResult(warmUpWebViewModel, getdebugusergeography2, null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(313059328, Integer.valueOf(onExtraCallbackWithResult(gettimebase)));
                    boolean z3 = ((Boolean) tossSecuritiesWebViewIAuthTabCallback.ICustomTabsCallback_Parcel().onExtraCallbackWithResult()).booleanValue() && (onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6NewSession) instanceof AFh1zSDK.onNavigationEvent);
                    boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(tossSecuritiesWebViewIAuthTabCallback);
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnNavigationEvent4 || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized5 = new Function0() { // from class: im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda0
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallbackWithResult;

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i8 = 2 % 2;
                                int i9 = onExtraCallbackWithResult + 39;
                                IAuthTabCallback = i9 % 128;
                                int i10 = i9 % 2;
                                TossSecuritiesWebView tossSecuritiesWebView = tossSecuritiesWebViewIAuthTabCallback;
                                if (i10 != 0) {
                                    return AFi1cSDK.IAuthTabCallback(tossSecuritiesWebView);
                                }
                                AFi1cSDK.IAuthTabCallback(tossSecuritiesWebView);
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                    }
                    requestPostMessageChannel.onExtraCallbackWithResult(z3, (Function0) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStub();
                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized6 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                    }
                    final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized6;
                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                        int i8 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                        onWarmupCompleted = i8 % 128;
                        if (i8 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback));
                            obj2.hashCode();
                            throw null;
                        }
                        objOnMinimized7 = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                    }
                    findResAndMsg findresandmsg2 = (findResAndMsg) objOnMinimized7;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = (QuirksExternalSyntheticBackport0) onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null), str3}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 729549528, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -729549526);
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport03);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        str = str3;
                        int i9 = onExtraCallback + 89;
                        cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6NewSession;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    } else {
                        str = str3;
                        cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6NewSession;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(warmUpWebViewModel);
                    boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getdebugusergeography2);
                    boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(tossSecuritiesWebViewIAuthTabCallback);
                    boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
                    Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(zOnExtraCallback2 | zOnNavigationEvent5 | zOnNavigationEvent6 | zOnExtraCallback3)) {
                        int i11 = onWarmupCompleted + 93;
                        onExtraCallback = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i12 = 4 / 0;
                            if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                                findresandmsg = findresandmsg2;
                                str2 = str;
                                getdebugusergeography = getdebugusergeography2;
                                objOnMinimized8 = new Function1() { // from class: im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda1
                                    private static int IAuthTabCallback = 0;
                                    private static int onExtraCallback = 1;

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        int i13 = 2 % 2;
                                        int i14 = onExtraCallback + 41;
                                        IAuthTabCallback = i14 % 128;
                                        int i15 = i14 % 2;
                                        decrementVideoUsage decrementvideousageOnExtraCallback = AFi1cSDK.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, warmUpWebViewModel, getdebugusergeography2, tossSecuritiesWebViewIAuthTabCallback, gettimebase, (isInVideoUsage) obj5);
                                        int i16 = IAuthTabCallback + 41;
                                        onExtraCallback = i16 % 128;
                                        if (i16 % 2 == 0) {
                                            int i17 = 56 / 0;
                                        }
                                        return decrementvideousageOnExtraCallback;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized8);
                            } else {
                                getdebugusergeography = getdebugusergeography2;
                                findresandmsg = findresandmsg2;
                                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                                str2 = str;
                            }
                        } else if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                        }
                        isZslDisabledByByUserCaseConfig.onWarmupCompleted(textFieldScrollKtExternalSyntheticLambda0, tossSecuritiesWebViewIAuthTabCallback, (Function1) objOnMinimized8, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1574458108, tossSecuritiesWebViewIAuthTabCallback);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null);
                        boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(tossSecuritiesWebViewIAuthTabCallback);
                        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(warmUpWebViewModel);
                        boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(findresandmsg);
                        Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(zOnNavigationEvent7 | zOnExtraCallback4 | zOnExtraCallback5)) {
                            Object obj5 = objOnMinimized9;
                            if (objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                                Function1 function1 = new Function1() { // from class: im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda2
                                    private static int onExtraCallback = 0;
                                    private static int onNavigationEvent = 1;

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj6) {
                                        int i13 = 2 % 2;
                                        int i14 = onExtraCallback + 115;
                                        onNavigationEvent = i14 % 128;
                                        int i15 = i14 % 2;
                                        TossSecWebSwipeRefreshLayout tossSecWebSwipeRefreshLayoutOnExtraCallback = AFi1cSDK.onExtraCallback(tossSecuritiesWebViewIAuthTabCallback, warmUpWebViewModel, findresandmsg, getsupportedhighspeedresolutionsfor, (Context) obj6);
                                        int i16 = onExtraCallback + 87;
                                        onNavigationEvent = i16 % 128;
                                        int i17 = i16 % 2;
                                        return tossSecWebSwipeRefreshLayoutOnExtraCallback;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function1);
                                int i13 = onExtraCallback + 13;
                                onWarmupCompleted = i13 % 128;
                                obj5 = function1;
                                if (i13 % 2 != 0) {
                                    int i14 = 4 / 5;
                                    obj5 = function1;
                                }
                            }
                            Function1 function12 = (Function1) obj5;
                            Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (objOnMinimized10 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized10 = new Function1() { // from class: im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda3
                                    private static int onExtraCallback = 1;
                                    private static int onNavigationEvent;

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj6) {
                                        int i15 = 2 % 2;
                                        int i16 = onExtraCallback + 21;
                                        onNavigationEvent = i16 % 128;
                                        int i17 = i16 % 2;
                                        Unit unitIAuthTabCallback = AFi1cSDK.IAuthTabCallback((TossSecWebSwipeRefreshLayout) obj6);
                                        if (i17 != 0) {
                                            int i18 = 97 / 0;
                                        }
                                        int i19 = onExtraCallback + 83;
                                        onNavigationEvent = i19 % 128;
                                        if (i19 % 2 == 0) {
                                            return unitIAuthTabCallback;
                                        }
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized10);
                            }
                            Function1 function13 = (Function1) objOnMinimized10;
                            boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2);
                            boolean zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(tossSecuritiesWebViewIAuthTabCallback);
                            boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(r8lambdancvr6ezjaypz_owctw_vfp2jx02);
                            boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(warmUpWebViewModel);
                            final getDebugUserGeography getdebugusergeography3 = getdebugusergeography;
                            boolean zOnNavigationEvent10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getdebugusergeography3);
                            Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (((zOnNavigationEvent8 | zOnNavigationEvent9 | zOnExtraCallback6 | zOnExtraCallback7) || zOnNavigationEvent10) || objOnMinimized11 == onwarmupcompleted.onExtraCallback()) {
                                final String str4 = str2;
                                z = true;
                                z2 = false;
                                obj = null;
                                Function1 function14 = new Function1() { // from class: im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda4
                                    private static int IAuthTabCallback = 1;
                                    private static int onWarmupCompleted;

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj6) {
                                        int i15 = 2 % 2;
                                        int i16 = IAuthTabCallback + 5;
                                        onWarmupCompleted = i16 % 128;
                                        if (i16 % 2 == 0) {
                                            return AFi1cSDK.IAuthTabCallback(str4, tossSecuritiesWebViewIAuthTabCallback, r8lambdancvr6ezjaypz_owctw_vfp2jx02, getsupportedhighspeedresolutionsfor, warmUpWebViewModel, getdebugusergeography3, (TossSecWebSwipeRefreshLayout) obj6);
                                        }
                                        AFi1cSDK.IAuthTabCallback(str4, tossSecuritiesWebViewIAuthTabCallback, r8lambdancvr6ezjaypz_owctw_vfp2jx02, getsupportedhighspeedresolutionsfor, warmUpWebViewModel, getdebugusergeography3, (TossSecWebSwipeRefreshLayout) obj6);
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function14);
                                objOnMinimized11 = function14;
                            } else {
                                z2 = false;
                                z = true;
                                obj = null;
                            }
                            Function1 function15 = (Function1) objOnMinimized11;
                            final CameraPresenceProviderExternalSyntheticLambda6<AFh1zSDK> cameraPresenceProviderExternalSyntheticLambda62 = cameraPresenceProviderExternalSyntheticLambda6;
                            boolean z4 = z;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                            Object obj6 = obj;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            CaptureOutputSurfaceForCaptureProcessorExternalSyntheticLambda0.IAuthTabCallback(function12, quirksExternalSyntheticBackport0OnNavigationEvent, (Function1) null, function13, function15, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3120, 4);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackStub();
                            setVerticalGravity.onWarmupCompleted(((onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda62) instanceof AFh1zSDK.onNavigationEvent) && ((Boolean) warmUpWebViewModel.onWarmupCompleted().onExtraCallbackWithResult()).booleanValue()) ? false : z4 ? 1 : 0, YuvImageOnePixelShiftQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport04, 0.0f, z4 ? 1 : 0, obj6)), ResourceManagerInternalResourceManagerHooks.Companion.onExtraCallbackWithResult(), SearchView.Companion.onExtraCallbackWithResult(), (String) null, ForwardingCameraControl.onExtraCallback(-1057051095, z4, new getBacktraceNote() { // from class: im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda5
                                private static int onExtraCallback = 1;
                                private static int onNavigationEvent;

                                @Override // o.getBacktraceNote
                                public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                    int i15 = 2 % 2;
                                    int i16 = onExtraCallback + 125;
                                    onNavigationEvent = i16 % 128;
                                    if (i16 % 2 != 0) {
                                        AFi1cSDK.onNavigationEvent(fOnExtraCallbackWithResult, cameraPresenceProviderExternalSyntheticLambda62, tossSecuritiesWebViewIAuthTabCallback, (setHorizontalGravity) obj7, (CameraCaptureResultEmptyCameraCaptureResult) obj8, ((Integer) obj9).intValue());
                                        throw null;
                                    }
                                    Unit unitOnNavigationEvent = AFi1cSDK.onNavigationEvent(fOnExtraCallbackWithResult, cameraPresenceProviderExternalSyntheticLambda62, tossSecuritiesWebViewIAuthTabCallback, (setHorizontalGravity) obj7, (CameraCaptureResultEmptyCameraCaptureResult) obj8, ((Integer) obj9).intValue());
                                    int i17 = onNavigationEvent + 51;
                                    onExtraCallback = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        int i18 = 95 / 0;
                                    }
                                    return unitOnNavigationEvent;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 196608, 16);
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            if (((CameraConfigExternalSyntheticLambda0.asBinder() ? 1 : 0) ^ (z4 ? 1 : 0)) != z4) {
                                int i15 = onWarmupCompleted + 29;
                                onExtraCallback = i15 % 128;
                                int i16 = i15 % 2;
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda6
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj7, Object obj8) {
                    int i17 = 2 % 2;
                    int i18 = onWarmupCompleted + 25;
                    onNavigationEvent = i18 % 128;
                    int i19 = i18 % 2;
                    w_ w_Var2 = w_Var;
                    if (i19 == 0) {
                        WarmUpWebViewModel warmUpWebViewModel2 = warmUpWebViewModel;
                        int i20 = i;
                        int iIntValue = ((Integer) obj8).intValue();
                        Object[] objArr = {w_Var2, warmUpWebViewModel2, Integer.valueOf(i20), (CameraCaptureResultEmptyCameraCaptureResult) obj7, Integer.valueOf(iIntValue)};
                        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                        return (Unit) AFi1cSDK.onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1609748169, iOnNavigationEvent2, iOnNavigationEvent, 1609748169);
                    }
                    WarmUpWebViewModel warmUpWebViewModel3 = warmUpWebViewModel;
                    int i21 = i;
                    int iIntValue2 = ((Integer) obj8).intValue();
                    Object[] objArr2 = {w_Var2, warmUpWebViewModel3, Integer.valueOf(i21), (CameraCaptureResultEmptyCameraCaptureResult) obj7, Integer.valueOf(iIntValue2)};
                    int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                    int iOnNavigationEvent4 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                    int i22 = 84 / 0;
                    return (Unit) AFi1cSDK.onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr2, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1609748169, iOnNavigationEvent4, iOnNavigationEvent3, 1609748169);
                }
            });
        }
    }

    private static final Pair onNavigationEvent(String str, String str2) {
        Object objM31constructorimpl;
        Pair pairIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        Object obj = null;
        try {
            Result.Companion companion = Result.Companion;
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str2, "=", 0, false, 6, (Object) null);
            if (iIndexOf$default < 0) {
                pairIAuthTabCallback = null;
            } else {
                String strSubstring = str2.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                String strOnNavigationEvent = onNavigationEvent(strSubstring);
                String strSubstring2 = str2.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                pairIAuthTabCallback = getWrite.IAuthTabCallback(strOnNavigationEvent, onNavigationEvent(strSubstring2));
            }
            objM31constructorimpl = Result.m31constructorimpl(pairIAuthTabCallback);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(objM31constructorimpl)) {
            int i4 = onWarmupCompleted + 75;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } else {
            obj = objM31constructorimpl;
        }
        return (Pair) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String onWarmupCompleted(@NotNull final String str) {
        Object objM31constructorimpl;
        String str2;
        String string;
        Object next;
        String str3;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Companion companion = Result.Companion;
            String strSubstringBefore$default = StringsKt__StringsKt.substringBefore$default(StringsKt__StringsKt.substringAfter(str, "?", _UrlKt.FRAGMENT_ENCODE_SET), "#", (String) null, 2, (Object) null);
            if (strSubstringBefore$default.length() > 0) {
                str2 = strSubstringBefore$default;
            } else {
                int i4 = onExtraCallback + 89;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                str2 = null;
            }
            if (str2 == null) {
                string = null;
                objM31constructorimpl = Result.m31constructorimpl(string);
            } else {
                Iterator itIAuthTabCallback = ensureCausesIsMutable.extraCallbackWithResult(CollectionsKt___CollectionsKt.asSequence(StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{"&"}, false, 0, 6, (Object) null)), new Function1() { // from class: im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda12
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = onWarmupCompleted + 37;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        Pair pairOnExtraCallback = AFi1cSDK.onExtraCallback(str, (String) obj);
                        int i9 = onWarmupCompleted + 81;
                        onExtraCallback = i9 % 128;
                        if (i9 % 2 != 0) {
                            return pairOnExtraCallback;
                        }
                        throw null;
                    }
                }).IAuthTabCallback();
                while (true) {
                    if (!itIAuthTabCallback.hasNext()) {
                        next = null;
                        break;
                    }
                    int i6 = onExtraCallback + 13;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    next = itIAuthTabCallback.next();
                    String str4 = (String) ((Pair) next).onExtraCallbackWithResult();
                    Object[] objArr = new Object[1];
                    a((char) (TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 58685), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 80271219, new char[]{29458, 1134, 30516, 16456, 10100}, new char[]{0, 0, 0, 0}, new char[]{29580, 51415, 15364, 12773}, objArr);
                    if (Intrinsics.areEqual(str4, ((String) objArr[0]).intern())) {
                        break;
                    }
                }
                Pair pair = (Pair) next;
                if (pair != null && (str3 = (String) pair.getSecond()) != null && (string = StringsKt__StringsKt.trim((CharSequence) str3).toString()) != null) {
                    int i8 = onExtraCallback + 123;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 != 0) {
                        string.length();
                        throw null;
                    }
                    if (string.length() > 0) {
                    }
                    objM31constructorimpl = Result.m31constructorimpl(string);
                }
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.onExtraCallback(objM31constructorimpl) ? null : objM31constructorimpl);
    }

    private static final String onNavigationEvent(String str) throws UnsupportedEncodingException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(URLDecoder.decode(str, Charsets.UTF_8.name()), "");
            throw null;
        }
        String strDecode = URLDecoder.decode(str, Charsets.UTF_8.name());
        Intrinsics.checkNotNullExpressionValue(strDecode, "");
        int i3 = onExtraCallback + 41;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return strDecode;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        if (str == null || (quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, false, new WarmUpWebViewComposableKt$$ExternalSyntheticLambda10(str), 1, (Object) null)) == null) {
            int i2 = onExtraCallback + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return quirksExternalSyntheticBackport0;
        }
        int i4 = onWarmupCompleted + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
    }

    private static final Unit IAuthTabCallback(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onExtraCallbackWithResult(useandconfigureprogramwithtexture, str);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        View view = (View) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ViewCompat.IAuthTabCallback(view, str);
        int i4 = onWarmupCompleted + 83;
        onExtraCallback = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        androidx.core.view.ViewCompat.IAuthTabCallback(r3, r5);
        r3 = o.AFi1cSDK.onExtraCallback + 103;
        o.AFi1cSDK.onWarmupCompleted = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if ((r3 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        androidx.core.view.ViewCompat.IAuthTabCallback(r3, (androidx.core.view.AccessibilityDelegateCompat) null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(TossSecuritiesWebView tossSecuritiesWebView, String str, AccessibilityDelegateCompat accessibilityDelegateCompat) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            ViewCompat.IAuthTabCallback(tossSecuritiesWebView, str);
            int i3 = 69 / 0;
        } else {
            ViewCompat.IAuthTabCallback(tossSecuritiesWebView, str);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) objArr[0];
        final WarmUpWebViewModel warmUpWebViewModel = (WarmUpWebViewModel) objArr[1];
        final getDebugUserGeography getdebugusergeography = (getDebugUserGeography) objArr[2];
        final TossSecuritiesWebView tossSecuritiesWebView = (TossSecuritiesWebView) objArr[3];
        final getTimebase gettimebase = (getTimebase) objArr[4];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((isInVideoUsage) objArr[5], "");
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda15
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final void onStateChanged(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 3;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                AFi1cSDK.onWarmupCompleted(warmUpWebViewModel, getdebugusergeography, tossSecuritiesWebView, gettimebase, textFieldScrollKtExternalSyntheticLambda02, onextracallbackwithresult);
                int i5 = onWarmupCompleted + 71;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
        };
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(lifecycleEventObserver);
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(textFieldScrollKtExternalSyntheticLambda0, lifecycleEventObserver);
        int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onwarmupcompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final AFh1zSDK onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<? extends AFh1zSDK> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AFh1zSDK aFh1zSDK = (AFh1zSDK) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        int i5 = onWarmupCompleted + 49;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return aFh1zSDK;
        }
        throw null;
    }

    private static final int onExtraCallbackWithResult(getTimebase gettimebase) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return gettimebase.onWarmupCompleted();
        }
        gettimebase.onWarmupCompleted();
        throw null;
    }

    private static final void IAuthTabCallback(getTimebase gettimebase, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 69;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        gettimebase.onExtraCallback(i);
        if (i4 == 0) {
            int i5 = 90 / 0;
        }
        int i6 = onWarmupCompleted + 123;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(w_ w_Var, WarmUpWebViewModel warmUpWebViewModel, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {w_Var, warmUpWebViewModel, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (Unit) onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1609748169, iOnNavigationEvent2, iOnNavigationEvent, 1609748169);
    }

    public static /* synthetic */ Unit onExtraCallback(TossSecuritiesWebView tossSecuritiesWebView) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (Unit) onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tossSecuritiesWebView}, iOnNavigationEvent3, -607581405, iOnNavigationEvent2, iOnNavigationEvent, 607581413);
    }

    public static final void onExtraCallbackWithResult(@NotNull TossSecRoute.Web web, @NotNull String str, @Nullable w_ w_Var, @Nullable WarmUpWebViewModel warmUpWebViewModel, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {web, str, w_Var, warmUpWebViewModel, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1085198032, iOnNavigationEvent2, iOnNavigationEvent, 1085198038);
    }

    private static final WarmUpWebViewModel onExtraCallbackWithResult(TossSecRoute.Web web, String str, w_ w_Var, AFi1dSDK aFi1dSDK) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (WarmUpWebViewModel) onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{web, str, w_Var, aFi1dSDK}, iOnNavigationEvent3, -696485095, iOnNavigationEvent2, iOnNavigationEvent, 696485100);
    }

    private static final Unit onExtraCallbackWithResult(TossSecRoute.Web web, String str, w_ w_Var, WarmUpWebViewModel warmUpWebViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {web, str, w_Var, warmUpWebViewModel, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (Unit) onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 2096397355, iOnNavigationEvent2, iOnNavigationEvent, -2096397348);
    }

    private static final decrementVideoUsage onWarmupCompleted(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, WarmUpWebViewModel warmUpWebViewModel, getDebugUserGeography getdebugusergeography, TossSecuritiesWebView tossSecuritiesWebView, getTimebase gettimebase, isInVideoUsage isinvideousage) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (decrementVideoUsage) onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{textFieldScrollKtExternalSyntheticLambda0, warmUpWebViewModel, getdebugusergeography, tossSecuritiesWebView, gettimebase, isinvideousage}, iOnNavigationEvent3, 250711962, iOnNavigationEvent2, iOnNavigationEvent, -250711958);
    }

    private static final Unit IAuthTabCallback(float f, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, TossSecuritiesWebView tossSecuritiesWebView, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {Float.valueOf(f), cameraPresenceProviderExternalSyntheticLambda6, tossSecuritiesWebView, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (Unit) onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -335046935, iOnNavigationEvent2, iOnNavigationEvent, 335046938);
    }

    private static final void onWarmupCompleted(View view, String str) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{view, str}, iOnNavigationEvent3, 69386014, iOnNavigationEvent2, iOnNavigationEvent, -69386013);
    }

    private static final QuirksExternalSyntheticBackport0 IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (QuirksExternalSyntheticBackport0) onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{quirksExternalSyntheticBackport0, str}, iOnNavigationEvent3, 729549528, iOnNavigationEvent2, iOnNavigationEvent, -729549526);
    }
}
