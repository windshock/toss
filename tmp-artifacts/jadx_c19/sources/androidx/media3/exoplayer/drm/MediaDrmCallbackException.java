package androidx.media3.exoplayer.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import o.TextFieldSelectionStateExternalSyntheticLambda12;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class MediaDrmCallbackException extends IOException {
    public final long bytesLoaded;
    public final TextFieldSelectionStateExternalSyntheticLambda12 dataSpec;
    public final Map<String, List<String>> responseHeaders;
    public final Uri uriAfterRedirects;

    public MediaDrmCallbackException(TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12, Uri uri, Map<String, List<String>> map, long j, Throwable th) {
        super(th);
        this.dataSpec = textFieldSelectionStateExternalSyntheticLambda12;
        this.uriAfterRedirects = uri;
        this.responseHeaders = map;
        this.bytesLoaded = j;
    }
}
