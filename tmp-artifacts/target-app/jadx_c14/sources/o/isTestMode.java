package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class isTestMode extends ViewModel {
    public static final int $stable = 8;
    private final deserializeUriCollection IAuthTabCallback = new deserializeUriCollection();

    public final <T> LiveData<T> onNavigationEvent(@NotNull MutableLiveData<T> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        return mutableLiveData;
    }

    public void onCleared() {
        super.onCleared();
        this.IAuthTabCallback.dispose();
    }

    public final deserializeUriNullableCollection onExtraCallbackWithResult(@NotNull deserializeUriNullableCollection deserializeurinullablecollection) {
        Intrinsics.checkNotNullParameter(deserializeurinullablecollection, "");
        access27600.onExtraCallback(this.IAuthTabCallback, deserializeurinullablecollection);
        return deserializeurinullablecollection;
    }
}
