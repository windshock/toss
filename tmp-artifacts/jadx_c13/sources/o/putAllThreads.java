package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getProcessUptime;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class putAllThreads<E> extends getThreadsCount<E> {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final putAllThreads onWarmupCompleted = new putAllThreads(new Object[0]);
    private final Object[] IAuthTabCallback;

    public putAllThreads(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        this.IAuthTabCallback = objArr;
        int length = objArr.length;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.IAuthTabCallback.length;
    }

    @Override // o.getProcessUptime
    public getProcessUptime<E> onWarmupCompleted(E e) {
        if (size() < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(this.IAuthTabCallback, size() + 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            objArrCopyOf[size()] = e;
            return new putAllThreads(objArrCopyOf);
        }
        return new getThreadsOrDefault(this.IAuthTabCallback, removeThreads.onExtraCallback(e), size() + 1, 0);
    }

    @Override // o.getThreadsCount, o.getProcessUptime
    public getProcessUptime<E> onWarmupCompleted(@NotNull Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        if (collection.isEmpty()) {
            return this;
        }
        if (size() + collection.size() <= 32) {
            Object[] objArrCopyOf = Arrays.copyOf(this.IAuthTabCallback, size() + collection.size());
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            int size = size();
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                objArrCopyOf[size] = it.next();
                size++;
            }
            return new putAllThreads(objArrCopyOf);
        }
        getProcessUptime.onExtraCallback<E> onextracallbackIAuthTabCallback = IAuthTabCallback();
        onextracallbackIAuthTabCallback.addAll(collection);
        return onextracallbackIAuthTabCallback.IAuthTabCallback();
    }

    @Override // o.getProcessUptime
    public getProcessUptime.onExtraCallback<E> IAuthTabCallback() {
        return new getThreadsOrThrow(this, null, this.IAuthTabCallback, 0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public int indexOf(Object obj) {
        return ArraysKt___ArraysKt.indexOf(this.IAuthTabCallback, obj);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        return ArraysKt___ArraysKt.lastIndexOf(this.IAuthTabCallback, obj);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        RegistersComponents.onExtraCallback(i, size());
        return new getSignalInfo(this.IAuthTabCallback, i, size());
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int i) {
        RegistersComponents.onExtraCallbackWithResult(i, size());
        return (E) this.IAuthTabCallback[i];
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final putAllThreads onWarmupCompleted() {
            return putAllThreads.onWarmupCompleted;
        }
    }
}
