package im.toss.securities.widget.common.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import o.PathMotion;
import o.access002;
import o.animate;
import o.captureEndValues;
import o.isValidMatch;
import o.matchNames;
import o.r8lambdaVxh3ZHa3wCWnJqMbkC1zVPIuOcs;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class Hilt_TossSecWidgetBridgeActivity extends AppCompatActivity implements captureEndValues {
    private static int getInterfaceDescriptor = 1;
    private static int onTransact;
    private isValidMatch IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private final Object asBinder;
    private volatile access002 asInterface;

    Hilt_TossSecWidgetBridgeActivity() {
        this.asBinder = new Object();
        this.IAuthTabCallbackStub = false;
        onExtraCallbackWithResult();
    }

    Hilt_TossSecWidgetBridgeActivity(int i) {
        super(i);
        this.asBinder = new Object();
        this.IAuthTabCallbackStub = false;
        onExtraCallbackWithResult();
    }

    private void onExtraCallbackWithResult() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.securities.widget.common.ui.Hilt_TossSecWidgetBridgeActivity.2
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 41;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Hilt_TossSecWidgetBridgeActivity.this.onWarmupCompleted();
                int i5 = onNavigationEvent + 75;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 23 / 0;
                }
            }
        });
        int i2 = onTransact + 75;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void onExtraCallback() {
        int i = 2 % 2;
        if (getApplication() instanceof matchNames) {
            int i2 = getInterfaceDescriptor + 83;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            isValidMatch isvalidmatchOnWarmupCompleted = IAuthTabCallback().onWarmupCompleted();
            this.IAuthTabCallbackDefault = isvalidmatchOnWarmupCompleted;
            if (isvalidmatchOnWarmupCompleted.onExtraCallback()) {
                this.IAuthTabCallbackDefault.onExtraCallback(getDefaultViewModelCreationExtras());
            }
        }
        int i4 = getInterfaceDescriptor + 117;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
            onExtraCallback();
            int i3 = 2 / 0;
        } else {
            super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
            onExtraCallback();
        }
        int i4 = getInterfaceDescriptor + 51;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onDestroy() {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        isValidMatch isvalidmatch = this.IAuthTabCallbackDefault;
        if (isvalidmatch != null) {
            int i4 = getInterfaceDescriptor + 39;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            isvalidmatch.onNavigationEvent();
            int i6 = onTransact + 123;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback().generatedComponent();
            obj.hashCode();
            throw null;
        }
        Object objGeneratedComponent = IAuthTabCallback().generatedComponent();
        int i3 = onTransact + 81;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return objGeneratedComponent;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected access002 onNavigationEvent() {
        int i = 2 % 2;
        access002 access002Var = new access002(this);
        int i2 = onTransact + 9;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 54 / 0;
        }
        return access002Var;
    }

    public final access002 IAuthTabCallback() {
        if (this.asInterface == null) {
            synchronized (this.asBinder) {
                if (this.asInterface == null) {
                    this.asInterface = onNavigationEvent();
                }
            }
        }
        return this.asInterface;
    }

    protected void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.IAuthTabCallbackStub) {
            this.IAuthTabCallbackStub = true;
            ((r8lambdaVxh3ZHa3wCWnJqMbkC1zVPIuOcs) generatedComponent()).onExtraCallbackWithResult((TossSecWidgetBridgeActivity) animate.onExtraCallbackWithResult(this));
        }
        int i3 = onTransact + 39;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = super/*androidx.activity.ComponentActivity*/.getDefaultViewModelProviderFactory();
        if (i3 != 0) {
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
