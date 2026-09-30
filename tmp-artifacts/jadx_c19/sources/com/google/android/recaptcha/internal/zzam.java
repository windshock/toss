package com.google.android.recaptcha.internal;

import android.app.Application;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.doGet;
import o.jni_YGNodeStyleGetFlexBasisJNI;
import o.jni_YGNodeStyleGetFlexGrowJNI;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzam {
    private static int IAuthTabCallback;
    private static long onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;
    public static final zzam zza;
    private static zzaw zzb;
    private static final String zzc;
    private static final jni_YGNodeStyleGetFlexBasisJNI zzd;
    private static final zzt zze;
    private static zzg zzf;
    private static final byte[] $$a = {9, 8, 112, 107};
    private static final int $$b = 80;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, byte b, int i3) {
        int i4;
        byte[] bArr = $$a;
        int i5 = i3 * 2;
        int i6 = 4 - (i2 * 4);
        int i7 = 110 - b;
        byte[] bArr2 = new byte[1 - i5];
        int i8 = 0 - i5;
        if (bArr == null) {
            int i9 = i7;
            i4 = 0;
            int i10 = i6;
            i6++;
            i7 = i10 + (-i9);
            int i11 = i7;
            int i12 = i6;
            bArr2[i4] = (byte) i11;
            if (i4 == i8) {
                return new String(bArr2, 0);
            }
            i4++;
            i9 = bArr[i12];
            i10 = i11;
            i6 = i12;
            i6++;
            i7 = i10 + (-i9);
            int i112 = i7;
            int i122 = i6;
            bArr2[i4] = (byte) i112;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            int i1122 = i7;
            int i1222 = i6;
            bArr2[i4] = (byte) i1122;
            if (i4 == i8) {
            }
        }
    }

    static {
        onNavigationEvent = 0;
        IAuthTabCallback();
        zza = new zzam();
        zzc = UUID.randomUUID().toString();
        List list = null;
        zzd = jni_YGNodeStyleGetFlexGrowJNI.IAuthTabCallback(false, 1, (Object) null);
        zze = new zzt();
        zzf = new zzg(list, 1, list);
        int i2 = onExtraCallback + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    private zzam() {
    }

    public static /* synthetic */ Object zzb(zzam zzamVar, Application application, String str, long j, zzab zzabVar, WebView webView, zzbq zzbqVar, zzt zztVar, access13800 access13800Var, int i2, Object obj) throws Throwable {
        int i3 = 2 % 2;
        Object[] objArr = new Object[1];
        a((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 48223), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, new char[]{23025, 21055, 1930, 18501, 5462, 40217, 6626, 46570, 59702, 63608, 29643, 6633, 64190, 11790, 44029, 26094, 22855, 43753, 24825, 15690, 8164, 47077, 26656, 61546, 15992, 35349, 27070, 7347, 9495, 50935, 10554, 11293, 65282, 3612, 33405, 14529, 33238, 40697, 32428, 63475}, new char[]{45452, 15771, 57403, 34879}, new char[]{51861, 46131, 24518, 30652}, objArr);
        Object objZza = zzamVar.zza(application, str, j, new zzab(((String) objArr[0]).intern()), null, null, zze, access13800Var);
        int i4 = IAuthTabCallbackDefault + 9;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return objZza;
    }

    public static final Object zzc(@NotNull Application application, @NotNull String str, long j, @Nullable zzbq zzbqVar, @NotNull access13800 access13800Var) throws RecaptchaException, WebResourceResponseModel, ApiException {
        int i2 = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(zze.zzb().getCoroutineContext(), new zzah(application, str, j, null, null), access13800Var);
        int i3 = IAuthTabCallbackStub + 93;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 77 / 0;
        }
        return objOnExtraCallback;
    }

    public static final Task zzd(@NotNull Application application, @NotNull String str, long j) throws RecaptchaException, WebResourceResponseModel, ApiException {
        int i2 = 2 % 2;
        Task taskZza = zzj.zza(maybeUpdateAnimatable.onExtraCallback(zze.zzb(), (CoroutineContext) null, (setRandomHost) null, new zzak(application, str, j, null), 3, (Object) null));
        int i3 = IAuthTabCallbackStub + 99;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return taskZza;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final zzg zze() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 89;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        zzg zzgVar = zzf;
        int i6 = i4 + 123;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return zzgVar;
    }

    public static final void zzf(@NotNull zzg zzgVar) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 23;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        int i5 = i3 % 2;
        zzf = zzgVar;
        int i6 = i4 + 3;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(@NotNull Application application, @NotNull String str, long j, @NotNull zzab zzabVar, @Nullable WebView webView, @Nullable zzbq zzbqVar, @NotNull zzt zztVar, @NotNull access13800 access13800Var) throws Throwable {
        zzai zzaiVar;
        zzai zzaiVar2;
        zzt zztVar2;
        Application application2;
        String str2;
        zzab zzabVar2;
        long j2;
        zzaw zzawVar;
        zzbd zzbdVar;
        zzbg zzbgVar;
        zzai zzaiVar3;
        int i2 = 2 % 2;
        if (access13800Var instanceof zzai) {
            zzaiVar = (zzai) access13800Var;
            int i3 = zzaiVar.zzg;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zzaiVar.zzg = i3 - 2147483648;
            } else {
                zzaiVar = new zzai(this, access13800Var);
            }
        }
        Object obj = zzaiVar.zze;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = zzaiVar.zzg;
        DefaultConstructorMarker defaultConstructorMarker = null;
        try {
        } catch (Throwable th) {
            th = th;
            zzaiVar2 = zzaiVar;
        }
        try {
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                zzaiVar2 = zzd;
                zzaiVar.zza = application;
                zzaiVar.zzb = str;
                zzaiVar.zzc = zzabVar;
                zzaiVar.zzi = zztVar;
                zzaiVar.zzh = zzaiVar2;
                zzaiVar.zzd = j;
                zzaiVar.zzg = 1;
                if (zzaiVar2.IAuthTabCallback((Object) null, zzaiVar) != objOnWarmupCompleted) {
                    zztVar2 = zztVar;
                    application2 = application;
                    str2 = str;
                    zzabVar2 = zzabVar;
                    j2 = j;
                }
                return objOnWarmupCompleted;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zzbgVar = (zzbg) zzaiVar.zzc;
                zzbdVar = (zzbd) zzaiVar.zzb;
                zzaiVar3 = (jni_YGNodeStyleGetFlexBasisJNI) zzaiVar.zza;
                try {
                    ResultKt.onNavigationEvent(obj);
                    zzawVar = (zzaw) obj;
                    zzb = zzawVar;
                    zzbgVar.zza(zzbdVar.zza(zzne.zzg));
                    zzaiVar2 = zzaiVar3;
                    zzaiVar2.onWarmupCompleted((Object) null);
                    return zzawVar;
                } catch (RecaptchaException e) {
                    throw e;
                } catch (Exception unused) {
                    throw new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null);
                }
            }
            j2 = zzaiVar.zzd;
            zzaiVar2 = zzaiVar.zzh;
            zzt zztVar3 = zzaiVar.zzi;
            zzab zzabVar3 = (zzab) zzaiVar.zzc;
            String str3 = (String) zzaiVar.zzb;
            Application application3 = (Application) zzaiVar.zza;
            ResultKt.onNavigationEvent(obj);
            zztVar2 = zztVar3;
            zzabVar2 = zzabVar3;
            application2 = application3;
            str2 = str3;
            String string = UUID.randomUUID().toString();
            zzbd zzbdVar2 = new zzbd(zzc, string, defaultConstructorMarker);
            zzbdVar2.zzc(string);
            zzbg zzbgVar2 = new zzbg(str2, application2, zzabVar2, zztVar2, new zzbm(application2, new zzbo(zzabVar2.zzc()), zztVar2.zza()));
            zzne zzneVar = zzne.zzg;
            zzbb zzbbVarZza = zzbdVar2.zza(zzneVar);
            zzbgVar2.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar2.zza, new zzac()));
            if (j2 < 5000) {
                zzbgVar2.zzb(zzbdVar2.zza(zzneVar), new zzp(zzn.zzm, zzl.zzT, null), null);
                throw new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
            }
            if (ContextCompat.checkSelfPermission(application2, "android.permission.INTERNET") != 0) {
                zzbgVar2.zzb(zzbdVar2.zza(zzneVar), new zzp(zzn.zze, zzl.zzv, null), null);
                throw new RecaptchaException(RecaptchaErrorCode.NETWORK_ERROR, null, 2, null);
            }
            zzbq zzbqVar2 = new zzbq(new zzy(application2), zzbgVar2);
            zzawVar = zzb;
            if (zzawVar != null) {
                int i5 = IAuthTabCallbackStub + 115;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                if (Intrinsics.areEqual(zzawVar.zzg(), str2)) {
                    zzbgVar2.zza(zzbdVar2.zza(zzneVar));
                    zzaiVar2.onWarmupCompleted((Object) null);
                    return zzawVar;
                }
                throw new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, "Only one site key can be used per runtime. The site key you provided " + str2 + " is different than " + zzawVar.zzg());
            }
            zzaiVar.zza = zzaiVar2;
            zzaiVar.zzb = zzbdVar2;
            zzaiVar.zzc = zzbgVar2;
            zzaiVar.zzi = null;
            zzaiVar.zzh = null;
            zzaiVar.zzg = 2;
            Object objOnNavigationEvent = doGet.onNavigationEvent(j2, new zzaj(application2, zzabVar2, str2, zzbqVar2, zzbdVar2, zztVar2, null, zzbgVar2, j2, null), zzaiVar);
            if (objOnNavigationEvent != objOnWarmupCompleted) {
                int i7 = IAuthTabCallbackStub + 81;
                IAuthTabCallbackDefault = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
                zzbdVar = zzbdVar2;
                zzbgVar = zzbgVar2;
                obj = objOnNavigationEvent;
                zzaiVar3 = zzaiVar2;
                zzawVar = (zzaw) obj;
                zzb = zzawVar;
                zzbgVar.zza(zzbdVar.zza(zzne.zzg));
                zzaiVar2 = zzaiVar3;
                zzaiVar2.onWarmupCompleted((Object) null);
                return zzawVar;
            }
            return objOnWarmupCompleted;
        } catch (RecaptchaException e2) {
            throw e2;
        } catch (Exception unused2) {
            throw new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null);
        } catch (Throwable th2) {
            th = th2;
            zzaiVar2.onWarmupCompleted((Object) null);
            throw th;
        }
    }

    private static void a(char c, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i6 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i7 = $10 + 63;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i9 = $10 + 99;
            $11 = i9 % 128;
            int i10 = i9 % i4;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char gidForName = (char) (Process.getGidForName("") + 1);
                    int mirror = AndroidCharacter.getMirror('0') - 5;
                    int iResolveSize = View.resolveSize(i6, i6) + 1451;
                    byte b = (byte) i6;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i6] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(gidForName, mirror, iResolveSize, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char c2 = (char) (49123 - (TypedValue.complexToFloat(i6) > 0.0f ? 1 : (TypedValue.complexToFloat(i6) == 0.0f ? 0 : -1)));
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 44;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i6, i6) + 1495;
                    byte b3 = (byte) i6;
                    byte b4 = (byte) (b3 + 1);
                    String str$$c2 = $$c(b3, b4, (byte) (b4 - 1));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i6] = Object.class;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, pressedStateDuration, iIndexOf, 1533236389, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i11 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i11);
                objArr4[i6] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    char keyRepeatDelay = (char) (23972 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    int i12 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49;
                    int i13 = 22940 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i6] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(keyRepeatDelay, i12, i13, 1872485556, false, "k", clsArr3);
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i14 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i6] = Integer.valueOf(i14);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    char c3 = (char) (45849 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int scrollDefaultDelay = 29 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int i15 = 12577 - (ExpandableListView.getPackedPositionForGroup(i6) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i6) == 0L ? 0 : -1));
                    i3 = 2;
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i6] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, scrollDefaultDelay, i15, 1401536470, false, "l", clsArr4);
                } else {
                    i3 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (IAuthTabCallback ^ 7798559133331975163L)) ^ ((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i4 = i3;
                i6 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = -2015945714718549385L;
        IAuthTabCallback = -1776194565;
        onWarmupCompleted = (char) 27643;
    }
}
