package com.google.android.gms.internal.p000firebaseauthapi;

import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzwe extends ThreadLocal<Cipher> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = {27174, 27285, 27307, 27309, 27287, 27281, 27297, 27326, 27303, 27309, 27307, 27305, 27298, 27301, 27307, 27306, 27299};
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Cipher initialValue() throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 103;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return zza();
        }
        zza();
        throw null;
    }

    private static Cipher zza() throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 95;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        try {
            zzwr<zzxc, Cipher> zzwrVar = zzwr.zza;
            Object[] objArr = new Object[1];
            a(new int[]{0, 17, 161, 14}, false, new byte[]{0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0}, objArr);
            Cipher cipherZza = zzwrVar.zza(((String) objArr[0]).intern());
            int i5 = onExtraCallback + 3;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return cipherZza;
            }
            throw null;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    zzwe() {
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = IAuthTabCallback;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 35235), 35 - View.MeasureSpec.getMode(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i8 = $11 + 99;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 10935), 65 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 16719 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), 29 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 17657 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 70 - View.combineMeasuredStates(0, 0), 12487 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i12 = $10 + 91;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                System.arraycopy(cArr5, 1, cArr3, i4 / i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i4 << i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i13 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i13, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i13);
            }
        }
        if (z) {
            char[] cArr7 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i14 = $11 + 33;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[i4 >>> trackGroupExternalSyntheticLambda0.onNavigationEvent];
                } else {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
