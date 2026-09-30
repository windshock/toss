package o;

import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class getFunctionName$IAuthTabCallback<T, U extends Collection<? super T>, B> extends NumberConverter13<T, U, U> implements deserializeUriNullableCollection {
    U IAuthTabCallbackStub;
    deserializeUriNullableCollection access100;
    final Callable<U> asBinder;
    deserializeUriNullableCollection asInterface;
    final serializeRaw<B> onTransact;

    public /* bridge */ /* synthetic */ void onExtraCallbackWithResult(writeQuoted writequoted, Object obj) {
        onExtraCallbackWithResult((writeQuoted<? super writeQuoted>) writequoted, (writeQuoted) obj);
    }

    getFunctionName$IAuthTabCallback(writeQuoted<? super U> writequoted, Callable<U> callable, serializeRaw<B> serializeraw) {
        super(writequoted, new getAllocationBacktrace());
        this.asBinder = callable;
        this.onTransact = serializeraw;
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        if (deserializeNumber.validate(this.access100, deserializeurinullablecollection)) {
            this.access100 = deserializeurinullablecollection;
            try {
                this.IAuthTabCallbackStub = (U) floatExponent.onExtraCallbackWithResult(this.asBinder.call(), "The buffer supplied is null");
                access26600<B> access26600Var = new access26600<B>(this) { // from class: o.getFunctionName$onExtraCallbackWithResult
                    final getFunctionName$IAuthTabCallback<T, U, B> onNavigationEvent;

                    {
                        this.onNavigationEvent = this;
                    }

                    public void onExtraCallback(B b) {
                        this.onNavigationEvent.asBinder();
                    }

                    public void onExtraCallbackWithResult(Throwable th) {
                        this.onNavigationEvent.onExtraCallbackWithResult(th);
                    }

                    public void onExtraCallback() {
                        this.onNavigationEvent.onExtraCallback();
                    }
                };
                this.asInterface = access26600Var;
                ((NumberConverter13) this).onExtraCallbackWithResult.IAuthTabCallback(this);
                if (((NumberConverter13) this).IAuthTabCallback) {
                    return;
                }
                this.onTransact.subscribe(access26600Var);
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                ((NumberConverter13) this).IAuthTabCallback = true;
                deserializeurinullablecollection.dispose();
                deserializeShort.error(th, ((NumberConverter13) this).onExtraCallbackWithResult);
            }
        }
    }

    public void onExtraCallback(T t) {
        synchronized (this) {
            U u = this.IAuthTabCallbackStub;
            if (u == null) {
                return;
            }
            u.add(t);
        }
    }

    public void onExtraCallbackWithResult(Throwable th) {
        dispose();
        ((NumberConverter13) this).onExtraCallbackWithResult.onExtraCallbackWithResult(th);
    }

    public void onExtraCallback() {
        synchronized (this) {
            U u = this.IAuthTabCallbackStub;
            if (u == null) {
                return;
            }
            this.IAuthTabCallbackStub = null;
            ((NumberConverter13) this).onExtraCallback.offer(u);
            ((NumberConverter13) this).onNavigationEvent = true;
            if (onExtraCallbackWithResult()) {
                access26500.onExtraCallback(((NumberConverter13) this).onExtraCallback, ((NumberConverter13) this).onExtraCallbackWithResult, false, this, this);
            }
        }
    }

    public void dispose() {
        if (((NumberConverter13) this).IAuthTabCallback) {
            return;
        }
        ((NumberConverter13) this).IAuthTabCallback = true;
        this.asInterface.dispose();
        this.access100.dispose();
        if (onExtraCallbackWithResult()) {
            ((NumberConverter13) this).onExtraCallback.clear();
        }
    }

    public boolean isDisposed() {
        return ((NumberConverter13) this).IAuthTabCallback;
    }

    void asBinder() {
        try {
            U u = (U) floatExponent.onExtraCallbackWithResult(this.asBinder.call(), "The buffer supplied is null");
            synchronized (this) {
                U u2 = this.IAuthTabCallbackStub;
                if (u2 == null) {
                    return;
                }
                this.IAuthTabCallbackStub = u;
                onNavigationEvent(u2, false, this);
            }
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            dispose();
            ((NumberConverter13) this).onExtraCallbackWithResult.onExtraCallbackWithResult(th);
        }
    }

    public void onExtraCallbackWithResult(writeQuoted<? super U> writequoted, U u) {
        ((NumberConverter13) this).onExtraCallbackWithResult.onExtraCallback(u);
    }
}
