package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzuj implements zzajf {
    private static int onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    private static long onWarmupCompleted;
    public static final zzuj zza;
    public static final zzuj zzb;
    public static final zzuj zzc;
    public static final zzuj zzd;
    public static final zzuj zze;
    private static final zzaje<zzuj> zzf;
    private static final /* synthetic */ zzuj[] zzg;
    private final int zzh;
    private static final byte[] $$a = {120, 11, 65, 93};
    private static final int $$b = 184;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, int i2) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 97 - (b * 4);
        int i5 = s * 2;
        int i6 = i2 + 4;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            i4 = i7;
            int i8 = i6;
            int i9 = 0;
            i4 += -i6;
            i6 = i8;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            int i10 = i3 + 1;
            int i11 = i6 + 1;
            i8 = i11;
            i6 = bArr[i11];
            i9 = i10;
            i4 += -i6;
            i6 = i8;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzajf
    public final int zza() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 69;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == zze) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        int i5 = this.zzh;
        int i6 = i4 + 109;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 16 / 0;
        }
        return i5;
    }

    public static zzuj zza(int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 25;
        int i5 = i4 % 128;
        IAuthTabCallbackDefault = i5;
        int i6 = i4 % 2;
        if (i2 == 0) {
            return zza;
        }
        if (i2 == 1) {
            zzuj zzujVar = zzb;
            int i7 = i5 + 29;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return zzujVar;
        }
        if (i2 == 2) {
            return zzc;
        }
        if (i2 == 3) {
            return zzd;
        }
        int i9 = i5 + 53;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        return null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzuj.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != zze) {
            int i3 = IAuthTabCallbackDefault + 101;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                sb.append(" number=");
                sb.append(zza());
                throw null;
            }
            sb.append(" number=");
            sb.append(zza());
            int i4 = IAuthTabCallbackDefault + 99;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    static {
        onExtraCallback = 0;
        onExtraCallback();
        zzuj zzujVar = new zzuj("AEAD_UNKNOWN", 0, 0);
        zza = zzujVar;
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getMinimumFlingVelocity() >> 16, 10 - Process.getGidForName(""), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        zzuj zzujVar2 = new zzuj(((String) objArr[0]).intern(), 1, 1);
        zzb = zzujVar2;
        Object[] objArr2 = new Object[1];
        a(KeyEvent.keyCodeFromString("") + 11, Color.green(0) + 11, (char) Color.green(0), objArr2);
        zzuj zzujVar3 = new zzuj(((String) objArr2[0]).intern(), 2, 2);
        zzc = zzujVar3;
        zzuj zzujVar4 = new zzuj("CHACHA20_POLY1305", 3, 3);
        zzd = zzujVar4;
        zzuj zzujVar5 = new zzuj("UNRECOGNIZED", 4, -1);
        zze = zzujVar5;
        zzg = new zzuj[]{zzujVar, zzujVar2, zzujVar3, zzujVar4, zzujVar5};
        zzf = new zzaje<zzuj>() { // from class: com.google.android.gms.internal.firebase-auth-api.zzul
        };
        int i2 = onNavigationEvent + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private zzuj(String str, int i2, int i3) {
        this.zzh = i3;
    }

    public static zzuj[] values() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 21;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        zzuj[] zzujVarArr = (zzuj[]) zzg.clone();
        int i5 = IAuthTabCallback + 121;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return zzujVarArr;
    }

    private static void a(int i2, int i3, char c, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i5 = $10 + 19;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i2 << i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - View.resolveSizeAndState(0, 0, 0)), Process.getGidForName("") + 18, 11021 - AndroidCharacter.getMirror('0'), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - TextUtils.getCapsMode("", 0, 0)), (-16777185) - Color.rgb(0, 0, 0), 20220 - ((Process.getThreadPriority(0) + 20) >> 6), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 44 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1494 - (ViewConfiguration.getPressedStateDuration() >> 16), -1657859959, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr5 = {Integer.valueOf(onExtraCallbackWithResult[i2 + i7])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 17 - (Process.myTid() >> 22), 10973 - (Process.myTid() >> 22), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 31, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i7] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                        Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback6 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 43, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1494, -1657859959, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback6).invoke(null, objArr7);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }
        char[] cArr = new char[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 49124), MotionEvent.axisFromString("") + 45, View.getDefaultSize(0, 0) + 1494, -1657859959, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
            int i8 = $10 + 41;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        String str = new String(cArr);
        int i10 = $10 + 47;
        $11 = i10 % 128;
        if (i10 % 2 != 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = new char[]{60821, 33537, 12455, 42555, 22437, 50486, 31372, 59515, 39187, 3719, 48185, 60821, 33537, 12455, 42555, 22438, 50481, 31362, 59515, 39187, 3719, 48185};
        onWarmupCompleted = 3382930095026766660L;
    }
}
