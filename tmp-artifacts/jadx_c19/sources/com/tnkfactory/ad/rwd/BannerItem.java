package com.tnkfactory.ad.rwd;

import com.tnkfactory.ad.off.data.AdActionInfoVo;
import com.tnkfactory.ad.off.data.AdListVo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BannerItem extends AdListVo {
    public static final Companion Companion = new Companion(null);
    public long Y;
    public String Z;
    public long a0;
    public String b0;
    public List c0;
    public String d0;
    public int e0;
    public int f0;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final List<BannerItem> bannerItemListFromJson(@NotNull String str) throws JSONException {
            JSONArray jSONArray;
            int i2;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(str, "");
            JSONArray jSONArray2 = new JSONArray(str);
            ArrayList arrayList2 = new ArrayList();
            int length = jSONArray2.length();
            int i3 = 0;
            while (i3 < length) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i3);
                long j = jSONObject.getLong("bnr_id");
                String string = jSONObject.getString("bnr_nm");
                Intrinsics.checkNotNullExpressionValue(string, "");
                long j2 = jSONObject.getLong("app_id");
                String string2 = jSONObject.getString("clck_url");
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String string3 = jSONObject.getString("webview_yn");
                Intrinsics.checkNotNullExpressionValue(string3, "");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("accpt_filter_list");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList3 = new ArrayList();
                    int length2 = jSONArrayOptJSONArray.length();
                    jSONArray = jSONArray2;
                    int i4 = 0;
                    while (i4 < length2) {
                        arrayList3.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(i4)));
                        i4++;
                        length = length;
                    }
                    i2 = length;
                    arrayList = arrayList3;
                } else {
                    jSONArray = jSONArray2;
                    i2 = length;
                    arrayList = null;
                }
                String string4 = jSONObject.getString("img_url");
                Intrinsics.checkNotNullExpressionValue(string4, "");
                arrayList2.add(new BannerItem(j, string, j2, string2, string3, arrayList, string4, jSONObject.getInt("layout_id"), jSONObject.getInt("pos_type"), jSONObject.getInt("ord_no"), 0, 0, null, 0L, null, null, null, 0, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, false, false, null, 0L, 0L, null, 0L, null, 0L, null, null, null, null, null, 0, 0, false, null, -1024, 131071, null));
                i3++;
                jSONArray2 = jSONArray;
                length = i2;
            }
            return arrayList2;
        }

        public final String bannerItemListToJson(@NotNull List<BannerItem> list) throws JSONException {
            Intrinsics.checkNotNullParameter(list, "");
            JSONArray jSONArray = new JSONArray();
            for (BannerItem bannerItem : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bnr_id", bannerItem.getBnr_id());
                jSONObject.put("bnr_nm", bannerItem.getBnr_nm());
                jSONObject.put("app_id", bannerItem.getApp_id());
                jSONObject.put("clck_url", bannerItem.getClck_url());
                jSONObject.put("webview_yn", bannerItem.getWebview_yn());
                JSONArray jSONArray2 = new JSONArray();
                List<Integer> accpt_filter_list = bannerItem.getAccpt_filter_list();
                if (accpt_filter_list != null) {
                    Iterator<T> it = accpt_filter_list.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(((Number) it.next()).intValue());
                    }
                }
                Unit unit = Unit.INSTANCE;
                jSONObject.put("accpt_filter_list", jSONArray2);
                jSONObject.put("img_url", bannerItem.getImg_url());
                jSONObject.put("layout_id", bannerItem.getLayout_id());
                jSONObject.put("pos_type", bannerItem.getPos_type());
                jSONObject.put("ord_no", bannerItem.getOrd_no());
                jSONArray.put(jSONObject);
            }
            String string = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
    }

    public final List<Integer> getAccpt_filter_list() {
        return this.c0;
    }

    public final long getApp_id() {
        return this.a0;
    }

    public final long getBnr_id() {
        return this.Y;
    }

    public final String getBnr_nm() {
        return this.Z;
    }

    public final String getClck_url() {
        return this.b0;
    }

    public final String getImg_url() {
        return this.d0;
    }

    public final int getOrd_no() {
        return this.f0;
    }

    public final int getPos_type() {
        return this.e0;
    }

    public final void setAccpt_filter_list(@Nullable List<Integer> list) {
        this.c0 = list;
    }

    public final void setApp_id(long j) {
        this.a0 = j;
    }

    public final void setBnr_id(long j) {
        this.Y = j;
    }

    public final void setBnr_nm(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.Z = str;
    }

    public final void setClck_url(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.b0 = str;
    }

    public final void setImg_url(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.d0 = str;
    }

    public final void setOrd_no(int i2) {
        this.f0 = i2;
    }

    public final void setPos_type(int i2) {
        this.e0 = i2;
    }

    public /* synthetic */ BannerItem(long j, String str, long j2, String str2, String str3, List list, String str4, int i2, int i3, int i4, int i5, int i6, String str5, long j3, String str6, String str7, String str8, int i7, String str9, String str10, int i8, String str11, int i9, int i10, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, boolean z2, String str19, long j4, long j5, String str20, long j6, String str21, long j7, String str22, String str23, String str24, String str25, String str26, int i11, int i12, boolean z3, ArrayList arrayList, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, j2, str2, str3, list, str4, i2, i3, i4, (i13 & 1024) != 0 ? -1 : i5, (i13 & 2048) != 0 ? -1 : i6, (i13 & 4096) != 0 ? "" : str5, (i13 & 8192) != 0 ? 0L : j3, (i13 & 16384) != 0 ? "" : str6, (i13 & 32768) != 0 ? "" : str7, (i13 & 65536) != 0 ? "" : str8, (131072 & i13) != 0 ? 0 : i7, (262144 & i13) != 0 ? "" : str9, (524288 & i13) != 0 ? "" : str10, (1048576 & i13) != 0 ? 0 : i8, (2097152 & i13) != 0 ? "" : str11, (4194304 & i13) != 0 ? 0 : i9, (8388608 & i13) != 0 ? 0 : i10, (16777216 & i13) != 0 ? "" : str12, (33554432 & i13) != 0 ? "" : str13, (67108864 & i13) != 0 ? "" : str14, (134217728 & i13) != 0 ? "" : str15, (268435456 & i13) != 0 ? "" : str16, (536870912 & i13) != 0 ? "" : str17, (1073741824 & i13) != 0 ? "" : str18, (i13 & Integer.MIN_VALUE) != 0 ? false : z, (i14 & 1) != 0 ? false : z2, (i14 & 2) != 0 ? "" : str19, (i14 & 4) != 0 ? 0L : j4, (i14 & 8) != 0 ? 0L : j5, (i14 & 16) != 0 ? "" : str20, (i14 & 32) != 0 ? 0L : j6, (i14 & 64) != 0 ? "" : str21, (i14 & 128) != 0 ? 0L : j7, (i14 & 256) != 0 ? "" : str22, (i14 & 512) != 0 ? "" : str23, (i14 & 1024) != 0 ? "" : str24, (i14 & 2048) != 0 ? "" : str25, (i14 & 4096) != 0 ? "" : str26, (i14 & 8192) != 0 ? 0 : i11, (i14 & 16384) != 0 ? 0 : i12, (i14 & 32768) != 0 ? false : z3, (i14 & 65536) != 0 ? new ArrayList() : arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerItem(long j, @NotNull String str, long j2, @NotNull String str2, @NotNull String str3, @Nullable List<Integer> list, @NotNull String str4, int i2, int i3, int i4, int i5, int i6, @NotNull String str5, long j3, @NotNull String str6, @NotNull String str7, @NotNull String str8, int i7, @NotNull String str9, @NotNull String str10, int i8, @NotNull String str11, int i9, int i10, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, boolean z, boolean z2, @NotNull String str19, long j4, long j5, @NotNull String str20, long j6, @NotNull String str21, long j7, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, int i11, int i12, boolean z3, @NotNull ArrayList<AdActionInfoVo> arrayList) {
        super(j3, i5, i6, str5, str6, str7, str8, i7, str9, str10, i8, str11, i9, i10, str12, str13, str14, str15, str16, str17, i2, str18, z, z2, str19, j4, j5, str20, j6, str21, null, j7, str3, str22, str23, str24, str25, str26, i11, i12, null, 0, 0, 0L, null, 0L, z3, false, 0, arrayList, 1073741824, 114432, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.Y = j;
        this.Z = str;
        this.a0 = j2;
        this.b0 = str2;
        this.c0 = list;
        this.d0 = str4;
        this.e0 = i3;
        this.f0 = i4;
    }
}
