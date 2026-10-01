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
final class zzc extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzc(zzg zzgVar, String str, long j, access13800 access13800Var) {
        super(2, access13800Var);
        this.zzb = zzgVar;
        this.zzc = str;
        this.zzd = j;
    }

    public final access13800 create(@Nullable Object obj, @NotNull access13800 access13800Var) {
        zzc zzcVar = new zzc(this.zzb, this.zzc, this.zzd, access13800Var);
        zzcVar.zze = obj;
        return zzcVar;
    }

    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOnExtraCallback;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.zza;
        ResultKt.onNavigationEvent(obj);
        if (i2 == 0) {
            findResAndMsg findresandmsg = (findResAndMsg) this.zze;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzc().iterator();
            while (it.hasNext()) {
                arrayList.add(maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new zzb((zza) it.next(), this.zzc, this.zzd, null), 3, (Object) null));
            }
            GeckoHubImp1[] geckoHubImp1Arr = (GeckoHubImp1[]) arrayList.toArray(new GeckoHubImp1[0]);
            GeckoHubImp1[] geckoHubImp1Arr2 = (GeckoHubImp1[]) Arrays.copyOf(geckoHubImp1Arr, geckoHubImp1Arr.length);
            this.zza = 1;
            objOnExtraCallback = ResourceCallback.onExtraCallback(geckoHubImp1Arr2, this);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            objOnExtraCallback = obj;
        }
        String str = this.zzc;
        zzof zzofVarZzf = zzog.zzf();
        zzofVarZzf.zzd(str);
        Iterator it2 = ((List) objOnExtraCallback).iterator();
        while (it2.hasNext()) {
            Object objOnNavigationEvent = ((Result) it2.next()).onNavigationEvent();
            if (Result.onNavigationEvent(objOnNavigationEvent)) {
                zzofVarZzf.zzg((zzog) objOnNavigationEvent);
            }
        }
        return (zzog) zzofVarZzf.zzj();
    }
}
