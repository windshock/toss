package o;

import android.media.MediaCodec;
import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class AppBarKtExternalSyntheticLambda10 extends TextFieldSelectionState_androidKtExternalSyntheticLambda3 {
    public final AppBarKtExternalSyntheticLambda5 codecInfo;
    public final String diagnosticInfo;
    public final int errorCode;

    public AppBarKtExternalSyntheticLambda10(Throwable th, @Nullable AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoder failed: ");
        sb.append(appBarKtExternalSyntheticLambda5 == null ? null : appBarKtExternalSyntheticLambda5.IAuthTabCallbackStub);
        super(sb.toString(), th);
        this.codecInfo = appBarKtExternalSyntheticLambda5;
        this.diagnosticInfo = th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null;
        this.errorCode = onNavigationEvent(th);
    }

    private static int onNavigationEvent(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getErrorCode();
        }
        return 0;
    }
}
