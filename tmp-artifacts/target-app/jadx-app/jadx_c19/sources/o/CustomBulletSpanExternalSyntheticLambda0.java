package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Queue;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class CustomBulletSpanExternalSyntheticLambda0<A, B> {
    private final getTargetWidget<IAuthTabCallback<A>, B> onWarmupCompleted;

    public CustomBulletSpanExternalSyntheticLambda0() {
        this(250L);
    }

    public CustomBulletSpanExternalSyntheticLambda0(long j) {
        this.onWarmupCompleted = new getTargetWidget<IAuthTabCallback<A>, B>(j) { // from class: o.CustomBulletSpanExternalSyntheticLambda0.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // o.getTargetWidget
            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public void IAuthTabCallback(@NonNull IAuthTabCallback<A> iAuthTabCallback, @Nullable B b) {
                iAuthTabCallback.onExtraCallback();
            }
        };
    }

    public B onExtraCallbackWithResult(A a, int i2, int i3) {
        IAuthTabCallback<A> iAuthTabCallbackOnNavigationEvent = IAuthTabCallback.onNavigationEvent(a, i2, i3);
        B bIAuthTabCallback = this.onWarmupCompleted.IAuthTabCallback(iAuthTabCallbackOnNavigationEvent);
        iAuthTabCallbackOnNavigationEvent.onExtraCallback();
        return bIAuthTabCallback;
    }

    public void onNavigationEvent(A a, int i2, int i3, B b) {
        this.onWarmupCompleted.onNavigationEvent(IAuthTabCallback.onNavigationEvent(a, i2, i3), b);
    }

    static final class IAuthTabCallback<A> {
        private static final Queue<IAuthTabCallback<?>> onWarmupCompleted = applyConstraintsFromLayoutParams.onWarmupCompleted(0);
        private int IAuthTabCallback;
        private int onExtraCallback;
        private A onExtraCallbackWithResult;

        static <A> IAuthTabCallback<A> onNavigationEvent(A a, int i2, int i3) {
            IAuthTabCallback<A> iAuthTabCallback;
            Queue<IAuthTabCallback<?>> queue = onWarmupCompleted;
            synchronized (queue) {
                iAuthTabCallback = (IAuthTabCallback) queue.poll();
            }
            if (iAuthTabCallback == null) {
                iAuthTabCallback = new IAuthTabCallback<>();
            }
            iAuthTabCallback.onExtraCallback(a, i2, i3);
            return iAuthTabCallback;
        }

        private IAuthTabCallback() {
        }

        private void onExtraCallback(A a, int i2, int i3) {
            this.onExtraCallbackWithResult = a;
            this.onExtraCallback = i2;
            this.IAuthTabCallback = i3;
        }

        public void onExtraCallback() {
            Queue<IAuthTabCallback<?>> queue = onWarmupCompleted;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            return this.onExtraCallback == iAuthTabCallback.onExtraCallback && this.IAuthTabCallback == iAuthTabCallback.IAuthTabCallback && this.onExtraCallbackWithResult.equals(iAuthTabCallback.onExtraCallbackWithResult);
        }

        public int hashCode() {
            return (((this.IAuthTabCallback * 31) + this.onExtraCallback) * 31) + this.onExtraCallbackWithResult.hashCode();
        }
    }
}
