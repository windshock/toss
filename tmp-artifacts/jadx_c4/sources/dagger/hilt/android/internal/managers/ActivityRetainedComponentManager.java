package dagger.hilt.android.internal.managers;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.lifecycle.RetainedLifecycleImpl;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.Response;
import o.TracingReceiverExternalSyntheticLambda0;
import o.isValidMatch;
import o.matchNames;
import o.nativeVersion;
import o.setRefreshing;
import o.setSlingshotDistance;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ActivityRetainedComponentManager implements matchNames<TracingReceiverExternalSyntheticLambda0> {
    private volatile TracingReceiverExternalSyntheticLambda0 IAuthTabCallback;
    private final Context onExtraCallback;
    private final Object onExtraCallbackWithResult = new Object();
    private final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 onWarmupCompleted;

    public interface IAuthTabCallback {
        nativeVersion onNavigationEvent();
    }

    public interface onExtraCallback {
        setRefreshing IAuthTabCallback();
    }

    static final class onExtraCallbackWithResult extends ViewModel {
        private final TracingReceiverExternalSyntheticLambda0 onNavigationEvent;
        private final isValidMatch onWarmupCompleted;

        onExtraCallbackWithResult(TracingReceiverExternalSyntheticLambda0 tracingReceiverExternalSyntheticLambda0, isValidMatch isvalidmatch) {
            this.onNavigationEvent = tracingReceiverExternalSyntheticLambda0;
            this.onWarmupCompleted = isvalidmatch;
        }

        TracingReceiverExternalSyntheticLambda0 IAuthTabCallback() {
            return this.onNavigationEvent;
        }

        isValidMatch onNavigationEvent() {
            return this.onWarmupCompleted;
        }

        public void onCleared() {
            super.onCleared();
            ((RetainedLifecycleImpl) ((onExtraCallback) setSlingshotDistance.onNavigationEvent(this.onNavigationEvent, onExtraCallback.class)).IAuthTabCallback()).onExtraCallbackWithResult();
        }
    }

    public ActivityRetainedComponentManager(ComponentActivity componentActivity) {
        this.onWarmupCompleted = componentActivity;
        this.onExtraCallback = componentActivity;
    }

    private ViewModelProvider IAuthTabCallback(AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0, final Context context) {
        return new ViewModelProvider(androidTextContextMenuToolbarProviderExternalSyntheticLambda0, new ViewModelProvider.onWarmupCompleted() { // from class: dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.2
            public <T extends ViewModel> T create(@NonNull Class<T> cls, AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) {
                isValidMatch isvalidmatch = new isValidMatch(androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2);
                return new onExtraCallbackWithResult(((IAuthTabCallback) Response.onExtraCallback(context, IAuthTabCallback.class)).onNavigationEvent().IAuthTabCallback(isvalidmatch).onExtraCallbackWithResult(), isvalidmatch);
            }
        });
    }

    @Override // o.matchNames
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public TracingReceiverExternalSyntheticLambda0 generatedComponent() {
        if (this.IAuthTabCallback == null) {
            synchronized (this.onExtraCallbackWithResult) {
                if (this.IAuthTabCallback == null) {
                    this.IAuthTabCallback = onExtraCallback();
                }
            }
        }
        return this.IAuthTabCallback;
    }

    public isValidMatch onNavigationEvent() {
        return ((onExtraCallbackWithResult) IAuthTabCallback(this.onWarmupCompleted, this.onExtraCallback).IAuthTabCallback(onExtraCallbackWithResult.class)).onNavigationEvent();
    }

    private TracingReceiverExternalSyntheticLambda0 onExtraCallback() {
        return ((onExtraCallbackWithResult) IAuthTabCallback(this.onWarmupCompleted, this.onExtraCallback).IAuthTabCallback(onExtraCallbackWithResult.class)).IAuthTabCallback();
    }

    public static abstract class LifecycleModule {
        LifecycleModule() {
        }

        public static setRefreshing onExtraCallbackWithResult() {
            return new RetainedLifecycleImpl();
        }
    }
}
