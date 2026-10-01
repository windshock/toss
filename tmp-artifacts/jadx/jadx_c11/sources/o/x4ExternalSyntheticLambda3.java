package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$;
import im.toss.tds.compose.component.compound.tab.v1.RightAccessoryPreset;
import im.toss.tds.view.R;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirksExternalSyntheticBackport0;
import o.VirtualCameraCaptureResult;
import o.component8;
import o.createCameraCaptureCallback;
import o.getBacktraceNote;
import o.getStreamSharingChildren;
import o.isExtraPreviewRequired;
import o.putCharArray;
import o.r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA;
import o.setIso;
import o.setTaggedAddrCtrl;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import o.x4ExternalSyntheticLambda2;
import o.x4ExternalSyntheticLambda3;
import o.x4ExternalSyntheticLambda4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x4ExternalSyntheticLambda3 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent.values().length];
            try {
                iArr[r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent.Auto.ordinal()] = 1;
                int i = IAuthTabCallback + 61;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent.Fluid.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback.values().length];
            try {
                iArr2[r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback.Underline.ordinal()] = 1;
                int i4 = IAuthTabCallback + 55;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback.Square.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallback = iArr2;
            int i6 = onWarmupCompleted + 35;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        RightAccessoryPreset rightAccessoryPreset = (RightAccessoryPreset) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(iIntValue), rightAccessoryPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue2)}, -772913070, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 772913077, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i3 = onExtraCallback + 67;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitAsBinder = asBinder(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 17;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitAsBinder;
    }

    private static final Unit IAuthTabCallback(int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, setTaggedAddrCtrl settaggedaddrctrl, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult, long j, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, getBacktraceNote getbacktracenote, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 109;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(i), quirksExternalSyntheticBackport0, iAuthTabCallback, onwarmupcompleted, settaggedaddrctrl, onextracallbackwithresult, Long.valueOf(j), deviceQuirksExternalSyntheticLambda0, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1)), Integer.valueOf(i3)}, -323720451, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 323720470, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        } else {
            onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(i), quirksExternalSyntheticBackport0, iAuthTabCallback, onwarmupcompleted, settaggedaddrctrl, onextracallbackwithresult, Long.valueOf(j), deviceQuirksExternalSyntheticLambda0, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1)), Integer.valueOf(i3)}, -323720451, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 323720470, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 121;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 12 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 93;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 != 0) {
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            return (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{numValueOf, getsupportedhighspeedresolutionsfor}, 1811808017, iOnWarmupCompleted, iOnWarmupCompleted2, -1811808002, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        }
        int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted4 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent onnavigationevent, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, getBacktraceNote getbacktracenote, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 123;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, onnavigationevent, onwarmupcompleted, getbacktracenote, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onExtraCallback + 3;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(List list, isExtraPreviewRequired isextrapreviewrequired, int i, int i2, int i3, setTaggedAddrCtrl settaggedaddrctrl, List list2, int i4, int i5, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i6 = 2 % 2;
        int i7 = onExtraCallback + 57;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return onWarmupCompleted(list, isextrapreviewrequired, i, i2, i3, settaggedaddrctrl, list2, i4, i5, onextracallbackwithresult);
        }
        onWarmupCompleted(list, isextrapreviewrequired, i, i2, i3, settaggedaddrctrl, list2, i4, i5, onextracallbackwithresult);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, boolean z, float f, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 117;
        onExtraCallback = i5 % 128;
        onNavigationEvent(quirksExternalSyntheticBackport0, j, z, f, function2, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 77;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 7;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -744859420, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 744859433, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 123;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface(getsupportedhighspeedresolutionsfor, x4externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 93;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit IAuthTabCallback(r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, long j, getBacktraceNote getbacktracenote, setTaggedAddrCtrl settaggedaddrctrl, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 107;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(iAuthTabCallback, onwarmupcompleted, quirksExternalSyntheticBackport0, onextracallbackwithresult, deviceQuirksExternalSyntheticLambda0, j, getbacktracenote, settaggedaddrctrl, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 42 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit IAuthTabCallbackDefault(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 67;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) throws NoWhenBranchMatchedException {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        x4ExternalSyntheticLambda4 x4externalsyntheticlambda4 = (x4ExternalSyntheticLambda4) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor, x4externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onExtraCallback + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        int i5 = onExtraCallback + 63;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) throws NoWhenBranchMatchedException {
        x4ExternalSyntheticLambda2 x4externalsyntheticlambda2 = (x4ExternalSyntheticLambda2) objArr[0];
        List list = (List) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{x4externalsyntheticlambda2, list, Integer.valueOf(iIntValue), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2 | 1))}, 415032346, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -415032343, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return unit;
    }

    private static final Unit asBinder(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i))}, -1184222077, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1184222097, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        } else {
            onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))}, -1184222077, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1184222097, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) throws NoWhenBranchMatchedException {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        x4ExternalSyntheticLambda4 x4externalsyntheticlambda4 = (x4ExternalSyntheticLambda4) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(getsupportedhighspeedresolutionsfor, x4externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onWarmupCompleted + 43;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallback(float f, boolean z, long j, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 81;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            onNavigationEvent(f, z, j, quirksExternalSyntheticBackport0, function2, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(f, z, j, quirksExternalSyntheticBackport0, function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 41;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, RightAccessoryPreset rightAccessoryPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, rightAccessoryPreset, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 53;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 49;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnTransact = onTransact(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 62 / 0;
        }
        int i7 = onExtraCallback + 105;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, setTaggedAddrCtrl settaggedaddrctrl, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult, long j, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, getBacktraceNote getbacktracenote, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 43;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(i, quirksExternalSyntheticBackport0, iAuthTabCallback, onwarmupcompleted, settaggedaddrctrl, onextracallbackwithresult, j, deviceQuirksExternalSyntheticLambda0, getbacktracenote, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        if (i7 == 0) {
            int i8 = 31 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 69;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(i, getsupportedhighspeedresolutionsfor);
        int i5 = onExtraCallback + 115;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 105;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 72 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 55;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return asBinder(getsupportedhighspeedresolutionsfor, x4externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        asBinder(getsupportedhighspeedresolutionsfor, x4externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, int i, x4ExternalSyntheticLambda2 x4externalsyntheticlambda2, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 35;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return onTransact(iAuthTabCallback, onwarmupcompleted, i, x4externalsyntheticlambda2, list, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onTransact(iAuthTabCallback, onwarmupcompleted, i, x4externalsyntheticlambda2, list, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, long j, getBacktraceNote getbacktracenote, setTaggedAddrCtrl settaggedaddrctrl, int i, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return onExtraCallbackWithResult(iAuthTabCallback, onwarmupcompleted, quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, j, getbacktracenote, settaggedaddrctrl, i, onextracallbackwithresult, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onExtraCallbackWithResult(iAuthTabCallback, onwarmupcompleted, quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, j, getbacktracenote, settaggedaddrctrl, i, onextracallbackwithresult, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(setTaggedAddrCtrl settaggedaddrctrl, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 39;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(settaggedaddrctrl, list, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(settaggedaddrctrl, list, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 107;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallback(x4ExternalSyntheticLambda2 x4externalsyntheticlambda2, List list, int i, float f, float f2, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 41;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(x4externalsyntheticlambda2, (List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE>) list, i, f, f2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 89;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 84 / 0;
        }
        return unit;
    }

    public static /* synthetic */ component8 onExtraCallback(r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, setTaggedAddrCtrl settaggedaddrctrl, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, int i, findResAndMsg findresandmsg, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 5;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        component8 component8VarOnWarmupCompleted = onWarmupCompleted(iAuthTabCallback, settaggedaddrctrl, deviceQuirksExternalSyntheticLambda0, deviceQuirksExternalSyntheticLambda02, i, findresandmsg, onextracallbackwithresult, getbacktracenote, isextrapreviewrequired, virtualCameraCaptureResult);
        int i5 = onWarmupCompleted + 53;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return component8VarOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        setTaggedAddrCtrl settaggedaddrctrl = (setTaggedAddrCtrl) objArr[0];
        List list = (List) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        float fFloatValue2 = ((Number) objArr[3]).floatValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{settaggedaddrctrl, list, Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, 386529533, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -386529519, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))}, -351968579, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 351968581, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 77;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, setTaggedAddrCtrl settaggedaddrctrl, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult, long j, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, getBacktraceNote getbacktracenote, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 59;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(i, quirksExternalSyntheticBackport0, iAuthTabCallback, onwarmupcompleted, settaggedaddrctrl, onextracallbackwithresult, j, deviceQuirksExternalSyntheticLambda0, getbacktracenote, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onWarmupCompleted + 23;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 53;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(i, getsupportedhighspeedresolutionsfor);
        int i5 = onWarmupCompleted + 119;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(int i, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent onnavigationevent, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, getBacktraceNote getbacktracenote, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 23;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        onExtraCallbackWithResult(i, onnavigationevent, onwarmupcompleted, (getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onWarmupCompleted + 63;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(boolean z, long j, setIso setiso) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Boolean.valueOf(z), Long.valueOf(j), setiso};
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        if (i3 != 0) {
            unit = (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, -1037773439, iOnWarmupCompleted, iOnWarmupCompleted2, 1037773451, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
            int i4 = 39 / 0;
        } else {
            unit = (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, -1037773439, iOnWarmupCompleted, iOnWarmupCompleted2, 1037773451, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        }
        int i5 = onExtraCallback + 55;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03f3 A[PHI: r4
      0x03f3: PHI (r4v10 o.CameraCaptureResultEmptyCameraCaptureResult) = (r4v9 o.CameraCaptureResultEmptyCameraCaptureResult), (r4v14 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:93:0x03f1, B:90:0x03e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0407 A[PHI: r4
      0x0407: PHI (r4v13 o.CameraCaptureResultEmptyCameraCaptureResult) = (r4v9 o.CameraCaptureResultEmptyCameraCaptureResult), (r4v14 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:93:0x03f1, B:90:0x03e8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws NoWhenBranchMatchedException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i7;
        long jAsBinder;
        Unit unitAsInterface;
        int i8 = ~i2;
        int i9 = ~((~i5) | i8);
        int i10 = ~i3;
        int i11 = i9 | (~(i10 | i5)) | (~(i2 | i5));
        int i12 = i8 | i5;
        int i13 = i10 | i12;
        int i14 = i2 + i5 + i4 + ((-1542968645) * i) + (1789173782 * i6);
        int i15 = i14 * i14;
        int i16 = (1553370224 * i2) + 752877568 + ((-368479342) * i5) + (i11 * 1186558865) + (1921849566 * i12) + (1186558865 * i13) + ((-1555038208) * i4) + (1802502144 * i) + (148897792 * i6) + (289275904 * i15);
        int i17 = (i2 * (-930071408)) + 1959937684 + (i5 * (-930070194)) + (i11 * 607) + (i12 * (-1214)) + (i13 * 607) + ((-930070801) * i4) + (1059663509 * i) + ((-1428764534) * i6) + (i15 * 484573184);
        int i18 = 4;
        int i19 = 0;
        int i20 = 2;
        switch (i16 + (i17 * i17 * 411172864)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                final x4ExternalSyntheticLambda2 x4externalsyntheticlambda2 = (x4ExternalSyntheticLambda2) objArr[0];
                final List list = (List) objArr[1];
                final int iIntValue = ((Number) objArr[2]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
                final int iIntValue2 = ((Number) objArr[4]).intValue();
                int i21 = 2 % 2;
                int i22 = onExtraCallback + 55;
                onWarmupCompleted = i22 % 128;
                if (i22 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(48803367);
                    if ((iIntValue2 & 124) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(x4externalsyntheticlambda2)) {
                            int i23 = onExtraCallback + 77;
                            onWarmupCompleted = i23 % 128;
                            int i24 = i23 % 2;
                        } else {
                            i18 = 2;
                        }
                        i7 = i18 | iIntValue2;
                    } else {
                        i7 = iIntValue2;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(48803367);
                    if ((iIntValue2 & 6) == 0) {
                    }
                }
                if ((iIntValue2 & 48) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    int i25 = onExtraCallback + 31;
                    onWarmupCompleted = i25 % 128;
                    int i26 = i25 % 2;
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIntValue) ? 256 : 128;
                }
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 147) != 146, i7 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                } else {
                    int i27 = onWarmupCompleted + 31;
                    onExtraCallback = i27 % 128;
                    int i28 = i27 % 2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(48803367, i7, -1, "im.toss.tds.compose.component.compound.tab.Underline (TdsTabV1.kt:588)");
                    }
                    r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE r8lambdaeefvmne8k6v5fl9rzzhexzkg1me = (r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE) CollectionsKt.getOrNull(list, iIntValue);
                    if (r8lambdaeefvmne8k6v5fl9rzzhexzkg1me != null) {
                        int i29 = onExtraCallback + 55;
                        onWarmupCompleted = i29 % 128;
                        int i30 = i29 % 2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2092614876);
                        x4ExternalSyntheticLambda2.onNavigationEvent(1709985335, -1709985332, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{x4externalsyntheticlambda2, x4externalsyntheticlambda2.onWarmupCompleted((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion, r8lambdaeefvmne8k6v5fl9rzzhexzkg1me), Float.valueOf(0.0f), null, 0L, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i7 << 12) & 57344), 14}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        int i31 = onWarmupCompleted + 81;
                        onExtraCallback = i31 % 128;
                        int i32 = i31 % 2;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2092488737);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2092314021);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i33 = onExtraCallback + 35;
                        onWarmupCompleted = i33 % 128;
                        int i34 = i33 % 2;
                    }
                }
                clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda11
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2) {
                            int i35 = 2 % 2;
                            int i36 = onNavigationEvent + 123;
                            onWarmupCompleted = i36 % 128;
                            int i37 = i36 % 2;
                            Unit unitOnNavigationEvent = x4ExternalSyntheticLambda3.onNavigationEvent(x4externalsyntheticlambda2, list, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i38 = onWarmupCompleted + 101;
                            onNavigationEvent = i38 % 128;
                            if (i38 % 2 != 0) {
                                return unitOnNavigationEvent;
                            }
                            throw null;
                        }
                    });
                }
                return null;
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                final int iIntValue3 = ((Number) objArr[0]).intValue();
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[1];
                r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback) objArr[2];
                final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted) objArr[3];
                r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent) objArr[4];
                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = (setTaggedAddrCtrl) objArr[5];
                long jLongValue = ((Number) objArr[6]).longValue();
                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnWarmupCompleted = (DeviceQuirksExternalSyntheticLambda0) objArr[7];
                getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[8];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
                int iIntValue4 = ((Number) objArr[10]).intValue();
                int iIntValue5 = ((Number) objArr[11]).intValue();
                int i35 = 2 % 2;
                Intrinsics.checkNotNullParameter(getbacktracenote, "");
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (iIntValue5 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : onextracallback;
                final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback IAuthTabCallback2 = (iIntValue5 & 4) != 0 ? r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback.Companion.IAuthTabCallback() : iAuthTabCallback;
                if ((iIntValue5 & 8) != 0) {
                    onwarmupcompletedOnExtraCallbackWithResult = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted.Companion.onExtraCallbackWithResult();
                }
                if ((iIntValue5 & 16) != 0) {
                    int i36 = onWarmupCompleted + 91;
                    onExtraCallback = i36 % 128;
                    int i37 = i36 % 2;
                    onnavigationeventOnExtraCallbackWithResult = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent.Companion.onExtraCallbackWithResult();
                }
                if ((iIntValue5 & 32) != 0) {
                    encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(1528683769, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda33
                        private static int onExtraCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                            int i38 = 2 % 2;
                            int i39 = onExtraCallback + 47;
                            onNavigationEvent = i39 % 128;
                            int i40 = i39 % 2;
                            Unit unitOnExtraCallback = x4ExternalSyntheticLambda3.onExtraCallback(IAuthTabCallback2, onwarmupcompletedOnExtraCallbackWithResult, iIntValue3, (x4ExternalSyntheticLambda2) obj, (List) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i41 = onNavigationEvent + 7;
                            onExtraCallback = i41 % 128;
                            int i42 = i41 % 2;
                            return unitOnExtraCallback;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54);
                }
                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxy = encoderProfilesProxyVideoProfileProxyOnExtraCallback;
                if ((iIntValue5 & 64) != 0) {
                    int i38 = onExtraCallback + 13;
                    onWarmupCompleted = i38 % 128;
                    jAsBinder = i38 % 2 == 0 ? r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted.asBinder(cameraCaptureResultEmptyCameraCaptureResult2, 127) : r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted.asBinder(cameraCaptureResultEmptyCameraCaptureResult2, 6);
                } else {
                    jAsBinder = jLongValue;
                }
                if ((iIntValue5 & 128) != 0) {
                    deviceQuirksExternalSyntheticLambda0OnWarmupCompleted = r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted.onWarmupCompleted(IAuthTabCallback2);
                    int i39 = onExtraCallback + 53;
                    onWarmupCompleted = i39 % 128;
                    int i40 = i39 % 2;
                }
                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = deviceQuirksExternalSyntheticLambda0OnWarmupCompleted;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(267026206, iIntValue4, -1, "im.toss.tds.compose.component.compound.tab.TdsTabV1 (TdsTabV1.kt:253)");
                }
                int i41 = onExtraCallbackWithResult.onNavigationEvent[onnavigationeventOnExtraCallbackWithResult.ordinal()];
                if (i41 == 1) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1085834344);
                    onNavigationEvent(iIntValue3, (QuirksExternalSyntheticBackport0) onextracallback2, IAuthTabCallback2, onwarmupcompletedOnExtraCallbackWithResult, (setTaggedAddrCtrl<? super x4ExternalSyntheticLambda2, ? super List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) encoderProfilesProxyVideoProfileProxy, (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult) null, jAsBinder, deviceQuirksExternalSyntheticLambda0, (getBacktraceNote<? super x4ExternalSyntheticLambda4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult2, (iIntValue4 & 8190) | ((iIntValue4 >> 3) & 57344) | (3670016 & iIntValue4) | (29360128 & iIntValue4) | (234881024 & iIntValue4), 32);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                } else {
                    if (i41 != 2) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1085835660);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        throw new NoWhenBranchMatchedException();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1085823080);
                    onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(iIntValue3), onextracallback2, IAuthTabCallback2, onwarmupcompletedOnExtraCallbackWithResult, encoderProfilesProxyVideoProfileProxy, null, Long.valueOf(jAsBinder), deviceQuirksExternalSyntheticLambda0, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((234881024 & iIntValue4) | (iIntValue4 & 8190) | ((iIntValue4 >> 3) & 57344) | (3670016 & iIntValue4) | (iIntValue4 & 29360128)), 32}, -323720451, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 323720470, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i42 = onWarmupCompleted + 35;
                    onExtraCallback = i42 % 128;
                    int i43 = i42 % 2;
                }
                return null;
            case 7:
                int iIntValue6 = ((Number) objArr[0]).intValue();
                RightAccessoryPreset rightAccessoryPreset = (RightAccessoryPreset) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue7 = ((Number) objArr[3]).intValue();
                int i44 = 2 % 2;
                Intrinsics.checkNotNullParameter(rightAccessoryPreset, "");
                if ((iIntValue7 & 6) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(rightAccessoryPreset)) {
                        int i45 = onExtraCallback + 85;
                        onWarmupCompleted = i45 % 128;
                        if (i45 % 2 == 0) {
                            i18 = 3;
                        }
                    } else {
                        i18 = 2;
                    }
                    iIntValue7 |= i18;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted((iIntValue7 & 19) != 18, iIntValue7 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1240692837, iIntValue7, -1, "im.toss.tds.compose.component.compound.tab.TabSquarePreview.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsTabV1.kt:852)");
                    }
                    rightAccessoryPreset.onWarmupCompleted(((Number) CollectionsKt.listOf(new Integer[]{0, 6, 19, 112}).get(iIntValue6)).intValue(), null, 0L, 0L, cameraCaptureResultEmptyCameraCaptureResult3, (iIntValue7 << 12) & 57344, 14);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i46 = onExtraCallback + 1;
                        onWarmupCompleted = i46 % 128;
                        int i47 = i46 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 8:
                return onWarmupCompleted(objArr);
            case 9:
                return onTransact(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return asBinder(objArr);
            case 12:
                return IAuthTabCallbackDefault(objArr);
            case 13:
                return asInterface(objArr);
            case 14:
                return access100(objArr);
            case 15:
                int iIntValue8 = ((Number) objArr[0]).intValue();
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
                int i48 = 2 % 2;
                int i49 = onWarmupCompleted + 91;
                onExtraCallback = i49 % 128;
                int i50 = i49 % 2;
                onNavigationEvent((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor, iIntValue8);
                unitAsInterface = Unit.INSTANCE;
                int i51 = onExtraCallback + 59;
                onWarmupCompleted = i51 % 128;
                int i52 = i51 % 2;
                return unitAsInterface;
            case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                return IAuthTabCallbackStubProxy(objArr);
            case R.styleable.TdsListRowV1View_centerType /* 17 */:
                return getInterfaceDescriptor(objArr);
            case R.styleable.TdsListRowV1View_disabledType /* 18 */:
                int iIntValue9 = ((Number) objArr[0]).intValue();
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[1];
                int i53 = 2 % 2;
                int i54 = onWarmupCompleted + 3;
                onExtraCallback = i54 % 128;
                int i55 = i54 % 2;
                unitAsInterface = asInterface(iIntValue9, getsupportedhighspeedresolutionsfor2);
                int i56 = onWarmupCompleted + 31;
                onExtraCallback = i56 % 128;
                int i57 = i56 % 2;
                return unitAsInterface;
            case R.styleable.TdsListRowV1View_leftDate /* 19 */:
                return IAuthTabCallback_Parcel(objArr);
            case R.styleable.TdsListRowV1View_leftImage /* 20 */:
                return access000(objArr);
            case R.styleable.TdsListRowV1View_leftImageColor /* 21 */:
                return ICustomTabsCallback(objArr);
            default:
                final isExtraPreviewRequired isextrapreviewrequired = (isExtraPreviewRequired) objArr[0];
                final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback2 = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback) objArr[1];
                long jLongValue2 = ((Number) objArr[2]).longValue();
                final setTaggedAddrCtrl settaggedaddrctrl = (setTaggedAddrCtrl) objArr[3];
                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02 = (DeviceQuirksExternalSyntheticLambda0) objArr[4];
                final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03 = (DeviceQuirksExternalSyntheticLambda0) objArr[5];
                List list2 = (List) objArr[6];
                final int iIntValue10 = ((Number) objArr[7]).intValue();
                final findResAndMsg findresandmsg = (findResAndMsg) objArr[8];
                final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult) objArr[9];
                int i58 = 2 % 2;
                final int iOnExtraCallbackWithResult = isextrapreviewrequired.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda02.onNavigationEvent(isextrapreviewrequired.onExtraCallback()));
                int iOnExtraCallbackWithResult2 = isextrapreviewrequired.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda02.onExtraCallbackWithResult(isextrapreviewrequired.onExtraCallback()));
                int iOnExtraCallbackWithResult3 = iAuthTabCallback2 == r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback.Square ? isextrapreviewrequired.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)) : 0;
                final ArrayList arrayList = new ArrayList(list2.size());
                int size = list2.size();
                for (int i59 = 0; i59 < size; i59++) {
                    int i60 = onExtraCallback + 111;
                    onWarmupCompleted = i60 % 128;
                    int i61 = i60 % 2;
                    arrayList.add(((component7) list2.get(i59)).onExtraCallback(jLongValue2));
                }
                final Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = iOnExtraCallbackWithResult2 + iOnExtraCallbackWithResult;
                final Ref.IntRef intRef2 = new Ref.IntRef();
                final ArrayList arrayList2 = new ArrayList();
                int size2 = arrayList.size();
                int interfaceDescriptor = iOnExtraCallbackWithResult;
                while (i19 < size2) {
                    getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) arrayList.get(i19);
                    if (i19 > 0) {
                        int i62 = onExtraCallback + 35;
                        onWarmupCompleted = i62 % 128;
                        int i63 = i62 % i20;
                        interfaceDescriptor += iOnExtraCallbackWithResult3;
                        intRef.element += iOnExtraCallbackWithResult3;
                    }
                    intRef.element += getstreamsharingchildren.getInterfaceDescriptor();
                    intRef2.element = Math.max(intRef2.element, getstreamsharingchildren.T_());
                    arrayList2.add(new r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE(isextrapreviewrequired.c_(interfaceDescriptor), isextrapreviewrequired.c_(getstreamsharingchildren.getInterfaceDescriptor()), isextrapreviewrequired.c_(getstreamsharingchildren.T_()), null));
                    interfaceDescriptor += getstreamsharingchildren.getInterfaceDescriptor();
                    i19++;
                    i20 = 2;
                }
                return component4.IAuthTabCallback(isextrapreviewrequired, intRef.element, intRef2.element, (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda39
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                        int i64 = 2 % 2;
                        int i65 = onNavigationEvent + 109;
                        onExtraCallback = i65 % 128;
                        int i66 = i65 % 2;
                        Unit unitOnWarmupCompleted = x4ExternalSyntheticLambda3.onWarmupCompleted(arrayList, iAuthTabCallback2, deviceQuirksExternalSyntheticLambda03, isextrapreviewrequired, findresandmsg, arrayList2, settaggedaddrctrl, intRef, intRef2, onextracallbackwithresult, iOnExtraCallbackWithResult, iIntValue10, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                        int i67 = onNavigationEvent + 97;
                        onExtraCallback = i67 % 128;
                        int i68 = i67 % 2;
                        return unitOnWarmupCompleted;
                    }
                }, 4, (Object) null);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        setContentInsetsRelative setcontentinsetsrelative = (setContentInsetsRelative) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = onExtraCallback(setcontentinsetsrelative);
        int i4 = onWarmupCompleted + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return onextracallbackwithresultOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 119;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, setTaggedAddrCtrl settaggedaddrctrl, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult, long j, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, getBacktraceNote getbacktracenote, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 23;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        onNavigationEvent(i, quirksExternalSyntheticBackport0, iAuthTabCallback, onwarmupcompleted, (setTaggedAddrCtrl<? super x4ExternalSyntheticLambda2, ? super List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) settaggedaddrctrl, onextracallbackwithresult, j, deviceQuirksExternalSyntheticLambda0, (getBacktraceNote<? super x4ExternalSyntheticLambda4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallback + 3;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, getBacktraceNote getbacktracenote, x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 93;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(i, getbacktracenote, x4externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 79;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 74 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, boolean z, float f, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 65;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, j, z, f, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 17;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 69;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 0 / 0;
        }
        int i6 = onWarmupCompleted + 21;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsBinder = asBinder(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 63 / 0;
        }
        int i6 = onExtraCallback + 123;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return unitAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, int i, x4ExternalSyntheticLambda2 x4externalsyntheticlambda2, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            IAuthTabCallback(iAuthTabCallback, onwarmupcompleted, i, x4externalsyntheticlambda2, list, cameraCaptureResultEmptyCameraCaptureResult, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(iAuthTabCallback, onwarmupcompleted, i, x4externalsyntheticlambda2, list, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onWarmupCompleted + 77;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(x4ExternalSyntheticLambda2 x4externalsyntheticlambda2, List list, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 121;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unit = (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{x4externalsyntheticlambda2, list, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, 1371665945, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1371665934, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i7 = onWarmupCompleted + 83;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 79 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, long j, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 77;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(z, j, quirksExternalSyntheticBackport0, function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 67;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onTransact(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 59;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            i |= 1;
        }
        onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(iIntValue, getsupportedhighspeedresolutionsfor);
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = new Object[0];
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted4 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        if (i3 != 0) {
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(iOnWarmupCompleted3, objArr, -1683047595, iOnWarmupCompleted, iOnWarmupCompleted2, 1683047605, iOnWarmupCompleted4);
        int i4 = onExtraCallback + 19;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(List list, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, isExtraPreviewRequired isextrapreviewrequired, findResAndMsg findresandmsg, List list2, setTaggedAddrCtrl settaggedaddrctrl, Ref.IntRef intRef, Ref.IntRef intRef2, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult, int i, int i2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 5;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(list, iAuthTabCallback, deviceQuirksExternalSyntheticLambda0, isextrapreviewrequired, findresandmsg, list2, settaggedaddrctrl, intRef, intRef2, onextracallbackwithresult, i, i2, onextracallbackwithresult2);
        int i6 = onWarmupCompleted + 51;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 125;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 15 / 0;
        }
        int i6 = onWarmupCompleted + 61;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 21;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return onTransact(getsupportedhighspeedresolutionsfor, x4externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onTransact(getsupportedhighspeedresolutionsfor, x4externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, int i, x4ExternalSyntheticLambda2 x4externalsyntheticlambda2, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 51;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unit = (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{iAuthTabCallback, onwarmupcompleted, Integer.valueOf(i), x4externalsyntheticlambda2, list, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, 637518441, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -637518432, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i6 = onExtraCallback + 33;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(useandconfigureprogramwithtexture);
        int i4 = onExtraCallback + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(x4ExternalSyntheticLambda2 x4externalsyntheticlambda2, List list, int i, float f, float f2, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 117;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(x4externalsyntheticlambda2, list, i, f, f2, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 69;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ component8 onWarmupCompleted(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, setTaggedAddrCtrl settaggedaddrctrl, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, int i, findResAndMsg findresandmsg, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult, getTimebase gettimebase, getBacktraceNote getbacktracenote, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        component8 component8VarOnNavigationEvent = onNavigationEvent(deviceQuirksExternalSyntheticLambda0, iAuthTabCallback, settaggedaddrctrl, deviceQuirksExternalSyntheticLambda02, i, findresandmsg, onextracallbackwithresult, gettimebase, getbacktracenote, getsupportedhighspeedresolutionsfor, isextrapreviewrequired, virtualCameraCaptureResult);
        int i5 = onExtraCallback + 5;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return component8VarOnNavigationEvent;
        }
        throw null;
    }

    public static final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onWarmupCompleted(@Nullable final setContentInsetsRelative setcontentinsetsrelative, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        boolean z = true;
        if ((i2 & 1) != 0) {
            int i4 = onExtraCallback + 61;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            setcontentinsetsrelative = setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onExtraCallback + 89;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-889865923, i, -1, "im.toss.tds.compose.component.compound.tab.rememberTabV1FluidState (TdsTabV1.kt:233)");
        }
        Object[] objArr = new Object[0];
        getCaptureIds<r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult, Object> getcaptureidsIAuthTabCallback = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult.Companion.IAuthTabCallback();
        if (((i & 14) ^ 6) <= 4 || !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(setcontentinsetsrelative)) {
            if ((i & 6) == 4) {
                int i8 = onWarmupCompleted;
                int i9 = i8 + 89;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                int i11 = i8 + 43;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
            } else {
                z = false;
            }
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (z || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda25
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i13 = 2 % 2;
                    int i14 = IAuthTabCallback + 111;
                    onWarmupCompleted = i14 % 128;
                    int i15 = i14 % 2;
                    Object[] objArr2 = {setcontentinsetsrelative};
                    if (i15 != 0) {
                        return (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult) x4ExternalSyntheticLambda3.onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr2, -927544156, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 927544161, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult) RememberSaveableKt.onWarmupCompleted(objArr, getcaptureidsIAuthTabCallback, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i13 = onWarmupCompleted + 69;
        onExtraCallback = i13 % 128;
        int i14 = i13 % 2;
        return onextracallbackwithresult;
    }

    private static final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onExtraCallback(setContentInsetsRelative setcontentinsetsrelative) {
        int i = 2 % 2;
        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult = new r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult(setcontentinsetsrelative);
        int i2 = onExtraCallback + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onextracallbackwithresult;
        }
        throw null;
    }

    private static final Unit onTransact(r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, int i, x4ExternalSyntheticLambda2 x4externalsyntheticlambda2, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(x4externalsyntheticlambda2, "");
        Intrinsics.checkNotNullParameter(list, "");
        boolean z = true;
        if ((i2 & 6) == 0) {
            int i5 = onExtraCallback + 87;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            i3 = (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x4externalsyntheticlambda2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        Object obj = null;
        if ((i2 & 48) == 0) {
            int i7 = onExtraCallback + 83;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list);
                obj.hashCode();
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list) ? 32 : 16;
        }
        if ((i3 & 147) != 146) {
            int i8 = onExtraCallback + 97;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            int i10 = onExtraCallback + 89;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1528683769, i3, -1, "im.toss.tds.compose.component.compound.tab.TdsTabV1.<anonymous> (TdsTabV1.kt:249)");
            }
            onWarmupCompleted(x4externalsyntheticlambda2, iAuthTabCallback, onwarmupcompleted, (List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE>) list, i, cameraCaptureResultEmptyCameraCaptureResult, (i3 & 14) | ((i3 << 6) & 7168));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onWarmupCompleted + 13;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i12 != 0) {
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, int i, x4ExternalSyntheticLambda2 x4externalsyntheticlambda2, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(x4externalsyntheticlambda2, "");
        Intrinsics.checkNotNullParameter(list, "");
        if ((i2 & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x4externalsyntheticlambda2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            int i6 = onWarmupCompleted + 19;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list)) {
                int i8 = onExtraCallback + 113;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1836230901, i3, -1, "im.toss.tds.compose.component.compound.tab.TdsFluidTabV1.<anonymous> (TdsTabV1.kt:285)");
                int i10 = onExtraCallback + 105;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
            }
            onWarmupCompleted(x4externalsyntheticlambda2, iAuthTabCallback, onwarmupcompleted, (List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE>) list, i, cameraCaptureResultEmptyCameraCaptureResult, (i3 & 14) | ((i3 << 6) & 7168));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onExtraCallback + 77;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i13 == 0) {
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 3) != 2, iIntValue & 1)) {
            int i2 = onExtraCallback + 57;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(741361102, iIntValue, -1, "im.toss.tds.compose.component.compound.tab.TdsFluidTabV1.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsTabV1.kt:314)");
            }
            putBooleanArray.IAuthTabCallback(r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onTransact.Item, ForwardingCameraControl.onExtraCallback(281994433, true, new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda12
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i3 = 2 % 2;
                    int i4 = IAuthTabCallback + 33;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    getBacktraceNote getbacktracenote2 = getbacktracenote;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                    int iIntValue2 = ((Integer) obj2).intValue();
                    if (i5 != 0) {
                        return x4ExternalSyntheticLambda3.onExtraCallback(getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                    }
                    x4ExternalSyntheticLambda3.onExtraCallback(getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallback + 113;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = onExtraCallback + 55;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(281994433, i, -1, "im.toss.tds.compose.component.compound.tab.TdsFluidTabV1.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsTabV1.kt:314)");
                int i4 = onWarmupCompleted + 119;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            getbacktracenote.invoke(x4ExternalSyntheticLambda4.onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final component8 onWarmupCompleted(r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, setTaggedAddrCtrl settaggedaddrctrl, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, int i, findResAndMsg findresandmsg, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult, final getBacktraceNote getbacktracenote, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(isextrapreviewrequired, "");
        component8 component8Var = (component8) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{isextrapreviewrequired, iAuthTabCallback, Long.valueOf(virtualCameraCaptureResult.onExtraCallback()), settaggedaddrctrl, deviceQuirksExternalSyntheticLambda0, deviceQuirksExternalSyntheticLambda02, isextrapreviewrequired.IAuthTabCallback(x4.Items, ForwardingCameraControl.onExtraCallbackWithResult(741361102, true, new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda30
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2) {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 37;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                Unit unitIAuthTabCallback = x4ExternalSyntheticLambda3.IAuthTabCallback(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i6 = IAuthTabCallback + 71;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return unitIAuthTabCallback;
            }
        })), Integer.valueOf(i), findresandmsg, onextracallbackwithresult}, -826391869, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 826391869, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i3 = onWarmupCompleted + 31;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return component8Var;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult, final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, long j, final getBacktraceNote getbacktracenote, final setTaggedAddrCtrl settaggedaddrctrl, final int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            int i4 = onWarmupCompleted + 37;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-627172176, i2, -1, "im.toss.tds.compose.component.compound.tab.TdsFluidTabV1.<anonymous> (TdsTabV1.kt:300)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i6 = onWarmupCompleted + 21;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            final findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized;
            r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU r8lambdawgmlot4gzpqjk3abw8ehrhrqxu = r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted;
            final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallback = r8lambdawgmlot4gzpqjk3abw8ehrhrqxu.onExtraCallback(iAuthTabCallback, onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, 384);
            boolean zOnExtraCallbackWithResult = r8lambdawgmlot4gzpqjk3abw8ehrhrqxu.onExtraCallbackWithResult(iAuthTabCallback);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(setContentInsetsAbsolute.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), onextracallbackwithresult.onExtraCallbackWithResult(), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null), QuirkSettingsLoader.Companion.asInterface(), false, 2, (Object) null), 0.0f, deviceQuirksExternalSyntheticLambda0.IAuthTabCallback(), 0.0f, deviceQuirksExternalSyntheticLambda0.onExtraCallback(), 5, (Object) null);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getbacktracenote);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback.ordinal());
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(settaggedaddrctrl);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0OnExtraCallback);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i);
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallbackwithresult);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnExtraCallback | zOnNavigationEvent2 | zOnNavigationEvent3 | zOnNavigationEvent4 | zOnExtraCallback2 | zOnExtraCallback3 | zOnNavigationEvent5)) {
                int i8 = onWarmupCompleted + 91;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    onwarmupcompleted2.onExtraCallback();
                    throw null;
                }
                if (objOnMinimized2 == onwarmupcompleted2.onExtraCallback()) {
                    Function2 function2 = new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda27
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj, Object obj2) {
                            component8 component8VarOnExtraCallback;
                            int i9 = 2 % 2;
                            int i10 = onExtraCallbackWithResult + 79;
                            onNavigationEvent = i10 % 128;
                            if (i10 % 2 != 0) {
                                component8VarOnExtraCallback = x4ExternalSyntheticLambda3.onExtraCallback(iAuthTabCallback, settaggedaddrctrl, deviceQuirksExternalSyntheticLambda0, deviceQuirksExternalSyntheticLambda0OnExtraCallback, i, findresandmsg, onextracallbackwithresult, getbacktracenote, (isExtraPreviewRequired) obj, (VirtualCameraCaptureResult) obj2);
                                int i11 = 4 / 0;
                            } else {
                                component8VarOnExtraCallback = x4ExternalSyntheticLambda3.onExtraCallback(iAuthTabCallback, settaggedaddrctrl, deviceQuirksExternalSyntheticLambda0, deviceQuirksExternalSyntheticLambda0OnExtraCallback, i, findresandmsg, onextracallbackwithresult, getbacktracenote, (isExtraPreviewRequired) obj, (VirtualCameraCaptureResult) obj2);
                            }
                            int i12 = onNavigationEvent + 21;
                            onExtraCallbackWithResult = i12 % 128;
                            int i13 = i12 % 2;
                            return component8VarOnExtraCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function2);
                    objOnMinimized2 = function2;
                }
                onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback, j, zOnExtraCallbackWithResult, 0.0f, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 0, 8);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) throws NoWhenBranchMatchedException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback;
        final getBacktraceNote getbacktracenote;
        int i7;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        final int i8;
        final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted;
        final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult;
        final long j;
        final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback2;
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i9;
        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback3;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnWarmupCompleted;
        setTaggedAddrCtrl settaggedaddrctrl;
        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult2;
        long j2;
        int i10;
        r8lambdaR1cDMd3YeqH8ESRWsw779ZUi0 r8lambdar1cdmd3yeqh8esrwsw779zui0;
        int i11;
        int i12;
        int i13;
        int iIntValue = ((Number) objArr[0]).intValue();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = (QuirksExternalSyntheticBackport0) objArr[1];
        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback4 = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback) objArr[2];
        final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted) objArr[3];
        final setTaggedAddrCtrl settaggedaddrctrlOnExtraCallback = (setTaggedAddrCtrl) objArr[4];
        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult) objArr[5];
        long jLongValue = ((Number) objArr[6]).longValue();
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02 = (DeviceQuirksExternalSyntheticLambda0) objArr[7];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[8];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue2 = ((Number) objArr[10]).intValue();
        final int iIntValue3 = ((Number) objArr[11]).intValue();
        int i14 = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(-719386256);
        if ((iIntValue2 & 6) == 0) {
            i = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIntValue) ? 2 : 4) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        int i15 = iIntValue3 & 2;
        if (i15 == 0) {
            if ((iIntValue2 & 48) == 0) {
                int i16 = onExtraCallback + 33;
                i2 = iIntValue;
                onWarmupCompleted = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 72 / 0;
                    i3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport05) ? 32 : 16;
                } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport05)) {
                }
                i |= i3;
            }
            i4 = iIntValue3 & 4;
            if (i4 == 0) {
                i |= 384;
            } else if ((iIntValue2 & 384) == 0) {
                i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallback4 == null ? -1 : iAuthTabCallback4.ordinal()) ? 256 : 128;
            }
            i5 = iIntValue3 & 8;
            if (i5 == 0) {
                i |= 3072;
            } else if ((iIntValue2 & 3072) == 0) {
                i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompletedOnExtraCallbackWithResult == null ? -1 : onwarmupcompletedOnExtraCallbackWithResult.ordinal()) ? 2048 : 1024;
            }
            i6 = iIntValue3 & 16;
            if (i6 == 0) {
                i |= 24576;
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport05;
            } else {
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport05;
                if ((iIntValue2 & 24576) == 0) {
                    i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(settaggedaddrctrlOnExtraCallback) ? 16384 : 8192;
                }
            }
            if ((196608 & iIntValue2) != 0) {
                if ((iIntValue3 & 32) == 0) {
                    int i18 = onExtraCallback + 7;
                    iAuthTabCallback = iAuthTabCallback4;
                    onWarmupCompleted = i18 % 128;
                    if (i18 % 2 == 0) {
                        int i19 = 97 / 0;
                        i13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresultOnWarmupCompleted) ? 131072 : 65536;
                    } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresultOnWarmupCompleted)) {
                    }
                    i |= i13;
                } else {
                    iAuthTabCallback = iAuthTabCallback4;
                }
                i |= i13;
            } else {
                iAuthTabCallback = iAuthTabCallback4;
            }
            if ((1572864 & iIntValue2) == 0) {
                int i20 = onWarmupCompleted + 71;
                onExtraCallback = i20 % 128;
                if (i20 % 2 == 0 ? (iIntValue3 & 64) != 0 : (iIntValue3 & 113) != 0) {
                    i12 = 524288;
                    i |= i12;
                } else {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue)) {
                        int i21 = onWarmupCompleted + 115;
                        onExtraCallback = i21 % 128;
                        int i22 = i21 % 2;
                        i12 = 1048576;
                    }
                    i |= i12;
                }
            }
            if ((12582912 & iIntValue2) == 0) {
                i |= ((iIntValue3 & 128) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda02)) ? 8388608 : 4194304;
            }
            if ((100663296 & iIntValue2) == 0) {
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2)) {
                    i11 = 33554432;
                } else {
                    int i23 = onExtraCallback + 95;
                    onWarmupCompleted = i23 % 128;
                    int i24 = i23 % 2;
                    i11 = 67108864;
                }
                i |= i11;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i) == 38347922, i & 1)) {
                getbacktracenote = getbacktracenote2;
                i7 = iIntValue2;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i8 = i2;
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                onwarmupcompleted = onwarmupcompletedOnExtraCallbackWithResult;
                onextracallbackwithresult = onextracallbackwithresultOnWarmupCompleted;
                j = jLongValue;
                iAuthTabCallback2 = iAuthTabCallback;
                deviceQuirksExternalSyntheticLambda0 = deviceQuirksExternalSyntheticLambda02;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((iIntValue2 & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    if (i15 != 0) {
                        int i25 = onExtraCallback + 5;
                        onWarmupCompleted = i25 % 128;
                        if (i25 % 2 == 0) {
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                            throw null;
                        }
                        quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                    } else {
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                    }
                    final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback IAuthTabCallback2 = i4 != 0 ? r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback.Companion.IAuthTabCallback() : iAuthTabCallback;
                    if (i5 != 0) {
                        onwarmupcompletedOnExtraCallbackWithResult = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted.Companion.onExtraCallbackWithResult();
                    }
                    if (i6 != 0) {
                        i8 = i2;
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                        i9 = 1;
                        settaggedaddrctrlOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1836230901, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda20
                            private static int onExtraCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                                int i26 = 2 % 2;
                                int i27 = onExtraCallback + 29;
                                onWarmupCompleted = i27 % 128;
                                if (i27 % 2 == 0) {
                                    return x4ExternalSyntheticLambda3.onNavigationEvent(IAuthTabCallback2, onwarmupcompletedOnExtraCallbackWithResult, i8, (x4ExternalSyntheticLambda2) obj, (List) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                }
                                x4ExternalSyntheticLambda3.onNavigationEvent(IAuthTabCallback2, onwarmupcompletedOnExtraCallbackWithResult, i8, (x4ExternalSyntheticLambda2) obj, (List) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                throw null;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                    } else {
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                        i8 = i2;
                        i9 = 1;
                    }
                    if ((iIntValue3 & 32) != 0) {
                        onextracallbackwithresultOnWarmupCompleted = onWarmupCompleted((setContentInsetsRelative) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, i9);
                        i &= -458753;
                    }
                    if ((iIntValue3 & 64) != 0) {
                        jLongValue = r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted.asBinder(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        i &= -3670017;
                    }
                    if ((iIntValue3 & 128) != 0) {
                        int i26 = onExtraCallback + 45;
                        onWarmupCompleted = i26 % 128;
                        if (i26 % 2 == 0) {
                            r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted.onWarmupCompleted(IAuthTabCallback2);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        i &= -29360129;
                        iAuthTabCallback3 = IAuthTabCallback2;
                        deviceQuirksExternalSyntheticLambda0OnWarmupCompleted = r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted.onWarmupCompleted(IAuthTabCallback2);
                        settaggedaddrctrl = settaggedaddrctrlOnExtraCallback;
                        onextracallbackwithresult2 = onextracallbackwithresultOnWarmupCompleted;
                        j2 = jLongValue;
                        final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted2 = onwarmupcompletedOnExtraCallbackWithResult;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-719386256, i, -1, "im.toss.tds.compose.component.compound.tab.TdsFluidTabV1 (TdsTabV1.kt:290)");
                        }
                        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA r8lambdamefghmy2txyc8kg26jswvkwvrwa = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback;
                        accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback = r8lambdamefghmy2txyc8kg26jswvkwvrwa.onWarmupCompleted().onExtraCallback(iAuthTabCallback3);
                        accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback2 = r8lambdamefghmy2txyc8kg26jswvkwvrwa.asBinder().onExtraCallback(onwarmupcompleted2);
                        accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback3 = r8lambdamefghmy2txyc8kg26jswvkwvrwa.onExtraCallbackWithResult().onExtraCallback(r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback.Fluid);
                        accessisMonitoringp accessismonitoringpOnExtraCallback = getPopupTheme.onExtraCallback();
                        i10 = onExtraCallbackWithResult.onExtraCallback[iAuthTabCallback3.ordinal()];
                        if (i10 == 1) {
                            int i27 = onWarmupCompleted + 53;
                            onExtraCallback = i27 % 128;
                            int i28 = i27 % 2;
                            if (i10 != 2) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(159567106);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                throw new NoWhenBranchMatchedException();
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(159570599);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            r8lambdar1cdmd3yeqh8esrwsw779zui0 = r8lambdaR1cDMd3YeqH8ESRWsw779ZUi0.onExtraCallbackWithResult;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(159569175);
                            r8lambdar1cdmd3yeqh8esrwsw779zui0 = (getSubtitle) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(getPopupTheme.onExtraCallback());
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        accessgetCameraFactoryp[] accessgetcamerafactorypArr = {accessgetcamerafactorypOnExtraCallback, accessgetcamerafactorypOnExtraCallback2, accessgetcamerafactorypOnExtraCallback3, accessismonitoringpOnExtraCallback.onExtraCallback(r8lambdar1cdmd3yeqh8esrwsw779zui0)};
                        final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback5 = iAuthTabCallback3;
                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                        getbacktracenote = getbacktracenote2;
                        final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult3 = onextracallbackwithresult2;
                        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0OnWarmupCompleted;
                        i7 = iIntValue2;
                        final long j3 = j2;
                        cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback6 = iAuthTabCallback3;
                        final setTaggedAddrCtrl settaggedaddrctrl2 = settaggedaddrctrl;
                        final int i29 = i8;
                        setPostviewFormatSelector.onExtraCallback(accessgetcamerafactorypArr, ForwardingCameraControl.onExtraCallback(-627172176, true, new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda21
                            private static int onExtraCallback = 1;
                            private static int onExtraCallbackWithResult;

                            public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                                int i30 = 2 % 2;
                                int i31 = onExtraCallback + 53;
                                onExtraCallbackWithResult = i31 % 128;
                                int i32 = i31 % 2;
                                Unit unitIAuthTabCallback = x4ExternalSyntheticLambda3.IAuthTabCallback(iAuthTabCallback5, onwarmupcompleted2, quirksExternalSyntheticBackport06, onextracallbackwithresult3, deviceQuirksExternalSyntheticLambda03, j3, getbacktracenote, settaggedaddrctrl2, i29, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i33 = onExtraCallbackWithResult + 99;
                                onExtraCallback = i33 % 128;
                                int i34 = i33 % 2;
                                return unitIAuthTabCallback;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i30 = onWarmupCompleted + 73;
                            onExtraCallback = i30 % 128;
                            if (i30 % 2 != 0) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                                throw null;
                            }
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        iAuthTabCallback2 = iAuthTabCallback6;
                        deviceQuirksExternalSyntheticLambda0 = deviceQuirksExternalSyntheticLambda0OnWarmupCompleted;
                        settaggedaddrctrlOnExtraCallback = settaggedaddrctrl;
                        onextracallbackwithresult = onextracallbackwithresult2;
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                        onwarmupcompleted = onwarmupcompleted2;
                        j = j2;
                    } else {
                        iAuthTabCallback3 = IAuthTabCallback2;
                        deviceQuirksExternalSyntheticLambda0OnWarmupCompleted = deviceQuirksExternalSyntheticLambda02;
                        settaggedaddrctrl = settaggedaddrctrlOnExtraCallback;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((iIntValue3 & 32) != 0) {
                        i &= -458753;
                    }
                    if ((iIntValue3 & 64) != 0) {
                        i &= -3670017;
                    }
                    if ((iIntValue3 & 128) != 0) {
                        int i31 = onWarmupCompleted + 55;
                        onExtraCallback = i31 % 128;
                        int i32 = i31 % 2;
                        i &= -29360129;
                    }
                    deviceQuirksExternalSyntheticLambda0OnWarmupCompleted = deviceQuirksExternalSyntheticLambda02;
                    settaggedaddrctrl = settaggedaddrctrlOnExtraCallback;
                    iAuthTabCallback3 = iAuthTabCallback;
                    i8 = i2;
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                }
                onextracallbackwithresult2 = onextracallbackwithresultOnWarmupCompleted;
                j2 = jLongValue;
                final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted22 = onwarmupcompletedOnExtraCallbackWithResult;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA r8lambdamefghmy2txyc8kg26jswvkwvrwa2 = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback;
                accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback4 = r8lambdamefghmy2txyc8kg26jswvkwvrwa2.onWarmupCompleted().onExtraCallback(iAuthTabCallback3);
                accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback22 = r8lambdamefghmy2txyc8kg26jswvkwvrwa2.asBinder().onExtraCallback(onwarmupcompleted22);
                accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback32 = r8lambdamefghmy2txyc8kg26jswvkwvrwa2.onExtraCallbackWithResult().onExtraCallback(r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback.Fluid);
                accessisMonitoringp accessismonitoringpOnExtraCallback2 = getPopupTheme.onExtraCallback();
                i10 = onExtraCallbackWithResult.onExtraCallback[iAuthTabCallback3.ordinal()];
                if (i10 == 1) {
                }
                accessgetCameraFactoryp[] accessgetcamerafactorypArr2 = {accessgetcamerafactorypOnExtraCallback4, accessgetcamerafactorypOnExtraCallback22, accessgetcamerafactorypOnExtraCallback32, accessismonitoringpOnExtraCallback2.onExtraCallback(r8lambdar1cdmd3yeqh8esrwsw779zui0)};
                final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback52 = iAuthTabCallback3;
                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport062 = quirksExternalSyntheticBackport04;
                getbacktracenote = getbacktracenote2;
                final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult32 = onextracallbackwithresult2;
                final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda032 = deviceQuirksExternalSyntheticLambda0OnWarmupCompleted;
                i7 = iIntValue2;
                final long j32 = j2;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback62 = iAuthTabCallback3;
                final setTaggedAddrCtrl settaggedaddrctrl22 = settaggedaddrctrl;
                final int i292 = i8;
                setPostviewFormatSelector.onExtraCallback(accessgetcamerafactorypArr2, ForwardingCameraControl.onExtraCallback(-627172176, true, new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda21
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                        int i302 = 2 % 2;
                        int i312 = onExtraCallback + 53;
                        onExtraCallbackWithResult = i312 % 128;
                        int i322 = i312 % 2;
                        Unit unitIAuthTabCallback = x4ExternalSyntheticLambda3.IAuthTabCallback(iAuthTabCallback52, onwarmupcompleted22, quirksExternalSyntheticBackport062, onextracallbackwithresult32, deviceQuirksExternalSyntheticLambda032, j32, getbacktracenote, settaggedaddrctrl22, i292, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i33 = onExtraCallbackWithResult + 99;
                        onExtraCallback = i33 % 128;
                        int i34 = i33 % 2;
                        return unitIAuthTabCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                iAuthTabCallback2 = iAuthTabCallback62;
                deviceQuirksExternalSyntheticLambda0 = deviceQuirksExternalSyntheticLambda0OnWarmupCompleted;
                settaggedaddrctrlOnExtraCallback = settaggedaddrctrl;
                onextracallbackwithresult = onextracallbackwithresult2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                onwarmupcompleted = onwarmupcompleted22;
                j = j2;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                return null;
            }
            final int i33 = i8;
            final getBacktraceNote getbacktracenote3 = getbacktracenote;
            final int i34 = i7;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda22
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                    int i35 = 2 % 2;
                    int i36 = IAuthTabCallback + 69;
                    onExtraCallback = i36 % 128;
                    int i37 = i36 % 2;
                    Unit unitOnExtraCallbackWithResult = x4ExternalSyntheticLambda3.onExtraCallbackWithResult(i33, quirksExternalSyntheticBackport02, iAuthTabCallback2, onwarmupcompleted, settaggedaddrctrlOnExtraCallback, onextracallbackwithresult, j, deviceQuirksExternalSyntheticLambda0, getbacktracenote3, i34, iIntValue3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i38 = onExtraCallback + 55;
                    IAuthTabCallback = i38 % 128;
                    int i39 = i38 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            });
            return null;
        }
        i |= 48;
        i2 = iIntValue;
        i4 = iIntValue3 & 4;
        if (i4 == 0) {
        }
        i5 = iIntValue3 & 8;
        if (i5 == 0) {
        }
        i6 = iIntValue3 & 16;
        if (i6 == 0) {
        }
        if ((196608 & iIntValue2) != 0) {
        }
        if ((1572864 & iIntValue2) == 0) {
        }
        if ((12582912 & iIntValue2) == 0) {
        }
        if ((100663296 & iIntValue2) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i) == 38347922, i & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) throws NoWhenBranchMatchedException {
        int i;
        int i2;
        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback) objArr[0];
        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        x4ExternalSyntheticLambda2 x4externalsyntheticlambda2 = (x4ExternalSyntheticLambda2) objArr[3];
        List list = (List) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(x4externalsyntheticlambda2, "");
        Intrinsics.checkNotNullParameter(list, "");
        if ((iIntValue2 & 6) == 0) {
            int i4 = onExtraCallback + 33;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            i = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x4externalsyntheticlambda2) ^ true ? 2 : 4) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            int i6 = onWarmupCompleted + 71;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 33 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list)) {
                    i2 = 32;
                } else {
                    int i8 = onExtraCallback + 111;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    i2 = 16;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list)) {
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 147) != 146, i & 1)) {
            int i10 = onWarmupCompleted + 89;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2048062133, i, -1, "im.toss.tds.compose.component.compound.tab.TdsFixedTabV1.<anonymous> (TdsTabV1.kt:340)");
                int i12 = onWarmupCompleted + 37;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
            }
            onWarmupCompleted(x4externalsyntheticlambda2, iAuthTabCallback, onwarmupcompleted, (List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE>) list, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, (i & 14) | ((i << 6) & 7168));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = onWarmupCompleted + 45;
                onExtraCallback = i14 % 128;
                int i15 = i14 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 67;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            int i6 = i4 + 19;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = onWarmupCompleted + 61;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-128679829, i, -1, "im.toss.tds.compose.component.compound.tab.TdsFixedTabV1.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsTabV1.kt:382)");
            }
            getbacktracenote.invoke(x4ExternalSyntheticLambda4.onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onWarmupCompleted + 79;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(final getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 103;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0 ? (i & 3) == 2 : (i & 3) == 3) {
            z = false;
        } else {
            int i5 = i3 + 113;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i3 + 107;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onWarmupCompleted + 19;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(330686840, i, -1, "im.toss.tds.compose.component.compound.tab.TdsFixedTabV1.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsTabV1.kt:381)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(330686840, i, -1, "im.toss.tds.compose.component.compound.tab.TdsFixedTabV1.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsTabV1.kt:381)");
            }
            putBooleanArray.IAuthTabCallback(r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onTransact.Item, ForwardingCameraControl.onExtraCallback(-128679829, true, new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda16
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2, Object obj3) {
                    int i10 = 2 % 2;
                    int i11 = IAuthTabCallback + 49;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    getBacktraceNote getbacktracenote2 = getbacktracenote;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                    if (i12 == 0) {
                        return x4ExternalSyntheticLambda3.onNavigationEvent(getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult2, ((Integer) obj3).intValue());
                    }
                    x4ExternalSyntheticLambda3.onNavigationEvent(getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult2, ((Integer) obj3).intValue());
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallback + 41;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i12 = onWarmupCompleted + 61;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final component8 onNavigationEvent(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, final setTaggedAddrCtrl settaggedaddrctrl, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, int i, findResAndMsg findresandmsg, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult, getTimebase gettimebase, final getBacktraceNote getbacktracenote, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) throws NoWhenBranchMatchedException {
        int i2;
        Integer numValueOf;
        Object obj;
        int i3;
        float fOnNavigationEvent;
        float fOnExtraCallbackWithResult;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(isextrapreviewrequired, "");
        int iAsInterface = VirtualCameraCaptureResult.asInterface(virtualCameraCaptureResult.onExtraCallback());
        int i5 = 1;
        boolean z = iAsInterface != Integer.MAX_VALUE;
        if (z) {
            int i6 = onExtraCallback + 17;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                IAuthTabCallback(gettimebase, iAsInterface);
                throw null;
            }
            IAuthTabCallback(gettimebase, iAsInterface);
        }
        int iOnExtraCallbackWithResult = isextrapreviewrequired.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0.onNavigationEvent(isextrapreviewrequired.onExtraCallback()));
        int iOnExtraCallbackWithResult2 = isextrapreviewrequired.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0.onExtraCallbackWithResult(isextrapreviewrequired.onExtraCallback()));
        if (isextrapreviewrequired.onExtraCallback() == ExtensionsManagerExtensionsAvailability.Ltr) {
            int i7 = onExtraCallback + 29;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 25 / 0;
            }
            i2 = iOnExtraCallbackWithResult;
        } else {
            i2 = iOnExtraCallbackWithResult2;
        }
        final int iIAuthTabCallback = (IAuthTabCallback(gettimebase) - iOnExtraCallbackWithResult) - iOnExtraCallbackWithResult2;
        List listIAuthTabCallback = isextrapreviewrequired.IAuthTabCallback(x4.Items, ForwardingCameraControl.onExtraCallbackWithResult(330686840, true, new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda37
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj2, Object obj3) {
                int i9 = 2 % 2;
                int i10 = onExtraCallback + 35;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 == 0) {
                    x4ExternalSyntheticLambda3.onWarmupCompleted(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    throw null;
                }
                Unit unitOnWarmupCompleted = x4ExternalSyntheticLambda3.onWarmupCompleted(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i11 = onWarmupCompleted + 3;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                return unitOnWarmupCompleted;
            }
        }));
        int size = listIAuthTabCallback.size();
        int i9 = iIAuthTabCallback / size;
        if (listIAuthTabCallback.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((component7) listIAuthTabCallback.get(0)).onExtraCallbackWithResult(VirtualCameraCaptureResult.IAuthTabCallbackDefault(virtualCameraCaptureResult.onExtraCallback())));
            int lastIndex = CollectionsKt.getLastIndex(listIAuthTabCallback);
            if (lastIndex > 0) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((component7) listIAuthTabCallback.get(i5)).onExtraCallbackWithResult(VirtualCameraCaptureResult.IAuthTabCallbackDefault(virtualCameraCaptureResult.onExtraCallback())));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i5 == lastIndex) {
                        break;
                    }
                    int i10 = onWarmupCompleted + 69;
                    onExtraCallback = i10 % 128;
                    i5 = i10 % 2 != 0 ? i5 + 5 : i5 + 1;
                }
            }
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback onextracallbackOnNavigationEvent = onNavigationEvent((getSupportedHighSpeedResolutionsFor<r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback>) getsupportedhighspeedresolutionsfor);
        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback onextracallback = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback.Fixed;
        if (onextracallbackOnNavigationEvent == onextracallback) {
            int i11 = onExtraCallback;
            int i12 = i11 + 71;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            if (z) {
                int i14 = i11 + 37;
                onWarmupCompleted = i14 % 128;
                if (i14 % 2 == 0) {
                    throw null;
                }
                if (iIntValue > i9) {
                    onNavigationEvent((getSupportedHighSpeedResolutionsFor<r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback>) getsupportedhighspeedresolutionsfor, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback.Fluid);
                } else if (onNavigationEvent((getSupportedHighSpeedResolutionsFor<r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback>) getsupportedhighspeedresolutionsfor) == r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback.Fluid && !z && iIntValue <= i9) {
                    onNavigationEvent((getSupportedHighSpeedResolutionsFor<r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback>) getsupportedhighspeedresolutionsfor, onextracallback);
                }
            }
        }
        if (onNavigationEvent((getSupportedHighSpeedResolutionsFor<r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback>) getsupportedhighspeedresolutionsfor) == r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback.Fluid || !z) {
            int i15 = onExtraCallback + 105;
            onWarmupCompleted = i15 % 128;
            if (i15 % 2 != 0) {
                return (component8) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{isextrapreviewrequired, iAuthTabCallback, Long.valueOf(virtualCameraCaptureResult.onExtraCallback()), settaggedaddrctrl, deviceQuirksExternalSyntheticLambda0, deviceQuirksExternalSyntheticLambda02, listIAuthTabCallback, Integer.valueOf(i), findresandmsg, onextracallbackwithresult}, -826391869, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 826391869, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
            }
            throw null;
        }
        int iOnExtraCallbackWithResult3 = iAuthTabCallback == r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback.Square ? isextrapreviewrequired.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)) : 0;
        final int i16 = (iIAuthTabCallback - ((size - 1) * iOnExtraCallbackWithResult3)) / size;
        final ArrayList arrayList = new ArrayList(listIAuthTabCallback.size());
        int size2 = listIAuthTabCallback.size();
        for (int i17 = 0; i17 < size2; i17++) {
            arrayList.add(((component7) listIAuthTabCallback.get(i17)).onExtraCallback(VirtualCameraCaptureResult.Companion.onNavigationEvent(i16)));
        }
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int iT_ = ((getStreamSharingChildren) obj).T_();
            int lastIndex2 = CollectionsKt.getLastIndex(arrayList);
            if (lastIndex2 > 0) {
                int i18 = onWarmupCompleted + 41;
                onExtraCallback = i18 % 128;
                int i19 = i18 % 2;
                int i20 = 1;
                while (true) {
                    Object obj2 = arrayList.get(i20);
                    int iT_2 = ((getStreamSharingChildren) obj2).T_();
                    if (iT_ < iT_2) {
                        iT_ = iT_2;
                        obj = obj2;
                    }
                    if (i20 == lastIndex2) {
                        break;
                    }
                    i20++;
                }
            }
        }
        getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) obj;
        if (getstreamsharingchildren != null) {
            int iT_3 = getstreamsharingchildren.T_();
            int i21 = onExtraCallback + 117;
            onWarmupCompleted = i21 % 128;
            int i22 = i21 % 2;
            i3 = iT_3;
        } else {
            i3 = 0;
        }
        int[] iArr = onExtraCallbackWithResult.onExtraCallback;
        int i23 = iArr[iAuthTabCallback.ordinal()];
        if (i23 == 1) {
            fOnNavigationEvent = deviceQuirksExternalSyntheticLambda02.onNavigationEvent(isextrapreviewrequired.onExtraCallback());
        } else {
            if (i23 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fOnNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        int i24 = iArr[iAuthTabCallback.ordinal()];
        if (i24 != 1) {
            int i25 = onWarmupCompleted + 97;
            onExtraCallback = i25 % 128;
            int i26 = i25 % 2;
            if (i24 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fOnExtraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        } else {
            fOnExtraCallbackWithResult = deviceQuirksExternalSyntheticLambda02.onExtraCallbackWithResult(isextrapreviewrequired.onExtraCallback());
        }
        final ArrayList arrayList2 = new ArrayList(size);
        int i27 = 0;
        while (i27 < size) {
            arrayList2.add(new r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(isextrapreviewrequired.c_(i16 + iOnExtraCallbackWithResult3) * i27) + fOnNavigationEvent), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(isextrapreviewrequired.c_(i16) - VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fOnNavigationEvent + fOnExtraCallbackWithResult)), isextrapreviewrequired.c_(i3), null));
            i27++;
            size = size;
        }
        final int i28 = i2;
        final int i29 = iOnExtraCallbackWithResult3;
        final int i30 = i3;
        return component4.IAuthTabCallback(isextrapreviewrequired, VirtualCameraCaptureResult.asInterface(virtualCameraCaptureResult.onExtraCallback()), i3, (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda38
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj3) {
                int i31 = 2 % 2;
                int i32 = onExtraCallbackWithResult + 21;
                IAuthTabCallback = i32 % 128;
                int i33 = i32 % 2;
                List list = arrayList;
                isExtraPreviewRequired isextrapreviewrequired2 = isextrapreviewrequired;
                if (i33 == 0) {
                    x4ExternalSyntheticLambda3.IAuthTabCallback(list, isextrapreviewrequired2, i28, i16, i29, settaggedaddrctrl, arrayList2, iIAuthTabCallback, i30, (getStreamSharingChildren.onExtraCallbackWithResult) obj3);
                    throw null;
                }
                Unit unitIAuthTabCallback = x4ExternalSyntheticLambda3.IAuthTabCallback(list, isextrapreviewrequired2, i28, i16, i29, settaggedaddrctrl, arrayList2, iIAuthTabCallback, i30, (getStreamSharingChildren.onExtraCallbackWithResult) obj3);
                int i34 = onExtraCallbackWithResult + 5;
                IAuthTabCallback = i34 % 128;
                if (i34 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                throw null;
            }
        }, 4, (Object) null);
    }

    private static final Unit onExtraCallbackWithResult(setTaggedAddrCtrl settaggedaddrctrl, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallback + 85;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 69;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-419446541, i, -1, "im.toss.tds.compose.component.compound.tab.TdsFixedTabV1.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsTabV1.kt:438)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-419446541, i, -1, "im.toss.tds.compose.component.compound.tab.TdsFixedTabV1.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsTabV1.kt:438)");
            }
            settaggedaddrctrl.invoke(x4ExternalSyntheticLambda2.IAuthTabCallback, list, cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = onExtraCallback + 11;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(List list, isExtraPreviewRequired isextrapreviewrequired, int i, int i2, int i3, final setTaggedAddrCtrl settaggedaddrctrl, final List list2, int i4, int i5, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int size;
        int i6;
        int i7 = 2 % 2;
        int i8 = onExtraCallback + 33;
        onWarmupCompleted = i8 % 128;
        int i9 = 0;
        if (i8 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            size = list.size();
            i6 = 1;
        } else {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            size = list.size();
            i6 = 0;
        }
        while (i6 < size) {
            getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, (getStreamSharingChildren) list.get(i6), ((i2 + i3) * i6) + i, 0, 0.0f, 4, (Object) null);
            i6++;
        }
        List listIAuthTabCallback = isextrapreviewrequired.IAuthTabCallback(x4.Indicator, ForwardingCameraControl.onExtraCallbackWithResult(-419446541, true, new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda26
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i10 = 2 % 2;
                int i11 = onNavigationEvent + 51;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                Unit unitOnExtraCallback = x4ExternalSyntheticLambda3.onExtraCallback(settaggedaddrctrl, list2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i13 = IAuthTabCallback + 119;
                onNavigationEvent = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 94 / 0;
                }
                return unitOnExtraCallback;
            }
        }));
        int size2 = listIAuthTabCallback.size();
        int i10 = onWarmupCompleted + 23;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        while (i9 < size2) {
            int i12 = onExtraCallback + 115;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 == 0) {
                getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, ((component7) listIAuthTabCallback.get(i9)).onExtraCallback(VirtualCameraCaptureResult.Companion.IAuthTabCallback(i4, i5)), i, 1, 2.0f, 3, (Object) null);
                i9 += 126;
            } else {
                getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, ((component7) listIAuthTabCallback.get(i9)).onExtraCallback(VirtualCameraCaptureResult.Companion.IAuthTabCallback(i4, i5)), i, 0, 0.0f, 4, (Object) null);
                i9++;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, long j, final getBacktraceNote getbacktracenote, final setTaggedAddrCtrl settaggedaddrctrl, final int i, final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        boolean z;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 31;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        if ((i2 & 3) != 2) {
            int i7 = i5 + 107;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            int i9 = i5 + 1;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1037846438, i2, -1, "im.toss.tds.compose.component.compound.tab.TdsFixedTabV1.<anonymous> (TdsTabV1.kt:352)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted2.onExtraCallback()) {
                int i11 = onExtraCallback + 49;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                objOnMinimized = notifyPublicListeners.onWarmupCompleted(0);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            final getTimebase gettimebase = (getTimebase) objOnMinimized;
            r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU r8lambdawgmlot4gzpqjk3abw8ehrhrqxu = r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted;
            final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallback = r8lambdawgmlot4gzpqjk3abw8ehrhrqxu.onExtraCallback(iAuthTabCallback, onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, 384);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized2 = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            final findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized2;
            boolean zOnExtraCallbackWithResult = r8lambdawgmlot4gzpqjk3abw8ehrhrqxu.onExtraCallbackWithResult(iAuthTabCallback);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null);
            if (onNavigationEvent((getSupportedHighSpeedResolutionsFor<r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback>) getsupportedhighspeedresolutionsfor) == r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback.Fluid) {
                int i13 = onExtraCallback;
                int i14 = i13 + 53;
                onWarmupCompleted = i14 % 128;
                int i15 = i14 % 2;
                int i16 = i13 + 49;
                onWarmupCompleted = i16 % 128;
                int i17 = i16 % 2;
                quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0OnExtraCallback.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(setContentInsetsAbsolute.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, onextracallbackwithresult.onExtraCallbackWithResult(), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null), QuirkSettingsLoader.Companion.asInterface(), false, 2, (Object) null));
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, 0.0f, deviceQuirksExternalSyntheticLambda0.IAuthTabCallback(), 0.0f, deviceQuirksExternalSyntheticLambda0.onExtraCallback(), 5, (Object) null);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getbacktracenote);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback.ordinal());
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(settaggedaddrctrl);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0OnExtraCallback);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i);
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallbackwithresult);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnNavigationEvent | zOnNavigationEvent2 | zOnExtraCallback | zOnNavigationEvent3 | zOnNavigationEvent4 | zOnExtraCallback2 | zOnExtraCallback3 | zOnNavigationEvent5) || objOnMinimized3 == onwarmupcompleted2.onExtraCallback()) {
                Function2 function2 = new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda29
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                        int i18 = 2 % 2;
                        int i19 = onExtraCallback + 59;
                        onWarmupCompleted = i19 % 128;
                        int i20 = i19 % 2;
                        component8 component8VarOnWarmupCompleted = x4ExternalSyntheticLambda3.onWarmupCompleted(deviceQuirksExternalSyntheticLambda0, iAuthTabCallback, settaggedaddrctrl, deviceQuirksExternalSyntheticLambda0OnExtraCallback, i, findresandmsg, onextracallbackwithresult, gettimebase, getbacktracenote, getsupportedhighspeedresolutionsfor, (isExtraPreviewRequired) obj, (VirtualCameraCaptureResult) obj2);
                        int i21 = onExtraCallback + 3;
                        onWarmupCompleted = i21 % 128;
                        int i22 = i21 % 2;
                        return component8VarOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function2);
                objOnMinimized3 = function2;
            }
            onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback2, j, zOnExtraCallbackWithResult, 0.0f, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, 0, 8);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(final int i, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, @Nullable r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, @Nullable setTaggedAddrCtrl<? super x4ExternalSyntheticLambda2, ? super List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrl, @Nullable r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult, long j, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @NotNull final getBacktraceNote<? super x4ExternalSyntheticLambda4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) throws NoWhenBranchMatchedException {
        int i4;
        int i5;
        int i6;
        int iOrdinal;
        int i7;
        setTaggedAddrCtrl<? super x4ExternalSyntheticLambda2, ? super List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrl2;
        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted;
        long j2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback2;
        final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted2;
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02;
        final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult2;
        final setTaggedAddrCtrl<? super x4ExternalSyntheticLambda2, ? super List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrl3;
        final long j3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnWarmupCompleted;
        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult3;
        setTaggedAddrCtrl<? super x4ExternalSyntheticLambda2, ? super List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrl4;
        long j4;
        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback3;
        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted3;
        Object objOnMinimized;
        int i8;
        setTaggedAddrCtrl<? super x4ExternalSyntheticLambda2, ? super List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrlOnExtraCallback;
        long jAsBinder;
        int i9;
        int i10;
        int i11 = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1130060518);
        if ((i2 & 6) == 0) {
            int i12 = onWarmupCompleted + 125;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
                int i15 = onWarmupCompleted + 23;
                onExtraCallback = i15 % 128;
                int i16 = i15 % 2;
            } else if ((i2 & 384) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallback == null ? -1 : iAuthTabCallback.ordinal()) ? 256 : 128;
            }
            i6 = i3 & 8;
            if (i6 == 0) {
                int i17 = onExtraCallback + 109;
                onWarmupCompleted = i17 % 128;
                i4 = i17 % 2 == 0 ? i4 | 13 : i4 | 3072;
            } else if ((i2 & 3072) == 0) {
                if (onwarmupcompleted == null) {
                    int i18 = onWarmupCompleted + 45;
                    onExtraCallback = i18 % 128;
                    int i19 = i18 % 2;
                    iOrdinal = -1;
                } else {
                    iOrdinal = onwarmupcompleted.ordinal();
                }
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal) ? 2048 : 1024;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    settaggedaddrctrl2 = settaggedaddrctrl;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(settaggedaddrctrl2) ^ true ? 8192 : 16384;
                }
                if ((i2 & 196608) == 0) {
                    if ((i3 & 32) == 0) {
                        int i20 = onExtraCallback + 111;
                        onWarmupCompleted = i20 % 128;
                        int i21 = i20 % 2;
                        onextracallbackwithresultOnWarmupCompleted = onextracallbackwithresult;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresultOnWarmupCompleted)) {
                            int i22 = onWarmupCompleted + 41;
                            onExtraCallback = i22 % 128;
                            if (i22 % 2 != 0) {
                                throw null;
                            }
                            i10 = 131072;
                        }
                        i4 |= i10;
                    } else {
                        onextracallbackwithresultOnWarmupCompleted = onextracallbackwithresult;
                    }
                    i10 = 65536;
                    i4 |= i10;
                } else {
                    onextracallbackwithresultOnWarmupCompleted = onextracallbackwithresult;
                }
                if ((1572864 & i2) == 0) {
                    j2 = j;
                    i4 |= ((i3 & 64) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2)) ? 1048576 : 524288;
                } else {
                    j2 = j;
                }
                if ((12582912 & i2) == 0) {
                    if ((i3 & 128) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                        int i23 = onExtraCallback + 101;
                        onWarmupCompleted = i23 % 128;
                        if (i23 % 2 == 0) {
                            throw null;
                        }
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i4 |= i9;
                }
                if ((100663296 & i2) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 67108864 : 33554432;
                }
                if ((38347923 & i4) != 38347922) {
                    int i24 = onExtraCallback + 117;
                    onWarmupCompleted = i24 % 128;
                    int i25 = i24 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                    int i26 = onExtraCallback + 15;
                    onWarmupCompleted = i26 % 128;
                    if (i26 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                        if ((i2 & 1) != 0 && !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                            deviceQuirksExternalSyntheticLambda0OnWarmupCompleted = deviceQuirksExternalSyntheticLambda0;
                            onextracallbackwithresult3 = onextracallbackwithresultOnWarmupCompleted;
                            settaggedaddrctrl4 = settaggedaddrctrl2;
                            j4 = j2;
                            iAuthTabCallback3 = iAuthTabCallback;
                            onwarmupcompleted3 = onwarmupcompleted;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1130060518, i4, -1, "im.toss.tds.compose.component.compound.tab.TdsFixedTabV1 (TdsTabV1.kt:345)");
                        }
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback.Fixed, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA r8lambdamefghmy2txyc8kg26jswvkwvrwa = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback;
                        accessgetCameraFactoryp[] accessgetcamerafactorypArr = {r8lambdamefghmy2txyc8kg26jswvkwvrwa.onWarmupCompleted().onExtraCallback(iAuthTabCallback3), r8lambdamefghmy2txyc8kg26jswvkwvrwa.asBinder().onExtraCallback(onwarmupcompleted3), r8lambdamefghmy2txyc8kg26jswvkwvrwa.onExtraCallbackWithResult().onExtraCallback(onNavigationEvent((getSupportedHighSpeedResolutionsFor<r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback>) getsupportedhighspeedresolutionsfor))};
                        final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback4 = iAuthTabCallback3;
                        final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted4 = onwarmupcompleted3;
                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0OnWarmupCompleted;
                        final long j5 = j4;
                        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted5 = onwarmupcompleted3;
                        final setTaggedAddrCtrl<? super x4ExternalSyntheticLambda2, ? super List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrl5 = settaggedaddrctrl4;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult3;
                        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback5 = iAuthTabCallback3;
                        setPostviewFormatSelector.onExtraCallback(accessgetcamerafactorypArr, ForwardingCameraControl.onExtraCallback(-1037846438, true, new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda18
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallback = 1;

                            public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                                int i27 = 2 % 2;
                                int i28 = onExtraCallback + 125;
                                IAuthTabCallback = i28 % 128;
                                int i29 = i28 % 2;
                                Unit unitOnExtraCallback = x4ExternalSyntheticLambda3.onExtraCallback(iAuthTabCallback4, onwarmupcompleted4, quirksExternalSyntheticBackport04, deviceQuirksExternalSyntheticLambda03, j5, getbacktracenote, settaggedaddrctrl5, i, onextracallbackwithresult4, getsupportedhighspeedresolutionsfor, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i30 = IAuthTabCallback + 117;
                                onExtraCallback = i30 % 128;
                                if (i30 % 2 != 0) {
                                    return unitOnExtraCallback;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | 48);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            int i27 = onExtraCallback + 81;
                            onWarmupCompleted = i27 % 128;
                            int i28 = i27 % 2;
                        }
                        iAuthTabCallback2 = iAuthTabCallback5;
                        onwarmupcompleted2 = onwarmupcompleted5;
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                        settaggedaddrctrl3 = settaggedaddrctrl4;
                        onextracallbackwithresult2 = onextracallbackwithresult3;
                        j3 = j4;
                        deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0OnWarmupCompleted;
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i14 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                    final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback IAuthTabCallback2 = i5 != 0 ? r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback.Companion.IAuthTabCallback() : iAuthTabCallback;
                    final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = i6 != 0 ? r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted.Companion.onExtraCallbackWithResult() : onwarmupcompleted;
                    if (i7 != 0) {
                        i8 = 1;
                        settaggedaddrctrlOnExtraCallback = ForwardingCameraControl.onExtraCallback(2048062133, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda17
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallback;

                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                int i29 = 2 % 2;
                                int i30 = IAuthTabCallback + 93;
                                onExtraCallback = i30 % 128;
                                if (i30 % 2 == 0) {
                                    return x4ExternalSyntheticLambda3.onWarmupCompleted(IAuthTabCallback2, onwarmupcompletedOnExtraCallbackWithResult, i, (x4ExternalSyntheticLambda2) obj, (List) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                }
                                x4ExternalSyntheticLambda3.onWarmupCompleted(IAuthTabCallback2, onwarmupcompletedOnExtraCallbackWithResult, i, (x4ExternalSyntheticLambda2) obj, (List) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                Object obj5 = null;
                                obj5.hashCode();
                                throw null;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                    } else {
                        i8 = 1;
                        settaggedaddrctrlOnExtraCallback = settaggedaddrctrl2;
                    }
                    if ((i3 & 32) != 0) {
                        onextracallbackwithresultOnWarmupCompleted = onWarmupCompleted((setContentInsetsRelative) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, i8);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jAsBinder = r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted.asBinder(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        i4 &= -3670017;
                    } else {
                        jAsBinder = j;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                        onextracallbackwithresult3 = onextracallbackwithresultOnWarmupCompleted;
                        settaggedaddrctrl4 = settaggedaddrctrlOnExtraCallback;
                        j4 = jAsBinder;
                        deviceQuirksExternalSyntheticLambda0OnWarmupCompleted = r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted.onWarmupCompleted(IAuthTabCallback2);
                        iAuthTabCallback3 = IAuthTabCallback2;
                    } else {
                        deviceQuirksExternalSyntheticLambda0OnWarmupCompleted = deviceQuirksExternalSyntheticLambda0;
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                        iAuthTabCallback3 = IAuthTabCallback2;
                        onextracallbackwithresult3 = onextracallbackwithresultOnWarmupCompleted;
                        settaggedaddrctrl4 = settaggedaddrctrlOnExtraCallback;
                        j4 = jAsBinder;
                    }
                    onwarmupcompleted3 = onwarmupcompletedOnExtraCallbackWithResult;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                    r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA r8lambdamefghmy2txyc8kg26jswvkwvrwa2 = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback;
                    accessgetCameraFactoryp[] accessgetcamerafactorypArr2 = {r8lambdamefghmy2txyc8kg26jswvkwvrwa2.onWarmupCompleted().onExtraCallback(iAuthTabCallback3), r8lambdamefghmy2txyc8kg26jswvkwvrwa2.asBinder().onExtraCallback(onwarmupcompleted3), r8lambdamefghmy2txyc8kg26jswvkwvrwa2.onExtraCallbackWithResult().onExtraCallback(onNavigationEvent((getSupportedHighSpeedResolutionsFor<r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback>) getsupportedhighspeedresolutionsfor2))};
                    final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback42 = iAuthTabCallback3;
                    final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted42 = onwarmupcompleted3;
                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport042 = quirksExternalSyntheticBackport03;
                    final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda032 = deviceQuirksExternalSyntheticLambda0OnWarmupCompleted;
                    final long j52 = j4;
                    r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted52 = onwarmupcompleted3;
                    final setTaggedAddrCtrl settaggedaddrctrl52 = settaggedaddrctrl4;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult42 = onextracallbackwithresult3;
                    r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback52 = iAuthTabCallback3;
                    setPostviewFormatSelector.onExtraCallback(accessgetcamerafactorypArr2, ForwardingCameraControl.onExtraCallback(-1037846438, true, new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda18
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                            int i272 = 2 % 2;
                            int i282 = onExtraCallback + 125;
                            IAuthTabCallback = i282 % 128;
                            int i29 = i282 % 2;
                            Unit unitOnExtraCallback = x4ExternalSyntheticLambda3.onExtraCallback(iAuthTabCallback42, onwarmupcompleted42, quirksExternalSyntheticBackport042, deviceQuirksExternalSyntheticLambda032, j52, getbacktracenote, settaggedaddrctrl52, i, onextracallbackwithresult42, getsupportedhighspeedresolutionsfor2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i30 = IAuthTabCallback + 117;
                            onExtraCallback = i30 % 128;
                            if (i30 % 2 != 0) {
                                return unitOnExtraCallback;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | 48);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    iAuthTabCallback2 = iAuthTabCallback52;
                    onwarmupcompleted2 = onwarmupcompleted52;
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                    settaggedaddrctrl3 = settaggedaddrctrl4;
                    onextracallbackwithresult2 = onextracallbackwithresult3;
                    j3 = j4;
                    deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0OnWarmupCompleted;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    iAuthTabCallback2 = iAuthTabCallback;
                    onwarmupcompleted2 = onwarmupcompleted;
                    deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
                    onextracallbackwithresult2 = onextracallbackwithresultOnWarmupCompleted;
                    settaggedaddrctrl3 = settaggedaddrctrl2;
                    j3 = j;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda19
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                            int i29 = 2 % 2;
                            int i30 = onWarmupCompleted + 115;
                            onExtraCallback = i30 % 128;
                            int i31 = i30 % 2;
                            Unit unitOnExtraCallback = x4ExternalSyntheticLambda3.onExtraCallback(i, quirksExternalSyntheticBackport02, iAuthTabCallback2, onwarmupcompleted2, settaggedaddrctrl3, onextracallbackwithresult2, j3, deviceQuirksExternalSyntheticLambda02, getbacktracenote, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i32 = onWarmupCompleted + 33;
                            onExtraCallback = i32 % 128;
                            int i33 = i32 % 2;
                            return unitOnExtraCallback;
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            settaggedaddrctrl2 = settaggedaddrctrl;
            if ((i2 & 196608) == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            if ((12582912 & i2) == 0) {
            }
            if ((100663296 & i2) == 0) {
            }
            if ((38347923 & i4) != 38347922) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        settaggedaddrctrl2 = settaggedaddrctrl;
        if ((i2 & 196608) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if ((12582912 & i2) == 0) {
        }
        if ((100663296 & i2) == 0) {
        }
        if ((38347923 & i4) != 38347922) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        boolean z = false;
        setTaggedAddrCtrl settaggedaddrctrl = (setTaggedAddrCtrl) objArr[0];
        List list = (List) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        float fFloatValue2 = ((Number) objArr[3]).floatValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0 ? (iIntValue & 3) != 2 : (iIntValue & 4) != 2) {
            z = true;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1))) {
            int i3 = onExtraCallback + 121;
            onWarmupCompleted = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i4 = onWarmupCompleted + 43;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(580102318, iIntValue, -1, "im.toss.tds.compose.component.compound.tab.fluidMeasurePolicy.<anonymous>.<anonymous> (TdsTabV1.kt:501)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(580102318, iIntValue, -1, "im.toss.tds.compose.component.compound.tab.fluidMeasurePolicy.<anonymous>.<anonymous> (TdsTabV1.kt:501)");
            }
            x4ExternalSyntheticLambda2 x4externalsyntheticlambda2 = x4ExternalSyntheticLambda2.IAuthTabCallback;
            List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE r8lambdaeefvmne8k6v5fl9rzzhexzkg1me : list2) {
                arrayList.add(new r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(r8lambdaeefvmne8k6v5fl9rzzhexzkg1me.onWarmupCompleted() + fFloatValue), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(r8lambdaeefvmne8k6v5fl9rzzhexzkg1me.onExtraCallbackWithResult() - VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fFloatValue + fFloatValue2)), r8lambdaeefvmne8k6v5fl9rzzhexzkg1me.IAuthTabCallback(), null));
            }
            settaggedaddrctrl.invoke(x4externalsyntheticlambda2, arrayList, cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = onExtraCallback + 19;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult $fluidState;
        final /* synthetic */ List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE> $itemPositions;
        final /* synthetic */ int $leftPadding;
        final /* synthetic */ int $selectedItemIndex;
        final /* synthetic */ isExtraPreviewRequired $this_fluidMeasurePolicy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult, isExtraPreviewRequired isextrapreviewrequired, int i, List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE> list, int i2, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$fluidState = onextracallbackwithresult;
            this.$this_fluidMeasurePolicy = isextrapreviewrequired;
            this.$leftPadding = i;
            this.$itemPositions = list;
            this.$selectedItemIndex = i2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$fluidState, this.$this_fluidMeasurePolicy, this.$leftPadding, this.$itemPositions, this.$selectedItemIndex, access13800Var);
            int i2 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 73 / 0;
            }
            int i5 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                iAuthTabCallbackCreate.invokeSuspend(unit);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackCreate.invokeSuspend(unit);
            int i4 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 3;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult = this.$fluidState;
                isExtraPreviewRequired isextrapreviewrequired = this.$this_fluidMeasurePolicy;
                int i5 = this.$leftPadding;
                List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE> list = this.$itemPositions;
                int i6 = this.$selectedItemIndex;
                this.label = 1;
                if (onextracallbackwithresult.onExtraCallbackWithResult(isextrapreviewrequired, i5, list, i6, this) == objOnWarmupCompleted) {
                    int i7 = onExtraCallbackWithResult + 33;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i8 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return unit;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit onExtraCallbackWithResult(List list, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, isExtraPreviewRequired isextrapreviewrequired, findResAndMsg findresandmsg, final List list2, final setTaggedAddrCtrl settaggedaddrctrl, Ref.IntRef intRef, Ref.IntRef intRef2, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult, int i, int i2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult2) throws NoWhenBranchMatchedException {
        final float fOnNavigationEvent;
        final float fOnExtraCallbackWithResult;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult2, "");
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = onWarmupCompleted + 37;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult2, (getStreamSharingChildren) list.get(i5), onextracallbackwithresult2.onExtraCallbackWithResult(((r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE) list2.get(i5)).onWarmupCompleted()), 0, 0.0f, 4, (Object) null);
        }
        int[] iArr = onExtraCallbackWithResult.onExtraCallback;
        int i8 = iArr[iAuthTabCallback.ordinal()];
        if (i8 == 1) {
            fOnNavigationEvent = deviceQuirksExternalSyntheticLambda0.onNavigationEvent(isextrapreviewrequired.onExtraCallback());
        } else {
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fOnNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        int i9 = iArr[iAuthTabCallback.ordinal()];
        if (i9 == 1) {
            fOnExtraCallbackWithResult = deviceQuirksExternalSyntheticLambda0.onExtraCallbackWithResult(isextrapreviewrequired.onExtraCallback());
        } else {
            if (i9 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i10 = onWarmupCompleted + 31;
            onExtraCallback = i10 % 128;
            fOnExtraCallbackWithResult = i10 % 2 != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        List listIAuthTabCallback = isextrapreviewrequired.IAuthTabCallback(x4.Indicator, ForwardingCameraControl.onExtraCallbackWithResult(580102318, true, new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda23
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i11 = 2 % 2;
                int i12 = onExtraCallback + 35;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                setTaggedAddrCtrl settaggedaddrctrl2 = settaggedaddrctrl;
                List list3 = list2;
                float f = fOnNavigationEvent;
                if (i13 == 0) {
                    float f2 = fOnExtraCallbackWithResult;
                    int iIntValue = ((Integer) obj2).intValue();
                    return (Unit) x4ExternalSyntheticLambda3.onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{settaggedaddrctrl2, list3, Float.valueOf(f), Float.valueOf(f2), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)}, -278746735, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 278746736, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
                }
                float f3 = fOnExtraCallbackWithResult;
                int iIntValue2 = ((Integer) obj2).intValue();
                Object[] objArr = {settaggedaddrctrl2, list3, Float.valueOf(f), Float.valueOf(f3), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue2)};
                int i14 = 46 / 0;
                return (Unit) x4ExternalSyntheticLambda3.onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, -278746735, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 278746736, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
            }
        }));
        int size2 = listIAuthTabCallback.size();
        while (i4 < size2) {
            int i11 = onWarmupCompleted + 125;
            onExtraCallback = i11 % 128;
            if (i11 % 2 != 0) {
                getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult2, ((component7) listIAuthTabCallback.get(i4)).onExtraCallback(VirtualCameraCaptureResult.Companion.IAuthTabCallback(intRef.element, intRef2.element)), 1, 1, 2.0f, 3, (Object) null);
                i4 += 74;
            } else {
                getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult2, ((component7) listIAuthTabCallback.get(i4)).onExtraCallback(VirtualCameraCaptureResult.Companion.IAuthTabCallback(intRef.element, intRef2.element)), 0, 0, 0.0f, 4, (Object) null);
                i4++;
            }
        }
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(onextracallbackwithresult, isextrapreviewrequired, i, list2, i2, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        float fOnExtraCallback;
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        long jLongValue = ((Number) objArr[1]).longValue();
        setIso setiso = (setIso) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setiso, "");
            fOnExtraCallback = setiso.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(setiso.IAuthTabCallback() + 1.0f));
            setiso.onWarmupCompleted();
            if (zBooleanValue) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) setiso.onTransact());
                setOrientationDegrees.onWarmupCompleted(setiso, jLongValue, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat - fOnExtraCallback) & 4294967295L)), setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(Float.intBitsToFloat((int) (setiso.onTransact() >> 32))) << 32) | (4294967295L & Float.floatToRawIntBits(fOnExtraCallback))), 0.0f, (hasMoreElements) null, (seek) null, 0, 120, (Object) null);
                int i3 = onWarmupCompleted + 87;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(setiso, "");
            float fOnExtraCallback2 = setiso.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f / setiso.IAuthTabCallback()));
            setiso.onWarmupCompleted();
            if (!(!zBooleanValue)) {
                fOnExtraCallback = fOnExtraCallback2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) setiso.onTransact());
                setOrientationDegrees.onWarmupCompleted(setiso, jLongValue, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2 - fOnExtraCallback) & 4294967295L)), setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(Float.intBitsToFloat((int) (setiso.onTransact() >> 32))) << 32) | (4294967295L & Float.floatToRawIntBits(fOnExtraCallback))), 0.0f, (hasMoreElements) null, (seek) null, 0, 120, (Object) null);
                int i32 = onWarmupCompleted + 87;
                onExtraCallback = i32 % 128;
                int i42 = i32 % 2;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 59;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        boolean z;
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            z = false;
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            z = true;
        }
        unregisterOutputSurface.onTransact(useandconfigureprogramwithtexture, z);
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 33;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        Object objOnMinimized;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted + 107;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onWarmupCompleted + 113;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = onExtraCallback + 101;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-42631174, i, -1, "im.toss.tds.compose.component.compound.tab.TdsTabV1Layout.<anonymous>.<anonymous>.<anonymous> (TdsTabV1.kt:550)");
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-42631174, i, -1, "im.toss.tds.compose.component.compound.tab.TdsTabV1Layout.<anonymous>.<anonymous>.<anonymous> (TdsTabV1.kt:550)");
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda24
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj) {
                            int i8 = 2 % 2;
                            int i9 = onNavigationEvent + 67;
                            onExtraCallbackWithResult = i9 % 128;
                            int i10 = i9 % 2;
                            Unit unitOnWarmupCompleted = x4ExternalSyntheticLambda3.onWarmupCompleted((useAndConfigureProgramWithTexture) obj);
                            int i11 = onNavigationEvent + 111;
                            onExtraCallbackWithResult = i11 % 128;
                            int i12 = i11 % 2;
                            return unitOnWarmupCompleted;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                hasVideoCapture.onExtraCallback(getImplementationType.onNavigationEvent(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, false, (Function1) objOnMinimized, 1, (Object) null)), function2, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i8 = onExtraCallback + 23;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                hasVideoCapture.onExtraCallback(getImplementationType.onNavigationEvent(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, false, (Function1) objOnMinimized, 1, (Object) null)), function2, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(final boolean z, long j, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 77;
        onExtraCallback = i3 % 128;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 2) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-505476418, i, -1, "im.toss.tds.compose.component.compound.tab.TdsTabV1Layout.<anonymous>.<anonymous> (TdsTabV1.kt:533)");
            }
            final long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.BorderDefault, cameraCaptureResultEmptyCameraCaptureResult, 6);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z);
            boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jOnExtraCallback);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnExtraCallback | zOnWarmupCompleted) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda34
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i4 = 2 % 2;
                        int i5 = onWarmupCompleted + 113;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        boolean z2 = z;
                        if (i6 == 0) {
                            return x4ExternalSyntheticLambda3.onExtraCallbackWithResult(z2, jOnExtraCallback, (setIso) obj);
                        }
                        Unit unitOnExtraCallbackWithResult = x4ExternalSyntheticLambda3.onExtraCallbackWithResult(z2, jOnExtraCallback, (setIso) obj);
                        int i7 = 90 / 0;
                        return unitOnExtraCallbackWithResult;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            r8lambda762dDs35ABxrpJOuvYTWYx6zqRc.onNavigationEvent(SessionProcessorSurface.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized), (toMetersPerSecond) null, j, 0L, (getCurrentMenuItems) null, 0.0f, ForwardingCameraControl.onExtraCallback(-42631174, true, new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda35
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 11;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    Unit unitOnNavigationEvent = x4ExternalSyntheticLambda3.onNavigationEvent(quirksExternalSyntheticBackport0, function2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i7 = onExtraCallbackWithResult + 31;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 40 / 0;
                    }
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1572864, 58);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onWarmupCompleted + 63;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i5 = 70 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(float f, final boolean z, final long j, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallback + 7;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(723510442, i, -1, "im.toss.tds.compose.component.compound.tab.TdsTabV1Layout.<anonymous> (TdsTabV1.kt:532)");
            }
            lExternalSyntheticLambda4.onNavigationEvent(f, ForwardingCameraControl.onExtraCallback(-505476418, true, new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda32
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallback + 19;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    Unit unitOnNavigationEvent = x4ExternalSyntheticLambda3.onNavigationEvent(z, j, quirksExternalSyntheticBackport0, function2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i8 = IAuthTabCallback + 77;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        return unitOnNavigationEvent;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = onWarmupCompleted + 123;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[PHI: r0 r2
      0x0030: PHI (r0v27 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v28 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0027, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r2v16 int) = (r2v4 int), (r2v17 int) binds: [B:8:0x0027, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[PHI: r0 r2
      0x0029: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v28 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0027, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x0029: PHI (r2v5 int) = (r2v4 int), (r2v17 int) binds: [B:8:0x0027, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, boolean z, float f, final Function2<? super isExtraPreviewRequired, ? super VirtualCameraCaptureResult, ? extends component8> function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long jAsBinder;
        boolean z2;
        int i5;
        float f2;
        int i6;
        int i7;
        boolean z3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final boolean z4;
        final long j2;
        final float f3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        long j3;
        float f4;
        boolean z5;
        int i8;
        int i9 = 2 % 2;
        int i10 = onWarmupCompleted + 111;
        onExtraCallback = i10 % 128;
        if (i10 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-998418585);
            i3 = i2 & 1;
            if (i3 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i4 = i | 6;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            } else if ((i & 6) == 0) {
                int i11 = onWarmupCompleted + 23;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i4 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 2 : 4) | i;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i4 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-998418585);
            i3 = i2 & 1;
            if (i3 != 0) {
            }
        }
        if ((i & 48) == 0) {
            jAsBinder = j;
            i4 |= ((i2 & 2) == 0 && cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(jAsBinder)) ? 32 : 16;
        } else {
            jAsBinder = j;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                z2 = z;
                i4 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z2) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    f2 = f;
                    if (cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(f2)) {
                        int i14 = onExtraCallback + 53;
                        onWarmupCompleted = i14 % 128;
                        i6 = i14 % 2 == 0 ? 13327 : 2048;
                    } else {
                        i6 = 1024;
                    }
                    i7 = i6 | i4;
                }
                boolean z6 = false;
                if ((i & 24576) == 0) {
                    int i15 = onExtraCallback + 5;
                    onWarmupCompleted = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i16 = 16 / 0;
                        i8 = !(cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(function2) ^ true) ? 16384 : 8192;
                    } else if (cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(function2)) {
                    }
                    i7 |= i8;
                }
                if ((i7 & 9363) != 9362) {
                    int i17 = onExtraCallback + 35;
                    onWarmupCompleted = i17 % 128;
                    if (i17 % 2 != 0) {
                        z3 = true;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z3, i7 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                        cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                        z4 = z2;
                        j2 = jAsBinder;
                        f3 = f2;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStub();
                        if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResult2.onPostMessage()) {
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i3 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                            if ((i2 & 2) != 0) {
                                i7 &= -113;
                                jAsBinder = r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted.asBinder(cameraCaptureResultEmptyCameraCaptureResult2, 6);
                            }
                            if (i13 != 0) {
                                int i18 = onWarmupCompleted + 37;
                                onExtraCallback = i18 % 128;
                                if (i18 % 2 == 0) {
                                    z6 = true;
                                }
                            } else {
                                z6 = z2;
                            }
                            if (i5 != 0) {
                                int i19 = onExtraCallback + 59;
                                onWarmupCompleted = i19 % 128;
                                int i20 = i19 % 2;
                                f4 = 1.6f;
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                j3 = jAsBinder;
                            } else {
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                j3 = jAsBinder;
                                f4 = f2;
                            }
                            z5 = z6;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                            if ((i2 & 2) != 0) {
                                i7 &= -113;
                            }
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                            z5 = z2;
                            j3 = jAsBinder;
                            f4 = f2;
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-998418585, i7, -1, "im.toss.tds.compose.component.compound.tab.TdsTabV1Layout (TdsTabV1.kt:530)");
                        }
                        final float f5 = f4;
                        final boolean z7 = z5;
                        final long j4 = j3;
                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                        cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                        putBooleanArray.onExtraCallbackWithResult((String) putCharArray.onNavigationEvent.onExtraCallback(-62290671, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{putCharArray.Companion}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 62290672, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback()), null, null, ForwardingCameraControl.onExtraCallback(723510442, true, new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda42
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallback;

                            public final Object invoke(Object obj, Object obj2) {
                                int i21 = 2 % 2;
                                int i22 = onExtraCallback + 7;
                                IAuthTabCallback = i22 % 128;
                                int i23 = i22 % 2;
                                Unit unitOnExtraCallback = x4ExternalSyntheticLambda3.onExtraCallback(f5, z7, j4, quirksExternalSyntheticBackport05, function2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i24 = onExtraCallback + 27;
                                IAuthTabCallback = i24 % 128;
                                int i25 = i24 % 2;
                                return unitOnExtraCallback;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 3078, 6);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        j2 = j3;
                        z4 = z5;
                        f3 = f4;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport03;
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda43
                            private static int onExtraCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj, Object obj2) {
                                int i21 = 2 % 2;
                                int i22 = onExtraCallback + 107;
                                onWarmupCompleted = i22 % 128;
                                int i23 = i22 % 2;
                                Unit unitOnNavigationEvent = x4ExternalSyntheticLambda3.onNavigationEvent(quirksExternalSyntheticBackport06, j2, z4, f3, function2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i24 = onWarmupCompleted + 17;
                                onExtraCallback = i24 % 128;
                                if (i24 % 2 == 0) {
                                    return unitOnNavigationEvent;
                                }
                                throw null;
                            }
                        });
                        return;
                    }
                    return;
                }
                int i21 = onWarmupCompleted + 83;
                onExtraCallback = i21 % 128;
                int i22 = i21 % 2;
                z3 = false;
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z3, i7 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            f2 = f;
            i7 = i4;
            boolean z62 = false;
            if ((i & 24576) == 0) {
            }
            if ((i7 & 9363) != 9362) {
            }
            z3 = false;
            if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z3, i7 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        f2 = f;
        i7 = i4;
        boolean z622 = false;
        if ((i & 24576) == 0) {
        }
        if ((i7 & 9363) != 9362) {
        }
        z3 = false;
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z3, i7 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(x4ExternalSyntheticLambda2 x4externalsyntheticlambda2, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE> list, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 81;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2050287714, i2, -1, "im.toss.tds.compose.component.compound.tab.TabIndicator (TdsTabV1.kt:570)");
            }
        } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        int i6 = onExtraCallbackWithResult.onExtraCallback[iAuthTabCallback.ordinal()];
        if (i6 != 1) {
            int i7 = onExtraCallback + 67;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0 ? i6 != 2 : i6 != 5) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1063501216);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                throw new NoWhenBranchMatchedException();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1391080731);
            r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU r8lambdawgmlot4gzpqjk3abw8ehrhrqxu = r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted;
            float fOnWarmupCompleted = r8lambdawgmlot4gzpqjk3abw8ehrhrqxu.onWarmupCompleted(onwarmupcompleted);
            float fOnExtraCallback = r8lambdawgmlot4gzpqjk3abw8ehrhrqxu.onExtraCallback(iAuthTabCallback, onwarmupcompleted);
            int i8 = i2 >> 6;
            onNavigationEvent(x4externalsyntheticlambda2, list, i, fOnWarmupCompleted, fOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, (i8 & 896) | (i8 & 112) | (i2 & 14));
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1063502409);
            int i9 = i2 >> 6;
            onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{x4externalsyntheticlambda2, list, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i9 & 896) | (i2 & 14) | (i9 & 112))}, 415032346, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -415032343, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = onExtraCallback + 19;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i12 = onWarmupCompleted + 57;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    private static final void onNavigationEvent(final x4ExternalSyntheticLambda2 x4externalsyntheticlambda2, final List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE> list, final int i, final float f, final float f2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = onWarmupCompleted + 51;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-599604524);
        if ((i2 & 6) == 0) {
            int i10 = onExtraCallback + 37;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(x4externalsyntheticlambda2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                int i12 = onExtraCallback + 61;
                onWarmupCompleted = i12 % 128;
                i6 = i12 % 2 == 0 ? 5409 : 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            int i13 = onWarmupCompleted + 49;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                int i15 = onExtraCallback + 109;
                onWarmupCompleted = i15 % 128;
                i5 = i15 % 2 == 0 ? 8671 : 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2)) {
                int i16 = onExtraCallback + 49;
                onWarmupCompleted = i16 % 128;
                int i17 = i16 % 2;
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
            int i18 = onExtraCallback + 9;
            onWarmupCompleted = i18 % 128;
            int i19 = i18 % 2;
        }
        if ((i3 & 9363) != 9362) {
            int i20 = onExtraCallback + 67;
            onWarmupCompleted = i20 % 128;
            int i21 = i20 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            int i22 = onWarmupCompleted + 5;
            onExtraCallback = i22 % 128;
            if (i22 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-599604524, i3, -1, "im.toss.tds.compose.component.compound.tab.Square (TdsTabV1.kt:609)");
            }
            r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE r8lambdaeefvmne8k6v5fl9rzzhexzkg1me = (r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE) CollectionsKt.getOrNull(list, i);
            if (r8lambdaeefvmne8k6v5fl9rzzhexzkg1me != null) {
                int i23 = onWarmupCompleted + 51;
                onExtraCallback = i23 % 128;
                int i24 = i23 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-49158352);
                x4ExternalSyntheticLambda2.onNavigationEvent(-667994130, 667994130, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{x4externalsyntheticlambda2, x4externalsyntheticlambda2.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, r8lambdaeefvmne8k6v5fl9rzzhexzkg1me), Float.valueOf(f), Float.valueOf(f2), 0L, 0L, 0L, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i3 >> 6) & 1008) | ((i3 << 18) & 3670016)), 56}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-48965625);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda40
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    int i25 = 2 % 2;
                    int i26 = IAuthTabCallback + 69;
                    onWarmupCompleted = i26 % 128;
                    if (i26 % 2 == 0) {
                        return x4ExternalSyntheticLambda3.onWarmupCompleted(x4externalsyntheticlambda2, list, i, f, f2, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    x4ExternalSyntheticLambda3.onWarmupCompleted(x4externalsyntheticlambda2, list, i, f, f2, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
        }
    }

    private static final void onExtraCallback(r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent onnavigationevent, getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 103;
        onExtraCallback = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0 ? (i2 & 4) == 0 : (i2 & 4) == 0) {
            getbacktracenote2 = getbacktracenote;
        } else {
            int i6 = i4 + 61;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            getbacktracenote2 = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onWarmupCompleted + 75;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1506227212, i, -1, "im.toss.tds.compose.component.compound.tab.FixedTabs.PreviewTabs (TdsTabV1.kt:688)");
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1506227212, i, -1, "im.toss.tds.compose.component.compound.tab.FixedTabs.PreviewTabs (TdsTabV1.kt:688)");
        }
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-80365986);
        IntIterator it = new IntRange(2, 5).iterator();
        while (it.hasNext()) {
            int i9 = onWarmupCompleted + 107;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            onExtraCallbackWithResult(it.nextInt(), onnavigationevent, onwarmupcompleted, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, (i & 112) | ((i << 6) & 896) | ((i << 3) & 7168), 0);
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        Object obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(279823214);
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(iIntValue != 0, iIntValue & 1))) {
            int i3 = onExtraCallback + 95;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 73 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(279823214, iIntValue, -1, "im.toss.tds.compose.component.compound.tab.FixedTabs (TdsTabV1.kt:682)");
                }
                FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f));
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(verifyDrawable.onExtraCallback(onextracallback, AppLovinAdRewardListener.onExtraCallbackWithResult.onWarmupCompleted(), (toMetersPerSecond) null, 2, (Object) null), 0.0f, 1, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 1, (Object) null);
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback, QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                } else {
                    int i5 = onWarmupCompleted + 13;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted.Medium;
                r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent onnavigationevent = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent.Auto;
                onExtraCallback(onwarmupcompleted, onnavigationevent, (getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54, 4);
                createCameraCaptureCallback.IAuthTabCallback iAuthTabCallback = createCameraCaptureCallback.Companion;
                int iIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                MaxAdPlacerExternalSyntheticLambda2 maxAdPlacerExternalSyntheticLambda2 = MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i = iIntValue;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"Medium", ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), null, Long.valueOf(maxAdPlacerExternalSyntheticLambda2.onWarmupCompleted().isEngagementSignalsApiAvailable()), 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(iIAuthTabCallback), Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 54, 0, 130804}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted2 = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted.Small;
                onExtraCallback(onwarmupcompleted2, onnavigationevent, (getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, cameraCaptureResultEmptyCameraCaptureResult, 54, 4);
                onExtraCallback(onwarmupcompleted2, onnavigationevent, x2ExternalSyntheticLambda7.onWarmupCompleted.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResult, 438, 0);
                int iIAuthTabCallback2 = iAuthTabCallback.IAuthTabCallback();
                long jIsEngagementSignalsApiAvailable = maxAdPlacerExternalSyntheticLambda2.onWarmupCompleted().isEngagementSignalsApiAvailable();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
                createCameraCaptureCallback createcameracapturecallbackOnExtraCallback = createCameraCaptureCallback.onExtraCallback(iIAuthTabCallback2);
                obj = null;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"Small", quirksExternalSyntheticBackport0OnExtraCallback, null, Long.valueOf(jIsEngagementSignalsApiAvailable), 0L, 0L, null, null, createcameracapturecallbackOnExtraCallback, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 54, 0, 130804}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = onWarmupCompleted + 13;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback2 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f));
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(verifyDrawable.onExtraCallback(onextracallback2, AppLovinAdRewardListener.onExtraCallbackWithResult.onWarmupCompleted(), (toMetersPerSecond) null, 2, (Object) null), 0.0f, 1, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 1, (Object) null);
                component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback2, QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted3 = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted.Medium;
                r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent onnavigationevent2 = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent.Auto;
                onExtraCallback(onwarmupcompleted3, onnavigationevent2, (getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54, 4);
                createCameraCaptureCallback.IAuthTabCallback iAuthTabCallback2 = createCameraCaptureCallback.Companion;
                int iIAuthTabCallback3 = iAuthTabCallback2.IAuthTabCallback();
                MaxAdPlacerExternalSyntheticLambda2 maxAdPlacerExternalSyntheticLambda22 = MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i = iIntValue;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"Medium", ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback2, 0.0f, 1, (Object) null), null, Long.valueOf(maxAdPlacerExternalSyntheticLambda22.onWarmupCompleted().isEngagementSignalsApiAvailable()), 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(iIAuthTabCallback3), Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 54, 0, 130804}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted22 = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted.Small;
                onExtraCallback(onwarmupcompleted22, onnavigationevent2, (getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, cameraCaptureResultEmptyCameraCaptureResult, 54, 4);
                onExtraCallback(onwarmupcompleted22, onnavigationevent2, x2ExternalSyntheticLambda7.onWarmupCompleted.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResult, 438, 0);
                int iIAuthTabCallback22 = iAuthTabCallback2.IAuthTabCallback();
                long jIsEngagementSignalsApiAvailable2 = maxAdPlacerExternalSyntheticLambda22.onWarmupCompleted().isEngagementSignalsApiAvailable();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback2, 0.0f, 1, (Object) null);
                createCameraCaptureCallback createcameracapturecallbackOnExtraCallback2 = createCameraCaptureCallback.onExtraCallback(iIAuthTabCallback22);
                obj = null;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"Small", quirksExternalSyntheticBackport0OnExtraCallback2, null, Long.valueOf(jIsEngagementSignalsApiAvailable2), 0L, 0L, null, null, createcameracapturecallbackOnExtraCallback2, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 54, 0, 130804}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i = iIntValue;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final int i7 = i;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda13
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 45;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 != 0) {
                        x4ExternalSyntheticLambda3.onNavigationEvent(i7, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    Unit unitOnNavigationEvent = x4ExternalSyntheticLambda3.onNavigationEvent(i7, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i10 = onWarmupCompleted + 101;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    return unitOnNavigationEvent;
                }
            });
        }
        return obj;
    }

    private static /* synthetic */ Object access000(Object[] objArr) throws NoWhenBranchMatchedException {
        Object obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(1638068804);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(iIntValue != 0, iIntValue & 1)) {
            int i3 = onExtraCallback + 85;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onWarmupCompleted + 89;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1638068804, iIntValue, -1, "im.toss.tds.compose.component.compound.tab.FluidTabs (TdsTabV1.kt:738)");
                    int i6 = 62 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1638068804, iIntValue, -1, "im.toss.tds.compose.component.compound.tab.FluidTabs (TdsTabV1.kt:738)");
                }
            }
            FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f));
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(verifyDrawable.onExtraCallback(onextracallback, AppLovinAdRewardListener.onExtraCallbackWithResult.onWarmupCompleted(), (toMetersPerSecond) null, 2, (Object) null), 0.0f, 1, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 1, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback, QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i7 = onWarmupCompleted + 31;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
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
            r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted.Medium;
            r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent onnavigationevent = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent.Fluid;
            onExtraCallbackWithResult(10, onnavigationevent, onwarmupcompleted, (getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 438, 8);
            createCameraCaptureCallback.IAuthTabCallback iAuthTabCallback = createCameraCaptureCallback.Companion;
            int iIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
            MaxAdPlacerExternalSyntheticLambda2 maxAdPlacerExternalSyntheticLambda2 = MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i = iIntValue;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"Medium", ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), null, Long.valueOf(maxAdPlacerExternalSyntheticLambda2.onWarmupCompleted().isEngagementSignalsApiAvailable()), 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(iIAuthTabCallback), Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 54, 0, 130804}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            onExtraCallbackWithResult(10, onnavigationevent, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted.Small, (getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, cameraCaptureResultEmptyCameraCaptureResult, 438, 8);
            int iIAuthTabCallback2 = iAuthTabCallback.IAuthTabCallback();
            long jIsEngagementSignalsApiAvailable = maxAdPlacerExternalSyntheticLambda2.onWarmupCompleted().isEngagementSignalsApiAvailable();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
            createCameraCaptureCallback createcameracapturecallbackOnExtraCallback = createCameraCaptureCallback.onExtraCallback(iIAuthTabCallback2);
            obj = null;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"Small", quirksExternalSyntheticBackport0OnExtraCallback, null, Long.valueOf(jIsEngagementSignalsApiAvailable), 0L, 0L, null, null, createcameracapturecallbackOnExtraCallback, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 54, 0, 130804}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallback + 81;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i = iIntValue;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final int i10 = i;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                    int i11 = 2 % 2;
                    int i12 = IAuthTabCallback + 49;
                    onExtraCallbackWithResult = i12 % 128;
                    Object obj4 = null;
                    if (i12 % 2 == 0) {
                        x4ExternalSyntheticLambda3.IAuthTabCallback(i10, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        obj4.hashCode();
                        throw null;
                    }
                    Unit unitIAuthTabCallback = x4ExternalSyntheticLambda3.IAuthTabCallback(i10, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i13 = onExtraCallbackWithResult + 97;
                    IAuthTabCallback = i13 % 128;
                    if (i13 % 2 == 0) {
                        return unitIAuthTabCallback;
                    }
                    obj4.hashCode();
                    throw null;
                }
            });
        }
        return obj;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 95;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(int i, getBacktraceNote getbacktracenote, x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3;
        boolean z;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(x4externalsyntheticlambda4, "");
        boolean z2 = true;
        if ((i2 & 6) != 0) {
            i3 = i2;
        } else if (!cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(x4externalsyntheticlambda4)) {
            i4 = 2;
            i3 = i2 | i4;
        } else {
            int i6 = onExtraCallback + 39;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                i4 = 4;
            }
            i3 = i2 | i4;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            int i7 = onExtraCallback + 73;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onWarmupCompleted + 79;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1962787764, i3, -1, "im.toss.tds.compose.component.compound.tab.PreviewTab.<anonymous> (TdsTabV1.kt:782)");
                    int i9 = 36 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1962787764, i3, -1, "im.toss.tds.compose.component.compound.tab.PreviewTab.<anonymous> (TdsTabV1.kt:782)");
                }
            }
            int i10 = 0;
            while (i10 < i) {
                int i11 = i10 + 1;
                String str = "탭 " + i11;
                if (i10 == i / 2) {
                    z = z2;
                } else {
                    int i12 = onWarmupCompleted + 29;
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                    z = false;
                }
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda31
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke() {
                            int i14 = 2 % 2;
                            int i15 = onExtraCallbackWithResult + 1;
                            IAuthTabCallback = i15 % 128;
                            int i16 = i15 % 2;
                            Unit unitOnWarmupCompleted = x4ExternalSyntheticLambda3.onWarmupCompleted();
                            int i17 = IAuthTabCallback + 125;
                            onExtraCallbackWithResult = i17 % 128;
                            int i18 = i17 % 2;
                            return unitOnWarmupCompleted;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                }
                x4externalsyntheticlambda4.onExtraCallback(str, z, (Function0) objOnMinimized, null, false, false, 0L, null, 0L, null, getbacktracenote, null, null, cameraCaptureResultEmptyCameraCaptureResult, 384, (i3 << 9) & 7168, 7160);
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                i10 = i11;
                z2 = true;
                i3 = i3;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = onWarmupCompleted + 71;
                onExtraCallback = i14 % 128;
                if (i14 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i15 = 20 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(final int i, final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent onnavigationevent, final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) throws NoWhenBranchMatchedException {
        int i4;
        getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2;
        final getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        final getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(195835182);
        if ((i2 & 6) == 0) {
            i4 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onnavigationevent.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            int i6 = onExtraCallback + 119;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted.ordinal()) ? 256 : 128;
            int i8 = onExtraCallback + 37;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = i3 & 8;
        if (i10 == 0) {
            if ((i2 & 3072) == 0) {
                getbacktracenote2 = getbacktracenote;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ? 2048 : 1024;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 1171) == 1170, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                getbacktracenote3 = getbacktracenote2;
            } else {
                if (i10 != 0) {
                    int i11 = onExtraCallback + 35;
                    int i12 = i11 % 128;
                    onWarmupCompleted = i12;
                    int i13 = i11 % 2;
                    int i14 = i12 + 77;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    getbacktracenote4 = null;
                } else {
                    getbacktracenote4 = getbacktracenote2;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i16 = onExtraCallback + 25;
                    onWarmupCompleted = i16 % 128;
                    int i17 = i16 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(195835182, i4, -1, "im.toss.tds.compose.component.compound.tab.PreviewTab (TdsTabV1.kt:779)");
                }
                getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5 = getbacktracenote4;
                onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(i / 2), null, null, onwarmupcompleted, onnavigationevent, null, 0L, null, ForwardingCameraControl.onExtraCallback(-1962787764, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda7
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                        int i18 = 2 % 2;
                        int i19 = onExtraCallbackWithResult + 97;
                        onExtraCallback = i19 % 128;
                        int i20 = i19 % 2;
                        int i21 = i;
                        if (i20 == 0) {
                            return x4ExternalSyntheticLambda3.onNavigationEvent(i21, getbacktracenote4, (x4ExternalSyntheticLambda4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                        x4ExternalSyntheticLambda3.onNavigationEvent(i21, getbacktracenote4, (x4ExternalSyntheticLambda4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i4 << 9) & 57344) | ((i4 << 3) & 7168) | 100663296), 230}, -1567613975, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1567613981, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i18 = onExtraCallback + 37;
                    onWarmupCompleted = i18 % 128;
                    if (i18 % 2 == 0) {
                        int i19 = 5 / 5;
                    }
                }
                getbacktracenote3 = getbacktracenote5;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda8
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                        int i20 = 2 % 2;
                        int i21 = onNavigationEvent + 9;
                        IAuthTabCallback = i21 % 128;
                        if (i21 % 2 == 0) {
                            x4ExternalSyntheticLambda3.IAuthTabCallback(i, onnavigationevent, onwarmupcompleted, getbacktracenote3, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        Unit unitIAuthTabCallback = x4ExternalSyntheticLambda3.IAuthTabCallback(i, onnavigationevent, onwarmupcompleted, getbacktracenote3, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i22 = IAuthTabCallback + 25;
                        onNavigationEvent = i22 % 128;
                        int i23 = i22 % 2;
                        return unitIAuthTabCallback;
                    }
                });
                return;
            }
            return;
        }
        i4 |= 3072;
        getbacktracenote2 = getbacktracenote;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 1171) == 1170, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 1;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1162193257);
            throw null;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1162193257);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            int i4 = onWarmupCompleted + 5;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 85;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1162193257, i, -1, "im.toss.tds.compose.component.compound.tab.OutOfIndexPreview (TdsTabV1.kt:801)");
                if (i6 == 0) {
                    throw null;
                }
            }
            onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{-1, null, null, null, null, null, 0L, null, x2ExternalSyntheticLambda7.onWarmupCompleted.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100663302, 254}, -1567613975, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1567613981, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onWarmupCompleted + 101;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = 80 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda36
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = onWarmupCompleted + 61;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = i;
                    int iIntValue = ((Integer) obj2).intValue();
                    Unit unit = (Unit) x4ExternalSyntheticLambda3.onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(i12), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)}, 263704733, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -263704712, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
                    int i13 = onWarmupCompleted + 75;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    return unit;
                }
            });
        }
    }

    private static final Unit IAuthTabCallbackDefault(int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 43;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor, i);
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 99;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda41, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackDefault(final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        boolean z;
        final int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 107;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            Intrinsics.checkNotNullParameter(x4externalsyntheticlambda4, "");
            if ((i & 31) == 0) {
                int i7 = onExtraCallback + 115;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 61 / 0;
                    i2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(x4externalsyntheticlambda4) ? 4 : 2;
                } else if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(x4externalsyntheticlambda4)) {
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(x4externalsyntheticlambda4, "");
            if ((i & 6) == 0) {
            }
        }
        int i9 = 3;
        boolean z2 = true;
        if ((i3 & 19) != 18) {
            int i10 = onWarmupCompleted + 3;
            onExtraCallback = i10 % 128;
            if (i10 % 2 == 0) {
                z = true;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            } else {
                int i11 = onWarmupCompleted + 51;
                onExtraCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 49 / 0;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2124011594, i3, -1, "im.toss.tds.compose.component.compound.tab.TabSquarePreview.<anonymous>.<anonymous> (TdsTabV1.kt:826)");
                    }
                    i4 = 0;
                    while (i4 < i9) {
                        int i13 = i4 + 1;
                        String str = "탭 " + i13;
                        boolean z3 = i4 == IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor) ? z2 : false;
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(i4);
                        Function0<Unit> function0OnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!zOnExtraCallback) {
                            int i14 = onExtraCallback + 93;
                            onWarmupCompleted = i14 % 128;
                            int i15 = i14 % 2;
                            if (function0OnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                function0OnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda41
                                    private static int onExtraCallbackWithResult = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke() {
                                        int i16 = 2 % 2;
                                        int i17 = onExtraCallbackWithResult + 19;
                                        onNavigationEvent = i17 % 128;
                                        int i18 = i17 % 2;
                                        Unit unitOnExtraCallbackWithResult = x4ExternalSyntheticLambda3.onExtraCallbackWithResult(i4, getsupportedhighspeedresolutionsfor);
                                        int i19 = onExtraCallbackWithResult + 53;
                                        onNavigationEvent = i19 % 128;
                                        int i20 = i19 % 2;
                                        return unitOnExtraCallbackWithResult;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((Object) function0OnMinimized);
                            }
                        }
                        x4externalsyntheticlambda4.onExtraCallback(str, z3, function0OnMinimized, onextracallback, false, true, 0L, null, 0L, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 199680, (i3 << 9) & 7168, 8144);
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                        i4 = i13;
                        z2 = z2;
                        i9 = i9;
                        i3 = i3;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i16 = onExtraCallback + 93;
                        onWarmupCompleted = i16 % 128;
                        if (i16 % 2 == 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    i4 = 0;
                    while (i4 < i9) {
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
        int i17 = onWarmupCompleted + 77;
        onExtraCallback = i17 % 128;
        int i18 = i17 % 2;
        z = false;
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, i3 & 1)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda14, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onTransact(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 75;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(x4externalsyntheticlambda4, "");
            if ((i & 110) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(x4externalsyntheticlambda4) ? 4 : 2);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(x4externalsyntheticlambda4, "");
            if ((i & 6) == 0) {
            }
        }
        boolean z2 = true;
        if ((i2 & 19) != 18) {
            int i5 = onWarmupCompleted + 37;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, i2 & 1)) {
            int i7 = onWarmupCompleted + 5;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1503693791, i2, -1, "im.toss.tds.compose.component.compound.tab.TabSquarePreview.<anonymous>.<anonymous> (TdsTabV1.kt:844)");
            }
            int i9 = 0;
            while (i9 < 3) {
                int i10 = i9 + 1;
                String str = "탭 " + i10;
                boolean z3 = i9 == IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor) ? z2 : false;
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(i9);
                Function0<Unit> function0OnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback) {
                    int i11 = onExtraCallback + 63;
                    onWarmupCompleted = i11 % 128;
                    if (i11 % 2 == 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        throw null;
                    }
                    if (function0OnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        function0OnMinimized = new TdsTabV1Kt$.ExternalSyntheticLambda14(i9, getsupportedhighspeedresolutionsfor);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((Object) function0OnMinimized);
                        int i12 = onExtraCallback + 5;
                        onWarmupCompleted = i12 % 128;
                        int i13 = i12 % 2;
                    }
                }
                x4externalsyntheticlambda4.onExtraCallback(str, z3, function0OnMinimized, onextracallback, false, true, 0L, null, 0L, null, ForwardingCameraControl.onExtraCallback(-1240692837, z2, new TdsTabV1Kt$.ExternalSyntheticLambda15(i9), cameraCaptureResultEmptyCameraCaptureResult2, 54), null, null, cameraCaptureResultEmptyCameraCaptureResult, 199680, ((i2 << 9) & 7168) | 6, 7120);
                int i14 = onExtraCallback + 55;
                onWarmupCompleted = i14 % 128;
                int i15 = i14 % 2;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                i9 = i10;
                z2 = z2;
                i2 = i2;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 45;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor, i);
        Unit unit = Unit.INSTANCE;
        int i5 = onWarmupCompleted + 67;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(int i, RightAccessoryPreset rightAccessoryPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightAccessoryPreset, "");
        if ((i2 & 6) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightAccessoryPreset) ? 4 : 2;
            int i4 = onWarmupCompleted + 63;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        if ((i2 & 19) != 18) {
            int i6 = onExtraCallback + 5;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i8 = onExtraCallback + 55;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1071549062, i2, -1, "im.toss.tds.compose.component.compound.tab.TabSquarePreview.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsTabV1.kt:874)");
            }
            rightAccessoryPreset.onWarmupCompleted(((Number) CollectionsKt.listOf(new Integer[]{0, 6, 19, 112}).get(i)).intValue(), null, 0L, 0L, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 12) & 57344, 14);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    private static final Unit asBinder(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        boolean z2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(x4externalsyntheticlambda4, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(x4externalsyntheticlambda4) ? 4 : 2);
        } else {
            i2 = i;
        }
        boolean z3 = true;
        if ((i2 & 19) != 18) {
            int i4 = onExtraCallback + 41;
            onWarmupCompleted = i4 % 128;
            z = !(i4 % 2 == 0);
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 67;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1672837566, i2, -1, "im.toss.tds.compose.component.compound.tab.TabSquarePreview.<anonymous>.<anonymous> (TdsTabV1.kt:866)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1672837566, i2, -1, "im.toss.tds.compose.component.compound.tab.TabSquarePreview.<anonymous>.<anonymous> (TdsTabV1.kt:866)");
            }
            int i6 = 0;
            while (i6 < 3) {
                int i7 = i6 + 1;
                String str = "긴텍스트 탭 " + i7;
                if (i6 == IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor)) {
                    int i8 = onWarmupCompleted;
                    int i9 = i8 + 1;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = i8 + 115;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    z2 = z3;
                } else {
                    z2 = false;
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(i6);
                Function0<Unit> function0OnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback || function0OnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    function0OnMinimized = new TdsTabV1Kt$.ExternalSyntheticLambda9(i6, getsupportedhighspeedresolutionsfor);
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((Object) function0OnMinimized);
                }
                x4externalsyntheticlambda4.onExtraCallback(str, z2, function0OnMinimized, onextracallback, false, true, 0L, null, 0L, null, ForwardingCameraControl.onExtraCallback(-1071549062, z3, new TdsTabV1Kt$.ExternalSyntheticLambda10(i6), cameraCaptureResultEmptyCameraCaptureResult2, 54), null, null, cameraCaptureResultEmptyCameraCaptureResult, 199680, ((i2 << 9) & 7168) | 6, 7120);
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                i6 = i7;
                z3 = z3;
                i2 = i2;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStub(int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 21;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            onNavigationEvent((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor, i);
            return Unit.INSTANCE;
        }
        onNavigationEvent((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor, i);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackStub(final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 75;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(x4externalsyntheticlambda4, "");
            if ((i & 18) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(x4externalsyntheticlambda4) ? 4 : 2);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(x4externalsyntheticlambda4, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            int i6 = onWarmupCompleted + 61;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, i2 & 1)) {
            int i8 = onWarmupCompleted + 11;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1122379306, i2, -1, "im.toss.tds.compose.component.compound.tab.TabSquarePreview.<anonymous>.<anonymous>.<anonymous> (TdsTabV1.kt:889)");
            }
            final int i10 = 0;
            while (i10 < i3) {
                int i11 = im.toss.tds.compose.R.drawable.icn_star_mono;
                accessgetDEFAULT_PROTOCOLScp accessgetdefault_protocolscp = new accessgetDEFAULT_PROTOCOLScp(((Number) CollectionsKt.listOf(new Integer[]{Integer.valueOf(i11), Integer.valueOf(i11)}).get(i10)).intValue());
                boolean z2 = i10 == IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(i10);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.tab.TdsTabV1Kt$$ExternalSyntheticLambda44
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback;

                        public final Object invoke() {
                            int i12 = 2 % 2;
                            int i13 = onExtraCallback + 73;
                            IAuthTabCallback = i13 % 128;
                            int i14 = i13 % 2;
                            Unit unitOnExtraCallback = x4ExternalSyntheticLambda3.onExtraCallback(i10, getsupportedhighspeedresolutionsfor);
                            int i15 = onExtraCallback + 45;
                            IAuthTabCallback = i15 % 128;
                            if (i15 % 2 != 0) {
                                return unitOnExtraCallback;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                }
                x4externalsyntheticlambda4.onNavigationEvent(accessgetdefault_protocolscp, "즐겨찾기", z2, (Function0) objOnMinimized, onextracallback, false, true, null, 0L, 0L, null, null, cameraCaptureResultEmptyCameraCaptureResult, 1597488, (i2 << 6) & 896, 4000);
                i10++;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                i3 = 2;
                i2 = i2;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 7;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor, i);
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 107;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
        return unit;
    }

    private static final Unit asInterface(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 61;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(x4externalsyntheticlambda4, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(x4externalsyntheticlambda4) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1999648255, i2, -1, "im.toss.tds.compose.component.compound.tab.TabSquarePreview.<anonymous>.<anonymous>.<anonymous> (TdsTabV1.kt:912)");
            }
            int i7 = 0;
            while (i7 < i3) {
                int i8 = im.toss.tds.compose.R.drawable.icn_star_mono;
                accessgetDEFAULT_PROTOCOLScp accessgetdefault_protocolscp = new accessgetDEFAULT_PROTOCOLScp(((Number) CollectionsKt.listOf(new Integer[]{Integer.valueOf(i8), Integer.valueOf(i8)}).get(i7)).intValue());
                if (i7 == IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor)) {
                    int i9 = onWarmupCompleted + 5;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % i3;
                    z = true;
                } else {
                    z = false;
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(i7);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new TdsTabV1Kt$.ExternalSyntheticLambda28(i7, getsupportedhighspeedresolutionsfor);
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                }
                x4externalsyntheticlambda4.onNavigationEvent(accessgetdefault_protocolscp, "즐겨찾기", z, (Function0) objOnMinimized, onextracallback, false, true, null, 0L, 0L, null, null, cameraCaptureResultEmptyCameraCaptureResult, 1597488, (i2 << 6) & 896, 4000);
                i7++;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                i3 = 2;
                i2 = i2;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = onExtraCallback + 9;
        onWarmupCompleted = i11 % 128;
        int i12 = i11 % 2;
        return unit;
    }

    private static final void onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 117;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-911657394);
            throw null;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-911657394);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            int i4 = onExtraCallback + 69;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallback + 57;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-911657394, i, -1, "im.toss.tds.compose.component.compound.tab.TabSquarePreview (TdsTabV1.kt:818)");
                int i8 = onWarmupCompleted + 1;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i10 = onWarmupCompleted + 13;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i12 = onExtraCallback + 49;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    obj.hashCode();
                    throw null;
                }
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
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(1, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback.Square;
            float f = 0.0f;
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
            onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor)), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), iAuthTabCallback, null, null, null, 0L, null, ForwardingCameraControl.onExtraCallback(-2124011594, true, new TdsTabV1Kt$.ExternalSyntheticLambda1(getsupportedhighspeedresolutionsfor), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100663728, 248}, -1567613975, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1567613981, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
            onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor2)), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), iAuthTabCallback, null, null, null, 0L, null, ForwardingCameraControl.onExtraCallback(1503693791, true, new TdsTabV1Kt$.ExternalSyntheticLambda2(getsupportedhighspeedresolutionsfor2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100663728, 248}, -1567613975, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1567613981, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
            onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor2)), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), iAuthTabCallback, null, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent.Fluid, null, 0L, null, ForwardingCameraControl.onExtraCallback(1672837566, true, new TdsTabV1Kt$.ExternalSyntheticLambda3(getsupportedhighspeedresolutionsfor2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100688304, 232}, -1567613975, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1567613981, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-123383738);
            List entries = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent.getEntries();
            int size = entries.size();
            int i13 = 0;
            while (i13 < size) {
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor2;
                onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor2)), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, f, 1, (Object) null), r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback.Square, null, (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent) entries.get(i13), null, 0L, null, ForwardingCameraControl.onExtraCallback(-1122379306, true, new TdsTabV1Kt$.ExternalSyntheticLambda4(getsupportedhighspeedresolutionsfor3), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100663728, 232}, -1567613975, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1567613981, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
                i13++;
                size = size;
                getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor3;
                entries = entries;
                f = 0.0f;
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4 = getsupportedhighspeedresolutionsfor2;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-123357486);
            EnumEntries<r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent> entries2 = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent.getEntries();
            int size2 = entries2.size();
            int i14 = 0;
            while (i14 < size2) {
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5 = getsupportedhighspeedresolutionsfor4;
                onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor4)), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, obj), r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback.Square, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted.Small, (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent) entries2.get(i14), null, 0L, null, ForwardingCameraControl.onExtraCallback(1999648255, true, new TdsTabV1Kt$.ExternalSyntheticLambda5(getsupportedhighspeedresolutionsfor5), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100666800, 224}, -1567613975, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1567613981, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
                i14++;
                getsupportedhighspeedresolutionsfor4 = getsupportedhighspeedresolutionsfor5;
                obj = null;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i15 = onExtraCallback + 33;
                onWarmupCompleted = i15 % 128;
                if (i15 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsTabV1Kt$.ExternalSyntheticLambda6(i));
        }
    }

    private static final int IAuthTabCallback(getTimebase gettimebase) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = gettimebase.onWarmupCompleted();
        int i4 = onExtraCallback + 71;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return iOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(getTimebase gettimebase, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 53;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        gettimebase.onExtraCallback(i);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback onNavigationEvent(getSupportedHighSpeedResolutionsFor<r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback onextracallback = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = onWarmupCompleted + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return onextracallback;
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback> getsupportedhighspeedresolutionsfor, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(onextracallback);
        int i4 = onWarmupCompleted + 103;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
    }

    private static final int IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).intValue();
        int i4 = onWarmupCompleted + 53;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 99;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Integer.valueOf(i));
        if (i4 != 0) {
            int i5 = 15 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setTaggedAddrCtrl settaggedaddrctrl, List list, float f, float f2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{settaggedaddrctrl, list, Float.valueOf(f), Float.valueOf(f2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -278746735, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 278746736, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{getsupportedhighspeedresolutionsfor, x4externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -1099644335, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1099644352, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, 263704733, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -263704712, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{getsupportedhighspeedresolutionsfor, x4externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -382555104, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 382555120, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, RightAccessoryPreset rightAccessoryPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(i), rightAccessoryPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, -142330483, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 142330487, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public static /* synthetic */ r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onExtraCallbackWithResult(setContentInsetsRelative setcontentinsetsrelative) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{setcontentinsetsrelative}, -927544156, iOnWarmupCompleted, iOnWarmupCompleted2, 927544161, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        return (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(i), getsupportedhighspeedresolutionsfor}, 1155286460, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1155286442, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        return (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(i), getsupportedhighspeedresolutionsfor}, -560507534, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 560507542, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -351968579, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 351968581, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final void onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -1184222077, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1184222097, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final Unit onExtraCallbackWithResult() {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[0], -1683047595, iOnWarmupCompleted, iOnWarmupCompleted2, 1683047605, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final Unit onTransact(int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        return (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(i), getsupportedhighspeedresolutionsfor}, 1811808017, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1811808002, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final Unit onNavigationEvent(int i, RightAccessoryPreset rightAccessoryPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(i), rightAccessoryPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, -772913070, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 772913077, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final Unit onExtraCallbackWithResult(r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, int i, x4ExternalSyntheticLambda2 x4externalsyntheticlambda2, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{iAuthTabCallback, onwarmupcompleted, Integer.valueOf(i), x4externalsyntheticlambda2, list, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, 637518441, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -637518432, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public static final void onExtraCallbackWithResult(int i, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, @Nullable r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, @Nullable setTaggedAddrCtrl<? super x4ExternalSyntheticLambda2, ? super List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrl, @Nullable r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult, long j, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @NotNull getBacktraceNote<? super x4ExternalSyntheticLambda4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) throws NoWhenBranchMatchedException {
        onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(i), quirksExternalSyntheticBackport0, iAuthTabCallback, onwarmupcompleted, settaggedaddrctrl, onextracallbackwithresult, Long.valueOf(j), deviceQuirksExternalSyntheticLambda0, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3)}, -323720451, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 323720470, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final Unit IAuthTabCallbackStub(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -744859420, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 744859433, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public static final void onExtraCallbackWithResult(int i, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, @Nullable r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, @Nullable r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onNavigationEvent onnavigationevent, @Nullable setTaggedAddrCtrl<? super x4ExternalSyntheticLambda2, ? super List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrl, long j, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @NotNull getBacktraceNote<? super x4ExternalSyntheticLambda4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) throws NoWhenBranchMatchedException {
        onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(i), quirksExternalSyntheticBackport0, iAuthTabCallback, onwarmupcompleted, onnavigationevent, settaggedaddrctrl, Long.valueOf(j), deviceQuirksExternalSyntheticLambda0, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3)}, -1567613975, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1567613981, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final Unit onWarmupCompleted(boolean z, long j, setIso setiso) {
        return (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Boolean.valueOf(z), Long.valueOf(j), setiso}, -1037773439, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1037773451, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final void onExtraCallback(x4ExternalSyntheticLambda2 x4externalsyntheticlambda2, List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE> list, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{x4externalsyntheticlambda2, list, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, 415032346, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -415032343, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final Unit onExtraCallbackWithResult(x4ExternalSyntheticLambda2 x4externalsyntheticlambda2, List list, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        return (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{x4externalsyntheticlambda2, list, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, 1371665945, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1371665934, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final component8 onNavigationEvent(isExtraPreviewRequired isextrapreviewrequired, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, long j, setTaggedAddrCtrl<? super x4ExternalSyntheticLambda2, ? super List<r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrl, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, List<? extends component7> list, int i, findResAndMsg findresandmsg, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult) {
        return (component8) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{isextrapreviewrequired, iAuthTabCallback, Long.valueOf(j), settaggedaddrctrl, deviceQuirksExternalSyntheticLambda0, deviceQuirksExternalSyntheticLambda02, list, Integer.valueOf(i), findresandmsg, onextracallbackwithresult}, -826391869, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 826391869, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final Unit onExtraCallback(setTaggedAddrCtrl settaggedaddrctrl, List list, float f, float f2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{settaggedaddrctrl, list, Float.valueOf(f), Float.valueOf(f2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 386529533, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -386529519, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }
}
