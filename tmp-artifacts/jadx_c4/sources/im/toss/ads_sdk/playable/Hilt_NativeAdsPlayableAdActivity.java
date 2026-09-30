package im.toss.ads_sdk.playable;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import o.PathMotion;
import o.access002;
import o.animate;
import o.captureEndValues;
import o.infoForAnyChild;
import o.isValidMatch;
import o.matchNames;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_NativeAdsPlayableAdActivity extends AppCompatActivity implements captureEndValues {
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private isValidMatch IAuthTabCallbackDefault;
    private final Object asBinder;
    private boolean asInterface;
    private volatile access002 onTransact;

    Hilt_NativeAdsPlayableAdActivity() {
        this.asBinder = new Object();
        this.asInterface = false;
        onExtraCallbackWithResult();
    }

    Hilt_NativeAdsPlayableAdActivity(int i) {
        super(i);
        this.asBinder = new Object();
        this.asInterface = false;
        onExtraCallbackWithResult();
    }

    private void onExtraCallbackWithResult() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.ads_sdk.playable.Hilt_NativeAdsPlayableAdActivity.4
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 87;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Hilt_NativeAdsPlayableAdActivity.this.onExtraCallback();
                int i5 = onExtraCallbackWithResult + 21;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = IAuthTabCallbackStub + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (!(!(getApplication() instanceof matchNames))) {
            this.IAuthTabCallbackDefault = onWarmupCompleted().onWarmupCompleted();
            if (!(!r1.onExtraCallback())) {
                this.IAuthTabCallbackDefault.onExtraCallback(getDefaultViewModelCreationExtras());
            }
        }
        int i4 = IAuthTabCallbackStub + 51;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        IAuthTabCallback();
        int i4 = IAuthTabCallbackStub + 109;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onDestroy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        isValidMatch isvalidmatch = this.IAuthTabCallbackDefault;
        if (isvalidmatch != null) {
            isvalidmatch.onNavigationEvent();
        }
        int i4 = IAuthTabCallback_Parcel + 105;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.matchNames
    public final Object generatedComponent() {
        Object objGeneratedComponent;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            objGeneratedComponent = onWarmupCompleted().generatedComponent();
            int i3 = 88 / 0;
        } else {
            objGeneratedComponent = onWarmupCompleted().generatedComponent();
        }
        int i4 = IAuthTabCallback_Parcel + 83;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return objGeneratedComponent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected access002 onNavigationEvent() {
        int i = 2 % 2;
        access002 access002Var = new access002(this);
        int i2 = IAuthTabCallbackStub + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return access002Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final access002 onWarmupCompleted() {
        if (this.onTransact == null) {
            synchronized (this.asBinder) {
                if (this.onTransact == null) {
                    this.onTransact = onNavigationEvent();
                }
            }
        }
        return this.onTransact;
    }

    protected void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 99;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            if (!this.asInterface) {
                this.asInterface = true;
                ((infoForAnyChild) generatedComponent()).onExtraCallback((NativeAdsPlayableAdActivity) animate.onExtraCallbackWithResult(this));
            }
            int i3 = IAuthTabCallbackStub + 87;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        throw null;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = super/*androidx.activity.ComponentActivity*/.getDefaultViewModelProviderFactory();
        if (i3 == 0) {
            return PathMotion.onWarmupCompleted(this, defaultViewModelProviderFactory);
        }
        PathMotion.onWarmupCompleted(this, defaultViewModelProviderFactory);
        throw null;
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
