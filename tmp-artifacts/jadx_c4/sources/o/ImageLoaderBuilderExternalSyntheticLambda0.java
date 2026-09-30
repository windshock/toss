package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ImageLoaderBuilderExternalSyntheticLambda0;
import o.MeteringRepeatingSessionExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.VirtualCameraCaptureResult;
import o.component8;
import o.getHumanReadableName;
import o.getStreamSharingChildren;
import o.isExtraPreviewRequired;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ImageLoaderBuilderExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        isExtraPreviewRequired isextrapreviewrequired = (isExtraPreviewRequired) objArr[3];
        VirtualCameraCaptureResult virtualCameraCaptureResult = (VirtualCameraCaptureResult) objArr[4];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        component8 component8VarOnNavigationEvent = onNavigationEvent(gethumanreadablename, fFloatValue, iIntValue, isextrapreviewrequired, virtualCameraCaptureResult);
        int i4 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return component8VarOnNavigationEvent;
    }

    private static final Unit IAuthTabCallback(String str, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            onExtraCallback(str, j, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onExtraCallback(str, j, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(String str, boolean z, int i, float f, boolean z2, setByteOrder setbyteorder, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        onExtraCallbackWithResult(str, z, i, f, z2, setbyteorder, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 50 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(List list, getBacktraceNote getbacktracenote, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            i |= 1;
        }
        IAuthTabCallback(list, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(getHumanReadableName gethumanreadablename, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr = {gethumanreadablename, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1)), Integer.valueOf(i3)};
        if (i7 == 0) {
            IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1200770464, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, 1200770466, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
        } else {
            IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1200770464, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, 1200770466, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
        }
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getHumanReadableName gethumanreadablename, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(hasProvider hasprovider, boolean z, int i, float f, boolean z2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(hasprovider, z, i, f, z2, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(useandconfigureprogramwithtexture);
        int i4 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(List list, getBacktraceNote getbacktracenote, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(list, getbacktracenote, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(Function2 function2, boolean z, int i, float f, boolean z2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function2, z, i, f, z2, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(useandconfigureprogramwithtexture);
        int i4 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        List list = (List) objArr[0];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1816101639, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{list, getbacktracenote, Integer.valueOf(iIntValue), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue2)}, 1816101640, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
        int i4 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, getHumanReadableName gethumanreadablename, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return (Unit) IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1654862902, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{str, gethumanreadablename, Long.valueOf(j), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 1654862906, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
        }
        Object[] objArr = {str, gethumanreadablename, Long.valueOf(j), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int i4 = 15 / 0;
        return (Unit) IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1654862902, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, 1654862906, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {quirksExternalSyntheticBackport0, getbacktracenote, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent4 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        if (i6 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(iOnNavigationEvent, 1165082847, iOnNavigationEvent3, iOnNavigationEvent4, objArr, -1165082839, iOnNavigationEvent2);
        int i7 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 58 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getStreamSharingChildren getstreamsharingchildren, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getstreamsharingchildren, onextracallbackwithresult);
        int i4 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(boolean z, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(z, str, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, j, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 != 0) {
            int i7 = 87 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, boolean z, int i, float f, boolean z2, setByteOrder setbyteorder, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, z, i, f, z2, setbyteorder, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(hasProvider hasprovider, getHumanReadableName gethumanreadablename, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(hasprovider, gethumanreadablename, j, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 53 / 0;
        }
        int i6 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(hasProvider hasprovider, boolean z, int i, float f, boolean z2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr = {hasprovider, Boolean.valueOf(z), Integer.valueOf(i), Float.valueOf(f), Boolean.valueOf(z2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1)), Integer.valueOf(i3)};
        IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 130822939, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, -130822936, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {quirksExternalSyntheticBackport0, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1)), Integer.valueOf(iIntValue2)};
        IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -497485879, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr2, 497485886, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        List list = (List) objArr[0];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        IAuthTabCallback(list, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 93 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(float f, float f2, int i, getHumanReadableName gethumanreadablename, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return onExtraCallbackWithResult(f, f2, i, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onExtraCallbackWithResult(f, f2, i, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, List list, boolean z, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, list, z, meteringRepeatingSessionExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, List list, boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {str, list, Boolean.valueOf(z), quirksExternalSyntheticBackport0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        Unit unit = (Unit) IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -2139017108, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, 2139017108, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
        int i7 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(Function2 function2, boolean z, int i, float f, boolean z2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        onExtraCallbackWithResult(function2, z, i, f, z2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getHumanReadableName gethumanreadablename, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            IAuthTabCallback(gethumanreadablename, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(gethumanreadablename, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i7 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unitIAuthTabCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(boolean z, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((i & 6) == 0) {
            int i5 = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 62 / 0;
                if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str)) {
                    i3 = 2;
                } else {
                    int i7 = onExtraCallbackWithResult + 23;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    i3 = 4;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str)) {
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1))) {
            int i9 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 40 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-372623278, i2, -1, "im.toss.components.compose.extensions.Disclaimer.<anonymous>.<anonymous> (Disclaimer.kt:30)");
                }
                onExtraCallbackWithResult(str, z, 0, 0.0f, false, null, cameraCaptureResultEmptyCameraCaptureResult, i2 & 14, 60);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i11 = IAuthTabCallback + 35;
                    onExtraCallbackWithResult = i11 % 128;
                    if (i11 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i12 = 53 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                if (!(true ^ CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
                onExtraCallbackWithResult(str, z, 0, 0.0f, false, null, cameraCaptureResultEmptyCameraCaptureResult, i2 & 14, 60);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(String str, List list, final boolean z, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(meteringRepeatingSessionExternalSyntheticLambda0, "");
        if ((i & 17) != 16) {
            int i3 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1689355027, i, -1, "im.toss.components.compose.extensions.Disclaimer.<anonymous> (Disclaimer.kt:28)");
                int i5 = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
            onExtraCallback(str, 0L, cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
            IAuthTabCallback(list, ForwardingCameraControl.onExtraCallback(-372623278, true, new getBacktraceNote() { // from class: im.toss.components.compose.extensions.DisclaimerKt$$ExternalSyntheticLambda15
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit unitOnExtraCallbackWithResult;
                    int i7 = 2 % 2;
                    int i8 = IAuthTabCallback + 13;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 != 0) {
                        unitOnExtraCallbackWithResult = ImageLoaderBuilderExternalSyntheticLambda0.onExtraCallbackWithResult(z, (String) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i9 = 74 / 0;
                    } else {
                        unitOnExtraCallbackWithResult = ImageLoaderBuilderExternalSyntheticLambda0.onExtraCallbackWithResult(z, (String) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    int i10 = IAuthTabCallback + 87;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 == 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull final String str, @NotNull final List<String> list, final boolean z, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(691281131);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i5 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            i3 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ^ true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 1024 : 2048;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) == 1170, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            } else {
                int i8 = onExtraCallbackWithResult + 113;
                IAuthTabCallback = i8 % 128;
                Object obj = null;
                if (i8 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (i7 != 0) {
                    quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = onExtraCallbackWithResult + 15;
                    IAuthTabCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(691281131, i3, -1, "im.toss.components.compose.extensions.Disclaimer (Disclaimer.kt:26)");
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(691281131, i3, -1, "im.toss.components.compose.extensions.Disclaimer (Disclaimer.kt:26)");
                }
                IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -497485879, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{quirksExternalSyntheticBackport02, ForwardingCameraControl.onExtraCallback(-1689355027, true, new getBacktraceNote() { // from class: im.toss.components.compose.extensions.DisclaimerKt$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i10 = 2 % 2;
                        int i11 = IAuthTabCallback + 13;
                        onWarmupCompleted = i11 % 128;
                        if (i11 % 2 == 0) {
                            return ImageLoaderBuilderExternalSyntheticLambda0.onWarmupCompleted(str, list, z, (MeteringRepeatingSessionExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        }
                        ImageLoaderBuilderExternalSyntheticLambda0.onWarmupCompleted(str, list, z, (MeteringRepeatingSessionExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i3 >> 9) & 14) | 48), 0}, 497485886, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                int i10 = onExtraCallbackWithResult + 31;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
            }
            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.components.compose.extensions.DisclaimerKt$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i12 = 2 % 2;
                        int i13 = onWarmupCompleted + 47;
                        onExtraCallbackWithResult = i13 % 128;
                        if (i13 % 2 != 0) {
                            return ImageLoaderBuilderExternalSyntheticLambda0.onWarmupCompleted(str, list, z, quirksExternalSyntheticBackport03, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                        ImageLoaderBuilderExternalSyntheticLambda0.onWarmupCompleted(str, list, z, quirksExternalSyntheticBackport03, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        throw null;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) == 1170, i3 & 1)) {
        }
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport032 = quirksExternalSyntheticBackport02;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[PHI: r1
      0x003a: PHI (r1v51 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v52 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0151 A[PHI: r6
      0x0151: PHI (r6v17 long) = (r6v10 long), (r6v1 long), (r6v1 long) binds: [B:55:0x014e, B:44:0x00c4, B:41:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e A[PHI: r1
      0x002e: PHI (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v52 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull final String str, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        long jLongValue;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final long j2;
        int i4;
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1141542342);
            if ((i & 67) == 0) {
                i3 = i | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2);
            } else {
                int i7 = onExtraCallbackWithResult + 5;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1141542342);
            if ((i & 6) == 0) {
            }
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        if ((i & 48) == 0) {
            int i9 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            jLongValue = j;
            if ((i2 & 2) == 0 && cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(jLongValue)) {
                int i11 = IAuthTabCallback + 63;
                onExtraCallbackWithResult = i11 % 128;
                i4 = i11 % 2 == 0 ? 73 : 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
            int i12 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
        } else {
            jLongValue = j;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            int i14 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResult3.onPostMessage()) {
                if ((i2 & 2) != 0) {
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult3, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        int i16 = IAuthTabCallback + 31;
                        onExtraCallbackWithResult = i16 % 128;
                        if (i16 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-1805527071);
                            jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, 20).ICustomTabsService();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-1805527071);
                            jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, 6).ICustomTabsService();
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-1805526111);
                        jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                    i3 &= -113;
                }
                long j3 = jLongValue;
                cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i17 = IAuthTabCallback + 61;
                    onExtraCallbackWithResult = i17 % 128;
                    int i18 = i17 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1141542342, i3, -1, "im.toss.components.compose.extensions.Heading (Disclaimer.kt:60)");
                    if (i18 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback(), Long.valueOf(j3), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i3 & 14) | 48 | ((i3 << 6) & 7168)), 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                j2 = j3;
            } else {
                int i19 = onExtraCallbackWithResult + 107;
                IAuthTabCallback = i19 % 128;
                if (i19 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    long j32 = jLongValue;
                    cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback(), Long.valueOf(j32), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i3 & 14) | 48 | ((i3 << 6) & 7168)), 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    j2 = j32;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
                    if ((i2 & 2) != 0) {
                    }
                    long j322 = jLongValue;
                    cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback(), Long.valueOf(j322), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i3 & 14) | 48 | ((i3 << 6) & 7168)), 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    j2 = j322;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            j2 = jLongValue;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.components.compose.extensions.DisclaimerKt$$ExternalSyntheticLambda16
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2, Object obj3) {
                    int i20 = 2 % 2;
                    int i21 = IAuthTabCallback + 117;
                    onNavigationEvent = i21 % 128;
                    int i22 = i21 % 2;
                    Unit unitOnNavigationEvent = ImageLoaderBuilderExternalSyntheticLambda0.onNavigationEvent(str, j2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i23 = IAuthTabCallback + 9;
                    onNavigationEvent = i23 % 128;
                    if (i23 % 2 == 0) {
                        return unitOnNavigationEvent;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[PHI: r2
      0x0040: PHI (r2v21 o.CameraCaptureResultEmptyCameraCaptureResult) = (r2v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r2v22 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0032, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034 A[PHI: r2
      0x0034: PHI (r2v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r2v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r2v22 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0032, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull final String str, final boolean z, int i, float f, boolean z2, @Nullable setByteOrder setbyteorder, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        boolean z3;
        int i9;
        setByteOrder setbyteorder2;
        final int i10;
        final float f3;
        final boolean z4;
        final setByteOrder setbyteorder3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        long jAccess100;
        Pair pairIAuthTabCallback;
        long jLongValue;
        int i11 = i;
        int i12 = 2 % 2;
        int i13 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i13 % 128;
        if (i13 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(642410300);
            if ((i2 & 67) == 0) {
                i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i2;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i4 = i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(642410300);
            if ((i2 & 6) == 0) {
            }
        }
        if ((i2 & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                int i15 = IAuthTabCallback + 85;
                onExtraCallbackWithResult = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = 55 / 0;
                    i5 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(i11) ? 256 : 128;
                } else if (cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(i11)) {
                }
                i4 |= i5;
            }
            i6 = i3 & 8;
            if (i6 == 0) {
                int i17 = onExtraCallbackWithResult + 83;
                IAuthTabCallback = i17 % 128;
                i4 = i17 % 2 != 0 ? i4 | 613 : i4 | 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    f2 = f;
                    if (cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(f2)) {
                        int i18 = onExtraCallbackWithResult + 107;
                        IAuthTabCallback = i18 % 128;
                        i7 = i18 % 2 != 0 ? 4814 : 2048;
                    } else {
                        i7 = 1024;
                    }
                    i4 |= i7;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    int i19 = IAuthTabCallback + 73;
                    onExtraCallbackWithResult = i19 % 128;
                    i4 = i19 % 2 == 0 ? i4 | 24204 : i4 | 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        z3 = z2;
                        i4 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z3) ? 16384 : 8192;
                    }
                    i9 = i3 & 32;
                    if (i9 != 0) {
                        if ((196608 & i2) == 0) {
                            setbyteorder2 = setbyteorder;
                            i4 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(setbyteorder2) ? 131072 : 65536;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i4 & 74899) != 74898, i4 & 1)) {
                            if (i14 != 0) {
                                i11 = 1;
                            }
                            float fIAuthTabCallback = i6 != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f) : f2;
                            if (i8 != 0) {
                                z3 = true;
                            }
                            if (i9 != 0) {
                                setbyteorder2 = null;
                            }
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(642410300, i4, -1, "im.toss.components.compose.extensions.Li (Disclaimer.kt:78)");
                            }
                            if (z) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-328797405);
                                getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel();
                                if (setbyteorder2 != null) {
                                    int i20 = onExtraCallbackWithResult + 19;
                                    IAuthTabCallback = i20 % 128;
                                    int i21 = i20 % 2;
                                    jLongValue = setbyteorder2.access100();
                                } else {
                                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                                        int i22 = onExtraCallbackWithResult + 13;
                                        IAuthTabCallback = i22 % 128;
                                        if (i22 % 2 != 0) {
                                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1118982365);
                                            jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 72).ICustomTabsService();
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1118982365);
                                            jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).ICustomTabsService();
                                        }
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1118981405);
                                        jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                                        int i23 = IAuthTabCallback + 123;
                                        onExtraCallbackWithResult = i23 % 128;
                                        int i24 = i23 % 2;
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                }
                                pairIAuthTabCallback = getWrite.IAuthTabCallback(gethumanreadablenameIAuthTabCallback_Parcel, setByteOrder.onNavigationEvent(jLongValue));
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-328663175);
                                getHumanReadableName gethumanreadablenameIAuthTabCallback = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback();
                                if (setbyteorder2 == null) {
                                    int i25 = onExtraCallbackWithResult + 119;
                                    IAuthTabCallback = i25 % 128;
                                    if (i25 % 2 != 0) {
                                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1118978749);
                                        jAccess100 = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 48).ICustomTabsService();
                                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1118978749);
                                        jAccess100 = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).ICustomTabsService();
                                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                    }
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1118979679);
                                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                    jAccess100 = setbyteorder2.access100();
                                }
                                pairIAuthTabCallback = getWrite.IAuthTabCallback(gethumanreadablenameIAuthTabCallback, setByteOrder.onNavigationEvent(jAccess100));
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            }
                            final getHumanReadableName gethumanreadablename = (getHumanReadableName) pairIAuthTabCallback.onExtraCallbackWithResult();
                            final long jAccess1002 = ((setByteOrder) pairIAuthTabCallback.IAuthTabCallback()).access100();
                            onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-543052017, true, new Function2() { // from class: im.toss.components.compose.extensions.DisclaimerKt$$ExternalSyntheticLambda9
                                private static int onExtraCallback = 1;
                                private static int onNavigationEvent;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i26 = 2 % 2;
                                    int i27 = onNavigationEvent + 35;
                                    onExtraCallback = i27 % 128;
                                    int i28 = i27 % 2;
                                    Unit unitOnExtraCallbackWithResult = ImageLoaderBuilderExternalSyntheticLambda0.onExtraCallbackWithResult(str, gethumanreadablename, jAccess1002, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    int i29 = onExtraCallback + 49;
                                    onNavigationEvent = i29 % 128;
                                    if (i29 % 2 == 0) {
                                        return unitOnExtraCallbackWithResult;
                                    }
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResult2, 54), z, i11, fIAuthTabCallback, z3, cameraCaptureResultEmptyCameraCaptureResult2, (57344 & i4) | 6 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 0);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            i10 = i11;
                            z4 = z3;
                            setbyteorder3 = setbyteorder2;
                            f3 = fIAuthTabCallback;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                            i10 = i11;
                            f3 = f2;
                            z4 = z3;
                            setbyteorder3 = setbyteorder2;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.components.compose.extensions.DisclaimerKt$$ExternalSyntheticLambda10
                                private static int onExtraCallback = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i26 = 2 % 2;
                                    int i27 = onExtraCallback + 75;
                                    onNavigationEvent = i27 % 128;
                                    if (i27 % 2 == 0) {
                                        ImageLoaderBuilderExternalSyntheticLambda0.onNavigationEvent(str, z, i10, f3, z4, setbyteorder3, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                        throw null;
                                    }
                                    Unit unitOnNavigationEvent = ImageLoaderBuilderExternalSyntheticLambda0.onNavigationEvent(str, z, i10, f3, z4, setbyteorder3, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    int i28 = onExtraCallback + 83;
                                    onNavigationEvent = i28 % 128;
                                    int i29 = i28 % 2;
                                    return unitOnNavigationEvent;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 196608;
                    setbyteorder2 = setbyteorder;
                    if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i4 & 74899) != 74898, i4 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                z3 = z2;
                i9 = i3 & 32;
                if (i9 != 0) {
                }
                setbyteorder2 = setbyteorder;
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i4 & 74899) != 74898, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            f2 = f;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            z3 = z2;
            i9 = i3 & 32;
            if (i9 != 0) {
            }
            setbyteorder2 = setbyteorder;
            if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i4 & 74899) != 74898, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        int i26 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i26 % 128;
        if (i26 % 2 != 0) {
            int i27 = 5 % 2;
        }
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        f2 = f;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        z3 = z2;
        i9 = i3 & 32;
        if (i9 != 0) {
        }
        setbyteorder2 = setbyteorder;
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i4 & 74899) != 74898, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final Unit onExtraCallback(hasProvider hasprovider, getHumanReadableName gethumanreadablename, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallbackWithResult + 43;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1274339284, i, -1, "im.toss.components.compose.extensions.Li.<anonymous> (Disclaimer.kt:116)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1274339284, i, -1, "im.toss.components.compose.extensions.Li.<anonymous> (Disclaimer.kt:116)");
                int i4 = onExtraCallbackWithResult + 59;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasprovider, (QuirksExternalSyntheticBackport0) null, gethumanreadablename, j, 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262130);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ba A[PHI: r4 r5
      0x01ba: PHI (r4v21 o.getHumanReadableName) = (r4v20 o.getHumanReadableName), (r4v26 o.getHumanReadableName) binds: [B:84:0x01b8, B:81:0x0181] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r5v34 o.y3ExternalSyntheticLambda0) = (r5v33 o.y3ExternalSyntheticLambda0), (r5v44 o.y3ExternalSyntheticLambda0) binds: [B:84:0x01b8, B:81:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ca A[PHI: r4 r5
      0x01ca: PHI (r4v24 o.getHumanReadableName) = (r4v20 o.getHumanReadableName), (r4v26 o.getHumanReadableName) binds: [B:84:0x01b8, B:81:0x0181] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r5v40 o.y3ExternalSyntheticLambda0) = (r5v33 o.y3ExternalSyntheticLambda0), (r5v44 o.y3ExternalSyntheticLambda0) binds: [B:84:0x01b8, B:81:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0290  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        final int i7;
        final boolean z;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Pair pairIAuthTabCallback;
        getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel;
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0;
        long jICustomTabsService;
        boolean z2 = false;
        final hasProvider hasprovider = (hasProvider) objArr[0];
        final boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        final float fFloatValue = ((Number) objArr[3]).floatValue();
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        final int iIntValue2 = ((Number) objArr[6]).intValue();
        final int iIntValue3 = ((Number) objArr[7]).intValue();
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-133849977);
        if ((iIntValue2 & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(hasprovider) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        Object obj = null;
        if ((iIntValue2 & 48) == 0) {
            int i9 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue);
                obj.hashCode();
                throw null;
            }
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 32 : 16;
        }
        int i10 = iIntValue3 & 4;
        if (i10 == 0) {
            if ((iIntValue2 & 384) == 0) {
                int i11 = onExtraCallbackWithResult + 3;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIntValue) ? 256 : 128) | i;
            }
            i3 = iIntValue3 & 8;
            if (i3 == 0) {
                i2 |= 3072;
            } else if ((iIntValue2 & 3072) == 0) {
                i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue) ? 2048 : 1024;
            }
            i4 = iIntValue3 & 16;
            if (i4 != 0) {
                if ((iIntValue2 & 24576) == 0) {
                    int i13 = IAuthTabCallback + 119;
                    onExtraCallbackWithResult = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = 97 / 0;
                        i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue2) ? 16384 : 8192;
                    } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue2)) {
                    }
                    i6 = i5 | i2;
                }
                if ((i6 & 9363) != 9362) {
                    z2 = true;
                } else {
                    int i15 = onExtraCallbackWithResult + 79;
                    IAuthTabCallback = i15 % 128;
                    int i16 = i15 % 2;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i6 & 1)) {
                    int i17 = i10 != 0 ? 1 : iIntValue;
                    if (i3 != 0) {
                        fFloatValue = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
                    }
                    float f = fFloatValue;
                    boolean z3 = i4 != 0 ? true : zBooleanValue2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i18 = IAuthTabCallback + 17;
                        onExtraCallbackWithResult = i18 % 128;
                        int i19 = i18 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-133849977, i6, -1, "im.toss.components.compose.extensions.Li (Disclaimer.kt:107)");
                    }
                    if (!(!zBooleanValue)) {
                        int i20 = onExtraCallbackWithResult + 111;
                        IAuthTabCallback = i20 % 128;
                        if (i20 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1794808153);
                            gethumanreadablenameIAuthTabCallback_Parcel = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel();
                            y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 90}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(219199854);
                                jICustomTabsService = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(219200814);
                                jICustomTabsService = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1794808153);
                            gethumanreadablenameIAuthTabCallback_Parcel = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel();
                            y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                            }
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        int i21 = onExtraCallbackWithResult + 31;
                        IAuthTabCallback = i21 % 128;
                        int i22 = i21 % 2;
                        pairIAuthTabCallback = getWrite.IAuthTabCallback(gethumanreadablenameIAuthTabCallback_Parcel, setByteOrder.onNavigationEvent(jICustomTabsService));
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1794688803);
                        pairIAuthTabCallback = getWrite.IAuthTabCallback(AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback(), setByteOrder.onNavigationEvent(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService()));
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                    final getHumanReadableName gethumanreadablename = (getHumanReadableName) pairIAuthTabCallback.onExtraCallbackWithResult();
                    final long jAccess100 = ((setByteOrder) pairIAuthTabCallback.IAuthTabCallback()).access100();
                    onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(1274339284, true, new Function2() { // from class: im.toss.components.compose.extensions.DisclaimerKt$$ExternalSyntheticLambda17
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2, Object obj3) {
                            int i23 = 2 % 2;
                            int i24 = onWarmupCompleted + 93;
                            onNavigationEvent = i24 % 128;
                            if (i24 % 2 == 0) {
                                ImageLoaderBuilderExternalSyntheticLambda0.onNavigationEvent(hasprovider, gethumanreadablename, jAccess100, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                            Unit unitOnNavigationEvent = ImageLoaderBuilderExternalSyntheticLambda0.onNavigationEvent(hasprovider, gethumanreadablename, jAccess100, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i25 = onWarmupCompleted + 29;
                            onNavigationEvent = i25 % 128;
                            int i26 = i25 % 2;
                            return unitOnNavigationEvent;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), zBooleanValue, i17, f, z3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i6 & 112) | 6 | (i6 & 896) | (i6 & 7168) | (i6 & 57344), 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i23 = onExtraCallbackWithResult + 49;
                        IAuthTabCallback = i23 % 128;
                        int i24 = i23 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    i7 = i17;
                    fFloatValue = f;
                    z = z3;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    i7 = iIntValue;
                    z = zBooleanValue2;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.components.compose.extensions.DisclaimerKt$$ExternalSyntheticLambda18
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj2, Object obj3) {
                            int i25 = 2 % 2;
                            int i26 = IAuthTabCallback + 65;
                            onWarmupCompleted = i26 % 128;
                            int i27 = i26 % 2;
                            Unit unitIAuthTabCallback = ImageLoaderBuilderExternalSyntheticLambda0.IAuthTabCallback(hasprovider, zBooleanValue, i7, fFloatValue, z, iIntValue2, iIntValue3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i28 = IAuthTabCallback + 119;
                            onWarmupCompleted = i28 % 128;
                            int i29 = i28 % 2;
                            return unitIAuthTabCallback;
                        }
                    });
                }
                return null;
            }
            i2 |= 24576;
            i6 = i2;
            if ((i6 & 9363) != 9362) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i6 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
            return null;
        }
        int i25 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i25 % 128;
        int i26 = i25 % 2;
        i |= 384;
        i2 = i;
        i3 = iIntValue3 & 8;
        if (i3 == 0) {
        }
        i4 = iIntValue3 & 16;
        if (i4 != 0) {
        }
        i6 = i2;
        if ((i6 & 9363) != 9362) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i6 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        return null;
    }

    private static final Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, final boolean z, int i, float f, boolean z2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        float f2;
        int i8;
        boolean z3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i9;
        int i10;
        int i11 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1369012538);
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
                int i12 = onExtraCallbackWithResult + 15;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                i10 = 4;
            } else {
                i10 = 2;
            }
            i4 = i10 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            int i14 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i14 % 128;
            int i15 = i14 % 2;
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 32 : 16;
        }
        int i16 = i3 & 4;
        if (i16 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                i5 = i;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i5)) {
                    i6 = 256;
                } else {
                    int i17 = onExtraCallbackWithResult + 69;
                    IAuthTabCallback = i17 % 128;
                    int i18 = i17 % 2;
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                int i19 = onExtraCallbackWithResult + 17;
                IAuthTabCallback = i19 % 128;
                int i20 = i19 % 2;
                i4 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    int i21 = IAuthTabCallback + 113;
                    onExtraCallbackWithResult = i21 % 128;
                    int i22 = i21 % 2;
                    f2 = f;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 == 0) {
                    if ((i2 & 24576) == 0) {
                        z3 = z2;
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 16384 : 8192;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 9363) == 9362, i4 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    } else {
                        if (i16 != 0) {
                            i5 = 1;
                        }
                        if (i7 != 0) {
                            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
                            int i23 = IAuthTabCallback + 49;
                            onExtraCallbackWithResult = i23 % 128;
                            int i24 = i23 % 2;
                            f2 = fIAuthTabCallback;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1369012538, i4, -1, "im.toss.components.compose.extensions.BulletRow (Disclaimer.kt:136)");
                        }
                        getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel = z ? AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel() : AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), f2, 2, (Object) null);
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = new Function1() { // from class: im.toss.components.compose.extensions.DisclaimerKt$$ExternalSyntheticLambda13
                                private static int onNavigationEvent = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj) {
                                    int i25 = 2 % 2;
                                    int i26 = onNavigationEvent + 113;
                                    onWarmupCompleted = i26 % 128;
                                    int i27 = i26 % 2;
                                    Unit unitIAuthTabCallback = ImageLoaderBuilderExternalSyntheticLambda0.IAuthTabCallback((useAndConfigureProgramWithTexture) obj);
                                    if (i27 == 0) {
                                        int i28 = 60 / 0;
                                    }
                                    return unitIAuthTabCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = getExtensionsBeforeInitialized.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, true, (Function1) objOnMinimized);
                        component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), QuirkSettingsLoader.Companion.access000(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                        RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                        if (z3) {
                            int i25 = IAuthTabCallback + 9;
                            onExtraCallbackWithResult = i25 % 128;
                            int i26 = i25 % 2;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1940051953);
                            IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1200770464, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{gethumanreadablenameIAuthTabCallback_Parcel, Integer.valueOf(i5), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i4 >> 3) & 112), 0}, 1200770466, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1940189376);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i4 & 14));
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                    final float f3 = f2;
                    final boolean z4 = z3;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        final int i27 = i5;
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.components.compose.extensions.DisclaimerKt$$ExternalSyntheticLambda14
                            private static int onExtraCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            public final Object invoke(Object obj, Object obj2) {
                                int i28 = 2 % 2;
                                int i29 = onExtraCallbackWithResult + 15;
                                onExtraCallback = i29 % 128;
                                int i30 = i29 % 2;
                                Function2 function22 = function2;
                                boolean z5 = z;
                                if (i30 != 0) {
                                    ImageLoaderBuilderExternalSyntheticLambda0.onExtraCallback(function22, z5, i27, f3, z4, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    throw null;
                                }
                                Unit unitOnExtraCallback = ImageLoaderBuilderExternalSyntheticLambda0.onExtraCallback(function22, z5, i27, f3, z4, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i31 = onExtraCallback + 117;
                                onExtraCallbackWithResult = i31 % 128;
                                if (i31 % 2 != 0) {
                                    return unitOnExtraCallback;
                                }
                                throw null;
                            }
                        });
                    }
                    i9 = IAuthTabCallback + 43;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i28 = 20 / 0;
                        return;
                    }
                    return;
                }
                i4 |= 24576;
                z3 = z2;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 9363) == 9362, i4 & 1)) {
                }
                final float f32 = f2;
                final boolean z42 = z3;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
                i9 = IAuthTabCallback + 43;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                }
            }
            f2 = f;
            i8 = i3 & 16;
            if (i8 == 0) {
            }
            z3 = z2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 9363) == 9362, i4 & 1)) {
            }
            final float f322 = f2;
            final boolean z422 = z3;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
            i9 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
            }
        }
        i5 = i;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        f2 = f;
        i8 = i3 & 16;
        if (i8 == 0) {
        }
        z3 = z2;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 9363) == 9362, i4 & 1)) {
        }
        final float f3222 = f2;
        final boolean z4222 = z3;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        i9 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 != 0) {
        }
    }

    private static final Unit onExtraCallback(getHumanReadableName gethumanreadablename, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-954702392, i, -1, "im.toss.components.compose.extensions.DisclaimerBullet.<anonymous>.<anonymous>.<anonymous> (Disclaimer.kt:166)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{" • ", null, gethumanreadablename, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131066}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(float f, float f2, int i, getHumanReadableName gethumanreadablename, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        long jOnUnminimized;
        int i3 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onExtraCallbackWithResult + 55;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-836013910, i2, -1, "im.toss.components.compose.extensions.DisclaimerBullet.<anonymous>.<anonymous>.<anonymous> (Disclaimer.kt:170)");
            }
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-250478159);
                jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-250477199);
                jOnUnminimized = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onUnminimized();
                int i6 = IAuthTabCallback + 9;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 / 2;
                }
            }
            long j = jOnUnminimized;
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f + f2) * (i - 1)), 0.0f, f2, 0.0f, 10, (Object) null);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.components.compose.extensions.DisclaimerKt$$ExternalSyntheticLambda2
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = onWarmupCompleted + 35;
                        IAuthTabCallback = i9 % 128;
                        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj;
                        if (i9 % 2 == 0) {
                            return ImageLoaderBuilderExternalSyntheticLambda0.onExtraCallback(useandconfigureprogramwithtexture);
                        }
                        ImageLoaderBuilderExternalSyntheticLambda0.onExtraCallback(useandconfigureprogramwithtexture);
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{" • ", getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized), gethumanreadablename, Long.valueOf(j), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 6, 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallbackWithResult + 73;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    private static final component8 onNavigationEvent(final getHumanReadableName gethumanreadablename, final float f, final int i, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(isextrapreviewrequired, "");
        final float fC_ = isextrapreviewrequired.c_(((component7) isextrapreviewrequired.IAuthTabCallback("viewToMeasure", ForwardingCameraControl.onExtraCallbackWithResult(-954702392, true, new Function2() { // from class: im.toss.components.compose.extensions.DisclaimerKt$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 105;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    ImageLoaderBuilderExternalSyntheticLambda0.IAuthTabCallback(gethumanreadablename, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    throw null;
                }
                Unit unitIAuthTabCallback = ImageLoaderBuilderExternalSyntheticLambda0.IAuthTabCallback(gethumanreadablename, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i5 = onExtraCallbackWithResult + 39;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 56 / 0;
                }
                return unitIAuthTabCallback;
            }
        })).get(0)).onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, 0, 0, 0, 15, (Object) null)).getInterfaceDescriptor());
        final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback = ((component7) isextrapreviewrequired.IAuthTabCallback("content", ForwardingCameraControl.onExtraCallbackWithResult(-836013910, true, new Function2() { // from class: im.toss.components.compose.extensions.DisclaimerKt$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 73;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    ImageLoaderBuilderExternalSyntheticLambda0.onWarmupCompleted(fC_, f, i, gethumanreadablename, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    throw null;
                }
                Unit unitOnWarmupCompleted = ImageLoaderBuilderExternalSyntheticLambda0.onWarmupCompleted(fC_, f, i, gethumanreadablename, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i5 = IAuthTabCallback + 37;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        })).get(0)).onExtraCallback(virtualCameraCaptureResult.onExtraCallback());
        component8 component8VarIAuthTabCallback = component4.IAuthTabCallback(isextrapreviewrequired, getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor(), getstreamsharingchildrenOnExtraCallback.T_(), (Map) null, new Function1() { // from class: im.toss.components.compose.extensions.DisclaimerKt$$ExternalSyntheticLambda8
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 41;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnExtraCallbackWithResult = ImageLoaderBuilderExternalSyntheticLambda0.onExtraCallbackWithResult(getstreamsharingchildrenOnExtraCallback, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                int i6 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 87 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        }, 4, (Object) null);
        int i3 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return component8VarIAuthTabCallback;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(getStreamSharingChildren getstreamsharingchildren, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, 0, 0, 2.0f, 3, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, 0, 0, 0.0f, 4, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        final getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[0];
        final int iIntValue = ((Number) objArr[1]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        final int iIntValue2 = ((Number) objArr[3]).intValue();
        final int iIntValue3 = ((Number) objArr[4]).intValue();
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(gethumanreadablename, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-948221720);
        if ((iIntValue2 & 6) == 0) {
            int i5 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename)) {
                int i7 = IAuthTabCallback + 63;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue2;
        } else {
            i = iIntValue2;
        }
        int i9 = iIntValue3 & 2;
        if (i9 != 0) {
            i |= 48;
        } else if ((iIntValue2 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIntValue)) {
                int i10 = onExtraCallbackWithResult + 53;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            z = true;
        } else {
            int i12 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (i9 != 0) {
                int i14 = onExtraCallbackWithResult + 65;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2;
                iIntValue = 1;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-948221720, i, -1, "im.toss.components.compose.extensions.DisclaimerBullet (Disclaimer.kt:162)");
            }
            final float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
            boolean z3 = (i & 14) == 4;
            if ((i & 112) == 32) {
                int i16 = onExtraCallbackWithResult + 35;
                IAuthTabCallback = i16 % 128;
                int i17 = i16 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((z3 | z2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function2() { // from class: im.toss.components.compose.extensions.DisclaimerKt$$ExternalSyntheticLambda11
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) {
                        int i18 = 2 % 2;
                        int i19 = onExtraCallback + 33;
                        onWarmupCompleted = i19 % 128;
                        int i20 = i19 % 2;
                        getHumanReadableName gethumanreadablename2 = gethumanreadablename;
                        float f = fIAuthTabCallback;
                        int i21 = iIntValue;
                        Float fValueOf = Float.valueOf(f);
                        Integer numValueOf = Integer.valueOf(i21);
                        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                        component8 component8Var = (component8) ImageLoaderBuilderExternalSyntheticLambda0.IAuthTabCallback(iOnNavigationEvent, 2080387592, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{gethumanreadablename2, fValueOf, numValueOf, (isExtraPreviewRequired) obj, (VirtualCameraCaptureResult) obj2}, -2080387586, iOnNavigationEvent2);
                        int i22 = onExtraCallback + 125;
                        onWarmupCompleted = i22 % 128;
                        int i23 = i22 % 2;
                        return component8Var;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            hasVideoCapture.onExtraCallback((QuirksExternalSyntheticBackport0) null, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i18 = IAuthTabCallback + 31;
                onExtraCallbackWithResult = i18 % 128;
                if (i18 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i19 = IAuthTabCallback + 11;
                onExtraCallbackWithResult = i19 % 128;
                int i20 = i19 % 2;
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.components.compose.extensions.DisclaimerKt$$ExternalSyntheticLambda12
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2) {
                    int i21 = 2 % 2;
                    int i22 = onExtraCallbackWithResult + 33;
                    IAuthTabCallback = i22 % 128;
                    int i23 = i22 % 2;
                    Unit unitOnWarmupCompleted = ImageLoaderBuilderExternalSyntheticLambda0.onWarmupCompleted(gethumanreadablename, iIntValue, iIntValue2, iIntValue3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i24 = IAuthTabCallback + 51;
                    onExtraCallbackWithResult = i24 % 128;
                    int i25 = i24 % 2;
                    return unitOnWarmupCompleted;
                }
            });
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void IAuthTabCallback(@NotNull final List<? extends T> list, @NotNull final getBacktraceNote<? super T, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function2 function2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1989596558);
        if ((i & 6) == 0) {
            int i5 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if ((i & 8) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) : cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(list)) {
                i3 = 4;
            } else {
                int i7 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 32 : 16;
            int i9 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onExtraCallbackWithResult + 59;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1989596558, i2, -1, "im.toss.components.compose.extensions.Items (Disclaimer.kt:191)");
            }
            if (list.isEmpty()) {
                int i13 = IAuthTabCallback + 47;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1522280150);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    function2 = new Function2() { // from class: im.toss.components.compose.extensions.DisclaimerKt$$ExternalSyntheticLambda3
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj, Object obj2) {
                            int i15 = 2 % 2;
                            int i16 = onWarmupCompleted + 11;
                            IAuthTabCallback = i16 % 128;
                            int i17 = i16 % 2;
                            Unit unitOnExtraCallback = ImageLoaderBuilderExternalSyntheticLambda0.onExtraCallback(list, getbacktracenote, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i18 = onWarmupCompleted + 41;
                            IAuthTabCallback = i18 % 128;
                            if (i18 % 2 == 0) {
                                return unitOnExtraCallback;
                            }
                            throw null;
                        }
                    };
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                }
                return;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1522259752);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(CollectionsKt.first(list), CollectionsKt.drop(list, 1));
            Object objOnExtraCallbackWithResult = pairIAuthTabCallback.onExtraCallbackWithResult();
            List list2 = (List) pairIAuthTabCallback.IAuthTabCallback();
            if (objOnExtraCallbackWithResult == null) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1522181385);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1522181384);
                getbacktracenote.invoke(objOnExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i2 & 112));
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            int i15 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i15 % 128;
            if (i15 % 2 == 0) {
                IAuthTabCallback(list2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i2 & 14);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                IAuthTabCallback(list2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i2 & 112);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
        }
        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            function2 = new Function2() { // from class: im.toss.components.compose.extensions.DisclaimerKt$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i16 = 2 % 2;
                    int i17 = IAuthTabCallback + 41;
                    onWarmupCompleted = i17 % 128;
                    int i18 = i17 % 2;
                    Unit unit = (Unit) ImageLoaderBuilderExternalSyntheticLambda0.IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1770572730, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{list, getbacktracenote, Integer.valueOf(i), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, -1770572725, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
                    int i19 = IAuthTabCallback + 81;
                    onWarmupCompleted = i19 % 128;
                    int i20 = i19 % 2;
                    return unit;
                }
            };
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        boolean z;
        int i7;
        boolean z2;
        int i8;
        int i9 = ~i5;
        int i10 = (~(i9 | i)) | (~(i9 | i2));
        int i11 = (~i) | i5;
        int i12 = ~(i11 | i2);
        int i13 = (~(i | (~i2))) | (~i11);
        int i14 = i5 + i2 + i6 + (243328196 * i3) + (549715570 * i4);
        int i15 = i14 * i14;
        int i16 = (i5 * 1467389705) + 421362043 + (i2 * 1467387837) + (i10 * (-934)) + (i12 * (-934)) + (i13 * 934) + (1467388771 * i6) + ((-1383267380) * i3) + (1030937622 * i4) + (i15 * 484507648);
        switch (((-90835549) * i5) + 1264254976 + ((-1099560353) * i2) + (i10 * 1643121246) + (1643121246 * i12) + ((-1643121246) * i13) + (1552285696 * i6) + (781713408 * i3) + (665583616 * i4) + (1005256704 * i15) + (i16 * i16 * 1164771328)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                String str = (String) objArr[0];
                getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[1];
                long jLongValue = ((Number) objArr[2]).longValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
                int iIntValue = ((Number) objArr[4]).intValue();
                int i17 = 2 % 2;
                int i18 = IAuthTabCallback;
                int i19 = i18 + 3;
                onExtraCallbackWithResult = i19 % 128;
                int i20 = i19 % 2;
                if ((iIntValue & 3) != 2) {
                    int i21 = i18 + 5;
                    onExtraCallbackWithResult = i21 % 128;
                    int i22 = i21 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i23 = IAuthTabCallback + 61;
                        onExtraCallbackWithResult = i23 % 128;
                        int i24 = i23 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-543052017, iIntValue, -1, "im.toss.components.compose.extensions.Li.<anonymous> (Disclaimer.kt:87)");
                    }
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, gethumanreadablename, Long.valueOf(jLongValue), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131058}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return IAuthTabCallback(objArr);
            case 7:
                final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[0];
                final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                final int iIntValue2 = ((Number) objArr[3]).intValue();
                final int iIntValue3 = ((Number) objArr[4]).intValue();
                int i25 = 2 % 2;
                int i26 = IAuthTabCallback + 15;
                onExtraCallbackWithResult = i26 % 128;
                int i27 = i26 % 2;
                Intrinsics.checkNotNullParameter(getbacktracenote, "");
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(1169626693);
                int i28 = iIntValue3 & 1;
                if (i28 != 0) {
                    i7 = iIntValue2 | 6;
                } else if ((iIntValue2 & 6) == 0) {
                    i7 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback) ? 4 : 2) | iIntValue2;
                } else {
                    i7 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote)) {
                        int i29 = IAuthTabCallback + 107;
                        onExtraCallbackWithResult = i29 % 128;
                        i8 = i29 % 2 == 0 ? 52 : 32;
                    } else {
                        i8 = 16;
                    }
                    i7 |= i8;
                }
                if ((i7 & 19) != 18) {
                    int i30 = IAuthTabCallback + 89;
                    onExtraCallbackWithResult = i30 % 128;
                    int i31 = i30 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i7 & 1)) {
                    if (i28 != 0) {
                        onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1169626693, i7, -1, "im.toss.components.compose.extensions.DisclaimerContainer (Disclaimer.kt:39)");
                    }
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(verifyDrawable.onExtraCallback(onextracallback2, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onMessageChannelReady(), (toMetersPerSecond) null, 2, (Object) null), 0.0f, 1, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(56.0f), 5, (Object) null).onExtraCallback(onextracallback);
                    QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback2);
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                    getbacktracenote.invoke(LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i7 & 112) | 6));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                }
                clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.components.compose.extensions.DisclaimerKt$$ExternalSyntheticLambda5
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj, Object obj2) {
                            int i32 = 2 % 2;
                            int i33 = onNavigationEvent + 31;
                            onExtraCallbackWithResult = i33 % 128;
                            int i34 = i33 % 2;
                            Unit unitOnExtraCallbackWithResult = ImageLoaderBuilderExternalSyntheticLambda0.onExtraCallbackWithResult(onextracallback, getbacktracenote, iIntValue2, iIntValue3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i35 = onNavigationEvent + 87;
                            onExtraCallbackWithResult = i35 % 128;
                            int i36 = i35 % 2;
                            return unitOnExtraCallbackWithResult;
                        }
                    });
                }
                return null;
            case 8:
                return onTransact(objArr);
            default:
                String str2 = (String) objArr[0];
                List list = (List) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[3];
                int iIntValue4 = ((Number) objArr[4]).intValue();
                int iIntValue5 = ((Number) objArr[5]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
                ((Number) objArr[7]).intValue();
                int i32 = 2 % 2;
                int i33 = onExtraCallbackWithResult + 83;
                IAuthTabCallback = i33 % 128;
                int i34 = i33 % 2;
                onExtraCallback(str2, list, zBooleanValue, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult3, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue4 | 1), iIntValue5);
                return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ component8 onWarmupCompleted(getHumanReadableName gethumanreadablename, float f, int i, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        Object[] objArr = {gethumanreadablename, Float.valueOf(f), Integer.valueOf(i), isextrapreviewrequired, virtualCameraCaptureResult};
        return (component8) IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 2080387592, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, -2080387586, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    public static /* synthetic */ Unit onWarmupCompleted(List list, getBacktraceNote getbacktracenote, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {list, getbacktracenote, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1770572730, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, -1770572725, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    private static final Unit onExtraCallback(String str, List list, boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {str, list, Boolean.valueOf(z), quirksExternalSyntheticBackport0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -2139017108, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, 2139017108, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    public static final void onExtraCallbackWithResult(@NotNull getHumanReadableName gethumanreadablename, int i, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        Object[] objArr = {gethumanreadablename, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3)};
        IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1200770464, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, 1200770466, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    public static final void onExtraCallbackWithResult(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull getBacktraceNote<? super MeteringRepeatingSessionExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {quirksExternalSyntheticBackport0, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -497485879, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, 497485886, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, getbacktracenote, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1165082847, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, -1165082839, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    private static final Unit onExtraCallbackWithResult(List list, getBacktraceNote getbacktracenote, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {list, getbacktracenote, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1816101639, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, 1816101640, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    public static final void onNavigationEvent(@NotNull hasProvider hasprovider, boolean z, int i, float f, boolean z2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        Object[] objArr = {hasprovider, Boolean.valueOf(z), Integer.valueOf(i), Float.valueOf(f), Boolean.valueOf(z2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3)};
        IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 130822939, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, -130822936, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    private static final Unit onNavigationEvent(String str, getHumanReadableName gethumanreadablename, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, gethumanreadablename, Long.valueOf(j), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1654862902, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, 1654862906, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }
}
