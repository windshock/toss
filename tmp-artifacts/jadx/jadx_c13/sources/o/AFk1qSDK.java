package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography1;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.uikit.R;
import im.toss.uikit.widget.textField.BaseEditText;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFk1qSDK implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallback_Parcel = 0;
    private static int readTypedObject = 1;
    public final BaseEditText IAuthTabCallback;
    public final TdsImageView IAuthTabCallbackDefault;
    public final Space IAuthTabCallbackStub;
    public final Space IAuthTabCallbackStubProxy;
    private final View access000;
    public final Typography1 access100;
    public final Typography7 asBinder;
    public final Space asInterface;
    public final Barrier getInterfaceDescriptor;
    public final View onExtraCallback;
    public final TdsImageView onExtraCallbackWithResult;
    public final ConstraintLayout onNavigationEvent;
    public final Space onTransact;
    public final TdsImageView onWarmupCompleted;

    private AFk1qSDK(@NonNull View view, @NonNull TdsImageView tdsImageView, @NonNull View view2, @NonNull BaseEditText baseEditText, @NonNull ConstraintLayout constraintLayout, @NonNull TdsImageView tdsImageView2, @NonNull Typography7 typography7, @NonNull TdsImageView tdsImageView3, @NonNull Space space, @NonNull Space space2, @NonNull Space space3, @NonNull Space space4, @NonNull Typography1 typography1, @NonNull Barrier barrier) {
        this.access000 = view;
        this.onExtraCallbackWithResult = tdsImageView;
        this.onExtraCallback = view2;
        this.IAuthTabCallback = baseEditText;
        this.onNavigationEvent = constraintLayout;
        this.onWarmupCompleted = tdsImageView2;
        this.asBinder = typography7;
        this.IAuthTabCallbackDefault = tdsImageView3;
        this.IAuthTabCallbackStub = space;
        this.asInterface = space2;
        this.onTransact = space3;
        this.IAuthTabCallbackStubProxy = space4;
        this.access100 = typography1;
        this.getInterfaceDescriptor = barrier;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 81;
        int i3 = i2 % 128;
        readTypedObject = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        View view = this.access000;
        int i4 = i3 + 53;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return view;
        }
        throw null;
    }

    public static AFk1qSDK IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 17;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.text_field_v2, viewGroup);
        AFk1qSDK aFk1qSDKOnExtraCallbackWithResult = onExtraCallbackWithResult(viewGroup);
        int i4 = readTypedObject + 47;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return aFk1qSDKOnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0078 A[PHI: r10
      0x0078: PHI (r10v3 android.widget.Space) = (r10v2 android.widget.Space), (r10v6 android.widget.Space) binds: [B:24:0x0076, B:21:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0 A[PHI: r13
      0x00b0: PHI (r13v3 android.widget.Space) = (r13v2 android.widget.Space), (r13v6 android.widget.Space) binds: [B:35:0x00ae, B:32:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AFk1qSDK onExtraCallbackWithResult(@NonNull View view) {
        ConstraintLayout constraintLayoutOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        Typography7 typography7OnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent2;
        Space space;
        Space space2;
        int i = 2 % 2;
        int i2 = R.id.clear;
        TdsImageView tdsImageViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (tdsImageViewOnNavigationEvent3 != null) {
            int i3 = IAuthTabCallback_Parcel + 85;
            readTypedObject = i3 % 128;
            if (i3 % 2 == 0) {
                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.disabledView);
                throw null;
            }
            i2 = R.id.disabledView;
            View viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (viewOnNavigationEvent != null) {
                i2 = R.id.editText;
                BaseEditText baseEditText = (BaseEditText) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (baseEditText != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.editTextLayout))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.icon))) != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.message))) != null && (tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.password_toggle))) != null) {
                    int i4 = readTypedObject + 67;
                    IAuthTabCallback_Parcel = i4 % 128;
                    if (i4 % 2 != 0) {
                        i2 = R.id.spaceBottom;
                        space = (Space) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                        int i5 = 73 / 0;
                        if (space != null) {
                            i2 = R.id.spaceLeft;
                            Space space3 = (Space) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                            if (space3 != null) {
                                i2 = R.id.spaceRight;
                                Space space4 = (Space) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                if (space4 != null) {
                                    int i6 = IAuthTabCallback_Parcel + 91;
                                    readTypedObject = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        i2 = R.id.spaceTop;
                                        space2 = (Space) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                        int i7 = 81 / 0;
                                        if (space2 != null) {
                                            i2 = R.id.suffix;
                                            Typography1 typography1OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                            if (typography1OnNavigationEvent != null) {
                                                int i8 = readTypedObject + 77;
                                                IAuthTabCallback_Parcel = i8 % 128;
                                                if (i8 % 2 != 0) {
                                                    SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.suffixBarrier);
                                                    Object obj = null;
                                                    obj.hashCode();
                                                    throw null;
                                                }
                                                i2 = R.id.suffixBarrier;
                                                Barrier barrierOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                                if (barrierOnNavigationEvent != null) {
                                                    AFk1qSDK aFk1qSDK = new AFk1qSDK(view, tdsImageViewOnNavigationEvent3, viewOnNavigationEvent, baseEditText, constraintLayoutOnNavigationEvent, tdsImageViewOnNavigationEvent, typography7OnNavigationEvent, tdsImageViewOnNavigationEvent2, space, space3, space4, space2, typography1OnNavigationEvent, barrierOnNavigationEvent);
                                                    int i9 = readTypedObject + 29;
                                                    IAuthTabCallback_Parcel = i9 % 128;
                                                    int i10 = i9 % 2;
                                                    return aFk1qSDK;
                                                }
                                            }
                                        }
                                    } else {
                                        i2 = R.id.spaceTop;
                                        space2 = (Space) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                        if (space2 != null) {
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        i2 = R.id.spaceBottom;
                        space = (Space) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                        if (space != null) {
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
