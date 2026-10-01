package o;

import java.io.IOException;
import java.io.InputStream;
import net.sf.scuba.smartcards.ISO7816;
import org.apache.commons.compress.MemoryLimitException;
import org.tukaani.xz.LZMA2InputStream;
import org.tukaani.xz.LZMA2Options;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class TTPlayableLandingPageActivity7 extends TTLandingPageActivityzb {
    TTPlayableLandingPageActivity7() {
        super(LZMA2Options.class, Number.class);
    }

    @Override // o.TTLandingPageActivityzb
    InputStream onNavigationEvent(String str, InputStream inputStream, long j, TTPlayableLandingPageActivity4 tTPlayableLandingPageActivity4, byte[] bArr, int i) throws IOException {
        try {
            int iOnWarmupCompleted = onWarmupCompleted(tTPlayableLandingPageActivity4);
            int memoryUsage = LZMA2InputStream.getMemoryUsage(iOnWarmupCompleted);
            if (memoryUsage > i) {
                throw new MemoryLimitException(memoryUsage, i);
            }
            return new LZMA2InputStream(inputStream, iOnWarmupCompleted);
        } catch (IllegalArgumentException e) {
            throw new IOException(e);
        }
    }

    private int onWarmupCompleted(TTPlayableLandingPageActivity4 tTPlayableLandingPageActivity4) throws IOException {
        byte[] bArr = tTPlayableLandingPageActivity4.onWarmupCompleted;
        if (bArr == null) {
            throw new IOException("Missing LZMA2 properties");
        }
        if (bArr.length <= 0) {
            throw new IOException("LZMA2 properties too short");
        }
        byte b = bArr[0];
        int i = b & 255;
        if ((b & ISO7816.INS_GET_RESPONSE) != 0) {
            throw new IOException("Unsupported LZMA2 property bits");
        }
        if (i > 40) {
            throw new IOException("Dictionary larger than 4GiB maximum size");
        }
        if (i == 40) {
            return -1;
        }
        return ((b & 1) | 2) << ((i / 2) + 11);
    }

    private int onExtraCallback(Object obj) {
        if (obj instanceof LZMA2Options) {
            return ((LZMA2Options) obj).getDictSize();
        }
        return IAuthTabCallback(obj);
    }

    @Override // o.TTLandingPageActivityzb
    byte[] onWarmupCompleted(Object obj) {
        return new byte[]{(byte) (((19 - Integer.numberOfLeadingZeros(onExtraCallback(obj))) << 1) + ((r4 >>> (30 - r0)) - 2))};
    }

    @Override // o.TTLandingPageActivityzb
    Object onExtraCallback(TTPlayableLandingPageActivity4 tTPlayableLandingPageActivity4, InputStream inputStream) throws IOException {
        return Integer.valueOf(onWarmupCompleted(tTPlayableLandingPageActivity4));
    }

    private int IAuthTabCallback(Object obj) {
        return TTLandingPageActivityzb.onExtraCallbackWithResult(obj, 8388608);
    }
}
