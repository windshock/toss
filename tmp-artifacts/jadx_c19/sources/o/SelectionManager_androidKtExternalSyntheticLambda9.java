package o;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.common.io.ByteStreams;
import java.util.List;
import java.util.Map;
import o.SelectionManager_androidKtExternalSyntheticLambda5;
import o.TextFieldSelectionStateExternalSyntheticLambda12;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionManager_androidKtExternalSyntheticLambda9 {
    public static int onExtraCallback(Throwable th, int i2) {
        if (th instanceof MediaDrm.MediaDrmStateException) {
            Object[] objArr = {((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(((Integer) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1451125048, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1451125034)).intValue());
        }
        if (IAuthTabCallback.onNavigationEvent(th)) {
            return 6006;
        }
        if ((th instanceof NotProvisionedException) || onExtraCallback(th)) {
            return 6002;
        }
        if (th instanceof DeniedByServerException) {
            return 6007;
        }
        if (th instanceof TextFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda4) {
            return 6001;
        }
        if (th instanceof SelectionManager_androidKtExternalSyntheticLambda5.onExtraCallbackWithResult) {
            return 6003;
        }
        if (th instanceof TextFieldSelectionManagerExternalSyntheticLambda1) {
            return 6008;
        }
        if (i2 == 1) {
            return 6006;
        }
        if (i2 == 2) {
            return 6004;
        }
        if (i2 == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    public static boolean onExtraCallback(@Nullable Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean onNavigationEvent(@Nullable Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:9|21|10|(2:12|13)(2:26|15)) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        r1 = onWarmupCompleted(r11, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r1 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r8 = r8 + 1;
        r9 = r9.onExtraCallbackWithResult().onExtraCallback(r1).onExtraCallbackWithResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        o.TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        r11 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] IAuthTabCallback(TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, String str, @Nullable byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        TextFieldSelectionStateExternalSyntheticLambda6 textFieldSelectionStateExternalSyntheticLambda6 = new TextFieldSelectionStateExternalSyntheticLambda6(textFieldSelectionStateExternalSyntheticLambda0);
        TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult = new TextFieldSelectionStateExternalSyntheticLambda12.onExtraCallback().onExtraCallback(str).onNavigationEvent(map).IAuthTabCallback(2).onExtraCallbackWithResult(bArr).onExtraCallbackWithResult(1).onExtraCallbackWithResult();
        int i2 = 0;
        TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult2 = textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult;
        while (true) {
            try {
                TextFieldSelectionStateExternalSyntheticLambda11 textFieldSelectionStateExternalSyntheticLambda11 = new TextFieldSelectionStateExternalSyntheticLambda11(textFieldSelectionStateExternalSyntheticLambda6, textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult2);
                return ByteStreams.toByteArray(textFieldSelectionStateExternalSyntheticLambda11);
            } catch (Exception e) {
                throw new MediaDrmCallbackException(textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult, textFieldSelectionStateExternalSyntheticLambda6.IAuthTabCallback(), textFieldSelectionStateExternalSyntheticLambda6.onExtraCallbackWithResult(), textFieldSelectionStateExternalSyntheticLambda6.onNavigationEvent(), e);
            }
        }
    }

    private static String onWarmupCompleted(HttpDataSource.InvalidResponseCodeException invalidResponseCodeException, int i2) {
        Map map;
        List list;
        int i3 = invalidResponseCodeException.responseCode;
        if ((i3 != 307 && i3 != 308) || i2 >= 5 || (map = invalidResponseCodeException.headerFields) == null || (list = (List) map.get(RtspHeaders.LOCATION)) == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    static final class IAuthTabCallback {
        public static boolean onNavigationEvent(@Nullable Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }
}
