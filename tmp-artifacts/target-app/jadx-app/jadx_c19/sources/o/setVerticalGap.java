package o;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class setVerticalGap extends Fragment {
    private final RequestManagerTreeNode IAuthTabCallback;
    private setVerticalGap asInterface;
    private final Set<setVerticalGap> onExtraCallback;
    private final setHorizontalStyle onExtraCallbackWithResult;
    private RequestManager onNavigationEvent;
    private Fragment onWarmupCompleted;

    public setVerticalGap() {
        this(new setHorizontalStyle());
    }

    public setVerticalGap(@NonNull setHorizontalStyle sethorizontalstyle) {
        this.IAuthTabCallback = new IAuthTabCallback();
        this.onExtraCallback = new HashSet();
        this.onExtraCallbackWithResult = sethorizontalstyle;
    }

    public void IAuthTabCallback(@Nullable RequestManager requestManager) {
        this.onNavigationEvent = requestManager;
    }

    public setHorizontalStyle onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public RequestManager IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public RequestManagerTreeNode onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    private void IAuthTabCallback(setVerticalGap setverticalgap) {
        this.onExtraCallback.add(setverticalgap);
    }

    private void onNavigationEvent(setVerticalGap setverticalgap) {
        this.onExtraCallback.remove(setverticalgap);
    }

    Set<setVerticalGap> onExtraCallback() {
        setVerticalGap setverticalgap = this.asInterface;
        if (setverticalgap == null) {
            return Collections.EMPTY_SET;
        }
        if (equals(setverticalgap)) {
            return Collections.unmodifiableSet(this.onExtraCallback);
        }
        HashSet hashSet = new HashSet();
        for (setVerticalGap setverticalgap2 : this.asInterface.onExtraCallback()) {
            if (onNavigationEvent(setverticalgap2.onNavigationEvent())) {
                hashSet.add(setverticalgap2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public void onExtraCallbackWithResult(@Nullable Fragment fragment) {
        FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3OnWarmupCompleted;
        this.onWarmupCompleted = fragment;
        if (fragment == null || fragment.getContext() == null || (flowMeasureLazyPolicyExternalSyntheticLambda3OnWarmupCompleted = onWarmupCompleted(fragment)) == null) {
            return;
        }
        onExtraCallbackWithResult(fragment.getContext(), flowMeasureLazyPolicyExternalSyntheticLambda3OnWarmupCompleted);
    }

    private static FlowMeasureLazyPolicyExternalSyntheticLambda3 onWarmupCompleted(@NonNull Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    private Fragment onNavigationEvent() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.onWarmupCompleted;
    }

    private boolean onNavigationEvent(@NonNull Fragment fragment) {
        Fragment fragmentOnNavigationEvent = onNavigationEvent();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(fragmentOnNavigationEvent)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void onExtraCallbackWithResult(@NonNull Context context, @NonNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3) {
        IAuthTabCallbackStub();
        setVerticalGap setverticalgapOnExtraCallback = Glide.onNavigationEvent(context).IAuthTabCallbackDefault().onExtraCallback(flowMeasureLazyPolicyExternalSyntheticLambda3);
        this.asInterface = setverticalgapOnExtraCallback;
        if (equals(setverticalgapOnExtraCallback)) {
            return;
        }
        this.asInterface.IAuthTabCallback(this);
    }

    private void IAuthTabCallbackStub() {
        setVerticalGap setverticalgap = this.asInterface;
        if (setverticalgap != null) {
            setverticalgap.onNavigationEvent(this);
            this.asInterface = null;
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3OnWarmupCompleted = onWarmupCompleted(this);
        if (flowMeasureLazyPolicyExternalSyntheticLambda3OnWarmupCompleted == null) {
            Log.isLoggable("SupportRMFragment", 5);
        } else {
            try {
                onExtraCallbackWithResult(getContext(), flowMeasureLazyPolicyExternalSyntheticLambda3OnWarmupCompleted);
            } catch (IllegalStateException unused) {
            }
        }
    }

    public void onDetach() {
        super.onDetach();
        this.onWarmupCompleted = null;
        IAuthTabCallbackStub();
    }

    public void onStart() {
        super.onStart();
        this.onExtraCallbackWithResult.onExtraCallback();
    }

    public void onStop() {
        super.onStop();
        this.onExtraCallbackWithResult.onExtraCallbackWithResult();
    }

    public void onDestroy() {
        super.onDestroy();
        this.onExtraCallbackWithResult.onWarmupCompleted();
        IAuthTabCallbackStub();
    }

    public String toString() {
        return super.toString() + "{parent=" + onNavigationEvent() + "}";
    }

    class IAuthTabCallback implements RequestManagerTreeNode {
        IAuthTabCallback() {
        }

        @Override // com.bumptech.glide.manager.RequestManagerTreeNode
        public Set<RequestManager> onExtraCallback() {
            Set<setVerticalGap> setOnExtraCallback = setVerticalGap.this.onExtraCallback();
            HashSet hashSet = new HashSet(setOnExtraCallback.size());
            for (setVerticalGap setverticalgap : setOnExtraCallback) {
                if (setverticalgap.IAuthTabCallback() != null) {
                    hashSet.add(setverticalgap.IAuthTabCallback());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + setVerticalGap.this + "}";
        }
    }
}
