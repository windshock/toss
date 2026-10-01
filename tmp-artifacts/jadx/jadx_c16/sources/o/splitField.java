package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.features.benefit.dto.Cards;
import im.toss.features.benefit.ui.KoreaBenefitTabViewModel;
import im.toss.features.benefit.ui.viewHolder.BenefitMissionSectionItemDelegate$;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.RotationVectorAbility1;
import o.SystemInfoBridgeExtensionRemoved;
import o.cacheResult;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class splitField extends ExoPlayerImplExternalSyntheticLambda3<RotationVectorAbility, SensorBridgeExtension3, onWarmupCompleted> {
    public static final onExtraCallback Companion = new onExtraCallback((DefaultConstructorMarker) null);
    public static final int IAuthTabCallback = 8;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 1;
    private static int access100;
    private final Function2<Context, SensorBridgeExtension4, Unit> IAuthTabCallbackDefault;
    private final Function1<SensorServiceManager, Unit> IAuthTabCallbackStub;
    private final Function2<Context, stopDeviceShakeListener, Unit> asBinder;
    private final Function2<RotationVectorAbility1.onExtraCallback, String, Unit> asInterface;
    private final isCacheAvailable onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final Function0<Integer> onNavigationEvent;
    private final Function1<SensorServiceManager, Unit> onTransact;
    private final boolean onWarmupCompleted;

    static {
        int i = IAuthTabCallbackStubProxy + 109;
        access000 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ int IAuthTabCallback(KoreaBenefitTabViewModel koreaBenefitTabViewModel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 39;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = onWarmupCompleted(koreaBenefitTabViewModel);
        int i4 = IAuthTabCallback_Parcel + 61;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return iOnWarmupCompleted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public splitField(@NotNull Function0<Integer> function0, @NotNull Function2<? super RotationVectorAbility1.onExtraCallback, ? super String, Unit> function2, @NotNull Function1<? super SensorServiceManager, Unit> function1, @NotNull Function1<? super SensorServiceManager, Unit> function12, @NotNull Function2<? super Context, ? super SensorBridgeExtension4, Unit> function22, @NotNull Function2<? super Context, ? super stopDeviceShakeListener, Unit> function23, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function22, "");
        Intrinsics.checkNotNullParameter(function23, "");
        this.onNavigationEvent = function0;
        this.asInterface = function2;
        this.IAuthTabCallbackStub = function1;
        this.onTransact = function12;
        this.IAuthTabCallbackDefault = function22;
        this.asBinder = function23;
        this.onExtraCallbackWithResult = z;
        this.onWarmupCompleted = z2;
        this.onExtraCallback = new isCacheAvailable(function0, new onNavigationEvent(this), new IAuthTabCallback(this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ splitField(Function0 function0, Function2 function2, Function1 function1, Function1 function12, Function2 function22, Function2 function23, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3;
        boolean z4;
        if ((i & 64) != 0) {
            int i2 = IAuthTabCallback_Parcel + 63;
            access100 = i2 % 128;
            int i3 = 2 % 2;
            z3 = i2 % 2 != 0;
        } else {
            z3 = z;
        }
        if ((i & 128) != 0) {
            int i4 = access100 + 89;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            z4 = true;
        } else {
            z4 = z2;
        }
        this(function0, function2, function1, function12, function22, function23, z3, z4);
    }

    public static final /* synthetic */ void onNavigationEvent(splitField splitfield, RotationVectorAbility1.onExtraCallback onextracallback, Cards.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        splitfield.onWarmupCompleted(onextracallback, onnavigationevent);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 83;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* synthetic */ void onExtraCallbackWithResult(Object obj, RecyclerView.ViewHolder viewHolder, List list) {
        int i = 2 % 2;
        int i2 = access100 + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((RotationVectorAbility) obj, (onWarmupCompleted) viewHolder, list);
        int i4 = IAuthTabCallback_Parcel + 19;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
    }

    public /* bridge */ /* synthetic */ boolean onExtraCallbackWithResult(Object obj, List list, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 39;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult((SensorBridgeExtension3) obj, (List<SensorBridgeExtension3>) list, i);
        int i5 = access100 + 53;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }

    public /* synthetic */ RecyclerView.ViewHolder onWarmupCompleted(ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = access100 + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(viewGroup);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onWarmupCompleted onwarmupcompletedOnExtraCallback = onExtraCallback(viewGroup);
        int i3 = access100 + 37;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return onwarmupcompletedOnExtraCallback;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public splitField(@NotNull KoreaBenefitTabViewModel koreaBenefitTabViewModel, @NotNull Function2<? super RotationVectorAbility1.onExtraCallback, ? super String, Unit> function2, @NotNull Function1<? super SensorServiceManager, Unit> function1, @NotNull Function1<? super SensorServiceManager, Unit> function12, @NotNull Function2<? super Context, ? super SensorBridgeExtension4, Unit> function22, @NotNull Function2<? super Context, ? super stopDeviceShakeListener, Unit> function23) {
        this(new BenefitMissionSectionItemDelegate$.ExternalSyntheticLambda0(koreaBenefitTabViewModel), function2, function1, function12, function22, function23, false, false, 192, null);
        Intrinsics.checkNotNullParameter(koreaBenefitTabViewModel, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function22, "");
        Intrinsics.checkNotNullParameter(function23, "");
    }

    private static final int onWarmupCompleted(KoreaBenefitTabViewModel koreaBenefitTabViewModel) {
        int i = 2 % 2;
        int i2 = access100 + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = ((WebSocketResultEnum) koreaBenefitTabViewModel.ICustomTabsCallback().IAuthTabCallback()).IAuthTabCallback();
        int i4 = IAuthTabCallback_Parcel + 79;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return iIAuthTabCallback;
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function2<RotationVectorAbility1.onExtraCallback, Cards.onNavigationEvent, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        onNavigationEvent(Object obj) {
            super(2, obj, splitField.class, "onMissionCardItemClicked", "onMissionCardItemClicked(Lim/toss/features/benefit/ui/data/CardItem$MissionCardItem;Lim/toss/features/benefit/dto/Cards$CardStatus;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((RotationVectorAbility1.onExtraCallback) obj, (Cards.onNavigationEvent) obj2);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 57;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallback(RotationVectorAbility1.onExtraCallback onextracallback, Cards.onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onextracallback, "");
            splitField.onNavigationEvent((splitField) ((CallableReference) this).receiver, onextracallback, onnavigationevent);
            int i4 = IAuthTabCallback + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function2<RotationVectorAbility1.onExtraCallback, Cards.onNavigationEvent, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        IAuthTabCallback(Object obj) {
            super(2, obj, splitField.class, "onMissionCardItemClicked", "onMissionCardItemClicked(Lim/toss/features/benefit/ui/data/CardItem$MissionCardItem;Lim/toss/features/benefit/dto/Cards$CardStatus;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onNavigationEvent = i2 % 128;
            RotationVectorAbility1.onExtraCallback onextracallback = (RotationVectorAbility1.onExtraCallback) obj;
            Cards.onNavigationEvent onnavigationevent = (Cards.onNavigationEvent) obj2;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(onextracallback, onnavigationevent);
                Unit unit = Unit.INSTANCE;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            onExtraCallbackWithResult(onextracallback, onnavigationevent);
            Unit unit2 = Unit.INSTANCE;
            int i3 = IAuthTabCallback + 27;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return unit2;
        }

        public final void onExtraCallbackWithResult(RotationVectorAbility1.onExtraCallback onextracallback, Cards.onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onextracallback, "");
            splitField.onNavigationEvent((splitField) ((CallableReference) this).receiver, onextracallback, onnavigationevent);
            int i4 = onNavigationEvent + 63;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void onWarmupCompleted(RotationVectorAbility1.onExtraCallback onextracallback, Cards.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        Function2<RotationVectorAbility1.onExtraCallback, String, Unit> function2 = this.asInterface;
        String strName = null;
        if (onnavigationevent != null) {
            int i2 = access100 + 3;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                onnavigationevent.name();
                throw null;
            }
            strName = onnavigationevent.name();
        } else {
            int i3 = access100 + 101;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        }
        function2.invoke(onextracallback, strName);
    }

    protected boolean onExtraCallbackWithResult(@NotNull SensorBridgeExtension3 sensorBridgeExtension3, @NotNull List<SensorBridgeExtension3> list, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 53;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(sensorBridgeExtension3, "");
        Intrinsics.checkNotNullParameter(list, "");
        boolean z = sensorBridgeExtension3 instanceof RotationVectorAbility;
        int i5 = access100 + 73;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected onWarmupCompleted onExtraCallback(@NotNull ViewGroup viewGroup) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        AddPhoneContactBridgeExtension2 addPhoneContactBridgeExtension2IAuthTabCallback = AddPhoneContactBridgeExtension2.IAuthTabCallback(layoutInflaterFrom, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(addPhoneContactBridgeExtension2IAuthTabCallback, "");
        DefaultSystemNavigator defaultSystemNavigatorOnWarmupCompleted = DefaultSystemNavigator.onWarmupCompleted(layoutInflaterFrom, addPhoneContactBridgeExtension2IAuthTabCallback.onExtraCallbackWithResult, true);
        Intrinsics.checkNotNullExpressionValue(defaultSystemNavigatorOnWarmupCompleted, "");
        onItemClick onitemclickOnWarmupCompleted = onItemClick.onWarmupCompleted(layoutInflaterFrom, addPhoneContactBridgeExtension2IAuthTabCallback.onWarmupCompleted, true);
        Intrinsics.checkNotNullExpressionValue(onitemclickOnWarmupCompleted, "");
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(addPhoneContactBridgeExtension2IAuthTabCallback, new cacheResult.onExtraCallbackWithResult(defaultSystemNavigatorOnWarmupCompleted), onitemclickOnWarmupCompleted, new SystemInfoBridgeExtensionRemoved.onNavigationEvent(onitemclickOnWarmupCompleted), this.onExtraCallback, this.onExtraCallbackWithResult, this.onWarmupCompleted);
        int i2 = IAuthTabCallback_Parcel + 79;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 43 / 0;
        }
        return onwarmupcompleted;
    }

    protected void onExtraCallback(@NotNull RotationVectorAbility rotationVectorAbility, @NotNull onWarmupCompleted onwarmupcompleted, @NotNull List<Object> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rotationVectorAbility, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.contains("PAYLOAD_TIMER_UPDATE")) {
            int i2 = IAuthTabCallback_Parcel + 105;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            onwarmupcompleted.onNavigationEvent(rotationVectorAbility);
            return;
        }
        onwarmupcompleted.IAuthTabCallback(rotationVectorAbility, this.IAuthTabCallbackStub, this.onTransact, this.IAuthTabCallbackDefault, this.asBinder);
        int i4 = IAuthTabCallback_Parcel + 45;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }
}
