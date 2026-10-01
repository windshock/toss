package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.internal.Removed;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class jw1 {
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater onExtraCallback = AtomicReferenceFieldUpdater.newUpdater(jw1.class, Object.class, "_next$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater onWarmupCompleted = AtomicReferenceFieldUpdater.newUpdater(jw1.class, Object.class, "_prev$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater onExtraCallbackWithResult = AtomicReferenceFieldUpdater.newUpdater(jw1.class, Object.class, "_removedRef$volatile");

    private final Removed access000() {
        Removed removed = (Removed) onExtraCallbackWithResult.get(this);
        if (removed != null) {
            return removed;
        }
        Removed removed2 = new Removed(this);
        onExtraCallbackWithResult.set(this, removed2);
        return removed2;
    }

    public boolean ch_() {
        return IAuthTabCallbackStub() instanceof Removed;
    }

    public final Object IAuthTabCallbackStub() {
        return onExtraCallback.get(this);
    }

    public final jw1 asBinder() {
        jw1 jw1Var;
        Object objIAuthTabCallbackStub = IAuthTabCallbackStub();
        Removed removed = objIAuthTabCallbackStub instanceof Removed ? (Removed) objIAuthTabCallbackStub : null;
        if (removed != null && (jw1Var = removed.onExtraCallback) != null) {
            return jw1Var;
        }
        Intrinsics.checkNotNull(objIAuthTabCallbackStub, "");
        return (jw1) objIAuthTabCallbackStub;
    }

    public final jw1 onTransact() {
        jw1 jw1VarOnExtraCallbackWithResult = onExtraCallbackWithResult();
        return jw1VarOnExtraCallbackWithResult == null ? onExtraCallbackWithResult((jw1) onWarmupCompleted.get(this)) : jw1VarOnExtraCallbackWithResult;
    }

    private final jw1 onExtraCallbackWithResult(jw1 jw1Var) {
        while (jw1Var.ch_()) {
            jw1Var = (jw1) onWarmupCompleted.get(jw1Var);
        }
        return jw1Var;
    }

    public final boolean onWarmupCompleted(@NotNull jw1 jw1Var) {
        onWarmupCompleted.set(jw1Var, this);
        onExtraCallback.set(jw1Var, this);
        while (IAuthTabCallbackStub() == this) {
            if (RequestBuilder.onWarmupCompleted(onExtraCallback, this, this, jw1Var)) {
                jw1Var.onExtraCallback(this);
                return true;
            }
        }
        return false;
    }

    public final boolean IAuthTabCallback(@NotNull jw1 jw1Var, int i) {
        jw1 jw1VarOnTransact;
        do {
            jw1VarOnTransact = onTransact();
            if (jw1VarOnTransact instanceof ludycx1) {
                return (((ludycx1) jw1VarOnTransact).onWarmupCompleted & i) == 0 && jw1VarOnTransact.IAuthTabCallback(jw1Var, i);
            }
        } while (!jw1VarOnTransact.onExtraCallbackWithResult(jw1Var, this));
        return true;
    }

    public final void IAuthTabCallback(int i) {
        IAuthTabCallback(new ludycx1(i), i);
    }

    public final boolean onExtraCallbackWithResult(@NotNull jw1 jw1Var, @NotNull jw1 jw1Var2) {
        onWarmupCompleted.set(jw1Var, this);
        onExtraCallback.set(jw1Var, jw1Var2);
        if (!RequestBuilder.onWarmupCompleted(onExtraCallback, this, jw1Var2, jw1Var)) {
            return false;
        }
        jw1Var.onExtraCallback(jw1Var2);
        return true;
    }

    public boolean ci_() {
        return IAuthTabCallbackDefault() == null;
    }

    public final jw1 IAuthTabCallbackDefault() {
        Object objIAuthTabCallbackStub;
        jw1 jw1Var;
        do {
            objIAuthTabCallbackStub = IAuthTabCallbackStub();
            if (objIAuthTabCallbackStub instanceof Removed) {
                return ((Removed) objIAuthTabCallbackStub).onExtraCallback;
            }
            if (objIAuthTabCallbackStub == this) {
                return (jw1) objIAuthTabCallbackStub;
            }
            Intrinsics.checkNotNull(objIAuthTabCallbackStub, "");
            jw1Var = (jw1) objIAuthTabCallbackStub;
        } while (!RequestBuilder.onWarmupCompleted(onExtraCallback, this, objIAuthTabCallbackStub, jw1Var.access000()));
        jw1Var.onExtraCallbackWithResult();
        return null;
    }

    private final void onExtraCallback(jw1 jw1Var) {
        jw1 jw1Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onWarmupCompleted;
        do {
            jw1Var2 = (jw1) atomicReferenceFieldUpdater.get(jw1Var);
            if (IAuthTabCallbackStub() != jw1Var) {
                return;
            }
        } while (!RequestBuilder.onWarmupCompleted(onWarmupCompleted, jw1Var, jw1Var2, this));
        if (ch_()) {
            jw1Var.onExtraCallbackWithResult();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (o.RequestBuilder.onWarmupCompleted(o.jw1.onExtraCallback, r3, r1, ((kotlinx.coroutines.internal.Removed) r4).onExtraCallback) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final jw1 onExtraCallbackWithResult() {
        while (true) {
            jw1 jw1Var = (jw1) onWarmupCompleted.get(this);
            jw1 jw1Var2 = jw1Var;
            while (true) {
                jw1 jw1Var3 = null;
                while (true) {
                    Object obj = onExtraCallback.get(jw1Var2);
                    if (obj == this) {
                        if (jw1Var == jw1Var2 || RequestBuilder.onWarmupCompleted(onWarmupCompleted, this, jw1Var, jw1Var2)) {
                            break;
                        }
                    } else {
                        if (ch_()) {
                            return null;
                        }
                        if (!(obj instanceof Removed)) {
                            Intrinsics.checkNotNull(obj, "");
                            jw1Var3 = jw1Var2;
                            jw1Var2 = (jw1) obj;
                        } else {
                            if (jw1Var3 != null) {
                                break;
                            }
                            jw1Var2 = (jw1) onWarmupCompleted.get(jw1Var2);
                        }
                    }
                }
                jw1Var2 = jw1Var3;
            }
        }
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: o.jw1.onExtraCallbackWithResult
            @Override // kotlin.jvm.internal.PropertyReference0Impl, o.addAllMemoryMappings
            public Object get() {
                return getResCount.IAuthTabCallback(this.receiver);
            }
        } + '@' + getResCount.onExtraCallbackWithResult(this);
    }
}
