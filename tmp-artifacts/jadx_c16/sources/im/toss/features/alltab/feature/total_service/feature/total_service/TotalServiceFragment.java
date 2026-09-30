package im.toss.features.alltab.feature.total_service.feature.total_service;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import com.otaliastudios.cameraview.R$styleable;
import im.toss.base.BaseActivity;
import im.toss.base.BaseLauncherWrapperActivity;
import im.toss.core.referrer.ReferrerProvider;
import im.toss.define.TossAffiliate;
import im.toss.features.alltab.feature.total_service.feature.common.random_miniapp.RandomMiniAppLaunchpadLogState;
import im.toss.features.alltab.feature.total_service.feature.common.random_miniapp.RandomMiniAppRecommendationState;
import im.toss.features.alltab.feature.total_service.feature.total_service.TotalServiceFragment$;
import im.toss.features.alltab.feature.total_service.feature.total_service.ui.next.TotalServiceNextViewModel;
import im.toss.features.home.core.local.model.TransactionFilterLocal;
import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.features.tns.library.R;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import im.toss.uikit.widget.tooltip.TdsHighlightV3View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CloseableUtils;
import o.DERSet;
import o.DERString;
import o.ExtensionsManager1;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.ForwardingCameraControl;
import o.MaxRecyclerAdaptera;
import o.NavigationBar;
import o.NavigationBarCapsuleTheme;
import o.NetConverter3;
import o.RVWebSocketManagerHolder;
import o.SessionTrackerb;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import o.TitleBar;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.ZslRingBuffer;
import o.access13800;
import o.access14300;
import o.access5300;
import o.access8100;
import o.accessgetCameraFactoryp;
import o.addAttrToClient;
import o.addFixedPosition;
import o.c4a;
import o.changeTabBarStyle;
import o.closeAllSocket;
import o.convertAnyToMap;
import o.deserializeUriNullableCollection;
import o.enableTranslucentStatusBar;
import o.filterCreatePageParams;
import o.findResAndMsg;
import o.formatMsgs;
import o.fromARGBInt;
import o.generateTabBarItemColorScheme;
import o.getBackButtonBoundingClientRect;
import o.getBackButtonVisibility;
import o.getBorderRadius;
import o.getCustomViewProxy;
import o.getErrMsg;
import o.getHomeButtonBoundingClientRectAsync;
import o.getHomeButtonVisibility;
import o.getIconPaddingLeft;
import o.getImageTitle;
import o.getIndexByTag;
import o.getLaunchParams;
import o.getLeftCloseButtonVisibility;
import o.getNetwork;
import o.getShine;
import o.getSupportedHighSpeedResolutionsFor;
import o.getTabBarItemAt;
import o.getTabBarItemColorModel;
import o.getUrl;
import o.getWrite;
import o.initColorModels;
import o.isAlphaBackground;
import o.isDisplay;
import o.isEnableTabClick;
import o.isPreload;
import o.isReverse;
import o.isShowing;
import o.leftCloseButtonShown;
import o.maybeUpdateAnimatable;
import o.onCapsuleReady;
import o.onFailed;
import o.onStopped;
import o.sendMsgToServerByApp;
import o.setActiveIcon;
import o.setAdVideoPlaybackListener;
import o.setBitmapDecoderClass;
import o.setButtonText;
import o.setButtonTextVisibility;
import o.setCommandLine;
import o.setDisableOnInit;
import o.setDisplay;
import o.setEnableTabClick;
import o.setForeground;
import o.setLaunchParamsTag;
import o.setLogBuffers;
import o.setName;
import o.setPostviewFormatSelector;
import o.setRandomHost;
import o.setRevision;
import o.setRubIn;
import o.setSelectedPage;
import o.setTabBarBadge;
import o.setTabItem;
import o.setUrl;
import o.showBackButton;
import o.showDefaultTab;
import o.y2;
import o.y4;
import o.y6;
import o.zzbc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.StatusManager;

