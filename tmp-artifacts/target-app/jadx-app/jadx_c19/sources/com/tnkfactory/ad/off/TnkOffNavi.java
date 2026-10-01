package com.tnkfactory.ad.off;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.tnkfactory.ad.TnkAdAnalytics;
import com.tnkfactory.ad.basic.TnkCpsMyDialogV2;
import com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog;
import com.tnkfactory.ad.d.a0;
import com.tnkfactory.ad.d.b0;
import com.tnkfactory.ad.d.c0;
import com.tnkfactory.ad.d.x;
import com.tnkfactory.ad.d.y;
import com.tnkfactory.ad.d.z;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.TnkCore;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.getPackageType;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkOffNavi {
    public final FragmentActivity a;
    public Function0 b;
    public Dialog c;

    public TnkOffNavi(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        this.a = fragmentActivity;
        this.b = new Function0() { // from class: com.tnkfactory.ad.off.TnkOffNavi$$ExternalSyntheticLambda0
            public final Object invoke() {
                return TnkOffNavi.a(this.f$0);
            }
        };
    }

    public static final Unit a(TnkOffNavi tnkOffNavi) {
        tnkOffNavi.a.finish();
        return Unit.INSTANCE;
    }

    public final void closeOfferwall() {
        this.b.invoke();
    }

    public final boolean disableAdItem(long j) {
        return false;
    }

    public final FragmentActivity getActivity() {
        return this.a;
    }

    public final Dialog getLoading() {
        return this.c;
    }

    public final Function0<Unit> getOnCloseEventListener() {
        return this.b;
    }

    public final void launchIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.a), putChannelInfo.onExtraCallback(), (setRandomHost) null, new x(this, intent, null), 2, (Object) null);
    }

    public final void moveToDetail(@NotNull FragmentActivity fragmentActivity, @NotNull AdListVo adListVo) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(adListVo, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(fragmentActivity), putChannelInfo.onExtraCallback(), (setRandomHost) null, new y(adListVo, fragmentActivity, null), 2, (Object) null);
    }

    public final void moveToMyMenu(int i2) {
        TnkAdAnalytics tnkAdAnalytics = TnkAdAnalytics.INSTANCE;
        HashMap<String, String> map = new HashMap<>();
        map.put("item_id", "offerwall_my");
        map.put("item_name", "offerwall_my");
        Unit unit = Unit.INSTANCE;
        tnkAdAnalytics.logEvent("tnk_ev_menu", map);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.a), putChannelInfo.onExtraCallback(), (setRandomHost) null, new z(i2, this, null), 2, (Object) null);
    }

    public final void setLoading(@Nullable Dialog dialog) {
        this.c = dialog;
    }

    public final void setOnCloseEventListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.b = function0;
    }

    public final void showCpsMy() {
        TnkAdAnalytics tnkAdAnalytics = TnkAdAnalytics.INSTANCE;
        HashMap<String, String> map = new HashMap<>();
        map.put("item_id", "cps_my");
        map.put("item_name", "cps_my");
        Unit unit = Unit.INSTANCE;
        tnkAdAnalytics.logEvent("tnk_ev_menu", map);
        String tnpickUrl = TnkOffRepository.Companion.getTnpickUrl();
        FragmentActivity fragmentActivity = this.a;
        TnkCore tnkCore = TnkCore.INSTANCE;
        new TnkCpsMyDialogV2(fragmentActivity, tnpickUrl + "/sho/api.redr.main?action=tnk_cpsmy&a=" + tnkCore.getSessionInfo().getApplicationId() + "&&n=" + tnkCore.getSessionInfo().getMediaUserName()).show();
    }

    public final void showCpsSearch() {
        TnkAdAnalytics tnkAdAnalytics = TnkAdAnalytics.INSTANCE;
        HashMap<String, String> map = new HashMap<>();
        map.put("item_id", "cps_search");
        map.put("item_name", "cps_search");
        Unit unit = Unit.INSTANCE;
        tnkAdAnalytics.logEvent("tnk_ev_menu", map);
        new TnkCpsSearchWithFilterDialog(this.a).show();
    }

    public final void showDialog(@NotNull Context context, @NotNull String str, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.a), putChannelInfo.onExtraCallback(), (setRandomHost) null, new a0(context, str, function0, null), 2, (Object) null);
    }

    public final getPackageType showLoading(boolean z) {
        return maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.a), putChannelInfo.onExtraCallback(), (setRandomHost) null, new b0(z, this, null), 2, (Object) null);
    }

    public final void showTerms(int i2, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.a), putChannelInfo.onExtraCallback(), (setRandomHost) null, new c0(this, function02, function0, null), 2, (Object) null);
    }
}
