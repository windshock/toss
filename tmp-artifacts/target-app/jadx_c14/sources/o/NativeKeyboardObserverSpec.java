package o;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface NativeKeyboardObserverSpec {
    String onWarmupCompleted();

    default long IAuthTabCallback() {
        int i = 2 % 2;
        return onWarmupCompleted().hashCode();
    }
}
