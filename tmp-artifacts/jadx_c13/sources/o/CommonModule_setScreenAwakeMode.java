package o;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.CommonModule_setLeftEdgeTouchEnabled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class CommonModule_setScreenAwakeMode {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static final TdsDialogV1 onExtraCallbackWithResult(@NotNull Context context, @NotNull Function1<? super CommonModule_setLeftEdgeTouchEnabled, Unit> function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i2 % 128;
        initMiniApp initminiapp = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(function1, "");
            boolean z = context instanceof initMiniApp;
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (context instanceof initMiniApp) {
            initminiapp = (initMiniApp) context;
        } else if (context instanceof Activity) {
            Object tag = ((Activity) context).findViewById(R.id.content).getRootView().getTag(im.toss.logging.automation.R.id.auto_log_screen_view_tag);
            if (tag instanceof initMiniApp) {
                initminiapp = (initMiniApp) tag;
                int i3 = onNavigationEvent + 103;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        return IAuthTabCallback(context, initminiapp, function1);
    }

    public static final TdsDialogV1 IAuthTabCallback(@NotNull Context context, @Nullable initMiniApp initminiapp, @NotNull Function1<? super CommonModule_setLeftEdgeTouchEnabled, Unit> function1) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(function1, "");
            return CommonModule_setLeftEdgeTouchEnabled.Companion.onWarmupCompleted(context, initminiapp, function1);
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        TdsDialogV1 tdsDialogV1OnWarmupCompleted = CommonModule_setLeftEdgeTouchEnabled.Companion.onWarmupCompleted(context, initminiapp, function1);
        int i3 = 41 / 0;
        return tdsDialogV1OnWarmupCompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final TdsDialogV1 onNavigationEvent(@NotNull Fragment fragment, @NotNull Function1<? super CommonModule_setLeftEdgeTouchEnabled, Unit> function1) throws Throwable {
        initMiniApp initminiapp;
        View rootView;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (fragment instanceof initMiniApp) {
            initminiapp = (initMiniApp) fragment;
        } else {
            View view = fragment.getView();
            if (view != null) {
                int i2 = onNavigationEvent + 17;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    view.findViewById(R.id.content);
                    throw null;
                }
                View viewFindViewById = view.findViewById(R.id.content);
                Object tag = (viewFindViewById == null || (rootView = viewFindViewById.getRootView()) == null) ? null : rootView.getTag(im.toss.logging.automation.R.id.auto_log_screen_view_tag);
                if (tag instanceof initMiniApp) {
                    int i3 = onNavigationEvent + 3;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                    initminiapp = (initMiniApp) tag;
                } else {
                    initminiapp = null;
                }
            }
        }
        TdsDialogV1 tdsDialogV1OnWarmupCompleted = onWarmupCompleted(fragment, initminiapp, function1);
        int i4 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return tdsDialogV1OnWarmupCompleted;
        }
        throw null;
    }

    public static final TdsDialogV1 onWarmupCompleted(@NotNull Fragment fragment, @Nullable initMiniApp initminiapp, @NotNull Function1<? super CommonModule_setLeftEdgeTouchEnabled, Unit> function1) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(function1, "");
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult onextracallbackwithresult = CommonModule_setLeftEdgeTouchEnabled.Companion;
            Context contextRequireContext = fragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            return onextracallbackwithresult.onWarmupCompleted(contextRequireContext, initminiapp, function1);
        }
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult onextracallbackwithresult2 = CommonModule_setLeftEdgeTouchEnabled.Companion;
        Context contextRequireContext2 = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        TdsDialogV1 tdsDialogV1OnWarmupCompleted = onextracallbackwithresult2.onWarmupCompleted(contextRequireContext2, initminiapp, function1);
        int i3 = 18 / 0;
        return tdsDialogV1OnWarmupCompleted;
    }

    public static final getByteBuffer<CommonModule_setLeftEdgeTouchEnabled.onNavigationEvent> onNavigationEvent(@NotNull Context context, @NotNull Function1<? super CommonModule_setLeftEdgeTouchEnabled, Unit> function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        getByteBuffer<CommonModule_setLeftEdgeTouchEnabled.onNavigationEvent> getbytebufferIAuthTabCallback = CommonModule_setLeftEdgeTouchEnabled.Companion.IAuthTabCallback(context, function1);
        int i4 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return getbytebufferIAuthTabCallback;
    }

    public static final writeRaw<CommonModule_setLeftEdgeTouchEnabled.onNavigationEvent> IAuthTabCallback(@NotNull Context context, @NotNull Function1<? super CommonModule_setLeftEdgeTouchEnabled, Unit> function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(function1, "");
            writeRaw<CommonModule_setLeftEdgeTouchEnabled.onNavigationEvent> writerawAccess100 = onNavigationEvent(context, function1).access100();
            Intrinsics.checkNotNullExpressionValue(writerawAccess100, "");
            return writerawAccess100;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullExpressionValue(onNavigationEvent(context, function1).access100(), "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
