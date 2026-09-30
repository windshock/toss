package o;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.annotation.Nullable;
import androidx.media3.session.legacy.RatingCompat;
import java.lang.ref.WeakReference;
import java.util.List;
import o.TabKtExternalSyntheticLambda8;
import o.TabRowKtExternalSyntheticLambda0;
import o.TabRowKtExternalSyntheticLambda10;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class TabRowKtExternalSyntheticLambda0$onWarmupCompleted$onExtraCallbackWithResult extends TabKtExternalSyntheticLambda8.IAuthTabCallback {
    private final WeakReference<TabRowKtExternalSyntheticLambda0.onWarmupCompleted> IAuthTabCallback;

    public void IAuthTabCallback(boolean z) {
    }

    public List<TabRowKtExternalSyntheticLambda0.IAuthTabCallbackStub> IAuthTabCallbackStub() {
        return null;
    }

    public boolean readTypedObject() {
        return false;
    }

    TabRowKtExternalSyntheticLambda0$onWarmupCompleted$onExtraCallbackWithResult(TabRowKtExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted) {
        this.IAuthTabCallback = new WeakReference<>(onwarmupcompleted);
    }

    public void ICustomTabsCallbackDefault() {
        this.IAuthTabCallback.clear();
    }

    public void onWarmupCompleted(@Nullable String str, @Nullable Bundle bundle, @Nullable TabRowKtExternalSyntheticLambda0.asInterface asinterface) {
        throw new AssertionError();
    }

    public boolean onExtraCallback(@Nullable KeyEvent keyEvent) {
        throw new AssertionError();
    }

    public void IAuthTabCallback(@Nullable TabKtExternalSyntheticLambda4 tabKtExternalSyntheticLambda4) {
        TabRowKtExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted = this.IAuthTabCallback.get();
        if (onwarmupcompleted == null || tabKtExternalSyntheticLambda4 == null) {
            return;
        }
        int callingPid = Binder.getCallingPid();
        int callingUid = Binder.getCallingUid();
        onwarmupcompleted.IAuthTabCallback.register(tabKtExternalSyntheticLambda4, new TabRowKtExternalSyntheticLambda10.onNavigationEvent("android.media.session.MediaController", callingPid, callingUid));
        synchronized (onwarmupcompleted.IAuthTabCallbackStub) {
            TabRowKtExternalSyntheticLambda0.asBinder asbinder = onwarmupcompleted.IAuthTabCallback_Parcel;
            if (asbinder != null) {
                asbinder.IAuthTabCallback(callingPid, callingUid);
            }
        }
    }

    public void onNavigationEvent(@Nullable TabKtExternalSyntheticLambda4 tabKtExternalSyntheticLambda4) {
        TabRowKtExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted = this.IAuthTabCallback.get();
        if (onwarmupcompleted == null || tabKtExternalSyntheticLambda4 == null) {
            return;
        }
        onwarmupcompleted.IAuthTabCallback.unregister(tabKtExternalSyntheticLambda4);
        int callingPid = Binder.getCallingPid();
        int callingUid = Binder.getCallingUid();
        synchronized (onwarmupcompleted.IAuthTabCallbackStub) {
            TabRowKtExternalSyntheticLambda0.asBinder asbinder = onwarmupcompleted.IAuthTabCallback_Parcel;
            if (asbinder != null) {
                asbinder.onNavigationEvent(callingPid, callingUid);
            }
        }
    }

    public String onTransact() {
        throw new AssertionError();
    }

    public Bundle IAuthTabCallbackStubProxy() {
        TabRowKtExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted = this.IAuthTabCallback.get();
        if (onwarmupcompleted == null || onwarmupcompleted.access100 == null) {
            return null;
        }
        return new Bundle(onwarmupcompleted.access100);
    }

    public String IAuthTabCallback_Parcel() {
        throw new AssertionError();
    }

    public PendingIntent onWarmupCompleted() {
        throw new AssertionError();
    }

    public long onNavigationEvent() {
        throw new AssertionError();
    }

    public TabRowKtExternalSyntheticLambda5 writeTypedObject() {
        throw new AssertionError();
    }

    public void onNavigationEvent(int i2, int i3, @Nullable String str) {
        throw new AssertionError();
    }

    public void onWarmupCompleted(int i2, int i3, @Nullable String str) {
        throw new AssertionError();
    }

    public void onActivityResized() {
        throw new AssertionError();
    }

    public void onWarmupCompleted(@Nullable String str, @Nullable Bundle bundle) {
        throw new AssertionError();
    }

    public void onExtraCallback(@Nullable String str, @Nullable Bundle bundle) {
        throw new AssertionError();
    }

    public void IAuthTabCallback(@Nullable Uri uri, @Nullable Bundle bundle) {
        throw new AssertionError();
    }

    public void onPostMessage() {
        throw new AssertionError();
    }

    public void IAuthTabCallback(@Nullable String str, @Nullable Bundle bundle) {
        throw new AssertionError();
    }

    public void onNavigationEvent(@Nullable String str, @Nullable Bundle bundle) {
        throw new AssertionError();
    }

    public void onExtraCallback(@Nullable Uri uri, @Nullable Bundle bundle) {
        throw new AssertionError();
    }

    public void onWarmupCompleted(long j) {
        throw new AssertionError();
    }

    public void onActivityLayout() {
        throw new AssertionError();
    }

    public void onRelationshipValidationResult() {
        throw new AssertionError();
    }

    public void ICustomTabsCallback() {
        throw new AssertionError();
    }

    public void onMinimized() {
        throw new AssertionError();
    }

    public void onExtraCallback() {
        throw new AssertionError();
    }

    public void onMessageChannelReady() {
        throw new AssertionError();
    }

    public void onExtraCallback(long j) {
        throw new AssertionError();
    }

    public void onExtraCallbackWithResult(@Nullable RatingCompat ratingCompat) {
        throw new AssertionError();
    }

    public void onWarmupCompleted(@Nullable RatingCompat ratingCompat, @Nullable Bundle bundle) {
        throw new AssertionError();
    }

    public void onNavigationEvent(float f) {
        throw new AssertionError();
    }

    public void onExtraCallbackWithResult(boolean z) {
        throw new AssertionError();
    }

    public void IAuthTabCallback(int i2) {
        throw new AssertionError();
    }

    public void onExtraCallbackWithResult(int i2) {
        throw new AssertionError();
    }

    public void onExtraCallbackWithResult(@Nullable String str, @Nullable Bundle bundle) {
        throw new AssertionError();
    }

    public TabRowKtExternalSyntheticLambda1 onExtraCallbackWithResult() {
        throw new AssertionError();
    }

    public TabRowKtExternalSyntheticLambda6 IAuthTabCallbackDefault() {
        TabRowKtExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted = this.IAuthTabCallback.get();
        if (onwarmupcompleted != null) {
            return TabRowKtExternalSyntheticLambda0.onExtraCallbackWithResult(onwarmupcompleted.asBinder, onwarmupcompleted.onTransact);
        }
        return null;
    }

    public void onExtraCallback(@Nullable TabRowDefaultsExternalSyntheticLambda3 tabRowDefaultsExternalSyntheticLambda3) {
        throw new AssertionError();
    }

    public void onWarmupCompleted(@Nullable TabRowDefaultsExternalSyntheticLambda3 tabRowDefaultsExternalSyntheticLambda3, int i2) {
        throw new AssertionError();
    }

    public void IAuthTabCallback(@Nullable TabRowDefaultsExternalSyntheticLambda3 tabRowDefaultsExternalSyntheticLambda3) {
        throw new AssertionError();
    }

    public void onExtraCallback(int i2) {
        throw new AssertionError();
    }

    public CharSequence asInterface() {
        throw new AssertionError();
    }

    public Bundle IAuthTabCallback() {
        throw new AssertionError();
    }

    public int access100() {
        TabRowKtExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted = this.IAuthTabCallback.get();
        if (onwarmupcompleted != null) {
            return onwarmupcompleted.IAuthTabCallbackDefault;
        }
        return 0;
    }

    public boolean extraCallback() {
        TabRowKtExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted = this.IAuthTabCallback.get();
        return onwarmupcompleted != null && onwarmupcompleted.onWarmupCompleted;
    }

    public int ae_() {
        TabRowKtExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted = this.IAuthTabCallback.get();
        if (onwarmupcompleted != null) {
            return onwarmupcompleted.getInterfaceDescriptor;
        }
        return -1;
    }

    public int access000() {
        TabRowKtExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted = this.IAuthTabCallback.get();
        if (onwarmupcompleted != null) {
            return onwarmupcompleted.extraCallback;
        }
        return -1;
    }

    public boolean extraCallbackWithResult() {
        throw new AssertionError();
    }
}
