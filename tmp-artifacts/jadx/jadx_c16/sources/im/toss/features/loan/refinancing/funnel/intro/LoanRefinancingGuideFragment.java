package im.toss.features.loan.refinancing.funnel.intro;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import im.toss.base.BaseFragment;
import im.toss.features.loan.refinancing.data.RefinancingAccountState;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingScrapingFailureActivity;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingViewModel;
import im.toss.features.loan.refinancing.funnel.common.RefinancingLoanType;
import im.toss.features.loan.refinancing.funnel.input.LoanRefinancingScrapingHandleActivity;
import im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingGuideFragment$;
import im.toss.features.loan.ui.R;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonObject;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Camera2CameraControlImplExternalSyntheticLambda2;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraProviderInitRetryPolicy1;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DERSet;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.ForwardingCameraControl;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageService_Parcel;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.ImageCapturePixelHDRPlusQuirk;
import o.LowLightBoostControlExternalSyntheticLambda0;
import o.LowLightBoostControlExternalSyntheticLambda1;
import o.PageContext;
import o.ProducerSequenceFactoryExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.ResourceCaptureExtension;
import o.RippleNode;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.ZslRingBuffer;
import o.addAllCommandLine;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.clearWrite;
import o.component5;
import o.convertAnyToMap;
import o.getAwbState;
import o.getBacktraceNote;
import o.getCurrentMenuItems;
import o.getSupportedHighSpeedResolutionsFor;
import o.getSwitchMinWidth;
import o.getTakePictureRequest;
import o.initRenderFinish;
import o.onPreviewReleased;
import o.preFillDefault;
import o.removeAnimatorPauseListener;
import o.resolveQuirkNames;
import o.reverseAnimationSpeed;
import o.sendInstantData;
import o.setAdVideoPlaybackListener;
import o.setAnimation;
import o.setCallToAction;
import o.setContentInsetsAbsolute;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.u1;
import o.u2;
import o.u4;
import o.wie2;
import o.y3ExternalSyntheticLambda0;
import o.zzad;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;
import viva.republica.toss.network.model.loan.LoanFunnelType;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanRefinancingGuideFragment extends Hilt_LoanRefinancingGuideFragment {
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallback_Parcel;
    private static int access000;
    private static final String onExtraCallbackWithResult;
    static final /* synthetic */ addAllCommandLine<Object>[] onNavigationEvent;
    public static final int onWarmupCompleted;
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallback;
    private Function0<Unit> IAuthTabCallbackDefault;
    private final Lazy access100;
    private final IEngagementSignalsCallback_Parcel<Intent> asBinder;

    @Inject
    public zzad environments;
    private final PageContext onExtraCallback = preFillDefault.onExtraCallbackWithResult(this, onExtraCallback.onNavigationEvent);
    private int onTransact = R.layout.fragment_loan_refinancing_guide;
    private static final byte[] $$a = {68, -127, 122, -15};
    private static final int $$b = 164;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int extraCallbackWithResult = 1;
    private static int getInterfaceDescriptor = 0;
    private static int IAuthTabCallbackStubProxy = 1;

    static final /* synthetic */ class onExtraCallbackWithResult implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ Function1 onExtraCallback;

        onExtraCallbackWithResult(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if ((!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) || (!(obj instanceof FunctionAdapter))) {
                int i2 = IAuthTabCallback + 49;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = IAuthTabCallback + 31;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            clearWrite functionDelegate2 = ((FunctionAdapter) obj).getFunctionDelegate();
            if (i5 != 0) {
                return Intrinsics.areEqual(functionDelegate, functionDelegate2);
            }
            Intrinsics.areEqual(functionDelegate, functionDelegate2);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            Function1 function1 = this.onExtraCallback;
            int i4 = i3 + 33;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                getFunctionDelegate().hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = IAuthTabCallback + 121;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 10 / 0;
            }
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.invoke(obj);
            int i4 = IAuthTabCallback + 123;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, short s) {
        int i;
        int i2;
        int i3 = 4 - (b2 * 2);
        byte[] bArr = $$a;
        int i4 = (b * 4) + 105;
        int i5 = (s * 2) + 1;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i3++;
            i4 += -i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i3];
            i3++;
            i4 += -i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    static {
        access000 = 0;
        IAuthTabCallbackStub();
        Object[] objArr = new Object[1];
        a(50 - (Process.myTid() >> 22), 7 - TextUtils.indexOf("", ""), new char[]{3, 6, 11, 65534, 11, 0, 2, 16, 2, 15, 19, 6, 0, 2, 17, '\f', 16, 16, 65495, 65484, 65484, '\t', '\f', 65534, 11, 65482, 0, '\f', '\n', '\n', '\f', 11, 65484, 65535, 18, 16, 6, 11, 2, 16, 16, 65482, '\f', 20, 11, 2, 15, 65482, 15, 2}, false, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 296, objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        onNavigationEvent = new addAllCommandLine[]{new PropertyReference1Impl<>(LoanRefinancingGuideFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingGuideBinding;", 0)};
        Companion = new onWarmupCompleted((DefaultConstructorMarker) null);
        onWarmupCompleted = 8;
        int i = extraCallbackWithResult + 89;
        access000 = i % 128;
        int i2 = i % 2;
    }

    private static final Unit IAuthTabCallback(LoanRefinancingGuideFragment loanRefinancingGuideFragment, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 97;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {loanRefinancingGuideFragment, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
        onExtraCallbackWithResult(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), objArr, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 232344324, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -232344324);
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackStubProxy + 79;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ void IAuthTabCallback(LoanRefinancingGuideFragment loanRefinancingGuideFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 49;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(loanRefinancingGuideFragment, iEngagementSignalsCallbackDefault);
        int i4 = getInterfaceDescriptor + 111;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingGuideFragment loanRefinancingGuideFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallbackWithResult(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{loanRefinancingGuideFragment, th}, iOnWarmupCompleted2, -944317141, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 944317145);
        int i4 = getInterfaceDescriptor + 65;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i6;
        int i8 = ~(i7 | i4);
        int i9 = (~(i7 | i2)) | i8 | (~(i4 | i2));
        int i10 = (~((~i4) | i6)) | (~(i6 | i2));
        int i11 = (~((~i2) | i7)) | i8;
        int i12 = i6 + i4 + i3 + (1821889583 * i) + ((-349070011) * i5);
        int i13 = i12 * i12;
        int i14 = (575745661 * i6) + 325058560 + (1920428227 * i4) + (i9 * 448227522) + ((-448227522) * i10) + (448227522 * i11) + (1472200704 * i3) + (473956352 * i) + (1723858944 * i5) + ((-1436549120) * i13);
        int i15 = (i6 * 921699331) + 387174459 + (i4 * 921699517) + (i9 * 62) + (i10 * (-62)) + (i11 * 62) + (i3 * 921699455) + (i * 347275089) + (i5 * 1925323067) + (i13 * 94371840);
        int i16 = i14 + (i15 * i15 * (-174063616));
        if (i16 != 1) {
            return i16 != 2 ? i16 != 3 ? i16 != 4 ? i16 != 5 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr);
        }
        LoanRefinancingGuideFragment loanRefinancingGuideFragment = (LoanRefinancingGuideFragment) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        int i17 = 2 % 2;
        int i18 = getInterfaceDescriptor + 41;
        IAuthTabCallbackStubProxy = i18 % 128;
        int i19 = i18 % 2;
        loanRefinancingGuideFragment.dismissProgressDialog();
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.FALSE);
        if (onNavigationEvent.onWarmupCompleted[loanRefinancingGuideFragment.access100().getInterfaceDescriptor().ordinal()] == 1) {
            loanRefinancingGuideFragment.newSessionWithExtras();
        } else {
            loanRefinancingGuideFragment.newAuthTabSession();
        }
        Unit unit = Unit.INSTANCE;
        int i20 = getInterfaceDescriptor + 111;
        IAuthTabCallbackStubProxy = i20 % 128;
        int i21 = i20 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingGuideFragment loanRefinancingGuideFragment, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 7;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            IAuthTabCallback(loanRefinancingGuideFragment, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(loanRefinancingGuideFragment, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = getInterfaceDescriptor + 59;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingGuideFragment loanRefinancingGuideFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(loanRefinancingGuideFragment, setDetectableSize);
        int i4 = getInterfaceDescriptor + 33;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingGuideFragment loanRefinancingGuideFragment, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        Unit unit;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            unit = (Unit) onExtraCallbackWithResult(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{loanRefinancingGuideFragment, getsupportedhighspeedresolutionsfor}, iOnWarmupCompleted2, 1001532625, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1001532624);
            int i3 = 34 / 0;
        } else {
            int iOnWarmupCompleted3 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            int iOnWarmupCompleted4 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            unit = (Unit) onExtraCallbackWithResult(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{loanRefinancingGuideFragment, getsupportedhighspeedresolutionsfor}, iOnWarmupCompleted4, 1001532625, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1001532624);
        }
        int i4 = IAuthTabCallbackStubProxy + 47;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingGuideFragment loanRefinancingGuideFragment, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 23;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanRefinancingGuideFragment, getsupportedhighspeedresolutionsfor, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackStubProxy + 47;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(LoanRefinancingGuideFragment loanRefinancingGuideFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(loanRefinancingGuideFragment, iEngagementSignalsCallbackDefault);
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingGuideFragment loanRefinancingGuideFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 9;
        getInterfaceDescriptor = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(loanRefinancingGuideFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(loanRefinancingGuideFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = getInterfaceDescriptor + 7;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingGuideFragment loanRefinancingGuideFragment, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 121;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            throw null;
        }
        int iOnWarmupCompleted3 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted4 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallbackWithResult(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{loanRefinancingGuideFragment, getsupportedhighspeedresolutionsfor}, iOnWarmupCompleted4, -501851212, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 501851217);
        int i3 = IAuthTabCallbackStubProxy + 15;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 79 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, LoanRefinancingGuideFragment loanRefinancingGuideFragment, RefinancingAccountState refinancingAccountState) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(getsupportedhighspeedresolutionsfor, loanRefinancingGuideFragment, refinancingAccountState);
        }
        IAuthTabCallback(getsupportedhighspeedresolutionsfor, loanRefinancingGuideFragment, refinancingAccountState);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 25;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 105;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return 1262101L;
    }

    public LoanRefinancingGuideFragment() {
        Lazy lazyOnNavigationEvent = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onTransact(new IAuthTabCallback(this)));
        this.access100 = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(LoanRefinancingIntroViewModel.class), new asBinder(lazyOnNavigationEvent), new asInterface(null, lazyOnNavigationEvent), new IAuthTabCallbackStub(this, lazyOnNavigationEvent));
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_ParcelRegisterForActivityResult = registerForActivityResult(new IPostMessageService_Parcel.asInterface(), new LoanRefinancingGuideFragment$.ExternalSyntheticLambda6(this));
        Intrinsics.checkNotNullExpressionValue(iEngagementSignalsCallback_ParcelRegisterForActivityResult, "");
        this.asBinder = iEngagementSignalsCallback_ParcelRegisterForActivityResult;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_ParcelRegisterForActivityResult2 = registerForActivityResult(new IPostMessageService_Parcel.asInterface(), new LoanRefinancingGuideFragment$.ExternalSyntheticLambda7(this));
        Intrinsics.checkNotNullExpressionValue(iEngagementSignalsCallback_ParcelRegisterForActivityResult2, "");
        this.IAuthTabCallback = iEngagementSignalsCallback_ParcelRegisterForActivityResult2;
    }

    public final zzad onExtraCallback() {
        int i = 2 % 2;
        zzad zzadVar = this.environments;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 83;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 87;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return zzadVar;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, ResourceCaptureExtension> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        public static final onExtraCallback onNavigationEvent = new onExtraCallback();
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                int i2 = 44 / 0;
            }
        }

        onExtraCallback() {
            super(1, ResourceCaptureExtension.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingGuideBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ResourceCaptureExtension resourceCaptureExtensionOnNavigationEvent = onNavigationEvent((View) obj);
            int i4 = IAuthTabCallback + 37;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return resourceCaptureExtensionOnNavigationEvent;
            }
            throw null;
        }

        public final ResourceCaptureExtension onNavigationEvent(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            ResourceCaptureExtension resourceCaptureExtensionOnNavigationEvent = ResourceCaptureExtension.onNavigationEvent(view);
            int i4 = IAuthTabCallback + 41;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return resourceCaptureExtensionOnNavigationEvent;
        }
    }

    private final ResourceCaptureExtension asInterface() {
        PageContext pageContext;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            pageContext = this.onExtraCallback;
            addallcommandline = onNavigationEvent[0];
        } else {
            pageContext = this.onExtraCallback;
            addallcommandline = onNavigationEvent[0];
        }
        ResourceCaptureExtension resourceCaptureExtensionOnExtraCallbackWithResult = pageContext.onExtraCallbackWithResult(this, addallcommandline);
        Intrinsics.checkNotNullExpressionValue(resourceCaptureExtensionOnExtraCallbackWithResult, "");
        return resourceCaptureExtensionOnExtraCallbackWithResult;
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 15;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.onTransact;
        int i5 = i2 + 65;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
        return i4;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LoanRefinancingGuideFragment loanRefinancingGuideFragment = (LoanRefinancingGuideFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        LoanRefinancingIntroViewModel loanRefinancingIntroViewModel = (LoanRefinancingIntroViewModel) loanRefinancingGuideFragment.access100.getValue();
        if (i3 == 0) {
            return loanRefinancingIntroViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(LoanRefinancingGuideFragment loanRefinancingGuideFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        loanRefinancingGuideFragment.IAuthTabCallback(iEngagementSignalsCallbackDefault);
        int i4 = getInterfaceDescriptor + 33;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(LoanRefinancingGuideFragment loanRefinancingGuideFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            int i3 = 13 / 0;
            if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
                loanRefinancingGuideFragment.newAuthTabSession();
                int i4 = getInterfaceDescriptor + 67;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            }
        }
        int i6 = IAuthTabCallbackStubProxy + 21;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        ((LoanRefinancingIntroViewModel) onExtraCallbackWithResult(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{this}, iOnWarmupCompleted2, 1586326389, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1586326387)).onNavigationEvent(access100());
        int iOnWarmupCompleted3 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted4 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onExtraCallbackWithResult(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this}, iOnWarmupCompleted4, 28521145, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -28521142);
        onTransact();
        int i4 = getInterfaceDescriptor + 55;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        LoanRefinancingGuideFragment loanRefinancingGuideFragment = (LoanRefinancingGuideFragment) objArr[0];
        int i = 2 % 2;
        View view = loanRefinancingGuideFragment.asInterface().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(8);
        ComposeView composeView = loanRefinancingGuideFragment.asInterface().onExtraCallback;
        composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
        composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-715728103, true, new LoanRefinancingGuideFragment$.ExternalSyntheticLambda5(loanRefinancingGuideFragment))));
        int i2 = getInterfaceDescriptor + 11;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(LoanRefinancingGuideFragment loanRefinancingGuideFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 49;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 5) != 4, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = getInterfaceDescriptor + 41;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-715728103, i, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingGuideFragment.initView.<anonymous>.<anonymous> (LoanRefinancingGuideFragment.kt:103)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-715728103, i, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingGuideFragment.initView.<anonymous>.<anonymous> (LoanRefinancingGuideFragment.kt:103)");
            }
            onExtraCallbackWithResult(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{loanRefinancingGuideFragment, cameraCaptureResultEmptyCameraCaptureResult, 0}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 232344324, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -232344324);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackStubProxy + 121;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = getInterfaceDescriptor + 97;
                IAuthTabCallbackStubProxy = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 4 / 5;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallback extends Lambda implements Function0<Fragment> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Fragment fragmentOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onNavigationEvent + 33;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 60 / 0;
            }
            return fragmentOnExtraCallbackWithResult;
        }

        public final Fragment onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Fragment fragment = this.$this_viewModels;
            int i5 = i3 + 13;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return fragment;
        }
    }

    public static final class onTransact extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0 = (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
            int i4 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda0;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                IAuthTabCallback();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0IAuthTabCallback = IAuthTabCallback();
            int i3 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda0IAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }
    }

    private final void onTransact() {
        int i = 2 % 2;
        access100().onPostMessage().observe(getViewLifecycleOwner(), new onExtraCallbackWithResult(new LoanRefinancingGuideFragment$.ExternalSyntheticLambda8(this)));
        int i2 = getInterfaceDescriptor + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class IAuthTabCallbackStub extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(Fragment fragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = onNavigationEvent();
            int i3 = onWarmupCompleted + 111;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return onwarmupcompletedOnNavigationEvent;
        }

        public final ViewModelProvider.onWarmupCompleted onNavigationEvent() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory;
            int i = 2 % 2;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            if (!(!(textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6))) {
                int i2 = IAuthTabCallback + 83;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
                    int i3 = 76 / 0;
                } else {
                    textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
                }
            } else {
                textFieldKeyInputExternalSyntheticLambda6 = null;
            }
            if (textFieldKeyInputExternalSyntheticLambda6 == null || (defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory()) == null) {
                ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
                return defaultViewModelProviderFactory2;
            }
            int i4 = onWarmupCompleted + 39;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 15 / 0;
            }
            return defaultViewModelProviderFactory;
        }
    }

    public static final class asBinder extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = onExtraCallback + 97;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
            int i3 = onNavigationEvent + 27;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return viewModelStore;
            }
            throw null;
        }
    }

    public static final class asInterface extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asInterface(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted();
            }
            onWarmupCompleted();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onWarmupCompleted() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            int i = 2 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null) {
                int i2 = IAuthTabCallback + 25;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                }
            }
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            Object obj = null;
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
                int i4 = onExtraCallbackWithResult + 23;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                textFieldKeyInputExternalSyntheticLambda6 = null;
            }
            if (textFieldKeyInputExternalSyntheticLambda6 == null) {
                return AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
            }
            int i6 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras();
            }
            textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras();
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LoanRefinancingGuideFragment loanRefinancingGuideFragment = (LoanRefinancingGuideFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            loanRefinancingGuideFragment.dismissProgressDialog();
            Unit unit = Unit.INSTANCE;
            int i3 = getInterfaceDescriptor + 65;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        loanRefinancingGuideFragment.dismissProgressDialog();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(IAuthTabCallback_Parcel)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - Color.red(0)), 23 - Gravity.getAbsoluteGravity(0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 12843), AndroidCharacter.getMirror('0') + 7, 2167 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i7 = $10 + 47;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12842), View.resolveSize(0, 0) + 55, 2167 - Drawable.resolveOpacity(0, 0), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i9 = $10 + 97;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    i4 = 2083011369;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static final Unit IAuthTabCallback(LoanRefinancingGuideFragment loanRefinancingGuideFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(8 - (ViewConfiguration.getScrollBarSize() >> 8), 8 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{65530, 65531, 65530, 7, 7, 65530, 7, 7}, false, 304 - TextUtils.getOffsetBefore("", 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = {loanRefinancingGuideFragment.access100()};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        setDetectableSize.onExtraCallback(strIntern, (String) LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 974733256, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -974733251, iOnNavigationEvent2, objArr2));
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingGuideFragment.writeTypedObject());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 95;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        LoanRefinancingGuideFragment loanRefinancingGuideFragment = (LoanRefinancingGuideFragment) objArr[0];
        getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1262103L, false, (String) null, (Map) null, new LoanRefinancingGuideFragment$.ExternalSyntheticLambda3(loanRefinancingGuideFragment), 14, (Object) null);
        loanRefinancingGuideFragment.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 67;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(LoanRefinancingGuideFragment loanRefinancingGuideFragment, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            int i5 = IAuthTabCallbackStubProxy + 33;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i7 = getInterfaceDescriptor + 113;
                IAuthTabCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i9 = IAuthTabCallbackStubProxy + 99;
            getInterfaceDescriptor = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1999492584, i2, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingGuideFragment.GuideContent.<anonymous>.<anonymous> (LoanRefinancingGuideFragment.kt:206)");
            }
            String string = loanRefinancingGuideFragment.getString(viva.republica.toss.R.string.next);
            Intrinsics.checkNotNullExpressionValue(string, "");
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Primary;
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Fill;
            boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(loanRefinancingGuideFragment);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                int i11 = getInterfaceDescriptor + 17;
                IAuthTabCallbackStubProxy = i11 % 128;
                int i12 = i11 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new LoanRefinancingGuideFragment$.ExternalSyntheticLambda4(loanRefinancingGuideFragment, getsupportedhighspeedresolutionsfor);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    int i13 = IAuthTabCallbackStubProxy + 63;
                    getInterfaceDescriptor = i13 % 128;
                    int i14 = i13 % 2;
                }
                u4Var.onNavigationEvent(string, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) objOnMinimized, onextracallback, onwarmupcompleted, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, zBooleanValue, cameraCaptureResultEmptyCameraCaptureResult, 221184, i2 & 14, 454);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i;
        boolean z;
        int i2;
        LoanRefinancingGuideFragment loanRefinancingGuideFragment = (LoanRefinancingGuideFragment) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 39;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1969635653);
        if ((iIntValue & 6) == 0) {
            int i6 = getInterfaceDescriptor + 53;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(loanRefinancingGuideFragment)) {
                i2 = 2;
            } else {
                int i8 = IAuthTabCallbackStubProxy + 1;
                getInterfaceDescriptor = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 3 % 5;
                }
                i2 = 4;
            }
            i = i2 | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((i & 3) != 2) {
            int i10 = IAuthTabCallbackStubProxy + 61;
            getInterfaceDescriptor = i10 % 128;
            z = i10 % 2 == 0;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1969635653, i, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingGuideFragment.GuideContent (LoanRefinancingGuideFragment.kt:115)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
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
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(setContentInsetsAbsolute.IAuthTabCallback(onextracallback, setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null), 0.0f, 1, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent2);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i11 = IAuthTabCallbackStubProxy + 67;
                getInterfaceDescriptor = i11 % 128;
                int i12 = i11 % 2;
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
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            sendInstantData sendinstantdata = sendInstantData.onExtraCallbackWithResult;
            removeAnimatorPauseListener.onWarmupCompleted((getBacktraceNote) sendInstantData.IAuthTabCallback(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{sendinstantdata}, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 237721704, -237721700, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent()), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 6);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            reverseAnimationSpeed.IAuthTabCallback(new setAnimation.IAuthTabCallback.onExtraCallbackWithResult(1, (QuirksExternalSyntheticBackport0) null, 2, (DefaultConstructorMarker) null), sendinstantdata.onNavigationEvent(), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f), 0.0f, 11, (Object) null), (getBacktraceNote) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) null, true, (getSwitchMinWidth) null, (getSwitchMinWidth) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1573296, 440);
            reverseAnimationSpeed.IAuthTabCallback(new setAnimation.IAuthTabCallback.onExtraCallbackWithResult(2, (QuirksExternalSyntheticBackport0) null, 2, (DefaultConstructorMarker) null), sendinstantdata.onWarmupCompleted(), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f), 0.0f, 11, (Object) null), (getBacktraceNote) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) null, true, (getSwitchMinWidth) null, (getSwitchMinWidth) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1573296, 440);
            reverseAnimationSpeed.IAuthTabCallback(new setAnimation.IAuthTabCallback.onExtraCallbackWithResult(3, (QuirksExternalSyntheticBackport0) null, 2, (DefaultConstructorMarker) null), sendinstantdata.onExtraCallbackWithResult(), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f), 0.0f, 11, (Object) null), (getBacktraceNote) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) null, false, (getSwitchMinWidth) null, (getSwitchMinWidth) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1573296, 440);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            getTakePictureRequest.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(onextracallback, onextracallbackwithresult.onTransact()), 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 10, (Object) null), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onActivityLayout(), 0L, (getCurrentMenuItems) null, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), sendinstantdata.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1769472, 24);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(108.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            u1.IAuthTabCallback(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onWarmupCompleted()), (u2) null, ForwardingCameraControl.onExtraCallback(-1999492584, true, new LoanRefinancingGuideFragment$.ExternalSyntheticLambda1(loanRefinancingGuideFragment, getsupportedhighspeedresolutionsfor), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 0, 4090);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = IAuthTabCallbackStubProxy + 83;
                getInterfaceDescriptor = i13 % 128;
                if (i13 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i14 = 6 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            return null;
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LoanRefinancingGuideFragment$.ExternalSyntheticLambda2(loanRefinancingGuideFragment, iIntValue));
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Object[] objArr = {access100()};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int i2 = onNavigationEvent.onExtraCallback[((RefinancingLoanType) LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -173209907, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 173209922, iOnNavigationEvent2, objArr)).ordinal()];
        if (i2 == 1) {
            IAuthTabCallback(getsupportedhighspeedresolutionsfor);
            int i3 = IAuthTabCallbackStubProxy + 75;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 40 / 0;
                return;
            }
            return;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i5 = IAuthTabCallbackStubProxy + 39;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(getsupportedhighspeedresolutionsfor);
        int i7 = getInterfaceDescriptor + 19;
        IAuthTabCallbackStubProxy = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, LoanRefinancingGuideFragment loanRefinancingGuideFragment, RefinancingAccountState refinancingAccountState) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 115;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.FALSE);
            loanRefinancingGuideFragment.dismissLoadingIndicator();
            loanRefinancingGuideFragment.IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
            Unit unit = Unit.INSTANCE;
            int i3 = getInterfaceDescriptor + 41;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.FALSE);
        loanRefinancingGuideFragment.dismissLoadingIndicator();
        loanRefinancingGuideFragment.IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        Unit unit2 = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        RefinancingAccountState refinancingAccountStateWriteTypedObject = access100().writeTypedObject();
        if (refinancingAccountStateWriteTypedObject == null) {
            BaseFragment.showProgressDialog$default(this, (String) null, false, 3, (Object) null);
            access100().access200();
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.TRUE);
            access100().ICustomTabsCallbackStub().observe(getViewLifecycleOwner(), new onExtraCallbackWithResult(new LoanRefinancingGuideFragment$.ExternalSyntheticLambda9(getsupportedhighspeedresolutionsfor, this)));
            int i4 = getInterfaceDescriptor + 65;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        dismissProgressDialog();
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.FALSE);
        if (!refinancingAccountStateWriteTypedObject.onExtraCallbackWithResult().isEmpty()) {
            RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.loanRefinancingInfraCheckFragment);
            return;
        }
        if (!refinancingAccountStateWriteTypedObject.onNavigationEvent().isEmpty()) {
            int i6 = IAuthTabCallbackStubProxy + 23;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.loanRefinancingKcbAccountFragment);
            return;
        }
        RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.loanRefinancingAccountCheckFragment);
    }

    private final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        access100().IAuthTabCallback_Parcel().asBinder(onPreviewReleased.SELF_BUSINESS.getCode());
        access100().onWarmupCompleted(new LoanRefinancingGuideFragment$.ExternalSyntheticLambda0(this, getsupportedhighspeedresolutionsfor));
        int i2 = IAuthTabCallbackStubProxy + 121;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void newSessionWithExtras() throws Throwable {
        String strIntern;
        int i = 2 % 2;
        if (onExtraCallback().RemoteActionCompatParcelizer()) {
            int i2 = IAuthTabCallbackStubProxy + 65;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 75 / 0;
                if (StringsKt.isBlank(DERSet.onExtraCallback.MediaBrowserCompatMediaItem())) {
                    Object[] objArr = new Object[1];
                    a(50 - (ViewConfiguration.getPressedStateDuration() >> 16), 7 - View.getDefaultSize(0, 0), new char[]{3, 6, 11, 65534, 11, 0, 2, 16, 2, 15, 19, 6, 0, 2, 17, '\f', 16, 16, 65495, 65484, 65484, '\t', '\f', 65534, 11, 65482, 0, '\f', '\n', '\n', '\f', 11, 65484, 65535, 18, 16, 6, 11, 2, 16, 16, 65482, '\f', 20, 11, 2, 15, 65482, 15, 2}, false, 297 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
                    strIntern = ((String) objArr[0]).intern();
                } else {
                    int i4 = getInterfaceDescriptor + 125;
                    IAuthTabCallbackStubProxy = i4 % 128;
                    int i5 = i4 % 2;
                    strIntern = ProducerSequenceFactoryExternalSyntheticLambda0.INSTANCE.onExtraCallback(true);
                }
            } else if (!StringsKt.isBlank(DERSet.onExtraCallback.MediaBrowserCompatMediaItem())) {
            }
        }
        Object[] objArr2 = new Object[1];
        a(View.MeasureSpec.getMode(0) + 8, TextUtils.lastIndexOf("", '0', 0) + 8, new char[]{65530, 65531, 65530, 7, 7, 65530, 7, 7}, false, 304 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = {access100()};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        String strIAuthTabCallback = convertAnyToMap.IAuthTabCallback(convertAnyToMap.IAuthTabCallback(strIntern, strIntern2, (String) LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 974733256, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -974733251, iOnNavigationEvent2, objArr3)), "service_referrer", access100().setEngagementSignalsCallback());
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = this.asBinder;
        LoanRefinancingScrapingHandleActivity.onNavigationEvent onnavigationevent = LoanRefinancingScrapingHandleActivity.Companion;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        iEngagementSignalsCallback_Parcel.onNavigationEvent(onnavigationevent.IAuthTabCallback(contextRequireContext, strIAuthTabCallback, true));
        int i6 = getInterfaceDescriptor + 15;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        String stringExtra;
        int i = 2 % 2;
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i2 = IAuthTabCallbackStubProxy + 123;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
                throw null;
            }
            Intent intentOnExtraCallbackWithResult = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
            if (intentOnExtraCallbackWithResult != null) {
                int i3 = getInterfaceDescriptor + 9;
                IAuthTabCallbackStubProxy = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    a(97 / (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 66 / View.getDefaultSize(1, 1), new char[]{11, 4, '\t', 2, 65503, 65532, 15, 65532, 65533, 4, 21, 65518, 65534, '\r', 65532}, true, 24428 >> (ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1)), objArr);
                    stringExtra = intentOnExtraCallbackWithResult.getStringExtra(((String) objArr[0]).intern());
                } else {
                    Object[] objArr2 = new Object[1];
                    a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14, 8 - View.getDefaultSize(0, 0), new char[]{11, 4, '\t', 2, 65503, 65532, 15, 65532, 65533, 4, 21, 65518, 65534, '\r', 65532}, false, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 297, objArr2);
                    stringExtra = intentOnExtraCallbackWithResult.getStringExtra(((String) objArr2[0]).intern());
                }
            } else {
                stringExtra = null;
            }
            Intent intentOnExtraCallbackWithResult2 = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
            stringExtra = intentOnExtraCallbackWithResult2 != null ? intentOnExtraCallbackWithResult2.getStringExtra("EXTRA_VERIFIED_TS") : null;
            access100().IAuthTabCallback(IAuthTabCallback(stringExtra));
            access100().onExtraCallbackWithResult("BUSINESS_NTS_SCRAPE");
            extraCallback().access000(stringExtra);
            RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.bizRefinancingAccountLoadingFragment);
            return;
        }
        Intent intentOnExtraCallbackWithResult3 = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
        String stringExtra2 = intentOnExtraCallbackWithResult3 != null ? intentOnExtraCallbackWithResult3.getStringExtra("EXTRA_VERIFIED_TS") : null;
        if (stringExtra2 != null) {
            int i4 = IAuthTabCallbackStubProxy + 3;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 87 / 0;
                if (!StringsKt.isBlank(stringExtra2)) {
                    extraCallback().access000(stringExtra2);
                    int i6 = getInterfaceDescriptor + 65;
                    IAuthTabCallbackStubProxy = i6 % 128;
                    int i7 = i6 % 2;
                }
            } else if (!StringsKt.isBlank(stringExtra2)) {
            }
        }
        Intent intentOnExtraCallbackWithResult4 = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
        String stringExtra3 = intentOnExtraCallbackWithResult4 != null ? intentOnExtraCallbackWithResult4.getStringExtra("code") : null;
        if (stringExtra3 == null) {
            newAuthTabSession();
            return;
        }
        if (Intrinsics.areEqual(stringExtra3, "TOSS_CERT_REQUIRE")) {
            newAuthTabSession();
            return;
        }
        Intent intentOnExtraCallbackWithResult5 = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
        if (intentOnExtraCallbackWithResult5 != null) {
            Object[] objArr3 = new Object[1];
            a(8 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 6 - View.MeasureSpec.getSize(0), new char[]{65532, '\n', '\n', 65528, 65534, 65532, 4}, false, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 302, objArr3);
            stringExtra = intentOnExtraCallbackWithResult5.getStringExtra(((String) objArr3[0]).intern());
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = this.IAuthTabCallback;
        LoanRefinancingScrapingFailureActivity.onWarmupCompleted onwarmupcompleted = LoanRefinancingScrapingFailureActivity.Companion;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        iEngagementSignalsCallback_Parcel.onNavigationEvent(onwarmupcompleted.onExtraCallback(contextRequireContext, stringExtra3, stringExtra, LoanFunnelType.BUSINESS_NTS_SCRAPE));
    }

    private final void newAuthTabSession() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        access100().onExtraCallbackWithResult("MANUAL");
        access100().IAuthTabCallback_Parcel().asBinder(onPreviewReleased.SELF_BUSINESS.getCode());
        RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.loanRefinancingJobDetailFragment);
        int i4 = getInterfaceDescriptor + 119;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private final JsonObject IAuthTabCallback(String str) {
        Object obj;
        int i = 2 % 2;
        Object obj2 = null;
        if (str == null) {
            return null;
        }
        if (str.length() != 0) {
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(initRenderFinish.onExtraCallbackWithResult(wie2.Default.onExtraCallback(str)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "BizRefinancing", "Failed to parse scraping data", th2, (Map) null, 8, (Object) null);
            }
            if (Result.onExtraCallback(obj)) {
                int i2 = getInterfaceDescriptor;
                int i3 = i2 + 27;
                IAuthTabCallbackStubProxy = i3 % 128;
                if (i3 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                int i4 = i2 + 91;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
            } else {
                obj2 = obj;
            }
            return (JsonObject) obj2;
        }
        int i6 = IAuthTabCallbackStubProxy + 103;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        int i7 = 9 / 0;
        return null;
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        Function0<Unit> function0 = this.IAuthTabCallbackDefault;
        if (function0 != null) {
            int i4 = getInterfaceDescriptor + 83;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            function0.invoke();
        }
        Object obj = null;
        this.IAuthTabCallbackDefault = null;
        dismissLoadingIndicator();
        int i6 = IAuthTabCallbackStubProxy + 25;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        Object[] objArr = {this, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        onExtraCallbackWithResult(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), objArr, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 232344324, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -232344324);
    }

    private static final Unit onNavigationEvent(LoanRefinancingGuideFragment loanRefinancingGuideFragment, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{loanRefinancingGuideFragment, getsupportedhighspeedresolutionsfor}, iOnWarmupCompleted2, -501851212, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 501851217);
    }

    private static final Unit onExtraCallback(LoanRefinancingGuideFragment loanRefinancingGuideFragment, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{loanRefinancingGuideFragment, getsupportedhighspeedresolutionsfor}, iOnWarmupCompleted2, 1001532625, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1001532624);
    }

    private final LoanRefinancingIntroViewModel asBinder() {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (LoanRefinancingIntroViewModel) onExtraCallbackWithResult(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{this}, iOnWarmupCompleted2, 1586326389, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1586326387);
    }

    private static final Unit onExtraCallbackWithResult(LoanRefinancingGuideFragment loanRefinancingGuideFragment, Throwable th) {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{loanRefinancingGuideFragment, th}, iOnWarmupCompleted2, -944317141, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 944317145);
    }

    private final void isEngagementSignalsApiAvailable() throws Throwable {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onExtraCallbackWithResult(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{this}, iOnWarmupCompleted2, 28521145, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -28521142);
    }

    static void IAuthTabCallbackStub() {
        IAuthTabCallback_Parcel = 478309100;
    }
}
