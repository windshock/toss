package com.tnkfactory.ad.rwd.data.view;

import com.tnkfactory.ad.a.b0;
import com.tnkfactory.ad.a.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class CategorySet {
    public static final Companion Companion = new Companion(null);
    private int catId;
    private String catNm;
    private int catType;
    private String catUrl;
    private List<Filter> filterList;
    private String hdrMsg;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ArrayList<CategorySet> categorySetFromJson(@NotNull String str) throws JSONException {
            String str2 = "";
            Intrinsics.checkNotNullParameter(str, "");
            JSONArray jSONArray = new JSONArray(str);
            ArrayList<CategorySet> arrayList = new ArrayList<>();
            int length = jSONArray.length();
            int i2 = 0;
            while (i2 < length) {
                int i3 = jSONArray.getJSONObject(i2).getInt("catId");
                int i4 = jSONArray.getJSONObject(i2).getInt("catType");
                String string = jSONArray.getJSONObject(i2).getString("catNm");
                Intrinsics.checkNotNullExpressionValue(string, str2);
                String string2 = jSONArray.getJSONObject(i2).getString("catUrl");
                JSONArray jSONArray2 = jSONArray.getJSONObject(i2).getJSONArray("filterList");
                ArrayList arrayList2 = new ArrayList();
                int length2 = jSONArray2.length();
                int i5 = 0;
                while (i5 < length2) {
                    String string3 = jSONArray2.getJSONObject(i5).getString("filterNm");
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    arrayList2.add(new Filter(string3, jSONArray2.getJSONObject(i5).getInt("filterId"), jSONArray2.getJSONObject(i5).getString("filterUrl")));
                    i5++;
                    str2 = str2;
                }
                arrayList.add(new CategorySet(i3, i4, string, string2, arrayList2, jSONArray.getJSONObject(i2).getString("hdrMsg")));
                i2++;
                str2 = str2;
            }
            return arrayList;
        }

        public final String categorySetToJson(@NotNull List<CategorySet> list) throws JSONException {
            JSONArray jSONArray;
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (CategorySet categorySet : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("catId", categorySet.getCatId());
                jSONObject.put("catType", categorySet.getCatType());
                jSONObject.put("catNm", categorySet.getCatNm());
                String catUrl = categorySet.getCatUrl();
                if (catUrl == null) {
                    catUrl = "";
                }
                jSONObject.put("catUrl", catUrl);
                List<Filter> filterList = categorySet.getFilterList();
                if (filterList != null) {
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(filterList, 10));
                    for (Filter filter : filterList) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("filterNm", filter.getFilterNm());
                        jSONObject2.put("filterId", filter.getFilterId());
                        String filterUrl = filter.getFilterUrl();
                        if (filterUrl == null) {
                            filterUrl = "";
                        }
                        jSONObject2.put("filterUrl", filterUrl);
                        arrayList2.add(jSONObject2);
                    }
                    jSONArray = new JSONArray((Collection) arrayList2);
                } else {
                    jSONArray = null;
                }
                jSONObject.put("filterList", jSONArray);
                String hdrMsg = categorySet.getHdrMsg();
                if (hdrMsg == null) {
                    hdrMsg = "";
                }
                jSONObject.put("hdrMsg", hdrMsg);
                arrayList.add(jSONObject);
            }
            String string = new JSONArray((Collection) arrayList).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        private Companion() {
        }
    }

    public CategorySet(int i2, int i3, @NotNull String str, @Nullable String str2, @Nullable List<Filter> list, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.catId = i2;
        this.catType = i3;
        this.catNm = str;
        this.catUrl = str2;
        this.filterList = list;
        this.hdrMsg = str3;
    }

    public static /* synthetic */ CategorySet copy$default(CategorySet categorySet, int i2, int i3, String str, String str2, List list, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = categorySet.catId;
        }
        if ((i4 & 2) != 0) {
            i3 = categorySet.catType;
        }
        int i5 = i3;
        if ((i4 & 4) != 0) {
            str = categorySet.catNm;
        }
        String str4 = str;
        if ((i4 & 8) != 0) {
            str2 = categorySet.catUrl;
        }
        String str5 = str2;
        if ((i4 & 16) != 0) {
            list = categorySet.filterList;
        }
        List list2 = list;
        if ((i4 & 32) != 0) {
            str3 = categorySet.hdrMsg;
        }
        return categorySet.copy(i2, i5, str4, str5, list2, str3);
    }

    public final int component1() {
        return this.catId;
    }

    public final int component2() {
        return this.catType;
    }

    public final String component3() {
        return this.catNm;
    }

    public final String component4() {
        return this.catUrl;
    }

    public final List<Filter> component5() {
        return this.filterList;
    }

    public final String component6() {
        return this.hdrMsg;
    }

    public final CategorySet copy(int i2, int i3, @NotNull String str, @Nullable String str2, @Nullable List<Filter> list, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CategorySet(i2, i3, str, str2, list, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategorySet)) {
            return false;
        }
        CategorySet categorySet = (CategorySet) obj;
        return this.catId == categorySet.catId && this.catType == categorySet.catType && Intrinsics.areEqual(this.catNm, categorySet.catNm) && Intrinsics.areEqual(this.catUrl, categorySet.catUrl) && Intrinsics.areEqual(this.filterList, categorySet.filterList) && Intrinsics.areEqual(this.hdrMsg, categorySet.hdrMsg);
    }

    public final int getCatId() {
        return this.catId;
    }

    public final String getCatNm() {
        return this.catNm;
    }

    public final int getCatType() {
        return this.catType;
    }

    public final String getCatUrl() {
        return this.catUrl;
    }

    public final List<Filter> getFilterList() {
        return this.filterList;
    }

    public final String getHdrMsg() {
        return this.hdrMsg;
    }

    public int hashCode() {
        int iA = b0.a(this.catNm, z.a(this.catType, Integer.hashCode(this.catId) * 31, 31), 31);
        String str = this.catUrl;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<Filter> list = this.filterList;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str2 = this.hdrMsg;
        return ((((iA + iHashCode) * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCatId(int i2) {
        this.catId = i2;
    }

    public final void setCatNm(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.catNm = str;
    }

    public final void setCatType(int i2) {
        this.catType = i2;
    }

    public final void setCatUrl(@Nullable String str) {
        this.catUrl = str;
    }

    public final void setFilterList(@Nullable List<Filter> list) {
        this.filterList = list;
    }

    public final void setHdrMsg(@Nullable String str) {
        this.hdrMsg = str;
    }

    public String toString() {
        return "CategorySet(catId=" + this.catId + ", catType=" + this.catType + ", catNm=" + this.catNm + ", catUrl=" + this.catUrl + ", filterList=" + this.filterList + ", hdrMsg=" + this.hdrMsg + ")";
    }
}
