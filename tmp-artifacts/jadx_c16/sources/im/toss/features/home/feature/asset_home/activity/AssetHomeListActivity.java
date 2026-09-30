package im.toss.features.home.feature.asset_home.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.initech.pkix.cmp.client.util.URI;
import im.toss.features.home.core.hds.view.HomeTabLayout;
import im.toss.features.home.core.ui.base.BaseHomeActivity;
import im.toss.features.home.core.ui.recyclerview.HomeDstRecyclerView;
import im.toss.features.home.core.ui.recyclerview.HomeRecyclerView;
import im.toss.features.home.feature.asset_home.R;
import im.toss.features.home.feature.asset_home.activity.AssetHomeListActivity$;
import im.toss.features.home.feature.asset_home.viewmodel.AssetHomeListViewModel;
import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import im.toss.features.password.api.annotation.RequiresAuth;
import im.toss.features.tosscert.ui.R;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import im.toss.uikit.widget.AssetTriumphAnimationView;
import im.toss.uikit.widget.tab.TdsTabV1View;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import o.Address;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda5;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0;
import o.AppLovinSdkSettings;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BaseEmbedView;
import o.BundleUtils;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.ConnectionLog;
import o.ConvertFloatArrayToByteArray;
import o.ForwardingCameraControl;
import o.GriverBridgeCallPreInterceptEventPreInterceptBridgeContext;
import o.NativeActionFilter;
import o.NativePermissionRequire;
import o.RVExecutorService;
import o.RVManifestIProxyManifest;
import o.RVManifestWrapper;
import o.RightClickGesturesKtonRightClickDown2;
import o.SystemPropertiesCompat;
import o.TaskControllService;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import o.UTF8Decoder;
import o.access13800;
import o.access14300;
import o.access8100;
import o.attachAppLovinSdk;
import o.decodeLocalIdToPath;
import o.deprecated_certificatePinner;
import o.doInitialize;
import o.fillData;
import o.findResAndMsg;
import o.formatMsgs;
import o.getAdService;
import o.getCornerRadius;
import o.getCurrentScheduleType;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getExtraParameters;
import o.getGroupId;
import o.getIgnoreErrorResourceHostList;
import o.getKekid;
import o.getSpecialFeatureOptInStatus;
import o.getSupportedHighSpeedResolutionsFor;
import o.getUrlokhttp;
import o.getWrite;
import o.isBackgroundRunning;
import o.isBackgroundRunning$IAuthTabCallback$onExtraCallback;
import o.isMuted;
import o.isXiaoPeng;
import o.isZslDisabledByByUserCaseConfig;
import o.maybeUpdateAnimatable;
import o.onMenuItemClick;
import o.readIntokhttp;
import o.resetDimensions;
import o.setAdVideoPlaybackListener;
import o.setHasWhiteScreen;
import o.setRandomHost;
import o.setRubIn;
import o.setShine;
import o.setUseCaseAttached;
import o.setVisitUrl;
import o.y1hExternalSyntheticLambda0;
import org.jetbrains.annotations.Nullable;

