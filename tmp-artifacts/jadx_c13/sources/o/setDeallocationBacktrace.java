package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setDeallocationBacktrace<T> extends JsonReaderUnknownNumberParsing<T> {
    final deserializeIp<? extends T> onNavigationEvent;

    public setDeallocationBacktrace(deserializeIp<? extends T> deserializeip) {
        this.onNavigationEvent = deserializeip;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.onNavigationEvent.IAuthTabCallback(new IAuthTabCallback(ycxexternalsyntheticlambda0));
    }

    static final class IAuthTabCallback<T> extends addLogs<T> implements deserializeIpNullableCollection<T> {
        private static final long serialVersionUID = 187782011903685568L;
        deserializeUriNullableCollection upstream;

        IAuthTabCallback(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
            super(ycxexternalsyntheticlambda0);
        }

        @Override // o.deserializeIpNullableCollection
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.upstream, deserializeurinullablecollection)) {
                this.upstream = deserializeurinullablecollection;
                this.downstream.onExtraCallback(this);
            }
        }

        @Override // o.deserializeIpNullableCollection
        public void onNavigationEvent(T t) {
            IAuthTabCallback((IAuthTabCallback<T>) t);
        }

        @Override // o.deserializeIpNullableCollection
        public void onExtraCallbackWithResult(Throwable th) {
            this.downstream.onWarmupCompleted(th);
        }

        @Override // o.addLogs, o.ycxExternalSyntheticLambda1
        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }
    }
}
