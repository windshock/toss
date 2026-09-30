package o;

import android.os.Handler;
import android.os.Looper;
import com.google.common.base.Function;
import o.TextFieldCoreModifierNodeExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldCoreModifierNodeExternalSyntheticLambda0<T> {
    private final onExtraCallbackWithResult<T> IAuthTabCallback;
    private int IAuthTabCallbackStub;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda16 onExtraCallback;
    private T onExtraCallbackWithResult;
    private T onNavigationEvent;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda16 onWarmupCompleted;

    public interface onExtraCallbackWithResult<T> {
        void onStateChanged(T t, T t2);
    }

    public TextFieldCoreModifierNodeExternalSyntheticLambda0(T t, Looper looper, Looper looper2, TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0, onExtraCallbackWithResult<T> onextracallbackwithresult) {
        this.onExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda0.onWarmupCompleted(looper, (Handler.Callback) null);
        this.onWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda0.onWarmupCompleted(looper2, (Handler.Callback) null);
        this.onExtraCallbackWithResult = t;
        this.onNavigationEvent = t;
        this.IAuthTabCallback = onextracallbackwithresult;
    }

    public T onWarmupCompleted() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.onWarmupCompleted.onNavigationEvent()) {
            return this.onExtraCallbackWithResult;
        }
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(looperMyLooper == this.onExtraCallback.onNavigationEvent());
        return this.onNavigationEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onExtraCallbackWithResult(Function<T, T> function, final Function<T, T> function2) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(Looper.myLooper() == this.onWarmupCompleted.onNavigationEvent());
        this.IAuthTabCallbackStub++;
        IAuthTabCallback(new Runnable() { // from class: androidx.media3.common.util.BackgroundThreadStateHandler$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TextFieldCoreModifierNodeExternalSyntheticLambda0.IAuthTabCallback(this.f$0, function2);
            }
        });
        onExtraCallback(function.apply(this.onExtraCallbackWithResult));
    }

    public static /* synthetic */ void IAuthTabCallback(final TextFieldCoreModifierNodeExternalSyntheticLambda0 textFieldCoreModifierNodeExternalSyntheticLambda0, Function function) {
        final T t = (T) function.apply(textFieldCoreModifierNodeExternalSyntheticLambda0.onNavigationEvent);
        textFieldCoreModifierNodeExternalSyntheticLambda0.onNavigationEvent = t;
        textFieldCoreModifierNodeExternalSyntheticLambda0.onExtraCallbackWithResult(new Runnable() { // from class: androidx.media3.common.util.BackgroundThreadStateHandler$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                TextFieldCoreModifierNodeExternalSyntheticLambda0.IAuthTabCallback(this.f$0, t);
            }
        });
    }

    public static /* synthetic */ void IAuthTabCallback(TextFieldCoreModifierNodeExternalSyntheticLambda0 textFieldCoreModifierNodeExternalSyntheticLambda0, Object obj) {
        int i2 = textFieldCoreModifierNodeExternalSyntheticLambda0.IAuthTabCallbackStub - 1;
        textFieldCoreModifierNodeExternalSyntheticLambda0.IAuthTabCallbackStub = i2;
        if (i2 == 0) {
            textFieldCoreModifierNodeExternalSyntheticLambda0.onExtraCallback(obj);
        }
    }

    public void onNavigationEvent(final T t) {
        this.onNavigationEvent = t;
        onExtraCallbackWithResult(new Runnable() { // from class: androidx.media3.common.util.BackgroundThreadStateHandler$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                TextFieldCoreModifierNodeExternalSyntheticLambda0.onExtraCallbackWithResult(this.f$0, t);
            }
        });
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TextFieldCoreModifierNodeExternalSyntheticLambda0 textFieldCoreModifierNodeExternalSyntheticLambda0, Object obj) {
        if (textFieldCoreModifierNodeExternalSyntheticLambda0.IAuthTabCallbackStub == 0) {
            textFieldCoreModifierNodeExternalSyntheticLambda0.onExtraCallback(obj);
        }
    }

    public void IAuthTabCallback(Runnable runnable) {
        if (this.onExtraCallback.onNavigationEvent().getThread().isAlive()) {
            this.onExtraCallback.onNavigationEvent(runnable);
        }
    }

    private void onExtraCallbackWithResult(Runnable runnable) {
        if (this.onWarmupCompleted.onNavigationEvent().getThread().isAlive()) {
            this.onWarmupCompleted.onNavigationEvent(runnable);
        }
    }

    private void onExtraCallback(T t) {
        T t2 = this.onExtraCallbackWithResult;
        this.onExtraCallbackWithResult = t;
        if (t2.equals(t)) {
            return;
        }
        this.IAuthTabCallback.onStateChanged(t2, t);
    }
}
