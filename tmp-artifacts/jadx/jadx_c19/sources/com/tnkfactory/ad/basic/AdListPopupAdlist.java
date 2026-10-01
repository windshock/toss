package com.tnkfactory.ad.basic;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdAnalytics;
import com.tnkfactory.ad.TnkAdConfig;
import com.tnkfactory.ad.TnkContext;
import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.RecommendList;
import com.tnkfactory.ad.rwd.Resources;
import com.tnkfactory.ad.rwd.Settings;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.data.layout.TnkLayoutType;
import com.tnkfactory.ad.style.ITnkOffAdItem;
import com.xwray.groupie.GroupieAdapter;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.VectorConvertersKtExternalSyntheticLambda8;
import o.access8100;
import o.clearRegisters;
import o.getPackageType;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdListPopupAdlist extends DialogFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackStub = 1;
    private static char onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public ConstraintLayout a;
    public Function0 b;
    public final GroupieAdapter c = new GroupieAdapter();
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public boolean f = true;
    public Dialog g;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final AdListPopupAdlist newInstance(@NotNull ArrayList<String> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            AdListPopupAdlist adListPopupAdlist = new AdListPopupAdlist();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("arrAppId", arrayList);
            adListPopupAdlist.setArguments(bundle);
            return adListPopupAdlist;
        }
    }

    public interface IPopupAdlistView {
        List<AdListVo> getPopupAdList();
    }

    static {
        onNavigationEvent();
        Companion = new Companion(null);
        int i2 = onNavigationEvent + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ ViewPager2 access$getVpAdList(AdListPopupAdlist adListPopupAdlist) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 17;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        ViewPager2 viewPager2B = adListPopupAdlist.b();
        int i5 = IAuthTabCallbackStub + 31;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return viewPager2B;
        }
        throw null;
    }

    public static final void c(AdListPopupAdlist adListPopupAdlist, View view) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 27;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        adListPopupAdlist.dismiss();
        int i5 = IAuthTabCallbackStub + 77;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final TextView a() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 83;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        View view = this.a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        View viewFindViewById = view.findViewById(R.id.com_tnk_off_popup_disable_today);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        int i4 = IAuthTabCallbackStub + 57;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final ViewPager2 b() {
        int i2 = 2 % 2;
        View view = this.a;
        Object obj = null;
        if (view == null) {
            int i3 = onExtraCallbackWithResult + 73;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        ViewPager2 viewPager2FindViewById = view.findViewById(R.id.com_tnk_off_popup_ad_rv_ad_list);
        if (!(viewPager2FindViewById instanceof ViewPager2)) {
            return null;
        }
        int i5 = onExtraCallbackWithResult + 43;
        IAuthTabCallbackStub = i5 % 128;
        ViewPager2 viewPager2 = viewPager2FindViewById;
        if (i5 % 2 != 0) {
            return viewPager2;
        }
        obj.hashCode();
        throw null;
    }

    public final GroupieAdapter getAdapter() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 63;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        GroupieAdapter groupieAdapter = this.c;
        if (i4 != 0) {
            int i5 = 74 / 0;
        }
        return groupieAdapter;
    }

    public final List<String> getArgAppId() {
        int i2 = 2 % 2;
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        int i3 = onExtraCallbackWithResult + 7;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        ArrayList<String> stringArrayList = arguments.getStringArrayList("arrAppId");
        int i5 = onExtraCallbackWithResult + 93;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return stringArrayList;
    }

    public final ArrayList<ITnkOffAdItem> getArrItems() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 97;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        ArrayList<ITnkOffAdItem> arrayList = this.d;
        int i6 = i4 + 121;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return arrayList;
    }

    public final Dialog getLoading() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 43;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        Dialog dialog = this.g;
        int i6 = i4 + 11;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            return dialog;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final HashMap<Long, ITnkOffAdItem> getMapItems() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 47;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        HashMap<Long, ITnkOffAdItem> map = this.e;
        int i6 = i3 + 105;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function0<Unit> getOnDismissCallback() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 1;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return this.b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isAutoScroll() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 125;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        boolean z = this.f;
        int i6 = i4 + 89;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 86 / 0;
        }
        return z;
    }

    public final void setAutoScroll(boolean z) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 79;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        this.f = z;
        int i6 = i4 + 45;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setLoading(@Nullable Dialog dialog) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 87;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        this.g = dialog;
        int i6 = i3 + 113;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setOnDismissCallback(@Nullable Function0<Unit> function0) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 97;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        this.b = function0;
        int i6 = i4 + 81;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public final getPackageType showLoading(boolean z) {
        int i2 = 2 % 2;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(fragmentActivityRequireActivity), putChannelInfo.onExtraCallback(), (setRandomHost) null, new com.tnkfactory.ad.b.f(z, this, null), 2, (Object) null);
        int i3 = IAuthTabCallbackStub + 43;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return getpackagetypeOnNavigationEvent;
    }

    public static final TextView access$getTvPageCnt(AdListPopupAdlist adListPopupAdlist) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 49;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            ConstraintLayout constraintLayout = adListPopupAdlist.a;
            throw null;
        }
        View view = adListPopupAdlist.a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = IAuthTabCallbackStub + 97;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            view = null;
        }
        View viewFindViewById = view.findViewById(R.id.com_tnk_off_page_cnt);
        if (!(viewFindViewById instanceof TextView)) {
            return null;
        }
        int i6 = IAuthTabCallbackStub + 39;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return (TextView) viewFindViewById;
        }
        throw null;
    }

    public static final TextView access$getTvPageIdx(AdListPopupAdlist adListPopupAdlist) {
        int i2 = 2 % 2;
        View view = adListPopupAdlist.a;
        if (view == null) {
            int i3 = IAuthTabCallbackStub + 55;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        View viewFindViewById = view.findViewById(R.id.com_tnk_off_page_idx);
        if (!(viewFindViewById instanceof TextView)) {
            return null;
        }
        int i5 = IAuthTabCallbackStub + 41;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return (TextView) viewFindViewById;
    }

    public static final void b(AdListPopupAdlist adListPopupAdlist, View view) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        adListPopupAdlist.dismiss();
        if (i4 != 0) {
            throw null;
        }
        int i5 = onExtraCallbackWithResult + 119;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 7;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            super.onCreate(bundle);
            i2 = 0;
        } else {
            super.onCreate(bundle);
            i2 = 1;
        }
        setStyle(i2, R.style.tnk_full_screen_dialog);
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 105;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(R.layout.com_tnk_offerwall_popup_adlist, viewGroup);
        Intrinsics.checkNotNull(constraintLayoutInflate, "");
        ConstraintLayout constraintLayout = constraintLayoutInflate;
        this.a = constraintLayout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i5 = IAuthTabCallbackStub + 83;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final void startAutoScroll() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        if (this.f) {
            int i6 = i3 + 115;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            ViewPager2 viewPager2B = b();
            if (viewPager2B != null) {
                viewPager2B.post(new Runnable() { // from class: com.tnkfactory.ad.basic.AdListPopupAdlist.startAutoScroll.1
                    @Override // java.lang.Runnable
                    public void run() {
                        RecyclerView.Adapter adapterOnWarmupCompleted;
                        RecyclerView.Adapter adapterOnWarmupCompleted2;
                        ViewPager2 viewPager2Access$getVpAdList = AdListPopupAdlist.access$getVpAdList(AdListPopupAdlist.this);
                        if ((viewPager2Access$getVpAdList != null ? Integer.valueOf(viewPager2Access$getVpAdList.onNavigationEvent()) : null) != null) {
                            ViewPager2 viewPager2Access$getVpAdList2 = AdListPopupAdlist.access$getVpAdList(AdListPopupAdlist.this);
                            if (viewPager2Access$getVpAdList2 == null || (adapterOnWarmupCompleted2 = viewPager2Access$getVpAdList2.onWarmupCompleted()) == null || adapterOnWarmupCompleted2.getItemCount() != 0) {
                                ViewPager2 viewPager2Access$getVpAdList3 = AdListPopupAdlist.access$getVpAdList(AdListPopupAdlist.this);
                                int iOnNavigationEvent = (viewPager2Access$getVpAdList3 != null ? viewPager2Access$getVpAdList3.onNavigationEvent() : 0) + 1;
                                ViewPager2 viewPager2Access$getVpAdList4 = AdListPopupAdlist.access$getVpAdList(AdListPopupAdlist.this);
                                if (iOnNavigationEvent >= ((viewPager2Access$getVpAdList4 == null || (adapterOnWarmupCompleted = viewPager2Access$getVpAdList4.onWarmupCompleted()) == null) ? 0 : adapterOnWarmupCompleted.getItemCount())) {
                                    ViewPager2 viewPager2Access$getVpAdList5 = AdListPopupAdlist.access$getVpAdList(AdListPopupAdlist.this);
                                    if (viewPager2Access$getVpAdList5 != null) {
                                        viewPager2Access$getVpAdList5.setCurrentItem(0, true);
                                    }
                                } else {
                                    ViewPager2 viewPager2Access$getVpAdList6 = AdListPopupAdlist.access$getVpAdList(AdListPopupAdlist.this);
                                    if (viewPager2Access$getVpAdList6 != null) {
                                        viewPager2Access$getVpAdList6.setCurrentItem(iOnNavigationEvent, true);
                                    }
                                }
                                ViewPager2 viewPager2Access$getVpAdList7 = AdListPopupAdlist.access$getVpAdList(AdListPopupAdlist.this);
                                if (viewPager2Access$getVpAdList7 != null) {
                                    viewPager2Access$getVpAdList7.postDelayed(this, 3000L);
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 99;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0 function0 = this.b;
        if (function0 != null) {
            function0.invoke();
        }
        int i5 = onExtraCallbackWithResult + 71;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final void d(final AdListPopupAdlist adListPopupAdlist, View view) throws NumberFormatException {
        ITnkOffAdItem iTnkOffAdItem;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 57;
        IAuthTabCallbackStub = i3 % 128;
        AdListVo adItem = null;
        if (i3 % 2 == 0) {
            ArrayList arrayList = adListPopupAdlist.d;
            ViewPager2 viewPager2B = adListPopupAdlist.b();
            Intrinsics.checkNotNull(viewPager2B);
            boolean z = arrayList.get(viewPager2B.onNavigationEvent()) instanceof ITnkOffAdItem;
            adItem.hashCode();
            throw null;
        }
        ArrayList arrayList2 = adListPopupAdlist.d;
        ViewPager2 viewPager2B2 = adListPopupAdlist.b();
        Intrinsics.checkNotNull(viewPager2B2);
        Object obj = arrayList2.get(viewPager2B2.onNavigationEvent());
        if (obj instanceof ITnkOffAdItem) {
            int i4 = onExtraCallbackWithResult + 31;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            iTnkOffAdItem = (ITnkOffAdItem) obj;
        } else {
            iTnkOffAdItem = null;
        }
        if (iTnkOffAdItem != null) {
            adItem = iTnkOffAdItem.getAdItem();
            int i5 = IAuthTabCallbackStub + 61;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
        if (adItem == null) {
            return;
        }
        adListPopupAdlist.showLoading(true);
        TnkAdAnalytics.INSTANCE.logEvent("tnk_ev_recommend_popup_item", access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("item_id", String.valueOf(adItem.getAppId())), getWrite.IAuthTabCallback("item_name", adItem.getTitle())}));
        FragmentActivity fragmentActivityRequireActivity = adListPopupAdlist.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        new TnkContext(fragmentActivityRequireActivity).getEventHandler().onItemSelected(adItem, new AdEventListener() { // from class: com.tnkfactory.ad.basic.AdListPopupAdlist$onViewCreated$8$1
            @Override // com.tnkfactory.ad.off.AdEventListener
            public void onComplete(AdListVo adListVo, boolean z2) {
                Intrinsics.checkNotNullParameter(adListVo, "");
                this.a.showLoading(false);
                this.a.dismiss();
            }

            @Override // com.tnkfactory.ad.off.AdEventListener
            public void onError(TnkError tnkError) {
                Intrinsics.checkNotNullParameter(tnkError, "");
                this.a.showLoading(false);
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.a), putChannelInfo.onExtraCallback(), (setRandomHost) null, new com.tnkfactory.ad.b.e(this.a, tnkError, null), 2, (Object) null);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit a(AdListPopupAdlist adListPopupAdlist, AdListVo adListVo) {
        ConstraintLayout constraintLayout;
        TextView textView;
        TextView textView2;
        String str;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 83;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(adListVo, "");
            constraintLayout = adListPopupAdlist.a;
            int i4 = 47 / 0;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                constraintLayout = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(adListVo, "");
            constraintLayout = adListPopupAdlist.a;
            if (constraintLayout == null) {
            }
        }
        View viewFindViewById = constraintLayout.findViewById(R.id.com_tnk_off_page_cnt);
        TextView textView3 = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
        if (textView3 != null) {
            textView3.setText("/" + adListPopupAdlist.c.getItemCount());
        }
        View view = adListPopupAdlist.a;
        if (view == null) {
            int i5 = IAuthTabCallbackStub + 89;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        int i6 = R.id.com_tnk_off_popup_ad_title;
        View viewFindViewById2 = view.findViewById(i6);
        TextView textView4 = viewFindViewById2 instanceof TextView ? (TextView) viewFindViewById2 : null;
        if (textView4 != null) {
            int i7 = IAuthTabCallbackStub + 121;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                textView4.setText(adListVo.getTitle());
                textView.hashCode();
                throw null;
            }
            textView4.setText(adListVo.getTitle());
        }
        if (adListVo.getPrd_price() > 0) {
            View view2 = adListPopupAdlist.a;
            if (view2 == null) {
                int i8 = IAuthTabCallbackStub + 31;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                view2 = null;
            }
            View viewFindViewById3 = view2.findViewById(R.id.com_tnk_off_popup_ad_cps_layout);
            if (viewFindViewById3 == null) {
                viewFindViewById3 = null;
            }
            if (viewFindViewById3 != null) {
                viewFindViewById3.setVisibility(0);
            }
            View view3 = adListPopupAdlist.a;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                view3 = null;
            }
            View viewFindViewById4 = view3.findViewById(i6);
            if (viewFindViewById4 instanceof TextView) {
                int i10 = IAuthTabCallbackStub + 9;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    textView = (TextView) viewFindViewById4;
                    int i11 = 94 / 0;
                } else {
                    textView = (TextView) viewFindViewById4;
                }
            } else {
                textView = null;
            }
            if (textView != null) {
                VectorConvertersKtExternalSyntheticLambda8.IAuthTabCallback(textView, R.style.tnk_recommend_popup_ad_title_cps);
            }
            DecimalFormat decimalFormat = new DecimalFormat("###,###");
            View view4 = adListPopupAdlist.a;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                view4 = null;
            }
            View viewFindViewById5 = view4.findViewById(R.id.com_tnk_off_popup_ad_price);
            if (viewFindViewById5 instanceof TextView) {
                int i12 = IAuthTabCallbackStub + 71;
                onExtraCallbackWithResult = i12 % 128;
                if (i12 % 2 != 0) {
                    textView2 = (TextView) viewFindViewById5;
                    int i13 = 93 / 0;
                } else {
                    textView2 = (TextView) viewFindViewById5;
                }
            } else {
                textView2 = null;
            }
            if (textView2 != null) {
                textView2.setText(StringsKt.trim(decimalFormat.format(adListVo.getPrd_price()) + "원").toString());
            }
            int org_price = (int) (100.0f - ((100.0f / adListVo.getOrg_price()) * adListVo.getPrd_price()));
            View view5 = adListPopupAdlist.a;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                view5 = null;
            }
            View viewFindViewById6 = view5.findViewById(R.id.com_tnk_off_popup_ad_discount_percent);
            TextView textView5 = viewFindViewById6 instanceof TextView ? (TextView) viewFindViewById6 : null;
            if (textView5 != null) {
                if (org_price > 0) {
                    str = org_price + "%";
                } else {
                    str = "";
                }
                textView5.setText(str);
            }
        } else {
            View view6 = adListPopupAdlist.a;
            if (view6 == null) {
                int i14 = IAuthTabCallbackStub + 105;
                onExtraCallbackWithResult = i14 % 128;
                if (i14 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    textView.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                view6 = null;
            }
            View viewFindViewById7 = view6.findViewById(i6);
            TextView textView6 = viewFindViewById7 instanceof TextView ? (TextView) viewFindViewById7 : null;
            if (textView6 != null) {
                VectorConvertersKtExternalSyntheticLambda8.IAuthTabCallback(textView6, R.style.tnk_recommend_popup_ad_title_nor);
            }
            View view7 = adListPopupAdlist.a;
            if (view7 == null) {
                int i15 = onExtraCallbackWithResult + 73;
                IAuthTabCallbackStub = i15 % 128;
                int i16 = i15 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                view7 = null;
            }
            View viewFindViewById8 = view7.findViewById(R.id.com_tnk_off_popup_ad_cps_layout);
            if (viewFindViewById8 == null) {
                int i17 = IAuthTabCallbackStub + 67;
                onExtraCallbackWithResult = i17 % 128;
                if (i17 % 2 != 0) {
                    textView.hashCode();
                    throw null;
                }
                viewFindViewById8 = null;
            }
            if (viewFindViewById8 != null) {
                viewFindViewById8.setVisibility(8);
            }
        }
        View view8 = adListPopupAdlist.a;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view8 = null;
        }
        View viewFindViewById9 = view8.findViewById(R.id.com_tnk_off_popup_ad_confirm);
        textView = viewFindViewById9 instanceof TextView ? (TextView) viewFindViewById9 : null;
        if (textView != null) {
            textView.setText("+" + Resources.getResources().formatCurrency(adListVo.getPointAmount()) + " " + adListVo.getPointUnit() + " 받기");
        }
        return Unit.INSTANCE;
    }

    public static final void a(AdListPopupAdlist adListPopupAdlist, View view) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 125;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        TextView textViewA = adListPopupAdlist.a();
        if (textViewA != null) {
            Intrinsics.checkNotNull(adListPopupAdlist.a());
            textViewA.setSelected(!r1.isSelected());
        }
        int i5 = Calendar.getInstance().get(6);
        TextView textViewA2 = adListPopupAdlist.a();
        Intrinsics.checkNotNull(textViewA2);
        if (textViewA2.isSelected()) {
            int i6 = IAuthTabCallbackStub + 17;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            Settings settings = Settings.INSTANCE;
            Context contextRequireContext = adListPopupAdlist.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            settings.setAdRecommendPopupDisableToday(contextRequireContext, i5);
            return;
        }
        Settings settings2 = Settings.INSTANCE;
        Context contextRequireContext2 = adListPopupAdlist.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        settings2.setAdRecommendPopupDisableToday(contextRequireContext2, 999);
        int i8 = IAuthTabCallbackStub + 9;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
    }

    public static final void a(AdListPopupAdlist adListPopupAdlist) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 65;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        adListPopupAdlist.startAutoScroll();
        int i5 = IAuthTabCallbackStub + 49;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void h(char[] cArr, byte b, int i2, Object[] objArr) throws Throwable {
        int i3;
        Object obj;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallback;
        Object obj2 = null;
        int i5 = 8;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 26 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollBarSize() >> i5) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    i5 = 8;
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
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 26 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i3) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback != defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 24824), 75 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.indexOf("", "") + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), KeyEvent.keyCodeFromString("") + 30, 19488 - View.MeasureSpec.getSize(0), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i7 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i7];
                        int i8 = $10 + 95;
                        $11 = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 5 / 4;
                        }
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                        } else {
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        }
                    }
                } else {
                    int i14 = $10 + 73;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        int i16 = 0;
        while (i16 < i2) {
            int i17 = $10 + 89;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                cArr4[i16] = (char) (cArr4[i16] ^ 31142);
                i16 += 77;
            } else {
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
                i16++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i2;
        Object next;
        ArrayList<AdListVo> pop_list;
        Object next2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        TextView textViewA = a();
        if (textViewA != null) {
            textViewA.setSelected(false);
        }
        View view2 = this.a;
        if (view2 == null) {
            int i4 = onExtraCallbackWithResult + 109;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = 61 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            view2 = null;
        }
        View viewFindViewById = view2.findViewById(R.id.com_tnk_off_popup_disable_today_touch);
        if (viewFindViewById == null) {
            int i6 = IAuthTabCallbackStub + 63;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            viewFindViewById = null;
        }
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.AdListPopupAdlist$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    AdListPopupAdlist.a(this.f$0, view3);
                }
            });
        }
        ViewPager2 viewPager2B = b();
        if (viewPager2B != null) {
            viewPager2B.setAdapter(this.c);
        }
        List<String> argAppId = getArgAppId();
        if (argAppId != null) {
            int i7 = IAuthTabCallbackStub + 95;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            Iterator<T> it = argAppId.iterator();
            while (it.hasNext()) {
                int i9 = IAuthTabCallbackStub + 117;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    TnkCore.INSTANCE.getOffRepository().getAdList().iterator();
                    throw null;
                }
                String str = (String) it.next();
                Iterator<T> it2 = TnkCore.INSTANCE.getOffRepository().getAdList().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (((AdListVo) next).getAppId() == Long.parseLong(str)) {
                            break;
                        }
                    }
                }
                AdListVo adListVo = (AdListVo) next;
                if (adListVo != null) {
                    ITnkOffAdItem iTnkOffAdItem = (ITnkOffAdItem) clearRegisters.onNavigationEvent(TnkAdConfig.INSTANCE.getLayoutInfo(TnkLayoutType.INSTANCE.getAD_LIST_POPUP()).getViewClass()).newInstance();
                    FragmentActivity fragmentActivityRequireActivity = requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    iTnkOffAdItem.onItemInit(new TnkContext(fragmentActivityRequireActivity), adListVo);
                    this.e.put(Long.valueOf(iTnkOffAdItem.getAdItem().getAppId()), iTnkOffAdItem);
                }
                RecommendList recommendList = (RecommendList) TnkCore.INSTANCE.getOffRepository().getRecommendList().getValue();
                if (recommendList != null && (pop_list = recommendList.getPop_list()) != null) {
                    int i10 = onExtraCallbackWithResult + 21;
                    IAuthTabCallbackStub = i10 % 128;
                    int i11 = i10 % 2;
                    Iterator<T> it3 = pop_list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        } else {
                            next2 = it3.next();
                            if (((AdListVo) next2).getAppId() == Long.parseLong(str)) {
                                break;
                            }
                        }
                    }
                    AdListVo adListVo2 = (AdListVo) next2;
                    if (adListVo2 != null) {
                        ITnkOffAdItem iTnkOffAdItem2 = (ITnkOffAdItem) clearRegisters.onNavigationEvent(TnkAdConfig.INSTANCE.getLayoutInfo(TnkLayoutType.INSTANCE.getAD_LIST_POPUP()).getViewClass()).newInstance();
                        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
                        iTnkOffAdItem2.onItemInit(new TnkContext(fragmentActivityRequireActivity2), adListVo2);
                        this.e.put(Long.valueOf(iTnkOffAdItem2.getAdItem().getAppId()), iTnkOffAdItem2);
                    }
                }
            }
        }
        if (this.e.isEmpty()) {
            int i12 = IAuthTabCallbackStub + 109;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 == 0) {
                dismiss();
                return;
            } else {
                dismiss();
                throw null;
            }
        }
        this.d.clear();
        ArrayList arrayList = this.d;
        HashMap map = this.e;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it4 = map.entrySet().iterator();
        while (it4.hasNext()) {
            arrayList2.add((ITnkOffAdItem) ((Map.Entry) it4.next()).getValue());
        }
        arrayList.addAll(arrayList2);
        this.c.update(this.d);
        View view3 = this.a;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i13 = IAuthTabCallbackStub + 109;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            view3 = null;
        }
        View viewFindViewById2 = view3.findViewById(R.id.com_tnk_off_recommend_indicator);
        LinearLayout linearLayout = viewFindViewById2 instanceof LinearLayout ? (LinearLayout) viewFindViewById2 : null;
        if (linearLayout != null) {
            if (this.d.size() <= 1) {
                int i15 = IAuthTabCallbackStub + 69;
                onExtraCallbackWithResult = i15 % 128;
                int i16 = i15 % 2;
                i2 = 8;
            } else {
                i2 = 0;
            }
            linearLayout.setVisibility(i2);
        }
        final Function1 function1 = new Function1() { // from class: com.tnkfactory.ad.basic.AdListPopupAdlist$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return AdListPopupAdlist.a(this.f$0, (AdListVo) obj);
            }
        };
        ViewPager2 viewPager2B2 = b();
        if (viewPager2B2 != null) {
            viewPager2B2.onExtraCallbackWithResult(new ViewPager2.OnPageChangeCallback() { // from class: com.tnkfactory.ad.basic.AdListPopupAdlist.onViewCreated.4
                public void onPageSelected(int i17) {
                    super.onPageSelected(i17);
                    ITnkOffAdItem iTnkOffAdItem3 = (ITnkOffAdItem) CollectionsKt.getOrNull(AdListPopupAdlist.this.getArrItems(), i17);
                    if (iTnkOffAdItem3 == null) {
                        return;
                    }
                    TextView textViewAccess$getTvPageIdx = AdListPopupAdlist.access$getTvPageIdx(AdListPopupAdlist.this);
                    if (textViewAccess$getTvPageIdx != null) {
                        textViewAccess$getTvPageIdx.setText(String.valueOf(i17 + 1));
                    }
                    TextView textViewAccess$getTvPageCnt = AdListPopupAdlist.access$getTvPageCnt(AdListPopupAdlist.this);
                    if (textViewAccess$getTvPageCnt != null) {
                        textViewAccess$getTvPageCnt.setText("/" + AdListPopupAdlist.this.getAdapter().getItemCount());
                    }
                    function1.invoke(iTnkOffAdItem3.getAdItem());
                }
            });
        }
        View view4 = this.a;
        if (view4 == null) {
            int i17 = IAuthTabCallbackStub + 111;
            onExtraCallbackWithResult = i17 % 128;
            if (i17 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i18 = 40 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            view4 = null;
        }
        View viewFindViewById3 = view4.findViewById(R.id.com_tnk_off_page_idx);
        TextView textView = viewFindViewById3 instanceof TextView ? (TextView) viewFindViewById3 : null;
        if (textView != null) {
            Object[] objArr = new Object[1];
            h(new char[]{13784}, (byte) (TextUtils.getOffsetBefore("", 0) + 45), ExpandableListView.getPackedPositionType(0L) + 1, objArr);
            textView.setText(((String) objArr[0]).intern());
        }
        View view5 = this.a;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view5 = null;
        }
        View viewFindViewById4 = view5.findViewById(R.id.com_tnk_off_page_cnt);
        TextView textView2 = viewFindViewById4 instanceof TextView ? (TextView) viewFindViewById4 : null;
        if (textView2 != null) {
            textView2.setText("/" + this.c.getItemCount());
        }
        ITnkOffAdItem iTnkOffAdItem3 = (ITnkOffAdItem) CollectionsKt.firstOrNull(this.d);
        if (iTnkOffAdItem3 != null) {
            function1.invoke(iTnkOffAdItem3.getAdItem());
        }
        View view6 = this.a;
        if (view6 == null) {
            int i19 = onExtraCallbackWithResult + 73;
            IAuthTabCallbackStub = i19 % 128;
            int i20 = i19 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            view6 = null;
        }
        View viewFindViewById5 = view6.findViewById(R.id.com_tnk_off_popup_tv_close);
        TextView textView3 = viewFindViewById5 instanceof TextView ? (TextView) viewFindViewById5 : null;
        if (textView3 != null) {
            textView3.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.AdListPopupAdlist$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view7) {
                    AdListPopupAdlist.b(this.f$0, view7);
                }
            });
        }
        View view7 = this.a;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view7 = null;
        }
        view7.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.AdListPopupAdlist$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view8) {
                AdListPopupAdlist.c(this.f$0, view8);
            }
        });
        View view8 = this.a;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view8 = null;
        }
        View viewFindViewById6 = view8.findViewById(R.id.com_tnk_off_popup_ad_confirm);
        TextView textView4 = viewFindViewById6 instanceof TextView ? (TextView) viewFindViewById6 : null;
        if (textView4 != null) {
            textView4.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.AdListPopupAdlist$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view9) throws NumberFormatException {
                    AdListPopupAdlist.d(this.f$0, view9);
                }
            });
        }
        ViewPager2 viewPager2B3 = b();
        if (viewPager2B3 != null) {
            viewPager2B3.postDelayed(new Runnable() { // from class: com.tnkfactory.ad.basic.AdListPopupAdlist$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    AdListPopupAdlist.a(this.f$0);
                }
            }, 3000L);
        }
    }

    static void onNavigationEvent() {
        IAuthTabCallback = new char[]{64898};
        onExtraCallback = (char) 51240;
    }
}
