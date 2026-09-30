package org.bouncycastle.est;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Set;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.est.HttpUtil;
import org.bouncycastle.util.Properties;
import org.bouncycastle.util.Strings;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ESTResponse {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static final Long ZERO;
    private static int asInterface = 1;
    private static boolean onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static int onTransact;
    private static boolean onWarmupCompleted;
    private String HttpVersion;
    private Long absoluteReadLimit;
    private Long contentLength;
    private final HttpUtil.Headers headers;
    private InputStream inputStream;
    private final byte[] lineBuffer;
    private final ESTRequest originalRequest;
    private long read = 0;
    private final Source source;
    private int statusCode;
    private String statusMessage;

    class PrintingInputStream extends InputStream {
        private final InputStream src;

        private PrintingInputStream(InputStream inputStream) {
            this.src = inputStream;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.src.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.src.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            return this.src.read();
        }
    }

    static {
        IAuthTabCallback();
        ZERO = 0L;
        int i = asInterface + 85;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ESTResponse(ESTRequest eSTRequest, Source source) throws Throwable {
        InputStream printingInputStream;
        this.originalRequest = eSTRequest;
        this.source = source;
        if (source instanceof LimitedSource) {
            this.absoluteReadLimit = ((LimitedSource) source).getAbsoluteReadLimit();
        }
        Set setAsKeySet = Properties.asKeySet("org.bouncycastle.debug.est");
        Object[] objArr = new Object[1];
        AnonymousClass1 anonymousClass1 = null;
        a(null, null, new byte[]{ISOFileInfo.PROP_INFO, -124, ISOFileInfo.FILE_IDENTIFIER, -126, ISOFileInfo.DATA_BYTES2}, View.MeasureSpec.makeMeasureSpec(0, 0) + CertificateBody.profileType, objArr);
        if (!setAsKeySet.contains(((String) objArr[0]).intern())) {
            int i = onTransact + 33;
            IAuthTabCallbackStub = i % 128;
            int i2 = i % 2;
            boolean zContains = setAsKeySet.contains("all");
            if (i2 == 0) {
                int i3 = 11 / 0;
                if (zContains) {
                    printingInputStream = new PrintingInputStream(source.getInputStream());
                    int i4 = IAuthTabCallbackStub + 67;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 2 % 2;
                } else {
                    int i7 = onTransact + 21;
                    IAuthTabCallbackStub = i7 % 128;
                    if (i7 % 2 == 0) {
                        source.getInputStream();
                        anonymousClass1.hashCode();
                        throw null;
                    }
                    printingInputStream = source.getInputStream();
                }
            } else if (!zContains) {
            }
        }
        this.inputStream = printingInputStream;
        int i8 = 2 % 2;
        this.headers = new HttpUtil.Headers();
        this.lineBuffer = new byte[1024];
        process();
        int i9 = onTransact + 63;
        IAuthTabCallbackStub = i9 % 128;
        int i10 = i9 % 2;
    }

    static /* synthetic */ long access$100(ESTResponse eSTResponse) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 9;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long j = eSTResponse.read;
        int i5 = i2 + 53;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    static /* synthetic */ long access$108(ESTResponse eSTResponse) {
        long j;
        long j2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            j = eSTResponse.read;
            j2 = 0;
        } else {
            j = eSTResponse.read;
            j2 = 1 + j;
        }
        eSTResponse.read = j2;
        return j;
    }

    static /* synthetic */ Long access$200(ESTResponse eSTResponse) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 93;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Long l = eSTResponse.contentLength;
        int i5 = i2 + 27;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    private void process() throws IOException {
        int i = 2 % 2;
        this.HttpVersion = readStringIncluding(' ');
        this.statusCode = Integer.parseInt(readStringIncluding(' '));
        this.statusMessage = readStringIncluding('\n');
        while (true) {
            String stringIncluding = readStringIncluding('\n');
            if (stringIncluding.length() <= 0) {
                break;
            }
            int iIndexOf = stringIncluding.indexOf(58);
            if (iIndexOf >= 0) {
                this.headers.add(Strings.toLowerCase(stringIncluding.substring(0, iIndexOf).trim()), stringIncluding.substring(iIndexOf + 1).trim());
            }
        }
        Long contentLength = getContentLength();
        this.contentLength = contentLength;
        int i2 = this.statusCode;
        if (i2 == 204 || i2 == 202) {
            if (contentLength == null) {
                int i3 = onTransact + 73;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                this.contentLength = 0L;
            } else if (i2 == 204) {
                int i5 = onTransact + 11;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                if (contentLength.longValue() > 0) {
                    throw new IOException("Got HTTP status 204 but Content-length > 0.");
                }
            }
        }
        Long l = this.contentLength;
        if (l == null) {
            throw new IOException("No Content-length header.");
        }
        if (l.equals(ZERO)) {
            this.inputStream = new InputStream() { // from class: org.bouncycastle.est.ESTResponse.1
                @Override // java.io.InputStream
                public int read() throws IOException {
                    return -1;
                }
            };
        }
        if (this.contentLength.longValue() < 0) {
            throw new IOException("Server returned negative content length: " + this.absoluteReadLimit);
        }
        if (this.absoluteReadLimit == null || this.contentLength.longValue() < this.absoluteReadLimit.longValue()) {
            this.inputStream = wrapWithCounter(this.inputStream, this.absoluteReadLimit);
            if ("base64".equalsIgnoreCase(getHeader("content-transfer-encoding"))) {
                this.inputStream = new CTEBase64InputStream(this.inputStream, getContentLength());
                return;
            }
            return;
        }
        throw new IOException("Content length longer than absolute read limit: " + this.absoluteReadLimit + " Content-Length: " + this.contentLength);
    }

    public void close() throws IOException {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        InputStream inputStream = this.inputStream;
        if (inputStream != null) {
            int i4 = i3 + 83;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            inputStream.close();
            if (i5 != 0) {
                throw null;
            }
        }
        this.source.close();
    }

    public Long getContentLength() {
        int i = 2 % 2;
        String firstValue = this.headers.getFirstValue("Content-Length");
        if (firstValue == null) {
            int i2 = onTransact;
            int i3 = i2 + 105;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 75;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(firstValue));
        } catch (RuntimeException e) {
            throw new RuntimeException("Content Length: '" + firstValue + "' invalid. " + e.getMessage());
        }
    }

    public String getHeader(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.headers.getFirstValue(str);
            obj.hashCode();
            throw null;
        }
        String firstValue = this.headers.getFirstValue(str);
        int i3 = onTransact + 11;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return firstValue;
        }
        obj.hashCode();
        throw null;
    }

    public HttpUtil.Headers getHeaders() {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        HttpUtil.Headers headers = this.headers;
        int i5 = i3 + 51;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
        return headers;
    }

    public String getHttpVersion() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 39;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.HttpVersion;
        int i4 = i2 + 33;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public InputStream getInputStream() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        InputStream inputStream = this.inputStream;
        int i5 = i3 + 71;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return inputStream;
    }

    public ESTRequest getOriginalRequest() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 77;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        ESTRequest eSTRequest = this.originalRequest;
        int i5 = i2 + 55;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return eSTRequest;
        }
        throw null;
    }

    public Source getSource() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 61;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Source source = this.source;
        int i4 = i2 + 53;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return source;
    }

    public int getStatusCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 75;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.statusCode;
        int i6 = i2 + 41;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getStatusMessage() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 3;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        String str = this.statusMessage;
        int i5 = i2 + 55;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return str;
    }

    protected String readStringIncluding(char c) throws IOException {
        int i;
        byte[] bArr;
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 9;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (true) {
            i = this.inputStream.read();
            bArr = this.lineBuffer;
            i2 = i6 + 1;
            bArr[i6] = (byte) i;
            if (i2 >= bArr.length) {
                throw new IOException("Server sent line > " + this.lineBuffer.length);
            }
            if (i == c || i < 0) {
                break;
            }
            int i7 = onTransact + 49;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            i6 = i2;
        }
        if (i != -1) {
            return new String(bArr, 0, i2).trim();
        }
        throw new EOFException();
    }

    protected InputStream wrapWithCounter(final InputStream inputStream, final Long l) {
        int i = 2 % 2;
        InputStream inputStream2 = new InputStream() { // from class: org.bouncycastle.est.ESTResponse.2
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (ESTResponse.access$200(ESTResponse.this) == null || ESTResponse.access$200(ESTResponse.this).longValue() - 1 <= ESTResponse.access$100(ESTResponse.this)) {
                    if (inputStream.available() > 0) {
                        throw new IOException("Stream closed with extra content in pipe that exceeds content length.");
                    }
                    inputStream.close();
                } else {
                    throw new IOException("Stream closed before limit fully read, Read: " + ESTResponse.access$100(ESTResponse.this) + " ContentLength: " + ESTResponse.access$200(ESTResponse.this));
                }
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                int i2 = inputStream.read();
                if (i2 >= 0) {
                    ESTResponse.access$108(ESTResponse.this);
                    if (l != null && ESTResponse.access$100(ESTResponse.this) >= l.longValue()) {
                        throw new IOException("Absolute Read Limit exceeded: " + l);
                    }
                }
                return i2;
            }
        };
        int i2 = IAuthTabCallbackStub + 51;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 55 / 0;
        }
        return inputStream2;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onNavigationEvent;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 61;
                $10 = i6 % 128;
                if (i6 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 76, 20953 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 77 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 20951, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5++;
                }
                i3 = 2;
                j = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 76 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 16037 - Color.red(0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (onExtraCallback) {
            int i7 = $10 + 67;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 62 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), ImageFormat.getBitsPerPixel(0) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i9 = $11 + 97;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (onWarmupCompleted) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 63 - ExpandableListView.getPackedPositionGroup(0L), 12214 - Color.alpha(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i11 = $10 + 113;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] * i] >> iIntValue);
                i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted - 1;
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
            }
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
        }
        objArr[0] = new String(cArr6);
    }

    static void IAuthTabCallback() {
        onNavigationEvent = new char[]{32479, 32466, 32464, 32459, 32468};
        onExtraCallbackWithResult = -1184334016;
        onWarmupCompleted = true;
        onExtraCallback = true;
    }
}
