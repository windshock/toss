package o;

import im.toss.tds.R;
import java.util.Map;
import kotlin.Pair;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class varyHeaders {
    private static final Map<Integer, CacheEntry> IAuthTabCallback;
    private static int asBinder = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static final Map<Integer, CacheEntry> onNavigationEvent;
    private static int onWarmupCompleted = 1;

    public static final Map<Integer, CacheEntry> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        Map<Integer, CacheEntry> map = onNavigationEvent;
        int i5 = i3 + 83;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return map;
    }

    static {
        CacheEntry cacheEntry = CacheEntry.Light;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(300, cacheEntry);
        CacheEntry cacheEntry2 = CacheEntry.Regular;
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(400, cacheEntry2);
        CacheEntry cacheEntry3 = CacheEntry.Medium;
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(500, cacheEntry3);
        CacheEntry cacheEntry4 = CacheEntry.SemiBold;
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(600, cacheEntry4);
        CacheEntry cacheEntry5 = CacheEntry.Bold;
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(700, cacheEntry5);
        CacheEntry cacheEntry6 = CacheEntry.ExtraBold;
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(800, cacheEntry6);
        CacheEntry cacheEntry7 = CacheEntry.Heavy;
        Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback(900, cacheEntry7);
        CacheEntry cacheEntry8 = CacheEntry.Black;
        onNavigationEvent = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, getWrite.IAuthTabCallback(950, cacheEntry8)});
        IAuthTabCallback = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(Integer.valueOf(R.font.toss_product_sans_lg), cacheEntry), getWrite.IAuthTabCallback(Integer.valueOf(R.font.toss_product_sans_rg), cacheEntry2), getWrite.IAuthTabCallback(Integer.valueOf(R.font.toss_product_sans_md), cacheEntry3), getWrite.IAuthTabCallback(Integer.valueOf(R.font.toss_product_sans_sb), cacheEntry4), getWrite.IAuthTabCallback(Integer.valueOf(R.font.toss_product_sans_bd), cacheEntry5), getWrite.IAuthTabCallback(Integer.valueOf(R.font.toss_product_sans_eb), cacheEntry6), getWrite.IAuthTabCallback(Integer.valueOf(R.font.toss_product_sans_hv), cacheEntry7), getWrite.IAuthTabCallback(Integer.valueOf(R.font.toss_product_sans_bl), cacheEntry8)});
        int i = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static final Map<Integer, CacheEntry> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback;
        }
        throw null;
    }
}
