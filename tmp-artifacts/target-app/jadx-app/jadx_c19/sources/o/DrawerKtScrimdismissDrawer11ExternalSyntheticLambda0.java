package o;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import com.google.android.material.button.MaterialButton;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0 {
    public static int IAuthTabCallback(int i2) {
        if (i2 == 20) {
            return 63750;
        }
        if (i2 == 30) {
            return 2250000;
        }
        switch (i2) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i2) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    @Pure
    public static void onNavigationEvent(boolean z, @Nullable String str) throws ParserException {
        if (!z) {
            throw ParserException.onNavigationEvent(str, (Throwable) null);
        }
    }

    public static int IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        while (i4 < i3) {
            int iOnExtraCallbackWithResult = drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult(bArr, i2 + i4, i3 - i4);
            if (iOnExtraCallbackWithResult == -1) {
                break;
            }
            i4 += iOnExtraCallbackWithResult;
        }
        return i4;
    }

    public static boolean onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, byte[] bArr, int i2, int i3) throws IOException {
        try {
            drawerKtExternalSyntheticLambda9.onNavigationEvent(bArr, i2, i3);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, int i2) throws IOException {
        try {
            drawerKtExternalSyntheticLambda9.onExtraCallback(i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, byte[] bArr, int i2, int i3, boolean z) throws IOException {
        try {
            return drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult(bArr, i2, i3, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }
}
