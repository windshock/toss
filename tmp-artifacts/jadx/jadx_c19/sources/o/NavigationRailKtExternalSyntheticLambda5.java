package o;

import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.ArrayDeque;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class NavigationRailKtExternalSyntheticLambda5 implements NavigationRailKtExternalSyntheticLambda8 {
    private long IAuthTabCallback;
    private int onExtraCallback;
    private int onExtraCallbackWithResult;
    private NavigationRailKtExternalSyntheticLambda7 onNavigationEvent;
    private final byte[] IAuthTabCallbackStub = new byte[8];
    private final ArrayDeque<onNavigationEvent> onWarmupCompleted = new ArrayDeque<>();
    private final OutlinedTextFieldKtExternalSyntheticLambda1 onTransact = new OutlinedTextFieldKtExternalSyntheticLambda1();

    @Override // o.NavigationRailKtExternalSyntheticLambda8
    public void onExtraCallback(NavigationRailKtExternalSyntheticLambda7 navigationRailKtExternalSyntheticLambda7) {
        this.onNavigationEvent = navigationRailKtExternalSyntheticLambda7;
    }

    @Override // o.NavigationRailKtExternalSyntheticLambda8
    public void IAuthTabCallback() {
        this.onExtraCallback = 0;
        this.onWarmupCompleted.clear();
        this.onTransact.IAuthTabCallback();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    @Override // o.NavigationRailKtExternalSyntheticLambda8
    public boolean onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.onNavigationEvent);
        while (true) {
            onNavigationEvent onnavigationeventPeek = this.onWarmupCompleted.peek();
            if (onnavigationeventPeek == null || drawerKtExternalSyntheticLambda9.IAuthTabCallback() < onnavigationeventPeek.IAuthTabCallback) {
                if (this.onExtraCallback == 0) {
                    long jOnExtraCallbackWithResult = this.onTransact.onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, true, false, 4);
                    if (jOnExtraCallbackWithResult == -2) {
                        jOnExtraCallbackWithResult = onNavigationEvent(drawerKtExternalSyntheticLambda9);
                    }
                    if (jOnExtraCallbackWithResult == -1) {
                        return false;
                    }
                    this.onExtraCallbackWithResult = (int) jOnExtraCallbackWithResult;
                    this.onExtraCallback = 1;
                }
                if (this.onExtraCallback == 1) {
                    this.IAuthTabCallback = this.onTransact.onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, false, true, 8);
                    this.onExtraCallback = 2;
                }
                int iOnExtraCallback = this.onNavigationEvent.onExtraCallback(this.onExtraCallbackWithResult);
                if (iOnExtraCallback != 0) {
                    if (iOnExtraCallback == 1) {
                        long jIAuthTabCallback = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
                        this.onWarmupCompleted.push(new onNavigationEvent(this.onExtraCallbackWithResult, this.IAuthTabCallback + jIAuthTabCallback));
                        this.onNavigationEvent.IAuthTabCallback(this.onExtraCallbackWithResult, jIAuthTabCallback, this.IAuthTabCallback);
                        this.onExtraCallback = 0;
                        return true;
                    }
                    if (iOnExtraCallback == 2) {
                        long j = this.IAuthTabCallback;
                        if (j > 8) {
                            throw ParserException.onNavigationEvent("Invalid integer size: " + this.IAuthTabCallback, (Throwable) null);
                        }
                        this.onNavigationEvent.onExtraCallbackWithResult(this.onExtraCallbackWithResult, IAuthTabCallback(drawerKtExternalSyntheticLambda9, (int) j));
                        this.onExtraCallback = 0;
                        return true;
                    }
                    if (iOnExtraCallback == 3) {
                        long j2 = this.IAuthTabCallback;
                        if (j2 > 2147483647L) {
                            throw ParserException.onNavigationEvent("String element size: " + this.IAuthTabCallback, (Throwable) null);
                        }
                        this.onNavigationEvent.onExtraCallback(this.onExtraCallbackWithResult, onExtraCallback(drawerKtExternalSyntheticLambda9, (int) j2));
                        this.onExtraCallback = 0;
                        return true;
                    }
                    if (iOnExtraCallback == 4) {
                        this.onNavigationEvent.onWarmupCompleted(this.onExtraCallbackWithResult, (int) this.IAuthTabCallback, drawerKtExternalSyntheticLambda9);
                        this.onExtraCallback = 0;
                        return true;
                    }
                    if (iOnExtraCallback == 5) {
                        long j3 = this.IAuthTabCallback;
                        if (j3 != 4 && j3 != 8) {
                            throw ParserException.onNavigationEvent("Invalid float size: " + this.IAuthTabCallback, (Throwable) null);
                        }
                        this.onNavigationEvent.onWarmupCompleted(this.onExtraCallbackWithResult, onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, (int) j3));
                        this.onExtraCallback = 0;
                        return true;
                    }
                    throw ParserException.onNavigationEvent("Invalid element type " + iOnExtraCallback, (Throwable) null);
                }
                drawerKtExternalSyntheticLambda9.onExtraCallback((int) this.IAuthTabCallback);
                this.onExtraCallback = 0;
            } else {
                this.onNavigationEvent.onWarmupCompleted(this.onWarmupCompleted.pop().onExtraCallback);
                return true;
            }
        }
    }

    @RequiresNonNull
    private long onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        while (true) {
            drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.IAuthTabCallbackStub, 0, 4);
            int iOnExtraCallbackWithResult = OutlinedTextFieldKtExternalSyntheticLambda1.onExtraCallbackWithResult(this.IAuthTabCallbackStub[0]);
            if (iOnExtraCallbackWithResult != -1 && iOnExtraCallbackWithResult <= 4) {
                int iIAuthTabCallback = (int) OutlinedTextFieldKtExternalSyntheticLambda1.IAuthTabCallback(this.IAuthTabCallbackStub, iOnExtraCallbackWithResult, false);
                if (this.onNavigationEvent.IAuthTabCallback(iIAuthTabCallback)) {
                    drawerKtExternalSyntheticLambda9.onExtraCallback(iOnExtraCallbackWithResult);
                    return iIAuthTabCallback;
                }
            }
            drawerKtExternalSyntheticLambda9.onExtraCallback(1);
        }
    }

    private long IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, int i2) throws IOException {
        drawerKtExternalSyntheticLambda9.onNavigationEvent(this.IAuthTabCallbackStub, 0, i2);
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j = (j << 8) | (this.IAuthTabCallbackStub[i3] & 255);
        }
        return j;
    }

    private double onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, int i2) throws IOException {
        long jIAuthTabCallback = IAuthTabCallback(drawerKtExternalSyntheticLambda9, i2);
        if (i2 == 4) {
            return Float.intBitsToFloat((int) jIAuthTabCallback);
        }
        return Double.longBitsToDouble(jIAuthTabCallback);
    }

    private static String onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, int i2) throws IOException {
        if (i2 == 0) {
            return "";
        }
        byte[] bArr = new byte[i2];
        drawerKtExternalSyntheticLambda9.onNavigationEvent(bArr, 0, i2);
        while (i2 > 0 && bArr[i2 - 1] == 0) {
            i2--;
        }
        return new String(bArr, 0, i2);
    }

    static final class onNavigationEvent {
        private final long IAuthTabCallback;
        private final int onExtraCallback;

        private onNavigationEvent(int i2, long j) {
            this.onExtraCallback = i2;
            this.IAuthTabCallback = j;
        }
    }
}
