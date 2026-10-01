package com.tnkfactory.ad.off.data;

import com.tnkfactory.ad.rwd.PubInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RecommendList {
    public ArrayList a;
    public ArrayList b;
    public ArrayList c;
    public ArrayList d;
    public PubInfo e;
    public String f;

    public RecommendList() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ RecommendList copy$default(RecommendList recommendList, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, PubInfo pubInfo, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            arrayList = recommendList.a;
        }
        if ((i2 & 2) != 0) {
            arrayList2 = recommendList.b;
        }
        ArrayList arrayList5 = arrayList2;
        if ((i2 & 4) != 0) {
            arrayList3 = recommendList.c;
        }
        ArrayList arrayList6 = arrayList3;
        if ((i2 & 8) != 0) {
            arrayList4 = recommendList.d;
        }
        ArrayList arrayList7 = arrayList4;
        if ((i2 & 16) != 0) {
            pubInfo = recommendList.e;
        }
        PubInfo pubInfo2 = pubInfo;
        if ((i2 & 32) != 0) {
            str = recommendList.f;
        }
        return recommendList.copy(arrayList, arrayList5, arrayList6, arrayList7, pubInfo2, str);
    }

    public final ArrayList<AdListVo> component1() {
        return this.a;
    }

    public final ArrayList<AdListVo> component2() {
        return this.b;
    }

    public final ArrayList<EventListVo> component3() {
        return this.c;
    }

    public final ArrayList<AdListVo> component4() {
        return this.d;
    }

    public final PubInfo component5() {
        return this.e;
    }

    public final String component6() {
        return this.f;
    }

    public final RecommendList copy(@NotNull ArrayList<AdListVo> arrayList, @NotNull ArrayList<AdListVo> arrayList2, @NotNull ArrayList<EventListVo> arrayList3, @NotNull ArrayList<AdListVo> arrayList4, @NotNull PubInfo pubInfo, @NotNull String str) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(arrayList3, "");
        Intrinsics.checkNotNullParameter(arrayList4, "");
        Intrinsics.checkNotNullParameter(pubInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new RecommendList(arrayList, arrayList2, arrayList3, arrayList4, pubInfo, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendList)) {
            return false;
        }
        RecommendList recommendList = (RecommendList) obj;
        return Intrinsics.areEqual(this.a, recommendList.a) && Intrinsics.areEqual(this.b, recommendList.b) && Intrinsics.areEqual(this.c, recommendList.c) && Intrinsics.areEqual(this.d, recommendList.d) && Intrinsics.areEqual(this.e, recommendList.e) && Intrinsics.areEqual(this.f, recommendList.f);
    }

    public final ArrayList<AdListVo> getAd_list() {
        return this.d;
    }

    public final ArrayList<EventListVo> getEvt_list() {
        return this.c;
    }

    public final ArrayList<AdListVo> getPop_list() {
        return this.b;
    }

    public final PubInfo getPub_info() {
        return this.e;
    }

    public final ArrayList<AdListVo> getRec_list() {
        return this.a;
    }

    public final String getResult() {
        return this.f;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode();
        int iHashCode2 = this.b.hashCode();
        int iHashCode3 = this.c.hashCode();
        int iHashCode4 = this.d.hashCode();
        return this.f.hashCode() + ((this.e.hashCode() + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final void setAd_list(@NotNull ArrayList<AdListVo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.d = arrayList;
    }

    public final void setEvt_list(@NotNull ArrayList<EventListVo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.c = arrayList;
    }

    public final void setPop_list(@NotNull ArrayList<AdListVo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.b = arrayList;
    }

    public final void setPub_info(@NotNull PubInfo pubInfo) {
        Intrinsics.checkNotNullParameter(pubInfo, "");
        this.e = pubInfo;
    }

    public final void setRec_list(@NotNull ArrayList<AdListVo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.a = arrayList;
    }

    public final void setResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f = str;
    }

    public String toString() {
        return "RecommendList(rec_list=" + this.a + ", pop_list=" + this.b + ", evt_list=" + this.c + ", ad_list=" + this.d + ", pub_info=" + this.e + ", result=" + this.f + ")";
    }

    public RecommendList(@NotNull ArrayList<AdListVo> arrayList, @NotNull ArrayList<AdListVo> arrayList2, @NotNull ArrayList<EventListVo> arrayList3, @NotNull ArrayList<AdListVo> arrayList4, @NotNull PubInfo pubInfo, @NotNull String str) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(arrayList3, "");
        Intrinsics.checkNotNullParameter(arrayList4, "");
        Intrinsics.checkNotNullParameter(pubInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = arrayList4;
        this.e = pubInfo;
        this.f = str;
    }

    public /* synthetic */ RecommendList(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, PubInfo pubInfo, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ArrayList() : arrayList, (i2 & 2) != 0 ? new ArrayList() : arrayList2, (i2 & 4) != 0 ? new ArrayList() : arrayList3, (i2 & 8) != 0 ? new ArrayList() : arrayList4, (i2 & 16) != 0 ? new PubInfo(null, 0L, null, 0, null, null, null, null, null, 511, null) : pubInfo, (i2 & 32) != 0 ? "" : str);
    }
}
