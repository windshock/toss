package io.reactivex.subjects;

import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.MapConverter;
import o.access26200;
import o.deserializeUriNullableCollection;
import o.floatExponent;
import o.setSupportImageTintList;
import o.setTimestampBytes;
import o.writeQuoted;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ReplaySubject<T> extends setTimestampBytes<T> {
    static final ReplayDisposable[] onExtraCallbackWithResult = new ReplayDisposable[0];
    static final ReplayDisposable[] onNavigationEvent = new ReplayDisposable[0];
    private static final Object[] onTransact = new Object[0];
    boolean IAuthTabCallback;
    final ReplayBuffer<T> onExtraCallback;
    final AtomicReference<ReplayDisposable<T>[]> onWarmupCompleted = new AtomicReference<>(onExtraCallbackWithResult);

    interface ReplayBuffer<T> {
        void IAuthTabCallback(ReplayDisposable<T> replayDisposable);

        boolean compareAndSet(Object obj, Object obj2);

        int onNavigationEvent();

        void onNavigationEvent(Object obj);

        void onWarmupCompleted(T t);

        T[] onWarmupCompleted(T[] tArr);
    }

    public static <T> ReplaySubject<T> onNavigationEvent() {
        return new ReplaySubject<>(new UnboundedReplayBuffer(16));
    }

    ReplaySubject(ReplayBuffer<T> replayBuffer) {
        this.onExtraCallback = replayBuffer;
    }

    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        ReplayDisposable<T> replayDisposable = new ReplayDisposable<>(writequoted, this);
        writequoted.IAuthTabCallback(replayDisposable);
        if (replayDisposable.cancelled) {
            return;
        }
        if (onNavigationEvent(replayDisposable) && replayDisposable.cancelled) {
            onExtraCallback((ReplayDisposable) replayDisposable);
        } else {
            this.onExtraCallback.IAuthTabCallback(replayDisposable);
        }
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        if (this.IAuthTabCallback) {
            deserializeurinullablecollection.dispose();
        }
    }

    public void onExtraCallback(T t) {
        floatExponent.onExtraCallbackWithResult(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.IAuthTabCallback) {
            return;
        }
        ReplayBuffer<T> replayBuffer = this.onExtraCallback;
        replayBuffer.onWarmupCompleted((ReplayBuffer<T>) t);
        for (ReplayDisposable<T> replayDisposable : this.onWarmupCompleted.get()) {
            replayBuffer.IAuthTabCallback(replayDisposable);
        }
    }

    public void onExtraCallbackWithResult(Throwable th) {
        floatExponent.onExtraCallbackWithResult(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.IAuthTabCallback) {
            RxJavaPlugins.onExtraCallbackWithResult(th);
            return;
        }
        this.IAuthTabCallback = true;
        Object objError = access26200.error(th);
        ReplayBuffer<T> replayBuffer = this.onExtraCallback;
        replayBuffer.onNavigationEvent(objError);
        for (ReplayDisposable<T> replayDisposable : asBinder(objError)) {
            replayBuffer.IAuthTabCallback(replayDisposable);
        }
    }

    public void onExtraCallback() {
        if (this.IAuthTabCallback) {
            return;
        }
        this.IAuthTabCallback = true;
        Object objComplete = access26200.complete();
        ReplayBuffer<T> replayBuffer = this.onExtraCallback;
        replayBuffer.onNavigationEvent(objComplete);
        for (ReplayDisposable<T> replayDisposable : asBinder(objComplete)) {
            replayBuffer.IAuthTabCallback(replayDisposable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] onExtraCallbackWithResult() {
        Object[] objArr = onTransact;
        Object[] objArrIAuthTabCallback = IAuthTabCallback(objArr);
        return objArrIAuthTabCallback == objArr ? new Object[0] : objArrIAuthTabCallback;
    }

    public T[] IAuthTabCallback(T[] tArr) {
        return this.onExtraCallback.onWarmupCompleted((Object[]) tArr);
    }

    public boolean onWarmupCompleted() {
        return this.onExtraCallback.onNavigationEvent() != 0;
    }

    boolean onNavigationEvent(ReplayDisposable<T> replayDisposable) {
        ReplayDisposable<T>[] replayDisposableArr;
        ReplayDisposable[] replayDisposableArr2;
        do {
            replayDisposableArr = this.onWarmupCompleted.get();
            if (replayDisposableArr == onNavigationEvent) {
                return false;
            }
            int length = replayDisposableArr.length;
            replayDisposableArr2 = new ReplayDisposable[length + 1];
            System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, length);
            replayDisposableArr2[length] = replayDisposable;
        } while (!setSupportImageTintList.onNavigationEvent(this.onWarmupCompleted, replayDisposableArr, replayDisposableArr2));
        return true;
    }

    void onExtraCallback(ReplayDisposable<T> replayDisposable) {
        ReplayDisposable<T>[] replayDisposableArr;
        ReplayDisposable[] replayDisposableArr2;
        do {
            replayDisposableArr = this.onWarmupCompleted.get();
            if (replayDisposableArr == onNavigationEvent || replayDisposableArr == onExtraCallbackWithResult) {
                return;
            }
            int length = replayDisposableArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (replayDisposableArr[i] == replayDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                replayDisposableArr2 = onExtraCallbackWithResult;
            } else {
                ReplayDisposable[] replayDisposableArr3 = new ReplayDisposable[length - 1];
                System.arraycopy(replayDisposableArr, 0, replayDisposableArr3, 0, i);
                System.arraycopy(replayDisposableArr, i + 1, replayDisposableArr3, i, (length - i) - 1);
                replayDisposableArr2 = replayDisposableArr3;
            }
        } while (!setSupportImageTintList.onNavigationEvent(this.onWarmupCompleted, replayDisposableArr, replayDisposableArr2));
    }

    ReplayDisposable<T>[] asBinder(Object obj) {
        if (this.onExtraCallback.compareAndSet(null, obj)) {
            return this.onWarmupCompleted.getAndSet(onNavigationEvent);
        }
        return onNavigationEvent;
    }

    static final class ReplayDisposable<T> extends AtomicInteger implements deserializeUriNullableCollection {
        private static final long serialVersionUID = 466549804534799122L;
        volatile boolean cancelled;
        final writeQuoted<? super T> downstream;
        Object index;
        final ReplaySubject<T> state;

        ReplayDisposable(writeQuoted<? super T> writequoted, ReplaySubject<T> replaySubject) {
            this.downstream = writequoted;
            this.state = replaySubject;
        }

        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.state.onExtraCallback((ReplayDisposable) this);
        }

        public boolean isDisposed() {
            return this.cancelled;
        }
    }

    static final class UnboundedReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
        private static final long serialVersionUID = -733876083048047795L;
        final List<Object> buffer;
        volatile boolean done;
        volatile int size;

        UnboundedReplayBuffer(int i) {
            this.buffer = new ArrayList(floatExponent.onExtraCallbackWithResult(i, "capacityHint"));
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void onWarmupCompleted(T t) {
            this.buffer.add(t);
            this.size++;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void onNavigationEvent(Object obj) {
            this.buffer.add(obj);
            this.size++;
            this.done = true;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public T[] onWarmupCompleted(T[] tArr) {
            int i = this.size;
            if (i == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<Object> list = this.buffer;
            Object obj = list.get(i - 1);
            if ((access26200.isComplete(obj) || access26200.isError(obj)) && i - 1 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = list.get(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void IAuthTabCallback(ReplayDisposable<T> replayDisposable) {
            int iIntValue;
            int i;
            if (replayDisposable.getAndIncrement() == 0) {
                List<Object> list = this.buffer;
                writeQuoted<? super T> writequoted = replayDisposable.downstream;
                Integer num = (Integer) replayDisposable.index;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                    replayDisposable.index = 0;
                }
                int iAddAndGet = 1;
                while (!replayDisposable.cancelled) {
                    int i2 = this.size;
                    while (i2 != iIntValue) {
                        if (replayDisposable.cancelled) {
                            replayDisposable.index = null;
                            return;
                        }
                        Object obj = list.get(iIntValue);
                        if (this.done && (i = iIntValue + 1) == i2 && i == (i2 = this.size)) {
                            if (access26200.isComplete(obj)) {
                                writequoted.onExtraCallback();
                            } else {
                                writequoted.onExtraCallbackWithResult(access26200.getError(obj));
                            }
                            replayDisposable.index = null;
                            replayDisposable.cancelled = true;
                            return;
                        }
                        writequoted.onExtraCallback(obj);
                        iIntValue++;
                    }
                    if (iIntValue == this.size) {
                        replayDisposable.index = Integer.valueOf(iIntValue);
                        iAddAndGet = replayDisposable.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
                replayDisposable.index = null;
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public int onNavigationEvent() {
            int i = this.size;
            if (i == 0) {
                return 0;
            }
            int i2 = i - 1;
            Object obj = this.buffer.get(i2);
            return (access26200.isComplete(obj) || access26200.isError(obj)) ? i2 : i;
        }
    }

    static final class Node<T> extends AtomicReference<Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final T value;

        Node(T t) {
            this.value = t;
        }
    }

    static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final long time;
        final T value;

        TimedNode(T t, long j) {
            this.value = t;
            this.time = j;
        }
    }

    static final class SizeBoundReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
        private static final long serialVersionUID = 1107649250281456395L;
        volatile boolean done;
        volatile Node<Object> head;
        final int maxSize;
        int size;
        Node<Object> tail;

        void onWarmupCompleted() {
            int i = this.size;
            if (i > this.maxSize) {
                this.size = i - 1;
                this.head = this.head.get();
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void onWarmupCompleted(T t) {
            Node<Object> node = new Node<>(t);
            Node<Object> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.set(node);
            onWarmupCompleted();
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void onNavigationEvent(Object obj) {
            Node<Object> node = new Node<>(obj);
            Node<Object> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.lazySet(node);
            onExtraCallback();
            this.done = true;
        }

        public void onExtraCallback() {
            Node<Object> node = this.head;
            if (node.value != null) {
                Node<Object> node2 = new Node<>(null);
                node2.lazySet(node.get());
                this.head = node2;
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public T[] onWarmupCompleted(T[] tArr) {
            Node<T> node = this.head;
            int iOnNavigationEvent = onNavigationEvent();
            if (iOnNavigationEvent == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < iOnNavigationEvent) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iOnNavigationEvent));
            }
            for (int i = 0; i != iOnNavigationEvent; i++) {
                node = node.get();
                tArr[i] = node.value;
            }
            if (tArr.length > iOnNavigationEvent) {
                tArr[iOnNavigationEvent] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void IAuthTabCallback(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() == 0) {
                writeQuoted<? super T> writequoted = replayDisposable.downstream;
                Node<Object> node = (Node) replayDisposable.index;
                if (node == null) {
                    node = this.head;
                }
                int iAddAndGet = 1;
                while (!replayDisposable.cancelled) {
                    Node<T> node2 = node.get();
                    if (node2 != null) {
                        T t = node2.value;
                        if (this.done && node2.get() == null) {
                            if (access26200.isComplete(t)) {
                                writequoted.onExtraCallback();
                            } else {
                                writequoted.onExtraCallbackWithResult(access26200.getError(t));
                            }
                            replayDisposable.index = null;
                            replayDisposable.cancelled = true;
                            return;
                        }
                        writequoted.onExtraCallback(t);
                        node = node2;
                    } else if (node.get() == null) {
                        replayDisposable.index = node;
                        iAddAndGet = replayDisposable.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
                replayDisposable.index = null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        
            return r1;
         */
        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int onNavigationEvent() {
            Node<Object> node = this.head;
            int i = 0;
            while (true) {
                if (i == Integer.MAX_VALUE) {
                    break;
                }
                Node<T> node2 = node.get();
                if (node2 == null) {
                    Object obj = node.value;
                    if (access26200.isComplete(obj) || access26200.isError(obj)) {
                        return i - 1;
                    }
                } else {
                    i++;
                    node = node2;
                }
            }
        }
    }

    static final class SizeAndTimeBoundReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
        private static final long serialVersionUID = -8056260896137901749L;
        volatile boolean done;
        volatile TimedNode<Object> head;
        final long maxAge;
        final int maxSize;
        final MapConverter scheduler;
        int size;
        TimedNode<Object> tail;
        final TimeUnit unit;

        void IAuthTabCallback() {
            int i = this.size;
            if (i > this.maxSize) {
                this.size = i - 1;
                this.head = this.head.get();
            }
            long jOnExtraCallbackWithResult = this.scheduler.onExtraCallbackWithResult(this.unit);
            long j = this.maxAge;
            TimedNode<Object> timedNode = this.head;
            while (this.size > 1) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    this.head = timedNode;
                    return;
                } else if (timedNode2.time > jOnExtraCallbackWithResult - j) {
                    this.head = timedNode;
                    return;
                } else {
                    this.size--;
                    timedNode = timedNode2;
                }
            }
            this.head = timedNode;
        }

        void onWarmupCompleted() {
            long jOnExtraCallbackWithResult = this.scheduler.onExtraCallbackWithResult(this.unit);
            long j = this.maxAge;
            TimedNode<Object> timedNode = this.head;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2.get() == null) {
                    if (timedNode.value != null) {
                        TimedNode<Object> timedNode3 = new TimedNode<>(null, 0L);
                        timedNode3.lazySet(timedNode.get());
                        this.head = timedNode3;
                        return;
                    }
                    this.head = timedNode;
                    return;
                }
                if (timedNode2.time > jOnExtraCallbackWithResult - j) {
                    if (timedNode.value != null) {
                        TimedNode<Object> timedNode4 = new TimedNode<>(null, 0L);
                        timedNode4.lazySet(timedNode.get());
                        this.head = timedNode4;
                        return;
                    }
                    this.head = timedNode;
                    return;
                }
                timedNode = timedNode2;
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void onWarmupCompleted(T t) {
            TimedNode<Object> timedNode = new TimedNode<>(t, this.scheduler.onExtraCallbackWithResult(this.unit));
            TimedNode<Object> timedNode2 = this.tail;
            this.tail = timedNode;
            this.size++;
            timedNode2.set(timedNode);
            IAuthTabCallback();
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void onNavigationEvent(Object obj) {
            TimedNode<Object> timedNode = new TimedNode<>(obj, Long.MAX_VALUE);
            TimedNode<Object> timedNode2 = this.tail;
            this.tail = timedNode;
            this.size++;
            timedNode2.lazySet(timedNode);
            onWarmupCompleted();
            this.done = true;
        }

        TimedNode<Object> onExtraCallbackWithResult() {
            TimedNode<Object> timedNode;
            TimedNode<Object> timedNode2 = this.head;
            long jOnExtraCallbackWithResult = this.scheduler.onExtraCallbackWithResult(this.unit);
            long j = this.maxAge;
            TimedNode<T> timedNode3 = timedNode2.get();
            while (true) {
                TimedNode<T> timedNode4 = timedNode3;
                timedNode = timedNode2;
                timedNode2 = timedNode4;
                if (timedNode2 == null || timedNode2.time > jOnExtraCallbackWithResult - j) {
                    break;
                }
                timedNode3 = timedNode2.get();
            }
            return timedNode;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public T[] onWarmupCompleted(T[] tArr) {
            TimedNode<T> timedNodeOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int iOnWarmupCompleted = onWarmupCompleted(timedNodeOnExtraCallbackWithResult);
            if (iOnWarmupCompleted == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < iOnWarmupCompleted) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iOnWarmupCompleted));
            }
            for (int i = 0; i != iOnWarmupCompleted; i++) {
                timedNodeOnExtraCallbackWithResult = timedNodeOnExtraCallbackWithResult.get();
                tArr[i] = timedNodeOnExtraCallbackWithResult.value;
            }
            if (tArr.length > iOnWarmupCompleted) {
                tArr[iOnWarmupCompleted] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void IAuthTabCallback(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() == 0) {
                writeQuoted<? super T> writequoted = replayDisposable.downstream;
                TimedNode<Object> timedNodeOnExtraCallbackWithResult = (TimedNode) replayDisposable.index;
                if (timedNodeOnExtraCallbackWithResult == null) {
                    timedNodeOnExtraCallbackWithResult = onExtraCallbackWithResult();
                }
                int iAddAndGet = 1;
                while (!replayDisposable.cancelled) {
                    while (!replayDisposable.cancelled) {
                        TimedNode<T> timedNode = timedNodeOnExtraCallbackWithResult.get();
                        if (timedNode != null) {
                            T t = timedNode.value;
                            if (this.done && timedNode.get() == null) {
                                if (access26200.isComplete(t)) {
                                    writequoted.onExtraCallback();
                                } else {
                                    writequoted.onExtraCallbackWithResult(access26200.getError(t));
                                }
                                replayDisposable.index = null;
                                replayDisposable.cancelled = true;
                                return;
                            }
                            writequoted.onExtraCallback(t);
                            timedNodeOnExtraCallbackWithResult = timedNode;
                        } else if (timedNodeOnExtraCallbackWithResult.get() == null) {
                            replayDisposable.index = timedNodeOnExtraCallbackWithResult;
                            iAddAndGet = replayDisposable.addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                return;
                            }
                        }
                    }
                    replayDisposable.index = null;
                    return;
                }
                replayDisposable.index = null;
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public int onNavigationEvent() {
            return onWarmupCompleted(onExtraCallbackWithResult());
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
        
            return r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int onWarmupCompleted(TimedNode<Object> timedNode) {
            int i = 0;
            while (true) {
                if (i == Integer.MAX_VALUE) {
                    break;
                }
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    Object obj = timedNode.value;
                    if (access26200.isComplete(obj) || access26200.isError(obj)) {
                        return i - 1;
                    }
                } else {
                    i++;
                    timedNode = timedNode2;
                }
            }
        }
    }
}
