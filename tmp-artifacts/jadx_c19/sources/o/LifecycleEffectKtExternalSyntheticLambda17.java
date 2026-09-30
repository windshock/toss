package o;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class LifecycleEffectKtExternalSyntheticLambda17 extends LifecycleEffectKtExternalSyntheticLambda1<UUID> implements assertMainThread {
    static final char[] IAuthTabCallback = "0123456789abcdef".toCharArray();
    protected final Boolean _asBinary;

    public LifecycleEffectKtExternalSyntheticLambda17() {
        this(null);
    }

    protected LifecycleEffectKtExternalSyntheticLambda17(Boolean bool) {
        super(UUID.class);
        this._asBinary = bool;
    }

    @Override // o.FragmentFactory
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public boolean IAuthTabCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, UUID uuid) {
        return uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    @Override // o.assertMainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FragmentFactory<?> onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        Boolean bool;
        registerOnPreAttachListener$onExtraCallback registeronpreattachlistener_onextracallbackOnWarmupCompleted = onWarmupCompleted(fragmentManagerExternalSyntheticLambda1, validaterequestpermissionsrequestcode, onWarmupCompleted());
        if (registeronpreattachlistener_onextracallbackOnWarmupCompleted == null) {
            bool = null;
        } else {
            registerOnPreAttachListener$onWarmupCompleted registeronpreattachlistener_onwarmupcompletedOnExtraCallback = registeronpreattachlistener_onextracallbackOnWarmupCompleted.onExtraCallback();
            if (registeronpreattachlistener_onwarmupcompletedOnExtraCallback == registerOnPreAttachListener$onWarmupCompleted.BINARY) {
                bool = Boolean.TRUE;
            } else if (registeronpreattachlistener_onwarmupcompletedOnExtraCallback == registerOnPreAttachListener$onWarmupCompleted.STRING) {
                bool = Boolean.FALSE;
            }
        }
        return !Objects.equals(bool, this._asBinary) ? new LifecycleEffectKtExternalSyntheticLambda17(bool) : this;
    }

    @Override // o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onExtraCallback(UUID uuid, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
        if (onExtraCallbackWithResult(getview)) {
            getview.onWarmupCompleted(onExtraCallback(uuid));
            return;
        }
        char[] cArr = new char[36];
        long mostSignificantBits = uuid.getMostSignificantBits();
        onWarmupCompleted((int) (mostSignificantBits >> 32), cArr, 0);
        cArr[8] = '-';
        int i2 = (int) mostSignificantBits;
        onExtraCallback(i2 >>> 16, cArr, 9);
        cArr[13] = '-';
        onExtraCallback(i2, cArr, 14);
        cArr[18] = '-';
        long leastSignificantBits = uuid.getLeastSignificantBits();
        onExtraCallback((int) (leastSignificantBits >>> 48), cArr, 19);
        cArr[23] = '-';
        onExtraCallback((int) (leastSignificantBits >>> 32), cArr, 24);
        onWarmupCompleted((int) leastSignificantBits, cArr, 28);
        getview.onNavigationEvent(cArr, 0, 36);
    }

    protected boolean onExtraCallbackWithResult(getView getview) {
        Boolean bool = this._asBinary;
        if (bool != null) {
            return bool.booleanValue();
        }
        return !(getview instanceof waitForLoader) && getview.onNavigationEvent();
    }

    private static void onWarmupCompleted(int i2, char[] cArr, int i3) {
        onExtraCallback(i2 >> 16, cArr, i3);
        onExtraCallback(i2, cArr, i3 + 4);
    }

    private static void onExtraCallback(int i2, char[] cArr, int i3) {
        char[] cArr2 = IAuthTabCallback;
        cArr[i3] = cArr2[(i2 >> 12) & 15];
        cArr[i3 + 1] = cArr2[(i2 >> 8) & 15];
        cArr[i3 + 2] = cArr2[(i2 >> 4) & 15];
        cArr[i3 + 3] = cArr2[i2 & 15];
    }

    private static final byte[] onExtraCallback(UUID uuid) {
        byte[] bArr = new byte[16];
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        onWarmupCompleted((int) (mostSignificantBits >> 32), bArr, 0);
        onWarmupCompleted((int) mostSignificantBits, bArr, 4);
        onWarmupCompleted((int) (leastSignificantBits >> 32), bArr, 8);
        onWarmupCompleted((int) leastSignificantBits, bArr, 12);
        return bArr;
    }

    private static final void onWarmupCompleted(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) (i2 >> 24);
        bArr[i3 + 1] = (byte) (i2 >> 16);
        bArr[i3 + 2] = (byte) (i2 >> 8);
        bArr[i3 + 3] = (byte) i2;
    }
}
