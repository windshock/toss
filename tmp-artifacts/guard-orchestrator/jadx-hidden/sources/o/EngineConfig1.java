package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.payment.ui.autopay.R;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.global.features.kyc.model.GlobalKycAccessControl;
import im.toss.global.features.kyc.test.GlobalKycTestActivityKt$GlobalKycTestScreen$1$1$1$1$1$;
import im.toss.global.features.kyc.test.GlobalKycTestActivityKt$GlobalKycTestScreen$3$6$1$1$1$;
import im.toss.global.features.kyc.test.GlobalKycTestViewModel;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.base.UIKitBaseActivity;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.TimeoutCompanionNONE1;
import o.WebSocketFactory;
import o._string;
import o.onTooManyRedirects;
import o.s3;
import o.s3c;

/* loaded from: classes.dex */
public final class EngineConfig1 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 4882;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 23402;
    private static char onNavigationEvent = 21935;
    private static char onWarmupCompleted = 17172;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        GlobalKycTestViewModel globalKycTestViewModel = (GlobalKycTestViewModel) objArr[0];
        UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallback = extraCallback(globalKycTestViewModel, uIKitBaseActivity);
        int i4 = onExtraCallback + 115;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unitExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(GlobalKycTestViewModel globalKycTestViewModel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(globalKycTestViewModel);
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        int i5 = onExtraCallback + 109;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(GlobalKycTestViewModel globalKycTestViewModel, UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(globalKycTestViewModel, uIKitBaseActivity);
        int i4 = onExtraCallback + 23;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public static final /* synthetic */ void IAuthTabCallback(UIKitBaseActivity uIKitBaseActivity, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(uIKitBaseActivity, str);
        int i4 = onExtraCallback + 41;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getInterceptor getinterceptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((getSupportedHighSpeedResolutionsFor<getInterceptor>) getsupportedhighspeedresolutionsfor, getinterceptor);
        int i4 = onExtraCallback + 113;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(postHandle posthandle, AppSetIdAndScope1 appSetIdAndScope1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, GlobalKycTestViewModel globalKycTestViewModel, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 3;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(posthandle, appSetIdAndScope1, quirksExternalSyntheticBackport0, globalKycTestViewModel, cameraCaptureResultEmptyCameraCaptureResult, i, i2);
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = onExtraCallback + 27;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(GlobalKycTestViewModel globalKycTestViewModel, UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(globalKycTestViewModel, uIKitBaseActivity);
        int i4 = onExtraCallback + 19;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess000;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        AppSetIdAndScope1 appSetIdAndScope1 = (AppSetIdAndScope1) objArr[0];
        UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[1];
        onTooManyRedirects.onWarmupCompleted.onNavigationEvent onnavigationevent = (onTooManyRedirects.onWarmupCompleted.onNavigationEvent) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(appSetIdAndScope1, uIKitBaseActivity, onnavigationevent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(appSetIdAndScope1, uIKitBaseActivity, onnavigationevent);
        int i3 = onExtraCallback + 77;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 94 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit asBinder(GlobalKycTestViewModel globalKycTestViewModel, UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return writeTypedObject(globalKycTestViewModel, uIKitBaseActivity);
        }
        writeTypedObject(globalKycTestViewModel, uIKitBaseActivity);
        throw null;
    }

    public static /* synthetic */ Unit asInterface(GlobalKycTestViewModel globalKycTestViewModel, UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback = ICustomTabsCallback(globalKycTestViewModel, uIKitBaseActivity);
        int i4 = onExtraCallback + 7;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(GlobalKycTestViewModel globalKycTestViewModel) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(globalKycTestViewModel);
        int i4 = IAuthTabCallbackStub + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(GlobalKycTestViewModel globalKycTestViewModel, UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(globalKycTestViewModel, uIKitBaseActivity);
        int i4 = IAuthTabCallbackStub + 15;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(UIKitBaseActivity uIKitBaseActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, findResAndMsg findresandmsg, postHandle posthandle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(uIKitBaseActivity, getsupportedhighspeedresolutionsfor, findresandmsg, posthandle);
        int i4 = onExtraCallback + 5;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(UIKitBaseActivity uIKitBaseActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, findResAndMsg findresandmsg, postHandle posthandle, Context context, ICustomTabsServiceDefault iCustomTabsServiceDefault) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(uIKitBaseActivity, getsupportedhighspeedresolutionsfor, findresandmsg, posthandle, context, iCustomTabsServiceDefault);
        int i4 = IAuthTabCallbackStub + 29;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 47;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallback(getsupportedhighspeedresolutionsfor, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutionsfor, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackStub + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(postHandle posthandle, AppSetIdAndScope1 appSetIdAndScope1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, GlobalKycTestViewModel globalKycTestViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 109;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(posthandle, appSetIdAndScope1, quirksExternalSyntheticBackport0, globalKycTestViewModel, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 29;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i) | i5 | i3);
        int i8 = ~((~i5) | i);
        int i9 = ~i3;
        int i10 = i8 | (~(i9 | i));
        int i11 = ~(i9 | i5);
        int i12 = i + i5 + i6 + ((-1568348280) * i4) + (1617068012 * i2);
        int i13 = i12 * i12;
        int i14 = (((-430874860) * i) - 739508224) + (1544986862 * i5) + (i7 * 987930861) + ((-987930861) * i10) + (987930861 * i11) + (557056000 * i6) + ((-1885339648) * i4) + (1743781888 * i2) + (858456064 * i13);
        int i15 = (i * (-973781596)) + 539565670 + (i5 * (-973779706)) + (i7 * 945) + (i10 * (-945)) + (i11 * 945) + (i6 * (-973780651)) + (i4 * 424585256) + (i2 * 537576796) + (i13 * 1078394880);
        switch (i14 + (i15 * i15 * 192741376)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return asBinder(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        postHandle posthandle = (postHandle) objArr[0];
        AppSetIdAndScope1 appSetIdAndScope1 = (AppSetIdAndScope1) objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        GlobalKycTestViewModel globalKycTestViewModel = (GlobalKycTestViewModel) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        IAuthTabCallbackStub = i2 % 128;
        onExtraCallbackWithResult(posthandle, appSetIdAndScope1, quirksExternalSyntheticBackport0, globalKycTestViewModel, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(GlobalKycTestViewModel globalKycTestViewModel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(globalKycTestViewModel);
        int i4 = IAuthTabCallbackStub + 119;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(GlobalKycTestViewModel globalKycTestViewModel, UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return access100(globalKycTestViewModel, uIKitBaseActivity);
        }
        access100(globalKycTestViewModel, uIKitBaseActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(UIKitBaseActivity uIKitBaseActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, findResAndMsg findresandmsg, postHandle posthandle, AppSetIdAndScope1 appSetIdAndScope1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(uIKitBaseActivity, getsupportedhighspeedresolutionsfor, findresandmsg, posthandle, appSetIdAndScope1);
        int i4 = IAuthTabCallbackStub + 11;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(findResAndMsg findresandmsg, v1 v1Var, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getInterceptor getinterceptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(findresandmsg, v1Var, getsupportedhighspeedresolutionsfor, getinterceptor);
        int i4 = IAuthTabCallbackStub + 29;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(GlobalKycTestViewModel globalKycTestViewModel) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact(globalKycTestViewModel);
        }
        onTransact(globalKycTestViewModel);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(GlobalKycTestViewModel globalKycTestViewModel, UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(globalKycTestViewModel, uIKitBaseActivity);
        int i4 = IAuthTabCallbackStub + 79;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onNavigationEvent(UIKitBaseActivity uIKitBaseActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, findResAndMsg findresandmsg, postHandle posthandle, AppSetIdAndScope1 appSetIdAndScope1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(uIKitBaseActivity, getsupportedhighspeedresolutionsfor, findresandmsg, posthandle, appSetIdAndScope1);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(uIKitBaseActivity, getsupportedhighspeedresolutionsfor, findresandmsg, posthandle, appSetIdAndScope1);
        int i3 = IAuthTabCallbackStub + 117;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[0];
        onTooManyRedirects.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (onTooManyRedirects.onExtraCallbackWithResult.onNavigationEvent) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(uIKitBaseActivity, onnavigationevent);
        int i4 = IAuthTabCallbackStub + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(GlobalKycTestViewModel globalKycTestViewModel, UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(globalKycTestViewModel, uIKitBaseActivity);
        int i4 = IAuthTabCallbackStub + 5;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback_Parcel;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(findResAndMsg findresandmsg, v1 v1Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(findresandmsg, v1Var);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(findresandmsg, v1Var);
        int i3 = IAuthTabCallbackStub + 21;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                int i5 = $11 + 73;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                char C = AppNode5.C(c, (c2 + i3) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L))), c2 >>> 5, IAuthTabCallback);
                cArr3[1] = C;
                cArr3[0] = AppNode5.C(cArr3[0], (C + i3) ^ ((C << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L))), C >>> 5, onExtraCallbackWithResult);
                i3 -= 40503;
                i4++;
                int i7 = $10 + 45;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            s3c.asBinder.B(defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1);
            int i9 = $10 + 125;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[1];
        onTooManyRedirects.onWarmupCompleted.onNavigationEvent onnavigationevent = (onTooManyRedirects.onWarmupCompleted.onNavigationEvent) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Objects.toString(onnavigationevent);
        onExtraCallbackWithResult(uIKitBaseActivity, "result: " + onnavigationevent);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(UIKitBaseActivity uIKitBaseActivity, onTooManyRedirects.onExtraCallbackWithResult.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        onExtraCallbackWithResult(uIKitBaseActivity, "result: " + onnavigationevent);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onNavigationEvent.class);
        final /* synthetic */ Context $context;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 $lifecycleOwner;
        final /* synthetic */ GlobalKycTestViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, GlobalKycTestViewModel globalKycTestViewModel, Context context, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$lifecycleOwner = textFieldScrollKtExternalSyntheticLambda0;
            this.$viewModel = globalKycTestViewModel;
            this.$context = context;
        }

        public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
            int i7 = ~(i6 | i3 | i2);
            int i8 = ~i3;
            int i9 = (~(i8 | i2)) | (~((~i2) | i6));
            int i10 = (~(i2 | (~i6))) | i8;
            int i11 = i6 + i3 + i5 + ((-2044576983) * i) + (1743660113 * i4);
            int i12 = i11 * i11;
            int i13 = ((1047202342 * i6) - 713031680) + (164951516 * i3) + (i7 * 441125413) + (441125413 * i9) + ((-441125413) * i10) + (606076928 * i5) + (689963008 * i) + ((-299892736) * i4) + ((-1081737216) * i12);
            int i14 = ((i6 * 2048727874) - 782056376) + (i3 * 2048728756) + (i7 * (-441)) + (i9 * (-441)) + (i10 * 441) + (i5 * 2048728315) + (i * 2142076211) + (i4 * (-1448904853)) + (i12 * 1885470720);
            int i15 = i13 + (i14 * i14 * (-1618345984));
            return i15 != 1 ? i15 != 2 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
            access13800<?> access13800Var = (access13800) objArr[2];
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5391);
            int i3 = i2 & iOnWarmupCompleted;
            int i4 = ((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 28) & 1;
            Object obj = null;
            onNavigationEvent onnavigationeventCreate = onnavigationevent.create(findresandmsg, access13800Var);
            if (i4 != 0) {
                onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            int i5 = onExtraCallbackWithResult;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1348);
            int i6 = (~iOnWarmupCompleted2) & i5;
            int i7 = (~i5) & iOnWarmupCompleted2;
            if (((((i7 & i6) | (i6 ^ i7)) >> 2) & 1) != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            onNavigationEvent onnavigationevent2 = new onNavigationEvent(onnavigationevent.$lifecycleOwner, onnavigationevent.$viewModel, onnavigationevent.$context, (access13800) objArr[2]);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1823);
            return onnavigationevent2;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2457);
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1725);
            return objIAuthTabCallback;
        }

        /* renamed from: o.EngineConfig1$onNavigationEvent$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static final byte[] $$a;
            final /* synthetic */ Context $context;
            final /* synthetic */ GlobalKycTestViewModel $viewModel;
            int label;
            static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AnonymousClass4.class);
            private static final int $$b = 234;

            private static String $$c(int i, short s, int i2) {
                byte[] bArr = $$a;
                int i3 = i2 * 2;
                int i4 = (i * 2) + 102;
                int i5 = 3 - (s * 4);
                byte[] bArr2 = new byte[i3 + 11];
                int i6 = i3 + 10;
                int i7 = -1;
                if (bArr == null) {
                    i4 = i4 + i5 + 2;
                    i5 = i5;
                    i7 = -1;
                }
                while (true) {
                    int i8 = i7 + 1;
                    int i9 = i5 + 1;
                    bArr2[i8] = (byte) i4;
                    if (i8 == i6) {
                        return new String(bArr2, 0);
                    }
                    i4 = i4 + bArr[i9] + 2;
                    i5 = i9;
                    i7 = i8;
                }
            }

            static {
                byte[] bArr = {86, 117, -27, 75, 1, 3, -12, -26, 27, -9, 14, -19, 15, 5};
                $$a = bArr;
                ClassLoader parent = AnonymousClass4.class.getClassLoader().getParent();
                try {
                    byte b = (byte) (bArr[4] - 1);
                    byte b2 = b;
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(GlobalKycTestViewModel globalKycTestViewModel, Context context, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.$viewModel = globalKycTestViewModel;
                this.$context = context;
            }

            private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) objArr[0];
                Object obj = objArr[1];
                int i = 2 % 2;
                AnonymousClass4 anonymousClass42 = new AnonymousClass4(anonymousClass4.$viewModel, anonymousClass4.$context, (access13800) objArr[2]);
                int i2 = onExtraCallback;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3939);
                int i3 = i2 & iOnWarmupCompleted;
                if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 29) & 1) == 0) {
                    return anonymousClass42;
                }
                throw null;
            }

            public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
                int i7 = ~i3;
                int i8 = ~i5;
                int i9 = ~(i7 | i8);
                int i10 = i7 | i2;
                int i11 = (~i10) | i9;
                int i12 = ~i2;
                int i13 = (~(i5 | i10)) | (~(i8 | i12)) | (~(i12 | i3));
                int i14 = i3 + i2 + i6 + ((-1017789379) * i) + (461141949 * i4);
                int i15 = i14 * i14;
                int i16 = ((-551480932) * i3) + 431816704 + ((-1613042074) * i2) + ((-1061561142) * i11) + (i13 * (-1616703077)) + ((-1616703077) * i9) + (1065222144 * i6) + ((-1727660032) * i) + (1912995840 * i4) + ((-1005256704) * i15);
                int i17 = ((i3 * (-1063000396)) - 360994079) + (i2 * (-1063001374)) + (i11 * (-978)) + (i13 * 489) + (i9 * 489) + (i6 * (-1063000885)) + (i * (-90181537)) + (i4 * (-1548859681)) + (i15 * 816250880);
                int i18 = i16 + (i17 * i17 * 1493368832);
                return i18 != 1 ? i18 != 2 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr);
            }

            private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) objArr[0];
                findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
                access13800<?> access13800Var = (access13800) objArr[2];
                int i = 2 % 2;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2106);
                Object objInvokeSuspend = anonymousClass4.create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4560);
                return objInvokeSuspend;
            }

            public static native char t(int i);

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5837);
                Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2947);
                return objOnExtraCallback;
            }

            /* renamed from: o.EngineConfig1$onNavigationEvent$4$5, reason: invalid class name */
            static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AnonymousClass5.class);
                final /* synthetic */ Context $context;
                final /* synthetic */ GlobalKycTestViewModel $viewModel;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(GlobalKycTestViewModel globalKycTestViewModel, Context context, access13800<? super AnonymousClass5> access13800Var) {
                    super(2, access13800Var);
                    this.$viewModel = globalKycTestViewModel;
                    this.$context = context;
                }

                private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
                    AnonymousClass5 anonymousClass5 = (AnonymousClass5) objArr[0];
                    Object obj = objArr[1];
                    int i = 2 % 2;
                    AnonymousClass5 anonymousClass52 = new AnonymousClass5(anonymousClass5.$viewModel, anonymousClass5.$context, (access13800) objArr[2]);
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4403);
                    return anonymousClass52;
                }

                public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
                    int i7 = ~i6;
                    int i8 = ~i4;
                    int i9 = i3 | i7 | i8;
                    int i10 = ~(i4 | i7);
                    int i11 = (~(i7 | i8)) | (~i3);
                    int i12 = i3 + i6 + i2 + ((-1537480081) * i) + ((-1176924877) * i5);
                    int i13 = i12 * i12;
                    int i14 = (((-324914750) * i3) - 1179058176) + ((-1443770816) * i6) + (1588055615 * i9) + (i10 * (-1588055615)) + ((-1588055615) * i11) + (1263140864 * i2) + (1226178560 * i) + ((-1044512768) * i5) + (1201733632 * i13);
                    int i15 = (i3 * 1018573086) + 1206756779 + (i6 * 1018572224) + (i9 * (-431)) + (i10 * 431) + (i11 * 431) + (i2 * 1018572655) + (i * (-758184159)) + (i5 * (-595421667)) + (i13 * (-1647378432));
                    int i16 = i14 + (i15 * i15 * 1518272512);
                    return i16 != 1 ? i16 != 2 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
                }

                private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
                    AnonymousClass5 anonymousClass5 = (AnonymousClass5) objArr[0];
                    findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
                    access13800<?> access13800Var = (access13800) objArr[2];
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted;
                    int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(601);
                    int i3 = ((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 16) & 1;
                    Object obj = null;
                    AnonymousClass5 anonymousClass5Create = anonymousClass5.create(findresandmsg, access13800Var);
                    if (i3 != 0) {
                        Unit unit = Unit.INSTANCE;
                        throw null;
                    }
                    Unit unit2 = Unit.INSTANCE;
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3181);
                    Object objInvokeSuspend = anonymousClass5Create.invokeSuspend(unit2);
                    int i4 = onWarmupCompleted;
                    int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(832);
                    int i5 = i4 & iOnWarmupCompleted2;
                    if ((((i4 ^ iOnWarmupCompleted2) | i5) & (~i5) & 1) == 0) {
                        return objInvokeSuspend;
                    }
                    obj.hashCode();
                    throw null;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted;
                    int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2457);
                    int i3 = i2 & iOnWarmupCompleted;
                    findResAndMsg findresandmsg = (findResAndMsg) obj;
                    access13800<? super Unit> access13800Var = (access13800) obj2;
                    if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 3) & 1) == 0) {
                        onNavigationEvent(findresandmsg, access13800Var);
                        throw null;
                    }
                    Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                    int i4 = onWarmupCompleted;
                    int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3068);
                    if (((((i4 | iOnWarmupCompleted2) & (~(i4 & iOnWarmupCompleted2))) >> 14) & 1) != 0) {
                        int i5 = 76 / 0;
                    }
                    return objOnNavigationEvent;
                }

                private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
                    Object objCollect;
                    AnonymousClass5 anonymousClass5 = (AnonymousClass5) objArr[0];
                    Object obj = objArr[1];
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted;
                    int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3949);
                    int i3 = ((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 29) & 1;
                    Object obj2 = null;
                    if (i3 != 0) {
                        access14300.onWarmupCompleted();
                        int i4 = anonymousClass5.label;
                        obj2.hashCode();
                        throw null;
                    }
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i5 = anonymousClass5.label;
                    if (i5 != 0) {
                        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(126);
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = onWarmupCompleted;
                        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(884);
                        int i7 = i6 & iOnWarmupCompleted2;
                        if ((((i6 ^ iOnWarmupCompleted2) | i7) & (~i7) & 1) == 0) {
                            ResultKt.onNavigationEvent(obj);
                            obj2.hashCode();
                            throw null;
                        }
                        ResultKt.onNavigationEvent(obj);
                        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5931);
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        Object[] objArr2 = {anonymousClass5.$viewModel};
                        IAnimation iAnimation = (IAnimation) GlobalKycTestViewModel.onNavigationEvent(1402261803, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1402261787, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr2, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
                        final Context context = anonymousClass5.$context;
                        setRipple setripple = new setRipple() { // from class: o.EngineConfig1.onNavigationEvent.4.5.2
                            private static int $10 = 0;
                            private static int $11 = 1;
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallback = 1;
                            private static long onExtraCallbackWithResult = 8864779389688777017L;

                            public static /* synthetic */ void IAuthTabCallback(DialogInterface dialogInterface, int i8) {
                                int i9 = 2 % 2;
                                int i10 = onExtraCallback + 125;
                                IAuthTabCallback = i10 % 128;
                                int i11 = i10 % 2;
                                onExtraCallbackWithResult(dialogInterface, i8);
                                if (i11 != 0) {
                                    int i12 = 48 / 0;
                                }
                            }

                            private static void a(char[] cArr, int i8, Object[] objArr3) {
                                int i9 = 2 % 2;
                                AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
                                audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i8;
                                int length = cArr.length;
                                long[] jArr = new long[length];
                                audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
                                while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                                    int i10 = $10 + 101;
                                    $11 = i10 % 128;
                                    int i11 = i10 % 2;
                                    jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = s3.onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0) ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                                    SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
                                }
                                char[] cArr2 = new char[length];
                                audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
                                int i12 = $11 + 31;
                                $10 = i12 % 128;
                                if (i12 % 2 != 0) {
                                    int i13 = 4 / 3;
                                }
                                while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                                    SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
                                }
                                objArr3[0] = new String(cArr2);
                            }

                            public /* synthetic */ Object emit(Object obj3, access13800 access13800Var) {
                                int i8 = 2 % 2;
                                int i9 = onExtraCallback + 51;
                                IAuthTabCallback = i9 % 128;
                                String str = (String) obj3;
                                if (i9 % 2 == 0) {
                                    return onExtraCallbackWithResult(str, (access13800<? super Unit>) access13800Var);
                                }
                                onExtraCallbackWithResult(str, (access13800<? super Unit>) access13800Var);
                                throw null;
                            }

                            private static final void onExtraCallbackWithResult(DialogInterface dialogInterface, int i8) {
                                int i9 = 2 % 2;
                                int i10 = IAuthTabCallback + 31;
                                onExtraCallback = i10 % 128;
                                int i11 = i10 % 2;
                                dialogInterface.dismiss();
                                if (i11 == 0) {
                                    int i12 = 76 / 0;
                                }
                                int i13 = IAuthTabCallback + 103;
                                onExtraCallback = i13 % 128;
                                int i14 = i13 % 2;
                            }

                            public final Object onExtraCallbackWithResult(String str, access13800<? super Unit> access13800Var) {
                                int i8 = 2 % 2;
                                TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.Companion.onExtraCallback(context).onExtraCallbackWithResult(str);
                                GlobalKycTestActivityKt$GlobalKycTestScreen$1$1$1$1$1$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new GlobalKycTestActivityKt$GlobalKycTestScreen$1$1$1$1$1$.ExternalSyntheticLambda0();
                                Object[] objArr3 = new Object[1];
                                a(new char[]{55899, 48771}, 30197 - Color.red(0), objArr3);
                                TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallback(onwarmupcompleted, ((String) objArr3[0]).intern(), externalSyntheticLambda0, (TdsButtonV1View.asInterface) null, false, 12, (Object) null).onExtraCallback().show();
                                Unit unit = Unit.INSTANCE;
                                int i9 = onExtraCallback + 71;
                                IAuthTabCallback = i9 % 128;
                                if (i9 % 2 == 0) {
                                    return unit;
                                }
                                throw null;
                            }
                        };
                        int i8 = onWarmupCompleted;
                        int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3949);
                        if (((((iOnWarmupCompleted3 | i8) & (~(i8 & iOnWarmupCompleted3))) >> 19) & 1) == 0) {
                            anonymousClass5.label = 0;
                            objCollect = iAnimation.collect(setripple, anonymousClass5);
                        } else {
                            anonymousClass5.label = 1;
                            objCollect = iAnimation.collect(setripple, anonymousClass5);
                        }
                        int i9 = onWarmupCompleted;
                        int iOnWarmupCompleted4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2727);
                        int i10 = i9 & iOnWarmupCompleted4;
                        if ((((((i9 ^ iOnWarmupCompleted4) | i10) & (~i10)) >> 18) & 1) == 0) {
                            obj2.hashCode();
                            throw null;
                        }
                        if (objCollect == objOnWarmupCompleted) {
                            if ((((onWarmupCompleted ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3558)) >> 9) & 1) == 0) {
                                return objOnWarmupCompleted;
                            }
                            obj2.hashCode();
                            throw null;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    int i11 = onWarmupCompleted;
                    int iOnWarmupCompleted5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3558);
                    if (((((i11 | iOnWarmupCompleted5) & (~(i11 & iOnWarmupCompleted5))) >> 13) & 1) == 0) {
                        int i12 = 23 / 0;
                    }
                    return unit;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
                    int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
                    return (access13800) onExtraCallback(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), iIAuthTabCallback2, 1877507151, iIAuthTabCallback, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -1877507149, new Object[]{this, obj, access13800Var});
                }

                public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                    int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
                    int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
                    return onExtraCallback(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), iIAuthTabCallback2, 804889319, iIAuthTabCallback, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -804889318, new Object[]{this, findresandmsg, access13800Var});
                }

                public final Object invokeSuspend(Object obj) {
                    int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
                    int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
                    return onExtraCallback(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), iIAuthTabCallback2, 488354947, iIAuthTabCallback, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -488354947, new Object[]{this, obj});
                }
            }

            private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) objArr[0];
                Object obj = objArr[1];
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3887);
                int i3 = (~iOnWarmupCompleted) & i2;
                int i4 = (~i2) & iOnWarmupCompleted;
                Object obj2 = null;
                if (((((i4 & i3) | (i3 ^ i4)) >> 8) & 1) != 0) {
                    access14300.onWarmupCompleted();
                    int i5 = anonymousClass4.label;
                    throw null;
                }
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i6 = anonymousClass4.label;
                if (i6 != 0) {
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4780);
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = onExtraCallback;
                    int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5512);
                    if (((((i7 | iOnWarmupCompleted2) & (~(i7 & iOnWarmupCompleted2))) >> 13) & 1) == 0) {
                        ResultKt.onNavigationEvent(obj);
                        obj2.hashCode();
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback().onExtraCallback();
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(anonymousClass4.$viewModel, anonymousClass4.$context, null);
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2434);
                    anonymousClass4.label = 1;
                    if (maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback, anonymousClass5, anonymousClass4) == objOnWarmupCompleted) {
                        int i8 = onExtraCallback;
                        int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2462);
                        int i9 = i8 & iOnWarmupCompleted3;
                        if ((((((i8 ^ iOnWarmupCompleted3) | i9) & (~i9)) >> 5) & 1) == 0) {
                            int i10 = 9 / 0;
                        }
                        return objOnWarmupCompleted;
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i11 = onExtraCallback;
                int iOnWarmupCompleted4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(949);
                int i12 = (~iOnWarmupCompleted4) & i11;
                int i13 = (~i11) & iOnWarmupCompleted4;
                if (((((i13 & i12) | (i12 ^ i13)) >> 31) & 1) != 0) {
                    return unit;
                }
                throw null;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                return (access13800) onExtraCallback(nSetPosition.onExtraCallbackWithResult(), -1421838522, new Object[]{this, obj, access13800Var}, 1421838524, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                return onExtraCallback(nSetPosition.onExtraCallbackWithResult(), -792436573, new Object[]{this, findresandmsg, access13800Var}, 792436573, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
            }

            public final Object invokeSuspend(Object obj) {
                int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                return onExtraCallback(nSetPosition.onExtraCallbackWithResult(), 754396591, new Object[]{this, obj}, -754396590, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
        
            if (androidx.lifecycle.RepeatOnLifecycleKt.onExtraCallback(r11, r4, r6, r1) == r3) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
        
            if (androidx.lifecycle.RepeatOnLifecycleKt.onExtraCallback(r11, r4, r6, r1) == r3) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
        
            o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5109);
            r11 = o.EngineConfig1.onNavigationEvent.onExtraCallbackWithResult;
            r0 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1823);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
        
            if (((((r11 | r0) & (~(r11 & r0))) >> 9) & 1) == 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
        
            r9.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
        
            throw null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ java.lang.Object onWarmupCompleted(java.lang.Object[] r11) {
            /*
                r0 = 0
                r1 = r11[r0]
                o.EngineConfig1$onNavigationEvent r1 = (o.EngineConfig1.onNavigationEvent) r1
                r2 = 1
                r11 = r11[r2]
                r3 = r11
                java.lang.Object r3 = (java.lang.Object) r3
                r3 = 2
                int r3 = r3 % r3
                r3 = 18
                o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r3)
                java.lang.Object r3 = o.access14300.onWarmupCompleted()
                int r4 = r1.label
                r5 = 5720(0x1658, float:8.015E-42)
                if (r4 == 0) goto L37
                o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r5)
                if (r4 != r2) goto L2f
                r1 = 3792(0xed0, float:5.314E-42)
                o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r1)
                kotlin.ResultKt.onNavigationEvent(r11)
                r11 = 1495(0x5d7, float:2.095E-42)
                o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r11)
                goto L87
            L2f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L37:
                kotlin.ResultKt.onNavigationEvent(r11)
                o.TextFieldScrollKtExternalSyntheticLambda0 r11 = r1.$lifecycleOwner
                o.TextFieldKeyInputExternalSyntheticLambda9$onExtraCallback r4 = o.TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED
                o.EngineConfig1$onNavigationEvent$4 r6 = new o.EngineConfig1$onNavigationEvent$4
                im.toss.global.features.kyc.test.GlobalKycTestViewModel r7 = r1.$viewModel
                android.content.Context r8 = r1.$context
                r9 = 0
                r6.<init>(r7, r8, r9)
                int r7 = o.EngineConfig1.onNavigationEvent.onExtraCallbackWithResult
                r8 = 3068(0xbfc, float:4.299E-42)
                int r8 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r8)
                r10 = r7 & r8
                int r10 = ~r10
                r7 = r7 | r8
                r7 = r7 & r10
                int r7 = r7 >> 21
                r7 = r7 & r2
                if (r7 != 0) goto L63
                r1.label = r2
                java.lang.Object r11 = androidx.lifecycle.RepeatOnLifecycleKt.onExtraCallback(r11, r4, r6, r1)
                if (r11 != r3) goto L87
                goto L6b
            L63:
                r1.label = r2
                java.lang.Object r11 = androidx.lifecycle.RepeatOnLifecycleKt.onExtraCallback(r11, r4, r6, r1)
                if (r11 != r3) goto L87
            L6b:
                r11 = 5109(0x13f5, float:7.159E-42)
                o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r11)
                int r11 = o.EngineConfig1.onNavigationEvent.onExtraCallbackWithResult
                r0 = 1823(0x71f, float:2.555E-42)
                int r0 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r0)
                r1 = r11 & r0
                int r1 = ~r1
                r11 = r11 | r0
                r11 = r11 & r1
                int r11 = r11 >> 9
                r11 = r11 & r2
                if (r11 == 0) goto L83
                return r3
            L83:
                r9.hashCode()
                throw r9
            L87:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                int r1 = o.EngineConfig1.onNavigationEvent.onExtraCallbackWithResult
                int r3 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r5)
                int r4 = ~r3
                r4 = r4 & r1
                int r1 = ~r1
                r1 = r1 & r3
                r3 = r4 ^ r1
                r1 = r1 & r4
                r1 = r1 | r3
                r1 = r1 & r2
                if (r1 != 0) goto L9d
                r1 = 14
                int r1 = r1 / r0
            L9d:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o.EngineConfig1.onNavigationEvent.onWarmupCompleted(java.lang.Object[]):java.lang.Object");
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            return (access13800) IAuthTabCallback(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, 695753335, _string.onNavigationEvent.IAuthTabCallback(), new Object[]{this, obj, access13800Var}, iIAuthTabCallback2, -695753335);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            return IAuthTabCallback(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, -631071953, _string.onNavigationEvent.IAuthTabCallback(), new Object[]{this, findresandmsg, access13800Var}, iIAuthTabCallback2, 631071954);
        }

        public final Object invokeSuspend(Object obj) {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            return IAuthTabCallback(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, 107797923, _string.onNavigationEvent.IAuthTabCallback(), new Object[]{this, obj}, iIAuthTabCallback2, -107797921);
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(IAuthTabCallback.class);
        final /* synthetic */ getInterceptor $funnelInfo;
        final /* synthetic */ v1 $funnelSelectionBottomSheetState;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<getInterceptor> $selectedFunnelInfo$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(getInterceptor getinterceptor, v1 v1Var, getSupportedHighSpeedResolutionsFor<getInterceptor> getsupportedhighspeedresolutionsfor, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$funnelInfo = getinterceptor;
            this.$funnelSelectionBottomSheetState = v1Var;
            this.$selectedFunnelInfo$delegate = getsupportedhighspeedresolutionsfor;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
            findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
            access13800<?> access13800Var = (access13800) objArr[2];
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3487);
            Object objInvokeSuspend = iAuthTabCallback.create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i2 = onWarmupCompleted;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(283);
            int i3 = (~iOnWarmupCompleted) & i2;
            int i4 = (~i2) & iOnWarmupCompleted;
            if (((((i4 & i3) | (i3 ^ i4)) >> 1) & 1) == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = ~i5;
            int i8 = i6 | i7 | (~i2);
            int i9 = ~i6;
            int i10 = (~(i2 | i7)) | (~(i7 | i9));
            int i11 = i5 + i6 + i4 + ((-92689393) * i) + (1942122663 * i3);
            int i12 = i11 * i11;
            int i13 = (((-665130586) * i5) - 357761024) + ((-674687396) * i6) + (4778405 * i8) + (i9 * (-4778405)) + ((-4778405) * i10) + ((-669908992) * i4) + ((-1056047104) * i) + ((-742522880) * i3) + ((-592117760) * i12);
            int i14 = (i5 * 1048061654) + 1366922925 + (i6 * 1048062268) + (i8 * (-307)) + (i9 * 307) + (i10 * 307) + (i4 * 1048061961) + (i * 439444615) + (i3 * (-1279783457)) + (i12 * 173867008);
            int i15 = i13 + (i14 * i14 * (-1898250240));
            return i15 != 1 ? i15 != 2 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback2 = new IAuthTabCallback(iAuthTabCallback.$funnelInfo, iAuthTabCallback.$funnelSelectionBottomSheetState, iAuthTabCallback.$selectedFunnelInfo$delegate, (access13800) objArr[2]);
            int i2 = onWarmupCompleted;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3792);
            if (((((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 30) & 1) != 0) {
                int i3 = 82 / 0;
            }
            return iAuthTabCallback2;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1505);
            int i3 = i2 & iOnWarmupCompleted;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 27) & 1) == 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i4 = 26 / 0;
            return objOnExtraCallback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0097, code lost:
        
            if (r9 == r3) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
        
            if (o.v1.onExtraCallback(r9, (o.x1) null, r1, r5, (java.lang.Object) null) == r3) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
        
            r9 = o.EngineConfig1.IAuthTabCallback.onWarmupCompleted;
            r0 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1348);
            r1 = r9 & r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
        
            if ((((((r9 ^ r0) | r1) & (~r1)) >> 15) & 1) == 0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
        
            throw null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ java.lang.Object onExtraCallback(java.lang.Object[] r9) {
            /*
                Method dump skipped, instructions count: 214
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.EngineConfig1.IAuthTabCallback.onExtraCallback(java.lang.Object[]):java.lang.Object");
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            return (access13800) onNavigationEvent(WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{this, obj, access13800Var}, iIAuthTabCallback2, 1698434152, -1698434152);
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            return onNavigationEvent(WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{this, findresandmsg, access13800Var}, iIAuthTabCallback2, -27053432, 27053434);
        }

        public final Object invokeSuspend(Object obj) {
            int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            return onNavigationEvent(WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{this, obj}, iIAuthTabCallback2, 605592532, -605592531);
        }
    }

    private static final Unit onNavigationEvent(findResAndMsg findresandmsg, v1 v1Var, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getInterceptor getinterceptor) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getinterceptor, "");
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(getinterceptor, v1Var, getsupportedhighspeedresolutionsfor, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 45;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 0 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(o.getSupportedHighSpeedResolutionsFor r6, o.w5a r7, o.CameraCaptureResultEmptyCameraCaptureResult r8, int r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            r1 = r9 & 6
            r2 = 0
            if (r1 != 0) goto L2c
            int r1 = o.EngineConfig1.onExtraCallback
            int r1 = r1 + 81
            int r3 = r1 % 128
            o.EngineConfig1.IAuthTabCallbackStub = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L22
            boolean r1 = r8.onNavigationEvent(r7)
            r3 = 17
            int r3 = r3 / r2
            if (r1 == 0) goto L2a
            goto L28
        L22:
            boolean r1 = r8.onNavigationEvent(r7)
            if (r1 == 0) goto L2a
        L28:
            r1 = 4
            goto L2b
        L2a:
            r1 = r0
        L2b:
            r9 = r9 | r1
        L2c:
            r1 = r9 & 19
            r3 = 18
            if (r1 == r3) goto L34
            r2 = 1
            goto L3d
        L34:
            int r1 = o.EngineConfig1.onExtraCallback
            int r1 = r1 + 121
            int r3 = r1 % 128
            o.EngineConfig1.IAuthTabCallbackStub = r3
            int r1 = r1 % r0
        L3d:
            r1 = r9 & 1
            boolean r1 = r8.onWarmupCompleted(r2, r1)
            if (r1 == 0) goto La3
            int r1 = o.EngineConfig1.IAuthTabCallbackStub
            int r1 = r1 + 79
            int r2 = r1 % 128
            o.EngineConfig1.onExtraCallback = r2
            int r1 = r1 % r0
            boolean r1 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r1 == 0) goto L66
            r1 = -1
            java.lang.String r2 = "im.toss.global.features.kyc.test.GlobalKycTestScreen.<anonymous>.<anonymous> (GlobalKycTestActivity.kt:173)"
            r3 = 345715427(0x149b32e3, float:1.5671072E-26)
            o.CameraConfigExternalSyntheticLambda0.IAuthTabCallback(r3, r9, r1, r2)
            int r1 = o.EngineConfig1.onExtraCallback
            int r1 = r1 + 19
            int r2 = r1 % 128
            o.EngineConfig1.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
        L66:
            o.getInterceptor r0 = onNavigationEvent(r6)
            if (r0 != 0) goto L70
            java.lang.String r6 = "진입할 퍼널을 먼저 선택해주세요."
        L6e:
            r1 = r6
            goto L8e
        L70:
            o.getInterceptor r6 = onNavigationEvent(r6)
            if (r6 == 0) goto L7b
            java.lang.String r6 = r6.name()
            goto L7c
        L7b:
            r6 = 0
        L7c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "선택된 funnel: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            goto L6e
        L8e:
            r2 = 0
            int r6 = r9 << 6
            r4 = r6 & 896(0x380, float:1.256E-42)
            r5 = 2
            r0 = r7
            r3 = r8
            r0.onExtraCallbackWithResult(r1, r2, r3, r4, r5)
            boolean r6 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r6 == 0) goto La6
            o.CameraConfigExternalSyntheticLambda0.onTransact()
            goto La6
        La3:
            r8.ICustomTabsCallbackStubProxy()
        La6:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.EngineConfig1.IAuthTabCallback(o.getSupportedHighSpeedResolutionsFor, o.w5a, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onExtraCallback.class);
        final /* synthetic */ v1 $funnelSelectionBottomSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(v1 v1Var, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$funnelSelectionBottomSheetState = v1Var;
        }

        public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
            int i7 = ~i3;
            int i8 = ~i5;
            int i9 = ~(i7 | i8);
            int i10 = i7 | i2;
            int i11 = (~i10) | i9;
            int i12 = ~i2;
            int i13 = (~(i5 | i10)) | (~(i8 | i12)) | (~(i12 | i3));
            int i14 = i3 + i2 + i4 + ((-1017789379) * i) + (461141949 * i6);
            int i15 = i14 * i14;
            int i16 = ((-551480932) * i3) + 431816704 + ((-1613042074) * i2) + ((-1061561142) * i11) + (i13 * (-1616703077)) + ((-1616703077) * i9) + (1065222144 * i4) + ((-1727660032) * i) + (1912995840 * i6) + ((-1005256704) * i15);
            int i17 = ((i3 * (-1063000396)) - 360994079) + (i2 * (-1063001374)) + (i11 * (-978)) + (i13 * 489) + (i9 * 489) + (i4 * (-1063000885)) + (i * (-90181537)) + (i6 * (-1548859681)) + (i15 * 816250880);
            int i18 = i16 + (i17 * i17 * 1493368832);
            return i18 != 1 ? i18 != 2 ? onExtraCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr);
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            onExtraCallback onextracallback = (onExtraCallback) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            onExtraCallback onextracallback2 = new onExtraCallback(onextracallback.$funnelSelectionBottomSheetState, (access13800) objArr[2]);
            int i2 = IAuthTabCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3679);
            int i3 = (~iOnWarmupCompleted) & i2;
            int i4 = (~i2) & iOnWarmupCompleted;
            if (((((i4 & i3) | (i3 ^ i4)) >> 15) & 1) == 0) {
                return onextracallback2;
            }
            throw null;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            onExtraCallback onextracallback = (onExtraCallback) objArr[0];
            findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
            access13800<?> access13800Var = (access13800) objArr[2];
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5517);
            int i3 = 1 & ((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 7);
            onExtraCallback onextracallbackCreate = onextracallback.create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2336);
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i2 = IAuthTabCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2717);
            int i3 = i2 & iOnWarmupCompleted;
            if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 13) & 1) == 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x005f A[PHI: r3
          0x005f: PHI (r3v13 java.lang.Object) = (r3v11 java.lang.Object), (r3v14 java.lang.Object) binds: [B:8:0x0034, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0036 A[PHI: r4
          0x0036: PHI (r4v4 int) = (r4v3 int), (r4v8 int) binds: [B:8:0x0034, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r6) {
            /*
                r0 = 0
                r1 = r6[r0]
                o.EngineConfig1$onExtraCallback r1 = (o.EngineConfig1.onExtraCallback) r1
                r2 = 1
                r6 = r6[r2]
                r3 = r6
                java.lang.Object r3 = (java.lang.Object) r3
                r3 = 2
                int r3 = r3 % r3
                int r3 = o.EngineConfig1.onExtraCallback.IAuthTabCallback
                r4 = 3684(0xe64, float:5.162E-42)
                int r4 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r4)
                int r5 = ~r4
                r5 = r5 & r3
                int r3 = ~r3
                r3 = r3 & r4
                r4 = r5 ^ r3
                r3 = r3 & r5
                r3 = r3 | r4
                int r3 = r3 >> 26
                r3 = r3 & r2
                if (r3 == 0) goto L2e
                java.lang.Object r3 = o.access14300.onWarmupCompleted()
                int r4 = r1.label
                r5 = 11
                int r5 = r5 / r0
                if (r4 == 0) goto L5f
                goto L36
            L2e:
                java.lang.Object r3 = o.access14300.onWarmupCompleted()
                int r4 = r1.label
                if (r4 == 0) goto L5f
            L36:
                int r0 = o.EngineConfig1.onExtraCallback.IAuthTabCallback
                r1 = 6100(0x17d4, float:8.548E-42)
                int r1 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r1)
                r3 = r0 & r1
                int r5 = ~r3
                r0 = r0 ^ r1
                r0 = r0 | r3
                r0 = r0 & r5
                int r0 = r0 >> 18
                r0 = r0 & r2
                if (r0 != 0) goto L4c
                if (r4 != r2) goto L57
                goto L4e
            L4c:
                if (r4 != r2) goto L57
            L4e:
                kotlin.ResultKt.onNavigationEvent(r6)
                r6 = 3558(0xde6, float:4.986E-42)
                o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r6)
                goto L8c
            L57:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L5f:
                kotlin.ResultKt.onNavigationEvent(r6)
                o.v1 r6 = r1.$funnelSelectionBottomSheetState
                r1.label = r2
                int r0 = o.EngineConfig1.onExtraCallback.IAuthTabCallback
                r4 = 1212(0x4bc, float:1.698E-42)
                int r4 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r4)
                int r5 = ~r4
                r5 = r5 & r0
                int r0 = ~r0
                r0 = r0 & r4
                r0 = r0 | r5
                int r0 = r0 >> 16
                r0 = r0 & r2
                r4 = 0
                if (r0 == 0) goto L80
                java.lang.Object r6 = o.v1.IAuthTabCallback(r6, r4, r1, r2, r4)
                if (r6 != r3) goto L8c
                goto L86
            L80:
                java.lang.Object r6 = o.v1.IAuthTabCallback(r6, r4, r1, r2, r4)
                if (r6 != r3) goto L8c
            L86:
                r6 = 4267(0x10ab, float:5.98E-42)
                o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r6)
                return r3
            L8c:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                r0 = 1654(0x676, float:2.318E-42)
                o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.EngineConfig1.onExtraCallback.onNavigationEvent(java.lang.Object[]):java.lang.Object");
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            return (access13800) IAuthTabCallback(setVisitUrl.onExtraCallbackWithResult(), 1247530417, -1247530417, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this, obj, access13800Var}, setVisitUrl.onExtraCallbackWithResult());
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            return IAuthTabCallback(setVisitUrl.onExtraCallbackWithResult(), -1591847228, 1591847230, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this, findresandmsg, access13800Var}, setVisitUrl.onExtraCallbackWithResult());
        }

        public final Object invokeSuspend(Object obj) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            return IAuthTabCallback(setVisitUrl.onExtraCallbackWithResult(), 1755281061, -1755281060, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this, obj}, setVisitUrl.onExtraCallbackWithResult());
        }
    }

    private static final Unit onNavigationEvent(findResAndMsg findresandmsg, v1 v1Var) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(v1Var, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onWarmupCompleted.class);
        final /* synthetic */ UIKitBaseActivity $activity;
        final /* synthetic */ getInterceptor $funnelInfo;
        final /* synthetic */ postHandle $globalKycLauncher;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(postHandle posthandle, getInterceptor getinterceptor, UIKitBaseActivity uIKitBaseActivity, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$globalKycLauncher = posthandle;
            this.$funnelInfo = getinterceptor;
            this.$activity = uIKitBaseActivity;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted2 = new onWarmupCompleted(onwarmupcompleted.$globalKycLauncher, onwarmupcompleted.$funnelInfo, onwarmupcompleted.$activity, (access13800) objArr[2]);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4498);
            return onwarmupcompleted2;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            Unit unit;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[0];
            findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
            access13800<?> access13800Var = (access13800) objArr[2];
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5109);
            int i3 = (((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 15) & 1;
            onWarmupCompleted onwarmupcompletedCreate = onwarmupcompleted.create(findresandmsg, access13800Var);
            if (i3 == 0) {
                unit = Unit.INSTANCE;
                int i4 = 2 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(6002);
            Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(unit);
            int i5 = onNavigationEvent;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1043);
            int i6 = (~iOnWarmupCompleted2) & i5;
            int i7 = (~i5) & iOnWarmupCompleted2;
            if (((((i7 & i6) | (i6 ^ i7)) >> 2) & 1) != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = ~i;
            int i8 = ~i5;
            int i9 = ~(i7 | i8);
            int i10 = ~i4;
            int i11 = i9 | (~(i10 | i5));
            int i12 = (~(i5 | i7)) | (~(i8 | i10));
            int i13 = ~(i | i4);
            int i14 = i12 | i13;
            int i15 = i13 | i11;
            int i16 = i + i4 + i3 + ((-1585779005) * i2) + (640148872 * i6);
            int i17 = i16 * i16;
            int i18 = (i * 308833806) + 153878528 + (308833806 * i4) + ((-448846874) * i11) + ((-224423437) * i14) + (224423437 * i15) + (84410368 * i3) + (1159200768 * i2) + ((-734003200) * i6) + (2089549824 * i17);
            int i19 = (i * (-1291220770)) + 263398195 + (i4 * (-1291220770)) + (i11 * (-1802)) + (i14 * (-901)) + (i15 * 901) + (i3 * (-1291221671)) + (i2 * (-1079815989)) + (i6 * 669414472) + (i17 * 145489920);
            int i20 = i18 + (i19 * i19 * (-1699479552));
            return i20 != 1 ? i20 != 2 ? onExtraCallback(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4098);
            int i3 = i2 & iOnWarmupCompleted;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 3) & 1) != 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5720);
            return objOnNavigationEvent;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            Object objOnExtraCallback;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5391);
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = onwarmupcompleted.label;
            Object obj2 = null;
            if (i2 != 0) {
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3949);
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1823);
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = ((Result) obj).onNavigationEvent();
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(126);
            } else {
                ResultKt.onNavigationEvent(obj);
                postHandle posthandle = onwarmupcompleted.$globalKycLauncher;
                getInterceptor getinterceptor = onwarmupcompleted.$funnelInfo;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5171);
                onwarmupcompleted.label = 1;
                objOnExtraCallback = posthandle.onExtraCallback(getinterceptor, onwarmupcompleted);
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(221);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    int i3 = onNavigationEvent;
                    int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3679);
                    int i4 = (~iOnWarmupCompleted) & i3;
                    int i5 = (~i3) & iOnWarmupCompleted;
                    if (((((i5 & i4) | (i4 ^ i5)) >> 13) & 1) == 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    int i6 = onNavigationEvent;
                    int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3328);
                    if (((((i6 | iOnWarmupCompleted2) & (~(i6 & iOnWarmupCompleted2))) >> 25) & 1) == 0) {
                        int i7 = 36 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            }
            UIKitBaseActivity uIKitBaseActivity = onwarmupcompleted.$activity;
            if (Result.onNavigationEvent(objOnExtraCallback)) {
                int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
                GlobalKycAccessControl globalKycAccessControl = (GlobalKycAccessControl) shouldOverrideUrlLoadingForUC.onNavigationEvent(ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), new Object[]{(shouldOverrideUrlLoadingForUC) objOnExtraCallback}, iOnWarmupCompleted3, 1244124678, ACPayResult.onWarmupCompleted(), -1244124677);
                StringBuilder sb = new StringBuilder();
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(884);
                sb.append("accessControl: ");
                sb.append(globalKycAccessControl);
                int i8 = onNavigationEvent;
                int iOnWarmupCompleted4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2727);
                int i9 = i8 & iOnWarmupCompleted4;
                if ((((((i8 ^ iOnWarmupCompleted4) | i9) & (~i9)) >> 27) & 1) != 0) {
                    EngineConfig1.IAuthTabCallback(uIKitBaseActivity, sb.toString());
                    int i10 = 42 / 0;
                } else {
                    EngineConfig1.IAuthTabCallback(uIKitBaseActivity, sb.toString());
                }
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(949);
            }
            Unit unit = Unit.INSTANCE;
            int i11 = onNavigationEvent;
            int iOnWarmupCompleted5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1654);
            int i12 = (~iOnWarmupCompleted5) & i11;
            int i13 = (~i11) & iOnWarmupCompleted5;
            if (((((i13 & i12) | (i12 ^ i13)) >> 27) & 1) == 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            return (access13800) onWarmupCompleted(-1294628930, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{this, obj, access13800Var}, 1294628932, iOnWarmupCompleted, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            return onWarmupCompleted(1660011104, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{this, findresandmsg, access13800Var}, -1660011103, iOnWarmupCompleted, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
        }

        public final Object invokeSuspend(Object obj) {
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            return onWarmupCompleted(1079582176, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{this, obj}, -1079582176, iOnWarmupCompleted, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e A[PHI: r8
      0x001e: PHI (r8v2 o.getInterceptor) = (r8v1 o.getInterceptor), (r8v8 o.getInterceptor) binds: [B:8:0x001c, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onNavigationEvent(im.toss.uikit.base.UIKitBaseActivity r7, o.getSupportedHighSpeedResolutionsFor r8, o.findResAndMsg r9, o.postHandle r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.EngineConfig1.IAuthTabCallbackStub
            int r1 = r1 + 21
            int r2 = r1 % 128
            o.EngineConfig1.onExtraCallback = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L18
            o.getInterceptor r8 = onNavigationEvent(r8)
            r1 = 6
            int r1 = r1 / 0
            if (r8 == 0) goto L2f
            goto L1e
        L18:
            o.getInterceptor r8 = onNavigationEvent(r8)
            if (r8 == 0) goto L2f
        L1e:
            r2 = 0
            r3 = 0
            o.EngineConfig1$onWarmupCompleted r4 = new o.EngineConfig1$onWarmupCompleted
            r1 = 0
            r4.<init>(r10, r8, r7, r1)
            r5 = 3
            r6 = 0
            r1 = r9
            o.getPackageType r8 = o.maybeUpdateAnimatable.onNavigationEvent(r1, r2, r3, r4, r5, r6)
            if (r8 != 0) goto L36
        L2f:
            java.lang.String r8 = "퍼널을 먼저 선택해주세요."
            onWarmupCompleted(r7, r8)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        L36:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            int r8 = o.EngineConfig1.onExtraCallback
            int r8 = r8 + 37
            int r9 = r8 % 128
            o.EngineConfig1.IAuthTabCallbackStub = r9
            int r8 = r8 % r0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.EngineConfig1.onNavigationEvent(im.toss.uikit.base.UIKitBaseActivity, o.getSupportedHighSpeedResolutionsFor, o.findResAndMsg, o.postHandle):kotlin.Unit");
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onExtraCallbackWithResult.class);
        final /* synthetic */ Context $context;
        final /* synthetic */ getInterceptor $funnelInfo;
        final /* synthetic */ postHandle $globalKycLauncher;
        final /* synthetic */ ICustomTabsServiceDefault<Intent, onTooManyRedirects> $kycActivityResultLauncher;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(postHandle posthandle, Context context, getInterceptor getinterceptor, ICustomTabsServiceDefault<Intent, onTooManyRedirects> iCustomTabsServiceDefault, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$globalKycLauncher = posthandle;
            this.$context = context;
            this.$funnelInfo = getinterceptor;
            this.$kycActivityResultLauncher = iCustomTabsServiceDefault;
        }

        public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
            int i7 = ~i3;
            int i8 = ~(i7 | i5);
            int i9 = ~i6;
            int i10 = ~i5;
            int i11 = (~(i10 | i7)) | i9;
            int i12 = (~(i3 | i5)) | (~(i7 | i9 | i10));
            int i13 = i6 + i5 + i2 + ((-1136091917) * i4) + (376669458 * i);
            int i14 = i13 * i13;
            int i15 = ((-905468225) * i6) + 1718550528 + ((-1748215485) * i5) + (i8 * (-421373630)) + (421373630 * i11) + ((-421373630) * i12) + ((-1326841856) * i2) + ((-2044854272) * i4) + (41156608 * i) + (1721171968 * i14);
            int i16 = ((i6 * (-924404593)) - 1636593565) + (i5 * (-924403757)) + (i8 * 418) + (i11 * (-418)) + (i12 * 418) + (i2 * (-924404175)) + (i4 * (-2083730301)) + (i * 182666354) + (i14 * (-51970048));
            int i17 = i15 + (i16 * i16 * (-653721600));
            return i17 != 1 ? i17 != 2 ? onNavigationEvent(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult2 = new onExtraCallbackWithResult(onextracallbackwithresult.$globalKycLauncher, onextracallbackwithresult.$context, onextracallbackwithresult.$funnelInfo, onextracallbackwithresult.$kycActivityResultLauncher, (access13800) objArr[2]);
            int i2 = onExtraCallbackWithResult;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3939);
            if (((((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 9) & 1) != 0) {
                int i3 = 45 / 0;
            }
            return onextracallbackwithresult2;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
            access13800<?> access13800Var = (access13800) objArr[2];
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1240);
            int i3 = 1 & (((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 17);
            onExtraCallbackWithResult onextracallbackwithresultCreate = onextracallbackwithresult.create(findresandmsg, access13800Var);
            if (i3 != 0) {
                onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4004);
            return objInvokeSuspend;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4290);
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1043);
            return objOnWarmupCompleted;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
        
            if (r14 == r13) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
        
            if (r14 == r13) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
        
            o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5782);
            o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(283);
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
        
            return r13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ java.lang.Object onExtraCallback(java.lang.Object[] r14) {
            /*
                Method dump skipped, instructions count: 197
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.EngineConfig1.onExtraCallbackWithResult.onExtraCallback(java.lang.Object[]):java.lang.Object");
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int iOnWarmupCompleted = R.onWarmupCompleted();
            int iOnWarmupCompleted2 = R.onWarmupCompleted();
            int iOnWarmupCompleted3 = R.onWarmupCompleted();
            return (access13800) onExtraCallback(R.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted3, -729021652, 729021652, new Object[]{this, obj, access13800Var});
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int iOnWarmupCompleted = R.onWarmupCompleted();
            int iOnWarmupCompleted2 = R.onWarmupCompleted();
            int iOnWarmupCompleted3 = R.onWarmupCompleted();
            return onExtraCallback(R.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted3, -674716746, 674716747, new Object[]{this, findresandmsg, access13800Var});
        }

        public final Object invokeSuspend(Object obj) {
            int iOnWarmupCompleted = R.onWarmupCompleted();
            int iOnWarmupCompleted2 = R.onWarmupCompleted();
            int iOnWarmupCompleted3 = R.onWarmupCompleted();
            return onExtraCallback(R.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted3, 1955814271, -1955814269, new Object[]{this, obj});
        }
    }

    private static final Unit onWarmupCompleted(UIKitBaseActivity uIKitBaseActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, findResAndMsg findresandmsg, postHandle posthandle, Context context, ICustomTabsServiceDefault iCustomTabsServiceDefault) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            getInterceptor getinterceptorOnNavigationEvent = onNavigationEvent((getSupportedHighSpeedResolutionsFor<getInterceptor>) getsupportedhighspeedresolutionsfor);
            if (getinterceptorOnNavigationEvent == null || maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(posthandle, context, getinterceptorOnNavigationEvent, iCustomTabsServiceDefault, null), 3, (Object) null) == null) {
                onWarmupCompleted(uIKitBaseActivity, "퍼널을 먼저 선택해주세요.");
                Unit unit = Unit.INSTANCE;
            }
            Unit unit2 = Unit.INSTANCE;
            int i3 = IAuthTabCallbackStub + 45;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 72 / 0;
            }
            return unit2;
        }
        onNavigationEvent((getSupportedHighSpeedResolutionsFor<getInterceptor>) getsupportedhighspeedresolutionsfor);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(IAuthTabCallbackDefault.class);
        final /* synthetic */ UIKitBaseActivity $activity;
        final /* synthetic */ getInterceptor $funnelInfo;
        final /* synthetic */ postHandle $globalKycLauncher;
        final /* synthetic */ AppSetIdAndScope1 $logger;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackDefault(postHandle posthandle, UIKitBaseActivity uIKitBaseActivity, getInterceptor getinterceptor, AppSetIdAndScope1 appSetIdAndScope1, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
            this.$globalKycLauncher = posthandle;
            this.$activity = uIKitBaseActivity;
            this.$funnelInfo = getinterceptor;
            this.$logger = appSetIdAndScope1;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            IAuthTabCallbackDefault iAuthTabCallbackDefault = (IAuthTabCallbackDefault) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault2 = new IAuthTabCallbackDefault(iAuthTabCallbackDefault.$globalKycLauncher, iAuthTabCallbackDefault.$activity, iAuthTabCallbackDefault.$funnelInfo, iAuthTabCallbackDefault.$logger, (access13800) objArr[2]);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3338);
            return iAuthTabCallbackDefault2;
        }

        private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
            AppSetIdAndScope1 appSetIdAndScope1 = (AppSetIdAndScope1) objArr[0];
            UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[1];
            onTooManyRedirects.onWarmupCompleted.onNavigationEvent onnavigationevent = (onTooManyRedirects.onWarmupCompleted.onNavigationEvent) objArr[2];
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5109);
            Unit unitIAuthTabCallback = IAuthTabCallback(appSetIdAndScope1, uIKitBaseActivity, onnavigationevent);
            int i2 = onExtraCallbackWithResult;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3068);
            if (((((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 27) & 1) == 0) {
                int i3 = 41 / 0;
            }
            return unitIAuthTabCallback;
        }

        public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
            int i7 = ~i6;
            int i8 = ~i3;
            int i9 = ~(i7 | i8);
            int i10 = ~(i7 | i2);
            int i11 = ~i2;
            int i12 = i11 | i6;
            int i13 = ~(i3 | i12);
            int i14 = i9 | i10 | i13;
            int i15 = i13 | (~(i7 | i11 | i8));
            int i16 = (~i12) | i10;
            int i17 = i6 + i2 + i + ((-573665793) * i5) + ((-1595597844) * i4);
            int i18 = i17 * i17;
            int i19 = ((-1787860089) * i6) + 959184896 + (1033409659 * i2) + ((-1473697548) * i14) + (1473697548 * i15) + ((-1410634874) * i16) + ((-377225216) * i) + (1316749312 * i5) + (833617920 * i4) + (497221632 * i18);
            int i20 = ((i6 * 2143800573) - 1595758) + (i2 * 2143800249) + (i14 * (-324)) + (i15 * 324) + (i16 * 162) + (i * 2143800411) + (i5 * 1405922725) + (i4 * (-1943733020)) + (i18 * 1827733504);
            switch (i19 + (i20 * i20 * (-911933440))) {
                case 1:
                    return onNavigationEvent(objArr);
                case 2:
                    return onExtraCallbackWithResult(objArr);
                case 3:
                    return onWarmupCompleted(objArr);
                case 4:
                    return onExtraCallback(objArr);
                case 5:
                    return IAuthTabCallbackStub(objArr);
                case 6:
                    return IAuthTabCallbackDefault(objArr);
                default:
                    return IAuthTabCallback(objArr);
            }
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            IAuthTabCallbackDefault iAuthTabCallbackDefault = (IAuthTabCallbackDefault) objArr[0];
            findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
            access13800<?> access13800Var = (access13800) objArr[2];
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1560);
            int i3 = (((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 9) & 1;
            Object obj = null;
            IAuthTabCallbackDefault iAuthTabCallbackDefaultCreate = iAuthTabCallbackDefault.create(findresandmsg, access13800Var);
            if (i3 != 0) {
                iAuthTabCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4906);
            if ((((((~i4) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i4)) >> 28) & 1) != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[0];
            onTooManyRedirects.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (onTooManyRedirects.onExtraCallbackWithResult.onNavigationEvent) objArr[1];
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(629);
            Unit unitIAuthTabCallback = IAuthTabCallback(uIKitBaseActivity, onnavigationevent);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(624);
            return unitIAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2054);
            int i3 = i2 & iOnWarmupCompleted;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 23) & 1) != 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
            UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[1];
            onTooManyRedirects.onWarmupCompleted.onNavigationEvent onnavigationevent = (onTooManyRedirects.onWarmupCompleted.onNavigationEvent) objArr[2];
            int i = 2 % 2;
            Objects.toString(onnavigationevent);
            StringBuilder sb = new StringBuilder();
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3338);
            sb.append("result: ");
            sb.append(onnavigationevent);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3684);
            EngineConfig1.IAuthTabCallback(uIKitBaseActivity, sb.toString());
            Unit unit = Unit.INSTANCE;
            int i2 = onExtraCallbackWithResult;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1043);
            if ((1 & (((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 27)) == 0) {
                int i3 = 20 / 0;
            }
            return unit;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[0];
            onTooManyRedirects.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (onTooManyRedirects.onExtraCallbackWithResult.onNavigationEvent) objArr[1];
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder();
            sb.append("result: ");
            int i2 = onExtraCallbackWithResult;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(432);
            int i3 = i2 & iOnWarmupCompleted;
            if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 5) & 1) != 0) {
                sb.append(onnavigationevent);
                EngineConfig1.IAuthTabCallback(uIKitBaseActivity, sb.toString());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            sb.append(onnavigationevent);
            EngineConfig1.IAuthTabCallback(uIKitBaseActivity, sb.toString());
            int i4 = onExtraCallbackWithResult;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4295);
            int i5 = i4 & iOnWarmupCompleted2;
            if ((((((i4 ^ iOnWarmupCompleted2) | i5) & (~i5)) >> 15) & 1) != 0) {
                return Unit.INSTANCE;
            }
            int i6 = 32 / 0;
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[PHI: r2
          0x004c: PHI (r2v13 java.lang.Object) = (r2v10 java.lang.Object), (r2v21 java.lang.Object) binds: [B:8:0x002f, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[PHI: r4
          0x0031: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x002f, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ java.lang.Object onWarmupCompleted(java.lang.Object[] r12) {
            /*
                Method dump skipped, instructions count: 195
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.EngineConfig1.IAuthTabCallbackDefault.onWarmupCompleted(java.lang.Object[]):java.lang.Object");
        }

        public static /* synthetic */ Unit onWarmupCompleted(UIKitBaseActivity uIKitBaseActivity, onTooManyRedirects.onExtraCallbackWithResult.onNavigationEvent onnavigationevent) {
            int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
            return (Unit) onExtraCallback(iOnExtraCallbackWithResult2, 1311767210, iOnExtraCallbackWithResult, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -1311767209, new Object[]{uIKitBaseActivity, onnavigationevent});
        }

        public static /* synthetic */ Unit onNavigationEvent(AppSetIdAndScope1 appSetIdAndScope1, UIKitBaseActivity uIKitBaseActivity, onTooManyRedirects.onWarmupCompleted.onNavigationEvent onnavigationevent) {
            int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
            return (Unit) onExtraCallback(iOnExtraCallbackWithResult2, 9002885, iOnExtraCallbackWithResult, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -9002880, new Object[]{appSetIdAndScope1, uIKitBaseActivity, onnavigationevent});
        }

        private static final Unit IAuthTabCallback(AppSetIdAndScope1 appSetIdAndScope1, UIKitBaseActivity uIKitBaseActivity, onTooManyRedirects.onWarmupCompleted.onNavigationEvent onnavigationevent) {
            int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
            return (Unit) onExtraCallback(iOnExtraCallbackWithResult2, 200038348, iOnExtraCallbackWithResult, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -200038342, new Object[]{appSetIdAndScope1, uIKitBaseActivity, onnavigationevent});
        }

        private static final Unit IAuthTabCallback(UIKitBaseActivity uIKitBaseActivity, onTooManyRedirects.onExtraCallbackWithResult.onNavigationEvent onnavigationevent) {
            int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
            return (Unit) onExtraCallback(iOnExtraCallbackWithResult2, -562548489, iOnExtraCallbackWithResult, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 562548493, new Object[]{uIKitBaseActivity, onnavigationevent});
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
            return (access13800) onExtraCallback(iOnExtraCallbackWithResult2, 969026649, iOnExtraCallbackWithResult, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -969026649, new Object[]{this, obj, access13800Var});
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
            return onExtraCallback(iOnExtraCallbackWithResult2, 952689200, iOnExtraCallbackWithResult, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -952689198, new Object[]{this, findresandmsg, access13800Var});
        }

        public final Object invokeSuspend(Object obj) {
            int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
            return onExtraCallback(iOnExtraCallbackWithResult2, -1874642158, iOnExtraCallbackWithResult, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 1874642161, new Object[]{this, obj});
        }
    }

    private static final Unit onWarmupCompleted(UIKitBaseActivity uIKitBaseActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, findResAndMsg findresandmsg, postHandle posthandle, AppSetIdAndScope1 appSetIdAndScope1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getInterceptor getinterceptorOnNavigationEvent = onNavigationEvent((getSupportedHighSpeedResolutionsFor<getInterceptor>) getsupportedhighspeedresolutionsfor);
        if (getinterceptorOnNavigationEvent == null || maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(posthandle, uIKitBaseActivity, getinterceptorOnNavigationEvent, appSetIdAndScope1, null), 3, (Object) null) == null) {
            onWarmupCompleted(uIKitBaseActivity, "퍼널을 먼저 선택해주세요.");
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 47;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    public static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(asInterface.class);
        final /* synthetic */ UIKitBaseActivity $activity;
        final /* synthetic */ getInterceptor $funnelInfo;
        final /* synthetic */ postHandle $globalKycLauncher;
        final /* synthetic */ AppSetIdAndScope1 $logger;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(postHandle posthandle, UIKitBaseActivity uIKitBaseActivity, getInterceptor getinterceptor, AppSetIdAndScope1 appSetIdAndScope1, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$globalKycLauncher = posthandle;
            this.$activity = uIKitBaseActivity;
            this.$funnelInfo = getinterceptor;
            this.$logger = appSetIdAndScope1;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            asInterface asinterface = (asInterface) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            asInterface asinterface2 = new asInterface(asinterface.$globalKycLauncher, asinterface.$activity, asinterface.$funnelInfo, asinterface.$logger, (access13800) objArr[2]);
            int i2 = onExtraCallbackWithResult;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1443);
            int i3 = (~iOnWarmupCompleted) & i2;
            int i4 = (~i2) & iOnWarmupCompleted;
            if (((((i4 & i3) | (i3 ^ i4)) >> 14) & 1) == 0) {
                return asinterface2;
            }
            throw null;
        }

        private static /* synthetic */ Object asInterface(Object[] objArr) {
            UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[0];
            onTooManyRedirects.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (onTooManyRedirects.onExtraCallbackWithResult.onNavigationEvent) objArr[1];
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4403);
            int i3 = (~iOnWarmupCompleted) & i2;
            int i4 = (~i2) & iOnWarmupCompleted;
            if ((1 & (((i4 & i3) | (i3 ^ i4)) >> 19)) != 0) {
                return onNavigationEvent(uIKitBaseActivity, onnavigationevent);
            }
            onNavigationEvent(uIKitBaseActivity, onnavigationevent);
            throw null;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            AppSetIdAndScope1 appSetIdAndScope1 = (AppSetIdAndScope1) objArr[0];
            UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[1];
            onTooManyRedirects.onWarmupCompleted.onNavigationEvent onnavigationevent = (onTooManyRedirects.onWarmupCompleted.onNavigationEvent) objArr[2];
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2462);
            Unit unitOnExtraCallback = onExtraCallback(appSetIdAndScope1, uIKitBaseActivity, onnavigationevent);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2106);
            return unitOnExtraCallback;
        }

        private static /* synthetic */ Object onTransact(Object[] objArr) {
            asInterface asinterface = (asInterface) objArr[0];
            findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
            access13800<?> access13800Var = (access13800) objArr[2];
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1823);
            Object objInvokeSuspend = asinterface.create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3656);
            return objInvokeSuspend;
        }

        public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
            int i7 = ~((~i6) | i);
            int i8 = ~i4;
            int i9 = i7 | (~(i8 | i));
            int i10 = ~i;
            int i11 = ~(i10 | i8);
            int i12 = ~(i10 | i6);
            int i13 = (~(i8 | i6)) | i11 | i12;
            int i14 = (~(i4 | i10)) | i12;
            int i15 = i6 + i + i2 + (1039959776 * i5) + ((-2046201414) * i3);
            int i16 = i15 * i15;
            int i17 = ((357140864 * i6) - 8388608) + ((-1785926397) * i) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i2) + ((-201326592) * i5) + ((-406847488) * i3) + (529399808 * i16);
            int i18 = ((i6 * 868240256) - 1765242424) + (i * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (i2 * 868239597) + (i5 * 817356128) + (i3 * 406493490) + (i16 * 645267456);
            switch (i17 + (i18 * i18 * 681705472)) {
                case 1:
                    return onExtraCallback(objArr);
                case 2:
                    return onWarmupCompleted(objArr);
                case 3:
                    return onNavigationEvent(objArr);
                case 4:
                    return onExtraCallbackWithResult(objArr);
                case 5:
                    return asInterface(objArr);
                case 6:
                    return onTransact(objArr);
                default:
                    return IAuthTabCallback(objArr);
            }
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(949);
            int i3 = i2 & iOnWarmupCompleted;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 31) & 1) == 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[1];
            onTooManyRedirects.onWarmupCompleted.onNavigationEvent onnavigationevent = (onTooManyRedirects.onWarmupCompleted.onNavigationEvent) objArr[2];
            int i = 2 % 2;
            Objects.toString(onnavigationevent);
            StringBuilder sb = new StringBuilder();
            int i2 = onExtraCallbackWithResult;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4901);
            if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 31) & 1) == 0) {
                sb.append("result: ");
                sb.append(onnavigationevent);
                int i3 = 54 / 0;
            } else {
                sb.append("result: ");
                sb.append(onnavigationevent);
            }
            EngineConfig1.IAuthTabCallback(uIKitBaseActivity, sb.toString());
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1043);
            int i5 = i4 & iOnWarmupCompleted2;
            if ((1 & ((((i4 ^ iOnWarmupCompleted2) | i5) & (~i5)) >> 29)) == 0) {
                int i6 = 46 / 0;
            }
            return unit;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[0];
            onTooManyRedirects.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (onTooManyRedirects.onExtraCallbackWithResult.onNavigationEvent) objArr[1];
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder();
            sb.append("result: ");
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(18);
            sb.append(onnavigationevent);
            EngineConfig1.IAuthTabCallback(uIKitBaseActivity, sb.toString());
            int i2 = onExtraCallbackWithResult;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4295);
            int i3 = (~iOnWarmupCompleted) & i2;
            int i4 = (~i2) & iOnWarmupCompleted;
            if (((((i4 & i3) | (i3 ^ i4)) >> 31) & 1) == 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            asInterface asinterface = (asInterface) objArr[0];
            Object objOnWarmupCompleted = objArr[1];
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4267);
            int i3 = ((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 18) & 1;
            Object obj = null;
            if (i3 == 0) {
                access14300.onWarmupCompleted();
                int i4 = asinterface.label;
                obj.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
            int i5 = asinterface.label;
            if (i5 != 0) {
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(283);
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = onExtraCallbackWithResult;
                int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4615);
                int i7 = (~iOnWarmupCompleted2) & i6;
                int i8 = (~i6) & iOnWarmupCompleted2;
                int i9 = (((i8 & i7) | (i7 ^ i8)) >> 17) & 1;
                ResultKt.onNavigationEvent(objOnWarmupCompleted);
                if (i9 == 0) {
                    throw null;
                }
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5171);
            } else {
                ResultKt.onNavigationEvent(objOnWarmupCompleted);
                postHandle posthandle = asinterface.$globalKycLauncher;
                UIKitBaseActivity uIKitBaseActivity = asinterface.$activity;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2265);
                getInterceptor getinterceptor = asinterface.$funnelInfo;
                asinterface.label = 1;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(13);
                objOnWarmupCompleted = postHandle.onWarmupCompleted(posthandle, uIKitBaseActivity, getinterceptor, (String) null, true, asinterface, 4, (Object) null);
                if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(629);
                    int i10 = onExtraCallbackWithResult;
                    int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5391);
                    int i11 = i10 & iOnWarmupCompleted3;
                    if ((((((i10 ^ iOnWarmupCompleted3) | i11) & (~i11)) >> 10) & 1) != 0) {
                        int i12 = 42 / 0;
                    }
                    return objOnWarmupCompleted2;
                }
            }
            ((onTooManyRedirects) objOnWarmupCompleted).IAuthTabCallback(new GlobalKycTestActivityKt$GlobalKycTestScreen$3$6$1$1$1$.ExternalSyntheticLambda0(asinterface.$logger, asinterface.$activity), new GlobalKycTestActivityKt$GlobalKycTestScreen$3$6$1$1$1$.ExternalSyntheticLambda1(asinterface.$activity));
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1959);
            Unit unit = Unit.INSTANCE;
            int i13 = onExtraCallbackWithResult;
            int iOnWarmupCompleted4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3487);
            int i14 = i13 & iOnWarmupCompleted4;
            if ((((((i13 ^ iOnWarmupCompleted4) | i14) & (~i14)) >> 3) & 1) == 0) {
                int i15 = 24 / 0;
            }
            return unit;
        }

        public static /* synthetic */ Unit IAuthTabCallback(AppSetIdAndScope1 appSetIdAndScope1, UIKitBaseActivity uIKitBaseActivity, onTooManyRedirects.onWarmupCompleted.onNavigationEvent onnavigationevent) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return (Unit) onWarmupCompleted(290745395, iOnExtraCallback2, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{appSetIdAndScope1, uIKitBaseActivity, onnavigationevent}, iOnExtraCallback3, -290745391);
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(UIKitBaseActivity uIKitBaseActivity, onTooManyRedirects.onExtraCallbackWithResult.onNavigationEvent onnavigationevent) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return (Unit) onWarmupCompleted(-77265048, iOnExtraCallback2, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{uIKitBaseActivity, onnavigationevent}, iOnExtraCallback3, 77265053);
        }

        private static final Unit onExtraCallback(AppSetIdAndScope1 appSetIdAndScope1, UIKitBaseActivity uIKitBaseActivity, onTooManyRedirects.onWarmupCompleted.onNavigationEvent onnavigationevent) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return (Unit) onWarmupCompleted(-1215631564, iOnExtraCallback2, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{appSetIdAndScope1, uIKitBaseActivity, onnavigationevent}, iOnExtraCallback3, 1215631565);
        }

        private static final Unit onNavigationEvent(UIKitBaseActivity uIKitBaseActivity, onTooManyRedirects.onExtraCallbackWithResult.onNavigationEvent onnavigationevent) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return (Unit) onWarmupCompleted(-1841010371, iOnExtraCallback2, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{uIKitBaseActivity, onnavigationevent}, iOnExtraCallback3, 1841010373);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return (access13800) onWarmupCompleted(1626183734, iOnExtraCallback2, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{this, obj, access13800Var}, iOnExtraCallback3, -1626183734);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return onWarmupCompleted(-163970493, iOnExtraCallback2, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{this, findresandmsg, access13800Var}, iOnExtraCallback3, 163970499);
        }

        public final Object invokeSuspend(Object obj) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return onWarmupCompleted(-1185574053, iOnExtraCallback2, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{this, obj}, iOnExtraCallback3, 1185574056);
        }
    }

    private static final Unit IAuthTabCallback(UIKitBaseActivity uIKitBaseActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, findResAndMsg findresandmsg, postHandle posthandle, AppSetIdAndScope1 appSetIdAndScope1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getInterceptor getinterceptorOnNavigationEvent = onNavigationEvent((getSupportedHighSpeedResolutionsFor<getInterceptor>) getsupportedhighspeedresolutionsfor);
        if (getinterceptorOnNavigationEvent == null || maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new asInterface(posthandle, uIKitBaseActivity, getinterceptorOnNavigationEvent, appSetIdAndScope1, null), 3, (Object) null) == null) {
            onWarmupCompleted(uIKitBaseActivity, "퍼널을 먼저 선택해주세요.");
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 43;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        GlobalKycTestViewModel globalKycTestViewModel = (GlobalKycTestViewModel) objArr[0];
        UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            GlobalKycTestViewModel.onNavigationEvent(1514891797, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1514891796, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{globalKycTestViewModel}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
            onExtraCallbackWithResult(uIKitBaseActivity, "삭제 완료");
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallbackStub + 113;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 22 / 0;
            }
            return unit;
        }
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        GlobalKycTestViewModel.onNavigationEvent(1514891797, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1514891796, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, new Object[]{globalKycTestViewModel}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        onExtraCallbackWithResult(uIKitBaseActivity, "삭제 완료");
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        GlobalKycTestViewModel globalKycTestViewModel = (GlobalKycTestViewModel) objArr[0];
        UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            GlobalKycTestViewModel.onNavigationEvent(-821227896, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 821227900, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{globalKycTestViewModel}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
            onExtraCallbackWithResult(uIKitBaseActivity, "KYC 전체 이력 제거 완료");
            int i3 = 40 / 0;
            return Unit.INSTANCE;
        }
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        GlobalKycTestViewModel.onNavigationEvent(-821227896, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 821227900, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, new Object[]{globalKycTestViewModel}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        onExtraCallbackWithResult(uIKitBaseActivity, "KYC 전체 이력 제거 완료");
        return Unit.INSTANCE;
    }

    private static final Unit writeTypedObject(GlobalKycTestViewModel globalKycTestViewModel, UIKitBaseActivity uIKitBaseActivity) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            GlobalKycTestViewModel.onNavigationEvent(241193152, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -241193144, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{globalKycTestViewModel}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
            onExtraCallbackWithResult(uIKitBaseActivity, "KYC 전체 이력 제거 완료");
            unit = Unit.INSTANCE;
            int i3 = 84 / 0;
        } else {
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            GlobalKycTestViewModel.onNavigationEvent(241193152, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -241193144, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, new Object[]{globalKycTestViewModel}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
            onExtraCallbackWithResult(uIKitBaseActivity, "KYC 전체 이력 제거 완료");
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallbackStub + 43;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit ICustomTabsCallback(GlobalKycTestViewModel globalKycTestViewModel, UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            GlobalKycTestViewModel.onNavigationEvent(-822355770, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 822355784, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{globalKycTestViewModel, "KYC_FORCE_REQUEST"}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
            onExtraCallbackWithResult(uIKitBaseActivity, "재이행 대상 등록 완료");
            return Unit.INSTANCE;
        }
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        GlobalKycTestViewModel.onNavigationEvent(-822355770, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 822355784, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, new Object[]{globalKycTestViewModel, "KYC_FORCE_REQUEST"}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        onExtraCallbackWithResult(uIKitBaseActivity, "재이행 대상 등록 완료");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit onWarmupCompleted(GlobalKycTestViewModel globalKycTestViewModel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        GlobalKycTestViewModel.onNavigationEvent(1217405127, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1217405115, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{globalKycTestViewModel}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 79;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onTransact(GlobalKycTestViewModel globalKycTestViewModel, UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            GlobalKycTestViewModel.onNavigationEvent(-822355770, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 822355784, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{globalKycTestViewModel, "NORMAL"}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
            onExtraCallbackWithResult(uIKitBaseActivity, "NORMAL 대상 등록 완료");
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallback + 21;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        GlobalKycTestViewModel.onNavigationEvent(-822355770, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 822355784, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, new Object[]{globalKycTestViewModel, "NORMAL"}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        onExtraCallbackWithResult(uIKitBaseActivity, "NORMAL 대상 등록 완료");
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static final Unit getInterfaceDescriptor(GlobalKycTestViewModel globalKycTestViewModel, UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            GlobalKycTestViewModel.onNavigationEvent(-822355770, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 822355784, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{globalKycTestViewModel, "PENDING"}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
            onExtraCallbackWithResult(uIKitBaseActivity, "PENDING 대상 등록 완료");
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallbackStub + 33;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        GlobalKycTestViewModel.onNavigationEvent(-822355770, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 822355784, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, new Object[]{globalKycTestViewModel, "PENDING"}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        onExtraCallbackWithResult(uIKitBaseActivity, "PENDING 대상 등록 완료");
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static final Unit access100(GlobalKycTestViewModel globalKycTestViewModel, UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            GlobalKycTestViewModel.onNavigationEvent(-822355770, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 822355784, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{globalKycTestViewModel, "REJECTED"}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
            onExtraCallbackWithResult(uIKitBaseActivity, "REJECTED 대상 등록 완료");
            return Unit.INSTANCE;
        }
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        GlobalKycTestViewModel.onNavigationEvent(-822355770, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 822355784, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, new Object[]{globalKycTestViewModel, "REJECTED"}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        onExtraCallbackWithResult(uIKitBaseActivity, "REJECTED 대상 등록 완료");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        GlobalKycTestViewModel globalKycTestViewModel = (GlobalKycTestViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            GlobalKycTestViewModel.onNavigationEvent(1645894673, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1645894660, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{globalKycTestViewModel}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
            return Unit.INSTANCE;
        }
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        GlobalKycTestViewModel.onNavigationEvent(1645894673, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1645894660, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, new Object[]{globalKycTestViewModel}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStubProxy(GlobalKycTestViewModel globalKycTestViewModel, UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            GlobalKycTestViewModel.onNavigationEvent(2091287366, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -2091287359, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{globalKycTestViewModel}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
            onExtraCallbackWithResult(uIKitBaseActivity, "UNDER_AGE 블랙리스트 등록 완료");
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallback + 39;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        GlobalKycTestViewModel.onNavigationEvent(2091287366, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -2091287359, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, new Object[]{globalKycTestViewModel}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        onExtraCallbackWithResult(uIKitBaseActivity, "UNDER_AGE 블랙리스트 등록 완료");
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback_Parcel(GlobalKycTestViewModel globalKycTestViewModel, UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        GlobalKycTestViewModel.onNavigationEvent(434243717, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -434243698, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{globalKycTestViewModel}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        onExtraCallbackWithResult(uIKitBaseActivity, "UNDER_AGE 블랙리스트 해제 완료");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onTransact(GlobalKycTestViewModel globalKycTestViewModel) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        GlobalKycTestViewModel.onNavigationEvent(-1750557729, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1750557746, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{globalKycTestViewModel}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 51;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asInterface(GlobalKycTestViewModel globalKycTestViewModel) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        GlobalKycTestViewModel.onNavigationEvent(768625605, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -768625587, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{globalKycTestViewModel}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallbackStub(java.lang.Object[] r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.EngineConfig1.IAuthTabCallbackStub(java.lang.Object[]):java.lang.Object");
    }

    private static final void onExtraCallbackWithResult(UIKitBaseActivity uIKitBaseActivity, String str) {
        int i = 2 % 2;
        TdsToastV1.onNavigationEvent onnavigationevent = new TdsToastV1.onNavigationEvent(uIKitBaseActivity, str);
        Object[] objArr = new Object[1];
        a(new char[]{2960, 65269, 17572, 3965, 8095, 65468, 2001, 28954, 56639, 40752, 30892, 17893, 22069, 40065, 51782, 21280, 11574, 29856, 23950, 15549, 17793, 46637, 37360, 3620, 6732, 18215, 2153, 43663, 51893, 8392, 1835, 45494, 46222, 42214, 46517, 56838, 20705, 14384, 42380, 33897, 29383, 9911, 18335, 49115, 22462, 14376, 37742, 60028, 46198, 59339, 31655, 44779, 6732, 18215, 6991, 6571, 62097, 47734, 25138, 40745}, 59 - View.MeasureSpec.getSize(0), objArr);
        onnavigationevent.IAuthTabCallback(((String) objArr[0]).intern()).onNavigationEvent();
        int i2 = IAuthTabCallbackStub + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
        }
    }

    private static final void onWarmupCompleted(UIKitBaseActivity uIKitBaseActivity, String str) {
        int i = 2 % 2;
        TdsToastV1.onNavigationEvent onnavigationevent = new TdsToastV1.onNavigationEvent(uIKitBaseActivity, str);
        Object[] objArr = new Object[1];
        a(new char[]{2960, 65269, 17572, 3965, 8095, 65468, 2001, 28954, 56639, 40752, 30892, 17893, 22069, 40065, 51782, 21280, 11574, 29856, 23950, 15549, 17793, 46637, 37360, 3620, 6732, 18215, 2153, 43663, 51893, 8392, 1835, 45494, 46222, 42214, 46517, 56838, 20705, 14384, 50135, 23872, 58083, 27904, 42975, 53626, 46536, 31694, 14347, 21744, 47122, 34996, 37697, 39785, 29714, 51845, 5029, 13093, 43757, 43617, 65140, 31351}, 60 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
        onnavigationevent.IAuthTabCallback(((String) objArr[0]).intern()).onNavigationEvent();
        int i2 = IAuthTabCallbackStub + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final getInterceptor onNavigationEvent(getSupportedHighSpeedResolutionsFor<getInterceptor> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getInterceptor getinterceptor = (getInterceptor) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStub + 69;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return getinterceptor;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        getInterceptor getinterceptor = (getInterceptor) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(getinterceptor);
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(GlobalKycTestViewModel globalKycTestViewModel, UIKitBaseActivity uIKitBaseActivity) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(276508683, new Object[]{globalKycTestViewModel, uIKitBaseActivity}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -276508680, iOnWarmupCompleted2);
    }

    public static /* synthetic */ Unit onExtraCallback(UIKitBaseActivity uIKitBaseActivity, onTooManyRedirects.onExtraCallbackWithResult.onNavigationEvent onnavigationevent) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(1345884852, new Object[]{uIKitBaseActivity, onnavigationevent}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1345884851, iOnWarmupCompleted2);
    }

    public static /* synthetic */ Unit onWarmupCompleted(AppSetIdAndScope1 appSetIdAndScope1, UIKitBaseActivity uIKitBaseActivity, onTooManyRedirects.onWarmupCompleted.onNavigationEvent onnavigationevent) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(668997887, new Object[]{appSetIdAndScope1, uIKitBaseActivity, onnavigationevent}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -668997879, iOnWarmupCompleted2);
    }

    private static final void onExtraCallbackWithResult(postHandle posthandle, AppSetIdAndScope1 appSetIdAndScope1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, GlobalKycTestViewModel globalKycTestViewModel, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {posthandle, appSetIdAndScope1, quirksExternalSyntheticBackport0, globalKycTestViewModel, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        onExtraCallbackWithResult(-1344369430, objArr, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1344369435, iOnWarmupCompleted2);
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<getInterceptor> getsupportedhighspeedresolutionsfor, getInterceptor getinterceptor) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        onExtraCallbackWithResult(134232787, new Object[]{getsupportedhighspeedresolutionsfor, getinterceptor}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -134232785, iOnWarmupCompleted2);
    }

    private static final Unit onExtraCallbackWithResult(AppSetIdAndScope1 appSetIdAndScope1, UIKitBaseActivity uIKitBaseActivity, onTooManyRedirects.onWarmupCompleted.onNavigationEvent onnavigationevent) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(-229497913, new Object[]{appSetIdAndScope1, uIKitBaseActivity, onnavigationevent}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 229497917, iOnWarmupCompleted2);
    }

    private static final Unit IAuthTabCallbackStub(GlobalKycTestViewModel globalKycTestViewModel) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(413345345, new Object[]{globalKycTestViewModel}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -413345338, iOnWarmupCompleted2);
    }

    private static final Unit access000(GlobalKycTestViewModel globalKycTestViewModel, UIKitBaseActivity uIKitBaseActivity) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(2005912255, new Object[]{globalKycTestViewModel, uIKitBaseActivity}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -2005912249, iOnWarmupCompleted2);
    }

    private static final Unit extraCallback(GlobalKycTestViewModel globalKycTestViewModel, UIKitBaseActivity uIKitBaseActivity) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(781135703, new Object[]{globalKycTestViewModel, uIKitBaseActivity}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -781135694, iOnWarmupCompleted2);
    }

    private static final Unit onWarmupCompleted(postHandle posthandle, AppSetIdAndScope1 appSetIdAndScope1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, GlobalKycTestViewModel globalKycTestViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {posthandle, appSetIdAndScope1, quirksExternalSyntheticBackport0, globalKycTestViewModel, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(-143449932, objArr, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 143449932, iOnWarmupCompleted2);
    }
}
