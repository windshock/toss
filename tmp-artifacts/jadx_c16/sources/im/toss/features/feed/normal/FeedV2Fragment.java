package im.toss.features.feed.normal;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import com.google.android.gms.internal.ads.zzgc;
import com.google.common.collect.Synchronized;
import com.otaliastudios.cameraview.R$styleable;
import im.toss.base.BaseActivity;
import im.toss.features.feed.R;
import im.toss.features.feed.R$id;
import im.toss.features.feed.R$menu;
import im.toss.features.feed.data.dto.InboxMessageV2Dto;
import im.toss.features.feed.data.dto.InboxV2OthersReq;
import im.toss.features.feed.data.dto.InboxV2OthersResp;
import im.toss.features.feed.data.dto.InboxV2Resp;
import im.toss.features.feed.normal.FeedV2Fragment$;
import im.toss.features.onboarding.data.network.model.TossIncomeNotificationSettingDto;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import im.toss.uikit.widget.PillarSwipeRefreshLayout;
import im.toss.uikit.widget.TdsResultV0View;
import im.toss.utils.RxUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.StringsKt;
import o.ACPayResult;
import o.AppLovinAdServiceImplc;
import o.AppLovinSdkInitializationConfigurationImpl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DERSet;
import o.DERString;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.EngineFactory;
import o.EngineStack;
import o.EngineUtils1;
import o.EngineUtils2;
import o.EventServiceImplExternalSyntheticLambda1;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceStubProxy;
import o.MapConverter;
import o.NestfgetmDriveCxxAnimations;
import o.NetConverter3;
import o.PageContext;
import o.PlayerErrorCode;
import o.RVEngine;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SessionTrackerb;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.access8100;
import o.addAllCommandLine;
import o.addExtra;
import o.addPolicy;
import o.clearTid;
import o.convertAnyToMap;
import o.createEngine;
import o.decapitalize;
import o.deserializeUriNullableCollection;
import o.disableImageViewPreallocationAndroid;
import o.enableModuleArgumentNSNullConversionIOS;
import o.filterCreatePageParams;
import o.findResAndMsg;
import o.getByteBuffer;
import o.getClientExtendConfig;
import o.getCodeNameBytes;
import o.getCornerRadius;
import o.getIconPaddingLeft;
import o.getKekid;
import o.getNavigationBar;
import o.getParamImp;
import o.getPreRenderJob;
import o.getPricingPhaseList;
import o.getRenderById;
import o.getTimestampBytes;
import o.getTopProxy;
import o.getUserAgentSuffix;
import o.getWorker;
import o.getWorkerId;
import o.getWrite;
import o.initIgnoreEventList;
import o.initMiniApp;
import o.logEvent;
import o.maybeUpdateAnimatable;
import o.mergeParams;
import o.nSetPosition;
import o.onPageExit;
import o.performOneTimeSetup;
import o.performOneTimeSetuplambda1;
import o.preFillDefault;
import o.r8lambda295zAJYjdsl38mfEBnLGXD9CqAA;
import o.removeProxy;
import o.sendPushCallBack;
import o.sendPushWorkMessage;
import o.sendToRender;
import o.setMessageBytes;
import o.setRandomHost;
import o.setRenderId;
import o.setSerializeConfig;
import o.setSerializerFeatures;
import o.setShine;
import o.setUnwindFunction;
import o.sizeOf;
import o.trackCheckout;
import o.unload;
import o.updateAdInfo;
import o.updateLoadParamUrl;
import o.varyMatches;
import o.writeRaw;
import o.zzag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.StatusManager;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

