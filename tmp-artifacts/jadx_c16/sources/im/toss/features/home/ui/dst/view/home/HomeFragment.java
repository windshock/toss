package im.toss.features.home.ui.dst.view.home;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.iap.ac.config.lite.preset.PresetParser;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import com.initech.pkix.cmp.client.util.URI;
import com.otaliastudios.cameraview.R$styleable;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.model.AdInfo;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsError;
import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody;
import im.toss.base.BaseActivity;
import im.toss.base.BaseLauncherWrapperActivity;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import im.toss.deeplink.annotation.DeepLink;
import im.toss.define.TossAffiliate;
import im.toss.features.home.core.model.BpsBannerDto;
import im.toss.features.home.core.ui.base.BaseHomeFragment;
import im.toss.features.home.core.ui.extensions.RecyclerViewsKt;
import im.toss.features.home.core.ui.recyclerview.HomeDstRecyclerView;
import im.toss.features.home.core.ui.recyclerview.HomeRecyclerView;
import im.toss.features.home.core.ui.widget.HomeDstView;
import im.toss.features.home.core.ui.widget.HomeNavigationBarItemGroup;
import im.toss.features.home.ui.dst.R;
import im.toss.features.home.ui.dst.view.home.HomeFragment$;
import im.toss.features.home.ui.dst.view.home.HomeFragment$bpsBannerRowImpressionLog$2$;
import im.toss.features.home.ui.dst.view.home.HomeFragment$showTeensOnboardingByPushIfNeeded$1$;
import im.toss.features.home.ui.dst.view.home.HomeFragment$showTeensOnboardingIfNeeded$1$;
import im.toss.features.home.ui.dst.view.logo.HomeCurrencyBadgeView;
import im.toss.features.home.ui.dst.view.logo.HomeLogoToDo;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.home.ui.view.currency.select.CurrencySelectActivity;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.tosscert.ui.R;
import im.toss.inventory_sdk.InventoryAdManager;
import im.toss.inventory_sdk.model.InventoryAdDto;
import im.toss.state.spec.SessionState;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.iconbutton.TdsIconButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.PillarSwipeRefreshLayout;
import im.toss.uikit.widget.TdsSkeletonV1View;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.gl.TdsGLBlurView;
import im.toss.uikit.widget.tooltip.TdsHighlightV2View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.ALCFaceEmotion;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppLogger;
import o.AppLovinSdkInitializationConfigurationImpl;
import o.AppLovinSdkSettings;
import o.AppxNgRuntimeChecker;
import o.AutoCallback;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BaseEmbedView;
import o.BigDataChannelPolicy;
import o.CameraControllerExternalSyntheticLambda0;
import o.ConnectionLog;
import o.ConvertFloatArrayToByteArray;
import o.DERSet;
import o.DERString;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.DomainConfigProxy;
import o.ExecutorHelper;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.FragmentStateAdapterFragmentMaxLifecycleEnforcer3;
import o.GeckoHubImp;
import o.GriverDialogExtension;
import o.ICustomTabsCallback_Parcel;
import o.IIpcChannelStubProxy;
import o.Interruptor;
import o.LifecyclesKtawaitStarted21;
import o.LogTrackFlag;
import o.PlayerErrorCode;
import o.RVManifestLazyProxyManifest;
import o.RVManifestServiceBeanManifest;
import o.RVManifestWrapper;
import o.RemoteDebugUtils;
import o.RuntimeErrorNoProxy;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextRoundCornerProgressBarSavedState1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.VideoEncoderInfoImplExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.addOnPageChangeListener;
import o.addPolicy;
import o.containsPackage;
import o.deleteProfile;
import o.deprecated_certificatePinner;
import o.deprecated_secure;
import o.deserializeUriNullableCollection;
import o.doInitialize;
import o.enableFabricLogs;
import o.enableOnlineDebug;
import o.fillData;
import o.filterCreatePageParams;
import o.findResAndMsg;
import o.forceInnerPermissionCheck;
import o.formatMsgs;
import o.generateInviteUrl;
import o.getBillingPeriod;
import o.getByteBuffer;
import o.getContentProvider;
import o.getCornerRadius;
import o.getEmbedWebViewEnv;
import o.getGroupName;
import o.getOuterPage;
import o.getPricingPhaseList;
import o.getRawResource;
import o.getRemoteControlManagement;
import o.getRemoteSignature;
import o.getRequestHeader;
import o.getResourcePackages;
import o.getStart;
import o.getTrimPathStart;
import o.getWrite;
import o.handleRemoveKey;
import o.hasVaryAll;
import o.isError;
import o.isFireOS;
import o.isMuted;
import o.maybeUpdateAnimatable;
import o.mergeParams;
import o.nSetPosition;
import o.onRenderReady;
import o.onTextViewSizeChanged;
import o.onVisit;
import o.patch;
import o.processBytes;
import o.processTransparent;
import o.readIntokhttp;
import o.resetScaleAndCenter;
import o.sendBroadcastWithAdObject;
import o.setActivityClz;
import o.setBitmapDecoderClass;
import o.setChannelId;
import o.setExtras;
import o.setHasScreenShot;
import o.setHasWhiteScreen;
import o.setRandomHost;
import o.setRubIn;
import o.setStart;
import o.setStartParam;
import o.setTagsokhttp;
import o.varyFields;
import o.varyMatches;
import o.withOrigin;
import o.zzad;
import o.zzag;
import o.zzay;
import o.zzcl;
import o.zzcv;
import o.zzdt;
import o.zzm;
import o.zzo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.StatusManager;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;
import viva.republica.toss.send.v4.entity.TransferSource;

