package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzji extends zzoi<zzbs, zztt> {
    private static final byte[] $$a = {7, 75, -84, -52};
    private static final int $$b = 7;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static long onNavigationEvent = 135979706776377100L;
    private static int IAuthTabCallback = -1776194565;
    private static char onWarmupCompleted = 27643;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, byte b3) {
        int i2;
        int i3 = 4 - (b * 2);
        byte[] bArr = $$a;
        int i4 = b2 * 3;
        int i5 = 110 - b3;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = i4;
            i2 = 0;
            i3++;
            i5 = i6 + (-i7);
            int i8 = i5;
            int i9 = i3;
            bArr2[i2] = (byte) i8;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i2++;
            i7 = bArr[i9];
            i6 = i8;
            i3 = i9;
            i3++;
            i5 = i6 + (-i7);
            int i82 = i5;
            int i92 = i3;
            bArr2[i2] = (byte) i82;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            int i822 = i5;
            int i922 = i3;
            bArr2[i2] = (byte) i822;
            if (i2 == i4) {
            }
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzoi
    public final /* synthetic */ zzbs zza(zzakk zzakkVar) throws Throwable {
        int i2 = 2 % 2;
        zztt zzttVar = (zztt) zzakkVar;
        zztp zztpVarZzb = zzttVar.zzb();
        zztw zztwVarZzf = zztpVarZzb.zzf();
        zzwq zzwqVarZza = zzku.zza(zztwVarZzf.zzd());
        byte[] bArrZzg = zzttVar.zzf().zzg();
        byte[] bArrZzg2 = zzttVar.zzg().zzg();
        ECParameterSpec eCParameterSpecZza = zzwn.zza(zzwqVarZza);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArrZzg), new BigInteger(1, bArrZzg2));
        zzmd.zza(eCPoint, eCParameterSpecZza.getCurve());
        ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(eCPoint, eCParameterSpecZza);
        zzwr<zzxe, KeyFactory> zzwrVar = zzwr.zze;
        Object[] objArr = new Object[1];
        a((char) (19558 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), ViewConfiguration.getKeyRepeatDelay() >> 16, new char[]{43683, 48104}, new char[]{15607, 12592, 5348, 28121}, new char[]{491, 16245, 26253, 39244}, objArr);
        zzwm zzwmVar = new zzwm((ECPublicKey) zzwrVar.zza(((String) objArr[0]).intern()).generatePublic(eCPublicKeySpec), zztwVarZzf.zzf().zzg(), zzku.zza(zztwVarZzf.zze()), zzku.zza(zztpVarZzb.zza()), new zzkw(zztpVarZzb.zzb().zzd()));
        int i3 = onExtraCallbackWithResult + 73;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return zzwmVar;
    }

    zzji(Class cls) {
        super(cls);
    }

    private static void a(char c, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 13;
            $11 = i5 % 128;
            int i6 = i5 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), TextUtils.indexOf("", "", 0, 0) + 43, 1451 - TextUtils.indexOf("", "", 0), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.MeasureSpec.getSize(0)), 44 - Drawable.resolveOpacity(0, 0), 1494 - TextUtils.getOffsetAfter("", 0), 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0, 0) + 23972), View.MeasureSpec.getSize(0) + 50, 22938 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 45848), ((Process.getThreadPriority(0) + 20) >> 6) + 29, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12576, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (IAuthTabCallback ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i7 = $11 + 29;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                i3 = 2;
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
}
