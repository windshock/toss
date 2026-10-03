package viva.republica.toss.appsintoss;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import o.PathMotion;
import o.access002;
import o.captureEndValues;
import o.isValidMatch;
import o.matchNames;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_AppsInTossSubscriptionDemoActivity extends ComponentActivity implements captureEndValues {
    private isValidMatch IAuthTabCallback;
    private volatile access002 onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final Object onNavigationEvent;

    Hilt_AppsInTossSubscriptionDemoActivity() {
        this.onNavigationEvent = new Object();
        this.onExtraCallbackWithResult = false;
        onWarmupCompleted();
    }

    Hilt_AppsInTossSubscriptionDemoActivity(int i) {
        super(i);
        this.onNavigationEvent = new Object();
        this.onExtraCallbackWithResult = false;
        onWarmupCompleted();
    }

    private void onWarmupCompleted() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.appsintoss.Hilt_AppsInTossSubscriptionDemoActivity.2
            public void onContextAvailable(Context context) {
                Hilt_AppsInTossSubscriptionDemoActivity.this.IAuthTabCallback();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void onExtraCallbackWithResult() {
        if (getApplication() instanceof matchNames) {
            isValidMatch isvalidmatchOnWarmupCompleted = onNavigationEvent().onWarmupCompleted();
            this.IAuthTabCallback = isvalidmatchOnWarmupCompleted;
            if (isvalidmatchOnWarmupCompleted.onExtraCallback()) {
                this.IAuthTabCallback.onExtraCallback(getDefaultViewModelCreationExtras());
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        onExtraCallbackWithResult();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDestroy() {
        super/*android.app.Activity*/.onDestroy();
        isValidMatch isvalidmatch = this.IAuthTabCallback;
        if (isvalidmatch != null) {
            isvalidmatch.onNavigationEvent();
        }
    }

    public final Object generatedComponent() {
        return onNavigationEvent().generatedComponent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected access002 onExtraCallback() {
        return new access002(this);
    }

    public final access002 onNavigationEvent() {
        if (this.onExtraCallback == null) {
            synchronized (this.onNavigationEvent) {
                if (this.onExtraCallback == null) {
                    this.onExtraCallback = onExtraCallback();
                }
            }
        }
        return this.onExtraCallback;
    }

    protected void IAuthTabCallback() {
        if (this.onExtraCallbackWithResult) {
            return;
        }
        this.onExtraCallbackWithResult = true;
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
