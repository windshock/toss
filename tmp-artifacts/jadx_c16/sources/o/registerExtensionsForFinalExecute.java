package o;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.widget.ConsumptionRecommendationBannerLocal;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class registerExtensionsForFinalExecute extends onReceiveCdp<ConsumptionRecommendationBannerLocal> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final registerExtensionsForFinalExecute IAuthTabCallback;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static long onWarmupCompleted;

    static {
        onWarmupCompleted();
        IAuthTabCallback = new registerExtensionsForFinalExecute();
        int i = onNavigationEvent + 73;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private registerExtensionsForFinalExecute() throws Throwable {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConsumptionRecommendationBannerLocal.class);
        Pair[] pairArr = {getWrite.IAuthTabCallback("CONSUMPTION_AMOUNT_GRAPH", Reflection.getOrCreateKotlinClass(ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.class)), getWrite.IAuthTabCallback("MONTHLY_EXPENSE", Reflection.getOrCreateKotlinClass(ConsumptionRecommendationBannerLocal.MonthlyExpense.class)), getWrite.IAuthTabCallback("HORIZONTAL_BAR_GRAPH", Reflection.getOrCreateKotlinClass(ConsumptionRecommendationBannerLocal.HorizontalBarGraph.class)), getWrite.IAuthTabCallback("ICON", Reflection.getOrCreateKotlinClass(ConsumptionRecommendationBannerLocal.Icon.class)), getWrite.IAuthTabCallback("SMALL_CARD", Reflection.getOrCreateKotlinClass(ConsumptionRecommendationBannerLocal.SmallCard.class)), getWrite.IAuthTabCallback("BIG_CARD", Reflection.getOrCreateKotlinClass(ConsumptionRecommendationBannerLocal.BigCard.class)), getWrite.IAuthTabCallback("ARTICLE", Reflection.getOrCreateKotlinClass(ConsumptionRecommendationBannerLocal.Article.class))};
        Object[] objArr = new Object[1];
        a(new char[]{47224, 47116, 37198, 20772, 39365, 16560, 51537, 54242}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, objArr);
        super(orCreateKotlinClass, ((String) objArr[0]).intern(), access8100.onWarmupCompleted(pairArr), (String) null, 8, (DefaultConstructorMarker) null);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 61;
        while (true) {
            $10 = i3 % 128;
            int i4 = i3 % 2;
            if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
                return;
            }
            int i5 = $10 + 95;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 84, 21233 - TextUtils.indexOf("", "", 0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 19, Color.rgb(0, 0, 0) + 16786024, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    i3 = $11 + 33;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = -6019477989945871362L;
    }
}
