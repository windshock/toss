package o;

import android.util.Pair;
import androidx.media3.common.ParserException;
import com.google.android.exoplayer2.audio.WavUtil;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SnackbarKtExternalSyntheticLambda5 {
    private static final byte[] IAuthTabCallback = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] onNavigationEvent = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(8);
        int i2 = onNavigationEvent.onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, textFieldDecoratorModifierNodeExternalSyntheticLambda20).IAuthTabCallback;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, 4);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(0);
        int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        if (iAsBinder == 1463899717) {
            return true;
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("WavHeaderReader", "Unsupported form type: " + iAsBinder);
        return false;
    }

    public static long onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(8);
        onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onNavigationEvent.onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        if (onnavigationeventOnExtraCallbackWithResult.IAuthTabCallback != 1685272116) {
            drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
            return -1L;
        }
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(8);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(0);
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, 8);
        long jIAuthTabCallbackStubProxy = textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackStubProxy();
        drawerKtExternalSyntheticLambda9.onExtraCallback(((int) onnavigationeventOnExtraCallbackWithResult.onNavigationEvent) + 8);
        return jIAuthTabCallbackStubProxy;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static SnackbarKtExternalSyntheticLambda4 onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        byte[] bArr;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(16);
        onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult(WavUtil.FMT_FOURCC, drawerKtExternalSyntheticLambda9, textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(onnavigationeventOnExtraCallbackWithResult.onNavigationEvent >= 16);
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, 16);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(0);
        int iWriteTypedObject = textFieldDecoratorModifierNodeExternalSyntheticLambda20.writeTypedObject();
        int iWriteTypedObject2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.writeTypedObject();
        int iExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.extraCallback();
        int iExtraCallback2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.extraCallback();
        int iWriteTypedObject3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.writeTypedObject();
        int iWriteTypedObject4 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.writeTypedObject();
        int i2 = ((int) onnavigationeventOnExtraCallbackWithResult.onNavigationEvent) - 16;
        if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            drawerKtExternalSyntheticLambda9.IAuthTabCallback(bArr2, 0, i2);
            if (iWriteTypedObject == 65534 && i2 == 24) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda202 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(bArr2);
                textFieldDecoratorModifierNodeExternalSyntheticLambda202.writeTypedObject();
                int iWriteTypedObject5 = textFieldDecoratorModifierNodeExternalSyntheticLambda202.writeTypedObject();
                if (iWriteTypedObject5 != 0 && iWriteTypedObject5 != iWriteTypedObject4) {
                    throw ParserException.onExtraCallback("validBits ( " + iWriteTypedObject5 + ")  != bitsPerSample( " + iWriteTypedObject4 + ") are not supported");
                }
                int iExtraCallback3 = textFieldDecoratorModifierNodeExternalSyntheticLambda202.extraCallback();
                if ((iExtraCallback3 >> 18) != 0) {
                    throw ParserException.onExtraCallback("invalid channel mask " + iExtraCallback3);
                }
                if (iExtraCallback3 != 0 && Integer.bitCount(iExtraCallback3) != iWriteTypedObject2) {
                    throw ParserException.onExtraCallback("invalid number of channels (" + Integer.bitCount(iExtraCallback3) + ") in channel mask " + iExtraCallback3);
                }
                iWriteTypedObject = textFieldDecoratorModifierNodeExternalSyntheticLambda202.writeTypedObject();
                byte[] bArr3 = new byte[14];
                textFieldDecoratorModifierNodeExternalSyntheticLambda202.onWarmupCompleted(bArr3, 0, 14);
                if (!Arrays.equals(bArr3, IAuthTabCallback) && !Arrays.equals(bArr3, onNavigationEvent)) {
                    throw ParserException.onExtraCallback("invalid wav format extension guid");
                }
            }
            bArr = bArr2;
        } else {
            bArr = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted;
        }
        drawerKtExternalSyntheticLambda9.onExtraCallback((int) (drawerKtExternalSyntheticLambda9.onWarmupCompleted() - drawerKtExternalSyntheticLambda9.IAuthTabCallback()));
        return new SnackbarKtExternalSyntheticLambda4(iWriteTypedObject, iWriteTypedObject2, iExtraCallback, iExtraCallback2, iWriteTypedObject3, iWriteTypedObject4, bArr);
    }

    public static Pair<Long, Long> onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult(WavUtil.DATA_FOURCC, drawerKtExternalSyntheticLambda9, new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(8));
        drawerKtExternalSyntheticLambda9.onExtraCallback(8);
        return Pair.create(Long.valueOf(drawerKtExternalSyntheticLambda9.IAuthTabCallback()), Long.valueOf(onnavigationeventOnExtraCallbackWithResult.onNavigationEvent));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static onNavigationEvent onExtraCallbackWithResult(int i2, DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) throws ParserException, IOException {
        onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onNavigationEvent.onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        while (onnavigationeventOnExtraCallbackWithResult.IAuthTabCallback != i2) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("WavHeaderReader", "Ignoring unknown WAV chunk: " + onnavigationeventOnExtraCallbackWithResult.IAuthTabCallback);
            long j = onnavigationeventOnExtraCallbackWithResult.onNavigationEvent;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw ParserException.onExtraCallback("Chunk is too large (~2GB+) to skip; id: " + onnavigationeventOnExtraCallbackWithResult.IAuthTabCallback);
            }
            drawerKtExternalSyntheticLambda9.onExtraCallback((int) j2);
            onnavigationeventOnExtraCallbackWithResult = onNavigationEvent.onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        }
        return onnavigationeventOnExtraCallbackWithResult;
    }

    static final class onNavigationEvent {
        public final int IAuthTabCallback;
        public final long onNavigationEvent;

        private onNavigationEvent(int i2, long j) {
            this.IAuthTabCallback = i2;
            this.onNavigationEvent = j;
        }

        public static onNavigationEvent onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) throws IOException {
            drawerKtExternalSyntheticLambda9.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, 8);
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(0);
            return new onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallback_Parcel());
        }
    }
}
