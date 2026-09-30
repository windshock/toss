package io.fincube.ocr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import io.fincube.creditcard.DetectionInfo;
import java.util.Arrays;
import o.BugsnagEventMapperndkDateFormatHolder1;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class OverlayView extends View {
    protected static final GradientDrawable.Orientation[] onNavigationEvent = {GradientDrawable.Orientation.TOP_BOTTOM, GradientDrawable.Orientation.LEFT_RIGHT, GradientDrawable.Orientation.BOTTOM_TOP, GradientDrawable.Orientation.RIGHT_LEFT};
    protected Bitmap IAuthTabCallback;
    protected float IAuthTabCallbackDefault;
    Bitmap IAuthTabCallbackStub;
    private final Paint IAuthTabCallbackStubProxy;
    private final Paint IAuthTabCallback_Parcel;
    private final Paint access000;
    private final Paint access100;
    protected OcrConfig asBinder;
    protected String asInterface;
    private Path extraCallback;
    private int extraCallbackWithResult;
    private GradientDrawable getInterfaceDescriptor;
    public DetectionInfo onExtraCallback;
    public Rect onExtraCallbackWithResult;
    protected int onTransact;
    protected Rect onWarmupCompleted;
    private final Paint readTypedObject;

    public Rect onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public OverlayView(Context context, AttributeSet attributeSet, OcrConfig ocrConfig) {
        super(context, attributeSet);
        this.IAuthTabCallbackDefault = 1.0f;
        this.IAuthTabCallbackStubProxy = new Paint(1);
        Paint paint = new Paint(1);
        this.IAuthTabCallback_Parcel = paint;
        this.IAuthTabCallbackStub = null;
        this.extraCallbackWithResult = 1;
        this.IAuthTabCallbackDefault = getResources().getDisplayMetrics().density / 1.5f;
        this.access100 = new Paint(1);
        this.asBinder = ocrConfig;
        Paint paint2 = new Paint(1);
        this.access000 = paint2;
        paint2.clearShadowLayer();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-1140850689);
        this.asInterface = null;
        Paint paint3 = new Paint(1);
        this.readTypedObject = paint3;
        paint3.setColor(-1);
        BugsnagEventMapperndkDateFormatHolder1.onExtraCallbackWithResult(paint);
    }

    public void setGuideAndRotation(Rect rect, int i) {
        this.onTransact = i;
        this.onExtraCallbackWithResult = rect;
        invalidate();
        if (this.onTransact % 180 != 0) {
            this.extraCallbackWithResult = -1;
        } else {
            this.extraCallbackWithResult = 1;
        }
        Rect rect2 = this.onWarmupCompleted;
        if (rect2 != null) {
            onWarmupCompleted(rect, rect2, i);
        }
    }

    public void setBitmap(Bitmap bitmap) {
        Bitmap bitmap2 = this.IAuthTabCallback;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.IAuthTabCallback = bitmap;
        if (bitmap != null) {
            IAuthTabCallback();
        }
    }

    public void setDetectionInfo(DetectionInfo detectionInfo) {
        if (this.onExtraCallback != null) {
            postInvalidate();
        }
        this.onExtraCallback = detectionInfo;
    }

    protected void onWarmupCompleted(Rect rect, Rect rect2, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable(onNavigationEvent[(this.onTransact / 90) % 4], new int[]{-1, -16777216});
        this.getInterfaceDescriptor = gradientDrawable;
        gradientDrawable.setGradientType(0);
        this.getInterfaceDescriptor.setBounds(this.onExtraCallbackWithResult);
        this.getInterfaceDescriptor.setAlpha(50);
        Path path = new Path();
        this.extraCallback = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        Path path2 = this.extraCallback;
        RectF rectF = new RectF(this.onWarmupCompleted);
        Path.Direction direction = Path.Direction.CW;
        path2.addRect(rectF, direction);
        float[] fArr = new float[8];
        Arrays.fill(fArr, 50.0f);
        this.extraCallback.addRoundRect(new RectF(this.onExtraCallbackWithResult), fArr, direction);
        this.extraCallback.close();
    }

    protected void IAuthTabCallback(Canvas canvas, Rect rect, Rect rect2, boolean z) {
        DetectionInfo detectionInfo;
        canvas.save();
        canvas.drawPath(this.extraCallback, this.access000);
        this.access100.clearShadowLayer();
        this.access100.setStyle(Paint.Style.FILL);
        this.access100.setColor(this.asBinder.guideColor);
        DetectionInfo detectionInfo2 = this.onExtraCallback;
        if (detectionInfo2 != null) {
            if (detectionInfo2.prediction_length > 0) {
                int i = 0;
                while (true) {
                    detectionInfo = this.onExtraCallback;
                    if (i >= detectionInfo.prediction_length) {
                        break;
                    }
                    Rect rect3 = this.onExtraCallbackWithResult;
                    float f = rect3.left;
                    int i2 = i << 2;
                    float f2 = detectionInfo.numberPos[i2];
                    float fWidth = rect3.width();
                    Rect rect4 = this.onExtraCallbackWithResult;
                    int i3 = rect4.left;
                    float f3 = this.onExtraCallback.numberPos[i2 + 1];
                    rect4.width();
                    Rect rect5 = this.onExtraCallbackWithResult;
                    float fHeight = rect5.top + (this.onExtraCallback.numberPos[i2 + 2] * rect5.height());
                    Rect rect6 = this.onExtraCallbackWithResult;
                    this.IAuthTabCallback_Parcel.setTextSize((rect6.top + (this.onExtraCallback.numberPos[i2 + 3] * rect6.height())) - fHeight);
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.onExtraCallback.prediction[i]);
                    canvas.drawText(sb.toString(), f + (f2 * fWidth), fHeight, this.IAuthTabCallback_Parcel);
                    i++;
                }
                if (detectionInfo.expiry_month >= 0 && detectionInfo.expiry_year >= 0) {
                    Rect rect7 = this.onExtraCallbackWithResult;
                    float f4 = rect7.left;
                    float f5 = detectionInfo.expiryPos[0];
                    float fWidth2 = rect7.width();
                    Rect rect8 = this.onExtraCallbackWithResult;
                    int i4 = rect8.left;
                    float f6 = this.onExtraCallback.expiryPos[1];
                    rect8.width();
                    Rect rect9 = this.onExtraCallbackWithResult;
                    float fHeight2 = rect9.top + (this.onExtraCallback.expiryPos[2] * rect9.height());
                    Rect rect10 = this.onExtraCallbackWithResult;
                    this.IAuthTabCallback_Parcel.setTextSize((rect10.top + (this.onExtraCallback.expiryPos[3] * rect10.height())) - fHeight2);
                    canvas.drawText(this.onExtraCallback.expiry_month + " / " + this.onExtraCallback.expiry_year, f4 + (f5 * fWidth2), fHeight2, this.IAuthTabCallback_Parcel);
                }
            }
            if (this.onExtraCallback.numVisibleEdges() != 4 && this.onExtraCallback.numVisibleEdges() < 3) {
                float f7 = this.IAuthTabCallbackDefault;
                float f8 = 34.0f * f7;
                float f9 = f7 * 26.0f;
                BugsnagEventMapperndkDateFormatHolder1.onExtraCallbackWithResult(this.access100);
                this.access100.setTextAlign(Paint.Align.CENTER);
                this.access100.setTextSize(f9);
                Rect rect11 = this.onExtraCallbackWithResult;
                float fWidth3 = rect11.left + (rect11.width() / 2);
                Rect rect12 = this.onExtraCallbackWithResult;
                canvas.translate(fWidth3, rect12.top + (rect12.height() / 2));
                canvas.rotate(this.extraCallbackWithResult * this.onTransact);
                String str = this.asInterface;
                if (str != null && str != _UrlKt.FRAGMENT_ENCODE_SET) {
                    float f10 = (-((((r1.length - 1) * f8) - f9) / 2.0f)) - 3.0f;
                    for (String str2 : str.split("\n")) {
                        canvas.drawText(str2, 0.0f, f10, this.access100);
                        f10 += f8;
                    }
                }
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean z;
        if (this.onExtraCallbackWithResult == null || this.onWarmupCompleted == null) {
            return;
        }
        DetectionInfo detectionInfo = this.onExtraCallback;
        if (detectionInfo == null) {
            z = false;
        } else if (detectionInfo.numVisibleEdges() == 4) {
            this.access000.setColor(this.asBinder.guideBackgroundColorDetect);
            z = true;
        } else {
            this.access000.setColor(this.asBinder.guideBackgroundColorDefault);
            z = false;
        }
        IAuthTabCallback(canvas, this.onExtraCallbackWithResult, this.onWarmupCompleted, z);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if ((motionEvent.getAction() & 255) != 0) {
                return false;
            }
            Point point = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            BugsnagEventMapperndkDateFormatHolder1.onExtraCallbackWithResult(point, 20, 20);
            point.toString();
            return false;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    private void IAuthTabCallback() {
        RectF rectF = new RectF(2.0f, 2.0f, this.IAuthTabCallback.getWidth() - 2, this.IAuthTabCallback.getHeight() - 2);
        float height = this.IAuthTabCallback.getHeight() * 0.06666667f;
        if (this.IAuthTabCallbackStub == null) {
            this.IAuthTabCallbackStub = Bitmap.createBitmap(this.IAuthTabCallback.getWidth(), this.IAuthTabCallback.getHeight(), Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(this.IAuthTabCallbackStub);
        canvas.drawColor(0);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRoundRect(rectF, height, height, paint);
        Paint paint2 = new Paint();
        paint2.setFilterBitmap(false);
        Canvas canvas2 = new Canvas(this.IAuthTabCallback);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas2.drawBitmap(this.IAuthTabCallbackStub, 0.0f, 0.0f, paint2);
        paint2.setXfermode(null);
    }

    public void setCameraPreviewRect(Rect rect) {
        this.onWarmupCompleted = rect;
    }
}
