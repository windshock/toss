package o;

import android.content.res.Configuration;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.skt.usp.UCPApiConstants;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.feature.credit.ui.main.R;
import im.toss.features.credit.data.response.CreditHomeLargeBannerResponse;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.GraphicDeviceInfo;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.VirtualCameraCaptureResult;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.addInfoPartTwo;
import o.component4;
import o.component7;
import o.flipHorizontally;
import o.getStreamSharingChildren;
import o.getSurfaceSize;
import o.getViewTypeCount;
import o.handleNativeAdClick;
import o.r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY;
import o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI;
import o.setByteOrder;
import o.setCallToAction;
import o.setHorizontalGravity;
import o.toPreviewOnlyRange;
import o.w5a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addInfoPartTwo {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final SearchView IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static char[] onExtraCallback;
    private static final setInputType onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static final ResourceManagerInternalResourceManagerHooks onWarmupCompleted;

    public static final /* synthetic */ class IAuthTabCallbackDefault {
        private static int IAuthTabCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[CreditHomeLargeBannerResponse.ChangeType.values().length];
            try {
                iArr[CreditHomeLargeBannerResponse.ChangeType.DOWN.ordinal()] = 1;
                int i = IAuthTabCallback + 39;
                onWarmupCompleted = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreditHomeLargeBannerResponse.ChangeType.UP.ordinal()] = 2;
                int i3 = onWarmupCompleted + 99;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
            int i5 = onWarmupCompleted + 33;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static /* synthetic */ float IAuthTabCallback(isQueryRefinementEnabled isqueryrefinementenabled) {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        float fOnExtraCallbackWithResult = onExtraCallbackWithResult(isqueryrefinementenabled);
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        return fOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent();
        int i3 = IAuthTabCallbackDefault + 79;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 94 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static final Unit IAuthTabCallback(CreditHomeLargeBannerResponse.ChangeType changeType, boolean z, boolean z2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 63;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(changeType, z, z2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 119;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 49;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, j, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackDefault + 49;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(Function0 function0, Function0 function02, Function0 function03, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 49;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent((Function0<Float>) function0, (Function0<Float>) function02, (Function0<Float>) function03, quirksExternalSyntheticBackport0, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallbackDefault + 99;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(714431789, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -714431780, iOnNavigationEvent, iOnNavigationEvent2, new Object[]{function0, fliphorizontally}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        int i4 = onTransact + 1;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, CreditHomeLargeBannerResponse.ChangeType changeType, boolean z, boolean z2, boolean z3, Boolean bool, setByteOrder setbyteorder, String str2, CreditHomeLargeBannerResponse.ChangeType changeType2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 13;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, str, changeType, z, z2, z3, bool, setbyteorder, str2, changeType2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackDefault + 31;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static final /* synthetic */ void IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        asInterface(getsupportedhighspeedresolutionsfor, z);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onTransact + 71;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 59;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        String str = (String) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1 = (VirtualCameraControlExternalSyntheticLambda1) objArr[3];
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12 = (VirtualCameraControlExternalSyntheticLambda1) objArr[4];
        boolean zBooleanValue2 = ((Boolean) objArr[5]).booleanValue();
        int iIntValue = ((Number) objArr[6]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue2 = ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 45;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(1683909348, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1683909329, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{Boolean.valueOf(zBooleanValue), str, Float.valueOf(fFloatValue), virtualCameraControlExternalSyntheticLambda1, virtualCameraControlExternalSyntheticLambda12, Boolean.valueOf(zBooleanValue2), Integer.valueOf(iIntValue), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue2)}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        int i3 = onTransact + 91;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        CreditHomeLargeBannerResponse.ChangeType changeType = (CreditHomeLargeBannerResponse.ChangeType) objArr[5];
        CreditHomeLargeBannerResponse.ChangeType changeType2 = (CreditHomeLargeBannerResponse.ChangeType) objArr[6];
        String str5 = (String) objArr[7];
        boolean zBooleanValue = ((Boolean) objArr[8]).booleanValue();
        Function0 function0 = (Function0) objArr[9];
        Function0 function02 = (Function0) objArr[10];
        int iIntValue = ((Number) objArr[11]).intValue();
        int iIntValue2 = ((Number) objArr[12]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[13];
        ((Number) objArr[14]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(quirksExternalSyntheticBackport0, str, str2, str3, str4, changeType, changeType2, str5, zBooleanValue, (Function0<Unit>) function0, (Function0<Unit>) function02, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue), RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2));
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 51;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        CreditHomeLargeBannerResponse.ChangeType changeType = (CreditHomeLargeBannerResponse.ChangeType) objArr[2];
        CreditHomeLargeBannerResponse.ChangeType changeType2 = (CreditHomeLargeBannerResponse.ChangeType) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        String str3 = (String) objArr[5];
        Function0 function0 = (Function0) objArr[6];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[7];
        Boolean bool = (Boolean) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int iIntValue2 = ((Number) objArr[10]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        int iIntValue3 = ((Number) objArr[12]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) onExtraCallback(-2127773397, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 2127773403, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{str, str2, changeType, changeType2, Boolean.valueOf(zBooleanValue), str3, function0, quirksExternalSyntheticBackport0, bool, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue3)}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        }
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        setHorizontalGravity sethorizontalgravity = (setHorizontalGravity) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function2, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static final Unit asBinder(CreditHomeLargeBannerResponse.ChangeType changeType, boolean z, boolean z2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 79;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            i |= 1;
        }
        onExtraCallback(changeType, z, z2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackDefault + 89;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 80 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        CreditHomeLargeBannerResponse.ChangeType changeType = (CreditHomeLargeBannerResponse.ChangeType) objArr[2];
        CreditHomeLargeBannerResponse.ChangeType changeType2 = (CreditHomeLargeBannerResponse.ChangeType) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        String str3 = (String) objArr[5];
        Function0 function0 = (Function0) objArr[6];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[7];
        Boolean bool = (Boolean) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int iIntValue2 = ((Number) objArr[10]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        ((Number) objArr[12]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(str, str2, changeType, changeType2, zBooleanValue, str3, function0, quirksExternalSyntheticBackport0, bool, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 37;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 55;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        float fAsInterface = asInterface(isqueryrefinementenabled);
        int i4 = onTransact + 79;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return Float.valueOf(fAsInterface);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        String str = (String) objArr[0];
        CreditHomeLargeBannerResponse.ChangeType changeType = (CreditHomeLargeBannerResponse.ChangeType) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[4]).booleanValue();
        boolean zBooleanValue4 = ((Boolean) objArr[5]).booleanValue();
        Boolean bool = (Boolean) objArr[6];
        setByteOrder setbyteorder = (setByteOrder) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int iIntValue2 = ((Number) objArr[9]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[10];
        ((Number) objArr[11]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        onTransact = i2 % 128;
        onWarmupCompleted(str, changeType, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, bool, setbyteorder, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackDefault + 107;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        String str = (String) objArr[0];
        CreditHomeLargeBannerResponse.ChangeType changeType = (CreditHomeLargeBannerResponse.ChangeType) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[4]).booleanValue();
        boolean zBooleanValue4 = ((Boolean) objArr[5]).booleanValue();
        Boolean bool = (Boolean) objArr[6];
        setByteOrder setbyteorder = (setByteOrder) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int iIntValue2 = ((Number) objArr[9]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[10];
        int iIntValue3 = ((Number) objArr[11]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 13;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(-974295294, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 974295311, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{str, changeType, Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2), Boolean.valueOf(zBooleanValue3), Boolean.valueOf(zBooleanValue4), bool, setbyteorder, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue3)}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        int i4 = onTransact + 13;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~i3;
        int i11 = i9 | (~(i10 | i4));
        int i12 = i8 | i;
        int i13 = ~(i12 | i3);
        int i14 = (~(i4 | i7)) | (~(i8 | i10)) | (~i12);
        int i15 = i + i3 + i5 + (1650861130 * i2) + ((-924421097) * i6);
        int i16 = i15 * i15;
        int i17 = (i * (-405912681)) + 1474035712 + ((-405912681) * i3) + (i11 * (-1619411862)) + (1619411862 * i13) + ((-1619411862) * i14) + ((-2025324544) * i5) + (986710016 * i2) + ((-948436992) * i6) + ((-1864630272) * i16);
        int i18 = ((i * (-959335331)) - 587927435) + (i3 * (-959335331)) + (i11 * 462) + (i13 * (-462)) + (i14 * 462) + (i5 * (-959334869)) + (i2 * 22983790) + (i6 * 637852125) + (i16 * (-1124859904));
        switch (i17 + (i18 * i18 * (-1807482880))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                Function2 function2 = (Function2) objArr[0];
                setHorizontalGravity sethorizontalgravity = (setHorizontalGravity) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                int i19 = 2 % 2;
                int i20 = onTransact + 125;
                IAuthTabCallbackDefault = i20 % 128;
                int i21 = i20 % 2;
                Unit unitIAuthTabCallback = IAuthTabCallback(function2, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i22 = IAuthTabCallbackDefault + 101;
                onTransact = i22 % 128;
                int i23 = i22 % 2;
                return unitIAuthTabCallback;
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return onTransact(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return asBinder(objArr);
            case 10:
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i24 = 2 % 2;
                int i25 = IAuthTabCallbackDefault + 113;
                onTransact = i25 % 128;
                int i26 = i25 % 2;
                getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
                int i27 = IAuthTabCallbackDefault + 125;
                onTransact = i27 % 128;
                int i28 = i27 % 2;
                return null;
            case 11:
                return IAuthTabCallbackDefault(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return IAuthTabCallbackStubProxy(objArr);
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                return access100(objArr);
            case 14:
                return access000(objArr);
            case 15:
                return IAuthTabCallback_Parcel(objArr);
            case 16:
                return getInterfaceDescriptor(objArr);
            case 17:
                return extraCallbackWithResult(objArr);
            case UCPApiConstants.MULTI_UICC_MIN_SEIOAGENT_VERSION_CODE /* 18 */:
                return extraCallback(objArr);
            case 19:
                return writeTypedObject(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1 = (VirtualCameraControlExternalSyntheticLambda1) objArr[0];
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12 = (VirtualCameraControlExternalSyntheticLambda1) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        String str = (String) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        setHorizontalGravity sethorizontalgravity = (setHorizontalGravity) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(virtualCameraControlExternalSyntheticLambda1, virtualCameraControlExternalSyntheticLambda12, fFloatValue, str, zBooleanValue, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IAuthTabCallbackDefault + 41;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static final Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 93;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 105;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditHomeLargeBannerResponse.ChangeType changeType, boolean z, boolean z2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 67;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            asBinder(changeType, z, z2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitAsBinder = asBinder(changeType, z, z2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = IAuthTabCallbackDefault + 87;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return unitAsBinder;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, CreditHomeLargeBannerResponse.ChangeType changeType, CreditHomeLargeBannerResponse.ChangeType changeType2, boolean z, boolean z2, boolean z3, Boolean bool, setByteOrder setbyteorder, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onTransact + 49;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(quirksExternalSyntheticBackport0, str, str2, changeType, changeType2, z, z2, z3, bool, setbyteorder, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallbackDefault + 51;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, String str4, CreditHomeLargeBannerResponse.ChangeType changeType, CreditHomeLargeBannerResponse.ChangeType changeType2, String str5, boolean z, Function0 function0, Function0 function02, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 7;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {quirksExternalSyntheticBackport0, str, str2, str3, str4, changeType, changeType2, str5, Boolean.valueOf(z), function0, function02, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        Unit unit = (Unit) onExtraCallback(135547837, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -135547822, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        int i7 = onTransact + 87;
        IAuthTabCallbackDefault = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, String str4, CreditHomeLargeBannerResponse.ChangeType changeType, CreditHomeLargeBannerResponse.ChangeType changeType2, boolean z, boolean z2, boolean z3, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, getViewTypeCount.IAuthTabCallback iAuthTabCallback, Function0 function0, setByteOrder setbyteorder, GraphicDeviceInfo graphicDeviceInfo, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onTransact + 15;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        onExtraCallbackWithResult(quirksExternalSyntheticBackport0, str, str2, str3, str4, changeType, changeType2, z, z2, z3, deviceQuirksExternalSyntheticLambda0, iAuthTabCallback, (Function0<Unit>) function0, setbyteorder, graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallbackDefault + 21;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(getStreamSharingChildren getstreamsharingchildren, int i, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 49;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {getstreamsharingchildren, Integer.valueOf(i), onextracallbackwithresult};
        Unit unit = (Unit) onExtraCallback(779720886, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -779720883, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        int i5 = onTransact + 23;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(isQueryRefinementEnabled isqueryrefinementenabled, float f, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(isqueryrefinementenabled, f, fliphorizontally);
        int i4 = IAuthTabCallbackDefault + 109;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, String str, String str2, setByteOrder setbyteorder, GraphicDeviceInfo graphicDeviceInfo, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 33;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {Boolean.valueOf(z), str, str2, setbyteorder, graphicDeviceInfo, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) onExtraCallback(-118064391, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 118064398, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        int i5 = onTransact + 123;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        onExtraCallback(1650348153, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1650348143, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        int i4 = onTransact + 91;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        setHorizontalGravity sethorizontalgravity = (setHorizontalGravity) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder(function2, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitAsBinder = asBinder(function2, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = IAuthTabCallbackDefault + 99;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 81;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onTransact + 49;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onExtraCallbackWithResult(CreditHomeLargeBannerResponse.ChangeType changeType, boolean z, boolean z2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 123;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(changeType, z, z2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackDefault + 65;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, long j, long j2, int i, Boolean bool, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onTransact + 43;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, j, j2, i, bool, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = IAuthTabCallbackDefault + 103;
        onTransact = i8 % 128;
        if (i8 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(isQueryRefinementEnabled isqueryrefinementenabled, float f, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(isqueryrefinementenabled, f, fliphorizontally);
        int i4 = IAuthTabCallbackDefault + 39;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor, z);
        int i4 = IAuthTabCallbackDefault + 3;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 63;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Unit unit = (Unit) onExtraCallback(511754460, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -511754449, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        int i6 = onTransact + 65;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditHomeLargeBannerResponse.ChangeType changeType, boolean z, boolean z2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 1;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(changeType, z, z2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackDefault + 47;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(String str, long j, long j2, int i, Boolean bool, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackDefault + 13;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        onExtraCallback(-490342496, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 490342497, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{str, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), bool, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1)), Integer.valueOf(i3)}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallbackDefault + 13;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, CreditHomeLargeBannerResponse.ChangeType changeType, CreditHomeLargeBannerResponse.ChangeType changeType2, String str4, Function0 function0, boolean z, String str5, boolean z2, Function0 function02, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackDefault + 7;
        onTransact = i6 % 128;
        onExtraCallback(quirksExternalSyntheticBackport0, str, str2, str3, changeType, changeType2, str4, function0, z, str5, z2, function02, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i6 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i2) : RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, CreditHomeLargeBannerResponse.ChangeType changeType, CreditHomeLargeBannerResponse.ChangeType changeType2, boolean z, float f, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12, Function0 function0, setByteOrder setbyteorder, GraphicDeviceInfo graphicDeviceInfo, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 97;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, str, str2, str3, changeType, changeType2, z, f, virtualCameraControlExternalSyntheticLambda1, virtualCameraControlExternalSyntheticLambda12, function0, setbyteorder, graphicDeviceInfo, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 25;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, CreditHomeLargeBannerResponse.ChangeType changeType, CreditHomeLargeBannerResponse.ChangeType changeType2, boolean z, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12, float f, setByteOrder setbyteorder, GraphicDeviceInfo graphicDeviceInfo, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 85;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return onWarmupCompleted(quirksExternalSyntheticBackport0, str, str2, str3, changeType, changeType2, z, virtualCameraControlExternalSyntheticLambda1, virtualCameraControlExternalSyntheticLambda12, f, setbyteorder, graphicDeviceInfo, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(quirksExternalSyntheticBackport0, str, str2, str3, changeType, changeType2, z, virtualCameraControlExternalSyntheticLambda1, virtualCameraControlExternalSyntheticLambda12, f, setbyteorder, graphicDeviceInfo, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, String str4, CreditHomeLargeBannerResponse.ChangeType changeType, CreditHomeLargeBannerResponse.ChangeType changeType2, boolean z, Function0 function0, Function0 function02, boolean z2, setByteOrder setbyteorder, GraphicDeviceInfo graphicDeviceInfo, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackDefault + 85;
        onTransact = i6 % 128;
        onExtraCallbackWithResult(quirksExternalSyntheticBackport0, str, str2, str3, str4, changeType, changeType2, z, (Function0<Unit>) function0, (Function0<Unit>) function02, z2, setbyteorder, graphicDeviceInfo, virtualCameraControlExternalSyntheticLambda1, virtualCameraControlExternalSyntheticLambda12, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i6 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i2) : RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ void onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onTransact(getsupportedhighspeedresolutionsfor, z);
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
    }

    public static /* synthetic */ float onWarmupCompleted(isQueryRefinementEnabled isqueryrefinementenabled) {
        float fFloatValue;
        int i = 2 % 2;
        int i2 = onTransact + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {isqueryrefinementenabled};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i3 == 0) {
            fFloatValue = ((Float) onExtraCallback(433947631, iOnNavigationEvent3, -433947623, iOnNavigationEvent, iOnNavigationEvent2, objArr, iOnNavigationEvent4)).floatValue();
            int i4 = 31 / 0;
        } else {
            fFloatValue = ((Float) onExtraCallback(433947631, iOnNavigationEvent3, -433947623, iOnNavigationEvent, iOnNavigationEvent2, objArr, iOnNavigationEvent4)).floatValue();
        }
        int i5 = onTransact + 69;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return fFloatValue;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        CreditHomeLargeBannerResponse.ChangeType changeType = (CreditHomeLargeBannerResponse.ChangeType) objArr[5];
        CreditHomeLargeBannerResponse.ChangeType changeType2 = (CreditHomeLargeBannerResponse.ChangeType) objArr[6];
        boolean zBooleanValue = ((Boolean) objArr[7]).booleanValue();
        Function0 function0 = (Function0) objArr[8];
        Function0 function02 = (Function0) objArr[9];
        boolean zBooleanValue2 = ((Boolean) objArr[10]).booleanValue();
        setByteOrder setbyteorder = (setByteOrder) objArr[11];
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[12];
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1 = (VirtualCameraControlExternalSyntheticLambda1) objArr[13];
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12 = (VirtualCameraControlExternalSyntheticLambda1) objArr[14];
        int iIntValue = ((Number) objArr[15]).intValue();
        int iIntValue2 = ((Number) objArr[16]).intValue();
        int iIntValue3 = ((Number) objArr[17]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[18];
        int iIntValue4 = ((Number) objArr[19]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent(quirksExternalSyntheticBackport0, str, str2, str3, str4, changeType, changeType2, zBooleanValue, function0, function02, zBooleanValue2, setbyteorder, graphicDeviceInfo, virtualCameraControlExternalSyntheticLambda1, virtualCameraControlExternalSyntheticLambda12, iIntValue, iIntValue2, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, str, str2, str3, str4, changeType, changeType2, zBooleanValue, function0, function02, zBooleanValue2, setbyteorder, graphicDeviceInfo, virtualCameraControlExternalSyntheticLambda1, virtualCameraControlExternalSyntheticLambda12, iIntValue, iIntValue2, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
        int i3 = onTransact + 5;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditHomeLargeBannerResponse.ChangeType changeType, boolean z, boolean z2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 97;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(changeType, z, z2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 4 / 0;
        }
        int i7 = IAuthTabCallbackDefault + 95;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, String str2, CreditHomeLargeBannerResponse.ChangeType changeType, CreditHomeLargeBannerResponse.ChangeType changeType2, boolean z, String str3, Function0 function0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 29;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            onNavigationEvent(str, str2, changeType, changeType2, z, str3, function0, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(str, str2, changeType, changeType2, z, str3, function0, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackDefault + 69;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, Function0 function02, Function0 function03, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 111;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function0, function02, function03, quirksExternalSyntheticBackport0, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 != 0) {
            int i7 = 7 / 0;
        }
        int i8 = onTransact + 29;
        IAuthTabCallbackDefault = i8 % 128;
        int i9 = i8 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, CreditHomeLargeBannerResponse.ChangeType changeType, CreditHomeLargeBannerResponse.ChangeType changeType2, boolean z, boolean z2, boolean z3, Boolean bool, setByteOrder setbyteorder, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 15;
        onTransact = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            onExtraCallback(quirksExternalSyntheticBackport0, str, str2, changeType, changeType2, z, z2, z3, bool, setbyteorder, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, str, str2, changeType, changeType2, z, z2, z3, bool, setbyteorder, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = IAuthTabCallbackDefault + 5;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, CreditHomeLargeBannerResponse.ChangeType changeType, CreditHomeLargeBannerResponse.ChangeType changeType2, String str4, Function0 function0, boolean z, String str5, boolean z2, Function0 function02, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackDefault + 45;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, str, str2, str3, changeType, changeType2, str4, function0, z, str5, z2, function02, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = IAuthTabCallbackDefault + 59;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, String str4, CreditHomeLargeBannerResponse.ChangeType changeType, CreditHomeLargeBannerResponse.ChangeType changeType2, boolean z, boolean z2, boolean z3, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, getViewTypeCount.IAuthTabCallback iAuthTabCallback, Function0 function0, setByteOrder setbyteorder, GraphicDeviceInfo graphicDeviceInfo, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackDefault + 43;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, str, str2, str3, str4, changeType, changeType2, z, z2, z3, deviceQuirksExternalSyntheticLambda0, iAuthTabCallback, function0, setbyteorder, graphicDeviceInfo, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = IAuthTabCallbackDefault + 91;
        onTransact = i8 % 128;
        if (i8 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, boolean z2, getViewTypeCount.IAuthTabCallback iAuthTabCallback, int i, String str, String str2, CreditHomeLargeBannerResponse.ChangeType changeType, CreditHomeLargeBannerResponse.ChangeType changeType2, boolean z3, boolean z4, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 71;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(z, z2, iAuthTabCallback, i, str, str2, changeType, changeType2, z3, z4, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onTransact + 9;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 1 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ component8 onWarmupCompleted(int i, component4 component4Var, component7 component7Var, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i2 = 2 % 2;
        int i3 = onTransact + 75;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallbackWithResult(i, component4Var, component7Var, virtualCameraCaptureResult);
        }
        onExtraCallbackWithResult(i, component4Var, component7Var, virtualCameraCaptureResult);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ setInputType onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        setInputType setinputtype = onExtraCallbackWithResult;
        int i5 = i3 + 69;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return setinputtype;
    }

    public static final /* synthetic */ void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 31;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 73;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(getsupportedhighspeedresolutionsfor, z);
        int i4 = IAuthTabCallbackDefault + 23;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        String str = (String) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1 = (VirtualCameraControlExternalSyntheticLambda1) objArr[3];
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12 = (VirtualCameraControlExternalSyntheticLambda1) objArr[4];
        boolean zBooleanValue2 = ((Boolean) objArr[5]).booleanValue();
        int iIntValue = ((Number) objArr[6]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 39;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(zBooleanValue, str, fFloatValue, virtualCameraControlExternalSyntheticLambda1, virtualCameraControlExternalSyntheticLambda12, zBooleanValue2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 21;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    static {
        onExtraCallbackWithResult();
        onExtraCallbackWithResult = new setInputType(0.22f, 1.0f, 0.36f, 1.0f);
        getThumbPosition getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(400, 0, (setOnQueryTextListener) null, 6, (Object) null);
        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
        onWarmupCompleted = ResourceManagerInternalVdcInflateDelegate.onExtraCallback(getthumbpositionOnExtraCallbackWithResult, onextracallbackwithresult.access000(), false, (Function1) null, 12, (Object) null).onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback(onQueryRefine.onExtraCallbackWithResult(400, 0, (setOnQueryTextListener) null, 6, (Object) null), 0.0f, 2, (Object) null));
        IAuthTabCallback = ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback(onQueryRefine.onExtraCallbackWithResult(400, 0, (setOnQueryTextListener) null, 6, (Object) null), onextracallbackwithresult.onExtraCallbackWithResult(), false, (Function1) null, 12, (Object) null).onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted(onQueryRefine.onExtraCallbackWithResult(400, 0, (setOnQueryTextListener) null, 6, (Object) null), 0.0f, 2, (Object) null));
        int i = asBinder + 61;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public static final boolean IAuthTabCallback(@Nullable CreditHomeLargeBannerResponse.ChangeType changeType, @Nullable CreditHomeLargeBannerResponse.ChangeType changeType2) {
        int i = 2 % 2;
        CreditHomeLargeBannerResponse.ChangeType changeType3 = CreditHomeLargeBannerResponse.ChangeType.UP;
        if (changeType == changeType3) {
            return true;
        }
        int i2 = onTransact + 29;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        CreditHomeLargeBannerResponse.ChangeType changeType4 = CreditHomeLargeBannerResponse.ChangeType.DOWN;
        if (changeType == changeType4 || changeType2 == changeType3) {
            return true;
        }
        int i4 = IAuthTabCallbackDefault + 61;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return changeType2 == changeType4;
        }
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Function0<Unit> $onFirstRowShown;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $showFirstRow$delegate;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $showIcons$delegate;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $showSecondRow$delegate;
        final /* synthetic */ boolean $showsRollingMessage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(boolean z, Function0<Unit> function0, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor3, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$showsRollingMessage = z;
            this.$onFirstRowShown = function0;
            this.$showFirstRow$delegate = getsupportedhighspeedresolutionsfor;
            this.$showSecondRow$delegate = getsupportedhighspeedresolutionsfor2;
            this.$showIcons$delegate = getsupportedhighspeedresolutionsfor3;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$showsRollingMessage, this.$onFirstRowShown, this.$showFirstRow$delegate, this.$showSecondRow$delegate, this.$showIcons$delegate, access13800Var);
            int i2 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 63 / 0;
            }
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(900, r8) != r1) goto L28;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (this.$showsRollingMessage) {
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(300L, this) != objOnWarmupCompleted) {
                    }
                    return objOnWarmupCompleted;
                }
                addInfoPartTwo.onWarmupCompleted((getSupportedHighSpeedResolutionsFor) this.$showSecondRow$delegate, true);
                addInfoPartTwo.onNavigationEvent((getSupportedHighSpeedResolutionsFor) this.$showIcons$delegate, true);
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                int i3 = IAuthTabCallback + 15;
                int i4 = i3 % 128;
                onExtraCallbackWithResult = i4;
                if (i3 % 2 == 0 ? i2 != 2 : i2 != 3) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = i4 + 63;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        int i6 = 53 / 0;
                    } else {
                        ResultKt.onNavigationEvent(obj);
                    }
                    addInfoPartTwo.onNavigationEvent((getSupportedHighSpeedResolutionsFor) this.$showIcons$delegate, true);
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                addInfoPartTwo.onExtraCallback((getSupportedHighSpeedResolutionsFor) this.$showFirstRow$delegate, false);
                addInfoPartTwo.onWarmupCompleted((getSupportedHighSpeedResolutionsFor) this.$showSecondRow$delegate, true);
                this.label = 3;
            } else {
                ResultKt.onNavigationEvent(obj);
            }
            addInfoPartTwo.onExtraCallback((getSupportedHighSpeedResolutionsFor) this.$showFirstRow$delegate, true);
            this.$onFirstRowShown.invoke();
            this.label = 2;
            if (formatMsgs.onWarmupCompleted(1500L, this) != objOnWarmupCompleted) {
                addInfoPartTwo.onExtraCallback((getSupportedHighSpeedResolutionsFor) this.$showFirstRow$delegate, false);
                addInfoPartTwo.onWarmupCompleted((getSupportedHighSpeedResolutionsFor) this.$showSecondRow$delegate, true);
                this.label = 3;
            }
            return objOnWarmupCompleted;
        }
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, CreditHomeLargeBannerResponse.ChangeType changeType, CreditHomeLargeBannerResponse.ChangeType changeType2, boolean z, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12, float f, setByteOrder setbyteorder, GraphicDeviceInfo graphicDeviceInfo, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        float fIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 21;
        onTransact = i4 % 128;
        if (i4 % 2 == 0 ? (i & 3) == 2 : (i & 5) == 2) {
            z2 = false;
        } else {
            int i5 = i3 + 107;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            z2 = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1324714424, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRow.<anonymous>.<anonymous> (CreditHomeLoanNeedsRow.kt:157)");
            }
            boolean zOnWarmupCompleted = onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
            if (virtualCameraControlExternalSyntheticLambda1 != null) {
                int i7 = onTransact + 11;
                IAuthTabCallbackDefault = i7 % 128;
                if (i7 % 2 == 0) {
                    fIAuthTabCallback = virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
                    int i8 = 46 / 0;
                } else {
                    fIAuthTabCallback = virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
                }
            } else {
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f);
            }
            onExtraCallbackWithResult(quirksExternalSyntheticBackport0, str, (String) null, str2, str3, changeType, changeType2, zOnWarmupCompleted, z, false, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(f, fIAuthTabCallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), virtualCameraControlExternalSyntheticLambda12 != null ? virtualCameraControlExternalSyntheticLambda12.IAuthTabCallback() : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f)), (getViewTypeCount.IAuthTabCallback) null, (Function0<Unit>) null, setbyteorder, graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, 805306368, 0, 6148);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IAuthTabCallbackDefault + 7;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i11 = onTransact + 3;
                IAuthTabCallbackDefault = i11 % 128;
                int i12 = i11 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(Function2 function2, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 115;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallbackDefault + 13;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1942455890, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRow.<anonymous>.<anonymous> (CreditHomeLoanNeedsRow.kt:183)");
        }
        function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i7 = onTransact + 53;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, CreditHomeLargeBannerResponse.ChangeType changeType, CreditHomeLargeBannerResponse.ChangeType changeType2, boolean z, float f, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12, Function0 function0, setByteOrder setbyteorder, GraphicDeviceInfo graphicDeviceInfo, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        float fIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 13;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = false;
        if ((i & 3) != 2) {
            int i6 = i3 + 37;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 != 0) {
                z2 = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            int i7 = IAuthTabCallbackDefault + 85;
            onTransact = i7 % 128;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1767049718, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRow.<anonymous> (CreditHomeLoanNeedsRow.kt:192)");
            }
            boolean zOnWarmupCompleted = onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
            float fIAuthTabCallback2 = virtualCameraControlExternalSyntheticLambda1 != null ? virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback() : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f);
            if (virtualCameraControlExternalSyntheticLambda12 != null) {
                fIAuthTabCallback = virtualCameraControlExternalSyntheticLambda12.IAuthTabCallback();
            } else {
                float fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f);
                int i8 = IAuthTabCallbackDefault + 47;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
                fIAuthTabCallback = fIAuthTabCallback3;
            }
            onExtraCallbackWithResult(quirksExternalSyntheticBackport0, str, (String) null, str2, str3, changeType, changeType2, zOnWarmupCompleted, z, false, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(f, fIAuthTabCallback2, 0.0f, fIAuthTabCallback, 4, (Object) null), getViewTypeCount.IAuthTabCallback.Companion.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f)), (Function0<Unit>) function0, setbyteorder, graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 516);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(Function2 function2, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 91;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1658203881, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRow.<anonymous>.<anonymous> (CreditHomeLoanNeedsRow.kt:228)");
        }
        function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i5 = onTransact + 47;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final String str, @Nullable final String str2, @Nullable final String str3, @Nullable final String str4, @Nullable CreditHomeLargeBannerResponse.ChangeType changeType, @Nullable CreditHomeLargeBannerResponse.ChangeType changeType2, final boolean z, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02, boolean z2, @Nullable setByteOrder setbyteorder, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, @Nullable VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) throws Throwable {
        int i4;
        int i5;
        Integer num;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda13;
        boolean z3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final CreditHomeLargeBannerResponse.ChangeType changeType3;
        final CreditHomeLargeBannerResponse.ChangeType changeType4;
        final boolean z4;
        final setByteOrder setbyteorder2;
        final GraphicDeviceInfo graphicDeviceInfo2;
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda14;
        final VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda15;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z5;
        CreditHomeLargeBannerResponse.ChangeType changeType5;
        boolean z6;
        CameraPresenceProviderExternalSyntheticLambda0 cameraPresenceProviderExternalSyntheticLambda0;
        int i13;
        Unit unit;
        CreditHomeLargeBannerResponse.ChangeType changeType6;
        Integer num2;
        int i14;
        int i15;
        boolean z7;
        int i16;
        Throwable th;
        final CreditHomeLargeBannerResponse.ChangeType changeType7;
        int i17;
        int i18 = 2 % 2;
        int i19 = IAuthTabCallbackDefault + 69;
        onTransact = i19 % 128;
        int i20 = i19 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1427948778);
        if ((i & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ^ true ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 256 : 128;
        }
        int i21 = 2048;
        if ((i & 3072) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4) ? 16384 : 8192;
        }
        int i22 = i3 & 32;
        int iOrdinal = -1;
        if (i22 != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(changeType == null ? -1 : changeType.ordinal())) {
                int i23 = IAuthTabCallbackDefault + 23;
                onTransact = i23 % 128;
                if (i23 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i4 |= i5;
        }
        int i24 = i3 & 64;
        if (i24 != 0) {
            i4 |= 1572864;
        } else {
            if ((i & 1572864) == 0) {
                if (changeType2 == null) {
                    int i25 = onTransact + 7;
                    num = 6;
                    IAuthTabCallbackDefault = i25 % 128;
                    if (i25 % 2 == 0) {
                        int i26 = 74 / 0;
                    }
                } else {
                    num = 6;
                    iOrdinal = changeType2.ordinal();
                }
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal) ? 1048576 : 524288;
            }
            if ((12582912 & i) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                    int i27 = IAuthTabCallbackDefault + 71;
                    onTransact = i27 % 128;
                    if (i27 % 2 != 0) {
                        int i28 = 29 / 0;
                    }
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i4 |= i17;
            }
            if ((100663296 & i) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 67108864 : 33554432;
            }
            if ((805306368 & i) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 536870912 : 268435456;
            }
            i6 = i4;
            i7 = i3 & 1024;
            if (i7 == 0) {
                i8 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i8 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 4 : 2);
            } else {
                i8 = i2;
            }
            i9 = i3 & 2048;
            if (i9 == 0) {
                i8 |= 48;
            } else if ((i2 & 48) == 0) {
                i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setbyteorder) ? 32 : 16;
            }
            int i29 = i8;
            i10 = i3 & 4096;
            if (i10 == 0) {
                i29 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    i29 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo) ? 256 : 128;
                }
                i11 = i3 & 8192;
                if (i11 != 0) {
                    i29 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(virtualCameraControlExternalSyntheticLambda1)) {
                        int i30 = onTransact + 71;
                        IAuthTabCallbackDefault = i30 % 128;
                        int i31 = i30 % 2;
                    } else {
                        i21 = 1024;
                    }
                    i29 |= i21;
                }
                i12 = i3 & 16384;
                if (i12 == 0) {
                    if ((i2 & 24576) == 0) {
                        virtualCameraControlExternalSyntheticLambda13 = virtualCameraControlExternalSyntheticLambda12;
                        i29 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(virtualCameraControlExternalSyntheticLambda13) ? 16384 : 8192;
                    }
                    if ((i6 & 306783379) == 306783378 || (i29 & 9363) != 9362) {
                        z3 = true;
                    } else {
                        int i32 = IAuthTabCallbackDefault + 55;
                        onTransact = i32 % 128;
                        int i33 = i32 % 2;
                        z3 = false;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i6 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                        changeType3 = changeType;
                        changeType4 = changeType2;
                        z4 = z2;
                        setbyteorder2 = setbyteorder;
                        graphicDeviceInfo2 = graphicDeviceInfo;
                        virtualCameraControlExternalSyntheticLambda14 = virtualCameraControlExternalSyntheticLambda13;
                        virtualCameraControlExternalSyntheticLambda15 = virtualCameraControlExternalSyntheticLambda1;
                    } else {
                        CreditHomeLargeBannerResponse.ChangeType changeType8 = i22 != 0 ? null : changeType;
                        if (i24 != 0) {
                            int i34 = IAuthTabCallbackDefault + 113;
                            onTransact = i34 % 128;
                            if (i34 % 2 != 0) {
                                z5 = false;
                                int i35 = 4 / 0;
                            } else {
                                z5 = false;
                            }
                            changeType5 = null;
                        } else {
                            z5 = false;
                            changeType5 = changeType2;
                        }
                        boolean z8 = i7 != 0 ? true : z2;
                        setByteOrder setbyteorder3 = i9 != 0 ? null : setbyteorder;
                        GraphicDeviceInfo graphicDeviceInfo3 = i10 != 0 ? null : graphicDeviceInfo;
                        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda16 = i11 != 0 ? null : virtualCameraControlExternalSyntheticLambda1;
                        if (i12 != 0) {
                            z6 = true;
                            int i36 = IAuthTabCallbackDefault + 1;
                            onTransact = i36 % 128;
                            int i37 = i36 % 2;
                            virtualCameraControlExternalSyntheticLambda14 = null;
                        } else {
                            z6 = true;
                            virtualCameraControlExternalSyntheticLambda14 = virtualCameraControlExternalSyntheticLambda13;
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i38 = onTransact + 95;
                            IAuthTabCallbackDefault = i38 % 128;
                            int i39 = i38 % 2;
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1427948778, i6, i29, "im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRow (CreditHomeLoanNeedsRow.kt:118)");
                        }
                        final float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(z8 ? 8 : 20);
                        boolean zIAuthTabCallback = IAuthTabCallback(changeType8, changeType5);
                        boolean z9 = (str4 == null || StringsKt.isBlank(str4) || z) ? z5 : z6;
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                            cameraPresenceProviderExternalSyntheticLambda0 = null;
                            i13 = 2;
                            objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        } else {
                            cameraPresenceProviderExternalSyntheticLambda0 = null;
                            i13 = 2;
                        }
                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, cameraPresenceProviderExternalSyntheticLambda0, i13, cameraPresenceProviderExternalSyntheticLambda0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, cameraPresenceProviderExternalSyntheticLambda0, i13, cameraPresenceProviderExternalSyntheticLambda0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                        }
                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
                        Unit unit2 = Unit.INSTANCE;
                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z9);
                        boolean z10 = (i6 & 234881024) == 67108864;
                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((zOnExtraCallback || z10) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                            unit = unit2;
                            boolean z11 = z9;
                            changeType6 = changeType5;
                            num2 = num;
                            i14 = i29;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            i15 = i6;
                            z7 = z9;
                            i16 = 0;
                            th = null;
                            objOnMinimized4 = new onNavigationEvent(z11, function0, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor, null);
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized4);
                        } else {
                            changeType6 = changeType5;
                            i14 = i29;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            i15 = i6;
                            z7 = z9;
                            num2 = num;
                            i16 = 0;
                            th = null;
                            unit = unit2;
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult2, 6);
                        if (zIAuthTabCallback) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1630410904);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = measureChildConstrained.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, function02, 15, (Object) null);
                            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult2, i16);
                            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, i16));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallback);
                            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                                getAwbState.onExtraCallback();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                            int i40 = i14;
                            onNavigationEvent(onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2), str4, fIAuthTabCallback, virtualCameraControlExternalSyntheticLambda16, virtualCameraControlExternalSyntheticLambda14, z8, cameraCaptureResultEmptyCameraCaptureResult2, ((i15 >> 9) & 112) | (i40 & 7168) | (57344 & i40) | ((i40 << 15) & 458752));
                            final CreditHomeLargeBannerResponse.ChangeType changeType9 = changeType8;
                            final CreditHomeLargeBannerResponse.ChangeType changeType10 = changeType6;
                            final boolean z12 = z8;
                            changeType7 = changeType8;
                            final VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda17 = virtualCameraControlExternalSyntheticLambda16;
                            final VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda18 = virtualCameraControlExternalSyntheticLambda14;
                            final setByteOrder setbyteorder4 = setbyteorder3;
                            final GraphicDeviceInfo graphicDeviceInfo4 = graphicDeviceInfo3;
                            final EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(1324714424, true, new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda26
                                private static int onExtraCallback = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj2, Object obj3) {
                                    int i41 = 2 % 2;
                                    int i42 = onExtraCallback + 13;
                                    onWarmupCompleted = i42 % 128;
                                    int i43 = i42 % 2;
                                    Unit unitOnNavigationEvent = addInfoPartTwo.onNavigationEvent(quirksExternalSyntheticBackport0, str, str2, str3, changeType9, changeType10, z12, virtualCameraControlExternalSyntheticLambda17, virtualCameraControlExternalSyntheticLambda18, fIAuthTabCallback, setbyteorder4, graphicDeviceInfo4, getsupportedhighspeedresolutionsfor, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    int i44 = onWarmupCompleted + 27;
                                    onExtraCallback = i44 % 128;
                                    if (i44 % 2 != 0) {
                                        return unitOnNavigationEvent;
                                    }
                                    Object obj4 = null;
                                    obj4.hashCode();
                                    throw null;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResult2, 54);
                            if (!z) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2140256383);
                                setVerticalGravity.IAuthTabCallback(lowLightBoostControlExternalSyntheticLambda0, IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor3), (QuirksExternalSyntheticBackport0) null, onWarmupCompleted, (SearchView) null, (String) null, ForwardingCameraControl.onExtraCallback(1942455890, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda27
                                    private static int IAuthTabCallback = 1;
                                    private static int onExtraCallback;

                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        Unit unit3;
                                        int i41 = 2 % 2;
                                        int i42 = IAuthTabCallback + 31;
                                        onExtraCallback = i42 % 128;
                                        if (i42 % 2 != 0) {
                                            Object[] objArr = {encoderProfilesProxyVideoProfileProxyOnExtraCallback, (setHorizontalGravity) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
                                            unit3 = (Unit) addInfoPartTwo.onExtraCallback(627039616, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -627039603, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
                                            int i43 = 72 / 0;
                                        } else {
                                            Object[] objArr2 = {encoderProfilesProxyVideoProfileProxyOnExtraCallback, (setHorizontalGravity) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
                                            unit3 = (Unit) addInfoPartTwo.onExtraCallback(627039616, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -627039603, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr2, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
                                        }
                                        int i44 = onExtraCallback + 39;
                                        IAuthTabCallback = i44 % 128;
                                        int i45 = i44 % 2;
                                        return unit3;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 1575942, 26);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            } else if (IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor3)) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2140018613);
                                encoderProfilesProxyVideoProfileProxyOnExtraCallback.invoke(cameraCaptureResultEmptyCameraCaptureResult2, num2);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2139970563);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        } else {
                            changeType7 = changeType8;
                            Integer num3 = num2;
                            int i41 = i14;
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1632053718);
                            final CreditHomeLargeBannerResponse.ChangeType changeType11 = changeType6;
                            final boolean z13 = z8;
                            final VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda19 = virtualCameraControlExternalSyntheticLambda16;
                            final VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda110 = virtualCameraControlExternalSyntheticLambda14;
                            final setByteOrder setbyteorder5 = setbyteorder3;
                            final GraphicDeviceInfo graphicDeviceInfo5 = graphicDeviceInfo3;
                            final EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(-1767049718, true, new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda28
                                private static int onExtraCallbackWithResult = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj2, Object obj3) {
                                    int i42 = 2 % 2;
                                    int i43 = onExtraCallbackWithResult + 27;
                                    onWarmupCompleted = i43 % 128;
                                    int i44 = i43 % 2;
                                    Unit unitOnNavigationEvent = addInfoPartTwo.onNavigationEvent(quirksExternalSyntheticBackport0, str, str2, str3, changeType7, changeType11, z13, fIAuthTabCallback, virtualCameraControlExternalSyntheticLambda19, virtualCameraControlExternalSyntheticLambda110, function02, setbyteorder5, graphicDeviceInfo5, getsupportedhighspeedresolutionsfor, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    int i45 = onWarmupCompleted + 17;
                                    onExtraCallbackWithResult = i45 % 128;
                                    int i46 = i45 % 2;
                                    return unitOnNavigationEvent;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResult2, 54);
                            if (z7) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1632880395);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = measureChildConstrained.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, function02, 15, (Object) null);
                                component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallback2);
                                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                                if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                                    int i42 = IAuthTabCallbackDefault + 33;
                                    onTransact = i42 % 128;
                                    if (i42 % 2 != 0) {
                                        getAwbState.onExtraCallback();
                                        throw th;
                                    }
                                    getAwbState.onExtraCallback();
                                }
                                cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                                if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback2);
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                                }
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                                onNavigationEvent(onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2), str4, fIAuthTabCallback, virtualCameraControlExternalSyntheticLambda16, virtualCameraControlExternalSyntheticLambda14, z8, cameraCaptureResultEmptyCameraCaptureResult2, ((i15 >> 9) & 112) | (i41 & 7168) | (57344 & i41) | ((i41 << 15) & 458752));
                                setVerticalGravity.IAuthTabCallback(lowLightBoostControlExternalSyntheticLambda02, IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor3), (QuirksExternalSyntheticBackport0) null, onWarmupCompleted, (SearchView) null, (String) null, ForwardingCameraControl.onExtraCallback(1658203881, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda29
                                    private static int onExtraCallback = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        int i43 = 2 % 2;
                                        int i44 = onExtraCallback + 117;
                                        onNavigationEvent = i44 % 128;
                                        if (i44 % 2 == 0) {
                                            return (Unit) addInfoPartTwo.onExtraCallback(-1385644922, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1385644927, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{encoderProfilesProxyVideoProfileProxyOnExtraCallback2, (setHorizontalGravity) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
                                        }
                                        Object obj5 = null;
                                        obj5.hashCode();
                                        throw null;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 1575942, 26);
                                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1633534433);
                                encoderProfilesProxyVideoProfileProxyOnExtraCallback2.invoke(cameraCaptureResultEmptyCameraCaptureResult2, num3);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        z4 = z8;
                        setbyteorder2 = setbyteorder3;
                        changeType3 = changeType7;
                        graphicDeviceInfo2 = graphicDeviceInfo3;
                        virtualCameraControlExternalSyntheticLambda15 = virtualCameraControlExternalSyntheticLambda16;
                        changeType4 = changeType6;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        final VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda111 = virtualCameraControlExternalSyntheticLambda14;
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda30
                            private static int onExtraCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i43 = 2 % 2;
                                int i44 = onNavigationEvent + 121;
                                onExtraCallback = i44 % 128;
                                int i45 = i44 % 2;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                String str5 = str;
                                String str6 = str2;
                                String str7 = str3;
                                String str8 = str4;
                                CreditHomeLargeBannerResponse.ChangeType changeType12 = changeType3;
                                CreditHomeLargeBannerResponse.ChangeType changeType13 = changeType4;
                                boolean z14 = z;
                                Function0 function03 = function0;
                                Function0 function04 = function02;
                                boolean z15 = z4;
                                setByteOrder setbyteorder6 = setbyteorder2;
                                GraphicDeviceInfo graphicDeviceInfo6 = graphicDeviceInfo2;
                                VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda112 = virtualCameraControlExternalSyntheticLambda15;
                                VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda113 = virtualCameraControlExternalSyntheticLambda111;
                                int i46 = i;
                                int i47 = i2;
                                int i48 = i3;
                                int iIntValue = ((Integer) obj3).intValue();
                                Object[] objArr = {quirksExternalSyntheticBackport02, str5, str6, str7, str8, changeType12, changeType13, Boolean.valueOf(z14), function03, function04, Boolean.valueOf(z15), setbyteorder6, graphicDeviceInfo6, virtualCameraControlExternalSyntheticLambda112, virtualCameraControlExternalSyntheticLambda113, Integer.valueOf(i46), Integer.valueOf(i47), Integer.valueOf(i48), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                                Unit unit3 = (Unit) addInfoPartTwo.onExtraCallback(-1297090295, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1297090299, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
                                int i49 = onNavigationEvent + 81;
                                onExtraCallback = i49 % 128;
                                int i50 = i49 % 2;
                                return unit3;
                            }
                        });
                        return;
                    }
                    return;
                }
                i29 |= 24576;
                virtualCameraControlExternalSyntheticLambda13 = virtualCameraControlExternalSyntheticLambda12;
                if ((i6 & 306783379) == 306783378) {
                    z3 = true;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i6 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i11 = i3 & 8192;
            if (i11 != 0) {
            }
            i12 = i3 & 16384;
            if (i12 == 0) {
            }
            virtualCameraControlExternalSyntheticLambda13 = virtualCameraControlExternalSyntheticLambda12;
            if ((i6 & 306783379) == 306783378) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i6 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        num = 6;
        if ((12582912 & i) == 0) {
        }
        if ((100663296 & i) == 0) {
        }
        if ((805306368 & i) == 0) {
        }
        i6 = i4;
        i7 = i3 & 1024;
        if (i7 == 0) {
        }
        i9 = i3 & 2048;
        if (i9 == 0) {
        }
        int i292 = i8;
        i10 = i3 & 4096;
        if (i10 == 0) {
        }
        i11 = i3 & 8192;
        if (i11 != 0) {
        }
        i12 = i3 & 16384;
        if (i12 == 0) {
        }
        virtualCameraControlExternalSyntheticLambda13 = virtualCameraControlExternalSyntheticLambda12;
        if ((i6 & 306783379) == 306783378) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i6 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12, float f, String str, boolean z, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        float fIAuthTabCallback;
        float fIAuthTabCallback2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1157778673, i, -1, "im.toss.feature.credit.ui.main.home.component.RollingMessageRow.<anonymous> (CreditHomeLoanNeedsRow.kt:251)");
        }
        if (virtualCameraControlExternalSyntheticLambda1 != null) {
            int i3 = onTransact + 61;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                fIAuthTabCallback = virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
                int i4 = 90 / 0;
            } else {
                fIAuthTabCallback = virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
            }
        } else {
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f);
        }
        if (virtualCameraControlExternalSyntheticLambda12 != null) {
            fIAuthTabCallback2 = virtualCameraControlExternalSyntheticLambda12.IAuthTabCallback();
            int i5 = onTransact + 59;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        } else {
            fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f);
        }
        onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, (String) null, str, (String) null, (String) null, (CreditHomeLargeBannerResponse.ChangeType) null, (CreditHomeLargeBannerResponse.ChangeType) null, false, z, false, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(f, fIAuthTabCallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), fIAuthTabCallback2), (getViewTypeCount.IAuthTabCallback) null, (Function0<Unit>) null, (setByteOrder) null, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 31483);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onTransact + 43;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(final boolean z, final String str, final float f, final VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, final VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12, final boolean z2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-593052617);
        if ((i & 6) == 0) {
            int i8 = onTransact + 1;
            IAuthTabCallbackDefault = i8 % 128;
            if (i8 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                i6 = 4;
            } else {
                int i9 = IAuthTabCallbackDefault + 51;
                onTransact = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 3 % 5;
                }
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i11 = IAuthTabCallbackDefault + 5;
            onTransact = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 31 / 0;
                i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
            } else if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str))) {
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                int i13 = onTransact + 91;
                IAuthTabCallbackDefault = i13 % 128;
                int i14 = i13 % 2;
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            int i15 = onTransact + 85;
            IAuthTabCallbackDefault = i15 % 128;
            int i16 = i15 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(virtualCameraControlExternalSyntheticLambda1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(virtualCameraControlExternalSyntheticLambda12) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                int i17 = onTransact + 97;
                IAuthTabCallbackDefault = i17 % 128;
                int i18 = i17 % 2;
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        int i19 = i2;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i19) != 74898, i19 & 1)) {
            int i20 = onTransact + 17;
            IAuthTabCallbackDefault = i20 % 128;
            if (i20 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-593052617, i19, -1, "im.toss.feature.credit.ui.main.home.component.RollingMessageRow (CreditHomeLoanNeedsRow.kt:245)");
            }
            setVerticalGravity.onWarmupCompleted(z, (QuirksExternalSyntheticBackport0) null, onWarmupCompleted, IAuthTabCallback, (String) null, ForwardingCameraControl.onExtraCallback(-1157778673, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda31
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit unit;
                    int i21 = 2 % 2;
                    int i22 = onExtraCallback + 81;
                    onWarmupCompleted = i22 % 128;
                    if (i22 % 2 == 0) {
                        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda13 = virtualCameraControlExternalSyntheticLambda1;
                        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda14 = virtualCameraControlExternalSyntheticLambda12;
                        float f2 = f;
                        String str2 = str;
                        boolean z3 = z2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Object[] objArr = {virtualCameraControlExternalSyntheticLambda13, virtualCameraControlExternalSyntheticLambda14, Float.valueOf(f2), str2, Boolean.valueOf(z3), (setHorizontalGravity) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                        unit = (Unit) addInfoPartTwo.onExtraCallback(1980231241, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1980231241, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
                        int i23 = 6 / 0;
                    } else {
                        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda15 = virtualCameraControlExternalSyntheticLambda1;
                        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda16 = virtualCameraControlExternalSyntheticLambda12;
                        float f3 = f;
                        String str3 = str;
                        boolean z4 = z2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        Object[] objArr2 = {virtualCameraControlExternalSyntheticLambda15, virtualCameraControlExternalSyntheticLambda16, Float.valueOf(f3), str3, Boolean.valueOf(z4), (setHorizontalGravity) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue2)};
                        unit = (Unit) addInfoPartTwo.onExtraCallback(1980231241, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1980231241, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr2, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
                    }
                    int i24 = onExtraCallback + 67;
                    onWarmupCompleted = i24 % 128;
                    int i25 = i24 % 2;
                    return unit;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i19 & 14) | 200064, 18);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda32
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj, Object obj2) {
                    int i21 = 2 % 2;
                    int i22 = onExtraCallback + 119;
                    IAuthTabCallback = i22 % 128;
                    int i23 = i22 % 2;
                    boolean z3 = z;
                    String str2 = str;
                    float f2 = f;
                    VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda13 = virtualCameraControlExternalSyntheticLambda1;
                    VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda14 = virtualCameraControlExternalSyntheticLambda12;
                    boolean z4 = z2;
                    int i24 = i;
                    int iIntValue = ((Integer) obj2).intValue();
                    Object[] objArr = {Boolean.valueOf(z3), str2, Float.valueOf(f2), virtualCameraControlExternalSyntheticLambda13, virtualCameraControlExternalSyntheticLambda14, Boolean.valueOf(z4), Integer.valueOf(i24), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                    Unit unit = (Unit) addInfoPartTwo.onExtraCallback(623366565, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -623366553, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
                    int i25 = onExtraCallback + 41;
                    IAuthTabCallback = i25 % 128;
                    if (i25 % 2 == 0) {
                        int i26 = 48 / 0;
                    }
                    return unit;
                }
            });
        }
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallback;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 26 - (ViewConfiguration.getLongPressTimeout() >> 16), 23138 - TextUtils.indexOf((CharSequence) "", '0', 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 26 - View.resolveSizeAndState(0, 0, 0), 23139 - (ViewConfiguration.getJumpTapTimeout() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i5 = $10 + 5;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            int i6 = $11 + 13;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16802040), (-16777142) - Color.rgb(0, 0, 0), 8089 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 31 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 19488, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i8 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i8];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i9 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i9];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                        } else {
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i13 = 0; i13 < i; i13++) {
            int i14 = $10 + 39;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr4[i13] = (char) (cArr4[i13] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private static final Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        return unit;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ boolean $isAnimatedExpandCard;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $showIcons$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(boolean z, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$isAnimatedExpandCard = z;
            this.$showIcons$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$isAnimatedExpandCard, this.$showIcons$delegate, access13800Var);
            int i2 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[PHI: r1
          0x003f: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r4
          0x0025: PHI (r4v1 int) = (r4v0 int), (r4v7 int) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            long j;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 59 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    if (this.$isAnimatedExpandCard) {
                        int i5 = onWarmupCompleted + 107;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 == 0) {
                            obj2.hashCode();
                            throw null;
                        }
                        j = 1000;
                    } else {
                        j = 1700;
                    }
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(j, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = onExtraCallbackWithResult + 15;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    ResultKt.onNavigationEvent(obj);
                    if (i7 != 0) {
                        throw null;
                    }
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            addInfoPartTwo.IAuthTabCallback((getSupportedHighSpeedResolutionsFor) this.$showIcons$delegate, true);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final String str, @Nullable final String str2, @Nullable final String str3, @Nullable CreditHomeLargeBannerResponse.ChangeType changeType, @Nullable CreditHomeLargeBannerResponse.ChangeType changeType2, @NotNull final String str4, @NotNull final Function0<Unit> function0, boolean z, @Nullable String str5, boolean z2, @Nullable Function0<Unit> function02, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) throws Throwable {
        int i4;
        int iOrdinal;
        int iOrdinal2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final CreditHomeLargeBannerResponse.ChangeType changeType3;
        final CreditHomeLargeBannerResponse.ChangeType changeType4;
        final boolean z3;
        final String str6;
        final boolean z4;
        final Function0<Unit> function03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        String str7;
        Function0<Unit> function04;
        boolean z5;
        Object objOnMinimized;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        boolean zOnExtraCallback;
        Object objOnMinimized2;
        long jIsEngagementSignalsApiAvailable;
        int i10;
        long jOnExtraCallback;
        long jOnNavigationEvent;
        int i11;
        int i12 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1910140231);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i13 = IAuthTabCallbackDefault + 71;
                onTransact = i13 % 128;
                i11 = i13 % 2 != 0 ? 3 : 4;
            } else {
                i11 = 2;
            }
            i4 = i11 | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i14 = onTransact + 13;
            IAuthTabCallbackDefault = i14 % 128;
            int i15 = i14 % 2;
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 2048 : 1024;
        }
        int i16 = i3 & 16;
        if (i16 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            if (changeType == null) {
                int i17 = onTransact + 81;
                IAuthTabCallbackDefault = i17 % 128;
                int i18 = i17 % 2;
                iOrdinal = -1;
            } else {
                iOrdinal = changeType.ordinal();
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal) ? 16384 : 8192;
        }
        int i19 = i3 & 32;
        if (i19 != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            if (changeType2 == null) {
                int i20 = onTransact + 95;
                IAuthTabCallbackDefault = i20 % 128;
                int i21 = i20 % 2;
                iOrdinal2 = -1;
            } else {
                iOrdinal2 = changeType2.ordinal();
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 8388608 : 4194304;
        }
        int i22 = i3 & 256;
        if (i22 == 0) {
            if ((100663296 & i) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 67108864 : 33554432;
            }
            i5 = i3 & 512;
            if (i5 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str5) ? 536870912 : 268435456;
            }
            i6 = i3 & 1024;
            if (i6 == 0) {
                i7 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i7 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 4 : 2);
            } else {
                int i23 = onTransact + 105;
                IAuthTabCallbackDefault = i23 % 128;
                int i24 = i23 % 2;
                i7 = i2;
            }
            i8 = i3 & 2048;
            if (i8 == 0) {
                i7 |= 48;
            } else if ((i2 & 48) == 0) {
                i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 32 : 16;
            }
            i9 = i7;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) == 306783378 || (i9 & 19) != 18, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                changeType3 = changeType;
                changeType4 = changeType2;
                z3 = z;
                str6 = str5;
                z4 = z2;
                function03 = function02;
            } else {
                int i25 = onTransact;
                int i26 = i25 + 43;
                IAuthTabCallbackDefault = i26 % 128;
                int i27 = i26 % 2;
                CreditHomeLargeBannerResponse.ChangeType changeType5 = i16 != 0 ? null : changeType;
                CreditHomeLargeBannerResponse.ChangeType changeType6 = i19 != 0 ? null : changeType2;
                boolean z6 = i22 != 0 ? false : z;
                if (i5 != 0) {
                    int i28 = i25 + 27;
                    IAuthTabCallbackDefault = i28 % 128;
                    int i29 = i28 % 2;
                    str7 = null;
                } else {
                    str7 = str5;
                }
                boolean z7 = i6 != 0 ? true : z2;
                if (i8 != 0) {
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized3 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda3
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            public final Object invoke() {
                                int i30 = 2 % 2;
                                int i31 = IAuthTabCallback + 105;
                                onExtraCallbackWithResult = i31 % 128;
                                if (i31 % 2 != 0) {
                                    return addInfoPartTwo.IAuthTabCallback();
                                }
                                addInfoPartTwo.IAuthTabCallback();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                    }
                    function04 = (Function0) objOnMinimized3;
                } else {
                    function04 = function02;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1910140231, i4, i9, "im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsCardV2 (CreditHomeLoanNeedsRow.kt:278)");
                }
                if (!z6 || str7 == null || StringsKt.isBlank(str7)) {
                    z5 = false;
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                    Unit unit = Unit.INSTANCE;
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z5);
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnExtraCallback || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized2 = new onExtraCallback(z5, getsupportedhighspeedresolutionsfor, null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    if (!z5) {
                        int i30 = onTransact + 85;
                        IAuthTabCallbackDefault = i30 % 128;
                        int i31 = i30 % 2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(966712045);
                        int i32 = i4 << 3;
                        onExtraCallback(quirksExternalSyntheticBackport0, str7, str, str2, str3, changeType5, changeType6, str4, onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor), function0, function04, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i32 & 29360128) | (i4 & 14) | ((i4 >> 24) & 112) | (i32 & 896) | (i32 & 7168) | (57344 & i32) | (i32 & 458752) | (i32 & 3670016) | ((i4 << 6) & 1879048192), (i9 >> 3) & 14);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    } else if (!(!z6)) {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(967216229);
                        RoundedCornerShape roundedCornerShapeOnNavigationEvent = RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f));
                        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                        boolean zBooleanValue = ((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue();
                        int i33 = i4;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = measureChildConstrained.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, function0, 15, (Object) null);
                        FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub();
                        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                        component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallback);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                        LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setExtensionStrength.onExtraCallbackWithResult(StreamSpec.onExtraCallbackWithResult(StreamSpec.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), roundedCornerShapeOnNavigationEvent, new MappingRedirectableLiveDataExternalSyntheticLambda1(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), ByteOrderedDataOutputStream.onExtraCallback(117440512), 0.0f, r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)) << 32) | (Float.floatToRawIntBits(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)) & 4294967295L)), 0.0f, 0, 52, (DefaultConstructorMarker) null)), roundedCornerShapeOnNavigationEvent, new MappingRedirectableLiveDataExternalSyntheticLambda1(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f), ByteOrderedDataOutputStream.onExtraCallback(117440512), 0.0f, 0L, 0.0f, 0, 60, (DefaultConstructorMarker) null)), roundedCornerShapeOnNavigationEvent);
                        if (zBooleanValue) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-232878894);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            jOnExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(131257084);
                            i10 = 6;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-232877486);
                            i10 = 6;
                            long jOnNavigationEvent2 = y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult2, 6).onNavigationEvent();
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            jOnExtraCallback = jOnNavigationEvent2;
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, jOnExtraCallback, (toMetersPerSecond) null, 2, (Object) null);
                        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f);
                        if (!(!zBooleanValue)) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-232875406);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            jOnNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(83892019);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-232873998);
                            jOnNavigationEvent = y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult2, i10).onNavigationEvent();
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(ensureNavButtonView.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback2, fIAuthTabCallback, jOnNavigationEvent, roundedCornerShapeOnNavigationEvent), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(19.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(19.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f));
                        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                        int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2);
                        Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback2);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                        int i34 = i33 >> 3;
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, i10)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(i34 & 14), 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                        onPageLoadError.IAuthTabCallbackStub(9, cameraCaptureResultEmptyCameraCaptureResult2, i10);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f), 0.0f, 10, (Object) null);
                        int i35 = i33 >> 6;
                        onExtraCallback(str2, str3, changeType5, changeType6, onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor), str4, function0, quirksExternalSyntheticBackport0OnExtraCallback3, null, cameraCaptureResultEmptyCameraCaptureResult2, (i35 & 896) | (i35 & 14) | 12582912 | (i35 & 112) | (i35 & 7168) | (i34 & 458752) | (i34 & 3670016), 256);
                        onPageLoadError.IAuthTabCallbackStub(9, cameraCaptureResultEmptyCameraCaptureResult2, i10);
                        cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        int i36 = i4;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(969114979);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(measureChildConstrained.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, function0, 15, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f));
                        component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f)), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult2, 6);
                        int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnNavigationEvent);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback3 = onextracallbackwithresult3.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback3);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnNavigationEvent2, onextracallbackwithresult3.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult3.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult3.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult3.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult3.onTransact());
                        LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                        getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                        y3ExternalSyntheticLambda0 y3externalsyntheticlambda02 = y3ExternalSyntheticLambda0.onExtraCallback;
                        if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda02, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1289497624);
                            jIsEngagementSignalsApiAvailable = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).ICustomTabsService();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1289496664);
                            jIsEngagementSignalsApiAvailable = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).isEngagementSignalsApiAvailable();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        int i37 = i36 >> 3;
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, gethumanreadablename, Long.valueOf(jIsEngagementSignalsApiAvailable), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(i37 & 14), 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        onExtraCallback(str2, str3, changeType5, changeType6, onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor), str4, function0, null, null, cameraCaptureResultEmptyCameraCaptureResult2, ((i36 >> 6) & 8190) | (i37 & 458752) | (i37 & 3670016), 384);
                        cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    changeType3 = changeType5;
                    changeType4 = changeType6;
                    z3 = z6;
                    str6 = str7;
                    z4 = z7;
                    function03 = function04;
                } else {
                    int i38 = IAuthTabCallbackDefault + 105;
                    onTransact = i38 % 128;
                    int i39 = i38 % 2;
                    if (z7) {
                        z5 = true;
                    }
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    }
                    getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                    Unit unit2 = Unit.INSTANCE;
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z5);
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnExtraCallback) {
                        objOnMinimized2 = new onExtraCallback(z5, getsupportedhighspeedresolutionsfor, null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(unit2, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        if (!z5) {
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        changeType3 = changeType5;
                        changeType4 = changeType6;
                        z3 = z6;
                        str6 = str7;
                        z4 = z7;
                        function03 = function04;
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        int i40 = 2 % 2;
                        int i41 = IAuthTabCallback + 53;
                        onNavigationEvent = i41 % 128;
                        int i42 = i41 % 2;
                        Unit unitOnWarmupCompleted = addInfoPartTwo.onWarmupCompleted(quirksExternalSyntheticBackport0, str, str2, str3, changeType3, changeType4, str4, function0, z3, str6, z4, function03, i, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i43 = IAuthTabCallback + 77;
                        onNavigationEvent = i43 % 128;
                        int i44 = i43 % 2;
                        return unitOnWarmupCompleted;
                    }
                });
                return;
            }
            return;
        }
        int i40 = onTransact + 99;
        IAuthTabCallbackDefault = i40 % 128;
        int i41 = i40 % 2;
        i4 |= 100663296;
        i5 = i3 & 512;
        if (i5 == 0) {
        }
        i6 = i3 & 1024;
        if (i6 == 0) {
        }
        i8 = i3 & 2048;
        if (i8 == 0) {
        }
        i9 = i7;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) == 306783378 || (i9 & 19) != 18, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $contentAlpha;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $expandProgress;
        final /* synthetic */ Function0<Unit> $onAnimationStart;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $startRolling$delegate;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $titleProgress;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(Function0<Unit> function0, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled3, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$onAnimationStart = function0;
            this.$titleProgress = isqueryrefinementenabled;
            this.$expandProgress = isqueryrefinementenabled2;
            this.$startRolling$delegate = getsupportedhighspeedresolutionsfor;
            this.$contentAlpha = isqueryrefinementenabled3;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$onAnimationStart, this.$titleProgress, this.$expandProgress, this.$startRolling$delegate, this.$contentAlpha, access13800Var);
            iAuthTabCallback.L$0 = obj;
            int i2 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 45;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* renamed from: o.addInfoPartTwo$IAuthTabCallback$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $contentAlpha;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.$contentAlpha = isqueryrefinementenabled;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$contentAlpha, access13800Var);
                int i2 = onExtraCallbackWithResult + 73;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 97;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallbackWithResult + 121;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 69;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallback + 43;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 85;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$contentAlpha;
                    Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(1.0f);
                    getThumbPosition getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(560, 0, setSubmitButtonEnabled.onExtraCallback(), 2, (Object) null);
                    this.label = 1;
                    if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbpositionOnExtraCallbackWithResult, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                        int i5 = onExtraCallback + 67;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = onExtraCallback + 9;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        ResultKt.onNavigationEvent(obj);
                        int i8 = 54 / 0;
                    } else {
                        ResultKt.onNavigationEvent(obj);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00ca, code lost:
        
            if (o.isQueryRefinementEnabled.onWarmupCompleted(r0, r1, r2, (java.lang.Object) null, (kotlin.jvm.functions.Function1) null, r17, 12, (java.lang.Object) null) != r11) goto L24;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.$onAnimationStart.invoke();
                this.L$0 = findresandmsg;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(490L, this) != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            int i5 = onWarmupCompleted;
            int i6 = i5 + 61;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0 ? i4 == 1 : i4 == 1) {
                ResultKt.onNavigationEvent(obj);
            } else {
                if (i4 != 2) {
                    int i7 = i5 + 85;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i9 = i5 + 43;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                z = true;
                addInfoPartTwo.onExtraCallbackWithResult(this.$startRolling$delegate, z);
                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass5(this.$contentAlpha, null), 3, (Object) null);
                isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$expandProgress;
                Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(1.0f);
                getThumbPosition getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(560, 0, addInfoPartTwo.onWarmupCompleted(), 2, (Object) null);
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.label = 3;
            }
            isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2 = this.$titleProgress;
            Float fOnExtraCallbackWithResult2 = access14000.onExtraCallbackWithResult(1.0f);
            getThumbPosition getthumbpositionOnExtraCallbackWithResult2 = onQueryRefine.onExtraCallbackWithResult(420, 0, setSubmitButtonEnabled.onWarmupCompleted(), 2, (Object) null);
            this.L$0 = findresandmsg;
            this.label = 2;
            z = true;
            if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled2, fOnExtraCallbackWithResult2, getthumbpositionOnExtraCallbackWithResult2, (Object) null, (Function1) null, this, 12, (Object) null) != objOnWarmupCompleted) {
                addInfoPartTwo.onExtraCallbackWithResult(this.$startRolling$delegate, z);
                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass5(this.$contentAlpha, null), 3, (Object) null);
                isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled3 = this.$expandProgress;
                Float fOnExtraCallbackWithResult3 = access14000.onExtraCallbackWithResult(1.0f);
                getThumbPosition getthumbpositionOnExtraCallbackWithResult3 = onQueryRefine.onExtraCallbackWithResult(560, 0, addInfoPartTwo.onWarmupCompleted(), 2, (Object) null);
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.label = 3;
            }
            return objOnWarmupCompleted;
        }
    }

    private static final Unit IAuthTabCallback(isQueryRefinementEnabled isqueryrefinementenabled, float f, flipHorizontally fliphorizontally) {
        float f2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            float fFloatValue = ((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue() + 1.0f;
            fliphorizontally.IAuthTabCallbackStub(fFloatValue);
            f2 = (-f) % (2.0f - fFloatValue);
        } else {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            float fFloatValue2 = 1.0f - ((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue();
            fliphorizontally.IAuthTabCallbackStub(fFloatValue2);
            f2 = (-f) * (1.0f - fFloatValue2);
        }
        fliphorizontally.access000(f2);
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(isQueryRefinementEnabled isqueryrefinementenabled, float f, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        float fFloatValue = ((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue();
        fliphorizontally.IAuthTabCallbackStub(fFloatValue);
        fliphorizontally.access000(f * (1.0f - fFloatValue));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 57;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue();
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return Float.valueOf(fFloatValue);
    }

    private static final float onExtraCallbackWithResult(isQueryRefinementEnabled isqueryrefinementenabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) isqueryrefinementenabled.IAuthTabCallback();
        float fFloatValue = i3 != 0 ? number.floatValue() % 1.0f : number.floatValue() - 1.0f;
        int i4 = onTransact + 61;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return fFloatValue;
    }

    private static final float asInterface(isQueryRefinementEnabled isqueryrefinementenabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Number number = (Number) isqueryrefinementenabled.IAuthTabCallback();
        if (i3 != 0) {
            number.floatValue();
            obj.hashCode();
            throw null;
        }
        float fFloatValue = number.floatValue();
        int i4 = IAuthTabCallbackDefault + 47;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return fFloatValue;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(String str, String str2, CreditHomeLargeBannerResponse.ChangeType changeType, CreditHomeLargeBannerResponse.ChangeType changeType2, boolean z, String str3, Function0 function0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 81;
        onTransact = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 4) != 4, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-573423886, i, -1, "im.toss.feature.credit.ui.main.home.component.AnimatedFloatingLoanCard.<anonymous>.<anonymous> (CreditHomeLoanNeedsRow.kt:472)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i4 = IAuthTabCallbackDefault + 7;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            onPageLoadError.IAuthTabCallbackStub(10, cameraCaptureResultEmptyCameraCaptureResult, 6);
            onExtraCallback(str, str2, changeType, changeType2, z, str3, function0, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f), 0.0f, 10, (Object) null), Boolean.valueOf(onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)), cameraCaptureResultEmptyCameraCaptureResult, 12582912, 0);
            onPageLoadError.IAuthTabCallbackStub(10, cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010a  */
    /* JADX WARN: Type inference failed for: r11v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final String str, final String str2, final String str3, final String str4, final CreditHomeLargeBannerResponse.ChangeType changeType, final CreditHomeLargeBannerResponse.ChangeType changeType2, final String str5, final boolean z, final Function0<Unit> function0, final Function0<Unit> function02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i5;
        CameraPresenceProviderExternalSyntheticLambda0 cameraPresenceProviderExternalSyntheticLambda0;
        long jOnExtraCallback;
        long jOnExtraCallback2;
        boolean z2;
        ?? r11;
        boolean zOnExtraCallback;
        boolean zIAuthTabCallback;
        Object objOnMinimized;
        boolean zOnExtraCallback2;
        int i6;
        int iOrdinal;
        int iOrdinal2;
        int i7;
        int i8 = 2 % 2;
        int i9 = onTransact + 91;
        IAuthTabCallbackDefault = i9 % 128;
        int i10 = i9 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(382308447);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i11 = onTransact + 61;
                IAuthTabCallbackDefault = i11 % 128;
                int i12 = i11 % 2;
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            if (changeType == null) {
                int i13 = IAuthTabCallbackDefault + 41;
                onTransact = i13 % 128;
                int i14 = i13 % 2;
                iOrdinal2 = -1;
            } else {
                iOrdinal2 = changeType.ordinal();
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            int i15 = IAuthTabCallbackDefault;
            int i16 = i15 + 115;
            onTransact = i16 % 128;
            int i17 = i16 % 2;
            if (changeType2 == null) {
                int i18 = i15 + 35;
                onTransact = i18 % 128;
                if (i18 % 2 != 0) {
                    int i19 = 83 / 0;
                }
                iOrdinal = -1;
            } else {
                iOrdinal = changeType2.ordinal();
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str5) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            int i20 = onTransact + 117;
            IAuthTabCallbackDefault = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 8 / 0;
                i6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 67108864 : 33554432;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
            }
            i3 |= i6;
        }
        if ((805306368 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            int i22 = onTransact + 57;
            IAuthTabCallbackDefault = i22 % 128;
            int i23 = i22 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i24 = IAuthTabCallbackDefault + 83;
                onTransact = i24 % 128;
                int i25 = i24 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(382308447, i3, i4, "im.toss.feature.credit.ui.main.home.component.AnimatedFloatingLoanCard (CreditHomeLoanNeedsRow.kt:392)");
            }
            RoundedCornerShape roundedCornerShapeOnNavigationEvent = RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f));
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            boolean zBooleanValue = ((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue();
            final float fOnExtraCallback = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f));
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = isIconified.onWarmupCompleted(0.0f, 0.0f, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            final isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objOnMinimized2;
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                i5 = 2;
                objOnMinimized3 = isIconified.onWarmupCompleted(0.0f, 0.0f, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            } else {
                i5 = 2;
            }
            final isQueryRefinementEnabled isqueryrefinementenabled2 = (isQueryRefinementEnabled) objOnMinimized3;
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                cameraPresenceProviderExternalSyntheticLambda0 = null;
                objOnMinimized4 = isIconified.onWarmupCompleted(0.0f, 0.0f, i5, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
            } else {
                cameraPresenceProviderExternalSyntheticLambda0 = null;
            }
            final isQueryRefinementEnabled isqueryrefinementenabled3 = (isQueryRefinementEnabled) objOnMinimized4;
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized5 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, cameraPresenceProviderExternalSyntheticLambda0, 2, cameraPresenceProviderExternalSyntheticLambda0);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
            }
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized5;
            Unit unit = Unit.INSTANCE;
            boolean z3 = (i4 & 14) == 4;
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled3);
            boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled2);
            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((z3 | zOnExtraCallback3 | zOnExtraCallback4 | zOnExtraCallback5) || objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized6 = new IAuthTabCallback(function02, isqueryrefinementenabled, isqueryrefinementenabled2, getsupportedhighspeedresolutionsfor, isqueryrefinementenabled3, null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized6, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = measureChildConstrained.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, function0, 15, (Object) null);
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
            long jOnExtraCallback3 = ByteOrderedDataOutputStream.onExtraCallback(117440512);
            float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setExtensionStrength.onExtraCallbackWithResult(StreamSpec.onExtraCallbackWithResult(StreamSpec.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback2, roundedCornerShapeOnNavigationEvent, new MappingRedirectableLiveDataExternalSyntheticLambda1(fIAuthTabCallback, jOnExtraCallback3, 0.0f, r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallback2) << 32)), 0.0f, 0, 52, (DefaultConstructorMarker) null)), roundedCornerShapeOnNavigationEvent, new MappingRedirectableLiveDataExternalSyntheticLambda1(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f), ByteOrderedDataOutputStream.onExtraCallback(117440512), 0.0f, 0L, 0.0f, 0, 60, (DefaultConstructorMarker) null)), roundedCornerShapeOnNavigationEvent);
            if (!zBooleanValue) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2099037382);
                jOnExtraCallback = y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2099038790);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                jOnExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(131257084);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, jOnExtraCallback, (toMetersPerSecond) null, 2, (Object) null);
            float fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f);
            if (!zBooleanValue) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2099034022);
                jOnExtraCallback2 = y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2099035430);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                jOnExtraCallback2 = ByteOrderedDataOutputStream.onExtraCallback(83892019);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(ensureNavButtonView.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback3, fIAuthTabCallback3, jOnExtraCallback2, roundedCornerShapeOnNavigationEvent), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(19.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(17.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(19.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(17.0f));
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted2);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
            boolean zIAuthTabCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fOnExtraCallback);
            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!zOnExtraCallback6 && !zIAuthTabCallback2) {
                int i26 = onTransact + 119;
                IAuthTabCallbackDefault = i26 % 128;
                if (i26 % 2 == 0) {
                    r11 = 0;
                    z2 = false;
                    int i27 = 76 / 0;
                    if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(onextracallback, (Function1) objOnMinimized7);
                    AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
                    getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                    long jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
                    isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, quirksExternalSyntheticBackport0IAuthTabCallback, gethumanreadablename, Long.valueOf(jLongValue), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf((int) r11), Boolean.valueOf((boolean) r11), isrepeatingenabled.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i3 >> 3) & 14), 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
                    zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fOnExtraCallback);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((zOnExtraCallback | zIAuthTabCallback) || objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda8
                            private static int onNavigationEvent = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj) {
                                int i28 = 2 % 2;
                                int i29 = onNavigationEvent + 91;
                                onWarmupCompleted = i29 % 128;
                                if (i29 % 2 == 0) {
                                    addInfoPartTwo.onExtraCallbackWithResult(isqueryrefinementenabled, fOnExtraCallback, (flipHorizontally) obj);
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                Unit unitOnExtraCallbackWithResult = addInfoPartTwo.onExtraCallbackWithResult(isqueryrefinementenabled, fOnExtraCallback, (flipHorizontally) obj);
                                int i30 = onWarmupCompleted + 111;
                                onNavigationEvent = i30 % 128;
                                int i31 = i30 % 2;
                                return unitOnExtraCallbackWithResult;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, attachTimestamp.IAuthTabCallback(onextracallback, (Function1) objOnMinimized), (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf((int) r11), Boolean.valueOf((boolean) r11), isrepeatingenabled.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i3 >> 6) & 14), 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled2);
                    Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback2) {
                        Object obj = objOnMinimized8;
                        if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                            Function0 function03 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda9
                                private static int IAuthTabCallback = 1;
                                private static int onNavigationEvent;

                                public final Object invoke() {
                                    int i28 = 2 % 2;
                                    int i29 = onNavigationEvent + 33;
                                    IAuthTabCallback = i29 % 128;
                                    int i30 = i29 % 2;
                                    Float fValueOf = Float.valueOf(addInfoPartTwo.onWarmupCompleted(isqueryrefinementenabled2));
                                    if (i30 == 0) {
                                        int i31 = 83 / 0;
                                    }
                                    return fValueOf;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function03);
                            obj = function03;
                        }
                        Function0 function04 = (Function0) obj;
                        boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled2);
                        Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!zOnExtraCallback7) {
                            int i28 = IAuthTabCallbackDefault + 93;
                            onTransact = i28 % 128;
                            int i29 = i28 % 2;
                            Object obj2 = objOnMinimized9;
                            if (objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                                Function0 function05 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda10
                                    private static int onNavigationEvent = 0;
                                    private static int onWarmupCompleted = 1;

                                    public final Object invoke() {
                                        int i30 = 2 % 2;
                                        int i31 = onNavigationEvent + 33;
                                        onWarmupCompleted = i31 % 128;
                                        int i32 = i31 % 2;
                                        Float fValueOf = Float.valueOf(addInfoPartTwo.IAuthTabCallback(isqueryrefinementenabled2));
                                        int i33 = onNavigationEvent + 103;
                                        onWarmupCompleted = i33 % 128;
                                        int i34 = i33 % 2;
                                        return fValueOf;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function05);
                                obj2 = function05;
                            }
                            Function0 function06 = (Function0) obj2;
                            boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled3);
                            Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!zOnExtraCallback8) {
                                Object obj3 = objOnMinimized10;
                                if (objOnMinimized10 == onwarmupcompleted.onExtraCallback()) {
                                    Function0 function07 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda11
                                        private static int IAuthTabCallback = 0;
                                        private static int onExtraCallbackWithResult = 1;

                                        public final Object invoke() {
                                            int i30 = 2 % 2;
                                            int i31 = onExtraCallbackWithResult + 69;
                                            IAuthTabCallback = i31 % 128;
                                            int i32 = i31 % 2;
                                            Object[] objArr = {isqueryrefinementenabled3};
                                            Float fValueOf = Float.valueOf(((Float) addInfoPartTwo.onExtraCallback(-1140684482, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1140684500, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent())).floatValue());
                                            int i33 = onExtraCallbackWithResult + 93;
                                            IAuthTabCallback = i33 % 128;
                                            if (i33 % 2 == 0) {
                                                return fValueOf;
                                            }
                                            Object obj4 = null;
                                            obj4.hashCode();
                                            throw null;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function07);
                                    obj3 = function07;
                                }
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                onNavigationEvent((Function0<Float>) function04, (Function0<Float>) function06, (Function0<Float>) obj3, (QuirksExternalSyntheticBackport0) null, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-573423886, true, new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda12
                                    private static int onExtraCallbackWithResult = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke(Object obj4, Object obj5) throws Throwable {
                                        int i30 = 2 % 2;
                                        int i31 = onNavigationEvent + 115;
                                        onExtraCallbackWithResult = i31 % 128;
                                        int i32 = i31 % 2;
                                        Unit unitOnWarmupCompleted = addInfoPartTwo.onWarmupCompleted(str3, str4, changeType, changeType2, z, str5, function0, getsupportedhighspeedresolutionsfor, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                        int i33 = onExtraCallbackWithResult + 67;
                                        onNavigationEvent = i33 % 128;
                                        int i34 = i33 % 2;
                                        return unitOnWarmupCompleted;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 24576, 8);
                                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                            }
                        }
                    }
                } else {
                    r11 = 0;
                    z2 = false;
                    if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = attachTimestamp.IAuthTabCallback(onextracallback, (Function1) objOnMinimized7);
                    AppLovinPostbackService appLovinPostbackService2 = AppLovinPostbackService.onExtraCallbackWithResult;
                    getHumanReadableName gethumanreadablename2 = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService2}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                    long jLongValue2 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
                    isRepeatingEnabled isrepeatingenabled2 = isRepeatingEnabled.onExtraCallback;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, quirksExternalSyntheticBackport0IAuthTabCallback2, gethumanreadablename2, Long.valueOf(jLongValue2), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf((int) r11), Boolean.valueOf((boolean) r11), isrepeatingenabled2.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i3 >> 3) & 14), 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
                    zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fOnExtraCallback);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback | zIAuthTabCallback) {
                        objOnMinimized = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda8
                            private static int onNavigationEvent = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj4) {
                                int i282 = 2 % 2;
                                int i292 = onNavigationEvent + 91;
                                onWarmupCompleted = i292 % 128;
                                if (i292 % 2 == 0) {
                                    addInfoPartTwo.onExtraCallbackWithResult(isqueryrefinementenabled, fOnExtraCallback, (flipHorizontally) obj4);
                                    Object obj22 = null;
                                    obj22.hashCode();
                                    throw null;
                                }
                                Unit unitOnExtraCallbackWithResult = addInfoPartTwo.onExtraCallbackWithResult(isqueryrefinementenabled, fOnExtraCallback, (flipHorizontally) obj4);
                                int i30 = onWarmupCompleted + 111;
                                onNavigationEvent = i30 % 128;
                                int i31 = i30 % 2;
                                return unitOnExtraCallbackWithResult;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, attachTimestamp.IAuthTabCallback(onextracallback, (Function1) objOnMinimized), (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService2}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf((int) r11), Boolean.valueOf((boolean) r11), isrepeatingenabled2.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i3 >> 6) & 14), 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled2);
                        Object objOnMinimized82 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (zOnExtraCallback2) {
                        }
                    }
                }
            } else {
                z2 = false;
            }
            objOnMinimized7 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda7
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj4) {
                    Unit unitOnExtraCallback;
                    int i30 = 2 % 2;
                    int i31 = onWarmupCompleted + 87;
                    IAuthTabCallback = i31 % 128;
                    if (i31 % 2 != 0) {
                        unitOnExtraCallback = addInfoPartTwo.onExtraCallback(isqueryrefinementenabled, fOnExtraCallback, (flipHorizontally) obj4);
                        int i32 = 37 / 0;
                    } else {
                        unitOnExtraCallback = addInfoPartTwo.onExtraCallback(isqueryrefinementenabled, fOnExtraCallback, (flipHorizontally) obj4);
                    }
                    int i33 = onWarmupCompleted + 89;
                    IAuthTabCallback = i33 % 128;
                    if (i33 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
            r11 = z2;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback22 = attachTimestamp.IAuthTabCallback(onextracallback, (Function1) objOnMinimized7);
            AppLovinPostbackService appLovinPostbackService22 = AppLovinPostbackService.onExtraCallbackWithResult;
            getHumanReadableName gethumanreadablename22 = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService22}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            long jLongValue22 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
            isRepeatingEnabled isrepeatingenabled22 = isRepeatingEnabled.onExtraCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, quirksExternalSyntheticBackport0IAuthTabCallback22, gethumanreadablename22, Long.valueOf(jLongValue22), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf((int) r11), Boolean.valueOf((boolean) r11), isrepeatingenabled22.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i3 >> 3) & 14), 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
            zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fOnExtraCallback);
            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnExtraCallback | zIAuthTabCallback) {
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda13
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj4, Object obj5) {
                    int i30 = 2 % 2;
                    int i31 = onExtraCallbackWithResult + 99;
                    onNavigationEvent = i31 % 128;
                    int i32 = i31 % 2;
                    Unit unitOnExtraCallback = addInfoPartTwo.onExtraCallback(quirksExternalSyntheticBackport0, str, str2, str3, str4, changeType, changeType2, str5, z, function0, function02, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                    int i33 = onNavigationEvent + 63;
                    onExtraCallbackWithResult = i33 % 128;
                    if (i33 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    Object obj6 = null;
                    obj6.hashCode();
                    throw null;
                }
            });
        }
    }

    public static final class onWarmupCompleted implements component5 {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function0<Float> onExtraCallback;
        final /* synthetic */ Function0<Float> onExtraCallbackWithResult;

        onWarmupCompleted(Function0<Float> function0, Function0<Float> function02) {
            this.onExtraCallback = function0;
            this.onExtraCallbackWithResult = function02;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(getStreamSharingChildren getstreamsharingchildren, Function0 function0, int i, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 73;
            onWarmupCompleted = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                onWarmupCompleted(getstreamsharingchildren, function0, i, onextracallbackwithresult);
                throw null;
            }
            Unit unitOnWarmupCompleted = onWarmupCompleted(getstreamsharingchildren, function0, i, onextracallbackwithresult);
            int i4 = onWarmupCompleted + 87;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnWarmupCompleted;
            }
            obj.hashCode();
            throw null;
        }

        public /* bridge */ int IAuthTabCallback(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends FuturesExternalSyntheticLambda2> list, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 47;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int iIAuthTabCallback = super.IAuthTabCallback(futuresExternalSyntheticLambda3, list, i);
            int i5 = onWarmupCompleted + 7;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return iIAuthTabCallback;
        }

        public /* bridge */ int onExtraCallback(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends FuturesExternalSyntheticLambda2> list, int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 105;
            onNavigationEvent = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                super.onExtraCallback(futuresExternalSyntheticLambda3, list, i);
                obj.hashCode();
                throw null;
            }
            int iOnExtraCallback = super.onExtraCallback(futuresExternalSyntheticLambda3, list, i);
            int i4 = onWarmupCompleted + 85;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return iOnExtraCallback;
            }
            throw null;
        }

        public /* bridge */ int onNavigationEvent(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends FuturesExternalSyntheticLambda2> list, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 19;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int iOnNavigationEvent = super.onNavigationEvent(futuresExternalSyntheticLambda3, list, i);
            int i5 = onWarmupCompleted + 111;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return iOnNavigationEvent;
            }
            throw null;
        }

        public /* bridge */ int onWarmupCompleted(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends FuturesExternalSyntheticLambda2> list, int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 41;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int iOnWarmupCompleted = super.onWarmupCompleted(futuresExternalSyntheticLambda3, list, i);
            int i5 = onNavigationEvent + 35;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return iOnWarmupCompleted;
        }

        public final component8 onExtraCallbackWithResult(component4 component4Var, List<? extends component7> list, long j) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(component4Var, "");
            Intrinsics.checkNotNullParameter(list, "");
            final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback = ((component7) CollectionsKt.first(list)).onExtraCallback(j);
            final int iT_ = getstreamsharingchildrenOnExtraCallback.T_();
            int iCoerceIn = RangesKt.coerceIn(getBacktraceNoteBytes.onExtraCallback(iT_ * ((Number) this.onExtraCallback.invoke()).floatValue()), 0, iT_);
            int interfaceDescriptor = getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor();
            final Function0<Float> function0 = this.onExtraCallbackWithResult;
            component8 component8VarIAuthTabCallback = component4.IAuthTabCallback(component4Var, interfaceDescriptor, iCoerceIn, (Map) null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$ExpandableRow$2$1$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 25;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unitOnExtraCallbackWithResult = addInfoPartTwo.onWarmupCompleted.onExtraCallbackWithResult(getstreamsharingchildrenOnExtraCallback, function0, iT_, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                    int i5 = onWarmupCompleted + 9;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }, 4, (Object) null);
            int i2 = onWarmupCompleted + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return component8VarIAuthTabCallback;
        }

        private static final Unit onWarmupCompleted(getStreamSharingChildren getstreamsharingchildren, Function0 function0, int i, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 83;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, 0, getBacktraceNoteBytes.onExtraCallback(((Number) function0.invoke()).floatValue() + i), 0.0f, 5, (Object) null);
            } else {
                Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, 0, getBacktraceNoteBytes.onExtraCallback(((Number) function0.invoke()).floatValue() * i), 0.0f, 4, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 55;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        flipHorizontally fliphorizontally = (flipHorizontally) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallbackStub(RangesKt.coerceIn(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f));
        fliphorizontally.onWarmupCompleted(true);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 31;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[PHI: r4
      0x003b: PHI (r4v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r4v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r4v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002e, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r4
      0x0030: PHI (r4v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r4v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r4v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002e, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(final Function0<Float> function0, final Function0<Float> function02, final Function0<Float> function03, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        int i4 = 2 % 2;
        int i5 = onTransact + 63;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1290788936);
            if ((i & 51) == 0) {
                i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1290788936);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function03) ? 256 : 128;
        }
        int i6 = i2 & 8;
        Object obj = null;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            int i7 = IAuthTabCallbackDefault + 125;
            onTransact = i7 % 128;
            if (i7 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02);
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ^ true) ? 16384 : 8192;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) != 9362, i3 & 1)) {
            if (i6 != 0) {
                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1290788936, i3, -1, "im.toss.feature.credit.ui.main.home.component.ExpandableRow (CreditHomeLoanNeedsRow.kt:498)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null);
            boolean z = (i3 & 896) == 256;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!z) {
                int i8 = IAuthTabCallbackDefault + 33;
                onTransact = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda5
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2) {
                            int i9 = 2 % 2;
                            int i10 = onNavigationEvent + 19;
                            onExtraCallbackWithResult = i10 % 128;
                            if (i10 % 2 != 0) {
                                addInfoPartTwo.IAuthTabCallback(function03, (flipHorizontally) obj2);
                                throw null;
                            }
                            Unit unitIAuthTabCallback = addInfoPartTwo.IAuthTabCallback(function03, (flipHorizontally) obj2);
                            int i11 = onExtraCallbackWithResult + 119;
                            onNavigationEvent = i11 % 128;
                            int i12 = i11 % 2;
                            return unitIAuthTabCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized);
                boolean z2 = (i3 & 14) == 4;
                boolean z3 = (i3 & 112) == 32;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((z2 | z3) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new onWarmupCompleted(function0, function02);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                component5 component5Var = (component5) objOnMinimized2;
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
                    int i9 = onTransact + 35;
                    IAuthTabCallbackDefault = i9 % 128;
                    int i10 = i9 % 2;
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5Var, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((((((i3 >> 12) & 14) << 6) & 896) | 6) >> 6) & 14));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda6
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) {
                    int i11 = 2 % 2;
                    int i12 = onNavigationEvent + 39;
                    onWarmupCompleted = i12 % 128;
                    int i13 = i12 % 2;
                    Object obj4 = null;
                    Function0 function04 = function0;
                    Function0 function05 = function02;
                    if (i13 != 0) {
                        addInfoPartTwo.onWarmupCompleted(function04, function05, function03, quirksExternalSyntheticBackport03, function2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        throw null;
                    }
                    Unit unitOnWarmupCompleted = addInfoPartTwo.onWarmupCompleted(function04, function05, function03, quirksExternalSyntheticBackport03, function2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i14 = onWarmupCompleted + 19;
                    onNavigationEvent = i14 % 128;
                    if (i14 % 2 != 0) {
                        return unitOnWarmupCompleted;
                    }
                    obj4.hashCode();
                    throw null;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(final String str, final String str2, final CreditHomeLargeBannerResponse.ChangeType changeType, final CreditHomeLargeBannerResponse.ChangeType changeType2, final boolean z, final String str3, final Function0<Unit> function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Boolean bool, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws Throwable {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        Boolean bool2;
        int i5;
        int i6;
        boolean z2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final Boolean bool3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i7;
        int iOrdinal;
        int i8 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1967379828);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i9 = IAuthTabCallbackDefault + 31;
            onTransact = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 91 / 0;
                iOrdinal = changeType == null ? -1 : changeType.ordinal();
            } else if (changeType == null) {
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(changeType2 == null ? -1 : changeType2.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                i7 = 524288;
            } else {
                int i11 = onTransact + 59;
                IAuthTabCallbackDefault = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 4 % 5;
                }
                i7 = 1048576;
            }
            i3 |= i7;
        }
        int i13 = i2 & 128;
        if (i13 != 0) {
            i3 |= 12582912;
        } else {
            if ((12582912 & i) == 0) {
                int i14 = onTransact + 15;
                IAuthTabCallbackDefault = i14 % 128;
                int i15 = i14 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 8388608 : 4194304;
            }
            i4 = i2 & 256;
            if (i4 != 0) {
                bool2 = bool;
                if ((i & 100663296) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(bool2)) {
                        int i16 = IAuthTabCallbackDefault + 57;
                        onTransact = i16 % 128;
                        int i17 = i16 % 2;
                        i5 = 67108864;
                    } else {
                        i5 = 33554432;
                    }
                    i6 = i5 | i3;
                }
                if ((38347923 & i6) != 38347922) {
                    int i18 = IAuthTabCallbackDefault + 33;
                    onTransact = i18 % 128;
                    int i19 = i18 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i6 & 1)) {
                    if (i13 != 0) {
                        quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                    }
                    Boolean bool4 = i4 != 0 ? null : bool2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1967379828, i6, -1, "im.toss.feature.credit.ui.main.home.component.LoanNeedsValueRow (CreditHomeLoanNeedsRow.kt:528)");
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null);
                    FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                    FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = focusMeteringControlExternalSyntheticLambda12.onExtraCallback();
                    QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                    component5 component5VarOnExtraCallback = RowKt.onExtraCallback(asbinderOnExtraCallback, onextracallbackwithresult.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
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
                        int i20 = IAuthTabCallbackDefault + 91;
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                        onTransact = i20 % 128;
                        if (i20 % 2 != 0) {
                            int i21 = 3 / 5;
                        }
                    } else {
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                    QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault = onextracallbackwithresult.IAuthTabCallbackDefault();
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    component5 component5VarOnExtraCallback2 = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onwarmupcompletedIAuthTabCallbackDefault, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        int i22 = IAuthTabCallbackDefault + 45;
                        onTransact = i22 % 128;
                        if (i22 % 2 != 0) {
                            getAwbState.onExtraCallback();
                            int i23 = 4 / 0;
                        } else {
                            getAwbState.onExtraCallback();
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback2, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                    onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    int i24 = i6 << 3;
                    int i25 = i6;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    IAuthTabCallback(CaptureNoResponseQuirk.onWarmupCompleted(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-6.0f), 0.0f, 2, (Object) null), str, str2, changeType, changeType2, z, true, true, bool4, setByteOrder.onNavigationEvent(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).isEngagementSignalsApiAvailable()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i24 & 57344) | (i24 & 112) | 14155782 | (i24 & 896) | (i24 & 7168) | (458752 & i24) | (i6 & 234881024), 0);
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    setAdvertiser.onExtraCallbackWithResult(str3, (QuirksExternalSyntheticBackport0) null, setCallToAction.IAuthTabCallback.Companion.onNavigationEvent(), setCallToAction.onWarmupCompleted.Dark, setCallToAction.onExtraCallback.Weak, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) null, function0, false, false, cameraCaptureResultEmptyCameraCaptureResult2, ((i25 >> 15) & 14) | 28032 | ((i25 << 6) & 234881024), 0, 1762);
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    int i26 = IAuthTabCallbackDefault + 5;
                    onTransact = i26 % 128;
                    if (i26 % 2 != 0) {
                        int i27 = 5 / 3;
                    }
                    bool3 = bool4;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    bool3 = bool2;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda2
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj, Object obj2) {
                            int i28 = 2 % 2;
                            int i29 = onNavigationEvent + 61;
                            IAuthTabCallback = i29 % 128;
                            int i30 = i29 % 2;
                            String str4 = str;
                            String str5 = str2;
                            CreditHomeLargeBannerResponse.ChangeType changeType3 = changeType;
                            CreditHomeLargeBannerResponse.ChangeType changeType4 = changeType2;
                            boolean z3 = z;
                            String str6 = str3;
                            Function0 function02 = function0;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport03;
                            Boolean bool5 = bool3;
                            int i31 = i;
                            int i32 = i2;
                            int iIntValue = ((Integer) obj2).intValue();
                            Object[] objArr = {str4, str5, changeType3, changeType4, Boolean.valueOf(z3), str6, function02, quirksExternalSyntheticBackport06, bool5, Integer.valueOf(i31), Integer.valueOf(i32), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                            Unit unit = (Unit) addInfoPartTwo.onExtraCallback(1736667318, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1736667304, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
                            int i33 = IAuthTabCallback + 99;
                            onNavigationEvent = i33 % 128;
                            int i34 = i33 % 2;
                            return unit;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 100663296;
            bool2 = bool;
            i6 = i3;
            if ((38347923 & i6) != 38347922) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i6 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i4 = i2 & 256;
        if (i4 != 0) {
        }
        i6 = i3;
        if ((38347923 & i6) != 38347922) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i6 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final void onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws Throwable {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1444982175);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            int i3 = IAuthTabCallbackDefault + 107;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onTransact + 89;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1444982175, i, -1, "im.toss.feature.credit.ui.main.home.component.GreenRippleLottieIcon (CreditHomeLoanNeedsRow.kt:562)");
                int i7 = IAuthTabCallbackDefault + 87;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
            }
            deprecated_eventListenerFactory deprecated_eventlistenerfactory = deprecated_eventListenerFactory.Lottie;
            handleNativeAdClick.onExtraCallback.onWarmupCompleted onWarmupCompleted2 = handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f));
            Object[] objArr = new Object[1];
            a(new char[]{18, 14, '\f', 3, 1, '\n', 13867, 13867, 3, '\n', '\b', '\n', 17, '\r', '\b', 18, '\n', 4, 1, 4, 16, 3, 19, 0, '\n', 14, 18, 23, 20, 1, 19, 5, 21, 22, 22, 23, 20, 21, 17, 3, 3, 0, 22, 20, 1, 2, '\t', 0, '\t', 4, 14, 0, 13931, 13931, 3, 4, 5, 3, '\f', 24}, (byte) (118 - Color.blue(0)), View.MeasureSpec.getMode(0) + 60, objArr);
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            setMainImageUri.IAuthTabCallback(((String) objArr[0]).intern(), deprecated_eventlistenerfactory, (QuirksExternalSyntheticBackport0) null, onWarmupCompleted2, 0L, 1, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult2, 199734, 0, 8148);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = onWarmupCompleted + 103;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 == 0) {
                        addInfoPartTwo.onNavigationEvent(i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    Unit unitOnNavigationEvent = addInfoPartTwo.onNavigationEvent(i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i11 = onWarmupCompleted + 123;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    return unitOnNavigationEvent;
                }
            });
            int i9 = IAuthTabCallbackDefault + 41;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    public static final class asBinder extends getViewTypeCount.IAuthTabCallbackStub {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ boolean IAuthTabCallback;

        asBinder(boolean z) {
            this.IAuthTabCallback = z;
        }

        public boolean IAuthTabCallback() {
            boolean z;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                z = this.IAuthTabCallback;
                int i4 = 54 / 0;
            } else {
                z = this.IAuthTabCallback;
            }
            int i5 = i3 + 57;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        float f;
        String str;
        long jAccess100;
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        boolean z = true;
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        setByteOrder setbyteorder = (setByteOrder) objArr[3];
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[4];
        w5a w5aVar = (w5a) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((iIntValue & 17) == 16) {
            int i2 = onTransact + 75;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onTransact + 19;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(541128039, iIntValue, -1, "im.toss.feature.credit.ui.main.home.component.LoanNeedsRow.<anonymous> (CreditHomeLoanNeedsRow.kt:666)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(541128039, iIntValue, -1, "im.toss.feature.credit.ui.main.home.component.LoanNeedsRow.<anonymous> (CreditHomeLoanNeedsRow.kt:666)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            if (zBooleanValue) {
                int i5 = IAuthTabCallbackDefault + 75;
                onTransact = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                f = -6.0f;
            } else {
                f = 0.0f;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CaptureNoResponseQuirk.onWarmupCompleted(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f), 0.0f, 2, (Object) null);
            if (str2 != null) {
                str = str2;
            } else if (str3 == null) {
                int i6 = onTransact + 117;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                str = "";
            } else {
                str = str3;
            }
            getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            if (str2 != null) {
                int i8 = IAuthTabCallbackDefault + 3;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1733406100);
                jAccess100 = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).setEngagementSignalsCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1733503409);
                if (setbyteorder == null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(333015214);
                    jAccess100 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(333014129);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    jAccess100 = setbyteorder.access100();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, quirksExternalSyntheticBackport0OnWarmupCompleted, gethumanreadablename, Long.valueOf(jAccess100), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfo, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onTransact + 47;
                IAuthTabCallbackDefault = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i11 = 54 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final component8 onExtraCallbackWithResult(final int i, component4 component4Var, component7 component7Var, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(component4Var, "");
        Intrinsics.checkNotNullParameter(component7Var, "");
        final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback = component7Var.onExtraCallback(virtualCameraCaptureResult.onExtraCallback());
        component8 component8VarIAuthTabCallback = component4.IAuthTabCallback(component4Var, getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor(), RangesKt.coerceAtLeast(getstreamsharingchildrenOnExtraCallback.T_() - i, 0), (Map) null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda33
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 63;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnExtraCallback = addInfoPartTwo.onExtraCallback(getstreamsharingchildrenOnExtraCallback, i, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                int i6 = onNavigationEvent + 53;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                throw null;
            }
        }, 4, (Object) null);
        int i3 = onTransact + 3;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return component8VarIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i;
        int i2;
        float f;
        int i3;
        Object obj;
        getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult = (getStreamSharingChildren.onExtraCallbackWithResult) objArr[2];
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 21;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            i = -iIntValue;
            i2 = 0;
            f = 0.0f;
            i3 = 4;
            obj = null;
        } else {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            i = -iIntValue;
            i2 = 0;
            f = 0.0f;
            i3 = 4;
            obj = null;
        }
        getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, i2, i, f, i3, obj);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(boolean z, boolean z2, getViewTypeCount.IAuthTabCallback iAuthTabCallback, final int i, String str, String str2, CreditHomeLargeBannerResponse.ChangeType changeType, CreditHomeLargeBannerResponse.ChangeType changeType2, boolean z3, boolean z4, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 17) != 16, i2 & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = IAuthTabCallbackDefault + 123;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1062073150, i2, -1, "im.toss.feature.credit.ui.main.home.component.LoanNeedsRow.<anonymous> (CreditHomeLoanNeedsRow.kt:680)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1062073150, i2, -1, "im.toss.feature.credit.ui.main.home.component.LoanNeedsRow.<anonymous> (CreditHomeLoanNeedsRow.kt:680)");
                int i5 = IAuthTabCallbackDefault + 95;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = CaptureNoResponseQuirk.onWarmupCompleted(quirksExternalSyntheticBackport0OnWarmupCompleted, (z && z2) ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-6.0f) : iAuthTabCallback != null ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), 0.0f, 2, (Object) null);
            if (i > 0) {
                int i7 = IAuthTabCallbackDefault + 115;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-802386594);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda34
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i9 = 2 % 2;
                            int i10 = onExtraCallbackWithResult + 57;
                            onNavigationEvent = i10 % 128;
                            int i11 = i10 % 2;
                            int i12 = i;
                            component4 component4Var = (component4) obj2;
                            if (i11 != 0) {
                                return addInfoPartTwo.onWarmupCompleted(i12, component4Var, (component7) obj3, (VirtualCameraCaptureResult) obj4);
                            }
                            addInfoPartTwo.onWarmupCompleted(i12, component4Var, (component7) obj3, (VirtualCameraCaptureResult) obj4);
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                quirksExternalSyntheticBackport0OnWarmupCompleted = ListFuture2.onWarmupCompleted(quirksExternalSyntheticBackport0OnWarmupCompleted, (getBacktraceNote) objOnMinimized);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-801942116);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted2.onExtraCallback(quirksExternalSyntheticBackport0OnWarmupCompleted), str, str2, changeType, changeType2, z3, z4, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 896);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i9 = IAuthTabCallbackDefault + 41;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:326:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, String str4, CreditHomeLargeBannerResponse.ChangeType changeType, CreditHomeLargeBannerResponse.ChangeType changeType2, boolean z, boolean z2, boolean z3, final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, getViewTypeCount.IAuthTabCallback iAuthTabCallback, Function0<Unit> function0, setByteOrder setbyteorder, GraphicDeviceInfo graphicDeviceInfo, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final String str5;
        final String str6;
        final String str7;
        final String str8;
        final CreditHomeLargeBannerResponse.ChangeType changeType3;
        final CreditHomeLargeBannerResponse.ChangeType changeType4;
        final boolean z4;
        final boolean z5;
        final boolean z6;
        final getViewTypeCount.IAuthTabCallback iAuthTabCallback2;
        final Function0<Unit> function02;
        final setByteOrder setbyteorder2;
        final GraphicDeviceInfo graphicDeviceInfo2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z7;
        String str9;
        int i22;
        int i23;
        int i24;
        final GraphicDeviceInfo graphicDeviceInfo3;
        String str10;
        SurfaceProcessorNodeOut surfaceProcessorNodeOut;
        final int iMax;
        getBacktraceNote getbacktracenote;
        int i25 = 2 % 2;
        int i26 = onTransact + 5;
        IAuthTabCallbackDefault = i26 % 128;
        int i27 = i26 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(562845674);
        int i28 = i3 & 1;
        if (i28 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i29 = IAuthTabCallbackDefault + 101;
                onTransact = i29 % 128;
                int i30 = i29 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i;
        } else {
            i4 = i;
        }
        int i31 = i3 & 2;
        if (i31 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
            }
            i6 = i3 & 4;
            int i32 = 256;
            if (i6 == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 256 : 128;
                }
                i7 = i3 & 8;
                int i33 = 1024;
                if (i7 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 2048 : 1024;
                    }
                    i8 = i3 & 16;
                    if (i8 == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4) ? 16384 : 8192;
                        }
                        i9 = i3 & 32;
                        if (i9 != 0) {
                            i4 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(changeType == null ? -1 : changeType.ordinal()) ? 131072 : 65536;
                        }
                        i10 = i3 & 64;
                        if (i10 != 0) {
                            i4 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(changeType2 != null ? changeType2.ordinal() : -1)) {
                                int i34 = onTransact + 97;
                                IAuthTabCallbackDefault = i34 % 128;
                                int i35 = i34 % 2;
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i4 |= i11;
                        }
                        i12 = i3 & 128;
                        if (i12 != 0) {
                            int i36 = IAuthTabCallbackDefault + 45;
                            onTransact = i36 % 128;
                            int i37 = i36 % 2;
                            i4 |= 12582912;
                        } else {
                            if ((12582912 & i) == 0) {
                                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 8388608 : 4194304;
                            }
                            i13 = i3 & 256;
                            if (i13 == 0) {
                                i4 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 67108864 : 33554432;
                            }
                            i14 = i3 & 512;
                            if (i14 == 0) {
                                i4 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 536870912 : 268435456;
                            }
                            if ((i2 & 6) != 0) {
                                i15 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 4 : 2);
                            } else {
                                i15 = i2;
                            }
                            i16 = i3 & 2048;
                            if (i16 == 0) {
                                i15 |= 48;
                            } else if ((i2 & 48) == 0) {
                                i15 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback) ? 32 : 16;
                            }
                            int i38 = i15;
                            i17 = i3 & 4096;
                            if (i17 == 0) {
                                i38 |= 384;
                            } else if ((i2 & 384) == 0) {
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                                    int i39 = onTransact + 89;
                                    IAuthTabCallbackDefault = i39 % 128;
                                    int i40 = i39 % 2;
                                } else {
                                    i32 = 128;
                                }
                                i38 |= i32;
                            }
                            i18 = i3 & 8192;
                            if (i18 == 0) {
                                i38 |= 3072;
                            } else {
                                if ((i2 & 3072) == 0) {
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setbyteorder)) {
                                        int i41 = onTransact + 11;
                                        i19 = i18;
                                        IAuthTabCallbackDefault = i41 % 128;
                                        int i42 = i41 % 2;
                                        i33 = 2048;
                                    } else {
                                        i19 = i18;
                                    }
                                    i38 |= i33;
                                }
                                i20 = i3 & 16384;
                                if (i20 == 0) {
                                    if ((i2 & 24576) == 0) {
                                        i38 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo) ? 16384 : 8192;
                                    }
                                    i21 = i38;
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i4) == 306783378 || (i21 & 9363) != 9362, i4 & 1)) {
                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                        str5 = str;
                                        str6 = str2;
                                        str7 = str3;
                                        str8 = str4;
                                        changeType3 = changeType;
                                        changeType4 = changeType2;
                                        z4 = z;
                                        z5 = z2;
                                        z6 = z3;
                                        iAuthTabCallback2 = iAuthTabCallback;
                                        function02 = function0;
                                        setbyteorder2 = setbyteorder;
                                        graphicDeviceInfo2 = graphicDeviceInfo;
                                    } else {
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i28 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                        String str11 = i31 != 0 ? null : str;
                                        String str12 = i6 != 0 ? null : str2;
                                        String str13 = i7 != 0 ? null : str3;
                                        String str14 = i8 != 0 ? null : str4;
                                        CreditHomeLargeBannerResponse.ChangeType changeType5 = i9 != 0 ? null : changeType;
                                        CreditHomeLargeBannerResponse.ChangeType changeType6 = i10 != 0 ? null : changeType2;
                                        boolean z8 = i12 != 0 ? false : z;
                                        if (i13 != 0) {
                                            int i43 = IAuthTabCallbackDefault + 31;
                                            onTransact = i43 % 128;
                                            int i44 = i43 % 2;
                                            z7 = true;
                                        } else {
                                            z7 = z2;
                                        }
                                        boolean z9 = i14 != 0 ? true : z3;
                                        getViewTypeCount.IAuthTabCallback iAuthTabCallback3 = i16 != 0 ? null : iAuthTabCallback;
                                        Function0<Unit> function03 = i17 != 0 ? null : function0;
                                        setByteOrder setbyteorder3 = i19 != 0 ? null : setbyteorder;
                                        GraphicDeviceInfo graphicDeviceInfo4 = i20 != 0 ? null : graphicDeviceInfo;
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(562845674, i4, i21, "im.toss.feature.credit.ui.main.home.component.LoanNeedsRow (CreditHomeLoanNeedsRow.kt:588)");
                                        }
                                        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                                        Configuration configuration = (Configuration) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult());
                                        ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability = (ExtensionsManagerExtensionsAvailability) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.IAuthTabCallbackStubProxy());
                                        GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = (str12 == null && graphicDeviceInfo4 != null) ? graphicDeviceInfo4 : isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult();
                                        if (str12 != null) {
                                            str9 = str12;
                                        } else if (str11 == null) {
                                            int i45 = onTransact + 93;
                                            IAuthTabCallbackDefault = i45 % 128;
                                            if (i45 % 2 == 0) {
                                                throw null;
                                            }
                                            str9 = "";
                                        } else {
                                            str9 = str11;
                                        }
                                        SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback = r8lambdagFq9ZjkYMu6QWJyE7oyeb6idSPU.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str9);
                                        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
                                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if ((zOnNavigationEvent | zOnNavigationEvent2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            objOnMinimized = SurfaceProcessorWithExecutorExternalSyntheticLambda1.onExtraCallbackWithResult(surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback, str9, getHumanReadableName.onNavigationEvent((getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), 0L, 0L, graphicDeviceInfoOnExtraCallbackWithResult, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777211, (Object) null), 0, false, 0, 0L, (ExtensionsManagerExtensionsAvailability) null, (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (getSurfaceSize.IAuthTabCallback) null, false, 1020, (Object) null);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                        }
                                        SurfaceProcessorNodeOut surfaceProcessorNodeOut2 = (SurfaceProcessorNodeOut) objOnMinimized;
                                        SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback2 = r8lambdagFq9ZjkYMu6QWJyE7oyeb6idSPU.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                                        boolean z10 = (i4 & 7168) == 2048;
                                        boolean z11 = (57344 & i4) == 16384;
                                        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
                                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if ((z11 | z10 | zOnNavigationEvent3) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(str13 == null ? "" : str13);
                                            if (str14 != null) {
                                                sb.append(" | ");
                                                sb.append(str14);
                                            }
                                            objOnMinimized2 = SurfaceProcessorWithExecutorExternalSyntheticLambda1.onExtraCallbackWithResult(surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback2, sb.toString(), getHumanReadableName.onNavigationEvent((getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), 0L, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15), isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777209, (Object) null), 0, false, 0, 0L, (ExtensionsManagerExtensionsAvailability) null, (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (getSurfaceSize.IAuthTabCallback) null, false, 1020, (Object) null);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                        }
                                        SurfaceProcessorNodeOut surfaceProcessorNodeOut3 = (SurfaceProcessorNodeOut) objOnMinimized2;
                                        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(surfaceProcessorNodeOut2);
                                        boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(surfaceProcessorNodeOut3);
                                        boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(configuration);
                                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(extensionsManagerExtensionsAvailability.ordinal());
                                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (((zOnNavigationEvent4 | zOnNavigationEvent5 | zOnNavigationEvent6) || zOnExtraCallback) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            float fOnExtraCallback = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(configuration.screenWidthDp));
                                            float fOnExtraCallback2 = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(deviceQuirksExternalSyntheticLambda0.onNavigationEvent(extensionsManagerExtensionsAvailability));
                                            float fOnExtraCallback3 = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(deviceQuirksExternalSyntheticLambda0.onExtraCallbackWithResult(extensionsManagerExtensionsAvailability));
                                            float fOnExtraCallback4 = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
                                            float fOnExtraCallback5 = z7 ? r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f)) : 0.0f;
                                            float fOnExtraCallback6 = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
                                            float fOnExtraCallback7 = iAuthTabCallback3 != null ? r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(iAuthTabCallback3.asInterface() + iAuthTabCallback3.IAuthTabCallbackDefault()) + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f))) : 0.0f;
                                            i22 = i4;
                                            List listListOfNotNull = CollectionsKt.listOfNotNull(new CreditHomeLargeBannerResponse.ChangeType[]{changeType5, changeType6});
                                            if ((listListOfNotNull instanceof Collection) && listListOfNotNull.isEmpty()) {
                                                i24 = i21;
                                                i23 = 0;
                                            } else {
                                                Iterator it = listListOfNotNull.iterator();
                                                i23 = 0;
                                                while (it.hasNext()) {
                                                    Iterator it2 = it;
                                                    int i46 = i21;
                                                    if (((CreditHomeLargeBannerResponse.ChangeType) it.next()) != CreditHomeLargeBannerResponse.ChangeType.NONE && (i23 = i23 + 1) < 0) {
                                                        CollectionsKt.throwCountOverflow();
                                                    }
                                                    it = it2;
                                                    i21 = i46;
                                                }
                                                i24 = i21;
                                            }
                                            graphicDeviceInfo3 = graphicDeviceInfoOnExtraCallbackWithResult;
                                            str10 = str14;
                                            surfaceProcessorNodeOut = surfaceProcessorNodeOut2;
                                            objOnMinimized3 = Boolean.valueOf((((float) (((int) (surfaceProcessorNodeOut2.asBinder() >> 32)) + ((int) (surfaceProcessorNodeOut3.asBinder() >> 32)))) + fOnExtraCallback6) + r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback((float) (i23 * 14))) > ((fOnExtraCallback - ((fOnExtraCallback2 + fOnExtraCallback3) + fOnExtraCallback4)) - fOnExtraCallback5) - fOnExtraCallback7);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                        } else {
                                            graphicDeviceInfo3 = graphicDeviceInfoOnExtraCallbackWithResult;
                                            str10 = str14;
                                            i22 = i4;
                                            surfaceProcessorNodeOut = surfaceProcessorNodeOut2;
                                            i24 = i21;
                                        }
                                        final boolean zBooleanValue = ((Boolean) objOnMinimized3).booleanValue();
                                        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue);
                                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (!zOnExtraCallback2) {
                                            Object obj = objOnMinimized4;
                                            if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                asBinder asbinder = new asBinder(zBooleanValue);
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(asbinder);
                                                obj = asbinder;
                                            }
                                            asBinder asbinder2 = (asBinder) obj;
                                            if (zBooleanValue) {
                                                int iOnExtraCallbackWithResult = z7 ? r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f)) : 0;
                                                int iAsBinder = (int) surfaceProcessorNodeOut.asBinder();
                                                iMax = ((Math.max(iOnExtraCallbackWithResult, iAsBinder) - iAsBinder) / 2) + r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f));
                                            } else {
                                                iMax = 0;
                                            }
                                            getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteOnWarmupCompleted = z7 ? runtimeEnvironmentStateChange.IAuthTabCallback.onWarmupCompleted() : null;
                                            if (str13 == null && str10 == null) {
                                                int i47 = IAuthTabCallbackDefault + 99;
                                                onTransact = i47 % 128;
                                                int i48 = i47 % 2;
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(188728691);
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                getbacktracenote = null;
                                            } else {
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(187431032);
                                                final boolean z12 = z7;
                                                final getViewTypeCount.IAuthTabCallback iAuthTabCallback4 = iAuthTabCallback3;
                                                final String str15 = str13;
                                                final String str16 = str10;
                                                final CreditHomeLargeBannerResponse.ChangeType changeType7 = changeType5;
                                                final CreditHomeLargeBannerResponse.ChangeType changeType8 = changeType6;
                                                final boolean z13 = z8;
                                                final boolean z14 = z9;
                                                getBacktraceNote getbacktracenoteOnExtraCallback = ForwardingCameraControl.onExtraCallback(1062073150, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda14
                                                    private static int onExtraCallback = 1;
                                                    private static int onNavigationEvent;

                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        int i49 = 2 % 2;
                                                        int i50 = onNavigationEvent + 53;
                                                        onExtraCallback = i50 % 128;
                                                        int i51 = i50 % 2;
                                                        Unit unitOnWarmupCompleted = addInfoPartTwo.onWarmupCompleted(z12, zBooleanValue, iAuthTabCallback4, iMax, str15, str16, changeType7, changeType8, z13, z14, (RightPreset) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                                        int i52 = onExtraCallback + 17;
                                                        onNavigationEvent = i52 % 128;
                                                        if (i52 % 2 == 0) {
                                                            return unitOnWarmupCompleted;
                                                        }
                                                        Object obj5 = null;
                                                        obj5.hashCode();
                                                        throw null;
                                                    }
                                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                getbacktracenote = getbacktracenoteOnExtraCallback;
                                            }
                                            final boolean z15 = z7;
                                            final String str17 = str12;
                                            final String str18 = str11;
                                            final setByteOrder setbyteorder4 = setbyteorder3;
                                            int i49 = i24 << 3;
                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                            w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(541128039, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda15
                                                private static int onExtraCallbackWithResult = 0;
                                                private static int onNavigationEvent = 1;

                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    int i50 = 2 % 2;
                                                    int i51 = onExtraCallbackWithResult + 59;
                                                    onNavigationEvent = i51 % 128;
                                                    int i52 = i51 % 2;
                                                    Unit unitOnExtraCallback = addInfoPartTwo.onExtraCallback(z15, str17, str18, setbyteorder4, graphicDeviceInfo3, (w5a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                                    int i53 = onNavigationEvent + 37;
                                                    onExtraCallbackWithResult = i53 % 128;
                                                    if (i53 % 2 == 0) {
                                                        return unitOnExtraCallback;
                                                    }
                                                    Object obj5 = null;
                                                    obj5.hashCode();
                                                    throw null;
                                                }
                                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport03, getbacktracenoteOnWarmupCompleted, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, getbacktracenote, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, iAuthTabCallback3, asbinder2, (getViewTypeCount.asInterface) null, (String) null, function03, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, (i49 & 112) | 6 | ((i22 << 6) & 896) | ((i24 << 24) & 1879048192), i49 & 7168, 55728);
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                            }
                                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                            str8 = str10;
                                            changeType3 = changeType5;
                                            str5 = str11;
                                            changeType4 = changeType6;
                                            str6 = str12;
                                            str7 = str13;
                                            z4 = z8;
                                            z5 = z7;
                                            z6 = z9;
                                            iAuthTabCallback2 = iAuthTabCallback3;
                                            function02 = function03;
                                            setbyteorder2 = setbyteorder3;
                                            graphicDeviceInfo2 = graphicDeviceInfo4;
                                        }
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda16
                                            private static int onExtraCallbackWithResult = 1;
                                            private static int onWarmupCompleted;

                                            public final Object invoke(Object obj2, Object obj3) {
                                                int i50 = 2 % 2;
                                                int i51 = onWarmupCompleted + 45;
                                                onExtraCallbackWithResult = i51 % 128;
                                                int i52 = i51 % 2;
                                                Unit unitOnWarmupCompleted = addInfoPartTwo.onWarmupCompleted(quirksExternalSyntheticBackport02, str5, str6, str7, str8, changeType3, changeType4, z4, z5, z6, deviceQuirksExternalSyntheticLambda0, iAuthTabCallback2, function02, setbyteorder2, graphicDeviceInfo2, i, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                                int i53 = onWarmupCompleted + 27;
                                                onExtraCallbackWithResult = i53 % 128;
                                                if (i53 % 2 == 0) {
                                                    int i54 = 61 / 0;
                                                }
                                                return unitOnWarmupCompleted;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                int i50 = onTransact + 89;
                                IAuthTabCallbackDefault = i50 % 128;
                                i38 = i50 % 2 == 0 ? i38 | 1369 : i38 | 24576;
                                i21 = i38;
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i4) == 306783378 || (i21 & 9363) != 9362, i4 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                }
                            }
                            i19 = i18;
                            i20 = i3 & 16384;
                            if (i20 == 0) {
                            }
                            i21 = i38;
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i4) == 306783378 || (i21 & 9363) != 9362, i4 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                            }
                        }
                        i13 = i3 & 256;
                        if (i13 == 0) {
                        }
                        i14 = i3 & 512;
                        if (i14 == 0) {
                        }
                        if ((i2 & 6) != 0) {
                        }
                        i16 = i3 & 2048;
                        if (i16 == 0) {
                        }
                        int i382 = i15;
                        i17 = i3 & 4096;
                        if (i17 == 0) {
                        }
                        i18 = i3 & 8192;
                        if (i18 == 0) {
                        }
                        i19 = i18;
                        i20 = i3 & 16384;
                        if (i20 == 0) {
                        }
                        i21 = i382;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i4) == 306783378 || (i21 & 9363) != 9362, i4 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i9 = i3 & 32;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 64;
                    if (i10 != 0) {
                    }
                    i12 = i3 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i3 & 256;
                    if (i13 == 0) {
                    }
                    i14 = i3 & 512;
                    if (i14 == 0) {
                    }
                    if ((i2 & 6) != 0) {
                    }
                    i16 = i3 & 2048;
                    if (i16 == 0) {
                    }
                    int i3822 = i15;
                    i17 = i3 & 4096;
                    if (i17 == 0) {
                    }
                    i18 = i3 & 8192;
                    if (i18 == 0) {
                    }
                    i19 = i18;
                    i20 = i3 & 16384;
                    if (i20 == 0) {
                    }
                    i21 = i3822;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i4) == 306783378 || (i21 & 9363) != 9362, i4 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i8 = i3 & 16;
                if (i8 == 0) {
                }
                i9 = i3 & 32;
                if (i9 != 0) {
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                }
                i13 = i3 & 256;
                if (i13 == 0) {
                }
                i14 = i3 & 512;
                if (i14 == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                i16 = i3 & 2048;
                if (i16 == 0) {
                }
                int i38222 = i15;
                i17 = i3 & 4096;
                if (i17 == 0) {
                }
                i18 = i3 & 8192;
                if (i18 == 0) {
                }
                i19 = i18;
                i20 = i3 & 16384;
                if (i20 == 0) {
                }
                i21 = i38222;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i4) == 306783378 || (i21 & 9363) != 9362, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i7 = i3 & 8;
            int i332 = 1024;
            if (i7 != 0) {
            }
            i8 = i3 & 16;
            if (i8 == 0) {
            }
            i9 = i3 & 32;
            if (i9 != 0) {
            }
            i10 = i3 & 64;
            if (i10 != 0) {
            }
            i12 = i3 & 128;
            if (i12 != 0) {
            }
            i13 = i3 & 256;
            if (i13 == 0) {
            }
            i14 = i3 & 512;
            if (i14 == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            i16 = i3 & 2048;
            if (i16 == 0) {
            }
            int i382222 = i15;
            i17 = i3 & 4096;
            if (i17 == 0) {
            }
            i18 = i3 & 8192;
            if (i18 == 0) {
            }
            i19 = i18;
            i20 = i3 & 16384;
            if (i20 == 0) {
            }
            i21 = i382222;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i4) == 306783378 || (i21 & 9363) != 9362, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i6 = i3 & 4;
        int i322 = 256;
        if (i6 == 0) {
        }
        i7 = i3 & 8;
        int i3322 = 1024;
        if (i7 != 0) {
        }
        i8 = i3 & 16;
        if (i8 == 0) {
        }
        i9 = i3 & 32;
        if (i9 != 0) {
        }
        i10 = i3 & 64;
        if (i10 != 0) {
        }
        i12 = i3 & 128;
        if (i12 != 0) {
        }
        i13 = i3 & 256;
        if (i13 == 0) {
        }
        i14 = i3 & 512;
        if (i14 == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        i16 = i3 & 2048;
        if (i16 == 0) {
        }
        int i3822222 = i15;
        i17 = i3 & 4096;
        if (i17 == 0) {
        }
        i18 = i3 & 8192;
        if (i18 == 0) {
        }
        i19 = i18;
        i20 = i3 & 16384;
        if (i20 == 0) {
        }
        i21 = i3822222;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i4) == 306783378 || (i21 & 9363) != 9362, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit onExtraCallback(String str, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 31;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1862474068, i, -1, "im.toss.feature.credit.ui.main.home.component.ChangeTypeArrowIcon.<anonymous> (CreditHomeLoanNeedsRow.kt:734)");
                int i5 = onTransact + 93;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
            }
            setMainImageUri.IAuthTabCallback(deprecated_authenticator.onWarmupCompleted(str), deprecated_eventListenerFactory.Icon, (QuirksExternalSyntheticBackport0) null, handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f)), j, 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 3120, 0, 8164);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallbackDefault + 19;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(Function2 function2, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 105;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
            CameraConfigExternalSyntheticLambda0.asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-187567828, i, -1, "im.toss.feature.credit.ui.main.home.component.ChangeTypeArrowIcon.<anonymous> (CreditHomeLoanNeedsRow.kt:747)");
        }
        function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 79;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[PHI: r2
      0x004a: PHI (r2v65 o.CameraCaptureResultEmptyCameraCaptureResult) = (r2v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r2v66 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002b, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r2
      0x002d: PHI (r2v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r2v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r2v66 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002b, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(final CreditHomeLargeBannerResponse.ChangeType changeType, final boolean z, final boolean z2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function2 function2;
        long jLongValue;
        Pair pairIAuthTabCallback;
        long jICustomTabsCallback;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 25;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(950589462);
            if ((i & 3) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(changeType == null ? -1 : changeType.ordinal())) {
                    int i6 = IAuthTabCallbackDefault + 71;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i3 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(950589462);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z) ^ true ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z2) ? 256 : 128;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
            int i8 = IAuthTabCallbackDefault + 97;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(950589462, i3, -1, "im.toss.feature.credit.ui.main.home.component.ChangeTypeArrowIcon (CreditHomeLoanNeedsRow.kt:722)");
            }
            if (changeType == null) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda18
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult;

                        public final Object invoke(Object obj, Object obj2) {
                            int i10 = 2 % 2;
                            int i11 = onExtraCallbackWithResult + 95;
                            onExtraCallback = i11 % 128;
                            if (i11 % 2 != 0) {
                                return addInfoPartTwo.onNavigationEvent(changeType, z, z2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            }
                            addInfoPartTwo.onNavigationEvent(changeType, z, z2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            throw null;
                        }
                    };
                }
            } else {
                int i10 = IAuthTabCallbackDefault.onExtraCallbackWithResult[changeType.ordinal()];
                if (i10 == 1) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1311552216);
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1311549954);
                        jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).onMinimized();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1311548962);
                        jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, 2111452320, OverseasRrnInputTextField.IAuthTabCallback(), -2111452315)).longValue();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    pairIAuthTabCallback = getWrite.IAuthTabCallback("icon-arrow-down-fat-mono", setByteOrder.onNavigationEvent(jLongValue));
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                } else if (i10 != 2) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2003119770);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        return;
                    } else {
                        function2 = new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda19
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallback = 1;

                            public final Object invoke(Object obj, Object obj2) {
                                int i11 = 2 % 2;
                                int i12 = onExtraCallback + 19;
                                IAuthTabCallback = i12 % 128;
                                int i13 = i12 % 2;
                                Unit unitOnWarmupCompleted = addInfoPartTwo.onWarmupCompleted(changeType, z, z2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i14 = IAuthTabCallback + 13;
                                onExtraCallback = i14 % 128;
                                if (i14 % 2 != 0) {
                                    return unitOnWarmupCompleted;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        };
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1311546778);
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda02 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda02, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1311543586);
                        jICustomTabsCallback = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).extraCallback();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1311544578);
                        jICustomTabsCallback = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).ICustomTabsCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    pairIAuthTabCallback = getWrite.IAuthTabCallback("icon-arrow-up-fat-mono", setByteOrder.onNavigationEvent(jICustomTabsCallback));
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                }
                final String str = (String) pairIAuthTabCallback.onExtraCallbackWithResult();
                final long jAccess100 = ((setByteOrder) pairIAuthTabCallback.IAuthTabCallback()).access100();
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)), cameraCaptureResultEmptyCameraCaptureResult2, 6);
                final EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1862474068, true, new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda20
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i11 = 2 % 2;
                        int i12 = onWarmupCompleted + 99;
                        onExtraCallbackWithResult = i12 % 128;
                        int i13 = i12 % 2;
                        Unit unitIAuthTabCallback = addInfoPartTwo.IAuthTabCallback(str, jAccess100, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i14 = onWarmupCompleted + 79;
                        onExtraCallbackWithResult = i14 % 128;
                        int i15 = i14 % 2;
                        return unitIAuthTabCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult2, 54);
                if (z) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2002791201);
                    setVerticalGravity.onWarmupCompleted(z2, (QuirksExternalSyntheticBackport0) null, ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback((updateFocusedState) null, 0.0f, 3, (Object) null), (SearchView) null, (String) null, ForwardingCameraControl.onExtraCallback(-187567828, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda21
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i11 = 2 % 2;
                            int i12 = onNavigationEvent + 25;
                            IAuthTabCallback = i12 % 128;
                            Object obj4 = null;
                            if (i12 % 2 != 0) {
                                Object[] objArr = {encoderProfilesProxyVideoProfileProxyOnExtraCallback, (setHorizontalGravity) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                                throw null;
                            }
                            Object[] objArr2 = {encoderProfilesProxyVideoProfileProxyOnExtraCallback, (setHorizontalGravity) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                            Unit unit = (Unit) addInfoPartTwo.onExtraCallback(494740108, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -494740106, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr2, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
                            int i13 = onNavigationEvent + 65;
                            IAuthTabCallback = i13 % 128;
                            if (i13 % 2 == 0) {
                                return unit;
                            }
                            obj4.hashCode();
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, ((i3 >> 6) & 14) | 196992, 26);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2002648911);
                    encoderProfilesProxyVideoProfileProxyOnExtraCallback.invoke(cameraCaptureResultEmptyCameraCaptureResult2, 6);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
        }
        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            function2 = new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda22
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) {
                    int i11 = 2 % 2;
                    int i12 = onExtraCallbackWithResult + 75;
                    onNavigationEvent = i12 % 128;
                    if (i12 % 2 == 0) {
                        return addInfoPartTwo.onExtraCallback(changeType, z, z2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    addInfoPartTwo.onExtraCallback(changeType, z, z2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    throw null;
                }
            };
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
        }
    }

    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        boolean z;
        long jLongValue;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-825849240);
        if (i != 0) {
            int i3 = onTransact + 97;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 5;
            }
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-825849240, i, -1, "im.toss.feature.credit.ui.main.home.component.ValueDivider (CreditHomeLoanNeedsRow.kt:755)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0AsBinder = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), 0.0f, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(15.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f));
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            if (!(!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, iOnWarmupCompleted, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue())) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(927837071);
                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onRelationshipValidationResult();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(927838031);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 476605378, OverseasRrnInputTextField.IAuthTabCallback(), -476605362)).longValue();
            }
            long j = jLongValue;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0AsBinder, j, (toMetersPerSecond) null, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackDefault + 113;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda25
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = onExtraCallback + 13;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = i;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                    if (i9 == 0) {
                        return addInfoPartTwo.onExtraCallbackWithResult(i10, cameraCaptureResultEmptyCameraCaptureResult2, ((Integer) obj2).intValue());
                    }
                    Unit unitOnExtraCallbackWithResult = addInfoPartTwo.onExtraCallbackWithResult(i10, cameraCaptureResultEmptyCameraCaptureResult2, ((Integer) obj2).intValue());
                    int i11 = 40 / 0;
                    return unitOnExtraCallbackWithResult;
                }
            });
        }
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, CreditHomeLargeBannerResponse.ChangeType changeType, boolean z, boolean z2, boolean z3, Boolean bool, setByteOrder setbyteorder, String str2, CreditHomeLargeBannerResponse.ChangeType changeType2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        String str3;
        int i2 = 2 % 2;
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1))) {
            int i3 = IAuthTabCallbackDefault + 35;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1804286617, i, -1, "im.toss.feature.credit.ui.main.home.component.RollingNumbersContent.<anonymous> (CreditHomeLoanNeedsRow.kt:779)");
            }
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), QuirkSettingsLoader.Companion.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult, 48);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            if (str == null) {
                int i5 = onTransact + 93;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                str3 = "";
            } else {
                str3 = str;
            }
            onWarmupCompleted(str3, changeType, z, z2, true, z3, bool, setbyteorder, cameraCaptureResultEmptyCameraCaptureResult, 24576, 0);
            if (str2 != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-303560443);
                IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 0);
                onWarmupCompleted(str2, changeType2, z, z2, false, z3, bool, setbyteorder, cameraCaptureResultEmptyCameraCaptureResult, 24576, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-303091475);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i7 = IAuthTabCallbackDefault + 27;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final String str, final String str2, final CreditHomeLargeBannerResponse.ChangeType changeType, final CreditHomeLargeBannerResponse.ChangeType changeType2, final boolean z, boolean z2, boolean z3, Boolean bool, setByteOrder setbyteorder, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        boolean z4;
        int i4;
        int i5;
        int i6;
        Boolean bool2;
        int i7;
        final boolean z5;
        final setByteOrder setbyteorder2;
        final boolean z6;
        final Boolean bool3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        setByteOrder setbyteorder3;
        Boolean bool4;
        int iOrdinal;
        int i8;
        int i9 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(562470614);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
                int i10 = onTransact + 91;
                IAuthTabCallbackDefault = i10 % 128;
                i8 = i10 % 2 == 0 ? 24095 : 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(changeType == null ? -1 : changeType.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if (changeType2 == null) {
                int i11 = IAuthTabCallbackDefault + 71;
                onTransact = i11 % 128;
                int i12 = i11 % 2;
                iOrdinal = -1;
            } else {
                iOrdinal = changeType2.ordinal();
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            int i13 = IAuthTabCallbackDefault + 51;
            onTransact = i13 % 128;
            if (i13 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z);
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 131072 : 65536;
        }
        int i14 = i2 & 64;
        if (i14 != 0) {
            int i15 = onTransact + 35;
            IAuthTabCallbackDefault = i15 % 128;
            int i16 = i15 % 2;
            i3 |= 1572864;
        } else {
            if ((i & 1572864) == 0) {
                int i17 = onTransact + 99;
                IAuthTabCallbackDefault = i17 % 128;
                int i18 = i17 % 2;
                z4 = z2;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z4) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
            } else if ((12582912 & i) == 0) {
                int i19 = onTransact + 57;
                IAuthTabCallbackDefault = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = 74 / 0;
                    i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 8388608 : 4194304;
                } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3)) {
                }
                i3 |= i5;
            }
            i6 = i2 & 256;
            if (i6 == 0) {
                int i21 = IAuthTabCallbackDefault + 77;
                onTransact = i21 % 128;
                if (i21 % 2 != 0) {
                    i3 |= 100663296;
                    int i22 = 40 / 0;
                } else {
                    i3 |= 100663296;
                }
            } else {
                if ((100663296 & i) == 0) {
                    bool2 = bool;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(bool2) ? 67108864 : 33554432;
                }
                i7 = i2 & 512;
                if (i7 == 0) {
                    if ((i & 805306368) == 0) {
                        i3 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setbyteorder) ? 268435456 : 536870912;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i3) == 306783378, i3 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        z5 = z3;
                        setbyteorder2 = setbyteorder;
                        z6 = z4;
                        bool3 = bool2;
                    } else {
                        boolean z7 = i14 != 0 ? true : z4;
                        boolean z8 = i4 == 0 ? z3 : false;
                        if (i6 != 0) {
                            int i23 = IAuthTabCallbackDefault + 27;
                            onTransact = i23 % 128;
                            if (i23 % 2 != 0) {
                                throw null;
                            }
                            setbyteorder3 = null;
                            bool4 = null;
                        } else {
                            setbyteorder3 = null;
                            bool4 = bool2;
                        }
                        setByteOrder setbyteorder4 = i7 != 0 ? setbyteorder3 : setbyteorder;
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(562470614, i3, -1, "im.toss.feature.credit.ui.main.home.component.RollingNumbersContent (CreditHomeLoanNeedsRow.kt:777)");
                        }
                        final boolean z9 = z7;
                        final boolean z10 = z8;
                        final Boolean bool5 = bool4;
                        final setByteOrder setbyteorder5 = setbyteorder4;
                        putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.onMinimized(), (r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.onWarmupCompleted) null, (putCharSequenceArray) null, ForwardingCameraControl.onExtraCallback(1804286617, true, new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda23
                            private static int onExtraCallback = 1;
                            private static int onExtraCallbackWithResult;

                            public final Object invoke(Object obj, Object obj2) {
                                int i24 = 2 % 2;
                                int i25 = onExtraCallback + 81;
                                onExtraCallbackWithResult = i25 % 128;
                                int i26 = i25 % 2;
                                Unit unitIAuthTabCallback = addInfoPartTwo.IAuthTabCallback(quirksExternalSyntheticBackport0, str, changeType, z, z9, z10, bool5, setbyteorder5, str2, changeType2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i27 = onExtraCallbackWithResult + 35;
                                onExtraCallback = i27 % 128;
                                if (i27 % 2 == 0) {
                                    int i28 = 15 / 0;
                                }
                                return unitIAuthTabCallback;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 6);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        z5 = z8;
                        bool3 = bool4;
                        setbyteorder2 = setbyteorder4;
                        z6 = z7;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda24
                            private static int onNavigationEvent = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj, Object obj2) {
                                int i24 = 2 % 2;
                                int i25 = onWarmupCompleted + 43;
                                onNavigationEvent = i25 % 128;
                                int i26 = i25 % 2;
                                Unit unitOnWarmupCompleted = addInfoPartTwo.onWarmupCompleted(quirksExternalSyntheticBackport0, str, str2, changeType, changeType2, z, z6, z5, bool3, setbyteorder2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i27 = onWarmupCompleted + 77;
                                onNavigationEvent = i27 % 128;
                                if (i27 % 2 == 0) {
                                    return unitOnWarmupCompleted;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 805306368;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i3) == 306783378, i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            bool2 = bool;
            i7 = i2 & 512;
            if (i7 == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i3) == 306783378, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        z4 = z2;
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        bool2 = bool;
        i7 = i2 & 512;
        if (i7 == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i3) == 306783378, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(final String str, final CreditHomeLargeBannerResponse.ChangeType changeType, final boolean z, final boolean z2, final boolean z3, boolean z4, Boolean bool, setByteOrder setbyteorder, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        int i4;
        Boolean bool2;
        int i5;
        int i6;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final setByteOrder setbyteorder2;
        final Boolean bool3;
        final boolean z5;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z6;
        long jLongValue;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        int i7;
        int i8;
        int i9;
        int i10 = 2 % 2;
        int i11 = IAuthTabCallbackDefault + 83;
        onTransact = i11 % 128;
        int i12 = i11 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2014260367);
        Object obj = null;
        if ((i & 6) == 0) {
            int i13 = IAuthTabCallbackDefault + 45;
            onTransact = i13 % 128;
            if (i13 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                obj.hashCode();
                throw null;
            }
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(changeType == null ? -1 : changeType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            int i14 = onTransact + 85;
            IAuthTabCallbackDefault = i14 % 128;
            int i15 = i14 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                i9 = 2048;
            } else {
                int i16 = IAuthTabCallbackDefault + 5;
                onTransact = i16 % 128;
                int i17 = i16 % 2;
                i9 = 1024;
            }
            i3 |= i9;
        }
        if ((i & 24576) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3)) {
                int i18 = IAuthTabCallbackDefault + 89;
                onTransact = i18 % 128;
                i8 = i18 % 2 != 0 ? 15709 : 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i19 = i2 & 32;
        if (i19 != 0) {
            i3 |= 196608;
        } else {
            if ((196608 & i) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z4) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else {
                if ((1572864 & i) == 0) {
                    bool2 = bool;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(bool2) ? 1048576 : 524288;
                }
                i5 = i2 & 128;
                if (i5 == 0) {
                    if ((i & 12582912) == 0) {
                        int i20 = onTransact + 57;
                        IAuthTabCallbackDefault = i20 % 128;
                        int i21 = i20 % 2;
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setbyteorder) ? 8388608 : 4194304;
                    }
                    i6 = i3;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i6) == 4793490, i6 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                        setbyteorder2 = setbyteorder;
                        bool3 = bool2;
                        z5 = z4;
                    } else {
                        if (i19 != 0) {
                            int i22 = onTransact + 33;
                            IAuthTabCallbackDefault = i22 % 128;
                            int i23 = i22 % 2;
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        Boolean bool4 = i4 != 0 ? null : bool2;
                        setByteOrder setbyteorder3 = i5 != 0 ? null : setbyteorder;
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i24 = IAuthTabCallbackDefault + 63;
                            onTransact = i24 % 128;
                            int i25 = i24 % 2;
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2014260367, i6, -1, "im.toss.feature.credit.ui.main.home.component.ValueWithArrowIcon (CreditHomeLoanNeedsRow.kt:821)");
                        }
                        long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15);
                        if (setbyteorder3 != null) {
                            jLongValue = setbyteorder3.access100();
                        } else {
                            if (z6) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1326025002);
                                jLongValue = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).isEngagementSignalsApiAvailable();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1326024042);
                                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        long j = jLongValue;
                        QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault = QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), onwarmupcompletedIAuthTabCallbackDefault, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            int i26 = onTransact + 21;
                            IAuthTabCallbackDefault = i26 % 128;
                            if (i26 % 2 == 0) {
                                getAwbState.onExtraCallback();
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
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                        RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                        if (z2) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(586790759);
                            onExtraCallback(-490342496, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 490342497, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{str, Long.valueOf(jOnExtraCallback), Long.valueOf(j), Integer.valueOf(createCameraCaptureCallback.Companion.onTransact()), bool4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i6 & 14) | 48 | ((i6 >> 6) & 57344)), 0}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            i7 = i6;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(587082562);
                            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            i7 = i6;
                            r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback(str, (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, j, jOnExtraCallback, 0L, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.onTransact()), 0.0f, (bindChildren) null, (use) null, 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onExtraCallback.onExtraCallback.onNavigationEvent, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult) null, (String) null, 0L, (String) null, 0L, false, z3, false, (Object) null, cameraCaptureResultEmptyCameraCaptureResult3, (i6 & 14) | 24576, ((i6 << 15) & 1879048192) | 432, 0, 3663782);
                            cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                        }
                        int i27 = i7;
                        int i28 = ((i27 >> 3) & 14) | ((i27 >> 6) & 112) | (i27 & 896);
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                        onExtraCallback(changeType, z2, z, cameraCaptureResultEmptyCameraCaptureResult2, i28);
                        cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i29 = onTransact + 9;
                            IAuthTabCallbackDefault = i29 % 128;
                            if (i29 % 2 == 0) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                                throw null;
                            }
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        z5 = z6;
                        bool3 = bool4;
                        setbyteorder2 = setbyteorder3;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda17
                            private static int onExtraCallbackWithResult = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i30 = 2 % 2;
                                int i31 = onExtraCallbackWithResult + 27;
                                onNavigationEvent = i31 % 128;
                                int i32 = i31 % 2;
                                String str2 = str;
                                CreditHomeLargeBannerResponse.ChangeType changeType2 = changeType;
                                boolean z7 = z;
                                boolean z8 = z2;
                                boolean z9 = z3;
                                boolean z10 = z5;
                                Boolean bool5 = bool3;
                                setByteOrder setbyteorder4 = setbyteorder2;
                                int i33 = i;
                                int i34 = i2;
                                int iIntValue = ((Integer) obj3).intValue();
                                Object[] objArr = {str2, changeType2, Boolean.valueOf(z7), Boolean.valueOf(z8), Boolean.valueOf(z9), Boolean.valueOf(z10), bool5, setbyteorder4, Integer.valueOf(i33), Integer.valueOf(i34), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                                Unit unit = (Unit) addInfoPartTwo.onExtraCallback(-1519173297, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1519173313, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
                                int i35 = onNavigationEvent + 59;
                                onExtraCallbackWithResult = i35 % 128;
                                int i36 = i35 % 2;
                                return unit;
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 12582912;
                i6 = i3;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i6) == 4793490, i6 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            bool2 = bool;
            i5 = i2 & 128;
            if (i5 == 0) {
            }
            i6 = i3;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i6) == 4793490, i6 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        bool2 = bool;
        i5 = i2 & 128;
        if (i5 == 0) {
        }
        i6 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i6) == 4793490, i6 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Boolean $rollStartTrigger;
        final /* synthetic */ launchUri $state;
        final /* synthetic */ String $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(Boolean bool, launchUri launchuri, String str, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$rollStartTrigger = bool;
            this.$state = launchuri;
            this.$value = str;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 117;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$rollStartTrigger, this.$state, this.$value, access13800Var);
            int i2 = onWarmupCompleted + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 61;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                Boolean bool = this.$rollStartTrigger;
                if (bool == null) {
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(1200L, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else if (!bool.booleanValue()) {
                    Unit unit = Unit.INSTANCE;
                    int i4 = IAuthTabCallback + 29;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 54 / 0;
                    }
                    return unit;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            launchUri.onExtraCallbackWithResult(this.$state, this.$value, false, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback) null, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult) null, true, 14, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[PHI: r9
      0x006a: PHI (r9v45 o.CameraCaptureResultEmptyCameraCaptureResult) = (r9v3 o.CameraCaptureResultEmptyCameraCaptureResult), (r9v46 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x005c, B:5:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005e A[PHI: r9
      0x005e: PHI (r9v4 o.CameraCaptureResultEmptyCameraCaptureResult) = (r9v3 o.CameraCaptureResultEmptyCameraCaptureResult), (r9v46 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x005c, B:5:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        boolean z;
        long j;
        long j2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        Object obj;
        int i2;
        int i3;
        final Boolean bool;
        Boolean bool2;
        String strOnExtraCallback;
        int i4;
        launchUri launchuriOnWarmupCompleted;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        boolean z2;
        boolean zOnNavigationEvent;
        boolean z3;
        Object objOnMinimized;
        Object obj2;
        int i5;
        int i6;
        final String str = (String) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i7 = 2;
        long jLongValue2 = ((Number) objArr[2]).longValue();
        int iIntValue = ((Number) objArr[3]).intValue();
        Boolean bool3 = (Boolean) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue2 = ((Number) objArr[6]).intValue();
        final int iIntValue3 = ((Number) objArr[7]).intValue();
        int i8 = 2 % 2;
        int i9 = onTransact + 77;
        IAuthTabCallbackDefault = i9 % 128;
        if (i9 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult4.IAuthTabCallback(394225377);
            if ((iIntValue2 & 17) == 0) {
                i = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 2 : 4) | iIntValue2;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i = iIntValue2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult4.IAuthTabCallback(394225377);
            if ((iIntValue2 & 6) == 0) {
            }
        }
        if ((iIntValue2 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jLongValue)) {
                int i10 = IAuthTabCallbackDefault + 41;
                onTransact = i10 % 128;
                int i11 = i10 % 2;
                i6 = 32;
            } else {
                i6 = 16;
            }
            i |= i6;
        }
        if ((iIntValue2 & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jLongValue2)) {
                int i12 = IAuthTabCallbackDefault + 99;
                onTransact = i12 % 128;
                int i13 = i12 % 2;
                i5 = 256;
            } else {
                i5 = 128;
            }
            i |= i5;
        }
        if ((iIntValue2 & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iIntValue) ? 2048 : 1024;
        }
        int i14 = iIntValue3 & 16;
        if (i14 != 0) {
            i |= 24576;
        } else if ((iIntValue2 & 24576) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(bool3) ? 16384 : 8192) | i;
        }
        if ((i & 9363) != 9362) {
            int i15 = IAuthTabCallbackDefault + 95;
            onTransact = i15 % 128;
            z = i15 % 2 == 0;
        }
        Object obj3 = null;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            Boolean bool4 = i14 != 0 ? null : bool3;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i16 = IAuthTabCallbackDefault + 33;
                onTransact = i16 % 128;
                if (i16 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(394225377, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditLoanNeedsRollingNumber (CreditHomeLoanNeedsRow.kt:861)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(394225377, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditLoanNeedsRollingNumber (CreditHomeLoanNeedsRow.kt:861)");
            }
            int i17 = 0;
            while (i17 < str.length()) {
                int i18 = onTransact + 75;
                IAuthTabCallbackDefault = i18 % 128;
                if (i18 % i7 == 0) {
                    int i19 = 35 / 0;
                    if (Character.isDigit(str.charAt(i17))) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1927890567);
                        boolean z4 = false;
                        if (!StringsKt.contains$default(str, "%", false, i7, obj3)) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1927970268);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            strOnExtraCallback = "??%";
                        } else if (StringsKt.contains$default(str, "만원", false, i7, obj3)) {
                            int i20 = onTransact + 79;
                            IAuthTabCallbackDefault = i20 % 128;
                            int i21 = i20 % i7;
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1928040111);
                            z4 = false;
                            strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_home_before_amount, cameraCaptureResultEmptyCameraCaptureResult, 0);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        } else {
                            z4 = false;
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1928125981);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            strOnExtraCallback = "??";
                        }
                        int i22 = i << 15;
                        i4 = i;
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult5 = cameraCaptureResultEmptyCameraCaptureResult;
                        boolean z5 = z4;
                        i2 = iIntValue2;
                        i3 = iIntValue;
                        launchuriOnWarmupCompleted = r8lambdazmdK5Aeq3EJkWJLcjaoC90W2ZHw.onWarmupCompleted(strOnExtraCallback, true, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback) null, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onNavigationEvent) null, (getHumanReadableName) null, jLongValue2, jLongValue, 0L, createCameraCaptureCallback.onExtraCallback(iIntValue), 0.0f, (bindChildren) null, (use) null, 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (findResAndMsg) null, false, (Object) null, cameraCaptureResultEmptyCameraCaptureResult5, ((i4 << 9) & 458752) | 48 | (i22 & 3670016) | (i22 & 234881024), 3072, 122524);
                        if ((i4 & 57344) != 16384) {
                            z2 = true;
                            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult5;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult5;
                            z2 = z5;
                        }
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(launchuriOnWarmupCompleted);
                        if ((i4 & 14) != 4) {
                            int i23 = onTransact + 49;
                            IAuthTabCallbackDefault = i23 % 128;
                            int i24 = i23 % 2;
                            z3 = true;
                        } else {
                            z3 = z5;
                        }
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                        if ((!z3 && !(zOnNavigationEvent | z2)) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            obj2 = null;
                            objOnMinimized = new onExtraCallbackWithResult(bool4, launchuriOnWarmupCompleted, str, null);
                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized);
                        } else {
                            obj2 = null;
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(bool4, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult3, (i4 >> 12) & 14);
                        r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onExtraCallbackWithResult(launchuriOnWarmupCompleted, (QuirksExternalSyntheticBackport0) null, (Function2) null, (Function2) null, cameraCaptureResultEmptyCameraCaptureResult3, 0, 14);
                        cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                        obj = obj2;
                        j = jLongValue2;
                        j2 = jLongValue;
                        bool2 = bool4;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                    } else {
                        i17++;
                        i7 = i7;
                        cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult;
                        i = i;
                        obj3 = obj3;
                        iIntValue2 = iIntValue2;
                        iIntValue = iIntValue;
                    }
                } else if (Character.isDigit(str.charAt(i17))) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1927890567);
                    boolean z42 = false;
                    if (!StringsKt.contains$default(str, "%", false, i7, obj3)) {
                    }
                    int i222 = i << 15;
                    i4 = i;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult52 = cameraCaptureResultEmptyCameraCaptureResult;
                    boolean z52 = z42;
                    i2 = iIntValue2;
                    i3 = iIntValue;
                    launchuriOnWarmupCompleted = r8lambdazmdK5Aeq3EJkWJLcjaoC90W2ZHw.onWarmupCompleted(strOnExtraCallback, true, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback) null, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onNavigationEvent) null, (getHumanReadableName) null, jLongValue2, jLongValue, 0L, createCameraCaptureCallback.onExtraCallback(iIntValue), 0.0f, (bindChildren) null, (use) null, 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (findResAndMsg) null, false, (Object) null, cameraCaptureResultEmptyCameraCaptureResult52, ((i4 << 9) & 458752) | 48 | (i222 & 3670016) | (i222 & 234881024), 3072, 122524);
                    if ((i4 & 57344) != 16384) {
                    }
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(launchuriOnWarmupCompleted);
                    if ((i4 & 14) != 4) {
                    }
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                    if (!(z3 | zOnNavigationEvent | z2)) {
                        obj2 = null;
                        objOnMinimized = new onExtraCallbackWithResult(bool4, launchuriOnWarmupCompleted, str, null);
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized);
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(bool4, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult3, (i4 >> 12) & 14);
                        r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onExtraCallbackWithResult(launchuriOnWarmupCompleted, (QuirksExternalSyntheticBackport0) null, (Function2) null, (Function2) null, cameraCaptureResultEmptyCameraCaptureResult3, 0, 14);
                        cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                        obj = obj2;
                        j = jLongValue2;
                        j2 = jLongValue;
                        bool2 = bool4;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                    }
                } else {
                    i17++;
                    i7 = i7;
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult;
                    i = i;
                    obj3 = obj3;
                    iIntValue2 = iIntValue2;
                    iIntValue = iIntValue;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                bool = bool2;
            }
            int i25 = i;
            obj = obj3;
            i2 = iIntValue2;
            i3 = iIntValue;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult6 = cameraCaptureResultEmptyCameraCaptureResult;
            cameraCaptureResultEmptyCameraCaptureResult6.onExtraCallbackWithResult(1928770564);
            int i26 = i25 << 9;
            j = jLongValue2;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult6;
            j2 = jLongValue;
            bool2 = bool4;
            r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback("", (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, j, j2, 0L, createCameraCaptureCallback.onExtraCallback(i3), 0.0f, (bindChildren) null, (use) null, 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onExtraCallback.onExtraCallback.onNavigationEvent, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult) null, (String) null, 0L, str, 0L, false, false, false, (Object) null, cameraCaptureResultEmptyCameraCaptureResult2, ((i25 << 3) & 7168) | 6 | (i26 & 57344) | (i26 & 3670016), ((i25 << 18) & 3670016) | 432, 0, 4122534);
            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            bool = bool2;
        } else {
            j = jLongValue2;
            j2 = jLongValue;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
            obj = null;
            i2 = iIntValue2;
            i3 = iIntValue;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            bool = bool3;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final long j3 = j2;
            final long j4 = j;
            final int i27 = i3;
            final int i28 = i2;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj4, Object obj5) {
                    int i29 = 2 % 2;
                    int i30 = onNavigationEvent + 93;
                    IAuthTabCallback = i30 % 128;
                    if (i30 % 2 == 0) {
                        return addInfoPartTwo.onExtraCallbackWithResult(str, j3, j4, i27, bool, i28, iIntValue3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                    }
                    Unit unitOnExtraCallbackWithResult = addInfoPartTwo.onExtraCallbackWithResult(str, j3, j4, i27, bool, i28, iIntValue3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                    int i31 = 59 / 0;
                    return unitOnExtraCallbackWithResult;
                }
            });
        }
        return obj;
    }

    private static final boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return zBooleanValue;
    }

    private static final void onTransact(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 != 0) {
            throw null;
        }
        int i4 = onTransact + 87;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final boolean onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onTransact + 1;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = IAuthTabCallbackDefault + 13;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            throw null;
        }
    }

    private static final boolean onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = IAuthTabCallbackDefault + 123;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void asInterface(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 != 0) {
            throw null;
        }
    }

    private static final boolean onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            return bool.booleanValue();
        }
        int i4 = 27 / 0;
        return bool.booleanValue();
    }

    private static final void IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = IAuthTabCallbackDefault + 11;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ float onExtraCallback(isQueryRefinementEnabled isqueryrefinementenabled) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Float) onExtraCallback(-1140684482, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1140684500, iOnNavigationEvent, iOnNavigationEvent2, new Object[]{isqueryrefinementenabled}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent())).floatValue();
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, CreditHomeLargeBannerResponse.ChangeType changeType, boolean z, boolean z2, boolean z3, boolean z4, Boolean bool, setByteOrder setbyteorder, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {str, changeType, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), bool, setbyteorder, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onExtraCallback(-1519173297, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1519173313, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function2 function2, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {function2, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallback(-1385644922, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1385644927, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallback(Function2 function2, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {function2, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallback(627039616, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -627039603, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static /* synthetic */ Unit onNavigationEvent(Function2 function2, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {function2, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallback(494740108, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -494740106, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, CreditHomeLargeBannerResponse.ChangeType changeType, CreditHomeLargeBannerResponse.ChangeType changeType2, boolean z, String str3, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Boolean bool, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {str, str2, changeType, changeType2, Boolean.valueOf(z), str3, function0, quirksExternalSyntheticBackport0, bool, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onExtraCallback(1736667318, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1736667304, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, String str, float f, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12, boolean z2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Boolean.valueOf(z), str, Float.valueOf(f), virtualCameraControlExternalSyntheticLambda1, virtualCameraControlExternalSyntheticLambda12, Boolean.valueOf(z2), Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onExtraCallback(623366565, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -623366553, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12, float f, String str, boolean z, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {virtualCameraControlExternalSyntheticLambda1, virtualCameraControlExternalSyntheticLambda12, Float.valueOf(f), str, Boolean.valueOf(z), sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallback(1980231241, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1980231241, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, String str4, CreditHomeLargeBannerResponse.ChangeType changeType, CreditHomeLargeBannerResponse.ChangeType changeType2, boolean z, Function0 function0, Function0 function02, boolean z2, setByteOrder setbyteorder, GraphicDeviceInfo graphicDeviceInfo, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {quirksExternalSyntheticBackport0, str, str2, str3, str4, changeType, changeType2, Boolean.valueOf(z), function0, function02, Boolean.valueOf(z2), setbyteorder, graphicDeviceInfo, virtualCameraControlExternalSyntheticLambda1, virtualCameraControlExternalSyntheticLambda12, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        return (Unit) onExtraCallback(-1297090295, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1297090299, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final float onNavigationEvent(isQueryRefinementEnabled isqueryrefinementenabled) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Float) onExtraCallback(433947631, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -433947623, iOnNavigationEvent, iOnNavigationEvent2, new Object[]{isqueryrefinementenabled}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent())).floatValue();
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, String str4, CreditHomeLargeBannerResponse.ChangeType changeType, CreditHomeLargeBannerResponse.ChangeType changeType2, String str5, boolean z, Function0 function0, Function0 function02, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, str, str2, str3, str4, changeType, changeType2, str5, Boolean.valueOf(z), function0, function02, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onExtraCallback(135547837, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -135547822, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final void asBinder(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        onExtraCallback(1650348153, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1650348143, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final void IAuthTabCallback(String str, long j, long j2, int i, Boolean bool, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        Object[] objArr = {str, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), bool, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3)};
        onExtraCallback(-490342496, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 490342497, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final Unit onExtraCallback(Function0 function0, flipHorizontally fliphorizontally) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(714431789, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -714431780, iOnNavigationEvent, iOnNavigationEvent2, new Object[]{function0, fliphorizontally}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onExtraCallback(511754460, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -511754449, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final Unit onWarmupCompleted(getStreamSharingChildren getstreamsharingchildren, int i, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        Object[] objArr = {getstreamsharingchildren, Integer.valueOf(i), onextracallbackwithresult};
        return (Unit) onExtraCallback(779720886, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -779720883, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final Unit IAuthTabCallback(boolean z, String str, String str2, setByteOrder setbyteorder, GraphicDeviceInfo graphicDeviceInfo, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {Boolean.valueOf(z), str, str2, setbyteorder, graphicDeviceInfo, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallback(-118064391, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 118064398, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final Unit onNavigationEvent(String str, String str2, CreditHomeLargeBannerResponse.ChangeType changeType, CreditHomeLargeBannerResponse.ChangeType changeType2, boolean z, String str3, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Boolean bool, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {str, str2, changeType, changeType2, Boolean.valueOf(z), str3, function0, quirksExternalSyntheticBackport0, bool, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onExtraCallback(-2127773397, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 2127773403, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final Unit onExtraCallback(boolean z, String str, float f, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12, boolean z2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Boolean.valueOf(z), str, Float.valueOf(f), virtualCameraControlExternalSyntheticLambda1, virtualCameraControlExternalSyntheticLambda12, Boolean.valueOf(z2), Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onExtraCallback(1683909348, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1683909329, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final Unit onNavigationEvent(String str, CreditHomeLargeBannerResponse.ChangeType changeType, boolean z, boolean z2, boolean z3, boolean z4, Boolean bool, setByteOrder setbyteorder, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {str, changeType, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), bool, setbyteorder, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onExtraCallback(-974295294, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 974295311, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = new char[]{64960, 64990, 64963, 64925, 64991, 64978, 64962, 64984, 64985, 64980, 64896, 64905, 64976, 64967, 64988, 64924, 64965, 64964, 64986, 64987, 64961, 64982, 64989, 64966, 64926};
        onNavigationEvent = (char) 51244;
    }
}
