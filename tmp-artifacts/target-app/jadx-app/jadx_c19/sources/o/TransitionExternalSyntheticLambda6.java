package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.Glide;
import java.nio.ByteBuffer;
import java.util.List;
import o.TransitionExternalSyntheticLambda7;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class TransitionExternalSyntheticLambda6 extends Drawable implements TransitionExternalSyntheticLambda7.onNavigationEvent, Animatable, Animatable2Compat {
    private boolean IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private final IAuthTabCallback access100;
    private Paint asBinder;
    private boolean asInterface;
    private boolean onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private Rect onNavigationEvent;
    private int onTransact;
    private List<Animatable2Compat.AnimationCallback> onWarmupCompleted;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public TransitionExternalSyntheticLambda6(Context context, SaversKtExternalSyntheticLambda15 saversKtExternalSyntheticLambda15, SaversKtExternalSyntheticLambda29<Bitmap> saversKtExternalSyntheticLambda29, int i2, int i3, Bitmap bitmap) {
        this(new IAuthTabCallback(new TransitionExternalSyntheticLambda7(Glide.onNavigationEvent(context), saversKtExternalSyntheticLambda15, i2, i3, saversKtExternalSyntheticLambda29, bitmap)));
    }

    TransitionExternalSyntheticLambda6(IAuthTabCallback iAuthTabCallback) {
        this.IAuthTabCallbackStub = true;
        this.IAuthTabCallbackDefault = -1;
        this.access100 = (IAuthTabCallback) markHierarchyDirty.onExtraCallbackWithResult(iAuthTabCallback);
    }

    public int onWarmupCompleted() {
        return this.access100.onNavigationEvent.onTransact();
    }

    public Bitmap onExtraCallback() {
        return this.access100.onNavigationEvent.onWarmupCompleted();
    }

    public void onExtraCallbackWithResult(SaversKtExternalSyntheticLambda29<Bitmap> saversKtExternalSyntheticLambda29, Bitmap bitmap) {
        this.access100.onNavigationEvent.onExtraCallbackWithResult(saversKtExternalSyntheticLambda29, bitmap);
    }

    public ByteBuffer onNavigationEvent() {
        return this.access100.onNavigationEvent.IAuthTabCallback();
    }

    public int onExtraCallbackWithResult() {
        return this.access100.onNavigationEvent.asBinder();
    }

    public int IAuthTabCallback() {
        return this.access100.onNavigationEvent.onExtraCallbackWithResult();
    }

    private void access000() {
        this.onTransact = 0;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.asInterface = true;
        access000();
        if (this.IAuthTabCallbackStub) {
            getInterfaceDescriptor();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.asInterface = false;
        IAuthTabCallbackStubProxy();
    }

    private void getInterfaceDescriptor() {
        markHierarchyDirty.onExtraCallbackWithResult(!this.IAuthTabCallback, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.access100.onNavigationEvent.asBinder() == 1) {
            invalidateSelf();
        } else {
            if (this.onExtraCallback) {
                return;
            }
            this.onExtraCallback = true;
            this.access100.onNavigationEvent.onExtraCallbackWithResult(this);
            invalidateSelf();
        }
    }

    private void IAuthTabCallbackStubProxy() {
        this.onExtraCallback = false;
        this.access100.onNavigationEvent.onExtraCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        markHierarchyDirty.onExtraCallbackWithResult(!this.IAuthTabCallback, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.IAuthTabCallbackStub = z;
        if (!z) {
            IAuthTabCallbackStubProxy();
        } else if (this.asInterface) {
            getInterfaceDescriptor();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.access100.onNavigationEvent.asInterface();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.access100.onNavigationEvent.IAuthTabCallbackDefault();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.onExtraCallback;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.onExtraCallbackWithResult = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.IAuthTabCallback) {
            return;
        }
        if (this.onExtraCallbackWithResult) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), asInterface());
            this.onExtraCallbackWithResult = false;
        }
        canvas.drawBitmap(this.access100.onNavigationEvent.onExtraCallback(), (Rect) null, asInterface(), onTransact());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        onTransact().setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        onTransact().setColorFilter(colorFilter);
    }

    private Rect asInterface() {
        if (this.onNavigationEvent == null) {
            this.onNavigationEvent = new Rect();
        }
        return this.onNavigationEvent;
    }

    private Paint onTransact() {
        if (this.asBinder == null) {
            this.asBinder = new Paint(2);
        }
        return this.asBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback asBinder() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    @Override // o.TransitionExternalSyntheticLambda7.onNavigationEvent
    public void IAuthTabCallbackDefault() {
        if (asBinder() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (IAuthTabCallback() == onExtraCallbackWithResult() - 1) {
            this.onTransact++;
        }
        int i2 = this.IAuthTabCallbackDefault;
        if (i2 == -1 || this.onTransact < i2) {
            return;
        }
        IAuthTabCallback_Parcel();
        stop();
    }

    private void IAuthTabCallback_Parcel() {
        List<Animatable2Compat.AnimationCallback> list = this.onWarmupCompleted;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.onWarmupCompleted.get(i2).onAnimationEnd(this);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.access100;
    }

    public void IAuthTabCallbackStub() {
        this.IAuthTabCallback = true;
        this.access100.onNavigationEvent.onNavigationEvent();
    }

    static final class IAuthTabCallback extends Drawable.ConstantState {
        final TransitionExternalSyntheticLambda7 onNavigationEvent;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        IAuthTabCallback(TransitionExternalSyntheticLambda7 transitionExternalSyntheticLambda7) {
            this.onNavigationEvent = transitionExternalSyntheticLambda7;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new TransitionExternalSyntheticLambda6(this);
        }
    }
}
