package com.bytedance.adsdk.ugeno.lud.dj;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.adsdk.ugeno.fby.jw;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jc extends sya implements jw.ycx {
    private boolean dv;
    private int dy;
    private int ea;
    private boolean htf;
    private int ok;
    private final List<ea> oty;
    private int pmi;
    private String ry;
    private int syc;
    private boolean thx;
    private int tn;
    private boolean uh;
    private Handler wie;
    private long wwx;
    private int xkz;
    private static final byte[] $$a = {11, -55, -20, -91};
    private static final int $$b = 213;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int IAuthTabCallback = 1;
    private static char[] onWarmupCompleted = {60858, 18781, 42089, 777};
    private static long onExtraCallback = -2374255297516123844L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i2) {
        int i3;
        int i4;
        int i5 = 3 - (s2 * 4);
        byte[] bArr = $$a;
        int i6 = 1 - (s * 2);
        int i7 = 97 - (i2 * 3);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            int i9 = i5;
            int i10 = i5 + i8;
            i3 = i4;
            int i11 = i9;
            i7 = i10;
            i5 = i11;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            int i12 = i5 + 1;
            if (i4 == i6) {
                return new String(bArr2, 0);
            }
            int i13 = i7;
            i9 = i12;
            i5 = bArr[i12];
            i8 = i13;
            int i102 = i5 + i8;
            i3 = i4;
            int i112 = i9;
            i7 = i102;
            i5 = i112;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            int i122 = i5 + 1;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            int i1222 = i5 + 1;
            if (i4 == i6) {
            }
        }
    }

    public jc(Context context) {
        super(context);
        this.ok = 0;
        this.ry = "";
        this.xkz = 0;
        this.syc = 0;
        this.dy = 0;
        this.wie = new com.bytedance.adsdk.ugeno.fby.jw(Looper.getMainLooper(), this);
        this.pmi = 0;
        this.uh = false;
        this.htf = false;
        this.thx = false;
        this.wwx = 0L;
        this.tn = 0;
        this.dv = false;
        this.oty = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0069, code lost:
    
        if (r1 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006b, code lost:
    
        r8.ry = java.lang.String.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0071, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        r8.ry = "";
        r1 = com.bytedance.adsdk.ugeno.lud.dj.jc.IAuthTabCallback + 119;
        com.bytedance.adsdk.ugeno.lud.dj.jc.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        if (r1 != null) goto L11;
     */
    @Override // com.bytedance.adsdk.ugeno.lud.dj.sya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void sya() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        super.sya();
        Map<String, Object> map = this.lud;
        if (map != null) {
            int i3 = onNavigationEvent + 7;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                a((-1) / ((byte) KeyEvent.getModifierMetaStateMask()), 5 % (Process.myTid() + 63), (char) (ViewConfiguration.getTouchSlop() / 10), objArr);
                obj = map.get(((String) objArr[0]).intern());
            } else {
                Object[] objArr2 = new Object[1];
                a((-1) - ((byte) KeyEvent.getModifierMetaStateMask()), (Process.myTid() >> 22) + 4, (char) (ViewConfiguration.getTouchSlop() >> 8), objArr2);
                obj = map.get(((String) objArr2[0]).intern());
            }
        } else {
            this.ry = "";
        }
    }

    private static void a(int i2, int i3, char c, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i5 = $11 + 17;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i2 + i7])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 59697), ((Process.getThreadPriority(0) + 20) >> 6) + 17, 10973 - (ViewConfiguration.getWindowTouchSlop() >> 8), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 46133), 32 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 20221 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 49123), KeyEvent.keyCodeFromString("") + 44, Color.red(0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i8 = $10 + 103;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 49123), Color.argb(0, 0, 0, 0) + 44, 1494 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i10 = $10 + 31;
            $11 = i10 % 128;
            int i11 = i10 % 2;
        }
        String str = new String(cArr);
        int i12 = $10 + 43;
        $11 = i12 % 128;
        int i13 = i12 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f A[PHI: r0
      0x006f: PHI (r0v15 java.lang.Object) = (r0v14 java.lang.Object), (r0v39 java.lang.Object) binds: [B:12:0x006d, B:9:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    @Override // com.bytedance.adsdk.ugeno.lud.dj.sya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean ycx(Object... objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 21;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Map<String, Object> map = this.lud;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Map<String, Object> map2 = this.lud;
        if (map2 != null) {
            int i4 = IAuthTabCallback + 53;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                a(Process.myPid() << 3, 3 >> (ViewConfiguration.getMaximumDrawingCacheSize() - 113), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 49), objArr2);
                obj = map2.get(((String) objArr2[0]).intern());
                if (obj != null) {
                    this.ry = String.valueOf(obj);
                } else {
                    this.ry = "";
                }
            } else {
                Object[] objArr3 = new Object[1];
                a(Process.myPid() >> 22, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr3);
                obj = map2.get(((String) objArr3[0]).intern());
                if (obj != null) {
                }
            }
            Object obj3 = this.lud.get("condition");
            if (obj3 != null) {
                int i5 = onNavigationEvent + 49;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                this.xkz = com.bytedance.adsdk.ugeno.fby.sya.ycx(String.valueOf(obj3), 0);
            } else {
                this.xkz = 0;
            }
            Object obj4 = this.lud.get("pauseMode");
            if (obj4 != null) {
                this.syc = com.bytedance.adsdk.ugeno.fby.sya.ycx(String.valueOf(obj4), 0);
            } else {
                this.syc = 0;
            }
            Object obj5 = this.lud.get("loop");
            if (obj5 != null) {
                this.ea = com.bytedance.adsdk.ugeno.fby.sya.ycx(String.valueOf(obj5), 1);
            } else {
                this.ea = 1;
                int i7 = onNavigationEvent + 119;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            }
            int i9 = this.ea;
            if (i9 <= 0) {
                this.pmi = -1;
            } else {
                this.pmi = i9;
            }
            Object obj6 = this.lud.get("duration");
            if (obj6 == null) {
                this.ok = 0;
            } else {
                this.ok = com.bytedance.adsdk.ugeno.fby.sya.ycx(String.valueOf(obj6), 0);
            }
        }
        int i10 = this.xkz;
        if (i10 == 0) {
            fby();
            int i11 = onNavigationEvent + 43;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
        } else if (i10 == 1) {
            com.bytedance.adsdk.ugeno.zb.sya syaVar = this.zb;
            if (syaVar == null || syaVar.ea() == null || this.zb.ea().getVisibility() != 0) {
                this.uh = true;
            }
        } else if (i10 == 2) {
            this.uh = true;
        }
        return true;
    }

    private void fby() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 59;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this.htf) {
            return;
        }
        this.htf = true;
        this.uh = false;
        this.thx = false;
        this.tn = 0;
        this.dv = false;
        this.dy = 0;
        ok();
        zb(this.ok);
        jw();
        int i5 = IAuthTabCallback + 57;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
    }

    public void ycx(int i2) {
        int i3 = 2 % 2;
        if (this.xkz == 1 && this.uh) {
            int i4 = onNavigationEvent + 7;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (i2 == 0) {
                fby();
            }
        }
        if (!this.htf || (this.syc & 2) == 0) {
            return;
        }
        int i6 = onNavigationEvent;
        int i7 = i6 + 75;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i2 == 0) {
            this.dy &= -3;
            int i8 = i6 + 11;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        } else {
            this.dy |= 2;
        }
        jw();
        int i10 = onNavigationEvent + 69;
        IAuthTabCallback = i10 % 128;
        int i11 = i10 % 2;
    }

    public void ycx() {
        int i2 = 2 % 2;
        if (this.xkz == 2) {
            int i3 = IAuthTabCallback;
            int i4 = i3 + 51;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (this.uh) {
                int i6 = i3 + 101;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                fby();
            }
        }
        int i8 = IAuthTabCallback + 47;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
    }

    public void ycx(boolean z) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 97;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (!(!this.htf)) {
            int i5 = i3 + 29;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0 || (this.syc & 1) == 0) {
                return;
            }
            if (z) {
                int i6 = i3 + 39;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                this.dy &= -2;
            } else {
                this.dy |= 1;
            }
            jw();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void jw() {
        View viewEa;
        int i2 = 2 % 2;
        if (this.htf) {
            com.bytedance.adsdk.ugeno.zb.sya syaVar = this.zb;
            if (syaVar != null) {
                viewEa = syaVar.ea();
                int i3 = onNavigationEvent + 115;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            } else {
                viewEa = null;
            }
            if ((this.syc & 2) != 0) {
                int i5 = IAuthTabCallback + 61;
                int i6 = i5 % 128;
                onNavigationEvent = i6;
                if (i5 % 2 != 0) {
                    throw null;
                }
                if (viewEa != null) {
                    int i7 = i6 + 103;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 72 / 0;
                        if (viewEa.getVisibility() != 0) {
                            this.dy = 2 | this.dy;
                        }
                    } else if (viewEa.getVisibility() != 0) {
                    }
                }
            }
            if ((this.syc & 1) != 0 && viewEa != null && !viewEa.hasWindowFocus()) {
                this.dy |= 1;
            }
            if (this.dy != 0) {
                jc();
            } else {
                ea();
            }
        }
    }

    private void zb(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 71;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        this.wie.removeMessages(1001);
        long jMax = Math.max(0, i2);
        this.wwx = SystemClock.uptimeMillis() + jMax;
        this.wie.sendEmptyMessageDelayed(1001, jMax);
        int i6 = IAuthTabCallback + 13;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private void jc() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 21;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.thx) {
            return;
        }
        this.tn = (int) Math.max(0L, this.wwx - SystemClock.uptimeMillis());
        this.wie.removeMessages(1001);
        this.thx = true;
        int i4 = IAuthTabCallback + 55;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private void ea() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 41;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this.thx) {
            this.thx = false;
            int i5 = this.tn;
            this.tn = 0;
            zb(i5);
            int i6 = onNavigationEvent + 89;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 79 / 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (r8 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r8 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        zb(r8);
        r8 = com.bytedance.adsdk.ugeno.lud.dj.jc.onNavigationEvent + 65;
        com.bytedance.adsdk.ugeno.lud.dj.jc.IAuthTabCallback = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if ((r8 % 2) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        r8 = 35 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    @Override // com.bytedance.adsdk.ugeno.fby.jw.ycx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ycx(Message message) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 111;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (message.what == 1001) {
            this.ycx.ycx(this.zb, this.lt, this.sya.zb(), this.sya);
            int i6 = this.pmi - 1;
            this.pmi = i6;
            if (i6 < 0) {
                int i7 = IAuthTabCallback;
                int i8 = i7 + 79;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
                int i9 = this.ok;
                if (i9 != 0) {
                    int i10 = i7 + 27;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    zb(i9);
                    return;
                }
            }
            if (i6 > 0) {
                int i12 = onNavigationEvent + 17;
                IAuthTabCallback = i12 % 128;
                if (i12 % 2 == 0) {
                    i2 = this.ok;
                    int i13 = 32 / 0;
                } else {
                    i2 = this.ok;
                }
            }
            this.wie.removeMessages(1001);
            this.wwx = 0L;
            if (!this.dv) {
                int i14 = onNavigationEvent + 55;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2;
                this.dv = true;
                ry();
            }
        }
        int i16 = IAuthTabCallback + 33;
        onNavigationEvent = i16 % 128;
        if (i16 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void ycx(ea eaVar) {
        int i2 = 2 % 2;
        if (eaVar != null) {
            int i3 = IAuthTabCallback + 67;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 94 / 0;
                if (this.oty.contains(eaVar)) {
                    return;
                }
            } else if (this.oty.contains(eaVar)) {
                return;
            }
            this.oty.add(eaVar);
            int i5 = onNavigationEvent + 57;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private void ok() {
        int i2 = 2 % 2;
        if (!this.oty.isEmpty()) {
            Iterator it = new ArrayList(this.oty).iterator();
            int i3 = onNavigationEvent + 89;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            while (it.hasNext()) {
                ((ea) it.next()).ycx(this.ry);
            }
        }
        int i5 = onNavigationEvent + 27;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void ry() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 109;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 80 / 0;
            if (!this.oty.isEmpty()) {
                Iterator it = new ArrayList(this.oty).iterator();
                while (it.hasNext()) {
                    ((ea) it.next()).zb(this.ry);
                }
            }
        } else if (!this.oty.isEmpty()) {
        }
        int i5 = onNavigationEvent + 79;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String zb() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 63;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        String str = this.ry;
        int i5 = i3 + 53;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
