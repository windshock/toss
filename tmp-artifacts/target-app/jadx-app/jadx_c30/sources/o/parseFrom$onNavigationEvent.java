package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class parseFrom$onNavigationEvent<T> extends setNameBytes implements JsonReaderReadObject<T> {
    private static final long serialVersionUID = 4063763155303814625L;
    final boolean allowFatal;
    boolean done;
    final ycxExternalSyntheticLambda0<? super T> downstream;
    final deserializeIntNullableCollection<? super Throwable, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>> nextSupplier;
    boolean once;
    long produced;

    parseFrom$onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, deserializeIntNullableCollection<? super Throwable, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>> deserializeintnullablecollection, boolean z) {
        super(false);
        this.downstream = ycxexternalsyntheticlambda0;
        this.nextSupplier = deserializeintnullablecollection;
        this.allowFatal = z;
    }

    public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        onWarmupCompleted(ycxexternalsyntheticlambda1);
    }

    public void onWarmupCompleted(T t) {
        if (this.done) {
            return;
        }
        if (!this.once) {
            this.produced++;
        }
        this.downstream.onWarmupCompleted(t);
    }

    public void onWarmupCompleted(Throwable th) {
        if (this.once) {
            if (this.done) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
                return;
            } else {
                this.downstream.onWarmupCompleted(th);
                return;
            }
        }
        this.once = true;
        if (this.allowFatal && !(th instanceof Exception)) {
            this.downstream.onWarmupCompleted(th);
            return;
        }
        try {
            r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) floatExponent.onExtraCallbackWithResult(this.nextSupplier.apply(th), "The nextSupplier returned a null Publisher");
            long j = this.produced;
            if (j != 0) {
                onWarmupCompleted(j);
            }
            r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk.subscribe(this);
        } catch (Throwable th2) {
            NumberConverter.onWarmupCompleted(th2);
            this.downstream.onWarmupCompleted(new deserializeDecimal(new Throwable[]{th, th2}));
        }
    }

    public void onExtraCallbackWithResult() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.once = true;
        this.downstream.onExtraCallbackWithResult();
    }
}
