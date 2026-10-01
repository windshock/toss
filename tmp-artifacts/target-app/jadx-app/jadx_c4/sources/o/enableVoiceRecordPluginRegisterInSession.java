package o;

import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableVoiceRecordPluginRegisterInSession {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final enableLitePreloadOpt onWarmupCompleted;

    static final class onNavigationEvent extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            enableVoiceRecordPluginRegisterInSession enablevoicerecordpluginregisterinsession = enableVoiceRecordPluginRegisterInSession.this;
            if (i3 == 0) {
                enablevoicerecordpluginregisterinsession.onExtraCallback(this);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnExtraCallback = enablevoicerecordpluginregisterinsession.onExtraCallback(this);
            int i4 = IAuthTabCallback + 21;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    @Inject
    public enableVoiceRecordPluginRegisterInSession(@NotNull enableLitePreloadOpt enablelitepreloadopt) {
        Intrinsics.checkNotNullParameter(enablelitepreloadopt, "");
        this.onWarmupCompleted = enablelitepreloadopt;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(@NotNull access13800<? super Boolean> access13800Var) {
        onNavigationEvent onnavigationevent;
        Object objOnWarmupCompleted;
        int i = 2 % 2;
        boolean z = true;
        if (!(access13800Var instanceof onNavigationEvent)) {
            onnavigationevent = new onNavigationEvent(access13800Var);
        } else {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i2 = onnavigationevent.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onNavigationEvent + 47;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    onnavigationevent.label = i2 >> Integer.MIN_VALUE;
                } else {
                    onnavigationevent.label = i2 - 2147483648;
                }
                int i4 = IAuthTabCallback + 85;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        Object obj = onnavigationevent.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i6 = onnavigationevent.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(obj);
            enableLitePreloadOpt enablelitepreloadopt = this.onWarmupCompleted;
            onnavigationevent.label = 1;
            objOnWarmupCompleted = enablelitepreloadopt.onWarmupCompleted(onnavigationevent);
            if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                return objOnWarmupCompleted2;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            objOnWarmupCompleted = ((kotlin.Result) obj).onNavigationEvent();
        }
        if (kotlin.Result.exceptionOrNull-impl(objOnWarmupCompleted) != null) {
            return access14000.onNavigationEvent(true);
        }
        String str = (String) objOnWarmupCompleted;
        if (str != null) {
            int i7 = onNavigationEvent + 85;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 34 / 0;
                if (StringsKt.isBlank(str)) {
                    int i9 = IAuthTabCallback + 31;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    z = false;
                }
            } else if (!StringsKt.isBlank(str)) {
            }
        }
        return access14000.onNavigationEvent(z);
    }
}
