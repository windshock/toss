package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access27200<T> extends access27300<T> {
    static final onWarmupCompleted[] IAuthTabCallback = new onWarmupCompleted[0];
    static final onWarmupCompleted[] onWarmupCompleted = new onWarmupCompleted[0];
    final AtomicReference<onWarmupCompleted<T>[]> onExtraCallbackWithResult = new AtomicReference<>(onWarmupCompleted);
    Throwable onNavigationEvent;

    public static <T> access27200<T> readTypedObject() {
        return new access27200<>();
    }

    access27200() {
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        onWarmupCompleted<T> onwarmupcompleted = new onWarmupCompleted<>(ycxexternalsyntheticlambda0, this);
        ycxexternalsyntheticlambda0.onExtraCallback(onwarmupcompleted);
        if (onNavigationEvent(onwarmupcompleted)) {
            if (onwarmupcompleted.IAuthTabCallback()) {
                onWarmupCompleted((onWarmupCompleted) onwarmupcompleted);
            }
        } else {
            Throwable th = this.onNavigationEvent;
            if (th != null) {
                ycxexternalsyntheticlambda0.onWarmupCompleted(th);
            } else {
                ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
            }
        }
    }

    boolean onNavigationEvent(onWarmupCompleted<T> onwarmupcompleted) {
        onWarmupCompleted<T>[] onwarmupcompletedArr;
        onWarmupCompleted[] onwarmupcompletedArr2;
        do {
            onwarmupcompletedArr = this.onExtraCallbackWithResult.get();
            if (onwarmupcompletedArr == IAuthTabCallback) {
                return false;
            }
            int length = onwarmupcompletedArr.length;
            onwarmupcompletedArr2 = new onWarmupCompleted[length + 1];
            System.arraycopy(onwarmupcompletedArr, 0, onwarmupcompletedArr2, 0, length);
            onwarmupcompletedArr2[length] = onwarmupcompleted;
        } while (!setSupportImageTintList.onNavigationEvent(this.onExtraCallbackWithResult, onwarmupcompletedArr, onwarmupcompletedArr2));
        return true;
    }

    void onWarmupCompleted(onWarmupCompleted<T> onwarmupcompleted) {
        onWarmupCompleted<T>[] onwarmupcompletedArr;
        onWarmupCompleted[] onwarmupcompletedArr2;
        do {
            onwarmupcompletedArr = this.onExtraCallbackWithResult.get();
            if (onwarmupcompletedArr == IAuthTabCallback || onwarmupcompletedArr == onWarmupCompleted) {
                return;
            }
            int length = onwarmupcompletedArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (onwarmupcompletedArr[i] == onwarmupcompleted) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                onwarmupcompletedArr2 = onWarmupCompleted;
            } else {
                onWarmupCompleted[] onwarmupcompletedArr3 = new onWarmupCompleted[length - 1];
                System.arraycopy(onwarmupcompletedArr, 0, onwarmupcompletedArr3, 0, i);
                System.arraycopy(onwarmupcompletedArr, i + 1, onwarmupcompletedArr3, i, (length - i) - 1);
                onwarmupcompletedArr2 = onwarmupcompletedArr3;
            }
        } while (!setSupportImageTintList.onNavigationEvent(this.onExtraCallbackWithResult, onwarmupcompletedArr, onwarmupcompletedArr2));
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        if (this.onExtraCallbackWithResult.get() == IAuthTabCallback) {
            ycxexternalsyntheticlambda1.cancel();
        } else {
            ycxexternalsyntheticlambda1.request(LongCompanionObject.MAX_VALUE);
        }
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(T t) {
        floatExponent.onExtraCallbackWithResult((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (onWarmupCompleted<T> onwarmupcompleted : this.onExtraCallbackWithResult.get()) {
            onwarmupcompleted.onNavigationEvent(t);
        }
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(Throwable th) {
        floatExponent.onExtraCallbackWithResult(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        onWarmupCompleted<T>[] onwarmupcompletedArr = this.onExtraCallbackWithResult.get();
        onWarmupCompleted<T>[] onwarmupcompletedArr2 = IAuthTabCallback;
        if (onwarmupcompletedArr == onwarmupcompletedArr2) {
            RxJavaPlugins.onExtraCallbackWithResult(th);
            return;
        }
        this.onNavigationEvent = th;
        for (onWarmupCompleted<T> onwarmupcompleted : this.onExtraCallbackWithResult.getAndSet(onwarmupcompletedArr2)) {
            onwarmupcompleted.onWarmupCompleted(th);
        }
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onExtraCallbackWithResult() {
        onWarmupCompleted<T>[] onwarmupcompletedArr = this.onExtraCallbackWithResult.get();
        onWarmupCompleted<T>[] onwarmupcompletedArr2 = IAuthTabCallback;
        if (onwarmupcompletedArr != onwarmupcompletedArr2) {
            for (onWarmupCompleted<T> onwarmupcompleted : this.onExtraCallbackWithResult.getAndSet(onwarmupcompletedArr2)) {
                onwarmupcompleted.onWarmupCompleted();
            }
        }
    }

    static final class onWarmupCompleted<T> extends AtomicLong implements ycxExternalSyntheticLambda1 {
        private static final long serialVersionUID = 3562861878281475070L;
        final ycxExternalSyntheticLambda0<? super T> downstream;
        final access27200<T> parent;

        onWarmupCompleted(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, access27200<T> access27200Var) {
            this.downstream = ycxexternalsyntheticlambda0;
            this.parent = access27200Var;
        }

        public void onNavigationEvent(T t) {
            long j = get();
            if (j == Long.MIN_VALUE) {
                return;
            }
            if (j != 0) {
                this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
                TombstoneProtosLogBufferBuilder.IAuthTabCallback(this, 1L);
            } else {
                cancel();
                this.downstream.onWarmupCompleted((Throwable) new NetConverter4("Could not emit value due to lack of requests"));
            }
        }

        public void onWarmupCompleted(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onWarmupCompleted(th);
            } else {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
        }

        public void onWarmupCompleted() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onExtraCallbackWithResult();
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            if (setLogs.validate(j)) {
                TombstoneProtosLogBufferBuilder.onNavigationEvent(this, j);
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.onWarmupCompleted((onWarmupCompleted) this);
            }
        }

        public boolean IAuthTabCallback() {
            return get() == Long.MIN_VALUE;
        }
    }
}
