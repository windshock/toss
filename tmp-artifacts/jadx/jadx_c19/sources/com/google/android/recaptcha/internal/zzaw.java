package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaException;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import o.access13800;
import o.access14300;
import o.access8100;
import o.doGet;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzaw implements RecaptchaClient, RecaptchaTasksClient {
    public static final zzan zza = new zzan(null);
    private static final Regex zzb = new Regex("^[a-zA-Z0-9/_]{0,100}$");
    private final Application zzc;
    private final zzg zzd;
    private final String zze;
    private final zzab zzf;
    private final zzoe zzg;
    private final zzbd zzh;
    private final zzbg zzi;
    private final zzq zzj;
    private final zzbs zzk;
    private final zzt zzl;

    public zzaw(@NotNull Application application, @NotNull zzg zzgVar, @NotNull String str, @NotNull zzt zztVar, @NotNull zzab zzabVar, @NotNull zzoe zzoeVar, @NotNull zzbd zzbdVar, @Nullable zzbg zzbgVar, @NotNull zzq zzqVar, @NotNull zzbs zzbsVar) {
        this.zzc = application;
        this.zzd = zzgVar;
        this.zze = str;
        this.zzl = zztVar;
        this.zzf = zzabVar;
        this.zzg = zzoeVar;
        this.zzh = zzbdVar;
        this.zzi = zzbgVar;
        this.zzj = zzqVar;
        this.zzk = zzbsVar;
    }

    public static final /* synthetic */ void zzi(zzaw zzawVar, long j, RecaptchaAction recaptchaAction, zzbd zzbdVar) throws zzp {
        zzbb zzbbVarZza = zzbdVar.zza(zzne.zzm);
        zzbg zzbgVar = zzawVar.zzi;
        zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
        zzp zzpVar = !zzb.onExtraCallbackWithResult(recaptchaAction.getAction()) ? new zzp(zzn.zzi, zzl.zzq, null) : null;
        if (j < 5000) {
            zzpVar = new zzp(zzn.zzc, zzl.zzT, null);
        }
        if (zzpVar == null) {
            zzawVar.zzi.zza(zzbbVarZza);
        } else {
            zzawVar.zzi.zzb(zzbbVarZza, zzpVar, null);
            throw zzpVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(long j, String str, zzbd zzbdVar, access13800 access13800Var) throws zzp {
        zzao zzaoVar;
        zzbb zzbbVarZza;
        Exception e;
        zzaw zzawVar;
        zzbb zzbbVar;
        if (access13800Var instanceof zzao) {
            zzaoVar = (zzao) access13800Var;
            int i2 = zzaoVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzaoVar.zzc = i2 - 2147483648;
            } else {
                zzaoVar = new zzao(this, access13800Var);
            }
        }
        Object objZza = zzaoVar.zza;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = zzaoVar.zzc;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(objZza);
            zzbbVarZza = zzbdVar.zza(zzne.zzp);
            zzbg zzbgVar = this.zzi;
            zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
            try {
                zzg zzgVar = this.zzd;
                zzaoVar.zzd = this;
                zzaoVar.zze = zzbbVarZza;
                zzaoVar.zzc = 1;
                objZza = zzgVar.zza(str, j, zzaoVar);
                if (objZza == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                zzawVar = this;
                zzbbVar = zzbbVarZza;
            } catch (Exception e2) {
                e = e2;
                zzawVar = this;
                if (!(e instanceof zzp)) {
                }
                zzawVar.zzi.zzb(zzbbVarZza, zzpVar, null);
                throw zzpVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzbbVar = zzaoVar.zze;
            zzawVar = zzaoVar.zzd;
            try {
                ResultKt.onNavigationEvent(objZza);
            } catch (Exception e3) {
                e = e3;
                zzbbVarZza = zzbbVar;
                zzp zzpVar = !(e instanceof zzp) ? (zzp) e : new zzp(zzn.zzc, zzl.zzan, null);
                zzawVar.zzi.zzb(zzbbVarZza, zzpVar, null);
                throw zzpVar;
            }
        }
        zzog zzogVar = (zzog) objZza;
        zzawVar.zzi.zza(zzbbVar);
        return zzogVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzk(RecaptchaAction recaptchaAction, long j, access13800 access13800Var) {
        zzas zzasVar;
        zzbd zzbdVarZzb;
        zzaw zzawVar;
        zzbd zzbdVar;
        zzp zzpVar;
        if (access13800Var instanceof zzas) {
            zzasVar = (zzas) access13800Var;
            int i2 = zzasVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzasVar.zzc = i2 - 2147483648;
            } else {
                zzasVar = new zzas(this, access13800Var);
            }
        }
        zzas zzasVar2 = zzasVar;
        Object objOnNavigationEvent = zzasVar2.zza;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = zzasVar2.zzc;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            String string = UUID.randomUUID().toString();
            zzbdVarZzb = this.zzh.zzb();
            zzbdVarZzb.zzc(string);
            zzbg zzbgVar = this.zzi;
            zzbb zzbbVarZza = zzbdVarZzb.zza(zzne.zzo);
            zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
            try {
                zzat zzatVar = new zzat(this, j, recaptchaAction, zzbdVarZzb, string, null);
                zzasVar2.zzd = this;
                zzasVar2.zze = zzbdVarZzb;
                zzasVar2.zzc = 1;
                objOnNavigationEvent = doGet.onNavigationEvent(j, zzatVar, zzasVar2);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                zzawVar = this;
                zzbdVar = zzbdVarZzb;
            } catch (Exception e) {
                e = e;
                zzawVar = this;
                if (e instanceof zzp) {
                    zzpVar = new zzp(zzn.zzc, zzl.zzaj, e.getClass().getSimpleName());
                } else {
                    zzpVar = (zzp) e;
                }
                zzawVar.zzi.zzb(zzbdVarZzb.zza(zzne.zzo), zzpVar, null);
                RecaptchaException recaptchaExceptionZzc = zzpVar.zzc();
                Result.Companion companion = Result.Companion;
                return Result.constructor-impl(ResultKt.createFailure(recaptchaExceptionZzc));
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzbdVar = zzasVar2.zze;
            zzawVar = zzasVar2.zzd;
            try {
                ResultKt.onNavigationEvent(objOnNavigationEvent);
            } catch (Exception e2) {
                e = e2;
                zzbdVarZzb = zzbdVar;
                if (e instanceof zzp) {
                }
                zzawVar.zzi.zzb(zzbdVarZzb.zza(zzne.zzo), zzpVar, null);
                RecaptchaException recaptchaExceptionZzc2 = zzpVar.zzc();
                Result.Companion companion2 = Result.Companion;
                return Result.constructor-impl(ResultKt.createFailure(recaptchaExceptionZzc2));
            }
        }
        return ((Result) objOnNavigationEvent).onNavigationEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl(zzol zzolVar, zzbd zzbdVar) throws zzp {
        zzbb zzbbVarZza = zzbdVar.zza(zzne.zzr);
        zzbg zzbgVar = this.zzi;
        zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
        try {
            List<zzon> listZzj = zzolVar.zzj();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(listZzj, 10)), 16));
            for (zzon zzonVar : listZzj) {
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(zzonVar.zzg(), zzonVar.zzi());
                linkedHashMap.put(pairIAuthTabCallback.getFirst(), pairIAuthTabCallback.getSecond());
            }
            this.zzj.zzb(linkedHashMap);
            this.zzi.zza(zzbbVarZza);
        } catch (Exception e) {
            zzp zzpVar = e instanceof zzp ? (zzp) e : new zzp(zzn.zzc, zzl.zzan, null);
            this.zzi.zzb(zzbbVarZza, zzpVar, null);
            throw zzpVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo58execute0E7RQCE(@NotNull RecaptchaAction recaptchaAction, long j, @NotNull access13800<? super Result<String>> access13800Var) {
        zzap zzapVar;
        if (access13800Var instanceof zzap) {
            zzapVar = (zzap) access13800Var;
            int i2 = zzapVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzapVar.zzc = i2 - 2147483648;
            } else {
                zzapVar = new zzap(this, access13800Var);
            }
        }
        Object objOnExtraCallback = zzapVar.zza;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = zzapVar.zzc;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            CoroutineContext coroutineContext = this.zzl.zzb().getCoroutineContext();
            zzaq zzaqVar = new zzaq(this, recaptchaAction, j, (access13800) null);
            zzapVar.zzc = 1;
            objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(coroutineContext, zzaqVar, zzapVar);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        }
        return ((Result) objOnExtraCallback).onNavigationEvent();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo59executegIAlus(@NotNull RecaptchaAction recaptchaAction, @NotNull access13800<? super Result<String>> access13800Var) {
        zzar zzarVar;
        if (access13800Var instanceof zzar) {
            zzarVar = (zzar) access13800Var;
            int i2 = zzarVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzarVar.zzc = i2 - 2147483648;
            } else {
                zzarVar = new zzar(this, access13800Var);
            }
        }
        Object obj = zzarVar.zza;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = zzarVar.zzc;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return ((Result) obj).onNavigationEvent();
        }
        ResultKt.onNavigationEvent(obj);
        zzarVar.zzc = 1;
        Object objMo58execute0E7RQCE = mo58execute0E7RQCE(recaptchaAction, 10000L, zzarVar);
        return objMo58execute0E7RQCE == objOnWarmupCompleted ? objOnWarmupCompleted : objMo58execute0E7RQCE;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(@NotNull RecaptchaAction recaptchaAction) {
        return zzj.zza(maybeUpdateAnimatable.onExtraCallback(this.zzl.zzb(), (CoroutineContext) null, (setRandomHost) null, new zzau(this, recaptchaAction, 10000L, null), 3, (Object) null));
    }

    public final String zzg() {
        return this.zze;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(@NotNull RecaptchaAction recaptchaAction, long j) {
        return zzj.zza(maybeUpdateAnimatable.onExtraCallback(this.zzl.zzb(), (CoroutineContext) null, (setRandomHost) null, new zzau(this, recaptchaAction, j, null), 3, (Object) null));
    }
}
