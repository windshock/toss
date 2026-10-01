package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.home.presentation.legacy_transaction_list.R;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class scanOuterJumpIntercept implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final ConstraintLayout onExtraCallback;
    public final TdsListHeaderV3View onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback();
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayoutOnExtraCallback = onExtraCallback();
        int i3 = onNavigationEvent + 63;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return constraintLayoutOnExtraCallback;
        }
        throw null;
    }

    private scanOuterJumpIntercept(@NonNull ConstraintLayout constraintLayout, @NonNull TdsListHeaderV3View tdsListHeaderV3View) {
        this.onExtraCallback = constraintLayout;
        this.onWarmupCompleted = tdsListHeaderV3View;
    }

    public ConstraintLayout onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 9;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.onExtraCallback;
        int i5 = i2 + 7;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return constraintLayout;
    }

    public static scanOuterJumpIntercept IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.home_presentation_legacy_transaction_list_item_transaction_list_header, viewGroup, false);
        if (z) {
            int i2 = onNavigationEvent + 109;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                viewGroup.addView(viewInflate);
            } else {
                viewGroup.addView(viewInflate);
                throw null;
            }
        }
        scanOuterJumpIntercept scanouterjumpinterceptOnWarmupCompleted = onWarmupCompleted(viewInflate);
        int i3 = IAuthTabCallback + 105;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return scanouterjumpinterceptOnWarmupCompleted;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(r4.getResources().getResourceName(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = new o.scanOuterJumpIntercept((androidx.constraintlayout.widget.ConstraintLayout) r4, r2);
        r4 = o.scanOuterJumpIntercept.onNavigationEvent + 31;
        o.scanOuterJumpIntercept.IAuthTabCallback = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static scanOuterJumpIntercept onWarmupCompleted(@NonNull View view) {
        int i;
        TdsListHeaderV3View tdsListHeaderV3ViewOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 71;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.id.listHeader;
            tdsListHeaderV3ViewOnNavigationEvent = (TdsListHeaderV3View) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            int i4 = 77 / 0;
        } else {
            i = R.id.listHeader;
            tdsListHeaderV3ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        }
    }
}
