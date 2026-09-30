package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography11;
import im.toss.uikit.R;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class r8lambdaCSGDgrhbz5hn67RyTFwny1sMmIc implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    public final TdsRollingNumberV1View IAuthTabCallback;
    public final View IAuthTabCallbackDefault;
    private final View asInterface;
    public final SubTypography11 onExtraCallback;
    public final View onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    public final TdsButtonV1View onWarmupCompleted;

    private r8lambdaCSGDgrhbz5hn67RyTFwny1sMmIc(@NonNull View view, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull SubTypography11 subTypography11, @NonNull TdsImageView tdsImageView, @NonNull View view2, @NonNull TdsRollingNumberV1View tdsRollingNumberV1View, @NonNull View view3) {
        this.asInterface = view;
        this.onWarmupCompleted = tdsButtonV1View;
        this.onExtraCallback = subTypography11;
        this.onNavigationEvent = tdsImageView;
        this.onExtraCallbackWithResult = view2;
        this.IAuthTabCallback = tdsRollingNumberV1View;
        this.IAuthTabCallbackDefault = view3;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        View view = this.asInterface;
        int i5 = i3 + 55;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        throw new java.lang.NullPointerException("parent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 53;
        o.r8lambdaCSGDgrhbz5hn67RyTFwny1sMmIc.onTransact = r1 % 128;
        r1 = r1 % 2;
        r4.inflate(im.toss.uikit.R.layout.amount_top, r5);
        r4 = onWarmupCompleted(r5);
        r5 = o.r8lambdaCSGDgrhbz5hn67RyTFwny1sMmIc.onTransact + 103;
        o.r8lambdaCSGDgrhbz5hn67RyTFwny1sMmIc.IAuthTabCallbackStub = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r8lambdaCSGDgrhbz5hn67RyTFwny1sMmIc onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 103;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 68 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[PHI: r2
      0x004d: PHI (r2v6 android.view.View) = (r2v5 android.view.View), (r2v10 android.view.View) binds: [B:14:0x004b, B:11:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r8lambdaCSGDgrhbz5hn67RyTFwny1sMmIc onWarmupCompleted(@NonNull View view) {
        SubTypography11 subTypography11OnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        View viewOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onTransact + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.button;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
        if (tdsButtonV1ViewOnNavigationEvent != null && (subTypography11OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.subtitle))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.subtitleRightIcon))) != null) {
            int i5 = onTransact + 15;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                i4 = R.id.subtitleUnderline;
                viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                int i6 = 19 / 0;
                if (viewOnNavigationEvent != null) {
                    View view2 = viewOnNavigationEvent;
                    i4 = R.id.title;
                    TdsRollingNumberV1View tdsRollingNumberV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                    if (tdsRollingNumberV1ViewOnNavigationEvent != null) {
                        int i7 = onTransact + 43;
                        IAuthTabCallbackStub = i7 % 128;
                        if (i7 % 2 != 0) {
                            SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.title_bg);
                            throw null;
                        }
                        i4 = R.id.title_bg;
                        View viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                        if (viewOnNavigationEvent2 != null) {
                            r8lambdaCSGDgrhbz5hn67RyTFwny1sMmIc r8lambdacsgdgrhbz5hn67rytfwny1smmic = new r8lambdaCSGDgrhbz5hn67RyTFwny1sMmIc(view, tdsButtonV1ViewOnNavigationEvent, subTypography11OnNavigationEvent, tdsImageViewOnNavigationEvent, view2, tdsRollingNumberV1ViewOnNavigationEvent, viewOnNavigationEvent2);
                            int i8 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGB_YVYU;
                            onTransact = i8 % 128;
                            int i9 = i8 % 2;
                            return r8lambdacsgdgrhbz5hn67rytfwny1smmic;
                        }
                    }
                }
            } else {
                i4 = R.id.subtitleUnderline;
                viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                if (viewOnNavigationEvent != null) {
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
