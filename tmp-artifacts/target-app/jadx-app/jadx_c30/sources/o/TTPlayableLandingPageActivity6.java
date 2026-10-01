package o;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.MemoryLimitException;
import org.tukaani.xz.LZMA2Options;
import org.tukaani.xz.LZMAInputStream;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class TTPlayableLandingPageActivity6 extends TTLandingPageActivityzb {
    TTPlayableLandingPageActivity6() {
        super(LZMA2Options.class, Number.class);
    }

    @Override // o.TTLandingPageActivityzb
    InputStream onNavigationEvent(String str, InputStream inputStream, long j, TTPlayableLandingPageActivity4 tTPlayableLandingPageActivity4, byte[] bArr, int i) throws IOException, IllegalArgumentException {
        byte[] bArr2 = tTPlayableLandingPageActivity4.onWarmupCompleted;
        if (bArr2 == null) {
            throw new IOException("Missing LZMA properties");
        }
        if (bArr2.length <= 0) {
            throw new IOException("LZMA properties too short");
        }
        byte b = bArr2[0];
        int iOnExtraCallback = onExtraCallback(tTPlayableLandingPageActivity4);
        if (iOnExtraCallback > 2147483632) {
            throw new IOException("Dictionary larger than 4GiB maximum size used in " + str);
        }
        int memoryUsage = LZMAInputStream.getMemoryUsage(iOnExtraCallback, b);
        if (memoryUsage > i) {
            throw new MemoryLimitException(memoryUsage, i);
        }
        LZMAInputStream lZMAInputStream = new LZMAInputStream(inputStream, j, b, iOnExtraCallback);
        lZMAInputStream.enableRelaxedEndCondition();
        return lZMAInputStream;
    }

    private int onExtraCallback(TTPlayableLandingPageActivity4 tTPlayableLandingPageActivity4) throws IllegalArgumentException {
        return (int) showPrivacyActivity.onExtraCallbackWithResult(tTPlayableLandingPageActivity4.onWarmupCompleted, 1, 4);
    }

    private LZMA2Options onExtraCallback(Object obj) throws IOException {
        if (obj instanceof LZMA2Options) {
            return (LZMA2Options) obj;
        }
        LZMA2Options lZMA2Options = new LZMA2Options();
        lZMA2Options.setDictSize(IAuthTabCallback(obj));
        return lZMA2Options;
    }

    @Override // o.TTLandingPageActivityzb
    byte[] onWarmupCompleted(Object obj) throws IOException {
        LZMA2Options lZMA2OptionsOnExtraCallback = onExtraCallback(obj);
        byte pb = (byte) ((((lZMA2OptionsOnExtraCallback.getPb() * 5) + lZMA2OptionsOnExtraCallback.getLp()) * 9) + lZMA2OptionsOnExtraCallback.getLc());
        int dictSize = lZMA2OptionsOnExtraCallback.getDictSize();
        byte[] bArr = new byte[5];
        bArr[0] = pb;
        showPrivacyActivity.onNavigationEvent(bArr, dictSize, 1, 4);
        return bArr;
    }

    @Override // o.TTLandingPageActivityzb
    Object onExtraCallback(TTPlayableLandingPageActivity4 tTPlayableLandingPageActivity4, InputStream inputStream) throws IOException {
        byte[] bArr = tTPlayableLandingPageActivity4.onWarmupCompleted;
        if (bArr == null) {
            throw new IOException("Missing LZMA properties");
        }
        if (bArr.length <= 0) {
            throw new IOException("LZMA properties too short");
        }
        int i = bArr[0] & 255;
        int i2 = i / 45;
        int i3 = i - (i2 * 45);
        int i4 = i3 / 9;
        LZMA2Options lZMA2Options = new LZMA2Options();
        lZMA2Options.setPb(i2);
        lZMA2Options.setLcLp(i3 - (i4 * 9), i4);
        lZMA2Options.setDictSize(onExtraCallback(tTPlayableLandingPageActivity4));
        return lZMA2Options;
    }

    private int IAuthTabCallback(Object obj) {
        return TTLandingPageActivityzb.onExtraCallbackWithResult(obj, 8388608);
    }
}
