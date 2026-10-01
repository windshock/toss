package com.google.android.exoplayer2.source.hls;

import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceInputStream;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class Aes128DataSource implements DataSource {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = -2571176208501574817L;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private CipherInputStream cipherInputStream;
    private final byte[] encryptionIv;
    private final byte[] encryptionKey;
    private final DataSource upstream;

    public Aes128DataSource(DataSource dataSource, byte[] bArr, byte[] bArr2) {
        this.upstream = dataSource;
        this.encryptionKey = bArr;
        this.encryptionIv = bArr2;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i4 = $10 + 3;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 45812), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 83, 21233 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 14185), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 18, 8808 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i7 = $10 + 125;
        $11 = i7 % 128;
        if (i7 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i8 = 59 / 0;
            objArr[0] = str;
        }
    }

    public final void addTransferListener(TransferListener transferListener) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 71;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Assertions.checkNotNull(transferListener);
            this.upstream.addTransferListener(transferListener);
            int i4 = onWarmupCompleted + 11;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        Assertions.checkNotNull(transferListener);
        this.upstream.addTransferListener(transferListener);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long open(DataSpec dataSpec) throws Throwable {
        int i2 = 2 % 2;
        try {
            Cipher cipherInstance = getCipherInstance();
            byte[] bArr = this.encryptionKey;
            Object[] objArr = new Object[1];
            a(new char[]{3494, 5048, 3559, 39854, 45508, 41265, 56762}, 1 - KeyEvent.normalizeMetaState(0), objArr);
            try {
                cipherInstance.init(2, new SecretKeySpec(bArr, ((String) objArr[0]).intern()), new IvParameterSpec(this.encryptionIv));
                DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(this.upstream, dataSpec);
                this.cipherInputStream = new CipherInputStream(dataSourceInputStream, cipherInstance);
                dataSourceInputStream.open();
                int i3 = onWarmupCompleted + 19;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return -1L;
                }
                throw null;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 77;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Assertions.checkNotNull(this.cipherInputStream);
        int i7 = this.cipherInputStream.read(bArr, i2, i3);
        if (i7 >= 0) {
            return i7;
        }
        int i8 = onNavigationEvent + 99;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 64 / 0;
        }
        return -1;
    }

    public final Uri getUri() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 107;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Uri uri = this.upstream.getUri();
        int i5 = onWarmupCompleted + 115;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return uri;
    }

    public final Map<String, List<String>> getResponseHeaders() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 45;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            this.upstream.getResponseHeaders();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, List<String>> responseHeaders = this.upstream.getResponseHeaders();
        int i4 = onNavigationEvent + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return responseHeaders;
    }

    public void close() throws IOException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 37;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (this.cipherInputStream != null) {
            this.cipherInputStream = null;
            this.upstream.close();
        }
        int i5 = onWarmupCompleted + 95;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    protected Cipher getCipherInstance() throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 103;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{26217, 7462, 26152, 38192, 24327, 20466, 6747, 33421, 18278, 46331, 28342, 41009, 9377, 55174, 3194, 49561, 1466, 61761, 11244, 59106, 58173, 4300, 51903, 1045}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1, objArr);
        Cipher cipher = Cipher.getInstance(((String) objArr[0]).intern());
        int i5 = onNavigationEvent + 55;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return cipher;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
