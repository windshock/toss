package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.uikit.R;
import im.toss.uikit.widget.TdsFlow;
import im.toss.uikit.widget.TdsSpace;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1zSDK implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int getInterfaceDescriptor;
    public final ConstraintLayout IAuthTabCallback;
    public final TdsSpace IAuthTabCallbackDefault;
    public final TdsSpace IAuthTabCallbackStub;
    public final TdsSpace asBinder;
    private final View asInterface;
    public final TdsFlow onExtraCallback;
    public final ConstraintLayout onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    public final Typography7 onTransact;
    public final View onWarmupCompleted;

    private AFj1zSDK(@NonNull View view, @NonNull TdsImageView tdsImageView, @NonNull ConstraintLayout constraintLayout, @NonNull TdsFlow tdsFlow, @NonNull View view2, @NonNull ConstraintLayout constraintLayout2, @NonNull Typography7 typography7, @NonNull TdsSpace tdsSpace, @NonNull TdsSpace tdsSpace2, @NonNull TdsSpace tdsSpace3) {
        this.asInterface = view;
        this.onNavigationEvent = tdsImageView;
        this.IAuthTabCallback = constraintLayout;
        this.onExtraCallback = tdsFlow;
        this.onWarmupCompleted = view2;
        this.onExtraCallbackWithResult = constraintLayout2;
        this.onTransact = typography7;
        this.asBinder = tdsSpace;
        this.IAuthTabCallbackStub = tdsSpace2;
        this.IAuthTabCallbackDefault = tdsSpace3;
    }

    public View getRoot() {
        View view;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 53;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            view = this.asInterface;
            int i4 = 2 / 0;
        } else {
            view = this.asInterface;
        }
        int i5 = i2 + 39;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return view;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AFj1zSDK onNavigationEvent(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        int i4 = i2 + 115;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            layoutInflater.inflate(R.layout.tds_agreement_v3_row, viewGroup);
            return onExtraCallbackWithResult(viewGroup);
        }
        layoutInflater.inflate(R.layout.tds_agreement_v3_row, viewGroup);
        onExtraCallbackWithResult(viewGroup);
        throw null;
    }

    public static AFj1zSDK onExtraCallbackWithResult(@NonNull View view) {
        ConstraintLayout constraintLayoutOnNavigationEvent;
        View viewOnNavigationEvent;
        Typography7 typography7OnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.arrow;
        TdsImageView tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (tdsImageViewOnNavigationEvent != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.centerArea))) != null) {
            i2 = R.id.centerFlow;
            TdsFlow tdsFlow = (TdsFlow) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (tdsFlow != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.clickView))) != null) {
                int i3 = getInterfaceDescriptor + 39;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                i2 = R.id.rightArea;
                ConstraintLayout constraintLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (constraintLayoutOnNavigationEvent2 != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.rightText))) != null) {
                    int i5 = getInterfaceDescriptor + 67;
                    IAuthTabCallbackStubProxy = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = R.id.spaceBottom;
                    TdsSpace tdsSpace = (TdsSpace) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                    if (tdsSpace != null) {
                        int i7 = getInterfaceDescriptor + 79;
                        IAuthTabCallbackStubProxy = i7 % 128;
                        int i8 = i7 % 2;
                        i2 = R.id.spaceLeft;
                        TdsSpace tdsSpace2 = (TdsSpace) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                        if (tdsSpace2 != null) {
                            i2 = R.id.spaceRight;
                            TdsSpace tdsSpace3 = (TdsSpace) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                            if (tdsSpace3 != null) {
                                return new AFj1zSDK(view, tdsImageViewOnNavigationEvent, constraintLayoutOnNavigationEvent, tdsFlow, viewOnNavigationEvent, constraintLayoutOnNavigationEvent2, typography7OnNavigationEvent, tdsSpace, tdsSpace2, tdsSpace3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
