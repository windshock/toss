package o;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import o.SimpleLayoutKtExternalSyntheticLambda0;
import o.TextFieldSelectionStateExternalSyntheticLambda0;
import o.TextFieldSelectionStateExternalSyntheticLambda12;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda0 implements TextFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda1 {
    private final String IAuthTabCallback;
    private final TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final Map<String, String> onWarmupCompleted;

    public TextFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda0(@Nullable String str, boolean z, TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onextracallback) {
        RecordingInputConnection_androidKt.onNavigationEvent((z && TextUtils.isEmpty(str)) ? false : true);
        this.onExtraCallback = onextracallback;
        this.IAuthTabCallback = str;
        this.onExtraCallbackWithResult = z;
        this.onWarmupCompleted = new HashMap();
    }

    public void onNavigationEvent(String str, String str2) {
        synchronized (this.onWarmupCompleted) {
            this.onWarmupCompleted.put(str, str2);
        }
    }

    @Override // o.TextFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda1
    public byte[] onNavigationEvent(UUID uuid, SimpleLayoutKtExternalSyntheticLambda0.onTransact ontransact) throws MediaDrmCallbackException {
        return SelectionManager_androidKtExternalSyntheticLambda9.IAuthTabCallback(this.onExtraCallback.createDataSource(), ontransact.onNavigationEvent() + "&signedRequest=" + TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(ontransact.IAuthTabCallback()), null, Collections.EMPTY_MAP);
    }

    @Override // o.TextFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda1
    public byte[] onNavigationEvent(UUID uuid, SimpleLayoutKtExternalSyntheticLambda0.onExtraCallback onextracallback) throws MediaDrmCallbackException {
        String str;
        String strOnExtraCallback = onextracallback.onExtraCallback();
        if (this.onExtraCallbackWithResult || TextUtils.isEmpty(strOnExtraCallback)) {
            strOnExtraCallback = this.IAuthTabCallback;
        }
        if (TextUtils.isEmpty(strOnExtraCallback)) {
            TextFieldSelectionStateExternalSyntheticLambda12.onExtraCallback onextracallback2 = new TextFieldSelectionStateExternalSyntheticLambda12.onExtraCallback();
            Uri uri = Uri.EMPTY;
            throw new MediaDrmCallbackException(onextracallback2.IAuthTabCallback(uri).onExtraCallbackWithResult(), uri, ImmutableMap.of(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.onNavigationEvent;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.IAuthTabCallback.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put(RtspHeaders.CONTENT_TYPE, str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.onWarmupCompleted) {
            map.putAll(this.onWarmupCompleted);
        }
        return SelectionManager_androidKtExternalSyntheticLambda9.IAuthTabCallback(this.onExtraCallback.createDataSource(), strOnExtraCallback, onextracallback.onExtraCallbackWithResult(), map);
    }
}
