package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class LazyStaggeredGridDslKtExternalSyntheticLambda4 {
    private static final LazyStaggeredGridIntervalContentExternalSyntheticLambda0 onExtraCallbackWithResult = IAuthTabCallback();
    private static final LazyStaggeredGridIntervalContentExternalSyntheticLambda0 onNavigationEvent = new LazyStaggeredGridDslKtExternalSyntheticLambda3();

    static LazyStaggeredGridIntervalContentExternalSyntheticLambda0 onExtraCallbackWithResult() {
        return onExtraCallbackWithResult;
    }

    static LazyStaggeredGridIntervalContentExternalSyntheticLambda0 onExtraCallback() {
        return onNavigationEvent;
    }

    private static LazyStaggeredGridIntervalContentExternalSyntheticLambda0 IAuthTabCallback() {
        if (DefaultPagerStateExternalSyntheticLambda2.onExtraCallbackWithResult) {
            return null;
        }
        try {
            return (LazyStaggeredGridIntervalContentExternalSyntheticLambda0) Class.forName("androidx.glance.appwidget.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
