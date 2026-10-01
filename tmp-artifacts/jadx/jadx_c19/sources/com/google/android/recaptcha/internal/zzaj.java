package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ResourceCallback;
import o.access13800;
import o.access14300;
import o.clearRevision;
import o.findResAndMsg;
import o.getFullPackage;
import o.maybeUpdateAnimatable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzaj extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ Application zzc;
    final /* synthetic */ zzab zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ zzbq zzf;
    final /* synthetic */ zzbd zzg;
    final /* synthetic */ zzbg zzh;
    final /* synthetic */ long zzi;
    final /* synthetic */ zzt zzj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaj(Application application, zzab zzabVar, String str, zzbq zzbqVar, zzbd zzbdVar, zzt zztVar, WebView webView, zzbg zzbgVar, long j, access13800 access13800Var) {
        super(2, access13800Var);
        this.zzc = application;
        this.zzd = zzabVar;
        this.zze = str;
        this.zzf = zzbqVar;
        this.zzg = zzbdVar;
        this.zzj = zztVar;
        this.zzh = zzbgVar;
        this.zzi = j;
    }

    public final access13800 create(@Nullable Object obj, @NotNull access13800 access13800Var) {
        return new zzaj(this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzj, null, this.zzh, this.zzi, access13800Var);
    }

    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objOnExtraCallback;
        zzoe zzoeVar;
        Object objZzb;
        Throwable th;
        Throwable th2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.zzb;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            Application application = this.zzc;
            zzab zzabVar = this.zzd;
            String str = this.zze;
            zzbq zzbqVar = this.zzf;
            zzbd zzbdVar = this.zzg;
            zzt zztVar = this.zzj;
            this.zzb = 1;
            objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(zztVar.zza().getCoroutineContext(), new zzal(application, str, zzbdVar, zzbqVar, zzabVar, null), this);
            if (objOnExtraCallback != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                th = (Throwable) this.zza;
                ResultKt.onNavigationEvent(obj);
                zzam.zzf(new zzg(null, 1, null));
                throw th;
            }
            zzoeVar = (zzoe) this.zza;
            ResultKt.onNavigationEvent(obj);
            objZzb = ((Result) obj).onNavigationEvent();
            zzoe zzoeVar2 = zzoeVar;
            zzt zztVar2 = this.zzj;
            th2 = Result.exceptionOrNull-impl(objZzb);
            if (th2 != null) {
                Application application2 = this.zzc;
                return new zzaw(application2, zzam.zze(), this.zze, this.zzj, this.zzd, zzoeVar2, this.zzg, this.zzh, new zzq(application2), new zzbs());
            }
            getFullPackage.onWarmupCompleted(zztVar2.zzc().getCoroutineContext(), (CancellationException) null, 1, (Object) null);
            List listAccess000 = clearRevision.access000(getFullPackage.onExtraCallback(zztVar2.zzc().getCoroutineContext()).cm_());
            this.zza = th2;
            this.zzb = 3;
            if (ResourceCallback.onExtraCallbackWithResult(listAccess000, this) != objOnWarmupCompleted) {
                th = th2;
                zzam.zzf(new zzg(null, 1, null));
                throw th;
            }
            return objOnWarmupCompleted;
        }
        ResultKt.onNavigationEvent(obj);
        objOnExtraCallback = obj;
        zzoeVar = (zzoe) objOnExtraCallback;
        zzam.zze().zzd(new zzez(new WebView(this.zzc), this.zze, this.zzc, this.zzd, this.zzg, this.zzj, this.zzh, this.zzf));
        long j = this.zzi;
        zzg zzgVarZze = zzam.zze();
        this.zza = zzoeVar;
        this.zzb = 2;
        objZzb = zzgVarZze.zzb(j, zzoeVar, this);
        if (objZzb != objOnWarmupCompleted) {
            zzoe zzoeVar22 = zzoeVar;
            zzt zztVar22 = this.zzj;
            th2 = Result.exceptionOrNull-impl(objZzb);
            if (th2 != null) {
            }
        }
        return objOnWarmupCompleted;
    }
}
