package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.feature.credit.ui.main.R;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class access800 implements SearchBarKtExternalSyntheticLambda5 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final LinearLayout IAuthTabCallback;
    public final FrameLayout onNavigationEvent;
    public final RecyclerView onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LinearLayout linearLayoutOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i3 = onExtraCallbackWithResult + 101;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 66 / 0;
        }
        return linearLayoutOnExtraCallbackWithResult;
    }

    private access800(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView) {
        this.IAuthTabCallback = linearLayout;
        this.onNavigationEvent = frameLayout;
        this.onWarmupCompleted = recyclerView;
    }

    public LinearLayout onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        LinearLayout linearLayout = this.IAuthTabCallback;
        int i5 = i3 + 121;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return linearLayout;
    }

    public static access800 onExtraCallbackWithResult(@NonNull View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.header;
        FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
        if (frameLayout != null) {
            int i5 = onExtraCallbackWithResult + 99;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.recyclerView);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i4 = R.id.recyclerView;
            RecyclerView recyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
            if (recyclerViewOnNavigationEvent != null) {
                access800 access800Var = new access800((LinearLayout) view, frameLayout, recyclerViewOnNavigationEvent);
                int i6 = onExtraCallbackWithResult + 1;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return access800Var;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
