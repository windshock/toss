package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentContainerView;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMS_GetCertWithSignedData implements SearchBarKtExternalSyntheticLambda5 {
    private final FragmentContainerView IAuthTabCallback;
    public final FragmentContainerView onWarmupCompleted;

    private CMS_GetCertWithSignedData(@NonNull FragmentContainerView fragmentContainerView, @NonNull FragmentContainerView fragmentContainerView2) {
        this.IAuthTabCallback = fragmentContainerView;
        this.onWarmupCompleted = fragmentContainerView2;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public FragmentContainerView getRoot() {
        return this.IAuthTabCallback;
    }

    public static CMS_GetCertWithSignedData onWarmupCompleted(@NonNull LayoutInflater layoutInflater) {
        return IAuthTabCallback(layoutInflater, null, false);
    }

    public static CMS_GetCertWithSignedData IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_transfer_receiver_tab, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static CMS_GetCertWithSignedData onNavigationEvent(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
        return new CMS_GetCertWithSignedData(fragmentContainerView, fragmentContainerView);
    }
}
