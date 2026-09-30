package io.reactivex.processors;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.MapConverter;
import o.TombstoneProtosLogBufferBuilder;
import o.access27300;
import o.floatExponent;
import o.setLogs;
import o.setSupportImageTintList;
import o.ycxExternalSyntheticLambda0;
import o.ycxExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ReplayProcessor<T> extends access27300<T> {
    private static final Object[] IAuthTabCallbackStub = new Object[0];
    static final ReplaySubscription[] onExtraCallbackWithResult = new ReplaySubscription[0];
    static final ReplaySubscription[] onWarmupCompleted = new ReplaySubscription[0];
    final ReplayBuffer<T> IAuthTabCallback;
    boolean onExtraCallback;
    final AtomicReference<ReplaySubscription<T>[]> onNavigationEvent;

    interface ReplayBuffer<T> {
        void onExtraCallback(T t);

        void onNavigationEvent();

        void onNavigationEvent(ReplaySubscription<T> replaySubscription);

        void onNavigationEvent(Throwable th);
    }

    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        ReplaySubscription<T> replaySubscription = new ReplaySubscription<>(ycxexternalsyntheticlambda0, this);
        ycxexternalsyntheticlambda0.onExtraCallback(replaySubscription);
        if (onExtraCallback((ReplaySubscription) replaySubscription) && replaySubscription.cancelled) {
            onNavigationEvent(replaySubscription);
        } else {
            this.IAuthTabCallback.onNavigationEvent(replaySubscription);
        }
    }

    public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        if (this.onExtraCallback) {
            ycxexternalsyntheticlambda1.cancel();
        } else {
            ycxexternalsyntheticlambda1.request(Long.MAX_VALUE);
        }
    }

    public void onWarmupCompleted(T t) {
        floatExponent.onExtraCallbackWithResult(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.onExtraCallback) {
            return;
        }
        ReplayBuffer<T> replayBuffer = this.IAuthTabCallback;
        replayBuffer.onExtraCallback(t);
        for (ReplaySubscription<T> replaySubscription : this.onNavigationEvent.get()) {
            replayBuffer.onNavigationEvent(replaySubscription);
        }
    }

    public void onWarmupCompleted(Throwable th) {
        floatExponent.onExtraCallbackWithResult(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.onExtraCallback) {
            RxJavaPlugins.onExtraCallbackWithResult(th);
            return;
        }
        this.onExtraCallback = true;
        ReplayBuffer<T> replayBuffer = this.IAuthTabCallback;
        replayBuffer.onNavigationEvent(th);
        for (ReplaySubscription<T> replaySubscription : this.onNavigationEvent.getAndSet(onWarmupCompleted)) {
            replayBuffer.onNavigationEvent(replaySubscription);
        }
    }

    public void onExtraCallbackWithResult() {
        if (this.onExtraCallback) {
            return;
        }
        this.onExtraCallback = true;
        ReplayBuffer<T> replayBuffer = this.IAuthTabCallback;
        replayBuffer.onNavigationEvent();
        for (ReplaySubscription<T> replaySubscription : this.onNavigationEvent.getAndSet(onWarmupCompleted)) {
            replayBuffer.onNavigationEvent(replaySubscription);
        }
    }

    boolean onExtraCallback(ReplaySubscription<T> replaySubscription) {
        ReplaySubscription<T>[] replaySubscriptionArr;
        ReplaySubscription[] replaySubscriptionArr2;
        do {
            replaySubscriptionArr = this.onNavigationEvent.get();
            if (replaySubscriptionArr == onWarmupCompleted) {
                return false;
            }
            int length = replaySubscriptionArr.length;
            replaySubscriptionArr2 = new ReplaySubscription[length + 1];
            System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr2, 0, length);
            replaySubscriptionArr2[length] = replaySubscription;
        } while (!setSupportImageTintList.onNavigationEvent(this.onNavigationEvent, replaySubscriptionArr, replaySubscriptionArr2));
        return true;
    }

    void onNavigationEvent(ReplaySubscription<T> replaySubscription) {
        ReplaySubscription<T>[] replaySubscriptionArr;
        ReplaySubscription[] replaySubscriptionArr2;
        do {
            replaySubscriptionArr = this.onNavigationEvent.get();
            if (replaySubscriptionArr == onWarmupCompleted || replaySubscriptionArr == onExtraCallbackWithResult) {
                return;
            }
            int length = replaySubscriptionArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (replaySubscriptionArr[i] == replaySubscription) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                replaySubscriptionArr2 = onExtraCallbackWithResult;
            } else {
                ReplaySubscription[] replaySubscriptionArr3 = new ReplaySubscription[length - 1];
                System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr3, 0, i);
                System.arraycopy(replaySubscriptionArr, i + 1, replaySubscriptionArr3, i, (length - i) - 1);
                replaySubscriptionArr2 = replaySubscriptionArr3;
            }
        } while (!setSupportImageTintList.onNavigationEvent(this.onNavigationEvent, replaySubscriptionArr, replaySubscriptionArr2));
    }

    static final class ReplaySubscription<T> extends AtomicInteger implements ycxExternalSyntheticLambda1 {
        private static final long serialVersionUID = 466549804534799122L;
        volatile boolean cancelled;
        final ycxExternalSyntheticLambda0<? super T> downstream;
        long emitted;
        Object index;
        final AtomicLong requested = new AtomicLong();
        final ReplayProcessor<T> state;

        ReplaySubscription(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, ReplayProcessor<T> replayProcessor) {
            this.downstream = ycxexternalsyntheticlambda0;
            this.state = replayProcessor;
        }

        public void request(long j) {
            if (setLogs.validate(j)) {
                TombstoneProtosLogBufferBuilder.onWarmupCompleted(this.requested, j);
                this.state.IAuthTabCallback.onNavigationEvent(this);
            }
        }

        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.state.onNavigationEvent(this);
        }
    }

    static final class UnboundedReplayBuffer<T> implements ReplayBuffer<T> {
        Throwable IAuthTabCallback;
        volatile boolean onExtraCallback;
        volatile int onExtraCallbackWithResult;
        final List<T> onNavigationEvent;

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void onExtraCallback(T t) {
            this.onNavigationEvent.add(t);
            this.onExtraCallbackWithResult++;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void onNavigationEvent(Throwable th) {
            this.IAuthTabCallback = th;
            this.onExtraCallback = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void onNavigationEvent() {
            this.onExtraCallback = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void onNavigationEvent(ReplaySubscription<T> replaySubscription) {
            int iIntValue;
            if (replaySubscription.getAndIncrement() == 0) {
                List<T> list = this.onNavigationEvent;
                ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0 = replaySubscription.downstream;
                Integer num = (Integer) replaySubscription.index;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                    replaySubscription.index = 0;
                }
                long j = replaySubscription.emitted;
                int iAddAndGet = 1;
                do {
                    long j2 = replaySubscription.requested.get();
                    while (j != j2) {
                        if (replaySubscription.cancelled) {
                            replaySubscription.index = null;
                            return;
                        }
                        boolean z = this.onExtraCallback;
                        int i = this.onExtraCallbackWithResult;
                        if (!z || iIntValue != i) {
                            if (iIntValue == i) {
                                break;
                            }
                            ycxexternalsyntheticlambda0.onWarmupCompleted(list.get(iIntValue));
                            iIntValue++;
                            j++;
                        } else {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th = this.IAuthTabCallback;
                            if (th == null) {
                                ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                                return;
                            } else {
                                ycxexternalsyntheticlambda0.onWarmupCompleted(th);
                                return;
                            }
                        }
                    }
                    if (j == j2) {
                        if (replaySubscription.cancelled) {
                            replaySubscription.index = null;
                            return;
                        }
                        boolean z2 = this.onExtraCallback;
                        int i2 = this.onExtraCallbackWithResult;
                        if (z2 && iIntValue == i2) {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th2 = this.IAuthTabCallback;
                            if (th2 == null) {
                                ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                                return;
                            } else {
                                ycxexternalsyntheticlambda0.onWarmupCompleted(th2);
                                return;
                            }
                        }
                    }
                    replaySubscription.index = Integer.valueOf(iIntValue);
                    replaySubscription.emitted = j;
                    iAddAndGet = replaySubscription.addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
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

    static final class SizeBoundReplayBuffer<T> implements ReplayBuffer<T> {
        final int IAuthTabCallback;
        Node<T> IAuthTabCallbackStub;
        volatile boolean onExtraCallback;
        Throwable onExtraCallbackWithResult;
        volatile Node<T> onNavigationEvent;
        int onWarmupCompleted;

        void onExtraCallbackWithResult() {
            int i = this.onWarmupCompleted;
            if (i > this.IAuthTabCallback) {
                this.onWarmupCompleted = i - 1;
                this.onNavigationEvent = this.onNavigationEvent.get();
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void onExtraCallback(T t) {
            Node<T> node = new Node<>(t);
            Node<T> node2 = this.IAuthTabCallbackStub;
            this.IAuthTabCallbackStub = node;
            this.onWarmupCompleted++;
            node2.set(node);
            onExtraCallbackWithResult();
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void onNavigationEvent(Throwable th) {
            this.onExtraCallbackWithResult = th;
            IAuthTabCallback();
            this.onExtraCallback = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void onNavigationEvent() {
            IAuthTabCallback();
            this.onExtraCallback = true;
        }

        public void IAuthTabCallback() {
            if (this.onNavigationEvent.value != null) {
                Node<T> node = new Node<>(null);
                node.lazySet(this.onNavigationEvent.get());
                this.onNavigationEvent = node;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void onNavigationEvent(ReplaySubscription<T> replaySubscription) {
            if (replaySubscription.getAndIncrement() == 0) {
                ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0 = replaySubscription.downstream;
                Node<T> node = (Node) replaySubscription.index;
                if (node == null) {
                    node = this.onNavigationEvent;
                }
                long j = replaySubscription.emitted;
                int iAddAndGet = 1;
                do {
                    long j2 = replaySubscription.requested.get();
                    while (j != j2) {
                        if (replaySubscription.cancelled) {
                            replaySubscription.index = null;
                            return;
                        }
                        boolean z = this.onExtraCallback;
                        Node<T> node2 = node.get();
                        boolean z2 = node2 == null;
                        if (!z || !z2) {
                            if (z2) {
                                break;
                            }
                            ycxexternalsyntheticlambda0.onWarmupCompleted(node2.value);
                            j++;
                            node = node2;
                        } else {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th = this.onExtraCallbackWithResult;
                            if (th == null) {
                                ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                                return;
                            } else {
                                ycxexternalsyntheticlambda0.onWarmupCompleted(th);
                                return;
                            }
                        }
                    }
                    if (j == j2) {
                        if (replaySubscription.cancelled) {
                            replaySubscription.index = null;
                            return;
                        }
                        if (this.onExtraCallback && node.get() == null) {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th2 = this.onExtraCallbackWithResult;
                            if (th2 == null) {
                                ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                                return;
                            } else {
                                ycxexternalsyntheticlambda0.onWarmupCompleted(th2);
                                return;
                            }
                        }
                    }
                    replaySubscription.index = node;
                    replaySubscription.emitted = j;
                    iAddAndGet = replaySubscription.addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }
    }

    static final class SizeAndTimeBoundReplayBuffer<T> implements ReplayBuffer<T> {
        Throwable IAuthTabCallback;
        final TimeUnit IAuthTabCallbackDefault;
        int IAuthTabCallbackStub;
        final MapConverter asBinder;
        volatile TimedNode<T> onExtraCallback;
        final int onExtraCallbackWithResult;
        volatile boolean onNavigationEvent;
        TimedNode<T> onTransact;
        final long onWarmupCompleted;

        void onExtraCallbackWithResult() {
            int i = this.IAuthTabCallbackStub;
            if (i > this.onExtraCallbackWithResult) {
                this.IAuthTabCallbackStub = i - 1;
                this.onExtraCallback = this.onExtraCallback.get();
            }
            long jOnExtraCallbackWithResult = this.asBinder.onExtraCallbackWithResult(this.IAuthTabCallbackDefault);
            long j = this.onWarmupCompleted;
            TimedNode<T> timedNode = this.onExtraCallback;
            while (this.IAuthTabCallbackStub > 1) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    this.onExtraCallback = timedNode;
                    return;
                } else if (timedNode2.time > jOnExtraCallbackWithResult - j) {
                    this.onExtraCallback = timedNode;
                    return;
                } else {
                    this.IAuthTabCallbackStub--;
                    timedNode = timedNode2;
                }
            }
            this.onExtraCallback = timedNode;
        }

        void onExtraCallback() {
            long jOnExtraCallbackWithResult = this.asBinder.onExtraCallbackWithResult(this.IAuthTabCallbackDefault);
            long j = this.onWarmupCompleted;
            TimedNode<T> timedNode = this.onExtraCallback;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    if (timedNode.value != null) {
                        this.onExtraCallback = new TimedNode<>(null, 0L);
                        return;
                    } else {
                        this.onExtraCallback = timedNode;
                        return;
                    }
                }
                if (timedNode2.time > jOnExtraCallbackWithResult - j) {
                    if (timedNode.value != null) {
                        TimedNode<T> timedNode3 = new TimedNode<>(null, 0L);
                        timedNode3.lazySet(timedNode.get());
                        this.onExtraCallback = timedNode3;
                        return;
                    }
                    this.onExtraCallback = timedNode;
                    return;
                }
                timedNode = timedNode2;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void onExtraCallback(T t) {
            TimedNode<T> timedNode = new TimedNode<>(t, this.asBinder.onExtraCallbackWithResult(this.IAuthTabCallbackDefault));
            TimedNode<T> timedNode2 = this.onTransact;
            this.onTransact = timedNode;
            this.IAuthTabCallbackStub++;
            timedNode2.set(timedNode);
            onExtraCallbackWithResult();
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void onNavigationEvent(Throwable th) {
            onExtraCallback();
            this.IAuthTabCallback = th;
            this.onNavigationEvent = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void onNavigationEvent() {
            onExtraCallback();
            this.onNavigationEvent = true;
        }

        TimedNode<T> onWarmupCompleted() {
            TimedNode<T> timedNode;
            TimedNode<T> timedNode2 = this.onExtraCallback;
            long jOnExtraCallbackWithResult = this.asBinder.onExtraCallbackWithResult(this.IAuthTabCallbackDefault);
            long j = this.onWarmupCompleted;
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

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void onNavigationEvent(ReplaySubscription<T> replaySubscription) {
            if (replaySubscription.getAndIncrement() == 0) {
                ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0 = replaySubscription.downstream;
                TimedNode<T> timedNodeOnWarmupCompleted = (TimedNode) replaySubscription.index;
                if (timedNodeOnWarmupCompleted == null) {
                    timedNodeOnWarmupCompleted = onWarmupCompleted();
                }
                long j = replaySubscription.emitted;
                int iAddAndGet = 1;
                do {
                    long j2 = replaySubscription.requested.get();
                    while (j != j2) {
                        if (replaySubscription.cancelled) {
                            replaySubscription.index = null;
                            return;
                        }
                        boolean z = this.onNavigationEvent;
                        TimedNode<T> timedNode = timedNodeOnWarmupCompleted.get();
                        boolean z2 = timedNode == null;
                        if (!z || !z2) {
                            if (z2) {
                                break;
                            }
                            ycxexternalsyntheticlambda0.onWarmupCompleted(timedNode.value);
                            j++;
                            timedNodeOnWarmupCompleted = timedNode;
                        } else {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th = this.IAuthTabCallback;
                            if (th == null) {
                                ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                                return;
                            } else {
                                ycxexternalsyntheticlambda0.onWarmupCompleted(th);
                                return;
                            }
                        }
                    }
                    if (j == j2) {
                        if (replaySubscription.cancelled) {
                            replaySubscription.index = null;
                            return;
                        }
                        if (this.onNavigationEvent && timedNodeOnWarmupCompleted.get() == null) {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th2 = this.IAuthTabCallback;
                            if (th2 == null) {
                                ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                                return;
                            } else {
                                ycxexternalsyntheticlambda0.onWarmupCompleted(th2);
                                return;
                            }
                        }
                    }
                    replaySubscription.index = timedNodeOnWarmupCompleted;
                    replaySubscription.emitted = j;
                    iAddAndGet = replaySubscription.addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }
    }
}
