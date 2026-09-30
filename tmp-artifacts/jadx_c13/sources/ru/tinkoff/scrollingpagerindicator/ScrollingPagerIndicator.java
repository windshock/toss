package ru.tinkoff.scrollingpagerindicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import o.pkcs12MakePFXWithEncPKCS8;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class ScrollingPagerIndicator extends View {
    private IAuthTabCallback<?> IAuthTabCallback;
    private SparseArray<Float> IAuthTabCallbackDefault;
    private float IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private float ICustomTabsCallback;
    private int access000;
    private int access100;
    private final int asBinder;
    private final int asInterface;
    private int extraCallback;
    private final int extraCallbackWithResult;
    private final Paint getInterfaceDescriptor;
    private float onActivityLayout;
    private final ArgbEvaluator onExtraCallback;
    private Runnable onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private final int onTransact;
    private int onWarmupCompleted;
    private int readTypedObject;
    private int writeTypedObject;

    public interface IAuthTabCallback<T> {
        void onExtraCallbackWithResult();

        void onNavigationEvent(@NonNull ScrollingPagerIndicator scrollingPagerIndicator, @NonNull T t);
    }

    public ScrollingPagerIndicator(Context context) {
        this(context, null);
    }

    public ScrollingPagerIndicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.scrollingPagerIndicatorStyle);
    }

    public ScrollingPagerIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onExtraCallback = new ArgbEvaluator();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrollingPagerIndicator, i, R.style.ScrollingPagerIndicator);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.ScrollingPagerIndicator_spi_dotColor, 0);
        this.onWarmupCompleted = color;
        this.writeTypedObject = typedArrayObtainStyledAttributes.getColor(R.styleable.ScrollingPagerIndicator_spi_dotSelectedColor, color);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingPagerIndicator_spi_dotSize, 0);
        this.onTransact = dimensionPixelSize;
        this.asBinder = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingPagerIndicator_spi_dotSelectedSize, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingPagerIndicator_spi_dotMinimumSize, -1);
        this.asInterface = dimensionPixelSize2 <= dimensionPixelSize ? dimensionPixelSize2 : -1;
        this.extraCallbackWithResult = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingPagerIndicator_spi_dotSpacing, 0) + dimensionPixelSize;
        this.IAuthTabCallback_Parcel = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ScrollingPagerIndicator_spi_looped, false);
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.ScrollingPagerIndicator_spi_visibleDotCount, 0);
        setVisibleDotCount(i2);
        this.extraCallback = typedArrayObtainStyledAttributes.getInt(R.styleable.ScrollingPagerIndicator_spi_visibleDotThreshold, 2);
        this.IAuthTabCallbackStubProxy = typedArrayObtainStyledAttributes.getInt(R.styleable.ScrollingPagerIndicator_spi_orientation, 0);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.getInterfaceDescriptor = paint;
        paint.setAntiAlias(true);
        if (isInEditMode()) {
            setDotCount(i2);
            onExtraCallback(i2 / 2, 0.0f);
        }
    }

    public void setLooped(boolean z) {
        this.IAuthTabCallback_Parcel = z;
        onExtraCallbackWithResult();
        invalidate();
    }

    public void setDotColor(int i) {
        this.onWarmupCompleted = i;
        invalidate();
    }

    public void setSelectedDotColor(int i) {
        this.writeTypedObject = i;
        invalidate();
    }

    public void setVisibleDotCount(int i) {
        if (i % 2 == 0) {
            throw new IllegalArgumentException("visibleDotCount must be odd");
        }
        this.readTypedObject = i;
        this.access100 = i + 2;
        if (this.onExtraCallbackWithResult != null) {
            onExtraCallbackWithResult();
        } else {
            requestLayout();
        }
    }

    public void setVisibleDotThreshold(int i) {
        this.extraCallback = i;
        if (this.onExtraCallbackWithResult != null) {
            onExtraCallbackWithResult();
        } else {
            requestLayout();
        }
    }

    public void setOrientation(int i) {
        this.IAuthTabCallbackStubProxy = i;
        if (this.onExtraCallbackWithResult != null) {
            onExtraCallbackWithResult();
        } else {
            requestLayout();
        }
    }

    public void onWarmupCompleted(@NonNull ViewPager viewPager) {
        onExtraCallback((ScrollingPagerIndicator) viewPager, (IAuthTabCallback<ScrollingPagerIndicator>) new pkcs12MakePFXWithEncPKCS8());
    }

    public void onWarmupCompleted(@NonNull RecyclerView recyclerView) {
        onExtraCallback((ScrollingPagerIndicator) recyclerView, (IAuthTabCallback<ScrollingPagerIndicator>) new RecyclerViewAttacher());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void onExtraCallback(@NonNull final T t, @NonNull final IAuthTabCallback<T> iAuthTabCallback) {
        onWarmupCompleted();
        iAuthTabCallback.onNavigationEvent(this, t);
        this.IAuthTabCallback = iAuthTabCallback;
        this.onExtraCallbackWithResult = new Runnable() { // from class: ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.5
            @Override // java.lang.Runnable
            public void run() {
                ScrollingPagerIndicator.this.access000 = -1;
                ScrollingPagerIndicator.this.onExtraCallback((ScrollingPagerIndicator) t, (IAuthTabCallback<ScrollingPagerIndicator>) iAuthTabCallback);
            }
        };
    }

    public void onWarmupCompleted() {
        IAuthTabCallback<?> iAuthTabCallback = this.IAuthTabCallback;
        if (iAuthTabCallback != null) {
            iAuthTabCallback.onExtraCallbackWithResult();
            this.IAuthTabCallback = null;
            this.onExtraCallbackWithResult = null;
        }
        this.onNavigationEvent = false;
    }

    public void onExtraCallbackWithResult() {
        Runnable runnable = this.onExtraCallbackWithResult;
        if (runnable != null) {
            runnable.run();
            invalidate();
        }
    }

    public void onExtraCallback(int i, float f) {
        int i2;
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Offset must be [0, 1]");
        }
        if (i < 0 || (i != 0 && i >= this.access000)) {
            throw new IndexOutOfBoundsException("page must be [0, adapter.getItemCount())");
        }
        if (!this.IAuthTabCallback_Parcel || ((i2 = this.access000) <= this.readTypedObject && i2 > 1)) {
            this.IAuthTabCallbackDefault.clear();
            if (this.IAuthTabCallbackStubProxy == 0) {
                onWarmupCompleted(i, f);
                int i3 = this.access000;
                if (i < i3 - 1) {
                    onWarmupCompleted(i + 1, 1.0f - f);
                } else if (i3 > 1) {
                    onWarmupCompleted(0, 1.0f - f);
                }
            } else {
                onWarmupCompleted(i - 1, f);
                onWarmupCompleted(i, 1.0f - f);
            }
            invalidate();
        }
        if (this.IAuthTabCallbackStubProxy == 0) {
            onNavigationEvent(f, i);
        } else {
            onNavigationEvent(f, i - 1);
        }
        invalidate();
    }

    public void setDotCount(int i) {
        onWarmupCompleted(i);
    }

    public void setCurrentPosition(int i) {
        if (i != 0 && (i < 0 || i >= this.access000)) {
            throw new IndexOutOfBoundsException("Position must be [0, adapter.getItemCount()]");
        }
        if (this.access000 == 0) {
            return;
        }
        onNavigationEvent(0.0f, i);
        onExtraCallback(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size;
        int mode;
        int size2;
        int i5;
        int i6;
        int mode2;
        if (this.IAuthTabCallbackStubProxy == 0) {
            if (isInEditMode()) {
                i5 = (this.readTypedObject - 1) * this.extraCallbackWithResult;
                i6 = this.asBinder;
            } else {
                int i7 = this.access000;
                if (i7 >= this.readTypedObject) {
                    size2 = (int) this.onActivityLayout;
                    mode2 = View.MeasureSpec.getMode(i2);
                    size = View.MeasureSpec.getSize(i2);
                    int i8 = this.asBinder;
                    if (mode2 != Integer.MIN_VALUE) {
                        size = Math.min(i8, size);
                    } else if (mode2 != 1073741824) {
                        size = i8;
                    }
                } else {
                    i5 = (i7 - 1) * this.extraCallbackWithResult;
                    i6 = this.asBinder;
                }
            }
            size2 = i5 + i6;
            mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            int i82 = this.asBinder;
            if (mode2 != Integer.MIN_VALUE) {
            }
        } else {
            if (isInEditMode()) {
                i3 = (this.readTypedObject - 1) * this.extraCallbackWithResult;
                i4 = this.asBinder;
            } else {
                int i9 = this.access000;
                if (i9 >= this.readTypedObject) {
                    size = (int) this.onActivityLayout;
                    mode = View.MeasureSpec.getMode(i);
                    size2 = View.MeasureSpec.getSize(i);
                    int i10 = this.asBinder;
                    if (mode != Integer.MIN_VALUE) {
                        size2 = Math.min(i10, size2);
                    } else if (mode != 1073741824) {
                        size2 = i10;
                    }
                } else {
                    i3 = (i9 - 1) * this.extraCallbackWithResult;
                    i4 = this.asBinder;
                }
            }
            size = i3 + i4;
            mode = View.MeasureSpec.getMode(i);
            size2 = View.MeasureSpec.getSize(i);
            int i102 = this.asBinder;
            if (mode != Integer.MIN_VALUE) {
            }
        }
        setMeasuredDimension(size2, size);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7 A[PHI: r15
      0x00c7: PHI (r15v8 float) = (r15v7 float), (r15v10 float) binds: [B:55:0x00e0, B:47:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc A[PHI: r10
      0x00dc: PHI (r10v18 int) = (r10v16 int), (r10v19 int) binds: [B:52:0x00da, B:45:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(Canvas canvas) {
        float fOnExtraCallbackWithResult;
        float f;
        int i;
        int iIAuthTabCallback = IAuthTabCallback();
        if (iIAuthTabCallback >= this.extraCallback) {
            int i2 = this.extraCallbackWithResult;
            int i3 = this.asBinder;
            float f2 = ((i3 - this.onTransact) / 2) + i2;
            float f3 = i3 / 2;
            float f4 = i2 * 0.85714287f;
            float f5 = this.ICustomTabsCallback;
            int i4 = ((int) (f5 - this.IAuthTabCallbackStub)) / i2;
            int iOnNavigationEvent = (((int) ((f5 + this.onActivityLayout) - onNavigationEvent(i4))) / this.extraCallbackWithResult) + i4;
            if (i4 == 0 && iOnNavigationEvent + 1 > iIAuthTabCallback) {
                iOnNavigationEvent = iIAuthTabCallback - 1;
            }
            while (i4 <= iOnNavigationEvent) {
                float fOnNavigationEvent = onNavigationEvent(i4);
                float f6 = this.ICustomTabsCallback;
                if (fOnNavigationEvent >= f6) {
                    float f7 = this.onActivityLayout;
                    if (fOnNavigationEvent < f6 + f7) {
                        if (!this.IAuthTabCallback_Parcel || this.access000 <= this.readTypedObject) {
                            fOnExtraCallbackWithResult = onExtraCallbackWithResult(i4);
                        } else {
                            float f8 = f6 + (f7 / 2.0f);
                            fOnExtraCallbackWithResult = (fOnNavigationEvent < f8 - f4 || fOnNavigationEvent > f8) ? (fOnNavigationEvent <= f8 || fOnNavigationEvent >= f8 + f4) ? 0.0f : 1.0f - ((fOnNavigationEvent - f8) / f4) : ((fOnNavigationEvent - f8) + f4) / f4;
                        }
                        float f9 = this.onTransact + ((this.asBinder - r10) * fOnExtraCallbackWithResult);
                        if (this.access000 > this.readTypedObject) {
                            float f10 = (this.IAuthTabCallback_Parcel || !(i4 == 0 || i4 == iIAuthTabCallback + (-1))) ? 0.7f * f2 : f3;
                            int width = getWidth();
                            if (this.IAuthTabCallbackStubProxy == 1) {
                                width = getHeight();
                            }
                            float f11 = this.ICustomTabsCallback;
                            float f12 = fOnNavigationEvent - f11;
                            if (f12 < f10) {
                                f = (f12 * f9) / f10;
                                i = this.asInterface;
                                if (f <= i) {
                                    f9 = i;
                                } else if (f < f9) {
                                    f9 = f;
                                }
                            } else {
                                float f13 = width;
                                if (f12 > f13 - f10) {
                                    f = ((((-fOnNavigationEvent) + f11) + f13) * f9) / f10;
                                    i = this.asInterface;
                                    if (f > i) {
                                        if (f < f9) {
                                        }
                                    }
                                }
                            }
                        }
                        this.getInterfaceDescriptor.setColor(onExtraCallbackWithResult(fOnExtraCallbackWithResult));
                        if (this.IAuthTabCallbackStubProxy == 0) {
                            canvas.drawCircle(fOnNavigationEvent - this.ICustomTabsCallback, getMeasuredHeight() / 2, f9 / 2.0f, this.getInterfaceDescriptor);
                        } else {
                            canvas.drawCircle(getMeasuredWidth() / 2, fOnNavigationEvent - this.ICustomTabsCallback, f9 / 2.0f, this.getInterfaceDescriptor);
                        }
                    }
                }
                i4++;
            }
        }
    }

    private int onExtraCallbackWithResult(float f) {
        return ((Integer) this.onExtraCallback.evaluate(f, Integer.valueOf(this.onWarmupCompleted), Integer.valueOf(this.writeTypedObject))).intValue();
    }

    private void onExtraCallback(int i) {
        if (!this.IAuthTabCallback_Parcel || this.access000 < this.readTypedObject) {
            this.IAuthTabCallbackDefault.clear();
            this.IAuthTabCallbackDefault.put(i, Float.valueOf(1.0f));
            invalidate();
        }
    }

    private void onWarmupCompleted(int i) {
        if (this.access000 == i && this.onNavigationEvent) {
            return;
        }
        this.access000 = i;
        this.onNavigationEvent = true;
        this.IAuthTabCallbackDefault = new SparseArray<>();
        if (i < this.extraCallback) {
            requestLayout();
            invalidate();
        } else {
            this.IAuthTabCallbackStub = (!this.IAuthTabCallback_Parcel || this.access000 <= this.readTypedObject) ? this.asBinder / 2 : 0.0f;
            this.onActivityLayout = ((this.readTypedObject - 1) * this.extraCallbackWithResult) + this.asBinder;
            requestLayout();
            invalidate();
        }
    }

    private int IAuthTabCallback() {
        if (this.IAuthTabCallback_Parcel && this.access000 > this.readTypedObject) {
            return this.access100;
        }
        return this.access000;
    }

    private void onNavigationEvent(float f, int i) {
        int i2 = this.access000;
        int i3 = this.readTypedObject;
        if (i2 <= i3) {
            this.ICustomTabsCallback = 0.0f;
            return;
        }
        if (!this.IAuthTabCallback_Parcel && i2 > i3) {
            this.ICustomTabsCallback = (onNavigationEvent(i) + (this.extraCallbackWithResult * f)) - (this.onActivityLayout / 2.0f);
            int i4 = this.readTypedObject / 2;
            float fOnNavigationEvent = onNavigationEvent((IAuthTabCallback() - 1) - i4);
            if (this.ICustomTabsCallback + (this.onActivityLayout / 2.0f) < onNavigationEvent(i4)) {
                this.ICustomTabsCallback = onNavigationEvent(i4) - (this.onActivityLayout / 2.0f);
                return;
            }
            float f2 = this.ICustomTabsCallback;
            float f3 = this.onActivityLayout / 2.0f;
            if (f2 + f3 > fOnNavigationEvent) {
                this.ICustomTabsCallback = fOnNavigationEvent - f3;
                return;
            }
            return;
        }
        this.ICustomTabsCallback = (onNavigationEvent(this.access100 / 2) + (this.extraCallbackWithResult * f)) - (this.onActivityLayout / 2.0f);
    }

    private void onWarmupCompleted(int i, float f) {
        if (this.IAuthTabCallbackDefault == null || IAuthTabCallback() == 0) {
            return;
        }
        IAuthTabCallback(i, 1.0f - Math.abs(f));
    }

    private float onNavigationEvent(int i) {
        return this.IAuthTabCallbackStub + (i * this.extraCallbackWithResult);
    }

    private float onExtraCallbackWithResult(int i) {
        Float f = this.IAuthTabCallbackDefault.get(i);
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    private void IAuthTabCallback(int i, float f) {
        if (f == 0.0f) {
            this.IAuthTabCallbackDefault.remove(i);
        } else {
            this.IAuthTabCallbackDefault.put(i, Float.valueOf(f));
        }
    }
}
