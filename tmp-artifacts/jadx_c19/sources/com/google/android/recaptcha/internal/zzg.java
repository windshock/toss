package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.access13800;
import o.access14300;
import o.findRes;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzg {
    private final List zza;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzg() {
        List list = null;
        this(list, 1, list);
    }

    public /* synthetic */ zzg(List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        List listEmptyList = CollectionsKt.emptyList();
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        arrayList.addAll(listEmptyList);
    }

    public final Object zza(@NotNull String str, long j, @NotNull access13800 access13800Var) {
        return findRes.onExtraCallbackWithResult(new zzc(this, str, j, null), access13800Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(long j, @NotNull zzoe zzoeVar, @NotNull access13800 access13800Var) {
        zzd zzdVar;
        if (access13800Var instanceof zzd) {
            zzdVar = (zzd) access13800Var;
            int i2 = zzdVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzdVar.zzc = i2 - 2147483648;
            } else {
                zzdVar = new zzd(this, access13800Var);
            }
        }
        Object objOnExtraCallbackWithResult = zzdVar.zza;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = zzdVar.zzc;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            zzf zzfVar = new zzf(this, j, zzoeVar, null);
            zzdVar.zzc = 1;
            objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(zzfVar, zzdVar);
            if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        }
        return ((Result) objOnExtraCallbackWithResult).onNavigationEvent();
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(@NotNull zza zzaVar) {
        this.zza.add(zzaVar);
    }
}
