package o;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class MenuKtExternalSyntheticLambda7 {
    private final ByteArrayOutputStream IAuthTabCallback;
    private final DataOutputStream onExtraCallback;

    public MenuKtExternalSyntheticLambda7() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.IAuthTabCallback = byteArrayOutputStream;
        this.onExtraCallback = new DataOutputStream(byteArrayOutputStream);
    }

    public byte[] onExtraCallback(MenuKtExternalSyntheticLambda3 menuKtExternalSyntheticLambda3) throws IOException {
        this.IAuthTabCallback.reset();
        try {
            onNavigationEvent(this.onExtraCallback, menuKtExternalSyntheticLambda3.onWarmupCompleted);
            String str = menuKtExternalSyntheticLambda3.IAuthTabCallbackStub;
            if (str == null) {
                str = "";
            }
            onNavigationEvent(this.onExtraCallback, str);
            this.onExtraCallback.writeLong(menuKtExternalSyntheticLambda3.IAuthTabCallback);
            this.onExtraCallback.writeLong(menuKtExternalSyntheticLambda3.onExtraCallback);
            this.onExtraCallback.write(menuKtExternalSyntheticLambda3.onNavigationEvent);
            this.onExtraCallback.flush();
            return this.IAuthTabCallback.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void onNavigationEvent(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }
}
