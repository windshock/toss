package com.tnkfactory.ad.basic;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdAnalytics;
import com.tnkfactory.ad.TnkAdConfig;
import com.tnkfactory.ad.TnkContext;
import com.tnkfactory.ad.b.a0;
import com.tnkfactory.ad.b.b0;
import com.tnkfactory.ad.b.c0;
import com.tnkfactory.ad.basic.TnkCpsSearchResultHeader;
import com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.CpsFavoriteKeywardVo;
import com.tnkfactory.ad.rwd.Settings;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.data.layout.TnkLayoutType;
import com.tnkfactory.ad.rwd.data.view.AdListCuration;
import com.tnkfactory.ad.style.DpUtil;
import com.tnkfactory.ad.style.ITnkOffAdItem;
import com.xwray.groupie.GroupieAdapter;
import com.xwray.groupie.Item;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextFieldSizeKtExternalSyntheticLambda2;
import o.clearRegisters;
import o.getCodeNameBytes;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setColorSchemeColors;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkCpsSearchWithFilterDialog extends Dialog implements TextFieldScrollKtExternalSyntheticLambda0 {
    public final Lazy a;
    public final TextFieldSizeKtExternalSyntheticLambda2 b;
    public final FragmentActivity c;
    public final TnkContext d;
    public final ArrayList e;
    public final GroupieAdapter f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public String f35i;
    public final GroupieAdapter j;
    public final GroupieAdapter k;
    public final TnkCpsSearchResultHeader l;
    public final TnkAdListEmptyItem m;
    public final ArrayList n;

    public final class CpsRecentKeywordEmptyItem extends Item<setColorSchemeColors> {
        public CpsRecentKeywordEmptyItem(TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog) {
        }

        @Override // com.xwray.groupie.Item
        public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
            Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        }

        @Override // com.xwray.groupie.Item
        public int getLayout() {
            return R.layout.com_tnk_offerwall_cps_search_keyword_empty;
        }
    }

    public final class FavoriteKeywordHolder extends Item<setColorSchemeColors> {
        public final CpsFavoriteKeywardVo a;
        public final /* synthetic */ TnkCpsSearchWithFilterDialog b;

        public FavoriteKeywordHolder(@NotNull TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog, CpsFavoriteKeywardVo cpsFavoriteKeywardVo) {
            Intrinsics.checkNotNullParameter(cpsFavoriteKeywardVo, "");
            this.b = tnkCpsSearchWithFilterDialog;
            this.a = cpsFavoriteKeywardVo;
        }

        public static final void a(TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog, FavoriteKeywordHolder favoriteKeywordHolder, View view) throws IllegalAccessException, InstantiationException {
            tnkCpsSearchWithFilterDialog.getComTnkOffCpsSearchInput().setText(favoriteKeywordHolder.a.getKeyword());
            tnkCpsSearchWithFilterDialog.setMKeyword(favoriteKeywordHolder.a.getKeyword());
            tnkCpsSearchWithFilterDialog.a();
        }

        @Override // com.xwray.groupie.Item
        public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
            Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
            View viewFindViewById = setcolorschemecolors.onNavigationEvent().findViewById(R.id.com_tnk_off_cps_search_rank);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            View viewFindViewById2 = setcolorschemecolors.onNavigationEvent().findViewById(R.id.com_tnk_off_cps_search_keyword_type);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            TextView textView = (TextView) viewFindViewById2;
            View viewFindViewById3 = setcolorschemecolors.onNavigationEvent().findViewById(R.id.com_tnk_off_cps_search_keyword_type_bg);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            View viewFindViewById4 = setcolorschemecolors.onNavigationEvent().findViewById(R.id.com_tnk_off_cps_search_keyword);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            TextView textView2 = (TextView) viewFindViewById4;
            ((TextView) viewFindViewById).setText(String.valueOf(this.a.getRank()));
            textView2.setText(this.a.getKeyword());
            int label = this.a.getLabel();
            if (label == 1) {
                textView.setVisibility(0);
                viewFindViewById3.setVisibility(0);
                textView.setText("인기");
                textView.setTextColor(Color.parseColor("#FF4572EF"));
                viewFindViewById3.setBackgroundResource(R.drawable.com_tnk_offerwall_cps_favorite_keyward_bg_0);
            } else if (label == 2) {
                textView.setVisibility(0);
                viewFindViewById3.setVisibility(0);
                textView.setText("신규");
                textView.setTextColor(Color.parseColor("#3E95C9"));
                viewFindViewById3.setBackgroundResource(R.drawable.com_tnk_offerwall_cps_favorite_keyward_bg_1);
            } else if (label != 3) {
                textView.setVisibility(8);
                viewFindViewById3.setVisibility(8);
                textView.setText("");
                textView.setTextColor(ResourcesCompat.onExtraCallbackWithResult(this.b.getContext().getResources(), R.color.tnk_color_primary, (Resources.Theme) null));
                viewFindViewById3.setBackgroundResource(R.drawable.com_tnk_offerwall_cps_favorite_keyward_bg_0);
            } else {
                textView.setVisibility(0);
                viewFindViewById3.setVisibility(0);
                textView.setText("급상승");
                textView.setTextColor(Color.parseColor("#F84545"));
                viewFindViewById3.setBackgroundResource(R.drawable.com_tnk_offerwall_cps_favorite_keyward_bg_2);
            }
            textView2.setText(this.a.getKeyword());
            View viewOnNavigationEvent = setcolorschemecolors.onNavigationEvent();
            final TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog = this.b;
            viewOnNavigationEvent.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog$FavoriteKeywordHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws IllegalAccessException, InstantiationException {
                    TnkCpsSearchWithFilterDialog.FavoriteKeywordHolder.a(tnkCpsSearchWithFilterDialog, this, view);
                }
            });
        }

        public final CpsFavoriteKeywardVo getFavoriteKeyward() {
            return this.a;
        }

        @Override // com.xwray.groupie.Item
        public int getLayout() {
            return R.layout.com_tnk_offerwall_cps_search_favorit_keyword;
        }
    }

    public final class KeywordHolder extends Item<setColorSchemeColors> {
        public final String a;
        public final /* synthetic */ TnkCpsSearchWithFilterDialog b;

        public KeywordHolder(@NotNull TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.b = tnkCpsSearchWithFilterDialog;
            this.a = str;
        }

        public static final void a(TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog, KeywordHolder keywordHolder, View view) {
            tnkCpsSearchWithFilterDialog.removeKeyword(keywordHolder.a);
        }

        public static final void b(TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog, KeywordHolder keywordHolder, View view) throws IllegalAccessException, InstantiationException {
            tnkCpsSearchWithFilterDialog.getComTnkOffCpsSearchInput().setText(keywordHolder.a);
            tnkCpsSearchWithFilterDialog.setMKeyword(keywordHolder.a);
            tnkCpsSearchWithFilterDialog.a();
        }

        @Override // com.xwray.groupie.Item
        public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
            Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
            View viewFindViewById = setcolorschemecolors.onNavigationEvent().findViewById(R.id.com_tnk_off_cps_search_remove);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            View viewFindViewById2 = setcolorschemecolors.onNavigationEvent().findViewById(R.id.com_tnk_off_cps_search_keyword);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            final TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog = this.b;
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog$KeywordHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TnkCpsSearchWithFilterDialog.KeywordHolder.a(tnkCpsSearchWithFilterDialog, this, view);
                }
            });
            ((TextView) viewFindViewById2).setText(this.a);
            View viewOnNavigationEvent = setcolorschemecolors.onNavigationEvent();
            final TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog2 = this.b;
            viewOnNavigationEvent.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog$KeywordHolder$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws IllegalAccessException, InstantiationException {
                    TnkCpsSearchWithFilterDialog.KeywordHolder.b(tnkCpsSearchWithFilterDialog2, this, view);
                }
            });
        }

        public final String getKeyword() {
            return this.a;
        }

        @Override // com.xwray.groupie.Item
        public int getLayout() {
            return R.layout.com_tnk_offerwall_cps_search_keyword_h;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TnkCpsSearchWithFilterDialog(@NotNull Context context) {
        super(context, R.style.tnk_full_screen_dialog);
        Intrinsics.checkNotNullParameter(context, "");
        Lazy lazyOnExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog$$ExternalSyntheticLambda0
            public final Object invoke() {
                return TnkCpsSearchWithFilterDialog.c(this.f$0);
            }
        });
        this.a = lazyOnExtraCallbackWithResult;
        this.b = (TextFieldSizeKtExternalSyntheticLambda2) lazyOnExtraCallbackWithResult.getValue();
        this.e = new ArrayList();
        this.f = new GroupieAdapter();
        this.f35i = "";
        this.j = new GroupieAdapter();
        this.k = new GroupieAdapter();
        this.l = new TnkCpsSearchResultHeader(new e(this));
        this.m = new TnkAdListEmptyItem(DpUtil.INSTANCE.dpToPx(20.0f));
        this.n = new ArrayList();
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        this.c = fragmentActivity;
        this.d = new TnkContext(fragmentActivity);
        ((TextFieldSizeKtExternalSyntheticLambda2) lazyOnExtraCallbackWithResult.getValue()).IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START);
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        window.setSoftInputMode(16);
    }

    public static final boolean a(TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog, View view, int i2, KeyEvent keyEvent) throws IllegalAccessException, InstantiationException {
        if (i2 != 66 || keyEvent.getAction() != 1) {
            return false;
        }
        tnkCpsSearchWithFilterDialog.f35i = tnkCpsSearchWithFilterDialog.getComTnkOffCpsSearchInput().getText().toString();
        tnkCpsSearchWithFilterDialog.a();
        return true;
    }

    public static final void b(View view) {
        TnkCore.INSTANCE.getOffRepository().clearAdItemClickHistory();
    }

    public static final TextFieldSizeKtExternalSyntheticLambda2 c(TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog) {
        return new TextFieldSizeKtExternalSyntheticLambda2(tnkCpsSearchWithFilterDialog);
    }

    public static final void d(TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog, View view) {
        tnkCpsSearchWithFilterDialog.inputMode(true);
    }

    public final FragmentActivity getActivity() {
        return this.c;
    }

    public final GroupieAdapter getAdapter() {
        return this.j;
    }

    public final ArrayList<CpsFilterItem> getArrCpsFilterItem() {
        return this.e;
    }

    public final ArrayList<KeywordHolder> getArrKeywordHolder() {
        return this.n;
    }

    public final TnkAdListEmptyItem getBottomMargin() {
        return this.m;
    }

    public final View getComTnkOffCpsRecentSearchClearAll() {
        return findViewById(R.id.com_tnk_off_cps_search_title2_delete_all);
    }

    public final View getComTnkOffCpsSearchClear() {
        View viewFindViewById = findViewById(R.id.com_tnk_off_cps_search_clear);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        return viewFindViewById;
    }

    public final View getComTnkOffCpsSearchClearAll() {
        View viewFindViewById = findViewById(R.id.com_tnk_off_cps_search_title1_delete_all);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        return viewFindViewById;
    }

    public final View getComTnkOffCpsSearchClose() {
        View viewFindViewById = findViewById(R.id.com_tnk_off_header_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        return viewFindViewById;
    }

    public final View getComTnkOffCpsSearchIcon() {
        View viewFindViewById = findViewById(R.id.com_tnk_off_cps_search_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        return viewFindViewById;
    }

    public final EditText getComTnkOffCpsSearchInput() {
        View viewFindViewById = findViewById(R.id.com_tnk_off_cps_search_input);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        return (EditText) viewFindViewById;
    }

    public final TextView getComTnkOffCpsSearchTitle2() {
        return (TextView) findViewById(R.id.com_tnk_off_cps_search_title2);
    }

    public final RecyclerView getComTnkOffRvSearchKeyword() {
        RecyclerView recyclerViewFindViewById = findViewById(R.id.com_tnk_off_rv_search_keyword);
        Intrinsics.checkNotNullExpressionValue(recyclerViewFindViewById, "");
        return recyclerViewFindViewById;
    }

    public final RecyclerView getComTnkOffRvSearchRecent() {
        return findViewById(R.id.com_tnk_off_rv_search_recent);
    }

    public final RecyclerView getComTnkOffRvSearchRecommendKeyword() {
        return findViewById(R.id.com_tnk_off_rv_search_recommend_keyword);
    }

    public final RecyclerView getComTnkOffRvSearchRecommendProduct() {
        return findViewById(R.id.com_tnk_off_rv_search_recommend_product);
    }

    public final RecyclerView getComTnkOffRvSearchResult() {
        RecyclerView recyclerViewFindViewById = findViewById(R.id.com_tnk_off_rv_search_result);
        Intrinsics.checkNotNullExpressionValue(recyclerViewFindViewById, "");
        return recyclerViewFindViewById;
    }

    public final GroupieAdapter getFilterAdapter() {
        return this.f;
    }

    public final int getFilterId() {
        return this.g;
    }

    public final GroupieAdapter getKeywordAdapter() {
        return this.k;
    }

    public TextFieldKeyInputExternalSyntheticLambda9 getLifecycle() {
        return this.b;
    }

    public final String getMKeyword() {
        return this.f35i;
    }

    public final TnkContext getMTnkContext() {
        return this.d;
    }

    public final TnkCpsSearchResultHeader getResultHeader() {
        return this.l;
    }

    public final int getSelectedSortType() {
        return this.h;
    }

    public final void inputMode(boolean z) {
        if (!z) {
            getComTnkOffRvSearchKeyword().setVisibility(8);
            getComTnkOffRvSearchResult().setVisibility(0);
            getComTnkOffCpsSearchInput().postDelayed(new Runnable() { // from class: com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    TnkCpsSearchWithFilterDialog.b(this.f$0);
                }
            }, 100L);
            return;
        }
        getComTnkOffRvSearchKeyword().setVisibility(0);
        getComTnkOffRvSearchResult().setVisibility(8);
        getComTnkOffCpsSearchInput().postDelayed(new Runnable() { // from class: com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                TnkCpsSearchWithFilterDialog.a(this.f$0);
            }
        }, 100L);
        this.k.clear();
        Settings settings = Settings.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ArrayList<String> arrayListLoadCpsSearchResultKeyword = settings.loadCpsSearchResultKeyword(context);
        if (arrayListLoadCpsSearchResultKeyword.isEmpty()) {
            this.k.add(new CpsRecentKeywordEmptyItem(this));
            return;
        }
        this.n.clear();
        ArrayList arrayList = this.n;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListLoadCpsSearchResultKeyword, 10));
        Iterator<T> it = arrayListLoadCpsSearchResultKeyword.iterator();
        while (it.hasNext()) {
            arrayList2.add(new KeywordHolder(this, (String) it.next()));
        }
        arrayList.addAll(arrayList2);
        this.k.addAll(this.n);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) throws IllegalAccessException, InstantiationException {
        super.onCreate(bundle);
        setContentView(R.layout.com_tnk_offerwall_cps_search_with_filter);
        getComTnkOffRvSearchResult().setAdapter(this.j);
        RecyclerView comTnkOffRvSearchResult = getComTnkOffRvSearchResult();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 12, 1, false);
        this.j.setSpanCount(12);
        gridLayoutManager.IAuthTabCallback(this.j.getSpanSizeLookup());
        comTnkOffRvSearchResult.setLayoutManager(gridLayoutManager);
        getComTnkOffRvSearchKeyword().setAdapter(this.k);
        getComTnkOffRvSearchKeyword().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        getComTnkOffCpsSearchInput().setOnKeyListener(new View.OnKeyListener() { // from class: com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog$$ExternalSyntheticLambda3
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return TnkCpsSearchWithFilterDialog.a(this.f$0, view, i2, keyEvent);
            }
        });
        getComTnkOffCpsSearchClear().setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.a(view);
            }
        });
        getComTnkOffCpsSearchClearAll().setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TnkCpsSearchWithFilterDialog.a(this.f$0, view);
            }
        });
        View comTnkOffCpsRecentSearchClearAll = getComTnkOffCpsRecentSearchClearAll();
        if (comTnkOffCpsRecentSearchClearAll != null) {
            comTnkOffCpsRecentSearchClearAll.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TnkCpsSearchWithFilterDialog.b(view);
                }
            });
        }
        getComTnkOffCpsSearchIcon().setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws IllegalAccessException, InstantiationException {
                TnkCpsSearchWithFilterDialog.b(this.f$0, view);
            }
        });
        getComTnkOffCpsSearchClose().setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TnkCpsSearchWithFilterDialog.c(this.f$0, view);
            }
        });
        getComTnkOffCpsSearchInput().setFocusableInTouchMode(true);
        getComTnkOffCpsSearchInput().setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TnkCpsSearchWithFilterDialog.d(this.f$0, view);
            }
        });
        getComTnkOffCpsSearchInput().requestFocus();
        getComTnkOffCpsSearchInput().postDelayed(new Runnable() { // from class: com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                TnkCpsSearchWithFilterDialog.d(this.f$0);
            }
        }, 500L);
        TnkCore tnkCore = TnkCore.INSTANCE;
        tnkCore.getOffRepository().getDataChanged().observe(this, new b0(new Function1() { // from class: com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog$$ExternalSyntheticLambda11
            public final Object invoke(Object obj) {
                return TnkCpsSearchWithFilterDialog.a(this.f$0, (Boolean) obj);
            }
        }));
        final ArrayList<AdListVo> adList = tnkCore.getOffRepository().getAdList();
        tnkCore.getOffRepository().loadAdItemClickHistory();
        final RecyclerView comTnkOffRvSearchRecent = getComTnkOffRvSearchRecent();
        if (comTnkOffRvSearchRecent != null) {
            tnkCore.getOffRepository().getCpsRecentItem().observe(this, new b0(new Function1() { // from class: com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog$$ExternalSyntheticLambda12
                public final Object invoke(Object obj) {
                    return TnkCpsSearchWithFilterDialog.a(comTnkOffRvSearchRecent, this, adList, (ArrayList) obj);
                }
            }));
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new a0(this, null), 2, (Object) null);
        RecyclerView comTnkOffRvSearchRecommendProduct = getComTnkOffRvSearchRecommendProduct();
        if (comTnkOffRvSearchRecommendProduct != null) {
            comTnkOffRvSearchRecommendProduct.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            GroupieAdapter groupieAdapter = new GroupieAdapter();
            ArrayList<AdListVo> adList2 = tnkCore.getOffRepository().getAdList();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = adList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((AdListVo) next).getAdType() == 4) {
                    arrayList.add(next);
                }
            }
            List<AdListVo> listSubList = arrayList.subList(0, arrayList.size() <= 3 ? arrayList.size() : 4);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubList, 10));
            for (AdListVo adListVo : listSubList) {
                int ad_list_cps_favorite = TnkLayoutType.INSTANCE.getAD_LIST_CPS_FAVORITE();
                Intrinsics.checkNotNullParameter(adListVo, "");
                Object objNewInstance = clearRegisters.onNavigationEvent(TnkAdConfig.INSTANCE.getLayoutInfo(ad_list_cps_favorite).getViewClass()).newInstance();
                ITnkOffAdItem iTnkOffAdItem = (ITnkOffAdItem) objNewInstance;
                iTnkOffAdItem.onItemInit(this.d, adListVo);
                Intrinsics.checkNotNullExpressionValue(objNewInstance, "");
                arrayList2.add(iTnkOffAdItem);
            }
            groupieAdapter.addAll(arrayList2);
            comTnkOffRvSearchRecommendProduct.setAdapter(groupieAdapter);
        }
    }

    public final void onFilterSelected(@NotNull TnkCpsSearchResultHeader.FilterOption filterOption) throws IllegalAccessException, InstantiationException {
        Intrinsics.checkNotNullParameter(filterOption, "");
        this.h = filterOption.getFilterType();
        a();
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        ((TextFieldSizeKtExternalSyntheticLambda2) this.a.getValue()).IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        ((TextFieldSizeKtExternalSyntheticLambda2) this.a.getValue()).IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_STOP);
    }

    public final void removeKeyword(@NotNull String str) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Settings settings = Settings.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ArrayList<String> arrayListLoadCpsSearchResultKeyword = settings.loadCpsSearchResultKeyword(context);
        arrayListLoadCpsSearchResultKeyword.remove(str);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        settings.saveCpsSearchResultKeyword(context2, arrayListLoadCpsSearchResultKeyword);
        Iterator it = this.n.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual(((KeywordHolder) next).getKeyword(), str)) {
                    break;
                }
            }
        }
        TypeIntrinsics.asMutableCollection(this.n).remove((KeywordHolder) next);
        if (this.n.size() != 0) {
            this.k.update(this.n);
        } else {
            this.k.clear();
            this.k.add(new CpsRecentKeywordEmptyItem(this));
        }
    }

    public final void saveCpsSearchResultKeyword(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (TextUtils.isEmpty(this.f35i) || Intrinsics.areEqual(str, "147359123258")) {
            return;
        }
        Settings settings = Settings.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ArrayList<String> arrayListLoadCpsSearchResultKeyword = settings.loadCpsSearchResultKeyword(context);
        List arrayList = new ArrayList();
        for (Object obj : arrayListLoadCpsSearchResultKeyword) {
            if (!Intrinsics.areEqual((String) obj, str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 9) {
            arrayList = arrayList.subList(0, 9);
        }
        List<String> mutableList = CollectionsKt.toMutableList(arrayList);
        mutableList.add(0, str);
        Settings settings2 = Settings.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        settings2.saveCpsSearchResultKeyword(context2, mutableList);
    }

    public final void setFilterId(int i2) {
        this.g = i2;
    }

    public final void setMKeyword(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f35i = str;
    }

    public final void setSelectedSortType(int i2) {
        this.h = i2;
    }

    public static final void b(TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog, View view) throws IllegalAccessException, InstantiationException {
        TnkAdAnalytics tnkAdAnalytics = TnkAdAnalytics.INSTANCE;
        HashMap<String, String> map = new HashMap<>();
        map.put("item_id", "cps_search");
        Editable text = tnkCpsSearchWithFilterDialog.getComTnkOffCpsSearchInput().getText();
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        map.put("item_name", sb.toString());
        Unit unit = Unit.INSTANCE;
        tnkAdAnalytics.logEvent("tnk_ev_search_cps", map);
        tnkCpsSearchWithFilterDialog.f35i = tnkCpsSearchWithFilterDialog.getComTnkOffCpsSearchInput().getText().toString();
        tnkCpsSearchWithFilterDialog.a();
    }

    public static final void c(TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog, View view) {
        tnkCpsSearchWithFilterDialog.dismiss();
    }

    public static final void d(TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog) {
        tnkCpsSearchWithFilterDialog.inputMode(true);
    }

    public static final void a(TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog, View view) {
        Settings settings = Settings.INSTANCE;
        Context context = tnkCpsSearchWithFilterDialog.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        settings.saveCpsSearchResultKeyword(context, new ArrayList());
        tnkCpsSearchWithFilterDialog.n.clear();
        tnkCpsSearchWithFilterDialog.k.clear();
        tnkCpsSearchWithFilterDialog.k.add(new CpsRecentKeywordEmptyItem(tnkCpsSearchWithFilterDialog));
    }

    public static final Unit a(TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog, Boolean bool) {
        if (bool.booleanValue()) {
            tnkCpsSearchWithFilterDialog.j.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    public static final void b(TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog) {
        Object systemService = tnkCpsSearchWithFilterDialog.getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(tnkCpsSearchWithFilterDialog.getComTnkOffCpsSearchInput().getWindowToken(), 0);
    }

    public static final Unit a(RecyclerView recyclerView, TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog, ArrayList arrayList, ArrayList arrayList2) throws IllegalAccessException, InstantiationException {
        Object next;
        recyclerView.setLayoutManager(new LinearLayoutManager(tnkCpsSearchWithFilterDialog.getContext(), 0, false));
        GroupieAdapter groupieAdapter = new GroupieAdapter();
        ArrayList arrayList3 = new ArrayList();
        Intrinsics.checkNotNull(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                AdListVo adListVo = (AdListVo) next;
                if (adListVo.getAppId() == jLongValue && adListVo.getAdType() == 4) {
                    break;
                }
            }
            AdListVo adListVo2 = (AdListVo) next;
            if (adListVo2 != null) {
                int ad_list_cps_search_recent = TnkLayoutType.INSTANCE.getAD_LIST_CPS_SEARCH_RECENT();
                Intrinsics.checkNotNullParameter(adListVo2, "");
                Object objNewInstance = clearRegisters.onNavigationEvent(TnkAdConfig.INSTANCE.getLayoutInfo(ad_list_cps_search_recent).getViewClass()).newInstance();
                ITnkOffAdItem iTnkOffAdItem = (ITnkOffAdItem) objNewInstance;
                iTnkOffAdItem.onItemInit(tnkCpsSearchWithFilterDialog.d, adListVo2);
                Intrinsics.checkNotNullExpressionValue(objNewInstance, "");
                arrayList3.add(iTnkOffAdItem);
            }
        }
        if (arrayList3.size() > 0) {
            groupieAdapter.addAll(arrayList3);
        } else {
            recyclerView.setVisibility(8);
            TextView comTnkOffCpsSearchTitle2 = tnkCpsSearchWithFilterDialog.getComTnkOffCpsSearchTitle2();
            if (comTnkOffCpsSearchTitle2 != null) {
                comTnkOffCpsSearchTitle2.setVisibility(8);
            }
            View comTnkOffCpsRecentSearchClearAll = tnkCpsSearchWithFilterDialog.getComTnkOffCpsRecentSearchClearAll();
            if (comTnkOffCpsRecentSearchClearAll != null) {
                comTnkOffCpsRecentSearchClearAll.setVisibility(8);
            }
        }
        recyclerView.setAdapter(groupieAdapter);
        return Unit.INSTANCE;
    }

    public final void a(View view) {
        this.f35i = "";
        getComTnkOffCpsSearchInput().setText("");
        inputMode(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    public final void a() throws IllegalAccessException, InstantiationException {
        ArrayList arrayList;
        List<Long> arrayList2;
        Collection<AdListVo> collectionSubList;
        AdListCuration adListCuration = null;
        if (!TextUtils.isEmpty(this.f35i)) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new c0(this, null), 2, (Object) null);
        }
        this.j.clear();
        List mutableList = CollectionsKt.toMutableList(TnkCore.INSTANCE.getOffRepository().getAdList());
        ArrayList arrayList3 = new ArrayList();
        Iterator it = mutableList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            AdListVo adListVo = (AdListVo) next;
            if (this.g == 0) {
                if (adListVo.getAdType() == 4) {
                    arrayList3.add(next);
                }
            } else if (adListVo.getFilterId() == this.g) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = arrayList3;
        if (!TextUtils.isEmpty(this.f35i)) {
            try {
                arrayList = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (((AdListVo) next2).getAppId() == Long.parseLong(this.f35i)) {
                        arrayList.add(next2);
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        Object next3 = it3.next();
                        AdListVo adListVo2 = (AdListVo) next3;
                        if (StringsKt.contains$default(adListVo2.getTitle(), this.f35i, false, 2, (Object) null) || StringsKt.contains$default(adListVo2.getCorp_desc(), this.f35i, false, 2, (Object) null)) {
                            arrayList.add(next3);
                        }
                    }
                }
            } catch (Exception unused) {
                arrayList = new ArrayList();
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    Object next4 = it4.next();
                    AdListVo adListVo3 = (AdListVo) next4;
                    if (StringsKt.contains$default(adListVo3.getTitle(), this.f35i, false, 2, (Object) null) || StringsKt.contains$default(adListVo3.getCorp_desc(), this.f35i, false, 2, (Object) null)) {
                        arrayList.add(next4);
                    }
                }
            }
            arrayList4 = arrayList;
        }
        int i2 = this.h;
        ArrayList arrayListSortedWith = arrayList4;
        if (i2 == 1) {
            arrayListSortedWith = CollectionsKt.sortedWith(arrayList4, new Comparator() { // from class: com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog$searchItem$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return getCodeNameBytes.IAuthTabCallback(Long.valueOf(((AdListVo) t2).getPointAmount()), Long.valueOf(((AdListVo) t).getPointAmount()));
                }
            });
        } else if (i2 == 2) {
            arrayListSortedWith = CollectionsKt.sortedWith(arrayList4, new Comparator() { // from class: com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog$searchItem$$inlined$sortedByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return getCodeNameBytes.IAuthTabCallback(Long.valueOf(((AdListVo) t2).getPrd_price()), Long.valueOf(((AdListVo) t).getPrd_price()));
                }
            });
        } else if (i2 == 3) {
            arrayListSortedWith = CollectionsKt.sortedWith(arrayList4, new Comparator() { // from class: com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog$searchItem$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return getCodeNameBytes.IAuthTabCallback(Long.valueOf(((AdListVo) t).getPrd_price()), Long.valueOf(((AdListVo) t2).getPrd_price()));
                }
            });
        }
        if (arrayListSortedWith != null && !arrayListSortedWith.isEmpty()) {
            collectionSubList = arrayListSortedWith;
            if (!TextUtils.isEmpty(this.f35i)) {
                this.l.setKeyword(this.f35i, arrayListSortedWith.size());
                this.j.add(this.l);
                collectionSubList = arrayListSortedWith;
            }
        } else {
            this.j.add(new TnkCpsSearchNotExist(this.f35i));
            Iterator it5 = TnkCore.INSTANCE.getOffRepository().getCuriation().iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                ?? next5 = it5.next();
                if (((AdListCuration) next5).getCrt_type() == 4) {
                    adListCuration = next5;
                    break;
                }
            }
            AdListCuration adListCuration2 = adListCuration;
            if (adListCuration2 == null || (arrayList2 = adListCuration2.getApp_id_list()) == null) {
                arrayList2 = new ArrayList<>();
            }
            ArrayList<AdListVo> adList = TnkCore.INSTANCE.getOffRepository().getAdList();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj : adList) {
                if (arrayList2.contains(Long.valueOf(((AdListVo) obj).getAppId()))) {
                    arrayList5.add(obj);
                }
            }
            collectionSubList = arrayList5.subList(0, arrayList5.size() <= 3 ? arrayList5.size() : 4);
        }
        saveCpsSearchResultKeyword(this.f35i);
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionSubList, 10));
        for (AdListVo adListVo4 : collectionSubList) {
            int ad_list_cps_normal = TnkLayoutType.INSTANCE.getAD_LIST_CPS_NORMAL();
            Intrinsics.checkNotNullParameter(adListVo4, "");
            Object objNewInstance = clearRegisters.onNavigationEvent(TnkAdConfig.INSTANCE.getLayoutInfo(ad_list_cps_normal).getViewClass()).newInstance();
            ITnkOffAdItem iTnkOffAdItem = (ITnkOffAdItem) objNewInstance;
            iTnkOffAdItem.onItemInit(this.d, adListVo4);
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "");
            arrayList6.add(iTnkOffAdItem);
        }
        int size = arrayList6.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((ITnkOffAdItem) arrayList6.get(i3)).setPosition(i3);
        }
        this.j.addAll(arrayList6);
        this.j.add(this.m);
        inputMode(false);
    }

    public static final void a(TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog) {
        Object systemService = tnkCpsSearchWithFilterDialog.getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "");
        ((InputMethodManager) systemService).showSoftInput(tnkCpsSearchWithFilterDialog.getComTnkOffCpsSearchInput(), 1);
    }
}
