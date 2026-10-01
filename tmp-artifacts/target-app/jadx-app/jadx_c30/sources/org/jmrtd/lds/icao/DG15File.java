package org.jmrtd.lds.icao;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.smartcards.BuildConfig;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import org.jmrtd.Util;
import org.jmrtd.lds.DataGroup;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class DG15File extends DataGroup {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 0;
    private static final Logger LOGGER;
    private static final String[] PUBLIC_KEY_ALGORITHMS;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private static final long serialVersionUID = 3834304239673755744L;
    private PublicKey publicKey;

    static {
        onExtraCallback();
        LOGGER = Logger.getLogger("org.jmrtd");
        Object[] objArr = new Object[1];
        a(new char[]{22472, 21222, 23941}, 1327 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{22495, 25920}, 12953 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), objArr2);
        PUBLIC_KEY_ALGORITHMS = new String[]{strIntern, ((String) objArr2[0]).intern()};
        int i = onExtraCallbackWithResult + 31;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public DG15File(PublicKey publicKey) {
        super(111);
        this.publicKey = publicKey;
    }

    public DG15File(InputStream inputStream) throws IOException {
        super(111, inputStream);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 25, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 59 - (ViewConfiguration.getFadingEdgeLength() >> 16), 6383 - ExpandableListView.getPackedPositionGroup(0L), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 58 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i4 = $11 + 111;
            $10 = i4 % 128;
            int i5 = i4 % 2;
        }
        String str = new String(cArr2);
        int i6 = $11 + 101;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    public void readContent(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (!(inputStream instanceof DataInputStream)) {
            dataInputStream = new DataInputStream(inputStream);
        } else {
            int i5 = i2 + 31;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            dataInputStream = (DataInputStream) inputStream;
        }
        try {
            byte[] bArr = new byte[getLength()];
            dataInputStream.readFully(bArr);
            this.publicKey = getPublicKey(bArr);
        } catch (GeneralSecurityException e) {
            LOGGER.log(Level.WARNING, "Unexpected exception while reading DG15 content", (Throwable) e);
        }
    }

    private static PublicKey getPublicKey(byte[] bArr) throws GeneralSecurityException {
        int i = 2 % 2;
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(bArr);
        String[] strArr = PUBLIC_KEY_ALGORITHMS;
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = onExtraCallback + 57;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            try {
                PublicKey publicKey = Util.getPublicKey(strArr[i2], x509EncodedKeySpec);
                int i5 = onExtraCallback + 9;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return publicKey;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (InvalidKeySpecException e) {
                LOGGER.log(Level.FINE, "Ignore, try next algorithm", (Throwable) e);
            }
        }
        throw new InvalidAlgorithmParameterException();
    }

    public void writeContent(OutputStream outputStream) throws IOException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        byte[] encoded = this.publicKey.getEncoded();
        if (i3 == 0) {
            outputStream.write(encoded);
        } else {
            outputStream.write(encoded);
            throw null;
        }
    }

    public PublicKey getPublicKey() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        PublicKey publicKey = this.publicKey;
        int i4 = i3 + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return publicKey;
        }
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 29;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (obj == null) {
            int i5 = i2 + 73;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (obj.getClass() == getClass()) {
            return this.publicKey.equals(((DG15File) obj).publicKey);
        }
        int i7 = onWarmupCompleted + 25;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.publicKey.hashCode() * 5) + 61;
        int i4 = onWarmupCompleted + 45;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DG15File [" + Util.getDetailedPublicKeyAlgorithm(this.publicKey) + "]";
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static void onExtraCallback() {
        IAuthTabCallback = -6607480030719520083L;
    }
}
