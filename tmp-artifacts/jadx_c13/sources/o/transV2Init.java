package o;

import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.transV2GenerateCertNum;
import org.jetbrains.annotations.NotNull;
import run.granite.microfrontend.GraniteMicroFrontendRuntimeModule;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class transV2Init {
    private static final transV2SendReceiverInfo IAuthTabCallback;
    public static final transV2Init onNavigationEvent = new transV2Init();
    private static final transV2GetOtherDeviceName onWarmupCompleted;

    private transV2Init() {
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<transV2GenerateCertNum, Unit> {
        onExtraCallbackWithResult(Object obj) {
            super(1, obj, transV2GetOtherDeviceName.class, "emit", "emit(Lrun/granite/microfrontend/GraniteMicroFrontendEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(transV2GenerateCertNum transv2generatecertnum) {
            onWarmupCompleted(transv2generatecertnum);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(transV2GenerateCertNum transv2generatecertnum) {
            Intrinsics.checkNotNullParameter(transv2generatecertnum, "");
            ((transV2GetOtherDeviceName) this.receiver).onExtraCallback(transv2generatecertnum);
        }
    }

    static {
        transV2GetOtherDeviceName transv2getotherdevicename = new transV2GetOtherDeviceName();
        onWarmupCompleted = transv2getotherdevicename;
        IAuthTabCallback = new transV2SendReceiverInfo(new onExtraCallbackWithResult(transv2getotherdevicename));
    }

    @JvmStatic
    public static final transV2ImportCert IAuthTabCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return IAuthTabCallback.onNavigationEvent(str);
    }

    public final /* synthetic */ void onExtraCallback(transV2GenerateCertNum transv2generatecertnum) {
        Intrinsics.checkNotNullParameter(transv2generatecertnum, "");
        onWarmupCompleted.onExtraCallback(transv2generatecertnum);
    }

    @JvmStatic
    public static final void onNavigationEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        onNavigationEvent.onExtraCallback(new transV2GenerateCertNum.onWarmupCompleted(str));
    }

    public final /* synthetic */ void onWarmupCompleted(GraniteMicroFrontendRuntimeModule graniteMicroFrontendRuntimeModule) {
        Intrinsics.checkNotNullParameter(graniteMicroFrontendRuntimeModule, "");
        onWarmupCompleted.onExtraCallback(graniteMicroFrontendRuntimeModule);
    }

    public final /* synthetic */ void IAuthTabCallback(GraniteMicroFrontendRuntimeModule graniteMicroFrontendRuntimeModule) {
        Intrinsics.checkNotNullParameter(graniteMicroFrontendRuntimeModule, "");
        onWarmupCompleted.onNavigationEvent(graniteMicroFrontendRuntimeModule);
    }

    public final /* synthetic */ void onExtraCallback(GraniteMicroFrontendRuntimeModule graniteMicroFrontendRuntimeModule) {
        Intrinsics.checkNotNullParameter(graniteMicroFrontendRuntimeModule, "");
        onWarmupCompleted.IAuthTabCallback(graniteMicroFrontendRuntimeModule);
    }
}
