package o;

import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.common.text.CueGroup$;
import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RadioButtonColors {
    public RadioButtonDefaults onExtraCallbackWithResult(long j, byte[] bArr, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i2, i3);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new RadioButtonDefaults(TextFieldDecoratorModifierNodeExternalSyntheticLambda1.onExtraCallback(new CueGroup$.ExternalSyntheticLambda1(), (ArrayList) RecordingInputConnection_androidKt.onExtraCallbackWithResult(bundle.getParcelableArrayList("c"))), j, bundle.getLong("d"));
    }
}
