package o;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextInputServiceAndroidExternalSyntheticLambda0 implements SaversKtExternalSyntheticLambda24<ByteBuffer> {
    @Override // o.SaversKtExternalSyntheticLambda24
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public boolean onExtraCallback(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws Throwable {
        try {
            Barrier.onExtraCallbackWithResult(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
