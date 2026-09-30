package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import o.logicRenewCertKur;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getKMCert {

    static final class onExtraCallback<E extends certGetOCSPAddress> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return getKMCert.onExtraCallback(null, null, this);
        }
    }

    static final class onNavigationEvent<E extends certGetOCSPAddress> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return getKMCert.onWarmupCompleted(null, null, this);
        }
    }

    public static final decryptRSA onExtraCallbackWithResult(@NotNull decryptRSA decryptrsa) {
        Intrinsics.checkNotNullParameter(decryptrsa, "");
        decryptRSA decryptrsaIAuthTabCallbackDefault = decryptrsa.IAuthTabCallbackDefault();
        if (decryptrsaIAuthTabCallbackDefault != null) {
            return decryptrsaIAuthTabCallbackDefault;
        }
        throw new IllegalArgumentException((decryptrsa + " parent is not set").toString());
    }

    public static final cryptVerifySignatureValue onWarmupCompleted(@NotNull cryptVerifySignatureValue cryptverifysignaturevalue) {
        Intrinsics.checkNotNullParameter(cryptverifysignaturevalue, "");
        cryptVerifySignatureValue cryptverifysignaturevalueIAuthTabCallbackDefault = cryptverifysignaturevalue.IAuthTabCallbackDefault();
        if (cryptverifysignaturevalueIAuthTabCallbackDefault != null) {
            return cryptverifysignaturevalueIAuthTabCallbackDefault;
        }
        throw new IllegalArgumentException((cryptverifysignaturevalue + " parent is not set").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v6, types: [o.certGetOCSPAddress] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0073 -> B:21:0x0077). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E extends certGetOCSPAddress> Object onWarmupCompleted(@NotNull cryptVerifySignatureValue cryptverifysignaturevalue, @NotNull E e, @NotNull access13800<? super List<? extends logicIssueCertGenmGenp<E>>> access13800Var) {
        onNavigationEvent onnavigationevent;
        Collection arrayList;
        Iterator it;
        E e2;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i = onnavigationevent.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        Object obj = onnavigationevent.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onnavigationevent.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            Set<logicIssueCertSendConf<?>> setAccess000 = cryptverifysignaturevalue.access000();
            arrayList = new ArrayList();
            it = setAccess000.iterator();
            e2 = e;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = onnavigationevent.L$3;
            it = (Iterator) onnavigationevent.L$2;
            arrayList = (Collection) onnavigationevent.L$1;
            ?? r4 = (certGetOCSPAddress) onnavigationevent.L$0;
            ResultKt.onNavigationEvent(obj);
            E e3 = r4;
            if (((Boolean) obj).booleanValue()) {
                arrayList.add(obj2);
            }
            e2 = e3;
            if (it.hasNext()) {
                Object next = it.next();
                onnavigationevent.L$0 = e2;
                onnavigationevent.L$1 = arrayList;
                onnavigationevent.L$2 = it;
                onnavigationevent.L$3 = next;
                onnavigationevent.label = 1;
                Object objIAuthTabCallback = ((logicIssueCertSendConf) next).IAuthTabCallback(e2, onnavigationevent);
                if (objIAuthTabCallback == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
                e3 = e2;
                obj2 = next;
                obj = objIAuthTabCallback;
                if (((Boolean) obj).booleanValue()) {
                }
                e2 = e3;
                if (it.hasNext()) {
                    List list = (List) arrayList;
                    Intrinsics.checkNotNull(list, "");
                    return list;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b9 -> B:26:0x00ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E extends certGetOCSPAddress> Object onExtraCallback(@NotNull cryptVerifySignatureValue cryptverifysignaturevalue, @NotNull logicIssueCertMakePOPOSigningInputMsg<E> logicissuecertmakepoposigninginputmsg, @NotNull access13800<? super Pair<? extends logicIssueCertGenmGenp<E>, ? extends logicIssueClose>> access13800Var) {
        onExtraCallback onextracallback;
        cryptVerifySignatureValue cryptverifysignaturevalue2;
        logicRenewCertKur.onExtraCallback onextracallback2;
        logicRenewCertKur.onExtraCallback onextracallback3;
        logicIssueCertMakePOPOSigningInputMsg<E> logicissuecertmakepoposigninginputmsg2;
        cryptVerifySignatureValue cryptverifysignaturevalue3;
        Collection arrayList;
        Iterator it;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i = onextracallback.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object objOnWarmupCompleted = onextracallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onextracallback.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            logicRenewCertKur.onExtraCallback onextracallback4 = new logicRenewCertKur.onExtraCallback(logicissuecertmakepoposigninginputmsg);
            certGetOCSPAddress certgetocspaddressOnWarmupCompleted = logicissuecertmakepoposigninginputmsg.onWarmupCompleted();
            onextracallback.L$0 = cryptverifysignaturevalue;
            onextracallback.L$1 = logicissuecertmakepoposigninginputmsg;
            onextracallback.L$2 = onextracallback4;
            onextracallback.label = 1;
            Object objOnWarmupCompleted2 = onWarmupCompleted(cryptverifysignaturevalue, certgetocspaddressOnWarmupCompleted, onextracallback);
            if (objOnWarmupCompleted2 != objOnExtraCallback) {
                cryptverifysignaturevalue2 = cryptverifysignaturevalue;
                onextracallback2 = onextracallback4;
                objOnWarmupCompleted = objOnWarmupCompleted2;
            }
            return objOnExtraCallback;
        }
        if (i2 == 1) {
            onextracallback2 = (logicRenewCertKur.onExtraCallback) onextracallback.L$2;
            logicissuecertmakepoposigninginputmsg = (logicIssueCertMakePOPOSigningInputMsg) onextracallback.L$1;
            cryptverifysignaturevalue2 = (cryptVerifySignatureValue) onextracallback.L$0;
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (Collection) onextracallback.L$6;
            logicIssueCertGenmGenp logicissuecertgenmgenp = (logicIssueCertGenmGenp) onextracallback.L$5;
            it = (Iterator) onextracallback.L$4;
            Collection collection = (Collection) onextracallback.L$3;
            onextracallback3 = (logicRenewCertKur.onExtraCallback) onextracallback.L$2;
            logicissuecertmakepoposigninginputmsg2 = (logicIssueCertMakePOPOSigningInputMsg) onextracallback.L$1;
            cryptverifysignaturevalue3 = (cryptVerifySignatureValue) onextracallback.L$0;
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            arrayList.add(getWrite.IAuthTabCallback(logicissuecertgenmgenp, objOnWarmupCompleted));
            arrayList = collection;
            if (it.hasNext()) {
                logicissuecertgenmgenp = (logicIssueCertGenmGenp) it.next();
                onextracallback.L$0 = cryptverifysignaturevalue3;
                onextracallback.L$1 = logicissuecertmakepoposigninginputmsg2;
                onextracallback.L$2 = onextracallback3;
                onextracallback.L$3 = arrayList;
                onextracallback.L$4 = it;
                onextracallback.L$5 = logicissuecertgenmgenp;
                onextracallback.L$6 = arrayList;
                onextracallback.label = 2;
                objOnWarmupCompleted = logicissuecertgenmgenp.onWarmupCompleted(onextracallback3, onextracallback);
                if (objOnWarmupCompleted != objOnExtraCallback) {
                    collection = arrayList;
                    arrayList.add(getWrite.IAuthTabCallback(logicissuecertgenmgenp, objOnWarmupCompleted));
                    arrayList = collection;
                    if (it.hasNext()) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : (List) arrayList) {
                            if (!(((Pair) obj).getSecond() instanceof logicIssueCert)) {
                                arrayList2.add(obj);
                            }
                        }
                        if (!cryptverifysignaturevalue3.IAuthTabCallbackStub().cD_().onNavigationEvent()) {
                            if (arrayList2.size() > 1) {
                                throw new IllegalStateException(("Multiple transitions match " + logicissuecertmakepoposigninginputmsg2.onWarmupCompleted() + ", " + arrayList2 + " in " + cryptverifysignaturevalue3).toString());
                            }
                            return (Pair) CollectionsKt___CollectionsKt.singleOrNull((List) arrayList2);
                        }
                        return (Pair) CollectionsKt___CollectionsKt.firstOrNull((List) arrayList2);
                    }
                }
                return objOnExtraCallback;
            }
        }
        Iterable iterable = (Iterable) objOnWarmupCompleted;
        onextracallback3 = onextracallback2;
        logicissuecertmakepoposigninginputmsg2 = logicissuecertmakepoposigninginputmsg;
        cryptverifysignaturevalue3 = cryptverifysignaturevalue2;
        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        it = iterable.iterator();
        if (it.hasNext()) {
        }
    }
}
