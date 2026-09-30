package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.mobileid.impl.R;
import im.toss.features.mobileid.impl.qr.MobileIdQrCodeScanner;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.widget.TdsRoundLayout;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ScheduleThreadHelperScheduleThreadTask implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact;
    public final TdsImageView IAuthTabCallback;
    private final ConstraintLayout onExtraCallback;
    public final TdsRoundLayout onExtraCallbackWithResult;
    public final MobileIdQrCodeScanner onNavigationEvent;
    public final TdsImageView onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutOnWarmupCompleted = onWarmupCompleted();
        int i4 = IAuthTabCallbackDefault + 53;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayoutOnWarmupCompleted;
    }

    private ScheduleThreadHelperScheduleThreadTask(@NonNull ConstraintLayout constraintLayout, @NonNull TdsImageView tdsImageView, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull TdsImageView tdsImageView2, @NonNull MobileIdQrCodeScanner mobileIdQrCodeScanner) {
        this.onExtraCallback = constraintLayout;
        this.IAuthTabCallback = tdsImageView;
        this.onExtraCallbackWithResult = tdsRoundLayout;
        this.onWarmupCompleted = tdsImageView2;
        this.onNavigationEvent = mobileIdQrCodeScanner;
    }

    public ConstraintLayout onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    public static ScheduleThreadHelperScheduleThreadTask IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ScheduleThreadHelperScheduleThreadTask scheduleThreadHelperScheduleThreadTaskOnNavigationEvent = onNavigationEvent(layoutInflater, null, false);
        int i4 = IAuthTabCallbackDefault + 83;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return scheduleThreadHelperScheduleThreadTaskOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[PHI: r3
      0x0023: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ScheduleThreadHelperScheduleThreadTask onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate;
        int i = 2 % 2;
        int i2 = onTransact + 35;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            viewInflate = layoutInflater.inflate(R.layout.mobileid_impl_activity_issue_qr, viewGroup, false);
            if (z) {
                viewGroup.addView(viewInflate);
                int i3 = onTransact + 3;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 5 % 2;
                }
            }
        } else {
            viewInflate = layoutInflater.inflate(R.layout.mobileid_impl_activity_issue_qr, viewGroup, false);
            if (!(!z)) {
            }
        }
        ScheduleThreadHelperScheduleThreadTask scheduleThreadHelperScheduleThreadTaskOnExtraCallbackWithResult = onExtraCallbackWithResult(viewInflate);
        int i5 = IAuthTabCallbackDefault + 99;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return scheduleThreadHelperScheduleThreadTaskOnExtraCallbackWithResult;
    }

    public static ScheduleThreadHelperScheduleThreadTask onExtraCallbackWithResult(@NonNull View view) {
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.backPressButton;
        TdsImageView tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
        if (tdsImageViewOnNavigationEvent != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.qrGuideText))) != null) {
            int i5 = onTransact + 15;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            i4 = R.id.qrImageView;
            TdsImageView tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
            if (tdsImageViewOnNavigationEvent2 != null) {
                int i7 = IAuthTabCallbackDefault + 21;
                onTransact = i7 % 128;
                if (i7 % 2 == 0) {
                    i4 = R.id.scannerView;
                    MobileIdQrCodeScanner mobileIdQrCodeScannerOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                    if (mobileIdQrCodeScannerOnNavigationEvent != null) {
                        return new ScheduleThreadHelperScheduleThreadTask((ConstraintLayout) view, tdsImageViewOnNavigationEvent, tdsRoundLayoutOnNavigationEvent, tdsImageViewOnNavigationEvent2, mobileIdQrCodeScannerOnNavigationEvent);
                    }
                } else {
                    SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.scannerView);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
