package o;

import android.content.Context;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class A_ {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0063, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0064, code lost:
    
        r3 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout(r5);
        r3.setProgressBackgroundColorSchemeColor(r8);
        r3.setColorSchemeColors(new int[]{r9});
        r3.setProgressViewOffset(false, r7, r1);
        r5 = r6.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        if ((r5 instanceof android.view.ViewGroup) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007e, code lost:
    
        r5 = (android.view.ViewGroup) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
    
        if (r5 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
    
        r5.removeView(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
    
        r3.addView(r6);
        r5 = o.A_.IAuthTabCallback + 29;
        o.A_.onExtraCallback = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        if (o.newKnownLengthSink.Companion.onWarmupCompleted(o.Http1ExchangeCodecAbstractSource.SEAND_4264) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
    
        if (o.newKnownLengthSink.Companion.onWarmupCompleted(o.Http1ExchangeCodecAbstractSource.SEAND_4264) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        r0 = new im.toss.tosssecurities.webview.composable.TossSecWebViewPullToRefreshLayout(r5);
        r0.onExtraCallbackWithResult(r6);
        r0.setProgressBackgroundColorSchemeColor(r8);
        r0.setColorSchemeColors(new int[]{r9});
        r0.setProgressViewOffset(false, r7, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SwipeRefreshLayout IAuthTabCallback(@NotNull Context context, @NotNull View view, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(view, "");
            i4 = ((int) (64.0f % context.getResources().getDisplayMetrics().density)) >>> i;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(view, "");
            i4 = ((int) (context.getResources().getDisplayMetrics().density * 64.0f)) + i;
        }
    }
}
