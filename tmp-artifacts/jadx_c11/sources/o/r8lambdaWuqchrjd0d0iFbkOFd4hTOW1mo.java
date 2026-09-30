package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.rn.toss.core.R;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography5;
import im.toss.tds.view.component.atom.text.Typography4;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaWuqchrjd0d0iFbkOFd4hTOW1mo implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    public final SubTypography5 IAuthTabCallback;
    public final TdsButtonV1View onExtraCallback;
    private final ConstraintLayout onExtraCallbackWithResult;
    public final Typography4 onNavigationEvent;
    public final TdsImageView onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback();
            throw null;
        }
        ConstraintLayout constraintLayoutIAuthTabCallback = IAuthTabCallback();
        int i3 = onTransact + 79;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return constraintLayoutIAuthTabCallback;
    }

    private r8lambdaWuqchrjd0d0iFbkOFd4hTOW1mo(@NonNull ConstraintLayout constraintLayout, @NonNull TdsImageView tdsImageView, @NonNull SubTypography5 subTypography5, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull Typography4 typography4) {
        this.onExtraCallbackWithResult = constraintLayout;
        this.onWarmupCompleted = tdsImageView;
        this.IAuthTabCallback = subTypography5;
        this.onExtraCallback = tdsButtonV1View;
        this.onNavigationEvent = typography4;
    }

    public ConstraintLayout IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 19;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.onExtraCallbackWithResult;
        int i5 = i2 + 39;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static r8lambdaWuqchrjd0d0iFbkOFd4hTOW1mo IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.view_toss_react_error, viewGroup, false);
        if (z) {
            int i2 = onTransact + 77;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                viewGroup.addView(viewInflate);
            } else {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        r8lambdaWuqchrjd0d0iFbkOFd4hTOW1mo r8lambdawuqchrjd0d0ifbkofd4htow1moIAuthTabCallback = IAuthTabCallback(viewInflate);
        int i3 = IAuthTabCallbackStub + 33;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 86 / 0;
        }
        return r8lambdawuqchrjd0d0ifbkofd4htow1moIAuthTabCallback;
    }

    public static r8lambdaWuqchrjd0d0iFbkOFd4hTOW1mo IAuthTabCallback(@NonNull View view) {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.error_icon;
        TdsImageView tdsImageView = (TdsImageView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
        if (tdsImageView != null) {
            int i5 = onTransact + 115;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            i4 = R.id.error_message;
            SubTypography5 subTypography5 = (SubTypography5) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
            if (subTypography5 != null) {
                int i7 = onTransact + 57;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                i4 = R.id.error_retry_button;
                TdsButtonV1View tdsButtonV1View = (TdsButtonV1View) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                if (tdsButtonV1View != null) {
                    i4 = R.id.error_title;
                    Typography4 typography4 = (Typography4) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                    if (typography4 != null) {
                        r8lambdaWuqchrjd0d0iFbkOFd4hTOW1mo r8lambdawuqchrjd0d0ifbkofd4htow1mo = new r8lambdaWuqchrjd0d0iFbkOFd4hTOW1mo((ConstraintLayout) view, tdsImageView, subTypography5, tdsButtonV1View, typography4);
                        int i8 = onTransact + 19;
                        IAuthTabCallbackStub = i8 % 128;
                        int i9 = i8 % 2;
                        return r8lambdawuqchrjd0d0ifbkofd4htow1mo;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
