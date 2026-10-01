package com.tnkfactory.ad.repository.rpc.parser;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.tnkfactory.ad.TnkAdConfig;
import com.tnkfactory.ad.TnkAdLayoutConfig;
import com.tnkfactory.ad.off.data.AdActionInfoVo;
import com.tnkfactory.ad.off.data.AdJoinInfoVo;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.CpsFavoriteKeywardVo;
import com.tnkfactory.ad.off.data.EventListVo;
import com.tnkfactory.ad.off.data.PayForAttendVo;
import com.tnkfactory.ad.off.data.PayForInstallVo;
import com.tnkfactory.ad.off.data.PlacementPubInfo;
import com.tnkfactory.ad.off.data.RecommendList;
import com.tnkfactory.ad.rwd.BannerItem;
import com.tnkfactory.ad.rwd.PubInfo;
import com.tnkfactory.ad.rwd.data.MultiCampaignJoinListItem;
import com.tnkfactory.ad.rwd.data.view.AdListCuration;
import com.tnkfactory.ad.rwd.data.view.CategorySet;
import com.tnkfactory.ad.rwd.data.view.Filter;
import com.tnkfactory.framework.vo.ValueObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdListParser {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final AdListParser INSTANCE;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        onExtraCallbackWithResult();
        INSTANCE = new AdListParser();
        int i2 = onNavigationEvent + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public final ArrayList<EventListVo> parserEventList(@NotNull ValueObject valueObject) {
        int size;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(valueObject, "");
        ArrayList<EventListVo> arrayList = new ArrayList<>();
        if (valueObject.size() > 0) {
            int i4 = onWarmupCompleted + 115;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                size = valueObject.size();
                i2 = 1;
            } else {
                size = valueObject.size();
                i2 = 0;
            }
            while (i2 < size) {
                int i5 = onWarmupCompleted + 13;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    ValueObject rowAsVo = valueObject.getRowAsVo(i2);
                    Intrinsics.checkNotNull(rowAsVo, "");
                    arrayList.add(parserEventItem(rowAsVo));
                    i2 += 12;
                } else {
                    ValueObject rowAsVo2 = valueObject.getRowAsVo(i2);
                    Intrinsics.checkNotNull(rowAsVo2, "");
                    arrayList.add(parserEventItem(rowAsVo2));
                    i2++;
                }
            }
        }
        return arrayList;
    }

    public final PayForInstallVo parsePayForInstall(@NotNull ValueObject valueObject) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(valueObject, "");
        long j = valueObject.getLong("pay_pnt");
        int i3 = valueObject.getInt("actn_id");
        String string = valueObject.getString("pay_yn", "");
        Intrinsics.checkNotNullExpressionValue(string, "");
        PayForInstallVo payForInstallVo = new PayForInstallVo(j, i3, string, valueObject.getLong("adv_app_id"), valueObject.getInt("ret_cd", 500));
        int i4 = onWarmupCompleted + 121;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return payForInstallVo;
        }
        throw null;
    }

    public final PayForAttendVo parsePayForAttend(@NotNull ValueObject valueObject) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(valueObject, "");
        long j = valueObject.getLong("pay_pnt");
        int i3 = valueObject.getInt("actn_id");
        String string = valueObject.getString("pay_yn", "");
        Intrinsics.checkNotNullExpressionValue(string, "");
        PayForAttendVo payForAttendVo = new PayForAttendVo(j, i3, string, valueObject.getInt("left_hour"), valueObject.getLong("adv_app_id"), valueObject.getInt("ret_cd", 500));
        int i4 = onExtraCallback + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return payForAttendVo;
    }

    public final RecommendList parserRecommendList(@NotNull ValueObject valueObject) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(valueObject, "");
        Object obj = valueObject.get("rec_list");
        Intrinsics.checkNotNull(obj, "");
        ArrayList<AdListVo> adListItem = parseAdListItem((ValueObject) obj);
        Object obj2 = valueObject.get("pop_list");
        Intrinsics.checkNotNull(obj2, "");
        ArrayList<AdListVo> adListItem2 = parseAdListItem((ValueObject) obj2);
        Object obj3 = valueObject.get("evt_list");
        Intrinsics.checkNotNull(obj3, "");
        ArrayList<EventListVo> arrayList = parserEventList((ValueObject) obj3);
        Object obj4 = valueObject.get("ad_list");
        Intrinsics.checkNotNull(obj4, "");
        ArrayList<AdListVo> adListItem3 = parseAdListItem((ValueObject) obj4);
        Object obj5 = valueObject.get("pub_info");
        Intrinsics.checkNotNull(obj5, "");
        PubInfo pubInfo = parsePubInfo((ValueObject) obj5);
        Object[] objArr = new Object[1];
        a(new int[]{0, 6, 84, 6}, false, new byte[]{0, 1, 0, 0, 1, 0}, objArr);
        String string = valueObject.getString(((String) objArr[0]).intern(), "");
        Intrinsics.checkNotNullExpressionValue(string, "");
        RecommendList recommendList = new RecommendList(adListItem, adListItem2, arrayList, adListItem3, pubInfo, string);
        int i3 = onWarmupCompleted + 115;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return recommendList;
        }
        throw null;
    }

    public final PlacementPubInfo parsePlacementPubInfo(@NotNull ValueObject valueObject) {
        String str;
        String str2;
        String str3;
        String str4;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(valueObject, "");
        int i3 = valueObject.getInt("ad_type");
        String string = valueObject.getString("plcmt_title");
        if (string == null) {
            int i4 = onExtraCallback + 117;
            int i5 = i4 % 128;
            onWarmupCompleted = i5;
            if (i4 % 2 == 0) {
                int i6 = 19 / 0;
            }
            int i7 = i5 + 63;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            str = "";
        } else {
            str = string;
        }
        String string2 = valueObject.getString("more_lbl");
        String str5 = string2 == null ? "" : string2;
        String string3 = valueObject.getString("cust_data");
        if (string3 == null) {
            int i9 = onExtraCallback + 113;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str2 = "";
        } else {
            str2 = string3;
        }
        String string4 = valueObject.getString("ctype_surl");
        if (string4 == null) {
            int i10 = onExtraCallback + 3;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            str3 = "";
        } else {
            str3 = string4;
        }
        String string5 = valueObject.getString("pnt_unit");
        String str6 = string5 == null ? "" : string5;
        String string6 = valueObject.getString("plcmt_id");
        if (string6 == null) {
            int i12 = onExtraCallback + 49;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 31 / 0;
            }
            str4 = "";
        } else {
            str4 = string6;
        }
        return new PlacementPubInfo(i3, str, str5, str2, str3, str6, str4);
    }

    public final PubInfo parsePubInfo(@NotNull ValueObject valueObject) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(valueObject, "");
        String string = valueObject.getString("hdr_msg");
        String str6 = string == null ? "" : string;
        long j = valueObject.getLong("multi_pnt");
        int i3 = valueObject.getInt("multi_cnt");
        String string2 = valueObject.getString("pnt_unit");
        if (string2 == null) {
            int i4 = onWarmupCompleted + 75;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            str = "";
        } else {
            str = string2;
        }
        String string3 = valueObject.getString("eclck_url");
        if (string3 == null) {
            int i6 = onWarmupCompleted + 105;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            str2 = "";
        } else {
            str2 = string3;
        }
        String string4 = valueObject.getString("eimg_url");
        if (string4 == null) {
            int i7 = onExtraCallback + 101;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            str3 = "";
        } else {
            str3 = string4;
        }
        String string5 = valueObject.getString("ctype_surl");
        if (string5 == null) {
            int i9 = onWarmupCompleted + 55;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            str4 = "";
        } else {
            str4 = string5;
        }
        String string6 = valueObject.getString("cat_show_yn");
        if (string6 == null) {
            int i11 = onWarmupCompleted + 29;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            str5 = "Y";
        } else {
            str5 = string6;
        }
        String string7 = valueObject.getString("filter_show_yn");
        return new PubInfo(str6, j, str, i3, str2, str3, str4, str5, string7 == null ? "Y" : string7);
    }

    public final ArrayList<CpsFavoriteKeywardVo> parseCpsFavoriteKeywardVo(@NotNull ValueObject valueObject) {
        int size;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(valueObject, "");
        ArrayList<CpsFavoriteKeywardVo> arrayList = new ArrayList<>();
        if (!valueObject.isEmpty()) {
            int i4 = onWarmupCompleted + 63;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                size = valueObject.size();
                i2 = 1;
            } else {
                size = valueObject.size();
                i2 = 0;
            }
            while (i2 < size) {
                ValueObject rowAsVo = valueObject.getRowAsVo(i2);
                Intrinsics.checkNotNull(rowAsVo, "");
                int i5 = rowAsVo.getInt("rank", 0);
                String string = rowAsVo.getString("keyword", "");
                Intrinsics.checkNotNullExpressionValue(string, "");
                arrayList.add(new CpsFavoriteKeywardVo(i5, string, rowAsVo.getInt("label", 0)));
                i2++;
            }
        }
        int i6 = onExtraCallback + 101;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return arrayList;
    }

    public final EventListVo parserEventItem(@NotNull ValueObject valueObject) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(valueObject, "");
        long j = valueObject.getLong("app_id", 0L);
        String string = valueObject.getString("app_nm", "");
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = valueObject.getString("app_desc", "");
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = valueObject.getString("payYn", "");
        Intrinsics.checkNotNullExpressionValue(string3, "");
        long j2 = valueObject.getLong("paid_pnt", 0L);
        int i3 = valueObject.getInt("evt_cnt", 0);
        int i4 = valueObject.getInt("join_cnt", 0);
        String string4 = valueObject.getString("clck_url", "");
        Intrinsics.checkNotNullExpressionValue(string4, "");
        String string5 = valueObject.getString("cnts_url", "");
        Intrinsics.checkNotNullExpressionValue(string5, "");
        int i5 = valueObject.getInt("cnts_skip", 0);
        long j3 = valueObject.getLong("pnt_amt", 0L);
        int i6 = valueObject.getInt("actn_id", -1);
        String string6 = valueObject.getString("webview_yn", "N");
        Intrinsics.checkNotNullExpressionValue(string6, "");
        String string7 = valueObject.getString("cat_id", "");
        Intrinsics.checkNotNullExpressionValue(string7, "");
        String string8 = valueObject.getString("adid_yn", "");
        Intrinsics.checkNotNullExpressionValue(string8, "");
        String string9 = valueObject.getString("pnt_unit", "");
        Intrinsics.checkNotNullExpressionValue(string9, "");
        int i7 = valueObject.getInt("layout_id", 0);
        String string10 = valueObject.getString("icon_url", "");
        Intrinsics.checkNotNullExpressionValue(string10, "");
        EventListVo eventListVo = new EventListVo(j, string, string2, string3, j2, i3, i4, string4, string5, i5, j3, i6, string6, string7, string8, string9, i7, string10);
        int i8 = onWarmupCompleted + 117;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return eventListVo;
        }
        throw null;
    }

    public final AdJoinInfoVo parseJoinItem(@NotNull ValueObject valueObject) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(valueObject, "");
        String string = valueObject.getString("adid_yn", "");
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = valueObject.getString("stat_cd", "");
        Intrinsics.checkNotNullExpressionValue(string2, "");
        int i3 = valueObject.getInt("up_cust_id", 0);
        int i4 = valueObject.getInt("cnt", 0);
        int i5 = valueObject.getInt("ownr_id", 0);
        int i6 = valueObject.getInt("cnts_skip", 0);
        int i7 = valueObject.getInt("ip_max", 0);
        String string3 = valueObject.getString("webview_yn", "");
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = valueObject.getString("webview_type", "");
        Intrinsics.checkNotNullExpressionValue(string4, "");
        int i8 = valueObject.getInt("ret_cd", 500);
        String string5 = valueObject.getString("pub_advurl", "");
        Intrinsics.checkNotNullExpressionValue(string5, "");
        String string6 = valueObject.getString("inhs_yn", "");
        Intrinsics.checkNotNullExpressionValue(string6, "");
        int i9 = valueObject.getInt("cnts_type", 0);
        String string7 = valueObject.getString("os_type", "");
        Intrinsics.checkNotNullExpressionValue(string7, "");
        String string8 = valueObject.getString("apk_key", "");
        Intrinsics.checkNotNullExpressionValue(string8, "");
        String string9 = valueObject.getString("all_yn", "");
        Intrinsics.checkNotNullExpressionValue(string9, "");
        int i10 = valueObject.getInt("actn_id", 0);
        String string10 = valueObject.getString("mkt_id", "");
        Intrinsics.checkNotNullExpressionValue(string10, "");
        String string11 = valueObject.getString("mkt_app_id", "");
        Intrinsics.checkNotNullExpressionValue(string11, "");
        String string12 = valueObject.getString("fad_yn", "");
        Intrinsics.checkNotNullExpressionValue(string12, "");
        String string13 = valueObject.getString("check_url", "");
        Intrinsics.checkNotNullExpressionValue(string13, "");
        AdJoinInfoVo adJoinInfoVo = new AdJoinInfoVo(string, string2, i3, i4, i5, i6, i7, string3, string4, i8, string5, string6, i9, string7, string8, string9, i10, string10, string11, string12, string13, valueObject.getInt("ui_option", 0));
        int i11 = onExtraCallback + 7;
        onWarmupCompleted = i11 % 128;
        int i12 = i11 % 2;
        return adJoinInfoVo;
    }

    public final ArrayList<AdListVo> parseNewsListVo(@Nullable ValueObject valueObject) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        String str5;
        Integer num2;
        int iIntValue;
        Integer num3;
        int iIntValue2;
        int i2 = 2;
        int i3 = 2 % 2;
        if (valueObject == null) {
            return new ArrayList<>();
        }
        ArrayList<AdListVo> arrayList = new ArrayList<>();
        int size = valueObject.size() - 1;
        if (size >= 0) {
            int i4 = 0;
            while (true) {
                ValueObject rowAsVo = valueObject.getRowAsVo(i4);
                Intrinsics.checkNotNull(rowAsVo, "");
                Object obj = rowAsVo.get("app_id");
                long jIntValue = (obj instanceof Integer ? (Integer) obj : null) != null ? r8.intValue() : 0L;
                Object obj2 = rowAsVo.get("app_nm");
                String str6 = obj2 instanceof String ? (String) obj2 : null;
                String str7 = str6 == null ? "" : str6;
                Object obj3 = rowAsVo.get("icon_url");
                String str8 = obj3 instanceof String ? (String) obj3 : null;
                if (str8 == null) {
                    int i5 = onExtraCallback + 27;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % i2;
                    str = "";
                } else {
                    str = str8;
                }
                Object obj4 = rowAsVo.get("img_url");
                String str9 = obj4 instanceof String ? (String) obj4 : null;
                String str10 = str9 == null ? "" : str9;
                Object obj5 = rowAsVo.get("clck_url");
                if (obj5 instanceof String) {
                    int i7 = onExtraCallback + 75;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % i2 == 0) {
                        str2 = (String) obj5;
                        int i8 = 10 / 0;
                    } else {
                        str2 = (String) obj5;
                    }
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    int i9 = onExtraCallback + 91;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % i2;
                    str3 = "";
                } else {
                    str3 = str2;
                }
                Object obj6 = rowAsVo.get("cmpn_type");
                Integer num4 = obj6 instanceof Integer ? (Integer) obj6 : null;
                int iIntValue3 = num4 != null ? num4.intValue() : 0;
                Object obj7 = rowAsVo.get("filter_id");
                Integer num5 = !(obj7 instanceof Integer) ? null : (Integer) obj7;
                int iIntValue4 = num5 != null ? num5.intValue() : 0;
                Object obj8 = rowAsVo.get("app_desc");
                String str11 = obj8 instanceof String ? (String) obj8 : null;
                String str12 = str11 == null ? "" : str11;
                Object obj9 = rowAsVo.get("actn_desc");
                String str13 = obj9 instanceof String ? (String) obj9 : null;
                String str14 = str13 == null ? "" : str13;
                Object obj10 = rowAsVo.get("pnt_unit");
                String str15 = obj10 instanceof String ? (String) obj10 : null;
                if (str15 == null) {
                    int i11 = onExtraCallback + 47;
                    onWarmupCompleted = i11 % 128;
                    if (i11 % i2 == 0) {
                        int i12 = 60 / 0;
                    }
                    str4 = "";
                } else {
                    str4 = str15;
                }
                String string = rowAsVo.getString("pnt_txt", "");
                Intrinsics.checkNotNullExpressionValue(string, "");
                Object obj11 = rowAsVo.get("org_pnt_amt");
                if (obj11 instanceof Integer) {
                    int i13 = onExtraCallback + 5;
                    onWarmupCompleted = i13 % 128;
                    if (i13 % i2 == 0) {
                        throw null;
                    }
                    num = (Integer) obj11;
                } else {
                    num = null;
                }
                long jIntValue2 = num != null ? num.intValue() : 0L;
                Object obj12 = rowAsVo.get("pnt_amt");
                long jIntValue3 = (obj12 instanceof Integer ? (Integer) obj12 : null) != null ? r12.intValue() : 0L;
                Object obj13 = rowAsVo.get("adid_yn");
                String str16 = obj13 instanceof String ? (String) obj13 : null;
                String str17 = str16 == null ? "" : str16;
                Object obj14 = rowAsVo.get("detail_yn");
                String str18 = (obj14 instanceof String) ^ true ? null : (String) obj14;
                if (str18 == null) {
                    int i14 = onWarmupCompleted + 75;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % i2;
                    str5 = "";
                } else {
                    str5 = str18;
                }
                Object obj15 = rowAsVo.get("webview_yn");
                String str19 = obj15 instanceof String ? (String) obj15 : null;
                String str20 = str19 == null ? "" : str19;
                Object obj16 = rowAsVo.get("pay_yn");
                String str21 = obj16 instanceof String ? (String) obj16 : null;
                String str22 = str21 == null ? "" : str21;
                Object obj17 = rowAsVo.get("actn_id");
                if (obj17 instanceof Integer) {
                    int i16 = onExtraCallback + 35;
                    onWarmupCompleted = i16 % 128;
                    if (i16 % i2 == 0) {
                        num2 = (Integer) obj17;
                        int i17 = 57 / 0;
                    } else {
                        num2 = (Integer) obj17;
                    }
                } else {
                    num2 = null;
                }
                if (num2 != null) {
                    int i18 = onWarmupCompleted + 29;
                    onExtraCallback = i18 % 128;
                    int i19 = i18 % i2;
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 0;
                }
                Object obj18 = rowAsVo.get("cnts_type");
                if (obj18 instanceof Integer) {
                    int i20 = onExtraCallback + 25;
                    onWarmupCompleted = i20 % 128;
                    if (i20 % i2 == 0) {
                        num3 = (Integer) obj18;
                        int i21 = 3 / 0;
                    } else {
                        num3 = (Integer) obj18;
                    }
                } else {
                    num3 = null;
                }
                int iIntValue5 = num3 != null ? num3.intValue() : 0;
                Object obj19 = rowAsVo.get("cnts_skip");
                Integer num6 = obj19 instanceof Integer ? (Integer) obj19 : null;
                if (num6 != null) {
                    int i22 = onExtraCallback + 79;
                    onWarmupCompleted = i22 % 128;
                    int i23 = i22 % i2;
                    iIntValue2 = num6.intValue();
                } else {
                    iIntValue2 = 0;
                }
                Object obj20 = rowAsVo.get("check_url");
                String str23 = obj20 instanceof String ? (String) obj20 : null;
                int i24 = i4;
                arrayList.add(new AdListVo(jIntValue, iIntValue, 0, str17, null, null, null, iIntValue3, null, str5, iIntValue4, null, 0, 0, str, str10, null, null, null, null, 0, null, false, false, null, jIntValue2, 0L, null, jIntValue3, str4, string, 0L, str20, str3, str12, str14, str7, str22, iIntValue2, iIntValue5, str23 == null ? "" : str23, 0, 0, 0L, null, 0L, false, false, i24, null, -1912653452, 196096, null));
                if (i24 == size) {
                    break;
                }
                i4 = i24 + 1;
                i2 = 2;
            }
        }
        return arrayList;
    }

    public final AdListVo parseAdItem(@NotNull ValueObject valueObject) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(valueObject, "");
        int i3 = valueObject.getInt("actn_id", -1);
        int i4 = valueObject.getInt("ad_type", -1);
        String string = valueObject.getString("adid_yn", "");
        Intrinsics.checkNotNullExpressionValue(string, "");
        long j = valueObject.getLong("app_id", 0L);
        String string2 = valueObject.getString("app_nm", "");
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = valueObject.getString("app_pkg", "");
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = valueObject.getString("cmpn_desc", "");
        Intrinsics.checkNotNullExpressionValue(string4, "");
        int i5 = valueObject.getInt("cmpn_type", -1);
        String string5 = valueObject.getString("corp_desc", "");
        Intrinsics.checkNotNullExpressionValue(string5, "");
        String string6 = valueObject.getString("detail_yn", "");
        Intrinsics.checkNotNullExpressionValue(string6, "");
        int i6 = valueObject.getInt("filter_id", -1);
        String string7 = valueObject.getString("goods_no", "");
        Intrinsics.checkNotNullExpressionValue(string7, "");
        int i7 = valueObject.getInt("ia_or1_cnt", 0);
        int i8 = valueObject.getInt("ia_or2_cnt", 0);
        String string8 = valueObject.getString("icon_url", "");
        Intrinsics.checkNotNullExpressionValue(string8, "");
        String string9 = valueObject.getString("img_url", "");
        Intrinsics.checkNotNullExpressionValue(string9, "");
        String string10 = valueObject.getString("inst_apps_and", "");
        Intrinsics.checkNotNullExpressionValue(string10, "");
        String string11 = valueObject.getString("inst_apps_not", "");
        Intrinsics.checkNotNullExpressionValue(string11, "");
        String string12 = valueObject.getString("inst_apps_or1", "");
        Intrinsics.checkNotNullExpressionValue(string12, "");
        String string13 = valueObject.getString("inst_apps_or2", "");
        Intrinsics.checkNotNullExpressionValue(string13, "");
        int i9 = valueObject.getInt("layout_id", 0);
        String string14 = valueObject.getString("like_yn", "");
        Intrinsics.checkNotNullExpressionValue(string14, "");
        boolean zAreEqual = Intrinsics.areEqual(valueObject.getString("multi_yn", ""), "Y");
        boolean zAreEqual2 = Intrinsics.areEqual(valueObject.getString("multi_join_yn", ""), "Y");
        String string15 = valueObject.getString("no_inst", "N");
        Intrinsics.checkNotNullExpressionValue(string15, "");
        long j2 = valueObject.getLong("org_pnt_amt", 0L);
        long j3 = valueObject.getLong("org_price", 0L);
        String string16 = valueObject.getString("os_type", "");
        Intrinsics.checkNotNullExpressionValue(string16, "");
        long j4 = valueObject.getLong("pnt_amt", 0L);
        String string17 = valueObject.getString("pnt_unit", "");
        Intrinsics.checkNotNullExpressionValue(string17, "");
        String string18 = valueObject.getString("pnt_txt", "");
        Intrinsics.checkNotNullExpressionValue(string18, "");
        long j5 = valueObject.getLong("prd_price", 0L);
        int i10 = valueObject.getInt("cnts_type", 0);
        String string19 = valueObject.getString("clck_url", "");
        Intrinsics.checkNotNullExpressionValue(string19, "");
        String string20 = valueObject.getString("webview_yn", "");
        Intrinsics.checkNotNullExpressionValue(string20, "");
        String string21 = valueObject.getString("pay_yn", "");
        Intrinsics.checkNotNullExpressionValue(string21, "");
        int i11 = valueObject.getInt("cnts_skip", 0);
        int i12 = valueObject.getInt("pay_dt", 0);
        int i13 = valueObject.getInt("pay_cnt", 0);
        long j6 = valueObject.getLong("cmpn_cnt", 0L);
        String string22 = valueObject.getString("valid_lbl", "");
        Intrinsics.checkNotNullExpressionValue(string22, "");
        String string23 = valueObject.getString("actn_desc", "");
        Intrinsics.checkNotNullExpressionValue(string23, "");
        AdListVo adListVo = new AdListVo(j, i3, i4, string, string2, string3, string4, i5, string5, string6, i6, string7, i7, i8, string8, string9, string10, string11, string12, string13, i9, string14, zAreEqual, zAreEqual2, string15, j2, j3, string16, j4, string17, string18, j5, string20, string19, null, string23, null, string21, i11, i10, null, i12, i13, j6, string22, 0L, false, false, 0, null, 0, 188692, null);
        int i14 = onExtraCallback + 11;
        onWarmupCompleted = i14 % 128;
        int i15 = i14 % 2;
        return adListVo;
    }

    public final ArrayList<AdListVo> parseAdListItem(@NotNull ValueObject valueObject) {
        int size;
        int i2;
        ValueObject valueObject2 = valueObject;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(valueObject2, "");
        ArrayList<AdListVo> arrayList = new ArrayList<>();
        if (valueObject.size() > 0) {
            int i4 = onExtraCallback + 105;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                size = valueObject.size();
                i2 = 1;
            } else {
                size = valueObject.size();
                i2 = 0;
            }
            while (i2 < size) {
                ValueObject rowAsVo = valueObject2.getRowAsVo(i2);
                Intrinsics.checkNotNull(rowAsVo, "");
                int i5 = rowAsVo.getInt("actn_id", -1);
                int i6 = rowAsVo.getInt("ad_type", -1);
                String string = rowAsVo.getString("adid_yn", "");
                Intrinsics.checkNotNullExpressionValue(string, "");
                long j = rowAsVo.getLong("app_id", 0L);
                String string2 = rowAsVo.getString("app_nm", "");
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String string3 = rowAsVo.getString("app_nm", "");
                Intrinsics.checkNotNullExpressionValue(string3, "");
                String string4 = rowAsVo.getString("app_pkg", "");
                Intrinsics.checkNotNullExpressionValue(string4, "");
                String string5 = rowAsVo.getString("cmpn_desc", "");
                Intrinsics.checkNotNullExpressionValue(string5, "");
                int i7 = rowAsVo.getInt("cmpn_type", -1);
                String string6 = rowAsVo.getString("corp_desc", "");
                Intrinsics.checkNotNullExpressionValue(string6, "");
                String string7 = rowAsVo.getString("detail_yn", "");
                Intrinsics.checkNotNullExpressionValue(string7, "");
                int i8 = rowAsVo.getInt("filter_id", -1);
                String string8 = rowAsVo.getString("goods_no", "");
                Intrinsics.checkNotNullExpressionValue(string8, "");
                int i9 = rowAsVo.getInt("ia_or1_cnt", 0);
                int i10 = rowAsVo.getInt("ia_or2_cnt", 0);
                String string9 = rowAsVo.getString("icon_url", "");
                Intrinsics.checkNotNullExpressionValue(string9, "");
                String string10 = rowAsVo.getString("img_url", "");
                Intrinsics.checkNotNullExpressionValue(string10, "");
                String string11 = rowAsVo.getString("inst_apps_and", "");
                Intrinsics.checkNotNullExpressionValue(string11, "");
                String string12 = rowAsVo.getString("inst_apps_not", "");
                Intrinsics.checkNotNullExpressionValue(string12, "");
                String string13 = rowAsVo.getString("inst_apps_or1", "");
                Intrinsics.checkNotNullExpressionValue(string13, "");
                String string14 = rowAsVo.getString("inst_apps_or2", "");
                Intrinsics.checkNotNullExpressionValue(string14, "");
                int i11 = rowAsVo.getInt("layout_id", 0);
                String string15 = rowAsVo.getString("like_yn", "");
                Intrinsics.checkNotNullExpressionValue(string15, "");
                boolean zAreEqual = Intrinsics.areEqual(rowAsVo.getString("multi_yn", ""), "Y");
                boolean zAreEqual2 = Intrinsics.areEqual(rowAsVo.getString("multi_join_yn", ""), "Y");
                String string16 = rowAsVo.getString("no_inst", "N");
                Intrinsics.checkNotNullExpressionValue(string16, "");
                int i12 = size;
                long j2 = rowAsVo.getLong("org_pnt_amt", 0L);
                long j3 = rowAsVo.getLong("org_price", 0L);
                String string17 = rowAsVo.getString("os_type", "");
                Intrinsics.checkNotNullExpressionValue(string17, "");
                long j4 = rowAsVo.getLong("pnt_amt", 0L);
                String string18 = rowAsVo.getString("pnt_unit", "");
                Intrinsics.checkNotNullExpressionValue(string18, "");
                String string19 = rowAsVo.getString("pnt_txt", "");
                Intrinsics.checkNotNullExpressionValue(string19, "");
                long j5 = rowAsVo.getLong("prd_price", 0L);
                int i13 = rowAsVo.getInt("cnts_type", 0);
                String string20 = rowAsVo.getString("clck_url", "");
                Intrinsics.checkNotNullExpressionValue(string20, "");
                String string21 = rowAsVo.getString("webview_yn", "");
                Intrinsics.checkNotNullExpressionValue(string21, "");
                String string22 = rowAsVo.getString("pay_yn", "");
                Intrinsics.checkNotNullExpressionValue(string22, "");
                int i14 = rowAsVo.getInt("cnts_skip", 0);
                int i15 = rowAsVo.getInt("pay_dt", 0);
                int i16 = rowAsVo.getInt("pay_cnt", 0);
                long j6 = rowAsVo.getLong("cmpn_cnt", 0L);
                String string23 = rowAsVo.getString("valid_lbl", "");
                Intrinsics.checkNotNullExpressionValue(string23, "");
                String string24 = rowAsVo.getString("actn_desc", "");
                Intrinsics.checkNotNullExpressionValue(string24, "");
                int i17 = i2;
                arrayList.add(new AdListVo(j, i5, i6, string, string3, string4, string5, i7, string6, string7, i8, string8, i9, i10, string9, string10, string11, string12, string13, string14, i11, string15, zAreEqual, zAreEqual2, string16, j2, j3, string17, j4, string18, string19, j5, string21, string20, null, string24, string2, string22, i14, i13, null, i15, i16, j6, string23, 0L, false, false, i17, null, 0, 188676, null));
                i2 = i17 + 1;
                int i18 = onWarmupCompleted + 13;
                onExtraCallback = i18 % 128;
                if (i18 % 2 != 0) {
                    int i19 = 2 / 5;
                }
                valueObject2 = valueObject;
                size = i12;
            }
        }
        return arrayList;
    }

    public final ArrayList<AdActionInfoVo> parseActionItem(@NotNull ValueObject valueObject) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(valueObject, "");
        ArrayList<AdActionInfoVo> arrayList = new ArrayList<>();
        if (valueObject.size() <= 0) {
            arrayList.add(new AdActionInfoVo(0L, 0L, null, null, 0, 0, null, 0, null, null, null, null, null, null, 0L, 0L, false, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, 0, -1, null));
            return arrayList;
        }
        int i3 = onExtraCallback + 89;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int size = valueObject.size();
        for (int i5 = 0; i5 < size; i5++) {
            ValueObject rowAsVo = valueObject.getRowAsVo(i5);
            Intrinsics.checkNotNull(rowAsVo, "");
            long j = rowAsVo.getLong("app_id", 0L);
            long j2 = rowAsVo.getLong("cmpn_id", 0L);
            String string = rowAsVo.getString("app_nm", "");
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = rowAsVo.getString("app_pkg", "");
            Intrinsics.checkNotNullExpressionValue(string2, "");
            int i6 = rowAsVo.getInt("actn_id", -1);
            int i7 = rowAsVo.getInt("cmpn_type");
            String string3 = rowAsVo.getString("actn_desc", "");
            Intrinsics.checkNotNullExpressionValue(string3, "");
            int i8 = rowAsVo.getInt("img_id", 0);
            String string4 = rowAsVo.getString("img_url", "");
            Intrinsics.checkNotNullExpressionValue(string4, "");
            String string5 = rowAsVo.getString("icon_url", "");
            Intrinsics.checkNotNullExpressionValue(string5, "");
            String string6 = rowAsVo.getString("corp_desc", "");
            Intrinsics.checkNotNullExpressionValue(string6, "");
            String string7 = rowAsVo.getString("multi_desc", "");
            Intrinsics.checkNotNullExpressionValue(string7, "");
            String string8 = rowAsVo.getString("app_desc", "");
            Intrinsics.checkNotNullExpressionValue(string8, "");
            String string9 = rowAsVo.getString("pnt_unit", "");
            Intrinsics.checkNotNullExpressionValue(string9, "");
            long j3 = rowAsVo.getLong("org_pnt_amt", 0L);
            long j4 = rowAsVo.getLong("pnt_amt", 0L);
            boolean zEquals = rowAsVo.getString("pay_yn", "").equals("Y");
            String string10 = rowAsVo.getString("adid_yn", "");
            Intrinsics.checkNotNullExpressionValue(string10, "");
            String string11 = rowAsVo.getString("btn_lbl", "");
            Intrinsics.checkNotNullExpressionValue(string11, "");
            String string12 = rowAsVo.getString("vdo_url", "");
            Intrinsics.checkNotNullExpressionValue(string12, "");
            String string13 = rowAsVo.getString("youtube_id", "");
            Intrinsics.checkNotNullExpressionValue(string13, "");
            int i9 = rowAsVo.getInt("vdo_start", 0);
            int i10 = rowAsVo.getInt("vdo_mute", 0);
            int i11 = rowAsVo.getInt("vdo_id", 0);
            String string14 = rowAsVo.getString("vdo_skip", "");
            Intrinsics.checkNotNullExpressionValue(string14, "");
            String string15 = rowAsVo.getString("sns_stat_cd", "");
            Intrinsics.checkNotNullExpressionValue(string15, "");
            String string16 = rowAsVo.getString("join_desc", "");
            Intrinsics.checkNotNullExpressionValue(string16, "");
            String string17 = rowAsVo.getString("prd_price", "");
            Intrinsics.checkNotNullExpressionValue(string17, "");
            String string18 = rowAsVo.getString("org_price", "");
            Intrinsics.checkNotNullExpressionValue(string18, "");
            String string19 = rowAsVo.getString("goods_no", "");
            Intrinsics.checkNotNullExpressionValue(string19, "");
            String string20 = rowAsVo.getString("like_yn", "");
            Intrinsics.checkNotNullExpressionValue(string20, "");
            arrayList.add(new AdActionInfoVo(j, j2, string, string2, i6, i7, string3, i8, string4, string5, string6, string7, string8, string9, j3, j4, zEquals, string10, string11, string12, string13, i9, i10, i11, string14, string15, string16, string17, string18, string19, string20, rowAsVo.getInt("ret_cd", 500)));
        }
        int i12 = onExtraCallback + 89;
        onWarmupCompleted = i12 % 128;
        int i13 = i12 % 2;
        return arrayList;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 27;
                $10 = i9 % 128;
                int i10 = i9 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 35283), TextUtils.getOffsetAfter("", 0) + 35, View.combineMeasuredStates(0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i11 = $10 + 57;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 5 / 3;
            }
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i13 = $11 + 109;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), TextUtils.lastIndexOf("", '0', 0, 0) + 66, Process.getGidForName("") + 16719, -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        Object obj = null;
                        cArr4[i14] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        obj.hashCode();
                        throw null;
                    }
                    int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 65 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 16718 - Gravity.getAbsoluteGravity(0, 0), -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i16 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), (-16777187) - Color.rgb(0, 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 17656, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (-16777146) - Color.rgb(0, 0, 0), Color.blue(0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            int i17 = $11 + 57;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                char[] cArr5 = new char[i5];
                System.arraycopy(cArr3, 0, cArr5, 0, i5);
                System.arraycopy(cArr5, 1, cArr3, i5 >> i7, i7);
                System.arraycopy(cArr5, i7, cArr3, 1, i5 - i7);
            } else {
                char[] cArr6 = new char[i5];
                System.arraycopy(cArr3, 0, cArr6, 0, i5);
                int i18 = i5 - i7;
                System.arraycopy(cArr6, 0, cArr3, i18, i7);
                System.arraycopy(cArr6, i7, cArr3, 0, i18);
            }
        }
        if (z) {
            char[] cArr7 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i19 = $11 + 49;
                $10 = i19 % 128;
                int i20 = i19 % 2;
            }
            cArr3 = cArr7;
        }
        if (i6 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public final List<AdListCuration> parseCuration(@Nullable ValueObject valueObject) {
        String str;
        List list;
        List list2;
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (valueObject != null) {
            int i3 = onExtraCallback + 35;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            for (Map<String, Object> map : valueObject) {
                int i5 = onExtraCallback + 33;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                Object obj = map.get("crt_id");
                Intrinsics.checkNotNull(obj, "");
                int iIntValue = ((Integer) obj).intValue();
                Object obj2 = map.get("crt_type");
                Intrinsics.checkNotNull(obj2, "");
                int iIntValue2 = ((Integer) obj2).intValue();
                Object obj3 = map.get("crt_title");
                if (obj3 instanceof String) {
                    int i7 = onWarmupCompleted + 35;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    str = (String) obj3;
                } else {
                    str = null;
                }
                if (str == null) {
                    int i9 = onWarmupCompleted + 121;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        throw null;
                    }
                    str = "";
                }
                Object obj4 = map.get("accpt_filter_list");
                if (obj4 != null) {
                    Intrinsics.checkNotNull(obj4, "");
                    list = ArraysKt.toList((int[]) obj4);
                } else {
                    list = null;
                }
                Object obj5 = map.get("pos_type");
                Intrinsics.checkNotNull(obj5, "");
                int iIntValue3 = ((Integer) obj5).intValue();
                Object obj6 = map.get("ord_no");
                Intrinsics.checkNotNull(obj6, "");
                int iIntValue4 = ((Integer) obj6).intValue();
                Object obj7 = map.get("layout_id");
                Intrinsics.checkNotNull(obj7, "");
                int iIntValue5 = ((Integer) obj7).intValue();
                TnkAdConfig tnkAdConfig = TnkAdConfig.INSTANCE;
                Object obj8 = map.get("layout_id");
                Intrinsics.checkNotNull(obj8, "");
                TnkAdLayoutConfig.TnkAdListLayout layoutInfo = tnkAdConfig.getLayoutInfo(((Integer) obj8).intValue());
                Object obj9 = map.get("app_id_list");
                if (obj9 != null) {
                    Intrinsics.checkNotNull(obj9, "");
                    List list3 = ArraysKt.toList((long[]) obj9);
                    int i10 = onExtraCallback + 97;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    list2 = list3;
                } else {
                    list2 = null;
                }
                arrayList.add(new AdListCuration(iIntValue, iIntValue2, str, list, iIntValue3, iIntValue4, iIntValue5, layoutInfo, list2));
            }
        }
        return arrayList;
    }

    public final List<CategorySet> parseCategory(@NotNull ValueObject valueObject) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(valueObject, "");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(valueObject, 10));
        Iterator<Map<String, Object>> it = valueObject.iterator();
        while (!(!it.hasNext())) {
            Map<String, Object> next = it.next();
            Object obj = next.get("cat_id");
            Intrinsics.checkNotNull(obj, "");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = next.get("cat_type");
            Intrinsics.checkNotNull(obj2, "");
            int iIntValue2 = ((Integer) obj2).intValue();
            Object obj3 = next.get("cat_nm");
            Intrinsics.checkNotNull(obj3, "");
            String str = (String) obj3;
            String str2 = (String) next.get("cat_url");
            AdListParser adListParser = INSTANCE;
            Object obj4 = next.get("filter_list");
            String str3 = null;
            List<Filter> filter = adListParser.parseFilter(obj4 instanceof ValueObject ? (ValueObject) obj4 : null);
            Object obj5 = next.get("hdr_msg");
            if (obj5 instanceof String) {
                int i3 = onWarmupCompleted + 111;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    str3.hashCode();
                    throw null;
                }
                str3 = (String) obj5;
            }
            arrayList.add(new CategorySet(iIntValue, iIntValue2, str, str2, filter, str3));
        }
        int i4 = onWarmupCompleted + 65;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return arrayList;
    }

    public final ArrayList<MultiCampaignJoinListItem> parseMultiCampaignJoinListItem(@Nullable ValueObject valueObject) {
        Integer num;
        int iIntValue;
        String str;
        int iIntValue2;
        String str2;
        ArrayList<MultiCampaignJoinListItem> arrayList;
        long jIntValue;
        Iterator<Map<String, Object>> it;
        int i2;
        Integer num2;
        String str3;
        Long l;
        Long l2;
        String str4;
        int i3;
        String str5;
        int i4 = 2;
        int i5 = 2 % 2;
        ArrayList<MultiCampaignJoinListItem> arrayList2 = new ArrayList<>();
        if (valueObject != null) {
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(valueObject, 10));
            Iterator<Map<String, Object>> it2 = valueObject.iterator();
            while (it2.hasNext()) {
                Map<String, Object> next = it2.next();
                Object obj = next.get("app_id");
                if (obj instanceof Integer) {
                    int i6 = onWarmupCompleted + 17;
                    onExtraCallback = i6 % 128;
                    if (i6 % i4 != 0) {
                        num = (Integer) obj;
                        int i7 = 74 / 0;
                    } else {
                        num = (Integer) obj;
                    }
                } else {
                    num = null;
                }
                if (num != null) {
                    int i8 = onExtraCallback + 29;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % i4;
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                long j = iIntValue;
                Object obj2 = next.get("app_nm");
                String str6 = obj2 instanceof String ? (String) obj2 : null;
                if (str6 == null) {
                    int i10 = onWarmupCompleted + 63;
                    onExtraCallback = i10 % 128;
                    if (i10 % i4 != 0) {
                        throw null;
                    }
                    str = "";
                } else {
                    str = str6;
                }
                Object obj3 = next.get("app_pkg");
                String str7 = obj3 instanceof String ? (String) obj3 : null;
                String str8 = str7 == null ? "" : str7;
                Object obj4 = next.get("ad_type");
                Integer num3 = obj4 instanceof Integer ? (Integer) obj4 : null;
                int iIntValue3 = num3 != null ? num3.intValue() : 0;
                Object obj5 = next.get("actn_id");
                Integer num4 = obj5 instanceof Integer ? (Integer) obj5 : null;
                int iIntValue4 = num4 != null ? num4.intValue() : 0;
                Object obj6 = next.get("cmpn_type");
                Integer num5 = obj6 instanceof Integer ? (Integer) obj6 : null;
                if (num5 != null) {
                    int i11 = onExtraCallback + 1;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % i4;
                    iIntValue2 = num5.intValue();
                } else {
                    iIntValue2 = 0;
                }
                Object obj7 = next.get("filter_id");
                Integer num6 = obj7 instanceof Integer ? (Integer) obj7 : null;
                int iIntValue5 = num6 != null ? num6.intValue() : 0;
                Object obj8 = next.get("img_url");
                String str9 = obj8 instanceof String ? (String) obj8 : null;
                String str10 = str9 == null ? "" : str9;
                Object obj9 = next.get("detail_yn");
                String str11 = obj9 instanceof String ? (String) obj9 : null;
                String str12 = str11 == null ? "" : str11;
                Object obj10 = next.get("adid_yn");
                String str13 = obj10 instanceof String ? (String) obj10 : null;
                String str14 = str13 == null ? "" : str13;
                Object obj11 = next.get("pnt_unit");
                if (obj11 instanceof String) {
                    int i13 = onExtraCallback + 61;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % i4;
                    str2 = (String) obj11;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                Object obj12 = next.get("pnt_amt");
                Integer num7 = obj12 instanceof Integer ? (Integer) obj12 : null;
                if (num7 != null) {
                    arrayList = arrayList2;
                    jIntValue = num7.intValue();
                } else {
                    arrayList = arrayList2;
                    jIntValue = 0;
                }
                Object obj13 = next.get("icon_url");
                String str15 = obj13 instanceof String ? (String) obj13 : null;
                String str16 = str15 == null ? "" : str15;
                Object obj14 = next.get("layout_id");
                Integer num8 = obj14 instanceof Integer ? (Integer) obj14 : null;
                int iIntValue6 = num8 != null ? num8.intValue() : 0;
                Object obj15 = next.get("cmpn_cnt");
                Integer num9 = obj15 instanceof Integer ? (Integer) obj15 : null;
                int iIntValue7 = num9 != null ? num9.intValue() : 0;
                Object obj16 = next.get("pay_cnt");
                if (obj16 instanceof Integer) {
                    int i15 = onExtraCallback + 27;
                    it = it2;
                    onWarmupCompleted = i15 % 128;
                    if (i15 % 2 == 0) {
                        num2 = (Integer) obj16;
                        i2 = 0;
                        int i16 = 98 / 0;
                    } else {
                        i2 = 0;
                        num2 = (Integer) obj16;
                    }
                } else {
                    it = it2;
                    i2 = 0;
                    num2 = null;
                }
                int iIntValue8 = num2 != null ? num2.intValue() : i2;
                Object obj17 = next.get("pay_dt");
                Long l3 = obj17 instanceof Long ? (Long) obj17 : null;
                long jLongValue = l3 != null ? l3.longValue() : 0L;
                Object obj18 = next.get("valid_lbl");
                String str17 = obj18 instanceof String ? (String) obj18 : null;
                String str18 = str17 == null ? "" : str17;
                Object obj19 = next.get("inst_dt");
                if (obj19 instanceof Long) {
                    int i17 = onExtraCallback + 87;
                    onWarmupCompleted = i17 % 128;
                    if (i17 % 2 == 0) {
                        throw null;
                    }
                    l = (Long) obj19;
                    str3 = null;
                } else {
                    str3 = null;
                    l = null;
                }
                long jLongValue2 = l != null ? l.longValue() : 0L;
                Object obj20 = next.get("pnt_txt");
                String str19 = obj20 instanceof String ? (String) obj20 : str3;
                String str20 = str19 == null ? "" : str19;
                Object obj21 = next.get("org_pnt_amt");
                if (obj21 instanceof Long) {
                    int i18 = onExtraCallback + 89;
                    onWarmupCompleted = i18 % 128;
                    int i19 = i18 % 2;
                    l2 = (Long) obj21;
                } else {
                    l2 = null;
                }
                long jLongValue3 = l2 != null ? l2.longValue() : 0L;
                Object obj22 = next.get("multi_join_yn");
                String str21 = !((obj22 instanceof String) ^ true) ? (String) obj22 : null;
                String str22 = str21 == null ? "" : str21;
                Object obj23 = next.get("actn_desc");
                String str23 = obj23 instanceof String ? (String) obj23 : null;
                String str24 = str23 == null ? "" : str23;
                Object obj24 = next.get("multi_yn");
                if (obj24 instanceof String) {
                    str4 = (String) obj24;
                    int i20 = onWarmupCompleted + 83;
                    onExtraCallback = i20 % 128;
                    int i21 = i20 % 2;
                } else {
                    str4 = null;
                }
                String str25 = str4 == null ? "" : str4;
                Object obj25 = next.get("corp_desc");
                String str26 = !((obj25 instanceof String) ^ true) ? (String) obj25 : null;
                String str27 = str26 == null ? "" : str26;
                Object obj26 = next.get("os_type");
                if (obj26 instanceof String) {
                    int i22 = onWarmupCompleted + 77;
                    onExtraCallback = i22 % 128;
                    i3 = 2;
                    int i23 = i22 % 2;
                    str5 = (String) obj26;
                } else {
                    i3 = 2;
                    str5 = null;
                }
                MultiCampaignJoinListItem multiCampaignJoinListItem = new MultiCampaignJoinListItem(j, str, str8, iIntValue3, iIntValue4, iIntValue2, iIntValue5, str10, str12, str14, str2, jIntValue, jLongValue2, str20, str16, iIntValue6, iIntValue7, iIntValue8, jLongValue3, str22, str24, str25, jLongValue, str18, str27, str5 == null ? "" : str5);
                ArrayList<MultiCampaignJoinListItem> arrayList4 = arrayList;
                arrayList3.add(Boolean.valueOf(arrayList4.add(multiCampaignJoinListItem)));
                arrayList2 = arrayList4;
                i4 = i3;
                it2 = it;
            }
        }
        return arrayList2;
    }

    public final List<BannerItem> parseBanner(@Nullable ValueObject valueObject) {
        int iIntValue;
        Integer num;
        String str;
        String str2;
        String str3;
        List list;
        int iIntValue2;
        Integer num2;
        Integer num3;
        int iIntValue3;
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (valueObject != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(valueObject, 10));
            for (Map<String, Object> map : valueObject) {
                int i3 = onWarmupCompleted + 83;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Object obj = map.get("bnr_id");
                Integer num4 = obj instanceof Integer ? (Integer) obj : null;
                if (num4 != null) {
                    int i5 = onWarmupCompleted + 49;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    iIntValue = num4.intValue();
                } else {
                    iIntValue = 0;
                }
                long j = iIntValue;
                Object obj2 = map.get("bnr_nm");
                String str4 = obj2 instanceof String ? (String) obj2 : null;
                String str5 = str4 == null ? "" : str4;
                Object obj3 = map.get("app_id");
                if (obj3 instanceof Integer) {
                    int i7 = onWarmupCompleted + 17;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                    num = (Integer) obj3;
                } else {
                    num = null;
                }
                long jIntValue = num != null ? num.intValue() : 0;
                Object obj4 = map.get("clck_url");
                if (obj4 instanceof String) {
                    int i8 = onExtraCallback + 109;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    str = (String) obj4;
                } else {
                    str = null;
                }
                if (str == null) {
                    int i10 = onWarmupCompleted + 115;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    str2 = "";
                } else {
                    str2 = str;
                }
                Object obj5 = map.get("webview_yn");
                String str6 = obj5 instanceof String ? (String) obj5 : null;
                if (str6 == null) {
                    int i12 = onExtraCallback + 47;
                    onWarmupCompleted = i12 % 128;
                    if (i12 % 2 == 0) {
                        throw null;
                    }
                    str3 = "";
                } else {
                    str3 = str6;
                }
                Object obj6 = map.get("accpt_filter_list");
                if (obj6 != null) {
                    Intrinsics.checkNotNull(obj6, "");
                    list = ArraysKt.toList((int[]) obj6);
                } else {
                    list = null;
                }
                Object obj7 = map.get("img_url");
                String str7 = !(obj7 instanceof String) ? null : (String) obj7;
                if (str7 == null) {
                    str7 = "";
                }
                Object obj8 = map.get("layout_id");
                Integer num5 = obj8 instanceof Integer ? (Integer) obj8 : null;
                if (num5 != null) {
                    int i13 = onWarmupCompleted + 115;
                    onExtraCallback = i13 % 128;
                    if (i13 % 2 != 0) {
                        num5.intValue();
                        throw null;
                    }
                    iIntValue2 = num5.intValue();
                } else {
                    iIntValue2 = 0;
                }
                Object obj9 = map.get("pos_type");
                if (obj9 instanceof Integer) {
                    int i14 = onWarmupCompleted + 63;
                    onExtraCallback = i14 % 128;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                    num2 = (Integer) obj9;
                } else {
                    num2 = null;
                }
                if (num2 != null) {
                    int i15 = onWarmupCompleted + 75;
                    onExtraCallback = i15 % 128;
                    if (i15 % 2 != 0) {
                        num2.intValue();
                        Object obj10 = null;
                        obj10.hashCode();
                        throw null;
                    }
                    iIntValue3 = num2.intValue();
                    num3 = null;
                } else {
                    num3 = null;
                    iIntValue3 = 0;
                }
                Object obj11 = map.get("ord_no");
                Integer num6 = obj11 instanceof Integer ? (Integer) obj11 : num3;
                arrayList2.add(Boolean.valueOf(arrayList.add(new BannerItem(j, str5, jIntValue, str2, str3, list, str7, iIntValue2, iIntValue3, num6 != null ? num6.intValue() : 0, 0, 0, null, 0L, null, null, null, 0, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, false, false, null, 0L, 0L, null, 0L, null, 0L, null, null, null, null, null, 0, 0, false, null, -1024, 131071, null))));
            }
        }
        return arrayList;
    }

    public final List<Filter> parseFilter(@Nullable ValueObject valueObject) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Filter("전체", 0, null));
        if (valueObject != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(valueObject, 10));
            int i3 = onExtraCallback + 3;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            for (Map<String, Object> map : valueObject) {
                int i5 = onExtraCallback + 19;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                Object obj = map.get("filter_nm");
                Intrinsics.checkNotNull(obj, "");
                String str = (String) obj;
                Object obj2 = map.get("filter_id");
                Intrinsics.checkNotNull(obj2, "");
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = map.get("filter_url");
                arrayList2.add(new Filter(str, iIntValue, obj3 instanceof String ? (String) obj3 : null));
                int i7 = onWarmupCompleted + 63;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 4 / 4;
                }
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = new char[]{27181, 27377, 27278, 27270, 27274, 27274};
    }
}
