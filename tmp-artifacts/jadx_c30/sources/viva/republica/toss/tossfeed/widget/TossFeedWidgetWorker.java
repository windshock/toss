package viva.republica.toss.tossfeed.widget;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.ConvertFloatArrayToByteArray;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TossFeedWidgetWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TossFeedWidgetWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(workerParameters, BuildConfig.FLAVOR);
    }

    public ListenableWorker.onExtraCallbackWithResult doWork() {
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TOSS_FEED_WIDGET", "doWork", (Map) null, (String) null, false, (String) null, 60, (Object) null);
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, BuildConfig.FLAVOR);
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(applicationContext);
        appWidgetManager.notifyAppWidgetViewDataChanged(appWidgetManager.getAppWidgetIds(new ComponentName(applicationContext, (Class<?>) TossFeedWidgetProvider.class)), R.id.list_view);
        ListenableWorker.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = ListenableWorker.onExtraCallbackWithResult.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(onextracallbackwithresultOnExtraCallback, BuildConfig.FLAVOR);
        return onextracallbackwithresultOnExtraCallback;
    }
}
