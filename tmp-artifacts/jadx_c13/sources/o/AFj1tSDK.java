package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.uikit.R;
import im.toss.uikit.widget.dialog.BottomSheetHeader;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1tSDK implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact;
    public final ConstraintLayout IAuthTabCallback;
    public final RecyclerView onExtraCallback;
    public final BottomSheetHeader onExtraCallbackWithResult;
    private final ConstraintLayout onNavigationEvent;
    public final View onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AFj1tSDK(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull BottomSheetHeader bottomSheetHeader, @NonNull RecyclerView recyclerView, @NonNull ConstraintLayout constraintLayout2) {
        this.onNavigationEvent = constraintLayout;
        this.onWarmupCompleted = view;
        this.onExtraCallbackWithResult = bottomSheetHeader;
        this.onExtraCallback = recyclerView;
        this.IAuthTabCallback = constraintLayout2;
    }

    public ConstraintLayout IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayout = this.onNavigationEvent;
        int i4 = i3 + 81;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayout;
    }

    public static AFj1tSDK onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        AFj1tSDK aFj1tSDKOnExtraCallback = onExtraCallback(layoutInflater, null, false);
        int i4 = IAuthTabCallbackStub + 83;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return aFj1tSDKOnExtraCallback;
    }

    public static AFj1tSDK onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.bottom_sheet_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
            int i4 = onTransact + 87;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        return IAuthTabCallback(viewInflate);
    }

    public static AFj1tSDK IAuthTabCallback(@NonNull View view) {
        RecyclerView recyclerViewOnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.divider;
        View viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (viewOnNavigationEvent != null) {
            int i3 = onTransact + 41;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.header;
            BottomSheetHeader bottomSheetHeader = (BottomSheetHeader) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (bottomSheetHeader != null && (recyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.recyclerView))) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                AFj1tSDK aFj1tSDK = new AFj1tSDK(constraintLayout, viewOnNavigationEvent, bottomSheetHeader, recyclerViewOnNavigationEvent, constraintLayout);
                int i5 = onTransact + 9;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 11 / 0;
                }
                return aFj1tSDK;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
