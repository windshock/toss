package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.setHorizontalStyle;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RequestManagerFragment extends Fragment {
    private final Set<RequestManagerFragment> IAuthTabCallback;
    private RequestManagerFragment IAuthTabCallbackStub;
    private final RequestManagerTreeNode onExtraCallback;
    private Fragment onExtraCallbackWithResult;
    private final setHorizontalStyle onNavigationEvent;
    private RequestManager onWarmupCompleted;

    public RequestManagerFragment() {
        this(new setHorizontalStyle());
    }

    RequestManagerFragment(@NonNull setHorizontalStyle sethorizontalstyle) {
        this.onExtraCallback = new FragmentRequestManagerTreeNode();
        this.IAuthTabCallback = new HashSet();
        this.onNavigationEvent = sethorizontalstyle;
    }

    public void IAuthTabCallback(@Nullable RequestManager requestManager) {
        this.onWarmupCompleted = requestManager;
    }

    setHorizontalStyle onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public RequestManager onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public RequestManagerTreeNode onNavigationEvent() {
        return this.onExtraCallback;
    }

    private void IAuthTabCallback(RequestManagerFragment requestManagerFragment) {
        this.IAuthTabCallback.add(requestManagerFragment);
    }

    private void onExtraCallbackWithResult(RequestManagerFragment requestManagerFragment) {
        this.IAuthTabCallback.remove(requestManagerFragment);
    }

    Set<RequestManagerFragment> onExtraCallbackWithResult() {
        if (equals(this.IAuthTabCallbackStub)) {
            return Collections.unmodifiableSet(this.IAuthTabCallback);
        }
        if (this.IAuthTabCallbackStub == null) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet();
        for (RequestManagerFragment requestManagerFragment : this.IAuthTabCallbackStub.onExtraCallbackWithResult()) {
            if (IAuthTabCallback(requestManagerFragment.getParentFragment())) {
                hashSet.add(requestManagerFragment);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    void onWarmupCompleted(@Nullable Fragment fragment) {
        this.onExtraCallbackWithResult = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        onWarmupCompleted(fragment.getActivity());
    }

    private Fragment IAuthTabCallback() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.onExtraCallbackWithResult;
    }

    private boolean IAuthTabCallback(@NonNull Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void onWarmupCompleted(@NonNull Activity activity) {
        onTransact();
        RequestManagerFragment requestManagerFragmentOnExtraCallbackWithResult = Glide.onNavigationEvent(activity).IAuthTabCallbackDefault().onExtraCallbackWithResult(activity);
        this.IAuthTabCallbackStub = requestManagerFragmentOnExtraCallbackWithResult;
        if (equals(requestManagerFragmentOnExtraCallbackWithResult)) {
            return;
        }
        this.IAuthTabCallbackStub.IAuthTabCallback(this);
    }

    private void onTransact() {
        RequestManagerFragment requestManagerFragment = this.IAuthTabCallbackStub;
        if (requestManagerFragment != null) {
            requestManagerFragment.onExtraCallbackWithResult(this);
            this.IAuthTabCallbackStub = null;
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            onWarmupCompleted(activity);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        onTransact();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.onNavigationEvent.onExtraCallback();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.onNavigationEvent.onExtraCallbackWithResult();
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.onNavigationEvent.onWarmupCompleted();
        onTransact();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + IAuthTabCallback() + "}";
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    class FragmentRequestManagerTreeNode implements RequestManagerTreeNode {
        FragmentRequestManagerTreeNode() {
        }

        @Override // com.bumptech.glide.manager.RequestManagerTreeNode
        public Set<RequestManager> onExtraCallback() {
            Set<RequestManagerFragment> setOnExtraCallbackWithResult = RequestManagerFragment.this.onExtraCallbackWithResult();
            HashSet hashSet = new HashSet(setOnExtraCallbackWithResult.size());
            for (RequestManagerFragment requestManagerFragment : setOnExtraCallbackWithResult) {
                if (requestManagerFragment.onExtraCallback() != null) {
                    hashSet.add(requestManagerFragment.onExtraCallback());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + RequestManagerFragment.this + "}";
        }
    }
}
