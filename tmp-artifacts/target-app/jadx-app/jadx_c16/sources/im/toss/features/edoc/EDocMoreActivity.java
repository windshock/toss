package im.toss.features.edoc;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.features.edoc.EDocMoreActivity$;
import im.toss.features.edoc.wallet.EDocSubmittedListActivity;
import im.toss.features.edoc.wallet.submit.EDocSubmitActivity;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.EncoderProfilesProxyVideoProfileProxy;
import o.FaceDetectCallBack;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.ForwardingCameraControl;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.LowLightBoostControlExternalSyntheticLambda0;
import o.LowLightBoostControlExternalSyntheticLambda1;
import o.MaxAdPlacerExternalSyntheticLambda2;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import o.access13800;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.component5;
import o.getAwbState;
import o.getBacktraceNote;
import o.maybeUpdateAnimatable;
import o.onPageExit;
import o.requestPostMessageChannelWithExtras;
import o.resolveQuirkNames;
import o.setAdVideoPlaybackListener;
import o.setRandomHost;
import o.toPreviewOnlyRange;
import o.w4;
import o.w5a;
import o.y3ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.network.model.electronicdocument.wallet.submit.DocumentWalletSubmitOrg;
import viva.republica.toss.qrcode.TransferQRCodeDataActivity;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class EDocMoreActivity extends ComposeBaseActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static long access100 = 0;
    public static final int asInterface;
    private static int readTypedObject = 0;
    private static int writeTypedObject = 1;
    private boolean getInterfaceDescriptor;
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new EDocMoreActivity$.ExternalSyntheticLambda18(this));
    private final Lazy IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new EDocMoreActivity$.ExternalSyntheticLambda19(this));
    private final Lazy IAuthTabCallbackStubProxy = LazyKt.onExtraCallbackWithResult(new EDocMoreActivity$.ExternalSyntheticLambda20(this));
    private final IEngagementSignalsCallback_Parcel<Intent> onTransact = onPageExit.onNavigationEvent(this, new EDocMoreActivity$.ExternalSyntheticLambda21(this));
    private final IEngagementSignalsCallback_Parcel<Intent> asBinder = onPageExit.onNavigationEvent(this, new EDocMoreActivity$.ExternalSyntheticLambda22(this));

    static {
        IAuthTabCallback();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onNavigationEvent(defaultConstructorMarker);
        asInterface = 8;
        int i = readTypedObject + 5;
        writeTypedObject = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        EDocMoreActivity eDocMoreActivity = (EDocMoreActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 117;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            access000(eDocMoreActivity);
            throw null;
        }
        String strAccess000 = access000(eDocMoreActivity);
        int i3 = access000 + 55;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return strAccess000;
    }

    public static /* synthetic */ Unit IAuthTabCallback(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 125;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(dialogInterface);
        int i4 = access000 + 25;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(EDocMoreActivity eDocMoreActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 29;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(eDocMoreActivity);
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit IAuthTabCallback(EDocMoreActivity eDocMoreActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(eDocMoreActivity, dialogInterface);
        int i4 = IAuthTabCallback_Parcel + 63;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(EDocMoreActivity eDocMoreActivity, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 1;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface(eDocMoreActivity, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = access000 + 23;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit IAuthTabCallback(EDocMoreActivity eDocMoreActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 53;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            throw null;
        }
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -235342337, new Object[]{eDocMoreActivity, commonModule_setLeftEdgeTouchEnabled}, iOnExtraCallback4, iOnExtraCallback3, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 235342344);
        int i3 = IAuthTabCallback_Parcel + 83;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(EDocMoreActivity eDocMoreActivity, getBacktraceNote getbacktracenote, boolean z, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback_Parcel + 87;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        eDocMoreActivity.IAuthTabCallback(getbacktracenote, z, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ String IAuthTabCallbackDefault(EDocMoreActivity eDocMoreActivity) {
        int i = 2 % 2;
        int i2 = access000 + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            return (String) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1256348901, new Object[]{eDocMoreActivity}, iOnExtraCallback2, iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1256348909);
        }
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int i3 = 93 / 0;
        return (String) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1256348901, new Object[]{eDocMoreActivity}, iOnExtraCallback4, iOnExtraCallback3, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1256348909);
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        String str = (String) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(str, setDetectableSize);
        }
        onWarmupCompleted(str, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        EDocMoreActivity eDocMoreActivity = (EDocMoreActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(eDocMoreActivity);
        int i4 = access000 + 39;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallback(EDocMoreActivity eDocMoreActivity, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access000 + 21;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(eDocMoreActivity, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 2 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(EDocMoreActivity eDocMoreActivity, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 5;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            onNavigationEvent(eDocMoreActivity, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(eDocMoreActivity, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = access000 + 79;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(EDocMoreActivity eDocMoreActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 115;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(eDocMoreActivity, iEngagementSignalsCallbackDefault);
        }
        onNavigationEvent(eDocMoreActivity, iEngagementSignalsCallbackDefault);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(EDocMoreActivity eDocMoreActivity, getBacktraceNote getbacktracenote, boolean z, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback_Parcel + 125;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(eDocMoreActivity, getbacktracenote, z, function0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = access000 + 109;
        IAuthTabCallback_Parcel = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 63 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access000 + 5;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(setDetectableSize);
        int i4 = access000 + 93;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(EDocMoreActivity eDocMoreActivity, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 87;
        access000 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            onWarmupCompleted(eDocMoreActivity, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(eDocMoreActivity, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = access000 + 85;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(EDocMoreActivity eDocMoreActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = access000 + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(eDocMoreActivity, iEngagementSignalsCallbackDefault);
        int i4 = access000 + 113;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(EDocMoreActivity eDocMoreActivity, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 23;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallbackDefault(eDocMoreActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallbackDefault(eDocMoreActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ long onNavigationEvent(EDocMoreActivity eDocMoreActivity) {
        long jIAuthTabCallbackStubProxy;
        int i = 2 % 2;
        int i2 = access000 + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            jIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(eDocMoreActivity);
            int i3 = 72 / 0;
        } else {
            jIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(eDocMoreActivity);
        }
        int i4 = access000 + 95;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return jIAuthTabCallbackStubProxy;
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [android.content.Context, im.toss.features.edoc.EDocMoreActivity] */
    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        String string;
        int i7 = ~i6;
        int i8 = ~((~i2) | i7);
        int i9 = ~(i4 | i7);
        int i10 = i8 | i9;
        int i11 = i9 | i2;
        int i12 = ~(i7 | i2);
        int i13 = i6 + i2 + i3 + (1577873432 * i) + (977123338 * i5);
        int i14 = i13 * i13;
        int i15 = (((-1026819430) * i6) - 865599488) + ((-647756440) * i2) + (i10 * 189531495) + ((-189531495) * i11) + (189531495 * i12) + ((-837287936) * i3) + ((-767557632) * i) + (1290797056 * i5) + ((-539361280) * i14);
        int i16 = (i6 * (-1177406726)) + 1326046462 + (i2 * (-1177405720)) + (i10 * 503) + (i11 * (-503)) + (i12 * 503) + (i3 * (-1177406223)) + (i * 1546282648) + (i5 * (-1884272278)) + (i14 * 70909952);
        switch (i15 + (i16 * i16 * 451280896)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                ?? r10 = (EDocMoreActivity) objArr[0];
                CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
                int i17 = 2 % 2;
                int i18 = IAuthTabCallback_Parcel + 99;
                access000 = i18 % 128;
                int i19 = i18 % 2;
                Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
                if (!FaceDetectCallBack.onExtraCallback(FaceDetectCallBack.onExtraCallbackWithResult, r10.validateRelationship(), false, 2, (Object) null)) {
                    string = r10.getString(R.string.edoc_more_delete_dialog_title, r10.validateRelationship());
                } else {
                    int i20 = access000 + 85;
                    IAuthTabCallback_Parcel = i20 % 128;
                    string = i20 % 2 != 0 ? r10.getString(R.string.edoc_more_delete_dialog_title_is_korean_last_consonant, r10.validateRelationship()) : r10.getString(R.string.edoc_more_delete_dialog_title_is_korean_last_consonant, r10.validateRelationship());
                }
                commonModule_setLeftEdgeTouchEnabled.onExtraCallback(string);
                commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(r10.getString(R.string.edoc___f1fbd5e1a6));
                String string2 = r10.getString(R.string.close);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, new Object[]{commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string2, (TdsButtonV1View.asInterface) null, false, new EDocMoreActivity$.ExternalSyntheticLambda5(), 6, (Object) null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
                CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, R.string.do_delete, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DANGER, (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 14, (DefaultConstructorMarker) null), false, new EDocMoreActivity$.ExternalSyntheticLambda6((EDocMoreActivity) r10), 4, (Object) null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
                return Unit.INSTANCE;
            case 8:
                return asInterface(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return access100(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static final Unit onNavigationEvent(EDocMoreActivity eDocMoreActivity, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel + 95;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        eDocMoreActivity.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback_Parcel + 39;
        access000 = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(EDocMoreActivity eDocMoreActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 59;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {eDocMoreActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 478079781, objArr, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -478079780);
        int i5 = IAuthTabCallback_Parcel + 7;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(EDocMoreActivity eDocMoreActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 89;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(eDocMoreActivity, setDetectableSize);
        int i4 = IAuthTabCallback_Parcel + 85;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 73;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(setDetectableSize);
        int i4 = access000 + 55;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        EDocMoreActivity eDocMoreActivity = (EDocMoreActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(eDocMoreActivity);
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 67;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return interfaceDescriptor;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        EDocMoreActivity eDocMoreActivity = (EDocMoreActivity) objArr[0];
        w5a w5aVar = (w5a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 17;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(eDocMoreActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(eDocMoreActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = IAuthTabCallback_Parcel + 85;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(EDocMoreActivity eDocMoreActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(eDocMoreActivity, dialogInterface);
        int i4 = access000 + 89;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(EDocMoreActivity eDocMoreActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 51;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(eDocMoreActivity, commonModule_setLeftEdgeTouchEnabled);
        int i4 = IAuthTabCallback_Parcel + 37;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(EDocMoreActivity eDocMoreActivity, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 69;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(eDocMoreActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 20 / 0;
        }
        return unitIAuthTabCallback;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 35;
        access000 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 21;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return 1228237L;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        long jUpdateVisuals;
        EDocMoreActivity eDocMoreActivity = (EDocMoreActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 123;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            jUpdateVisuals = eDocMoreActivity.updateVisuals();
            int i3 = 11 / 0;
        } else {
            jUpdateVisuals = eDocMoreActivity.updateVisuals();
        }
        return Long.valueOf(jUpdateVisuals);
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        EDocMoreActivity eDocMoreActivity = (EDocMoreActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            return (String) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 739099190, new Object[]{eDocMoreActivity}, iOnExtraCallback2, iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -739099190);
        }
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int i3 = 29 / 0;
        return (String) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 739099190, new Object[]{eDocMoreActivity}, iOnExtraCallback4, iOnExtraCallback3, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -739099190);
    }

    public static final /* synthetic */ IEngagementSignalsCallback_Parcel asBinder(EDocMoreActivity eDocMoreActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 109;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = eDocMoreActivity.onTransact;
        int i5 = i3 + 27;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return iEngagementSignalsCallback_Parcel;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        EDocMoreActivity eDocMoreActivity = (EDocMoreActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 97;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        eDocMoreActivity.getInterfaceDescriptor = zBooleanValue;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 111;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final long IAuthTabCallbackStubProxy(EDocMoreActivity eDocMoreActivity) {
        int i = 2 % 2;
        int i2 = access000 + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        long longExtra = eDocMoreActivity.getIntent().getLongExtra("docId", 0L);
        int i4 = IAuthTabCallback_Parcel + 113;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return longExtra;
    }

    private final long updateVisuals() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        long jLongValue = ((Number) this.IAuthTabCallbackDefault.getValue()).longValue();
        int i4 = IAuthTabCallback_Parcel + 67;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return jLongValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String access000(EDocMoreActivity eDocMoreActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 27;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = eDocMoreActivity.getIntent().getStringExtra("docName");
        if (stringExtra != null) {
            return stringExtra;
        }
        int i4 = IAuthTabCallback_Parcel + 27;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return "";
    }

    private final String validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 87;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.IAuthTabCallbackStub.getValue();
        int i4 = IAuthTabCallback_Parcel + 85;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        ComposeBaseActivity composeBaseActivity = (EDocMoreActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 75;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = composeBaseActivity.getIntent();
        if (i3 != 0) {
            Object[] objArr2 = new Object[1];
            a(new char[]{37239, 37125, 61700, 46612, 22384, 5377, 29975, 12819, 4192, 54115, 29808, 62486}, -MotionEvent.axisFromString(""), objArr2);
            return intent.getStringExtra(((String) objArr2[0]).intern());
        }
        Object[] objArr3 = new Object[1];
        a(new char[]{37239, 37125, 61700, 46612, 22384, 5377, 29975, 12819, 4192, 54115, 29808, 62486}, -MotionEvent.axisFromString(""), objArr3);
        intent.getStringExtra(((String) objArr3[0]).intern());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        EDocMoreActivity eDocMoreActivity = (EDocMoreActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) eDocMoreActivity.IAuthTabCallbackStubProxy.getValue();
        int i4 = IAuthTabCallback_Parcel + 41;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final Unit onWarmupCompleted(EDocMoreActivity eDocMoreActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 1;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i4 = IAuthTabCallback_Parcel + 3;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            eDocMoreActivity.ICustomTabsServiceDefault();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("wallet_address", str);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("wallet_address", str);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(EDocMoreActivity eDocMoreActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        Bundle extras;
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 43;
        access000 = i2 % 128;
        String string = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        Intent intentOnExtraCallbackWithResult = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
        if (intentOnExtraCallbackWithResult != null && (extras = intentOnExtraCallbackWithResult.getExtras()) != null) {
            int i3 = access000 + 55;
            IAuthTabCallback_Parcel = i3 % 128;
            char[] cArr = {61670, 61588, 28394, 29202, 41790, 29838, 60159, 36750, 45155, 'H'};
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(cArr, 0 - (ViewConfiguration.getKeyRepeatDelay() >>> 3), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(cArr, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, objArr2);
                obj = objArr2[0];
            }
            string = extras.getString(((String) obj).intern());
        }
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() != -1 || string == null || string.length() == 0) {
            ConvertByteArrayToFloatArray.onExtraCallback(1228657L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        } else {
            ConvertByteArrayToFloatArray.onExtraCallback(1228655L, false, (String) null, (Map) null, new EDocMoreActivity$.ExternalSyntheticLambda4(string), 14, (Object) null);
            eDocMoreActivity.onNavigationEvent(string);
        }
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(access100 ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 29;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 11;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(access100)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), TextUtils.indexOf((CharSequence) "", '0') + 85, (ViewConfiguration.getPressedStateDuration() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getWindowTouchSlop() >> 8)), TextUtils.getCapsMode("", 0, 0) + 19, ExpandableListView.getPackedPositionGroup(0L) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        EDocMoreActivity eDocMoreActivity = (EDocMoreActivity) objArr[0];
        boolean z = true;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = access000 + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0 ? (iIntValue & 3) == 2 : (iIntValue & 2) == 5) {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = IAuthTabCallback_Parcel + 79;
                access000 = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1326990854, iIntValue, -1, "im.toss.features.edoc.EDocMoreActivity.onCreate.<anonymous> (EDocMoreActivity.kt:68)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1326990854, iIntValue, -1, "im.toss.features.edoc.EDocMoreActivity.onCreate.<anonymous> (EDocMoreActivity.kt:68)");
            }
            eDocMoreActivity.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        if (updateVisuals() > 0) {
            requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-1326990854, true, new EDocMoreActivity$.ExternalSyntheticLambda16(this))), 1, (Object) null);
            ICustomTabsServiceDefault();
            int i2 = IAuthTabCallback_Parcel + 9;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new EDocMoreActivity$.ExternalSyntheticLambda17(this));
        int i4 = access000 + 95;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(EDocMoreActivity eDocMoreActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        eDocMoreActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 19;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(EDocMoreActivity eDocMoreActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(eDocMoreActivity.getString(R.string.bad_request_dialog_title));
        commonModule_setLeftEdgeTouchEnabled.asBinder(new EDocMoreActivity$.ExternalSyntheticLambda23(eDocMoreActivity));
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 45;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final void ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = access000 + 25;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.getInterfaceDescriptor) {
            return;
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(this, (access13800) null), 3, (Object) null);
        int i3 = IAuthTabCallback_Parcel + 39;
        access000 = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void setEngagementSignalsCallback() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(this, (access13800) null), 3, (Object) null);
        int i2 = access000 + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void onNavigationEvent(String str) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(this, str, (access13800) null), 3, (Object) null);
        int i2 = IAuthTabCallback_Parcel + 109;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static final class onNavigationEvent {
        private static final byte[] $$a = {11, -55, -20, -91};
        private static final int $$b = 216;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted = 478309047;

        private static String $$c(byte b, short s, byte b2) {
            byte[] bArr = $$a;
            int i = 105 - (b2 * 4);
            int i2 = s + 4;
            int i3 = b * 3;
            byte[] bArr2 = new byte[i3 + 1];
            int i4 = -1;
            if (bArr == null) {
                i4 = -1;
                i = (-i2) + i3;
                i2 = i2;
            }
            while (true) {
                int i5 = i4 + 1;
                int i6 = i2 + 1;
                bArr2[i5] = (byte) i;
                if (i5 == i3) {
                    return new String(bArr2, 0);
                }
                i4 = i5;
                i = (-bArr[i6]) + i;
                i2 = i6;
            }
        }

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0179  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
            int i4;
            char[] cArr2;
            Throwable cause;
            int i5 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr3 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (true) {
                i4 = 2083011369;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                    break;
                }
                int i6 = $11 + 49;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 35125), (ViewConfiguration.getTouchSlop() >> 8) + 23, (Process.myTid() >> 22) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 12843), Color.alpha(0) + 55, 2167 - TextUtils.indexOf("", "", 0, 0), 1298711993, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            if (i2 > 0) {
                int i9 = $10 + 109;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr4 = new char[i];
                System.arraycopy(cArr3, 0, cArr4, 0, i);
                System.arraycopy(cArr4, 0, cArr3, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                int i11 = $11 + 21;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr2 = new char[i];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
                } else {
                    cArr2 = new char[i];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                }
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.getDefaultSize(0, 0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 55, 2167 - ExpandableListView.getPackedPositionType(0L), 1298711993, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                }
                cArr3 = cArr2;
            }
            objArr[0] = new String(cArr3);
        }

        private onNavigationEvent() {
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, long j, @NotNull String str, @Nullable String str2) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) EDocMoreActivity.class);
            intent.putExtra("docId", j);
            intent.putExtra("docName", str);
            Object[] objArr = new Object[1];
            a(8 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 7, new char[]{65530, 7, 7, 65530, 65531, 65530, 7, 7}, true, KeyEvent.normalizeMetaState(0) + 265, objArr);
            intent.putExtra(((String) objArr[0]).intern(), str2);
            int i2 = onNavigationEvent + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return intent;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(EDocMoreActivity eDocMoreActivity, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1847519095, i, -1, "im.toss.features.edoc.EDocMoreActivity.Content.<anonymous>.<anonymous>.<anonymous> (EDocMoreActivity.kt:152)");
            }
            String string = eDocMoreActivity.getString(R.string.edoc___c1f82f84b4);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{string, null, null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = access000 + 89;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = IAuthTabCallback_Parcel + 49;
                access000 = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(EDocMoreActivity eDocMoreActivity, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = access000 + 49;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i6 = IAuthTabCallback_Parcel + 71;
            access000 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 32 / 0;
                i2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
            }
            i |= i2;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = access000 + 5;
                IAuthTabCallback_Parcel = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-123247232, i, -1, "im.toss.features.edoc.EDocMoreActivity.Content.<anonymous>.<anonymous> (EDocMoreActivity.kt:150)");
                    int i9 = 2 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-123247232, i, -1, "im.toss.features.edoc.EDocMoreActivity.Content.<anonymous>.<anonymous> (EDocMoreActivity.kt:150)");
                }
            }
            w5aVar.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1847519095, true, new EDocMoreActivity$.ExternalSyntheticLambda14(eDocMoreActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asInterface(EDocMoreActivity eDocMoreActivity) {
        Intent intentOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            ConvertByteArrayToFloatArray.onExtraCallback(1228239L, true, (String) null, (Map) null, (Function1) null, 26, (Object) null);
            if (!(!eDocMoreActivity.getInterfaceDescriptor)) {
                EDocSubmittedListActivity.IAuthTabCallback iAuthTabCallback = EDocSubmittedListActivity.Companion;
                long jUpdateVisuals = eDocMoreActivity.updateVisuals();
                int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
                intentOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted(eDocMoreActivity, jUpdateVisuals, (String) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 739099190, new Object[]{eDocMoreActivity}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -739099190));
            } else {
                EDocSubmitActivity.onExtraCallback onextracallback = EDocSubmitActivity.Companion;
                long jUpdateVisuals2 = eDocMoreActivity.updateVisuals();
                int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
                Intent intentOnNavigationEvent = EDocSubmitActivity.onExtraCallback.onNavigationEvent(onextracallback, eDocMoreActivity, jUpdateVisuals2, (String) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 739099190, new Object[]{eDocMoreActivity}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -739099190), (DocumentWalletSubmitOrg) null, 8, (Object) null);
                int i3 = access000 + 95;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                intentOnWarmupCompleted = intentOnNavigationEvent;
            }
        } else {
            ConvertByteArrayToFloatArray.onExtraCallback(1228239L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            if (!(!eDocMoreActivity.getInterfaceDescriptor)) {
            }
        }
        eDocMoreActivity.onTransact.onNavigationEvent(intentOnWarmupCompleted);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(EDocMoreActivity eDocMoreActivity, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 59;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1))) {
            int i5 = IAuthTabCallback_Parcel + 59;
            access000 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 83 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-178581842, i, -1, "im.toss.features.edoc.EDocMoreActivity.Content.<anonymous>.<anonymous>.<anonymous> (EDocMoreActivity.kt:182)");
                }
                String string = eDocMoreActivity.getString(R.string.edoc___dc6e3c8e68);
                Intrinsics.checkNotNullExpressionValue(string, "");
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{string, null, null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                String string2 = eDocMoreActivity.getString(R.string.edoc___dc6e3c8e68);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{string2, null, null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback_Parcel + 19;
        access000 = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(EDocMoreActivity eDocMoreActivity, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i3 = access000 + 67;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar);
                throw null;
            }
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if ((i & 19) != 18) {
            int i4 = access000 + 101;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i6 = access000 + 121;
            IAuthTabCallback_Parcel = i6 % 128;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-4444553, i, -1, "im.toss.features.edoc.EDocMoreActivity.Content.<anonymous>.<anonymous> (EDocMoreActivity.kt:180)");
            }
            w5aVar.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-178581842, true, new EDocMoreActivity$.ExternalSyntheticLambda2(eDocMoreActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = access000 + 59;
                IAuthTabCallback_Parcel = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback_Parcel(EDocMoreActivity eDocMoreActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 111;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1228653L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        eDocMoreActivity.asBinder.onNavigationEvent(TransferQRCodeDataActivity.IAuthTabCallback.IAuthTabCallback(TransferQRCodeDataActivity.Companion, eDocMoreActivity, false, 2, (Object) null));
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 109;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asInterface(EDocMoreActivity eDocMoreActivity, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 31;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 70) != 43;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = access000 + 107;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(769907887, i, -1, "im.toss.features.edoc.EDocMoreActivity.Content.<anonymous>.<anonymous>.<anonymous> (EDocMoreActivity.kt:200)");
            }
            String string = eDocMoreActivity.getString(R.string.edoc___32d336abd7);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{string, null, null, Long.valueOf(MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent.onExtraCallbackWithResult().IEngagementSignalsCallbackStub()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(EDocMoreActivity eDocMoreActivity, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i4 = access000 + 33;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                int i6 = IAuthTabCallback_Parcel + 43;
                access000 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i8 = IAuthTabCallback_Parcel;
            int i9 = i8 + 123;
            access000 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i8 + 65;
            access000 = i11 % 128;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i13 = access000 + 111;
            IAuthTabCallback_Parcel = i13 % 128;
            int i14 = i13 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(944045176, i, -1, "im.toss.features.edoc.EDocMoreActivity.Content.<anonymous>.<anonymous> (EDocMoreActivity.kt:198)");
            }
            w5aVar.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(769907887, true, new EDocMoreActivity$.ExternalSyntheticLambda24(eDocMoreActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(EDocMoreActivity eDocMoreActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("doc_title", eDocMoreActivity.validateRelationship());
            setDetectableSize.onExtraCallback("doc_no", Long.valueOf(eDocMoreActivity.updateVisuals()));
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("doc_title", eDocMoreActivity.validateRelationship());
        setDetectableSize.onExtraCallback("doc_no", Long.valueOf(eDocMoreActivity.updateVisuals()));
        Unit unit2 = Unit.INSTANCE;
        int i3 = access000 + 55;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 125;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("button_type", "close");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("button_type", "close");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1228245L, false, (String) null, (Map) null, new EDocMoreActivity$.ExternalSyntheticLambda15(), 14, (Object) null);
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 83;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("button_type", "delete");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("button_type", "delete");
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback_Parcel + 125;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onExtraCallbackWithResult(EDocMoreActivity eDocMoreActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1228245L, false, (String) null, (Map) null, new EDocMoreActivity$.ExternalSyntheticLambda25(), 14, (Object) null);
        eDocMoreActivity.setEngagementSignalsCallback();
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 5;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 71 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit getInterfaceDescriptor(EDocMoreActivity eDocMoreActivity) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1228241L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        ConvertByteArrayToFloatArray.onExtraCallback(1228243L, false, (String) null, (Map) null, new EDocMoreActivity$.ExternalSyntheticLambda0(eDocMoreActivity), 14, (Object) null);
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(eDocMoreActivity, new EDocMoreActivity$.ExternalSyntheticLambda1(eDocMoreActivity));
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-210010488);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this)) {
                int i5 = access000 + 55;
                IAuthTabCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            int i7 = access000 + 7;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-210010488, i2, -1, "im.toss.features.edoc.EDocMoreActivity.Content (EDocMoreActivity.kt:144)");
            }
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i9 = access000 + 83;
                IAuthTabCallback_Parcel = i9 % 128;
                if (i9 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-123247232, true, new EDocMoreActivity$.ExternalSyntheticLambda7(this), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!zOnExtraCallback) {
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Object externalSyntheticLambda8 = new EDocMoreActivity$.ExternalSyntheticLambda8(this);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda8);
                    obj2 = externalSyntheticLambda8;
                }
                int i10 = (i2 << 9) & 7168;
                int i11 = i10 | 54;
                IAuthTabCallback(encoderProfilesProxyVideoProfileProxyOnExtraCallback, true, (Function0) obj2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i11, 0);
                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(-4444553, true, new EDocMoreActivity$.ExternalSyntheticLambda9(this), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!zOnExtraCallback2) {
                    Object obj3 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Object externalSyntheticLambda10 = new EDocMoreActivity$.ExternalSyntheticLambda10(this);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda10);
                        obj3 = externalSyntheticLambda10;
                    }
                    IAuthTabCallback(encoderProfilesProxyVideoProfileProxyOnExtraCallback2, true, (Function0) obj3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i11, 0);
                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback3 = ForwardingCameraControl.onExtraCallback(944045176, true, new EDocMoreActivity$.ExternalSyntheticLambda11(this), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                    boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnExtraCallback3) {
                        Object obj4 = objOnMinimized3;
                        if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            Object externalSyntheticLambda12 = new EDocMoreActivity$.ExternalSyntheticLambda12(this);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda12);
                            obj4 = externalSyntheticLambda12;
                        }
                        IAuthTabCallback(encoderProfilesProxyVideoProfileProxyOnExtraCallback3, false, (Function0) obj4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i10 | 6, 2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i12 = access000 + 109;
                            IAuthTabCallback_Parcel = i12 % 128;
                            if (i12 % 2 != 0) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                                int i13 = 18 / 0;
                            } else {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new EDocMoreActivity$.ExternalSyntheticLambda13(this, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, boolean z, Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        Function0<Unit> function02;
        int i6;
        int i7;
        boolean z3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z4;
        Function0<Unit> function03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function0<Unit> function04;
        int i8;
        int i9 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1391585224);
        if ((i & 6) == 0) {
            int i10 = access000 + 49;
            IAuthTabCallback_Parcel = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 17 / 0;
                i8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 4 : 2;
            } else if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote)) {
            }
            i3 = i8 | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z2 = z;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                    int i13 = access000 + 91;
                    IAuthTabCallback_Parcel = i13 % 128;
                    i4 = i13 % 2 != 0 ? 98 : 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            i5 = i2 & 4;
            if (i5 != 0) {
                if ((i & 384) == 0) {
                    function02 = function0;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02)) {
                        int i14 = IAuthTabCallback_Parcel + 51;
                        access000 = i14 % 128;
                        int i15 = i14 % 2;
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i3 |= i6;
                }
                i7 = i3;
                if ((i7 & 147) != 146) {
                    int i16 = IAuthTabCallback_Parcel + 9;
                    access000 = i16 % 128;
                    z3 = i16 % 2 != 0;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i7 & 1)) {
                    boolean z5 = i12 != 0 ? false : z2;
                    if (i5 != 0) {
                        int i17 = access000 + 111;
                        IAuthTabCallback_Parcel = i17 % 128;
                        int i18 = i17 % 2;
                        function04 = null;
                    } else {
                        function04 = function02;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i19 = IAuthTabCallback_Parcel + 3;
                        access000 = i19 % 128;
                        if (i19 % 2 == 0) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1391585224, i7, -1, "im.toss.features.edoc.EDocMoreActivity.ListRowItem (EDocMoreActivity.kt:247)");
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1391585224, i7, -1, "im.toss.features.edoc.EDocMoreActivity.ListRowItem (EDocMoreActivity.kt:247)");
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    w4.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{getbacktracenote, Boolean.valueOf(z5), null, null, null, null, null, null, null, Float.valueOf(0.0f), null, null, null, null, null, function04, null, null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i7 & 14) | 1575936 | (i7 & 112)), Integer.valueOf((i7 << 9) & 458752), 229300}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1882733109, -1882733101);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i20 = access000 + 73;
                        IAuthTabCallback_Parcel = i20 % 128;
                        int i21 = i20 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    z4 = z5;
                    function03 = function04;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    z4 = z2;
                    function03 = function02;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new EDocMoreActivity$.ExternalSyntheticLambda3(this, getbacktracenote, z4, function03, i, i2));
                    return;
                }
                return;
            }
            int i22 = access000 + 33;
            IAuthTabCallback_Parcel = i22 % 128;
            i3 = i22 % 2 != 0 ? i3 | 17030 : i3 | 384;
            function02 = function0;
            i7 = i3;
            if ((i7 & 147) != 146) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i7 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        z2 = z;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        function02 = function0;
        i7 = i3;
        if ((i7 & 147) != 146) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i7 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1597347341, new Object[]{str, setDetectableSize}, iOnExtraCallback2, iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1597347331);
    }

    public static /* synthetic */ Unit onNavigationEvent(EDocMoreActivity eDocMoreActivity, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {eDocMoreActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 504183648, objArr, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -504183646);
    }

    public static /* synthetic */ Unit onExtraCallback(EDocMoreActivity eDocMoreActivity) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1606035305, new Object[]{eDocMoreActivity}, iOnExtraCallback2, iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1606035294);
    }

    public static /* synthetic */ String onExtraCallbackWithResult(EDocMoreActivity eDocMoreActivity) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (String) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1093800604, new Object[]{eDocMoreActivity}, iOnExtraCallback2, iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1093800608);
    }

    public static /* synthetic */ Unit onWarmupCompleted(EDocMoreActivity eDocMoreActivity) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 710971011, new Object[]{eDocMoreActivity}, iOnExtraCallback2, iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -710971006);
    }

    private static final Unit onExtraCallback(EDocMoreActivity eDocMoreActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -235342337, new Object[]{eDocMoreActivity, commonModule_setLeftEdgeTouchEnabled}, iOnExtraCallback2, iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 235342344);
    }

    public static final /* synthetic */ long IAuthTabCallbackStub(EDocMoreActivity eDocMoreActivity) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return ((Long) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 453849267, new Object[]{eDocMoreActivity}, iOnExtraCallback2, iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -453849258)).longValue();
    }

    public static final /* synthetic */ String onTransact(EDocMoreActivity eDocMoreActivity) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (String) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -947167075, new Object[]{eDocMoreActivity}, iOnExtraCallback2, iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 947167081);
    }

    public static final /* synthetic */ void IAuthTabCallback(EDocMoreActivity eDocMoreActivity, boolean z) {
        Object[] objArr = {eDocMoreActivity, Boolean.valueOf(z)};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1241401803, objArr, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1241401800);
    }

    private final String ICustomTabsServiceStub() {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (String) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 739099190, new Object[]{this}, iOnExtraCallback2, iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -739099190);
    }

    private static final Unit onExtraCallback(EDocMoreActivity eDocMoreActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {eDocMoreActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 478079781, objArr, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -478079780);
    }

    private static final String access100(EDocMoreActivity eDocMoreActivity) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (String) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1256348901, new Object[]{eDocMoreActivity}, iOnExtraCallback2, iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1256348909);
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = access000 + 3;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = IAuthTabCallback_Parcel + 117;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 89;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = IAuthTabCallback_Parcel + 69;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = access000 + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = IAuthTabCallback_Parcel + 79;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access000 + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            throw null;
        }
    }

    static void IAuthTabCallback() {
        access100 = 686778150526884365L;
    }
}
