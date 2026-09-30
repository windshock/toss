package com.tnkfactory.ad.off.data;

import android.content.Context;
import android.text.TextUtils;
import com.tnkfactory.ad.repository.db.entity.AdItemDto;
import com.tnkfactory.ad.rwd.CampaignType;
import com.tnkfactory.ad.rwd.Settings;
import com.tnkfactory.ad.rwd.Utils;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdListVoKt {
    public static final String getCampaignName(@NotNull AdListVo adListVo) {
        Intrinsics.checkNotNullParameter(adListVo, "");
        return adListVo.getMultiYn() ? "미션달성 시" : CampaignType.INSTANCE.getCampaignName(adListVo.getCampaignType());
    }

    public static final int getDcRate(@NotNull AdListVo adListVo) {
        Intrinsics.checkNotNullParameter(adListVo, "");
        return (int) (100.0f - ((100.0f / adListVo.getOrg_price()) * adListVo.getPrd_price()));
    }

    public static final boolean hasValidClick(@NotNull AdListVo adListVo, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(adListVo, "");
        Intrinsics.checkNotNullParameter(context, "");
        return System.currentTimeMillis() - Settings.INSTANCE.getUserJoinedMillis(context, adListVo.getAppId()) < 604800000;
    }

    public static final boolean isCorrectItem(@NotNull AdListVo adListVo, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(adListVo, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (adListVo.getOnError() || !Utils.checkTargeting(context, adListVo) || isRemoveFromUser(adListVo, context)) {
            return false;
        }
        return (Intrinsics.areEqual(adListVo.getHideInstalled(), "Y") && isInstalled(adListVo, context) && !hasValidClick(adListVo, context)) ? false : true;
    }

    public static final boolean isEvent(@NotNull AdListVo adListVo) {
        Intrinsics.checkNotNullParameter(adListVo, "");
        return adListVo.getActionId() == 6;
    }

    public static final boolean isInstallComplete(@NotNull AdListVo adListVo, @NotNull Context context) {
        Object next;
        Intrinsics.checkNotNullParameter(adListVo, "");
        Intrinsics.checkNotNullParameter(context, "");
        boolean zHasValidClick = hasValidClick(adListVo, context);
        boolean zIsInstalled = isInstalled(adListVo, context);
        if (adListVo.getCampaignType() != 100 || !zIsInstalled || !zHasValidClick) {
            return false;
        }
        if (adListVo.getCampaignItems().isEmpty()) {
            return true;
        }
        Iterator<T> it = adListVo.getCampaignItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            AdActionInfoVo adActionInfoVo = (AdActionInfoVo) next;
            if (adActionInfoVo.getActionId() == 0 && !adActionInfoVo.getPayYn()) {
                break;
            }
        }
        return next != null;
    }

    public static final boolean isInstalled(@NotNull AdListVo adListVo, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(adListVo, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (Intrinsics.areEqual("W", adListVo.getOsType())) {
            return false;
        }
        return Utils.isPackageInstalled(context, adListVo.getApp_pkg());
    }

    public static final boolean isNews(@NotNull AdListVo adListVo) {
        Intrinsics.checkNotNullParameter(adListVo, "");
        return adListVo.getFilterId() == 101;
    }

    public static final boolean isRemoveFromUser(@NotNull AdListVo adListVo, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(adListVo, "");
        Intrinsics.checkNotNullParameter(context, "");
        return Settings.INSTANCE.getHiddenApps(context).contains(Long.valueOf(adListVo.getAppId())) && adListVo.getInst_dt() == 0 && adListVo.getPay_cnt() == 0;
    }

    public static final boolean isRemoved(@NotNull AdListVo adListVo) {
        Object next;
        Intrinsics.checkNotNullParameter(adListVo, "");
        if (adListVo.getOnError()) {
            return true;
        }
        if (adListVo.getCampaignItems().size() <= 0) {
            return false;
        }
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
        return next == null;
    }

    public static final boolean isVideoContents(@NotNull AdActionInfoVo adActionInfoVo) {
        Intrinsics.checkNotNullParameter(adActionInfoVo, "");
        return (TextUtils.isEmpty(adActionInfoVo.getYoutubeId()) && TextUtils.isEmpty(adActionInfoVo.getVideoUrl())) ? false : true;
    }

    public static final boolean isWebContents(@NotNull AdListVo adListVo) {
        Intrinsics.checkNotNullParameter(adListVo, "");
        return Intrinsics.areEqual("W", adListVo.getOsType());
    }

    public static final boolean payYn(@NotNull AdListVo adListVo) {
        Object next;
        Intrinsics.checkNotNullParameter(adListVo, "");
        Iterator<T> it = adListVo.getCampaignItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AdActionInfoVo) next).getPayYn()) {
                break;
            }
        }
        return next != null;
    }

    public static final AdItemDto toAdListDto(@NotNull AdListVo adListVo) {
        Intrinsics.checkNotNullParameter(adListVo, "");
        return new AdItemDto(adListVo.getAppId(), adListVo.getActionId(), adListVo.getAdType(), adListVo.getAdid_yn(), adListVo.getTitle(), adListVo.getApp_pkg(), adListVo.getCmpn_desc(), adListVo.getCampaignType(), adListVo.getCorp_desc(), adListVo.getDetailYn(), adListVo.getFilterId(), adListVo.getGoods_no(), adListVo.getIa_or1_cnt(), adListVo.getIa_or2_cnt(), adListVo.getIconUrl(), adListVo.getImgUrl(), adListVo.getInst_apps_and(), adListVo.getInst_apps_not(), adListVo.getInst_apps_or1(), adListVo.getInst_apps_or2(), adListVo.getLayout_id(), adListVo.getLike_yn(), adListVo.getMultiYn(), adListVo.getMulti_join_yn(), adListVo.getHideInstalled(), adListVo.getOrg_pnt_amt(), adListVo.getOrg_price(), adListVo.getOsType(), adListVo.getPointAmount(), adListVo.getPointUnit(), adListVo.getPnt_txt(), adListVo.getPrd_price(), adListVo.getWebview_yn(), adListVo.getClickUrl(), adListVo.getApp_desc(), adListVo.getActn_desc(), adListVo.getApp_nm(), adListVo.getPayYn(), adListVo.getCnts_skip(), adListVo.getCnts_type(), adListVo.getCheckUrl(), adListVo.getPay_dt(), adListVo.getPay_cnt(), adListVo.getCmpn_cnt(), adListVo.getValid_lbl(), adListVo.getOnError(), adListVo.getDayLimited(), adListVo.getOrderNumber());
    }

    public static final String toJson(@NotNull AdListVo adListVo) throws JSONException {
        Intrinsics.checkNotNullParameter(adListVo, "");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_id", adListVo.getAppId());
            jSONObject.put("app_nm", adListVo.getApp_nm());
            jSONObject.put("img_url", adListVo.getImgUrl());
            jSONObject.put("icon_url", adListVo.getIconUrl());
            jSONObject.put("pnt_amt", adListVo.getPointAmount());
            jSONObject.put("org_amt", adListVo.getOrg_pnt_amt());
            jSONObject.put("pnt_unit", adListVo.getPointUnit());
            jSONObject.put("prd_price", adListVo.getPrd_price());
            jSONObject.put("org_prd_price", adListVo.getOrg_price());
            jSONObject.put("sale_dc_rate", getDcRate(adListVo));
            jSONObject.put("multi_yn", adListVo.getMultiYn());
            jSONObject.put("filter_id", adListVo.getFilterId());
            jSONObject.put("cmpn_type", adListVo.getCampaignType());
            jSONObject.put("cmpn_type_name", getCampaignName(adListVo));
            jSONObject.put("actn_desc", adListVo.getActn_desc());
            jSONObject.put("like_yn", adListVo.getLike_yn());
            String webview_yn = adListVo.getWebview_yn();
            if (webview_yn.length() == 0) {
                webview_yn = "N";
            }
            jSONObject.put("webview_yn", webview_yn);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        } catch (Exception unused) {
            String string2 = new JSONArray().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }
    }

    public static final AdListVo toAdListVo(@NotNull AdItemDto adItemDto) {
        Intrinsics.checkNotNullParameter(adItemDto, "");
        return new AdListVo(adItemDto.getAppId(), adItemDto.getActionId(), adItemDto.getAdType(), adItemDto.getAdid_yn(), adItemDto.getTitle(), adItemDto.getApp_pkg(), adItemDto.getCmpn_desc(), adItemDto.getCampaignType(), adItemDto.getCorp_desc(), adItemDto.getDetailYn(), adItemDto.getFilterId(), adItemDto.getGoods_no(), adItemDto.getIa_or1_cnt(), adItemDto.getIa_or2_cnt(), adItemDto.getIconUrl(), adItemDto.getImgUrl(), adItemDto.getInst_apps_and(), adItemDto.getInst_apps_not(), adItemDto.getInst_apps_or1(), adItemDto.getInst_apps_or2(), adItemDto.getLayout_id(), adItemDto.getLike_yn(), adItemDto.getMultiYn(), adItemDto.getMulti_join_yn(), adItemDto.getHideInstalled(), adItemDto.getOrg_pnt_amt(), adItemDto.getOrg_price(), adItemDto.getOsType(), adItemDto.getPointAmount(), adItemDto.getPointUnit(), adItemDto.getPnt_txt(), adItemDto.getPrd_price(), adItemDto.getWebview_yn(), adItemDto.getClickUrl(), adItemDto.getApp_desc(), adItemDto.getActn_desc(), adItemDto.getApp_nm(), adItemDto.getPayYn(), adItemDto.getCnts_skip(), adItemDto.getCnts_type(), adItemDto.getCheckUrl(), adItemDto.getPay_dt(), adItemDto.getPay_cnt(), adItemDto.getCmpn_cnt(), adItemDto.getValid_lbl(), 0L, adItemDto.getOnError(), adItemDto.getDayLimited(), adItemDto.getOrderNumber(), null, 0, 139264, null);
    }
}
