package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class access25200<T, R> implements deserializeShortCollection<T>, parsePositiveInt<R> {
    public boolean IAuthTabCallbackDefault;
    public parsePositiveInt<T> IAuthTabCallbackStub;
    public int asBinder;
    public final deserializeShortCollection<? super R> asInterface;
    public ycxExternalSyntheticLambda1 onTransact;

    protected boolean onWarmupCompleted() {
        return true;
    }

    public access25200(deserializeShortCollection<? super R> deserializeshortcollection) {
        this.asInterface = deserializeshortcollection;
    }

    @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
    public final void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        if (setLogs.validate(this.onTransact, ycxexternalsyntheticlambda1)) {
            this.onTransact = ycxexternalsyntheticlambda1;
            if (ycxexternalsyntheticlambda1 instanceof parsePositiveInt) {
                this.IAuthTabCallbackStub = (parsePositiveInt) ycxexternalsyntheticlambda1;
            }
            if (onWarmupCompleted()) {
                this.asInterface.onExtraCallback((ycxExternalSyntheticLambda1) this);
            }
        }
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(Throwable th) {
        if (this.IAuthTabCallbackDefault) {
            RxJavaPlugins.onExtraCallbackWithResult(th);
        } else {
            this.IAuthTabCallbackDefault = true;
            this.asInterface.onWarmupCompleted(th);
        }
    }

    public final void IAuthTabCallback(Throwable th) {
        NumberConverter.onWarmupCompleted(th);
        this.onTransact.cancel();
        onWarmupCompleted(th);
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onExtraCallbackWithResult() {
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        this.IAuthTabCallbackDefault = true;
        this.asInterface.onExtraCallbackWithResult();
    }

    public final int onNavigationEvent(int i) {
        parsePositiveInt<T> parsepositiveint = this.IAuthTabCallbackStub;
        if (parsepositiveint == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = parsepositiveint.requestFusion(i);
        if (iRequestFusion != 0) {
            this.asBinder = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // o.ycxExternalSyntheticLambda1
    public void request(long j) {
        this.onTransact.request(j);
    }

    @Override // o.ycxExternalSyntheticLambda1
    public void cancel() {
        this.onTransact.cancel();
    }

    @Override // o.parsePositiveDecimal
    public boolean isEmpty() {
        return this.IAuthTabCallbackStub.isEmpty();
    }

    @Override // o.parsePositiveDecimal
    public void clear() {
        this.IAuthTabCallbackStub.clear();
    }

    @Override // o.parsePositiveDecimal
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
