package o;

import android.graphics.Color;
import android.net.Uri;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.kernel.RVParams;
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

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class TextFieldSelectionManagerKtExternalSyntheticLambda1 implements TextFieldSelectionStateExternalSyntheticLambda0 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 1;
    private static long onExtraCallbackWithResult = 1827120331752605135L;
    private static int onTransact;
    private final byte[] IAuthTabCallback;
    private final TextFieldSelectionStateExternalSyntheticLambda0 onExtraCallback;
    private final byte[] onNavigationEvent;
    private CipherInputStream onWarmupCompleted;

    public TextFieldSelectionManagerKtExternalSyntheticLambda1(TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, byte[] bArr, byte[] bArr2) {
        this.onExtraCallback = textFieldSelectionStateExternalSyntheticLambda0;
        this.IAuthTabCallback = bArr;
        this.onNavigationEvent = bArr2;
    }

    public final void onExtraCallback(TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7) {
        int i2 = 2 % 2;
        int i3 = asBinder + 27;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallback.onExtraCallback(textFieldSelectionStateExternalSyntheticLambda7);
        int i5 = onTransact + 67;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i4 = $10 + 107;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 7;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), Color.alpha(0) + 24, AndroidCharacter.getMirror('0') + 19579, 1002848041, false, RVParams.URL, new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i8] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 59 - ExpandableListView.getPackedPositionGroup(0L), KeyEvent.normalizeMetaState(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
            try {
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), 59 - (ViewConfiguration.getFadingEdgeLength() >> 16), 6383 - View.getDefaultSize(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2);
    }

    public final long onNavigationEvent(TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12) throws Throwable {
        int i2 = 2 % 2;
        try {
            Cipher cipherIAuthTabCallback = IAuthTabCallback();
            byte[] bArr = this.IAuthTabCallback;
            Object[] objArr = new Object[1];
            a(new char[]{32953, 29510, 26461}, 62459 - Color.alpha(0), objArr);
            try {
                cipherIAuthTabCallback.init(2, new SecretKeySpec(bArr, ((String) objArr[0]).intern()), new IvParameterSpec(this.onNavigationEvent));
                TextFieldSelectionStateExternalSyntheticLambda11 textFieldSelectionStateExternalSyntheticLambda11 = new TextFieldSelectionStateExternalSyntheticLambda11(this.onExtraCallback, textFieldSelectionStateExternalSyntheticLambda12);
                this.onWarmupCompleted = new CipherInputStream(textFieldSelectionStateExternalSyntheticLambda11, cipherIAuthTabCallback);
                textFieldSelectionStateExternalSyntheticLambda11.onNavigationEvent();
                int i3 = onTransact + 57;
                asBinder = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 53 / 0;
                }
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final int onWarmupCompleted(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 2 % 2;
        int i5 = this.onWarmupCompleted.read(bArr, i2, i3);
        if (i5 < 0) {
            int i6 = onTransact + 43;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            i5 = -1;
        }
        int i8 = onTransact + 65;
        asBinder = i8 % 128;
        if (i8 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final Uri onWarmupCompleted() {
        int i2 = 2 % 2;
        int i3 = onTransact + 57;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0 = this.onExtraCallback;
        if (i4 != 0) {
            return textFieldSelectionStateExternalSyntheticLambda0.onWarmupCompleted();
        }
        textFieldSelectionStateExternalSyntheticLambda0.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, List<String>> onExtraCallbackWithResult() {
        int i2 = 2 % 2;
        int i3 = onTransact + 65;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.onExtraCallback.onExtraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        Map<String, List<String>> mapOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult();
        int i4 = asBinder + 109;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return mapOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public void onExtraCallback() throws IOException {
        int i2 = 2 % 2;
        int i3 = onTransact + 47;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.onWarmupCompleted != null) {
            this.onWarmupCompleted = null;
            this.onExtraCallback.onExtraCallback();
        }
        int i4 = onTransact + 5;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    protected Cipher IAuthTabCallback() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = onTransact + 11;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(new char[]{32953, 13756, 60073, 40916, 21695, 2495, 48829, 29648, 10400, 56762, 37553, 18336, 64707, 45477, 26263, 7059, 53388, 34176, 14980, 61324}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 46336, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(new char[]{32953, 13756, 60073, 40916, 21695, 2495, 48829, 29648, 10400, 56762, 37553, 18336, 64707, 45477, 26263, 7059, 53388, 34176, 14980, 61324}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 46336, objArr2);
            obj = objArr2[0];
        }
        Cipher cipher = Cipher.getInstance(((String) obj).intern());
        int i4 = asBinder + 75;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return cipher;
        }
        throw null;
    }
}