@DERString(onExtraCallback = {TossAffiliate.CORE, TossAffiliate.BANK})
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class TotalServiceFragment extends Hilt_TotalServiceFragment implements StatusManager.onExtraCallback, ReferrerProvider, setButtonTextVisibility {
    public static final onNavigationEvent Companion;
    private static int ICustomTabsCallback;
    private static int ICustomTabsCallbackStubProxy;
    private static int extraCallback;
    private static long extraCallbackWithResult;
    private static int onActivityResized;
    public static final int onExtraCallback;
    private static short[] onMessageChannelReady;
    private static byte[] onPostMessage;
    private long IAuthTabCallback;
    private final setUrl IAuthTabCallbackDefault;
    private final Lazy IAuthTabCallbackStub;
    private final List<sendMsgToServerByApp> IAuthTabCallbackStubProxy;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallback_Parcel;
    private final getBorderRadius<Unit> access000;
    private final Lazy access100;
    private final Lazy asBinder;
    private final isDisplay<onFailed> asInterface;
    private String getInterfaceDescriptor;
    private final setTabBarBadge onExtraCallbackWithResult;
    private final setEnableTabClick onNavigationEvent;
    private final leftCloseButtonShown onTransact;
    private boolean onWarmupCompleted;
    private final getTabBarItemAt readTypedObject;

    @Inject
    public SessionTrackerb router;
    private final Lazy writeTypedObject;
    private static final byte[] $$a = {102, 29, -34, 39};
    private static final int $$b = 34;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onUnminimized = 0;
    private static int onActivityLayout = 0;
    private static int onMinimized = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i) {
        int i2;
        int i3;
        int i4 = (s * 3) + 4;
        int i5 = (i * 2) + 115;
        byte[] bArr = $$a;
        int i6 = s2 * 4;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            i3 = i4;
            int i7 = i6;
            int i8 = 0;
            i4 += -i7;
            i3++;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i3];
            i4 += -i7;
            i3++;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i4;
            i4 = i5;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    static {
        ICustomTabsCallbackStubProxy = 1;
        IAuthTabCallbackStub();
        Object obj = null;
        Companion = new onNavigationEvent((DefaultConstructorMarker) null);
        onExtraCallback = 8;
        int i = onUnminimized + 15;
        ICustomTabsCallbackStubProxy = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ View IAuthTabCallback(TotalServiceFragment totalServiceFragment) {
        int i = 2 % 2;
        int i2 = onMinimized + 95;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            return (View) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{totalServiceFragment}, -184232990, 184233008, iOnExtraCallback3, iOnExtraCallback);
        }
        int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback5 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback6 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i3;
        int i8 = ~(i7 | i4);
        int i9 = ~i6;
        int i10 = ~(i9 | i4);
        int i11 = i8 | i10;
        int i12 = ~i4;
        int i13 = ~(i12 | i3);
        int i14 = (~(i6 | i7)) | i13 | i10;
        int i15 = (~(i9 | i3)) | (~(i12 | i9)) | i13;
        int i16 = i4 + i3 + i2 + ((-954185507) * i5) + (2055044340 * i);
        int i17 = i16 * i16;
        int i18 = ((1110557339 * i4) - 760807424) + ((-878567756) * i3) + ((-1537228134) * i11) + (i14 * 768614067) + (768614067 * i15) + ((-1647181824) * i2) + (1313472512 * i5) + (606601216 * i) + ((-1232666624) * i17);
        int i19 = (i4 * 1290134917) + 267690129 + (i3 * 1290136780) + (i11 * (-1242)) + (i14 * 621) + (i15 * 621) + (i2 * 1290136159) + (i5 * 826674179) + (i * 1594648204) + (i17 * 572063744);
        switch (i18 + (i19 * i19 * 607715328)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return asInterface(objArr);
            case 10:
                return access100(objArr);
            case 11:
                return getInterfaceDescriptor(objArr);
            case 12:
                return IAuthTabCallback_Parcel(objArr);
            case 13:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                return access000(objArr);
            case 15:
                return extraCallbackWithResult(objArr);
            case 16:
                return extraCallback(objArr);
            case 17:
                return ICustomTabsCallback(objArr);
            case 18:
                return readTypedObject(objArr);
            case 19:
                return writeTypedObject(objArr);
            case 20:
                return onActivityLayout(objArr);
            case 21:
                return onMinimized(objArr);
            case 22:
                return onActivityResized(objArr);
            case 23:
                return onPostMessage(objArr);
            case 24:
                return onMessageChannelReady(objArr);
            case 25:
                TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
                String str = (String) objArr[1];
                int i20 = 2 % 2;
                int i21 = onMinimized + 7;
                onActivityLayout = i21 % 128;
                int i22 = i21 % 2;
                SessionTrackerb.onExtraCallbackWithResult(totalServiceFragment.asInterface(), totalServiceFragment.getContext(), str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i23 = onMinimized + 21;
                onActivityLayout = i23 % 128;
                int i24 = i23 % 2;
                return unit;
            case R$styleable.CameraView_cameraPictureMetering /* 26 */:
                return ICustomTabsCallbackStubProxy(objArr);
            case 27:
                TotalServiceFragment totalServiceFragment2 = (TotalServiceFragment) objArr[0];
                NavigationBarCapsuleTheme navigationBarCapsuleTheme = (NavigationBarCapsuleTheme) objArr[1];
                getNetwork getnetwork = (getNetwork) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                Object obj = objArr[4];
                int i25 = 2 % 2;
                int i26 = onMinimized;
                int i27 = i26 + 25;
                onActivityLayout = i27 % 128;
                int i28 = i27 % 2;
                if ((iIntValue & 2) != 0) {
                    int i29 = i26 + 81;
                    onActivityLayout = i29 % 128;
                    if (i29 % 2 != 0) {
                        int i30 = 3 % 2;
                    }
                    getnetwork = null;
                }
                totalServiceFragment2.onExtraCallbackWithResult(navigationBarCapsuleTheme, getnetwork);
                return null;
            case 28:
                return ICustomTabsCallbackDefault(objArr);
            case 29:
                Function1 function1 = (Function1) objArr[0];
                Object obj2 = objArr[1];
                int i31 = 2 % 2;
                int i32 = onMinimized + 43;
                onActivityLayout = i32 % 128;
                int i33 = i32 % 2;
                boolean zOnTransact = onTransact(function1, obj2);
                int i34 = onActivityLayout + 1;
                onMinimized = i34 % 128;
                int i35 = i34 % 2;
                return Boolean.valueOf(zOnTransact);
            case 30:
                return onUnminimized(objArr);
            case 31:
                return onRelationshipValidationResult(objArr);
            case 32:
                return ICustomTabsCallbackStub(objArr);
            case 33:
                TotalServiceFragment totalServiceFragment3 = (TotalServiceFragment) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i36 = 2 % 2;
                int i37 = onMinimized + 11;
                onActivityLayout = i37 % 128;
                int i38 = i37 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(totalServiceFragment3, jLongValue, zBooleanValue);
                int i39 = onActivityLayout + 13;
                onMinimized = i39 % 128;
                int i40 = i39 % 2;
                return unitOnExtraCallbackWithResult;
            case 34:
                return ICustomTabsCallback_Parcel(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 79;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        Unit unit = (Unit) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{totalServiceFragment, str}, -1926019517, 1926019526, iOnExtraCallback3, iOnExtraCallback);
        int i4 = onActivityLayout + 79;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 11;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        asInterface(function1, obj);
        int i4 = onActivityLayout + 49;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onMinimized + 97;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(totalServiceFragment, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        int i5 = onMinimized + 123;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 7;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        TitleBar titleBarExtraCallbackWithResult = extraCallbackWithResult(totalServiceFragment);
        int i4 = onActivityLayout + 21;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return titleBarExtraCallbackWithResult;
    }

    private static /* synthetic */ Object ICustomTabsCallback_Parcel(Object[] objArr) {
        getErrMsg geterrmsg = (getErrMsg) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityLayout + 91;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(geterrmsg);
        int i4 = onMinimized + 111;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zOnExtraCallback);
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        NavigationBarCapsuleTheme.onWarmupCompleted onwarmupcompleted = (NavigationBarCapsuleTheme.onWarmupCompleted) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = onActivityLayout + 117;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(totalServiceFragment, onwarmupcompleted, str);
        int i4 = onActivityLayout + 25;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zIAuthTabCallback);
    }

    public static /* synthetic */ Unit onExtraCallback(TotalServiceFragment totalServiceFragment) {
        int i = 2 % 2;
        int i2 = onMinimized + 93;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnPostMessage = onPostMessage(totalServiceFragment);
        int i4 = onActivityLayout + 63;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnPostMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(TotalServiceFragment totalServiceFragment, getErrMsg geterrmsg) {
        int i = 2 % 2;
        int i2 = onMinimized + 117;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(totalServiceFragment, geterrmsg);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(totalServiceFragment, geterrmsg);
        int i3 = onMinimized + 59;
        onActivityLayout = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 50 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(TotalServiceFragment totalServiceFragment, setName.IAuthTabCallback iAuthTabCallback) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 67;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(totalServiceFragment, iAuthTabCallback);
        int i4 = onMinimized + 87;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ ExtensionsManager1 onExtraCallback(TotalServiceFragment totalServiceFragment, long j) {
        int i = 2 % 2;
        int i2 = onMinimized + 117;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        ExtensionsManager1 extensionsManager1OnExtraCallbackWithResult = onExtraCallbackWithResult(totalServiceFragment, j);
        int i4 = onMinimized + 81;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return extensionsManager1OnExtraCallbackWithResult;
    }

    public static /* synthetic */ boolean onExtraCallback(TotalServiceFragment totalServiceFragment, setName.IAuthTabCallback iAuthTabCallback, String str) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 29;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(totalServiceFragment, iAuthTabCallback, str);
        int i4 = onActivityLayout + 23;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TotalServiceFragment totalServiceFragment, long j, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onMinimized + 15;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(totalServiceFragment, j, extensionsManager1);
        int i4 = onMinimized + 17;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TotalServiceFragment totalServiceFragment, String str) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onActivityLayout + 29;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            unit = (Unit) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{totalServiceFragment, str}, -1798117925, 1798117950, iOnExtraCallback3, iOnExtraCallback);
            int i3 = 31 / 0;
        } else {
            int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback5 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback6 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            unit = (Unit) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback5, new Object[]{totalServiceFragment, str}, -1798117925, 1798117950, iOnExtraCallback6, iOnExtraCallback4);
        }
        int i4 = onActivityLayout + 43;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ changeTabBarStyle onExtraCallbackWithResult(TotalServiceFragment totalServiceFragment) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 53;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        changeTabBarStyle changetabbarstyleOnMinimized = onMinimized(totalServiceFragment);
        int i4 = onActivityLayout + 75;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return changetabbarstyleOnMinimized;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 121;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(function1, obj);
        int i4 = onActivityLayout + 23;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(RVWebSocketManagerHolder rVWebSocketManagerHolder) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 99;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(rVWebSocketManagerHolder);
        int i4 = onMinimized + 23;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 31;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            return writeTypedObject(totalServiceFragment);
        }
        writeTypedObject(totalServiceFragment);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TotalServiceFragment totalServiceFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 29;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(totalServiceFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onActivityLayout + 27;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TotalServiceFragment totalServiceFragment, RVWebSocketManagerHolder rVWebSocketManagerHolder) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 67;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        Unit unit = (Unit) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{totalServiceFragment, rVWebSocketManagerHolder}, 617339146, -617339145, iOnExtraCallback3, iOnExtraCallback);
        int i4 = onActivityLayout + 85;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TotalServiceFragment totalServiceFragment, generateTabBarItemColorScheme generatetabbaritemcolorscheme) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 101;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(totalServiceFragment, generatetabbaritemcolorscheme);
        int i4 = onActivityLayout + 123;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TotalServiceFragment totalServiceFragment, setName.IAuthTabCallback iAuthTabCallback) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 57;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(totalServiceFragment, iAuthTabCallback);
        if (i3 == 0) {
            int i4 = 2 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 25;
        onActivityLayout = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            readTypedObject(totalServiceFragment);
            throw null;
        }
        Unit typedObject = readTypedObject(totalServiceFragment);
        int i3 = onActivityLayout + 33;
        onMinimized = i3 % 128;
        if (i3 % 2 != 0) {
            return typedObject;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 49;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(function1, obj);
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        getImageTitle getimagetitle = (getImageTitle) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onActivityLayout + 93;
        onMinimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(totalServiceFragment, getimagetitle, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(totalServiceFragment, getimagetitle, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onActivityLayout + 27;
        onMinimized = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(extraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 35;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(extraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - View.getDefaultSize(0, 0)), 84 - Color.alpha(0), 21234 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 14186), 19 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 73;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public static final class ICustomTabsService extends Lambda implements Function0<Fragment> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ICustomTabsService(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            Fragment fragmentOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                fragmentOnWarmupCompleted = onWarmupCompleted();
                int i3 = 21 / 0;
            } else {
                fragmentOnWarmupCompleted = onWarmupCompleted();
            }
            int i4 = onExtraCallbackWithResult + 51;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return fragmentOnWarmupCompleted;
            }
            throw null;
        }

        public final Fragment onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 89;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Fragment fragment = this.$this_viewModels;
            int i5 = i2 + 73;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return fragment;
        }
    }

    public static final class onRelationshipValidationResult extends Lambda implements Function0<Fragment> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onRelationshipValidationResult(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Fragment fragmentOnNavigationEvent = onNavigationEvent();
            int i4 = IAuthTabCallback + 47;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 8 / 0;
            }
            return fragmentOnNavigationEvent;
        }

        public final Fragment onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Fragment fragment = this.$this_viewModels;
            int i5 = i3 + 61;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return fragment;
        }
    }

    public TotalServiceFragment() {
        onRelationshipValidationResult onrelationshipvalidationresult = new onRelationshipValidationResult(this);
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.NONE;
        Lazy lazyOnNavigationEvent = LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new ICustomTabsCallbackDefault(onrelationshipvalidationresult));
        this.writeTypedObject = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(TotalServiceViewModel.class), new ICustomTabsCallbackStubProxy(lazyOnNavigationEvent), new ICustomTabsCallback_Parcel(null, lazyOnNavigationEvent), new mayLaunchUrl(this, lazyOnNavigationEvent));
        Lazy lazyOnNavigationEvent2 = LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new extraCommand(new ICustomTabsService(this)));
        this.IAuthTabCallbackStub = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(TotalServiceNextViewModel.class), new isEngagementSignalsApiAvailable(lazyOnNavigationEvent2), new postMessage(null, lazyOnNavigationEvent2), new onUnminimized(this, lazyOnNavigationEvent2));
        this.onExtraCallbackWithResult = new setTabBarBadge();
        this.asInterface = new isDisplay<>();
        this.asBinder = LazyKt.onExtraCallbackWithResult(new TotalServiceFragment$.ExternalSyntheticLambda21(this));
        this.access100 = LazyKt.onExtraCallbackWithResult(new TotalServiceFragment$.ExternalSyntheticLambda22(this));
        this.IAuthTabCallback_Parcel = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onNavigationEvent = new setEnableTabClick((setSelectedPage) null, (showDefaultTab) null, 3, (DefaultConstructorMarker) null);
        this.access000 = getShine.onWarmupCompleted(0, 1, (CloseableUtils) null, 5, (Object) null);
        this.IAuthTabCallbackStubProxy = new ArrayList();
        this.onWarmupCompleted = true;
        this.readTypedObject = new getTabBarItemAt();
        this.IAuthTabCallbackDefault = new setUrl();
        this.onTransact = new leftCloseButtonShown();
    }

    public static final /* synthetic */ void IAuthTabCallback(TotalServiceFragment totalServiceFragment, sendMsgToServerByApp sendmsgtoserverbyapp) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 83;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        totalServiceFragment.IAuthTabCallback(sendmsgtoserverbyapp);
        if (i3 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ TotalServiceNextViewModel IAuthTabCallbackStub(TotalServiceFragment totalServiceFragment) {
        int i = 2 % 2;
        int i2 = onMinimized + 25;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        TotalServiceNextViewModel totalServiceNextViewModelWriteTypedObject = totalServiceFragment.writeTypedObject();
        int i4 = onMinimized + 105;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return totalServiceNextViewModelWriteTypedObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ List IAuthTabCallbackStubProxy(TotalServiceFragment totalServiceFragment) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 53;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        List<sendMsgToServerByApp> list = totalServiceFragment.IAuthTabCallbackStubProxy;
        if (i3 != 0) {
            return list;
        }
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback_Parcel(TotalServiceFragment totalServiceFragment) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 107;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        totalServiceFragment.newSessionWithExtras();
        int i4 = onActivityLayout + 71;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
    }

    public static final /* synthetic */ void ICustomTabsCallback(TotalServiceFragment totalServiceFragment) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 125;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        totalServiceFragment.newSession();
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) throws Throwable {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityLayout + 79;
        onMinimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{totalServiceFragment}, 1929039885, -1929039879, iOnExtraCallback3, iOnExtraCallback);
            return null;
        }
        int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback5 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback6 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback5, new Object[]{totalServiceFragment}, 1929039885, -1929039879, iOnExtraCallback6, iOnExtraCallback4);
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean access100(TotalServiceFragment totalServiceFragment) {
        int i = 2 % 2;
        int i2 = onMinimized + 87;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnActivityLayout = totalServiceFragment.onActivityLayout();
        int i4 = onMinimized + 23;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return zOnActivityLayout;
    }

    public static final /* synthetic */ isDisplay asBinder(TotalServiceFragment totalServiceFragment) {
        int i = 2 % 2;
        int i2 = onMinimized + 115;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        isDisplay<onFailed> isdisplay = totalServiceFragment.asInterface;
        int i5 = i3 + 51;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            return isdisplay;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void asInterface(TotalServiceFragment totalServiceFragment) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 71;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        totalServiceFragment.extraCallbackWithResult();
        int i4 = onActivityLayout + 17;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ TotalServiceViewModel getInterfaceDescriptor(TotalServiceFragment totalServiceFragment) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 81;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        TotalServiceViewModel totalServiceViewModelOnPostMessage = totalServiceFragment.onPostMessage();
        int i4 = onMinimized + 75;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return totalServiceViewModelOnPostMessage;
    }

    public static final /* synthetic */ void onExtraCallback(TotalServiceFragment totalServiceFragment, generateTabBarItemColorScheme generatetabbaritemcolorscheme) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 75;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{totalServiceFragment, generatetabbaritemcolorscheme}, -378278865, 378278887, iOnExtraCallback3, iOnExtraCallback);
            return;
        }
        int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback5 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback6 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback5, new Object[]{totalServiceFragment, generatetabbaritemcolorscheme}, -378278865, 378278887, iOnExtraCallback6, iOnExtraCallback4);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onActivityLayout + 99;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        totalServiceFragment.onNavigationEvent(zBooleanValue);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(TotalServiceFragment totalServiceFragment, onFailed onfailed) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 37;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        totalServiceFragment.IAuthTabCallback(onfailed);
        int i4 = onMinimized + 115;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityLayout + 53;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        totalServiceFragment.IAuthTabCallback(str);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(TotalServiceFragment totalServiceFragment, Rect rect) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 29;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        totalServiceFragment.IAuthTabCallback(rect);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onActivityLayout + 1;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(TotalServiceFragment totalServiceFragment, onFailed onfailed) {
        int i = 2 % 2;
        int i2 = onMinimized + 123;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        totalServiceFragment.onNavigationEvent(onfailed);
        int i4 = onMinimized + 95;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityLayout + 55;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        totalServiceFragment.postMessage();
        if (i3 != 0) {
            return null;
        }
        int i4 = 54 / 0;
        return null;
    }

    public static final /* synthetic */ void onWarmupCompleted(TotalServiceFragment totalServiceFragment, String str) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 105;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        totalServiceFragment.onNavigationEvent(str);
        int i4 = onActivityLayout + 33;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(TotalServiceFragment totalServiceFragment, addAttrToClient addattrtoclient) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 121;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        totalServiceFragment.onWarmupCompleted(addattrtoclient);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(TotalServiceFragment totalServiceFragment, showBackButton showbackbutton) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 27;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        totalServiceFragment.onWarmupCompleted(showbackbutton);
        int i4 = onMinimized + 33;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class ICustomTabsCallbackDefault extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ICustomTabsCallbackDefault(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = onExtraCallbackWithResult + 79;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 75 / 0;
            }
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnExtraCallbackWithResult;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0 = (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
            int i4 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda0;
        }
    }

    public static final class extraCommand extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public extraCommand(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0 = (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
            if (i3 == 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0IAuthTabCallback = IAuthTabCallback();
            int i4 = onNavigationEvent + 3;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda0IAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class ICustomTabsCallbackStubProxy extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ICustomTabsCallbackStubProxy(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onNavigationEvent + 41;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult;
            }
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            if (i3 == 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent.getViewModelStore();
            }
            androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent.getViewModelStore();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class ICustomTabsCallback_Parcel extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ICustomTabsCallback_Parcel(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onExtraCallback + 11;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallbackWithResult() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 19;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null) {
                int i5 = i2 + 105;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                }
            }
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                int i7 = onExtraCallbackWithResult + 57;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
            } else {
                textFieldKeyInputExternalSyntheticLambda6 = null;
            }
            return textFieldKeyInputExternalSyntheticLambda6 != null ? textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
        }
    }

    public static final class isEngagementSignalsApiAvailable extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public isEngagementSignalsApiAvailable(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted();
                int i3 = 24 / 0;
            } else {
                androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted();
            }
            int i4 = onExtraCallback + 105;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
                obj.hashCode();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
            int i3 = onExtraCallback + 105;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return viewModelStore;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class mayLaunchUrl extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public mayLaunchUrl(Fragment fragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallback();
            }
            onExtraCallback();
            throw null;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallback() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory;
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
                TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6 = androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? (TextFieldKeyInputExternalSyntheticLambda6) androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent : null;
                if (textFieldKeyInputExternalSyntheticLambda6 == null || (defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory()) == null) {
                    ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
                    return defaultViewModelProviderFactory2;
                }
                int i3 = onExtraCallback + 27;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return defaultViewModelProviderFactory;
            }
            boolean z = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate) instanceof TextFieldKeyInputExternalSyntheticLambda6;
            throw null;
        }
    }

    public static final class onUnminimized extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onUnminimized(Fragment fragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = onNavigationEvent();
            int i4 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedOnNavigationEvent;
        }

        public final ViewModelProvider.onWarmupCompleted onNavigationEvent() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            int i = 2 % 2;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                int i2 = onNavigationEvent + 93;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
            } else {
                textFieldKeyInputExternalSyntheticLambda6 = null;
            }
            if (textFieldKeyInputExternalSyntheticLambda6 != null) {
                int i4 = onExtraCallbackWithResult + 121;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory();
                if (defaultViewModelProviderFactory != null) {
                    return defaultViewModelProviderFactory;
                }
            }
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
            return defaultViewModelProviderFactory2;
        }
    }

    public static final class postMessage extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public postMessage(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                onWarmupCompleted();
                throw null;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted = onWarmupCompleted();
            int i3 = onWarmupCompleted + 1;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted;
            }
            throw null;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onWarmupCompleted() {
            int i = 2 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null) {
                int i2 = onWarmupCompleted + 115;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    int i4 = onWarmupCompleted + 109;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                    }
                    textFieldKeyInputExternalSyntheticLambda6.hashCode();
                    throw null;
                }
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            textFieldKeyInputExternalSyntheticLambda6 = (androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) ^ true ? null : (TextFieldKeyInputExternalSyntheticLambda6) androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent;
            return textFieldKeyInputExternalSyntheticLambda6 != null ? textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
        }
    }

    private final boolean readTypedObject() {
        int i = 2 % 2;
        int i2 = onMinimized + 121;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Bundle arguments = getArguments();
        if (arguments == null) {
            return false;
        }
        boolean z = arguments.getBoolean("from_home_launcher");
        int i4 = onMinimized + 77;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final SessionTrackerb asInterface() {
        int i = 2 % 2;
        SessionTrackerb sessionTrackerb = this.router;
        Object obj = null;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = onActivityLayout + 43;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 65;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            return sessionTrackerb;
        }
        obj.hashCode();
        throw null;
    }

    private final TotalServiceViewModel onPostMessage() {
        int i = 2 % 2;
        int i2 = onMinimized + 77;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TotalServiceViewModel totalServiceViewModel = (TotalServiceViewModel) this.writeTypedObject.getValue();
        int i3 = onActivityLayout + 115;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        return totalServiceViewModel;
    }

    private final TotalServiceNextViewModel writeTypedObject() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 103;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        TotalServiceNextViewModel totalServiceNextViewModel = (TotalServiceNextViewModel) this.IAuthTabCallbackStub.getValue();
        int i4 = onActivityLayout + 33;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return totalServiceNextViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean onActivityLayout() {
        int i = 2 % 2;
        int i2 = onMinimized + 41;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsExperiment = writeTypedObject().IAuthTabCallbackDefault().isExperiment();
        int i4 = onActivityLayout + 95;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return zIsExperiment;
    }

    private final TitleBar extraCallback() {
        int i = 2 % 2;
        int i2 = onMinimized + 65;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        TitleBar titleBar = (TitleBar) this.asBinder.getValue();
        int i4 = onMinimized + 123;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return titleBar;
        }
        throw null;
    }

    static final /* synthetic */ class IAuthTabCallbackDefault extends FunctionReferenceImpl implements Function1<Long, Boolean> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        IAuthTabCallbackDefault(Object obj) {
            super(1, obj, TotalServiceViewModel.class, "hasPlayedNewInorganicIntro", "hasPlayedNewInorganicIntro(J)Z", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolOnWarmupCompleted = onWarmupCompleted(((Number) obj).longValue());
            int i4 = onWarmupCompleted + 61;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return boolOnWarmupCompleted;
            }
            throw null;
        }

        public final Boolean onWarmupCompleted(long j) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(TotalServiceViewModel) ((CallableReference) this).receiver, Long.valueOf(j)};
            Boolean boolValueOf = Boolean.valueOf(((Boolean) TotalServiceViewModel.onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 752855829, objArr, -752855816, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent())).booleanValue());
            int i4 = onWarmupCompleted + 77;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return boolValueOf;
            }
            throw null;
        }
    }

    private static final TitleBar extraCallbackWithResult(TotalServiceFragment totalServiceFragment) {
        int i = 2 % 2;
        TitleBar titleBar = new TitleBar(new IAuthTabCallbackDefault(totalServiceFragment.onPostMessage()), new TotalServiceFragment$.ExternalSyntheticLambda11(totalServiceFragment), new asBinder(totalServiceFragment.onPostMessage()), new TotalServiceFragment$.ExternalSyntheticLambda12(totalServiceFragment), new onTransact(totalServiceFragment), new TotalServiceFragment$.ExternalSyntheticLambda13(totalServiceFragment), new TotalServiceFragment$.ExternalSyntheticLambda14(totalServiceFragment));
        int i2 = onActivityLayout + 121;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        return titleBar;
    }

    private static final ExtensionsManager1 onExtraCallbackWithResult(TotalServiceFragment totalServiceFragment, long j) {
        long jOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onMinimized + 29;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            if (totalServiceFragment.onPostMessage().onNavigationEvent(j) == null) {
                jOnNavigationEvent = ExtensionsManager1.Companion.onNavigationEvent();
                int i3 = onMinimized + 77;
                onActivityLayout = i3 % 128;
                int i4 = i3 % 2;
            } else {
                jOnNavigationEvent = ExtensionsManager1.onWarmupCompleted((((Number) r4.onExtraCallbackWithResult()).intValue() << 32) | (((Number) r4.IAuthTabCallback()).intValue() & 4294967295L));
            }
            return ExtensionsManager1.onNavigationEvent(jOnNavigationEvent);
        }
        totalServiceFragment.onPostMessage().onNavigationEvent(j);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final /* synthetic */ class asBinder extends FunctionReferenceImpl implements Function1<Long, Unit> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        asBinder(Object obj) {
            super(1, obj, TotalServiceViewModel.class, "markNewInorganicIntroPlayed", "markNewInorganicIntroPlayed(J)V", 0);
        }

        public final void IAuthTabCallback(long j) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                ((TotalServiceViewModel) ((CallableReference) this).receiver).onWarmupCompleted(j);
                throw null;
            }
            ((TotalServiceViewModel) ((CallableReference) this).receiver).onWarmupCompleted(j);
            int i3 = onExtraCallbackWithResult + 79;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            Unit unit;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i2 % 128;
            Number number = (Number) obj;
            if (i2 % 2 != 0) {
                IAuthTabCallback(number.longValue());
                unit = Unit.INSTANCE;
                int i3 = 59 / 0;
            } else {
                IAuthTabCallback(number.longValue());
                unit = Unit.INSTANCE;
            }
            int i4 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    static final /* synthetic */ class onTransact extends FunctionReferenceImpl implements Function1<onFailed, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        onTransact(Object obj) {
            super(1, obj, TotalServiceFragment.class, "onNewInorganicRecommendationDismissed", "onNewInorganicRecommendationDismissed(Lim/toss/features/alltab/feature/total_service/feature/total_service/ui/recommendation/NewInorganicRecommendationOverlayPresentation;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((onFailed) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 95;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallbackWithResult(onFailed onfailed) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onfailed, "");
            TotalServiceFragment.onExtraCallbackWithResult((TotalServiceFragment) ((CallableReference) this).receiver, onfailed);
            int i4 = onNavigationEvent + 25;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 85 / 0;
            }
        }
    }

    private static final Unit IAuthTabCallback(TotalServiceFragment totalServiceFragment, long j, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 57;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        totalServiceFragment.onPostMessage().onNavigationEvent(j, (int) (extensionsManager1.onExtraCallbackWithResult() >> 32), (int) extensionsManager1.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityLayout + 125;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(TotalServiceFragment totalServiceFragment, setName.IAuthTabCallback iAuthTabCallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        totalServiceFragment.onWarmupCompleted((addAttrToClient) new addAttrToClient.asBinder(iAuthTabCallback, false));
        Unit unit = Unit.INSTANCE;
        int i2 = onMinimized + 87;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(TotalServiceFragment totalServiceFragment, setName.IAuthTabCallback iAuthTabCallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        totalServiceFragment.IAuthTabCallback((sendMsgToServerByApp) new sendMsgToServerByApp.onExtraCallback(iAuthTabCallback));
        Unit unit = Unit.INSTANCE;
        int i2 = onActivityLayout + 5;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final changeTabBarStyle onMinimized() {
        changeTabBarStyle changetabbarstyle;
        int i = 2 % 2;
        int i2 = onMinimized + 43;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            changetabbarstyle = (changeTabBarStyle) this.access100.getValue();
            int i3 = 2 / 0;
        } else {
            changetabbarstyle = (changeTabBarStyle) this.access100.getValue();
        }
        int i4 = onActivityLayout + 113;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return changetabbarstyle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final changeTabBarStyle onMinimized(TotalServiceFragment totalServiceFragment) {
        int i = 2 % 2;
        changeTabBarStyle changetabbarstyle = new changeTabBarStyle(totalServiceFragment.onPostMessage().access100(), new onMessageChannelReady(totalServiceFragment), new onActivityLayout(totalServiceFragment), new onMinimized(totalServiceFragment.onPostMessage()));
        int i2 = onActivityLayout + 47;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        return changetabbarstyle;
    }

    static final /* synthetic */ class onMessageChannelReady extends FunctionReferenceImpl implements Function1<String, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        onMessageChannelReady(Object obj) {
            super(1, obj, TotalServiceFragment.class, "onPlayAtTossOverlayImpression", "onPlayAtTossOverlayImpression(Ljava/lang/String;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((String) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 81 / 0;
            }
            return unit;
        }

        public final void onNavigationEvent(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                TotalServiceFragment.onWarmupCompleted((TotalServiceFragment) ((CallableReference) this).receiver, str);
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            TotalServiceFragment.onWarmupCompleted((TotalServiceFragment) ((CallableReference) this).receiver, str);
            int i3 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 96 / 0;
            }
        }
    }

    static final /* synthetic */ class onActivityLayout extends FunctionReferenceImpl implements Function1<String, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        onActivityLayout(Object obj) {
            super(1, obj, TotalServiceFragment.class, "onPlayAtTossOverlayCtaClick", "onPlayAtTossOverlayCtaClick(Ljava/lang/String;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((String) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 67;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallback(String str) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Object[] objArr = {(TotalServiceFragment) ((CallableReference) this).receiver, str};
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            TotalServiceFragment.IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, -1228126442, 1228126463, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback);
            int i4 = IAuthTabCallback + 15;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final /* synthetic */ class onMinimized extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        onMinimized(Object obj) {
            super(0, obj, TotalServiceViewModel.class, "dismissPlayAtTossOverlay", "dismissPlayAtTossOverlay()V", 0);
        }

        public /* synthetic */ Object invoke() {
            Unit unit;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult();
            if (i3 == 0) {
                unit = Unit.INSTANCE;
                int i4 = 99 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i5 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        public final void onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ((TotalServiceViewModel) ((CallableReference) this).receiver).onExtraCallback();
            int i4 = onExtraCallbackWithResult + 61;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onMinimized + 7;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            getBaseActivity();
            throw null;
        }
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity == null || !baseActivity.extraCallbackWithResult()) {
            return 1013109L;
        }
        int i3 = onMinimized + 87;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        return -1L;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 73;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{48924, 9978, 49006, 61187, 59218, 29708, 46437, 59860, 39198, 54916, 52673, 13907}, View.MeasureSpec.getMode(0), objArr);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), onExtraCallback())});
        int i4 = onMinimized + 47;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return mapIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onCreate(@Nullable Bundle bundle) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        super.onCreate(bundle);
        if (this.getInterfaceDescriptor == null) {
            int i2 = onMinimized + 25;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
            this.getInterfaceDescriptor = UUID.randomUUID().toString();
            int i4 = onActivityLayout + 93;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
        }
        onExtraCallback(getArguments());
        onMessageChannelReady();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(ICustomTabsCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 43424), 42 - View.combineMeasuredStates(0, 0), 22439 - (KeyEvent.getMaxKeyCode() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 != 0) {
                int i6 = $10 + 125;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                byte[] bArr = onPostMessage;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 56 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onPostMessage;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(extraCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 43424), 42 - (ViewConfiguration.getWindowTouchSlop() >> 8), 22439 - (ViewConfiguration.getPressedStateDuration() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (ICustomTabsCallback ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onMessageChannelReady[i + ((int) (extraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (ICustomTabsCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (extraCallback ^ (-4629411779493505016L))) + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onActivityResized), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), Color.alpha(0) + 86, KeyEvent.keyCodeFromString("") + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onPostMessage;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i9 = 0; i9 < length2; i9++) {
                        bArr5[i9] = (byte) (bArr4[i9] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i10 = $11 + 1;
                    $10 = i10 % 128;
                    boolean z = i10 % 2 == 0;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z) {
                            byte[] bArr6 = onPostMessage;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onMessageChannelReady;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                        int i11 = $10 + 109;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                    }
                }
            }
            String string = sb.toString();
            int i13 = $10 + 85;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            objArr[0] = string;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static final /* synthetic */ class IAuthTabCallback_Parcel extends FunctionReferenceImpl implements Function1<addAttrToClient, Unit> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        IAuthTabCallback_Parcel(Object obj) {
            super(1, obj, TotalServiceFragment.class, "handleActionEvent", "handleActionEvent(Lim/toss/features/alltab/feature/total_service/feature/total_service/ui/event/TotalServiceActionEvent;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((addAttrToClient) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onNavigationEvent(addAttrToClient addattrtoclient) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(addattrtoclient, "");
            TotalServiceFragment.onWarmupCompleted((TotalServiceFragment) ((CallableReference) this).receiver, addattrtoclient);
            int i4 = onExtraCallback + 59;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final /* synthetic */ class access100 extends FunctionReferenceImpl implements Function1<sendMsgToServerByApp, Unit> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        access100(Object obj) {
            super(1, obj, TotalServiceFragment.class, "handleImpressionEvent", "handleImpressionEvent(Lim/toss/features/alltab/feature/total_service/feature/total_service/ui/event/TotalServiceImpressionEvent;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((sendMsgToServerByApp) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 117;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 0;
            }
            return unit;
        }

        public final void onNavigationEvent(sendMsgToServerByApp sendmsgtoserverbyapp) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(sendmsgtoserverbyapp, "");
                TotalServiceFragment.IAuthTabCallback((TotalServiceFragment) ((CallableReference) this).receiver, sendmsgtoserverbyapp);
                int i3 = 64 / 0;
            } else {
                Intrinsics.checkNotNullParameter(sendmsgtoserverbyapp, "");
                TotalServiceFragment.IAuthTabCallback((TotalServiceFragment) ((CallableReference) this).receiver, sendmsgtoserverbyapp);
            }
            int i4 = onExtraCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final /* synthetic */ class access000 extends FunctionReferenceImpl implements Function1<addAttrToClient, Unit> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        access000(Object obj) {
            super(1, obj, TotalServiceFragment.class, "handleActionEvent", "handleActionEvent(Lim/toss/features/alltab/feature/total_service/feature/total_service/ui/event/TotalServiceActionEvent;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((addAttrToClient) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 113;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallback(addAttrToClient addattrtoclient) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(addattrtoclient, "");
            TotalServiceFragment.onWarmupCompleted((TotalServiceFragment) ((CallableReference) this).receiver, addattrtoclient);
            int i4 = onNavigationEvent + 85;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    static final /* synthetic */ class IAuthTabCallbackStubProxy extends FunctionReferenceImpl implements Function1<sendMsgToServerByApp, Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        IAuthTabCallbackStubProxy(Object obj) {
            super(1, obj, TotalServiceFragment.class, "handleImpressionEvent", "handleImpressionEvent(Lim/toss/features/alltab/feature/total_service/feature/total_service/ui/event/TotalServiceImpressionEvent;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((sendMsgToServerByApp) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onWarmupCompleted(sendMsgToServerByApp sendmsgtoserverbyapp) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(sendmsgtoserverbyapp, "");
            TotalServiceFragment.IAuthTabCallback((TotalServiceFragment) ((CallableReference) this).receiver, sendmsgtoserverbyapp);
            int i4 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 33 / 0;
            }
        }
    }

    static final /* synthetic */ class getInterfaceDescriptor extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        getInterfaceDescriptor(Object obj) {
            super(0, obj, TotalServiceViewModel.class, "consumeHighlightMiniAppHighlight", "consumeHighlightMiniAppHighlight()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 125;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        public final void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(TotalServiceViewModel) ((CallableReference) this).receiver};
            TotalServiceViewModel.onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -928927114, objArr, 928927128, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
            int i4 = onWarmupCompleted + 97;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final /* synthetic */ class writeTypedObject extends FunctionReferenceImpl implements Function1<Rect, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        writeTypedObject(Object obj) {
            super(1, obj, TotalServiceFragment.class, "updateNavigationMissionStoreTarget", "updateNavigationMissionStoreTarget(Landroid/graphics/Rect;)V", 0);
        }

        public final void IAuthTabCallback(Rect rect) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TotalServiceFragment totalServiceFragment = (TotalServiceFragment) ((CallableReference) this).receiver;
            if (i3 == 0) {
                TotalServiceFragment.onNavigationEvent(totalServiceFragment, rect);
                return;
            }
            TotalServiceFragment.onNavigationEvent(totalServiceFragment, rect);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((Rect) obj);
            if (i3 != 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            throw null;
        }
    }

    static final /* synthetic */ class extraCallbackWithResult extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        extraCallbackWithResult(Object obj) {
            super(1, obj, TotalServiceFragment.class, "updateNavigationMissionScrollInProgress", "updateNavigationMissionScrollInProgress(Z)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(((Boolean) obj).booleanValue());
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 41;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        public final void onWarmupCompleted(boolean z) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(TotalServiceFragment) ((CallableReference) this).receiver, Boolean.valueOf(z)};
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            TotalServiceFragment.IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, 66249301, -66249298, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback);
            int i4 = IAuthTabCallback + 87;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final /* synthetic */ class readTypedObject extends FunctionReferenceImpl implements Function1<onFailed, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        readTypedObject(Object obj) {
            super(1, obj, TotalServiceFragment.class, "updateInorganicRecommendationOverlay", "updateInorganicRecommendationOverlay(Lim/toss/features/alltab/feature/total_service/feature/total_service/ui/recommendation/NewInorganicRecommendationOverlayPresentation;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((onFailed) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 89;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onExtraCallbackWithResult(onFailed onfailed) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                TotalServiceFragment.onNavigationEvent((TotalServiceFragment) ((CallableReference) this).receiver, onfailed);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            TotalServiceFragment.onNavigationEvent((TotalServiceFragment) ((CallableReference) this).receiver, onfailed);
            int i3 = IAuthTabCallback + 125;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 63 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(TotalServiceFragment totalServiceFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onActivityLayout + 1;
                onMinimized = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-718480209, i, -1, "im.toss.features.alltab.feature.total_service.feature.total_service.TotalServiceFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TotalServiceFragment.kt:234)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-718480209, i, -1, "im.toss.features.alltab.feature.total_service.feature.total_service.TotalServiceFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TotalServiceFragment.kt:234)");
            }
            if (totalServiceFragment.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1873165271);
                TotalServiceNextViewModel totalServiceNextViewModelWriteTypedObject = totalServiceFragment.writeTypedObject();
                String strOnExtraCallback = totalServiceFragment.onExtraCallback();
                boolean typedObject = totalServiceFragment.readTypedObject();
                getBorderRadius<Unit> getborderradius = totalServiceFragment.access000;
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(totalServiceFragment);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback) {
                    int i4 = onActivityLayout + 15;
                    onMinimized = i4 % 128;
                    int i5 = i4 % 2;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new IAuthTabCallback_Parcel(totalServiceFragment);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    Function1 function1 = (access5300) objOnMinimized;
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(totalServiceFragment);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnExtraCallback2) {
                        int i6 = onActivityLayout + 107;
                        onMinimized = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 79 / 0;
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized2 = new access100(totalServiceFragment);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                            }
                            isEnableTabClick.onExtraCallback(totalServiceNextViewModelWriteTypedObject, strOnExtraCallback, typedObject, getborderradius, function1, (access5300) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 0);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        } else {
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            }
                            isEnableTabClick.onExtraCallback(totalServiceNextViewModelWriteTypedObject, strOnExtraCallback, typedObject, getborderradius, function1, (access5300) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 0);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1873719613);
                TotalServiceViewModel totalServiceViewModelOnPostMessage = totalServiceFragment.onPostMessage();
                boolean typedObject2 = totalServiceFragment.readTypedObject();
                getBorderRadius<Unit> getborderradius2 = totalServiceFragment.access000;
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(totalServiceFragment);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback3 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized3 = new access000(totalServiceFragment);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                }
                Function1 function12 = (access5300) objOnMinimized3;
                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(totalServiceFragment);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback4 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized4 = new IAuthTabCallbackStubProxy(totalServiceFragment);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                    int i8 = onActivityLayout + 93;
                    onMinimized = i8 % 128;
                    int i9 = i8 % 2;
                }
                Function1 function13 = (access5300) objOnMinimized4;
                TotalServiceViewModel totalServiceViewModelOnPostMessage2 = totalServiceFragment.onPostMessage();
                boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(totalServiceViewModelOnPostMessage2);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback5 || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized5 = new getInterfaceDescriptor(totalServiceViewModelOnPostMessage2);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                }
                Function0 function0 = (access5300) objOnMinimized5;
                boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(totalServiceFragment);
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback6 || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized6 = new writeTypedObject(totalServiceFragment);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
                }
                Function1 function14 = (access5300) objOnMinimized6;
                boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(totalServiceFragment);
                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback7 || objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized7 = new extraCallbackWithResult(totalServiceFragment);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
                }
                Function1 function15 = (access5300) objOnMinimized7;
                boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(totalServiceFragment);
                Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback8 || objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized8 = new readTypedObject(totalServiceFragment);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized8);
                }
                isEnableTabClick.onNavigationEvent(totalServiceViewModelOnPostMessage, typedObject2, getborderradius2, function12, function13, function0, function14, function15, (access5300) objOnMinimized8, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onActivityLayout + 55;
                onMinimized = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(TotalServiceFragment totalServiceFragment, getImageTitle getimagetitle, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onMinimized + 77;
            onActivityLayout = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onActivityLayout + 63;
                onMinimized = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(572024815, i, -1, "im.toss.features.alltab.feature.total_service.feature.total_service.TotalServiceFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TotalServiceFragment.kt:230)");
            }
            setPostviewFormatSelector.onExtraCallback(new accessgetCameraFactoryp[]{enableTranslucentStatusBar.onTransact().onExtraCallback(totalServiceFragment.onExtraCallback()), getHomeButtonVisibility.IAuthTabCallback().onExtraCallback(getimagetitle)}, ForwardingCameraControl.onExtraCallback(-718480209, true, new TotalServiceFragment$.ExternalSyntheticLambda24(totalServiceFragment), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onActivityLayout + 5;
                onMinimized = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i8 = onActivityLayout + 17;
                onMinimized = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(TotalServiceFragment totalServiceFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-642989096, i, -1, "im.toss.features.alltab.feature.total_service.feature.total_service.TotalServiceFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (TotalServiceFragment.kt:224)");
                int i3 = onActivityLayout + 123;
                onMinimized = i3 % 128;
                int i4 = i3 % 2;
            }
            float fOnExtraCallback = totalServiceFragment.readTypedObject.onExtraCallback();
            boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fOnExtraCallback);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zIAuthTabCallback) {
                int i5 = onMinimized + 35;
                onActivityLayout = i5 % 128;
                int i6 = i5 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new getImageTitle(0.0f, fOnExtraCallback, 1, (DefaultConstructorMarker) null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                y4.onNavigationEvent((addFixedPosition) null, (MaxRecyclerAdaptera) null, (y2) null, (y6) null, ForwardingCameraControl.onExtraCallback(572024815, true, new TotalServiceFragment$.ExternalSyntheticLambda20(totalServiceFragment, (getImageTitle) objOnMinimized), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 24576, 15);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = onActivityLayout + 31;
                    onMinimized = i7 % 128;
                    if (i7 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        Context context = layoutInflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
        composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-642989096, true, new TotalServiceFragment$.ExternalSyntheticLambda0(this))));
        frameLayout.addView(composeView);
        int i2 = onMinimized + 27;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        return frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onResume() throws Throwable {
        boolean z;
        int i = 2 % 2;
        int i2 = onActivityLayout + 45;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onResume();
        onTransact();
        Object[] objArr = {this.asInterface};
        boolean zBooleanValue = ((Boolean) isDisplay.onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -651975249, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr, 651975251)).booleanValue();
        newSession();
        Object obj = null;
        if (zBooleanValue) {
            int i4 = onMinimized + 35;
            onActivityLayout = i4 % 128;
            if (i4 % 2 != 0) {
                access000();
                int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, 1089628495, -1089628464, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback);
                newAuthTabSession();
                throw null;
            }
            access000();
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, 1089628495, -1089628464, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2);
            newAuthTabSession();
        } else if (onPostMessage().onNavigationEvent()) {
            int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, 1089628495, -1089628464, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback3);
            newAuthTabSession();
            int i5 = onMinimized + 13;
            onActivityLayout = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, 1929039885, -1929039879, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback4);
            if (extraCallback().IAuthTabCallback() != null) {
                int i7 = onMinimized + 37;
                onActivityLayout = i7 % 128;
                if (i7 % 2 != 0) {
                    prefetch();
                    int i8 = 56 / 0;
                } else {
                    prefetch();
                }
            }
        }
        isReverse.onExtraCallbackWithResult.onExtraCallback(this);
        if (onActivityLayout()) {
            int i9 = onActivityLayout + 99;
            onMinimized = i9 % 128;
            if (i9 % 2 == 0) {
                writeTypedObject().IAuthTabCallback_Parcel();
                writeTypedObject().ICustomTabsCallback();
                obj.hashCode();
                throw null;
            }
            writeTypedObject().IAuthTabCallback_Parcel();
            writeTypedObject().ICustomTabsCallback();
        }
        boolean z2 = this.onWarmupCompleted;
        this.onWarmupCompleted = false;
        if (!onActivityLayout()) {
            onCapsuleReady.onWarmupCompleted(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), z2, new onPostMessage(this), new TotalServiceFragment$.ExternalSyntheticLambda16(this), new TotalServiceFragment$.ExternalSyntheticLambda17(this));
            return;
        }
        if (!writeTypedObject().onExtraCallback()) {
            int i10 = onActivityLayout + 3;
            onMinimized = i10 % 128;
            int i11 = i10 % 2;
            z = writeTypedObject().IAuthTabCallbackStubProxy();
        }
        onNavigationEvent(z2, z);
    }

    static final /* synthetic */ class onPostMessage extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        onPostMessage(Object obj) {
            super(0, obj, TotalServiceFragment.class, "fetchOnResume", "fetchOnResume()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted();
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 47;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 44 / 0;
            }
            return unit;
        }

        public final void onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            TotalServiceFragment totalServiceFragment = (TotalServiceFragment) ((CallableReference) this).receiver;
            if (i3 == 0) {
                TotalServiceFragment.asInterface(totalServiceFragment);
                return;
            }
            TotalServiceFragment.asInterface(totalServiceFragment);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit writeTypedObject(TotalServiceFragment totalServiceFragment) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 63;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        totalServiceFragment.onPostMessage().onUnminimized();
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityLayout + 87;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onPostMessage(TotalServiceFragment totalServiceFragment) {
        int i = 2 % 2;
        int i2 = onMinimized + 9;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {totalServiceFragment.onPostMessage()};
            TotalServiceViewModel.onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -1509265707, objArr, 1509265714, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
            totalServiceFragment.onPostMessage().onExtraCallbackWithResult();
            totalServiceFragment.onPostMessage().onMinimized();
            Unit unit = Unit.INSTANCE;
            int i3 = onActivityLayout + 53;
            onMinimized = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        Object[] objArr2 = {totalServiceFragment.onPostMessage()};
        TotalServiceViewModel.onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -1509265707, objArr2, 1509265714, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
        totalServiceFragment.onPostMessage().onExtraCallbackWithResult();
        totalServiceFragment.onPostMessage().onMinimized();
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPause() {
        TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallbackIAuthTabCallback;
        int i = 2 % 2;
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onPause();
        if (onActivityLayout()) {
            writeTypedObject().access000();
            writeTypedObject().access100();
            int i2 = onActivityLayout + 83;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i4 = onActivityLayout + 93;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            TextFieldKeyInputExternalSyntheticLambda9 lifecycle = activity.getLifecycle();
            onextracallbackIAuthTabCallback = lifecycle != null ? lifecycle.IAuthTabCallback() : null;
        }
        boolean z = onextracallbackIAuthTabCallback == TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED;
        if (this.asInterface.IAuthTabCallbackStub()) {
            int i6 = onActivityLayout + 35;
            onMinimized = i6 % 128;
            if (i6 % 2 == 0) {
                newSession();
                throw null;
            }
            newSession();
        } else {
            IAuthTabCallbackStubProxy();
        }
        IAuthTabCallback_Parcel();
        getInterfaceDescriptor();
        onPostMessage().onActivityResized();
        try {
            Result.Companion companion = Result.Companion;
            if (z) {
                setEnableTabClick.IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 1299747922, new Object[]{this.onNavigationEvent}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -1299747922);
            }
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    public void onStop() throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 87;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            super.onStop();
            IAuthTabCallbackStubProxy();
            if (!(!this.asInterface.asInterface())) {
                access000();
                int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, 1089628495, -1089628464, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback);
                newAuthTabSession();
            }
            setEnableTabClick.IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 1299747922, new Object[]{this.onNavigationEvent}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -1299747922);
            int i3 = onMinimized + 25;
            onActivityLayout = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 91 / 0;
                return;
            }
            return;
        }
        super.onStop();
        IAuthTabCallbackStubProxy();
        this.asInterface.asInterface();
        throw null;
    }

    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = onMinimized + 71;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel();
        access000();
        newAuthTabSession();
        newSessionWithExtras();
        this.readTypedObject.onNavigationEvent();
        super.onDestroyView();
        int i4 = onActivityLayout + 27;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    public boolean onBackPressed() {
        int i = 2 % 2;
        onFailed onfailedIAuthTabCallback = extraCallback().IAuthTabCallback();
        if (!extraCallback().onExtraCallback() || onfailedIAuthTabCallback == null) {
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            if (!((Boolean) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{this}, -674709966, 674709977, iOnExtraCallback3, iOnExtraCallback)).booleanValue()) {
                return super.onBackPressed();
            }
            ICustomTabsCallback();
            getIconPaddingLeft.IAuthTabCallback.onExtraCallbackWithResult(new closeAllSocket(17, false, false, 4, null));
            return true;
        }
        int i2 = onMinimized + 83;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        extraCallback().onExtraCallback(onfailedIAuthTabCallback.onExtraCallbackWithResult().onExtraCallback());
        int i4 = onMinimized + 27;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return true;
    }

    static final /* synthetic */ class ICustomTabsCallback extends FunctionReferenceImpl implements Function0<Unit> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        ICustomTabsCallback(Object obj) {
            super(0, obj, TotalServiceViewModel.class, "waitingUpdate", "waitingUpdate()V", 0);
        }

        public final void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ((TotalServiceViewModel) ((CallableReference) this).receiver).onUnminimized();
            int i4 = IAuthTabCallback + 87;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 73 / 0;
            }
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback();
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 63;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 84 / 0;
            }
            return unit;
        }
    }

    private static final Unit readTypedObject(TotalServiceFragment totalServiceFragment) {
        TotalServiceViewModel totalServiceViewModelOnPostMessage;
        int i;
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 15;
        onMinimized = i3 % 128;
        if (i3 % 2 == 0) {
            totalServiceViewModelOnPostMessage = totalServiceFragment.onPostMessage();
            i = 0;
        } else {
            totalServiceViewModelOnPostMessage = totalServiceFragment.onPostMessage();
            i = 1;
        }
        TotalServiceViewModel.IAuthTabCallback(totalServiceViewModelOnPostMessage, (Boolean) null, i, (Object) null);
        return Unit.INSTANCE;
    }

    static final /* synthetic */ class extraCallback extends FunctionReferenceImpl implements Function0<Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        extraCallback(Object obj) {
            super(0, obj, TotalServiceViewModel.class, "releaseUpdate", "releaseUpdate()V", 0);
        }

        public /* synthetic */ Object invoke() {
            Unit unit;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback();
            if (i3 == 0) {
                unit = Unit.INSTANCE;
                int i4 = 91 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i5 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(TotalServiceViewModel) ((CallableReference) this).receiver};
            TotalServiceViewModel.onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -1509265707, objArr, 1509265714, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
            int i4 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 6 / 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (onActivityLayout() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (onActivityLayout() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (getLifecycle().IAuthTabCallback().isAtLeast(o.TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED) == true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        onNavigationEvent(false, writeTypedObject().IAuthTabCallbackStubProxy());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r12 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (getLifecycle().IAuthTabCallback().isAtLeast(o.TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        o.onCapsuleReady.onExtraCallbackWithResult(o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r11), false, new im.toss.features.alltab.feature.total_service.feature.total_service.TotalServiceFragment$.ExternalSyntheticLambda23(r11), new im.toss.features.alltab.feature.total_service.feature.total_service.TotalServiceFragment.ICustomTabsCallback(onPostMessage()), new im.toss.features.alltab.feature.total_service.feature.total_service.TotalServiceFragment.extraCallback(onPostMessage()), 2, null);
        r12 = im.toss.features.alltab.feature.total_service.feature.total_service.TotalServiceFragment.onMinimized + 65;
        im.toss.features.alltab.feature.total_service.feature.total_service.TotalServiceFragment.onActivityLayout = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        im.toss.features.alltab.feature.total_service.feature.total_service.TotalServiceViewModel.onWarmupCompleted(onPostMessage(), false, true, false, (o.showBackButton.onNavigationEvent) null, false, (java.lang.Boolean) null, (java.lang.String) null, (o.NavigationBarCapsuleTheme.onExtraCallback.asBinder) null, 253, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNewArgument(@Nullable Bundle bundle) throws NoWhenBranchMatchedException {
        boolean zOnExtraCallback;
        int i = 2 % 2;
        int i2 = onMinimized + 101;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            super.onNewArgument(bundle);
            int i3 = 22 / 0;
            if (!isAdded()) {
                return;
            }
        } else {
            super.onNewArgument(bundle);
            if (!isAdded()) {
                return;
            }
        }
        int i4 = onMinimized + 107;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            zOnExtraCallback = onExtraCallback(bundle);
            int i5 = 17 / 0;
        } else {
            zOnExtraCallback = onExtraCallback(bundle);
        }
    }

    public void onRetry() {
        int i = 2 % 2;
        if (!onActivityLayout()) {
            onPostMessage().IAuthTabCallback(false);
            int i2 = onMinimized + 31;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = onActivityLayout + 65;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            writeTypedObject().onExtraCallback(onExtraCallback(), writeTypedObject().extraCallback());
            int i5 = 12 / 0;
        } else {
            writeTypedObject().onExtraCallback(onExtraCallback(), writeTypedObject().extraCallback());
        }
    }

    @Override // o.setButtonTextVisibility
    public Rect onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 75;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        getTabBarItemAt gettabbaritemat = this.readTypedObject;
        if (i3 == 0) {
            int i4 = 36 / 0;
            return gettabbaritemat.onNavigationEvent(getView(), getLifecycle().IAuthTabCallback());
        }
        return gettabbaritemat.onNavigationEvent(getView(), getLifecycle().IAuthTabCallback());
    }

    private static final boolean onExtraCallback(RVWebSocketManagerHolder rVWebSocketManagerHolder) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rVWebSocketManagerHolder, "");
        if (rVWebSocketManagerHolder.onWarmupCompleted() != 1) {
            return false;
        }
        int i2 = onActivityLayout + 57;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 27;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 111;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return ((Boolean) function1.invoke(obj)).booleanValue();
        }
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i3 = 76 / 0;
        return zBooleanValue;
    }

    private static final void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMinimized + 111;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onMinimized + 33;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityLayout + 97;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        getBorderRadius<Unit> getborderradius = totalServiceFragment.access000;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            getborderradius.onNavigationEvent(unit);
            return unit;
        }
        getborderradius.onNavigationEvent(unit);
        throw null;
    }

    private static final boolean onExtraCallback(getErrMsg geterrmsg) {
        int i = 2 % 2;
        int i2 = onMinimized + 27;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(geterrmsg, "");
        if (geterrmsg.onWarmupCompleted() == 1) {
            return false;
        }
        int i4 = onMinimized + 121;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private static final boolean onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMinimized + 67;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            ((Boolean) function1.invoke(obj)).booleanValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i3 = onActivityLayout + 57;
        onMinimized = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 17 / 0;
        }
        return zBooleanValue;
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMinimized + 29;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = onActivityLayout + 115;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(TotalServiceFragment totalServiceFragment, getErrMsg geterrmsg) {
        int i = 2 % 2;
        int i2 = onMinimized + 79;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            totalServiceFragment.IAuthTabCallbackDefault.onWarmupCompleted();
            if (totalServiceFragment.onActivityLayout()) {
                totalServiceFragment.writeTypedObject().readTypedObject();
                int i3 = onActivityLayout + 67;
                onMinimized = i3 % 128;
                int i4 = i3 % 2;
            }
            TotalServiceViewModel.IAuthTabCallback(totalServiceFragment.onPostMessage(), true, showBackButton.onNavigationEvent.TAB, (Long) null, (Long) null, 12, (Object) null);
            TotalServiceViewModel.onWarmupCompleted(totalServiceFragment.onPostMessage(), (Long) null, 1, (Object) null);
            return Unit.INSTANCE;
        }
        totalServiceFragment.IAuthTabCallbackDefault.onWarmupCompleted();
        totalServiceFragment.onActivityLayout();
        throw null;
    }

    private final void onMessageChannelReady() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(this, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(this, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(this, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(this, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new asInterface(this, (access13800) null), 3, (Object) null);
        getIconPaddingLeft geticonpaddingleft = getIconPaddingLeft.IAuthTabCallback;
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = geticonpaddingleft.onWarmupCompleted().onExtraCallback(RVWebSocketManagerHolder.class).onWarmupCompleted(new TotalServiceFragment$.ExternalSyntheticLambda3(new TotalServiceFragment$.ExternalSyntheticLambda2())).IAuthTabCallback(300L, TimeUnit.MILLISECONDS).onWarmupCompleted(NetConverter3.onExtraCallback()).IAuthTabCallback(new TotalServiceFragment$.ExternalSyntheticLambda5(new TotalServiceFragment$.ExternalSyntheticLambda4(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        autoDisposable(deserializeurinullablecollectionIAuthTabCallback);
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback2 = geticonpaddingleft.onWarmupCompleted().onExtraCallback(getErrMsg.class).onWarmupCompleted(new TotalServiceFragment$.ExternalSyntheticLambda7(new TotalServiceFragment$.ExternalSyntheticLambda6())).onWarmupCompleted(NetConverter3.onExtraCallback()).IAuthTabCallback(new TotalServiceFragment$.ExternalSyntheticLambda9(new TotalServiceFragment$.ExternalSyntheticLambda8(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback2, "");
        autoDisposable(deserializeurinullablecollectionIAuthTabCallback2);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(this, (access13800) null), 3, (Object) null);
        int i2 = onActivityLayout + 53;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onWarmupCompleted(addAttrToClient addattrtoclient) throws Throwable {
        o.ICustomTabsCallback_Parcel onBackPressedDispatcher;
        List listOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onActivityLayout + 33;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        if (addattrtoclient instanceof addAttrToClient.onPostMessage) {
            onWarmupCompleted(((addAttrToClient.onPostMessage) addattrtoclient).onExtraCallback());
            return;
        }
        if (Intrinsics.areEqual(addattrtoclient, addAttrToClient.ICustomTabsCallbackDefault.onWarmupCompleted)) {
            ICustomTabsCallback_Parcel();
            return;
        }
        if (Intrinsics.areEqual(addattrtoclient, addAttrToClient.onExtraCallback.onExtraCallbackWithResult)) {
            onWarmupCompleted(this, null, false, null, 7, null);
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.ICustomTabsCallbackStub) {
            IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, Boolean.valueOf(((addAttrToClient.ICustomTabsCallbackStub) addattrtoclient).onExtraCallback()), null, 2, null}, 474250896, -474250884, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.extraCommand) {
            addAttrToClient.extraCommand extracommand = (addAttrToClient.extraCommand) addattrtoclient;
            onExtraCallbackWithResult(extracommand.onExtraCallbackWithResult());
            ((Boolean) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, extracommand.IAuthTabCallback(), extracommand.onExtraCallbackWithResult()}, -1243321, 1243329, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).booleanValue();
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.postMessage) {
            addAttrToClient.postMessage postmessage = (addAttrToClient.postMessage) addattrtoclient;
            onExtraCallbackWithResult(postmessage.onExtraCallbackWithResult());
            ((Boolean) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, postmessage.onExtraCallback(), postmessage.onExtraCallbackWithResult()}, -1243321, 1243329, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).booleanValue();
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.isEngagementSignalsApiAvailable) {
            addAttrToClient.isEngagementSignalsApiAvailable isengagementsignalsapiavailable = (addAttrToClient.isEngagementSignalsApiAvailable) addattrtoclient;
            onExtraCallbackWithResult(isengagementsignalsapiavailable.IAuthTabCallback());
            if (writeTypedObject().onExtraCallbackWithResult(isengagementsignalsapiavailable.onNavigationEvent(), isengagementsignalsapiavailable.onExtraCallbackWithResult())) {
                if (((Boolean) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, isengagementsignalsapiavailable.onWarmupCompleted(), isengagementsignalsapiavailable.IAuthTabCallback()}, -1243321, 1243329, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).booleanValue()) {
                    return;
                }
                writeTypedObject().IAuthTabCallback(isengagementsignalsapiavailable.onNavigationEvent(), isengagementsignalsapiavailable.onExtraCallbackWithResult());
                return;
            }
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.ICustomTabsCallback_Parcel) {
            isAlphaBackground isalphabackgroundOnWarmupCompleted = writeTypedObject().onWarmupCompleted(((addAttrToClient.ICustomTabsCallback_Parcel) addattrtoclient).onExtraCallbackWithResult());
            if (isalphabackgroundOnWarmupCompleted != null) {
                onExtraCallbackWithResult(isalphabackgroundOnWarmupCompleted.onNavigationEvent());
                return;
            }
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.newSessionWithExtras) {
            int i4 = onMinimized + 99;
            onActivityLayout = i4 % 128;
            if (i4 % 2 == 0) {
                IAuthTabCallback(((addAttrToClient.newSessionWithExtras) addattrtoclient).IAuthTabCallback());
                return;
            } else {
                IAuthTabCallback(((addAttrToClient.newSessionWithExtras) addattrtoclient).IAuthTabCallback());
                baseLauncherWrapperActivity.hashCode();
                throw null;
            }
        }
        if (Intrinsics.areEqual(addattrtoclient, addAttrToClient.onExtraCallbackWithResult.onNavigationEvent)) {
            onRelationshipValidationResult();
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.onActivityLayout) {
            int i5 = onActivityLayout + 125;
            onMinimized = i5 % 128;
            if (i5 % 2 != 0) {
                IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, ((addAttrToClient.onActivityLayout) addattrtoclient).IAuthTabCallback()}, -861739030, 861739045, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
                return;
            } else {
                IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, ((addAttrToClient.onActivityLayout) addattrtoclient).IAuthTabCallback()}, -861739030, 861739045, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
                baseLauncherWrapperActivity.hashCode();
                throw null;
            }
        }
        if (addattrtoclient instanceof addAttrToClient.onMessageChannelReady) {
            IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, ((addAttrToClient.onMessageChannelReady) addattrtoclient).onExtraCallback(), null, 2, null}, 1378283204, -1378283177, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
            return;
        }
        if (Intrinsics.areEqual(addattrtoclient, addAttrToClient.writeTypedObject.onWarmupCompleted)) {
            int i6 = onActivityLayout + 91;
            onMinimized = i6 % 128;
            if (i6 % 2 != 0) {
                onPostMessage().onMessageChannelReady();
                return;
            } else {
                onPostMessage().onMessageChannelReady();
                int i7 = 45 / 0;
                return;
            }
        }
        if (Intrinsics.areEqual(addattrtoclient, addAttrToClient.readTypedObject.onNavigationEvent)) {
            int i8 = onMinimized + 9;
            onActivityLayout = i8 % 128;
            int i9 = i8 % 2;
            mayLaunchUrl();
            return;
        }
        if (Intrinsics.areEqual(addattrtoclient, addAttrToClient.onActivityResized.onNavigationEvent)) {
            ICustomTabsCallbackDefault();
            return;
        }
        if (Intrinsics.areEqual(addattrtoclient, addAttrToClient.ICustomTabsService.IAuthTabCallback)) {
            extraCommand();
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.onUnminimized) {
            addAttrToClient.onUnminimized onunminimized = (addAttrToClient.onUnminimized) addattrtoclient;
            onExtraCallbackWithResult(onunminimized.onNavigationEvent(), onunminimized.onExtraCallbackWithResult());
            return;
        }
        if (Intrinsics.areEqual(addattrtoclient, addAttrToClient.getInterfaceDescriptor.onExtraCallback)) {
            onUnminimized();
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.onRelationshipValidationResult) {
            onExtraCallbackWithResult(((addAttrToClient.onRelationshipValidationResult) addattrtoclient).onExtraCallback());
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.ICustomTabsCallbackStubProxy) {
            onPostMessage().IAuthTabCallback(((addAttrToClient.ICustomTabsCallbackStubProxy) addattrtoclient).onExtraCallbackWithResult());
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.onWarmupCompleted) {
            onNavigationEvent(((addAttrToClient.onWarmupCompleted) addattrtoclient).onExtraCallbackWithResult());
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.mayLaunchUrl) {
            int i10 = onActivityLayout + 121;
            onMinimized = i10 % 128;
            if (i10 % 2 != 0) {
                addAttrToClient.mayLaunchUrl maylaunchurl = (addAttrToClient.mayLaunchUrl) addattrtoclient;
                writeTypedObject().onWarmupCompleted(maylaunchurl.onExtraCallback(), maylaunchurl.onWarmupCompleted());
                return;
            } else {
                addAttrToClient.mayLaunchUrl maylaunchurl2 = (addAttrToClient.mayLaunchUrl) addattrtoclient;
                writeTypedObject().onWarmupCompleted(maylaunchurl2.onExtraCallback(), maylaunchurl2.onWarmupCompleted());
                baseLauncherWrapperActivity.hashCode();
                throw null;
            }
        }
        if (addattrtoclient instanceof addAttrToClient.newSession) {
            addAttrToClient.newSession newsession = (addAttrToClient.newSession) addattrtoclient;
            Long l = (Long) TotalServiceNextViewModel.onWarmupCompleted(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -996175448, new Object[]{writeTypedObject(), Long.valueOf(newsession.onExtraCallbackWithResult()), Long.valueOf(newsession.onExtraCallback()), newsession.onWarmupCompleted().onExtraCallback()}, 996175462, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
            if (l != null) {
                int i11 = onMinimized + 117;
                onActivityLayout = i11 % 128;
                if (i11 % 2 != 0) {
                    newsession.onWarmupCompleted().IAuthTabCallback();
                    throw null;
                }
                getHomeButtonBoundingClientRectAsync gethomebuttonboundingclientrectasyncIAuthTabCallback = newsession.onWarmupCompleted().IAuthTabCallback();
                if (gethomebuttonboundingclientrectasyncIAuthTabCallback != null && (listOnNavigationEvent = getLeftCloseButtonVisibility.onNavigationEvent(gethomebuttonboundingclientrectasyncIAuthTabCallback, (getCustomViewProxy) null)) != null) {
                    onPostMessage().onExtraCallback(listOnNavigationEvent);
                }
                onExtraCallbackWithResult(newsession.onWarmupCompleted().onWarmupCompleted());
                if (((Boolean) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, (String) setName.IAuthTabCallback.onNavigationEvent(-189473691, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{newsession.onWarmupCompleted()}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 189473691), newsession.onWarmupCompleted().onWarmupCompleted()}, -1243321, 1243329, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).booleanValue()) {
                    IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, Long.valueOf(l.longValue())}, -281592634, 281592666, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
                    return;
                } else {
                    writeTypedObject().IAuthTabCallback(l.longValue(), newsession.onExtraCallbackWithResult(), newsession.onExtraCallback(), newsession.onWarmupCompleted().onExtraCallback());
                    return;
                }
            }
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.asBinder) {
            addAttrToClient.asBinder asbinder = (addAttrToClient.asBinder) addattrtoclient;
            IAuthTabCallback(asbinder.onExtraCallback(), asbinder.IAuthTabCallback());
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.IAuthTabCallbackDefault) {
            onPostMessage().onExtraCallback(((addAttrToClient.IAuthTabCallbackDefault) addattrtoclient).onNavigationEvent());
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.IAuthTabCallbackStub) {
            addAttrToClient.IAuthTabCallbackStub iAuthTabCallbackStub = (addAttrToClient.IAuthTabCallbackStub) addattrtoclient;
            IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, Long.valueOf(iAuthTabCallbackStub.onNavigationEvent()), Long.valueOf(iAuthTabCallbackStub.IAuthTabCallback())}, -835648716, 835648726, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.onMinimized) {
            addAttrToClient.onMinimized onminimized = (addAttrToClient.onMinimized) addattrtoclient;
            onWarmupCompleted(onminimized.onExtraCallbackWithResult(), onminimized.IAuthTabCallback());
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.onNavigationEvent) {
            IAuthTabCallback(((addAttrToClient.onNavigationEvent) addattrtoclient).onNavigationEvent());
            onActivityResized();
            if (onActivityLayout()) {
                writeTypedObject().getInterfaceDescriptor();
                return;
            } else {
                onPostMessage().onPostMessage();
                return;
            }
        }
        if (addattrtoclient instanceof addAttrToClient.access000) {
            int i12 = onMinimized + 81;
            onActivityLayout = i12 % 128;
            int i13 = i12 % 2;
            if (onActivityLayout()) {
                addAttrToClient.access000 access000Var = (addAttrToClient.access000) addattrtoclient;
                TotalServiceNextViewModel.onWarmupCompleted(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -913921557, new Object[]{writeTypedObject(), access000Var.onExtraCallback(), Integer.valueOf(access000Var.onWarmupCompleted())}, 913921573, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
                return;
            } else {
                addAttrToClient.access000 access000Var2 = (addAttrToClient.access000) addattrtoclient;
                onPostMessage().onWarmupCompleted(access000Var2.onExtraCallback(), access000Var2.onWarmupCompleted());
                return;
            }
        }
        if (addattrtoclient instanceof addAttrToClient.IAuthTabCallback) {
            onPostMessage().onExtraCallback(((addAttrToClient.IAuthTabCallback) addattrtoclient).IAuthTabCallback());
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.onTransact) {
            int i14 = onMinimized + 27;
            onActivityLayout = i14 % 128;
            int i15 = i14 % 2;
            addAttrToClient.onTransact ontransact = (addAttrToClient.onTransact) addattrtoclient;
            onWarmupCompleted(ontransact.onNavigationEvent(), ontransact.onExtraCallbackWithResult());
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.asInterface) {
            onExtraCallback(((addAttrToClient.asInterface) addattrtoclient).onWarmupCompleted());
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.ICustomTabsCallback) {
            addAttrToClient.ICustomTabsCallback iCustomTabsCallback = (addAttrToClient.ICustomTabsCallback) addattrtoclient;
            onPostMessage().onExtraCallbackWithResult(iCustomTabsCallback.onExtraCallbackWithResult(), iCustomTabsCallback.IAuthTabCallback());
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.extraCallbackWithResult) {
            onPostMessage().onExtraCallback(((addAttrToClient.extraCallbackWithResult) addattrtoclient).IAuthTabCallback());
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.access100) {
            onWarmupCompleted(((addAttrToClient.access100) addattrtoclient).onNavigationEvent());
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.extraCallback) {
            addAttrToClient.extraCallback extracallback = (addAttrToClient.extraCallback) addattrtoclient;
            onWarmupCompleted(extracallback.onNavigationEvent(), extracallback.IAuthTabCallback());
            return;
        }
        if (addattrtoclient instanceof addAttrToClient.IAuthTabCallback_Parcel) {
            onPostMessage().onNavigationEvent(Long.valueOf(((addAttrToClient.IAuthTabCallback_Parcel) addattrtoclient).onNavigationEvent()));
            return;
        }
        if (!Intrinsics.areEqual(addattrtoclient, addAttrToClient.IAuthTabCallbackStubProxy.onWarmupCompleted)) {
            throw new NoWhenBranchMatchedException();
        }
        FragmentActivity activity = getActivity();
        baseLauncherWrapperActivity = activity instanceof BaseLauncherWrapperActivity ? (BaseLauncherWrapperActivity) activity : null;
        if (baseLauncherWrapperActivity != null) {
            baseLauncherWrapperActivity.onNavigationEvent();
            return;
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 == null || (onBackPressedDispatcher = activity2.getOnBackPressedDispatcher()) == null) {
            return;
        }
        int i16 = onMinimized + 61;
        onActivityLayout = i16 % 128;
        int i17 = i16 % 2;
        onBackPressedDispatcher.onExtraCallbackWithResult();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void IAuthTabCallback(sendMsgToServerByApp sendmsgtoserverbyapp) throws Throwable {
        sendMsgToServerByApp.writeTypedObject writetypedobject;
        Iterator it;
        setRubIn interfaceDescriptor;
        int i = 2 % 2;
        BaseActivity activity = getActivity();
        Object obj = null;
        BaseActivity baseActivity = activity instanceof BaseActivity ? activity : null;
        int i2 = 1;
        if (baseActivity != null && (interfaceDescriptor = baseActivity.getInterfaceDescriptor()) != null && ((Boolean) interfaceDescriptor.IAuthTabCallback()).booleanValue()) {
            int i3 = onMinimized + 19;
            onActivityLayout = i3 % 128;
            if (i3 % 2 == 0) {
                this.IAuthTabCallbackStubProxy.add(sendmsgtoserverbyapp);
                return;
            } else {
                this.IAuthTabCallbackStubProxy.add(sendmsgtoserverbyapp);
                obj.hashCode();
                throw null;
            }
        }
        if (sendmsgtoserverbyapp instanceof sendMsgToServerByApp.asInterface) {
            onExtraCallback(((sendMsgToServerByApp.asInterface) sendmsgtoserverbyapp).onNavigationEvent());
            return;
        }
        if (Intrinsics.areEqual(sendmsgtoserverbyapp, sendMsgToServerByApp.IAuthTabCallback_Parcel.onNavigationEvent)) {
            ICustomTabsService();
            return;
        }
        if (sendmsgtoserverbyapp instanceof sendMsgToServerByApp.getInterfaceDescriptor) {
            onWarmupCompleted(((sendMsgToServerByApp.getInterfaceDescriptor) sendmsgtoserverbyapp).onNavigationEvent());
            return;
        }
        if (sendmsgtoserverbyapp instanceof sendMsgToServerByApp.access100) {
            int i4 = onActivityLayout + 85;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            onWarmupCompleted(((sendMsgToServerByApp.access100) sendmsgtoserverbyapp).onExtraCallbackWithResult());
            return;
        }
        if (sendmsgtoserverbyapp instanceof sendMsgToServerByApp.IAuthTabCallbackDefault) {
            onNavigationEvent(((sendMsgToServerByApp.IAuthTabCallbackDefault) sendmsgtoserverbyapp).onExtraCallback());
            return;
        }
        if (sendmsgtoserverbyapp instanceof sendMsgToServerByApp.asBinder) {
            sendMsgToServerByApp.asBinder asbinder = (sendMsgToServerByApp.asBinder) sendmsgtoserverbyapp;
            IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, asbinder.onExtraCallbackWithResult(), asbinder.IAuthTabCallback()}, -1011134272, 1011134276, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
            return;
        }
        int i6 = 0;
        if (sendmsgtoserverbyapp instanceof sendMsgToServerByApp.access000) {
            IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, ((sendMsgToServerByApp.access000) sendmsgtoserverbyapp).onNavigationEvent()}, 891959270, -891959250, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
            int i7 = onMinimized + 69;
            onActivityLayout = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 89 / 0;
                return;
            }
            return;
        }
        if (sendmsgtoserverbyapp instanceof sendMsgToServerByApp.IAuthTabCallbackStubProxy) {
            int i9 = onActivityLayout + 67;
            onMinimized = i9 % 128;
            int i10 = i9 % 2;
            onWarmupCompleted(((sendMsgToServerByApp.IAuthTabCallbackStubProxy) sendmsgtoserverbyapp).onNavigationEvent());
            return;
        }
        if (sendmsgtoserverbyapp instanceof sendMsgToServerByApp.ICustomTabsCallback) {
            sendMsgToServerByApp.ICustomTabsCallback iCustomTabsCallback = (sendMsgToServerByApp.ICustomTabsCallback) sendmsgtoserverbyapp;
            Iterator it2 = iCustomTabsCallback.onExtraCallback().iterator();
            while (!(!it2.hasNext())) {
                Object next = it2.next();
                if (i6 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                NavigationBar navigationBar = (NavigationBar) next;
                IAuthTabCallback("v6_chip::" + iCustomTabsCallback.IAuthTabCallback() + "::" + i6 + "::" + navigationBar.onExtraCallback(), navigationBar);
                i6++;
            }
            return;
        }
        if (sendmsgtoserverbyapp instanceof sendMsgToServerByApp.extraCallbackWithResult) {
            sendMsgToServerByApp.extraCallbackWithResult extracallbackwithresult = (sendMsgToServerByApp.extraCallbackWithResult) sendmsgtoserverbyapp;
            for (Object obj2 : extracallbackwithresult.onNavigationEvent()) {
                if (i6 < 0) {
                    int i11 = onMinimized + 39;
                    onActivityLayout = i11 % 128;
                    if (i11 % 2 != 0) {
                        CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    CollectionsKt.throwIndexOverflow();
                }
                NavigationBar navigationBar2 = (NavigationBar) obj2;
                IAuthTabCallback("v6_store_landing_shortcut::" + extracallbackwithresult.onWarmupCompleted() + "::" + i6 + "::" + navigationBar2.onExtraCallback(), navigationBar2);
                i6++;
            }
            return;
        }
        if (sendmsgtoserverbyapp instanceof sendMsgToServerByApp.writeTypedObject) {
            int i12 = onMinimized + 99;
            onActivityLayout = i12 % 128;
            if (i12 % 2 != 0) {
                writetypedobject = (sendMsgToServerByApp.writeTypedObject) sendmsgtoserverbyapp;
                it = writetypedobject.onWarmupCompleted().iterator();
            } else {
                writetypedobject = (sendMsgToServerByApp.writeTypedObject) sendmsgtoserverbyapp;
                it = writetypedobject.onWarmupCompleted().iterator();
                i2 = 0;
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                NavigationBar navigationBar3 = (NavigationBar) next2;
                IAuthTabCallback("v6_curation::" + writetypedobject.onExtraCallbackWithResult() + "::" + i2 + "::" + navigationBar3.onExtraCallback(), navigationBar3);
                i2++;
            }
            return;
        }
        if (Intrinsics.areEqual(sendmsgtoserverbyapp, sendMsgToServerByApp.onWarmupCompleted.IAuthTabCallback)) {
            ICustomTabsCallbackStub();
            return;
        }
        if (Intrinsics.areEqual(sendmsgtoserverbyapp, sendMsgToServerByApp.onExtraCallbackWithResult.onWarmupCompleted)) {
            ICustomTabsCallbackStubProxy();
            return;
        }
        if (Intrinsics.areEqual(sendmsgtoserverbyapp, sendMsgToServerByApp.IAuthTabCallbackStub.onNavigationEvent)) {
            isEngagementSignalsApiAvailable();
            return;
        }
        if (sendmsgtoserverbyapp instanceof sendMsgToServerByApp.onExtraCallback) {
            int i13 = onActivityLayout + 31;
            onMinimized = i13 % 128;
            int i14 = i13 % 2;
            IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, ((sendMsgToServerByApp.onExtraCallback) sendmsgtoserverbyapp).onWarmupCompleted()}, -1895128973, 1895128990, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
            return;
        }
        if (sendmsgtoserverbyapp instanceof sendMsgToServerByApp.onNavigationEvent) {
            onExtraCallbackWithResult(((sendMsgToServerByApp.onNavigationEvent) sendmsgtoserverbyapp).IAuthTabCallback());
        } else if (sendmsgtoserverbyapp instanceof sendMsgToServerByApp.IAuthTabCallback) {
            IAuthTabCallback(((sendMsgToServerByApp.IAuthTabCallback) sendmsgtoserverbyapp).onExtraCallback());
        } else {
            if (!(sendmsgtoserverbyapp instanceof sendMsgToServerByApp.onTransact)) {
                throw new NoWhenBranchMatchedException();
            }
            onNavigationEvent(((sendMsgToServerByApp.onTransact) sendmsgtoserverbyapp).onNavigationEvent());
        }
    }

    private final void onWarmupCompleted(String str) throws Throwable {
        long jCurrentTimeMillis;
        int i = 2 % 2;
        int i2 = onMinimized + 85;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.IAuthTabCallback < 500) {
                return;
            }
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.IAuthTabCallback < 500) {
                return;
            }
        }
        this.IAuthTabCallback = jCurrentTimeMillis;
        if (isPreload.onWarmupCompleted.ICustomTabsCallback()) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            String string = getString(R.string.tns_library_search_description);
            Intrinsics.checkNotNullExpressionValue(string, "");
            new TdsToastV1.onNavigationEvent(fragmentActivityRequireActivity, string).onNavigationEvent();
            int i3 = onMinimized + 89;
            onActivityLayout = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.onNavigationEvent.onExtraCallback(str);
        Object[] objArr = new Object[1];
        a(new char[]{41500, 10299, 41583, 57810, 21138, 49626, 39489, 50928, 33822, 55363, 30749, 6518, 61071, 15997, 8685, 13274, 53567, 5298, 50995, 18967, 15295, 19215}, View.MeasureSpec.getMode(0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{48924, 9978, 49006, 61187, 59218, 29708, 46437, 59860, 39198, 54916, 52673, 13907}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
        SessionTrackerb.onExtraCallbackWithResult(asInterface(), getContext(), convertAnyToMap.IAuthTabCallback(convertAnyToMap.IAuthTabCallback(convertAnyToMap.IAuthTabCallback(strIntern, ((String) objArr2[0]).intern(), "all_tab"), "service_referrer", "all_tab"), "recommendedQuery", str), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r1
      0x001f: PHI (r1v5 java.util.Map) = (r1v4 java.util.Map), (r1v10 java.util.Map) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(String str) throws Throwable {
        Map mapOnExtraCallback;
        int i = 2 % 2;
        int i2 = onMinimized + 125;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            mapOnExtraCallback = access8100.onExtraCallback();
            int i3 = 27 / 0;
            if (str != null) {
                mapOnExtraCallback.put("placeholder", str);
            }
        } else {
            mapOnExtraCallback = access8100.onExtraCallback();
            if (str != null) {
            }
        }
        Unit unit = Unit.INSTANCE;
        Object[] objArr = {this, "ICON:search", 1231793L, access8100.onExtraCallbackWithResult(mapOnExtraCallback)};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, 353614238, -353614215, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback);
        int i4 = onMinimized + 29;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void ICustomTabsCallback_Parcel() throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 1;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.onTransact();
        SessionTrackerb sessionTrackerbAsInterface = asInterface();
        Context context = getContext();
        Object[] objArr = new Object[1];
        b((byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) - 59), (short) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 93), (-1340405816) + TextUtils.getCapsMode("", 0, 0), TextUtils.indexOf("", "", 0, 0) - 95, (-1183452578) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerbAsInterface, context, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i4 = onMinimized + 101;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void ICustomTabsService() throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 71;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        b((byte) (Color.red(0) - 95), (short) (113 - Color.blue(0)), Drawable.resolveOpacity(0, 0) - 1340405822, (-94) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (-1183452597) + (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, "ICON:setting", 1253281L, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "setting"))}, 353614238, -353614215, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        int i4 = onActivityLayout + 113;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
    }

    static /* synthetic */ void onWarmupCompleted(TotalServiceFragment totalServiceFragment, String str, boolean z, getNetwork getnetwork, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onMinimized + 3;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            Object[] objArr = new Object[1];
            b((byte) (76 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (short) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 84), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1340405860, (-95) - View.combineMeasuredStates(0, 0), (-1183452580) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
            str = ((String) objArr[0]).intern();
        }
        if ((i & 2) != 0) {
            int i4 = onActivityLayout + 47;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if ((i & 4) != 0) {
            getnetwork = null;
        }
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{totalServiceFragment, str, Boolean.valueOf(z), getnetwork}, 720440420, -720440406, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    private static /* synthetic */ Object access000(Object[] objArr) throws Throwable {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        String str = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        getNetwork getnetwork = (getNetwork) objArr[3];
        int i = 2 % 2;
        int i2 = onActivityLayout + 77;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        totalServiceFragment.onNavigationEvent.IAuthTabCallback();
        if (str != null) {
            int i4 = onActivityLayout + 119;
            int i5 = i4 % 128;
            onMinimized = i5;
            int i6 = i4 % 2;
            if (zBooleanValue) {
                int i7 = i5 + 19;
                onActivityLayout = i7 % 128;
                int i8 = i7 % 2;
                totalServiceFragment.onExtraCallback(str, getnetwork);
                return null;
            }
            SessionTrackerb.onExtraCallbackWithResult(totalServiceFragment.asInterface(), totalServiceFragment.getContext(), str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            int i9 = onMinimized + 59;
            onActivityLayout = i9 % 128;
            int i10 = i9 % 2;
        }
        return null;
    }

    private final void ICustomTabsCallbackStub() throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 95;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        b((byte) ((-96) - ExpandableListView.getPackedPositionChild(0L)), (short) (113 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (-1340405821) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) - 94, (-1183452596) - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, "securityHome", 1253281L, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "securityHome"))}, 353614238, -353614215, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        int i4 = onMinimized + 79;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) throws Throwable {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        getNetwork getnetwork = (getNetwork) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        if ((iIntValue & 2) != 0) {
            int i2 = onMinimized + 113;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
            getnetwork = null;
        }
        totalServiceFragment.IAuthTabCallback(zBooleanValue, getnetwork);
        int i4 = onActivityLayout + 47;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return null;
    }

    private final void IAuthTabCallback(boolean z, getNetwork getnetwork) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 81;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        setEnableTabClick setenabletabclick = this.onNavigationEvent;
        String string = getString(im.toss.features.alltab.feature.total_service.R.string.alltab_feature_total_service_bank);
        Intrinsics.checkNotNullExpressionValue(string, "");
        setenabletabclick.IAuthTabCallback(string, z);
        onExtraCallback(DERSet.onExtraCallback.onTrimMemory(), getnetwork);
        int i4 = onMinimized + 119;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = onMinimized + 105;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        setEnableTabClick setenabletabclick = this.onNavigationEvent;
        String string = getString(im.toss.features.alltab.feature.total_service.R.string.alltab_feature_total_service_bank);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {setenabletabclick, string, Boolean.valueOf(z)};
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        setEnableTabClick.IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 82794890, objArr, iOnWarmupCompleted, -82794885);
        int i4 = onMinimized + 7;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
    }

    private final void onRelationshipValidationResult() throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 33;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        setEnableTabClick setenabletabclick = this.onNavigationEvent;
        String string = getString(im.toss.features.alltab.feature.total_service.R.string.alltab_feature_total_service_customer_service);
        Intrinsics.checkNotNullExpressionValue(string, "");
        setenabletabclick.onWarmupCompleted(string);
        SessionTrackerb sessionTrackerbAsInterface = asInterface();
        Context context = getContext();
        Object[] objArr = new Object[1];
        a(new char[]{45721, 29387, 45802, 47906, 22851, 51723, 16367, 25438, 38043, 33459, 29644, 48344, 65034, 25741, 10812, 38516, 49594, 20050, 52467, 61371, 11062, 4581, 59015}, TextUtils.getOffsetAfter("", 0), objArr);
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerbAsInterface, context, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i4 = onActivityLayout + 7;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void ICustomTabsCallbackStubProxy() throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 97;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("category", "service_category");
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("view", "service_category_all_v3");
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("featured_type", "BUTTON");
        Object[] objArr = new Object[1];
        a(new char[]{47617, 44833, 47733, 26324, 56721, 20189, 30497, 11161, 39956}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, objArr);
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, "customer_service", 1214325L, access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), getString(im.toss.features.alltab.feature.total_service.R.string.alltab_feature_total_service_customer_service)), getWrite.IAuthTabCallback("service", "customer_service")})}, 353614238, -353614215, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        int i4 = onMinimized + 65;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallbackWithResult(List<NavigationBar> list) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 107;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.onWarmupCompleted(list);
        int i4 = onMinimized + 17;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        String str = (String) objArr[1];
        List list = (List) objArr[2];
        int i = 2 % 2;
        int i2 = onMinimized + 101;
        onActivityLayout = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (str == null) {
            return false;
        }
        boolean zOnExtraCallbackWithResult = SessionTrackerb.onExtraCallbackWithResult(totalServiceFragment.asInterface(), totalServiceFragment.getContext(), c4a.onExtraCallbackWithResult(str, getBackButtonBoundingClientRect.onNavigationEvent(list, totalServiceFragment.onExtraCallback())), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i3 = onMinimized + 3;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0) {
            return Boolean.valueOf(zOnExtraCallbackWithResult);
        }
        throw null;
    }

    static /* synthetic */ void IAuthTabCallback(TotalServiceFragment totalServiceFragment, String str, boolean z, Function0 function0, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = onActivityLayout + 57;
            onMinimized = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = {totalServiceFragment.onPostMessage()};
                z = ((Boolean) TotalServiceViewModel.onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 607668487, objArr, -607668460, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent())).booleanValue();
                int i4 = 29 / 0;
            } else {
                Object[] objArr2 = {totalServiceFragment.onPostMessage()};
                z = ((Boolean) TotalServiceViewModel.onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 607668487, objArr2, -607668460, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent())).booleanValue();
            }
        }
        totalServiceFragment.IAuthTabCallback(str, z, (Function0<Boolean>) function0);
        int i5 = onActivityLayout + 79;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(String str, boolean z, Function0<Boolean> function0) {
        int i = 2 % 2;
        if (z) {
            int i2 = onMinimized + 73;
            onActivityLayout = i2 % 128;
            if (i2 % 2 == 0) {
                if (((Boolean) function0.invoke()).booleanValue()) {
                    return;
                }
            } else {
                ((Boolean) function0.invoke()).booleanValue();
                throw null;
            }
        }
        if (str != null) {
            int i3 = onMinimized + 121;
            onActivityLayout = i3 % 128;
            int i4 = i3 % 2;
            SessionTrackerb.onExtraCallbackWithResult(asInterface(), getContext(), str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        getUrl geturl = (getUrl) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityLayout + 9;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        totalServiceFragment.onExtraCallbackWithResult(geturl.IAuthTabCallback());
        Object[] objArr2 = {totalServiceFragment, geturl.onExtraCallback(), geturl.IAuthTabCallback()};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        ((Boolean) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr2, -1243321, 1243329, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback)).booleanValue();
        int i4 = onActivityLayout + 39;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final void onWarmupCompleted(getUrl geturl) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 5;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            List<NavigationBar> listOnExtraCallbackWithResult = geturl.onExtraCallbackWithResult();
            if (listOnExtraCallbackWithResult != null) {
                int i3 = onActivityLayout + 83;
                onMinimized = i3 % 128;
                int i4 = i3 % 2;
                for (NavigationBar navigationBar : listOnExtraCallbackWithResult) {
                    IAuthTabCallback(geturl.onNavigationEvent().onExtraCallback() + "::" + navigationBar.onExtraCallback(), navigationBar);
                }
                return;
            }
            return;
        }
        geturl.onExtraCallbackWithResult();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onExtraCallbackWithResult(NavigationBarCapsuleTheme navigationBarCapsuleTheme, getNetwork getnetwork) throws Throwable {
        Pair pairIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 63;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        if (navigationBarCapsuleTheme instanceof NavigationBarCapsuleTheme.onNavigationEvent) {
            int i5 = i2 + 123;
            onMinimized = i5 % 128;
            int i6 = i5 % 2;
            NavigationBarCapsuleTheme.onNavigationEvent onnavigationevent = (NavigationBarCapsuleTheme.onNavigationEvent) navigationBarCapsuleTheme;
            pairIAuthTabCallback = getWrite.IAuthTabCallback(onnavigationevent.onWarmupCompleted().onExtraCallback(), onnavigationevent.onWarmupCompleted().onNavigationEvent());
        } else {
            if (!(navigationBarCapsuleTheme instanceof NavigationBarCapsuleTheme.onExtraCallbackWithResult)) {
                if (navigationBarCapsuleTheme instanceof NavigationBarCapsuleTheme.onExtraCallback) {
                    IAuthTabCallback((NavigationBarCapsuleTheme.onExtraCallback) navigationBarCapsuleTheme, getnetwork);
                    return;
                } else {
                    if (!(navigationBarCapsuleTheme instanceof NavigationBarCapsuleTheme.onWarmupCompleted)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    onExtraCallback((NavigationBarCapsuleTheme.onWarmupCompleted) navigationBarCapsuleTheme);
                    return;
                }
            }
            NavigationBarCapsuleTheme.onExtraCallbackWithResult onextracallbackwithresult = (NavigationBarCapsuleTheme.onExtraCallbackWithResult) navigationBarCapsuleTheme;
            pairIAuthTabCallback = getWrite.IAuthTabCallback(onextracallbackwithresult.asBinder(), onextracallbackwithresult.onNavigationEvent());
        }
        String str = (String) pairIAuthTabCallback.onExtraCallbackWithResult();
        List<NavigationBar> list = (List) pairIAuthTabCallback.IAuthTabCallback();
        onExtraCallbackWithResult(list);
        if (getnetwork == null) {
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            ((Boolean) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{this, str, list}, -1243321, 1243329, iOnExtraCallback3, iOnExtraCallback)).booleanValue();
            return;
        }
        onNavigationEvent(str, list, getnetwork);
        int i7 = onActivityLayout + 113;
        onMinimized = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(getNetwork getnetwork, NavigationBarCapsuleTheme navigationBarCapsuleTheme) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 37;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(navigationBarCapsuleTheme, getnetwork);
        int i4 = onActivityLayout + 29;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(String str, List<NavigationBar> list, getNetwork getnetwork) throws Throwable {
        boolean z;
        int i = 2 % 2;
        int i2 = onMinimized + 75;
        onActivityLayout = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getContext();
            obj.hashCode();
            throw null;
        }
        Context context = getContext();
        Activity activityIAuthTabCallback = context != null ? zzbc.IAuthTabCallback(context) : null;
        if (str != null) {
            String strOnExtraCallbackWithResult = c4a.onExtraCallbackWithResult(str, getBackButtonBoundingClientRect.onNavigationEvent(list, onExtraCallback()));
            if (activityIAuthTabCallback != null) {
                setForeground setforeground = setForeground.onExtraCallback;
                if (!setforeground.asBinder() || !asInterface().onWarmupCompleted(activityIAuthTabCallback, Uri.parse(str))) {
                    SessionTrackerb.onExtraCallbackWithResult(asInterface(), getContext(), strOnExtraCallbackWithResult, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                    setforeground.onExtraCallback();
                    return;
                }
                int i3 = onActivityLayout + 47;
                onMinimized = i3 % 128;
                if (i3 % 2 == 0) {
                    Uri.parse(str).getScheme();
                    throw null;
                }
                String scheme = Uri.parse(str).getScheme();
                if (scheme != null) {
                    int i4 = onMinimized + 51;
                    onActivityLayout = i4 % 128;
                    z = true;
                    if (i4 % 2 != 0) {
                        Object[] objArr = new Object[1];
                        a(new char[]{2657, 4984, 2568, 55946, 8957, 45489, 10955, 30320, 11362, 58119}, ExpandableListView.getPackedPositionGroup(1L), objArr);
                        if (!StringsKt.startsWith$default(scheme, ((String) objArr[0]).intern(), true, 5, (Object) null)) {
                            z = false;
                        }
                    } else {
                        Object[] objArr2 = new Object[1];
                        a(new char[]{2657, 4984, 2568, 55946, 8957, 45489, 10955, 30320, 11362, 58119}, ExpandableListView.getPackedPositionGroup(0L), objArr2);
                        if (!StringsKt.startsWith$default(scheme, ((String) objArr2[0]).intern(), false, 2, (Object) null)) {
                        }
                    }
                }
                onStopped.IAuthTabCallback(getnetwork, activityIAuthTabCallback, (Integer) null, z, new TotalServiceFragment$.ExternalSyntheticLambda26(this, strOnExtraCallbackWithResult), 2, (Object) null);
                return;
            }
        }
        int i5 = onMinimized + 55;
        onActivityLayout = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onWarmupCompleted(NavigationBarCapsuleTheme navigationBarCapsuleTheme) throws Throwable {
        Pair pairIAuthTabCallback;
        int i = 2 % 2;
        if (navigationBarCapsuleTheme instanceof NavigationBarCapsuleTheme.onNavigationEvent) {
            int i2 = onMinimized + 39;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
            NavigationBarCapsuleTheme.onNavigationEvent onnavigationevent = (NavigationBarCapsuleTheme.onNavigationEvent) navigationBarCapsuleTheme;
            pairIAuthTabCallback = getWrite.IAuthTabCallback(onnavigationevent.onWarmupCompleted().onWarmupCompleted(), onnavigationevent.onWarmupCompleted().onExtraCallbackWithResult());
        } else {
            if (!(navigationBarCapsuleTheme instanceof NavigationBarCapsuleTheme.onExtraCallbackWithResult)) {
                if (navigationBarCapsuleTheme instanceof NavigationBarCapsuleTheme.onExtraCallback) {
                    IAuthTabCallback((NavigationBarCapsuleTheme.onExtraCallback) navigationBarCapsuleTheme);
                    return;
                } else {
                    if (!(navigationBarCapsuleTheme instanceof NavigationBarCapsuleTheme.onWarmupCompleted)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IAuthTabCallback((NavigationBarCapsuleTheme.onWarmupCompleted) navigationBarCapsuleTheme);
                    return;
                }
            }
            int i4 = onActivityLayout + 5;
            onMinimized = i4 % 128;
            if (i4 % 2 == 0) {
                NavigationBarCapsuleTheme.onExtraCallbackWithResult onextracallbackwithresult = (NavigationBarCapsuleTheme.onExtraCallbackWithResult) navigationBarCapsuleTheme;
                getWrite.IAuthTabCallback(onextracallbackwithresult.onWarmupCompleted(), onextracallbackwithresult.onTransact());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            NavigationBarCapsuleTheme.onExtraCallbackWithResult onextracallbackwithresult2 = (NavigationBarCapsuleTheme.onExtraCallbackWithResult) navigationBarCapsuleTheme;
            pairIAuthTabCallback = getWrite.IAuthTabCallback(onextracallbackwithresult2.onWarmupCompleted(), onextracallbackwithresult2.onTransact());
        }
        String str = (String) pairIAuthTabCallback.onExtraCallbackWithResult();
        List<NavigationBar> list = (List) pairIAuthTabCallback.IAuthTabCallback();
        if (list != null) {
            for (NavigationBar navigationBar : list) {
                IAuthTabCallback(str + navigationBar.onExtraCallback(), navigationBar);
                int i5 = onActivityLayout + 83;
                onMinimized = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        int i7 = onMinimized + 99;
        onActivityLayout = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(NavigationBarCapsuleTheme.onExtraCallback onextracallback, getNetwork getnetwork) throws Throwable {
        String strIAuthTabCallback;
        String strIAuthTabCallback2;
        NavigationBarCapsuleTheme.onExtraCallback onextracallbackOnNavigationEvent = onextracallback;
        int i = 2 % 2;
        Object obj = null;
        if (onextracallbackOnNavigationEvent instanceof NavigationBarCapsuleTheme.onExtraCallback.onNavigationEvent) {
            NavigationBarCapsuleTheme.onExtraCallback.onNavigationEvent onnavigationevent = (NavigationBarCapsuleTheme.onExtraCallback.onNavigationEvent) onextracallbackOnNavigationEvent;
            String strAsInterface = onnavigationevent.asInterface();
            if (strAsInterface != null) {
                Object[] objArr = new Object[1];
                a(new char[]{36845, 22104, 36786, 40866, 56314, 18606, 42580, 64233, 43507, 42547, 61765, 9585, 50045}, TextUtils.getTrimmedLength(""), objArr);
                strIAuthTabCallback = convertAnyToMap.IAuthTabCallback(strAsInterface, ((String) objArr[0]).intern(), "2.0");
            } else {
                strIAuthTabCallback = null;
            }
            if (setButtonText.onExtraCallbackWithResult.IAuthTabCallback()) {
                int i2 = onMinimized + 113;
                onActivityLayout = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 99 / 0;
                    strIAuthTabCallback2 = strIAuthTabCallback != null ? convertAnyToMap.IAuthTabCallback(strIAuthTabCallback, "isNavigationMission", "true") : null;
                } else if (strIAuthTabCallback != null) {
                }
                onextracallbackOnNavigationEvent = NavigationBarCapsuleTheme.onExtraCallback.onNavigationEvent.onNavigationEvent(onnavigationevent, (String) null, (getBackButtonVisibility) null, (getBackButtonVisibility) null, (fromARGBInt) null, (List) null, (List) null, strIAuthTabCallback2, (List) null, 191, (Object) null);
            } else {
                onextracallbackOnNavigationEvent = NavigationBarCapsuleTheme.onExtraCallback.onNavigationEvent.onNavigationEvent(onnavigationevent, (String) null, (getBackButtonVisibility) null, (getBackButtonVisibility) null, (fromARGBInt) null, (List) null, (List) null, strIAuthTabCallback, (List) null, 191, (Object) null);
            }
        }
        boolean z = onextracallbackOnNavigationEvent instanceof NavigationBarCapsuleTheme.onExtraCallback.onExtraCallback;
        getNetwork getnetwork2 = z ? null : getnetwork;
        if (z) {
            setForeground.onExtraCallback.IAuthTabCallback();
        }
        setLaunchParamsTag setlaunchparamstagOnWarmupCompleted = onWarmupCompleted(onextracallbackOnNavigationEvent);
        if (setlaunchparamstagOnWarmupCompleted != null) {
            String strOnNavigationEvent = setlaunchparamstagOnWarmupCompleted.onNavigationEvent();
            if (strOnNavigationEvent != null) {
                onExtraCallback(c4a.onExtraCallbackWithResult(strOnNavigationEvent, onWarmupCompleted(onextracallbackOnNavigationEvent.onExtraCallback(), setlaunchparamstagOnWarmupCompleted.onExtraCallback())), getnetwork2);
                return;
            }
            return;
        }
        if (!(!(onextracallbackOnNavigationEvent instanceof NavigationBarCapsuleTheme.onExtraCallback.IAuthTabCallbackDefault))) {
            IAuthTabCallback(((NavigationBarCapsuleTheme.onExtraCallback.IAuthTabCallbackDefault) onextracallbackOnNavigationEvent).onTransact(), getnetwork2);
            int i4 = onActivityLayout + 41;
            onMinimized = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (onextracallbackOnNavigationEvent instanceof NavigationBarCapsuleTheme.onExtraCallback.IAuthTabCallback) {
            int i5 = onMinimized + 5;
            onActivityLayout = i5 % 128;
            int i6 = i5 % 2;
            IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, ((NavigationBarCapsuleTheme.onExtraCallback.IAuthTabCallback) onextracallbackOnNavigationEvent).asInterface(), true, getnetwork2}, 720440420, -720440406, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
            return;
        }
        if (onextracallbackOnNavigationEvent instanceof NavigationBarCapsuleTheme.onExtraCallback.asBinder) {
            int i7 = onActivityLayout + 67;
            onMinimized = i7 % 128;
            if (i7 % 2 != 0) {
                onExtraCallbackWithResult(((NavigationBarCapsuleTheme.onExtraCallback.asBinder) onextracallbackOnNavigationEvent).onExtraCallback());
                return;
            } else {
                onExtraCallbackWithResult(((NavigationBarCapsuleTheme.onExtraCallback.asBinder) onextracallbackOnNavigationEvent).onExtraCallback());
                throw null;
            }
        }
        onExtraCallbackWithResult(onextracallbackOnNavigationEvent.onExtraCallback());
        String strAsInterface2 = onextracallbackOnNavigationEvent.asInterface();
        if (strAsInterface2 != null) {
            int i8 = onActivityLayout + 117;
            onMinimized = i8 % 128;
            int i9 = i8 % 2;
            onExtraCallback(c4a.onExtraCallbackWithResult(strAsInterface2, getBackButtonBoundingClientRect.onNavigationEvent(onextracallbackOnNavigationEvent.onExtraCallback(), onExtraCallback())), getnetwork2);
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 77;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb.onExtraCallbackWithResult(totalServiceFragment.asInterface(), totalServiceFragment.getContext(), filterCreatePageParams.onExtraCallback(Uri.parse(str), "scale_transition", "true"), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onMinimized + 27;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r15 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r15 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        r1 = android.net.Uri.parse(r14).getScheme();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r7 = true;
        r8 = new java.lang.Object[1];
        a(new char[]{2657, 4984, 2568, 55946, 8957, 45489, 10955, 30320, 11362, 58119}, 1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r1, ((java.lang.String) r8[0]).intern(), false, 2, (java.lang.Object) null) != true) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
    
        o.onStopped.IAuthTabCallback(r15, r5, (java.lang.Integer) null, r7, new im.toss.features.alltab.feature.total_service.feature.total_service.TotalServiceFragment$.ExternalSyntheticLambda25(r13, r14), 2, (java.lang.Object) null);
        r14 = im.toss.features.alltab.feature.total_service.feature.total_service.TotalServiceFragment.onActivityLayout + 31;
        im.toss.features.alltab.feature.total_service.feature.total_service.TotalServiceFragment.onMinimized = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
    
        if ((r14 % 2) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(String str, getNetwork getnetwork) throws Throwable {
        Activity activity;
        Activity activityIAuthTabCallback;
        int i = 2 % 2;
        Context context = getContext();
        Object obj = null;
        if (context != null) {
            int i2 = onActivityLayout + 33;
            onMinimized = i2 % 128;
            if (i2 % 2 == 0) {
                activityIAuthTabCallback = zzbc.IAuthTabCallback(context);
                int i3 = 93 / 0;
            } else {
                activityIAuthTabCallback = zzbc.IAuthTabCallback(context);
            }
            activity = activityIAuthTabCallback;
        } else {
            activity = null;
        }
        if (activity == null) {
            int i4 = onMinimized + 59;
            onActivityLayout = i4 % 128;
            if (i4 % 2 == 0) {
                setForeground.onExtraCallback.IAuthTabCallback();
                return;
            } else {
                setForeground.onExtraCallback.IAuthTabCallback();
                obj.hashCode();
                throw null;
            }
        }
        setForeground setforeground = setForeground.onExtraCallback;
        if (setforeground.asBinder() && asInterface().onWarmupCompleted(activity, Uri.parse(str))) {
            int i5 = onMinimized + 59;
            onActivityLayout = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 25 / 0;
            }
        }
        setforeground.IAuthTabCallback();
        SessionTrackerb.onExtraCallbackWithResult(asInterface(), getContext(), str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i7 = onActivityLayout + 77;
        onMinimized = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private final void onWarmupCompleted(RandomMiniAppRecommendationState.Item item, String str) throws Throwable {
        Object objIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onMinimized + 93;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(item.onExtraCallback());
            TotalServiceViewModel.onWarmupCompleted(onPostMessage(), (Long) null, 1, (Object) null);
            Object[] objArr = {this, str, item.onExtraCallback()};
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            objIAuthTabCallback = IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, -1243321, 1243329, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback);
        } else {
            onExtraCallbackWithResult(item.onExtraCallback());
            TotalServiceViewModel.onWarmupCompleted(onPostMessage(), (Long) null, 1, (Object) null);
            Object[] objArr2 = {this, str, item.onExtraCallback()};
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            objIAuthTabCallback = IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr2, -1243321, 1243329, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2);
        }
        ((Boolean) objIAuthTabCallback).booleanValue();
        int i3 = onMinimized + 61;
        onActivityLayout = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private final void onNavigationEvent(RandomMiniAppRecommendationState.Item item) {
        Iterator it;
        int i = 2 % 2;
        int i2 = onActivityLayout + 99;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        List listOnTransact = item.onTransact();
        if (listOnTransact != null) {
            int i4 = onMinimized + 59;
            onActivityLayout = i4 % 128;
            if (i4 % 2 != 0) {
                it = listOnTransact.iterator();
                int i5 = 35 / 0;
            } else {
                it = listOnTransact.iterator();
            }
            while (it.hasNext()) {
                NavigationBar navigationBar = (NavigationBar) it.next();
                IAuthTabCallback("random_miniapp_recommendation::" + item.IAuthTabCallbackDefault() + "::" + navigationBar.onExtraCallback(), navigationBar);
                int i6 = onMinimized + 65;
                onActivityLayout = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    private final void IAuthTabCallback(Rect rect) {
        int i = 2 % 2;
        int i2 = onMinimized + 85;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        this.readTypedObject.onExtraCallbackWithResult(rect);
        int i4 = onMinimized + 13;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 23;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            this.readTypedObject.onExtraCallbackWithResult(z);
            throw null;
        }
        this.readTypedObject.onExtraCallbackWithResult(z);
        int i3 = onMinimized + 31;
        onActivityLayout = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 70 / 0;
        }
    }

    private final void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onMinimized + 123;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            this.readTypedObject.onWarmupCompleted();
            int i3 = 13 / 0;
        } else {
            this.readTypedObject.onWarmupCompleted();
        }
        int i4 = onActivityLayout + 113;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IAuthTabCallback(NavigationBarCapsuleTheme.onExtraCallback onextracallback) throws Throwable {
        int i = 2 % 2;
        if (onextracallback instanceof NavigationBarCapsuleTheme.onExtraCallback.IAuthTabCallbackDefault) {
            int i2 = onActivityLayout + 107;
            onMinimized = i2 % 128;
            if (i2 % 2 != 0) {
                onWarmupCompleted(((NavigationBarCapsuleTheme.onExtraCallback.IAuthTabCallbackDefault) onextracallback).onTransact());
                return;
            } else {
                onWarmupCompleted(((NavigationBarCapsuleTheme.onExtraCallback.IAuthTabCallbackDefault) onextracallback).onTransact());
                int i3 = 89 / 0;
                return;
            }
        }
        if (onextracallback instanceof NavigationBarCapsuleTheme.onExtraCallback.IAuthTabCallback) {
            ICustomTabsCallbackStub();
            return;
        }
        if (onextracallback instanceof NavigationBarCapsuleTheme.onExtraCallback.onTransact) {
            IAuthTabCallback((NavigationBarCapsuleTheme.onExtraCallback.onTransact) onextracallback);
            return;
        }
        List<NavigationBar> listIAuthTabCallbackDefault = onextracallback.IAuthTabCallbackDefault();
        if (listIAuthTabCallbackDefault != null) {
            int i4 = onActivityLayout + 87;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            int i6 = onMinimized + 111;
            onActivityLayout = i6 % 128;
            loop0: while (true) {
                int i7 = i6 % 2;
                for (NavigationBar navigationBar : listIAuthTabCallbackDefault) {
                    IAuthTabCallback(onextracallback.onExtraCallbackWithResult() + navigationBar.onExtraCallback(), navigationBar);
                    int i8 = onMinimized + 123;
                    onActivityLayout = i8 % 128;
                    if (i8 % 2 != 0) {
                        break;
                    }
                }
                i6 = 5;
            }
        }
        int i9 = onMinimized + 91;
        onActivityLayout = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 68 / 0;
        }
    }

    private final void onNavigationEvent(NavigationBarCapsuleTheme.onExtraCallback.onExtraCallback onextracallback) throws Throwable {
        String strOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onMinimized + 61;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        getHomeButtonBoundingClientRectAsync gethomebuttonboundingclientrectasyncOnTransact = onextracallback.onTransact();
        if (gethomebuttonboundingclientrectasyncOnTransact != null && (strOnWarmupCompleted = gethomebuttonboundingclientrectasyncOnTransact.onWarmupCompleted()) != null) {
            IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, "launchpadAdTooltip::" + onextracallback.onExtraCallbackWithResult() + "::" + strOnWarmupCompleted + "::" + onextracallback.IAuthTabCallback_Parcel(), 5166478L, access8100.onNavigationEvent(getWrite.IAuthTabCallback("ad_id", strOnWarmupCompleted))}, 353614238, -353614215, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        }
        int i4 = onActivityLayout + 7;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IAuthTabCallback(NavigationBarCapsuleTheme.onExtraCallback.onTransact ontransact) {
        int i = 2 % 2;
        List<NavigationBar> listIAuthTabCallbackDefault = ontransact.IAuthTabCallbackDefault();
        if (listIAuthTabCallbackDefault != null) {
            int i2 = onMinimized + 65;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
            int i4 = onActivityLayout + 9;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            for (NavigationBar navigationBar : listIAuthTabCallbackDefault) {
                this.onNavigationEvent.onExtraCallbackWithResult(ontransact.onExtraCallbackWithResult() + navigationBar.onExtraCallback(), navigationBar);
            }
        }
    }

    private final void mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = onMinimized + 117;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.onNavigationEvent};
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        setEnableTabClick.IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 955166506, objArr, iOnWarmupCompleted, -955166504);
        if (!onActivityLayout()) {
            int i4 = onActivityLayout + 49;
            onMinimized = i4 % 128;
            if (i4 % 2 == 0) {
                TotalServiceViewModel.onExtraCallback(onPostMessage(), false, 0, (Object) null);
            } else {
                TotalServiceViewModel.onExtraCallback(onPostMessage(), false, 1, (Object) null);
            }
        }
        int i5 = onActivityLayout + 33;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = onMinimized + 23;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        onPostMessage().IAuthTabCallback(false);
        int i4 = onActivityLayout + 97;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
    }

    private final void extraCommand() {
        int i = 2 % 2;
        int i2 = onMinimized + 55;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.onNavigationEvent();
        int i4 = onActivityLayout + 39;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
    }

    private final void onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 7;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.onExtraCallback(str, str2);
        int i4 = onActivityLayout + 49;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IAuthTabCallback(String str, NavigationBar navigationBar) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 25;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.onNavigationEvent(str, navigationBar);
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        String str = (String) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        Map map = (Map) objArr[3];
        int i = 2 % 2;
        int i2 = onActivityLayout + 125;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            totalServiceFragment.onNavigationEvent.onExtraCallback(str, jLongValue, map);
            int i3 = 13 / 0;
        } else {
            totalServiceFragment.onNavigationEvent.onExtraCallback(str, jLongValue, map);
        }
        int i4 = onActivityLayout + 17;
        onMinimized = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(RandomMiniAppLaunchpadLogState randomMiniAppLaunchpadLogState) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 45;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            this.onNavigationEvent.onWarmupCompleted(randomMiniAppLaunchpadLogState);
            throw null;
        }
        this.onNavigationEvent.onWarmupCompleted(randomMiniAppLaunchpadLogState);
        int i3 = onMinimized + 23;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        RandomMiniAppLaunchpadLogState randomMiniAppLaunchpadLogState = (RandomMiniAppLaunchpadLogState) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = onActivityLayout + 73;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        totalServiceFragment.onNavigationEvent.onWarmupCompleted(randomMiniAppLaunchpadLogState, str);
        int i4 = onMinimized + 55;
        onActivityLayout = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void onUnminimized() throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 27;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.onExtraCallbackWithResult();
        SessionTrackerb sessionTrackerbAsInterface = asInterface();
        Context context = getContext();
        Object[] objArr = new Object[1];
        a(new char[]{394, 2014, 505, 52791, 8041, 35873, 59811, 46354, 10120, 63398, 13798, 27284, 19737, 4504, 27670, 16440, 29354, 15168, 35526, 14817, 38947, 25838, 41148}, (-1) - TextUtils.lastIndexOf("", '0'), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{48924, 9978, 49006, 61187, 59218, 29708, 46437, 59860, 39198, 54916, 52673, 13907}, (-1) - ImageFormat.getBitsPerPixel(0), objArr2);
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerbAsInterface, context, convertAnyToMap.IAuthTabCallback(strIntern, ((String) objArr2[0]).intern(), onExtraCallback()), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i4 = onActivityLayout + 113;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void isEngagementSignalsApiAvailable() throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 17;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        b((byte) (ExpandableListView.getPackedPositionType(0L) - 95), (short) (113 - TextUtils.indexOf("", "")), View.getDefaultSize(0, 0) - 1340405822, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 95, Color.argb(0, 0, 0, 0) - 1183452596, objArr);
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, "profileImage", 1253281L, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "profile"))}, 353614238, -353614215, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        int i4 = onMinimized + 1;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void postMessage() {
        KeyEvent.Callback decorView;
        int i = 2 % 2;
        int i2 = onMinimized + 57;
        onActivityLayout = i2 % 128;
        ViewGroup viewGroup = null;
        if (i2 % 2 != 0) {
            getActivity();
            viewGroup.hashCode();
            throw null;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i3 = onActivityLayout + 107;
            onMinimized = i3 % 128;
            if (i3 % 2 == 0) {
                activity.getWindow();
                viewGroup.hashCode();
                throw null;
            }
            Window window = activity.getWindow();
            decorView = window != null ? window.getDecorView() : null;
        }
        if (decorView instanceof ViewGroup) {
            int i4 = onActivityLayout + 1;
            int i5 = i4 % 128;
            onMinimized = i5;
            int i6 = i4 % 2;
            viewGroup = (ViewGroup) decorView;
            int i7 = i5 + 111;
            onActivityLayout = i7 % 128;
            int i8 = i7 % 2;
        }
        if (viewGroup == null) {
            return;
        }
        onMinimized().onWarmupCompleted(viewGroup);
    }

    private final void newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = onMinimized + 7;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        onMinimized().IAuthTabCallback();
        int i4 = onActivityLayout + 25;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onNavigationEvent(onFailed onfailed) {
        int i = 2 % 2;
        int i2 = onMinimized + 5;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        if (!this.asInterface.IAuthTabCallback(onfailed)) {
            onWarmupCompleted(onfailed);
            return;
        }
        int i4 = onActivityLayout + 27;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(onFailed onfailed) {
        setName setnameOnExtraCallbackWithResult;
        int i = 2 % 2;
        setDisplay setdisplayOnTransact = this.asInterface.onTransact();
        if (setdisplayOnTransact != null) {
            if (onfailed == null || (setnameOnExtraCallbackWithResult = onfailed.onExtraCallbackWithResult()) == null) {
                access000();
                int i2 = onActivityLayout + 3;
                onMinimized = i2 % 128;
                int i3 = i2 % 2;
            } else {
                int i4 = onActivityLayout + 87;
                onMinimized = i4 % 128;
                int i5 = i4 % 2;
                if (setnameOnExtraCallbackWithResult.onNavigationEvent() != setdisplayOnTransact.onWarmupCompleted()) {
                }
            }
        }
        TitleBar.IAuthTabCallback(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 503424292, -503424290, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{extraCallback(), onfailed}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
        if (onfailed == null) {
            newAuthTabSession();
        } else {
            prefetch();
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityLayout + 51;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        initColorModels initcolormodelsOnNavigationEvent = totalServiceFragment.asInterface.onNavigationEvent();
        if (initcolormodelsOnNavigationEvent != null) {
            totalServiceFragment.onWarmupCompleted((onFailed) initcolormodelsOnNavigationEvent.IAuthTabCallback());
            return null;
        }
        int i4 = onMinimized + 39;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object onRelationshipValidationResult(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityLayout + 113;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        totalServiceFragment.asInterface.onExtraCallback();
        int i4 = onMinimized + 123;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
      0x0020: PHI (r1v5 androidx.fragment.app.FragmentActivity) = (r1v4 androidx.fragment.app.FragmentActivity), (r1v11 androidx.fragment.app.FragmentActivity) binds: [B:8:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void prefetch() {
        FragmentActivity activity;
        KeyEvent.Callback decorView;
        View view;
        int i = 2 % 2;
        int i2 = onActivityLayout + 91;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            activity = getActivity();
            int i3 = 42 / 0;
            if (activity != null) {
                Window window = activity.getWindow();
                if (window != null) {
                    int i4 = onMinimized + 55;
                    onActivityLayout = i4 % 128;
                    if (i4 % 2 != 0) {
                        window.getDecorView();
                        throw null;
                    }
                    decorView = window.getDecorView();
                } else {
                    decorView = null;
                }
            }
        } else {
            activity = getActivity();
            if (activity != null) {
            }
        }
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            return;
        }
        TitleBar titleBarExtraCallback = extraCallback();
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || (view = parentFragment.getView()) == null) {
            view = getView();
            int i5 = onMinimized + 85;
            onActivityLayout = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 5;
            }
        }
        titleBarExtraCallback.onExtraCallback(viewGroup, viewLifecycleOwner, view);
    }

    private final void newAuthTabSession() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 27;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            extraCallback().onExtraCallbackWithResult();
            this.asInterface.IAuthTabCallbackStubProxy();
        } else {
            extraCallback().onExtraCallbackWithResult();
            this.asInterface.IAuthTabCallbackStubProxy();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r1.onWarmupCompleted() == r5.onExtraCallbackWithResult().onNavigationEvent()) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        r4.asInterface.onNavigationEvent(r5.onExtraCallbackWithResult().onNavigationEvent());
        newSession();
        access000();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r0 == r5.onExtraCallbackWithResult().onNavigationEvent()) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(onFailed onfailed) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 113;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            setDisplay setdisplayOnTransact = this.asInterface.onTransact();
            if (setdisplayOnTransact != null) {
                int i3 = onMinimized + 117;
                onActivityLayout = i3 % 128;
                if (i3 % 2 != 0) {
                    long jOnWarmupCompleted = setdisplayOnTransact.onWarmupCompleted();
                    int i4 = 46 / 0;
                }
            }
            onWarmupCompleted((addAttrToClient) new addAttrToClient.onWarmupCompleted(onfailed.onExtraCallbackWithResult()));
            return;
        }
        this.asInterface.onTransact();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void access000() {
        int i = 2 % 2;
        setDisplay setdisplayOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult();
        if (setdisplayOnExtraCallbackWithResult != null) {
            newSession();
            Object[] objArr = {onPostMessage()};
            Long l = (Long) TotalServiceViewModel.onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 503031997, objArr, -503031987, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
            long jOnWarmupCompleted = setdisplayOnExtraCallbackWithResult.onWarmupCompleted();
            if (l != null && l.longValue() == jOnWarmupCompleted) {
                TotalServiceViewModel.IAuthTabCallback(onPostMessage(), true, (showBackButton.onNavigationEvent) null, (Long) null, (Long) null, 14, (Object) null);
            }
            if (setdisplayOnExtraCallbackWithResult.onExtraCallbackWithResult()) {
                return;
            }
            int i2 = onActivityLayout + 33;
            onMinimized = i2 % 128;
            if (i2 % 2 == 0) {
                setdisplayOnExtraCallbackWithResult.onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String strOnNavigationEvent = setdisplayOnExtraCallbackWithResult.onNavigationEvent();
            if (strOnNavigationEvent != null) {
                SessionTrackerb.onExtraCallbackWithResult(asInterface(), getContext(), strOnNavigationEvent, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                int i3 = onActivityLayout + 95;
                onMinimized = i3 % 128;
                int i4 = i3 % 2;
            }
        }
    }

    private final void IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onMinimized + 41;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        extraCallback().onWarmupCompleted();
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void newSession() {
        setDisableOnInit.onWarmupCompleted onwarmupcompleted;
        Long lValueOf;
        int i = 2 % 2;
        setDisableOnInit.onWarmupCompleted onwarmupcompleted2 = (setDisableOnInit) isDisplay.onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 636109720, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{this.asInterface}, -636109719);
        int iIAuthTabCallback = 0;
        if (!(onwarmupcompleted2 instanceof setDisableOnInit.onWarmupCompleted)) {
            onwarmupcompleted = null;
        } else {
            int i2 = onActivityLayout;
            int i3 = i2 + 99;
            onMinimized = i3 % 128;
            if (i3 % 2 == 0) {
                onwarmupcompleted = onwarmupcompleted2;
                int i4 = 61 / 0;
            } else {
                onwarmupcompleted = onwarmupcompleted2;
            }
            int i5 = i2 + 85;
            onMinimized = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 / 4;
            }
        }
        TitleBar titleBarExtraCallback = extraCallback();
        String strIAuthTabCallback = this.asInterface.IAuthTabCallback();
        if (onwarmupcompleted != null) {
            int i7 = onMinimized + 107;
            onActivityLayout = i7 % 128;
            int i8 = i7 % 2;
            setDisplay setdisplayOnNavigationEvent = onwarmupcompleted.onNavigationEvent();
            lValueOf = setdisplayOnNavigationEvent != null ? Long.valueOf(setdisplayOnNavigationEvent.onWarmupCompleted()) : null;
        }
        if (onwarmupcompleted != null) {
            int i9 = onMinimized + 57;
            onActivityLayout = i9 % 128;
            if (i9 % 2 != 0) {
                onwarmupcompleted.IAuthTabCallback();
                throw null;
            }
            iIAuthTabCallback = onwarmupcompleted.IAuthTabCallback();
        }
        titleBarExtraCallback.IAuthTabCallback(strIAuthTabCallback, lValueOf, iIAuthTabCallback);
    }

    private final void onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = onMinimized + 91;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.IAuthTabCallback(str);
        int i4 = onMinimized + 53;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
    }

    private final void IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 109;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            this.onNavigationEvent.onNavigationEvent(str);
            int i3 = 32 / 0;
        } else {
            this.onNavigationEvent.onNavigationEvent(str);
        }
        int i4 = onMinimized + 17;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onExtraCallback(Bundle bundle) throws NoWhenBranchMatchedException {
        boolean zBooleanValue;
        Long lOnExtraCallback;
        getIndexByTag getindexbytagOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onMinimized + 121;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        setTabItem settabitemIAuthTabCallback = this.onExtraCallbackWithResult.IAuthTabCallback(bundle, getArguments());
        asInterface(settabitemIAuthTabCallback.IAuthTabCallback());
        this.onNavigationEvent.onExtraCallbackWithResult(onExtraCallback());
        onPostMessage().IAuthTabCallback(onExtraCallback());
        setTabItem.onExtraCallback.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = settabitemIAuthTabCallback.onExtraCallbackWithResult();
        if (iAuthTabCallbackOnExtraCallbackWithResult instanceof setTabItem.onExtraCallback.IAuthTabCallback) {
            int i4 = onMinimized + 95;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
            onExtraCallbackWithResult(iAuthTabCallbackOnExtraCallbackWithResult.onExtraCallbackWithResult());
        } else {
            if (iAuthTabCallbackOnExtraCallbackWithResult instanceof setTabItem.onExtraCallback.onWarmupCompleted) {
                Object[] objArr = {this, ((setTabItem.onExtraCallback.onWarmupCompleted) iAuthTabCallbackOnExtraCallbackWithResult).onNavigationEvent()};
                int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                zBooleanValue = ((Boolean) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, 1468854117, -1468854110, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback)).booleanValue();
                lOnExtraCallback = settabitemIAuthTabCallback.onExtraCallback();
                if (lOnExtraCallback != null) {
                    int i6 = onMinimized + 117;
                    onActivityLayout = i6 % 128;
                    int i7 = i6 % 2;
                    long jLongValue = lOnExtraCallback.longValue();
                    if (onActivityLayout()) {
                        int i8 = onMinimized + 117;
                        onActivityLayout = i8 % 128;
                        int i9 = i8 % 2;
                        TotalServiceNextViewModel.onWarmupCompleted(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1339991649, new Object[]{writeTypedObject(), Long.valueOf(jLongValue)}, -1339991637, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
                    } else {
                        Object[] objArr2 = {onPostMessage(), Long.valueOf(jLongValue)};
                        TotalServiceViewModel.onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 623673752, objArr2, -623673741, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
                        int i10 = onMinimized + 15;
                        onActivityLayout = i10 % 128;
                        int i11 = i10 % 2;
                    }
                }
                getindexbytagOnWarmupCompleted = settabitemIAuthTabCallback.onWarmupCompleted();
                if (getindexbytagOnWarmupCompleted != null) {
                    this.onNavigationEvent.onExtraCallbackWithResult(getindexbytagOnWarmupCompleted);
                    onPostMessage().onExtraCallback(getindexbytagOnWarmupCompleted.onNavigationEvent(), getindexbytagOnWarmupCompleted.onExtraCallback());
                }
                return zBooleanValue;
            }
            if (iAuthTabCallbackOnExtraCallbackWithResult != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
        zBooleanValue = false;
        lOnExtraCallback = settabitemIAuthTabCallback.onExtraCallback();
        if (lOnExtraCallback != null) {
        }
        getindexbytagOnWarmupCompleted = settabitemIAuthTabCallback.onWarmupCompleted();
        if (getindexbytagOnWarmupCompleted != null) {
        }
        return zBooleanValue;
    }

    private final void onExtraCallbackWithResult(getLaunchParams getlaunchparams) {
        String strOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onMinimized + 47;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        if (getlaunchparams.onExtraCallback()) {
            int i4 = onMinimized + 51;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
            asInterface("all_tab");
            this.onNavigationEvent.onExtraCallbackWithResult(onExtraCallback());
        }
        if (getlaunchparams.onExtraCallback()) {
            int i6 = onMinimized + 73;
            onActivityLayout = i6 % 128;
            int i7 = i6 % 2;
            String strOnExtraCallbackWithResult = getlaunchparams.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult == null || (strOnWarmupCompleted = onExtraCallbackWithResult(strOnExtraCallbackWithResult)) == null) {
                strOnWarmupCompleted = getlaunchparams.onWarmupCompleted();
            }
        } else {
            strOnWarmupCompleted = null;
        }
        setUrl.onExtraCallback(-545447706, new Object[]{this.IAuthTabCallbackDefault, getlaunchparams.onExtraCallbackWithResult(), strOnWarmupCompleted, Boolean.valueOf(getlaunchparams.IAuthTabCallback())}, 545447706, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
        if (onActivityLayout()) {
            writeTypedObject().onNavigationEvent(getlaunchparams.onExtraCallbackWithResult(), getlaunchparams.onNavigationEvent(), strOnWarmupCompleted, getlaunchparams.IAuthTabCallback());
        } else {
            onPostMessage().onNavigationEvent(getlaunchparams.onExtraCallbackWithResult(), getlaunchparams.onNavigationEvent(), strOnWarmupCompleted, getlaunchparams.IAuthTabCallback());
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        getLaunchParams getlaunchparams = (getLaunchParams) objArr[1];
        int i = 2 % 2;
        totalServiceFragment.IAuthTabCallbackDefault.onExtraCallback(getlaunchparams.IAuthTabCallback());
        if (!(!totalServiceFragment.onActivityLayout())) {
            int i2 = onActivityLayout + 47;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            totalServiceFragment.writeTypedObject().onWarmupCompleted();
            int i4 = onMinimized + 107;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
        } else {
            totalServiceFragment.onPostMessage().IAuthTabCallback();
            int i6 = onActivityLayout + 39;
            onMinimized = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 4;
            }
        }
        if (totalServiceFragment.onActivityLayout()) {
            int i8 = onActivityLayout + 57;
            onMinimized = i8 % 128;
            int i9 = i8 % 2;
            if (getlaunchparams.onNavigationEvent() == getTabBarItemColorModel.RECOMMEND) {
                totalServiceFragment.writeTypedObject().onNavigationEvent(setActiveIcon.IAuthTabCallback.onExtraCallbackWithResult(getlaunchparams.onExtraCallbackWithResult()));
                return false;
            }
        }
        return Boolean.valueOf(totalServiceFragment.onPostMessage().onExtraCallbackWithResult(getlaunchparams.onExtraCallbackWithResult(), getlaunchparams.onNavigationEvent()));
    }

    private final void extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 63;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        TotalServiceViewModel.IAuthTabCallback(onPostMessage(), (Boolean) null, 1, (Object) null);
        int i4 = onActivityLayout + 41;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onNavigationEvent(boolean z, boolean z2) {
        int i = 2 % 2;
        onCapsuleReady.onExtraCallbackWithResult(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), z, null, null, new TotalServiceFragment$.ExternalSyntheticLambda19(this, this.onTransact.IAuthTabCallback(z2), z), 12, null);
        int i2 = onActivityLayout + 37;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 64 / 0;
        }
    }

    private static final Unit onExtraCallbackWithResult(TotalServiceFragment totalServiceFragment, long j, boolean z) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 19;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            totalServiceFragment.onTransact.onExtraCallbackWithResult(j);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!totalServiceFragment.onTransact.onExtraCallbackWithResult(j)) {
            int i3 = onMinimized + 89;
            onActivityLayout = i3 % 128;
            if (i3 % 2 == 0) {
                return Unit.INSTANCE;
            }
            int i4 = 50 / 0;
            return Unit.INSTANCE;
        }
        TotalServiceNextViewModel.onWarmupCompleted(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1466838790, new Object[]{totalServiceFragment.writeTypedObject()}, 1466838811, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
        Boolean boolOnNavigationEvent = totalServiceFragment.onTransact.onNavigationEvent(j, totalServiceFragment.writeTypedObject().IAuthTabCallbackStubProxy());
        if (boolOnNavigationEvent == null) {
            return Unit.INSTANCE;
        }
        int i5 = onMinimized + 93;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        boolean zBooleanValue = boolOnNavigationEvent.booleanValue();
        if (!(!z)) {
            int i7 = onMinimized + 1;
            onActivityLayout = i7 % 128;
            int i8 = i7 % 2;
            TotalServiceNextViewModel.onWarmupCompleted(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 2071962492, new Object[]{totalServiceFragment.writeTypedObject(), totalServiceFragment.onExtraCallback(), totalServiceFragment.writeTypedObject().extraCallback()}, -2071962481, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
            int i9 = onActivityLayout + 57;
            onMinimized = i9 % 128;
            int i10 = i9 % 2;
        } else if (zBooleanValue) {
            totalServiceFragment.writeTypedObject().onNavigationEvent(totalServiceFragment.onExtraCallback(), totalServiceFragment.writeTypedObject().extraCallback());
        } else {
            totalServiceFragment.writeTypedObject().onExtraCallback(totalServiceFragment.onExtraCallback(), totalServiceFragment.writeTypedObject().extraCallback());
        }
        return Unit.INSTANCE;
    }

    private final void onActivityResized() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 73;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            this.IAuthTabCallbackDefault.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.IAuthTabCallbackDefault.onExtraCallbackWithResult();
        int i3 = onMinimized + 105;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        int i = 2 % 2;
        onCapsuleReady.onExtraCallbackWithResult(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(totalServiceFragment), false, null, null, new TotalServiceFragment$.ExternalSyntheticLambda18(totalServiceFragment, (generateTabBarItemColorScheme) objArr[1]), 14, null);
        int i2 = onMinimized + 121;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static final Unit onWarmupCompleted(TotalServiceFragment totalServiceFragment, generateTabBarItemColorScheme generatetabbaritemcolorscheme) throws Throwable {
        boolean zIAuthTabCallback;
        Map mapOnNavigationEvent;
        int i = 2 % 2;
        if (!totalServiceFragment.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED)) {
            Unit unit = Unit.INSTANCE;
            int i2 = onMinimized + 35;
            onActivityLayout = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 32 / 0;
            }
            return unit;
        }
        if (totalServiceFragment.onActivityLayout()) {
            int i4 = onMinimized + 87;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
            zIAuthTabCallback = totalServiceFragment.writeTypedObject().onExtraCallbackWithResult(generatetabbaritemcolorscheme);
        } else {
            zIAuthTabCallback = totalServiceFragment.onPostMessage().IAuthTabCallback(generatetabbaritemcolorscheme);
        }
        if (!zIAuthTabCallback) {
            int i6 = onMinimized + 37;
            onActivityLayout = i6 % 128;
            int i7 = i6 % 2;
            return Unit.INSTANCE;
        }
        totalServiceFragment.IAuthTabCallbackDefault.onNavigationEvent(generatetabbaritemcolorscheme.onExtraCallbackWithResult());
        String strOnWarmupCompleted = generatetabbaritemcolorscheme.onWarmupCompleted();
        if (strOnWarmupCompleted != null) {
            int i8 = onMinimized + 113;
            onActivityLayout = i8 % 128;
            int i9 = i8 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{48924, 9978, 49006, 61187, 59218, 29708, 46437, 59860, 39198, 54916, 52673, 13907}, ViewConfiguration.getDoubleTapTimeout() >> 16, objArr);
            mapOnNavigationEvent = access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), strOnWarmupCompleted));
        } else {
            mapOnNavigationEvent = null;
        }
        totalServiceFragment.onExtraCallback(c4a.onExtraCallbackWithResult(generatetabbaritemcolorscheme.IAuthTabCallback(), mapOnNavigationEvent), (getNetwork) null);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityLayout + 103;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = totalServiceFragment.IAuthTabCallbackDefault.onNavigationEvent();
        int i4 = onMinimized + 17;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zOnNavigationEvent);
        }
        int i5 = 59 / 0;
        return Boolean.valueOf(zOnNavigationEvent);
    }

    private final void ICustomTabsCallback() {
        int i = 2 % 2;
        Context context = getContext();
        if (context != null) {
            int i2 = onActivityLayout + 97;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            TdsHighlightV3View.Companion.onWarmupCompleted(context);
            int i4 = onActivityLayout + 67;
            onMinimized = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 4;
            }
        }
        if (onActivityLayout()) {
            writeTypedObject().onExtraCallbackWithResult();
            return;
        }
        Object[] objArr = {onPostMessage()};
        TotalServiceViewModel.onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -928927114, objArr, 928927128, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
    }

    private final void IAuthTabCallback(NavigationBarCapsuleTheme navigationBarCapsuleTheme) throws Throwable {
        NavigationBarCapsuleTheme.onExtraCallback onextracallback;
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        String str = null;
        if (!(!(navigationBarCapsuleTheme instanceof NavigationBarCapsuleTheme.onExtraCallback))) {
            onextracallback = (NavigationBarCapsuleTheme.onExtraCallback) navigationBarCapsuleTheme;
        } else {
            int i2 = onMinimized + 27;
            onActivityLayout = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 % 4;
            }
            onextracallback = null;
        }
        if (onextracallback == null) {
            return;
        }
        setUrl seturl = this.IAuthTabCallbackDefault;
        String strOnExtraCallbackWithResult2 = onextracallback.onExtraCallbackWithResult();
        String strAsInterface = onextracallback.asInterface();
        String strAsInterface2 = onextracallback.asInterface();
        if (strAsInterface2 != null) {
            int i4 = onActivityLayout + 115;
            onMinimized = i4 % 128;
            if (i4 % 2 == 0) {
                strOnExtraCallbackWithResult = onExtraCallbackWithResult(strAsInterface2);
                int i5 = 13 / 0;
            } else {
                strOnExtraCallbackWithResult = onExtraCallbackWithResult(strAsInterface2);
            }
            str = strOnExtraCallbackWithResult;
        }
        setUrl.onExtraCallback(-515473013, new Object[]{seturl, strOnExtraCallbackWithResult2, strAsInterface, str}, 515473014, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
        int i6 = onActivityLayout + 37;
        onMinimized = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 31 / 0;
        }
    }

    private final setLaunchParamsTag onWarmupCompleted(NavigationBarCapsuleTheme.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 79;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        setUrl seturl = this.IAuthTabCallbackDefault;
        String strOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult();
        if (i3 != 0) {
            return seturl.IAuthTabCallback(strOnExtraCallbackWithResult);
        }
        setLaunchParamsTag setlaunchparamstagIAuthTabCallback = seturl.IAuthTabCallback(strOnExtraCallbackWithResult);
        int i4 = 29 / 0;
        return setlaunchparamstagIAuthTabCallback;
    }

    private final String onExtraCallbackWithResult(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 9;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Uri uri = Uri.parse(str);
        Object[] objArr = new Object[1];
        a(new char[]{48924, 9978, 49006, 61187, 59218, 29708, 46437, 59860, 39198, 54916, 52673, 13907}, ViewConfiguration.getTouchSlop() >> 8, objArr);
        String queryParameter = uri.getQueryParameter(((String) objArr[0]).intern());
        if (queryParameter != null) {
            int i4 = onMinimized + 51;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
            if (!StringsKt.isBlank(queryParameter)) {
                int i6 = onActivityLayout + 113;
                onMinimized = i6 % 128;
                if (i6 % 2 != 0) {
                    return queryParameter;
                }
                throw null;
            }
        }
        return null;
    }

    private final Map<String, Object> onWarmupCompleted(List<NavigationBar> list, String str) throws Throwable {
        Object obj;
        int i = 2 % 2;
        Map<String, Object> mapOnNavigationEvent = getBackButtonBoundingClientRect.onNavigationEvent(list, str);
        if (mapOnNavigationEvent == null) {
            if (str != null) {
                int i2 = onActivityLayout + 73;
                onMinimized = i2 % 128;
                if (i2 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    a(new char[]{48924, 9978, 49006, 61187, 59218, 29708, 46437, 59860, 39198, 54916, 52673, 13907}, View.MeasureSpec.getMode(1), objArr);
                    obj = objArr[0];
                } else {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{48924, 9978, 49006, 61187, 59218, 29708, 46437, 59860, 39198, 54916, 52673, 13907}, View.MeasureSpec.getMode(0), objArr2);
                    obj = objArr2[0];
                }
                return access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) obj).intern(), str));
            }
            mapOnNavigationEvent = null;
        }
        int i3 = onActivityLayout + 83;
        onMinimized = i3 % 128;
        if (i3 % 2 != 0) {
            return mapOnNavigationEvent;
        }
        throw null;
    }

    private final void onNavigationEvent(setName setname) {
        int i = 2 % 2;
        int i2 = onMinimized + 79;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {onPostMessage(), true, showBackButton.onNavigationEvent.DEFAULT, Long.valueOf(setname.onNavigationEvent()), Long.valueOf(setname.onExtraCallback())};
        TotalServiceViewModel.onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -898741655, objArr, 898741672, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
        int i4 = onActivityLayout + 83;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0142 A[PHI: r5
      0x0142: PHI (r5v17 java.util.List) = (r5v16 java.util.List), (r5v18 java.util.List) binds: [B:51:0x0140, B:48:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(setName.IAuthTabCallback iAuthTabCallback, boolean z) throws Throwable {
        onFailed onfailedIAuthTabCallback;
        boolean z2;
        String strOnExtraCallbackWithResult;
        List listOnNavigationEvent;
        setName setnameOnExtraCallbackWithResult;
        setName setnameOnExtraCallbackWithResult2;
        List listOnNavigationEvent2;
        int i = 2 % 2;
        if (onActivityLayout()) {
            getHomeButtonBoundingClientRectAsync gethomebuttonboundingclientrectasyncIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
            if (gethomebuttonboundingclientrectasyncIAuthTabCallback != null && (listOnNavigationEvent2 = getLeftCloseButtonVisibility.onNavigationEvent(gethomebuttonboundingclientrectasyncIAuthTabCallback, (getCustomViewProxy) null)) != null) {
                int i2 = onMinimized + 95;
                onActivityLayout = i2 % 128;
                if (i2 % 2 != 0) {
                    onPostMessage().onExtraCallback(listOnNavigationEvent2);
                    throw null;
                }
                onPostMessage().onExtraCallback(listOnNavigationEvent2);
            }
            onExtraCallbackWithResult(iAuthTabCallback.onWarmupCompleted());
            ((Boolean) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, (String) setName.IAuthTabCallback.onNavigationEvent(-189473691, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{iAuthTabCallback}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 189473691), iAuthTabCallback.onWarmupCompleted()}, -1243321, 1243329, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).booleanValue();
            return;
        }
        if (!(!z) || (this.asInterface.onTransact() == null && this.asInterface.IAuthTabCallback() == null)) {
            if (z) {
                onfailedIAuthTabCallback = null;
            } else {
                onfailedIAuthTabCallback = extraCallback().IAuthTabCallback();
                if (onfailedIAuthTabCallback == null) {
                    return;
                }
            }
            TotalServiceViewModel totalServiceViewModelOnPostMessage = onPostMessage();
            boolean z3 = false;
            if (((Boolean) TotalServiceViewModel.onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 607668487, new Object[]{onPostMessage()}, -607668460, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent())).booleanValue()) {
                int i3 = onActivityLayout;
                int i4 = i3 + 103;
                onMinimized = i4 % 128;
                int i5 = i4 % 2;
                if (z) {
                    int i6 = i3 + 85;
                    onMinimized = i6 % 128;
                    int i7 = i6 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            isShowing isshowingIAuthTabCallback = totalServiceViewModelOnPostMessage.IAuthTabCallback(iAuthTabCallback, z2, !z, (onfailedIAuthTabCallback == null || (setnameOnExtraCallbackWithResult2 = onfailedIAuthTabCallback.onExtraCallbackWithResult()) == null) ? null : Long.valueOf(setnameOnExtraCallbackWithResult2.onNavigationEvent()), (onfailedIAuthTabCallback == null || (setnameOnExtraCallbackWithResult = onfailedIAuthTabCallback.onExtraCallbackWithResult()) == null) ? null : Long.valueOf(setnameOnExtraCallbackWithResult.onExtraCallback()));
            if (isshowingIAuthTabCallback != isShowing.IGNORED) {
                getHomeButtonBoundingClientRectAsync gethomebuttonboundingclientrectasyncIAuthTabCallback2 = iAuthTabCallback.IAuthTabCallback();
                if (gethomebuttonboundingclientrectasyncIAuthTabCallback2 != null) {
                    int i8 = onMinimized + 111;
                    onActivityLayout = i8 % 128;
                    if (i8 % 2 != 0) {
                        listOnNavigationEvent = getLeftCloseButtonVisibility.onNavigationEvent(gethomebuttonboundingclientrectasyncIAuthTabCallback2, (getCustomViewProxy) null);
                        int i9 = 82 / 0;
                        if (listOnNavigationEvent != null) {
                            onPostMessage().onExtraCallback(listOnNavigationEvent);
                        }
                    } else {
                        listOnNavigationEvent = getLeftCloseButtonVisibility.onNavigationEvent(gethomebuttonboundingclientrectasyncIAuthTabCallback2, (getCustomViewProxy) null);
                        if (listOnNavigationEvent != null) {
                        }
                    }
                }
                onExtraCallbackWithResult(iAuthTabCallback.onWarmupCompleted());
                if (((Boolean) TotalServiceViewModel.onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 607668487, new Object[]{onPostMessage()}, -607668460, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent())).booleanValue()) {
                    int i10 = onActivityLayout + 63;
                    onMinimized = i10 % 128;
                    int i11 = i10 % 2;
                    if (z) {
                        z3 = true;
                    }
                }
                String str = (String) setName.IAuthTabCallback.onNavigationEvent(-189473691, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{iAuthTabCallback}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 189473691);
                if (str != null) {
                    int i12 = onActivityLayout + 89;
                    onMinimized = i12 % 128;
                    int i13 = i12 % 2;
                    strOnExtraCallbackWithResult = c4a.onExtraCallbackWithResult(str, getBackButtonBoundingClientRect.onNavigationEvent(iAuthTabCallback.onWarmupCompleted(), onExtraCallback()));
                } else {
                    strOnExtraCallbackWithResult = null;
                }
                if (!z && isshowingIAuthTabCallback == isShowing.ALL_ITEMS_VISITED) {
                    IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, iAuthTabCallback.onExtraCallback(), strOnExtraCallbackWithResult}, -136619353, 136619383, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
                    return;
                }
                if (z) {
                    IAuthTabCallback(strOnExtraCallbackWithResult, z3, (Function0<Boolean>) new TotalServiceFragment$.ExternalSyntheticLambda10(this, iAuthTabCallback, strOnExtraCallbackWithResult));
                    return;
                }
                int i14 = onActivityLayout + 115;
                onMinimized = i14 % 128;
                int i15 = i14 % 2;
                if (strOnExtraCallbackWithResult != null) {
                    long jOnExtraCallback = onExtraCallback(this, iAuthTabCallback.onExtraCallback(), null, 2, null);
                    if (SessionTrackerb.onExtraCallbackWithResult(asInterface(), getContext(), strOnExtraCallbackWithResult, false, (Function1) null, (Bundle) null, false, 60, (Object) null)) {
                        IAuthTabCallback(jOnExtraCallback);
                    } else {
                        onNavigationEvent(jOnExtraCallback);
                    }
                }
            }
        }
    }

    private static final boolean onExtraCallbackWithResult(TotalServiceFragment totalServiceFragment, setName.IAuthTabCallback iAuthTabCallback, String str) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 121;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        TotalServiceViewModel totalServiceViewModelOnPostMessage = totalServiceFragment.onPostMessage();
        if (i3 == 0) {
            totalServiceViewModelOnPostMessage.IAuthTabCallback(iAuthTabCallback, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIAuthTabCallback = totalServiceViewModelOnPostMessage.IAuthTabCallback(iAuthTabCallback, str);
        int i4 = onActivityLayout + 23;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[PHI: r15
      0x003e: PHI (r15v10 o.onFailed) = (r15v9 o.onFailed), (r15v19 o.onFailed) binds: [B:10:0x003c, B:7:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onUnminimized(Object[] objArr) throws Throwable {
        onFailed onfailedIAuthTabCallback;
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        Object obj = null;
        if (totalServiceFragment.asInterface.onTransact() == null) {
            int i2 = onActivityLayout + 45;
            onMinimized = i2 % 128;
            if (i2 % 2 == 0) {
                onfailedIAuthTabCallback = totalServiceFragment.extraCallback().IAuthTabCallback();
                int i3 = 32 / 0;
                if (onfailedIAuthTabCallback != null) {
                    setName setnameOnExtraCallbackWithResult = onfailedIAuthTabCallback.onExtraCallbackWithResult();
                    if (setnameOnExtraCallbackWithResult != null) {
                        long jOnNavigationEvent = setnameOnExtraCallbackWithResult.onNavigationEvent();
                        if (str2 != null) {
                            long jOnExtraCallbackWithResult = totalServiceFragment.onExtraCallbackWithResult(str, new setDisplay(jOnNavigationEvent, str2, true));
                            if (!SessionTrackerb.onExtraCallbackWithResult(totalServiceFragment.asInterface(), totalServiceFragment.getContext(), str2, false, (Function1) null, (Bundle) null, false, 60, (Object) null)) {
                                int i4 = onActivityLayout + 81;
                                onMinimized = i4 % 128;
                                if (i4 % 2 != 0) {
                                    totalServiceFragment.onNavigationEvent(jOnExtraCallbackWithResult);
                                    return null;
                                }
                                totalServiceFragment.onNavigationEvent(jOnExtraCallbackWithResult);
                                obj.hashCode();
                                throw null;
                            }
                            totalServiceFragment.IAuthTabCallback(jOnExtraCallbackWithResult);
                            return null;
                        }
                        totalServiceFragment.asInterface.onExtraCallbackWithResult(jOnNavigationEvent, (String) null);
                        totalServiceFragment.newSession();
                    }
                }
            } else {
                onfailedIAuthTabCallback = totalServiceFragment.extraCallback().IAuthTabCallback();
                if (onfailedIAuthTabCallback != null) {
                }
            }
        }
        return null;
    }

    static /* synthetic */ long onExtraCallback(TotalServiceFragment totalServiceFragment, String str, setDisplay setdisplay, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 81;
        int i4 = i3 % 128;
        onMinimized = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 23;
            onActivityLayout = i6 % 128;
            int i7 = i6 % 2;
            setdisplay = null;
        }
        return totalServiceFragment.onExtraCallbackWithResult(str, setdisplay);
    }

    private final long onExtraCallbackWithResult(String str, setDisplay setdisplay) {
        int i = 2 % 2;
        int i2 = onMinimized + 45;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        long jIAuthTabCallback = this.asInterface.IAuthTabCallback(str, setdisplay);
        newSession();
        int i4 = onActivityLayout + 73;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return jIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(long j) {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new onActivityResized(j, null), 3, (Object) null);
        int i2 = onMinimized + 33;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
    }

    static final class onActivityResized extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ long $attemptId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onActivityResized(long j, access13800<? super onActivityResized> access13800Var) {
            super(2, access13800Var);
            this.$attemptId = j;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onActivityResized onactivityresized = TotalServiceFragment.this.new onActivityResized(this.$attemptId, access13800Var);
            int i2 = IAuthTabCallback + 107;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onactivityresized;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = 52 / 0;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 79;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback;
                int i4 = i3 + 65;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i3 + 45;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
                long jIAuthTabCallback = setCommandLine.IAuthTabCallback(5000L, setRevision.MILLISECONDS);
                this.label = 1;
                if (formatMsgs.IAuthTabCallback(jIAuthTabCallback, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            Object[] objArr = {TotalServiceFragment.asBinder(TotalServiceFragment.this), Long.valueOf(this.$attemptId), Boolean.valueOf(TotalServiceFragment.this.getViewLifecycleOwner().getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED))};
            int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            if (((Boolean) isDisplay.onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 696855158, iOnExtraCallbackWithResult2, objArr, -696855158)).booleanValue()) {
                TotalServiceFragment.ICustomTabsCallback(TotalServiceFragment.this);
                Object[] objArr2 = {TotalServiceFragment.this};
                int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                TotalServiceFragment.IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr2, -1463155105, 1463155131, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback);
                int i6 = onWarmupCompleted + 61;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = totalServiceFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner);
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, totalServiceFragment.new ICustomTabsCallbackStub(jLongValue, null), 3, (Object) null);
        int i2 = onActivityLayout + 103;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static final class ICustomTabsCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ long $attemptId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ICustomTabsCallbackStub(long j, access13800<? super ICustomTabsCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$attemptId = j;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallbackStub iCustomTabsCallbackStub = TotalServiceFragment.this.new ICustomTabsCallbackStub(this.$attemptId, access13800Var);
            int i2 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return iCustomTabsCallbackStub;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                int i4 = onExtraCallbackWithResult;
                int i5 = i4 + 35;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = i4 + 53;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
                long jIAuthTabCallback = setCommandLine.IAuthTabCallback(5000L, setRevision.MILLISECONDS);
                this.label = 1;
                if (formatMsgs.IAuthTabCallback(jIAuthTabCallback, this) == objOnWarmupCompleted) {
                    int i9 = onWarmupCompleted + 87;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    return objOnWarmupCompleted;
                }
            }
            TotalServiceFragment.IAuthTabCallbackStub(TotalServiceFragment.this).onExtraCallbackWithResult(this.$attemptId, TotalServiceFragment.this.getViewLifecycleOwner().getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED));
            return Unit.INSTANCE;
        }
    }

    private final void onNavigationEvent(long j) throws Throwable {
        int i = 2 % 2;
        if (this.asInterface.IAuthTabCallback(j)) {
            newSession();
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{this}, 1929039885, -1929039879, iOnExtraCallback3, iOnExtraCallback);
            int i2 = onActivityLayout + 45;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = onMinimized + 123;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        int i = 2 % 2;
        int i2 = onActivityLayout + 95;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        TotalServiceViewModel.onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -898741655, new Object[]{totalServiceFragment.onPostMessage(), true, showBackButton.onNavigationEvent.SCROLL, Long.valueOf(jLongValue), Long.valueOf(jLongValue2)}, 898741672, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
        int i4 = onMinimized + 123;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void onWarmupCompleted(showBackButton showbackbutton) {
        int i = 2 % 2;
        int i2 = onMinimized + 15;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.onNavigationEvent(showbackbutton);
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) throws Throwable {
        List<NavigationBar> list;
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        setName.IAuthTabCallback iAuthTabCallback = (setName.IAuthTabCallback) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityLayout + 37;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            list = (List) setName.IAuthTabCallback.onNavigationEvent(-668305846, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{iAuthTabCallback}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 668305847);
            int i3 = 72 / 0;
            if (list == null) {
                return null;
            }
        } else {
            list = (List) setName.IAuthTabCallback.onNavigationEvent(-668305846, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{iAuthTabCallback}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 668305847);
            if (list == null) {
                return null;
            }
        }
        int i4 = onActivityLayout + 31;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        for (NavigationBar navigationBar : list) {
            IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{totalServiceFragment, iAuthTabCallback.onExtraCallback() + navigationBar.onExtraCallback(), Long.valueOf(navigationBar.onExtraCallback()), navigationBar.onExtraCallbackWithResult()}, 353614238, -353614215, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
            int i6 = onMinimized + 107;
            onActivityLayout = i6 % 128;
            int i7 = i6 % 2;
        }
        return null;
    }

    private final void onExtraCallbackWithResult(NavigationBarCapsuleTheme.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        if (onwarmupcompleted instanceof NavigationBarCapsuleTheme.onWarmupCompleted.IAuthTabCallback) {
            if (!(!onActivityLayout())) {
                writeTypedObject().onNavigationEvent(this.getInterfaceDescriptor, (NavigationBarCapsuleTheme.onWarmupCompleted.IAuthTabCallback) onwarmupcompleted);
                int i2 = onActivityLayout + 91;
                onMinimized = i2 % 128;
                int i3 = i2 % 2;
            } else {
                TotalServiceViewModel.onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 417608800, new Object[]{onPostMessage(), this.getInterfaceDescriptor, ((NavigationBarCapsuleTheme.onWarmupCompleted.IAuthTabCallback) onwarmupcompleted).onExtraCallback()}, -417608799, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
            }
            this.onNavigationEvent.IAuthTabCallback((NavigationBarCapsuleTheme.onWarmupCompleted.IAuthTabCallback) onwarmupcompleted);
        }
        int i4 = onMinimized + 1;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void onExtraCallback(NavigationBarCapsuleTheme.onWarmupCompleted onwarmupcompleted) {
        List listOnNavigationEvent;
        int i = 2 % 2;
        if (onwarmupcompleted instanceof NavigationBarCapsuleTheme.onWarmupCompleted.onNavigationEvent) {
            NavigationBarCapsuleTheme.onWarmupCompleted.onNavigationEvent onnavigationevent = (NavigationBarCapsuleTheme.onWarmupCompleted.onNavigationEvent) onwarmupcompleted;
            getHomeButtonBoundingClientRectAsync gethomebuttonboundingclientrectasyncOnNavigationEvent = onnavigationevent.onNavigationEvent();
            String strOnExtraCallbackWithResult = null;
            if (gethomebuttonboundingclientrectasyncOnNavigationEvent != null && (listOnNavigationEvent = getLeftCloseButtonVisibility.onNavigationEvent(gethomebuttonboundingclientrectasyncOnNavigationEvent, (getCustomViewProxy) null)) != null) {
                onPostMessage().onExtraCallback(listOnNavigationEvent);
                int i2 = onMinimized + 71;
                onActivityLayout = i2 % 128;
                int i3 = i2 % 2;
            }
            onExtraCallbackWithResult(onnavigationevent.onExtraCallback());
            String strAsInterface = onnavigationevent.asInterface();
            if (strAsInterface != null) {
                strOnExtraCallbackWithResult = c4a.onExtraCallbackWithResult(strAsInterface, getBackButtonBoundingClientRect.onNavigationEvent(onnavigationevent.onExtraCallback(), onExtraCallback()));
                int i4 = onMinimized + 5;
                onActivityLayout = i4 % 128;
                int i5 = i4 % 2;
            }
            String str = strOnExtraCallbackWithResult;
            IAuthTabCallback(this, str, false, new TotalServiceFragment$.ExternalSyntheticLambda1(this, onwarmupcompleted, str), 2, null);
        }
    }

    private static final boolean IAuthTabCallback(TotalServiceFragment totalServiceFragment, NavigationBarCapsuleTheme.onWarmupCompleted onwarmupcompleted, String str) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 37;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        TotalServiceViewModel totalServiceViewModelOnPostMessage = totalServiceFragment.onPostMessage();
        if (i3 == 0) {
            boolean zIAuthTabCallback = totalServiceViewModelOnPostMessage.IAuthTabCallback((NavigationBarCapsuleTheme.onWarmupCompleted.onNavigationEvent) onwarmupcompleted, str);
            int i4 = 88 / 0;
            return zIAuthTabCallback;
        }
        return totalServiceViewModelOnPostMessage.IAuthTabCallback((NavigationBarCapsuleTheme.onWarmupCompleted.onNavigationEvent) onwarmupcompleted, str);
    }

    private final void IAuthTabCallback(NavigationBarCapsuleTheme.onWarmupCompleted.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        getHomeButtonBoundingClientRectAsync gethomebuttonboundingclientrectasyncOnNavigationEvent = onnavigationevent.onNavigationEvent();
        if (gethomebuttonboundingclientrectasyncOnNavigationEvent != null) {
            int i2 = onActivityLayout + 31;
            onMinimized = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                getLeftCloseButtonVisibility.onNavigationEvent(gethomebuttonboundingclientrectasyncOnNavigationEvent, (getCustomViewProxy) null);
                obj.hashCode();
                throw null;
            }
            List listOnNavigationEvent = getLeftCloseButtonVisibility.onNavigationEvent(gethomebuttonboundingclientrectasyncOnNavigationEvent, (getCustomViewProxy) null);
            if (listOnNavigationEvent != null) {
                int i3 = onMinimized + 117;
                onActivityLayout = i3 % 128;
                int i4 = i3 % 2;
                onPostMessage().onExtraCallback(listOnNavigationEvent);
            }
        }
        onExtraCallbackWithResult(onnavigationevent.onExtraCallback());
        Object[] objArr = {this, onnavigationevent.asInterface(), onnavigationevent.onExtraCallback()};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        ((Boolean) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, -1243321, 1243329, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback)).booleanValue();
        int i5 = onActivityLayout + 73;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void IAuthTabCallback(NavigationBarCapsuleTheme.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        if (onwarmupcompleted instanceof NavigationBarCapsuleTheme.onWarmupCompleted.onNavigationEvent) {
            int i2 = onMinimized + 73;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.IAuthTabCallback((NavigationBarCapsuleTheme.onWarmupCompleted.onNavigationEvent) onwarmupcompleted);
            int i4 = onMinimized + 31;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = onActivityLayout + 47;
        onMinimized = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        NavigationBarCapsuleTheme.onWarmupCompleted.onNavigationEvent onnavigationevent = (NavigationBarCapsuleTheme.onWarmupCompleted.onNavigationEvent) objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 107;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        totalServiceFragment.onNavigationEvent.onExtraCallbackWithResult(onnavigationevent);
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    private final void onTransact() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 77;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            View view = getView();
            if (view != null) {
                this.readTypedObject.onExtraCallbackWithResult(view, new TotalServiceFragment$.ExternalSyntheticLambda15(this));
                return;
            }
            int i3 = onActivityLayout + 19;
            onMinimized = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        getView();
        throw null;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        setBitmapDecoderClass setbitmapdecoderclass;
        TotalServiceFragment totalServiceFragment = (TotalServiceFragment) objArr[0];
        int i = 2 % 2;
        setBitmapDecoderClass parentFragment = totalServiceFragment.getParentFragment();
        Object obj = null;
        if (parentFragment instanceof setBitmapDecoderClass) {
            int i2 = onActivityLayout + 87;
            onMinimized = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            setbitmapdecoderclass = parentFragment;
        } else {
            setbitmapdecoderclass = null;
        }
        if (setbitmapdecoderclass != null) {
            int i3 = onActivityLayout + 49;
            onMinimized = i3 % 128;
            if (i3 % 2 == 0) {
                setbitmapdecoderclass.IAuthTabCallback();
                totalServiceFragment.getActivity();
                throw null;
            }
            int iIAuthTabCallback = setbitmapdecoderclass.IAuthTabCallback();
            FragmentActivity activity = totalServiceFragment.getActivity();
            if (activity != null) {
                return activity.findViewById(iIAuthTabCallback);
            }
        }
        return null;
    }

    private final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 17;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        this.readTypedObject.IAuthTabCallback();
        int i4 = onMinimized + 79;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback(setName setname) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 91;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            setName.onWarmupCompleted onwarmupcompleted = (setName.onWarmupCompleted) setName.onExtraCallbackWithResult(1246295662, TransactionFilterLocal.Companion.onNavigationEvent(), new Object[]{setname}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1246295661);
            if (onwarmupcompleted == null) {
                return;
            }
            this.onNavigationEvent.IAuthTabCallback(setname);
            SessionTrackerb sessionTrackerbAsInterface = asInterface();
            Context context = getContext();
            String strOnNavigationEvent = onwarmupcompleted.onNavigationEvent();
            Object[] objArr = new Object[1];
            a(new char[]{48924, 9978, 49006, 61187, 59218, 29708, 46437, 59860, 39198, 54916, 52673, 13907}, Drawable.resolveOpacity(0, 0), objArr);
            SessionTrackerb.onExtraCallbackWithResult(sessionTrackerbAsInterface, context, convertAnyToMap.IAuthTabCallback(strOnNavigationEvent, ((String) objArr[0]).intern(), "all_tab.eval_reco"), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            int i3 = onActivityLayout + 27;
            onMinimized = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        throw null;
    }

    private final void onWarmupCompleted(float f, setName setname) {
        int i = 2 % 2;
        int i2 = onMinimized + 73;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            this.onNavigationEvent.onWarmupCompleted(f, setname);
            onPostMessage().onExtraCallback(f);
            int i3 = 44 / 0;
        } else {
            this.onNavigationEvent.onWarmupCompleted(f, setname);
            onPostMessage().onExtraCallback(f);
        }
        int i4 = onActivityLayout + 57;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(setName setname) {
        Iterator it;
        int i = 2 % 2;
        setName.onWarmupCompleted onwarmupcompleted = (setName.onWarmupCompleted) setName.onExtraCallbackWithResult(1246295662, TransactionFilterLocal.Companion.onNavigationEvent(), new Object[]{setname}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1246295661);
        if (onwarmupcompleted != null) {
            int i2 = onMinimized + 3;
            onActivityLayout = i2 % 128;
            if (i2 % 2 != 0) {
                onwarmupcompleted.onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            List listOnExtraCallback = onwarmupcompleted.onExtraCallback();
            if (listOnExtraCallback != null) {
                int i3 = onMinimized + 15;
                onActivityLayout = i3 % 128;
                if (i3 % 2 != 0) {
                    it = listOnExtraCallback.iterator();
                    int i4 = 86 / 0;
                } else {
                    it = listOnExtraCallback.iterator();
                }
                int i5 = onMinimized + 37;
                onActivityLayout = i5 % 128;
                int i6 = i5 % 2;
                while (it.hasNext()) {
                    NavigationBar navigationBar = (NavigationBar) it.next();
                    IAuthTabCallback("inorganic_review_rating::" + navigationBar.onExtraCallback(), navigationBar);
                }
            }
        }
    }

    private final void IAuthTabCallback(setName setname) {
        List<NavigationBar> listAsInterface;
        int i = 2 % 2;
        int i2 = onMinimized + 35;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        setName.onWarmupCompleted onwarmupcompleted = (setName.onWarmupCompleted) setName.onExtraCallbackWithResult(1246295662, TransactionFilterLocal.Companion.onNavigationEvent(), new Object[]{setname}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1246295661);
        if (onwarmupcompleted != null && (listAsInterface = onwarmupcompleted.asInterface()) != null) {
            int i3 = onMinimized + 75;
            onActivityLayout = i3 % 128;
            if (i3 % 2 == 0) {
                for (NavigationBar navigationBar : listAsInterface) {
                    IAuthTabCallback("inorganic_review_text::" + navigationBar.onExtraCallback(), navigationBar);
                }
            } else {
                listAsInterface.iterator();
                throw null;
            }
        }
        int i4 = onMinimized + 77;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 53;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.IAuthTabCallback_Parcel.onExtraCallbackWithResult();
        int i4 = onMinimized + 93;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private void asInterface(String str) {
        int i = 2 % 2;
        int i2 = onMinimized + 39;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback_Parcel.IAuthTabCallback(str);
        int i4 = onMinimized + 51;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onWarmupCompleted(getErrMsg geterrmsg) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return ((Boolean) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{geterrmsg}, 1869814243, -1869814209, iOnExtraCallback3, iOnExtraCallback)).booleanValue();
    }

    public static /* synthetic */ Unit onNavigationEvent(TotalServiceFragment totalServiceFragment) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{totalServiceFragment}, -626412270, 626412294, iOnExtraCallback3, iOnExtraCallback);
    }

    public static /* synthetic */ Unit onExtraCallback(TotalServiceFragment totalServiceFragment, long j, boolean z) {
        Object[] objArr = {totalServiceFragment, Long.valueOf(j), Boolean.valueOf(z)};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, -94267162, 94267195, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback);
    }

    public static /* synthetic */ Unit IAuthTabCallback(TotalServiceFragment totalServiceFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {totalServiceFragment, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, -1062287548, 1062287561, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback);
    }

    public static /* synthetic */ Unit onWarmupCompleted(TotalServiceFragment totalServiceFragment) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{totalServiceFragment}, -1050518332, 1050518332, iOnExtraCallback3, iOnExtraCallback);
    }

    public static /* synthetic */ boolean onExtraCallback(Function1 function1, Object obj) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return ((Boolean) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{function1, obj}, -1288564742, 1288564771, iOnExtraCallback3, iOnExtraCallback)).booleanValue();
    }

    public static /* synthetic */ boolean onExtraCallback(TotalServiceFragment totalServiceFragment, NavigationBarCapsuleTheme.onWarmupCompleted onwarmupcompleted, String str) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return ((Boolean) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{totalServiceFragment, onwarmupcompleted, str}, 981343822, -981343806, iOnExtraCallback3, iOnExtraCallback)).booleanValue();
    }

    public static /* synthetic */ Unit onExtraCallback(TotalServiceFragment totalServiceFragment, String str) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{totalServiceFragment, str}, -1404409600, 1404409602, iOnExtraCallback3, iOnExtraCallback);
    }

    public static /* synthetic */ Unit onNavigationEvent(TotalServiceFragment totalServiceFragment, getImageTitle getimagetitle, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {totalServiceFragment, getimagetitle, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, -1567818420, 1567818439, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback);
    }

    public static /* synthetic */ TitleBar IAuthTabCallbackDefault(TotalServiceFragment totalServiceFragment) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (TitleBar) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{totalServiceFragment}, 2024987458, -2024987430, iOnExtraCallback3, iOnExtraCallback);
    }

    public static final /* synthetic */ void onTransact(TotalServiceFragment totalServiceFragment) throws Throwable {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{totalServiceFragment}, -1463155105, 1463155131, iOnExtraCallback3, iOnExtraCallback);
    }

    public static final /* synthetic */ void IAuthTabCallback(TotalServiceFragment totalServiceFragment, String str) throws Throwable {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{totalServiceFragment, str}, -1228126442, 1228126463, iOnExtraCallback3, iOnExtraCallback);
    }

    public static final /* synthetic */ void access000(TotalServiceFragment totalServiceFragment) throws Throwable {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{totalServiceFragment}, 850630593, -850630588, iOnExtraCallback3, iOnExtraCallback);
    }

    public static final /* synthetic */ void onNavigationEvent(TotalServiceFragment totalServiceFragment, boolean z) throws Throwable {
        Object[] objArr = {totalServiceFragment, Boolean.valueOf(z)};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, 66249301, -66249298, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback);
    }

    private final void asBinder() throws Throwable {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{this}, 1929039885, -1929039879, iOnExtraCallback3, iOnExtraCallback);
    }

    private final boolean onWarmupCompleted(getLaunchParams getlaunchparams) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return ((Boolean) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{this, getlaunchparams}, 1468854117, -1468854110, iOnExtraCallback3, iOnExtraCallback)).booleanValue();
    }

    private static final View extraCallback(TotalServiceFragment totalServiceFragment) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (View) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{totalServiceFragment}, -184232990, 184233008, iOnExtraCallback3, iOnExtraCallback);
    }

    private final void IAuthTabCallbackDefault() throws Throwable {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{this}, 1089628495, -1089628464, iOnExtraCallback3, iOnExtraCallback);
    }

    private final boolean access100() {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return ((Boolean) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{this}, -674709966, 674709977, iOnExtraCallback3, iOnExtraCallback)).booleanValue();
    }

    private static final Unit onExtraCallbackWithResult(TotalServiceFragment totalServiceFragment, RVWebSocketManagerHolder rVWebSocketManagerHolder) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{totalServiceFragment, rVWebSocketManagerHolder}, 617339146, -617339145, iOnExtraCallback3, iOnExtraCallback);
    }

    private final void IAuthTabCallback(String str, String str2) throws Throwable {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{this, str, str2}, -136619353, 136619383, iOnExtraCallback3, iOnExtraCallback);
    }

    private static final Unit onNavigationEvent(TotalServiceFragment totalServiceFragment, String str) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{totalServiceFragment, str}, -1798117925, 1798117950, iOnExtraCallback3, iOnExtraCallback);
    }

    private static final Unit IAuthTabCallbackDefault(TotalServiceFragment totalServiceFragment, String str) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{totalServiceFragment, str}, -1926019517, 1926019526, iOnExtraCallback3, iOnExtraCallback);
    }

    private final void onExtraCallback(String str, long j, Map<String, ? extends Object> map) throws Throwable {
        Object[] objArr = {this, str, Long.valueOf(j), map};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, 353614238, -353614215, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback);
    }

    private final void onNavigationEvent(String str, boolean z, getNetwork getnetwork) throws Throwable {
        Object[] objArr = {this, str, Boolean.valueOf(z), getnetwork};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, 720440420, -720440406, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback);
    }

    private final void IAuthTabCallback(setName.IAuthTabCallback iAuthTabCallback) throws Throwable {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{this, iAuthTabCallback}, -1895128973, 1895128990, iOnExtraCallback3, iOnExtraCallback);
    }

    private final void IAuthTabCallback(long j, long j2) throws Throwable {
        Object[] objArr = {this, Long.valueOf(j), Long.valueOf(j2)};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, -835648716, 835648726, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback);
    }

    private final void onExtraCallbackWithResult(RandomMiniAppLaunchpadLogState randomMiniAppLaunchpadLogState, String str) throws Throwable {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{this, randomMiniAppLaunchpadLogState, str}, -1011134272, 1011134276, iOnExtraCallback3, iOnExtraCallback);
    }

    private final void onExtraCallback(getUrl geturl) throws Throwable {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{this, geturl}, -861739030, 861739045, iOnExtraCallback3, iOnExtraCallback);
    }

    static /* synthetic */ void onNavigationEvent(TotalServiceFragment totalServiceFragment, NavigationBarCapsuleTheme navigationBarCapsuleTheme, getNetwork getnetwork, int i, Object obj) throws Throwable {
        Object[] objArr = {totalServiceFragment, navigationBarCapsuleTheme, getnetwork, Integer.valueOf(i), obj};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, 1378283204, -1378283177, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback);
    }

    private final void onExtraCallback(NavigationBarCapsuleTheme.onWarmupCompleted.onNavigationEvent onnavigationevent) throws Throwable {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{this, onnavigationevent}, 891959270, -891959250, iOnExtraCallback3, iOnExtraCallback);
    }

    static /* synthetic */ void IAuthTabCallback(TotalServiceFragment totalServiceFragment, boolean z, getNetwork getnetwork, int i, Object obj) throws Throwable {
        Object[] objArr = {totalServiceFragment, Boolean.valueOf(z), getnetwork, Integer.valueOf(i), obj};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, 474250896, -474250884, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback);
    }

    private final void IAuthTabCallback(generateTabBarItemColorScheme generatetabbaritemcolorscheme) throws Throwable {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{this, generatetabbaritemcolorscheme}, -378278865, 378278887, iOnExtraCallback3, iOnExtraCallback);
    }

    private final boolean onExtraCallback(String str, List<NavigationBar> list) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return ((Boolean) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, new Object[]{this, str, list}, -1243321, 1243329, iOnExtraCallback3, iOnExtraCallback)).booleanValue();
    }

    private final void onWarmupCompleted(long j) throws Throwable {
        Object[] objArr = {this, Long.valueOf(j)};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, -281592634, 281592666, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback);
    }

    static void IAuthTabCallbackStub() {
        extraCallbackWithResult = -3813912225232670064L;
        extraCallback = -341630868;
        ICustomTabsCallback = -1538795434;
        onActivityResized = -489826786;
        onPostMessage = new byte[]{-64, -15, 69, 13, 99, -16, -5, 28, 59, -27, 99, -16, -27, 87, -15, 99, 35, 59, -25, 105, -16, -5, 90, -70, -84, -28, 22, -16, 109, 63, -16, -4, 107, -14, -27, 109, 107, -14, -96, -27, -31, 56, -27, 73, -66, 46, -111, 21, -123, 42, 47, -100, -42, 42, -123, 87, 42, 22, -109, 44, 45, -123, -109, 44};
    }
}
