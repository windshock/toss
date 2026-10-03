package o;

import android.content.Context;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.pdfviewer.PdfViewerActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getTBSCertList implements b7 {
    @Inject
    public getTBSCertList() {
    }

    public void onExtraCallback(@NotNull Context context, @NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        context.startActivity(PdfViewerActivity.Companion.onWarmupCompleted(context, str, str2));
    }
}
