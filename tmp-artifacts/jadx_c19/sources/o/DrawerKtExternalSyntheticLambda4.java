package o;

import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DrawerKtExternalSyntheticLambda4 {
    private final Map<Long, DrawerKtExternalSyntheticLambda29> onWarmupCompleted = new LinkedHashMap();

    public void onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda29 drawerKtExternalSyntheticLambda29) {
        long[] jArr = drawerKtExternalSyntheticLambda29.onExtraCallback;
        if (jArr.length <= 0 || this.onWarmupCompleted.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        this.onWarmupCompleted.put(Long.valueOf(drawerKtExternalSyntheticLambda29.onExtraCallback[0]), drawerKtExternalSyntheticLambda29);
    }

    public DrawerKtExternalSyntheticLambda29 onNavigationEvent() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (DrawerKtExternalSyntheticLambda29 drawerKtExternalSyntheticLambda29 : this.onWarmupCompleted.values()) {
            arrayList.add(drawerKtExternalSyntheticLambda29.onExtraCallbackWithResult);
            arrayList2.add(drawerKtExternalSyntheticLambda29.onWarmupCompleted);
            arrayList3.add(drawerKtExternalSyntheticLambda29.IAuthTabCallback);
            arrayList4.add(drawerKtExternalSyntheticLambda29.onExtraCallback);
        }
        return new DrawerKtExternalSyntheticLambda29(Ints.concat((int[][]) arrayList.toArray(new int[arrayList.size()][])), Longs.concat((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), Longs.concat((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), Longs.concat((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public int onExtraCallback() {
        return this.onWarmupCompleted.size();
    }
}
