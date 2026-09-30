package o;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class RecyclerViewItemAnimator$onExtraCallback {
    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T IAuthTabCallback(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends Parcelable> void onNavigationEvent(Parcel parcel, T t, int i) {
        if (t != null) {
            parcel.writeInt(1);
            t.writeToParcel(parcel, i);
        } else {
            parcel.writeInt(0);
        }
    }
}
