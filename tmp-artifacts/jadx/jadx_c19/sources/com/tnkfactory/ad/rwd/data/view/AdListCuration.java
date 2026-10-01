package com.tnkfactory.ad.rwd.data.view;

import com.tnkfactory.ad.TnkAdConfig;
import com.tnkfactory.ad.TnkAdLayoutConfig;
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
public final class AdListCuration {
    public static final Companion Companion = new Companion(null);
    private final List<Integer> accpt_filter_list;
    private List<Long> app_id_list;
    private final int crt_id;
    private final String crt_title;
    private final int crt_type;
    private TnkAdLayoutConfig.TnkAdListLayout layoutInfo;
    private int layout_id;
    private int ord_no;
    private int pos_type;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<AdListCuration> curationListFromJson(@NotNull String str) throws JSONException {
            String str2 = "";
            Intrinsics.checkNotNullParameter(str, "");
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            int i2 = 0;
            while (i2 < length) {
                int i3 = jSONArray.getJSONObject(i2).getInt("crt_id");
                int i4 = jSONArray.getJSONObject(i2).getInt("crt_type");
                String string = jSONArray.getJSONObject(i2).getString("crt_title");
                Intrinsics.checkNotNullExpressionValue(string, str2);
                JSONArray jSONArray2 = jSONArray.getJSONObject(i2).getJSONArray("accpt_filter_list");
                ArrayList arrayList2 = new ArrayList();
                int length2 = jSONArray2.length();
                for (int i5 = 0; i5 < length2; i5++) {
                    arrayList2.add(Integer.valueOf(jSONArray2.getInt(i5)));
                }
                ArrayList arrayList3 = arrayList2.isEmpty() ? null : arrayList2;
                int i6 = jSONArray.getJSONObject(i2).getInt("pos_type");
                int i7 = jSONArray.getJSONObject(i2).getInt("ord_no");
                int i8 = jSONArray.getJSONObject(i2).getInt("layout_id");
                TnkAdLayoutConfig.TnkAdListLayout layoutInfo = TnkAdConfig.INSTANCE.getLayoutInfo(jSONArray.getJSONObject(i2).getInt("layout_id"));
                JSONArray jSONArray3 = jSONArray.getJSONObject(i2).getJSONArray("app_id_list");
                ArrayList arrayList4 = new ArrayList();
                int length3 = jSONArray3.length();
                int i9 = 0;
                while (i9 < length3) {
                    arrayList4.add(Long.valueOf(jSONArray3.getLong(i9)));
                    i9++;
                    str2 = str2;
                }
                arrayList.add(new AdListCuration(i3, i4, string, arrayList3, i6, i7, i8, layoutInfo, arrayList4));
                i2++;
                str2 = str2;
            }
            return arrayList;
        }

        public final String curationListToJson(@NotNull List<AdListCuration> list) throws JSONException {
            Intrinsics.checkNotNullParameter(list, "");
            JSONArray jSONArray = new JSONArray();
            for (AdListCuration adListCuration : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("crt_id", adListCuration.getCrt_id());
                jSONObject.put("crt_type", adListCuration.getCrt_type());
                jSONObject.put("crt_title", adListCuration.getCrt_title());
                JSONArray jSONArray2 = new JSONArray();
                List<Integer> accpt_filter_list = adListCuration.getAccpt_filter_list();
                if (accpt_filter_list != null) {
                    Iterator<T> it = accpt_filter_list.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(((Number) it.next()).intValue());
                    }
                }
                Unit unit = Unit.INSTANCE;
                jSONObject.put("accpt_filter_list", jSONArray2);
                jSONObject.put("pos_type", adListCuration.getPos_type());
                jSONObject.put("ord_no", adListCuration.getOrd_no());
                jSONObject.put("layout_id", adListCuration.getLayout_id());
                JSONArray jSONArray3 = new JSONArray();
                List<Long> app_id_list = adListCuration.getApp_id_list();
                if (app_id_list != null) {
                    Iterator<T> it2 = app_id_list.iterator();
                    while (it2.hasNext()) {
                        jSONArray3.put(((Number) it2.next()).longValue());
                    }
                }
                Unit unit2 = Unit.INSTANCE;
                jSONObject.put("app_id_list", jSONArray3);
                jSONArray.put(jSONObject);
            }
            String string = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        private Companion() {
        }
    }

    public AdListCuration(int i2, int i3, @NotNull String str, @Nullable List<Integer> list, int i4, int i5, int i6, @NotNull TnkAdLayoutConfig.TnkAdListLayout tnkAdListLayout, @Nullable List<Long> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tnkAdListLayout, "");
        this.crt_id = i2;
        this.crt_type = i3;
        this.crt_title = str;
        this.accpt_filter_list = list;
        this.pos_type = i4;
        this.ord_no = i5;
        this.layout_id = i6;
        this.layoutInfo = tnkAdListLayout;
        this.app_id_list = list2;
    }

    public final List<Integer> getAccpt_filter_list() {
        return this.accpt_filter_list;
    }

    public final List<Long> getApp_id_list() {
        return this.app_id_list;
    }

    public final int getCrt_id() {
        return this.crt_id;
    }

    public final String getCrt_title() {
        return this.crt_title;
    }

    public final int getCrt_type() {
        return this.crt_type;
    }

    public final TnkAdLayoutConfig.TnkAdListLayout getLayoutInfo() {
        return this.layoutInfo;
    }

    public final int getLayout_id() {
        return this.layout_id;
    }

    public final int getOrd_no() {
        return this.ord_no;
    }

    public final int getPos_type() {
        return this.pos_type;
    }

    public final void setApp_id_list(@Nullable List<Long> list) {
        this.app_id_list = list;
    }

    public final void setLayoutInfo(@NotNull TnkAdLayoutConfig.TnkAdListLayout tnkAdListLayout) {
        Intrinsics.checkNotNullParameter(tnkAdListLayout, "");
        this.layoutInfo = tnkAdListLayout;
    }

    public final void setLayout_id(int i2) {
        this.layout_id = i2;
    }

    public final void setOrd_no(int i2) {
        this.ord_no = i2;
    }

    public final void setPos_type(int i2) {
        this.pos_type = i2;
    }
}
