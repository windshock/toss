package com.tnkfactory.ad.off;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.tnkfactory.ad.Logger;
import com.tnkfactory.ad.TenqubeDetailWebViewActivity;
import com.tnkfactory.ad.TnkAdAnalytics;
import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.basic.AdDetailWebView;
import com.tnkfactory.ad.basic.CpsDetailWebDialog;
import com.tnkfactory.ad.basic.TnkCpsMyDialogV2;
import com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog;
import com.tnkfactory.ad.basic.TnkFilterDialog;
import com.tnkfactory.ad.d.b;
import com.tnkfactory.ad.d.c;
import com.tnkfactory.ad.d.d;
import com.tnkfactory.ad.d.e;
import com.tnkfactory.ad.d.f;
import com.tnkfactory.ad.d.h;
import com.tnkfactory.ad.d.l;
import com.tnkfactory.ad.d.m;
import com.tnkfactory.ad.d.n;
import com.tnkfactory.ad.d.p;
import com.tnkfactory.ad.d.r;
import com.tnkfactory.ad.d.s;
import com.tnkfactory.ad.d.t;
import com.tnkfactory.ad.d.u;
import com.tnkfactory.ad.d.v;
import com.tnkfactory.ad.d.w;
import com.tnkfactory.ad.off.data.AdActionInfoVo;
import com.tnkfactory.ad.off.data.AdJoinInfoVo;
import com.tnkfactory.ad.off.data.AdJoinInfoVoKt;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.AdListVoKt;
import com.tnkfactory.ad.off.data.PayForAttendVo;
import com.tnkfactory.ad.rwd.BannerItem;
import com.tnkfactory.ad.rwd.DeviceManager;
import com.tnkfactory.ad.rwd.Resources;
import com.tnkfactory.ad.rwd.Settings;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.Utils;
import com.tnkfactory.ad.rwd.VideoCache;
import com.tnkfactory.ad.rwd.data.TnkResultTask;
import com.tnkfactory.ad.tnkassert.TnkAssert;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class AdEventHandler {
    public final FragmentActivity a;
    public final FragmentActivity b;
    public final TnkOffNavi c;
    public OnAdEventListener d;
    public Toast e;

    public interface OnAdEventListener {
        void onClick(@NotNull String str, @NotNull String str2);
    }

    public AdEventHandler(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        this.a = fragmentActivity;
        Intrinsics.checkNotNull(fragmentActivity, "");
        this.b = fragmentActivity;
        this.c = new TnkOffNavi(fragmentActivity);
        this.d = new OnAdEventListener() { // from class: com.tnkfactory.ad.off.AdEventHandler$onAdEventListener$1
            @Override // com.tnkfactory.ad.off.AdEventHandler.OnAdEventListener
            public void onClick(String str, String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Logger.d("onAdEventListener onClick adid:" + str + ", appName:" + str2);
            }
        };
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public static final Unit b() {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void onCpsFilterClick$default(AdEventHandler adEventHandler, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCpsFilterClick");
        }
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        adEventHandler.onCpsFilterClick(i2);
    }

    public final TextFieldScrollKtExternalSyntheticLambda0 getLifecycleOwner() {
        return this.b;
    }

    public final FragmentActivity getMActivity() {
        return this.a;
    }

    public final TnkOffNavi getNavi() {
        return this.c;
    }

    public final OnAdEventListener getOnAdEventListener() {
        return this.d;
    }

    public final Toast getToast() {
        return this.e;
    }

    public void onBannerSelected(@NotNull BannerItem bannerItem, @NotNull AdEventListener adEventListener) throws NumberFormatException {
        Intrinsics.checkNotNullParameter(bannerItem, "");
        Intrinsics.checkNotNullParameter(adEventListener, "");
        try {
            TnkAdAnalytics tnkAdAnalytics = TnkAdAnalytics.INSTANCE;
            HashMap<String, String> map = new HashMap<>();
            map.put("item_id", String.valueOf(bannerItem.getAppId()));
            map.put("item_name", bannerItem.getBnr_nm());
            Unit unit = Unit.INSTANCE;
            tnkAdAnalytics.logEvent("tnk_ev_banner_click", map);
        } catch (Exception unused) {
        }
        Object obj = null;
        if (bannerItem.getApp_id() == 0) {
            if (Intrinsics.areEqual(bannerItem.getWebview_yn(), "Y")) {
                AdDetailWebView.Companion.newInstance(bannerItem.getClck_url(), String.valueOf(bannerItem.getAppId()), bannerItem.getApp_nm()).show(this.a.getSupportFragmentManager(), "");
                return;
            }
            String clck_url = bannerItem.getClck_url();
            if (StringsKt.startsWith$default(clck_url, "tnkscheme", false, 2, (Object) null)) {
                TnkCore.INSTANCE.handleScheme(clck_url);
                return;
            } else {
                Utils.goWebPage(this.a, clck_url, false);
                return;
            }
        }
        Iterator<T> it = TnkCore.INSTANCE.getOffRepository().getAdList().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((AdListVo) next).getAppId() == bannerItem.getApp_id()) {
                obj = next;
                break;
            }
        }
        AdListVo adListVo = (AdListVo) obj;
        if (adListVo != null) {
            onItemSelected(adListVo, adEventListener);
            return;
        }
        this.c.showDialog(this.a, "광고정보를 찾을 수 없습니다. \nappid : " + bannerItem.getApp_id(), new Function0() { // from class: com.tnkfactory.ad.off.AdEventHandler$$ExternalSyntheticLambda0
            public final Object invoke() {
                return AdEventHandler.a();
            }
        });
    }

    public void onClickConfirm(@NotNull AdListVo adListVo, boolean z, @NotNull AdEventListener adEventListener) {
        Intrinsics.checkNotNullParameter(adListVo, "");
        Intrinsics.checkNotNullParameter(adEventListener, "");
        TnkAssert.INSTANCE.offerwallDetailClick(adListVo);
        TnkAdAnalytics tnkAdAnalytics = TnkAdAnalytics.INSTANCE;
        HashMap<String, String> map = new HashMap<>();
        map.put("item_id", String.valueOf(adListVo.getAppId()));
        map.put("item_name", adListVo.getApp_nm());
        map.put("item_data", AdListVoKt.toJson(adListVo));
        Unit unit = Unit.INSTANCE;
        tnkAdAnalytics.logEvent("tnk_ev_ad_join", map);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.b), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new e(this, adListVo, z, adEventListener, null), 2, (Object) null);
    }

    public void onClickFavor(@NotNull AdListVo adListVo, @NotNull AdEventListener adEventListener) {
        Intrinsics.checkNotNullParameter(adListVo, "");
        Intrinsics.checkNotNullParameter(adEventListener, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.b), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new f(adListVo, adEventListener, null), 2, (Object) null);
    }

    public void onCpsFilterClick(int i2) {
        TnkAdAnalytics tnkAdAnalytics = TnkAdAnalytics.INSTANCE;
        HashMap<String, String> map = new HashMap<>();
        map.put("item_id", "adlist_filter");
        map.put("item_name", "adlist_filter");
        Unit unit = Unit.INSTANCE;
        tnkAdAnalytics.logEvent("tnk_ev_menu", map);
        new TnkFilterDialog(this.a, i2).show();
    }

    public void onCpsMyClick() {
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

    public void onCpsSearchClick() {
        TnkAdAnalytics tnkAdAnalytics = TnkAdAnalytics.INSTANCE;
        HashMap<String, String> map = new HashMap<>();
        map.put("item_id", "cps_search");
        map.put("item_name", "cps_search");
        Unit unit = Unit.INSTANCE;
        tnkAdAnalytics.logEvent("tnk_ev_menu", map);
        new TnkCpsSearchWithFilterDialog(this.a).show();
    }

    public void onItemSelected(long j, @NotNull AdEventListener adEventListener) {
        Intrinsics.checkNotNullParameter(adEventListener, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.b), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new h(j, this, adEventListener, null), 2, (Object) null);
    }

    public final void setOnAdEventListener(@NotNull OnAdEventListener onAdEventListener) {
        Intrinsics.checkNotNullParameter(onAdEventListener, "");
        this.d = onAdEventListener;
    }

    public final void setToast(@Nullable Toast toast) {
        this.e = toast;
    }

    public static final Unit a(AdEventHandler adEventHandler, AdListVo adListVo, AdEventListener adEventListener) throws NumberFormatException {
        adEventHandler.onItemSelected(adListVo, adEventListener);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$onActionInfo(AdEventHandler adEventHandler, AdListVo adListVo, AdEventListener adEventListener, access13800 access13800Var) {
        d dVar;
        if (access13800Var instanceof d) {
            dVar = (d) access13800Var;
            int i2 = dVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.d = i2 - 2147483648;
            } else {
                dVar = new d(adEventHandler, access13800Var);
            }
        }
        Object obj = dVar.b;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = dVar.d;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            if (!AdListVoKt.isInstallComplete(adListVo, adEventHandler.a)) {
                if (Intrinsics.areEqual(adListVo.getDetailYn(), "Y")) {
                    maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(adEventHandler.b), putChannelInfo.onExtraCallback(), (setRandomHost) null, new com.tnkfactory.ad.d.a(adEventHandler, adListVo, adEventListener, null), 2, (Object) null);
                    adEventHandler.c.showLoading(false);
                } else {
                    adEventHandler.a(adListVo, false, adEventListener);
                    Unit unit = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            dVar.a = adEventHandler;
            dVar.d = 1;
            Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onExtraCallback(), new p(adEventHandler, adListVo, adEventListener, null), dVar);
            if (objOnExtraCallback != access14300.onWarmupCompleted()) {
                objOnExtraCallback = Unit.INSTANCE;
            }
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adEventHandler = dVar.a;
            ResultKt.onNavigationEvent(obj);
        }
        adEventHandler.c.showLoading(false);
        return Unit.INSTANCE;
    }

    public static final void access$processPayForAttend(AdEventHandler adEventHandler, AdListVo adListVo, AdEventListener adEventListener) {
        try {
            if (!AdListVoKt.isInstalled(adListVo, adEventHandler.a)) {
                Toast.makeText((Context) adEventHandler.a, (CharSequence) Resources.getResources().error_not_installed, 1).show();
                return;
            }
            Intent launchIntent = Utils.getLaunchIntent(adEventHandler.a, adListVo.getApp_pkg());
            if (launchIntent != null) {
                adEventHandler.c.launchIntent(launchIntent);
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(adEventHandler.b), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new n(adEventHandler, adListVo, adEventListener, null), 2, (Object) null);
            }
        } catch (Exception unused) {
            Toast.makeText((Context) adEventHandler.a, (CharSequence) Resources.getResources().error_check_run_failed, 1).show();
        }
    }

    public static final Object access$processPayForInstall(AdEventHandler adEventHandler, AdListVo adListVo, AdEventListener adEventListener, access13800 access13800Var) {
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onExtraCallback(), new p(adEventHandler, adListVo, adEventListener, null), access13800Var);
        return objOnExtraCallback == access14300.onWarmupCompleted() ? objOnExtraCallback : Unit.INSTANCE;
    }

    public static final void access$requestJoin(AdEventHandler adEventHandler, AdListVo adListVo, AdJoinInfoVo adJoinInfoVo, AdEventListener adEventListener) {
        if (adListVo.getActionId() == 3) {
            return;
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(adEventHandler.b), putChannelInfo.onExtraCallback(), (setRandomHost) null, new u(adListVo, adEventHandler, adJoinInfoVo, adEventListener, null), 2, (Object) null);
    }

    public static final void access$videoCache(AdEventHandler adEventHandler, AdActionInfoVo adActionInfoVo) {
        if (Utils.isNull(adActionInfoVo.getVideoUrl())) {
            return;
        }
        if (adActionInfoVo.getVideoStart() == 1 || (adActionInfoVo.getVideoStart() == 0 && DeviceManager.INSTANCE.isWifiConnected())) {
            String strCacheVideo = VideoCache.INSTANCE.cacheVideo(adActionInfoVo.getVideoUrl());
            if (strCacheVideo == null) {
                strCacheVideo = "";
            }
            adActionInfoVo.setVideoUrl(strCacheVideo);
        }
    }

    public final void b(AdListVo adListVo, AdJoinInfoVo adJoinInfoVo, AdEventListener adEventListener) {
        if (!AdListVoKt.isInstalled(adListVo, this.a) || !AdListVoKt.hasValidClick(adListVo, this.a)) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.b), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new m(this, adListVo, adJoinInfoVo, adEventListener, null), 2, (Object) null);
            return;
        }
        try {
            Intent launchIntentForPackage = this.a.getPackageManager().getLaunchIntentForPackage(adListVo.getApp_pkg());
            if (launchIntentForPackage != null) {
                this.a.startActivity(launchIntentForPackage);
                adEventListener.onComplete(adListVo, true);
            }
        } catch (Exception e) {
            Logger.e("app launch error : " + e);
            Toast.makeText((Context) this.a, (CharSequence) Resources.getResources().error_app_launch_failed, 1).show();
        }
    }

    public void onItemSelected(@NotNull final AdListVo adListVo, @NotNull final AdEventListener adEventListener) throws NumberFormatException {
        Intrinsics.checkNotNullParameter(adListVo, "");
        Intrinsics.checkNotNullParameter(adEventListener, "");
        this.c.showLoading(true);
        TnkCore tnkCore = TnkCore.INSTANCE;
        tnkCore.getOffRepository().adListCacheClear();
        tnkCore.getOffRepository().saveAdItemClickHistory(adListVo.getAppId());
        Settings settings = Settings.INSTANCE;
        Context applicationContext = this.a.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        if (!settings.isAgreePrivacy(applicationContext)) {
            this.d.onClick(String.valueOf(adListVo.getAppId()), adListVo.getApp_nm());
            this.c.showTerms(1, new Function0() { // from class: com.tnkfactory.ad.off.AdEventHandler$$ExternalSyntheticLambda4
                public final Object invoke() {
                    return AdEventHandler.a(this.f$0, adListVo, adEventListener);
                }
            }, new Function0() { // from class: com.tnkfactory.ad.off.AdEventHandler$$ExternalSyntheticLambda5
                public final Object invoke() {
                    return AdEventHandler.b();
                }
            });
            return;
        }
        try {
            TnkAdAnalytics tnkAdAnalytics = TnkAdAnalytics.INSTANCE;
            HashMap<String, String> map = new HashMap<>();
            long appId = adListVo.getAppId();
            StringBuilder sb = new StringBuilder();
            sb.append(appId);
            map.put("item_id", sb.toString());
            map.put("item_name", adListVo.getTitle());
            map.put("item_data", AdListVoKt.toJson(adListVo));
            Unit unit = Unit.INSTANCE;
            tnkAdAnalytics.logEvent("tnk_ev_ad_click", map);
        } catch (Exception unused) {
        }
        this.d.onClick(String.valueOf(adListVo.getAppId()), adListVo.getTitle());
        if (AdListVoKt.isNews(adListVo)) {
            this.c.showLoading(false);
            if (adListVo.getCnts_type() == 2) {
                if (Intrinsics.areEqual(adListVo.getPayYn(), "Y")) {
                    adEventListener.onComplete(adListVo, true);
                    return;
                } else {
                    adListVo.setPayYn("Y");
                    maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.b), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new b(adEventListener, adListVo, null), 2, (Object) null);
                }
            }
            if (Intrinsics.areEqual(adListVo.getWebview_yn(), "Y")) {
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.b), putChannelInfo.onExtraCallback(), (setRandomHost) null, new w(null, adListVo, this, adEventListener, null), 2, (Object) null);
                return;
            } else {
                Utils.goWebPage(this.a, adListVo.getClickUrl(), true);
                Settings.INSTANCE.setUserJoined(this.a, adListVo.getAppId(), null);
                return;
            }
        }
        if (!AdListVoKt.isEvent(adListVo)) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.b), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new l(adListVo, this, adEventListener, null), 2, (Object) null);
            return;
        }
        this.c.showLoading(false);
        if (Intrinsics.areEqual(adListVo.getWebview_yn(), "Y")) {
            AdDetailWebView.Companion.newInstance(adListVo.getClickUrl(), String.valueOf(adListVo.getAppId()), adListVo.getTitle()).show(this.a.getSupportFragmentManager(), "");
            return;
        }
        String clickUrl = adListVo.getClickUrl();
        if (StringsKt.startsWith$default(clickUrl, "tnkscheme", false, 2, (Object) null)) {
            TnkCore.INSTANCE.handleScheme(clickUrl);
        } else {
            Utils.goWebPage(this.a, clickUrl, false);
        }
    }

    public final void a(final AdListVo adListVo, boolean z, final AdEventListener adEventListener) {
        Object next;
        Iterator<T> it = adListVo.getCampaignItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (!((AdActionInfoVo) next).getPayYn()) {
                    break;
                }
            }
        }
        AdActionInfoVo adActionInfoVo = (AdActionInfoVo) next;
        if (adActionInfoVo == null) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.b), putChannelInfo.onExtraCallback(), (setRandomHost) null, new c(this, adEventListener, null), 2, (Object) null);
            return;
        }
        int img_id = adActionInfoVo.getImg_id();
        if (z && AdListVoKt.isVideoContents(adActionInfoVo)) {
            img_id = adActionInfoVo.getVdo_id();
        }
        try {
            TnkCore.INSTANCE.getOffRepository().requestJoinV3(adListVo.getAppId(), 0, img_id, adActionInfoVo.getActionId()).setOnSuccess(new Function1() { // from class: com.tnkfactory.ad.off.AdEventHandler$$ExternalSyntheticLambda2
                public final Object invoke(Object obj) {
                    return AdEventHandler.a(adListVo, this, adEventListener, (AdJoinInfoVo) obj);
                }
            }).setOnError(new Function1() { // from class: com.tnkfactory.ad.off.AdEventHandler$$ExternalSyntheticLambda3
                public final Object invoke(Object obj) {
                    return AdEventHandler.a(adListVo, this, adEventListener, (TnkError) obj);
                }
            }).executeAsync();
        } catch (Exception e) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.b), putChannelInfo.onExtraCallback(), (setRandomHost) null, new t(this, adEventListener, e, null), 2, (Object) null);
        }
    }

    public static final Unit a(AdListVo adListVo, AdEventHandler adEventHandler, AdEventListener adEventListener, AdJoinInfoVo adJoinInfoVo) {
        Intrinsics.checkNotNullParameter(adJoinInfoVo, "");
        adListVo.setDayLimited(false);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(adEventHandler.b), putChannelInfo.onExtraCallback(), (setRandomHost) null, new r(adListVo, adEventHandler, adEventListener, adJoinInfoVo, null), 2, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit a(AdListVo adListVo, AdEventHandler adEventHandler, AdEventListener adEventListener, TnkError tnkError) {
        Intrinsics.checkNotNullParameter(tnkError, "");
        if (tnkError.getCode() == 12) {
            adListVo.setDayLimited(true);
        } else if (tnkError.getCode() < 6) {
            adListVo.setOnError(true);
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(adEventHandler.b), putChannelInfo.onExtraCallback(), (setRandomHost) null, new s(adEventHandler, adEventListener, tnkError, null), 2, (Object) null);
        return Unit.INSTANCE;
    }

    public final void a(final AdListVo adListVo, AdJoinInfoVo adJoinInfoVo, AdEventListener adEventListener) {
        String str;
        String mkt_id = adJoinInfoVo.getMkt_id();
        int iHashCode = mkt_id.hashCode();
        String strGoAndroidMarket = "";
        if (iHashCode == 71) {
            if (!mkt_id.equals("G")) {
                Utils.showAlert(this.a, Resources.getResources().error_no_market);
            } else {
                strGoAndroidMarket = Utils.goAndroidMarket(this.a, adJoinInfoVo.getMkt_app_id(), false);
            }
            str = strGoAndroidMarket;
        } else {
            if (iHashCode == 84) {
                if (mkt_id.equals("T")) {
                    strGoAndroidMarket = Utils.goTStore(this.a, adJoinInfoVo.getMkt_app_id(), false);
                }
                str = strGoAndroidMarket;
            } else if (iHashCode == 87 && mkt_id.equals("W")) {
                String ppiMarketUrlInternal = AdJoinInfoVoKt.getPpiMarketUrlInternal(adJoinInfoVo);
                if (adListVo.getAdType() == 4) {
                    if (Intrinsics.areEqual(adJoinInfoVo.getWebview_yn(), "Y")) {
                        CpsDetailWebDialog cpsDetailWebDialog = new CpsDetailWebDialog(this.a, ppiMarketUrlInternal);
                        cpsDetailWebDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.tnkfactory.ad.off.AdEventHandler$$ExternalSyntheticLambda1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                AdEventHandler.a(adListVo, dialogInterface);
                            }
                        });
                        cpsDetailWebDialog.show();
                    } else {
                        Utils.goWebPage(this.a, ppiMarketUrlInternal, true);
                    }
                } else if (Intrinsics.areEqual(adJoinInfoVo.getWebview_yn(), "Y")) {
                    if (adJoinInfoVo.getCnts_type() == 3) {
                        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.b), putChannelInfo.onExtraCallback(), (setRandomHost) null, new w(adJoinInfoVo, adListVo, this, adEventListener, null), 2, (Object) null);
                    } else if (Intrinsics.areEqual(adJoinInfoVo.getWebview_type(), "T")) {
                        TenqubeDetailWebViewActivity.Companion.start(this.a, ppiMarketUrlInternal);
                    } else {
                        AdDetailWebView.Companion.newInstance(ppiMarketUrlInternal, String.valueOf(adListVo.getAppId()), adListVo.getTitle()).show(this.a.getSupportFragmentManager(), "");
                    }
                } else {
                    Utils.goWebPage(this.a, ppiMarketUrlInternal, true);
                }
                str = ppiMarketUrlInternal;
            }
            Utils.showAlert(this.a, Resources.getResources().error_no_market);
            str = strGoAndroidMarket;
        }
        if (!TextUtils.isEmpty(str)) {
            Settings.INSTANCE.addUserJoinedAppMarketInfo(this.a, adListVo.getAppId(), str, adListVo.getApp_pkg());
            adEventListener.onComplete(adListVo, true);
        } else {
            Logger.d("url is empty");
        }
    }

    public static final void a(AdListVo adListVo, DialogInterface dialogInterface) {
        TnkAdAnalytics tnkAdAnalytics = TnkAdAnalytics.INSTANCE;
        HashMap<String, String> map = new HashMap<>();
        map.put("item_id", String.valueOf(adListVo.getAppId()));
        map.put("item_name", adListVo.getTitle());
        Unit unit = Unit.INSTANCE;
        tnkAdAnalytics.logEvent("ad_detail_close", map);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AdListVo adListVo, AdEventListener adEventListener, access13800 access13800Var) {
        v vVar;
        Object next;
        final AdActionInfoVo adActionInfoVo;
        Object objRequestPayForAttend;
        final AdEventHandler adEventHandler;
        final AdListVo adListVo2;
        final AdEventListener adEventListener2 = adEventListener;
        if (access13800Var instanceof v) {
            vVar = (v) access13800Var;
            int i2 = vVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.g = i2 - 2147483648;
            } else {
                vVar = new v(this, access13800Var);
            }
        }
        v vVar2 = vVar;
        Object obj = vVar2.e;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = vVar2.g;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            long packageFirstInstallTime = Utils.getPackageFirstInstallTime(this.a, adListVo.getApp_pkg());
            long lastAttendTime = Settings.INSTANCE.getLastAttendTime(this.a, adListVo.getAppId());
            Iterator<T> it = adListVo.getCampaignItems().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (!((AdActionInfoVo) next).getPayYn()) {
                    break;
                }
            }
            adActionInfoVo = (AdActionInfoVo) next;
            if (adActionInfoVo == null) {
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.b), putChannelInfo.onExtraCallback(), (setRandomHost) null, new c(this, adEventListener2, null), 2, (Object) null);
                return Unit.INSTANCE;
            }
            TnkOffRepository offRepository = TnkCore.INSTANCE.getOffRepository();
            long appId = adListVo.getAppId();
            long campaignId = adActionInfoVo.getCampaignId();
            int actionId = adActionInfoVo.getActionId();
            vVar2.a = this;
            vVar2.b = adListVo;
            vVar2.c = adEventListener2;
            vVar2.d = adActionInfoVo;
            vVar2.g = 1;
            objRequestPayForAttend = offRepository.requestPayForAttend(appId, campaignId, actionId, packageFirstInstallTime, lastAttendTime, vVar2);
            if (objRequestPayForAttend == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            adEventHandler = this;
            adListVo2 = adListVo;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AdActionInfoVo adActionInfoVo2 = vVar2.d;
            AdEventListener adEventListener3 = vVar2.c;
            adListVo2 = vVar2.b;
            adEventHandler = vVar2.a;
            ResultKt.onNavigationEvent(obj);
            objRequestPayForAttend = obj;
            adActionInfoVo = adActionInfoVo2;
            adEventListener2 = adEventListener3;
        }
        ((TnkResultTask) objRequestPayForAttend).setOnSuccess(new Function1() { // from class: com.tnkfactory.ad.off.AdEventHandler$$ExternalSyntheticLambda6
            public final Object invoke(Object obj2) {
                return AdEventHandler.a(adActionInfoVo, adEventHandler, adListVo2, adEventListener2, (PayForAttendVo) obj2);
            }
        }).setOnError(new Function1() { // from class: com.tnkfactory.ad.off.AdEventHandler$$ExternalSyntheticLambda7
            public final Object invoke(Object obj2) {
                return AdEventHandler.a(adEventListener2, (TnkError) obj2);
            }
        }).execute();
        return Unit.INSTANCE;
    }

    public static final Unit a(AdActionInfoVo adActionInfoVo, AdEventHandler adEventHandler, AdListVo adListVo, AdEventListener adEventListener, PayForAttendVo payForAttendVo) {
        Intrinsics.checkNotNullParameter(payForAttendVo, "");
        adActionInfoVo.setPayYn(true);
        Settings.INSTANCE.setLastAttendTime(adEventHandler.a, adListVo.getAppId(), System.currentTimeMillis());
        adEventListener.onComplete(adListVo, true);
        return Unit.INSTANCE;
    }

    public static final Unit a(AdEventListener adEventListener, TnkError tnkError) {
        Intrinsics.checkNotNullParameter(tnkError, "");
        adEventListener.onError(tnkError);
        return Unit.INSTANCE;
    }
}
