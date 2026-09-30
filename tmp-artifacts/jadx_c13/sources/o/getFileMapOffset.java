package o;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getFileMapOffset<T, U extends Collection<? super T>> extends setPc<T, U> {
    final Callable<U> onExtraCallback;
    final int onExtraCallbackWithResult;
    final int onNavigationEvent;

    public getFileMapOffset(serializeRaw<T> serializeraw, int i, int i2, Callable<U> callable) {
        super(serializeraw);
        this.onExtraCallbackWithResult = i;
        this.onNavigationEvent = i2;
        this.onExtraCallback = callable;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super U> writequoted) {
        int i = this.onNavigationEvent;
        int i2 = this.onExtraCallbackWithResult;
        if (i == i2) {
            onNavigationEvent onnavigationevent = new onNavigationEvent(writequoted, i2, this.onExtraCallback);
            if (onnavigationevent.onExtraCallbackWithResult()) {
                this.onWarmupCompleted.subscribe(onnavigationevent);
                return;
            }
            return;
        }
        this.onWarmupCompleted.subscribe(new onExtraCallback(writequoted, this.onExtraCallbackWithResult, this.onNavigationEvent, this.onExtraCallback));
    }

    static final class onNavigationEvent<T, U extends Collection<? super T>> implements writeQuoted<T>, deserializeUriNullableCollection {
        int IAuthTabCallback;
        deserializeUriNullableCollection IAuthTabCallbackStub;
        U onExtraCallback;
        final Callable<U> onExtraCallbackWithResult;
        final int onNavigationEvent;
        final writeQuoted<? super U> onWarmupCompleted;

        onNavigationEvent(writeQuoted<? super U> writequoted, int i, Callable<U> callable) {
            this.onWarmupCompleted = writequoted;
            this.onNavigationEvent = i;
            this.onExtraCallbackWithResult = callable;
        }

        boolean onExtraCallbackWithResult() {
            try {
                this.onExtraCallback = (U) floatExponent.onExtraCallbackWithResult(this.onExtraCallbackWithResult.call(), "Empty buffer supplied");
                return true;
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.onExtraCallback = null;
                deserializeUriNullableCollection deserializeurinullablecollection = this.IAuthTabCallbackStub;
                if (deserializeurinullablecollection == null) {
                    deserializeShort.error(th, this.onWarmupCompleted);
                    return false;
                }
                deserializeurinullablecollection.dispose();
                this.onWarmupCompleted.onExtraCallbackWithResult(th);
                return false;
            }
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.IAuthTabCallbackStub, deserializeurinullablecollection)) {
                this.IAuthTabCallbackStub = deserializeurinullablecollection;
                this.onWarmupCompleted.IAuthTabCallback(this);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.IAuthTabCallbackStub.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.IAuthTabCallbackStub.isDisposed();
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            U u = this.onExtraCallback;
            if (u != null) {
                u.add(t);
                int i = this.IAuthTabCallback + 1;
                this.IAuthTabCallback = i;
                if (i >= this.onNavigationEvent) {
                    this.onWarmupCompleted.onExtraCallback(u);
                    this.IAuthTabCallback = 0;
                    onExtraCallbackWithResult();
                }
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            this.onExtraCallback = null;
            this.onWarmupCompleted.onExtraCallbackWithResult(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            U u = this.onExtraCallback;
            if (u != null) {
                this.onExtraCallback = null;
                if (!u.isEmpty()) {
                    this.onWarmupCompleted.onExtraCallback(u);
                }
                this.onWarmupCompleted.onExtraCallback();
            }
        }
    }

    static final class onExtraCallback<T, U extends Collection<? super T>> extends AtomicBoolean implements writeQuoted<T>, deserializeUriNullableCollection {
        private static final long serialVersionUID = -8223395059921494546L;
        final Callable<U> bufferSupplier;
        final ArrayDeque<U> buffers = new ArrayDeque<>();
        final int count;
        final writeQuoted<? super U> downstream;
        long index;
        final int skip;
        deserializeUriNullableCollection upstream;

        onExtraCallback(writeQuoted<? super U> writequoted, int i, int i2, Callable<U> callable) {
            this.downstream = writequoted;
            this.count = i;
            this.skip = i2;
            this.bufferSupplier = callable;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.upstream, deserializeurinullablecollection)) {
                this.upstream = deserializeurinullablecollection;
                this.downstream.IAuthTabCallback(this);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            long j = this.index;
            this.index = 1 + j;
            if (j % this.skip == 0) {
                try {
                    this.buffers.offer((Collection) floatExponent.onExtraCallbackWithResult(this.bufferSupplier.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."));
                } catch (Throwable th) {
                    this.buffers.clear();
                    this.upstream.dispose();
                    this.downstream.onExtraCallbackWithResult(th);
                    return;
                }
            }
            Iterator<U> it = this.buffers.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t);
                if (this.count <= next.size()) {
                    it.remove();
                    this.downstream.onExtraCallback(next);
                }
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            this.buffers.clear();
            this.downstream.onExtraCallbackWithResult(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            while (!this.buffers.isEmpty()) {
                this.downstream.onExtraCallback(this.buffers.poll());
            }
            this.downstream.onExtraCallback();
        }
    }
}
