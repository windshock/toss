package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography1;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.R;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ParsingException implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    public final Barrier IAuthTabCallback;
    private final TdsRoundLayout asInterface;
    public final ConstraintLayout onExtraCallback;
    public final TdsImageView onExtraCallbackWithResult;
    public final Typography1 onNavigationEvent;
    public final Typography3 onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        TdsRoundLayout tdsRoundLayoutIAuthTabCallback = IAuthTabCallback();
        int i4 = IAuthTabCallbackDefault + 99;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return tdsRoundLayoutIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ParsingException(@NonNull TdsRoundLayout tdsRoundLayout, @NonNull Barrier barrier, @NonNull ConstraintLayout constraintLayout, @NonNull Typography3 typography3, @NonNull TdsImageView tdsImageView, @NonNull Typography1 typography1) {
        this.asInterface = tdsRoundLayout;
        this.IAuthTabCallback = barrier;
        this.onExtraCallback = constraintLayout;
        this.onWarmupCompleted = typography3;
        this.onExtraCallbackWithResult = tdsImageView;
        this.onNavigationEvent = typography1;
    }

    public TdsRoundLayout IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 37;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        TdsRoundLayout tdsRoundLayout = this.asInterface;
        int i4 = i2 + 83;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return tdsRoundLayout;
    }

    public static ParsingException onWarmupCompleted(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ParsingException parsingExceptionOnNavigationEvent = onNavigationEvent(layoutInflater, null, false);
        int i4 = IAuthTabCallbackDefault + 27;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return parsingExceptionOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
      0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v6 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ParsingException onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate;
        int i = 2 % 2;
        int i2 = asBinder + 53;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            viewInflate = layoutInflater.inflate(R.layout.window_magnifier, viewGroup, false);
            if (z) {
                viewGroup.addView(viewInflate);
            }
        } else {
            viewInflate = layoutInflater.inflate(R.layout.window_magnifier, viewGroup, false);
            if (z) {
            }
        }
        ParsingException parsingExceptionOnNavigationEvent = onNavigationEvent(viewInflate);
        int i3 = asBinder + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return parsingExceptionOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ParsingException onNavigationEvent(@NonNull View view) {
        ConstraintLayout constraintLayoutOnNavigationEvent;
        Typography3 typography3OnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.id.contentBarrier;
            Barrier barrierOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
            if (barrierOnNavigationEvent != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.contentLayout))) != null && (typography3OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.description))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.image))) != null) {
                int i4 = asBinder + 107;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                i3 = R.id.text;
                Typography1 typography1OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                if (typography1OnNavigationEvent != null) {
                    return new ParsingException((TdsRoundLayout) view, barrierOnNavigationEvent, constraintLayoutOnNavigationEvent, typography3OnNavigationEvent, tdsImageViewOnNavigationEvent, typography1OnNavigationEvent);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.contentBarrier);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
