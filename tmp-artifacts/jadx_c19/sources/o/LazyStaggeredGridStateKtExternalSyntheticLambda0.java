package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class LazyStaggeredGridStateKtExternalSyntheticLambda0 {
    private static final LazyStaggeredGridStateExternalSyntheticLambda1 IAuthTabCallback = onWarmupCompleted();
    private static final LazyStaggeredGridStateExternalSyntheticLambda1 onExtraCallback = new LazyStaggeredGridMeasureResultKtExternalSyntheticLambda0();

    static LazyStaggeredGridStateExternalSyntheticLambda1 onNavigationEvent() {
        return IAuthTabCallback;
    }

    static LazyStaggeredGridStateExternalSyntheticLambda1 onExtraCallbackWithResult() {
        return onExtraCallback;
    }

    private static LazyStaggeredGridStateExternalSyntheticLambda1 onWarmupCompleted() {
        if (DefaultPagerStateExternalSyntheticLambda2.onExtraCallbackWithResult) {
            return null;
        }
        try {
            return (LazyStaggeredGridStateExternalSyntheticLambda1) Class.forName("androidx.glance.appwidget.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
