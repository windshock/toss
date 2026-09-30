package im.toss.features.home.ui.dst.view.account.loan;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import im.toss.features.home.core.ui.base.BaseHomeActivity;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import im.toss.features.home.core.ui.extensions.RecyclerViewsKt;
import im.toss.features.home.core.ui.recyclerview.HomeDstRecyclerView;
import im.toss.features.home.core.ui.widget.HomeDstView;
import im.toss.features.home.ui.dst.R;
import im.toss.features.home.ui.dst.view.account.loan.HomeDstLoanAccountFragment$;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppLogger;
import o.AutoCallback;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.RVManifestIProxyManifest;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TinyAppLogUtil;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access13800;
import o.access8100;
import o.buildDebugModeStorageKey;
import o.deserializeUriNullableCollection;
import o.fillData;
import o.getIconPaddingLeft;
import o.getLogType;
import o.maybeUpdateAnimatable;
import o.setMinimumDpi;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class HomeDstLoanAccountFragment extends Hilt_HomeDstLoanAccountFragment<buildDebugModeStorageKey, HomeDstLoanAccountViewModel, RVManifestIProxyManifest> {
    private static int asBinder = 1;
    private static int onExtraCallback;
    private final String IAuthTabCallback;
    private final Lazy onExtraCallbackWithResult;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i5;
        int i9 = (~(i7 | i4)) | (~(i7 | i8));
        int i10 = ~i4;
        int i11 = (~(i5 | i10 | i)) | i9;
        int i12 = ~(i8 | i10);
        int i13 = i4 + i + i2 + ((-1228711472) * i6) + ((-141981132) * i3);
        int i14 = i13 * i13;
        int i15 = (((-639131287) * i4) - 2072313856) + (1118068377 * i) + (i11 * (-1268883816)) + ((-1757199664) * i9) + ((-1268883816) * i12) + ((-1908015104) * i2) + ((-287309824) * i6) + ((-1573388288) * i3) + ((-2138374144) * i14);
        int i16 = ((i4 * (-646461497)) - 273503129) + (i * (-646460521)) + (i11 * 488) + (i9 * (-976)) + (i12 * 488) + (i2 * (-646461009)) + (i6 * 1623110960) + (i3 * (-2035004020)) + (i14 * 33882112);
        int i17 = i15 + (i16 * i16 * (-1051394048));
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ boolean IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(-1715152311, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{function1, obj}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1715152311, iOnExtraCallback, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback())).booleanValue();
        int i4 = onExtraCallback + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        getInterfaceDescriptor(function1, obj);
        if (i3 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(SwipeRefreshLayout swipeRefreshLayout, HomeDstLoanAccountFragment homeDstLoanAccountFragment) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(swipeRefreshLayout, homeDstLoanAccountFragment);
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
    }

    public static /* synthetic */ boolean onNavigationEvent(HomeDstLoanAccountFragment homeDstLoanAccountFragment, setMinimumDpi setminimumdpi) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(homeDstLoanAccountFragment, setminimumdpi);
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        return zIAuthTabCallback;
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        access000(function1, obj);
        int i4 = asBinder + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        HomeDstLoanAccountFragment homeDstLoanAccountFragment = (HomeDstLoanAccountFragment) objArr[0];
        setMinimumDpi setminimumdpi = (setMinimumDpi) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(homeDstLoanAccountFragment, setminimumdpi);
        int i4 = onExtraCallback + 39;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(th);
        int i4 = asBinder + 65;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 41;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 115;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return 1000504L;
    }

    public static final /* synthetic */ void onExtraCallback(HomeDstLoanAccountFragment homeDstLoanAccountFragment, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            IAuthTabCallback(-2010313557, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{homeDstLoanAccountFragment, str}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 2010313558, iOnExtraCallback, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
            return;
        }
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        IAuthTabCallback(-2010313557, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{homeDstLoanAccountFragment, str}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 2010313558, iOnExtraCallback2, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(HomeDstLoanAccountFragment homeDstLoanAccountFragment, List list) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        homeDstLoanAccountFragment.onNavigationEvent((List<AppLogger>) list);
        int i4 = asBinder + 59;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ AutoCallback IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeDstLoanAccountViewModel homeDstLoanAccountViewModelMayLaunchUrl = mayLaunchUrl();
        int i4 = asBinder + 23;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return homeDstLoanAccountViewModelMayLaunchUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: im.toss.features.home.ui.dst.view.account.loan.HomeDstLoanAccountFragment$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<View, buildDebugModeStorageKey> {
        private static int IAuthTabCallback = 1;
        public static final AnonymousClass1 onExtraCallback = new AnonymousClass1();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 103;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        AnonymousClass1() {
            super(1, buildDebugModeStorageKey.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/home/ui/dst/databinding/HomeFragmentHomeDstLoanAccountBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            buildDebugModeStorageKey builddebugmodestoragekeyOnExtraCallbackWithResult = onExtraCallbackWithResult((View) obj);
            int i4 = IAuthTabCallback + 107;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 21 / 0;
            }
            return builddebugmodestoragekeyOnExtraCallbackWithResult;
        }

        public final buildDebugModeStorageKey onExtraCallbackWithResult(View view) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(view, "");
                return buildDebugModeStorageKey.onExtraCallbackWithResult(view);
            }
            Intrinsics.checkNotNullParameter(view, "");
            int i3 = 49 / 0;
            return buildDebugModeStorageKey.onExtraCallbackWithResult(view);
        }
    }

    public HomeDstLoanAccountFragment() {
        super(R.layout.home_fragment_home_dst_loan_account, AnonymousClass1.onExtraCallback);
        this.IAuthTabCallback = "account_detail";
        Lazy lazyOnNavigationEvent = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onWarmupCompleted(new onExtraCallback(this)));
        this.onExtraCallbackWithResult = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(HomeDstLoanAccountViewModel.class), new onNavigationEvent(lazyOnNavigationEvent), new IAuthTabCallback(null, lazyOnNavigationEvent), new IAuthTabCallbackDefault(this, lazyOnNavigationEvent));
    }

    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 113;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i2 + 95;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Bundle arguments = getArguments();
        if (arguments == null) {
            int i4 = onExtraCallback + 91;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        Set<String> setKeySet = arguments.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        Set<String> set = setKeySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(set, 10)), 16));
        for (Object obj : set) {
            int i6 = onExtraCallback + 53;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            linkedHashMap.put(obj, arguments.get((String) obj));
        }
        Map<String, Object> mapOnWarmupCompleted = access8100.onWarmupCompleted(linkedHashMap);
        int i8 = onExtraCallback + 101;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
        return mapOnWarmupCompleted;
    }

    protected HomeDstLoanAccountViewModel mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeDstLoanAccountViewModel homeDstLoanAccountViewModel = (HomeDstLoanAccountViewModel) this.onExtraCallbackWithResult.getValue();
        int i4 = onExtraCallback + 51;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return homeDstLoanAccountViewModel;
        }
        throw null;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            ICustomTabsService();
            ICustomTabsCallback_Parcel();
            extraCommand();
            return;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ICustomTabsService();
        ICustomTabsCallback_Parcel();
        extraCommand();
        throw null;
    }

    private final void ICustomTabsService() {
        SwipeRefreshLayout swipeRefreshLayout;
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            buildDebugModeStorageKey builddebugmodestoragekeyOnExtraCallback = onExtraCallback();
            if (builddebugmodestoragekeyOnExtraCallback != null && (swipeRefreshLayout = builddebugmodestoragekeyOnExtraCallback.IAuthTabCallback) != null) {
                swipeRefreshLayout.setOnRefreshListener(new HomeDstLoanAccountFragment$.ExternalSyntheticLambda0(swipeRefreshLayout, this));
            }
            int i3 = onExtraCallback + 81;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 44 / 0;
                return;
            }
            return;
        }
        onExtraCallback();
        throw null;
    }

    private static final void onWarmupCompleted(SwipeRefreshLayout swipeRefreshLayout, HomeDstLoanAccountFragment homeDstLoanAccountFragment) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        swipeRefreshLayout.announceForAccessibility(homeDstLoanAccountFragment.getString(im.toss.features.home.core.ui.R.string.home_v2_core_ui_refresh_list));
        HomeDstLoanAccountViewModel.IAuthTabCallback(homeDstLoanAccountFragment.mayLaunchUrl(), (String) null, getLogType.PULL_TO_REFRESH, (TinyAppLogUtil) null, 5, (Object) null);
        int i4 = asBinder + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(this, (access13800) null), 3, (Object) null);
        int i2 = onExtraCallback + 113;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 40 / 0;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        BaseHomeActivity baseHomeActivity;
        HomeDstLoanAccountFragment homeDstLoanAccountFragment = (HomeDstLoanAccountFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        BaseHomeActivity activity = homeDstLoanAccountFragment.getActivity();
        if (activity instanceof BaseHomeActivity) {
            baseHomeActivity = activity;
        } else {
            int i4 = asBinder + 1;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            baseHomeActivity = null;
        }
        if (baseHomeActivity != null) {
            baseHomeActivity.onNavigationEvent(str);
        }
        return null;
    }

    private final void onNavigationEvent(List<AppLogger> list) {
        int i = 2 % 2;
        BaseHomeActivity activity = getActivity();
        Object obj = null;
        BaseHomeActivity baseHomeActivity = activity instanceof BaseHomeActivity ? activity : null;
        if (baseHomeActivity != null) {
            int i2 = asBinder + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            baseHomeActivity.IAuthTabCallback(list);
            if (i3 != 0) {
                int i4 = 23 / 0;
            }
        }
        int i5 = asBinder + 55;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        boolean zBooleanValue;
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
            int i3 = 88 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    private static final boolean IAuthTabCallback(HomeDstLoanAccountFragment homeDstLoanAccountFragment, setMinimumDpi setminimumdpi) {
        int i = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(setminimumdpi, "");
        String str2 = (String) CollectionsKt.lastOrNull(StringsKt.split$default(homeDstLoanAccountFragment.mayLaunchUrl().onActivityResized(), new String[]{":"}, false, 0, 6, (Object) null));
        if (str2 == null) {
            int i2 = asBinder + 91;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = i3 + 15;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = str2;
        }
        boolean zOnNavigationEvent = setminimumdpi.onNavigationEvent(str);
        int i6 = onExtraCallback + 81;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    private static final void getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onExtraCallback + 55;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[PHI: r0
      0x002b: PHI (r0v8 im.toss.features.home.core.ui.recyclerview.HomeDstRecyclerView) = 
      (r0v7 im.toss.features.home.core.ui.recyclerview.HomeDstRecyclerView)
      (r0v9 im.toss.features.home.core.ui.recyclerview.HomeDstRecyclerView)
     binds: [B:12:0x0029, B:9:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(HomeDstLoanAccountFragment homeDstLoanAccountFragment, setMinimumDpi setminimumdpi) {
        HomeDstView homeDstView;
        HomeDstRecyclerView homeDstRecyclerViewOnExtraCallbackWithResult;
        int i = 2 % 2;
        buildDebugModeStorageKey builddebugmodestoragekeyOnExtraCallback = homeDstLoanAccountFragment.onExtraCallback();
        if (builddebugmodestoragekeyOnExtraCallback != null && (homeDstView = builddebugmodestoragekeyOnExtraCallback.onExtraCallback) != null) {
            int i2 = onExtraCallback + 97;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                homeDstRecyclerViewOnExtraCallbackWithResult = homeDstView.onExtraCallbackWithResult();
                int i3 = 83 / 0;
                if (homeDstRecyclerViewOnExtraCallbackWithResult != null) {
                    RecyclerViewsKt.onWarmupCompleted(homeDstRecyclerViewOnExtraCallbackWithResult, 0);
                }
            } else {
                homeDstRecyclerViewOnExtraCallbackWithResult = homeDstView.onExtraCallbackWithResult();
                if (homeDstRecyclerViewOnExtraCallbackWithResult != null) {
                }
            }
        }
        HomeDstLoanAccountViewModel.IAuthTabCallback(homeDstLoanAccountFragment.mayLaunchUrl(), (String) null, getLogType.PULL_TO_REFRESH, (TinyAppLogUtil) null, 5, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 105;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void extraCommand() {
        int i = 2 % 2;
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = getIconPaddingLeft.IAuthTabCallback.onWarmupCompleted().onExtraCallback(setMinimumDpi.class).onWarmupCompleted(new HomeDstLoanAccountFragment$.ExternalSyntheticLambda2(new HomeDstLoanAccountFragment$.ExternalSyntheticLambda1(this))).onWarmupCompleted(new HomeDstLoanAccountFragment$.ExternalSyntheticLambda4(new HomeDstLoanAccountFragment$.ExternalSyntheticLambda3(this)), new HomeDstLoanAccountFragment$.ExternalSyntheticLambda6(new HomeDstLoanAccountFragment$.ExternalSyntheticLambda5()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
        autoDisposable(deserializeurinullablecollectionOnWarmupCompleted);
        int i2 = asBinder + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public void IAuthTabCallback(@NotNull fillData.asBinder.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (!Intrinsics.areEqual(iAuthTabCallback.onNavigationEvent(), "SOFT_DELETE_ASSET")) {
            super/*im.toss.features.home.core.ui.base.BaseHomeFragment*/.IAuthTabCallback(iAuthTabCallback);
            int i4 = asBinder + 35;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int i6 = asBinder + 123;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            mayLaunchUrl().onPostMessage();
            return;
        }
        mayLaunchUrl().onPostMessage();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback extends Lambda implements Function0<Fragment> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Fragment fragmentOnExtraCallback = onExtraCallback();
            int i4 = onNavigationEvent + 115;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return fragmentOnExtraCallback;
            }
            throw null;
        }

        public final Fragment onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 89;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Fragment fragment = this.$this_viewModels;
            int i5 = i2 + 121;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return fragment;
        }
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnWarmupCompleted = onWarmupCompleted();
            int i4 = onWarmupCompleted + 19;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnWarmupCompleted;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 onWarmupCompleted() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                androidTextContextMenuToolbarProviderExternalSyntheticLambda0 = (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
                int i3 = 5 / 0;
            } else {
                androidTextContextMenuToolbarProviderExternalSyntheticLambda0 = (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
            }
            int i4 = onWarmupCompleted + 29;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 70 / 0;
            }
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda0;
        }
    }

    public static final class IAuthTabCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult = onExtraCallbackWithResult();
            if (i3 != 0) {
                int i4 = 68 / 0;
            }
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallbackWithResult() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                int i2 = onNavigationEvent + 35;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 / 0;
                }
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                int i4 = onExtraCallbackWithResult + 11;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
                    int i5 = 91 / 0;
                } else {
                    textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
                }
            } else {
                textFieldKeyInputExternalSyntheticLambda6 = null;
            }
            return textFieldKeyInputExternalSyntheticLambda6 != null ? textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
        }
    }

    public static final class IAuthTabCallbackDefault extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(Fragment fragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallback = onExtraCallback();
            int i4 = onWarmupCompleted + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedOnExtraCallback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
        
            if (r1 != null) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        
            if (r1 != null) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            r2 = im.toss.features.home.ui.dst.view.account.loan.HomeDstLoanAccountFragment.IAuthTabCallbackDefault.onExtraCallback + 97;
            im.toss.features.home.ui.dst.view.account.loan.HomeDstLoanAccountFragment.IAuthTabCallbackDefault.onWarmupCompleted = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        
            if ((r2 % 2) == 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        
            r3.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        
            throw null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ViewModelProvider.onWarmupCompleted onExtraCallback() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory;
            int i = 2 % 2;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            Object obj = null;
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                int i2 = onExtraCallback + 123;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
                int i5 = i3 + 71;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            } else {
                textFieldKeyInputExternalSyntheticLambda6 = null;
            }
            if (textFieldKeyInputExternalSyntheticLambda6 != null) {
                int i7 = onExtraCallback + 101;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory();
                    int i8 = 8 / 0;
                } else {
                    defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory();
                }
            }
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
            return defaultViewModelProviderFactory2;
        }
    }

    public static final class onNavigationEvent extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback = onExtraCallback();
            int i4 = IAuthTabCallback + 79;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
            int i3 = onExtraCallback + 91;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return viewModelStore;
            }
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(HomeDstLoanAccountFragment homeDstLoanAccountFragment, setMinimumDpi setminimumdpi) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) IAuthTabCallback(2087083533, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{homeDstLoanAccountFragment, setminimumdpi}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -2087083530, iOnExtraCallback, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        IAuthTabCallback(-262191821, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{function1, obj}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 262191823, iOnExtraCallback, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }

    private static final boolean asInterface(Function1 function1, Object obj) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return ((Boolean) IAuthTabCallback(-1715152311, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{function1, obj}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1715152311, iOnExtraCallback, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback())).booleanValue();
    }

    private final void IAuthTabCallback(String str) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        IAuthTabCallback(-2010313557, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{this, str}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 2010313558, iOnExtraCallback, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }
}
