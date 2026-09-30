package o;

import android.os.Build;
import java.util.UUID;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionRegistrarKtExternalSyntheticLambda0 implements TextFieldSelectionState_androidKtExternalSyntheticLambda4 {
    public static final boolean onWarmupCompleted;
    public final UUID IAuthTabCallback;
    public final byte[] onExtraCallback;

    @Deprecated
    public final boolean onExtraCallbackWithResult;

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    static {
        boolean z;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            z = "AFTM".equals(str) || "AFTB".equals(str);
        }
        onWarmupCompleted = z;
    }

    public SelectionRegistrarKtExternalSyntheticLambda0(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    @Deprecated
    public SelectionRegistrarKtExternalSyntheticLambda0(UUID uuid, byte[] bArr, boolean z) {
        this.IAuthTabCallback = uuid;
        this.onExtraCallback = bArr;
        this.onExtraCallbackWithResult = z;
    }
}
