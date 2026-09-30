package com.google.android.recaptcha.internal;

import android.content.Context;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.doGet;
import o.getPackageType;
import o.getResRootDir;
import o.maybeUpdateAnimatable;
import o.pauseMyRequest;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzez implements zza {
    public static final zzep zza = new zzep(null);
    public pauseMyRequest zzb;
    public zzbu zzc;
    private final WebView zzd;
    private final String zze;
    private final Context zzf;
    private final zzab zzg;
    private final zzbd zzh;
    private final zzbg zzi;
    private final zzbq zzj;
    private final Map zzk = zzfa.zza();
    private final Map zzl;
    private final Map zzm;
    private final zzfh zzn;
    private final zzeq zzo;
    private final zzbd zzp;
    private final zzt zzq;

    public zzez(@NotNull WebView webView, @NotNull String str, @NotNull Context context, @NotNull zzab zzabVar, @NotNull zzbd zzbdVar, @NotNull zzt zztVar, @Nullable zzbg zzbgVar, @NotNull zzbq zzbqVar) {
        this.zzd = webView;
        this.zze = str;
        this.zzf = context;
        this.zzg = zzabVar;
        this.zzh = zzbdVar;
        this.zzq = zztVar;
        this.zzi = zzbgVar;
        this.zzj = zzbqVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzl = linkedHashMap;
        this.zzm = linkedHashMap;
        this.zzn = zzfh.zzc();
        zzeq zzeqVar = new zzeq(this);
        this.zzo = zzeqVar;
        zzbd zzbdVarZzb = zzbdVar.zzb();
        zzbdVarZzb.zzc(zzbdVar.zzd());
        this.zzp = zzbdVarZzb;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(zzeqVar, "RN");
        webView.setWebViewClient(new zzeu(this));
    }

    public static final /* synthetic */ void zzl(zzez zzezVar, zzoe zzoeVar) {
        zzezVar.zzd.clearCache(true);
        zzbb zzbbVarZza = zzezVar.zzp.zza(zzne.zzc);
        zzbg zzbgVar = zzezVar.zzi;
        zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
        maybeUpdateAnimatable.onNavigationEvent(zzezVar.zzq.zza(), (CoroutineContext) null, (setRandomHost) null, new zzey(zzezVar, zzoeVar, zzbbVarZza, null), 3, (Object) null);
    }

    public static final /* synthetic */ void zzm(zzez zzezVar, String str) {
        zzbb zzbbVarZza = zzezVar.zzp.zza(zzne.zzl);
        try {
            zzbg zzbgVar = zzezVar.zzi;
            zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
            zzezVar.zzd.loadDataWithBaseURL(zzezVar.zzg.zza(), str, "text/html", "utf-8", null);
        } catch (Exception unused) {
            zzp zzpVar = new zzp(zzn.zzc, zzl.zzag, null);
            zzezVar.zzi.zzb(zzbbVarZza, zzpVar, null);
            zzezVar.zzk().onExtraCallback(zzpVar);
        }
    }

    private final zzp zzp(Exception exc, zzp zzpVar) {
        return exc instanceof WebResourceResponseModel ? new zzp(zzn.zzc, zzl.zzj, null) : exc instanceof zzp ? (zzp) exc : zzpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zza
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(@NotNull String str, long j, @NotNull access13800 access13800Var) {
        zzer zzerVar;
        Exception e;
        zzez zzezVar;
        pauseMyRequest pausemyrequest;
        if (access13800Var instanceof zzer) {
            zzerVar = (zzer) access13800Var;
            int i2 = zzerVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzerVar.zzc = i2 - 2147483648;
            } else {
                zzerVar = new zzer(this, access13800Var);
            }
        }
        Object objOnNavigationEvent = zzerVar.zza;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = zzerVar.zzc;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            try {
                zzet zzetVar = new zzet(str, this, null);
                zzerVar.zzd = this;
                zzerVar.zze = str;
                zzerVar.zzc = 1;
                objOnNavigationEvent = doGet.onNavigationEvent(j, zzetVar, zzerVar);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                zzezVar = this;
            } catch (Exception e2) {
                e = e2;
                zzezVar = this;
                zzp zzpVarZzp = zzezVar.zzp(e, new zzp(zzn.zzc, zzl.zzai, e.getClass().getSimpleName()));
                pausemyrequest = (pauseMyRequest) zzezVar.zzl.remove(str);
                if (pausemyrequest != null) {
                }
                Result.Companion companion = Result.Companion;
                return Result.constructor-impl(ResultKt.createFailure(zzpVarZzp));
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = zzerVar.zze;
            zzezVar = zzerVar.zzd;
            try {
                ResultKt.onNavigationEvent(objOnNavigationEvent);
            } catch (Exception e3) {
                e = e3;
                zzp zzpVarZzp2 = zzezVar.zzp(e, new zzp(zzn.zzc, zzl.zzai, e.getClass().getSimpleName()));
                pausemyrequest = (pauseMyRequest) zzezVar.zzl.remove(str);
                if (pausemyrequest != null) {
                    pausemyrequest.onExtraCallback(zzpVarZzp2);
                }
                Result.Companion companion2 = Result.Companion;
                return Result.constructor-impl(ResultKt.createFailure(zzpVarZzp2));
            }
        }
        Result.Companion companion3 = Result.Companion;
        return Result.constructor-impl((zzog) objOnNavigationEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da A[LOOP:0: B:39:0x00d4->B:41:0x00da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zza
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(long j, @NotNull zzoe zzoeVar, @NotNull access13800 access13800Var) {
        zzev zzevVar;
        Exception e;
        zzez zzezVar;
        Iterator it;
        if (access13800Var instanceof zzev) {
            zzevVar = (zzev) access13800Var;
            int i2 = zzevVar.zzd;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzevVar.zzd = i2 - 2147483648;
            } else {
                zzevVar = new zzev(this, access13800Var);
            }
        }
        Object objOnNavigationEvent = zzevVar.zzb;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = zzevVar.zzd;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            try {
                zzbg zzbgVar = this.zzi;
                zzbb zzbbVarZza = this.zzp.zza(zzne.zzb);
                zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
                this.zzc = zzo(zzoeVar, new zzag(zzoeVar.zzf()));
                this.zzb = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
                zzk().hashCode();
                zzew zzewVar = new zzew(this, zzoeVar, null);
                zzevVar.zze = this;
                zzevVar.zza = j;
                zzevVar.zzd = 1;
                objOnNavigationEvent = doGet.onNavigationEvent(j, zzewVar, zzevVar);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                zzezVar = this;
            } catch (Exception e2) {
                e = e2;
                zzezVar = this;
                e.getMessage();
                boolean z = e instanceof WebResourceResponseModel;
                List listListOf = !z ? CollectionsKt.listOf(new zzne[]{zzne.zzg, zzne.zzl}) : CollectionsKt.listOf(zzne.zzg);
                Long lZza = zzezVar.zzo.zza();
                zzp zzpVarZzp = (z || (lZza != null && lZza.longValue() <= j - 2000)) ? zzezVar.zzp(e, new zzp(zzn.zzc, zzl.zzah, e.getClass().getSimpleName())) : new zzp(zzn.zze, zzl.zzS, null);
                it = listListOf.iterator();
                while (it.hasNext()) {
                    zzezVar.zzi.zzb(zzezVar.zzp.zza((zzne) it.next()), zzpVarZzp, null);
                }
                Result.Companion companion = Result.Companion;
                return Result.constructor-impl(ResultKt.createFailure(zzpVarZzp.zzc()));
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = zzevVar.zza;
            zzezVar = zzevVar.zze;
            try {
                ResultKt.onNavigationEvent(objOnNavigationEvent);
            } catch (Exception e3) {
                e = e3;
                e.getMessage();
                boolean z2 = e instanceof WebResourceResponseModel;
                if (!z2) {
                }
                Long lZza2 = zzezVar.zzo.zza();
                if (z2) {
                }
                it = listListOf.iterator();
                while (it.hasNext()) {
                }
                Result.Companion companion2 = Result.Companion;
                return Result.constructor-impl(ResultKt.createFailure(zzpVarZzp.zzc()));
            }
        }
        return ((Result) objOnNavigationEvent).onNavigationEvent();
    }

    public final WebView zzc() {
        return this.zzd;
    }

    public final zzbq zzf() {
        return this.zzj;
    }

    public final zzeq zzg() {
        return this.zzo;
    }

    public final pauseMyRequest zzk() {
        pauseMyRequest pausemyrequest = this.zzb;
        if (pausemyrequest != null) {
            return pausemyrequest;
        }
        return null;
    }

    public final zzca zzo(@NotNull zzoe zzoeVar, @NotNull zzag zzagVar) {
        zzcd zzcdVar = new zzcd(this.zzd, this.zzq.zzb());
        zzef zzefVar = new zzef();
        zzefVar.zzb(CollectionsKt.toLongArray(zzoeVar.zzK()));
        zzcl zzclVar = new zzcl(zzcdVar, zzagVar, new zzaa());
        zzeg zzegVar = new zzeg(zzefVar, new zzed());
        zzclVar.zzf(3, this.zzf);
        zzclVar.zzf(5, zzen.class.getMethod("cs", new Object[0].getClass()));
        zzclVar.zzf(6, new zzeh(this.zzf));
        zzclVar.zzf(7, new zzej());
        zzclVar.zzf(8, new zzeo(this.zzf));
        zzclVar.zzf(9, new zzek(this.zzf));
        zzclVar.zzf(10, new zzei(this.zzf));
        return new zzca(this.zzq.zzc(), zzclVar, zzegVar, zzbt.zza());
    }
}
