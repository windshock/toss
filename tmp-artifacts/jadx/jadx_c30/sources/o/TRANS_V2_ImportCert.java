package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import lombok.NonNull;
import o.TRANS_V2_ImportCert;
import o.TRANS_V2_IsReceiverConnected;
import o.dy9;
import o.lt38;
import o.onChildViewAdded;
import o.yzp2;
import org.xbill.DNS.NameTooLongException;
import org.xbill.DNS.RRset;
import org.xbill.DNS.Rcode;
import org.xbill.DNS.Record;
import org.xbill.DNS.Resolver;
import org.xbill.DNS.WireParseException;
import org.xbill.DNS.lookup.RedirectLoopException;
import org.xbill.DNS.lookup.RedirectOverflowException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TRANS_V2_ImportCert {
    private static final AppSetIdAndScope1 onWarmupCompleted = ea10.onWarmupCompleted(TRANS_V2_ImportCert.class);
    private final TRANS_GenerateCertNum IAuthTabCallback;
    private final int asBinder;
    private final Map<Integer, dy9> onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final Executor onNavigationEvent;
    private final Resolver onTransact;

    public static /* synthetic */ dy9 onWarmupCompleted(dy9 dy9Var) {
        return dy9Var;
    }

    public static class onWarmupCompleted {
        private TRANS_ExportCert IAuthTabCallback;
        private Resolver IAuthTabCallbackDefault;
        private int IAuthTabCallbackStub;
        private List<yzp2> asBinder;
        private List<dy9> onExtraCallback;
        private Executor onExtraCallbackWithResult;
        private boolean onNavigationEvent;
        private int onTransact;
        private TRANS_GenerateCertNum onWarmupCompleted;

        public String toString() {
            return "LookupSession.LookupSessionBuilder(resolver=" + this.IAuthTabCallbackDefault + ", maxRedirects=" + this.IAuthTabCallbackStub + ", ndots=" + this.onTransact + ", searchPath=" + this.asBinder + ", cycleResults=" + this.onNavigationEvent + ", caches=" + this.onExtraCallback + ", hostsFileParser=" + this.IAuthTabCallback + ", executor=" + this.onExtraCallbackWithResult + ", irrelevantRecordMode=" + this.onWarmupCompleted + ")";
        }

        public onWarmupCompleted onNavigationEvent(@NonNull dy9 dy9Var) {
            if (dy9Var == null) {
                throw new NullPointerException("cache is marked non-null but is null");
            }
            if (this.onExtraCallback == null) {
                this.onExtraCallback = new ArrayList(1);
            }
            Iterator<dy9> it = this.onExtraCallback.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dy9 next = it.next();
                if (next.onExtraCallbackWithResult() == dy9Var.onExtraCallbackWithResult()) {
                    this.onExtraCallback.remove(next);
                    break;
                }
            }
            this.onExtraCallback.add(dy9Var);
            return this;
        }

        public static /* synthetic */ yzp2 IAuthTabCallback(yzp2 yzp2Var) {
            try {
                return yzp2.onWarmupCompleted(yzp2Var, yzp2.IAuthTabCallback);
            } catch (NameTooLongException unused) {
                throw new IllegalArgumentException("Search path name too long");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static yzp2 onExtraCallback(yzp2 yzp2Var, yzp2 yzp2Var2) {
        try {
            return yzp2.onWarmupCompleted(yzp2Var, yzp2Var2);
        } catch (NameTooLongException unused) {
            return null;
        }
    }

    private CompletionStage<TRANS_V2_IsReceiverConnected> onWarmupCompleted(final Iterator<yzp2> it, final int i, final int i2) {
        final Record recordIAuthTabCallback = Record.IAuthTabCallback(it.next(), i, i2);
        return onWarmupCompleted(recordIAuthTabCallback, (List<yzp2>) null).thenCompose(new Function() { // from class: org.xbill.DNS.lookup.LookupSession$$ExternalSyntheticLambda10
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.onExtraCallbackWithResult((TRANS_V2_IsReceiverConnected) obj, recordIAuthTabCallback);
            }
        }).handle(new BiFunction() { // from class: org.xbill.DNS.lookup.LookupSession$$ExternalSyntheticLambda11
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return TRANS_V2_ImportCert.onNavigationEvent(this.f$0, it, i, i2, (TRANS_V2_IsReceiverConnected) obj, (Throwable) obj2);
            }
        }).thenCompose(Function.identity());
    }

    public static /* synthetic */ CompletionStage onNavigationEvent(TRANS_V2_ImportCert tRANS_V2_ImportCert, Iterator it, int i, int i2, TRANS_V2_IsReceiverConnected tRANS_V2_IsReceiverConnected, Throwable th) {
        Throwable cause = th == null ? null : th.getCause();
        if ((cause instanceof TRANS_V2_Finalize) || (cause instanceof TRANS_V2_GenerateCertNum)) {
            if (it.hasNext()) {
                return tRANS_V2_ImportCert.onWarmupCompleted(it, i, i2);
            }
            return tRANS_V2_ImportCert.onWarmupCompleted((TRANS_V2_ImportCert) cause);
        }
        if (cause != null) {
            return tRANS_V2_ImportCert.onWarmupCompleted((TRANS_V2_ImportCert) cause);
        }
        return CompletableFuture.completedFuture(tRANS_V2_IsReceiverConnected);
    }

    private CompletionStage<TRANS_V2_IsReceiverConnected> onWarmupCompleted(final Record record, final List<yzp2> list) {
        return (CompletionStage) Optional.ofNullable(this.onExtraCallback.get(Integer.valueOf(record.getInterfaceDescriptor()))).map(new Function() { // from class: org.xbill.DNS.lookup.LookupSession$$ExternalSyntheticLambda4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return TRANS_V2_ImportCert.onWarmupCompleted(record, (dy9) obj);
            }
        }).map(new Function() { // from class: org.xbill.DNS.lookup.LookupSession$$ExternalSyntheticLambda5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.onExtraCallbackWithResult((lt38) obj, record, (List<yzp2>) list);
            }
        }).orElseGet(new Supplier() { // from class: org.xbill.DNS.lookup.LookupSession$$ExternalSyntheticLambda6
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f$0.onExtraCallback(record, (List<yzp2>) list);
            }
        });
    }

    public static /* synthetic */ lt38 onWarmupCompleted(Record record, dy9 dy9Var) {
        new Object[]{record.access000(), lt54.onNavigationEvent(record.extraCallback()), ryzbycx.onWarmupCompleted(record.getInterfaceDescriptor())};
        return dy9Var.onExtraCallbackWithResult(record.access000(), record.extraCallback(), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CompletionStage<TRANS_V2_IsReceiverConnected> onExtraCallback(final Record record, final List<yzp2> list) {
        final onChildViewAdded onchildviewaddedIAuthTabCallback = onChildViewAdded.IAuthTabCallback(record);
        new Object[]{this.onTransact, record.access000(), lt54.onNavigationEvent(record.extraCallback()), ryzbycx.onWarmupCompleted(record.getInterfaceDescriptor())};
        return this.onTransact.onExtraCallback(onchildviewaddedIAuthTabCallback, this.onNavigationEvent).thenCompose(new Function() { // from class: org.xbill.DNS.lookup.LookupSession$$ExternalSyntheticLambda12
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return TRANS_V2_ImportCert.onExtraCallbackWithResult(this.f$0, onchildviewaddedIAuthTabCallback, record, (onChildViewAdded) obj);
            }
        }).thenApply(new Function() { // from class: org.xbill.DNS.lookup.LookupSession$$ExternalSyntheticLambda13
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.onExtraCallback((onChildViewAdded) obj);
            }
        }).thenApply(new Function() { // from class: org.xbill.DNS.lookup.LookupSession$$ExternalSyntheticLambda14
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return TRANS_V2_ImportCert.onNavigationEvent((onChildViewAdded) obj, (List<yzp2>) list, record);
            }
        });
    }

    public static /* synthetic */ CompletionStage onExtraCallbackWithResult(TRANS_V2_ImportCert tRANS_V2_ImportCert, onChildViewAdded onchildviewadded, Record record, onChildViewAdded onchildviewadded2) {
        try {
            onChildViewAdded onchildviewaddedOnWarmupCompleted = onchildviewadded2.onWarmupCompleted(onchildviewadded, tRANS_V2_ImportCert.IAuthTabCallback == TRANS_GenerateCertNum.THROW);
            new Object[]{record.access000(), lt54.onNavigationEvent(record.extraCallback()), ryzbycx.onWarmupCompleted(record.getInterfaceDescriptor()), onchildviewadded2, onchildviewaddedOnWarmupCompleted};
            if (onchildviewaddedOnWarmupCompleted == null) {
                return tRANS_V2_ImportCert.onWarmupCompleted((TRANS_V2_ImportCert) new TRANS_Init("Failed to normalize message"));
            }
            return CompletableFuture.completedFuture(onchildviewaddedOnWarmupCompleted);
        } catch (WireParseException e) {
            return tRANS_V2_ImportCert.onWarmupCompleted((TRANS_V2_ImportCert) new TRANS_V2_Init("Message normalization failed, refusing to return it", (Throwable) e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public onChildViewAdded onExtraCallback(final onChildViewAdded onchildviewadded) {
        for (RRset rRset : onchildviewadded.onNavigationEvent(1)) {
            if (rRset.onExtraCallback() == 5 || rRset.onExtraCallback() == 39) {
                if (rRset.access100() != 1) {
                    throw new TRANS_Init("Multiple CNAME RRs not allowed, see RFC 1034 3.6.2");
                }
            }
        }
        Optional.ofNullable(this.onExtraCallback.get(Integer.valueOf(onchildviewadded.onNavigationEvent().getInterfaceDescriptor()))).ifPresent(new Consumer() { // from class: org.xbill.DNS.lookup.LookupSession$$ExternalSyntheticLambda7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((dy9) obj).IAuthTabCallback(onchildviewadded);
            }
        });
        return onchildviewadded;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CompletionStage<TRANS_V2_IsReceiverConnected> onExtraCallbackWithResult(lt38 lt38Var, Record record, List<yzp2> list) {
        if (lt38Var.asInterface()) {
            return onWarmupCompleted((TRANS_V2_ImportCert) new TRANS_V2_Finalize(record.access000(), record.extraCallback()));
        }
        if (lt38Var.onTransact()) {
            return onWarmupCompleted((TRANS_V2_ImportCert) new TRANS_V2_GenerateCertNum(record.access000(), record.extraCallback()));
        }
        if (lt38Var.onExtraCallbackWithResult()) {
            return CompletableFuture.completedFuture(new TRANS_V2_IsReceiverConnected(Collections.singletonList(lt38Var.onExtraCallback()), list));
        }
        if (lt38Var.asBinder()) {
            return CompletableFuture.completedFuture(new TRANS_V2_IsReceiverConnected(Collections.singletonList(lt38Var.onWarmupCompleted()), list));
        }
        if (lt38Var.IAuthTabCallbackDefault()) {
            return CompletableFuture.completedFuture(new TRANS_V2_IsReceiverConnected((List) lt38Var.IAuthTabCallback().stream().flatMap(new Function() { // from class: org.xbill.DNS.lookup.LookupSession$$ExternalSyntheticLambda2
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((RRset) obj).onWarmupCompleted(this.f$0.onExtraCallbackWithResult).stream();
                }
            }).collect(Collectors.toList()), list));
        }
        return null;
    }

    private <T extends Throwable, R> CompletionStage<R> onWarmupCompleted(T t) {
        CompletableFuture completableFuture = new CompletableFuture();
        completableFuture.completeExceptionally(t);
        return completableFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CompletionStage<TRANS_V2_IsReceiverConnected> onExtraCallbackWithResult(TRANS_V2_IsReceiverConnected tRANS_V2_IsReceiverConnected, Record record) {
        return onExtraCallbackWithResult(tRANS_V2_IsReceiverConnected, record, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CompletionStage<TRANS_V2_IsReceiverConnected> onExtraCallbackWithResult(TRANS_V2_IsReceiverConnected tRANS_V2_IsReceiverConnected, Record record, int i) {
        if (i > this.asBinder) {
            throw new RedirectOverflowException(this.asBinder);
        }
        List<Record> listOnWarmupCompleted = tRANS_V2_IsReceiverConnected.onWarmupCompleted();
        if (!listOnWarmupCompleted.isEmpty() && record.extraCallback() != listOnWarmupCompleted.get(0).extraCallback() && (listOnWarmupCompleted.get(0).extraCallback() == 5 || listOnWarmupCompleted.get(0).extraCallback() == 39)) {
            return onExtraCallback(tRANS_V2_IsReceiverConnected, record, i);
        }
        return CompletableFuture.completedFuture(tRANS_V2_IsReceiverConnected);
    }

    private CompletionStage<TRANS_V2_IsReceiverConnected> onExtraCallback(TRANS_V2_IsReceiverConnected tRANS_V2_IsReceiverConnected, Record record, final int i) {
        ArrayList arrayList = new ArrayList(tRANS_V2_IsReceiverConnected.onExtraCallback());
        ArrayList arrayList2 = new ArrayList();
        yzp2 yzp2VarAccess000 = record.access000();
        Iterator<Record> it = tRANS_V2_IsReceiverConnected.onWarmupCompleted().iterator();
        while (it.hasNext()) {
            jcdj jcdjVar = (Record) it.next();
            if (arrayList.contains(yzp2VarAccess000)) {
                return onWarmupCompleted((TRANS_V2_ImportCert) new RedirectLoopException(this.asBinder));
            }
            if (i >= this.asBinder) {
                throw new RedirectOverflowException(this.asBinder);
            }
            if (jcdjVar.getInterfaceDescriptor() == record.getInterfaceDescriptor()) {
                if (jcdjVar.extraCallback() == 5 && yzp2VarAccess000.equals(jcdjVar.access000())) {
                    arrayList.add(yzp2VarAccess000);
                    i++;
                    yzp2VarAccess000 = jcdjVar.onNavigationEvent();
                } else if (jcdjVar.extraCallback() == 39 && yzp2VarAccess000.IAuthTabCallback(jcdjVar.access000())) {
                    arrayList.add(yzp2VarAccess000);
                    i++;
                    try {
                        yzp2VarAccess000 = yzp2VarAccess000.onExtraCallbackWithResult((uhzb) jcdjVar);
                    } catch (NameTooLongException e) {
                        throw new TRANS_Init("Cannot derive DNAME from " + jcdjVar + " for " + yzp2VarAccess000, e);
                    }
                } else if (jcdjVar.extraCallback() == record.extraCallback() && yzp2VarAccess000.equals(jcdjVar.access000())) {
                    arrayList2.add(jcdjVar);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            return CompletableFuture.completedFuture(new TRANS_V2_IsReceiverConnected(arrayList2, arrayList));
        }
        if (arrayList.contains(yzp2VarAccess000)) {
            return onWarmupCompleted((TRANS_V2_ImportCert) new RedirectLoopException(this.asBinder));
        }
        if (i >= this.asBinder) {
            throw new RedirectOverflowException(this.asBinder);
        }
        final Record recordIAuthTabCallback = Record.IAuthTabCallback(yzp2VarAccess000, record.extraCallback(), record.getInterfaceDescriptor());
        return onWarmupCompleted(recordIAuthTabCallback, arrayList).thenCompose(new Function() { // from class: org.xbill.DNS.lookup.LookupSession$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.onExtraCallbackWithResult((TRANS_V2_IsReceiverConnected) obj, recordIAuthTabCallback, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TRANS_V2_IsReceiverConnected onNavigationEvent(onChildViewAdded onchildviewadded, List<yzp2> list, Record record) {
        int iIAuthTabCallbackStub = onchildviewadded.IAuthTabCallbackStub();
        List listOnWarmupCompleted = onchildviewadded.onWarmupCompleted(1);
        if (!listOnWarmupCompleted.isEmpty() || iIAuthTabCallbackStub == 0) {
            return new TRANS_V2_IsReceiverConnected(listOnWarmupCompleted, list);
        }
        if (iIAuthTabCallbackStub != 2) {
            if (iIAuthTabCallbackStub == 3) {
                throw new TRANS_V2_Finalize(record.access000(), record.extraCallback());
            }
            if (iIAuthTabCallbackStub == 8) {
                throw new TRANS_V2_GenerateCertNum(record.access000(), record.extraCallback());
            }
            throw new TRANS_V2_Init(String.format("Unknown non-success error code %s", Rcode.onWarmupCompleted(iIAuthTabCallbackStub)));
        }
        if (onchildviewadded.onExtraCallback() != null) {
            List listOnNavigationEvent = onchildviewadded.onExtraCallback().onNavigationEvent(15);
            if (!listOnNavigationEvent.isEmpty()) {
                throw new TRNAS_Password_GenOut(record.access000(), record.extraCallback(), (isBeforeFirst) listOnNavigationEvent.get(0));
            }
        }
        throw new TRNAS_Password_GenOut(record.access000(), record.extraCallback());
    }
}
