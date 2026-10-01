package o;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NiceImageView {
    private static final dj7 IAuthTabCallback;
    static final Charset onWarmupCompleted;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(".tgz", ".tar");
        linkedHashMap.put(".taz", ".tar");
        linkedHashMap.put(".svgz", ".svg");
        linkedHashMap.put(".cpgz", ".cpio");
        linkedHashMap.put(".wmz", ".wmf");
        linkedHashMap.put(".emz", ".emf");
        linkedHashMap.put(".gz", _UrlKt.FRAGMENT_ENCODE_SET);
        linkedHashMap.put(".z", _UrlKt.FRAGMENT_ENCODE_SET);
        linkedHashMap.put("-gz", _UrlKt.FRAGMENT_ENCODE_SET);
        linkedHashMap.put("-z", _UrlKt.FRAGMENT_ENCODE_SET);
        linkedHashMap.put("_z", _UrlKt.FRAGMENT_ENCODE_SET);
        IAuthTabCallback = new dj7(linkedHashMap, ".gz");
        onWarmupCompleted = StandardCharsets.ISO_8859_1;
    }
}
