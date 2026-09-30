package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzjg extends zzna<zzto, zzts> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final /* synthetic */ zzje zza;
    private static char[] onExtraCallbackWithResult = {51240, 51243, 65014, 65008};
    private static char onExtraCallback = 51243;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzna
    public final /* synthetic */ zzakk zza(zzakk zzakkVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 117;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        zzto zztoVar = (zzto) zzakkVar;
        ECParameterSpec eCParameterSpecZza = zzwn.zza(zzku.zza(zztoVar.zzc().zzf().zzd()));
        zzwr<zzxd, KeyPairGenerator> zzwrVar = zzwr.zzd;
        Object[] objArr = new Object[1];
        a(new char[]{3, 2}, (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 81), Color.alpha(0) + 2, objArr);
        KeyPairGenerator keyPairGeneratorZza = zzwrVar.zza(((String) objArr[0]).intern());
        keyPairGeneratorZza.initialize(eCParameterSpecZza);
        KeyPair keyPairGenerateKeyPair = keyPairGeneratorZza.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
        ECPoint w = eCPublicKey.getW();
        zzts zztsVar = (zzts) ((zzaja) zzts.zzb().zza(0).zza((zztt) ((zzaja) zztt.zzc().zza(0).zza(zztoVar.zzc()).zza(zzahm.zza(w.getAffineX().toByteArray())).zzb(zzahm.zza(w.getAffineY().toByteArray())).zzf())).zza(zzahm.zza(eCPrivateKey.getS().toByteArray())).zzf());
        int i5 = onNavigationEvent + 35;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return zztsVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzna
    public final /* synthetic */ zzakk zza(zzahm zzahmVar) throws zzajj {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 97;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            zzto zztoVarZza = zzto.zza(zzahmVar, zzaip.zza());
            int i4 = onNavigationEvent + 19;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 39 / 0;
            }
            return zztoVarZza;
        }
        zzto.zza(zzahmVar, zzaip.zza());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzjg(zzje zzjeVar, Class cls) {
        super(cls);
        this.zza = zzjeVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzna
    public final /* synthetic */ void zzb(zzakk zzakkVar) throws GeneralSecurityException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        zzku.zza(((zzto) zzakkVar).zzc());
        int i5 = onWarmupCompleted + 83;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, byte b, int i2, Object[] objArr) throws Throwable {
        int i3;
        Object obj;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallbackWithResult;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int i5 = $10 + 71;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 25, 23138 - ImageFormat.getBitsPerPixel(0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), 26 - View.MeasureSpec.getSize(0), TextUtils.indexOf("", "", 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i2];
            if (i2 % 2 != 0) {
                int i8 = $11 + 9;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    i3 = i2 + 60;
                    cArr4[i3] = (char) (cArr[i3] % b);
                } else {
                    i3 = i2 - 1;
                    cArr4[i3] = (char) (cArr[i3] - b);
                }
            } else {
                i3 = i2;
            }
            if (i3 > 1) {
                int i9 = $10 + 19;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i11 = $10 + 29;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent / 0];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            obj = obj2;
                        } else {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24823 - ImageFormat.getBitsPerPixel(0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 75, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                try {
                                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                    if (objOnExtraCallback4 == null) {
                                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 30, 19488 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                    int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                                } else {
                                    int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                                }
                            }
                        }
                    } else {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            int i17 = 0;
            while (i17 < i2) {
                int i18 = $11 + 5;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    cArr4[i17] = (char) (cArr4[i17] ^ 1673);
                    i17 += 56;
                } else {
                    cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                    i17++;
                }
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }
}
