package viva.republica.toss.appsintoss;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import o.PathMotion;
import o.access002;
import o.animate;
import o.captureEndValues;
import o.getAdjustedDate;
import o.isValidMatch;
import o.matchNames;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_AppsInTossIAPDemoActivity extends ComponentActivity implements captureEndValues {
    private final Object onExtraCallback;
    private volatile access002 onExtraCallbackWithResult;
    private isValidMatch onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_AppsInTossIAPDemoActivity() {
        this.onExtraCallback = new Object();
        this.onWarmupCompleted = false;
        onExtraCallbackWithResult();
    }

    Hilt_AppsInTossIAPDemoActivity(int i) {
        super(i);
        this.onExtraCallback = new Object();
        this.onWarmupCompleted = false;
        onExtraCallbackWithResult();
    }

    private void onExtraCallbackWithResult() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.appsintoss.Hilt_AppsInTossIAPDemoActivity.4
            public void onContextAvailable(Context context) {
                Hilt_AppsInTossIAPDemoActivity.this.onNavigationEvent();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void onWarmupCompleted() {
        if (getApplication() instanceof matchNames) {
            isValidMatch isvalidmatchOnWarmupCompleted = onExtraCallback().onWarmupCompleted();
            this.onNavigationEvent = isvalidmatchOnWarmupCompleted;
            if (isvalidmatchOnWarmupCompleted.onExtraCallback()) {
                this.onNavigationEvent.onExtraCallback(getDefaultViewModelCreationExtras());
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        onWarmupCompleted();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDestroy() {
        super/*android.app.Activity*/.onDestroy();
        isValidMatch isvalidmatch = this.onNavigationEvent;
        if (isvalidmatch != null) {
            isvalidmatch.onNavigationEvent();
        }
    }

    public final Object generatedComponent() {
        return onExtraCallback().generatedComponent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected access002 IAuthTabCallback() {
        return new access002(this);
    }

    public final access002 onExtraCallback() {
        if (this.onExtraCallbackWithResult == null) {
            synchronized (this.onExtraCallback) {
                if (this.onExtraCallbackWithResult == null) {
                    this.onExtraCallbackWithResult = IAuthTabCallback();
                }
            }
        }
        return this.onExtraCallbackWithResult;
    }

    protected void onNavigationEvent() {
        if (this.onWarmupCompleted) {
            return;
        }
        this.onWarmupCompleted = true;
        ((getAdjustedDate) generatedComponent()).onWarmupCompleted((AppsInTossIAPDemoActivity) animate.onExtraCallbackWithResult(this));
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        return PathMotion.onWarmupCompleted(this, super.getDefaultViewModelProviderFactory());
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
