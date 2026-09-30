package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class drawImageIconPadding<T> {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private setTid<List<T>> onNavigationEvent;

    private final setTid<List<T>> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (this.onNavigationEvent == null) {
            this.onNavigationEvent = setTid.onNavigationEvent();
        }
        setTid<List<T>> settid = this.onNavigationEvent;
        Intrinsics.checkNotNull(settid);
        int i4 = onExtraCallbackWithResult + 107;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return settid;
    }

    public void onWarmupCompleted(T t) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        List mutableList = CollectionsKt.toMutableList(onExtraCallback());
        mutableList.add(t);
        setTid<List<T>> settid = this.onNavigationEvent;
        Intrinsics.checkNotNull(settid);
        settid.onExtraCallback(mutableList);
        int i4 = onExtraCallback + 47;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
    }

    public void onExtraCallback(@NotNull List<? extends T> list) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        List mutableList = CollectionsKt.toMutableList(onExtraCallback());
        mutableList.addAll(list);
        setTid<List<T>> settid = this.onNavigationEvent;
        Intrinsics.checkNotNull(settid);
        settid.onExtraCallback(mutableList);
        int i4 = onExtraCallbackWithResult + 119;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onNavigationEvent(@NotNull List<? extends T> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        HashSet hashSet = new HashSet(onExtraCallback());
        hashSet.addAll(list);
        setTid<List<T>> settid = this.onNavigationEvent;
        Intrinsics.checkNotNull(settid);
        settid.onExtraCallback(new ArrayList(hashSet));
        int i2 = onExtraCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public boolean onExtraCallback(T t) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        List mutableList = CollectionsKt.toMutableList(onExtraCallback());
        if (!mutableList.remove(t)) {
            return false;
        }
        int i4 = onExtraCallbackWithResult + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        setTid<List<T>> settid = this.onNavigationEvent;
        Intrinsics.checkNotNull(settid);
        settid.onExtraCallback(mutableList);
        return true;
    }

    public void onWarmupCompleted(@NotNull List<? extends T> list) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        IAuthTabCallback();
        setTid<List<T>> settid = this.onNavigationEvent;
        Intrinsics.checkNotNull(settid);
        settid.onExtraCallback(list);
        int i4 = onExtraCallback + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public getByteBuffer<List<T>> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback();
        setTid<List<T>> settid = this.onNavigationEvent;
        Intrinsics.checkNotNull(settid);
        int i4 = onExtraCallback + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return settid;
        }
        throw null;
    }

    public List<T> onExtraCallback() {
        List<T> list;
        int i = 2 % 2;
        IAuthTabCallback();
        setTid<List<T>> settid = this.onNavigationEvent;
        if (settid == null || (list = (List) settid.onWarmupCompleted()) == null) {
            List<T> listEmptyList = CollectionsKt.emptyList();
            int i2 = onExtraCallback + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return listEmptyList;
        }
        int i4 = onExtraCallbackWithResult + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return list;
    }
}
