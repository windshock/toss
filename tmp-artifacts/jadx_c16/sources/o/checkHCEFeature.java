package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.features.benefit.R;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import im.toss.tds.view.component.widget.TdsRoundLayout;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class checkHCEFeature implements SearchBarKtExternalSyntheticLambda5 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final FrameLayout IAuthTabCallback;
    public final TdsRoundLayout onNavigationEvent;
    public final TdsListHeaderV3View onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent();
        }
        onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private checkHCEFeature(@NonNull FrameLayout frameLayout, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull TdsListHeaderV3View tdsListHeaderV3View) {
        this.IAuthTabCallback = frameLayout;
        this.onNavigationEvent = tdsRoundLayout;
        this.onWarmupCompleted = tdsListHeaderV3View;
    }

    public FrameLayout onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
      0x0021: PHI (r3v4 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static checkHCEFeature onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            viewInflate = layoutInflater.inflate(R.layout.benefit_section_title, viewGroup, true);
            if (z) {
                int i3 = onExtraCallback + 61;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                viewGroup.addView(viewInflate);
                int i5 = onExtraCallbackWithResult + 33;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            viewInflate = layoutInflater.inflate(R.layout.benefit_section_title, viewGroup, false);
            if (z) {
            }
        }
        return IAuthTabCallback(viewInflate);
    }

    public static checkHCEFeature IAuthTabCallback(@NonNull View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.cardRoundLayout;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
        if (tdsRoundLayoutOnNavigationEvent != null) {
            int i5 = onExtraCallback + 5;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                i4 = R.id.listHeader;
                TdsListHeaderV3View tdsListHeaderV3ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                if (tdsListHeaderV3ViewOnNavigationEvent != null) {
                    checkHCEFeature checkhcefeature = new checkHCEFeature((FrameLayout) view, tdsRoundLayoutOnNavigationEvent, tdsListHeaderV3ViewOnNavigationEvent);
                    int i6 = onExtraCallback + 5;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 16 / 0;
                    }
                    return checkhcefeature;
                }
            } else {
                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.listHeader);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
