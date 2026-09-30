package o;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class WebResourceResponseModel extends CancellationException {
    public final transient getPackageType onWarmupCompleted;

    public WebResourceResponseModel(@NotNull String str, @Nullable getPackageType getpackagetype) {
        super(str);
        this.onWarmupCompleted = getpackagetype;
    }

    public WebResourceResponseModel(@NotNull String str) {
        this(str, null);
    }
}
