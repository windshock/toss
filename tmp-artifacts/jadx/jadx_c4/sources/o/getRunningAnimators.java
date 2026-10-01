package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleEventObserver;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getRunningAnimators implements matchNames<Object> {
    private final Object onExtraCallback = new Object();
    private final View onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private volatile Object onWarmupCompleted;

    public interface onExtraCallback {
        GhostViewPort onNavigationEvent();
    }

    public interface onWarmupCompleted {
        RectEvaluator onWarmupCompleted();
    }

    public getRunningAnimators(View view, boolean z) {
        this.onExtraCallbackWithResult = view;
        this.onNavigationEvent = z;
    }

    @Override // o.matchNames
    public Object generatedComponent() {
        if (this.onWarmupCompleted == null) {
            synchronized (this.onExtraCallback) {
                if (this.onWarmupCompleted == null) {
                    this.onWarmupCompleted = onExtraCallback();
                }
            }
        }
        return this.onWarmupCompleted;
    }

    private Object onExtraCallback() {
        matchNames<?> matchnamesOnExtraCallback = onExtraCallback(false);
        if (this.onNavigationEvent) {
            return ((onWarmupCompleted) setSlingshotDistance.onNavigationEvent(matchnamesOnExtraCallback, onWarmupCompleted.class)).onWarmupCompleted().IAuthTabCallback(this.onExtraCallbackWithResult).IAuthTabCallback();
        }
        return ((onExtraCallback) setSlingshotDistance.onNavigationEvent(matchnamesOnExtraCallback, onExtraCallback.class)).onNavigationEvent().onExtraCallbackWithResult(this.onExtraCallbackWithResult).onNavigationEvent();
    }

    private matchNames<?> onExtraCallback(boolean z) {
        if (this.onNavigationEvent) {
            Context contextOnExtraCallback = onExtraCallback(onNavigationEvent.class, z);
            if (contextOnExtraCallback instanceof onNavigationEvent) {
                return ((onNavigationEvent) contextOnExtraCallback).onNavigationEvent();
            }
            if (z) {
                return null;
            }
            runAnimator.IAuthTabCallback(!(r4 instanceof matchNames), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.onExtraCallbackWithResult.getClass(), onExtraCallback(matchNames.class, z).getClass().getName());
        } else {
            Object objOnExtraCallback = onExtraCallback(matchNames.class, z);
            if (objOnExtraCallback instanceof matchNames) {
                return (matchNames) objOnExtraCallback;
            }
            if (z) {
                return null;
            }
        }
        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", this.onExtraCallbackWithResult.getClass()));
    }

    private Context onExtraCallback(Class<?> cls, boolean z) {
        Context contextOnExtraCallbackWithResult = onExtraCallbackWithResult(this.onExtraCallbackWithResult.getContext(), cls);
        if (contextOnExtraCallbackWithResult != FragmentTransitionSupport.IAuthTabCallback(contextOnExtraCallbackWithResult.getApplicationContext())) {
            return contextOnExtraCallbackWithResult;
        }
        runAnimator.IAuthTabCallback(z, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.onExtraCallbackWithResult.getClass());
        return null;
    }

    private static Context onExtraCallbackWithResult(Context context, Class<?> cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static final class onNavigationEvent extends ContextWrapper {
        private LayoutInflater onExtraCallback;
        private LayoutInflater onExtraCallbackWithResult;
        private Fragment onNavigationEvent;
        private final LifecycleEventObserver onWarmupCompleted;

        onNavigationEvent(Context context, Fragment fragment) {
            super((Context) runAnimator.onExtraCallback(context));
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1
                public void onStateChanged(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
                    if (onextracallbackwithresult == TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_DESTROY) {
                        this.onExtraCallback.onNavigationEvent = null;
                        this.onExtraCallback.onExtraCallback = null;
                        this.onExtraCallback.onExtraCallbackWithResult = null;
                    }
                }
            };
            this.onWarmupCompleted = lifecycleEventObserver;
            this.onExtraCallback = null;
            Fragment fragment2 = (Fragment) runAnimator.onExtraCallback(fragment);
            this.onNavigationEvent = fragment2;
            fragment2.getLifecycle().IAuthTabCallback(lifecycleEventObserver);
        }

        onNavigationEvent(LayoutInflater layoutInflater, Fragment fragment) {
            super((Context) runAnimator.onExtraCallback(((LayoutInflater) runAnimator.onExtraCallback(layoutInflater)).getContext()));
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1
                public void onStateChanged(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
                    if (onextracallbackwithresult == TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_DESTROY) {
                        this.onExtraCallback.onNavigationEvent = null;
                        this.onExtraCallback.onExtraCallback = null;
                        this.onExtraCallback.onExtraCallbackWithResult = null;
                    }
                }
            };
            this.onWarmupCompleted = lifecycleEventObserver;
            this.onExtraCallback = layoutInflater;
            Fragment fragment2 = (Fragment) runAnimator.onExtraCallback(fragment);
            this.onNavigationEvent = fragment2;
            fragment2.getLifecycle().IAuthTabCallback(lifecycleEventObserver);
        }

        Fragment onNavigationEvent() {
            runAnimator.onExtraCallbackWithResult(this.onNavigationEvent, "The fragment has already been destroyed.");
            return this.onNavigationEvent;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.onExtraCallbackWithResult == null) {
                if (this.onExtraCallback == null) {
                    this.onExtraCallback = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.onExtraCallbackWithResult = this.onExtraCallback.cloneInContext(this);
            }
            return this.onExtraCallbackWithResult;
        }

        @Override // android.content.ContextWrapper
        public void attachBaseContext(Context context) {
            super.attachBaseContext(context);
        }
    }
}
