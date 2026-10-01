package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class n5ExternalSyntheticLambda0 implements o2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final n5ExternalSyntheticLambda0 onNavigationEvent = new n5ExternalSyntheticLambda0();
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallback + 85;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private n5ExternalSyntheticLambda0() {
    }

    @Override // o.o2
    public Long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Long.valueOf(DERSet.onExtraCallback.getSavedStateRegistryControllerannotations());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Long lValueOf = Long.valueOf(DERSet.onExtraCallback.getSavedStateRegistryControllerannotations());
        int i3 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return lValueOf;
    }
}
