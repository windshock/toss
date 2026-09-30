package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public enum access25900 implements parsePositiveInt<Object> {
    INSTANCE;

    @Override // o.ycxExternalSyntheticLambda1
    public void cancel() {
    }

    @Override // o.parsePositiveDecimal
    public void clear() {
    }

    @Override // o.parsePositiveDecimal
    public boolean isEmpty() {
        return true;
    }

    @Override // o.parsePositiveDecimal
    public Object poll() {
        return null;
    }

    @Override // o.parseFloatGeneric
    public int requestFusion(int i) {
        return i & 2;
    }

    @Override // o.ycxExternalSyntheticLambda1
    public void request(long j) {
        setLogs.validate(j);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    public static void error(Throwable th, ycxExternalSyntheticLambda0<?> ycxexternalsyntheticlambda0) {
        ycxexternalsyntheticlambda0.onExtraCallback(INSTANCE);
        ycxexternalsyntheticlambda0.onWarmupCompleted(th);
    }

    public static void complete(ycxExternalSyntheticLambda0<?> ycxexternalsyntheticlambda0) {
        ycxexternalsyntheticlambda0.onExtraCallback(INSTANCE);
        ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
    }

    @Override // o.parsePositiveDecimal
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
