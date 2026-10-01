package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.view.Window;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.RenderEffectKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.securities.core.exposure.RegisterScreenTrackerKt;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraExecutorExternalSyntheticLambda0;
import o.CompositionLocalKtExternalSyntheticLambda1;
import o.ExtensionsManager1;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.FocusMeteringControlExternalSyntheticLambda9;
import o.Futures3;
import o.KeylinesKtExternalSyntheticLambda1;
import o.NestfgetmBinding;
import o.NestfgetmSurfaceIdsWithPendingMountNotification;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RecomposerawaitIdle2;
import o.SurfaceProcessorWithExecutorExternalSyntheticLambda1;
import o.TorchIsClosedAfterImageCapturingQuirk;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.flipHorizontally;
import o.getHumanReadableName;
import o.getSurfaceSize;
import o.handleNativeAdClick;
import o.hasProvider;
import o.pExternalSyntheticLambda1;
import o.setHorizontalGravity;
import o.setIso;
import o.setOrientationDegrees;
import o.setUseCaseAttached;
import o.setViewableMRC50Requests;
import o.toPreviewOnlyRange;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class NestfgetmSurfaceIdsWithPendingMountNotification {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static char[] onExtraCallback = null;
    private static final readBomAsCharset onExtraCallbackWithResult;
    private static boolean onNavigationEvent = false;
    private static int onTransact = 1;
    private static boolean onWarmupCompleted;

    public static final /* synthetic */ long IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        long jIAuthTabCallback_Parcel = IAuthTabCallback_Parcel((getSupportedHighSpeedResolutionsFor<setUseCaseDetached>) getsupportedhighspeedresolutionsfor);
        int i4 = IAuthTabCallbackDefault + 85;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return jIAuthTabCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, float f, ExifDataWhiteBalanceMode exifDataWhiteBalanceMode, Function0 function0, Function1 function1, Function0 function02, Function0 function03, Function1 function12, boolean z, r8lambdac3sIBWhumSTVayX4JnAMsG7PGiA r8lambdac3sibwhumstvayx4jnamsg7pgia, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = asInterface + 17;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, f, exifDataWhiteBalanceMode, function0, function1, function02, function03, function12, z, r8lambdac3sibwhumstvayx4jnamsg7pgia, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = asInterface + 29;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit IAuthTabCallback(String str, ExifDataWhiteBalanceMode exifDataWhiteBalanceMode, float f, float f2, Function1 function1, boolean z, Function1 function12, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 117;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            onExtraCallbackWithResult(str, exifDataWhiteBalanceMode, f, f2, (Function1<? super VirtualCameraControlExternalSyntheticLambda1, Unit>) function1, z, (Function1<? super Boolean, Unit>) function12, (Function0<Unit>) function0, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onExtraCallbackWithResult(str, exifDataWhiteBalanceMode, f, f2, (Function1<? super VirtualCameraControlExternalSyntheticLambda1, Unit>) function1, z, (Function1<? super Boolean, Unit>) function12, (Function0<Unit>) function0, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(List list, int i, Function1 function1, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = asInterface + 37;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        Unit unit = (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 2026094358, new Object[]{list, Integer.valueOf(i), function1, Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, -2026094347, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
        int i7 = IAuthTabCallbackDefault + 63;
        asInterface = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 37 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(List list, int i, Function1 function1, Map map, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = asInterface + 59;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            onWarmupCompleted((List<? extends NestfgetmBinding>) list, i, (Function1<? super String, Unit>) function1, (Map<Integer, pExternalSyntheticLambda1>) map, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2));
        } else {
            onWarmupCompleted((List<? extends NestfgetmBinding>) list, i, (Function1<? super String, Unit>) function1, (Map<Integer, pExternalSyntheticLambda1>) map, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        }
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackDefault + 19;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0);
        int i4 = IAuthTabCallbackDefault + 25;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NestfgetmBinding.IAuthTabCallback iAuthTabCallback, pExternalSyntheticLambda1 pexternalsyntheticlambda1, Function1 function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 101;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return onNavigationEvent(iAuthTabCallback, pexternalsyntheticlambda1, function1, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onNavigationEvent(iAuthTabCallback, pexternalsyntheticlambda1, function1, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NestfgetmBinding nestfgetmBinding, ExifDataWhiteBalanceMode exifDataWhiteBalanceMode, float f, Function0 function0, pExternalSyntheticLambda1 pexternalsyntheticlambda1, Function1 function1, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 97;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(nestfgetmBinding, exifDataWhiteBalanceMode, f, function0, pexternalsyntheticlambda1, function1, getsupportedhighspeedresolutions, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 19 / 0;
        }
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(getsupportedhighspeedresolutions, fFloatValue);
        }
        onWarmupCompleted(getsupportedhighspeedresolutions, fFloatValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0);
        int i4 = IAuthTabCallbackDefault + 43;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, zBooleanValue);
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1 = (SurfaceProcessorWithExecutorExternalSyntheticLambda1) objArr[1];
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        long jLongValue = ((Number) objArr[4]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        setContentInsetsRelative setcontentinsetsrelative = (setContentInsetsRelative) objArr[6];
        Function1 function1 = (Function1) objArr[7];
        FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9 = (FocusMeteringControlExternalSyntheticLambda9) objArr[8];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue2 = ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(str, surfaceProcessorWithExecutorExternalSyntheticLambda1, gethumanreadablename, iIntValue, jLongValue, zBooleanValue, setcontentinsetsrelative, function1, focusMeteringControlExternalSyntheticLambda9, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(str, surfaceProcessorWithExecutorExternalSyntheticLambda1, gethumanreadablename, iIntValue, jLongValue, zBooleanValue, setcontentinsetsrelative, function1, focusMeteringControlExternalSyntheticLambda9, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i3 = asInterface + 13;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        KeylinesKtExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted = (KeylinesKtExternalSyntheticLambda1.onWarmupCompleted) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, onwarmupcompleted);
        int i4 = IAuthTabCallbackDefault + 59;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1012042594, new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, 1012042600, iOnExtraCallbackWithResult);
        int i4 = IAuthTabCallbackDefault + 83;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        List list = (List) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        Function1 function1 = (Function1) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(list, iIntValue, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2 | 1));
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 77;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        int iIntValue3 = ((Number) objArr[3]).intValue();
        int iIntValue4 = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue5 = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = asInterface + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(iIntValue, iIntValue2, quirksExternalSyntheticBackport0, iIntValue3, iIntValue4, cameraCaptureResultEmptyCameraCaptureResult, iIntValue5);
        int i4 = asInterface + 79;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(getsupportedhighspeedresolutionsfor);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        int i5 = asInterface + 107;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(int i, int i2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = IAuthTabCallbackDefault + 23;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -976619595, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i3 | 1)), Integer.valueOf(i4)}, 976619615, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i9 = asInterface + 73;
        IAuthTabCallbackDefault = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(Activity activity) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted(activity);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(activity);
        int i3 = IAuthTabCallbackDefault + 53;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, ExifDataWhiteBalanceMode exifDataWhiteBalanceMode, float f, float f2, Function1 function1, boolean z, Function1 function12, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 93;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, exifDataWhiteBalanceMode, f, f2, function1, z, function12, function0, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = asInterface + 89;
        IAuthTabCallbackDefault = i7 % 128;
        int i8 = i7 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(List list, int i, Function1 function1, Map map, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 17;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            IAuthTabCallback(list, i, function1, map, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(list, i, function1, map, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = IAuthTabCallbackDefault + 105;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 35 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(NestfgetmBinding nestfgetmBinding, Function0 function0, Function0 function02, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(nestfgetmBinding, function0, function02, getsupportedhighspeedresolutionsfor);
        int i4 = IAuthTabCallbackDefault + 23;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(NestfgetmBinding nestfgetmBinding, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, boolean z, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, float f, NestfgetmDestroyed nestfgetmDestroyed, ExifDataWhiteBalanceMode exifDataWhiteBalanceMode, Function0 function0, boolean z2, r8lambdac3sIBWhumSTVayX4JnAMsG7PGiA r8lambdac3sibwhumstvayx4jnamsg7pgia, Function0 function02, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, pExternalSyntheticLambda1 pexternalsyntheticlambda1, Function1 function1, FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 57;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(nestfgetmBinding, r8lambdanm9dm2eewl4vrptnjmesfjqky4, z, getsupportedhighspeedresolutionsfor, f, nestfgetmDestroyed, exifDataWhiteBalanceMode, function0, z2, r8lambdac3sibwhumstvayx4jnamsg7pgia, function02, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutions, pexternalsyntheticlambda1, function1, focusMeteringControlExternalSyntheticLambda9, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackDefault + 51;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, NestfgetmBinding nestfgetmBinding, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, boolean z, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, float f, NestfgetmDestroyed nestfgetmDestroyed, ExifDataWhiteBalanceMode exifDataWhiteBalanceMode, Function0 function0, boolean z2, r8lambdac3sIBWhumSTVayX4JnAMsG7PGiA r8lambdac3sibwhumstvayx4jnamsg7pgia, Function0 function02, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, pExternalSyntheticLambda1 pexternalsyntheticlambda1, Function1 function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 59;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, nestfgetmBinding, r8lambdanm9dm2eewl4vrptnjmesfjqky4, z, getsupportedhighspeedresolutionsfor, f, nestfgetmDestroyed, exifDataWhiteBalanceMode, function0, z2, r8lambdac3sibwhumstvayx4jnamsg7pgia, function02, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutions, pexternalsyntheticlambda1, function1, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackDefault + 67;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getsupportedhighspeedresolutions, getsupportedhighspeedresolutionsfor, fliphorizontally);
        int i4 = IAuthTabCallbackDefault + 33;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(setIso setiso, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1079467721, new Object[]{setiso, setorientationdegrees}, 1079467736, iOnExtraCallbackWithResult);
        int i4 = IAuthTabCallbackDefault + 9;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final /* synthetic */ void onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        asInterface(getsupportedhighspeedresolutions, f);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ float onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        float fOnExtraCallback = onExtraCallback(getsupportedhighspeedresolutions);
        int i4 = IAuthTabCallbackDefault + 115;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return fOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int onExtraCallbackWithResult(List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = onWarmupCompleted(list);
        int i4 = IAuthTabCallbackDefault + 79;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return iOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ long onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        long jIAuthTabCallbackDefault = IAuthTabCallbackDefault((getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor);
        int i4 = asInterface + 33;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return jIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent();
        int i3 = asInterface + 39;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 41 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, NestfgetmBinding nestfgetmBinding, pExternalSyntheticLambda1 pexternalsyntheticlambda1, NestfgetmDestroyed nestfgetmDestroyed, boolean z, Function0 function0, Function1 function1, boolean z2, float f, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = asInterface + 113;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(i, nestfgetmBinding, pexternalsyntheticlambda1, nestfgetmDestroyed, z, function0, function1, z2, f, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = asInterface + 105;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Activity activity) {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(activity);
        }
        IAuthTabCallback(activity);
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(String str, float f, ExifDataWhiteBalanceMode exifDataWhiteBalanceMode, Function0 function0, Function1 function1, Function0 function02, Function0 function03, Function1 function12, boolean z, r8lambdac3sIBWhumSTVayX4JnAMsG7PGiA r8lambdac3sibwhumstvayx4jnamsg7pgia, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 109;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(str, f, exifDataWhiteBalanceMode, (Function0<Unit>) function0, (Function1<? super Float, Unit>) function1, (Function0<Unit>) function02, (Function0<Unit>) function03, (Function1<? super Float, Unit>) function12, z, r8lambdac3sibwhumstvayx4jnamsg7pgia, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackDefault + 109;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(List list, getInternalId getinternalid, NestfgetmDestroyed nestfgetmDestroyed, boolean z, Function0 function0, Function1 function1, Map map, float f, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 121;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(list, getinternalid, nestfgetmDestroyed, z, function0, function1, map, f, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = asInterface + 117;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = asInterface + 71;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent((Function0<Unit>) function0, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallbackDefault + 23;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = asInterface + 89;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NestfgetmBinding.IAuthTabCallback iAuthTabCallback, Function1 function1, pExternalSyntheticLambda1 pexternalsyntheticlambda1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(iAuthTabCallback, function1, pexternalsyntheticlambda1);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(iAuthTabCallback, function1, pexternalsyntheticlambda1);
        int i3 = IAuthTabCallbackDefault + 29;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NestfgetmDestroyed nestfgetmDestroyed, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(nestfgetmDestroyed, fliphorizontally);
        if (i3 != 0) {
            int i4 = 16 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static final /* synthetic */ long onNavigationEvent(long j, long j2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(j, j2);
        }
        onWarmupCompleted(j, j2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = i7 | i4;
        int i9 = (~i8) | (~(i7 | i6));
        int i10 = (~((~i6) | i7 | (~i4))) | (~(i5 | i4));
        int i11 = i5 + i4 + i3 + ((-540997959) * i) + (162607451 * i2);
        int i12 = i11 * i11;
        int i13 = ((-612843245) * i5) + 1723858944 + (1667710703 * i4) + (i9 * (-1007206674)) + (1007206674 * i8) + ((-1007206674) * i10) + ((-1620049920) * i3) + ((-672137216) * i) + (483393536 * i2) + (377683968 * i12);
        int i14 = (i5 * 228155117) + 240245784 + (i4 * 228155665) + (i9 * 274) + (i8 * (-274)) + (i10 * 274) + (i3 * 228155391) + (i * (-329950905)) + (i2 * (-2026639707)) + (i12 * 159186944);
        switch (i13 + (i14 * i14 * (-1451425792))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return access100(objArr);
            case 11:
                return getInterfaceDescriptor(objArr);
            case 12:
                return access000(objArr);
            case 13:
                return IAuthTabCallback_Parcel(objArr);
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            case 15:
                return ICustomTabsCallback(objArr);
            case 16:
                return extraCallbackWithResult(objArr);
            case 17:
                return extraCallback(objArr);
            case 18:
                return writeTypedObject(objArr);
            case 19:
                return readTypedObject(objArr);
            case 20:
                return onActivityResized(objArr);
            case 21:
                getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[0];
                float fFloatValue = ((Number) objArr[1]).floatValue();
                int i15 = 2 % 2;
                int i16 = asInterface + 55;
                IAuthTabCallbackDefault = i16 % 128;
                int i17 = i16 % 2;
                getsupportedhighspeedresolutions.onNavigationEvent(fFloatValue);
                int i18 = IAuthTabCallbackDefault + 51;
                asInterface = i18 % 128;
                int i19 = i18 % 2;
                return null;
            case 22:
                return onPostMessage(objArr);
            case 23:
                return onMessageChannelReady(objArr);
            case 24:
                return onMinimized(objArr);
            case 25:
                return onActivityLayout(objArr);
            case 26:
                return onRelationshipValidationResult(objArr);
            case 27:
                return ICustomTabsCallbackStub(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        List list = (List) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        Function1 function1 = (Function1) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(list, iIntValue, function1, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 47;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 79;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackDefault + 91;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 17 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(List list, Map map, NestfgetmDestroyed nestfgetmDestroyed, boolean z, Function0 function0, Function1 function1, getInternalId getinternalid, float f, CameraExecutorExternalSyntheticLambda0 cameraExecutorExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 73;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(list, map, nestfgetmDestroyed, z, function0, function1, getinternalid, f, cameraExecutorExternalSyntheticLambda0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackDefault + 45;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 27 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 115;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 10 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(function1, futures3);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, futures3);
        int i3 = IAuthTabCallbackDefault + 125;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, z);
        int i4 = IAuthTabCallbackDefault + 119;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 73;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackDefault + 107;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(NestfgetmBinding.IAuthTabCallback iAuthTabCallback, pExternalSyntheticLambda1 pexternalsyntheticlambda1, Function1 function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = asInterface + 101;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(iAuthTabCallback, pexternalsyntheticlambda1, (Function1<? super String, Unit>) function1, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallbackDefault + 51;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(NestfgetmDestroyed nestfgetmDestroyed, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1362041004, new Object[]{nestfgetmDestroyed, extensionsManager1}, -1362040986, iOnExtraCallbackWithResult);
        int i4 = asInterface + 1;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(fliphorizontally);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(fliphorizontally);
        int i3 = IAuthTabCallbackDefault + 71;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 87 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, Activity activity, List list, getInternalId getinternalid, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 121;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getsupportedhighspeedresolutions, activity, list, getinternalid, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asInterface + 29;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getsupportedhighspeedresolutionsfor, virtualCameraControlExternalSyntheticLambda1);
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static final /* synthetic */ void onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Long.valueOf(j)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 2145062597, objArr, -2145062581, iOnExtraCallbackWithResult);
        int i4 = IAuthTabCallbackDefault + 97;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        long jLongValue2 = ((Number) objArr[1]).longValue();
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = asInterface + 59;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Pair<Float, Float> pairOnExtraCallback = onExtraCallback(jLongValue, jLongValue2, fFloatValue);
        int i4 = asInterface + 3;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return pairOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onRelationshipValidationResult(Object[] objArr) {
        Activity activity = (Activity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault(activity);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(activity);
        int i3 = asInterface + 17;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static final /* synthetic */ long onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<setUseCaseAttached>) getsupportedhighspeedresolutionsfor);
        }
        IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<setUseCaseAttached>) getsupportedhighspeedresolutionsfor);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        r8lambdac3sIBWhumSTVayX4JnAMsG7PGiA r8lambdac3sibwhumstvayx4jnamsg7pgia = (r8lambdac3sIBWhumSTVayX4JnAMsG7PGiA) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 51;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            throw null;
        }
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, -1825185093, new Object[]{r8lambdac3sibwhumstvayx4jnamsg7pgia, getsupportedhighspeedresolutionsfor}, 1825185097, iOnExtraCallbackWithResult3);
        int i3 = asInterface + 109;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 19 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(float f, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, ExifDataWhiteBalanceMode exifDataWhiteBalanceMode, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(f, getsupportedhighspeedresolutions, exifDataWhiteBalanceMode, setorientationdegrees);
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 73;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1442850232, new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i))}, -1442850224, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
        } else {
            onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1442850232, new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))}, -1442850224, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
        }
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackDefault + 17;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(int i, NestfgetmBinding nestfgetmBinding, pExternalSyntheticLambda1 pexternalsyntheticlambda1, NestfgetmDestroyed nestfgetmDestroyed, boolean z, Function0 function0, Function1 function1, boolean z2, float f, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = asInterface + 3;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -2076895324, new Object[]{Integer.valueOf(i), nestfgetmBinding, pexternalsyntheticlambda1, nestfgetmDestroyed, Boolean.valueOf(z), function0, function1, Boolean.valueOf(z2), Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2))}, 2076895327, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
        } else {
            onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -2076895324, new Object[]{Integer.valueOf(i), nestfgetmBinding, pexternalsyntheticlambda1, nestfgetmDestroyed, Boolean.valueOf(z), function0, function1, Boolean.valueOf(z2), Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1))}, 2076895327, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(List list, getInternalId getinternalid, NestfgetmDestroyed nestfgetmDestroyed, boolean z, Function0 function0, Function1 function1, Map map, float f, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 17;
        IAuthTabCallbackDefault = i4 % 128;
        onNavigationEvent(list, getinternalid, nestfgetmDestroyed, z, function0, function1, map, f, cameraCaptureResultEmptyCameraCaptureResult, i4 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackDefault + 101;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Map map, List list, int i, Function1 function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 99;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            IAuthTabCallback(map, list, i, function1, cameraCaptureResultEmptyCameraCaptureResult, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(map, list, i, function1, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = asInterface + 45;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(function1, r8lambdanm9dm2eewl4vrptnjmesfjqky4, extensionsManager1);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, r8lambdanm9dm2eewl4vrptnjmesfjqky4, extensionsManager1);
        int i3 = asInterface + 115;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NestfgetmDestroyed nestfgetmDestroyed, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(nestfgetmDestroyed, fliphorizontally);
        int i4 = asInterface + 69;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutions, extensionsManager1);
        int i4 = asInterface + 43;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutions, futures3);
        int i4 = asInterface + 27;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, extensionsManager1);
        int i4 = IAuthTabCallbackDefault + 17;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        ExifDataWhiteBalanceMode exifDataWhiteBalanceMode = (ExifDataWhiteBalanceMode) objArr[0];
        setIso setiso = (setIso) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 75;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(exifDataWhiteBalanceMode, setiso);
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        int i5 = asInterface + 49;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    static {
        IAuthTabCallback();
        onExtraCallbackWithResult = new readBomAsCharset("이미지 프리뷰");
        int i = onTransact + 35;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallback;
        Object obj = null;
        if (cArr2 != null) {
            int i3 = $11 + 63;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), Color.rgb(0, 0, 0) + 16777293, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    int i6 = $10 + 73;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 3 % 3;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i8 = $10 + 79;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 75, Color.green(0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i10 = 1052772399;
        if (onNavigationEvent) {
            int i11 = $10 + 15;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i13 = $10 + 125;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i10);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 63, ((Process.getThreadPriority(0) + 20) >> 6) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i10 = 1052772399;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onWarmupCompleted) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            String str = new String(cArr5);
            int i15 = $11 + 67;
            $10 = i15 % 128;
            if (i15 % 2 == 0) {
                objArr[0] = str;
                return;
            } else {
                obj.hashCode();
                throw null;
            }
        }
        int i16 = $11 + 111;
        $10 = i16 % 128;
        int i17 = i16 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i18 = $10 + 11;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 63, 12214 - (KeyEvent.getMaxKeyCode() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    private static final Unit IAuthTabCallback(Map map, List list, int i, Function1 function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        if ((i2 & 3) != 2) {
            int i4 = asInterface + 91;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(769077115, i2, -1, "viva.republica.toss.tosssecurities.MultiImageViewerScreen.<anonymous> (TossSecuritiesMultiImageViewerActivity.kt:233)");
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(348733532);
            int i6 = IAuthTabCallbackDefault + 89;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            for (Map.Entry entry : map.entrySet()) {
                int i8 = IAuthTabCallbackDefault + 89;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                int iIntValue = ((Number) entry.getKey()).intValue();
                pExternalSyntheticLambda1 pexternalsyntheticlambda1 = (pExternalSyntheticLambda1) entry.getValue();
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1283251506, Integer.valueOf(iIntValue));
                RegisterScreenTrackerKt.onExtraCallback(pexternalsyntheticlambda1, (CameraPresenceProviderExternalSyntheticLambda6) null, false, getMHybridDataannotations.onExtraCallbackWithResult.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResult, 3456, 2);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackStub();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            onWarmupCompleted((List<? extends NestfgetmBinding>) list, i, (Function1<? super String, Unit>) function1, (Map<Integer, pExternalSyntheticLambda1>) map, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = asInterface + 17;
        IAuthTabCallbackDefault = i10 % 128;
        if (i10 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[PHI: r3
      0x0045: PHI (r3v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r3v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r3v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002b, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r3
      0x002d: PHI (r3v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r3v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r3v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002b, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(final List<? extends NestfgetmBinding> list, final int i, final Function1<? super String, Unit> function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        Object objOnMinimized;
        Iterator<T> it;
        NestfputmSurfaceIdsWithPendingMountNotification nestfputmSurfaceIdsWithPendingMountNotificationOnWarmupCompleted;
        Object objOnMinimized2;
        int i5;
        int i6 = 2 % 2;
        int i7 = asInterface + 121;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(472398907);
            if ((i2 & 66) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list)) {
                    int i8 = asInterface + 81;
                    IAuthTabCallbackDefault = i8 % 128;
                    i3 = i8 % 2 != 0 ? 5 : 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i2;
            } else {
                i4 = i2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(472398907);
            if ((i2 & 6) == 0) {
            }
        }
        if ((i2 & 48) == 0) {
            int i9 = IAuthTabCallbackDefault + 33;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                int i11 = asInterface + 57;
                IAuthTabCallbackDefault = i11 % 128;
                int i12 = i11 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i2 & 384) == 0) {
            int i13 = asInterface + 13;
            IAuthTabCallbackDefault = i13 % 128;
            if (i13 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1);
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 256 : 128;
        }
        int i14 = 0;
        if ((i4 & 147) != 146) {
            int i15 = IAuthTabCallbackDefault + 17;
            asInterface = i15 % 128;
            int i16 = i15 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            int i17 = IAuthTabCallbackDefault + 1;
            asInterface = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 64 / 0;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i19 = asInterface + 123;
                    IAuthTabCallbackDefault = i19 % 128;
                    int i20 = i19 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(472398907, i4, -1, "viva.republica.toss.tosssecurities.MultiImageViewerScreen (TossSecuritiesMultiImageViewerActivity.kt:222)");
                }
                z2 = (i4 & 14) != 4;
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!z2 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    ArrayList arrayList = new ArrayList();
                    it = list.iterator();
                    while (!(!it.hasNext())) {
                        Object next = it.next();
                        if (i14 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        NestfgetmBinding.IAuthTabCallback iAuthTabCallback = (NestfgetmBinding) next;
                        NestfgetmBinding.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback instanceof NestfgetmBinding.IAuthTabCallback ? iAuthTabCallback : null;
                        Pair pairIAuthTabCallback = (iAuthTabCallback2 == null || (nestfputmSurfaceIdsWithPendingMountNotificationOnWarmupCompleted = iAuthTabCallback2.onWarmupCompleted()) == null) ? null : getWrite.IAuthTabCallback(Integer.valueOf(i14), new pExternalSyntheticLambda1(nestfputmSurfaceIdsWithPendingMountNotificationOnWarmupCompleted.IAuthTabCallback(), (pExternalSyntheticLambda1.IAuthTabCallback) null, (pExternalSyntheticLambda1.onWarmupCompleted) null, (Function0) null, (GeckoHubImp) null, 30, (DefaultConstructorMarker) null));
                        if (pairIAuthTabCallback != null) {
                            int i21 = asInterface + 123;
                            IAuthTabCallbackDefault = i21 % 128;
                            if (i21 % 2 != 0) {
                                arrayList.add(pairIAuthTabCallback);
                                throw null;
                            }
                            arrayList.add(pairIAuthTabCallback);
                        }
                        i14++;
                    }
                    objOnMinimized = access8100.onExtraCallbackWithResult(arrayList);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                final Map map = (Map) objOnMinimized;
                objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new pExternalSyntheticLambda1(BuildConfig.FLAVOR, (pExternalSyntheticLambda1.IAuthTabCallback) null, (pExternalSyntheticLambda1.onWarmupCompleted) null, (Function0) null, (GeckoHubImp) null, 30, (DefaultConstructorMarker) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    int i22 = asInterface + 73;
                    IAuthTabCallbackDefault = i22 % 128;
                    int i23 = i22 % 2;
                }
                setPostviewFormatSelector.onNavigationEvent(pExternalSyntheticLambda2.onExtraCallback().onExtraCallback((pExternalSyntheticLambda1) objOnMinimized2), ForwardingCameraControl.onExtraCallback(769077115, true, new Function2() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj, Object obj2) {
                        return NestfgetmSurfaceIdsWithPendingMountNotification.onWarmupCompleted(map, list, i, function1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
                if ((i4 & 14) != 4) {
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!z2) {
                    ArrayList arrayList2 = new ArrayList();
                    it = list.iterator();
                    while (!(!it.hasNext())) {
                    }
                    objOnMinimized = access8100.onExtraCallbackWithResult(arrayList2);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    final Map map2 = (Map) objOnMinimized;
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    setPostviewFormatSelector.onNavigationEvent(pExternalSyntheticLambda2.onExtraCallback().onExtraCallback((pExternalSyntheticLambda1) objOnMinimized2), ForwardingCameraControl.onExtraCallback(769077115, true, new Function2() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda0
                        public final Object invoke(Object obj, Object obj2) {
                            return NestfgetmSurfaceIdsWithPendingMountNotification.onWarmupCompleted(map2, list, i, function1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return NestfgetmSurfaceIdsWithPendingMountNotification.IAuthTabCallback(list, i, function1, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final int onWarmupCompleted(List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int size = list.size();
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        return size;
    }

    private static final Unit onWarmupCompleted(Activity activity) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 107;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (activity != null) {
            int i5 = i2 + 99;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            activity.finish();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = asInterface + 89;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 27 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(Activity activity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 33;
        asInterface = i3 % 128;
        Window window = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (activity != null) {
            window = activity.getWindow();
        } else {
            int i4 = i2 + 69;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 2;
            }
        }
        if (window != null) {
            new SuspendAnimationKtExternalSyntheticLambda0(window, window.getDecorView()).onExtraCallbackWithResult(WindowInsetsCompat.onTransact.IAuthTabCallbackDefault());
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(NestfgetmDestroyed nestfgetmDestroyed, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, BuildConfig.FLAVOR);
        fliphorizontally.IAuthTabCallbackStub(nestfgetmDestroyed.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 51;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        NestfgetmDestroyed nestfgetmDestroyed = (NestfgetmDestroyed) objArr[0];
        ExtensionsManager1 extensionsManager1 = (ExtensionsManager1) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 103;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            nestfgetmDestroyed.onNavigationEvent((int) extensionsManager1.onExtraCallbackWithResult());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        nestfgetmDestroyed.onNavigationEvent((int) extensionsManager1.onExtraCallbackWithResult());
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackDefault + 111;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    private static final Unit asInterface(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTransact = onTransact((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        if (i3 != 0) {
            zOnTransact = !zOnTransact;
        }
        onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, zOnTransact);
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(getsupportedhighspeedresolutions, (int) extensionsManager1.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 21;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(Activity activity) {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (activity != null) {
            activity.finish();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 109;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, final Activity activity, List list, getInternalId getinternalid, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalgravity, BuildConfig.FLAVOR);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1660547112, i, -1, "viva.republica.toss.tosssecurities.MultiImageViewerContent.<anonymous>.<anonymous>.<anonymous> (TossSecuritiesMultiImageViewerActivity.kt:299)");
        }
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
        PreviewOrientationIncorrectQuirk previewOrientationIncorrectQuirkOnExtraCallback = ZslDisablerQuirk.onExtraCallback(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResult, 6);
        TorchIsClosedAfterImageCapturingQuirk.onExtraCallback onextracallback2 = TorchIsClosedAfterImageCapturingQuirk.Companion;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = UseTorchAsFlashQuirk.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, StillCaptureFlashStopRepeatingQuirk.onExtraCallback(previewOrientationIncorrectQuirkOnExtraCallback, TorchIsClosedAfterImageCapturingQuirk.onExtraCallback(onextracallback2.asInterface(), onextracallback2.IAuthTabCallbackStubProxy())));
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized = new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda14
                public final Object invoke(Object obj) {
                    return NestfgetmSurfaceIdsWithPendingMountNotification.onWarmupCompleted(getsupportedhighspeedresolutions, (ExtensionsManager1) obj);
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback2, (Function1) objOnMinimized);
        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
        Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
            int i3 = asInterface + 125;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            getAwbState.onExtraCallback();
        }
        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            int i5 = asInterface + 117;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 1, (Object) null), onextracallbackwithresult.access100());
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(activity);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(!zOnExtraCallback)) {
            objOnMinimized2 = new Function0() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda15
                public final Object invoke() {
                    return NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallbackWithResult(activity);
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        } else {
            int i7 = asInterface + 97;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
            }
        }
        onNavigationEvent((Function0<Unit>) objOnMinimized2, quirksExternalSyntheticBackport0OnWarmupCompleted2, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
        if (list.size() > 1) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(907721341);
            onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -976619595, new Object[]{Integer.valueOf(getinternalid.IAuthTabCallbackStub()), Integer.valueOf(list.size()), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.IAuthTabCallback_Parcel()), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 1, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, 0, 0}, 976619615, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(908057412);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1442850232, new Object[]{cameraCaptureResultEmptyCameraCaptureResult, 0}, -1442850224, iOnExtraCallbackWithResult);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull final List<? extends NestfgetmBinding> list, final int i, @NotNull final Function1<? super String, Unit> function1, @NotNull final Map<Integer, pExternalSyntheticLambda1> map, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2) {
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        Object objOnMinimized;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        boolean zOnExtraCallback;
        Object objOnMinimized2;
        boolean zOnExtraCallback2;
        Object objOnMinimized3;
        final NestfgetmDestroyed nestfgetmDestroyedOnExtraCallback;
        boolean z;
        Object objOnMinimized4;
        boolean zOnExtraCallback3;
        Object objOnMinimized5;
        boolean zOnExtraCallback4;
        Object objOnMinimized6;
        Object objOnMinimized7;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1001606796);
        if ((i2 & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(map) ? 2048 : 1024;
        }
        int i5 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 1171) != 1170, i5 & 1)) {
            int i6 = IAuthTabCallbackDefault + 21;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1001606796, i5, -1, "viva.republica.toss.tosssecurities.MultiImageViewerContent (TossSecuritiesMultiImageViewerActivity.kt:253)");
            }
            final Activity activity = (Activity) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(prefetchWithMultipleUrls.IAuthTabCallback());
            int iCoerceIn = RangesKt.coerceIn(i, 0, list.size() - 1);
            int i7 = i5 & 14;
            boolean z2 = i7 == 4;
            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!z2) {
                int i8 = asInterface + 99;
                IAuthTabCallbackDefault = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 26 / 0;
                    if (objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized8 = new Function0() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda34
                            public final Object invoke() {
                                return Integer.valueOf(NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallbackWithResult(list));
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized8);
                    }
                    final getInternalId getinternalidOnWarmupCompleted = getCompatibilityId.onWarmupCompleted(iCoerceIn, 0.0f, (Function0) objOnMinimized8, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 2);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(activity);
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnExtraCallback || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized2 = new Function0() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda35
                            public final Object invoke() {
                                return NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallback(activity);
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    }
                    Function0 function0 = (Function0) objOnMinimized2;
                    zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(activity);
                    objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((!zOnExtraCallback2) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized3 = new Function0() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda36
                            public final Object invoke() {
                                Object[] objArr = {activity};
                                int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                                return (Unit) NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1122374554, objArr, 1122374580, iOnExtraCallbackWithResult);
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                    }
                    nestfgetmDestroyedOnExtraCallback = onExtraCallback((Function0<Unit>) function0, (Function0<Unit>) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    if (onTransact((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor) || nestfgetmDestroyedOnExtraCallback.IAuthTabCallbackStub()) {
                        z = false;
                    } else {
                        int i10 = asInterface + 45;
                        IAuthTabCallbackDefault = i10 % 128;
                        int i11 = i10 % 2;
                        z = true;
                    }
                    objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized4 = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                    }
                    final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objOnMinimized4;
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                    zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(nestfgetmDestroyedOnExtraCallback);
                    objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnExtraCallback3 || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized5 = new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda37
                            public final Object invoke(Object obj) {
                                return NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallbackWithResult(nestfgetmDestroyedOnExtraCallback, (flipHorizontally) obj);
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent, (Function1) objOnMinimized5);
                    zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(nestfgetmDestroyedOnExtraCallback);
                    objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnExtraCallback4 || objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized6 = new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda38
                            public final Object invoke(Object obj) {
                                return NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(nestfgetmDestroyedOnExtraCallback, (ExtensionsManager1) obj);
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallback, (Function1) objOnMinimized6), setByteOrder.onExtraCallbackWithResult(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityCallbackDefault(), nestfgetmDestroyedOnExtraCallback.onExtraCallbackWithResult(), 0.0f, 0.0f, 0.0f, 14, (Object) null), (toMetersPerSecond) null, 2, (Object) null);
                    QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        int i12 = IAuthTabCallbackDefault + 97;
                        asInterface = i12 % 128;
                        if (i12 % 2 == 0) {
                            getAwbState.onExtraCallback();
                            int i13 = 41 / 0;
                        } else {
                            getAwbState.onExtraCallback();
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    } else {
                        int i14 = asInterface + 33;
                        IAuthTabCallbackDefault = i14 % 128;
                        int i15 = i14 % 2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                    component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent2);
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                    objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized7 = new Function0() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda39
                            public final Object invoke() {
                                Object[] objArr = {getsupportedhighspeedresolutionsfor};
                                int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                                return (Unit) NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -517904452, objArr, 517904453, iOnExtraCallbackWithResult);
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                    }
                    int i16 = i5 << 9;
                    onNavigationEvent(list, getinternalidOnWarmupCompleted, nestfgetmDestroyedOnExtraCallback, z, (Function0) objOnMinimized7, function1, map, IAuthTabCallback(getsupportedhighspeedresolutions), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i7 | 24576 | (458752 & i16) | (i16 & 3670016));
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    setVerticalGravity.onWarmupCompleted(z, (QuirksExternalSyntheticBackport0) null, ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback((updateFocusedState) null, 0.0f, 3, (Object) null), ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted((updateFocusedState) null, 0.0f, 3, (Object) null), (String) null, ForwardingCameraControl.onExtraCallback(-1660547112, true, new getBacktraceNote() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda40
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(getsupportedhighspeedresolutions, activity, list, getinternalidOnWarmupCompleted, (setHorizontalGravity) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult2, 200064, 18);
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    if (objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    final getInternalId getinternalidOnWarmupCompleted2 = getCompatibilityId.onWarmupCompleted(iCoerceIn, 0.0f, (Function0) objOnMinimized8, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 2);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    }
                    getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(activity);
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnExtraCallback) {
                        objOnMinimized2 = new Function0() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda35
                            public final Object invoke() {
                                return NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallback(activity);
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        Function0 function02 = (Function0) objOnMinimized2;
                        zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(activity);
                        objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!zOnExtraCallback2) {
                            objOnMinimized3 = new Function0() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda36
                                public final Object invoke() {
                                    Object[] objArr = {activity};
                                    int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                                    return (Unit) NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1122374554, objArr, 1122374580, iOnExtraCallbackWithResult);
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                            nestfgetmDestroyedOnExtraCallback = onExtraCallback((Function0<Unit>) function02, (Function0<Unit>) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            if (onTransact((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                                z = false;
                                objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                }
                                final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2 = (getSupportedHighSpeedResolutions) objOnMinimized4;
                                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, 0.0f, 1, (Object) null);
                                zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(nestfgetmDestroyedOnExtraCallback);
                                objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!zOnExtraCallback3) {
                                    objOnMinimized5 = new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda37
                                        public final Object invoke(Object obj) {
                                            return NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallbackWithResult(nestfgetmDestroyedOnExtraCallback, (flipHorizontally) obj);
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent3, (Function1) objOnMinimized5);
                                    zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(nestfgetmDestroyedOnExtraCallback);
                                    objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!zOnExtraCallback4) {
                                        objOnMinimized6 = new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda38
                                            public final Object invoke(Object obj) {
                                                return NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(nestfgetmDestroyedOnExtraCallback, (ExtensionsManager1) obj);
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = verifyDrawable.onExtraCallback(calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallback2, (Function1) objOnMinimized6), setByteOrder.onExtraCallbackWithResult(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityCallbackDefault(), nestfgetmDestroyedOnExtraCallback.onExtraCallbackWithResult(), 0.0f, 0.0f, 0.0f, 14, (Object) null), (toMetersPerSecond) null, 2, (Object) null);
                                        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult3 = QuirkSettingsLoader.Companion;
                                        component5 component5VarOnWarmupCompleted3 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult3.access100(), false);
                                        int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
                                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult22 = toPreviewOnlyRange.Companion;
                                        Function0 function0IAuthTabCallback3 = onextracallbackwithresult22.IAuthTabCallback();
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                        }
                                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted3, onextracallbackwithresult22.asBinder());
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult22.asInterface());
                                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult22.onWarmupCompleted());
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult22.onNavigationEvent());
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult22.onTransact());
                                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent22 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, 0.0f, 1, (Object) null);
                                        component5 component5VarOnWarmupCompleted22 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult3.access100(), false);
                                        int iHashCode22 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted22 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent22);
                                        Function0 function0IAuthTabCallback22 = onextracallbackwithresult22.IAuthTabCallback();
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                        }
                                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, component5VarOnWarmupCompleted22, onextracallbackwithresult22.asBinder());
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22, onextracallbackwithresult22.asInterface());
                                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, Integer.valueOf(iHashCode22), onextracallbackwithresult22.onWarmupCompleted());
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, onextracallbackwithresult22.onNavigationEvent());
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, quirksExternalSyntheticBackport0OnWarmupCompleted22, onextracallbackwithresult22.onTransact());
                                        objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                                        }
                                        int i162 = i5 << 9;
                                        onNavigationEvent(list, getinternalidOnWarmupCompleted2, nestfgetmDestroyedOnExtraCallback, z, (Function0) objOnMinimized7, function1, map, IAuthTabCallback(getsupportedhighspeedresolutions2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i7 | 24576 | (458752 & i162) | (i162 & 3670016));
                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        setVerticalGravity.onWarmupCompleted(z, (QuirksExternalSyntheticBackport0) null, ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback((updateFocusedState) null, 0.0f, 3, (Object) null), ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted((updateFocusedState) null, 0.0f, 3, (Object) null), (String) null, ForwardingCameraControl.onExtraCallback(-1660547112, true, new getBacktraceNote() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda40
                                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                                return NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(getsupportedhighspeedresolutions2, activity, list, getinternalidOnWarmupCompleted2, (setHorizontalGravity) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                            }
                                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult2, 200064, 18);
                                        cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                        cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        }
                                    }
                                }
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
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda41
                public final Object invoke(Object obj, Object obj2) {
                    return NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallback(list, i, function1, map, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Unit onExtraCallback(NestfgetmDestroyed nestfgetmDestroyed, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fliphorizontally, BuildConfig.FLAVOR);
            fliphorizontally.IAuthTabCallbackStubProxy(nestfgetmDestroyed.onExtraCallback());
            fliphorizontally.getInterfaceDescriptor(nestfgetmDestroyed.onExtraCallback());
            fliphorizontally.access000(nestfgetmDestroyed.onTransact());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(fliphorizontally, BuildConfig.FLAVOR);
        fliphorizontally.IAuthTabCallbackStubProxy(nestfgetmDestroyed.onExtraCallback());
        fliphorizontally.getInterfaceDescriptor(nestfgetmDestroyed.onExtraCallback());
        fliphorizontally.access000(nestfgetmDestroyed.onTransact());
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackDefault + 101;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(List list, Map map, NestfgetmDestroyed nestfgetmDestroyed, boolean z, Function0 function0, Function1 function1, getInternalId getinternalid, float f, CameraExecutorExternalSyntheticLambda0 cameraExecutorExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 79;
        IAuthTabCallbackDefault = i4 % 128;
        boolean z2 = false;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(cameraExecutorExternalSyntheticLambda0, BuildConfig.FLAVOR);
            int i5 = 43 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallbackDefault + 109;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1818669348, i2, -1, "viva.republica.toss.tosssecurities.ImagePager.<anonymous> (TossSecuritiesMultiImageViewerActivity.kt:356)");
                int i8 = IAuthTabCallbackDefault + 109;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(cameraExecutorExternalSyntheticLambda0, BuildConfig.FLAVOR);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
        }
        NestfgetmBinding nestfgetmBinding = (NestfgetmBinding) list.get(i);
        pExternalSyntheticLambda1 pexternalsyntheticlambda1 = (pExternalSyntheticLambda1) map.get(Integer.valueOf(i));
        if (getinternalid.mayLaunchUrl() == i) {
            z2 = true;
        } else {
            int i10 = IAuthTabCallbackDefault + 65;
            asInterface = i10 % 128;
            int i11 = i10 % 2;
        }
        Object[] objArr = {Integer.valueOf(i), nestfgetmBinding, pexternalsyntheticlambda1, nestfgetmDestroyed, Boolean.valueOf(z), function0, function1, Boolean.valueOf(z2), Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i2 >> 3) & 14)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -2076895324, objArr, 2076895327, iOnExtraCallbackWithResult);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(final List<? extends NestfgetmBinding> list, final getInternalId getinternalid, final NestfgetmDestroyed nestfgetmDestroyed, final boolean z, final Function0<Unit> function0, final Function1<? super String, Unit> function1, final Map<Integer, pExternalSyntheticLambda1> map, final float f, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean zOnExtraCallback;
        Object objOnMinimized;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1010351429);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list)) {
                int i9 = IAuthTabCallbackDefault + 1;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getinternalid) ^ true) ? 32 : 16;
            int i11 = IAuthTabCallbackDefault + 55;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(nestfgetmDestroyed)) {
                int i13 = IAuthTabCallbackDefault + 29;
                asInterface = i13 % 128;
                i6 = i13 % 2 == 0 ? 28618 : 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 16384 : PKIFailureInfo.certRevoked;
        }
        Object obj = null;
        if ((196608 & i) == 0) {
            int i14 = asInterface + 45;
            IAuthTabCallbackDefault = i14 % 128;
            if (i14 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1);
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i15 = IAuthTabCallbackDefault + 111;
                asInterface = i15 % 128;
                int i16 = i15 % 2;
                i5 = PKIFailureInfo.unsupportedVersion;
            } else {
                i5 = PKIFailureInfo.notAuthorized;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(map)) {
                int i17 = asInterface + 111;
                IAuthTabCallbackDefault = i17 % 128;
                int i18 = i17 % 2;
                i4 = PKIFailureInfo.badCertTemplate;
            } else {
                int i19 = IAuthTabCallbackDefault + 83;
                asInterface = i19 % 128;
                int i20 = i19 % 2;
                i4 = PKIFailureInfo.signerNotTrusted;
            }
            i2 |= i4;
        }
        if ((12582912 & i) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                int i21 = asInterface + 49;
                IAuthTabCallbackDefault = i21 % 128;
                if (i21 % 2 != 0) {
                    throw null;
                }
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i2) != 4793490, i2 & 1)) {
            int i22 = IAuthTabCallbackDefault + 91;
            asInterface = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = 20 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i24 = IAuthTabCallbackDefault + 3;
                    asInterface = i24 % 128;
                    if (i24 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1010351429, i2, -1, "viva.republica.toss.tosssecurities.ImagePager (TossSecuritiesMultiImageViewerActivity.kt:343)");
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1010351429, i2, -1, "viva.republica.toss.tosssecurities.ImagePager (TossSecuritiesMultiImageViewerActivity.kt:343)");
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(nestfgetmDestroyed);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda46
                        public final Object invoke(Object obj2) {
                            return NestfgetmSurfaceIdsWithPendingMountNotification.onWarmupCompleted(nestfgetmDestroyed, (flipHorizontally) obj2);
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent, (Function1) objOnMinimized);
                boolean zIAuthTabCallbackStub = nestfgetmDestroyed.IAuthTabCallbackStub();
                int i25 = (i2 >> 3) & 14;
                AppLovinCommunicator.onExtraCallbackWithResult(getinternalid, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i25);
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                getSurfaceProcessor.IAuthTabCallback(getinternalid, quirksExternalSyntheticBackport0IAuthTabCallback, (DeviceQuirksExternalSyntheticLambda0) null, (CameraEffect) null, 1, 0.0f, (QuirkSettingsLoader.onWarmupCompleted) null, (Camera2CameraImplErrorTimeoutReopenSchedulerScheduleNodeExternalSyntheticLambda1) null, !zIAuthTabCallbackStub, false, (Function1) null, (reverseSize) null, (Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda13) null, (removeChildrenForExpandedActionView) null, ForwardingCameraControl.onExtraCallback(1818669348, true, new setTaggedAddrCtrl() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda47
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        return NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(list, map, nestfgetmDestroyed, z, function0, function1, getinternalid, f, (CameraExecutorExternalSyntheticLambda0) obj2, ((Integer) obj3).intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult2, i25 | 24576, 24576, 16108);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(nestfgetmDestroyed);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!zOnExtraCallback) {
                    objOnMinimized = new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda46
                        public final Object invoke(Object obj2) {
                            return NestfgetmSurfaceIdsWithPendingMountNotification.onWarmupCompleted(nestfgetmDestroyed, (flipHorizontally) obj2);
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent2, (Function1) objOnMinimized);
                    boolean zIAuthTabCallbackStub2 = nestfgetmDestroyed.IAuthTabCallbackStub();
                    int i252 = (i2 >> 3) & 14;
                    AppLovinCommunicator.onExtraCallbackWithResult(getinternalid, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i252);
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    getSurfaceProcessor.IAuthTabCallback(getinternalid, quirksExternalSyntheticBackport0IAuthTabCallback2, (DeviceQuirksExternalSyntheticLambda0) null, (CameraEffect) null, 1, 0.0f, (QuirkSettingsLoader.onWarmupCompleted) null, (Camera2CameraImplErrorTimeoutReopenSchedulerScheduleNodeExternalSyntheticLambda1) null, !zIAuthTabCallbackStub2, false, (Function1) null, (reverseSize) null, (Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda13) null, (removeChildrenForExpandedActionView) null, ForwardingCameraControl.onExtraCallback(1818669348, true, new setTaggedAddrCtrl() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda47
                        public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                            return NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(list, map, nestfgetmDestroyed, z, function0, function1, getinternalid, f, (CameraExecutorExternalSyntheticLambda0) obj2, ((Integer) obj3).intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult2, i252 | 24576, 24576, 16108);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda48
                public final Object invoke(Object obj2, Object obj3) {
                    return NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallbackWithResult(list, getinternalid, nestfgetmDestroyed, z, function0, function1, map, f, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ boolean $isActive;
        final /* synthetic */ Function0<Unit> $resetToInitial;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(boolean z, Function0<Unit> function0, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$isActive = z;
            this.$resetToInitial = function0;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onWarmupCompleted(this.$isActive, this.$resetToInitial, access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (!this.$isActive) {
                this.$resetToInitial.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        r8lambdac3sIBWhumSTVayX4JnAMsG7PGiA r8lambdac3sibwhumstvayx4jnamsg7pgia = (r8lambdac3sIBWhumSTVayX4JnAMsG7PGiA) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 51;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            r8lambdac3sibwhumstvayx4jnamsg7pgia.onWarmupCompleted();
            int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -176230735, new Object[]{getsupportedhighspeedresolutionsfor, true}, 176230752, iOnExtraCallbackWithResult);
        } else {
            r8lambdac3sibwhumstvayx4jnamsg7pgia.onWarmupCompleted();
            int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -176230735, new Object[]{getsupportedhighspeedresolutionsfor, false}, 176230752, iOnExtraCallbackWithResult2);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackDefault + 89;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<Float, Unit> {
        onExtraCallbackWithResult(Object obj) {
            super(1, obj, NestfgetmDestroyed.class, "onDrag", "onDrag(F)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallbackWithResult(((Number) obj).floatValue());
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(float f) {
            ((NestfgetmDestroyed) ((CallableReference) this).receiver).IAuthTabCallback(f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(NestfgetmBinding nestfgetmBinding, Function0 function0, Function0 function02, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        if (!(nestfgetmBinding instanceof NestfgetmBinding.onExtraCallback)) {
            function02.invoke();
            int i2 = IAuthTabCallbackDefault + 43;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = IAuthTabCallbackDefault + 59;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            if (asBinder((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                int i6 = IAuthTabCallbackDefault + 115;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                function0.invoke();
                int i8 = asInterface + 45;
                IAuthTabCallbackDefault = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 5 % 4;
                }
            }
        }
        return Unit.INSTANCE;
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function0<Unit> {
        IAuthTabCallback(Object obj) {
            super(0, obj, NestfgetmDestroyed.class, "dismiss", "dismiss()V", 0);
        }

        public /* synthetic */ Object invoke() {
            onExtraCallback();
            return Unit.INSTANCE;
        }

        public final void onExtraCallback() {
            ((NestfgetmDestroyed) ((CallableReference) this).receiver).onNavigationEvent();
        }
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function0<Unit> {
        onExtraCallback(Object obj) {
            super(0, obj, NestfgetmDestroyed.class, "cancel", "cancel()V", 0);
        }

        public /* synthetic */ Object invoke() {
            onExtraCallback();
            return Unit.INSTANCE;
        }

        public final void onExtraCallback() {
            ((NestfgetmDestroyed) ((CallableReference) this).receiver).IAuthTabCallback();
        }
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {getsupportedhighspeedresolutions, Float.valueOf(f)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        if (i3 == 0) {
            onNavigationEvent(iOnExtraCallbackWithResult3, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -743678870, objArr, 743678893, iOnExtraCallbackWithResult);
            return Unit.INSTANCE;
        }
        onNavigationEvent(iOnExtraCallbackWithResult3, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -743678870, objArr, 743678893, iOnExtraCallbackWithResult);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 123;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit onExtraCallback(NestfgetmBinding nestfgetmBinding, ExifDataWhiteBalanceMode exifDataWhiteBalanceMode, float f, Function0 function0, pExternalSyntheticLambda1 pexternalsyntheticlambda1, Function1 function1, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 35;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalgravity, BuildConfig.FLAVOR);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = asInterface + 25;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-72869774, i, -1, "viva.republica.toss.tosssecurities.ImagePagerPage.<anonymous>.<anonymous>.<anonymous> (TossSecuritiesMultiImageViewerActivity.kt:453)");
                int i6 = 41 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-72869774, i, -1, "viva.republica.toss.tosssecurities.ImagePagerPage.<anonymous>.<anonymous>.<anonymous> (TossSecuritiesMultiImageViewerActivity.kt:453)");
            }
        }
        if (nestfgetmBinding instanceof NestfgetmBinding.onNavigationEvent) {
            int i7 = IAuthTabCallbackDefault + 61;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1308373482);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (i8 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else if (nestfgetmBinding instanceof NestfgetmBinding.onExtraCallback) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1308371351);
            String strIAuthTabCallback = ((NestfgetmBinding.onExtraCallback) nestfgetmBinding).IAuthTabCallback();
            int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            float fFloatValue = ((Float) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1647676303, new Object[]{getsupportedhighspeedresolutions}, -1647676279, iOnExtraCallbackWithResult)).floatValue();
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda24
                    public final Object invoke(Object obj2) {
                        return NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(getsupportedhighspeedresolutionsfor, (VirtualCameraControlExternalSyntheticLambda1) obj2);
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            Function1 function12 = (Function1) objOnMinimized;
            boolean zAsBinder = asBinder((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda25
                    public final Object invoke(Object obj2) {
                        Object[] objArr = {getsupportedhighspeedresolutionsfor2, Boolean.valueOf(((Boolean) obj2).booleanValue())};
                        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                        return (Unit) NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1402338445, objArr, -1402338432, iOnExtraCallbackWithResult2);
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            onExtraCallbackWithResult(strIAuthTabCallback, exifDataWhiteBalanceMode, fFloatValue, f, (Function1<? super VirtualCameraControlExternalSyntheticLambda1, Unit>) function12, zAsBinder, (Function1<? super Boolean, Unit>) objOnMinimized2, (Function0<Unit>) function0, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, (ExifDataWhiteBalanceMode.onWarmupCompleted << 3) | 14180352, 256);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            if (!(nestfgetmBinding instanceof NestfgetmBinding.IAuthTabCallback)) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1308374628);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                throw new NoWhenBranchMatchedException();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1308353721);
            onWarmupCompleted((NestfgetmBinding.IAuthTabCallback) nestfgetmBinding, pexternalsyntheticlambda1, (Function1<? super String, Unit>) function1, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 8);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1>) getsupportedhighspeedresolutionsfor, virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 17;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -176230735, objArr, 176230752, iOnExtraCallbackWithResult);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 115;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(final NestfgetmBinding nestfgetmBinding, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, boolean z, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, float f, NestfgetmDestroyed nestfgetmDestroyed, final ExifDataWhiteBalanceMode exifDataWhiteBalanceMode, final Function0 function0, boolean z2, r8lambdac3sIBWhumSTVayX4JnAMsG7PGiA r8lambdac3sibwhumstvayx4jnamsg7pgia, final Function0 function02, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, final pExternalSyntheticLambda1 pexternalsyntheticlambda1, final Function1 function1, FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(focusMeteringControlExternalSyntheticLambda9, BuildConfig.FLAVOR);
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(focusMeteringControlExternalSyntheticLambda9) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = asInterface + 119;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1161013322, i2, -1, "viva.republica.toss.tosssecurities.ImagePagerPage.<anonymous>.<anonymous> (TossSecuritiesMultiImageViewerActivity.kt:412)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1161013322, i2, -1, "viva.republica.toss.tosssecurities.ImagePagerPage.<anonymous>.<anonymous> (TossSecuritiesMultiImageViewerActivity.kt:412)");
            }
            final float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(focusMeteringControlExternalSyntheticLambda9.onWarmupCompleted() * 0.7f);
            boolean z3 = nestfgetmBinding instanceof NestfgetmBinding.onExtraCallback;
            float fOnNavigationEvent = z3 ? onNavigationEvent((getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1>) getsupportedhighspeedresolutionsfor) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), 0.0f, r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(f), 0.0f, fOnNavigationEvent, 5, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
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
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            String strOnNavigationEvent = nestfgetmBinding.onNavigationEvent();
            float fAsInterface = nestfgetmDestroyed.asInterface();
            ExifDataWhiteBalanceMode exifDataWhiteBalanceMode2 = z3 ? exifDataWhiteBalanceMode : null;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(nestfgetmBinding);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnNavigationEvent || zOnNavigationEvent2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Function0 function03 = new Function0() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda10
                    public final Object invoke() {
                        return NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallback(nestfgetmBinding, function02, function0, getsupportedhighspeedresolutionsfor2);
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function03);
                obj = function03;
            } else {
                obj = objOnMinimized;
            }
            Function0 function04 = (Function0) obj;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nestfgetmDestroyed);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new onExtraCallbackWithResult(nestfgetmDestroyed);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            Function1 function12 = (access5300) objOnMinimized2;
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nestfgetmDestroyed);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback2 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized3 = new IAuthTabCallback(nestfgetmDestroyed);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            Function0 function05 = (access5300) objOnMinimized3;
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nestfgetmDestroyed);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback3 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized4 = new onExtraCallback(nestfgetmDestroyed);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
            }
            Function0 function06 = (access5300) objOnMinimized4;
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized5 = new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda11
                    public final Object invoke(Object obj2) {
                        Object[] objArr = {getsupportedhighspeedresolutions, Float.valueOf(((Float) obj2).floatValue())};
                        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                        return (Unit) NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1613385517, objArr, 1613385526, iOnExtraCallbackWithResult);
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
            }
            onNavigationEvent(strOnNavigationEvent, fAsInterface, exifDataWhiteBalanceMode2, (Function0<Unit>) function04, (Function1<? super Float, Unit>) function12, (Function0<Unit>) function05, (Function0<Unit>) function06, (Function1<? super Float, Unit>) objOnMinimized5, z2, r8lambdac3sibwhumstvayx4jnamsg7pgia, cameraCaptureResultEmptyCameraCaptureResult, (ExifDataWhiteBalanceMode.onWarmupCompleted << 6) | 817889280);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = focusMeteringControlExternalSyntheticLambda9.onWarmupCompleted(onextracallback, onextracallbackwithresult.onWarmupCompleted());
            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                int i5 = asInterface + 39;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted());
                    throw null;
                }
                objOnMinimized6 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
            }
            Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized6;
            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized7 = new Function0() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda12
                    public final Object invoke() {
                        return NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallbackWithResult();
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
            }
            setVerticalGravity.onWarmupCompleted(z, measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, (getSubtitle) null, false, (String) null, (Role) null, (Function0) objOnMinimized7, 28, (Object) null), ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback((updateFocusedState) null, 0.0f, 3, (Object) null), ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted((updateFocusedState) null, 0.0f, 3, (Object) null), (String) null, ForwardingCameraControl.onExtraCallback(-72869774, true, new getBacktraceNote() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda13
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return NestfgetmSurfaceIdsWithPendingMountNotification.IAuthTabCallback(nestfgetmBinding, exifDataWhiteBalanceMode, fIAuthTabCallback, function02, pexternalsyntheticlambda1, function1, getsupportedhighspeedresolutions, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, (setHorizontalGravity) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 200064, 16);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallbackDefault + 99;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final NestfgetmBinding nestfgetmBinding, final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, final boolean z, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final float f, final NestfgetmDestroyed nestfgetmDestroyed, final ExifDataWhiteBalanceMode exifDataWhiteBalanceMode, final Function0 function0, final boolean z2, final r8lambdac3sIBWhumSTVayX4JnAMsG7PGiA r8lambdac3sibwhumstvayx4jnamsg7pgia, final Function0 function02, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, final pExternalSyntheticLambda1 pexternalsyntheticlambda1, final Function1 function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z3;
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 31;
        int i5 = i4 % 128;
        IAuthTabCallbackDefault = i5;
        int i6 = i4 % 2;
        if ((i & 3) != 2) {
            int i7 = i3 + 33;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            z3 = true;
        } else {
            int i9 = i5 + 111;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
            z3 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z3, i & 1)) {
            int i11 = IAuthTabCallbackDefault + 15;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(913336672, i, -1, "viva.republica.toss.tosssecurities.ImagePagerPage.<anonymous> (TossSecuritiesMultiImageViewerActivity.kt:407)");
                int i13 = asInterface + 73;
                IAuthTabCallbackDefault = i13 % 128;
                int i14 = i13 % 2;
            }
            FocusMeteringControlExternalSyntheticLambda8.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null).onExtraCallback(quirksExternalSyntheticBackport0), (QuirkSettingsLoader) null, false, ForwardingCameraControl.onExtraCallback(1161013322, true, new getBacktraceNote() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda43
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallback(nestfgetmBinding, r8lambdanm9dm2eewl4vrptnjmesfjqky4, z, getsupportedhighspeedresolutionsfor, f, nestfgetmDestroyed, exifDataWhiteBalanceMode, function0, z2, r8lambdac3sibwhumstvayx4jnamsg7pgia, function02, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutions, pexternalsyntheticlambda1, function1, (FocusMeteringControlExternalSyntheticLambda9) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
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

    private static final Unit IAuthTabCallback(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = asInterface + 63;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(917899999, i, -1, "viva.republica.toss.tosssecurities.ImagePagerPage.<anonymous> (TossSecuritiesMultiImageViewerActivity.kt:477)");
            }
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i4 = asInterface + 7;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 4;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084 A[PHI: r6
      0x0084: PHI (r6v32 o.CameraCaptureResultEmptyCameraCaptureResult) = (r6v5 o.CameraCaptureResultEmptyCameraCaptureResult), (r6v34 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0072, B:5:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0074 A[PHI: r6
      0x0074: PHI (r6v6 o.CameraCaptureResultEmptyCameraCaptureResult) = (r6v5 o.CameraCaptureResultEmptyCameraCaptureResult), (r6v34 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0072, B:5:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i;
        NestfgetmBinding.IAuthTabCallback iAuthTabCallback;
        Object obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i2;
        final float f;
        final boolean z;
        final Function1 function1;
        final Function0 function0;
        boolean z2;
        NestfgetmDestroyed nestfgetmDestroyed;
        pExternalSyntheticLambda1 pexternalsyntheticlambda1;
        int i3;
        int i4;
        boolean z3;
        Object obj2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        Object obj3;
        Object onwarmupcompleted;
        int i5;
        int i6;
        int i7;
        final int iIntValue = ((Number) objArr[0]).intValue();
        final NestfgetmBinding.IAuthTabCallback iAuthTabCallback2 = (NestfgetmBinding) objArr[1];
        final pExternalSyntheticLambda1 pexternalsyntheticlambda12 = (pExternalSyntheticLambda1) objArr[2];
        final NestfgetmDestroyed nestfgetmDestroyed2 = (NestfgetmDestroyed) objArr[3];
        final boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        Function0 function02 = (Function0) objArr[5];
        Function1 function12 = (Function1) objArr[6];
        boolean zBooleanValue2 = ((Boolean) objArr[7]).booleanValue();
        float fFloatValue = ((Number) objArr[8]).floatValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue2 = ((Number) objArr[10]).intValue();
        int i8 = 2 % 2;
        int i9 = asInterface + 103;
        IAuthTabCallbackDefault = i9 % 128;
        if (i9 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(401142724);
            if ((iIntValue2 & 23) == 0) {
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIntValue) ? 4 : 2) | iIntValue2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i = iIntValue2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(401142724);
            if ((iIntValue2 & 6) == 0) {
            }
        }
        if ((iIntValue2 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iAuthTabCallback2)) {
                int i10 = asInterface + 107;
                IAuthTabCallbackDefault = i10 % 128;
                i7 = i10 % 2 != 0 ? 5 : 32;
            } else {
                i7 = 16;
            }
            i |= i7;
        }
        if ((iIntValue2 & 384) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(pexternalsyntheticlambda12) ? 256 : 128;
        }
        if ((iIntValue2 & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nestfgetmDestroyed2) ? 2048 : 1024;
        }
        if ((iIntValue2 & 24576) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(zBooleanValue) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & iIntValue2) == 0) {
            int i11 = IAuthTabCallbackDefault + 15;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(function02) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        Object obj4 = null;
        if ((1572864 & iIntValue2) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(function12)) {
                int i13 = asInterface + 63;
                IAuthTabCallbackDefault = i13 % 128;
                if (i13 % 2 != 0) {
                    obj4.hashCode();
                    throw null;
                }
                i6 = PKIFailureInfo.badCertTemplate;
            } else {
                i6 = PKIFailureInfo.signerNotTrusted;
            }
            i |= i6;
        }
        if ((12582912 & iIntValue2) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(zBooleanValue2)) {
                int i14 = IAuthTabCallbackDefault + 1;
                asInterface = i14 % 128;
                int i15 = i14 % 2;
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i |= i5;
        }
        if ((100663296 & iIntValue2) == 0) {
            int i16 = IAuthTabCallbackDefault + 97;
            asInterface = i16 % 128;
            int i17 = i16 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fFloatValue) ? 67108864 : 33554432;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((38347923 & i) != 38347922, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i18 = IAuthTabCallbackDefault + 117;
                asInterface = i18 % 128;
                int i19 = i18 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(401142724, i, -1, "viva.republica.toss.tosssecurities.ImagePagerPage (TossSecuritiesMultiImageViewerActivity.kt:381)");
            }
            final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            final ExifDataWhiteBalanceMode exifDataWhiteBalanceModeOnExtraCallbackWithResult = flipVertically.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted2.onExtraCallback()) {
                i3 = iIntValue2;
                i4 = 2;
                objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            } else {
                i3 = iIntValue2;
                i4 = 2;
            }
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted2.onExtraCallback()) {
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, i4, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                int i20 = asInterface + 15;
                IAuthTabCallbackDefault = i20 % 128;
                int i21 = i20 % i4;
                objOnMinimized3 = getsupportedhighspeedresolutionsforOnWarmupCompleted;
            }
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized4 == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized4 = new r8lambdac3sIBWhumSTVayX4JnAMsG7PGiA();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
            }
            final r8lambdac3sIBWhumSTVayX4JnAMsG7PGiA r8lambdac3sibwhumstvayx4jnamsg7pgia = (r8lambdac3sIBWhumSTVayX4JnAMsG7PGiA) objOnMinimized4;
            f = fFloatValue;
            if ((i & 14) == 4) {
                int i22 = asInterface + 33;
                IAuthTabCallbackDefault = i22 % 128;
                int i23 = i22 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!z3)) {
                NestfputmMountNotificationScheduled nestfputmMountNotificationScheduled = new NestfputmMountNotificationScheduled(iIntValue);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(nestfputmMountNotificationScheduled);
                obj2 = nestfputmMountNotificationScheduled;
                NestfputmMountNotificationScheduled nestfputmMountNotificationScheduled2 = (NestfputmMountNotificationScheduled) obj2;
                if (!(iAuthTabCallback2 instanceof NestfgetmBinding.IAuthTabCallback)) {
                    NestfgetmBinding.IAuthTabCallback iAuthTabCallback3 = iAuthTabCallback2;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = iAuthTabCallback3.onWarmupCompleted() != null ? p5.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, nestfputmMountNotificationScheduled2, iAuthTabCallback3.onWarmupCompleted().onWarmupCompleted(), (Function0) null, 4, (Object) null) : QuirksExternalSyntheticBackport0.Companion;
                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport0OnExtraCallback;
                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized6 == onwarmupcompleted2.onExtraCallback()) {
                        objOnMinimized6 = new Function0() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda29
                            public final Object invoke() {
                                Object[] objArr2 = {r8lambdac3sibwhumstvayx4jnamsg7pgia, getsupportedhighspeedresolutionsfor3};
                                int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                                return (Unit) NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -939801846, objArr2, 939801846, iOnExtraCallbackWithResult);
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
                    }
                    final Function0 function03 = (Function0) objOnMinimized6;
                    boolean z4 = (29360128 & i) == 8388608;
                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (z4) {
                        getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor3;
                    } else {
                        int i24 = IAuthTabCallbackDefault + 45;
                        getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor3;
                        asInterface = i24 % 128;
                        if (i24 % 2 == 0) {
                            onwarmupcompleted2.onExtraCallback();
                            throw null;
                        }
                        if (objOnMinimized7 != onwarmupcompleted2.onExtraCallback()) {
                            onwarmupcompleted = objOnMinimized7;
                            obj3 = null;
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(zBooleanValue2), (Function2) onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, (i >> 21) & 14);
                        obj = obj3;
                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4 = getsupportedhighspeedresolutionsfor;
                        int i25 = i3;
                        iAuthTabCallback = iAuthTabCallback2;
                        i2 = i25;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                        z = zBooleanValue2;
                        function1 = function12;
                        function0 = function02;
                        z2 = zBooleanValue;
                        nestfgetmDestroyed = nestfgetmDestroyed2;
                        final EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(913336672, true, new Function2() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda30
                            public final Object invoke(Object obj5, Object obj6) {
                                return NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallback(quirksExternalSyntheticBackport0, iAuthTabCallback2, r8lambdanm9dm2eewl4vrptnjmesfjqky4, zBooleanValue, getsupportedhighspeedresolutionsfor2, f, nestfgetmDestroyed2, exifDataWhiteBalanceModeOnExtraCallbackWithResult, function0, z, r8lambdac3sibwhumstvayx4jnamsg7pgia, function03, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutions, pexternalsyntheticlambda12, function1, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResult2, 54);
                        pexternalsyntheticlambda1 = pexternalsyntheticlambda12;
                        if (pexternalsyntheticlambda1 == null) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1847842082);
                            setPostviewFormatSelector.onNavigationEvent(pExternalSyntheticLambda2.onExtraCallback().onExtraCallback(pexternalsyntheticlambda1), ForwardingCameraControl.onExtraCallback(917899999, true, new Function2() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda31
                                public final Object invoke(Object obj5, Object obj6) {
                                    return NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(encoderProfilesProxyVideoProfileProxyOnExtraCallback, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | 48);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1847937128);
                            encoderProfilesProxyVideoProfileProxyOnExtraCallback.invoke(cameraCaptureResultEmptyCameraCaptureResult2, 6);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                    obj3 = null;
                    onwarmupcompleted = new onWarmupCompleted(zBooleanValue2, function03, null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(onwarmupcompleted);
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(zBooleanValue2), (Function2) onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, (i >> 21) & 14);
                    obj = obj3;
                    final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor42 = getsupportedhighspeedresolutionsfor;
                    int i252 = i3;
                    iAuthTabCallback = iAuthTabCallback2;
                    i2 = i252;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                    z = zBooleanValue2;
                    function1 = function12;
                    function0 = function02;
                    z2 = zBooleanValue;
                    nestfgetmDestroyed = nestfgetmDestroyed2;
                    final Function2 encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(913336672, true, new Function2() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda30
                        public final Object invoke(Object obj5, Object obj6) {
                            return NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallback(quirksExternalSyntheticBackport0, iAuthTabCallback2, r8lambdanm9dm2eewl4vrptnjmesfjqky4, zBooleanValue, getsupportedhighspeedresolutionsfor2, f, nestfgetmDestroyed2, exifDataWhiteBalanceModeOnExtraCallbackWithResult, function0, z, r8lambdac3sibwhumstvayx4jnamsg7pgia, function03, getsupportedhighspeedresolutionsfor42, getsupportedhighspeedresolutions, pexternalsyntheticlambda12, function1, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54);
                    pexternalsyntheticlambda1 = pexternalsyntheticlambda12;
                    if (pexternalsyntheticlambda1 == null) {
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            } else {
                obj2 = objOnMinimized5;
                if (objOnMinimized5 == onwarmupcompleted2.onExtraCallback()) {
                }
                NestfputmMountNotificationScheduled nestfputmMountNotificationScheduled22 = (NestfputmMountNotificationScheduled) obj2;
                if (!(iAuthTabCallback2 instanceof NestfgetmBinding.IAuthTabCallback)) {
                }
            }
        } else {
            iAuthTabCallback = iAuthTabCallback2;
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
            i2 = iIntValue2;
            f = fFloatValue;
            z = zBooleanValue2;
            function1 = function12;
            function0 = function02;
            z2 = zBooleanValue;
            nestfgetmDestroyed = nestfgetmDestroyed2;
            pexternalsyntheticlambda1 = pexternalsyntheticlambda12;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final NestfgetmBinding.IAuthTabCallback iAuthTabCallback4 = iAuthTabCallback;
            final pExternalSyntheticLambda1 pexternalsyntheticlambda13 = pexternalsyntheticlambda1;
            final NestfgetmDestroyed nestfgetmDestroyed3 = nestfgetmDestroyed;
            final boolean z5 = z2;
            final Function0 function04 = function0;
            final Function1 function13 = function1;
            final boolean z6 = z;
            final float f2 = f;
            final int i26 = i2;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda32
                public final Object invoke(Object obj5, Object obj6) {
                    return NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallbackWithResult(iIntValue, iAuthTabCallback4, pexternalsyntheticlambda13, nestfgetmDestroyed3, z5, function04, function13, z6, f2, i26, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                }
            });
        }
        return obj;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ boolean $expanded;
        final /* synthetic */ setContentInsetsRelative $scrollState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(boolean z, setContentInsetsRelative setcontentinsetsrelative, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$expanded = z;
            this.$scrollState = setcontentinsetsrelative;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onNavigationEvent(this.$expanded, this.$scrollState, access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                if (!this.$expanded) {
                    setContentInsetsRelative setcontentinsetsrelative = this.$scrollState;
                    this.label = 1;
                    if (setcontentinsetsrelative.onWarmupCompleted(0, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 59;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_((int) extensionsManager1.onExtraCallbackWithResult())));
            return Unit.INSTANCE;
        }
        function1.invoke(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_((int) extensionsManager1.onExtraCallbackWithResult())));
        int i3 = 96 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(futures3, BuildConfig.FLAVOR);
        Object[] objArr = {getsupportedhighspeedresolutions, Float.valueOf(Float.intBitsToFloat((int) FuturesCallbackListener.onTransact(futures3)))};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 993932184, objArr, -993932163, iOnExtraCallbackWithResult);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 105;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, BuildConfig.FLAVOR);
        fliphorizontally.onExtraCallbackWithResult(RenderEffectKt.IAuthTabCallback(fliphorizontally.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)), fliphorizontally.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)), 0, 4, (Object) null));
        fliphorizontally.onWarmupCompleted(true);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 17;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(Boolean.valueOf(!z));
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 53;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(String str, SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1, getHumanReadableName gethumanreadablename, int i, long j, final boolean z, setContentInsetsRelative setcontentinsetsrelative, final Function1 function1, FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3;
        char c;
        Throwable th;
        hasProvider hasprovider;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(focusMeteringControlExternalSyntheticLambda9, BuildConfig.FLAVOR);
        if ((i2 & 6) == 0) {
            int i6 = IAuthTabCallbackDefault + 51;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 63 / 0;
                i4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(focusMeteringControlExternalSyntheticLambda9) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(focusMeteringControlExternalSyntheticLambda9)) {
            }
            i3 = i2 | i4;
        } else {
            i3 = i2;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1))) {
            int i8 = IAuthTabCallbackDefault + 15;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = asInterface + 85;
                IAuthTabCallbackDefault = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1961963486, i3, -1, "viva.republica.toss.tosssecurities.TextOverlay.<anonymous>.<anonymous>.<anonymous> (TossSecuritiesMultiImageViewerActivity.kt:563)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1961963486, i3, -1, "viva.republica.toss.tosssecurities.TextOverlay.<anonymous>.<anonymous>.<anonymous> (TossSecuritiesMultiImageViewerActivity.kt:563)");
            }
            int iAsInterface = VirtualCameraCaptureResult.asInterface(focusMeteringControlExternalSyntheticLambda9.onNavigationEvent());
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAsInterface);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(surfaceProcessorWithExecutorExternalSyntheticLambda1);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(gethumanreadablename);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i);
            boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(j);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnExtraCallback | zOnNavigationEvent2 | zOnNavigationEvent3 | zOnExtraCallback2 | zOnWarmupCompleted)) {
                int i11 = asInterface + 63;
                IAuthTabCallbackDefault = i11 % 128;
                if (i11 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    throw null;
                }
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    hasProvider hasproviderOnExtraCallbackWithResult = null;
                    if (iAsInterface > 0) {
                        SurfaceProcessorNodeOut surfaceProcessorNodeOutOnWarmupCompleted = SurfaceProcessorWithExecutorExternalSyntheticLambda1.onWarmupCompleted(surfaceProcessorWithExecutorExternalSyntheticLambda1, new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), gethumanreadablename, 0, false, 0, (List) null, r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, iAsInterface, 0, 0, 13, (Object) null), (ExtensionsManagerExtensionsAvailability) null, (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (getSurfaceSize.IAuthTabCallback) null, false, 1980, (Object) null);
                        if (surfaceProcessorNodeOutOnWarmupCompleted.IAuthTabCallbackDefault() <= 3) {
                            hasproviderOnExtraCallbackWithResult = null;
                        } else {
                            float f = iAsInterface - i;
                            int iCoerceIn = RangesKt.coerceIn(surfaceProcessorNodeOutOnWarmupCompleted.IAuthTabCallback(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(surfaceProcessorNodeOutOnWarmupCompleted.onExtraCallback(2)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32))), 0, str.length());
                            if (surfaceProcessorNodeOutOnWarmupCompleted.onExtraCallback(iCoerceIn, true) > f) {
                                iCoerceIn = RangesKt.coerceAtLeast(iCoerceIn - 1, 0);
                                int i12 = asInterface + 89;
                                IAuthTabCallbackDefault = i12 % 128;
                                int i13 = i12 % 2;
                            }
                            hasProvider.IAuthTabCallback iAuthTabCallback = new hasProvider.IAuthTabCallback(0, 1, (DefaultConstructorMarker) null);
                            String strSubstring = str.substring(0, iCoerceIn);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, BuildConfig.FLAVOR);
                            iAuthTabCallback.IAuthTabCallback(strSubstring);
                            iAuthTabCallback.IAuthTabCallback("...");
                            int iOnNavigationEvent = iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(j, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65534, (DefaultConstructorMarker) null));
                            try {
                                iAuthTabCallback.IAuthTabCallback("더보기");
                                Unit unit = Unit.INSTANCE;
                                iAuthTabCallback.onNavigationEvent(iOnNavigationEvent);
                                hasproviderOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
                            } catch (Throwable th2) {
                                iAuthTabCallback.onNavigationEvent(iOnNavigationEvent);
                                throw th2;
                            }
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(hasproviderOnExtraCallbackWithResult);
                    objOnMinimized = hasproviderOnExtraCallbackWithResult;
                }
                hasProvider hasprovider2 = (hasProvider) objOnMinimized;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(quirksExternalSyntheticBackport0.onExtraCallback(!(z ^ true) ? setContentInsetsAbsolute.IAuthTabCallback(quirksExternalSyntheticBackport0, setcontentinsetsrelative, false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null) : quirksExternalSyntheticBackport0), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), 1, (Object) null);
                boolean z2 = hasprovider2 != null;
                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent4 | zOnExtraCallback3)) {
                    Object obj2 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function0 function0 = new Function0() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda28
                            public final Object invoke() {
                                return NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(function1, z);
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                        obj2 = function0;
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = measureChildConstrained.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, z2, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) obj2, 14, (Object) null);
                    if (z || hasprovider2 == null) {
                        c = 2;
                        th = null;
                        hasprovider = new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null);
                    } else {
                        hasprovider = hasprovider2;
                        c = 2;
                        th = null;
                    }
                    Throwable th3 = th;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasprovider, quirksExternalSyntheticBackport0OnExtraCallback, gethumanreadablename, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IPostMessageService_Parcel(), 0L, 0L, (handshake) null, Integer.valueOf(z ? Integer.MAX_VALUE : 3), (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262000);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i14 = asInterface + 17;
                        IAuthTabCallbackDefault = i14 % 128;
                        if (i14 % 2 != 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            th3.hashCode();
                            throw th3;
                        }
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(final String str, final ExifDataWhiteBalanceMode exifDataWhiteBalanceMode, final float f, final float f2, final Function1<? super VirtualCameraControlExternalSyntheticLambda1, Unit> function1, final boolean z, final Function1<? super Boolean, Unit> function12, final Function0<Unit> function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws Throwable {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Object obj;
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions;
        boolean z2;
        final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2;
        final ExifDataWhiteBalanceMode exifDataWhiteBalanceMode2;
        boolean z3;
        boolean z4;
        Object obj2;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1375903220);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(exifDataWhiteBalanceMode) : cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(exifDataWhiteBalanceMode) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i & 12582912) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 8388608 : 4194304;
        }
        int i5 = i2 & 256;
        if (i5 == 0) {
            if ((100663296 & i) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 67108864 : 33554432;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i3) == 38347922, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i5 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1375903220, i3, -1, "viva.republica.toss.tosssecurities.TextOverlay (TossSecuritiesMultiImageViewerActivity.kt:494)");
                }
                final getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                final long jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue();
                final SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback = r8lambdagFq9ZjkYMu6QWJyE7oyeb6idSPU.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!zOnNavigationEvent) {
                    int i6 = IAuthTabCallbackDefault + 45;
                    asInterface = i6 % 128;
                    if (i6 % 2 == 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = Integer.valueOf((int) (SurfaceProcessorWithExecutorExternalSyntheticLambda1.onWarmupCompleted(surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback, new hasProvider("...더보기", (List) null, 2, (DefaultConstructorMarker) null), gethumanreadablename, 0, false, 0, (List) null, 0L, (ExtensionsManagerExtensionsAvailability) null, (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (getSurfaceSize.IAuthTabCallback) null, false, 2044, (Object) null).asBinder() >> 32));
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    final int iIntValue = ((Number) objOnMinimized).intValue();
                    boolean z5 = (i3 & 14) == 4;
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!z5) {
                        Object obj4 = objOnMinimized2;
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            setContentInsetsRelative setcontentinsetsrelative = new setContentInsetsRelative(0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(setcontentinsetsrelative);
                            obj4 = setcontentinsetsrelative;
                        }
                        final setContentInsetsRelative setcontentinsetsrelative2 = (setContentInsetsRelative) obj4;
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized3 = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                        }
                        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions3 = (getSupportedHighSpeedResolutions) objOnMinimized3;
                        boolean z6 = (458752 & i3) == 131072;
                        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setcontentinsetsrelative2);
                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(z6 | zOnNavigationEvent2)) {
                            int i7 = IAuthTabCallbackDefault + 67;
                            asInterface = i7 % 128;
                            if (i7 % 2 == 0) {
                                onwarmupcompleted.onExtraCallback();
                                Object obj5 = null;
                                obj5.hashCode();
                                throw null;
                            }
                            if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                obj = null;
                                objOnMinimized4 = new onNavigationEvent(z, setcontentinsetsrelative2, null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                            } else {
                                obj = null;
                            }
                            isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z), (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 15) & 14);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, 1, obj);
                            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub();
                            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
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
                                int i8 = asInterface + 59;
                                getsupportedhighspeedresolutions = getsupportedhighspeedresolutions3;
                                IAuthTabCallbackDefault = i8 % 128;
                                int i9 = i8 % 2;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                            } else {
                                getsupportedhighspeedresolutions = getsupportedhighspeedresolutions3;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                            if (z) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1941069921);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, onextracallbackwithresult.asBinder()), 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 3, (Object) null);
                                long jIsEngagementSignalsApiAvailable = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).isEngagementSignalsApiAvailable();
                                setViewableMRC50Requests.onWarmupCompleted.IAuthTabCallback iAuthTabCallback = setViewableMRC50Requests.onWarmupCompleted.Companion;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback2, jIsEngagementSignalsApiAvailable, RoundedCornerShapeKt.onNavigationEvent(iAuthTabCallback.onWarmupCompleted().IAuthTabCallbackDefault()));
                                setViewableMRC50Requests.onWarmupCompleted onWarmupCompleted2 = iAuthTabCallback.onWarmupCompleted();
                                long jOnNavigationEvent = y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent();
                                if ((29360128 & i3) == 8388608) {
                                    int i10 = IAuthTabCallbackDefault + 55;
                                    asInterface = i10 % 128;
                                    int i11 = i10 % 2;
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!z4) {
                                    int i12 = asInterface + 97;
                                    IAuthTabCallbackDefault = i12 % 128;
                                    if (i12 % 2 != 0) {
                                        int i13 = 62 / 0;
                                        obj2 = objOnMinimized5;
                                        if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                                            Function0 function02 = new Function0() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda3
                                                public final Object invoke() {
                                                    Object[] objArr = {function0};
                                                    int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                                                    return (Unit) NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1308408009, objArr, 1308408023, iOnExtraCallbackWithResult);
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function02);
                                            obj2 = function02;
                                        }
                                        Object[] objArr = new Object[1];
                                        a(null, null, new byte[]{ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.FILE_IDENTIFIER, ISOFileInfo.LCS_BYTE, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.SECURITY_ATTR_COMPACT, -111, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_EXP, -120, -124, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.FCI_EXT, ISOFileInfo.FILE_IDENTIFIER, -112, -108, -111, -109, ISOFileInfo.SECURITY_ATTR_EXP, -110, -110, ISOFileInfo.FCI_EXT, -111, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_EXP, -119, -120, -122, -112, -113, -122, ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.FILE_IDENTIFIER, -122, -124, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_EXP, -119, -120, -122, ISOFileInfo.SECURITY_ATTR_COMPACT, -120, ISOFileInfo.LCS_BYTE, -124, -124, ISOFileInfo.SECURITY_ATTR_EXP, -126, ISOFileInfo.LCS_BYTE, -119, -120, -126, ISOFileInfo.FCI_EXT, -126, -124, -122, -122, ISOFileInfo.PROP_INFO, -124, ISOFileInfo.FILE_IDENTIFIER, -126, -126, ISOFileInfo.DATA_BYTES2}, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
                                        AppLovinNativeAdImpla.onWarmupCompleted(((String) objArr[0]).intern(), (Function0) obj2, "축소하기", quirksExternalSyntheticBackport0OnExtraCallbackWithResult, onWarmupCompleted2, (setViewableMRC50Requests.onNavigationEvent) null, jOnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24966, 32);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    } else {
                                        obj2 = objOnMinimized5;
                                        if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                                        }
                                        Object[] objArr2 = new Object[1];
                                        a(null, null, new byte[]{ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.FILE_IDENTIFIER, ISOFileInfo.LCS_BYTE, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.SECURITY_ATTR_COMPACT, -111, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_EXP, -120, -124, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.FCI_EXT, ISOFileInfo.FILE_IDENTIFIER, -112, -108, -111, -109, ISOFileInfo.SECURITY_ATTR_EXP, -110, -110, ISOFileInfo.FCI_EXT, -111, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_EXP, -119, -120, -122, -112, -113, -122, ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.FILE_IDENTIFIER, -122, -124, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_EXP, -119, -120, -122, ISOFileInfo.SECURITY_ATTR_COMPACT, -120, ISOFileInfo.LCS_BYTE, -124, -124, ISOFileInfo.SECURITY_ATTR_EXP, -126, ISOFileInfo.LCS_BYTE, -119, -120, -126, ISOFileInfo.FCI_EXT, -126, -124, -122, -122, ISOFileInfo.PROP_INFO, -124, ISOFileInfo.FILE_IDENTIFIER, -126, -126, ISOFileInfo.DATA_BYTES2}, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
                                        AppLovinNativeAdImpla.onWarmupCompleted(((String) objArr2[0]).intern(), (Function0) obj2, "축소하기", quirksExternalSyntheticBackport0OnExtraCallbackWithResult, onWarmupCompleted2, (setViewableMRC50Requests.onNavigationEvent) null, jOnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24966, 32);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    }
                                }
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1941693920);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            }
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
                            if ((57344 & i3) == 16384) {
                                z2 = true;
                            } else {
                                int i14 = asInterface + 101;
                                IAuthTabCallbackDefault = i14 % 128;
                                if (i14 % 2 != 0) {
                                    int i15 = 2 / 4;
                                }
                                z2 = false;
                            }
                            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
                            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if ((z2 | zOnNavigationEvent3) || objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized6 = new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda4
                                    public final Object invoke(Object obj6) {
                                        return NestfgetmSurfaceIdsWithPendingMountNotification.onWarmupCompleted(function1, r8lambdanm9dm2eewl4vrptnjmesfjqky4, (ExtensionsManager1) obj6);
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback3, (Function1) objOnMinimized6);
                            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                                getsupportedhighspeedresolutions2 = getsupportedhighspeedresolutions;
                                objOnMinimized7 = new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda5
                                    public final Object invoke(Object obj6) {
                                        return NestfgetmSurfaceIdsWithPendingMountNotification.onWarmupCompleted(getsupportedhighspeedresolutions2, (Futures3) obj6);
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                            } else {
                                getsupportedhighspeedresolutions2 = getsupportedhighspeedresolutions;
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallbackWithResult2, (Function1) objOnMinimized7);
                            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
                            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                int i16 = IAuthTabCallbackDefault + 21;
                                asInterface = i16 % 128;
                                if (i16 % 2 == 0) {
                                    getAwbState.onExtraCallback();
                                    int i17 = 41 / 0;
                                } else {
                                    getAwbState.onExtraCallback();
                                }
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                int i18 = asInterface + 31;
                                IAuthTabCallbackDefault = i18 % 128;
                                if (i18 % 2 != 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                                    throw null;
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult3 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback.onExtraCallbackWithResult(onextracallback);
                            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized8 = new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda6
                                    public final Object invoke(Object obj6) {
                                        return NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent((flipHorizontally) obj6);
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized8);
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult3, (Function1) objOnMinimized8);
                            boolean z7 = (i3 & 896) == 256;
                            if ((i3 & 112) != 32) {
                                exifDataWhiteBalanceMode2 = exifDataWhiteBalanceMode;
                                z3 = (i3 & 64) != 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(exifDataWhiteBalanceMode2);
                                Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (z7 | z3) {
                                    int i19 = asInterface + 125;
                                    IAuthTabCallbackDefault = i19 % 128;
                                    int i20 = i19 % 2;
                                    if (objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized9 = new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda7
                                            public final Object invoke(Object obj6) {
                                                return NestfgetmSurfaceIdsWithPendingMountNotification.onWarmupCompleted(f, getsupportedhighspeedresolutions2, exifDataWhiteBalanceMode2, (setOrientationDegrees) obj6);
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized9);
                                    }
                                    FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(SessionProcessorSurface.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallback, (Function1) objOnMinimized9), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult4 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).newAuthTabSession(), (toMetersPerSecond) null, 2, (Object) null), 0.0f, f2, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), 0.0f, 2, (Object) null);
                                    PreviewOrientationIncorrectQuirk previewOrientationIncorrectQuirkOnExtraCallback = ZslDisablerQuirk.onExtraCallback(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                    TorchIsClosedAfterImageCapturingQuirk.onExtraCallback onextracallback2 = TorchIsClosedAfterImageCapturingQuirk.Companion;
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    FocusMeteringControlExternalSyntheticLambda8.IAuthTabCallback(UseTorchAsFlashQuirk.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult4, StillCaptureFlashStopRepeatingQuirk.onExtraCallback(previewOrientationIncorrectQuirkOnExtraCallback, TorchIsClosedAfterImageCapturingQuirk.onExtraCallback(onextracallback2.asInterface(), onextracallback2.onWarmupCompleted()))), (QuirkSettingsLoader) null, false, ForwardingCameraControl.onExtraCallback(1961963486, true, new getBacktraceNote() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda8
                                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                            String str2 = str;
                                            SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1 = surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback;
                                            getHumanReadableName gethumanreadablename2 = gethumanreadablename;
                                            int i21 = iIntValue;
                                            long j = jLongValue;
                                            boolean z8 = z;
                                            int iIntValue2 = ((Integer) obj8).intValue();
                                            Object[] objArr3 = {str2, surfaceProcessorWithExecutorExternalSyntheticLambda1, gethumanreadablename2, Integer.valueOf(i21), Long.valueOf(j), Boolean.valueOf(z8), setcontentinsetsrelative2, function12, (FocusMeteringControlExternalSyntheticLambda9) obj6, (CameraCaptureResultEmptyCameraCaptureResult) obj7, Integer.valueOf(iIntValue2)};
                                            int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                                            return (Unit) NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 582768616, objArr3, -582768589, iOnExtraCallbackWithResult);
                                        }
                                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 3072, 6);
                                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                }
                            } else {
                                exifDataWhiteBalanceMode2 = exifDataWhiteBalanceMode;
                            }
                            Object objOnMinimized92 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (z7 | z3) {
                            }
                        }
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda9
                    public final Object invoke(Object obj6, Object obj7) {
                        return NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallback(str, exifDataWhiteBalanceMode, f, f2, function1, z, function12, function0, quirksExternalSyntheticBackport03, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj6, ((Integer) obj7).intValue());
                    }
                });
                return;
            }
            return;
        }
        int i21 = IAuthTabCallbackDefault + 31;
        asInterface = i21 % 128;
        if (i21 % 2 == 0) {
            Object obj6 = null;
            obj6.hashCode();
            throw null;
        }
        i3 |= 100663296;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i3) == 38347922, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit onExtraCallback(NestfgetmBinding.IAuthTabCallback iAuthTabCallback, Function1 function1, pExternalSyntheticLambda1 pexternalsyntheticlambda1) {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            NestfputmSurfaceIdsWithPendingMountNotification nestfputmSurfaceIdsWithPendingMountNotificationOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted();
            if (nestfputmSurfaceIdsWithPendingMountNotificationOnWarmupCompleted != null && pexternalsyntheticlambda1 != null) {
                int i3 = IAuthTabCallbackDefault + 17;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                pexternalsyntheticlambda1.onWarmupCompleted(onExtraCallbackWithResult, nestfputmSurfaceIdsWithPendingMountNotificationOnWarmupCompleted.onExtraCallbackWithResult(), nestfputmSurfaceIdsWithPendingMountNotificationOnWarmupCompleted.onNavigationEvent(), nestfputmSurfaceIdsWithPendingMountNotificationOnWarmupCompleted.onWarmupCompleted());
            }
            function1.invoke(iAuthTabCallback.onExtraCallbackWithResult());
            return Unit.INSTANCE;
        }
        iAuthTabCallback.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull final NestfgetmBinding.IAuthTabCallback iAuthTabCallback, @Nullable final pExternalSyntheticLambda1 pexternalsyntheticlambda1, @NotNull final Function1<? super String, Unit> function1, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-315569259);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(pexternalsyntheticlambda1)) {
                int i6 = asInterface + 99;
                IAuthTabCallbackDefault = i6 % 128;
                i4 = i6 % 2 != 0 ? CertificateBody.profileType : 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ^ true ? 128 : 256;
            int i7 = IAuthTabCallbackDefault + 43;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 3072) == 0) {
                int i10 = IAuthTabCallbackDefault + 35;
                asInterface = i10 % 128;
                int i11 = i10 % 2;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170) {
                int i12 = IAuthTabCallbackDefault + 23;
                asInterface = i12 % 128;
                int i13 = i12 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            } else {
                int i14 = IAuthTabCallbackDefault;
                int i15 = i14 + 115;
                asInterface = i15 % 128;
                int i16 = i15 % 2;
                if (i9 != 0) {
                    int i17 = i14 + 7;
                    asInterface = i17 % 128;
                    int i18 = i17 % 2;
                    quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                } else {
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-315569259, i3, -1, "viva.republica.toss.tosssecurities.VideoThumbnailOverlay (TossSecuritiesMultiImageViewerActivity.kt:611)");
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport03, 0.0f, 1, (Object) null);
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).newAuthTabSession(), (toMetersPerSecond) null, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), 0.0f, 2, (Object) null);
                PreviewOrientationIncorrectQuirk previewOrientationIncorrectQuirkOnExtraCallback = ZslDisablerQuirk.onExtraCallback(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                TorchIsClosedAfterImageCapturingQuirk.onExtraCallback onextracallback = TorchIsClosedAfterImageCapturingQuirk.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = UseTorchAsFlashQuirk.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, StillCaptureFlashStopRepeatingQuirk.onExtraCallback(previewOrientationIncorrectQuirkOnExtraCallback, TorchIsClosedAfterImageCapturingQuirk.onExtraCallback(onextracallback.asInterface(), onextracallback.onWarmupCompleted())));
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault = onextracallbackwithresult.IAuthTabCallbackDefault();
                FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onwarmupcompletedIAuthTabCallbackDefault, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    int i19 = IAuthTabCallbackDefault + 25;
                    asInterface = i19 % 128;
                    int i20 = i19 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                boolean z2 = iAuthTabCallback.onExtraCallbackWithResult().length() > 0;
                boolean z3 = (i3 & 14) == 4;
                boolean z4 = (i3 & 112) == 32;
                boolean z5 = (i3 & 896) == 256;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(z5 | z3 | z4)) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function0 function0 = new Function0() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda16
                            public final Object invoke() {
                                return NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallbackWithResult(iAuthTabCallback, function1, pexternalsyntheticlambda1);
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0);
                        obj = function0;
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(measureChildConstrained.onExtraCallback(onextracallback2, z2, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) obj, 14, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(22.0f), 1, (Object) null);
                    component5 component5VarOnExtraCallback2 = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), onextracallbackwithresult.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
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
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback2, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                    verifyClientState verifyclientstateOnWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-play-fill-mono");
                    long jITrustedWebActivityCallbackStubProxy = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityCallbackStubProxy();
                    deprecated_eventListenerFactory deprecated_eventlistenerfactory = deprecated_eventListenerFactory.Icon;
                    handleNativeAdClick.onExtraCallback.onWarmupCompleted.onExtraCallback onextracallback3 = handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion;
                    setMainImageUri.IAuthTabCallback(verifyclientstateOnWarmupCompleted, deprecated_eventlistenerfactory, (QuirksExternalSyntheticBackport0) null, onextracallback3.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), jITrustedWebActivityCallbackStubProxy, 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3120, 0, 8164);
                    component5 component5VarOnExtraCallback3 = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onextracallbackwithresult.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                    int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback2);
                    Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        int i21 = IAuthTabCallbackDefault + 3;
                        asInterface = i21 % 128;
                        int i22 = i21 % 2;
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                        int i23 = asInterface + 15;
                        IAuthTabCallbackDefault = i23 % 128;
                        int i24 = i23 % 2;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnExtraCallback3, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                    String strOnExtraCallback = iAuthTabCallback.onExtraCallback();
                    AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
                    getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel = appLovinPostbackService.IAuthTabCallback_Parcel();
                    long jITrustedWebActivityCallbackStubProxy2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityCallbackStubProxy();
                    isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallback, null, gethumanreadablenameIAuthTabCallback_Parcel, Long.valueOf(jITrustedWebActivityCallbackStubProxy2), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    component5 component5VarOnExtraCallback4 = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)), onextracallbackwithresult.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                    int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback2);
                    Function0 function0IAuthTabCallback4 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback4);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnExtraCallback4, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult2.onTransact());
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{" · " + iAuthTabCallback.IAuthTabCallback(), null, appLovinPostbackService.IAuthTabCallback_Parcel(), Long.valueOf(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityCallback_Parcel()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled.onTransact(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    setMainImageUri.IAuthTabCallback(deprecated_authenticator.onWarmupCompleted("icon-open-mono"), deprecated_eventlistenerfactory, (QuirksExternalSyntheticBackport0) null, onextracallback3.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityCallback_Parcel(), 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult2, 3120, 0, 8164);
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda17
                    public final Object invoke(Object obj2, Object obj3) {
                        return NestfgetmSurfaceIdsWithPendingMountNotification.IAuthTabCallback(iAuthTabCallback, pexternalsyntheticlambda1, function1, quirksExternalSyntheticBackport02, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        if ((i3 & 1171) == 1170) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 9;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(final Function0<Unit> function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i4 = 2 % 2;
        int i5 = asInterface + 25;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1544737196);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
                int i8 = asInterface + 119;
                IAuthTabCallbackDefault = i8 % 128;
                int i9 = i8 % 2;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) == 18, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            } else {
                Object obj = null;
                if (i7 != 0) {
                    int i10 = IAuthTabCallbackDefault + 101;
                    asInterface = i10 % 128;
                    if (i10 % 2 == 0) {
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        obj.hashCode();
                        throw null;
                    }
                    quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                } else {
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i11 = IAuthTabCallbackDefault + 101;
                    asInterface = i11 % 128;
                    int i12 = i11 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1544737196, i3, -1, "viva.republica.toss.tosssecurities.CloseButton (TossSecuritiesMultiImageViewerActivity.kt:683)");
                }
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport03, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityService(), RoundedCornerShapeKt.onWarmupCompleted()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f));
                boolean z = (i3 & 14) == 4;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!z) {
                    int i13 = IAuthTabCallbackDefault + 17;
                    asInterface = i13 % 128;
                    if (i13 % 2 == 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        obj.hashCode();
                        throw null;
                    }
                    Object obj2 = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function0 function02 = new Function0() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda26
                            public final Object invoke() {
                                return NestfgetmSurfaceIdsWithPendingMountNotification.IAuthTabCallback(function0);
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function02);
                        obj2 = function02;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                    setMainImageUri.IAuthTabCallback(OkHttpClient.onExtraCallback(OkHttp.onExtraCallback), deprecated_eventListenerFactory.Icon, measureChildConstrained.onExtraCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) obj2, 15, (Object) null), handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityCallbackStubProxy(), 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult2, 3120, 0, 8160);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda27
                    public final Object invoke(Object obj3, Object obj4) {
                        return NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(function0, quirksExternalSyntheticBackport02, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) == 18, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        int i;
        int i2;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i4;
        int i5;
        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        int i6;
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (QuirksExternalSyntheticBackport0) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue3 = ((Number) objArr[4]).intValue();
        final int iIntValue4 = ((Number) objArr[5]).intValue();
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(-661859748);
        if ((iIntValue3 & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIntValue) ? 4 : 2) | iIntValue3;
        } else {
            i = iIntValue3;
        }
        if ((iIntValue3 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIntValue2)) {
                int i8 = asInterface + 71;
                IAuthTabCallbackDefault = i8 % 128;
                int i9 = i8 % 2;
                i6 = 32;
            } else {
                i6 = 16;
            }
            i |= i6;
        }
        int i10 = iIntValue4 & 4;
        if (i10 != 0) {
            i |= 384;
        } else if ((iIntValue3 & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2)) {
                i2 = 256;
            } else {
                int i11 = asInterface + 59;
                IAuthTabCallbackDefault = i11 % 128;
                int i12 = i11 % 2;
                i2 = 128;
            }
            i |= i2;
        }
        Object obj = null;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i & 147) != 146, i & 1)) {
            int i13 = asInterface + 49;
            int i14 = i13 % 128;
            IAuthTabCallbackDefault = i14;
            if (i13 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (i10 != 0) {
                int i15 = i14 + 55;
                asInterface = i15 % 128;
                int i16 = i15 % 2;
                onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = onextracallback2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-661859748, i, -1, "viva.republica.toss.tosssecurities.PageIndicator (TossSecuritiesMultiImageViewerActivity.kt:701)");
            }
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i5 = iIntValue3;
            i3 = iIntValue2;
            i4 = iIntValue;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{(iIntValue + 1) + " / " + iIntValue2, onextracallback3, getHumanReadableName.onNavigationEvent(AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityCallbackStubProxy(), 0L, GraphicDeviceInfo.Companion.asBinder(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null), 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i >> 3) & 112), 0, 131064}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            onextracallback = onextracallback3;
        } else {
            i3 = iIntValue2;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i4 = iIntValue;
            i5 = iIntValue3;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            onextracallback = onextracallback2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final int i17 = i4;
            final int i18 = i3;
            final int i19 = i5;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda42
                public final Object invoke(Object obj2, Object obj3) {
                    int i20 = i17;
                    int i21 = i18;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = onextracallback;
                    int i22 = i19;
                    int i23 = iIntValue4;
                    int iIntValue5 = ((Integer) obj3).intValue();
                    Object[] objArr2 = {Integer.valueOf(i20), Integer.valueOf(i21), quirksExternalSyntheticBackport0, Integer.valueOf(i22), Integer.valueOf(i23), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue5)};
                    int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                    return (Unit) NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -630281308, objArr2, 630281333, iOnExtraCallbackWithResult);
                }
            });
        }
        int i20 = asInterface + 33;
        IAuthTabCallbackDefault = i20 % 128;
        if (i20 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final NestfgetmDestroyed onExtraCallback(Function0<Unit> function0, Function0<Unit> function02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 89;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallbackDefault + 59;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-577620504, i, -1, "viva.republica.toss.tosssecurities.rememberDismissState (TossSecuritiesMultiImageViewerActivity.kt:716)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-577620504, i, -1, "viva.republica.toss.tosssecurities.rememberDismissState (TossSecuritiesMultiImageViewerActivity.kt:716)");
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized;
        float fOnExtraCallback = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(100.0f));
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function0, cameraCaptureResultEmptyCameraCaptureResult, i & 14);
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function02, cameraCaptureResultEmptyCameraCaptureResult, (i >> 3) & 14);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(findresandmsg);
        boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fOnExtraCallback);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent | zIAuthTabCallback) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized2 = new NestfgetmDestroyed(findresandmsg, fOnExtraCallback, new Function0() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda44
                public final Object invoke() {
                    Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback};
                    int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                    return (Unit) NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -815990594, objArr, 815990604, iOnExtraCallbackWithResult);
                }
            }, new Function0() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda45
                public final Object invoke() {
                    return NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2);
                }
            });
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        NestfgetmDestroyed nestfgetmDestroyed = (NestfgetmDestroyed) objOnMinimized2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = asInterface + 27;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return nestfgetmDestroyed;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Unit unit;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<? extends Function0<Unit>>) cameraPresenceProviderExternalSyntheticLambda6).invoke();
        if (i3 == 0) {
            unit = Unit.INSTANCE;
            int i4 = 36 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i5 = asInterface + 117;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onTransact(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<? extends Function0<Unit>>) cameraPresenceProviderExternalSyntheticLambda6).invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 65;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        final int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = asInterface + 49;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(494988882);
        if (iIntValue != 0) {
            int i4 = IAuthTabCallbackDefault + 77;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, iIntValue & 1)) {
            int i6 = asInterface + 9;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(494988882, iIntValue, -1, "viva.republica.toss.tosssecurities.TopGradient (TossSecuritiesMultiImageViewerActivity.kt:791)");
            }
            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(setMaxAdCount.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(120.0f)), new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(ByteOrderedDataOutputStream.onExtraCallbackWithResult(2382364672L))), getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(ByteOrderedDataOutputStream.onExtraCallbackWithResult(4278190080L), 0.0f)))}, 90.0f, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 390, 4), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda2
                public final Object invoke(Object obj, Object obj2) {
                    return NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            });
        }
        return null;
    }

    public static final class asBinder implements PointerInputEventHandler {
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<setUseCaseAttached> IAuthTabCallback;
        final /* synthetic */ getSupportedHighSpeedResolutions onNavigationEvent;
        final /* synthetic */ Function0<Unit> onWarmupCompleted;

        asBinder(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutionsFor<setUseCaseAttached> getsupportedhighspeedresolutionsfor, Function0<Unit> function0) {
            this.onNavigationEvent = getsupportedhighspeedresolutions;
            this.IAuthTabCallback = getsupportedhighspeedresolutionsfor;
            this.onWarmupCompleted = function0;
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = this.onNavigationEvent;
            final getSupportedHighSpeedResolutionsFor<setUseCaseAttached> getsupportedhighspeedresolutionsfor = this.IAuthTabCallback;
            Function1 function1 = new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$ZoomableAsyncImage$1$1$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return NestfgetmSurfaceIdsWithPendingMountNotification.asBinder.onNavigationEvent(getsupportedhighspeedresolutions, getsupportedhighspeedresolutionsfor, (setUseCaseAttached) obj);
                }
            };
            final Function0<Unit> function0 = this.onWarmupCompleted;
            Object objOnNavigationEvent = Camera2CameraInfoImplExternalSyntheticLambda0.onNavigationEvent(highPriorityExecutor, function1, (Function1) null, (getBacktraceNote) null, new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$ZoomableAsyncImage$1$1$$ExternalSyntheticLambda1
                public final Object invoke(Object obj) {
                    return NestfgetmSurfaceIdsWithPendingMountNotification.asBinder.onExtraCallback(function0, (setUseCaseAttached) obj);
                }
            }, access13800Var, 6, (Object) null);
            return objOnNavigationEvent == access14300.onWarmupCompleted() ? objOnNavigationEvent : Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onExtraCallback(Function0 function0, setUseCaseAttached setusecaseattached) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, setUseCaseAttached setusecaseattached) {
            if (NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallbackWithResult(getsupportedhighspeedresolutions) > 1.0f) {
                NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallback(getsupportedhighspeedresolutions, 1.0f);
                NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(getsupportedhighspeedresolutionsfor, setUseCaseAttached.Companion.IAuthTabCallback());
            } else {
                NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallback(getsupportedhighspeedresolutions, 2.0f);
            }
            return Unit.INSTANCE;
        }
    }

    static final class onTransact implements PointerInputEventHandler {
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<ExtensionsManager1> IAuthTabCallback;
        final /* synthetic */ Function0<Unit> IAuthTabCallbackDefault;
        final /* synthetic */ getSupportedHighSpeedResolutions asBinder;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<setUseCaseAttached> onExtraCallback;
        final /* synthetic */ Function0<Unit> onExtraCallbackWithResult;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<setUseCaseDetached> onNavigationEvent;
        final /* synthetic */ Function1<Float, Unit> onTransact;
        final /* synthetic */ float onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        onTransact(Function1<? super Float, Unit> function1, float f, Function0<Unit> function0, Function0<Unit> function02, getSupportedHighSpeedResolutionsFor<setUseCaseDetached> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<ExtensionsManager1> getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutionsFor<setUseCaseAttached> getsupportedhighspeedresolutionsfor3) {
            this.onTransact = function1;
            this.onWarmupCompleted = f;
            this.onExtraCallbackWithResult = function0;
            this.IAuthTabCallbackDefault = function02;
            this.onNavigationEvent = getsupportedhighspeedresolutionsfor;
            this.IAuthTabCallback = getsupportedhighspeedresolutionsfor2;
            this.asBinder = getsupportedhighspeedresolutions;
            this.onExtraCallback = getsupportedhighspeedresolutionsfor3;
        }

        /* renamed from: o.NestfgetmSurfaceIdsWithPendingMountNotification$onTransact$3, reason: invalid class name */
        static final class AnonymousClass3 extends RestrictedSuspendLambda implements Function2<AudioExecutor1, access13800<? super Unit>, Object> {
            final /* synthetic */ getSupportedHighSpeedResolutionsFor<ExtensionsManager1> $containerSize$delegate;
            final /* synthetic */ float $dismissThreshold;
            final /* synthetic */ getSupportedHighSpeedResolutionsFor<setUseCaseDetached> $imageIntrinsicSize$delegate;
            final /* synthetic */ getSupportedHighSpeedResolutionsFor<setUseCaseAttached> $offset$delegate;
            final /* synthetic */ Function0<Unit> $onDismiss;
            final /* synthetic */ Function0<Unit> $onDismissCancel;
            final /* synthetic */ Function1<Float, Unit> $onDismissDrag;
            final /* synthetic */ getSupportedHighSpeedResolutions $scale$delegate;
            long J$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(Function1<? super Float, Unit> function1, float f, Function0<Unit> function0, Function0<Unit> function02, getSupportedHighSpeedResolutionsFor<setUseCaseDetached> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<ExtensionsManager1> getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutionsFor<setUseCaseAttached> getsupportedhighspeedresolutionsfor3, access13800<? super AnonymousClass3> access13800Var) {
                super(2, access13800Var);
                this.$onDismissDrag = function1;
                this.$dismissThreshold = f;
                this.$onDismiss = function0;
                this.$onDismissCancel = function02;
                this.$imageIntrinsicSize$delegate = getsupportedhighspeedresolutionsfor;
                this.$containerSize$delegate = getsupportedhighspeedresolutionsfor2;
                this.$scale$delegate = getsupportedhighspeedresolutions;
                this.$offset$delegate = getsupportedhighspeedresolutionsfor3;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$onDismissDrag, this.$dismissThreshold, this.$onDismiss, this.$onDismissCancel, this.$imageIntrinsicSize$delegate, this.$containerSize$delegate, this.$scale$delegate, this.$offset$delegate, access13800Var);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AudioExecutor1 audioExecutor1, access13800<? super Unit> access13800Var) {
                return create(audioExecutor1, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
            
                if (o.Camera2CameraInfoImplExternalSyntheticLambda0.onWarmupCompleted(r7, false, (o.createPostFailedException) null, r24, 2, (java.lang.Object) null) != r8) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x00a6, code lost:
            
                if (r12 == r8) goto L91;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x02ab, code lost:
            
                return r8;
             */
            /* JADX WARN: Removed duplicated region for block: B:88:0x02a3  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00a6 -> B:16:0x00aa). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                long jOnNavigationEvent;
                createIntBufferBatchMountItem createintbufferbatchmountitem;
                transformAsync transformasync;
                PerfMonitorOverlayViewExternalSyntheticLambda0 perfMonitorOverlayViewExternalSyntheticLambda0;
                getInteropUIBlockListener getinteropuiblocklistener;
                Object objOnExtraCallback;
                transformAsync transformasync2;
                long j;
                AudioExecutor1 audioExecutor1 = (AudioExecutor1) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                int i2 = 2;
                createPostFailedException createpostfailedexception = null;
                int i3 = 1;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    this.L$0 = audioExecutor1;
                    this.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jOnNavigationEvent = this.J$0;
                        transformasync = (transformAsync) this.L$4;
                        getinteropuiblocklistener = (getInteropUIBlockListener) this.L$3;
                        perfMonitorOverlayViewExternalSyntheticLambda0 = (PerfMonitorOverlayViewExternalSyntheticLambda0) this.L$2;
                        createintbufferbatchmountitem = (createIntBufferBatchMountItem) this.L$1;
                        ResultKt.onNavigationEvent(obj);
                        objOnExtraCallback = obj;
                        newHandlerExecutor newhandlerexecutor = (newHandlerExecutor) objOnExtraCallback;
                        float fIAuthTabCallback = get.IAuthTabCallback(newhandlerexecutor);
                        long jOnExtraCallback = get.onExtraCallback(newhandlerexecutor);
                        for (HandlerScheduledExecutorService2 handlerScheduledExecutorService2 : newhandlerexecutor.onExtraCallbackWithResult()) {
                            transformasync.IAuthTabCallback(handlerScheduledExecutorService2.IAuthTabCallbackStubProxy(), handlerScheduledExecutorService2.IAuthTabCallback());
                            jOnExtraCallback = jOnExtraCallback;
                            jOnNavigationEvent = jOnNavigationEvent;
                        }
                        long j2 = jOnNavigationEvent;
                        long j3 = jOnExtraCallback;
                        i2 = 2;
                        if (newhandlerexecutor.onExtraCallbackWithResult().size() >= 2) {
                            if (perfMonitorOverlayViewExternalSyntheticLambda0.IAuthTabCallback()) {
                                perfMonitorOverlayViewExternalSyntheticLambda0.onWarmupCompleted();
                                this.$onDismissDrag.invoke(access14000.onExtraCallbackWithResult(0.0f));
                            }
                            Pair<Float, setUseCaseAttached> pairOnExtraCallbackWithResult = createintbufferbatchmountitem.onExtraCallbackWithResult(fIAuthTabCallback, j3, NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallbackWithResult(this.$scale$delegate), NestfgetmSurfaceIdsWithPendingMountNotification.onWarmupCompleted(this.$offset$delegate));
                            float fFloatValue = ((Number) pairOnExtraCallbackWithResult.onExtraCallbackWithResult()).floatValue();
                            long jOnExtraCallback2 = ((setUseCaseAttached) pairOnExtraCallbackWithResult.IAuthTabCallback()).onExtraCallback();
                            NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallback(this.$scale$delegate, fFloatValue);
                            NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(this.$offset$delegate, jOnExtraCallback2);
                            for (HandlerScheduledExecutorService2 handlerScheduledExecutorService22 : newhandlerexecutor.onExtraCallbackWithResult()) {
                                if (DirectExecutor.IAuthTabCallbackStub(handlerScheduledExecutorService22)) {
                                    handlerScheduledExecutorService22.onExtraCallback();
                                }
                            }
                            transformasync2 = transformasync;
                        } else {
                            if (NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallbackWithResult(this.$scale$delegate) <= 1.0f) {
                                transformasync2 = transformasync;
                                j = j3;
                                if (!setUseCaseAttached.onWarmupCompleted(j, setUseCaseAttached.Companion.IAuthTabCallback()) && !perfMonitorOverlayViewExternalSyntheticLambda0.onNavigationEvent()) {
                                    if (perfMonitorOverlayViewExternalSyntheticLambda0.onWarmupCompleted(j)) {
                                        this.$onDismissDrag.invoke(access14000.onExtraCallbackWithResult(perfMonitorOverlayViewExternalSyntheticLambda0.onExtraCallback()));
                                        for (HandlerScheduledExecutorService2 handlerScheduledExecutorService23 : newhandlerexecutor.onExtraCallbackWithResult()) {
                                            if (DirectExecutor.IAuthTabCallbackStub(handlerScheduledExecutorService23)) {
                                                handlerScheduledExecutorService23.onExtraCallback();
                                            }
                                        }
                                    }
                                }
                            } else {
                                transformasync2 = transformasync;
                                j = j3;
                            }
                            if (!perfMonitorOverlayViewExternalSyntheticLambda0.IAuthTabCallback()) {
                                if (NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallbackWithResult(this.$scale$delegate) > 1.0f && !setUseCaseAttached.onWarmupCompleted(j, setUseCaseAttached.Companion.IAuthTabCallback())) {
                                    setUseCaseAttached setusecaseattachedOnWarmupCompleted = getinteropuiblocklistener.onWarmupCompleted(j, NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallbackWithResult(this.$scale$delegate), NestfgetmSurfaceIdsWithPendingMountNotification.onWarmupCompleted(this.$offset$delegate));
                                    if (setusecaseattachedOnWarmupCompleted != null) {
                                        NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(this.$offset$delegate, setusecaseattachedOnWarmupCompleted.onExtraCallback());
                                        for (HandlerScheduledExecutorService2 handlerScheduledExecutorService24 : newhandlerexecutor.onExtraCallbackWithResult()) {
                                            if (DirectExecutor.IAuthTabCallbackStub(handlerScheduledExecutorService24)) {
                                                handlerScheduledExecutorService24.onExtraCallback();
                                            }
                                        }
                                    }
                                    if (perfMonitorOverlayViewExternalSyntheticLambda0.IAuthTabCallback() && perfMonitorOverlayViewExternalSyntheticLambda0.onExtraCallback() > 0.0f) {
                                        long jIAuthTabCallback = transformasync2.IAuthTabCallback();
                                        if (perfMonitorOverlayViewExternalSyntheticLambda0.onExtraCallback() <= this.$dismissThreshold || (((int) NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallbackWithResult(this.$containerSize$delegate)) > 0 && RequestOptionConfig1.IAuthTabCallback(jIAuthTabCallback) > ((int) NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallbackWithResult(this.$containerSize$delegate)))) {
                                            this.$onDismiss.invoke();
                                        } else {
                                            this.$onDismissCancel.invoke();
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                                this.L$0 = audioExecutor1;
                                this.L$1 = createintbufferbatchmountitem;
                                this.L$2 = perfMonitorOverlayViewExternalSyntheticLambda0;
                                this.L$3 = getinteropuiblocklistener;
                                this.L$4 = transformasync;
                                this.J$0 = jOnNavigationEvent;
                                this.label = i2;
                                objOnExtraCallback = AudioExecutor1.onExtraCallback(audioExecutor1, createpostfailedexception, this, i3, createpostfailedexception);
                            } else {
                                perfMonitorOverlayViewExternalSyntheticLambda0.IAuthTabCallback(j);
                                this.$onDismissDrag.invoke(access14000.onExtraCallbackWithResult(perfMonitorOverlayViewExternalSyntheticLambda0.onExtraCallback()));
                                for (HandlerScheduledExecutorService2 handlerScheduledExecutorService25 : newhandlerexecutor.onExtraCallbackWithResult()) {
                                    if (DirectExecutor.IAuthTabCallbackStub(handlerScheduledExecutorService25)) {
                                        handlerScheduledExecutorService25.onExtraCallback();
                                    }
                                }
                            }
                        }
                        List listOnExtraCallbackWithResult = newhandlerexecutor.onExtraCallbackWithResult();
                        if (!(listOnExtraCallbackWithResult instanceof Collection) || !listOnExtraCallbackWithResult.isEmpty()) {
                            Iterator it = listOnExtraCallbackWithResult.iterator();
                            while (it.hasNext()) {
                                if (((HandlerScheduledExecutorService2) it.next()).IAuthTabCallbackStub()) {
                                    transformasync = transformasync2;
                                    jOnNavigationEvent = j2;
                                    createpostfailedexception = null;
                                    i3 = 1;
                                    this.L$0 = audioExecutor1;
                                    this.L$1 = createintbufferbatchmountitem;
                                    this.L$2 = perfMonitorOverlayViewExternalSyntheticLambda0;
                                    this.L$3 = getinteropuiblocklistener;
                                    this.L$4 = transformasync;
                                    this.J$0 = jOnNavigationEvent;
                                    this.label = i2;
                                    objOnExtraCallback = AudioExecutor1.onExtraCallback(audioExecutor1, createpostfailedexception, this, i3, createpostfailedexception);
                                }
                            }
                        }
                        if (perfMonitorOverlayViewExternalSyntheticLambda0.IAuthTabCallback()) {
                            long jIAuthTabCallback2 = transformasync2.IAuthTabCallback();
                            if (perfMonitorOverlayViewExternalSyntheticLambda0.onExtraCallback() <= this.$dismissThreshold) {
                                this.$onDismiss.invoke();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                jOnNavigationEvent = NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(NestfgetmSurfaceIdsWithPendingMountNotification.IAuthTabCallback(this.$imageIntrinsicSize$delegate), NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallbackWithResult(this.$containerSize$delegate));
                DefaultConstructorMarker defaultConstructorMarker = null;
                createIntBufferBatchMountItem createintbufferbatchmountitem2 = new createIntBufferBatchMountItem(NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallbackWithResult(this.$containerSize$delegate), jOnNavigationEvent, defaultConstructorMarker);
                PerfMonitorOverlayViewExternalSyntheticLambda0 perfMonitorOverlayViewExternalSyntheticLambda02 = new PerfMonitorOverlayViewExternalSyntheticLambda0(NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallbackWithResult(this.$containerSize$delegate), null);
                getInteropUIBlockListener getinteropuiblocklistener2 = new getInteropUIBlockListener(NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallbackWithResult(this.$containerSize$delegate), jOnNavigationEvent, defaultConstructorMarker);
                createintbufferbatchmountitem = createintbufferbatchmountitem2;
                transformasync = new transformAsync();
                perfMonitorOverlayViewExternalSyntheticLambda0 = perfMonitorOverlayViewExternalSyntheticLambda02;
                getinteropuiblocklistener = getinteropuiblocklistener2;
                this.L$0 = audioExecutor1;
                this.L$1 = createintbufferbatchmountitem;
                this.L$2 = perfMonitorOverlayViewExternalSyntheticLambda0;
                this.L$3 = getinteropuiblocklistener;
                this.L$4 = transformasync;
                this.J$0 = jOnNavigationEvent;
                this.label = i2;
                objOnExtraCallback = AudioExecutor1.onExtraCallback(audioExecutor1, createpostfailedexception, this, i3, createpostfailedexception);
            }
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            Object objOnWarmupCompleted = Camera2CameraControlImplExternalSyntheticLambda5.onWarmupCompleted(highPriorityExecutor, new AnonymousClass3(this.onTransact, this.onWarmupCompleted, this.onExtraCallbackWithResult, this.IAuthTabCallbackDefault, this.onNavigationEvent, this.IAuthTabCallback, this.asBinder, this.onExtraCallback, null), access13800Var);
            return objOnWarmupCompleted == access14300.onWarmupCompleted() ? objOnWarmupCompleted : Unit.INSTANCE;
        }
    }

    private static final Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, ExtensionsManager1 extensionsManager1) {
        float fIntBitsToFloat;
        int i = 2 % 2;
        int iIAuthTabCallbackDefault = (int) (IAuthTabCallbackDefault((getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor) >> 32);
        int iIAuthTabCallbackDefault2 = (int) IAuthTabCallbackDefault((getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor);
        if (onExtraCallback(getsupportedhighspeedresolutions) > 1.0f) {
            int i2 = IAuthTabCallbackDefault + 17;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            if (((int) (extensionsManager1.onExtraCallbackWithResult() >> 32)) > 0 && ((int) extensionsManager1.onExtraCallbackWithResult()) > 0) {
                int i4 = asInterface + 57;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                if (((int) (extensionsManager1.onExtraCallbackWithResult() >> 32)) != iIAuthTabCallbackDefault || ((int) extensionsManager1.onExtraCallbackWithResult()) != iIAuthTabCallbackDefault2) {
                    Pair<Float, Float> pairOnExtraCallback = onExtraCallback(onWarmupCompleted(IAuthTabCallback_Parcel((getSupportedHighSpeedResolutionsFor<setUseCaseDetached>) getsupportedhighspeedresolutionsfor2), extensionsManager1.onExtraCallbackWithResult()), extensionsManager1.onExtraCallbackWithResult(), onExtraCallback(getsupportedhighspeedresolutions));
                    float fFloatValue = ((Number) pairOnExtraCallback.onExtraCallbackWithResult()).floatValue();
                    float fFloatValue2 = ((Number) pairOnExtraCallback.IAuthTabCallback()).floatValue();
                    long jIAuthTabCallbackStub = IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<setUseCaseAttached>) getsupportedhighspeedresolutionsfor3) >> 32;
                    float fIntBitsToFloat2 = iIAuthTabCallbackDefault > 0 ? (Float.intBitsToFloat((int) jIAuthTabCallbackStub) * ((int) (extensionsManager1.onExtraCallbackWithResult() >> 32))) / iIAuthTabCallbackDefault : Float.intBitsToFloat((int) jIAuthTabCallbackStub);
                    if (iIAuthTabCallbackDefault2 > 0) {
                        int i6 = asInterface + 61;
                        IAuthTabCallbackDefault = i6 % 128;
                        int i7 = i6 % 2;
                        fIntBitsToFloat = (Float.intBitsToFloat((int) IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<setUseCaseAttached>) getsupportedhighspeedresolutionsfor3)) * ((int) extensionsManager1.onExtraCallbackWithResult())) / iIAuthTabCallbackDefault2;
                    } else {
                        fIntBitsToFloat = Float.intBitsToFloat((int) IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<setUseCaseAttached>) getsupportedhighspeedresolutionsfor3));
                    }
                    onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 2145062597, new Object[]{getsupportedhighspeedresolutionsfor3, Long.valueOf(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(RangesKt.coerceIn(fIntBitsToFloat, -fFloatValue2, fFloatValue2)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(RangesKt.coerceIn(fIntBitsToFloat2, -fFloatValue, fFloatValue)) << 32)))}, -2145062581, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
                }
            }
        }
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor, extensionsManager1.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(futures3, BuildConfig.FLAVOR);
        function1.invoke(Float.valueOf(Float.intBitsToFloat((int) FuturesCallbackListener.onTransact(futures3))));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 21;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, KeylinesKtExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, BuildConfig.FLAVOR);
        if (onwarmupcompleted instanceof KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback) {
            Object[] objArr = {getsupportedhighspeedresolutionsfor, Long.valueOf(((KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback) onwarmupcompleted).onNavigationEvent().getIntrinsicSize-NH-jbRc())};
            int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -335062433, objArr, 335062440, iOnExtraCallbackWithResult);
            int i4 = asInterface + 51;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        setIso setiso = (setIso) objArr[0];
        setOrientationDegrees setorientationdegrees = (setOrientationDegrees) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, BuildConfig.FLAVOR);
        setiso.onWarmupCompleted();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 69;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(ExifDataWhiteBalanceMode exifDataWhiteBalanceMode, final setIso setiso) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setiso, BuildConfig.FLAVOR);
        setOrientationDegrees.onExtraCallback(setiso, exifDataWhiteBalanceMode, 0L, new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda33
            public final Object invoke(Object obj) {
                return NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallback(setiso, (setOrientationDegrees) obj);
            }
        }, 1, (Object) null);
        ExifTag.onNavigationEvent(setiso, exifDataWhiteBalanceMode);
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 69;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, BuildConfig.FLAVOR);
        fliphorizontally.IAuthTabCallbackStubProxy(onExtraCallback(getsupportedhighspeedresolutions));
        fliphorizontally.getInterfaceDescriptor(onExtraCallback(getsupportedhighspeedresolutions));
        fliphorizontally.IAuthTabCallback_Parcel(Float.intBitsToFloat((int) (IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<setUseCaseAttached>) getsupportedhighspeedresolutionsfor) >> 32)));
        fliphorizontally.access000(Float.intBitsToFloat((int) IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<setUseCaseAttached>) getsupportedhighspeedresolutionsfor)));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 55;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onNavigationEvent(final String str, final float f, final ExifDataWhiteBalanceMode exifDataWhiteBalanceMode, final Function0<Unit> function0, final Function1<? super Float, Unit> function1, final Function0<Unit> function02, final Function0<Unit> function03, final Function1<? super Float, Unit> function12, final boolean z, final r8lambdac3sIBWhumSTVayX4JnAMsG7PGiA r8lambdac3sibwhumstvayx4jnamsg7pgia, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws Throwable {
        int i2;
        boolean z2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        Throwable th;
        Throwable th2;
        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        int i3;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-722176777);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(exifDataWhiteBalanceMode) : cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(exifDataWhiteBalanceMode) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i6 = IAuthTabCallbackDefault + 39;
                asInterface = i6 % 128;
                i4 = i6 % 2 == 0 ? 24887 : 16384;
            } else {
                i4 = PKIFailureInfo.certRevoked;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            int i7 = asInterface + 49;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function03)) {
                int i9 = IAuthTabCallbackDefault + 65;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
                i3 = PKIFailureInfo.badCertTemplate;
            } else {
                i3 = PKIFailureInfo.signerNotTrusted;
            }
            i2 |= i3;
        }
        if ((12582912 & i) == 0) {
            int i11 = IAuthTabCallbackDefault + 71;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdac3sibwhumstvayx4jnamsg7pgia) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 306783379) != 306783378, i2 & 1)) {
            int i13 = asInterface + 79;
            IAuthTabCallbackDefault = i13 % 128;
            if (i13 % 2 != 0) {
                Object obj = null;
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-722176777, i2, -1, "viva.republica.toss.tosssecurities.ZoomableAsyncImage (TossSecuritiesMultiImageViewerActivity.kt:829)");
            }
            final getSupportedHighSpeedResolutions getsupportedhighspeedresolutionsOnExtraCallback = r8lambdac3sibwhumstvayx4jnamsg7pgia.onExtraCallback();
            final getSupportedHighSpeedResolutionsFor<setUseCaseAttached> getsupportedhighspeedresolutionsforOnExtraCallbackWithResult = r8lambdac3sibwhumstvayx4jnamsg7pgia.onExtraCallbackWithResult();
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(ExtensionsManager1.onNavigationEvent(ExtensionsManager1.Companion.onNavigationEvent()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                objOnMinimized = getsupportedhighspeedresolutionsforOnWarmupCompleted;
            }
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                int i14 = IAuthTabCallbackDefault + 57;
                asInterface = i14 % 128;
                int i15 = i14 % 2;
                objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setUseCaseDetached.onNavigationEvent(setUseCaseDetached.Companion.IAuthTabCallback()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = YuvImageOnePixelShiftQuirk.onExtraCallbackWithResult(quirksExternalSyntheticBackport02);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsOnExtraCallback);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsforOnExtraCallbackWithResult);
            boolean z3 = (i2 & 7168) == 2048;
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((zOnNavigationEvent | zOnNavigationEvent2 | z3) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new asBinder(getsupportedhighspeedresolutionsOnExtraCallback, getsupportedhighspeedresolutionsforOnExtraCallbackWithResult, function0);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = SequentialExecutorWorkerRunningState.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, Boolean.valueOf(z), (PointerInputEventHandler) objOnMinimized3);
            boolean z4 = (57344 & i2) == 16384;
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsOnExtraCallback);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsforOnExtraCallbackWithResult);
            boolean z5 = (i2 & 112) == 32;
            boolean z6 = (458752 & i2) == 131072;
            if ((3670016 & i2) == 1048576) {
                int i16 = asInterface + 81;
                IAuthTabCallbackDefault = i16 % 128;
                int i17 = i16 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (((z5 | z4 | zOnNavigationEvent3 | zOnNavigationEvent4 | z6) || z2) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                th = null;
                onTransact ontransact = new onTransact(function1, f, function02, function03, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsOnExtraCallback, getsupportedhighspeedresolutionsforOnExtraCallbackWithResult);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(ontransact);
                objOnMinimized4 = ontransact;
            } else {
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                th = null;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = SequentialExecutorWorkerRunningState.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback, Boolean.valueOf(z), (PointerInputEventHandler) objOnMinimized4);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult2 = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.onExtraCallback(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback2);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i18 = IAuthTabCallbackDefault + 75;
                onextracallbackwithresult = onextracallbackwithresult2;
                asInterface = i18 % 128;
                if (i18 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    th.hashCode();
                    throw th;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                th2 = th;
            } else {
                th2 = th;
                onextracallbackwithresult = onextracallbackwithresult2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult3.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, 0.0f, 1, th2);
            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsOnExtraCallback);
            boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsforOnExtraCallbackWithResult);
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((zOnNavigationEvent5 | zOnNavigationEvent6) || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized5 = new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda18
                    public final Object invoke(Object obj2) {
                        return NestfgetmSurfaceIdsWithPendingMountNotification.onWarmupCompleted(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsOnExtraCallback, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsforOnExtraCallbackWithResult, (ExtensionsManager1) obj2);
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnNavigationEvent, (Function1) objOnMinimized5);
            boolean z7 = (29360128 & i2) == 8388608;
            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z7 || objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized6 = new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda19
                    public final Object invoke(Object obj2) {
                        return NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(function12, (Futures3) obj2);
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallbackWithResult2, (Function1) objOnMinimized6);
            component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.onExtraCallback(), false);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent2);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult3.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i19 = IAuthTabCallbackDefault + 117;
                asInterface = i19 % 128;
                int i20 = i19 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult3.onTransact());
            boolean z8 = false;
            RecomposerawaitIdle2 recomposerawaitIdle2OnExtraCallbackWithResult = RecomposerrecompositionRunner2.onWarmupCompleted(new RecomposerawaitIdle2.onNavigationEvent((Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback())).onExtraCallback(str).onNavigationEvent(RememberObserverHolder.onWarmupCompleted).onExtraCallbackWithResult(new CompositionLocalKtExternalSyntheticLambda1.onNavigationEvent(false, 1, th2)), false).onExtraCallbackWithResult();
            immediateFailedFuture immediatefailedfutureIAuthTabCallback = immediateFailedFuture.Companion.IAuthTabCallback();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, 0.0f, 1, th2);
            if (exifDataWhiteBalanceMode != null) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2010079968);
                if ((i2 & 896) == 256 || ((i2 & 512) != 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(exifDataWhiteBalanceMode))) {
                    z8 = true;
                }
                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z8 || objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized7 = new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda20
                        public final Object invoke(Object obj2) {
                            Object[] objArr = {exifDataWhiteBalanceMode, (setIso) obj2};
                            int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                            return (Unit) NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -691851359, objArr, 691851378, iOnExtraCallbackWithResult);
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                }
                quirksExternalSyntheticBackport0OnExtraCallback = SessionProcessorSurface.onExtraCallback(quirksExternalSyntheticBackport0, (Function1) objOnMinimized7);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2009826977);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport0OnNavigationEvent3.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback);
            boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsOnExtraCallback);
            boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsforOnExtraCallbackWithResult);
            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(!(zOnNavigationEvent7 | zOnNavigationEvent8)) || objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized8 = new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda21
                    public final Object invoke(Object obj2) {
                        return NestfgetmSurfaceIdsWithPendingMountNotification.onExtraCallback(getsupportedhighspeedresolutionsOnExtraCallback, getsupportedhighspeedresolutionsforOnExtraCallbackWithResult, (flipHorizontally) obj2);
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized8);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback3 = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback2, (Function1) objOnMinimized8);
            AppLovinFullscreenImmersiveActivity appLovinFullscreenImmersiveActivityIAuthTabCallback = showAndRender.IAuthTabCallback();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult3 = setAdVideoPlaybackListener.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallback3, "AsyncImage", recomposerawaitIdle2OnExtraCallbackWithResult, appLovinFullscreenImmersiveActivityIAuthTabCallback);
            Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized9 = new Function1() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda22
                    public final Object invoke(Object obj2) {
                        Object[] objArr = {getsupportedhighspeedresolutionsfor2, (KeylinesKtExternalSyntheticLambda1.onWarmupCompleted) obj2};
                        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                        return (Unit) NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -336706024, objArr, 336706036, iOnExtraCallbackWithResult);
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized9);
            }
            AccessibilityUtilKtExternalSyntheticLambda1.IAuthTabCallback(recomposerawaitIdle2OnExtraCallbackWithResult, (String) null, quirksExternalSyntheticBackport0OnExtraCallbackWithResult3, (Function1) null, showAndRender.IAuthTabCallback(appLovinFullscreenImmersiveActivityIAuthTabCallback, (Function1) objOnMinimized9), (QuirkSettingsLoader) null, immediatefailedfutureIAuthTabCallback, 0.0f, (seek) null, 0, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1572912, 0, 1960);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i21 = asInterface + 95;
                IAuthTabCallbackDefault = i21 % 128;
                if (i21 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    th2.hashCode();
                    throw th2;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.tosssecurities.TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda23
                public final Object invoke(Object obj2, Object obj3) {
                    return NestfgetmSurfaceIdsWithPendingMountNotification.IAuthTabCallback(str, f, exifDataWhiteBalanceMode, function0, function1, function02, function03, function12, z, r8lambdac3sibwhumstvayx4jnamsg7pgia, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[PHI: r3
      0x0047: PHI (r3v4 int) = (r3v3 int), (r3v6 int) binds: [B:14:0x0045, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final long onWarmupCompleted(long j, long j2) {
        int i;
        int i2 = 2 % 2;
        int i3 = (int) (j2 >> 32);
        if (i3 > 0) {
            int i4 = asInterface;
            int i5 = i4 + 125;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = (int) j2;
            if (i7 > 0) {
                if (j != 9205357640488583168L) {
                    int i8 = i4 + 83;
                    IAuthTabCallbackDefault = i8 % 128;
                    if (i8 % 2 != 0) {
                        i = (int) (j >>> 119);
                        if (Float.intBitsToFloat(i) > 0.0f) {
                            int i9 = IAuthTabCallbackDefault + 81;
                            asInterface = i9 % 128;
                            int i10 = i9 % 2;
                            int i11 = (int) j;
                            if (Float.intBitsToFloat(i11) > 0.0f) {
                                float fMin = Math.min(i3 / Float.intBitsToFloat(i), i7 / Float.intBitsToFloat(i11));
                                float fIntBitsToFloat = Float.intBitsToFloat(i);
                                float fIntBitsToFloat2 = Float.intBitsToFloat(i11);
                                return setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(fIntBitsToFloat2 * fMin) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat * fMin) << 32));
                            }
                        }
                    } else {
                        i = (int) (j >> 32);
                        if (Float.intBitsToFloat(i) > 0.0f) {
                        }
                    }
                }
                return setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(i7) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(i3) << 32));
            }
        }
        return setUseCaseDetached.Companion.onExtraCallback();
    }

    private static final Pair<Float, Float> onExtraCallback(long j, long j2, float f) {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Pair<Float, Float> pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(RangesKt.coerceAtLeast(((Float.intBitsToFloat((int) (j >> 32)) * f) - ((int) (j2 >> 32))) / 2.0f, 0.0f)), Float.valueOf(RangesKt.coerceAtLeast(((Float.intBitsToFloat((int) j) * f) - ((int) j2)) / 2.0f, 0.0f)));
        int i4 = asInterface + 45;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return pairIAuthTabCallback;
    }

    private static final boolean onTransact(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = IAuthTabCallbackDefault + 109;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = asInterface + 3;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final float IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        int i4 = IAuthTabCallbackDefault + 49;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return fOnNavigationEvent;
        }
        throw null;
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        int i4 = IAuthTabCallbackDefault + 29;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return Float.valueOf(fOnNavigationEvent);
        }
        throw null;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = asInterface + 5;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(fFloatValue);
        int i4 = IAuthTabCallbackDefault + 19;
        asInterface = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final float onNavigationEvent(getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1 = (VirtualCameraControlExternalSyntheticLambda1) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fIAuthTabCallback = virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
        int i4 = asInterface + 101;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return fIAuthTabCallback;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1> getsupportedhighspeedresolutionsfor, float f) {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f));
        int i4 = IAuthTabCallbackDefault + 9;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final boolean asBinder(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = asInterface + 77;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        int i5 = asInterface + 97;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static final Unit onExtraCallbackWithResult(float f, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, ExifDataWhiteBalanceMode exifDataWhiteBalanceMode, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, BuildConfig.FLAVOR);
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        float f2 = -(((Float) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 787531557, new Object[]{getsupportedhighspeedresolutions}, -787531552, iOnExtraCallbackWithResult)).floatValue() - f);
        setorientationdegrees.onExtraCallback().onTransact().onWarmupCompleted(0.0f, f2);
        try {
            ExifTag.onNavigationEvent(setorientationdegrees, exifDataWhiteBalanceMode);
            setorientationdegrees.onExtraCallback().onTransact().onWarmupCompleted(0.0f, -f2);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallbackDefault + 121;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        } catch (Throwable th) {
            setorientationdegrees.onExtraCallback().onTransact().onWarmupCompleted(0.0f, -f2);
            throw th;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 101;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        int i4 = asInterface + 41;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return Float.valueOf(fOnNavigationEvent);
    }

    private static final Function0<Unit> onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<? extends Function0<Unit>> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Function0<Unit> function0 = (Function0) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = asInterface + 35;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return function0;
    }

    private static final Function0<Unit> onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<? extends Function0<Unit>> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Function0<Unit> function0 = (Function0) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = asInterface + 13;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return function0;
        }
        obj.hashCode();
        throw null;
    }

    private static final float onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        int i4 = IAuthTabCallbackDefault + 89;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    private static final void asInterface(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        int i4 = asInterface + 9;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final long IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor<setUseCaseAttached> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        long jOnExtraCallback = ((setUseCaseAttached) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).onExtraCallback();
        int i4 = IAuthTabCallbackDefault + 123;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return jOnExtraCallback;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = asInterface + 19;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(setUseCaseAttached.onNavigationEvent(jLongValue));
            int i3 = 27 / 0;
            return null;
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(setUseCaseAttached.onNavigationEvent(jLongValue));
        return null;
    }

    private static final long IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor<ExtensionsManager1> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ExtensionsManager1 extensionsManager1 = (ExtensionsManager1) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            extensionsManager1.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long jOnExtraCallbackWithResult = extensionsManager1.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 39;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return jOnExtraCallbackWithResult;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<ExtensionsManager1> getsupportedhighspeedresolutionsfor, long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(ExtensionsManager1.onNavigationEvent(j));
            int i3 = 41 / 0;
        } else {
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(ExtensionsManager1.onNavigationEvent(j));
        }
    }

    private static final long IAuthTabCallback_Parcel(getSupportedHighSpeedResolutionsFor<setUseCaseDetached> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        long jOnNavigationEvent = ((setUseCaseDetached) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).onNavigationEvent();
        int i4 = IAuthTabCallbackDefault + 51;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return jOnNavigationEvent;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = asInterface + 45;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(setUseCaseDetached.onNavigationEvent(jLongValue));
            int i3 = IAuthTabCallbackDefault + 9;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(setUseCaseDetached.onNavigationEvent(jLongValue));
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, int i2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), quirksExternalSyntheticBackport0, Integer.valueOf(i3), Integer.valueOf(i4), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i5)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -630281308, objArr, 630281333, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1, getHumanReadableName gethumanreadablename, int i, long j, boolean z, setContentInsetsRelative setcontentinsetsrelative, Function1 function1, FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {str, surfaceProcessorWithExecutorExternalSyntheticLambda1, gethumanreadablename, Integer.valueOf(i), Long.valueOf(j), Boolean.valueOf(z), setcontentinsetsrelative, function1, focusMeteringControlExternalSyntheticLambda9, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 582768616, objArr, -582768589, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onExtraCallback(ExifDataWhiteBalanceMode exifDataWhiteBalanceMode, setIso setiso) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -691851359, new Object[]{exifDataWhiteBalanceMode, setiso}, 691851378, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -517904452, new Object[]{getsupportedhighspeedresolutionsfor}, 517904453, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        Object[] objArr = {getsupportedhighspeedresolutions, Float.valueOf(f)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1613385517, objArr, 1613385526, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, KeylinesKtExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -336706024, new Object[]{getsupportedhighspeedresolutionsfor, onwarmupcompleted}, 336706036, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1402338445, objArr, -1402338432, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1308408009, new Object[]{function0}, 1308408023, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -815990594, new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, 815990604, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(r8lambdac3sIBWhumSTVayX4JnAMsG7PGiA r8lambdac3sibwhumstvayx4jnamsg7pgia, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -939801846, new Object[]{r8lambdac3sibwhumstvayx4jnamsg7pgia, getsupportedhighspeedresolutionsfor}, 939801846, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onNavigationEvent(Activity activity) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1122374554, new Object[]{activity}, 1122374580, iOnExtraCallbackWithResult);
    }

    private static final void onExtraCallback(int i, NestfgetmBinding nestfgetmBinding, pExternalSyntheticLambda1 pexternalsyntheticlambda1, NestfgetmDestroyed nestfgetmDestroyed, boolean z, Function0<Unit> function0, Function1<? super String, Unit> function1, boolean z2, float f, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), nestfgetmBinding, pexternalsyntheticlambda1, nestfgetmDestroyed, Boolean.valueOf(z), function0, function1, Boolean.valueOf(z2), Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -2076895324, objArr, 2076895327, iOnExtraCallbackWithResult);
    }

    private static final float onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return ((Float) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1647676303, new Object[]{getsupportedhighspeedresolutions}, -1647676279, iOnExtraCallbackWithResult)).floatValue();
    }

    private static final Unit onExtraCallback(r8lambdac3sIBWhumSTVayX4JnAMsG7PGiA r8lambdac3sibwhumstvayx4jnamsg7pgia, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1825185093, new Object[]{r8lambdac3sibwhumstvayx4jnamsg7pgia, getsupportedhighspeedresolutionsfor}, 1825185097, iOnExtraCallbackWithResult);
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        Object[] objArr = {getsupportedhighspeedresolutions, Float.valueOf(f)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -743678870, objArr, 743678893, iOnExtraCallbackWithResult);
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -176230735, objArr, 176230752, iOnExtraCallbackWithResult);
    }

    private static final Unit onExtraCallbackWithResult(NestfgetmDestroyed nestfgetmDestroyed, ExtensionsManager1 extensionsManager1) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1362041004, new Object[]{nestfgetmDestroyed, extensionsManager1}, -1362040986, iOnExtraCallbackWithResult);
    }

    private static final Unit onExtraCallbackWithResult(List list, int i, Function1 function1, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {list, Integer.valueOf(i), function1, Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 2026094358, objArr, -2026094347, iOnExtraCallbackWithResult);
    }

    private static final void onExtraCallback(int i, int i2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3), Integer.valueOf(i4)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -976619595, objArr, 976619615, iOnExtraCallbackWithResult);
    }

    private static final float onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return ((Float) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 787531557, new Object[]{getsupportedhighspeedresolutions}, -787531552, iOnExtraCallbackWithResult)).floatValue();
    }

    private static final void IAuthTabCallbackStub(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        Object[] objArr = {getsupportedhighspeedresolutions, Float.valueOf(f)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 993932184, objArr, -993932163, iOnExtraCallbackWithResult);
    }

    private static final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1442850232, objArr, -1442850224, iOnExtraCallbackWithResult);
    }

    private static final Unit IAuthTabCallback(setIso setiso, setOrientationDegrees setorientationdegrees) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1079467721, new Object[]{setiso, setorientationdegrees}, 1079467736, iOnExtraCallbackWithResult);
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<setUseCaseAttached> getsupportedhighspeedresolutionsfor, long j) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Long.valueOf(j)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 2145062597, objArr, -2145062581, iOnExtraCallbackWithResult);
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<setUseCaseDetached> getsupportedhighspeedresolutionsfor, long j) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Long.valueOf(j)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -335062433, objArr, 335062440, iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ void onWarmupCompleted(List list, int i, Function1 function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {list, Integer.valueOf(i), function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -557203759, objArr, 557203761, iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ Pair onWarmupCompleted(long j, long j2, float f) {
        Object[] objArr = {Long.valueOf(j), Long.valueOf(j2), Float.valueOf(f)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Pair) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 395899455, objArr, -395899433, iOnExtraCallbackWithResult);
    }

    private static final Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1012042594, new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, 1012042600, iOnExtraCallbackWithResult);
    }

    static void IAuthTabCallback() {
        onExtraCallback = new char[]{32281, 32277, 32273, 32278, 32463, 32466, 32480, 32280, 32486, 32467, 32274, 32284, 32275, 32282, 32469, 32265, 32476, 32279, 32266, 32484};
        IAuthTabCallback = -1184334207;
        onWarmupCompleted = true;
        onNavigationEvent = true;
    }
}
