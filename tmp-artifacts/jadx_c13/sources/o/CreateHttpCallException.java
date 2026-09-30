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
public final class CreateHttpCallException implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    public final TdsImageView IAuthTabCallback;
    public final Typography3 onExtraCallback;
    public final Barrier onExtraCallbackWithResult;
    public final ConstraintLayout onNavigationEvent;
    private final TdsRoundLayout onTransact;
    public final Typography1 onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = asInterface + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback();
        }
        onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private CreateHttpCallException(@NonNull TdsRoundLayout tdsRoundLayout, @NonNull Barrier barrier, @NonNull ConstraintLayout constraintLayout, @NonNull Typography3 typography3, @NonNull TdsImageView tdsImageView, @NonNull Typography1 typography1) {
        this.onTransact = tdsRoundLayout;
        this.onExtraCallbackWithResult = barrier;
        this.onNavigationEvent = constraintLayout;
        this.onExtraCallback = typography3;
        this.IAuthTabCallback = tdsImageView;
        this.onWarmupCompleted = typography1;
    }

    public TdsRoundLayout onExtraCallback() {
        TdsRoundLayout tdsRoundLayout;
        int i = 2 % 2;
        int i2 = asInterface + 31;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            tdsRoundLayout = this.onTransact;
            int i4 = 44 / 0;
        } else {
            tdsRoundLayout = this.onTransact;
        }
        int i5 = i3 + 119;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return tdsRoundLayout;
        }
        throw null;
    }

    public static CreateHttpCallException IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        asInterface = i2 % 128;
        Object obj = null;
        CreateHttpCallException createHttpCallExceptionOnExtraCallbackWithResult = onExtraCallbackWithResult(layoutInflater, null, i2 % 2 == 0);
        int i3 = IAuthTabCallbackStub + 107;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return createHttpCallExceptionOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static CreateHttpCallException onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.window_magnifier_v26, viewGroup, false);
        if (!(!z)) {
            int i2 = asInterface + 93;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            viewGroup.addView(viewInflate);
        }
        CreateHttpCallException createHttpCallExceptionOnNavigationEvent = onNavigationEvent(viewInflate);
        int i3 = IAuthTabCallbackStub + 103;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return createHttpCallExceptionOnNavigationEvent;
    }

    public static CreateHttpCallException onNavigationEvent(@NonNull View view) {
        Typography3 typography3OnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.contentBarrier;
        Barrier barrierOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (barrierOnNavigationEvent != null) {
            int i3 = IAuthTabCallbackStub + 1;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.contentLayout);
                throw null;
            }
            i2 = R.id.contentLayout;
            ConstraintLayout constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (constraintLayoutOnNavigationEvent != null && (typography3OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.description))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.image))) != null) {
                int i4 = asInterface + 31;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                i2 = R.id.text;
                Typography1 typography1OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (typography1OnNavigationEvent != null) {
                    CreateHttpCallException createHttpCallException = new CreateHttpCallException((TdsRoundLayout) view, barrierOnNavigationEvent, constraintLayoutOnNavigationEvent, typography3OnNavigationEvent, tdsImageViewOnNavigationEvent, typography1OnNavigationEvent);
                    int i6 = IAuthTabCallbackStub + 113;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    return createHttpCallException;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
