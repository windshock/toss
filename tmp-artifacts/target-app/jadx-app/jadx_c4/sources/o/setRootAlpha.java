package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import im.toss.ads_sdk.R;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography13;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.tds.view.component.widget.TdsSquircleLayoutV1;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setRootAlpha implements SearchBarKtExternalSyntheticLambda5 {
    private static int asBinder = 1;
    private static int onTransact;
    public final SubTypography13 IAuthTabCallback;
    public final View IAuthTabCallbackDefault;
    private final View IAuthTabCallbackStub;
    public final Typography7 asInterface;
    public final Typography5 onExtraCallback;
    public final TdsImageView onExtraCallbackWithResult;
    public final TdsSquircleLayoutV1 onNavigationEvent;
    public final TdsRoundLayout onWarmupCompleted;

    private setRootAlpha(@NonNull View view, @NonNull SubTypography13 subTypography13, @NonNull TdsImageView tdsImageView, @NonNull TdsSquircleLayoutV1 tdsSquircleLayoutV1, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull Typography5 typography5, @NonNull Typography7 typography7, @NonNull View view2) {
        this.IAuthTabCallbackStub = view;
        this.IAuthTabCallback = subTypography13;
        this.onExtraCallbackWithResult = tdsImageView;
        this.onNavigationEvent = tdsSquircleLayoutV1;
        this.onWarmupCompleted = tdsRoundLayout;
        this.onExtraCallback = typography5;
        this.asInterface = typography7;
        this.IAuthTabCallbackDefault = view2;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        View view = this.IAuthTabCallbackStub;
        int i5 = i3 + 59;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return view;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r4.inflate(im.toss.ads_sdk.R.layout.ads_sdk_normal_ad_view, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        return onExtraCallback(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r4.inflate(im.toss.ads_sdk.R.layout.ads_sdk_normal_ad_view, r5);
        onExtraCallback(r5);
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        throw new java.lang.NullPointerException("parent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 85;
        o.setRootAlpha.asBinder = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static setRootAlpha IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 111;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 55 / 0;
        }
    }

    public static setRootAlpha onExtraCallback(@NonNull View view) {
        TdsImageView tdsImageViewOnNavigationEvent;
        Typography7 typography7OnNavigationEvent;
        View viewOnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.disclaimer;
        SubTypography13 subTypography13OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (subTypography13OnNavigationEvent != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.image))) != null) {
            int i3 = asBinder + 73;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.imageContainer;
            TdsSquircleLayoutV1 tdsSquircleLayoutV1OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (tdsSquircleLayoutV1OnNavigationEvent != null) {
                int i5 = asBinder + 125;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                i2 = R.id.innerContainer;
                TdsRoundLayout tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (tdsRoundLayoutOnNavigationEvent != null) {
                    int i7 = onTransact + 13;
                    asBinder = i7 % 128;
                    if (i7 % 2 == 0) {
                        SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.row1Text);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    i2 = R.id.row1Text;
                    Typography5 typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                    if (typography5OnNavigationEvent != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.row2Text))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.space_middle))) != null) {
                        return new setRootAlpha(view, subTypography13OnNavigationEvent, tdsImageViewOnNavigationEvent, tdsSquircleLayoutV1OnNavigationEvent, tdsRoundLayoutOnNavigationEvent, typography5OnNavigationEvent, typography7OnNavigationEvent, viewOnNavigationEvent);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
