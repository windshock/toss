package com.tnkfactory.ad.rwd;

import android.content.Context;
import com.alibaba.ariver.kernel.RVParams;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.tnkfactory.ad.off.data.CampaignTypeNameListVo;
import com.tnkfactory.ad.off.data.CampaignTypeNameVo;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class CampaignType {
    public static final CampaignType INSTANCE = new CampaignType();
    public static final HashMap a = new HashMap();

    public final String getCampaignName(int i2) {
        String str = (String) a.get(Integer.valueOf(i2));
        return str == null ? getDefaultCampaignName(i2) : str;
    }

    public final HashMap<Integer, String> getCampaignType() {
        return a;
    }

    public final String getDefaultCampaignName(int i2) {
        if (i2 == 259) {
            return "담으면";
        }
        if (i2 == 260) {
            return "신청하면";
        }
        if (i2 == 399) {
            return "시청하면";
        }
        if (i2 == 400) {
            return "구매하면";
        }
        if (i2 == 402 || i2 == 403) {
            return "결제하면";
        }
        if (i2 == 411 || i2 == 412) {
            return "10,000원당";
        }
        switch (i2) {
            case 100:
                return "받으면";
            case 101:
                return "오픈하면";
            case 102:
            case 103:
                return "로그인하면";
            case 104:
                return "가입하면";
            case 105:
            case 106:
            case 107:
                return "참여하면";
            case 108:
            case 109:
                return "클릭하면";
            case 110:
                return "참여하면";
            default:
                if (i2 == 190) {
                    return "기사보면";
                }
                if (i2 == 226) {
                    return "미션달성 시";
                }
                switch (i2) {
                    case 198:
                    case 199:
                        return "참여하면";
                    case RVParams.WEBVIEW_FONT_SIZE_LARGEST /* 200 */:
                        return "좋아요하면";
                    case 201:
                    case 202:
                        return "팔로우하면";
                    case 203:
                        return "소식받으면";
                    case 204:
                        return "가입하면";
                    case 205:
                        return "참여하면";
                    case 206:
                        return "구독하면";
                    case 207:
                        return "가입하면";
                    case 208:
                        return "구독하면";
                    case 209:
                        return "채널추가하면";
                    case 210:
                        return "구독하면";
                    case 211:
                        return "추가하면";
                    case 212:
                    case 213:
                        return "팔로우하면";
                    default:
                        switch (i2) {
                            default:
                                switch (i2) {
                                    case 228:
                                    case 229:
                                    case 230:
                                    case 231:
                                    case 232:
                                    case 233:
                                        break;
                                    default:
                                        switch (i2) {
                                            case 251:
                                            case 252:
                                                return "참여하면";
                                            case 253:
                                                return "가입하면";
                                            case 254:
                                                return "조회하면";
                                            default:
                                                switch (i2) {
                                                    case 298:
                                                    case 299:
                                                        break;
                                                    case 300:
                                                    case 301:
                                                    case 302:
                                                    case 303:
                                                        return "시청하면";
                                                    default:
                                                        return "기타";
                                                }
                                            case OggPageHeader.MAX_SEGMENT_COUNT /* 255 */:
                                            case 256:
                                            case 257:
                                                return "참여하면";
                                        }
                                }
                            case 220:
                            case 221:
                            case 222:
                            case 223:
                                return "미션달성 시";
                        }
                }
        }
    }

    public final void updateCampaignType(@NotNull Context context, @NotNull String str) throws JSONException {
        String campaignTypeJsonString;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Settings settings = Settings.INSTANCE;
        if (Intrinsics.areEqual(str, settings.getCampaignTypeUrl(context))) {
            campaignTypeJsonString = settings.getCampaignTypeJsonString(context);
        } else {
            URL url = new URL(str);
            campaignTypeJsonString = new String(TextStreamsKt.readBytes(url), Charsets.UTF_8);
        }
        JSONObject jSONObject = new JSONObject(campaignTypeJsonString);
        int i2 = jSONObject.getInt("list_count");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("list");
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
            int i4 = jSONObject2.getInt("cmpn_type");
            String string = jSONObject2.getString("cmpn_type_nm");
            Intrinsics.checkNotNullExpressionValue(string, "");
            arrayList.add(new CampaignTypeNameVo(i4, string));
        }
        for (CampaignTypeNameVo campaignTypeNameVo : new CampaignTypeNameListVo(arrayList, i2).getList()) {
            HashMap map = a;
            if (map.get(Integer.valueOf(campaignTypeNameVo.getCmpn_type())) == null) {
                map.put(Integer.valueOf(campaignTypeNameVo.getCmpn_type()), campaignTypeNameVo.getCmpn_type_nm());
            }
        }
    }
}
