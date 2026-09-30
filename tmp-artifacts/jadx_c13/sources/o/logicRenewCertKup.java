package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import o.logicRenewCertKur;
import org.jetbrains.annotations.NotNull;
import ru.nsk.kstatemachine.state.RedirectPseudoState;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class logicRenewCertKup {

    static final class IAuthTabCallback extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return logicRenewCertKup.onWarmupCompleted((logicIssueCertMakePOPOSigningInputMsg<?>) null, (Set<? extends generateAesIV>) null, this);
        }
    }

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[certVerifyCertificate.values().length];
            try {
                iArr[certVerifyCertificate.EXCLUSIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[certVerifyCertificate.PARALLEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return logicRenewCertKup.onWarmupCompleted((logicIssueCertMakePOPOSigningInputMsg<?>) null, (generateAesIV) null, this);
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return logicRenewCertKup.onExtraCallbackWithResult(null, null, this);
        }
    }

    public static final logicIssueClose onNavigationEvent() {
        return logicRenewCert.onNavigationEvent;
    }

    public static final logicIssueClose onWarmupCompleted() {
        return logicIssueCert.onExtraCallback;
    }

    public static final Object IAuthTabCallback(@NotNull logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg, @NotNull generateAesIV generateaesiv, @NotNull access13800<? super logicIssueClose> access13800Var) {
        return onWarmupCompleted(logicissuecertmakepoposigninginputmsg, generateaesiv, access13800Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007c -> B:12:0x003c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onWarmupCompleted(@NotNull logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg, @NotNull Set<? extends generateAesIV> set, @NotNull access13800<? super logicIssueClose> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        LinkedHashSet linkedHashSet;
        Set set2;
        logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg2;
        Iterator it;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i = iAuthTabCallback.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object obj = iAuthTabCallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = iAuthTabCallback.label;
        int i3 = 2;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            if (set.size() < 2) {
                throw new IllegalArgumentException(("There should be at least two targetStates, current amount " + set.size() + ", check that you are not using the same state multiple times").toString());
            }
            linkedHashSet = new LinkedHashSet();
            Iterator it2 = set.iterator();
            set2 = linkedHashSet;
            logicissuecertmakepoposigninginputmsg2 = logicissuecertmakepoposigninginputmsg;
            it = it2;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) iAuthTabCallback.L$3;
            ?? r8 = (Collection) iAuthTabCallback.L$2;
            set2 = (Set) iAuthTabCallback.L$1;
            logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg3 = (logicIssueCertMakePOPOSigningInputMsg) iAuthTabCallback.L$0;
            ResultKt.onNavigationEvent(obj);
            IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
            LinkedHashSet linkedHashSet2 = r8;
            logicissuecertmakepoposigninginputmsg2 = logicissuecertmakepoposigninginputmsg3;
            Set set3 = set2;
            IAuthTabCallback iAuthTabCallback3 = iAuthTabCallback2;
            generateAesIV generateaesiv = (generateAesIV) obj;
            if (generateaesiv != null) {
                linkedHashSet2.add(generateaesiv);
            }
            linkedHashSet = linkedHashSet2;
            iAuthTabCallback = iAuthTabCallback3;
            set2 = set3;
            if (it.hasNext()) {
                generateAesIV generateaesiv2 = (generateAesIV) it.next();
                iAuthTabCallback.L$0 = logicissuecertmakepoposigninginputmsg2;
                iAuthTabCallback.L$1 = set2;
                iAuthTabCallback.L$2 = linkedHashSet;
                iAuthTabCallback.L$3 = it;
                iAuthTabCallback.label = 1;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(logicissuecertmakepoposigninginputmsg2, generateaesiv2, iAuthTabCallback);
                if (objOnExtraCallbackWithResult == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
                iAuthTabCallback2 = iAuthTabCallback;
                linkedHashSet2 = linkedHashSet;
                obj = objOnExtraCallbackWithResult;
                Set set32 = set2;
                IAuthTabCallback iAuthTabCallback32 = iAuthTabCallback2;
                generateAesIV generateaesiv3 = (generateAesIV) obj;
                if (generateaesiv3 != null) {
                }
                linkedHashSet = linkedHashSet2;
                iAuthTabCallback = iAuthTabCallback32;
                set2 = set32;
                if (it.hasNext()) {
                    if (set2.isEmpty()) {
                        return logicIssueCert.onExtraCallback;
                    }
                    Intrinsics.checkNotNull(set2, "");
                    decryptRSA decryptrsaOnWarmupCompleted = certGetCertUserNotice.onWarmupCompleted((Set<? extends decryptRSA>) set2);
                    Intrinsics.checkNotNull(decryptrsaOnWarmupCompleted, "");
                    if (onWarmupCompleted((cryptVerifySignatureValue) decryptrsaOnWarmupCompleted) == null) {
                        certVerifyCertificate certverifycertificate = certVerifyCertificate.PARALLEL;
                        throw new IllegalStateException(("Resolved states does not have common ancestor with " + certverifycertificate + " child mode. Only children of a state with " + certverifycertificate + " child mode might be used as effective (resolved) targets here.").toString());
                    }
                    return new logicPKCS1Decrypt(set2, null, i3, 0 == true ? 1 : 0);
                }
            }
        }
    }

    private static final cryptVerifySignatureValue onWarmupCompleted(cryptVerifySignatureValue cryptverifysignaturevalue) {
        if (cryptverifysignaturevalue.IAuthTabCallback() == certVerifyCertificate.PARALLEL) {
            return cryptverifysignaturevalue;
        }
        cryptVerifySignatureValue cryptverifysignaturevalueOnTransact = cryptverifysignaturevalue.IAuthTabCallbackDefault();
        if (cryptverifysignaturevalueOnTransact != null) {
            return onWarmupCompleted(cryptverifysignaturevalueOnTransact);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onWarmupCompleted(logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg, generateAesIV generateaesiv, access13800<? super logicIssueClose> access13800Var) {
        onNavigationEvent onnavigationevent;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i = onnavigationevent.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        Object objOnExtraCallbackWithResult = onnavigationevent.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onnavigationevent.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            onnavigationevent.label = 1;
            objOnExtraCallbackWithResult = onExtraCallbackWithResult(logicissuecertmakepoposigninginputmsg, generateaesiv, onnavigationevent);
            if (objOnExtraCallbackWithResult == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        }
        generateAesIV generateaesiv2 = (generateAesIV) objOnExtraCallbackWithResult;
        if (generateaesiv2 == null) {
            return logicIssueCert.onExtraCallback;
        }
        return new logicPKCS1Decrypt(clearFaultAddress.onNavigationEvent(generateaesiv2), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r7 != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onExtraCallbackWithResult(logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg, generateAesIV generateaesiv, access13800<? super generateAesIV> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i = onwarmupcompleted.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object objOnExtraCallback = onwarmupcompleted.result;
        Object objOnExtraCallback2 = access14100.onExtraCallback();
        int i2 = onwarmupcompleted.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            if (generateaesiv instanceof RedirectPseudoState) {
                logicRenewCertKur.onExtraCallback onextracallback = new logicRenewCertKur.onExtraCallback(logicissuecertmakepoposigninginputmsg);
                onwarmupcompleted.label = 1;
                objOnExtraCallback = ((RedirectPseudoState) generateaesiv).onExtraCallback(onextracallback, onwarmupcompleted);
            } else {
                if (generateaesiv instanceof cryptGenerateHASH) {
                    generateaesiv = ((cryptGenerateHASH) generateaesiv).onNavigationEvent();
                } else if (generateaesiv instanceof getSignCert) {
                    generateaesiv = (generateAesIV) CollectionsKt___CollectionsKt.firstOrNull(((getSignCert) generateaesiv).extraCallback());
                }
                if (generateaesiv == null) {
                    return null;
                }
                getFidoInfo getfidoinfoIAuthTabCallback = IAuthTabCallback(generateaesiv);
                if (getfidoinfoIAuthTabCallback == null) {
                    return generateaesiv;
                }
                onwarmupcompleted.label = 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(logicissuecertmakepoposigninginputmsg, getfidoinfoIAuthTabCallback, onwarmupcompleted);
                if (objOnExtraCallbackWithResult != objOnExtraCallback2) {
                    return objOnExtraCallbackWithResult;
                }
            }
            return objOnExtraCallback2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
            return objOnExtraCallback;
        }
        ResultKt.onNavigationEvent(objOnExtraCallback);
        return ((logicIssueClose) objOnExtraCallback).onExtraCallbackWithResult();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final logicIssueClose onExtraCallback(@NotNull generateAesIV generateaesiv) {
        Intrinsics.checkNotNullParameter(generateaesiv, "");
        return new logicPKCS1Decrypt(clearFaultAddress.onNavigationEvent(generateaesiv), null, 2, 0 == true ? 1 : 0);
    }

    private static final getFidoInfo IAuthTabCallback(generateAesIV generateaesiv) {
        if (generateaesiv instanceof getFidoInfo) {
            return (getFidoInfo) generateaesiv;
        }
        if (generateaesiv.getInterfaceDescriptor().isEmpty()) {
            return null;
        }
        int i = onExtraCallbackWithResult.onNavigationEvent[generateaesiv.IAuthTabCallback().ordinal()];
        if (i == 1) {
            generateAesIV generateaesivOnExtraCallback = cryptSeed.onExtraCallback(generateaesiv);
            if (generateaesivOnExtraCallback instanceof logicDisuseCertRr) {
                return null;
            }
            return IAuthTabCallback(generateaesivOnExtraCallback);
        }
        if (i == 2) {
            Set<generateAesIV> interfaceDescriptor = generateaesiv.getInterfaceDescriptor();
            ArrayList arrayList = new ArrayList();
            for (generateAesIV generateaesiv2 : interfaceDescriptor) {
                getFidoInfo getfidoinfoIAuthTabCallback = !(generateaesiv2 instanceof logicDisuseCertRr) ? IAuthTabCallback(generateaesiv2) : null;
                if (getfidoinfoIAuthTabCallback != null) {
                    arrayList.add(getfidoinfoIAuthTabCallback);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return (getFidoInfo) CollectionsKt___CollectionsKt.first((List) arrayList);
        }
        throw new NoWhenBranchMatchedException();
    }
}
