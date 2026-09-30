package o;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.security.keystore.KeyGenParameterSpec;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.devtool.action.quickaction.QuickActionBottomSheetActivity$IAuthTabCallbackStub;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.security.impl.malware.MalwareDetectActivity$IAuthTabCallback;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Map;
import javax.crypto.KeyGenerator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kr.or.kisa.seed.pbkdf2.PBKDF2;
import o.UST_CMP_IssueCertificate;
import o.getBooleanFromAdObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.main.SuspendingClearWebView;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;
import viva.republica.toss.util.SecurityUtil$;

/* loaded from: classes.dex */
public final class enableCppPropsIteratorSetter {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static byte[] IAuthTabCallbackStubProxy = null;
    private static int IAuthTabCallback_Parcel = 1;
    private static int ICustomTabsCallback = 0;
    private static int access000 = 0;
    private static long access100 = 0;
    private static int asBinder = 0;
    private static boolean asInterface = false;
    private static int extraCallback = 1;
    private static short[] getInterfaceDescriptor;
    private static final String onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static int onTransact;
    public static final enableCppPropsIteratorSetter onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, String str3, String str4, String str5, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access000 + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, str2, str3, str4, str5, setDetectableSize);
        int i4 = access000 + 121;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, String str3, dangerouslyReset dangerouslyreset, String str4, String str5, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = access000 + 45;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, str2, str3, dangerouslyreset, str4, str5, commonModule_setLeftEdgeTouchEnabled);
        int i4 = IAuthTabCallback_Parcel + 39;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(th);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(th);
        int i3 = IAuthTabCallback_Parcel + 49;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Activity activity = (Activity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 53;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(activity, dialogInterface);
        int i4 = IAuthTabCallback_Parcel + 121;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = (~i5) | i8;
        int i10 = ~(i5 | i8);
        int i11 = i4 + i2 + i3 + ((-714989572) * i6) + (1142003473 * i);
        int i12 = i11 * i11;
        int i13 = (((-190873766) * i4) - 1983905792) + (1136689320 * i2) + (i7 * (-1483702105)) + (1483702105 * i9) + ((-1483702105) * i10) + ((-1674575872) * i3) + ((-1891631104) * i6) + ((-1355808768) * i) + ((-1882259456) * i12);
        int i14 = (i4 * (-1158907614)) + 1427560840 + (i2 * (-1158905656)) + (i7 * 979) + (i9 * (-979)) + (i10 * 979) + (i3 * (-1158906635)) + (i6 * 1387703340) + (i * 1202573125) + (i12 * (-451215360));
        switch (i13 + (i14 * i14 * (-310837248))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                enableCppPropsIteratorSetter enablecpppropsiteratorsetter = (enableCppPropsIteratorSetter) objArr[0];
                String str = (String) objArr[1];
                String str2 = (String) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                int iIntValue2 = ((Number) objArr[4]).intValue();
                int i15 = 2 % 2;
                int i16 = access000 + 9;
                IAuthTabCallback_Parcel = i16 % 128;
                if (i16 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    return enablecpppropsiteratorsetter.onNavigationEvent(PageKey.onWarmupCompleted(str, (Charset) null, 0, (Object) null), PageKey.onWarmupCompleted(str2, (Charset) null, 0, (Object) null), iIntValue, iIntValue2);
                }
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return enablecpppropsiteratorsetter.onNavigationEvent(PageKey.onWarmupCompleted(str, (Charset) null, 1, (Object) null), PageKey.onWarmupCompleted(str2, (Charset) null, 1, (Object) null), iIntValue, iIntValue2);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                int i17 = 2 % 2;
                int i18 = IAuthTabCallback_Parcel + 21;
                access000 = i18 % 128;
                int i19 = i18 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
                Object[] objArr2 = new Object[1];
                a((short) (Process.myPid() >> 22), (byte) ((-3) - View.combineMeasuredStates(0, 0)), TextUtils.getCapsMode("", 0, 0) - 692973280, (ViewConfiguration.getEdgeSlop() >> 16) + 530870068, Color.red(0) - 13075, objArr2);
                int iOnWarmupCompleted = textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onWarmupCompleted(((String) objArr2[0]).intern(), 0);
                int i20 = IAuthTabCallback_Parcel + 37;
                access000 = i20 % 128;
                int i21 = i20 % 2;
                return Integer.valueOf(iOnWarmupCompleted);
            case 10:
                return asInterface(objArr);
            case 11:
                return asBinder(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(String str, dangerouslyReset dangerouslyreset, String str2, String str3, String str4, String str5, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 55;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, dangerouslyreset, str2, str3, str4, str5, dialogInterface);
        int i4 = IAuthTabCallback_Parcel + 125;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(th);
        if (i3 != 0) {
            int i4 = 12 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        DialogInterface dialogInterface = (DialogInterface) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(dialogInterface);
        int i4 = access000 + 99;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Activity activity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = access000 + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(activity, commonModule_setLeftEdgeTouchEnabled);
        int i4 = IAuthTabCallback_Parcel + 11;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(dangerouslyReset dangerouslyreset, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 109;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(dangerouslyreset, dialogInterface);
        int i4 = IAuthTabCallback_Parcel + 93;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 47;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 85;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, obj);
        int i4 = access000 + 61;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void b(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(access100 ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 23;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = MalwareDetectActivity$IAuthTabCallback.onExtraCallback.e(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4], timelineExternalSyntheticLambda0.onExtraCallbackWithResult, access100);
            tryTriggerOnStart.d(timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0);
            int i5 = $10 + 79;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 5;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    private enableCppPropsIteratorSetter() {
    }

    static {
        asBinder();
        Object[] objArr = new Object[1];
        a((short) TextUtils.getTrimmedLength(""), (byte) (24 - Color.green(0)), (-692973382) - (Process.myPid() >> 22), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 530870053, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 13076, objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((short) (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (ImageFormat.getBitsPerPixel(0) - 102), (ViewConfiguration.getWindowTouchSlop() >> 8) - 692973370, 530870082 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) - 13075, objArr2);
        onExtraCallback = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a((short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (KeyEvent.normalizeMetaState(0) - 102), (-692973359) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 530870051, (-13074) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr3);
        onExtraCallbackWithResult = ((String) objArr3[0]).intern();
        onWarmupCompleted = new enableCppPropsIteratorSetter();
        asBinder = 1;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr4 = new Object[1];
        a((short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (byte) (TextUtils.indexOf("", "") - 102), View.resolveSizeAndState(0, 0, 0) - 692973360, 530870050 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 13075, objArr4);
        asInterface = textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallback(((String) objArr4[0]).intern(), false);
        IAuthTabCallback = 8;
        int i = ICustomTabsCallback + 51;
        extraCallback = i % 128;
        int i2 = i % 2;
    }

    public final int IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access000 + 109;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        int i5 = asBinder;
        int i6 = i3 + 109;
        access000 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() throws PackageManager.NameNotFoundException, IOException, NullPointerException {
        int i = 2 % 2;
        Context contextOnExtraCallback = UserChoiceBillingListener.onExtraCallback.onExtraCallback();
        ApplicationInfo applicationInfo = contextOnExtraCallback.getPackageManager().getPackageInfo(contextOnExtraCallback.getPackageName(), 134217728).applicationInfo;
        Intrinsics.checkNotNull(applicationInfo);
        File file = new File(applicationInfo.sourceDir);
        byte[] bArr = new byte[(int) file.length()];
        new FileInputStream(file).read(bArr);
        String strIAuthTabCallback = EstimateFaceQualityFromBGRImage.IAuthTabCallback(EstimateFaceQualityFromBGRImage.IAuthTabCallback, bArr, false, 2, (Object) null);
        int i2 = access000 + 63;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return strIAuthTabCallback;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 55;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = asInterface;
        int i5 = i2 + 71;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 69;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 103), (-692973360) - Color.red(0), Color.alpha(0) + 530870050, (-13075) - (ViewConfiguration.getTapTimeout() >> 16), objArr);
        textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onNavigationEvent(((String) objArr[0]).intern(), z);
        asInterface = z;
        int i4 = IAuthTabCallback_Parcel + 51;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(enableCppPropsIteratorSetter enablecpppropsiteratorsetter, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, asArray asarray, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            asarray = setTestMode.onExtraCallback.onTransact();
            int i3 = IAuthTabCallback_Parcel + 53;
            access000 = i3 % 128;
            int i4 = i3 % 2;
        }
        Object objOnExtraCallbackWithResult = enablecpppropsiteratorsetter.onExtraCallbackWithResult(graniteBrownfieldModule_closeView, asarray, access13800Var);
        int i5 = access000 + 77;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return objOnExtraCallbackWithResult;
    }

    public final Object onExtraCallbackWithResult(@NotNull GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, @NotNull asArray asarray, @NotNull access13800<? super String> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onWarmupCompleted(), new onTransact(graniteBrownfieldModule_closeView, asarray, (access13800) null), access13800Var);
        int i2 = IAuthTabCallback_Parcel + 55;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    public final Object onNavigationEvent(@NotNull GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, @NotNull access13800<? super Map<String, String>> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onWarmupCompleted(), new asBinder(graniteBrownfieldModule_closeView, (access13800) null), access13800Var);
        int i2 = IAuthTabCallback_Parcel + 61;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    public static /* synthetic */ Object onExtraCallback(enableCppPropsIteratorSetter enablecpppropsiteratorsetter, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, asArray asarray, boolean z, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = access000 + 33;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                asarray = setTestMode.onExtraCallback.onTransact();
                int i4 = 74 / 0;
            } else {
                asarray = setTestMode.onExtraCallback.onTransact();
            }
        }
        if ((i & 4) != 0) {
            int i5 = access000 + 67;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            z = asInterface;
        }
        return enablecpppropsiteratorsetter.IAuthTabCallback(graniteBrownfieldModule_closeView, asarray, z, access13800Var);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = (GraniteBrownfieldModule_closeView) objArr[1];
        asArray asarray = (asArray) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onWarmupCompleted(), new onNavigationEvent(zBooleanValue, graniteBrownfieldModule_closeView, asarray, (access13800) null), (access13800) objArr[4]);
        int i2 = IAuthTabCallback_Parcel + 111;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    private final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = access000 + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr = new Object[1];
        a((short) Drawable.resolveOpacity(0, 0), (byte) (Color.blue(0) - 103), (-692973370) - (ViewConfiguration.getScrollDefaultDelay() >> 16), Color.red(0) + 530870082, (-13075) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        String strOnExtraCallbackWithResult = textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallbackWithResult(((String) objArr[0]).intern(), "");
        int i4 = IAuthTabCallback_Parcel + 123;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        asArray asarrayOnTransact;
        enableCppPropsIteratorSetter enablecpppropsiteratorsetter = (enableCppPropsIteratorSetter) objArr[0];
        String str = (String) objArr[1];
        asArray asarray = (asArray) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = access000 + 13;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        if ((iIntValue & 2) != 0) {
            int i5 = i3 + 107;
            access000 = i5 % 128;
            if (i5 % 2 != 0) {
                asarrayOnTransact = setTestMode.onExtraCallback.onTransact();
                int i6 = 39 / 0;
            } else {
                asarrayOnTransact = setTestMode.onExtraCallback.onTransact();
            }
            asarray = asarrayOnTransact;
        }
        return enablecpppropsiteratorsetter.onExtraCallbackWithResult(str, asarray);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final String onExtraCallbackWithResult(@NotNull String str, @NotNull asArray asarray) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(asarray, "");
        String interfaceDescriptor = getInterfaceDescriptor();
        if (interfaceDescriptor.length() == 0) {
            int i2 = IAuthTabCallback_Parcel + 121;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a((short) TextUtils.indexOf("", "", 0, 0), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 25), (-692973382) + (ViewConfiguration.getFadingEdgeLength() >> 16), 530870053 - View.getDefaultSize(0, 0), (-13075) - TextUtils.indexOf("", "", 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b(new char[]{16785, 16865, 13837, 55930, 11697, 43417, 61924, 43616, 32169, 6536, 62930, 28128, 8668, 31321, 52672, 18878, 20958, 51820, 7665, 47558, 33201, 39468, 28145}, Color.alpha(0) + 1, objArr2);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr2[0]).intern(), (Throwable) null, (Map) null, 12, (Object) null);
            int i4 = access000 + 43;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str2 = interfaceDescriptor;
        }
        int i6 = onExtraCallback.onExtraCallback[asarray.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Object[] objArr3 = {EstimateFaceQualityFromBGRImage.IAuthTabCallback, str2, getPageContainer.IAuthTabCallback(str)};
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            return (String) EstimateFaceQualityFromBGRImage.onWarmupCompleted(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 2046127422, objArr3, -2046127422, iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2);
        }
        if (asInterface) {
            int i7 = IAuthTabCallback_Parcel + 91;
            access000 = i7 % 128;
            int i8 = i7 % 2;
            Object[] objArr4 = {EstimateFaceQualityFromBGRImage.IAuthTabCallback, str2, getPageContainer.IAuthTabCallback(str)};
            int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback4 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            return (String) EstimateFaceQualityFromBGRImage.onWarmupCompleted(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 2046127422, objArr4, -2046127422, iIAuthTabCallback3, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback4);
        }
        Object obj = null;
        Object[] objArr5 = {EstimateFaceQualityFromBGRImage.IAuthTabCallback, str2, PageKey.onWarmupCompleted(str, (Charset) null, 1, (Object) null)};
        int iIAuthTabCallback5 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback6 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        String str3 = (String) EstimateFaceQualityFromBGRImage.onWarmupCompleted(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 2046127422, objArr5, -2046127422, iIAuthTabCallback5, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback6);
        int i9 = IAuthTabCallback_Parcel + 73;
        access000 = i9 % 128;
        if (i9 % 2 == 0) {
            return str3;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (getInterfaceDescriptor().length() == 0) {
            return true;
        }
        int i4 = IAuthTabCallback_Parcel + 13;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 97;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            accessMapSafely.onNavigationEvent.onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        accessMapSafely.onNavigationEvent.onNavigationEvent();
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback_Parcel + 53;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access000 + 121;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = access000 + 7;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) {
        int i4;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        int iO = getBooleanFromAdObject.onWarmupCompleted.o(i3, IAuthTabCallbackStub);
        boolean z = iO == -1;
        if (z) {
            int i6 = $10 + 15;
            int i7 = i6 % 128;
            $11 = i7;
            int i8 = i6 % 2;
            byte[] bArr = IAuthTabCallbackStubProxy;
            if (bArr != null) {
                int i9 = i7 + 13;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                int i11 = 0;
                while (i11 < length) {
                    int i12 = $10 + 81;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        bArr2[i11] = LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.s(bArr[i11]);
                        i11 <<= 1;
                    } else {
                        bArr2[i11] = LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.s(bArr[i11]);
                        i11++;
                    }
                }
                bArr = bArr2;
            }
            iO = bArr != null ? (byte) (((byte) (IAuthTabCallbackStubProxy[getBooleanFromAdObject.onWarmupCompleted.o(i, onTransact)] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L)))) : (short) (((short) (getInterfaceDescriptor[((int) (onTransact ^ (-4629411779493505016L))) + i] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L))));
        }
        if (iO > 0) {
            int i13 = ((i + iO) - 2) + ((int) (onTransact ^ (-4629411779493505016L)));
            if (z) {
                int i14 = $11 + 15;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i13 + i4;
            ((StringBuilder) QuickActionBottomSheetActivity$IAuthTabCallbackStub.r(trackSelectionParametersExternalSyntheticLambda0, i2, IAuthTabCallbackDefault, sb)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
            byte[] bArr3 = IAuthTabCallbackStubProxy;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i16 = 0; i16 < length2; i16++) {
                    int i17 = $11 + 49;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    bArr4[i16] = (byte) (bArr3[i16] ^ (-4629411779493505016L));
                }
                bArr3 = bArr4;
            }
            boolean z2 = bArr3 != null;
            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
            int i19 = $10 + 63;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iO) {
                if (z2) {
                    int i21 = $11 + 31;
                    $10 = i21 % 128;
                    int i22 = i21 % 2;
                    byte[] bArr5 = IAuthTabCallbackStubProxy;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr5[r10] ^ (-4629411779493505016L))) + s)) ^ b));
                } else {
                    short[] sArr = getInterfaceDescriptor;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r10] ^ (-4629411779493505016L))) + s)) ^ b));
                }
                sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
            }
        }
        objArr[0] = sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x01b2, code lost:
    
        if (kotlinx.coroutines.rx2.RxAwaitKt.onWarmupCompleted(r4, r3) != r8) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallback(java.lang.Object[] r19) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.enableCppPropsIteratorSetter.onExtraCallback(java.lang.Object[]):java.lang.Object");
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback_Parcel + 109;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = access000 + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        accessMapSafely.onNavigationEvent.onNavigationEvent();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 121;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onExtraCallback(@org.jetbrains.annotations.NotNull android.content.Context r17, @org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull java.lang.String r20, boolean r21, @org.jetbrains.annotations.NotNull o.asArray r22, boolean r23, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Unit> r24) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.enableCppPropsIteratorSetter.onExtraCallback(android.content.Context, java.lang.String, java.lang.String, java.lang.String, boolean, o.asArray, boolean, o.access13800):java.lang.Object");
    }

    private final Object IAuthTabCallback(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, String str, asArray asarray, boolean z, access13800<? super String> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onWarmupCompleted(), new IAuthTabCallback(graniteBrownfieldModule_closeView, asarray, z, str, (access13800) null), access13800Var);
        int i2 = IAuthTabCallback_Parcel + 47;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    private final Object onExtraCallback(String str, String str2, String str3, asArray asarray, boolean z, access13800<? super String> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onWarmupCompleted(), new onWarmupCompleted(asarray, str3, str, str2, z, (access13800) null), access13800Var);
        int i2 = access000 + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return objOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x020e A[Catch: Exception -> 0x038c, TRY_LEAVE, TryCatch #2 {Exception -> 0x038c, blocks: (B:12:0x005b, B:29:0x0186, B:35:0x019c, B:46:0x01c1, B:48:0x020e, B:55:0x022c, B:69:0x026f, B:71:0x0296, B:72:0x02a0, B:73:0x038b), top: B:85:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallbackStub(java.lang.Object[] r34) {
        /*
            Method dump skipped, instructions count: 1137
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.enableCppPropsIteratorSetter.IAuthTabCallbackStub(java.lang.Object[]):java.lang.Object");
    }

    public final int IAuthTabCallbackStub() {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub;
        Object obj;
        int i = 2 % 2;
        int i2 = access000 + 7;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr = new Object[1];
            b(new char[]{9561, 9535, 17085, 44761, 37001, 47606, 38201, 57063, 49287, 2499, 18678, 32149, 17695, 3812}, ViewConfiguration.getJumpTapTimeout() - 74, objArr);
            obj = objArr[0];
        } else {
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr2 = new Object[1];
            b(new char[]{9561, 9535, 17085, 44761, 37001, 47606, 38201, 57063, 49287, 2499, 18678, 32149, 17695, 3812}, 1 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr2);
            obj = objArr2[0];
        }
        return textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onWarmupCompleted(((String) obj).intern(), 0);
    }

    public final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 9;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr = new Object[1];
        b(new char[]{9561, 9535, 17085, 44761, 37001, 47606, 38201, 57063, 49287, 2499, 18678, 32149, 17695, 3812}, 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
        textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallbackWithResult(((String) objArr[0]).intern(), i);
        int i5 = IAuthTabCallback_Parcel + 27;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 109;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr = new Object[1];
        b(new char[]{9561, 9535, 17085, 44761, 37001, 47606, 38201, 57063, 49287, 2499, 18678, 32149, 17695, 3812}, TextUtils.getTrimmedLength("") + 1, objArr);
        textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallbackWithResult(((String) objArr[0]).intern(), 0);
        int i4 = IAuthTabCallback_Parcel + 117;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 83;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr = new Object[1];
        a((short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((-3) - ((Process.getThreadPriority(0) + 20) >> 6)), (-692973280) - (ViewConfiguration.getJumpTapTimeout() >> 16), 530870067 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-13075) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
        textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallbackWithResult(((String) objArr[0]).intern(), i);
        int i5 = access000 + 103;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr = new Object[1];
        a((short) View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (TextUtils.indexOf("", "", 0, 0) - 3), (-692973280) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 530870069 + ExpandableListView.getPackedPositionChild(0L), Color.alpha(0) - 13075, objArr);
        textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallbackWithResult(((String) objArr[0]).intern(), 0);
        int i4 = IAuthTabCallback_Parcel + 65;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
    }

    static /* synthetic */ void onExtraCallbackWithResult(String str, String str2, String str3, String str4, long j, String str5, int i, Object obj) {
        String str6;
        int i2 = 2 % 2;
        int i3 = access000 + 95;
        int i4 = i3 % 128;
        IAuthTabCallback_Parcel = i4;
        int i5 = i3 % 2;
        Object obj2 = null;
        if ((i & 32) != 0) {
            int i6 = i4 + 79;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            str6 = null;
        } else {
            str6 = str5;
        }
        onNavigationEvent(str, str2, str3, str4, j, str6);
        int i8 = IAuthTabCallback_Parcel + 55;
        access000 = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(String str, String str2, String str3, String str4, long j, String str5) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(j, false, (String) null, (Map) null, new SecurityUtil$.ExternalSyntheticLambda3(str5, str, str2, str3, str4), 14, (Object) null);
        int i2 = access000 + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(String str, String str2, String str3, String str4, String str5, SetDetectableSize setDetectableSize) {
        String logValue;
        Object obj;
        Map mapOnExtraCallback;
        Object obj2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        if (str != null) {
            int i2 = access000 + 1;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                mapOnExtraCallback = setDetectableSize.onExtraCallback();
                Object[] objArr = new Object[1];
                b(new char[]{48530, 48624, 8017, 62241, 12596, 61575, 3561, 33574, 24843, 16555, 59722, 13564, 56787, 21256, 53524, 4270}, 1 << Color.blue(0), objArr);
                obj2 = objArr[0];
            } else {
                mapOnExtraCallback = setDetectableSize.onExtraCallback();
                Object[] objArr2 = new Object[1];
                b(new char[]{48530, 48624, 8017, 62241, 12596, 61575, 3561, 33574, 24843, 16555, 59722, 13564, 56787, 21256, 53524, 4270}, 1 - Color.blue(0), objArr2);
                obj2 = objArr2[0];
            }
            mapOnExtraCallback.put(((String) obj2).intern(), str);
        }
        Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
        Object[] objArr3 = new Object[1];
        b(new char[]{14216, 14332, 520, 61028, 37095, 58457, 34809, 18585, 8250}, 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr3);
        mapOnExtraCallback2.put(((String) objArr3[0]).intern(), str2);
        Map mapOnExtraCallback3 = setDetectableSize.onExtraCallback();
        Object[] objArr4 = new Object[1];
        b(new char[]{20668, 20696, 15235, 55267, 45576, 30493, 57562, 42995, 57887, 50982, 27249, 45937, 12541, 30657, 21037}, ((Process.getThreadPriority(0) + 20) >> 6) + 1, objArr4);
        mapOnExtraCallback3.put(((String) objArr4[0]).intern(), str3);
        Map mapOnExtraCallback4 = setDetectableSize.onExtraCallback();
        createPaints createpaints = createPaints.IAuthTabCallback;
        IndicatorView indicatorViewAccess100 = createpaints.access100();
        String loginYN = indicatorViewAccess100 != null ? indicatorViewAccess100.getLoginYN() : null;
        Object[] objArr5 = new Object[1];
        a((short) TextUtils.indexOf("", "", 0), (byte) (MotionEvent.axisFromString("") + 106), (-692973318) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 530870078, ImageFormat.getBitsPerPixel(0) - 13074, objArr5);
        mapOnExtraCallback4.put(((String) objArr5[0]).intern(), loginYN);
        Map mapOnExtraCallback5 = setDetectableSize.onExtraCallback();
        IndicatorView indicatorViewAccess1002 = createpaints.access100();
        if (indicatorViewAccess1002 != null) {
            int i3 = access000 + 55;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            logValue = indicatorViewAccess1002.getLogValue();
        } else {
            logValue = null;
        }
        Object[] objArr6 = new Object[1];
        a((short) Color.alpha(0), (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13), (-692973310) - (ViewConfiguration.getPressedStateDuration() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 530870076, (-13075) - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr6);
        mapOnExtraCallback5.put(((String) objArr6[0]).intern(), logValue);
        Map mapOnExtraCallback6 = setDetectableSize.onExtraCallback();
        if (setTestMode.IAuthTabCallbackDefault()) {
            Object[] objArr7 = new Object[1];
            b(new char[]{48963, 48922, 59723, 41766, 44926}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr7);
            obj = objArr7[0];
        } else {
            Object[] objArr8 = new Object[1];
            a((short) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (byte) (59 - Color.alpha(0)), (-692973298) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 530870049 + TextUtils.lastIndexOf("", '0', 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 13076, objArr8);
            obj = objArr8[0];
        }
        String strIntern = ((String) obj).intern();
        Object[] objArr9 = new Object[1];
        a((short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 3), (-692973297) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 530870024 - TextUtils.indexOf("", "", 0), (-13075) - Color.blue(0), objArr9);
        mapOnExtraCallback6.put(((String) objArr9[0]).intern(), strIntern);
        if (str4 != null) {
            Map mapOnExtraCallback7 = setDetectableSize.onExtraCallback();
            Object[] objArr10 = new Object[1];
            a((short) (ViewConfiguration.getTouchSlop() >> 8), (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 96), (ViewConfiguration.getTapTimeout() >> 16) - 692973291, 530870068 - (ViewConfiguration.getTouchSlop() >> 8), (-13074) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr10);
            mapOnExtraCallback7.put(((String) objArr10[0]).intern(), str4);
        }
        if (str5 != null) {
            int i5 = IAuthTabCallback_Parcel + 35;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            Map mapOnExtraCallback8 = setDetectableSize.onExtraCallback();
            Object[] objArr11 = new Object[1];
            b(new char[]{23286, 23188, 47280, 21724, 47011, 42544, 60035, 9436, 59308, 5675, 28614, 25184, 14977, 62718, 22428, 17970, 19113, 17562, 34783, 46674, 39624}, 1 - Color.alpha(0), objArr11);
            mapOnExtraCallback8.put(((String) objArr11[0]).intern(), str5);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Context context = (Context) objArr[1];
        dangerouslyReset dangerouslyreset = (dangerouslyReset) objArr[2];
        String str = (String) objArr[3];
        String str2 = (String) objArr[4];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dangerouslyreset, "");
        String string = context.getString(R.string.password_format_wrong_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = context.getString(R.string.password_format_wrong_message);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = context.getString(R.string.password_format_wrong_positive);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        onExtraCallbackWithResult(string, string2, str, str2, 1222831L, null, 32, null);
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new SecurityUtil$.ExternalSyntheticLambda0(string, string2, string3, dangerouslyreset, str, str2));
        int i2 = access000 + 49;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(String str, dangerouslyReset dangerouslyreset, String str2, String str3, String str4, String str5, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            onNavigationEvent(str2, str3, str4, str5, 1222833L, str);
            dangerouslyreset.onExtraCallback(dialogInterface);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        onNavigationEvent(str2, str3, str4, str5, 1222833L, str);
        dangerouslyreset.onExtraCallback(dialogInterface);
        int i3 = 48 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(dangerouslyReset dangerouslyreset, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        dangerouslyreset.onNavigationEvent(dialogInterface);
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 27;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(String str, String str2, String str3, dangerouslyReset dangerouslyreset, String str4, String str5, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(str);
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str2);
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, str3, (TdsButtonV1View.asInterface) null, false, new SecurityUtil$.ExternalSyntheticLambda1(str3, dangerouslyreset, str, str2, str4, str5), 6, (Object) null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.asBinder(new SecurityUtil$.ExternalSyntheticLambda2(dangerouslyreset));
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 5;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        r8 = o.enableCppPropsIteratorSetter.access000 + 75;
        o.enableCppPropsIteratorSetter.IAuthTabCallback_Parcel = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
    
        if (r1.onWarmupCompleted(((java.lang.String) r6[0]).intern(), 0) == (r8 + 1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0059, code lost:
    
        if (r1.onWarmupCompleted(((java.lang.String) r6[0]).intern(), 0) == (r8 - 1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean IAuthTabCallback(int r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.enableCppPropsIteratorSetter.access000
            int r1 = r1 + 11
            int r2 = r1 % 128
            o.enableCppPropsIteratorSetter.IAuthTabCallback_Parcel = r2
            int r1 = r1 % r0
            r2 = 14
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L36
            o.TextRoundCornerProgressBarSavedState1 r1 = o.addPolicy.ITrustedWebActivityServiceStub()
            char[] r2 = new char[r2]
            r2 = {x0066: FILL_ARRAY_DATA , data: [9561, 9535, 17085, -20775, -28535, -17930, -27335, -8473, -16249, 2499, 18678, 32149, 17695, 3812} // fill-array
            int r5 = android.os.Process.myPid()
            int r5 = r5 / 21
            java.lang.Object[] r6 = new java.lang.Object[r4]
            b(r2, r5, r6)
            r2 = r6[r3]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            int r1 = r1.onWarmupCompleted(r2, r3)
            int r8 = r8 + r4
            if (r1 != r8) goto L5c
            goto L5b
        L36:
            o.TextRoundCornerProgressBarSavedState1 r1 = o.addPolicy.ITrustedWebActivityServiceStub()
            char[] r2 = new char[r2]
            r2 = {x0078: FILL_ARRAY_DATA , data: [9561, 9535, 17085, -20775, -28535, -17930, -27335, -8473, -16249, 2499, 18678, 32149, 17695, 3812} // fill-array
            int r5 = android.os.Process.myPid()
            int r5 = r5 >> 22
            int r5 = 1 - r5
            java.lang.Object[] r6 = new java.lang.Object[r4]
            b(r2, r5, r6)
            r2 = r6[r3]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            int r1 = r1.onWarmupCompleted(r2, r3)
            int r8 = r8 - r4
            if (r1 != r8) goto L5c
        L5b:
            return r4
        L5c:
            int r8 = o.enableCppPropsIteratorSetter.access000
            int r8 = r8 + 75
            int r1 = r8 % 128
            o.enableCppPropsIteratorSetter.IAuthTabCallback_Parcel = r1
            int r8 = r8 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.enableCppPropsIteratorSetter.IAuthTabCallback(int):boolean");
    }

    public final String onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = access000 + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strIAuthTabCallback = setup.IAuthTabCallback(DetectClosedEyes.onWarmupCompleted.IAuthTabCallback(), str, 0, 2, (Object) null);
        int i4 = IAuthTabCallback_Parcel + 43;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return strIAuthTabCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        return o.setup.onNavigationEvent(o.DetectClosedEyes.onWarmupCompleted.onNavigationEvent(), r6, 0, 2, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r6 = o.enableCppPropsIteratorSetter.access000 + 113;
        o.enableCppPropsIteratorSetter.IAuthTabCallback_Parcel = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if ((r6 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        r6 = 8 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (o.GraniteModule_onEventListenerRemoved.IAuthTabCallback(r6) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if ((!o.GraniteModule_onEventListenerRemoved.IAuthTabCallback(r6)) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String onNavigationEvent(@org.jetbrains.annotations.NotNull java.lang.String r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.enableCppPropsIteratorSetter.IAuthTabCallback_Parcel
            int r1 = r1 + 125
            int r2 = r1 % 128
            o.enableCppPropsIteratorSetter.access000 = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            if (r1 == 0) goto L1d
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            boolean r1 = o.GraniteModule_onEventListenerRemoved.IAuthTabCallback(r6)
            r4 = 1
            int r4 = r4 / r2
            if (r1 == 0) goto L28
            goto L34
        L1d:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            boolean r1 = o.GraniteModule_onEventListenerRemoved.IAuthTabCallback(r6)
            r1 = r1 ^ 1
            if (r1 == 0) goto L34
        L28:
            o.DetectClosedEyes r1 = o.DetectClosedEyes.onWarmupCompleted
            o.BaseRoundCornerProgressBarOnProgressChangedListener r1 = r1.onNavigationEvent()
            r3 = 0
            java.lang.String r6 = o.setup.onNavigationEvent(r1, r6, r2, r0, r3)
            return r6
        L34:
            int r6 = o.enableCppPropsIteratorSetter.access000
            int r6 = r6 + 113
            int r1 = r6 % 128
            o.enableCppPropsIteratorSetter.IAuthTabCallback_Parcel = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L42
            r6 = 8
            int r6 = r6 / r2
        L42:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.enableCppPropsIteratorSetter.onNavigationEvent(java.lang.String):java.lang.String");
    }

    public final String onNavigationEvent(@NotNull String str, @NotNull String str2) {
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = access000 + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                strOnExtraCallbackWithResult = EstimateFaceQualityFromBGRImage.IAuthTabCallback.onExtraCallbackWithResult(PageKey.onWarmupCompleted(str, (Charset) null, 0, (Object) null), str2);
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                strOnExtraCallbackWithResult = EstimateFaceQualityFromBGRImage.IAuthTabCallback.onExtraCallbackWithResult(PageKey.onWarmupCompleted(str, (Charset) null, 1, (Object) null), str2);
            }
            int i3 = IAuthTabCallback_Parcel + 109;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            return strOnExtraCallbackWithResult;
        } catch (Exception e) {
            auth.IAuthTabCallback(-1588674344, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{auth.onNavigationEvent, e, null, 2, null}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1588674346, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
            return null;
        }
    }

    public final void onWarmupCompleted() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        b(new char[]{65388, 65325, 58148, 3940, 4043, 55186, 17231}, KeyEvent.keyCodeFromString("") + 1, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (byte) ((-82) - Process.getGidForName("")), KeyEvent.getDeadChar(0, 0) - 692973261, 530870034 - TextUtils.lastIndexOf("", '0'), (Process.myPid() >> 22) - 13075, objArr2);
        KeyGenerator keyGenerator = KeyGenerator.getInstance(strIntern, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        b(new char[]{36229, 36339, 51104, 11212, 41950, 59537, 15822, 23506, 62425, 22693, 31650, 11519}, 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(((String) objArr3[0]).intern(), 3);
        Object[] objArr4 = new Object[1];
        b(new char[]{532, 599, 35553, 26278, 9608, 64961, 35530}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4);
        KeyGenParameterSpec.Builder blockModes = builder.setBlockModes(((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        b(new char[]{27687, 27767, 50103, 12281, 20848, 44636, 56324, 24574, 326, 7751, 35129, 27136, 3179, 36851, 45413, 20048}, AndroidCharacter.getMirror('0') - '/', objArr5);
        keyGenerator.init(blockModes.setEncryptionPaddings(((String) objArr5[0]).intern()).setRandomizedEncryptionRequired(true).setKeySize(256).build());
        keyGenerator.generateKey();
        int i2 = IAuthTabCallback_Parcel + 15;
        access000 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallbackWithResult(Activity activity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        Intent intent = new Intent(activity, (Class<?>) SuspendingClearWebView.class);
        Object[] objArr = new Object[1];
        b(new char[]{12278, 12164, 64347, 5947, 41566, 44756, 40835, 26416, 62029, 31271, 27311}, (ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr);
        intent.putExtra(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a((short) TextUtils.getOffsetBefore("", 0), (byte) (28 - (ViewConfiguration.getScrollBarSize() >> 8)), (-692973323) - (KeyEvent.getMaxKeyCode() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 530870068, (Process.myPid() >> 22) - 13075, objArr2);
        intent.putExtra(((String) objArr2[0]).intern(), true);
        activity.startActivity(intent);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 95;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 95;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        UST_CMP_IssueCertificate.onExtraCallback onextracallback = UST_CMP_IssueCertificate.onExtraCallback.MEMBER_STATE;
        Object[] objArr = new Object[1];
        b(new char[]{10307, 10254, 32283, 37467, 13805, 63224, 38930, 57936, 26091, 18135, 60842, 12981, 18471, 12915, 54730, 5846, 14368, 33302, 1443, 59065, 59482, 53760, 30127, 46766, 22626, 8740, 42381, 1669, 2174, 29241, 5483, 54906, 63630, 49860, 17787, 42603, 43175}, 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        UST_CMP_IssueCertificate.IAuthTabCallback(-596488443, new Object[]{false, onextracallback, ((String) objArr[0]).intern(), null, 5, 9, null}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 596488447);
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 3;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(Activity activity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        Object[] objArr = new Object[1];
        a((short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (byte) (TextUtils.indexOf("", "") + 53), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 692973338, 530915765 - TextUtils.lastIndexOf("", '0', 0), (-13075) - (Process.myTid() >> 22), objArr);
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(((String) objArr[0]).intern());
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled.onWarmupCompleted().getString(R.string.app_security_alert_account_logged_in_elsewhere, PlayerErrorCode.onPostMessage()));
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string = commonModule_setLeftEdgeTouchEnabled.onWarmupCompleted().getString(R.string.app_security_alert_lock_account);
        Intrinsics.checkNotNullExpressionValue(string, "");
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, new Object[]{commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new SecurityUtil$.ExternalSyntheticLambda9(activity), 6, (Object) null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string2 = commonModule_setLeftEdgeTouchEnabled.onWarmupCompleted().getString(R.string.app_security_alert_later);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string2, (TdsButtonV1View.asInterface) null, false, new SecurityUtil$.ExternalSyntheticLambda10(), 6, (Object) null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@Nullable Activity activity) {
        NotificationManager notificationManager;
        int i = 2 % 2;
        if (activity == null) {
            return;
        }
        Object[] objArr = new Object[1];
        b(new char[]{22299, 22389, 31923, 37081, 6426, 53688, 59241, 57539, 18713, 24988, 49508, 5598, 14151, 12535, 63801, 12679}, ExpandableListView.getPackedPositionGroup(0L) + 1, objArr);
        Object systemService = activity.getSystemService(((String) objArr[0]).intern());
        if (systemService instanceof NotificationManager) {
            int i2 = access000 + 19;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            notificationManager = (NotificationManager) systemService;
        } else {
            int i4 = IAuthTabCallback_Parcel + 91;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 5;
            }
            notificationManager = null;
        }
        if (notificationManager != null) {
            notificationManager.cancelAll();
        }
        IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(CommonModule_setScreenAwakeMode.IAuthTabCallback(activity, new SecurityUtil$.ExternalSyntheticLambda4(activity)), (String) null, 1, (Object) null);
    }

    public final boolean IAuthTabCallback(@Nullable String str) {
        int length;
        int i = 2 % 2;
        if (str != null) {
            Object[] objArr = new Object[1];
            a((short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (byte) (TextUtils.indexOf((CharSequence) "", '0') - 119), (-692973246) + (ViewConfiguration.getDoubleTapTimeout() >> 16), 530870018 + (ViewConfiguration.getScrollBarSize() >> 8), (-13075) - View.resolveSize(0, 0), objArr);
            if (StringsKt.startsWith$default(str, ((String) objArr[0]).intern(), false, 2, (Object) null) && 10 <= (length = str.length())) {
                int i2 = IAuthTabCallback_Parcel + 81;
                access000 = i2 % 128;
                int i3 = i2 % 2;
                if (length < 12) {
                    return true;
                }
            }
        }
        int i4 = IAuthTabCallback_Parcel + 83;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return false;
    }

    public final void onExtraCallbackWithResult(@NotNull String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                drawBackgroundProgress.onExtraCallbackWithResult(addPolicy.ITrustedWebActivityServiceStub(), str, true);
            } catch (Exception e) {
                auth.IAuthTabCallback(-1588674344, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{auth.onNavigationEvent, e, null, 2, null}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1588674346, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
            }
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        enableCppPropsIteratorSetter enablecpppropsiteratorsetter = (enableCppPropsIteratorSetter) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int iIntValue3 = ((Number) objArr[5]).intValue();
        Object obj = objArr[6];
        int i = 2 % 2;
        if ((iIntValue3 & 4) != 0) {
            int i2 = access000 + 5;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            iIntValue = 32;
        }
        if ((iIntValue3 & 8) != 0) {
            int i4 = access000 + 13;
            IAuthTabCallback_Parcel = i4 % 128;
            iIntValue2 = 100000;
            if (i4 % 2 == 0) {
                int i5 = 28 / 0;
            }
        }
        return enablecpppropsiteratorsetter.onWarmupCompleted(str, str2, iIntValue, iIntValue2);
    }

    public static /* synthetic */ byte[] onExtraCallbackWithResult(enableCppPropsIteratorSetter enablecpppropsiteratorsetter, byte[] bArr, byte[] bArr2, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = access000;
        int i6 = i5 + 109;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 != 0 ? (i3 & 4) != 0 : (i3 & 2) != 0) {
            int i7 = i5 + 31;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            i = 32;
        }
        if ((i3 & 8) != 0) {
            i2 = 100000;
        }
        return enablecpppropsiteratorsetter.onNavigationEvent(bArr, bArr2, i, i2);
    }

    public final byte[] onNavigationEvent(@NotNull byte[] bArr, @NotNull byte[] bArr2, int i, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        byte[] bArr3 = new byte[i];
        new PBKDF2().pbkdf2(bArr, bArr.length, bArr2, bArr2.length, i2, bArr3, i);
        int i4 = access000 + 51;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return bArr3;
    }

    public static /* synthetic */ Unit onExtraCallback(Throwable th) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onExtraCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 1559957671, iOnWarmupCompleted2, -1559957665, iOnWarmupCompleted, new Object[]{th}, iOnWarmupCompleted3);
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onExtraCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -965076188, iOnWarmupCompleted2, 965076190, iOnWarmupCompleted, new Object[]{th}, iOnWarmupCompleted3);
    }

    public static /* synthetic */ Unit onNavigationEvent(Activity activity, DialogInterface dialogInterface) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onExtraCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 341902807, iOnWarmupCompleted2, -341902796, iOnWarmupCompleted, new Object[]{activity, dialogInterface}, iOnWarmupCompleted3);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DialogInterface dialogInterface) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onExtraCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 1324335663, iOnWarmupCompleted2, -1324335659, iOnWarmupCompleted, new Object[]{dialogInterface}, iOnWarmupCompleted3);
    }

    public static /* synthetic */ String onExtraCallbackWithResult(enableCppPropsIteratorSetter enablecpppropsiteratorsetter, String str, asArray asarray, int i, Object obj) {
        Object[] objArr = {enablecpppropsiteratorsetter, str, asarray, Integer.valueOf(i), obj};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onExtraCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 316794933, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -316794926, iOnWarmupCompleted, objArr, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ byte[] IAuthTabCallback(enableCppPropsIteratorSetter enablecpppropsiteratorsetter, String str, String str2, int i, int i2, int i3, Object obj) {
        Object[] objArr = {enablecpppropsiteratorsetter, str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), obj};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (byte[]) onExtraCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -85552754, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 85552754, iOnWarmupCompleted, objArr, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public final Object IAuthTabCallback(@NotNull GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, @NotNull asArray asarray, boolean z, @NotNull access13800<? super String> access13800Var) {
        Object[] objArr = {this, graniteBrownfieldModule_closeView, asarray, Boolean.valueOf(z), access13800Var};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return onExtraCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -355408972, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 355408975, iOnWarmupCompleted, objArr, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public final int asInterface() {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return ((Integer) onExtraCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -1076427024, iOnWarmupCompleted2, 1076427033, iOnWarmupCompleted, new Object[]{this}, iOnWarmupCompleted3)).intValue();
    }

    public final byte[] onWarmupCompleted(@NotNull String str, @NotNull String str2, int i, int i2) {
        Object[] objArr = {this, str, str2, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (byte[]) onExtraCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -1544129675, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 1544129680, iOnWarmupCompleted, objArr, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public final void onExtraCallbackWithResult(@NotNull Context context, @NotNull dangerouslyReset dangerouslyreset, @Nullable String str, @Nullable String str2) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        onExtraCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 872067442, iOnWarmupCompleted2, -872067432, iOnWarmupCompleted, new Object[]{this, context, dangerouslyreset, str, str2}, iOnWarmupCompleted3);
    }

    public final Object onExtraCallback(@NotNull Context context, @NotNull GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, @NotNull String str, boolean z, @NotNull asArray asarray, boolean z2, @NotNull access13800<? super Unit> access13800Var) {
        Object[] objArr = {this, context, graniteBrownfieldModule_closeView, str, Boolean.valueOf(z), asarray, Boolean.valueOf(z2), access13800Var};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return onExtraCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -1295009726, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 1295009727, iOnWarmupCompleted, objArr, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public final Object onWarmupCompleted(@NotNull GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, @NotNull onExtraCallbackWithResult onextracallbackwithresult, @NotNull access13800<? super Unit> access13800Var) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return onExtraCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 95384226, iOnWarmupCompleted2, -95384218, iOnWarmupCompleted, new Object[]{this, graniteBrownfieldModule_closeView, onextracallbackwithresult, access13800Var}, iOnWarmupCompleted3);
    }

    static void asBinder() {
        onTransact = -1928710322;
        IAuthTabCallbackStub = -1538790630;
        IAuthTabCallbackDefault = 1142704422;
        getInterfaceDescriptor = new short[]{5362, -10221, 10213, -10225, 10188, -10219, -10213, 10215, 10221, -10238, 10222, -10238, 5360, 10117, 10123, -10121, -10144, 10114, -10118, 10140, -10138, 10131, 5388, 10138, 10137, -10116, -10138, 10143, 10143, -10144, -10132, -10140, 10142, 10140, -10130, -10129, -10130, 10130, 10141, -10128, 10123, 10131, -10143, 10128, 5365, -10019, 10193, -13939, 13469, -15939, 11681, 24577, -6343, 9073, -12387, -10179, 30253, -24939, -8535, 5371, -10212, 10208, -10217, -10210, 5374, 10132, -10117, 10128, -10140, -10141, 10137, -10142, 5361, 10227, 10225, -10237, -10221, 10222, -10226, -10235, -10240, 10238, -10237, 5351, 5373, -10240, 10223, -10236, 10224, -10228, 10191, 5361, 10141, -10126, 10143, 10140, 10135, -10116, -10134, 10136, -10130, -10129, 5385, 10227, -10228, 10227, 10201, -10182, 10237, -10238, 10209, 10222, -10218, -10225, -10238, -10229, 10234, -10227, -10229, 10227, 10226, 5365, -10156, 10148, -10148, 10118, -10115, 10163, 10173, -10176, -10148, -10147, -10150, 10153, -10159, 10122, 5368, 10113, 5377, 10192, 10192, 10192, 10192, -10236, 10180, -10198, 10235, -10229, -10207, 10179, -10181, 10205, -10201, 10194, 10208, -10238, 10197, 10194, 10194, 10195, 10181, 10192, 10192, 10192, 10192, 5362, 10201, 10238, -10197, -10203, 10201, 10190, -10196, 10196, -10190, 10184, -10179};
        access100 = -9015433296112543991L;
    }
}
