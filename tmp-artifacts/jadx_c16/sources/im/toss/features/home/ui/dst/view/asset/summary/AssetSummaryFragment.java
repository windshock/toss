package im.toss.features.home.ui.dst.view.asset.summary;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.features.home.core.ui.recyclerview.HomeDstRecyclerView;
import im.toss.features.home.core.ui.recyclerview.HomeRecyclerView;
import im.toss.features.home.core.ui.widget.HomeDstView;
import im.toss.features.home.ui.R;
import im.toss.features.home.ui.dst.view.asset.summary.AssetSummaryFragment$;
import im.toss.features.home.ui.dst.view.asset.summary.AssetSummaryFragment$hideTooltipAfterDelay$1$1$;
import im.toss.features.home.ui.dst.view.asset.summary.AssetSummaryViewModel;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.AssetTriumphAnimationView;
import im.toss.uikit.widget.PillarSwipeRefreshLayout;
import im.toss.uikit.widget.TdsSkeletonV1View;
import im.toss.uikit.widget.TdsTooltipV1View;
import im.toss.uikit.widget.tooltip.TdsBubbleTooltipLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.ActionSheetBridgeExtension2;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppLovinSdkSettings;
import o.AutoCallback;
import o.BaseEmbedView;
import o.ConnectionLog;
import o.ConvertFloatArrayToByteArray;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.IIpcChannelStub;
import o.LogType;
import o.RVManifestBridgeExtensionManifest;
import o.RVManifestIProxyManifest;
import o.RVManifestWrapper;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.WebSocketDataChannel;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access14600;
import o.access15400;
import o.deprecated_certificatePinner;
import o.doInitialize;
import o.fillData;
import o.findResAndMsg;
import o.formatMsgs;
import o.generateInviteUrl;
import o.getAdService;
import o.getCornerRadius;
import o.getExtra;
import o.getExtraParameters;
import o.getKekid;
import o.getPackageType;
import o.getSingleViewMap;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.isFireOS;
import o.isMuted;
import o.makeErrorNo;
import o.maxAgeSeconds;
import o.maybeRemoveAttachStateListener;
import o.maybeUpdateAnimatable;
import o.onRenderReady;
import o.readIntokhttp;
import o.setBodyokhttp;
import o.setRandomHost;
import o.setResourceInternal;
import o.setShine;
import o.setTagsokhttp;
import o.transparentBackground;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AssetSummaryFragment extends Hilt_AssetSummaryFragment<WebSocketDataChannel, AssetSummaryViewModel, RVManifestIProxyManifest> implements ConnectionLog.IAuthTabCallback {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int extraCallbackWithResult = 0;
    private static int getInterfaceDescriptor = 0;
    private static int readTypedObject = 1;
    private final List<View> IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private final List<Pair<String, TdsTooltipV1View>> IAuthTabCallbackStub;
    private final ICustomTabsCallbackStubProxy IAuthTabCallback_Parcel;
    private AssetTriumphAnimationView access000;
    private final Lazy access100;
    private final String asBinder;
    private Rally asInterface;
    private final getCornerRadius<onNavigationEvent> onExtraCallback;
    private boolean onTransact;
    public static final onWarmupCompleted Companion = new onWarmupCompleted((DefaultConstructorMarker) null);
    public static final int onExtraCallbackWithResult = 8;

    static {
        int i = readTypedObject + 27;
        extraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        AssetSummaryFragment assetSummaryFragment = (AssetSummaryFragment) objArr[0];
        WebSocketDataChannel webSocketDataChannel = (WebSocketDataChannel) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 121;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(assetSummaryFragment, webSocketDataChannel);
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        int i5 = getInterfaceDescriptor + 67;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        AssetSummaryFragment assetSummaryFragment = (AssetSummaryFragment) objArr[0];
        TdsBubbleTooltipLayout tdsBubbleTooltipLayout = (TdsBubbleTooltipLayout) objArr[1];
        fillData filldata = (fillData) objArr[2];
        View view = (View) objArr[3];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(assetSummaryFragment, tdsBubbleTooltipLayout, filldata, view);
        int i4 = IAuthTabCallbackStubProxy + 59;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(AssetSummaryFragment assetSummaryFragment, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {assetSummaryFragment, view};
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent4 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        if (i3 == 0) {
            onNavigationEvent(iOnNavigationEvent4, iOnNavigationEvent, objArr, 886716768, iOnNavigationEvent2, -886716761, iOnNavigationEvent3);
            throw null;
        }
        onNavigationEvent(iOnNavigationEvent4, iOnNavigationEvent, objArr, 886716768, iOnNavigationEvent2, -886716761, iOnNavigationEvent3);
        int i4 = IAuthTabCallbackStubProxy + 21;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(AssetSummaryFragment assetSummaryFragment, FrameLayout frameLayout, TdsTooltipV1View tdsTooltipV1View, int[] iArr, int i, HomeRecyclerView homeRecyclerView) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 109;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted(assetSummaryFragment, frameLayout, tdsTooltipV1View, iArr, i, homeRecyclerView);
        int i5 = IAuthTabCallbackStubProxy + 45;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallback(AssetSummaryFragment assetSummaryFragment, TdsTooltipV1View tdsTooltipV1View, fillData filldata, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(assetSummaryFragment, tdsTooltipV1View, filldata, view);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AssetSummaryFragment assetSummaryFragment, TdsTooltipV1View tdsTooltipV1View) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(assetSummaryFragment, tdsTooltipV1View);
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(SwipeRefreshLayout swipeRefreshLayout, AssetSummaryFragment assetSummaryFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(swipeRefreshLayout, assetSummaryFragment);
        int i4 = getInterfaceDescriptor + 33;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(AssetSummaryFragment assetSummaryFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel(assetSummaryFragment);
        int i4 = IAuthTabCallbackStubProxy + 91;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i3 | i2);
        int i9 = (~((~i2) | i3)) | (~(i3 | i5));
        int i10 = i3 + i5 + i4 + (32217706 * i6) + (238734613 * i);
        int i11 = i10 * i10;
        int i12 = (((-3446596) * i3) - 528416768) + (677943110 * i5) + (i8 * 1806788795) + ((-1806788795) * i7) + (1806788795 * i9) + ((-1810235392) * i4) + ((-154927104) * i6) + ((-131989504) * i) + ((-1876361216) * i11);
        int i13 = ((i3 * 1127137324) - 440746823) + (i5 * 1127135646) + (i8 * 839) + (i7 * (-839)) + (i9 * 839) + (i4 * 1127136485) + (i6 * 976419026) + (i * 1106960329) + (i11 * 279773184);
        switch (i12 + (i13 * i13 * (-1943076864))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                AssetSummaryFragment assetSummaryFragment = (AssetSummaryFragment) objArr[0];
                AssetTriumphAnimationView assetTriumphAnimationView = (AssetTriumphAnimationView) objArr[1];
                int i14 = 2 % 2;
                int i15 = getInterfaceDescriptor;
                int i16 = i15 + 27;
                IAuthTabCallbackStubProxy = i16 % 128;
                int i17 = i16 % 2;
                assetSummaryFragment.access000 = assetTriumphAnimationView;
                int i18 = i15 + 91;
                IAuthTabCallbackStubProxy = i18 % 128;
                int i19 = i18 % 2;
                return null;
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return asInterface(objArr);
            case 10:
                return asBinder(objArr);
            case 11:
                return getInterfaceDescriptor(objArr);
            case 12:
                return access000(objArr);
            case 13:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                return access100(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(view);
        int i4 = IAuthTabCallbackStubProxy + 83;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(AssetSummaryFragment assetSummaryFragment, AssetSummaryViewModel.UpdatedAccount updatedAccount) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 77;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(assetSummaryFragment, updatedAccount);
        int i4 = IAuthTabCallbackStubProxy + 45;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AssetSummaryFragment assetSummaryFragment, AssetSummaryViewModel.UpdatedAccount updatedAccount) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            asBinder(assetSummaryFragment, updatedAccount);
            obj.hashCode();
            throw null;
        }
        Unit unitAsBinder = asBinder(assetSummaryFragment, updatedAccount);
        int i3 = IAuthTabCallbackStubProxy + 77;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return unitAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(AssetSummaryFragment assetSummaryFragment, WebSocketDataChannel webSocketDataChannel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(assetSummaryFragment, webSocketDataChannel);
        int i4 = IAuthTabCallbackStubProxy + 125;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return 1000712L;
        }
        throw null;
    }

    public static final /* synthetic */ Object IAuthTabCallback(AssetSummaryFragment assetSummaryFragment, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        Object objOnNavigationEvent = onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, new Object[]{assetSummaryFragment, access13800Var}, -329781733, iOnNavigationEvent2, 329781735, iOnNavigationEvent3);
        int i4 = IAuthTabCallbackStubProxy + 37;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    public static final /* synthetic */ List IAuthTabCallback(AssetSummaryFragment assetSummaryFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 123;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        List<View> list = assetSummaryFragment.IAuthTabCallback;
        int i5 = i2 + 15;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return list;
    }

    public static final /* synthetic */ void IAuthTabCallback(AssetSummaryFragment assetSummaryFragment, AssetSummaryViewModel.UpdatedAccount updatedAccount) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {assetSummaryFragment, updatedAccount};
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent4 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        if (i3 != 0) {
            onNavigationEvent(iOnNavigationEvent4, iOnNavigationEvent, objArr, 1531970833, iOnNavigationEvent2, -1531970833, iOnNavigationEvent3);
            int i4 = 99 / 0;
        } else {
            onNavigationEvent(iOnNavigationEvent4, iOnNavigationEvent, objArr, 1531970833, iOnNavigationEvent2, -1531970833, iOnNavigationEvent3);
        }
        int i5 = IAuthTabCallbackStubProxy + 99;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ String IAuthTabCallbackDefault(AssetSummaryFragment assetSummaryFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            assetSummaryFragment.IAuthTabCallbackDefault();
            throw null;
        }
        String strIAuthTabCallbackDefault = assetSummaryFragment.IAuthTabCallbackDefault();
        int i3 = getInterfaceDescriptor + 111;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return strIAuthTabCallbackDefault;
    }

    public static final /* synthetic */ boolean IAuthTabCallbackStub(AssetSummaryFragment assetSummaryFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean z = assetSummaryFragment.onTransact;
        if (i3 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ AssetTriumphAnimationView IAuthTabCallbackStubProxy(AssetSummaryFragment assetSummaryFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 77;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        AssetTriumphAnimationView assetTriumphAnimationView = assetSummaryFragment.access000;
        int i5 = i2 + 95;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return assetTriumphAnimationView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        AssetSummaryFragment assetSummaryFragment = (AssetSummaryFragment) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            assetSummaryFragment.asInterface();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TdsSkeletonV1View tdsSkeletonV1ViewAsInterface = assetSummaryFragment.asInterface();
        int i3 = IAuthTabCallbackStubProxy + 105;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 62 / 0;
        }
        return tdsSkeletonV1ViewAsInterface;
    }

    public static final /* synthetic */ void access000(AssetSummaryFragment assetSummaryFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        assetSummaryFragment.newSessionWithExtras();
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 11;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ getPackageType access100(AssetSummaryFragment assetSummaryFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        getPackageType getpackagetypeReceiveFile = assetSummaryFragment.receiveFile();
        int i4 = IAuthTabCallbackStubProxy + 11;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return getpackagetypeReceiveFile;
    }

    public static final /* synthetic */ List asBinder(AssetSummaryFragment assetSummaryFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        List<Pair<String, TdsTooltipV1View>> list = assetSummaryFragment.IAuthTabCallbackStub;
        int i5 = i3 + 117;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        AssetSummaryFragment assetSummaryFragment = (AssetSummaryFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        WebSocketDataChannel webSocketDataChannelOnExtraCallback = assetSummaryFragment.onExtraCallback();
        if (i3 == 0) {
            return webSocketDataChannelOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void getInterfaceDescriptor(AssetSummaryFragment assetSummaryFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        assetSummaryFragment.requestPostMessageChannel();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Rally onExtraCallback(AssetSummaryFragment assetSummaryFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 25;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Rally rally = assetSummaryFragment.asInterface;
        if (i4 == 0) {
            int i5 = 69 / 0;
        }
        int i6 = i2 + 85;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 95 / 0;
        }
        return rally;
    }

    public static final /* synthetic */ void onExtraCallback(AssetSummaryFragment assetSummaryFragment, AssetSummaryViewModel.UpdatedAccount updatedAccount) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        assetSummaryFragment.onNavigationEvent(updatedAccount);
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AssetSummaryFragment assetSummaryFragment = (AssetSummaryFragment) objArr[0];
        List<ActionSheetBridgeExtension2> list = (List) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        assetSummaryFragment.onWarmupCompleted(list);
        if (i3 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Unit onExtraCallbackWithResult(AssetSummaryFragment assetSummaryFragment, int i, AssetSummaryViewModel.UpdatedAccount updatedAccount) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 31;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {assetSummaryFragment, Integer.valueOf(i), updatedAccount};
        if (i4 == 0) {
            return (Unit) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, -147054479, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 147054493, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean onExtraCallbackWithResult(AssetSummaryFragment assetSummaryFragment, RecyclerView recyclerView) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = assetSummaryFragment.onWarmupCompleted(recyclerView);
        int i4 = getInterfaceDescriptor + 51;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AssetSummaryFragment assetSummaryFragment = (AssetSummaryFragment) objArr[0];
        AssetSummaryViewModel.UpdatedAccount updatedAccount = (AssetSummaryViewModel.UpdatedAccount) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {assetSummaryFragment, updatedAccount};
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent4 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        if (i3 == 0) {
            onNavigationEvent(iOnNavigationEvent4, iOnNavigationEvent, objArr2, -273320070, iOnNavigationEvent2, 273320081, iOnNavigationEvent3);
            obj.hashCode();
            throw null;
        }
        onNavigationEvent(iOnNavigationEvent4, iOnNavigationEvent, objArr2, -273320070, iOnNavigationEvent2, 273320081, iOnNavigationEvent3);
        int i4 = getInterfaceDescriptor + 73;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(AssetSummaryFragment assetSummaryFragment, TdsBubbleTooltipLayout tdsBubbleTooltipLayout) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        assetSummaryFragment.IAuthTabCallback(tdsBubbleTooltipLayout);
        if (i3 != 0) {
            throw null;
        }
        int i4 = getInterfaceDescriptor + 115;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(AssetSummaryFragment assetSummaryFragment, fillData.asBinder.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        assetSummaryFragment.onNavigationEvent(onextracallbackwithresult);
        if (i3 != 0) {
            throw null;
        }
        int i4 = getInterfaceDescriptor + 81;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ HomeRecyclerView onTransact(AssetSummaryFragment assetSummaryFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return assetSummaryFragment.onMinimized();
        }
        assetSummaryFragment.onMinimized();
        throw null;
    }

    public static final /* synthetic */ Unit onWarmupCompleted(AssetSummaryFragment assetSummaryFragment, String str, String str2, fillData filldata, int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 41;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            assetSummaryFragment.onNavigationEvent(str, str2, filldata, i);
            throw null;
        }
        Unit unitOnNavigationEvent = assetSummaryFragment.onNavigationEvent(str, str2, filldata, i);
        int i4 = IAuthTabCallbackStubProxy + 33;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static final /* synthetic */ getCornerRadius onWarmupCompleted(AssetSummaryFragment assetSummaryFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 109;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<onNavigationEvent> getcornerradius = assetSummaryFragment.onExtraCallback;
        int i5 = i2 + 61;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return getcornerradius;
        }
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(AssetSummaryFragment assetSummaryFragment, View view, getSingleViewMap.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 113;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        assetSummaryFragment.onNavigationEvent(view, onextracallbackwithresult);
        int i4 = getInterfaceDescriptor + 95;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
    }

    public /* synthetic */ AutoCallback IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        AssetSummaryViewModel assetSummaryViewModelOnNavigationEvent = onNavigationEvent();
        int i4 = IAuthTabCallbackStubProxy + 109;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return assetSummaryViewModelOnNavigationEvent;
    }

    public static final class ICustomTabsCallbackDefault implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public ICustomTabsCallbackDefault(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = IAuthTabCallback + 103;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 0 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            throw null;
        }
    }

    /* renamed from: im.toss.features.home.ui.dst.view.asset.summary.AssetSummaryFragment$5, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function1<View, WebSocketDataChannel> {
        public static final AnonymousClass5 IAuthTabCallback = new AnonymousClass5();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        AnonymousClass5() {
            super(1, WebSocketDataChannel.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/home/ui/databinding/HomeFragmentAssetSummaryBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            WebSocketDataChannel webSocketDataChannelOnExtraCallback = onExtraCallback((View) obj);
            int i4 = onNavigationEvent + 1;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return webSocketDataChannelOnExtraCallback;
        }

        public final WebSocketDataChannel onExtraCallback(View view) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            WebSocketDataChannel webSocketDataChannelOnExtraCallbackWithResult = WebSocketDataChannel.onExtraCallbackWithResult(view);
            int i4 = onNavigationEvent + 1;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return webSocketDataChannelOnExtraCallbackWithResult;
            }
            throw null;
        }
    }

    public AssetSummaryFragment() {
        super(R.layout.home_fragment_asset_summary, AnonymousClass5.IAuthTabCallback);
        this.asBinder = "asset";
        Lazy lazyOnNavigationEvent = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onMessageChannelReady(new onPostMessage(this)));
        this.access100 = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(AssetSummaryViewModel.class), new onActivityLayout(lazyOnNavigationEvent), new onActivityResized(null, lazyOnNavigationEvent), new onRelationshipValidationResult(this, lazyOnNavigationEvent));
        this.IAuthTabCallback = new ArrayList();
        this.IAuthTabCallbackStub = new ArrayList();
        this.onExtraCallback = setShine.onNavigationEvent((Object) null);
        this.IAuthTabCallback_Parcel = new ICustomTabsCallbackStubProxy();
    }

    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 43;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.asBinder;
        int i4 = i2 + 11;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
        return str;
    }

    protected AssetSummaryViewModel onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        AssetSummaryViewModel assetSummaryViewModel = (AssetSummaryViewModel) this.access100.getValue();
        int i4 = IAuthTabCallbackStubProxy + 25;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return assetSummaryViewModel;
    }

    public void onCreate(@Nullable Bundle bundle) {
        boolean z;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            super.onCreate(bundle);
            z = false;
        } else {
            super.onCreate(bundle);
            z = true;
        }
        setHasOptionsMenu(z);
    }

    public static final class IAuthTabCallback_Parcel implements View.OnAttachStateChangeListener {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ HomeDstRecyclerView IAuthTabCallback;
        final /* synthetic */ View onExtraCallback;
        final /* synthetic */ AssetSummaryFragment onWarmupCompleted;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }

        public IAuthTabCallback_Parcel(View view, AssetSummaryFragment assetSummaryFragment, HomeDstRecyclerView homeDstRecyclerView) {
            this.onExtraCallback = view;
            this.onWarmupCompleted = assetSummaryFragment;
            this.IAuthTabCallback = homeDstRecyclerView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            this.onExtraCallback.removeOnAttachStateChangeListener(this);
            TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = this.onWarmupCompleted.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            Object obj = null;
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStubProxy(this.IAuthTabCallback, null), 3, (Object) null);
            int i2 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            isEngagementSignalsApiAvailable();
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, new Object[]{this}, -19859561, iOnNavigationEvent2, 19859569, iOnNavigationEvent3);
            int iOnNavigationEvent4 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent5 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent6 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent4, new Object[]{this}, -362617958, iOnNavigationEvent5, 362617971, iOnNavigationEvent6);
            extraCommand();
            return;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        isEngagementSignalsApiAvailable();
        int iOnNavigationEvent7 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent8 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent9 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent7, new Object[]{this}, -19859561, iOnNavigationEvent8, 19859569, iOnNavigationEvent9);
        int iOnNavigationEvent10 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent11 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent12 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent10, new Object[]{this}, -362617958, iOnNavigationEvent11, 362617971, iOnNavigationEvent12);
        extraCommand();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onPostMessage extends Lambda implements Function0<Fragment> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onPostMessage(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Fragment fragmentOnWarmupCompleted = onWarmupCompleted();
            if (i3 != 0) {
                int i4 = 92 / 0;
            }
            return fragmentOnWarmupCompleted;
        }

        public final Fragment onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Fragment fragment = this.$this_viewModels;
            int i5 = i3 + 73;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return fragment;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        AssetSummaryFragment assetSummaryFragment = (AssetSummaryFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            assetSummaryFragment.newSession();
            assetSummaryFragment.newAuthTabSession();
            assetSummaryFragment.postMessage();
            assetSummaryFragment.prefetch();
            int i3 = 88 / 0;
            return null;
        }
        assetSummaryFragment.newSession();
        assetSummaryFragment.newAuthTabSession();
        assetSummaryFragment.postMessage();
        assetSummaryFragment.prefetch();
        return null;
    }

    public static final class onMessageChannelReady extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onMessageChannelReady(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent = onNavigationEvent();
            int i4 = IAuthTabCallback + 103;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0 = (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
            int i3 = IAuthTabCallback + 55;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 83 / 0;
            }
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda0;
        }
    }

    public static final class onActivityLayout extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onActivityLayout(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onNavigationEvent();
            }
            onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
            int i4 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return viewModelStore;
            }
            throw null;
        }
    }

    public static final class onActivityResized extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onActivityResized(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnNavigationEvent = onNavigationEvent();
            int i4 = onExtraCallback + 13;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnNavigationEvent;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 19;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Function0 function0 = this.$extrasProducer;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6 = null;
            if (function0 != null) {
                int i5 = i2 + 111;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                }
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            if (androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                int i6 = onExtraCallback + 13;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                textFieldKeyInputExternalSyntheticLambda6 = (TextFieldKeyInputExternalSyntheticLambda6) androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent;
            }
            if (textFieldKeyInputExternalSyntheticLambda6 == null) {
                return AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
            }
            int i8 = onWarmupCompleted + 61;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras();
        }
    }

    public static final class onRelationshipValidationResult extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onRelationshipValidationResult(Fragment fragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = IAuthTabCallback + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedOnExtraCallbackWithResult;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        
            if (r0 != null) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        
            if (r0 != null) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        
            return r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ViewModelProvider.onWarmupCompleted onExtraCallbackWithResult() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onExtraCallback = i2 % 128;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6 = null;
            if (i2 % 2 == 0) {
                boolean z = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate) instanceof TextFieldKeyInputExternalSyntheticLambda6;
                throw null;
            }
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                int i3 = IAuthTabCallback + 125;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    textFieldKeyInputExternalSyntheticLambda6.hashCode();
                    throw null;
                }
                textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
            }
            if (textFieldKeyInputExternalSyntheticLambda6 != null) {
                int i4 = onExtraCallback + 107;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory();
                    int i5 = 29 / 0;
                } else {
                    defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory();
                }
            }
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
            return defaultViewModelProviderFactory2;
        }
    }

    private final void postMessage() {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new extraCallbackWithResult(this, (access13800) null), 3, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 111;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AssetSummaryFragment assetSummaryFragment = (AssetSummaryFragment) objArr[0];
        AssetSummaryViewModel.UpdatedAccount updatedAccount = (AssetSummaryViewModel.UpdatedAccount) objArr[1];
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = assetSummaryFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, assetSummaryFragment.new onTransact(updatedAccount, null), 3, (Object) null);
        int i2 = getInterfaceDescriptor + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ AssetSummaryViewModel.UpdatedAccount $updatedAccount;
        int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(AssetSummaryViewModel.UpdatedAccount updatedAccount, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$updatedAccount = updatedAccount;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = AssetSummaryFragment.this.new onTransact(this.$updatedAccount, access13800Var);
            int i2 = onExtraCallback + 99;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 23 / 0;
            }
            return ontransact;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = 54 / 0;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onTransact ontransactCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return ontransactCreate.invokeSuspend(unit);
            }
            ontransactCreate.invokeSuspend(unit);
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(100, r21) != r2) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x010f, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(500, r21) == r2) goto L51;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0054 -> B:23:0x0056). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            KeyEvent.Callback callbackFindViewById;
            int i2 = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                i = 0;
                if (!AssetSummaryFragment.IAuthTabCallbackStub(AssetSummaryFragment.this)) {
                    if (AssetSummaryFragment.IAuthTabCallbackStub(AssetSummaryFragment.this)) {
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i4 = onNavigationEvent + 89;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
            int i6 = onExtraCallback + 1;
            int i7 = i6 % 128;
            onNavigationEvent = i7;
            int i8 = i6 % 2;
            if (i3 != 1) {
                int i9 = i7 + 113;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0 ? i3 != 2 : i3 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                AssetSummaryFragment.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{AssetSummaryFragment.this, this.$updatedAccount}, -869810682, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 869810685, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
                Unit unit2 = Unit.INSTANCE;
                int i42 = onNavigationEvent + 89;
                onExtraCallback = i42 % 128;
                int i52 = i42 % 2;
                return unit2;
            }
            i = this.I$0;
            ResultKt.onNavigationEvent(obj);
            i++;
            if (!AssetSummaryFragment.IAuthTabCallbackStub(AssetSummaryFragment.this) || i >= 10) {
                if (AssetSummaryFragment.IAuthTabCallbackStub(AssetSummaryFragment.this)) {
                    int i10 = onNavigationEvent + 29;
                    onExtraCallback = i10 % 128;
                    ViewGroup viewGroup = null;
                    if (i10 % 2 == 0) {
                        AssetSummaryFragment.IAuthTabCallbackStubProxy(AssetSummaryFragment.this);
                        viewGroup.hashCode();
                        throw null;
                    }
                    if (AssetSummaryFragment.IAuthTabCallbackStubProxy(AssetSummaryFragment.this) == null) {
                        AssetSummaryFragment assetSummaryFragment = AssetSummaryFragment.this;
                        Context contextRequireContext = assetSummaryFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                        AssetTriumphAnimationView assetTriumphAnimationView = new AssetTriumphAnimationView(contextRequireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                        assetTriumphAnimationView.setFocusable(true);
                        assetTriumphAnimationView.setClickable(true);
                        assetTriumphAnimationView.setVisibility(8);
                        AssetSummaryFragment.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{assetSummaryFragment, assetTriumphAnimationView}, -2101083224, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 2101083228, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
                    }
                    AssetTriumphAnimationView assetTriumphAnimationViewIAuthTabCallbackStubProxy = AssetSummaryFragment.IAuthTabCallbackStubProxy(AssetSummaryFragment.this);
                    if ((assetTriumphAnimationViewIAuthTabCallbackStubProxy != null ? assetTriumphAnimationViewIAuthTabCallbackStubProxy.getParent() : null) == null) {
                        int i11 = onExtraCallback + 125;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                        FragmentActivity activity = AssetSummaryFragment.this.getActivity();
                        if (activity != null) {
                            int i13 = onExtraCallback + 55;
                            onNavigationEvent = i13 % 128;
                            if (i13 % 2 != 0) {
                                activity.findViewById(android.R.id.content);
                                throw null;
                            }
                            callbackFindViewById = activity.findViewById(android.R.id.content);
                        } else {
                            callbackFindViewById = null;
                        }
                        if (callbackFindViewById instanceof ViewGroup) {
                            int i14 = onExtraCallback + 43;
                            onNavigationEvent = i14 % 128;
                            int i15 = i14 % 2;
                            viewGroup = (ViewGroup) callbackFindViewById;
                        }
                        if (viewGroup != null) {
                            viewGroup.addView(AssetSummaryFragment.IAuthTabCallbackStubProxy(AssetSummaryFragment.this));
                        }
                    }
                    this.I$0 = i;
                    this.label = 2;
                }
                Unit unit22 = Unit.INSTANCE;
                int i422 = onNavigationEvent + 89;
                onExtraCallback = i422 % 128;
                int i522 = i422 % 2;
                return unit22;
            }
            this.I$0 = i;
            this.label = 1;
            return objOnWarmupCompleted;
        }
    }

    private static final Unit asBinder(AssetSummaryFragment assetSummaryFragment, AssetSummaryViewModel.UpdatedAccount updatedAccount) {
        int i = 2 % 2;
        HomeRecyclerView homeRecyclerViewOnMinimized = assetSummaryFragment.onMinimized();
        if (homeRecyclerViewOnMinimized != null) {
            int i2 = getInterfaceDescriptor + 23;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                homeRecyclerViewOnMinimized.onWarmupCompleted(CollectionsKt.listOf(updatedAccount.onExtraCallbackWithResult()), updatedAccount.onExtraCallback(), updatedAccount.onWarmupCompleted());
            } else {
                homeRecyclerViewOnMinimized.onWarmupCompleted(CollectionsKt.listOf(updatedAccount.onExtraCallbackWithResult()), updatedAccount.onExtraCallback(), updatedAccount.onWarmupCompleted());
                throw null;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 123;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 51 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[PHI: r6
      0x0038: PHI (r6v4 java.lang.Boolean) = (r6v3 java.lang.Boolean), (r6v6 java.lang.Boolean) binds: [B:10:0x0036, B:7:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        Boolean boolOnWarmupCompleted;
        AssetSummaryFragment assetSummaryFragment = (AssetSummaryFragment) objArr[0];
        AssetSummaryViewModel.UpdatedAccount updatedAccount = (AssetSummaryViewModel.UpdatedAccount) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        AssetSummaryViewModel.TriumphAnimation triumphAnimationIAuthTabCallback = updatedAccount.IAuthTabCallback();
        if (triumphAnimationIAuthTabCallback != null) {
            int i4 = getInterfaceDescriptor + 75;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                boolOnWarmupCompleted = triumphAnimationIAuthTabCallback.onWarmupCompleted();
                int i5 = 31 / 0;
                if (boolOnWarmupCompleted != null) {
                    if (boolOnWarmupCompleted.booleanValue()) {
                        AssetTriumphAnimationView assetTriumphAnimationView = assetSummaryFragment.access000;
                        if (assetTriumphAnimationView != null) {
                            AssetTriumphAnimationView.IAuthTabCallback(assetTriumphAnimationView, triumphAnimationIAuthTabCallback.onExtraCallbackWithResult(), triumphAnimationIAuthTabCallback.IAuthTabCallback(), 0, new AssetSummaryFragment$.ExternalSyntheticLambda10(assetSummaryFragment, updatedAccount), 4, (Object) null);
                            return null;
                        }
                    } else {
                        AssetTriumphAnimationView assetTriumphAnimationView2 = assetSummaryFragment.access000;
                        if (assetTriumphAnimationView2 != null) {
                            AssetTriumphAnimationView.onNavigationEvent(assetTriumphAnimationView2, triumphAnimationIAuthTabCallback.onExtraCallbackWithResult(), triumphAnimationIAuthTabCallback.IAuthTabCallback(), 0, new AssetSummaryFragment$.ExternalSyntheticLambda11(assetSummaryFragment, updatedAccount), 4, (Object) null);
                            int i6 = IAuthTabCallbackStubProxy + 105;
                            getInterfaceDescriptor = i6 % 128;
                            int i7 = i6 % 2;
                        }
                    }
                }
            } else {
                boolOnWarmupCompleted = triumphAnimationIAuthTabCallback.onWarmupCompleted();
                if (boolOnWarmupCompleted != null) {
                }
            }
        }
        int i8 = getInterfaceDescriptor + 73;
        IAuthTabCallbackStubProxy = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    private static final Unit asInterface(AssetSummaryFragment assetSummaryFragment, AssetSummaryViewModel.UpdatedAccount updatedAccount) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        HomeRecyclerView homeRecyclerViewOnMinimized = assetSummaryFragment.onMinimized();
        if (homeRecyclerViewOnMinimized != null) {
            int i4 = IAuthTabCallbackStubProxy + 11;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            homeRecyclerViewOnMinimized.onWarmupCompleted(CollectionsKt.listOf(updatedAccount.onExtraCallbackWithResult()), updatedAccount.onExtraCallback(), updatedAccount.onWarmupCompleted());
        }
        return Unit.INSTANCE;
    }

    private final void onNavigationEvent(AssetSummaryViewModel.UpdatedAccount updatedAccount) {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new asInterface(updatedAccount, null), 3, (Object) null);
        int i2 = getInterfaceDescriptor + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ AssetSummaryViewModel.UpdatedAccount $updatedAccount;
        int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(AssetSummaryViewModel.UpdatedAccount updatedAccount, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$updatedAccount = updatedAccount;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 75;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = AssetSummaryFragment.this.new asInterface(this.$updatedAccount, access13800Var);
            int i2 = IAuthTabCallback + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return asinterface;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 79;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(100, r8) != r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(500, r8) == r1) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004f -> B:17:0x0051). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            Integer numOnExtraCallbackWithResult;
            HomeDstView homeDstView;
            HomeDstRecyclerView homeDstRecyclerViewOnExtraCallbackWithResult;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 29;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i5 = this.label;
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                i = 0;
                if (AssetSummaryFragment.IAuthTabCallbackStub(AssetSummaryFragment.this)) {
                }
                return Unit.INSTANCE;
            }
            if (i5 == 1) {
                i = this.I$0;
                ResultKt.onNavigationEvent(obj);
                i++;
                if (AssetSummaryFragment.IAuthTabCallbackStub(AssetSummaryFragment.this)) {
                    int i6 = onNavigationEvent + 105;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (i < 10) {
                        this.I$0 = i;
                        this.label = 1;
                    } else if (AssetSummaryFragment.IAuthTabCallbackStub(AssetSummaryFragment.this)) {
                        this.I$0 = i;
                        this.label = 2;
                    }
                    return objOnWarmupCompleted;
                }
                return Unit.INSTANCE;
            }
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            WebSocketDataChannel webSocketDataChannel = (WebSocketDataChannel) AssetSummaryFragment.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{AssetSummaryFragment.this}, 1306789490, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1306789481, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
            if (webSocketDataChannel == null || (homeDstView = webSocketDataChannel.onExtraCallbackWithResult) == null || (homeDstRecyclerViewOnExtraCallbackWithResult = homeDstView.onExtraCallbackWithResult()) == null) {
                numOnExtraCallbackWithResult = null;
            } else {
                numOnExtraCallbackWithResult = homeDstRecyclerViewOnExtraCallbackWithResult.onExtraCallbackWithResult(this.$updatedAccount.onExtraCallbackWithResult());
                int i8 = IAuthTabCallback + 109;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 5 % 2;
                }
            }
            if (numOnExtraCallbackWithResult != null && numOnExtraCallbackWithResult.intValue() > 0) {
                AssetSummaryFragment.onExtraCallbackWithResult(AssetSummaryFragment.this, numOnExtraCallbackWithResult.intValue(), this.$updatedAccount);
                int i10 = onNavigationEvent + 43;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    private final void isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        WebSocketDataChannel webSocketDataChannelOnExtraCallback = onExtraCallback();
        if (webSocketDataChannelOnExtraCallback != null) {
            int i4 = IAuthTabCallbackStubProxy + 105;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                SwipeRefreshLayout swipeRefreshLayout = webSocketDataChannelOnExtraCallback.onExtraCallback;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = webSocketDataChannelOnExtraCallback.onExtraCallback;
            if (swipeRefreshLayout2 != null) {
                swipeRefreshLayout2.setOnRefreshListener(new AssetSummaryFragment$.ExternalSyntheticLambda8(swipeRefreshLayout2, this));
            }
        }
    }

    private static final void onExtraCallback(SwipeRefreshLayout swipeRefreshLayout, AssetSummaryFragment assetSummaryFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        swipeRefreshLayout.announceForAccessibility(assetSummaryFragment.getString(im.toss.features.home.core.ui.R.string.home_v2_core_ui_refresh_list));
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1010285L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        assetSummaryFragment.onNavigationEvent().writeTypedObject();
        int i4 = getInterfaceDescriptor + 41;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallbackWithResult(AssetSummaryFragment assetSummaryFragment, WebSocketDataChannel webSocketDataChannel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        assetSummaryFragment.onTransact = true;
        webSocketDataChannel.onExtraCallback.setEnabled(true);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 93;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class access000 extends RecyclerView.AdapterDataObserver {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ HomeDstRecyclerView IAuthTabCallback;

        access000(HomeDstRecyclerView homeDstRecyclerView) {
            this.IAuthTabCallback = homeDstRecyclerView;
        }

        public void onItemRangeInserted(int i, int i2) {
            int i3 = 2 % 2;
            int i4 = onNavigationEvent + 101;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            super.onItemRangeInserted(i, i2);
            if (AssetSummaryFragment.this.getView() != null) {
                int i6 = onNavigationEvent + 71;
                onWarmupCompleted = i6 % 128;
                Object obj = null;
                if (i6 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (i2 != 0 && i == 0 && this.IAuthTabCallback.getScrollState() == 0) {
                    int i7 = onWarmupCompleted + 77;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    LinearLayoutManager layoutManager = this.IAuthTabCallback.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
                    Integer numValueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.findFirstCompletelyVisibleItemPosition()) : null;
                    if (numValueOf != null) {
                        int i9 = onNavigationEvent + 85;
                        onWarmupCompleted = i9 % 128;
                        if (i9 % 2 != 0) {
                            numValueOf.intValue();
                            obj.hashCode();
                            throw null;
                        }
                        if (numValueOf.intValue() == 0) {
                            LinearLayoutManager layoutManager2 = this.IAuthTabCallback.getLayoutManager();
                            Intrinsics.checkNotNull(layoutManager2, "");
                            layoutManager2.scrollToPositionWithOffset(0, 0);
                            int i10 = onWarmupCompleted + 101;
                            onNavigationEvent = i10 % 128;
                            int i11 = i10 % 2;
                        }
                    }
                }
            }
        }
    }

    public static final class access100 extends RecyclerView.OnScrollListener {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        access100() {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.checkNotNullParameter(recyclerView, "");
                super.onScrolled(recyclerView, i, i2);
                AssetSummaryFragment.getInterfaceDescriptor(AssetSummaryFragment.this);
            } else {
                Intrinsics.checkNotNullParameter(recyclerView, "");
                super.onScrolled(recyclerView, i, i2);
                AssetSummaryFragment.getInterfaceDescriptor(AssetSummaryFragment.this);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        AssetSummaryFragment assetSummaryFragment = (AssetSummaryFragment) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 113;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        WebSocketDataChannel webSocketDataChannelOnExtraCallback = assetSummaryFragment.onExtraCallback();
        Object obj = null;
        if (webSocketDataChannelOnExtraCallback != null) {
            HomeDstRecyclerView homeDstRecyclerViewOnExtraCallbackWithResult = webSocketDataChannelOnExtraCallback.onExtraCallbackWithResult.onExtraCallbackWithResult();
            int iOnExtraCallback = getKekid.onExtraCallback();
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            if (((Boolean) HomeRecyclerView.IAuthTabCallback(iOnExtraCallback, getKekid.onExtraCallback(), getKekid.onExtraCallback(), 1395069564, new Object[]{homeDstRecyclerViewOnExtraCallbackWithResult}, -1395069560, iOnExtraCallback2)).booleanValue()) {
                homeDstRecyclerViewOnExtraCallbackWithResult.setOnStackAnimationEnd(new AssetSummaryFragment$.ExternalSyntheticLambda9(assetSummaryFragment, webSocketDataChannelOnExtraCallback));
            }
            ConnectionLog connectionLog = new ConnectionLog(assetSummaryFragment);
            connectionLog.registerAdapterDataObserver(assetSummaryFragment.new access000(homeDstRecyclerViewOnExtraCallbackWithResult));
            homeDstRecyclerViewOnExtraCallbackWithResult.setAdapter(connectionLog);
            homeDstRecyclerViewOnExtraCallbackWithResult.addOnScrollListener(assetSummaryFragment.new access100());
            return null;
        }
        int i4 = getInterfaceDescriptor + 17;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        getInterfaceDescriptor = i2 % 128;
        view.setVisibility(i2 % 2 != 0 ? 1 : 0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0029 A[PHI: r2 r3 r4 r5
      0x0029: PHI (r2v8 java.lang.Float) = (r2v4 java.lang.Float), (r2v14 java.lang.Float) binds: [B:8:0x003e, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0029: PHI (r3v4 java.lang.Float) = (r3v2 java.lang.Float), (r3v16 java.lang.Float) binds: [B:8:0x003e, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0029: PHI (r4v2 java.lang.Float) = (r4v1 java.lang.Float), (r4v11 java.lang.Float) binds: [B:8:0x003e, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0029: PHI (r5v3 o.WebSocketDataChannel) = (r5v2 o.WebSocketDataChannel), (r5v8 o.WebSocketDataChannel) binds: [B:8:0x003e, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void extraCommand() {
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        WebSocketDataChannel webSocketDataChannelOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            fValueOf = Float.valueOf(1.0f);
            fValueOf2 = Float.valueOf(0.0f);
            fValueOf3 = Float.valueOf(2.0f);
            webSocketDataChannelOnExtraCallback = (WebSocketDataChannel) onExtraCallback();
            if (webSocketDataChannelOnExtraCallback != null) {
                Float f = fValueOf3;
                Float f2 = fValueOf2;
                int i3 = getInterfaceDescriptor + 39;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                View view = webSocketDataChannelOnExtraCallback.onWarmupCompleted;
                if (view != null) {
                    getExtraParameters getextraparameters = getExtraParameters.Normal;
                    deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
                    this.asInterface = Rally.onTransact(RallysKt.onWarmupCompleted(view, CollectionsKt.listOf(new AppLovinSdkSettings[]{isMuted.onNavigationEvent(isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(0.5f), f, (Function1) null, 4, (Object) null), f2, fValueOf, (Function1) null, 4, (Object) null), isMuted.onNavigationEvent(isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), f, f, (Function1) null, 4, (Object) null), fValueOf, f2, (Function1) null, 4, (Object) null)}), -1, getextraparameters, 600, deprecated_certificatepinner.onExtraCallbackWithResult(), (Integer) null, (Boolean) null, 0, 0L, false, 1984, (Object) null), (Object) null, new AssetSummaryFragment$.ExternalSyntheticLambda4(view), 1, (Object) null);
                    TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                    maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new getInterfaceDescriptor(this, view, (access13800) null), 3, (Object) null);
                }
            }
        } else {
            fValueOf = Float.valueOf(1.0f);
            fValueOf2 = Float.valueOf(0.0f);
            fValueOf3 = Float.valueOf(2.0f);
            webSocketDataChannelOnExtraCallback = onExtraCallback();
            if (webSocketDataChannelOnExtraCallback != null) {
            }
        }
        int i5 = getInterfaceDescriptor + 81;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void onNavigationEvent(View view, getSingleViewMap.onExtraCallbackWithResult onextracallbackwithresult) {
        int i;
        maxAgeSeconds maxageseconds;
        int i2 = 2 % 2;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Configuration configuration = contextRequireContext.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        getUrlokhttp geturlokhttp = new getUrlokhttp(new ICustomTabsCallbackDefault(configuration));
        if (onextracallbackwithresult == null) {
            int i3 = IAuthTabCallbackStubProxy + 89;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            i = -1;
        } else {
            i = onExtraCallbackWithResult.onExtraCallbackWithResult[onextracallbackwithresult.ordinal()];
        }
        if (i != 1) {
            int i5 = getInterfaceDescriptor + 5;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0 ? i == 2 : i == 3) {
                maxageseconds = new maxAgeSeconds(new int[]{setBodyokhttp.IAuthTabCallback(geturlokhttp.ICustomTabsServiceStubProxy(), 0.0f), setBodyokhttp.IAuthTabCallback(geturlokhttp.ICustomTabsServiceStubProxy(), 0.2f), setBodyokhttp.IAuthTabCallback(geturlokhttp.areNotificationsEnabled(), 0.2f), setBodyokhttp.IAuthTabCallback(geturlokhttp.areNotificationsEnabled(), 0.0f)}, new float[]{0.0f, 0.3f, 0.6f, 1.0f}, (Float) null, (Float) null, (Float) null, 28, (DefaultConstructorMarker) null);
            } else {
                maxageseconds = new maxAgeSeconds(new int[]{setBodyokhttp.IAuthTabCallback(geturlokhttp.ICustomTabsServiceStubProxy(), 0.0f), setBodyokhttp.IAuthTabCallback(geturlokhttp.ICustomTabsServiceStubProxy(), 0.2f), setBodyokhttp.IAuthTabCallback(geturlokhttp.areNotificationsEnabled(), 0.2f), setBodyokhttp.IAuthTabCallback(geturlokhttp.areNotificationsEnabled(), 0.0f)}, new float[]{0.0f, 0.3f, 0.6f, 1.0f}, (Float) null, (Float) null, (Float) null, 28, (DefaultConstructorMarker) null);
            }
        } else {
            maxageseconds = new maxAgeSeconds(new int[]{setBodyokhttp.IAuthTabCallback(geturlokhttp.ICustomTabsServiceStubProxy(), 0.0f), setBodyokhttp.IAuthTabCallback(geturlokhttp.ICustomTabsServiceStubProxy(), 0.2f), setBodyokhttp.IAuthTabCallback(geturlokhttp.ICustomTabsServiceDefault(), 0.1f), setBodyokhttp.IAuthTabCallback(geturlokhttp.ICustomTabsServiceStubProxy(), 0.0f)}, new float[]{0.0f, 0.3f, 0.6f, 1.0f}, (Float) null, (Float) null, (Float) null, 28, (DefaultConstructorMarker) null);
        }
        view.setBackground(maxageseconds);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        AssetSummaryFragment assetSummaryFragment = (AssetSummaryFragment) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 40 / 0;
            if (onRenderReady.IAuthTabCallback(assetSummaryFragment)) {
                view.setVisibility(0);
                Rally rally = assetSummaryFragment.asInterface;
                if (rally != null) {
                    int i4 = getInterfaceDescriptor + 73;
                    IAuthTabCallbackStubProxy = i4 % 128;
                    int i5 = i4 % 2;
                    isFireOS.onExtraCallbackWithResult(rally, false, 1, (Object) null);
                    int i6 = getInterfaceDescriptor + 61;
                    IAuthTabCallbackStubProxy = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        } else if (onRenderReady.IAuthTabCallback(assetSummaryFragment)) {
        }
        return null;
    }

    private static final void IAuthTabCallback_Parcel(AssetSummaryFragment assetSummaryFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        if (onRenderReady.IAuthTabCallback(assetSummaryFragment)) {
            assetSummaryFragment.requestPostMessageChannelWithExtras();
            int i4 = getInterfaceDescriptor + 121;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x013d A[PHI: r2
      0x013d: PHI (r2v3 im.toss.tds.foundation.anim.rally.Rally) = (r2v2 im.toss.tds.foundation.anim.rally.Rally), (r2v7 im.toss.tds.foundation.anim.rally.Rally) binds: [B:63:0x013b, B:60:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void requestPostMessageChannel() {
        WebSocketDataChannel webSocketDataChannelOnExtraCallback;
        HomeRecyclerView homeRecyclerViewOnMinimized;
        int childCount;
        int i;
        Object obj;
        LogType logType;
        Rally rally;
        FrameLayout frameLayoutOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 75;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            webSocketDataChannelOnExtraCallback = (WebSocketDataChannel) onExtraCallback();
            int i4 = 24 / 0;
            if (webSocketDataChannelOnExtraCallback == null) {
                return;
            }
        } else {
            webSocketDataChannelOnExtraCallback = onExtraCallback();
            if (webSocketDataChannelOnExtraCallback == null) {
                return;
            }
        }
        View view = webSocketDataChannelOnExtraCallback.onWarmupCompleted;
        if (view == null || (homeRecyclerViewOnMinimized = onMinimized()) == null) {
            return;
        }
        int i5 = getInterfaceDescriptor + 17;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            childCount = homeRecyclerViewOnMinimized.getChildCount();
            i = 1;
        } else {
            childCount = homeRecyclerViewOnMinimized.getChildCount();
            i = 0;
        }
        while (true) {
            obj = null;
            if (i >= childCount) {
                logType = null;
                break;
            }
            LogType childViewHolder = homeRecyclerViewOnMinimized.getChildViewHolder(homeRecyclerViewOnMinimized.getChildAt(i));
            if (childViewHolder instanceof LogType) {
                int i6 = getInterfaceDescriptor + 27;
                IAuthTabCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
                logType = childViewHolder;
                break;
            }
            i++;
        }
        if (logType == null) {
            if (!this.IAuthTabCallbackDefault) {
                return;
            }
            this.IAuthTabCallbackDefault = false;
            Rally rally2 = this.asInterface;
            if (rally2 != null) {
                rally2.ICustomTabsServiceStub();
            }
            view.setVisibility(8);
            prefetchWithMultipleUrls();
            return;
        }
        int i8 = getInterfaceDescriptor + 53;
        IAuthTabCallbackStubProxy = i8 % 128;
        int i9 = i8 % 2;
        View viewFindViewById = ((RecyclerView.ViewHolder) logType).onNavigationEvent.findViewById(im.toss.features.home.core.ui.R.id.alertIcon);
        if (viewFindViewById != null) {
            int i10 = getInterfaceDescriptor + 25;
            IAuthTabCallbackStubProxy = i10 % 128;
            if (i10 % 2 == 0) {
                viewFindViewById.getVisibility();
                obj.hashCode();
                throw null;
            }
            if (viewFindViewById.getVisibility() == 0) {
                if (!this.IAuthTabCallbackDefault) {
                    this.IAuthTabCallbackDefault = true;
                    Rally rally3 = this.asInterface;
                    if ((rally3 == null || !rally3.postMessage()) && this.onExtraCallback.IAuthTabCallback() != null) {
                        view.postDelayed(new AssetSummaryFragment$.ExternalSyntheticLambda2(this, view), 300L);
                    }
                    view.postDelayed(new AssetSummaryFragment$.ExternalSyntheticLambda3(this), 300L);
                }
                int[] iArr = new int[2];
                viewFindViewById.getLocationOnScreen(iArr);
                int i11 = iArr[0];
                int width = viewFindViewById.getWidth() / 2;
                int i12 = iArr[1];
                int height = viewFindViewById.getHeight() / 2;
                int[] iArr2 = new int[2];
                WebSocketDataChannel webSocketDataChannelOnExtraCallback2 = onExtraCallback();
                if (webSocketDataChannelOnExtraCallback2 != null && (frameLayoutOnExtraCallbackWithResult = webSocketDataChannelOnExtraCallback2.onExtraCallbackWithResult()) != null) {
                    int i13 = getInterfaceDescriptor + 5;
                    IAuthTabCallbackStubProxy = i13 % 128;
                    if (i13 % 2 == 0) {
                        frameLayoutOnExtraCallbackWithResult.getLocationOnScreen(iArr2);
                        obj.hashCode();
                        throw null;
                    }
                    frameLayoutOnExtraCallbackWithResult.getLocationOnScreen(iArr2);
                }
                view.setTranslationX(((i11 + width) - iArr2[0]) - (view.getWidth() / 2.0f));
                view.setTranslationY(((i12 + height) - iArr2[1]) - (view.getHeight() / 2.0f));
                int i14 = getInterfaceDescriptor + 5;
                IAuthTabCallbackStubProxy = i14 % 128;
                int i15 = i14 % 2;
                return;
            }
        }
        if (this.IAuthTabCallbackDefault) {
            int i16 = IAuthTabCallbackStubProxy;
            int i17 = i16 + 47;
            getInterfaceDescriptor = i17 % 128;
            if (i17 % 2 != 0) {
                this.IAuthTabCallbackDefault = false;
                rally = this.asInterface;
                if (rally != null) {
                    int i18 = i16 + 63;
                    getInterfaceDescriptor = i18 % 128;
                    int i19 = i18 % 2;
                    rally.ICustomTabsServiceStub();
                    int i20 = getInterfaceDescriptor + 59;
                    IAuthTabCallbackStubProxy = i20 % 128;
                    int i21 = i20 % 2;
                }
            } else {
                this.IAuthTabCallbackDefault = false;
                rally = this.asInterface;
                if (rally != null) {
                }
            }
            view.setVisibility(8);
            prefetchWithMultipleUrls();
        }
    }

    private final void requestPostMessageChannelWithExtras() {
        int i = 2 % 2;
        HomeRecyclerView homeRecyclerViewOnMinimized = onMinimized();
        if (homeRecyclerViewOnMinimized != null) {
            int childCount = homeRecyclerViewOnMinimized.getChildCount();
            int i2 = getInterfaceDescriptor + 9;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            for (int i4 = 0; i4 < childCount; i4++) {
                int i5 = getInterfaceDescriptor + 71;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                LogType childViewHolder = homeRecyclerViewOnMinimized.getChildViewHolder(homeRecyclerViewOnMinimized.getChildAt(i4));
                if (childViewHolder instanceof LogType) {
                    int i7 = IAuthTabCallbackStubProxy + 27;
                    getInterfaceDescriptor = i7 % 128;
                    int i8 = i7 % 2;
                    childViewHolder.onTransact();
                    return;
                }
            }
        }
    }

    private final void prefetchWithMultipleUrls() {
        int i = 2 % 2;
        HomeRecyclerView homeRecyclerViewOnMinimized = onMinimized();
        if (homeRecyclerViewOnMinimized != null) {
            int i2 = IAuthTabCallbackStubProxy + 31;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            int childCount = homeRecyclerViewOnMinimized.getChildCount();
            int i4 = 0;
            while (i4 < childCount) {
                int i5 = getInterfaceDescriptor + 97;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                LogType childViewHolder = homeRecyclerViewOnMinimized.getChildViewHolder(homeRecyclerViewOnMinimized.getChildAt(i4));
                if (childViewHolder instanceof LogType) {
                    int i7 = getInterfaceDescriptor + 125;
                    IAuthTabCallbackStubProxy = i7 % 128;
                    int i8 = i7 % 2;
                    childViewHolder.IAuthTabCallbackDefault();
                    return;
                }
                i4++;
                int i9 = getInterfaceDescriptor + 7;
                IAuthTabCallbackStubProxy = i9 % 128;
                int i10 = i9 % 2;
            }
        }
    }

    private final void newAuthTabSession() {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new ICustomTabsCallback(this, (access13800) null), 3, (Object) null);
        int i2 = getInterfaceDescriptor + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ HomeDstRecyclerView $dstRecyclerView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStubProxy(HomeDstRecyclerView homeDstRecyclerView, access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
            this.$dstRecyclerView = homeDstRecyclerView;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = new IAuthTabCallbackStubProxy(this.$dstRecyclerView, access13800Var);
            int i2 = onWarmupCompleted + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStubProxy;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 77;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 85;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 70 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(300L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onNavigationEvent + 41;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
            this.$dstRecyclerView.onWarmupCompleted();
            return Unit.INSTANCE;
        }
    }

    private final void newSession() {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new writeTypedObject(this, (access13800) null), 3, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 117;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void prefetch() {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new readTypedObject(this, (access13800) null), 3, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 99;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onRelationshipValidationResult() {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new extraCallback(this, (access13800) null), 3, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 53;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 47;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        WebSocketDataChannel webSocketDataChannelOnExtraCallback = onExtraCallback();
        if (webSocketDataChannelOnExtraCallback != null) {
            int i4 = IAuthTabCallbackStubProxy + 5;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = {webSocketDataChannelOnExtraCallback.onExtraCallbackWithResult.onExtraCallbackWithResult()};
            if (!((Boolean) HomeRecyclerView.IAuthTabCallback(getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 1395069564, objArr, -1395069560, getKekid.onExtraCallback())).booleanValue()) {
                webSocketDataChannelOnExtraCallback.onExtraCallbackWithResult.onExtraCallbackWithResult().postDelayed(new AssetSummaryFragment$.ExternalSyntheticLambda5(this, webSocketDataChannelOnExtraCallback), 800L);
            }
        }
        int i6 = IAuthTabCallbackStubProxy + 77;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private static final void IAuthTabCallback(AssetSummaryFragment assetSummaryFragment, WebSocketDataChannel webSocketDataChannel) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (onRenderReady.IAuthTabCallback(assetSummaryFragment)) {
                assetSummaryFragment.onTransact = true;
                webSocketDataChannel.onExtraCallback.setEnabled(true);
                return;
            } else {
                int i3 = getInterfaceDescriptor + 107;
                IAuthTabCallbackStubProxy = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        onRenderReady.IAuthTabCallback(assetSummaryFragment);
        obj.hashCode();
        throw null;
    }

    private final boolean onWarmupCompleted(RecyclerView recyclerView) {
        int i = 2 % 2;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return false;
        }
        int i2 = getInterfaceDescriptor + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            layoutManager.isSmoothScrolling();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIsSmoothScrolling = layoutManager.isSmoothScrolling();
        int i3 = IAuthTabCallbackStubProxy + 41;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return zIsSmoothScrolling;
    }

    public static final class IAuthTabCallback extends RecyclerView.OnScrollListener {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ WebSocketDataChannel onExtraCallbackWithResult;
        final /* synthetic */ maybeRemoveAttachStateListener<Unit> onNavigationEvent;

        IAuthTabCallback(WebSocketDataChannel webSocketDataChannel, maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener) {
            this.onExtraCallbackWithResult = webSocketDataChannel;
            this.onNavigationEvent = mayberemoveattachstatelistener;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 55;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(recyclerView, "");
                int i4 = 90 / 0;
                if (i != 0) {
                    return;
                }
            } else {
                Intrinsics.checkNotNullParameter(recyclerView, "");
                if (i != 0) {
                    return;
                }
            }
            this.onExtraCallbackWithResult.onExtraCallbackWithResult.onExtraCallbackWithResult().removeOnScrollListener(this);
            maybeRemoveAttachStateListener<Unit> mayberemoveattachstatelistener = this.onNavigationEvent;
            Result.Companion companion = Result.Companion;
            mayberemoveattachstatelistener.resumeWith(Result.constructor-impl(Unit.INSTANCE));
            int i5 = IAuthTabCallback + 89;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    static final class onExtraCallback implements Function1<Throwable, Unit> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ WebSocketDataChannel IAuthTabCallback;
        final /* synthetic */ IAuthTabCallback onExtraCallbackWithResult;

        onExtraCallback(WebSocketDataChannel webSocketDataChannel, IAuthTabCallback iAuthTabCallback) {
            this.IAuthTabCallback = webSocketDataChannel;
            this.onExtraCallbackWithResult = iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((Throwable) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 53;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 74 / 0;
            }
            return unit;
        }

        public final void onExtraCallbackWithResult(Throwable th) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            HomeDstView homeDstView = this.IAuthTabCallback.onExtraCallbackWithResult;
            if (i3 == 0) {
                homeDstView.onExtraCallbackWithResult().removeOnScrollListener(this.onExtraCallbackWithResult);
            } else {
                homeDstView.onExtraCallbackWithResult().removeOnScrollListener(this.onExtraCallbackWithResult);
                int i4 = 23 / 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        super/*im.toss.features.home.core.ui.base.BaseHomeFragment*\/.onExtraCallback(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if ((r4 instanceof o.fillData.asBinder.onExtraCallbackWithResult) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r4 instanceof o.fillData.asBinder.onExtraCallbackWithResult) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        onNavigationEvent((o.fillData.asBinder.onExtraCallbackWithResult) r4);
        r4 = im.toss.features.home.ui.dst.view.asset.summary.AssetSummaryFragment.IAuthTabCallbackStubProxy + 59;
        im.toss.features.home.ui.dst.view.asset.summary.AssetSummaryFragment.getInterfaceDescriptor = r4 % 128;
        r4 = r4 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallback(@NotNull fillData.asBinder asbinder) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(asbinder, "");
            int i3 = 51 / 0;
        } else {
            Intrinsics.checkNotNullParameter(asbinder, "");
        }
    }

    public void IAuthTabCallback(@NotNull fillData.asBinder.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (!StringsKt.contains$default(iAuthTabCallback.onNavigationEvent(), "HIDDEN_ASSET_DRAWER", false, 2, (Object) null)) {
            AssetSummaryViewModel assetSummaryViewModelOnNavigationEvent = onNavigationEvent();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            assetSummaryViewModelOnNavigationEvent.IAuthTabCallback(contextRequireContext, iAuthTabCallback.onNavigationEvent(), false);
            return;
        }
        int i4 = IAuthTabCallbackStubProxy + 33;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        AssetSummaryViewModel assetSummaryViewModelOnNavigationEvent2 = onNavigationEvent();
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        assetSummaryViewModelOnNavigationEvent2.IAuthTabCallback(contextRequireContext2, iAuthTabCallback.onNavigationEvent(), true);
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ fillData.asBinder.onExtraCallbackWithResult $bubbleTooltipAction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackDefault(fillData.asBinder.onExtraCallbackWithResult onextracallbackwithresult, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
            this.$bubbleTooltipAction = onextracallbackwithresult;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = AssetSummaryFragment.this.new IAuthTabCallbackDefault(this.$bubbleTooltipAction, access13800Var);
            int i2 = onExtraCallback + 115;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 30 / 0;
            }
            return iAuthTabCallbackDefault;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 21;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Integer numOnExtraCallbackWithResult;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted + 29;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(500L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            WebSocketDataChannel webSocketDataChannel = (WebSocketDataChannel) AssetSummaryFragment.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{AssetSummaryFragment.this}, 1306789490, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1306789481, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
            if (webSocketDataChannel == null) {
                Unit unit = Unit.INSTANCE;
                int i4 = onWarmupCompleted + 85;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
            if (onRenderReady.IAuthTabCallback(AssetSummaryFragment.this) && (numOnExtraCallbackWithResult = webSocketDataChannel.onExtraCallbackWithResult.onExtraCallbackWithResult().onExtraCallbackWithResult(this.$bubbleTooltipAction.onExtraCallback().onWarmupCompleted())) != null) {
                int i5 = onExtraCallback + 79;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                if (numOnExtraCallbackWithResult.intValue() > 0) {
                    AssetSummaryFragment.onWarmupCompleted(AssetSummaryFragment.this, this.$bubbleTooltipAction.onExtraCallback().onWarmupCompleted(), this.$bubbleTooltipAction.onExtraCallback().onExtraCallback(), this.$bubbleTooltipAction.onExtraCallback().onExtraCallbackWithResult(), numOnExtraCallbackWithResult.intValue());
                    int i7 = onWarmupCompleted + 35;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 5 % 4;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void onNavigationEvent(fillData.asBinder.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (!this.onTransact) {
            TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(onextracallbackwithresult, null), 3, (Object) null);
            return;
        }
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner2), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(onextracallbackwithresult, null), 3, (Object) null);
        int i4 = IAuthTabCallbackStubProxy + 99;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ fillData.asBinder.onExtraCallbackWithResult $bubbleTooltipAction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(fillData.asBinder.onExtraCallbackWithResult onextracallbackwithresult, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$bubbleTooltipAction = onextracallbackwithresult;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = AssetSummaryFragment.this.new IAuthTabCallbackStub(this.$bubbleTooltipAction, access13800Var);
            int i2 = onExtraCallback + 117;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 72 / 0;
            }
            return iAuthTabCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objOnExtraCallback;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i3 = 23 / 0;
            } else {
                objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            }
            int i4 = onExtraCallback + 85;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 11;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 74 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 105;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(100L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            AssetSummaryFragment.onNavigationEvent(AssetSummaryFragment.this, this.$bubbleTooltipAction);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 9;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    public static final class ICustomTabsCallbackStubProxy extends RecyclerView.AdapterDataObserver {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private boolean onWarmupCompleted;

        ICustomTabsCallbackStubProxy() {
        }

        public final boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean z = this.onWarmupCompleted;
            if (i3 == 0) {
                int i4 = 5 / 0;
            }
            return z;
        }

        public final void onNavigationEvent(boolean z) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted = z;
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private final void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AssetSummaryFragment.access100(AssetSummaryFragment.this);
            int i4 = onNavigationEvent + 59;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onChanged() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent();
            if (i3 != 0) {
                throw null;
            }
            int i4 = onNavigationEvent + 75;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onItemRangeChanged(int i, int i2) {
            int i3 = 2 % 2;
            int i4 = onExtraCallback + 67;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            onNavigationEvent();
            if (i5 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void onItemRangeInserted(int i, int i2) {
            int i3 = 2 % 2;
            int i4 = onNavigationEvent + 69;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            onNavigationEvent();
            if (i5 == 0) {
                int i6 = 73 / 0;
            }
        }

        public void onItemRangeRemoved(int i, int i2) {
            int i3 = 2 % 2;
            int i4 = onNavigationEvent + 93;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            onNavigationEvent();
            int i6 = onExtraCallback + 111;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = onExtraCallback + 53;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            onNavigationEvent();
            int i6 = onNavigationEvent + 47;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = onExtraCallback + 19;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            onNavigationEvent();
            if (i6 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final getPackageType receiveFile() {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner);
        Object obj = null;
        getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new onMinimized(null), 3, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 91;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return getpackagetypeOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    static final class onMinimized extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        onMinimized(access13800<? super onMinimized> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onMinimized onminimized = AssetSummaryFragment.this.new onMinimized(access13800Var);
            int i2 = IAuthTabCallback + 39;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onminimized;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onMinimized onminimizedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onminimizedCreate.invokeSuspend(unit);
            }
            onminimizedCreate.invokeSuspend(unit);
            throw null;
        }

        /* JADX WARN: Path cross not found for [B:61:0x01bb, B:63:0x01d5], limit reached: 83 */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x016e  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0197  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01d8  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x01f7  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0285  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x028d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x011f -> B:37:0x0124). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int size;
            RecyclerView recyclerView;
            AssetSummaryFragment assetSummaryFragment;
            List list;
            int i;
            int i2;
            int i3;
            View view;
            Object obj2;
            HomeDstView homeDstView;
            HomeDstRecyclerView homeDstRecyclerViewOnExtraCallbackWithResult;
            View viewFindViewByPosition;
            float fIAuthTabCallback;
            float y;
            float fIAuthTabCallback2;
            int i4 = 2 % 2;
            int i5 = onExtraCallback + 87;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i6 = this.label;
            boolean z = true;
            if (i6 == 0) {
                ResultKt.onNavigationEvent(obj);
                RecyclerView recyclerViewOnTransact = AssetSummaryFragment.onTransact(AssetSummaryFragment.this);
                if (recyclerViewOnTransact != null) {
                    AssetSummaryFragment assetSummaryFragment2 = AssetSummaryFragment.this;
                    List listIAuthTabCallback = AssetSummaryFragment.IAuthTabCallback(assetSummaryFragment2);
                    size = listIAuthTabCallback.size() - 1;
                    if (size >= 0) {
                        recyclerView = recyclerViewOnTransact;
                        assetSummaryFragment = assetSummaryFragment2;
                        list = listIAuthTabCallback;
                        i = 0;
                        i2 = 0;
                        i3 = size - 1;
                        Object obj3 = list.get(size);
                        view = (View) obj3;
                        if (view instanceof TdsBubbleTooltipLayout) {
                        }
                        size = i3;
                        if (size >= 0) {
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = IAuthTabCallback + 53;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            i3 = this.I$2;
            i = this.I$1;
            i2 = this.I$0;
            Integer num = (Integer) this.L$6;
            Context context = (Context) this.L$5;
            view = (View) this.L$4;
            List list2 = (List) this.L$2;
            RecyclerView recyclerView2 = (HomeRecyclerView) this.L$1;
            AssetSummaryFragment assetSummaryFragment3 = (AssetSummaryFragment) this.L$0;
            ResultKt.onNavigationEvent(obj);
            Integer numOnExtraCallbackWithResult = num;
            List list3 = list2;
            RecyclerView recyclerView3 = recyclerView2;
            AssetSummaryFragment assetSummaryFragment4 = assetSummaryFragment3;
            Object obj4 = objOnWarmupCompleted;
            RecyclerView.LayoutManager layoutManager = recyclerView3.getLayoutManager();
            if (layoutManager == null) {
                int i9 = IAuthTabCallback + 89;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    layoutManager.findViewByPosition(numOnExtraCallbackWithResult.intValue());
                    throw null;
                }
                viewFindViewByPosition = layoutManager.findViewByPosition(numOnExtraCallbackWithResult.intValue());
                int i10 = onExtraCallback + 67;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
            } else {
                viewFindViewByPosition = null;
            }
            TdsListRowV1View tdsListRowV1View = viewFindViewByPosition == null ? (TdsListRowV1View) viewFindViewByPosition.findViewById(im.toss.features.home.core.ui.R.id.list_row) : null;
            View viewFindViewById = viewFindViewByPosition == null ? viewFindViewByPosition.findViewById(im.toss.inventory_sdk.R.id.innerContainer) : null;
            TdsImageView tdsImageViewFindViewById = tdsListRowV1View == null ? viewFindViewById != null ? viewFindViewById.findViewById(im.toss.features.home.core.ui.R.id.imageContainer) : null : tdsListRowV1View.mayLaunchUrl();
            if (tdsImageViewFindViewById == null) {
                float width = tdsImageViewFindViewById.getWidth() / 2;
                float x = tdsImageViewFindViewById.getX();
                Integer numOnNavigationEvent = access14000.onNavigationEvent(100);
                Intrinsics.checkNotNull(context);
                fIAuthTabCallback = (width + x) - varyMatches.IAuthTabCallback(numOnNavigationEvent, context);
            } else {
                Integer numOnNavigationEvent2 = access14000.onNavigationEvent(20);
                Intrinsics.checkNotNull(context);
                fIAuthTabCallback = (varyMatches.IAuthTabCallback(numOnNavigationEvent2, context) + varyMatches.IAuthTabCallback(access14000.onNavigationEvent(24), context)) - varyMatches.IAuthTabCallback(access14000.onNavigationEvent(100), context);
            }
            if (tdsImageViewFindViewById != null || viewFindViewByPosition == null) {
                y = 0.0f;
            } else {
                int i12 = onExtraCallback + 79;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                y = (tdsImageViewFindViewById.getY() + generateInviteUrl.IAuthTabCallback(tdsImageViewFindViewById)) - generateInviteUrl.IAuthTabCallback(viewFindViewByPosition);
            }
            if (tdsImageViewFindViewById == null) {
                int i14 = IAuthTabCallback + 101;
                onExtraCallback = i14 % 128;
                int i15 = i14 % 2;
                fIAuthTabCallback2 = (tdsImageViewFindViewById.getWidth() / 2) - varyMatches.IAuthTabCallback(access14000.onNavigationEvent(0.2d), context);
            } else {
                fIAuthTabCallback2 = varyMatches.IAuthTabCallback(access14000.onNavigationEvent(19.8d), context);
            }
            recyclerView3.getLocationOnScreen(new int[2]);
            TdsBubbleTooltipLayout tdsBubbleTooltipLayout = (TdsBubbleTooltipLayout) view;
            tdsBubbleTooltipLayout.setLeftGradientInnerRadius(fIAuthTabCallback2);
            boolean z2 = true;
            tdsBubbleTooltipLayout.setOffset(fIAuthTabCallback, (-r11[1]) + y);
            TdsBubbleTooltipLayout.onExtraCallbackWithResult(tdsBubbleTooltipLayout, numOnExtraCallbackWithResult.intValue(), recyclerView3, 0.0f, false, false, (Function0) null, (Function0) null, 124, (Object) null);
            transparentBackground.IAuthTabCallback(view, false, 0, (Function0) null, (Function0) null, 15, (Object) null);
            list = list3;
            recyclerView = recyclerView3;
            objOnWarmupCompleted = obj4;
            assetSummaryFragment = assetSummaryFragment4;
            size = i3;
            if (size >= 0) {
                z = z2;
                i3 = size - 1;
                Object obj32 = list.get(size);
                view = (View) obj32;
                if (view instanceof TdsBubbleTooltipLayout) {
                    z2 = z;
                    objOnWarmupCompleted = objOnWarmupCompleted;
                } else {
                    int i16 = onExtraCallback + 11;
                    IAuthTabCallback = i16 % 128;
                    if (i16 % 2 == 0) {
                        ((TdsBubbleTooltipLayout) view).getContext();
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                    TdsBubbleTooltipLayout tdsBubbleTooltipLayout2 = (TdsBubbleTooltipLayout) view;
                    Context context2 = tdsBubbleTooltipLayout2.getContext();
                    WebSocketDataChannel webSocketDataChannel = (WebSocketDataChannel) AssetSummaryFragment.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{assetSummaryFragment}, 1306789490, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1306789481, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
                    if (webSocketDataChannel == null || (homeDstView = webSocketDataChannel.onExtraCallbackWithResult) == null || (homeDstRecyclerViewOnExtraCallbackWithResult = homeDstView.onExtraCallbackWithResult()) == null) {
                        numOnExtraCallbackWithResult = null;
                    } else {
                        String strOnExtraCallbackWithResult = tdsBubbleTooltipLayout2.onExtraCallbackWithResult();
                        if (strOnExtraCallbackWithResult == null) {
                            strOnExtraCallbackWithResult = "";
                        }
                        numOnExtraCallbackWithResult = homeDstRecyclerViewOnExtraCallbackWithResult.onExtraCallbackWithResult(strOnExtraCallbackWithResult);
                    }
                    if (numOnExtraCallbackWithResult != null) {
                        int i17 = IAuthTabCallback + 61;
                        Object obj6 = objOnWarmupCompleted;
                        onExtraCallback = i17 % 128;
                        int i18 = i17 % 2;
                        if (numOnExtraCallbackWithResult.intValue() > 0) {
                            int i19 = onExtraCallback + 41;
                            IAuthTabCallback = i19 % 128;
                            int i20 = i19 % 2;
                            tdsBubbleTooltipLayout2.setAlpha(0.0f);
                            this.L$0 = assetSummaryFragment;
                            this.L$1 = recyclerView;
                            this.L$2 = list;
                            this.L$3 = access15400.onNavigationEvent(obj32);
                            this.L$4 = view;
                            this.L$5 = context2;
                            this.L$6 = numOnExtraCallbackWithResult;
                            this.I$0 = i2;
                            this.I$1 = i;
                            this.I$2 = i3;
                            this.I$3 = size;
                            this.I$4 = 0;
                            this.label = 1;
                            obj4 = obj6;
                            if (formatMsgs.onWarmupCompleted(500L, this) == obj4) {
                                return obj4;
                            }
                            context = context2;
                            list3 = list;
                            recyclerView3 = recyclerView;
                            assetSummaryFragment4 = assetSummaryFragment;
                            RecyclerView.LayoutManager layoutManager2 = recyclerView3.getLayoutManager();
                            if (layoutManager2 == null) {
                            }
                            if (viewFindViewByPosition == null) {
                            }
                            if (viewFindViewByPosition == null) {
                            }
                            if (tdsListRowV1View == null) {
                            }
                            if (tdsImageViewFindViewById == null) {
                            }
                            if (tdsImageViewFindViewById != null) {
                            }
                            y = 0.0f;
                            if (tdsImageViewFindViewById == null) {
                            }
                            recyclerView3.getLocationOnScreen(new int[2]);
                            TdsBubbleTooltipLayout tdsBubbleTooltipLayout3 = (TdsBubbleTooltipLayout) view;
                            tdsBubbleTooltipLayout3.setLeftGradientInnerRadius(fIAuthTabCallback2);
                            boolean z22 = true;
                            tdsBubbleTooltipLayout3.setOffset(fIAuthTabCallback, (-r11[1]) + y);
                            TdsBubbleTooltipLayout.onExtraCallbackWithResult(tdsBubbleTooltipLayout3, numOnExtraCallbackWithResult.intValue(), recyclerView3, 0.0f, false, false, (Function0) null, (Function0) null, 124, (Object) null);
                            transparentBackground.IAuthTabCallback(view, false, 0, (Function0) null, (Function0) null, 15, (Object) null);
                            list = list3;
                            recyclerView = recyclerView3;
                            objOnWarmupCompleted = obj4;
                            assetSummaryFragment = assetSummaryFragment4;
                        } else {
                            obj2 = obj6;
                        }
                    } else {
                        obj2 = objOnWarmupCompleted;
                    }
                    z22 = true;
                    transparentBackground.onExtraCallbackWithResult(view, false, (Function0) null, (Function0) null, 7, (Object) null);
                    objOnWarmupCompleted = obj2;
                }
                size = i3;
                if (size >= 0) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        String strOnNavigationEvent;
        AssetSummaryFragment assetSummaryFragment = (AssetSummaryFragment) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        AssetSummaryViewModel.UpdatedAccount updatedAccount = (AssetSummaryViewModel.UpdatedAccount) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            assetSummaryFragment.onExtraCallback();
            obj.hashCode();
            throw null;
        }
        WebSocketDataChannel webSocketDataChannelOnExtraCallback = assetSummaryFragment.onExtraCallback();
        if (webSocketDataChannelOnExtraCallback == null || webSocketDataChannelOnExtraCallback.onExtraCallbackWithResult() == null) {
            return null;
        }
        HomeRecyclerView homeRecyclerViewOnMinimized = assetSummaryFragment.onMinimized();
        if (homeRecyclerViewOnMinimized != null) {
            int i3 = IAuthTabCallbackStubProxy + 55;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                homeRecyclerViewOnMinimized.onWarmupCompleted(CollectionsKt.listOf(updatedAccount.onExtraCallbackWithResult()), updatedAccount.onExtraCallback(), updatedAccount.onWarmupCompleted());
                AssetSummaryViewModel.Tooltip tooltipOnNavigationEvent = updatedAccount.onNavigationEvent();
                if (tooltipOnNavigationEvent == null || (strOnNavigationEvent = tooltipOnNavigationEvent.onNavigationEvent()) == null) {
                    strOnNavigationEvent = "";
                }
                onWarmupCompleted(assetSummaryFragment, iIntValue, strOnNavigationEvent, (fillData) null, 4, (Object) null);
            } else {
                homeRecyclerViewOnMinimized.onWarmupCompleted(CollectionsKt.listOf(updatedAccount.onExtraCallbackWithResult()), updatedAccount.onExtraCallback(), updatedAccount.onWarmupCompleted());
                updatedAccount.onNavigationEvent();
                throw null;
            }
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit onWarmupCompleted(AssetSummaryFragment assetSummaryFragment, int i, String str, fillData filldata, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 105;
        int i5 = i4 % 128;
        getInterfaceDescriptor = i5;
        if (i4 % 2 == 0 ? (i2 & 4) != 0 : (i2 & 2) != 0) {
            int i6 = i5 + 69;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 79;
            IAuthTabCallbackStubProxy = i8 % 128;
            int i9 = i8 % 2;
            filldata = null;
        }
        Object[] objArr = {assetSummaryFragment, Integer.valueOf(i), str, filldata};
        return (Unit) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, -1562123271, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1562123272, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9 A[PHI: r0 r3
      0x00a9: PHI (r0v5 o.WebSocketDataChannel) = (r0v4 o.WebSocketDataChannel), (r0v18 o.WebSocketDataChannel) binds: [B:17:0x00a7, B:14:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r3v9 int[]) = (r3v8 int[]), (r3v18 int[]) binds: [B:17:0x00a7, B:14:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad A[PHI: r3
      0x00ad: PHI (r3v17 int[]) = (r3v8 int[]), (r3v18 int[]) binds: [B:17:0x00a7, B:14:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        FrameLayout frameLayoutOnExtraCallbackWithResult;
        int[] iArr;
        WebSocketDataChannel webSocketDataChannelOnExtraCallback;
        SwipeRefreshLayout swipeRefreshLayout;
        int[] iArr2;
        AssetSummaryFragment assetSummaryFragment = (AssetSummaryFragment) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        String str = (String) objArr[2];
        fillData filldata = (fillData) objArr[3];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        WebSocketDataChannel webSocketDataChannelOnExtraCallback2 = assetSummaryFragment.onExtraCallback();
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout = null;
        if (webSocketDataChannelOnExtraCallback2 == null || (frameLayoutOnExtraCallbackWithResult = webSocketDataChannelOnExtraCallback2.onExtraCallbackWithResult()) == null) {
            return null;
        }
        Context context = frameLayoutOnExtraCallbackWithResult.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsTooltipV1View tdsTooltipV1View = new TdsTooltipV1View(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsTooltipV1View.setText(str);
        tdsTooltipV1View.setTail(TdsTooltipV1View.IAuthTabCallback.BOTTOM);
        tdsTooltipV1View.setTailClipToEnd(TdsTooltipV1View.onExtraCallback.LEFT);
        tdsTooltipV1View.setAlpha(0.0f);
        if (filldata != null) {
            tdsTooltipV1View.setOnClickListener(new AssetSummaryFragment$.ExternalSyntheticLambda6(assetSummaryFragment, tdsTooltipV1View, filldata));
        }
        HomeRecyclerView homeRecyclerViewOnMinimized = assetSummaryFragment.onMinimized();
        if (homeRecyclerViewOnMinimized != null) {
            int i4 = IAuthTabCallbackStubProxy + 15;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                iArr = new int[3];
                homeRecyclerViewOnMinimized.getLocationOnScreen(iArr);
                frameLayoutOnExtraCallbackWithResult.addView(tdsTooltipV1View);
                assetSummaryFragment.IAuthTabCallbackStub.add(getWrite.IAuthTabCallback("", tdsTooltipV1View));
                webSocketDataChannelOnExtraCallback = (WebSocketDataChannel) assetSummaryFragment.onExtraCallback();
                if (webSocketDataChannelOnExtraCallback != null) {
                    swipeRefreshLayout = webSocketDataChannelOnExtraCallback.onExtraCallback;
                    iArr2 = iArr;
                } else {
                    iArr2 = iArr;
                    swipeRefreshLayout = null;
                }
            } else {
                iArr = new int[2];
                homeRecyclerViewOnMinimized.getLocationOnScreen(iArr);
                frameLayoutOnExtraCallbackWithResult.addView(tdsTooltipV1View);
                assetSummaryFragment.IAuthTabCallbackStub.add(getWrite.IAuthTabCallback("", tdsTooltipV1View));
                webSocketDataChannelOnExtraCallback = assetSummaryFragment.onExtraCallback();
                if (webSocketDataChannelOnExtraCallback != null) {
                }
            }
            if (swipeRefreshLayout instanceof PillarSwipeRefreshLayout) {
                int i5 = IAuthTabCallbackStubProxy + 9;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                pillarSwipeRefreshLayout = (PillarSwipeRefreshLayout) swipeRefreshLayout;
            }
            if (pillarSwipeRefreshLayout != null) {
                List<Pair<String, TdsTooltipV1View>> list = assetSummaryFragment.IAuthTabCallbackStub;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    int i7 = getInterfaceDescriptor + 105;
                    IAuthTabCallbackStubProxy = i7 % 128;
                    if (i7 % 2 == 0) {
                        arrayList.add((TdsTooltipV1View) ((Pair) it.next()).getSecond());
                        int i8 = 78 / 0;
                    } else {
                        arrayList.add((TdsTooltipV1View) ((Pair) it.next()).getSecond());
                    }
                }
                pillarSwipeRefreshLayout.setCompoundViews(arrayList);
            }
            tdsTooltipV1View.postDelayed(new AssetSummaryFragment$.ExternalSyntheticLambda7(assetSummaryFragment, frameLayoutOnExtraCallbackWithResult, tdsTooltipV1View, iArr2, iIntValue, homeRecyclerViewOnMinimized), 500L);
            int i9 = getInterfaceDescriptor + 35;
            IAuthTabCallbackStubProxy = i9 % 128;
            int i10 = i9 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final void IAuthTabCallback(AssetSummaryFragment assetSummaryFragment, TdsTooltipV1View tdsTooltipV1View, fillData filldata, View view) {
        int i = 2 % 2;
        assetSummaryFragment.onExtraCallback(tdsTooltipV1View, 0L);
        fillData.getInterfaceDescriptor.onWarmupCompleted(assetSummaryFragment, filldata, new BaseEmbedView.onNavigationEvent(RVManifestWrapper.Companion.onNavigationEvent("this.tooltip"), filldata, (DefaultConstructorMarker) null), (String) null, 4, (Object) null);
        int i2 = getInterfaceDescriptor + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final void onWarmupCompleted(AssetSummaryFragment assetSummaryFragment, FrameLayout frameLayout, TdsTooltipV1View tdsTooltipV1View, int[] iArr, int i, HomeRecyclerView homeRecyclerView) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 77;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        if (onRenderReady.IAuthTabCallback(assetSummaryFragment)) {
            transparentBackground.onExtraCallbackWithResult(tdsTooltipV1View, i, homeRecyclerView, false, (((-setTagsokhttp.onExtraCallbackWithResult(frameLayout, 20)) - tdsTooltipV1View.getHeight()) - iArr[1]) + setTagsokhttp.onExtraCallbackWithResult(frameLayout, 12), setTagsokhttp.onExtraCallbackWithResult(frameLayout, 20), (Function0) null, (Function0) null, 100, (Object) null);
            tdsTooltipV1View.onNavigationEvent(true, new AssetSummaryFragment$.ExternalSyntheticLambda0(assetSummaryFragment, tdsTooltipV1View), 500);
        }
        int i5 = IAuthTabCallbackStubProxy + 21;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit onNavigationEvent(AssetSummaryFragment assetSummaryFragment, TdsTooltipV1View tdsTooltipV1View) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            assetSummaryFragment.onExtraCallback(tdsTooltipV1View, 3000L);
            Unit unit = Unit.INSTANCE;
            int i3 = getInterfaceDescriptor + 37;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        assetSummaryFragment.onExtraCallback(tdsTooltipV1View, 3000L);
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final getPackageType onExtraCallback(TdsTooltipV1View tdsTooltipV1View, long j) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 113;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        WebSocketDataChannel webSocketDataChannelOnExtraCallback = onExtraCallback();
        Object obj = null;
        if (webSocketDataChannelOnExtraCallback != null) {
            int i4 = IAuthTabCallbackStubProxy + 111;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                webSocketDataChannelOnExtraCallback.onExtraCallbackWithResult();
                obj.hashCode();
                throw null;
            }
            FrameLayout frameLayoutOnExtraCallbackWithResult = webSocketDataChannelOnExtraCallback.onExtraCallbackWithResult();
            if (frameLayoutOnExtraCallbackWithResult != null) {
                TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new asBinder(j, tdsTooltipV1View, frameLayoutOnExtraCallbackWithResult, this, null), 3, (Object) null);
                int i5 = IAuthTabCallbackStubProxy + 61;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                return getpackagetypeOnNavigationEvent;
            }
        }
        return null;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ long $delayMillis;
        final /* synthetic */ FrameLayout $this_run;
        final /* synthetic */ TdsTooltipV1View $tooltipView;
        int label;
        final /* synthetic */ AssetSummaryFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(long j, TdsTooltipV1View tdsTooltipV1View, FrameLayout frameLayout, AssetSummaryFragment assetSummaryFragment, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$delayMillis = j;
            this.$tooltipView = tdsTooltipV1View;
            this.$this_run = frameLayout;
            this.this$0 = assetSummaryFragment;
        }

        public static /* synthetic */ Unit onExtraCallback(TdsTooltipV1View tdsTooltipV1View, FrameLayout frameLayout, AssetSummaryFragment assetSummaryFragment) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(tdsTooltipV1View, frameLayout, assetSummaryFragment);
            int i4 = onExtraCallback + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = new asBinder(this.$delayMillis, this.$tooltipView, this.$this_run, this.this$0, access13800Var);
            int i2 = IAuthTabCallback + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 58 / 0;
            }
            int i5 = IAuthTabCallback + 53;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            asBinder asbinderCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return asbinderCreate.invokeSuspend(Unit.INSTANCE);
            }
            asbinderCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        private static final Unit onNavigationEvent(TdsTooltipV1View tdsTooltipV1View, FrameLayout frameLayout, AssetSummaryFragment assetSummaryFragment) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            tdsTooltipV1View.setVisibility(8);
            frameLayout.removeView(tdsTooltipV1View);
            Iterator it = AssetSummaryFragment.asBinder(assetSummaryFragment).iterator();
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    int i5 = onExtraCallback + 33;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    i4 = -1;
                    break;
                }
                if (Intrinsics.areEqual(((Pair) it.next()).getSecond(), tdsTooltipV1View)) {
                    break;
                }
                i4++;
            }
            Integer numValueOf = Integer.valueOf(i4);
            if (numValueOf.intValue() < 0) {
                int i7 = IAuthTabCallback + 45;
                int i8 = i7 % 128;
                onExtraCallback = i8;
                if (i7 % 2 != 0) {
                    throw null;
                }
                int i9 = i8 + 33;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                numValueOf = null;
            }
            if (numValueOf != null) {
                AssetSummaryFragment.asBinder(assetSummaryFragment).remove(numValueOf.intValue());
                WebSocketDataChannel webSocketDataChannel = (WebSocketDataChannel) AssetSummaryFragment.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{assetSummaryFragment}, 1306789490, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1306789481, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
                SwipeRefreshLayout swipeRefreshLayout = webSocketDataChannel != null ? webSocketDataChannel.onExtraCallback : null;
                PillarSwipeRefreshLayout pillarSwipeRefreshLayout = !((swipeRefreshLayout instanceof PillarSwipeRefreshLayout) ^ true) ? (PillarSwipeRefreshLayout) swipeRefreshLayout : null;
                if (pillarSwipeRefreshLayout != null) {
                    List listAsBinder = AssetSummaryFragment.asBinder(assetSummaryFragment);
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listAsBinder, 10));
                    Iterator it2 = listAsBinder.iterator();
                    while (it2.hasNext()) {
                        int i11 = IAuthTabCallback + 105;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        arrayList.add((TdsTooltipV1View) ((Pair) it2.next()).getSecond());
                    }
                    pillarSwipeRefreshLayout.setCompoundViews(arrayList);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0033 A[PHI: r1
          0x0033: PHI (r1v9 java.lang.Object) = (r1v4 java.lang.Object), (r1v10 java.lang.Object) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r5
          0x0025: PHI (r5v1 int) = (r5v0 int), (r5v4 int) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 123;
            onExtraCallback = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 77 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    long j = this.$delayMillis;
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(j, this) == objOnWarmupCompleted) {
                        int i5 = onExtraCallback + 21;
                        IAuthTabCallback = i5 % 128;
                        if (i5 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
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
            TdsTooltipV1View tdsTooltipV1View = this.$tooltipView;
            TdsTooltipV1View.onWarmupCompleted(tdsTooltipV1View, 0, new AssetSummaryFragment$hideTooltipAfterDelay$1$1$.ExternalSyntheticLambda0(tdsTooltipV1View, this.$this_run, this.this$0), 1, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i6 = onExtraCallback + 3;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Unit onNavigationEvent(String str, String str2, fillData filldata, int i) {
        FrameLayout frameLayoutOnExtraCallbackWithResult;
        HomeRecyclerView homeRecyclerViewOnMinimized;
        TdsListRowV1View tdsListRowV1ViewFindViewById;
        View viewFindViewById;
        TdsImageView tdsImageViewFindViewById;
        IIpcChannelStub iIpcChannelStub;
        float width;
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout;
        int i2 = 2 % 2;
        WebSocketDataChannel webSocketDataChannelOnExtraCallback = onExtraCallback();
        Object obj = null;
        if (webSocketDataChannelOnExtraCallback == null || (frameLayoutOnExtraCallbackWithResult = webSocketDataChannelOnExtraCallback.onExtraCallbackWithResult()) == null) {
            return null;
        }
        List<View> list = this.IAuthTabCallback;
        if ((list instanceof Collection) && list.isEmpty()) {
            homeRecyclerViewOnMinimized = onMinimized();
            if (homeRecyclerViewOnMinimized != null) {
            }
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                TdsBubbleTooltipLayout tdsBubbleTooltipLayout = (View) it.next();
                if ((tdsBubbleTooltipLayout instanceof TdsBubbleTooltipLayout) && Intrinsics.areEqual(tdsBubbleTooltipLayout.onExtraCallbackWithResult(), str)) {
                    break;
                }
            }
            homeRecyclerViewOnMinimized = onMinimized();
            if (homeRecyclerViewOnMinimized != null) {
                int i3 = getInterfaceDescriptor + 25;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                RecyclerView.LayoutManager layoutManager = homeRecyclerViewOnMinimized.getLayoutManager();
                View viewFindViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(i) : null;
                if (viewFindViewByPosition != null) {
                    int i5 = IAuthTabCallbackStubProxy + 89;
                    getInterfaceDescriptor = i5 % 128;
                    if (i5 % 2 != 0) {
                        tdsListRowV1ViewFindViewById = (TdsListRowV1View) viewFindViewByPosition.findViewById(im.toss.features.home.core.ui.R.id.list_row);
                        int i6 = 63 / 0;
                    } else {
                        tdsListRowV1ViewFindViewById = viewFindViewByPosition.findViewById(im.toss.features.home.core.ui.R.id.list_row);
                    }
                } else {
                    tdsListRowV1ViewFindViewById = null;
                }
                if (viewFindViewByPosition != null) {
                    int i7 = getInterfaceDescriptor + 121;
                    IAuthTabCallbackStubProxy = i7 % 128;
                    int i8 = i7 % 2;
                    viewFindViewById = viewFindViewByPosition.findViewById(im.toss.inventory_sdk.R.id.innerContainer);
                } else {
                    viewFindViewById = null;
                }
                if (tdsListRowV1ViewFindViewById != null) {
                    tdsImageViewFindViewById = tdsListRowV1ViewFindViewById.mayLaunchUrl();
                } else if (viewFindViewById != null) {
                    int i9 = getInterfaceDescriptor + 55;
                    IAuthTabCallbackStubProxy = i9 % 128;
                    if (i9 % 2 == 0) {
                        viewFindViewById.findViewById(im.toss.features.home.core.ui.R.id.imageContainer);
                        throw null;
                    }
                    tdsImageViewFindViewById = viewFindViewById.findViewById(im.toss.features.home.core.ui.R.id.imageContainer);
                } else {
                    tdsImageViewFindViewById = null;
                }
                ConnectionLog adapter = homeRecyclerViewOnMinimized.getAdapter();
                ConnectionLog connectionLog = adapter instanceof ConnectionLog ? adapter : null;
                if (connectionLog != null) {
                    int i10 = IAuthTabCallbackStubProxy + 51;
                    getInterfaceDescriptor = i10 % 128;
                    int i11 = i10 % 2;
                    List currentList = connectionLog.getCurrentList();
                    if (currentList != null) {
                        int i12 = IAuthTabCallbackStubProxy + 77;
                        getInterfaceDescriptor = i12 % 128;
                        if (i12 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        iIpcChannelStub = (IIpcChannelStub) currentList.get(i);
                    } else {
                        iIpcChannelStub = null;
                    }
                    float width2 = tdsImageViewFindViewById != null ? ((tdsImageViewFindViewById.getWidth() / 2) + tdsImageViewFindViewById.getX()) - setTagsokhttp.onExtraCallbackWithResult(frameLayoutOnExtraCallbackWithResult, 100) : ((iIpcChannelStub instanceof getExtra) || (iIpcChannelStub instanceof makeErrorNo)) ? (setTagsokhttp.onExtraCallbackWithResult(frameLayoutOnExtraCallbackWithResult, 15) + setTagsokhttp.onExtraCallbackWithResult(frameLayoutOnExtraCallbackWithResult, 20)) - setTagsokhttp.onExtraCallbackWithResult(frameLayoutOnExtraCallbackWithResult, 100) : (setTagsokhttp.onExtraCallbackWithResult(frameLayoutOnExtraCallbackWithResult, 20) + setTagsokhttp.onExtraCallbackWithResult(frameLayoutOnExtraCallbackWithResult, 24)) - setTagsokhttp.onExtraCallbackWithResult(frameLayoutOnExtraCallbackWithResult, 100);
                    float y = (tdsImageViewFindViewById == null || viewFindViewByPosition == null) ? 0.0f : (tdsImageViewFindViewById.getY() + generateInviteUrl.IAuthTabCallback(tdsImageViewFindViewById)) - generateInviteUrl.IAuthTabCallback(viewFindViewByPosition);
                    homeRecyclerViewOnMinimized.getLocationOnScreen(new int[2]);
                    if (!this.IAuthTabCallback_Parcel.onExtraCallbackWithResult()) {
                        int i13 = IAuthTabCallbackStubProxy + 85;
                        getInterfaceDescriptor = i13 % 128;
                        int i14 = i13 % 2;
                        if (homeRecyclerViewOnMinimized.getAdapter() != null) {
                            this.IAuthTabCallback_Parcel.onNavigationEvent(true);
                            RecyclerView.Adapter adapter2 = homeRecyclerViewOnMinimized.getAdapter();
                            if (adapter2 != null) {
                                adapter2.registerAdapterDataObserver(this.IAuthTabCallback_Parcel);
                            }
                        }
                    }
                    if (tdsImageViewFindViewById != null) {
                        width = (tdsImageViewFindViewById.getWidth() / 2) - setTagsokhttp.onExtraCallbackWithResult(frameLayoutOnExtraCallbackWithResult, Double.valueOf(0.2d));
                        int i15 = IAuthTabCallbackStubProxy + 7;
                        getInterfaceDescriptor = i15 % 128;
                        int i16 = i15 % 2;
                    } else if (!(iIpcChannelStub instanceof getExtra)) {
                        int i17 = IAuthTabCallbackStubProxy + 3;
                        getInterfaceDescriptor = i17 % 128;
                        int i18 = i17 % 2;
                        int iOnExtraCallbackWithResult = !(iIpcChannelStub instanceof makeErrorNo) ? setTagsokhttp.onExtraCallbackWithResult(frameLayoutOnExtraCallbackWithResult, Double.valueOf(19.8d)) : setTagsokhttp.onExtraCallbackWithResult(frameLayoutOnExtraCallbackWithResult, Double.valueOf(14.8d));
                        width = iOnExtraCallbackWithResult;
                    }
                    Context context = frameLayoutOnExtraCallbackWithResult.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    View tdsBubbleTooltipLayout2 = new TdsBubbleTooltipLayout(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    tdsBubbleTooltipLayout2.setLinkedId(str);
                    tdsBubbleTooltipLayout2.setText(str2);
                    tdsBubbleTooltipLayout2.setPadding(0, 0, 0, 0);
                    tdsBubbleTooltipLayout2.setLeftGradientInnerRadius(width);
                    tdsBubbleTooltipLayout2.setOffset(width2, (-r6[1]) + y);
                    tdsBubbleTooltipLayout2.setOnClickListener(new AssetSummaryFragment$.ExternalSyntheticLambda1(this, tdsBubbleTooltipLayout2, filldata));
                    tdsBubbleTooltipLayout2.setImportantForAccessibility(2);
                    if (tdsListRowV1ViewFindViewById != null) {
                        tdsBubbleTooltipLayout2.setCoordinateView(tdsListRowV1ViewFindViewById);
                    }
                    if (viewFindViewById != null) {
                        tdsBubbleTooltipLayout2.setCoordinateView(viewFindViewById);
                    }
                    TdsBubbleTooltipLayout.onExtraCallbackWithResult(tdsBubbleTooltipLayout2, i, homeRecyclerViewOnMinimized, 0.0f, false, false, (Function0) null, (Function0) null, 124, (Object) null);
                    TdsBubbleTooltipLayout.onWarmupCompleted(tdsBubbleTooltipLayout2, 0, 1, (Object) null);
                    frameLayoutOnExtraCallbackWithResult.addView(tdsBubbleTooltipLayout2);
                    this.IAuthTabCallback.add(tdsBubbleTooltipLayout2);
                    WebSocketDataChannel webSocketDataChannelOnExtraCallback2 = onExtraCallback();
                    SwipeRefreshLayout swipeRefreshLayout = webSocketDataChannelOnExtraCallback2 != null ? webSocketDataChannelOnExtraCallback2.onExtraCallback : null;
                    if (swipeRefreshLayout instanceof PillarSwipeRefreshLayout) {
                        int i19 = getInterfaceDescriptor + 51;
                        IAuthTabCallbackStubProxy = i19 % 128;
                        if (i19 % 2 == 0) {
                            throw null;
                        }
                        pillarSwipeRefreshLayout = (PillarSwipeRefreshLayout) swipeRefreshLayout;
                    } else {
                        pillarSwipeRefreshLayout = null;
                    }
                    if (pillarSwipeRefreshLayout != null) {
                        pillarSwipeRefreshLayout.setCompoundViews(this.IAuthTabCallback);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final void IAuthTabCallback(AssetSummaryFragment assetSummaryFragment, TdsBubbleTooltipLayout tdsBubbleTooltipLayout, fillData filldata, View view) {
        int i = 2 % 2;
        assetSummaryFragment.IAuthTabCallback(tdsBubbleTooltipLayout);
        fillData.getInterfaceDescriptor.onWarmupCompleted(assetSummaryFragment, filldata, new BaseEmbedView.onNavigationEvent(RVManifestWrapper.Companion.onNavigationEvent("this"), filldata, (DefaultConstructorMarker) null), (String) null, 4, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 109;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 29 / 0;
        }
    }

    private final void IAuthTabCallback(TdsBubbleTooltipLayout tdsBubbleTooltipLayout) {
        SwipeRefreshLayout swipeRefreshLayout;
        int i = 2 % 2;
        this.IAuthTabCallback.remove(tdsBubbleTooltipLayout);
        WebSocketDataChannel webSocketDataChannelOnExtraCallback = onExtraCallback();
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout = null;
        if (webSocketDataChannelOnExtraCallback != null) {
            int i2 = IAuthTabCallbackStubProxy + 1;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                FrameLayout frameLayoutOnExtraCallbackWithResult = webSocketDataChannelOnExtraCallback.onExtraCallbackWithResult();
                if (frameLayoutOnExtraCallbackWithResult != null) {
                    frameLayoutOnExtraCallbackWithResult.removeView(tdsBubbleTooltipLayout);
                }
            } else {
                webSocketDataChannelOnExtraCallback.onExtraCallbackWithResult();
                throw null;
            }
        }
        WebSocketDataChannel webSocketDataChannelOnExtraCallback2 = onExtraCallback();
        if (webSocketDataChannelOnExtraCallback2 != null) {
            int i3 = getInterfaceDescriptor + 27;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            swipeRefreshLayout = webSocketDataChannelOnExtraCallback2.onExtraCallback;
        } else {
            swipeRefreshLayout = null;
        }
        if (swipeRefreshLayout instanceof PillarSwipeRefreshLayout) {
            int i5 = getInterfaceDescriptor + 33;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            pillarSwipeRefreshLayout = (PillarSwipeRefreshLayout) swipeRefreshLayout;
        }
        if (pillarSwipeRefreshLayout != null) {
            pillarSwipeRefreshLayout.setCompoundViews(this.IAuthTabCallback);
        }
    }

    public void onNavigationEvent(@NotNull RecyclerView.ViewHolder viewHolder, @Nullable Object obj, @Nullable Map<String, ? extends Object> map) {
        RVManifestBridgeExtensionManifest rVManifestBridgeExtensionManifest;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        String strOnNavigationEvent = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            boolean z = obj instanceof doInitialize;
            strOnNavigationEvent.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (!(obj instanceof doInitialize)) {
            rVManifestBridgeExtensionManifest = null;
        } else {
            int i3 = getInterfaceDescriptor + 69;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 == 0) {
                strOnNavigationEvent.hashCode();
                throw null;
            }
            rVManifestBridgeExtensionManifest = (doInitialize) obj;
        }
        if (rVManifestBridgeExtensionManifest != null) {
            int i4 = IAuthTabCallbackStubProxy + 31;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            strOnNavigationEvent = rVManifestBridgeExtensionManifest.onNavigationEvent();
        }
        if (Intrinsics.areEqual(strOnNavigationEvent, "ASSET_OVERVIEW:HIGH_INTEREST_TRANSFER:BANNER") && asBinder().onNavigationEvent("ASSET_OVERVIEW:HIGH_INTEREST_TRANSFER:BANNER:CLIENT")) {
            onNavigationEvent().setEngagementSignalsCallback();
            int i6 = IAuthTabCallbackStubProxy + 91;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
        }
        super.onNavigationEvent(viewHolder, obj, map);
    }

    public boolean onBackPressed() {
        int i = 2 % 2;
        AssetTriumphAnimationView assetTriumphAnimationView = this.access000;
        if (assetTriumphAnimationView != null) {
            int i2 = IAuthTabCallbackStubProxy + 23;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            if (assetTriumphAnimationView.getVisibility() == 0) {
                int i4 = IAuthTabCallbackStubProxy + 109;
                getInterfaceDescriptor = i4 % 128;
                return i4 % 2 == 0;
            }
        }
        boolean zOnBackPressed = super/*im.toss.base.BaseFragment*/.onBackPressed();
        int i5 = IAuthTabCallbackStubProxy + 87;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return zOnBackPressed;
    }

    public void onNavigationEvent(long j, @NotNull getSingleViewMap.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.onExtraCallback.onWarmupCompleted(new onNavigationEvent(j, onextracallbackwithresult, (DefaultConstructorMarker) null));
        int i2 = getInterfaceDescriptor + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onDestroyView() {
        RecyclerView.Adapter adapter;
        int i = 2 % 2;
        Rally rally = this.asInterface;
        if (rally != null) {
            rally.ICustomTabsServiceStub();
        }
        Object obj = null;
        this.asInterface = null;
        this.IAuthTabCallbackDefault = false;
        super.onDestroyView();
        if (!(!this.IAuthTabCallback_Parcel.onExtraCallbackWithResult())) {
            int i2 = IAuthTabCallbackStubProxy + 115;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                onMinimized();
                throw null;
            }
            HomeRecyclerView homeRecyclerViewOnMinimized = onMinimized();
            if (homeRecyclerViewOnMinimized != null && (adapter = homeRecyclerViewOnMinimized.getAdapter()) != null) {
                int i3 = IAuthTabCallbackStubProxy + 9;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
                adapter.unregisterAdapterDataObserver(this.IAuthTabCallback_Parcel);
            }
        }
        int i5 = getInterfaceDescriptor + 71;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r11.isAttachedToWindow() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r11.isAttachedToWindow() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        r1 = getViewLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        o.maybeUpdateAnimatable.onNavigationEvent(o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r1), (kotlin.coroutines.CoroutineContext) null, (o.setRandomHost) null, new im.toss.features.home.ui.dst.view.asset.summary.AssetSummaryFragment.IAuthTabCallbackStubProxy(r11, null), 3, (java.lang.Object) null);
        r11 = im.toss.features.home.ui.dst.view.asset.summary.AssetSummaryFragment.getInterfaceDescriptor + 43;
        im.toss.features.home.ui.dst.view.asset.summary.AssetSummaryFragment.IAuthTabCallbackStubProxy = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if ((r11 % 2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        r11.addOnAttachStateChangeListener(new im.toss.features.home.ui.dst.view.asset.summary.AssetSummaryFragment.IAuthTabCallback_Parcel(r11, r10, r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(List<ActionSheetBridgeExtension2> list) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 48 / 0;
            if (!(!list.isEmpty())) {
                return;
            }
        } else if (list.isEmpty()) {
            return;
        }
        int i4 = getInterfaceDescriptor + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        HomeDstRecyclerView homeDstRecyclerViewOnMinimized = onMinimized();
        Object obj = null;
        HomeDstRecyclerView homeDstRecyclerView = !((homeDstRecyclerViewOnMinimized instanceof HomeDstRecyclerView) ^ true) ? homeDstRecyclerViewOnMinimized : null;
        if (homeDstRecyclerView == null) {
            return;
        }
        int i6 = getInterfaceDescriptor + 71;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 72 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AssetSummaryFragment assetSummaryFragment = (AssetSummaryFragment) objArr[0];
        access13800 access13800Var = (access13800) objArr[1];
        int i = 2 % 2;
        setResourceInternal setresourceinternal = new setResourceInternal(access14300.onWarmupCompleted(access13800Var), 1);
        setresourceinternal.onTransact();
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        WebSocketDataChannel webSocketDataChannel = (WebSocketDataChannel) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, new Object[]{assetSummaryFragment}, 1306789490, iOnNavigationEvent2, -1306789481, iOnNavigationEvent3);
        if (webSocketDataChannel != null) {
            int i2 = IAuthTabCallbackStubProxy + 49;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            if (onExtraCallbackWithResult(assetSummaryFragment, (RecyclerView) webSocketDataChannel.onExtraCallbackWithResult.onExtraCallbackWithResult())) {
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(webSocketDataChannel, setresourceinternal);
                setresourceinternal.IAuthTabCallback(new onExtraCallback(webSocketDataChannel, iAuthTabCallback));
                webSocketDataChannel.onExtraCallbackWithResult.onExtraCallbackWithResult().addOnScrollListener(iAuthTabCallback);
            } else {
                Result.Companion companion = Result.Companion;
                setresourceinternal.resumeWith(Result.constructor-impl(Unit.INSTANCE));
            }
        }
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14300.onWarmupCompleted()) {
            access14600.IAuthTabCallback(access13800Var);
            int i4 = IAuthTabCallbackStubProxy + 125;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
        if (objIAuthTabCallbackDefault != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i6 = getInterfaceDescriptor + 37;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 86 / 0;
        }
        return objIAuthTabCallbackDefault;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(AssetSummaryFragment assetSummaryFragment, TdsBubbleTooltipLayout tdsBubbleTooltipLayout, fillData filldata, View view) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, new Object[]{assetSummaryFragment, tdsBubbleTooltipLayout, filldata, view}, -255028322, iOnNavigationEvent2, 255028332, iOnNavigationEvent3);
    }

    public static /* synthetic */ Unit onNavigationEvent(AssetSummaryFragment assetSummaryFragment, WebSocketDataChannel webSocketDataChannel) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Unit) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, new Object[]{assetSummaryFragment, webSocketDataChannel}, 308250475, iOnNavigationEvent2, -308250469, iOnNavigationEvent3);
    }

    public static final /* synthetic */ WebSocketDataChannel onNavigationEvent(AssetSummaryFragment assetSummaryFragment) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (WebSocketDataChannel) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, new Object[]{assetSummaryFragment}, 1306789490, iOnNavigationEvent2, -1306789481, iOnNavigationEvent3);
    }

    public static final /* synthetic */ TdsSkeletonV1View asInterface(AssetSummaryFragment assetSummaryFragment) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (TdsSkeletonV1View) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, new Object[]{assetSummaryFragment}, 1828195692, iOnNavigationEvent2, -1828195680, iOnNavigationEvent3);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(AssetSummaryFragment assetSummaryFragment, List list) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, new Object[]{assetSummaryFragment, list}, 1337623944, iOnNavigationEvent2, -1337623939, iOnNavigationEvent3);
    }

    public static final /* synthetic */ void onNavigationEvent(AssetSummaryFragment assetSummaryFragment, AssetTriumphAnimationView assetTriumphAnimationView) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, new Object[]{assetSummaryFragment, assetTriumphAnimationView}, -2101083224, iOnNavigationEvent2, 2101083228, iOnNavigationEvent3);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(AssetSummaryFragment assetSummaryFragment, AssetSummaryViewModel.UpdatedAccount updatedAccount) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, new Object[]{assetSummaryFragment, updatedAccount}, -869810682, iOnNavigationEvent2, 869810685, iOnNavigationEvent3);
    }

    private final Object onExtraCallbackWithResult(access13800<? super Unit> access13800Var) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, new Object[]{this, access13800Var}, -329781733, iOnNavigationEvent2, 329781735, iOnNavigationEvent3);
    }

    private final void IAuthTabCallback(AssetSummaryViewModel.UpdatedAccount updatedAccount) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, new Object[]{this, updatedAccount}, 1531970833, iOnNavigationEvent2, -1531970833, iOnNavigationEvent3);
    }

    private final void ICustomTabsService() {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, new Object[]{this}, -362617958, iOnNavigationEvent2, 362617971, iOnNavigationEvent3);
    }

    private final void mayLaunchUrl() {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, new Object[]{this}, -19859561, iOnNavigationEvent2, 19859569, iOnNavigationEvent3);
    }

    private final Unit onWarmupCompleted(int i, AssetSummaryViewModel.UpdatedAccount updatedAccount) {
        Object[] objArr = {this, Integer.valueOf(i), updatedAccount};
        return (Unit) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, -147054479, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 147054493, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    private final Unit onExtraCallback(int i, String str, fillData filldata) {
        Object[] objArr = {this, Integer.valueOf(i), str, filldata};
        return (Unit) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, -1562123271, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1562123272, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
    }

    private final void onExtraCallbackWithResult(AssetSummaryViewModel.UpdatedAccount updatedAccount) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, new Object[]{this, updatedAccount}, -273320070, iOnNavigationEvent2, 273320081, iOnNavigationEvent3);
    }

    private static final void IAuthTabCallback(AssetSummaryFragment assetSummaryFragment, View view) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, new Object[]{assetSummaryFragment, view}, 886716768, iOnNavigationEvent2, -886716761, iOnNavigationEvent3);
    }
}
