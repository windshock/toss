package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import o.GeckoHubImp1;
import o.ResourceCallback;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzf extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzoe zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzf(zzg zzgVar, long j, zzoe zzoeVar, access13800 access13800Var) {
        super(2, access13800Var);
        this.zzb = zzgVar;
        this.zzc = j;
        this.zzd = zzoeVar;
    }

    public final access13800 create(@Nullable Object obj, @NotNull access13800 access13800Var) {
        zzf zzfVar = new zzf(this.zzb, this.zzc, this.zzd, access13800Var);
        zzfVar.zze = obj;
        return zzfVar;
    }

    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOnExtraCallback;
        Ref.ObjectRef objectRef;
        Object objCreateFailure;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        if (this.zza != 0) {
            objectRef = (Ref.ObjectRef) this.zze;
            ResultKt.onNavigationEvent(obj);
            objOnExtraCallback = obj;
        } else {
            ResultKt.onNavigationEvent(obj);
            findResAndMsg findresandmsg = (findResAndMsg) this.zze;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzc().iterator();
            while (it.hasNext()) {
                arrayList.add(maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new zze((zza) it.next(), this.zzc, this.zzd, null), 3, (Object) null));
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            GeckoHubImp1[] geckoHubImp1Arr = (GeckoHubImp1[]) arrayList.toArray(new GeckoHubImp1[0]);
            GeckoHubImp1[] geckoHubImp1Arr2 = (GeckoHubImp1[]) Arrays.copyOf(geckoHubImp1Arr, geckoHubImp1Arr.length);
            this.zze = objectRef2;
            this.zza = 1;
            objOnExtraCallback = ResourceCallback.onExtraCallback(geckoHubImp1Arr2, this);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            objectRef = objectRef2;
        }
        Iterator it2 = ((List) objOnExtraCallback).iterator();
        while (it2.hasNext()) {
            Throwable th = Result.exceptionOrNull-impl(((Result) it2.next()).onNavigationEvent());
            if (th != null) {
                zzp zzpVar = null;
                if (objectRef.element != null) {
                    zzpVar = new zzp(zzn.zzc, zzl.zzal, null);
                } else if (th instanceof zzp) {
                    zzpVar = (zzp) th;
                }
                objectRef.element = zzpVar;
            }
        }
        zzp zzpVar2 = (zzp) objectRef.element;
        if (zzpVar2 != null) {
            Result.Companion companion = Result.Companion;
            objCreateFailure = ResultKt.createFailure(zzpVar2);
        } else {
            Result.Companion companion2 = Result.Companion;
            objCreateFailure = Unit.INSTANCE;
        }
        return Result.IAuthTabCallback(Result.constructor-impl(objCreateFailure));
    }
}
