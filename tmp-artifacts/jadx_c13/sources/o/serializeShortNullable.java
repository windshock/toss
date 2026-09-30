package o;

import java.util.concurrent.TimeUnit;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class serializeShortNullable<T> extends ObjectConverter2<T, T> {
    final long IAuthTabCallback;
    final boolean onExtraCallback;
    final TimeUnit onNavigationEvent;
    final MapConverter onWarmupCompleted;

    public serializeShortNullable(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, long j, TimeUnit timeUnit, MapConverter mapConverter, boolean z) {
        super(jsonReaderUnknownNumberParsing);
        this.IAuthTabCallback = j;
        this.onNavigationEvent = timeUnit;
        this.onWarmupCompleted = mapConverter;
        this.onExtraCallback = z;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onWarmupCompleted(!this.onExtraCallback ? new getTagBytes(ycxexternalsyntheticlambda0) : ycxexternalsyntheticlambda0, this.IAuthTabCallback, this.onNavigationEvent, this.onWarmupCompleted.onExtraCallbackWithResult(), this.onExtraCallback));
    }

    static final class onWarmupCompleted<T> implements JsonReaderReadObject<T>, ycxExternalSyntheticLambda1 {
        ycxExternalSyntheticLambda1 IAuthTabCallback;
        final long onExtraCallback;
        final boolean onExtraCallbackWithResult;
        final ycxExternalSyntheticLambda0<? super T> onNavigationEvent;
        final MapConverter.onNavigationEvent onTransact;
        final TimeUnit onWarmupCompleted;

        onWarmupCompleted(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, long j, TimeUnit timeUnit, MapConverter.onNavigationEvent onnavigationevent, boolean z) {
            this.onNavigationEvent = ycxexternalsyntheticlambda0;
            this.onExtraCallback = j;
            this.onWarmupCompleted = timeUnit;
            this.onTransact = onnavigationevent;
            this.onExtraCallbackWithResult = z;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.IAuthTabCallback, ycxexternalsyntheticlambda1)) {
                this.IAuthTabCallback = ycxexternalsyntheticlambda1;
                this.onNavigationEvent.onExtraCallback(this);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            this.onTransact.onNavigationEvent(new onNavigationEvent(t), this.onExtraCallback, this.onWarmupCompleted);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            this.onTransact.onNavigationEvent(new onExtraCallback(th), this.onExtraCallbackWithResult ? this.onExtraCallback : 0L, this.onWarmupCompleted);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.onTransact.onNavigationEvent(new RunnableC0039onWarmupCompleted(), this.onExtraCallback, this.onWarmupCompleted);
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            this.IAuthTabCallback.request(j);
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            this.IAuthTabCallback.cancel();
            this.onTransact.dispose();
        }

        final class onNavigationEvent implements Runnable {
            private final T IAuthTabCallback;

            onNavigationEvent(T t) {
                this.IAuthTabCallback = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                onWarmupCompleted.this.onNavigationEvent.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) this.IAuthTabCallback);
            }
        }

        final class onExtraCallback implements Runnable {
            private final Throwable onWarmupCompleted;

            onExtraCallback(Throwable th) {
                this.onWarmupCompleted = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    onWarmupCompleted.this.onNavigationEvent.onWarmupCompleted(this.onWarmupCompleted);
                } finally {
                    onWarmupCompleted.this.onTransact.dispose();
                }
            }
        }

        /* renamed from: o.serializeShortNullable$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        final class RunnableC0039onWarmupCompleted implements Runnable {
            RunnableC0039onWarmupCompleted() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    onWarmupCompleted.this.onNavigationEvent.onExtraCallbackWithResult();
                } finally {
                    onWarmupCompleted.this.onTransact.dispose();
                }
            }
        }
    }
}
