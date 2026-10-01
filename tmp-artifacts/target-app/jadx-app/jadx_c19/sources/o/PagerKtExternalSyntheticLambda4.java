package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class PagerKtExternalSyntheticLambda4 implements LazyStaggeredGridItemProviderKtExternalSyntheticLambda1 {
    private final LazySaveableStateHolderCompanionExternalSyntheticLambda1[] IAuthTabCallback;
    private final LazyStaggeredGridMeasureKtExternalSyntheticLambda1 onExtraCallback;
    private final int[] onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final LazyLayoutPagerKtExternalSyntheticLambda1 onWarmupCompleted;

    @Override // o.LazyStaggeredGridItemProviderKtExternalSyntheticLambda1
    public LazyLayoutPagerKtExternalSyntheticLambda1 onExtraCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.LazyStaggeredGridItemProviderKtExternalSyntheticLambda1
    public boolean onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public int[] onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public LazySaveableStateHolderCompanionExternalSyntheticLambda1[] IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.LazyStaggeredGridItemProviderKtExternalSyntheticLambda1
    public LazyStaggeredGridMeasureKtExternalSyntheticLambda1 onWarmupCompleted() {
        return this.onExtraCallback;
    }
}
