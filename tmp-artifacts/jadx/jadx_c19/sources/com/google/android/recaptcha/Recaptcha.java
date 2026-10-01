package com.google.android.recaptcha;

import android.app.Application;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzam;
import com.google.android.recaptcha.internal.zzaw;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import o.access13800;
import o.access14300;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    /* renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m56getClientBWLJW6A$default(@NonNull Recaptcha recaptcha, @NonNull Application application, @NonNull String str, long j, @NonNull access13800 access13800Var, int i2, @NonNull Object obj) {
        if ((i2 & 4) != 0) {
            j = 10000;
        }
        return recaptcha.m57getClientBWLJW6A(application, str, j, access13800Var);
    }

    @JvmStatic
    public static final Task<RecaptchaTasksClient> getTasksClient(@NonNull Application application, @NonNull String str) {
        return zzam.zzd(application, str, 10000L);
    }

    @JvmStatic
    public static final Task<RecaptchaTasksClient> getTasksClient(@NonNull Application application, @NonNull String str, long j) {
        return zzam.zzd(application, str, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: getClient-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m57getClientBWLJW6A(@NonNull Application application, @NonNull String str, long j, @NonNull access13800<? super Result<? extends RecaptchaClient>> access13800Var) {
        Recaptcha$getClient$1 recaptcha$getClient$1;
        if (access13800Var instanceof Recaptcha$getClient$1) {
            recaptcha$getClient$1 = (Recaptcha$getClient$1) access13800Var;
            int i2 = recaptcha$getClient$1.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                recaptcha$getClient$1.zzc = i2 - 2147483648;
            } else {
                recaptcha$getClient$1 = new Recaptcha$getClient$1(this, access13800Var);
            }
        }
        Recaptcha$getClient$1 recaptcha$getClient$12 = recaptcha$getClient$1;
        Object objZzc = recaptcha$getClient$12.zza;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = recaptcha$getClient$12.zzc;
        try {
            if (i3 == 0) {
                ResultKt.onNavigationEvent(objZzc);
                Result.Companion companion = Result.Companion;
                recaptcha$getClient$12.zzc = 1;
                objZzc = zzam.zzc(application, str, j, null, recaptcha$getClient$12);
                if (objZzc == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(objZzc);
            }
            return Result.constructor-impl((zzaw) objZzc);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(th));
        }
    }
}
