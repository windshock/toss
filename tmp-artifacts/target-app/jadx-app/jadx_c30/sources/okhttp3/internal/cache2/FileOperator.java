package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.TTBaseActivity;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(@NotNull FileChannel fileChannel) {
        Intrinsics.checkNotNullParameter(fileChannel, BuildConfig.FLAVOR);
        this.fileChannel = fileChannel;
    }

    public final void write(long j, @NotNull TTBaseActivity tTBaseActivity, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(tTBaseActivity, BuildConfig.FLAVOR);
        if (j2 < 0 || j2 > tTBaseActivity.ICustomTabsCallbackDefault()) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(tTBaseActivity, j, j2);
            j += jTransferFrom;
            j2 -= jTransferFrom;
        }
    }

    public final void read(long j, @NotNull TTBaseActivity tTBaseActivity, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(tTBaseActivity, BuildConfig.FLAVOR);
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long jTransferTo = this.fileChannel.transferTo(j, j2, tTBaseActivity);
            j += jTransferTo;
            j2 -= jTransferTo;
        }
    }
}
