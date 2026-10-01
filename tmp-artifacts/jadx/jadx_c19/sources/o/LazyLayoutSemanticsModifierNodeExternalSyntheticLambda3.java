package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class LazyLayoutSemanticsModifierNodeExternalSyntheticLambda3 {
    static final Class<?> onExtraCallback = onNavigationEvent();

    LazyLayoutSemanticsModifierNodeExternalSyntheticLambda3() {
    }

    static Class<?> onNavigationEvent() {
        try {
            return Class.forName("androidx.glance.appwidget.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 onExtraCallbackWithResult() {
        LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2IAuthTabCallback = IAuthTabCallback("getEmptyRegistry");
        return lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2IAuthTabCallback != null ? lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2IAuthTabCallback : LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2.onNavigationEvent;
    }

    private static final LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 IAuthTabCallback(String str) {
        Class<?> cls = onExtraCallback;
        if (cls == null) {
            return null;
        }
        try {
            return (LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }
}
