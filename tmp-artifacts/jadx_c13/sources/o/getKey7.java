package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getKey7 {
    default void onExtraCallback(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    default void onExtraCallbackWithResult(int i, @NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    default void onExtraCallbackWithResult(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    void onExtraCallbackWithResult(@NotNull String str, @NotNull View view, @NotNull ImageView.ScaleType scaleType);

    void onNavigationEvent(@NotNull View view);

    default View IAuthTabCallback(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ImageView imageView = new ImageView(context);
        imageView.setBackgroundColor(-3355444);
        return imageView;
    }

    default void IAuthTabCallback(@NotNull String str, @Nullable View view, @NotNull ImageView.ScaleType scaleType, @Nullable Map<String, String> map, @NotNull utilBinToHexString utilbintohexstring, @NotNull transGetSignCert transgetsigncert, @Nullable String str2, @Nullable Function2<? super Long, ? super Long, Unit> function2, @Nullable setTaggedAddrCtrl<? super Bitmap, ? super Exception, ? super Integer, ? super Integer, Unit> settaggedaddrctrl) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(scaleType, "");
        Intrinsics.checkNotNullParameter(utilbintohexstring, "");
        Intrinsics.checkNotNullParameter(transgetsigncert, "");
        if (view != null) {
            onExtraCallbackWithResult(str, view, scaleType);
        }
        if (settaggedaddrctrl != null) {
            settaggedaddrctrl.invoke(null, null, 0, 0);
        }
    }

    default void onExtraCallback(@NotNull String str, @Nullable Void r2, @NotNull String str2, @Nullable Map<String, String> map, @NotNull utilBinToHexString utilbintohexstring, @NotNull transGetSignCert transgetsigncert, @Nullable Function2<? super Long, ? super Long, Unit> function2, @Nullable setTaggedAddrCtrl<? super Boolean, ? super Integer, ? super Integer, ? super String, Unit> settaggedaddrctrl) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(utilbintohexstring, "");
        Intrinsics.checkNotNullParameter(transgetsigncert, "");
        if (settaggedaddrctrl != null) {
            settaggedaddrctrl.invoke(Boolean.FALSE, 0, 0, "Provider does not support preloading");
        }
    }
}
