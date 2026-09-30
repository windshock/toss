package im.toss.tosssecurities.webview.composable;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import im.toss.tosssecurities.webview.composable.TossSecWebViewPullToRefreshLayout$;
import im.toss.uikit.widget.PillarSwipeRefreshLayout;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AFi1iSDK;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TossSecWebViewPullToRefreshLayout extends PillarSwipeRefreshLayout {
    private static int extraCallbackWithResult = 1;
    private static int writeTypedObject;
    private View IAuthTabCallback_Parcel;
    private AFi1iSDK access100;

    public static /* synthetic */ Unit onWarmupCompleted(WeakReference weakReference) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 27;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(weakReference);
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TossSecWebViewPullToRefreshLayout(@NotNull Context context) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void setTargetWebView(@Nullable View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 51;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallback_Parcel = view;
        int i5 = i2 + 103;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // im.toss.uikit.widget.PillarSwipeRefreshLayout
    public void onFinishInflate() throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 99;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onFinishInflate();
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // im.toss.uikit.widget.PillarSwipeRefreshLayout
    public boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 33;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        View view = this.IAuthTabCallback_Parcel;
        if (view == null || view.getScrollY() <= 1) {
            int i3 = extraCallbackWithResult + 79;
            writeTypedObject = i3 % 128;
            if (i3 % 2 == 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallbackWithResult + 9;
        int i5 = i4 % 128;
        writeTypedObject = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 61;
        extraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    private static final Unit onExtraCallbackWithResult(WeakReference weakReference) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 113;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TossSecWebViewPullToRefreshLayout tossSecWebViewPullToRefreshLayout = (TossSecWebViewPullToRefreshLayout) weakReference.get();
        if (tossSecWebViewPullToRefreshLayout != null) {
            int i4 = extraCallbackWithResult + 7;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            tossSecWebViewPullToRefreshLayout.asBinder();
            int i6 = writeTypedObject + 55;
            extraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 5;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // im.toss.uikit.widget.PillarSwipeRefreshLayout
    public void onAttachedToWindow() {
        Window window;
        int i = 2 % 2;
        super.onAttachedToWindow();
        Activity activityOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (activityOnExtraCallbackWithResult == null || (window = activityOnExtraCallbackWithResult.getWindow()) == null) {
            return;
        }
        int i2 = extraCallbackWithResult + 19;
        writeTypedObject = i2 % 128;
        AFi1iSDK aFi1iSDK = null;
        if (i2 % 2 != 0) {
            window.getCallback();
            aFi1iSDK.hashCode();
            throw null;
        }
        Window.Callback callback = window.getCallback();
        if (callback != null) {
            if (!(!(callback instanceof AFi1iSDK))) {
                aFi1iSDK = (AFi1iSDK) callback;
                int i3 = extraCallbackWithResult + 83;
                writeTypedObject = i3 % 128;
                int i4 = i3 % 2;
            }
            if (aFi1iSDK == null) {
                aFi1iSDK = new AFi1iSDK(callback);
                window.setCallback(aFi1iSDK);
            }
            this.access100 = aFi1iSDK;
            aFi1iSDK.IAuthTabCallback(new TossSecWebViewPullToRefreshLayout$.ExternalSyntheticLambda0(new WeakReference(this)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 o.AFi1iSDK) = (r1v4 o.AFi1iSDK), (r1v9 o.AFi1iSDK) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // im.toss.uikit.widget.PillarSwipeRefreshLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDetachedFromWindow() {
        AFi1iSDK aFi1iSDK;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 65;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            aFi1iSDK = this.access100;
            int i3 = 40 / 0;
            if (aFi1iSDK != null) {
                aFi1iSDK.onWarmupCompleted();
                int i4 = writeTypedObject + 107;
                extraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            aFi1iSDK = this.access100;
            if (aFi1iSDK != null) {
            }
        }
        this.access100 = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Activity onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 15;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Context context = getContext();
            while (context instanceof ContextWrapper) {
                int i3 = writeTypedObject + 41;
                int i4 = i3 % 128;
                extraCallbackWithResult = i4;
                int i5 = i3 % 2;
                if (!(!(context instanceof Activity))) {
                    int i6 = i4 + 73;
                    writeTypedObject = i6 % 128;
                    int i7 = i6 % 2;
                    return (Activity) context;
                }
                context = ((ContextWrapper) context).getBaseContext();
                int i8 = extraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
                writeTypedObject = i8 % 128;
                int i9 = i8 % 2;
            }
            int i10 = extraCallbackWithResult + 113;
            writeTypedObject = i10 % 128;
            if (i10 % 2 == 0) {
                return null;
            }
            throw null;
        }
        getContext();
        obj.hashCode();
        throw null;
    }

    private final void asBinder() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 57;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        if (i3 != 0) {
            PillarSwipeRefreshLayout.onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1424107480, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1424107495, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        PillarSwipeRefreshLayout.onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1424107480, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1424107495, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
        int i4 = extraCallbackWithResult + 95;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onExtraCallbackWithResult(@NotNull View view) throws Throwable {
        ViewGroup viewGroup;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 113;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        this.IAuthTabCallback_Parcel = view;
        setUseTdsPullToRefresh(true);
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            int i4 = writeTypedObject + Imgproc.COLOR_YUV2RGBA_YVYU;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        addView(view);
        onFinishInflate();
        setTargetView(view, view);
    }
}
