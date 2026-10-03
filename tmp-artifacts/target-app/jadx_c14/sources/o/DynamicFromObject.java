package o;

import android.content.Context;
import androidx.lifecycle.LifecycleService;
import viva.republica.toss.pedometer.PedometerService;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class DynamicFromObject extends LifecycleService implements captureEndValues {
    private volatile isValueChanged IAuthTabCallback;
    private final Object onExtraCallback = new Object();
    private boolean onExtraCallbackWithResult = false;

    public void onCreate() {
        IAuthTabCallback();
        super.onCreate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected isValueChanged onWarmupCompleted() {
        return new isValueChanged(this);
    }

    public final isValueChanged onExtraCallback() {
        if (this.IAuthTabCallback == null) {
            synchronized (this.onExtraCallback) {
                if (this.IAuthTabCallback == null) {
                    this.IAuthTabCallback = onWarmupCompleted();
                }
            }
        }
        return this.IAuthTabCallback;
    }

    protected void IAuthTabCallback() {
        if (this.onExtraCallbackWithResult) {
            return;
        }
        this.onExtraCallbackWithResult = true;
        ((createCachedSplitBundleFromNetworkLoader) generatedComponent()).IAuthTabCallback((PedometerService) animate.onExtraCallbackWithResult(this));
    }

    public final Object generatedComponent() {
        return onExtraCallback().generatedComponent();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
