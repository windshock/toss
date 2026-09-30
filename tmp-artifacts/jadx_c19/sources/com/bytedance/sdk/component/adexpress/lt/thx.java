package com.bytedance.sdk.component.adexpress.lt;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.PathInterpolator;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class thx extends RelativeLayout {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static char[] onNavigationEvent = {27332, 27486, 27462, 27467, 27460};
    private TextView dj;
    private int ea;
    private AnimatorSet fby;
    private String jc;
    private AnimatorSet jw;
    private AnimatorSet lt;
    private TextView lud;
    private ImageView sya;
    private AnimatorSet ul;
    private ImageView ycx;
    private ImageView zb;

    static /* synthetic */ AnimatorSet ycx(thx thxVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 47;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        AnimatorSet animatorSet = thxVar.lt;
        int i6 = i4 + 37;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return animatorSet;
    }

    static /* synthetic */ ImageView zb(thx thxVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        ImageView imageView = thxVar.sya;
        int i6 = i3 + 111;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return imageView;
        }
        throw null;
    }

    public thx(Context context) {
        super(context);
        this.lt = new AnimatorSet();
        this.ul = new AnimatorSet();
        this.fby = new AnimatorSet();
        this.jw = new AnimatorSet();
        this.ea = 100;
        ycx(context);
    }

    public thx(Context context, String str) {
        super(context);
        this.lt = new AnimatorSet();
        this.ul = new AnimatorSet();
        this.fby = new AnimatorSet();
        this.jw = new AnimatorSet();
        this.ea = 100;
        setClipChildren(false);
        this.jc = str;
        ycx(context);
    }

    protected void ycx(Context context) {
        int i2;
        int i3 = 2 % 2;
        if (context == null) {
            int i4 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                context = com.bytedance.sdk.component.adexpress.dj.ycx();
            } else {
                com.bytedance.sdk.component.adexpress.dj.ycx();
                throw null;
            }
        }
        if ("5".equals(this.jc)) {
            addView(com.bytedance.sdk.component.adexpress.sya.ycx.lt(context));
            this.ea = (int) (this.ea * 1.25d);
            i2 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
        } else {
            addView(com.bytedance.sdk.component.adexpress.sya.ycx.lud(context));
            i2 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i2 % 128;
        }
        int i5 = i2 % 2;
        this.ycx = (ImageView) findViewById(2097610734);
        this.zb = (ImageView) findViewById(2097610735);
        this.dj = (TextView) findViewById(2097610730);
        this.sya = (ImageView) findViewById(2097610733);
        this.lud = (TextView) findViewById(2097610731);
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        AnimatorSet animatorSet;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 89;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            animatorSet = this.lt;
            int i5 = 0 / 0;
        } else {
            animatorSet = this.lt;
        }
        int i6 = i3 + 11;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 23 / 0;
        }
        return animatorSet;
    }

    public void ycx() throws Throwable {
        int i2 = 2 % 2;
        sya();
        this.lt.start();
        this.lt.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.lt.thx.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                thx.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.lt.thx.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        thx.ycx(thx.this).start();
                    }
                }, 200L);
            }
        });
        int i3 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public void sya() throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{0, 5, 164, 3}, false, new byte[]{0, 0, 1, 0, 1}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ycx, strIntern, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ycx, strIntern, 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.ycx, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.dj.ul.ycx(getContext(), -this.ea));
        objectAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(getContext(), this.ea));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.lt.thx.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (thx.zb(thx.this) != null) {
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) thx.zb(thx.this).getLayoutParams();
                    layoutParams.height = num.intValue();
                    thx.zb(thx.this).setLayoutParams(layoutParams);
                }
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.sya, strIntern, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.sya, strIntern, 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.zb, strIntern, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.zb, strIntern, 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.zb, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.zb, "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this.zb, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.dj.ul.ycx(getContext(), -this.ea));
        objectAnimatorOfFloat10.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.ul.setDuration(50L);
        this.jw.setDuration(1500L);
        this.fby.setDuration(50L);
        this.ul.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat7, objectAnimatorOfFloat5);
        this.fby.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat6, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat4);
        this.jw.playTogether(objectAnimatorOfFloat3, valueAnimatorOfInt, objectAnimatorOfFloat10);
        this.lt.playSequentially(this.fby, this.jw, this.ul);
        int i3 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 32 / 0;
        }
    }

    public void zb() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        try {
            AnimatorSet animatorSet = this.lt;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.fby;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.ul;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.jw;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
            int i4 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+zoRN0kk=", "aOIkkQaJefGJT8A=", "WO8jlgawWsuJTtJonDCuIVbvOZoR", 178);
            e.getMessage();
            int i6 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public void setGuideText(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 29;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        TextView textView = this.dj;
        if (textView != null) {
            int i6 = i3 + 11;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            textView.setText(str);
            if (i7 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void setSlideText(String str) {
        int i2 = 2 % 2;
        if (this.lud != null) {
            int i3 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                if (TextUtils.isEmpty(str)) {
                    int i4 = onExtraCallbackWithResult + 83;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        this.lud.setText("");
                        return;
                    } else {
                        this.lud.setText("");
                        obj.hashCode();
                        throw null;
                    }
                }
                this.lud.setText(str);
                int i5 = IAuthTabCallback + 95;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            TextUtils.isEmpty(str);
            obj.hashCode();
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        super.onDetachedFromWindow();
        zb();
        int i5 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr;
        char c;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = onNavigationEvent;
        char c2 = '0';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror(c2) + 35235), 35 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 14239 - View.combineMeasuredStates(0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i8++;
                    c2 = '0';
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
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr2, i4, cArr4, 0, i5);
        if (bArr != null) {
            int i9 = $10 + 57;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 1;
            } else {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i10 = $11 + 115;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - View.MeasureSpec.getSize(0)), 65 - (ViewConfiguration.getTapTimeout() >> 16), 16719 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 28 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getPressedStateDuration() >> 16) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    int i14 = $11 + 85;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                try {
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 49468), View.MeasureSpec.getSize(0) + 70, (ViewConfiguration.getJumpTapTimeout() >> 16) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr4, 0, cArr5, 0, i5);
            int i16 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr4, i16, i7);
            System.arraycopy(cArr5, i7, cArr4, 0, i16);
            int i17 = $11 + 43;
            $10 = i17 % 128;
            int i18 = i17 % 2;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i19 = $10 + 99;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i5 % trackGroupExternalSyntheticLambda0.onNavigationEvent) + 1];
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i2;
            }
            cArr4 = cArr6;
        }
        if (i6 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }
}
