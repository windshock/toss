package im.toss.global.features.kyc.test;

import im.toss.features.home.core.local.model.TransactionFilterLocal;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.access13800;
import o.findResAndMsg;

/* loaded from: classes.dex */
final class GlobalKycTestViewModel$IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(GlobalKycTestViewModel$IAuthTabCallbackDefault.class);
    int label;
    final /* synthetic */ GlobalKycTestViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalKycTestViewModel$IAuthTabCallbackDefault(GlobalKycTestViewModel globalKycTestViewModel, access13800<? super GlobalKycTestViewModel$IAuthTabCallbackDefault> access13800Var) {
        super(2, access13800Var);
        this.this$0 = globalKycTestViewModel;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        GlobalKycTestViewModel$IAuthTabCallbackDefault globalKycTestViewModel$IAuthTabCallbackDefault = (GlobalKycTestViewModel$IAuthTabCallbackDefault) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        GlobalKycTestViewModel$IAuthTabCallbackDefault globalKycTestViewModel$IAuthTabCallbackDefault2 = new GlobalKycTestViewModel$IAuthTabCallbackDefault(globalKycTestViewModel$IAuthTabCallbackDefault.this$0, (access13800) objArr[2]);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4004);
        return globalKycTestViewModel$IAuthTabCallbackDefault2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = (~i6) | i8;
        int i10 = ~(i6 | i8);
        int i11 = i3 + i5 + i + ((-714989572) * i2) + (1142003473 * i4);
        int i12 = i11 * i11;
        int i13 = (((-190873766) * i3) - 1983905792) + (1136689320 * i5) + (i7 * (-1483702105)) + (1483702105 * i9) + ((-1483702105) * i10) + ((-1674575872) * i) + ((-1891631104) * i2) + ((-1355808768) * i4) + ((-1882259456) * i12);
        int i14 = (i3 * (-1158907614)) + 1427560840 + (i5 * (-1158905656)) + (i7 * 979) + (i9 * (-979)) + (i10 * 979) + (i * (-1158906635)) + (i2 * 1387703340) + (i4 * 1202573125) + (i12 * (-451215360));
        int i15 = i13 + (i14 * i14 * (-310837248));
        return i15 != 1 ? i15 != 2 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        GlobalKycTestViewModel$IAuthTabCallbackDefault globalKycTestViewModel$IAuthTabCallbackDefault = (GlobalKycTestViewModel$IAuthTabCallbackDefault) objArr[0];
        findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
        access13800<?> access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2171);
        Object objInvokeSuspend = globalKycTestViewModel$IAuthTabCallbackDefault.create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1114);
        return objInvokeSuspend;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2665);
        int i3 = i2 & iOnWarmupCompleted;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 9) & 1) == 0) {
            return onWarmupCompleted(findresandmsg, access13800Var);
        }
        onWarmupCompleted(findresandmsg, access13800Var);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0093, code lost:
    
        if (r11.IAuthTabCallback(r1) == r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
    
        if (r11.IAuthTabCallback(r1) == r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009e, code lost:
    
        o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1240);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallback(java.lang.Object[] r11) {
        /*
            r0 = 0
            r1 = r11[r0]
            im.toss.global.features.kyc.test.GlobalKycTestViewModel$IAuthTabCallbackDefault r1 = (im.toss.global.features.kyc.test.GlobalKycTestViewModel$IAuthTabCallbackDefault) r1
            r2 = 1
            r11 = r11[r2]
            r3 = r11
            java.lang.Object r3 = (java.lang.Object) r3
            r3 = 2
            int r3 = r3 % r3
            r3 = 5226(0x146a, float:7.323E-42)
            o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r3)
            java.lang.Object r3 = o.access14300.onWarmupCompleted()
            int r4 = r1.label
            if (r4 == 0) goto L56
            r1 = 4878(0x130e, float:6.836E-42)
            o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r1)
            if (r4 != r2) goto L4e
            int r1 = im.toss.global.features.kyc.test.GlobalKycTestViewModel$IAuthTabCallbackDefault.onExtraCallbackWithResult
            r3 = 5320(0x14c8, float:7.455E-42)
            int r3 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r3)
            r4 = r1 & r3
            int r4 = ~r4
            r1 = r1 | r3
            r1 = r1 & r4
            int r1 = r1 >> 25
            r1 = r1 & r2
            if (r1 == 0) goto L41
            kotlin.ResultKt.onNavigationEvent(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            r11.onNavigationEvent()
            r11 = 338(0x152, float:4.74E-43)
            o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r11)
            goto La4
        L41:
            kotlin.ResultKt.onNavigationEvent(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            r11.onNavigationEvent()
            r11 = 0
            r11.hashCode()
            throw r11
        L4e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L56:
            kotlin.ResultKt.onNavigationEvent(r11)
            im.toss.global.features.kyc.test.GlobalKycTestViewModel r11 = r1.this$0
            java.lang.Object[] r9 = new java.lang.Object[]{r11}
            int r8 = o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback()
            int r5 = o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback()
            int r7 = o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback()
            int r10 = o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback()
            r4 = 172548271(0xa48e0af, float:9.671908E-33)
            r6 = -172548268(0xfffffffff5b71f54, float:-4.6427038E32)
            java.lang.Object r11 = im.toss.global.features.kyc.test.GlobalKycTestViewModel.onNavigationEvent(r4, r5, r6, r7, r8, r9, r10)
            o.hasNotSupportCdnRule r11 = (o.hasNotSupportCdnRule) r11
            int r4 = im.toss.global.features.kyc.test.GlobalKycTestViewModel$IAuthTabCallbackDefault.onExtraCallbackWithResult
            r5 = 1212(0x4bc, float:1.698E-42)
            int r5 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r5)
            int r6 = ~r5
            r6 = r6 & r4
            int r4 = ~r4
            r4 = r4 & r5
            r4 = r4 | r6
            int r4 = r4 >> 9
            r4 = r4 & r2
            if (r4 == 0) goto L96
            r1.label = r0
            java.lang.Object r11 = r11.IAuthTabCallback(r1)
            if (r11 != r3) goto La4
            goto L9e
        L96:
            r1.label = r2
            java.lang.Object r11 = r11.IAuthTabCallback(r1)
            if (r11 != r3) goto La4
        L9e:
            r11 = 1240(0x4d8, float:1.738E-42)
            o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r11)
            return r3
        La4:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            int r1 = im.toss.global.features.kyc.test.GlobalKycTestViewModel$IAuthTabCallbackDefault.onExtraCallbackWithResult
            r3 = 221(0xdd, float:3.1E-43)
            int r3 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r3)
            int r4 = ~r3
            r4 = r4 & r1
            int r1 = ~r1
            r1 = r1 & r3
            r3 = r4 ^ r1
            r1 = r1 & r4
            r1 = r1 | r3
            int r1 = r1 >> 30
            r1 = r1 & r2
            if (r1 != 0) goto Lbc
            int r0 = r0 / r0
        Lbc:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: im.toss.global.features.kyc.test.GlobalKycTestViewModel$IAuthTabCallbackDefault.IAuthTabCallback(java.lang.Object[]):java.lang.Object");
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        return (access13800) onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -640040251, TransactionFilterLocal.Companion.onNavigationEvent(), 640040251, iOnNavigationEvent, new Object[]{this, obj, access13800Var});
    }

    public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        return onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 604797876, TransactionFilterLocal.Companion.onNavigationEvent(), -604797874, iOnNavigationEvent, new Object[]{this, findresandmsg, access13800Var});
    }

    public final Object invokeSuspend(Object obj) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        return onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1929980357, TransactionFilterLocal.Companion.onNavigationEvent(), 1929980358, iOnNavigationEvent, new Object[]{this, obj});
    }
}
