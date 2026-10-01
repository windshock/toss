package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.ui.PlayerView;
import im.toss.ads_sdk.R;
import im.toss.tds.view.component.atom.image.TdsImageView;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setViewPagerObserver implements SearchBarKtExternalSyntheticLambda5 {
    private static int asBinder = 1;
    private static int asInterface;
    public final ConstraintLayout IAuthTabCallback;
    public final PlayerView onExtraCallback;
    public final TdsImageView onExtraCallbackWithResult;
    public final View onNavigationEvent;
    private final View onTransact;
    public final TdsImageView onWarmupCompleted;

    private setViewPagerObserver(@NonNull View view, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2, @NonNull ConstraintLayout constraintLayout, @NonNull PlayerView playerView, @NonNull View view2) {
        this.onTransact = view;
        this.onExtraCallbackWithResult = tdsImageView;
        this.onWarmupCompleted = tdsImageView2;
        this.IAuthTabCallback = constraintLayout;
        this.onExtraCallback = playerView;
        this.onNavigationEvent = view2;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        View view = this.onTransact;
        int i5 = i3 + 107;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r3 = null;
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        throw new java.lang.NullPointerException("parent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r3.inflate(im.toss.ads_sdk.R.layout.ads_sdk_view_short_player, r4);
        r3 = onWarmupCompleted(r4);
        r4 = o.setViewPagerObserver.asInterface + 59;
        o.setViewPagerObserver.asBinder = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if ((r4 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static setViewPagerObserver IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 80 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[PHI: r2
      0x0053: PHI (r2v7 com.google.android.exoplayer2.ui.PlayerView) = (r2v6 com.google.android.exoplayer2.ui.PlayerView), (r2v10 com.google.android.exoplayer2.ui.PlayerView) binds: [B:16:0x0051, B:13:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static setViewPagerObserver onWarmupCompleted(@NonNull View view) {
        TdsImageView tdsImageViewOnNavigationEvent;
        ConstraintLayout constraintLayoutOnNavigationEvent;
        PlayerView playerViewOnNavigationEvent;
        int i = 2 % 2;
        int i2 = asBinder + 21;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.id.iv_start;
            TdsImageView tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
            if (tdsImageViewOnNavigationEvent2 != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.iv_thumbnail))) != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.layout_start))) != null) {
                int i4 = asInterface + 77;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    i3 = R.id.playerView;
                    playerViewOnNavigationEvent = (PlayerView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                    int i5 = 78 / 0;
                    if (playerViewOnNavigationEvent != null) {
                        PlayerView playerView = playerViewOnNavigationEvent;
                        i3 = R.id.view_dim;
                        View viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                        if (viewOnNavigationEvent != null) {
                            setViewPagerObserver setviewpagerobserver = new setViewPagerObserver(view, tdsImageViewOnNavigationEvent2, tdsImageViewOnNavigationEvent, constraintLayoutOnNavigationEvent, playerView, viewOnNavigationEvent);
                            int i6 = asBinder + 93;
                            asInterface = i6 % 128;
                            int i7 = i6 % 2;
                            return setviewpagerobserver;
                        }
                    }
                } else {
                    i3 = R.id.playerView;
                    playerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                    if (playerViewOnNavigationEvent != null) {
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.iv_start);
        throw null;
    }
}
