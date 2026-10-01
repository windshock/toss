package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeInsertChildJNI extends jni_YGNodeIsReferenceBaselineJNI {
    public static final jni_YGNodeInsertChildJNI onNavigationEvent = new jni_YGNodeInsertChildJNI();

    private jni_YGNodeInsertChildJNI() {
        super(jni_YGNodeRemoveAllChildrenJNI.onExtraCallbackWithResult, jni_YGNodeRemoveAllChildrenJNI.IAuthTabCallback, jni_YGNodeRemoveAllChildrenJNI.onExtraCallback, jni_YGNodeRemoveAllChildrenJNI.onWarmupCompleted);
    }

    @Override // o.GeckoHubImp
    public GeckoHubImp onWarmupCompleted(int i, @Nullable String str) {
        setShowDividerHorizontal.onNavigationEvent(i);
        if (i >= jni_YGNodeRemoveAllChildrenJNI.onExtraCallbackWithResult) {
            return setShowDividerHorizontal.onExtraCallback(this, str);
        }
        return super.onWarmupCompleted(i, str);
    }

    @Override // o.jni_YGNodeIsReferenceBaselineJNI, o.ComponentModela, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // o.GeckoHubImp
    public String toString() {
        return "Dispatchers.Default";
    }
}
