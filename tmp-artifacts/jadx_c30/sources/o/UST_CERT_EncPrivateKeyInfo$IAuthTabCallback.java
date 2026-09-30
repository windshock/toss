package o;

import java.io.ByteArrayOutputStream;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class UST_CERT_EncPrivateKeyInfo$IAuthTabCallback {
    private final byte IAuthTabCallback;
    private final byte IAuthTabCallbackStub;
    private final byte asInterface;
    private final byte onExtraCallback;
    private final byte onExtraCallbackWithResult;
    private final Byte onNavigationEvent;
    private final byte[] onWarmupCompleted;

    public UST_CERT_EncPrivateKeyInfo$IAuthTabCallback(byte b, byte b2, byte b3, byte b4, @Nullable Byte b5, @Nullable byte[] bArr, byte b6) {
        this.onExtraCallbackWithResult = b;
        this.IAuthTabCallback = b2;
        this.IAuthTabCallbackStub = b3;
        this.asInterface = b4;
        this.onNavigationEvent = b5;
        this.onWarmupCompleted = bArr;
        this.onExtraCallback = b6;
    }

    public /* synthetic */ UST_CERT_EncPrivateKeyInfo$IAuthTabCallback(byte b, byte b2, byte b3, byte b4, Byte b5, byte[] bArr, byte b6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(b, b2, b3, b4, (i & 16) != 0 ? null : b5, (i & 32) != 0 ? null : bArr, b6);
    }

    public final byte[] onExtraCallbackWithResult() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(this.onExtraCallbackWithResult);
            byteArrayOutputStream.write(this.IAuthTabCallback);
            byteArrayOutputStream.write(this.IAuthTabCallbackStub);
            byteArrayOutputStream.write(this.asInterface);
            Byte b = this.onNavigationEvent;
            if (b != null) {
                byteArrayOutputStream.write(b.byteValue());
            }
            byte[] bArr = this.onWarmupCompleted;
            if (bArr != null) {
                byteArrayOutputStream.write(bArr);
            }
            byteArrayOutputStream.write(this.onExtraCallback);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            CloseableKt.closeFinally(byteArrayOutputStream, (Throwable) null);
            Intrinsics.checkNotNullExpressionValue(byteArray, BuildConfig.FLAVOR);
            return byteArray;
        } finally {
        }
    }
}
