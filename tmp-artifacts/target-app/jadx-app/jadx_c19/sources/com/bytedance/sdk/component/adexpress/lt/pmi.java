package com.bytedance.sdk.component.adexpress.lt;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class pmi extends LinearLayout {
    private com.bytedance.sdk.component.utils.dv dj;
    private int ea;
    private LinearLayout fby;
    private int jc;
    private int jw;
    private TextView lt;
    private TextView lud;
    private JSONObject ok;
    private ImageView sya;
    private ycx ul;
    private TextView ycx;
    private TextView zb;
    private static final byte[] $$a = {87, -2, 11, -41};
    private static final int $$b = 93;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onExtraCallback = 478308872;

    public interface ycx {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, int i2) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 105 - (i2 * 2);
        int i5 = b2 * 2;
        int i6 = (b * 4) + 4;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i6;
            i4 = i7;
            i3 = 0;
            i6++;
            i4 += -i8;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i3++;
            i8 = bArr[i6];
            i6++;
            i4 += -i8;
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

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    static /* synthetic */ ImageView ycx(pmi pmiVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 81;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        ImageView imageView = pmiVar.sya;
        int i6 = i3 + 19;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return imageView;
    }

    public pmi(@NonNull Context context, View view, int i2, int i3, int i4, JSONObject jSONObject) {
        super(context);
        this.jw = i2;
        this.jc = i3;
        this.ea = i4;
        this.ok = jSONObject;
        ycx(context, view);
    }

    protected void ycx(Context context, View view) {
        int i2 = 2 % 2;
        addView(view);
        this.fby = (LinearLayout) findViewById(2097610727);
        this.sya = (ImageView) findViewById(2097610725);
        this.ycx = (TextView) findViewById(2097610724);
        this.zb = (TextView) findViewById(2097610726);
        this.lud = (TextView) findViewById(2097610723);
        this.lt = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.fby.setBackground(gradientDrawable);
        int i3 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if ((r4 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        r3.lud.setText(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) != true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r3.lud.setVisibility(8);
        r3.lt.setVisibility(8);
        r4 = com.bytedance.sdk.component.adexpress.lt.pmi.IAuthTabCallback + 3;
        com.bytedance.sdk.component.adexpress.lt.pmi.onExtraCallbackWithResult = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setShakeText(String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 13 / 0;
        }
    }

    public LinearLayout getShakeLayout() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 47;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LinearLayout linearLayout = this.fby;
        int i5 = i4 + 41;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return linearLayout;
    }

    public void setOnShakeViewListener(ycx ycxVar) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 41;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        this.ul = ycxVar;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 7;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 6 / 0;
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.lt.pmi$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (pmi.ycx(pmi.this) != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new zb(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.lt.pmi.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        pmi.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.lt.pmi.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                pmi.ycx(pmi.this).startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }
                });
                pmi.ycx(pmi.this).startAnimation(rotateAnimation);
            }
        }
    }

    public void ycx() throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        a(View.getDefaultSize(0, 0) + 5, 3 - TextUtils.getTrimmedLength(""), new char[]{'\t', 1, 65530, 65530, 5}, false, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 136, objArr);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, ((String) objArr[0]).intern(), 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
        int i3 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    static class zb implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return f <= 0.25f ? (f * (-2.0f)) + 0.5f : f <= 0.5f ? (f * 4.0f) - 1.0f : f <= 0.75f ? (f * (-4.0f)) + 3.0f : (f * 2.0f) - 1.5f;
        }

        private zb() {
        }

        /* synthetic */ zb(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i2, int i3, char[] cArr, boolean z, int i4, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            j = 0;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35124 - Process.getGidForName("")), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22, 10278 - (ViewConfiguration.getTapTimeout() >> 16), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12842), 55 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2166 - Process.getGidForName(""), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            int i7 = $11 + 67;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i9 = $10 + 11;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i11 = $10 + 49;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 << simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) / 0];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 12843), (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 55, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - ((byte) KeyEvent.getModifierMetaStateMask())), 54 - MotionEvent.axisFromString(""), AndroidCharacter.getMirror('0') + 2119, 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                j = 0;
            }
            int i12 = $11 + 35;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onAttachedToWindow() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            super.onAttachedToWindow();
            if (!isShown()) {
                return;
            }
            int i4 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 61 / 0;
                if (this.dj == null) {
                    this.dj = new com.bytedance.sdk.component.utils.dv(getContext().getApplicationContext(), 1);
                    int i6 = IAuthTabCallback + 103;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                }
            } else if (this.dj == null) {
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.lt.pmi.2
            };
            return;
        }
        super.onAttachedToWindow();
        isShown();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        super.onDetachedFromWindow();
        int i5 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }
}
