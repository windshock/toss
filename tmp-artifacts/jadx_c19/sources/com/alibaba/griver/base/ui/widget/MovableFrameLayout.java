package com.alibaba.griver.base.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class MovableFrameLayout extends FrameLayout {
    public boolean a;
    public boolean b;
    public Helper c;
    public float d;

    public MovableFrameLayout(Context context) {
        super(context);
        a();
    }

    public final void a() {
        this.c = new Helper();
        this.d = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.a = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.b) {
            int action = motionEvent.getAction();
            if (action == 0) {
                requestDisallowInterceptTouchEvent(true);
            } else if (action == 1 || action == 3 || action == 4) {
                requestDisallowInterceptTouchEvent(false);
            }
        }
        if (this.a && this.c.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.a) {
            return super.onTouchEvent(motionEvent);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setFullScreen(boolean z) {
        this.b = z;
    }

    public void setMovable(boolean z) {
        this.a = z;
        if (z) {
            return;
        }
        setTranslationX(0.0f);
        setTranslationY(0.0f);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    public MovableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public class Helper {
        public float a;
        public float b;
        public boolean c;

        public Helper() {
        }

        public final void a(float f, float f2, int i2, int i3) {
            this.a = f;
            this.b = f2;
            a(i2, i3);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (MovableFrameLayout.this.a) {
                int action = motionEvent.getAction();
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                if (action == 0) {
                    MovableFrameLayout.this.requestDisallowInterceptTouchEvent(true);
                    this.a = rawX;
                    this.b = rawY;
                    return false;
                }
                if (action == 1) {
                    if (!this.c) {
                        return false;
                    }
                    this.a = 0.0f;
                    this.b = 0.0f;
                    this.c = false;
                    MovableFrameLayout.this.requestDisallowInterceptTouchEvent(false);
                } else if (action == 2) {
                    int i2 = (int) (rawX - this.a);
                    int i3 = (int) (rawY - this.b);
                    if (this.c) {
                        a(rawX, rawY, i2, i3);
                    } else if (Math.abs(i2) >= MovableFrameLayout.this.d || Math.abs(i3) >= MovableFrameLayout.this.d) {
                        a(rawX, rawY, i2, i3);
                        this.c = true;
                    }
                } else if (action == 3 || action == 4) {
                }
            }
            return true;
        }

        public final void a(int i2, int i3) {
            float translationX = MovableFrameLayout.this.getTranslationX() + i2;
            float translationY = MovableFrameLayout.this.getTranslationY() + i3;
            if (MovableFrameLayout.this.getLeft() + translationX >= 0.0f && (!(MovableFrameLayout.this.getParent() instanceof View) || MovableFrameLayout.this.getRight() + translationX <= ((View) MovableFrameLayout.this.getParent()).getWidth())) {
                MovableFrameLayout.this.setTranslationX(translationX);
            }
            if (MovableFrameLayout.this.getTop() + translationY >= 0.0f) {
                if (!(MovableFrameLayout.this.getParent() instanceof View)) {
                    MovableFrameLayout.this.setTranslationY(translationY);
                } else if (MovableFrameLayout.this.getBottom() + translationY <= ((View) MovableFrameLayout.this.getParent()).getHeight()) {
                    MovableFrameLayout.this.setTranslationY(translationY);
                }
            }
        }
    }

    public MovableFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }
}
