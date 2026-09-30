package o;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.ToLongFunction;
import java.util.zip.Inflater;
import o.TTWebsiteActivity2;
import org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class dj15 implements Closeable {
    private volatile boolean IAuthTabCallbackDefault;
    private final ByteBuffer IAuthTabCallbackStub;
    private final Map<String, LinkedList<TTWebsiteActivity2>> asBinder;
    private final byte[] asInterface;
    private long onExtraCallback;
    private final boolean onTransact;
    private final SeekableByteChannel onWarmupCompleted;
    private static final byte[] onNavigationEvent = new byte[1];
    private static final long onExtraCallbackWithResult = dj12.onWarmupCompleted(TTWebsiteActivity8.onNavigationEvent);
    private static final Comparator<TTWebsiteActivity2> IAuthTabCallback = Comparator.comparingLong(new ToLongFunction() { // from class: org.apache.commons.compress.archivers.zip.ZipFile$$ExternalSyntheticLambda2
        @Override // java.util.function.ToLongFunction
        public final long applyAsLong(Object obj) {
            return ((TTWebsiteActivity2) obj).IAuthTabCallback();
        }
    }).thenComparingLong(new ToLongFunction() { // from class: org.apache.commons.compress.archivers.zip.ZipFile$$ExternalSyntheticLambda3
        @Override // java.util.function.ToLongFunction
        public final long applyAsLong(Object obj) {
            return ((TTWebsiteActivity2) obj).IAuthTabCallbackDefault();
        }
    });

    class onNavigationEvent extends PAGErrorModel {
        private final FileChannel onExtraCallback;

        onNavigationEvent(long j, long j2) {
            super(j, j2);
            this.onExtraCallback = (FileChannel) dj15.this.onWarmupCompleted;
        }

        @Override // o.PAGErrorModel
        public int onExtraCallbackWithResult(long j, ByteBuffer byteBuffer) throws IOException {
            int i = this.onExtraCallback.read(byteBuffer, j);
            byteBuffer.flip();
            return i;
        }
    }

    static class onExtraCallback extends TTWebsiteActivity2 {
        onExtraCallback() {
        }

        @Override // o.TTWebsiteActivity2
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            return IAuthTabCallbackDefault() == onextracallback.IAuthTabCallbackDefault() && super.onWarmupCompleted() == onextracallback.onWarmupCompleted() && super.IAuthTabCallback() == onextracallback.IAuthTabCallback();
        }

        @Override // o.TTWebsiteActivity2, java.util.zip.ZipEntry
        public int hashCode() {
            return (super.hashCode() * 3) + ((int) IAuthTabCallbackDefault()) + ((int) (IAuthTabCallbackDefault() >> 32));
        }
    }

    static class onWarmupCompleted extends PAGNativeAd1 {
        onWarmupCompleted(InputStream inputStream) {
            super(inputStream);
        }
    }

    public boolean IAuthTabCallback(TTWebsiteActivity2 tTWebsiteActivity2) {
        return dj5.IAuthTabCallback(tTWebsiteActivity2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.IAuthTabCallbackDefault = true;
        this.onWarmupCompleted.close();
    }

    private PAGErrorModel IAuthTabCallback(long j, long j2) {
        if (j < 0 || j2 < 0 || j + j2 < j) {
            throw new IllegalArgumentException("Corrupted archive, stream boundaries are out of range");
        }
        return this.onWarmupCompleted instanceof FileChannel ? new onNavigationEvent(j, j2) : new PAGNativeAd(j, j2, this.onWarmupCompleted);
    }

    public static /* synthetic */ LinkedList onExtraCallbackWithResult(String str) {
        return new LinkedList();
    }

    protected void finalize() throws Throwable {
        try {
            if (!this.IAuthTabCallbackDefault) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    private long onExtraCallbackWithResult(TTWebsiteActivity2 tTWebsiteActivity2) throws IOException {
        long jOnWarmupCompleted = tTWebsiteActivity2.onWarmupCompleted();
        if (jOnWarmupCompleted != -1) {
            return jOnWarmupCompleted;
        }
        onExtraCallback(tTWebsiteActivity2);
        return tTWebsiteActivity2.onWarmupCompleted();
    }

    public InputStream onNavigationEvent(TTWebsiteActivity2 tTWebsiteActivity2) throws IOException {
        if (!(tTWebsiteActivity2 instanceof onExtraCallback)) {
            return null;
        }
        dj5.onNavigationEvent(tTWebsiteActivity2);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(onWarmupCompleted(tTWebsiteActivity2));
        switch (AnonymousClass3.onNavigationEvent[dj14.getMethodByCode(tTWebsiteActivity2.getMethod()).ordinal()]) {
            case 1:
                return new onWarmupCompleted(bufferedInputStream);
            case 2:
                return new TTVideoLandingPageLink2Activity8(bufferedInputStream);
            case 3:
                try {
                    return new TTVideoLandingPageActivity8(tTWebsiteActivity2.onExtraCallback().onExtraCallbackWithResult(), tTWebsiteActivity2.onExtraCallback().onExtraCallback(), bufferedInputStream);
                } catch (IllegalArgumentException e) {
                    throw new IOException("bad IMPLODE data", e);
                }
            case 4:
                final Inflater inflater = new Inflater(true);
                return new TTVideoLandingPageLink2Activity10(new SequenceInputStream(bufferedInputStream, new ByteArrayInputStream(onNavigationEvent)), inflater) { // from class: o.dj15.1
                    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws IOException {
                        try {
                            super.close();
                        } finally {
                            inflater.end();
                        }
                    }
                };
            case 5:
                return new dj8(bufferedInputStream);
            case 6:
                return new ul4(bufferedInputStream);
            default:
                throw new UnsupportedZipFeatureException(dj14.getMethodByCode(tTWebsiteActivity2.getMethod()), tTWebsiteActivity2);
        }
    }

    /* renamed from: o.dj15$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[dj14.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[dj14.STORED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onNavigationEvent[dj14.UNSHRINKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onNavigationEvent[dj14.IMPLODING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onNavigationEvent[dj14.DEFLATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onNavigationEvent[dj14.BZIP2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onNavigationEvent[dj14.ENHANCED_DEFLATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                onNavigationEvent[dj14.AES_ENCRYPTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                onNavigationEvent[dj14.EXPANDING_LEVEL_1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                onNavigationEvent[dj14.EXPANDING_LEVEL_2.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                onNavigationEvent[dj14.EXPANDING_LEVEL_3.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                onNavigationEvent[dj14.EXPANDING_LEVEL_4.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                onNavigationEvent[dj14.JPEG.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                onNavigationEvent[dj14.LZMA.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                onNavigationEvent[dj14.PKWARE_IMPLODING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                onNavigationEvent[dj14.PPMD.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                onNavigationEvent[dj14.TOKENIZATION.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                onNavigationEvent[dj14.UNKNOWN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                onNavigationEvent[dj14.WAVPACK.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                onNavigationEvent[dj14.XZ.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    public InputStream onWarmupCompleted(TTWebsiteActivity2 tTWebsiteActivity2) throws IOException {
        if (!(tTWebsiteActivity2 instanceof onExtraCallback)) {
            return null;
        }
        long jOnExtraCallbackWithResult = onExtraCallbackWithResult(tTWebsiteActivity2);
        if (jOnExtraCallbackWithResult == -1) {
            return null;
        }
        return IAuthTabCallback(jOnExtraCallbackWithResult, tTWebsiteActivity2.getCompressedSize());
    }

    private int[] onExtraCallback(TTWebsiteActivity2 tTWebsiteActivity2) throws IOException {
        long jIAuthTabCallbackDefault = tTWebsiteActivity2.IAuthTabCallbackDefault();
        if (this.onTransact) {
            ((dj17) this.onWarmupCompleted).onNavigationEvent(tTWebsiteActivity2.IAuthTabCallback(), jIAuthTabCallbackDefault + 26);
            jIAuthTabCallbackDefault = this.onWarmupCompleted.position() - 26;
        } else {
            this.onWarmupCompleted.position(26 + jIAuthTabCallbackDefault);
        }
        this.IAuthTabCallbackStub.rewind();
        PAGNativeAdLoadListener.onExtraCallback(this.onWarmupCompleted, this.IAuthTabCallbackStub);
        this.IAuthTabCallbackStub.flip();
        this.IAuthTabCallbackStub.get(this.asInterface);
        int iOnExtraCallbackWithResult = dj4.onExtraCallbackWithResult(this.asInterface);
        this.IAuthTabCallbackStub.get(this.asInterface);
        int iOnExtraCallbackWithResult2 = dj4.onExtraCallbackWithResult(this.asInterface);
        tTWebsiteActivity2.onExtraCallback(jIAuthTabCallbackDefault + 30 + iOnExtraCallbackWithResult + iOnExtraCallbackWithResult2);
        if (tTWebsiteActivity2.onWarmupCompleted() + tTWebsiteActivity2.getCompressedSize() > this.onExtraCallback) {
            throw new IOException("data for " + tTWebsiteActivity2.getName() + " overlaps with central directory.");
        }
        return new int[]{iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2};
    }
}
