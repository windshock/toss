package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.uikit.widget.TdsResultV0View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMP_Revoke_RrRp implements SearchBarKtExternalSyntheticLambda5 {
    private final TdsResultV0View onExtraCallback;

    private UST_CMP_Revoke_RrRp(@NonNull TdsResultV0View tdsResultV0View) {
        this.onExtraCallback = tdsResultV0View;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public TdsResultV0View getRoot() {
        return this.onExtraCallback;
    }

    public static UST_CMP_Revoke_RrRp IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_tds_result_v0, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static UST_CMP_Revoke_RrRp onNavigationEvent(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new UST_CMP_Revoke_RrRp((TdsResultV0View) view);
    }
}
