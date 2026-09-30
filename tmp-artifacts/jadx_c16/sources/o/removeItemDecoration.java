package o;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class removeItemDecoration implements Comparable<removeItemDecoration> {
    static final HashMap<String, removeItemDecoration> onExtraCallbackWithResult = new HashMap<>(16);
    private final int IAuthTabCallback;
    private final int onNavigationEvent;

    public static removeItemDecoration onNavigationEvent(@NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener) {
        return onExtraCallback(removeonchildattachstatechangelistener.onExtraCallback(), removeonchildattachstatechangelistener.onExtraCallbackWithResult());
    }

    public static removeItemDecoration onExtraCallback(int i, int i2) {
        int iIAuthTabCallback = IAuthTabCallback(i, i2);
        if (iIAuthTabCallback > 0) {
            i /= iIAuthTabCallback;
        }
        if (iIAuthTabCallback > 0) {
            i2 /= iIAuthTabCallback;
        }
        String str = i + ":" + i2;
        HashMap<String, removeItemDecoration> map = onExtraCallbackWithResult;
        removeItemDecoration removeitemdecoration = map.get(str);
        if (removeitemdecoration != null) {
            return removeitemdecoration;
        }
        removeItemDecoration removeitemdecoration2 = new removeItemDecoration(i, i2);
        map.put(str, removeitemdecoration2);
        return removeitemdecoration2;
    }

    public static removeItemDecoration onExtraCallbackWithResult(@NonNull String str) {
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length != 2) {
            throw new NumberFormatException("Illegal AspectRatio string. Must be x:y");
        }
        return onExtraCallback(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]));
    }

    private removeItemDecoration(int i, int i2) {
        this.IAuthTabCallback = i;
        this.onNavigationEvent = i2;
    }

    public boolean onWarmupCompleted(@NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener, float f) {
        return Math.abs(onWarmupCompleted() - onNavigationEvent(removeonchildattachstatechangelistener).onWarmupCompleted()) <= f;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof removeItemDecoration) && onWarmupCompleted() == ((removeItemDecoration) obj).onWarmupCompleted();
    }

    public String toString() {
        return this.IAuthTabCallback + ":" + this.onNavigationEvent;
    }

    public float onWarmupCompleted() {
        return this.IAuthTabCallback / this.onNavigationEvent;
    }

    public int hashCode() {
        return Float.floatToIntBits(onWarmupCompleted());
    }

    @Override // java.lang.Comparable
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull removeItemDecoration removeitemdecoration) {
        return Float.compare(onWarmupCompleted(), removeitemdecoration.onWarmupCompleted());
    }

    public removeItemDecoration IAuthTabCallback() {
        return onExtraCallback(this.onNavigationEvent, this.IAuthTabCallback);
    }

    private static int IAuthTabCallback(int i, int i2) {
        while (i2 != 0) {
            int i3 = i2;
            i2 = i % i2;
            i = i3;
        }
        return i;
    }
}
