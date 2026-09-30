package o;

import android.content.UriMatcher;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinAdServiceImplExternalSyntheticLambda2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final UriMatcher onWarmupCompleted = new UriMatcher(-1);

    public final void onExtraCallback(@NotNull String str, int i) throws Exception {
        String str2 = "";
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        try {
            Uri uri = Uri.parse(str);
            String authority = uri.getAuthority();
            String path = uri.getPath();
            if (path == null) {
                int i3 = onExtraCallback + 79;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
            } else {
                str2 = path;
            }
            if (str2.length() <= 0) {
                str2 = null;
            }
            this.onWarmupCompleted.addURI(authority, str2, i);
        } catch (Exception e) {
            if (zzaj.onNavigationEvent().onActivityLayout()) {
                throw e;
            }
            int i4 = onExtraCallback + 57;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public final int onExtraCallback(@NotNull Uri uri) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(uri, "");
            return this.onWarmupCompleted.match(uri);
        }
        Intrinsics.checkNotNullParameter(uri, "");
        int i3 = 52 / 0;
        return this.onWarmupCompleted.match(uri);
    }
}
