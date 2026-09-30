package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class access25400<T, R> implements JsonReaderReadObject<T>, parsePositiveInt<R> {
    public int IAuthTabCallbackDefault;
    public boolean IAuthTabCallbackStub;
    public final ycxExternalSyntheticLambda0<? super R> asBinder;
    public ycxExternalSyntheticLambda1 asInterface;
    public parsePositiveInt<T> onTransact;

    protected boolean IAuthTabCallback() {
        return true;
    }

    public access25400(ycxExternalSyntheticLambda0<? super R> ycxexternalsyntheticlambda0) {
        this.asBinder = ycxexternalsyntheticlambda0;
    }

    @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
    public final void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        if (setLogs.validate(this.asInterface, ycxexternalsyntheticlambda1)) {
            this.asInterface = ycxexternalsyntheticlambda1;
            if (ycxexternalsyntheticlambda1 instanceof parsePositiveInt) {
                this.onTransact = (parsePositiveInt) ycxexternalsyntheticlambda1;
            }
            if (IAuthTabCallback()) {
                this.asBinder.onExtraCallback(this);
            }
        }
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(Throwable th) {
        if (this.IAuthTabCallbackStub) {
            RxJavaPlugins.onExtraCallbackWithResult(th);
        } else {
            this.IAuthTabCallbackStub = true;
            this.asBinder.onWarmupCompleted(th);
        }
    }

    public final void onNavigationEvent(Throwable th) {
        NumberConverter.onWarmupCompleted(th);
        this.asInterface.cancel();
        onWarmupCompleted(th);
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onExtraCallbackWithResult() {
        if (this.IAuthTabCallbackStub) {
            return;
        }
        this.IAuthTabCallbackStub = true;
        this.asBinder.onExtraCallbackWithResult();
    }

    public final int onNavigationEvent(int i) {
        parsePositiveInt<T> parsepositiveint = this.onTransact;
        if (parsepositiveint == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = parsepositiveint.requestFusion(i);
        if (iRequestFusion != 0) {
            this.IAuthTabCallbackDefault = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // o.ycxExternalSyntheticLambda1
    public void request(long j) {
        this.asInterface.request(j);
    }

    @Override // o.ycxExternalSyntheticLambda1
    public void cancel() {
        this.asInterface.cancel();
    }

    @Override // o.parsePositiveDecimal
    public boolean isEmpty() {
        return this.onTransact.isEmpty();
    }

    @Override // o.parsePositiveDecimal
    public void clear() {
        this.onTransact.clear();
    }

    @Override // o.parsePositiveDecimal
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
