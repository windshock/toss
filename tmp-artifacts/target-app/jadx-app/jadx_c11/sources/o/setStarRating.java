package o;

import android.content.Context;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import im.toss.features.home.core.local.model.TransactionFilterLocal;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.R;
import im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Kt$;
import im.toss.tds.compose.foundation.anim.rally.RallyKeyframes;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ExtensionsManager1;
import o.FocusMeteringControlExternalSyntheticLambda9;
import o.MaxAppOpenAd;
import o.QuirksExternalSyntheticBackport0;
import o.getSupportedHighSpeedResolutionsFor;
import o.getSwitchMinWidth;
import o.initSDK;
import o.isContainerClickable;
import o.removeAdapter;
import o.setClickDestinationUri;
import o.setClickTrackingUrls;
import o.setOrientationDegrees;
import o.setPackageName;
import o.setStarRating;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setStarRating {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        setClickTrackingUrls.onNavigationEvent onnavigationevent = (setClickTrackingUrls.onNavigationEvent) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        setClickTrackingRequests setclicktrackingrequests = (setClickTrackingRequests) objArr[4];
        initSDK initsdk = (initSDK) objArr[5];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[6];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(getsupportedhighspeedresolutionsfor, quirksExternalSyntheticBackport0, onnavigationevent, function1, setclicktrackingrequests, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(getsupportedhighspeedresolutionsfor, quirksExternalSyntheticBackport0, onnavigationevent, function1, setclicktrackingrequests, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onExtraCallback + 53;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, setOrientationDegrees setorientationdegrees) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
            unit = (Unit) onExtraCallbackWithResult(new Object[]{cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, setorientationdegrees}, 901465855, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -901465846);
            int i3 = 24 / 0;
        } else {
            int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
            unit = (Unit) onExtraCallbackWithResult(new Object[]{cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, setorientationdegrees}, 901465855, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent2, -901465846);
        }
        int i4 = onNavigationEvent + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, setClickTrackingUrls.onNavigationEvent onnavigationevent, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Function1 function1, initSDK initsdk, setClickTrackingRequests setclicktrackingrequests, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 69;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, onnavigationevent, getsupportedhighspeedresolutionsfor, function1, initsdk, setclicktrackingrequests, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 51;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[2];
        setClickTrackingUrls.onNavigationEvent onnavigationevent = (setClickTrackingUrls.onNavigationEvent) objArr[3];
        Function1 function1 = (Function1) objArr[4];
        initSDK initsdk = (initSDK) objArr[5];
        setClickTrackingRequests setclicktrackingrequests = (setClickTrackingRequests) objArr[6];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, onnavigationevent, function1, initsdk, setclicktrackingrequests, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, onnavigationevent, function1, initsdk, setclicktrackingrequests, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(RallyKeyframes rallyKeyframes) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(rallyKeyframes);
        }
        onExtraCallbackWithResult(rallyKeyframes);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(MaxAppOpenAd maxAppOpenAd) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(maxAppOpenAd);
        int i4 = onNavigationEvent + 5;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setClickTrackingRequests setclicktrackingrequests, setClickTrackingUrls.onNavigationEvent onnavigationevent, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 19;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{getsupportedhighspeedresolutionsfor, quirksExternalSyntheticBackport0, setclicktrackingrequests, onnavigationevent, function1, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, 1649850922, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1649850919);
        int i6 = onNavigationEvent + 1;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, useandconfigureprogramwithtexture);
        int i4 = onNavigationEvent + 57;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(removeadapter);
        int i4 = onExtraCallback + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onExtraCallback(Function1 function1, Context context, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = onNavigationEvent(function1, context, getsupportedhighspeedresolutionsfor, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 51;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 55 / 0;
        }
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        removeAdapter removeadapter = (removeAdapter) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(removeadapter);
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws NoWhenBranchMatchedException {
        boolean z;
        Function1 function1;
        int i7 = i6 | i5;
        int i8 = ~i;
        int i9 = ~i5;
        int i10 = ~(i8 | i9);
        int i11 = (~(i5 | i8)) | (~(i9 | i6));
        int i12 = i6 + i + i3 + (1389894630 * i2) + ((-1243605516) * i4);
        int i13 = i12 * i12;
        int i14 = (((-88671125) * i6) - 261777699) + (i * (-88671149)) + (i7 * (-12)) + (i10 * 12) + (i11 * 12) + ((-88671137) * i3) + ((-349388198) * i2) + ((-147040884) * i4) + (i13 * 182059008);
        switch (((-345998475) * i6) + 1335230464 + (862422157 * i) + ((-1543273332) * i7) + (i10 * 1543273332) + (1543273332 * i11) + ((-1889271808) * i3) + (1607991296 * i2) + ((-548405248) * i4) + ((-1553596416) * i13) + (i14 * i14 * (-132513792))) {
            case 1:
                isContainerClickable iscontainerclickable = (isContainerClickable) objArr[0];
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
                Function1 function12 = (Function1) objArr[2];
                getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) objArr[3];
                initSDK initsdk = (initSDK) objArr[4];
                setClickTrackingRequests setclicktrackingrequests = (setClickTrackingRequests) objArr[5];
                FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9 = (FocusMeteringControlExternalSyntheticLambda9) objArr[6];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
                int iIntValue = ((Number) objArr[8]).intValue();
                int i15 = 2 % 2;
                int i16 = onNavigationEvent + 33;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                Unit unitOnWarmupCompleted = onWarmupCompleted(iscontainerclickable, getsupportedhighspeedresolutionsfor, function12, getswitchminwidth, initsdk, setclicktrackingrequests, focusMeteringControlExternalSyntheticLambda9, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i18 = onNavigationEvent + 3;
                onExtraCallback = i18 % 128;
                int i19 = i18 % 2;
                return unitOnWarmupCompleted;
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[1];
                boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
                setClickTrackingUrls.IAuthTabCallback iAuthTabCallback = (setClickTrackingUrls.IAuthTabCallback) objArr[3];
                setClickTrackingUrls.onNavigationEvent onnavigationevent = (setClickTrackingUrls.onNavigationEvent) objArr[4];
                Function1 function13 = (Function1) objArr[5];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
                int iIntValue2 = ((Number) objArr[7]).intValue();
                int iIntValue3 = ((Number) objArr[8]).intValue();
                int i20 = 2 % 2;
                if ((iIntValue3 & 2) != 0) {
                    onextracallback = QuirksExternalSyntheticBackport0.Companion;
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = onextracallback;
                if ((iIntValue3 & 4) != 0) {
                    int i21 = onNavigationEvent + 37;
                    onExtraCallback = i21 % 128;
                    z = i21 % 2 != 0;
                } else {
                    z = zBooleanValue2;
                }
                if ((iIntValue3 & 8) != 0) {
                    iAuthTabCallback = setClickTrackingUrls.IAuthTabCallback.Fill;
                }
                setClickTrackingUrls.onNavigationEvent onnavigationevent2 = (iIntValue3 & 16) != 0 ? setClickTrackingUrls.onNavigationEvent.Medium : onnavigationevent;
                if ((iIntValue3 & 32) != 0) {
                    int i22 = onExtraCallback;
                    int i23 = i22 + 89;
                    onNavigationEvent = i23 % 128;
                    int i24 = i23 % 2;
                    int i25 = i22 + 81;
                    onNavigationEvent = i25 % 128;
                    int i26 = i25 % 2;
                    function1 = null;
                } else {
                    function1 = function13;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(577140564, iIntValue2, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2 (TdsCheckBoxV2.kt:92)");
                }
                onExtraCallback(zBooleanValue, setImpressionRequests.IAuthTabCallback.IAuthTabCallback(iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult2, ((iIntValue2 >> 9) & 14) | 48), (QuirksExternalSyntheticBackport0) onextracallback2, onnavigationevent2, z, (Function1<? super Boolean, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult2, (iIntValue2 & 14) | ((iIntValue2 << 3) & 896) | ((iIntValue2 >> 3) & 7168) | ((iIntValue2 << 6) & 57344) | (iIntValue2 & 458752), 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                return null;
            case 7:
                return onTransact(objArr);
            case 8:
                setClickDestinationUri setclickdestinationuri = (setClickDestinationUri) objArr[0];
                int i27 = 2 % 2;
                int i28 = onExtraCallback + 29;
                onNavigationEvent = i28 % 128;
                int i29 = i28 % 2;
                setClickDestinationUri setclickdestinationuriOnExtraCallback = setClickDestinationUri.onExtraCallback(setclickdestinationuri, !setclickdestinationuri.onExtraCallbackWithResult(), false, false, 2, null);
                int i30 = onNavigationEvent + 33;
                onExtraCallback = i30 % 128;
                int i31 = i30 % 2;
                return setclickdestinationuriOnExtraCallback;
            case 9:
                return asBinder(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{removeadapter}, -993862909, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 993862916);
        int i4 = onExtraCallback + 41;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return unit;
    }

    public static final /* synthetic */ setClickDestinationUri onExtraCallbackWithResult(setClickDestinationUri setclickdestinationuri) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(setclickdestinationuri);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setClickDestinationUri setclickdestinationuriIAuthTabCallback = IAuthTabCallback(setclickdestinationuri);
        int i3 = onNavigationEvent + 75;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 57 / 0;
        }
        return setclickdestinationuriIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        setClickTrackingRequests setclicktrackingrequests = (setClickTrackingRequests) objArr[2];
        setClickTrackingUrls.onNavigationEvent onnavigationevent = (setClickTrackingUrls.onNavigationEvent) objArr[3];
        Function1 function1 = (Function1) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(getsupportedhighspeedresolutionsfor, quirksExternalSyntheticBackport0, setclicktrackingrequests, onnavigationevent, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 53;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            i |= 1;
        }
        onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 107;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, initSDK.onNavigationEvent onnavigationevent, setPackageName setpackagename) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getsupportedhighspeedresolutionsfor, onnavigationevent, setpackagename);
        int i4 = onExtraCallback + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static final /* synthetic */ setClickDestinationUri onNavigationEvent(setClickDestinationUri setclickdestinationuri) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        setClickDestinationUri setclickdestinationuri2 = (setClickDestinationUri) onExtraCallbackWithResult(new Object[]{setclickdestinationuri}, 257596894, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -257596890);
        int i4 = onNavigationEvent + 57;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return setclickdestinationuri2;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 103;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            onNavigationEvent(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onNavigationEvent + 55;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, extensionsManager1);
        int i4 = onNavigationEvent + 111;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(initSDK initsdk, Function1 function1, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(initsdk, function1, z);
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        int i5 = onExtraCallback + 99;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub(removeadapter);
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(removeadapter);
        int i3 = onNavigationEvent + 69;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static final /* synthetic */ void onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Function1 function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent((getSupportedHighSpeedResolutionsFor<setClickDestinationUri>) getsupportedhighspeedresolutionsfor, (Function1<? super Boolean, Unit>) function1);
        int i4 = onExtraCallback + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(boolean z, @NotNull setClickTrackingRequests setclicktrackingrequests, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setClickTrackingUrls.onNavigationEvent onnavigationevent, boolean z2, @Nullable Function1<? super Boolean, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        setClickTrackingUrls.onNavigationEvent onnavigationevent2;
        boolean z3;
        boolean z4;
        Object obj;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(setclicktrackingrequests, "");
        if ((i2 & 4) != 0) {
            int i4 = onExtraCallback + 61;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                throw null;
            }
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if ((i2 & 8) != 0) {
            onnavigationevent2 = setClickTrackingUrls.onNavigationEvent.Medium;
            int i5 = onExtraCallback + 99;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        } else {
            onnavigationevent2 = onnavigationevent;
        }
        if ((i2 & 16) != 0) {
            int i7 = onExtraCallback + 107;
            onNavigationEvent = i7 % 128;
            z3 = i7 % 2 == 0;
        } else {
            z3 = z2;
        }
        Function1<? super Boolean, Unit> function12 = (i2 & 32) != 0 ? null : function1;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onExtraCallback + 11;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2068809766, i, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2 (TdsCheckBoxV2.kt:112)");
        }
        if (((i & 14) ^ 6) <= 4 || !cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z)) {
            if ((i & 6) == 4) {
                z4 = true;
            } else {
                int i10 = onExtraCallback + 23;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                z4 = false;
            }
        }
        boolean z5 = (((i & 57344) ^ 24576) > 16384 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z3)) || (i & 24576) == 16384;
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(z4 | z5)) {
            obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new setClickDestinationUri(z, z3, false, 4, null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                obj = getsupportedhighspeedresolutionsforOnWarmupCompleted;
            }
        }
        int i12 = i >> 3;
        onNavigationEvent((getSupportedHighSpeedResolutionsFor) obj, quirksExternalSyntheticBackport02, setclicktrackingrequests, onnavigationevent2, function12, cameraCaptureResultEmptyCameraCaptureResult, (i12 & 57344) | ((i << 3) & 896) | (i12 & 112) | (i & 7168), 0);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i13 = onExtraCallback + 91;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i14 != 0) {
                int i15 = 11 / 0;
            }
        }
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, initSDK.onNavigationEvent onnavigationevent, setPackageName setpackagename) {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Intrinsics.checkNotNullParameter(setpackagename, "");
            ((setClickDestinationUri) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).onExtraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(setpackagename, "");
        if (((setClickDestinationUri) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).onExtraCallbackWithResult()) {
            str = "on";
        } else {
            int i3 = onNavigationEvent + 11;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            str = "off";
        }
        onnavigationevent.onExtraCallback("status", str);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        createSurfaceOutputFuture createsurfaceoutputfuture;
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture, Role.Companion.onNavigationEvent());
        if (((setClickDestinationUri) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).onExtraCallbackWithResult()) {
            int i4 = onExtraCallback + 31;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                createSurfaceOutputFuture createsurfaceoutputfuture2 = createSurfaceOutputFuture.On;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            createsurfaceoutputfuture = createSurfaceOutputFuture.On;
        } else {
            createsurfaceoutputfuture = createSurfaceOutputFuture.Off;
        }
        unregisterOutputSurface.onNavigationEvent(useandconfigureprogramwithtexture, createsurfaceoutputfuture);
        if (!((setClickDestinationUri) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).IAuthTabCallbackDefault()) {
            unregisterOutputSurface.onExtraCallbackWithResult(useandconfigureprogramwithtexture);
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 113;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(initSDK initsdk, Function1 function1, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, initsdk, (initMiniApp) null, 2, (Object) null);
        function1.invoke(Boolean.valueOf(z));
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 63;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(RallyKeyframes rallyKeyframes) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rallyKeyframes, "");
        RallyKeyframes.Entity entityOnWarmupCompleted = rallyKeyframes.onWarmupCompleted((RallyKeyframes) Float.valueOf(1.1f), 150);
        getIconContentView geticoncontentview = getIconContentView.onWarmupCompleted;
        rallyKeyframes.onExtraCallbackWithResult(entityOnWarmupCompleted, geticoncontentview.onExtraCallbackWithResult());
        rallyKeyframes.onWarmupCompleted((RallyKeyframes) Float.valueOf(1.0f), geticoncontentview.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(removeAdapter removeadapter) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(removeadapter, "");
        removeAdapter.IAuthTabCallback(removeadapter, (Integer) null, (setOnQueryTextListener) null, (Float) null, new Function1() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Kt$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 29;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = setStarRating.onExtraCallback((RallyKeyframes) obj);
                int i5 = onExtraCallbackWithResult + 3;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallback;
            }
        }, 7, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asBinder(removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(removeadapter, "");
        removeAdapter.onExtraCallbackWithResult(removeadapter, null, null, getIconContentView.onWarmupCompleted.onExtraCallbackWithResult(), 1.0f, 3, null);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 101;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(removeadapter, "");
        removeAdapter.onExtraCallbackWithResult(removeadapter, null, null, getIconContentView.onWarmupCompleted.onExtraCallbackWithResult(), 0.8f, 3, null);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Integer num;
        Integer num2;
        getStarRatingContentViewGroup getstarratingcontentviewgroupOnExtraCallbackWithResult;
        float f;
        int i;
        removeAdapter removeadapter = (removeAdapter) objArr[0];
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 57;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(removeadapter, "");
            num = null;
            num2 = null;
            getstarratingcontentviewgroupOnExtraCallbackWithResult = getIconContentView.onWarmupCompleted.onExtraCallbackWithResult();
            f = 0.8f;
            i = 2;
        } else {
            Intrinsics.checkNotNullParameter(removeadapter, "");
            num = null;
            num2 = null;
            getstarratingcontentviewgroupOnExtraCallbackWithResult = getIconContentView.onWarmupCompleted.onExtraCallbackWithResult();
            f = 0.8f;
            i = 3;
        }
        removeAdapter.onExtraCallbackWithResult(removeadapter, num, num2, getstarratingcontentviewgroupOnExtraCallbackWithResult, f, i, null);
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(MaxAppOpenAd maxAppOpenAd) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(maxAppOpenAd, "");
        setClickDestinationUri.IAuthTabCallback iAuthTabCallback = setClickDestinationUri.Companion;
        maxAppOpenAd.onExtraCallbackWithResult(iAuthTabCallback.onWarmupCompleted(), maxAppOpenAd.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Kt$$ExternalSyntheticLambda13
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 69;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {(removeAdapter) obj};
                int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
                int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
                int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
                int iOnNavigationEvent4 = TransactionFilterLocal.Companion.onNavigationEvent();
                if (i4 == 0) {
                    throw null;
                }
                Unit unit = (Unit) setStarRating.onExtraCallbackWithResult(objArr, 36754225, iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent4, iOnNavigationEvent, -36754225);
                int i5 = onExtraCallbackWithResult + 45;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
        }));
        maxAppOpenAd.onExtraCallbackWithResult(iAuthTabCallback.IAuthTabCallback(), maxAppOpenAd.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Kt$$ExternalSyntheticLambda14
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 43;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = setStarRating.onExtraCallback((removeAdapter) obj);
                int i5 = onNavigationEvent + 41;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 26 / 0;
                }
                return unitOnExtraCallback;
            }
        }));
        maxAppOpenAd.onExtraCallbackWithResult(iAuthTabCallback.onExtraCallbackWithResult(), maxAppOpenAd.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Kt$$ExternalSyntheticLambda15
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 89;
                onExtraCallbackWithResult = i3 % 128;
                removeAdapter removeadapter = (removeAdapter) obj;
                if (i3 % 2 == 0) {
                    setStarRating.onWarmupCompleted(removeadapter);
                    throw null;
                }
                Unit unitOnWarmupCompleted = setStarRating.onWarmupCompleted(removeadapter);
                int i4 = onWarmupCompleted + 125;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unitOnWarmupCompleted;
            }
        }));
        maxAppOpenAd.onExtraCallbackWithResult(iAuthTabCallback.onNavigationEvent(), maxAppOpenAd.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Kt$$ExternalSyntheticLambda16
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 115;
                onNavigationEvent = i3 % 128;
                Object obj2 = null;
                removeAdapter removeadapter = (removeAdapter) obj;
                if (i3 % 2 == 0) {
                    setStarRating.onExtraCallbackWithResult(removeadapter);
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = setStarRating.onExtraCallbackWithResult(removeadapter);
                int i4 = onExtraCallback + 77;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                obj2.hashCode();
                throw null;
            }
        }));
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[1];
        setOrientationDegrees setorientationdegrees = (setOrientationDegrees) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        float fOnExtraCallback = setUseCaseDetached.onExtraCallback(setorientationdegrees.onTransact());
        float f = fOnExtraCallback / 2.0f;
        float f2 = (fOnExtraCallback * 1.8169999f) / 4.0f;
        setOrientationDegrees.IAuthTabCallback(setorientationdegrees, onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<setByteOrder>) cameraPresenceProviderExternalSyntheticLambda6), f, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 124, (Object) null);
        setOrientationDegrees.IAuthTabCallback(setorientationdegrees, onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<setByteOrder>) cameraPresenceProviderExternalSyntheticLambda62), f2, 0L, 0.0f, new ExifOutputStream((f - f2) * 2.0f, 0.0f, 0, 0, (fromKilometersPerHour) null, 30, (DefaultConstructorMarker) null), (seek) null, 0, 108, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(isContainerClickable iscontainerclickable, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final Function1 function1, getSwitchMinWidth getswitchminwidth, final initSDK initsdk, setClickTrackingRequests setclicktrackingrequests, FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted;
        Function1 function12;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(focusMeteringControlExternalSyntheticLambda9, "");
        if ((i & 6) == 0) {
            int i5 = onNavigationEvent + 63;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 55 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(focusMeteringControlExternalSyntheticLambda9) ? 4 : 2;
            } else if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(focusMeteringControlExternalSyntheticLambda9)) {
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = onNavigationEvent + 85;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                z = true;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1772013931, i2, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsCheckBoxV2.kt:149)");
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(focusMeteringControlExternalSyntheticLambda9.IAuthTabCallback() * 0.04166f));
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Kt$$ExternalSyntheticLambda9
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj) {
                            int i8 = 2 % 2;
                            int i9 = onExtraCallbackWithResult + 77;
                            onWarmupCompleted = i9 % 128;
                            int i10 = i9 % 2;
                            Unit unitOnExtraCallback = setStarRating.onExtraCallback(getsupportedhighspeedresolutionsfor, (useAndConfigureProgramWithTexture) obj);
                            int i11 = onExtraCallbackWithResult + 81;
                            onWarmupCompleted = i11 % 128;
                            if (i11 % 2 == 0) {
                                return unitOnExtraCallback;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted2, false, (Function1) objOnMinimized, 1, (Object) null);
                if (((setClickDestinationUri) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).IAuthTabCallbackDefault()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(624603380);
                    Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                    if (function1 == null) {
                        int i8 = onNavigationEvent + 89;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(624861547);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            throw null;
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(624861547);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        function12 = null;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(624861548);
                        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(initsdk);
                        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if ((zOnNavigationEvent2 | zOnNavigationEvent3) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Kt$$ExternalSyntheticLambda10
                                private static int onExtraCallback = 1;
                                private static int onExtraCallbackWithResult;

                                public final Object invoke(Object obj) {
                                    int i9 = 2 % 2;
                                    int i10 = onExtraCallbackWithResult + 105;
                                    onExtraCallback = i10 % 128;
                                    int i11 = i10 % 2;
                                    Unit unitOnWarmupCompleted = setStarRating.onWarmupCompleted(initsdk, function1, ((Boolean) obj).booleanValue());
                                    int i12 = onExtraCallbackWithResult + 47;
                                    onExtraCallback = i12 % 128;
                                    int i13 = i12 % 2;
                                    return unitOnWarmupCompleted;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                        }
                        function12 = (Function1) objOnMinimized2;
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    quirksExternalSyntheticBackport0OnExtraCallback = onWarmupCompleted(quirksExternalSyntheticBackport0, context, getsupportedhighspeedresolutionsfor, function12);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(625231068);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    quirksExternalSyntheticBackport0OnExtraCallback = onCaptureSessionStart.onExtraCallback(quirksExternalSyntheticBackport0, 0.4f);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport0OnExtraCallbackWithResult.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = new Function1() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Kt$$ExternalSyntheticLambda11
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj) {
                            int i9 = 2 % 2;
                            int i10 = onWarmupCompleted + 83;
                            IAuthTabCallback = i10 % 128;
                            int i11 = i10 % 2;
                            Unit unitOnExtraCallback = setStarRating.onExtraCallback((MaxAppOpenAd) obj);
                            int i12 = onWarmupCompleted + 43;
                            IAuthTabCallback = i12 % 128;
                            if (i12 % 2 == 0) {
                                int i13 = 50 / 0;
                            }
                            return unitOnExtraCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = iscontainerclickable.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback2, getswitchminwidth, (Function1) objOnMinimized3);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback3);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    int i9 = onExtraCallback + 119;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                if (setclicktrackingrequests.onExtraCallback()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1220595424);
                    final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) setClickTrackingRequests.onNavigationEvent(OverseasRrnInputTextField.IAuthTabCallback(), 744978201, -744978201, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{setclicktrackingrequests, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, 0});
                    final CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted = setclicktrackingrequests.onWarmupCompleted((getSwitchMinWidth<setClickDestinationUri>) getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null);
                    boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
                    boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted);
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if ((zOnNavigationEvent4 | zOnNavigationEvent5) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized4 = new Function1() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Kt$$ExternalSyntheticLambda12
                            private static int onExtraCallbackWithResult = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj) {
                                int i11 = 2 % 2;
                                int i12 = onWarmupCompleted + 117;
                                onExtraCallbackWithResult = i12 % 128;
                                int i13 = i12 % 2;
                                Unit unitIAuthTabCallback = setStarRating.IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted, (setOrientationDegrees) obj);
                                int i14 = onWarmupCompleted + 13;
                                onExtraCallbackWithResult = i14 % 128;
                                int i15 = i14 % 2;
                                return unitIAuthTabCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                    }
                    isChildOrHidden.onWarmupCompleted(quirksExternalSyntheticBackport0OnNavigationEvent, (Function1) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1219491235);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent = setclicktrackingrequests.onNavigationEvent((getSwitchMinWidth<setClickDestinationUri>) getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, 0);
                Painter painterOnNavigationEvent = snapshot.onNavigationEvent(R.drawable.icon_check_mono, cameraCaptureResultEmptyCameraCaptureResult, 0);
                long jOnNavigationEvent = onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent);
                if (!setclicktrackingrequests.onExtraCallback()) {
                    quirksExternalSyntheticBackport0OnWarmupCompleted = quirksExternalSyntheticBackport0;
                } else {
                    int i11 = onNavigationEvent + 31;
                    onExtraCallback = i11 % 128;
                    quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(quirksExternalSyntheticBackport0, i11 % 2 == 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f));
                }
                ImageReaderFormatRecommender.onNavigationEvent(painterOnNavigationEvent, (String) null, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport0OnWarmupCompleted), 0.0f, 1, (Object) null), jOnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, Painter.$stable | 48, 0);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            return Unit.INSTANCE;
        }
        int i12 = onExtraCallback + 39;
        onNavigationEvent = i12 % 128;
        int i13 = i12 % 2;
        z = false;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, setClickTrackingUrls.onNavigationEvent onnavigationevent, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final Function1 function1, final initSDK initsdk, final setClickTrackingRequests setclicktrackingrequests, final isContainerClickable iscontainerclickable, final getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(iscontainerclickable, "");
        Intrinsics.checkNotNullParameter(getswitchminwidth, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iscontainerclickable) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth)) {
                int i5 = onExtraCallback + 3;
                onNavigationEvent = i5 % 128;
                i3 = i5 % 2 != 0 ? 103 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
            int i6 = onExtraCallback + 83;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((i2 & 147) == 146), i2 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(193076993, i2, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2.<anonymous>.<anonymous>.<anonymous> (TdsCheckBoxV2.kt:144)");
            }
            FocusMeteringControlExternalSyntheticLambda8.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport02), onnavigationevent.m97getSizeD9Ej5fM()), (QuirkSettingsLoader) null, false, ForwardingCameraControl.onExtraCallback(1772013931, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Kt$$ExternalSyntheticLambda2
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallback + 3;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 != 0) {
                        Object[] objArr = {iscontainerclickable, getsupportedhighspeedresolutionsfor, function1, getswitchminwidth, initsdk, setclicktrackingrequests, (FocusMeteringControlExternalSyntheticLambda9) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    Object[] objArr2 = {iscontainerclickable, getsupportedhighspeedresolutionsfor, function1, getswitchminwidth, initsdk, setclicktrackingrequests, (FocusMeteringControlExternalSyntheticLambda9) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                    int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
                    Unit unit = (Unit) setStarRating.onExtraCallbackWithResult(objArr2, 258037182, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent2, -258037181);
                    int i10 = onExtraCallbackWithResult + 91;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    return unit;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3072, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, final setClickTrackingUrls.onNavigationEvent onnavigationevent, final Function1 function1, final initSDK initsdk, final setClickTrackingRequests setclicktrackingrequests, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onNavigationEvent + 89;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = onExtraCallback + 27;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-368517061, i, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2.<anonymous>.<anonymous> (TdsCheckBoxV2.kt:141)");
            }
            MaxNativeAdBuilder.onExtraCallback(getsupportedhighspeedresolutionsfor, null, 0, 0, ForwardingCameraControl.onExtraCallback(193076993, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Kt$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i6 = 2 % 2;
                    int i7 = IAuthTabCallback + 29;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitIAuthTabCallback = setStarRating.IAuthTabCallback(quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, onnavigationevent, getsupportedhighspeedresolutionsfor, function1, initsdk, setclicktrackingrequests, (isContainerClickable) obj2, (getSwitchMinWidth) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                    int i9 = onWarmupCompleted + 25;
                    IAuthTabCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        return unitIAuthTabCallback;
                    }
                    Object obj6 = null;
                    obj6.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 24576, 14);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallback + 49;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onNavigationEvent + 27;
        onExtraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final setClickTrackingUrls.onNavigationEvent onnavigationevent, final Function1 function1, final setClickTrackingRequests setclicktrackingrequests, final initSDK initsdk, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport02, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(initsdk) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i5 = onNavigationEvent + 51;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                i3 = 32;
            } else {
                int i7 = onExtraCallback + 113;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 5 % 4;
                }
                i3 = 16;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 147) != 146, i2 & 1)) {
            int i9 = onExtraCallback + 59;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 42 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1797471240, i2, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2.<anonymous> (TdsCheckBoxV2.kt:140)");
                }
                putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.IAuthTabCallback_Parcel(), null, null, ForwardingCameraControl.onExtraCallback(-368517061, true, new Function2() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Kt$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i11 = 2 % 2;
                        int i12 = IAuthTabCallback + 91;
                        onNavigationEvent = i12 % 128;
                        int i13 = i12 % 2;
                        Object[] objArr = {getsupportedhighspeedresolutionsfor, quirksExternalSyntheticBackport02, quirksExternalSyntheticBackport0, onnavigationevent, function1, initsdk, setclicktrackingrequests, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
                        Unit unit = (Unit) setStarRating.onExtraCallbackWithResult(objArr, 597919732, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -597919727);
                        int i14 = IAuthTabCallback + 65;
                        onNavigationEvent = i14 % 128;
                        if (i14 % 2 != 0) {
                            return unit;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3078, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.IAuthTabCallback_Parcel(), null, null, ForwardingCameraControl.onExtraCallback(-368517061, true, new Function2() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Kt$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i11 = 2 % 2;
                        int i12 = IAuthTabCallback + 91;
                        onNavigationEvent = i12 % 128;
                        int i13 = i12 % 2;
                        Object[] objArr = {getsupportedhighspeedresolutionsfor, quirksExternalSyntheticBackport02, quirksExternalSyntheticBackport0, onnavigationevent, function1, initsdk, setclicktrackingrequests, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
                        Unit unit = (Unit) setStarRating.onExtraCallbackWithResult(objArr, 597919732, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -597919727);
                        int i14 = IAuthTabCallback + 65;
                        onNavigationEvent = i14 % 128;
                        if (i14 % 2 != 0) {
                            return unit;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3078, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@NotNull final getSupportedHighSpeedResolutionsFor<setClickDestinationUri> getsupportedhighspeedresolutionsfor, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setClickTrackingRequests setclicktrackingrequests, @Nullable setClickTrackingUrls.onNavigationEvent onnavigationevent, @Nullable Function1<? super Boolean, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        setClickTrackingRequests setclicktrackingrequestsOnWarmupCompleted;
        int i4;
        int iOrdinal;
        int i5;
        Function1<? super Boolean, Unit> function12;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final setClickTrackingUrls.onNavigationEvent onnavigationevent2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final Function1<? super Boolean, Unit> function13;
        final setClickTrackingRequests setclicktrackingrequests2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        setClickTrackingUrls.onNavigationEvent onnavigationevent3;
        setClickTrackingRequests setclicktrackingrequests3;
        Function1<? super Boolean, Unit> function14;
        boolean z;
        Object obj;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-2110120797);
        if ((i & 6) == 0) {
            int i7 = onNavigationEvent + 79;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                throw null;
            }
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor) ^ true ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            int i9 = onNavigationEvent + 107;
            onExtraCallback = i9 % 128;
            i3 = i9 % 2 == 0 ? i3 | 33 : i3 | 48;
        } else {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                int i10 = onNavigationEvent + 115;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                if ((i2 & 4) == 0) {
                    setclicktrackingrequestsOnWarmupCompleted = setclicktrackingrequests;
                    int i12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setclicktrackingrequestsOnWarmupCompleted) ? 256 : 128;
                    i3 |= i12;
                } else {
                    setclicktrackingrequestsOnWarmupCompleted = setclicktrackingrequests;
                }
                i3 |= i12;
            } else {
                setclicktrackingrequestsOnWarmupCompleted = setclicktrackingrequests;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                int i13 = onExtraCallback + 89;
                onNavigationEvent = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 92 / 0;
                    iOrdinal = onnavigationevent == null ? -1 : onnavigationevent.ordinal();
                } else if (onnavigationevent == null) {
                }
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal) ? 2048 : 1024;
            }
            i5 = i2 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    function12 = function1;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 16384 : 8192;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) != 9362, i3 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i8 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            setclicktrackingrequestsOnWarmupCompleted = setImpressionRequests.IAuthTabCallback.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        }
                        setClickTrackingUrls.onNavigationEvent onnavigationevent4 = i4 != 0 ? setClickTrackingUrls.onNavigationEvent.Medium : onnavigationevent;
                        if (i5 != 0) {
                            int i15 = onNavigationEvent + 61;
                            onExtraCallback = i15 % 128;
                            if (i15 % 2 == 0) {
                                int i16 = 11 / 0;
                            }
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                            onnavigationevent3 = onnavigationevent4;
                            setclicktrackingrequests3 = setclicktrackingrequestsOnWarmupCompleted;
                            function14 = null;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                int i17 = onNavigationEvent + 67;
                                onExtraCallback = i17 % 128;
                                int i18 = i17 % 2;
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2110120797, i3, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2 (TdsCheckBoxV2.kt:132)");
                            }
                            onCrash oncrash = onCrash.CheckBox;
                            Set setOnExtraCallback = clearFaultAdjacentMetadata.onExtraCallback(Boolean.valueOf(((setClickDestinationUri) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).onExtraCallbackWithResult()));
                            z = (i3 & 14) != 4;
                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (z) {
                                int i19 = onNavigationEvent + 81;
                                onExtraCallback = i19 % 128;
                                if (i19 % 2 == 0) {
                                    int i20 = 60 / 0;
                                    obj = objOnMinimized;
                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        Function2 function2 = new Function2() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Kt$$ExternalSyntheticLambda6
                                            private static int onExtraCallback = 0;
                                            private static int onExtraCallbackWithResult = 1;

                                            public final Object invoke(Object obj2, Object obj3) {
                                                int i21 = 2 % 2;
                                                int i22 = onExtraCallbackWithResult + 43;
                                                onExtraCallback = i22 % 128;
                                                int i23 = i22 % 2;
                                                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
                                                initSDK.onNavigationEvent onnavigationevent5 = (initSDK.onNavigationEvent) obj2;
                                                setPackageName setpackagename = (setPackageName) obj3;
                                                if (i23 == 0) {
                                                    return setStarRating.onNavigationEvent(getsupportedhighspeedresolutionsfor2, onnavigationevent5, setpackagename);
                                                }
                                                setStarRating.onNavigationEvent(getsupportedhighspeedresolutionsfor2, onnavigationevent5, setpackagename);
                                                throw null;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function2);
                                        obj = function2;
                                    }
                                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                                    final setClickTrackingUrls.onNavigationEvent onnavigationevent5 = onnavigationevent3;
                                    final Function1<? super Boolean, Unit> function15 = function14;
                                    final setClickTrackingRequests setclicktrackingrequests4 = setclicktrackingrequests3;
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    setThreadList.IAuthTabCallback(oncrash, (initMiniApp) null, (initSDK) null, (Function2) obj, setOnExtraCallback, ForwardingCameraControl.onExtraCallback(-1797471240, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Kt$$ExternalSyntheticLambda7
                                        private static int onNavigationEvent = 1;
                                        private static int onWarmupCompleted;

                                        public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                            int i21 = 2 % 2;
                                            int i22 = onWarmupCompleted + 37;
                                            onNavigationEvent = i22 % 128;
                                            int i23 = i22 % 2;
                                            Object[] objArr = {getsupportedhighspeedresolutionsfor, quirksExternalSyntheticBackport06, onnavigationevent5, function15, setclicktrackingrequests4, (initSDK) obj2, (QuirksExternalSyntheticBackport0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(((Integer) obj5).intValue())};
                                            int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
                                            Unit unit = (Unit) setStarRating.onExtraCallbackWithResult(objArr, -1579329438, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 1579329440);
                                            int i24 = onNavigationEvent + 9;
                                            onWarmupCompleted = i24 % 128;
                                            if (i24 % 2 == 0) {
                                                return unit;
                                            }
                                            Object obj6 = null;
                                            obj6.hashCode();
                                            throw null;
                                        }
                                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196614, 6);
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        int i21 = onNavigationEvent + 105;
                                        onExtraCallback = i21 % 128;
                                        int i22 = i21 % 2;
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                    setclicktrackingrequests2 = setclicktrackingrequests3;
                                    onnavigationevent2 = onnavigationevent3;
                                    function13 = function14;
                                } else {
                                    obj = objOnMinimized;
                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    }
                                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport062 = quirksExternalSyntheticBackport04;
                                    final setClickTrackingUrls.onNavigationEvent onnavigationevent52 = onnavigationevent3;
                                    final Function1 function152 = function14;
                                    final setClickTrackingRequests setclicktrackingrequests42 = setclicktrackingrequests3;
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    setThreadList.IAuthTabCallback(oncrash, (initMiniApp) null, (initSDK) null, (Function2) obj, setOnExtraCallback, ForwardingCameraControl.onExtraCallback(-1797471240, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Kt$$ExternalSyntheticLambda7
                                        private static int onNavigationEvent = 1;
                                        private static int onWarmupCompleted;

                                        public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                            int i212 = 2 % 2;
                                            int i222 = onWarmupCompleted + 37;
                                            onNavigationEvent = i222 % 128;
                                            int i23 = i222 % 2;
                                            Object[] objArr = {getsupportedhighspeedresolutionsfor, quirksExternalSyntheticBackport062, onnavigationevent52, function152, setclicktrackingrequests42, (initSDK) obj2, (QuirksExternalSyntheticBackport0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(((Integer) obj5).intValue())};
                                            int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
                                            Unit unit = (Unit) setStarRating.onExtraCallbackWithResult(objArr, -1579329438, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 1579329440);
                                            int i24 = onNavigationEvent + 9;
                                            onWarmupCompleted = i24 % 128;
                                            if (i24 % 2 == 0) {
                                                return unit;
                                            }
                                            Object obj6 = null;
                                            obj6.hashCode();
                                            throw null;
                                        }
                                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196614, 6);
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    }
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                    setclicktrackingrequests2 = setclicktrackingrequests3;
                                    onnavigationevent2 = onnavigationevent3;
                                    function13 = function14;
                                }
                            }
                        } else {
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                            onnavigationevent3 = onnavigationevent4;
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        onnavigationevent3 = onnavigationevent;
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                    }
                    function14 = function12;
                    setclicktrackingrequests3 = setclicktrackingrequestsOnWarmupCompleted;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    onCrash oncrash2 = onCrash.CheckBox;
                    Set setOnExtraCallback2 = clearFaultAdjacentMetadata.onExtraCallback(Boolean.valueOf(((setClickDestinationUri) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).onExtraCallbackWithResult()));
                    if ((i3 & 14) != 4) {
                    }
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (z) {
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    onnavigationevent2 = onnavigationevent;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    function13 = function12;
                    setclicktrackingrequests2 = setclicktrackingrequestsOnWarmupCompleted;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Kt$$ExternalSyntheticLambda8
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallbackWithResult;

                        public final Object invoke(Object obj2, Object obj3) {
                            int i23 = 2 % 2;
                            int i24 = onExtraCallbackWithResult + 81;
                            IAuthTabCallback = i24 % 128;
                            if (i24 % 2 != 0) {
                                return setStarRating.onExtraCallback(getsupportedhighspeedresolutionsfor, quirksExternalSyntheticBackport03, setclicktrackingrequests2, onnavigationevent2, function13, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            }
                            Unit unitOnExtraCallback = setStarRating.onExtraCallback(getsupportedhighspeedresolutionsfor, quirksExternalSyntheticBackport03, setclicktrackingrequests2, onnavigationevent2, function13, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i25 = 90 / 0;
                            return unitOnExtraCallback;
                        }
                    });
                    int i23 = onExtraCallback + 45;
                    onNavigationEvent = i23 % 128;
                    int i24 = i23 % 2;
                    return;
                }
                return;
            }
            int i25 = onNavigationEvent + 11;
            onExtraCallback = i25 % 128;
            i3 = i25 % 2 == 0 ? i3 | 471 : i3 | 24576;
            function12 = function1;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) != 9362, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function12 = function1;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) != 9362, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<setClickDestinationUri> getsupportedhighspeedresolutionsfor, Function1<? super Boolean, Unit> function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {(setClickDestinationUri) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()};
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        setClickDestinationUri setclickdestinationuri = (setClickDestinationUri) onExtraCallbackWithResult(objArr, -2135098574, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 2135098582);
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(setclickdestinationuri.onExtraCallbackWithResult()));
            int i4 = onNavigationEvent + 93;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(setclickdestinationuri);
        int i6 = onExtraCallback + 61;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function0<Unit> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<setClickDestinationUri> $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(getSupportedHighSpeedResolutionsFor<setClickDestinationUri> getsupportedhighspeedresolutionsfor, Function1<? super Boolean, Unit> function1) {
            super(0, Intrinsics.Kotlin.class, "toggle", "checkBoxPointerInput$toggle(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;)V", 0);
            this.$state = getsupportedhighspeedresolutionsfor;
            this.$onCheckedChange = function1;
        }

        public final void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            setStarRating.onWarmupCompleted(this.$state, this.$onCheckedChange);
            int i4 = onWarmupCompleted + 123;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback();
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 33 / 0;
            }
            return unit;
        }
    }

    private static final QuirksExternalSyntheticBackport0 onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final Context context, final getSupportedHighSpeedResolutionsFor<setClickDestinationUri> getsupportedhighspeedresolutionsfor, final Function1<? super Boolean, Unit> function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            if (varyFields.onWarmupCompleted(context)) {
                int i3 = onNavigationEvent + 1;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 73 / 0;
                    if (function1 == null) {
                        return quirksExternalSyntheticBackport0;
                    }
                } else if (function1 == null) {
                    return quirksExternalSyntheticBackport0;
                }
                return measureChildConstrained.onExtraCallback(quirksExternalSyntheticBackport0, false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, new onWarmupCompleted(getsupportedhighspeedresolutionsfor, function1), 15, (Object) null);
            }
            return resolveQuirkNames.onNavigationEvent(quirksExternalSyntheticBackport0, (Function1) null, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Kt$$ExternalSyntheticLambda17
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = 2 % 2;
                    int i6 = onNavigationEvent + 117;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        return setStarRating.onExtraCallback(function1, context, getsupportedhighspeedresolutionsfor, (QuirksExternalSyntheticBackport0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    setStarRating.onExtraCallback(function1, context, getsupportedhighspeedresolutionsfor, (QuirksExternalSyntheticBackport0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    throw null;
                }
            }, 1, (Object) null);
        }
        varyFields.onWarmupCompleted(context);
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent((getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor, extensionsManager1.onExtraCallbackWithResult());
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onNavigationEvent((getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor, extensionsManager1.onExtraCallbackWithResult());
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 121;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 27 / 0;
        }
        return unit2;
    }

    static final class IAuthTabCallback implements PointerInputEventHandler {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function1<Boolean, Unit> IAuthTabCallback;
        final /* synthetic */ Context onExtraCallback;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<setClickDestinationUri> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(Function1<? super Boolean, Unit> function1, getSupportedHighSpeedResolutionsFor<setClickDestinationUri> getsupportedhighspeedresolutionsfor, Context context) {
            this.IAuthTabCallback = function1;
            this.onWarmupCompleted = getsupportedhighspeedresolutionsfor;
            this.onExtraCallback = context;
        }

        /* renamed from: o.setStarRating$IAuthTabCallback$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements getBacktraceNote<Camera2CameraImplExternalSyntheticLambda0, setUseCaseAttached, access13800<? super Unit>, Object> {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ Context $context;
            final /* synthetic */ Ref.BooleanRef $isFirstDown;
            final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;
            final /* synthetic */ getSupportedHighSpeedResolutionsFor<setClickDestinationUri> $state;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Ref.BooleanRef booleanRef, Context context, getSupportedHighSpeedResolutionsFor<setClickDestinationUri> getsupportedhighspeedresolutionsfor, Function1<? super Boolean, Unit> function1, access13800<? super AnonymousClass1> access13800Var) {
                super(3, access13800Var);
                this.$isFirstDown = booleanRef;
                this.$context = context;
                this.$state = getsupportedhighspeedresolutionsfor;
                this.$onCheckedChange = function1;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 79;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((Camera2CameraImplExternalSyntheticLambda0) obj, ((setUseCaseAttached) obj2).onExtraCallback(), (access13800) obj3);
                int i4 = onNavigationEvent + 101;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(Camera2CameraImplExternalSyntheticLambda0 camera2CameraImplExternalSyntheticLambda0, long j, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isFirstDown, this.$context, this.$state, this.$onCheckedChange, access13800Var);
                anonymousClass1.L$0 = camera2CameraImplExternalSyntheticLambda0;
                Object objInvokeSuspend = anonymousClass1.invokeSuspend(Unit.INSTANCE);
                int i2 = onNavigationEvent + 115;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Camera2CameraImplExternalSyntheticLambda0 camera2CameraImplExternalSyntheticLambda0 = (Camera2CameraImplExternalSyntheticLambda0) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                Object obj2 = null;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    if (this.$isFirstDown.element) {
                        minFresh.IAuthTabCallback(this.$context, null, 1, null);
                        this.$isFirstDown.element = false;
                    }
                    getSupportedHighSpeedResolutionsFor<setClickDestinationUri> getsupportedhighspeedresolutionsfor = this.$state;
                    getsupportedhighspeedresolutionsfor.IAuthTabCallback(setStarRating.onNavigationEvent((setClickDestinationUri) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()));
                    this.L$0 = access15400.onNavigationEvent(camera2CameraImplExternalSyntheticLambda0);
                    this.label = 1;
                    obj = camera2CameraImplExternalSyntheticLambda0.onNavigationEvent(this);
                    if (obj == objOnWarmupCompleted) {
                        int i3 = onNavigationEvent + 105;
                        onWarmupCompleted = i3 % 128;
                        int i4 = i3 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    int i5 = onNavigationEvent + 119;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        setStarRating.onWarmupCompleted(this.$state, this.$onCheckedChange);
                        int i6 = 66 / 0;
                    } else {
                        setStarRating.onWarmupCompleted(this.$state, this.$onCheckedChange);
                    }
                } else {
                    getSupportedHighSpeedResolutionsFor<setClickDestinationUri> getsupportedhighspeedresolutionsfor2 = this.$state;
                    getsupportedhighspeedresolutionsfor2.IAuthTabCallback(setStarRating.onExtraCallbackWithResult((setClickDestinationUri) getsupportedhighspeedresolutionsfor2.onExtraCallbackWithResult()));
                }
                Unit unit = Unit.INSTANCE;
                int i7 = onWarmupCompleted + 33;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    return unit;
                }
                obj2.hashCode();
                throw null;
            }
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            if (this.IAuthTabCallback == null) {
                if (!((setClickDestinationUri) this.onWarmupCompleted.onExtraCallbackWithResult()).onTransact()) {
                    return Unit.INSTANCE;
                }
                int i2 = onExtraCallbackWithResult + 109;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                getSupportedHighSpeedResolutionsFor<setClickDestinationUri> getsupportedhighspeedresolutionsfor = this.onWarmupCompleted;
                getsupportedhighspeedresolutionsfor.IAuthTabCallback(setStarRating.onExtraCallbackWithResult((setClickDestinationUri) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()));
                return Unit.INSTANCE;
            }
            Object objOnNavigationEvent = Camera2CameraInfoImplExternalSyntheticLambda0.onNavigationEvent(highPriorityExecutor, (Function1) null, (Function1) null, new AnonymousClass1(new Ref.BooleanRef(), this.onExtraCallback, this.onWarmupCompleted, this.IAuthTabCallback, null), (Function1) null, access13800Var, 11, (Object) null);
            if (objOnNavigationEvent != access14300.onWarmupCompleted()) {
                return Unit.INSTANCE;
            }
            int i4 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final QuirksExternalSyntheticBackport0 onNavigationEvent(Function1 function1, Context context, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 69;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1922976382);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onNavigationEvent + 43;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1922976382, i, -1, "im.toss.tds.compose.component.atom.checkbox.checkBoxPointerInput.<anonymous> (TdsCheckBoxV2.kt:255)");
                int i6 = 11 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1922976382, i, -1, "im.toss.tds.compose.component.atom.checkbox.checkBoxPointerInput.<anonymous> (TdsCheckBoxV2.kt:255)");
            }
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(ExtensionsManager1.onNavigationEvent(ExtensionsManager1.Companion.onNavigationEvent()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Kt$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i7 = 2 % 2;
                    int i8 = onWarmupCompleted + 71;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitOnWarmupCompleted = setStarRating.onWarmupCompleted(getsupportedhighspeedresolutionsfor2, (ExtensionsManager1) obj);
                    int i10 = onWarmupCompleted + 125;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    return unitOnWarmupCompleted;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            int i7 = onNavigationEvent + 79;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = calculatePlaceholderForExtensions.onExtraCallbackWithResult(onextracallback, (Function1) objOnMinimized2);
        Unit unit = Unit.INSTANCE;
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor);
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnNavigationEvent | zOnExtraCallback | zOnNavigationEvent2)) {
            int i9 = onNavigationEvent + 85;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                onwarmupcompleted.onExtraCallback();
                throw null;
            }
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new IAuthTabCallback(function1, getsupportedhighspeedresolutionsfor, context);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = SequentialExecutorWorkerRunningState.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, unit, (PointerInputEventHandler) objOnMinimized3);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i10 = onNavigationEvent + 99;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i12 = onNavigationEvent + 83;
        onExtraCallback = i12 % 128;
        int i13 = i12 % 2;
        return quirksExternalSyntheticBackport0IAuthTabCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        setClickDestinationUri setclickdestinationuri = (setClickDestinationUri) objArr[0];
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 33;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            z = false;
            z2 = false;
            z3 = false;
            i = 4;
        } else {
            z = false;
            z2 = false;
            z3 = true;
            i = 3;
        }
        setClickDestinationUri setclickdestinationuriOnExtraCallback = setClickDestinationUri.onExtraCallback(setclickdestinationuri, z, z2, z3, i, null);
        int i4 = onExtraCallback + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return setclickdestinationuriOnExtraCallback;
    }

    private static final setClickDestinationUri IAuthTabCallback(setClickDestinationUri setclickdestinationuri) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallback = i2 % 128;
        return i2 % 2 == 0 ? setClickDestinationUri.onExtraCallback(setclickdestinationuri, false, true, true, 4, null) : setClickDestinationUri.onExtraCallback(setclickdestinationuri, false, false, false, 3, null);
    }

    public static final void onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 91;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1418140095);
            obj.hashCode();
            throw null;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1418140095);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onExtraCallback + 69;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1418140095, i, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Preview (TdsCheckBoxV2.kt:418)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1418140095, i, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Preview (TdsCheckBoxV2.kt:418)");
            }
            y4.onNavigationEvent(null, null, null, null, setJsTrackers.onExtraCallback.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24576, 15);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsCheckBoxV2Kt$.ExternalSyntheticLambda4(i));
        }
    }

    private static final long onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        long jAccess100 = ((setByteOrder) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).access100();
        int i4 = onNavigationEvent + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return jAccess100;
    }

    private static final long onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        setByteOrder setbyteorder = (setByteOrder) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            setbyteorder.access100();
            throw null;
        }
        long jAccess100 = setbyteorder.access100();
        int i4 = onNavigationEvent + 109;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return jAccess100;
        }
        throw null;
    }

    private static final long onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setByteOrder setbyteorder = (setByteOrder) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            return setbyteorder.access100();
        }
        long jAccess100 = setbyteorder.access100();
        int i4 = 55 / 0;
        return jAccess100;
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<ExtensionsManager1> getsupportedhighspeedresolutionsfor, long j) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(ExtensionsManager1.onNavigationEvent(j));
        int i4 = onExtraCallback + 43;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(removeAdapter removeadapter) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(new Object[]{removeadapter}, 36754225, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -36754225);
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, setClickTrackingUrls.onNavigationEvent onnavigationevent, Function1 function1, initSDK initsdk, setClickTrackingRequests setclicktrackingrequests, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, onnavigationevent, function1, initsdk, setclicktrackingrequests, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(objArr, 597919732, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -597919727);
    }

    public static /* synthetic */ Unit IAuthTabCallback(isContainerClickable iscontainerclickable, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Function1 function1, getSwitchMinWidth getswitchminwidth, initSDK initsdk, setClickTrackingRequests setclicktrackingrequests, FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {iscontainerclickable, getsupportedhighspeedresolutionsfor, function1, getswitchminwidth, initsdk, setclicktrackingrequests, focusMeteringControlExternalSyntheticLambda9, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(objArr, 258037182, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -258037181);
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setClickTrackingUrls.onNavigationEvent onnavigationevent, Function1 function1, setClickTrackingRequests setclicktrackingrequests, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, quirksExternalSyntheticBackport0, onnavigationevent, function1, setclicktrackingrequests, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(objArr, -1579329438, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 1579329440);
    }

    public static final void onWarmupCompleted(boolean z, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, @Nullable setClickTrackingUrls.IAuthTabCallback iAuthTabCallback, @Nullable setClickTrackingUrls.onNavigationEvent onnavigationevent, @Nullable Function1<? super Boolean, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        Object[] objArr = {Boolean.valueOf(z), quirksExternalSyntheticBackport0, Boolean.valueOf(z2), iAuthTabCallback, onnavigationevent, function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        onExtraCallbackWithResult(objArr, -471264704, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 471264710);
    }

    private static final Unit asInterface(removeAdapter removeadapter) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(new Object[]{removeadapter}, -993862909, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 993862916);
    }

    private static final Unit onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, setOrientationDegrees setorientationdegrees) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(new Object[]{cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, setorientationdegrees}, 901465855, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -901465846);
    }

    private static final Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setClickTrackingRequests setclicktrackingrequests, setClickTrackingUrls.onNavigationEvent onnavigationevent, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, quirksExternalSyntheticBackport0, setclicktrackingrequests, onnavigationevent, function1, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(objArr, 1649850922, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -1649850919);
    }

    private static final setClickDestinationUri onWarmupCompleted(setClickDestinationUri setclickdestinationuri) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        return (setClickDestinationUri) onExtraCallbackWithResult(new Object[]{setclickdestinationuri}, 257596894, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -257596890);
    }

    private static final setClickDestinationUri onExtraCallback(setClickDestinationUri setclickdestinationuri) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        return (setClickDestinationUri) onExtraCallbackWithResult(new Object[]{setclickdestinationuri}, -2135098574, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 2135098582);
    }
}
