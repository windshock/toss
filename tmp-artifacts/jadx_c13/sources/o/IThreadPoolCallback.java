package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class IThreadPoolCallback<T> extends RequestCoordinator<T> implements GeckoHubImp1<T> {
    @Override // o.GeckoHubImp1
    public Object IAuthTabCallback(@NotNull access13800<? super T> access13800Var) {
        return a_(access13800Var);
    }

    public IThreadPoolCallback(@NotNull CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    @Override // o.GeckoHubImp1
    public T IAuthTabCallback() {
        return (T) getInterfaceDescriptor();
    }

    @Override // o.GeckoHubImp1
    public jni_YGNodeStyleGetAlignItemsJNI<T> onTransact() {
        jni_YGNodeStyleGetAlignItemsJNI<T> jni_ygnodestylegetalignitemsjni = (jni_YGNodeStyleGetAlignItemsJNI<T>) extraCallback();
        Intrinsics.checkNotNull(jni_ygnodestylegetalignitemsjni, "");
        return jni_ygnodestylegetalignitemsjni;
    }
}
