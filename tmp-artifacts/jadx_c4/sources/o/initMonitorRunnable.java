package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.feature.credit.ui.main.R;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class initMonitorRunnable implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private final ConstraintLayout IAuthTabCallback;
    public final ConstraintLayout onExtraCallback;
    public final BottomSheetHeader onExtraCallbackWithResult;
    public final TdsBottomCtaV1View onNavigationEvent;
    public final com.airbnb.lottie.LottieAnimationView onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 53;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayoutOnExtraCallbackWithResult;
    }

    private initMonitorRunnable(@NonNull ConstraintLayout constraintLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull BottomSheetHeader bottomSheetHeader, @NonNull com.airbnb.lottie.LottieAnimationView lottieAnimationView, @NonNull ConstraintLayout constraintLayout2) {
        this.IAuthTabCallback = constraintLayout;
        this.onNavigationEvent = tdsBottomCtaV1View;
        this.onExtraCallbackWithResult = bottomSheetHeader;
        this.onWarmupCompleted = lottieAnimationView;
        this.onExtraCallback = constraintLayout2;
    }

    public ConstraintLayout onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.IAuthTabCallback;
        int i5 = i3 + 59;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 99 / 0;
        }
        return constraintLayout;
    }

    public static initMonitorRunnable onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        IAuthTabCallbackDefault = i2 % 128;
        initMonitorRunnable initmonitorrunnableOnExtraCallback = onExtraCallback(layoutInflater, null, i2 % 2 != 0);
        int i3 = IAuthTabCallbackDefault + 61;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return initmonitorrunnableOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
      0x0021: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v6 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static initMonitorRunnable onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate;
        int i = 2 % 2;
        int i2 = asBinder + 85;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            viewInflate = layoutInflater.inflate(R.layout.fragment_nice_di_error_bottom_sheet, viewGroup, true);
            if (z) {
                int i3 = asBinder + 23;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 == 0) {
                    viewGroup.addView(viewInflate);
                } else {
                    viewGroup.addView(viewInflate);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            viewInflate = layoutInflater.inflate(R.layout.fragment_nice_di_error_bottom_sheet, viewGroup, false);
            if (z) {
            }
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        r8 = (androidx.constraintlayout.widget.ConstraintLayout) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        return new o.initMonitorRunnable(r8, r5, r6, r0, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static initMonitorRunnable onExtraCallbackWithResult(@NonNull View view) {
        com.airbnb.lottie.LottieAnimationView lottieAnimationViewOnNavigationEvent;
        int i = 2 % 2;
        int i2 = asBinder + 111;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.id.bottom_cta;
            TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
            if (tdsBottomCtaV1ViewOnNavigationEvent != null && (r6 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.header))) != null) {
                int i4 = asBinder + 83;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    i3 = R.id.image;
                    lottieAnimationViewOnNavigationEvent = (com.airbnb.lottie.LottieAnimationView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                    int i5 = 3 / 0;
                } else {
                    i3 = R.id.image;
                    lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.bottom_cta);
        throw null;
    }
}
