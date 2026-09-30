package o;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.source.TrackGroupArray$;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BottomSheetScaffoldKtExternalSyntheticLambda11 {
    public static final BottomSheetScaffoldKtExternalSyntheticLambda11 IAuthTabCallback = new BottomSheetScaffoldKtExternalSyntheticLambda11(new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[0]);
    private static final String onWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(0);
    private final ImmutableList<CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1> onExtraCallback;
    public final int onExtraCallbackWithResult;
    private int onNavigationEvent;

    public BottomSheetScaffoldKtExternalSyntheticLambda11(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1... coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr) {
        this.onExtraCallback = ImmutableList.copyOf(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr);
        this.onExtraCallbackWithResult = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr.length;
        onExtraCallback();
    }

    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 onWarmupCompleted(int i2) {
        return (CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1) this.onExtraCallback.get(i2);
    }

    public int IAuthTabCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1) {
        int iIndexOf = this.onExtraCallback.indexOf(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public ImmutableList<Integer> onExtraCallbackWithResult() {
        return ImmutableList.copyOf(Lists.transform(this.onExtraCallback, new Function() { // from class: androidx.media3.exoplayer.source.TrackGroupArray$$ExternalSyntheticLambda0
            public final Object apply(Object obj) {
                return Integer.valueOf(((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1) obj).onExtraCallback);
            }
        }));
    }

    public int hashCode() {
        if (this.onNavigationEvent == 0) {
            this.onNavigationEvent = this.onExtraCallback.hashCode();
        }
        return this.onNavigationEvent;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BottomSheetScaffoldKtExternalSyntheticLambda11.class != obj.getClass()) {
            return false;
        }
        BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11 = (BottomSheetScaffoldKtExternalSyntheticLambda11) obj;
        return this.onExtraCallbackWithResult == bottomSheetScaffoldKtExternalSyntheticLambda11.onExtraCallbackWithResult && this.onExtraCallback.equals(bottomSheetScaffoldKtExternalSyntheticLambda11.onExtraCallback);
    }

    public String toString() {
        return this.onExtraCallback.toString();
    }

    public Bundle IAuthTabCallback() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(onWarmupCompleted, TextFieldDecoratorModifierNodeExternalSyntheticLambda1.IAuthTabCallback(this.onExtraCallback, new Function() { // from class: androidx.media3.exoplayer.source.TrackGroupArray$$ExternalSyntheticLambda1
            public final Object apply(Object obj) {
                return ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1) obj).onNavigationEvent();
            }
        }));
        return bundle;
    }

    public static BottomSheetScaffoldKtExternalSyntheticLambda11 onNavigationEvent(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(onWarmupCompleted);
        if (parcelableArrayList == null) {
            return new BottomSheetScaffoldKtExternalSyntheticLambda11(new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[0]);
        }
        return new BottomSheetScaffoldKtExternalSyntheticLambda11((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[]) TextFieldDecoratorModifierNodeExternalSyntheticLambda1.onExtraCallback(new TrackGroupArray$.ExternalSyntheticLambda2(), parcelableArrayList).toArray(new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[0]));
    }

    private void onExtraCallback() {
        int i2 = 0;
        while (i2 < this.onExtraCallback.size()) {
            int i3 = i2 + 1;
            for (int i4 = i3; i4 < this.onExtraCallback.size(); i4++) {
                if (((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1) this.onExtraCallback.get(i2)).equals(this.onExtraCallback.get(i4))) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i2 = i3;
        }
    }
}
