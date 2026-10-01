package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ParsingException1<T> extends JsonReaderUnknownNumberParsing<T> {
    final JsonReaderWithReader<T> onExtraCallback;
    final wasNull onExtraCallbackWithResult;

    public ParsingException1(JsonReaderWithReader<T> jsonReaderWithReader, wasNull wasnull) {
        this.onExtraCallback = jsonReaderWithReader;
        this.onExtraCallbackWithResult = wasnull;
    }

    /* renamed from: o.ParsingException1$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[wasNull.values().length];
            onExtraCallbackWithResult = iArr;
            try {
                iArr[wasNull.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallbackWithResult[wasNull.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onExtraCallbackWithResult[wasNull.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onExtraCallbackWithResult[wasNull.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        IAuthTabCallback iAuthTabCallbackStub;
        int i = AnonymousClass5.onExtraCallbackWithResult[this.onExtraCallbackWithResult.ordinal()];
        if (i == 1) {
            iAuthTabCallbackStub = new IAuthTabCallbackStub(ycxexternalsyntheticlambda0);
        } else if (i == 2) {
            iAuthTabCallbackStub = new onExtraCallback(ycxexternalsyntheticlambda0);
        } else if (i == 3) {
            iAuthTabCallbackStub = new onWarmupCompleted(ycxexternalsyntheticlambda0);
        } else if (i == 4) {
            iAuthTabCallbackStub = new onNavigationEvent(ycxexternalsyntheticlambda0);
        } else {
            iAuthTabCallbackStub = new onExtraCallbackWithResult(ycxexternalsyntheticlambda0, JsonReaderUnknownNumberParsing.IAuthTabCallback());
        }
        ycxexternalsyntheticlambda0.onExtraCallback(iAuthTabCallbackStub);
        try {
            this.onExtraCallback.subscribe(iAuthTabCallbackStub);
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            iAuthTabCallbackStub.onExtraCallback(th);
        }
    }

    static abstract class IAuthTabCallback<T> extends AtomicLong implements JsonReaderWithObjectReader<T>, ycxExternalSyntheticLambda1 {
        private static final long serialVersionUID = 7326289992464377023L;
        final ycxExternalSyntheticLambda0<? super T> downstream;
        final deserializeShortArray serial = new deserializeShortArray();

        void IAuthTabCallback() {
        }

        void onExtraCallbackWithResult() {
        }

        IAuthTabCallback(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
            this.downstream = ycxexternalsyntheticlambda0;
        }

        @Override // o.JsonReaderReadJsonObject
        public void onNavigationEvent() {
            onExtraCallback();
        }

        protected void onExtraCallback() {
            if (onWarmupCompleted()) {
                return;
            }
            try {
                this.downstream.onExtraCallbackWithResult();
            } finally {
                this.serial.dispose();
            }
        }

        @Override // o.JsonReaderReadJsonObject
        public final void onExtraCallback(Throwable th) {
            if (onWarmupCompleted(th)) {
                return;
            }
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }

        public boolean onWarmupCompleted(Throwable th) {
            return IAuthTabCallback(th);
        }

        protected boolean IAuthTabCallback(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (onWarmupCompleted()) {
                return false;
            }
            try {
                this.downstream.onWarmupCompleted(th);
                this.serial.dispose();
                return true;
            } catch (Throwable th2) {
                this.serial.dispose();
                throw th2;
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public final void cancel() {
            this.serial.dispose();
            IAuthTabCallback();
        }

        @Override // o.JsonReaderWithObjectReader
        public final boolean onWarmupCompleted() {
            return this.serial.isDisposed();
        }

        @Override // o.ycxExternalSyntheticLambda1
        public final void request(long j) {
            if (setLogs.validate(j)) {
                TombstoneProtosLogBufferBuilder.onWarmupCompleted(this, j);
                onExtraCallbackWithResult();
            }
        }

        @Override // o.JsonReaderWithObjectReader
        public final void onWarmupCompleted(deserializeUriNullableCollection deserializeurinullablecollection) {
            this.serial.onExtraCallbackWithResult(deserializeurinullablecollection);
        }

        @Override // o.JsonReaderWithObjectReader
        public final void onExtraCallback(deserializeFloatArray deserializefloatarray) {
            onWarmupCompleted(new deserializeLongNullableCollection(deserializefloatarray));
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }

    static final class IAuthTabCallbackStub<T> extends IAuthTabCallback<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        IAuthTabCallbackStub(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
            super(ycxexternalsyntheticlambda0);
        }

        @Override // o.JsonReaderReadJsonObject
        public void IAuthTabCallback(T t) {
            long j;
            if (onWarmupCompleted()) {
                return;
            }
            if (t != null) {
                this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
                do {
                    j = get();
                    if (j == 0) {
                        return;
                    }
                } while (!compareAndSet(j, j - 1));
                return;
            }
            onExtraCallback(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        }
    }

    static abstract class IAuthTabCallbackDefault<T> extends IAuthTabCallback<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        abstract void asBinder();

        IAuthTabCallbackDefault(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
            super(ycxexternalsyntheticlambda0);
        }

        @Override // o.JsonReaderReadJsonObject
        public final void IAuthTabCallback(T t) {
            if (onWarmupCompleted()) {
                return;
            }
            if (t == null) {
                onExtraCallback(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (get() != 0) {
                this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
                TombstoneProtosLogBufferBuilder.onExtraCallbackWithResult(this, 1L);
            } else {
                asBinder();
            }
        }
    }

    static final class onWarmupCompleted<T> extends IAuthTabCallbackDefault<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        @Override // o.ParsingException1.IAuthTabCallbackDefault
        void asBinder() {
        }

        onWarmupCompleted(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
            super(ycxexternalsyntheticlambda0);
        }
    }

    static final class onExtraCallback<T> extends IAuthTabCallbackDefault<T> {
        private static final long serialVersionUID = 338953216916120960L;

        onExtraCallback(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
            super(ycxexternalsyntheticlambda0);
        }

        @Override // o.ParsingException1.IAuthTabCallbackDefault
        void asBinder() {
            onExtraCallback(new NetConverter4("create: could not emit value due to lack of requests"));
        }
    }

    static final class onExtraCallbackWithResult<T> extends IAuthTabCallback<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        volatile boolean done;
        Throwable error;
        final getAllocationBacktraceOrBuilder<T> queue;
        final AtomicInteger wip;

        onExtraCallbackWithResult(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, int i) {
            super(ycxexternalsyntheticlambda0);
            this.queue = new getAllocationBacktraceOrBuilder<>(i);
            this.wip = new AtomicInteger();
        }

        @Override // o.JsonReaderReadJsonObject
        public void IAuthTabCallback(T t) {
            if (this.done || onWarmupCompleted()) {
                return;
            }
            if (t == null) {
                onExtraCallback(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.queue.offer(t);
                asInterface();
            }
        }

        @Override // o.ParsingException1.IAuthTabCallback
        public boolean onWarmupCompleted(Throwable th) {
            if (this.done || onWarmupCompleted()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.error = th;
            this.done = true;
            asInterface();
            return true;
        }

        @Override // o.ParsingException1.IAuthTabCallback, o.JsonReaderReadJsonObject
        public void onNavigationEvent() {
            this.done = true;
            asInterface();
        }

        @Override // o.ParsingException1.IAuthTabCallback
        void onExtraCallbackWithResult() {
            asInterface();
        }

        @Override // o.ParsingException1.IAuthTabCallback
        void IAuthTabCallback() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        void asInterface() {
            if (this.wip.getAndIncrement() == 0) {
                ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0 = this.downstream;
                getAllocationBacktraceOrBuilder<T> getallocationbacktraceorbuilder = this.queue;
                int iAddAndGet = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (onWarmupCompleted()) {
                            getallocationbacktraceorbuilder.clear();
                            return;
                        }
                        boolean z = this.done;
                        T tPoll = getallocationbacktraceorbuilder.poll();
                        boolean z2 = tPoll == null;
                        if (!z || !z2) {
                            if (z2) {
                                break;
                            }
                            ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) tPoll);
                            j2++;
                        } else {
                            Throwable th = this.error;
                            if (th != null) {
                                IAuthTabCallback(th);
                                return;
                            } else {
                                onExtraCallback();
                                return;
                            }
                        }
                    }
                    if (j2 == j) {
                        if (onWarmupCompleted()) {
                            getallocationbacktraceorbuilder.clear();
                            return;
                        }
                        boolean z3 = this.done;
                        boolean zIsEmpty = getallocationbacktraceorbuilder.isEmpty();
                        if (z3 && zIsEmpty) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                IAuthTabCallback(th2);
                                return;
                            } else {
                                onExtraCallback();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        TombstoneProtosLogBufferBuilder.onExtraCallbackWithResult(this, j2);
                    }
                    iAddAndGet = this.wip.addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }
    }

    static final class onNavigationEvent<T> extends IAuthTabCallback<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        volatile boolean done;
        Throwable error;
        final AtomicReference<T> queue;
        final AtomicInteger wip;

        onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
            super(ycxexternalsyntheticlambda0);
            this.queue = new AtomicReference<>();
            this.wip = new AtomicInteger();
        }

        @Override // o.JsonReaderReadJsonObject
        public void IAuthTabCallback(T t) {
            if (this.done || onWarmupCompleted()) {
                return;
            }
            if (t == null) {
                onExtraCallback(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.queue.set(t);
                IAuthTabCallbackStub();
            }
        }

        @Override // o.ParsingException1.IAuthTabCallback
        public boolean onWarmupCompleted(Throwable th) {
            if (this.done || onWarmupCompleted()) {
                return false;
            }
            if (th == null) {
                onExtraCallback(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.error = th;
            this.done = true;
            IAuthTabCallbackStub();
            return true;
        }

        @Override // o.ParsingException1.IAuthTabCallback, o.JsonReaderReadJsonObject
        public void onNavigationEvent() {
            this.done = true;
            IAuthTabCallbackStub();
        }

        @Override // o.ParsingException1.IAuthTabCallback
        void onExtraCallbackWithResult() {
            IAuthTabCallbackStub();
        }

        @Override // o.ParsingException1.IAuthTabCallback
        void IAuthTabCallback() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet(null);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
        
            if (r9 != r5) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        
            if (onWarmupCompleted() == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        
            r2.lazySet(null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
        
            r5 = r17.done;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
        
            if (r2.get() != null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
        
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        
            if (r5 == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
        
            if (r12 == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
        
            r1 = r17.error;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
        
            if (r1 == null) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x006a, code lost:
        
            IAuthTabCallback(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x006e, code lost:
        
            onExtraCallback();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0074, code lost:
        
            if (r9 == 0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0076, code lost:
        
            o.TombstoneProtosLogBufferBuilder.onExtraCallbackWithResult(r17, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0079, code lost:
        
            r4 = r17.wip.addAndGet(-r4);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void IAuthTabCallbackStub() {
            if (this.wip.getAndIncrement() == 0) {
                ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0 = this.downstream;
                AtomicReference<T> atomicReference = this.queue;
                int iAddAndGet = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        boolean z = false;
                        if (j2 == j) {
                            break;
                        }
                        if (onWarmupCompleted()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z2 = this.done;
                        T andSet = atomicReference.getAndSet(null);
                        boolean z3 = andSet == null;
                        if (!z2 || !z3) {
                            if (z3) {
                                break;
                            }
                            ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) andSet);
                            j2++;
                        } else {
                            Throwable th = this.error;
                            if (th != null) {
                                IAuthTabCallback(th);
                                return;
                            } else {
                                onExtraCallback();
                                return;
                            }
                        }
                    }
                } while (iAddAndGet != 0);
            }
        }
    }
}