@DERString
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class FeedV2Fragment extends Hilt_FeedV2Fragment implements StatusManager.onExtraCallback, getWorkerId, getWorker, sizeOf {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    static final /* synthetic */ addAllCommandLine<Object>[] IAuthTabCallback;
    private static char[] ICustomTabsCallbackStub = null;
    private static int ICustomTabsCallback_Parcel = 0;
    private static char ICustomTabsService = 0;
    private static int extraCommand = 1;
    private static int isEngagementSignalsApiAvailable = 0;
    private static int mayLaunchUrl = 1;
    public static final int onExtraCallback;
    private final getTimestampBytes<logEvent> IAuthTabCallbackDefault;
    private final getCornerRadius<logEvent> IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private boolean ICustomTabsCallback;
    private boolean ICustomTabsCallbackDefault;
    private getClientExtendConfig ICustomTabsCallbackStubProxy;
    private TossIncomeNotificationSettingDto access000;
    private boolean access100;

    @Inject
    public AppLovinAdServiceImplc analyticsHelper;
    private List<getTopProxy> asBinder;
    private String asInterface;
    private final HashSet<Integer> extraCallback;
    private final boolean extraCallbackWithResult;
    private boolean getInterfaceDescriptor;

    @Inject
    public AppLovinSdkInitializationConfigurationImpl inbox;

    @Inject
    public setSerializerFeatures marketingNotificationAvailability;

    @Inject
    public updateAdInfo messageCompanyParser;

    @Inject
    public updateLoadParamUrl messengerApi;

    @Inject
    public trackCheckout notificationHelper;
    private final Lazy onActivityLayout;
    private Integer onActivityResized;
    private getRenderById onExtraCallbackWithResult;
    private final Lazy onMessageChannelReady;
    private onExtraCallbackWithResult onMinimized;
    private final PageContext onNavigationEvent;
    private final Lazy onPostMessage;
    private boolean onRelationshipValidationResult;
    private final getTimestampBytes<Boolean> onTransact;
    private List<Object> onUnminimized;
    private Pair<Boolean, String> onWarmupCompleted;

    @Inject
    public setSerializeConfig pushTokenEnableDataSource;
    private boolean readTypedObject;

    @Inject
    public getPricingPhaseList region;

    @Inject
    public zzag tossClock;

    @Inject
    public decapitalize tossIncomeNotificationStatusApi;

    @Inject
    public SessionTrackerb tossRouter;
    private final IEngagementSignalsCallback_Parcel<Intent> writeTypedObject;

    static {
        IAuthTabCallback_Parcel();
        IAuthTabCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(FeedV2Fragment.class, "binding", "getBinding()Lim/toss/features/feed/databinding/FragmentFeedV2Binding;", 0)};
        Companion = new onWarmupCompleted((DefaultConstructorMarker) null);
        onExtraCallback = 8;
        int i = mayLaunchUrl + 121;
        ICustomTabsCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(EngineStack engineStack, FeedV2Fragment feedV2Fragment, InboxV2OthersResp inboxV2OthersResp) {
        int i = 2 % 2;
        int i2 = extraCommand + 23;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -625549268, iIAuthTabCallback2, new Object[]{engineStack, feedV2Fragment, inboxV2OthersResp}, 625549280, iIAuthTabCallback3);
        int i4 = isEngagementSignalsApiAvailable + 79;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(FeedV2Fragment feedV2Fragment) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 31;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 307570310, iIAuthTabCallback2, new Object[]{feedV2Fragment}, -307570291, iIAuthTabCallback3);
            return;
        }
        int iIAuthTabCallback4 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback5 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback6 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback4, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 307570310, iIAuthTabCallback5, new Object[]{feedV2Fragment}, -307570291, iIAuthTabCallback6);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(EngineStack engineStack, FeedV2DetailDialog feedV2DetailDialog, FeedV2Fragment feedV2Fragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 125;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(engineStack, feedV2DetailDialog, feedV2Fragment, dialogInterface);
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 99;
        extraCommand = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -577433282, iIAuthTabCallback2, new Object[]{function1, obj}, 577433309, iIAuthTabCallback3);
            return null;
        }
        int iIAuthTabCallback4 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback5 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback6 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback4, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -577433282, iIAuthTabCallback5, new Object[]{function1, obj}, 577433309, iIAuthTabCallback6);
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 17;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallbackStub(function1, obj);
        int i4 = extraCommand + 67;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ String IAuthTabCallbackStub(FeedV2Fragment feedV2Fragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 71;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        String strOnActivityLayout = onActivityLayout(feedV2Fragment);
        int i4 = isEngagementSignalsApiAvailable + 83;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return strOnActivityLayout;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 3;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        readTypedObject(function1, obj);
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
    }

    public static /* synthetic */ void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 91;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        extraCallback(function1, obj);
        int i4 = extraCommand + 91;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ logEvent IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 65;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return onActivityLayout(function1, obj);
        }
        onActivityLayout(function1, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 101;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        onMinimized(function1, obj);
        int i4 = isEngagementSignalsApiAvailable + 39;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 5;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        onActivityResized(function1, obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 105;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        onMessageChannelReady(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = isEngagementSignalsApiAvailable + 21;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 55;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallbackStubProxy(function1, obj);
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 45;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        onPostMessage(function1, obj);
        if (i3 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 9;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        onRelationshipValidationResult(function1, obj);
        int i4 = isEngagementSignalsApiAvailable + 79;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(FeedV2Fragment feedV2Fragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = extraCommand + 107;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(feedV2Fragment, bool);
        int i4 = extraCommand + 69;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(FeedV2Fragment feedV2Fragment, Throwable th) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 13;
        extraCommand = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback(feedV2Fragment, th);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(feedV2Fragment, th);
        int i3 = isEngagementSignalsApiAvailable + 9;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(FeedV2Fragment feedV2Fragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 105;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(feedV2Fragment, iEngagementSignalsCallbackDefault);
        int i4 = extraCommand + 71;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(FeedV2Fragment feedV2Fragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = extraCommand + 1;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            return (Unit) onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1549246267, iIAuthTabCallback2, new Object[]{feedV2Fragment, deserializeurinullablecollection}, 1549246273, iIAuthTabCallback3);
        }
        int iIAuthTabCallback4 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback5 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback6 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(FeedV2Fragment feedV2Fragment, getTopProxy gettopproxy) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 63;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(feedV2Fragment, gettopproxy);
        int i4 = isEngagementSignalsApiAvailable + 81;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 109;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(th);
        int i4 = extraCommand + 103;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ setUnwindFunction onExtraCallback(FeedV2Fragment feedV2Fragment) {
        int i = 2 % 2;
        int i2 = extraCommand + 81;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        setUnwindFunction setunwindfunctionOnPostMessage = onPostMessage(feedV2Fragment);
        int i4 = extraCommand + 79;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return setunwindfunctionOnPostMessage;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 73;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallbackDefault(function1, obj);
        int i4 = extraCommand + 105;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onExtraCallback(Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 75;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(obj);
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        return zIAuthTabCallback;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        FeedV2Fragment feedV2Fragment = (FeedV2Fragment) objArr[0];
        Unit unit = (Unit) objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 39;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(feedV2Fragment, unit);
        }
        onWarmupCompleted(feedV2Fragment, unit);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(FeedV2Fragment feedV2Fragment, EventServiceImplExternalSyntheticLambda1 eventServiceImplExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 39;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(feedV2Fragment, eventServiceImplExternalSyntheticLambda1);
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(FeedV2Fragment feedV2Fragment, deserializeUriNullableCollection deserializeurinullablecollection) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 77;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(feedV2Fragment, deserializeurinullablecollection);
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        int i5 = extraCommand + 19;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(FeedV2Fragment feedV2Fragment, logEvent logevent) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 105;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(feedV2Fragment, logevent);
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        int i5 = extraCommand + 37;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = extraCommand + 113;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {th};
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback4 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        if (i3 != 0) {
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(iIAuthTabCallback, iIAuthTabCallback4, 108691261, iIAuthTabCallback2, objArr, -108691240, iIAuthTabCallback3);
        int i4 = isEngagementSignalsApiAvailable + 119;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(FeedV2Fragment feedV2Fragment) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 113;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1876217048, iIAuthTabCallback2, new Object[]{feedV2Fragment}, 1876217061, iIAuthTabCallback3);
        int i4 = extraCommand + 77;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        String queryParameter;
        String queryParameter2;
        boolean z;
        boolean z2;
        int i7;
        int i8 = ~i3;
        int i9 = ~i;
        int i10 = ~(i8 | i9);
        int i11 = i5 | i10;
        int i12 = ~i5;
        int i13 = i10 | (~(i12 | i3));
        int i14 = (~(i | i8 | i5)) | (~(i9 | i12 | i8));
        int i15 = i3 + i5 + i4 + ((-619979367) * i6) + (68302741 * i2);
        int i16 = i15 * i15;
        int i17 = ((i3 * (-96142684)) - 56799437) + (i5 * (-96142684)) + (i11 * 1642) + (i13 * (-821)) + (i14 * 821) + ((-96141863) * i4) + ((-1380774991) * i6) + ((-1175232947) * i2) + (i16 * (-118947840));
        switch ((i3 * 561304900) + 382271488 + (561304900 * i5) + ((-1585293958) * i11) + (792646979 * i13) + ((-792646979) * i14) + ((-231342080) * i4) + (1615200256 * i6) + ((-1821507584) * i2) + (428933120 * i16) + (i17 * i17 * (-1369505792))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                FeedV2Fragment feedV2Fragment = (FeedV2Fragment) objArr[0];
                Throwable th = (Throwable) objArr[1];
                int i18 = 2 % 2;
                int i19 = isEngagementSignalsApiAvailable + 61;
                extraCommand = i19 % 128;
                int i20 = i19 % 2;
                Intrinsics.checkNotNull(th);
                getParamImp.onWarmupCompleted(th, feedV2Fragment.getContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i21 = isEngagementSignalsApiAvailable + 15;
                extraCommand = i21 % 128;
                int i22 = i21 % 2;
                return unit;
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                FeedV2Fragment feedV2Fragment2 = (FeedV2Fragment) objArr[0];
                String str = (String) objArr[1];
                int i23 = 2 % 2;
                if (((Boolean) enableModuleArgumentNSNullConversionIOS.IAuthTabCallback(new Object[]{enableModuleArgumentNSNullConversionIOS.asInterface, str}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 759069605, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -759069605)).booleanValue()) {
                    Uri uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{str});
                    String host = uri != null ? uri.getHost() : null;
                    Object[] objArr2 = new Object[1];
                    a(new char[]{'\t', '\r', 18, 16, 1, 20, 16, 23, '\r', '\t'}, (byte) (7 - View.resolveSizeAndState(0, 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 11, objArr2);
                    if (Intrinsics.areEqual(host, ((String) objArr2[0]).intern()) && Intrinsics.areEqual(feedV2Fragment2.ICustomTabsCallback(), "/all-tab")) {
                        if (((Boolean) DERSet.onExtraCallback(1910695723, new Object[]{DERSet.onExtraCallback}, -1910695710, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback())).booleanValue()) {
                            Uri uri2 = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{str});
                            if (uri2 != null) {
                                Object[] objArr3 = new Object[1];
                                a(new char[]{20, 5, 13829}, (byte) (15 - TextUtils.getOffsetAfter("", 0)), 3 - ExpandableListView.getPackedPositionType(0L), objArr3);
                                String queryParameter3 = uri2.getQueryParameter(((String) objArr3[0]).intern());
                                Uri uri3 = queryParameter3 != null ? (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{queryParameter3}) : null;
                                if (uri3 != null) {
                                    Object[] objArr4 = new Object[1];
                                    a(new char[]{20, 2, 20, 6, '\n', 1, 14, 24, 13839, 13839, '\n', 17, 18, 23, 24, '\r', 13817}, (byte) (22 - TextUtils.getCapsMode("", 0, 0)), 17 - Drawable.resolveOpacity(0, 0), objArr4);
                                    queryParameter = uri3.getQueryParameter(((String) objArr4[0]).intern());
                                } else {
                                    queryParameter = null;
                                }
                                if (queryParameter != null) {
                                    int i24 = extraCommand + 81;
                                    isEngagementSignalsApiAvailable = i24 % 128;
                                    int i25 = i24 % 2;
                                    SessionTrackerb.IAuthTabCallback(feedV2Fragment2.onTransact(), feedV2Fragment2.requireActivity(), str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                                } else if (uri3 == null || (queryParameter2 = uri3.getQueryParameter("nextLandingUrl")) == null) {
                                    SessionTrackerb.IAuthTabCallback(feedV2Fragment2.onTransact(), feedV2Fragment2.requireActivity(), str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                                    int i26 = isEngagementSignalsApiAvailable + 97;
                                    extraCommand = i26 % 128;
                                    int i27 = i26 % 2;
                                } else {
                                    boolean zIAuthTabCallback = SessionTrackerb.IAuthTabCallback(feedV2Fragment2.onTransact(), feedV2Fragment2.requireActivity(), convertAnyToMap.IAuthTabCallback(convertAnyToMap.IAuthTabCallback("securitiestoss://" + queryParameter2, "_transparent", "adaptive"), "_isTransitionEnabled", "false"), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                                    if ((zIAuthTabCallback ? Boolean.valueOf(zIAuthTabCallback) : null) == null) {
                                    }
                                }
                            }
                        }
                    } else {
                        SessionTrackerb.IAuthTabCallback(feedV2Fragment2.onTransact(), feedV2Fragment2.requireActivity(), str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                    }
                }
                feedV2Fragment2.ICustomTabsCallbackDefault = true;
                return null;
            case 10:
                return asBinder(objArr);
            case 11:
                return IAuthTabCallbackStub(objArr);
            case 12:
                return access000(objArr);
            case 13:
                FeedV2Fragment feedV2Fragment3 = (FeedV2Fragment) objArr[0];
                int i28 = 2 % 2;
                int i29 = extraCommand + 79;
                isEngagementSignalsApiAvailable = i29 % 128;
                int i30 = i29 % 2;
                String str2 = feedV2Fragment3.asInterface;
                String strOnActivityLayout = feedV2Fragment3.onActivityLayout();
                if (i30 != 0) {
                    z = false;
                    z2 = true;
                    i7 = 97;
                } else {
                    z = true;
                    z2 = false;
                    i7 = 20;
                }
                onWarmupCompleted(feedV2Fragment3, str2, strOnActivityLayout, null, z, z2, i7, null);
                return null;
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            case 15:
                String str3 = (String) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
                InboxV2Resp inboxV2Resp = (InboxV2Resp) objArr[3];
                int i31 = 2 % 2;
                int i32 = isEngagementSignalsApiAvailable + 37;
                extraCommand = i32 % 128;
                int i33 = i32 % 2;
                logEvent logevent = (logEvent) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1899186243, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{str3, Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2), inboxV2Resp}, -1899186218, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
                int i34 = extraCommand + 3;
                isEngagementSignalsApiAvailable = i34 % 128;
                int i35 = i34 % 2;
                return logevent;
            case 16:
                return access100(objArr);
            case 17:
                return getInterfaceDescriptor(objArr);
            case 18:
                return IAuthTabCallback_Parcel(objArr);
            case 19:
                return extraCallback(objArr);
            case 20:
                FeedV2Fragment feedV2Fragment4 = (FeedV2Fragment) objArr[0];
                getClientExtendConfig getclientextendconfig = (getClientExtendConfig) objArr[1];
                int i36 = 2 % 2;
                int i37 = isEngagementSignalsApiAvailable + 35;
                int i38 = i37 % 128;
                extraCommand = i38;
                int i39 = i37 % 2;
                feedV2Fragment4.ICustomTabsCallbackStubProxy = getclientextendconfig;
                int i40 = i38 + 57;
                isEngagementSignalsApiAvailable = i40 % 128;
                int i41 = i40 % 2;
                return null;
            case 21:
                return writeTypedObject(objArr);
            case 22:
                return readTypedObject(objArr);
            case 23:
                return ICustomTabsCallback(objArr);
            case 24:
                return extraCallbackWithResult(objArr);
            case 25:
                return onMinimized(objArr);
            case R$styleable.CameraView_cameraPictureMetering /* 26 */:
                return onActivityLayout(objArr);
            case 27:
                return onMessageChannelReady(objArr);
            case 28:
                return onPostMessage(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ String onNavigationEvent(FeedV2Fragment feedV2Fragment) {
        int i = 2 % 2;
        int i2 = extraCommand + 51;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        String strOnActivityResized = onActivityResized(feedV2Fragment);
        int i4 = extraCommand + 81;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return strOnActivityResized;
    }

    public static /* synthetic */ Unit onNavigationEvent(FeedV2Fragment feedV2Fragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 97;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 636168311, iIAuthTabCallback2, new Object[]{feedV2Fragment, bool}, -636168308, iIAuthTabCallback3);
        int i4 = isEngagementSignalsApiAvailable + 125;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(FeedV2Fragment feedV2Fragment, Throwable th) {
        int i = 2 % 2;
        int i2 = extraCommand + 107;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIAuthTabCallback4 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback5 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback6 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(iIAuthTabCallback4, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1659761694, iIAuthTabCallback5, new Object[]{feedV2Fragment, th}, 1659761698, iIAuthTabCallback6);
        int i3 = isEngagementSignalsApiAvailable + 119;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 23;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(th);
        int i4 = isEngagementSignalsApiAvailable + 43;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 113;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject(function1, obj);
        int i4 = extraCommand + 63;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 123;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        onUnminimized(function1, obj);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 125;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        extraCallbackWithResult(function1, obj);
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(FeedV2Fragment feedV2Fragment, TdsResultV0View tdsResultV0View, View view) {
        int i = 2 % 2;
        int i2 = extraCommand + 121;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(feedV2Fragment, tdsResultV0View, view);
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(FeedV2Fragment feedV2Fragment, Throwable th) {
        int i = 2 % 2;
        int i2 = extraCommand + 63;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(feedV2Fragment, th);
        }
        onExtraCallbackWithResult(feedV2Fragment, th);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(FeedV2Fragment feedV2Fragment, logEvent logevent) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 119;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(feedV2Fragment, logevent);
        int i4 = extraCommand + 55;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 15;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            return (Unit) onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1289261850, iIAuthTabCallback2, new Object[]{th}, 1289261873, iIAuthTabCallback3);
        }
        int iIAuthTabCallback4 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback5 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback6 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(FeedV2Fragment feedV2Fragment) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 119;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        onMinimized(feedV2Fragment);
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        int i5 = isEngagementSignalsApiAvailable + 103;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = extraCommand + 115;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return 1000938L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class access100<T> implements Comparator {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            onExtraCallback = i2 % 128;
            getTopProxy gettopproxy = (getTopProxy) t;
            if (i2 % 2 != 0) {
                getCodeNameBytes.IAuthTabCallback(Integer.valueOf(gettopproxy.onExtraCallback()), Integer.valueOf(((getTopProxy) t2).onExtraCallback()));
                throw null;
            }
            int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(Integer.valueOf(gettopproxy.onExtraCallback()), Integer.valueOf(((getTopProxy) t2).onExtraCallback()));
            int i3 = onExtraCallback + 75;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return iIAuthTabCallback;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(FeedV2Fragment feedV2Fragment, boolean z) {
        int i = 2 % 2;
        int i2 = extraCommand + 47;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        feedV2Fragment.access100 = z;
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
    }

    public static final /* synthetic */ void IAuthTabCallbackStubProxy(FeedV2Fragment feedV2Fragment) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 85;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 753111797, iIAuthTabCallback2, new Object[]{feedV2Fragment}, -753111787, iIAuthTabCallback3);
            int i3 = 10 / 0;
        } else {
            int iIAuthTabCallback4 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback5 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback6 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            onNavigationEvent(iIAuthTabCallback4, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 753111797, iIAuthTabCallback5, new Object[]{feedV2Fragment}, -753111787, iIAuthTabCallback6);
        }
        int i4 = extraCommand + 57;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        FeedV2Fragment feedV2Fragment = (FeedV2Fragment) objArr[0];
        int i = 2 % 2;
        int i2 = extraCommand + 23;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        HashSet<Integer> hashSet = feedV2Fragment.extraCallback;
        int i5 = i3 + 61;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return hashSet;
    }

    public static final /* synthetic */ boolean IAuthTabCallback_Parcel(FeedV2Fragment feedV2Fragment) {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 89;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        boolean z = feedV2Fragment.onRelationshipValidationResult;
        if (i4 != 0) {
            int i5 = 16 / 0;
        }
        int i6 = i2 + 61;
        isEngagementSignalsApiAvailable = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 87 / 0;
        }
        return z;
    }

    public static final /* synthetic */ boolean ICustomTabsCallback(FeedV2Fragment feedV2Fragment) {
        int i = 2 % 2;
        int i2 = extraCommand + 107;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        boolean z = feedV2Fragment.getInterfaceDescriptor;
        int i5 = i3 + 63;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public static final /* synthetic */ String access000(FeedV2Fragment feedV2Fragment) {
        int i = 2 % 2;
        int i2 = extraCommand + 121;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return feedV2Fragment.onActivityLayout();
        }
        feedV2Fragment.onActivityLayout();
        throw null;
    }

    public static final /* synthetic */ String access100(FeedV2Fragment feedV2Fragment) {
        int i = 2 % 2;
        int i2 = extraCommand + 35;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {feedV2Fragment};
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback4 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        if (i3 != 0) {
            throw null;
        }
        String str = (String) onNavigationEvent(iIAuthTabCallback, iIAuthTabCallback4, 1311589470, iIAuthTabCallback2, objArr, -1311589442, iIAuthTabCallback3);
        int i4 = isEngagementSignalsApiAvailable + 107;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static final /* synthetic */ setRenderId asBinder(FeedV2Fragment feedV2Fragment) {
        int i = 2 % 2;
        int i2 = extraCommand + 89;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        setRenderId setrenderidWriteTypedObject = feedV2Fragment.writeTypedObject();
        int i4 = extraCommand + 43;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return setrenderidWriteTypedObject;
    }

    public static final /* synthetic */ String asInterface(FeedV2Fragment feedV2Fragment) {
        int i = 2 % 2;
        int i2 = extraCommand + 85;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        String str = feedV2Fragment.asInterface;
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return str;
    }

    public static final /* synthetic */ boolean extraCallback(FeedV2Fragment feedV2Fragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 83;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        boolean z = feedV2Fragment.extraCallbackWithResult;
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        return z;
    }

    public static final /* synthetic */ boolean extraCallbackWithResult(FeedV2Fragment feedV2Fragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 21;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        boolean z = feedV2Fragment.IAuthTabCallbackStubProxy;
        int i5 = i2 + 35;
        extraCommand = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String getInterfaceDescriptor(FeedV2Fragment feedV2Fragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 55;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            feedV2Fragment.ICustomTabsCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strICustomTabsCallback = feedV2Fragment.ICustomTabsCallback();
        int i3 = extraCommand + 101;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        return strICustomTabsCallback;
    }

    public static final /* synthetic */ void onExtraCallback(FeedV2Fragment feedV2Fragment, LinearLayoutManager linearLayoutManager) {
        int i = 2 % 2;
        int i2 = extraCommand + 117;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        feedV2Fragment.onExtraCallbackWithResult(linearLayoutManager);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = isEngagementSignalsApiAvailable + 29;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onExtraCallback(FeedV2Fragment feedV2Fragment, TossIncomeNotificationSettingDto tossIncomeNotificationSettingDto) {
        int i = 2 % 2;
        int i2 = extraCommand + 45;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        feedV2Fragment.access000 = tossIncomeNotificationSettingDto;
        if (i3 != 0) {
            int i4 = 12 / 0;
        }
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(FeedV2Fragment feedV2Fragment, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 19;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        feedV2Fragment.onExtraCallbackWithResult(str);
        int i4 = extraCommand + 57;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(FeedV2Fragment feedV2Fragment, Pair pair) {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 125;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        feedV2Fragment.onWarmupCompleted = pair;
        int i5 = i2 + 61;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(FeedV2Fragment feedV2Fragment, boolean z) {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 79;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        feedV2Fragment.getInterfaceDescriptor = z;
        int i5 = i2 + 79;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        FeedV2Fragment feedV2Fragment = (FeedV2Fragment) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = extraCommand + 103;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        Object obj = null;
        feedV2Fragment.IAuthTabCallbackStubProxy = zBooleanValue;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 35;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final /* synthetic */ void onNavigationEvent(FeedV2Fragment feedV2Fragment, boolean z) {
        int i = 2 % 2;
        int i2 = extraCommand + 17;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        feedV2Fragment.onRelationshipValidationResult = z;
        if (i3 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ getCornerRadius onTransact(FeedV2Fragment feedV2Fragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 117;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<logEvent> getcornerradius = feedV2Fragment.IAuthTabCallbackStub;
        int i5 = i2 + 119;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
        return getcornerradius;
    }

    public static final /* synthetic */ void writeTypedObject(FeedV2Fragment feedV2Fragment) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 57;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -608724895, iIAuthTabCallback2, new Object[]{feedV2Fragment}, 608724921, iIAuthTabCallback3);
        int i4 = extraCommand + 45;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public FeedV2Fragment() {
        super(R.layout.fragment_feed_v2);
        this.IAuthTabCallbackStubProxy = true;
        this.extraCallbackWithResult = true ^ addExtra.writeTypedObject(PlayerErrorCode.onWarmupCompleted);
        this.onNavigationEvent = preFillDefault.onExtraCallbackWithResult(this, onNavigationEvent.onExtraCallbackWithResult);
        this.extraCallback = new HashSet<>();
        getTimestampBytes<Boolean> gettimestampbytesIAuthTabCallback = getTimestampBytes.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(gettimestampbytesIAuthTabCallback, "");
        this.onTransact = gettimestampbytesIAuthTabCallback;
        getTimestampBytes<logEvent> gettimestampbytesIAuthTabCallback2 = getTimestampBytes.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(gettimestampbytesIAuthTabCallback2, "");
        this.IAuthTabCallbackDefault = gettimestampbytesIAuthTabCallback2;
        this.IAuthTabCallbackStub = setShine.onNavigationEvent((Object) null);
        this.onPostMessage = LazyKt.onExtraCallbackWithResult(new FeedV2Fragment$.ExternalSyntheticLambda0(this));
        this.onActivityLayout = LazyKt.onExtraCallbackWithResult(new FeedV2Fragment$.ExternalSyntheticLambda1(this));
        this.asInterface = "";
        this.onMessageChannelReady = LazyKt.onExtraCallbackWithResult(new FeedV2Fragment$.ExternalSyntheticLambda2(this));
        this.asBinder = CollectionsKt.emptyList();
        this.writeTypedObject = onPageExit.onNavigationEvent(this, new FeedV2Fragment$.ExternalSyntheticLambda3(this));
        this.onUnminimized = new ArrayList();
    }

    public final zzag asBinder() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 105;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        zzag zzagVar = this.tossClock;
        if (zzagVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 49;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return zzagVar;
    }

    public final SessionTrackerb onTransact() {
        int i = 2 % 2;
        int i2 = extraCommand + 119;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = extraCommand + 13;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return null;
    }

    public final setSerializeConfig IAuthTabCallbackDefault() {
        int i = 2 % 2;
        setSerializeConfig setserializeconfig = this.pushTokenEnableDataSource;
        Object obj = null;
        if (setserializeconfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = extraCommand + 53;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 15;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return setserializeconfig;
    }

    public final trackCheckout onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCommand + 95;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        trackCheckout trackcheckout = this.notificationHelper;
        if (trackcheckout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = extraCommand + 13;
            isEngagementSignalsApiAvailable = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 15;
        int i6 = i5 % 128;
        extraCommand = i6;
        if (i5 % 2 == 0) {
            throw null;
        }
        int i7 = i6 + 21;
        isEngagementSignalsApiAvailable = i7 % 128;
        int i8 = i7 % 2;
        return trackcheckout;
    }

    public final AppLovinSdkInitializationConfigurationImpl onExtraCallback() {
        int i = 2 % 2;
        AppLovinSdkInitializationConfigurationImpl appLovinSdkInitializationConfigurationImpl = this.inbox;
        Object obj = null;
        if (appLovinSdkInitializationConfigurationImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = extraCommand;
        int i3 = i2 + 45;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 89;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return appLovinSdkInitializationConfigurationImpl;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        FeedV2Fragment feedV2Fragment = (FeedV2Fragment) objArr[0];
        int i = 2 % 2;
        int i2 = extraCommand + 51;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        updateLoadParamUrl updateloadparamurl = feedV2Fragment.messengerApi;
        if (updateloadparamurl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 77;
        int i6 = i5 % 128;
        extraCommand = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 99;
        isEngagementSignalsApiAvailable = i8 % 128;
        int i9 = i8 % 2;
        return updateloadparamurl;
    }

    public final decapitalize IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCommand + 43;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        decapitalize decapitalizeVar = this.tossIncomeNotificationStatusApi;
        if (decapitalizeVar != null) {
            return decapitalizeVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = isEngagementSignalsApiAvailable + 59;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        FeedV2Fragment feedV2Fragment = (FeedV2Fragment) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 75;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        updateAdInfo updateadinfo = feedV2Fragment.messageCompanyParser;
        Object obj = null;
        if (updateadinfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 103;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i3 + 45;
        isEngagementSignalsApiAvailable = i7 % 128;
        if (i7 % 2 == 0) {
            return updateadinfo;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r4 = im.toss.features.feed.normal.FeedV2Fragment.extraCommand + 89;
        im.toss.features.feed.normal.FeedV2Fragment.isEngagementSignalsApiAvailable = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        FeedV2Fragment feedV2Fragment = (FeedV2Fragment) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 61;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        getPricingPhaseList getpricingphaselist = feedV2Fragment.region;
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
    }

    public final setSerializerFeatures onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCommand + 121;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        setSerializerFeatures setserializerfeatures = this.marketingNotificationAvailability;
        if (setserializerfeatures != null) {
            int i5 = i3 + 9;
            extraCommand = i5 % 128;
            int i6 = i5 % 2;
            return setserializerfeatures;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = extraCommand + 61;
        isEngagementSignalsApiAvailable = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    private final boolean onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = extraCommand + 15;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {DERSet.onExtraCallback};
        if (i3 == 0) {
            int iOnExtraCallback = getKekid.onExtraCallback();
            return ((Boolean) DERSet.onExtraCallback(30347436, objArr, -30347430, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback)).booleanValue();
        }
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        ((Boolean) DERSet.onExtraCallback(30347436, objArr, -30347430, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback2)).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function1<View, setRenderId> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 115;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        onNavigationEvent() {
            super(1, setRenderId.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/feed/databinding/FragmentFeedV2Binding;", 0);
        }

        public final setRenderId IAuthTabCallback(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                setRenderId.onNavigationEvent(view);
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(view, "");
            setRenderId setrenderidOnNavigationEvent = setRenderId.onNavigationEvent(view);
            int i3 = onNavigationEvent + 47;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return setrenderidOnNavigationEvent;
            }
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            setRenderId setrenderidIAuthTabCallback = IAuthTabCallback((View) obj);
            int i4 = onNavigationEvent + 19;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return setrenderidIAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    private final setRenderId writeTypedObject() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 61;
        extraCommand = i2 % 128;
        SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = i2 % 2 == 0 ? this.onNavigationEvent.onExtraCallbackWithResult(this, IAuthTabCallback[1]) : this.onNavigationEvent.onExtraCallbackWithResult(this, IAuthTabCallback[0]);
        Intrinsics.checkNotNullExpressionValue(searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult, "");
        setRenderId setrenderid = (setRenderId) searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        int i3 = extraCommand + 65;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 80 / 0;
        }
        return setrenderid;
    }

    private final String ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 25;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = (String) this.onPostMessage.getValue();
        int i3 = isEngagementSignalsApiAvailable + 107;
        extraCommand = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 56 / 0;
        }
        return str;
    }

    private static final String onActivityResized(FeedV2Fragment feedV2Fragment) {
        String string;
        int i = 2 % 2;
        int i2 = extraCommand + 101;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            feedV2Fragment.getArguments();
            throw null;
        }
        Bundle arguments = feedV2Fragment.getArguments();
        if (arguments != null && (string = arguments.getString("prev_event")) != null) {
            int i3 = isEngagementSignalsApiAvailable + 15;
            extraCommand = i3 % 128;
            if (i3 % 2 != 0) {
                return string;
            }
            throw null;
        }
        Bundle arguments2 = feedV2Fragment.getArguments();
        if (arguments2 != null) {
            return arguments2.getString("prevEvent");
        }
        int i4 = extraCommand + 97;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final String onActivityLayout(FeedV2Fragment feedV2Fragment) {
        int i = 2 % 2;
        int i2 = extraCommand + 27;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            feedV2Fragment.getArguments();
            throw null;
        }
        Bundle arguments = feedV2Fragment.getArguments();
        if (arguments == null) {
            return null;
        }
        String string = arguments.getString("prevEventPlatform");
        int i3 = isEngagementSignalsApiAvailable + 27;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        FeedV2Fragment feedV2Fragment = (FeedV2Fragment) objArr[0];
        int i = 2 % 2;
        int i2 = extraCommand + 99;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) feedV2Fragment.onActivityLayout.getValue();
        int i4 = extraCommand + 73;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private final void onExtraCallbackWithResult(String str) throws Throwable {
        int i = 2 % 2;
        Object obj = null;
        if (getActivity() != null) {
            this.ICustomTabsCallbackStubProxy = null;
            getRenderById getrenderbyid = this.onExtraCallbackWithResult;
            if (getrenderbyid != null) {
                getRenderById.onNavigationEvent(new Object[]{getrenderbyid}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -1907309341, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 1907309341);
                int i2 = extraCommand + 91;
                isEngagementSignalsApiAvailable = i2 % 128;
                int i3 = i2 % 2;
            }
            IAuthTabCallback(str);
        }
        createEngine.IAuthTabCallback.onWarmupCompleted(str);
        this.asInterface = str;
        int i4 = extraCommand + 39;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final String onActivityLayout() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 71;
        int i3 = i2 % 128;
        extraCommand = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        getClientExtendConfig getclientextendconfig = this.ICustomTabsCallbackStubProxy;
        if (getclientextendconfig == null) {
            return null;
        }
        int i4 = i3 + 1;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return getclientextendconfig.IAuthTabCallback();
        }
        getclientextendconfig.IAuthTabCallback();
        throw null;
    }

    private final setUnwindFunction extraCallback() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 107;
        extraCommand = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        setUnwindFunction setunwindfunction = (setUnwindFunction) this.onMessageChannelReady.getValue();
        int i3 = isEngagementSignalsApiAvailable + 3;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0) {
            return setunwindfunction;
        }
        obj.hashCode();
        throw null;
    }

    private static final setUnwindFunction onPostMessage(FeedV2Fragment feedV2Fragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 51;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Context contextRequireContext = feedV2Fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        setUnwindFunction setunwindfunctionOnWarmupCompleted = performOneTimeSetuplambda1.onWarmupCompleted(contextRequireContext);
        int i4 = isEngagementSignalsApiAvailable + 83;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return setunwindfunctionOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback(List<getTopProxy> list) {
        int i = 2 % 2;
        this.asBinder = list;
        List listSortedWith = CollectionsKt.sortedWith(list, new access100());
        setUnwindFunction setunwindfunctionExtraCallback = extraCallback();
        List<getTopProxy> list2 = listSortedWith;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (getTopProxy gettopproxy : list2) {
            arrayList.add(new performOneTimeSetup(gettopproxy.onNavigationEvent(), gettopproxy.onWarmupCompleted(), (Integer) null, new FeedV2Fragment$.ExternalSyntheticLambda30(this, gettopproxy), 4, (DefaultConstructorMarker) null));
        }
        setUnwindFunction.IAuthTabCallback(setunwindfunctionExtraCallback, arrayList, (Function1) null, 2, (Object) null);
        int i2 = isEngagementSignalsApiAvailable + 115;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(FeedV2Fragment feedV2Fragment, getTopProxy gettopproxy) {
        String strIAuthTabCallback;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 1;
        extraCommand = i2 % 128;
        Object obj = null;
        String str = "";
        if (i2 % 2 == 0) {
            strIAuthTabCallback = gettopproxy.IAuthTabCallback();
            int i3 = 10 / 0;
            if (strIAuthTabCallback == null) {
                int i4 = extraCommand + 121;
                isEngagementSignalsApiAvailable = i4 % 128;
                if (i4 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                strIAuthTabCallback = "";
            }
        } else {
            strIAuthTabCallback = gettopproxy.IAuthTabCallback();
            if (strIAuthTabCallback == null) {
            }
        }
        feedV2Fragment.onWarmupCompleted(strIAuthTabCallback);
        String strIAuthTabCallback2 = gettopproxy.IAuthTabCallback();
        if (strIAuthTabCallback2 == null) {
            strIAuthTabCallback2 = "";
        }
        RVEngine.onExtraCallbackWithResult(strIAuthTabCallback2);
        createEngine createengine = createEngine.IAuthTabCallback;
        Iterator<T> it = feedV2Fragment.asBinder.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((getTopProxy) next).IAuthTabCallback(), gettopproxy.IAuthTabCallback())) {
                obj = next;
                break;
            }
        }
        getTopProxy gettopproxy2 = (getTopProxy) obj;
        if (gettopproxy2 != null) {
            int i5 = extraCommand + 81;
            isEngagementSignalsApiAvailable = i5 % 128;
            int i6 = i5 % 2;
            String strOnNavigationEvent = gettopproxy2.onNavigationEvent();
            if (strOnNavigationEvent == null) {
                int i7 = isEngagementSignalsApiAvailable + 75;
                extraCommand = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 81 / 0;
                }
            } else {
                str = strOnNavigationEvent;
            }
        }
        createengine.onTransact(str);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(FeedV2Fragment feedV2Fragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = extraCommand + 31;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        boolean zOnNavigationEvent = feedV2Fragment.IAuthTabCallbackDefault().onNavigationEvent();
        getRenderById getrenderbyid = feedV2Fragment.onExtraCallbackWithResult;
        if (getrenderbyid != null) {
            int i4 = extraCommand + 3;
            isEngagementSignalsApiAvailable = i4 % 128;
            EngineUtils1 engineUtils1 = null;
            if (i4 % 2 != 0) {
                boolean z = CollectionsKt.firstOrNull(getrenderbyid.onExtraCallbackWithResult()) instanceof EngineUtils1;
                engineUtils1.hashCode();
                throw null;
            }
            Object objFirstOrNull = CollectionsKt.firstOrNull(getrenderbyid.onExtraCallbackWithResult());
            if (objFirstOrNull instanceof EngineUtils1) {
                int i5 = extraCommand + 109;
                isEngagementSignalsApiAvailable = i5 % 128;
                if (i5 % 2 != 0) {
                    engineUtils1 = (EngineUtils1) objFirstOrNull;
                    int i6 = 12 / 0;
                } else {
                    engineUtils1 = (EngineUtils1) objFirstOrNull;
                }
            }
            EngineUtils1 engineUtils12 = engineUtils1;
            if (engineUtils12 != null) {
                EngineUtils1 engineUtils1OnExtraCallbackWithResult = EngineUtils1.onExtraCallbackWithResult(engineUtils12, (String) null, (List) null, false, !zOnNavigationEvent, 7, (Object) null);
                getrenderbyid.notifyItemChanged(0, engineUtils1OnExtraCallbackWithResult);
                List mutableList = CollectionsKt.toMutableList(getrenderbyid.onExtraCallbackWithResult());
                mutableList.set(0, engineUtils1OnExtraCallbackWithResult);
                getrenderbyid.onNavigationEvent(mutableList);
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        boolean z = false;
        FeedV2Fragment feedV2Fragment = (FeedV2Fragment) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = extraCommand + 97;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        feedV2Fragment.IAuthTabCallback_Parcel = zBooleanValue;
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout = feedV2Fragment.writeTypedObject().onNavigationEvent;
        if (!feedV2Fragment.IAuthTabCallbackStubProxy) {
            int i4 = isEngagementSignalsApiAvailable + 23;
            int i5 = i4 % 128;
            extraCommand = i5;
            int i6 = i4 % 2;
            if (zBooleanValue) {
                int i7 = i5 + 27;
                isEngagementSignalsApiAvailable = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            }
        }
        pillarSwipeRefreshLayout.setRefreshing(z);
        onExtraCallbackWithResult onextracallbackwithresult = feedV2Fragment.onMinimized;
        if (onextracallbackwithresult == null) {
            return null;
        }
        onextracallbackwithresult.IAuthTabCallback(zBooleanValue);
        int i9 = isEngagementSignalsApiAvailable + 53;
        extraCommand = i9 % 128;
        int i10 = i9 % 2;
        return null;
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = extraCommand + 91;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("amount", onExtraCallback().IAuthTabCallback().onWarmupCompleted(0))});
        int i4 = extraCommand + 13;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return mapIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        Object L$0;
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            asBinder asbinderCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return asbinderCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 4 / 0;
            return asbinderCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = FeedV2Fragment.this.new asBinder(access13800Var);
            int i2 = IAuthTabCallback + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 119;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            FeedV2Fragment feedV2Fragment;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                FeedV2Fragment feedV2Fragment2 = FeedV2Fragment.this;
                setSerializerFeatures setserializerfeaturesOnExtraCallbackWithResult = feedV2Fragment2.onExtraCallbackWithResult();
                this.L$0 = feedV2Fragment2;
                this.label = 1;
                Object objOnExtraCallback = setserializerfeaturesOnExtraCallbackWithResult.onExtraCallback(this);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    int i3 = IAuthTabCallback + 87;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                feedV2Fragment = feedV2Fragment2;
                obj = objOnExtraCallback;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = onNavigationEvent + 105;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                feedV2Fragment = (FeedV2Fragment) this.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            FeedV2Fragment.IAuthTabCallback(feedV2Fragment, ((Boolean) obj).booleanValue());
            FragmentActivity activity = FeedV2Fragment.this.getActivity();
            if (activity != null) {
                activity.invalidateOptionsMenu();
            }
            return Unit.INSTANCE;
        }
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int label;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = FeedV2Fragment.this.new onTransact(access13800Var);
            int i2 = onExtraCallback + 109;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return ontransact;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 41;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 123;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            String string;
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            FeedV2Fragment.IAuthTabCallbackStubProxy(FeedV2Fragment.this);
            FeedV2Fragment.writeTypedObject(FeedV2Fragment.this);
            if (!FeedV2Fragment.ICustomTabsCallback(FeedV2Fragment.this) && FeedV2Fragment.extraCallback(FeedV2Fragment.this)) {
                FeedV2Fragment.onExtraCallbackWithResult(FeedV2Fragment.this, true);
                FeedV2Fragment feedV2Fragment = FeedV2Fragment.this;
                Bundle arguments = feedV2Fragment.getArguments();
                if (arguments != null) {
                    int i4 = IAuthTabCallback + 105;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    String string2 = arguments.getString("company", "");
                    if (string2 == null) {
                        string2 = "";
                    }
                    FeedV2Fragment.onExtraCallbackWithResult(feedV2Fragment, string2);
                    FeedV2Fragment feedV2Fragment2 = FeedV2Fragment.this;
                    Bundle arguments2 = feedV2Fragment2.getArguments();
                    FeedV2Fragment.onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1195296605, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{feedV2Fragment2, new getClientExtendConfig((String) null, (arguments2 == null || (string = arguments2.getString("subCategoryCode")) == null) ? "" : string, (String) null, (Integer) null, (String) null, 0, false, 125, (DefaultConstructorMarker) null)}, 1195296625, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
                    createEngine createengine = createEngine.IAuthTabCallback;
                    createengine.onExtraCallback(FeedV2Fragment.getInterfaceDescriptor(FeedV2Fragment.this));
                    createEngine.IAuthTabCallback(new Object[]{createengine, FeedV2Fragment.access100(FeedV2Fragment.this)}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 619893434, -619893431, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback());
                    int i6 = onExtraCallback + 113;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            FeedV2Fragment feedV2Fragment3 = FeedV2Fragment.this;
            FeedV2Fragment.onWarmupCompleted(feedV2Fragment3, FeedV2Fragment.asInterface(feedV2Fragment3), FeedV2Fragment.access000(FeedV2Fragment.this), null, false, false, 28, null);
            return Unit.INSTANCE;
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 99;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i4 = isEngagementSignalsApiAvailable + 13;
            extraCommand = i4 % 128;
            int i5 = i4 % 2;
            if (arguments.getBoolean("apply_navigation_bar_inset")) {
                int i6 = isEngagementSignalsApiAvailable + 93;
                extraCommand = i6 % 128;
                int i7 = i6 % 2;
                writeTypedObject().IAuthTabCallback.setFitsSystemWindows(false);
                ConstraintLayout constraintLayoutOnNavigationEvent = writeTypedObject().onNavigationEvent();
                Intrinsics.checkNotNullExpressionValue(constraintLayoutOnNavigationEvent, "");
                disableImageViewPreallocationAndroid.onNavigationEvent(constraintLayoutOnNavigationEvent, writeTypedObject().IAuthTabCallback, writeTypedObject().onExtraCallback, (View) null, false, 12, (Object) null);
                int i8 = extraCommand + 79;
                isEngagementSignalsApiAvailable = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        if (((getPricingPhaseList) onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1741859495, iIAuthTabCallback2, new Object[]{this}, 1741859509, iIAuthTabCallback3)) != getPricingPhaseList.KR) {
            TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new asBinder(null), 3, (Object) null);
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onTransact(null), 3, (Object) null);
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = ICustomTabsCallbackStub;
        Object obj2 = null;
        if (cArr3 != null) {
            int i4 = $10 + 113;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 49;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 25 - TextUtils.indexOf((CharSequence) "", '0'), 23139 - (KeyEvent.getMaxKeyCode() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 26, 23139 - Color.alpha(0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5++;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(ICustomTabsService)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 26 - View.resolveSizeAndState(0, 0, 0), Drawable.resolveOpacity(0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $11 + 25;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 24823), 74 - (ViewConfiguration.getWindowTouchSlop() >> 8), 8088 - (Process.myPid() >> 22), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), 30 - (ViewConfiguration.getTapTimeout() >> 16), 19488 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                        int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i9];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i10 = $10 + 27;
                            $11 = i10 % 128;
                            int i11 = i10 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i13];
                        } else {
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i15];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public void onResume() {
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = extraCommand + 73;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            super/*im.toss.uikit.base.UIKitBaseFragment*/.onResume();
            throw null;
        }
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onResume();
        if (this.ICustomTabsCallbackDefault) {
            int i3 = isEngagementSignalsApiAvailable + 19;
            extraCommand = i3 % 128;
            int i4 = i3 % 2;
            createEngine createengine = createEngine.IAuthTabCallback;
            createengine.onWarmupCompleted();
            getClientExtendConfig getclientextendconfig = this.ICustomTabsCallbackStubProxy;
            if (getclientextendconfig == null || (strOnExtraCallbackWithResult = getclientextendconfig.onExtraCallbackWithResult()) == null) {
                strOnExtraCallbackWithResult = "";
            }
            createEngine.IAuthTabCallback(new Object[]{createengine, strOnExtraCallbackWithResult}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1545782882, -1545782881, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback());
            getRenderById getrenderbyid = this.onExtraCallbackWithResult;
            if (getrenderbyid != null) {
                int i5 = extraCommand + 45;
                isEngagementSignalsApiAvailable = i5 % 128;
                int i6 = i5 % 2;
                getRenderById.onNavigationEvent(new Object[]{getrenderbyid}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -1907309341, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 1907309341);
                getrenderbyid.notifyDataSetChanged();
            }
        }
        if (Intrinsics.areEqual(this.asInterface, "")) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new asInterface(this, (access13800) null), 3, (Object) null);
        }
        if (this.IAuthTabCallbackStubProxy) {
            return;
        }
        this.onRelationshipValidationResult = true;
        onWarmupCompleted(this, this.asInterface, onActivityLayout(), null, false, false, 28, null);
        int i7 = isEngagementSignalsApiAvailable + 115;
        extraCommand = i7 % 128;
        int i8 = i7 % 2;
    }

    static /* synthetic */ void onWarmupCompleted(FeedV2Fragment feedV2Fragment, String str, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = isEngagementSignalsApiAvailable + 41;
            extraCommand = i3 % 128;
            int i4 = i3 % 2;
            str3 = null;
        }
        String str4 = str3;
        if ((i & 8) != 0) {
            int i5 = extraCommand + 63;
            isEngagementSignalsApiAvailable = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if ((i & 16) != 0) {
            int i7 = extraCommand + 91;
            isEngagementSignalsApiAvailable = i7 % 128;
            int i8 = i7 % 2;
            z2 = false;
        }
        onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 391681152, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{feedV2Fragment, str, str2, str4, Boolean.valueOf(z), Boolean.valueOf(z2)}, -391681141, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final void onMessageChannelReady(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 87;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = isEngagementSignalsApiAvailable + 51;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(FeedV2Fragment feedV2Fragment, deserializeUriNullableCollection deserializeurinullablecollection) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 67;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1631989959, iIAuthTabCallback2, new Object[]{feedV2Fragment, true}, 1631989960, iIAuthTabCallback3);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 45;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) throws Throwable {
        FeedV2Fragment feedV2Fragment = (FeedV2Fragment) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 95;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1631989959, iIAuthTabCallback2, new Object[]{feedV2Fragment, false}, 1631989960, iIAuthTabCallback3);
        } else {
            int iIAuthTabCallback4 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback5 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback6 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            onNavigationEvent(iIAuthTabCallback4, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1631989959, iIAuthTabCallback5, new Object[]{feedV2Fragment, false}, 1631989960, iIAuthTabCallback6);
        }
        int i3 = extraCommand + 117;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 20 / 0;
        }
        return null;
    }

    private static final logEvent onActivityLayout(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 93;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (logEvent) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        logEvent logevent = (logEvent) function1.invoke(obj);
        int i3 = 68 / 0;
        return logevent;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        String str = (String) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        InboxV2Resp inboxV2Resp = (InboxV2Resp) objArr[3];
        int i = 2 % 2;
        int i2 = extraCommand + 39;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(inboxV2Resp, "");
            logEvent logeventOnExtraCallbackWithResult = getUserAgentSuffix.onExtraCallbackWithResult(inboxV2Resp);
            logeventOnExtraCallbackWithResult.onNavigationEvent(str);
            Object[] objArr2 = {logeventOnExtraCallbackWithResult, Boolean.valueOf(zBooleanValue)};
            logEvent.onExtraCallbackWithResult(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -599780806, objArr2, 599780807);
            logeventOnExtraCallbackWithResult.onExtraCallback(zBooleanValue2);
            return logeventOnExtraCallbackWithResult;
        }
        Intrinsics.checkNotNullParameter(inboxV2Resp, "");
        logEvent logeventOnExtraCallbackWithResult2 = getUserAgentSuffix.onExtraCallbackWithResult(inboxV2Resp);
        logeventOnExtraCallbackWithResult2.onNavigationEvent(str);
        Object[] objArr3 = {logeventOnExtraCallbackWithResult2, Boolean.valueOf(zBooleanValue)};
        logEvent.onExtraCallbackWithResult(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -599780806, objArr3, 599780807);
        logeventOnExtraCallbackWithResult2.onExtraCallback(zBooleanValue2);
        int i3 = 67 / 0;
        return logeventOnExtraCallbackWithResult2;
    }

    private static final void onActivityResized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 71;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = extraCommand + 89;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallback(FeedV2Fragment feedV2Fragment, logEvent logevent) {
        int i = 2 % 2;
        int i2 = extraCommand + 33;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        feedV2Fragment.onActivityResized = logevent.onExtraCallback();
        feedV2Fragment.IAuthTabCallbackStub.onNavigationEvent(logevent);
        feedV2Fragment.IAuthTabCallbackDefault.onExtraCallback(logevent);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 95;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onRelationshipValidationResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 85;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCommand + 3;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallbackWithResult(FeedV2Fragment feedV2Fragment, Throwable th) {
        int i = 2 % 2;
        feedV2Fragment.IAuthTabCallbackDefault.onExtraCallback(new logEvent((List) null, (Integer) null, (List) null, (List) null, (Integer) null, 31, (DefaultConstructorMarker) null));
        feedV2Fragment.onTransact.onExtraCallback(Boolean.TRUE);
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("FeedV2Fragment", th);
        Unit unit = Unit.INSTANCE;
        int i2 = isEngagementSignalsApiAvailable + 31;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 53 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        FeedV2Fragment feedV2Fragment = (FeedV2Fragment) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[5]).booleanValue();
        int i = 2 % 2;
        int i2 = extraCommand + 31;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            updateLoadParamUrl updateloadparamurl = (updateLoadParamUrl) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1841425355, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{feedV2Fragment}, 1841425357, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
            String str4 = str.length() > 0 ? str : null;
            boolean zOnMessageChannelReady = feedV2Fragment.onMessageChannelReady();
            writeRaw writerawIAuthTabCallback = updateloadparamurl.IAuthTabCallback(str4, str2, feedV2Fragment.onMessageChannelReady() ? 30 : null, Boolean.valueOf(true ^ zOnMessageChannelReady), !feedV2Fragment.onMessageChannelReady() ? null : str3);
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new IAuthTabCallbackDefault(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback2.onExtraCallback(new FeedV2Fragment$.ExternalSyntheticLambda16(new FeedV2Fragment$.ExternalSyntheticLambda15(feedV2Fragment))).onWarmupCompleted(new FeedV2Fragment$.ExternalSyntheticLambda17(feedV2Fragment)).onWarmupCompleted(new FeedV2Fragment$.ExternalSyntheticLambda19(new FeedV2Fragment$.ExternalSyntheticLambda18(str, zBooleanValue, zBooleanValue2))).onNavigationEvent(new FeedV2Fragment$.ExternalSyntheticLambda21(new FeedV2Fragment$.ExternalSyntheticLambda20(feedV2Fragment)), new FeedV2Fragment$.ExternalSyntheticLambda23(new FeedV2Fragment$.ExternalSyntheticLambda22(feedV2Fragment)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            feedV2Fragment.autoDisposable(deserializeurinullablecollectionOnNavigationEvent);
            int i3 = extraCommand + 43;
            isEngagementSignalsApiAvailable = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            throw null;
        }
        str.length();
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        final FeedV2Fragment feedV2Fragment = (FeedV2Fragment) objArr[0];
        int i = 2 % 2;
        BaseActivity activity = feedV2Fragment.getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? activity : null;
        if (baseActivity != null) {
            int i2 = isEngagementSignalsApiAvailable + 47;
            extraCommand = i2 % 128;
            int i3 = i2 % 2;
            baseActivity.setSupportActionBar(feedV2Fragment.writeTypedObject().IAuthTabCallbackDefault);
            IPostMessageServiceStubProxy supportActionBar = baseActivity.getSupportActionBar();
            if (supportActionBar != null) {
                int i4 = extraCommand + 23;
                isEngagementSignalsApiAvailable = i4 % 128;
                if (i4 % 2 != 0) {
                    supportActionBar.onNavigationEvent(false);
                } else {
                    supportActionBar.onNavigationEvent(true);
                }
            }
            baseActivity.addMenuProvider(feedV2Fragment);
        }
        final Context context = feedV2Fragment.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context) { // from class: im.toss.features.feed.normal.FeedV2Fragment$initView$layoutManager$1
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public void onLayoutCompleted(RecyclerView.State state) throws Throwable {
                int i5 = 2 % 2;
                super.onLayoutCompleted(state);
                if (findFirstCompletelyVisibleItemPosition() != -1) {
                    int i6 = onExtraCallback + 37;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0) {
                        FeedV2Fragment.extraCallbackWithResult(this.onExtraCallbackWithResult);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (!(!FeedV2Fragment.extraCallbackWithResult(this.onExtraCallbackWithResult))) {
                        FeedV2Fragment.onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -818795066, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this.onExtraCallbackWithResult, false}, 818795071, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
                        FeedV2Fragment.onExtraCallback(this.onExtraCallbackWithResult, this);
                        return;
                    }
                    if (FeedV2Fragment.IAuthTabCallback_Parcel(this.onExtraCallbackWithResult)) {
                        int i7 = onExtraCallback + 95;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        ((HashSet) FeedV2Fragment.onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -111311679, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this.onExtraCallbackWithResult}, 111311697, getPreRenderJob.onNavigationEvent.IAuthTabCallback())).clear();
                        FeedV2Fragment.onExtraCallback(this.onExtraCallbackWithResult, this);
                        FeedV2Fragment.onNavigationEvent(this.onExtraCallbackWithResult, false);
                    }
                }
            }
        };
        feedV2Fragment.onExtraCallbackWithResult = new getRenderById(feedV2Fragment, feedV2Fragment);
        feedV2Fragment.writeTypedObject().onExtraCallback.setLayoutManager(linearLayoutManager);
        feedV2Fragment.writeTypedObject().onExtraCallback.addOnScrollListener(new onExtraCallback(feedV2Fragment));
        if (feedV2Fragment.onMessageChannelReady()) {
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(feedV2Fragment, linearLayoutManager);
            feedV2Fragment.writeTypedObject().onExtraCallback.addOnScrollListener(onextracallbackwithresult);
            feedV2Fragment.onMinimized = onextracallbackwithresult;
        }
        feedV2Fragment.writeTypedObject().onExtraCallback.setAdapter(feedV2Fragment.onExtraCallbackWithResult);
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout = feedV2Fragment.writeTypedObject().onNavigationEvent;
        View view = feedV2Fragment.writeTypedObject().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(view, "");
        pillarSwipeRefreshLayout.setCoordinateViews(new View[]{view});
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout2 = feedV2Fragment.writeTypedObject().onNavigationEvent;
        RecyclerView recyclerView = feedV2Fragment.writeTypedObject().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        RecyclerView recyclerView2 = feedV2Fragment.writeTypedObject().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
        pillarSwipeRefreshLayout2.setTargetView(recyclerView, recyclerView2);
        feedV2Fragment.writeTypedObject().onNavigationEvent.setOnRefreshListener(new FeedV2Fragment$.ExternalSyntheticLambda35(feedV2Fragment));
        return null;
    }

    private static final void writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 101;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = extraCommand + 43;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
    }

    private static final Unit IAuthTabCallback(FeedV2Fragment feedV2Fragment, TdsResultV0View tdsResultV0View, View view) {
        int i = 2 % 2;
        int i2 = extraCommand + 105;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        onWarmupCompleted(feedV2Fragment, feedV2Fragment.asInterface, feedV2Fragment.onActivityLayout(), null, false, false, 28, null);
        tdsResultV0View.asInterface().setLoading(true);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 77;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void extraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 1;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = extraCommand + 81;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf A[PHI: r4
      0x00cf: PHI (r4v7 im.toss.uikit.widget.TdsResultV0View) = 
      (r4v5 im.toss.uikit.widget.TdsResultV0View)
      (r4v6 im.toss.uikit.widget.TdsResultV0View)
      (r4v6 im.toss.uikit.widget.TdsResultV0View)
      (r4v6 im.toss.uikit.widget.TdsResultV0View)
      (r4v9 im.toss.uikit.widget.TdsResultV0View)
     binds: [B:8:0x002e, B:10:0x0034, B:27:0x0076, B:29:0x007a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r4 r5
      0x0030: PHI (r4v6 im.toss.uikit.widget.TdsResultV0View) = (r4v5 im.toss.uikit.widget.TdsResultV0View), (r4v9 im.toss.uikit.widget.TdsResultV0View) binds: [B:8:0x002e, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r5v2 o.getRenderById) = (r5v1 o.getRenderById), (r5v6 o.getRenderById) binds: [B:8:0x002e, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TdsResultV0View tdsResultV0View;
        getRenderById getrenderbyid;
        Object next;
        FeedV2Fragment feedV2Fragment = (FeedV2Fragment) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 123;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            tdsResultV0View = feedV2Fragment.writeTypedObject().onWarmupCompleted;
            getrenderbyid = feedV2Fragment.onExtraCallbackWithResult;
            int i3 = 52 / 0;
            if (getrenderbyid != null) {
                List listOnExtraCallbackWithResult = getrenderbyid.onExtraCallbackWithResult();
                if (listOnExtraCallbackWithResult != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listOnExtraCallbackWithResult.iterator();
                    while (it.hasNext()) {
                        int i4 = isEngagementSignalsApiAvailable + 55;
                        extraCommand = i4 % 128;
                        if (i4 % 2 == 0) {
                            next = it.next();
                            int i5 = 93 / 0;
                            if (!(next instanceof EngineUtils1)) {
                                if ((next instanceof EngineUtils2) && !(next instanceof sendPushCallBack)) {
                                    arrayList.add(next);
                                }
                            }
                        } else {
                            next = it.next();
                            if (!(next instanceof EngineUtils1)) {
                                if (next instanceof EngineUtils2) {
                                }
                            }
                        }
                    }
                    if (arrayList.size() == 0 && !feedV2Fragment.IAuthTabCallback_Parcel) {
                        Intrinsics.checkNotNull(tdsResultV0View);
                        tdsResultV0View.setVisibility(0);
                        if (bool.booleanValue()) {
                            tdsResultV0View.setLottieImageFromAsset("lottie/spot-error.json");
                            tdsResultV0View.setSubtitle(tdsResultV0View.getContext().getString(R.string.feed_load_alarm_fail_subtitle));
                            tdsResultV0View.setButtonLabel(tdsResultV0View.getContext().getString(R.string.feed_load_retry));
                            tdsResultV0View.asInterface().setLoading(false);
                            tdsResultV0View.setOnButtonClickListener(new FeedV2Fragment$.ExternalSyntheticLambda25(feedV2Fragment, tdsResultV0View));
                        } else {
                            tdsResultV0View.setLottieImageFromAsset("lottie/spot-empty.json");
                            tdsResultV0View.setSubtitle(tdsResultV0View.getContext().getString(R.string.feed_empty_alarm_subtitle));
                            tdsResultV0View.setButtonLabel("");
                        }
                    } else {
                        Intrinsics.checkNotNull(tdsResultV0View);
                        tdsResultV0View.setVisibility(8);
                    }
                }
            }
        } else {
            tdsResultV0View = feedV2Fragment.writeTypedObject().onWarmupCompleted;
            getrenderbyid = feedV2Fragment.onExtraCallbackWithResult;
            if (getrenderbyid != null) {
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 3;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("FeedV2Fragment", th);
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 7;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(FeedV2Fragment feedV2Fragment, logEvent logevent) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 51;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        if (!feedV2Fragment.onMessageChannelReady()) {
            Intrinsics.checkNotNull(logevent);
            feedV2Fragment.onExtraCallbackWithResult(logevent);
        } else {
            int i4 = extraCommand + 105;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNull(logevent);
            feedV2Fragment.onWarmupCompleted(logevent);
        }
        feedV2Fragment.onTransact.onExtraCallback(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 125;
        extraCommand = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("FeedV2Fragment", th);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("FeedV2Fragment", th);
        Unit unit2 = Unit.INSTANCE;
        int i3 = isEngagementSignalsApiAvailable + 37;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static final boolean IAuthTabCallback(Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 11;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean z = obj instanceof EventServiceImplExternalSyntheticLambda1;
        int i4 = extraCommand + 29;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(FeedV2Fragment feedV2Fragment, EventServiceImplExternalSyntheticLambda1 eventServiceImplExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = extraCommand + 55;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(feedV2Fragment, feedV2Fragment.asInterface, feedV2Fragment.onActivityLayout(), null, true, false, 20, null);
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 37;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asBinder(Throwable th) {
        int i = 2 % 2;
        int i2 = extraCommand + 7;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void extraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 35;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 47;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        int i5 = isEngagementSignalsApiAvailable + 109;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        FeedV2Fragment feedV2Fragment = (FeedV2Fragment) objArr[0];
        int i = 2 % 2;
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = feedV2Fragment.onTransact.onExtraCallbackWithResult(NetConverter3.onExtraCallback()).onExtraCallbackWithResult(new FeedV2Fragment$.ExternalSyntheticLambda6(new FeedV2Fragment$.ExternalSyntheticLambda4(feedV2Fragment)), new FeedV2Fragment$.ExternalSyntheticLambda8(new FeedV2Fragment$.ExternalSyntheticLambda7()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnExtraCallbackWithResult, "");
        feedV2Fragment.autoDisposable(deserializeurinullablecollectionOnExtraCallbackWithResult);
        getByteBuffer getbytebufferOnExtraCallbackWithResult = feedV2Fragment.IAuthTabCallbackDefault.onExtraCallbackWithResult(NetConverter3.IAuthTabCallback(Looper.myLooper())).onExtraCallbackWithResult(NetConverter3.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallbackWithResult, "");
        feedV2Fragment.autoDisposable(setMessageBytes.onExtraCallbackWithResult(getbytebufferOnExtraCallbackWithResult, new FeedV2Fragment$.ExternalSyntheticLambda9(), (Function0) null, new FeedV2Fragment$.ExternalSyntheticLambda10(feedV2Fragment), 2, (Object) null));
        if (feedV2Fragment.onMessageChannelReady()) {
            return null;
        }
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = getIconPaddingLeft.IAuthTabCallback.onWarmupCompleted().onWarmupCompleted(new FeedV2Fragment$.ExternalSyntheticLambda11()).IAuthTabCallback(EventServiceImplExternalSyntheticLambda1.class).onWarmupCompleted(NetConverter3.onExtraCallback()).onWarmupCompleted(new FeedV2Fragment$.ExternalSyntheticLambda13(new FeedV2Fragment$.ExternalSyntheticLambda12(feedV2Fragment)), new FeedV2Fragment$.ExternalSyntheticLambda5(new FeedV2Fragment$.ExternalSyntheticLambda14()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
        feedV2Fragment.autoDisposable(deserializeurinullablecollectionOnWarmupCompleted);
        int i2 = extraCommand + 81;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private final void onExtraCallbackWithResult(logEvent logevent) throws Throwable {
        getClientExtendConfig getclientextendconfig;
        String strOnExtraCallbackWithResult;
        Object next;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 61;
        extraCommand = i2 % 128;
        List list = null;
        if (i2 % 2 == 0) {
            logevent.onExtraCallbackWithResult();
            throw null;
        }
        List<EngineStack> listOnExtraCallbackWithResult = logevent.onExtraCallbackWithResult();
        if (listOnExtraCallbackWithResult == null) {
            listOnExtraCallbackWithResult = CollectionsKt.emptyList();
        }
        onExtraCallbackWithResult((String) logEvent.onExtraCallbackWithResult(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -1004095441, new Object[]{logevent}, 1004095441));
        List listAsBinder = logevent.asBinder();
        if (listAsBinder != null) {
            Iterator it = listAsBinder.iterator();
            while (true) {
                if (!(!it.hasNext())) {
                    next = it.next();
                    if (((getClientExtendConfig) next).onWarmupCompleted()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            getclientextendconfig = (getClientExtendConfig) next;
        } else {
            getclientextendconfig = null;
        }
        this.ICustomTabsCallbackStubProxy = getclientextendconfig;
        List<EngineStack> list2 = listOnExtraCallbackWithResult;
        int i3 = 0;
        int i4 = 0;
        for (Object obj : list2) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            EngineStack engineStack = (EngineStack) obj;
            EngineFactory engineFactoryOnWarmupCompleted = engineStack.onWarmupCompleted();
            if (engineFactoryOnWarmupCompleted != null) {
                engineFactoryOnWarmupCompleted.onExtraCallbackWithResult(engineStack.IAuthTabCallback() + 1);
            }
            EngineFactory engineFactoryOnWarmupCompleted2 = engineStack.onWarmupCompleted();
            if (engineFactoryOnWarmupCompleted2 != null && !engineFactoryOnWarmupCompleted2.extraCallbackWithResult()) {
                i4 = i5;
            }
            i3 = i5;
        }
        ArrayList arrayList = new ArrayList();
        for (EngineStack engineStack2 : list2) {
            EngineFactory engineFactoryOnWarmupCompleted3 = engineStack2.onWarmupCompleted();
            initIgnoreEventList initignoreeventlist = (engineFactoryOnWarmupCompleted3 == null || !engineFactoryOnWarmupCompleted3.onUnminimized() || onExtraCallback(engineStack2.onWarmupCompleted().onExtraCallback())) ? new initIgnoreEventList(engineStack2) : null;
            if (initignoreeventlist != null) {
                int i6 = isEngagementSignalsApiAvailable + 27;
                extraCommand = i6 % 128;
                int i7 = i6 % 2;
                arrayList.add(initignoreeventlist);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (i4 != 0) {
            int i8 = isEngagementSignalsApiAvailable + 53;
            extraCommand = i8 % 128;
            if (i8 % 2 == 0) {
                arrayList2.size();
                list.hashCode();
                throw null;
            }
            if (i4 < arrayList2.size()) {
                arrayList2.add(i4, new sendToRender(i4));
            }
        }
        String strOnNavigationEvent = onNavigationEvent(logevent);
        writeTypedObject().IAuthTabCallbackDefault.setTitle(strOnNavigationEvent);
        List<getTopProxy> listAsInterface = logevent.asInterface();
        if (listAsInterface == null) {
            listAsInterface = CollectionsKt.emptyList();
        }
        onExtraCallback(listAsInterface);
        List listAsBinder2 = logevent.asBinder();
        if (listAsBinder2 != null) {
            if (!listAsBinder2.isEmpty()) {
                int i9 = isEngagementSignalsApiAvailable + 97;
                extraCommand = i9 % 128;
                if (i9 % 2 == 0) {
                    list.hashCode();
                    throw null;
                }
                if (!(!this.extraCallbackWithResult)) {
                    list = listAsBinder2;
                }
            }
            if (list != null) {
                arrayList2.add(0, new sendPushCallBack(list));
            }
        }
        boolean zOnNavigationEvent = IAuthTabCallbackDefault().onNavigationEvent();
        if (!zOnNavigationEvent) {
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1311239L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        }
        arrayList2.add(0, new EngineUtils2(12));
        arrayList2.add(0, new EngineUtils1(strOnNavigationEvent, logevent.asInterface(), ((getPricingPhaseList) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1741859495, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this}, 1741859509, getPreRenderJob.onNavigationEvent.IAuthTabCallback())) == getPricingPhaseList.KR, !zOnNavigationEvent));
        if (!listOnExtraCallbackWithResult.isEmpty()) {
            arrayList2.add(arrayList2.size(), new sendPushWorkMessage(logevent.IAuthTabCallback()));
        }
        getRenderById getrenderbyid = this.onExtraCallbackWithResult;
        if (getrenderbyid != null) {
            getrenderbyid.onExtraCallbackWithResult(arrayList2, true);
        }
        if (!logevent.onTransact()) {
            createEngine createengine = createEngine.IAuthTabCallback;
            getClientExtendConfig getclientextendconfig2 = this.ICustomTabsCallbackStubProxy;
            if (getclientextendconfig2 == null || (strOnExtraCallbackWithResult = getclientextendconfig2.onExtraCallbackWithResult()) == null) {
                strOnExtraCallbackWithResult = "";
            }
            createEngine.IAuthTabCallback(new Object[]{createengine, strOnExtraCallbackWithResult}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1545782882, -1545782881, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback());
        }
        onWarmupCompleted(listOnExtraCallbackWithResult);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0217 A[PHI: r1
      0x0217: PHI (r1v3 java.util.List<java.lang.Object>) = (r1v2 java.util.List<java.lang.Object>), (r1v5 java.util.List<java.lang.Object>) binds: [B:95:0x0215, B:92:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(logEvent logevent) throws Throwable {
        String strOnExtraCallback;
        List<Object> list;
        String strOnWarmupCompleted;
        getClientExtendConfig getclientextendconfig;
        String strOnExtraCallbackWithResult;
        Object next;
        int i = 2 % 2;
        onExtraCallbackWithResult((String) logEvent.onExtraCallbackWithResult(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -1004095441, new Object[]{logevent}, 1004095441));
        String str = "";
        if (!(!logevent.onTransact()) || logevent.onWarmupCompleted()) {
            this.onUnminimized.clear();
            onExtraCallbackWithResult onextracallbackwithresult = this.onMinimized;
            if (onextracallbackwithresult != null) {
                onextracallbackwithresult.onExtraCallback("");
            }
            onExtraCallbackWithResult onextracallbackwithresult2 = this.onMinimized;
            if (onextracallbackwithresult2 != null) {
                onextracallbackwithresult2.onExtraCallback(false);
            }
        }
        List listOnExtraCallbackWithResult = logevent.onExtraCallbackWithResult();
        List list2 = null;
        if (listOnExtraCallbackWithResult != null && listOnExtraCallbackWithResult.size() == 0) {
            int i2 = extraCommand + 103;
            isEngagementSignalsApiAvailable = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            onExtraCallbackWithResult onextracallbackwithresult3 = this.onMinimized;
            if (onextracallbackwithresult3 != null) {
                onextracallbackwithresult3.onExtraCallback(true);
            }
        }
        List<EngineStack> listOnExtraCallbackWithResult2 = logevent.onExtraCallbackWithResult();
        if (listOnExtraCallbackWithResult2 == null) {
            listOnExtraCallbackWithResult2 = CollectionsKt.emptyList();
        }
        List<EngineStack> list3 = listOnExtraCallbackWithResult2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(new initIgnoreEventList((EngineStack) it.next()));
        }
        ArrayList arrayList2 = (ArrayList) CollectionsKt.toCollection(arrayList, new ArrayList());
        onExtraCallbackWithResult onextracallbackwithresult4 = this.onMinimized;
        if (onextracallbackwithresult4 != null && (strOnWarmupCompleted = onextracallbackwithresult4.onWarmupCompleted()) != null) {
            int i3 = extraCommand + 19;
            isEngagementSignalsApiAvailable = i3 % 128;
            int i4 = i3 % 2;
            if (strOnWarmupCompleted.length() == 0) {
                List<getTopProxy> listAsInterface = logevent.asInterface();
                if (listAsInterface == null) {
                    listAsInterface = CollectionsKt.emptyList();
                }
                onExtraCallback(listAsInterface);
                List listAsBinder = logevent.asBinder();
                if (listAsBinder != null) {
                    Iterator it2 = listAsBinder.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (((getClientExtendConfig) next).onWarmupCompleted()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    getclientextendconfig = (getClientExtendConfig) next;
                } else {
                    getclientextendconfig = null;
                }
                this.ICustomTabsCallbackStubProxy = getclientextendconfig;
                if (!logevent.onTransact()) {
                    createEngine createengine = createEngine.IAuthTabCallback;
                    getClientExtendConfig getclientextendconfig2 = this.ICustomTabsCallbackStubProxy;
                    if (getclientextendconfig2 == null || (strOnExtraCallbackWithResult = getclientextendconfig2.onExtraCallbackWithResult()) == null) {
                        strOnExtraCallbackWithResult = "";
                    }
                    createEngine.IAuthTabCallback(new Object[]{createengine, strOnExtraCallbackWithResult}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1545782882, -1545782881, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback());
                }
                String strOnNavigationEvent = onNavigationEvent(logevent);
                writeTypedObject().IAuthTabCallbackDefault.setTitle(strOnNavigationEvent);
                List listAsBinder2 = logevent.asBinder();
                if (listAsBinder2 != null) {
                    if (!listAsBinder2.isEmpty() && this.extraCallbackWithResult) {
                        list2 = listAsBinder2;
                    }
                    if (list2 != null) {
                        arrayList2.add(0, new sendPushCallBack(list2));
                    }
                }
                boolean zOnNavigationEvent = IAuthTabCallbackDefault().onNavigationEvent();
                if (!zOnNavigationEvent) {
                    int i5 = extraCommand + 19;
                    isEngagementSignalsApiAvailable = i5 % 128;
                    int i6 = i5 % 2;
                    ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1311239L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
                }
                List listAsInterface2 = logevent.asInterface();
                if (((getPricingPhaseList) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1741859495, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this}, 1741859509, getPreRenderJob.onNavigationEvent.IAuthTabCallback())) == getPricingPhaseList.KR) {
                    int i7 = extraCommand + 99;
                    isEngagementSignalsApiAvailable = i7 % 128;
                    boolean z = i7 % 2 == 0;
                    arrayList2.add(0, new EngineUtils1(strOnNavigationEvent, listAsInterface2, z, !zOnNavigationEvent));
                }
            }
        }
        for (EngineStack engineStack : list3) {
            EngineFactory engineFactoryOnWarmupCompleted = engineStack.onWarmupCompleted();
            if (engineFactoryOnWarmupCompleted != null) {
                int i8 = extraCommand + 117;
                isEngagementSignalsApiAvailable = i8 % 128;
                if (i8 % 2 != 0) {
                    engineFactoryOnWarmupCompleted.onExtraCallbackWithResult(engineStack.IAuthTabCallback());
                } else {
                    engineFactoryOnWarmupCompleted.onExtraCallbackWithResult(engineStack.IAuthTabCallback() + 1);
                }
            }
        }
        this.onUnminimized.addAll(arrayList2);
        getRenderById getrenderbyid = this.onExtraCallbackWithResult;
        if (getrenderbyid != null) {
            int i9 = extraCommand + 3;
            isEngagementSignalsApiAvailable = i9 % 128;
            if (i9 % 2 != 0) {
                list = this.onUnminimized;
                int i10 = 34 / 0;
                if (!listOnExtraCallbackWithResult2.isEmpty()) {
                    arrayList2.add(arrayList2.size(), new sendPushWorkMessage(logevent.IAuthTabCallback()));
                }
                getrenderbyid.onExtraCallbackWithResult(list, true);
            } else {
                list = this.onUnminimized;
                if (!listOnExtraCallbackWithResult2.isEmpty()) {
                }
                getrenderbyid.onExtraCallbackWithResult(list, true);
            }
        }
        onWarmupCompleted(listOnExtraCallbackWithResult2);
        onExtraCallbackWithResult onextracallbackwithresult5 = this.onMinimized;
        if (onextracallbackwithresult5 != null) {
            EngineFactory engineFactoryOnWarmupCompleted2 = ((EngineStack) CollectionsKt.last(listOnExtraCallbackWithResult2)).onWarmupCompleted();
            if (engineFactoryOnWarmupCompleted2 != null && (strOnExtraCallback = engineFactoryOnWarmupCompleted2.onExtraCallback()) != null) {
                str = strOnExtraCallback;
            }
            onextracallbackwithresult5.onExtraCallback(str);
        }
    }

    private final String onNavigationEvent(logEvent logevent) {
        getTopProxy gettopproxy;
        String strOnNavigationEvent;
        String string;
        Object next;
        int i = 2 % 2;
        List listAsInterface = logevent.asInterface();
        String str = null;
        if (listAsInterface != null) {
            Iterator it = listAsInterface.iterator();
            while (true) {
                if (!it.hasNext()) {
                    int i2 = isEngagementSignalsApiAvailable + 121;
                    extraCommand = i2 % 128;
                    int i3 = i2 % 2;
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((getTopProxy) next).IAuthTabCallback(), (String) logEvent.onExtraCallbackWithResult(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -1004095441, new Object[]{logevent}, 1004095441))) {
                    int i4 = isEngagementSignalsApiAvailable + 55;
                    extraCommand = i4 % 128;
                    int i5 = i4 % 2;
                    break;
                }
            }
            gettopproxy = (getTopProxy) next;
        } else {
            gettopproxy = null;
        }
        if (gettopproxy != null && (strOnNavigationEvent = gettopproxy.onNavigationEvent()) != null && (string = getString(im.toss.features.main.library.R.string.tab_title_feed_company, new Object[]{strOnNavigationEvent})) != null) {
            if (this.extraCallbackWithResult) {
                if (((String) logEvent.onExtraCallbackWithResult(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -1004095441, new Object[]{logevent}, 1004095441)).length() > 0) {
                    int i6 = isEngagementSignalsApiAvailable + 97;
                    extraCommand = i6 % 128;
                    int i7 = i6 % 2;
                    str = string;
                }
            }
            if (str != null) {
                return str;
            }
        }
        String string2 = getString(im.toss.features.main.library.R.string.tab_title_feed);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    private final void onExtraCallbackWithResult(LinearLayoutManager linearLayoutManager) {
        ArrayList arrayList;
        Object obj;
        String strOnExtraCallbackWithResult;
        List listOnExtraCallbackWithResult;
        int i = 2 % 2;
        getRenderById getrenderbyid = this.onExtraCallbackWithResult;
        Object obj2 = null;
        if (getrenderbyid == null || (listOnExtraCallbackWithResult = getrenderbyid.onExtraCallbackWithResult()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj3 : listOnExtraCallbackWithResult) {
                if (obj3 instanceof initIgnoreEventList) {
                    int i2 = extraCommand + 27;
                    isEngagementSignalsApiAvailable = i2 % 128;
                    if (i2 % 2 != 0) {
                        arrayList.add(obj3);
                        obj2.hashCode();
                        throw null;
                    }
                    arrayList.add(obj3);
                }
            }
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            if (!this.extraCallback.contains(Integer.valueOf(iFindFirstVisibleItemPosition))) {
                try {
                    if (linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition) != null) {
                        float fMin = (Math.min(writeTypedObject().onExtraCallback.getMeasuredHeight(), r7.getBottom()) - Math.max(0, r7.getTop())) / r7.getMeasuredHeight();
                        getRenderById getrenderbyid2 = this.onExtraCallbackWithResult;
                        if (getrenderbyid2 == null) {
                            return;
                        }
                        int i3 = isEngagementSignalsApiAvailable + 5;
                        extraCommand = i3 % 128;
                        int i4 = i3 % 2;
                        List listOnExtraCallbackWithResult2 = getrenderbyid2.onExtraCallbackWithResult();
                        if (listOnExtraCallbackWithResult2 == null || (obj = listOnExtraCallbackWithResult2.get(iFindFirstVisibleItemPosition)) == null) {
                            return;
                        }
                        if (fMin > 0.9f) {
                            int i5 = extraCommand + 63;
                            isEngagementSignalsApiAvailable = i5 % 128;
                            if (i5 % 2 != 0) {
                                boolean z = obj instanceof initIgnoreEventList;
                                obj2.hashCode();
                                throw null;
                            }
                            if (obj instanceof initIgnoreEventList) {
                                if (Intrinsics.areEqual(((initIgnoreEventList) obj).IAuthTabCallback().onTransact(), Boolean.TRUE)) {
                                    RVEngine.onNavigationEvent(((initIgnoreEventList) obj).IAuthTabCallback());
                                } else {
                                    int iIndexOf = arrayList != null ? arrayList.indexOf(obj) : -1;
                                    String str = this.asInterface;
                                    getClientExtendConfig getclientextendconfig = this.ICustomTabsCallbackStubProxy;
                                    if (getclientextendconfig == null || (strOnExtraCallbackWithResult = getclientextendconfig.onExtraCallbackWithResult()) == null) {
                                        strOnExtraCallbackWithResult = "";
                                    }
                                    RVEngine.onWarmupCompleted(iIndexOf, str, strOnExtraCallbackWithResult, ((initIgnoreEventList) obj).IAuthTabCallback(), (updateAdInfo) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -284153440, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this}, 284153462, getPreRenderJob.onNavigationEvent.IAuthTabCallback()));
                                    int i6 = extraCommand + 85;
                                    isEngagementSignalsApiAvailable = i6 % 128;
                                    int i7 = i6 % 2;
                                }
                            }
                            this.extraCallback.add(Integer.valueOf(iFindFirstVisibleItemPosition));
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    private final void onExtraCallback(EngineFactory engineFactory) throws Throwable {
        Intent intentIAuthTabCallback;
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 7;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        String strAccess100 = engineFactory.access100();
        if (strAccess100 != null) {
            int i4 = isEngagementSignalsApiAvailable + 3;
            extraCommand = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                strAccess100.length();
                obj.hashCode();
                throw null;
            }
            if (strAccess100.length() <= 0) {
                strAccess100 = null;
            }
            if (strAccess100 != null) {
                int i5 = extraCommand + 91;
                isEngagementSignalsApiAvailable = i5 % 128;
                if (i5 % 2 != 0) {
                    enableModuleArgumentNSNullConversionIOS.asInterface.IAuthTabCallbackDefault(strAccess100);
                    obj.hashCode();
                    throw null;
                }
                if (enableModuleArgumentNSNullConversionIOS.asInterface.IAuthTabCallbackDefault(strAccess100)) {
                    String strIAuthTabCallback = convertAnyToMap.IAuthTabCallback(strAccess100, "tag", "inbox");
                    if (Intrinsics.areEqual(this.asInterface, "bank")) {
                        int i6 = extraCommand + 95;
                        isEngagementSignalsApiAvailable = i6 % 128;
                        int i7 = i6 % 2;
                        strOnExtraCallbackWithResult = engineFactory.onExtraCallbackWithResult();
                    } else {
                        strOnExtraCallbackWithResult = "feed";
                    }
                    Object[] objArr = new Object[1];
                    a(new char[]{4, '\n', '\t', 19, 13920, 13920, '\n', 4}, (byte) (KeyEvent.keyCodeFromString("") + 120), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7, objArr);
                    onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 117032004, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this, convertAnyToMap.IAuthTabCallback(strIAuthTabCallback, ((String) objArr[0]).intern(), strOnExtraCallbackWithResult)}, -117031995, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
                    return;
                }
                try {
                    Uri uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{strAccess100});
                    if (uri == null || (intentIAuthTabCallback = filterCreatePageParams.IAuthTabCallback(uri, (String) null, (Bundle) null, 3, (Object) null)) == null) {
                        return;
                    }
                    Context contextRequireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    getNavigationBar.IAuthTabCallback(intentIAuthTabCallback, contextRequireContext);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception unused) {
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
    }

    private final void onNavigationEvent(EngineFactory engineFactory) {
        int i = 2 % 2;
        int i2 = extraCommand + 17;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            r8lambda295zAJYjdsl38mfEBnLGXD9CqAA.Companion.onExtraCallback(engineFactory.IAuthTabCallback(), "read_in_feed");
            int i3 = isEngagementSignalsApiAvailable + 63;
            extraCommand = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        r8lambda295zAJYjdsl38mfEBnLGXD9CqAA.Companion.onExtraCallback(engineFactory.IAuthTabCallback(), "read_in_feed");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        FeedV2Fragment feedV2Fragment = (FeedV2Fragment) objArr[0];
        int i = 2 % 2;
        int i2 = extraCommand + 9;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1631989959, iIAuthTabCallback2, new Object[]{feedV2Fragment, true}, 1631989960, iIAuthTabCallback3);
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 23;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 89;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCommand + 1;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
    }

    private static final void onMinimized(FeedV2Fragment feedV2Fragment) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 97;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1631989959, iIAuthTabCallback2, new Object[]{feedV2Fragment, false}, 1631989960, iIAuthTabCallback3);
        } else {
            int iIAuthTabCallback4 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback5 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback6 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            onNavigationEvent(iIAuthTabCallback4, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1631989959, iIAuthTabCallback5, new Object[]{feedV2Fragment, false}, 1631989960, iIAuthTabCallback6);
        }
        int i3 = extraCommand + 29;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 55 / 0;
        }
    }

    private static final void onPostMessage(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 115;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCommand + 77;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object access000(Object[] objArr) {
        ArrayList arrayList;
        boolean zBooleanValue;
        EngineStack engineStack = (EngineStack) objArr[0];
        FeedV2Fragment feedV2Fragment = (FeedV2Fragment) objArr[1];
        InboxV2OthersResp inboxV2OthersResp = (InboxV2OthersResp) objArr[2];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 19;
        extraCommand = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inboxV2OthersResp.onExtraCallback();
            obj.hashCode();
            throw null;
        }
        List<InboxMessageV2Dto> listOnExtraCallback = inboxV2OthersResp.onExtraCallback();
        if (listOnExtraCallback != null) {
            List<InboxMessageV2Dto> list = listOnExtraCallback;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (InboxMessageV2Dto inboxMessageV2Dto : list) {
                Boolean boolOnTransact = engineStack.onTransact();
                if (boolOnTransact != null) {
                    int i3 = extraCommand + 19;
                    isEngagementSignalsApiAvailable = i3 % 128;
                    if (i3 % 2 != 0) {
                        boolOnTransact.booleanValue();
                        obj.hashCode();
                        throw null;
                    }
                    zBooleanValue = boolOnTransact.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                String strOnExtraCallback = engineStack.onExtraCallback();
                if (strOnExtraCallback == null) {
                    int i4 = extraCommand + 101;
                    isEngagementSignalsApiAvailable = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 14 / 0;
                    }
                    strOnExtraCallback = "";
                }
                EngineFactory engineFactoryIAuthTabCallback = removeProxy.IAuthTabCallback(inboxMessageV2Dto, zBooleanValue, strOnExtraCallback);
                int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                EngineFactory.IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1697618931, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, new Object[]{engineFactoryIAuthTabCallback, true}, -1697618926);
                engineFactoryIAuthTabCallback.onExtraCallbackWithResult(engineStack.IAuthTabCallback() + 1);
                arrayList2.add(engineFactoryIAuthTabCallback);
            }
            arrayList = (ArrayList) CollectionsKt.toCollection(arrayList2, new ArrayList());
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
        }
        engineStack.onExtraCallbackWithResult(arrayList);
        feedV2Fragment.onExtraCallbackWithResult(engineStack);
        return Unit.INSTANCE;
    }

    private static final void onMinimized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 29;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = isEngagementSignalsApiAvailable + 71;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(FeedV2Fragment feedV2Fragment, Throwable th) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 83;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, feedV2Fragment.requireContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("FeedV2Fragment", th);
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 53;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
      0x0020: PHI (r1v5 java.util.ArrayList) = (r1v4 java.util.ArrayList), (r1v19 java.util.ArrayList) binds: [B:8:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(EngineStack engineStack) {
        ArrayList arrayListOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 125;
        extraCommand = i2 % 128;
        List listSubList = null;
        if (i2 % 2 == 0) {
            arrayListOnExtraCallbackWithResult = engineStack.onExtraCallbackWithResult();
            int i3 = 31 / 0;
            if (arrayListOnExtraCallbackWithResult != null) {
                if (arrayListOnExtraCallbackWithResult.size() > 0) {
                    int i4 = isEngagementSignalsApiAvailable + 47;
                    extraCommand = i4 % 128;
                    if (i4 % 2 != 0) {
                        onExtraCallbackWithResult(engineStack);
                        return;
                    } else {
                        onExtraCallbackWithResult(engineStack);
                        throw null;
                    }
                }
            }
        } else {
            arrayListOnExtraCallbackWithResult = engineStack.onExtraCallbackWithResult();
            if (arrayListOnExtraCallbackWithResult != null) {
            }
        }
        List listOnNavigationEvent = engineStack.onNavigationEvent();
        if (listOnNavigationEvent != null) {
            int i5 = extraCommand + 109;
            isEngagementSignalsApiAvailable = i5 % 128;
            int i6 = i5 % 2;
            listSubList = listOnNavigationEvent.subList(0, Math.min(20, engineStack.IAuthTabCallback()));
            int i7 = isEngagementSignalsApiAvailable + 93;
            extraCommand = i7 % 128;
            int i8 = i7 % 2;
        }
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        writeRaw writerawOnNavigationEvent = ((updateLoadParamUrl) onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1841425355, iIAuthTabCallback2, new Object[]{this}, 1841425357, iIAuthTabCallback3)).onNavigationEvent(new InboxV2OthersReq(listSubList, engineStack.onExtraCallback()));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new IAuthTabCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onExtraCallback(new FeedV2Fragment$.ExternalSyntheticLambda37(new FeedV2Fragment$.ExternalSyntheticLambda36(this))).onWarmupCompleted(new FeedV2Fragment$.ExternalSyntheticLambda38(this)).onNavigationEvent(new FeedV2Fragment$.ExternalSyntheticLambda40(new FeedV2Fragment$.ExternalSyntheticLambda39(engineStack, this)), new FeedV2Fragment$.ExternalSyntheticLambda42(new FeedV2Fragment$.ExternalSyntheticLambda41(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        autoDisposable(deserializeurinullablecollectionOnNavigationEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[PHI: r12
      0x0066: PHI (r12v11 o.getRenderById) = (r12v10 o.getRenderById), (r12v12 o.getRenderById) binds: [B:17:0x0064, B:14:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(EngineStack engineStack, FeedV2DetailDialog feedV2DetailDialog, FeedV2Fragment feedV2Fragment, DialogInterface dialogInterface) {
        getRenderById getrenderbyid;
        int i = 2 % 2;
        int i2 = extraCommand + 39;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        EngineFactory engineFactoryOnWarmupCompleted = engineStack.onWarmupCompleted();
        if (engineFactoryOnWarmupCompleted != null) {
            if (engineFactoryOnWarmupCompleted.extraCallbackWithResult()) {
                int i4 = isEngagementSignalsApiAvailable + 17;
                extraCommand = i4 % 128;
                int i5 = i4 % 2;
                engineFactoryOnWarmupCompleted = null;
                if (engineFactoryOnWarmupCompleted != null) {
                    int i6 = extraCommand + 21;
                    isEngagementSignalsApiAvailable = i6 % 128;
                    if (i6 % 2 != 0) {
                        engineFactoryOnWarmupCompleted.IAuthTabCallback(true);
                        getrenderbyid = feedV2Fragment.onExtraCallbackWithResult;
                        if (getrenderbyid != null) {
                            getrenderbyid.notifyItemChanged(getrenderbyid.onExtraCallbackWithResult().indexOf(engineStack));
                        }
                    } else {
                        engineFactoryOnWarmupCompleted.IAuthTabCallback(true);
                        getrenderbyid = feedV2Fragment.onExtraCallbackWithResult;
                        if (getrenderbyid != null) {
                        }
                    }
                }
            } else {
                int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                if (((Boolean) EngineFactory.IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -675383533, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{engineFactoryOnWarmupCompleted}, 675383535)).booleanValue()) {
                }
                if (engineFactoryOnWarmupCompleted != null) {
                }
            }
        }
        engineStack.onExtraCallbackWithResult(feedV2DetailDialog.onWarmupCompleted().onExtraCallbackWithResult());
        ArrayList<EngineFactory> arrayListOnExtraCallbackWithResult = engineStack.onExtraCallbackWithResult();
        if (arrayListOnExtraCallbackWithResult != null) {
            int i7 = isEngagementSignalsApiAvailable + 65;
            extraCommand = i7 % 128;
            int i8 = i7 % 2;
            for (EngineFactory engineFactory : arrayListOnExtraCallbackWithResult) {
                int i9 = isEngagementSignalsApiAvailable + 31;
                extraCommand = i9 % 128;
                int i10 = i9 % 2;
                if (!engineFactory.extraCallbackWithResult()) {
                    int i11 = isEngagementSignalsApiAvailable + 37;
                    extraCommand = i11 % 128;
                    int i12 = i11 % 2;
                    int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    if (!((Boolean) EngineFactory.IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -675383533, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback3, new Object[]{engineFactory}, 675383535)).booleanValue()) {
                        engineFactory.IAuthTabCallback(true);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[PHI: r2
      0x002a: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:11:0x0030, B:7:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(EngineStack engineStack) {
        String str;
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        String str2 = this.asInterface;
        getClientExtendConfig getclientextendconfig = this.ICustomTabsCallbackStubProxy;
        if (getclientextendconfig != null) {
            int i2 = extraCommand + 75;
            isEngagementSignalsApiAvailable = i2 % 128;
            if (i2 % 2 != 0) {
                strOnExtraCallbackWithResult = getclientextendconfig.onExtraCallbackWithResult();
                int i3 = 92 / 0;
                str = strOnExtraCallbackWithResult == null ? "" : strOnExtraCallbackWithResult;
            } else {
                strOnExtraCallbackWithResult = getclientextendconfig.onExtraCallbackWithResult();
                if (strOnExtraCallbackWithResult == null) {
                }
            }
        }
        FeedV2DetailDialog feedV2DetailDialog = new FeedV2DetailDialog(contextRequireContext, engineStack, str2, str, this, (updateLoadParamUrl) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1841425355, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this}, 1841425357, getPreRenderJob.onNavigationEvent.IAuthTabCallback()), (updateAdInfo) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -284153440, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this}, 284153462, getPreRenderJob.onNavigationEvent.IAuthTabCallback()));
        feedV2DetailDialog.setOnDismissListener(new FeedV2Fragment$.ExternalSyntheticLambda24(engineStack, feedV2DetailDialog, this));
        feedV2DetailDialog.show();
        int i4 = extraCommand + 39;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IAuthTabCallback(EngineFactory engineFactory) {
        int i = 2 % 2;
        if (!(!engineFactory.extraCallbackWithResult())) {
            return;
        }
        int i2 = extraCommand + 47;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback().onExtraCallback(engineFactory.onExtraCallback());
        engineFactory.IAuthTabCallback(true);
        getRenderById getrenderbyid = this.onExtraCallbackWithResult;
        if (getrenderbyid != null) {
            Iterator it = getrenderbyid.onExtraCallbackWithResult().iterator();
            int i4 = extraCommand + 87;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i6 = -1;
                    break;
                }
                Object next = it.next();
                if (next instanceof EngineStack) {
                    next = ((EngineStack) next).onWarmupCompleted();
                    int i7 = extraCommand + 11;
                    isEngagementSignalsApiAvailable = i7 % 128;
                    int i8 = i7 % 2;
                }
                if (Intrinsics.areEqual(next, engineFactory)) {
                    break;
                } else {
                    i6++;
                }
            }
            Integer numValueOf = Integer.valueOf(i6);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int i9 = isEngagementSignalsApiAvailable + 41;
                extraCommand = i9 % 128;
                if (i9 % 2 == 0) {
                    numValueOf.intValue();
                    throw null;
                }
                int iIntValue = numValueOf.intValue();
                getRenderById getrenderbyid2 = this.onExtraCallbackWithResult;
                if (getrenderbyid2 != null) {
                    getrenderbyid2.notifyItemChanged(iIntValue);
                }
            }
        }
    }

    private static final void ICustomTabsCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 121;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCommand + 79;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void ICustomTabsCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 119;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = isEngagementSignalsApiAvailable + 125;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onWarmupCompleted(FeedV2Fragment feedV2Fragment, Unit unit) {
        int i = 2 % 2;
        int i2 = extraCommand + 43;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        feedV2Fragment.onExtraCallback().onExtraCallbackWithResult("readNotif");
        Unit unit2 = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 35;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(List<EngineStack> list) {
        boolean z;
        int i = 2 % 2;
        int i2 = extraCommand + 17;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z2 = list instanceof Collection;
            obj.hashCode();
            throw null;
        }
        List<EngineStack> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        for (EngineStack engineStack : list2) {
            EngineFactory engineFactoryOnWarmupCompleted = engineStack.onWarmupCompleted();
            if (engineFactoryOnWarmupCompleted != null) {
                int i3 = isEngagementSignalsApiAvailable + 51;
                extraCommand = i3 % 128;
                int i4 = i3 % 2;
                if (!((Boolean) EngineFactory.IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -675383533, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{engineFactoryOnWarmupCompleted}, 675383535)).booleanValue()) {
                    EngineFactory engineFactoryOnWarmupCompleted2 = engineStack.onWarmupCompleted();
                    z = engineFactoryOnWarmupCompleted2 == null || !engineFactoryOnWarmupCompleted2.extraCallbackWithResult();
                }
            }
            if (!(!z)) {
                int i5 = isEngagementSignalsApiAvailable + 53;
                extraCommand = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 3 / 5;
                }
                updateLoadParamUrl updateloadparamurl = (updateLoadParamUrl) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1841425355, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this}, 1841425357, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
                String str = this.asInterface;
                if (str.length() <= 0) {
                    str = null;
                }
                writeRaw writerawOnNavigationEvent = updateloadparamurl.onNavigationEvent(str);
                MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
                Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
                writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new IAuthTabCallbackStub(mapConverterOnExtraCallback, (MapConverter) null));
                Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(new FeedV2Fragment$.ExternalSyntheticLambda32(new FeedV2Fragment$.ExternalSyntheticLambda31(this)), new FeedV2Fragment$.ExternalSyntheticLambda34(new FeedV2Fragment$.ExternalSyntheticLambda33(this)));
                Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
                autoDisposable(deserializeurinullablecollectionOnNavigationEvent);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0 A[PHI: r3
      0x00d0: PHI (r3v9 java.util.List) = (r3v8 java.util.List), (r3v14 java.util.List) binds: [B:40:0x00ce, B:37:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    @Override // o.getWorkerId
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallback(int i, @NotNull EngineStack engineStack) throws Throwable {
        int iIndexOf;
        String strOnExtraCallbackWithResult;
        List listOnExtraCallbackWithResult;
        int i2;
        int i3 = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(engineStack, "");
        if (engineStack.IAuthTabCallback() == 0) {
            EngineFactory engineFactoryOnWarmupCompleted = engineStack.onWarmupCompleted();
            if (engineFactoryOnWarmupCompleted != null) {
                getWorkerId.onExtraCallbackWithResult(this, i, engineStack, engineFactoryOnWarmupCompleted, false, 8, null);
                return;
            }
            return;
        }
        String strOnExtraCallback = engineStack.onExtraCallback();
        int i4 = 1;
        Object[] objArr = new Object[1];
        a(new char[]{'\t', '\r', 18, 16, 1, 20, 16, 23, '\r', '\t'}, (byte) ('7' - AndroidCharacter.getMirror('0')), TextUtils.lastIndexOf("", '0', 0, 0) + 11, objArr);
        if (Intrinsics.areEqual(strOnExtraCallback, ((String) objArr[0]).intern())) {
            createEngine createengine = createEngine.IAuthTabCallback;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            getClientExtendConfig getclientextendconfig = this.ICustomTabsCallbackStubProxy;
            if (getclientextendconfig != null) {
                int i5 = isEngagementSignalsApiAvailable + 103;
                extraCommand = i5 % 128;
                if (i5 % 2 == 0) {
                    getclientextendconfig.onExtraCallbackWithResult();
                    throw null;
                }
                String strOnExtraCallbackWithResult2 = getclientextendconfig.onExtraCallbackWithResult();
                String str2 = strOnExtraCallbackWithResult2 == null ? "" : strOnExtraCallbackWithResult2;
                EngineFactory engineFactoryOnWarmupCompleted2 = engineStack.onWarmupCompleted();
                if (engineFactoryOnWarmupCompleted2 == null) {
                    return;
                }
                if (engineStack.IAuthTabCallback() > 0) {
                    int i6 = extraCommand + 71;
                    isEngagementSignalsApiAvailable = i6 % 128;
                    if (i6 % 2 != 0) {
                        i4 = 3;
                        i2 = i4;
                        createengine.IAuthTabCallback(contextRequireContext, str2, engineFactoryOnWarmupCompleted2, i2, engineStack.IAuthTabCallback() + "개 더보기");
                    } else {
                        i2 = 2;
                        createengine.IAuthTabCallback(contextRequireContext, str2, engineFactoryOnWarmupCompleted2, i2, engineStack.IAuthTabCallback() + "개 더보기");
                    }
                } else {
                    i2 = i4;
                    createengine.IAuthTabCallback(contextRequireContext, str2, engineFactoryOnWarmupCompleted2, i2, engineStack.IAuthTabCallback() + "개 더보기");
                }
            }
        }
        getRenderById getrenderbyid = this.onExtraCallbackWithResult;
        if (getrenderbyid != null) {
            int i7 = isEngagementSignalsApiAvailable + 91;
            extraCommand = i7 % 128;
            if (i7 % 2 == 0) {
                listOnExtraCallbackWithResult = getrenderbyid.onExtraCallbackWithResult();
                int i8 = 60 / 0;
                if (listOnExtraCallbackWithResult != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listOnExtraCallbackWithResult) {
                        int i9 = isEngagementSignalsApiAvailable + 53;
                        extraCommand = i9 % 128;
                        int i10 = i9 % 2;
                        if (obj instanceof initIgnoreEventList) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((initIgnoreEventList) it.next()).IAuthTabCallback());
                    }
                    iIndexOf = arrayList2.indexOf(engineStack);
                } else {
                    int i11 = isEngagementSignalsApiAvailable + 113;
                    extraCommand = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 4 % 4;
                    }
                    iIndexOf = -1;
                }
            } else {
                listOnExtraCallbackWithResult = getrenderbyid.onExtraCallbackWithResult();
                if (listOnExtraCallbackWithResult != null) {
                }
            }
        }
        String str3 = this.asInterface;
        getClientExtendConfig getclientextendconfig2 = this.ICustomTabsCallbackStubProxy;
        if (getclientextendconfig2 != null && (strOnExtraCallbackWithResult = getclientextendconfig2.onExtraCallbackWithResult()) != null) {
            str = strOnExtraCallbackWithResult;
        }
        RVEngine.IAuthTabCallback(iIndexOf, str3, str, engineStack, (updateAdInfo) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -284153440, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this}, 284153462, getPreRenderJob.onNavigationEvent.IAuthTabCallback()));
        IAuthTabCallback(engineStack);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    @Override // o.getWorkerId
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallback(int i, @NotNull EngineStack engineStack, @NotNull EngineFactory engineFactory, boolean z) throws Throwable {
        int iIndexOf;
        String strOnExtraCallbackWithResult;
        List listOnExtraCallbackWithResult;
        List listEmptyList;
        String strOnExtraCallbackWithResult2;
        int i2 = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(engineStack, "");
        Intrinsics.checkNotNullParameter(engineFactory, "");
        String strAccess100 = engineFactory.access100();
        if (strAccess100 != null) {
            int i3 = extraCommand + 101;
            isEngagementSignalsApiAvailable = i3 % 128;
            int i4 = i3 % 2;
            if (StringsKt.isBlank(strAccess100)) {
                return;
            }
            String strAsBinder = engineFactory.asBinder();
            Object[] objArr = new Object[1];
            a(new char[]{'\t', '\r', 18, 16, 1, 20, 16, 23, '\r', '\t'}, (byte) (7 - View.resolveSizeAndState(0, 0, 0)), 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            if (Intrinsics.areEqual(strAsBinder, ((String) objArr[0]).intern())) {
                createEngine createengine = createEngine.IAuthTabCallback;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                getClientExtendConfig getclientextendconfig = this.ICustomTabsCallbackStubProxy;
                if (getclientextendconfig != null) {
                    int i5 = extraCommand + 121;
                    isEngagementSignalsApiAvailable = i5 % 128;
                    int i6 = i5 % 2;
                    String strOnExtraCallbackWithResult3 = getclientextendconfig.onExtraCallbackWithResult();
                    if (strOnExtraCallbackWithResult3 == null) {
                        strOnExtraCallbackWithResult3 = "";
                    }
                    createEngine.onWarmupCompleted(createengine, contextRequireContext, strOnExtraCallbackWithResult3, engineFactory, 1, (String) null, 16, (Object) null);
                }
            }
            IAuthTabCallback(engineFactory);
            onNavigationEvent(engineFactory);
            if (!engineFactory.onUnminimized()) {
                int i7 = extraCommand;
                int i8 = i7 + 47;
                isEngagementSignalsApiAvailable = i8 % 128;
                int i9 = i8 % 2;
                Object obj = null;
                if (z) {
                    int i10 = i7 + 121;
                    isEngagementSignalsApiAvailable = i10 % 128;
                    int i11 = i10 % 2;
                    EngineFactory engineFactoryOnWarmupCompleted = engineStack.onWarmupCompleted();
                    if (engineFactoryOnWarmupCompleted == null || (listEmptyList = CollectionsKt.listOf(engineFactoryOnWarmupCompleted)) == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    List list = listEmptyList;
                    List listOnExtraCallbackWithResult2 = engineStack.onExtraCallbackWithResult();
                    if (listOnExtraCallbackWithResult2 == null) {
                        int i12 = extraCommand + 31;
                        isEngagementSignalsApiAvailable = i12 % 128;
                        if (i12 % 2 != 0) {
                            CollectionsKt.emptyList();
                            obj.hashCode();
                            throw null;
                        }
                        listOnExtraCallbackWithResult2 = CollectionsKt.emptyList();
                    }
                    int iIndexOf2 = CollectionsKt.plus(list, listOnExtraCallbackWithResult2).indexOf(engineFactory);
                    String str2 = this.asInterface;
                    getClientExtendConfig getclientextendconfig2 = this.ICustomTabsCallbackStubProxy;
                    if (getclientextendconfig2 != null && (strOnExtraCallbackWithResult2 = getclientextendconfig2.onExtraCallbackWithResult()) != null) {
                        str = strOnExtraCallbackWithResult2;
                    }
                    RVEngine.onExtraCallback(ACPayResult.onWarmupCompleted(), new Object[]{Integer.valueOf(iIndexOf2), str2, str, engineFactory, (updateAdInfo) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -284153440, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this}, 284153462, getPreRenderJob.onNavigationEvent.IAuthTabCallback())}, 1493600969, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1493600964);
                } else {
                    getRenderById getrenderbyid = this.onExtraCallbackWithResult;
                    if (getrenderbyid == null || (listOnExtraCallbackWithResult = getrenderbyid.onExtraCallbackWithResult()) == null) {
                        iIndexOf = -1;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listOnExtraCallbackWithResult) {
                            if (obj2 instanceof initIgnoreEventList) {
                                int i13 = isEngagementSignalsApiAvailable + 13;
                                extraCommand = i13 % 128;
                                if (i13 % 2 == 0) {
                                    arrayList.add(obj2);
                                    throw null;
                                }
                                arrayList.add(obj2);
                                int i14 = extraCommand + 113;
                                isEngagementSignalsApiAvailable = i14 % 128;
                                int i15 = i14 % 2;
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((initIgnoreEventList) it.next()).IAuthTabCallback().onWarmupCompleted());
                        }
                        iIndexOf = arrayList2.indexOf(engineFactory);
                    }
                    String str3 = this.asInterface;
                    getClientExtendConfig getclientextendconfig3 = this.ICustomTabsCallbackStubProxy;
                    if (getclientextendconfig3 != null && (strOnExtraCallbackWithResult = getclientextendconfig3.onExtraCallbackWithResult()) != null) {
                        str = strOnExtraCallbackWithResult;
                    }
                    RVEngine.IAuthTabCallback(iIndexOf, str3, str, engineFactory, (updateAdInfo) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -284153440, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this}, 284153462, getPreRenderJob.onNavigationEvent.IAuthTabCallback()));
                }
            } else {
                RVEngine.onExtraCallback(ACPayResult.onWarmupCompleted(), new Object[]{engineFactory}, -1126430875, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1126430878);
            }
            onExtraCallback(engineFactory);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        r4 = (o.getTopProxy) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (r4 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        r3 = im.toss.features.feed.normal.FeedV2Fragment.extraCommand + 41;
        im.toss.features.feed.normal.FeedV2Fragment.isEngagementSignalsApiAvailable = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
    
        if ((r3 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        r3 = r4.onNavigationEvent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
    
        if (r3 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        r4.onNavigationEvent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        o.createEngine.IAuthTabCallback(new java.lang.Object[]{r2, r3}, im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1359810400, 1359810406, im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback());
        r2 = r12.asBinder;
        r3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, 10));
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cd, code lost:
    
        if (r2.hasNext() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cf, code lost:
    
        r4 = (o.getTopProxy) r2.next();
        r5 = r4.IAuthTabCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d9, code lost:
    
        if (r5 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        r6 = im.toss.features.feed.normal.FeedV2Fragment.isEngagementSignalsApiAvailable + 9;
        im.toss.features.feed.normal.FeedV2Fragment.extraCommand = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e8, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r5) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ea, code lost:
    
        r4 = r4.IAuthTabCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ef, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f0, code lost:
    
        r3.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f4, code lost:
    
        o.RVEngine.onExtraCallback(o.ACPayResult.onWarmupCompleted(), new java.lang.Object[]{r3}, -268409145, o.ACPayResult.onWarmupCompleted(), o.ACPayResult.onWarmupCompleted(), o.ACPayResult.onWarmupCompleted(), 268409149);
        onWarmupCompleted(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0114, code lost:
    
        return;
     */
    @Override // o.getWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(@NotNull View view) {
        Object next;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (!this.asBinder.isEmpty() && this.extraCallbackWithResult && !this.IAuthTabCallback_Parcel) {
            int i2 = extraCommand + 37;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            if (!extraCallback().isShowing()) {
                int i4 = extraCommand + 19;
                isEngagementSignalsApiAvailable = i4 % 128;
                int i5 = i4 % 2;
                createEngine createengine = createEngine.IAuthTabCallback;
                Iterator<T> it = this.asBinder.iterator();
                while (true) {
                    Object obj = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    int i6 = isEngagementSignalsApiAvailable + 65;
                    extraCommand = i6 % 128;
                    if (i6 % 2 == 0) {
                        Intrinsics.areEqual(((getTopProxy) it.next()).IAuthTabCallback(), this.asInterface);
                        obj.hashCode();
                        throw null;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((getTopProxy) next).IAuthTabCallback(), this.asInterface)) {
                        break;
                    }
                }
            }
        }
    }

    public static final class IAuthTabCallbackStubProxy extends AccessibilityDelegateCompat {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ String onWarmupCompleted;

        IAuthTabCallbackStubProxy(String str) {
            this.onWarmupCompleted = str;
        }

        public void onInitializeAccessibilityNodeInfo(View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(suspendAnimationKtExternalSyntheticLambda4, "");
            super.onInitializeAccessibilityNodeInfo(view, suspendAnimationKtExternalSyntheticLambda4);
            suspendAnimationKtExternalSyntheticLambda4.asBinder(FeedV2Fragment.this.getResources().getString(com.google.android.material.R.string.item_view_role_description));
            suspendAnimationKtExternalSyntheticLambda4.readTypedObject(Intrinsics.areEqual(FeedV2Fragment.asInterface(FeedV2Fragment.this), this.onWarmupCompleted));
            int i4 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c A[PHI: r1 r3
      0x008c: PHI (r1v17 android.view.View) = (r1v16 android.view.View), (r1v21 android.view.View) binds: [B:11:0x008a, B:8:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x008c: PHI (r3v6 java.lang.Object) = (r3v5 java.lang.Object), (r3v15 java.lang.Object) binds: [B:11:0x008a, B:8:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008f A[PHI: r1
      0x008f: PHI (r1v19 android.view.View) = (r1v16 android.view.View), (r1v21 android.view.View) binds: [B:11:0x008a, B:8:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(View view) {
        View view2;
        Object tag;
        unload unloadVar;
        Object next;
        int i = 2 % 2;
        int i2 = extraCommand + 77;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        setUnwindFunction setunwindfunctionExtraCallback = extraCallback();
        DisplayMetrics displayMetrics = requireContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(-8, displayMetrics);
        DisplayMetrics displayMetrics2 = requireContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        setUnwindFunction.IAuthTabCallback(setunwindfunctionExtraCallback, view, iOnNavigationEvent, varyMatches.onNavigationEvent(24, displayMetrics2), 0, 8, (Object) null);
        Iterator it = extraCallback().onWarmupCompleted().iterator();
        while (true) {
            String strIAuthTabCallback = null;
            if (!it.hasNext()) {
                break;
            }
            int i4 = extraCommand + 39;
            isEngagementSignalsApiAvailable = i4 % 128;
            if (i4 % 2 != 0) {
                view2 = (View) it.next();
                tag = view2.getTag();
                int i5 = 41 / 0;
                unloadVar = tag instanceof unload ? (unload) tag : null;
            } else {
                view2 = (View) it.next();
                tag = view2.getTag();
                if (tag instanceof unload) {
                }
            }
            if (unloadVar == null) {
                break;
            }
            Iterator<T> it2 = this.asBinder.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.areEqual(((getTopProxy) next).onNavigationEvent(), unloadVar.onExtraCallback())) {
                    int i6 = isEngagementSignalsApiAvailable + 121;
                    extraCommand = i6 % 128;
                    int i7 = i6 % 2;
                    break;
                }
            }
            getTopProxy gettopproxy = (getTopProxy) next;
            if (gettopproxy != null) {
                int i8 = extraCommand + 85;
                isEngagementSignalsApiAvailable = i8 % 128;
                int i9 = i8 % 2;
                strIAuthTabCallback = gettopproxy.IAuthTabCallback();
            }
            ViewCompat.IAuthTabCallback(view2, new IAuthTabCallbackStubProxy(strIAuthTabCallback));
        }
        int i10 = extraCommand + 53;
        isEngagementSignalsApiAvailable = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.getWorker
    public void access000() {
        int i = 2 % 2;
        int i2 = extraCommand + 29;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        trackCheckout trackcheckoutOnNavigationEvent = onNavigationEvent();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        this.writeTypedObject.onNavigationEvent(trackcheckoutOnNavigationEvent.onNavigationEvent(contextRequireContext));
        int i4 = isEngagementSignalsApiAvailable + 85;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 57;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (!(!this.extraCallbackWithResult)) {
            int i4 = isEngagementSignalsApiAvailable + 79;
            extraCommand = i4 % 128;
            int i5 = i4 % 2;
            if (Intrinsics.areEqual(str, this.asInterface)) {
                return;
            }
            int i6 = extraCommand + 23;
            isEngagementSignalsApiAvailable = i6 % 128;
            int i7 = i6 % 2;
            this.onRelationshipValidationResult = true;
            this.ICustomTabsCallbackStubProxy = null;
            onWarmupCompleted(this, str, onActivityLayout(), null, false, true, 12, null);
            int i8 = isEngagementSignalsApiAvailable + 87;
            extraCommand = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    @Override // o.getWorker
    public void onExtraCallback(@NotNull String str, @NotNull String str2) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (this.extraCallbackWithResult) {
            this.onRelationshipValidationResult = true;
            String str3 = this.asInterface;
            if (Intrinsics.areEqual(str2, onActivityLayout())) {
                int i2 = extraCommand;
                int i3 = i2 + 11;
                isEngagementSignalsApiAvailable = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 35;
                isEngagementSignalsApiAvailable = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 5 % 3;
                }
                str2 = null;
            }
            onWarmupCompleted(this, str3, str2, null, false, false, 28, null);
            String str4 = this.asInterface;
            Object[] objArr = new Object[1];
            a(new char[]{'\t', '\r', 18, 16, 1, 20, 16, 23, '\r', '\t'}, (byte) (7 - TextUtils.getOffsetAfter("", 0)), 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            if (Intrinsics.areEqual(str4, ((String) objArr[0]).intern())) {
                int i7 = isEngagementSignalsApiAvailable + 5;
                extraCommand = i7 % 128;
                int i8 = i7 % 2;
                createEngine.IAuthTabCallback.onExtraCallbackWithResult(str);
            }
        }
    }

    private static final void ICustomTabsCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 75;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCommand + 77;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(FeedV2Fragment feedV2Fragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = extraCommand + 99;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(bool);
        feedV2Fragment.readTypedObject = bool.booleanValue();
        feedV2Fragment.ICustomTabsCallback = true;
        FragmentActivity activity = feedV2Fragment.getActivity();
        if (activity != null) {
            int i4 = extraCommand + 53;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            activity.invalidateOptionsMenu();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 9;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = isEngagementSignalsApiAvailable + 79;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final void onUnminimized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 65;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCommand + 65;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(String str) throws Throwable {
        int i;
        int i2 = 2 % 2;
        int i3 = extraCommand + 65;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        switch (str.hashCode()) {
            case -1184259671:
                if (!str.equals("income")) {
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        activity.invalidateOptionsMenu();
                        return;
                    }
                } else if (this.access000 == null) {
                    TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                    maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new access000(this, (access13800) null), 3, (Object) null);
                    return;
                } else {
                    FragmentActivity activity2 = getActivity();
                    if (activity2 != null) {
                        activity2.invalidateOptionsMenu();
                    }
                }
                i = isEngagementSignalsApiAvailable + 43;
                extraCommand = i % 128;
                if (i % 2 != 0) {
                    int i5 = 87 / 0;
                    return;
                }
                return;
            case -1146830912:
                if (!(!str.equals("business"))) {
                    if (this.onWarmupCompleted == null) {
                        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner2 = getViewLifecycleOwner();
                        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
                        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner2), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback_Parcel(this, (access13800) null), 3, (Object) null);
                        return;
                    } else {
                        FragmentActivity activity3 = getActivity();
                        if (activity3 != null) {
                            int i6 = isEngagementSignalsApiAvailable + 115;
                            extraCommand = i6 % 128;
                            int i7 = i6 % 2;
                            activity3.invalidateOptionsMenu();
                            return;
                        }
                    }
                }
                i = isEngagementSignalsApiAvailable + 43;
                extraCommand = i % 128;
                if (i % 2 != 0) {
                }
                break;
            case 106748167:
                if (str.equals("place")) {
                    FragmentActivity activity4 = getActivity();
                    if (activity4 != null) {
                        int i8 = isEngagementSignalsApiAvailable + 21;
                        extraCommand = i8 % 128;
                        if (i8 % 2 != 0) {
                            activity4.invalidateOptionsMenu();
                            return;
                        } else {
                            activity4.invalidateOptionsMenu();
                            obj.hashCode();
                            throw null;
                        }
                    }
                }
                i = isEngagementSignalsApiAvailable + 43;
                extraCommand = i % 128;
                if (i % 2 != 0) {
                }
                break;
            case 1574008798:
                Object[] objArr = new Object[1];
                a(new char[]{'\t', '\r', 18, 16, 1, 20, 16, 23, '\r', '\t'}, (byte) (7 - View.resolveSizeAndState(0, 0, 0)), 10 - Color.argb(0, 0, 0, 0), objArr);
                if (str.equals(((String) objArr[0]).intern())) {
                    if (!this.ICustomTabsCallback) {
                        writeRaw writerawIAuthTabCallback = NestfgetmDriveCxxAnimations.onExtraCallbackWithResult.onExtraCallbackWithResult().IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
                        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(new FeedV2Fragment$.ExternalSyntheticLambda27(new FeedV2Fragment$.ExternalSyntheticLambda26(this)), new FeedV2Fragment$.ExternalSyntheticLambda29(new FeedV2Fragment$.ExternalSyntheticLambda28()));
                        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
                        autoDisposable(deserializeurinullablecollectionOnNavigationEvent);
                        return;
                    }
                    int i9 = extraCommand + 59;
                    isEngagementSignalsApiAvailable = i9 % 128;
                    int i10 = i9 % 2;
                    FragmentActivity activity5 = getActivity();
                    if (activity5 != null) {
                        int i11 = extraCommand + 15;
                        isEngagementSignalsApiAvailable = i11 % 128;
                        if (i11 % 2 == 0) {
                            activity5.invalidateOptionsMenu();
                            return;
                        } else {
                            activity5.invalidateOptionsMenu();
                            int i12 = 95 / 0;
                            return;
                        }
                    }
                }
                i = isEngagementSignalsApiAvailable + 43;
                extraCommand = i % 128;
                if (i % 2 != 0) {
                }
                break;
        }
    }

    public void onExtraCallback(@NotNull Menu menu, @NotNull MenuInflater menuInflater) throws Throwable {
        Pair<Boolean, String> pair;
        Pair<Boolean, String> pair2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(menu, "");
        Intrinsics.checkNotNullParameter(menuInflater, "");
        String str = this.asInterface;
        Object obj = null;
        switch (str.hashCode()) {
            case -1184259671:
                if (str.equals("income")) {
                    TossIncomeNotificationSettingDto tossIncomeNotificationSettingDto = this.access000;
                    if (tossIncomeNotificationSettingDto == null || !Intrinsics.areEqual(tossIncomeNotificationSettingDto.onNavigationEvent(), Boolean.TRUE)) {
                        return;
                    }
                    int i2 = isEngagementSignalsApiAvailable + 121;
                    extraCommand = i2 % 128;
                    int i3 = i2 % 2;
                    menuInflater.inflate(R$menu.menu_feed_v2_income, menu);
                    return;
                }
                break;
            case -1146830912:
                if (str.equals("business")) {
                    int i4 = isEngagementSignalsApiAvailable + 83;
                    extraCommand = i4 % 128;
                    if (i4 % 2 == 0) {
                        pair = this.onWarmupCompleted;
                        int i5 = 83 / 0;
                        if (pair == null) {
                            return;
                        }
                    } else {
                        pair = this.onWarmupCompleted;
                        if (pair == null) {
                            return;
                        }
                    }
                    if (!((Boolean) pair.getFirst()).booleanValue() || (pair2 = this.onWarmupCompleted) == null) {
                        return;
                    }
                    int i6 = extraCommand + 15;
                    isEngagementSignalsApiAvailable = i6 % 128;
                    if (i6 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    String str2 = (String) pair2.getSecond();
                    if (str2 == null || str2.length() <= 0) {
                        return;
                    }
                    menuInflater.inflate(R$menu.menu_feed_v2_business, menu);
                    return;
                }
                break;
            case 3016252:
                if (str.equals("bank")) {
                    menuInflater.inflate(R$menu.menu_feed_v2_bank, menu);
                    return;
                }
                break;
            case 106748167:
                if (str.equals("place")) {
                    menuInflater.inflate(R$menu.menu_feed_v2_place, menu);
                    return;
                }
                break;
            case 1574008798:
                Object[] objArr = new Object[1];
                a(new char[]{'\t', '\r', 18, 16, 1, 20, 16, 23, '\r', '\t'}, (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 7), 10 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
                if (str.equals(((String) objArr[0]).intern())) {
                    if (this.readTypedObject) {
                        menuInflater.inflate(R$menu.menu_feed_v2_securities, menu);
                        return;
                    }
                    return;
                }
                break;
        }
        if (((getPricingPhaseList) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1741859495, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this}, 1741859509, getPreRenderJob.onNavigationEvent.IAuthTabCallback())) != getPricingPhaseList.KR) {
            int i7 = isEngagementSignalsApiAvailable + 67;
            extraCommand = i7 % 128;
            if (i7 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (!this.access100) {
                return;
            }
        }
        menuInflater.inflate(R$menu.menu_feed_v2_all, menu);
    }

    public boolean IAuthTabCallback(@NotNull MenuItem menuItem) throws Throwable {
        String str;
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{4, '\n', '\t', 19, 13920, 13920, '\n', 4}, (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 119), 8 - Color.blue(0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Intrinsics.checkNotNullParameter(menuItem, "");
        int itemId = menuItem.getItemId();
        Object obj = null;
        if (itemId == R$id.all_notification_setting) {
            int i2 = isEngagementSignalsApiAvailable + 61;
            extraCommand = i2 % 128;
            int i3 = i2 % 2;
            RVEngine.onNavigationEvent(getString(R.string.feed_v2_all_setting), (String) null, 2, (Object) null);
            Object[] objArr2 = new Object[1];
            a(new char[]{5, 18, 24, '\f', 3, 15, '\r', 7, 7, 3, 13856, 13856, '\t', '\r', 13913, 13913, 23, 11, 3, 6, '\b', 11, '\r', 17, 24, 1, 22, 16, '\r', 16, 22, 11, 13919}, (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 107), 33 - View.resolveSize(0, 0), objArr2);
            onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 117032004, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this, convertAnyToMap.onExtraCallback(((String) objArr2[0]).intern(), strIntern, "feed_settings")}, -117031995, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
            return true;
        }
        if (itemId == R$id.bank_notification_setting) {
            int i4 = isEngagementSignalsApiAvailable + 91;
            extraCommand = i4 % 128;
            int i5 = i4 % 2;
            RVEngine.onNavigationEvent((String) null, "bank_feed", 1, (Object) null);
            onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 117032004, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this, convertAnyToMap.onExtraCallback(DERSet.onExtraCallback.registerForActivityResult(), strIntern, "bank_feed")}, -117031995, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
            int i6 = isEngagementSignalsApiAvailable + 113;
            extraCommand = i6 % 128;
            if (i6 % 2 != 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }
        if (itemId == R$id.income_notification_setting) {
            RVEngine.onNavigationEvent((String) null, "income_feed", 1, (Object) null);
            TossIncomeNotificationSettingDto tossIncomeNotificationSettingDto = this.access000;
            if (tossIncomeNotificationSettingDto != null && (strOnExtraCallbackWithResult = tossIncomeNotificationSettingDto.onExtraCallbackWithResult()) != null) {
                int i7 = isEngagementSignalsApiAvailable + 21;
                extraCommand = i7 % 128;
                int i8 = i7 % 2;
                onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 117032004, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this, convertAnyToMap.onExtraCallback(strOnExtraCallbackWithResult, strIntern, "income_feed")}, -117031995, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
            }
            return true;
        }
        if (itemId == R$id.business_notification_setting) {
            RVEngine.onNavigationEvent((String) null, "business_feed", 1, (Object) null);
            Pair<Boolean, String> pair = this.onWarmupCompleted;
            if (pair != null && (str = (String) pair.getSecond()) != null) {
                int i9 = isEngagementSignalsApiAvailable + 89;
                extraCommand = i9 % 128;
                if (i9 % 2 == 0) {
                    onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 117032004, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this, convertAnyToMap.onExtraCallback(str, strIntern, "business_feed")}, -117031995, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
                    throw null;
                }
                onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 117032004, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this, convertAnyToMap.onExtraCallback(str, strIntern, "business_feed")}, -117031995, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
            }
            return true;
        }
        if (itemId == R$id.securities_notification_setting) {
            Object[] objArr3 = new Object[1];
            a(new char[]{16, 23, 23, '\b', 13873}, (byte) (50 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 6, objArr3);
            onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 117032004, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this, convertAnyToMap.onExtraCallback(convertAnyToMap.onExtraCallback(convertAnyToMap.onExtraCallback(convertAnyToMap.onExtraCallback(convertAnyToMap.onExtraCallback(convertAnyToMap.onExtraCallback(convertAnyToMap.onExtraCallback("securitiestoss://settings/notifications", ((String) objArr3[0]).intern(), "hide"), "_transparent", "adaptive"), "_isTransitionEnabled", "false"), strIntern, "feed"), "utm_source", "tosscore"), "utm_medium", "feed_securities"), "utm_campaign", "home_notifications")}, -117031995, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
            createEngine.IAuthTabCallback.IAuthTabCallbackDefault(String.valueOf(menuItem.getTitle()));
            return true;
        }
        if (itemId != R$id.place_notification_setting) {
            return false;
        }
        RVEngine.onNavigationEvent((String) null, "place_feed", 1, (Object) null);
        onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 117032004, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this, convertAnyToMap.onExtraCallback((String) DERSet.onExtraCallback(502600560, new Object[]{DERSet.onExtraCallback}, -502600550, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback()), strIntern, "place_feed")}, -117031995, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        return true;
    }

    public void onDestroy() {
        int i = 2 % 2;
        int i2 = extraCommand + 91;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        getRenderById getrenderbyid = this.onExtraCallbackWithResult;
        if (getrenderbyid != null) {
            int i5 = i3 + 125;
            extraCommand = i5 % 128;
            if (i5 % 2 != 0) {
                getRenderById.onNavigationEvent(new Object[]{getrenderbyid}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -1907309341, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 1907309341);
            } else {
                getRenderById.onNavigationEvent(new Object[]{getrenderbyid}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -1907309341, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 1907309341);
                throw null;
            }
        }
        super.onDestroy();
    }

    private final String readTypedObject() {
        int i = 2 % 2;
        int i2 = extraCommand + 59;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = addPolicy.getSmallIconBitmap().onExtraCallbackWithResult("feedAdNotificationExposedAt", "");
        int i4 = isEngagementSignalsApiAvailable + 47;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void onExtraCallback(FeedV2Fragment feedV2Fragment, String str, long j, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = extraCommand + 3;
        int i4 = i3 % 128;
        isEngagementSignalsApiAvailable = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 5;
            extraCommand = i6 % 128;
            int i7 = i6 % 2;
            j = -1;
        }
        Object[] objArr = {feedV2Fragment, str, Long.valueOf(j)};
        onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -70898429, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), objArr, 70898445, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        FeedV2Fragment feedV2Fragment = (FeedV2Fragment) objArr[0];
        String str = (String) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        int i = 2 % 2;
        int i2 = extraCommand + 53;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (jLongValue == -1) {
            jLongValue = feedV2Fragment.asBinder().asBinder().getTime();
        }
        addPolicy.getSmallIconBitmap().onNavigationEvent("feedAdNotificationExposedAt", str + "," + jLongValue);
        int i3 = extraCommand + 43;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final boolean onExtraCallback(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 121;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            if (str.length() == 0) {
                return false;
            }
            try {
                List listSplit$default = StringsKt.split$default(readTypedObject(), new String[]{","}, false, 0, 6, (Object) null);
                String str2 = (String) listSplit$default.get(0);
                String str3 = (String) listSplit$default.get(1);
                if (Intrinsics.areEqual(str2, str)) {
                    return asBinder().asBinder().getTime() - Long.parseLong(str3) < 86400000;
                }
                int i3 = extraCommand + 19;
                isEngagementSignalsApiAvailable = i3 % 128;
                int i4 = i3 % 2;
                onExtraCallback(this, str, 0L, 2, null);
                return true;
            } catch (Throwable unused) {
                onExtraCallback(this, str, 0L, 2, null);
                return true;
            }
        }
        str.length();
        throw null;
    }

    public void onRetry() {
        int i = 2 % 2;
        int i2 = extraCommand + 107;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(this, this.asInterface, onActivityLayout(), null, true, false, 20, null);
        int i4 = extraCommand + 45;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 2130768063, iIAuthTabCallback2, new Object[]{function1, obj}, -2130768039, iIAuthTabCallback3);
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -18776907, iIAuthTabCallback2, new Object[]{function1, obj}, 18776924, iIAuthTabCallback3);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1728495706, iIAuthTabCallback2, new Object[]{function1, obj}, 1728495713, iIAuthTabCallback3);
    }

    public static /* synthetic */ Unit IAuthTabCallback(FeedV2Fragment feedV2Fragment, Unit unit) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (Unit) onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1050101511, iIAuthTabCallback2, new Object[]{feedV2Fragment, unit}, -1050101511, iIAuthTabCallback3);
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1964742202, iIAuthTabCallback2, new Object[]{function1, obj}, -1964742194, iIAuthTabCallback3);
    }

    public static /* synthetic */ logEvent onWarmupCompleted(String str, boolean z, boolean z2, InboxV2Resp inboxV2Resp) {
        Object[] objArr = {str, Boolean.valueOf(z), Boolean.valueOf(z2), inboxV2Resp};
        return (logEvent) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1824927203, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), objArr, 1824927218, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    public static final /* synthetic */ HashSet IAuthTabCallbackDefault(FeedV2Fragment feedV2Fragment) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (HashSet) onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -111311679, iIAuthTabCallback2, new Object[]{feedV2Fragment}, 111311697, iIAuthTabCallback3);
    }

    public static final /* synthetic */ void onExtraCallback(FeedV2Fragment feedV2Fragment, boolean z) throws Throwable {
        Object[] objArr = {feedV2Fragment, Boolean.valueOf(z)};
        onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -818795066, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), objArr, 818795071, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    public static final /* synthetic */ void onExtraCallback(FeedV2Fragment feedV2Fragment, getClientExtendConfig getclientextendconfig) throws Throwable {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1195296605, iIAuthTabCallback2, new Object[]{feedV2Fragment, getclientextendconfig}, 1195296625, iIAuthTabCallback3);
    }

    private final String extraCallbackWithResult() {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (String) onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1311589470, iIAuthTabCallback2, new Object[]{this}, -1311589442, iIAuthTabCallback3);
    }

    private final void onMinimized() throws Throwable {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 753111797, iIAuthTabCallback2, new Object[]{this}, -753111787, iIAuthTabCallback3);
    }

    private static final Unit onWarmupCompleted(FeedV2Fragment feedV2Fragment, Boolean bool) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (Unit) onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 636168311, iIAuthTabCallback2, new Object[]{feedV2Fragment, bool}, -636168308, iIAuthTabCallback3);
    }

    private static final void ICustomTabsCallback(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -577433282, iIAuthTabCallback2, new Object[]{function1, obj}, 577433309, iIAuthTabCallback3);
    }

    private static final Unit IAuthTabCallbackStub(Throwable th) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (Unit) onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 108691261, iIAuthTabCallback2, new Object[]{th}, -108691240, iIAuthTabCallback3);
    }

    private final void onPostMessage() throws Throwable {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -608724895, iIAuthTabCallback2, new Object[]{this}, 608724921, iIAuthTabCallback3);
    }

    private static final void readTypedObject(FeedV2Fragment feedV2Fragment) throws Throwable {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1876217048, iIAuthTabCallback2, new Object[]{feedV2Fragment}, 1876217061, iIAuthTabCallback3);
    }

    private static final Unit IAuthTabCallback(FeedV2Fragment feedV2Fragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (Unit) onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1549246267, iIAuthTabCallback2, new Object[]{feedV2Fragment, deserializeurinullablecollection}, 1549246273, iIAuthTabCallback3);
    }

    private static final Unit onExtraCallbackWithResult(EngineStack engineStack, FeedV2Fragment feedV2Fragment, InboxV2OthersResp inboxV2OthersResp) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (Unit) onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -625549268, iIAuthTabCallback2, new Object[]{engineStack, feedV2Fragment, inboxV2OthersResp}, 625549280, iIAuthTabCallback3);
    }

    private final void onWarmupCompleted(String str, String str2, String str3, boolean z, boolean z2) throws Throwable {
        Object[] objArr = {this, str, str2, str3, Boolean.valueOf(z), Boolean.valueOf(z2)};
        onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 391681152, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), objArr, -391681141, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final void onMessageChannelReady(FeedV2Fragment feedV2Fragment) throws Throwable {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 307570310, iIAuthTabCallback2, new Object[]{feedV2Fragment}, -307570291, iIAuthTabCallback3);
    }

    private static final logEvent onExtraCallbackWithResult(String str, boolean z, boolean z2, InboxV2Resp inboxV2Resp) {
        Object[] objArr = {str, Boolean.valueOf(z), Boolean.valueOf(z2), inboxV2Resp};
        return (logEvent) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1899186243, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), objArr, -1899186218, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final Unit asBinder(FeedV2Fragment feedV2Fragment, Throwable th) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (Unit) onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1659761694, iIAuthTabCallback2, new Object[]{feedV2Fragment, th}, 1659761698, iIAuthTabCallback3);
    }

    private final void onNavigationEvent(String str) throws Throwable {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 117032004, iIAuthTabCallback2, new Object[]{this, str}, -117031995, iIAuthTabCallback3);
    }

    private final void onWarmupCompleted(String str, long j) throws Throwable {
        Object[] objArr = {this, str, Long.valueOf(j)};
        onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -70898429, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), objArr, 70898445, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private final void IAuthTabCallback(boolean z) throws Throwable {
        Object[] objArr = {this, Boolean.valueOf(z)};
        onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1631989959, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), objArr, 1631989960, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallbackDefault(Throwable th) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (Unit) onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1289261850, iIAuthTabCallback2, new Object[]{th}, 1289261873, iIAuthTabCallback3);
    }

    public final updateAdInfo onWarmupCompleted() {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (updateAdInfo) onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -284153440, iIAuthTabCallback2, new Object[]{this}, 284153462, iIAuthTabCallback3);
    }

    public final updateLoadParamUrl IAuthTabCallback() {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (updateLoadParamUrl) onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1841425355, iIAuthTabCallback2, new Object[]{this}, 1841425357, iIAuthTabCallback3);
    }

    public final getPricingPhaseList asInterface() {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (getPricingPhaseList) onNavigationEvent(iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1741859495, iIAuthTabCallback2, new Object[]{this}, 1741859509, iIAuthTabCallback3);
    }

    static void IAuthTabCallback_Parcel() {
        ICustomTabsCallbackStub = new char[]{64961, 64980, 64905, 64991, 64981, 64990, 64924, 64965, 64960, 64970, 64985, 64978, 64988, 64989, 64982, 64966, 64984, 64976, 64967, 65010, 64962, 64986, 64963, 65016, 64964};
        ICustomTabsService = (char) 51244;
    }
}
