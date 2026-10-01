package o;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import o.DrawerStateCompanionExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ElevationOverlayKtExternalSyntheticLambda0 {

    public static final class IAuthTabCallback {
        public DrawerStateCompanionExternalSyntheticLambda1 IAuthTabCallback;

        public IAuthTabCallback(@Nullable DrawerStateCompanionExternalSyntheticLambda1 drawerStateCompanionExternalSyntheticLambda1) {
            this.IAuthTabCallback = drawerStateCompanionExternalSyntheticLambda1;
        }
    }

    public static HandwritingHandlerNodeExternalSyntheticLambda0 IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, boolean z) throws IOException {
        HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent = new ExposedDropdownMenuBoxScopeExternalSyntheticLambda1().onNavigationEvent(drawerKtExternalSyntheticLambda9, z ? null : ModalBottomSheetKtExternalSyntheticLambda2.onNavigationEvent);
        if (handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent == null || handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent.onExtraCallback() == 0) {
            return null;
        }
        return handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent;
    }

    public static boolean onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(4);
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, 4);
        return textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized() == 1716281667;
    }

    public static HandwritingHandlerNodeExternalSyntheticLambda0 onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, boolean z) throws IOException {
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        long jOnWarmupCompleted = drawerKtExternalSyntheticLambda9.onWarmupCompleted();
        HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0IAuthTabCallback = IAuthTabCallback(drawerKtExternalSyntheticLambda9, z);
        drawerKtExternalSyntheticLambda9.onExtraCallback((int) (drawerKtExternalSyntheticLambda9.onWarmupCompleted() - jOnWarmupCompleted));
        return handwritingHandlerNodeExternalSyntheticLambda0IAuthTabCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static void onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(4);
        drawerKtExternalSyntheticLambda9.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, 4);
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized() != 1716281667) {
            throw ParserException.onNavigationEvent("Failed to read FLAC stream marker.", (Throwable) null);
        }
    }

    public static boolean onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, IAuthTabCallback iAuthTabCallback) throws IOException {
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(new byte[4]);
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted, 0, 4);
        boolean zOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(7);
        int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(24) + 4;
        if (iOnNavigationEvent == 0) {
            iAuthTabCallback.IAuthTabCallback = onExtraCallback(drawerKtExternalSyntheticLambda9);
            return zOnWarmupCompleted;
        }
        DrawerStateCompanionExternalSyntheticLambda1 drawerStateCompanionExternalSyntheticLambda1 = iAuthTabCallback.IAuthTabCallback;
        if (drawerStateCompanionExternalSyntheticLambda1 == null) {
            throw new IllegalArgumentException();
        }
        if (iOnNavigationEvent == 3) {
            iAuthTabCallback.IAuthTabCallback = drawerStateCompanionExternalSyntheticLambda1.onNavigationEvent(IAuthTabCallback(drawerKtExternalSyntheticLambda9, iOnNavigationEvent2));
            return zOnWarmupCompleted;
        }
        if (iOnNavigationEvent == 4) {
            iAuthTabCallback.IAuthTabCallback = drawerStateCompanionExternalSyntheticLambda1.IAuthTabCallback(onNavigationEvent(drawerKtExternalSyntheticLambda9, iOnNavigationEvent2));
            return zOnWarmupCompleted;
        }
        if (iOnNavigationEvent == 6) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(iOnNavigationEvent2);
            drawerKtExternalSyntheticLambda9.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, iOnNavigationEvent2);
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
            iAuthTabCallback.IAuthTabCallback = drawerStateCompanionExternalSyntheticLambda1.onNavigationEvent((List<ModalBottomSheetKtExternalSyntheticLambda0>) ImmutableList.of(ModalBottomSheetKtExternalSyntheticLambda0.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20)));
            return zOnWarmupCompleted;
        }
        drawerKtExternalSyntheticLambda9.onExtraCallback(iOnNavigationEvent2);
        return zOnWarmupCompleted;
    }

    public static DrawerStateCompanionExternalSyntheticLambda1.onExtraCallbackWithResult IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
        int iOnMessageChannelReady = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMessageChannelReady();
        long jOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        long j = iOnMessageChannelReady;
        int i2 = iOnMessageChannelReady / 18;
        long[] jArrCopyOf = new long[i2];
        long[] jArrCopyOf2 = new long[i2];
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            long typedObject = textFieldDecoratorModifierNodeExternalSyntheticLambda20.readTypedObject();
            if (typedObject == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                break;
            }
            jArrCopyOf[i3] = typedObject;
            jArrCopyOf2[i3] = textFieldDecoratorModifierNodeExternalSyntheticLambda20.readTypedObject();
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(2);
            i3++;
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault((int) ((jOnWarmupCompleted + j) - textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted()));
        return new DrawerStateCompanionExternalSyntheticLambda1.onExtraCallbackWithResult(jArrCopyOf, jArrCopyOf2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static int IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(2);
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, 2);
        int iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
        if ((iOnUnminimized >> 2) != 16382) {
            drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
            throw ParserException.onNavigationEvent("First frame does not start with sync code.", (Throwable) null);
        }
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        return iOnUnminimized;
    }

    private static DrawerStateCompanionExternalSyntheticLambda1 onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        byte[] bArr = new byte[38];
        drawerKtExternalSyntheticLambda9.onNavigationEvent(bArr, 0, 38);
        return new DrawerStateCompanionExternalSyntheticLambda1(bArr, 4);
    }

    private static DrawerStateCompanionExternalSyntheticLambda1.onExtraCallbackWithResult IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, int i2) throws IOException {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(i2);
        drawerKtExternalSyntheticLambda9.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, i2);
        return IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
    }

    private static List<String> onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, int i2) throws IOException {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(i2);
        drawerKtExternalSyntheticLambda9.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, i2);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
        return Arrays.asList(ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, false, false).onWarmupCompleted);
    }
}
