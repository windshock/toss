package o;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o.SaversKtExternalSyntheticLambda35;
import o.SaversKtExternalSyntheticLambda53;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SaversKtExternalSyntheticLambda9 implements SaversKtExternalSyntheticLambda53, SaversKtExternalSyntheticLambda53.onExtraCallback {
    private final SaversKtExternalSyntheticLambda52<?> IAuthTabCallback;
    private volatile SaversKtExternalSyntheticLambda51 asBinder;
    private volatile SaversKtExternalSyntheticLambda5 asInterface;
    private volatile Object onExtraCallback;
    private volatile ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<?> onExtraCallbackWithResult;
    private volatile int onNavigationEvent;
    private final SaversKtExternalSyntheticLambda53.onExtraCallback onWarmupCompleted;

    SaversKtExternalSyntheticLambda9(SaversKtExternalSyntheticLambda52<?> saversKtExternalSyntheticLambda52, SaversKtExternalSyntheticLambda53.onExtraCallback onextracallback) {
        this.IAuthTabCallback = saversKtExternalSyntheticLambda52;
        this.onWarmupCompleted = onextracallback;
    }

    @Override // o.SaversKtExternalSyntheticLambda53
    public boolean onNavigationEvent() {
        if (this.onExtraCallback != null) {
            Object obj = this.onExtraCallback;
            this.onExtraCallback = null;
            try {
                if (!onExtraCallback(obj)) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        if (this.asInterface != null && this.asInterface.onNavigationEvent()) {
            return true;
        }
        this.asInterface = null;
        this.onExtraCallbackWithResult = null;
        boolean z = false;
        while (!z && onExtraCallbackWithResult()) {
            List<ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<?>> listAsInterface = this.IAuthTabCallback.asInterface();
            int i2 = this.onNavigationEvent;
            this.onNavigationEvent = i2 + 1;
            this.onExtraCallbackWithResult = listAsInterface.get(i2);
            if (this.onExtraCallbackWithResult != null && (this.IAuthTabCallback.IAuthTabCallback().onExtraCallbackWithResult(this.onExtraCallbackWithResult.onExtraCallback.IAuthTabCallback()) || this.IAuthTabCallback.onExtraCallbackWithResult(this.onExtraCallbackWithResult.onExtraCallback.onNavigationEvent()))) {
                onNavigationEvent(this.onExtraCallbackWithResult);
                z = true;
            }
        }
        return z;
    }

    private void onNavigationEvent(final ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<?> onextracallbackwithresult) {
        this.onExtraCallbackWithResult.onExtraCallback.onExtraCallback(this.IAuthTabCallback.IAuthTabCallbackDefault(), new SaversKtExternalSyntheticLambda35.onNavigationEvent<Object>() { // from class: o.SaversKtExternalSyntheticLambda9.5
            @Override // o.SaversKtExternalSyntheticLambda35.onNavigationEvent
            public void onExtraCallback(@Nullable Object obj) {
                if (SaversKtExternalSyntheticLambda9.this.onExtraCallbackWithResult(onextracallbackwithresult)) {
                    SaversKtExternalSyntheticLambda9.this.onExtraCallback(onextracallbackwithresult, obj);
                }
            }

            @Override // o.SaversKtExternalSyntheticLambda35.onNavigationEvent
            public void onExtraCallback(@NonNull Exception exc) {
                if (SaversKtExternalSyntheticLambda9.this.onExtraCallbackWithResult(onextracallbackwithresult)) {
                    SaversKtExternalSyntheticLambda9.this.onWarmupCompleted(onextracallbackwithresult, exc);
                }
            }
        });
    }

    boolean onExtraCallbackWithResult(ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<?> onextracallbackwithresult) {
        ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<?> onextracallbackwithresult2 = this.onExtraCallbackWithResult;
        return onextracallbackwithresult2 != null && onextracallbackwithresult2 == onextracallbackwithresult;
    }

    private boolean onExtraCallbackWithResult() {
        return this.onNavigationEvent < this.IAuthTabCallback.asInterface().size();
    }

    private boolean onExtraCallback(Object obj) throws Throwable {
        long jIAuthTabCallback = getSharedValues.IAuthTabCallback();
        boolean z = false;
        try {
            SaversKtExternalSyntheticLambda33<T> saversKtExternalSyntheticLambda33OnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted((SaversKtExternalSyntheticLambda52<?>) obj);
            Object objOnNavigationEvent = saversKtExternalSyntheticLambda33OnWarmupCompleted.onNavigationEvent();
            SaversKtExternalSyntheticLambda24<X> saversKtExternalSyntheticLambda24IAuthTabCallback = this.IAuthTabCallback.IAuthTabCallback(objOnNavigationEvent);
            SaversKtExternalSyntheticLambda50 saversKtExternalSyntheticLambda50 = new SaversKtExternalSyntheticLambda50(saversKtExternalSyntheticLambda24IAuthTabCallback, objOnNavigationEvent, this.IAuthTabCallback.onTransact());
            SaversKtExternalSyntheticLambda51 saversKtExternalSyntheticLambda51 = new SaversKtExternalSyntheticLambda51(this.onExtraCallbackWithResult.IAuthTabCallback, this.IAuthTabCallback.access100());
            LayoutIntrinsics_androidKtExternalSyntheticLambda0 layoutIntrinsics_androidKtExternalSyntheticLambda0OnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted();
            layoutIntrinsics_androidKtExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback(saversKtExternalSyntheticLambda51, saversKtExternalSyntheticLambda50);
            if (Log.isLoggable("SourceGenerator", 2)) {
                saversKtExternalSyntheticLambda51.toString();
                Objects.toString(obj);
                Objects.toString(saversKtExternalSyntheticLambda24IAuthTabCallback);
                getSharedValues.onWarmupCompleted(jIAuthTabCallback);
            }
            if (layoutIntrinsics_androidKtExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback(saversKtExternalSyntheticLambda51) != null) {
                this.asBinder = saversKtExternalSyntheticLambda51;
                this.asInterface = new SaversKtExternalSyntheticLambda5(Collections.singletonList(this.onExtraCallbackWithResult.IAuthTabCallback), this.IAuthTabCallback, this);
                this.onExtraCallbackWithResult.onExtraCallback.onExtraCallback();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.asBinder);
                Objects.toString(obj);
            }
            try {
                this.onWarmupCompleted.onExtraCallback(this.onExtraCallbackWithResult.IAuthTabCallback, saversKtExternalSyntheticLambda33OnWarmupCompleted.onNavigationEvent(), this.onExtraCallbackWithResult.onExtraCallback, this.onExtraCallbackWithResult.onExtraCallback.IAuthTabCallback(), this.onExtraCallbackWithResult.IAuthTabCallback);
                return false;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.onExtraCallbackWithResult.onExtraCallback.onExtraCallback();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // o.SaversKtExternalSyntheticLambda53
    public void IAuthTabCallback() {
        ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<?> onextracallbackwithresult = this.onExtraCallbackWithResult;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.onExtraCallback.onExtraCallbackWithResult();
        }
    }

    void onExtraCallback(ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<?> onextracallbackwithresult, Object obj) {
        SaversKtExternalSyntheticLambda58 saversKtExternalSyntheticLambda58IAuthTabCallback = this.IAuthTabCallback.IAuthTabCallback();
        if (obj != null && saversKtExternalSyntheticLambda58IAuthTabCallback.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallback.IAuthTabCallback())) {
            this.onExtraCallback = obj;
            this.onWarmupCompleted.onWarmupCompleted();
        } else {
            SaversKtExternalSyntheticLambda53.onExtraCallback onextracallback = this.onWarmupCompleted;
            SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26 = onextracallbackwithresult.IAuthTabCallback;
            SaversKtExternalSyntheticLambda35<?> saversKtExternalSyntheticLambda35 = onextracallbackwithresult.onExtraCallback;
            onextracallback.onExtraCallback(saversKtExternalSyntheticLambda26, obj, saversKtExternalSyntheticLambda35, saversKtExternalSyntheticLambda35.IAuthTabCallback(), this.asBinder);
        }
    }

    void onWarmupCompleted(ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<?> onextracallbackwithresult, @NonNull Exception exc) {
        SaversKtExternalSyntheticLambda53.onExtraCallback onextracallback = this.onWarmupCompleted;
        SaversKtExternalSyntheticLambda51 saversKtExternalSyntheticLambda51 = this.asBinder;
        SaversKtExternalSyntheticLambda35<?> saversKtExternalSyntheticLambda35 = onextracallbackwithresult.onExtraCallback;
        onextracallback.onWarmupCompleted(saversKtExternalSyntheticLambda51, exc, saversKtExternalSyntheticLambda35, saversKtExternalSyntheticLambda35.IAuthTabCallback());
    }

    @Override // o.SaversKtExternalSyntheticLambda53.onExtraCallback
    public void onWarmupCompleted() {
        throw new UnsupportedOperationException();
    }

    @Override // o.SaversKtExternalSyntheticLambda53.onExtraCallback
    public void onExtraCallback(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, Object obj, SaversKtExternalSyntheticLambda35<?> saversKtExternalSyntheticLambda35, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21, SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda262) {
        this.onWarmupCompleted.onExtraCallback(saversKtExternalSyntheticLambda26, obj, saversKtExternalSyntheticLambda35, this.onExtraCallbackWithResult.onExtraCallback.IAuthTabCallback(), saversKtExternalSyntheticLambda26);
    }

    @Override // o.SaversKtExternalSyntheticLambda53.onExtraCallback
    public void onWarmupCompleted(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, Exception exc, SaversKtExternalSyntheticLambda35<?> saversKtExternalSyntheticLambda35, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21) {
        this.onWarmupCompleted.onWarmupCompleted(saversKtExternalSyntheticLambda26, exc, saversKtExternalSyntheticLambda35, this.onExtraCallbackWithResult.onExtraCallback.IAuthTabCallback());
    }
}
