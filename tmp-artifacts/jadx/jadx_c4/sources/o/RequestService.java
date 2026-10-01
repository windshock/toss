package o;

import android.app.Activity;
import im.toss.core.tuba.Trigger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RequestService;
import o.SetDetectableSize;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RequestService extends getWriteEnabled {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int onExtraCallback = 0;
    private static int onTransact = 1;
    private final UtilsKtExternalSyntheticLambda9 IAuthTabCallback;
    private final boolean onNavigationEvent;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final String onWarmupCompleted = RequestService.class.getSimpleName();

    public static /* synthetic */ Unit onNavigationEvent(Trigger trigger, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(trigger, setDetectableSize);
        }
        onExtraCallback(trigger, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestService(@NotNull OkHttpNetworkFetcherExternalSyntheticLambda3 okHttpNetworkFetcherExternalSyntheticLambda3, @NotNull UtilsKtExternalSyntheticLambda9 utilsKtExternalSyntheticLambda9) {
        super(okHttpNetworkFetcherExternalSyntheticLambda3, "URL", 0L, 4, null);
        Intrinsics.checkNotNullParameter(okHttpNetworkFetcherExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(utilsKtExternalSyntheticLambda9, "");
        this.IAuthTabCallback = utilsKtExternalSyntheticLambda9;
    }

    private static final Unit onExtraCallback(Trigger trigger, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("trigger_id", trigger.onNavigationEvent());
        setDetectableSize.onExtraCallback("trigger_name", trigger.onWarmupCompleted());
        setDetectableSize.onExtraCallback("category", "tuba_trigger");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 61;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // o.getWriteEnabled
    public void onWarmupCompleted(@NotNull Activity activity, @NotNull final Trigger trigger, @NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(trigger, "");
            Intrinsics.checkNotNullParameter(str, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(trigger, "");
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = (String) access8100.onWarmupCompleted(trigger.asInterface(), "linkUri");
        if (str2 != null) {
            this.IAuthTabCallback.start(activity, str2);
            ConvertByteArrayToFloatArray.onExtraCallback(1222599L, true, str, null, new Function1() { // from class: im.toss.components.tuba.trigger.internal.UrlTriggerExecutor$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i3 = 2 % 2;
                    int i4 = onWarmupCompleted + 81;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    Unit unitOnNavigationEvent = RequestService.onNavigationEvent(trigger, (SetDetectableSize) obj2);
                    int i6 = onExtraCallbackWithResult + 47;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    return unitOnNavigationEvent;
                }
            }, 8, null);
            int i3 = onExtraCallback + 91;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
        }
        if (this.onNavigationEvent) {
            trigger.onNavigationEvent();
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    static {
        int i = IAuthTabCallbackStub + 47;
        asBinder = i % 128;
        if (i % 2 != 0) {
            int i2 = 57 / 0;
        }
    }
}
