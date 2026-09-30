package o;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o.BasicTextContextMenuProviderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface SimpleLayoutKtExternalSyntheticLambda0 {

    public interface IAuthTabCallbackStub {
        SimpleLayoutKtExternalSyntheticLambda0 acquireExoMediaDrm(UUID uuid);
    }

    public interface onExtraCallbackWithResult {
        void onNavigationEvent(SimpleLayoutKtExternalSyntheticLambda0 simpleLayoutKtExternalSyntheticLambda0, @Nullable byte[] bArr, int i2, int i3, @Nullable byte[] bArr2);
    }

    TextFieldSelectionState_androidKtExternalSyntheticLambda4 IAuthTabCallback(byte[] bArr) throws MediaCryptoException;

    void IAuthTabCallback(@Nullable onExtraCallbackWithResult onextracallbackwithresult);

    default void IAuthTabCallback(byte[] bArr, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
    }

    byte[] IAuthTabCallback() throws MediaDrmException;

    onTransact onExtraCallback();

    void onExtraCallback(byte[] bArr) throws DeniedByServerException;

    Map<String, String> onExtraCallbackWithResult(byte[] bArr);

    boolean onExtraCallbackWithResult(byte[] bArr, String str);

    int onNavigationEvent();

    onExtraCallback onNavigationEvent(byte[] bArr, @Nullable List<BasicTextContextMenuProviderExternalSyntheticLambda0.IAuthTabCallback> list, int i2, @Nullable HashMap<String, String> map) throws NotProvisionedException;

    byte[] onNavigationEvent(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    void onWarmupCompleted();

    void onWarmupCompleted(byte[] bArr);

    void onWarmupCompleted(byte[] bArr, byte[] bArr2);

    public static final class onExtraCallback {
        private final int IAuthTabCallback;
        private final String onExtraCallback;
        private final byte[] onExtraCallbackWithResult;

        public onExtraCallback(byte[] bArr, String str, int i2) {
            this.onExtraCallbackWithResult = bArr;
            this.onExtraCallback = str;
            this.IAuthTabCallback = i2;
        }

        public byte[] onExtraCallbackWithResult() {
            return this.onExtraCallbackWithResult;
        }

        public String onExtraCallback() {
            return this.onExtraCallback;
        }
    }

    public static final class onTransact {
        private final byte[] IAuthTabCallback;
        private final String onExtraCallbackWithResult;

        public onTransact(byte[] bArr, String str) {
            this.IAuthTabCallback = bArr;
            this.onExtraCallbackWithResult = str;
        }

        public byte[] IAuthTabCallback() {
            return this.IAuthTabCallback;
        }

        public String onNavigationEvent() {
            return this.onExtraCallbackWithResult;
        }
    }
}
