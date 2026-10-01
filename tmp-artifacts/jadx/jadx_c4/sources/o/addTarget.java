package o;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addTarget<T> implements captureStartValues<T> {
    private createAnimators<T> onExtraCallback;

    public T get() {
        createAnimators<T> createanimators = this.onExtraCallback;
        if (createanimators == null) {
            throw new IllegalStateException();
        }
        return (T) createanimators.get();
    }

    public static <T> void IAuthTabCallback(createAnimators<T> createanimators, createAnimators<T> createanimators2) {
        onNavigationEvent((addTarget) createanimators, createanimators2);
    }

    private static <T> void onNavigationEvent(addTarget<T> addtarget, createAnimators<T> createanimators) {
        if (((addTarget) addtarget).onExtraCallback != null) {
            throw new IllegalStateException();
        }
        ((addTarget) addtarget).onExtraCallback = createanimators;
    }
}
