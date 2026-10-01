package com.tnkfactory.ad.off;

import android.content.Context;
import android.content.SharedPreferences;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.AdListVoKt;
import com.tnkfactory.ad.repository.db.AdItemRoomDbImpl;
import com.tnkfactory.ad.repository.db.dao.AdItemDao;
import com.tnkfactory.ad.repository.db.entity.AdItemDto;
import com.tnkfactory.ad.rwd.BannerItem;
import com.tnkfactory.ad.rwd.PubInfo;
import com.tnkfactory.ad.rwd.data.view.AdListCuration;
import com.tnkfactory.ad.rwd.data.view.CategorySet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.getCodeNameBytes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdItemRepository {
    public static final TnkAdItemRepository INSTANCE = new TnkAdItemRepository();
    public static AdItemRoomDbImpl a;
    public static SharedPreferences sp;

    public final <T> String arrToJson(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(String.valueOf(it.next()));
        }
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final void clearClickHistory() {
        getSp().edit().putString("adListClickHistory", "").apply();
        loadClickHistory();
    }

    public final List<AdListVo> getAdList() {
        AdItemDao adItemDao;
        List<AdItemDto> all;
        AdItemRoomDbImpl adItemRoomDbImpl = a;
        if (adItemRoomDbImpl != null && (adItemDao = adItemRoomDbImpl.adItemDao()) != null && (all = adItemDao.getAll()) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(all, 10));
            Iterator<T> it = all.iterator();
            while (it.hasNext()) {
                arrayList.add(AdListVoKt.toAdListVo((AdItemDto) it.next()));
            }
            List<AdListVo> listSortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.tnkfactory.ad.off.TnkAdItemRepository$special$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return getCodeNameBytes.IAuthTabCallback(Integer.valueOf(((AdListVo) t).getOrderNumber()), Integer.valueOf(((AdListVo) t2).getOrderNumber()));
                }
            });
            if (listSortedWith != null) {
                return listSortedWith;
            }
        }
        return CollectionsKt.emptyList();
    }

    public final List<BannerItem> getArrBanner() {
        BannerItem.Companion companion = BannerItem.Companion;
        String string = getSp().getString("__tnk_240303_", "");
        return companion.bannerItemListFromJson(string != null ? string : "");
    }

    public final List<CategorySet> getArrCategory() {
        CategorySet.Companion companion = CategorySet.Companion;
        String string = getSp().getString("__tnk_240304_", "");
        return companion.categorySetFromJson(string != null ? string : "");
    }

    public final List<AdListCuration> getCuration() {
        AdListCuration.Companion companion = AdListCuration.Companion;
        String string = getSp().getString("__tnk_240301_", "");
        return companion.curationListFromJson(string != null ? string : "");
    }

    public final AdItemRoomDbImpl getDb() {
        return a;
    }

    public final long getLastUpdate() {
        return getSp().getLong("lastUpdate", 0L);
    }

    public final PubInfo getPubInfo() {
        PubInfo.Companion companion = PubInfo.Companion;
        String string = getSp().getString("__tnk_240302_", "");
        return companion.jsonToPubInfo(string != null ? string : "");
    }

    public final SharedPreferences getSp() {
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void init(@Nullable AdItemRoomDbImpl adItemRoomDbImpl, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        a = adItemRoomDbImpl;
        setSp(context.getSharedPreferences("tnk_ad", 0));
    }

    public final boolean isNeedUpdate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(INSTANCE.getLastUpdate());
        Calendar calendar2 = Calendar.getInstance();
        return (calendar.get(6) * 1000) + calendar.get(11) != (calendar2.get(6) * 1000) + calendar2.get(11);
    }

    public final List<String> jsonToArr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        return arrayList;
    }

    public final ArrayList<Long> loadClickHistory() {
        String string = getSp().getString("adListClickHistory", "");
        if (string == null || string.length() == 0) {
            return new ArrayList<>();
        }
        List<String> listJsonToArr = jsonToArr(string);
        ArrayList<Long> arrayList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(listJsonToArr, 10));
        Iterator<T> it = listJsonToArr.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(Long.parseLong((String) it.next())));
        }
        return arrayList;
    }

    public final void removeClickHistory(long j) {
        ArrayList<Long> arrayListLoadClickHistory = loadClickHistory();
        arrayListLoadClickHistory.remove(Long.valueOf(j));
        getSp().edit().putString("adListClickHistory", arrToJson(arrayListLoadClickHistory)).apply();
    }

    public final void saveClickHistory(long j) {
        ArrayList<Long> arrayListLoadClickHistory = loadClickHistory();
        if (arrayListLoadClickHistory.isEmpty()) {
            arrayListLoadClickHistory.addAll(loadClickHistory());
        }
        arrayListLoadClickHistory.remove(Long.valueOf(j));
        arrayListLoadClickHistory.add(0, Long.valueOf(j));
        getSp().edit().putString("adListClickHistory", arrToJson(arrayListLoadClickHistory)).apply();
    }

    public final void saveLastUpdate() {
        setLastUpdate(System.currentTimeMillis());
    }

    public final void setAdList(@NotNull List<? extends AdListVo> list) {
        AdItemDao adItemDao;
        AdItemDao adItemDao2;
        Intrinsics.checkNotNullParameter(list, "");
        AdItemRoomDbImpl adItemRoomDbImpl = a;
        if (adItemRoomDbImpl != null && (adItemDao2 = adItemRoomDbImpl.adItemDao()) != null) {
            adItemDao2.deleteAll();
        }
        AdItemRoomDbImpl adItemRoomDbImpl2 = a;
        if (adItemRoomDbImpl2 == null || (adItemDao = adItemRoomDbImpl2.adItemDao()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AdListVoKt.toAdListDto((AdListVo) it.next()));
        }
        AdItemDto[] adItemDtoArr = (AdItemDto[]) arrayList.toArray(new AdItemDto[0]);
        adItemDao.insertAll((AdItemDto[]) Arrays.copyOf(adItemDtoArr, adItemDtoArr.length));
    }

    public final void setArrBanner(@NotNull List<BannerItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        getSp().edit().putString("__tnk_240303_", BannerItem.Companion.bannerItemListToJson(list)).apply();
    }

    public final void setArrCategory(@NotNull List<CategorySet> list) {
        Intrinsics.checkNotNullParameter(list, "");
        getSp().edit().putString("__tnk_240304_", CategorySet.Companion.categorySetToJson(list)).apply();
    }

    public final void setCuration(@NotNull List<AdListCuration> list) {
        Intrinsics.checkNotNullParameter(list, "");
        getSp().edit().putString("__tnk_240301_", AdListCuration.Companion.curationListToJson(list)).apply();
    }

    public final void setDb(@Nullable AdItemRoomDbImpl adItemRoomDbImpl) {
        a = adItemRoomDbImpl;
    }

    public final void setLastUpdate(long j) {
        getSp().edit().putLong("lastUpdate", j).apply();
    }

    public final void setPubInfo(@NotNull PubInfo pubInfo) {
        Intrinsics.checkNotNullParameter(pubInfo, "");
        getSp().edit().putString("__tnk_240302_", PubInfo.Companion.pubInfoToJson(pubInfo)).apply();
    }

    public final void setSp(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "");
        sp = sharedPreferences;
    }

    public final void updateItem(@NotNull AdListVo adListVo) {
        AdItemDao adItemDao;
        Intrinsics.checkNotNullParameter(adListVo, "");
        AdItemRoomDbImpl adItemRoomDbImpl = a;
        if (adItemRoomDbImpl == null || (adItemDao = adItemRoomDbImpl.adItemDao()) == null) {
            return;
        }
        adItemDao.update(AdListVoKt.toAdListDto(adListVo));
    }
}
