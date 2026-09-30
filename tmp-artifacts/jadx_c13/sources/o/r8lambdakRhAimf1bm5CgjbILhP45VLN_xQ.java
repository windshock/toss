package o;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ extends TextFieldScrollKtExternalSyntheticLambda0 {
    void addSubscription(@NonNull deserializeUriNullableCollection deserializeurinullablecollection);

    FragmentActivity getActivity();

    Context getContext();

    Parcelable getInstanceStateData(int i);

    View getView();

    void putInstanceStateData(int i, @Nullable Parcelable parcelable);

    void removeSubscription(@NonNull deserializeUriNullableCollection deserializeurinullablecollection);
}
