package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access27500<T> extends access27300<T> {
    boolean IAuthTabCallback;
    final getAllocationBacktraceOrBuilder<T> IAuthTabCallbackDefault;
    final AtomicLong IAuthTabCallbackStub;
    final addAllLogs<T> IAuthTabCallback_Parcel;
    Throwable asBinder;
    final AtomicReference<Runnable> asInterface;
    final AtomicReference<ycxExternalSyntheticLambda0<? super T>> onExtraCallback;
    final boolean onExtraCallbackWithResult;
    volatile boolean onNavigationEvent;
    final AtomicBoolean onTransact;
    volatile boolean onWarmupCompleted;

    public static <T> access27500<T> onExtraCallbackWithResult(int i) {
        return new access27500<>(i);
    }

    access27500(int i) {
        this(i, null, true);
    }

    access27500(int i, Runnable runnable, boolean z) {
        this.IAuthTabCallbackDefault = new getAllocationBacktraceOrBuilder<>(floatExponent.onExtraCallbackWithResult(i, "capacityHint"));
        this.asInterface = new AtomicReference<>(runnable);
        this.onExtraCallbackWithResult = z;
        this.onExtraCallback = new AtomicReference<>();
        this.onTransact = new AtomicBoolean();
        this.IAuthTabCallback_Parcel = new onNavigationEvent();
        this.IAuthTabCallbackStub = new AtomicLong();
    }

    void ICustomTabsCallback() {
        Runnable andSet = this.asInterface.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    void onExtraCallback(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        long j;
        getAllocationBacktraceOrBuilder<T> getallocationbacktraceorbuilder = this.IAuthTabCallbackDefault;
        boolean z = true;
        boolean z2 = !this.onExtraCallbackWithResult;
        int iAddAndGet = 1;
        while (true) {
            long j2 = this.IAuthTabCallbackStub.get();
            long j3 = 0;
            while (true) {
                if (j2 == j3) {
                    j = j3;
                    break;
                }
                boolean z3 = this.onWarmupCompleted;
                T tPoll = getallocationbacktraceorbuilder.poll();
                boolean z4 = tPoll == null ? z : false;
                j = j3;
                if (onNavigationEvent(z2, z3, z4, ycxexternalsyntheticlambda0, getallocationbacktraceorbuilder)) {
                    return;
                }
                if (z4) {
                    break;
                }
                ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) tPoll);
                j3 = 1 + j;
                z = true;
            }
            if (j2 == j3 && onNavigationEvent(z2, this.onWarmupCompleted, getallocationbacktraceorbuilder.isEmpty(), ycxexternalsyntheticlambda0, getallocationbacktraceorbuilder)) {
                return;
            }
            if (j != 0 && j2 != LongCompanionObject.MAX_VALUE) {
                this.IAuthTabCallbackStub.addAndGet(-j);
            }
            iAddAndGet = this.IAuthTabCallback_Parcel.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                z = true;
            }
        }
    }

    void onExtraCallbackWithResult(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        getAllocationBacktraceOrBuilder<T> getallocationbacktraceorbuilder = this.IAuthTabCallbackDefault;
        boolean z = this.onExtraCallbackWithResult;
        int iAddAndGet = 1;
        while (!this.onNavigationEvent) {
            boolean z2 = this.onWarmupCompleted;
            if (!z && z2 && this.asBinder != null) {
                getallocationbacktraceorbuilder.clear();
                this.onExtraCallback.lazySet(null);
                ycxexternalsyntheticlambda0.onWarmupCompleted(this.asBinder);
                return;
            }
            ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) null);
            if (z2) {
                this.onExtraCallback.lazySet(null);
                Throwable th = this.asBinder;
                if (th != null) {
                    ycxexternalsyntheticlambda0.onWarmupCompleted(th);
                    return;
                } else {
                    ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                    return;
                }
            }
            iAddAndGet = this.IAuthTabCallback_Parcel.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        this.onExtraCallback.lazySet(null);
    }

    void readTypedObject() {
        if (this.IAuthTabCallback_Parcel.getAndIncrement() == 0) {
            ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0 = this.onExtraCallback.get();
            int iAddAndGet = 1;
            while (ycxexternalsyntheticlambda0 == null) {
                iAddAndGet = this.IAuthTabCallback_Parcel.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    ycxexternalsyntheticlambda0 = this.onExtraCallback.get();
                }
            }
            if (this.IAuthTabCallback) {
                onExtraCallbackWithResult(ycxexternalsyntheticlambda0);
            } else {
                onExtraCallback((ycxExternalSyntheticLambda0) ycxexternalsyntheticlambda0);
            }
        }
    }

    boolean onNavigationEvent(boolean z, boolean z2, boolean z3, ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, getAllocationBacktraceOrBuilder<T> getallocationbacktraceorbuilder) {
        if (this.onNavigationEvent) {
            getallocationbacktraceorbuilder.clear();
            this.onExtraCallback.lazySet(null);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (z && this.asBinder != null) {
            getallocationbacktraceorbuilder.clear();
            this.onExtraCallback.lazySet(null);
            ycxexternalsyntheticlambda0.onWarmupCompleted(this.asBinder);
            return true;
        }
        if (!z3) {
            return false;
        }
        Throwable th = this.asBinder;
        this.onExtraCallback.lazySet(null);
        if (th != null) {
            ycxexternalsyntheticlambda0.onWarmupCompleted(th);
        } else {
            ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
        }
        return true;
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        if (this.onWarmupCompleted || this.onNavigationEvent) {
            ycxexternalsyntheticlambda1.cancel();
        } else {
            ycxexternalsyntheticlambda1.request(LongCompanionObject.MAX_VALUE);
        }
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(T t) {
        floatExponent.onExtraCallbackWithResult((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.onWarmupCompleted || this.onNavigationEvent) {
            return;
        }
        this.IAuthTabCallbackDefault.offer(t);
        readTypedObject();
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(Throwable th) {
        floatExponent.onExtraCallbackWithResult(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.onWarmupCompleted || this.onNavigationEvent) {
            RxJavaPlugins.onExtraCallbackWithResult(th);
            return;
        }
        this.asBinder = th;
        this.onWarmupCompleted = true;
        ICustomTabsCallback();
        readTypedObject();
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onExtraCallbackWithResult() {
        if (this.onWarmupCompleted || this.onNavigationEvent) {
            return;
        }
        this.onWarmupCompleted = true;
        ICustomTabsCallback();
        readTypedObject();
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        if (!this.onTransact.get() && this.onTransact.compareAndSet(false, true)) {
            ycxexternalsyntheticlambda0.onExtraCallback(this.IAuthTabCallback_Parcel);
            this.onExtraCallback.set(ycxexternalsyntheticlambda0);
            if (this.onNavigationEvent) {
                this.onExtraCallback.lazySet(null);
                return;
            } else {
                readTypedObject();
                return;
            }
        }
        access25900.error(new IllegalStateException("This processor allows only a single Subscriber"), ycxexternalsyntheticlambda0);
    }

    final class onNavigationEvent extends addAllLogs<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        onNavigationEvent() {
        }

        @Override // o.parsePositiveDecimal
        public T poll() {
            return access27500.this.IAuthTabCallbackDefault.poll();
        }

        @Override // o.parsePositiveDecimal
        public boolean isEmpty() {
            return access27500.this.IAuthTabCallbackDefault.isEmpty();
        }

        @Override // o.parsePositiveDecimal
        public void clear() {
            access27500.this.IAuthTabCallbackDefault.clear();
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            access27500.this.IAuthTabCallback = true;
            return 2;
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            if (setLogs.validate(j)) {
                TombstoneProtosLogBufferBuilder.onWarmupCompleted(access27500.this.IAuthTabCallbackStub, j);
                access27500.this.readTypedObject();
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            if (access27500.this.onNavigationEvent) {
                return;
            }
            access27500.this.onNavigationEvent = true;
            access27500.this.ICustomTabsCallback();
            access27500.this.onExtraCallback.lazySet(null);
            if (access27500.this.IAuthTabCallback_Parcel.getAndIncrement() == 0) {
                access27500.this.onExtraCallback.lazySet(null);
                access27500 access27500Var = access27500.this;
                if (access27500Var.IAuthTabCallback) {
                    return;
                }
                access27500Var.IAuthTabCallbackDefault.clear();
            }
        }
    }
}
