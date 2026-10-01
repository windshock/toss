package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class LazyStaggeredGridItemProviderKtExternalSyntheticLambda0 {
    private static final LazyStaggeredGridIntervalContentExternalSyntheticLambda3 IAuthTabCallback = onNavigationEvent();
    private static final LazyStaggeredGridIntervalContentExternalSyntheticLambda3 onExtraCallbackWithResult = new LazyStaggeredGridIntervalContentExternalSyntheticLambda2();

    static LazyStaggeredGridIntervalContentExternalSyntheticLambda3 onWarmupCompleted() {
        return IAuthTabCallback;
    }

    static LazyStaggeredGridIntervalContentExternalSyntheticLambda3 onExtraCallbackWithResult() {
        return onExtraCallbackWithResult;
    }

    private static LazyStaggeredGridIntervalContentExternalSyntheticLambda3 onNavigationEvent() {
        if (DefaultPagerStateExternalSyntheticLambda2.onExtraCallbackWithResult) {
            return null;
        }
        try {
            return (LazyStaggeredGridIntervalContentExternalSyntheticLambda3) Class.forName("androidx.glance.appwidget.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
