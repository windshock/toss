package com.bytedance.sdk.component.adexpress.dynamic.animation.ycx;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.ariver.kernel.RVParams;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jc extends dj {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = -8433918357411751842L;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private ycx dj;
    private float lt;
    private float lud;

    static /* synthetic */ ycx ycx(jc jcVar) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 67;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        ycx ycxVar = jcVar.dj;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 91;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return ycxVar;
    }

    static /* synthetic */ float zb(jc jcVar) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        float f = jcVar.lud;
        if (i4 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public jc(View view, com.bytedance.sdk.component.adexpress.dynamic.dj.ycx ycxVar) {
        super(view, ycxVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ycx.dj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    List<ObjectAnimator> ycx() throws Throwable {
        int i2;
        String str;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            boolean z = this.sya instanceof ImageView;
            obj.hashCode();
            throw null;
        }
        View view = this.sya;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud)) {
            this.sya = (View) this.sya.getParent();
        }
        this.sya.setAlpha(0.0f);
        Object[] objArr = new Object[1];
        a(new char[]{7432, 49466, 42343, 35260, 28148}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 56383, objArr);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.sya, ((String) objArr[0]).intern(), 0.0f, 1.0f).setDuration((int) (this.zb.jc() * 1000.0d));
        this.dj = new ycx(this.sya);
        final int i5 = this.sya.getLayoutParams().height;
        this.lud = i5;
        this.lt = this.sya.getLayoutParams().width;
        if (!TtmlNode.LEFT.equals(this.zb.ycx())) {
            int i6 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                TtmlNode.RIGHT.equals(this.zb.ycx());
                obj.hashCode();
                throw null;
            }
            if (TtmlNode.RIGHT.equals(this.zb.ycx())) {
                i2 = (int) this.lt;
                int i7 = onNavigationEvent + 3;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                str = "width";
            } else {
                str = "height";
                i2 = i5;
            }
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.dj, str, 0, i2).setDuration((int) (this.zb.jc() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ycx(duration));
        arrayList.add(ycx(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ycx.jc.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                jc.ycx(jc.this).ycx(i5);
            }
        });
        int i9 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 != 0) {
            return arrayList;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i4 = $11 + 5;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 24, 19626 - ((byte) KeyEvent.getModifierMetaStateMask()), 1002848041, false, RVParams.URL, new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), ((Process.getThreadPriority(0) + 20) >> 6) + 59, 6384 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i7 = $11 + 93;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 59 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 6384 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    class ycx {
        private View zb;

        public ycx(View view) {
            this.zb = view;
        }

        public void ycx(int i2) {
            if ("top".equals(jc.this.zb.ycx())) {
                if (jc.this.sya instanceof ViewGroup) {
                    for (int i3 = 0; i3 < ((ViewGroup) jc.this.sya).getChildCount(); i3++) {
                        ((ViewGroup) jc.this.sya).getChildAt(i3).setTranslationY(i2 - jc.zb(jc.this));
                    }
                }
                jc jcVar = jc.this;
                jcVar.sya.setTranslationY(jc.zb(jcVar) - i2);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.zb.getLayoutParams();
            layoutParams.height = i2;
            this.zb.setLayoutParams(layoutParams);
            this.zb.requestLayout();
        }
    }
}
