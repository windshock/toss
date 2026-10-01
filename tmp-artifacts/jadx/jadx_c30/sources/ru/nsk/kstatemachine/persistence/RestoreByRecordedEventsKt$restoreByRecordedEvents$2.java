package ru.nsk.kstatemachine.persistence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import net.sf.scuba.smartcards.BuildConfig;
import o.access13800;
import o.access14300;
import o.certGetPublicKeyAlgorithm;
import o.certInit;
import o.checkMovementLicense;
import o.getModelId;
import o.getVIDRandom;
import o.logicChangeCertPW;
import o.logicDisuseCert;
import o.logicDisuseCertRp;
import o.logicDisuseCertRr;
import o.logicIssueCertMakePOPOSigningInputMsg;
import o.logicVerifySignature;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RestoreByRecordedEventsKt$restoreByRecordedEvents$2 extends SuspendLambda implements Function1<access13800<? super RestorationResult>, Object> {
    final /* synthetic */ boolean $disableStructureHashCodeCheck;
    final /* synthetic */ boolean $muteListeners;
    final /* synthetic */ RecordedEvents $recordedEvents;
    final /* synthetic */ logicDisuseCertRr $this_restoreByRecordedEvents;
    final /* synthetic */ RestorationResultValidator $validator;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RestoreByRecordedEventsKt$restoreByRecordedEvents$2(logicDisuseCertRr logicdisusecertrr, boolean z, RecordedEvents recordedEvents, boolean z2, RestorationResultValidator restorationResultValidator, access13800<? super RestoreByRecordedEventsKt$restoreByRecordedEvents$2> access13800Var) {
        super(1, access13800Var);
        this.$this_restoreByRecordedEvents = logicdisusecertrr;
        this.$disableStructureHashCodeCheck = z;
        this.$recordedEvents = recordedEvents;
        this.$muteListeners = z2;
        this.$validator = restorationResultValidator;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public final Object invoke(access13800<? super RestorationResult> access13800Var) {
        return create(access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    public final access13800<Unit> create(access13800<?> access13800Var) {
        return new RestoreByRecordedEventsKt$restoreByRecordedEvents$2(this.$this_restoreByRecordedEvents, this.$disableStructureHashCodeCheck, this.$recordedEvents, this.$muteListeners, this.$validator, access13800Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:100|(1:164)|101|102|162|103|(15:106|157|107|108|118|(0)(0)|122|(1:124)|127|128|129|130|159|55|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x034d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0351, code lost:
    
        r16 = r3;
        r3 = r10;
        r10 = r12;
        r12 = r11;
        r11 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:124:0x036f, B:127:0x03af], limit reached: 159 */
    /* JADX WARN: Path cross not found for [B:127:0x03af, B:124:0x036f], limit reached: 159 */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x036f A[Catch: all -> 0x00e5, TryCatch #2 {all -> 0x00e5, blocks: (B:118:0x0362, B:122:0x036b, B:124:0x036f, B:126:0x0375, B:128:0x03b1, B:74:0x0213, B:75:0x021a, B:98:0x02f5, B:17:0x0083, B:20:0x00ac, B:23:0x00d4, B:26:0x00e0, B:53:0x018c), top: B:155:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03cf A[Catch: all -> 0x03cc, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x03cc, blocks: (B:55:0x019b, B:57:0x01a1, B:59:0x01a9, B:60:0x01ac, B:63:0x01c3, B:65:0x01d1, B:68:0x01d9, B:70:0x01f9, B:76:0x021b, B:77:0x0256, B:78:0x0257, B:84:0x028b, B:86:0x0296, B:91:0x02bd, B:93:0x02c2, B:116:0x0357, B:133:0x03cf), top: B:159:0x019b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a1 A[Catch: all -> 0x03cc, TryCatch #4 {all -> 0x03cc, blocks: (B:55:0x019b, B:57:0x01a1, B:59:0x01a9, B:60:0x01ac, B:63:0x01c3, B:65:0x01d1, B:68:0x01d9, B:70:0x01f9, B:76:0x021b, B:77:0x0256, B:78:0x0257, B:84:0x028b, B:86:0x0296, B:91:0x02bd, B:93:0x02c2, B:116:0x0357, B:133:0x03cf), top: B:159:0x019b }] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r17v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x0339 -> B:157:0x033f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0357 -> B:108:0x0345). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01d9 -> B:130:0x03c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0308 -> B:130:0x03c0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        getModelId getmodelid;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        logicDisuseCertRr logicdisusecertrr;
        int i;
        char c;
        char c2;
        char c3;
        ArrayList arrayList3;
        Throwable th2;
        Object obj2;
        ArrayList arrayList4;
        getModelId getmodelid2;
        logicDisuseCertRr logicdisusecertrr2;
        Iterator it2;
        Record record;
        List list;
        ArrayList arrayList5;
        int i2;
        List arrayList6;
        int i3;
        logicDisuseCertRr logicdisusecertrr3;
        ArrayList arrayList7;
        ArrayList arrayList8;
        logicDisuseCertRr logicdisusecertrr4;
        Iterator it3;
        Record record2;
        List list2;
        int i4;
        Object obj3;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        char c4;
        List list3;
        getModelId getmodelid3;
        Object objOnNavigationEvent;
        ArrayList arrayList12;
        logicChangeCertPW logicchangecertpw;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = this.label;
        int i6 = 1;
        Object obj4 = null;
        try {
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                logicDisuseCert.onExtraCallbackWithResult(this.$this_restoreByRecordedEvents);
                if (this.$this_restoreByRecordedEvents.onActivityLayout()) {
                    boolean zCE_ = this.$this_restoreByRecordedEvents.cE_();
                    logicDisuseCertRr logicdisusecertrr5 = this.$this_restoreByRecordedEvents;
                    if (zCE_) {
                        throw new IllegalStateException((logicdisusecertrr5 + " has already processed events, restoreByRecordedEvents() operation only makes sense on initially clear " + Reflection.getOrCreateKotlinClass(logicDisuseCertRr.class).getSimpleName() + ", please call it before processing any other events (or even before start - optionally)").toString());
                    }
                }
                if (!this.$disableStructureHashCodeCheck) {
                    boolean z = logicVerifySignature.onExtraCallback(this.$this_restoreByRecordedEvents) == this.$recordedEvents.IAuthTabCallback();
                    logicDisuseCertRr logicdisusecertrr6 = this.$this_restoreByRecordedEvents;
                    if (!z) {
                        throw new IllegalStateException((logicdisusecertrr6 + " structure seems to be different from recorded original one, you can disable this error by the disableStructureHashCodeCheck argument if you are sure that it is correct").toString());
                    }
                }
                Intrinsics.checkNotNull(this.$this_restoreByRecordedEvents, BuildConfig.FLAVOR);
                ArrayList arrayList13 = new ArrayList();
                arrayList = new ArrayList();
                getModelId getmodelidExtraCallback = this.$muteListeners ? this.$this_restoreByRecordedEvents.extraCallback() : certInit.onExtraCallbackWithResult;
                RecordedEvents recordedEvents = this.$recordedEvents;
                logicDisuseCertRr logicdisusecertrr7 = this.$this_restoreByRecordedEvents;
                it = recordedEvents.onNavigationEvent().iterator();
                getmodelid = getmodelidExtraCallback;
                arrayList2 = arrayList13;
                logicdisusecertrr = logicdisusecertrr7;
                i = 0;
                if (!it.hasNext()) {
                }
            } else {
                if (i5 == 1) {
                    getmodelid3 = (getModelId) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    throw new IllegalStateException("The machine should not be running here. Internal error. Never get here");
                }
                if (i5 == 2) {
                    i4 = this.I$0;
                    list3 = (List) this.L$6;
                    record2 = (Record) this.L$5;
                    it3 = (Iterator) this.L$4;
                    logicdisusecertrr4 = (logicDisuseCertRr) this.L$3;
                    getmodelid2 = (getModelId) this.L$2;
                    ?? r13 = (List) this.L$1;
                    ?? r15 = (List) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    c4 = 2;
                    arrayList11 = r13;
                    arrayList10 = r15;
                    arrayList6 = list3;
                    c2 = c4;
                    arrayList = arrayList11;
                    arrayList9 = arrayList10;
                    it = it3;
                    record = record2;
                    arrayList2 = arrayList9;
                    logicDisuseCertRr logicdisusecertrr8 = logicdisusecertrr4;
                    i3 = i4;
                    logicdisusecertrr3 = logicdisusecertrr8;
                    Result.Companion companion = Result.Companion;
                    arrayList2.add(new RestoredEventResult(record, Result.constructor-impl(logicChangeCertPW.PROCESSED), arrayList6));
                    obj3 = objOnWarmupCompleted;
                    getmodelid = getmodelid2;
                    c3 = 4;
                    c = 3;
                    logicdisusecertrr = logicdisusecertrr3;
                    i = i3;
                    objOnWarmupCompleted = obj3;
                    i6 = 1;
                    obj4 = null;
                    if (!it.hasNext()) {
                    }
                } else if (i5 == 3) {
                    i4 = this.I$0;
                    list2 = (List) this.L$6;
                    record2 = (Record) this.L$5;
                    it3 = (Iterator) this.L$4;
                    logicdisusecertrr4 = (logicDisuseCertRr) this.L$3;
                    getmodelid2 = (getModelId) this.L$2;
                    ?? r132 = (List) this.L$1;
                    ?? r152 = (List) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    c2 = 2;
                    arrayList8 = r132;
                    arrayList7 = r152;
                    arrayList6 = list2;
                    arrayList = arrayList8;
                    arrayList9 = arrayList7;
                    it = it3;
                    record = record2;
                    arrayList2 = arrayList9;
                    logicDisuseCertRr logicdisusecertrr82 = logicdisusecertrr4;
                    i3 = i4;
                    logicdisusecertrr3 = logicdisusecertrr82;
                    Result.Companion companion2 = Result.Companion;
                    arrayList2.add(new RestoredEventResult(record, Result.constructor-impl(logicChangeCertPW.PROCESSED), arrayList6));
                    obj3 = objOnWarmupCompleted;
                    getmodelid = getmodelid2;
                    c3 = 4;
                    c = 3;
                    logicdisusecertrr = logicdisusecertrr3;
                    i = i3;
                    objOnWarmupCompleted = obj3;
                    i6 = 1;
                    obj4 = null;
                    if (!it.hasNext()) {
                    }
                } else if (i5 == 4) {
                    i2 = this.I$0;
                    list = (List) this.L$6;
                    record = (Record) this.L$5;
                    it2 = (Iterator) this.L$4;
                    logicdisusecertrr2 = (logicDisuseCertRr) this.L$3;
                    getmodelid2 = (getModelId) this.L$2;
                    ?? r153 = (List) this.L$1;
                    ?? r3 = (List) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    c2 = 2;
                    arrayList5 = r3;
                    arrayList4 = r153;
                    arrayList6 = list;
                    arrayList2 = arrayList5;
                    arrayList = arrayList4;
                    Iterator it4 = it2;
                    i3 = i2;
                    logicdisusecertrr3 = logicdisusecertrr2;
                    it = it4;
                    Result.Companion companion22 = Result.Companion;
                    arrayList2.add(new RestoredEventResult(record, Result.constructor-impl(logicChangeCertPW.PROCESSED), arrayList6));
                    obj3 = objOnWarmupCompleted;
                    getmodelid = getmodelid2;
                    c3 = 4;
                    c = 3;
                    logicdisusecertrr = logicdisusecertrr3;
                    i = i3;
                    objOnWarmupCompleted = obj3;
                    i6 = 1;
                    obj4 = null;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = this.I$0;
                    List list4 = (List) this.L$6;
                    Record record3 = (Record) this.L$5;
                    it = (Iterator) this.L$4;
                    logicdisusecertrr = (logicDisuseCertRr) this.L$3;
                    getmodelid = (getModelId) this.L$2;
                    ?? r16 = (List) this.L$1;
                    ?? r17 = (List) this.L$0;
                    try {
                        ResultKt.onNavigationEvent(obj);
                        objOnNavigationEvent = obj;
                        c = 3;
                        c2 = 2;
                        arrayList3 = r17;
                        c3 = 4;
                        r16 = r16;
                    } catch (Throwable th3) {
                        th2 = th3;
                        c = 3;
                        c2 = 2;
                        arrayList3 = r17;
                        c3 = 4;
                        Result.Companion companion3 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
                        arrayList12 = r16;
                        ArrayList arrayList14 = arrayList3;
                        logicDisuseCertRr logicdisusecertrr9 = logicdisusecertrr;
                        getModelId getmodelid4 = getmodelid;
                        arrayList = arrayList12;
                        logicchangecertpw = (logicChangeCertPW) (Result.onExtraCallback(obj2) ? obj4 : obj2);
                        if (logicchangecertpw != null) {
                        }
                        obj3 = objOnWarmupCompleted;
                        arrayList14.add(new RestoredEventResult(record3, obj2, list4));
                        i = i7;
                        getmodelid = getmodelid4;
                        arrayList2 = arrayList14;
                        logicdisusecertrr = logicdisusecertrr9;
                        objOnWarmupCompleted = obj3;
                        i6 = 1;
                        obj4 = null;
                        if (!it.hasNext()) {
                        }
                    }
                    try {
                        try {
                        } catch (Throwable th4) {
                            th2 = th4;
                            Result.Companion companion32 = Result.Companion;
                            obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
                            arrayList12 = r16;
                            ArrayList arrayList142 = arrayList3;
                            logicDisuseCertRr logicdisusecertrr92 = logicdisusecertrr;
                            getModelId getmodelid42 = getmodelid;
                            arrayList = arrayList12;
                            logicchangecertpw = (logicChangeCertPW) (Result.onExtraCallback(obj2) ? obj4 : obj2);
                            if (logicchangecertpw != null) {
                            }
                            obj3 = objOnWarmupCompleted;
                            arrayList142.add(new RestoredEventResult(record3, obj2, list4));
                            i = i7;
                            getmodelid = getmodelid42;
                            arrayList2 = arrayList142;
                            logicdisusecertrr = logicdisusecertrr92;
                            objOnWarmupCompleted = obj3;
                            i6 = 1;
                            obj4 = null;
                            if (!it.hasNext()) {
                            }
                        }
                        obj2 = Result.constructor-impl((logicChangeCertPW) objOnNavigationEvent);
                        arrayList12 = r16;
                        ArrayList arrayList1422 = arrayList3;
                        logicDisuseCertRr logicdisusecertrr922 = logicdisusecertrr;
                        getModelId getmodelid422 = getmodelid;
                        arrayList = arrayList12;
                        logicchangecertpw = (logicChangeCertPW) (Result.onExtraCallback(obj2) ? obj4 : obj2);
                        if (logicchangecertpw != null || logicchangecertpw == record3.onNavigationEvent()) {
                            obj3 = objOnWarmupCompleted;
                        } else {
                            checkMovementLicense checkmovementlicense = checkMovementLicense.ProcessingResultNotMatch;
                            logicChangeCertPW logicchangecertpwOnNavigationEvent = record3.onNavigationEvent();
                            StringBuilder sb = new StringBuilder();
                            obj3 = objOnWarmupCompleted;
                            sb.append("Recorded (");
                            sb.append(logicchangecertpwOnNavigationEvent);
                            sb.append(") and actual (");
                            sb.append(logicchangecertpw);
                            sb.append(") processing results does not match");
                            list4.add(new RestorationWarningException(checkmovementlicense, sb.toString(), null, 4, null));
                        }
                        arrayList1422.add(new RestoredEventResult(record3, obj2, list4));
                        i = i7;
                        getmodelid = getmodelid422;
                        arrayList2 = arrayList1422;
                        logicdisusecertrr = logicdisusecertrr922;
                        if (!it.hasNext()) {
                            Object next = it.next();
                            i3 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            record = (Record) next;
                            arrayList6 = new ArrayList();
                            logicIssueCertMakePOPOSigningInputMsg logicissuecertmakepoposigninginputmsgIAuthTabCallback = record.IAuthTabCallback();
                            certGetPublicKeyAlgorithm certgetpublickeyalgorithmOnExtraCallbackWithResult = logicissuecertmakepoposigninginputmsgIAuthTabCallback.onExtraCallbackWithResult();
                            Object objOnExtraCallback = logicissuecertmakepoposigninginputmsgIAuthTabCallback.onExtraCallback();
                            if (certgetpublickeyalgorithmOnExtraCallbackWithResult instanceof certGetPublicKeyAlgorithm) {
                                certGetPublicKeyAlgorithm.onExtraCallbackWithResult.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = certgetpublickeyalgorithmOnExtraCallbackWithResult.onExtraCallback();
                                if (Intrinsics.areEqual(onextracallbackwithresultOnExtraCallback, certGetPublicKeyAlgorithm.onExtraCallbackWithResult.onWarmupCompleted.onExtraCallback)) {
                                    if (!logicdisusecertrr.onActivityLayout()) {
                                        this.L$0 = arrayList2;
                                        this.L$1 = arrayList;
                                        this.L$2 = getmodelid;
                                        this.L$3 = logicdisusecertrr;
                                        this.L$4 = it;
                                        this.L$5 = record;
                                        this.L$6 = arrayList6;
                                        this.I$0 = i3;
                                        c4 = 2;
                                        this.label = 2;
                                        if (logicdisusecertrr.onExtraCallback(objOnExtraCallback, this) != objOnWarmupCompleted) {
                                            i4 = i3;
                                            logicdisusecertrr4 = logicdisusecertrr;
                                            getmodelid2 = getmodelid;
                                            arrayList10 = arrayList2;
                                            record2 = record;
                                            it3 = it;
                                            arrayList11 = arrayList;
                                            list3 = arrayList6;
                                            arrayList6 = list3;
                                            c2 = c4;
                                            arrayList = arrayList11;
                                            arrayList9 = arrayList10;
                                            it = it3;
                                            record = record2;
                                            arrayList2 = arrayList9;
                                            logicDisuseCertRr logicdisusecertrr822 = logicdisusecertrr4;
                                            i3 = i4;
                                            logicdisusecertrr3 = logicdisusecertrr822;
                                            Result.Companion companion222 = Result.Companion;
                                            arrayList2.add(new RestoredEventResult(record, Result.constructor-impl(logicChangeCertPW.PROCESSED), arrayList6));
                                            obj3 = objOnWarmupCompleted;
                                            getmodelid = getmodelid2;
                                            c3 = 4;
                                            c = 3;
                                            logicdisusecertrr = logicdisusecertrr3;
                                            i = i3;
                                            objOnWarmupCompleted = obj3;
                                            i6 = 1;
                                            obj4 = null;
                                            if (!it.hasNext()) {
                                            }
                                        }
                                    } else if (objOnExtraCallback == null) {
                                        Result.Companion companion4 = Result.Companion;
                                        arrayList2.add(new RestoredEventResult(record, Result.constructor-impl(logicChangeCertPW.PROCESSED), arrayList6));
                                        obj3 = objOnWarmupCompleted;
                                        i = i3;
                                        c3 = 4;
                                        c2 = 2;
                                        c = 3;
                                        objOnWarmupCompleted = obj3;
                                        i6 = 1;
                                        obj4 = null;
                                        if (!it.hasNext()) {
                                        }
                                    } else {
                                        if (i == 0) {
                                            throw new IllegalStateException(("The " + Reflection.getOrCreateKotlinClass(logicDisuseCertRr.class).getSimpleName() + " is already started, but the " + Reflection.getOrCreateKotlinClass(RecordedEvents.class).getSimpleName() + " contains an argument for start method. To restore such machine, do not start it before calling restoreByRecordedEvents").toString());
                                        }
                                        this.L$0 = getmodelid;
                                        this.L$1 = obj4;
                                        this.L$2 = obj4;
                                        this.L$3 = obj4;
                                        this.L$4 = obj4;
                                        this.L$5 = obj4;
                                        this.L$6 = obj4;
                                        this.label = i6;
                                        if (logicDisuseCertRp.onNavigationEvent(logicdisusecertrr, false, this, i6, obj4) != objOnWarmupCompleted) {
                                            getmodelid3 = getmodelid;
                                            throw new IllegalStateException("The machine should not be running here. Internal error. Never get here");
                                        }
                                    }
                                } else {
                                    c2 = 2;
                                    if (Intrinsics.areEqual(onextracallbackwithresultOnExtraCallback, certGetPublicKeyAlgorithm.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted)) {
                                        this.L$0 = arrayList2;
                                        this.L$1 = arrayList;
                                        this.L$2 = getmodelid;
                                        this.L$3 = logicdisusecertrr;
                                        this.L$4 = it;
                                        this.L$5 = record;
                                        this.L$6 = arrayList6;
                                        this.I$0 = i3;
                                        this.label = 3;
                                        if (logicDisuseCertRp.onNavigationEvent(logicdisusecertrr, this) != objOnWarmupCompleted) {
                                            i4 = i3;
                                            logicdisusecertrr4 = logicdisusecertrr;
                                            getmodelid2 = getmodelid;
                                            arrayList7 = arrayList2;
                                            record2 = record;
                                            it3 = it;
                                            arrayList8 = arrayList;
                                            list2 = arrayList6;
                                            arrayList6 = list2;
                                            arrayList = arrayList8;
                                            arrayList9 = arrayList7;
                                            it = it3;
                                            record = record2;
                                            arrayList2 = arrayList9;
                                            logicDisuseCertRr logicdisusecertrr8222 = logicdisusecertrr4;
                                            i3 = i4;
                                            logicdisusecertrr3 = logicdisusecertrr8222;
                                            Result.Companion companion2222 = Result.Companion;
                                            arrayList2.add(new RestoredEventResult(record, Result.constructor-impl(logicChangeCertPW.PROCESSED), arrayList6));
                                            obj3 = objOnWarmupCompleted;
                                            getmodelid = getmodelid2;
                                            c3 = 4;
                                            c = 3;
                                            logicdisusecertrr = logicdisusecertrr3;
                                            i = i3;
                                            objOnWarmupCompleted = obj3;
                                            i6 = 1;
                                            obj4 = null;
                                            if (!it.hasNext()) {
                                            }
                                        }
                                    } else if (onextracallbackwithresultOnExtraCallback instanceof certGetPublicKeyAlgorithm.onExtraCallbackWithResult.onExtraCallbackWithResult) {
                                        boolean zOnExtraCallback = onextracallbackwithresultOnExtraCallback.onExtraCallback();
                                        this.L$0 = arrayList2;
                                        this.L$1 = arrayList;
                                        this.L$2 = getmodelid;
                                        this.L$3 = logicdisusecertrr;
                                        this.L$4 = it;
                                        this.L$5 = record;
                                        this.L$6 = arrayList6;
                                        this.I$0 = i3;
                                        this.label = 4;
                                        if (logicDisuseCertRp.IAuthTabCallback(logicdisusecertrr, zOnExtraCallback, this) != objOnWarmupCompleted) {
                                            i2 = i3;
                                            it2 = it;
                                            logicdisusecertrr2 = logicdisusecertrr;
                                            getmodelid2 = getmodelid;
                                            arrayList4 = arrayList;
                                            arrayList5 = arrayList2;
                                            list = arrayList6;
                                            arrayList6 = list;
                                            arrayList2 = arrayList5;
                                            arrayList = arrayList4;
                                            Iterator it42 = it2;
                                            i3 = i2;
                                            logicdisusecertrr3 = logicdisusecertrr2;
                                            it = it42;
                                            Result.Companion companion22222 = Result.Companion;
                                            arrayList2.add(new RestoredEventResult(record, Result.constructor-impl(logicChangeCertPW.PROCESSED), arrayList6));
                                            obj3 = objOnWarmupCompleted;
                                            getmodelid = getmodelid2;
                                            c3 = 4;
                                            c = 3;
                                            logicdisusecertrr = logicdisusecertrr3;
                                            i = i3;
                                            objOnWarmupCompleted = obj3;
                                            i6 = 1;
                                            obj4 = null;
                                            if (!it.hasNext()) {
                                                Unit unit = Unit.INSTANCE;
                                                if (getmodelid != null) {
                                                    getmodelid.onExtraCallback();
                                                }
                                                if (arrayList2.size() != this.$recordedEvents.onNavigationEvent().size()) {
                                                    arrayList.add(new RestorationWarningException(checkMovementLicense.RecordedAndProcessedEventCountNotMatch, "Recorded event count is " + this.$recordedEvents.onNavigationEvent().size() + " but the actual processed event count is " + arrayList2.size() + ". They should not differ, this should never happen", null, 4, null));
                                                }
                                                RestorationResult restorationResult = new RestorationResult(arrayList2, arrayList);
                                                this.$validator.onExtraCallback(restorationResult, this.$recordedEvents, this.$this_restoreByRecordedEvents);
                                                return restorationResult;
                                            }
                                        }
                                    } else {
                                        logicdisusecertrr3 = logicdisusecertrr;
                                        getmodelid2 = getmodelid;
                                        Result.Companion companion222222 = Result.Companion;
                                        arrayList2.add(new RestoredEventResult(record, Result.constructor-impl(logicChangeCertPW.PROCESSED), arrayList6));
                                        obj3 = objOnWarmupCompleted;
                                        getmodelid = getmodelid2;
                                        c3 = 4;
                                        c = 3;
                                        logicdisusecertrr = logicdisusecertrr3;
                                        i = i3;
                                        objOnWarmupCompleted = obj3;
                                        i6 = 1;
                                        obj4 = null;
                                        if (!it.hasNext()) {
                                        }
                                    }
                                }
                            } else {
                                c3 = 4;
                                c2 = 2;
                                c = 3;
                                try {
                                } catch (Throwable th5) {
                                    th2 = th5;
                                }
                                Result.Companion companion5 = Result.Companion;
                                getVIDRandom getvidrandom = (getVIDRandom) logicdisusecertrr;
                                this.L$0 = arrayList2;
                                this.L$1 = arrayList;
                                this.L$2 = getmodelid;
                                this.L$3 = logicdisusecertrr;
                                this.L$4 = it;
                                this.L$5 = record;
                                this.L$6 = arrayList6;
                                this.I$0 = i3;
                                this.label = 5;
                                objOnNavigationEvent = getvidrandom.onNavigationEvent(certgetpublickeyalgorithmOnExtraCallbackWithResult, objOnExtraCallback, this);
                                if (objOnNavigationEvent != objOnWarmupCompleted) {
                                    r16 = arrayList;
                                    arrayList3 = arrayList2;
                                    i7 = i3;
                                    record3 = record;
                                    list4 = arrayList6;
                                    obj2 = Result.constructor-impl((logicChangeCertPW) objOnNavigationEvent);
                                    arrayList12 = r16;
                                    ArrayList arrayList14222 = arrayList3;
                                    logicDisuseCertRr logicdisusecertrr9222 = logicdisusecertrr;
                                    getModelId getmodelid4222 = getmodelid;
                                    arrayList = arrayList12;
                                    logicchangecertpw = (logicChangeCertPW) (Result.onExtraCallback(obj2) ? obj4 : obj2);
                                    if (logicchangecertpw != null) {
                                    }
                                    obj3 = objOnWarmupCompleted;
                                    arrayList14222.add(new RestoredEventResult(record3, obj2, list4));
                                    i = i7;
                                    getmodelid = getmodelid4222;
                                    arrayList2 = arrayList14222;
                                    logicdisusecertrr = logicdisusecertrr9222;
                                    objOnWarmupCompleted = obj3;
                                    i6 = 1;
                                    obj4 = null;
                                    if (!it.hasNext()) {
                                    }
                                }
                            }
                            return objOnWarmupCompleted;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                    objOnWarmupCompleted = obj3;
                    i6 = 1;
                    obj4 = null;
                }
            }
        } catch (Throwable th7) {
            th = th7;
            getmodelid = getmodelid3;
        }
    }
}
