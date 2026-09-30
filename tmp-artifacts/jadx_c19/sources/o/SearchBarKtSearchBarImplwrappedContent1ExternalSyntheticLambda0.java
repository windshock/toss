package o;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SearchBarKtSearchBarImplwrappedContent1ExternalSyntheticLambda0 implements ViewPager2.onExtraCallbackWithResult {
    private final int onWarmupCompleted;

    public SearchBarKtSearchBarImplwrappedContent1ExternalSyntheticLambda0(int i2) {
        setCardElevation.onWarmupCompleted(i2, "Margin must be non-negative");
        this.onWarmupCompleted = i2;
    }

    public void transformPage(@NonNull View view, float f) {
        ViewPager2 viewPager2IAuthTabCallback = IAuthTabCallback(view);
        float f2 = this.onWarmupCompleted * f;
        if (viewPager2IAuthTabCallback.IAuthTabCallbackDefault() == 0) {
            if (viewPager2IAuthTabCallback.IAuthTabCallbackStubProxy()) {
                f2 = -f2;
            }
            view.setTranslationX(f2);
            return;
        }
        view.setTranslationY(f2);
    }

    private ViewPager2 IAuthTabCallback(@NonNull View view) {
        ViewParent parent = view.getParent();
        ViewPager2 parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }
}
