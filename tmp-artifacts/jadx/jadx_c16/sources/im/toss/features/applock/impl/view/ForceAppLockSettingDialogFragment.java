package im.toss.features.applock.impl.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Process;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import im.toss.base.BaseActivity;
import im.toss.features.applock.impl.view.ForceAppLockSettingDialogFragment$;
import im.toss.features.applock.impl.view.ForceAppLockSettingDialogFragment$onCreateDialog$1$;
import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.uikit.R;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AccShakeHelper;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.Constant;
import o.ForwardingCameraControl;
import o.RemotePoint;
import o.Response;
import o.ZslRingBuffer;
import o.deserializeUriNullableCollection;
import o.getHeightPixels;
import o.getTitleAndStatusBarHeight;
import o.isWifiEnabled;
import o.r8lambdasgMRYOBz37oj54_cn3LKFIt3wIk;
import o.setAdVideoPlaybackListener;
import o.y1hExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ForceAppLockSettingDialogFragment extends r8lambdasgMRYOBz37oj54_cn3LKFIt3wIk {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private final Lazy onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new ForceAppLockSettingDialogFragment$.ExternalSyntheticLambda1(this));
    private final Lazy onNavigationEvent = LazyKt.onExtraCallbackWithResult(new ForceAppLockSettingDialogFragment$.ExternalSyntheticLambda2(this));
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new ForceAppLockSettingDialogFragment$.ExternalSyntheticLambda3(this));
    private final Lazy onExtraCallback = LazyKt.onExtraCallbackWithResult(new ForceAppLockSettingDialogFragment$.ExternalSyntheticLambda4(this));
    private final Lazy onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new ForceAppLockSettingDialogFragment$.ExternalSyntheticLambda5(this));

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = (~((~i2) | i3)) | (~(i2 | i5));
        int i8 = ~i3;
        int i9 = (~(i8 | i5)) | i2;
        int i10 = (~(i5 | i3)) | (~(i8 | (~i5))) | i2;
        int i11 = i3 + i2 + i4 + ((-737137436) * i6) + ((-1840598144) * i);
        int i12 = i11 * i11;
        int i13 = (((-699670985) * i3) - 818937856) + (24099949 * i2) + (723770934 * i7) + ((-1447541868) * i9) + ((-723770934) * i10) + ((-1423441920) * i4) + (1335885824 * i6) + ((-1946157056) * i) + ((-1593638912) * i12);
        int i14 = (i3 * 1252406331) + 1981669868 + (i2 * 1252405337) + (i7 * (-994)) + (i9 * 1988) + (i10 * 994) + (i4 * 1252407325) + (i6 * (-1820396076)) + (i * 1320834432) + (i12 * (-447283200));
        int i15 = i13 + (i14 * i14 * 1511325696);
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? i15 != 4 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ AccShakeHelper asInterface(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return access000(forceAppLockSettingDialogFragment);
        }
        access000(forceAppLockSettingDialogFragment);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 63;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return (Unit) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1156442020, new Object[]{forceAppLockSettingDialogFragment, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -1156442019, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getTitleAndStatusBarHeight onExtraCallback(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment) {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStub(forceAppLockSettingDialogFragment);
        }
        IAuthTabCallbackStub(forceAppLockSettingDialogFragment);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment = (ForceAppLockSettingDialogFragment) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(forceAppLockSettingDialogFragment, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = asBinder + 15;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment) {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStubProxy(forceAppLockSettingDialogFragment);
            throw null;
        }
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(forceAppLockSettingDialogFragment);
        int i3 = IAuthTabCallbackDefault + 49;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallbackStubProxy;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment = (ForceAppLockSettingDialogFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        RemotePoint remotePointAccess100 = access100(forceAppLockSettingDialogFragment);
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return remotePointAccess100;
    }

    public static /* synthetic */ isWifiEnabled onNavigationEvent(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        isWifiEnabled interfaceDescriptor = getInterfaceDescriptor(forceAppLockSettingDialogFragment);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit onTransact(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback_Parcel(forceAppLockSettingDialogFragment);
        }
        IAuthTabCallback_Parcel(forceAppLockSettingDialogFragment);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Constant onWarmupCompleted(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder(forceAppLockSettingDialogFragment);
        }
        asBinder(forceAppLockSettingDialogFragment);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment = (ForceAppLockSettingDialogFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        Constant constant = (Constant) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -278363235, new Object[]{forceAppLockSettingDialogFragment}, 278363239, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3);
        int i4 = asBinder + 107;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return constant;
    }

    private final getTitleAndStatusBarHeight onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        getTitleAndStatusBarHeight gettitleandstatusbarheight = (getTitleAndStatusBarHeight) this.onExtraCallbackWithResult.getValue();
        int i3 = IAuthTabCallbackDefault + 73;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return gettitleandstatusbarheight;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment = (ForceAppLockSettingDialogFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object value = forceAppLockSettingDialogFragment.onNavigationEvent.getValue();
        if (i3 != 0) {
            return (Constant) value;
        }
        throw null;
    }

    private static final Constant asBinder(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment) {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Constant constantNewSession = forceAppLockSettingDialogFragment.onWarmupCompleted().newSession();
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 59;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return constantNewSession;
        }
        throw null;
    }

    private final AccShakeHelper asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        AccShakeHelper accShakeHelper = (AccShakeHelper) this.onTransact.getValue();
        int i4 = IAuthTabCallbackDefault + 31;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return accShakeHelper;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final AccShakeHelper access000(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        AccShakeHelper accShakeHelperPostMessage = forceAppLockSettingDialogFragment.onWarmupCompleted().postMessage();
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 97;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
        return accShakeHelperPostMessage;
    }

    private final isWifiEnabled onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        isWifiEnabled iswifienabled = (isWifiEnabled) this.onExtraCallback.getValue();
        int i4 = IAuthTabCallbackDefault + 105;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return iswifienabled;
    }

    private static final isWifiEnabled getInterfaceDescriptor(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment) {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getTitleAndStatusBarHeight gettitleandstatusbarheightOnWarmupCompleted = forceAppLockSettingDialogFragment.onWarmupCompleted();
        if (i3 == 0) {
            return gettitleandstatusbarheightOnWarmupCompleted.prefetch();
        }
        gettitleandstatusbarheightOnWarmupCompleted.prefetch();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final RemotePoint IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        RemotePoint remotePoint = (RemotePoint) this.onWarmupCompleted.getValue();
        if (i3 != 0) {
            return remotePoint;
        }
        throw null;
    }

    private static final RemotePoint access100(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        RemotePoint remotePointNewSessionWithExtras = forceAppLockSettingDialogFragment.onWarmupCompleted().newSessionWithExtras();
        int i4 = IAuthTabCallbackDefault + 35;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return remotePointNewSessionWithExtras;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            super/*androidx.fragment.app.DialogFragment*/.onCreate(bundle);
            IAuthTabCallback().onNavigationEvent(false);
        } else {
            super/*androidx.fragment.app.DialogFragment*/.onCreate(bundle);
            IAuthTabCallback().onNavigationEvent(true);
        }
        setStyle(1, R.style.WhiteTheme);
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ComposeView composeView = new ComposeView(contextRequireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
        composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-592069601, true, new ForceAppLockSettingDialogFragment$.ExternalSyntheticLambda0(this))));
        int i2 = asBinder + 25;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return composeView;
        }
        throw null;
    }

    private static final Unit IAuthTabCallbackStubProxy(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        forceAppLockSettingDialogFragment.onNavigationEvent();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 39;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 5;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1005089929, i, -1, "im.toss.features.applock.impl.view.ForceAppLockSettingDialogFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (ForceAppLockSettingDialogFragment.kt:61)");
            }
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            Constant constant = (Constant) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -278363235, new Object[]{forceAppLockSettingDialogFragment}, 278363239, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(forceAppLockSettingDialogFragment);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                int i5 = asBinder + 107;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new ForceAppLockSettingDialogFragment$.ExternalSyntheticLambda8(forceAppLockSettingDialogFragment);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                getHeightPixels.onWarmupCompleted(constant, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment = (ForceAppLockSettingDialogFragment) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 3) != 2, iIntValue & 1)) {
            int i2 = IAuthTabCallbackDefault + 67;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-592069601, iIntValue, -1, "im.toss.features.applock.impl.view.ForceAppLockSettingDialogFragment.onCreateView.<anonymous>.<anonymous> (ForceAppLockSettingDialogFragment.kt:60)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-1005089929, true, new ForceAppLockSettingDialogFragment$.ExternalSyntheticLambda7(forceAppLockSettingDialogFragment), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i4 = IAuthTabCallbackDefault + 63;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i5 = 35 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final class onNavigationEvent extends Dialog {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public static /* synthetic */ Unit onExtraCallback(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(forceAppLockSettingDialogFragment);
            }
            onExtraCallbackWithResult(forceAppLockSettingDialogFragment);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit onWarmupCompleted(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(forceAppLockSettingDialogFragment);
            int i4 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unitIAuthTabCallback;
        }

        onNavigationEvent(Context context, int i) {
            super(context, i);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (ForceAppLockSettingDialogFragment.this.isAdded()) {
                Context contextRequireContext = ForceAppLockSettingDialogFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                Object[] objArr = {ForceAppLockSettingDialogFragment.this};
                int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                Object[] objArr2 = {contextRequireContext, (Constant) ForceAppLockSettingDialogFragment.IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 915856815, objArr, -915856813, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent()), new ForceAppLockSettingDialogFragment$onCreateDialog$1$.ExternalSyntheticLambda0(ForceAppLockSettingDialogFragment.this), new ForceAppLockSettingDialogFragment$onCreateDialog$1$.ExternalSyntheticLambda1(ForceAppLockSettingDialogFragment.this)};
                int iOnExtraCallback = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
                int iOnExtraCallback2 = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
                getHeightPixels.onExtraCallbackWithResult(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, -1011791853, 1011791853, objArr2);
                int i4 = onExtraCallbackWithResult + 95;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        private static final Unit IAuthTabCallback(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment) {
            int iMyPid;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                forceAppLockSettingDialogFragment.requireActivity().setResult(1);
                forceAppLockSettingDialogFragment.requireActivity().finishAffinity();
                iMyPid = Process.myPid();
            } else {
                forceAppLockSettingDialogFragment.requireActivity().setResult(0);
                forceAppLockSettingDialogFragment.requireActivity().finishAffinity();
                iMyPid = Process.myPid();
            }
            Process.killProcess(iMyPid);
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 74 / 0;
            }
            return unit;
        }

        private static final Unit onExtraCallbackWithResult(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                forceAppLockSettingDialogFragment.onNavigationEvent();
                Unit unit = Unit.INSTANCE;
                int i3 = onExtraCallbackWithResult + 13;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return unit;
                }
                throw null;
            }
            forceAppLockSettingDialogFragment.onNavigationEvent();
            Unit unit2 = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
    }

    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        int i = 2 % 2;
        onNavigationEvent onnavigationevent = new onNavigationEvent(requireContext(), getTheme());
        int i2 = IAuthTabCallbackDefault + 85;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return onnavigationevent;
    }

    private static final Unit IAuthTabCallback_Parcel(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        forceAppLockSettingDialogFragment.dismissAllowingStateLoss();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 35;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        if (isAdded()) {
            int i2 = asBinder + 117;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            BaseActivity baseActivityRequireActivity = requireActivity();
            BaseActivity baseActivity = null;
            if (baseActivityRequireActivity instanceof BaseActivity) {
                int i4 = IAuthTabCallbackDefault + 33;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                baseActivity = baseActivityRequireActivity;
            }
            if (baseActivity != null) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = getHeightPixels.onWarmupCompleted(baseActivity, contextRequireContext, onExtraCallbackWithResult(), new ForceAppLockSettingDialogFragment$.ExternalSyntheticLambda6(this));
                if (deserializeurinullablecollectionOnWarmupCompleted != null) {
                    onExtraCallbackWithResult(deserializeurinullablecollectionOnWarmupCompleted);
                }
            }
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            return ((Constant) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -278363235, new Object[]{this}, 278363239, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3)).onExtraCallbackWithResult();
        }
        int iOnNavigationEvent4 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent5 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent6 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int i3 = 15 / 0;
        return ((Constant) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -278363235, new Object[]{this}, 278363239, iOnNavigationEvent5, iOnNavigationEvent4, iOnNavigationEvent6)).onExtraCallbackWithResult();
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            ((Constant) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -278363235, new Object[]{this}, 278363239, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3)).onExtraCallback();
            obj.hashCode();
            throw null;
        }
        int iOnNavigationEvent4 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent5 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent6 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        Map<String, Object> mapOnExtraCallback = ((Constant) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -278363235, new Object[]{this}, 278363239, iOnNavigationEvent5, iOnNavigationEvent4, iOnNavigationEvent6)).onExtraCallback();
        int i3 = asBinder + 77;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return mapOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onStart();
            if (!(!asBinder().onExtraCallback())) {
                return;
            }
            int i3 = IAuthTabCallbackDefault + 85;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            dismiss();
            if (i4 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        super.onStart();
        asBinder().onExtraCallback();
        throw null;
    }

    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        RemotePoint remotePointIAuthTabCallback;
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            remotePointIAuthTabCallback = IAuthTabCallback();
            z = true;
        } else {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            remotePointIAuthTabCallback = IAuthTabCallback();
            z = false;
        }
        remotePointIAuthTabCallback.onNavigationEvent(z);
        super/*androidx.fragment.app.DialogFragment*/.onDismiss(dialogInterface);
        int i3 = asBinder + 61;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static final getTitleAndStatusBarHeight IAuthTabCallbackStub(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment) {
        getTitleAndStatusBarHeight gettitleandstatusbarheight;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Response response = Response.onNavigationEvent;
            Context contextRequireContext = forceAppLockSettingDialogFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            gettitleandstatusbarheight = (getTitleAndStatusBarHeight) Response.onExtraCallback(contextRequireContext, getTitleAndStatusBarHeight.class);
            int i3 = 63 / 0;
        } else {
            Response response2 = Response.onNavigationEvent;
            Context contextRequireContext2 = forceAppLockSettingDialogFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            gettitleandstatusbarheight = (getTitleAndStatusBarHeight) Response.onExtraCallback(contextRequireContext2, getTitleAndStatusBarHeight.class);
        }
        int i4 = IAuthTabCallbackDefault + 77;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return gettitleandstatusbarheight;
        }
        throw null;
    }

    public static /* synthetic */ RemotePoint IAuthTabCallback(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (RemotePoint) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1048890776, new Object[]{forceAppLockSettingDialogFragment}, -1048890773, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3);
    }

    public static /* synthetic */ Unit IAuthTabCallback(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {forceAppLockSettingDialogFragment, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (Unit) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -692484611, objArr, 692484611, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }

    public static final /* synthetic */ Constant IAuthTabCallbackDefault(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (Constant) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 915856815, new Object[]{forceAppLockSettingDialogFragment}, -915856813, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3);
    }

    private final Constant onExtraCallback() {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (Constant) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -278363235, new Object[]{this}, 278363239, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3);
    }

    private static final Unit onExtraCallbackWithResult(ForceAppLockSettingDialogFragment forceAppLockSettingDialogFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {forceAppLockSettingDialogFragment, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (Unit) IAuthTabCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1156442020, objArr, -1156442019, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }
}
