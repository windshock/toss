package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import com.google.common.collect.Synchronized;
import im.toss.tds.compose.component.compound.agreement.v4.row.RightPreset;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.LifecycleCameraProviderImplExternalSyntheticLambda2;
import o.QualityRatioToResolutionsTableExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RecorderExternalSyntheticLambda14;
import o.VirtualCameraInfo;
import o.containsJSONObjectContainingInt;
import o.getSwitchMinWidth;
import o.isContainerClickable;
import o.r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4;
import o.toPreviewOnlyRange;
import o.toStringList;
import o.tryToStringMap;
import o.updateFocusedState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class toStringList {
    private static int IAuthTabCallback = 1;
    private static final accessisMonitoringp<Float> onExtraCallback = setPostviewFormatSelector.IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda0) null, new Function0() { // from class: im.toss.tds.compose.component.compound.agreement.v4.row.TdsAgreementV4RowKt$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Float fValueOf = Float.valueOf(toStringList.onNavigationEvent());
            int i4 = IAuthTabCallback + 39;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return fValueOf;
        }
    }, 1, (Object) null);
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final /* synthetic */ float IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fOnExtraCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<VirtualCameraControlExternalSyntheticLambda1>) cameraPresenceProviderExternalSyntheticLambda6);
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        int i5 = onNavigationEvent + 123;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return fOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(tryToStringMap trytostringmap, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(trytostringmap, z);
        int i4 = onWarmupCompleted + 91;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static final /* synthetic */ float onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fOnWarmupCompleted = onWarmupCompleted(getsupportedhighspeedresolutionsfor);
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        return fOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        tryToStringMap trytostringmap = (tryToStringMap) objArr[2];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[3];
        getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[4];
        getBacktraceNote getbacktracenote4 = (getBacktraceNote) objArr[5];
        getBacktraceNote getbacktracenote5 = (getBacktraceNote) objArr[6];
        getBacktraceNote getbacktracenote6 = (getBacktraceNote) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int iIntValue2 = ((Number) objArr[9]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[10];
        ((Number) objArr[11]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onWarmupCompleted = i2 % 128;
        IAuthTabCallback(getbacktracenote, quirksExternalSyntheticBackport0, trytostringmap, getbacktracenote2, getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, tryToStringMap trytostringmap, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, getBacktraceNote getbacktracenote4, getBacktraceNote getbacktracenote5, getBacktraceNote getbacktracenote6, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 87;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {getbacktracenote, quirksExternalSyntheticBackport0, trytostringmap, getbacktracenote2, getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(1772702352, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), objArr, -1772702352, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted);
        int i7 = onNavigationEvent + 33;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 40 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) objArr[0];
        getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(getswitchminwidth, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        IAuthTabCallback(getswitchminwidth, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }

    public static /* synthetic */ float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fOnWarmupCompleted = onWarmupCompleted();
        int i4 = onNavigationEvent + 33;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return fOnWarmupCompleted;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i4 | i6);
        int i9 = (~((~i6) | i4)) | (~(i4 | i));
        int i10 = i4 + i + i3 + (32217706 * i2) + (238734613 * i5);
        int i11 = i10 * i10;
        int i12 = (((-3446596) * i4) - 528416768) + (677943110 * i) + (i8 * 1806788795) + ((-1806788795) * i7) + (1806788795 * i9) + ((-1810235392) * i3) + ((-154927104) * i2) + ((-131989504) * i5) + ((-1876361216) * i11);
        int i13 = ((i4 * 1127137324) - 440746823) + (i * 1127135646) + (i8 * 839) + (i7 * (-839)) + (i9 * 839) + (i3 * 1127136485) + (i2 * 976419026) + (i5 * 1106960329) + (i11 * 279773184);
        int i14 = i12 + (i13 * i13 * (-1943076864));
        return i14 != 1 ? i14 != 2 ? i14 != 3 ? onExtraCallback(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        tryToStringMap trytostringmap = (tryToStringMap) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        containsJSONObjectContainingInt.onExtraCallbackWithResult onextracallbackwithresult = (containsJSONObjectContainingInt.onExtraCallbackWithResult) objArr[2];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[3];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[4];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[5];
        getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[6];
        removeObjectsForKeys removeobjectsforkeys = (removeObjectsForKeys) objArr[7];
        getBacktraceNote getbacktracenote4 = (getBacktraceNote) objArr[8];
        shallowCopy shallowcopy = (shallowCopy) objArr[9];
        getBacktraceNote getbacktracenote5 = (getBacktraceNote) objArr[10];
        RightPreset rightPreset = (RightPreset) objArr[11];
        getBacktraceNote getbacktracenote6 = (getBacktraceNote) objArr[12];
        toIntegerList tointegerlist = (toIntegerList) objArr[13];
        r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY r8lambdaaorak_euklu6wmr1tc7mrkxw5hy = (r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY) objArr[14];
        removeTrimmedEmptyStrings removetrimmedemptystrings = (removeTrimmedEmptyStrings) objArr[15];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[16];
        int iIntValue = ((Number) objArr[17]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(trytostringmap, quirksExternalSyntheticBackport0, onextracallbackwithresult, getsupportedhighspeedresolutionsfor, getbacktracenote, getbacktracenote2, getbacktracenote3, removeobjectsforkeys, getbacktracenote4, shallowcopy, getbacktracenote5, rightPreset, getbacktracenote6, tointegerlist, r8lambdaaorak_euklu6wmr1tc7mrkxw5hy, removetrimmedemptystrings, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onNavigationEvent + 23;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 != 0 ? 1.0f : 2.0f;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, containsJSONObjectContainingInt.onExtraCallbackWithResult onextracallbackwithresult, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, removeObjectsForKeys removeobjectsforkeys, getBacktraceNote getbacktracenote4, shallowCopy shallowcopy, getBacktraceNote getbacktracenote5, RightPreset rightPreset, getBacktraceNote getbacktracenote6, toIntegerList tointegerlist, r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY r8lambdaaorak_euklu6wmr1tc7mrkxw5hy, removeTrimmedEmptyStrings removetrimmedemptystrings, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 73;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return onNavigationEvent(quirksExternalSyntheticBackport0, onextracallbackwithresult, getsupportedhighspeedresolutionsfor, getbacktracenote, getbacktracenote2, getbacktracenote3, removeobjectsforkeys, getbacktracenote4, shallowcopy, getbacktracenote5, rightPreset, getbacktracenote6, tointegerlist, r8lambdaaorak_euklu6wmr1tc7mrkxw5hy, removetrimmedemptystrings, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onNavigationEvent(quirksExternalSyntheticBackport0, onextracallbackwithresult, getsupportedhighspeedresolutionsfor, getbacktracenote, getbacktracenote2, getbacktracenote3, removeobjectsforkeys, getbacktracenote4, shallowcopy, getbacktracenote5, rightPreset, getbacktracenote6, tointegerlist, r8lambdaaorak_euklu6wmr1tc7mrkxw5hy, removetrimmedemptystrings, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, VirtualCameraInfo virtualCameraInfo) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(getsupportedhighspeedresolutionsfor, virtualCameraInfo);
        }
        onNavigationEvent(getsupportedhighspeedresolutionsfor, virtualCameraInfo);
        throw null;
    }

    static {
        int i = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        accessisMonitoringp<Float> accessismonitoringp = onExtraCallback;
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        return accessismonitoringp;
    }

    private static final Unit onExtraCallbackWithResult(tryToStringMap trytostringmap, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            trytostringmap.onWarmupCompleted(z);
            Unit unit = Unit.INSTANCE;
            int i3 = onNavigationEvent + 77;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
        trytostringmap.onWarmupCompleted(z);
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static final Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, VirtualCameraInfo virtualCameraInfo) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(getsupportedhighspeedresolutionsfor, VirtualCameraInfo.onExtraCallbackWithResult(virtualCameraInfo.onWarmupCompleted()));
            Unit unit = Unit.INSTANCE;
            int i3 = onNavigationEvent + 87;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
        onExtraCallback(getsupportedhighspeedresolutionsfor, VirtualCameraInfo.onExtraCallbackWithResult(virtualCameraInfo.onWarmupCompleted()));
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static final updateFocusedState IAuthTabCallback(getSwitchMinWidth getswitchminwidth, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        getThumbPosition getthumbpositionOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1346531603);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i3 = onWarmupCompleted + 77;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1346531603, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.row.TdsAgreementV4Row.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4Row.kt:81)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1346531603, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.row.TdsAgreementV4Row.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4Row.kt:81)");
        }
        if (((Number) getswitchminwidth.IAuthTabCallback()).intValue() != ((Number) getswitchminwidth.access000()).intValue()) {
            int i4 = onWarmupCompleted + 111;
            onNavigationEvent = i4 % 128;
            getthumbpositionOnExtraCallbackWithResult = i4 % 2 == 0 ? getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.onTransact(), 1, 2, (Object) null) : getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.onTransact(), 0, 2, (Object) null);
            int i5 = onNavigationEvent + 11;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        } else {
            getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(0, 0, getIconContentView.onWarmupCompleted.onTransact(), 2, (Object) null);
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return getthumbpositionOnExtraCallbackWithResult;
    }

    public static final class asInterface extends Lambda implements Function1<useAndConfigureProgramWithTexture, Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Recorder $measurer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asInterface(Recorder recorder) {
            super(1);
            this.$measurer = recorder;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((useAndConfigureProgramWithTexture) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onNavigationEvent(@NotNull useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            RecorderExternalSyntheticLambda13.IAuthTabCallback(useandconfigureprogramwithtexture, this.$measurer);
            int i4 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class IAuthTabCallbackStub extends Lambda implements Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ int $$changed;
        final /* synthetic */ getBacktraceNote $badgePreset$inlined;
        final /* synthetic */ shallowCopy $badgePresetScope$inlined;
        final /* synthetic */ getBacktraceNote $centerPreset$inlined;
        final /* synthetic */ removeObjectsForKeys $centerPresetScope$inlined;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor $checkBoxSize$delegate$inlined;
        final /* synthetic */ getBacktraceNote $descriptionPreset$inlined;
        final /* synthetic */ removeTrimmedEmptyStrings $descriptionScope$inlined;
        final /* synthetic */ getBacktraceNote $leftPreset$inlined;
        final /* synthetic */ toIntegerList $leftPresetScope$inlined;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 $leftSpace$delegate$inlined;
        final /* synthetic */ getBacktraceNote $markAbstractPreset$inlined;
        final /* synthetic */ r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY $markAbstractPresetScope$inlined;
        final /* synthetic */ Function0 $onHelpersChanged;
        final /* synthetic */ getBacktraceNote $rightPreset$inlined;
        final /* synthetic */ RightPreset $rightPresetScope$inlined;
        final /* synthetic */ LifecycleCameraProviderImplExternalSyntheticLambda2 $scope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(LifecycleCameraProviderImplExternalSyntheticLambda2 lifecycleCameraProviderImplExternalSyntheticLambda2, int i, Function0 function0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, removeObjectsForKeys removeobjectsforkeys, getBacktraceNote getbacktracenote4, shallowCopy shallowcopy, getBacktraceNote getbacktracenote5, RightPreset rightPreset, getBacktraceNote getbacktracenote6, toIntegerList tointegerlist, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY r8lambdaaorak_euklu6wmr1tc7mrkxw5hy, removeTrimmedEmptyStrings removetrimmedemptystrings) {
            super(2);
            this.$scope = lifecycleCameraProviderImplExternalSyntheticLambda2;
            this.$onHelpersChanged = function0;
            this.$centerPreset$inlined = getbacktracenote;
            this.$markAbstractPreset$inlined = getbacktracenote2;
            this.$descriptionPreset$inlined = getbacktracenote3;
            this.$leftSpace$delegate$inlined = cameraPresenceProviderExternalSyntheticLambda6;
            this.$centerPresetScope$inlined = removeobjectsforkeys;
            this.$badgePreset$inlined = getbacktracenote4;
            this.$badgePresetScope$inlined = shallowcopy;
            this.$rightPreset$inlined = getbacktracenote5;
            this.$rightPresetScope$inlined = rightPreset;
            this.$leftPreset$inlined = getbacktracenote6;
            this.$leftPresetScope$inlined = tointegerlist;
            this.$checkBoxSize$delegate$inlined = getsupportedhighspeedresolutionsfor;
            this.$markAbstractPresetScope$inlined = r8lambdaaorak_euklu6wmr1tc7mrkxw5hy;
            this.$descriptionScope$inlined = removetrimmedemptystrings;
            this.$$changed = i;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj3 = null;
            onExtraCallback((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Number) obj2).intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                throw null;
            }
            int i4 = onExtraCallback + 47;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            obj3.hashCode();
            throw null;
        }

        public final void onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallback;
            StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallback2;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 11;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (((i & 11) ^ 2) == 0 && cameraCaptureResultEmptyCameraCaptureResult.onMessageChannelReady()) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            int iOnExtraCallback = this.$scope.onExtraCallback();
            this.$scope.IAuthTabCallback();
            LifecycleCameraProviderImplExternalSyntheticLambda2 lifecycleCameraProviderImplExternalSyntheticLambda2 = this.$scope;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(572392132);
            LifecycleCameraProviderImplExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = lifecycleCameraProviderImplExternalSyntheticLambda2.onExtraCallbackWithResult();
            StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallbackOnWarmupCompleted = iAuthTabCallbackOnExtraCallbackWithResult.onWarmupCompleted();
            StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallbackIAuthTabCallback = iAuthTabCallbackOnExtraCallbackWithResult.IAuthTabCallback();
            StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallbackOnExtraCallback = iAuthTabCallbackOnExtraCallbackWithResult.onExtraCallback();
            StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallbackOnExtraCallbackWithResult = iAuthTabCallbackOnExtraCallbackWithResult.onExtraCallbackWithResult();
            StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallbackOnNavigationEvent = iAuthTabCallbackOnExtraCallbackWithResult.onNavigationEvent();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = onNavigationEvent.IAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(lifecycleCameraProviderImplExternalSyntheticLambda2.onExtraCallback(onextracallback, stillCaptureProcessorOnCaptureResultCallbackOnWarmupCompleted, (Function1) objOnMinimized), toStringList.IAuthTabCallback(this.$leftSpace$delegate$inlined)), cameraCaptureResultEmptyCameraCaptureResult, 0);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(stillCaptureProcessorOnCaptureResultCallbackOnWarmupCompleted);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!zOnNavigationEvent) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new onExtraCallback(stillCaptureProcessorOnCaptureResultCallbackOnWarmupCompleted);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = lifecycleCameraProviderImplExternalSyntheticLambda2.onExtraCallback(onextracallback, stillCaptureProcessorOnCaptureResultCallbackOnExtraCallback, (Function1) objOnMinimized2);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResult, 48);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = RowScope.onNavigationEvent(RowScopeInstance.onNavigationEvent, onextracallback, 1.0f, false, 2, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            Object obj = null;
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i5 = IAuthTabCallback + 67;
                stillCaptureProcessorOnCaptureResultCallback = stillCaptureProcessorOnCaptureResultCallbackOnNavigationEvent;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
            } else {
                stillCaptureProcessorOnCaptureResultCallback = stillCaptureProcessorOnCaptureResultCallbackOnNavigationEvent;
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            if (this.$centerPreset$inlined == null) {
                int i6 = IAuthTabCallback + 55;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2135544870);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1178037445);
                this.$centerPreset$inlined.invoke(this.$centerPresetScope$inlined, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                Unit unit = Unit.INSTANCE;
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i8 = IAuthTabCallback + 123;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i9 = onExtraCallback + 7;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback3);
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback3);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            if (this.$badgePreset$inlined == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1960347216);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2014972975);
                this.$badgePreset$inlined.invoke(this.$badgePresetScope$inlined, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                Unit unit2 = Unit.INSTANCE;
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (this.$centerPreset$inlined != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-108475147);
                component5 component5VarOnWarmupCompleted3 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
                Function0 function0IAuthTabCallback4 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback4);
                    int i10 = onExtraCallback + 87;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnWarmupCompleted3, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult2.onTransact());
                if (this.$rightPreset$inlined == null) {
                    int i12 = onExtraCallback + 79;
                    IAuthTabCallback = i12 % 128;
                    if (i12 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-488796116);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        obj.hashCode();
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-488796116);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1785347701);
                    this.$rightPreset$inlined.invoke(this.$rightPresetScope$inlined, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    Unit unit3 = Unit.INSTANCE;
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-108335802);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (this.$centerPreset$inlined != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(573735950);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(stillCaptureProcessorOnCaptureResultCallbackOnWarmupCompleted);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent2 || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = new onWarmupCompleted(stillCaptureProcessorOnCaptureResultCallbackOnWarmupCompleted);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = lifecycleCameraProviderImplExternalSyntheticLambda2.onExtraCallback(onextracallback, stillCaptureProcessorOnCaptureResultCallbackIAuthTabCallback, (Function1) objOnMinimized3);
                component5 component5VarOnWarmupCompleted4 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                int iHashCode5 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback2);
                Function0 function0IAuthTabCallback5 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback5);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, component5VarOnWarmupCompleted4, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, Integer.valueOf(iHashCode5), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult2.onTransact());
                if (this.$leftPreset$inlined == null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1418221615);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(369892912);
                    this.$leftPreset$inlined.invoke(this.$leftPresetScope$inlined, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    Unit unit4 = Unit.INSTANCE;
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(574224138);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (this.$markAbstractPreset$inlined == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(574281425);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                stillCaptureProcessorOnCaptureResultCallback2 = stillCaptureProcessorOnCaptureResultCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(574281426);
                getBacktraceNote getbacktracenote = this.$markAbstractPreset$inlined;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(toStringList.onExtraCallback(this.$checkBoxSize$delegate$inlined) + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), 4, (Object) null);
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(stillCaptureProcessorOnCaptureResultCallbackOnExtraCallback);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent3 || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized4 = new onExtraCallbackWithResult(stillCaptureProcessorOnCaptureResultCallbackOnExtraCallback);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                }
                stillCaptureProcessorOnCaptureResultCallback2 = stillCaptureProcessorOnCaptureResultCallback;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback4 = lifecycleCameraProviderImplExternalSyntheticLambda2.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback3, stillCaptureProcessorOnCaptureResultCallback2, (Function1) objOnMinimized4);
                component5 component5VarOnWarmupCompleted5 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                int iHashCode6 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject6 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted6 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback4);
                Function0 function0IAuthTabCallback6 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback6);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, component5VarOnWarmupCompleted5, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject6, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, Integer.valueOf(iHashCode6), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, quirksExternalSyntheticBackport0OnWarmupCompleted6, onextracallbackwithresult2.onTransact());
                getbacktracenote.invoke(this.$markAbstractPresetScope$inlined, cameraCaptureResultEmptyCameraCaptureResult, 6);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                Unit unit5 = Unit.INSTANCE;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (this.$descriptionPreset$inlined == null) {
                int i13 = onExtraCallback + 81;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(574955117);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(574955118);
                getBacktraceNote getbacktracenote2 = this.$descriptionPreset$inlined;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback5 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(toStringList.onExtraCallback(this.$checkBoxSize$delegate$inlined) + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)), 0.0f, 0.0f, 0.0f, 14, (Object) null);
                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(this.$markAbstractPreset$inlined);
                boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(stillCaptureProcessorOnCaptureResultCallbackOnExtraCallback);
                boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(stillCaptureProcessorOnCaptureResultCallback2);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnNavigationEvent4 | zOnNavigationEvent5 | zOnNavigationEvent6) || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized5 = new IAuthTabCallback(this.$markAbstractPreset$inlined, stillCaptureProcessorOnCaptureResultCallbackOnExtraCallback, stillCaptureProcessorOnCaptureResultCallback2);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback6 = lifecycleCameraProviderImplExternalSyntheticLambda2.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback5, stillCaptureProcessorOnCaptureResultCallbackOnExtraCallbackWithResult, (Function1) objOnMinimized5);
                component5 component5VarOnWarmupCompleted6 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                int iHashCode7 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject7 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted7 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback6);
                Function0 function0IAuthTabCallback7 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    int i15 = IAuthTabCallback + 3;
                    onExtraCallback = i15 % 128;
                    int i16 = i15 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback7);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7, component5VarOnWarmupCompleted6, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject7, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7, Integer.valueOf(iHashCode7), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7, quirksExternalSyntheticBackport0OnWarmupCompleted7, onextracallbackwithresult2.onTransact());
                getbacktracenote2.invoke(this.$descriptionScope$inlined, cameraCaptureResultEmptyCameraCaptureResult, 6);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                Unit unit6 = Unit.INSTANCE;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (this.$scope.onExtraCallback() != iOnExtraCallback) {
                int i17 = IAuthTabCallback + 97;
                onExtraCallback = i17 % 128;
                if (i17 % 2 == 0) {
                    this.$onHelpersChanged.invoke();
                } else {
                    this.$onHelpersChanged.invoke();
                    int i18 = 70 / 0;
                }
            }
        }
    }

    static final class onNavigationEvent implements Function1<StillCaptureProcessorExternalSyntheticLambda0, Unit> {
        public static final onNavigationEvent IAuthTabCallback = new onNavigationEvent();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallbackWithResult + 15;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        onNavigationEvent() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((StillCaptureProcessorExternalSyntheticLambda0) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                int i4 = 69 / 0;
            }
            return unit;
        }

        public final void onExtraCallback(StillCaptureProcessorExternalSyntheticLambda0 stillCaptureProcessorExternalSyntheticLambda0) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(stillCaptureProcessorExternalSyntheticLambda0, "");
                RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.IAuthTabCallback(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().IAuthTabCallback(), 1.0f, 1.0f, 98, (Object) null);
                QualityRatioToResolutionsTableExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0.asInterface(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onExtraCallback(), 1.0f, 1.0f, 86, (Object) null);
            } else {
                Intrinsics.checkNotNullParameter(stillCaptureProcessorExternalSyntheticLambda0, "");
                RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.IAuthTabCallback(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().IAuthTabCallback(), 0.0f, 0.0f, 6, (Object) null);
                QualityRatioToResolutionsTableExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0.asInterface(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onExtraCallback(), 0.0f, 0.0f, 6, (Object) null);
            }
        }
    }

    static final class onExtraCallback implements Function1<StillCaptureProcessorExternalSyntheticLambda0, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ StillCaptureProcessorOnCaptureResultCallback onWarmupCompleted;

        onExtraCallback(StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallback) {
            this.onWarmupCompleted = stillCaptureProcessorOnCaptureResultCallback;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((StillCaptureProcessorExternalSyntheticLambda0) obj);
            if (i3 == 0) {
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 105;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit2;
        }

        public final void IAuthTabCallback(StillCaptureProcessorExternalSyntheticLambda0 stillCaptureProcessorExternalSyntheticLambda0) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(stillCaptureProcessorExternalSyntheticLambda0, "");
            RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.IAuthTabCallback(), this.onWarmupCompleted.onWarmupCompleted(), 0.0f, 0.0f, 6, (Object) null);
            QualityRatioToResolutionsTableExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0.asInterface(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onExtraCallback(), 0.0f, 0.0f, 6, (Object) null);
            RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.onNavigationEvent(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onWarmupCompleted(), 0.0f, 0.0f, 6, (Object) null);
            stillCaptureProcessorExternalSyntheticLambda0.onWarmupCompleted(MlKitAnalyzerExternalSyntheticLambda0.Companion.onNavigationEvent());
            int i4 = onNavigationEvent + 5;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final class onWarmupCompleted implements Function1<StillCaptureProcessorExternalSyntheticLambda0, Unit> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ StillCaptureProcessorOnCaptureResultCallback onExtraCallbackWithResult;

        onWarmupCompleted(StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallback) {
            this.onExtraCallbackWithResult = stillCaptureProcessorOnCaptureResultCallback;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((StillCaptureProcessorExternalSyntheticLambda0) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 43;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onWarmupCompleted(StillCaptureProcessorExternalSyntheticLambda0 stillCaptureProcessorExternalSyntheticLambda0) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(stillCaptureProcessorExternalSyntheticLambda0, "");
            RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.IAuthTabCallback(), this.onExtraCallbackWithResult.onWarmupCompleted(), 0.0f, 0.0f, 6, (Object) null);
            QualityRatioToResolutionsTableExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0.asInterface(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onExtraCallback(), 0.0f, 0.0f, 6, (Object) null);
            QualityRatioToResolutionsTableExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0.onWarmupCompleted(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onExtraCallbackWithResult(), 0.0f, 0.0f, 6, (Object) null);
            stillCaptureProcessorExternalSyntheticLambda0.onNavigationEvent(MlKitAnalyzerExternalSyntheticLambda0.Companion.onNavigationEvent());
            int i4 = onNavigationEvent + 51;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final class onExtraCallbackWithResult implements Function1<StillCaptureProcessorExternalSyntheticLambda0, Unit> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ StillCaptureProcessorOnCaptureResultCallback onExtraCallback;

        onExtraCallbackWithResult(StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallback) {
            this.onExtraCallback = stillCaptureProcessorOnCaptureResultCallback;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((StillCaptureProcessorExternalSyntheticLambda0) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 25;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallbackWithResult(StillCaptureProcessorExternalSyntheticLambda0 stillCaptureProcessorExternalSyntheticLambda0) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(stillCaptureProcessorExternalSyntheticLambda0, "");
            RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.IAuthTabCallback(), this.onExtraCallback.IAuthTabCallback(), 0.0f, 0.0f, 6, (Object) null);
            QualityRatioToResolutionsTableExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0.asInterface(), this.onExtraCallback.onExtraCallbackWithResult(), 0.0f, 0.0f, 6, (Object) null);
            RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.onNavigationEvent(), this.onExtraCallback.onWarmupCompleted(), 0.0f, 0.0f, 6, (Object) null);
            stillCaptureProcessorExternalSyntheticLambda0.onWarmupCompleted(MlKitAnalyzerExternalSyntheticLambda0.Companion.onNavigationEvent());
            int i4 = onWarmupCompleted + 23;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    static final class IAuthTabCallback implements Function1<StillCaptureProcessorExternalSyntheticLambda0, Unit> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ StillCaptureProcessorOnCaptureResultCallback IAuthTabCallback;
        final /* synthetic */ getBacktraceNote<r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;
        final /* synthetic */ StillCaptureProcessorOnCaptureResultCallback onExtraCallbackWithResult;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(getBacktraceNote<? super r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallback, StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallback2) {
            this.onExtraCallback = getbacktracenote;
            this.IAuthTabCallback = stillCaptureProcessorOnCaptureResultCallback;
            this.onExtraCallbackWithResult = stillCaptureProcessorOnCaptureResultCallback2;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((StillCaptureProcessorExternalSyntheticLambda0) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 87;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallbackWithResult(StillCaptureProcessorExternalSyntheticLambda0 stillCaptureProcessorExternalSyntheticLambda0) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(stillCaptureProcessorExternalSyntheticLambda0, "");
            if (this.onExtraCallback != null) {
                RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.IAuthTabCallback(), this.IAuthTabCallback.IAuthTabCallback(), 0.0f, 0.0f, 6, (Object) null);
                QualityRatioToResolutionsTableExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0.asInterface(), this.onExtraCallbackWithResult.onExtraCallbackWithResult(), 0.0f, 0.0f, 6, (Object) null);
                RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.onNavigationEvent(), this.onExtraCallbackWithResult.onWarmupCompleted(), 0.0f, 0.0f, 6, (Object) null);
                int i4 = onWarmupCompleted + 73;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            } else {
                RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.IAuthTabCallback(), this.IAuthTabCallback.IAuthTabCallback(), 0.0f, 0.0f, 6, (Object) null);
                QualityRatioToResolutionsTableExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0.asInterface(), this.IAuthTabCallback.onExtraCallbackWithResult(), 0.0f, 0.0f, 6, (Object) null);
                RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.onNavigationEvent(), this.IAuthTabCallback.onWarmupCompleted(), 0.0f, 0.0f, 6, (Object) null);
            }
            stillCaptureProcessorExternalSyntheticLambda0.onWarmupCompleted(MlKitAnalyzerExternalSyntheticLambda0.Companion.onNavigationEvent());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, containsJSONObjectContainingInt.onExtraCallbackWithResult onextracallbackwithresult, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, removeObjectsForKeys removeobjectsforkeys, getBacktraceNote getbacktracenote4, shallowCopy shallowcopy, getBacktraceNote getbacktracenote5, RightPreset rightPreset, getBacktraceNote getbacktracenote6, toIntegerList tointegerlist, r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY r8lambdaaorak_euklu6wmr1tc7mrkxw5hy, removeTrimmedEmptyStrings removetrimmedemptystrings, isContainerClickable iscontainerclickable, final getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        Object objIAuthTabCallback;
        Function1 function1IAuthTabCallbackStub;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 29;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(iscontainerclickable, "");
        Intrinsics.checkNotNullParameter(getswitchminwidth, "");
        if ((i & 48) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth) ? 32 : 16);
        } else {
            i2 = i;
        }
        if ((i2 & 145) != 144) {
            int i6 = onNavigationEvent + 85;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1683989341, i2, -1, "im.toss.tds.compose.component.compound.agreement.v4.row.TdsAgreementV4Row.<anonymous>.<anonymous> (TdsAgreementV4Row.kt:79)");
            }
            getBacktraceNote getbacktracenote7 = new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.row.TdsAgreementV4RowKt$$ExternalSyntheticLambda6
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = 2 % 2;
                    int i9 = IAuthTabCallback + 85;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 == 0) {
                        return (updateFocusedState) toStringList.onNavigationEvent(-937781130, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{getswitchminwidth, (getSwitchMinWidth.onExtraCallback) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, 937781132, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted());
                    }
                    Object[] objArr = {getswitchminwidth, (getSwitchMinWidth.onExtraCallback) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                    int i10 = 67 / 0;
                    return (updateFocusedState) toStringList.onNavigationEvent(-937781130, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), objArr, 937781132, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted());
                }
            };
            getThumbTintList getthumbtintlistOnExtraCallbackWithResult = getThumbTextPadding.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.Companion);
            int i8 = ((((i2 >> 3) & 14) | 384) & 14) | 3072;
            Object obj = null;
            if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                objIAuthTabCallback = getswitchminwidth.IAuthTabCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                boolean z2 = (((i8 & 14) ^ 6) > 4 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth)) || (i8 & 6) == 4;
                objIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!z2) {
                    int i9 = onNavigationEvent + 125;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 != 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        throw null;
                    }
                    if (objIAuthTabCallback == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                        if (r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback != null) {
                            int i10 = onWarmupCompleted + 45;
                            onNavigationEvent = i10 % 128;
                            if (i10 % 2 == 0) {
                                r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback.IAuthTabCallbackStub();
                                obj.hashCode();
                                throw null;
                            }
                            function1IAuthTabCallbackStub = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback.IAuthTabCallbackStub();
                        } else {
                            function1IAuthTabCallbackStub = null;
                        }
                        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback);
                        try {
                            Object objIAuthTabCallback2 = getswitchminwidth.IAuthTabCallback();
                            iAuthTabCallback.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1IAuthTabCallbackStub);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback2);
                            objIAuthTabCallback = objIAuthTabCallback2;
                        } catch (Throwable th) {
                            iAuthTabCallback.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1IAuthTabCallbackStub);
                            throw th;
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            int iIntValue = ((Number) objIAuthTabCallback).intValue();
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-591123655);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-591123655, 0, -1, "im.toss.tds.compose.component.compound.agreement.v4.row.TdsAgreementV4Row.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4Row.kt:90)");
            }
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(onWarmupCompleted(getsupportedhighspeedresolutionsfor) * iIntValue);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback);
            int i11 = i8 & 14;
            int i12 = i11 ^ 6;
            boolean z3 = (i12 > 4 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth)) || (i8 & 6) == 4;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!z3) {
                int i13 = onNavigationEvent + 61;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallbackDefault(getswitchminwidth));
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                int iIntValue2 = ((Number) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized).onExtraCallbackWithResult()).intValue();
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-591123655);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-591123655, 0, -1, "im.toss.tds.compose.component.compound.agreement.v4.row.TdsAgreementV4Row.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4Row.kt:90)");
                }
                float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(onWarmupCompleted(getsupportedhighspeedresolutionsfor) * iIntValue2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent2 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback2);
                boolean z4 = (i12 > 4 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth)) || (i8 & 6) == 4;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(!z4) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new asBinder(getswitchminwidth));
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = getSwitchPadding.onExtraCallback(getswitchminwidth, virtualCameraControlExternalSyntheticLambda1OnNavigationEvent, virtualCameraControlExternalSyntheticLambda1OnNavigationEvent2, (updateFocusedState) getbacktracenote7.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized2).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistOnExtraCallbackWithResult, "startGuideXState", cameraCaptureResultEmptyCameraCaptureResult, i11 | 196608);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), 0.0f, 2, (Object) null), 0.0f, ((VirtualCameraControlExternalSyntheticLambda1) onextracallbackwithresult.onExtraCallbackWithResult().invoke(cameraCaptureResultEmptyCameraCaptureResult, 0)).IAuthTabCallback(), 0.0f, 0.0f, 13, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(-270267499);
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(-3687241);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = new Recorder();
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackStubProxy();
                Recorder recorder = (Recorder) objOnMinimized3;
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(-3687241);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized4 = new LifecycleCameraProviderImplExternalSyntheticLambda2();
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackStubProxy();
                LifecycleCameraProviderImplExternalSyntheticLambda2 lifecycleCameraProviderImplExternalSyntheticLambda2 = (LifecycleCameraProviderImplExternalSyntheticLambda2) objOnMinimized4;
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(-3687241);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized5 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackStubProxy();
                Pair pairOnNavigationEvent = onProcessCompleted.onNavigationEvent(257, lifecycleCameraProviderImplExternalSyntheticLambda2, (getSupportedHighSpeedResolutionsFor) objOnMinimized5, recorder, cameraCaptureResultEmptyCameraCaptureResult, 4544);
                callAllGets.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, false, new asInterface(recorder), 1, (Object) null), ForwardingCameraControl.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, -819893854, true, new IAuthTabCallbackStub(lifecycleCameraProviderImplExternalSyntheticLambda2, 0, (Function0) pairOnNavigationEvent.IAuthTabCallback(), getbacktracenote, getbacktracenote2, getbacktracenote3, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback, removeobjectsforkeys, getbacktracenote4, shallowcopy, getbacktracenote5, rightPreset, getbacktracenote6, tointegerlist, getsupportedhighspeedresolutionsfor, r8lambdaaorak_euklu6wmr1tc7mrkxw5hy, removetrimmedemptystrings)), (component5) pairOnNavigationEvent.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 48, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackStubProxy();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(tryToStringMap trytostringmap, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final containsJSONObjectContainingInt.onExtraCallbackWithResult onextracallbackwithresult, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final getBacktraceNote getbacktracenote, final getBacktraceNote getbacktracenote2, final getBacktraceNote getbacktracenote3, final removeObjectsForKeys removeobjectsforkeys, final getBacktraceNote getbacktracenote4, final shallowCopy shallowcopy, final getBacktraceNote getbacktracenote5, final RightPreset rightPreset, final getBacktraceNote getbacktracenote6, final toIntegerList tointegerlist, final r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY r8lambdaaorak_euklu6wmr1tc7mrkxw5hy, final removeTrimmedEmptyStrings removetrimmedemptystrings, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted + 1;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onWarmupCompleted + 105;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = onNavigationEvent + 73;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 86 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1104812351, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.row.TdsAgreementV4Row.<anonymous> (TdsAgreementV4Row.kt:78)");
                }
                MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{Integer.valueOf(trytostringmap.onExtraCallback()), null, 0, 0, ForwardingCameraControl.onExtraCallback(-1683989341, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.compound.agreement.v4.row.TdsAgreementV4RowKt$$ExternalSyntheticLambda1
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        int i9 = 2 % 2;
                        int i10 = onExtraCallbackWithResult + 85;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitOnWarmupCompleted = toStringList.onWarmupCompleted(quirksExternalSyntheticBackport0, onextracallbackwithresult, getsupportedhighspeedresolutionsfor, getbacktracenote, getbacktracenote2, getbacktracenote3, removeobjectsforkeys, getbacktracenote4, shallowcopy, getbacktracenote5, rightPreset, getbacktracenote6, tointegerlist, r8lambdaaorak_euklu6wmr1tc7mrkxw5hy, removetrimmedemptystrings, (isContainerClickable) obj, (getSwitchMinWidth) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i12 = onExtraCallbackWithResult + 49;
                        onExtraCallback = i12 % 128;
                        int i13 = i12 % 2;
                        return unitOnWarmupCompleted;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 24576, 14}, 1823154464, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1823154460);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{Integer.valueOf(trytostringmap.onExtraCallback()), null, 0, 0, ForwardingCameraControl.onExtraCallback(-1683989341, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.compound.agreement.v4.row.TdsAgreementV4RowKt$$ExternalSyntheticLambda1
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        int i9 = 2 % 2;
                        int i10 = onExtraCallbackWithResult + 85;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitOnWarmupCompleted = toStringList.onWarmupCompleted(quirksExternalSyntheticBackport0, onextracallbackwithresult, getsupportedhighspeedresolutionsfor, getbacktracenote, getbacktracenote2, getbacktracenote3, removeobjectsforkeys, getbacktracenote4, shallowcopy, getbacktracenote5, rightPreset, getbacktracenote6, tointegerlist, r8lambdaaorak_euklu6wmr1tc7mrkxw5hy, removetrimmedemptystrings, (isContainerClickable) obj, (getSwitchMinWidth) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i12 = onExtraCallbackWithResult + 49;
                        onExtraCallback = i12 % 128;
                        int i13 = i12 % 2;
                        return unitOnWarmupCompleted;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 24576, 14}, 1823154464, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1823154460);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@Nullable getBacktraceNote<? super removeObjectsForKeys, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable tryToStringMap trytostringmap, @Nullable getBacktraceNote<? super toIntegerList, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable getBacktraceNote<? super shallowCopy, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4, @Nullable getBacktraceNote<? super removeTrimmedEmptyStrings, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5, @Nullable getBacktraceNote<? super r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        tryToStringMap trytostringmap2;
        int i4;
        getBacktraceNote<? super toIntegerList, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7;
        int i5;
        getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8;
        int i6;
        getBacktraceNote<? super shallowCopy, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote9;
        int i7;
        int i8;
        int i9;
        getBacktraceNote<? super r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote10;
        boolean z;
        final getBacktraceNote<? super toIntegerList, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote11;
        final getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote12;
        final getBacktraceNote<? super shallowCopy, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote13;
        getBacktraceNote<? super removeTrimmedEmptyStrings, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote14;
        final tryToStringMap trytostringmap3;
        final getBacktraceNote<? super r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote15;
        final getBacktraceNote<? super removeObjectsForKeys, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote16;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        getBacktraceNote<? super removeObjectsForKeys, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote17;
        int i10;
        final tryToStringMap trytostringmapOnExtraCallbackWithResult;
        getBacktraceNote<? super toIntegerList, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote18;
        getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote19;
        Object objOnMinimized;
        CameraPresenceProviderExternalSyntheticLambda0 cameraPresenceProviderExternalSyntheticLambda0;
        float fIAuthTabCallback;
        int i11 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1592456065);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                int i14 = onWarmupCompleted + 61;
                onNavigationEvent = i14 % 128;
                if (i14 % 2 != 0 ? (i2 & 4) != 0 : (i2 & 4) != 0) {
                    trytostringmap2 = trytostringmap;
                } else {
                    trytostringmap2 = trytostringmap;
                    int i15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(trytostringmap2) ? 256 : 128;
                    i3 |= i15;
                }
                i3 |= i15;
            } else {
                trytostringmap2 = trytostringmap;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    getbacktracenote7 = getbacktracenote2;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote7) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        int i16 = onWarmupCompleted + 99;
                        onNavigationEvent = i16 % 128;
                        int i17 = i16 % 2;
                        getbacktracenote8 = getbacktracenote3;
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote8) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                        getbacktracenote9 = getbacktracenote4;
                    } else {
                        getbacktracenote9 = getbacktracenote4;
                        if ((196608 & i) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote9)) {
                                int i18 = onWarmupCompleted + 125;
                                onNavigationEvent = i18 % 128;
                                int i19 = i18 % 2;
                                i7 = 131072;
                            } else {
                                i7 = 65536;
                            }
                            i3 |= i7;
                        }
                    }
                    i8 = i2 & 64;
                    if (i8 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote5) ? 1048576 : 524288;
                    }
                    i9 = i2 & 128;
                    if (i9 != 0) {
                        if ((i & 12582912) == 0) {
                            int i20 = onWarmupCompleted + 97;
                            onNavigationEvent = i20 % 128;
                            int i21 = i20 % 2;
                            getbacktracenote10 = getbacktracenote6;
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote10) ? 8388608 : 4194304;
                        }
                        if ((4793491 & i3) != 4793490) {
                            int i22 = onNavigationEvent + 51;
                            onWarmupCompleted = i22 % 128;
                            int i23 = i22 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                            if ((i & 1) != 0) {
                                int i24 = onWarmupCompleted + 29;
                                onNavigationEvent = i24 % 128;
                                if (i24 % 2 == 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage();
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                    if (i12 != 0) {
                                        int i25 = onWarmupCompleted + 97;
                                        onNavigationEvent = i25 % 128;
                                        int i26 = i25 % 2;
                                        getbacktracenote17 = null;
                                    } else {
                                        getbacktracenote17 = getbacktracenote;
                                    }
                                    if (i13 != 0) {
                                        quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                                    }
                                    if ((i2 & 4) != 0) {
                                        i10 = i9;
                                        trytostringmapOnExtraCallbackWithResult = toStringObjectMap.onExtraCallbackWithResult(null, null, 0, 0, 0, false, 0.0f, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 255);
                                        i3 &= -897;
                                    } else {
                                        i10 = i9;
                                        trytostringmapOnExtraCallbackWithResult = trytostringmap2;
                                    }
                                    getbacktracenote18 = i4 != 0 ? null : getbacktracenote2;
                                    getbacktracenote19 = i5 != 0 ? null : getbacktracenote3;
                                    getbacktracenote9 = i6 != 0 ? null : getbacktracenote4;
                                    getbacktracenote14 = i8 != 0 ? null : getbacktracenote5;
                                    if (i10 != 0) {
                                        getbacktracenote10 = null;
                                    }
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                    if ((i2 & 4) != 0) {
                                        i3 &= -897;
                                    }
                                    getbacktracenote17 = getbacktracenote;
                                    trytostringmapOnExtraCallbackWithResult = trytostringmap2;
                                    getbacktracenote19 = getbacktracenote8;
                                    getbacktracenote18 = getbacktracenote7;
                                    getbacktracenote14 = getbacktracenote5;
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1592456065, i3, -1, "im.toss.tds.compose.component.compound.agreement.v4.row.TdsAgreementV4Row (TdsAgreementV4Row.kt:40)");
                                }
                                final containsJSONObjectContainingInt.onExtraCallbackWithResult onExtraCallbackWithResult2 = trytostringmapOnExtraCallbackWithResult.onExtraCallbackWithResult();
                                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                                    if (getbacktracenote18 != null) {
                                        int i27 = onWarmupCompleted + 31;
                                        onNavigationEvent = i27 % 128;
                                        if (i27 % 2 == 0) {
                                            VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f);
                                            throw null;
                                        }
                                        fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f);
                                        cameraPresenceProviderExternalSyntheticLambda0 = null;
                                    } else {
                                        cameraPresenceProviderExternalSyntheticLambda0 = null;
                                        fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
                                    }
                                    objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback), cameraPresenceProviderExternalSyntheticLambda0, 2, cameraPresenceProviderExternalSyntheticLambda0);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                }
                                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                                float fOnWarmupCompleted = onWarmupCompleted(getsupportedhighspeedresolutionsfor);
                                boolean z2 = (((i3 & 896) ^ 384) > 256 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(trytostringmapOnExtraCallbackWithResult)) || (i3 & 384) == 256;
                                boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fOnWarmupCompleted);
                                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if ((z2 | zIAuthTabCallback) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized3 = new removeObjectsForKeys(trytostringmapOnExtraCallbackWithResult, onWarmupCompleted(getsupportedhighspeedresolutionsfor), null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                }
                                final removeObjectsForKeys removeobjectsforkeys = (removeObjectsForKeys) objOnMinimized3;
                                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized4 = new RightPreset(new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.row.TdsAgreementV4RowKt$$ExternalSyntheticLambda2
                                        private static int IAuthTabCallback = 0;
                                        private static int onNavigationEvent = 1;

                                        public final Object invoke(Object obj2) {
                                            int i28 = 2 % 2;
                                            int i29 = IAuthTabCallback + 93;
                                            onNavigationEvent = i29 % 128;
                                            int i30 = i29 % 2;
                                            tryToStringMap trytostringmap4 = trytostringmapOnExtraCallbackWithResult;
                                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                            if (i30 != 0) {
                                                return toStringList.IAuthTabCallback(trytostringmap4, zBooleanValue);
                                            }
                                            toStringList.IAuthTabCallback(trytostringmap4, zBooleanValue);
                                            Object obj3 = null;
                                            obj3.hashCode();
                                            throw null;
                                        }
                                    });
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                                }
                                final RightPreset rightPreset = (RightPreset) objOnMinimized4;
                                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onExtraCallbackWithResult2);
                                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (zOnNavigationEvent || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized5 = new shallowCopy(onExtraCallbackWithResult2);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                                }
                                final shallowCopy shallowcopy = (shallowCopy) objOnMinimized5;
                                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized6 = new removeTrimmedEmptyStrings();
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                                }
                                final removeTrimmedEmptyStrings removetrimmedemptystrings = (removeTrimmedEmptyStrings) objOnMinimized6;
                                float fOnWarmupCompleted2 = onWarmupCompleted(getsupportedhighspeedresolutionsfor);
                                int iOnWarmupCompleted = trytostringmapOnExtraCallbackWithResult.onWarmupCompleted();
                                boolean zIAuthTabCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fOnWarmupCompleted2);
                                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOnWarmupCompleted);
                                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!(zIAuthTabCallback2 | zOnExtraCallback)) {
                                    int i28 = onWarmupCompleted + 89;
                                    onNavigationEvent = i28 % 128;
                                    if (i28 % 2 == 0) {
                                        int i29 = 17 / 0;
                                        if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                                            objOnMinimized7 = new toIntegerList(trytostringmapOnExtraCallbackWithResult.onWarmupCompleted(), null, new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.row.TdsAgreementV4RowKt$$ExternalSyntheticLambda3
                                                private static int IAuthTabCallback = 0;
                                                private static int onExtraCallbackWithResult = 1;

                                                public final Object invoke(Object obj2) {
                                                    int i30 = 2 % 2;
                                                    int i31 = IAuthTabCallback + 95;
                                                    onExtraCallbackWithResult = i31 % 128;
                                                    int i32 = i31 % 2;
                                                    Unit unitOnWarmupCompleted = toStringList.onWarmupCompleted(getsupportedhighspeedresolutionsfor, (VirtualCameraInfo) obj2);
                                                    int i33 = IAuthTabCallback + 55;
                                                    onExtraCallbackWithResult = i33 % 128;
                                                    int i34 = i33 % 2;
                                                    return unitOnWarmupCompleted;
                                                }
                                            }, 2, null);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                                        }
                                        final toIntegerList tointegerlist = (toIntegerList) objOnMinimized7;
                                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                                            objOnMinimized = new r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY();
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                        }
                                        final r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY r8lambdaaorak_euklu6wmr1tc7mrkxw5hy = (r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY) objOnMinimized;
                                        final tryToStringMap trytostringmap4 = trytostringmapOnExtraCallbackWithResult;
                                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                                        final getBacktraceNote<? super removeObjectsForKeys, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote20 = getbacktracenote17;
                                        final getBacktraceNote<? super r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote21 = getbacktracenote10;
                                        final getBacktraceNote<? super removeTrimmedEmptyStrings, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote22 = getbacktracenote14;
                                        final getBacktraceNote<? super shallowCopy, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote23 = getbacktracenote9;
                                        final getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote24 = getbacktracenote19;
                                        final getBacktraceNote<? super toIntegerList, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote25 = getbacktracenote18;
                                        setPostviewFormatSelector.onNavigationEvent(onExtraCallback.onExtraCallback(Float.valueOf(trytostringmapOnExtraCallbackWithResult.IAuthTabCallback())), ForwardingCameraControl.onExtraCallback(-1104812351, true, new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.row.TdsAgreementV4RowKt$$ExternalSyntheticLambda4
                                            private static int IAuthTabCallback = 1;
                                            private static int onNavigationEvent;

                                            public final Object invoke(Object obj2, Object obj3) {
                                                int i30 = 2 % 2;
                                                int i31 = onNavigationEvent + 97;
                                                IAuthTabCallback = i31 % 128;
                                                int i32 = i31 % 2;
                                                Object[] objArr = {trytostringmap4, quirksExternalSyntheticBackport03, onExtraCallbackWithResult2, getsupportedhighspeedresolutionsfor, getbacktracenote20, getbacktracenote21, getbacktracenote22, removeobjectsforkeys, getbacktracenote23, shallowcopy, getbacktracenote24, rightPreset, getbacktracenote25, tointegerlist, r8lambdaaorak_euklu6wmr1tc7mrkxw5hy, removetrimmedemptystrings, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                                                int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                                                Unit unit = (Unit) toStringList.onNavigationEvent(1356521137, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), objArr, -1356521134, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted2);
                                                int i33 = IAuthTabCallback + 119;
                                                onNavigationEvent = i33 % 128;
                                                if (i33 % 2 == 0) {
                                                    return unit;
                                                }
                                                Object obj4 = null;
                                                obj4.hashCode();
                                                throw null;
                                            }
                                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                        trytostringmap3 = trytostringmapOnExtraCallbackWithResult;
                                        getbacktracenote11 = getbacktracenote18;
                                        getbacktracenote12 = getbacktracenote19;
                                        getbacktracenote13 = getbacktracenote9;
                                        getbacktracenote15 = getbacktracenote10;
                                        getbacktracenote16 = getbacktracenote17;
                                    } else {
                                        if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                                        }
                                        final toIntegerList tointegerlist2 = (toIntegerList) objOnMinimized7;
                                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                                        }
                                        final r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY r8lambdaaorak_euklu6wmr1tc7mrkxw5hy2 = (r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY) objOnMinimized;
                                        final tryToStringMap trytostringmap42 = trytostringmapOnExtraCallbackWithResult;
                                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport032 = quirksExternalSyntheticBackport02;
                                        final getBacktraceNote getbacktracenote202 = getbacktracenote17;
                                        final getBacktraceNote getbacktracenote212 = getbacktracenote10;
                                        final getBacktraceNote getbacktracenote222 = getbacktracenote14;
                                        final getBacktraceNote getbacktracenote232 = getbacktracenote9;
                                        final getBacktraceNote getbacktracenote242 = getbacktracenote19;
                                        final getBacktraceNote getbacktracenote252 = getbacktracenote18;
                                        setPostviewFormatSelector.onNavigationEvent(onExtraCallback.onExtraCallback(Float.valueOf(trytostringmapOnExtraCallbackWithResult.IAuthTabCallback())), ForwardingCameraControl.onExtraCallback(-1104812351, true, new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.row.TdsAgreementV4RowKt$$ExternalSyntheticLambda4
                                            private static int IAuthTabCallback = 1;
                                            private static int onNavigationEvent;

                                            public final Object invoke(Object obj2, Object obj3) {
                                                int i30 = 2 % 2;
                                                int i31 = onNavigationEvent + 97;
                                                IAuthTabCallback = i31 % 128;
                                                int i32 = i31 % 2;
                                                Object[] objArr = {trytostringmap42, quirksExternalSyntheticBackport032, onExtraCallbackWithResult2, getsupportedhighspeedresolutionsfor, getbacktracenote202, getbacktracenote212, getbacktracenote222, removeobjectsforkeys, getbacktracenote232, shallowcopy, getbacktracenote242, rightPreset, getbacktracenote252, tointegerlist2, r8lambdaaorak_euklu6wmr1tc7mrkxw5hy2, removetrimmedemptystrings, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                                                int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                                                Unit unit = (Unit) toStringList.onNavigationEvent(1356521137, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), objArr, -1356521134, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted2);
                                                int i33 = IAuthTabCallback + 119;
                                                onNavigationEvent = i33 % 128;
                                                if (i33 % 2 == 0) {
                                                    return unit;
                                                }
                                                Object obj4 = null;
                                                obj4.hashCode();
                                                throw null;
                                            }
                                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        }
                                        trytostringmap3 = trytostringmapOnExtraCallbackWithResult;
                                        getbacktracenote11 = getbacktracenote18;
                                        getbacktracenote12 = getbacktracenote19;
                                        getbacktracenote13 = getbacktracenote9;
                                        getbacktracenote15 = getbacktracenote10;
                                        getbacktracenote16 = getbacktracenote17;
                                    }
                                }
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            getbacktracenote11 = getbacktracenote2;
                            getbacktracenote12 = getbacktracenote3;
                            getbacktracenote13 = getbacktracenote4;
                            getbacktracenote14 = getbacktracenote5;
                            trytostringmap3 = trytostringmap2;
                            getbacktracenote15 = getbacktracenote10;
                            getbacktracenote16 = getbacktracenote;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                            final getBacktraceNote<? super removeTrimmedEmptyStrings, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote26 = getbacktracenote14;
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.row.TdsAgreementV4RowKt$$ExternalSyntheticLambda5
                                private static int onExtraCallback = 0;
                                private static int onExtraCallbackWithResult = 1;

                                public final Object invoke(Object obj2, Object obj3) {
                                    int i30 = 2 % 2;
                                    int i31 = onExtraCallback + 71;
                                    onExtraCallbackWithResult = i31 % 128;
                                    int i32 = i31 % 2;
                                    Unit unitOnExtraCallback = toStringList.onExtraCallback(getbacktracenote16, quirksExternalSyntheticBackport04, trytostringmap3, getbacktracenote11, getbacktracenote12, getbacktracenote13, getbacktracenote26, getbacktracenote15, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    int i33 = onExtraCallback + 63;
                                    onExtraCallbackWithResult = i33 % 128;
                                    if (i33 % 2 == 0) {
                                        int i34 = 56 / 0;
                                    }
                                    return unitOnExtraCallback;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    int i30 = onWarmupCompleted + 119;
                    onNavigationEvent = i30 % 128;
                    if (i30 % 2 == 0) {
                        throw null;
                    }
                    i3 |= 12582912;
                    getbacktracenote10 = getbacktracenote6;
                    if ((4793491 & i3) != 4793490) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                getbacktracenote8 = getbacktracenote3;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                i9 = i2 & 128;
                if (i9 != 0) {
                }
                getbacktracenote10 = getbacktracenote6;
                if ((4793491 & i3) != 4793490) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            getbacktracenote7 = getbacktracenote2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            getbacktracenote8 = getbacktracenote3;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            i9 = i2 & 128;
            if (i9 != 0) {
            }
            getbacktracenote10 = getbacktracenote6;
            if ((4793491 & i3) != 4793490) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        getbacktracenote7 = getbacktracenote2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        getbacktracenote8 = getbacktracenote3;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        i9 = i2 & 128;
        if (i9 != 0) {
        }
        getbacktracenote10 = getbacktracenote6;
        if ((4793491 & i3) != 4793490) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final float onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<VirtualCameraControlExternalSyntheticLambda1> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1 = (VirtualCameraControlExternalSyntheticLambda1) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            return virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
        }
        virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
        throw null;
    }

    private static final float onWarmupCompleted(getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1 = (VirtualCameraControlExternalSyntheticLambda1) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
            throw null;
        }
        float fIAuthTabCallback = virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
        int i4 = onNavigationEvent + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return fIAuthTabCallback;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1> getsupportedhighspeedresolutionsfor, float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f));
        } else {
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f));
            throw null;
        }
    }

    public static /* synthetic */ updateFocusedState onExtraCallbackWithResult(getSwitchMinWidth getswitchminwidth, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getswitchminwidth, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (updateFocusedState) onNavigationEvent(-937781130, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), objArr, 937781132, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted);
    }

    public static /* synthetic */ Unit IAuthTabCallback(tryToStringMap trytostringmap, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, containsJSONObjectContainingInt.onExtraCallbackWithResult onextracallbackwithresult, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, removeObjectsForKeys removeobjectsforkeys, getBacktraceNote getbacktracenote4, shallowCopy shallowcopy, getBacktraceNote getbacktracenote5, RightPreset rightPreset, getBacktraceNote getbacktracenote6, toIntegerList tointegerlist, r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY r8lambdaaorak_euklu6wmr1tc7mrkxw5hy, removeTrimmedEmptyStrings removetrimmedemptystrings, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {trytostringmap, quirksExternalSyntheticBackport0, onextracallbackwithresult, getsupportedhighspeedresolutionsfor, getbacktracenote, getbacktracenote2, getbacktracenote3, removeobjectsforkeys, getbacktracenote4, shallowcopy, getbacktracenote5, rightPreset, getbacktracenote6, tointegerlist, r8lambdaaorak_euklu6wmr1tc7mrkxw5hy, removetrimmedemptystrings, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (Unit) onNavigationEvent(1356521137, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), objArr, -1356521134, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted);
    }

    private static final Unit onWarmupCompleted(getBacktraceNote getbacktracenote, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, tryToStringMap trytostringmap, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, getBacktraceNote getbacktracenote4, getBacktraceNote getbacktracenote5, getBacktraceNote getbacktracenote6, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {getbacktracenote, quirksExternalSyntheticBackport0, trytostringmap, getbacktracenote2, getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (Unit) onNavigationEvent(1772702352, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), objArr, -1772702352, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted);
    }

    public static final accessisMonitoringp<Float> onExtraCallback() {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (accessisMonitoringp) onNavigationEvent(813075283, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted2, new Object[0], -813075282, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted);
    }

    public static final class IAuthTabCallbackDefault implements Function0<Integer> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ getSwitchMinWidth onWarmupCompleted;

        public IAuthTabCallbackDefault(getSwitchMinWidth getswitchminwidth) {
            this.onWarmupCompleted = getswitchminwidth;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Integer, java.lang.Object] */
        public final Integer invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ?? Access000 = this.onWarmupCompleted.access000();
            if (i3 != 0) {
                int i4 = 47 / 0;
            }
            return Access000;
        }
    }

    public static final class asBinder implements Function0<getSwitchMinWidth.onExtraCallback<Integer>> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getSwitchMinWidth onExtraCallbackWithResult;

        public asBinder(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallbackWithResult = getswitchminwidth;
        }

        public final getSwitchMinWidth.onExtraCallback<Integer> IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth getswitchminwidth = this.onExtraCallbackWithResult;
            if (i3 == 0) {
                return getswitchminwidth.IAuthTabCallbackDefault();
            }
            getswitchminwidth.IAuthTabCallbackDefault();
            throw null;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<Integer> onextracallbackIAuthTabCallback = IAuthTabCallback();
            int i4 = IAuthTabCallback + 41;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackIAuthTabCallback;
            }
            throw null;
        }
    }
}
