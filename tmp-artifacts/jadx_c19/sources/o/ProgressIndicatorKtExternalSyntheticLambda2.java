package o;

import androidx.media3.common.ParserException;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ProgressIndicatorKtExternalSyntheticLambda2 {
    public int IAuthTabCallback;
    public int IAuthTabCallbackDefault;
    public long IAuthTabCallbackStub;
    public int asBinder;
    public long asInterface;
    public long onExtraCallbackWithResult;
    public int onNavigationEvent;
    public int onTransact;
    public long onWarmupCompleted;
    public final int[] onExtraCallback = new int[OggPageHeader.MAX_SEGMENT_COUNT];
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 IAuthTabCallback_Parcel = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(OggPageHeader.MAX_SEGMENT_COUNT);

    ProgressIndicatorKtExternalSyntheticLambda2() {
    }

    public void onExtraCallbackWithResult() {
        this.IAuthTabCallbackDefault = 0;
        this.onTransact = 0;
        this.onWarmupCompleted = 0L;
        this.IAuthTabCallbackStub = 0L;
        this.asInterface = 0L;
        this.onExtraCallbackWithResult = 0L;
        this.asBinder = 0;
        this.onNavigationEvent = 0;
        this.IAuthTabCallback = 0;
    }

    public boolean IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        return IAuthTabCallback(drawerKtExternalSyntheticLambda9, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r10 == (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r9.IAuthTabCallback() >= r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r9.onWarmupCompleted(1) != (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, long j) throws IOException {
        RecordingInputConnection_androidKt.onNavigationEvent(drawerKtExternalSyntheticLambda9.IAuthTabCallback() == drawerKtExternalSyntheticLambda9.onWarmupCompleted());
        this.IAuthTabCallback_Parcel.onExtraCallback(4);
        while (true) {
            if ((j != -1 && drawerKtExternalSyntheticLambda9.IAuthTabCallback() + 4 >= j) || !DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onWarmupCompleted(drawerKtExternalSyntheticLambda9, this.IAuthTabCallback_Parcel.onExtraCallback(), 0, 4, true)) {
                break;
            }
            this.IAuthTabCallback_Parcel.asBinder(0);
            if (this.IAuthTabCallback_Parcel.onActivityResized() == 1332176723) {
                drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
                return true;
            }
            drawerKtExternalSyntheticLambda9.onExtraCallback(1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, boolean z) throws ParserException, IOException {
        onExtraCallbackWithResult();
        this.IAuthTabCallback_Parcel.onExtraCallback(27);
        if (!DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onWarmupCompleted(drawerKtExternalSyntheticLambda9, this.IAuthTabCallback_Parcel.onExtraCallback(), 0, 27, z) || this.IAuthTabCallback_Parcel.onActivityResized() != 1332176723) {
            return false;
        }
        int iOnMinimized = this.IAuthTabCallback_Parcel.onMinimized();
        this.IAuthTabCallbackDefault = iOnMinimized;
        if (iOnMinimized != 0) {
            if (z) {
                return false;
            }
            throw ParserException.onExtraCallback("unsupported bit stream revision");
        }
        this.onTransact = this.IAuthTabCallback_Parcel.onMinimized();
        this.onWarmupCompleted = this.IAuthTabCallback_Parcel.IAuthTabCallbackStubProxy();
        this.IAuthTabCallbackStub = this.IAuthTabCallback_Parcel.IAuthTabCallback_Parcel();
        this.asInterface = this.IAuthTabCallback_Parcel.IAuthTabCallback_Parcel();
        this.onExtraCallbackWithResult = this.IAuthTabCallback_Parcel.IAuthTabCallback_Parcel();
        int iOnMinimized2 = this.IAuthTabCallback_Parcel.onMinimized();
        this.asBinder = iOnMinimized2;
        this.onNavigationEvent = iOnMinimized2 + 27;
        this.IAuthTabCallback_Parcel.onExtraCallback(iOnMinimized2);
        if (!DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onWarmupCompleted(drawerKtExternalSyntheticLambda9, this.IAuthTabCallback_Parcel.onExtraCallback(), 0, this.asBinder, z)) {
            return false;
        }
        for (int i2 = 0; i2 < this.asBinder; i2++) {
            this.onExtraCallback[i2] = this.IAuthTabCallback_Parcel.onMinimized();
            this.IAuthTabCallback += this.onExtraCallback[i2];
        }
        return true;
    }
}
