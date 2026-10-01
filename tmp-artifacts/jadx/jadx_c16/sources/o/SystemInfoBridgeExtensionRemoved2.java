package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.features.benefit.dto.CardsV2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SystemInfoBridgeExtensionRemoved2 extends ExoPlayerImplExternalSyntheticLambda3<ShakeMonitorBridgeExtension, SensorBridgeExtension3, IAuthTabCallback> {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int asBinder = 1;
    private static int getInterfaceDescriptor = 1;
    private static int onTransact;
    private final Function2<ShakeMonitorBridgeExtension, CardsV2.PointBackInfo.BankCardCashBackBanner, Unit> IAuthTabCallback;
    private final Function2<ShakeMonitorBridgeExtension$onExtraCallback, CardsV2.PointBackInfo.ChanceExhaustedSheet, Unit> IAuthTabCallbackDefault;
    private final boolean IAuthTabCallbackStub;
    private final setTaggedAddrCtrl<Float, Float, Integer, String, Unit> asInterface;
    private final Function1<ShakeMonitorBridgeExtension$onExtraCallback, Boolean> onExtraCallback;
    private final Function2<Context, stopDeviceShakeListener, Unit> onExtraCallbackWithResult;
    private final Function1<String, Unit> onWarmupCompleted;
    public static final onExtraCallback Companion = new onExtraCallback((DefaultConstructorMarker) null);
    public static final int onNavigationEvent = 8;

    static {
        int i = onTransact + 89;
        asBinder = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SystemInfoBridgeExtensionRemoved2(@NotNull Function1<? super ShakeMonitorBridgeExtension$onExtraCallback, Boolean> function1, @NotNull Function2<? super ShakeMonitorBridgeExtension$onExtraCallback, ? super CardsV2.PointBackInfo.ChanceExhaustedSheet, Unit> function2, @NotNull Function2<? super ShakeMonitorBridgeExtension, ? super CardsV2.PointBackInfo.BankCardCashBackBanner, Unit> function22, @NotNull setTaggedAddrCtrl<? super Float, ? super Float, ? super Integer, ? super String, Unit> settaggedaddrctrl, @NotNull Function2<? super Context, ? super stopDeviceShakeListener, Unit> function23, @NotNull Function1<? super String, Unit> function12, boolean z) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        Intrinsics.checkNotNullParameter(settaggedaddrctrl, "");
        Intrinsics.checkNotNullParameter(function23, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.onExtraCallback = function1;
        this.IAuthTabCallbackDefault = function2;
        this.IAuthTabCallback = function22;
        this.asInterface = settaggedaddrctrl;
        this.onExtraCallbackWithResult = function23;
        this.onWarmupCompleted = function12;
        this.IAuthTabCallbackStub = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SystemInfoBridgeExtensionRemoved2(Function1 function1, Function2 function2, Function2 function22, setTaggedAddrCtrl settaggedaddrctrl, Function2 function23, Function1 function12, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z2;
        if ((i & 64) != 0) {
            int i2 = getInterfaceDescriptor + 37;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 3;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        this(function1, function2, function22, settaggedaddrctrl, function23, function12, z2);
    }

    public /* synthetic */ void onExtraCallbackWithResult(Object obj, RecyclerView.ViewHolder viewHolder, List list) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        ShakeMonitorBridgeExtension shakeMonitorBridgeExtension = (ShakeMonitorBridgeExtension) obj;
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) viewHolder;
        if (i2 % 2 == 0) {
            onNavigationEvent(shakeMonitorBridgeExtension, iAuthTabCallback, (List<Object>) list);
        } else {
            onNavigationEvent(shakeMonitorBridgeExtension, iAuthTabCallback, (List<Object>) list);
            throw null;
        }
    }

    public /* synthetic */ boolean onExtraCallbackWithResult(Object obj, List list, int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 89;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnNavigationEvent = onNavigationEvent((SensorBridgeExtension3) obj, (List<SensorBridgeExtension3>) list, i);
        int i5 = IAuthTabCallbackStubProxy + 77;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return zOnNavigationEvent;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* synthetic */ RecyclerView.ViewHolder onWarmupCompleted(ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 121;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback IAuthTabCallback = IAuthTabCallback(viewGroup);
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 75;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return IAuthTabCallback;
    }

    protected boolean onNavigationEvent(@NotNull SensorBridgeExtension3 sensorBridgeExtension3, @NotNull List<SensorBridgeExtension3> list, int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 49;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sensorBridgeExtension3, "");
            Intrinsics.checkNotNullParameter(list, "");
            return sensorBridgeExtension3 instanceof ShakeMonitorBridgeExtension;
        }
        Intrinsics.checkNotNullParameter(sensorBridgeExtension3, "");
        Intrinsics.checkNotNullParameter(list, "");
        boolean z = sensorBridgeExtension3 instanceof ShakeMonitorBridgeExtension;
        throw null;
    }

    protected IAuthTabCallback IAuthTabCallback(@NotNull ViewGroup viewGroup) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        openSystemSetting opensystemsettingOnWarmupCompleted = openSystemSetting.onWarmupCompleted(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(opensystemsettingOnWarmupCompleted, "");
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(opensystemsettingOnWarmupCompleted, this.onExtraCallback, this.IAuthTabCallbackDefault, this.IAuthTabCallback, this.asInterface, this.onExtraCallbackWithResult, this.onWarmupCompleted, this.IAuthTabCallbackStub);
        int i2 = IAuthTabCallbackStubProxy + 9;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return iAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void onNavigationEvent(@NotNull ShakeMonitorBridgeExtension shakeMonitorBridgeExtension, @NotNull IAuthTabCallback iAuthTabCallback, @NotNull List<Object> list) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(shakeMonitorBridgeExtension, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (!(!list.contains("PAYLOAD_POINT_BACK_LOADING_UPDATE")) && !list.contains("PAYLOAD_POINT_BACK_DATA_UPDATE")) {
            iAuthTabCallback.onExtraCallback(shakeMonitorBridgeExtension.IAuthTabCallbackStub(), shakeMonitorBridgeExtension.IAuthTabCallback());
            return;
        }
        iAuthTabCallback.onWarmupCompleted(shakeMonitorBridgeExtension);
        int i4 = IAuthTabCallbackStubProxy + 69;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }
}
