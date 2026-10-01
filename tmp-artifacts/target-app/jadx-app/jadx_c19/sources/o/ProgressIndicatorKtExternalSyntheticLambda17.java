package o;

import java.util.Arrays;
import o.DrawerStateCompanionExternalSyntheticLambda1;
import o.ProgressIndicatorKtExternalSyntheticLambda6;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ProgressIndicatorKtExternalSyntheticLambda17 extends ProgressIndicatorKtExternalSyntheticLambda6 {
    private onExtraCallbackWithResult IAuthTabCallback;
    private DrawerStateCompanionExternalSyntheticLambda1 onNavigationEvent;

    ProgressIndicatorKtExternalSyntheticLambda17() {
    }

    public static boolean onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        return textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() >= 5 && textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() == 127 && textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized() == 1179402563;
    }

    @Override // o.ProgressIndicatorKtExternalSyntheticLambda6
    protected void onExtraCallbackWithResult(boolean z) {
        super.onExtraCallbackWithResult(z);
        if (z) {
            this.onNavigationEvent = null;
            this.IAuthTabCallback = null;
        }
    }

    private static boolean onExtraCallback(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // o.ProgressIndicatorKtExternalSyntheticLambda6
    protected long onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        if (onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback())) {
            return onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        }
        return -1L;
    }

    @Override // o.ProgressIndicatorKtExternalSyntheticLambda6
    @EnsuresNonNullIf
    protected boolean onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, long j, ProgressIndicatorKtExternalSyntheticLambda6.onExtraCallbackWithResult onextracallbackwithresult) {
        byte[] bArrOnExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback();
        DrawerStateCompanionExternalSyntheticLambda1 drawerStateCompanionExternalSyntheticLambda1 = this.onNavigationEvent;
        if (drawerStateCompanionExternalSyntheticLambda1 == null) {
            DrawerStateCompanionExternalSyntheticLambda1 drawerStateCompanionExternalSyntheticLambda12 = new DrawerStateCompanionExternalSyntheticLambda1(bArrOnExtraCallback, 17);
            this.onNavigationEvent = drawerStateCompanionExternalSyntheticLambda12;
            onextracallbackwithresult.onNavigationEvent = drawerStateCompanionExternalSyntheticLambda12.onNavigationEvent(Arrays.copyOfRange(bArrOnExtraCallback, 9, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult()), null).onExtraCallback().onNavigationEvent("audio/ogg").onNavigationEvent();
            return true;
        }
        if ((bArrOnExtraCallback[0] & Byte.MAX_VALUE) == 3) {
            DrawerStateCompanionExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = ElevationOverlayKtExternalSyntheticLambda0.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            DrawerStateCompanionExternalSyntheticLambda1 drawerStateCompanionExternalSyntheticLambda1OnNavigationEvent = drawerStateCompanionExternalSyntheticLambda1.onNavigationEvent(onextracallbackwithresultIAuthTabCallback);
            this.onNavigationEvent = drawerStateCompanionExternalSyntheticLambda1OnNavigationEvent;
            this.IAuthTabCallback = new onExtraCallbackWithResult(drawerStateCompanionExternalSyntheticLambda1OnNavigationEvent, onextracallbackwithresultIAuthTabCallback);
            return true;
        }
        if (!onExtraCallback(bArrOnExtraCallback)) {
            return true;
        }
        onExtraCallbackWithResult onextracallbackwithresult2 = this.IAuthTabCallback;
        if (onextracallbackwithresult2 != null) {
            onextracallbackwithresult2.onExtraCallbackWithResult(j);
            onextracallbackwithresult.onWarmupCompleted = this.IAuthTabCallback;
        }
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = onextracallbackwithresult.onNavigationEvent;
        return false;
    }

    private int onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int i2 = (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback()[2] & 255) >> 4;
        if (i2 == 6 || i2 == 7) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.mayLaunchUrl();
        }
        int iOnExtraCallback = DrawerStateCompanionExternalSyntheticLambda0.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, i2);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(0);
        return iOnExtraCallback;
    }

    static final class onExtraCallbackWithResult implements ProgressIndicatorKtExternalSyntheticLambda20 {
        private DrawerStateCompanionExternalSyntheticLambda1 onExtraCallback;
        private DrawerStateCompanionExternalSyntheticLambda1.onExtraCallbackWithResult onWarmupCompleted;
        private long IAuthTabCallback = -1;
        private long onNavigationEvent = -1;

        public onExtraCallbackWithResult(DrawerStateCompanionExternalSyntheticLambda1 drawerStateCompanionExternalSyntheticLambda1, DrawerStateCompanionExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult) {
            this.onExtraCallback = drawerStateCompanionExternalSyntheticLambda1;
            this.onWarmupCompleted = onextracallbackwithresult;
        }

        public void onExtraCallbackWithResult(long j) {
            this.IAuthTabCallback = j;
        }

        @Override // o.ProgressIndicatorKtExternalSyntheticLambda20
        public long onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) {
            long j = this.onNavigationEvent;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.onNavigationEvent = -1L;
            return j2;
        }

        @Override // o.ProgressIndicatorKtExternalSyntheticLambda20
        public void IAuthTabCallback(long j) {
            long[] jArr = this.onWarmupCompleted.onExtraCallback;
            this.onNavigationEvent = jArr[TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(jArr, j, true, true)];
        }

        @Override // o.ProgressIndicatorKtExternalSyntheticLambda20
        public ExposedDropdownMenu_androidKtExternalSyntheticLambda4 onWarmupCompleted() {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback != -1);
            return new DropdownMenuPositionProviderExternalSyntheticLambda0(this.onExtraCallback, this.IAuthTabCallback);
        }
    }
}
