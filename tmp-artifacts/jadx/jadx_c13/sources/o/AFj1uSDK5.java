package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography4;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.R;
import im.toss.uikit.widget.AutoLogTdsRoundLayout;
import im.toss.uikit.widget.MaxHeightScrollView;
import im.toss.uikit.widget.buttons.DialogButton;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1uSDK5 implements SearchBarKtExternalSyntheticLambda5 {
    private static int onActivityResized = 1;
    private static int onPostMessage;
    public final Barrier IAuthTabCallback;
    public final View IAuthTabCallbackDefault;
    public final Typography6 IAuthTabCallbackStub;
    public final TextView IAuthTabCallbackStubProxy;
    public final AutoLogTdsRoundLayout IAuthTabCallback_Parcel;
    public final MaxHeightScrollView ICustomTabsCallback;
    public final DialogButton access000;
    public final Typography6 access100;
    public final ConstraintLayout asBinder;
    public final TdsRoundLayout asInterface;
    public final Typography5 extraCallback;
    public final Typography4 extraCallbackWithResult;
    public final View getInterfaceDescriptor;
    private final ConstraintLayout onActivityLayout;
    public final FlexboxLayout onExtraCallback;
    public final ConstraintLayout onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    public final DialogButton onTransact;
    public final TdsImageView onWarmupCompleted;
    public final DialogButton readTypedObject;
    public final TdsImageView writeTypedObject;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = onPostMessage + 71;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutOnWarmupCompleted = onWarmupCompleted();
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        return constraintLayoutOnWarmupCompleted;
    }

    private AFj1uSDK5(@NonNull ConstraintLayout constraintLayout, @NonNull TdsImageView tdsImageView, @NonNull FlexboxLayout flexboxLayout, @NonNull TdsImageView tdsImageView2, @NonNull Barrier barrier, @NonNull ConstraintLayout constraintLayout2, @NonNull View view, @NonNull Typography6 typography6, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull ConstraintLayout constraintLayout3, @NonNull DialogButton dialogButton, @NonNull View view2, @NonNull TextView textView, @NonNull Typography6 typography62, @NonNull DialogButton dialogButton2, @NonNull AutoLogTdsRoundLayout autoLogTdsRoundLayout, @NonNull Typography5 typography5, @NonNull DialogButton dialogButton3, @NonNull MaxHeightScrollView maxHeightScrollView, @NonNull Typography4 typography4, @NonNull TdsImageView tdsImageView3) {
        this.onActivityLayout = constraintLayout;
        this.onWarmupCompleted = tdsImageView;
        this.onExtraCallback = flexboxLayout;
        this.onNavigationEvent = tdsImageView2;
        this.IAuthTabCallback = barrier;
        this.onExtraCallbackWithResult = constraintLayout2;
        this.IAuthTabCallbackDefault = view;
        this.IAuthTabCallbackStub = typography6;
        this.asInterface = tdsRoundLayout;
        this.asBinder = constraintLayout3;
        this.onTransact = dialogButton;
        this.getInterfaceDescriptor = view2;
        this.IAuthTabCallbackStubProxy = textView;
        this.access100 = typography62;
        this.access000 = dialogButton2;
        this.IAuthTabCallback_Parcel = autoLogTdsRoundLayout;
        this.extraCallback = typography5;
        this.readTypedObject = dialogButton3;
        this.ICustomTabsCallback = maxHeightScrollView;
        this.extraCallbackWithResult = typography4;
        this.writeTypedObject = tdsImageView3;
    }

    public ConstraintLayout onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onActivityResized + 57;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onActivityLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AFj1uSDK5 onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = onPostMessage + 125;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        AFj1uSDK5 aFj1uSDK5OnExtraCallback = onExtraCallback(layoutInflater, null, false);
        int i4 = onPostMessage + 39;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return aFj1uSDK5OnExtraCallback;
        }
        throw null;
    }

    public static AFj1uSDK5 onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = onActivityResized + 55;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.custom_dialog, viewGroup, false);
        if (!(!z)) {
            int i4 = onActivityResized + 105;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.addView(viewInflate);
        }
        AFj1uSDK5 aFj1uSDK5OnExtraCallback = onExtraCallback(viewInflate);
        int i6 = onPostMessage + 99;
        onActivityResized = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 69 / 0;
        }
        return aFj1uSDK5OnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0107 A[PHI: r1
      0x0107: PHI (r1v4 im.toss.uikit.widget.buttons.DialogButton) = (r1v3 im.toss.uikit.widget.buttons.DialogButton), (r1v9 im.toss.uikit.widget.buttons.DialogButton) binds: [B:45:0x0105, B:42:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[PHI: r3
      0x0029: PHI (r3v3 im.toss.tds.view.component.atom.image.TdsImageView) = (r3v2 im.toss.tds.view.component.atom.image.TdsImageView), (r3v23 im.toss.tds.view.component.atom.image.TdsImageView) binds: [B:8:0x0027, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AFj1uSDK5 onExtraCallback(@NonNull View view) {
        int i;
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent2;
        Barrier barrierOnNavigationEvent;
        ConstraintLayout constraintLayoutOnNavigationEvent;
        Typography6 typography6OnNavigationEvent;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        View viewOnNavigationEvent;
        Typography5 typography5OnNavigationEvent;
        DialogButton dialogButton;
        Typography4 typography4OnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent3;
        int i2 = 2 % 2;
        int i3 = onPostMessage + 101;
        onActivityResized = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.id.backgroundImage;
            tdsImageViewOnNavigationEvent = (TdsImageView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            int i4 = 47 / 0;
            if (tdsImageViewOnNavigationEvent != null) {
                TdsImageView tdsImageView = tdsImageViewOnNavigationEvent;
                i = R.id.basicButtons;
                FlexboxLayout flexboxLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (flexboxLayoutOnNavigationEvent != null && (tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottomImage))) != null && (barrierOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.buttonBarrier))) != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.buttons))) != null) {
                    int i5 = onActivityResized + 15;
                    onPostMessage = i5 % 128;
                    if (i5 % 2 != 0) {
                        SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.buttonsDivider);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    i = R.id.buttonsDivider;
                    View viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                    if (viewOnNavigationEvent2 != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.cancel))) != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.cardView))) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = R.id.cta;
                        DialogButton dialogButton2 = (DialogButton) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                        if (dialogButton2 != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.dim))) != null) {
                            i = R.id.log_label;
                            TextView textView = (TextView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                            if (textView != null) {
                                int i6 = onActivityResized + 111;
                                onPostMessage = i6 % 128;
                                int i7 = i6 % 2;
                                i = R.id.message;
                                Typography6 typography6OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                                if (typography6OnNavigationEvent2 != null) {
                                    int i8 = onPostMessage + 93;
                                    onActivityResized = i8 % 128;
                                    int i9 = i8 % 2;
                                    i = R.id.negativeButton;
                                    DialogButton dialogButton3 = (DialogButton) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                                    if (dialogButton3 != null) {
                                        i = R.id.neutralButton;
                                        AutoLogTdsRoundLayout autoLogTdsRoundLayout = (AutoLogTdsRoundLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                                        if (autoLogTdsRoundLayout != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.neutralButtonLabel))) != null) {
                                            int i10 = onPostMessage + 119;
                                            onActivityResized = i10 % 128;
                                            if (i10 % 2 == 0) {
                                                i = R.id.positiveButton;
                                                dialogButton = (DialogButton) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                                                int i11 = 22 / 0;
                                                if (dialogButton != null) {
                                                    DialogButton dialogButton4 = dialogButton;
                                                    i = R.id.scrollView;
                                                    MaxHeightScrollView maxHeightScrollView = (MaxHeightScrollView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                                                    if (maxHeightScrollView != null && (typography4OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null && (tdsImageViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.topImage))) != null) {
                                                        return new AFj1uSDK5(constraintLayout, tdsImageView, flexboxLayoutOnNavigationEvent, tdsImageViewOnNavigationEvent2, barrierOnNavigationEvent, constraintLayoutOnNavigationEvent, viewOnNavigationEvent2, typography6OnNavigationEvent, tdsRoundLayoutOnNavigationEvent, constraintLayout, dialogButton2, viewOnNavigationEvent, textView, typography6OnNavigationEvent2, dialogButton3, autoLogTdsRoundLayout, typography5OnNavigationEvent, dialogButton4, maxHeightScrollView, typography4OnNavigationEvent, tdsImageViewOnNavigationEvent3);
                                                    }
                                                }
                                            } else {
                                                i = R.id.positiveButton;
                                                dialogButton = (DialogButton) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                                                if (dialogButton != null) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            i = R.id.backgroundImage;
            tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (tdsImageViewOnNavigationEvent != null) {
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
