package o;

import android.content.Intent;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import com.krc.pl_card.enums.ResponseCode;
import com.krc.pl_card.exceptions.ApduException;
import com.krc.pl_card.exceptions.EpTagException;
import java.io.Closeable;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class CarouselKtExternalSyntheticLambda1 implements Closeable {
    private final IsoDep onExtraCallback;
    private final Tag onWarmupCompleted;

    public CarouselKtExternalSyntheticLambda1(@NotNull Intent intent) throws EpTagException {
        Intrinsics.checkNotNullParameter(intent, "");
        try {
            Tag tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
            if (tag == null) {
                throw new EpTagException(ResponseCode.ERROR_TAG_FAIL, null, null, 6, null);
            }
            this.onWarmupCompleted = tag;
            IsoDep isoDep = IsoDep.get(tag);
            Intrinsics.checkNotNullExpressionValue(isoDep, "");
            this.onExtraCallback = isoDep;
        } catch (Exception e) {
            throw new EpTagException(ResponseCode.ERROR_TAG_FAIL, "태그 인식 실패", e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.onExtraCallback.close();
            ApmHelper11.IAuthTabCallback("closeTag call()", new Object[0]);
        } catch (Exception e) {
            ApmHelper11.IAuthTabCallback("exception: " + e, new Object[0]);
        }
    }

    public final String onExtraCallbackWithResult(@NotNull String str) throws IOException, ApduException {
        Intrinsics.checkNotNullParameter(str, "");
        ApmHelper11.IAuthTabCallback("SND >>> " + str, new Object[0]);
        byte[] bArrTransceive = this.onExtraCallback.transceive(onNavigationEvent.onNavigationEvent(str));
        Intrinsics.checkNotNullExpressionValue(bArrTransceive, "");
        String strOnExtraCallbackWithResult = onNavigationEvent.onExtraCallbackWithResult(bArrTransceive);
        ApmHelper11.IAuthTabCallback("REV <<< " + strOnExtraCallbackWithResult, new Object[0]);
        String strSubstring = strOnExtraCallbackWithResult.substring(strOnExtraCallbackWithResult.length() + (-4), strOnExtraCallbackWithResult.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        if (Intrinsics.areEqual(strSubstring, "9000")) {
            return strOnExtraCallbackWithResult;
        }
        throw new ApduException("fail to process command. error code:(" + strSubstring + ')', strSubstring, null, 4, null);
    }

    public final void onTransact() throws EpTagException, IOException {
        try {
            if (this.onExtraCallback.isConnected()) {
                return;
            }
            this.onExtraCallback.connect();
        } catch (Exception unused) {
            throw new EpTagException(ResponseCode.ERROR_TAG_LOST, "통신 중 카드가 분리되었습니다.", null, 4, null);
        }
    }
}
