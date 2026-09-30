package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$;
import im.toss.tds.compose.component.compound.listheader.v3.RightPreset;
import im.toss.tds.view.R;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.areAllItemsEnabled;
import o.getBacktraceNote;
import o.getHumanReadableName;
import o.getStreamSharingChildren;
import o.initSDK;
import o.noStore;
import o.oExternalSyntheticLambda0;
import o.putCharSequenceArray;
import o.toPreviewOnlyRange;
import o.w0a;
import o.w2;
import o.wa;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class w2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws NoWhenBranchMatchedException {
        int i7 = ~i2;
        int i8 = ~i;
        int i9 = (~(i8 | i3)) | i7;
        int i10 = (~(i7 | (~i3) | i)) | (~(i8 | i7 | i3));
        int i11 = (~(i3 | i)) | (~(i2 | i));
        int i12 = i2 + i + i5 + ((-1520811122) * i4) + (1880343047 * i6);
        int i13 = i12 * i12;
        int i14 = (((-88056299) * i2) - 1254686720) + (875799021 * i) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i5) + ((-206831616) * i4) + (408289280 * i6) + ((-683737088) * i13);
        int i15 = ((i2 * (-660833811)) - 1995073173) + (i * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + (i5 * (-660833671)) + (i4 * 644061726) + (i6 * (-2012083377)) + (i13 * (-1027145728));
        switch (i14 + (i15 * i15 * 814809088)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                float fFloatValue = ((Number) objArr[0]).floatValue();
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
                int iIntValue = ((Number) objArr[3]).intValue();
                Object obj = objArr[4];
                int i16 = 2 % 2;
                if ((iIntValue & 2) != 0) {
                    int i17 = IAuthTabCallback + 17;
                    onExtraCallbackWithResult = i17 % 128;
                    int i18 = i17 % 2;
                    zBooleanValue = false;
                }
                if ((4 & iIntValue) != 0) {
                    int i19 = onExtraCallbackWithResult + 57;
                    IAuthTabCallback = i19 % 128;
                    zBooleanValue2 = i19 % 2 == 0;
                }
                return onExtraCallbackWithResult(fFloatValue, zBooleanValue, zBooleanValue2);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return onTransact(objArr);
            case 11:
                return access000(objArr);
            case 12:
                return getInterfaceDescriptor(objArr);
            case 13:
                return IAuthTabCallback_Parcel(objArr);
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            case 15:
                wa.IAuthTabCallback iAuthTabCallback = (wa.IAuthTabCallback) objArr[0];
                wa.onTransact ontransact = (wa.onTransact) objArr[1];
                getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[2];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
                int iIntValue2 = ((Number) objArr[4]).intValue();
                int i20 = 2 % 2;
                int i21 = onExtraCallbackWithResult + 55;
                IAuthTabCallback = i21 % 128;
                int i22 = i21 % 2;
                Unit unitOnWarmupCompleted = onWarmupCompleted(iAuthTabCallback, ontransact, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
                int i23 = IAuthTabCallback + 67;
                onExtraCallbackWithResult = i23 % 128;
                int i24 = i23 % 2;
                return unitOnWarmupCompleted;
            case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                return access100(objArr);
            case R.styleable.TdsListRowV1View_centerType /* 17 */:
                w0a w0aVar = (w0a) objArr[0];
                int iIntValue3 = ((Number) objArr[1]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue4 = ((Number) objArr[3]).intValue();
                int i25 = 2 % 2;
                int i26 = onExtraCallbackWithResult + 25;
                IAuthTabCallback = i26 % 128;
                int i27 = i26 % 2;
                Unit unitIAuthTabCallback = IAuthTabCallback(w0aVar, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue4);
                int i28 = onExtraCallbackWithResult + 65;
                IAuthTabCallback = i28 % 128;
                int i29 = i28 % 2;
                return unitIAuthTabCallback;
            case R.styleable.TdsListRowV1View_disabledType /* 18 */:
                return writeTypedObject(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str = (String) objArr[0];
        w0a w0aVar = (w0a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, w0aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitAsBinder = asBinder(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit IAuthTabCallback(RightPreset rightPreset, Function0 function0, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            onWarmupCompleted(rightPreset, function0, z, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(rightPreset, function0, z, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(areAllItemsEnabled areallitemsenabled, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return onNavigationEvent(areallitemsenabled, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onNavigationEvent(areallitemsenabled, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    private static final Unit IAuthTabCallback(w0a w0aVar, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(w0aVar, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(wa.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            onExtraCallback(iAuthTabCallback, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(iAuthTabCallback, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(boolean z, Function0 function0, String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(z, function0, str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 71 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static final Unit IAuthTabCallbackDefault(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallbackStub(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        areAllItemsEnabled areallitemsenabled = (areAllItemsEnabled) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) throws NoWhenBranchMatchedException {
        String str = (String) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue3 = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, quirksExternalSyntheticBackport0, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i4 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object access000(Object[] objArr) throws NoWhenBranchMatchedException {
        putCharSequenceArray putcharsequencearray = (putCharSequenceArray) objArr[0];
        wa.IAuthTabCallback iAuthTabCallback = (wa.IAuthTabCallback) objArr[1];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[2];
        wa.onTransact ontransact = (wa.onTransact) objArr[3];
        float fFloatValue = ((Number) objArr[4]).floatValue();
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[5];
        wa.onWarmupCompleted onwarmupcompleted = (wa.onWarmupCompleted) objArr[6];
        wa.onExtraCallbackWithResult onextracallbackwithresult = (wa.onExtraCallbackWithResult) objArr[7];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(putcharsequencearray, iAuthTabCallback, getbacktracenote, ontransact, fFloatValue, getbacktracenote2, onwarmupcompleted, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(putcharsequencearray, iAuthTabCallback, getbacktracenote, ontransact, fFloatValue, getbacktracenote2, onwarmupcompleted, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        putCharSequenceArray putcharsequencearray = (putCharSequenceArray) objArr[0];
        wa.IAuthTabCallback iAuthTabCallback = (wa.IAuthTabCallback) objArr[1];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[2];
        wa.onTransact ontransact = (wa.onTransact) objArr[3];
        float fFloatValue = ((Number) objArr[4]).floatValue();
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[5];
        wa.onWarmupCompleted onwarmupcompleted = (wa.onWarmupCompleted) objArr[6];
        wa.onExtraCallbackWithResult onextracallbackwithresult = (wa.onExtraCallbackWithResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(1167922462, new Object[]{putcharsequencearray, iAuthTabCallback, getbacktracenote, ontransact, Float.valueOf(fFloatValue), getbacktracenote2, onwarmupcompleted, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1))}, -1167922461, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
        } else {
            IAuthTabCallback(1167922462, new Object[]{putcharsequencearray, iAuthTabCallback, getbacktracenote, ontransact, Float.valueOf(fFloatValue), getbacktracenote2, onwarmupcompleted, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1))}, -1167922461, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onTransact(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        }
        onTransact(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        throw null;
    }

    private static final Unit asBinder(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i4 % 128;
        asInterface(cameraCaptureResultEmptyCameraCaptureResult, i4 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        String str = (String) objArr[0];
        areAllItemsEnabled areallitemsenabled = (areAllItemsEnabled) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(str, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit asInterface(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i4 % 128;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i4 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        int i5 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return unitAsInterface;
    }

    public static final /* synthetic */ String onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return onTransact(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onTransact(cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return IAuthTabCallbackDefault(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        IAuthTabCallbackDefault(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    private static final Unit onExtraCallback(String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(str, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(getBacktraceNote getbacktracenote, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, wa.onTransact ontransact, wa.IAuthTabCallback iAuthTabCallback, float f, wa.onNavigationEvent onnavigationevent, getBacktraceNote getbacktracenote2, float f2, getBacktraceNote getbacktracenote3, wa.onWarmupCompleted onwarmupcompleted, wa.onExtraCallbackWithResult onextracallbackwithresult, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i6 % 128;
        onExtraCallbackWithResult((getBacktraceNote<? super areAllItemsEnabled, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, ontransact, iAuthTabCallback, f, onnavigationevent, (getBacktraceNote<? super w0a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote2, f2, (getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote3, onwarmupcompleted, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, i6 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 86 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(getHumanReadableName gethumanreadablename, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getBacktraceNote getbacktracenote, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            onExtraCallbackWithResult(gethumanreadablename, cameraPresenceProviderExternalSyntheticLambda6, getbacktracenote, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(gethumanreadablename, cameraPresenceProviderExternalSyntheticLambda6, getbacktracenote, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ boolean onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
            obj.hashCode();
            throw null;
        }
        boolean zIAuthTabCallback = IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        int i3 = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return zIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, wa.IAuthTabCallback iAuthTabCallback, float f, wa.onNavigationEvent onnavigationevent, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, wa.onTransact ontransact, float f2, getBacktraceNote getbacktracenote3, wa.onWarmupCompleted onwarmupcompleted, wa.onExtraCallbackWithResult onextracallbackwithresult, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, iAuthTabCallback, f, onnavigationevent, getbacktracenote, getbacktracenote2, ontransact, f2, getbacktracenote3, onwarmupcompleted, onextracallbackwithresult, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return onWarmupCompleted(getbacktracenote, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(getbacktracenote, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(wa.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(iAuthTabCallback, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iAsBinder = asBinder(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        return Integer.valueOf(iAsBinder);
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, w0a w0aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, w0aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, wa.IAuthTabCallback iAuthTabCallback, float f, wa.onNavigationEvent onnavigationevent, getBacktraceNote getbacktracenote, putCharSequenceArray putcharsequencearray, getBacktraceNote getbacktracenote2, wa.onTransact ontransact, float f2, getBacktraceNote getbacktracenote3, wa.onWarmupCompleted onwarmupcompleted, wa.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            onExtraCallback(quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, deviceQuirksExternalSyntheticLambda0, iAuthTabCallback, f, onnavigationevent, getbacktracenote, putcharsequencearray, getbacktracenote2, ontransact, f2, getbacktracenote3, onwarmupcompleted, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, deviceQuirksExternalSyntheticLambda0, iAuthTabCallback, f, onnavigationevent, getbacktracenote, putcharsequencearray, getbacktracenote2, ontransact, f2, getbacktracenote3, onwarmupcompleted, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(areAllItemsEnabled areallitemsenabled, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(wa.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(iAuthTabCallback, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(wa.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) IAuthTabCallback(1665016886, new Object[]{iAuthTabCallback, getbacktracenote, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -1665016877, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
        int i5 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(wa.IAuthTabCallback iAuthTabCallback, wa.onTransact ontransact, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(iAuthTabCallback, ontransact, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static final /* synthetic */ void onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, z);
        int i4 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(w0a w0aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback(w0aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws NoWhenBranchMatchedException {
        String str = (String) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(str, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue, iIntValue2);
        int i4 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static final Unit onTransact(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i4 % 128;
        onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i4 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws NoWhenBranchMatchedException {
        RightPreset rightPreset = (RightPreset) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(rightPreset, (Function0<Unit>) function0, zBooleanValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue, iIntValue2);
        int i4 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            IAuthTabCallbackStub(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onExtraCallbackWithResult + 25;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(RightPreset rightPreset, Function0 function0, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(rightPreset, (Function0<Unit>) function0, z, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getBacktraceNote getbacktracenote, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, wa.onTransact ontransact, wa.IAuthTabCallback iAuthTabCallback, float f, wa.onNavigationEvent onnavigationevent, getBacktraceNote getbacktracenote2, float f2, getBacktraceNote getbacktracenote3, wa.onWarmupCompleted onwarmupcompleted, wa.onExtraCallbackWithResult onextracallbackwithresult, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getbacktracenote, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, ontransact, iAuthTabCallback, f, onnavigationevent, getbacktracenote2, f2, getbacktracenote3, onwarmupcompleted, onextracallbackwithresult, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(wa.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(iAuthTabCallback, getbacktracenote, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 67 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, Function0 function0, String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            onExtraCallback(z, function0, str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(z, function0, str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        putCharSequenceArray putcharsequencearray = (putCharSequenceArray) objArr[0];
        wa.IAuthTabCallback iAuthTabCallback = (wa.IAuthTabCallback) objArr[1];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[2];
        wa.onTransact ontransact = (wa.onTransact) objArr[3];
        float fFloatValue = ((Number) objArr[4]).floatValue();
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[5];
        wa.onWarmupCompleted onwarmupcompleted = (wa.onWarmupCompleted) objArr[6];
        wa.onExtraCallbackWithResult onextracallbackwithresult = (wa.onExtraCallbackWithResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue2 = ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(-936360999, new Object[]{putcharsequencearray, iAuthTabCallback, getbacktracenote, ontransact, Float.valueOf(fFloatValue), getbacktracenote2, onwarmupcompleted, onextracallbackwithresult, Integer.valueOf(iIntValue), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue2)}, 936361015, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
        int i4 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        getBacktraceNote getbacktracenote;
        boolean z;
        getBacktraceNote getbacktracenote2;
        final String str = (String) objArr[0];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[1];
        wa.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = (wa.IAuthTabCallback) objArr[2];
        wa.onTransact ontransactOnExtraCallback = (wa.onTransact) objArr[3];
        float fFloatValue = ((Number) objArr[4]).floatValue();
        wa.onNavigationEvent onnavigationeventIAuthTabCallback = (wa.onNavigationEvent) objArr[5];
        final String str2 = (String) objArr[6];
        wa.IAuthTabCallbackStub iAuthTabCallbackStubOnWarmupCompleted = (wa.IAuthTabCallbackStub) objArr[7];
        wa.onExtraCallback onExtraCallback = (wa.onExtraCallback) objArr[8];
        final String str3 = (String) objArr[9];
        Function0 function0 = (Function0) objArr[10];
        boolean zBooleanValue = ((Boolean) objArr[11]).booleanValue();
        wa.onExtraCallbackWithResult onExtraCallbackWithResult2 = (wa.onExtraCallbackWithResult) objArr[12];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[13];
        int iIntValue = ((Number) objArr[14]).intValue();
        int iIntValue2 = ((Number) objArr[15]).intValue();
        int iIntValue3 = ((Number) objArr[16]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((iIntValue3 & 2) != 0) {
            int i2 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onextracallback = QuirksExternalSyntheticBackport0.Companion;
                int i3 = 96 / 0;
            } else {
                onextracallback = QuirksExternalSyntheticBackport0.Companion;
            }
        }
        if ((iIntValue3 & 4) != 0) {
            int i4 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                wa.IAuthTabCallback.Companion.onExtraCallbackWithResult();
                throw null;
            }
            iAuthTabCallbackOnExtraCallbackWithResult = wa.IAuthTabCallback.Companion.onExtraCallbackWithResult();
        }
        if ((iIntValue3 & 8) != 0) {
            ontransactOnExtraCallback = wa.onTransact.Companion.onExtraCallback();
        }
        if ((iIntValue3 & 16) != 0) {
            fFloatValue = 0.6f;
        }
        float f = fFloatValue;
        if ((iIntValue3 & 32) != 0) {
            onnavigationeventIAuthTabCallback = wa.onNavigationEvent.Companion.IAuthTabCallback();
        }
        wa.onNavigationEvent onnavigationevent = onnavigationeventIAuthTabCallback;
        if ((iIntValue3 & 64) != 0) {
            int i5 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            str2 = null;
        }
        if ((iIntValue3 & 128) != 0) {
            iAuthTabCallbackStubOnWarmupCompleted = wa.IAuthTabCallbackStub.Companion.onWarmupCompleted();
        }
        wa.IAuthTabCallbackStub iAuthTabCallbackStub = iAuthTabCallbackStubOnWarmupCompleted;
        if ((iIntValue3 & 256) != 0) {
            onExtraCallback = wa.onExtraCallback.Companion.onExtraCallback();
        }
        wa.onExtraCallback onextracallback2 = onExtraCallback;
        if ((iIntValue3 & 512) != 0) {
            str3 = null;
        }
        final Function0 function02 = (iIntValue3 & 1024) != 0 ? null : function0;
        final boolean z2 = (iIntValue3 & 2048) != 0 ? false : zBooleanValue;
        if ((iIntValue3 & 4096) != 0) {
            onExtraCallbackWithResult2 = wa.onExtraCallbackWithResult.Companion.onExtraCallbackWithResult();
        }
        wa.onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-775247869, iIntValue, iIntValue2, "im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3 (TdsListHeaderV3.kt:307)");
            int i7 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        if (str2 == null || StringsKt.isBlank(str2)) {
            str2 = null;
        }
        if (str2 == null) {
            int i9 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1368963446);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            getbacktracenote = null;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1368963445);
            getBacktraceNote getbacktracenoteOnExtraCallback = ForwardingCameraControl.onExtraCallback(1888370256, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda27
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit unitOnNavigationEvent;
                    int i11 = 2 % 2;
                    int i12 = IAuthTabCallback + 11;
                    onNavigationEvent = i12 % 128;
                    if (i12 % 2 == 0) {
                        unitOnNavigationEvent = w2.onNavigationEvent(str2, (w0a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i13 = 50 / 0;
                    } else {
                        unitOnNavigationEvent = w2.onNavigationEvent(str2, (w0a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    int i14 = onNavigationEvent + 111;
                    IAuthTabCallback = i14 % 128;
                    int i15 = i14 % 2;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            getbacktracenote = getbacktracenoteOnExtraCallback;
        }
        if (str3 != null) {
            int i11 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 32 / 0;
                if (StringsKt.isBlank(str3)) {
                    str3 = null;
                }
            } else if (StringsKt.isBlank(str3)) {
            }
        }
        if (str3 == null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1368789815);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            getbacktracenote2 = null;
            z = true;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1368789814);
            getBacktraceNote getbacktracenote3 = new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda28
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                    int i13 = 2 % 2;
                    int i14 = IAuthTabCallback + 75;
                    onNavigationEvent = i14 % 128;
                    int i15 = i14 % 2;
                    Unit unitIAuthTabCallback = w2.IAuthTabCallback(z2, function02, str3, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i16 = onNavigationEvent + 81;
                    IAuthTabCallback = i16 % 128;
                    int i17 = i16 % 2;
                    return unitIAuthTabCallback;
                }
            };
            z = true;
            getBacktraceNote getbacktracenoteOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(370026159, true, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, 54);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            getbacktracenote2 = getbacktracenoteOnExtraCallback2;
        }
        IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-142806292, z, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda29
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i13 = 2 % 2;
                int i14 = onExtraCallbackWithResult + 7;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2;
                String str4 = str;
                areAllItemsEnabled areallitemsenabled = (areAllItemsEnabled) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (i15 != 0) {
                    return w2.IAuthTabCallback(str4, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue4);
                }
                w2.IAuthTabCallback(str4, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue4);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), onextracallback, ontransactOnExtraCallback, iAuthTabCallbackOnExtraCallbackWithResult, f, onnavigationevent, getbacktracenote, iAuthTabCallbackStub, onextracallback2, getbacktracenote2, null, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue & 112) | 6 | ((iIntValue >> 3) & 896) | ((iIntValue << 3) & 7168) | (57344 & iIntValue) | (458752 & iIntValue) | (29360128 & iIntValue) | (234881024 & iIntValue), (iIntValue2 >> 3) & 112, 1024);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return null;
    }

    private static final Unit onExtraCallbackWithResult(String str, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(areallitemsenabled, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(areallitemsenabled)) {
                int i5 = IAuthTabCallback + 41;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
            int i7 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i9 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-142806292, i2, -1, "im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3.<anonymous> (TdsListHeaderV3.kt:309)");
            }
            areallitemsenabled.onWarmupCompleted(str, null, null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 18) & 3670016, 62);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = IAuthTabCallback + 51;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(String str, w0a w0aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w0aVar, "");
        boolean z = true;
        if ((i & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w0aVar)) {
                i3 = 2;
            } else {
                int i5 = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            }
            i2 = i3 | i;
            int i7 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i9 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onExtraCallbackWithResult + 5;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1888370256, i2, -1, "im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3.<anonymous>.<anonymous> (TdsListHeaderV3.kt:315)");
            }
            w0aVar.onExtraCallback(str, null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 15) & 458752, 30);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(boolean z, Function0 function0, String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        oExternalSyntheticLambda0.IAuthTabCallback IAuthTabCallback2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            int i5 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                i3 = 2;
            } else {
                int i7 = IAuthTabCallback;
                int i8 = i7 + 45;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                int i10 = i7 + 123;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                i3 = 4;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = IAuthTabCallback + 83;
                onExtraCallbackWithResult = i12 % 128;
                if (i12 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(370026159, i2, -1, "im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3.<anonymous>.<anonymous> (TdsListHeaderV3.kt:320)");
                    int i13 = 61 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(370026159, i2, -1, "im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3.<anonymous>.<anonymous> (TdsListHeaderV3.kt:320)");
                }
            }
            if (z || function0 != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1731681705);
                Object obj = null;
                if (!z) {
                    IAuthTabCallback2 = null;
                } else {
                    int i14 = IAuthTabCallback + 51;
                    onExtraCallbackWithResult = i14 % 128;
                    if (i14 % 2 != 0) {
                        oExternalSyntheticLambda0.IAuthTabCallback.Companion.IAuthTabCallback();
                        obj.hashCode();
                        throw null;
                    }
                    IAuthTabCallback2 = oExternalSyntheticLambda0.IAuthTabCallback.Companion.IAuthTabCallback();
                }
                rightPreset.IAuthTabCallback(str, null, 0L, null, IAuthTabCallback2, 0L, null, 0L, null, null, function0, cameraCaptureResultEmptyCameraCaptureResult, 0, (i2 << 3) & 112, 1006);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1731432093);
                rightPreset.onExtraCallbackWithResult(str, (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, 0L, 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 18) & 3670016, 62);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i15 = onExtraCallbackWithResult + 107;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(String str, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(areallitemsenabled, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(areallitemsenabled)) {
                int i5 = IAuthTabCallback + 11;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                int i7 = onExtraCallbackWithResult + 91;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i9 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = IAuthTabCallback + 101;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-563020587, i2, -1, "im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3.<anonymous> (TdsListHeaderV3.kt:353)");
                int i13 = IAuthTabCallback + 107;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
            }
            areallitemsenabled.onWarmupCompleted(str, null, null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 18) & 3670016, 62);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(String str, w0a w0aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w0aVar, "");
        boolean z = true;
        if ((i & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w0aVar)) {
                int i5 = onExtraCallbackWithResult + 17;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i9 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1201509135, i2, -1, "im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3.<anonymous>.<anonymous> (TdsListHeaderV3.kt:359)");
            }
            w0aVar.onExtraCallback(str, null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 15) & 458752, 30);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(boolean z, Function0 function0, String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                int i5 = onExtraCallbackWithResult + 113;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = IAuthTabCallback;
            int i8 = i7 + 43;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 21;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 4 / 4;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i2 & 1)) {
            int i12 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-292151630, i2, -1, "im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3.<anonymous>.<anonymous> (TdsListHeaderV3.kt:364)");
            }
            if (!z) {
                int i13 = onExtraCallbackWithResult + 87;
                IAuthTabCallback = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
                if (function0 == null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1885153664);
                    rightPreset.onExtraCallbackWithResult(str, (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, 0L, 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 18) & 3670016, 62);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    int i14 = IAuthTabCallback + 25;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1885403276);
                    rightPreset.IAuthTabCallback(str, null, 0L, null, z ? oExternalSyntheticLambda0.IAuthTabCallback.Companion.IAuthTabCallback() : null, 0L, null, 0L, null, null, function0, cameraCaptureResultEmptyCameraCaptureResult, 0, (i2 << 3) & 112, 1006);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final void IAuthTabCallback(@NotNull getBacktraceNote<? super areAllItemsEnabled, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable wa.onTransact ontransact, @Nullable wa.IAuthTabCallback iAuthTabCallback, float f, @Nullable wa.onNavigationEvent onnavigationevent, @Nullable getBacktraceNote<? super w0a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable wa.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable wa.onExtraCallback onextracallback, @Nullable getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable wa.onWarmupCompleted onwarmupcompleted, @Nullable wa.onExtraCallbackWithResult onextracallbackwithresult, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        wa.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult;
        wa.onExtraCallback onExtraCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 53;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        if ((i3 & 2) != 0) {
            int i7 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                int i8 = 6 / 0;
            } else {
                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
            }
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        wa.onTransact ontransactOnExtraCallback = (i3 & 4) != 0 ? wa.onTransact.Companion.onExtraCallback() : ontransact;
        Object obj = null;
        if ((i3 & 8) != 0) {
            int i9 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                wa.IAuthTabCallback.Companion.onExtraCallbackWithResult();
                obj.hashCode();
                throw null;
            }
            iAuthTabCallbackOnExtraCallbackWithResult = wa.IAuthTabCallback.Companion.onExtraCallbackWithResult();
        } else {
            iAuthTabCallbackOnExtraCallbackWithResult = iAuthTabCallback;
        }
        float f2 = (i3 & 16) != 0 ? 0.6f : f;
        wa.onNavigationEvent onnavigationeventIAuthTabCallback = (i3 & 32) != 0 ? wa.onNavigationEvent.Companion.IAuthTabCallback() : onnavigationevent;
        getBacktraceNote<? super w0a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4 = (i3 & 64) != 0 ? null : getbacktracenote2;
        wa.IAuthTabCallbackStub iAuthTabCallbackStubOnWarmupCompleted = (i3 & 128) != 0 ? wa.IAuthTabCallbackStub.Companion.onWarmupCompleted() : iAuthTabCallbackStub;
        if ((i3 & 256) != 0) {
            int i10 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                wa.onExtraCallback.Companion.onExtraCallback();
                obj.hashCode();
                throw null;
            }
            onExtraCallback = wa.onExtraCallback.Companion.onExtraCallback();
        } else {
            onExtraCallback = onextracallback;
        }
        getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5 = (i3 & 512) != 0 ? null : getbacktracenote3;
        wa.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = (i3 & 1024) != 0 ? wa.onWarmupCompleted.Companion.onExtraCallbackWithResult() : onwarmupcompleted;
        wa.onExtraCallbackWithResult onExtraCallbackWithResult2 = (i3 & 2048) != 0 ? wa.onExtraCallbackWithResult.Companion.onExtraCallbackWithResult() : onextracallbackwithresult;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(592533171, i, i2, "im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3 (TdsListHeaderV3.kt:394)");
        }
        int i11 = i << 3;
        onExtraCallbackWithResult(getbacktracenote, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(onExtraCallback.onWarmupCompleted(), iAuthTabCallbackStubOnWarmupCompleted.IAuthTabCallbackDefault(), onExtraCallback.IAuthTabCallback(), iAuthTabCallbackStubOnWarmupCompleted.onNavigationEvent()), quirksExternalSyntheticBackport02, ontransactOnExtraCallback, iAuthTabCallbackOnExtraCallbackWithResult, f2, onnavigationeventIAuthTabCallback, getbacktracenote4, iAuthTabCallbackStubOnWarmupCompleted.onExtraCallback(), getbacktracenote5, onwarmupcompletedOnExtraCallbackWithResult, onExtraCallbackWithResult2, cameraCaptureResultEmptyCameraCaptureResult, (i11 & 29360128) | (i & 14) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (i & 1879048192), i2 & 126, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallback + 17;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1409440528, i, -1, "im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsListHeaderV3.kt:445)");
            }
            if (getbacktracenote != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1042545675);
                getbacktracenote.invoke(w0a.onNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, 6);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i9 = IAuthTabCallback + 123;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 4 % 5;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1042644658);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(wa.IAuthTabCallback iAuthTabCallback, final getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 123;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0 ? (i & 3) == 2 : (i & 2) == 3) {
            z = false;
        } else {
            int i5 = i3 + 125;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2072279332, i, -1, "im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsListHeaderV3.kt:442)");
            }
            putCharSequence.onExtraCallback(onExtraCallback(iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, null, null, false, ForwardingCameraControl.onExtraCallback(1409440528, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda20
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = IAuthTabCallback + 79;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitOnNavigationEvent = w2.onNavigationEvent(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i10 = IAuthTabCallback + 13;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 != 0) {
                        return unitOnNavigationEvent;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1572864, 62);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallbackWithResult + 9;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = onExtraCallbackWithResult + 43;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(final wa.IAuthTabCallback iAuthTabCallback, final getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        boolean z = false;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1162707927, i, -1, "im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3.<anonymous>.<anonymous>.<anonymous> (TdsListHeaderV3.kt:441)");
            }
            putBooleanArray.IAuthTabCallback(wa.asInterface.Description, ForwardingCameraControl.onExtraCallback(-2072279332, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 91;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    Unit unitIAuthTabCallback = w2.IAuthTabCallback(iAuthTabCallback, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i8 = onWarmupCompleted + 51;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        return unitIAuthTabCallback;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = IAuthTabCallback + 7;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(putCharSequenceArray putcharsequencearray, wa.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, wa.onTransact ontransact, float f, getBacktraceNote getbacktracenote2, wa.onWarmupCompleted onwarmupcompleted, wa.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 5) != 3, i & 1)) {
            int i4 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-898687062, i, -1, "im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3.<anonymous>.<anonymous>.<anonymous> (TdsListHeaderV3.kt:452)");
            }
            IAuthTabCallback(1167922462, new Object[]{putcharsequencearray, iAuthTabCallback, getbacktracenote, ontransact, Float.valueOf(f), getbacktracenote2, onwarmupcompleted, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, 6}, -1167922461, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static final class onNavigationEvent implements getCameraUseCases {
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ float IAuthTabCallback;
        final /* synthetic */ wa.IAuthTabCallback onExtraCallback;
        final /* synthetic */ putCharSequenceArray onNavigationEvent;
        final /* synthetic */ wa.onNavigationEvent onWarmupCompleted;

        onNavigationEvent(putCharSequenceArray putcharsequencearray, float f, wa.IAuthTabCallback iAuthTabCallback, wa.onNavigationEvent onnavigationevent) {
            this.onNavigationEvent = putcharsequencearray;
            this.IAuthTabCallback = f;
            this.onExtraCallback = iAuthTabCallback;
            this.onWarmupCompleted = onnavigationevent;
        }

        public static /* synthetic */ Unit onNavigationEvent(wa.onNavigationEvent onnavigationevent, List list, List list2, Ref.IntRef intRef, int i, Ref.IntRef intRef2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 51;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(onnavigationevent, list, list2, intRef, i, intRef2, onextracallbackwithresult);
            int i5 = onExtraCallbackWithResult + 101;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return unitOnWarmupCompleted;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x0189  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final component8 onNavigationEvent(component4 component4Var, List<? extends List<? extends component7>> list, long j) {
            final int iOnExtraCallbackWithResult;
            boolean z;
            int iAsInterface;
            int iIAuthTabCallbackDefault;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(component4Var, "");
            Intrinsics.checkNotNullParameter(list, "");
            boolean zOnExtraCallback = this.onNavigationEvent.onExtraCallback(wa.asInterface.Right, putCharArray.Companion.IAuthTabCallbackStubProxy());
            final Ref.IntRef intRef = new Ref.IntRef();
            List<? extends component7> list2 = list.get(1);
            final ArrayList arrayList = new ArrayList(list2.size());
            int size = list2.size();
            int i2 = 0;
            int interfaceDescriptor = 0;
            while (true) {
                Object obj = null;
                if (i2 >= size) {
                    final Ref.IntRef intRef2 = new Ref.IntRef();
                    List<? extends component7> list3 = list.get(0);
                    wa.IAuthTabCallback iAuthTabCallback = this.onExtraCallback;
                    final ArrayList arrayList2 = new ArrayList(list3.size());
                    int size2 = list3.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        component7 component7Var = list3.get(i3);
                        w0b w0bVar = w0b.IAuthTabCallback;
                        int iOnExtraCallbackWithResult2 = component4Var.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(w0bVar.IAuthTabCallback(iAuthTabCallback).onTransact() + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(w0bVar.IAuthTabCallback(iAuthTabCallback).onExtraCallback() * 2.0f)) + w0bVar.onNavigationEvent()));
                        List<? extends component7> list4 = list3;
                        int iCoerceAtLeast = RangesKt.coerceAtLeast(VirtualCameraCaptureResult.onTransact(j) - iOnExtraCallbackWithResult2, 0);
                        int iAsBinder = VirtualCameraCaptureResult.asBinder(j);
                        wa.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                        if (zOnExtraCallback) {
                            z = zOnExtraCallback;
                            if (VirtualCameraCaptureResult.asInterface(j) != Integer.MAX_VALUE) {
                                int i4 = onExtraCallbackWithResult + 29;
                                IAuthTabCallbackDefault = i4 % 128;
                                int i5 = i4 % 2;
                                iAsInterface = VirtualCameraCaptureResult.asInterface(j) - iOnExtraCallbackWithResult2;
                            } else {
                                iAsInterface = Integer.MAX_VALUE;
                            }
                        } else {
                            z = zOnExtraCallback;
                            iAsInterface = VirtualCameraCaptureResult.asInterface(j);
                        }
                        if (VirtualCameraCaptureResult.IAuthTabCallbackDefault(j) != Integer.MAX_VALUE) {
                            int i6 = IAuthTabCallbackDefault + 65;
                            onExtraCallbackWithResult = i6 % 128;
                            iIAuthTabCallbackDefault = i6 % 2 != 0 ? VirtualCameraCaptureResult.IAuthTabCallbackDefault(j) % intRef.element : VirtualCameraCaptureResult.IAuthTabCallbackDefault(j) - intRef.element;
                        } else {
                            iIAuthTabCallbackDefault = Integer.MAX_VALUE;
                        }
                        getStreamSharingChildren getstreamsharingchildrenOnExtraCallback = component7Var.onExtraCallback(lb.onExtraCallback(iCoerceAtLeast, iAsInterface, iAsBinder, iIAuthTabCallbackDefault));
                        if (getstreamsharingchildrenOnExtraCallback.T_() > intRef2.element) {
                            int i7 = onExtraCallbackWithResult + 85;
                            IAuthTabCallbackDefault = i7 % 128;
                            if (i7 % 2 == 0) {
                                intRef2.element = getstreamsharingchildrenOnExtraCallback.T_();
                                throw null;
                            }
                            intRef2.element = getstreamsharingchildrenOnExtraCallback.T_();
                        }
                        arrayList2.add(getstreamsharingchildrenOnExtraCallback);
                        i3++;
                        list3 = list4;
                        iAuthTabCallback = iAuthTabCallback2;
                        zOnExtraCallback = z;
                    }
                    if (intRef.element > 0) {
                        int i8 = onExtraCallbackWithResult + 95;
                        IAuthTabCallbackDefault = i8 % 128;
                        int i9 = i8 % 2;
                        if (intRef2.element > 0) {
                            iOnExtraCallbackWithResult = component4Var.onExtraCallbackWithResult(this.IAuthTabCallback);
                        } else {
                            int i10 = onExtraCallbackWithResult + 121;
                            IAuthTabCallbackDefault = i10 % 128;
                            int i11 = i10 % 2;
                            iOnExtraCallbackWithResult = 0;
                        }
                    }
                    int i12 = intRef.element;
                    int i13 = intRef2.element;
                    final wa.onNavigationEvent onnavigationevent = this.onWarmupCompleted;
                    return component4.IAuthTabCallback(component4Var, VirtualCameraCaptureResult.asInterface(j), i12 + i13 + iOnExtraCallbackWithResult, (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$TdsListHeaderV3$11$1$3$1$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2) {
                            int i14 = 2 % 2;
                            int i15 = onNavigationEvent + 17;
                            onExtraCallbackWithResult = i15 % 128;
                            int i16 = i15 % 2;
                            Unit unitOnNavigationEvent = w2.onNavigationEvent.onNavigationEvent(onnavigationevent, arrayList2, arrayList, intRef2, iOnExtraCallbackWithResult, intRef, (getStreamSharingChildren.onExtraCallbackWithResult) obj2);
                            int i17 = onNavigationEvent + 83;
                            onExtraCallbackWithResult = i17 % 128;
                            int i18 = i17 % 2;
                            return unitOnNavigationEvent;
                        }
                    }, 4, (Object) null);
                }
                getStreamSharingChildren getstreamsharingchildrenOnExtraCallback2 = list2.get(i2).onExtraCallback(j);
                if (getstreamsharingchildrenOnExtraCallback2.getInterfaceDescriptor() > interfaceDescriptor) {
                    int i14 = IAuthTabCallbackDefault + 67;
                    onExtraCallbackWithResult = i14 % 128;
                    if (i14 % 2 != 0) {
                        getstreamsharingchildrenOnExtraCallback2.getInterfaceDescriptor();
                        obj.hashCode();
                        throw null;
                    }
                    interfaceDescriptor = getstreamsharingchildrenOnExtraCallback2.getInterfaceDescriptor();
                }
                if (getstreamsharingchildrenOnExtraCallback2.T_() > intRef.element) {
                    intRef.element = getstreamsharingchildrenOnExtraCallback2.T_();
                }
                arrayList.add(getstreamsharingchildrenOnExtraCallback2);
                i2++;
            }
        }

        private static final Unit onWarmupCompleted(wa.onNavigationEvent onnavigationevent, List list, List list2, Ref.IntRef intRef, int i, Ref.IntRef intRef2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i2;
            int i3 = 2 % 2;
            int i4 = IAuthTabCallbackDefault + 75;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            if (onnavigationevent == wa.onNavigationEvent.Top) {
                int i6 = IAuthTabCallbackDefault + 65;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) list.get(i8), 0, 0, 0.0f, 4, (Object) null);
                }
            }
            int size2 = list2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                int i10 = IAuthTabCallbackDefault + 31;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) list2.get(i9);
                if (onnavigationevent == wa.onNavigationEvent.Top) {
                    i2 = intRef.element + i;
                } else {
                    int i12 = IAuthTabCallbackDefault + 7;
                    onExtraCallbackWithResult = i12 % 128;
                    int i13 = i12 % 2;
                    i2 = 0;
                }
                getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, 0, i2, 0.0f, 4, (Object) null);
            }
            if (onnavigationevent == wa.onNavigationEvent.Bottom) {
                int size3 = list.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    int i15 = IAuthTabCallbackDefault + 117;
                    onExtraCallbackWithResult = i15 % 128;
                    int i16 = i15 % 2;
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) list.get(i14), 0, intRef2.element + i, 0.0f, 4, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, final wa.IAuthTabCallback iAuthTabCallback, float f, wa.onNavigationEvent onnavigationevent, final getBacktraceNote getbacktracenote, final putCharSequenceArray putcharsequencearray, final getBacktraceNote getbacktracenote2, final wa.onTransact ontransact, final float f2, final getBacktraceNote getbacktracenote3, final wa.onWarmupCompleted onwarmupcompleted, final wa.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                z = true;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-586184296, i, -1, "im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3.<anonymous>.<anonymous> (TdsListHeaderV3.kt:438)");
                }
                List listListOf = CollectionsKt.listOf(new Function2[]{ForwardingCameraControl.onExtraCallback(-1162707927, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda21
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = 2 % 2;
                        int i5 = onNavigationEvent + 43;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        wa.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                        if (i6 == 0) {
                            return w2.onNavigationEvent(iAuthTabCallback2, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        }
                        w2.onNavigationEvent(iAuthTabCallback2, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(-898687062, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda22
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallbackWithResult + 79;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        putCharSequenceArray putcharsequencearray2 = putcharsequencearray;
                        wa.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                        getBacktraceNote getbacktracenote4 = getbacktracenote2;
                        wa.onTransact ontransact2 = ontransact;
                        float f3 = f2;
                        int iIntValue = ((Integer) obj2).intValue();
                        Unit unit = (Unit) w2.IAuthTabCallback(-2109629430, new Object[]{putcharsequencearray2, iAuthTabCallback2, getbacktracenote4, ontransact2, Float.valueOf(f3), getbacktracenote3, onwarmupcompleted, onextracallbackwithresult, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)}, 2109629441, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
                        int i7 = onNavigationEvent + 91;
                        onExtraCallbackWithResult = i7 % 128;
                        if (i7 % 2 == 0) {
                            return unit;
                        }
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54)});
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null).onExtraCallback(quirksExternalSyntheticBackport02), deviceQuirksExternalSyntheticLambda0);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iAuthTabCallback);
                boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onnavigationevent.ordinal());
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnNavigationEvent | zIAuthTabCallback | zOnExtraCallback) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new onNavigationEvent(putcharsequencearray, f, iAuthTabCallback, onnavigationevent);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                getCameraUseCases getcamerausecases = (getCameraUseCases) objOnMinimized;
                Function2 function2OnWarmupCompleted = callAllGets.onWarmupCompleted(listListOf);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getcamerausecases);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(!zOnNavigationEvent2)) {
                    objOnMinimized2 = getCameraUseCasesToDetach.onExtraCallbackWithResult(getcamerausecases);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                    int i4 = onExtraCallbackWithResult + 125;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    component5 component5Var = (component5) objOnMinimized2;
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
                        int i6 = IAuthTabCallback + 13;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                            throw null;
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5Var, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                    function2OnWarmupCompleted.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    int i7 = IAuthTabCallback + 113;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 20 / 0;
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        }
                        component5 component5Var2 = (component5) objOnMinimized2;
                        int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult22 = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback2 = onextracallbackwithresult22.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5Var2, onextracallbackwithresult22.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult22.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult22.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult22.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult22.onTransact());
                        function2OnWarmupCompleted.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                    } else {
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        }
                        component5 component5Var22 = (component5) objOnMinimized2;
                        int iHashCode22 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted22 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult222 = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback22 = onextracallbackwithresult222.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, component5Var22, onextracallbackwithresult222.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22, onextracallbackwithresult222.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, Integer.valueOf(iHashCode22), onextracallbackwithresult222.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, onextracallbackwithresult222.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, quirksExternalSyntheticBackport0OnWarmupCompleted22, onextracallbackwithresult222.onTransact());
                        function2OnWarmupCompleted.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            int i9 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            return unit;
        }
        int i11 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i11 % 128;
        int i12 = i11 % 2;
        z = false;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
        }
        Unit unit2 = Unit.INSTANCE;
        int i92 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i92 % 128;
        int i102 = i92 % 2;
        return unit2;
    }

    private static final Unit onExtraCallback(final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, final wa.IAuthTabCallback iAuthTabCallback, final float f, final wa.onNavigationEvent onnavigationevent, final getBacktraceNote getbacktracenote, final getBacktraceNote getbacktracenote2, final wa.onTransact ontransact, final float f2, final getBacktraceNote getbacktracenote3, final wa.onWarmupCompleted onwarmupcompleted, final wa.onExtraCallbackWithResult onextracallbackwithresult, initSDK initsdk, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport02, "");
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                i3 = 32;
            } else {
                int i5 = onExtraCallbackWithResult + 91;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                i3 = 16;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 145) != 144, i2 & 1)) {
            int i7 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-555271147, i2, -1, "im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3.<anonymous> (TdsListHeaderV3.kt:433)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new putCharSequenceArray();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            final putCharSequenceArray putcharsequencearray = (putCharSequenceArray) objOnMinimized;
            putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.access000(), null, putcharsequencearray, ForwardingCameraControl.onExtraCallback(-586184296, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda6
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = onNavigationEvent + 75;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitOnNavigationEvent = w2.onNavigationEvent(quirksExternalSyntheticBackport02, quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, iAuthTabCallback, f, onnavigationevent, getbacktracenote, putcharsequencearray, getbacktracenote2, ontransact, f2, getbacktracenote3, onwarmupcompleted, onextracallbackwithresult, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i12 = onNavigationEvent + 49;
                    onWarmupCompleted = i12 % 128;
                    int i13 = i12 % 2;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3462, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull final getBacktraceNote<? super areAllItemsEnabled, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @NotNull final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable wa.onTransact ontransact, @Nullable wa.IAuthTabCallback iAuthTabCallback, float f, @Nullable wa.onNavigationEvent onnavigationevent, @Nullable getBacktraceNote<? super w0a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, float f2, @Nullable getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable wa.onWarmupCompleted onwarmupcompleted, @Nullable wa.onExtraCallbackWithResult onextracallbackwithresult, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) {
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
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final wa.onTransact ontransact2;
        final wa.IAuthTabCallback iAuthTabCallback2;
        final float f3;
        final wa.onNavigationEvent onnavigationevent2;
        final getBacktraceNote<? super w0a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        final float f4;
        final getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5;
        final wa.onWarmupCompleted onwarmupcompleted2;
        final wa.onExtraCallbackWithResult onextracallbackwithresult2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        float fIAuthTabCallback;
        wa.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult;
        wa.onExtraCallbackWithResult onExtraCallbackWithResult2;
        int i18 = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1397318656);
        if ((i & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ^ true) ? 32 : 16;
        }
        int i19 = i3 & 4;
        if (i19 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                    int i20 = onExtraCallbackWithResult + 123;
                    IAuthTabCallback = i20 % 128;
                    int i21 = i20 % 2;
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i4 |= i5;
            }
            i6 = i3 & 8;
            if (i6 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(ontransact) ? 2048 : 1024;
                    int i22 = IAuthTabCallback + 95;
                    onExtraCallbackWithResult = i22 % 128;
                    if (i22 % 2 != 0) {
                        int i23 = 5 / 3;
                    }
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    int i24 = onExtraCallbackWithResult + 93;
                    IAuthTabCallback = i24 % 128;
                    i4 = i24 % 2 == 0 ? i4 | 32270 : i4 | 24576;
                } else {
                    if ((i & 24576) == 0) {
                        int i25 = onExtraCallbackWithResult + 73;
                        IAuthTabCallback = i25 % 128;
                        int i26 = i25 % 2;
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback) ? 16384 : 8192;
                    }
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i4 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 131072 : 65536;
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        int i27 = IAuthTabCallback + 71;
                        onExtraCallbackWithResult = i27 % 128;
                        int i28 = i27 % 2;
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onnavigationevent == null ? -1 : onnavigationevent.ordinal()) ? 1048576 : 524288;
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                        i4 |= 12582912;
                    } else if ((12582912 & i) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2)) {
                            int i29 = onExtraCallbackWithResult + 31;
                            IAuthTabCallback = i29 % 128;
                            if (i29 % 2 == 0) {
                                int i30 = 44 / 0;
                            }
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i4 |= i11;
                    }
                    i12 = i3 & 256;
                    if (i12 == 0) {
                        i4 |= 100663296;
                    } else {
                        if ((100663296 & i) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2) ? 67108864 : 33554432;
                        }
                        i13 = i3 & 512;
                        if (i13 == 0) {
                            if ((i & 805306368) == 0) {
                                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3) ? 536870912 : 268435456;
                            }
                            i14 = i3 & 1024;
                            if (i14 == 0) {
                                i15 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i15 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal()) ? 4 : 2);
                            } else {
                                i15 = i2;
                            }
                            i16 = i3 & 2048;
                            if (i16 == 0) {
                                i15 |= 48;
                            } else if ((i2 & 48) == 0) {
                                i15 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult) ? 32 : 16;
                            }
                            i17 = i15;
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) == 306783378 || (i17 & 19) != 18, i4 & 1)) {
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                ontransact2 = ontransact;
                                iAuthTabCallback2 = iAuthTabCallback;
                                f3 = f;
                                onnavigationevent2 = onnavigationevent;
                                getbacktracenote4 = getbacktracenote2;
                                f4 = f2;
                                getbacktracenote5 = getbacktracenote3;
                                onwarmupcompleted2 = onwarmupcompleted;
                                onextracallbackwithresult2 = onextracallbackwithresult;
                            } else {
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i19 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                wa.onTransact ontransactOnExtraCallback = i6 != 0 ? wa.onTransact.Companion.onExtraCallback() : ontransact;
                                wa.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = i7 != 0 ? wa.IAuthTabCallback.Companion.onExtraCallbackWithResult() : iAuthTabCallback;
                                float f5 = i8 != 0 ? 0.6f : f;
                                wa.onNavigationEvent onnavigationeventIAuthTabCallback = i9 != 0 ? wa.onNavigationEvent.Companion.IAuthTabCallback() : onnavigationevent;
                                Object obj = null;
                                getBacktraceNote<? super w0a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6 = i10 != 0 ? null : getbacktracenote2;
                                if (i12 != 0) {
                                    int i31 = IAuthTabCallback + 63;
                                    onExtraCallbackWithResult = i31 % 128;
                                    if (i31 % 2 != 0) {
                                        w0b.IAuthTabCallback.IAuthTabCallback();
                                        obj.hashCode();
                                        throw null;
                                    }
                                    fIAuthTabCallback = w0b.IAuthTabCallback.IAuthTabCallback();
                                } else {
                                    fIAuthTabCallback = f2;
                                }
                                getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7 = i13 != 0 ? null : getbacktracenote3;
                                if (i14 != 0) {
                                    int i32 = onExtraCallbackWithResult + 79;
                                    IAuthTabCallback = i32 % 128;
                                    if (i32 % 2 == 0) {
                                        wa.onWarmupCompleted.Companion.onExtraCallbackWithResult();
                                        throw null;
                                    }
                                    onwarmupcompletedOnExtraCallbackWithResult = wa.onWarmupCompleted.Companion.onExtraCallbackWithResult();
                                } else {
                                    onwarmupcompletedOnExtraCallbackWithResult = onwarmupcompleted;
                                }
                                if (i16 != 0) {
                                    int i33 = onExtraCallbackWithResult + 91;
                                    IAuthTabCallback = i33 % 128;
                                    int i34 = i33 % 2;
                                    onExtraCallbackWithResult2 = wa.onExtraCallbackWithResult.Companion.onExtraCallbackWithResult();
                                } else {
                                    onExtraCallbackWithResult2 = onextracallbackwithresult;
                                }
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1397318656, i4, i17, "im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3 (TdsListHeaderV3.kt:431)");
                                }
                                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                final wa.IAuthTabCallback iAuthTabCallback3 = iAuthTabCallbackOnExtraCallbackWithResult;
                                final float f6 = fIAuthTabCallback;
                                final wa.onNavigationEvent onnavigationevent3 = onnavigationeventIAuthTabCallback;
                                final getBacktraceNote<? super w0a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8 = getbacktracenote6;
                                final wa.onTransact ontransact3 = ontransactOnExtraCallback;
                                final float f7 = f5;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                                final getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote9 = getbacktracenote7;
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                final wa.onWarmupCompleted onwarmupcompleted3 = onwarmupcompletedOnExtraCallbackWithResult;
                                final wa.onExtraCallbackWithResult onextracallbackwithresult3 = onExtraCallbackWithResult2;
                                setThreadList.IAuthTabCallback(IOOMCallback.ListHeader, (initMiniApp) null, (initSDK) null, (Function2) null, (Set) null, ForwardingCameraControl.onExtraCallback(-555271147, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda1
                                    private static int IAuthTabCallback = 1;
                                    private static int onExtraCallbackWithResult;

                                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                        int i35 = 2 % 2;
                                        int i36 = IAuthTabCallback + 13;
                                        onExtraCallbackWithResult = i36 % 128;
                                        int i37 = i36 % 2;
                                        Unit unitOnExtraCallbackWithResult = w2.onExtraCallbackWithResult(quirksExternalSyntheticBackport04, deviceQuirksExternalSyntheticLambda0, iAuthTabCallback3, f6, onnavigationevent3, getbacktracenote8, getbacktracenote, ontransact3, f7, getbacktracenote9, onwarmupcompleted3, onextracallbackwithresult3, (initSDK) obj2, (QuirksExternalSyntheticBackport0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                        int i38 = IAuthTabCallback + 23;
                                        onExtraCallbackWithResult = i38 % 128;
                                        int i39 = i38 % 2;
                                        return unitOnExtraCallbackWithResult;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 196614, 30);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport05;
                                ontransact2 = ontransactOnExtraCallback;
                                iAuthTabCallback2 = iAuthTabCallbackOnExtraCallbackWithResult;
                                onnavigationevent2 = onnavigationeventIAuthTabCallback;
                                f3 = f5;
                                getbacktracenote4 = getbacktracenote6;
                                onextracallbackwithresult2 = onExtraCallbackWithResult2;
                                f4 = fIAuthTabCallback;
                                getbacktracenote5 = getbacktracenote7;
                                onwarmupcompleted2 = onwarmupcompletedOnExtraCallbackWithResult;
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda2
                                    private static int onExtraCallbackWithResult = 0;
                                    private static int onWarmupCompleted = 1;

                                    public final Object invoke(Object obj2, Object obj3) {
                                        int i35 = 2 % 2;
                                        int i36 = onWarmupCompleted + 39;
                                        onExtraCallbackWithResult = i36 % 128;
                                        int i37 = i36 % 2;
                                        Unit unitOnWarmupCompleted = w2.onWarmupCompleted(getbacktracenote, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport02, ontransact2, iAuthTabCallback2, f3, onnavigationevent2, getbacktracenote4, f4, getbacktracenote5, onwarmupcompleted2, onextracallbackwithresult2, i, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                        int i38 = onWarmupCompleted + 39;
                                        onExtraCallbackWithResult = i38 % 128;
                                        int i39 = i38 % 2;
                                        return unitOnWarmupCompleted;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        int i35 = IAuthTabCallback + 87;
                        onExtraCallbackWithResult = i35 % 128;
                        if (i35 % 2 != 0) {
                            i4 |= 805306368;
                            int i36 = 63 / 0;
                        } else {
                            i4 |= 805306368;
                        }
                        i14 = i3 & 1024;
                        if (i14 == 0) {
                        }
                        i16 = i3 & 2048;
                        if (i16 == 0) {
                        }
                        i17 = i15;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) == 306783378 || (i17 & 19) != 18, i4 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i13 = i3 & 512;
                    if (i13 == 0) {
                    }
                    i14 = i3 & 1024;
                    if (i14 == 0) {
                    }
                    i16 = i3 & 2048;
                    if (i16 == 0) {
                    }
                    i17 = i15;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) == 306783378 || (i17 & 19) != 18, i4 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                i10 = i3 & 128;
                if (i10 == 0) {
                }
                i12 = i3 & 256;
                if (i12 == 0) {
                }
                i13 = i3 & 512;
                if (i13 == 0) {
                }
                i14 = i3 & 1024;
                if (i14 == 0) {
                }
                i16 = i3 & 2048;
                if (i16 == 0) {
                }
                i17 = i15;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) == 306783378 || (i17 & 19) != 18, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            i12 = i3 & 256;
            if (i12 == 0) {
            }
            i13 = i3 & 512;
            if (i13 == 0) {
            }
            i14 = i3 & 1024;
            if (i14 == 0) {
            }
            i16 = i3 & 2048;
            if (i16 == 0) {
            }
            i17 = i15;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) == 306783378 || (i17 & 19) != 18, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        i12 = i3 & 256;
        if (i12 == 0) {
        }
        i13 = i3 & 512;
        if (i13 == 0) {
        }
        i14 = i3 & 1024;
        if (i14 == 0) {
        }
        i16 = i3 & 2048;
        if (i16 == 0) {
        }
        i17 = i15;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) == 306783378 || (i17 & 19) != 18, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit IAuthTabCallbackStub(wa.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallback + 119;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-109690861, i, -1, "im.toss.tds.compose.component.compound.listheader.TitleRightLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsListHeaderV3.kt:572)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-109690861, i, -1, "im.toss.tds.compose.component.compound.listheader.TitleRightLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsListHeaderV3.kt:572)");
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iAuthTabCallback);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!zOnNavigationEvent) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new areAllItemsEnabled(iAuthTabCallback);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            getbacktracenote.invoke((areAllItemsEnabled) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallback + 105;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i7 = 81 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(final wa.IAuthTabCallback iAuthTabCallback, wa.onTransact ontransact, final getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1298980129, i, -1, "im.toss.tds.compose.component.compound.listheader.TitleRightLayout.<anonymous>.<anonymous>.<anonymous> (TdsListHeaderV3.kt:566)");
                int i4 = IAuthTabCallback + 1;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
            putCharSequence.onExtraCallback(onExtraCallbackWithResult(iAuthTabCallback, ontransact.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0)), null, null, oExternalSyntheticLambda0.onWarmupCompleted.onExtraCallbackWithResult((oExternalSyntheticLambda0.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(oExternalSyntheticLambda1.onExtraCallback()), null, w0b.IAuthTabCallback.onExtraCallback(), null, 5, null), null, false, ForwardingCameraControl.onExtraCallback(-109690861, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda15
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj2, Object obj3) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 101;
                    IAuthTabCallback = i7 % 128;
                    Object obj4 = null;
                    if (i7 % 2 == 0) {
                        w2.onExtraCallbackWithResult(iAuthTabCallback, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        obj4.hashCode();
                        throw null;
                    }
                    Unit unitOnExtraCallbackWithResult = w2.onExtraCallbackWithResult(iAuthTabCallback, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i8 = IAuthTabCallback + 111;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1572864, 54);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(final wa.IAuthTabCallback iAuthTabCallback, final wa.onTransact ontransact, final getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = onExtraCallbackWithResult + 111;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1552153196, i, -1, "im.toss.tds.compose.component.compound.listheader.TitleRightLayout.<anonymous>.<anonymous> (TdsListHeaderV3.kt:565)");
                    int i6 = 46 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1552153196, i, -1, "im.toss.tds.compose.component.compound.listheader.TitleRightLayout.<anonymous>.<anonymous> (TdsListHeaderV3.kt:565)");
                }
            }
            putBooleanArray.IAuthTabCallback(wa.asInterface.Title, ForwardingCameraControl.onExtraCallback(-1298980129, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda7
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = onExtraCallbackWithResult + 59;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    wa.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                    if (i9 == 0) {
                        return w2.onNavigationEvent(iAuthTabCallback2, ontransact, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    Unit unitOnNavigationEvent = w2.onNavigationEvent(iAuthTabCallback2, ontransact, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i10 = 92 / 0;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallback + 45;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(getBacktraceNote getbacktracenote, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1488712825, i, -1, "im.toss.tds.compose.component.compound.listheader.TitleRightLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsListHeaderV3.kt:605)");
            }
            getbacktracenote.invoke(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = IAuthTabCallback + 101;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(getHumanReadableName gethumanreadablename, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, final getBacktraceNote getbacktracenote, final RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 67;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1335450949, i, -1, "im.toss.tds.compose.component.compound.listheader.TitleRightLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsListHeaderV3.kt:602)");
            }
            putCharSequence.onExtraCallback(getHumanReadableName.onNavigationEvent(gethumanreadablename, IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<setByteOrder>) cameraPresenceProviderExternalSyntheticLambda6), 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777214, (Object) null), null, null, null, null, false, ForwardingCameraControl.onExtraCallback(1488712825, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda17
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallback + 15;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    Unit unitOnExtraCallbackWithResult = w2.onExtraCallbackWithResult(getbacktracenote, rightPreset, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i13 = onExtraCallbackWithResult + 53;
                    onExtraCallback = i13 % 128;
                    int i14 = i13 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1572864, 62);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        boolean z;
        int i;
        long jAsInterface;
        wa.IAuthTabCallback iAuthTabCallback = (wa.IAuthTabCallback) objArr[0];
        final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i2 = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i3 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i7 % 128;
            Object obj = null;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = IAuthTabCallback + 103;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(752447972, iIntValue, -1, "im.toss.tds.compose.component.compound.listheader.TitleRightLayout.<anonymous>.<anonymous>.<anonymous> (TdsListHeaderV3.kt:581)");
            }
            final getHumanReadableName gethumanreadablenameOnWarmupCompleted = onWarmupCompleted(iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, 0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                int i10 = IAuthTabCallback + 81;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted());
                    obj.hashCode();
                    throw null;
                }
                objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = CaptureSessionExternalSyntheticLambda3.onExtraCallbackWithResult((Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 6);
            QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault = QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), onwarmupcompletedIAuthTabCallbackDefault, cameraCaptureResultEmptyCameraCaptureResult, 48);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            } else {
                int i11 = IAuthTabCallback + 105;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iAuthTabCallback);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!zOnNavigationEvent) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new RightPreset(iAuthTabCallback, rowScopeInstance);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            final RightPreset rightPreset = (RightPreset) objOnMinimized2;
            if (getbacktracenote != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1562465738);
                if (onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult)) {
                    int i13 = IAuthTabCallback + 45;
                    onExtraCallbackWithResult = i13 % 128;
                    if (i13 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-503782837);
                        long jOnExtraCallbackWithResult = MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent.onExtraCallbackWithResult(gethumanreadablenameOnWarmupCompleted.asInterface(), cameraCaptureResultEmptyCameraCaptureResult, 17);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        jAsInterface = jOnExtraCallbackWithResult;
                        i = 48;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-503782837);
                        i = 48;
                        jAsInterface = MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent.onExtraCallbackWithResult(gethumanreadablenameOnWarmupCompleted.asInterface(), cameraCaptureResultEmptyCameraCaptureResult, 48);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                } else {
                    i = 48;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-503781819);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    jAsInterface = gethumanreadablenameOnWarmupCompleted.asInterface();
                }
                int i14 = i;
                final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = updateSubmitButton.onExtraCallback(jAsInterface, (onItemClicked) null, "RightTextColor", (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 384, 10);
                setPostviewFormatSelector.onNavigationEvent(wa.onWarmupCompleted.onExtraCallbackWithResult().onExtraCallback(Boolean.valueOf(IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor))), ForwardingCameraControl.onExtraCallback(1335450949, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda24
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i15 = 2 % 2;
                        int i16 = onExtraCallbackWithResult + 3;
                        onExtraCallback = i16 % 128;
                        int i17 = i16 % 2;
                        Object obj4 = null;
                        getHumanReadableName gethumanreadablename = gethumanreadablenameOnWarmupCompleted;
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
                        getBacktraceNote getbacktracenote2 = getbacktracenote;
                        RightPreset rightPreset2 = rightPreset;
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        if (i17 != 0) {
                            w2.onExtraCallback(gethumanreadablename, cameraPresenceProviderExternalSyntheticLambda6, getbacktracenote2, rightPreset2, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                            throw null;
                        }
                        Unit unitOnExtraCallback = w2.onExtraCallback(gethumanreadablename, cameraPresenceProviderExternalSyntheticLambda6, getbacktracenote2, rightPreset2, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                        int i18 = onExtraCallback + 113;
                        onExtraCallbackWithResult = i18 % 128;
                        if (i18 % 2 != 0) {
                            return unitOnExtraCallback;
                        }
                        obj4.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, i14 | accessgetCameraFactoryp.onNavigationEvent);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1563288354);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(final wa.IAuthTabCallback iAuthTabCallback, final getBacktraceNote getbacktracenote, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1054866737, i, -1, "im.toss.tds.compose.component.compound.listheader.TitleRightLayout.<anonymous>.<anonymous> (TdsListHeaderV3.kt:580)");
            }
            putBooleanArray.IAuthTabCallback(wa.asInterface.Right, ForwardingCameraControl.onExtraCallback(752447972, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda19
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallbackWithResult + 115;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    Unit unitOnNavigationEvent = w2.onNavigationEvent(iAuthTabCallback, getbacktracenote, getsupportedhighspeedresolutionsfor, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i8 = onExtraCallbackWithResult + 85;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallback implements getCameraUseCases {
        private static int asBinder = 1;
        private static int asInterface;
        final /* synthetic */ wa.onExtraCallbackWithResult IAuthTabCallback;
        final /* synthetic */ float IAuthTabCallbackDefault;
        final /* synthetic */ getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> onExtraCallbackWithResult;
        final /* synthetic */ putCharSequenceArray onNavigationEvent;
        final /* synthetic */ wa.onWarmupCompleted onWarmupCompleted;

        /* renamed from: o.w2$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final /* synthetic */ class C0070IAuthTabCallback {
            public static final /* synthetic */ int[] IAuthTabCallback;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            static {
                int[] iArr = new int[wa.onWarmupCompleted.values().length];
                try {
                    iArr[wa.onWarmupCompleted.Center.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[wa.onWarmupCompleted.Bottom.ordinal()] = 2;
                    int i = onNavigationEvent + 29;
                    onExtraCallbackWithResult = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused2) {
                }
                IAuthTabCallback = iArr;
                int i3 = onNavigationEvent + 13;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 30 / 0;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(putCharSequenceArray putcharsequencearray, getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, wa.onExtraCallbackWithResult onextracallbackwithresult, float f, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, wa.onWarmupCompleted onwarmupcompleted) {
            this.onNavigationEvent = putcharsequencearray;
            this.onExtraCallback = getbacktracenote;
            this.IAuthTabCallback = onextracallbackwithresult;
            this.IAuthTabCallbackDefault = f;
            this.onExtraCallbackWithResult = getsupportedhighspeedresolutionsfor;
            this.onWarmupCompleted = onwarmupcompleted;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(List list, List list2, float f, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, boolean z, wa.onWarmupCompleted onwarmupcompleted, int i2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) throws NoWhenBranchMatchedException {
            int i3 = 2 % 2;
            int i4 = asInterface + 121;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            Unit unitOnExtraCallback = onExtraCallback(list, list2, f, getsupportedhighspeedresolutionsfor, i, z, onwarmupcompleted, i2, onextracallbackwithresult);
            int i6 = asBinder + 35;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return unitOnExtraCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0138 A[PHI: r5
          0x0138: PHI (r5v21 float) = (r5v20 float), (r5v27 float) binds: [B:60:0x0136, B:57:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0144  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final component8 onNavigationEvent(component4 component4Var, List<? extends List<? extends component7>> list, long j) {
            Integer numValueOf;
            int iIntValue;
            int iOnExtraCallbackWithResult;
            int iAsInterface;
            int i;
            int iAsInterface2;
            int i2;
            int i3;
            float f;
            int iMin;
            List listEmptyList;
            List listEmptyList2;
            int iMax;
            int i4 = 2 % 2;
            Intrinsics.checkNotNullParameter(component4Var, "");
            Intrinsics.checkNotNullParameter(list, "");
            final boolean zOnExtraCallback = this.onNavigationEvent.onExtraCallback(wa.asInterface.Right, putCharArray.Companion.IAuthTabCallbackStubProxy());
            int i5 = 1;
            int iOnExtraCallbackWithResult2 = 0;
            w2.onNavigationEvent(this.onExtraCallbackWithResult, (this.onExtraCallback == null || zOnExtraCallback || !this.IAuthTabCallback.onExtraCallbackWithResult()) ? false : true);
            List<? extends component7> list2 = list.get(0);
            List list3 = (List) CollectionsKt.getOrNull(list, 1);
            Integer numValueOf2 = null;
            if (list2.isEmpty()) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(list2.get(0).onExtraCallbackWithResult(Integer.MAX_VALUE));
                int lastIndex = CollectionsKt.getLastIndex(list2);
                if (lastIndex > 0) {
                    int i6 = 1;
                    while (true) {
                        Integer numValueOf3 = Integer.valueOf(list2.get(i6).onExtraCallbackWithResult(Integer.MAX_VALUE));
                        if (numValueOf3.compareTo(numValueOf) > 0) {
                            numValueOf = numValueOf3;
                        }
                        if (i6 == lastIndex) {
                            break;
                        }
                        int i7 = asBinder + 97;
                        asInterface = i7 % 128;
                        int i8 = i7 % 2;
                        i6++;
                    }
                }
            }
            int iIntValue2 = numValueOf != null ? numValueOf.intValue() : 0;
            if (list3 == null) {
                iIntValue = 0;
            } else {
                if (!list3.isEmpty()) {
                    numValueOf2 = Integer.valueOf(((component7) list3.get(0)).onExtraCallbackWithResult(Integer.MAX_VALUE));
                    int lastIndex2 = CollectionsKt.getLastIndex(list3);
                    if (lastIndex2 > 0) {
                        while (true) {
                            Integer numValueOf4 = Integer.valueOf(((component7) list3.get(i5)).onExtraCallbackWithResult(Integer.MAX_VALUE));
                            if (numValueOf4.compareTo(numValueOf2) > 0) {
                                numValueOf2 = numValueOf4;
                            }
                            if (i5 == lastIndex2) {
                                break;
                            }
                            int i9 = asBinder + 27;
                            asInterface = i9 % 128;
                            i5 = i9 % 2 != 0 ? i5 + 22 : i5 + 1;
                        }
                    }
                }
                if (numValueOf2 != null) {
                    iIntValue = numValueOf2.intValue();
                }
            }
            if (w2.onExtraCallback(this.onExtraCallbackWithResult)) {
                int iAsInterface3 = VirtualCameraCaptureResult.asInterface(j);
                iAsInterface2 = VirtualCameraCaptureResult.asInterface(j);
                int i10 = iIntValue;
                i2 = iIntValue2;
                i3 = iAsInterface3;
                i = i10;
            } else if (iIntValue2 <= 0 || iIntValue <= 0) {
                iOnExtraCallbackWithResult = 0;
                int iAsInterface4 = VirtualCameraCaptureResult.asInterface(j);
                iAsInterface = VirtualCameraCaptureResult.asInterface(j) - iOnExtraCallbackWithResult;
                if (iIntValue2 + iIntValue > iAsInterface) {
                    int i11 = asBinder + 39;
                    asInterface = i11 % 128;
                    if (i11 % 2 != 0) {
                        f = this.IAuthTabCallbackDefault;
                        iMin = f > 2.0f ? Math.min(iIntValue, getBacktraceNoteBytes.onExtraCallback(iAsInterface * (1.0f - f))) : RangesKt.coerceAtMost(iIntValue, iAsInterface);
                    } else {
                        f = this.IAuthTabCallbackDefault;
                        if (f > 0.0f) {
                        }
                    }
                    iIntValue = iMin;
                    iIntValue2 = iAsInterface - iMin;
                }
                i = iIntValue;
                iAsInterface2 = iAsInterface;
                i2 = iIntValue2;
                i3 = iAsInterface4;
            } else {
                float f2 = this.IAuthTabCallbackDefault;
                if (f2 > 0.0f && f2 < 1.0f) {
                    iOnExtraCallbackWithResult = component4Var.onExtraCallbackWithResult(w0b.IAuthTabCallback.onNavigationEvent());
                }
                int iAsInterface42 = VirtualCameraCaptureResult.asInterface(j);
                iAsInterface = VirtualCameraCaptureResult.asInterface(j) - iOnExtraCallbackWithResult;
                if (iIntValue2 + iIntValue > iAsInterface) {
                }
                i = iIntValue;
                iAsInterface2 = iAsInterface;
                i2 = iIntValue2;
                i3 = iAsInterface42;
            }
            if (i2 > 0) {
                List<? extends component7> list4 = list2;
                listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                for (Iterator it = list4.iterator(); it.hasNext(); it = it) {
                    listEmptyList.add(((component7) it.next()).onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, RangesKt.coerceIn(i2, 0, iAsInterface2), 0, 0, 13, (Object) null)));
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (list3 == null || i <= 0) {
                listEmptyList2 = CollectionsKt.emptyList();
            } else {
                List list5 = list3;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((component7) it2.next()).onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, RangesKt.coerceIn(i, 0, iAsInterface2), 0, 0, 13, (Object) null)));
                }
                listEmptyList2 = arrayList;
            }
            if (zOnExtraCallback) {
                int i12 = asBinder + 81;
                asInterface = i12 % 128;
                int i13 = i12 % 2;
                iMax = y1g.IAuthTabCallback(listEmptyList);
            } else if (w2.onExtraCallback(this.onExtraCallbackWithResult)) {
                int iIAuthTabCallback = y1g.IAuthTabCallback(listEmptyList);
                int iIAuthTabCallback2 = y1g.IAuthTabCallback(listEmptyList2);
                if (iIAuthTabCallback > 0) {
                    int i14 = asInterface + 75;
                    asBinder = i14 % 128;
                    int i15 = i14 % 2;
                    if (iIAuthTabCallback2 > 0) {
                        iOnExtraCallbackWithResult2 = component4Var.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f));
                    }
                }
                iMax = iIAuthTabCallback + iIAuthTabCallback2 + iOnExtraCallbackWithResult2;
            } else {
                iMax = Math.max(y1g.IAuthTabCallback(listEmptyList), y1g.IAuthTabCallback(listEmptyList2));
                int i16 = asBinder + 95;
                asInterface = i16 % 128;
                int i17 = i16 % 2;
            }
            final float f3 = this.IAuthTabCallbackDefault;
            final getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor = this.onExtraCallbackWithResult;
            final wa.onWarmupCompleted onwarmupcompleted = this.onWarmupCompleted;
            final List list6 = listEmptyList;
            final List list7 = listEmptyList2;
            final int i18 = iMax;
            final int i19 = i3;
            return component4.IAuthTabCallback(component4Var, i3, iMax, (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$TitleRightLayout$2$1$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                    int i20 = 2 % 2;
                    int i21 = onExtraCallbackWithResult + 75;
                    onExtraCallback = i21 % 128;
                    int i22 = i21 % 2;
                    Unit unitOnExtraCallbackWithResult = w2.IAuthTabCallback.onExtraCallbackWithResult(list6, list7, f3, getsupportedhighspeedresolutionsfor, i18, zOnExtraCallback, onwarmupcompleted, i19, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                    int i23 = onExtraCallback + 75;
                    onExtraCallbackWithResult = i23 % 128;
                    if (i23 % 2 == 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }, 4, (Object) null);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        private static final Unit onExtraCallback(List list, List list2, float f, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, boolean z, wa.onWarmupCompleted onwarmupcompleted, int i2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) throws NoWhenBranchMatchedException {
            QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault;
            int i3;
            int i4 = 2 % 2;
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            if (w2.onExtraCallback(getsupportedhighspeedresolutionsfor)) {
                Iterator it = list.iterator();
                while (!(!it.hasNext())) {
                    int i5 = asInterface + 59;
                    asBinder = i5 % 128;
                    int i6 = i5 % 2;
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) it.next(), 0, 0, 0.0f, 4, (Object) null);
                    int i7 = asBinder + 13;
                    asInterface = i7 % 128;
                    int i8 = i7 % 2;
                }
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    int i9 = asInterface + 61;
                    asBinder = i9 % 128;
                    int i10 = i9 % 2;
                    getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) it2.next();
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, 0, i - getstreamsharingchildren.T_(), 0.0f, 4, (Object) null);
                }
            } else {
                if (f > 0.0f) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        getStreamSharingChildren getstreamsharingchildren2 = (getStreamSharingChildren) it3.next();
                        getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren2, 0, QuirkSettingsLoader.Companion.IAuthTabCallbackDefault().onExtraCallbackWithResult(getstreamsharingchildren2.T_(), i), 0.0f, 4, (Object) null);
                    }
                }
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    int i11 = asInterface + 65;
                    asBinder = i11 % 128;
                    int i12 = i11 % 2;
                    getStreamSharingChildren getstreamsharingchildren3 = (getStreamSharingChildren) it4.next();
                    if (!(!z) || (i3 = C0070IAuthTabCallback.IAuthTabCallback[onwarmupcompleted.ordinal()]) == 1) {
                        onwarmupcompletedIAuthTabCallbackDefault = QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        onwarmupcompletedIAuthTabCallbackDefault = QuirkSettingsLoader.Companion.onExtraCallbackWithResult();
                    }
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren3, i2 - getstreamsharingchildren3.getInterfaceDescriptor(), onwarmupcompletedIAuthTabCallbackDefault.onExtraCallbackWithResult(getstreamsharingchildren3.T_(), i), 0.0f, 4, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i;
        Object obj;
        int i2;
        wa.onExtraCallbackWithResult onextracallbackwithresult;
        getBacktraceNote getbacktracenote;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i3;
        int i4;
        final putCharSequenceArray putcharsequencearray = (putCharSequenceArray) objArr[0];
        final wa.IAuthTabCallback iAuthTabCallback = (wa.IAuthTabCallback) objArr[1];
        final getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[2];
        final wa.onTransact ontransact = (wa.onTransact) objArr[3];
        final float fFloatValue = ((Number) objArr[4]).floatValue();
        final getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[5];
        final wa.onWarmupCompleted onwarmupcompleted = (wa.onWarmupCompleted) objArr[6];
        wa.onExtraCallbackWithResult onextracallbackwithresult2 = (wa.onExtraCallbackWithResult) objArr[7];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(612272131);
        if ((iIntValue & 6) == 0) {
            int i6 = onExtraCallbackWithResult + 99;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(putcharsequencearray)) {
                int i8 = onExtraCallbackWithResult + 1;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2 == 0 ? 2 : 4;
                i = i9 | iIntValue;
            }
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            int i10 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(ontransact)) {
                int i12 = onExtraCallbackWithResult + 117;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i |= i4;
        }
        if ((iIntValue & 24576) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue)) {
                int i14 = onExtraCallbackWithResult + 47;
                IAuthTabCallback = i14 % 128;
                i3 = i14 % 2 == 0 ? 13011 : 16384;
            } else {
                i3 = 8192;
            }
            i |= i3;
        }
        if ((196608 & iIntValue) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3) ? 131072 : 65536;
        }
        if ((1572864 & iIntValue) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted.ordinal()) ^ true ? 524288 : 1048576;
        }
        if ((12582912 & iIntValue) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult2) ? 8388608 : 4194304;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i) != 4793490, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(612272131, i, -1, "im.toss.tds.compose.component.compound.listheader.TitleRightLayout (TdsListHeaderV3.kt:560)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted2.onExtraCallback()) {
                int i15 = onExtraCallbackWithResult + 11;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-16984293);
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            listCreateListBuilder.add(ForwardingCameraControl.onExtraCallback(1552153196, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda8
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2, Object obj3) {
                    int i17 = 2 % 2;
                    int i18 = onExtraCallbackWithResult + 19;
                    onNavigationEvent = i18 % 128;
                    int i19 = i18 % 2;
                    Unit unit = (Unit) w2.IAuthTabCallback(-415351218, new Object[]{iAuthTabCallback, ontransact, getbacktracenote2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, 415351233, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
                    int i20 = onExtraCallbackWithResult + 21;
                    onNavigationEvent = i20 % 128;
                    if (i20 % 2 == 0) {
                        return unit;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54));
            if (fFloatValue < 1.0f) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1706965626);
                listCreateListBuilder.add(ForwardingCameraControl.onExtraCallback(1054866737, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda9
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2, Object obj3) {
                        Unit unitOnWarmupCompleted;
                        int i17 = 2 % 2;
                        int i18 = onNavigationEvent + 51;
                        onWarmupCompleted = i18 % 128;
                        if (i18 % 2 != 0) {
                            unitOnWarmupCompleted = w2.onWarmupCompleted(iAuthTabCallback, getbacktracenote3, getsupportedhighspeedresolutionsfor, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i19 = 28 / 0;
                        } else {
                            unitOnWarmupCompleted = w2.onWarmupCompleted(iAuthTabCallback, getbacktracenote3, getsupportedhighspeedresolutionsfor, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                        int i20 = onWarmupCompleted + 61;
                        onNavigationEvent = i20 % 128;
                        int i21 = i20 % 2;
                        return unitOnWarmupCompleted;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1705249280);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            }
            List listBuild = CollectionsKt.build(listCreateListBuilder);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            boolean z = (i & 14) == 4;
            if ((458752 & i) == 131072) {
                int i17 = onExtraCallbackWithResult + 31;
                IAuthTabCallback = i17 % 128;
                boolean z2 = i17 % 2 != 0;
                boolean z3 = (29360128 & i) == 8388608;
                boolean z4 = (57344 & i) == 16384;
                boolean z5 = (i & 3670016) == 1048576;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (((z | z2 | z3 | z4) || z5) || objOnMinimized2 == onwarmupcompleted2.onExtraCallback()) {
                    obj = null;
                    getbacktracenote = getbacktracenote3;
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    i2 = iIntValue;
                    onextracallbackwithresult = onextracallbackwithresult2;
                    objOnMinimized2 = new IAuthTabCallback(putcharsequencearray, getbacktracenote3, onextracallbackwithresult2, fFloatValue, getsupportedhighspeedresolutionsfor, onwarmupcompleted);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                } else {
                    onextracallbackwithresult = onextracallbackwithresult2;
                    getbacktracenote = getbacktracenote3;
                    i2 = iIntValue;
                    obj = null;
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                }
                getCameraUseCases getcamerausecases = (getCameraUseCases) objOnMinimized2;
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                Function2 function2OnWarmupCompleted = callAllGets.onWarmupCompleted(listBuild);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getcamerausecases);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent || objOnMinimized3 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized3 = getCameraUseCasesToDetach.onExtraCallbackWithResult(getcamerausecases);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                }
                component5 component5Var = (component5) objOnMinimized3;
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    int i18 = onExtraCallbackWithResult + 41;
                    IAuthTabCallback = i18 % 128;
                    if (i18 % 2 == 0) {
                        getAwbState.onExtraCallback();
                        int i19 = 88 / 0;
                    } else {
                        getAwbState.onExtraCallback();
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5Var, onextracallbackwithresult3.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult3.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult3.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult3.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult3.onTransact());
                function2OnWarmupCompleted.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            obj = null;
            i2 = iIntValue;
            onextracallbackwithresult = onextracallbackwithresult2;
            getbacktracenote = getbacktracenote3;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final getBacktraceNote getbacktracenote4 = getbacktracenote;
            final wa.onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult;
            final int i20 = i2;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda10
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj2, Object obj3) {
                    int i21 = 2 % 2;
                    int i22 = IAuthTabCallback + 81;
                    onExtraCallback = i22 % 128;
                    int i23 = i22 % 2;
                    putCharSequenceArray putcharsequencearray2 = putcharsequencearray;
                    wa.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                    getBacktraceNote getbacktracenote5 = getbacktracenote2;
                    wa.onTransact ontransact2 = ontransact;
                    float f = fFloatValue;
                    getBacktraceNote getbacktracenote6 = getbacktracenote4;
                    wa.onWarmupCompleted onwarmupcompleted3 = onwarmupcompleted;
                    wa.onExtraCallbackWithResult onextracallbackwithresult5 = onextracallbackwithresult4;
                    int i24 = i20;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    Unit unit = (Unit) w2.IAuthTabCallback(1582375817, new Object[]{putcharsequencearray2, iAuthTabCallback2, getbacktracenote5, ontransact2, Float.valueOf(f), getbacktracenote6, onwarmupcompleted3, onextracallbackwithresult5, Integer.valueOf(i24), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue2)}, -1582375799, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
                    int i25 = IAuthTabCallback + 7;
                    onExtraCallback = i25 % 128;
                    if (i25 % 2 == 0) {
                        return unit;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            });
        }
        return obj;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[5]).booleanValue();
        Role role = (Role) objArr[6];
        Function0 function0 = (Function0) objArr[7];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int iIntValue2 = ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        if ((iIntValue2 & 2) != 0) {
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
        }
        boolean z = (iIntValue2 & 4) != 0 ? true : zBooleanValue;
        if ((iIntValue2 & 8) != 0) {
            int i2 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            zBooleanValue2 = false;
        }
        if ((iIntValue2 & 16) != 0) {
            zBooleanValue3 = false;
        }
        int i4 = iIntValue2 & 32;
        Object obj = null;
        if (i4 != 0) {
            role = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-316053375, iIntValue, -1, "im.toss.tds.compose.component.compound.listheader.listHeaderV3Clickable (TdsListHeaderV3.kt:710)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = setTitleTextColor.onWarmupCompleted(quirksExternalSyntheticBackport0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, onExtraCallbackWithResult(fFloatValue, zBooleanValue2, zBooleanValue3), new setTitleMarginStart(false, (noStore) noStore.onExtraCallback.onWarmupCompleted(new Object[]{noStore.Companion}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted()), 1, (DefaultConstructorMarker) null), z, (String) null, role, function0, 16, (Object) null);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i5 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return quirksExternalSyntheticBackport0OnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static final getTitleMarginEnd onExtraCallbackWithResult(float f, boolean z, boolean z2) {
        int i = 2 % 2;
        Object obj = null;
        getTitleMarginEnd gettitlemarginendOnExtraCallback = getSharedInstance.onExtraCallback(false, false, 0L, new AppLovinAdClickListener(onWarmupCompleted(f), null), IAuthTabCallback(f, z2, z), null, configureReward.onExtraCallback(0.94f, 1.0f), null, 167, null);
        int i2 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return gettitlemarginendOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static final DeviceQuirksExternalSyntheticLambda0.onNavigationEvent IAuthTabCallback(float f, boolean z, boolean z2) {
        float fIAuthTabCallback;
        float fIAuthTabCallback2;
        float fIAuthTabCallback3;
        float fIAuthTabCallback4;
        float fIAuthTabCallback5;
        float fIAuthTabCallback6;
        float fIAuthTabCallback7;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            if (VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(41.0f)) >= 0) {
                if (z2) {
                    int i3 = onExtraCallbackWithResult + 25;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    fIAuthTabCallback7 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f);
                } else if (z) {
                    fIAuthTabCallback7 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
                } else {
                    fIAuthTabCallback7 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(19.0f);
                }
                return new DeviceQuirksExternalSyntheticLambda0.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(19.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(13.0f), fIAuthTabCallback7, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(13.0f), (DefaultConstructorMarker) null);
            }
            if (VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(35.0f)) < 0) {
                if (VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(29.0f)) >= 0) {
                    if (z2) {
                        fIAuthTabCallback5 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f);
                    } else if (!z) {
                        fIAuthTabCallback5 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(15.0f);
                    } else {
                        int i5 = IAuthTabCallback + 109;
                        onExtraCallbackWithResult = i5 % 128;
                        fIAuthTabCallback5 = i5 % 2 != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
                    }
                    return new DeviceQuirksExternalSyntheticLambda0.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(15.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(9.0f), fIAuthTabCallback5, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(9.0f), (DefaultConstructorMarker) null);
                }
                if (VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(23.0f)) >= 0) {
                    if (z2) {
                        fIAuthTabCallback4 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
                    } else if (!z) {
                        fIAuthTabCallback4 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(13.0f);
                    } else {
                        int i6 = IAuthTabCallback + 1;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        fIAuthTabCallback4 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
                    }
                    return new DeviceQuirksExternalSyntheticLambda0.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(13.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f), fIAuthTabCallback4, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f), (DefaultConstructorMarker) null);
                }
                if (VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(19.0f)) >= 0) {
                    if (z2) {
                        fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f);
                    } else if (z) {
                        fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
                    } else {
                        fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.0f);
                    }
                    return new DeviceQuirksExternalSyntheticLambda0.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f), fIAuthTabCallback3, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f), (DefaultConstructorMarker) null);
                }
                if (VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)) < 0) {
                    if (z2) {
                        int i8 = onExtraCallbackWithResult + 17;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f);
                    } else if (z) {
                        fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
                    } else {
                        fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f);
                    }
                    return new DeviceQuirksExternalSyntheticLambda0.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f), fIAuthTabCallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f), (DefaultConstructorMarker) null);
                }
                int i10 = IAuthTabCallback + 109;
                int i11 = i10 % 128;
                onExtraCallbackWithResult = i11;
                int i12 = i10 % 2;
                if (z2) {
                    int i13 = i11 + 99;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f);
                } else if (z) {
                    int i15 = i11 + 73;
                    IAuthTabCallback = i15 % 128;
                    int i16 = i15 % 2;
                    fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
                } else {
                    fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(9.0f);
                }
                return new DeviceQuirksExternalSyntheticLambda0.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(9.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), fIAuthTabCallback2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), (DefaultConstructorMarker) null);
            }
            int i17 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i17 % 128;
            int i18 = i17 % 2;
            if (z2) {
                fIAuthTabCallback6 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
            } else if (z) {
                fIAuthTabCallback6 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
            } else {
                fIAuthTabCallback6 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(17.0f);
            }
            return new DeviceQuirksExternalSyntheticLambda0.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(17.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.0f), fIAuthTabCallback6, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.0f), (DefaultConstructorMarker) null);
        }
        VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(41.0f));
        throw null;
    }

    private static final getHumanReadableName onExtraCallbackWithResult(wa.IAuthTabCallback iAuthTabCallback, long j) {
        getHumanReadableName gethumanreadablenameOnWarmupCompleted;
        GraphicDeviceInfo graphicDeviceInfo;
        long j2;
        use useVar;
        delete deleteVar;
        getSurfaceSize getsurfacesize;
        String str;
        long j3;
        getHighestSurfacePriority gethighestsurfacepriority;
        getParentMetadataCallback getparentmetadatacallback;
        addCameraErrorListener addcameraerrorlistener;
        long j4;
        bindChildren bindchildren;
        ExifSpeedConverter exifSpeedConverter;
        hasMoreElements hasmoreelements;
        int i;
        int i2;
        long j5;
        mergeChildrenConfigs mergechildrenconfigs;
        r8lambdak6CWcefLe9tXuLSlGJo2BURuBM r8lambdak6cwcefle9txulslgjo2burubm;
        getChildPreviewOutConfig getchildpreviewoutconfig;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            gethumanreadablenameOnWarmupCompleted = AppLovinPostbackService.onExtraCallbackWithResult.onWarmupCompleted(iAuthTabCallback.access100());
            graphicDeviceInfo = (GraphicDeviceInfo) wa.IAuthTabCallback.onExtraCallbackWithResult(new Object[]{iAuthTabCallback}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -1283139858, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 1283139859);
            j2 = 0;
            useVar = null;
            deleteVar = null;
            getsurfacesize = null;
            str = null;
            j3 = 0;
            gethighestsurfacepriority = null;
            getparentmetadatacallback = null;
            addcameraerrorlistener = null;
            j4 = 0;
            bindchildren = null;
            exifSpeedConverter = null;
            hasmoreelements = null;
            i = 0;
            i2 = 0;
            j5 = 0;
            mergechildrenconfigs = null;
            r8lambdak6cwcefle9txulslgjo2burubm = null;
            getchildpreviewoutconfig = null;
            i3 = 0;
            i4 = 0;
        } else {
            gethumanreadablenameOnWarmupCompleted = AppLovinPostbackService.onExtraCallbackWithResult.onWarmupCompleted(iAuthTabCallback.access100());
            graphicDeviceInfo = (GraphicDeviceInfo) wa.IAuthTabCallback.onExtraCallbackWithResult(new Object[]{iAuthTabCallback}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -1283139858, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 1283139859);
            j2 = 1;
            useVar = null;
            deleteVar = null;
            getsurfacesize = null;
            str = null;
            j3 = 1;
            gethighestsurfacepriority = null;
            getparentmetadatacallback = null;
            addcameraerrorlistener = null;
            j4 = 0;
            bindchildren = null;
            exifSpeedConverter = null;
            hasmoreelements = null;
            i = 0;
            i2 = 1;
            j5 = 1;
            mergechildrenconfigs = null;
            r8lambdak6cwcefle9txulslgjo2burubm = null;
            getchildpreviewoutconfig = null;
            i3 = 0;
            i4 = 1;
        }
        getHumanReadableName gethumanreadablenameOnNavigationEvent = getHumanReadableName.onNavigationEvent(gethumanreadablenameOnWarmupCompleted, j, j2, graphicDeviceInfo, useVar, deleteVar, getsurfacesize, str, j3, gethighestsurfacepriority, getparentmetadatacallback, addcameraerrorlistener, j4, bindchildren, exifSpeedConverter, hasmoreelements, i, i2, j5, mergechildrenconfigs, r8lambdak6cwcefle9txulslgjo2burubm, getchildpreviewoutconfig, i3, i4, (notifySessionStop) null, 16777210, (Object) null);
        int i7 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return gethumanreadablenameOnNavigationEvent;
    }

    private static final getHumanReadableName onExtraCallback(wa.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1395346444, i, -1, "im.toss.tds.compose.component.compound.listheader.toDescriptionTextStyle (TdsListHeaderV3.kt:822)");
            int i5 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        getHumanReadableName gethumanreadablenameOnNavigationEvent = getHumanReadableName.onNavigationEvent(AppLovinPostbackService.onExtraCallbackWithResult.onWarmupCompleted(iAuthTabCallback.IAuthTabCallbackStub()), w0b.IAuthTabCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6), 0L, iAuthTabCallback.IAuthTabCallbackDefault(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return gethumanreadablenameOnNavigationEvent;
    }

    private static final getHumanReadableName onWarmupCompleted(wa.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(656785068, i, -1, "im.toss.tds.compose.component.compound.listheader.toRightTextStyle (TdsListHeaderV3.kt:829)");
        }
        getHumanReadableName gethumanreadablenameOnNavigationEvent = getHumanReadableName.onNavigationEvent(AppLovinPostbackService.onExtraCallbackWithResult.onWarmupCompleted(iAuthTabCallback.onTransact()), ((Long) w0b.onExtraCallbackWithResult(new Object[]{w0b.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, 6}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1346535552, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1346535551)).longValue(), 0L, iAuthTabCallback.asBinder(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i6 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return gethumanreadablenameOnNavigationEvent;
        }
        throw null;
    }

    private static final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1317345632);
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1317345632, i, -1, "im.toss.tds.compose.component.compound.listheader.LayoutPreview (TdsListHeaderV3.kt:836)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) v5a.IAuthTabCallback.onWarmupCompleted(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda16
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = onNavigationEvent + 109;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = i;
                    int iIntValue = ((Integer) obj2).intValue();
                    Unit unit = (Unit) w2.IAuthTabCallback(241439616, new Object[]{Integer.valueOf(i10), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)}, -241439611, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
                    int i11 = onWarmupCompleted + 41;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    return unit;
                }
            });
        }
        int i7 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r5
      0x0023: PHI (r5v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r5v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r5v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0021, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i3 % 128;
        boolean z = false;
        if (i3 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2074208320);
            int i4 = 44 / 0;
            if (i != 0) {
                int i5 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2074208320);
            if (i != 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallback + 71;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2074208320, i, -1, "im.toss.tds.compose.component.compound.listheader.Options (TdsListHeaderV3.kt:901)");
                if (i8 != 0) {
                    throw null;
                }
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) v5a.IAuthTabCallback.asBinder(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsListHeaderV3Kt$.ExternalSyntheticLambda3(i));
        }
    }

    private static final void asInterface(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1333175116);
        if (i != 0) {
            int i3 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1333175116, i, -1, "im.toss.tds.compose.component.compound.listheader.Sizes (TdsListHeaderV3.kt:975)");
                int i5 = onExtraCallbackWithResult + 95;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) v5a.IAuthTabCallback.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = onExtraCallbackWithResult + 53;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = 48 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsListHeaderV3Kt$.ExternalSyntheticLambda26(i));
        }
    }

    private static final void onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-570564619);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-570564619, i, -1, "im.toss.tds.compose.component.compound.listheader.Debug (TdsListHeaderV3.kt:1045)");
                int i3 = IAuthTabCallback + 63;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 3 / 4;
                }
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) v5a.IAuthTabCallback.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 117;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
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
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i6 = 2 % 2;
                    int i7 = IAuthTabCallback + 65;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = i;
                    int iIntValue = ((Integer) obj2).intValue();
                    Unit unit = (Unit) w2.IAuthTabCallback(1804478235, new Object[]{Integer.valueOf(i9), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)}, -1804478228, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
                    int i10 = onExtraCallbackWithResult + 13;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    return unit;
                }
            });
        }
    }

    private static final void IAuthTabCallbackStub(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(233225393);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallbackWithResult + 49;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(233225393, i, -1, "im.toss.tds.compose.component.compound.listheader.TitleWidthRatioTest (TdsListHeaderV3.kt:1209)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(233225393, i, -1, "im.toss.tds.compose.component.compound.listheader.TitleWidthRatioTest (TdsListHeaderV3.kt:1209)");
            }
            Object[] objArr = {v5a.IAuthTabCallback};
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) v5a.onExtraCallbackWithResult(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -240849904, objArr, 240849923, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = IAuthTabCallback + 45;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
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
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsListHeaderV3Kt$.ExternalSyntheticLambda18(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[PHI: r0
      0x003a: PHI (r0v10 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v11 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002c, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e A[PHI: r0
      0x002e: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v11 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002c, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(final String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        long jOnRelationshipValidationResult;
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-904107380);
            if ((i & 85) == 0) {
                i3 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 2 : 4) | i;
            } else {
                i3 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-904107380);
            if ((i & 6) == 0) {
            }
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i8 = IAuthTabCallback + 111;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    i4 = 16;
                } else {
                    i4 = 32;
                }
                i3 |= i4;
                int i10 = IAuthTabCallback + 109;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 2 % 4;
                }
            }
            if ((i3 & 19) == 18) {
                int i12 = IAuthTabCallback + 25;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i7 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i14 = IAuthTabCallback + 55;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-904107380, i3, -1, "im.toss.tds.compose.component.compound.listheader.PreviewDescription (TdsListHeaderV3.kt:1253)");
                }
                getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel();
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (true ^ ((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1263790861);
                    jOnRelationshipValidationResult = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 476605378, OverseasRrnInputTextField.IAuthTabCallback(), -476605362)).longValue();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1263791821);
                    jOnRelationshipValidationResult = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onRelationshipValidationResult();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, quirksExternalSyntheticBackport03, gethumanreadablenameIAuthTabCallback_Parcel, Long.valueOf(jOnRelationshipValidationResult), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i3 & 14) | 384 | (i3 & 112)), 0, 131056}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i16 = onExtraCallbackWithResult + 27;
                    IAuthTabCallback = i16 % 128;
                    int i17 = i16 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda25
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) {
                        int i18 = 2 % 2;
                        int i19 = onWarmupCompleted + 55;
                        IAuthTabCallback = i19 % 128;
                        int i20 = i19 % 2;
                        String str2 = str;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                        int i21 = i;
                        int i22 = i2;
                        int iIntValue = ((Integer) obj2).intValue();
                        Unit unit = (Unit) w2.IAuthTabCallback(-1242674671, new Object[]{str2, quirksExternalSyntheticBackport04, Integer.valueOf(i21), Integer.valueOf(i22), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)}, 1242674684, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
                        int i23 = onWarmupCompleted + 57;
                        IAuthTabCallback = i23 % 128;
                        int i24 = i23 % 2;
                        return unit;
                    }
                });
                return;
            }
            return;
        }
        int i18 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i18 % 128;
        int i19 = i18 % 2;
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i3 & 19) == 18) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int asBinder(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 85 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallback + 29;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1994845059, i, -1, "im.toss.tds.compose.component.compound.listheader.textSize (TdsListHeaderV3.kt:1264)");
                if (i6 != 0) {
                    throw null;
                }
            }
        } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        int iOnWarmupCompleted = (int) AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(((getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted())).IAuthTabCallbackStub());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return iOnWarmupCompleted;
    }

    private static final String onTransact(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        String str;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1128812910, i, -1, "im.toss.tds.compose.component.compound.listheader.fontWeight (TdsListHeaderV3.kt:1267)");
        }
        GraphicDeviceInfo interfaceDescriptor = ((getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted())).getInterfaceDescriptor();
        isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
        if (Intrinsics.areEqual(interfaceDescriptor, isrepeatingenabled.asBinder())) {
            str = "Regular";
        } else {
            str = Intrinsics.areEqual(interfaceDescriptor, isrepeatingenabled.onExtraCallbackWithResult()) ? "Bold" : "Else";
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i5 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045 A[PHI: r0
      0x0045: PHI (r0v19 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v20 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0027, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[PHI: r0
      0x0029: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v20 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0027, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(final areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1313223549);
            if ((i & 122) == 0) {
                int i5 = IAuthTabCallback + 29;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(areallitemsenabled);
                    throw null;
                }
                i2 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(areallitemsenabled) ? 2 : 4) | i;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i2 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1313223549);
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1313223549, i2, -1, "im.toss.tds.compose.component.compound.listheader.Title (TdsListHeaderV3.kt:1276)");
            }
            areallitemsenabled.onWarmupCompleted(asBinder(cameraCaptureResultEmptyCameraCaptureResult2, 0) + " " + onTransact(cameraCaptureResultEmptyCameraCaptureResult2, 0) + " 타이틀 영역", null, null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult2, (i2 << 18) & 3670016, 62);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda23
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) {
                    int i6 = 2 % 2;
                    int i7 = onWarmupCompleted + 27;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitIAuthTabCallback = w2.IAuthTabCallback(areallitemsenabled, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i9 = IAuthTabCallback + 5;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 == 0) {
                        return unitIAuthTabCallback;
                    }
                    throw null;
                }
            });
            int i6 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static final void onExtraCallback(final w0a w0aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1960688373);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(w0aVar)) {
                int i5 = IAuthTabCallback + 7;
                onExtraCallbackWithResult = i5 % 128;
                i3 = i5 % 2 != 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1960688373, i2, -1, "im.toss.tds.compose.component.compound.listheader.Description (TdsListHeaderV3.kt:1282)");
            }
            int iAsBinder = asBinder(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            String lowerCase = onTransact(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            w0aVar.onExtraCallback(iAsBinder + " " + lowerCase + " 보조설명 영역입니다", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 << 15) & 458752, 30);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i6 = onExtraCallbackWithResult + 11;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda14
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 75;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 == 0) {
                        w0a w0aVar2 = w0aVar;
                        int i10 = i;
                        int iIntValue = ((Integer) obj2).intValue();
                        throw null;
                    }
                    w0a w0aVar3 = w0aVar;
                    int i11 = i;
                    int iIntValue2 = ((Integer) obj2).intValue();
                    Unit unit = (Unit) w2.IAuthTabCallback(-1109989268, new Object[]{w0aVar3, Integer.valueOf(i11), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue2)}, 1109989285, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
                    int i12 = onExtraCallbackWithResult + 19;
                    onExtraCallback = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 46 / 0;
                    }
                    return unit;
                }
            });
            int i8 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 4 / 3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(final RightPreset rightPreset, Function0<Unit> function0, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        Function0<Unit> function02;
        int i4;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function0<Unit> function03;
        int i7;
        int i8 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1385695567);
        if ((i & 6) == 0) {
            int i9 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rightPreset)) {
                i7 = 2;
                i3 = i7 | i;
            } else {
                int i11 = onExtraCallbackWithResult + 35;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    i7 = 4;
                }
                i3 = i7 | i;
            }
        } else {
            i3 = i;
        }
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                function02 = function0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 32 : 16;
            }
            i4 = i2 & 2;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    int i13 = onExtraCallbackWithResult + 71;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    z2 = z;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                        i5 = 256;
                    } else {
                        int i15 = onExtraCallbackWithResult + 49;
                        IAuthTabCallback = i15 % 128;
                        int i16 = i15 % 2;
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i3;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i6 & 147) != 146, i6 & 1)) {
                    int i17 = onExtraCallbackWithResult;
                    int i18 = i17 + 71;
                    IAuthTabCallback = i18 % 128;
                    int i19 = i18 % 2;
                    if (i12 != 0) {
                        int i20 = i17 + 109;
                        IAuthTabCallback = i20 % 128;
                        int i21 = i20 % 2;
                        function03 = null;
                    } else {
                        function03 = function02;
                    }
                    z3 = i4 != 0 ? false : z2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1385695567, i6, -1, "im.toss.tds.compose.component.compound.listheader.Right (TdsListHeaderV3.kt:1290)");
                    }
                    if (function03 == null) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1969134053);
                        rightPreset.onExtraCallbackWithResult(asBinder(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0) + " " + onTransact(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, 0L, 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i6 << 18) & 3670016, 62);
                        if (z3) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1969202098);
                            rightPreset.onNavigationEvent(null, 0L, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i6 << 6) & 896, 3);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1969231889);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1969259541);
                        rightPreset.IAuthTabCallback(asBinder(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0) + " " + onTransact(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), null, 0L, null, z3 ? oExternalSyntheticLambda0.IAuthTabCallback.Companion.IAuthTabCallback() : null, 0L, null, 0L, null, null, function03, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, ((i6 >> 3) & 14) | ((i6 << 3) & 112), 1006);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    function02 = function03;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    z3 = z2;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final Function0<Unit> function04 = function02;
                    final boolean z4 = z3;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.TdsListHeaderV3Kt$$ExternalSyntheticLambda5
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                            int i22 = 2 % 2;
                            int i23 = IAuthTabCallback + 99;
                            onNavigationEvent = i23 % 128;
                            int i24 = i23 % 2;
                            Unit unitIAuthTabCallback = w2.IAuthTabCallback(rightPreset, function04, z4, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i25 = IAuthTabCallback + 71;
                            onNavigationEvent = i25 % 128;
                            int i26 = i25 % 2;
                            return unitIAuthTabCallback;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            z2 = z;
            i6 = i3;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i6 & 147) != 146, i6 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        function02 = function0;
        i4 = i2 & 2;
        if (i4 != 0) {
        }
        z2 = z;
        i6 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i6 & 147) != 146, i6 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final float onWarmupCompleted(float f) {
        int i = 2 % 2;
        if (VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(41.0f)) < 0) {
            if (VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(35.0f)) < 0) {
                if (VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(29.0f)) < 0) {
                    if (VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(23.0f)) < 0) {
                        if (VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(19.0f)) < 0) {
                            if (VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)) >= 0) {
                                return VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(9.0f);
                            }
                            return VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f);
                        }
                        return VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.0f);
                    }
                    int i2 = onExtraCallbackWithResult + 15;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        return VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(13.0f);
                    }
                    int i3 = 86 / 0;
                    return VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(13.0f);
                }
                float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(15.0f);
                int i4 = IAuthTabCallback + 103;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return fIAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            return VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(17.0f);
        }
        int i5 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(19.0f);
    }

    private static final long IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setByteOrder setbyteorder = (setByteOrder) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            return setbyteorder.access100();
        }
        setbyteorder.access100();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        throw null;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(putCharSequenceArray putcharsequencearray, wa.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, wa.onTransact ontransact, float f, getBacktraceNote getbacktracenote2, wa.onWarmupCompleted onwarmupcompleted, wa.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(-2109629430, new Object[]{putcharsequencearray, iAuthTabCallback, getbacktracenote, ontransact, Float.valueOf(f), getbacktracenote2, onwarmupcompleted, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 2109629441, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(String str, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(1111766731, new Object[]{str, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -1111766723, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) IAuthTabCallback(1804478235, new Object[]{Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, -1804478228, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(wa.IAuthTabCallback iAuthTabCallback, wa.onTransact ontransact, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(-415351218, new Object[]{iAuthTabCallback, ontransact, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 415351233, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        return (Unit) IAuthTabCallback(-1242674671, new Object[]{str, quirksExternalSyntheticBackport0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, 1242674684, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) IAuthTabCallback(241439616, new Object[]{Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, -241439611, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(w0a w0aVar, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) IAuthTabCallback(-1109989268, new Object[]{w0aVar, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, 1109989285, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(putCharSequenceArray putcharsequencearray, wa.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, wa.onTransact ontransact, float f, getBacktraceNote getbacktracenote2, wa.onWarmupCompleted onwarmupcompleted, wa.onExtraCallbackWithResult onextracallbackwithresult, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) IAuthTabCallback(1582375817, new Object[]{putcharsequencearray, iAuthTabCallback, getbacktracenote, ontransact, Float.valueOf(f), getbacktracenote2, onwarmupcompleted, onextracallbackwithresult, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, -1582375799, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, w0a w0aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(1850041827, new Object[]{str, w0aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -1850041825, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
    }

    public static final void onWarmupCompleted(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable wa.IAuthTabCallback iAuthTabCallback, @Nullable wa.onTransact ontransact, float f, @Nullable wa.onNavigationEvent onnavigationevent, @Nullable String str2, @Nullable wa.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable wa.onExtraCallback onextracallback, @Nullable String str3, @Nullable Function0<Unit> function0, boolean z, @Nullable wa.onExtraCallbackWithResult onextracallbackwithresult, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) throws NoWhenBranchMatchedException {
        IAuthTabCallback(1724574124, new Object[]{str, quirksExternalSyntheticBackport0, iAuthTabCallback, ontransact, Float.valueOf(f), onnavigationevent, str2, iAuthTabCallbackStub, onextracallback, str3, function0, Boolean.valueOf(z), onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, -1724574112, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
    }

    private static final void IAuthTabCallback(putCharSequenceArray putcharsequencearray, wa.IAuthTabCallback iAuthTabCallback, getBacktraceNote<? super areAllItemsEnabled, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, wa.onTransact ontransact, float f, getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, wa.onWarmupCompleted onwarmupcompleted, wa.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        IAuthTabCallback(1167922462, new Object[]{putcharsequencearray, iAuthTabCallback, getbacktracenote, ontransact, Float.valueOf(f), getbacktracenote2, onwarmupcompleted, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -1167922461, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
    }

    private static final Unit IAuthTabCallback(wa.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(1665016886, new Object[]{iAuthTabCallback, getbacktracenote, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -1665016877, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
    }

    private static final Unit onNavigationEvent(putCharSequenceArray putcharsequencearray, wa.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, wa.onTransact ontransact, float f, getBacktraceNote getbacktracenote2, wa.onWarmupCompleted onwarmupcompleted, wa.onExtraCallbackWithResult onextracallbackwithresult, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) IAuthTabCallback(-936360999, new Object[]{putcharsequencearray, iAuthTabCallback, getbacktracenote, ontransact, Float.valueOf(f), getbacktracenote2, onwarmupcompleted, onextracallbackwithresult, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, 936361015, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
    }

    public static final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, boolean z2, boolean z3, @Nullable Role role, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        return (QuirksExternalSyntheticBackport0) IAuthTabCallback(1123787723, new Object[]{quirksExternalSyntheticBackport0, Float.valueOf(f), camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), role, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, -1123787717, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
    }

    public static /* synthetic */ getTitleMarginEnd onWarmupCompleted(float f, boolean z, boolean z2, int i, Object obj) {
        return (getTitleMarginEnd) IAuthTabCallback(1160267148, new Object[]{Float.valueOf(f), Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i), obj}, -1160267144, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
    }
}
