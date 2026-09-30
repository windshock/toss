package com.tnkfactory.ad;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ariver.engine.api.common.log.IgnoreLogUtils;
import com.google.android.exoplayer2.source.rtsp.RtspMessageUtil;
import com.tnkfactory.ad.TnkAdLayoutConfig;
import com.tnkfactory.ad.TnkAdListModel;
import com.tnkfactory.ad.TnkRwdFilter;
import com.tnkfactory.ad.a.b;
import com.tnkfactory.ad.a.c;
import com.tnkfactory.ad.a.d;
import com.tnkfactory.ad.a.e;
import com.tnkfactory.ad.a.f;
import com.tnkfactory.ad.a.h;
import com.tnkfactory.ad.a.i;
import com.tnkfactory.ad.basic.AdListEventDialog;
import com.tnkfactory.ad.basic.AdListPopupAdlist;
import com.tnkfactory.ad.basic.ITnkHeader;
import com.tnkfactory.ad.basic.TnkAdListBottomMarginItem;
import com.tnkfactory.ad.basic.TnkAdListCpsSearchEdt;
import com.tnkfactory.ad.basic.TnkAdListDummyHeader;
import com.tnkfactory.ad.basic.TnkAdListEmptyItem;
import com.tnkfactory.ad.basic.TnkAdListNoExist;
import com.tnkfactory.ad.basic.TnkAdListNoItem;
import com.tnkfactory.ad.basic.TnkAdListTermsErrorItem;
import com.tnkfactory.ad.basic.TnkBasicBannerItem;
import com.tnkfactory.ad.basic.TnkCurationHeader;
import com.tnkfactory.ad.basic.TnkListBannerItem;
import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.off.TnkDirection;
import com.tnkfactory.ad.off.TnkOffNavi;
import com.tnkfactory.ad.off.data.AdActionInfoVo;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.AdListVoKt;
import com.tnkfactory.ad.off.data.RecommendList;
import com.tnkfactory.ad.rwd.BannerItem;
import com.tnkfactory.ad.rwd.Resources;
import com.tnkfactory.ad.rwd.Settings;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.Utils;
import com.tnkfactory.ad.rwd.data.layout.TnkLayoutType;
import com.tnkfactory.ad.rwd.data.view.AdListCuration;
import com.tnkfactory.ad.style.DpUtil;
import com.tnkfactory.ad.style.ITnkOffAdCuration;
import com.tnkfactory.ad.style.ITnkOffAdItem;
import com.tnkfactory.ad.style.ITnkRwdHeader;
import com.tnkfactory.ad.style.ITnkRwdToolbar;
import com.tnkfactory.ad.style.StickyHeaderItemDecoration;
import com.xwray.groupie.GroupieAdapter;
import com.xwray.groupie.Item;
import com.xwray.groupie.Section;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import o.SwipeRefreshLayout;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextFieldSizeKtExternalSyntheticLambda2;
import o.clearRegisters;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdListViewImpl extends FrameLayout implements TextFieldScrollKtExternalSyntheticLambda0, AdEventListener, LifecycleEventObserver, AdListPopupAdlist.IPopupAdlistView {
    public long A;
    public final TnkAdListEmptyItem B;
    public final AdListViewImpl$requestAdItemHandler$1 C;
    public final TnkContext a;
    public final Lazy b;
    public final TextFieldSizeKtExternalSyntheticLambda2 c;
    public final Lazy d;
    public final TnkAdListModel e;
    public boolean f;
    public ViewGroup g;
    public final Lazy h;

    /* renamed from: i, reason: collision with root package name */
    public final GroupieAdapter f22i;
    public final Section j;
    public final Section k;
    public final Section l;
    public final Section m;
    public final Section n;

    /* renamed from: o, reason: collision with root package name */
    public ITnkRwdToolbar f23o;
    public View p;
    public ITnkRwdHeader q;
    public TnkBasicBannerItem r;
    public HashMap s;
    public ArrayList t;
    public HashMap u;
    public final ArrayList v;
    public final ArrayList w;
    public final ArrayList x;
    public boolean y;
    public final View.OnLayoutChangeListener z;

    public static final class UiCurationItem {
        public final AdListCuration a;
        public final List b;

        public UiCurationItem(@NotNull AdListCuration adListCuration, @NotNull List<? extends AdListVo> list) {
            Intrinsics.checkNotNullParameter(adListCuration, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.a = adListCuration;
            this.b = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiCurationItem copy$default(UiCurationItem uiCurationItem, AdListCuration adListCuration, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                adListCuration = uiCurationItem.a;
            }
            if ((i2 & 2) != 0) {
                list = uiCurationItem.b;
            }
            return uiCurationItem.copy(adListCuration, list);
        }

        public final AdListCuration component1() {
            return this.a;
        }

        public final List<AdListVo> component2() {
            return this.b;
        }

        public final UiCurationItem copy(@NotNull AdListCuration adListCuration, @NotNull List<? extends AdListVo> list) {
            Intrinsics.checkNotNullParameter(adListCuration, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new UiCurationItem(adListCuration, list);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiCurationItem)) {
                return false;
            }
            UiCurationItem uiCurationItem = (UiCurationItem) obj;
            return Intrinsics.areEqual(this.a, uiCurationItem.a) && Intrinsics.areEqual(this.b, uiCurationItem.b);
        }

        public final List<AdListVo> getArrAdItem() {
            return this.b;
        }

        public final AdListCuration getCuration() {
            return this.a;
        }

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            return "UiCurationItem(curation=" + this.a + ", arrAdItem=" + this.b + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r10v16, types: [com.tnkfactory.ad.AdListViewImpl$requestAdItemHandler$1] */
    public AdListViewImpl(@NotNull TnkContext tnkContext) {
        super(tnkContext.getActivity());
        Intrinsics.checkNotNullParameter(tnkContext, "");
        this.a = tnkContext;
        this.b = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: com.tnkfactory.ad.AdListViewImpl$$ExternalSyntheticLambda13
            public final Object invoke() {
                return AdListViewImpl.b(this.f$0);
            }
        });
        this.c = getLifecycleRegistry();
        this.d = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: com.tnkfactory.ad.AdListViewImpl$$ExternalSyntheticLambda14
            public final Object invoke() {
                return AdListViewImpl.a(this.f$0);
            }
        });
        this.e = new TnkAdListModel(tnkContext);
        this.f = true;
        this.h = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: com.tnkfactory.ad.AdListViewImpl$$ExternalSyntheticLambda15
            public final Object invoke() {
                return AdListViewImpl.e(this.f$0);
            }
        });
        this.f22i = new GroupieAdapter();
        this.j = new Section();
        this.k = new Section();
        this.l = new Section();
        this.m = new Section();
        this.n = new Section();
        this.s = new HashMap();
        this.t = new ArrayList();
        this.u = new HashMap();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.tnkfactory.ad.AdListViewImpl$$ExternalSyntheticLambda16
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                AdListViewImpl.a(this.f$0, view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.z = onLayoutChangeListener;
        long receiveAppId = Settings.INSTANCE.getReceiveAppId(tnkContext.getActivity());
        TnkAdConfig tnkAdConfig = TnkAdConfig.INSTANCE;
        int startCategory = tnkAdConfig.getHeaderConfig().getStartCategory();
        int startFilter = tnkAdConfig.getHeaderConfig().getStartFilter();
        int startFilterID = tnkAdConfig.getHeaderConfig().getStartFilterID();
        if (receiveAppId != 0 || startCategory != 0 || startFilter != 0 || startFilterID != 0) {
            setPopupAdVisible(true);
        }
        addOnLayoutChangeListener(onLayoutChangeListener);
        View viewInflate = getLayoutInflater().inflate(R.layout.com_tnk_offerwall_list_layout, (ViewGroup) this, false);
        Intrinsics.checkNotNull(viewInflate, "");
        this.g = (ViewGroup) viewInflate;
        View tvClose = getTvClose();
        if (tvClose != null) {
            tvClose.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.AdListViewImpl$$ExternalSyntheticLambda17
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdListViewImpl.a(this.f$0, view);
                }
            });
        }
        addView(this.g);
        getLifecycleRegistry().onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.INITIALIZED);
        if (isAttachedToWindow()) {
            getLayoutParams().width = -1;
            getLifecycleRegistry().onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED);
            b();
            getViewModel().fetchRecommendList();
        } else {
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.tnkfactory.ad.AdListViewImpl$special$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view) {
                    this.removeOnAttachStateChangeListener(this);
                    this.getLayoutParams().width = -1;
                    this.getLifecycleRegistry().onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED);
                    this.b();
                    this.getViewModel().fetchRecommendList();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view) {
                }
            });
        }
        if (isAttachedToWindow()) {
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.tnkfactory.ad.AdListViewImpl$special$$inlined$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view) {
                    this.removeOnAttachStateChangeListener(this);
                    this.a.getNavi().showLoading(false);
                    this.getLifecycleRegistry().onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED);
                }
            });
        } else {
            this.a.getNavi().showLoading(false);
            getLifecycleRegistry().onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED);
        }
        this.B = new TnkAdListEmptyItem(0, 1, null);
        final Looper mainLooper = Looper.getMainLooper();
        this.C = new Handler(mainLooper) { // from class: com.tnkfactory.ad.AdListViewImpl$requestAdItemHandler$1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                Intrinsics.checkNotNullParameter(message, "");
                super.handleMessage(message);
                this.a.showRequestAdItem();
            }
        };
    }

    public static final void a(DialogInterface dialogInterface, int i2) {
    }

    public static final TextFieldSizeKtExternalSyntheticLambda2 b(AdListViewImpl adListViewImpl) {
        return new TextFieldSizeKtExternalSyntheticLambda2(adListViewImpl);
    }

    public static final void c(AdListViewImpl adListViewImpl, View view) {
        int selectedFilterId;
        try {
            Object value = adListViewImpl.e.getRwdFilter().getFilterUiModel().getValue();
            Intrinsics.checkNotNull(value);
            selectedFilterId = ((TnkRwdFilter.FilterModel) value).getSelectedFilterId();
        } catch (Exception unused) {
            selectedFilterId = 0;
        }
        adListViewImpl.getAdClickProcessor().onCpsFilterClick(selectedFilterId);
    }

    public static final void d(AdListViewImpl adListViewImpl, View view) {
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(adListViewImpl), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new i(adListViewImpl, null), 2, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.tnkfactory.ad.AdListViewImpl$smoothScroller$2$1] */
    public static final AdListViewImpl$smoothScroller$2$1 e(AdListViewImpl adListViewImpl) {
        final Context context = adListViewImpl.getContext();
        return new LinearSmoothScroller(context) { // from class: com.tnkfactory.ad.AdListViewImpl$smoothScroller$2$1
            public final int getVerticalSnapPreference() {
                return -1;
            }
        };
    }

    private final RecyclerView getAdRecyclerView() {
        RecyclerView recyclerViewFindViewById = this.g.findViewById(R.id.com_tnk_off_layout_adlist);
        if (recyclerViewFindViewById instanceof RecyclerView) {
            return recyclerViewFindViewById;
        }
        return null;
    }

    private final View getBtnFilter() {
        View viewFindViewById = this.g.findViewById(R.id.com_tnk_off_ad_list_filter_button);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getBtnMoveToTop() {
        View viewFindViewById = this.g.findViewById(R.id.com_tnk_off_ad_list_top_button);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        return null;
    }

    private final LayoutInflater getLayoutInflater() {
        Object value = this.d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (LayoutInflater) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextFieldSizeKtExternalSyntheticLambda2 getLifecycleRegistry() {
        return (TextFieldSizeKtExternalSyntheticLambda2) this.b.getValue();
    }

    private final View getLlNetworkError() {
        View viewFindViewById = this.g.findViewById(R.id.com_tnk_off_list_network_error);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        return null;
    }

    private final ViewGroup getToolbarLayout() {
        View viewFindViewById = this.g.findViewById(R.id.id_header_content);
        if (viewFindViewById instanceof ViewGroup) {
            return (ViewGroup) viewFindViewById;
        }
        return null;
    }

    private final View getTvClose() {
        View viewFindViewById = this.g.findViewById(R.id.com_tnk_off_error_close);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        return null;
    }

    private final View getTvHeaderClose() {
        View viewFindViewById = this.g.findViewById(R.id.com_tnk_off_header_tv_close);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        return null;
    }

    private final View getVReload() {
        View viewFindViewById = this.g.findViewById(R.id.com_tnk_off_error_reload);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        return null;
    }

    public final void clearAndShowTermsLayout() {
        ViewGroup toolbarLayout = getToolbarLayout();
        if (toolbarLayout != null) {
            toolbarLayout.getParent();
        }
        ViewGroup toolbarLayout2 = getToolbarLayout();
        if (toolbarLayout2 != null) {
            toolbarLayout2.setVisibility(8);
        }
        View btnMoveToTop = getBtnMoveToTop();
        if (btnMoveToTop != null) {
            btnMoveToTop.setVisibility(8);
        }
        View btnFilter = getBtnFilter();
        if (btnFilter != null) {
            btnFilter.setVisibility(8);
        }
        this.j.clear();
        this.k.clear();
        this.l.clear();
        this.m.clear();
        this.n.clear();
        this.l.add(new TnkAdListTermsErrorItem(this.a));
    }

    public final List<ITnkOffAdItem> filterAdItem(@NotNull List<? extends AdListVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (AdListVo adListVo : list) {
            arrayList.add(ITnkOffAdItem.Companion.newInstance(this.a, TnkAdConfig.INSTANCE.getLayoutInfo(adListVo.getLayout_id() == 0 ? adListVo.getAdType() == 4 ? TnkLayoutType.INSTANCE.getAD_LIST_CPS_NORMAL() : adListVo.getFilterId() == 101 ? TnkLayoutType.INSTANCE.getAD_LIST_NEWS() : TnkLayoutType.INSTANCE.getAD_LIST_NORMAL() : adListVo.getLayout_id()).getViewClass(), adListVo));
        }
        ((ITnkOffAdItem) CollectionsKt.last(arrayList)).setDirection(TnkDirection.INSTANCE.getBOTTOM());
        return arrayList;
    }

    public final AdEventHandler getAdClickProcessor() {
        return this.a.getEventHandler();
    }

    public final ArrayList<ITnkOffAdItem> getAdList() {
        return this.v;
    }

    public final HashMap<Integer, TnkListBannerItem> getBannerList() {
        return this.s;
    }

    public final TnkBasicBannerItem getBannerTop() {
        return this.r;
    }

    public final HashMap<Integer, ITnkOffAdCuration> getCurationList() {
        return this.u;
    }

    public final ArrayList<ITnkOffAdCuration> getCurationTop() {
        return this.t;
    }

    public final GroupieAdapter getGroupieAdapter() {
        return this.f22i;
    }

    public TextFieldKeyInputExternalSyntheticLambda9 getLifecycle() {
        return this.c;
    }

    public final ArrayList<ITnkOffAdItem> getNewsList() {
        return this.w;
    }

    public final View.OnLayoutChangeListener getOnResizeListener() {
        return this.z;
    }

    public final long getPauseTime() {
        return this.A;
    }

    @Override // com.tnkfactory.ad.basic.AdListPopupAdlist.IPopupAdlistView
    public List<AdListVo> getPopupAdList() {
        return this.x;
    }

    public final ArrayList<AdListVo> getRecommendPopup() {
        return this.x;
    }

    public final Handler getRequestAdItemHandler() {
        return this.C;
    }

    public final ViewGroup getRoot() {
        return this.g;
    }

    public final Section getSAdItem() {
        return this.n;
    }

    public final Section getSBanner() {
        return this.k;
    }

    public final Section getSCpsSearch() {
        return this.l;
    }

    public final Section getSCuration() {
        return this.m;
    }

    public final Section getSHeader() {
        return this.j;
    }

    public final boolean getShowEvent() {
        return this.f;
    }

    public final boolean getShowJoinMultiItem() {
        return this.y;
    }

    public final LinearSmoothScroller getSmoothScroller() {
        return (LinearSmoothScroller) this.h.getValue();
    }

    public final TnkAdListEmptyItem getTnkAdListEmptyItem() {
        return this.B;
    }

    public final ITnkRwdHeader getTnkHeader() {
        return this.q;
    }

    public final ITnkRwdToolbar getTnkToolbar() {
        return this.f23o;
    }

    public final TnkAdListModel getViewModel() {
        return this.e;
    }

    public final View getViewTnkToolbar() {
        return this.p;
    }

    public final boolean isPopupAdVisible() {
        return Utils.getActivity(getContext()).getIntent().getBooleanExtra(TnkAdConfig.INSTANCE.getTNK_POPUP_DISABLE(), false);
    }

    public final void needSetAdId() {
        Utils.showAlert(getContext(), "알림", "광고ID 설정이 필요한 광고입니다.\n[설정] -> [개인정보 보호] -> [광고] -> [새 광고ID 받기]", "설정하기", new DialogInterface.OnClickListener() { // from class: com.tnkfactory.ad.AdListViewImpl$$ExternalSyntheticLambda18
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AdListViewImpl.a(this.f$0, dialogInterface, i2);
            }
        }, Resources.getResources().cancel, new DialogInterface.OnClickListener() { // from class: com.tnkfactory.ad.AdListViewImpl$$ExternalSyntheticLambda19
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AdListViewImpl.a(dialogInterface, i2);
            }
        });
    }

    @Override // com.tnkfactory.ad.off.AdEventListener
    public void onComplete(@NotNull AdListVo adListVo, boolean z) {
        Intrinsics.checkNotNullParameter(adListVo, "");
    }

    @Override // com.tnkfactory.ad.off.AdEventListener
    public void onError(@NotNull TnkError tnkError) {
        Intrinsics.checkNotNullParameter(tnkError, "");
        this.a.getNavi().showDialog(this.a.getActivity(), tnkError.getMessage(), new Function0() { // from class: com.tnkfactory.ad.AdListViewImpl$$ExternalSyntheticLambda12
            public final Object invoke() {
                return AdListViewImpl.a();
            }
        });
        TnkCore.INSTANCE.getOffRepository().getDataChanged().postValue(Boolean.TRUE);
    }

    public void onStateChanged(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @NotNull TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (onextracallbackwithresult == TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_DESTROY) {
            getLifecycleRegistry().onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.DESTROYED);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        Settings settings = Settings.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (settings.isAgreePrivacy(context)) {
            if (this.A == 0) {
                this.A = System.currentTimeMillis();
                return;
            }
            try {
                if (i2 == 8) {
                    this.A = System.currentTimeMillis();
                } else if (System.currentTimeMillis() - this.A > TnkAdConfig.INSTANCE.getUpdateTimeMin() * RtspMessageUtil.DEFAULT_RTSP_TIMEOUT_MS) {
                    maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new com.tnkfactory.ad.a.a(this, null), 2, (Object) null);
                } else {
                    updateItems();
                    ITnkRwdToolbar iTnkRwdToolbar = this.f23o;
                    if (iTnkRwdToolbar != null) {
                        iTnkRwdToolbar.onReceiveMessage();
                    }
                    ITnkRwdHeader iTnkRwdHeader = this.q;
                    if (iTnkRwdHeader != null) {
                        iTnkRwdHeader.onReceiveMessage();
                    }
                }
                this.A = System.currentTimeMillis();
            } catch (Exception unused) {
            }
        }
    }

    public final void setBannerList(@NotNull HashMap<Integer, TnkListBannerItem> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.s = map;
    }

    public final void setBannerTop(@Nullable TnkBasicBannerItem tnkBasicBannerItem) {
        this.r = tnkBasicBannerItem;
    }

    public final void setCurationList(@NotNull HashMap<Integer, ITnkOffAdCuration> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.u = map;
    }

    public final void setCurationTop(@NotNull ArrayList<ITnkOffAdCuration> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.t = arrayList;
    }

    public final void setPauseTime(long j) {
        this.A = j;
    }

    public final void setPopupAdVisible(boolean z) {
        Utils.getActivity(getContext()).getIntent().putExtra(TnkAdConfig.INSTANCE.getTNK_POPUP_DISABLE(), z);
    }

    public final void setRoot(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.g = viewGroup;
    }

    public final void setShowEvent(boolean z) {
        this.f = z;
    }

    public final void setShowJoinMultiItem(boolean z) {
        this.y = z;
    }

    public final void setTnkHeader(@Nullable ITnkRwdHeader iTnkRwdHeader) {
        this.q = iTnkRwdHeader;
    }

    public final void setTnkToolbar(@Nullable ITnkRwdToolbar iTnkRwdToolbar) {
        this.f23o = iTnkRwdToolbar;
    }

    public final void setViewTnkToolbar(@Nullable View view) {
        this.p = view;
    }

    public final void showRequestAdItem() {
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(getAdClickProcessor().getLifecycleOwner()), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new c(this, null), 2, (Object) null);
    }

    public final void updateItems() {
        int spanSize;
        Object next;
        String crt_title;
        Object next2;
        try {
            if (this.v.isEmpty()) {
                return;
            }
            Settings settings = Settings.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (!settings.isAgreePrivacy(context)) {
                clearAndShowTermsLayout();
                return;
            }
            sendEmptyMessage(0);
            ArrayList arrayList = this.v;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next3 = it.next();
                if (AdListVoKt.isRemoved(((ITnkOffAdItem) next3).getAdItem())) {
                    arrayList2.add(next3);
                }
            }
            this.v.removeAll(arrayList2);
            if (this.v.size() <= 0) {
                TnkRwdFilter rwdFilter = this.e.getRwdFilter();
                Object value = rwdFilter.getFilterUiModel().getValue();
                Intrinsics.checkNotNull(value);
                rwdFilter.changeFilter(((TnkRwdFilter.FilterModel) value).getSelectedFilterId());
                Unit unit = Unit.INSTANCE;
            }
            ArrayList arrayList3 = new ArrayList();
            TnkBasicBannerItem tnkBasicBannerItem = this.r;
            if (tnkBasicBannerItem == null || !tnkBasicBannerItem.update(this.e.get_adList())) {
                this.k.clear();
                Unit unit2 = Unit.INSTANCE;
            } else {
                TnkBasicBannerItem tnkBasicBannerItem2 = this.r;
                Intrinsics.checkNotNull(tnkBasicBannerItem2);
                arrayList3.add(tnkBasicBannerItem2);
            }
            this.k.update(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = this.t.iterator();
            while (it2.hasNext()) {
                List<AdListVo> arrAdItem = ((ITnkOffAdCuration) it2.next()).getArrAdItem();
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrAdItem, 10));
                Iterator<T> it3 = arrAdItem.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(Long.valueOf(((AdListVo) it3.next()).getAppId()));
                }
                arrayList4.addAll(arrayList5);
            }
            Iterator it4 = this.u.entrySet().iterator();
            while (it4.hasNext()) {
                List<AdListVo> arrAdItem2 = ((ITnkOffAdCuration) ((Map.Entry) it4.next()).getValue()).getArrAdItem();
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrAdItem2, 10));
                Iterator<T> it5 = arrAdItem2.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(Long.valueOf(((AdListVo) it5.next()).getAppId()));
                }
                arrayList4.addAll(arrayList6);
            }
            ArrayList arrayList7 = this.v;
            ArrayList arrayList8 = new ArrayList();
            Iterator it6 = arrayList7.iterator();
            while (it6.hasNext()) {
                Object next4 = it6.next();
                if (!arrayList4.contains(Long.valueOf(((ITnkOffAdItem) next4).getAdItem().getAppId()))) {
                    arrayList8.add(next4);
                }
            }
            int size = arrayList8.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ITnkOffAdItem) arrayList8.get(i2)).setPosition(i2);
            }
            if (!isPopupAdVisible()) {
                ArrayList arrayList9 = this.x;
                ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                Iterator it7 = arrayList9.iterator();
                while (it7.hasNext()) {
                    arrayList10.add(String.valueOf(((AdListVo) it7.next()).getAppId()));
                }
                ArrayList<String> arrayList11 = new ArrayList<>(arrayList10);
                setPopupAdVisible(true);
                if (!arrayList11.isEmpty()) {
                    Settings settings2 = Settings.INSTANCE;
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    if (settings2.isAdRecommendPopupDisableToday(context2)) {
                        AdListPopupAdlist.Companion.newInstance(arrayList11).show(this.a.getActivity().getSupportFragmentManager(), "AdListPopupAdlist");
                    }
                }
                if (this.f) {
                    Settings settings3 = Settings.INSTANCE;
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    if (settings3.getEventDisableTime(context3) != Calendar.getInstance().get(6)) {
                        this.f = false;
                        if (!TextUtils.isEmpty(this.e.getPubInfo().getEimg_url())) {
                            try {
                                AdListEventDialog.Companion.newInstance(this.e.getPubInfo().getEimg_url(), this.e.getPubInfo().getEclck_url()).show(this.a.getActivity().getSupportFragmentManager(), IgnoreLogUtils.TYPE_EVENT);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            ArrayList arrayList12 = new ArrayList();
            ArrayList arrayList13 = new ArrayList();
            if (this.y) {
                ArrayList<AdListVo> arrayList14 = this.e.get_adList();
                ArrayList arrayList15 = new ArrayList();
                for (Object obj : arrayList14) {
                    AdListVo adListVo = (AdListVo) obj;
                    Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    if (AdListVoKt.isCorrectItem(adListVo, context4) && adListVo.getMultiYn()) {
                        arrayList15.add(obj);
                    }
                }
                ArrayList arrayList16 = new ArrayList();
                Iterator it8 = arrayList15.iterator();
                while (it8.hasNext()) {
                    Object next5 = it8.next();
                    AdListVo adListVo2 = (AdListVo) next5;
                    if (!adListVo2.getMulti_join_yn()) {
                        Iterator<T> it9 = adListVo2.getCampaignItems().iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                next2 = it9.next();
                                if (((AdActionInfoVo) next2).getPayYn()) {
                                    break;
                                }
                            } else {
                                next2 = null;
                                break;
                            }
                        }
                        if (next2 != null) {
                        }
                    }
                    arrayList16.add(next5);
                }
                if (!arrayList16.isEmpty()) {
                    Iterator it10 = this.t.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            next = it10.next();
                            if (((ITnkOffAdCuration) next).getCuration().getCrt_type() == 9) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    ITnkOffAdCuration iTnkOffAdCuration = (ITnkOffAdCuration) next;
                    AdListCuration curation = iTnkOffAdCuration != null ? iTnkOffAdCuration.getCuration() : null;
                    int crt_id = curation != null ? curation.getCrt_id() : 0;
                    if (curation == null || (crt_title = curation.getCrt_title()) == null) {
                        crt_title = "참여 중인 미션을 이어서 완료해보세요!";
                    }
                    String str = crt_title;
                    int pos_type = curation != null ? curation.getPos_type() : 0;
                    int ord_no = curation != null ? curation.getOrd_no() : 0;
                    TnkLayoutType tnkLayoutType = TnkLayoutType.INSTANCE;
                    int ad_list_multi = tnkLayoutType.getAD_LIST_MULTI();
                    TnkAdLayoutConfig.TnkAdListLayout layoutInfo = TnkAdConfig.INSTANCE.getLayoutInfo(tnkLayoutType.getAD_LIST_MULTI());
                    ArrayList arrayList17 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList16, 10));
                    Iterator it11 = arrayList16.iterator();
                    while (it11.hasNext()) {
                        arrayList17.add(Long.valueOf(((AdListVo) it11.next()).getAppId()));
                    }
                    AdListCuration adListCuration = new AdListCuration(crt_id, 9, str, null, pos_type, ord_no, ad_list_multi, layoutInfo, arrayList17);
                    Section section = (Section) clearRegisters.onNavigationEvent(TnkAdConfig.INSTANCE.getLayoutInfo(TnkLayoutType.INSTANCE.getAD_LIST_MULTI()).getViewLayout()).newInstance();
                    Intrinsics.checkNotNull(section, "");
                    ITnkOffAdCuration iTnkOffAdCuration2 = (ITnkOffAdCuration) section;
                    TnkContext tnkContext = this.a;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList18 = new ArrayList();
                    Iterator it12 = arrayList16.iterator();
                    while (it12.hasNext()) {
                        Object next6 = it12.next();
                        if (hashSet.add(Long.valueOf(((AdListVo) next6).getAppId()))) {
                            arrayList18.add(next6);
                        }
                    }
                    iTnkOffAdCuration2.onCreateCuration(tnkContext, adListCuration, arrayList18);
                    arrayList13.add(section);
                }
            }
            for (ITnkOffAdCuration iTnkOffAdCuration3 : this.t) {
                if (iTnkOffAdCuration3.onUpdate()) {
                    arrayList13.add(iTnkOffAdCuration3);
                }
            }
            if (arrayList13.size() > 0 && !arrayList13.contains(this.B)) {
                arrayList13.add(this.B);
            }
            this.m.update(arrayList13);
            int size2 = arrayList8.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((ITnkOffAdItem) arrayList8.get(i3)).setPosition(i3);
            }
            try {
                spanSize = 12 / ((ITnkOffAdItem) arrayList8.get(0)).getSpanSize(12, 0);
            } catch (Exception unused2) {
                spanSize = 0;
            }
            arrayList12.addAll(arrayList8);
            int i4 = 0;
            for (Map.Entry entry : this.s.entrySet()) {
                if (((TnkListBannerItem) entry.getValue()).onUpdate()) {
                    try {
                        arrayList12.add((((Number) entry.getKey()).intValue() * spanSize) + i4, entry.getValue());
                    } catch (Exception unused3) {
                        arrayList12.add(entry.getValue());
                    }
                    i4++;
                }
            }
            for (Map.Entry entry2 : this.u.entrySet()) {
                if (((ITnkOffAdCuration) entry2.getValue()).onUpdate()) {
                    try {
                        arrayList12.add((((Number) entry2.getKey()).intValue() * spanSize) + i4, entry2.getValue());
                    } catch (Exception unused4) {
                        arrayList12.add(entry2.getValue());
                    }
                }
            }
            this.n.update(arrayList12);
            if (arrayList12.size() > 1) {
                int size3 = arrayList12.size();
                for (int i5 = 1; i5 < size3; i5++) {
                    try {
                        Object obj2 = arrayList12.get(i5 - 1);
                        Intrinsics.checkNotNullExpressionValue(obj2, "");
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) obj2;
                        if (swipeRefreshLayout instanceof ITnkOffAdItem) {
                            if (arrayList12.get(i5) instanceof ITnkOffAdItem) {
                                ((ITnkOffAdItem) swipeRefreshLayout).setDirection(((ITnkOffAdItem) swipeRefreshLayout).getDirection() & (~TnkDirection.INSTANCE.getBOTTOM()));
                            } else {
                                ((ITnkOffAdItem) swipeRefreshLayout).setDirection(((ITnkOffAdItem) swipeRefreshLayout).getDirection() | TnkDirection.INSTANCE.getBOTTOM());
                            }
                        }
                    } catch (Exception unused5) {
                    }
                }
                this.n.add(new TnkAdListBottomMarginItem());
            }
            TnkSession tnkSession = TnkSession.INSTANCE;
            if (tnkSession.getHeaderStickyHeightFoldedHeight() > 0) {
                RecyclerView adRecyclerView = getAdRecyclerView();
                RecyclerView.LayoutManager layoutManager = adRecyclerView != null ? adRecyclerView.getLayoutManager() : null;
                GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                if (gridLayoutManager != null) {
                    gridLayoutManager.scrollToPositionWithOffset(1, tnkSession.getHeaderStickyHeightFoldedHeight());
                    Unit unit3 = Unit.INSTANCE;
                }
                tnkSession.setHeaderStickyHeightFoldedHeight(0);
            }
            this.f22i.notifyDataSetChanged();
        } catch (Exception unused6) {
        }
    }

    public final void viewInit() {
        Class clsOnNavigationEvent;
        ITnkRwdHeader iTnkRwdHeader;
        RecyclerView adRecyclerView = getAdRecyclerView();
        if (adRecyclerView != null) {
            adRecyclerView.setAdapter(this.f22i);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(adRecyclerView.getContext(), 12, 1, false);
            this.f22i.setSpanCount(12);
            gridLayoutManager.IAuthTabCallback(this.f22i.getSpanSizeLookup());
            adRecyclerView.addItemDecoration(new StickyHeaderItemDecoration(new StickyHeaderItemDecoration.SectionCallback() { // from class: com.tnkfactory.ad.AdListViewImpl$viewInit$1$1$1
                @Override // com.tnkfactory.ad.style.StickyHeaderItemDecoration.SectionCallback
                public void onScrolledOffset(int i2) {
                    try {
                        this.a.a.getOnAdListScroll().invoke(Integer.valueOf(i2));
                        if (this.a.getSHeader().getItemCount() <= 0 || !(this.a.getSHeader().getItem(0) instanceof TnkAdListDummyHeader)) {
                            return;
                        }
                        Item item = this.a.getSHeader().getItem(0);
                        Intrinsics.checkNotNull(item, "");
                        ((TnkAdListDummyHeader) item).setDummyHeight(TnkSession.INSTANCE.getHeaderStickyHeight());
                    } catch (Exception unused) {
                    }
                }
            }));
            this.f22i.add(this.j);
            this.f22i.add(this.k);
            this.f22i.add(this.l);
            this.f22i.add(this.m);
            this.f22i.add(this.n);
            adRecyclerView.setLayoutManager(gridLayoutManager);
            MutableLiveData<Boolean> updateSelf = this.e.getUpdateSelf();
            Intrinsics.checkNotNull(updateSelf, "");
            updateSelf.observe(this, new b(new Function1() { // from class: com.tnkfactory.ad.AdListViewImpl$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return AdListViewImpl.a(this.f$0, (Boolean) obj);
                }
            }));
        }
        View btnMoveToTop = getBtnMoveToTop();
        if (btnMoveToTop != null) {
            btnMoveToTop.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.AdListViewImpl$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdListViewImpl.b(this.f$0, view);
                }
            });
        }
        View btnFilter = getBtnFilter();
        if (btnFilter != null) {
            btnFilter.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.AdListViewImpl$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdListViewImpl.c(this.f$0, view);
                }
            });
        }
        this.e.get_isLoading().observe(this, new b(new Function1() { // from class: com.tnkfactory.ad.AdListViewImpl$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return AdListViewImpl.b(this.f$0, (Boolean) obj);
            }
        }));
        this.e.getUiModel().observe(this, new b(new Function1() { // from class: com.tnkfactory.ad.AdListViewImpl$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return AdListViewImpl.a(this.f$0, (TnkAdListModel.ListUiModel) obj);
            }
        }));
        this.e.get_adList();
        this.n.clear();
        View viewOnCreateView = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new h(this, null), 2, (Object) null);
        if (getToolbarLayout() != null) {
            this.f23o = TnkAdConfig.INSTANCE.getLayoutConfig().getToolbar();
            ViewGroup toolbarLayout = getToolbarLayout();
            if (toolbarLayout != null) {
                toolbarLayout.removeAllViews();
            }
            ITnkRwdToolbar iTnkRwdToolbar = this.f23o;
            if (iTnkRwdToolbar != null) {
                FragmentActivity activity = this.a.getActivity();
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.a.getActivity());
                Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "");
                ViewGroup toolbarLayout2 = getToolbarLayout();
                Intrinsics.checkNotNull(toolbarLayout2);
                viewOnCreateView = iTnkRwdToolbar.onCreateView(activity, layoutInflaterFrom, toolbarLayout2, this.e);
            }
            this.p = viewOnCreateView;
        }
        KClass<? extends ITnkRwdHeader> adListHeader = TnkAdConfig.INSTANCE.getLayoutConfig().getAdListHeader();
        if (adListHeader != null && (clsOnNavigationEvent = clearRegisters.onNavigationEvent(adListHeader)) != null && (iTnkRwdHeader = (ITnkRwdHeader) clsOnNavigationEvent.newInstance()) != null) {
            iTnkRwdHeader.onCreateViewHolder(this.e);
            this.q = iTnkRwdHeader;
            this.j.clear();
            this.j.add(iTnkRwdHeader);
        }
        View vReload = getVReload();
        if (vReload != null) {
            vReload.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.AdListViewImpl$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdListViewImpl.d(this.f$0, view);
                }
            });
        }
        this.e.get_isNeedAdidSetting().observe(this, new b(new Function1() { // from class: com.tnkfactory.ad.AdListViewImpl$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return AdListViewImpl.c(this.f$0, (Boolean) obj);
            }
        }));
    }

    public static final LayoutInflater a(AdListViewImpl adListViewImpl) {
        return LayoutInflater.from(adListViewImpl.a.getActivity());
    }

    public static final void b(AdListViewImpl adListViewImpl, View view) {
        RecyclerView adRecyclerView = adListViewImpl.getAdRecyclerView();
        if (adRecyclerView != null) {
            adRecyclerView.scrollToPosition(0);
        }
    }

    public static final Unit d(AdListViewImpl adListViewImpl) {
        adListViewImpl.viewInit();
        return Unit.INSTANCE;
    }

    public static final void a(AdListViewImpl adListViewImpl, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        TnkSession tnkSession = TnkSession.INSTANCE;
        if (tnkSession.getWindowSize() != adListViewImpl.getWidth()) {
            tnkSession.setWindowSize(adListViewImpl.getWidth());
        }
    }

    public static final Unit b(AdListViewImpl adListViewImpl, Boolean bool) {
        TnkOffNavi navi = adListViewImpl.a.getNavi();
        Intrinsics.checkNotNull(bool);
        navi.showLoading(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final void a(AdListViewImpl adListViewImpl, View view) {
        adListViewImpl.a.getNavi().closeOfferwall();
    }

    public static final Unit b(AdListViewImpl adListViewImpl, BannerItem bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(adListViewImpl), putChannelInfo.onExtraCallback(), (setRandomHost) null, new e(adListViewImpl, bannerItem, null), 2, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public static final Unit a(AdListViewImpl adListViewImpl, Boolean bool) {
        if (bool.booleanValue()) {
            ITnkRwdToolbar iTnkRwdToolbar = adListViewImpl.f23o;
            ITnkHeader iTnkHeader = iTnkRwdToolbar instanceof ITnkHeader ? (ITnkHeader) iTnkRwdToolbar : null;
            if (iTnkHeader != null) {
                iTnkHeader.setJoinItem((ArrayList) adListViewImpl.e.getMultiJoinItems().getValue(), adListViewImpl.e.getPubInfo().getPnt_unit());
            }
            SwipeRefreshLayout swipeRefreshLayout = adListViewImpl.q;
            ITnkHeader iTnkHeader2 = swipeRefreshLayout instanceof ITnkHeader ? (ITnkHeader) swipeRefreshLayout : null;
            if (iTnkHeader2 != null) {
                iTnkHeader2.setJoinItem((ArrayList) adListViewImpl.e.getMultiJoinItems().getValue(), adListViewImpl.e.getPubInfo().getPnt_unit());
            }
            adListViewImpl.updateItems();
        }
        return Unit.INSTANCE;
    }

    public static final Unit c(AdListViewImpl adListViewImpl, BannerItem bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(adListViewImpl), putChannelInfo.onExtraCallback(), (setRandomHost) null, new f(adListViewImpl, bannerItem, null), 2, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit c(AdListViewImpl adListViewImpl, Boolean bool) {
        if (bool.booleanValue()) {
            adListViewImpl.needSetAdId();
        }
        return Unit.INSTANCE;
    }

    public final void b() {
        if (!TnkAdConfig.INSTANCE.getUseTermsPopup()) {
            Settings settings = Settings.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            settings.setAgreePrivacy(context, true);
        }
        Settings settings2 = Settings.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        if (settings2.isAgreePrivacy(context2)) {
            viewInit();
        } else {
            this.a.getNavi().showTerms(1, new Function0() { // from class: com.tnkfactory.ad.AdListViewImpl$$ExternalSyntheticLambda10
                public final Object invoke() {
                    return AdListViewImpl.c(this.f$0);
                }
            }, new Function0() { // from class: com.tnkfactory.ad.AdListViewImpl$$ExternalSyntheticLambda11
                public final Object invoke() {
                    return AdListViewImpl.d(this.f$0);
                }
            });
        }
    }

    public static final Unit c(AdListViewImpl adListViewImpl) {
        adListViewImpl.viewInit();
        return Unit.INSTANCE;
    }

    public static final Unit a(final AdListViewImpl adListViewImpl, TnkAdListModel.ListUiModel listUiModel) throws IllegalAccessException, InstantiationException {
        List<AdListVo> arrayList;
        boolean z = false;
        RecyclerView adRecyclerView = adListViewImpl.getAdRecyclerView();
        if (adRecyclerView != null) {
            adRecyclerView.scrollToPosition(0);
        }
        TnkCore tnkCore = TnkCore.INSTANCE;
        if (tnkCore.getOffRepository().getAdList().isEmpty()) {
            adListViewImpl.a.getNavi().showLoading(false);
            View llNetworkError = adListViewImpl.getLlNetworkError();
            if (llNetworkError != null) {
                llNetworkError.setVisibility(0);
            }
            if (TextUtils.isEmpty(tnkCore.getSessionInfo().getInstallMarket())) {
                Toast.makeText(adListViewImpl.getContext(), "테스트 단말기 등록을 확인 해주세요", 0).show();
            }
            return Unit.INSTANCE;
        }
        View llNetworkError2 = adListViewImpl.getLlNetworkError();
        if (llNetworkError2 != null) {
            llNetworkError2.setVisibility(8);
        }
        if (listUiModel.getFilter() == null) {
            return Unit.INSTANCE;
        }
        RecommendList recommendList = listUiModel.getRecommendList();
        if (recommendList != null) {
            ArrayList arrayList2 = adListViewImpl.x;
            ArrayList<AdListVo> pop_list = recommendList.getPop_list();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : pop_list) {
                Context context = adListViewImpl.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                if (AdListVoKt.isCorrectItem((AdListVo) obj, context)) {
                    arrayList3.add(obj);
                }
            }
            arrayList2.addAll(arrayList3);
        }
        adListViewImpl.a.getNavi().showLoading(false);
        ITnkRwdToolbar iTnkRwdToolbar = adListViewImpl.f23o;
        if (iTnkRwdToolbar != null) {
            iTnkRwdToolbar.onChangeFilter(adListViewImpl.e.getRwdFilter());
        }
        ITnkRwdHeader iTnkRwdHeader = adListViewImpl.q;
        if (iTnkRwdHeader != null) {
            iTnkRwdHeader.onChangeFilter(adListViewImpl.e.getRwdFilter());
        }
        adListViewImpl.k.clear();
        adListViewImpl.m.clear();
        adListViewImpl.n.clear();
        adListViewImpl.l.clear();
        adListViewImpl.v.clear();
        adListViewImpl.s.clear();
        adListViewImpl.t.clear();
        adListViewImpl.u.clear();
        if (listUiModel.getFilter().getSelectedFilterId() == 190) {
            adListViewImpl.updateItems();
            return Unit.INSTANCE;
        }
        Settings settings = Settings.INSTANCE;
        Context context2 = adListViewImpl.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        final boolean zIsAgreePrivacy = settings.isAgreePrivacy(context2);
        final boolean zIsCps = listUiModel.getFilter().isCps();
        final int topScrollButtonConfig = TnkAdConfig.INSTANCE.getTopScrollButtonConfig();
        if (zIsCps && zIsAgreePrivacy) {
            View btnFilter = adListViewImpl.getBtnFilter();
            if (btnFilter != null) {
                btnFilter.setVisibility(0);
            }
        } else {
            View btnFilter2 = adListViewImpl.getBtnFilter();
            if (btnFilter2 != null) {
                btnFilter2.setVisibility(8);
            }
        }
        if (!zIsAgreePrivacy) {
            View btnMoveToTop = adListViewImpl.getBtnMoveToTop();
            if (btnMoveToTop != null) {
                btnMoveToTop.setVisibility(8);
            }
        } else if (topScrollButtonConfig == 1) {
            View btnMoveToTop2 = adListViewImpl.getBtnMoveToTop();
            if (btnMoveToTop2 != null) {
                btnMoveToTop2.setVisibility(8);
            }
        } else if (topScrollButtonConfig == 2) {
            View btnMoveToTop3 = adListViewImpl.getBtnMoveToTop();
            if (btnMoveToTop3 != null) {
                btnMoveToTop3.setVisibility(zIsCps ? 0 : 8);
            }
        } else if (topScrollButtonConfig != 3) {
            View btnMoveToTop4 = adListViewImpl.getBtnMoveToTop();
            if (btnMoveToTop4 != null) {
                btnMoveToTop4.setVisibility(8);
            }
        } else {
            View btnMoveToTop5 = adListViewImpl.getBtnMoveToTop();
            if (btnMoveToTop5 != null) {
                btnMoveToTop5.setVisibility(zIsCps ? 0 : 8);
            }
        }
        RecyclerView adRecyclerView2 = adListViewImpl.getAdRecyclerView();
        if (adRecyclerView2 != null) {
            adRecyclerView2.clearOnScrollListeners();
        }
        RecyclerView adRecyclerView3 = adListViewImpl.getAdRecyclerView();
        if (adRecyclerView3 != null) {
            adRecyclerView3.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.tnkfactory.ad.AdListViewImpl$viewInit$5$2
                public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                    Intrinsics.checkNotNullParameter(recyclerView, "");
                    super.onScrolled(recyclerView, i2, i3);
                    if (!zIsAgreePrivacy || zIsCps) {
                        return;
                    }
                    int i4 = topScrollButtonConfig;
                    if (i4 == 1 || i4 == 3) {
                        if (recyclerView.computeVerticalScrollOffset() > DpUtil.INSTANCE.dpToPx(100.0f)) {
                            View btnMoveToTop6 = adListViewImpl.getBtnMoveToTop();
                            if (btnMoveToTop6 != null) {
                                btnMoveToTop6.setVisibility(0);
                                return;
                            }
                            return;
                        }
                        View btnMoveToTop7 = adListViewImpl.getBtnMoveToTop();
                        if (btnMoveToTop7 != null) {
                            btnMoveToTop7.setVisibility(8);
                        }
                    }
                }
            });
        }
        if (zIsAgreePrivacy && zIsCps && listUiModel.getFilter().getSelectedFilterId() == 0) {
            adListViewImpl.l.add(new TnkAdListCpsSearchEdt(adListViewImpl.a));
        }
        if (!listUiModel.getFilter().isCps() && listUiModel.getFilter().getSelectedFilterId() == 0) {
            z = true;
        }
        adListViewImpl.y = z;
        if (listUiModel.getAdList().isEmpty()) {
            try {
                arrayList = adListViewImpl.e.getPopular();
            } catch (Exception unused) {
                arrayList = new ArrayList<>();
            }
            if (arrayList.isEmpty()) {
                adListViewImpl.n.add(new TnkAdListNoExist(listUiModel.getFilter().isCps() ? 1 : 0));
                return Unit.INSTANCE;
            }
            ArrayList arrayList4 = new ArrayList();
            if (listUiModel.getBannerTop() != null && !listUiModel.getBannerTop().isEmpty()) {
                TnkBasicBannerItem tnkBasicBannerItem = new TnkBasicBannerItem(listUiModel.getBannerTop(), new Function1() { // from class: com.tnkfactory.ad.AdListViewImpl$$ExternalSyntheticLambda7
                    public final Object invoke(Object obj2) {
                        return AdListViewImpl.a(this.f$0, (BannerItem) obj2);
                    }
                });
                adListViewImpl.r = tnkBasicBannerItem;
                if (tnkBasicBannerItem.update(adListViewImpl.e.get_adList())) {
                    TnkBasicBannerItem tnkBasicBannerItem2 = adListViewImpl.r;
                    Intrinsics.checkNotNull(tnkBasicBannerItem2);
                    arrayList4.add(tnkBasicBannerItem2);
                } else {
                    adListViewImpl.k.clear();
                }
                adListViewImpl.k.update(arrayList4);
            }
            adListViewImpl.n.add(new TnkAdListNoItem("참여할 수 있는 미션을\n준비 중이에요!"));
            adListViewImpl.n.add(new TnkCurationHeader("대신 이 미션은 어떠세요?"));
            adListViewImpl.n.addAll(adListViewImpl.filterAdItem(arrayList));
            return Unit.INSTANCE;
        }
        if (listUiModel.getBannerTop() != null && !listUiModel.getBannerTop().isEmpty()) {
            adListViewImpl.r = new TnkBasicBannerItem(listUiModel.getBannerTop(), new Function1() { // from class: com.tnkfactory.ad.AdListViewImpl$$ExternalSyntheticLambda8
                public final Object invoke(Object obj2) {
                    return AdListViewImpl.b(this.f$0, (BannerItem) obj2);
                }
            });
        } else {
            adListViewImpl.r = null;
        }
        Map<Integer, List<BannerItem>> bannerList = listUiModel.getBannerList();
        if (bannerList != null) {
            for (Map.Entry<Integer, List<BannerItem>> entry : bannerList.entrySet()) {
                TnkListBannerItem tnkListBannerItem = new TnkListBannerItem(entry.getValue(), adListViewImpl.e, adListViewImpl.a, new Function1() { // from class: com.tnkfactory.ad.AdListViewImpl$$ExternalSyntheticLambda9
                    public final Object invoke(Object obj2) {
                        return AdListViewImpl.c(this.f$0, (BannerItem) obj2);
                    }
                });
                if (entry.getKey().intValue() <= 0) {
                    adListViewImpl.s.put(0, tnkListBannerItem);
                } else {
                    adListViewImpl.s.put(Integer.valueOf(entry.getKey().intValue() - 1), tnkListBannerItem);
                }
            }
        }
        List<UiCurationItem> curation = listUiModel.getCuration();
        if (curation != null) {
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(curation, 10));
            for (UiCurationItem uiCurationItem : curation) {
                Object objNewInstance = clearRegisters.onNavigationEvent(uiCurationItem.getCuration().getLayoutInfo().getViewLayout()).newInstance();
                Intrinsics.checkNotNull(objNewInstance, "");
                ITnkOffAdCuration iTnkOffAdCuration = (ITnkOffAdCuration) objNewInstance;
                iTnkOffAdCuration.onCreateCuration(adListViewImpl.a, uiCurationItem.getCuration(), uiCurationItem.getArrAdItem());
                arrayList5.add(iTnkOffAdCuration);
            }
            adListViewImpl.t.addAll(arrayList5);
        }
        List<UiCurationItem> curationList = listUiModel.getCurationList();
        if (curationList != null) {
            for (UiCurationItem uiCurationItem2 : curationList) {
                Object objNewInstance2 = clearRegisters.onNavigationEvent(uiCurationItem2.getCuration().getLayoutInfo().getViewLayout()).newInstance();
                Intrinsics.checkNotNull(objNewInstance2, "");
                ITnkOffAdCuration iTnkOffAdCuration2 = (ITnkOffAdCuration) objNewInstance2;
                iTnkOffAdCuration2.onCreateCuration(adListViewImpl.a, uiCurationItem2.getCuration(), uiCurationItem2.getArrAdItem());
                if (uiCurationItem2.getCuration().getOrd_no() <= 0) {
                    adListViewImpl.u.put(0, iTnkOffAdCuration2);
                } else {
                    adListViewImpl.u.put(Integer.valueOf(uiCurationItem2.getCuration().getOrd_no() - 1), iTnkOffAdCuration2);
                }
            }
        }
        adListViewImpl.v.addAll(adListViewImpl.filterAdItem(listUiModel.getAdList()));
        adListViewImpl.updateItems();
        return Unit.INSTANCE;
    }

    public static final Unit a(AdListViewImpl adListViewImpl, BannerItem bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(adListViewImpl), putChannelInfo.onExtraCallback(), (setRandomHost) null, new d(adListViewImpl, bannerItem, null), 2, (Object) null);
        return Unit.INSTANCE;
    }

    public static final void a(AdListViewImpl adListViewImpl, DialogInterface dialogInterface, int i2) {
        adListViewImpl.getContext().startActivity(new Intent("android.settings.SETTINGS"));
    }
}
