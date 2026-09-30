package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.R;
import im.toss.uikit.widget.MaxHeightScrollView;
import im.toss.uikit.widget.textField.BaseEditText;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFk1sSDK implements SearchBarKtExternalSyntheticLambda5 {
    private static int extraCallback = 0;
    private static int readTypedObject = 1;
    public final TdsImageView IAuthTabCallback;
    public final Typography7 IAuthTabCallbackDefault;
    public final FrameLayout IAuthTabCallbackStub;
    public final RelativeLayout IAuthTabCallbackStubProxy;
    public final MaxHeightScrollView IAuthTabCallback_Parcel;
    public final Typography5 access000;
    public final View access100;
    public final Typography5 asBinder;
    public final Typography7 asInterface;
    private final RelativeLayout getInterfaceDescriptor;
    public final TdsRoundLayout onExtraCallback;
    public final BaseEditText onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    public final LottieAnimationView onTransact;
    public final ConstraintLayout onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        RelativeLayout relativeLayoutOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = readTypedObject + 29;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            relativeLayoutOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = 66 / 0;
        } else {
            relativeLayoutOnExtraCallbackWithResult = onExtraCallbackWithResult();
        }
        int i4 = extraCallback + 29;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return relativeLayoutOnExtraCallbackWithResult;
    }

    private AFk1sSDK(@NonNull RelativeLayout relativeLayout, @NonNull ConstraintLayout constraintLayout, @NonNull TdsImageView tdsImageView, @NonNull BaseEditText baseEditText, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull TdsImageView tdsImageView2, @NonNull FrameLayout frameLayout, @NonNull Typography7 typography7, @NonNull LottieAnimationView lottieAnimationView, @NonNull Typography7 typography72, @NonNull Typography5 typography5, @NonNull RelativeLayout relativeLayout2, @NonNull MaxHeightScrollView maxHeightScrollView, @NonNull Typography5 typography52, @NonNull View view) {
        this.getInterfaceDescriptor = relativeLayout;
        this.onWarmupCompleted = constraintLayout;
        this.IAuthTabCallback = tdsImageView;
        this.onExtraCallbackWithResult = baseEditText;
        this.onExtraCallback = tdsRoundLayout;
        this.onNavigationEvent = tdsImageView2;
        this.IAuthTabCallbackStub = frameLayout;
        this.asInterface = typography7;
        this.onTransact = lottieAnimationView;
        this.IAuthTabCallbackDefault = typography72;
        this.asBinder = typography5;
        this.IAuthTabCallbackStubProxy = relativeLayout2;
        this.IAuthTabCallback_Parcel = maxHeightScrollView;
        this.access000 = typography52;
        this.access100 = view;
    }

    public RelativeLayout onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallback + 7;
        int i3 = i2 % 128;
        readTypedObject = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        RelativeLayout relativeLayout = this.getInterfaceDescriptor;
        int i4 = i3 + 41;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return relativeLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r4
      0x0021: PHI (r4v2 android.view.View) = (r4v1 android.view.View), (r4v5 android.view.View) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AFk1sSDK onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate;
        int i = 2 % 2;
        int i2 = readTypedObject + 67;
        extraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            viewInflate = layoutInflater.inflate(R.layout.text_field, viewGroup, false);
            if (z) {
                int i3 = extraCallback + 31;
                readTypedObject = i3 % 128;
                if (i3 % 2 != 0) {
                    viewGroup.addView(viewInflate);
                } else {
                    viewGroup.addView(viewInflate);
                    throw null;
                }
            }
        } else {
            viewInflate = layoutInflater.inflate(R.layout.text_field, viewGroup, false);
            if (z) {
            }
        }
        AFk1sSDK aFk1sSDKOnExtraCallback = onExtraCallback(viewInflate);
        int i4 = readTypedObject + 15;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return aFk1sSDKOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[PHI: r3
      0x007d: PHI (r3v11 im.toss.tds.view.component.atom.text.Typography7) = (r3v10 im.toss.tds.view.component.atom.text.Typography7), (r3v19 im.toss.tds.view.component.atom.text.Typography7) binds: [B:20:0x007b, B:17:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AFk1sSDK onExtraCallback(@NonNull View view) {
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent2;
        Typography7 typography7OnNavigationEvent;
        Typography7 typography7OnNavigationEvent2;
        Typography5 typography5OnNavigationEvent;
        Typography5 typography5OnNavigationEvent2;
        View viewOnNavigationEvent;
        int i = 2 % 2;
        int i2 = readTypedObject + 59;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.bgView;
        ConstraintLayout constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
        if (constraintLayoutOnNavigationEvent != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.clear))) != null) {
            int i5 = readTypedObject + 53;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            i4 = R.id.editText;
            BaseEditText baseEditText = (BaseEditText) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
            if (baseEditText != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.editTextLayout))) != null && (tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.icon))) != null) {
                i4 = R.id.iconGroup;
                FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                if (frameLayout != null) {
                    int i7 = extraCallback + 33;
                    readTypedObject = i7 % 128;
                    if (i7 % 2 == 0) {
                        i4 = R.id.label;
                        typography7OnNavigationEvent = (Typography7) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                        int i8 = 58 / 0;
                        if (typography7OnNavigationEvent != null) {
                            Typography7 typography7 = typography7OnNavigationEvent;
                            i4 = R.id.lottieIcon;
                            LottieAnimationView lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                            if (lottieAnimationViewOnNavigationEvent != null && (typography7OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.message))) != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.prefix))) != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) view;
                                i4 = R.id.scrollView;
                                MaxHeightScrollView maxHeightScrollView = (MaxHeightScrollView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                                if (maxHeightScrollView != null && (typography5OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.suffix))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.underline))) != null) {
                                    AFk1sSDK aFk1sSDK = new AFk1sSDK(relativeLayout, constraintLayoutOnNavigationEvent, tdsImageViewOnNavigationEvent, baseEditText, tdsRoundLayoutOnNavigationEvent, tdsImageViewOnNavigationEvent2, frameLayout, typography7, lottieAnimationViewOnNavigationEvent, typography7OnNavigationEvent2, typography5OnNavigationEvent, relativeLayout, maxHeightScrollView, typography5OnNavigationEvent2, viewOnNavigationEvent);
                                    int i9 = readTypedObject + 125;
                                    extraCallback = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        return aFk1sSDK;
                                    }
                                    throw null;
                                }
                            }
                        }
                    } else {
                        i4 = R.id.label;
                        typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                        if (typography7OnNavigationEvent != null) {
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
