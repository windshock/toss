package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;
import im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography1;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.TdsProgressBarV0View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class issueCertificate_Close extends getRValue {
    private static final ViewDataBinding.onWarmupCompleted ICustomTabsCallback = null;
    private static final SparseIntArray onActivityResized;
    private final LinearLayout onActivityLayout;
    private long onPostMessage;

    public boolean IAuthTabCallback(int i, Object obj, int i2) {
        return false;
    }

    public boolean onExtraCallback(int i, @Nullable Object obj) {
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        onActivityResized = sparseIntArray;
        sparseIntArray.put(R.id.completedBanner, 1);
        sparseIntArray.put(R.id.titleText, 2);
        sparseIntArray.put(R.id.savingTogetherStatusLayout, 3);
        sparseIntArray.put(R.id.savingTogetherProfile1, 4);
        sparseIntArray.put(R.id.savingTogetherProfile2, 5);
        sparseIntArray.put(R.id.henemTogetherButton, 6);
        sparseIntArray.put(R.id.boxCoverImageView, 7);
        sparseIntArray.put(R.id.boxCoverTextView, 8);
        sparseIntArray.put(R.id.balanceLabel, 9);
        sparseIntArray.put(R.id.balance, 10);
        sparseIntArray.put(R.id.goalAmountText, 11);
        sparseIntArray.put(R.id.progressBadge, 12);
        sparseIntArray.put(R.id.henemProgress, 13);
        sparseIntArray.put(R.id.memoRow, 14);
        sparseIntArray.put(R.id.fangirlGroupRow, 15);
        sparseIntArray.put(R.id.trollBannerRow, 16);
    }

    public issueCertificate_Close(@Nullable ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, @NonNull View view) {
        this(contextMenuAreaKtExternalSyntheticLambda1, view, ViewDataBinding.IAuthTabCallback(contextMenuAreaKtExternalSyntheticLambda1, view, 17, ICustomTabsCallback, onActivityResized));
    }

    private issueCertificate_Close(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, Object[] objArr) {
        super(contextMenuAreaKtExternalSyntheticLambda1, view, 0, (TdsRollingNumberV1View) objArr[10], (Typography6) objArr[9], (TdsImageView) objArr[7], (Typography1) objArr[8], (TdsListRowV1View) objArr[1], (TdsListRowV1View) objArr[15], (Typography5) objArr[11], (TdsProgressBarV0View) objArr[13], (TdsTextButtonV0View) objArr[6], (TdsListRowV1View) objArr[14], (TdsBadgeV1View) objArr[12], (TdsImageView) objArr[4], (TdsImageView) objArr[5], (LinearLayout) objArr[3], (Typography1) objArr[2], (TdsListRowV1View) objArr[16]);
        this.onPostMessage = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.onActivityLayout = linearLayout;
        linearLayout.setTag(null);
        onWarmupCompleted(view);
        asBinder();
    }

    public void asBinder() {
        synchronized (this) {
            this.onPostMessage = 1L;
        }
        asInterface();
    }

    public boolean onWarmupCompleted() {
        synchronized (this) {
            return this.onPostMessage != 0;
        }
    }

    public void onNavigationEvent() {
        synchronized (this) {
            this.onPostMessage = 0L;
        }
    }
}
