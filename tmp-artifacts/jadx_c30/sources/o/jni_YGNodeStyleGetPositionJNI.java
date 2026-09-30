package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class jni_YGNodeStyleGetPositionJNI extends jni_YGNodeStyleGetPaddingJNI {
    private final long IAuthTabCallback;
    private final long onExtraCallback;
    private final int onNavigationEvent;

    @Override // o.jni_YGNodeStyleGetPaddingJNI
    public long IAuthTabCallbackDefault() {
        return this.IAuthTabCallback;
    }

    @Override // o.jni_YGNodeStyleGetPaddingJNI
    public int onNavigationEvent() {
        return this.onNavigationEvent;
    }

    @Override // o.jni_YGNodeStyleGetPaddingJNI
    public long IAuthTabCallbackStub() {
        return this.onExtraCallback;
    }

    public jni_YGNodeStyleGetPositionJNI(long j, int i, long j2) {
        super(null);
        this.IAuthTabCallback = j;
        this.onNavigationEvent = i;
        this.onExtraCallback = j2;
    }
}
