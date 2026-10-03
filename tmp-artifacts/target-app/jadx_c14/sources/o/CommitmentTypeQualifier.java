package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CommitmentTypeQualifier {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(View view) {
        View childAt;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        int bottom = (viewGroup == null || (childAt = viewGroup.getChildAt(0)) == null) ? view.getBottom() : childAt.getBottom();
        if (view instanceof NestedScrollView) {
            ((NestedScrollView) view).onExtraCallback(0, bottom);
        } else if (view instanceof ScrollView) {
            ((ScrollView) view).smoothScrollTo(0, bottom);
        } else {
            view.scrollTo(0, bottom);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onWarmupCompleted(View view) {
        View childAt;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        return (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom() > 0 && ((viewGroup == null || (childAt = viewGroup.getChildAt(0)) == null) ? 0 : childAt.getHeight()) > 0;
    }
}
