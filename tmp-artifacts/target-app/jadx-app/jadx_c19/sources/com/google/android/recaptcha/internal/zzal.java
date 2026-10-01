package com.google.android.recaptcha.internal;

import android.app.Application;
import android.os.Build;
import com.alibaba.griver.base.common.utils.HexStringUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.findResAndMsg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzal extends SuspendLambda implements Function2 {
    final /* synthetic */ Application zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbd zzc;
    final /* synthetic */ zzbq zzd;
    final /* synthetic */ zzab zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzal(Application application, String str, zzbd zzbdVar, zzbq zzbqVar, zzab zzabVar, access13800 access13800Var) {
        super(2, access13800Var);
        this.zza = application;
        this.zzb = str;
        this.zzc = zzbdVar;
        this.zzd = zzbqVar;
        this.zze = zzabVar;
    }

    public final access13800 create(@Nullable Object obj, @NotNull access13800 access13800Var) {
        return new zzal(this.zza, this.zzb, this.zzc, this.zzd, this.zze, access13800Var);
    }

    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(@NotNull Object obj) throws UnsupportedEncodingException {
        ResultKt.onNavigationEvent(obj);
        zzbd zzbdVar = this.zzc;
        Application application = this.zza;
        String strZza = zzaf.zza(application);
        String packageName = application.getPackageName();
        String strZzd = zzbdVar.zzd();
        zzq zzqVar = new zzq(application);
        int i2 = Build.VERSION.SDK_INT;
        String strZza2 = zzqVar.zza("_GRECAPTCHA_KC");
        if (strZza2 == null) {
            strZza2 = "";
        }
        byte[] bytes = ("k=" + URLEncoder.encode(this.zzb, HexStringUtil.DEFAULT_CHARSET_NAME) + "&pk=" + URLEncoder.encode(packageName, HexStringUtil.DEFAULT_CHARSET_NAME) + "&mst=" + URLEncoder.encode(strZza, HexStringUtil.DEFAULT_CHARSET_NAME) + "&msv=" + URLEncoder.encode("18.4.0", HexStringUtil.DEFAULT_CHARSET_NAME) + "&msi=" + URLEncoder.encode(strZzd, HexStringUtil.DEFAULT_CHARSET_NAME) + "&mov=" + i2 + "&mkc=" + strZza2).getBytes(Charset.forName(HexStringUtil.DEFAULT_CHARSET_NAME));
        return this.zzd.zza(this.zze.zzb(), bytes, this.zzc);
    }
}
