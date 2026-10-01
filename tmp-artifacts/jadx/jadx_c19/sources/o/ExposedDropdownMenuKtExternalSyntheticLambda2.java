package o;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ExposedDropdownMenuKtExternalSyntheticLambda2 extends RecyclerView.ItemDecoration {
    private static final int[] onExtraCallback = {R.attr.listDivider};
    private final Rect IAuthTabCallback = new Rect();
    private int onNavigationEvent;
    private Drawable onWarmupCompleted;

    public ExposedDropdownMenuKtExternalSyntheticLambda2(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(onExtraCallback);
        this.onWarmupCompleted = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        onExtraCallbackWithResult(i2);
    }

    public void onExtraCallbackWithResult(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.onNavigationEvent = i2;
    }

    public void onExtraCallback(@NonNull Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.onWarmupCompleted = drawable;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (recyclerView.getLayoutManager() == null || this.onWarmupCompleted == null) {
            return;
        }
        if (this.onNavigationEvent == 1) {
            onWarmupCompleted(canvas, recyclerView);
        } else {
            onExtraCallbackWithResult(canvas, recyclerView);
        }
    }

    private void onWarmupCompleted(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.IAuthTabCallback);
            int iRound = this.IAuthTabCallback.bottom + Math.round(childAt.getTranslationY());
            this.onWarmupCompleted.setBounds(paddingLeft, iRound - this.onWarmupCompleted.getIntrinsicHeight(), width, iRound);
            this.onWarmupCompleted.draw(canvas);
        }
        canvas.restore();
    }

    private void onExtraCallbackWithResult(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.IAuthTabCallback);
            int iRound = this.IAuthTabCallback.right + Math.round(childAt.getTranslationX());
            this.onWarmupCompleted.setBounds(iRound - this.onWarmupCompleted.getIntrinsicWidth(), paddingTop, iRound, height);
            this.onWarmupCompleted.draw(canvas);
        }
        canvas.restore();
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Drawable drawable = this.onWarmupCompleted;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.onNavigationEvent == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }
}
