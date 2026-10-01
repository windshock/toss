package o;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$asInterface;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$onExtraCallback;
import im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity$4;
import im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity$5;
import im.toss.global.features.leave.test.Hilt_GlobalLeaveTestActivity$4;
import im.toss.security.guard.AppLifecycleEventObserver;
import im.toss.security.guard.AppLifecycleEventObserver$onExtraCallbackWithResult;
import im.toss.security.guard.GuardPostTaskWork;
import im.toss.security.guard.R;
import im.toss.security.guard.TossApplicationGuard$;
import im.toss.security.guard.TossApplicationGuard$notifyBuildExpiryWarningIfNeeded$1$;
import im.toss.security.guard.TossApplicationGuard$start$1$1$1$;
import im.toss.state.spec.SessionState;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import java.lang.reflect.Method;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.reactive.ReactiveFlowKt;
import kotlinx.coroutines.rx2.RxConvertKt;
import o.EngineConfig1;
import o.PKCS58;
import o.Tooltip_androidKtExternalSyntheticLambda0;
import o.UST_CMP_IssueCertificate;
import o.bindContext;
import o.s3c;
import o.s5a;
import o.s8ExternalSyntheticLambda0;
import o.s8ExternalSyntheticLambda2;
import o.s8ExternalSyntheticLambda3;
import o.setLogBuffers;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.core.AppStateManager;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: classes.dex */
public final class s3 extends createFromParcel {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String IAuthTabCallback;
    private static final String IAuthTabCallbackDefault;
    private static final getCornerRadius<Boolean> IAuthTabCallbackStub;
    private static final newArray IAuthTabCallbackStubProxy;
    private static char IAuthTabCallback_Parcel = 0;
    private static char ICustomTabsCallback = 0;
    private static final EnumSet<s8ExternalSyntheticLambda1> access000;
    private static final Lazy access100;
    private static final String asBinder;
    private static final String asInterface;
    private static char[] extraCallback = null;
    private static char extraCallbackWithResult = 0;
    private static final Lazy getInterfaceDescriptor;
    private static int onActivityResized = 0;
    private static final String onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static int onMinimized = 1;
    public static final s3 onNavigationEvent;
    private static int onPostMessage = 1;
    private static final Lazy onTransact;
    private static final String onWarmupCompleted;
    private static char readTypedObject;
    private static int writeTypedObject;

