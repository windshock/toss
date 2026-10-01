package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeStyleGetFlexGrowJNI {
    private static final djExternalSyntheticApiModelOutline0 IAuthTabCallback = new djExternalSyntheticApiModelOutline0("NO_OWNER");
    private static final djExternalSyntheticApiModelOutline0 onExtraCallbackWithResult = new djExternalSyntheticApiModelOutline0("ALREADY_LOCKED_BY_OWNER");

    public static /* synthetic */ jni_YGNodeStyleGetFlexBasisJNI IAuthTabCallback(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return onNavigationEvent(z);
    }

    public static final jni_YGNodeStyleGetFlexBasisJNI onNavigationEvent(boolean z) {
        return new jni_YGNodeStyleGetFlexJNI(z);
    }
}
