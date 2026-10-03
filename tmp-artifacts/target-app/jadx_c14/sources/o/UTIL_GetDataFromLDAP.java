package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UTIL_GetDataFromLDAP implements SearchBarKtExternalSyntheticLambda5 {
    public final FrameLayout onExtraCallback;
    private final FrameLayout onExtraCallbackWithResult;

    private UTIL_GetDataFromLDAP(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.onExtraCallbackWithResult = frameLayout;
        this.onExtraCallback = frameLayout2;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.onExtraCallbackWithResult;
    }

    public static UTIL_GetDataFromLDAP onExtraCallback(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new UTIL_GetDataFromLDAP(frameLayout, frameLayout);
    }
}
