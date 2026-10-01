package o;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface setUsed {
    List<ComponentName> onWarmupCompleted(@NotNull Context context);

    default List<ComponentName> onExtraCallback(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        ActivityInfo[] activityInfoArr = (Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(33410L)) : packageManager.getPackageInfo(packageName, 33410)).receivers;
        if (activityInfoArr == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (ActivityInfo receiverInfo : activityInfoArr) {
            if (receiverInfo.metaData == null) {
                ComponentName componentName = new ComponentName(receiverInfo.packageName, receiverInfo.name);
                receiverInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getReceiverInfo(componentName, PackageManager.ComponentInfoFlags.of(33408L)) : packageManager.getReceiverInfo(componentName, 640);
            }
            Bundle bundle = receiverInfo.metaData;
            if (bundle != null && bundle.containsKey("android.appwidget.provider")) {
                arrayList.add(new ComponentName(receiverInfo.packageName, receiverInfo.name));
            }
        }
        return arrayList;
    }

    default void IAuthTabCallback(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull ComponentName componentName, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appWidgetManager, "");
        Intrinsics.checkNotNullParameter(componentName, "");
        PackageManager packageManager = context.getPackageManager();
        int i2 = z ? 1 : 2;
        Intrinsics.checkNotNull(packageManager);
        if (onExtraCallback(packageManager, componentName, z)) {
            return;
        }
        if (!z) {
            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
            Intrinsics.checkNotNullExpressionValue(appWidgetIds, "");
            if (appWidgetIds.length != 0) {
                return;
            }
        }
        packageManager.setComponentEnabledSetting(componentName, i2, 1);
    }

    private default boolean onExtraCallback(PackageManager packageManager, ComponentName componentName, boolean z) {
        int i = 2 % 2;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        return componentEnabledSetting != 1 ? componentEnabledSetting == 2 && !z : z;
    }
}
