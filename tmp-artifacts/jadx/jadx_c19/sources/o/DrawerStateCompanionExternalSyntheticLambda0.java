package o;

import androidx.media3.common.ParserException;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DrawerStateCompanionExternalSyntheticLambda0 {

    public static final class onExtraCallback {
        public long onNavigationEvent;
    }

    public static boolean IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, DrawerStateCompanionExternalSyntheticLambda1 drawerStateCompanionExternalSyntheticLambda1, int i2, onExtraCallback onextracallback) {
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        long jOnActivityResized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
        long j = jOnActivityResized >>> 16;
        if (j != i2) {
            return false;
        }
        return onNavigationEvent((int) ((jOnActivityResized >> 4) & 15), drawerStateCompanionExternalSyntheticLambda1) && onWarmupCompleted((int) ((jOnActivityResized >> 1) & 7), drawerStateCompanionExternalSyntheticLambda1) && !(((jOnActivityResized & 1) > 1L ? 1 : ((jOnActivityResized & 1) == 1L ? 0 : -1)) == 0) && onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, drawerStateCompanionExternalSyntheticLambda1, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, onextracallback) && IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, drawerStateCompanionExternalSyntheticLambda1, (int) ((jOnActivityResized >> 12) & 15)) && onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, drawerStateCompanionExternalSyntheticLambda1, (int) ((jOnActivityResized >> 8) & 15)) && onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnWarmupCompleted);
    }

    public static boolean onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, DrawerStateCompanionExternalSyntheticLambda1 drawerStateCompanionExternalSyntheticLambda1, int i2, onExtraCallback onextracallback) throws IOException {
        long jOnWarmupCompleted = drawerKtExternalSyntheticLambda9.onWarmupCompleted();
        byte[] bArr = new byte[2];
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i2) {
            drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
            drawerKtExternalSyntheticLambda9.IAuthTabCallback((int) (jOnWarmupCompleted - drawerKtExternalSyntheticLambda9.IAuthTabCallback()));
            return false;
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(16);
        System.arraycopy(bArr, 0, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, 2);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.IAuthTabCallback(drawerKtExternalSyntheticLambda9, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 2, 14));
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        drawerKtExternalSyntheticLambda9.IAuthTabCallback((int) (jOnWarmupCompleted - drawerKtExternalSyntheticLambda9.IAuthTabCallback()));
        return IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, drawerStateCompanionExternalSyntheticLambda1, i2, onextracallback);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static long onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, DrawerStateCompanionExternalSyntheticLambda1 drawerStateCompanionExternalSyntheticLambda1) throws ParserException, IOException {
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(1);
        byte[] bArr = new byte[1];
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(2);
        int i2 = z ? 7 : 6;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(i2);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.IAuthTabCallback(drawerKtExternalSyntheticLambda9, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, i2));
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        onExtraCallback onextracallback = new onExtraCallback();
        if (!onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, drawerStateCompanionExternalSyntheticLambda1, z, onextracallback)) {
            throw ParserException.onNavigationEvent((String) null, (Throwable) null);
        }
        return onextracallback.onNavigationEvent;
    }

    public static int onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() + 1;
            case 7:
                return textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }

    private static boolean onNavigationEvent(int i2, DrawerStateCompanionExternalSyntheticLambda1 drawerStateCompanionExternalSyntheticLambda1) {
        return i2 <= 7 ? i2 == drawerStateCompanionExternalSyntheticLambda1.onNavigationEvent - 1 : i2 <= 10 && drawerStateCompanionExternalSyntheticLambda1.onNavigationEvent == 2;
    }

    private static boolean onWarmupCompleted(int i2, DrawerStateCompanionExternalSyntheticLambda1 drawerStateCompanionExternalSyntheticLambda1) {
        return i2 == 0 || i2 == drawerStateCompanionExternalSyntheticLambda1.IAuthTabCallback;
    }

    private static boolean onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, DrawerStateCompanionExternalSyntheticLambda1 drawerStateCompanionExternalSyntheticLambda1, boolean z, onExtraCallback onextracallback) {
        try {
            long jMayLaunchUrl = textFieldDecoratorModifierNodeExternalSyntheticLambda20.mayLaunchUrl();
            if (!z) {
                jMayLaunchUrl *= drawerStateCompanionExternalSyntheticLambda1.onExtraCallback;
            }
            onextracallback.onNavigationEvent = jMayLaunchUrl;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private static boolean IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, DrawerStateCompanionExternalSyntheticLambda1 drawerStateCompanionExternalSyntheticLambda1, int i2) {
        int iOnExtraCallback = onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, i2);
        return iOnExtraCallback != -1 && iOnExtraCallback <= drawerStateCompanionExternalSyntheticLambda1.onExtraCallback;
    }

    private static boolean onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, DrawerStateCompanionExternalSyntheticLambda1 drawerStateCompanionExternalSyntheticLambda1, int i2) {
        int i3 = drawerStateCompanionExternalSyntheticLambda1.asInterface;
        if (i2 == 0) {
            return true;
        }
        if (i2 <= 11) {
            return i2 == drawerStateCompanionExternalSyntheticLambda1.IAuthTabCallbackStub;
        }
        if (i2 == 12) {
            return textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() * 1000 == i3;
        }
        if (i2 <= 14) {
            int iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
            if (i2 == 14) {
                iOnUnminimized *= 10;
            }
            if (iOnUnminimized == i3) {
                return true;
            }
        }
        return false;
    }

    private static boolean onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        return textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() == TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), i2, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() - 1, 0);
    }
}
