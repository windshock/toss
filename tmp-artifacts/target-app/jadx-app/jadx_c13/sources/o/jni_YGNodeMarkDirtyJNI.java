package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeMarkDirtyJNI extends jni_YGNodeNewJNI {
    public static final jni_YGNodeMarkDirtyJNI IAuthTabCallback = new jni_YGNodeMarkDirtyJNI();

    private jni_YGNodeMarkDirtyJNI() {
    }

    @Override // o.jni_YGNodeNewJNI
    public long IAuthTabCallback() {
        return System.nanoTime();
    }
}
