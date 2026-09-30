package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getChannelVersion<T> extends setFullPackage implements pauseMyRequest<T> {
    @Override // o.setFullPackage
    public boolean cp_() {
        return true;
    }

    public getChannelVersion(@Nullable getPackageType getpackagetype) {
        super(true);
        onExtraCallbackWithResult(getpackagetype);
    }

    @Override // o.GeckoHubImp1
    public T IAuthTabCallback() {
        return (T) getInterfaceDescriptor();
    }

    @Override // o.GeckoHubImp1
    public Object IAuthTabCallback(@NotNull access13800<? super T> access13800Var) {
        return a_(access13800Var);
    }

    @Override // o.GeckoHubImp1
    public jni_YGNodeStyleGetAlignItemsJNI<T> onTransact() {
        jni_YGNodeStyleGetAlignItemsJNI<T> jni_ygnodestylegetalignitemsjni = (jni_YGNodeStyleGetAlignItemsJNI<T>) extraCallback();
        Intrinsics.checkNotNull(jni_ygnodestylegetalignitemsjni, "");
        return jni_ygnodestylegetalignitemsjni;
    }

    @Override // o.pauseMyRequest
    public boolean IAuthTabCallback(T t) {
        return IAuthTabCallbackStub(t);
    }

    @Override // o.pauseMyRequest
    public boolean onExtraCallback(@NotNull Throwable th) {
        return IAuthTabCallbackStub(new ILoader(th, false, 2, null));
    }
}
