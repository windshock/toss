package o;

import android.util.Base64;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SubcomposeAsyncImageKtExternalSyntheticLambda1 {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final RealDrawScopeSizeResolversizeinlinedmapNotNull121 onNavigationEvent;

    static {
        int i = onWarmupCompleted + 71;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Inject
    public SubcomposeAsyncImageKtExternalSyntheticLambda1(@NotNull RealDrawScopeSizeResolversizeinlinedmapNotNull121 realDrawScopeSizeResolversizeinlinedmapNotNull121) {
        Intrinsics.checkNotNullParameter(realDrawScopeSizeResolversizeinlinedmapNotNull121, "");
        this.onNavigationEvent = realDrawScopeSizeResolversizeinlinedmapNotNull121;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:10:0x002c, B:11:0x0037, B:14:0x0051, B:16:0x0064, B:17:0x006b, B:9:0x0021), top: B:21:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[Catch: all -> 0x006c, TRY_ENTER, TryCatch #0 {all -> 0x006c, blocks: (B:10:0x002c, B:11:0x0037, B:14:0x0051, B:16:0x0064, B:17:0x006b, B:9:0x0021), top: B:21:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String onWarmupCompleted(@NotNull String str, boolean z) throws Throwable {
        byte[] bytes;
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                int i3 = 37 / 0;
                if (z) {
                    bytes = new byte[16];
                    new SecureRandom().nextBytes(bytes);
                } else {
                    bytes = "e3b0c44298fc1c14".getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                }
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                if (z) {
                }
            }
            RealDrawScopeSizeResolversizeinlinedmapNotNull121 realDrawScopeSizeResolversizeinlinedmapNotNull121 = this.onNavigationEvent;
            byte[] bytes2 = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "");
            byte[] bArrOnExtraCallbackWithResult = realDrawScopeSizeResolversizeinlinedmapNotNull121.onExtraCallbackWithResult(bytes, bytes2);
            if (bArrOnExtraCallbackWithResult == null) {
                throw new NullPointerException("encrypt result is null");
            }
            int i4 = onExtraCallbackWithResult + 49;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            byte[] bArr = new byte[bArrOnExtraCallbackWithResult.length + 16];
            System.arraycopy(bytes, 0, bArr, 0, 16);
            System.arraycopy(bArrOnExtraCallbackWithResult, 0, bArr, 16, bArrOnExtraCallbackWithResult.length);
            String strEncodeToString = Base64.encodeToString(bArr, 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
            return strEncodeToString;
        } catch (Throwable th) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "OneClickLoginCipherWrapper", "encode", th, (Map) null, 8, (Object) null);
            return "";
        }
    }

    public final String IAuthTabCallback(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrDecode, 0, 16);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrDecode, 16, bArrDecode.length);
            RealDrawScopeSizeResolversizeinlinedmapNotNull121 realDrawScopeSizeResolversizeinlinedmapNotNull121 = this.onNavigationEvent;
            Intrinsics.checkNotNull(bArrCopyOfRange);
            Intrinsics.checkNotNull(bArrCopyOfRange2);
            byte[] bArrOnNavigationEvent = realDrawScopeSizeResolversizeinlinedmapNotNull121.onNavigationEvent(bArrCopyOfRange, bArrCopyOfRange2);
            if (bArrOnNavigationEvent != null) {
                return new String(bArrOnNavigationEvent, Charsets.UTF_8);
            }
            throw new NullPointerException("decrypt result is null");
        } catch (Throwable th) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "OneClickLoginCipherWrapper", "decode", th, (Map) null, 8, (Object) null);
            int i4 = onExtraCallbackWithResult + 71;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return "";
            }
            throw null;
        }
    }
}
