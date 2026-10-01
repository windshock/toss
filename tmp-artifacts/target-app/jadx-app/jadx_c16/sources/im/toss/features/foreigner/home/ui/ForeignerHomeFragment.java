package im.toss.features.foreigner.home.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.features.edoc.register.AptPasswordActivity$;
import im.toss.features.foreigner.home.ui.ForeignerHomeFragment$;
import im.toss.features.foreigner.home.ui.moneysprinkle.ForeignerHomeContactPermissionActivity;
import im.toss.inventory_sdk.InventoryAdManager;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppLovinAdImpl;
import o.AppLovinBroadcastManager;
import o.AppLovinSdkInitializationConfigurationImpl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BindingNode;
import o.BridgeResponse1;
import o.BridgeResponseError;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DERString;
import o.EngineInitCallback;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.ForwardingCameraControl;
import o.GeckoHubImp;
import o.H5TinyPopMenuTitleBarTheme;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageService_Parcel;
import o.PlayerErrorCode;
import o.SessionTrackera;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.ZslRingBuffer;
import o.access13800;
import o.access14300;
import o.access8100;
import o.accessgetCameraFactoryp;
import o.addExtra;
import o.bindEngineRouter;
import o.bridgeInterceptPostInvoke;
import o.bridgeInterceptPreInvoke;
import o.callBridgeApi;
import o.dispatchPostbackRequest;
import o.findResAndMsg;
import o.formatMsgs;
import o.getCallMode;
import o.getDelegateokhttp;
import o.getDummyAd;
import o.getEnableJsT2;
import o.getFromXRiver;
import o.getNavigationBar;
import o.getOriginalFullResponse;
import o.getSourceProcess;
import o.getWrite;
import o.handshake;
import o.isZslDisabledByByUserCaseConfig;
import o.longDefault;
import o.maybeUpdateAnimatable;
import o.newValue;
import o.pin;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambda9HStmjrtoDHLHwHNekzuov8q0sI;
import o.r8lambdaDml5dirzRCENiZicd2_b5Xg5o;
import o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4;
import o.sendNotDomainWhiteList;
import o.sendNotFound;
import o.setAdVideoPlaybackListener;
import o.setHasShown;
import o.setParams;
import o.setPostviewFormatSelector;
import o.setRandomHost;
import o.y1hExternalSyntheticLambda0;
import o.zzaz;
import o.zzo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.StatusManager;

