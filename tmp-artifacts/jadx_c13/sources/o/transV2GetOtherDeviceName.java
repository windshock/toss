package o;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.transV2GetOtherDeviceName;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class transV2GetOtherDeviceName {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private boolean IAuthTabCallback;
    private onNavigationEvent onExtraCallbackWithResult;
    private transV2GetOtherOS onNavigationEvent;
    private boolean onWarmupCompleted;
    private final Object asBinder = new Object();
    private final access6900<transV2GenerateCertNum> onTransact = new access6900<>();
    private final Set<transV2GetOtherOS> onExtraCallback = new LinkedHashSet();

    public final void onExtraCallback(@NotNull transV2GetOtherOS transv2getotheros) {
        Intrinsics.checkNotNullParameter(transv2getotheros, "");
        synchronized (this.asBinder) {
            this.onExtraCallback.add(transv2getotheros);
        }
    }

    public final void onNavigationEvent(@NotNull transV2GetOtherOS transv2getotheros) {
        Intrinsics.checkNotNullParameter(transv2getotheros, "");
        synchronized (this.asBinder) {
            if (!this.onExtraCallback.contains(transv2getotheros)) {
                throw new IllegalStateException("Runtime must be attached before starting event delivery");
            }
            transV2GetOtherOS transv2getotheros2 = this.onNavigationEvent;
            if (transv2getotheros2 == null || transv2getotheros2 == transv2getotheros) {
                if (this.onWarmupCompleted) {
                    this.onWarmupCompleted = false;
                    Integer.valueOf(this.onTransact.size());
                }
                this.onNavigationEvent = transv2getotheros;
                boolean zOnNavigationEvent = onNavigationEvent();
                if (zOnNavigationEvent) {
                    onExtraCallbackWithResult();
                }
            }
        }
    }

    public final void onExtraCallback(@NotNull transV2GenerateCertNum transv2generatecertnum) {
        Intrinsics.checkNotNullParameter(transv2generatecertnum, "");
        synchronized (this.asBinder) {
            if (this.onTransact.size() >= 64) {
                transv2generatecertnum.getClass().getSimpleName();
                Integer.valueOf(this.onTransact.size());
                return;
            }
            this.onTransact.addLast(transv2generatecertnum);
            if (this.onNavigationEvent == null) {
                return;
            }
            if (onNavigationEvent()) {
                onExtraCallbackWithResult();
            }
        }
    }

    public final void IAuthTabCallback(@NotNull transV2GetOtherOS transv2getotheros) {
        Intrinsics.checkNotNullParameter(transv2getotheros, "");
        synchronized (this.asBinder) {
            this.onExtraCallback.remove(transv2getotheros);
            if (this.onNavigationEvent == transv2getotheros) {
                this.onNavigationEvent = null;
                this.onWarmupCompleted = true;
            }
            onNavigationEvent onnavigationevent = this.onExtraCallbackWithResult;
            if (onnavigationevent != null && onnavigationevent.onExtraCallback() == transv2getotheros && !onnavigationevent.onNavigationEvent()) {
                this.onExtraCallbackWithResult = null;
                this.IAuthTabCallback = false;
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private final boolean onNavigationEvent() {
        if (this.IAuthTabCallback || this.onTransact.isEmpty()) {
            return false;
        }
        this.IAuthTabCallback = true;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008f, code lost:
    
        r6.IAuthTabCallback = false;
        r6.onExtraCallbackWithResult = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0094, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult() {
        while (true) {
            synchronized (this.asBinder) {
                transV2GetOtherOS transv2getotheros = this.onNavigationEvent;
                boolean z = false;
                if (transv2getotheros == null || this.onTransact.isEmpty()) {
                    break;
                }
                final onNavigationEvent onnavigationevent = new onNavigationEvent(transv2getotheros, this.onTransact.onNavigationEvent());
                this.onExtraCallbackWithResult = onnavigationevent;
                try {
                    boolean zEmit = onnavigationevent.onExtraCallback().emit(onnavigationevent.onWarmupCompleted(), new Function0() { // from class: run.granite.microfrontend.GraniteMicroFrontendRuntimeEventRouter$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return transV2GetOtherDeviceName.onWarmupCompleted(this.f$0, onnavigationevent);
                        }
                    });
                    synchronized (this.asBinder) {
                        onnavigationevent.onExtraCallbackWithResult(false);
                        if (!zEmit) {
                            this.onExtraCallbackWithResult = null;
                            this.IAuthTabCallback = false;
                            transV2GetOtherOS transv2getotheros2 = this.onNavigationEvent;
                            if (transv2getotheros2 == null || transv2getotheros2 == onnavigationevent.onExtraCallback() || !onNavigationEvent()) {
                                break;
                            }
                        } else if (!onnavigationevent.IAuthTabCallback()) {
                            return;
                        } else {
                            this.onExtraCallbackWithResult = null;
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th) {
                    synchronized (this.asBinder) {
                        onnavigationevent.onExtraCallbackWithResult(false);
                        this.onExtraCallbackWithResult = null;
                        this.IAuthTabCallback = false;
                        transV2GetOtherOS transv2getotheros3 = this.onNavigationEvent;
                        if (transv2getotheros3 != null && transv2getotheros3 != onnavigationevent.onExtraCallback()) {
                            if (onNavigationEvent()) {
                                z = true;
                            }
                        }
                        if (z) {
                            try {
                                onExtraCallbackWithResult();
                            } catch (Throwable th2) {
                                setExecute.onNavigationEvent(th, th2);
                            }
                        }
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(transV2GetOtherDeviceName transv2getotherdevicename, onNavigationEvent onnavigationevent) {
        transv2getotherdevicename.onExtraCallback(onnavigationevent);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(onNavigationEvent onnavigationevent) {
        boolean z;
        synchronized (this.asBinder) {
            if (onnavigationevent.IAuthTabCallback()) {
                return;
            }
            onnavigationevent.IAuthTabCallback(true);
            if (this.onTransact.IAuthTabCallback() == onnavigationevent.onWarmupCompleted()) {
                this.onTransact.removeFirst();
            }
            if (onnavigationevent.onNavigationEvent()) {
                return;
            }
            this.onExtraCallbackWithResult = null;
            this.IAuthTabCallback = false;
            if (this.onNavigationEvent != null) {
                z = onNavigationEvent();
            }
            if (z) {
                onExtraCallbackWithResult();
            }
        }
    }

    public static final class onNavigationEvent {
        private final transV2GetOtherOS onExtraCallback;
        private boolean onExtraCallbackWithResult;
        private boolean onNavigationEvent;
        private final transV2GenerateCertNum onWarmupCompleted;

        public onNavigationEvent(@NotNull transV2GetOtherOS transv2getotheros, @NotNull transV2GenerateCertNum transv2generatecertnum) {
            Intrinsics.checkNotNullParameter(transv2getotheros, "");
            Intrinsics.checkNotNullParameter(transv2generatecertnum, "");
            this.onExtraCallback = transv2getotheros;
            this.onWarmupCompleted = transv2generatecertnum;
            this.onExtraCallbackWithResult = true;
        }

        public final transV2GetOtherOS onExtraCallback() {
            return this.onExtraCallback;
        }

        public final transV2GenerateCertNum onWarmupCompleted() {
            return this.onWarmupCompleted;
        }

        public final void onExtraCallbackWithResult(boolean z) {
            this.onExtraCallbackWithResult = z;
        }

        public final boolean onNavigationEvent() {
            return this.onExtraCallbackWithResult;
        }

        public final void IAuthTabCallback(boolean z) {
            this.onNavigationEvent = z;
        }

        public final boolean IAuthTabCallback() {
            return this.onNavigationEvent;
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}
