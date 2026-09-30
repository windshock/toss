package com.tmoney.c;

import android.content.Context;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class q extends BaseTmoneyCallback {
    AbstractC0045f.a a;
    private final String b;
    private Context c;
    private String d;
    private String e;
    private String f;
    private String g;
    private boolean h;
    private static final byte[] $$a = {80, 83, -21, -55};
    private static final int $$b = 4;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static char[] onExtraCallback = {3907, 60902};
    private static long onNavigationEvent = 6865287912213956958L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = 3 - (i2 * 4);
        byte[] bArr = $$a;
        int i7 = (i * 2) + 97;
        int i8 = i3 * 4;
        byte[] bArr2 = new byte[i8 + 1];
        if (bArr == null) {
            i5 = i6;
            int i9 = i8;
            i4 = 0;
            i6 += i9;
            bArr2[i4] = (byte) i6;
            if (i4 == i8) {
                return new String(bArr2, 0);
            }
            i5++;
            i4++;
            i9 = bArr[i5];
            i6 += i9;
            bArr2[i4] = (byte) i6;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            i6 = i7;
            i5 = i6;
            bArr2[i4] = (byte) i6;
            if (i4 == i8) {
            }
        }
    }

    public q(Context context, String str, String str2, String str3, String str4, boolean z, ResultListener resultListener) throws Throwable {
        super(resultListener);
        this.b = "ServiceJoinInstance";
        Object[] objArr = new Object[1];
        i(ViewConfiguration.getEdgeSlop() >> 16, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 58021), objArr);
        this.d = ((String) objArr[0]).intern();
        this.a = new 3(this);
        this.c = context;
        this.h = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    static /* synthetic */ Context a(q qVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Context context = qVar.c;
        int i5 = i3 + 107;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return context;
    }

    static /* synthetic */ void a(q qVar, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        qVar.onResult(resultType);
        int i4 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
    }

    static /* synthetic */ String b(q qVar) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = qVar.e;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    static /* synthetic */ String c(q qVar) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 111;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = qVar.f;
        int i5 = i2 + 125;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static /* synthetic */ String d(q qVar) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = qVar.g;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0075, code lost:
    
        if (r9.h == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
    
        r1 = com.tmoney.kscc.sslio.constants.CodeConstants.EMBL_SVC_TYP_CD.PREPAID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
    
        r1 = com.tmoney.kscc.sslio.constants.CodeConstants.EMBL_SVC_TYP_CD.POSTPAID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007c, code lost:
    
        r0.execute(r1.getCode(), r9.e, r9.f, r9.g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0089, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008a, code lost:
    
        r1 = r9.d;
        r4 = new java.lang.Object[1];
        i(-android.widget.ExpandableListView.getPackedPositionChild(0), android.graphics.Color.blue(0) + 1, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b0, code lost:
    
        if (android.text.TextUtils.equals(r1, ((java.lang.String) r4[0]).intern()) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b2, code lost:
    
        new com.tmoney.kscc.sslio.a.E(r9.c, r9.a).execute();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00be, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c7, code lost:
    
        if (android.text.TextUtils.equals(r9.d, "5") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c9, code lost:
    
        r1 = com.tmoney.c.q.onExtraCallbackWithResult + 15;
        com.tmoney.c.q.IAuthTabCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d4, code lost:
    
        if (r9.h == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d6, code lost:
    
        com.tmoney.a.getInstance().cardInfo(new com.tmoney.c.q.AnonymousClass1(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f1, code lost:
    
        if (android.text.TextUtils.isEmpty(com.tmoney.preference.TmoneyData.getInstance(r9.c).getCrcmCd()) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f3, code lost:
    
        r1 = com.tmoney.c.q.IAuthTabCallback + 113;
        com.tmoney.c.q.onExtraCallbackWithResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fc, code lost:
    
        if ((r1 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fe, code lost:
    
        r1 = com.tmoney.listener.TmoneyCallback.ResultType.WARNING.setError(com.tmoney.listener.ResultError.UNREGIST_CREDITCARD);
        r2 = com.tmoney.listener.ResultDetailCode.UNREGIST_CREDITCARD;
        onResult(r1.setDetailCode(r2.getCodeString()).setMessage(r2.getMessage()));
        r1 = com.tmoney.c.q.IAuthTabCallback + 23;
        com.tmoney.c.q.onExtraCallbackWithResult = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0124, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0125, code lost:
    
        r0 = com.tmoney.listener.TmoneyCallback.ResultType.WARNING.setError(com.tmoney.listener.ResultError.UNREGIST_CREDITCARD);
        r1 = com.tmoney.listener.ResultDetailCode.UNREGIST_CREDITCARD;
        onResult(r0.setDetailCode(r1.getCodeString()).setMessage(r1.getMessage()));
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0146, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0147, code lost:
    
        new com.tmoney.kscc.sslio.a.F(r9.c, r9.a).execute();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0153, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x015c, code lost:
    
        if (android.text.TextUtils.equals(r9.d, "6") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x015e, code lost:
    
        com.tmoney.g.a.d.getInstance().offerTask(r9.c, new com.tmoney.b.F(getContext(), new com.tmoney.c.q.AnonymousClass2(r9)), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0175, code lost:
    
        r1 = com.tmoney.c.q.IAuthTabCallback + 41;
        com.tmoney.c.q.onExtraCallbackWithResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x017e, code lost:
    
        if ((r1 % 2) != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0180, code lost:
    
        r0 = 22 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0183, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003d, code lost:
    
        if (android.text.TextUtils.equals(r1, ((java.lang.String) r7[0]).intern()) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0068, code lost:
    
        if (android.text.TextUtils.equals(r1, ((java.lang.String) r7[0]).intern()) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006a, code lost:
    
        r0 = new com.tmoney.kscc.sslio.a.C(r9.c, r9.a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void excuteJoin() throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            String str = this.d;
            Object[] objArr = new Object[1];
            i(TextUtils.indexOf("", "", 1, 0), (ViewConfiguration.getScrollBarSize() / 57) + 1, (char) ((AudioTrack.getMaxVolume() > 1.0f ? 1 : (AudioTrack.getMaxVolume() == 1.0f ? 0 : -1)) + 58023), objArr);
        } else {
            String str2 = this.d;
            Object[] objArr2 = new Object[1];
            i(TextUtils.indexOf("", "", 0, 0), 1 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (58023 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr2);
        }
    }

    @Override // com.tmoney.listener.BaseTmoneyCallback
    public final Context getContext() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 57;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Context context = this.c;
        int i4 = i2 + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return context;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void i(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3;
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            i3 = -1401950695;
            i4 = 4;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i6 = $11 + 99;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i8])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 59698), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 18, 10973 - ExpandableListView.getPackedPositionGroup(0L), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - Gravity.getAbsoluteGravity(0, 0)), 31 - KeyEvent.normalizeMetaState(0), 20220 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 49123);
                            int i9 = 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int packedPositionGroup = 1494 - ExpandableListView.getPackedPositionGroup(0L);
                            byte b = (byte) ($$b - 4);
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(absoluteGravity, i9, packedPositionGroup, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        int i10 = $11 + 71;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
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
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
            if (objOnExtraCallback4 == null) {
                char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 49123);
                int mode = View.MeasureSpec.getMode(0) + 44;
                int fadingEdgeLength2 = 1494 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte b3 = (byte) ($$b - i4);
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(fadingEdgeLength, mode, fadingEdgeLength2, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i3 = -1401950695;
            i4 = 4;
        }
        objArr[0] = new String(cArr);
    }
}
