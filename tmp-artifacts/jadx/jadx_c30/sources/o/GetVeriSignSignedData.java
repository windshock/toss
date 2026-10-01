package o;

import j$.time.Clock;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import o.GetKMPrikey;
import o.GetVeriSignSignedData;
import o.JCertTransfer;
import o.TRANS_Error;
import o.isLast;
import o.onChildViewAdded;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;
import org.xbill.DNS.NameTooLongException;
import org.xbill.DNS.RRset;
import org.xbill.DNS.Record;
import org.xbill.DNS.Resolver;
import org.xbill.DNS.dnssec.R;
import org.xbill.DNS.dnssec.ResponseClassification;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class GetVeriSignSignedData implements Resolver {
    private static final AppSetIdAndScope1 onExtraCallbackWithResult = ea10.onWarmupCompleted(GetVeriSignSignedData.class);
    private final Resolver IAuthTabCallback;
    private final GetErrMsg IAuthTabCallbackStub;
    private final TRANS_Finalize asBinder;
    private final TRANS_Error asInterface;
    private final ConstantServerType onExtraCallback;
    private boolean onNavigationEvent;
    private final Clock onWarmupCompleted;

    public static /* synthetic */ Void onExtraCallback(Throwable th) {
        return null;
    }

    private void onWarmupCompleted(GetKMPrikey getKMPrikey) {
        if (getKMPrikey.onExtraCallback(1).isEmpty() && getKMPrikey.onExtraCallback(2).size() == 1) {
            return;
        }
        Iterator<GetKMCert> it = getKMPrikey.onExtraCallback(2).iterator();
        while (it.hasNext()) {
            GetKMCert next = it.next();
            if (next.onExtraCallback() == 2 && next.IAuthTabCallbackStubProxy().isEmpty()) {
                new Object[]{next.asInterface(), lt54.onNavigationEvent(next.onExtraCallback()), ryzbycx.onWarmupCompleted(next.onTransact())};
                it.remove();
            }
        }
    }

    private CompletionStage<Void> onExtraCallback(final onChildViewAdded onchildviewadded, final GetKMPrikey getKMPrikey, final GetSignCert getSignCert, final Executor executor) {
        final HashMap map = new HashMap(1);
        final ArrayList arrayList = new ArrayList(0);
        final ArrayList arrayList2 = new ArrayList(0);
        return onWarmupCompleted(getKMPrikey, onchildviewadded.onNavigationEvent().extraCallback(), map, executor).thenCompose(new Function() { // from class: org.xbill.DNS.dnssec.ValidatingResolver$$ExternalSyntheticLambda7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return GetVeriSignSignedData.IAuthTabCallback(this.f$0, onchildviewadded, getKMPrikey, map, arrayList, arrayList2, executor, (Boolean) obj);
            }
        }).thenAccept(new Consumer() { // from class: org.xbill.DNS.dnssec.ValidatingResolver$$ExternalSyntheticLambda8
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                GetVeriSignSignedData.IAuthTabCallback(this.f$0, map, arrayList2, arrayList, getKMPrikey, getSignCert, (Boolean) obj);
            }
        });
    }

    public static /* synthetic */ CompletionStage IAuthTabCallback(GetVeriSignSignedData getVeriSignSignedData, onChildViewAdded onchildviewadded, GetKMPrikey getKMPrikey, Map map, List list, List list2, Executor executor, Boolean bool) {
        int[] iArr;
        if (Boolean.TRUE.equals(bool)) {
            if (onchildviewadded.onNavigationEvent().extraCallback() == 255) {
                iArr = new int[]{1, 2};
            } else {
                iArr = new int[]{2};
            }
            return getVeriSignSignedData.onExtraCallback(getKMPrikey, map, list, list2, iArr, new AtomicInteger(0), new AtomicInteger(0), executor);
        }
        return CompletableFuture.completedFuture(Boolean.FALSE);
    }

    public static /* synthetic */ void IAuthTabCallback(GetVeriSignSignedData getVeriSignSignedData, Map map, List list, List list2, GetKMPrikey getKMPrikey, GetSignCert getSignCert, Boolean bool) {
        boolean z;
        if (Boolean.TRUE.equals(bool)) {
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        GetKMCert getKMCert = (GetKMCert) it.next();
                        szzb szzbVarOnWarmupCompleted = getKMCert.onWarmupCompleted();
                        if (TRANS_Error.onExtraCallback(getKMCert, szzbVarOnWarmupCompleted, (yzp2) entry.getKey())) {
                            try {
                                if (((yzp2) entry.getValue()).equals(TRANS_Error.IAuthTabCallback((yzp2) entry.getKey(), getKMCert, szzbVarOnWarmupCompleted))) {
                                    z = true;
                                    break;
                                }
                            } catch (NameTooLongException unused) {
                                throw new IllegalStateException(R.onExtraCallbackWithResult("failed.positive.wildcardgeneration", new Object[0]));
                            }
                        }
                    }
                    if (!z && !list2.isEmpty()) {
                        if (getVeriSignSignedData.IAuthTabCallbackStub.onNavigationEvent(list2, getVeriSignSignedData.onExtraCallback)) {
                            getKMPrikey.onExtraCallbackWithResult(GetPassword.INSECURE, -1, R.onExtraCallbackWithResult("failed.nsec3_ignored", new Object[0]));
                            return;
                        }
                        GetPassword getPasswordOnWarmupCompleted = getVeriSignSignedData.IAuthTabCallbackStub.onWarmupCompleted((List<GetKMCert>) list2, (yzp2) entry.getKey(), ((GetKMCert) list2.get(0)).ICustomTabsCallback(), (yzp2) entry.getValue(), getSignCert);
                        if (getPasswordOnWarmupCompleted == GetPassword.INSECURE) {
                            getKMPrikey.onExtraCallbackWithResult(getPasswordOnWarmupCompleted, -1);
                            return;
                        } else if (getPasswordOnWarmupCompleted == GetPassword.SECURE) {
                            continue;
                        }
                    }
                    if (!z) {
                        getKMPrikey.onWarmupCompleted(R.onExtraCallbackWithResult("failed.positive.wildcard_too_broad", new Object[0]));
                        return;
                    }
                }
            }
            getKMPrikey.onExtraCallbackWithResult(GetPassword.SECURE, -1);
        }
    }

    private CompletionStage<Boolean> onExtraCallback(final GetKMPrikey getKMPrikey, final Map<yzp2, yzp2> map, final List<GetKMCert> list, final List<GetKMCert> list2, final int[] iArr, final AtomicInteger atomicInteger, final AtomicInteger atomicInteger2, final Executor executor) {
        if (atomicInteger.get() >= iArr.length) {
            return CompletableFuture.completedFuture(Boolean.TRUE);
        }
        List<GetKMCert> listOnExtraCallback = getKMPrikey.onExtraCallback(iArr[atomicInteger.get()]);
        if (atomicInteger2.get() >= listOnExtraCallback.size()) {
            atomicInteger.getAndIncrement();
            atomicInteger2.set(0);
            return onExtraCallback(getKMPrikey, map, list, list2, iArr, atomicInteger, atomicInteger2, executor);
        }
        final GetKMCert getKMCert = listOnExtraCallback.get(atomicInteger2.getAndIncrement());
        return onExtraCallbackWithResult(getKMCert, executor).thenCompose(new Function() { // from class: org.xbill.DNS.dnssec.ValidatingResolver$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return GetVeriSignSignedData.onWarmupCompleted(this.f$0, getKMCert, getKMPrikey, map, list2, list, iArr, atomicInteger, atomicInteger2, executor, (JCertTransfer) obj);
            }
        });
    }

    public static /* synthetic */ CompletionStage onWarmupCompleted(GetVeriSignSignedData getVeriSignSignedData, GetKMCert getKMCert, GetKMPrikey getKMPrikey, Map map, List list, List list2, int[] iArr, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Executor executor, JCertTransfer jCertTransfer) {
        GetCertNum getCertNumIAuthTabCallback = jCertTransfer.IAuthTabCallback(getKMCert);
        if (getCertNumIAuthTabCallback != null) {
            getCertNumIAuthTabCallback.onWarmupCompleted(getKMPrikey);
            return CompletableFuture.completedFuture(Boolean.FALSE);
        }
        if (getVeriSignSignedData.asInterface.onWarmupCompleted(getKMCert, jCertTransfer, getVeriSignSignedData.onWarmupCompleted.instant()).onExtraCallback != GetPassword.SECURE) {
            getKMPrikey.onWarmupCompleted(R.onExtraCallbackWithResult("failed.authority.positive", getKMCert));
            return CompletableFuture.completedFuture(Boolean.FALSE);
        }
        if (!map.isEmpty()) {
            if (getKMCert.onExtraCallback() == 47) {
                list.add(getKMCert);
            } else {
                if (getKMCert.onExtraCallback() == 50) {
                    list2.add(getKMCert);
                }
                return getVeriSignSignedData.onExtraCallback(getKMPrikey, map, list2, list, iArr, atomicInteger, atomicInteger2, executor);
            }
        }
        return getVeriSignSignedData.onExtraCallback(getKMPrikey, map, list2, list, iArr, atomicInteger, atomicInteger2, executor);
    }

    private CompletionStage<Boolean> onWarmupCompleted(GetKMPrikey getKMPrikey, int i, Map<yzp2, yzp2> map, Executor executor) {
        return onExtraCallback(getKMPrikey, i, map, new AtomicInteger(0), executor);
    }

    private CompletionStage<Boolean> onExtraCallback(final GetKMPrikey getKMPrikey, final int i, final Map<yzp2, yzp2> map, final AtomicInteger atomicInteger, final Executor executor) {
        final List<GetKMCert> listOnExtraCallback = getKMPrikey.onExtraCallback(1);
        if (atomicInteger.get() >= listOnExtraCallback.size()) {
            return CompletableFuture.completedFuture(Boolean.TRUE);
        }
        final GetKMCert getKMCert = listOnExtraCallback.get(atomicInteger.get());
        return onExtraCallbackWithResult(getKMCert, executor).thenCompose(new Function() { // from class: org.xbill.DNS.dnssec.ValidatingResolver$$ExternalSyntheticLambda19
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return GetVeriSignSignedData.onNavigationEvent(this.f$0, getKMCert, getKMPrikey, map, i, atomicInteger, listOnExtraCallback, executor, (JCertTransfer) obj);
            }
        });
    }

    public static /* synthetic */ CompletionStage onNavigationEvent(GetVeriSignSignedData getVeriSignSignedData, GetKMCert getKMCert, GetKMPrikey getKMPrikey, Map map, int i, AtomicInteger atomicInteger, List list, Executor executor, JCertTransfer jCertTransfer) {
        GetCertNum getCertNumIAuthTabCallback = jCertTransfer.IAuthTabCallback(getKMCert);
        if (getCertNumIAuthTabCallback != null) {
            getCertNumIAuthTabCallback.onWarmupCompleted(getKMPrikey);
            return CompletableFuture.completedFuture(Boolean.FALSE);
        }
        GetPassword getPassword = getVeriSignSignedData.asInterface.onWarmupCompleted(getKMCert, jCertTransfer, getVeriSignSignedData.onWarmupCompleted.instant()).onExtraCallback;
        GetPassword getPassword2 = GetPassword.SECURE;
        if (getPassword != getPassword2) {
            getKMPrikey.onWarmupCompleted(R.onExtraCallbackWithResult("failed.answer.positive", getKMCert));
            return CompletableFuture.completedFuture(Boolean.FALSE);
        }
        try {
            yzp2 yzp2VarIAuthTabCallback = TRANS_Error.IAuthTabCallback(getKMCert);
            if (yzp2VarIAuthTabCallback != null) {
                if (getKMCert.onExtraCallback() == 39) {
                    getKMPrikey.onWarmupCompleted(R.onExtraCallbackWithResult("failed.dname.wildcard", getKMCert.asInterface()));
                    return CompletableFuture.completedFuture(Boolean.FALSE);
                }
                map.put(getKMCert.asInterface(), yzp2VarIAuthTabCallback);
            }
            if (i != 39 && getKMCert.onExtraCallback() == 39) {
                uhzb uhzbVarOnWarmupCompleted = getKMCert.onWarmupCompleted();
                if (atomicInteger.getAndIncrement() < list.size()) {
                    GetKMCert getKMCert2 = (GetKMCert) list.get(atomicInteger.get());
                    if (getKMCert2.onExtraCallback() == 5 && uhzbVarOnWarmupCompleted != null) {
                        if (getKMCert2.access100() > 1) {
                            getKMPrikey.onWarmupCompleted(R.onExtraCallbackWithResult("failed.synthesize.multiple", new Object[0]));
                            return CompletableFuture.completedFuture(Boolean.FALSE);
                        }
                        jcdj jcdjVarOnWarmupCompleted = getKMCert2.onWarmupCompleted();
                        try {
                            yzp2 yzp2VarOnWarmupCompleted = yzp2.onWarmupCompleted(jcdjVarOnWarmupCompleted.access000().onWarmupCompleted(uhzbVarOnWarmupCompleted.access000()), uhzbVarOnWarmupCompleted.onExtraCallbackWithResult());
                            if (!yzp2VarOnWarmupCompleted.equals(jcdjVarOnWarmupCompleted.onNavigationEvent())) {
                                getKMPrikey.onWarmupCompleted(R.onExtraCallbackWithResult("failed.synthesize.nomatch", jcdjVarOnWarmupCompleted.onNavigationEvent(), yzp2VarOnWarmupCompleted));
                                return CompletableFuture.completedFuture(Boolean.FALSE);
                            }
                            getKMCert2.onExtraCallback(getPassword2);
                        } catch (NameTooLongException unused) {
                            getKMPrikey.onWarmupCompleted(R.onExtraCallbackWithResult("failed.synthesize.toolong", new Object[0]));
                            return CompletableFuture.completedFuture(Boolean.FALSE);
                        }
                    }
                }
            }
            atomicInteger.getAndIncrement();
            return getVeriSignSignedData.onExtraCallback(getKMPrikey, i, map, atomicInteger, executor);
        } catch (RuntimeException e) {
            getKMPrikey.onWarmupCompleted(R.onExtraCallbackWithResult(e.getMessage(), getKMCert.asInterface()));
            return CompletableFuture.completedFuture(Boolean.FALSE);
        }
    }

    private CompletionStage<Void> IAuthTabCallback(onChildViewAdded onchildviewadded, final GetKMPrikey getKMPrikey, final GetSignCert getSignCert, Executor executor) {
        yzp2 yzp2VarAccess000 = onchildviewadded.onNavigationEvent().access000();
        final int iExtraCallback = onchildviewadded.onNavigationEvent().extraCallback();
        final yzp2 yzp2VarOnNavigationEvent = yzp2VarAccess000;
        for (GetKMCert getKMCert : getKMPrikey.onExtraCallback(1)) {
            if (getKMCert.IAuthTabCallback_Parcel() != GetPassword.SECURE) {
                getKMPrikey.onWarmupCompleted(R.onExtraCallbackWithResult("failed.answer.cname_nodata", getKMCert.asInterface()));
                return CompletableFuture.completedFuture(null);
            }
            if (getKMCert.onExtraCallback() == 5) {
                yzp2VarOnNavigationEvent = getKMCert.onWarmupCompleted().onNavigationEvent();
            }
        }
        return IAuthTabCallback(getKMPrikey, new AtomicInteger(0), getSignCert, executor).handleAsync(new BiFunction() { // from class: org.xbill.DNS.dnssec.ValidatingResolver$$ExternalSyntheticLambda3
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return GetVeriSignSignedData.onExtraCallbackWithResult(this.f$0, getKMPrikey, yzp2VarOnNavigationEvent, iExtraCallback, getSignCert, (Void) obj, (Throwable) obj2);
            }
        });
    }

    public static /* synthetic */ Void onExtraCallbackWithResult(GetVeriSignSignedData getVeriSignSignedData, GetKMPrikey getKMPrikey, yzp2 yzp2Var, int i, GetSignCert getSignCert, Void r21, Throwable th) {
        if (th != null) {
            return null;
        }
        TRANS_Error.onExtraCallbackWithResult onextracallbackwithresult = new TRANS_Error.onExtraCallbackWithResult();
        ArrayList arrayList = new ArrayList(0);
        int i2 = 12;
        yzp2 yzp2VarICustomTabsCallback = null;
        yzp2 yzp2VarOnNavigationEvent = null;
        boolean z = false;
        for (GetKMCert getKMCert : getKMPrikey.onExtraCallback(2)) {
            if (getKMCert.onExtraCallback() == 47) {
                szzb szzbVarOnWarmupCompleted = getKMCert.onWarmupCompleted();
                TRANS_Error.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = TRANS_Error.onWarmupCompleted(getKMCert, szzbVarOnWarmupCompleted, yzp2Var, i);
                if (onextracallbackwithresultOnWarmupCompleted.onExtraCallback) {
                    z = true;
                } else {
                    i2 = 6;
                }
                if (TRANS_Error.onExtraCallback(getKMCert, szzbVarOnWarmupCompleted, yzp2Var)) {
                    yzp2VarOnNavigationEvent = TRANS_Error.onNavigationEvent(yzp2Var, getKMCert.asInterface(), szzbVarOnWarmupCompleted.onExtraCallback());
                }
                onextracallbackwithresult = onextracallbackwithresultOnWarmupCompleted;
            }
            if (getKMCert.onExtraCallback() == 50) {
                arrayList.add(getKMCert);
                yzp2VarICustomTabsCallback = getKMCert.ICustomTabsCallback();
            }
        }
        yzp2 yzp2Var2 = onextracallbackwithresult.onWarmupCompleted;
        if (yzp2Var2 != null && (yzp2VarOnNavigationEvent == null || (!yzp2VarOnNavigationEvent.equals(yzp2Var2) && !yzp2Var.equals(yzp2VarOnNavigationEvent)))) {
            z = false;
            i2 = 6;
        }
        getVeriSignSignedData.IAuthTabCallbackStub.onWarmupCompleted(arrayList);
        if (!z && !arrayList.isEmpty()) {
            if (getVeriSignSignedData.IAuthTabCallbackStub.onNavigationEvent(arrayList, getVeriSignSignedData.onExtraCallback)) {
                getKMPrikey.onWarmupCompleted(R.onExtraCallbackWithResult("failed.nsec3_ignored", new Object[0]));
                return null;
            }
            GetCertNum getCertNumOnWarmupCompleted = getVeriSignSignedData.IAuthTabCallbackStub.onWarmupCompleted(arrayList, yzp2Var, i, yzp2VarICustomTabsCallback, getSignCert);
            i2 = getCertNumOnWarmupCompleted.onWarmupCompleted;
            GetPassword getPassword = getCertNumOnWarmupCompleted.onExtraCallback;
            GetPassword getPassword2 = GetPassword.INSECURE;
            if (getPassword == getPassword2) {
                getKMPrikey.onExtraCallbackWithResult(getPassword2, -1);
                return null;
            }
            z = getPassword == GetPassword.SECURE;
        }
        if (!z) {
            getKMPrikey.onNavigationEvent(R.onExtraCallbackWithResult("failed.nodata", new Object[0]), i2);
            return null;
        }
        getKMPrikey.onExtraCallbackWithResult(GetPassword.SECURE, -1);
        return null;
    }

    private CompletionStage<Void> IAuthTabCallback(final GetKMPrikey getKMPrikey, final AtomicInteger atomicInteger, final GetSignCert getSignCert, final Executor executor) {
        if (atomicInteger.get() >= getKMPrikey.onExtraCallback(2).size()) {
            return CompletableFuture.completedFuture(null);
        }
        final GetKMCert getKMCert = getKMPrikey.onExtraCallback(2).get(atomicInteger.getAndIncrement());
        return onExtraCallbackWithResult(getKMCert, executor).thenComposeAsync(new Function() { // from class: org.xbill.DNS.dnssec.ValidatingResolver$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return GetVeriSignSignedData.IAuthTabCallback(this.f$0, getKMCert, getKMPrikey, atomicInteger, getSignCert, executor, (JCertTransfer) obj);
            }
        });
    }

    public static /* synthetic */ CompletionStage IAuthTabCallback(GetVeriSignSignedData getVeriSignSignedData, GetKMCert getKMCert, GetKMPrikey getKMPrikey, AtomicInteger atomicInteger, GetSignCert getSignCert, Executor executor, JCertTransfer jCertTransfer) {
        GetCertNum getCertNumIAuthTabCallback = jCertTransfer.IAuthTabCallback(getKMCert);
        if (getCertNumIAuthTabCallback != null) {
            getCertNumIAuthTabCallback.onWarmupCompleted(getKMPrikey);
            return getVeriSignSignedData.IAuthTabCallback(new Exception(getCertNumIAuthTabCallback.onNavigationEvent));
        }
        if (getVeriSignSignedData.asInterface.onWarmupCompleted(getKMCert, jCertTransfer, getVeriSignSignedData.onWarmupCompleted.instant()).onExtraCallback != GetPassword.SECURE) {
            getKMPrikey.onWarmupCompleted(R.onExtraCallbackWithResult("failed.authority.nodata", getKMCert));
            return getVeriSignSignedData.IAuthTabCallback(new Exception("failed.authority.nodata"));
        }
        return getVeriSignSignedData.IAuthTabCallback(getKMPrikey, atomicInteger, getSignCert, executor);
    }

    private <T> CompletionStage<T> IAuthTabCallback(Throwable th) {
        CompletableFuture completableFuture = new CompletableFuture();
        completableFuture.completeExceptionally(th);
        return completableFuture;
    }

    private CompletionStage<Void> onExtraCallbackWithResult(final onChildViewAdded onchildviewadded, final GetKMPrikey getKMPrikey, final GetSignCert getSignCert, final Executor executor) {
        yzp2 yzp2VarAccess000 = onchildviewadded.onNavigationEvent().access000();
        final yzp2 yzp2VarOnNavigationEvent = yzp2VarAccess000;
        for (GetKMCert getKMCert : getKMPrikey.onExtraCallback(1)) {
            if (getKMCert.IAuthTabCallback_Parcel() != GetPassword.SECURE) {
                getKMPrikey.onWarmupCompleted(R.onExtraCallbackWithResult("failed.nxdomain.cname_nxdomain", getKMCert));
                return CompletableFuture.completedFuture(null);
            }
            if (getKMCert.onExtraCallback() == 5) {
                yzp2VarOnNavigationEvent = getKMCert.onWarmupCompleted().onNavigationEvent();
            }
        }
        return onExtraCallbackWithResult(getKMPrikey, new AtomicInteger(0), executor).thenComposeAsync(new Function() { // from class: org.xbill.DNS.dnssec.ValidatingResolver$$ExternalSyntheticLambda17
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return GetVeriSignSignedData.onExtraCallback(this.f$0, getKMPrikey, yzp2VarOnNavigationEvent, getSignCert, onchildviewadded, executor, (Void) obj);
            }
        }).exceptionally(new Function() { // from class: org.xbill.DNS.dnssec.ValidatingResolver$$ExternalSyntheticLambda18
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return GetVeriSignSignedData.onExtraCallback((Throwable) obj);
            }
        });
    }

    public static /* synthetic */ CompletionStage onExtraCallback(GetVeriSignSignedData getVeriSignSignedData, final GetKMPrikey getKMPrikey, yzp2 yzp2Var, GetSignCert getSignCert, onChildViewAdded onchildviewadded, Executor executor, Void r22) {
        ArrayList arrayList = new ArrayList(0);
        final boolean z = false;
        boolean zOnNavigationEvent = false;
        int i = 0;
        yzp2 yzp2VarICustomTabsCallback = null;
        for (GetKMCert getKMCert : getKMPrikey.onExtraCallback(2)) {
            if (getKMCert.onExtraCallback() == 47) {
                szzb szzbVarOnWarmupCompleted = getKMCert.onWarmupCompleted();
                if (TRANS_Error.onExtraCallback(getKMCert, szzbVarOnWarmupCompleted, yzp2Var)) {
                    z = true;
                }
                int iIAuthTabCallback = TRANS_Error.onNavigationEvent(yzp2Var, getKMCert.asInterface(), szzbVarOnWarmupCompleted.onExtraCallback()).IAuthTabCallback();
                if (iIAuthTabCallback > i || (iIAuthTabCallback == i && !zOnNavigationEvent)) {
                    zOnNavigationEvent = TRANS_Error.onNavigationEvent(getKMCert, szzbVarOnWarmupCompleted, yzp2Var);
                }
                i = iIAuthTabCallback;
            }
            if (getKMCert.onExtraCallback() == 50) {
                arrayList.add(getKMCert);
                yzp2VarICustomTabsCallback = getKMCert.ICustomTabsCallback();
            }
        }
        getVeriSignSignedData.IAuthTabCallbackStub.onWarmupCompleted(arrayList);
        if ((!z || !zOnNavigationEvent) && !arrayList.isEmpty()) {
            if (getVeriSignSignedData.IAuthTabCallbackStub.onNavigationEvent(arrayList, getVeriSignSignedData.onExtraCallback)) {
                getKMPrikey.onExtraCallbackWithResult(GetPassword.INSECURE, -1, R.onExtraCallbackWithResult("failed.nsec3_ignored", new Object[0]));
                return CompletableFuture.completedFuture(null);
            }
            GetPassword getPasswordOnExtraCallbackWithResult = getVeriSignSignedData.IAuthTabCallbackStub.onExtraCallbackWithResult(arrayList, yzp2Var, yzp2VarICustomTabsCallback, getSignCert);
            if (getPasswordOnExtraCallbackWithResult != GetPassword.SECURE) {
                if (getPasswordOnExtraCallbackWithResult == GetPassword.INSECURE) {
                    getKMPrikey.onExtraCallbackWithResult(getPasswordOnExtraCallbackWithResult, -1, R.onExtraCallbackWithResult("failed.nxdomain.nsec3_insecure", new Object[0]));
                } else {
                    getKMPrikey.onExtraCallbackWithResult(getPasswordOnExtraCallbackWithResult, 6, R.onExtraCallbackWithResult("failed.nxdomain.nsec3_bogus", new Object[0]));
                }
                return CompletableFuture.completedFuture(null);
            }
            z = true;
            zOnNavigationEvent = true;
        }
        if (!z || !zOnNavigationEvent) {
            return getVeriSignSignedData.IAuthTabCallback(onchildviewadded, getKMPrikey, getSignCert, executor).thenRun(new Runnable() { // from class: org.xbill.DNS.dnssec.ValidatingResolver$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    GetVeriSignSignedData.onExtraCallbackWithResult(getKMPrikey, z);
                }
            });
        }
        getKMPrikey.onExtraCallbackWithResult(GetPassword.SECURE, -1);
        return CompletableFuture.completedFuture(null);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(GetKMPrikey getKMPrikey, boolean z) {
        if (getKMPrikey.asInterface() == GetPassword.SECURE) {
            getKMPrikey.onWarmupCompleted().onTransact(0);
        } else if (!z) {
            getKMPrikey.onWarmupCompleted(R.onExtraCallbackWithResult("failed.nxdomain.exists", getKMPrikey.onExtraCallbackWithResult().access000()));
        } else {
            getKMPrikey.onWarmupCompleted(R.onExtraCallbackWithResult("failed.nxdomain.haswildcard", new Object[0]));
        }
    }

    private CompletionStage<Void> onExtraCallbackWithResult(final GetKMPrikey getKMPrikey, final AtomicInteger atomicInteger, final Executor executor) {
        if (atomicInteger.get() >= getKMPrikey.onExtraCallback(2).size()) {
            return CompletableFuture.completedFuture(null);
        }
        final GetKMCert getKMCert = getKMPrikey.onExtraCallback(2).get(atomicInteger.getAndIncrement());
        return onExtraCallbackWithResult(getKMCert, executor).thenCompose(new Function() { // from class: org.xbill.DNS.dnssec.ValidatingResolver$$ExternalSyntheticLambda5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return GetVeriSignSignedData.onNavigationEvent(this.f$0, getKMCert, getKMPrikey, atomicInteger, executor, (JCertTransfer) obj);
            }
        });
    }

    public static /* synthetic */ CompletionStage onNavigationEvent(GetVeriSignSignedData getVeriSignSignedData, GetKMCert getKMCert, GetKMPrikey getKMPrikey, AtomicInteger atomicInteger, Executor executor, JCertTransfer jCertTransfer) {
        GetCertNum getCertNumIAuthTabCallback = jCertTransfer.IAuthTabCallback(getKMCert);
        if (getCertNumIAuthTabCallback != null) {
            getCertNumIAuthTabCallback.onWarmupCompleted(getKMPrikey);
            return getVeriSignSignedData.IAuthTabCallback(new Exception(getCertNumIAuthTabCallback.onNavigationEvent));
        }
        if (getVeriSignSignedData.asInterface.onWarmupCompleted(getKMCert, jCertTransfer, getVeriSignSignedData.onWarmupCompleted.instant()).onExtraCallback != GetPassword.SECURE) {
            getKMPrikey.onWarmupCompleted(R.onExtraCallbackWithResult("failed.nxdomain.authority", getKMCert));
            return getVeriSignSignedData.IAuthTabCallback(new Exception("failed.nxdomain.authority"));
        }
        return getVeriSignSignedData.onExtraCallbackWithResult(getKMPrikey, atomicInteger, executor);
    }

    private CompletionStage<GetKMPrikey> onWarmupCompleted(onChildViewAdded onchildviewadded, Executor executor) {
        Record recordOnNavigationEvent = onchildviewadded.onNavigationEvent();
        new Object[]{recordOnNavigationEvent.access000(), lt54.onNavigationEvent(recordOnNavigationEvent.extraCallback()), ryzbycx.onWarmupCompleted(recordOnNavigationEvent.getInterfaceDescriptor())};
        final onChildViewAdded onchildviewaddedOnExtraCallbackWithResult = onchildviewadded.onExtraCallbackWithResult();
        onchildviewaddedOnExtraCallbackWithResult.IAuthTabCallback().IAuthTabCallback(11);
        return this.IAuthTabCallback.onExtraCallback(onchildviewaddedOnExtraCallbackWithResult, executor).thenApply(new Function() { // from class: org.xbill.DNS.dnssec.ValidatingResolver$$ExternalSyntheticLambda2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return GetVeriSignSignedData.onExtraCallbackWithResult(onchildviewaddedOnExtraCallbackWithResult, (onChildViewAdded) obj);
            }
        });
    }

    public static /* synthetic */ GetKMPrikey onExtraCallbackWithResult(onChildViewAdded onchildviewadded, onChildViewAdded onchildviewadded2) {
        return new GetKMPrikey(onchildviewadded2.onExtraCallbackWithResult(onchildviewadded));
    }

    private CompletionStage<JCertTransfer> onExtraCallbackWithResult(GetKMCert getKMCert, Executor executor) {
        final getMedia getmedia = new getMedia();
        getmedia.asBinder = getKMCert.ICustomTabsCallback();
        getmedia.onWarmupCompleted = getKMCert.onTransact();
        if (getmedia.asBinder == null) {
            getmedia.asBinder = getKMCert.asInterface();
        }
        RRset rRsetOnExtraCallbackWithResult = this.asBinder.onExtraCallbackWithResult(getmedia.asBinder, getKMCert.onTransact());
        if (rRsetOnExtraCallbackWithResult == null) {
            return CompletableFuture.completedFuture(JCertTransfer.IAuthTabCallback(getmedia.asBinder, getKMCert.onTransact(), 60L));
        }
        GetKMCert getKMCert2 = new GetKMCert(rRsetOnExtraCallbackWithResult);
        GetPassword getPassword = GetPassword.SECURE;
        getKMCert2.onExtraCallback(getPassword);
        JCertTransfer jCertTransferOnNavigationEvent = this.onExtraCallback.onNavigationEvent(getmedia.asBinder, getKMCert.onTransact());
        getmedia.onExtraCallbackWithResult = jCertTransferOnNavigationEvent;
        if (jCertTransferOnNavigationEvent == null || (!jCertTransferOnNavigationEvent.asInterface().equals(getmedia.asBinder) && getmedia.onExtraCallbackWithResult.access000())) {
            if (getKMCert2.onExtraCallback() == 43) {
                getmedia.onNavigationEvent = getKMCert2;
                getmedia.onExtraCallbackWithResult = null;
                getmedia.onExtraCallback = new yzp2(rRsetOnExtraCallbackWithResult.asInterface(), 1);
                return onWarmupCompleted(getmedia, executor).thenApply(new Function() { // from class: org.xbill.DNS.dnssec.ValidatingResolver$$ExternalSyntheticLambda16
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return getmedia.onExtraCallbackWithResult;
                    }
                });
            }
            JCertTransfer jCertTransferOnExtraCallback = JCertTransfer.onExtraCallback(getKMCert2);
            getmedia.onExtraCallbackWithResult = jCertTransferOnExtraCallback;
            jCertTransferOnExtraCallback.onExtraCallback(getPassword);
            this.onExtraCallback.IAuthTabCallback(getmedia.onExtraCallbackWithResult);
        }
        return CompletableFuture.completedFuture(getmedia.onExtraCallbackWithResult);
    }

    private CompletionStage<Void> onWarmupCompleted(final getMedia getmedia, final Executor executor) {
        int i = getmedia.onWarmupCompleted;
        yzp2 yzp2Var = getmedia.asBinder;
        yzp2 yzp2VarAsInterface = yzp2.onExtraCallback;
        JCertTransfer jCertTransfer = getmedia.onExtraCallbackWithResult;
        if (jCertTransfer != null) {
            yzp2VarAsInterface = jCertTransfer.asInterface();
        }
        yzp2 yzp2Var2 = getmedia.onExtraCallback;
        if (yzp2Var2 != null) {
            getmedia.onExtraCallback = null;
            yzp2VarAsInterface = yzp2Var2;
        }
        if (yzp2VarAsInterface.equals(yzp2Var)) {
            return CompletableFuture.completedFuture(null);
        }
        yzp2 yzp2Var3 = getmedia.IAuthTabCallback;
        if (yzp2Var3 != null) {
            yzp2VarAsInterface = yzp2Var3;
        }
        int iIAuthTabCallback = (yzp2Var.IAuthTabCallback() - yzp2VarAsInterface.IAuthTabCallback()) - 1;
        if (iIAuthTabCallback < 0) {
            return CompletableFuture.completedFuture(null);
        }
        yzp2 yzp2Var4 = new yzp2(yzp2Var, iIAuthTabCallback);
        new Object[]{yzp2Var, yzp2VarAsInterface, yzp2Var4};
        GetKMCert getKMCert = getmedia.onNavigationEvent;
        if (getKMCert == null || !getKMCert.asInterface().equals(yzp2Var4)) {
            final onChildViewAdded onchildviewaddedIAuthTabCallback = onChildViewAdded.IAuthTabCallback(Record.IAuthTabCallback(yzp2Var4, 43, i));
            return onWarmupCompleted(onchildviewaddedIAuthTabCallback, executor).thenComposeAsync(new Function() { // from class: org.xbill.DNS.dnssec.ValidatingResolver$$ExternalSyntheticLambda14
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return this.f$0.onExtraCallback(onchildviewaddedIAuthTabCallback, (GetKMPrikey) obj, getmedia, executor);
                }
            });
        }
        final onChildViewAdded onchildviewaddedIAuthTabCallback2 = onChildViewAdded.IAuthTabCallback(Record.IAuthTabCallback(getmedia.onNavigationEvent.asInterface(), 48, i));
        return onWarmupCompleted(onchildviewaddedIAuthTabCallback2, executor).thenComposeAsync(new Function() { // from class: org.xbill.DNS.dnssec.ValidatingResolver$$ExternalSyntheticLambda15
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.onNavigationEvent(onchildviewaddedIAuthTabCallback2, (GetKMPrikey) obj, getmedia, executor);
            }
        });
    }

    private JCertTransfer onWarmupCompleted(GetKMPrikey getKMPrikey, onChildViewAdded onchildviewadded, JCertTransfer jCertTransfer) {
        yzp2 yzp2VarAccess000 = onchildviewadded.onNavigationEvent().access000();
        int interfaceDescriptor = onchildviewadded.onNavigationEvent().getInterfaceDescriptor();
        ResponseClassification responseClassificationOnExtraCallbackWithResult = TRANS_Error.onExtraCallbackWithResult(onchildviewadded, getKMPrikey);
        JCertTransfer jCertTransferOnWarmupCompleted = JCertTransfer.onWarmupCompleted(yzp2VarAccess000, interfaceDescriptor, 60L);
        int i = AnonymousClass3.onExtraCallback[responseClassificationOnExtraCallbackWithResult.ordinal()];
        if (i == 1) {
            GetKMCert getKMCertOnNavigationEvent = getKMPrikey.onNavigationEvent(yzp2VarAccess000, 43, interfaceDescriptor);
            GetCertNum getCertNumOnWarmupCompleted = this.asInterface.onWarmupCompleted(getKMCertOnNavigationEvent, jCertTransfer, this.onWarmupCompleted.instant());
            if (getCertNumOnWarmupCompleted.onExtraCallback != GetPassword.SECURE) {
                jCertTransferOnWarmupCompleted.onNavigationEvent(getCertNumOnWarmupCompleted.onWarmupCompleted, getCertNumOnWarmupCompleted.onNavigationEvent);
                return jCertTransferOnWarmupCompleted;
            }
            if (!this.asInterface.onExtraCallbackWithResult((RRset) getKMCertOnNavigationEvent)) {
                JCertTransfer jCertTransferIAuthTabCallback = JCertTransfer.IAuthTabCallback(yzp2VarAccess000, interfaceDescriptor, getKMCertOnNavigationEvent.asBinder());
                jCertTransferIAuthTabCallback.onNavigationEvent(1, R.onExtraCallbackWithResult("insecure.ds.noalgorithms", yzp2VarAccess000));
                return jCertTransferIAuthTabCallback;
            }
            return JCertTransfer.onExtraCallback(getKMCertOnNavigationEvent);
        }
        if (i != 2) {
            if (i == 3 || i == 4) {
                return onExtraCallback(getKMPrikey, onchildviewadded, jCertTransfer);
            }
            jCertTransferOnWarmupCompleted.onNavigationEvent(6, R.onExtraCallbackWithResult("failed.ds.notype", responseClassificationOnExtraCallbackWithResult));
            return jCertTransferOnWarmupCompleted;
        }
        if (this.asInterface.onWarmupCompleted(getKMPrikey.onNavigationEvent(yzp2VarAccess000, 5, interfaceDescriptor), jCertTransfer, this.onWarmupCompleted.instant()).onExtraCallback == GetPassword.SECURE) {
            return null;
        }
        jCertTransferOnWarmupCompleted.onNavigationEvent(6, R.onExtraCallbackWithResult("failed.ds.cname", new Object[0]));
        return jCertTransferOnWarmupCompleted;
    }

    private JCertTransfer onExtraCallback(GetKMPrikey getKMPrikey, onChildViewAdded onchildviewadded, JCertTransfer jCertTransfer) {
        yzp2 yzp2VarAccess000 = onchildviewadded.onNavigationEvent().access000();
        int interfaceDescriptor = onchildviewadded.onNavigationEvent().getInterfaceDescriptor();
        JCertTransfer jCertTransferOnWarmupCompleted = JCertTransfer.onWarmupCompleted(yzp2VarAccess000, interfaceDescriptor, 60L);
        if (!this.asInterface.onExtraCallback(getKMPrikey)) {
            jCertTransferOnWarmupCompleted.onNavigationEvent(10, R.onExtraCallbackWithResult("failed.ds.nonsec", yzp2VarAccess000));
            return jCertTransferOnWarmupCompleted;
        }
        GetCertNum getCertNumOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult(onchildviewadded, getKMPrikey, jCertTransfer, this.onWarmupCompleted.instant());
        int i = AnonymousClass3.onNavigationEvent[getCertNumOnExtraCallbackWithResult.onExtraCallback.ordinal()];
        if (i == 1) {
            JCertTransfer jCertTransferIAuthTabCallback = JCertTransfer.IAuthTabCallback(yzp2VarAccess000, interfaceDescriptor, 60L);
            jCertTransferIAuthTabCallback.onNavigationEvent(-1, R.onExtraCallbackWithResult("insecure.ds.nsec", new Object[0]));
            return jCertTransferIAuthTabCallback;
        }
        if (i == 2) {
            return null;
        }
        if (i == 3) {
            jCertTransferOnWarmupCompleted.onNavigationEvent(getCertNumOnExtraCallbackWithResult.onWarmupCompleted, getCertNumOnExtraCallbackWithResult.onNavigationEvent);
            return jCertTransferOnWarmupCompleted;
        }
        List<GetKMCert> listOnExtraCallbackWithResult = getKMPrikey.onExtraCallbackWithResult(2, 50);
        ArrayList arrayList = new ArrayList(0);
        if (!listOnExtraCallbackWithResult.isEmpty()) {
            long jAsBinder = -1;
            yzp2 yzp2VarICustomTabsCallback = null;
            for (GetKMCert getKMCert : listOnExtraCallbackWithResult) {
                if (this.asInterface.onWarmupCompleted(getKMCert, jCertTransfer, this.onWarmupCompleted.instant()).onExtraCallback == GetPassword.SECURE) {
                    yzp2VarICustomTabsCallback = getKMCert.ICustomTabsCallback();
                    if (jAsBinder < 0 || getKMCert.asBinder() < jAsBinder) {
                        jAsBinder = getKMCert.asBinder();
                    }
                    arrayList.add(getKMCert);
                }
            }
            int i2 = AnonymousClass3.onNavigationEvent[this.IAuthTabCallbackStub.onWarmupCompleted(arrayList, yzp2VarAccess000, yzp2VarICustomTabsCallback, new GetSignCert()).ordinal()];
            if (i2 == 1 || i2 == 2) {
                JCertTransfer jCertTransferIAuthTabCallback2 = JCertTransfer.IAuthTabCallback(yzp2VarAccess000, interfaceDescriptor, jAsBinder);
                jCertTransferIAuthTabCallback2.onNavigationEvent(-1, R.onExtraCallbackWithResult("insecure.ds.nsec3", new Object[0]));
                return jCertTransferIAuthTabCallback2;
            }
            if (i2 == 3) {
                jCertTransferOnWarmupCompleted.onNavigationEvent(6, R.onExtraCallbackWithResult("failed.ds.nsec3", new Object[0]));
                return jCertTransferOnWarmupCompleted;
            }
            if (i2 == 4) {
                return null;
            }
            jCertTransferOnWarmupCompleted.onNavigationEvent(6, R.onExtraCallbackWithResult("unknown.ds.nsec3", new Object[0]));
            return jCertTransferOnWarmupCompleted;
        }
        jCertTransferOnWarmupCompleted.onNavigationEvent(6, R.onExtraCallbackWithResult("failed.ds.unknown", new Object[0]));
        return jCertTransferOnWarmupCompleted;
    }

    /* renamed from: o.GetVeriSignSignedData$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] onExtraCallback;
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[GetPassword.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[GetPassword.SECURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onNavigationEvent[GetPassword.INSECURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onNavigationEvent[GetPassword.BOGUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onNavigationEvent[GetPassword.INDETERMINATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onNavigationEvent[GetPassword.UNCHECKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[ResponseClassification.values().length];
            onExtraCallback = iArr2;
            try {
                iArr2[ResponseClassification.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                onExtraCallback[ResponseClassification.CNAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                onExtraCallback[ResponseClassification.NODATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                onExtraCallback[ResponseClassification.NAMEERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                onExtraCallback[ResponseClassification.ANY.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                onExtraCallback[ResponseClassification.CNAME_NODATA.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                onExtraCallback[ResponseClassification.CNAME_NAMEERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CompletionStage<Void> onExtraCallback(onChildViewAdded onchildviewadded, GetKMPrikey getKMPrikey, getMedia getmedia, Executor executor) {
        yzp2 yzp2VarAccess000 = onchildviewadded.onNavigationEvent().access000();
        getmedia.IAuthTabCallback = null;
        getmedia.onNavigationEvent = null;
        JCertTransfer jCertTransferOnWarmupCompleted = onWarmupCompleted(getKMPrikey, onchildviewadded, getmedia.onExtraCallbackWithResult);
        if (jCertTransferOnWarmupCompleted == null) {
            getmedia.IAuthTabCallback = yzp2VarAccess000;
        } else if (jCertTransferOnWarmupCompleted.access000()) {
            getmedia.onNavigationEvent = jCertTransferOnWarmupCompleted;
            getmedia.onExtraCallback = new yzp2(jCertTransferOnWarmupCompleted.asInterface(), 1);
        } else {
            getmedia.onExtraCallbackWithResult = jCertTransferOnWarmupCompleted;
            if (jCertTransferOnWarmupCompleted.getInterfaceDescriptor()) {
                this.onExtraCallback.IAuthTabCallback(jCertTransferOnWarmupCompleted);
            }
            return CompletableFuture.completedFuture(null);
        }
        return onWarmupCompleted(getmedia, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CompletionStage<Void> onNavigationEvent(onChildViewAdded onchildviewadded, GetKMPrikey getKMPrikey, getMedia getmedia, Executor executor) {
        yzp2 yzp2VarAccess000 = onchildviewadded.onNavigationEvent().access000();
        int interfaceDescriptor = onchildviewadded.onNavigationEvent().getInterfaceDescriptor();
        GetKMCert getKMCertOnNavigationEvent = getKMPrikey.onNavigationEvent(yzp2VarAccess000, 48, interfaceDescriptor);
        if (getKMCertOnNavigationEvent == null) {
            JCertTransfer jCertTransferOnWarmupCompleted = JCertTransfer.onWarmupCompleted(yzp2VarAccess000, interfaceDescriptor, 60L);
            getmedia.onExtraCallbackWithResult = jCertTransferOnWarmupCompleted;
            jCertTransferOnWarmupCompleted.onNavigationEvent(9, R.onExtraCallbackWithResult("dnskey.no_rrset", yzp2VarAccess000));
            return CompletableFuture.completedFuture(null);
        }
        JCertTransfer jCertTransferOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult(getKMCertOnNavigationEvent, getmedia.onNavigationEvent, 60L, this.onWarmupCompleted.instant());
        getmedia.onExtraCallbackWithResult = jCertTransferOnExtraCallbackWithResult;
        if (!jCertTransferOnExtraCallbackWithResult.access000()) {
            return CompletableFuture.completedFuture(null);
        }
        this.onExtraCallback.IAuthTabCallback(getmedia.onExtraCallbackWithResult);
        return onWarmupCompleted(getmedia, executor);
    }

    private CompletionStage<GetKMPrikey> IAuthTabCallback(final onChildViewAdded onchildviewadded, final GetKMPrikey getKMPrikey, final Executor executor) {
        CompletionStage<Void> completionStageOnExtraCallback;
        ResponseClassification responseClassificationOnExtraCallbackWithResult = TRANS_Error.onExtraCallbackWithResult(onchildviewadded, getKMPrikey);
        if (responseClassificationOnExtraCallbackWithResult != ResponseClassification.REFERRAL) {
            onWarmupCompleted(getKMPrikey);
        }
        final GetSignCert getSignCert = new GetSignCert();
        switch (AnonymousClass3.onExtraCallback[responseClassificationOnExtraCallbackWithResult.ordinal()]) {
            case 1:
            case 2:
            case 5:
                completionStageOnExtraCallback = onExtraCallback(onchildviewadded, getKMPrikey, getSignCert, executor);
                break;
            case 3:
                completionStageOnExtraCallback = IAuthTabCallback(onchildviewadded, getKMPrikey, getSignCert, executor);
                break;
            case 4:
                completionStageOnExtraCallback = onExtraCallbackWithResult(onchildviewadded, getKMPrikey, getSignCert, executor);
                break;
            case 6:
                completionStageOnExtraCallback = onExtraCallback(onchildviewadded, getKMPrikey, getSignCert, executor).thenCompose(new Function() { // from class: org.xbill.DNS.dnssec.ValidatingResolver$$ExternalSyntheticLambda11
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return GetVeriSignSignedData.onExtraCallback(this.f$0, getKMPrikey, onchildviewadded, getSignCert, executor, (Void) obj);
                    }
                });
                break;
            case 7:
                completionStageOnExtraCallback = onExtraCallback(onchildviewadded, getKMPrikey, getSignCert, executor).thenCompose(new Function() { // from class: org.xbill.DNS.dnssec.ValidatingResolver$$ExternalSyntheticLambda12
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return GetVeriSignSignedData.onExtraCallbackWithResult(this.f$0, getKMPrikey, onchildviewadded, getSignCert, executor, (Void) obj);
                    }
                });
                break;
            default:
                getKMPrikey.onWarmupCompleted(R.onExtraCallbackWithResult("validate.response.unknown", responseClassificationOnExtraCallbackWithResult));
                completionStageOnExtraCallback = CompletableFuture.completedFuture(null);
                break;
        }
        return completionStageOnExtraCallback.thenApply(new Function() { // from class: org.xbill.DNS.dnssec.ValidatingResolver$$ExternalSyntheticLambda13
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.onExtraCallbackWithResult(onchildviewadded, getKMPrikey);
            }
        });
    }

    public static /* synthetic */ CompletionStage onExtraCallback(GetVeriSignSignedData getVeriSignSignedData, GetKMPrikey getKMPrikey, onChildViewAdded onchildviewadded, GetSignCert getSignCert, Executor executor, Void r6) {
        if (getKMPrikey.asInterface() != GetPassword.INSECURE) {
            getKMPrikey.onExtraCallbackWithResult(GetPassword.UNCHECKED, -1);
            return getVeriSignSignedData.IAuthTabCallback(onchildviewadded, getKMPrikey, getSignCert, executor);
        }
        return CompletableFuture.completedFuture(null);
    }

    public static /* synthetic */ CompletionStage onExtraCallbackWithResult(GetVeriSignSignedData getVeriSignSignedData, GetKMPrikey getKMPrikey, onChildViewAdded onchildviewadded, GetSignCert getSignCert, Executor executor, Void r6) {
        if (getKMPrikey.asInterface() != GetPassword.INSECURE) {
            getKMPrikey.onExtraCallbackWithResult(GetPassword.UNCHECKED, -1);
            return getVeriSignSignedData.onExtraCallbackWithResult(onchildviewadded, getKMPrikey, getSignCert, executor);
        }
        return CompletableFuture.completedFuture(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public GetKMPrikey onExtraCallbackWithResult(onChildViewAdded onchildviewadded, GetKMPrikey getKMPrikey) {
        GetPassword getPasswordAsInterface = getKMPrikey.asInterface();
        String strOnExtraCallback = getKMPrikey.onExtraCallback();
        int iOnNavigationEvent = getKMPrikey.onNavigationEvent();
        int i = AnonymousClass3.onNavigationEvent[getPasswordAsInterface.ordinal()];
        if (i != 1) {
            int i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    int iOnExtraCallback = getKMPrikey.onWarmupCompleted().onExtraCallback();
                    if (iOnExtraCallback != 0 && iOnExtraCallback != 3) {
                        i2 = iOnExtraCallback;
                    }
                    getKMPrikey = onExtraCallbackWithResult(onchildviewadded, i2);
                } else if (i != 5) {
                    throw new IllegalArgumentException("unexpected security status");
                }
            }
        } else {
            getKMPrikey.onWarmupCompleted().IAuthTabCallback(10);
        }
        getKMPrikey.onExtraCallbackWithResult(getPasswordAsInterface, iOnNavigationEvent, strOnExtraCallback);
        return getKMPrikey;
    }

    public Duration onExtraCallbackWithResult() {
        return this.IAuthTabCallback.onExtraCallbackWithResult();
    }

    public void IAuthTabCallback(Duration duration) {
        this.IAuthTabCallback.IAuthTabCallback(duration);
    }

    public CompletionStage<onChildViewAdded> onExtraCallback(final onChildViewAdded onchildviewadded, final Executor executor) {
        return onWarmupCompleted(onchildviewadded, executor).thenCompose(new Function() { // from class: org.xbill.DNS.dnssec.ValidatingResolver$$ExternalSyntheticLambda9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return GetVeriSignSignedData.onExtraCallbackWithResult(this.f$0, onchildviewadded, executor, (GetKMPrikey) obj);
            }
        });
    }

    public static /* synthetic */ CompletionStage onExtraCallbackWithResult(final GetVeriSignSignedData getVeriSignSignedData, onChildViewAdded onchildviewadded, Executor executor, GetKMPrikey getKMPrikey) {
        getKMPrikey.onWarmupCompleted().IAuthTabCallbackStub(10);
        if (onchildviewadded.IAuthTabCallback().onExtraCallback(11)) {
            return CompletableFuture.completedFuture(getKMPrikey.IAuthTabCallback());
        }
        onChildViewAdded onchildviewaddedIAuthTabCallback = getKMPrikey.IAuthTabCallback();
        if (onchildviewadded.onNavigationEvent().extraCallback() == 46 && onchildviewaddedIAuthTabCallback.IAuthTabCallback().onExtraCallback() == 0 && !onchildviewaddedIAuthTabCallback.onNavigationEvent(1).isEmpty()) {
            onchildviewaddedIAuthTabCallback.IAuthTabCallback().IAuthTabCallbackStub(10);
            return CompletableFuture.completedFuture(onchildviewaddedIAuthTabCallback);
        }
        return getVeriSignSignedData.IAuthTabCallback(onchildviewadded, getKMPrikey, executor).thenApply(new Function() { // from class: org.xbill.DNS.dnssec.ValidatingResolver$$ExternalSyntheticLambda6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return GetVeriSignSignedData.onWarmupCompleted(this.f$0, (GetKMPrikey) obj);
            }
        });
    }

    public static /* synthetic */ onChildViewAdded onWarmupCompleted(GetVeriSignSignedData getVeriSignSignedData, GetKMPrikey getKMPrikey) {
        onChildViewAdded onchildviewaddedIAuthTabCallback = getKMPrikey.IAuthTabCallback();
        String strOnExtraCallback = getKMPrikey.onExtraCallback();
        if (strOnExtraCallback != null) {
            getVeriSignSignedData.onWarmupCompleted(getKMPrikey, onchildviewaddedIAuthTabCallback);
            if (getVeriSignSignedData.onNavigationEvent) {
                getVeriSignSignedData.onWarmupCompleted(onchildviewaddedIAuthTabCallback, strOnExtraCallback);
            }
        }
        return onchildviewaddedIAuthTabCallback;
    }

    private void onWarmupCompleted(GetKMPrikey getKMPrikey, onChildViewAdded onchildviewadded) {
        fby10 fby10Var;
        if (getKMPrikey.onNavigationEvent() < 0) {
            return;
        }
        fby10 fby10VarOnExtraCallback = onchildviewadded.onExtraCallback();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new isBeforeFirst(getKMPrikey.onNavigationEvent(), getKMPrikey.onExtraCallback()));
        if (fby10VarOnExtraCallback != null) {
            arrayList.addAll((Collection) fby10VarOnExtraCallback.onExtraCallback().stream().filter(new Predicate() { // from class: org.xbill.DNS.dnssec.ValidatingResolver$$ExternalSyntheticLambda10
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return GetVeriSignSignedData.onExtraCallback((isLast) obj);
                }
            }).collect(Collectors.toList()));
            fby10Var = new fby10(fby10VarOnExtraCallback.IAuthTabCallbackStub(), fby10VarOnExtraCallback.onExtraCallbackWithResult(), fby10VarOnExtraCallback.onTransact(), fby10VarOnExtraCallback.onNavigationEvent(), arrayList);
            onchildviewadded.IAuthTabCallback(onchildviewadded.onExtraCallback(), 3);
        } else {
            fby10Var = new fby10(1280, 0, 0, 0, arrayList);
        }
        onchildviewadded.onNavigationEvent(fby10Var, 3);
    }

    public static /* synthetic */ boolean onExtraCallback(isLast islast) {
        return islast.onExtraCallbackWithResult() != 15;
    }

    private void onWarmupCompleted(onChildViewAdded onchildviewadded, String str) {
        int length = (str.length() / GF2Field.MASK) + 1;
        String[] strArr = new String[length];
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            strArr[i] = str.substring(i * GF2Field.MASK, Math.min(i2 * GF2Field.MASK, str.length()));
            i = i2;
        }
        onchildviewadded.onNavigationEvent(new lt47(yzp2.IAuthTabCallback, 65280, 0L, Arrays.asList(strArr)), 3);
    }

    private static GetKMPrikey onExtraCallbackWithResult(onChildViewAdded onchildviewadded, int i) {
        GetKMPrikey getKMPrikey = new GetKMPrikey(onchildviewadded.IAuthTabCallback().onNavigationEvent(), onchildviewadded.onNavigationEvent());
        setNotificationUri setnotificationuriOnWarmupCompleted = getKMPrikey.onWarmupCompleted();
        setnotificationuriOnWarmupCompleted.onTransact(i);
        setnotificationuriOnWarmupCompleted.IAuthTabCallback(0);
        return getKMPrikey;
    }
}
