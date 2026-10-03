package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class makeIrIp implements SearchBarKtExternalSyntheticLambda5 {
    private final TdsListHeaderV2View onWarmupCompleted;

    private makeIrIp(@NonNull TdsListHeaderV2View tdsListHeaderV2View) {
        this.onWarmupCompleted = tdsListHeaderV2View;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public TdsListHeaderV2View getRoot() {
        return this.onWarmupCompleted;
    }

    public static makeIrIp onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_tds_list_header_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static makeIrIp onExtraCallback(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new makeIrIp((TdsListHeaderV2View) view);
    }
}
