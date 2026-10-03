package o;

import android.net.Uri;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class CertificatePolicies extends roundedRect {
    private final List<UST_CERT_GetOCSPAddr> IAuthTabCallback;

    public CertificatePolicies() {
        super((IconRoundCornerProgressBar1) null, 1, (DefaultConstructorMarker) null);
        this.IAuthTabCallback = new ArrayList();
    }

    public boolean onNavigationEvent(@NotNull WebView webView, @Nullable String str) {
        Intrinsics.checkNotNullParameter(webView, "");
        if (str == null || str.length() == 0) {
            return false;
        }
        List<UST_CERT_GetOCSPAddr> list = this.IAuthTabCallback;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((UST_CERT_GetOCSPAddr) it.next()).onExtraCallback(str)) {
                    return true;
                }
            }
        }
        return super/*o.ALCFocusCircle*/.onNavigationEvent(webView, str);
    }

    public boolean IAuthTabCallbackDefault(@NotNull WebView webView, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(uri, "");
        boolean zOnExtraCallback = false;
        for (UST_CERT_GetOCSPAddr uST_CERT_GetOCSPAddr : this.IAuthTabCallback) {
            if (uST_CERT_GetOCSPAddr.onNavigationEvent(uri)) {
                zOnExtraCallback = uST_CERT_GetOCSPAddr.onExtraCallback(uri);
            }
        }
        return !zOnExtraCallback ? super/*o.ALCFocusCircle*/.IAuthTabCallbackDefault(webView, uri) : zOnExtraCallback;
    }
}
