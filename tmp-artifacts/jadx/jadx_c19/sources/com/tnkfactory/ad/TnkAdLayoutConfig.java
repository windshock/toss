package com.tnkfactory.ad;

import android.app.Dialog;
import android.content.Context;
import com.tnkfactory.ad.basic.PlacementViewLayout;
import com.tnkfactory.ad.basic.TnkAdLayoutNone;
import com.tnkfactory.ad.basic.TnkAdListCpsB;
import com.tnkfactory.ad.basic.TnkAdListCpsFavorite;
import com.tnkfactory.ad.basic.TnkAdListCpsMyLike;
import com.tnkfactory.ad.basic.TnkAdListCpsMyRecent;
import com.tnkfactory.ad.basic.TnkAdListCpsNew;
import com.tnkfactory.ad.basic.TnkAdListCpsNormal;
import com.tnkfactory.ad.basic.TnkAdListCpsPopular;
import com.tnkfactory.ad.basic.TnkAdListCpsRecommend;
import com.tnkfactory.ad.basic.TnkAdListCpsReward;
import com.tnkfactory.ad.basic.TnkAdListCpsSearch;
import com.tnkfactory.ad.basic.TnkAdListCpsSearchRecent;
import com.tnkfactory.ad.basic.TnkAdListDummyHeader;
import com.tnkfactory.ad.basic.TnkAdListItemLayout;
import com.tnkfactory.ad.basic.TnkAdListItemNormal;
import com.tnkfactory.ad.basic.TnkAdListItemQuiz;
import com.tnkfactory.ad.basic.TnkAdListItemQuizFeed;
import com.tnkfactory.ad.basic.TnkAdListJoinMultiItem;
import com.tnkfactory.ad.basic.TnkAdListLayoutCpsB;
import com.tnkfactory.ad.basic.TnkAdListLayoutCpsF;
import com.tnkfactory.ad.basic.TnkAdListLayoutCpsNone;
import com.tnkfactory.ad.basic.TnkAdListLayoutCpsPopular;
import com.tnkfactory.ad.basic.TnkAdListNew;
import com.tnkfactory.ad.basic.TnkAdListNews;
import com.tnkfactory.ad.basic.TnkAdListPopupItem;
import com.tnkfactory.ad.basic.TnkAdListSuggest;
import com.tnkfactory.ad.basic.TnkAdListToolbar;
import com.tnkfactory.ad.basic.TnkAdListToolbar_NoTitle;
import com.tnkfactory.ad.basic.TnkBasicCurationTypeNew;
import com.tnkfactory.ad.basic.TnkBasicCurationTypeSuggest;
import com.tnkfactory.ad.basic.TnkCurationPromotion;
import com.tnkfactory.ad.basic.TnkLoadingDialog;
import com.tnkfactory.ad.basic.TnkSectionHorizontalSingle;
import com.tnkfactory.ad.rwd.data.layout.TnkLayoutType;
import com.tnkfactory.ad.style.ITnkOffAdItem;
import com.tnkfactory.ad.style.ITnkRwdHeader;
import com.tnkfactory.ad.style.ITnkRwdToolbar;
import com.xwray.groupie.Section;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import o.access5300;
import o.clearRegisters;
import o.getBacktraceNote;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdLayoutConfig {
    private int adDetailCampaignLayout;
    private int adDetailLayout;
    private KClass<? extends ITnkRwdHeader> adListHeader;
    private KClass<? extends ITnkRwdToolbar> adListToolbar;
    private final TnkPlacementAdConfig placementAdConfig = new TnkPlacementAdConfig();
    private KClass<? extends Dialog> tnkLoadingDialog;
    private HashMap<Integer, TnkAdListLayout> viewLayout;

    public static final class TnkAdListLayout {
        public final int a;
        public final KClass b;
        public final KClass c;

        public TnkAdListLayout(int i2, @NotNull KClass<? extends ITnkOffAdItem> kClass, @NotNull KClass<? extends Section> kClass2) {
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(kClass2, "");
            this.a = i2;
            this.b = kClass;
            this.c = kClass2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TnkAdListLayout copy$default(TnkAdListLayout tnkAdListLayout, int i2, KClass kClass, KClass kClass2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = tnkAdListLayout.a;
            }
            if ((i3 & 2) != 0) {
                kClass = tnkAdListLayout.b;
            }
            if ((i3 & 4) != 0) {
                kClass2 = tnkAdListLayout.c;
            }
            return tnkAdListLayout.copy(i2, kClass, kClass2);
        }

        public final int component1() {
            return this.a;
        }

        public final KClass<? extends ITnkOffAdItem> component2() {
            return this.b;
        }

        public final KClass<? extends Section> component3() {
            return this.c;
        }

        public final TnkAdListLayout copy(int i2, @NotNull KClass<? extends ITnkOffAdItem> kClass, @NotNull KClass<? extends Section> kClass2) {
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(kClass2, "");
            return new TnkAdListLayout(i2, kClass, kClass2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TnkAdListLayout)) {
                return false;
            }
            TnkAdListLayout tnkAdListLayout = (TnkAdListLayout) obj;
            return this.a == tnkAdListLayout.a && Intrinsics.areEqual(this.b, tnkAdListLayout.b) && Intrinsics.areEqual(this.c, tnkAdListLayout.c);
        }

        public final int getLayoutId() {
            return this.a;
        }

        public final KClass<? extends ITnkOffAdItem> getViewClass() {
            return this.b;
        }

        public final KClass<? extends Section> getViewLayout() {
            return this.c;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.a);
            return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
        }

        public String toString() {
            return "TnkAdListLayout(layoutId=" + this.a + ", viewClass=" + this.b + ", viewLayout=" + this.c + ")";
        }
    }

    public static final class TnkPlacementAdListLayout {
        public final String a;
        public final KClass b;
        public final KClass c;

        public TnkPlacementAdListLayout(@NotNull String str, @NotNull KClass<? extends ITnkOffAdItem> kClass, @NotNull KClass<? extends PlacementViewLayout> kClass2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(kClass2, "");
            this.a = str;
            this.b = kClass;
            this.c = kClass2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TnkPlacementAdListLayout copy$default(TnkPlacementAdListLayout tnkPlacementAdListLayout, String str, KClass kClass, KClass kClass2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = tnkPlacementAdListLayout.a;
            }
            if ((i2 & 2) != 0) {
                kClass = tnkPlacementAdListLayout.b;
            }
            if ((i2 & 4) != 0) {
                kClass2 = tnkPlacementAdListLayout.c;
            }
            return tnkPlacementAdListLayout.copy(str, kClass, kClass2);
        }

        public final String component1() {
            return this.a;
        }

        public final KClass<? extends ITnkOffAdItem> component2() {
            return this.b;
        }

        public final KClass<? extends PlacementViewLayout> component3() {
            return this.c;
        }

        public final TnkPlacementAdListLayout copy(@NotNull String str, @NotNull KClass<? extends ITnkOffAdItem> kClass, @NotNull KClass<? extends PlacementViewLayout> kClass2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(kClass2, "");
            return new TnkPlacementAdListLayout(str, kClass, kClass2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TnkPlacementAdListLayout)) {
                return false;
            }
            TnkPlacementAdListLayout tnkPlacementAdListLayout = (TnkPlacementAdListLayout) obj;
            return Intrinsics.areEqual(this.a, tnkPlacementAdListLayout.a) && Intrinsics.areEqual(this.b, tnkPlacementAdListLayout.b) && Intrinsics.areEqual(this.c, tnkPlacementAdListLayout.c);
        }

        public final String getPlacementId() {
            return this.a;
        }

        public final KClass<? extends ITnkOffAdItem> getViewClass() {
            return this.b;
        }

        public final KClass<? extends PlacementViewLayout> getViewLayout() {
            return this.c;
        }

        public int hashCode() {
            int iHashCode = this.a.hashCode();
            return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
        }

        public String toString() {
            return "TnkPlacementAdListLayout(placementId=" + this.a + ", viewClass=" + this.b + ", viewLayout=" + this.c + ")";
        }
    }

    public TnkAdLayoutConfig() {
        final HashMap<Integer, TnkAdListLayout> map = new HashMap<>();
        getBacktraceNote getbacktracenote = new getBacktraceNote() { // from class: com.tnkfactory.ad.TnkAdLayoutConfig$$ExternalSyntheticLambda0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TnkAdLayoutConfig.viewLayout$lambda$1$lambda$0(map, ((Integer) obj).intValue(), (KClass) obj2, (KClass) obj3);
            }
        };
        TnkLayoutType tnkLayoutType = TnkLayoutType.INSTANCE;
        getbacktracenote.invoke(Integer.valueOf(tnkLayoutType.getAD_LIST_NORMAL()), Reflection.getOrCreateKotlinClass(TnkAdListItemNormal.class), Reflection.getOrCreateKotlinClass(TnkAdLayoutNone.class));
        getbacktracenote.invoke(Integer.valueOf(tnkLayoutType.getAD_LIST_PROMOTION()), Reflection.getOrCreateKotlinClass(TnkCurationPromotion.class), Reflection.getOrCreateKotlinClass(TnkAdListItemLayout.class));
        getbacktracenote.invoke(Integer.valueOf(tnkLayoutType.getAD_LIST_NEW()), Reflection.getOrCreateKotlinClass(TnkAdListNew.class), Reflection.getOrCreateKotlinClass(TnkBasicCurationTypeNew.class));
        getbacktracenote.invoke(Integer.valueOf(tnkLayoutType.getAD_LIST_SUGGEST()), Reflection.getOrCreateKotlinClass(TnkAdListSuggest.class), Reflection.getOrCreateKotlinClass(TnkBasicCurationTypeSuggest.class));
        getbacktracenote.invoke(Integer.valueOf(tnkLayoutType.getAD_LIST_MULTI()), Reflection.getOrCreateKotlinClass(TnkAdListJoinMultiItem.class), Reflection.getOrCreateKotlinClass(TnkSectionHorizontalSingle.class));
        getbacktracenote.invoke(Integer.valueOf(tnkLayoutType.getAD_LIST_CPS_NORMAL()), Reflection.getOrCreateKotlinClass(TnkAdListCpsNormal.class), Reflection.getOrCreateKotlinClass(TnkAdListLayoutCpsNone.class));
        getbacktracenote.invoke(Integer.valueOf(tnkLayoutType.getAD_LIST_CPS_FAVORITE()), Reflection.getOrCreateKotlinClass(TnkAdListCpsFavorite.class), Reflection.getOrCreateKotlinClass(TnkSectionHorizontalSingle.class));
        getbacktracenote.invoke(Integer.valueOf(tnkLayoutType.getAD_LIST_CPS_POPULAR()), Reflection.getOrCreateKotlinClass(TnkAdListCpsPopular.class), Reflection.getOrCreateKotlinClass(TnkAdListLayoutCpsPopular.class));
        getbacktracenote.invoke(Integer.valueOf(tnkLayoutType.getAD_LIST_CPS_REWARD()), Reflection.getOrCreateKotlinClass(TnkAdListCpsReward.class), Reflection.getOrCreateKotlinClass(TnkAdListLayoutCpsF.class));
        getbacktracenote.invoke(Integer.valueOf(tnkLayoutType.getAD_LIST_CPS_NEW()), Reflection.getOrCreateKotlinClass(TnkAdListCpsNew.class), Reflection.getOrCreateKotlinClass(TnkAdListLayoutCpsF.class));
        getbacktracenote.invoke(Integer.valueOf(tnkLayoutType.getAD_LIST_CPS_RECOMMEND()), Reflection.getOrCreateKotlinClass(TnkAdListCpsRecommend.class), Reflection.getOrCreateKotlinClass(TnkSectionHorizontalSingle.class));
        getbacktracenote.invoke(Integer.valueOf(tnkLayoutType.getAD_LIST_CPS_SEARCH()), Reflection.getOrCreateKotlinClass(TnkAdListCpsSearch.class), Reflection.getOrCreateKotlinClass(TnkAdListLayoutCpsNone.class));
        getbacktracenote.invoke(Integer.valueOf(tnkLayoutType.getAD_LIST_CPS_MY_FAVORITE()), Reflection.getOrCreateKotlinClass(TnkAdListCpsMyLike.class), Reflection.getOrCreateKotlinClass(TnkAdListLayoutCpsNone.class));
        getbacktracenote.invoke(Integer.valueOf(tnkLayoutType.getAD_LIST_CPS_SEARCH_RECENT()), Reflection.getOrCreateKotlinClass(TnkAdListCpsSearchRecent.class), Reflection.getOrCreateKotlinClass(TnkAdListLayoutCpsNone.class));
        getbacktracenote.invoke(Integer.valueOf(tnkLayoutType.getAD_LIST_CPS_MY_RECENT()), Reflection.getOrCreateKotlinClass(TnkAdListCpsMyRecent.class), Reflection.getOrCreateKotlinClass(TnkAdListLayoutCpsNone.class));
        getbacktracenote.invoke(Integer.valueOf(tnkLayoutType.getAD_LIST_CPS_B()), Reflection.getOrCreateKotlinClass(TnkAdListCpsB.class), Reflection.getOrCreateKotlinClass(TnkAdListLayoutCpsB.class));
        getbacktracenote.invoke(Integer.valueOf(tnkLayoutType.getLAYOUT_TYPE_NOAD()), Reflection.getOrCreateKotlinClass(TnkAdListItemNormal.class), Reflection.getOrCreateKotlinClass(TnkAdListLayoutCpsNone.class));
        getbacktracenote.invoke(Integer.valueOf(tnkLayoutType.getAD_LIST_NEWS()), Reflection.getOrCreateKotlinClass(TnkAdListNews.class), Reflection.getOrCreateKotlinClass(TnkAdLayoutNone.class));
        getbacktracenote.invoke(Integer.valueOf(tnkLayoutType.getAD_LIST_QUIZ_NOR()), Reflection.getOrCreateKotlinClass(TnkAdListItemQuiz.class), Reflection.getOrCreateKotlinClass(TnkAdLayoutNone.class));
        getbacktracenote.invoke(Integer.valueOf(tnkLayoutType.getAD_LIST_QUIZ_FEED()), Reflection.getOrCreateKotlinClass(TnkAdListItemQuizFeed.class), Reflection.getOrCreateKotlinClass(TnkAdLayoutNone.class));
        getbacktracenote.invoke(Integer.valueOf(tnkLayoutType.getAD_LIST_POPUP()), Reflection.getOrCreateKotlinClass(TnkAdListPopupItem.class), Reflection.getOrCreateKotlinClass(TnkAdLayoutNone.class));
        this.viewLayout = map;
        this.tnkLoadingDialog = Reflection.getOrCreateKotlinClass(TnkLoadingDialog.class);
        this.adDetailLayout = R.layout.com_tnk_offerwall_detail_basic;
        this.adDetailCampaignLayout = R.layout.com_tnk_offerwall_detail_action_item;
        this.adListToolbar = Reflection.getOrCreateKotlinClass(TnkAdListToolbar_NoTitle.class);
        this.adListHeader = Reflection.getOrCreateKotlinClass(TnkAdListDummyHeader.class);
    }

    private final Dialog createLoadingDialog(Object... objArr) {
        Object next;
        try {
            Iterator it = this.tnkLoadingDialog.getConstructors().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((access5300) next).getParameters().size() == objArr.length) {
                    break;
                }
            }
            access5300 access5300Var = (access5300) next;
            if (access5300Var != null) {
                return (Dialog) access5300Var.call(Arrays.copyOf(objArr, objArr.length));
            }
            return null;
        } catch (Throwable th) {
            Logger.e("failed to create custom loading dialog : " + th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit viewLayout$lambda$1$lambda$0(HashMap map, int i2, KClass kClass, KClass kClass2) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(kClass2, "");
        map.put(Integer.valueOf(i2), new TnkAdListLayout(i2, kClass, kClass2));
        return Unit.INSTANCE;
    }

    public final int getAdDetailCampaignLayout() {
        return this.adDetailCampaignLayout;
    }

    public final int getAdDetailLayout() {
        return this.adDetailLayout;
    }

    public final KClass<? extends ITnkRwdHeader> getAdListHeader() {
        return this.adListHeader;
    }

    public final KClass<? extends ITnkRwdToolbar> getAdListToolbar() {
        return this.adListToolbar;
    }

    public final Dialog getLoadingDialog(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Dialog dialogCreateLoadingDialog = createLoadingDialog(context);
        return dialogCreateLoadingDialog == null ? new TnkLoadingDialog(context, R.style.TnkRwdLoadingDialog) : dialogCreateLoadingDialog;
    }

    public final TnkPlacementAdConfig getPlacementAdConfig() {
        return this.placementAdConfig;
    }

    public final KClass<? extends Dialog> getTnkLoadingDialog() {
        return this.tnkLoadingDialog;
    }

    public final ITnkRwdToolbar getToolbar() throws IllegalAccessException, InstantiationException {
        Object objNewInstance = clearRegisters.onNavigationEvent(this.adListToolbar).newInstance();
        Intrinsics.checkNotNullExpressionValue(objNewInstance, "");
        return (ITnkRwdToolbar) objNewInstance;
    }

    public final HashMap<Integer, TnkAdListLayout> getViewLayout() {
        return this.viewLayout;
    }

    public final void setAdDetailCampaignLayout(int i2) {
        this.adDetailCampaignLayout = i2;
    }

    public final void setAdDetailLayout(int i2) {
        this.adDetailLayout = i2;
    }

    public final void setAdListHeader(@Nullable KClass<? extends ITnkRwdHeader> kClass) {
        this.adListHeader = kClass;
    }

    public final void setAdListToolbar(@NotNull KClass<? extends ITnkRwdToolbar> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        this.adListToolbar = kClass;
    }

    public final void setListHeader(int i2) {
        if (i2 == 0) {
            this.adListToolbar = Reflection.getOrCreateKotlinClass(TnkAdListToolbar_NoTitle.class);
        } else {
            this.adListToolbar = Reflection.getOrCreateKotlinClass(TnkAdListToolbar.class);
        }
    }

    public final void setTnkLoadingDialog(@NotNull KClass<? extends Dialog> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        this.tnkLoadingDialog = kClass;
    }

    public final void setViewLayout(@NotNull HashMap<Integer, TnkAdListLayout> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.viewLayout = map;
    }

    public final Dialog getLoadingDialog(@NotNull Context context, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        Dialog dialogCreateLoadingDialog = createLoadingDialog(context, Integer.valueOf(i2));
        return dialogCreateLoadingDialog == null ? new TnkLoadingDialog(context, i2) : dialogCreateLoadingDialog;
    }
}
