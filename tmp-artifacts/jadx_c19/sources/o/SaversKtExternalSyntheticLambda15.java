package o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface SaversKtExternalSyntheticLambda15 {

    public interface onNavigationEvent {
        Bitmap onExtraCallbackWithResult(int i2, int i3, @NonNull Bitmap.Config config);

        void onExtraCallbackWithResult(@NonNull int[] iArr);

        byte[] onExtraCallbackWithResult(int i2);

        int[] onNavigationEvent(int i2);

        void onWarmupCompleted(@NonNull Bitmap bitmap);

        void onWarmupCompleted(@NonNull byte[] bArr);
    }

    void IAuthTabCallback();

    int IAuthTabCallbackDefault();

    Bitmap asBinder();

    int asInterface();

    void onExtraCallback();

    int onExtraCallbackWithResult();

    void onExtraCallbackWithResult(@NonNull Bitmap.Config config);

    ByteBuffer onNavigationEvent();

    void onTransact();

    int onWarmupCompleted();
}
