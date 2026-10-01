package im.toss.base;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import im.toss.uikit.base.UIKitBaseActivity;
import o.PathMotion;
import o.access002;
import o.animate;
import o.captureEndValues;
import o.isValidMatch;
import o.matchNames;
import o.onWindowLayoutChanged;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_BaseActivity extends UIKitBaseActivity implements captureEndValues {
    private static int getInterfaceDescriptor = 1;
    private static int onTransact;
    private volatile access002 IAuthTabCallbackDefault;
    private isValidMatch IAuthTabCallbackStub;
    private final Object asBinder;
    private boolean asInterface;

    Hilt_BaseActivity() {
        this.asBinder = new Object();
        this.asInterface = false;
        onWarmupCompleted();
    }

    Hilt_BaseActivity(int i) {
        super(i);
        this.asBinder = new Object();
        this.asInterface = false;
        onWarmupCompleted();
    }

    private void onWarmupCompleted() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.base.Hilt_BaseActivity.3
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 57;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Hilt_BaseActivity.this.aR_();
                int i5 = IAuthTabCallback + 101;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = getInterfaceDescriptor + 105;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        if (!(!(getApplication() instanceof matchNames))) {
            int i2 = onTransact + 47;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            isValidMatch isvalidmatchOnWarmupCompleted = prefetchWithMultipleUrls().onWarmupCompleted();
            this.IAuthTabCallbackStub = isvalidmatchOnWarmupCompleted;
            if (isvalidmatchOnWarmupCompleted.onExtraCallback()) {
                int i4 = getInterfaceDescriptor + 31;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                this.IAuthTabCallbackStub.onExtraCallback(getDefaultViewModelCreationExtras());
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            super.onCreate(bundle);
            IAuthTabCallbackStubProxy();
        } else {
            super.onCreate(bundle);
            IAuthTabCallbackStubProxy();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        isValidMatch isvalidmatch = this.IAuthTabCallbackStub;
        if (isvalidmatch != null) {
            int i2 = onTransact + 95;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            isvalidmatch.onNavigationEvent();
        }
        int i4 = onTransact + 19;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.matchNames
    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = prefetchWithMultipleUrls().generatedComponent();
        int i4 = getInterfaceDescriptor + 19;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return objGeneratedComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected access002 warmup() {
        int i = 2 % 2;
        access002 access002Var = new access002(this);
        int i2 = onTransact + 3;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return access002Var;
    }

    public final access002 prefetchWithMultipleUrls() {
        if (this.IAuthTabCallbackDefault == null) {
            synchronized (this.asBinder) {
                if (this.IAuthTabCallbackDefault == null) {
                    this.IAuthTabCallbackDefault = warmup();
                }
            }
        }
        return this.IAuthTabCallbackDefault;
    }

    protected void aR_() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 113;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        if (this.asInterface) {
            return;
        }
        int i5 = i2 + 69;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        this.asInterface = true;
        ((onWindowLayoutChanged) generatedComponent()).onWarmupCompleted((BaseActivity) animate.onExtraCallbackWithResult(this));
        int i7 = getInterfaceDescriptor + 55;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = super/*androidx.activity.ComponentActivity*/.getDefaultViewModelProviderFactory();
        if (i3 == 0) {
            return PathMotion.onWarmupCompleted(this, defaultViewModelProviderFactory);
        }
        PathMotion.onWarmupCompleted(this, defaultViewModelProviderFactory);
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
