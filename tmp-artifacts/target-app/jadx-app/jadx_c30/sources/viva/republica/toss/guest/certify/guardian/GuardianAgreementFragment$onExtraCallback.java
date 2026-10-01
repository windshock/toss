package viva.republica.toss.guest.certify.guardian;

import android.content.DialogInterface;
import android.os.Bundle;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.AMCSConfigRpcFacade;
import o.GeckoHubImp1;
import o.GriverParseFailedExtension1;
import o.UtilsKtExternalSyntheticLambda11;
import o.UtilsKtExternalSyntheticLambda3;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.findResAndMsg;
import o.getParamImp;
import o.initMiniApp;
import o.maybeUpdateAnimatable;
import o.mergeWorkerVHost;
import o.setRandomHost;
import o.wipeOffVhost;
import viva.republica.toss.R;
import viva.republica.toss.guest.certify.fragment.GuestBaseFragment;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class GuardianAgreementFragment$onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ GuardianAgreementFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GuardianAgreementFragment$onExtraCallback(GuardianAgreementFragment guardianAgreementFragment, access13800<? super GuardianAgreementFragment$onExtraCallback> access13800Var) {
        super(2, access13800Var);
        this.this$0 = guardianAgreementFragment;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        GuardianAgreementFragment$onExtraCallback guardianAgreementFragment$onExtraCallback = new GuardianAgreementFragment$onExtraCallback(this.this$0, access13800Var);
        guardianAgreementFragment$onExtraCallback.L$0 = obj;
        return guardianAgreementFragment$onExtraCallback;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017f A[Catch: Exception -> 0x0051, CancellationException -> 0x0054, WebResourceResponseModel -> 0x0057, TryCatch #2 {Exception -> 0x0051, WebResourceResponseModel -> 0x0057, CancellationException -> 0x0054, blocks: (B:8:0x0026, B:43:0x014b, B:45:0x0156, B:48:0x0160, B:66:0x0222, B:49:0x017f, B:50:0x018e, B:52:0x0194, B:53:0x01a2, B:54:0x01b5, B:56:0x01bb, B:57:0x01cf, B:58:0x01de, B:60:0x01e4, B:61:0x01f2, B:62:0x0205, B:64:0x020b, B:65:0x021f, B:13:0x0044, B:39:0x0113, B:36:0x00e5), top: B:78:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0194 A[Catch: Exception -> 0x0051, CancellationException -> 0x0054, WebResourceResponseModel -> 0x0057, LOOP:0: B:50:0x018e->B:52:0x0194, LOOP_END, TryCatch #2 {Exception -> 0x0051, WebResourceResponseModel -> 0x0057, CancellationException -> 0x0054, blocks: (B:8:0x0026, B:43:0x014b, B:45:0x0156, B:48:0x0160, B:66:0x0222, B:49:0x017f, B:50:0x018e, B:52:0x0194, B:53:0x01a2, B:54:0x01b5, B:56:0x01bb, B:57:0x01cf, B:58:0x01de, B:60:0x01e4, B:61:0x01f2, B:62:0x0205, B:64:0x020b, B:65:0x021f, B:13:0x0044, B:39:0x0113, B:36:0x00e5), top: B:78:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bb A[Catch: Exception -> 0x0051, CancellationException -> 0x0054, WebResourceResponseModel -> 0x0057, LOOP:1: B:54:0x01b5->B:56:0x01bb, LOOP_END, TryCatch #2 {Exception -> 0x0051, WebResourceResponseModel -> 0x0057, CancellationException -> 0x0054, blocks: (B:8:0x0026, B:43:0x014b, B:45:0x0156, B:48:0x0160, B:66:0x0222, B:49:0x017f, B:50:0x018e, B:52:0x0194, B:53:0x01a2, B:54:0x01b5, B:56:0x01bb, B:57:0x01cf, B:58:0x01de, B:60:0x01e4, B:61:0x01f2, B:62:0x0205, B:64:0x020b, B:65:0x021f, B:13:0x0044, B:39:0x0113, B:36:0x00e5), top: B:78:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e4 A[Catch: Exception -> 0x0051, CancellationException -> 0x0054, WebResourceResponseModel -> 0x0057, LOOP:2: B:58:0x01de->B:60:0x01e4, LOOP_END, TryCatch #2 {Exception -> 0x0051, WebResourceResponseModel -> 0x0057, CancellationException -> 0x0054, blocks: (B:8:0x0026, B:43:0x014b, B:45:0x0156, B:48:0x0160, B:66:0x0222, B:49:0x017f, B:50:0x018e, B:52:0x0194, B:53:0x01a2, B:54:0x01b5, B:56:0x01bb, B:57:0x01cf, B:58:0x01de, B:60:0x01e4, B:61:0x01f2, B:62:0x0205, B:64:0x020b, B:65:0x021f, B:13:0x0044, B:39:0x0113, B:36:0x00e5), top: B:78:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020b A[Catch: Exception -> 0x0051, CancellationException -> 0x0054, WebResourceResponseModel -> 0x0057, LOOP:3: B:62:0x0205->B:64:0x020b, LOOP_END, TryCatch #2 {Exception -> 0x0051, WebResourceResponseModel -> 0x0057, CancellationException -> 0x0054, blocks: (B:8:0x0026, B:43:0x014b, B:45:0x0156, B:48:0x0160, B:66:0x0222, B:49:0x017f, B:50:0x018e, B:52:0x0194, B:53:0x01a2, B:54:0x01b5, B:56:0x01bb, B:57:0x01cf, B:58:0x01de, B:60:0x01e4, B:61:0x01f2, B:62:0x0205, B:64:0x020b, B:65:0x021f, B:13:0x0044, B:39:0x0113, B:36:0x00e5), top: B:78:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Throwable th;
        Object objOnExtraCallback;
        GuardianAgreementFragment guardianAgreementFragment;
        Object objIAuthTabCallback;
        int i;
        GuardianAgreementFragment$onExtraCallback guardianAgreementFragment$onExtraCallback;
        boolean z;
        int i2;
        List list;
        Object objIAuthTabCallback2;
        GuardianAgreementFragment guardianAgreementFragment2;
        List list2;
        Iterator it;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        try {
        } catch (Exception e) {
            Result.Companion companion = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(e));
        } catch (WebResourceResponseModel e2) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (CancellationException e3) {
            throw e3;
        }
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            UtilsKtExternalSyntheticLambda11 utilsKtExternalSyntheticLambda11 = UtilsKtExternalSyntheticLambda11.IAuthTabCallback;
            this.L$0 = findresandmsg;
            this.label = 1;
            objOnExtraCallback = UtilsKtExternalSyntheticLambda11.onExtraCallback(utilsKtExternalSyntheticLambda11, "teens.onboarding.certify.guardian.viaSMS.shouldAddTermsToServer", (UtilsKtExternalSyntheticLambda3) null, this, 2, (Object) null);
            if (objOnExtraCallback != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list3 = (List) this.L$3;
                guardianAgreementFragment2 = (GuardianAgreementFragment) this.L$1;
                ResultKt.onNavigationEvent(obj);
                list = list3;
                objIAuthTabCallback2 = obj;
                list2 = (List) objIAuthTabCallback2;
                if (list.isEmpty() || !list2.isEmpty()) {
                    List list4 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                    it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AMCSConfigRpcFacade) it.next()).onExtraCallbackWithResult());
                    }
                    List listFlatten = CollectionsKt.flatten(arrayList);
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFlatten, 10));
                    it2 = listFlatten.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new GriverParseFailedExtension1(((wipeOffVhost) it2.next()).IAuthTabCallback(), true));
                    }
                    List list5 = list2;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
                    it3 = list5.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((AMCSConfigRpcFacade) it3.next()).onExtraCallbackWithResult());
                    }
                    List listFlatten2 = CollectionsKt.flatten(arrayList3);
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFlatten2, 10));
                    it4 = listFlatten2.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(new GriverParseFailedExtension1(((wipeOffVhost) it4.next()).IAuthTabCallback(), true));
                    }
                    GuardianAgreementFragment.IAuthTabCallback(guardianAgreementFragment2, arrayList2, arrayList4);
                } else {
                    GuardianAgreementFragment.onExtraCallbackWithResult(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 98945295, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -98945294, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{guardianAgreementFragment2});
                }
                obj2 = Result.constructor-impl(Unit.INSTANCE);
                final GuardianAgreementFragment guardianAgreementFragment3 = this.this$0;
                th = Result.exceptionOrNull-impl(obj2);
                if (th != null) {
                    getParamImp.onWarmupCompleted(th, guardianAgreementFragment3.requireContext(), false, (initMiniApp) null, (Function0) null, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianAgreementFragment$onComplete$1$$ExternalSyntheticLambda0
                        public final Object invoke(Object obj3) {
                            return GuardianAgreementFragment$onExtraCallback.IAuthTabCallback(guardianAgreementFragment3, (DialogInterface) obj3);
                        }
                    }, 14, (Object) null);
                }
                Result.IAuthTabCallback(obj2);
                return Unit.INSTANCE;
            }
            int i4 = this.I$1;
            int i5 = this.I$0;
            boolean z2 = this.Z$0;
            GuardianAgreementFragment$onExtraCallback guardianAgreementFragment$onExtraCallback2 = (access13800) this.L$2;
            GuardianAgreementFragment guardianAgreementFragment4 = (GuardianAgreementFragment) this.L$1;
            ResultKt.onNavigationEvent(obj);
            i = i4;
            i2 = i5;
            z = z2;
            guardianAgreementFragment$onExtraCallback = guardianAgreementFragment$onExtraCallback2;
            guardianAgreementFragment = guardianAgreementFragment4;
            objIAuthTabCallback = obj;
            list = (List) objIAuthTabCallback;
            GeckoHubImp1 geckoHubImp1OnExtraCallback = maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(guardianAgreementFragment, null), 3, (Object) null);
            this.L$0 = access15400.onNavigationEvent(findresandmsg);
            this.L$1 = guardianAgreementFragment;
            this.L$2 = access15400.onNavigationEvent(guardianAgreementFragment$onExtraCallback);
            this.L$3 = list;
            this.Z$0 = z;
            this.I$0 = i2;
            this.I$1 = i;
            this.label = 3;
            objIAuthTabCallback2 = geckoHubImp1OnExtraCallback.IAuthTabCallback(this);
            if (objIAuthTabCallback2 != objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            guardianAgreementFragment2 = guardianAgreementFragment;
            list2 = (List) objIAuthTabCallback2;
            if (list.isEmpty()) {
                List list42 = list;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list42, 10));
                it = list42.iterator();
                while (it.hasNext()) {
                }
                List listFlatten3 = CollectionsKt.flatten(arrayList5);
                ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFlatten3, 10));
                it2 = listFlatten3.iterator();
                while (it2.hasNext()) {
                }
                List list52 = list2;
                ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list52, 10));
                it3 = list52.iterator();
                while (it3.hasNext()) {
                }
                List listFlatten22 = CollectionsKt.flatten(arrayList32);
                ArrayList arrayList42 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFlatten22, 10));
                it4 = listFlatten22.iterator();
                while (it4.hasNext()) {
                }
                GuardianAgreementFragment.IAuthTabCallback(guardianAgreementFragment2, arrayList22, arrayList42);
                obj2 = Result.constructor-impl(Unit.INSTANCE);
                final GuardianAgreementFragment guardianAgreementFragment32 = this.this$0;
                th = Result.exceptionOrNull-impl(obj2);
                if (th != null) {
                }
                Result.IAuthTabCallback(obj2);
            }
            return Unit.INSTANCE;
        }
        ResultKt.onNavigationEvent(obj);
        objOnExtraCallback = obj;
        boolean zBooleanValue = ((Boolean) objOnExtraCallback).booleanValue();
        if (!zBooleanValue) {
            GuestBaseFragment.IAuthTabCallback(this.this$0, R.id.action_guardianAgreementFragment_to_guardianInfoFragment, (Bundle) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
        if (GuardianAgreementFragment.onWarmupCompleted(this.this$0).extraCommand()) {
            List listListOf = CollectionsKt.listOf(new Long[]{access14000.onExtraCallback(1352L), access14000.onExtraCallback(1336L), access14000.onExtraCallback(1338L), access14000.onExtraCallback(1334L)});
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
            Iterator it5 = listListOf.iterator();
            while (it5.hasNext()) {
                arrayList6.add(new GriverParseFailedExtension1(((Number) it5.next()).longValue(), true));
            }
            GuardianAgreementFragment.IAuthTabCallback(this.this$0, arrayList6, arrayList6);
            return Unit.INSTANCE;
        }
        guardianAgreementFragment = this.this$0;
        Result.Companion companion3 = Result.Companion;
        GeckoHubImp1 geckoHubImp1OnExtraCallback2 = maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(guardianAgreementFragment, null), 3, (Object) null);
        this.L$0 = findresandmsg;
        this.L$1 = guardianAgreementFragment;
        this.L$2 = access15400.onNavigationEvent(this);
        this.Z$0 = zBooleanValue;
        this.I$0 = 0;
        this.I$1 = 0;
        this.label = 2;
        objIAuthTabCallback = geckoHubImp1OnExtraCallback2.IAuthTabCallback(this);
        if (objIAuthTabCallback != objOnWarmupCompleted) {
            i = 0;
            guardianAgreementFragment$onExtraCallback = this;
            z = zBooleanValue;
            i2 = 0;
            list = (List) objIAuthTabCallback;
            GeckoHubImp1 geckoHubImp1OnExtraCallback3 = maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(guardianAgreementFragment, null), 3, (Object) null);
            this.L$0 = access15400.onNavigationEvent(findresandmsg);
            this.L$1 = guardianAgreementFragment;
            this.L$2 = access15400.onNavigationEvent(guardianAgreementFragment$onExtraCallback);
            this.L$3 = list;
            this.Z$0 = z;
            this.I$0 = i2;
            this.I$1 = i;
            this.label = 3;
            objIAuthTabCallback2 = geckoHubImp1OnExtraCallback3.IAuthTabCallback(this);
            if (objIAuthTabCallback2 != objOnWarmupCompleted) {
            }
        }
        return objOnWarmupCompleted;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends AMCSConfigRpcFacade>>, Object> {
        int label;
        final /* synthetic */ GuardianAgreementFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(GuardianAgreementFragment guardianAgreementFragment, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.this$0 = guardianAgreementFragment;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallbackWithResult(this.this$0, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super List<? extends AMCSConfigRpcFacade>> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
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
            mergeWorkerVHost mergeworkervhostOnExtraCallback = this.this$0.onExtraCallback();
            this.label = 1;
            Object objOnExtraCallbackWithResult = mergeWorkerVHost.onExtraCallbackWithResult(mergeworkervhostOnExtraCallback, false, this, 1, (Object) null);
            return objOnExtraCallbackWithResult == objOnWarmupCompleted ? objOnWarmupCompleted : objOnExtraCallbackWithResult;
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends AMCSConfigRpcFacade>>, Object> {
        int label;
        final /* synthetic */ GuardianAgreementFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(GuardianAgreementFragment guardianAgreementFragment, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.this$0 = guardianAgreementFragment;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallback(this.this$0, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super List<? extends AMCSConfigRpcFacade>> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
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
            mergeWorkerVHost mergeworkervhostOnExtraCallback = this.this$0.onExtraCallback();
            this.label = 1;
            Object objOnWarmupCompleted2 = mergeworkervhostOnExtraCallback.onWarmupCompleted(this);
            return objOnWarmupCompleted2 == objOnWarmupCompleted ? objOnWarmupCompleted : objOnWarmupCompleted2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(GuardianAgreementFragment guardianAgreementFragment, DialogInterface dialogInterface) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        GuardianAgreementFragment.onExtraCallbackWithResult(iOnExtraCallbackWithResult, 98945295, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -98945294, iOnExtraCallbackWithResult3, new Object[]{guardianAgreementFragment});
        return Unit.INSTANCE;
    }
}