@DERString(IAuthTabCallback = URI.ENABLE_BACKWARDS_COMPATIBILITY, onExtraCallback = {TossAffiliate.CORE, TossAffiliate.BANK})
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class HomeFragment extends Hilt_HomeFragment<RemoteDebugUtils, HomeViewModel, getResourcePackages> implements StatusManager.onExtraCallback, ConnectionLog.IAuthTabCallback, zzo, FragmentStateAdapterFragmentMaxLifecycleEnforcer3 {
    public static final IAuthTabCallback Companion;
    public static final int IAuthTabCallback;
    private static int ICustomTabsCallback;
    private static int onActivityResized;
    private static final String onExtraCallbackWithResult;
    private final int IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private float IAuthTabCallback_Parcel;
    private boolean access000;
    private setBitmapDecoderClass access100;
    private final String asBinder;
    private final Lazy asInterface;

    @Inject
    public GriverDialogExtension currencyNotificationManager;

    @Inject
    public zzad environments;
    private Rally extraCallback;
    private final Lazy extraCallbackWithResult;
    private boolean getInterfaceDescriptor;

    @Inject
    public DomainConfigProxy homeChangeHelper;

    @Inject
    public getContentProvider homeFragmentUtil;

    @Inject
    public withOrigin inAppUpdateManager;

    @Inject
    public AppLovinSdkInitializationConfigurationImpl inbox;

    @Inject
    public InventoryAdManager inventoryAdManager;

    @Inject
    public NativeAdsManager nativeAdsManager;
    private final Lazy onExtraCallback;
    private int onTransact;

    @Inject
    public getBillingPeriod regionManager;

    @Inject
    public SessionState sessionState;

    @Inject
    public zzag tossClock;
    private static final byte[] $$d = {126, 1, 26, -71};
    private static final int $$e = 173;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onMinimized = 1;
    private static int writeTypedObject = 0;
    private static int readTypedObject = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$f(int i, short s, int i2) {
        int i3;
        byte[] bArr = $$d;
        int i4 = 105 - (i * 2);
        int i5 = i2 * 2;
        int i6 = 4 - (s * 3);
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i6++;
            i4 += i7;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i3++;
            i7 = bArr[i6];
            i6++;
            i4 += i7;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    static {
        onActivityResized = 0;
        requestPostMessageChannelWithExtras();
        Object[] objArr = new Object[1];
        c(new char[]{'\n', '\f', 5, 65484, 65484, 65495, 16, 16, '\f', 17, 15, 2, '\r', 18, 16, 2}, AndroidCharacter.getMirror('0') - '!', true, 16 + (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 218, objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Object obj = null;
        Companion = new IAuthTabCallback((DefaultConstructorMarker) null);
        IAuthTabCallback = 8;
        int i = onMinimized + 47;
        onActivityResized = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ View IAuthTabCallback(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 95;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return onActivityResized(homeFragment);
        }
        onActivityResized(homeFragment);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Map map, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 27;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return asBinder(map, setDetectableSize);
        }
        asBinder(map, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 113;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {setDetectableSize};
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = handleRemoveKey.onExtraCallbackWithResult();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult, objArr, -2017587596, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, 2017587613);
        int i4 = writeTypedObject + 41;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int IAuthTabCallbackDefault(HomeFragment homeFragment) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = readTypedObject + 113;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iWriteTypedObject = writeTypedObject(homeFragment);
        int i4 = readTypedObject + 31;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return iWriteTypedObject;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 11;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnActivityLayout = onActivityLayout(homeFragment);
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return unitOnActivityLayout;
    }

    public static /* synthetic */ Unit asBinder(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 109;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallbackStub = ICustomTabsCallbackStub(homeFragment);
        int i4 = writeTypedObject + 113;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitICustomTabsCallbackStub;
        }
        throw null;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        HomeFragment homeFragment = (HomeFragment) objArr[0];
        RVManifestLazyProxyManifest rVManifestLazyProxyManifest = (RVManifestLazyProxyManifest) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        int i = 2 % 2;
        int i2 = writeTypedObject + 9;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(homeFragment, rVManifestLazyProxyManifest, function0);
        int i4 = readTypedObject + 33;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ boolean isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 29;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[0], -1700819831, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 1700819845)).booleanValue();
        int i4 = writeTypedObject + 77;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        HomeFragment homeFragment = (HomeFragment) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = writeTypedObject + 79;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(homeFragment, fFloatValue);
        }
        onExtraCallbackWithResult(homeFragment, fFloatValue);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = readTypedObject + 3;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnUnminimized = onUnminimized(homeFragment);
        int i4 = readTypedObject + 125;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnUnminimized;
    }

    public static /* synthetic */ Unit onExtraCallback(HomeFragment homeFragment, setHasScreenShot.onWarmupCompleted onwarmupcompleted, fillData filldata) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 95;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(homeFragment, onwarmupcompleted, filldata);
        int i4 = readTypedObject + 85;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, BpsBannerDto.Slot slot, String str2, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 49;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, slot, str2, setDetectableSize);
        int i4 = readTypedObject + 83;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 29;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, setDetectableSize);
        int i4 = readTypedObject + 47;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback(RecyclerView.ViewHolder viewHolder, Object obj, Float f) {
        int i = 2 % 2;
        int i2 = readTypedObject + 3;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(viewHolder, obj, f);
        int i4 = readTypedObject + 17;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return zIAuthTabCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback(HomeFragment homeFragment, setHasScreenShot sethasscreenshot) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 15;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(homeFragment, sethasscreenshot);
        int i4 = readTypedObject + 45;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ WindowInsetsCompat onExtraCallbackWithResult(RemoteDebugUtils remoteDebugUtils, HomeFragment homeFragment, View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = readTypedObject + 115;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(remoteDebugUtils, homeFragment, view, windowInsetsCompat);
            obj.hashCode();
            throw null;
        }
        WindowInsetsCompat windowInsetsCompatIAuthTabCallback = IAuthTabCallback(remoteDebugUtils, homeFragment, view, windowInsetsCompat);
        int i3 = readTypedObject + 31;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return windowInsetsCompatIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i2;
        int i9 = (~i) | i8;
        int i10 = i7 | (~i9);
        int i11 = i | i8;
        int i12 = ~(i9 | i6);
        int i13 = i2 + i6 + i3 + (1075552530 * i4) + ((-1519595880) * i5);
        int i14 = i13 * i13;
        int i15 = (((-1050772794) * i2) - 1639710720) + ((-2116975300) * i6) + (i10 * (-533101253)) + (533101253 * i11) + ((-533101253) * i12) + ((-1583874048) * i3) + ((-189792256) * i4) + (1111490560 * i5) + (1415839744 * i14);
        int i16 = (i2 * 251836610) + 257048825 + (i6 * 251838484) + (i10 * 937) + (i11 * (-937)) + (i12 * 937) + (i3 * 251837547) + (i4 * 1710852742) + (i5 * (-1855850104)) + (i14 * (-1244921856));
        switch (i15 + (i16 * i16 * (-1300496384))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                PillarSwipeRefreshLayout pillarSwipeRefreshLayout = (PillarSwipeRefreshLayout) objArr[0];
                HomeFragment homeFragment = (HomeFragment) objArr[1];
                int i17 = 2 % 2;
                int i18 = writeTypedObject + 67;
                readTypedObject = i18 % 128;
                int i19 = i18 % 2;
                onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{pillarSwipeRefreshLayout, homeFragment}, 1143149084, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -1143149061);
                int i20 = writeTypedObject + 1;
                readTypedObject = i20 % 128;
                int i21 = i20 % 2;
                return null;
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                return asBinder(objArr);
            case 10:
                HomeFragment homeFragment2 = (HomeFragment) objArr[0];
                int i22 = 2 % 2;
                int i23 = readTypedObject + 107;
                writeTypedObject = i23 % 128;
                int i24 = i23 % 2;
                homeFragment2.access000 = false;
                Unit unit = Unit.INSTANCE;
                int i25 = writeTypedObject + 23;
                readTypedObject = i25 % 128;
                int i26 = i25 % 2;
                return unit;
            case 11:
                return asInterface(objArr);
            case 12:
                return getInterfaceDescriptor(objArr);
            case 13:
                return access000(objArr);
            case 14:
                return access100(objArr);
            case 15:
                HomeFragment homeFragment3 = (HomeFragment) objArr[0];
                setHasScreenShot.onExtraCallback onextracallback = (setHasScreenShot.onExtraCallback) objArr[1];
                int i27 = 2 % 2;
                int i28 = readTypedObject + 21;
                writeTypedObject = i28 % 128;
                int i29 = i28 % 2;
                homeFragment3.onWarmupCompleted(onextracallback);
                int i30 = readTypedObject + 57;
                writeTypedObject = i30 % 128;
                int i31 = i30 % 2;
                return null;
            case 16:
                return IAuthTabCallback_Parcel(objArr);
            case 17:
                return IAuthTabCallbackStubProxy(objArr);
            case 18:
                return readTypedObject(objArr);
            case 19:
                return writeTypedObject(objArr);
            case 20:
                return ICustomTabsCallback(objArr);
            case 21:
                return extraCallbackWithResult(objArr);
            case 22:
                return extraCallback(objArr);
            case 23:
                return onMinimized(objArr);
            case 24:
                return onPostMessage(objArr);
            case 25:
                return onActivityLayout(objArr);
            case R$styleable.CameraView_cameraPictureMetering /* 26 */:
                return onMessageChannelReady(objArr);
            case 27:
                return onActivityResized(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = readTypedObject + 25;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnMessageChannelReady = onMessageChannelReady(homeFragment);
        int i4 = writeTypedObject + 85;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnMessageChannelReady;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(HomeFragment homeFragment, List list) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 29;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(homeFragment, list);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(homeFragment, list);
        int i3 = readTypedObject + 57;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 77;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{setDetectableSize}, 418332360, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -418332335);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(HomeFragment homeFragment, fillData filldata, setHasScreenShot.onNavigationEvent onnavigationevent, View view) {
        int i = 2 % 2;
        int i2 = readTypedObject + 123;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(homeFragment, filldata, onnavigationevent, view);
        int i4 = writeTypedObject + 83;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(HomeFragment homeFragment, setHasScreenShot.onExtraCallback onextracallback, RemoteDebugUtils remoteDebugUtils, View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 57;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(homeFragment, onextracallback, remoteDebugUtils, view);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        HomeFragment homeFragment = (HomeFragment) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 101;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(homeFragment, view);
        int i4 = writeTypedObject + 33;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 49;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setDetectableSize);
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 21;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return onMinimized(homeFragment);
        }
        onMinimized(homeFragment);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(HomeFragment homeFragment, float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 37;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(homeFragment, f);
        int i4 = readTypedObject + 93;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(HomeFragment homeFragment, View view) {
        int i = 2 % 2;
        int i2 = readTypedObject + 17;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{homeFragment, view}, 733777877, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -733777866);
        int i4 = writeTypedObject + 111;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(HomeFragment homeFragment, View view, AppLogger appLogger) {
        int i = 2 % 2;
        int i2 = readTypedObject + 93;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(homeFragment, view, appLogger);
        int i4 = readTypedObject + 101;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(HomeFragment homeFragment, fillData filldata, setHasScreenShot.onNavigationEvent onnavigationevent, View view) {
        int i = 2 % 2;
        int i2 = readTypedObject + 41;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{homeFragment, filldata, onnavigationevent, view}, -202868565, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 202868566);
            int i3 = 88 / 0;
        } else {
            onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{homeFragment, filldata, onnavigationevent, view}, -202868565, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 202868566);
        }
        int i4 = readTypedObject + 109;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onTransact(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 111;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnRelationshipValidationResult = onRelationshipValidationResult(homeFragment);
        int i4 = writeTypedObject + 21;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnRelationshipValidationResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 39;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(function1, obj);
        if (i3 == 0) {
            int i4 = 2 / 0;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = readTypedObject + 23;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{homeFragment}, 197105921, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -197105911);
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(HomeFragment homeFragment, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 47;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(homeFragment, view);
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
    }

    public static final class onRelationshipValidationResult extends Lambda implements Function0<Fragment> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onRelationshipValidationResult(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        public final Fragment IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 57;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Fragment fragment = this.$this_viewModels;
            int i4 = i2 + 101;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Fragment fragmentIAuthTabCallback = IAuthTabCallback();
            if (i3 == 0) {
                int i4 = 75 / 0;
            }
            return fragmentIAuthTabCallback;
        }
    }

    public static final class onUnminimized extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onUnminimized(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted();
            }
            onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0 = (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
            int i4 = IAuthTabCallback + 113;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda0;
        }
    }

    public static final class ICustomTabsCallbackDefault extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ICustomTabsCallbackDefault(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onNavigationEvent();
            }
            onNavigationEvent();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
            int i4 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return viewModelStore;
        }
    }

    public static final class isEngagementSignalsApiAvailable extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public isEngagementSignalsApiAvailable(Fragment fragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedIAuthTabCallback = IAuthTabCallback();
            int i4 = IAuthTabCallback + 85;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedIAuthTabCallback;
        }

        public final ViewModelProvider.onWarmupCompleted IAuthTabCallback() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            int i = 2 % 2;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
            } else {
                int i2 = IAuthTabCallback + 57;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                textFieldKeyInputExternalSyntheticLambda6 = null;
            }
            if (textFieldKeyInputExternalSyntheticLambda6 != null) {
                int i4 = onWarmupCompleted + 7;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory();
                if (defaultViewModelProviderFactory != null) {
                    int i6 = onWarmupCompleted + 85;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return defaultViewModelProviderFactory;
                }
            }
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
            int i8 = onWarmupCompleted + 25;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return defaultViewModelProviderFactory2;
        }
    }

    public static final class mayLaunchUrl extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public mayLaunchUrl(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = IAuthTabCallback + 87;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallbackWithResult() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            IAuthTabCallback = i2 % 128;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6 = null;
            if (i2 % 2 != 0) {
                Function0 function0 = this.$extrasProducer;
                if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                    return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                }
                AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
                if (androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                    textFieldKeyInputExternalSyntheticLambda6 = (TextFieldKeyInputExternalSyntheticLambda6) androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent;
                } else {
                    int i3 = IAuthTabCallback + 99;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 5 % 4;
                    }
                }
                if (textFieldKeyInputExternalSyntheticLambda6 != null) {
                    int i5 = onNavigationEvent + 51;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras();
                }
                return AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(char[] cArr, int i, boolean z, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(ICustomTabsCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 35125), 23 - TextUtils.indexOf("", ""), 10278 - View.resolveSize(0, 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        char cIndexOf = (char) (12843 - TextUtils.indexOf("", "", 0, 0));
                        int keyRepeatDelay = 55 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 2168;
                        byte b = (byte) ($$d[1] - 1);
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, keyRepeatDelay, iLastIndexOf, 1298711993, false, $$f(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i7 = $11 + 79;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    char cGreen = (char) (12843 - Color.green(0));
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 55;
                    int doubleTapTimeout = 2167 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte b3 = (byte) ($$d[1] - 1);
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cGreen, maximumDrawingCacheSize, doubleTapTimeout, 1298711993, false, $$f(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i9 = $10 + 43;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public static final /* synthetic */ int IAuthTabCallback(HomeFragment homeFragment, int i) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 117;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return homeFragment.onExtraCallback(i);
        }
        homeFragment.onExtraCallback(i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(HomeFragment homeFragment, Function0 function0) {
        int i = 2 % 2;
        int i2 = readTypedObject + 81;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.onNavigationEvent((Function0<Unit>) function0);
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
    }

    public static final /* synthetic */ void IAuthTabCallbackStubProxy(HomeFragment homeFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 19;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.validateRelationship();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ HomeDstView IAuthTabCallback_Parcel(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 85;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        HomeDstView homeDstViewOnPostMessage = homeFragment.onPostMessage();
        int i4 = writeTypedObject + 7;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return homeDstViewOnPostMessage;
    }

    public static final /* synthetic */ void ICustomTabsCallback(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = readTypedObject + 37;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.access200();
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        HomeFragment homeFragment = (HomeFragment) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = readTypedObject + 49;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        if (i3 == 0) {
            return Boolean.valueOf(((Boolean) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{homeFragment, boolValueOf}, -1876319326, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 1876319333)).booleanValue());
        }
        ((Boolean) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{homeFragment, boolValueOf}, -1876319326, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 1876319333)).booleanValue();
        throw null;
    }

    public static final /* synthetic */ RemoteDebugUtils access000(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 69;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback = homeFragment.onExtraCallback();
        int i4 = writeTypedObject + 119;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return remoteDebugUtilsOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean access100(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = readTypedObject + 123;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        boolean z = homeFragment.IAuthTabCallbackStub;
        int i5 = i3 + 23;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public static final /* synthetic */ void asInterface(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 71;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.setEngagementSignalsCallback();
        int i4 = writeTypedObject + 75;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ boolean extraCallback(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 55;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zIEngagementSignalsCallback_Parcel = homeFragment.IEngagementSignalsCallback_Parcel();
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        return zIEngagementSignalsCallback_Parcel;
    }

    public static final /* synthetic */ void extraCallbackWithResult(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = readTypedObject + 69;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.ITrustedWebActivityServiceStubProxy();
        int i4 = writeTypedObject + 67;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onExtraCallback(HomeFragment homeFragment, List list) {
        int i = 2 % 2;
        int i2 = readTypedObject + 67;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.IAuthTabCallback((List<AppLogger>) list);
        if (i3 != 0) {
            throw null;
        }
        int i4 = writeTypedObject + 119;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onExtraCallback(HomeFragment homeFragment, setHasScreenShot.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = readTypedObject + 43;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.onNavigationEvent(onnavigationevent);
        int i4 = writeTypedObject + 85;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
    }

    public static final /* synthetic */ void onExtraCallback(HomeFragment homeFragment, setHasScreenShot.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = readTypedObject + 91;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.onExtraCallbackWithResult(onwarmupcompleted);
        int i4 = writeTypedObject + 89;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onExtraCallback(HomeFragment homeFragment, boolean z) {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 77;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        homeFragment.IAuthTabCallbackStub = z;
        if (i4 != 0) {
            int i5 = 43 / 0;
        }
        int i6 = i2 + 39;
        writeTypedObject = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(HomeFragment homeFragment, setHasScreenShot sethasscreenshot) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = readTypedObject + 7;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.onNavigationEvent(sethasscreenshot);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = readTypedObject + 1;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        HomeFragment homeFragment = (HomeFragment) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 27;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{homeFragment}, 4688640, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -4688631);
            int i3 = 39 / 0;
        } else {
            onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{homeFragment}, 4688640, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -4688631);
        }
        int i4 = readTypedObject + 49;
        writeTypedObject = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Unit readTypedObject(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitRemoteActionCompatParcelizer = homeFragment.RemoteActionCompatParcelizer();
        int i4 = readTypedObject + 113;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unitRemoteActionCompatParcelizer;
        }
        throw null;
    }

    public /* synthetic */ AutoCallback IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 41;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return requestPostMessageChannel();
        }
        requestPostMessageChannel();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: im.toss.features.home.ui.dst.view.home.HomeFragment$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<View, RemoteDebugUtils> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        public static final AnonymousClass3 onNavigationEvent = new AnonymousClass3();
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 37;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 47 / 0;
            }
        }

        AnonymousClass3() {
            super(1, RemoteDebugUtils.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/home/ui/dst/databinding/HomeFragmentHomeBinding;", 0);
        }

        public final RemoteDebugUtils IAuthTabCallback(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                RemoteDebugUtils.onWarmupCompleted(view);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(view, "");
            RemoteDebugUtils remoteDebugUtilsOnWarmupCompleted = RemoteDebugUtils.onWarmupCompleted(view);
            int i3 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return remoteDebugUtilsOnWarmupCompleted;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            RemoteDebugUtils remoteDebugUtilsIAuthTabCallback = IAuthTabCallback((View) obj);
            int i4 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return remoteDebugUtilsIAuthTabCallback;
            }
            throw null;
        }
    }

    public HomeFragment() throws Throwable {
        super(R.layout.home_fragment_home, AnonymousClass3.onNavigationEvent);
        Object[] objArr = new Object[1];
        c(new char[]{5, 3, 65531, 65534}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2, false, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3, 224 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        this.asBinder = ((String) objArr[0]).intern();
        Lazy lazyOnNavigationEvent = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onUnminimized(new onRelationshipValidationResult(this)));
        this.extraCallbackWithResult = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(HomeViewModel.class), new ICustomTabsCallbackDefault(lazyOnNavigationEvent), new mayLaunchUrl(null, lazyOnNavigationEvent), new isEngagementSignalsApiAvailable(this, lazyOnNavigationEvent));
        this.IAuthTabCallbackDefault = im.toss.tds.R.color.background_lower;
        this.asInterface = LazyKt.onExtraCallbackWithResult(new HomeFragment$.ExternalSyntheticLambda30());
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new HomeFragment$.ExternalSyntheticLambda31(this));
        this.IAuthTabCallbackStub = true;
    }

    static final class ICustomTabsCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asInterface = 1;
        private static int onWarmupCompleted;
        int label;
        private static char[] IAuthTabCallback = {32517, 32571, 32512, 32523, 32518, 32516, 32513, 32766, 32705, 32514, 32569, 32740, 32737, 32534, 32535, 32532, 32527, 32521, 32753, 32522, 32755, 32520, 32515, 32575, 32707, 32533};
        private static int onNavigationEvent = -1184333904;
        private static boolean onExtraCallback = true;
        private static boolean onExtraCallbackWithResult = true;

        ICustomTabsCallbackStub(access13800<? super ICustomTabsCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        public static /* synthetic */ void onExtraCallbackWithResult(HomeFragment homeFragment) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(homeFragment);
            int i4 = asInterface + 101;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 65 / 0;
            }
        }

        public static /* synthetic */ Unit onNavigationEvent(HomeFragment homeFragment) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(homeFragment);
            if (i3 == 0) {
                int i4 = 30 / 0;
            }
            int i5 = asInterface + 21;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return unitOnWarmupCompleted;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallbackStub iCustomTabsCallbackStub = HomeFragment.this.new ICustomTabsCallbackStub(access13800Var);
            int i2 = onWarmupCompleted + 33;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return iCustomTabsCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            Object objOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            asInterface = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                int i3 = 82 / 0;
            } else {
                objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            }
            int i4 = onWarmupCompleted + 63;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ICustomTabsCallbackStub iCustomTabsCallbackStubCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return iCustomTabsCallbackStubCreate.invokeSuspend(unit);
            }
            iCustomTabsCallbackStubCreate.invokeSuspend(unit);
            throw null;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = IAuthTabCallback;
            long j = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) - 1), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 77, 20953 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i4++;
                        j = 0;
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
            try {
                Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 75 - TextUtils.getTrimmedLength(""), 16037 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                if (onExtraCallbackWithResult) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i5 = $10 + 43;
                        $11 = i5 % 128;
                        if (i5 % 2 == 0) {
                            cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] / iIntValue);
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (Process.myPid() >> 22) + 63, 12214 - (Process.myTid() >> 22), 260110015, false, "v", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        } else {
                            cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 64 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback4).invoke(null, objArr5);
                        }
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (!onExtraCallback) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                    char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i6 = $11 + 21;
                        $10 = i6 % 128;
                        if (i6 % 2 != 0) {
                            cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i] * iIntValue);
                            i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                        } else {
                            cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                            i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                        }
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    try {
                        Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), Color.argb(0, 0, 0, 0) + 63, KeyEvent.normalizeMetaState(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new String(cArr6);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            Bundle arguments = HomeFragment.this.getArguments();
            boolean zAreEqual = Intrinsics.areEqual(arguments != null ? arguments.getString("showTeensNewToss") : null, "true");
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1MediaBrowserCompatMediaItem = addPolicy.MediaBrowserCompatMediaItem();
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-118, -121, -111, -122, -102, -126, -112, -121, -123, -122, -118, -111, -119, -127, -127, -121, -122, -103, -117, -124, -118, -119, -110, -118, -111, -112, -123, -113, -121, -114, -118, -121, -103, -106, -122, -126, -121, -104, -119}, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
            boolean zAreEqual2 = Intrinsics.areEqual(textRoundCornerProgressBarSavedState1MediaBrowserCompatMediaItem.IAuthTabCallback(((String) objArr[0]).intern()), "shown");
            Context contextRequireContext = HomeFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            boolean zOnWarmupCompleted = varyFields.onWarmupCompleted(contextRequireContext);
            if (PlayerErrorCode.writeTypedObject() == 14 && resetScaleAndCenter.onNavigationEvent.onWarmupCompleted()) {
                int i2 = asInterface + 97;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                if (zAreEqual2) {
                }
            } else if (!resetScaleAndCenter.onNavigationEvent.onExtraCallback()) {
                int i4 = asInterface + 41;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                if (zAreEqual) {
                    if (zOnWarmupCompleted) {
                        HomeFragment.asInterface(HomeFragment.this);
                    } else {
                        HomeDstView homeDstViewIAuthTabCallback_Parcel = HomeFragment.IAuthTabCallback_Parcel(HomeFragment.this);
                        if (homeDstViewIAuthTabCallback_Parcel != null) {
                            homeDstViewIAuthTabCallback_Parcel.post(new HomeFragment$showTeensOnboardingIfNeeded$1$.ExternalSyntheticLambda0(HomeFragment.this));
                        }
                    }
                    resetScaleAndCenter.onNavigationEvent.onExtraCallback(false);
                }
            }
            return Unit.INSTANCE;
        }

        private static final void onExtraCallback(HomeFragment homeFragment) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            if (onRenderReady.IAuthTabCallback(homeFragment)) {
                HomeFragment.IAuthTabCallback(homeFragment, (Function0) new HomeFragment$showTeensOnboardingIfNeeded$1$.ExternalSyntheticLambda1(homeFragment));
                int i4 = asInterface + 113;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        private static final Unit onWarmupCompleted(HomeFragment homeFragment) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 85;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-124, -105, -121, -106, -107, -123, -124, -123, -123, -124, -108, -124, -123, -109, -110, -118, -111, -112, -123, -113, -121, -114, -118, -115, -127, -127, -121, -116, -117, -124, -118, -119, -127, -118, -124, -124, -122, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, 36 / (ViewConfiguration.getTapTimeout() >> 60), objArr);
                BaseHomeFragment.onExtraCallbackWithResult(homeFragment, ((String) objArr[0]).intern(), (Bundle) null, 4, (Object) null);
            } else {
                Object[] objArr2 = new Object[1];
                a(null, null, new byte[]{-124, -105, -121, -106, -107, -123, -124, -123, -123, -124, -108, -124, -123, -109, -110, -118, -111, -112, -123, -113, -121, -114, -118, -115, -127, -127, -121, -116, -117, -124, -118, -119, -127, -118, -124, -124, -122, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, 127 - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
                BaseHomeFragment.onExtraCallbackWithResult(homeFragment, ((String) objArr2[0]).intern(), (Bundle) null, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    public String IAuthTabCallbackStub() {
        String str;
        int i = 2 % 2;
        int i2 = writeTypedObject + 109;
        int i3 = i2 % 128;
        readTypedObject = i3;
        if (i2 % 2 == 0) {
            str = this.asBinder;
            int i4 = 54 / 0;
        } else {
            str = this.asBinder;
        }
        int i5 = i3 + 61;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getAccessibilityPaneTitle(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = readTypedObject + 123;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        String string = context.getString(R.string.home_ui_dst_accessibility_pane_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = readTypedObject + 103;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public InventoryAdManager updateVisuals() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 69;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        InventoryAdManager inventoryAdManager = this.inventoryAdManager;
        if (inventoryAdManager != null) {
            return inventoryAdManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = writeTypedObject + 113;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 123;
        im.toss.features.home.ui.dst.view.home.HomeFragment.writeTypedObject = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NativeAdsManager onNavigationEvent() {
        NativeAdsManager nativeAdsManager;
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 41;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            nativeAdsManager = this.nativeAdsManager;
            int i4 = 23 / 0;
        } else {
            nativeAdsManager = this.nativeAdsManager;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity == null || !baseActivity.extraCallbackWithResult()) {
            int i2 = readTypedObject + 73;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            return 1000584L;
        }
        int i4 = readTypedObject + 91;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return -1L;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009a A[PHI: r1
      0x009a: PHI (r1v21 java.lang.String) = (r1v20 java.lang.String), (r1v22 java.lang.String) binds: [B:18:0x0098, B:15:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map<String, Object> getScreenParams() throws Throwable {
        Intent intent;
        Uri data;
        FragmentActivity activity;
        Intent intent2;
        Uri data2;
        String queryParameter;
        int i = 2 % 2;
        int i2 = writeTypedObject + 105;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        c(new char[]{65530, 7, 7, 65530, 65531, 65530, 7, 7}, Process.getGidForName("") + 3, false, 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16), AndroidCharacter.getMirror('0') + 177, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("category", "dashboard"), getWrite.IAuthTabCallback("version", 4)});
        String string = null;
        if (!(true ^ IEngagementSignalsCallback_Parcel())) {
            int i4 = readTypedObject + 57;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            FragmentActivity activity2 = getActivity();
            if (activity2 == null || (intent = activity2.getIntent()) == null || (data = intent.getData()) == null) {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    string = arguments.getString(strIntern);
                }
                if (string != null) {
                    mapIAuthTabCallback.put(strIntern, string);
                }
            } else {
                int i6 = writeTypedObject + 75;
                readTypedObject = i6 % 128;
                if (i6 % 2 == 0) {
                    data.getQueryParameter(strIntern);
                    throw null;
                }
                String queryParameter2 = data.getQueryParameter(strIntern);
                if (queryParameter2 != null) {
                    string = queryParameter2;
                }
                if (string != null) {
                }
            }
        } else if (newSession().onExtraCallbackWithResult() != getPricingPhaseList.KR && (activity = getActivity()) != null && (intent2 = activity.getIntent()) != null && (data2 = intent2.getData()) != null) {
            int i7 = readTypedObject + 45;
            writeTypedObject = i7 % 128;
            if (i7 % 2 != 0) {
                queryParameter = data2.getQueryParameter(strIntern);
                int i8 = 36 / 0;
                if (queryParameter != null) {
                    int i9 = readTypedObject + 53;
                    writeTypedObject = i9 % 128;
                    int i10 = i9 % 2;
                    mapIAuthTabCallback.put(strIntern, queryParameter);
                    if (i10 != 0) {
                        string.hashCode();
                        throw null;
                    }
                }
            } else {
                queryParameter = data2.getQueryParameter(strIntern);
                if (queryParameter != null) {
                }
            }
        }
        return mapIAuthTabCallback;
    }

    protected HomeViewModel requestPostMessageChannel() {
        int i = 2 % 2;
        int i2 = readTypedObject + 65;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        HomeViewModel homeViewModel = (HomeViewModel) this.extraCallbackWithResult.getValue();
        int i4 = readTypedObject + 97;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return homeViewModel;
    }

    public int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 87;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public View onTransact() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 9;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback = onExtraCallback();
        if (remoteDebugUtilsOnExtraCallback == null) {
            int i4 = writeTypedObject + 63;
            readTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 47 / 0;
            }
            return null;
        }
        AppBarLayout appBarLayout = remoteDebugUtilsOnExtraCallback.IAuthTabCallback;
        int i6 = writeTypedObject + 61;
        readTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            return appBarLayout;
        }
        throw null;
    }

    public int access100() {
        DisplayMetrics displayMetrics;
        int i;
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 47;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            displayMetrics = getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            i = 37;
        } else {
            displayMetrics = getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            i = -12;
        }
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Integer.valueOf(i), displayMetrics);
        int i4 = writeTypedObject + 87;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return iOnNavigationEvent;
        }
        throw null;
    }

    private final boolean IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 7;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.asInterface.getValue()).booleanValue();
        int i4 = writeTypedObject + 3;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT >= 31 && DERSet.onExtraCallback.onTransact()) {
            int i2 = writeTypedObject + 77;
            readTypedObject = i2 % 128;
            return Boolean.valueOf(i2 % 2 != 0);
        }
        int i3 = readTypedObject + 7;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        HomeFragment homeFragment = (HomeFragment) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 79;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) homeFragment.onExtraCallback.getValue()).intValue();
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        int i5 = readTypedObject + 35;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return Integer.valueOf(iIntValue);
        }
        int i6 = 12 / 0;
        return Integer.valueOf(iIntValue);
    }

    private static final int writeTypedObject(HomeFragment homeFragment) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = readTypedObject + 113;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = homeFragment.getResources();
        int i4 = im.toss.uikit.R.dimen.actionBarSize;
        if (i3 == 0) {
            return resources.getDimensionPixelOffset(i4);
        }
        int dimensionPixelOffset = resources.getDimensionPixelOffset(i4);
        int i5 = 82 / 0;
        return dimensionPixelOffset;
    }

    static final class ICustomTabsCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static short[] onWarmupCompleted;
        int label;
        private static final byte[] $$a = {52, -58, -85, 74};
        private static final int $$b = 176;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asInterface = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int onExtraCallback = -1967097684;
        private static int onNavigationEvent = -1538795400;
        private static int IAuthTabCallback = 1978340641;
        private static byte[] onExtraCallbackWithResult = {-55, -14, -12, 13, 33, -63, 7, -7, 10, 7, -11, 11, -7, 57, -46, -13, 15, 15, -8, 27, -8, 7, -2, 21, -42, 10, 14, 17, -41, 24, -3, 53, -74, 15, 3, 10, -5, 79, 10, -1, -51, 10, 14, -15, 8, 7, -1, -15, 8};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(int i, short s, int i2) {
            int i3;
            int i4 = 3 - (i * 4);
            byte[] bArr = $$a;
            int i5 = s * 3;
            int i6 = (i2 * 3) + 115;
            byte[] bArr2 = new byte[1 - i5];
            int i7 = 0 - i5;
            if (bArr == null) {
                int i8 = i7;
                i3 = 0;
                i6 += i8;
                i4++;
                bArr2[i3] = (byte) i6;
                if (i3 == i7) {
                    return new String(bArr2, 0);
                }
                i3++;
                i8 = bArr[i4];
                i6 += i8;
                i4++;
                bArr2[i3] = (byte) i6;
                if (i3 == i7) {
                }
            } else {
                i3 = 0;
                i4++;
                bArr2[i3] = (byte) i6;
                if (i3 == i7) {
                }
            }
        }

        ICustomTabsCallbackStubProxy(access13800<? super ICustomTabsCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
        }

        public static /* synthetic */ void onExtraCallback(HomeFragment homeFragment) {
            int i = 2 % 2;
            int i2 = asInterface + 55;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(homeFragment);
            if (i3 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = IAuthTabCallbackStub + 95;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }

        public static /* synthetic */ Unit onWarmupCompleted(HomeFragment homeFragment) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 23;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(homeFragment);
            int i4 = asInterface + 69;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallbackStubProxy iCustomTabsCallbackStubProxy = HomeFragment.this.new ICustomTabsCallbackStubProxy(access13800Var);
            int i2 = IAuthTabCallbackStub + 61;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return iCustomTabsCallbackStubProxy;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = asInterface + 53;
            IAuthTabCallbackStub = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 81;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallbackStub + 45;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:75:0x02b5  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x02e1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            long j;
            int i4;
            int i5 = 2;
            int i6 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                long j2 = 0;
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43423), 42 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22438, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                boolean z = iIntValue == -1;
                if (z) {
                    byte[] bArr = onExtraCallbackWithResult;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i7 = 0;
                        while (i7 < length) {
                            int i8 = $11 + 113;
                            $10 = i8 % 128;
                            if (i8 % i5 != 0) {
                                try {
                                    Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                    if (objOnExtraCallback2 == null) {
                                        char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 12843);
                                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 55;
                                        int i9 = 2166 - (ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1));
                                        byte b2 = (byte) 0;
                                        byte b3 = b2;
                                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveOpacity, threadPriority, i9, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                                    i7 = 0;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } else {
                                Object[] objArr4 = {Integer.valueOf(bArr[i7])};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback3 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.getCapsMode("", 0, 0)), Color.argb(0, 0, 0, 0) + 55, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2166, -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                                }
                                bArr2[i7] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                                i7++;
                            }
                            i5 = 2;
                            j2 = 0;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = onExtraCallbackWithResult;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 43424), 42 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                        int i10 = $11 + 43;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    }
                } else {
                    j = -4629411779493505016L;
                }
                if (iIntValue > 0) {
                    int i12 = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ j));
                    if (z) {
                        int i13 = $11 + 107;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i12 + i4;
                    try {
                        Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), Process.getGidForName("") + 87, (ViewConfiguration.getEdgeSlop() >> 16) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        byte[] bArr4 = onExtraCallbackWithResult;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            for (int i15 = 0; i15 < length2; i15++) {
                                bArr5[i15] = (byte) (bArr4[i15] ^ (-4629411779493505016L));
                            }
                            bArr4 = bArr5;
                        }
                        boolean z2 = bArr4 != null;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                        int i16 = $10 + 93;
                        $11 = i16 % 128;
                        int i17 = 2;
                        int i18 = i16 % 2;
                        while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                            int i19 = $11;
                            int i20 = i19 + 35;
                            $10 = i20 % 128;
                            if (i20 % i17 != 0) {
                                int i21 = 41 / 0;
                                if (z2) {
                                    int i22 = i19 + 13;
                                    $10 = i22 % 128;
                                    i17 = 2;
                                    int i23 = i22 % 2;
                                    byte[] bArr6 = onExtraCallbackWithResult;
                                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                                } else {
                                    i17 = 2;
                                    short[] sArr = onWarmupCompleted;
                                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                                }
                            } else if (z2) {
                            }
                            sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            if (r7 == null) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        
            r7 = r7.getString("showTeensNewToss");
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        
            r7 = im.toss.features.home.ui.dst.view.home.HomeFragment.ICustomTabsCallbackStubProxy.asInterface + 13;
            im.toss.features.home.ui.dst.view.home.HomeFragment.ICustomTabsCallbackStubProxy.IAuthTabCallbackStub = r7 % 128;
            r7 = r7 % 2;
            r7 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        
            r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, "true");
            r3 = r6.this$0.getContext();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r3 == null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        
            r4 = im.toss.features.home.ui.dst.view.home.HomeFragment.ICustomTabsCallbackStubProxy.asInterface + 61;
            im.toss.features.home.ui.dst.view.home.HomeFragment.ICustomTabsCallbackStubProxy.IAuthTabCallbackStub = r4 % 128;
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        
            if ((r4 % 2) != 0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        
            o.varyFields.onWarmupCompleted(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
        
            if (o.varyFields.onWarmupCompleted(r3) == true) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
        
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        
            if (r7 == false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
        
            if (r5 == false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
        
            r7 = im.toss.features.home.ui.dst.view.home.HomeFragment.ICustomTabsCallbackStubProxy.IAuthTabCallbackStub + 11;
            im.toss.features.home.ui.dst.view.home.HomeFragment.ICustomTabsCallbackStubProxy.asInterface = r7 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
        
            if ((r7 % 2) != 0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
        
            im.toss.features.home.ui.dst.view.home.HomeFragment.asInterface(r6.this$0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
        
            im.toss.features.home.ui.dst.view.home.HomeFragment.asInterface(r6.this$0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
        
            r7 = im.toss.features.home.ui.dst.view.home.HomeFragment.IAuthTabCallback_Parcel(r6.this$0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
        
            if (r7 == null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
        
            r7.post(new im.toss.features.home.ui.dst.view.home.HomeFragment$showTeensOnboardingByPushIfNeeded$1$.ExternalSyntheticLambda1(r6.this$0));
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
        
            o.resetScaleAndCenter.onNavigationEvent.onExtraCallback(false);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r6.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r6.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r7);
            r7 = r6.this$0.getArguments();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = asInterface + 51;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 24 / 0;
            }
        }

        private static final void onExtraCallbackWithResult(HomeFragment homeFragment) {
            int i = 2 % 2;
            int i2 = asInterface + 19;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (onRenderReady.IAuthTabCallback(homeFragment)) {
                HomeFragment.IAuthTabCallback(homeFragment, (Function0) new HomeFragment$showTeensOnboardingByPushIfNeeded$1$.ExternalSyntheticLambda0(homeFragment));
            }
            int i4 = asInterface + 113;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }

        private static final Unit onNavigationEvent(HomeFragment homeFragment) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 47;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a((short) (Color.rgb(0, 0, 0) + 16777216), (byte) (ExpandableListView.getPackedPositionChild(0L) + 3), (-780640420) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 777204553, (-113) - View.MeasureSpec.getSize(0), objArr);
            BaseHomeFragment.onExtraCallbackWithResult(homeFragment, ((String) objArr[0]).intern(), (Bundle) null, 2, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i4 = asInterface + 73;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    public final AppLovinSdkInitializationConfigurationImpl newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 115;
        int i3 = i2 % 128;
        readTypedObject = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        AppLovinSdkInitializationConfigurationImpl appLovinSdkInitializationConfigurationImpl = this.inbox;
        if (appLovinSdkInitializationConfigurationImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 91;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return appLovinSdkInitializationConfigurationImpl;
        }
        obj.hashCode();
        throw null;
    }

    public final withOrigin prefetch() {
        int i = 2 % 2;
        int i2 = readTypedObject + 105;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        withOrigin withorigin = this.inAppUpdateManager;
        if (withorigin != null) {
            return withorigin;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = readTypedObject + 67;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        int i = 2 % 2;
        DomainConfigProxy domainConfigProxy = ((HomeFragment) objArr[0]).homeChangeHelper;
        Object obj = null;
        if (domainConfigProxy != null) {
            int i2 = readTypedObject + 69;
            writeTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                return domainConfigProxy;
            }
            obj.hashCode();
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = readTypedObject + 37;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final GriverDialogExtension ICustomTabsService() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 27;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        GriverDialogExtension griverDialogExtension = this.currencyNotificationManager;
        if (griverDialogExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 73;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return griverDialogExtension;
    }

    public final getContentProvider newAuthTabSession() {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 41;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        getContentProvider getcontentprovider = this.homeFragmentUtil;
        if (getcontentprovider == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 1;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 + 115;
        readTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            return getcontentprovider;
        }
        throw null;
    }

    public final SessionState postMessage() {
        int i = 2 % 2;
        SessionState sessionState = this.sessionState;
        if (sessionState != null) {
            int i2 = writeTypedObject + 99;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 18 / 0;
            }
            return sessionState;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = writeTypedObject + 25;
        readTypedObject = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final getBillingPeriod newSession() {
        int i = 2 % 2;
        getBillingPeriod getbillingperiod = this.regionManager;
        if (getbillingperiod != null) {
            int i2 = readTypedObject + 125;
            writeTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                return getbillingperiod;
            }
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = readTypedObject + 55;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        r2 = r2 + 71;
        im.toss.features.home.ui.dst.view.home.HomeFragment.writeTypedObject = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        HomeFragment homeFragment = (HomeFragment) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 121;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        zzad zzadVar = homeFragment.environments;
        if (i4 != 0) {
            int i5 = 71 / 0;
        }
    }

    public void onRetry() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        BaseHomeFragment.IAuthTabCallback(this, false, 1, (Object) null);
    }

    public void onCreate(@Nullable Bundle bundle) {
        setBitmapDecoderClass setbitmapdecoderclass;
        int i = 2 % 2;
        super.onCreate(bundle);
        setBitmapDecoderClass parentFragment = getParentFragment();
        if (!(!(parentFragment instanceof setBitmapDecoderClass))) {
            int i2 = readTypedObject;
            int i3 = i2 + 43;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            setbitmapdecoderclass = parentFragment;
            int i5 = i2 + 111;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
        } else {
            setbitmapdecoderclass = null;
        }
        this.access100 = setbitmapdecoderclass;
    }

    public void onStart() throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 107;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            super/*im.toss.base.BaseFragment*/.onStart();
            requestPostMessageChannel().onPostMessage();
            receiveFile();
            int i3 = writeTypedObject + 15;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super/*im.toss.base.BaseFragment*/.onStart();
        requestPostMessageChannel().onPostMessage();
        receiveFile();
        throw null;
    }

    private final void receiveFile() throws Throwable {
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback;
        HomeDstView homeDstView;
        int i = 2 % 2;
        setActivityClz setactivityclzOnGreatestScrollPercentageIncreased = requestPostMessageChannel().onGreatestScrollPercentageIncreased();
        if (setactivityclzOnGreatestScrollPercentageIncreased == null || (remoteDebugUtilsOnExtraCallback = onExtraCallback()) == null || (homeDstView = remoteDebugUtilsOnExtraCallback.onExtraCallback) == null) {
            return;
        }
        int i2 = readTypedObject + 95;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        HomeDstRecyclerView homeDstRecyclerViewOnExtraCallbackWithResult = homeDstView.onExtraCallbackWithResult();
        if (homeDstRecyclerViewOnExtraCallbackWithResult != null) {
            Map mapValidateRelationship = requestPostMessageChannel().validateRelationship();
            Object[] objArr = new Object[1];
            c(new char[]{65530, 7, 7, 65530, 65531, 65530, 7, 7}, 16777218 + Color.rgb(0, 0, 0), false, KeyEvent.normalizeMetaState(0) + 8, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 224, objArr);
            getRequestHeader.onExtraCallback(homeDstRecyclerViewOnExtraCallbackWithResult, setactivityclzOnGreatestScrollPercentageIncreased, (String) mapValidateRelationship.get(((String) objArr[0]).intern()), LogTrackFlag.Companion.onNavigationEvent(newSession().onExtraCallbackWithResult()), false);
            int i4 = writeTypedObject + 95;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit onMinimized(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 71;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            getTrimPathStart gettrimpathstart = getTrimPathStart.onExtraCallbackWithResult;
            FragmentActivity fragmentActivityRequireActivity = homeFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            getTrimPathStart.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, -1511883745, 1511883750, new Object[]{gettrimpathstart, fragmentActivityRequireActivity}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
            Unit unit = Unit.INSTANCE;
            int i3 = readTypedObject + 43;
            writeTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 38 / 0;
            }
            return unit;
        }
        getTrimPathStart gettrimpathstart2 = getTrimPathStart.onExtraCallbackWithResult;
        FragmentActivity fragmentActivityRequireActivity2 = homeFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        getTrimPathStart.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback2, -1511883745, 1511883750, new Object[]{gettrimpathstart2, fragmentActivityRequireActivity2}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        containsPackage.onWarmupCompleted(newSession().onExtraCallbackWithResult(), new HomeFragment$.ExternalSyntheticLambda29(this));
        super.onViewCreated(view, bundle);
        onGreatestScrollPercentageIncreased();
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, -1580285442, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 1580285444);
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, -1861592051, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 1861592071);
        IEngagementSignalsCallbackDefault();
        ITrustedWebActivityServiceDefault();
        notifyNotificationWithChannel();
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, -1049250930, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 1049250954);
        ITrustedWebActivityCallbackStub();
        getSmallIconBitmap();
        IPostMessageServiceDefault();
        ITrustedWebActivityCallback();
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, -1953565586, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 1953565602);
        IPostMessageServiceStubProxy();
        IEngagementSignalsCallbackStubProxy();
        IPostMessageServiceStub();
        cancelNotification();
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, -1226657639, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 1226657647);
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, 2087825122, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -2087825101);
        ITrustedWebActivityServiceStub();
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, 442232045, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -442232039);
        onVerticalScrollEvent();
        IEngagementSignalsCallbackStub();
        maybeUpdateAnimatable.onNavigationEvent(onRenderReady.onExtraCallback(this), (CoroutineContext) null, (setRandomHost) null, new onMinimized(null), 3, (Object) null);
        int i2 = writeTypedObject + 61;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static final class onMinimized extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        Object L$0;
        int label;

        onMinimized(access13800<? super onMinimized> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onMinimized onminimized = HomeFragment.this.new onMinimized(access13800Var);
            int i2 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onminimized;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 2 / 0;
            }
            int i5 = onExtraCallbackWithResult + 31;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            HomeFragment homeFragment;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 77;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                homeFragment = (HomeFragment) this.L$0;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                HomeFragment homeFragment2 = HomeFragment.this;
                LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
                Boolean boolOnNavigationEvent = access14000.onNavigationEvent(true);
                this.L$0 = homeFragment2;
                this.label = 1;
                int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                Object objOnExtraCallback = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted21, "home.inbox.button.dot.enabled", boolOnNavigationEvent, this}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, iIAuthTabCallback);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    int i5 = onNavigationEvent + 9;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnWarmupCompleted;
                }
                int i7 = onNavigationEvent + 93;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                homeFragment = homeFragment2;
                obj = objOnExtraCallback;
            }
            HomeFragment.onExtraCallback(homeFragment, ((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    public void onDestroyView() {
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout;
        int i = 2 % 2;
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback = onExtraCallback();
        if (remoteDebugUtilsOnExtraCallback != null && (pillarSwipeRefreshLayout = remoteDebugUtilsOnExtraCallback.access000) != null) {
            int i2 = writeTypedObject + 17;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                pillarSwipeRefreshLayout.setOnRefreshListener((SwipeRefreshLayout.IAuthTabCallback) null);
                throw null;
            }
            pillarSwipeRefreshLayout.setOnRefreshListener((SwipeRefreshLayout.IAuthTabCallback) null);
            int i3 = readTypedObject + 29;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
        }
        Rally rally = this.extraCallback;
        if (rally != null) {
            int i5 = readTypedObject + 21;
            writeTypedObject = i5 % 128;
            if (i5 % 2 != 0) {
                rally.ICustomTabsServiceStub();
                int i6 = 98 / 0;
            } else {
                rally.ICustomTabsServiceStub();
            }
        }
        this.extraCallback = null;
        super.onDestroyView();
        int i7 = writeTypedObject + 107;
        readTypedObject = i7 % 128;
        int i8 = i7 % 2;
    }

    private static final WindowInsetsCompat IAuthTabCallback(RemoteDebugUtils remoteDebugUtils, HomeFragment homeFragment, View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = readTypedObject + 87;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        int iOnNavigationEvent = forceInnerPermissionCheck.onExtraCallbackWithResult.onNavigationEvent();
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(iOnNavigationEvent);
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        ConstraintLayout constraintLayoutOnNavigationEvent = remoteDebugUtils.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnNavigationEvent, "");
        constraintLayoutOnNavigationEvent.setPadding(cameraControllerExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback, constraintLayoutOnNavigationEvent.getPaddingTop(), cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback);
        AppBarLayout appBarLayout = remoteDebugUtils.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(appBarLayout, "");
        appBarLayout.setPadding(appBarLayout.getPaddingLeft(), cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted, appBarLayout.getPaddingRight(), appBarLayout.getPaddingBottom());
        ConstraintLayout constraintLayoutOnWarmupCompleted = remoteDebugUtils.onExtraCallbackWithResult.onWarmupCompleted();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnWarmupCompleted, "");
        constraintLayoutOnWarmupCompleted.setPadding(constraintLayoutOnWarmupCompleted.getPaddingLeft(), cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted, constraintLayoutOnWarmupCompleted.getPaddingRight(), constraintLayoutOnWarmupCompleted.getPaddingBottom());
        homeFragment.onWarmupCompleted(cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted + ((Integer) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{homeFragment}, -106600496, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 106600508)).intValue());
        remoteDebugUtils.onExtraCallback.onExtraCallbackWithResult().setTopCoverHeightForImpression(homeFragment.onMessageChannelReady());
        homeFragment.onTransact = cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted;
        DisplayMetrics displayMetrics = homeFragment.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(30, displayMetrics);
        HomeDstView homeDstView = remoteDebugUtils.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(homeDstView, "");
        homeDstView.setPadding(homeDstView.getPaddingLeft(), homeDstView.getPaddingTop(), homeDstView.getPaddingRight(), homeFragment.onExtraCallback(iOnNavigationEvent2));
        remoteDebugUtils.onExtraCallback.onExtraCallbackWithResult().setIgnoreBottomAmount(iOnNavigationEvent2);
        HomeDstRecyclerView homeDstRecyclerViewOnExtraCallbackWithResult = remoteDebugUtils.onExtraCallback.onExtraCallbackWithResult();
        homeDstRecyclerViewOnExtraCallbackWithResult.setPadding(homeDstRecyclerViewOnExtraCallbackWithResult.getPaddingLeft(), cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted + ((Integer) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{homeFragment}, -106600496, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 106600508)).intValue(), homeDstRecyclerViewOnExtraCallbackWithResult.getPaddingRight(), iOnNavigationEvent2);
        TdsSkeletonV1View tdsSkeletonV1ViewOnExtraCallback = remoteDebugUtils.onExtraCallback.onExtraCallback();
        tdsSkeletonV1ViewOnExtraCallback.setPadding(tdsSkeletonV1ViewOnExtraCallback.getPaddingLeft(), homeFragment.onMessageChannelReady(), tdsSkeletonV1ViewOnExtraCallback.getPaddingRight(), tdsSkeletonV1ViewOnExtraCallback.getPaddingBottom());
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout = remoteDebugUtils.access000;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        if (!(!((Boolean) PillarSwipeRefreshLayout.onNavigationEvent(new Object[]{pillarSwipeRefreshLayout}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 56358529, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -56358508, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback)).booleanValue())) {
            int i4 = writeTypedObject + 53;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            AppBarLayout appBarLayout2 = remoteDebugUtils.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(appBarLayout2, "");
            pillarSwipeRefreshLayout.setTopOffsetView(appBarLayout2, true, homeFragment.access100());
        } else {
            pillarSwipeRefreshLayout.setProgressViewOffset(false, 0, 0);
        }
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout2 = remoteDebugUtils.access000;
        HomeDstView homeDstView2 = remoteDebugUtils.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(homeDstView2, "");
        pillarSwipeRefreshLayout2.setTargetView(homeDstView2, remoteDebugUtils.onExtraCallback.onExtraCallbackWithResult());
        remoteDebugUtils.IAuthTabCallback.setBackgroundColor(0);
        if (homeFragment.IEngagementSignalsCallback()) {
            remoteDebugUtils.onNavigationEvent.setBlurStyle(new deprecated_secure(0, 0.0f, 0L, 0.0f, 0.0f, 30.0f, false, 95, (DefaultConstructorMarker) null));
            TdsGLBlurView tdsGLBlurView = remoteDebugUtils.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsGLBlurView, "");
            tdsGLBlurView.setVisibility(0);
        }
        return new WindowInsetsCompat.onWarmupCompleted(windowInsetsCompat).onNavigationEvent(iOnNavigationEvent, CameraControllerExternalSyntheticLambda0.onNavigationEvent).onExtraCallbackWithResult();
    }

    private final void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback = onExtraCallback();
        if (remoteDebugUtilsOnExtraCallback != null) {
            int i2 = readTypedObject + 3;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            AppBarLayout appBarLayout = remoteDebugUtilsOnExtraCallback.IAuthTabCallback;
            if (appBarLayout != null) {
                appBarLayout.setBackgroundColor(0);
                int i4 = readTypedObject + 75;
                writeTypedObject = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback2 = onExtraCallback();
        if (remoteDebugUtilsOnExtraCallback2 != null) {
            ViewCompat.onWarmupCompleted(remoteDebugUtilsOnExtraCallback2.onNavigationEvent(), new HomeFragment$.ExternalSyntheticLambda24(remoteDebugUtilsOnExtraCallback2, this));
            if (getActivity() instanceof BaseLauncherWrapperActivity) {
                int i6 = readTypedObject + 97;
                writeTypedObject = i6 % 128;
                int i7 = i6 % 2;
                ViewCompat.extraCommand(remoteDebugUtilsOnExtraCallback2.onNavigationEvent());
                if (i7 != 0) {
                    int i8 = 42 / 0;
                }
            }
        }
        int i9 = readTypedObject + 1;
        writeTypedObject = i9 % 128;
        int i10 = i9 % 2;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        HomeFragment homeFragment = (HomeFragment) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 75;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        HomeDstView homeDstViewOnPostMessage = homeFragment.onPostMessage();
        if (homeDstViewOnPostMessage != null) {
            int i4 = writeTypedObject + 11;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            TdsSkeletonV1View tdsSkeletonV1ViewOnExtraCallback = homeDstViewOnPostMessage.onExtraCallback();
            if (tdsSkeletonV1ViewOnExtraCallback != null) {
                tdsSkeletonV1ViewOnExtraCallback.setSkeletonColor(TdsSkeletonV1View.onWarmupCompleted.GreyOpacity100);
                int i6 = readTypedObject + 65;
                writeTypedObject = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        int i8 = writeTypedObject + 1;
        readTypedObject = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 28 / 0;
        }
        return null;
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 45;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(HomeFragment homeFragment, List list) {
        int i = 2 % 2;
        int i2 = readTypedObject + 121;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(list);
        Boolean bool = (Boolean) list.get(0);
        Boolean bool2 = (Boolean) list.get(1);
        if (!bool.booleanValue()) {
            int i4 = readTypedObject + 103;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            if (bool2.booleanValue()) {
                BaseHomeFragment.IAuthTabCallback(homeFragment, false, 1, (Object) null);
                int i6 = writeTypedObject + 15;
                readTypedObject = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    private final void ITrustedWebActivityCallbackStub() {
        int i = 2 % 2;
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = ((getByteBuffer) onTextViewSizeChanged.IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 773290631, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{onTextViewSizeChanged.onExtraCallbackWithResult, false, 1, null}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -773290631)).IAuthTabCallback(2, 1).IAuthTabCallback(new HomeFragment$.ExternalSyntheticLambda5(new HomeFragment$.ExternalSyntheticLambda4(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        autoDisposable(deserializeurinullablecollectionIAuthTabCallback);
        int i2 = writeTypedObject + 51;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private final void IEngagementSignalsCallbackStubProxy() {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new access000(this, (access13800) null), 3, (Object) null);
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner2), (CoroutineContext) null, (setRandomHost) null, new access100(this, (access13800) null), 3, (Object) null);
        int i2 = readTypedObject + 73;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNewArgument(@Nullable Bundle bundle) throws Throwable {
        Map mapOnNavigationEvent;
        int i = 2 % 2;
        super.onNewArgument(bundle);
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, 442232045, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -442232039);
        validateRelationship();
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, 4688640, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -4688631);
        getSmallIconId();
        if ((!isAdded()) || !onRenderReady.IAuthTabCallback(this)) {
            return;
        }
        int i2 = readTypedObject + 111;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (bundle != null) {
                int i4 = i3 + 49;
                readTypedObject = i4 % 128;
                int i5 = i4 % 2;
                Map mapOnWarmupCompleted = zzay.onWarmupCompleted(bundle);
                if (mapOnWarmupCompleted == null) {
                    mapOnNavigationEvent = access8100.onNavigationEvent();
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : mapOnWarmupCompleted.entrySet()) {
                        if (!DeepLink.Companion.getDeepLinkParams().contains((String) entry.getKey())) {
                            int i6 = writeTypedObject + 69;
                            readTypedObject = i6 % 128;
                            if (i6 % 2 == 0) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                                throw null;
                            }
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    mapOnNavigationEvent = new LinkedHashMap(access8100.IAuthTabCallback(linkedHashMap.size()));
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        mapOnNavigationEvent.put(entry2.getKey(), entry2.getValue().toString());
                    }
                }
            }
            requestPostMessageChannel().onNavigationEvent(mapOnNavigationEvent);
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        Object obj;
        HomeFragment homeFragment = (HomeFragment) objArr[0];
        int i = 2 % 2;
        Bundle arguments = homeFragment.getArguments();
        if (arguments != null) {
            Object[] objArr2 = new Object[1];
            c(new char[]{4, 1, 65531}, 2 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), false, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2, 230 - Process.getGidForName(""), objArr2);
            String string = arguments.getString(((String) objArr2[0]).intern());
            if (string != null) {
                try {
                    Result.Companion companion = Result.Companion;
                    obj = Result.constructor-impl(mergeParams.onExtraCallback(string, (String) null, 1, (Object) null));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.onExtraCallback(obj)) {
                    int i2 = readTypedObject + 13;
                    writeTypedObject = i2 % 128;
                    int i3 = i2 % 2;
                    obj = null;
                }
                String str = (String) obj;
                if (str != null && !StringsKt.isBlank(str)) {
                    int i4 = writeTypedObject + 47;
                    readTypedObject = i4 % 128;
                    int i5 = i4 % 2;
                    BaseHomeFragment.onExtraCallbackWithResult(homeFragment, str, (Bundle) null, 2, (Object) null);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[PHI: r2
      0x0030: PHI (r2v7 im.toss.uikit.widget.PillarSwipeRefreshLayout) = (r2v6 im.toss.uikit.widget.PillarSwipeRefreshLayout), (r2v8 im.toss.uikit.widget.PillarSwipeRefreshLayout) binds: [B:10:0x002e, B:7:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout;
        HomeFragment homeFragment = (HomeFragment) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 75;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback = homeFragment.onExtraCallback();
        if (remoteDebugUtilsOnExtraCallback != null) {
            int i4 = writeTypedObject + 33;
            readTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                pillarSwipeRefreshLayout = remoteDebugUtilsOnExtraCallback.access000;
                int i5 = 88 / 0;
                if (pillarSwipeRefreshLayout != null) {
                    pillarSwipeRefreshLayout.setVisibility(0);
                    pillarSwipeRefreshLayout.setOnRefreshListener(new HomeFragment$.ExternalSyntheticLambda1(pillarSwipeRefreshLayout, homeFragment));
                }
            } else {
                pillarSwipeRefreshLayout = remoteDebugUtilsOnExtraCallback.access000;
                if (pillarSwipeRefreshLayout != null) {
                }
            }
        }
        int i6 = readTypedObject + 41;
        writeTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout = (PillarSwipeRefreshLayout) objArr[0];
        HomeFragment homeFragment = (HomeFragment) objArr[1];
        int i = 2 % 2;
        pillarSwipeRefreshLayout.announceForAccessibility(homeFragment.getString(im.toss.features.home.core.ui.R.string.home_v2_core_ui_refresh_list));
        homeFragment.onNavigationEvent(true);
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1010281L, false, (String) null, (Map) null, new HomeFragment$.ExternalSyntheticLambda0(), 14, (Object) null);
        int i2 = readTypedObject + 19;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static final Unit onExtraCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 47;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().put("version", 4);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 83;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class onExtraCallbackWithResult implements HomeRecyclerView.onWarmupCompleted {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        onExtraCallbackWithResult() {
        }

        public void onFirstLayoutCompleted(boolean z) throws Throwable {
            HomeDstView homeDstView;
            HomeDstRecyclerView homeDstRecyclerViewOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (!(!z)) {
                int i5 = i3 + 7;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                HomeFragment.IAuthTabCallbackStubProxy(HomeFragment.this);
                HomeFragment.onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{HomeFragment.this}, 475610744, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -475610726);
                RemoteDebugUtils remoteDebugUtilsAccess000 = HomeFragment.access000(HomeFragment.this);
                if (remoteDebugUtilsAccess000 != null && (homeDstView = remoteDebugUtilsAccess000.onExtraCallback) != null && (homeDstRecyclerViewOnExtraCallbackWithResult = homeDstView.onExtraCallbackWithResult()) != null) {
                    homeDstRecyclerViewOnExtraCallbackWithResult.onExtraCallbackWithResult(this);
                }
            }
            int i7 = onNavigationEvent + 29;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 98 / 0;
            }
        }
    }

    public static final class onTransact extends RecyclerView.OnScrollListener {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        onTransact() {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = onExtraCallback + 5;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.checkNotNullParameter(recyclerView, "");
                super.onScrolled(recyclerView, i, i2);
                HomeFragment.readTypedObject(HomeFragment.this);
                HomeFragment.extraCallbackWithResult(HomeFragment.this);
                throw null;
            }
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            HomeFragment.readTypedObject(HomeFragment.this);
            HomeFragment.extraCallbackWithResult(HomeFragment.this);
            int i5 = onNavigationEvent + 103;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        HomeDstView homeDstView;
        HomeDstRecyclerView homeDstRecyclerViewOnExtraCallbackWithResult;
        HomeDstView homeDstView2;
        HomeDstRecyclerView homeDstRecyclerViewOnExtraCallbackWithResult2;
        final HomeFragment homeFragment = (HomeFragment) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 45;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            RemoteDebugUtils remoteDebugUtilsOnExtraCallback = homeFragment.onExtraCallback();
            if (remoteDebugUtilsOnExtraCallback != null && (homeDstView2 = remoteDebugUtilsOnExtraCallback.onExtraCallback) != null && (homeDstRecyclerViewOnExtraCallbackWithResult2 = homeDstView2.onExtraCallbackWithResult()) != null) {
                homeDstRecyclerViewOnExtraCallbackWithResult2.onNavigationEvent(homeFragment.new onExtraCallbackWithResult());
            }
            RemoteDebugUtils remoteDebugUtilsOnExtraCallback2 = homeFragment.onExtraCallback();
            if (remoteDebugUtilsOnExtraCallback2 != null && (homeDstView = remoteDebugUtilsOnExtraCallback2.onExtraCallback) != null && (homeDstRecyclerViewOnExtraCallbackWithResult = homeDstView.onExtraCallbackWithResult()) != null) {
                homeDstRecyclerViewOnExtraCallbackWithResult.setAdapter(new ConnectionLog(homeFragment));
                int i3 = readTypedObject + 71;
                writeTypedObject = i3 % 128;
                int i4 = i3 % 2;
            }
            final onTransact ontransact = homeFragment.new onTransact();
            homeFragment.getViewLifecycleOwner().getLifecycle().IAuthTabCallback(new DefaultLifecycleObserver() { // from class: im.toss.features.home.ui.dst.view.home.HomeFragment$initRecyclerView$2
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallbackWithResult + 95;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
                    int i8 = onExtraCallbackWithResult + 91;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 30 / 0;
                    }
                }

                public /* bridge */ void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    int i5 = 2 % 2;
                    int i6 = onWarmupCompleted + 109;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    super.onDestroy(textFieldScrollKtExternalSyntheticLambda0);
                    int i8 = onExtraCallbackWithResult + 49;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                }

                public /* bridge */ void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    int i5 = 2 % 2;
                    int i6 = onWarmupCompleted + 17;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    super.onPause(textFieldScrollKtExternalSyntheticLambda0);
                    int i8 = onWarmupCompleted + 43;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                }

                public /* bridge */ void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallbackWithResult + 29;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    super.onResume(textFieldScrollKtExternalSyntheticLambda0);
                    int i8 = onWarmupCompleted + 91;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    HomeDstView homeDstView3;
                    HomeDstRecyclerView homeDstRecyclerViewOnExtraCallbackWithResult3;
                    int i5 = 2 % 2;
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    RemoteDebugUtils remoteDebugUtilsAccess000 = HomeFragment.access000(this.IAuthTabCallback);
                    if (remoteDebugUtilsAccess000 != null && (homeDstView3 = remoteDebugUtilsAccess000.onExtraCallback) != null && (homeDstRecyclerViewOnExtraCallbackWithResult3 = homeDstView3.onExtraCallbackWithResult()) != null) {
                        int i6 = onWarmupCompleted + 17;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 != 0) {
                            homeDstRecyclerViewOnExtraCallbackWithResult3.addOnScrollListener(ontransact);
                            throw null;
                        }
                        homeDstRecyclerViewOnExtraCallbackWithResult3.addOnScrollListener(ontransact);
                    }
                    int i7 = onWarmupCompleted + 101;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r4
                  0x002b: PHI (r4v3 o.RemoteDebugUtils) = (r4v2 o.RemoteDebugUtils), (r4v10 o.RemoteDebugUtils) binds: [B:8:0x0029, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    RemoteDebugUtils remoteDebugUtilsAccess000;
                    int i5 = 2 % 2;
                    int i6 = onWarmupCompleted + 29;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                        remoteDebugUtilsAccess000 = HomeFragment.access000(this.IAuthTabCallback);
                        int i7 = 9 / 0;
                        if (remoteDebugUtilsAccess000 != null) {
                            HomeDstView homeDstView3 = remoteDebugUtilsAccess000.onExtraCallback;
                            if (homeDstView3 != null) {
                                int i8 = onWarmupCompleted + 35;
                                onExtraCallbackWithResult = i8 % 128;
                                int i9 = i8 % 2;
                                HomeDstRecyclerView homeDstRecyclerViewOnExtraCallbackWithResult3 = homeDstView3.onExtraCallbackWithResult();
                                if (homeDstRecyclerViewOnExtraCallbackWithResult3 != null) {
                                    homeDstRecyclerViewOnExtraCallbackWithResult3.removeOnScrollListener(ontransact);
                                }
                            }
                        }
                    } else {
                        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                        remoteDebugUtilsAccess000 = HomeFragment.access000(this.IAuthTabCallback);
                        if (remoteDebugUtilsAccess000 != null) {
                        }
                    }
                    int i10 = onWarmupCompleted + 107;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                }
            });
            return null;
        }
        homeFragment.onExtraCallback();
        throw null;
    }

    private final void IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 55;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback = onExtraCallback();
        if (remoteDebugUtilsOnExtraCallback == null) {
            return;
        }
        HomeLogoToDo homeLogoToDo = remoteDebugUtilsOnExtraCallback.asInterface;
        FrameLayout frameLayout = remoteDebugUtilsOnExtraCallback.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        View view = remoteDebugUtilsOnExtraCallback.access100;
        Intrinsics.checkNotNullExpressionValue(view, "");
        homeLogoToDo.setGradientView(frameLayout, view);
        int i4 = writeTypedObject + 81;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onFirstGlobalLayout() {
        ALCFaceEmotion aLCFaceEmotionRatingCompatStyle;
        int i = 2 % 2;
        int i2 = writeTypedObject + 47;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*im.toss.base.BaseFragment*/.onFirstGlobalLayout();
            BaseActivity baseActivity = getBaseActivity();
            if (baseActivity == null || (aLCFaceEmotionRatingCompatStyle = baseActivity.RatingCompatStyle()) == null) {
                return;
            }
            int i3 = writeTypedObject + 111;
            readTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                if (aLCFaceEmotionRatingCompatStyle.onExtraCallback()) {
                    ALCFaceEmotion.onNavigationEvent(aLCFaceEmotionRatingCompatStyle, onVisit.IAuthTabCallback(this) + "#onGlobalLayout", false, 0L, 6, (Object) null);
                    return;
                }
                return;
            }
            aLCFaceEmotionRatingCompatStyle.onExtraCallback();
            obj.hashCode();
            throw null;
        }
        super/*im.toss.base.BaseFragment*/.onFirstGlobalLayout();
        getBaseActivity();
        throw null;
    }

    private final Unit RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = readTypedObject + 29;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback();
            obj.hashCode();
            throw null;
        }
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback = onExtraCallback();
        if (remoteDebugUtilsOnExtraCallback == null) {
            int i3 = writeTypedObject + 33;
            readTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i4 = writeTypedObject + 95;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        if (onRenderReady.IAuthTabCallback(this)) {
            int i6 = writeTypedObject + 23;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
            if (IEngagementSignalsCallback()) {
                int iComputeVerticalScrollOffset = remoteDebugUtilsOnExtraCallback.onExtraCallback.onExtraCallbackWithResult().computeVerticalScrollOffset();
                float fCoerceIn = 0.0f;
                if (((Integer) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, -106600496, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 106600508)).intValue() > 0) {
                    fCoerceIn = RangesKt.coerceIn(iComputeVerticalScrollOffset / ((Integer) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, -106600496, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 106600508)).intValue(), 0.0f, 1.0f);
                    int i8 = readTypedObject + 27;
                    writeTypedObject = i8 % 128;
                    int i9 = i8 % 2;
                }
                onExtraCallbackWithResult(fCoerceIn);
                remoteDebugUtilsOnExtraCallback.onNavigationEvent.setBlurStyle(new deprecated_secure(0, 0.0f, 0L, 0.0f, 0.0f, fCoerceIn * 30.0f, false, 95, (DefaultConstructorMarker) null));
            } else if (RecyclerViewsKt.onWarmupCompleted(remoteDebugUtilsOnExtraCallback.onExtraCallback.onExtraCallbackWithResult())) {
                int i10 = writeTypedObject + 115;
                readTypedObject = i10 % 128;
                int i11 = i10 % 2;
                ICustomTabsServiceStubProxy();
            } else {
                ITrustedWebActivityService_Parcel();
            }
        }
        return Unit.INSTANCE;
    }

    private final void ITrustedWebActivityService_Parcel() {
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback;
        Toolbar toolbar;
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 75;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 41 / 0;
            if (this.IAuthTabCallbackStubProxy) {
                return;
            }
        } else if (this.IAuthTabCallbackStubProxy) {
            return;
        }
        int i5 = i2 + 97;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        if (this.getInterfaceDescriptor || (remoteDebugUtilsOnExtraCallback = onExtraCallback()) == null || (toolbar = remoteDebugUtilsOnExtraCallback.IAuthTabCallbackStubProxy) == null) {
            return;
        }
        this.getInterfaceDescriptor = true;
        Rally rally = this.extraCallback;
        Object obj = null;
        if (rally != null) {
            int i7 = writeTypedObject + 21;
            readTypedObject = i7 % 128;
            if (i7 % 2 == 0) {
                rally.ICustomTabsServiceStub();
                obj.hashCode();
                throw null;
            }
            rally.ICustomTabsServiceStub();
        }
        Object[] objArr = {Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{toolbar, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(this.IAuthTabCallback_Parcel), Float.valueOf(1.0f), new HomeFragment$.ExternalSyntheticLambda25(this), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new HomeFragment$.ExternalSyntheticLambda26(this), 1, (Object) null), null, new HomeFragment$.ExternalSyntheticLambda27(this), 1, null};
        this.extraCallback = isFireOS.onExtraCallbackWithResult(Rally.onExtraCallbackWithResult((Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), objArr, 2128644226), (Object) null, new HomeFragment$.ExternalSyntheticLambda28(this), 1, (Object) null), false, 1, (Object) null);
    }

    private static final Unit onExtraCallbackWithResult(HomeFragment homeFragment, float f) {
        int i = 2 % 2;
        int i2 = readTypedObject + 49;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            homeFragment.onExtraCallback(f);
            return Unit.INSTANCE;
        }
        homeFragment.onExtraCallback(f);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit ICustomTabsCallbackStub(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 25;
        readTypedObject = i2 % 128;
        homeFragment.IAuthTabCallbackStubProxy = i2 % 2 != 0;
        return Unit.INSTANCE;
    }

    private static final Unit onRelationshipValidationResult(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 93;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.IAuthTabCallbackStubProxy = false;
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 101;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onUnminimized(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 87;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.IAuthTabCallbackStubProxy = false;
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 101;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return unit;
    }

    private final void ICustomTabsServiceStubProxy() {
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback;
        Toolbar toolbar;
        int i = 2 % 2;
        int i2 = writeTypedObject + 91;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 63 / 0;
            if (this.access000) {
                return;
            }
        } else if (!(!this.access000)) {
            return;
        }
        if ((!this.getInterfaceDescriptor) || (remoteDebugUtilsOnExtraCallback = onExtraCallback()) == null || (toolbar = remoteDebugUtilsOnExtraCallback.IAuthTabCallbackStubProxy) == null) {
            return;
        }
        this.getInterfaceDescriptor = false;
        Rally rally = this.extraCallback;
        if (rally != null) {
            rally.ICustomTabsServiceStub();
            int i4 = readTypedObject + 25;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        this.extraCallback = isFireOS.onExtraCallbackWithResult(Rally.onExtraCallbackWithResult((Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{toolbar, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(this.IAuthTabCallback_Parcel), Float.valueOf(0.0f), new HomeFragment$.ExternalSyntheticLambda9(this), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new HomeFragment$.ExternalSyntheticLambda10(this), 1, (Object) null), null, new HomeFragment$.ExternalSyntheticLambda11(this), 1, null}, 2128644226), (Object) null, new HomeFragment$.ExternalSyntheticLambda12(this), 1, (Object) null), false, 1, (Object) null);
    }

    private static final Unit IAuthTabCallback(HomeFragment homeFragment, float f) {
        int i = 2 % 2;
        int i2 = readTypedObject + 37;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.onExtraCallback(f);
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 25;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onActivityLayout(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 67;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.access000 = true;
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 49;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onMessageChannelReady(HomeFragment homeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 57;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.access000 = false;
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 23;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return unit;
    }

    private final void onExtraCallback(float f) {
        Fragment fragmentOnExtraCallback;
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback;
        int i = 2 % 2;
        setBitmapDecoderClass setbitmapdecoderclass = this.access100;
        Object obj = null;
        if (setbitmapdecoderclass != null) {
            int i2 = writeTypedObject + 85;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                setbitmapdecoderclass.onExtraCallback();
                obj.hashCode();
                throw null;
            }
            fragmentOnExtraCallback = setbitmapdecoderclass.onExtraCallback();
        } else {
            fragmentOnExtraCallback = null;
        }
        if (fragmentOnExtraCallback != null) {
            int i3 = writeTypedObject + 77;
            readTypedObject = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.areEqual(fragmentOnExtraCallback, getParentFragment());
                throw null;
            }
            if ((Intrinsics.areEqual(fragmentOnExtraCallback, getParentFragment()) || Intrinsics.areEqual(fragmentOnExtraCallback, this)) && (remoteDebugUtilsOnExtraCallback = onExtraCallback()) != null) {
                this.IAuthTabCallback_Parcel = f;
                int i4 = (int) (255.0f * f);
                remoteDebugUtilsOnExtraCallback.IAuthTabCallback.setBackgroundColor(VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(ContextCompat.getColor(requireContext(), im.toss.tds.R.color.background_default), i4));
                remoteDebugUtilsOnExtraCallback.IAuthTabCallbackStubProxy.setTitleTextColor(VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(ContextCompat.getColor(requireContext(), im.toss.tds.R.color.grey_900), i4));
                remoteDebugUtilsOnExtraCallback.onWarmupCompleted.setToolbarAlpha(f);
                remoteDebugUtilsOnExtraCallback.IAuthTabCallbackDefault.setAlpha(f);
            }
        }
    }

    private final void onExtraCallbackWithResult(float f) {
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback;
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 5;
        readTypedObject = i3 % 128;
        Fragment fragmentOnExtraCallback = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        setBitmapDecoderClass setbitmapdecoderclass = this.access100;
        if (setbitmapdecoderclass != null) {
            fragmentOnExtraCallback = setbitmapdecoderclass.onExtraCallback();
        } else {
            int i4 = i2 + 97;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        if (fragmentOnExtraCallback != null) {
            if ((Intrinsics.areEqual(fragmentOnExtraCallback, getParentFragment()) || Intrinsics.areEqual(fragmentOnExtraCallback, this)) && (remoteDebugUtilsOnExtraCallback = onExtraCallback()) != null) {
                int i6 = writeTypedObject + 35;
                readTypedObject = i6 % 128;
                int i7 = i6 % 2;
                float fCoerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f);
                this.IAuthTabCallback_Parcel = fCoerceIn;
                remoteDebugUtilsOnExtraCallback.IAuthTabCallbackStubProxy.setTitleTextColor(VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(ContextCompat.getColor(requireContext(), im.toss.tds.R.color.grey_900), (int) (255.0f * fCoerceIn)));
                remoteDebugUtilsOnExtraCallback.onWarmupCompleted.setToolbarAlpha(fCoerceIn);
            }
        }
    }

    private static final Unit onExtraCallback(HomeFragment homeFragment, RVManifestLazyProxyManifest rVManifestLazyProxyManifest, Function0 function0) {
        int i = 2 % 2;
        int i2 = readTypedObject + 15;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rVManifestLazyProxyManifest, "");
            Intrinsics.checkNotNullParameter(function0, "");
            BaseHomeFragment.onExtraCallback(homeFragment, rVManifestLazyProxyManifest, function0, (Map) null, true, 27, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(rVManifestLazyProxyManifest, "");
            Intrinsics.checkNotNullParameter(function0, "");
            BaseHomeFragment.onExtraCallback(homeFragment, rVManifestLazyProxyManifest, function0, (Map) null, false, 8, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private final void notifyNotificationWithChannel() {
        HomeNavigationBarItemGroup homeNavigationBarItemGroup;
        int i = 2 % 2;
        int i2 = readTypedObject + 93;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback = onExtraCallback();
        if (remoteDebugUtilsOnExtraCallback != null) {
            int i4 = readTypedObject + 3;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            HomeNavigationBarItemGroup homeNavigationBarItemGroup2 = remoteDebugUtilsOnExtraCallback.IAuthTabCallback_Parcel;
            if (homeNavigationBarItemGroup2 != null) {
                homeNavigationBarItemGroup2.setOnImpressionLog(new HomeFragment$.ExternalSyntheticLambda16(this));
            }
        }
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback2 = onExtraCallback();
        if (remoteDebugUtilsOnExtraCallback2 == null || (homeNavigationBarItemGroup = remoteDebugUtilsOnExtraCallback2.IAuthTabCallback_Parcel) == null) {
            return;
        }
        homeNavigationBarItemGroup.setOnItemClickListener(new HomeFragment$.ExternalSyntheticLambda17(this));
        int i6 = writeTypedObject + 51;
        readTypedObject = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final void onExtraCallback(HomeFragment homeFragment, View view, AppLogger appLogger) {
        fillData filldataOnTransact;
        String strOnNavigationEvent;
        Map map;
        int i;
        int i2 = 2 % 2;
        int i3 = readTypedObject + 87;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(appLogger, "");
            filldataOnTransact = appLogger.onTransact();
            strOnNavigationEvent = RVManifestWrapper.Companion.onNavigationEvent("navigationBarRightItems");
            map = null;
            i = 73;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(appLogger, "");
            filldataOnTransact = appLogger.onTransact();
            strOnNavigationEvent = RVManifestWrapper.Companion.onNavigationEvent("navigationBarRightItems");
            map = null;
            i = 8;
        }
        fillData.getInterfaceDescriptor.IAuthTabCallback(homeFragment, filldataOnTransact, appLogger, strOnNavigationEvent, map, i, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[PHI: r1
      0x0042: PHI (r1v12 im.toss.features.home.core.ui.widget.HomeNavigationBarItemGroup) = 
      (r1v11 im.toss.features.home.core.ui.widget.HomeNavigationBarItemGroup)
      (r1v14 im.toss.features.home.core.ui.widget.HomeNavigationBarItemGroup)
     binds: [B:15:0x0040, B:12:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(List<AppLogger> list) {
        View viewIAuthTabCallback;
        HomeNavigationBarItemGroup homeNavigationBarItemGroup;
        int i = 2 % 2;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((AppLogger) it.next()).IAuthTabCallbackStubProxy(), "NOTIFICATION")) {
                RemoteDebugUtils remoteDebugUtilsOnExtraCallback = onExtraCallback();
                View viewFindViewById = null;
                if (remoteDebugUtilsOnExtraCallback != null) {
                    int i2 = writeTypedObject + 11;
                    readTypedObject = i2 % 128;
                    if (i2 % 2 == 0) {
                        homeNavigationBarItemGroup = remoteDebugUtilsOnExtraCallback.IAuthTabCallback_Parcel;
                        int i3 = 3 / 0;
                        viewIAuthTabCallback = homeNavigationBarItemGroup != null ? homeNavigationBarItemGroup.IAuthTabCallback("NOTIFICATION") : null;
                    } else {
                        homeNavigationBarItemGroup = remoteDebugUtilsOnExtraCallback.IAuthTabCallback_Parcel;
                        if (homeNavigationBarItemGroup != null) {
                        }
                    }
                    AppLovinSdkInitializationConfigurationImpl appLovinSdkInitializationConfigurationImplNewSessionWithExtras = newSessionWithExtras();
                    View viewFindViewById2 = viewIAuthTabCallback != null ? viewIAuthTabCallback.findViewById(viva.republica.toss.R.id.view_menu_feed_icon) : null;
                    if (viewIAuthTabCallback != null) {
                        int i4 = readTypedObject + 77;
                        writeTypedObject = i4 % 128;
                        if (i4 % 2 != 0) {
                            viewIAuthTabCallback.findViewById(viva.republica.toss.R.id.feedUnreadDot);
                            viewFindViewById.hashCode();
                            throw null;
                        }
                        viewFindViewById = viewIAuthTabCallback.findViewById(viva.republica.toss.R.id.feedUnreadDot);
                    }
                    appLovinSdkInitializationConfigurationImplNewSessionWithExtras.IAuthTabCallback(viewFindViewById2, viewFindViewById, this.IAuthTabCallbackStub);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        if (r2 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        if (r2 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        r2 = (android.view.ViewGroup.MarginLayoutParams) r2;
        r2.setMargins(0, 0, 0, 0);
        r0.setLayoutParams(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[PHI: r2 r6
      0x0055: PHI (r2v7 boolean) = (r2v6 boolean), (r2v20 boolean) binds: [B:12:0x0053, B:9:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0055: PHI (r6v1 im.toss.tds.view.component.widget.TdsRoundLayout) = (r6v0 im.toss.tds.view.component.widget.TdsRoundLayout), (r6v5 im.toss.tds.view.component.widget.TdsRoundLayout) binds: [B:12:0x0053, B:9:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[PHI: r2 r6
      0x0057: PHI (r2v17 boolean) = (r2v6 boolean), (r2v20 boolean) binds: [B:12:0x0053, B:9:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0057: PHI (r6v4 im.toss.tds.view.component.widget.TdsRoundLayout) = (r6v0 im.toss.tds.view.component.widget.TdsRoundLayout), (r6v5 im.toss.tds.view.component.widget.TdsRoundLayout) binds: [B:12:0x0053, B:9:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onUnminimized() {
        enableOnlineDebug enableonlinedebug;
        boolean zOnExtraCallback;
        TdsRoundLayout tdsRoundLayout;
        int i;
        TdsRoundLayout tdsRoundLayout2;
        ViewGroup.LayoutParams layoutParams;
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 69;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        super.onUnminimized();
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback = onExtraCallback();
        if (remoteDebugUtilsOnExtraCallback == null || (enableonlinedebug = remoteDebugUtilsOnExtraCallback.onExtraCallbackWithResult) == null) {
            return;
        }
        int i5 = writeTypedObject + 111;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            zOnExtraCallback = getRawResource.onExtraCallback(newSession().onExtraCallbackWithResult());
            tdsRoundLayout = enableonlinedebug.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
            int i6 = 58 / 0;
            i = zOnExtraCallback ? 0 : 8;
        } else {
            zOnExtraCallback = getRawResource.onExtraCallback(newSession().onExtraCallbackWithResult());
            tdsRoundLayout = enableonlinedebug.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
            if (zOnExtraCallback) {
            }
        }
        tdsRoundLayout.setVisibility(i);
        if (!zOnExtraCallback) {
            int i7 = readTypedObject + 77;
            writeTypedObject = i7 % 128;
            if (i7 % 2 != 0) {
                enableonlinedebug.onExtraCallback.setBackgroundColor(1);
                tdsRoundLayout2 = enableonlinedebug.onExtraCallback;
                Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, "");
                layoutParams = tdsRoundLayout2.getLayoutParams();
            } else {
                enableonlinedebug.onExtraCallback.setBackgroundColor(0);
                tdsRoundLayout2 = enableonlinedebug.onExtraCallback;
                Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, "");
                layoutParams = tdsRoundLayout2.getLayoutParams();
            }
        }
        enableonlinedebug.onExtraCallbackWithResult.onRelationshipValidationResult().setVisibility(8);
        enableonlinedebug.onExtraCallbackWithResult.setOnClickListener(new HomeFragment$.ExternalSyntheticLambda13(this));
    }

    private static final void onExtraCallback(HomeFragment homeFragment, View view) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        c(new char[]{22, 11, 24, 26, 21, 25, 25, 65504, 65493, 65493, 18, 7, '\b', 65509, 27, 24, 18, 65507, 14, 26, 26, 22, 25, 65483, 65497, 65511, 65483, 65496, 65516, 65483, 65496, 65516, 25, 11, 24, 28, 15, '\t', 11, 65492, 26, 21, 25, 25, '\b', 7, 20, 17, 65492, '\t', 21, 19, 65483, 65496, 65516, 14, 21, 19, 11, 65483, 65497, 65516, 24, 11, '\f', 11, 24, 24, 11, 24, 65483, 65497, 65514, 26, 21, 25, 25, 65484, 25, 14, 21, 29, 65512, 24, 15, '\n', '\r', 11, 65507, 26, 24, 27, 11, 65484, '\b', 24, 15, '\n', '\r', 11, 65530, 31, 22, 11, 65507, '\b', 7, 20, 17, 65484, 24, 11, '\f', 11, 24, 24, 11, 24, 65507, 14, 21, 19, 11, 65492, 65518, 65515, 65511, 65514, 65515, 65528, 65484, 24, 11, '\f', 11, 24, 24, 11, 24, 5, 15, 26, 11, 19, 5, 15, '\n', 65507, 65518, 65525, 65523, 65515, 5, 65525, 65532, 65515, 65528, 65532, 65519, 65515, 65533, 5, 65530, 65525, 65529, 65529, 65512, 65511, 65524, 65521, 65483, 65497, 65511, 65518, 65515, 65511, 65514, 65515, 65528, 25, 27}, 179 - TextUtils.indexOf("", "", 0), false, 181 - (ViewConfiguration.getLongPressTimeout() >> 16), 209 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        BaseHomeFragment.onExtraCallbackWithResult(homeFragment, ((String) objArr[0]).intern(), (Bundle) null, 2, (Object) null);
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1220287L, false, (String) null, (Map) null, new HomeFragment$.ExternalSyntheticLambda2(access8100.onNavigationEvent(getWrite.IAuthTabCallback("screen_id", Long.valueOf(homeFragment.getScreenId())))), 14, (Object) null);
        int i2 = readTypedObject + 113;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit asBinder(Map map, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 11;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("id", "HOME_OVERVIEW_TOSSBANK:HEADER");
        Object[] objArr = new Object[1];
        c(new char[]{2, 5, 65527, 65530, 6, 65527, 15}, 4 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), false, TextUtils.indexOf("", "", 0) + 7, ExpandableListView.getPackedPositionGroup(0L) + 224, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), map);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 91;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void getSmallIconBitmap() {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new onActivityLayout(this, (access13800) null), 3, (Object) null);
        int i2 = readTypedObject + 101;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void IPostMessageServiceDefault() {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner);
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(this, (access13800) null), 3, (Object) null);
        int i2 = writeTypedObject + 23;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void ITrustedWebActivityCallback() {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback_Parcel(this, (access13800) null), 3, (Object) null);
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner2), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStubProxy(this, (access13800) null), 3, (Object) null);
        int i2 = writeTypedObject + 107;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    private final boolean IEngagementSignalsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 45;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i4 = writeTypedObject + 97;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            boolean z = arguments.getBoolean("from_home_launcher");
            if (i5 != 0 ? z : z) {
                int i6 = readTypedObject + 111;
                writeTypedObject = i6 % 128;
                return !(i6 % 2 != 0);
            }
        }
        int i7 = readTypedObject + 43;
        writeTypedObject = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return getResources().getDimensionPixelOffset(viva.republica.toss.R.dimen.process_navigation_bar_height) - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if ((!IEngagementSignalsCallback_Parcel()) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (IEngagementSignalsCallback_Parcel() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r5 = im.toss.features.home.ui.dst.view.home.HomeFragment.writeTypedObject + 11;
        im.toss.features.home.ui.dst.view.home.HomeFragment.readTypedObject = r5 % 128;
        r5 = r5 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 105;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 69 / 0;
        }
    }

    private final void ITrustedWebActivityServiceDefault() {
        int i = 2 % 2;
        if (IEngagementSignalsCallback_Parcel()) {
            int i2 = readTypedObject + 85;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            RemoteDebugUtils remoteDebugUtilsOnExtraCallback = onExtraCallback();
            if (remoteDebugUtilsOnExtraCallback != null) {
                TdsImageView tdsImageView = remoteDebugUtilsOnExtraCallback.onTransact;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                tdsImageView.setVisibility(0);
                remoteDebugUtilsOnExtraCallback.onTransact.setOnClickListener(new HomeFragment$.ExternalSyntheticLambda6(this));
                return;
            }
        }
        int i4 = readTypedObject + 115;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(HomeFragment homeFragment, View view) {
        ICustomTabsCallback_Parcel onBackPressedDispatcher;
        int i = 2 % 2;
        BaseLauncherWrapperActivity activity = homeFragment.getActivity();
        BaseLauncherWrapperActivity baseLauncherWrapperActivity = activity instanceof BaseLauncherWrapperActivity ? activity : null;
        if (baseLauncherWrapperActivity != null) {
            baseLauncherWrapperActivity.onNavigationEvent();
            return;
        }
        FragmentActivity activity2 = homeFragment.getActivity();
        if (activity2 == null || (onBackPressedDispatcher = activity2.getOnBackPressedDispatcher()) == null) {
            return;
        }
        int i2 = writeTypedObject + 109;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onBackPressedDispatcher.onExtraCallbackWithResult();
        int i4 = writeTypedObject + 11;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(setHasScreenShot sethasscreenshot) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback = onExtraCallback();
        if (remoteDebugUtilsOnExtraCallback == null) {
            return;
        }
        if (!(sethasscreenshot instanceof setHasScreenShot.onNavigationEvent)) {
            if (sethasscreenshot instanceof setHasScreenShot.onExtraCallback) {
                TdsImageView tdsImageView = remoteDebugUtilsOnExtraCallback.IAuthTabCallbackStub;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                tdsImageView.setVisibility(8);
                LottieAnimationView lottieAnimationView = remoteDebugUtilsOnExtraCallback.asBinder;
                Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
                lottieAnimationView.setVisibility(8);
                HomeCurrencyBadgeView homeCurrencyBadgeView = remoteDebugUtilsOnExtraCallback.onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(homeCurrencyBadgeView, "");
                homeCurrencyBadgeView.setVisibility(0);
                HomeLogoToDo homeLogoToDo = remoteDebugUtilsOnExtraCallback.asInterface;
                Intrinsics.checkNotNullExpressionValue(homeLogoToDo, "");
                homeLogoToDo.setVisibility(8);
                return;
            }
            if (sethasscreenshot instanceof setHasScreenShot.onWarmupCompleted) {
                TdsImageView tdsImageView2 = remoteDebugUtilsOnExtraCallback.IAuthTabCallbackStub;
                Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
                tdsImageView2.setVisibility(8);
                LottieAnimationView lottieAnimationView2 = remoteDebugUtilsOnExtraCallback.asBinder;
                Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
                lottieAnimationView2.setVisibility(8);
                HomeCurrencyBadgeView homeCurrencyBadgeView2 = remoteDebugUtilsOnExtraCallback.onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(homeCurrencyBadgeView2, "");
                homeCurrencyBadgeView2.setVisibility(8);
                HomeLogoToDo homeLogoToDo2 = remoteDebugUtilsOnExtraCallback.asInterface;
                Intrinsics.checkNotNullExpressionValue(homeLogoToDo2, "");
                homeLogoToDo2.setVisibility(0);
                return;
            }
            if (sethasscreenshot != null) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = readTypedObject + 105;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            TdsImageView tdsImageView3 = remoteDebugUtilsOnExtraCallback.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
            tdsImageView3.setVisibility(8);
            LottieAnimationView lottieAnimationView3 = remoteDebugUtilsOnExtraCallback.asBinder;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView3, "");
            lottieAnimationView3.setVisibility(8);
            HomeCurrencyBadgeView homeCurrencyBadgeView3 = remoteDebugUtilsOnExtraCallback.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(homeCurrencyBadgeView3, "");
            homeCurrencyBadgeView3.setVisibility(8);
            HomeLogoToDo homeLogoToDo3 = remoteDebugUtilsOnExtraCallback.asInterface;
            Intrinsics.checkNotNullExpressionValue(homeLogoToDo3, "");
            homeLogoToDo3.setVisibility(8);
            return;
        }
        int i4 = readTypedObject + 37;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        setHasWhiteScreen sethaswhitescreenIAuthTabCallback_Parcel = ((setHasScreenShot.onNavigationEvent) sethasscreenshot).IAuthTabCallback_Parcel();
        if (!(!(sethaswhitescreenIAuthTabCallback_Parcel instanceof setHasWhiteScreen.onExtraCallback))) {
            TdsImageView tdsImageView4 = remoteDebugUtilsOnExtraCallback.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsImageView4, "");
            tdsImageView4.setVisibility(0);
            LottieAnimationView lottieAnimationView4 = remoteDebugUtilsOnExtraCallback.asBinder;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView4, "");
            lottieAnimationView4.setVisibility(8);
        } else {
            int i6 = readTypedObject + 61;
            int i7 = i6 % 128;
            writeTypedObject = i7;
            if (i6 % 2 != 0) {
                boolean z = sethaswhitescreenIAuthTabCallback_Parcel instanceof setHasWhiteScreen.IAuthTabCallback;
                throw null;
            }
            if (!(sethaswhitescreenIAuthTabCallback_Parcel instanceof setHasWhiteScreen.IAuthTabCallback)) {
                int i8 = i7 + 119;
                readTypedObject = i8 % 128;
                int i9 = i8 % 2;
                if (sethaswhitescreenIAuthTabCallback_Parcel instanceof setHasWhiteScreen.onWarmupCompleted) {
                    TdsImageView tdsImageView5 = remoteDebugUtilsOnExtraCallback.IAuthTabCallbackStub;
                    Intrinsics.checkNotNullExpressionValue(tdsImageView5, "");
                    tdsImageView5.setVisibility(8);
                    LottieAnimationView lottieAnimationView5 = remoteDebugUtilsOnExtraCallback.asBinder;
                    Intrinsics.checkNotNullExpressionValue(lottieAnimationView5, "");
                    lottieAnimationView5.setVisibility(0);
                } else {
                    if (sethaswhitescreenIAuthTabCallback_Parcel != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TdsImageView tdsImageView6 = remoteDebugUtilsOnExtraCallback.IAuthTabCallbackStub;
                    Intrinsics.checkNotNullExpressionValue(tdsImageView6, "");
                    tdsImageView6.setVisibility(8);
                    LottieAnimationView lottieAnimationView6 = remoteDebugUtilsOnExtraCallback.asBinder;
                    Intrinsics.checkNotNullExpressionValue(lottieAnimationView6, "");
                    lottieAnimationView6.setVisibility(8);
                }
            }
        }
        HomeCurrencyBadgeView homeCurrencyBadgeView4 = remoteDebugUtilsOnExtraCallback.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(homeCurrencyBadgeView4, "");
        homeCurrencyBadgeView4.setVisibility(8);
        HomeLogoToDo homeLogoToDo4 = remoteDebugUtilsOnExtraCallback.asInterface;
        Intrinsics.checkNotNullExpressionValue(homeLogoToDo4, "");
        homeLogoToDo4.setVisibility(8);
        int i10 = writeTypedObject + 55;
        readTypedObject = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    private static final void onExtraCallback(HomeFragment homeFragment, fillData filldata, setHasScreenShot.onNavigationEvent onnavigationevent, View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 37;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        fillData.getInterfaceDescriptor.IAuthTabCallback(homeFragment, filldata, onnavigationevent, RVManifestWrapper.onExtraCallback.onExtraCallback(RVManifestWrapper.Companion, (String) null, 1, (Object) null), (Map) null, 8, (Object) null);
        int i4 = writeTypedObject + 21;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        HomeFragment homeFragment = (HomeFragment) objArr[0];
        fillData filldata = (fillData) objArr[1];
        setHasScreenShot.onNavigationEvent onnavigationevent = (setHasScreenShot.onNavigationEvent) objArr[2];
        int i = 2 % 2;
        int i2 = readTypedObject + 101;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        fillData.getInterfaceDescriptor.IAuthTabCallback(homeFragment, filldata, onnavigationevent, RVManifestWrapper.onExtraCallback.onExtraCallback(RVManifestWrapper.Companion, (String) null, 1, (Object) null), (Map) null, 8, (Object) null);
        int i4 = readTypedObject + 61;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final void onWarmupCompleted(setHasScreenShot.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = readTypedObject + 19;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback = onExtraCallback();
        if (remoteDebugUtilsOnExtraCallback != null) {
            remoteDebugUtilsOnExtraCallback.onWarmupCompleted.setOnClickListener(new HomeFragment$.ExternalSyntheticLambda21(this, onextracallback, remoteDebugUtilsOnExtraCallback));
            return;
        }
        int i4 = writeTypedObject + 21;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final void onExtraCallback(HomeFragment homeFragment, setHasScreenShot.onExtraCallback onextracallback, RemoteDebugUtils remoteDebugUtils, View view) {
        int i = 2 % 2;
        BaseHomeFragment.onWarmupCompleted(homeFragment, onextracallback, getOuterPage.onNavigationEvent.onNavigationEvent(getOuterPage.Companion, false, false, false, 1220287L, (Map) null, (getOuterPage.onExtraCallbackWithResult.onExtraCallbackWithResult) null, 55, (Object) null), new BaseEmbedView.onNavigationEvent(RVManifestWrapper.onExtraCallback.onExtraCallback(RVManifestWrapper.Companion, (String) null, 1, (Object) null), (RVManifestServiceBeanManifest) null, (DefaultConstructorMarker) null), (Map) null, 8, (Object) null);
        homeFragment.requestPostMessageChannel().onVerticalScrollEvent();
        if (((Boolean) homeFragment.requestPostMessageChannel().access200().IAuthTabCallback()).booleanValue()) {
            TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = homeFragment.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new onPostMessage(remoteDebugUtils, null), 3, (Object) null);
            int i2 = writeTypedObject + 73;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = writeTypedObject + 111;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class onPostMessage extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ RemoteDebugUtils $binding;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onPostMessage(RemoteDebugUtils remoteDebugUtils, access13800<? super onPostMessage> access13800Var) {
            super(2, access13800Var);
            this.$binding = remoteDebugUtils;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onPostMessage onpostmessage = new onPostMessage(this.$binding, access13800Var);
            int i2 = onNavigationEvent + 1;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onpostmessage;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 119;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 97;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent + 35;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 63;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    int i7 = 77 / 0;
                } else {
                    ResultKt.onNavigationEvent(obj);
                }
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(100L, this) == objOnWarmupCompleted) {
                    int i8 = onExtraCallback + 77;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    return objOnWarmupCompleted;
                }
            }
            this.$binding.onExtraCallback.onExtraCallbackWithResult().smoothScrollToPosition(0);
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallbackWithResult(HomeFragment homeFragment, setHasScreenShot.onWarmupCompleted onwarmupcompleted, fillData filldata) {
        String strOnExtraCallback;
        Map map;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(filldata, "");
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle = homeFragment.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        if (homeFragment.IAuthTabCallback(lifecycle)) {
            int i3 = readTypedObject + 21;
            writeTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                strOnExtraCallback = RVManifestWrapper.onExtraCallback.onExtraCallback(RVManifestWrapper.Companion, (String) null, 1, (Object) null);
                map = null;
                i = 127;
            } else {
                strOnExtraCallback = RVManifestWrapper.onExtraCallback.onExtraCallback(RVManifestWrapper.Companion, (String) null, 1, (Object) null);
                map = null;
                i = 8;
            }
            fillData.getInterfaceDescriptor.IAuthTabCallback(homeFragment, filldata, onwarmupcompleted, strOnExtraCallback, map, i, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 85;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onExtraCallbackWithResult(setHasScreenShot.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback = onExtraCallback();
        if (remoteDebugUtilsOnExtraCallback != null) {
            int i2 = readTypedObject + 61;
            writeTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                HomeLogoToDo homeLogoToDo = remoteDebugUtilsOnExtraCallback.asInterface;
                if (homeLogoToDo != null) {
                    homeLogoToDo.setLogo(onwarmupcompleted, new HomeFragment$.ExternalSyntheticLambda18(this, onwarmupcompleted));
                }
            } else {
                HomeLogoToDo homeLogoToDo2 = remoteDebugUtilsOnExtraCallback.asInterface;
                throw null;
            }
        }
        ITrustedWebActivityServiceStubProxy();
        int i3 = readTypedObject + 71;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private final void ITrustedWebActivityServiceStubProxy() {
        HomeDstView homeDstView;
        HomeDstRecyclerView homeDstRecyclerViewOnExtraCallbackWithResult;
        HomeLogoToDo homeLogoToDo;
        HomeLogoToDo homeLogoToDo2;
        int i = 2 % 2;
        if (!(!(((setRubIn) HomeViewModel.onExtraCallbackWithResult(-1003598179, new Object[]{requestPostMessageChannel()}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1003598188, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted())).IAuthTabCallback() instanceof setHasScreenShot.onWarmupCompleted))) {
            int i2 = writeTypedObject + 95;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            RemoteDebugUtils remoteDebugUtilsOnExtraCallback = onExtraCallback();
            if (remoteDebugUtilsOnExtraCallback != null && (homeDstView = remoteDebugUtilsOnExtraCallback.onExtraCallback) != null && (homeDstRecyclerViewOnExtraCallbackWithResult = homeDstView.onExtraCallbackWithResult()) != null) {
                if (!RecyclerViewsKt.onWarmupCompleted(homeDstRecyclerViewOnExtraCallbackWithResult)) {
                    RemoteDebugUtils remoteDebugUtilsOnExtraCallback2 = onExtraCallback();
                    if (remoteDebugUtilsOnExtraCallback2 != null && (homeLogoToDo2 = remoteDebugUtilsOnExtraCallback2.asInterface) != null) {
                        homeLogoToDo2.onWarmupCompleted();
                        return;
                    }
                } else {
                    RemoteDebugUtils remoteDebugUtilsOnExtraCallback3 = onExtraCallback();
                    if (remoteDebugUtilsOnExtraCallback3 != null && (homeLogoToDo = remoteDebugUtilsOnExtraCallback3.asInterface) != null) {
                        homeLogoToDo.onNavigationEvent();
                    }
                }
            }
        }
        int i4 = readTypedObject + 109;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
    }

    public void IAuthTabCallback(@NotNull Interruptor interruptor) {
        int i = 2 % 2;
        int i2 = readTypedObject + 109;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(interruptor, "");
            requestPostMessageChannel().prefetchWithMultipleUrls();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(interruptor, "");
        Map<String, AppxNgRuntimeChecker> mapPrefetchWithMultipleUrls = requestPostMessageChannel().prefetchWithMultipleUrls();
        if (mapPrefetchWithMultipleUrls == null) {
            int i3 = readTypedObject + 11;
            writeTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        CurrencySelectActivity.onExtraCallback onextracallback = CurrencySelectActivity.Companion;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        startActivity(onextracallback.onExtraCallbackWithResult(contextRequireContext, mapPrefetchWithMultipleUrls));
        BaseHomeFragment.onWarmupCompleted(this, interruptor, getOuterPage.onNavigationEvent.onNavigationEvent(getOuterPage.Companion, false, false, false, 1220287L, (Map) null, (getOuterPage.onExtraCallbackWithResult.onExtraCallbackWithResult) null, 55, (Object) null), new BaseEmbedView.onNavigationEvent(RVManifestWrapper.Companion.onNavigationEvent("left.row1.textAlt"), (RVManifestServiceBeanManifest) null, (DefaultConstructorMarker) null), (Map) null, 8, (Object) null);
    }

    public void onExtraCallback(@NotNull Interruptor interruptor) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(interruptor, "");
        onNavigationEvent(interruptor, false);
        BaseHomeFragment.onWarmupCompleted(this, interruptor, getOuterPage.onNavigationEvent.onNavigationEvent(getOuterPage.Companion, false, false, false, 1220287L, (Map) null, (getOuterPage.onExtraCallbackWithResult.onExtraCallbackWithResult) null, 55, (Object) null), new BaseEmbedView.onNavigationEvent(RVManifestWrapper.Companion.onNavigationEvent("right.row1.amount"), (RVManifestServiceBeanManifest) null, (DefaultConstructorMarker) null), (Map) null, 8, (Object) null);
        int i2 = writeTypedObject + 91;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 31 / 0;
        }
    }

    public void onWarmupCompleted(@NotNull Interruptor interruptor) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(interruptor, "");
        onNavigationEvent(interruptor, true);
        BaseHomeFragment.onWarmupCompleted(this, interruptor, getOuterPage.onNavigationEvent.onNavigationEvent(getOuterPage.Companion, false, false, false, 1220287L, (Map) null, (getOuterPage.onExtraCallbackWithResult.onExtraCallbackWithResult) null, 55, (Object) null), new BaseEmbedView.onNavigationEvent(RVManifestWrapper.Companion.onNavigationEvent("right.row2.amount"), (RVManifestServiceBeanManifest) null, (DefaultConstructorMarker) null), (Map) null, 8, (Object) null);
        int i2 = readTypedObject + 35;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static final class onMessageChannelReady extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ boolean $isKrw;
        final /* synthetic */ Interruptor $item;
        long J$0;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onMessageChannelReady(boolean z, Interruptor interruptor, access13800<? super onMessageChannelReady> access13800Var) {
            super(2, access13800Var);
            this.$isKrw = z;
            this.$item = interruptor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onMessageChannelReady onmessagechannelready = HomeFragment.this.new onMessageChannelReady(this.$isKrw, this.$item, access13800Var);
            int i2 = onWarmupCompleted + 65;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onmessagechannelready;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 49;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onMessageChannelReady onmessagechannelreadyCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return onmessagechannelreadyCreate.invokeSuspend(unit);
            }
            onmessagechannelreadyCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            HomeDstRecyclerView homeDstRecyclerViewOnExtraCallbackWithResult;
            Map mapPrefetchWithMultipleUrls;
            long j;
            long j2;
            Map map;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                RemoteDebugUtils remoteDebugUtilsAccess000 = HomeFragment.access000(HomeFragment.this);
                if (remoteDebugUtilsAccess000 != null) {
                    int i3 = onWarmupCompleted + 39;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    HomeDstView homeDstView = remoteDebugUtilsAccess000.onExtraCallback;
                    if (homeDstView != null) {
                        int i5 = onWarmupCompleted + 41;
                        onNavigationEvent = i5 % 128;
                        if (i5 % 2 != 0) {
                            homeDstView.onExtraCallbackWithResult();
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        homeDstRecyclerViewOnExtraCallbackWithResult = homeDstView.onExtraCallbackWithResult();
                        if (homeDstRecyclerViewOnExtraCallbackWithResult != null) {
                            homeDstRecyclerViewOnExtraCallbackWithResult.smoothScrollToPosition(0);
                            mapPrefetchWithMultipleUrls = HomeFragment.this.requestPostMessageChannel().prefetchWithMultipleUrls();
                            if (mapPrefetchWithMultipleUrls == null) {
                                return Unit.INSTANCE;
                            }
                            if (((Boolean) RecyclerViewsKt.onExtraCallbackWithResult(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 447561191, -447561191, new Object[]{homeDstRecyclerViewOnExtraCallbackWithResult, 0}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent())).booleanValue()) {
                                int i6 = onWarmupCompleted + 85;
                                onNavigationEvent = i6 % 128;
                                int i7 = i6 % 2;
                                j = 0;
                            } else {
                                j = 100;
                            }
                            this.L$0 = access15400.onNavigationEvent(homeDstRecyclerViewOnExtraCallbackWithResult);
                            this.L$1 = mapPrefetchWithMultipleUrls;
                            this.J$0 = j;
                            this.label = 1;
                            if (RecyclerViewsKt.onExtraCallback(homeDstRecyclerViewOnExtraCallbackWithResult, 0, this) != objOnWarmupCompleted) {
                                j2 = j;
                            }
                            return objOnWarmupCompleted;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Map map2 = (Map) this.L$1;
                ResultKt.onNavigationEvent(obj);
                int i8 = onWarmupCompleted + 19;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                map = map2;
                HomeFragment homeFragment = HomeFragment.this;
                CurrencyCalculatorActivity.onWarmupCompleted onwarmupcompleted = CurrencyCalculatorActivity.Companion;
                Context contextRequireContext = homeFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                homeFragment.startActivity(onwarmupcompleted.onWarmupCompleted(contextRequireContext, map, this.$isKrw, this.$item.getInterfaceDescriptor().IAuthTabCallback(), (List) HomeViewModel.onExtraCallbackWithResult(1079763499, new Object[]{HomeFragment.this.requestPostMessageChannel()}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1079763495, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted())));
                return Unit.INSTANCE;
            }
            j2 = this.J$0;
            mapPrefetchWithMultipleUrls = (Map) this.L$1;
            homeDstRecyclerViewOnExtraCallbackWithResult = (HomeDstRecyclerView) this.L$0;
            ResultKt.onNavigationEvent(obj);
            this.L$0 = access15400.onNavigationEvent(homeDstRecyclerViewOnExtraCallbackWithResult);
            this.L$1 = mapPrefetchWithMultipleUrls;
            this.J$0 = j2;
            this.label = 2;
            if (formatMsgs.onWarmupCompleted(j2, this) != objOnWarmupCompleted) {
                map = mapPrefetchWithMultipleUrls;
                HomeFragment homeFragment2 = HomeFragment.this;
                CurrencyCalculatorActivity.onWarmupCompleted onwarmupcompleted2 = CurrencyCalculatorActivity.Companion;
                Context contextRequireContext2 = homeFragment2.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                homeFragment2.startActivity(onwarmupcompleted2.onWarmupCompleted(contextRequireContext2, map, this.$isKrw, this.$item.getInterfaceDescriptor().IAuthTabCallback(), (List) HomeViewModel.onExtraCallbackWithResult(1079763499, new Object[]{HomeFragment.this.requestPostMessageChannel()}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1079763495, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted())));
                return Unit.INSTANCE;
            }
            return objOnWarmupCompleted;
        }
    }

    private final void onNavigationEvent(Interruptor interruptor, boolean z) {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new onMessageChannelReady(z, interruptor, null), 3, (Object) null);
        int i2 = readTypedObject + 63;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        HomeFragment homeFragment = (HomeFragment) objArr[0];
        int i = 2 % 2;
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback = homeFragment.onExtraCallback();
        Object obj = null;
        if (remoteDebugUtilsOnExtraCallback != null) {
            int i2 = readTypedObject + 95;
            writeTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                HomeNavigationBarItemGroup homeNavigationBarItemGroup = remoteDebugUtilsOnExtraCallback.IAuthTabCallback_Parcel;
                obj.hashCode();
                throw null;
            }
            HomeNavigationBarItemGroup homeNavigationBarItemGroup2 = remoteDebugUtilsOnExtraCallback.IAuthTabCallback_Parcel;
            if (homeNavigationBarItemGroup2 != null) {
                onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{homeFragment, homeNavigationBarItemGroup2}, -121773119, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 121773124);
                int i3 = writeTypedObject + 25;
                readTypedObject = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = homeFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new extraCallback(homeFragment, (access13800) null), 3, (Object) null);
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        ((HomeNavigationBarItemGroup) objArr[1]).onExtraCallback("NOTIFICATION", new HomeFragment$.ExternalSyntheticLambda23((HomeFragment) objArr[0]));
        int i2 = readTypedObject + 57;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 97 / 0;
        }
        return null;
    }

    private static final View onActivityResized(HomeFragment homeFragment) {
        int i = 2 % 2;
        View viewInflate = homeFragment.getLayoutInflater().inflate(viva.republica.toss.R.layout.view_menu_feed_icon_button, (ViewGroup) null);
        TdsIconButtonV1View tdsIconButtonV1ViewFindViewById = viewInflate.findViewById(viva.republica.toss.R.id.view_menu_feed_icon);
        Intrinsics.checkNotNull(tdsIconButtonV1ViewFindViewById);
        String string = homeFragment.getString(im.toss.features.home.ui.dst.R.string.home_ui_dst_feed_icon_description);
        Intrinsics.checkNotNullExpressionValue(string, "");
        generateInviteUrl.onNavigationEvent(tdsIconButtonV1ViewFindViewById, string);
        tdsIconButtonV1ViewFindViewById.setOnClickListener(new HomeFragment$.ExternalSyntheticLambda20(homeFragment));
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        int i2 = readTypedObject + 117;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return viewInflate;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        HomeFragment homeFragment = (HomeFragment) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 93;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.newSessionWithExtras().onExtraCallbackWithResult(homeFragment.requireContext(), 4);
        int i4 = readTypedObject + 89;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return null;
    }

    private final void IPostMessageServiceStubProxy() {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new readTypedObject(this, (access13800) null), 3, (Object) null);
        int i2 = writeTypedObject + 43;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 80 / 0;
        }
    }

    public void onRelationshipValidationResult() {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new onActivityResized(this, (access13800) null), 3, (Object) null);
        int i2 = writeTypedObject + 71;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private final void IPostMessageServiceStub() {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(this, (access13800) null), 3, (Object) null);
        int i2 = writeTypedObject + 119;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void cancelNotification() {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner);
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new extraCallbackWithResult(this, (access13800) null), 3, (Object) null);
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner2), (CoroutineContext) null, (setRandomHost) null, new writeTypedObject(this, (access13800) null), 3, (Object) null);
        int i2 = readTypedObject + 51;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        HomeFragment homeFragment = (HomeFragment) objArr[0];
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = homeFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new ICustomTabsCallback(homeFragment, (access13800) null), 3, (Object) null);
        int i2 = writeTypedObject + 109;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r2
      0x0024: PHI (r2v5 im.toss.base.BaseActivity) = (r2v4 im.toss.base.BaseActivity), (r2v8 im.toss.base.BaseActivity) binds: [B:8:0x0022, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        BaseActivity baseActivity;
        HomeFragment homeFragment = (HomeFragment) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 85;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            baseActivity = homeFragment.getBaseActivity();
            int i3 = 56 / 0;
            if (baseActivity != null) {
                int i4 = readTypedObject + 87;
                writeTypedObject = i4 % 128;
                int i5 = i4 % 2;
                if (baseActivity.extraCallbackWithResult()) {
                    TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = homeFragment.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                    maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new getInterfaceDescriptor(homeFragment, (access13800) null), 3, (Object) null);
                    int i6 = readTypedObject + 45;
                    writeTypedObject = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        } else {
            baseActivity = homeFragment.getBaseActivity();
            if (baseActivity != null) {
            }
        }
        return null;
    }

    private final void getSmallIconId() {
        int i = 2 % 2;
        if (newSession().onExtraCallbackWithResult() != getPricingPhaseList.KR) {
            int i2 = readTypedObject + 21;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
        } else {
            TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new ICustomTabsCallbackStubProxy(null), 3, (Object) null);
            int i4 = writeTypedObject + 113;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void ITrustedWebActivityServiceStub() {
        int i = 2 % 2;
        if (newSession().onExtraCallbackWithResult() != getPricingPhaseList.KR) {
            int i2 = writeTypedObject + 77;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
        } else {
            TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new ICustomTabsCallbackStub(null), 3, (Object) null);
            int i4 = readTypedObject + 61;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void IAuthTabCallback(@NotNull fillData.asBinder.IAuthTabCallback iAuthTabCallback) {
        Object obj;
        List listEmptyList;
        int i = 2 % 2;
        int i2 = writeTypedObject + 1;
        readTypedObject = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            iAuthTabCallback.onNavigationEvent().hashCode();
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        String strOnNavigationEvent = iAuthTabCallback.onNavigationEvent();
        switch (strOnNavigationEvent.hashCode()) {
            case -177521082:
                if (strOnNavigationEvent.equals("saveMydataTrialBankSelections")) {
                    Map mapOnExtraCallback = iAuthTabCallback.onExtraCallback();
                    if (mapOnExtraCallback != null) {
                        int i3 = writeTypedObject + 21;
                        readTypedObject = i3 % 128;
                        int i4 = i3 % 2;
                        obj = mapOnExtraCallback.get("institutionCodes");
                    } else {
                        obj = null;
                    }
                    List list = !((obj instanceof List) ^ true) ? (List) obj : null;
                    if (list != null) {
                        listEmptyList = new ArrayList();
                        for (Object obj3 : list) {
                            int i5 = readTypedObject + 47;
                            writeTypedObject = i5 % 128;
                            int i6 = i5 % 2;
                            if (obj3 instanceof String) {
                                listEmptyList.add(obj3);
                            }
                        }
                    } else {
                        listEmptyList = null;
                    }
                    if (listEmptyList == null) {
                        int i7 = writeTypedObject + 65;
                        readTypedObject = i7 % 128;
                        if (i7 % 2 == 0) {
                            CollectionsKt.emptyList();
                            obj2.hashCode();
                            throw null;
                        }
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    requestPostMessageChannel().onExtraCallbackWithResult(listEmptyList);
                    return;
                }
                break;
            case 443121345:
                if (strOnNavigationEvent.equals("SHOW_SEND_SCREEN")) {
                    ITrustedWebActivityCallbackStubProxy();
                    return;
                }
                break;
            case 497355605:
                if (strOnNavigationEvent.equals("CLOSE_SEND_VIEW")) {
                    ITrustedWebActivityCallback_Parcel();
                    return;
                }
                break;
            case 2123644589:
                if (strOnNavigationEvent.equals("dismissMydataTrialTooltip")) {
                    int i8 = writeTypedObject + 49;
                    readTypedObject = i8 % 128;
                    int i9 = i8 % 2;
                    requestPostMessageChannel().receiveFile();
                    return;
                }
                break;
        }
        super/*im.toss.features.home.core.ui.base.BaseHomeFragment*/.IAuthTabCallback(iAuthTabCallback);
    }

    private final void onWarmupCompleted(BigDataChannelPolicy bigDataChannelPolicy) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 25;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            TextFieldKeyInputExternalSyntheticLambda9 lifecycle = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "");
            if (IAuthTabCallback(lifecycle) && ((getResourcePackages) asBinder()).onNavigationEvent(bigDataChannelPolicy.writeTypedObject())) {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1002934L, false, (String) null, (Map) null, new HomeFragment$.ExternalSyntheticLambda22(), 14, (Object) null);
                int i3 = readTypedObject + 49;
                writeTypedObject = i3 % 128;
                int i4 = i3 % 2;
            }
            int i5 = readTypedObject + 29;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle2 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle2, "");
        IAuthTabCallback(lifecycle2);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 105;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().put("action_type", "impression");
        setDetectableSize.onExtraCallback().put("service", "transfer");
        setDetectableSize.onExtraCallback().put("category", sendBroadcastWithAdObject.DASHBOARD);
        setDetectableSize.onExtraCallback().put("screen_name", "dashboard_main");
        setDetectableSize.onExtraCallback().put("version", 4);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 125;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final void access200() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 123;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (!setExtras.onWarmupCompleted(newSession())) {
            requestPostMessageChannel().ICustomTabsService_Parcel().onWarmupCompleted(new getEmbedWebViewEnv((String) null, (String) null, (String) null, (String) null, (String) null, (setStartParam) null, (setStartParam) null, 127, (DefaultConstructorMarker) null));
            return;
        }
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(null), 3, (Object) null);
        int i4 = readTypedObject + 57;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        Object L$0;
        Object L$1;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = HomeFragment.this.new onWarmupCompleted(access13800Var);
            int i2 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 61 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x00b4, TryCatch #0 {all -> 0x00b4, blocks: (B:9:0x0024, B:36:0x00af, B:15:0x003e, B:26:0x006a, B:29:0x0077, B:32:0x008d, B:31:0x007d, B:16:0x0042, B:24:0x005a, B:19:0x0049, B:21:0x0051), top: B:43:0x000b }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            processBytes processbytes;
            getCornerRadius getcornerradius;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
            } catch (Throwable th) {
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("HomeFragment", th);
                HomeFragment.this.requestPostMessageChannel().ICustomTabsService_Parcel().onWarmupCompleted(new getEmbedWebViewEnv((String) null, (String) null, (String) null, (String) null, (String) null, (setStartParam) null, (setStartParam) null, 127, (DefaultConstructorMarker) null));
            }
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                View view = HomeFragment.this.getView();
                if (view != null) {
                    this.label = 1;
                    if (zzcv.onNavigationEvent(view, this) == objOnWarmupCompleted) {
                    }
                    return objOnWarmupCompleted;
                }
                return Unit.INSTANCE;
            }
            int i3 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    getcornerradius = (getCornerRadius) this.L$1;
                    ResultKt.onNavigationEvent(obj);
                    int i5 = onNavigationEvent + 45;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 5 / 2;
                    }
                    getcornerradius.onWarmupCompleted(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                processbytes = (processBytes) obj;
                if (processbytes == null) {
                    int i7 = onNavigationEvent + 73;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    getEmbedWebViewEnv getembedwebviewenv = setChannelId.onNavigationEvent(processbytes);
                    if (getembedwebviewenv == null) {
                        getembedwebviewenv = new getEmbedWebViewEnv((String) null, (String) null, (String) null, (String) null, (String) null, (setStartParam) null, (setStartParam) null, 127, (DefaultConstructorMarker) null);
                    }
                    getCornerRadius getcornerradiusICustomTabsService_Parcel = HomeFragment.this.requestPostMessageChannel().ICustomTabsService_Parcel();
                    getContentProvider getcontentproviderNewAuthTabSession = HomeFragment.this.newAuthTabSession();
                    this.L$0 = access15400.onNavigationEvent(getembedwebviewenv);
                    this.L$1 = getcornerradiusICustomTabsService_Parcel;
                    this.label = 3;
                    obj = getcontentproviderNewAuthTabSession.onExtraCallbackWithResult(getembedwebviewenv, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    getcornerradius = getcornerradiusICustomTabsService_Parcel;
                    getcornerradius.onWarmupCompleted(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            enableFabricLogs enablefabriclogs = enableFabricLogs.onExtraCallback;
            Context context = HomeFragment.this.getContext();
            this.label = 2;
            obj = enablefabriclogs.onWarmupCompleted(context, this);
            if (obj != objOnWarmupCompleted) {
                processbytes = (processBytes) obj;
                if (processbytes == null) {
                }
                return Unit.INSTANCE;
            }
            return objOnWarmupCompleted;
        }
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 19;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().put("action_type", "click");
        setDetectableSize.onExtraCallback().put("service", "transfer");
        setDetectableSize.onExtraCallback().put("category", sendBroadcastWithAdObject.DASHBOARD);
        setDetectableSize.onExtraCallback().put("screen_name", "dashboard_main");
        setDetectableSize.onExtraCallback().put("version", 4);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 59;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final void ITrustedWebActivityCallbackStubProxy() {
        int i = 2 % 2;
        getEmbedWebViewEnv getembedwebviewenv = (getEmbedWebViewEnv) requestPostMessageChannel().ICustomTabsService_Parcel().IAuthTabCallback();
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1002936L, false, (String) null, (Map) null, new HomeFragment$.ExternalSyntheticLambda3(), 14, (Object) null);
        BaseHomeFragment.onExtraCallbackWithResult(this, setChannelId.onWarmupCompleted(getembedwebviewenv, TransferSource.CLIPBOARD_HOME, "home_accnt_copy"), (Bundle) null, 2, (Object) null);
        int i2 = writeTypedObject + 35;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onVerticalScrollEvent() {
        boolean z;
        int i = 2 % 2;
        int i2 = writeTypedObject + 31;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (setExtras.IAuthTabCallback(newSession())) {
            requestPostMessageChannel().IAuthTabCallback(updateVisuals());
            InventoryAdManager inventoryAdManagerUpdateVisuals = updateVisuals();
            zzdt zzdtVar = zzdt.HOME_INTELLIGENCE;
            zzm zzmVar = zzm.INVENTORY_AD_BANNER;
            InventoryAdManager.IAuthTabCallback iAuthTabCallback = InventoryAdManager.IAuthTabCallback.MANUAL;
            HomeRecyclerView homeRecyclerViewOnMinimized = onMinimized();
            Context context = getContext();
            if (context != null) {
                int i4 = writeTypedObject + 115;
                readTypedObject = i4 % 128;
                z = true;
                if (i4 % 2 == 0) {
                    Resources resources = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "");
                    Configuration configuration = resources.getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration, "");
                    readIntokhttp.onExtraCallback(configuration);
                } else {
                    Resources resources2 = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "");
                    Configuration configuration2 = resources2.getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration2, "");
                    if (!readIntokhttp.onExtraCallback(configuration2)) {
                        z = false;
                    }
                }
            }
            inventoryAdManagerUpdateVisuals.onNavigationEvent(this, zzdtVar, zzmVar, iAuthTabCallback, access8100.onNavigationEvent(getWrite.IAuthTabCallback("isDarkMode", String.valueOf(z))), homeRecyclerViewOnMinimized, new asBinder());
            int i5 = writeTypedObject + 3;
            readTypedObject = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 92 / 0;
            }
        }
    }

    public static final class asBinder implements InventoryAdManager.onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        asBinder() {
        }

        public void IAuthTabCallback(InventoryAdDto inventoryAdDto) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            HomeViewModel homeViewModelRequestPostMessageChannel = HomeFragment.this.requestPostMessageChannel();
            if (i3 == 0) {
                homeViewModelRequestPostMessageChannel.onExtraCallback(inventoryAdDto);
            } else {
                homeViewModelRequestPostMessageChannel.onExtraCallback(inventoryAdDto);
                int i4 = 92 / 0;
            }
        }
    }

    public static final class asInterface implements NativeAdsManager.asBinder {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ String IAuthTabCallback;
        final /* synthetic */ HomeFragment onExtraCallbackWithResult;

        asInterface(String str, HomeFragment homeFragment) {
            this.IAuthTabCallback = str;
            this.onExtraCallbackWithResult = homeFragment;
        }

        public /* bridge */ void IAuthTabCallback(AdInfo adInfo) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.IAuthTabCallback(adInfo);
            int i4 = onExtraCallback + 89;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 26 / 0;
            }
        }

        public /* bridge */ void onExtraCallback(AdInfo adInfo) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallback(adInfo);
            if (i3 == 0) {
                throw null;
            }
        }

        public /* bridge */ void onExtraCallback(NativeAdsError nativeAdsError) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallback(nativeAdsError);
            if (i3 == 0) {
                int i4 = 27 / 0;
            }
        }

        public /* bridge */ void onExtraCallbackWithResult(AdInfo adInfo) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(adInfo);
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* bridge */ void onWarmupCompleted(AdInfo adInfo) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(adInfo);
            int i4 = onExtraCallback + 81;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* bridge */ void onWarmupCompleted(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(str);
            if (i3 == 0) {
                throw null;
            }
        }

        public void onExtraCallback(Map<String, NativeAdsDto> map) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(map, "");
                map.get(this.IAuthTabCallback);
                throw null;
            }
            Intrinsics.checkNotNullParameter(map, "");
            NativeAdsDto nativeAdsDto = map.get(this.IAuthTabCallback);
            if (nativeAdsDto == null) {
                nativeAdsDto = new NativeAdsDto((String) null, (String) null, (String) null, (String) null, (List) null, (NativeAdsDto.ExtraInfo) null, 63, (DefaultConstructorMarker) null);
                int i3 = onNavigationEvent + 33;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            this.onExtraCallbackWithResult.requestPostMessageChannel().IAuthTabCallback(nativeAdsDto);
        }
    }

    private final void IEngagementSignalsCallbackStub() throws Throwable {
        getGroupName getgroupname;
        int i = 2 % 2;
        int i2 = readTypedObject + 27;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (setExtras.onExtraCallbackWithResult(newSession())) {
            if (((zzad) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, 1761000986, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -1761000967)).ITrustedWebActivityService_Parcel()) {
                int i4 = readTypedObject + 37;
                writeTypedObject = i4 % 128;
                if (i4 % 2 != 0) {
                    getGroupName getgroupname2 = getGroupName.HOME_ALPHA;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getgroupname = getGroupName.HOME_ALPHA;
                int i5 = writeTypedObject + 87;
                readTypedObject = i5 % 128;
                int i6 = i5 % 2;
            } else {
                getgroupname = getGroupName.HOME_LIVE;
            }
            String id = getgroupname.getId();
            requestPostMessageChannel().onExtraCallbackWithResult(onNavigationEvent());
            NativeAdsManager nativeAdsManagerOnNavigationEvent = onNavigationEvent();
            List listListOf = CollectionsKt.listOf(new addOnPageChangeListener.onWarmupCompleted(id, (GetNativeAdsRequestBody.AdRequestOption) null, (deleteProfile) null, (NativeAdsManager.onNavigationEvent) null, 14, (DefaultConstructorMarker) null));
            HomeRecyclerView homeRecyclerViewOnMinimized = onMinimized();
            asInterface asinterface = new asInterface(id, this);
            Object[] objArr = new Object[1];
            c(new char[]{0}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), false, (ViewConfiguration.getScrollBarSize() >> 8) + 1, 167 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
            NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -2054330016, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 2054330043, new Object[]{nativeAdsManagerOnNavigationEvent, this, listListOf, ((String) objArr[0]).intern(), null, homeRecyclerViewOnMinimized, asinterface, null, null, 200, null}, nSetPosition.onExtraCallbackWithResult());
            HomeViewModel.onExtraCallbackWithResult(-1350380421, new Object[]{requestPostMessageChannel()}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1350380438, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
        }
    }

    private final void ITrustedWebActivityCallback_Parcel() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 9;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        enableFabricLogs.onExtraCallback.onWarmupCompleted();
        access200();
        int i4 = readTypedObject + 57;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
    }

    private static final boolean IAuthTabCallback(RecyclerView.ViewHolder viewHolder, Object obj, Float f) {
        IIpcChannelStubProxy iIpcChannelStubProxy;
        int i = 2 % 2;
        if (!(viewHolder instanceof IIpcChannelStubProxy)) {
            iIpcChannelStubProxy = null;
        } else {
            iIpcChannelStubProxy = (IIpcChannelStubProxy) viewHolder;
            int i2 = readTypedObject + 101;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
        }
        if (!Intrinsics.areEqual(iIpcChannelStubProxy != null ? iIpcChannelStubProxy.onNavigationEvent() : null, obj)) {
            return false;
        }
        int i4 = readTypedObject + 45;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return getRemoteControlManagement.IAuthTabCallback(viewHolder, f != null ? f.floatValue() : 0.5f, 0, 0, 6, (Object) null);
    }

    public void onNavigationEvent(@NotNull RecyclerView.ViewHolder viewHolder, @Nullable Object obj, @Nullable Map<String, ? extends Object> map) {
        doInitialize doinitialize;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (obj instanceof doInitialize) {
            int i2 = writeTypedObject + 47;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            doinitialize = (doInitialize) obj;
        } else {
            doinitialize = null;
        }
        if (doinitialize != null) {
            int i4 = writeTypedObject + 99;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            ExecutorHelper executorHelperAK_ = doinitialize.aK_();
            Float fValueOf = executorHelperAK_ != null ? Float.valueOf((float) executorHelperAK_.IAuthTabCallback()) : null;
            if (doinitialize instanceof RuntimeErrorNoProxy) {
                onExtraCallbackWithResult((RuntimeErrorNoProxy) doinitialize, new HomeFragment$.ExternalSyntheticLambda7(viewHolder, obj, fValueOf), map, true);
                return;
            }
            if (!(!(doinitialize instanceof getStart))) {
                IAuthTabCallback(viewHolder, (getStart) doinitialize);
                int i6 = readTypedObject + 101;
                writeTypedObject = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
                return;
            }
            if (!(obj instanceof BigDataChannelPolicy)) {
                super.onNavigationEvent(viewHolder, obj, map);
                return;
            }
            if (getRemoteControlManagement.IAuthTabCallback(viewHolder, fValueOf != null ? fValueOf.floatValue() : 1.0f, 0, 0, 6, (Object) null)) {
                onWarmupCompleted((BigDataChannelPolicy) obj);
            }
        }
    }

    private static final Unit onWarmupCompleted(String str, BpsBannerDto.Slot slot, String str2, SetDetectableSize setDetectableSize) {
        String strOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = writeTypedObject + 9;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("request_id", str);
        setDetectableSize.onExtraCallback("banner_title", zzcl.onWarmupCompleted(slot.IAuthTabCallbackStub()));
        String strOnExtraCallbackWithResult = slot.onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult != null) {
            strOnWarmupCompleted = zzcl.onWarmupCompleted(strOnExtraCallbackWithResult);
            int i4 = writeTypedObject + 47;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        } else {
            strOnWarmupCompleted = null;
        }
        setDetectableSize.onExtraCallback("sub_title", strOnWarmupCompleted);
        setDetectableSize.onExtraCallback("service", slot.onExtraCallback());
        setDetectableSize.onExtraCallback("cached", str2);
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallback(RecyclerView.ViewHolder viewHolder, getStart getstart) {
        String str;
        int i = 2 % 2;
        if (((Boolean) ((getResourcePackages) asBinder()).onExtraCallback().IAuthTabCallback()).booleanValue()) {
            int i2 = readTypedObject + 51;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            BpsBannerDto.Slot slotIAuthTabCallback_Parcel = getstart.IAuthTabCallback_Parcel();
            String interfaceDescriptor = getstart.getInterfaceDescriptor();
            boolean z = false;
            if (getstart.IAuthTabCallbackStub()) {
                int i4 = writeTypedObject;
                int i5 = i4 + 29;
                readTypedObject = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 16 / 0;
                }
                int i7 = i4 + 83;
                readTypedObject = i7 % 128;
                int i8 = i7 % 2;
                str = "Y";
            } else {
                str = "N";
            }
            String str2 = str;
            if (getRemoteControlManagement.onExtraCallback(viewHolder, 0, 0, 3, (Object) null) > 0.0f) {
                int i9 = readTypedObject + 73;
                writeTypedObject = i9 % 128;
                int i10 = i9 % 2;
                z = true;
            }
            if (z) {
                if (((getResourcePackages) asBinder()).onNavigationEvent("bps_1px_" + interfaceDescriptor + PresetParser.UNDERLINE + slotIAuthTabCallback_Parcel.onExtraCallback())) {
                    ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 5187072L, false, (String) null, (Map) null, new HomeFragment$.ExternalSyntheticLambda19(interfaceDescriptor, slotIAuthTabCallback_Parcel, str2), 14, (Object) null);
                    int i11 = writeTypedObject + 69;
                    readTypedObject = i11 % 128;
                    int i12 = i11 % 2;
                }
            }
            if (getstart.IAuthTabCallbackStub() && z) {
                HomeViewModel.onExtraCallbackWithResult(-763519921, new Object[]{requestPostMessageChannel()}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 763519933, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
                int i13 = readTypedObject + 113;
                writeTypedObject = i13 % 128;
                int i14 = i13 % 2;
            }
            if (getRemoteControlManagement.IAuthTabCallback(viewHolder, 0.5f, 0, 0, 6, (Object) null)) {
                if (((getResourcePackages) asBinder()).onWarmupCompleted("bps_vimp_" + interfaceDescriptor + PresetParser.UNDERLINE + slotIAuthTabCallback_Parcel.onExtraCallback())) {
                    return;
                }
                maybeUpdateAnimatable.onNavigationEvent(onRenderReady.onExtraCallback(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(viewHolder, getstart, this, interfaceDescriptor, slotIAuthTabCallback_Parcel, str2, null), 3, (Object) null);
            }
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ String $cached;
        final /* synthetic */ getStart $item;
        final /* synthetic */ String $requestId;
        final /* synthetic */ BpsBannerDto.Slot $slot;
        final /* synthetic */ RecyclerView.ViewHolder $viewHolder;
        int label;
        final /* synthetic */ HomeFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(RecyclerView.ViewHolder viewHolder, getStart getstart, HomeFragment homeFragment, String str, BpsBannerDto.Slot slot, String str2, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$viewHolder = viewHolder;
            this.$item = getstart;
            this.this$0 = homeFragment;
            this.$requestId = str;
            this.$slot = slot;
            this.$cached = str2;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(String str, BpsBannerDto.Slot slot, String str2, SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(str, slot, str2, setDetectableSize);
            int i4 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$viewHolder, this.$item, this.this$0, this.$requestId, this.$slot, this.$cached, access13800Var);
            int i2 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onextracallbackCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(unit);
            int i4 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 66 / 0;
            }
            return objInvokeSuspend;
        }

        private static final Unit onExtraCallback(String str, BpsBannerDto.Slot slot, String str2, SetDetectableSize setDetectableSize) {
            String strOnWarmupCompleted;
            int i = 2 % 2;
            setDetectableSize.onExtraCallback("request_id", str);
            setDetectableSize.onExtraCallback("banner_title", zzcl.onWarmupCompleted(slot.IAuthTabCallbackStub()));
            String strOnExtraCallbackWithResult = slot.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult != null) {
                int i2 = onWarmupCompleted + 17;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    strOnWarmupCompleted = zzcl.onWarmupCompleted(strOnExtraCallbackWithResult);
                    int i3 = 70 / 0;
                } else {
                    strOnWarmupCompleted = zzcl.onWarmupCompleted(strOnExtraCallbackWithResult);
                }
                int i4 = onWarmupCompleted + 53;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            } else {
                strOnWarmupCompleted = null;
            }
            setDetectableSize.onExtraCallback("sub_title", strOnWarmupCompleted);
            setDetectableSize.onExtraCallback("service", slot.onExtraCallback());
            setDetectableSize.onExtraCallback("cached", str2);
            return Unit.INSTANCE;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onWarmupCompleted + 13;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0 ? i4 != 1 : i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(1000L, this) == objOnWarmupCompleted) {
                    int i6 = onWarmupCompleted + 11;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
            IIpcChannelStubProxy iIpcChannelStubProxy = this.$viewHolder;
            IIpcChannelStubProxy iIpcChannelStubProxy2 = !(iIpcChannelStubProxy instanceof IIpcChannelStubProxy) ? null : iIpcChannelStubProxy;
            if (Intrinsics.areEqual(iIpcChannelStubProxy2 != null ? iIpcChannelStubProxy2.onNavigationEvent() : null, this.$item) && getRemoteControlManagement.IAuthTabCallback(this.$viewHolder, 0.5f, 0, 0, 6, (Object) null)) {
                if (((getResourcePackages) this.this$0.asBinder()).onNavigationEvent("bps_vimp_" + this.$requestId + PresetParser.UNDERLINE + this.$slot.onExtraCallback())) {
                    ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 5187074L, false, (String) null, (Map) null, new HomeFragment$bpsBannerRowImpressionLog$2$.ExternalSyntheticLambda0(this.$requestId, this.$slot, this.$cached), 14, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        updateVisuals().onNavigationEvent(o.onRenderReady.onExtraCallback(r3), true);
        onNavigationEvent().onExtraCallbackWithResult().onExtraCallbackWithResult(o.onRenderReady.onExtraCallback(r3), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r4 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r4 != true) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        updateVisuals().onExtraCallback(true);
        onNavigationEvent().onExtraCallbackWithResult().onExtraCallback(true);
        r4 = im.toss.features.home.ui.dst.view.home.HomeFragment.readTypedObject + 51;
        im.toss.features.home.ui.dst.view.home.HomeFragment.writeTypedObject = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = readTypedObject + 31;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 54 / 0;
        }
    }

    private final void validateRelationship() throws Throwable {
        Context context;
        Intent intent;
        Uri data;
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            context = getContext();
            int i3 = 77 / 0;
            if (context == null) {
                return;
            }
        } else {
            context = getContext();
            if (context == null) {
                return;
            }
        }
        Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
        if (activityIAuthTabCallback == null || (intent = activityIAuthTabCallback.getIntent()) == null || (data = intent.getData()) == null) {
            return;
        }
        String strOnExtraCallback = processTransparent.onExtraCallback(data);
        c(new char[]{'\n', '\f', 5, 65484, 65484, 65495, 16, 16, '\f', 17, 15, 2, '\r', 18, 16, 2}, (ViewConfiguration.getTapTimeout() >> 16) + 15, true, View.MeasureSpec.makeMeasureSpec(0, 0) + 16, 217 - KeyEvent.keyCodeFromString(""), new Object[1]);
        if (!Intrinsics.areEqual(strOnExtraCallback, ((String) r12[0]).intern())) {
            return;
        }
        int i4 = readTypedObject + 55;
        writeTypedObject = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            Intrinsics.areEqual(data.getQueryParameter("tooltip"), "footer-home-setting");
            obj.hashCode();
            throw null;
        }
        if (Intrinsics.areEqual(data.getQueryParameter("tooltip"), "footer-home-setting")) {
            TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(null), 3, (Object) null);
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        int I$0;
        Object L$0;
        Object L$1;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = HomeFragment.this.new onNavigationEvent(access13800Var);
            int i2 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 79;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0145 A[PHI: r15
          0x0145: PHI (r15v30 android.content.Intent) = (r15v29 android.content.Intent), (r15v35 android.content.Intent) binds: [B:52:0x0143, B:49:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            RemoteDebugUtils remoteDebugUtilsAccess000;
            int iNextIndex;
            int i;
            View view;
            View viewFindViewById;
            Intent intent;
            Activity activityIAuthTabCallback;
            Intent intent2;
            Uri data;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i3 % 128;
            Uri uri = null;
            if (i3 % 2 == 0) {
                access14300.onWarmupCompleted();
                uri.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                remoteDebugUtilsAccess000 = HomeFragment.access000(HomeFragment.this);
                if (remoteDebugUtilsAccess000 == null) {
                    return Unit.INSTANCE;
                }
                ListAdapter adapter = remoteDebugUtilsAccess000.onExtraCallback.onExtraCallbackWithResult().getAdapter();
                ListAdapter listAdapter = adapter instanceof ListAdapter ? adapter : null;
                if (listAdapter == null) {
                    return Unit.INSTANCE;
                }
                List currentList = listAdapter.getCurrentList();
                Intrinsics.checkNotNullExpressionValue(currentList, "");
                ListIterator listIterator = currentList.listIterator(currentList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    }
                    int i5 = onExtraCallbackWithResult + 103;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    if (listIterator.previous() instanceof setStart) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                Integer numOnNavigationEvent = access14000.onNavigationEvent(iNextIndex);
                if (numOnNavigationEvent.intValue() < 0) {
                    numOnNavigationEvent = null;
                }
                if (numOnNavigationEvent == null) {
                    Unit unit = Unit.INSTANCE;
                    int i7 = onExtraCallbackWithResult + 39;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 == 0) {
                        return unit;
                    }
                    uri.hashCode();
                    throw null;
                }
                int i8 = onWarmupCompleted + 59;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                int iIntValue = numOnNavigationEvent.intValue();
                remoteDebugUtilsAccess000.onExtraCallback.onExtraCallbackWithResult().smoothScrollToPosition(iIntValue);
                HomeDstRecyclerView homeDstRecyclerViewOnExtraCallbackWithResult = remoteDebugUtilsAccess000.onExtraCallback.onExtraCallbackWithResult();
                this.L$0 = remoteDebugUtilsAccess000;
                this.L$1 = access15400.onNavigationEvent(listAdapter);
                this.I$0 = iIntValue;
                this.label = 1;
                if (RecyclerViewsKt.onExtraCallback(homeDstRecyclerViewOnExtraCallbackWithResult, iIntValue, this) == objOnWarmupCompleted) {
                    int i10 = onWarmupCompleted + 61;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 90 / 0;
                    }
                    return objOnWarmupCompleted;
                }
                i = iIntValue;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i12 = onWarmupCompleted + 65;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                i = this.I$0;
                remoteDebugUtilsAccess000 = (RemoteDebugUtils) this.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = remoteDebugUtilsAccess000.onExtraCallback.onExtraCallbackWithResult().findViewHolderForAdapterPosition(i);
            if (viewHolderFindViewHolderForAdapterPosition == null || (view = viewHolderFindViewHolderForAdapterPosition.onNavigationEvent) == null || (viewFindViewById = view.findViewById(im.toss.features.home.core.ui.R.id.titleFooterButtonView)) == null) {
                return Unit.INSTANCE;
            }
            int i14 = onWarmupCompleted + 7;
            onExtraCallbackWithResult = i14 % 128;
            if (i14 % 2 == 0) {
                TdsHighlightV2View.IAuthTabCallback.onExtraCallbackWithResult(TdsHighlightV2View.Companion, viewFindViewById, HomeFragment.this.getString(im.toss.features.home.ui.dst.R.string.home_ui_dst_home_setting_tooltip_message), TdsHighlightV2View.onWarmupCompleted.TOP, 0, (TdsHighlightV2View.onExtraCallbackWithResult) null, (TdsHighlightV2View.onExtraCallback) null, 0L, 27, (Object) null);
                intent = HomeFragment.this.requireActivity().getIntent();
                if (intent != null) {
                    Context context = HomeFragment.this.getContext();
                    if (context != null && (activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context)) != null && (intent2 = activityIAuthTabCallback.getIntent()) != null && (data = intent2.getData()) != null) {
                        int i15 = onWarmupCompleted + 27;
                        onExtraCallbackWithResult = i15 % 128;
                        int i16 = i15 % 2;
                        uri = (Uri) filterCreatePageParams.onWarmupCompleted(new Object[]{data, "tooltip"}, -1629497967, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1629497971);
                    }
                    intent.setData(uri);
                }
            } else {
                TdsHighlightV2View.IAuthTabCallback.onExtraCallbackWithResult(TdsHighlightV2View.Companion, viewFindViewById, HomeFragment.this.getString(im.toss.features.home.ui.dst.R.string.home_ui_dst_home_setting_tooltip_message), TdsHighlightV2View.onWarmupCompleted.TOP, 0, (TdsHighlightV2View.onExtraCallbackWithResult) null, (TdsHighlightV2View.onExtraCallback) null, 0L, 60, (Object) null);
                intent = HomeFragment.this.requireActivity().getIntent();
                if (intent != null) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onWarmupCompleted(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 3;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        c(new char[]{65526, '\b', 5, 5, 65528, 1, 65526, '\f'}, Gravity.getAbsoluteGravity(0, 0) + 8, false, 8 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 227 - (Process.myTid() >> 22), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), StringsKt.substringAfter$default(str, "push_currency_", (String) null, 2, (Object) null));
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 69;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e A[PHI: r3
      0x002e: PHI (r3v4 android.net.Uri) = (r3v3 android.net.Uri), (r3v15 android.net.Uri) binds: [B:10:0x002c, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        Uri data;
        Uri uri;
        Uri data2;
        HomeFragment homeFragment = (HomeFragment) objArr[0];
        int i = 2 % 2;
        Intent intent = homeFragment.requireActivity().getIntent();
        if (intent != null) {
            int i2 = writeTypedObject + 105;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                data = intent.getData();
                int i3 = 62 / 0;
                if (data != null) {
                    Object[] objArr2 = new Object[1];
                    c(new char[]{65530, 7, 7, 65530, 65531, 65530, 7, 7}, 2 - (ViewConfiguration.getPressedStateDuration() >> 16), false, Color.green(0) + 8, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 224, objArr2);
                    String queryParameter = data.getQueryParameter(((String) objArr2[0]).intern());
                    if (queryParameter != null) {
                        String strOnExtraCallback = processTransparent.onExtraCallback(data);
                        Object[] objArr3 = new Object[1];
                        c(new char[]{'\n', '\f', 5, 65484, 65484, 65495, 16, 16, '\f', 17, 15, 2, '\r', 18, 16, 2}, 15 - (ViewConfiguration.getTouchSlop() >> 8), true, 16 - TextUtils.getOffsetBefore("", 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 217, objArr3);
                        if (Intrinsics.areEqual(strOnExtraCallback, ((String) objArr3[0]).intern())) {
                            int i4 = writeTypedObject + 91;
                            readTypedObject = i4 % 128;
                            int i5 = i4 % 2;
                            if (StringsKt.startsWith$default(queryParameter, "push_currency_", false, 2, (Object) null)) {
                                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1247191L, false, (String) null, (Map) null, new HomeFragment$.ExternalSyntheticLambda8(queryParameter), 14, (Object) null);
                                Intent intent2 = homeFragment.requireActivity().getIntent();
                                if (intent2 != null) {
                                    Intent intent3 = homeFragment.requireActivity().getIntent();
                                    if (intent3 == null || (data2 = intent3.getData()) == null) {
                                        uri = null;
                                    } else {
                                        Object[] objArr4 = new Object[1];
                                        c(new char[]{65530, 7, 7, 65530, 65531, 65530, 7, 7}, 2 - (ViewConfiguration.getTapTimeout() >> 16), false, 9 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), AndroidCharacter.getMirror('0') + 177, objArr4);
                                        uri = (Uri) filterCreatePageParams.onWarmupCompleted(new Object[]{data2, ((String) objArr4[0]).intern()}, -1629497967, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1629497971);
                                        int i6 = writeTypedObject + 27;
                                        readTypedObject = i6 % 128;
                                        int i7 = i6 % 2;
                                    }
                                    intent2.setData(uri);
                                }
                            }
                        }
                    }
                }
            } else {
                data = intent.getData();
                if (data != null) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[PHI: r1
      0x0029: PHI (r1v6 o.RemoteDebugUtils) = (r1v5 o.RemoteDebugUtils), (r1v11 o.RemoteDebugUtils) binds: [B:8:0x0027, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void writeTypedObject() {
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback;
        int i = 2 % 2;
        int i2 = writeTypedObject + 45;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            super.writeTypedObject();
            remoteDebugUtilsOnExtraCallback = (RemoteDebugUtils) onExtraCallback();
            int i3 = 50 / 0;
            if (remoteDebugUtilsOnExtraCallback != null) {
                HomeNavigationBarItemGroup homeNavigationBarItemGroup = remoteDebugUtilsOnExtraCallback.IAuthTabCallback_Parcel;
                if (homeNavigationBarItemGroup != null) {
                    int i4 = writeTypedObject + 9;
                    readTypedObject = i4 % 128;
                    if (i4 % 2 == 0) {
                        homeNavigationBarItemGroup.onExtraCallback();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    homeNavigationBarItemGroup.onExtraCallback();
                }
            }
        } else {
            super.writeTypedObject();
            remoteDebugUtilsOnExtraCallback = onExtraCallback();
            if (remoteDebugUtilsOnExtraCallback != null) {
            }
        }
        setHasScreenShot sethasscreenshot = (setHasScreenShot) ((setRubIn) HomeViewModel.onExtraCallbackWithResult(-1003598179, new Object[]{requestPostMessageChannel()}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1003598188, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted())).IAuthTabCallback();
        if (sethasscreenshot != null) {
            BaseHomeFragment.onExtraCallback(this, sethasscreenshot, new HomeFragment$.ExternalSyntheticLambda32(this, sethasscreenshot), (Map) null, false, 8, (Object) null);
        }
    }

    private static final boolean onNavigationEvent(HomeFragment homeFragment, setHasScreenShot sethasscreenshot) {
        String strOnNavigationEvent;
        int i = 2 % 2;
        setHasScreenShot sethasscreenshot2 = (setHasScreenShot) ((setRubIn) HomeViewModel.onExtraCallbackWithResult(-1003598179, new Object[]{homeFragment.requestPostMessageChannel()}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1003598188, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted())).IAuthTabCallback();
        if (sethasscreenshot2 != null) {
            int i2 = writeTypedObject + 99;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            strOnNavigationEvent = sethasscreenshot2.onNavigationEvent();
            int i4 = readTypedObject + 75;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
        } else {
            strOnNavigationEvent = null;
        }
        boolean zAreEqual = Intrinsics.areEqual(strOnNavigationEvent, sethasscreenshot.onNavigationEvent());
        int i6 = readTypedObject + 3;
        writeTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return zAreEqual;
    }

    public boolean onBackPressed() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 73;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this, true}, -1876319326, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 1876319333)).booleanValue();
        int i4 = readTypedObject + 31;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) {
        View decorView;
        ViewGroup viewGroup;
        HomeFragment homeFragment = (HomeFragment) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = writeTypedObject + 111;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        FragmentActivity activity = homeFragment.getActivity();
        TdsHighlightV2View tdsHighlightV2View = null;
        if (activity != null) {
            int i4 = writeTypedObject + 19;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            Window window = activity.getWindow();
            if (window != null) {
                int i6 = writeTypedObject + 17;
                readTypedObject = i6 % 128;
                int i7 = i6 % 2;
                decorView = window.getDecorView();
            } else {
                decorView = null;
            }
        }
        if (decorView instanceof ViewGroup) {
            viewGroup = (ViewGroup) decorView;
        } else {
            int i8 = writeTypedObject + 111;
            readTypedObject = i8 % 128;
            int i9 = i8 % 2;
            viewGroup = null;
        }
        if (viewGroup == null) {
            return false;
        }
        IntIterator it = RangesKt.until(0, viewGroup.getChildCount()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TdsHighlightV2View childAt = viewGroup.getChildAt(it.nextInt());
            TdsHighlightV2View tdsHighlightV2View2 = childAt instanceof TdsHighlightV2View ? childAt : null;
            if (tdsHighlightV2View2 != null) {
                tdsHighlightV2View = tdsHighlightV2View2;
                break;
            }
        }
        if (tdsHighlightV2View == null) {
            int i10 = readTypedObject + 101;
            writeTypedObject = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (zBooleanValue) {
            tdsHighlightV2View.onWarmupCompleted();
        } else {
            viewGroup.removeView(tdsHighlightV2View);
        }
        return true;
    }

    private final void setEngagementSignalsCallback() {
        AccessibilityManager accessibilityManager;
        int i = 2 % 2;
        Context context = getContext();
        Object systemService = context != null ? context.getSystemService("accessibility") : null;
        if (systemService instanceof AccessibilityManager) {
            int i2 = writeTypedObject + 115;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                accessibilityManager = (AccessibilityManager) systemService;
                int i3 = 76 / 0;
            } else {
                accessibilityManager = (AccessibilityManager) systemService;
            }
        } else {
            accessibilityManager = null;
        }
        if (accessibilityManager != null) {
            int i4 = readTypedObject + 121;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            if (accessibilityManager.isEnabled()) {
                int i6 = writeTypedObject + 91;
                readTypedObject = i6 % 128;
                int i7 = i6 % 2;
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                Intrinsics.checkNotNullExpressionValue(accessibilityEventObtain, "");
                accessibilityEventObtain.setEventType(16384);
                List<CharSequence> text = accessibilityEventObtain.getText();
                Context context2 = getContext();
                text.add(context2 != null ? context2.getString(viva.republica.toss.R.string.app_teens_onboarding_accessibility_guide) : null);
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
            }
        }
    }

    private final void onNavigationEvent(Function0<Unit> function0) {
        View decorView;
        Window window;
        int i = 2 % 2;
        int i2 = readTypedObject + 123;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            decorView = null;
        } else {
            int i4 = writeTypedObject + 99;
            readTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                decorView = window.getDecorView();
                int i5 = 7 / 0;
            } else {
                decorView = window.getDecorView();
            }
        }
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new ICustomTabsService(viewGroup, function0, null), 3, (Object) null);
        }
    }

    static final class ICustomTabsService extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function0<Unit> $doOnEnd;
        final /* synthetic */ ViewGroup $this_run;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ICustomTabsService(ViewGroup viewGroup, Function0<Unit> function0, access13800<? super ICustomTabsService> access13800Var) {
            super(2, access13800Var);
            this.$this_run = viewGroup;
            this.$doOnEnd = function0;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsService iCustomTabsService = new ICustomTabsService(this.$this_run, this.$doOnEnd, access13800Var);
            int i2 = onExtraCallback + 9;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return iCustomTabsService;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 81;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 96 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ICustomTabsService iCustomTabsServiceCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = iCustomTabsServiceCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 17 / 0;
            } else {
                objInvokeSuspend = iCustomTabsServiceCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onNavigationEvent + 61;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            View view;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                View view2 = new View(this.$this_run.getContext());
                view2.setLayoutParams(new ActionBar.LayoutParams(-1, -1));
                view2.setFocusable(true);
                view2.setClickable(true);
                this.$this_run.addView(view2);
                this.L$0 = view2;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(1000L, this) == objOnWarmupCompleted) {
                    int i4 = onExtraCallback + 13;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
                view = view2;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                view = (View) this.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            this.$this_run.removeView(view);
            this.$doOnEnd.invoke();
            return Unit.INSTANCE;
        }
    }

    private final void onNavigationEvent(setHasScreenShot.onNavigationEvent onnavigationevent) {
        RemoteDebugUtils remoteDebugUtilsOnExtraCallback;
        TdsImageView tdsImageView;
        int i = 2 % 2;
        setHasWhiteScreen.IAuthTabCallback iAuthTabCallbackIAuthTabCallback_Parcel = onnavigationevent.IAuthTabCallback_Parcel();
        if (iAuthTabCallbackIAuthTabCallback_Parcel instanceof setHasWhiteScreen.IAuthTabCallback) {
            int i2 = readTypedObject + 23;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            RemoteDebugUtils remoteDebugUtilsOnExtraCallback2 = onExtraCallback();
            if (remoteDebugUtilsOnExtraCallback2 == null || (tdsImageView = remoteDebugUtilsOnExtraCallback2.IAuthTabCallbackStub) == null) {
                return;
            }
            int i4 = writeTypedObject + 89;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            float fCoerceAtMost = RangesKt.coerceAtMost(onnavigationevent.IAuthTabCallbackStub(), 48.0f);
            int iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(tdsImageView, 4);
            double d = fCoerceAtMost;
            double d2 = (48.0d - d) / 2.0d;
            tdsImageView.setPadding(iOnExtraCallbackWithResult, setTagsokhttp.onExtraCallbackWithResult(tdsImageView, Double.valueOf(d2)), iOnExtraCallbackWithResult, setTagsokhttp.onExtraCallbackWithResult(tdsImageView, Double.valueOf(d2)));
            getRemoteSignature.onNavigationEvent(tdsImageView, iAuthTabCallbackIAuthTabCallback_Parcel, Double.valueOf(onnavigationevent.getInterfaceDescriptor()), Double.valueOf(d), (Function1) null, 8, (Object) null);
            tdsImageView.setContentDescription(onnavigationevent.IAuthTabCallbackStubProxy());
            fillData filldataOnTransact = onnavigationevent.onTransact();
            if (filldataOnTransact != null) {
                patch.IAuthTabCallback(tdsImageView, 0.0f, 1, (Object) null);
                tdsImageView.setOnClickListener(new HomeFragment$.ExternalSyntheticLambda14(this, filldataOnTransact, onnavigationevent));
                return;
            }
            return;
        }
        if (!(iAuthTabCallbackIAuthTabCallback_Parcel instanceof setHasWhiteScreen.onWarmupCompleted) || (remoteDebugUtilsOnExtraCallback = onExtraCallback()) == null) {
            return;
        }
        int i6 = writeTypedObject + 59;
        readTypedObject = i6 % 128;
        if (i6 % 2 == 0) {
            LottieAnimationView lottieAnimationView = remoteDebugUtilsOnExtraCallback.asBinder;
            throw null;
        }
        LottieAnimationView lottieAnimationView2 = remoteDebugUtilsOnExtraCallback.asBinder;
        if (lottieAnimationView2 != null) {
            ViewGroup.LayoutParams layoutParams = lottieAnimationView2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = setTagsokhttp.onExtraCallbackWithResult(lottieAnimationView2, Float.valueOf(onnavigationevent.IAuthTabCallbackStub()));
            layoutParams.width = setTagsokhttp.onExtraCallbackWithResult(lottieAnimationView2, Float.valueOf(onnavigationevent.getInterfaceDescriptor()));
            lottieAnimationView2.setLayoutParams(layoutParams);
            lottieAnimationView2.setContentDescription(onnavigationevent.IAuthTabCallbackStubProxy());
            isError.onWarmupCompleted(lottieAnimationView2, (setHasWhiteScreen.onWarmupCompleted) iAuthTabCallbackIAuthTabCallback_Parcel, (Double) null, (Double) null, 6, (Object) null);
            fillData filldataOnTransact2 = onnavigationevent.onTransact();
            if (filldataOnTransact2 != null) {
                patch.IAuthTabCallback(lottieAnimationView2, 0.0f, 1, (Object) null);
                lottieAnimationView2.setOnClickListener(new HomeFragment$.ExternalSyntheticLambda15(this, filldataOnTransact2, onnavigationevent));
            }
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(HomeFragment homeFragment, RVManifestLazyProxyManifest rVManifestLazyProxyManifest, Function0 function0) {
        return (Unit) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{homeFragment, rVManifestLazyProxyManifest, function0}, -316823474, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 316823496);
    }

    public static /* synthetic */ Unit onNavigationEvent(SetDetectableSize setDetectableSize) {
        return (Unit) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{setDetectableSize}, 1781758751, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -1781758748);
    }

    public static /* synthetic */ Unit onWarmupCompleted(HomeFragment homeFragment, float f) {
        return (Unit) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{homeFragment, Float.valueOf(f)}, 2009935702, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -2009935702);
    }

    private static final boolean prefetchWithMultipleUrls() {
        return ((Boolean) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[0], -1700819831, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 1700819845)).booleanValue();
    }

    private final void warmup() {
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, 4688640, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -4688631);
    }

    private final void ICustomTabsServiceStub() {
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, 442232045, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -442232039);
    }

    private final boolean onWarmupCompleted(boolean z) {
        return ((Boolean) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this, Boolean.valueOf(z)}, -1876319326, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 1876319333)).booleanValue();
    }

    private final int ICustomTabsServiceDefault() {
        return ((Integer) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, -106600496, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 106600508)).intValue();
    }

    private static final Unit onPostMessage(HomeFragment homeFragment) {
        return (Unit) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{homeFragment}, 197105921, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -197105911);
    }

    private final void writeTypedList() {
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, -1861592051, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 1861592071);
    }

    private final void onSessionEnded() {
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, -1580285442, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 1580285444);
    }

    private static final void onWarmupCompleted(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, HomeFragment homeFragment) {
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{pillarSwipeRefreshLayout, homeFragment}, 1143149084, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -1143149061);
    }

    private final void ITrustedWebActivityCallbackDefault() {
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, 2087825122, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -2087825101);
    }

    private final void IPostMessageService_Parcel() {
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, -1953565586, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 1953565602);
    }

    private final void areNotificationsEnabled() {
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, -1226657639, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 1226657647);
    }

    private static final Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
        return (Unit) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{setDetectableSize}, 418332360, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -418332335);
    }

    private static final Unit IAuthTabCallbackDefault(SetDetectableSize setDetectableSize) {
        return (Unit) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{setDetectableSize}, -2017587596, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 2017587613);
    }

    private static final void IAuthTabCallback(HomeFragment homeFragment, fillData filldata, setHasScreenShot.onNavigationEvent onnavigationevent, View view) {
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{homeFragment, filldata, onnavigationevent, view}, -202868565, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 202868566);
    }

    private final void IAuthTabCallback(HomeNavigationBarItemGroup homeNavigationBarItemGroup) {
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this, homeNavigationBarItemGroup}, -121773119, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 121773124);
    }

    private static final void asInterface(HomeFragment homeFragment, View view) {
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{homeFragment, view}, 733777877, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -733777866);
    }

    private final void getActiveNotifications() {
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, -1049250930, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 1049250954);
    }

    public final zzad ICustomTabsCallback_Parcel() {
        return (zzad) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, 1761000986, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -1761000967);
    }

    public final DomainConfigProxy mayLaunchUrl() {
        return (DomainConfigProxy) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this}, 1108547793, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -1108547766);
    }

    static void requestPostMessageChannelWithExtras() {
        ICustomTabsCallback = 478308959;
    }
}
