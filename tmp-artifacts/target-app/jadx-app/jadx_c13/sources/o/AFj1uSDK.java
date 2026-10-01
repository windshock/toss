package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.uikit.R;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1uSDK implements SearchBarKtExternalSyntheticLambda5 {
    private static int asInterface = 1;
    private static int onWarmupCompleted;
    public final Typography5 IAuthTabCallback;
    private final LinearLayout onExtraCallback;
    public final ProgressBar onExtraCallbackWithResult;
    public final LinearLayout onNavigationEvent;

    public /* synthetic */ View getRoot() {
        LinearLayout linearLayoutIAuthTabCallback;
        int i = 2 % 2;
        int i2 = asInterface + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            linearLayoutIAuthTabCallback = IAuthTabCallback();
            int i3 = 76 / 0;
        } else {
            linearLayoutIAuthTabCallback = IAuthTabCallback();
        }
        int i4 = onWarmupCompleted + 73;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return linearLayoutIAuthTabCallback;
    }

    private AFj1uSDK(@NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull LinearLayout linearLayout2, @NonNull Typography5 typography5) {
        this.onExtraCallback = linearLayout;
        this.onExtraCallbackWithResult = progressBar;
        this.onNavigationEvent = linearLayout2;
        this.IAuthTabCallback = typography5;
    }

    public LinearLayout IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        LinearLayout linearLayout = this.onExtraCallback;
        int i5 = i3 + 45;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return linearLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AFj1uSDK onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        asInterface = i2 % 128;
        return onNavigationEvent(layoutInflater, null, i2 % 2 == 0);
    }

    public static AFj1uSDK onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.dialog_progress, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
            int i4 = asInterface + 65;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        AFj1uSDK aFj1uSDKOnExtraCallbackWithResult = onExtraCallbackWithResult(viewInflate);
        int i6 = onWarmupCompleted + 113;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return aFj1uSDKOnExtraCallbackWithResult;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r3 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r3 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        return new o.AFj1uSDK(r0, r2, r0, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r2
      0x0027: PHI (r2v3 android.widget.ProgressBar) = (r2v2 android.widget.ProgressBar), (r2v5 android.widget.ProgressBar) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AFj1uSDK onExtraCallbackWithResult(@NonNull View view) {
        int i;
        ProgressBar progressBar;
        LinearLayout linearLayout;
        Typography5 typography5OnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = asInterface + 17;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.id.loader;
            progressBar = (ProgressBar) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            int i4 = 73 / 0;
            if (progressBar != null) {
                int i5 = asInterface + Imgproc.COLOR_YUV2RGBA_YVYU;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    linearLayout = (LinearLayout) view;
                    i = R.id.typography;
                    typography5OnNavigationEvent = (Typography5) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                    int i6 = 19 / 0;
                } else {
                    linearLayout = (LinearLayout) view;
                    i = R.id.typography;
                    typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                }
            }
        } else {
            i = R.id.loader;
            progressBar = (ProgressBar) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (progressBar != null) {
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
