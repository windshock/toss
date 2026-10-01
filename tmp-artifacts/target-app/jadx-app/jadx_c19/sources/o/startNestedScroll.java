package o;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class startNestedScroll extends startInterceptRequestLayout {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final String onNavigationEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public startNestedScroll(@NotNull repositionShadowingViews repositionshadowingviews, @NotNull setItemViewCacheSize setitemviewcachesize) {
        super(repositionshadowingviews, setitemviewcachesize);
        Intrinsics.checkNotNullParameter(repositionshadowingviews, "");
        Intrinsics.checkNotNullParameter(setitemviewcachesize, "");
    }

    public final void onWarmupCompleted(@NotNull OutputStream outputStream, @NotNull Bitmap.CompressFormat compressFormat) {
        Intrinsics.checkNotNullParameter(outputStream, "");
        Intrinsics.checkNotNullParameter(compressFormat, "");
        if (!onWarmupCompleted()) {
            throw new RuntimeException("Expected EGL context/surface is not current");
        }
        int iOnExtraCallback = onExtraCallback();
        int iOnNavigationEvent = onNavigationEvent();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((iOnExtraCallback * iOnNavigationEvent) << 2);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        GLES20.glReadPixels(0, 0, iOnExtraCallback, iOnNavigationEvent, 6408, 5121, byteBufferAllocateDirect);
        scrollByInternal.IAuthTabCallback("glReadPixels");
        byteBufferAllocateDirect.rewind();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iOnExtraCallback, iOnNavigationEvent, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
        bitmapCreateBitmap.compress(compressFormat, 90, outputStream);
        bitmapCreateBitmap.recycle();
    }

    public final byte[] IAuthTabCallback(@NotNull Bitmap.CompressFormat compressFormat) {
        Intrinsics.checkNotNullParameter(compressFormat, "");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            onWarmupCompleted(byteArrayOutputStream, compressFormat);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "");
            CloseableKt.closeFinally(byteArrayOutputStream, (Throwable) null);
            return byteArray;
        } finally {
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    static {
        String simpleName = setItemViewCacheSize.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        onNavigationEvent = simpleName;
    }
}
