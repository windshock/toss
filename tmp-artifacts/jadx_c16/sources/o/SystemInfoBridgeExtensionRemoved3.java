package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.compound.listfooter.TdsListFooterV1View;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SystemInfoBridgeExtensionRemoved3 extends ExoPlayerImplExternalSyntheticLambda3<ShakeMonitorBridgeExtension1, SensorBridgeExtension3, onWarmupCompleted> {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final boolean onExtraCallback;
    private final Function1<String, Unit> onExtraCallbackWithResult;

    /* JADX WARN: Multi-variable type inference failed */
    public SystemInfoBridgeExtensionRemoved3(boolean z, @NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onExtraCallback = z;
        this.onExtraCallbackWithResult = function1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SystemInfoBridgeExtensionRemoved3(boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 97;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 115;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            z = false;
        }
        this(z, function1);
    }

    public /* synthetic */ void onExtraCallbackWithResult(Object obj, RecyclerView.ViewHolder viewHolder, List list) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((ShakeMonitorBridgeExtension1) obj, (onWarmupCompleted) viewHolder, list);
        int i4 = onNavigationEvent + 81;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* synthetic */ boolean onExtraCallbackWithResult(Object obj, List list, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 51;
        onNavigationEvent = i3 % 128;
        SensorBridgeExtension3 sensorBridgeExtension3 = (SensorBridgeExtension3) obj;
        if (i3 % 2 == 0) {
            return IAuthTabCallback(sensorBridgeExtension3, list, i);
        }
        IAuthTabCallback(sensorBridgeExtension3, list, i);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* synthetic */ RecyclerView.ViewHolder onWarmupCompleted(ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted onwarmupcompletedOnExtraCallback = onExtraCallback(viewGroup);
        int i4 = onWarmupCompleted + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedOnExtraCallback;
    }

    protected boolean IAuthTabCallback(@NotNull SensorBridgeExtension3 sensorBridgeExtension3, @NotNull List<SensorBridgeExtension3> list, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(sensorBridgeExtension3, "");
        Intrinsics.checkNotNullParameter(list, "");
        boolean z = sensorBridgeExtension3 instanceof ShakeMonitorBridgeExtension1;
        int i5 = onWarmupCompleted + 15;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    protected onWarmupCompleted onExtraCallback(@NotNull ViewGroup viewGroup) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNull(context);
        View tdsListFooterV1View = new TdsListFooterV1View(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsListFooterV1View.setTopBorder(true);
        int iIAuthTabCallback = varyMatches.IAuthTabCallback(10, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setPadding(iIAuthTabCallback, 0, iIAuthTabCallback, 0);
        TdsRoundLayout tdsRoundLayout = new TdsRoundLayout(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsRoundLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        tdsRoundLayout.setPadding(tdsRoundLayout.getPaddingLeft(), varyMatches.IAuthTabCallback(8, context), tdsRoundLayout.getPaddingRight(), tdsRoundLayout.getPaddingBottom());
        tdsRoundLayout.setBottomRadius(varyMatches.IAuthTabCallback(20, context));
        Context context2 = tdsRoundLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Resources resources = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsRoundLayout.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new IAuthTabCallback(configuration)).onWarmupCompleted());
        tdsRoundLayout.addView(tdsListFooterV1View, new ViewGroup.LayoutParams(-1, -2));
        frameLayout.addView(tdsRoundLayout);
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(frameLayout, tdsListFooterV1View, this.onExtraCallbackWithResult, this.onExtraCallback);
        int i2 = onWarmupCompleted + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 50 / 0;
        }
        return onwarmupcompleted;
    }

    protected void onExtraCallback(@NotNull ShakeMonitorBridgeExtension1 shakeMonitorBridgeExtension1, @NotNull onWarmupCompleted onwarmupcompleted, @NotNull List<Object> list) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(shakeMonitorBridgeExtension1, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(list, "");
        onwarmupcompleted.onExtraCallbackWithResult(shakeMonitorBridgeExtension1);
        int i4 = onNavigationEvent + 73;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 99 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }
}
