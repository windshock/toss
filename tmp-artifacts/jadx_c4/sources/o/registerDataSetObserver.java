package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import im.toss.ads_sdk.R;
import im.toss.ads_sdk.ui.view.AdsCircularProgressBar;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.gradient.TdsRadialGradientView;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class registerDataSetObserver implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    public final TdsImageView IAuthTabCallback;
    public final Typography5 asInterface;
    public final TdsRoundLayout onExtraCallback;
    public final TdsRadialGradientView onExtraCallbackWithResult;
    public final AdsCircularProgressBar onNavigationEvent;
    private final View onTransact;
    public final Typography5 onWarmupCompleted;

    private registerDataSetObserver(@NonNull View view, @NonNull TdsRadialGradientView tdsRadialGradientView, @NonNull TdsImageView tdsImageView, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull AdsCircularProgressBar adsCircularProgressBar, @NonNull Typography5 typography5, @NonNull Typography5 typography52) {
        this.onTransact = view;
        this.onExtraCallbackWithResult = tdsRadialGradientView;
        this.IAuthTabCallback = tdsImageView;
        this.onExtraCallback = tdsRoundLayout;
        this.onNavigationEvent = adsCircularProgressBar;
        this.onWarmupCompleted = typography5;
        this.asInterface = typography52;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 103;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        View view = this.onTransact;
        int i5 = i2 + 39;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return view;
        }
        throw null;
    }

    public static registerDataSetObserver onNavigationEvent(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        registerDataSetObserver registerdatasetobserverOnExtraCallback;
        int i = 2 % 2;
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        int i2 = IAuthTabCallbackDefault + 59;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            layoutInflater.inflate(R.layout.ads_sdk_view_circular_countdown, viewGroup);
            registerdatasetobserverOnExtraCallback = onExtraCallback(viewGroup);
            int i3 = 18 / 0;
        } else {
            layoutInflater.inflate(R.layout.ads_sdk_view_circular_countdown, viewGroup);
            registerdatasetobserverOnExtraCallback = onExtraCallback(viewGroup);
        }
        int i4 = IAuthTabCallbackDefault + 115;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return registerdatasetobserverOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r2
      0x0027: PHI (r2v3 im.toss.uikit.gradient.TdsRadialGradientView) = (r2v2 im.toss.uikit.gradient.TdsRadialGradientView), (r2v12 im.toss.uikit.gradient.TdsRadialGradientView) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static registerDataSetObserver onExtraCallback(@NonNull View view) {
        int i;
        TdsRadialGradientView tdsRadialGradientViewOnNavigationEvent;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        Typography5 typography5OnNavigationEvent;
        Typography5 typography5OnNavigationEvent2;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 83;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.id.bg_gradient_view;
            tdsRadialGradientViewOnNavigationEvent = (TdsRadialGradientView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            int i4 = 65 / 0;
            if (tdsRadialGradientViewOnNavigationEvent != null) {
                TdsRadialGradientView tdsRadialGradientView = tdsRadialGradientViewOnNavigationEvent;
                int i5 = IAuthTabCallbackDefault + 31;
                asBinder = i5 % 128;
                if (i5 % 2 == 0) {
                    SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.iv_close);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                i = R.id.iv_close;
                TdsImageView tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (tdsImageViewOnNavigationEvent != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.layout_close))) != null) {
                    i = R.id.progressbar;
                    AdsCircularProgressBar adsCircularProgressBar = (AdsCircularProgressBar) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                    if (adsCircularProgressBar != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.tv_countdown_1))) != null && (typography5OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.tv_countdown_2))) != null) {
                        registerDataSetObserver registerdatasetobserver = new registerDataSetObserver(view, tdsRadialGradientView, tdsImageViewOnNavigationEvent, tdsRoundLayoutOnNavigationEvent, adsCircularProgressBar, typography5OnNavigationEvent, typography5OnNavigationEvent2);
                        int i6 = IAuthTabCallbackDefault + 39;
                        asBinder = i6 % 128;
                        int i7 = i6 % 2;
                        return registerdatasetobserver;
                    }
                }
            }
        } else {
            i = R.id.bg_gradient_view;
            tdsRadialGradientViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (tdsRadialGradientViewOnNavigationEvent != null) {
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
