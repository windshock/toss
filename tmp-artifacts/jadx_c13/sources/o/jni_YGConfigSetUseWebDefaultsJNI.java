package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.IntCompanionObject;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class jni_YGConfigSetUseWebDefaultsJNI<T> extends nLockFile<T> implements ycxExternalSyntheticLambda0<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater onExtraCallbackWithResult = AtomicReferenceFieldUpdater.newUpdater(jni_YGConfigSetUseWebDefaultsJNI.class, Object.class, "_subscription$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater onWarmupCompleted = AtomicIntegerFieldUpdater.newUpdater(jni_YGConfigSetUseWebDefaultsJNI.class, "_requested$volatile");
    private volatile /* synthetic */ int _requested$volatile;
    private volatile /* synthetic */ Object _subscription$volatile;
    private final int onExtraCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public jni_YGConfigSetUseWebDefaultsJNI(int i) {
        super(IntCompanionObject.MAX_VALUE, null, 2, 0 == true ? 1 : 0);
        this.onExtraCallback = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Invalid request size: " + i).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        r2.request(r6.onExtraCallback - r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        return;
     */
    @Override // o.nLockFile
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onActivityLayout() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = onWarmupCompleted;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1 = (ycxExternalSyntheticLambda1) onExtraCallbackWithResult.get(this);
            int i2 = i - 1;
            if (ycxexternalsyntheticlambda1 != null && i2 < 0) {
                if (i == this.onExtraCallback || onWarmupCompleted.compareAndSet(this, i, this.onExtraCallback)) {
                    break;
                }
            } else if (onWarmupCompleted.compareAndSet(this, i, i2)) {
                return;
            }
        }
    }

    @Override // o.nLockFile
    public void ICustomTabsCallback() {
        onWarmupCompleted.incrementAndGet(this);
    }

    @Override // o.nLockFile
    public void extraCallback() {
        ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1 = (ycxExternalSyntheticLambda1) onExtraCallbackWithResult.getAndSet(this, null);
        if (ycxexternalsyntheticlambda1 != null) {
            ycxexternalsyntheticlambda1.cancel();
        }
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onExtraCallback(@NotNull ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        onExtraCallbackWithResult.set(this, ycxexternalsyntheticlambda1);
        while (!IAuthTabCallback()) {
            int i = onWarmupCompleted.get(this);
            if (i >= this.onExtraCallback) {
                return;
            }
            if (onWarmupCompleted.compareAndSet(this, i, this.onExtraCallback)) {
                ycxexternalsyntheticlambda1.request(this.onExtraCallback - i);
                return;
            }
        }
        ycxexternalsyntheticlambda1.cancel();
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(T t) {
        onWarmupCompleted.decrementAndGet(this);
        IAuthTabCallback((jni_YGConfigSetUseWebDefaultsJNI<T>) t);
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onExtraCallbackWithResult() {
        onExtraCallback((Throwable) null);
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(@NotNull Throwable th) {
        onExtraCallback(th);
    }
}
