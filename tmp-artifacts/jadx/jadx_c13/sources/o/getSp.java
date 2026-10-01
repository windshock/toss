package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getSp<T, U extends Collection<? super T>> extends setPc<T, U> {
    final int IAuthTabCallback;
    final long asBinder;
    final long asInterface;
    final MapConverter onExtraCallback;
    final boolean onExtraCallbackWithResult;
    final Callable<U> onNavigationEvent;
    final TimeUnit onTransact;

    public getSp(serializeRaw<T> serializeraw, long j, long j2, TimeUnit timeUnit, MapConverter mapConverter, Callable<U> callable, int i, boolean z) {
        super(serializeraw);
        this.asBinder = j;
        this.asInterface = j2;
        this.onTransact = timeUnit;
        this.onExtraCallback = mapConverter;
        this.onNavigationEvent = callable;
        this.IAuthTabCallback = i;
        this.onExtraCallbackWithResult = z;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super U> writequoted) {
        if (this.asBinder == this.asInterface && this.IAuthTabCallback == Integer.MAX_VALUE) {
            this.onWarmupCompleted.subscribe(new onWarmupCompleted(new access26900(writequoted), this.onNavigationEvent, this.asBinder, this.onTransact, this.onExtraCallback));
            return;
        }
        MapConverter.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult();
        if (this.asBinder == this.asInterface) {
            this.onWarmupCompleted.subscribe(new onExtraCallback(new access26900(writequoted), this.onNavigationEvent, this.asBinder, this.onTransact, this.IAuthTabCallback, this.onExtraCallbackWithResult, onnavigationeventOnExtraCallbackWithResult));
        } else {
            this.onWarmupCompleted.subscribe(new onExtraCallbackWithResult(new access26900(writequoted), this.onNavigationEvent, this.asBinder, this.asInterface, this.onTransact, onnavigationeventOnExtraCallbackWithResult));
        }
    }

    static final class onWarmupCompleted<T, U extends Collection<? super T>> extends NumberConverter13<T, U, U> implements Runnable, deserializeUriNullableCollection {
        final MapConverter IAuthTabCallbackStub;
        final TimeUnit IAuthTabCallbackStubProxy;
        deserializeUriNullableCollection IAuthTabCallback_Parcel;
        final long access100;
        final AtomicReference<deserializeUriNullableCollection> asBinder;
        U asInterface;
        final Callable<U> onTransact;

        onWarmupCompleted(writeQuoted<? super U> writequoted, Callable<U> callable, long j, TimeUnit timeUnit, MapConverter mapConverter) {
            super(writequoted, new getAllocationBacktrace());
            this.asBinder = new AtomicReference<>();
            this.onTransact = callable;
            this.access100 = j;
            this.IAuthTabCallbackStubProxy = timeUnit;
            this.IAuthTabCallbackStub = mapConverter;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.IAuthTabCallback_Parcel, deserializeurinullablecollection)) {
                this.IAuthTabCallback_Parcel = deserializeurinullablecollection;
                try {
                    this.asInterface = (U) floatExponent.onExtraCallbackWithResult(this.onTransact.call(), "The buffer supplied is null");
                    this.onExtraCallbackWithResult.IAuthTabCallback(this);
                    if (this.IAuthTabCallback) {
                        return;
                    }
                    MapConverter mapConverter = this.IAuthTabCallbackStub;
                    long j = this.access100;
                    deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = mapConverter.onExtraCallbackWithResult(this, j, j, this.IAuthTabCallbackStubProxy);
                    if (setSupportImageTintList.onNavigationEvent(this.asBinder, (Object) null, deserializeurinullablecollectionOnExtraCallbackWithResult)) {
                        return;
                    }
                    deserializeurinullablecollectionOnExtraCallbackWithResult.dispose();
                } catch (Throwable th) {
                    NumberConverter.onWarmupCompleted(th);
                    dispose();
                    deserializeShort.error(th, this.onExtraCallbackWithResult);
                }
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            synchronized (this) {
                U u = this.asInterface;
                if (u == null) {
                    return;
                }
                u.add(t);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            synchronized (this) {
                this.asInterface = null;
            }
            this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
            deserializeNumber.dispose(this.asBinder);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            U u;
            synchronized (this) {
                u = this.asInterface;
                this.asInterface = null;
            }
            if (u != null) {
                this.onExtraCallback.offer(u);
                this.onNavigationEvent = true;
                if (onExtraCallbackWithResult()) {
                    access26500.onExtraCallback(this.onExtraCallback, this.onExtraCallbackWithResult, false, null, this);
                }
            }
            deserializeNumber.dispose(this.asBinder);
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this.asBinder);
            this.IAuthTabCallback_Parcel.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.asBinder.get() == deserializeNumber.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            U u;
            try {
                U u2 = (U) floatExponent.onExtraCallbackWithResult(this.onTransact.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    u = this.asInterface;
                    if (u != null) {
                        this.asInterface = u2;
                    }
                }
                if (u == null) {
                    deserializeNumber.dispose(this.asBinder);
                } else {
                    onNavigationEvent(u, false, this);
                }
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
                dispose();
            }
        }

        @Override // o.NumberConverter13, o.TombstoneProtosLogBufferOrBuilder
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public void onExtraCallbackWithResult(writeQuoted<? super U> writequoted, U u) {
            this.onExtraCallbackWithResult.onExtraCallback(u);
        }
    }

    static final class onExtraCallbackWithResult<T, U extends Collection<? super T>> extends NumberConverter13<T, U, U> implements Runnable, deserializeUriNullableCollection {
        final long IAuthTabCallbackStub;
        deserializeUriNullableCollection IAuthTabCallbackStubProxy;
        final TimeUnit access100;
        final Callable<U> asBinder;
        final long asInterface;
        final MapConverter.onNavigationEvent getInterfaceDescriptor;
        final List<U> onTransact;

        onExtraCallbackWithResult(writeQuoted<? super U> writequoted, Callable<U> callable, long j, long j2, TimeUnit timeUnit, MapConverter.onNavigationEvent onnavigationevent) {
            super(writequoted, new getAllocationBacktrace());
            this.asBinder = callable;
            this.IAuthTabCallbackStub = j;
            this.asInterface = j2;
            this.access100 = timeUnit;
            this.getInterfaceDescriptor = onnavigationevent;
            this.onTransact = new LinkedList();
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.IAuthTabCallbackStubProxy, deserializeurinullablecollection)) {
                this.IAuthTabCallbackStubProxy = deserializeurinullablecollection;
                try {
                    Collection collection = (Collection) floatExponent.onExtraCallbackWithResult(this.asBinder.call(), "The buffer supplied is null");
                    this.onTransact.add(collection);
                    this.onExtraCallbackWithResult.IAuthTabCallback(this);
                    MapConverter.onNavigationEvent onnavigationevent = this.getInterfaceDescriptor;
                    long j = this.asInterface;
                    onnavigationevent.onExtraCallbackWithResult(this, j, j, this.access100);
                    this.getInterfaceDescriptor.onNavigationEvent(new onNavigationEvent(collection), this.IAuthTabCallbackStub, this.access100);
                } catch (Throwable th) {
                    NumberConverter.onWarmupCompleted(th);
                    deserializeurinullablecollection.dispose();
                    deserializeShort.error(th, this.onExtraCallbackWithResult);
                    this.getInterfaceDescriptor.dispose();
                }
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            synchronized (this) {
                Iterator<U> it = this.onTransact.iterator();
                while (it.hasNext()) {
                    it.next().add(t);
                }
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            this.onNavigationEvent = true;
            IAuthTabCallbackStub();
            this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
            this.getInterfaceDescriptor.dispose();
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.onTransact);
                this.onTransact.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.onExtraCallback.offer((Collection) it.next());
            }
            this.onNavigationEvent = true;
            if (onExtraCallbackWithResult()) {
                access26500.onExtraCallback(this.onExtraCallback, this.onExtraCallbackWithResult, false, this.getInterfaceDescriptor, this);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            if (this.IAuthTabCallback) {
                return;
            }
            this.IAuthTabCallback = true;
            IAuthTabCallbackStub();
            this.IAuthTabCallbackStubProxy.dispose();
            this.getInterfaceDescriptor.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.IAuthTabCallback;
        }

        void IAuthTabCallbackStub() {
            synchronized (this) {
                this.onTransact.clear();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.IAuthTabCallback) {
                return;
            }
            try {
                Collection collection = (Collection) floatExponent.onExtraCallbackWithResult(this.asBinder.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    if (this.IAuthTabCallback) {
                        return;
                    }
                    this.onTransact.add(collection);
                    this.getInterfaceDescriptor.onNavigationEvent(new RunnableC0033onExtraCallbackWithResult(collection), this.IAuthTabCallbackStub, this.access100);
                }
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
                dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.NumberConverter13, o.TombstoneProtosLogBufferOrBuilder
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public void onExtraCallbackWithResult(writeQuoted<? super U> writequoted, U u) {
            writequoted.onExtraCallback(u);
        }

        /* renamed from: o.getSp$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        final class RunnableC0033onExtraCallbackWithResult implements Runnable {
            private final U onNavigationEvent;

            RunnableC0033onExtraCallbackWithResult(U u) {
                this.onNavigationEvent = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (onExtraCallbackWithResult.this) {
                    onExtraCallbackWithResult.this.onTransact.remove(this.onNavigationEvent);
                }
                onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult.this;
                onextracallbackwithresult.onExtraCallback(this.onNavigationEvent, false, onextracallbackwithresult.getInterfaceDescriptor);
            }
        }

        final class onNavigationEvent implements Runnable {
            private final U IAuthTabCallback;

            onNavigationEvent(U u) {
                this.IAuthTabCallback = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (onExtraCallbackWithResult.this) {
                    onExtraCallbackWithResult.this.onTransact.remove(this.IAuthTabCallback);
                }
                onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult.this;
                onextracallbackwithresult.onExtraCallback(this.IAuthTabCallback, false, onextracallbackwithresult.getInterfaceDescriptor);
            }
        }
    }

    static final class onExtraCallback<T, U extends Collection<? super T>> extends NumberConverter13<T, U, U> implements Runnable, deserializeUriNullableCollection {
        final Callable<U> IAuthTabCallbackStub;
        long IAuthTabCallbackStubProxy;
        final TimeUnit IAuthTabCallback_Parcel;
        deserializeUriNullableCollection ICustomTabsCallback;
        final boolean access000;
        final long access100;
        long asBinder;
        U asInterface;
        final MapConverter.onNavigationEvent extraCallback;
        deserializeUriNullableCollection getInterfaceDescriptor;
        final int onTransact;

        onExtraCallback(writeQuoted<? super U> writequoted, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, MapConverter.onNavigationEvent onnavigationevent) {
            super(writequoted, new getAllocationBacktrace());
            this.IAuthTabCallbackStub = callable;
            this.access100 = j;
            this.IAuthTabCallback_Parcel = timeUnit;
            this.onTransact = i;
            this.access000 = z;
            this.extraCallback = onnavigationevent;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.ICustomTabsCallback, deserializeurinullablecollection)) {
                this.ICustomTabsCallback = deserializeurinullablecollection;
                try {
                    this.asInterface = (U) floatExponent.onExtraCallbackWithResult(this.IAuthTabCallbackStub.call(), "The buffer supplied is null");
                    this.onExtraCallbackWithResult.IAuthTabCallback(this);
                    MapConverter.onNavigationEvent onnavigationevent = this.extraCallback;
                    long j = this.access100;
                    this.getInterfaceDescriptor = onnavigationevent.onExtraCallbackWithResult(this, j, j, this.IAuthTabCallback_Parcel);
                } catch (Throwable th) {
                    NumberConverter.onWarmupCompleted(th);
                    deserializeurinullablecollection.dispose();
                    deserializeShort.error(th, this.onExtraCallbackWithResult);
                    this.extraCallback.dispose();
                }
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            synchronized (this) {
                U u = this.asInterface;
                if (u == null) {
                    return;
                }
                u.add(t);
                if (u.size() < this.onTransact) {
                    return;
                }
                this.asInterface = null;
                this.IAuthTabCallbackStubProxy++;
                if (this.access000) {
                    this.getInterfaceDescriptor.dispose();
                }
                onExtraCallback(u, false, this);
                try {
                    U u2 = (U) floatExponent.onExtraCallbackWithResult(this.IAuthTabCallbackStub.call(), "The buffer supplied is null");
                    synchronized (this) {
                        this.asInterface = u2;
                        this.asBinder++;
                    }
                    if (this.access000) {
                        MapConverter.onNavigationEvent onnavigationevent = this.extraCallback;
                        long j = this.access100;
                        this.getInterfaceDescriptor = onnavigationevent.onExtraCallbackWithResult(this, j, j, this.IAuthTabCallback_Parcel);
                    }
                } catch (Throwable th) {
                    NumberConverter.onWarmupCompleted(th);
                    this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
                    dispose();
                }
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            synchronized (this) {
                this.asInterface = null;
            }
            this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
            this.extraCallback.dispose();
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            U u;
            this.extraCallback.dispose();
            synchronized (this) {
                u = this.asInterface;
                this.asInterface = null;
            }
            if (u != null) {
                this.onExtraCallback.offer(u);
                this.onNavigationEvent = true;
                if (onExtraCallbackWithResult()) {
                    access26500.onExtraCallback(this.onExtraCallback, this.onExtraCallbackWithResult, false, this, this);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.NumberConverter13, o.TombstoneProtosLogBufferOrBuilder
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public void onExtraCallbackWithResult(writeQuoted<? super U> writequoted, U u) {
            writequoted.onExtraCallback(u);
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            if (this.IAuthTabCallback) {
                return;
            }
            this.IAuthTabCallback = true;
            this.ICustomTabsCallback.dispose();
            this.extraCallback.dispose();
            synchronized (this) {
                this.asInterface = null;
            }
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.IAuthTabCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u = (U) floatExponent.onExtraCallbackWithResult(this.IAuthTabCallbackStub.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    U u2 = this.asInterface;
                    if (u2 != null && this.IAuthTabCallbackStubProxy == this.asBinder) {
                        this.asInterface = u;
                        onExtraCallback(u2, false, this);
                    }
                }
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                dispose();
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
            }
        }
    }
}
