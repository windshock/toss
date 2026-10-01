package o;

import android.util.Pair;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class findContainingViewHolder {
    private static findContainingViewHolder IAuthTabCallback;
    private static final Map<dispatchLayout, Integer> onExtraCallback;
    private static final Map<clearOnChildAttachStateChangeListeners, Integer> onExtraCallbackWithResult;
    private static final Map<clearOldPositions, Integer> onWarmupCompleted;

    public static findContainingViewHolder IAuthTabCallback() {
        if (IAuthTabCallback == null) {
            IAuthTabCallback = new findContainingViewHolder();
        }
        return IAuthTabCallback;
    }

    static {
        HashMap map = new HashMap();
        onWarmupCompleted = map;
        HashMap map2 = new HashMap();
        onExtraCallback = map2;
        HashMap map3 = new HashMap();
        onExtraCallbackWithResult = map3;
        map.put(clearOldPositions.BACK, 1);
        map.put(clearOldPositions.FRONT, 0);
        map2.put(dispatchLayout.AUTO, 1);
        map2.put(dispatchLayout.CLOUDY, 6);
        map2.put(dispatchLayout.DAYLIGHT, 5);
        map2.put(dispatchLayout.FLUORESCENT, 3);
        map2.put(dispatchLayout.INCANDESCENT, 2);
        map3.put(clearOnChildAttachStateChangeListeners.OFF, 0);
        map3.put(clearOnChildAttachStateChangeListeners.ON, 18);
    }

    private findContainingViewHolder() {
    }

    /* renamed from: o.findContainingViewHolder$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[animateAppearance.values().length];
            IAuthTabCallback = iArr;
            try {
                iArr[animateAppearance.ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IAuthTabCallback[animateAppearance.AUTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IAuthTabCallback[animateAppearance.OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IAuthTabCallback[animateAppearance.TORCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public List<Pair<Integer, Integer>> onNavigationEvent(@NonNull animateAppearance animateappearance) {
        ArrayList arrayList = new ArrayList();
        int i2 = AnonymousClass2.IAuthTabCallback[animateappearance.ordinal()];
        if (i2 == 1) {
            arrayList.add(new Pair(3, 0));
            return arrayList;
        }
        if (i2 == 2) {
            arrayList.add(new Pair(2, 0));
            arrayList.add(new Pair(4, 0));
            return arrayList;
        }
        if (i2 == 3) {
            arrayList.add(new Pair(1, 0));
            arrayList.add(new Pair(0, 0));
            return arrayList;
        }
        if (i2 != 4) {
            return arrayList;
        }
        arrayList.add(new Pair(1, 2));
        arrayList.add(new Pair(0, 2));
        return arrayList;
    }

    public int onNavigationEvent(@NonNull clearOldPositions clearoldpositions) {
        return onWarmupCompleted.get(clearoldpositions).intValue();
    }

    public int IAuthTabCallback(@NonNull dispatchLayout dispatchlayout) {
        return onExtraCallback.get(dispatchlayout).intValue();
    }

    public int onExtraCallbackWithResult(@NonNull clearOnChildAttachStateChangeListeners clearonchildattachstatechangelisteners) {
        return onExtraCallbackWithResult.get(clearonchildattachstatechangelisteners).intValue();
    }

    public Set<animateAppearance> onExtraCallbackWithResult(int i2) {
        HashSet hashSet = new HashSet();
        if (i2 == 0 || i2 == 1) {
            hashSet.add(animateAppearance.OFF);
            hashSet.add(animateAppearance.TORCH);
            return hashSet;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                hashSet.add(animateAppearance.ON);
                return hashSet;
            }
            if (i2 != 4) {
                return hashSet;
            }
        }
        hashSet.add(animateAppearance.AUTO);
        return hashSet;
    }

    public clearOldPositions onNavigationEvent(int i2) {
        return onNavigationEvent(onWarmupCompleted, Integer.valueOf(i2));
    }

    public dispatchLayout IAuthTabCallback(int i2) {
        return onNavigationEvent(onExtraCallback, Integer.valueOf(i2));
    }

    public clearOnChildAttachStateChangeListeners onWarmupCompleted(int i2) {
        return onNavigationEvent(onExtraCallbackWithResult, Integer.valueOf(i2));
    }

    private <C extends addOnScrollListener, T> C onNavigationEvent(@NonNull Map<C, T> map, @NonNull T t) {
        for (C c : map.keySet()) {
            if (t.equals(map.get(c))) {
                return c;
            }
        }
        return null;
    }
}