    public static final /* synthetic */ class onNavigationEvent {
        static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onNavigationEvent.class);
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[IconRoundCornerProgressBarSavedState1.values().length];
            try {
                int iOrdinal = IconRoundCornerProgressBarSavedState1.DEBUGGER.ordinal();
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3328);
                iArr[iOrdinal] = 1;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1823);
                int i = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconRoundCornerProgressBarSavedState1.EMULATOR.ordinal()] = 2;
                int i2 = IAuthTabCallback;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4780);
                if (((((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 6) & 1) != 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconRoundCornerProgressBarSavedState1.ROOT.ordinal()] = 3;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2727);
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IconRoundCornerProgressBarSavedState1.HOOK.ordinal()] = 4;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4403);
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IconRoundCornerProgressBarSavedState1.TAMPER_CERT.ordinal()] = 5;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5625);
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IconRoundCornerProgressBarSavedState1.VIRTUAL_ENVIRONMENT.ordinal()] = 6;
                int i7 = IAuthTabCallback;
                int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5489);
                if (((((i7 | iOnWarmupCompleted2) & (~(i7 & iOnWarmupCompleted2))) >> 21) & 1) != 0) {
                    int i8 = 2 % 2;
                }
            } catch (NoSuchFieldError unused6) {
            }
            onExtraCallbackWithResult = iArr;
            int i9 = IAuthTabCallback;
            int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1235);
            if (((((i9 | iOnWarmupCompleted3) & (~(i9 & iOnWarmupCompleted3))) >> 14) & 1) == 0) {
                throw null;
            }
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, trackEventSynchronously trackeventsynchronously) {
        int i = 2 % 2;
        int i2 = onPostMessage + 79;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(str, str2, trackeventsynchronously);
        }
        onExtraCallbackWithResult(str, str2, trackeventsynchronously);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(Context context, RoundCornerProgressBar roundCornerProgressBar, String str) {
        int i = 2 % 2;
        int i2 = onPostMessage + 107;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onTransact(context, roundCornerProgressBar, str);
        int i4 = onPostMessage + 101;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 85;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = writeTypedObject + 67;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onPostMessage + 53;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return asBinder(dialogInterface);
        }
        asBinder(dialogInterface);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onPostMessage + 1;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsCallback();
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ICustomTabsCallback = ICustomTabsCallback();
        int i3 = writeTypedObject + 103;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1ICustomTabsCallback;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[2];
        int i = 2 % 2;
        int i2 = onPostMessage + 5;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(str, str2, commonModule_setLeftEdgeTouchEnabled);
        }
        onNavigationEvent(str, str2, commonModule_setLeftEdgeTouchEnabled);
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Context context = (Context) objArr[0];
        trackEventSynchronously trackeventsynchronously = (trackEventSynchronously) objArr[1];
        int i = 2 % 2;
        int i2 = onPostMessage + 53;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(context, trackeventsynchronously);
        int i4 = onPostMessage + 1;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        trackEventSynchronously trackeventsynchronously = (trackEventSynchronously) objArr[2];
        int i = 2 % 2;
        int i2 = writeTypedObject + 67;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, str2, trackeventsynchronously);
        int i4 = onPostMessage + 9;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(dialogInterface);
        int i4 = writeTypedObject + 87;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        DialogInterface dialogInterface = (DialogInterface) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 75;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(dialogInterface);
        int i4 = writeTypedObject + 107;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Context context, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(context, commonModule_setLeftEdgeTouchEnabled);
        int i4 = writeTypedObject + 119;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Context context, trackEventSynchronously trackeventsynchronously) {
        int i = 2 % 2;
        int i2 = onPostMessage + 1;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(context, trackeventsynchronously);
        int i4 = writeTypedObject + 35;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onPostMessage + 27;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onTransact(dialogInterface);
            throw null;
        }
        Unit unitOnTransact = onTransact(dialogInterface);
        int i3 = writeTypedObject + 65;
        onPostMessage = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnTransact;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ s8ExternalSyntheticLambda3 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 105;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        s8ExternalSyntheticLambda3 s8externalsyntheticlambda3ExtraCallback = extraCallback();
        int i4 = writeTypedObject + 25;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return s8externalsyntheticlambda3ExtraCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        int i2 = onPostMessage + 21;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        asBinder(context);
        int i4 = writeTypedObject + 109;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = ~((~i4) | i8);
        int i10 = i4 | i8;
        int i11 = i2 + i5 + i + ((-189913888) * i3) + ((-1809372279) * i6);
        int i12 = i11 * i11;
        int i13 = (((-554582804) * i2) - 1671495680) + (10634006 * i5) + (i7 * 282608405) + (282608405 * i9) + ((-282608405) * i10) + ((-271974400) * i) + (952107008 * i3) + (1092222976 * i6) + ((-70844416) * i12);
        int i14 = (i2 * 986545540) + 223666697 + (i5 * 986543778) + (i7 * (-881)) + (i9 * (-881)) + (i10 * 881) + (i * 986544659) + (i3 * 1843362976) + (i6 * (-1872984789)) + (i12 * (-2050686976));
        switch (i13 + (i14 * i14 * 1179713536)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                String str = (String) objArr[0];
                String str2 = (String) objArr[1];
                CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[2];
                int i15 = 2 % 2;
                int i16 = writeTypedObject + 11;
                onPostMessage = i16 % 128;
                int i17 = i16 % 2;
                Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(str, str2, commonModule_setLeftEdgeTouchEnabled);
                int i18 = onPostMessage + 29;
                writeTypedObject = i18 % 128;
                int i19 = i18 % 2;
                return unitIAuthTabCallbackStub;
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                return asBinder(objArr);
            case 10:
                String str3 = (String) objArr[0];
                String str4 = (String) objArr[1];
                CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled2 = (CommonModule_setLeftEdgeTouchEnabled) objArr[2];
                int i20 = 2 % 2;
                int i21 = onPostMessage + 69;
                writeTypedObject = i21 % 128;
                int i22 = i21 % 2;
                Unit unitOnWarmupCompleted = onWarmupCompleted(str3, str4, commonModule_setLeftEdgeTouchEnabled2);
                int i23 = writeTypedObject + 67;
                onPostMessage = i23 % 128;
                int i24 = i23 % 2;
                return unitOnWarmupCompleted;
            case 11:
                return asInterface(objArr);
            case 12:
                return IAuthTabCallback_Parcel(objArr);
            case 13:
                return access100(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 13;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        extraCallbackWithResult();
        int i4 = onPostMessage + 109;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Context context, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 75;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(context, commonModule_setLeftEdgeTouchEnabled);
        int i4 = writeTypedObject + 15;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Context context, trackEventSynchronously trackeventsynchronously) {
        int i = 2 % 2;
        int i2 = onPostMessage + 95;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(context, trackeventsynchronously);
        int i4 = writeTypedObject + 13;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStubProxy(dialogInterface);
        }
        IAuthTabCallbackStubProxy(dialogInterface);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(Context context, RoundCornerProgressBar roundCornerProgressBar, String str) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 49;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(context, roundCornerProgressBar, str);
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        int i5 = writeTypedObject + 9;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onPostMessage + 37;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        s8ExternalSyntheticLambda0 s8externalsyntheticlambda0Access000 = access000();
        int i4 = onPostMessage + 93;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return s8externalsyntheticlambda0Access000;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Context context, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = onPostMessage + 103;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(context, commonModule_setLeftEdgeTouchEnabled);
        int i4 = onPostMessage + 71;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onWarmupCompleted(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onPostMessage + 85;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(dialogInterface);
        int i4 = onPostMessage + 55;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ s8ExternalSyntheticLambda2 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onPostMessage + 77;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        s8ExternalSyntheticLambda2 s8externalsyntheticlambda2WriteTypedObject = writeTypedObject();
        int i4 = writeTypedObject + 1;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return s8externalsyntheticlambda2WriteTypedObject;
    }

    public static final class onExtraCallbackWithResult implements IAnimation<Boolean> {
        private static final byte[] $$a;
        final /* synthetic */ IAnimation onWarmupCompleted;
        static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onExtraCallbackWithResult.class);
        private static final int $$b = 196;

        private static String $$c(short s, byte b, byte b2) {
            byte[] bArr = $$a;
            int i = b * 2;
            int i2 = (b2 * 2) + 102;
            int i3 = s + 4;
            byte[] bArr2 = new byte[11 - i];
            int i4 = 10 - i;
            int i5 = -1;
            if (bArr == null) {
                i2 = i2 + i4 + 2;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i2;
                if (i5 == i4) {
                    return new String(bArr2, 0);
                }
                i3++;
                i2 = i2 + bArr[i3] + 2;
            }
        }

        static {
            byte[] bArr = {51, -39, 98, -44, 1, 3, -12, -26, 27, -9, 14, -19, 15, 5};
            $$a = bArr;
            ClassLoader parent = onExtraCallbackWithResult.class.getClassLoader().getParent();
            try {
                byte b = (byte) (-bArr[4]);
                byte b2 = (byte) (b + 1);
                Method declaredMethod = ClassLoader.class.getDeclaredMethod($$c(b, b2, b2), String.class);
                declaredMethod.setAccessible(true);
                System.load((String) declaredMethod.invoke(parent, "ea56"));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        public static native int I(Object obj, Object obj2, int i, int i2, Object obj3, Object obj4, int i3, int i4, Object obj5, int i5, Object obj6);

        /* renamed from: o.s3$onExtraCallbackWithResult$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements setRipple {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            final /* synthetic */ setRipple onExtraCallback;
            private static char[] IAuthTabCallback = {60855, 12433, 22512, 31444, 39268, 48148, 50019, 58888, 1235, 11234, 20185, 27947, 45073, 55149, 64073, 6383, 16308, 17106, 24889, 33822, 43883, 52818, 60585, 13256, 22163, 30009, 38930, 49006, 49739, 57515, 1929, 10927, 18804, 27655, 45941, 54860, 62636, 7104, 16111, 24007, 24582, 34687, 43593, 51372, 61325, 13038, 20937};
            private static long onWarmupCompleted = 7817543124772204784L;

            /* renamed from: o.s3$onExtraCallbackWithResult$5$3, reason: invalid class name */
            public static final class AnonymousClass3 extends ContinuationImpl {
                static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AnonymousClass3.class);
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass3(access13800 access13800Var) {
                    super(access13800Var);
                }

                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback;
                    int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(18);
                    int i3 = (~iOnWarmupCompleted) & i2;
                    int i4 = (~i2) & iOnWarmupCompleted;
                    int i5 = (((i4 & i3) | (i3 ^ i4)) >> 8) & 1;
                    this.result = obj;
                    if (i5 == 0) {
                        throw null;
                    }
                    int i6 = this.label;
                    this.label = (i6 & Integer.MIN_VALUE) | (Integer.MAX_VALUE & i6) | ((~i6) & Integer.MIN_VALUE);
                    Object objEmit = AnonymousClass5.this.emit(null, this);
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(338);
                    return objEmit;
                }
            }

            public AnonymousClass5(setRipple setripple) {
                this.onExtraCallback = setripple;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, o.access13800 r8) {
                /*
                    r6 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    boolean r1 = r8 instanceof o.s3.onExtraCallbackWithResult.AnonymousClass5.AnonymousClass3
                    if (r1 == 0) goto L34
                    int r1 = o.s3.onExtraCallbackWithResult.AnonymousClass5.onNavigationEvent
                    int r1 = r1 + 61
                    int r2 = r1 % 128
                    o.s3.onExtraCallbackWithResult.AnonymousClass5.onExtraCallbackWithResult = r2
                    int r1 = r1 % r0
                    if (r1 == 0) goto L2e
                    r1 = r8
                    o.s3$onExtraCallbackWithResult$5$3 r1 = (o.s3.onExtraCallbackWithResult.AnonymousClass5.AnonymousClass3) r1
                    int r2 = r1.label
                    r3 = -2147483648(0xffffffff80000000, float:-0.0)
                    r4 = r2 & r3
                    if (r4 == 0) goto L34
                    int r2 = r2 + r3
                    r1.label = r2
                    int r8 = o.s3.onExtraCallbackWithResult.AnonymousClass5.onExtraCallbackWithResult
                    int r8 = r8 + 57
                    int r2 = r8 % 128
                    o.s3.onExtraCallbackWithResult.AnonymousClass5.onNavigationEvent = r2
                    int r8 = r8 % r0
                    if (r8 == 0) goto L39
                    r8 = 5
                    int r8 = r8 / r0
                    goto L39
                L2e:
                    o.s3$onExtraCallbackWithResult$5$3 r8 = (o.s3.onExtraCallbackWithResult.AnonymousClass5.AnonymousClass3) r8
                    int r7 = r8.label
                    r7 = 0
                    throw r7
                L34:
                    o.s3$onExtraCallbackWithResult$5$3 r1 = new o.s3$onExtraCallbackWithResult$5$3
                    r1.<init>(r8)
                L39:
                    java.lang.Object r8 = r1.result
                    java.lang.Object r0 = o.access14300.onWarmupCompleted()
                    int r2 = r1.label
                    r3 = 1
                    r4 = 0
                    if (r2 == 0) goto L7a
                    if (r2 != r3) goto L53
                    java.lang.Object r7 = r1.L$3
                    o.setRipple r7 = (o.setRipple) r7
                    java.lang.Object r7 = r1.L$1
                    o.s3$onExtraCallbackWithResult$5$3 r7 = (o.s3.onExtraCallbackWithResult.AnonymousClass5.AnonymousClass3) r7
                    kotlin.ResultKt.onNavigationEvent(r8)
                    goto Laf
                L53:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = ""
                    int r8 = android.view.MotionEvent.axisFromString(r8)
                    int r8 = r8 + r3
                    int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)
                    int r0 = 47 - r0
                    int r1 = android.view.ViewConfiguration.getLongPressTimeout()
                    int r1 = r1 >> 16
                    char r1 = (char) r1
                    java.lang.Object[] r2 = new java.lang.Object[r3]
                    a(r8, r0, r1, r2)
                    r8 = r2[r4]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.String r8 = r8.intern()
                    r7.<init>(r8)
                    throw r7
                L7a:
                    kotlin.ResultKt.onNavigationEvent(r8)
                    o.setRipple r8 = r6.onExtraCallback
                    r2 = r7
                    im.toss.state.spec.SessionState$State r2 = (im.toss.state.spec.SessionState.State) r2
                    im.toss.state.spec.SessionState$State$LoginSession r5 = im.toss.state.spec.SessionState.State.LoginSession.onExtraCallbackWithResult
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r5)
                    java.lang.Boolean r2 = o.access14000.onNavigationEvent(r2)
                    java.lang.Object r5 = o.access15400.onNavigationEvent(r7)
                    r1.L$0 = r5
                    java.lang.Object r5 = o.access15400.onNavigationEvent(r1)
                    r1.L$1 = r5
                    java.lang.Object r7 = o.access15400.onNavigationEvent(r7)
                    r1.L$2 = r7
                    java.lang.Object r7 = o.access15400.onNavigationEvent(r8)
                    r1.L$3 = r7
                    r1.I$0 = r4
                    r1.label = r3
                    java.lang.Object r7 = r8.emit(r2, r1)
                    if (r7 != r0) goto Laf
                    return r0
                Laf:
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: o.s3.onExtraCallbackWithResult.AnonymousClass5.emit(java.lang.Object, o.access13800):java.lang.Object");
            }

            private static void a(int i, int i2, char c, Object[] objArr) {
                int i3 = 2 % 2;
                TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
                long[] jArr = new long[i2];
                timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
                int i4 = $10 + 53;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                    int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    jArr[i6] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(IAuthTabCallback[i + i6]), i6, onWarmupCompleted, c);
                    HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
                }
                char[] cArr = new char[i2];
                timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
                while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                    int i7 = $11 + 61;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                        HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
                        int i8 = 43 / 0;
                    } else {
                        cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                        HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
                    }
                    int i9 = $11 + 23;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                }
                objArr[0] = new String(cArr);
            }
        }

        public onExtraCallbackWithResult(IAnimation iAnimation) {
            this.onWarmupCompleted = iAnimation;
        }

        public Object collect(setRipple setripple, access13800 access13800Var) {
            int i = 2 % 2;
            IAnimation iAnimation = this.onWarmupCompleted;
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(setripple);
            int i2 = onNavigationEvent;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5720);
            int i3 = i2 & iOnWarmupCompleted;
            int i4 = (i2 ^ iOnWarmupCompleted) | i3;
            Object obj = null;
            if ((((i4 & (~i3)) >> 10) & 1) != 0) {
                iAnimation.collect(anonymousClass5, access13800Var);
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objCollect = iAnimation.collect(anonymousClass5, access13800Var);
            if (objCollect == access14300.onWarmupCompleted()) {
                int i5 = onNavigationEvent;
                int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2054);
                if (((((i5 | iOnWarmupCompleted2) & (~(i5 & iOnWarmupCompleted2))) >> 19) & 1) != 0) {
                    return objCollect;
                }
                throw null;
            }
            Unit unit = Unit.INSTANCE;
            int i6 = onNavigationEvent;
            int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1240);
            if ((((((~i6) & iOnWarmupCompleted3) | ((~iOnWarmupCompleted3) & i6)) >> 6) & 1) != 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
    }

    private s3() {
    }

    public static final /* synthetic */ IAnimation IAuthTabCallback(s3 s3Var) {
        int i = 2 % 2;
        int i2 = onPostMessage + 47;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return s3Var.access100();
        }
        s3Var.access100();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ s8ExternalSyntheticLambda0 onExtraCallbackWithResult(s3 s3Var) {
        int i = 2 % 2;
        int i2 = onPostMessage + 109;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        s8ExternalSyntheticLambda0 s8externalsyntheticlambda0IAuthTabCallbackStubProxy = s3Var.IAuthTabCallbackStubProxy();
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        int i5 = onPostMessage + 75;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return s8externalsyntheticlambda0IAuthTabCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ s8ExternalSyntheticLambda2 onNavigationEvent(s3 s3Var) {
        int i = 2 % 2;
        int i2 = onPostMessage + 117;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        s8ExternalSyntheticLambda2 s8externalsyntheticlambda2IAuthTabCallback_Parcel = s3Var.IAuthTabCallback_Parcel();
        int i4 = onPostMessage + 59;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return s8externalsyntheticlambda2IAuthTabCallback_Parcel;
    }

    public final getCornerRadius<Boolean> asBinder() {
        int i = 2 % 2;
        int i2 = onPostMessage + 45;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        EnumSet<s8ExternalSyntheticLambda1> enumSetNoneOf;
        getInterfaceDescriptor();
        Object[] objArr = new Object[1];
        c(new char[]{12390, 18050, 47284, 50583, 45857, 53980, 51633, 5113, 40403, 52334, 31671, 43487, 53957, 21765, 57476, 36174, 24426, 35403, 14096, 6466}, 20 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        d(true, new int[]{0, 34, 0, 24}, new byte[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0}, objArr2);
        asBinder = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        d(false, new int[]{34, 20, 60, 13}, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1}, objArr3);
        asInterface = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        c(new char[]{59314, 29036, 63195, 52841, 30786, 65384, 57022, 45159, 16104, 61358, 61482, 9478, 16104, 61358, 61482, 9478, 9118, 14657, 64693, 42182, 61648, 54260, 24452, 41463, 37229, 22651, 299, 54178, 2366, 59304, 33347, 61634, 54745, 38728, 64882, 25242}, View.resolveSizeAndState(0, 0, 0) + 35, objArr4);
        IAuthTabCallbackDefault = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        d(true, new int[]{54, 33, 60, 0}, new byte[]{0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1}, objArr5);
        onExtraCallback = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        d(false, new int[]{87, 19, 62, 0}, new byte[]{1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1}, objArr6);
        onExtraCallbackWithResult = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        c(new char[]{14085, 43634, 55834, 42937, 63452, 53882, 21361, 20037, 46174, 32915, 64194, 63537, 53168, 54634, 9444, 14462, 830, 20710, 61578, 4363}, Color.rgb(0, 0, 0) + 16777236, objArr7);
        onWarmupCompleted = ((String) objArr7[0]).intern();
        onNavigationEvent = new s3();
        IAuthTabCallbackStub = setShine.onNavigationEvent(Boolean.TRUE);
        if (!(!zzaj.onNavigationEvent().ICustomTabsCallback_Parcel())) {
            enumSetNoneOf = EnumSet.noneOf(s8ExternalSyntheticLambda1.class);
        } else {
            if (!zzaj.onNavigationEvent().onRelationshipValidationResult()) {
                enumSetNoneOf = zzaj.onNavigationEvent().ICustomTabsCallbackStub() ? EnumSet.complementOf(EnumSet.of(s8ExternalSyntheticLambda1.DEBUGGER, s8ExternalSyntheticLambda1.EMULATOR, s8ExternalSyntheticLambda1.ROOT)) : EnumSet.allOf(s8ExternalSyntheticLambda1.class);
                access000 = enumSetNoneOf;
                Intrinsics.checkNotNullExpressionValue(enumSetNoneOf, "");
                IAuthTabCallbackStubProxy = new getBooleanFromFullResponse(enumSetNoneOf, new TossApplicationGuard$.ExternalSyntheticLambda14());
                access100 = LazyKt.onExtraCallbackWithResult(new TossApplicationGuard$.ExternalSyntheticLambda15());
                onTransact = LazyKt.onExtraCallbackWithResult(new TossApplicationGuard$.ExternalSyntheticLambda16());
                getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new TossApplicationGuard$.ExternalSyntheticLambda17());
            }
            int i = onActivityResized + 53;
            onMinimized = i % 128;
            int i2 = i % 2;
            enumSetNoneOf = EnumSet.noneOf(s8ExternalSyntheticLambda1.class);
            int i3 = onMinimized + 39;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = 2 % 2;
        access000 = enumSetNoneOf;
        Intrinsics.checkNotNullExpressionValue(enumSetNoneOf, "");
        IAuthTabCallbackStubProxy = new getBooleanFromFullResponse(enumSetNoneOf, new TossApplicationGuard$.ExternalSyntheticLambda14());
        access100 = LazyKt.onExtraCallbackWithResult(new TossApplicationGuard$.ExternalSyntheticLambda15());
        onTransact = LazyKt.onExtraCallbackWithResult(new TossApplicationGuard$.ExternalSyntheticLambda16());
        getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new TossApplicationGuard$.ExternalSyntheticLambda17());
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static long onExtraCallbackWithResult = 4054780506331193029L;
        final /* synthetic */ Activity $activity;
        final /* synthetic */ long $daysRemaining;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(long j, Activity activity, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$daysRemaining = j;
            this.$activity = activity;
        }

        public static /* synthetic */ void onExtraCallback(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 91;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            onNavigationEvent(dialogInterface, i);
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = onExtraCallback + 95;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        public static /* synthetic */ void onWarmupCompleted(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 3;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback(dialogInterface, i);
            int i5 = IAuthTabCallback + 117;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$daysRemaining, this.$activity, access13800Var);
            int i2 = onExtraCallback + 35;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 27;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 119;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 76 / 0;
            }
            return objInvokeSuspend;
        }

        private static void a(char[] cArr, int i, Object[] objArr) {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0) ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (true) {
                Object obj = null;
                if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                    String str = new String(cArr2);
                    int i3 = $11 + 77;
                    $10 = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                    objArr[0] = str;
                    return;
                }
                int i4 = $10 + 81;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
                    obj.hashCode();
                    throw null;
                }
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
            }
        }

        private static final void onNavigationEvent(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 55;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            TextRoundCornerProgressBarSavedState1 smallIconBitmap = addPolicy.getSmallIconBitmap();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long millis = TimeUnit.DAYS.toMillis(1L);
            Object[] objArr = new Object[1];
            a(new char[]{7059, 9409, 25916, 42375, 59119, 10102, 26538, 40990, 57699, 8649, 25120, 41656, 58339, 11353, 27824, 44298, 61040, 11972, 28419, 44940, 59627, 10569, 27048, 43529, 60287, 11206, 29735, 46248, 62947, 13919, 30372, 46874, 61566}, TextUtils.indexOf((CharSequence) "", '0') + 16224, objArr);
            smallIconBitmap.onNavigationEvent(((String) objArr[0]).intern(), jCurrentTimeMillis + millis);
            dialogInterface.dismiss();
            int i5 = IAuthTabCallback + 77;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        private static final void IAuthTabCallback(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 113;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            dialogInterface.dismiss();
            if (i4 == 0) {
                int i5 = 6 / 0;
            }
            int i6 = onExtraCallback + 103;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }

        public final Object invokeSuspend(Object obj) {
            String string;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 43;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    Object[] objArr = new Object[1];
                    a(new char[]{7057, 12246, 29460, 34641, 51910, 7903, 8707, 30257, 47613, 52717, 4389, 9590, 26811, 48158, 49233, 3038, 24450, 25349, 46925, 64139, 3833, 21033, 26233, 43489, 64941, 294, 21662, 39107, 44049, 61512, 15233, 20366, 37746, 42848, 60081, 16105, 16942, 38443, 55727, 60702, 12616, 17552, 35029, 56337, 57415, 11197, 32753}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13381, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
                long jOnWarmupCompleted = setCommandLine.onWarmupCompleted(500, setRevision.MILLISECONDS);
                this.label = 1;
                if (formatMsgs.IAuthTabCallback(jOnWarmupCompleted, this) == objOnWarmupCompleted) {
                    int i4 = IAuthTabCallback + 57;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            }
            long j = this.$daysRemaining;
            if (j <= 0) {
                int i6 = onExtraCallback + 53;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                string = this.$activity.getString(R.string.security_guard_build_expiry_warning_msg_today);
                int i8 = onExtraCallback + 111;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
            } else {
                string = this.$activity.getString(R.string.security_guard_build_expiry_warning_msg_days, access14000.onNavigationEvent((int) j));
            }
            Intrinsics.checkNotNull(string);
            TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompletedOnExtraCallback = TdsDialogV1.Companion.onExtraCallback(this.$activity);
            String string2 = this.$activity.getString(R.string.security_guard_build_expiry_warning_title);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) ((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompletedOnExtraCallback.onNavigationEvent(string2)).onExtraCallbackWithResult(string);
            String string3 = this.$activity.getString(R.string.security_guard_build_expiry_warning_dismiss);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            Object[] objArr2 = {onwarmupcompleted, string3, new TossApplicationGuard$notifyBuildExpiryWarningIfNeeded$1$.ExternalSyntheticLambda0(), null, false, 12, null};
            int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
            TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted2 = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), objArr2, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1871975236, 1871975236, iOnExtraCallbackWithResult2);
            String string4 = this.$activity.getString(R.string.security_guard_build_expiry_warning_confirm);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            ReactJsExceptionHandlerProcessedErrorStackFrame.onExtraCallback((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallback(onwarmupcompleted2, string4, new TossApplicationGuard$notifyBuildExpiryWarningIfNeeded$1$.ExternalSyntheticLambda1(), (TdsButtonV1View.asInterface) null, false, 12, (Object) null).onNavigationEvent(true));
            return Unit.INSTANCE;
        }
    }

    private static final TextRoundCornerProgressBarSavedState1 ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onPostMessage + 61;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        int i4 = writeTypedObject + 73;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub;
        }
        throw null;
    }

    @Override // o.createFromParcel
    public newArray IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onPostMessage + 39;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        newArray newarray = IAuthTabCallbackStubProxy;
        int i5 = i3 + 91;
        onPostMessage = i5 % 128;
        if (i5 % 2 != 0) {
            return newarray;
        }
        throw null;
    }

    private final s8ExternalSyntheticLambda2 IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 27;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        s8ExternalSyntheticLambda2 s8externalsyntheticlambda2 = (s8ExternalSyntheticLambda2) access100.getValue();
        int i4 = onPostMessage + 51;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return s8externalsyntheticlambda2;
    }

    private static final s8ExternalSyntheticLambda2 writeTypedObject() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 65;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        s8ExternalSyntheticLambda2 s8externalsyntheticlambda2 = (s8ExternalSyntheticLambda2) ((s8ExternalSyntheticLambda2.onExtraCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), s8ExternalSyntheticLambda2.onExtraCallback.class)).ComponentActivityExternalSyntheticLambda3$293635a6();
        int i4 = onPostMessage + 1;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return s8externalsyntheticlambda2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final s8ExternalSyntheticLambda0 IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 37;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Object value = onTransact.getValue();
        if (i3 != 0) {
            return (s8ExternalSyntheticLambda0) value;
        }
        throw null;
    }

    private static final s8ExternalSyntheticLambda0 access000() {
        int i = 2 % 2;
        int i2 = onPostMessage + 105;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        s8ExternalSyntheticLambda0 s8externalsyntheticlambda0 = (s8ExternalSyntheticLambda0) ((s8ExternalSyntheticLambda0.onNavigationEvent) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), s8ExternalSyntheticLambda0.onNavigationEvent.class)).onStateChanged$293635e4();
        int i4 = writeTypedObject + 119;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return s8externalsyntheticlambda0;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onPostMessage + 1;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        s8ExternalSyntheticLambda3 s8externalsyntheticlambda3 = (s8ExternalSyntheticLambda3) getInterfaceDescriptor.getValue();
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        return s8externalsyntheticlambda3;
    }

    private static void c(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i3 = $11 + 95;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                char C = AppNode5.C(c, (c2 + i5) ^ ((c2 << 4) + ((char) (extraCallbackWithResult ^ 1094535280733222934L))), c2 >>> 5, ICustomTabsCallback);
                cArr3[1] = C;
                cArr3[0] = AppNode5.C(cArr3[0], (C + i5) ^ ((C << 4) + ((char) (IAuthTabCallback_Parcel ^ 1094535280733222934L))), C >>> 5, readTypedObject);
                i5 -= 40503;
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            s3c.asBinder.B(defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1);
            int i7 = $10 + 57;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final s8ExternalSyntheticLambda3 extraCallback() {
        int i = 2 % 2;
        int i2 = onPostMessage + 91;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        s8ExternalSyntheticLambda3 s8externalsyntheticlambda3 = (s8ExternalSyntheticLambda3) ((s8ExternalSyntheticLambda3.onWarmupCompleted) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), s8ExternalSyntheticLambda3.onWarmupCompleted.class)).ComponentActivityExternalSyntheticLambda2$29363587();
        int i4 = onPostMessage + 71;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return s8externalsyntheticlambda3;
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int[] IAuthTabCallback = {-1210640837, 349046712, 716159046, 6657289, 666543858, -1474652905, -688764195, 1699964571, 1600166750, -1612822886, -753697239, -1449224120, 1137038776, 300699440, 2101330384, 246615233, 1653504651, 353188516};
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(Context context, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onTransact ontransactCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                ontransactCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = ontransactCreate.invokeSuspend(unit);
            int i4 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(this.$context, access13800Var);
            int i2 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return ontransact;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 17 / 0;
            }
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 17;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(new int[]{-608873442, 2036118322, -1161782087, -543646562, 907824044, 675938966, 707064485, 1029211746, 1117256281, 1619581646, 1235165890, 500392713, 1214668188, 1147937456, 193160848, 729932772, 2146532428, 1903846948, 848591091, -1519554360, -577138018, -741096555, 1957076954, 1762078644}, 46 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                IAnimation iAnimationIAuthTabCallback = s3.IAuthTabCallback(s3.onNavigationEvent);
                final Context context = this.$context;
                setRipple setripple = new setRipple() { // from class: o.s3.onTransact.5
                    static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AnonymousClass5.class);

                    /* renamed from: o.s3$onTransact$5$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                        private static int $10 = 0;
                        private static int $11 = 1;
                        private static int IAuthTabCallback = 1;
                        private static long onExtraCallbackWithResult = -9155415665754082232L;
                        private static int onNavigationEvent;
                        final /* synthetic */ Context $context;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(Context context, access13800<? super AnonymousClass1> access13800Var) {
                            super(2, access13800Var);
                            this.$context = context;
                        }

                        public static /* synthetic */ Unit onExtraCallback(String str) {
                            int i = 2 % 2;
                            int i2 = IAuthTabCallback + 111;
                            onNavigationEvent = i2 % 128;
                            int i3 = i2 % 2;
                            Unit unitOnNavigationEvent = onNavigationEvent(str);
                            if (i3 != 0) {
                                int i4 = 2 / 0;
                            }
                            return unitOnNavigationEvent;
                        }

                        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                            int i = 2 % 2;
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, access13800Var);
                            int i2 = onNavigationEvent + 51;
                            IAuthTabCallback = i2 % 128;
                            int i3 = i2 % 2;
                            return anonymousClass1;
                        }

                        public /* synthetic */ Object invoke(Object obj, Object obj2) {
                            int i = 2 % 2;
                            int i2 = IAuthTabCallback + 87;
                            onNavigationEvent = i2 % 128;
                            Object obj3 = null;
                            findResAndMsg findresandmsg = (findResAndMsg) obj;
                            access13800<? super Unit> access13800Var = (access13800) obj2;
                            if (i2 % 2 != 0) {
                                onNavigationEvent(findresandmsg, access13800Var);
                                obj3.hashCode();
                                throw null;
                            }
                            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                            int i3 = IAuthTabCallback + 105;
                            onNavigationEvent = i3 % 128;
                            if (i3 % 2 == 0) {
                                return objOnNavigationEvent;
                            }
                            throw null;
                        }

                        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                            int i = 2 % 2;
                            int i2 = onNavigationEvent + 33;
                            IAuthTabCallback = i2 % 128;
                            int i3 = i2 % 2;
                            Object obj = null;
                            AnonymousClass1 anonymousClass1Create = create(findresandmsg, access13800Var);
                            if (i3 == 0) {
                                anonymousClass1Create.invokeSuspend(Unit.INSTANCE);
                                obj.hashCode();
                                throw null;
                            }
                            Object objInvokeSuspend = anonymousClass1Create.invokeSuspend(Unit.INSTANCE);
                            int i4 = onNavigationEvent + 103;
                            IAuthTabCallback = i4 % 128;
                            if (i4 % 2 != 0) {
                                return objInvokeSuspend;
                            }
                            throw null;
                        }

                        private static void a(char[] cArr, int i, Object[] objArr) {
                            int i2 = 2 % 2;
                            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
                            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
                            int length = cArr.length;
                            long[] jArr = new long[length];
                            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
                            int i3 = $11 + 11;
                            $10 = i3 % 128;
                            int i4 = i3 % 2;
                            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                                int i5 = $10 + 15;
                                $11 = i5 % 128;
                                int i6 = i5 % 2;
                                jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0) ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                                SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
                            }
                            char[] cArr2 = new char[length];
                            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
                            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                                SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
                            }
                            objArr[0] = new String(cArr2);
                        }

                        private static final Unit onNavigationEvent(String str) {
                            Unit unit;
                            int i = 2 % 2;
                            int i2 = onNavigationEvent + 31;
                            IAuthTabCallback = i2 % 128;
                            if (i2 % 2 == 0) {
                                s3.onNavigationEvent.onExtraCallbackWithResult(str);
                                unit = Unit.INSTANCE;
                                int i3 = 47 / 0;
                            } else {
                                s3.onNavigationEvent.onExtraCallbackWithResult(str);
                                unit = Unit.INSTANCE;
                            }
                            int i4 = onNavigationEvent + 17;
                            IAuthTabCallback = i4 % 128;
                            int i5 = i4 % 2;
                            return unit;
                        }

                        public final Object invokeSuspend(Object obj) {
                            int i = 2 % 2;
                            int i2 = IAuthTabCallback + 79;
                            onNavigationEvent = i2 % 128;
                            int i3 = i2 % 2;
                            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                            int i4 = this.label;
                            if (i4 != 0) {
                                int i5 = IAuthTabCallback + 107;
                                onNavigationEvent = i5 % 128;
                                if (i5 % 2 == 0 ? i4 != 1 : i4 != 0) {
                                    Object[] objArr = new Object[1];
                                    a(new char[]{61724, 39733, 9541, 53138, 23027, 58332, 35858, 5746, 40960, 19086, 54452, 32469, 2830, 38205, 16192, 51677, 21487, 64966, 34332, 4136, 47692, 17546, 61096, 30850, 1360, 44837, 14671, 50048, 28068, 63435, 32784, 10861, 46143, 24195, 59552, 29418, 7963, 43368, 13182, 56733, 26549, 61939, 39428, 9266, 52850, 22686, 58016}, Process.getGidForName("") + 27180, objArr);
                                    throw new IllegalStateException(((String) objArr[0]).intern());
                                }
                                ResultKt.onNavigationEvent(obj);
                            } else {
                                ResultKt.onNavigationEvent(obj);
                                s3 s3Var = s3.onNavigationEvent;
                                s3Var.onExtraCallback(this.$context);
                                s8ExternalSyntheticLambda2 s8externalsyntheticlambda2OnNavigationEvent = s3.onNavigationEvent(s3Var);
                                Context context = this.$context;
                                this.label = 1;
                                if (s8externalsyntheticlambda2OnNavigationEvent.onExtraCallbackWithResult(context, this) == objOnWarmupCompleted) {
                                    int i6 = IAuthTabCallback + 121;
                                    onNavigationEvent = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        return objOnWarmupCompleted;
                                    }
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                            }
                            s3.onExtraCallbackWithResult(s3.onNavigationEvent).onExtraCallback(new TossApplicationGuard$start$1$1$1$.ExternalSyntheticLambda0());
                            return Unit.INSTANCE;
                        }
                    }

                    public /* synthetic */ Object emit(Object obj2, access13800 access13800Var) {
                        int i5 = 2 % 2;
                        int iOnWarmupCompleted = ((onNavigationEvent ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2457)) >> 26) & 1;
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        if (iOnWarmupCompleted != 0) {
                            return onNavigationEvent(zBooleanValue, access13800Var);
                        }
                        onNavigationEvent(zBooleanValue, access13800Var);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }

                    public final Object onNavigationEvent(boolean z, access13800<? super Unit> access13800Var) {
                        int i5 = 2 % 2;
                        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(624);
                        Object obj2 = null;
                        if (!z) {
                            s3.onExtraCallbackWithResult(s3.onNavigationEvent).onWarmupCompleted();
                            Unit unit = Unit.INSTANCE;
                            int i6 = onNavigationEvent;
                            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4560);
                            if ((((((~i6) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i6)) >> 12) & 1) == 0) {
                                return unit;
                            }
                            obj2.hashCode();
                            throw null;
                        }
                        GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, null);
                        int i7 = onNavigationEvent;
                        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3558);
                        int i8 = (~iOnWarmupCompleted2) & i7;
                        int i9 = (~i7) & iOnWarmupCompleted2;
                        if (((((i9 & i8) | (i8 ^ i9)) >> 12) & 1) != 0) {
                            maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, anonymousClass1, access13800Var);
                            access14300.onWarmupCompleted();
                            obj2.hashCode();
                            throw null;
                        }
                        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, anonymousClass1, access13800Var);
                        if (objOnExtraCallback != access14300.onWarmupCompleted()) {
                            Unit unit2 = Unit.INSTANCE;
                            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(629);
                            return unit2;
                        }
                        int i10 = onNavigationEvent;
                        int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2106);
                        int i11 = i10 & iOnWarmupCompleted3;
                        if ((((((i10 ^ iOnWarmupCompleted3) | i11) & (~i11)) >> 31) & 1) == 0) {
                            return objOnExtraCallback;
                        }
                        throw null;
                    }
                };
                this.label = 1;
                if (iAnimationIAuthTabCallback.collect(setripple, this) == objOnWarmupCompleted) {
                    int i5 = onExtraCallbackWithResult + 63;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }

        private static void a(int[] iArr, int i, Object[] objArr) {
            int i2 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = IAuthTabCallback;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i3 = 0;
                while (i3 < length) {
                    int i4 = $11 + 81;
                    $10 = i4 % 128;
                    if (i4 % 2 != 0) {
                        iArr3[i3] = Hilt_QuickActionBottomSheetActivity$4.h(iArr2[i3]);
                        i3--;
                    } else {
                        iArr3[i3] = Hilt_QuickActionBottomSheetActivity$4.h(iArr2[i3]);
                        i3++;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = IAuthTabCallback;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i5 = $10 + 117;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 % 2;
                }
                int i7 = 0;
                while (i7 < length3) {
                    int i8 = $10 + 5;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        iArr6[i7] = Hilt_QuickActionBottomSheetActivity$4.h(iArr5[i7]);
                        i7 %= 0;
                    } else {
                        iArr6[i7] = Hilt_QuickActionBottomSheetActivity$4.h(iArr5[i7]);
                        i7++;
                    }
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i9 = 0;
                while (i9 < 16) {
                    int i10 = $10 + 31;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i9];
                        int iJ = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ;
                        i9 += 33;
                    } else {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i9];
                        int iJ2 = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ2;
                        i9++;
                    }
                    int i11 = $10 + 11;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 2 % 4;
                    }
                }
                int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i13;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                DevToolActionListViewModel$onExtraCallback.f(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                int i16 = $10 + 55;
                $11 = i16 % 128;
                int i17 = i16 % 2;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    @Override // o.createFromParcel
    public void onExtraCallbackWithResult(@NotNull Context context, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        IAuthTabCallbackStub.onWarmupCompleted(Boolean.valueOf(z));
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(findRes.onExtraCallbackWithResult(), (CoroutineContext) null, (setRandomHost) null, new onTransact(context, null), 3, (Object) null);
        readTypedObject().onExtraCallback();
        s3b.Companion.onExtraCallback(context);
        int i2 = onPostMessage + 47;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onWarmupCompleted extends SuspendLambda implements Function2<ok<? super Boolean>, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int[] onNavigationEvent = {107236638, 1159682153, -219977835, -376136844, -1771094914, -1635876594, -826926187, -1039306481, 1982275384, 205684819, -1080792557, -1760618910, 504909249, 1107316830, -864535435, 1298150694, -316248052, -698714345};
        private static int onWarmupCompleted = 1;
        private /* synthetic */ Object L$0;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var);
            onwarmupcompleted.L$0 = obj;
            int i2 = onWarmupCompleted + 107;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((ok) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 66 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(ok<? super Boolean> okVar, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(okVar, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return onwarmupcompletedCreate.invokeSuspend(unit);
            }
            onwarmupcompletedCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* renamed from: o.s3$onWarmupCompleted$2, reason: invalid class name */
        public static final class AnonymousClass2 implements AppLifecycleEventObserver$onExtraCallbackWithResult {
            private static final byte[] $$a;
            final /* synthetic */ ok<Boolean> IAuthTabCallback;
            static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AnonymousClass2.class);
            private static final int $$b = 102;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$c(byte r5, short r6, short r7) {
                /*
                    int r7 = r7 + 4
                    int r5 = r5 * 4
                    int r0 = 11 - r5
                    int r6 = r6 * 3
                    int r6 = r6 + 102
                    byte[] r1 = o.s3.onWarmupCompleted.AnonymousClass2.$$a
                    byte[] r0 = new byte[r0]
                    int r5 = 10 - r5
                    r2 = 0
                    if (r1 != 0) goto L16
                    r4 = r5
                    r3 = r2
                    goto L28
                L16:
                    r3 = r2
                L17:
                    int r7 = r7 + 1
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r5) goto L24
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    return r5
                L24:
                    int r3 = r3 + 1
                    r4 = r1[r7]
                L28:
                    int r6 = r6 + r4
                    int r6 = r6 + 2
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: o.s3.onWarmupCompleted.AnonymousClass2.$$c(byte, short, short):java.lang.String");
            }

            static {
                byte[] bArr = {84, -122, 19, 43, 1, 3, -12, -26, 27, -9, 14, -19, 15, 5};
                $$a = bArr;
                ClassLoader parent = AnonymousClass2.class.getClassLoader().getParent();
                try {
                    byte b = bArr[4];
                    byte b2 = (byte) (b - 1);
                    Method declaredMethod = ClassLoader.class.getDeclaredMethod($$c(b2, b2, (byte) (-b)), String.class);
                    declaredMethod.setAccessible(true);
                    System.load((String) declaredMethod.invoke(parent, "ea56"));
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            public static native long u(int i, Object obj, Object obj2);

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(ok<? super Boolean> okVar) {
                this.IAuthTabCallback = okVar;
            }

            @Override // im.toss.security.guard.AppLifecycleEventObserver$onExtraCallbackWithResult
            public void IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(832);
                if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 3) & 1) == 0) {
                    this.IAuthTabCallback.IAuthTabCallback(Boolean.FALSE);
                    int i3 = 12 / 0;
                } else {
                    this.IAuthTabCallback.IAuthTabCallback(Boolean.FALSE);
                }
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5489);
            }

            @Override // im.toss.security.guard.AppLifecycleEventObserver$onExtraCallbackWithResult
            public void onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(6002);
                int i3 = (~iOnWarmupCompleted) & i2;
                int i4 = (~i2) & iOnWarmupCompleted;
                if (((((i4 & i3) | (i3 ^ i4)) >> 29) & 1) != 0) {
                    this.IAuthTabCallback.IAuthTabCallback(Boolean.TRUE);
                    return;
                }
                this.IAuthTabCallback.IAuthTabCallback(Boolean.TRUE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private static void a(int[] iArr, int i, Object[] objArr) {
            int length;
            int[] iArr2;
            int i2 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = onNavigationEvent;
            if (iArr3 != null) {
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = $10 + 111;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    iArr4[i3] = Hilt_QuickActionBottomSheetActivity$4.h(iArr3[i3]);
                }
                iArr3 = iArr4;
            }
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = onNavigationEvent;
            if (iArr6 != null) {
                int i6 = $11 + 69;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                }
                for (int i7 = 0; i7 < length; i7++) {
                    int i8 = $10 + 39;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    iArr2[i7] = Hilt_QuickActionBottomSheetActivity$4.h(iArr6[i7]);
                }
                iArr6 = iArr2;
            }
            System.arraycopy(iArr6, 0, iArr5, 0, length3);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                for (int i10 = 0; i10 < 16; i10++) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i10];
                    int iJ = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ;
                }
                int i11 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i11;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
                int i12 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                DevToolActionListViewModel$onExtraCallback.f(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            ok okVar = (ok) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback + 7;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    Object[] objArr = new Object[1];
                    a(new int[]{-1273198051, 2057410786, 349670431, -2010346843, -1297144961, -1847688317, 1533052638, -169697564, 1127780435, 968157986, 2003487489, -603241329, 1646733527, -1827731781, -938940676, 452046167, -359353309, -670133351, -431144084, 2135908352, -406744161, 1903198600, -804247450, 661204948}, Gravity.getAbsoluteGravity(0, 0) + 47, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
                int i4 = onExtraCallback + 85;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                TextLinkScopeExternalSyntheticLambda3.Companion.onExtraCallbackWithResult().getLifecycle().IAuthTabCallback(new AppLifecycleEventObserver(new AnonymousClass2(okVar)));
                this.L$0 = access15400.onNavigationEvent(okVar);
                this.label = 1;
                Object obj2 = null;
                if (jw.IAuthTabCallback(okVar, (Function0) null, this, 1, (Object) null) == objOnWarmupCompleted) {
                    int i6 = onWarmupCompleted + 47;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    obj2.hashCode();
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements setUnreadableElfFiles<Boolean, Boolean, Boolean, Boolean, access13800<? super Boolean>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        /* synthetic */ boolean Z$1;
        /* synthetic */ boolean Z$2;
        int label;
        private static char[] onWarmupCompleted = {64976, 64979, 64989, 64977, 64983, 64991, 64960, 64966, 64967, 64916, 64984, 64965, 65065, 64987, 65064, 64964, 64961, 64986, 64982, 64978, 64981, 64915, 64990, 64988, 64980};
        private static char onNavigationEvent = 51244;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(5, access13800Var);
        }

        public final Object IAuthTabCallback(boolean z, boolean z2, Boolean bool, boolean z3, access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(access13800Var);
            iAuthTabCallback.Z$0 = z;
            iAuthTabCallback.Z$1 = z2;
            iAuthTabCallback.L$0 = bool;
            iAuthTabCallback.Z$2 = z3;
            Object objInvokeSuspend = iAuthTabCallback.invokeSuspend(Unit.INSTANCE);
            int i2 = onExtraCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Boolean) obj3, ((Boolean) obj4).booleanValue(), (access13800) obj5);
            int i4 = onExtraCallbackWithResult + 69;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r0 = 2
                int r1 = r0 % r0
                boolean r1 = r8.Z$0
                boolean r2 = r8.Z$1
                java.lang.Object r3 = r8.L$0
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r4 = r8.Z$2
                int r5 = r8.label
                r6 = 0
                r7 = 1
                if (r5 != 0) goto L54
                kotlin.ResultKt.onNavigationEvent(r9)
                if (r1 == 0) goto L40
                if (r2 == 0) goto L40
                int r9 = o.s3.IAuthTabCallback.onExtraCallback
                int r9 = r9 + 113
                int r1 = r9 % 128
                o.s3.IAuthTabCallback.onExtraCallbackWithResult = r1
                int r9 = r9 % r0
                boolean r9 = r3.booleanValue()
                if (r9 == 0) goto L40
                int r9 = o.s3.IAuthTabCallback.onExtraCallbackWithResult
                int r9 = r9 + 97
                int r1 = r9 % 128
                o.s3.IAuthTabCallback.onExtraCallback = r1
                int r9 = r9 % r0
                if (r9 != 0) goto L3e
                if (r4 == 0) goto L40
                int r1 = r1 + 55
                int r9 = r1 % 128
                o.s3.IAuthTabCallback.onExtraCallbackWithResult = r9
                int r1 = r1 % r0
                goto L41
            L3e:
                r9 = 0
                throw r9
            L40:
                r7 = r6
            L41:
                java.lang.Boolean r9 = o.access14000.onNavigationEvent(r7)
                int r1 = o.s3.IAuthTabCallback.onExtraCallback
                int r1 = r1 + 49
                int r2 = r1 % 128
                o.s3.IAuthTabCallback.onExtraCallbackWithResult = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L53
                r0 = 66
                int r0 = r0 / r6
            L53:
                return r9
            L54:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r0 = 47
                char[] r1 = new char[r0]
                r1 = {x007c: FILL_ARRAY_DATA , data: [4, 15, 13872, 13872, 23, 6, 24, 22, 6, 19, 16, 8, 12, 2, 19, 8, 23, 1, 15, 23, 21, 18, 16, 23, 7, 19, 1, 12, 20, 13, 19, 8, 20, 16, 18, 7, 11, 23, 3, 20, 18, 21, 8, 9, 22, 7, 13881} // fill-array
                int r2 = android.view.ViewConfiguration.getScrollBarSize()
                int r2 = r2 >> 8
                int r2 = r2 + 58
                byte r2 = (byte) r2
                int r3 = android.graphics.drawable.Drawable.resolveOpacity(r6, r6)
                int r3 = r3 + r0
                java.lang.Object[] r0 = new java.lang.Object[r7]
                a(r1, r2, r3, r0)
                r0 = r0[r6]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: o.s3.IAuthTabCallback.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) {
            char[] cArr2;
            int i2;
            int i3;
            int i4;
            char[] cArr3;
            int i5;
            int i6 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr4 = onWarmupCompleted;
            int i7 = 0;
            if (cArr4 != null) {
                int length = cArr4.length;
                char[] cArr5 = new char[length];
                for (int i8 = 0; i8 < length; i8++) {
                    cArr5[i8] = PKCS58.onNavigationEvent.z(cArr4[i8]);
                }
                int i9 = $10 + 21;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr2 = cArr5;
            } else {
                cArr2 = cArr4;
            }
            char cZ = PKCS58.onNavigationEvent.z(onNavigationEvent);
            char[] cArr6 = new char[i];
            if (i % 2 != 0) {
                int i11 = i - 1;
                cArr6[i11] = (char) (cArr[i11] - b);
                i2 = i11;
            } else {
                i2 = i;
            }
            int i12 = 1;
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i12];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i12] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        i3 = i12;
                        i4 = i2;
                        cArr3 = cArr6;
                        i5 = i7;
                    } else {
                        i3 = i12;
                        i4 = i2;
                        cArr3 = cArr6;
                        i5 = i7;
                        if (DevToolActionListViewModel$asInterface.A(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0) == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int I = onExtraCallbackWithResult.I(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0);
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[I];
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cZ) - 1) % cZ;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cZ) - 1) % cZ;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                            int i16 = $11 + 15;
                            $10 = i16 % 128;
                            int i17 = i16 % 2;
                        } else {
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i19 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i18];
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i19];
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    cArr6 = cArr3;
                    i12 = i3;
                    i2 = i4;
                    i7 = i5;
                }
            }
            char[] cArr7 = cArr6;
            int i20 = i7;
            for (int i21 = i20; i21 < i; i21++) {
                cArr7[i21] = (char) (cArr7[i21] ^ 13722);
            }
            objArr[i20] = new String(cArr7);
        }
    }

    private final IAnimation<Boolean> access100() {
        int i = 2 % 2;
        IAnimation iAnimationOnNavigationEvent = ycxycx.onNavigationEvent(new onWarmupCompleted(null));
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(ReactiveFlowKt.onWarmupCompleted(SessionState.Companion.onExtraCallback().onExtraCallbackWithResult(true)));
        Object[] objArr = {onTextViewSizeChanged.onExtraCallbackWithResult, false, 1, null};
        IAnimation<Boolean> iAnimationOnNavigationEvent2 = ycxycx.onNavigationEvent(ycxycx.onExtraCallbackWithResult(iAnimationOnNavigationEvent, onextracallbackwithresult, RxConvertKt.IAuthTabCallback((getByteBuffer) onTextViewSizeChanged.IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 773290631, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), objArr, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -773290631)), IAuthTabCallbackStub, new IAuthTabCallback(null)));
        int i2 = writeTypedObject + 39;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        return iAnimationOnNavigationEvent2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // o.createFromParcel
    public RoundCornerProgressBar onExtraCallback(@NotNull IconRoundCornerProgressBarOnIconClickListener iconRoundCornerProgressBarOnIconClickListener) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onPostMessage + 17;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iconRoundCornerProgressBarOnIconClickListener, "");
        switch (onNavigationEvent.onExtraCallbackWithResult[iconRoundCornerProgressBarOnIconClickListener.onExtraCallbackWithResult().ordinal()]) {
            case 1:
                RoundCornerProgressBar roundCornerProgressBar = RoundCornerProgressBar.EXIT;
                int i4 = writeTypedObject + 109;
                onPostMessage = i4 % 128;
                int i5 = i4 % 2;
                return roundCornerProgressBar;
            case 2:
                return RoundCornerProgressBar.EXIT;
            case 3:
                return RoundCornerProgressBar.EXIT;
            case 4:
                RoundCornerProgressBar roundCornerProgressBar2 = RoundCornerProgressBar.CLEAR;
                int i6 = onPostMessage + 113;
                writeTypedObject = i6 % 128;
                int i7 = i6 % 2;
                return roundCornerProgressBar2;
            case 5:
                return RoundCornerProgressBar.EXIT;
            case 6:
                return RoundCornerProgressBar.EXIT;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // o.createFromParcel
    public void onNavigationEvent(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onPostMessage + 83;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        AppLovinError.Companion.onExtraCallbackWithResult().IAuthTabCallback(false);
        int i4 = writeTypedObject + 39;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.createFromParcel
    public void IAuthTabCallback(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 7;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            UST_CMP_IssueCertificate.onExtraCallback onextracallback = UST_CMP_IssueCertificate.onExtraCallback.SECURITY;
            Object[] objArr = new Object[1];
            c(new char[]{7552, 44308, 3887, 3855, 20160, 16144, 63714, 45849, 14091, 52374, 59999, 18738, 299, 54178, 2366, 59304, 33347, 61634, 54745, 38728, 64882, 25242}, 21 - View.resolveSizeAndState(0, 0, 0), objArr);
            UST_CMP_IssueCertificate.IAuthTabCallback(-596488443, new Object[]{false, onextracallback, ((String) objArr[0]).intern(), null, 6, 9, null}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 596488447);
            return;
        }
        Intrinsics.checkNotNullParameter(context, "");
        UST_CMP_IssueCertificate.onExtraCallback onextracallback2 = UST_CMP_IssueCertificate.onExtraCallback.SECURITY;
        Object[] objArr2 = new Object[1];
        c(new char[]{7552, 44308, 3887, 3855, 20160, 16144, 63714, 45849, 14091, 52374, 59999, 18738, 299, 54178, 2366, 59304, 33347, 61634, 54745, 38728, 64882, 25242}, 29 % View.resolveSizeAndState(1, 1, 0), objArr2);
        UST_CMP_IssueCertificate.IAuthTabCallback(-596488443, new Object[]{false, onextracallback2, ((String) objArr2[0]).intern(), null, 86, 68, null}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 596488447);
    }

    private static final Unit onExtraCallback(Context context, trackEventSynchronously trackeventsynchronously) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 15;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(trackeventsynchronously, "");
        trackeventsynchronously.onExtraCallbackWithResult(context.getString(R.string.security_guard_noti_title_app_fds_detected));
        Object[] objArr = {trackeventsynchronously, context.getString(R.string.security_guard_noti_message_app_fds_detected)};
        trackEventSynchronously.onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1173521210, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1173521212, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        trackeventsynchronously.onExtraCallbackWithResult(EventServiceImplExternalSyntheticLambda0.IMPORTANT);
        trackeventsynchronously.onNavigationEvent(5);
        trackeventsynchronously.onWarmupCompleted(NativeCrashReporter.DEFAULT.getPattern());
        Unit unit = Unit.INSTANCE;
        int i4 = onPostMessage + 47;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 99;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            dialogInterface.dismiss();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(Context context, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(context.getString(R.string.security_guard_noti_title_app_fds_detected));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(context.getString(R.string.security_guard_noti_message_app_fds_detected));
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new TossApplicationGuard$.ExternalSyntheticLambda18())}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = writeTypedObject + 17;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final void onWarmupCompleted(Context context, RoundCornerProgressBar roundCornerProgressBar, String str) {
        int i = 2 % 2;
        int i2 = onPostMessage + 17;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent.IAuthTabCallback(context, roundCornerProgressBar, 5L, str);
            int i3 = 99 / 0;
        } else {
            onNavigationEvent.IAuthTabCallback(context, roundCornerProgressBar, 5L, str);
        }
        int i4 = onPostMessage + 5;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.createFromParcel
    public void onExtraCallback(@NotNull Context context, @NotNull RoundCornerProgressBar roundCornerProgressBar, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(roundCornerProgressBar, "");
        Intrinsics.checkNotNullParameter(str, "");
        trackCheckout trackcheckoutOnNavigationEvent = trackCheckout.Companion.onNavigationEvent();
        Object[] objArr = new Object[1];
        d(true, new int[]{0, 34, 0, 24}, new byte[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0}, objArr);
        trackcheckoutOnNavigationEvent.onWarmupCompleted(((String) objArr[0]).intern(), 0, new TossApplicationGuard$.ExternalSyntheticLambda5(context));
        IAuthTabCallback(context, roundCornerProgressBar, 10L, str);
        writeRaw writerawOnWarmupCompleted = CommonModule_setScreenAwakeMode.IAuthTabCallback(context, new TossApplicationGuard$.ExternalSyntheticLambda6(context)).onWarmupCompleted(new TossApplicationGuard$.ExternalSyntheticLambda7(context, roundCornerProgressBar, str));
        Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
        IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(writerawOnWarmupCompleted, (String) null, 1, (Object) null);
        int i2 = onPostMessage + 29;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 42 / 0;
        }
    }

    private static void d(boolean z, int[] iArr, byte[] bArr, Object[] objArr) {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = extraCallback;
        if (cArr != null) {
            int i7 = $10 + 83;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i9 = 0; i9 < length; i9++) {
                cArr2[i9] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr[i9]);
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i10 = $11 + 35;
                $10 = i10 % 128;
                if (i10 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = getExternalTransactionToken.q(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                } else {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Hilt_SchemeHistoryActivity$5.w(trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0);
            }
            int i11 = $11 + 99;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i13 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i13, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i13);
        }
        if (z) {
            int i14 = $11 + 91;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i16 = $11 + 9;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[i4 >>> trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                int i17 = $10 + 21;
                $11 = i17 % 128;
                int i18 = i17 % 2;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        trackEventSynchronously trackeventsynchronously = (trackEventSynchronously) objArr[2];
        int i = 2 % 2;
        int i2 = writeTypedObject + 91;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(trackeventsynchronously, "");
            trackeventsynchronously.onExtraCallbackWithResult(str);
            int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            trackEventSynchronously.onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1173521210, iOnExtraCallbackWithResult, 1173521212, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{trackeventsynchronously, str2}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
            trackeventsynchronously.onExtraCallbackWithResult(EventServiceImplExternalSyntheticLambda0.IMPORTANT);
            trackeventsynchronously.onNavigationEvent(2);
            trackeventsynchronously.onWarmupCompleted(NativeCrashReporter.DEFAULT.getPattern());
        } else {
            Intrinsics.checkNotNullParameter(trackeventsynchronously, "");
            trackeventsynchronously.onExtraCallbackWithResult(str);
            int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            trackEventSynchronously.onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1173521210, iOnExtraCallbackWithResult2, 1173521212, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{trackeventsynchronously, str2}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
            trackeventsynchronously.onExtraCallbackWithResult(EventServiceImplExternalSyntheticLambda0.IMPORTANT);
            trackeventsynchronously.onNavigationEvent(5);
            trackeventsynchronously.onWarmupCompleted(NativeCrashReporter.DEFAULT.getPattern());
        }
        Unit unit = Unit.INSTANCE;
        int i3 = writeTypedObject + 125;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit asBinder(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onPostMessage + 33;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            dialogInterface.dismiss();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(String str, String str2, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(str);
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str2);
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new TossApplicationGuard$.ExternalSyntheticLambda22())}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = writeTypedObject + 35;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final void onWarmupCompleted(String str) {
        int i = 2 % 2;
        s3 s3Var = onNavigationEvent;
        Context contextOnExtraCallback = UserChoiceBillingListener.onExtraCallback.onExtraCallback();
        RoundCornerProgressBar roundCornerProgressBar = RoundCornerProgressBar.EXIT;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        c(new char[]{45857, 53980, 39686, 34745, 30396, 63840, 24369, 30256, 38153, 10367, 31671, 43487, 46413, 24834, 56823, 64116, 60051, 9706, 8242, 22364}, 20 - TextUtils.getCapsMode("", 0, 0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        d(true, new int[]{181, 1, 137, 0}, new byte[]{0}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        s3Var.IAuthTabCallback(contextOnExtraCallback, roundCornerProgressBar, 0L, sb.toString());
        int i2 = onPostMessage + 33;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(@NotNull String str) {
        writeRaw writerawIAuthTabCallback;
        writeRaw writerawOnWarmupCompleted;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        UserChoiceBillingListener userChoiceBillingListener = UserChoiceBillingListener.onExtraCallback;
        String string = userChoiceBillingListener.onExtraCallback().getString(R.string.security_guard_noti_title_app_fds_detected);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = userChoiceBillingListener.onExtraCallback().getString(R.string.security_guard_noti_message_app_fds_appium_threat_detected);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        trackCheckout trackcheckoutOnNavigationEvent = trackCheckout.Companion.onNavigationEvent();
        Object[] objArr = new Object[1];
        c(new char[]{59314, 29036, 63195, 52841, 30786, 65384, 57022, 45159, 16104, 61358, 61482, 9478, 16104, 61358, 61482, 9478, 9118, 14657, 64693, 42182, 61648, 54260, 24452, 41463, 37229, 22651, 299, 54178, 2366, 59304, 33347, 61634, 54745, 38728, 64882, 25242}, 34 - MotionEvent.axisFromString(""), objArr);
        trackcheckoutOnNavigationEvent.onWarmupCompleted(((String) objArr[0]).intern(), 0, new TossApplicationGuard$.ExternalSyntheticLambda10(string, string2));
        asInterface(userChoiceBillingListener.onExtraCallback());
        Context contextOnExtraCallback = userChoiceBillingListener.onExtraCallback();
        RoundCornerProgressBar roundCornerProgressBar = RoundCornerProgressBar.EXIT;
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        c(new char[]{45857, 53980, 39686, 34745, 30396, 63840, 24369, 30256, 38153, 10367, 31671, 43487, 46413, 24834, 56823, 64116, 60051, 9706, 8242, 22364}, ExpandableListView.getPackedPositionGroup(0L) + 20, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str);
        Object[] objArr3 = new Object[1];
        d(true, new int[]{181, 1, 137, 0}, new byte[]{0}, objArr3);
        sb.append(((String) objArr3[0]).intern());
        IAuthTabCallback(contextOnExtraCallback, roundCornerProgressBar, 5L, sb.toString());
        Activity typedObject = AppStateManager.onExtraCallbackWithResult.readTypedObject();
        Object obj = null;
        if (typedObject != null && (writerawIAuthTabCallback = CommonModule_setScreenAwakeMode.IAuthTabCallback(typedObject, new TossApplicationGuard$.ExternalSyntheticLambda11(string, string2))) != null && (writerawOnWarmupCompleted = writerawIAuthTabCallback.onWarmupCompleted(new TossApplicationGuard$.ExternalSyntheticLambda12(str))) != null) {
            int i2 = writeTypedObject + 27;
            onPostMessage = i2 % 128;
            if (i2 % 2 == 0) {
                IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(writerawOnWarmupCompleted, (String) null, 0, (Object) null);
            } else {
                IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(writerawOnWarmupCompleted, (String) null, 1, (Object) null);
            }
        }
        int i3 = writeTypedObject + 29;
        onPostMessage = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 5;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String string = getStartTimeMillis.Companion.onExtraCallback().IAuthTabCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback()).getString(R.string.security_guard_noti_title_app_fds_detected);
        Intrinsics.checkNotNullExpressionValue(string, "");
        onExtraCallbackWithResult(string, str);
        int i4 = onPostMessage + 1;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        s3 s3Var = (s3) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = onPostMessage + 65;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Context contextIAuthTabCallback = getStartTimeMillis.Companion.onExtraCallback().IAuthTabCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback());
        String string = contextIAuthTabCallback.getString(R.string.security_guard_noti_title_app_fds_detected);
        Intrinsics.checkNotNullExpressionValue(string, "");
        s3Var.onExtraCallbackWithResult(string, s3Var.onWarmupCompleted(contextIAuthTabCallback, str, str2));
        int i4 = onPostMessage + 125;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final Unit onTransact(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onPostMessage + 17;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = onPostMessage + 117;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(String str, String str2, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, true}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(str);
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str2);
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new TossApplicationGuard$.ExternalSyntheticLambda13())}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = onPostMessage + 65;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 37 / 0;
        }
        return unit;
    }

    private final String onWarmupCompleted(Context context, String str, String str2) {
        int i = 2 % 2;
        Object obj = null;
        switch (str.hashCode()) {
            case -1905604340:
                Object[] objArr = new Object[1];
                d(false, new int[]{205, 7, 0, 0}, new byte[]{0, 1, 0, 0, 0, 1, 0}, objArr);
                if (str.equals(((String) objArr[0]).intern())) {
                    String string = context.getString(R.string.security_guard_msg_discord);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    int i2 = onPostMessage + 35;
                    writeTypedObject = i2 % 128;
                    if (i2 % 2 == 0) {
                        return string;
                    }
                    obj.hashCode();
                    throw null;
                }
                break;
            case -1881281466:
                Object[] objArr2 = new Object[1];
                d(true, new int[]{199, 6, 0, 0}, new byte[]{1, 1, 1, 0, 0, 1}, objArr2);
                if (str.equals(((String) objArr2[0]).intern())) {
                    int i3 = writeTypedObject + 111;
                    onPostMessage = i3 % 128;
                    int i4 = i3 % 2;
                    String string2 = context.getString(R.string.security_guard_msg_remote);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    return string2;
                }
                break;
            case -1821113830:
                Object[] objArr3 = new Object[1];
                d(false, new int[]{193, 6, 0, 6}, new byte[]{0, 0, 0, 1, 0, 1}, objArr3);
                if (str.equals(((String) objArr3[0]).intern())) {
                    String string3 = context.getString(R.string.security_guard_msg_threat, str2);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    int i5 = writeTypedObject + 55;
                    onPostMessage = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 83 / 0;
                    }
                    return string3;
                }
                break;
            case -577840895:
                Object[] objArr4 = new Object[1];
                c(new char[]{54745, 38728, 24541, 18883, 24248, 16232, 857, 29925}, 9 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr4);
                if (str.equals(((String) objArr4[0]).intern())) {
                    int i7 = writeTypedObject + 79;
                    onPostMessage = i7 % 128;
                    if (i7 % 2 == 0) {
                        Intrinsics.checkNotNullExpressionValue(context.getString(R.string.security_guard_msg_telegram), "");
                        throw null;
                    }
                    String string4 = context.getString(R.string.security_guard_msg_telegram);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    return string4;
                }
                break;
            case 2521314:
                d(true, new int[]{189, 4, 0, 1}, new byte[]{0, 0, 1, 0}, new Object[1]);
                if (!(!str.equals(((String) r1[0]).intern()))) {
                    String string5 = context.getString(R.string.security_guard_msg_root);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    return string5;
                }
                break;
            case 1552046005:
                Object[] objArr5 = new Object[1];
                d(false, new int[]{182, 7, 0, 4}, new byte[]{1, 0, 1, 1, 0, 0, 1}, objArr5);
                if (str.equals(((String) objArr5[0]).intern())) {
                    String string6 = context.getString(R.string.security_guard_msg_malware);
                    Intrinsics.checkNotNullExpressionValue(string6, "");
                    return string6;
                }
                break;
        }
        String string7 = context.getString(R.string.security_guard_msg_root);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        return string7;
    }

    private static final Unit onWarmupCompleted(String str, String str2, trackEventSynchronously trackeventsynchronously) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 101;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(trackeventsynchronously, "");
        trackeventsynchronously.onExtraCallbackWithResult(str);
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        trackEventSynchronously.onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1173521210, iOnExtraCallbackWithResult, 1173521212, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{trackeventsynchronously, str2}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        trackeventsynchronously.onExtraCallbackWithResult(EventServiceImplExternalSyntheticLambda0.IMPORTANT);
        trackeventsynchronously.onNavigationEvent(5);
        trackeventsynchronously.onWarmupCompleted(NativeCrashReporter.DEFAULT.getPattern());
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 107;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStubProxy(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 75;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            dialogInterface.dismiss();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(String str, String str2, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(str);
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str2);
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new TossApplicationGuard$.ExternalSyntheticLambda9())};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = onPostMessage + 15;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final void extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onPostMessage + 43;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        s3 s3Var = onNavigationEvent;
        Context contextOnExtraCallback = UserChoiceBillingListener.onExtraCallback.onExtraCallback();
        RoundCornerProgressBar roundCornerProgressBar = RoundCornerProgressBar.EXIT;
        Object[] objArr = new Object[1];
        d(true, new int[]{212, 2, 0, 2}, new byte[]{1, 1}, objArr);
        s3Var.IAuthTabCallback(contextOnExtraCallback, roundCornerProgressBar, 0L, ((String) objArr[0]).intern());
        int i4 = onPostMessage + 19;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallbackWithResult(String str, String str2) {
        writeRaw writerawIAuthTabCallback;
        writeRaw writerawOnWarmupCompleted;
        int i = 2 % 2;
        trackCheckout trackcheckoutOnNavigationEvent = trackCheckout.Companion.onNavigationEvent();
        Object[] objArr = new Object[1];
        d(true, new int[]{0, 34, 0, 24}, new byte[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0}, objArr);
        trackcheckoutOnNavigationEvent.onWarmupCompleted(((String) objArr[0]).intern(), 0, new TossApplicationGuard$.ExternalSyntheticLambda2(str, str2));
        UserChoiceBillingListener userChoiceBillingListener = UserChoiceBillingListener.onExtraCallback;
        asInterface(userChoiceBillingListener.onExtraCallback());
        Context contextOnExtraCallback = userChoiceBillingListener.onExtraCallback();
        RoundCornerProgressBar roundCornerProgressBar = RoundCornerProgressBar.EXIT;
        Object[] objArr2 = new Object[1];
        d(true, new int[]{212, 2, 0, 2}, new byte[]{1, 1}, objArr2);
        IAuthTabCallback(contextOnExtraCallback, roundCornerProgressBar, 5L, ((String) objArr2[0]).intern());
        Activity typedObject = AppStateManager.onExtraCallbackWithResult.readTypedObject();
        Object obj = null;
        if (typedObject != null && (writerawIAuthTabCallback = CommonModule_setScreenAwakeMode.IAuthTabCallback(typedObject, new TossApplicationGuard$.ExternalSyntheticLambda3(str, str2))) != null && (writerawOnWarmupCompleted = writerawIAuthTabCallback.onWarmupCompleted(new TossApplicationGuard$.ExternalSyntheticLambda4())) != null) {
            int i2 = writeTypedObject + 65;
            onPostMessage = i2 % 128;
            if (i2 % 2 == 0) {
                IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(writerawOnWarmupCompleted, (String) null, 0, (Object) null);
            } else {
                IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(writerawOnWarmupCompleted, (String) null, 1, (Object) null);
            }
        }
        int i3 = writeTypedObject + 77;
        onPostMessage = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback onextracallback = new Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback(GuardPostTaskWork.class);
        onextracallback.onWarmupCompleted(TopAppBarDefaultsExternalSyntheticLambda2.RUN_AS_NON_EXPEDITED_WORK_REQUEST);
        TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(context).onWarmupCompleted(onextracallback.asBinder());
        int i2 = writeTypedObject + 101;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 52 / 0;
        }
        return null;
    }

    private static final Unit IAuthTabCallbackStub(Context context, trackEventSynchronously trackeventsynchronously) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 75;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(trackeventsynchronously, "");
        trackeventsynchronously.onExtraCallbackWithResult(context.getString(R.string.security_guard_noti_title_app_fds_detected));
        Object[] objArr = {trackeventsynchronously, context.getString(R.string.security_guard_forgery_risk_detected)};
        trackEventSynchronously.onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1173521210, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1173521212, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        trackeventsynchronously.onExtraCallbackWithResult(EventServiceImplExternalSyntheticLambda0.IMPORTANT);
        trackeventsynchronously.onNavigationEvent(5);
        trackeventsynchronously.onWarmupCompleted(NativeCrashReporter.DEFAULT.getPattern());
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 45;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit getInterfaceDescriptor(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 13;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            dialogInterface.dismiss();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Context context = (Context) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(context.getString(R.string.security_guard_noti_title_app_fds_detected));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(context.getString(R.string.security_guard_forgery_risk_detected));
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new TossApplicationGuard$.ExternalSyntheticLambda8())};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = writeTypedObject + 77;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 0 / 0;
        }
        return unit;
    }

    private static final void onTransact(Context context, RoundCornerProgressBar roundCornerProgressBar, String str) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 55;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent.IAuthTabCallback(context, roundCornerProgressBar, 0L, str);
        int i4 = writeTypedObject + 83;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.createFromParcel
    public void onExtraCallbackWithResult(@NotNull Context context, @NotNull RoundCornerProgressBar roundCornerProgressBar, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(roundCornerProgressBar, "");
        Intrinsics.checkNotNullParameter(str, "");
        trackCheckout trackcheckoutOnNavigationEvent = trackCheckout.Companion.onNavigationEvent();
        Object[] objArr = new Object[1];
        d(true, new int[]{0, 34, 0, 24}, new byte[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0}, objArr);
        trackcheckoutOnNavigationEvent.onWarmupCompleted(((String) objArr[0]).intern(), 0, new TossApplicationGuard$.ExternalSyntheticLambda19(context));
        IAuthTabCallback(context, roundCornerProgressBar, 10L, str);
        writeRaw writerawOnWarmupCompleted = CommonModule_setScreenAwakeMode.IAuthTabCallback(context, new TossApplicationGuard$.ExternalSyntheticLambda20(context)).onWarmupCompleted(new TossApplicationGuard$.ExternalSyntheticLambda21(context, roundCornerProgressBar, str));
        Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
        IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(writerawOnWarmupCompleted, (String) null, 1, (Object) null);
        int i2 = onPostMessage + 93;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019c  */
    @Override // o.createFromParcel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallback(@org.jetbrains.annotations.NotNull android.content.Context r24) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.s3.onExtraCallback(android.content.Context):void");
    }

    private final void IAuthTabCallback(int i) {
        Activity typedObject;
        int i2 = 2 % 2;
        long jOnWarmupCompleted = commonTestFlag.onExtraCallback.onWarmupCompleted(zzan.onExtraCallbackWithResult(zzaj.onNavigationEvent().extraCallback(), i), zzaj.onWarmupCompleted().asBinder());
        if (0 <= jOnWarmupCompleted) {
            int i3 = writeTypedObject;
            int i4 = i3 + 19;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            if (jOnWarmupCompleted < 4) {
                int i6 = i3 + 113;
                onPostMessage = i6 % 128;
                int i7 = i6 % 2;
                TextRoundCornerProgressBarSavedState1 smallIconBitmap = addPolicy.getSmallIconBitmap();
                Object[] objArr = new Object[1];
                d(true, new int[]{54, 33, 60, 0}, new byte[]{0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1}, objArr);
                if (System.currentTimeMillis() < smallIconBitmap.onExtraCallback(((String) objArr[0]).intern(), 0L) || (typedObject = AppStateManager.onExtraCallbackWithResult.readTypedObject()) == null) {
                    return;
                }
                maybeUpdateAnimatable.onNavigationEvent(findRes.onExtraCallbackWithResult(), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onExtraCallback(jOnWarmupCompleted, typedObject, null), 2, (Object) null);
            }
        }
    }

    public final int IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 67;
        onPostMessage = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback();
            throw null;
        }
        int iOnExtraCallback = onExtraCallback();
        int i3 = writeTypedObject + 21;
        onPostMessage = i3 % 128;
        if (i3 % 2 != 0) {
            return iOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(Context context, trackEventSynchronously trackeventsynchronously) {
        int i = 2 % 2;
        int i2 = onPostMessage + 41;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(trackeventsynchronously, "");
        trackeventsynchronously.onExtraCallbackWithResult(context.getString(R.string.security_guard_noti_title_app_expired));
        Object[] objArr = {trackeventsynchronously, context.getString(R.string.security_guard_noti_msg_app_expired)};
        trackEventSynchronously.onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1173521210, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1173521212, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        trackeventsynchronously.onExtraCallbackWithResult(EventServiceImplExternalSyntheticLambda0.IMPORTANT);
        trackeventsynchronously.onNavigationEvent(5);
        trackeventsynchronously.onWarmupCompleted(NativeCrashReporter.DEFAULT.getPattern());
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 35;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asInterface(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 59;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = onPostMessage + 27;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(Context context, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(context.getString(R.string.security_guard_noti_title_app_expired));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(context.getString(R.string.security_guard_noti_msg_app_expired));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new TossApplicationGuard$.ExternalSyntheticLambda0())};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = onPostMessage + 23;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final void asBinder(Context context) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 95;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            s3 s3Var = onNavigationEvent;
            RoundCornerProgressBar roundCornerProgressBar = RoundCornerProgressBar.EXIT;
            Object[] objArr = new Object[1];
            c(new char[]{14085, 43634, 53168, 54634, 22882, 31621, 27689, 12086, 45381, 9869, 6559, 36588}, 17 >>> ExpandableListView.getPackedPositionGroup(1L), objArr);
            s3Var.IAuthTabCallback(context, roundCornerProgressBar, 0L, ((String) objArr[0]).intern());
        } else {
            s3 s3Var2 = onNavigationEvent;
            RoundCornerProgressBar roundCornerProgressBar2 = RoundCornerProgressBar.EXIT;
            Object[] objArr2 = new Object[1];
            c(new char[]{14085, 43634, 53168, 54634, 22882, 31621, 27689, 12086, 45381, 9869, 6559, 36588}, ExpandableListView.getPackedPositionGroup(0L) + 12, objArr2);
            s3Var2.IAuthTabCallback(context, roundCornerProgressBar2, 0L, ((String) objArr2[0]).intern());
        }
        int i3 = writeTypedObject + 123;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void onWarmupCompleted(Context context) {
        writeRaw writerawIAuthTabCallback;
        writeRaw writerawOnWarmupCompleted;
        int i = 2 % 2;
        trackCheckout trackcheckoutOnNavigationEvent = trackCheckout.Companion.onNavigationEvent();
        Object[] objArr = new Object[1];
        d(false, new int[]{34, 20, 60, 13}, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1}, objArr);
        trackcheckoutOnNavigationEvent.onWarmupCompleted(((String) objArr[0]).intern(), 0, new TossApplicationGuard$.ExternalSyntheticLambda23(context));
        RoundCornerProgressBar roundCornerProgressBar = RoundCornerProgressBar.EXIT;
        Object[] objArr2 = new Object[1];
        c(new char[]{14085, 43634, 53168, 54634, 22882, 31621, 27689, 12086, 45381, 9869, 6559, 36588}, 11 - ExpandableListView.getPackedPositionChild(0L), objArr2);
        IAuthTabCallback(context, roundCornerProgressBar, 5L, ((String) objArr2[0]).intern());
        Activity typedObject = AppStateManager.onExtraCallbackWithResult.readTypedObject();
        if (typedObject != null && (writerawIAuthTabCallback = CommonModule_setScreenAwakeMode.IAuthTabCallback(typedObject, new TossApplicationGuard$.ExternalSyntheticLambda24(context))) != null && (writerawOnWarmupCompleted = writerawIAuthTabCallback.onWarmupCompleted(new TossApplicationGuard$.ExternalSyntheticLambda25(context))) != null) {
            int i2 = onPostMessage + 97;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(writerawOnWarmupCompleted, (String) null, 1, (Object) null);
        }
        int i4 = onPostMessage + 103;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final Map<String, String> onNavigationEvent(zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onPostMessage + 63;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        c(new char[]{13901, 1280, 31123, 48330, 53957, 21765, 46666, 49101, 42530, 8471, 36768, 62215, 26890, 17939, 58322, 3923}, 15 - (KeyEvent.getMaxKeyCode() >> 16), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), zzadVar.ITrustedWebActivityServiceDefault());
        Object[] objArr2 = new Object[1];
        c(new char[]{47400, 35091, 3407, 3578, 13291, 59726, 19547, 24468, 28998, 62859}, TextUtils.indexOf("", "", 0, 0) + 10, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), zzadVar.onPostMessage());
        Object[] objArr3 = new Object[1];
        d(false, new int[]{106, 20, 0, 11}, new byte[]{1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0}, objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), String.valueOf(zzadVar.onRelationshipValidationResult()));
        Object[] objArr4 = new Object[1];
        c(new char[]{15369, 63913, 45079, 10375, 24718, 58154, 11359, 64158, 3364, 58411, 20563, 45856, 60051, 9706, 56771, 5188, 33284, 7995, 24346, 34511, 29478, 26675}, (ViewConfiguration.getTouchSlop() >> 8) + 21, objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), String.valueOf(zzadVar.ICustomTabsCallbackStub()));
        Object[] objArr5 = new Object[1];
        d(true, new int[]{126, 15, 58, 1}, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0}, objArr5);
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), String.valueOf(zzadVar.ICustomTabsCallbackStubProxy()));
        Object[] objArr6 = new Object[1];
        d(false, new int[]{141, 5, 58, 0}, new byte[]{0, 1, 1, 1, 0}, objArr6);
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), String.valueOf(zzadVar.onActivityLayout()));
        Object[] objArr7 = new Object[1];
        c(new char[]{830, 20710, 46956, 30498, 63049, 29963, 38153, 10367}, Color.green(0) + 8, objArr7);
        Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback(((String) objArr7[0]).intern(), String.valueOf(zzadVar.ICustomTabsCallback_Parcel()));
        Object[] objArr8 = new Object[1];
        c(new char[]{22157, 8179, 7725, 28957, 14085, 43634, 53168, 54634, 57640, 13778}, TextUtils.lastIndexOf("", '0', 0, 0) + 10, objArr8);
        Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback(((String) objArr8[0]).intern(), String.valueOf(zzadVar.MediaBrowserCompatMediaItem()));
        Object[] objArr9 = new Object[1];
        d(true, new int[]{146, 14, 0, 0}, new byte[]{0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0}, objArr9);
        Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback(((String) objArr9[0]).intern(), String.valueOf(zzadVar.AudioAttributesCompatParcelizer()));
        Object[] objArr10 = new Object[1];
        d(true, new int[]{160, 21, 160, 0}, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0}, objArr10);
        Map<String, String> mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, pairIAuthTabCallback9, getWrite.IAuthTabCallback(((String) objArr10[0]).intern(), String.valueOf(zzadVar.MediaSessionCompatQueueItem()))});
        int i4 = writeTypedObject + 89;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return mapOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, trackEventSynchronously trackeventsynchronously) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (Unit) onNavigationEvent(getKekid.onExtraCallback(), -794411730, getKekid.onExtraCallback(), iOnExtraCallback, 794411734, getKekid.onExtraCallback(), new Object[]{str, str2, trackeventsynchronously});
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, String str2, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (Unit) onNavigationEvent(getKekid.onExtraCallback(), 1862976388, getKekid.onExtraCallback(), iOnExtraCallback, -1862976385, getKekid.onExtraCallback(), new Object[]{str, str2, commonModule_setLeftEdgeTouchEnabled});
    }

    public static /* synthetic */ Unit IAuthTabCallback(Context context, trackEventSynchronously trackeventsynchronously) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (Unit) onNavigationEvent(getKekid.onExtraCallback(), -250410910, getKekid.onExtraCallback(), iOnExtraCallback, 250410919, getKekid.onExtraCallback(), new Object[]{context, trackeventsynchronously});
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (Unit) onNavigationEvent(getKekid.onExtraCallback(), -105138963, getKekid.onExtraCallback(), iOnExtraCallback, 105138976, getKekid.onExtraCallback(), new Object[]{str, str2, commonModule_setLeftEdgeTouchEnabled});
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 asInterface() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onNavigationEvent(getKekid.onExtraCallback(), 1836652621, getKekid.onExtraCallback(), iOnExtraCallback, -1836652609, getKekid.onExtraCallback(), new Object[0]);
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (Unit) onNavigationEvent(getKekid.onExtraCallback(), -2042984034, getKekid.onExtraCallback(), iOnExtraCallback, 2042984044, getKekid.onExtraCallback(), new Object[]{str, str2, commonModule_setLeftEdgeTouchEnabled});
    }

    public static /* synthetic */ Unit IAuthTabCallback(DialogInterface dialogInterface) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (Unit) onNavigationEvent(getKekid.onExtraCallback(), 715246410, getKekid.onExtraCallback(), iOnExtraCallback, -715246410, getKekid.onExtraCallback(), new Object[]{dialogInterface});
    }

    public static /* synthetic */ void IAuthTabCallbackDefault() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        onNavigationEvent(getKekid.onExtraCallback(), 1715963305, getKekid.onExtraCallback(), iOnExtraCallback, -1715963300, getKekid.onExtraCallback(), new Object[0]);
    }

    public static /* synthetic */ s8ExternalSyntheticLambda0 onTransact() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (s8ExternalSyntheticLambda0) onNavigationEvent(getKekid.onExtraCallback(), 1915638133, getKekid.onExtraCallback(), iOnExtraCallback, -1915638131, getKekid.onExtraCallback(), new Object[0]);
    }

    private final s8ExternalSyntheticLambda3 readTypedObject() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (s8ExternalSyntheticLambda3) onNavigationEvent(getKekid.onExtraCallback(), -964640881, getKekid.onExtraCallback(), iOnExtraCallback, 964640892, getKekid.onExtraCallback(), new Object[]{this});
    }

    private static final Unit onExtraCallbackWithResult(String str, String str2, trackEventSynchronously trackeventsynchronously) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (Unit) onNavigationEvent(getKekid.onExtraCallback(), 1761652206, getKekid.onExtraCallback(), iOnExtraCallback, -1761652205, getKekid.onExtraCallback(), new Object[]{str, str2, trackeventsynchronously});
    }

    private static final Unit onTransact(Context context, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (Unit) onNavigationEvent(getKekid.onExtraCallback(), -1022730570, getKekid.onExtraCallback(), iOnExtraCallback, 1022730577, getKekid.onExtraCallback(), new Object[]{context, commonModule_setLeftEdgeTouchEnabled});
    }

    private final void asInterface(Context context) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        onNavigationEvent(getKekid.onExtraCallback(), 1354249208, getKekid.onExtraCallback(), iOnExtraCallback, -1354249202, getKekid.onExtraCallback(), new Object[]{this, context});
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull String str2) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        onNavigationEvent(getKekid.onExtraCallback(), -1660236259, getKekid.onExtraCallback(), iOnExtraCallback, 1660236267, getKekid.onExtraCallback(), new Object[]{this, str, str2});
    }

    static void getInterfaceDescriptor() {
        IAuthTabCallback_Parcel = (char) 39501;
        readTypedObject = (char) 64244;
        extraCallbackWithResult = (char) 25989;
        ICustomTabsCallback = (char) 46432;
        extraCallback = new char[]{27239, 27136, 27139, 27158, 27154, 27163, 27141, 27144, 27138, 27166, 27140, 27164, 27161, 27166, 27142, 27166, 27165, 27146, 27140, 27159, 27162, 27136, 27167, 27136, 27143, 27146, 27138, 27141, 27146, 27138, 27138, 27146, 27167, 27163, 27151, 27329, 27330, 27338, 27330, 27357, 27328, 27332, 27358, 27334, 27335, 27337, 27342, 27339, 27332, 27331, 27332, 27358, 27355, 27336, 27162, 27368, 27364, 27363, 27363, 27368, 27371, 27361, 27366, 27369, 27363, 27362, 27360, 27390, 27371, 27366, 27391, 27367, 27366, 27390, 27364, 27344, 27347, 27370, 27368, 27365, 27369, 27346, 27346, 27374, 27366, 27364, 27372, 27149, 27351, 27360, 27364, 27372, 27364, 27391, 27367, 27374, 27344, 27367, 27363, 27366, 27368, 27345, 27372, 27367, 27366, 27366, 27262, 27177, 27168, 27172, 27173, 27157, 27162, 27170, 27170, 27178, 27173, 27170, 27176, 27168, 27172, 27183, 27177, 27174, 27178, 27154, 27137, 27345, 27370, 27371, 27371, 27366, 27371, 27352, 27354, 27344, 27372, 27375, 27349, 27370, 27366, 27137, 27344, 27347, 27371, 27366, 27260, 27174, 27172, 27169, 27157, 27165, 27170, 27194, 27196, 27173, 27173, 27157, 27152, 27168, 27340, 27466, 27456, 27485, 27459, 27458, 27320, 27322, 27460, 27461, 27462, 27465, 27456, 27461, 27469, 27322, 27325, 27469, 27312, 27467, 27456, 27159, 27237, 27138, 27143, 27141, 27143, 27145, 27144, 27239, 27165, 27167, 27137, 27236, 27136, 27139, 27141, 27149, 27140, 27244, 27138, 27167, 27136, 27143, 27141, 27244, 27144, 27136, 27141, 27143, 27166, 27141, 27245, 27139};
    }
}
