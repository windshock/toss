package o;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.lifecycle.RetainedLifecycleImpl;
import java.io.Closeable;
import java.util.Map;
import javax.inject.Provider;
import kotlin.jvm.functions.Function1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addUnmatched implements ViewModelProvider.onWarmupCompleted {
    public static final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.IAuthTabCallback<Function1<Object, ViewModel>> onExtraCallbackWithResult = new AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.IAuthTabCallback<Function1<Object, ViewModel>>() { // from class: o.addUnmatched.5
    };
    private final ViewModelProvider.onWarmupCompleted onExtraCallback;
    private final Map<Class<?>, Boolean> onNavigationEvent;
    private final ViewModelProvider.onWarmupCompleted onWarmupCompleted;

    public interface IAuthTabCallback {
        Map<Class<?>, Provider<ViewModel>> onNavigationEvent();

        Map<Class<?>, Object> onWarmupCompleted();
    }

    interface onExtraCallbackWithResult {
        Map<Class<?>, Boolean> onExtraCallbackWithResult();

        GhostViewHolder onWarmupCompleted();
    }

    public addUnmatched(@NonNull Map<Class<?>, Boolean> map, @NonNull ViewModelProvider.onWarmupCompleted onwarmupcompleted, @NonNull final GhostViewHolder ghostViewHolder) {
        this.onNavigationEvent = map;
        this.onWarmupCompleted = onwarmupcompleted;
        this.onExtraCallback = new ViewModelProvider.onWarmupCompleted() { // from class: o.addUnmatched.1
            public <T extends ViewModel> T create(@NonNull Class<T> cls, @NonNull AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) {
                final RetainedLifecycleImpl retainedLifecycleImpl = new RetainedLifecycleImpl();
                T t = (T) IAuthTabCallback(ghostViewHolder.onNavigationEvent(TextLinkScopeExternalSyntheticLambda8.IAuthTabCallback(androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2)).onExtraCallbackWithResult(retainedLifecycleImpl).IAuthTabCallback(), cls, androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2);
                t.addCloseable(new Closeable() { // from class: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$2$$ExternalSyntheticLambda0
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        retainedLifecycleImpl.onExtraCallbackWithResult();
                    }
                });
                return t;
            }

            private <T extends ViewModel> T IAuthTabCallback(@NonNull ResponseKeys responseKeys, @NonNull Class<T> cls, @NonNull AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) {
                Provider<ViewModel> provider = ((IAuthTabCallback) setSlingshotDistance.onNavigationEvent(responseKeys, IAuthTabCallback.class)).onNavigationEvent().get(cls);
                Function1 function1 = (Function1) androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onWarmupCompleted(addUnmatched.onExtraCallbackWithResult);
                Object obj = ((IAuthTabCallback) setSlingshotDistance.onNavigationEvent(responseKeys, IAuthTabCallback.class)).onWarmupCompleted().get(cls);
                if (obj == null) {
                    if (function1 != null) {
                        throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    }
                    if (provider == null) {
                        throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                    }
                    return (T) provider.get();
                }
                if (provider != null) {
                    throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                }
                if (function1 == null) {
                    throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                }
                return (T) function1.invoke(obj);
            }
        };
    }

    public <T extends ViewModel> T create(@NonNull Class<T> cls, @NonNull AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) {
        if (this.onNavigationEvent.containsKey(cls)) {
            return (T) this.onExtraCallback.create(cls, androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2);
        }
        return (T) this.onWarmupCompleted.create(cls, androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2);
    }

    public <T extends ViewModel> T create(@NonNull Class<T> cls) {
        if (this.onNavigationEvent.containsKey(cls)) {
            return (T) this.onExtraCallback.create(cls);
        }
        return (T) this.onWarmupCompleted.create(cls);
    }

    public static ViewModelProvider.onWarmupCompleted onExtraCallbackWithResult(@NonNull Activity activity, @NonNull ViewModelProvider.onWarmupCompleted onwarmupcompleted) {
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) setSlingshotDistance.onNavigationEvent(activity, onExtraCallbackWithResult.class);
        return new addUnmatched(onextracallbackwithresult.onExtraCallbackWithResult(), onwarmupcompleted, onextracallbackwithresult.onWarmupCompleted());
    }
}
