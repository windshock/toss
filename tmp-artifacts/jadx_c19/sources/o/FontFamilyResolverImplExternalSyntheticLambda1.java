package o;

import android.content.Context;
import java.io.File;
import o.FontFamilyResolverImplExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class FontFamilyResolverImplExternalSyntheticLambda1 extends FontFamilyResolverImplExternalSyntheticLambda3 {
    public FontFamilyResolverImplExternalSyntheticLambda1(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public FontFamilyResolverImplExternalSyntheticLambda1(final Context context, final String str, long j) {
        super(new FontFamilyResolverImplExternalSyntheticLambda3.IAuthTabCallback() { // from class: o.FontFamilyResolverImplExternalSyntheticLambda1.5
            @Override // o.FontFamilyResolverImplExternalSyntheticLambda3.IAuthTabCallback
            public File onWarmupCompleted() {
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                return str != null ? new File(cacheDir, str) : cacheDir;
            }
        }, j);
    }
}
