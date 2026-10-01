package ru.nsk.kstatemachine.persistence;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.access13800;
import o.access14300;
import o.logicDisuseCertRr;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RestoreByRecordedEventsKt$restoreByRecordedEventsBlocking$1 extends SuspendLambda implements Function1<access13800<? super RestorationResult>, Object> {
    final /* synthetic */ boolean $disableStructureHashCodeCheck;
    final /* synthetic */ boolean $muteListeners;
    final /* synthetic */ RecordedEvents $recordedEvents;
    final /* synthetic */ logicDisuseCertRr $this_restoreByRecordedEventsBlocking;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RestoreByRecordedEventsKt$restoreByRecordedEventsBlocking$1(logicDisuseCertRr logicdisusecertrr, RecordedEvents recordedEvents, boolean z, boolean z2, access13800<? super RestoreByRecordedEventsKt$restoreByRecordedEventsBlocking$1> access13800Var) {
        super(1, access13800Var);
        this.$this_restoreByRecordedEventsBlocking = logicdisusecertrr;
        this.$recordedEvents = recordedEvents;
        this.$muteListeners = z;
        this.$disableStructureHashCodeCheck = z2;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public final Object invoke(access13800<? super RestorationResult> access13800Var) {
        return create(access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    public final access13800<Unit> create(access13800<?> access13800Var) {
        return new RestoreByRecordedEventsKt$restoreByRecordedEventsBlocking$1(this.$this_restoreByRecordedEventsBlocking, this.$recordedEvents, this.$muteListeners, this.$disableStructureHashCodeCheck, access13800Var);
    }

    public final Object invokeSuspend(Object obj) {
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return obj;
        }
        ResultKt.onNavigationEvent(obj);
        logicDisuseCertRr logicdisusecertrr = this.$this_restoreByRecordedEventsBlocking;
        RecordedEvents recordedEvents = this.$recordedEvents;
        boolean z = this.$muteListeners;
        boolean z2 = this.$disableStructureHashCodeCheck;
        this.label = 1;
        Object objOnWarmupCompleted2 = RestoreByRecordedEventsKt.onWarmupCompleted(logicdisusecertrr, recordedEvents, z, z2, null, this, 8, null);
        return objOnWarmupCompleted2 == objOnWarmupCompleted ? objOnWarmupCompleted : objOnWarmupCompleted2;
    }
}
