package im.toss.feature.credit.ui.quiz.qna;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.tmoney.LiveCheckConstants;
import im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity;
import im.toss.feature.credit.ui.quiz.qna.CreditQuizActivity$;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.TdsPointToastV1View;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.ANROptimizeSwitch;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppLoadInterceptorPoint;
import o.AppLoadPoint;
import o.AppOnConfigurationChangedPoint;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.ForwardingCameraControl;
import o.PullRefreshIndicatorKtExternalSyntheticLambda3;
import o.RightClickGesturesKtonRightClickDown2;
import o.RippleAnimationfadeOut21;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TypographyKtExternalSyntheticLambda0;
import o.access;
import o.access13800;
import o.enableAudioDjangoExecutorOpt;
import o.enableEndSpmReportInIOThread;
import o.findResAndMsg;
import o.getAdService;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getSpecialFeatureOptInStatus;
import o.h5ScreenShotObserverOnChangeOpt;
import o.isZslDisabledByByUserCaseConfig;
import o.readIntokhttp;
import o.requestPostMessageChannelWithExtras;
import o.setAdVideoPlaybackListener;
import o.setParentLayoutDirection;
import o.setPositionProvider;
import o.y1hExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditQuizActivity extends Hilt_CreditQuizActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    public static final int IAuthTabCallbackDefault;
    private static boolean IAuthTabCallbackStub = false;
    private static boolean IAuthTabCallbackStubProxy = false;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    private static int access100 = 1;
    private static char[] asInterface;
    private static int getInterfaceDescriptor;
    private static int onTransact;
    private final Lazy asBinder = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(CreditQuizViewModel.class), new asInterface(this), new onNavigationEvent(this), new IAuthTabCallbackDefault(null, this));

    @Inject
    public SessionTrackerb tossRouter;

    static {
        IAuthTabCallback();
        Companion = new onExtraCallback(null);
        IAuthTabCallbackDefault = 8;
        int i = getInterfaceDescriptor + 23;
        access100 = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        CreditQuizActivity creditQuizActivity = (CreditQuizActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 57;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault(creditQuizActivity, setDetectableSize);
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(creditQuizActivity, setDetectableSize);
        int i3 = access000 + 23;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditQuizActivity creditQuizActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 3;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(creditQuizActivity, commonModule_setLeftEdgeTouchEnabled);
        }
        onNavigationEvent(creditQuizActivity, commonModule_setLeftEdgeTouchEnabled);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditQuizActivity creditQuizActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 107;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStub(creditQuizActivity, setDetectableSize);
        }
        IAuthTabCallbackStub(creditQuizActivity, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        CreditQuizActivity creditQuizActivity = (CreditQuizActivity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(creditQuizActivity, dialogInterface);
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 83;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit asInterface(CreditQuizActivity creditQuizActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 77;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            getInterfaceDescriptor(creditQuizActivity, dialogInterface);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit interfaceDescriptor = getInterfaceDescriptor(creditQuizActivity, dialogInterface);
        int i3 = access000 + 75;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return interfaceDescriptor;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        CreditQuizActivity creditQuizActivity = (CreditQuizActivity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStubProxy(creditQuizActivity, dialogInterface);
        }
        IAuthTabCallbackStubProxy(creditQuizActivity, dialogInterface);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditQuizActivity creditQuizActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 39;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub(creditQuizActivity, dialogInterface);
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(creditQuizActivity, dialogInterface);
        int i3 = IAuthTabCallback_Parcel + 29;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallbackStub;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditQuizActivity creditQuizActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 121;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(creditQuizActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = access000 + 89;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditQuizActivity creditQuizActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = access000 + 15;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(creditQuizActivity, commonModule_setLeftEdgeTouchEnabled);
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        int i5 = access000 + 45;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditQuizActivity creditQuizActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            asBinder(creditQuizActivity, setDetectableSize);
            throw null;
        }
        Unit unitAsBinder = asBinder(creditQuizActivity, setDetectableSize);
        int i3 = IAuthTabCallback_Parcel + 79;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unitAsBinder;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        CreditQuizActivity creditQuizActivity = (CreditQuizActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = access000 + 3;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditQuizActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = access000 + 33;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditQuizActivity creditQuizActivity, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 75;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(creditQuizActivity, str);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(creditQuizActivity, str);
        int i3 = IAuthTabCallback_Parcel + 59;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditQuizActivity creditQuizActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access000 + 69;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -226557556, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{creditQuizActivity, setDetectableSize}, 226557561);
        int i4 = access000 + 19;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        Object obj;
        int i7 = i2 | i6 | i4;
        int i8 = (~((~i4) | i6)) | i2;
        int i9 = ~((~i2) | i6);
        int i10 = i2 + i6 + i + (1132004924 * i3) + ((-2047965933) * i5);
        int i11 = i10 * i10;
        int i12 = ((1650805025 * i2) - 289800192) + ((-1513965855) * i6) + ((-565098208) * i7) + (i8 * 565098208) + (565098208 * i9) + ((-2079064064) * i) + (1823473664 * i3) + (830210048 * i5) + ((-1143341056) * i11);
        int i13 = ((i2 * (-767560105)) - 1188649921) + (i6 * (-767559017)) + (i7 * (-544)) + (i8 * 544) + (i9 * 544) + (i * (-767559561)) + (i3 * 1544553956) + (i5 * (-1468578859)) + (i11 * (-2108293120));
        switch (i12 + (i13 * i13 * (-2075787264))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                Hilt_CreditQuizActivity hilt_CreditQuizActivity = (CreditQuizActivity) objArr[0];
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
                int i14 = 2 % 2;
                int i15 = IAuthTabCallback_Parcel + 85;
                access000 = i15 % 128;
                if (i15 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(setDetectableSize, "");
                    Object[] objArr2 = new Object[1];
                    a(null, null, new byte[]{-127, -126, -127, -127, -126, -125, -126, -127}, 115 >>> KeyEvent.keyCodeFromString(""), objArr2);
                    obj = objArr2[0];
                } else {
                    Intrinsics.checkNotNullParameter(setDetectableSize, "");
                    Object[] objArr3 = new Object[1];
                    a(null, null, new byte[]{-127, -126, -127, -127, -126, -125, -126, -127}, 127 - KeyEvent.keyCodeFromString(""), objArr3);
                    obj = objArr3[0];
                }
                setDetectableSize.onExtraCallback(((String) obj).intern(), h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(hilt_CreditQuizActivity.getIntent()));
                return Unit.INSTANCE;
            case 6:
                return asBinder(objArr);
            case 7:
                CreditQuizActivity creditQuizActivity = (CreditQuizActivity) objArr[0];
                DialogInterface dialogInterface = (DialogInterface) objArr[1];
                int i16 = 2 % 2;
                int i17 = access000 + 23;
                IAuthTabCallback_Parcel = i17 % 128;
                int i18 = i17 % 2;
                Unit unitAsBinder = asBinder(creditQuizActivity, dialogInterface);
                int i19 = access000 + 25;
                IAuthTabCallback_Parcel = i19 % 128;
                int i20 = i19 % 2;
                return unitAsBinder;
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditQuizActivity creditQuizActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 117;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(creditQuizActivity, dialogInterface);
        int i4 = IAuthTabCallback_Parcel + 121;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return unitIAuthTabCallback_Parcel;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditQuizActivity creditQuizActivity = (CreditQuizActivity) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(creditQuizActivity, commonModule_setLeftEdgeTouchEnabled);
        }
        onExtraCallbackWithResult(creditQuizActivity, commonModule_setLeftEdgeTouchEnabled);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditQuizActivity creditQuizActivity) {
        int i = 2 % 2;
        int i2 = access000 + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            return (Unit) onNavigationEvent(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1239797346, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{creditQuizActivity}, 1239797347);
        }
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int i3 = 61 / 0;
        return (Unit) onNavigationEvent(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1239797346, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{creditQuizActivity}, 1239797347);
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditQuizActivity creditQuizActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(creditQuizActivity, dialogInterface);
        int i4 = access000 + 93;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess000;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access000 + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return -1L;
        }
        int i3 = 13 / 0;
        return -1L;
    }

    public static final /* synthetic */ void IAuthTabCallback(CreditQuizActivity creditQuizActivity, AppLoadInterceptorPoint appLoadInterceptorPoint, setParentLayoutDirection setparentlayoutdirection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 91;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        creditQuizActivity.onExtraCallbackWithResult(appLoadInterceptorPoint, setparentlayoutdirection);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ AppLoadInterceptorPoint onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = access000 + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        AppLoadInterceptorPoint appLoadInterceptorPointOnNavigationEvent = onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<? extends AppLoadInterceptorPoint>) cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = access000 + 111;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return appLoadInterceptorPointOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 41;
        im.toss.feature.credit.ui.quiz.qna.CreditQuizActivity.access000 = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SessionTrackerb onNavigationEvent() {
        SessionTrackerb sessionTrackerb;
        int i = 2 % 2;
        int i2 = access000 + 49;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 == 0) {
            sessionTrackerb = this.tossRouter;
            int i4 = 60 / 0;
        } else {
            sessionTrackerb = this.tossRouter;
        }
    }

    private final CreditQuizViewModel setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        CreditQuizViewModel creditQuizViewModel = (CreditQuizViewModel) this.asBinder.getValue();
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return creditQuizViewModel;
    }

    public static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static char onExtraCallback = 37346;
        private static char onExtraCallbackWithResult = 38078;
        private static char onNavigationEvent = 50014;
        private static int onTransact = 1;
        private static char onWarmupCompleted = 49906;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final Intent IAuthTabCallback(@NotNull Context context, @NotNull String str, @Nullable enableAudioDjangoExecutorOpt enableaudiodjangoexecutoropt) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) CreditQuizActivity.class);
            Object[] objArr = new Object[1];
            a(new char[]{1971, 27108, 63759, 65068, 22192, 56873, 42601, 36500}, View.MeasureSpec.makeMeasureSpec(0, 0) + 8, objArr);
            intent.putExtra(((String) objArr[0]).intern(), str);
            intent.putExtra("quiz", enableaudiodjangoexecutoropt);
            int i2 = IAuthTabCallback + 97;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return intent;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                char c = 1;
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i4 = 58224;
                int i5 = i3;
                while (i5 < 16) {
                    int i6 = $10 + 67;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    char c2 = cArr3[c];
                    char c3 = cArr3[i3];
                    int i8 = (c3 + i4) ^ ((c3 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                    int i9 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onNavigationEvent);
                        objArr2[2] = Integer.valueOf(i9);
                        objArr2[c] = Integer.valueOf(i8);
                        objArr2[i3] = Integer.valueOf(c2);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', i3, i3));
                            int scrollBarFadeDuration = 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int trimmedLength = TextUtils.getTrimmedLength("") + 12434;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[c] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, scrollBarFadeDuration, trimmedLength, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[c] = cCharValue;
                        int i10 = i5;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 10 - (Process.myPid() >> 22), MotionEvent.axisFromString("") + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i4 -= 40503;
                        i5 = i10 + 1;
                        i3 = 0;
                        c = 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), View.getDefaultSize(0, 0) + 14, KeyEvent.getDeadChar(0, 0) + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i3 = 0;
            }
            String str = new String(cArr2, 0, i);
            int i11 = $11 + 37;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            objArr[0] = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        super/*im.toss.base.BaseActivity*/.onCreate(bundle);
        Window window = getWindow();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        window.setStatusBarColor(new getDEFAULT_CONNECTION_SPECSokhttp(new onExtraCallbackWithResult(configuration)).onExtraCallbackWithResult());
        Window window2 = getWindow();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        Configuration configuration2 = resources2.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        window2.setNavigationBarColor(new getDEFAULT_CONNECTION_SPECSokhttp(new onWarmupCompleted(configuration2)).onExtraCallbackWithResult());
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-493034181, true, new CreditQuizActivity$.ExternalSyntheticLambda15(this))), 1, (Object) null);
        int i2 = access000 + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<AppLoadInterceptorPoint> $event$delegate;
        final /* synthetic */ setParentLayoutDirection $navController;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(setParentLayoutDirection setparentlayoutdirection, CameraPresenceProviderExternalSyntheticLambda6<? extends AppLoadInterceptorPoint> cameraPresenceProviderExternalSyntheticLambda6, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$navController = setparentlayoutdirection;
            this.$event$delegate = cameraPresenceProviderExternalSyntheticLambda6;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = CreditQuizActivity.this.new IAuthTabCallback(this.$navController, this.$event$delegate, access13800Var);
            int i2 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 61;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 83;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            CreditQuizActivity.IAuthTabCallback(CreditQuizActivity.this, CreditQuizActivity.onExtraCallbackWithResult(this.$event$delegate), this.$navController);
            Unit unit = Unit.INSTANCE;
            int i7 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ ComponentActivity onExtraCallback;

        public onNavigationEvent(ComponentActivity componentActivity) {
            this.onExtraCallback = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onWarmupCompleted();
            }
            onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ViewModelProvider.onWarmupCompleted onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ComponentActivity componentActivity = this.onExtraCallback;
            if (i3 == 0) {
                return componentActivity.getDefaultViewModelProviderFactory();
            }
            componentActivity.getDefaultViewModelProviderFactory();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asInterface implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ ComponentActivity IAuthTabCallback;

        public asInterface(ComponentActivity componentActivity) {
            this.IAuthTabCallback = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onWarmupCompleted + 11;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 0 / 0;
            }
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.IAuthTabCallback.getViewModelStore();
            int i4 = onWarmupCompleted + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return viewModelStore;
        }
    }

    public static final class IAuthTabCallbackDefault implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function0 IAuthTabCallback;
        final /* synthetic */ ComponentActivity onExtraCallback;

        public IAuthTabCallbackDefault(Function0 function0, ComponentActivity componentActivity) {
            this.IAuthTabCallback = function0;
            this.onExtraCallback = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback = onExtraCallback();
            int i4 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 30 / 0;
            }
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        
            r2 = im.toss.feature.credit.ui.quiz.qna.CreditQuizActivity.IAuthTabCallbackDefault.onWarmupCompleted + 37;
            im.toss.feature.credit.ui.quiz.qna.CreditQuizActivity.IAuthTabCallbackDefault.onExtraCallbackWithResult = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
        
            if ((r2 % 2) != 0) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
        
            if (r1 != null) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            if (r1 != null) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallback() {
            int i = 2 % 2;
            Function0 function0 = this.IAuthTabCallback;
            if (function0 != null) {
                int i2 = onExtraCallbackWithResult + 49;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (i3 == 0) {
                    int i4 = 48 / 0;
                }
            }
            return this.onExtraCallback.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [im.toss.base.BaseActivity, im.toss.feature.credit.ui.quiz.qna.CreditQuizActivity] */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        ?? r4 = (CreditQuizActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        r4.validateRelationship();
        r4.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 109;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(CreditQuizActivity creditQuizActivity, String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strEncode = URLEncoder.encode(str, "UTF-8");
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-110, -117, -127, -123, -111, -124, -126, -112, -113, -113, -114, -116, -116, -121, -122, -127, -126, -115, -123, -116}, 127 - View.combineMeasuredStates(0, 0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strEncode);
        SessionTrackerb.IAuthTabCallback(creditQuizActivity.onNavigationEvent(), creditQuizActivity, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 79;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(CreditQuizActivity creditQuizActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        boolean zOnExtraCallback;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = access000 + 7;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1565003411, i, -1, "im.toss.feature.credit.ui.quiz.qna.CreditQuizActivity.onCreate.<anonymous>.<anonymous> (CreditQuizActivity.kt:65)");
            }
            setParentLayoutDirection setparentlayoutdirectionOnWarmupCompleted = RippleAnimationfadeOut21.onWarmupCompleted(new PullRefreshIndicatorKtExternalSyntheticLambda3[0], cameraCaptureResultEmptyCameraCaptureResult, 0);
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.onExtraCallbackWithResult(creditQuizActivity.setEngagementSignalsCallback().onExtraCallback(), (Object) null, (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 14);
            AppLoadInterceptorPoint appLoadInterceptorPointOnNavigationEvent = onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<? extends AppLoadInterceptorPoint>) cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditQuizActivity);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult);
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(setparentlayoutdirectionOnWarmupCompleted);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback2 | zOnNavigationEvent | zOnExtraCallback3)) {
                int i5 = access000 + 107;
                IAuthTabCallback_Parcel = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 87 / 0;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = creditQuizActivity.new IAuthTabCallback(setparentlayoutdirectionOnWarmupCompleted, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult, null);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                        int i7 = access000 + 121;
                        IAuthTabCallback_Parcel = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i8 = 3 / 3;
                        }
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(appLoadInterceptorPointOnNavigationEvent, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    String strOnNavigationEvent = h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(creditQuizActivity.getIntent());
                    CreditQuizViewModel engagementSignalsCallback = creditQuizActivity.setEngagementSignalsCallback();
                    enableAudioDjangoExecutorOpt enableaudiodjangoexecutoroptAsInterface = creditQuizActivity.setEngagementSignalsCallback().asInterface();
                    String strOnExtraCallbackWithResult = (enableaudiodjangoexecutoroptAsInterface == null && enableaudiodjangoexecutoroptAsInterface.onNavigationEvent()) ? AppOnConfigurationChangedPoint.onExtraCallbackWithResult.onExtraCallbackWithResult.onExtraCallbackWithResult() : AppOnConfigurationChangedPoint.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult();
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditQuizActivity);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnExtraCallback) {
                        int i9 = access000 + 107;
                        IAuthTabCallback_Parcel = i9 % 128;
                        int i10 = i9 % 2;
                        Object obj = objOnMinimized2;
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            CreditQuizActivity$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new CreditQuizActivity$.ExternalSyntheticLambda0(creditQuizActivity);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda0);
                            obj = externalSyntheticLambda0;
                        }
                        Function1 function1 = (Function1) obj;
                        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditQuizActivity);
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!zOnExtraCallback4) {
                            Object obj2 = objOnMinimized3;
                            if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                CreditQuizActivity$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new CreditQuizActivity$.ExternalSyntheticLambda1(creditQuizActivity);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda1);
                                obj2 = externalSyntheticLambda1;
                            }
                            AppLoadPoint.IAuthTabCallback(-1762606800, 1762606803, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{strOnNavigationEvent, engagementSignalsCallback, setparentlayoutdirectionOnWarmupCompleted, function1, (Function0) obj2, strOnExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResult, 0, 0});
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                        }
                    }
                } else {
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(appLoadInterceptorPointOnNavigationEvent, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    String strOnNavigationEvent2 = h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(creditQuizActivity.getIntent());
                    CreditQuizViewModel engagementSignalsCallback2 = creditQuizActivity.setEngagementSignalsCallback();
                    enableAudioDjangoExecutorOpt enableaudiodjangoexecutoroptAsInterface2 = creditQuizActivity.setEngagementSignalsCallback().asInterface();
                    if (enableaudiodjangoexecutoroptAsInterface2 == null) {
                        String strOnExtraCallbackWithResult2 = (enableaudiodjangoexecutoroptAsInterface2 == null && enableaudiodjangoexecutoroptAsInterface2.onNavigationEvent()) ? AppOnConfigurationChangedPoint.onExtraCallbackWithResult.onExtraCallbackWithResult.onExtraCallbackWithResult() : AppOnConfigurationChangedPoint.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult();
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditQuizActivity);
                        Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (zOnExtraCallback) {
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(CreditQuizActivity creditQuizActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = IAuthTabCallback_Parcel + 15;
                access000 = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-493034181, i, -1, "im.toss.feature.credit.ui.quiz.qna.CreditQuizActivity.onCreate.<anonymous> (CreditQuizActivity.kt:64)");
                int i5 = IAuthTabCallback_Parcel + 35;
                access000 = i5 % 128;
                int i6 = i5 % 2;
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1565003411, true, new CreditQuizActivity$.ExternalSyntheticLambda13(creditQuizActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void validateRelationship() throws Throwable {
        String strOnWarmupCompleted;
        int i = 2 % 2;
        String str = null;
        if (setEngagementSignalsCallback().onNavigationEvent()) {
            if (setEngagementSignalsCallback().onWarmupCompleted() != null) {
                CreditQuizNextInfoActivity.onNavigationEvent onnavigationevent = CreditQuizNextInfoActivity.Companion;
                String strOnNavigationEvent = h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(getIntent());
                ANROptimizeSwitch aNROptimizeSwitchOnWarmupCompleted = setEngagementSignalsCallback().onWarmupCompleted();
                String strOnNavigationEvent2 = aNROptimizeSwitchOnWarmupCompleted != null ? aNROptimizeSwitchOnWarmupCompleted.onNavigationEvent() : null;
                ANROptimizeSwitch aNROptimizeSwitchOnWarmupCompleted2 = setEngagementSignalsCallback().onWarmupCompleted();
                if (aNROptimizeSwitchOnWarmupCompleted2 != null) {
                    int i2 = IAuthTabCallback_Parcel + 7;
                    access000 = i2 % 128;
                    if (i2 % 2 != 0) {
                        strOnWarmupCompleted = aNROptimizeSwitchOnWarmupCompleted2.onWarmupCompleted();
                        int i3 = 46 / 0;
                    } else {
                        strOnWarmupCompleted = aNROptimizeSwitchOnWarmupCompleted2.onWarmupCompleted();
                    }
                    str = strOnWarmupCompleted;
                    int i4 = access000 + 21;
                    IAuthTabCallback_Parcel = i4 % 128;
                    int i5 = i4 % 2;
                }
                startActivity(onnavigationevent.onExtraCallbackWithResult(this, strOnNavigationEvent, strOnNavigationEvent2, str, setEngagementSignalsCallback().IAuthTabCallbackStub()));
                return;
            }
            SessionTrackerb.IAuthTabCallback(onNavigationEvent(), this, setEngagementSignalsCallback().IAuthTabCallbackStub(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            int i6 = access000 + 47;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = access000 + 29;
        IAuthTabCallback_Parcel = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallbackDefault(CreditQuizActivity creditQuizActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-127, -126, -127, -127, -126, -125, -126, -127}, 127 - KeyEvent.keyCodeFromString(""), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditQuizActivity.getReferrerParam());
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-126, -117, -122, -118, -122, -119, -120, -121, -122, -122, -123, -124}, TextUtils.lastIndexOf("", '0', 0, 0) + 128, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), creditQuizActivity.getString(R.string.alert_dialog_delete_cancel));
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 33;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallbackStub(CreditQuizActivity creditQuizActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1299583L, false, null, null, new CreditQuizActivity$.ExternalSyntheticLambda14(creditQuizActivity), 14, null);
        creditQuizActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 75;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 62 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallbackStub(CreditQuizActivity creditQuizActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-127, -126, -127, -127, -126, -125, -126, -127}, 127 - ExpandableListView.getPackedPositionType(0L), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditQuizActivity.getReferrerParam());
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-126, -117, -122, -118, -122, -119, -120, -121, -122, -122, -123, -124}, TextUtils.lastIndexOf("", '0', 0) + 128, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), creditQuizActivity.getString(im.toss.features.credit.ui.R.string.credit_quiz_go_to_review_note));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 97;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onTransact(CreditQuizActivity creditQuizActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1299583L, false, null, null, new CreditQuizActivity$.ExternalSyntheticLambda5(creditQuizActivity), 14, null);
        SessionTrackerb.IAuthTabCallback(creditQuizActivity.onNavigationEvent(), creditQuizActivity, h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.onActivityResized.onExtraCallback, false, "credit_quiz", true, null, 9, null), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        creditQuizActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 49;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asBinder(CreditQuizActivity creditQuizActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            creditQuizActivity.finish();
            Unit unit = Unit.INSTANCE;
            int i3 = access000 + 21;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 35 / 0;
            }
            return unit;
        }
        creditQuizActivity.finish();
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(CreditQuizActivity creditQuizActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1299581L, false, null, null, new CreditQuizActivity$.ExternalSyntheticLambda6(creditQuizActivity), 14, null);
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(creditQuizActivity.getString(im.toss.features.credit.ui.R.string.credit_quiz_not_available_dialog_title));
        String string = creditQuizActivity.getString(im.toss.features.credit.ui.R.string.credit_quiz_not_available_dialog_description);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String str = String.format(string, Arrays.copyOf(new Object[]{7}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str);
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, R.string.alert_dialog_delete_cancel, (TdsButtonV1View.asInterface) null, false, new CreditQuizActivity$.ExternalSyntheticLambda7(creditQuizActivity), 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, im.toss.features.credit.ui.R.string.credit_quiz_go_to_review_note, (TdsButtonV1View.asInterface) null, false, new CreditQuizActivity$.ExternalSyntheticLambda8(creditQuizActivity), 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.asBinder(new CreditQuizActivity$.ExternalSyntheticLambda9(creditQuizActivity));
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 25;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asBinder(CreditQuizActivity creditQuizActivity, SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = access000 + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-127, -126, -127, -127, -126, -125, -126, -127}, Color.alpha(1) * 84, objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-127, -126, -127, -127, -126, -125, -126, -127}, Color.alpha(0) + 127, objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), creditQuizActivity.getReferrerParam());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallbackStubProxy(CreditQuizActivity creditQuizActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        creditQuizActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 43;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit getInterfaceDescriptor(CreditQuizActivity creditQuizActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        creditQuizActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 65;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(CreditQuizActivity creditQuizActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1266233L, false, null, null, new CreditQuizActivity$.ExternalSyntheticLambda10(creditQuizActivity), 14, null);
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(creditQuizActivity.getString(im.toss.features.credit.ui.quiz.R.string.point_payment_delay_title));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(creditQuizActivity.getString(im.toss.features.credit.ui.quiz.R.string.point_payment_delay_description));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, im.toss.uikit.R.string.uikit_ok, (TdsButtonV1View.asInterface) null, false, new CreditQuizActivity$.ExternalSyntheticLambda11(creditQuizActivity), 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.asBinder(new CreditQuizActivity$.ExternalSyntheticLambda12(creditQuizActivity));
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = asInterface;
        float f = 0.0f;
        if (cArr3 != null) {
            int i3 = $10 + 109;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), 76 - Process.getGidForName(""), ((Process.getThreadPriority(0) + 20) >> 6) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(onTransact)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), View.MeasureSpec.getSize(0) + 75, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16036, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (IAuthTabCallbackStubProxy) {
            int i6 = $10 + 99;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i7 = $11 + 13;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i] >> iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.indexOf("", "") + 63, 12214 - View.MeasureSpec.makeMeasureSpec(0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    try {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 62 - TextUtils.lastIndexOf("", '0', 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (!IAuthTabCallbackStub) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i8 = $11 + 39;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i10 = $10 + 49;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i12 = $11 + 59;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i14 = $10 + 67;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] << iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 62, Color.alpha(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 63 - (ViewConfiguration.getEdgeSlop() >> 16), 12214 - (ViewConfiguration.getTapTimeout() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(AppLoadInterceptorPoint appLoadInterceptorPoint, setParentLayoutDirection setparentlayoutdirection) {
        int i = 2 % 2;
        if (appLoadInterceptorPoint instanceof AppLoadInterceptorPoint.onExtraCallbackWithResult) {
            TypographyKtExternalSyntheticLambda0.onNavigationEvent(setparentlayoutdirection, AppOnConfigurationChangedPoint.onExtraCallbackWithResult.onExtraCallbackWithResult.onExtraCallbackWithResult(), (setPositionProvider) null, (PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback) null, 6, (Object) null);
            return;
        }
        if (appLoadInterceptorPoint instanceof AppLoadInterceptorPoint.onExtraCallback) {
            int i2 = IAuthTabCallback_Parcel + 69;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent(((AppLoadInterceptorPoint.onExtraCallback) appLoadInterceptorPoint).onExtraCallback());
            TypographyKtExternalSyntheticLambda0.onNavigationEvent(setparentlayoutdirection, AppOnConfigurationChangedPoint.onWarmupCompleted.IAuthTabCallback.onExtraCallbackWithResult(), (setPositionProvider) null, (PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback) null, 6, (Object) null);
            int i4 = IAuthTabCallback_Parcel + 111;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (appLoadInterceptorPoint instanceof AppLoadInterceptorPoint.IAuthTabCallback) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new CreditQuizActivity$.ExternalSyntheticLambda2(this));
        } else if (appLoadInterceptorPoint instanceof AppLoadInterceptorPoint.onWarmupCompleted) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new CreditQuizActivity$.ExternalSyntheticLambda3(this));
        } else if (appLoadInterceptorPoint instanceof AppLoadInterceptorPoint.onNavigationEvent) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new CreditQuizActivity$.ExternalSyntheticLambda4(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback_Parcel(CreditQuizActivity creditQuizActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 1;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        creditQuizActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 15;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit access000(CreditQuizActivity creditQuizActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 21;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            creditQuizActivity.finish();
            int i3 = 99 / 0;
            return Unit.INSTANCE;
        }
        creditQuizActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallbackDefault(CreditQuizActivity creditQuizActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(creditQuizActivity.getString(R.string.error_retry_message));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, im.toss.uikit.R.string.uikit_ok, (TdsButtonV1View.asInterface) null, false, new CreditQuizActivity$.ExternalSyntheticLambda16(creditQuizActivity), 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.asBinder(new CreditQuizActivity$.ExternalSyntheticLambda17(creditQuizActivity));
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 87;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(enableEndSpmReportInIOThread enableendspmreportiniothread) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 75;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (enableendspmreportiniothread.asInterface()) {
            new TdsPointToastV1View.IAuthTabCallback(this).onExtraCallback(enableendspmreportiniothread.IAuthTabCallback()).onNavigationEvent(enableendspmreportiniothread.onTransact()).onExtraCallbackWithResult(TdsPointToastV1View.onNavigationEvent.IMMEDIATE).IAuthTabCallback(false).IAuthTabCallback();
        }
        int i4 = access000 + 111;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final AppLoadInterceptorPoint onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<? extends AppLoadInterceptorPoint> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        AppLoadInterceptorPoint appLoadInterceptorPoint = (AppLoadInterceptorPoint) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        return appLoadInterceptorPoint;
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = onNavigationEvent + 69;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onWarmupCompleted);
            throw null;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = IAuthTabCallback + 33;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            throw null;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditQuizActivity creditQuizActivity, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) onNavigationEvent(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -2135578509, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{creditQuizActivity, setDetectableSize}, 2135578509);
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditQuizActivity creditQuizActivity, DialogInterface dialogInterface) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) onNavigationEvent(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 41494280, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{creditQuizActivity, dialogInterface}, -41494274);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditQuizActivity creditQuizActivity, DialogInterface dialogInterface) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) onNavigationEvent(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1813102142, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{creditQuizActivity, dialogInterface}, -1813102135);
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditQuizActivity creditQuizActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) onNavigationEvent(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 956472737, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{creditQuizActivity, commonModule_setLeftEdgeTouchEnabled}, -956472734);
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditQuizActivity creditQuizActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditQuizActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onNavigationEvent(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -667070041, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), objArr, 667070045);
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(CreditQuizActivity creditQuizActivity, DialogInterface dialogInterface) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) onNavigationEvent(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -57938675, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{creditQuizActivity, dialogInterface}, 57938677);
    }

    private static final Unit onWarmupCompleted(CreditQuizActivity creditQuizActivity, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) onNavigationEvent(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -226557556, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{creditQuizActivity, setDetectableSize}, 226557561);
    }

    private static final Unit onExtraCallback(CreditQuizActivity creditQuizActivity) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) onNavigationEvent(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1239797346, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{creditQuizActivity}, 1239797347);
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 73;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = access000 + 113;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = access000 + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = access000 + 59;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = access000 + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = access000 + 7;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access000 + 113;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            throw null;
        }
    }

    static void IAuthTabCallback() {
        asInterface = new char[]{32581, 32586, 32585, 32597, 32634, 32635, 32576, 32577, 32592, 32590, 32579, 32580, 32583, 32573, 32512, 32632, 32560, 32562};
        onTransact = -1184333833;
        IAuthTabCallbackStub = true;
        IAuthTabCallbackStubProxy = true;
    }
}
