package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.feature.credit.ui.kcbsurvey.R;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class stackUploadThreshold implements SearchBarKtExternalSyntheticLambda5 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final ConstraintLayout onExtraCallback;
    public final FrameLayout onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent();
        }
        onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private stackUploadThreshold(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout) {
        this.onExtraCallback = constraintLayout;
        this.onWarmupCompleted = frameLayout;
    }

    public ConstraintLayout onNavigationEvent() {
        ConstraintLayout constraintLayout;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            constraintLayout = this.onExtraCallback;
            int i4 = 70 / 0;
        } else {
            constraintLayout = this.onExtraCallback;
        }
        int i5 = i3 + 15;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return constraintLayout;
        }
        throw null;
    }

    public static stackUploadThreshold IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        stackUploadThreshold stackuploadthresholdOnExtraCallbackWithResult = onExtraCallbackWithResult(layoutInflater, null, false);
        int i4 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return stackuploadthresholdOnExtraCallbackWithResult;
    }

    public static stackUploadThreshold onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.activity_kcb_survey_lab_activity, viewGroup, false);
        if (z) {
            int i4 = onExtraCallbackWithResult + 79;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup.addView(viewInflate);
            } else {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        stackUploadThreshold stackuploadthresholdOnNavigationEvent = onNavigationEvent(viewInflate);
        int i5 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
        return stackuploadthresholdOnNavigationEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r4 = 60 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(r4.getResources().getResourceName(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = new o.stackUploadThreshold((androidx.constraintlayout.widget.ConstraintLayout) r4, r2);
        r4 = o.stackUploadThreshold.onExtraCallbackWithResult + 23;
        o.stackUploadThreshold.onNavigationEvent = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static stackUploadThreshold onNavigationEvent(@NonNull View view) {
        int i;
        FrameLayout frameLayout;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.id.container;
            frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            int i4 = 84 / 0;
        } else {
            i = R.id.container;
            frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        }
    }
}
