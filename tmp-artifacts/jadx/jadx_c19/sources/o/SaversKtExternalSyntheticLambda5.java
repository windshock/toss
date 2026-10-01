package o;

import androidx.annotation.NonNull;
import java.io.File;
import java.util.List;
import o.SaversKtExternalSyntheticLambda35;
import o.SaversKtExternalSyntheticLambda53;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SaversKtExternalSyntheticLambda5 implements SaversKtExternalSyntheticLambda53, SaversKtExternalSyntheticLambda35.onNavigationEvent<Object> {
    private final List<SaversKtExternalSyntheticLambda26> IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private List<ShaderBrushSpanExternalSyntheticLambda0<File, ?>> IAuthTabCallbackStub;
    private SaversKtExternalSyntheticLambda26 asBinder;
    private volatile ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<?> onExtraCallback;
    private File onExtraCallbackWithResult;
    private final SaversKtExternalSyntheticLambda53.onExtraCallback onNavigationEvent;
    private int onTransact;
    private final SaversKtExternalSyntheticLambda52<?> onWarmupCompleted;

    SaversKtExternalSyntheticLambda5(SaversKtExternalSyntheticLambda52<?> saversKtExternalSyntheticLambda52, SaversKtExternalSyntheticLambda53.onExtraCallback onextracallback) {
        this(saversKtExternalSyntheticLambda52.onNavigationEvent(), saversKtExternalSyntheticLambda52, onextracallback);
    }

    SaversKtExternalSyntheticLambda5(List<SaversKtExternalSyntheticLambda26> list, SaversKtExternalSyntheticLambda52<?> saversKtExternalSyntheticLambda52, SaversKtExternalSyntheticLambda53.onExtraCallback onextracallback) {
        this.IAuthTabCallbackDefault = -1;
        this.IAuthTabCallback = list;
        this.onWarmupCompleted = saversKtExternalSyntheticLambda52;
        this.onNavigationEvent = onextracallback;
    }

    @Override // o.SaversKtExternalSyntheticLambda53
    public boolean onNavigationEvent() {
        while (true) {
            boolean z = false;
            if (this.IAuthTabCallbackStub == null || !onExtraCallbackWithResult()) {
                int i2 = this.IAuthTabCallbackDefault + 1;
                this.IAuthTabCallbackDefault = i2;
                if (i2 >= this.IAuthTabCallback.size()) {
                    return false;
                }
                SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26 = this.IAuthTabCallback.get(this.IAuthTabCallbackDefault);
                File fileIAuthTabCallback = this.onWarmupCompleted.onWarmupCompleted().IAuthTabCallback(new SaversKtExternalSyntheticLambda51(saversKtExternalSyntheticLambda26, this.onWarmupCompleted.access100()));
                this.onExtraCallbackWithResult = fileIAuthTabCallback;
                if (fileIAuthTabCallback != null) {
                    this.asBinder = saversKtExternalSyntheticLambda26;
                    this.IAuthTabCallbackStub = this.onWarmupCompleted.onExtraCallbackWithResult(fileIAuthTabCallback);
                    this.onTransact = 0;
                }
            } else {
                this.onExtraCallback = null;
                while (!z && onExtraCallbackWithResult()) {
                    List<ShaderBrushSpanExternalSyntheticLambda0<File, ?>> list = this.IAuthTabCallbackStub;
                    int i3 = this.onTransact;
                    this.onTransact = i3 + 1;
                    this.onExtraCallback = list.get(i3).onNavigationEvent(this.onExtraCallbackWithResult, this.onWarmupCompleted.access000(), this.onWarmupCompleted.IAuthTabCallbackStub(), this.onWarmupCompleted.onTransact());
                    if (this.onExtraCallback != null && this.onWarmupCompleted.onExtraCallbackWithResult(this.onExtraCallback.onExtraCallback.onNavigationEvent())) {
                        this.onExtraCallback.onExtraCallback.onExtraCallback(this.onWarmupCompleted.IAuthTabCallbackDefault(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    private boolean onExtraCallbackWithResult() {
        return this.onTransact < this.IAuthTabCallbackStub.size();
    }

    @Override // o.SaversKtExternalSyntheticLambda53
    public void IAuthTabCallback() {
        ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<?> onextracallbackwithresult = this.onExtraCallback;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.onExtraCallback.onExtraCallbackWithResult();
        }
    }

    @Override // o.SaversKtExternalSyntheticLambda35.onNavigationEvent
    public void onExtraCallback(Object obj) {
        this.onNavigationEvent.onExtraCallback(this.asBinder, obj, this.onExtraCallback.onExtraCallback, SaversKtExternalSyntheticLambda21.DATA_DISK_CACHE, this.asBinder);
    }

    @Override // o.SaversKtExternalSyntheticLambda35.onNavigationEvent
    public void onExtraCallback(@NonNull Exception exc) {
        this.onNavigationEvent.onWarmupCompleted(this.asBinder, exc, this.onExtraCallback.onExtraCallback, SaversKtExternalSyntheticLambda21.DATA_DISK_CACHE);
    }
}
