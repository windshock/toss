package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class LazySaveableStateHolderCompanionExternalSyntheticLambda0 implements LazyStaggeredGridMeasureKtExternalSyntheticLambda0 {
    private static final LazySaveableStateHolderCompanionExternalSyntheticLambda0 onWarmupCompleted = new LazySaveableStateHolderCompanionExternalSyntheticLambda0();

    private LazySaveableStateHolderCompanionExternalSyntheticLambda0() {
    }

    public static LazySaveableStateHolderCompanionExternalSyntheticLambda0 onWarmupCompleted() {
        return onWarmupCompleted;
    }

    @Override // o.LazyStaggeredGridMeasureKtExternalSyntheticLambda0
    public boolean IAuthTabCallback(Class<?> cls) {
        return PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.class.isAssignableFrom(cls);
    }

    @Override // o.LazyStaggeredGridMeasureKtExternalSyntheticLambda0
    public LazyStaggeredGridItemProviderKtExternalSyntheticLambda1 onExtraCallbackWithResult(Class<?> cls) {
        if (!PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (LazyStaggeredGridItemProviderKtExternalSyntheticLambda1) PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onExtraCallback(cls.asSubclass(PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.class)).IAuthTabCallbackDefault();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }
}
