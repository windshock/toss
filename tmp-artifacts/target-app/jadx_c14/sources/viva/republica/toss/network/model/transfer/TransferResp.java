package viva.republica.toss.network.model.transfer;

import android.content.Context;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.ApiServerError;
import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.IconRoundCornerProgressBarSavedState;
import o.TombstoneProtosMemoryMappingBuilder;
import o.disableOldAndroidAttachmentMetricsWorkarounds;
import o.getMutilBackgroundDrawable;
import o.getNodesManager;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.TransferResp$;
import viva.republica.toss.network.model.transfer.TransferResp$Success$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferResp extends BaseApiResponse<Success> implements getNodesManager {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferResp$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerICustomTabsCallback = TransferResp.ICustomTabsCallback();
            int i4 = onExtraCallback + 91;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerICustomTabsCallback;
            }
            throw null;
        }
    })};

    public static /* synthetic */ KSerializer ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnMinimized = onMinimized();
        int i4 = IAuthTabCallback + 111;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnMinimized;
    }

    private static final /* synthetic */ KSerializer onMinimized() {
        int i = 2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getwrigglelayout, getwrigglelayout);
        int i2 = IAuthTabCallback + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return getmutilbackgrounddrawable;
    }

    @liq
    public static final class Success {
        public static final int $stable = 8;
        public static final Companion Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private String transferNo;

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Success() {
            String str = null;
            this(str, 1, (DefaultConstructorMarker) str);
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Success> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 107;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                TransferResp$Success$.serializer serializerVar = TransferResp$Success$.serializer.INSTANCE;
                if (i3 != 0) {
                    int i4 = 53 / 0;
                }
                return serializerVar;
            }
        }

        public /* synthetic */ Success(int i, String str, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.transferNo = "";
                int i2 = onNavigationEvent + 23;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            this.transferNo = str;
            int i3 = onExtraCallback + 111;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 24 / 0;
            }
        }

        public Success(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.transferNo = str;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallbackWithResult(Success success, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(success.transferNo, "")) {
                vylVar.onExtraCallback(serialDescriptor, 0, success.transferNo);
            }
            int i4 = onExtraCallback + 105;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Success(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallback;
                int i3 = i2 + 93;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 95;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 5 % 4;
                } else {
                    int i7 = 2 % 2;
                }
                str = "";
            }
            this(str);
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.transferNo;
            int i5 = i3 + 63;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    public TransferResp() {
    }

    public /* synthetic */ TransferResp(int i, String str, Success success, ApiServerError apiServerError, Map map, okycx okycxVar) {
        super(i, str, success, apiServerError, map, okycxVar);
    }

    public static final /* synthetic */ Lazy[] extraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 13;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 17;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(TransferResp transferResp, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        BaseApiResponse.onWarmupCompleted(transferResp, vylVar, serialDescriptor, TransferResp$Success$.serializer.INSTANCE);
        int i4 = onNavigationEvent + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
    }

    @Override // o.getNodesManager
    public /* bridge */ boolean IAuthTabCallback() {
        boolean zIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            zIAuthTabCallback = super.IAuthTabCallback();
            int i3 = 36 / 0;
        } else {
            zIAuthTabCallback = super.IAuthTabCallback();
        }
        int i4 = IAuthTabCallback + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    @Override // o.getNodesManager
    public /* bridge */ void onExtraCallback(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onExtraCallback(context);
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // o.getNodesManager
    public /* bridge */ boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = super.onExtraCallback();
        int i4 = IAuthTabCallback + 63;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    @Override // o.getNodesManager
    public /* bridge */ boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super.onWarmupCompleted();
            throw null;
        }
        boolean zOnWarmupCompleted = super.onWarmupCompleted();
        int i3 = IAuthTabCallback + 93;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return zOnWarmupCompleted;
        }
        throw null;
    }

    @Override // o.getNodesManager
    public /* bridge */ boolean readTypedObject() {
        boolean typedObject;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            typedObject = super.readTypedObject();
            int i3 = 43 / 0;
        } else {
            typedObject = super.readTypedObject();
        }
        int i4 = onNavigationEvent + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return typedObject;
    }

    @Override // o.getNodesManager
    public /* bridge */ boolean writeTypedObject() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zWriteTypedObject = super.writeTypedObject();
        int i4 = IAuthTabCallback + 25;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zWriteTypedObject;
    }

    public void getInterfaceDescriptor() {
        Object objOnNavigationEvent;
        int i = 2 % 2;
        if (IAuthTabCallbackDefault()) {
            int i2 = IAuthTabCallback + 33;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                objOnNavigationEvent = IconRoundCornerProgressBarSavedState.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -243760193, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 243760197, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback.onExtraCallback(), null, 1, null});
            } else {
                objOnNavigationEvent = IconRoundCornerProgressBarSavedState.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -243760193, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 243760197, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback.onExtraCallback(), null, 1, null});
            }
            int i3 = IAuthTabCallback + 59;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
        super.getInterfaceDescriptor();
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferResp> serializer() {
            TransferResp$.serializer serializerVar;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                serializerVar = TransferResp$.serializer.INSTANCE;
                int i3 = 42 / 0;
            } else {
                serializerVar = TransferResp$.serializer.INSTANCE;
            }
            int i4 = onExtraCallback + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        int i = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 94 / 0;
        }
    }
}
