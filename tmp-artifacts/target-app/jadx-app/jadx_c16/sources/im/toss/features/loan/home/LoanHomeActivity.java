package im.toss.features.loan.home;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgsa;
import im.toss.base.BaseActivity;
import im.toss.features.loan.LoanFunnelForceSettingsActivity;
import im.toss.features.loan.home.LoanHomeActivity$;
import im.toss.features.loan.home.LoanManagementWebFragment;
import im.toss.features.loan.home.extensive.LoanHomeExtensiveFragment;
import im.toss.features.loan.ui.R;
import im.toss.network.model.BaseApiResponse;
import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.ForwardingCameraControl;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda17;
import o.MapConverter;
import o.NetConverter3;
import o.ResourceUtils1;
import o.RotationProvider1;
import o.SessionTrackerb;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.addPolicy;
import o.auth;
import o.clearTid;
import o.deserializeIp;
import o.deserializeUriNullableCollection;
import o.enableNebulaServiceInitOpt;
import o.enableOrientationOpt;
import o.findResAndMsg;
import o.formatMsgs;
import o.getHostnameVerifierokhttp;
import o.getParamImp;
import o.getRuntimeAppId;
import o.getWrite;
import o.initMiniApp;
import o.matches;
import o.maybeUpdateAnimatable;
import o.mediationData;
import o.onJsBridgeReady;
import o.onPageExit;
import o.requestPostMessageChannelWithExtras;
import o.setAdVideoPlaybackListener;
import o.setRandomHost;
import o.writeRaw;
import o.y1hExternalSyntheticLambda0;
import o.zzad;
import o.zzaj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanHomeActivity extends Hilt_LoanHomeActivity {
    public static final onWarmupCompleted Companion;
    public static final int IAuthTabCallbackDefault;
    private static char IAuthTabCallback_Parcel;
    private static int access000;
    private static long asBinder;
    private static int asInterface;

    @Inject
    public zzad injectedEnvironments;

    @Inject
    public mediationData loanGatewayApis;

    @Inject
    public enableOrientationOpt scoreDataSource;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {35, -11, -97, -73};
    private static final int $$b = 225;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access100 = 1;
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallbackStub = onPageExit.onNavigationEvent(this, new LoanHomeActivity$.ExternalSyntheticLambda12(this));
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new LoanHomeActivity$.ExternalSyntheticLambda13(this));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    private static String $$c(byte b, byte b2, short s) {
        int i = 4 - (b * 3);
        int i2 = s * 3;
        ?? r6 = b2 + 109;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 1];
        int i3 = -1;
        byte b3 = r6;
        if (bArr == null) {
            i3 = -1;
            b3 = i + r6;
            i++;
        }
        while (true) {
            int i4 = i3 + 1;
            bArr2[i4] = b3;
            if (i4 == i2) {
                return new String(bArr2, 0);
            }
            byte b4 = b3;
            i3 = i4;
            b3 = bArr[i] + b4;
            i++;
        }
    }

    static {
        access000 = 0;
        ICustomTabsServiceDefault();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        IAuthTabCallbackDefault = 8;
        int i = getInterfaceDescriptor + 11;
        access000 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, LoanManagementWebFragment loanManagementWebFragment, LoanHomeExtensiveFragment loanHomeExtensiveFragment, LoanHomeActivity loanHomeActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access100 + 103;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(i, loanManagementWebFragment, loanHomeExtensiveFragment, loanHomeActivity, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 44 / 0;
        }
        int i7 = IAuthTabCallbackStubProxy + 23;
        access100 = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanHomeActivity loanHomeActivity) {
        int i = 2 % 2;
        int i2 = access100 + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            access100(loanHomeActivity);
            throw null;
        }
        Unit unitAccess100 = access100(loanHomeActivity);
        int i3 = IAuthTabCallbackStubProxy + 75;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unitAccess100;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanHomeActivity loanHomeActivity, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 77;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {loanHomeActivity, Integer.valueOf(i)};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        if (i4 == 0) {
            return (Unit) onExtraCallbackWithResult(objArr, 138078444, iOnWarmupCompleted3, -138078434, iOnWarmupCompleted4, iOnWarmupCompleted, iOnWarmupCompleted2);
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(LoanHomeActivity loanHomeActivity, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(loanHomeActivity, obj);
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
    }

    public static /* synthetic */ deserializeIp IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder(function1, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        deserializeIp deserializeipAsBinder = asBinder(function1, obj);
        int i3 = IAuthTabCallbackStubProxy + 31;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return deserializeipAsBinder;
    }

    public static /* synthetic */ boolean IAuthTabCallbackDefault(LoanHomeActivity loanHomeActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback_Parcel(loanHomeActivity);
        }
        IAuthTabCallback_Parcel(loanHomeActivity);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(LoanHomeActivity loanHomeActivity) {
        int i = 2 % 2;
        int i2 = access100 + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {loanHomeActivity};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        if (i3 != 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(objArr, 863672823, iOnWarmupCompleted3, -863672822, iOnWarmupCompleted4, iOnWarmupCompleted, iOnWarmupCompleted2);
        int i4 = access100 + 73;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit asBinder(LoanHomeActivity loanHomeActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(loanHomeActivity);
        int i4 = IAuthTabCallbackStubProxy + 97;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return unitAccess000;
    }

    public static /* synthetic */ Unit asInterface(LoanHomeActivity loanHomeActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(loanHomeActivity);
        int i4 = access100 + 17;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unitExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(new Object[]{function1, obj}, 661930675, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -661930667, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        int i4 = IAuthTabCallbackStubProxy + 5;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LoanHomeActivity loanHomeActivity = (LoanHomeActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = access100 + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{loanHomeActivity, Boolean.valueOf(zBooleanValue)}, -554337373, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 554337377, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        int i4 = IAuthTabCallbackStubProxy + 13;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanHomeActivity loanHomeActivity) {
        int i = 2 % 2;
        int i2 = access100 + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{loanHomeActivity}, 547362955, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -547362949, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        int i4 = access100 + 45;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanHomeActivity loanHomeActivity) {
        int i = 2 % 2;
        int i2 = access100 + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit typedObject = readTypedObject(loanHomeActivity);
        int i4 = access100 + 89;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return typedObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanHomeActivity loanHomeActivity, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 59;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {loanHomeActivity, Integer.valueOf(i)};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        if (i4 != 0) {
            return (Unit) onExtraCallbackWithResult(objArr, -2074585893, iOnWarmupCompleted3, 2074585895, iOnWarmupCompleted4, iOnWarmupCompleted, iOnWarmupCompleted2);
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanHomeActivity loanHomeActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 47;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{loanHomeActivity, th}, 677963552, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -677963552, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        int i4 = IAuthTabCallbackStubProxy + 87;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanHomeActivity loanHomeActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanHomeActivity, iEngagementSignalsCallbackDefault);
        int i4 = access100 + 95;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanHomeActivity loanHomeActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStubProxy(loanHomeActivity);
        }
        IAuthTabCallbackStubProxy(loanHomeActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ deserializeIp onNavigationEvent(LoanHomeActivity loanHomeActivity, BaseApiResponse baseApiResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipIAuthTabCallback = IAuthTabCallback(loanHomeActivity, baseApiResponse);
        int i4 = access100 + 89;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return deserializeipIAuthTabCallback;
    }

    public static /* synthetic */ void onNavigationEvent(LoanHomeActivity loanHomeActivity, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(loanHomeActivity, obj);
        int i4 = IAuthTabCallbackStubProxy + 83;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        LoanHomeActivity loanHomeActivity = (LoanHomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return writeTypedObject(loanHomeActivity);
        }
        writeTypedObject(loanHomeActivity);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, LoanManagementWebFragment loanManagementWebFragment, LoanHomeExtensiveFragment loanHomeExtensiveFragment, LoanHomeActivity loanHomeActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Unit unit;
        int i3 = 2 % 2;
        int i4 = access100 + 101;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            unit = (Unit) onExtraCallbackWithResult(new Object[]{Integer.valueOf(i), loanManagementWebFragment, loanHomeExtensiveFragment, loanHomeActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, 127657235, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -127657228, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
            int i5 = 31 / 0;
        } else {
            unit = (Unit) onExtraCallbackWithResult(new Object[]{Integer.valueOf(i), loanManagementWebFragment, loanHomeExtensiveFragment, loanHomeActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, 127657235, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -127657228, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        }
        int i6 = IAuthTabCallbackStubProxy + 31;
        access100 = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanHomeActivity loanHomeActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 17;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsCallback(loanHomeActivity);
        }
        ICustomTabsCallback(loanHomeActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanHomeActivity loanHomeActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(loanHomeActivity, th);
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 83;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 63;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access100 + 103;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 85;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return -1L;
        }
        throw null;
    }

    public final enableOrientationOpt setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 67;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        enableOrientationOpt enableorientationopt = this.scoreDataSource;
        if (enableorientationopt != null) {
            int i5 = i2 + 45;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return enableorientationopt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = access100 + 73;
        IAuthTabCallbackStubProxy = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final mediationData onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 69;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        mediationData mediationdata = this.loanGatewayApis;
        if (mediationdata == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 89;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return mediationdata;
    }

    public final SessionTrackerb updateVisuals() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = access100 + 35;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final zzad IAuthTabCallback() {
        int i = 2 % 2;
        zzad zzadVar = this.injectedEnvironments;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = IAuthTabCallbackStubProxy + 71;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 47;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return zzadVar;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LoanHomeActivity loanHomeActivity = (LoanHomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (loanHomeActivity.injectedEnvironments == null) {
            auth.IAuthTabCallback(auth.onNavigationEvent, new IllegalStateException("environments accessed before injection: LoanHomeActivity"), (Map) null, 2, (Object) null);
            return zzaj.onNavigationEvent();
        }
        int i5 = i3 + 21;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return loanHomeActivity.IAuthTabCallback();
        }
        loanHomeActivity.IAuthTabCallback();
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(LoanHomeActivity loanHomeActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = access100 + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            loanHomeActivity.ICustomTabsService_Parcel();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        loanHomeActivity.ICustomTabsService_Parcel();
        Unit unit2 = Unit.INSTANCE;
        int i3 = access100 + 49;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private final boolean access200() {
        int i = 2 % 2;
        int i2 = access100 + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) this.onTransact.getValue();
        if (i3 == 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        throw null;
    }

    private static final boolean IAuthTabCallback_Parcel(LoanHomeActivity loanHomeActivity) {
        int i = 2 % 2;
        int i2 = access100 + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (!((zzad) onExtraCallbackWithResult(new Object[]{loanHomeActivity}, -704610750, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 704610753, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).onActivityLayout()) {
            if (!((zzad) onExtraCallbackWithResult(new Object[]{loanHomeActivity}, -704610750, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 704610753, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).RemoteActionCompatParcelizer()) {
                int i4 = access100 + 121;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr = {loanHomeActivity};
                int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
                int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
                int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
                int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
                if (i5 != 0) {
                    ((zzad) onExtraCallbackWithResult(objArr, -704610750, iOnWarmupCompleted3, 704610753, iOnWarmupCompleted4, iOnWarmupCompleted, iOnWarmupCompleted2)).MediaBrowserCompatMediaItem();
                    throw null;
                }
                if (!((zzad) onExtraCallbackWithResult(objArr, -704610750, iOnWarmupCompleted3, 704610753, iOnWarmupCompleted4, iOnWarmupCompleted, iOnWarmupCompleted2)).MediaBrowserCompatMediaItem()) {
                    return false;
                }
            }
        }
        int i6 = IAuthTabCallbackStubProxy + 121;
        access100 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 86 / 0;
        }
        return true;
    }

    public static final class onWarmupCompleted {
        private static final byte[] $$a = {119, -58, 7, 71};
        private static final int $$b = 168;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static char[] onWarmupCompleted = {5549, 21523, 38635, 53569, 4873, 24032, 40012, 56882};
        private static long onExtraCallback = 5217900886291164285L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(int i, short s, byte b) {
            int i2;
            int i3;
            int i4 = (s * 3) + 1;
            byte[] bArr = $$a;
            int i5 = b + 4;
            int i6 = (i * 3) + 97;
            byte[] bArr2 = new byte[i4];
            if (bArr == null) {
                i6 = i4;
                int i7 = i5;
                i3 = 0;
                i6 += -i5;
                i5 = i7;
                i2 = i3;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i6;
                if (i3 == i4) {
                    return new String(bArr2, 0);
                }
                int i8 = i5 + 1;
                i7 = i8;
                i5 = bArr[i8];
                i6 += -i5;
                i5 = i7;
                i2 = i3;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i6;
                if (i3 == i4) {
                }
            } else {
                i2 = 0;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i6;
                if (i3 == i4) {
                }
            }
        }

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull String str, boolean z, @Nullable Integer num) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) LoanHomeActivity.class);
            Object[] objArr = new Object[1];
            a((-1) - Process.getGidForName(""), 7 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (63500 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr);
            intent.putExtra(((String) objArr[0]).intern(), str);
            intent.putExtra("forceTabbed", z);
            if (num != null) {
                int i2 = IAuthTabCallback + 65;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                intent.putExtra("initialIndex", num.intValue());
            }
            int i4 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return intent;
            }
            throw null;
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = $11 + 53;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i >>> i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 59698), 17 - (ViewConfiguration.getFadingEdgeLength() >> 16), 10973 - TextUtils.getTrimmedLength(""), 919452672, false, "c", new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 46134), Color.rgb(0, 0, 0) + 16777247, View.resolveSizeAndState(0, 0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 44 - Color.argb(0, 0, 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 1494, -1657859959, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    try {
                        Object[] objArr5 = {Integer.valueOf(onWarmupCompleted[i + i6])};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 59697), View.MeasureSpec.getSize(0) + 17, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                        }
                        try {
                            Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                            if (objOnExtraCallback5 == null) {
                                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 46134), ExpandableListView.getPackedPositionGroup(0L) + 31, KeyEvent.keyCodeFromString("") + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                            try {
                                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                                if (objOnExtraCallback6 == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = b3;
                                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49122), 44 - (Process.myPid() >> 22), 1495 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1657859959, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objOnExtraCallback6).invoke(null, objArr7);
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
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 == null) {
                            throw th4;
                        }
                        throw cause4;
                    }
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback7 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - ImageFormat.getBitsPerPixel(0)), 45 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 1494, -1657859959, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
            }
            String str = new String(cArr);
            int i7 = $10 + 107;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            objArr[0] = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b4  */
    @Override // im.toss.features.loan.home.Hilt_LoanHomeActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i;
        int i2 = 2 % 2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String str = "";
        Object[] objArr = new Object[1];
        a((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 19, new char[]{44544, 24234, 44329, 50273, 15256, 2589, 4723, 37951}, new char[]{0, 0, 0, 0}, new char[]{677, 3857, 6636, 61258}, objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        if (stringExtra == null) {
            int i3 = IAuthTabCallbackStubProxy + 25;
            access100 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str = stringExtra;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("forceTabbed", false);
        Integer numValueOf = getIntent().hasExtra("initialIndex") ^ true ? null : Integer.valueOf(getIntent().getIntExtra("initialIndex", 0));
        if (numValueOf != null) {
            int i5 = IAuthTabCallbackStubProxy + 47;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            if (numValueOf.intValue() != 1) {
                int i7 = access100 + 13;
                IAuthTabCallbackStubProxy = i7 % 128;
                i = i7 % 2 != 0 ? 1 : 0;
            }
        }
        LoanManagementWebFragment loanManagementWebFragmentIAuthTabCallback = LoanManagementWebFragment.onWarmupCompleted.IAuthTabCallback(LoanManagementWebFragment.Companion, str, setEngagementSignalsCallback().IAuthTabCallback(enableNebulaServiceInitOpt.NICE), i ^ 1, (String) null, 8, (Object) null);
        LoanHomeExtensiveFragment loanHomeExtensiveFragmentOnNavigationEvent = LoanHomeExtensiveFragment.IAuthTabCallback.onNavigationEvent(LoanHomeExtensiveFragment.Companion, (String) null, (String) null, (String) null, false, false, 31, (Object) null);
        Object[] objArr2 = new Object[1];
        a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022958).substring(8, 9).length() - 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022837).substring(0, 7).length() - 7, new char[]{44544, 24234, 44329, 50273, 15256, 2589, 4723, 37951}, new char[]{0, 0, 0, 0}, new char[]{677, 3857, 6636, 61258}, objArr2);
        loanHomeExtensiveFragmentOnNavigationEvent.setArguments(RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str), getWrite.IAuthTabCallback("service_referrer", str), getWrite.IAuthTabCallback("fromLoanActivity", Boolean.FALSE), getWrite.IAuthTabCallback("forceTabbed", Boolean.valueOf(booleanExtra)), getWrite.IAuthTabCallback("tossBankEntryVisible", Boolean.valueOf(booleanExtra))}));
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-2128666409, true, new LoanHomeActivity$.ExternalSyntheticLambda1(i, loanManagementWebFragmentIAuthTabCallback, loanHomeExtensiveFragmentOnNavigationEvent, this))), 1, (Object) null);
    }

    private static final Unit IAuthTabCallbackStubProxy(LoanHomeActivity loanHomeActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        loanHomeActivity.writeTypedList();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i3 = $10 + 41;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 43, Drawable.resolveOpacity(0, 0) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - ExpandableListView.getPackedPositionGroup(0L)), KeyEvent.keyCodeFromString("") + 44, 1494 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 23972), 50 - KeyEvent.normalizeMetaState(0), Color.alpha(0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 45848), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 28, 12577 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (asBinder ^ 7798559133331975163L)) ^ ((int) (asInterface ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback_Parcel ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i5 = $10 + 43;
                $11 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static final Unit onNavigationEvent(int i, LoanManagementWebFragment loanManagementWebFragment, LoanHomeExtensiveFragment loanHomeExtensiveFragment, LoanHomeActivity loanHomeActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        int i4 = access100 + 117;
        int i5 = i4 % 128;
        IAuthTabCallbackStubProxy = i5;
        if (i4 % 2 == 0 ? (i2 & 3) == 2 : (i2 & 3) == 5) {
            int i6 = i5 + 101;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        } else {
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i8 = IAuthTabCallbackStubProxy + 73;
            access100 = i8 % 128;
            int i9 = i8 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2128666409, i2, -1, "im.toss.features.loan.home.LoanHomeActivity.onCreate.<anonymous> (LoanHomeActivity.kt:117)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(519802415, true, new LoanHomeActivity$.ExternalSyntheticLambda0(i, loanManagementWebFragment, loanHomeExtensiveFragment, loanHomeActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private final void writeTypedList() {
        int i = 2 % 2;
        Object[] objArr = {this, new LoanHomeActivity$.ExternalSyntheticLambda2(this), new LoanHomeActivity$.ExternalSyntheticLambda3(this), new LoanHomeActivity$.ExternalSyntheticLambda4(this), new LoanHomeActivity$.ExternalSyntheticLambda5(this), new LoanHomeActivity$.ExternalSyntheticLambda6(this), new LoanHomeActivity$.ExternalSyntheticLambda7(this), new LoanHomeActivity$.ExternalSyntheticLambda8(this), new LoanHomeActivity$.ExternalSyntheticLambda9(this), new LoanHomeActivity$.ExternalSyntheticLambda10(this), new LoanHomeActivity$.ExternalSyntheticLambda11(this)};
        int iOnExtraCallback = matches.onExtraCallback();
        ResourceUtils1.onExtraCallbackWithResult(matches.onExtraCallback(), matches.onExtraCallback(), iOnExtraCallback, 581910882, matches.onExtraCallback(), -581910881, objArr);
        int i2 = access100 + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit access000(LoanHomeActivity loanHomeActivity) {
        int i = 2 % 2;
        int i2 = access100 + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        loanHomeActivity.ICustomTabsServiceStub();
        loanHomeActivity.ICustomTabsService_Parcel();
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 19;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return unit;
    }

    private static final Unit access100(LoanHomeActivity loanHomeActivity) {
        int i = 2 % 2;
        int i2 = access100 + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        loanHomeActivity.ICustomTabsServiceStubProxy();
        loanHomeActivity.ICustomTabsService_Parcel();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 1;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit extraCallbackWithResult(LoanHomeActivity loanHomeActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onJsBridgeReady.onNavigationEvent(loanHomeActivity, "초기화 완료", 0, 2, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 15;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context, im.toss.features.loan.home.LoanHomeActivity] */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        ?? r2 = (LoanHomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerbUpdateVisuals = r2.updateVisuals();
        Object[] objArr2 = new Object[1];
        a((char) (TextUtils.lastIndexOf("", '0') + 1), (-1726789691) - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{45286, 16668, 2198, 42379, 50150, 27892, 36859, 62959, 62292, 23751, 1514, 8737, 7267, 49921, 51859, 7425, 45917, 11233, 31935, 16344, 38632, 59385, 24932, 46044, 26711}, new char[]{0, 0, 0, 0}, new char[]{50826, 4935, 7321, 39120}, objArr2);
        SessionTrackerb.onNavigationEvent(sessionTrackerbUpdateVisuals, (Context) r2, ((String) objArr2[0]).intern(), ((LoanHomeActivity) r2).IAuthTabCallbackStub, (Bundle) null, 8, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 103;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit writeTypedObject(LoanHomeActivity loanHomeActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerbUpdateVisuals = loanHomeActivity.updateVisuals();
        Object[] objArr = new Object[1];
        a((char) (25620 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), ViewConfiguration.getLongPressTimeout() >> 16, new char[]{51401, 37790, 29290, 52566, 40360, 173, 37224, 50612, 19764, 33345, 23060, 56888, 34984, 27740, 24017, 54356, 21835, 49306, 9394, 951, 27048, 36243, 24938, 35333, 29431, 2444, 10778, 23527}, new char[]{0, 0, 0, 0}, new char[]{9155, 33882, 5308, 45156}, objArr);
        SessionTrackerb.onNavigationEvent(sessionTrackerbUpdateVisuals, loanHomeActivity, ((String) objArr[0]).intern(), loanHomeActivity.IAuthTabCallbackStub, (Bundle) null, 8, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 69;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit readTypedObject(LoanHomeActivity loanHomeActivity) {
        int i = 2 % 2;
        loanHomeActivity.startActivity(new Intent((Context) loanHomeActivity, (Class<?>) LoanFunnelForceSettingsActivity.class));
        Unit unit = Unit.INSTANCE;
        int i2 = access100 + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str;
        BaseActivity baseActivity = (LoanHomeActivity) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        if (((Boolean) objArr[1]).booleanValue()) {
            int i2 = IAuthTabCallbackStubProxy + 11;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str = "설정됨";
        } else {
            int i3 = access100 + 87;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            str = "해제됨";
        }
        onJsBridgeReady.onNavigationEvent(baseActivity, "가심사 23시 55분 퍼널 강제 " + str, 0, 2, (Object) null);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i = 2 % 2;
        onJsBridgeReady.onNavigationEvent((LoanHomeActivity) objArr[0], "올 거절 자동차 배너/페이지 노출 횟수 " + ((Number) objArr[1]).intValue() + "(으)로 설정됨", 0, 2, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = access100 + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit ICustomTabsCallback(LoanHomeActivity loanHomeActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("PREF_LOAN_COMPARE_LOAN_ANIMATION_SHOWN_DATE");
            onJsBridgeReady.onNavigationEvent(loanHomeActivity, "대출홈 애니메이션 초기화 완료. 대출홈 재진입하세요.", 1, 3, (Object) null);
        } else {
            addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("PREF_LOAN_COMPARE_LOAN_ANIMATION_SHOWN_DATE");
            onJsBridgeReady.onNavigationEvent(loanHomeActivity, "대출홈 애니메이션 초기화 완료. 대출홈 재진입하세요.", 0, 2, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 65;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 22 / 0;
        }
        return unit;
    }

    private final void ICustomTabsService_Parcel() {
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(null), 3, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 81;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 42 / 0;
            } else {
                objInvokeSuspend = onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onNavigationEvent + 21;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = LoanHomeActivity.this.new onNavigationEvent(access13800Var);
            int i2 = onNavigationEvent + 57;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 35;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 107;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i4 = onNavigationEvent + 15;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                getHostnameVerifierokhttp.onNavigationEvent(LoanHomeActivity.this, (String) null, 1, (Object) null);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(1000L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            LoanHomeActivity.this.bo_();
            LoanHomeActivity.this.recreate();
            return Unit.INSTANCE;
        }
    }

    private static final deserializeIp IAuthTabCallback(LoanHomeActivity loanHomeActivity, BaseApiResponse baseApiResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseApiResponse, "");
        writeRaw writerawOnWarmupCompleted = loanHomeActivity.onNavigationEvent().onWarmupCompleted(ImagePipelineExperimentsBuilderExternalSyntheticLambda17.REFINANCING);
        int i4 = IAuthTabCallbackStubProxy + 79;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return writerawOnWarmupCompleted;
    }

    private static final deserializeIp asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 51;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return deserializeip;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onWarmupCompleted(LoanHomeActivity loanHomeActivity, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            loanHomeActivity.dismissLoadingIndicator();
            onJsBridgeReady.onNavigationEvent(loanHomeActivity, loanHomeActivity.getString(R.string.loan_home___f6fe874134), 1, 4, (Object) null);
        } else {
            loanHomeActivity.dismissLoadingIndicator();
            onJsBridgeReady.onNavigationEvent(loanHomeActivity, loanHomeActivity.getString(R.string.loan_home___f6fe874134), 0, 2, (Object) null);
        }
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        BaseActivity baseActivity = (LoanHomeActivity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        baseActivity.dismissLoadingIndicator();
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, baseActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 17;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void ICustomTabsServiceStub() {
        int i = 2 % 2;
        addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("pref_load_loan_apply");
        Object obj = null;
        BaseActivity.IAuthTabCallback(this, (String) null, false, 3, (Object) null);
        writeRaw writerawOnExtraCallbackWithResult = onNavigationEvent().onWarmupCompleted(ImagePipelineExperimentsBuilderExternalSyntheticLambda17.CREDIT).onExtraCallbackWithResult(new LoanHomeActivity$.ExternalSyntheticLambda15(new LoanHomeActivity$.ExternalSyntheticLambda14(this)));
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(new onExtraCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(new LoanHomeActivity$.ExternalSyntheticLambda16(this), new LoanHomeActivity$.ExternalSyntheticLambda18(new LoanHomeActivity$.ExternalSyntheticLambda17(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
        int i2 = IAuthTabCallbackStubProxy + 33;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallbackWithResult(LoanHomeActivity loanHomeActivity, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            loanHomeActivity.dismissLoadingIndicator();
            onJsBridgeReady.onNavigationEvent(loanHomeActivity, "사업자 대환 대출 상태 초기화 완료", 1, 3, (Object) null);
        } else {
            loanHomeActivity.dismissLoadingIndicator();
            onJsBridgeReady.onNavigationEvent(loanHomeActivity, "사업자 대환 대출 상태 초기화 완료", 0, 2, (Object) null);
        }
        int i3 = IAuthTabCallbackStubProxy + 85;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    private final void ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        BaseActivity.IAuthTabCallback(this, (String) null, false, 3, (Object) null);
        writeRaw writerawOnWarmupCompleted = onNavigationEvent().onWarmupCompleted(ImagePipelineExperimentsBuilderExternalSyntheticLambda17.BUSINESS_REFINANCING);
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new IAuthTabCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(new LoanHomeActivity$.ExternalSyntheticLambda21(this), new LoanHomeActivity$.ExternalSyntheticLambda23(new LoanHomeActivity$.ExternalSyntheticLambda22(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
        int i2 = access100 + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(LoanHomeActivity loanHomeActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        loanHomeActivity.dismissLoadingIndicator();
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, loanHomeActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i5);
        int i9 = ~i;
        int i10 = ~i5;
        int i11 = i8 | (~(i9 | i10 | i3));
        int i12 = (~(i5 | i9 | i3)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i + i3 + i6 + (762713021 * i2) + (1579510587 * i4);
        int i15 = i14 * i14;
        int i16 = ((i * (-1846875272)) - 1480523776) + ((-1846875272) * i3) + (i11 * (-1613556599)) + (i12 * (-1613556599)) + ((-1613556599) * i13) + (834535424 * i6) + ((-750387200) * i2) + ((-523632640) * i4) + ((-1971257344) * i15);
        int i17 = ((i * (-1364308824)) - 1074288667) + (i3 * (-1364308824)) + (i11 * 659) + (i12 * 659) + (i13 * 659) + ((-1364308165) * i6) + ((-893132913) * i2) + (986770329 * i4) + (i15 * (-1162149888));
        boolean z = false;
        switch (i16 + (i17 * i17 * (-1529413632))) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                int i18 = 2 % 2;
                onJsBridgeReady.onNavigationEvent((LoanHomeActivity) objArr[0], "자동차 배너 노출 횟수 " + ((Number) objArr[1]).intValue() + "(으)로 설정됨", 0, 2, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i19 = access100 + 75;
                IAuthTabCallbackStubProxy = i19 % 128;
                int i20 = i19 % 2;
                return unit;
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                LoanHomeActivity loanHomeActivity = (LoanHomeActivity) objArr[0];
                int i21 = 2 % 2;
                int i22 = IAuthTabCallbackStubProxy + 5;
                access100 = i22 % 128;
                int i23 = i22 % 2;
                loanHomeActivity.finish();
                Unit unit2 = Unit.INSTANCE;
                int i24 = access100 + 49;
                IAuthTabCallbackStubProxy = i24 % 128;
                int i25 = i24 % 2;
                return unit2;
            case 7:
                int iIntValue = ((Number) objArr[0]).intValue();
                LoanManagementWebFragment loanManagementWebFragment = (LoanManagementWebFragment) objArr[1];
                LoanHomeExtensiveFragment loanHomeExtensiveFragment = (LoanHomeExtensiveFragment) objArr[2];
                LoanHomeActivity loanHomeActivity2 = (LoanHomeActivity) objArr[3];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
                int iIntValue2 = ((Number) objArr[5]).intValue();
                int i26 = 2 % 2;
                if ((iIntValue2 & 3) != 2) {
                    int i27 = access100 + 53;
                    IAuthTabCallbackStubProxy = i27 % 128;
                    int i28 = i27 % 2;
                    z = true;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue2 & 1)) {
                    int i29 = IAuthTabCallbackStubProxy + 23;
                    access100 = i29 % 128;
                    int i30 = i29 % 2;
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        int i31 = access100 + 75;
                        IAuthTabCallbackStubProxy = i31 % 128;
                        int i32 = i31 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(519802415, iIntValue2, -1, "im.toss.features.loan.home.LoanHomeActivity.onCreate.<anonymous>.<anonymous> (LoanHomeActivity.kt:118)");
                    }
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(loanHomeActivity2);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnExtraCallback) {
                        Object obj = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            LoanHomeActivity$.ExternalSyntheticLambda19 externalSyntheticLambda19 = new LoanHomeActivity$.ExternalSyntheticLambda19(loanHomeActivity2);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda19);
                            int i33 = IAuthTabCallbackStubProxy + 45;
                            access100 = i33 % 128;
                            obj = externalSyntheticLambda19;
                            if (i33 % 2 == 0) {
                                int i34 = 2 / 2;
                                obj = externalSyntheticLambda19;
                            }
                        }
                        Function0 function0 = (Function0) obj;
                        boolean zAccess200 = loanHomeActivity2.access200();
                        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(loanHomeActivity2);
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!zOnExtraCallback2) {
                            Object obj2 = objOnMinimized2;
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                LoanHomeActivity$.ExternalSyntheticLambda20 externalSyntheticLambda20 = new LoanHomeActivity$.ExternalSyntheticLambda20(loanHomeActivity2);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda20);
                                obj2 = externalSyntheticLambda20;
                            }
                            Object[] objArr2 = {Integer.valueOf(iIntValue), loanManagementWebFragment, loanHomeExtensiveFragment, function0, Boolean.valueOf(zAccess200), (Function0) obj2, cameraCaptureResultEmptyCameraCaptureResult, 0, 0};
                            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                            getRuntimeAppId.onNavigationEvent(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 849102429, iOnWarmupCompleted, -849102428, objArr2);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                int i35 = IAuthTabCallbackStubProxy + 29;
                                access100 = i35 % 128;
                                int i36 = i35 % 2;
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                    int i37 = access100 + 41;
                    IAuthTabCallbackStubProxy = i37 % 128;
                    int i38 = i37 % 2;
                }
                return Unit.INSTANCE;
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return onTransact(objArr);
            case 10:
                return asInterface(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(LoanHomeActivity loanHomeActivity, boolean z) {
        return (Unit) onExtraCallbackWithResult(new Object[]{loanHomeActivity, Boolean.valueOf(z)}, 1125656216, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1125656211, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onTransact(LoanHomeActivity loanHomeActivity) {
        return (Unit) onExtraCallbackWithResult(new Object[]{loanHomeActivity}, 1364404212, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1364404203, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private static final Unit IAuthTabCallback(LoanHomeActivity loanHomeActivity, Throwable th) {
        return (Unit) onExtraCallbackWithResult(new Object[]{loanHomeActivity, th}, 677963552, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -677963552, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private final zzad validateRelationship() {
        return (zzad) onExtraCallbackWithResult(new Object[]{this}, -704610750, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 704610753, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private static final Unit onExtraCallback(int i, LoanManagementWebFragment loanManagementWebFragment, LoanHomeExtensiveFragment loanHomeExtensiveFragment, LoanHomeActivity loanHomeActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onExtraCallbackWithResult(new Object[]{Integer.valueOf(i), loanManagementWebFragment, loanHomeExtensiveFragment, loanHomeActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, 127657235, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -127657228, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private static final Unit getInterfaceDescriptor(LoanHomeActivity loanHomeActivity) {
        return (Unit) onExtraCallbackWithResult(new Object[]{loanHomeActivity}, 547362955, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -547362949, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        onExtraCallbackWithResult(new Object[]{function1, obj}, 661930675, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -661930667, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private static final Unit extraCallback(LoanHomeActivity loanHomeActivity) {
        return (Unit) onExtraCallbackWithResult(new Object[]{loanHomeActivity}, 863672823, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -863672822, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private static final Unit IAuthTabCallback(LoanHomeActivity loanHomeActivity, boolean z) {
        return (Unit) onExtraCallbackWithResult(new Object[]{loanHomeActivity, Boolean.valueOf(z)}, -554337373, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 554337377, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private static final Unit onNavigationEvent(LoanHomeActivity loanHomeActivity, int i) {
        return (Unit) onExtraCallbackWithResult(new Object[]{loanHomeActivity, Integer.valueOf(i)}, 138078444, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -138078434, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private static final Unit onExtraCallback(LoanHomeActivity loanHomeActivity, int i) {
        return (Unit) onExtraCallbackWithResult(new Object[]{loanHomeActivity, Integer.valueOf(i)}, -2074585893, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 2074585895, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    @Override // im.toss.features.loan.home.Hilt_LoanHomeActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
    }

    @Override // im.toss.features.loan.home.Hilt_LoanHomeActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.features.loan.home.Hilt_LoanHomeActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access100 + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = access100 + 87;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.features.loan.home.Hilt_LoanHomeActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
    }

    static void ICustomTabsServiceDefault() {
        asBinder = 7798559133331975163L;
        asInterface = -1776194565;
        IAuthTabCallback_Parcel = (char) 14494;
    }
}
