package im.toss.appsintoss.iap;

import androidx.lifecycle.ViewModel;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import com.tmoney.LiveCheckConstants;
import im.toss.appsintoss.R;
import im.toss.appsintoss.iap.model.InAppPurchaseProductAuthorizer;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CloseableUtils;
import o.IAnimation;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.QueryProductDetailsParams;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda25;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda31;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda4;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda61;
import o.SafeWindowLayoutComponentProviderExternalSyntheticLambda4;
import o.SplitControllersplitInfoList1ExternalSyntheticLambda1;
import o.TextLinkScopeExternalSyntheticLambda7;
import o.WebResourceResponseModel;
import o.WindowInfoTrackerCompanionExternalSyntheticLambda0;
import o.WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0;
import o.WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.findResAndMsg;
import o.getBorderRadius;
import o.getCornerRadius;
import o.getShine;
import o.getTileModeX;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import o.setRubIn;
import o.setShine;
import o.ycxycx;
import o.zzbi;
import o.zzcy;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class InAppPurchasePreparationViewModel extends ViewModel {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int IAuthTabCallback = 8;
    private static int ICustomTabsCallback_Parcel = 1;
    private static int ICustomTabsService = 0;
    private static int extraCommand = 1;
    private static int isEngagementSignalsApiAvailable;
    private InAppPurchaseProductAuthorizer IAuthTabCallbackDefault;
    private String IAuthTabCallbackStub;
    private final getBorderRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40> IAuthTabCallbackStubProxy;
    private final getBorderRadius<Unit> IAuthTabCallback_Parcel;
    private final getCornerRadius<Boolean> ICustomTabsCallback;
    private final IAnimation<String> ICustomTabsCallbackDefault;
    private final SplitControllersplitInfoList1ExternalSyntheticLambda1 ICustomTabsCallbackStub;
    private final TextLinkScopeExternalSyntheticLambda7 ICustomTabsCallbackStubProxy;
    private final getBorderRadius<String> access000;
    private String access100;
    private final getCornerRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41> asBinder;
    private String asInterface;
    private final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda61 extraCallback;
    private final getTileModeX<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27> extraCallbackWithResult;
    private final getCornerRadius<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0> getInterfaceDescriptor;
    private final setRubIn<Boolean> mayLaunchUrl;
    private final setRubIn<Boolean> onActivityLayout;
    private final SafeWindowLayoutComponentProviderExternalSyntheticLambda4 onActivityResized;
    private String onExtraCallback;
    private WindowInfoTrackerCompanionExternalSyntheticLambda0 onExtraCallbackWithResult;
    private boolean onMessageChannelReady;
    private final setRubIn<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41> onMinimized;
    private final getBorderRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27> onNavigationEvent;
    private final setRubIn<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0> onPostMessage;
    private final getTileModeX<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40> onRelationshipValidationResult;
    private String onTransact;
    private final getTileModeX<Unit> onUnminimized;
    private final getCornerRadius<Boolean> onWarmupCompleted;
    private boolean readTypedObject;
    private final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 writeTypedObject;

    static final class asBinder extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = InAppPurchasePreparationViewModel.IAuthTabCallback(InAppPurchasePreparationViewModel.this, null, this);
            int i4 = onExtraCallback + 117;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 26 / 0;
            }
            return objIAuthTabCallback;
        }
    }

    static {
        int i = ICustomTabsService + 49;
        extraCommand = i % 128;
        if (i % 2 == 0) {
            int i2 = 35 / 0;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i)) | i9 | (~(i8 | i));
        int i11 = ~i;
        int i12 = (~(i8 | i11)) | i9;
        int i13 = (~(i11 | i7)) | i6;
        int i14 = i5 + i6 + i4 + ((-700610695) * i2) + ((-1151578525) * i3);
        int i15 = i14 * i14;
        int i16 = (1165304685 * i5) + 1030029312 + ((-1366800679) * i6) + (i10 * (-1762861932)) + (i12 * (-1762861932)) + ((-1762861932) * i13) + ((-597557248) * i4) + ((-665714688) * i2) + (367394816 * i3) + (374145024 * i15);
        int i17 = ((i5 * 323709325) - 650539883) + (i6 * 323709049) + (i10 * 276) + (i12 * 276) + (i13 * 276) + (i4 * 323709601) + (i2 * (-499299047)) + (i3 * 1568885315) + (i15 * (-395509760));
        switch (i16 + (i17 * i17 * (-772603904))) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel = (InAppPurchasePreparationViewModel) objArr[0];
                int i18 = 2 % 2;
                int i19 = ICustomTabsCallback_Parcel + 9;
                int i20 = i19 % 128;
                isEngagementSignalsApiAvailable = i20;
                int i21 = i19 % 2;
                getTileModeX<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27> gettilemodex = inAppPurchasePreparationViewModel.extraCallbackWithResult;
                int i22 = i20 + 31;
                ICustomTabsCallback_Parcel = i22 % 128;
                int i23 = i22 % 2;
                return gettilemodex;
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return asBinder(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return onTransact(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    @Inject
    public InAppPurchasePreparationViewModel(@NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7, @NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda61 safeActivityEmbeddingComponentProviderExternalSyntheticLambda61, @NotNull SplitControllersplitInfoList1ExternalSyntheticLambda1 splitControllersplitInfoList1ExternalSyntheticLambda1, @NotNull SafeWindowLayoutComponentProviderExternalSyntheticLambda4 safeWindowLayoutComponentProviderExternalSyntheticLambda4, @NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 safeActivityEmbeddingComponentProviderExternalSyntheticLambda20) {
        Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda61, "");
        Intrinsics.checkNotNullParameter(splitControllersplitInfoList1ExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(safeWindowLayoutComponentProviderExternalSyntheticLambda4, "");
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda20, "");
        this.ICustomTabsCallbackStubProxy = textLinkScopeExternalSyntheticLambda7;
        this.extraCallback = safeActivityEmbeddingComponentProviderExternalSyntheticLambda61;
        this.ICustomTabsCallbackStub = splitControllersplitInfoList1ExternalSyntheticLambda1;
        this.onActivityResized = safeWindowLayoutComponentProviderExternalSyntheticLambda4;
        this.writeTypedObject = safeActivityEmbeddingComponentProviderExternalSyntheticLambda20;
        Object obj = null;
        getCornerRadius<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent((Object) null);
        this.getInterfaceDescriptor = getcornerradiusOnNavigationEvent;
        this.onPostMessage = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent);
        getBorderRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.IAuthTabCallbackStubProxy = getborderradiusOnWarmupCompleted;
        this.onRelationshipValidationResult = ycxycx.onExtraCallbackWithResult(getborderradiusOnWarmupCompleted);
        getBorderRadius<String> getborderradiusOnWarmupCompleted2 = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.access000 = getborderradiusOnWarmupCompleted2;
        this.ICustomTabsCallbackDefault = zzbi.IAuthTabCallback(ycxycx.onExtraCallbackWithResult(getborderradiusOnWarmupCompleted2), 500L);
        getBorderRadius<Unit> getborderradiusOnWarmupCompleted3 = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.IAuthTabCallback_Parcel = getborderradiusOnWarmupCompleted3;
        this.onUnminimized = ycxycx.onExtraCallbackWithResult(getborderradiusOnWarmupCompleted3);
        getBorderRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27> getborderradiusOnWarmupCompleted4 = getShine.onWarmupCompleted(1, 0, (CloseableUtils) null, 6, (Object) null);
        this.onNavigationEvent = getborderradiusOnWarmupCompleted4;
        this.extraCallbackWithResult = ycxycx.onExtraCallbackWithResult(getborderradiusOnWarmupCompleted4);
        getCornerRadius<Boolean> getcornerradiusOnNavigationEvent2 = setShine.onNavigationEvent(Boolean.FALSE);
        this.onWarmupCompleted = getcornerradiusOnNavigationEvent2;
        this.onActivityLayout = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent2);
        getCornerRadius<Boolean> getcornerradiusOnNavigationEvent3 = setShine.onNavigationEvent((Object) null);
        this.ICustomTabsCallback = getcornerradiusOnNavigationEvent3;
        this.mayLaunchUrl = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent3);
        this.onExtraCallback = "KR";
        String str = "ONE_TIME_PURCHASE";
        this.IAuthTabCallbackStub = "ONE_TIME_PURCHASE";
        getCornerRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41> getcornerradiusOnNavigationEvent4 = setShine.onNavigationEvent((Object) null);
        this.asBinder = getcornerradiusOnNavigationEvent4;
        this.onMinimized = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent4);
        WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0 = (WindowInfoTrackerCompanionExternalSyntheticLambda0) textLinkScopeExternalSyntheticLambda7.onExtraCallback("mini_app_info");
        String str2 = (String) textLinkScopeExternalSyntheticLambda7.onExtraCallback("product_id");
        InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizerOnExtraCallbackWithResult = (InAppPurchaseProductAuthorizer) textLinkScopeExternalSyntheticLambda7.onExtraCallback("product_authorizer");
        if (inAppPurchaseProductAuthorizerOnExtraCallbackWithResult == null) {
            inAppPurchaseProductAuthorizerOnExtraCallbackWithResult = InAppPurchaseProductAuthorizer.Companion.onExtraCallbackWithResult();
            int i = 2 % 2;
        }
        String str3 = (String) textLinkScopeExternalSyntheticLambda7.onExtraCallback("order_type");
        if (str3 != null) {
            int i2 = ICustomTabsCallback_Parcel + 117;
            isEngagementSignalsApiAvailable = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            str = str3;
        }
        String str4 = (String) textLinkScopeExternalSyntheticLambda7.onExtraCallback("offer_id");
        if (windowInfoTrackerCompanionExternalSyntheticLambda0 == null || str2 == null) {
            getborderradiusOnWarmupCompleted4.onNavigationEvent(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackStub.onWarmupCompleted);
            int i3 = ICustomTabsCallback_Parcel + 63;
            isEngagementSignalsApiAvailable = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallback_Parcel + 53;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        this.access100 = str2;
        this.onExtraCallbackWithResult = windowInfoTrackerCompanionExternalSyntheticLambda0;
        this.IAuthTabCallbackDefault = inAppPurchaseProductAuthorizerOnExtraCallbackWithResult;
        this.IAuthTabCallbackStub = str;
        this.onTransact = str4;
    }

    public static final /* synthetic */ Object IAuthTabCallback(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 41;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = inAppPurchasePreparationViewModel.onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, (access13800<? super Unit>) access13800Var);
        int i4 = ICustomTabsCallback_Parcel + 1;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda61 IAuthTabCallback(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 63;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda61 safeActivityEmbeddingComponentProviderExternalSyntheticLambda61 = inAppPurchasePreparationViewModel.extraCallback;
        if (i3 == 0) {
            return safeActivityEmbeddingComponentProviderExternalSyntheticLambda61;
        }
        throw null;
    }

    public static final /* synthetic */ String IAuthTabCallbackStub(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 27;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        String str = inAppPurchasePreparationViewModel.onTransact;
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        return str;
    }

    public static final /* synthetic */ getBorderRadius IAuthTabCallbackStubProxy(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 85;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        getBorderRadius<Unit> getborderradius = inAppPurchasePreparationViewModel.IAuthTabCallback_Parcel;
        int i5 = i3 + 95;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return getborderradius;
    }

    public static final /* synthetic */ getBorderRadius IAuthTabCallback_Parcel(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 63;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        getBorderRadius<String> getborderradius = inAppPurchasePreparationViewModel.access000;
        int i5 = i2 + 39;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return getborderradius;
    }

    public static final /* synthetic */ getCornerRadius access100(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 19;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        getCornerRadius<Boolean> getcornerradius = inAppPurchasePreparationViewModel.ICustomTabsCallback;
        if (i3 != 0) {
            return getcornerradius;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getCornerRadius asBinder(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 39;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<Boolean> getcornerradius = inAppPurchasePreparationViewModel.onWarmupCompleted;
        int i5 = i2 + 55;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return getcornerradius;
        }
        throw null;
    }

    public static final /* synthetic */ getBorderRadius asInterface(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 119;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        getBorderRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27> getborderradius = inAppPurchasePreparationViewModel.onNavigationEvent;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 27;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return getborderradius;
    }

    public static final /* synthetic */ getCornerRadius getInterfaceDescriptor(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 53;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0> getcornerradius = inAppPurchasePreparationViewModel.getInterfaceDescriptor;
        int i5 = i2 + 59;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return getcornerradius;
    }

    public static final /* synthetic */ SafeWindowLayoutComponentProviderExternalSyntheticLambda4 onExtraCallback(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 35;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        SafeWindowLayoutComponentProviderExternalSyntheticLambda4 safeWindowLayoutComponentProviderExternalSyntheticLambda4 = inAppPurchasePreparationViewModel.onActivityResized;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 87;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return safeWindowLayoutComponentProviderExternalSyntheticLambda4;
    }

    public static final /* synthetic */ void onExtraCallback(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, String str) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 87;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        inAppPurchasePreparationViewModel.asInterface = str;
        int i5 = i3 + 37;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel = (InAppPurchasePreparationViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 35;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        getBorderRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40> getborderradius = inAppPurchasePreparationViewModel.IAuthTabCallbackStubProxy;
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        return getborderradius;
    }

    public static final /* synthetic */ TextLinkScopeExternalSyntheticLambda7 onExtraCallbackWithResult(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 119;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        Object obj = null;
        TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7 = inAppPurchasePreparationViewModel.ICustomTabsCallbackStubProxy;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 25;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return textLinkScopeExternalSyntheticLambda7;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onNavigationEvent(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, Throwable th, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 97;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        Object objOnWarmupCompleted = onWarmupCompleted(iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, new Object[]{inAppPurchasePreparationViewModel, th, access13800Var}, -890919182, 890919185);
        int i4 = ICustomTabsCallback_Parcel + 103;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ SplitControllersplitInfoList1ExternalSyntheticLambda1 onNavigationEvent(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 105;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        SplitControllersplitInfoList1ExternalSyntheticLambda1 splitControllersplitInfoList1ExternalSyntheticLambda1 = inAppPurchasePreparationViewModel.ICustomTabsCallbackStub;
        int i5 = i2 + 87;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return splitControllersplitInfoList1ExternalSyntheticLambda1;
    }

    public static final /* synthetic */ getCornerRadius onTransact(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 97;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        getCornerRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41> getcornerradius = inAppPurchasePreparationViewModel.asBinder;
        int i5 = i3 + 125;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return getcornerradius;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel = (InAppPurchasePreparationViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 11;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0 = inAppPurchasePreparationViewModel.onExtraCallbackWithResult;
        if (i3 == 0) {
            return windowInfoTrackerCompanionExternalSyntheticLambda0;
        }
        throw null;
    }

    public static final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 onWarmupCompleted(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 97;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 safeActivityEmbeddingComponentProviderExternalSyntheticLambda20 = inAppPurchasePreparationViewModel.writeTypedObject;
        int i5 = i3 + 29;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda20;
    }

    public static final /* synthetic */ void onWarmupCompleted(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, String str) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 49;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        inAppPurchasePreparationViewModel.onTransact = str;
        int i5 = i2 + 105;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel = (InAppPurchasePreparationViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 109;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0> setrubin = inAppPurchasePreparationViewModel.onPostMessage;
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return setrubin;
    }

    public final getTileModeX<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40> extraCallback() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 81;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onRelationshipValidationResult;
        }
        throw null;
    }

    public final IAnimation<String> ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 103;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ICustomTabsCallbackDefault;
        }
        throw null;
    }

    public final getTileModeX<Unit> extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 33;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        getTileModeX<Unit> gettilemodex = this.onUnminimized;
        int i5 = i3 + 79;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return gettilemodex;
        }
        throw null;
    }

    public final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 asBinder() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 3;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27) CollectionsKt.firstOrNull(this.onNavigationEvent.onExtraCallback());
        int i4 = ICustomTabsCallback_Parcel + 49;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda27;
    }

    public final setRubIn<Boolean> asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 111;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        setRubIn<Boolean> setrubin = this.onActivityLayout;
        int i5 = i2 + 93;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return setrubin;
    }

    public final setRubIn<Boolean> writeTypedObject() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 75;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<Boolean> setrubin = this.mayLaunchUrl;
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        return setrubin;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 35;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.asInterface;
        int i4 = i2 + 53;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        String str = this.access100;
        if (str != null) {
            return str;
        }
        int i2 = ICustomTabsCallback_Parcel + 105;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = isEngagementSignalsApiAvailable + 115;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final String readTypedObject() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 107;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.ICustomTabsCallbackStubProxy.onExtraCallback("purchase_sku");
        if (str != null) {
            return str;
        }
        int i4 = isEngagementSignalsApiAvailable + 97;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return getInterfaceDescriptor();
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 95;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallback;
        int i5 = i2 + 99;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final WindowInfoTrackerCompanionExternalSyntheticLambda0 IAuthTabCallbackStub() {
        int i = 2 % 2;
        WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0 = this.onExtraCallbackWithResult;
        if (windowInfoTrackerCompanionExternalSyntheticLambda0 == null) {
            int i2 = isEngagementSignalsApiAvailable + 83;
            ICustomTabsCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
            windowInfoTrackerCompanionExternalSyntheticLambda0 = null;
        }
        int i4 = ICustomTabsCallback_Parcel + 105;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return windowInfoTrackerCompanionExternalSyntheticLambda0;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel = (InAppPurchasePreparationViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 3;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer = null;
        InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer2 = inAppPurchasePreparationViewModel.IAuthTabCallbackDefault;
        if (i3 == 0) {
            inAppPurchaseProductAuthorizer.hashCode();
            throw null;
        }
        if (inAppPurchaseProductAuthorizer2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            inAppPurchaseProductAuthorizer = inAppPurchaseProductAuthorizer2;
        }
        int i4 = isEngagementSignalsApiAvailable + 69;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return inAppPurchaseProductAuthorizer;
    }

    public final String access100() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 75;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackStub;
        }
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 41;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        String str = this.onTransact;
        int i5 = i3 + 35;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final setRubIn<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41> IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 25;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setRubIn<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41> setrubin = this.onMinimized;
        int i4 = i3 + 73;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return setrubin;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel = (InAppPurchasePreparationViewModel) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 77;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        inAppPurchasePreparationViewModel.onExtraCallback = str;
        WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0 = inAppPurchasePreparationViewModel.onExtraCallbackWithResult;
        if (windowInfoTrackerCompanionExternalSyntheticLambda0 == null) {
            int i4 = isEngagementSignalsApiAvailable + 73;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 == 0) {
                int i6 = 47 / 0;
            }
            windowInfoTrackerCompanionExternalSyntheticLambda0 = null;
        }
        inAppPurchasePreparationViewModel.onExtraCallbackWithResult(windowInfoTrackerCompanionExternalSyntheticLambda0, inAppPurchasePreparationViewModel.getInterfaceDescriptor(), str, inAppPurchasePreparationViewModel.onTransact);
        int i7 = ICustomTabsCallback_Parcel + 111;
        isEngagementSignalsApiAvailable = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 6 / 0;
        }
        return null;
    }

    public final void onActivityResized() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 75;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 = (WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0) this.onPostMessage.IAuthTabCallback();
            if (windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 != null) {
                maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new access000(windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, null), 3, (Object) null);
                return;
            }
            int i3 = ICustomTabsCallback_Parcel + 27;
            isEngagementSignalsApiAvailable = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 44 / 0;
                return;
            }
            return;
        }
        throw null;
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 $productInfoValue;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access000(WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, access13800<? super access000> access13800Var) {
            super(2, access13800Var);
            this.$productInfoValue = windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access000 access000Var = InAppPurchasePreparationViewModel.this.new access000(this.$productInfoValue, access13800Var);
            int i2 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 43 / 0;
            }
            return access000Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            access000 access000VarCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                access000VarCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = access000VarCreate.invokeSuspend(unit);
            int i4 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00de, code lost:
        
            if (r0 != r11) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x01ad, code lost:
        
            if (im.toss.appsintoss.iap.InAppPurchasePreparationViewModel.IAuthTabCallback(r1, r3, r23) == r11) goto L59;
         */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0152  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            QueryProductDetailsParams queryProductDetailsParams;
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27OnExtraCallbackWithResult;
            Object objOnExtraCallback;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj3 = null;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            if (i2 != 0) {
                int i3 = onNavigationEvent;
                int i4 = i3 + 103;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    if (i2 != 2) {
                        int i5 = i3 + 11;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                        return Unit.INSTANCE;
                    }
                    obj2 = this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel = InAppPurchasePreparationViewModel.this;
                    queryProductDetailsParams = Result.exceptionOrNull-impl(obj2);
                    if (queryProductDetailsParams != null) {
                        int i7 = onExtraCallbackWithResult + 75;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        if (zzcy.onNavigationEvent(queryProductDetailsParams, 0, 1, (Object) null)) {
                            int i9 = onExtraCallbackWithResult + 35;
                            onNavigationEvent = i9 % 128;
                            int i10 = i9 % 2;
                            safeActivityEmbeddingComponentProviderExternalSyntheticLambda27OnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.onNavigationEvent.onNavigationEvent;
                        } else if (queryProductDetailsParams instanceof QueryProductDetailsParams) {
                            int i11 = onNavigationEvent + 105;
                            onExtraCallbackWithResult = i11 % 128;
                            if (i11 % 2 != 0) {
                                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda25.onExtraCallbackWithResult(queryProductDetailsParams);
                                obj3.hashCode();
                                throw null;
                            }
                            safeActivityEmbeddingComponentProviderExternalSyntheticLambda27OnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda25.onExtraCallbackWithResult(queryProductDetailsParams);
                        } else {
                            safeActivityEmbeddingComponentProviderExternalSyntheticLambda27OnExtraCallbackWithResult = queryProductDetailsParams instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 ? (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27) queryProductDetailsParams : SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackStub.onWarmupCompleted;
                        }
                        this.L$0 = obj2;
                        this.L$1 = access15400.onNavigationEvent(queryProductDetailsParams);
                        this.L$2 = access15400.onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27OnExtraCallbackWithResult);
                        this.I$0 = 0;
                        this.label = 3;
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = obj;
            } else {
                ResultKt.onNavigationEvent(obj);
                InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel2 = InAppPurchasePreparationViewModel.this;
                WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 = this.$productInfoValue;
                Result.Companion companion3 = Result.Companion;
                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda61 safeActivityEmbeddingComponentProviderExternalSyntheticLambda61IAuthTabCallback = InAppPurchasePreparationViewModel.IAuthTabCallback(inAppPurchasePreparationViewModel2);
                WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0 = (WindowInfoTrackerCompanionExternalSyntheticLambda0) InAppPurchasePreparationViewModel.onWarmupCompleted(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{inAppPurchasePreparationViewModel2}, -893111417, 893111419);
                if (windowInfoTrackerCompanionExternalSyntheticLambda0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    windowInfoTrackerCompanionExternalSyntheticLambda0 = null;
                }
                String strOnTransact = windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0.asInterface().onTransact();
                String strOnWarmupCompleted = inAppPurchasePreparationViewModel2.onWarmupCompleted();
                InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer = (InAppPurchaseProductAuthorizer) InAppPurchasePreparationViewModel.onWarmupCompleted(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{inAppPurchasePreparationViewModel2}, -693604272, 693604272);
                String strAccess100 = inAppPurchasePreparationViewModel2.access100();
                String strIAuthTabCallbackStub = InAppPurchasePreparationViewModel.IAuthTabCallbackStub(inAppPurchasePreparationViewModel2);
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                objOnExtraCallback = safeActivityEmbeddingComponentProviderExternalSyntheticLambda61IAuthTabCallback.onExtraCallback(windowInfoTrackerCompanionExternalSyntheticLambda0, strOnTransact, strOnWarmupCompleted, inAppPurchaseProductAuthorizer, strAccess100, strIAuthTabCallbackStub, this);
            }
            obj2 = Result.constructor-impl(objOnExtraCallback);
            InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel3 = InAppPurchasePreparationViewModel.this;
            if (Result.onNavigationEvent(obj2)) {
                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda31 safeActivityEmbeddingComponentProviderExternalSyntheticLambda31 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda31) obj2;
                InAppPurchasePreparationViewModel.onExtraCallback(inAppPurchasePreparationViewModel3, safeActivityEmbeddingComponentProviderExternalSyntheticLambda31.onWarmupCompleted());
                String interfaceDescriptor = Intrinsics.areEqual(inAppPurchasePreparationViewModel3.access100(), "SUBSCRIPTION") ? inAppPurchasePreparationViewModel3.getInterfaceDescriptor() : safeActivityEmbeddingComponentProviderExternalSyntheticLambda31.IAuthTabCallback();
                InAppPurchasePreparationViewModel.onExtraCallbackWithResult(inAppPurchasePreparationViewModel3).onWarmupCompleted("purchase_sku", interfaceDescriptor);
                getBorderRadius getborderradiusIAuthTabCallback_Parcel = InAppPurchasePreparationViewModel.IAuthTabCallback_Parcel(inAppPurchasePreparationViewModel3);
                this.L$0 = obj2;
                this.L$1 = access15400.onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda31);
                this.L$2 = access15400.onNavigationEvent(interfaceDescriptor);
                this.I$0 = 0;
                this.label = 2;
                if (getborderradiusIAuthTabCallback_Parcel.emit(interfaceDescriptor, this) != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel4 = InAppPurchasePreparationViewModel.this;
            queryProductDetailsParams = Result.exceptionOrNull-impl(obj2);
            if (queryProductDetailsParams != null) {
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0070, code lost:
    
        r2 = im.toss.appsintoss.iap.InAppPurchasePreparationViewModel.ICustomTabsCallback_Parcel + 113;
        im.toss.appsintoss.iap.InAppPurchasePreparationViewModel.isEngagementSignalsApiAvailable = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0079, code lost:
    
        if ((r2 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007b, code lost:
    
        r3 = com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        r6 = com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        onWarmupCompleted(r3, com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), r6, new java.lang.Object[]{r17, r18}, 1543007690, -1543007682);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0098, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0099, code lost:
    
        r10 = com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        r13 = com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        onWarmupCompleted(r10, com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), r13, new java.lang.Object[]{r17, r18}, 1543007690, -1543007682);
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ba, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c0, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c1, code lost:
    
        onExtraCallback(r18);
        r0 = im.toss.appsintoss.iap.InAppPurchasePreparationViewModel.isEngagementSignalsApiAvailable + 105;
        im.toss.appsintoss.iap.InAppPurchasePreparationViewModel.ICustomTabsCallback_Parcel = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00cd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003d, code lost:
    
        if (r2 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006c, code lost:
    
        if (r2 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006e, code lost:
    
        if (r2 != 2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull String str) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 25;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            i = onNavigationEvent.IAuthTabCallback[((InAppPurchaseProductAuthorizer) onWarmupCompleted(iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this}, -693604272, 693604272)).ordinal()];
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent4 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            i = onNavigationEvent.IAuthTabCallback[((InAppPurchaseProductAuthorizer) onWarmupCompleted(iOnNavigationEvent3, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent4, new Object[]{this}, -693604272, 693604272)).ordinal()];
        }
    }

    private final void onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 107;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        String strOnTransact = onTransact();
        Object obj = null;
        if (strOnTransact != null) {
            maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(strOnTransact, str, null), 3, (Object) null);
            return;
        }
        int i4 = isEngagementSignalsApiAvailable + 47;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ String $rawReceipt;
        final /* synthetic */ String $targetOrderId;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(String str, String str2, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$targetOrderId = str;
            this.$rawReceipt = str2;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            IAuthTabCallback = i2 % 128;
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

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = InAppPurchasePreparationViewModel.this.new IAuthTabCallbackStub(this.$targetOrderId, this.$rawReceipt, access13800Var);
            int i2 = onNavigationEvent + 109;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallbackStub;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00ea, code lost:
        
            if (r0 != r9) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x015d, code lost:
        
            if (r1.emit(r3, r19) == r9) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0176, code lost:
        
            if (r1.emit(r3, r19) == r9) goto L51;
         */
        /* JADX WARN: Removed duplicated region for block: B:44:0x013b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Throwable th;
            Object objOnExtraCallbackWithResult;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
            } catch (WebResourceResponseModel e) {
                Result.Companion companion = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
                int i3 = onNavigationEvent + 23;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            if (i2 != 0) {
                int i5 = onNavigationEvent;
                int i6 = i5 + 81;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                if (i2 != 1) {
                    if (i2 != 2) {
                        int i8 = i5 + 121;
                        int i9 = i8 % 128;
                        IAuthTabCallback = i9;
                        int i10 = i8 % 2;
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i11 = i9 + 37;
                        onNavigationEvent = i11 % 128;
                        if (i11 % 2 != 0) {
                            ResultKt.onNavigationEvent(obj);
                            throw null;
                        }
                        ResultKt.onNavigationEvent(obj);
                        InAppPurchasePreparationViewModel.asBinder(InAppPurchasePreparationViewModel.this).onWarmupCompleted(access14000.onNavigationEvent(false));
                        return Unit.INSTANCE;
                    }
                    obj2 = this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel = InAppPurchasePreparationViewModel.this;
                    th = Result.exceptionOrNull-impl(obj2);
                    if (th != null) {
                        int i12 = onNavigationEvent + 21;
                        IAuthTabCallback = i12 % 128;
                        if (i12 % 2 == 0) {
                            getBorderRadius getborderradiusAsInterface = InAppPurchasePreparationViewModel.asInterface(inAppPurchasePreparationViewModel);
                            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackDefault iAuthTabCallbackDefault = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackDefault.onExtraCallback;
                            this.L$0 = obj2;
                            this.L$1 = access15400.onNavigationEvent(th);
                            this.I$0 = 0;
                            this.label = 4;
                        } else {
                            getBorderRadius getborderradiusAsInterface2 = InAppPurchasePreparationViewModel.asInterface(inAppPurchasePreparationViewModel);
                            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackDefault iAuthTabCallbackDefault2 = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackDefault.onExtraCallback;
                            this.L$0 = obj2;
                            this.L$1 = access15400.onNavigationEvent(th);
                            this.I$0 = 0;
                            this.label = 3;
                        }
                    }
                    InAppPurchasePreparationViewModel.asBinder(InAppPurchasePreparationViewModel.this).onWarmupCompleted(access14000.onNavigationEvent(false));
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallbackWithResult = obj;
            } else {
                ResultKt.onNavigationEvent(obj);
                InAppPurchasePreparationViewModel.asBinder(InAppPurchasePreparationViewModel.this).onWarmupCompleted(access14000.onNavigationEvent(true));
                InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel2 = InAppPurchasePreparationViewModel.this;
                String str = this.$targetOrderId;
                String str2 = this.$rawReceipt;
                Result.Companion companion3 = Result.Companion;
                SplitControllersplitInfoList1ExternalSyntheticLambda1 splitControllersplitInfoList1ExternalSyntheticLambda1OnNavigationEvent = InAppPurchasePreparationViewModel.onNavigationEvent(inAppPurchasePreparationViewModel2);
                WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0 = (WindowInfoTrackerCompanionExternalSyntheticLambda0) InAppPurchasePreparationViewModel.onWarmupCompleted(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{inAppPurchasePreparationViewModel2}, -893111417, 893111419);
                if (windowInfoTrackerCompanionExternalSyntheticLambda0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i13 = IAuthTabCallback + 59;
                    onNavigationEvent = i13 % 128;
                    int i14 = i13 % 2;
                    windowInfoTrackerCompanionExternalSyntheticLambda0 = null;
                }
                InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer = (InAppPurchaseProductAuthorizer) InAppPurchasePreparationViewModel.onWarmupCompleted(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{inAppPurchasePreparationViewModel2}, -693604272, 693604272);
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                objOnExtraCallbackWithResult = splitControllersplitInfoList1ExternalSyntheticLambda1OnNavigationEvent.onExtraCallbackWithResult(windowInfoTrackerCompanionExternalSyntheticLambda0, str, str2, inAppPurchaseProductAuthorizer, this);
            }
            obj2 = Result.constructor-impl(objOnExtraCallbackWithResult);
            InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel3 = InAppPurchasePreparationViewModel.this;
            if (Result.onNavigationEvent(obj2)) {
                getBorderRadius getborderradiusIAuthTabCallbackStubProxy = InAppPurchasePreparationViewModel.IAuthTabCallbackStubProxy(inAppPurchasePreparationViewModel3);
                Unit unit = Unit.INSTANCE;
                this.L$0 = obj2;
                this.L$1 = access15400.onNavigationEvent((Unit) obj2);
                this.I$0 = 0;
                this.label = 2;
                if (getborderradiusIAuthTabCallbackStubProxy.emit(unit, this) != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel4 = InAppPurchasePreparationViewModel.this;
            th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
            }
            InAppPurchasePreparationViewModel.asBinder(InAppPurchasePreparationViewModel.this).onWarmupCompleted(access14000.onNavigationEvent(false));
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel = (InAppPurchasePreparationViewModel) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 93;
        ICustomTabsCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            String strOnTransact = inAppPurchasePreparationViewModel.onTransact();
            if (strOnTransact != null) {
                maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(inAppPurchasePreparationViewModel), (CoroutineContext) null, (setRandomHost) null, new asInterface(inAppPurchasePreparationViewModel, strOnTransact, str, (access13800) null), 3, (Object) null);
                return null;
            }
            int i3 = isEngagementSignalsApiAvailable + 27;
            ICustomTabsCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        inAppPurchasePreparationViewModel.onTransact();
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 99;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.asInterface = str;
        this.ICustomTabsCallback.onWarmupCompleted(Boolean.TRUE);
        int i4 = ICustomTabsCallback_Parcel + 37;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = InAppPurchasePreparationViewModel.this.new onWarmupCompleted(access13800Var);
            int i2 = onExtraCallback + 57;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 5;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 123;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = IAuthTabCallback + 39;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                getBorderRadius getborderradiusAsInterface = InAppPurchasePreparationViewModel.asInterface(InAppPurchasePreparationViewModel.this);
                this.label = 1;
                if (getborderradiusAsInterface.emit((Object) null, this) == objOnWarmupCompleted) {
                    int i7 = IAuthTabCallback + 89;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        this.onMessageChannelReady = false;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(null), 3, (Object) null);
        int i2 = ICustomTabsCallback_Parcel + 17;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 30 / 0;
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = InAppPurchasePreparationViewModel.this.new onExtraCallback(access13800Var);
            int i2 = onNavigationEvent + 121;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 31;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onExtraCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {InAppPurchasePreparationViewModel.this};
                getBorderRadius getborderradius = (getBorderRadius) InAppPurchasePreparationViewModel.onWarmupCompleted(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, -277367758, 277367759);
                this.label = 1;
                if (getborderradius.emit((Object) null, this) == objOnWarmupCompleted) {
                    int i4 = onExtraCallback + 59;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = onExtraCallback + 27;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.onNavigationEvent(obj);
                if (i7 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                int i8 = onExtraCallback + 47;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(null), 3, (Object) null);
        int i2 = ICustomTabsCallback_Parcel + 21;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel = (InAppPurchasePreparationViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 121;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        boolean z = !inAppPurchasePreparationViewModel.onMessageChannelReady;
        int i5 = i2 + 9;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return Boolean.valueOf(z);
        }
        int i6 = 27 / 0;
        return Boolean.valueOf(z);
    }

    public final void onExtraCallbackWithResult(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, "");
        this.onMessageChannelReady = true;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onTransact(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, null), 3, (Object) null);
        int i2 = ICustomTabsCallback_Parcel + 23;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 $error;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$error = safeActivityEmbeddingComponentProviderExternalSyntheticLambda27;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = InAppPurchasePreparationViewModel.this.new onTransact(this.$error, access13800Var);
            int i2 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return ontransact;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onTransact ontransactCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                ontransactCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = ontransactCreate.invokeSuspend(unit);
            int i4 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onExtraCallbackWithResult + 105;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0 ? i4 != 1 : i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                getBorderRadius getborderradiusAsInterface = InAppPurchasePreparationViewModel.asInterface(InAppPurchasePreparationViewModel.this);
                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27 = this.$error;
                this.label = 1;
                if (getborderradiusAsInterface.emit(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, this) == objOnWarmupCompleted) {
                    int i6 = onExtraCallbackWithResult + 123;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel = (InAppPurchasePreparationViewModel) objArr[0];
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(inAppPurchasePreparationViewModel), (CoroutineContext) null, (setRandomHost) null, inAppPurchasePreparationViewModel.new IAuthTabCallbackDefault(null), 3, (Object) null);
        int i2 = isEngagementSignalsApiAvailable + 43;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = InAppPurchasePreparationViewModel.this.new IAuthTabCallbackDefault(access13800Var);
            int i2 = IAuthTabCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallbackDefault;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 30 / 0;
            }
            int i5 = onExtraCallbackWithResult + 9;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 99;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onExtraCallbackWithResult + 83;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                getBorderRadius getborderradiusIAuthTabCallbackStubProxy = InAppPurchasePreparationViewModel.IAuthTabCallbackStubProxy(InAppPurchasePreparationViewModel.this);
                Unit unit = Unit.INSTANCE;
                this.label = 1;
                if (getborderradiusIAuthTabCallbackStubProxy.emit(unit, this) == objOnWarmupCompleted) {
                    int i7 = onExtraCallbackWithResult + 57;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ String $countryCode;
        final /* synthetic */ WindowInfoTrackerCompanionExternalSyntheticLambda0 $miniAppInfo;
        final /* synthetic */ String $offerId;
        final /* synthetic */ String $productId;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, String str, String str2, String str3, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$miniAppInfo = windowInfoTrackerCompanionExternalSyntheticLambda0;
            this.$productId = str;
            this.$countryCode = str2;
            this.$offerId = str3;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 40 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = InAppPurchasePreparationViewModel.this.new IAuthTabCallback(this.$miniAppInfo, this.$productId, this.$countryCode, this.$offerId, access13800Var);
            int i2 = onNavigationEvent + 121;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = 27 / 0;
            return objIAuthTabCallback;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x009e, code lost:
        
            if (r0 != r9) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x017d, code lost:
        
            if (im.toss.appsintoss.iap.InAppPurchasePreparationViewModel.onNavigationEvent(r3, r4, r17) != r9) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x01aa, code lost:
        
            if (im.toss.appsintoss.iap.InAppPurchasePreparationViewModel.onNavigationEvent(r0, r1, r17) == r9) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x01bf, code lost:
        
            if (im.toss.appsintoss.iap.InAppPurchasePreparationViewModel.onNavigationEvent(r0, r1, r17) == r9) goto L82;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0055 A[PHI: r0 r1 r2 r3
          0x0055: PHI (r0v13 int) = (r0v12 int), (r0v33 int) binds: [B:41:0x00fa, B:14:0x0046] A[DONT_GENERATE, DONT_INLINE]
          0x0055: PHI (r1v6 o.WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0) = 
          (r1v5 o.WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0)
          (r1v19 o.WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0)
         binds: [B:41:0x00fa, B:14:0x0046] A[DONT_GENERATE, DONT_INLINE]
          0x0055: PHI (r2v4 im.toss.appsintoss.iap.InAppPurchasePreparationViewModel) = 
          (r2v3 im.toss.appsintoss.iap.InAppPurchasePreparationViewModel)
          (r2v18 im.toss.appsintoss.iap.InAppPurchasePreparationViewModel)
         binds: [B:41:0x00fa, B:14:0x0046] A[DONT_GENERATE, DONT_INLINE]
          0x0055: PHI (r3v2 java.lang.Object) = (r3v1 java.lang.Object), (r3v8 java.lang.Object) binds: [B:41:0x00fa, B:14:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x018d  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01cc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01cd  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            Object obj2;
            Object obj3;
            WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0;
            InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel;
            int i;
            getCornerRadius getcornerradiusOnTransact;
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41 safeActivityEmbeddingComponentProviderExternalSyntheticLambda41IAuthTabCallback;
            Object obj4;
            int i2;
            QueryProductDetailsParams.onNavigationEvent onnavigationevent;
            int i3;
            Throwable th;
            Object objOnExtraCallbackWithResult;
            int i4 = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i5 = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel2 = InAppPurchasePreparationViewModel.this;
                WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0 = this.$miniAppInfo;
                String str = this.$productId;
                String str2 = this.$countryCode;
                String str3 = this.$offerId;
                Result.Companion companion3 = Result.Companion;
                SafeWindowLayoutComponentProviderExternalSyntheticLambda4 safeWindowLayoutComponentProviderExternalSyntheticLambda4OnExtraCallback = InAppPurchasePreparationViewModel.onExtraCallback(inAppPurchasePreparationViewModel2);
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                objOnExtraCallbackWithResult = safeWindowLayoutComponentProviderExternalSyntheticLambda4OnExtraCallback.onExtraCallbackWithResult(windowInfoTrackerCompanionExternalSyntheticLambda0, str, str2, str3, this);
            } else {
                if (i5 != 1) {
                    int i6 = onNavigationEvent + 125;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (i5 == 2) {
                        i = this.I$0;
                        windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 = (WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0) this.L$2;
                        inAppPurchasePreparationViewModel = (InAppPurchasePreparationViewModel) this.L$1;
                        obj3 = this.L$0;
                        ResultKt.onNavigationEvent(obj);
                        getcornerradiusOnTransact = InAppPurchasePreparationViewModel.onTransact(inAppPurchasePreparationViewModel);
                        safeActivityEmbeddingComponentProviderExternalSyntheticLambda41IAuthTabCallback = windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 == null ? SafeActivityEmbeddingComponentProviderExternalSyntheticLambda4.IAuthTabCallback(windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0) : null;
                        this.L$0 = obj3;
                        this.L$1 = inAppPurchasePreparationViewModel;
                        this.L$2 = windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0;
                        this.I$0 = i;
                        this.label = 3;
                        if (getcornerradiusOnTransact.emit(safeActivityEmbeddingComponentProviderExternalSyntheticLambda41IAuthTabCallback, this) != objOnWarmupCompleted) {
                            WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda02 = windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0;
                            int i8 = i;
                            obj4 = obj3;
                            InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel3 = inAppPurchasePreparationViewModel;
                            i2 = onExtraCallback + 69;
                            onNavigationEvent = i2 % 128;
                            if (i2 % 2 == 0) {
                            }
                        }
                        i3 = onNavigationEvent + 51;
                        onExtraCallback = i3 % 128;
                        if (i3 % 2 == 0) {
                            return objOnWarmupCompleted;
                        }
                        throw null;
                    }
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.onNavigationEvent(obj);
                            return Unit.INSTANCE;
                        }
                        obj4 = this.L$0;
                        ResultKt.onNavigationEvent(obj);
                        obj3 = obj4;
                        InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel4 = InAppPurchasePreparationViewModel.this;
                        th = Result.exceptionOrNull-impl(obj3);
                        if (th != null) {
                            int i9 = onNavigationEvent + 39;
                            onExtraCallback = i9 % 128;
                            if (i9 % 2 == 0) {
                                this.L$0 = obj3;
                                this.L$1 = access15400.onNavigationEvent(th);
                                this.L$2 = null;
                                this.I$0 = 1;
                                this.label = 2;
                            } else {
                                this.L$0 = obj3;
                                this.L$1 = access15400.onNavigationEvent(th);
                                this.L$2 = null;
                                this.I$0 = 0;
                                this.label = 5;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    i = this.I$0;
                    windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 = (WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0) this.L$2;
                    inAppPurchasePreparationViewModel = (InAppPurchasePreparationViewModel) this.L$1;
                    obj3 = this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda022 = windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0;
                    int i82 = i;
                    obj4 = obj3;
                    InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel32 = inAppPurchasePreparationViewModel;
                    i2 = onExtraCallback + 69;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        InAppPurchasePreparationViewModel.IAuthTabCallbackStub(inAppPurchasePreparationViewModel32);
                        throw null;
                    }
                    if (InAppPurchasePreparationViewModel.IAuthTabCallbackStub(inAppPurchasePreparationViewModel32) == null) {
                        if ((windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda022 != null ? windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda022.asBinder() : null) != null) {
                            InAppPurchasePreparationViewModel.onWarmupCompleted(inAppPurchasePreparationViewModel32, windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda022.asBinder());
                        }
                    }
                    if ((windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda022 != null ? windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda022.onExtraCallbackWithResult() : null) != null) {
                        WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0OnExtraCallbackWithResult = WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0.Companion.onExtraCallbackWithResult(windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda022.onExtraCallbackWithResult());
                        int i10 = windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0OnExtraCallbackWithResult == null ? -1 : IAuthTabCallback.onExtraCallback[windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0OnExtraCallbackWithResult.ordinal()];
                        if (i10 == -1) {
                            onnavigationevent = new QueryProductDetailsParams.onNavigationEvent();
                        } else if (i10 == 1) {
                            onnavigationevent = new QueryProductDetailsParams.onExtraCallback();
                        } else {
                            if (i10 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            onnavigationevent = new QueryProductDetailsParams.onNavigationEvent();
                            int i11 = onExtraCallback + 107;
                            onNavigationEvent = i11 % 128;
                            int i12 = i11 % 2;
                        }
                        this.L$0 = obj4;
                        this.L$1 = access15400.onNavigationEvent(windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda022);
                        this.L$2 = access15400.onNavigationEvent(onnavigationevent);
                        this.I$0 = i82;
                        this.label = 4;
                    }
                    obj3 = obj4;
                    InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel42 = InAppPurchasePreparationViewModel.this;
                    th = Result.exceptionOrNull-impl(obj3);
                    if (th != null) {
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallbackWithResult = obj;
            }
            obj2 = Result.constructor-impl(objOnExtraCallbackWithResult);
            obj3 = obj2;
            InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel5 = InAppPurchasePreparationViewModel.this;
            if (!Result.onNavigationEvent(obj3)) {
                InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel422 = InAppPurchasePreparationViewModel.this;
                th = Result.exceptionOrNull-impl(obj3);
                if (th != null) {
                }
                return Unit.INSTANCE;
            }
            windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 = (WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0) obj3;
            getCornerRadius interfaceDescriptor = InAppPurchasePreparationViewModel.getInterfaceDescriptor(inAppPurchasePreparationViewModel5);
            this.L$0 = obj3;
            this.L$1 = inAppPurchasePreparationViewModel5;
            this.L$2 = windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0;
            this.I$0 = 0;
            this.label = 2;
            if (interfaceDescriptor.emit(windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, this) != objOnWarmupCompleted) {
                inAppPurchasePreparationViewModel = inAppPurchasePreparationViewModel5;
                i = 0;
                getcornerradiusOnTransact = InAppPurchasePreparationViewModel.onTransact(inAppPurchasePreparationViewModel);
                if (windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 == null) {
                }
                this.L$0 = obj3;
                this.L$1 = inAppPurchasePreparationViewModel;
                this.L$2 = windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0;
                this.I$0 = i;
                this.label = 3;
                if (getcornerradiusOnTransact.emit(safeActivityEmbeddingComponentProviderExternalSyntheticLambda41IAuthTabCallback, this) != objOnWarmupCompleted) {
                }
            }
            i3 = onNavigationEvent + 51;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
            }
        }
    }

    private final void onExtraCallbackWithResult(WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, String str, String str2, String str3) {
        int i = 2 % 2;
        this.onWarmupCompleted.onWarmupCompleted(Boolean.TRUE);
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(windowInfoTrackerCompanionExternalSyntheticLambda0, str, str2, str3, null), 3, (Object) null);
        this.onWarmupCompleted.onWarmupCompleted(Boolean.FALSE);
        int i2 = isEngagementSignalsApiAvailable + 65;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Object objOnExtraCallbackWithResult;
        InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel = (InAppPurchasePreparationViewModel) objArr[0];
        QueryProductDetailsParams queryProductDetailsParams = (Throwable) objArr[1];
        access13800 access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 61;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0 ? !zzcy.onNavigationEvent(queryProductDetailsParams, 0, 1, (Object) null) : !zzcy.onNavigationEvent(queryProductDetailsParams, 1, 1, (Object) null)) {
            if (queryProductDetailsParams instanceof QueryProductDetailsParams) {
                objOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda25.onExtraCallbackWithResult(queryProductDetailsParams);
            }
        } else {
            objOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackStub.onWarmupCompleted;
            int i3 = ICustomTabsCallback_Parcel + 119;
            isEngagementSignalsApiAvailable = i3 % 128;
            int i4 = i3 % 2;
        }
        Object objEmit = inAppPurchasePreparationViewModel.onNavigationEvent.emit(objOnExtraCallbackWithResult, access13800Var);
        if (objEmit == access14300.onWarmupCompleted()) {
            int i5 = ICustomTabsCallback_Parcel + 29;
            isEngagementSignalsApiAvailable = i5 % 128;
            if (i5 % 2 == 0) {
                return objEmit;
            }
            throw null;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        if (r9.emit(r4, r1) == r3) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e A[PHI: r1 r4
      0x002e: PHI (r1v10 im.toss.appsintoss.iap.InAppPurchasePreparationViewModel$asBinder) = 
      (r1v9 im.toss.appsintoss.iap.InAppPurchasePreparationViewModel$asBinder)
      (r1v12 im.toss.appsintoss.iap.InAppPurchasePreparationViewModel$asBinder)
     binds: [B:11:0x002c, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x002e: PHI (r4v4 int) = (r4v3 int), (r4v6 int) binds: [B:11:0x002c, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, access13800<? super Unit> access13800Var) {
        asBinder asbinder;
        int i;
        int i2 = 2 % 2;
        if (!(access13800Var instanceof asBinder)) {
            asbinder = new asBinder(access13800Var);
        } else {
            int i3 = isEngagementSignalsApiAvailable + 13;
            ICustomTabsCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                asbinder = (asBinder) access13800Var;
                i = asbinder.label;
                int i4 = 65 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    asbinder.label = i - 2147483648;
                }
            } else {
                asbinder = (asBinder) access13800Var;
                i = asbinder.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        Object obj = asbinder.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = asbinder.label;
        if (i5 != 0) {
            int i6 = isEngagementSignalsApiAvailable + 89;
            int i7 = i6 % 128;
            ICustomTabsCallback_Parcel = i7;
            if (i6 % 2 != 0 ? i5 != 1 : i5 != 1) {
                int i8 = i7 + 43;
                isEngagementSignalsApiAvailable = i8 % 128;
                if (i8 % 2 == 0 ? i5 != 2 : i5 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.onNavigationEvent(obj);
            int i9 = isEngagementSignalsApiAvailable + 25;
            ICustomTabsCallback_Parcel = i9 % 128;
            int i10 = i9 % 2;
        } else {
            ResultKt.onNavigationEvent(obj);
            if (this.readTypedObject) {
                getBorderRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27> getborderradius = this.onNavigationEvent;
                asbinder.L$0 = access15400.onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27);
                asbinder.label = 1;
                if (getborderradius.emit(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, asbinder) == objOnWarmupCompleted) {
                    int i11 = isEngagementSignalsApiAvailable + 97;
                    ICustomTabsCallback_Parcel = i11 % 128;
                    int i12 = i11 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                getBorderRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40> getborderradius2 = this.IAuthTabCallbackStubProxy;
                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40.onWarmupCompleted onwarmupcompleted = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40.onWarmupCompleted(R.string.appsintoss_in_app_purchase_error_server_error_toast, safeActivityEmbeddingComponentProviderExternalSyntheticLambda27);
                asbinder.L$0 = access15400.onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27);
                asbinder.label = 2;
            }
        }
        this.readTypedObject = !this.readTypedObject;
        return Unit.INSTANCE;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public static final /* synthetic */ WindowInfoTrackerCompanionExternalSyntheticLambda0 IAuthTabCallbackDefault(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (WindowInfoTrackerCompanionExternalSyntheticLambda0) onWarmupCompleted(iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, new Object[]{inAppPurchasePreparationViewModel}, -893111417, 893111419);
    }

    public static final /* synthetic */ getBorderRadius access000(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (getBorderRadius) onWarmupCompleted(iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, new Object[]{inAppPurchasePreparationViewModel}, -277367758, 277367759);
    }

    private final Object onNavigationEvent(Throwable th, access13800<? super Unit> access13800Var) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return onWarmupCompleted(iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this, th, access13800Var}, -890919182, 890919185);
    }

    private final void IAuthTabCallback(String str) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        onWarmupCompleted(iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this, str}, 1543007690, -1543007682);
    }

    public final boolean onExtraCallbackWithResult() {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this}, -1337948934, 1337948941)).booleanValue();
    }

    public final getTileModeX<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27> IAuthTabCallback() {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (getTileModeX) onWarmupCompleted(iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this}, -1981269108, 1981269112);
    }

    public final InAppPurchaseProductAuthorizer IAuthTabCallbackStubProxy() {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (InAppPurchaseProductAuthorizer) onWarmupCompleted(iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this}, -693604272, 693604272);
    }

    public final setRubIn<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0> access000() {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (setRubIn) onWarmupCompleted(iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this}, -225118289, 225118298);
    }

    public final void onPostMessage() {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        onWarmupCompleted(iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this}, -1705945231, 1705945236);
    }

    public final void onWarmupCompleted(@NotNull String str) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        onWarmupCompleted(iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this, str}, -245124836, 245124842);
    }
}
