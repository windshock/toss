package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class mapToXml<T> extends JsonReaderUnknownNumberParsing<T> {
    final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T> IAuthTabCallback;

    public mapToXml(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk) {
        this.IAuthTabCallback = r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.IAuthTabCallback.subscribe(ycxexternalsyntheticlambda0);
    }
}