@RequiresAuth(onExtraCallback = 48, onExtraCallbackWithResult = URI.ENABLE_BACKWARDS_COMPATIBILITY, onWarmupCompleted = UTF8Decoder.HOME_ASSET)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AssetHomeListActivity extends Hilt_AssetHomeListActivity<getCurrentScheduleType, AssetHomeListViewModel, RVManifestIProxyManifest> implements ConnectionLog.IAuthTabCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static int IAuthTabCallbackStubProxy = 0;
    private static long IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int access100 = 0;
    private static int getInterfaceDescriptor = 1;
    public static final int onTransact;
    private final Lazy IAuthTabCallbackDefault;
    private AssetTriumphAnimationView IAuthTabCallbackStub;
    private final String asBinder;
    private boolean asInterface;

    static {
        getActiveNotifications();
        Companion = new onExtraCallback((DefaultConstructorMarker) null);
        onTransact = 8;
        int i = access100 + 73;
        access000 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(attachapplovinsdk);
        }
        onExtraCallback(attachapplovinsdk);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getCornerRadius getcornerradius, isBackgroundRunning$IAuthTabCallback$onExtraCallback isbackgroundrunning_iauthtabcallback_onextracallback) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(getcornerradius, isbackgroundrunning_iauthtabcallback_onextracallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(getcornerradius, isbackgroundrunning_iauthtabcallback_onextracallback);
        int i3 = getInterfaceDescriptor + 113;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 97;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(getsupportedhighspeedresolutionsfor);
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit IAuthTabCallback(isBackgroundRunning isbackgroundrunning, AssetHomeListActivity assetHomeListActivity, getCornerRadius getcornerradius, getCornerRadius getcornerradius2, Lazy lazy, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 7;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallback(isbackgroundrunning, assetHomeListActivity, getcornerradius, getcornerradius2, lazy, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(isbackgroundrunning, assetHomeListActivity, getcornerradius, getcornerradius2, lazy, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0 IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, onMenuItemClick onmenuitemclick) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0 androidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0OnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutionsfor, onmenuitemclick);
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return androidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0OnNavigationEvent;
    }

    public static /* synthetic */ void IAuthTabCallback(AssetHomeListActivity assetHomeListActivity, int i, TabLayout.OnTabSelectedListener onTabSelectedListener) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 61;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        asInterface(assetHomeListActivity, i, onTabSelectedListener);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        AssetHomeListActivity assetHomeListActivity = (AssetHomeListActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        TabLayout.OnTabSelectedListener onTabSelectedListener = (TabLayout.OnTabSelectedListener) objArr[2];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr2 = {assetHomeListActivity, Integer.valueOf(iIntValue), onTabSelectedListener};
            onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 19467005, objArr2, -19467002, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
            return null;
        }
        Object[] objArr3 = {assetHomeListActivity, Integer.valueOf(iIntValue), onTabSelectedListener};
        onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 19467005, objArr3, -19467002, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        throw null;
    }

    private static final boolean notifyNotificationWithChannel() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 29;
        IAuthTabCallbackStubProxy = i3 % 128;
        boolean z = i3 % 2 == 0;
        int i4 = i2 + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public static /* synthetic */ Rally onExtraCallback(AssetHomeListActivity assetHomeListActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return getInterfaceDescriptor(assetHomeListActivity);
        }
        getInterfaceDescriptor(assetHomeListActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(AssetHomeListActivity assetHomeListActivity, fillData filldata) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 77;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(assetHomeListActivity, filldata);
        }
        onExtraCallbackWithResult(assetHomeListActivity, filldata);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(AssetHomeListActivity assetHomeListActivity, getCornerRadius getcornerradius, getCornerRadius getcornerradius2, Lazy lazy, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 41;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(assetHomeListActivity, getcornerradius, getcornerradius2, lazy, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackStubProxy + 119;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(AssetHomeListActivity assetHomeListActivity, int i, TabLayout.OnTabSelectedListener onTabSelectedListener) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 23;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {assetHomeListActivity, Integer.valueOf(i), onTabSelectedListener};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 365254090, objArr, -365254085, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        int i5 = getInterfaceDescriptor + 3;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void onExtraCallback(AssetHomeListActivity assetHomeListActivity, Ref.ObjectRef objectRef, int i, RecyclerView.OnScrollListener onScrollListener) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 27;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback(assetHomeListActivity, objectRef, i, onScrollListener);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        AppBarLayout appBarLayout = (AppBarLayout) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {getcornerradius, appBarLayout, Integer.valueOf(iIntValue)};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        if (i3 == 0) {
            onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -544378933, objArr2, 544378934, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
            return null;
        }
        onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -544378933, objArr2, 544378934, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AssetHomeListActivity assetHomeListActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(assetHomeListActivity);
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return unitAccess000;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AssetHomeListActivity assetHomeListActivity, AssetHomeListViewModel.UpdatedAccount updatedAccount) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            unit = (Unit) onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 311918955, new Object[]{assetHomeListActivity, updatedAccount}, -311918943, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
            int i3 = 93 / 0;
        } else {
            int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            unit = (Unit) onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, 311918955, new Object[]{assetHomeListActivity, updatedAccount}, -311918943, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        }
        int i4 = IAuthTabCallbackStubProxy + 125;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AssetHomeListActivity assetHomeListActivity, getCornerRadius getcornerradius, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 115;
        IAuthTabCallbackStubProxy = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onWarmupCompleted(assetHomeListActivity, getcornerradius, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(assetHomeListActivity, getcornerradius, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackStubProxy + 103;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int iIntValue;
        int i7 = ~i4;
        int i8 = ~(i7 | i3);
        int i9 = ~i5;
        int i10 = (~(i9 | i4)) | i8;
        int i11 = ~i3;
        int i12 = i11 | i4;
        int i13 = i10 | (~i12);
        int i14 = i7 | i5;
        int i15 = i8 | (~i14);
        int i16 = (~(i3 | i14)) | (~(i7 | i9 | i11)) | (~(i12 | i5));
        int i17 = i4 + i5 + i2 + ((-1254723898) * i) + ((-1667789834) * i6);
        int i18 = i17 * i17;
        int i19 = ((i4 * (-402395399)) - 1316031342) + (i5 * (-402392591)) + (i13 * (-936)) + (i15 * 1872) + (i16 * 936) + ((-402393527) * i2) + ((-1219896714) * i) + ((-610841306) * i6) + (i18 * (-825819136));
        switch (((-534547663) * i4) + 1379663872 + ((-481802647) * i5) + ((-17581672) * i13) + (35163344 * i15) + (17581672 * i16) + ((-499384320) * i2) + ((-1033371648) * i) + ((-106430464) * i6) + (1552875520 * i18) + (i19 * i19 * (-1063190528))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                AssetHomeListActivity assetHomeListActivity = (AssetHomeListActivity) objArr[0];
                int i20 = 2 % 2;
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(assetHomeListActivity), (CoroutineContext) null, (setRandomHost) null, assetHomeListActivity.new onNavigationEvent((AssetHomeListViewModel.UpdatedAccount) objArr[1], null), 3, (Object) null);
                int i21 = getInterfaceDescriptor + 81;
                IAuthTabCallbackStubProxy = i21 % 128;
                int i22 = i21 % 2;
                return null;
            case 3:
                return onExtraCallback(objArr);
            case 4:
                TaskControllService taskControllService = (TaskControllService) objArr[0];
                AssetHomeListActivity assetHomeListActivity2 = (AssetHomeListActivity) objArr[1];
                fillData filldata = (fillData) objArr[2];
                int i23 = 2 % 2;
                Intrinsics.checkNotNullParameter(filldata, "");
                taskControllService.IAuthTabCallback();
                fillData.getInterfaceDescriptor.onWarmupCompleted(assetHomeListActivity2, filldata, new BaseEmbedView.onNavigationEvent(RVManifestWrapper.Companion.onNavigationEvent(""), filldata, (DefaultConstructorMarker) null), (String) null, 4, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i24 = getInterfaceDescriptor + 49;
                IAuthTabCallbackStubProxy = i24 % 128;
                int i25 = i24 % 2;
                return unit;
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                final BaseHomeActivity baseHomeActivity = (AssetHomeListActivity) objArr[0];
                int i26 = 2 % 2;
                int i27 = getInterfaceDescriptor + 53;
                IAuthTabCallbackStubProxy = i27 % 128;
                int i28 = i27 % 2;
                HomeTabLayout homeTabLayout = baseHomeActivity.updateVisuals().onExtraCallbackWithResult;
                Resources resources = baseHomeActivity.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                Configuration configuration = resources.getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                if (readIntokhttp.onExtraCallback(configuration)) {
                    Configuration configuration2 = baseHomeActivity.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration2, "");
                    iIntValue = new getUrlokhttp(new onWarmupCompleted(configuration2)).onGreatestScrollPercentageIncreased();
                } else {
                    Configuration configuration3 = baseHomeActivity.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration3, "");
                    iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onExtraCallbackWithResult(configuration3))}, -1252317281, 1252317293, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue();
                }
                homeTabLayout.setBorderColor(iIntValue);
                baseHomeActivity.updateVisuals().access100.setOnRefreshListener(new AssetHomeListActivity$.ExternalSyntheticLambda15(baseHomeActivity));
                Lazy lazyOnExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new AssetHomeListActivity$.ExternalSyntheticLambda16(baseHomeActivity));
                getCornerRadius getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(new isBackgroundRunning$IAuthTabCallback$onExtraCallback(0, 0, setUseCaseAttached.Companion.onNavigationEvent(), null));
                getCornerRadius getcornerradiusOnNavigationEvent2 = setShine.onNavigationEvent(new SystemPropertiesCompat(0, 0, 3, (DefaultConstructorMarker) null));
                final AssetHomeListActivity$.ExternalSyntheticLambda17 externalSyntheticLambda17 = new AssetHomeListActivity$.ExternalSyntheticLambda17(getcornerradiusOnNavigationEvent2);
                baseHomeActivity.updateVisuals().onWarmupCompleted.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-116411880, true, new AssetHomeListActivity$.ExternalSyntheticLambda18(baseHomeActivity, getcornerradiusOnNavigationEvent2, getcornerradiusOnNavigationEvent, lazyOnExtraCallbackWithResult))));
                baseHomeActivity.updateVisuals().IAuthTabCallbackStub.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1268097679, true, new AssetHomeListActivity$.ExternalSyntheticLambda19(baseHomeActivity, getcornerradiusOnNavigationEvent2))));
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(baseHomeActivity), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(baseHomeActivity, getcornerradiusOnNavigationEvent, getcornerradiusOnNavigationEvent2, (access13800) null), 3, (Object) null);
                final HomeDstRecyclerView homeDstRecyclerViewOnExtraCallbackWithResult = baseHomeActivity.updateVisuals().onExtraCallback.onExtraCallbackWithResult();
                RecyclerView.Adapter adapter = homeDstRecyclerViewOnExtraCallbackWithResult.getAdapter();
                LinearLayoutManager layoutManager = homeDstRecyclerViewOnExtraCallbackWithResult.getLayoutManager();
                LinearLayoutManager linearLayoutManager = !(layoutManager instanceof LinearLayoutManager) ? null : layoutManager;
                if (adapter != null) {
                    adapter.registerAdapterDataObserver(new IAuthTabCallbackStub(homeDstRecyclerViewOnExtraCallbackWithResult, linearLayoutManager));
                    int i29 = getInterfaceDescriptor + 85;
                    IAuthTabCallbackStubProxy = i29 % 128;
                    int i30 = i29 % 2;
                }
                if (((Boolean) HomeRecyclerView.IAuthTabCallback(getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 1395069564, new Object[]{homeDstRecyclerViewOnExtraCallbackWithResult}, -1395069560, getKekid.onExtraCallback())).booleanValue()) {
                    homeDstRecyclerViewOnExtraCallbackWithResult.setOnStackAnimationEnd(new AssetHomeListActivity$.ExternalSyntheticLambda20(baseHomeActivity));
                }
                final resetDimensions resetdimensions = new resetDimensions(0.0f, new AssetHomeListActivity$.ExternalSyntheticLambda22(baseHomeActivity), new AssetHomeListActivity$.ExternalSyntheticLambda23(baseHomeActivity), new AssetHomeListActivity$.ExternalSyntheticLambda21(baseHomeActivity), new AssetHomeListActivity$.ExternalSyntheticLambda24(baseHomeActivity, new Ref.ObjectRef()), 1, (DefaultConstructorMarker) null);
                baseHomeActivity.getLifecycle().IAuthTabCallback(new DefaultLifecycleObserver() { // from class: im.toss.features.home.feature.asset_home.activity.AssetHomeListActivity$initViews$7
                    private static int asInterface = 1;
                    private static int onWarmupCompleted;

                    public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                        int i31 = 2 % 2;
                        int i32 = asInterface + 103;
                        onWarmupCompleted = i32 % 128;
                        int i33 = i32 % 2;
                        super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
                        if (i33 == 0) {
                            return;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    public /* bridge */ void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                        int i31 = 2 % 2;
                        int i32 = asInterface + 39;
                        onWarmupCompleted = i32 % 128;
                        int i33 = i32 % 2;
                        super.onDestroy(textFieldScrollKtExternalSyntheticLambda0);
                        int i34 = asInterface + 23;
                        onWarmupCompleted = i34 % 128;
                        if (i34 % 2 != 0) {
                            throw null;
                        }
                    }

                    public /* bridge */ void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                        int i31 = 2 % 2;
                        int i32 = onWarmupCompleted + 49;
                        asInterface = i32 % 128;
                        int i33 = i32 % 2;
                        Object obj = null;
                        super.onPause(textFieldScrollKtExternalSyntheticLambda0);
                        if (i33 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        int i34 = onWarmupCompleted + 7;
                        asInterface = i34 % 128;
                        if (i34 % 2 != 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }

                    public /* bridge */ void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                        int i31 = 2 % 2;
                        int i32 = onWarmupCompleted + 17;
                        asInterface = i32 % 128;
                        int i33 = i32 % 2;
                        Object obj = null;
                        super.onResume(textFieldScrollKtExternalSyntheticLambda0);
                        if (i33 == 0) {
                            throw null;
                        }
                        int i34 = asInterface + 23;
                        onWarmupCompleted = i34 % 128;
                        if (i34 % 2 == 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }

                    public void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                        int i31 = 2 % 2;
                        int i32 = onWarmupCompleted + 95;
                        asInterface = i32 % 128;
                        int i33 = i32 % 2;
                        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                        AssetHomeListActivity.IAuthTabCallback(this.IAuthTabCallback).IAuthTabCallback.addOnOffsetChangedListener(externalSyntheticLambda17);
                        homeDstRecyclerViewOnExtraCallbackWithResult.addOnScrollListener(resetdimensions.onNavigationEvent());
                        int i34 = onWarmupCompleted + 69;
                        asInterface = i34 % 128;
                        if (i34 % 2 == 0) {
                            throw null;
                        }
                    }

                    public void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                        int i31 = 2 % 2;
                        int i32 = onWarmupCompleted + 3;
                        asInterface = i32 % 128;
                        int i33 = i32 % 2;
                        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                        AssetHomeListActivity.IAuthTabCallback(this.IAuthTabCallback).IAuthTabCallback.removeOnOffsetChangedListener(externalSyntheticLambda17);
                        homeDstRecyclerViewOnExtraCallbackWithResult.removeOnScrollListener(resetdimensions.onNavigationEvent());
                        int i34 = onWarmupCompleted + 41;
                        asInterface = i34 % 128;
                        if (i34 % 2 != 0) {
                            return;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                });
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(baseHomeActivity), (CoroutineContext) null, (setRandomHost) null, new onTransact(baseHomeActivity, resetdimensions, (access13800) null), 3, (Object) null);
                return null;
            case 7:
                return onNavigationEvent(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                TaskControllService taskControllService2 = (TaskControllService) objArr[0];
                AssetHomeListActivity assetHomeListActivity3 = (AssetHomeListActivity) objArr[1];
                isXiaoPeng isxiaopeng = (isXiaoPeng) objArr[2];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
                int iIntValue2 = ((Number) objArr[4]).intValue();
                int i31 = 2 % 2;
                int i32 = getInterfaceDescriptor + 83;
                IAuthTabCallbackStubProxy = i32 % 128;
                int i33 = i32 % 2;
                Unit unitIAuthTabCallback = IAuthTabCallback(taskControllService2, assetHomeListActivity3, isxiaopeng, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
                int i34 = getInterfaceDescriptor + 107;
                IAuthTabCallbackStubProxy = i34 % 128;
                int i35 = i34 % 2;
                return unitIAuthTabCallback;
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return IAuthTabCallbackStub(objArr);
            case 12:
                return asBinder(objArr);
            case 13:
                return asInterface(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AssetHomeListActivity assetHomeListActivity = (AssetHomeListActivity) objArr[0];
        fillData filldata = (fillData) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(assetHomeListActivity, filldata);
        }
        onWarmupCompleted(assetHomeListActivity, filldata);
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(AssetHomeListActivity assetHomeListActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel(assetHomeListActivity);
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
    }

    public static /* synthetic */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean zNotifyNotificationWithChannel = notifyNotificationWithChannel();
        int i4 = IAuthTabCallbackStubProxy + 121;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return zNotifyNotificationWithChannel;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 31;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AssetHomeListActivity assetHomeListActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 121;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(assetHomeListActivity);
        int i4 = IAuthTabCallbackStubProxy + 17;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAccess100;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AssetHomeListActivity assetHomeListActivity, AssetHomeListViewModel.UpdatedAccount updatedAccount) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(assetHomeListActivity, updatedAccount);
        int i4 = getInterfaceDescriptor + 3;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(appLovinSdkSettings);
        }
        onExtraCallbackWithResult(appLovinSdkSettings);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TaskControllService taskControllService, AssetHomeListActivity assetHomeListActivity, fillData filldata) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            return (Unit) onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1562279191, new Object[]{taskControllService, assetHomeListActivity, filldata}, -1562279187, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        }
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 53;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return 1000712L;
        }
        throw null;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback_Parcel ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 33;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback_Parcel)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 45811), 85 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 21232 - ExpandableListView.getPackedPositionChild(0L), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14185), 19 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 8808 - Color.blue(0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 109;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            if (r1 == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r3 = im.toss.features.home.feature.asset_home.activity.AssetHomeListActivity.onExtraCallbackWithResult.onNavigationEvent + 41;
            im.toss.features.home.feature.asset_home.activity.AssetHomeListActivity.onExtraCallbackWithResult.onWarmupCompleted = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if ((r3 % 2) == 0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        
            r2.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r5.onExtraCallbackWithResult) != true) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r5.onExtraCallbackWithResult) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            r1 = im.toss.features.home.feature.asset_home.activity.AssetHomeListActivity.onExtraCallbackWithResult.onNavigationEvent + 7;
            im.toss.features.home.feature.asset_home.activity.AssetHomeListActivity.onExtraCallbackWithResult.onWarmupCompleted = r1 % 128;
            r1 = r1 % 2;
            r0 = o.getSpecialFeatureOptInStatus.Dark;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                int i3 = 94 / 0;
            }
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = onExtraCallbackWithResult + 99;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            throw null;
        }
    }

    public static final class access100 implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ ComponentActivity IAuthTabCallback;

        public access100(ComponentActivity componentActivity) {
            this.IAuthTabCallback = componentActivity;
        }

        public final ViewModelProvider.onWarmupCompleted IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.IAuthTabCallback.getDefaultViewModelProviderFactory();
            int i4 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return defaultViewModelProviderFactory;
            }
            throw null;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return IAuthTabCallback();
            }
            IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class extraCallback implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ ComponentActivity onExtraCallback;

        public extraCallback(ComponentActivity componentActivity) {
            this.onExtraCallback = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted();
            int i4 = onNavigationEvent + 91;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.onExtraCallback.getViewModelStore();
            int i4 = onNavigationEvent + 61;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return viewModelStore;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class readTypedObject implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Function0 onExtraCallbackWithResult;
        final /* synthetic */ ComponentActivity onNavigationEvent;

        public readTypedObject(Function0 function0, ComponentActivity componentActivity) {
            this.onExtraCallbackWithResult = function0;
            this.onNavigationEvent = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted = onWarmupCompleted();
            int i4 = onExtraCallback + 39;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted;
            }
            throw null;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onWarmupCompleted() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Function0 function0 = this.onExtraCallbackWithResult;
            if (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) {
                return this.onNavigationEvent.getDefaultViewModelCreationExtras();
            }
            int i4 = onExtraCallback + 55;
            int i5 = i4 % 128;
            IAuthTabCallback = i5;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = i5 + 63;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    public static final /* synthetic */ getCurrentScheduleType IAuthTabCallback(AssetHomeListActivity assetHomeListActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        getCurrentScheduleType getcurrentscheduletypeUpdateVisuals = assetHomeListActivity.updateVisuals();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 1;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return getcurrentscheduletypeUpdateVisuals;
    }

    public static final /* synthetic */ void IAuthTabCallback(AssetHomeListActivity assetHomeListActivity, AssetHomeListViewModel.UpdatedAccount updatedAccount) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        assetHomeListActivity.onNavigationEvent(updatedAccount);
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        int i5 = getInterfaceDescriptor + 37;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, z);
        int i4 = getInterfaceDescriptor + 81;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ boolean IAuthTabCallbackDefault(AssetHomeListActivity assetHomeListActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        boolean z = assetHomeListActivity.asInterface;
        if (i4 != 0) {
            int i5 = 18 / 0;
        }
        int i6 = i3 + 65;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public static final /* synthetic */ int IAuthTabCallbackStub(AssetHomeListActivity assetHomeListActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int smallIconId = assetHomeListActivity.getSmallIconId();
        int i4 = getInterfaceDescriptor + 17;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return smallIconId;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        AssetHomeListActivity assetHomeListActivity = (AssetHomeListActivity) objArr[0];
        AssetTriumphAnimationView assetTriumphAnimationView = (AssetTriumphAnimationView) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 79;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        assetHomeListActivity.IAuthTabCallbackStub = assetTriumphAnimationView;
        int i5 = i2 + 73;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
        return null;
    }

    public static final /* synthetic */ void asBinder(AssetHomeListActivity assetHomeListActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1672988704, new Object[]{assetHomeListActivity}, -1672988691, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        int i4 = getInterfaceDescriptor + 59;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ int asInterface(AssetHomeListActivity assetHomeListActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return assetHomeListActivity.ICustomTabsServiceDefault();
        }
        assetHomeListActivity.ICustomTabsServiceDefault();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(AssetHomeListActivity assetHomeListActivity, boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        assetHomeListActivity.asInterface = z;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        int i4 = IAuthTabCallbackStubProxy + 119;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return zOnExtraCallback;
    }

    public static final /* synthetic */ void onNavigationEvent(AssetHomeListActivity assetHomeListActivity, AssetHomeListViewModel.UpdatedAccount updatedAccount) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = GriverBridgeCallPreInterceptEventPreInterceptBridgeContext.newSessionWithExtras.onExtraCallback();
        onNavigationEvent(GriverBridgeCallPreInterceptEventPreInterceptBridgeContext.newSessionWithExtras.onExtraCallback(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 2061654641, iOnExtraCallback, 898389219, new Object[]{assetHomeListActivity, updatedAccount}, -898389217, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        int i4 = getInterfaceDescriptor + 57;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ AssetTriumphAnimationView onTransact(AssetHomeListActivity assetHomeListActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 109;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        AssetTriumphAnimationView assetTriumphAnimationView = assetHomeListActivity.IAuthTabCallbackStub;
        if (i4 == 0) {
            int i5 = 50 / 0;
        }
        int i6 = i2 + 75;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
        return assetTriumphAnimationView;
    }

    public static final /* synthetic */ boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        int i4 = IAuthTabCallbackStubProxy + 85;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return zOnNavigationEvent;
    }

    public /* synthetic */ NativeActionFilter IPostMessageServiceStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        AssetHomeListViewModel assetHomeListViewModelITrustedWebActivityCallbackStubProxy = ITrustedWebActivityCallbackStubProxy();
        int i4 = IAuthTabCallbackStubProxy + 13;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return assetHomeListViewModelITrustedWebActivityCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: im.toss.features.home.feature.asset_home.activity.AssetHomeListActivity$4, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function1<LayoutInflater, getCurrentScheduleType> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        public static final AnonymousClass4 onWarmupCompleted = new AnonymousClass4();

        static {
            int i = IAuthTabCallback + 47;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        AnonymousClass4() {
            super(1, getCurrentScheduleType.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lim/toss/features/home/feature/asset_home/databinding/HomeV2FeatureAssetHomeActivityAssetHomeListBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getCurrentScheduleType getcurrentscheduletypeOnExtraCallback = onExtraCallback((LayoutInflater) obj);
            int i4 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getcurrentscheduletypeOnExtraCallback;
        }

        public final getCurrentScheduleType onExtraCallback(LayoutInflater layoutInflater) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            getCurrentScheduleType getcurrentscheduletypeIAuthTabCallback = getCurrentScheduleType.IAuthTabCallback(layoutInflater);
            int i4 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getcurrentscheduletypeIAuthTabCallback;
        }
    }

    public AssetHomeListActivity() {
        super(AnonymousClass4.onWarmupCompleted);
        this.asBinder = "account_list";
        this.IAuthTabCallbackDefault = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(AssetHomeListViewModel.class), new extraCallback(this), new access100(this), new readTypedObject(null, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map<String, Object> getScreenParams() throws Throwable {
        String stringExtra;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 1;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        if (intent != null) {
            int i4 = IAuthTabCallbackStubProxy + 101;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            e(new char[]{33828, 53700, 33878, 2658, 54014, 9915, 25886, 46487, 60250, 39801, 17385, 47024}, (ViewConfiguration.getTouchSlop() >> 8) + 1, objArr);
            stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        } else {
            stringExtra = null;
        }
        Object[] objArr2 = new Object[1];
        e(new char[]{33828, 53700, 33878, 2658, 54014, 9915, 25886, 46487, 60250, 39801, 17385, 47024}, Drawable.resolveOpacity(0, 0) + 1, objArr2);
        return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), stringExtra)});
    }

    public String ICustomTabsServiceStub() {
        String str;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 33;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.asBinder;
            int i4 = 8 / 0;
        } else {
            str = this.asBinder;
        }
        int i5 = i2 + 59;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    protected AssetHomeListViewModel ITrustedWebActivityCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 105;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        AssetHomeListViewModel assetHomeListViewModel = (AssetHomeListViewModel) this.IAuthTabCallbackDefault.getValue();
        int i4 = IAuthTabCallbackStubProxy + 75;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return assetHomeListViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String onVerticalScrollEvent() {
        String string;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 107;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            string = getString(R.string.home_v2_feature_asset_home_list_accessibility_screen_name);
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i3 = 60 / 0;
        } else {
            string = getString(R.string.home_v2_feature_asset_home_list_accessibility_screen_name);
            Intrinsics.checkNotNullExpressionValue(string, "");
        }
        int i4 = IAuthTabCallbackStubProxy + 11;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    @Override // im.toss.features.home.feature.asset_home.activity.Hilt_AssetHomeListActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(updateVisuals().onWarmupCompleted());
        updateVisuals().onWarmupCompleted().setBackgroundColor(getSmallIconId());
        updateVisuals().onExtraCallback.onExtraCallback().setBackgroundColor(getSmallIconId());
        updateVisuals().IAuthTabCallback.setBackgroundColor(getSmallIconId());
        updateVisuals().IAuthTabCallbackStubProxy.setBackgroundColor(getSmallIconId());
        updateVisuals().onNavigationEvent.setStatusBarScrimColor(getSmallIconId());
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 462236816, new Object[]{this}, -462236810, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        int i4 = getInterfaceDescriptor + 53;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
    }

    public void ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStubProxy(this, (access13800) null), 3, (Object) null);
        int i2 = getInterfaceDescriptor + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void IAuthTabCallback_Parcel(AssetHomeListActivity assetHomeListActivity) {
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray;
        long j;
        boolean z;
        String str;
        Map map;
        Function1 function1;
        int i;
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 99;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            assetHomeListActivity.updateVisuals().access100.announceForAccessibility(assetHomeListActivity.getString(im.toss.features.home.core.ui.R.string.home_v2_core_ui_refresh_list));
            convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            j = 1010285;
            z = true;
            str = null;
            map = null;
            function1 = null;
            i = 117;
        } else {
            assetHomeListActivity.updateVisuals().access100.announceForAccessibility(assetHomeListActivity.getString(im.toss.features.home.core.ui.R.string.home_v2_core_ui_refresh_list));
            convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            j = 1010285;
            z = false;
            str = null;
            map = null;
            function1 = null;
            i = 30;
        }
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, j, z, str, map, function1, i, (Object) null);
        assetHomeListActivity.ITrustedWebActivityCallbackStubProxy().writeTypedObject();
    }

    private static final Rally onNavigationEvent(Lazy<? extends Rally> lazy) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Rally rally = (Rally) lazy.getValue();
        if (i3 == 0) {
            return rally;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.onWarmupCompleted());
        attachapplovinsdk.IAuthTabCallback(200);
        attachapplovinsdk.onExtraCallback(0);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 85;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 85;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asInterface());
            attachapplovinsdk.IAuthTabCallback(16490);
            i = 2816;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asInterface());
            attachapplovinsdk.IAuthTabCallback(1260);
            i = 180;
        }
        attachapplovinsdk.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 45;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        isMuted.onExtraCallback(appLovinSdkSettings, fValueOf, fValueOf2, new AssetHomeListActivity$.ExternalSyntheticLambda3());
        isMuted.onExtraCallback(appLovinSdkSettings, fValueOf2, fValueOf, new AssetHomeListActivity$.ExternalSyntheticLambda4());
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Rally getInterfaceDescriptor(AssetHomeListActivity assetHomeListActivity) {
        int i = 2 % 2;
        View view = assetHomeListActivity.updateVisuals().onTransact;
        Intrinsics.checkNotNullExpressionValue(view, "");
        Rally rallyOnTransact = Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.asBinder(isMuted.onExtraCallbackWithResult(new AppLovinSdkSettings(), new AssetHomeListActivity$.ExternalSyntheticLambda11()), Float.valueOf(0.5f), Float.valueOf(2.0f), (Function1) null, 4, (Object) null), -1, getExtraParameters.Normal, 400, deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub(), null, null, 0, 0L, false, 1984, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new AssetHomeListActivity$.ExternalSyntheticLambda12(assetHomeListActivity), 1, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 49;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return rallyOnTransact;
    }

    private static final Unit access000(AssetHomeListActivity assetHomeListActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        View view = assetHomeListActivity.updateVisuals().onTransact;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(0);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 101;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        AppBarLayout appBarLayout = (AppBarLayout) objArr[1];
        int i = 2 % 2;
        getcornerradius.onWarmupCompleted(new SystemPropertiesCompat(appBarLayout.getTotalScrollRange(), ((Number) objArr[2]).intValue()));
        int i2 = getInterfaceDescriptor + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    public static final class access000 implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onNavigationEvent;

        public access000(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                    int i3 = IAuthTabCallback + 91;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i5 = onWarmupCompleted + 35;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onNavigationEvent);
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit onTransact(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        getInterfaceDescriptor = i2 % 128;
        onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, i2 % 2 != 0);
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(getCornerRadius getcornerradius, isBackgroundRunning$IAuthTabCallback$onExtraCallback isbackgroundrunning_iauthtabcallback_onextracallback) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(isbackgroundrunning_iauthtabcallback_onextracallback, "");
            getcornerradius.onWarmupCompleted(isbackgroundrunning_iauthtabcallback_onextracallback);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(isbackgroundrunning_iauthtabcallback_onextracallback, "");
        getcornerradius.onWarmupCompleted(isbackgroundrunning_iauthtabcallback_onextracallback);
        Unit unit2 = Unit.INSTANCE;
        int i3 = getInterfaceDescriptor + 91;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onWarmupCompleted(AssetHomeListActivity assetHomeListActivity, fillData filldata) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(filldata, "");
        Object obj = null;
        fillData.getInterfaceDescriptor.onWarmupCompleted(assetHomeListActivity, filldata, new BaseEmbedView.onNavigationEvent(RVManifestWrapper.Companion.onNavigationEvent(""), filldata, (DefaultConstructorMarker) null), (String) null, 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 57;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(AssetHomeListActivity assetHomeListActivity, fillData filldata) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(filldata, "");
        fillData.getInterfaceDescriptor.onWarmupCompleted(assetHomeListActivity, filldata, new BaseEmbedView.onNavigationEvent(RVManifestWrapper.Companion.onNavigationEvent(""), filldata, (DefaultConstructorMarker) null), (String) null, 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 17;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(isBackgroundRunning isbackgroundrunning, AssetHomeListActivity assetHomeListActivity, getCornerRadius getcornerradius, getCornerRadius getcornerradius2, Lazy lazy, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        Object obj;
        boolean zOnNavigationEvent;
        boolean zOnNavigationEvent2;
        boolean zOnExtraCallback;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy;
        int i4 = i3 + 71;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 115;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i8 = getInterfaceDescriptor + 47;
                IAuthTabCallbackStubProxy = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(512610059, i, -1, "im.toss.features.home.feature.asset_home.activity.AssetHomeListActivity.initViews.<anonymous>.<anonymous> (AssetHomeListActivity.kt:217)");
                    int i9 = 41 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(512610059, i, -1, "im.toss.features.home.feature.asset_home.activity.AssetHomeListActivity.initViews.<anonymous>.<anonymous> (AssetHomeListActivity.kt:217)");
                }
            }
            String strOnNavigationEvent = isbackgroundrunning.onNavigationEvent();
            isBackgroundRunning.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = isbackgroundrunning.onExtraCallbackWithResult();
            Object obj2 = null;
            String strOnExtraCallback = iAuthTabCallbackOnExtraCallbackWithResult != null ? iAuthTabCallbackOnExtraCallbackWithResult.onExtraCallback() : null;
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(strOnNavigationEvent);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(strOnExtraCallback);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent3 | zOnNavigationEvent4)) {
                int i10 = IAuthTabCallbackStubProxy + 83;
                getInterfaceDescriptor = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 0 / 0;
                    obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                        obj = getsupportedhighspeedresolutionsforOnWarmupCompleted;
                    }
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) obj;
                    String strOnNavigationEvent2 = isbackgroundrunning.onNavigationEvent();
                    isBackgroundRunning.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult2 = isbackgroundrunning.onExtraCallbackWithResult();
                    String strOnExtraCallback2 = iAuthTabCallbackOnExtraCallbackWithResult2 == null ? iAuthTabCallbackOnExtraCallbackWithResult2.onExtraCallback() : null;
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(strOnNavigationEvent2);
                    zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(strOnExtraCallback2);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent | zOnNavigationEvent2) {
                        Object obj3 = objOnMinimized2;
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted2);
                            obj3 = getsupportedhighspeedresolutionsforOnWarmupCompleted2;
                        }
                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) obj3;
                        Unit unit = Unit.INSTANCE;
                        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetHomeListActivity);
                        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getcornerradius);
                        boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(isbackgroundrunning);
                        boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor2);
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(!(zOnExtraCallback2 | zOnExtraCallback3 | zOnNavigationEvent5 | zOnExtraCallback4 | zOnNavigationEvent6)) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized3 = new IAuthTabCallback(assetHomeListActivity, getcornerradius, getsupportedhighspeedresolutionsfor, isbackgroundrunning, getsupportedhighspeedresolutionsfor2, (access13800) null);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, 6);
                        String strOnNavigationEvent3 = isbackgroundrunning.onNavigationEvent();
                        isBackgroundRunning.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult3 = isbackgroundrunning.onExtraCallbackWithResult();
                        String strOnExtraCallback3 = iAuthTabCallbackOnExtraCallbackWithResult3 != null ? iAuthTabCallbackOnExtraCallbackWithResult3.onExtraCallback() : null;
                        boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor2);
                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!zOnNavigationEvent7) {
                            int i12 = getInterfaceDescriptor + 53;
                            IAuthTabCallbackStubProxy = i12 % 128;
                            if (i12 % 2 != 0) {
                                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                obj2.hashCode();
                                throw null;
                            }
                            if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized4 = new AssetHomeListActivity$.ExternalSyntheticLambda6(getsupportedhighspeedresolutionsfor2);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                            }
                            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda5.onExtraCallbackWithResult(strOnNavigationEvent3, strOnExtraCallback3, (TextFieldScrollKtExternalSyntheticLambda0) null, (Function1) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult, 0, 4);
                            Rally rallyOnNavigationEvent = onNavigationEvent((Lazy<? extends Rally>) lazy);
                            boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!zOnNavigationEvent8) {
                                int i13 = getInterfaceDescriptor + 37;
                                IAuthTabCallbackStubProxy = i13 % 128;
                                if (i13 % 2 != 0) {
                                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                    obj2.hashCode();
                                    throw null;
                                }
                                if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized5 = new AssetHomeListActivity$.ExternalSyntheticLambda7(getsupportedhighspeedresolutionsfor);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                                }
                                Function0 function0 = (Function0) objOnMinimized5;
                                boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetHomeListActivity);
                                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!zOnExtraCallback5) {
                                    int i14 = IAuthTabCallbackStubProxy + 119;
                                    getInterfaceDescriptor = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        int i15 = 17 / 0;
                                        if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            objOnMinimized6 = new AssetHomeListActivity$.ExternalSyntheticLambda8(assetHomeListActivity);
                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
                                        }
                                        Function1 function1 = (Function1) objOnMinimized6;
                                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetHomeListActivity);
                                        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                        if (zOnExtraCallback) {
                                            int i16 = IAuthTabCallbackStubProxy + 97;
                                            getInterfaceDescriptor = i16 % 128;
                                            int i17 = i16 % 2;
                                            if (objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                objOnMinimized7 = new AssetHomeListActivity$.ExternalSyntheticLambda9(assetHomeListActivity);
                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
                                            }
                                            Function1 function12 = (Function1) objOnMinimized7;
                                            boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getcornerradius2);
                                            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                            if (!zOnExtraCallback6) {
                                                int i18 = IAuthTabCallbackStubProxy + 93;
                                                getInterfaceDescriptor = i18 % 128;
                                                if (i18 % 2 == 0) {
                                                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                                    obj2.hashCode();
                                                    throw null;
                                                }
                                                if (objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized8 = new AssetHomeListActivity$.ExternalSyntheticLambda10(getcornerradius2);
                                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized8);
                                                }
                                                decodeLocalIdToPath.onNavigationEvent(isbackgroundrunning, function0, function1, function12, rallyOnNavigationEvent, (Function1) objOnMinimized8, cameraCaptureResultEmptyCameraCaptureResult, 0);
                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                                }
                                            }
                                        }
                                    } else {
                                        if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        }
                                        Function1 function13 = (Function1) objOnMinimized6;
                                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetHomeListActivity);
                                        Object objOnMinimized72 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                        if (zOnExtraCallback) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) obj;
                    String strOnNavigationEvent22 = isbackgroundrunning.onNavigationEvent();
                    isBackgroundRunning.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult22 = isbackgroundrunning.onExtraCallbackWithResult();
                    if (iAuthTabCallbackOnExtraCallbackWithResult22 == null) {
                    }
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(strOnNavigationEvent22);
                    zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(strOnExtraCallback2);
                    Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent | zOnNavigationEvent2) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(AssetHomeListActivity assetHomeListActivity, getCornerRadius getcornerradius, getCornerRadius getcornerradius2, Lazy lazy, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 97;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = IAuthTabCallbackStubProxy + 93;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-116411880, i, -1, "im.toss.features.home.feature.asset_home.activity.AssetHomeListActivity.initViews.<anonymous> (AssetHomeListActivity.kt:212)");
            }
            isBackgroundRunning isbackgroundrunning = (isBackgroundRunning) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(assetHomeListActivity.ITrustedWebActivityCallbackStubProxy().receiveFile(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7).onExtraCallbackWithResult();
            if (isbackgroundrunning != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1987436964);
                y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(512610059, true, new AssetHomeListActivity$.ExternalSyntheticLambda0(isbackgroundrunning, assetHomeListActivity, getcornerradius, getcornerradius2, lazy), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1984040790);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = IAuthTabCallbackStubProxy + 61;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(TaskControllService taskControllService, AssetHomeListActivity assetHomeListActivity, isXiaoPeng isxiaopeng, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 33;
        getInterfaceDescriptor = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 3) != 5, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(167792322, i, -1, "im.toss.features.home.feature.asset_home.activity.AssetHomeListActivity.initViews.<anonymous>.<anonymous> (AssetHomeListActivity.kt:320)");
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(taskControllService);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetHomeListActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnExtraCallback)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AssetHomeListActivity$.ExternalSyntheticLambda5 externalSyntheticLambda5 = new AssetHomeListActivity$.ExternalSyntheticLambda5(taskControllService, assetHomeListActivity);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda5);
                    int i4 = IAuthTabCallbackStubProxy + 49;
                    getInterfaceDescriptor = i4 % 128;
                    int i5 = i4 % 2;
                    obj = externalSyntheticLambda5;
                }
                RVExecutorService.IAuthTabCallback(taskControllService, (Function1) obj, isxiaopeng.onTransact(), isxiaopeng.onWarmupCompleted(), isxiaopeng.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, (setHasWhiteScreen.onExtraCallback << 6) | (getGroupId.onWarmupCompleted << 9) | (getIgnoreErrorResourceHostList.onNavigationEvent << 12));
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = getInterfaceDescriptor + 125;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(AssetHomeListActivity assetHomeListActivity, getCornerRadius getcornerradius, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallbackStubProxy + 101;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = IAuthTabCallbackStubProxy + 1;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1268097679, i, -1, "im.toss.features.home.feature.asset_home.activity.AssetHomeListActivity.initViews.<anonymous> (AssetHomeListActivity.kt:299)");
            }
            isXiaoPeng isxiaopeng = (isXiaoPeng) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(assetHomeListActivity.ITrustedWebActivityCallbackStubProxy().setEngagementSignalsCallback(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7).onExtraCallbackWithResult();
            if (isxiaopeng != null) {
                int i7 = IAuthTabCallbackStubProxy + 41;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-634182621);
                TaskControllService taskControllServiceOnWarmupCompleted = RVExecutorService.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 0);
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(getcornerradius, (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7);
                int iOnNavigationEvent = IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<SystemPropertiesCompat>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback).onNavigationEvent();
                int iAbs = Math.abs(IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<SystemPropertiesCompat>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback).IAuthTabCallback());
                if (IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<SystemPropertiesCompat>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback).onNavigationEvent() == 0 || iOnNavigationEvent - iAbs > 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-633606145);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    taskControllServiceOnWarmupCompleted.IAuthTabCallback();
                    int i9 = IAuthTabCallbackStubProxy + 97;
                    getInterfaceDescriptor = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-633823207);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new AssetHomeListActivity$.ExternalSyntheticLambda13();
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    BaseHomeActivity.onWarmupCompleted(assetHomeListActivity, isxiaopeng, (Function0) objOnMinimized, false, (Map) null, 12, (Object) null);
                    taskControllServiceOnWarmupCompleted.onExtraCallback();
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(167792322, true, new AssetHomeListActivity$.ExternalSyntheticLambda14(taskControllServiceOnWarmupCompleted, assetHomeListActivity, isxiaopeng), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-632752653);
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

    public static final class asBinder implements AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0 {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ onMenuItemClick onExtraCallbackWithResult;

        public void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        public asBinder(onMenuItemClick onmenuitemclick) {
            this.onExtraCallbackWithResult = onmenuitemclick;
        }
    }

    public static final class IAuthTabCallbackStub extends RecyclerView.AdapterDataObserver {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ LinearLayoutManager onNavigationEvent;
        final /* synthetic */ HomeDstRecyclerView onWarmupCompleted;

        IAuthTabCallbackStub(HomeDstRecyclerView homeDstRecyclerView, LinearLayoutManager linearLayoutManager) {
            this.onWarmupCompleted = homeDstRecyclerView;
            this.onNavigationEvent = linearLayoutManager;
        }

        public void onItemRangeInserted(int i, int i2) {
            LinearLayoutManager linearLayoutManager;
            int i3 = 2 % 2;
            int i4 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                super.onItemRangeInserted(i, i2);
                AssetHomeListActivity.this.getView();
                obj.hashCode();
                throw null;
            }
            super.onItemRangeInserted(i, i2);
            if (AssetHomeListActivity.this.getView() == null || i2 == 0) {
                return;
            }
            int i5 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            if (i == 0 && this.onWarmupCompleted.getScrollState() == 0 && (linearLayoutManager = this.onNavigationEvent) != null) {
                int i6 = onExtraCallbackWithResult + 81;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                    obj.hashCode();
                    throw null;
                }
                if (linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0) {
                    this.onNavigationEvent.scrollToPositionWithOffset(0, 0);
                }
            }
        }
    }

    private static final Unit access100(AssetHomeListActivity assetHomeListActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        assetHomeListActivity.asInterface = true;
        assetHomeListActivity.updateVisuals().access100.setEnabled(true);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 5;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String strOnNavigationEvent;
        int i = 0;
        AssetHomeListActivity assetHomeListActivity = (AssetHomeListActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        TabLayout.OnTabSelectedListener onTabSelectedListener = (TabLayout.OnTabSelectedListener) objArr[2];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onTabSelectedListener, "");
        List listOnWarmupCompleted = ((BundleUtils) assetHomeListActivity.ITrustedWebActivityCallbackStubProxy().onActivityResized().IAuthTabCallback()).onWarmupCompleted();
        if (!listOnWarmupCompleted.isEmpty()) {
            Object[] objArr2 = {assetHomeListActivity.ITrustedWebActivityCallbackStubProxy()};
            int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            doInitialize doinitialize = (doInitialize) CollectionsKt.getOrNull((List) ((setRubIn) NativePermissionRequire.onExtraCallbackWithResult(objArr2, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback, -503662168, 503662169)).IAuthTabCallback(), iIntValue);
            if (doinitialize != null) {
                int i3 = IAuthTabCallbackStubProxy + 29;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
                strOnNavigationEvent = doinitialize.onNavigationEvent();
            } else {
                strOnNavigationEvent = null;
            }
            Iterator it = listOnWarmupCompleted.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                int i5 = getInterfaceDescriptor + 17;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                if (!(!Intrinsics.areEqual(((BundleUtils.onNavigationEvent) it.next()).onWarmupCompleted(), strOnNavigationEvent))) {
                    break;
                }
                int i7 = IAuthTabCallbackStubProxy + 97;
                int i8 = i7 % 128;
                getInterfaceDescriptor = i8;
                int i9 = i7 % 2;
                i++;
                int i10 = i8 + 47;
                IAuthTabCallbackStubProxy = i10 % 128;
                int i11 = i10 % 2;
            }
            if (i >= 0) {
                if (((Integer) TdsTabV1View.onNavigationEvent(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1014209357, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{assetHomeListActivity.updateVisuals().onExtraCallbackWithResult}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1014209355)).intValue() != i) {
                    TdsTabV1View.onNavigationEvent(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -968194161, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{assetHomeListActivity.updateVisuals().onExtraCallbackWithResult}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 968194164);
                    assetHomeListActivity.updateVisuals().onExtraCallbackWithResult.onNavigationEvent(i);
                    assetHomeListActivity.updateVisuals().onExtraCallbackWithResult.onNavigationEvent(onTabSelectedListener);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0065, code lost:
    
        if ((r13 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        r13 = 83 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        r10 = new java.lang.Object[]{r1.updateVisuals().onExtraCallbackWithResult};
        im.toss.uikit.widget.tab.TdsTabV1View.onNavigationEvent(im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -968194161, im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), r10, im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 968194164);
        r1.updateVisuals().onExtraCallbackWithResult.onNavigationEvent(0);
        r1.updateVisuals().onExtraCallbackWithResult.onNavigationEvent(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a6, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003e, code lost:
    
        if (((o.BundleUtils) r1.ITrustedWebActivityCallbackStubProxy().onActivityResized().IAuthTabCallback()).onWarmupCompleted().isEmpty() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005a, code lost:
    
        if (((o.BundleUtils) r1.ITrustedWebActivityCallbackStubProxy().onActivityResized().IAuthTabCallback()).onWarmupCompleted().isEmpty() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005c, code lost:
    
        r13 = im.toss.features.home.feature.asset_home.activity.AssetHomeListActivity.getInterfaceDescriptor + 97;
        im.toss.features.home.feature.asset_home.activity.AssetHomeListActivity.IAuthTabCallbackStubProxy = r13 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AssetHomeListActivity assetHomeListActivity = (AssetHomeListActivity) objArr[0];
        ((Number) objArr[1]).intValue();
        TabLayout.OnTabSelectedListener onTabSelectedListener = (TabLayout.OnTabSelectedListener) objArr[2];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onTabSelectedListener, "");
            int i3 = 75 / 0;
        } else {
            Intrinsics.checkNotNullParameter(onTabSelectedListener, "");
        }
    }

    private static final void asInterface(AssetHomeListActivity assetHomeListActivity, int i, TabLayout.OnTabSelectedListener onTabSelectedListener) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 43;
        getInterfaceDescriptor = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onTabSelectedListener, "");
            ((BundleUtils) assetHomeListActivity.ITrustedWebActivityCallbackStubProxy().onActivityResized().IAuthTabCallback()).onWarmupCompleted().isEmpty();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onTabSelectedListener, "");
        List listOnWarmupCompleted = ((BundleUtils) assetHomeListActivity.ITrustedWebActivityCallbackStubProxy().onActivityResized().IAuthTabCallback()).onWarmupCompleted();
        if (listOnWarmupCompleted.isEmpty()) {
            return;
        }
        Object[] objArr = {assetHomeListActivity.updateVisuals().onExtraCallbackWithResult};
        if (((Integer) TdsTabV1View.onNavigationEvent(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1014209357, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1014209355)).intValue() != CollectionsKt.getLastIndex(listOnWarmupCompleted)) {
            int i4 = getInterfaceDescriptor + 15;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr2 = {assetHomeListActivity.updateVisuals().onExtraCallbackWithResult};
                TdsTabV1View.onNavigationEvent(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -968194161, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), objArr2, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 968194164);
                assetHomeListActivity.updateVisuals().onExtraCallbackWithResult.onNavigationEvent(CollectionsKt.getLastIndex(listOnWarmupCompleted));
                assetHomeListActivity.updateVisuals().onExtraCallbackWithResult.onNavigationEvent(onTabSelectedListener);
                return;
            }
            Object[] objArr3 = {assetHomeListActivity.updateVisuals().onExtraCallbackWithResult};
            TdsTabV1View.onNavigationEvent(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -968194161, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), objArr3, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 968194164);
            assetHomeListActivity.updateVisuals().onExtraCallbackWithResult.onNavigationEvent(CollectionsKt.getLastIndex(listOnWarmupCompleted));
            assetHomeListActivity.updateVisuals().onExtraCallbackWithResult.onNavigationEvent(onTabSelectedListener);
            throw null;
        }
    }

    private static final void IAuthTabCallback(AssetHomeListActivity assetHomeListActivity, Ref.ObjectRef objectRef, int i, RecyclerView.OnScrollListener onScrollListener) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onScrollListener, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(assetHomeListActivity), (CoroutineContext) null, (setRandomHost) null, new asInterface(assetHomeListActivity, i, objectRef, onScrollListener, (access13800) null), 3, (Object) null);
        int i3 = IAuthTabCallbackStubProxy + 37;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
    }

    public void cancelNotification() {
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new getInterfaceDescriptor(this, (access13800) null), 3, (Object) null);
        int i2 = getInterfaceDescriptor + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ AssetHomeListViewModel.UpdatedAccount $updatedAccount;
        int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(AssetHomeListViewModel.UpdatedAccount updatedAccount, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$updatedAccount = updatedAccount;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = AssetHomeListActivity.this.new onNavigationEvent(this.$updatedAccount, access13800Var);
            int i2 = onExtraCallback + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 4 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 16 / 0;
            return onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(100, r20) == r2) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0100, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(500, r20) == r2) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0062 -> B:23:0x0064). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            int i2 = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                i = 0;
                if (!(!AssetHomeListActivity.IAuthTabCallbackDefault(AssetHomeListActivity.this))) {
                    int i4 = onExtraCallback + 15;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    this.I$0 = i;
                    this.label = 1;
                }
                return Unit.INSTANCE;
            }
            if (i3 != 1) {
                int i6 = onWarmupCompleted + 117;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0 ? i3 != 2 : i3 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                AssetHomeListActivity.IAuthTabCallback(AssetHomeListActivity.this, this.$updatedAccount);
                int i7 = onWarmupCompleted + 115;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return Unit.INSTANCE;
            }
            i = this.I$0;
            ResultKt.onNavigationEvent(obj);
            int i9 = onWarmupCompleted + 63;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            i++;
            if (!(!AssetHomeListActivity.IAuthTabCallbackDefault(AssetHomeListActivity.this)) || i >= 10) {
                if (AssetHomeListActivity.IAuthTabCallbackDefault(AssetHomeListActivity.this)) {
                    int i11 = onWarmupCompleted + 43;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    if (AssetHomeListActivity.onTransact(AssetHomeListActivity.this) == null) {
                        AssetHomeListActivity assetHomeListActivity = AssetHomeListActivity.this;
                        AssetTriumphAnimationView assetTriumphAnimationView = new AssetTriumphAnimationView(AssetHomeListActivity.this, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                        assetTriumphAnimationView.setFocusable(true);
                        assetTriumphAnimationView.setClickable(true);
                        assetTriumphAnimationView.setVisibility(8);
                        AssetHomeListActivity.onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1042995717, new Object[]{assetHomeListActivity, assetTriumphAnimationView}, 1042995728, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
                    }
                    AssetTriumphAnimationView assetTriumphAnimationViewOnTransact = AssetHomeListActivity.onTransact(AssetHomeListActivity.this);
                    if ((assetTriumphAnimationViewOnTransact != null ? assetTriumphAnimationViewOnTransact.getParent() : null) == null) {
                        int i13 = onExtraCallback + 105;
                        onWarmupCompleted = i13 % 128;
                        if (i13 % 2 == 0) {
                            boolean z = AssetHomeListActivity.this.findViewById(android.R.id.content) instanceof ViewGroup;
                            throw null;
                        }
                        View viewFindViewById = AssetHomeListActivity.this.findViewById(android.R.id.content);
                        ViewGroup viewGroup = viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null;
                        if (viewGroup != null) {
                            viewGroup.addView(AssetHomeListActivity.onTransact(AssetHomeListActivity.this));
                        }
                    }
                    this.I$0 = i;
                    this.label = 2;
                }
                return Unit.INSTANCE;
            }
            int i42 = onExtraCallback + 15;
            onWarmupCompleted = i42 % 128;
            int i52 = i42 % 2;
            this.I$0 = i;
            this.label = 1;
            return objOnWarmupCompleted;
        }
    }

    private static final Unit onExtraCallback(AssetHomeListActivity assetHomeListActivity, AssetHomeListViewModel.UpdatedAccount updatedAccount) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            assetHomeListActivity.updateVisuals().onExtraCallback.onExtraCallbackWithResult().onWarmupCompleted(CollectionsKt.listOf(updatedAccount.IAuthTabCallback()), updatedAccount.onWarmupCompleted(), updatedAccount.onExtraCallback());
            return Unit.INSTANCE;
        }
        assetHomeListActivity.updateVisuals().onExtraCallback.onExtraCallbackWithResult().onWarmupCompleted(CollectionsKt.listOf(updatedAccount.IAuthTabCallback()), updatedAccount.onWarmupCompleted(), updatedAccount.onExtraCallback());
        int i3 = 35 / 0;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
      0x0020: PHI (r1v5 im.toss.features.home.feature.asset_home.viewmodel.AssetHomeListViewModel$TriumphAnimation) = 
      (r1v4 im.toss.features.home.feature.asset_home.viewmodel.AssetHomeListViewModel$TriumphAnimation)
      (r1v8 im.toss.features.home.feature.asset_home.viewmodel.AssetHomeListViewModel$TriumphAnimation)
     binds: [B:8:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(AssetHomeListViewModel.UpdatedAccount updatedAccount) {
        AssetHomeListViewModel.TriumphAnimation triumphAnimationOnNavigationEvent;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            triumphAnimationOnNavigationEvent = updatedAccount.onNavigationEvent();
            int i3 = 62 / 0;
            if (triumphAnimationOnNavigationEvent != null) {
                int i4 = IAuthTabCallbackStubProxy + 25;
                getInterfaceDescriptor = i4 % 128;
                if (i4 % 2 == 0) {
                    triumphAnimationOnNavigationEvent.onNavigationEvent();
                    obj.hashCode();
                    throw null;
                }
                Boolean boolOnNavigationEvent = triumphAnimationOnNavigationEvent.onNavigationEvent();
                if (boolOnNavigationEvent != null) {
                    if (boolOnNavigationEvent.booleanValue()) {
                        int i5 = IAuthTabCallbackStubProxy + 85;
                        getInterfaceDescriptor = i5 % 128;
                        int i6 = i5 % 2;
                        AssetTriumphAnimationView assetTriumphAnimationView = this.IAuthTabCallbackStub;
                        if (assetTriumphAnimationView != null) {
                            AssetTriumphAnimationView.IAuthTabCallback(assetTriumphAnimationView, triumphAnimationOnNavigationEvent.IAuthTabCallback(), triumphAnimationOnNavigationEvent.onExtraCallback(), 0, new AssetHomeListActivity$.ExternalSyntheticLambda1(this, updatedAccount), 4, (Object) null);
                            int i7 = getInterfaceDescriptor + 23;
                            IAuthTabCallbackStubProxy = i7 % 128;
                            int i8 = i7 % 2;
                            return;
                        }
                    } else {
                        AssetTriumphAnimationView assetTriumphAnimationView2 = this.IAuthTabCallbackStub;
                        if (assetTriumphAnimationView2 != null) {
                            AssetTriumphAnimationView.onNavigationEvent(assetTriumphAnimationView2, triumphAnimationOnNavigationEvent.IAuthTabCallback(), triumphAnimationOnNavigationEvent.onExtraCallback(), 0, new AssetHomeListActivity$.ExternalSyntheticLambda2(this, updatedAccount), 4, (Object) null);
                        }
                    }
                }
            }
        } else {
            triumphAnimationOnNavigationEvent = updatedAccount.onNavigationEvent();
            if (triumphAnimationOnNavigationEvent != null) {
            }
        }
        int i9 = IAuthTabCallbackStubProxy + 101;
        getInterfaceDescriptor = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        AssetHomeListActivity assetHomeListActivity = (AssetHomeListActivity) objArr[0];
        AssetHomeListViewModel.UpdatedAccount updatedAccount = (AssetHomeListViewModel.UpdatedAccount) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            assetHomeListActivity.updateVisuals().onExtraCallback.onExtraCallbackWithResult().onWarmupCompleted(CollectionsKt.listOf(updatedAccount.IAuthTabCallback()), updatedAccount.onWarmupCompleted(), updatedAccount.onExtraCallback());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        assetHomeListActivity.updateVisuals().onExtraCallback.onExtraCallbackWithResult().onWarmupCompleted(CollectionsKt.listOf(updatedAccount.IAuthTabCallback()), updatedAccount.onWarmupCompleted(), updatedAccount.onExtraCallback());
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 59;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        AssetHomeListActivity assetHomeListActivity = (AssetHomeListActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr2 = {assetHomeListActivity.updateVisuals().onExtraCallback.onExtraCallbackWithResult()};
            ((Boolean) HomeRecyclerView.IAuthTabCallback(getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 1395069564, objArr2, -1395069560, getKekid.onExtraCallback())).booleanValue();
            throw null;
        }
        Object[] objArr3 = {assetHomeListActivity.updateVisuals().onExtraCallback.onExtraCallbackWithResult()};
        if (!((Boolean) HomeRecyclerView.IAuthTabCallback(getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 1395069564, objArr3, -1395069560, getKekid.onExtraCallback())).booleanValue()) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(assetHomeListActivity), (CoroutineContext) null, (setRandomHost) null, assetHomeListActivity.new IAuthTabCallback_Parcel(null), 3, (Object) null);
            int i3 = IAuthTabCallbackStubProxy + 85;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 3;
            }
        }
        return null;
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int label;

        IAuthTabCallback_Parcel(access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = AssetHomeListActivity.this.new IAuthTabCallback_Parcel(access13800Var);
            int i2 = onExtraCallback + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback_Parcel;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 121;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 20 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_ParcelCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                iAuthTabCallback_ParcelCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallback_ParcelCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 109;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onExtraCallback;
                int i6 = i5 + 119;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i5 + 43;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.onNavigationEvent(obj);
                int i10 = onNavigationEvent + 77;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(800L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            AssetHomeListActivity.onExtraCallback(AssetHomeListActivity.this, true);
            AssetHomeListActivity.IAuthTabCallback(AssetHomeListActivity.this).access100.setEnabled(true);
            return Unit.INSTANCE;
        }
    }

    public boolean bg_() {
        int i = 2 % 2;
        AssetTriumphAnimationView assetTriumphAnimationView = this.IAuthTabCallbackStub;
        if (assetTriumphAnimationView != null) {
            int i2 = getInterfaceDescriptor + 33;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            if (assetTriumphAnimationView.getVisibility() == 0) {
                return true;
            }
        }
        boolean zBg_ = super/*im.toss.base.BaseActivity*/.bg_();
        int i4 = getInterfaceDescriptor + 73;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return zBg_;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int getSmallIconId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (!readIntokhttp.onExtraCallback(configuration)) {
            return Color.parseColor("#EAECEF");
        }
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        Configuration configuration2 = resources2.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        int iOnWarmupCompleted = new getDEFAULT_CONNECTION_SPECSokhttp(new access000(configuration2)).onWarmupCompleted();
        int i4 = IAuthTabCallbackStubProxy + 99;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return iOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0 onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, onMenuItemClick onmenuitemclick) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 115;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onmenuitemclick, "");
            onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onmenuitemclick, "");
        if (onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
            onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, false);
        }
        asBinder asbinder = new asBinder(onmenuitemclick);
        int i3 = IAuthTabCallbackStubProxy + 71;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 26 / 0;
        }
        return asbinder;
    }

    private static final boolean onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            return bool.booleanValue();
        }
        int i4 = 72 / 0;
        return bool.booleanValue();
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = getInterfaceDescriptor + 1;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final boolean onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        throw null;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = IAuthTabCallbackStubProxy + 97;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final SystemPropertiesCompat IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<SystemPropertiesCompat> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        SystemPropertiesCompat systemPropertiesCompat = (SystemPropertiesCompat) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStubProxy + 3;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return systemPropertiesCompat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(AssetHomeListActivity assetHomeListActivity, int i, TabLayout.OnTabSelectedListener onTabSelectedListener) {
        Object[] objArr = {assetHomeListActivity, Integer.valueOf(i), onTabSelectedListener};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 381724946, objArr, -381724936, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -82272271, new Object[]{attachapplovinsdk}, 82272279, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    public static /* synthetic */ void IAuthTabCallback(getCornerRadius getcornerradius, AppBarLayout appBarLayout, int i) {
        Object[] objArr = {getcornerradius, appBarLayout, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1106236128, objArr, -1106236128, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onWarmupCompleted(TaskControllService taskControllService, AssetHomeListActivity assetHomeListActivity, isXiaoPeng isxiaopeng, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {taskControllService, assetHomeListActivity, isxiaopeng, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1273730028, objArr, 1273730037, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit IAuthTabCallback(AssetHomeListActivity assetHomeListActivity, fillData filldata) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1080626144, new Object[]{assetHomeListActivity, filldata}, -1080626137, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(AssetHomeListActivity assetHomeListActivity, AssetTriumphAnimationView assetTriumphAnimationView) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -1042995717, new Object[]{assetHomeListActivity, assetTriumphAnimationView}, 1042995728, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    private final void onWarmupCompleted(AssetHomeListViewModel.UpdatedAccount updatedAccount) {
        int iOnExtraCallback = GriverBridgeCallPreInterceptEventPreInterceptBridgeContext.newSessionWithExtras.onExtraCallback();
        onNavigationEvent(GriverBridgeCallPreInterceptEventPreInterceptBridgeContext.newSessionWithExtras.onExtraCallback(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 2061654641, iOnExtraCallback, 898389219, new Object[]{this, updatedAccount}, -898389217, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    private final void ITrustedWebActivityServiceDefault() {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 462236816, new Object[]{this}, -462236810, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    private static final void onExtraCallbackWithResult(getCornerRadius getcornerradius, AppBarLayout appBarLayout, int i) {
        Object[] objArr = {getcornerradius, appBarLayout, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -544378933, objArr, 544378934, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallback(TaskControllService taskControllService, AssetHomeListActivity assetHomeListActivity, fillData filldata) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1562279191, new Object[]{taskControllService, assetHomeListActivity, filldata}, -1562279187, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    private static final void onWarmupCompleted(AssetHomeListActivity assetHomeListActivity, int i, TabLayout.OnTabSelectedListener onTabSelectedListener) {
        Object[] objArr = {assetHomeListActivity, Integer.valueOf(i), onTabSelectedListener};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 19467005, objArr, -19467002, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    private static final void onExtraCallbackWithResult(AssetHomeListActivity assetHomeListActivity, int i, TabLayout.OnTabSelectedListener onTabSelectedListener) {
        Object[] objArr = {assetHomeListActivity, Integer.valueOf(i), onTabSelectedListener};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 365254090, objArr, -365254085, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    private final void getSmallIconBitmap() {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1672988704, new Object[]{this}, -1672988691, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    private static final Unit IAuthTabCallbackStub(AssetHomeListActivity assetHomeListActivity, AssetHomeListViewModel.UpdatedAccount updatedAccount) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 311918955, new Object[]{assetHomeListActivity, updatedAccount}, -311918943, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    @Override // im.toss.features.home.feature.asset_home.activity.Hilt_AssetHomeListActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.features.home.feature.asset_home.activity.Hilt_AssetHomeListActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = IAuthTabCallbackStubProxy + 119;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.features.home.feature.asset_home.activity.Hilt_AssetHomeListActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
    }

    @Override // im.toss.features.home.feature.asset_home.activity.Hilt_AssetHomeListActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            throw null;
        }
    }

    static void getActiveNotifications() {
        IAuthTabCallback_Parcel = 9021149773930471631L;
    }
}
