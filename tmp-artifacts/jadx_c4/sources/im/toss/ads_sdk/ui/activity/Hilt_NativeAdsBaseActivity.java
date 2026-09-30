package im.toss.ads_sdk.ui.activity;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import o.PathMotion;
import o.access002;
import o.captureEndValues;
import o.isValidMatch;
import o.matchNames;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_NativeAdsBaseActivity extends AppCompatActivity implements captureEndValues {
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder;
    private final Object IAuthTabCallbackDefault;
    private volatile access002 IAuthTabCallbackStub;
    private boolean asInterface;
    private isValidMatch onTransact;

    Hilt_NativeAdsBaseActivity() {
        this.IAuthTabCallbackDefault = new Object();
        this.asInterface = false;
        onWarmupCompleted();
    }

    Hilt_NativeAdsBaseActivity(int i) {
        super(i);
        this.IAuthTabCallbackDefault = new Object();
        this.asInterface = false;
        onWarmupCompleted();
    }

    private void onWarmupCompleted() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity.3
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 95;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Hilt_NativeAdsBaseActivity.this.IAuthTabCallback();
                int i5 = IAuthTabCallback + 29;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = IAuthTabCallback_Parcel + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void onNavigationEvent() {
        int i = 2 % 2;
        if (getApplication() instanceof matchNames) {
            int i2 = IAuthTabCallback_Parcel + 81;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                isValidMatch isvalidmatchOnWarmupCompleted = onExtraCallback().onWarmupCompleted();
                this.onTransact = isvalidmatchOnWarmupCompleted;
                isvalidmatchOnWarmupCompleted.onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            isValidMatch isvalidmatchOnWarmupCompleted2 = onExtraCallback().onWarmupCompleted();
            this.onTransact = isvalidmatchOnWarmupCompleted2;
            if (isvalidmatchOnWarmupCompleted2.onExtraCallback()) {
                this.onTransact.onExtraCallback(getDefaultViewModelCreationExtras());
            }
        }
        int i3 = asBinder + 19;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        onNavigationEvent();
        int i4 = asBinder + 41;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void onDestroy() {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        isValidMatch isvalidmatch = this.onTransact;
        if (isvalidmatch != null) {
            int i4 = asBinder + 81;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            isvalidmatch.onNavigationEvent();
        }
    }

    @Override // o.matchNames
    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = onExtraCallback().generatedComponent();
        int i4 = IAuthTabCallback_Parcel + 35;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return objGeneratedComponent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected access002 onExtraCallbackWithResult() {
        int i = 2 % 2;
        access002 access002Var = new access002(this);
        int i2 = asBinder + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
        }
        return access002Var;
    }

    public final access002 onExtraCallback() {
        if (this.IAuthTabCallbackStub == null) {
            synchronized (this.IAuthTabCallbackDefault) {
                if (this.IAuthTabCallbackStub == null) {
                    this.IAuthTabCallbackStub = onExtraCallbackWithResult();
                }
            }
        }
        return this.IAuthTabCallbackStub;
    }

    protected void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 == 0) {
            int i4 = 32 / 0;
            if (this.asInterface) {
                return;
            }
        } else if (this.asInterface) {
            return;
        }
        int i5 = i3 + 33;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        this.asInterface = true;
        int i7 = IAuthTabCallback_Parcel + 37;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onWarmupCompleted = PathMotion.onWarmupCompleted(this, super/*androidx.activity.ComponentActivity*/.getDefaultViewModelProviderFactory());
        int i4 = asBinder + 113;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
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
