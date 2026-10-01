package o;

import java.io.IOException;
import java.io.InputStream;
import org.tukaani.xz.DeltaOptions;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class TTPlayableLandingPageActivity3 extends TTLandingPageActivityzb {
    TTPlayableLandingPageActivity3() {
        super(Number.class);
    }

    @Override // o.TTLandingPageActivityzb
    InputStream onNavigationEvent(String str, InputStream inputStream, long j, TTPlayableLandingPageActivity4 tTPlayableLandingPageActivity4, byte[] bArr, int i) throws IOException {
        return new DeltaOptions(IAuthTabCallback(tTPlayableLandingPageActivity4)).getInputStream(inputStream);
    }

    @Override // o.TTLandingPageActivityzb
    byte[] onWarmupCompleted(Object obj) {
        return new byte[]{(byte) (TTLandingPageActivityzb.onExtraCallbackWithResult(obj, 1) - 1)};
    }

    private int IAuthTabCallback(TTPlayableLandingPageActivity4 tTPlayableLandingPageActivity4) {
        byte[] bArr = tTPlayableLandingPageActivity4.onWarmupCompleted;
        if (bArr == null || bArr.length == 0) {
            return 1;
        }
        return (bArr[0] & 255) + 1;
    }

    @Override // o.TTLandingPageActivityzb
    Object onExtraCallback(TTPlayableLandingPageActivity4 tTPlayableLandingPageActivity4, InputStream inputStream) {
        return Integer.valueOf(IAuthTabCallback(tTPlayableLandingPageActivity4));
    }
}
