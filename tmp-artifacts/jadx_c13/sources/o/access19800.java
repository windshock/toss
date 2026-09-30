package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.LongCompanionObject;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access19800<T> extends ObjectConverter2<T, T> {
    final int onExtraCallback;
    final MapConverter onNavigationEvent;
    final boolean onWarmupCompleted;

    public access19800(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, MapConverter mapConverter, boolean z, int i) {
        super(jsonReaderUnknownNumberParsing);
        this.onNavigationEvent = mapConverter;
        this.onWarmupCompleted = z;
        this.onExtraCallback = i;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        MapConverter.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult();
        if (ycxexternalsyntheticlambda0 instanceof deserializeShortCollection) {
            this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onWarmupCompleted((deserializeShortCollection) ycxexternalsyntheticlambda0, onnavigationeventOnExtraCallbackWithResult, this.onWarmupCompleted, this.onExtraCallback));
        } else {
            this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onExtraCallback(ycxexternalsyntheticlambda0, onnavigationeventOnExtraCallbackWithResult, this.onWarmupCompleted, this.onExtraCallback));
        }
    }

    static abstract class onExtraCallbackWithResult<T> extends addAllLogs<T> implements JsonReaderReadObject<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final int limit;
        boolean outputFused;
        final int prefetch;
        long produced;
        parsePositiveDecimal<T> queue;
        final AtomicLong requested = new AtomicLong();
        int sourceMode;
        ycxExternalSyntheticLambda1 upstream;
        final MapConverter.onNavigationEvent worker;

        abstract void IAuthTabCallback();

        abstract void onExtraCallback();

        abstract void onNavigationEvent();

        onExtraCallbackWithResult(MapConverter.onNavigationEvent onnavigationevent, boolean z, int i) {
            this.worker = onnavigationevent;
            this.delayError = z;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public final void onWarmupCompleted(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode == 2) {
                onWarmupCompleted();
                return;
            }
            if (!this.queue.offer(t)) {
                this.upstream.cancel();
                this.error = new NetConverter4("Queue is full?!");
                this.done = true;
            }
            onWarmupCompleted();
        }

        @Override // o.ycxExternalSyntheticLambda0
        public final void onWarmupCompleted(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
                return;
            }
            this.error = th;
            this.done = true;
            onWarmupCompleted();
        }

        @Override // o.ycxExternalSyntheticLambda0
        public final void onExtraCallbackWithResult() {
            if (this.done) {
                return;
            }
            this.done = true;
            onWarmupCompleted();
        }

        @Override // o.ycxExternalSyntheticLambda1
        public final void request(long j) {
            if (setLogs.validate(j)) {
                TombstoneProtosLogBufferBuilder.onWarmupCompleted(this.requested, j);
                onWarmupCompleted();
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            this.worker.dispose();
            if (this.outputFused || getAndIncrement() != 0) {
                return;
            }
            this.queue.clear();
        }

        final void onWarmupCompleted() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.worker.IAuthTabCallback(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.outputFused) {
                IAuthTabCallback();
            } else if (this.sourceMode == 1) {
                onExtraCallback();
            } else {
                onNavigationEvent();
            }
        }

        final boolean onWarmupCompleted(boolean z, boolean z2, ycxExternalSyntheticLambda0<?> ycxexternalsyntheticlambda0) {
            if (this.cancelled) {
                clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.delayError) {
                if (!z2) {
                    return false;
                }
                this.cancelled = true;
                Throwable th = this.error;
                if (th != null) {
                    ycxexternalsyntheticlambda0.onWarmupCompleted(th);
                } else {
                    ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                }
                this.worker.dispose();
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.cancelled = true;
                clear();
                ycxexternalsyntheticlambda0.onWarmupCompleted(th2);
                this.worker.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.cancelled = true;
            ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
            this.worker.dispose();
            return true;
        }

        @Override // o.parseFloatGeneric
        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // o.parsePositiveDecimal
        public final void clear() {
            this.queue.clear();
        }

        @Override // o.parsePositiveDecimal
        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }
    }

    static final class onExtraCallback<T> extends onExtraCallbackWithResult<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        final ycxExternalSyntheticLambda0<? super T> downstream;

        onExtraCallback(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, MapConverter.onNavigationEvent onnavigationevent, boolean z, int i) {
            super(onnavigationevent, z, i);
            this.downstream = ycxexternalsyntheticlambda0;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.upstream, ycxexternalsyntheticlambda1)) {
                this.upstream = ycxexternalsyntheticlambda1;
                if (ycxexternalsyntheticlambda1 instanceof parsePositiveInt) {
                    parsePositiveInt parsepositiveint = (parsePositiveInt) ycxexternalsyntheticlambda1;
                    int iRequestFusion = parsepositiveint.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = parsepositiveint;
                        this.done = true;
                        this.downstream.onExtraCallback(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = parsepositiveint;
                        this.downstream.onExtraCallback(this);
                        ycxexternalsyntheticlambda1.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new getAllocationBacktraceCount(this.prefetch);
                this.downstream.onExtraCallback(this);
                ycxexternalsyntheticlambda1.request(this.prefetch);
            }
        }

        @Override // o.access19800.onExtraCallbackWithResult
        void onExtraCallback() {
            ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0 = this.downstream;
            parsePositiveDecimal<T> parsepositivedecimal = this.queue;
            long j = this.produced;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    try {
                        T tPoll = parsepositivedecimal.poll();
                        if (this.cancelled) {
                            return;
                        }
                        if (tPoll == null) {
                            this.cancelled = true;
                            ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                            this.worker.dispose();
                            return;
                        }
                        ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) tPoll);
                        j++;
                    } catch (Throwable th) {
                        NumberConverter.onWarmupCompleted(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        ycxexternalsyntheticlambda0.onWarmupCompleted(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (this.cancelled) {
                    return;
                }
                if (parsepositivedecimal.isEmpty()) {
                    this.cancelled = true;
                    ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                    this.worker.dispose();
                    return;
                } else {
                    int i = get();
                    if (iAddAndGet == i) {
                        this.produced = j;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i;
                    }
                }
            }
        }

        @Override // o.access19800.onExtraCallbackWithResult
        void onNavigationEvent() {
            ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0 = this.downstream;
            parsePositiveDecimal<T> parsepositivedecimal = this.queue;
            long j = this.produced;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.requested.get();
                while (j != jAddAndGet) {
                    boolean z = this.done;
                    try {
                        T tPoll = parsepositivedecimal.poll();
                        boolean z2 = tPoll == null;
                        if (!onWarmupCompleted(z, z2, ycxexternalsyntheticlambda0)) {
                            if (z2) {
                                break;
                            }
                            ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) tPoll);
                            j++;
                            if (j == this.limit) {
                                if (jAddAndGet != LongCompanionObject.MAX_VALUE) {
                                    jAddAndGet = this.requested.addAndGet(-j);
                                }
                                this.upstream.request(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        NumberConverter.onWarmupCompleted(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        parsepositivedecimal.clear();
                        ycxexternalsyntheticlambda0.onWarmupCompleted(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j == jAddAndGet && onWarmupCompleted(this.done, parsepositivedecimal.isEmpty(), ycxexternalsyntheticlambda0)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.produced = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // o.access19800.onExtraCallbackWithResult
        void IAuthTabCallback() {
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onWarmupCompleted(th);
                    } else {
                        this.downstream.onExtraCallbackWithResult();
                    }
                    this.worker.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // o.parsePositiveDecimal
        public T poll() throws Exception {
            T tPoll = this.queue.poll();
            if (tPoll != null && this.sourceMode != 1) {
                long j = this.produced + 1;
                if (j == this.limit) {
                    this.produced = 0L;
                    this.upstream.request(j);
                    return tPoll;
                }
                this.produced = j;
            }
            return tPoll;
        }
    }

    static final class onWarmupCompleted<T> extends onExtraCallbackWithResult<T> {
        private static final long serialVersionUID = 644624475404284533L;
        long consumed;
        final deserializeShortCollection<? super T> downstream;

        onWarmupCompleted(deserializeShortCollection<? super T> deserializeshortcollection, MapConverter.onNavigationEvent onnavigationevent, boolean z, int i) {
            super(onnavigationevent, z, i);
            this.downstream = deserializeshortcollection;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.upstream, ycxexternalsyntheticlambda1)) {
                this.upstream = ycxexternalsyntheticlambda1;
                if (ycxexternalsyntheticlambda1 instanceof parsePositiveInt) {
                    parsePositiveInt parsepositiveint = (parsePositiveInt) ycxexternalsyntheticlambda1;
                    int iRequestFusion = parsepositiveint.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = parsepositiveint;
                        this.done = true;
                        this.downstream.onExtraCallback((ycxExternalSyntheticLambda1) this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = parsepositiveint;
                        this.downstream.onExtraCallback((ycxExternalSyntheticLambda1) this);
                        ycxexternalsyntheticlambda1.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new getAllocationBacktraceCount(this.prefetch);
                this.downstream.onExtraCallback((ycxExternalSyntheticLambda1) this);
                ycxexternalsyntheticlambda1.request(this.prefetch);
            }
        }

        @Override // o.access19800.onExtraCallbackWithResult
        void onExtraCallback() {
            deserializeShortCollection<? super T> deserializeshortcollection = this.downstream;
            parsePositiveDecimal<T> parsepositivedecimal = this.queue;
            long j = this.produced;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    try {
                        T tPoll = parsepositivedecimal.poll();
                        if (this.cancelled) {
                            return;
                        }
                        if (tPoll == null) {
                            this.cancelled = true;
                            deserializeshortcollection.onExtraCallbackWithResult();
                            this.worker.dispose();
                            return;
                        } else if (deserializeshortcollection.onExtraCallback((deserializeShortCollection<? super T>) tPoll)) {
                            j++;
                        }
                    } catch (Throwable th) {
                        NumberConverter.onWarmupCompleted(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        deserializeshortcollection.onWarmupCompleted(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (this.cancelled) {
                    return;
                }
                if (parsepositivedecimal.isEmpty()) {
                    this.cancelled = true;
                    deserializeshortcollection.onExtraCallbackWithResult();
                    this.worker.dispose();
                    return;
                } else {
                    int i = get();
                    if (iAddAndGet == i) {
                        this.produced = j;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i;
                    }
                }
            }
        }

        @Override // o.access19800.onExtraCallbackWithResult
        void onNavigationEvent() {
            deserializeShortCollection<? super T> deserializeshortcollection = this.downstream;
            parsePositiveDecimal<T> parsepositivedecimal = this.queue;
            long j = this.produced;
            long j2 = this.consumed;
            int iAddAndGet = 1;
            while (true) {
                long j3 = this.requested.get();
                while (j != j3) {
                    boolean z = this.done;
                    try {
                        T tPoll = parsepositivedecimal.poll();
                        boolean z2 = tPoll == null;
                        if (!onWarmupCompleted(z, z2, deserializeshortcollection)) {
                            if (z2) {
                                break;
                            }
                            if (deserializeshortcollection.onExtraCallback((deserializeShortCollection<? super T>) tPoll)) {
                                j++;
                            }
                            j2++;
                            if (j2 == this.limit) {
                                this.upstream.request(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        NumberConverter.onWarmupCompleted(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        parsepositivedecimal.clear();
                        deserializeshortcollection.onWarmupCompleted(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j == j3 && onWarmupCompleted(this.done, parsepositivedecimal.isEmpty(), deserializeshortcollection)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.produced = j;
                    this.consumed = j2;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // o.access19800.onExtraCallbackWithResult
        void IAuthTabCallback() {
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onWarmupCompleted((deserializeShortCollection<? super T>) null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onWarmupCompleted(th);
                    } else {
                        this.downstream.onExtraCallbackWithResult();
                    }
                    this.worker.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // o.parsePositiveDecimal
        public T poll() throws Exception {
            T tPoll = this.queue.poll();
            if (tPoll != null && this.sourceMode != 1) {
                long j = this.consumed + 1;
                if (j == this.limit) {
                    this.consumed = 0L;
                    this.upstream.request(j);
                    return tPoll;
                }
                this.consumed = j;
            }
            return tPoll;
        }
    }
}
