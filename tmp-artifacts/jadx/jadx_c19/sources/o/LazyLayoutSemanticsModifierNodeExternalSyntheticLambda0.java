package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class LazyLayoutSemanticsModifierNodeExternalSyntheticLambda0 {
    private static final LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4<?> IAuthTabCallback = new LazyLayoutSemanticsModifierNodeExternalSyntheticLambda1();
    private static final LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4<?> onWarmupCompleted = onExtraCallbackWithResult();

    private static LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4<?> onExtraCallbackWithResult() {
        if (DefaultPagerStateExternalSyntheticLambda2.onExtraCallbackWithResult) {
            return null;
        }
        try {
            return (LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4) Class.forName("androidx.glance.appwidget.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4<?> IAuthTabCallback() {
        return IAuthTabCallback;
    }

    static LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4<?> onNavigationEvent() {
        LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4<?> lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4 = onWarmupCompleted;
        if (lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4 != null) {
            return lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
