package im.toss.tosssecurities.webview.composable;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.r8lambdaChKvIV5SLB3mGu6g_zHUM1FIZcE;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TossSecWebSwipeRefreshLayout extends SwipeRefreshLayout {
    private static int extraCallbackWithResult = 0;
    private static int writeTypedObject = 1;
    private final r8lambdaChKvIV5SLB3mGu6g_zHUM1FIZcE IAuthTabCallback_Parcel;
    private boolean access100;
    private final Function0<Boolean> getInterfaceDescriptor;
    private final View readTypedObject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TossSecWebSwipeRefreshLayout(@NotNull Context context, @NotNull View view, @NotNull Function0<Boolean> function0) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.readTypedObject = view;
        this.getInterfaceDescriptor = function0;
        this.IAuthTabCallback_Parcel = new r8lambdaChKvIV5SLB3mGu6g_zHUM1FIZcE(ViewConfiguration.get(context).getScaledTouchSlop());
    }

    public boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 21;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (this.readTypedObject.getScrollY() <= 1) {
            return false;
        }
        int i4 = extraCallbackWithResult + 77;
        writeTypedObject = i4 % 128;
        return i4 % 2 != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (r6.IAuthTabCallback_Parcel.IAuthTabCallback() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        if (r6.IAuthTabCallback_Parcel.IAuthTabCallback() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        r7 = im.toss.tosssecurities.webview.composable.TossSecWebSwipeRefreshLayout.extraCallbackWithResult + 51;
        im.toss.tosssecurities.webview.composable.TossSecWebSwipeRefreshLayout.writeTypedObject = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        if ((r7 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 15;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            int i4 = extraCallbackWithResult + 21;
            writeTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                this.access100 = this.getInterfaceDescriptor.invoke().booleanValue();
                int i5 = 6 / 0;
            } else {
                this.access100 = this.getInterfaceDescriptor.invoke().booleanValue();
            }
        }
        if (this.access100) {
            int i6 = extraCallbackWithResult + 93;
            writeTypedObject = i6 % 128;
            if (i6 % 2 == 0) {
                this.IAuthTabCallback_Parcel.onExtraCallbackWithResult(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
                int i7 = 26 / 0;
            } else {
                this.IAuthTabCallback_Parcel.onExtraCallbackWithResult(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
