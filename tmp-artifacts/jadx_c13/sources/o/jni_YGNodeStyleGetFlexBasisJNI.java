package o;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface jni_YGNodeStyleGetFlexBasisJNI {
    Object IAuthTabCallback(@Nullable Object obj, @NotNull access13800<? super Unit> access13800Var);

    boolean IAuthTabCallback(@Nullable Object obj);

    boolean onExtraCallbackWithResult();

    void onWarmupCompleted(@Nullable Object obj);

    public static final class onExtraCallback {
        public static /* synthetic */ boolean onNavigationEvent(jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return jni_ygnodestylegetflexbasisjni.IAuthTabCallback(obj);
        }

        public static /* synthetic */ Object onNavigationEvent(jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni, Object obj, access13800 access13800Var, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return jni_ygnodestylegetflexbasisjni.IAuthTabCallback(obj, access13800Var);
        }

        public static /* synthetic */ void onExtraCallback(jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            jni_ygnodestylegetflexbasisjni.onWarmupCompleted(obj);
        }
    }
}
