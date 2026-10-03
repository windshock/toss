package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class makePOPOTbsMsg implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsListRowV1View onExtraCallback;
    private final TdsListRowV1View onExtraCallbackWithResult;

    private makePOPOTbsMsg(@NonNull TdsListRowV1View tdsListRowV1View, @NonNull TdsListRowV1View tdsListRowV1View2) {
        this.onExtraCallbackWithResult = tdsListRowV1View;
        this.onExtraCallback = tdsListRowV1View2;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public TdsListRowV1View getRoot() {
        return this.onExtraCallbackWithResult;
    }

    public static makePOPOTbsMsg onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_tds_list_row_v1, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static makePOPOTbsMsg IAuthTabCallback(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) view;
        return new makePOPOTbsMsg(tdsListRowV1View, tdsListRowV1View);
    }
}
