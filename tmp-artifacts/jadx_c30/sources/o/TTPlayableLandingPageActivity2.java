package o;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.tukaani.xz.ARMOptions;
import org.tukaani.xz.ARMThumbOptions;
import org.tukaani.xz.FilterOptions;
import org.tukaani.xz.IA64Options;
import org.tukaani.xz.PowerPCOptions;
import org.tukaani.xz.SPARCOptions;
import org.tukaani.xz.X86Options;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class TTPlayableLandingPageActivity2 {
    private static final Map<TTRewardVideoActivity, TTLandingPageActivityzb> onWarmupCompleted = new HashMap<TTRewardVideoActivity, TTLandingPageActivityzb>() { // from class: o.TTPlayableLandingPageActivity2.3
        private static final long serialVersionUID = 1664829131806520867L;

        {
            put(TTRewardVideoActivity.COPY, new IAuthTabCallback());
            put(TTRewardVideoActivity.LZMA, new TTPlayableLandingPageActivity6());
            put(TTRewardVideoActivity.LZMA2, new TTPlayableLandingPageActivity7());
            put(TTRewardVideoActivity.DEFLATE, new onExtraCallback());
            put(TTRewardVideoActivity.DEFLATE64, new onExtraCallbackWithResult());
            put(TTRewardVideoActivity.BZIP2, new onNavigationEvent());
            put(TTRewardVideoActivity.AES256SHA256, new TTLandingPageActivity9());
            put(TTRewardVideoActivity.BCJ_X86_FILTER, new onWarmupCompleted(new X86Options()));
            put(TTRewardVideoActivity.BCJ_PPC_FILTER, new onWarmupCompleted(new PowerPCOptions()));
            put(TTRewardVideoActivity.BCJ_IA64_FILTER, new onWarmupCompleted(new IA64Options()));
            put(TTRewardVideoActivity.BCJ_ARM_FILTER, new onWarmupCompleted(new ARMOptions()));
            put(TTRewardVideoActivity.BCJ_ARM_THUMB_FILTER, new onWarmupCompleted(new ARMThumbOptions()));
            put(TTRewardVideoActivity.BCJ_SPARC_FILTER, new onWarmupCompleted(new SPARCOptions()));
            put(TTRewardVideoActivity.DELTA_FILTER, new TTPlayableLandingPageActivity3());
        }
    };

    TTPlayableLandingPageActivity2() {
    }

    static class onWarmupCompleted extends TTLandingPageActivityzb {
        private final FilterOptions onExtraCallbackWithResult;

        onWarmupCompleted(FilterOptions filterOptions) {
            super(new Class[0]);
            this.onExtraCallbackWithResult = filterOptions;
        }

        @Override // o.TTLandingPageActivityzb
        InputStream onNavigationEvent(String str, InputStream inputStream, long j, TTPlayableLandingPageActivity4 tTPlayableLandingPageActivity4, byte[] bArr, int i) throws IOException {
            try {
                return this.onExtraCallbackWithResult.getInputStream(inputStream);
            } catch (AssertionError e) {
                throw new IOException("BCJ filter used in " + str + " needs XZ for Java > 1.4 - see https://commons.apache.org/proper/commons-compress/limitations.html#7Z", e);
            }
        }
    }

    static class onNavigationEvent extends TTLandingPageActivityzb {
        onNavigationEvent() {
            super(Number.class);
        }

        @Override // o.TTLandingPageActivityzb
        InputStream onNavigationEvent(String str, InputStream inputStream, long j, TTPlayableLandingPageActivity4 tTPlayableLandingPageActivity4, byte[] bArr, int i) throws IOException {
            return new dj8(inputStream);
        }
    }

    static class IAuthTabCallback extends TTLandingPageActivityzb {
        @Override // o.TTLandingPageActivityzb
        InputStream onNavigationEvent(String str, InputStream inputStream, long j, TTPlayableLandingPageActivity4 tTPlayableLandingPageActivity4, byte[] bArr, int i) throws IOException {
            return inputStream;
        }

        IAuthTabCallback() {
            super(new Class[0]);
        }
    }

    static class onExtraCallbackWithResult extends TTLandingPageActivityzb {
        onExtraCallbackWithResult() {
            super(Number.class);
        }

        @Override // o.TTLandingPageActivityzb
        InputStream onNavigationEvent(String str, InputStream inputStream, long j, TTPlayableLandingPageActivity4 tTPlayableLandingPageActivity4, byte[] bArr, int i) throws IOException {
            return new ul4(inputStream);
        }
    }

    static class onExtraCallback extends TTLandingPageActivityzb {
        private static final byte[] onExtraCallbackWithResult = new byte[1];

        static class onNavigationEvent extends InputStream {
            final InflaterInputStream IAuthTabCallback;
            Inflater onExtraCallback;

            public onNavigationEvent(InflaterInputStream inflaterInputStream, Inflater inflater) {
                this.IAuthTabCallback = inflaterInputStream;
                this.onExtraCallback = inflater;
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                try {
                    this.IAuthTabCallback.close();
                } finally {
                    this.onExtraCallback.end();
                }
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                return this.IAuthTabCallback.read();
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr) throws IOException {
                return this.IAuthTabCallback.read(bArr);
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                return this.IAuthTabCallback.read(bArr, i, i2);
            }
        }

        onExtraCallback() {
            super(Number.class);
        }

        @Override // o.TTLandingPageActivityzb
        InputStream onNavigationEvent(String str, InputStream inputStream, long j, TTPlayableLandingPageActivity4 tTPlayableLandingPageActivity4, byte[] bArr, int i) throws IOException {
            Inflater inflater = new Inflater(true);
            return new onNavigationEvent(new InflaterInputStream(new SequenceInputStream(inputStream, new ByteArrayInputStream(onExtraCallbackWithResult)), inflater), inflater);
        }
    }

    static InputStream IAuthTabCallback(String str, InputStream inputStream, long j, TTPlayableLandingPageActivity4 tTPlayableLandingPageActivity4, byte[] bArr, int i) throws IOException {
        TTLandingPageActivityzb tTLandingPageActivityzbOnExtraCallback = onExtraCallback(TTRewardVideoActivity.byId(tTPlayableLandingPageActivity4.IAuthTabCallback));
        if (tTLandingPageActivityzbOnExtraCallback == null) {
            throw new IOException("Unsupported compression method " + Arrays.toString(tTPlayableLandingPageActivity4.IAuthTabCallback) + " used in " + str);
        }
        return tTLandingPageActivityzbOnExtraCallback.onNavigationEvent(str, inputStream, j, tTPlayableLandingPageActivity4, bArr, i);
    }

    static TTLandingPageActivityzb onExtraCallback(TTRewardVideoActivity tTRewardVideoActivity) {
        return onWarmupCompleted.get(tTRewardVideoActivity);
    }
}
