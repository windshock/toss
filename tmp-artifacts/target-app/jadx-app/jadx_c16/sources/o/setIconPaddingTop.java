package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pnikosis.materialishprogress.ProgressWheel;
import im.toss.core.R;
import im.toss.core.R$layout;
import im.toss.core.webkit.bridge.image.crop.FocusView;
import im.toss.core.webkit.bridge.image.crop.PinchImageView;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setIconPaddingTop implements SearchBarKtExternalSyntheticLambda5 {
    private static int asInterface = 1;
    private static int onTransact;
    public final PinchImageView IAuthTabCallback;
    private final ConstraintLayout IAuthTabCallbackDefault;
    public final ConstraintLayout IAuthTabCallbackStub;
    public final ProgressWheel asBinder;
    public final View onExtraCallback;
    public final FocusView onExtraCallbackWithResult;
    public final View onNavigationEvent;
    public final TdsButtonV1View onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback();
            throw null;
        }
        ConstraintLayout constraintLayoutIAuthTabCallback = IAuthTabCallback();
        int i3 = asInterface + 125;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return constraintLayoutIAuthTabCallback;
        }
        throw null;
    }

    private setIconPaddingTop(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull View view2, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull FocusView focusView, @NonNull PinchImageView pinchImageView, @NonNull ConstraintLayout constraintLayout2, @NonNull ProgressWheel progressWheel) {
        this.IAuthTabCallbackDefault = constraintLayout;
        this.onNavigationEvent = view;
        this.onExtraCallback = view2;
        this.onWarmupCompleted = tdsButtonV1View;
        this.onExtraCallbackWithResult = focusView;
        this.IAuthTabCallback = pinchImageView;
        this.IAuthTabCallbackStub = constraintLayout2;
        this.asBinder = progressWheel;
    }

    public ConstraintLayout IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackDefault;
        }
        throw null;
    }

    public static setIconPaddingTop onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        setIconPaddingTop seticonpaddingtopOnExtraCallbackWithResult = onExtraCallbackWithResult(layoutInflater, null, false);
        int i4 = onTransact + 95;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return seticonpaddingtopOnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
      0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v6 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static setIconPaddingTop onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate;
        int i = 2 % 2;
        int i2 = onTransact + 43;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            viewInflate = layoutInflater.inflate(R$layout.activity_photo_crop_core, viewGroup, false);
            if (z) {
                int i3 = asInterface + 117;
                onTransact = i3 % 128;
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
            viewInflate = layoutInflater.inflate(R$layout.activity_photo_crop_core, viewGroup, false);
            if (z) {
            }
        }
        return onWarmupCompleted(viewInflate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (r3 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r3 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        r9 = r1;
        r11 = new o.setIconPaddingTop(r9, r4, r5, r6, r7, r8, r9, r3);
        r1 = o.setIconPaddingTop.asInterface + 97;
        o.setIconPaddingTop.onTransact = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        if ((r1 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        r11 = null;
        r11.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static setIconPaddingTop onWarmupCompleted(@NonNull View view) {
        ConstraintLayout constraintLayout;
        int i;
        ProgressWheel progressWheelOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = R.id.cover_view;
        View viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
        if (viewOnNavigationEvent != null) {
            int i4 = asInterface + 77;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            i3 = R.id.crop_bound;
            View viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
            if (viewOnNavigationEvent2 != null && (r6 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.crop_button))) != null && (r7 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.crop_focus))) != null) {
                int i6 = asInterface + 39;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                i3 = R.id.crop_image;
                PinchImageView pinchImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                if (pinchImageViewOnNavigationEvent != null) {
                    int i8 = asInterface + 69;
                    onTransact = i8 % 128;
                    if (i8 % 2 != 0) {
                        constraintLayout = (ConstraintLayout) view;
                        i = R.id.progress;
                        progressWheelOnNavigationEvent = (ProgressWheel) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                        int i9 = 4 / 0;
                    } else {
                        constraintLayout = (ConstraintLayout) view;
                        i = R.id.progress;
                        progressWheelOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
    }
}
