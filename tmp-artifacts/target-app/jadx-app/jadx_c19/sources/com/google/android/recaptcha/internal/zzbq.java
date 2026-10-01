package com.google.android.recaptcha.internal;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbq {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 9896;
    private static int asBinder = 1;
    private static char onExtraCallback = 56156;
    private static char onExtraCallbackWithResult = 31359;
    private static char onNavigationEvent = 53769;
    private static int onWarmupCompleted;
    private final zzh zza;
    private final zzbg zzb;

    public zzbq(@Nullable zzh zzhVar, @Nullable zzbg zzbgVar) {
        this.zza = zzhVar;
        this.zzb = zzbgVar;
    }

    public final zzoe zza(@NotNull String str, @NotNull byte[] bArr, @NotNull zzbd zzbdVar) throws Throwable {
        int i2 = 2 % 2;
        zzbb zzbbVarZza = zzbdVar.zza(zzne.zzh);
        zzbg zzbgVar = this.zzb;
        Object obj = null;
        zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            Object[] objArr = new Object[1];
            a(new char[]{58054, 30719, 64307, 19502}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, objArr);
            httpURLConnection.setRequestMethod(((String) objArr[0]).intern());
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty(RtspHeaders.ACCEPT, "application/x-protobuffer");
            try {
                httpURLConnection.connect();
                httpURLConnection.getOutputStream().write(bArr);
                if (httpURLConnection.getResponseCode() != 200) {
                    if (httpURLConnection.getResponseCode() == 400) {
                        throw zzo.zza(zzoz.zzg(httpURLConnection.getErrorStream()).zzi());
                    }
                    throw zzbr.zza(httpURLConnection.getResponseCode());
                }
                int i3 = asBinder + 49;
                onWarmupCompleted = i3 % 128;
                try {
                    if (i3 % 2 == 0) {
                        zzoe zzoeVarZzi = zzoe.zzi(httpURLConnection.getInputStream());
                        this.zzb.zza(zzbbVarZza);
                        return zzoeVarZzi;
                    }
                    zzoe.zzi(httpURLConnection.getInputStream());
                    this.zzb.zza(zzbbVarZza);
                    obj.hashCode();
                    throw null;
                } catch (Exception unused) {
                    throw new zzp(zzn.zzc, zzl.zzR, null);
                }
            } catch (Exception e) {
                if (!(e instanceof zzp)) {
                    throw new zzp(zzn.zze, zzl.zzQ, null);
                }
                int i4 = onWarmupCompleted + 81;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                throw ((zzp) e);
            }
        } catch (zzp e2) {
            this.zzb.zzb(zzbbVarZza, e2, null);
            throw e2.zzc();
        }
    }

    public final String zzb(@NotNull zzoe zzoeVar, @NotNull zzbd zzbdVar) throws Exception {
        String text;
        int i2 = 2 % 2;
        try {
            String strZzk = zzoeVar.zzk();
            String strZzH = zzoeVar.zzH();
            if (this.zza.zzd(strZzH)) {
                zzbb zzbbVarZza = zzbdVar.zza(zzne.zzk);
                zzbg zzbgVar = this.zzb;
                zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
                try {
                    text = this.zza.zza(strZzH);
                    if (text != null) {
                        this.zzb.zza(zzbbVarZza);
                        int i3 = onWarmupCompleted + 91;
                        asBinder = i3 % 128;
                        int i4 = i3 % 2;
                    }
                } catch (Exception unused) {
                    this.zzb.zzb(zzbbVarZza, new zzp(zzn.zzn, zzl.zzad, null), null);
                }
                this.zzb.zzb(zzbbVarZza, new zzp(zzn.zzn, zzl.zzae, null), null);
                int i5 = onWarmupCompleted + 47;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                text = null;
            } else {
                int i52 = onWarmupCompleted + 47;
                asBinder = i52 % 128;
                int i62 = i52 % 2;
                text = null;
            }
            if (text == null) {
                this.zza.zzb();
                zzbb zzbbVarZza2 = zzbdVar.zza(zzne.zzi);
                try {
                    zzbg zzbgVar2 = this.zzb;
                    zzbgVar2.zze.put(zzbbVarZza2, new zzbf(zzbbVarZza2, zzbgVar2.zza, new zzac()));
                    try {
                        try {
                            URLConnection uRLConnectionOpenConnection = new URL(strZzk).openConnection();
                            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "");
                            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                            Object[] objArr = new Object[1];
                            a(new char[]{52439, 27745, 42326, 12837}, KeyEvent.normalizeMetaState(0) + 3, objArr);
                            httpURLConnection.setRequestMethod(((String) objArr[0]).intern());
                            httpURLConnection.setDoInput(true);
                            httpURLConnection.setRequestProperty(RtspHeaders.ACCEPT, "application/x-protobuffer");
                            Object[] objArr2 = new Object[1];
                            a(new char[]{43101, 6828, 29516, 2678, 41333, 3379, 59809, 25347, 25158, 64623, 51636, 15215, 27760, 56175, 53235, 8220}, 15 - TextUtils.getOffsetAfter("", 0), objArr2);
                            httpURLConnection.setRequestProperty(((String) objArr2[0]).intern(), "gzip");
                            httpURLConnection.connect();
                            if (httpURLConnection.getResponseCode() != 200) {
                                throw new zzp(zzn.zze, new zzl(httpURLConnection.getResponseCode()), null);
                            }
                            try {
                                text = TextStreamsKt.readText(Intrinsics.areEqual("gzip", httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream())) : new InputStreamReader(httpURLConnection.getInputStream()));
                                this.zzb.zza(zzbbVarZza2);
                                zzbb zzbbVarZza3 = zzbdVar.zza(zzne.zzj);
                                try {
                                    zzbg zzbgVar3 = this.zzb;
                                    zzbgVar3.zze.put(zzbbVarZza3, new zzbf(zzbbVarZza3, zzbgVar3.zza, new zzac()));
                                    this.zza.zzc(strZzH, text);
                                    this.zzb.zza(zzbbVarZza3);
                                } catch (Exception unused2) {
                                    this.zzb.zzb(zzbbVarZza3, new zzp(zzn.zzn, zzl.zzaf, null), null);
                                }
                            } catch (Exception unused3) {
                                throw new zzp(zzn.zze, zzl.zzab, null);
                            }
                        } catch (Exception unused4) {
                            throw new zzp(zzn.zze, zzl.zzaa, null);
                        }
                    } catch (Exception unused5) {
                        throw new zzp(zzn.zzc, zzl.zzZ, null);
                    }
                } catch (zzp e) {
                    this.zzb.zzb(zzbbVarZza2, e, null);
                    throw e;
                }
            } else {
                int i7 = onWarmupCompleted + 121;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
            }
            return StringsKt.replace$default(zzoeVar.zzj(), "JAVASCRIPT_TAG", text, false, 4, (Object) null);
        } catch (Exception e2) {
            if (e2 instanceof zzp) {
                throw e2;
            }
            throw new zzp(zzn.zzc, zzl.zzX, null);
        }
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $11 + 33;
            $10 = i6 % 128;
            int i7 = 58224;
            char c = 1;
            if (i6 % 2 != 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i5] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent / i5];
                i3 = 1;
            } else {
                cArr3[i5] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i3 = i5;
            }
            while (i3 < 16) {
                int i8 = $10 + 121;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i5];
                char[] cArr4 = cArr3;
                int i10 = (c3 + i7) ^ ((c3 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallback);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i12 = 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int iCombineMeasuredStates = 12434 - View.combineMeasuredStates(0, 0);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(jumpTapTimeout, i12, iCombineMeasuredStates, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), TextUtils.indexOf("", "", 0) + 10, 12434 - (ViewConfiguration.getScrollBarSize() >> 8), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i3++;
                    cArr3 = cArr4;
                    i5 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 16014), 13 - Process.getGidForName(""), 19901 - (ViewConfiguration.getPressedStateDuration() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }
}