@DERString
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ForeignerHomeFragment extends Hilt_ForeignerHomeFragment implements StatusManager.onExtraCallback, zzo, sendNotDomainWhiteList {
    public static final IAuthTabCallback Companion;
    public static final int IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    private static byte[] IAuthTabCallbackStub;
    private static char[] IAuthTabCallback_Parcel;
    private static long access000;
    private static int asBinder;
    private static int asInterface;
    private static int extraCallback;
    private static short[] onTransact;

    @Inject
    public AppLovinSdkInitializationConfigurationImpl inbox;

    @Inject
    public InventoryAdManager inventoryAdManager;

    @Inject
    public getEnableJsT2 kycHelper;
    private final SessionTrackera onExtraCallback = AppLovinAdImpl.IAuthTabCallback(this, new ForeignerHomeFragment$.ExternalSyntheticLambda5(this));
    private final Lazy onExtraCallbackWithResult;
    private final IEngagementSignalsCallback_Parcel<Intent> onNavigationEvent;
    private final IEngagementSignalsCallback_Parcel<String> onWarmupCompleted;

    @Inject
    public getDummyAd standardTermsV2Intent;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {10, 80, 9, 70};
    private static final int $$b = 51;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int getInterfaceDescriptor = 0;
    private static int access100 = 1;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            ForeignerHomeFragment foreignerHomeFragment = ForeignerHomeFragment.this;
            if (i3 != 0) {
                return ForeignerHomeFragment.IAuthTabCallback(foreignerHomeFragment, (access13800) this);
            }
            ForeignerHomeFragment.IAuthTabCallback(foreignerHomeFragment, (access13800) this);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, byte b) {
        int i2;
        int i3 = 115 - (i * 18);
        byte[] bArr = $$a;
        int i4 = (s * 4) + 4;
        int i5 = b * 2;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i4;
            int i8 = i6;
            int i9 = 0;
            int i10 = i4 + (-i8);
            int i11 = i7 + 1;
            i2 = i9;
            i3 = i10;
            i4 = i11;
            bArr2[i2] = (byte) i3;
            i9 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i4];
            int i12 = i3;
            i7 = i4;
            i4 = i12;
            int i102 = i4 + (-i8);
            int i112 = i7 + 1;
            i2 = i9;
            i3 = i102;
            i4 = i112;
            bArr2[i2] = (byte) i3;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    static {
        extraCallback = 1;
        onMinimized();
        Companion = new IAuthTabCallback((DefaultConstructorMarker) null);
        IAuthTabCallback = 8;
        int i = IAuthTabCallbackStubProxy + 81;
        extraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(ForeignerHomeFragment foreignerHomeFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 119;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {foreignerHomeFragment, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent4 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        if (i4 == 0) {
            unit = (Unit) onExtraCallback(1772808574, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent, -1772808571, objArr, iOnNavigationEvent4);
            int i5 = 30 / 0;
        } else {
            unit = (Unit) onExtraCallback(1772808574, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent, -1772808571, objArr, iOnNavigationEvent4);
        }
        int i6 = getInterfaceDescriptor + 125;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 27;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(setDetectableSize);
        int i4 = access100 + 71;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return interfaceDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        getSourceProcess getsourceprocess = (getSourceProcess) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 89;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(getsourceprocess, setDetectableSize);
        }
        onWarmupCompleted(getsourceprocess, setDetectableSize);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        String str = (String) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, setDetectableSize);
        int i4 = access100 + 13;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        String str = (String) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(570325170, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, -570325165, new Object[]{str, setDetectableSize}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
        int i4 = getInterfaceDescriptor + 23;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        ForeignerHomeFragment foreignerHomeFragment = (ForeignerHomeFragment) objArr[0];
        ComposeView composeView = (ComposeView) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 87;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(foreignerHomeFragment, composeView, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = getInterfaceDescriptor + 33;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 107;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            return (Unit) onExtraCallback(-1958975279, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1958975285, new Object[]{setDetectableSize}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
        }
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        ForeignerHomeFragment foreignerHomeFragment = (ForeignerHomeFragment) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = access100 + 89;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(foreignerHomeFragment, function1, setDetectableSize);
        int i4 = access100 + 55;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~(i | i4);
        int i11 = i9 | i10;
        int i12 = ~i;
        int i13 = i9 | (~(i12 | i5)) | i10;
        int i14 = (~(i4 | i | i5)) | (~(i7 | i12 | i8));
        int i15 = i + i5 + i2 + (1322235619 * i3) + (440487356 * i6);
        int i16 = i15 * i15;
        int i17 = (((-1102165783) * i) - 2100690944) + ((-281430247) * i5) + ((-820735536) * i11) + (i13 * 410367768) + (410367768 * i14) + ((-691798016) * i2) + ((-942931968) * i3) + ((-1410334720) * i6) + (1251606528 * i16);
        int i18 = (i * 157034417) + 1376579869 + (i5 * 157036385) + (i11 * (-1968)) + (i13 * 984) + (i14 * 984) + (i2 * 157035401) + (i3 * (-982187909)) + (i6 * (-1869533796)) + (i16 * (-899022848));
        switch (i17 + (i18 * i18 * (-511311872))) {
            case 1:
                ForeignerHomeFragment foreignerHomeFragment = (ForeignerHomeFragment) objArr[0];
                ComposeView composeView = (ComposeView) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                int i19 = 2 % 2;
                int i20 = access100 + 125;
                getInterfaceDescriptor = i20 % 128;
                int i21 = i20 % 2;
                Unit unitOnTransact = onTransact(foreignerHomeFragment, composeView, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i22 = getInterfaceDescriptor + 107;
                access100 = i22 % 128;
                int i23 = i22 % 2;
                return unitOnTransact;
            case 2:
                ForeignerHomeFragment foreignerHomeFragment2 = (ForeignerHomeFragment) objArr[0];
                int i24 = 2 % 2;
                Context contextRequireContext = foreignerHomeFragment2.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ComposeView composeView2 = new ComposeView(contextRequireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                composeView2.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
                composeView2.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-1556959723, true, new ForeignerHomeFragment$.ExternalSyntheticLambda20(foreignerHomeFragment2, composeView2))));
                int i25 = access100 + 113;
                getInterfaceDescriptor = i25 % 128;
                int i26 = i25 % 2;
                return composeView2;
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return IAuthTabCallback(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return asInterface(objArr);
            case 11:
                return asBinder(objArr);
            case 12:
                return IAuthTabCallbackStubProxy(objArr);
            case 13:
                return access100(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(setDetectableSize);
        int i4 = access100 + 41;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit onExtraCallback(bindEngineRouter bindenginerouter, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 39;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(bindenginerouter, setDetectableSize);
        }
        onExtraCallbackWithResult(bindenginerouter, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ForeignerHomeFragment foreignerHomeFragment, ComposeView composeView, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 57;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(foreignerHomeFragment, composeView, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getInterfaceDescriptor + 103;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ForeignerHomeFragment foreignerHomeFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 81;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(foreignerHomeFragment, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(foreignerHomeFragment, setDetectableSize);
        int i3 = getInterfaceDescriptor + 91;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 89;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(setDetectableSize);
        int i4 = access100 + 31;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 103;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(i, setDetectableSize);
        int i5 = access100 + 125;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(ForeignerHomeFragment foreignerHomeFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(foreignerHomeFragment, setDetectableSize);
        int i4 = getInterfaceDescriptor + 27;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(ForeignerHomeFragment foreignerHomeFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(foreignerHomeFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 93;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault(setDetectableSize);
        }
        IAuthTabCallbackDefault(setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(bindEngineRouter bindenginerouter, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 69;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(bindenginerouter, setDetectableSize);
        int i4 = access100 + 39;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onTransact(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 13;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(setDetectableSize);
        int i4 = getInterfaceDescriptor + 17;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 9;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(zBooleanValue, setDetectableSize);
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        int i5 = access100 + 17;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ForeignerHomeFragment foreignerHomeFragment, ComposeView composeView, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 57;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface(foreignerHomeFragment, composeView, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getInterfaceDescriptor + 79;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ForeignerHomeFragment foreignerHomeFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(foreignerHomeFragment, setDetectableSize);
        int i4 = access100 + 29;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onWarmupCompleted(BindingNode bindingNode, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(bindingNode, setDetectableSize);
        int i4 = getInterfaceDescriptor + 9;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 13;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(setDetectableSize);
        int i4 = getInterfaceDescriptor + 91;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onWarmupCompleted(bindEngineRouter bindenginerouter, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 67;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault(bindenginerouter, setDetectableSize);
        }
        IAuthTabCallbackDefault(bindenginerouter, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(ForeignerHomeFragment foreignerHomeFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = access100 + 57;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(foreignerHomeFragment, bool);
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(ForeignerHomeFragment foreignerHomeFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = access100 + 79;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(foreignerHomeFragment, iEngagementSignalsCallbackDefault);
        int i4 = access100 + 83;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return 4671152L;
        }
        int i3 = 91 / 0;
        return 4671152L;
    }

    public ForeignerHomeFragment() {
        IEngagementSignalsCallback_Parcel<String> iEngagementSignalsCallback_ParcelRegisterForActivityResult = registerForActivityResult(new IPostMessageService_Parcel.asBinder(), new ForeignerHomeFragment$.ExternalSyntheticLambda6(this));
        Intrinsics.checkNotNullExpressionValue(iEngagementSignalsCallback_ParcelRegisterForActivityResult, "");
        this.onWarmupCompleted = iEngagementSignalsCallback_ParcelRegisterForActivityResult;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_ParcelRegisterForActivityResult2 = registerForActivityResult(new IPostMessageService_Parcel.asInterface(), new ForeignerHomeFragment$.ExternalSyntheticLambda7(this));
        Intrinsics.checkNotNullExpressionValue(iEngagementSignalsCallback_ParcelRegisterForActivityResult2, "");
        this.onNavigationEvent = iEngagementSignalsCallback_ParcelRegisterForActivityResult2;
        Lazy lazyOnNavigationEvent = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallbackStubProxy(new getInterfaceDescriptor(this)));
        this.onExtraCallbackWithResult = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(ForeignerHomeViewModel.class), new IAuthTabCallback_Parcel(lazyOnNavigationEvent), new access000(null, lazyOnNavigationEvent), new access100(this, lazyOnNavigationEvent));
    }

    public static final /* synthetic */ Object IAuthTabCallback(ForeignerHomeFragment foreignerHomeFragment, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = access100 + 3;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = foreignerHomeFragment.IAuthTabCallback((access13800<? super Unit>) access13800Var);
        int i4 = access100 + 99;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return objIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ IEngagementSignalsCallback_Parcel onExtraCallback(ForeignerHomeFragment foreignerHomeFragment) {
        int i = 2 % 2;
        int i2 = access100 + 113;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = foreignerHomeFragment.onNavigationEvent;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 113;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return iEngagementSignalsCallback_Parcel;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        ForeignerHomeFragment foreignerHomeFragment = (ForeignerHomeFragment) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        ForeignerHomeViewModel foreignerHomeViewModel = (ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1824560053, new Object[]{foreignerHomeFragment}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
        int i4 = access100 + 7;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return foreignerHomeViewModel;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (-1332965437) - (ViewConfiguration.getTapTimeout() >> 16), (-1254943648) + ExpandableListView.getPackedPositionGroup(0L), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 4, objArr);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), onRelationshipValidationResult())});
        int i4 = access100 + 89;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return mapIAuthTabCallback;
    }

    private final String onRelationshipValidationResult() throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 111;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        int i4 = access100 + 25;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = new Object[1];
        a((short) TextUtils.indexOf("", "", 0), (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) - 1332965436, (KeyEvent.getMaxKeyCode() >> 16) - 1254943648, (-3) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        String string = arguments.getString(((String) objArr[0]).intern());
        int i6 = getInterfaceDescriptor + 89;
        access100 = i6 % 128;
        if (i6 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public InventoryAdManager updateVisuals() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 7;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        InventoryAdManager inventoryAdManager = this.inventoryAdManager;
        if (inventoryAdManager != null) {
            int i5 = i2 + 101;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return inventoryAdManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = access100 + 105;
        getInterfaceDescriptor = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 35 / 0;
        }
        return null;
    }

    public final SessionTrackerb readTypedObject() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 21;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        Object obj = null;
        if (sessionTrackerb != null) {
            int i5 = i2 + 9;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 == 0) {
                return sessionTrackerb;
            }
            obj.hashCode();
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i6 = access100 + 11;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 20 / 0;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1 = r1 + 55;
        im.toss.features.foreigner.home.ui.ForeignerHomeFragment.access100 = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AppLovinSdkInitializationConfigurationImpl extraCallbackWithResult() {
        AppLovinSdkInitializationConfigurationImpl appLovinSdkInitializationConfigurationImpl;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 111;
        access100 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            appLovinSdkInitializationConfigurationImpl = this.inbox;
            int i4 = 93 / 0;
        } else {
            appLovinSdkInitializationConfigurationImpl = this.inbox;
        }
    }

    public final getEnableJsT2 extraCallback() {
        int i = 2 % 2;
        getEnableJsT2 getenablejst2 = this.kycHelper;
        Object obj = null;
        if (getenablejst2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = access100;
        int i3 = i2 + 85;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 15;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return getenablejst2;
        }
        obj.hashCode();
        throw null;
    }

    public final getDummyAd ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 121;
        access100 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        getDummyAd getdummyad = this.standardTermsV2Intent;
        if (getdummyad == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 79;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return getdummyad;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = ForeignerHomeFragment.this.new onWarmupCompleted(access13800Var);
            int i2 = onExtraCallback + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 58 / 0;
            return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                ForeignerHomeFragment foreignerHomeFragment = ForeignerHomeFragment.this;
                this.label = 1;
                if (ForeignerHomeFragment.IAuthTabCallback(foreignerHomeFragment, (access13800) this) == objOnWarmupCompleted) {
                    int i3 = IAuthTabCallback + 29;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 87 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = IAuthTabCallback + 125;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                if (i6 != 0) {
                    throw null;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i7 = onExtraCallback + 87;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ bindEngineRouter $card;
        int label;
        private static final byte[] $$a = {50, -82, -81, 124};
        private static final int $$b = 78;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int IAuthTabCallback = 1;
        private static char[] onNavigationEvent = {60839, 64720, 53062, 55778, 43106, 47765, 34077, 38832, 26159, 28951, 17297, 21024, 15600, 3846, 6551, 59438, 64235, 50484, 54341, 42708, 45423, 33764, 37388, 31879, 20339, 22959, 10443, 15193, 1517, 5227, 59032, 61726, 50054, 53880, 48304, 36808, 40514, 26852, 31611, 17796, 21522, 9896, 12588, 'p', 4816, 64870, 53239, 56846, 25357, 29306, 16876, 22344, 9928, 13375, 2999, 6426, 59525, 65469, 52539, 56458, 45658, 33196, 38717, 26244, 29761, 19355, 23295, 10345, 16261, 3418, 7339, 62010, 49545, 55042, 42602, 46561, 35613, 39617, 26661, 32695, 19771, 23709, 12825, 355, 4345, 58958, 62961, 52013, 56043};
        private static long onWarmupCompleted = 8626246705212554405L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, short s2, byte b) {
            int i;
            int i2 = (s * 3) + 97;
            byte[] bArr = $$a;
            int i3 = b * 4;
            int i4 = 4 - (s2 * 3);
            byte[] bArr2 = new byte[i3 + 1];
            if (bArr == null) {
                int i5 = i4;
                int i6 = i3;
                i = 0;
                int i7 = i4 + (-i6);
                i4 = i5 + 1;
                i2 = i7;
                bArr2[i] = (byte) i2;
                if (i == i3) {
                    return new String(bArr2, 0);
                }
                i++;
                i6 = bArr[i4];
                int i8 = i4;
                i4 = i2;
                i5 = i8;
                int i72 = i4 + (-i6);
                i4 = i5 + 1;
                i2 = i72;
                bArr2[i] = (byte) i2;
                if (i == i3) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i2;
                if (i == i3) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(bindEngineRouter bindenginerouter, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$card = bindenginerouter;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = ForeignerHomeFragment.this.new onTransact(this.$card, access13800Var);
            int i2 = IAuthTabCallback + 103;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 10 / 0;
            }
            return ontransact;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 65;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onTransact ontransactCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return ontransactCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 33 / 0;
            return ontransactCreate.invokeSuspend(Unit.INSTANCE);
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i4 = $11 + 9;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 59697), 17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 10973 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (Process.myPid() >> 22)), MotionEvent.axisFromString("") + 32, TextUtils.lastIndexOf("", '0') + 20221, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 49123), Color.argb(0, 0, 0, 0) + 44, Color.argb(0, 0, 0, 0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i7 = $11 + 43;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i9 = $11 + 111;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 49124), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44, View.combineMeasuredStates(0, 0) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 23;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                SessionTrackerb typedObject = ForeignerHomeFragment.this.readTypedObject();
                Context context = ForeignerHomeFragment.this.getContext();
                Object[] objArr = new Object[1];
                a(ViewConfiguration.getTouchSlop() >> 8, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 48, (char) (Process.myTid() >> 22), objArr);
                SessionTrackerb.onExtraCallbackWithResult(typedObject, context, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(150L, this) == objOnWarmupCompleted) {
                    int i4 = IAuthTabCallback + 39;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            }
            SessionTrackerb typedObject2 = ForeignerHomeFragment.this.readTypedObject();
            Context context2 = ForeignerHomeFragment.this.getContext();
            String strOnNavigationEvent = this.$card.onNavigationEvent();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a(48 - ExpandableListView.getPackedPositionType(0L), 41 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (36522 - View.resolveSize(0, 0)), objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(strOnNavigationEvent);
            sb.append("&_auth_type=session&referrer=foreigner_home");
            SessionTrackerb.onExtraCallbackWithResult(typedObject2, context2, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i6 = IAuthTabCallback + 21;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }
    }

    private static final Unit IAuthTabCallback(ForeignerHomeFragment foreignerHomeFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
            r8lambda6v0yvgpvgcqzeji1gnetqsiyse.IAuthTabCallback().isSucceed();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.IAuthTabCallback().isSucceed()) {
            H5TinyPopMenuTitleBarTheme.IAuthTabCallback.IAuthTabCallback(true);
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(foreignerHomeFragment), (CoroutineContext) null, (setRandomHost) null, foreignerHomeFragment.new onWarmupCompleted(null), 3, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = access100 + 91;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $10 + 31;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i6 = $10 + 23;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallback_Parcel[i2 + i8])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 59697), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17, Color.argb(0, 0, 0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(access000), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 46134), View.resolveSize(0, 0) + 31, 20220 - (ViewConfiguration.getScrollBarSize() >> 8), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = (byte) (b + 1);
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 49122), 44 - (ViewConfiguration.getLongPressTimeout() >> 16), View.getDefaultSize(0, 0) + 1494, -1657859959, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        char[] cArr = new char[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 + 1);
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - ImageFormat.getBitsPerPixel(0)), 44 - Color.alpha(0), 1494 - TextUtils.getOffsetBefore("", 0), -1657859959, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i9 = $10 + 113;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr);
    }

    public static final class getInterfaceDescriptor extends Lambda implements Function0<Fragment> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public getInterfaceDescriptor(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Fragment fragmentOnExtraCallback = onExtraCallback();
            int i4 = onWarmupCompleted + 99;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 28 / 0;
            }
            return fragmentOnExtraCallback;
        }

        public final Fragment onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 55;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Fragment fragment = this.$this_viewModels;
            int i5 = i2 + 5;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return fragment;
        }
    }

    private static final void IAuthTabCallback(ForeignerHomeFragment foreignerHomeFragment, Boolean bool) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bool, "");
        Object obj = null;
        if (!bool.booleanValue()) {
            if (!(!foreignerHomeFragment.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS"))) {
                return;
            }
            int i2 = getInterfaceDescriptor + 17;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                foreignerHomeFragment.ICustomTabsCallbackStubProxy();
                return;
            } else {
                foreignerHomeFragment.ICustomTabsCallbackStubProxy();
                obj.hashCode();
                throw null;
            }
        }
        int i3 = getInterfaceDescriptor + 33;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1824560053, new Object[]{foreignerHomeFragment}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).readTypedObject();
            return;
        }
        ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1824560053, new Object[]{foreignerHomeFragment}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).readTypedObject();
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackStubProxy extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStubProxy(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnWarmupCompleted = onWarmupCompleted();
            int i4 = onExtraCallback + 89;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnWarmupCompleted;
            }
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0 = (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
            int i4 = onExtraCallback + 23;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda0;
        }
    }

    public static final class IAuthTabCallback_Parcel extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback_Parcel(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback = onExtraCallback();
            int i4 = onExtraCallback + 91;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
            if (i3 == 0) {
                int i4 = 24 / 0;
            }
            return viewModelStore;
        }
    }

    public static final class access000 extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public access000(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback = IAuthTabCallback();
                int i3 = 73 / 0;
            } else {
                androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback = IAuthTabCallback();
            }
            int i4 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
          0x001b: PHI (r1v5 kotlin.jvm.functions.Function0) = (r1v4 kotlin.jvm.functions.Function0), (r1v13 kotlin.jvm.functions.Function0) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 IAuthTabCallback() {
            Function0 function0;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                function0 = this.$extrasProducer;
                int i3 = 63 / 0;
                if (function0 != null) {
                    AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                    if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                        int i4 = onExtraCallbackWithResult + 125;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 87 / 0;
                        }
                        return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                    }
                }
            } else {
                function0 = this.$extrasProducer;
                if (function0 != null) {
                }
            }
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6 = !((textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) ^ true) ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent : null;
            if (textFieldKeyInputExternalSyntheticLambda6 != null) {
                int i6 = onExtraCallbackWithResult + 37;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras();
                    throw null;
                }
                return textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras();
            }
            return AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
        }
    }

    public static final class access100 extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public access100(Fragment fragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onExtraCallback + 95;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return onwarmupcompletedOnExtraCallbackWithResult;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0035 A[PHI: r1
          0x0035: PHI (r1v6 o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) = 
          (r1v5 o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0)
          (r1v16 o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0)
         binds: [B:8:0x0028, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ViewModelProvider.onWarmupCompleted onExtraCallbackWithResult() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
                int i3 = 88 / 0;
                if (androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                    textFieldKeyInputExternalSyntheticLambda6 = (TextFieldKeyInputExternalSyntheticLambda6) androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent;
                } else {
                    int i4 = onExtraCallback + 85;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    textFieldKeyInputExternalSyntheticLambda6 = null;
                }
            } else {
                androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
                if (!(androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6)) {
                }
            }
            if (textFieldKeyInputExternalSyntheticLambda6 == null || (defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory()) == null) {
                ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
                return defaultViewModelProviderFactory2;
            }
            int i6 = onExtraCallbackWithResult + 23;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return defaultViewModelProviderFactory;
            }
            obj.hashCode();
            throw null;
        }
    }

    private static final void onNavigationEvent(ForeignerHomeFragment foreignerHomeFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1824560053, new Object[]{foreignerHomeFragment}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).IAuthTabCallback_Parcel();
        int i4 = access100 + 11;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ForeignerHomeFragment foreignerHomeFragment = (ForeignerHomeFragment) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        ForeignerHomeViewModel foreignerHomeViewModel = (ForeignerHomeViewModel) foreignerHomeFragment.onExtraCallbackWithResult.getValue();
        int i4 = getInterfaceDescriptor + 47;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return foreignerHomeViewModel;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        FrameLayout frameLayout = new FrameLayout(requireContext());
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        frameLayout.addView((View) onExtraCallback(-1894778289, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1894778291, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent()), -1, -1);
        int i2 = getInterfaceDescriptor + 11;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return frameLayout;
    }

    static final class onExtraCallback implements r8lambda9HStmjrtoDHLHwHNekzuov8q0sI {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

        static {
            int i = onExtraCallbackWithResult + 45;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        onExtraCallback() {
        }

        public final getDelegateokhttp onWarmupCompleted(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, pin pinVar, long j) {
            getDelegateokhttp getdelegateokhttpOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
                Intrinsics.checkNotNullParameter(pinVar, "");
                getdelegateokhttpOnExtraCallbackWithResult = getDelegateokhttp.Companion.onExtraCallbackWithResult();
                int i3 = 82 / 0;
            } else {
                Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
                Intrinsics.checkNotNullParameter(pinVar, "");
                getdelegateokhttpOnExtraCallbackWithResult = getDelegateokhttp.Companion.onExtraCallbackWithResult();
            }
            int i4 = onExtraCallback + 57;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return getdelegateokhttpOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ForeignerHomeFragment foreignerHomeFragment = (ForeignerHomeFragment) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 5;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 3) != 2, iIntValue & 1)) {
            int i4 = access100 + 5;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 79 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-272451620, iIntValue, -1, "im.toss.features.foreigner.home.ui.ForeignerHomeFragment.createContentView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ForeignerHomeFragment.kt:176)");
                }
                sendNotFound.onExtraCallback(MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{foreignerHomeFragment.updateVisuals(), foreignerHomeFragment, (ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1824560053, new Object[]{foreignerHomeFragment}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent()), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(InventoryAdManager.onExtraCallbackWithResult), 0}, MaxNativeAdListener.onExtraCallbackWithResult(), 893743514, MaxNativeAdListener.onExtraCallbackWithResult(), -893743514);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i6 = getInterfaceDescriptor + 59;
                    access100 = i6 % 128;
                    if (i6 % 2 == 0) {
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
                sendNotFound.onExtraCallback(MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{foreignerHomeFragment.updateVisuals(), foreignerHomeFragment, (ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1824560053, new Object[]{foreignerHomeFragment}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent()), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(InventoryAdManager.onExtraCallbackWithResult), 0}, MaxNativeAdListener.onExtraCallbackWithResult(), 893743514, MaxNativeAdListener.onExtraCallbackWithResult(), -893743514);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onTransact(ForeignerHomeFragment foreignerHomeFragment, ComposeView composeView, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object objOnMinimized;
        int i2 = 2 % 2;
        int i3 = access100 + 23;
        getInterfaceDescriptor = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 5) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = access100 + 71;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1236518951, i, -1, "im.toss.features.foreigner.home.ui.ForeignerHomeFragment.createContentView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ForeignerHomeFragment.kt:142)");
            }
            View view = (View) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallbackDefault());
            Unit unit = Unit.INSTANCE;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(foreignerHomeFragment);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(view);
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(composeView);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnExtraCallback | zOnExtraCallback2) || zOnExtraCallback3) {
                objOnMinimized2 = new onNavigationEvent(foreignerHomeFragment, view, composeView, (access13800) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 6);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = onExtraCallback.onWarmupCompleted;
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                dispatchPostbackRequest.onNavigationEvent(0.0f, (Integer) null, 0, (handshake) null, (r8lambda9HStmjrtoDHLHwHNekzuov8q0sI) objOnMinimized, ForwardingCameraControl.onExtraCallback(-272451620, true, new ForeignerHomeFragment$.ExternalSyntheticLambda22(foreignerHomeFragment), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 221184, 15);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                int i6 = access100 + 93;
                getInterfaceDescriptor = i6 % 128;
                int i7 = i6 % 2;
                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 6);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                dispatchPostbackRequest.onNavigationEvent(0.0f, (Integer) null, 0, (handshake) null, (r8lambda9HStmjrtoDHLHwHNekzuov8q0sI) objOnMinimized, ForwardingCameraControl.onExtraCallback(-272451620, true, new ForeignerHomeFragment$.ExternalSyntheticLambda22(foreignerHomeFragment), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 221184, 15);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(ForeignerHomeFragment foreignerHomeFragment, ComposeView composeView, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 55;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = access100 + 111;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1500998425, i, -1, "im.toss.features.foreigner.home.ui.ForeignerHomeFragment.createContentView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ForeignerHomeFragment.kt:141)");
            }
            setPostviewFormatSelector.onNavigationEvent(setParams.onWarmupCompleted().onExtraCallback(foreignerHomeFragment.onRelationshipValidationResult()), ForwardingCameraControl.onExtraCallback(1236518951, true, new ForeignerHomeFragment$.ExternalSyntheticLambda21(foreignerHomeFragment, composeView), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(ForeignerHomeFragment foreignerHomeFragment, ComposeView composeView, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor;
        int i4 = i3 + 79;
        access100 = i4 % 128;
        if (i4 % 2 != 0 ? (i & 3) == 2 : (i & 2) == 4) {
            z = false;
        } else {
            int i5 = i3 + 65;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = access100 + 31;
            getInterfaceDescriptor = i7 % 128;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1679206001, i, -1, "im.toss.features.foreigner.home.ui.ForeignerHomeFragment.createContentView.<anonymous>.<anonymous>.<anonymous> (ForeignerHomeFragment.kt:140)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-1500998425, true, new ForeignerHomeFragment$.ExternalSyntheticLambda18(foreignerHomeFragment, composeView), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(ForeignerHomeFragment foreignerHomeFragment, ComposeView composeView, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = getInterfaceDescriptor + 45;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = access100 + 59;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1556959723, i, -1, "im.toss.features.foreigner.home.ui.ForeignerHomeFragment.createContentView.<anonymous>.<anonymous> (ForeignerHomeFragment.kt:139)");
            }
            AppLovinBroadcastManager.onExtraCallbackWithResult(new accessgetCameraFactoryp[0], ForwardingCameraControl.onExtraCallback(-1679206001, true, new ForeignerHomeFragment$.ExternalSyntheticLambda3(foreignerHomeFragment, composeView), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 48);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = getInterfaceDescriptor + 85;
                access100 = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public void onRetry() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 101;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        ForeignerHomeViewModel.onWarmupCompleted((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1824560053, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent()), false, 1, (Object) null);
        int i4 = access100 + 97;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onHiddenChanged(boolean z) {
        int i = 2 % 2;
        super/*androidx.fragment.app.Fragment*/.onHiddenChanged(z);
        if (!z) {
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1824560053, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).extraCallback();
            int i2 = access100 + 95;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = access100 + 39;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 75;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            super.onStart();
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1824560053, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).extraCallback();
            int i3 = 21 / 0;
        } else {
            super.onStart();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent2, 1824560053, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).extraCallback();
        }
        int i4 = access100 + 27;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 71;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1824560053, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).writeTypedObject();
            super.onDestroyView();
            int i3 = 31 / 0;
        } else {
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent2, 1824560053, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).writeTypedObject();
            super.onDestroyView();
        }
        int i4 = access100 + 71;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
    }

    private static final Unit asInterface(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 111;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void onExtraCallback(ForeignerHomeFragment foreignerHomeFragment, long j, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = access100 + 13;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 5) != 0) {
            function1 = new ForeignerHomeFragment$.ExternalSyntheticLambda24();
            int i4 = getInterfaceDescriptor + 81;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
        foreignerHomeFragment.onNavigationEvent(j, (Function1<? super SetDetectableSize, Unit>) function1);
        int i6 = getInterfaceDescriptor + 17;
        access100 = i6 % 128;
        int i7 = i6 % 2;
    }

    private final void onNavigationEvent(long j, Function1<? super SetDetectableSize, Unit> function1) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, j, false, (String) null, (Map) null, new ForeignerHomeFragment$.ExternalSyntheticLambda13(this, function1), 14, (Object) null);
        int i2 = access100 + 57;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallbackWithResult(ForeignerHomeFragment foreignerHomeFragment, Function1 function1, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getTouchSlop() >> 8), (byte) (ViewConfiguration.getTouchSlop() >> 8), (-1332965437) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (Process.myPid() >> 22) - 1254943648, View.MeasureSpec.makeMeasureSpec(0, 0) - 4, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), foreignerHomeFragment.onRelationshipValidationResult());
        function1.invoke(setDetectableSize);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 15;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.sendNotDomainWhiteList
    public void IAuthTabCallbackDefault() throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(this, 5201006L, null, 2, null);
        SessionTrackerb typedObject = readTypedObject();
        Context context = getContext();
        Object[] objArr = new Object[1];
        a((short) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 1332965253, (ViewConfiguration.getKeyRepeatDelay() >> 16) - 1254943647, Color.green(0) + 51, objArr);
        SessionTrackerb.onExtraCallbackWithResult(typedObject, context, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i4 = access100 + 35;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.sendNotDomainWhiteList
    public void asInterface() throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(this, 4701244L, null, 2, null);
        SessionTrackerb typedObject = readTypedObject();
        Context context = getContext();
        Object[] objArr = new Object[1];
        a((short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (byte) (ExpandableListView.getPackedPositionChild(0L) + 1), (-1332965191) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 1254943647, 35 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        SessionTrackerb.onExtraCallbackWithResult(typedObject, context, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i4 = access100 + 67;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(boolean z, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("unread_notification_yn", zzaz.onExtraCallbackWithResult(z));
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 99;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // o.sendNotDomainWhiteList
    public void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        onNavigationEvent(4701246L, (Function1<? super SetDetectableSize, Unit>) new ForeignerHomeFragment$.ExternalSyntheticLambda12(z));
        extraCallbackWithResult().onExtraCallbackWithResult(getContext(), 4);
        int i2 = getInterfaceDescriptor + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int length;
        byte[] bArr;
        int i5;
        int length2;
        byte[] bArr2;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(asBinder)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43424), Color.green(0) + 42, View.resolveSizeAndState(0, 0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 29;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            long j = 0;
            if (i4 != 0) {
                byte[] bArr3 = IAuthTabCallbackStub;
                if (bArr3 != null) {
                    int i9 = $10 + 83;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        length2 = bArr3.length;
                        bArr2 = new byte[length2];
                    } else {
                        length2 = bArr3.length;
                        bArr2 = new byte[length2];
                    }
                    int i10 = 0;
                    while (i10 < length2) {
                        Object[] objArr3 = {Integer.valueOf(bArr3[i10])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 12843);
                            int iGreen = Color.green(0) + 55;
                            int packedPositionType = ExpandableListView.getPackedPositionType(j) + 2167;
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(scrollBarSize, iGreen, packedPositionType, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i10++;
                        j = 0;
                    }
                    int i11 = $10 + 31;
                    $11 = i11 % 128;
                    i5 = 2;
                    int i12 = i11 % 2;
                    bArr3 = bArr2;
                } else {
                    i5 = 2;
                }
                if (bArr3 != null) {
                    byte[] bArr4 = IAuthTabCallbackStub;
                    Object[] objArr4 = new Object[i5];
                    objArr4[1] = Integer.valueOf(IAuthTabCallbackDefault);
                    objArr4[0] = Integer.valueOf(i);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43424), View.resolveSize(0, 0) + 42, 22439 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (asBinder ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onTransact[i + ((int) (IAuthTabCallbackDefault ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (asBinder ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (IAuthTabCallbackDefault ^ (-4629411779493505016L))) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(asInterface), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 86, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9566, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = IAuthTabCallbackStub;
                if (bArr5 != null) {
                    int i13 = $11 + 125;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    for (int i14 = 0; i14 < length; i14++) {
                        int i15 = $10 + 113;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        bArr[i14] = (byte) (bArr5[i14] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    int i17 = $11 + 81;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = IAuthTabCallbackStub;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onTransact;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static final Unit IAuthTabCallback(ForeignerHomeFragment foreignerHomeFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        newValue newvalueIAuthTabCallbackDefault = ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1824560053, new Object[]{foreignerHomeFragment}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).IAuthTabCallbackDefault();
        boolean z = false;
        if (newvalueIAuthTabCallbackDefault != null && newvalueIAuthTabCallbackDefault.onExtraCallbackWithResult()) {
            int i2 = access100;
            int i3 = i2 + 89;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 59;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        setDetectableSize.onExtraCallback("tossbank_reward_yn", zzaz.onExtraCallbackWithResult(z));
        setDetectableSize.onExtraCallback("button_type", "create_account");
        return Unit.INSTANCE;
    }

    @Override // o.sendNotDomainWhiteList
    public void access000() throws Throwable {
        int i = 2 % 2;
        onNavigationEvent(4701316L, (Function1<? super SetDetectableSize, Unit>) new ForeignerHomeFragment$.ExternalSyntheticLambda10(this));
        ICustomTabsCallbackDefault();
        int i2 = access100 + 59;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 14 / 0;
        }
    }

    @Override // o.sendNotDomainWhiteList
    public void access100() throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 113;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(this, 5212346L, null, 4, null);
        } else {
            onExtraCallback(this, 5212346L, null, 2, null);
        }
        ICustomTabsCallbackDefault();
        int i3 = access100 + 51;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private final void ICustomTabsCallbackDefault() throws Throwable {
        callBridgeApi.onExtraCallbackWithResult onextracallbackwithresult;
        longDefault longdefaultOnExtraCallbackWithResult;
        int i = 2 % 2;
        newValue newvalueIAuthTabCallbackDefault = ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1824560053, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).IAuthTabCallbackDefault();
        boolean z = true;
        if (!addExtra.onNavigationEvent(PlayerErrorCode.onWarmupCompleted)) {
            if (newvalueIAuthTabCallbackDefault == null || !newvalueIAuthTabCallbackDefault.onExtraCallbackWithResult()) {
                SessionTrackerb.onExtraCallbackWithResult(readTypedObject(), getContext(), "banktoss://onboarding?referrer=foreigner_home", false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                return;
            } else {
                if (SessionTrackerb.onExtraCallbackWithResult(readTypedObject(), getContext(), newvalueIAuthTabCallbackDefault.onWarmupCompleted(), false, (Function1) null, (Bundle) null, false, 60, (Object) null)) {
                    return;
                }
                SessionTrackerb.onExtraCallbackWithResult(readTypedObject(), getContext(), "banktoss://onboarding?referrer=foreigner_home", false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                int i2 = getInterfaceDescriptor + 51;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
        }
        Object objIAuthTabCallback = ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1824560053, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).IAuthTabCallbackStub().IAuthTabCallback();
        BridgeResponseError bridgeResponseErrorOnNavigationEvent = null;
        if (objIAuthTabCallback instanceof callBridgeApi.onExtraCallbackWithResult) {
            int i4 = access100 + 67;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            onextracallbackwithresult = (callBridgeApi.onExtraCallbackWithResult) objIAuthTabCallback;
        } else {
            onextracallbackwithresult = null;
        }
        if (onextracallbackwithresult != null && (longdefaultOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult()) != null) {
            int i5 = access100 + 49;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            BridgeResponse1 bridgeResponse1OnTransact = longdefaultOnExtraCallbackWithResult.onTransact();
            if (bridgeResponse1OnTransact != null) {
                bridgeResponseErrorOnNavigationEvent = bridgeResponse1OnTransact.onNavigationEvent();
            }
        }
        Object[] objArr = new Object[1];
        a((short) (Color.rgb(0, 0, 0) + 16777216), (byte) TextUtils.getOffsetBefore("", 0), (-1332965430) + (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf("", "") - 1254943647, MotionEvent.axisFromString("") + 26, objArr);
        Uri.Builder builderBuildUpon = Uri.parse(((String) objArr[0]).intern()).buildUpon();
        Object[] objArr2 = new Object[1];
        a((short) (MotionEvent.axisFromString("") + 1), (byte) (MotionEvent.axisFromString("") + 1), (ViewConfiguration.getTapTimeout() >> 16) - 1332965437, TextUtils.indexOf((CharSequence) "", '0', 0) - 1254943647, (ViewConfiguration.getDoubleTapTimeout() >> 16) - 4, objArr2);
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter(((String) objArr2[0]).intern(), "foreigner_home");
        if (bridgeResponseErrorOnNavigationEvent == null) {
            int i7 = getInterfaceDescriptor + 97;
            access100 = i7 % 128;
            if (i7 % 2 != 0) {
                z = false;
            }
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("showMobileActivationNudge", String.valueOf(z));
        if (bridgeResponseErrorOnNavigationEvent != null) {
            builderAppendQueryParameter2.appendQueryParameter("mobileActivationDeepLink", bridgeResponseErrorOnNavigationEvent.onNavigationEvent());
        }
        SessionTrackerb.onExtraCallbackWithResult(readTypedObject(), getContext(), builderAppendQueryParameter2.build().toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
    }

    private static final Unit IAuthTabCallbackStubProxy(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("tossbank_reward_yn", "N");
            setDetectableSize.onExtraCallback("button_type", "continue");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("tossbank_reward_yn", "N");
        setDetectableSize.onExtraCallback("button_type", "continue");
        int i3 = 61 / 0;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    @Override // o.sendNotDomainWhiteList
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getInterfaceDescriptor() {
        callBridgeApi.onExtraCallbackWithResult onextracallbackwithresult;
        bridgeInterceptPreInvoke bridgeinterceptpreinvokeOnNavigationEvent;
        int i = 2 % 2;
        Object objIAuthTabCallback = ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1824560053, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).IAuthTabCallbackStub().IAuthTabCallback();
        boolean z = true;
        if (!(!(objIAuthTabCallback instanceof callBridgeApi.onExtraCallbackWithResult))) {
            onextracallbackwithresult = (callBridgeApi.onExtraCallbackWithResult) objIAuthTabCallback;
        } else {
            int i2 = getInterfaceDescriptor + 49;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 5;
            }
            onextracallbackwithresult = null;
        }
        if (onextracallbackwithresult != null) {
            int i4 = access100 + 5;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            longDefault longdefaultOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult();
            if (longdefaultOnExtraCallbackWithResult == null || (bridgeinterceptpreinvokeOnNavigationEvent = longdefaultOnExtraCallbackWithResult.onNavigationEvent()) == null || !bridgeinterceptpreinvokeOnNavigationEvent.onNavigationEvent()) {
                z = false;
            } else {
                int i6 = getInterfaceDescriptor + 27;
                access100 = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        onNavigationEvent(4701316L, (Function1<? super SetDetectableSize, Unit>) new ForeignerHomeFragment$.ExternalSyntheticLambda23());
        if (!z) {
            SessionTrackerb.onExtraCallbackWithResult(readTypedObject(), getContext(), "banktoss://onboarding/continue?referrer=foreigner_home", false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            int i8 = getInterfaceDescriptor + 71;
            access100 = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        int i10 = getInterfaceDescriptor + 21;
        access100 = i10 % 128;
        if (i10 % 2 == 0) {
            SessionTrackerb.onExtraCallbackWithResult(readTypedObject(), getContext(), "banktoss://home?&showBridge=true&bridgeType=bank&_auth_type=session&referrer=foreigner_home", true, (Function1) null, (Bundle) null, false, 29, (Object) null);
        } else {
            SessionTrackerb.onExtraCallbackWithResult(readTypedObject(), getContext(), "banktoss://home?&showBridge=true&bridgeType=bank&_auth_type=session&referrer=foreigner_home", false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
        int i11 = getInterfaceDescriptor + 17;
        access100 = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // o.sendNotDomainWhiteList
    public void asBinder() throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(this, 4701320L, null, 2, null);
        SessionTrackerb typedObject = readTypedObject();
        Context context = getContext();
        Object[] objArr = new Object[1];
        b(KeyEvent.normalizeMetaState(0) + 51, (char) (TextUtils.indexOf("", "", 0) + 64629), Process.myTid() >> 22, objArr);
        SessionTrackerb.onExtraCallbackWithResult(typedObject, context, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i4 = getInterfaceDescriptor + 83;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String str = (String) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 3;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("banner_type", str);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 91;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // o.sendNotDomainWhiteList
    public void IAuthTabCallback(@NotNull String str, @NotNull String str2) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        onNavigationEvent(5212344L, (Function1<? super SetDetectableSize, Unit>) new ForeignerHomeFragment$.ExternalSyntheticLambda4(str2));
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        Object[] objArr = new Object[1];
        a((short) ((Process.getThreadPriority(0) + 20) >> 6), (byte) Drawable.resolveOpacity(0, 0), KeyEvent.getDeadChar(0, 0) - 1332965437, (-1254943649) - TextUtils.lastIndexOf("", '0', 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 5, objArr);
        SessionTrackerb.onExtraCallbackWithResult(readTypedObject(), getContext(), builderBuildUpon.appendQueryParameter(((String) objArr[0]).intern(), "foreigner_home").build().toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = getInterfaceDescriptor + 49;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallbackWithResult(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 33;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("banner_type", str);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("banner_type", str);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    @Override // o.sendNotDomainWhiteList
    public void onWarmupCompleted(@NotNull String str, @NotNull String str2) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        onNavigationEvent(5212344L, (Function1<? super SetDetectableSize, Unit>) new ForeignerHomeFragment$.ExternalSyntheticLambda27(str2));
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        Object[] objArr = new Object[1];
        a((short) TextUtils.getCapsMode("", 0, 0), (byte) TextUtils.getOffsetBefore("", 0), (-1332965437) - (Process.myPid() >> 22), TextUtils.getOffsetBefore("", 0) - 1254943648, (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 4, objArr);
        SessionTrackerb.onExtraCallbackWithResult(readTypedObject(), getContext(), builderBuildUpon.appendQueryParameter(((String) objArr[0]).intern(), "foreigner_home").build().toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = getInterfaceDescriptor + 113;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(bindEngineRouter bindenginerouter, SetDetectableSize setDetectableSize) {
        String str;
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        if (!(!bindenginerouter.IAuthTabCallbackStubProxy())) {
            int i2 = access100 + 115;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str = "TOSSBANK";
        } else {
            str = "MYDATA";
        }
        setDetectableSize.onExtraCallback("account_type", str);
        setDetectableSize.onExtraCallback("bank_code", bindenginerouter.onExtraCallback());
        setDetectableSize.onExtraCallback("account_id", bindenginerouter.onNavigationEvent());
        if (bindenginerouter.IAuthTabCallback() != null) {
            Long lIAuthTabCallback = bindenginerouter.IAuthTabCallback();
            if (lIAuthTabCallback == null || lIAuthTabCallback.longValue() != 0) {
                int i3 = getInterfaceDescriptor + 25;
                access100 = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            setDetectableSize.onExtraCallback("balance_yn", zzaz.onExtraCallbackWithResult(z));
        }
        setDetectableSize.onExtraCallback("account_order", Integer.valueOf(bindenginerouter.IAuthTabCallbackDefault() + 1));
        setDetectableSize.onExtraCallback("status", bindenginerouter.asBinder());
        return Unit.INSTANCE;
    }

    @Override // o.sendNotDomainWhiteList
    public void IAuthTabCallback(@NotNull bindEngineRouter bindenginerouter) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bindenginerouter, "");
        onNavigationEvent(4707150L, (Function1<? super SetDetectableSize, Unit>) new ForeignerHomeFragment$.ExternalSyntheticLambda26(bindenginerouter));
        if (!bindenginerouter.access100()) {
            int i2 = access100 + 111;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            if (!bindenginerouter.IAuthTabCallbackStubProxy()) {
                SessionTrackerb typedObject = readTypedObject();
                Context context = getContext();
                Object[] objArr = new Object[1];
                b(50 - TextUtils.indexOf((CharSequence) "", '0'), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 64629), ViewConfiguration.getScrollBarSize() >> 8, objArr);
                SessionTrackerb.onExtraCallbackWithResult(typedObject, context, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                return;
            }
        }
        Object obj = null;
        if (!bindenginerouter.IAuthTabCallbackStubProxy()) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onTransact(bindenginerouter, null), 3, (Object) null);
            int i4 = access100 + 89;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 74 / 0;
                return;
            }
            return;
        }
        String strAsInterface = bindenginerouter.asInterface();
        if (strAsInterface == null) {
            int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
            Uri.Builder builderBuildUpon = Uri.parse("banktoss://home/two-tab?viewAccount=true&accountId=" + ((String) bindEngineRouter.onWarmupCompleted(963943387, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -963943386, new Object[]{bindenginerouter}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted))).buildUpon();
            Object[] objArr2 = new Object[1];
            a((short) (Process.myPid() >> 22), (byte) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (-1332965437) - View.getDefaultSize(0, 0), (-1254943648) - (ViewConfiguration.getTapTimeout() >> 16), (-3) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
            strAsInterface = builderBuildUpon.appendQueryParameter(((String) objArr2[0]).intern(), "foreigner_home").build().toString();
            Intrinsics.checkNotNullExpressionValue(strAsInterface, "");
        }
        SessionTrackerb.onExtraCallbackWithResult(readTypedObject(), getContext(), strAsInterface, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i6 = access100 + 111;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(bindEngineRouter bindenginerouter, SetDetectableSize setDetectableSize) {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        if (bindenginerouter.IAuthTabCallbackStubProxy()) {
            str = "TOSSBANK";
        } else {
            int i2 = access100 + 83;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            str = "MYDATA";
        }
        setDetectableSize.onExtraCallback("account_type", str);
        setDetectableSize.onExtraCallback("bank_code", bindenginerouter.onExtraCallback());
        setDetectableSize.onExtraCallback("account_id", bindenginerouter.onNavigationEvent());
        if (bindenginerouter.IAuthTabCallback() != null) {
            int i4 = access100 + 87;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                bindenginerouter.IAuthTabCallback();
                throw null;
            }
            Long lIAuthTabCallback = bindenginerouter.IAuthTabCallback();
            setDetectableSize.onExtraCallback("balance_yn", zzaz.onExtraCallbackWithResult(lIAuthTabCallback == null || lIAuthTabCallback.longValue() != 0));
            int i5 = access100 + 119;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 5;
            }
        }
        setDetectableSize.onExtraCallback("account_order", Integer.valueOf(bindenginerouter.IAuthTabCallbackDefault() + 1));
        setDetectableSize.onExtraCallback("button_type", "charge");
        setDetectableSize.onExtraCallback("status", bindenginerouter.asBinder());
        return Unit.INSTANCE;
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 67;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = ForeignerHomeFragment.this.new IAuthTabCallbackDefault(access13800Var);
            int i2 = onWarmupCompleted + 29;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallbackDefault;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 39;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 63 / 0;
            }
            return objIAuthTabCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[PHI: r1
          0x0032: PHI (r1v5 java.lang.Object) = (r1v4 java.lang.Object), (r1v6 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
          0x0024: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 27;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 59 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    ForeignerHomeFragment foreignerHomeFragment = ForeignerHomeFragment.this;
                    getEnableJsT2 getenablejst2ExtraCallback = foreignerHomeFragment.extraCallback();
                    this.label = 1;
                    if (EngineInitCallback.onExtraCallback(foreignerHomeFragment, getenablejst2ExtraCallback, false, this, 2, null) == objOnWarmupCompleted) {
                        int i5 = onWarmupCompleted + 3;
                        onExtraCallback = i5 % 128;
                        if (i5 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.sendNotDomainWhiteList
    public void onWarmupCompleted(@NotNull bindEngineRouter bindenginerouter) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bindenginerouter, "");
        onNavigationEvent(4707152L, (Function1<? super SetDetectableSize, Unit>) new ForeignerHomeFragment$.ExternalSyntheticLambda14(bindenginerouter));
        if (!bindenginerouter.IAuthTabCallbackStubProxy()) {
            int i2 = getInterfaceDescriptor + 119;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            if (((Boolean) ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1824560053, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).getInterfaceDescriptor().IAuthTabCallback()).booleanValue()) {
                Object obj = null;
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(null), 3, (Object) null);
                int i4 = getInterfaceDescriptor + 3;
                access100 = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        SessionTrackerb typedObject = readTypedObject();
        Context context = getContext();
        String strOnExtraCallback = bindenginerouter.onExtraCallback();
        String strOnWarmupCompleted = bindenginerouter.onWarmupCompleted();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        b(MotionEvent.axisFromString("") + 37, (char) (TextUtils.getOffsetBefore("", 0) + 58690), 51 - TextUtils.getOffsetBefore("", 0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strOnExtraCallback);
        sb.append("&accountNo=");
        sb.append(strOnWarmupCompleted);
        sb.append("&referrer=foreigner_home");
        SessionTrackerb.onExtraCallbackWithResult(typedObject, context, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
    }

    private static final Unit IAuthTabCallbackDefault(bindEngineRouter bindenginerouter, SetDetectableSize setDetectableSize) {
        String str;
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        if (bindenginerouter.IAuthTabCallbackStubProxy()) {
            int i2 = getInterfaceDescriptor + 59;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            str = "TOSSBANK";
        } else {
            int i4 = access100 + 21;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 5;
            }
            str = "MYDATA";
        }
        setDetectableSize.onExtraCallback("account_type", str);
        setDetectableSize.onExtraCallback("bank_code", bindenginerouter.onExtraCallback());
        setDetectableSize.onExtraCallback("account_id", bindenginerouter.onNavigationEvent());
        if (bindenginerouter.IAuthTabCallback() != null) {
            int i6 = getInterfaceDescriptor + 121;
            access100 = i6 % 128;
            if (i6 % 2 == 0) {
                bindenginerouter.IAuthTabCallback();
                throw null;
            }
            Long lIAuthTabCallback = bindenginerouter.IAuthTabCallback();
            if (lIAuthTabCallback == null || lIAuthTabCallback.longValue() != 0) {
                int i7 = access100 + 81;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            setDetectableSize.onExtraCallback("balance_yn", zzaz.onExtraCallbackWithResult(z));
        }
        setDetectableSize.onExtraCallback("account_order", Integer.valueOf(bindenginerouter.IAuthTabCallbackDefault() + 1));
        setDetectableSize.onExtraCallback("button_type", "transfer");
        setDetectableSize.onExtraCallback("status", bindenginerouter.asBinder());
        return Unit.INSTANCE;
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        int label;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = ForeignerHomeFragment.this.new asInterface(access13800Var);
            int i2 = IAuthTabCallback + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return asinterface;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 37;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            asInterface asinterfaceCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 35 / 0;
            return asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent + 5;
                int i4 = i3 % 128;
                IAuthTabCallback = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 77;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                ForeignerHomeFragment foreignerHomeFragment = ForeignerHomeFragment.this;
                getEnableJsT2 getenablejst2ExtraCallback = foreignerHomeFragment.extraCallback();
                this.label = 1;
                if (EngineInitCallback.onExtraCallback(foreignerHomeFragment, getenablejst2ExtraCallback, false, this, 2, null) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i8 = onNavigationEvent + 121;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return unit;
        }
    }

    @Override // o.sendNotDomainWhiteList
    public void onNavigationEvent(@NotNull bindEngineRouter bindenginerouter) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bindenginerouter, "");
        onNavigationEvent(4707152L, (Function1<? super SetDetectableSize, Unit>) new ForeignerHomeFragment$.ExternalSyntheticLambda25(bindenginerouter));
        if (!bindenginerouter.IAuthTabCallbackStubProxy()) {
            int i2 = access100 + 67;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                ((Boolean) ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1824560053, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).getInterfaceDescriptor().IAuthTabCallback()).booleanValue();
                throw null;
            }
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            if (((Boolean) ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent2, 1824560053, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).getInterfaceDescriptor().IAuthTabCallback()).booleanValue()) {
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new asInterface(null), 3, (Object) null);
                return;
            }
        }
        SessionTrackerb typedObject = readTypedObject();
        Context context = getContext();
        String strOnWarmupCompleted = bindenginerouter.onWarmupCompleted();
        String strOnExtraCallback = bindenginerouter.onExtraCallback();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        b((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, (char) (1678 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), Color.red(0) + 87, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strOnWarmupCompleted);
        sb.append("&bankCodeFrom=");
        sb.append(strOnExtraCallback);
        sb.append("&referrer=foreigner_home&origin=foreigner_home");
        SessionTrackerb.onExtraCallbackWithResult(typedObject, context, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i3 = access100 + 93;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.sendNotDomainWhiteList
    public void onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 109;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(this, 4707188L, null, 2, null);
        SessionTrackerb typedObject = readTypedObject();
        Context context = getContext();
        Object[] objArr = new Object[1];
        a((short) KeyEvent.getDeadChar(0, 0), (byte) Color.green(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 1332965394, Color.alpha(0) - 1254943647, 36 - TextUtils.getOffsetBefore("", 0), objArr);
        SessionTrackerb.onExtraCallbackWithResult(typedObject, context, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i4 = access100 + 91;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0073 A[PHI: r10
      0x0073: PHI (r10v6 o.getCallMode) = (r10v5 o.getCallMode), (r10v15 o.getCallMode) binds: [B:8:0x0071, B:5:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onTransact(ForeignerHomeFragment foreignerHomeFragment, SetDetectableSize setDetectableSize) {
        getCallMode getcallmode;
        String strOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = access100 + 121;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            getcallmode = (getCallMode) ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1824560053, new Object[]{foreignerHomeFragment}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).access000().IAuthTabCallback();
            int i3 = 35 / 0;
            if (getcallmode != null) {
                strOnWarmupCompleted = getcallmode.onWarmupCompleted();
                int i4 = access100 + 115;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
            } else {
                strOnWarmupCompleted = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            getcallmode = (getCallMode) ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent2, 1824560053, new Object[]{foreignerHomeFragment}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).access000().IAuthTabCallback();
            if (getcallmode != null) {
            }
        }
        setDetectableSize.onExtraCallback("section_type", strOnWarmupCompleted);
        Unit unit = Unit.INSTANCE;
        int i6 = getInterfaceDescriptor + 107;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    @Override // o.sendNotDomainWhiteList
    public void IAuthTabCallback_Parcel() throws Throwable {
        int i = 2 % 2;
        onNavigationEvent(5163738L, (Function1<? super SetDetectableSize, Unit>) new ForeignerHomeFragment$.ExternalSyntheticLambda0(this));
        SessionTrackerb typedObject = readTypedObject();
        Context context = getContext();
        Object[] objArr = new Object[1];
        b((-16777160) - Color.rgb(0, 0, 0), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 20629), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 194, objArr);
        SessionTrackerb.onExtraCallbackWithResult(typedObject, context, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = getInterfaceDescriptor + 121;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit getInterfaceDescriptor(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 33;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("account_type", "MYDATA");
        setDetectableSize.onExtraCallback("status", "DIRECT_DEBIT_AGREE_NEEDED");
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 85;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // o.sendNotDomainWhiteList
    public void writeTypedObject() throws Throwable {
        int i = 2 % 2;
        onNavigationEvent(5030176L, (Function1<? super SetDetectableSize, Unit>) new ForeignerHomeFragment$.ExternalSyntheticLambda11());
        EngineInitCallback.IAuthTabCallback(this, readTypedObject());
        int i2 = getInterfaceDescriptor + 49;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = ForeignerHomeFragment.this.new IAuthTabCallbackStub(access13800Var);
            int i2 = onWarmupCompleted + 115;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 31 / 0;
            }
            return iAuthTabCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 123;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 82 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStubCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return iAuthTabCallbackStubCreate.invokeSuspend(unit);
            }
            iAuthTabCallbackStubCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted;
                int i4 = i3 + 31;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i3 + 83;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.onNavigationEvent(obj);
                if (i7 != 0) {
                    int i8 = 3 / 0;
                }
            } else {
                ResultKt.onNavigationEvent(obj);
                ForeignerHomeFragment foreignerHomeFragment = ForeignerHomeFragment.this;
                getEnableJsT2 getenablejst2ExtraCallback = foreignerHomeFragment.extraCallback();
                this.label = 1;
                if (EngineInitCallback.onExtraCallback(foreignerHomeFragment, getenablejst2ExtraCallback, false, this, 2, null) == objOnWarmupCompleted) {
                    int i9 = onExtraCallback;
                    int i10 = i9 + 89;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = i9 + 67;
                    onWarmupCompleted = i12 % 128;
                    if (i12 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallback(ForeignerHomeFragment foreignerHomeFragment, SetDetectableSize setDetectableSize) {
        String strName;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("account_type", "MYDATA");
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        bridgeInterceptPostInvoke bridgeinterceptpostinvokeOnExtraCallback = ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1824560053, new Object[]{foreignerHomeFragment}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).onExtraCallback();
        if (bridgeinterceptpostinvokeOnExtraCallback != null) {
            int i2 = access100 + 61;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            strName = bridgeinterceptpostinvokeOnExtraCallback.name();
            int i4 = access100 + 33;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        } else {
            strName = null;
        }
        setDetectableSize.onExtraCallback("status", strName);
        return Unit.INSTANCE;
    }

    @Override // o.sendNotDomainWhiteList
    public void onTransact() {
        int i = 2 % 2;
        onNavigationEvent(5030176L, (Function1<? super SetDetectableSize, Unit>) new ForeignerHomeFragment$.ExternalSyntheticLambda2(this));
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(null), 3, (Object) null);
        int i2 = access100 + 27;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.sendNotDomainWhiteList
    public void IAuthTabCallbackStubProxy() throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            Integer numOnExtraCallbackWithResult = ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1824560053, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).onExtraCallbackWithResult();
            if (numOnExtraCallbackWithResult != null) {
                int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                Object[] objArr = {(ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent2, 1824560053, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())};
                ForeignerHomeViewModel.onNavigationEvent(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1019319367, objArr, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1019319366);
                int i3 = getInterfaceDescriptor + 93;
                access100 = i3 % 128;
                int i4 = i3 % 2;
            }
            Object[] objArr2 = new Object[1];
            a((short) View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-1332965146) + (Process.myPid() >> 22), (-1254943647) - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 17, objArr2);
            Uri.Builder builderBuildUpon = Uri.parse(((String) objArr2[0]).intern()).buildUpon();
            Object[] objArr3 = new Object[1];
            a((short) View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (TextUtils.lastIndexOf("", '0') + 1), (-1332965437) - Color.argb(0, 0, 0, 0), (-1254943648) - (ViewConfiguration.getFadingEdgeLength() >> 16), (-4) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
            Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter(((String) objArr3[0]).intern(), "foreigner_home");
            if (numOnExtraCallbackWithResult != null) {
                builderAppendQueryParameter.appendQueryParameter("transactions", String.valueOf(numOnExtraCallbackWithResult.intValue()));
            }
            String string = builderAppendQueryParameter.build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            SessionTrackerb.onExtraCallbackWithResult(readTypedObject(), getContext(), string, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            return;
        }
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, 1824560053, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).onExtraCallbackWithResult();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    @Override // o.sendNotDomainWhiteList
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallback(@NotNull getFromXRiver getfromxriver) throws NoWhenBranchMatchedException {
        int iOnExtraCallbackWithResult;
        int i;
        String strOnExtraCallback;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(getfromxriver, "");
        boolean z = getfromxriver instanceof getFromXRiver.onExtraCallback;
        Object obj = null;
        if (z) {
            iOnExtraCallbackWithResult = ((getFromXRiver.onExtraCallback) getfromxriver).onExtraCallbackWithResult();
        } else {
            if (!(getfromxriver instanceof getFromXRiver.onWarmupCompleted)) {
                if (!Intrinsics.areEqual(getfromxriver, getFromXRiver.onExtraCallbackWithResult.IAuthTabCallback)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = access100 + 29;
                getInterfaceDescriptor = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
                return;
            }
            iOnExtraCallbackWithResult = ((getFromXRiver.onWarmupCompleted) getfromxriver).onExtraCallbackWithResult();
            int i3 = getInterfaceDescriptor + 69;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 % 5;
            }
        }
        onNavigationEvent(5163768L, (Function1<? super SetDetectableSize, Unit>) new ForeignerHomeFragment$.ExternalSyntheticLambda16(iOnExtraCallbackWithResult));
        if (z) {
            strOnExtraCallback = ((getFromXRiver.onExtraCallback) getfromxriver).onNavigationEvent();
        } else if (getfromxriver instanceof getFromXRiver.onWarmupCompleted) {
            strOnExtraCallback = ((getFromXRiver.onWarmupCompleted) getfromxriver).onExtraCallback();
            int i5 = access100 + 11;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
        } else {
            if (!Intrinsics.areEqual(getfromxriver, getFromXRiver.onExtraCallbackWithResult.IAuthTabCallback)) {
                throw new NoWhenBranchMatchedException();
            }
            i = access100 + 29;
            getInterfaceDescriptor = i % 128;
            if (i % 2 == 0) {
            }
        }
        SessionTrackerb.onExtraCallbackWithResult(readTypedObject(), getContext(), strOnExtraCallback, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i7 = access100 + 47;
        getInterfaceDescriptor = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(int i, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 117;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("cashback_cnt", Integer.valueOf(i));
        Unit unit = Unit.INSTANCE;
        int i5 = access100 + 101;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(getSourceProcess getsourceprocess, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("button_type", getsourceprocess.onExtraCallback());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("button_type", getsourceprocess.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.sendNotDomainWhiteList
    public void onExtraCallback(@NotNull getSourceProcess getsourceprocess) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getsourceprocess, "");
        if (getsourceprocess.onExtraCallbackWithResult()) {
            return;
        }
        onNavigationEvent(5177380L, (Function1<? super SetDetectableSize, Unit>) new ForeignerHomeFragment$.ExternalSyntheticLambda15(getsourceprocess));
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new asBinder(null), 3, (Object) null);
        int i4 = access100 + 87;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            asBinder asbinderCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                asbinderCreate.invokeSuspend(Unit.INSTANCE);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = asbinderCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 123;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = ForeignerHomeFragment.this.new asBinder(access13800Var);
            int i2 = onNavigationEvent + 103;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return asbinder;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback + 25;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                ForeignerHomeFragment foreignerHomeFragment = ForeignerHomeFragment.this;
                this.label = 1;
                if (ForeignerHomeFragment.IAuthTabCallback(foreignerHomeFragment, (access13800) this) == objOnWarmupCompleted) {
                    int i4 = onExtraCallback + 95;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        boolean z;
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 107;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            int i5 = i2 + 93;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = ((onExtraCallbackWithResult) access13800Var).label;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i7 = onextracallbackwithresult.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i7 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object objOnExtraCallback = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i8 = onextracallbackwithresult.label;
        if (i8 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            Object[] objArr = {H5TinyPopMenuTitleBarTheme.IAuthTabCallback};
            boolean zBooleanValue = ((Boolean) H5TinyPopMenuTitleBarTheme.IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), objArr, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -957813781, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 957813783)).booleanValue();
            getDummyAd getdummyadICustomTabsCallback = ICustomTabsCallback();
            onextracallbackwithresult.Z$0 = zBooleanValue;
            onextracallbackwithresult.label = 1;
            Object objIAuthTabCallback = getDummyAd.IAuthTabCallback(getdummyadICustomTabsCallback, "STD_29084_ONBOARDING", false, onextracallbackwithresult, 2, (Object) null);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            z = zBooleanValue;
            objOnExtraCallback = objIAuthTabCallback;
        } else {
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(objOnExtraCallback);
                this.onExtraCallback.onNavigationEvent((Intent) objOnExtraCallback);
                return Unit.INSTANCE;
            }
            boolean z2 = onextracallbackwithresult.Z$0;
            ResultKt.onNavigationEvent(objOnExtraCallback);
            z = z2;
        }
        if (!((Boolean) objOnExtraCallback).booleanValue()) {
            if (z) {
                ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1824560053, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).readTypedObject();
            } else {
                this.onWarmupCompleted.onNavigationEvent("android.permission.READ_CONTACTS");
            }
            return Unit.INSTANCE;
        }
        getDummyAd getdummyadICustomTabsCallback2 = ICustomTabsCallback();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        onextracallbackwithresult.Z$0 = z;
        onextracallbackwithresult.label = 2;
        objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadICustomTabsCallback2, contextRequireContext, "STD_29084_ONBOARDING", "foreigner_home", "foreigner_money_drop_event", 0L, (Map) null, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, onextracallbackwithresult, 8388592, (Object) null);
        if (objOnExtraCallback == objOnWarmupCompleted) {
            return objOnWarmupCompleted;
        }
        this.onExtraCallback.onNavigationEvent((Intent) objOnExtraCallback);
        return Unit.INSTANCE;
    }

    private final void ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        ForeignerHomeContactPermissionActivity.onNavigationEvent onnavigationevent = ForeignerHomeContactPermissionActivity.Companion;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Intent intentAddFlags = onnavigationevent.onWarmupCompleted(contextRequireContext).addFlags(65536);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "");
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        getNavigationBar.IAuthTabCallback(intentAddFlags, contextRequireContext2);
        int i4 = access100 + 97;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(BindingNode bindingNode, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback;
        int i = 2 % 2;
        int i2 = access100 + 83;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("svc_id", Long.valueOf(bindingNode.onWarmupCompleted()));
            iOnExtraCallback = bindingNode.onExtraCallback();
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("svc_id", Long.valueOf(bindingNode.onWarmupCompleted()));
            iOnExtraCallback = bindingNode.onExtraCallback() + 1;
        }
        setDetectableSize.onExtraCallback("service_order", Integer.valueOf(iOnExtraCallback));
        return Unit.INSTANCE;
    }

    @Override // o.sendNotDomainWhiteList
    public void IAuthTabCallback(@NotNull BindingNode bindingNode) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bindingNode, "");
        onNavigationEvent(4707166L, (Function1<? super SetDetectableSize, Unit>) new ForeignerHomeFragment$.ExternalSyntheticLambda8(bindingNode));
        SessionTrackerb.onExtraCallbackWithResult(readTypedObject(), getContext(), bindingNode.onNavigationEvent(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = getInterfaceDescriptor + 101;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallbackStub(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 101;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("section_type", "language_setting");
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 107;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return unit;
    }

    @Override // o.sendNotDomainWhiteList
    public void IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        onNavigationEvent(4701250L, (Function1<? super SetDetectableSize, Unit>) new ForeignerHomeFragment$.ExternalSyntheticLambda17());
        SessionTrackerb typedObject = readTypedObject();
        Context context = getContext();
        Object[] objArr = new Object[1];
        a((short) ((-1) - TextUtils.lastIndexOf("", '0')), (byte) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) - 1332965347, (-1254943647) - (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.red(0) + 41, objArr);
        SessionTrackerb.onExtraCallbackWithResult(typedObject, context, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = access100 + 115;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 103;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("section_type", "overseas_transfer");
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 95;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // o.sendNotDomainWhiteList
    public void onExtraCallbackWithResult() throws Throwable {
        int i = 2 % 2;
        onNavigationEvent(4701250L, (Function1<? super SetDetectableSize, Unit>) new ForeignerHomeFragment$.ExternalSyntheticLambda1());
        SessionTrackerb typedObject = readTypedObject();
        Context context = getContext();
        Object[] objArr = new Object[1];
        b(77 - Color.alpha(0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 117 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
        SessionTrackerb.onExtraCallbackWithResult(typedObject, context, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = access100 + 111;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.sendNotDomainWhiteList
    public void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 3;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(this, 4995164L, null, 2, null);
        SessionTrackerb typedObject = readTypedObject();
        Context context = getContext();
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        SessionTrackerb.onExtraCallbackWithResult(typedObject, context, (String) ((ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1824560053, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).asBinder().IAuthTabCallback(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i4 = getInterfaceDescriptor + 95;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback_Parcel(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 37;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("menu_type", "to_current_home");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("menu_type", "to_current_home");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.sendNotDomainWhiteList
    public void onExtraCallback() throws Throwable {
        int i = 2 % 2;
        onNavigationEvent(4701254L, (Function1<? super SetDetectableSize, Unit>) new ForeignerHomeFragment$.ExternalSyntheticLambda9());
        SessionTrackerb typedObject = readTypedObject();
        Context context = getContext();
        Object[] objArr = new Object[1];
        a((short) TextUtils.indexOf("", "", 0), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), 36993 - AndroidCharacter.getMirror('0'), (-1254943646) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 31, objArr);
        SessionTrackerb.onExtraCallbackWithResult(typedObject, context, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = access100 + 37;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("menu_type", "tossbank");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("menu_type", "tossbank");
        int i3 = 61 / 0;
        return Unit.INSTANCE;
    }

    @Override // o.sendNotDomainWhiteList
    public void IAuthTabCallbackStub() {
        int i = 2 % 2;
        onNavigationEvent(4701254L, (Function1<? super SetDetectableSize, Unit>) new ForeignerHomeFragment$.ExternalSyntheticLambda19());
        SessionTrackerb.onExtraCallbackWithResult(readTypedObject(), getContext(), "banktoss://home?&showBridge=true&bridgeType=bank&_auth_type=session&referrer=foreigner_home", false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = getInterfaceDescriptor + 85;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(-2034901727, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 2034901735, new Object[]{str, setDetectableSize}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, SetDetectableSize setDetectableSize) {
        Object[] objArr = {Boolean.valueOf(z), setDetectableSize};
        return (Unit) onExtraCallback(-643592449, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 643592453, objArr, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    public static /* synthetic */ Unit onNavigationEvent(ForeignerHomeFragment foreignerHomeFragment, ComposeView composeView, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {foreignerHomeFragment, composeView, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallback(-1609590083, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1609590096, objArr, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallback(ForeignerHomeFragment foreignerHomeFragment, ComposeView composeView, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {foreignerHomeFragment, composeView, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallback(-2001280817, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 2001280818, objArr, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallback(String str, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(-1462860841, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1462860853, new Object[]{str, setDetectableSize}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    public static /* synthetic */ Unit asBinder(SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(1990392059, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, -1990392048, new Object[]{setDetectableSize}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSourceProcess getsourceprocess, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(1017397259, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, -1017397250, new Object[]{getsourceprocess, setDetectableSize}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    public static /* synthetic */ Unit onWarmupCompleted(ForeignerHomeFragment foreignerHomeFragment, Function1 function1, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(1375918928, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, -1375918918, new Object[]{foreignerHomeFragment, function1, setDetectableSize}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    public static final /* synthetic */ ForeignerHomeViewModel IAuthTabCallback(ForeignerHomeFragment foreignerHomeFragment) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (ForeignerHomeViewModel) onExtraCallback(-1273093446, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1273093453, new Object[]{foreignerHomeFragment}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    private final View onMessageChannelReady() {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (View) onExtraCallback(-1894778289, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1894778291, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    private static final Unit onExtraCallbackWithResult(ForeignerHomeFragment foreignerHomeFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {foreignerHomeFragment, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallback(1772808574, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1772808571, objArr, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    private final ForeignerHomeViewModel onUnminimized() {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (ForeignerHomeViewModel) onExtraCallback(-1824560053, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1824560053, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    private static final Unit access000(SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(-1958975279, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1958975285, new Object[]{setDetectableSize}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    private static final Unit IAuthTabCallback(String str, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(570325170, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, -570325165, new Object[]{str, setDetectableSize}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    static void onMinimized() {
        IAuthTabCallbackDefault = -348870603;
        asBinder = -1538795516;
        asInterface = -292867046;
        IAuthTabCallbackStub = new byte[]{5, -5, 8, 5, -9, 9, -5, -10, 11, -13, -1, 24, 59, -52, -11, 5, -9, -25, 8, 12, -13, 77, -75, 5, -1, 15, -10, 12, -5, 11, 1, 63, 8, -3, -49, 8, 12, -13, 10, 5, -3, -13, 10, -16, -10, 15, 1, -27, 5, -1, 15, -10, 12, -5, 11, 1, 33, -61, 5, -5, 8, 5, -9, 9, -5, 59, -61, 14, -15, 14, 4, 8, 10, 58, -62, -16, -10, 15, 49, 8, -3, -49, 8, 12, -13, 10, 5, -3, -13, 10, -16, -10, 15, 1, -27, 5, -1, 15, -10, 12, -5, 11, 1, 33, -61, 5, -5, 8, 5, -9, 9, -5, 59, -46, -10, 14, -28, 6, -15, 5, -3, 53, -76, 4, -15, 13, -3, 8, 7, -6, 76, 8, -3, -49, 8, 12, -13, 10, 5, -3, -13, 10, 5, -12, -5, 11, 12, 38, -58, -13, 61, -33, 13, -25, 3, -6, 12, 76, -62, -16, -10, 15, 49, -75, 5, -1, 15, -10, 12, -5, 11, 1, 63, 8, -3, -49, 8, 12, -13, 10, 5, -3, -13, 10, -16, -10, 15, 1, -27, 5, -1, 15, -10, 12, -5, 11, 1, 33, -61, 5, -5, 8, 5, -9, 9, -5, 59, -38, 0, 8, 9, -9, -5, 75, -76, 9, 5, -1, -14, 10, 25, -7, 73, -75, 5, -1, 15, -10, 12, -5, 11, 1, 63, 8, -3, -49, 8, 12, -13, 7, 10, -14, -5, 12, 5, -6, -16, -10, 15, 1, -27, 5, -1, 15, -10, 12, -5, 11, 1, 33, -61, 5, -5, 8, 5, -9, 9, -5, 59, -46, -16, -10, 15, 51, -68, 16, -7, 73, 8, -3, -49, 8, 12, -13, 7, 10, -14, -5, 12, 5, -6, -9, 14, -3, 12, 11, -16, 10, 13, -9, 4, 60, -62, -16, -10, 15, 49, 8, -3, -49, 8, 12, -13, 10, 5, -3, -13, 10, 8, 8, 8, 8, 8, 8, 8, 8};
        IAuthTabCallback_Parcel = new char[]{4562, 49696, 46649, 27160, 24067, 12817, 58998, 55934, 36466, 25103, 22022, 2802, 65212, 53948, 34461, 31372, 11925, 756, 63142, 43727, 40660, 29378, 10032, 6974, 53045, 41744, 38683, 19234, 16227, 4960, 51039, 47944, 28499, 17319, 14252, 60303, 57292, 45955, 26614, 23551, 4068, 58332, 55246, 34867, 31796, 20535, 1062, 63493, 44046, 32888, 29804, 2277, 56087, 44814, 29487, 18228, 11046, 65345, 49993, 38725, 31544, 20273, 5061, 59271, 52113, 40877, 25525, 14243, 7116, 61386, 45989, 34789, 27642, 15887, 520, 54801, 47655, 36449, 21064, 9799, 2652, 56933, 41561, 30329, 23174, 11931, 62199, 60201, 14555, 19650, 37091, 42232, 51434, 7309, 8325, 29833, 39156, 44285, 61449, 1113, 10331, 31852, 32882, 54309, 63503, 3089, 20517, 25637, 34859, 56780, 57794, 13812, 23009, 28116, 45460, 50565, 59795, 15871, 60839, 15941, 19022, 38526, 41581, 52851, 6665, 9740, 29211, 40499, 43567, 63122, 651, 11935, 31459, 34542, 54001, 65170, 2703, 22189, 25253, 36515, 56065, 59210, 13137, 24429, 27509, 46876, 49936, 61201, 15138, 18235, 37681, 49039, 52186, 6138, 9195, 20477, 39873, 42892, 62363, 8115, 11183, 29701, 32848, 44127, 63521, 1131, 20593, 31758, 34824, 54314, 57377, 3183, 22750, 25821, 45266, 56549, 59630, 13466, 16513, 27778, 47345, 50366, 4283, 15698, 18777, 38241, 41315, 52606, 6409, 9482, 28971, 40232, 43315, 62917, 449, 48433, 28371, 6872, 50920, 62203, 40677, 19103, 30362, 8845, 52901, 64185, 42500, 21021, 32265, 10876, 54881, 33392, 44563, 23043, 1593, 12860, 56867, 35784, 46977, 25551, 4067, 15335, 59275, 37761, 49033, 27572, 6057, 50173, 61252, 39759, 18296, 29559, 8052, 51976, 63243, 41744, 20331, 31532, 9425, 53440, 64707, 43251, 21737, 236, 11411, 55448, 33921, 45242, 23721, 2135, 13387};
        access000 = -2116537454597161440L;
    }
}
