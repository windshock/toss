package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.features.home.core.ui.compose.AssetDetailFixedBottomContentKt$;
import im.toss.features.home.core.ui.compose.AssetDetailFixedBottomContentKt$AssetHomeDetailFixedBottomContent$3$1$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.getStreamSharingChildren;
import o.handleNativeAdClick;
import o.setCallToAction;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class desc {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static final RoundedCornerShape onExtraCallbackWithResult = RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(36.0f));
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public static final /* synthetic */ RoundedCornerShape IAuthTabCallback() {
        RoundedCornerShape roundedCornerShape;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            roundedCornerShape = onExtraCallbackWithResult;
            int i4 = 11 / 0;
        } else {
            roundedCornerShape = onExtraCallbackWithResult;
        }
        int i5 = i3 + 35;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return roundedCornerShape;
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 5;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            IAuthTabCallback(quirksExternalSyntheticBackport0, str, str2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            IAuthTabCallback(quirksExternalSyntheticBackport0, str, str2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i2);
        int i9 = (~(i7 | i5)) | i8 | (~(i2 | i5));
        int i10 = (~((~i2) | i6)) | (~(i6 | i5));
        int i11 = (~((~i5) | i7)) | i8;
        int i12 = i6 + i2 + i4 + (1821889583 * i3) + ((-349070011) * i);
        int i13 = i12 * i12;
        int i14 = (575745661 * i6) + 325058560 + (1920428227 * i2) + (i9 * 448227522) + ((-448227522) * i10) + (448227522 * i11) + (1472200704 * i4) + (473956352 * i3) + (1723858944 * i) + ((-1436549120) * i13);
        int i15 = (i6 * 921699331) + 387174459 + (i2 * 921699517) + (i9 * 62) + (i10 * (-62)) + (i11 * 62) + (i4 * 921699455) + (i3 * 347275089) + (i * 1925323067) + (i13 * 94371840);
        int i16 = i14 + (i15 * i15 * (-174063616));
        return i16 != 1 ? i16 != 2 ? onWarmupCompleted(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Unit unitOnWarmupCompleted;
        float fFloatValue = ((Number) objArr[0]).floatValue();
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue3 = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnWarmupCompleted = onWarmupCompleted(fFloatValue, getbacktracenote, getbacktracenote2, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
            int i3 = 26 / 0;
        } else {
            unitOnWarmupCompleted = onWarmupCompleted(fFloatValue, getbacktracenote, getbacktracenote2, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        }
        int i4 = IAuthTabCallback + 27;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static final /* synthetic */ QuirksExternalSyntheticBackport0 onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(quirksExternalSyntheticBackport0);
        }
        onNavigationEvent(quirksExternalSyntheticBackport0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 115;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 95;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 27;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return quirksExternalSyntheticBackport0OnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        }
        onExtraCallbackWithResult(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(quirksExternalSyntheticBackport0, str, str2, cameraCaptureResultEmptyCameraCaptureResult, i, i2);
        if (i5 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue3 = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(quirksExternalSyntheticBackport0, str, str2, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, str, str2, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i3 = onWarmupCompleted + 53;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 64 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static final Unit onWarmupCompleted(float f, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 113;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(f, (getBacktraceNote<? super ByteArrayPools, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, (getBacktraceNote<? super ByteArrayPools, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 53;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final QuirksExternalSyntheticBackport0 onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        int i = 2 % 2;
        Object obj = null;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = resolveQuirkNames.onNavigationEvent(quirksExternalSyntheticBackport0, (Function1) null, new AssetDetailFixedBottomContentKt$.ExternalSyntheticLambda0(), 1, (Object) null);
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return quirksExternalSyntheticBackport0OnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    private static final QuirksExternalSyntheticBackport0 onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2043174036);
        Object obj = null;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onWarmupCompleted + 7;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2043174036, i, -1, "im.toss.features.home.core.ui.compose.backgroundModifier.<anonymous> (AssetDetailFixedBottomContent.kt:55)");
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2043174036, i, -1, "im.toss.features.home.core.ui.compose.backgroundModifier.<anonymous> (AssetDetailFixedBottomContent.kt:55)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f);
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
        long jExtraCommand = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).extraCommand();
        RoundedCornerShape roundedCornerShape = onExtraCallbackWithResult;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = verifyDrawable.onExtraCallbackWithResult(ensureNavButtonView.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, fIAuthTabCallback, jExtraCommand, roundedCornerShape), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).mayLaunchUrl(), roundedCornerShape);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = IAuthTabCallback + 61;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = 47 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
    }

    public static final class onExtraCallback implements component5 {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ float onWarmupCompleted;

        onExtraCallback(float f) {
            this.onWarmupCompleted = f;
        }

        public static /* synthetic */ Unit IAuthTabCallback(long j, List list, getStreamSharingChildren getstreamsharingchildren, getStreamSharingChildren getstreamsharingchildren2, getStreamSharingChildren getstreamsharingchildren3, float f, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(j, list, getstreamsharingchildren, getstreamsharingchildren2, getstreamsharingchildren3, f, onextracallbackwithresult);
            int i4 = onExtraCallback + 79;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 9 / 0;
            }
            return unitOnNavigationEvent;
        }

        public /* bridge */ int IAuthTabCallback(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends FuturesExternalSyntheticLambda2> list, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 83;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int iIAuthTabCallback = super.IAuthTabCallback(futuresExternalSyntheticLambda3, list, i);
            if (i4 != 0) {
                int i5 = 0 / 0;
            }
            return iIAuthTabCallback;
        }

        public /* bridge */ int onExtraCallback(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends FuturesExternalSyntheticLambda2> list, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 65;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                super.onExtraCallback(futuresExternalSyntheticLambda3, list, i);
                obj.hashCode();
                throw null;
            }
            int iOnExtraCallback = super.onExtraCallback(futuresExternalSyntheticLambda3, list, i);
            int i4 = onExtraCallback + 107;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iOnExtraCallback;
            }
            obj.hashCode();
            throw null;
        }

        public /* bridge */ int onNavigationEvent(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends FuturesExternalSyntheticLambda2> list, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 93;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int iOnNavigationEvent = super.onNavigationEvent(futuresExternalSyntheticLambda3, list, i);
            int i5 = IAuthTabCallback + 115;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return iOnNavigationEvent;
        }

        public /* bridge */ int onWarmupCompleted(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends FuturesExternalSyntheticLambda2> list, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 99;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int iOnWarmupCompleted = super.onWarmupCompleted(futuresExternalSyntheticLambda3, list, i);
            int i5 = onExtraCallback + 57;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return iOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final component8 onExtraCallbackWithResult(component4 component4Var, List<? extends component7> list, long j) {
            getStreamSharingChildren getstreamsharingchildrenOnExtraCallback;
            getStreamSharingChildren getstreamsharingchildrenOnExtraCallback2;
            int iT_;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(component4Var, "");
            Intrinsics.checkNotNullParameter(list, "");
            long jIAuthTabCallback = list.size() >= 2 ? r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, (VirtualCameraCaptureResult.asInterface(j) - component4Var.onExtraCallbackWithResult(this.onWarmupCompleted)) / 2, 0, 0, 13, (Object) null) : r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, VirtualCameraCaptureResult.asInterface(j), 0, 0, 13, (Object) null);
            component7 component7Var = (component7) CollectionsKt.getOrNull(list, 0);
            if (component7Var != null) {
                int i2 = onExtraCallback + 107;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    component7Var.onExtraCallback(jIAuthTabCallback);
                    getstreamsharingchildren.hashCode();
                    throw null;
                }
                getstreamsharingchildrenOnExtraCallback = component7Var.onExtraCallback(jIAuthTabCallback);
            } else {
                getstreamsharingchildrenOnExtraCallback = null;
            }
            component7 component7Var2 = (component7) CollectionsKt.getOrNull(list, 1);
            if (component7Var2 != null) {
                int i3 = onExtraCallback + 85;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                getstreamsharingchildrenOnExtraCallback2 = component7Var2.onExtraCallback(jIAuthTabCallback);
            } else {
                getstreamsharingchildrenOnExtraCallback2 = null;
            }
            int iAsBinder = VirtualCameraCaptureResult.asBinder(j);
            if (getstreamsharingchildrenOnExtraCallback != null) {
                int i5 = IAuthTabCallback + 45;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                iT_ = getstreamsharingchildrenOnExtraCallback.T_();
            } else {
                int i7 = onExtraCallback + 49;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 / 2;
                }
                iT_ = 0;
            }
            int iMax = Math.max(iAsBinder, Math.max(iT_, getstreamsharingchildrenOnExtraCallback2 != null ? getstreamsharingchildrenOnExtraCallback2.T_() : 0));
            component7 component7Var3 = (component7) CollectionsKt.getOrNull(list, 2);
            return component4.IAuthTabCallback(component4Var, VirtualCameraCaptureResult.asInterface(j), iMax, (Map) null, new AssetDetailFixedBottomContentKt$AssetHomeDetailFixedBottomContent$3$1$.ExternalSyntheticLambda0(j, list, getstreamsharingchildrenOnExtraCallback, getstreamsharingchildrenOnExtraCallback2, component7Var3 != null ? component7Var3.onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, component4Var.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f)), 0, iMax, 5, (Object) null)) : null, this.onWarmupCompleted), 4, (Object) null);
        }

        private static final Unit onNavigationEvent(long j, List list, getStreamSharingChildren getstreamsharingchildren, getStreamSharingChildren getstreamsharingchildren2, getStreamSharingChildren getstreamsharingchildren3, float f, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int interfaceDescriptor;
            int i;
            float f2;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            int iAsInterface = VirtualCameraCaptureResult.asInterface(j) / 2;
            if (list.size() <= 1) {
                int i3 = IAuthTabCallback;
                int i4 = i3 + 125;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                if (getstreamsharingchildren != null) {
                    int i6 = i3 + 7;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, iAsInterface - (getstreamsharingchildren.getInterfaceDescriptor() / 2), 0, 0.0f, 4, (Object) null);
                }
            } else {
                if (getstreamsharingchildren != null) {
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, (iAsInterface - getstreamsharingchildren.getInterfaceDescriptor()) / 2, 0, 0.0f, 4, (Object) null);
                    getstreamsharingchildren.getInterfaceDescriptor();
                }
                if (getstreamsharingchildren2 != null) {
                    int i8 = IAuthTabCallback + 113;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        interfaceDescriptor = iAsInterface * ((iAsInterface >> getstreamsharingchildren2.getInterfaceDescriptor()) + 5);
                        i = 0;
                        f2 = 1.0f;
                    } else {
                        interfaceDescriptor = iAsInterface + ((iAsInterface - getstreamsharingchildren2.getInterfaceDescriptor()) / 2);
                        i = 0;
                        f2 = 0.0f;
                    }
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren2, interfaceDescriptor, i, f2, 4, (Object) null);
                }
                if (getstreamsharingchildren3 != null) {
                    int i9 = IAuthTabCallback + 51;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren3, iAsInterface - (onextracallbackwithresult.onExtraCallbackWithResult(f) / 2), 0, 0.0f, 4, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[PHI: r1 r6
      0x0030: PHI (r1v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002b, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r6v29 int) = (r6v4 int), (r6v30 int) binds: [B:8:0x002b, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r1 r6
      0x002d: PHI (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002b, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x002d: PHI (r6v5 int) = (r6v4 int), (r6v30 int) binds: [B:8:0x002b, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(float f, @Nullable getBacktraceNote<? super ByteArrayPools, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super ByteArrayPools, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        int i4;
        long jPostMessage;
        int i5;
        float fIAuthTabCallback = f;
        int i6 = 2 % 2;
        int i7 = IAuthTabCallback + 49;
        onWarmupCompleted = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1183751277);
            i3 = i2 & 1;
            if (i3 != 0) {
                i4 = i | 6;
            } else if ((i & 6) == 0) {
                int i8 = onWarmupCompleted + 3;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fIAuthTabCallback);
                    obj.hashCode();
                    throw null;
                }
                i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fIAuthTabCallback) ? 4 : 2) | i;
            } else {
                i4 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1183751277);
            i3 = i2 & 1;
            if (i3 != 0) {
            }
        }
        if ((i & 48) == 0) {
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote))) {
                int i9 = onWarmupCompleted + 77;
                IAuthTabCallback = i9 % 128;
                i5 = i9 % 2 == 0 ? 38 : 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i & 384) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ? 256 : 128;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 147) != 146, i4 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (i3 != 0) {
                int i10 = IAuthTabCallback + 49;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1183751277, i4, -1, "im.toss.features.home.core.ui.compose.AssetHomeDetailFixedBottomContent (AssetDetailFixedBottomContent.kt:128)");
            }
            float fOnNavigationEvent = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent();
            boolean z = fOnNavigationEvent >= 1.35f;
            boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fOnNavigationEvent);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zIAuthTabCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new ByteArrayPools(z);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            ByteArrayPools byteArrayPools = (ByteArrayPools) objOnMinimized;
            if (z) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(842591022);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(onextracallback, fIAuthTabCallback, 0.0f, 2, (Object) null);
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
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
                    int i12 = IAuthTabCallback + 27;
                    onWarmupCompleted = i12 % 128;
                    int i13 = i12 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    int i14 = onWarmupCompleted + 77;
                    IAuthTabCallback = i14 % 128;
                    int i15 = i14 % 2;
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
                if (getbacktracenote != null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-30607161);
                    getbacktracenote.invoke(byteArrayPools, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i4 & 112));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-30554306);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                if (getbacktracenote2 != null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-30513169);
                    if (getbacktracenote != null) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-30475442);
                        ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-30398562);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                    getbacktracenote2.invoke(byteArrayPools, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i4 >> 3) & 112));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-30344994);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(843052178);
                float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(onextracallback2, fIAuthTabCallback, 0.0f, 2, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(48.0f), 1, (Object) null)).onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(onextracallback2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f)));
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new onExtraCallback(fIAuthTabCallback2);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                component5 component5Var = (component5) objOnMinimized2;
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
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
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5Var, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                if (getbacktracenote != null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1361298997);
                    getbacktracenote.invoke(byteArrayPools, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i4 & 112));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1361359540);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                if (getbacktracenote2 != null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1361401173);
                    getbacktracenote2.invoke(byteArrayPools, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i4 >> 3) & 112));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1361461716);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                if (getbacktracenote != null && getbacktracenote2 != null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1361532985);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback2, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), 5, (Object) null), fIAuthTabCallback2), 0.0f, 1, (Object) null);
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1895732420);
                        jPostMessage = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).newSession();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1895731236);
                        jPostMessage = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).postMessage();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback, jPostMessage, (toMetersPerSecond) null, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1361927956);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        float f2 = fIAuthTabCallback;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetDetailFixedBottomContentKt$.ExternalSyntheticLambda1(f2, getbacktracenote, getbacktracenote2, i, i2));
        }
    }

    private static final void IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i5;
        boolean z;
        int i6;
        int i7;
        float f;
        long jLongValue;
        int i8 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(316726620);
        int i9 = i2 & 1;
        if (i9 != 0) {
            int i10 = onWarmupCompleted + 61;
            IAuthTabCallback = i10 % 128;
            i3 = i10 % 2 == 0 ? i | 112 : i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            int i11 = IAuthTabCallback + 41;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                int i13 = onWarmupCompleted + 53;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i15 = onWarmupCompleted + 35;
            IAuthTabCallback = i15 % 128;
            int i16 = i15 % 2;
            i3 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ^ true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 256 : 128;
        }
        int i17 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i17 & 147) != 146, i17 & 1)) {
            if (i9 != 0) {
                int i18 = IAuthTabCallback + 93;
                onWarmupCompleted = i18 % 128;
                int i19 = i18 % 2;
                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
            } else {
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            }
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i20 = onWarmupCompleted + 79;
                IAuthTabCallback = i20 % 128;
                if (i20 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(316726620, i17, -1, "im.toss.features.home.core.ui.compose.Button (AssetDetailFixedBottomContent.kt:229)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(316726620, i17, -1, "im.toss.features.home.core.ui.compose.Button (AssetDetailFixedBottomContent.kt:229)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null).onExtraCallback(quirksExternalSyntheticBackport03);
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onNavigationEvent(), QuirkSettingsLoader.Companion.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
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
            if (str == null || StringsKt.isBlank(str)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                i5 = 6;
                z = false;
                i6 = i17;
                i7 = 1;
                f = 0.0f;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1665506666);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1665145330);
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1470301146);
                    jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).newSessionWithExtras();
                } else {
                    int i21 = IAuthTabCallback + 29;
                    onWarmupCompleted = i21 % 128;
                    int i22 = i21 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1470302330);
                    jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -523958350, OverseasRrnInputTextField.IAuthTabCallback(), 523958365)).longValue();
                }
                long j = jLongValue;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                int i23 = onWarmupCompleted + 119;
                IAuthTabCallback = i23 % 128;
                int i24 = i23 % 2;
                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                f = 0.0f;
                z = false;
                i6 = i17;
                i7 = 1;
                setMainImageUri.IAuthTabCallback(str, deprecated_eventListenerFactory.Icon, (QuirksExternalSyntheticBackport0) null, handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), j, 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i6 >> 3) & 14) | 3120, 0, 8164);
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i5 = 6;
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), cameraCaptureResultEmptyCameraCaptureResult2, 6);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, null, (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, i5).setEngagementSignalsCallback()), 0L, 0L, null, Integer.valueOf(i7), null, Float.valueOf(f), null, null, 0L, Integer.valueOf(AppLovinVastMediaViewf.Companion.onNavigationEvent()), Boolean.valueOf(z), isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(((i6 >> 6) & 14) | 12582912), 199680, 89970}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            int i25 = i7;
            if (((CameraConfigExternalSyntheticLambda0.asBinder() ? 1 : 0) ^ i25) != i25) {
                int i26 = onWarmupCompleted + 111;
                IAuthTabCallback = i26 % 128;
                if (i26 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i27 = 63 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetDetailFixedBottomContentKt$.ExternalSyntheticLambda3(quirksExternalSyntheticBackport02, str, str2, i, i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-722455155);
        if (i != 0) {
            int i3 = IAuthTabCallback + 59;
            onWarmupCompleted = i3 % 128;
            z = i3 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = IAuthTabCallback + 59;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-722455155, i, -1, "im.toss.features.home.core.ui.compose.Preview (AssetDetailFixedBottomContent.kt:258)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(onextracallback, y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
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
                int i6 = onWarmupCompleted + 11;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
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
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            } else {
                int i8 = IAuthTabCallback + 61;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onExtraCallback(), (toMetersPerSecond) null, 2, (Object) null);
            component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
            Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i10 = onWarmupCompleted + 43;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            ByteArrayPoolsByteArray8Pool byteArrayPoolsByteArray8Pool = ByteArrayPoolsByteArray8Pool.onNavigationEvent;
            u1.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, (u2) null, byteArrayPoolsByteArray8Pool.onTransact(), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 0, 4091);
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            lExternalSyntheticLambda4.onExtraCallback(1.5f, byteArrayPoolsByteArray8Pool.asBinder(), cameraCaptureResultEmptyCameraCaptureResult2, 54);
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetDetailFixedBottomContentKt$.ExternalSyntheticLambda2(i));
        }
    }

    static {
        int i = onNavigationEvent + 75;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, str, str2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onExtraCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1632919362, objArr, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, -1632919362);
    }

    public static /* synthetic */ Unit onExtraCallback(float f, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {Float.valueOf(f), getbacktracenote, getbacktracenote2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onExtraCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -2132579141, objArr, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, 2132579143);
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onExtraCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -60686079, objArr, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, 60686080);
    }
}
