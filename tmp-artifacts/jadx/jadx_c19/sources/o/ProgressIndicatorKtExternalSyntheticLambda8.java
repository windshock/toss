package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Function;
import java.util.ArrayList;
import java.util.List;
import o.ImeEditCommand_androidKtExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ProgressIndicatorKtExternalSyntheticLambda8 {
    public byte[] onWarmupCompleted(List<ImeEditCommand_androidKtExternalSyntheticLambda1> list, long j) {
        ArrayList<? extends Parcelable> arrayListIAuthTabCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda1.IAuthTabCallback(list, new Function() { // from class: androidx.media3.extractor.text.CueEncoder$$ExternalSyntheticLambda0
            public final Object apply(Object obj) {
                return ((ImeEditCommand_androidKtExternalSyntheticLambda1) obj).IAuthTabCallback();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListIAuthTabCallback);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
