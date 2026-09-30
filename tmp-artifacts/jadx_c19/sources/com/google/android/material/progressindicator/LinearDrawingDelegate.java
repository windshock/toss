package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.math.MathUtils;
import com.google.android.material.progressindicator.DrawingDelegate;
import o.setScreenFlashOverlayColor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {
    private float adjustedWavelength;
    private int cachedWavelength;
    private float displayedAmplitude;
    private float displayedCornerRadius;
    private float displayedInnerCornerRadius;
    private float displayedTrackThickness;
    private boolean drawingDeterminateIndicator;
    Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> endPoints;
    private float totalTrackLengthFraction;
    private float trackLength;

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    int getPreferredWidth() {
        return -1;
    }

    LinearDrawingDelegate(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.trackLength = 300.0f;
        this.endPoints = new Pair<>(new DrawingDelegate.PathPoint(), new DrawingDelegate.PathPoint());
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    int getPreferredHeight() {
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.spec;
        return linearProgressIndicatorSpec.trackThickness + (linearProgressIndicatorSpec.waveAmplitude << 1);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, float f, boolean z, boolean z2) {
        if (this.trackLength != rect.width()) {
            this.trackLength = rect.width();
            invalidateCachedPaths();
        }
        float preferredHeight = getPreferredHeight();
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - preferredHeight) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.spec).drawHorizontallyInverse) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f2 = this.trackLength / 2.0f;
        float f3 = preferredHeight / 2.0f;
        canvas.clipRect(-f2, -f3, f2, f3);
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.spec;
        this.displayedTrackThickness = linearProgressIndicatorSpec.trackThickness * f;
        this.displayedCornerRadius = Math.min(linearProgressIndicatorSpec.trackThickness / 2, linearProgressIndicatorSpec.getTrackCornerRadiusInPx()) * f;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec2 = (LinearProgressIndicatorSpec) this.spec;
        this.displayedAmplitude = linearProgressIndicatorSpec2.waveAmplitude * f;
        this.displayedInnerCornerRadius = Math.min(linearProgressIndicatorSpec2.trackThickness / 2.0f, linearProgressIndicatorSpec2.getTrackInnerCornerRadiusInPx()) * f;
        if (z || z2) {
            if ((z && ((LinearProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (z2 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior != 3)) {
                canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.spec).trackThickness * (1.0f - f)) / 2.0f);
            }
        }
        if (z2 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate.ActiveIndicator activeIndicator, int i2) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i2);
        this.drawingDeterminateIndicator = activeIndicator.isDeterminate;
        float f = activeIndicator.startFraction;
        float f2 = activeIndicator.endFraction;
        int i3 = activeIndicator.gapSize;
        drawLine(canvas, paint, f, f2, iCompositeARGBWithAlpha, i3, i3, activeIndicator.amplitudeFraction, activeIndicator.phaseFraction, true);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f2, int i2, int i3, int i4) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i2, i3);
        this.drawingDeterminateIndicator = false;
        drawLine(canvas, paint, f, f2, iCompositeARGBWithAlpha, i4, i4, 0.0f, 0.0f, false);
    }

    private void drawLine(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f2, int i2, int i3, int i4, float f3, float f4, boolean z) {
        float f5;
        float fLerp;
        float fIAuthTabCallback = setScreenFlashOverlayColor.IAuthTabCallback(f, 0.0f, 1.0f);
        float fIAuthTabCallback2 = setScreenFlashOverlayColor.IAuthTabCallback(f2, 0.0f, 1.0f);
        float fLerp2 = MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, fIAuthTabCallback);
        float fLerp3 = MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, fIAuthTabCallback2);
        int iIAuthTabCallback = (int) ((i3 * setScreenFlashOverlayColor.IAuthTabCallback(fLerp2, 0.0f, 0.01f)) / 0.01f);
        int iIAuthTabCallback2 = (int) ((i4 * (1.0f - setScreenFlashOverlayColor.IAuthTabCallback(fLerp3, 0.99f, 1.0f))) / 0.01f);
        float f6 = this.trackLength;
        int i5 = (int) ((fLerp2 * f6) + iIAuthTabCallback);
        int i6 = (int) ((fLerp3 * f6) - iIAuthTabCallback2);
        float f7 = this.displayedCornerRadius;
        float f8 = this.displayedInnerCornerRadius;
        if (f7 != f8) {
            float fMax = Math.max(f7, f8);
            float f9 = this.trackLength;
            float f10 = fMax / f9;
            float fLerp4 = MathUtils.lerp(this.displayedCornerRadius, this.displayedInnerCornerRadius, setScreenFlashOverlayColor.IAuthTabCallback(i5 / f9, 0.0f, f10) / f10);
            float f11 = this.displayedCornerRadius;
            float f12 = this.displayedInnerCornerRadius;
            float f13 = this.trackLength;
            fLerp = MathUtils.lerp(f11, f12, setScreenFlashOverlayColor.IAuthTabCallback((f13 - i6) / f13, 0.0f, f10) / f10);
            f5 = fLerp4;
        } else {
            f5 = f7;
            fLerp = f5;
        }
        float f14 = (-this.trackLength) / 2.0f;
        boolean z2 = ((LinearProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator) && z && f3 > 0.0f;
        if (i5 <= i6) {
            float f15 = i5 + f5;
            float f16 = i6 - fLerp;
            float f17 = f5 * 2.0f;
            float f18 = fLerp * 2.0f;
            paint.setColor(i2);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.displayedTrackThickness);
            ((DrawingDelegate.PathPoint) this.endPoints.first).reset();
            ((DrawingDelegate.PathPoint) this.endPoints.second).reset();
            ((DrawingDelegate.PathPoint) this.endPoints.first).translate(f15 + f14, 0.0f);
            ((DrawingDelegate.PathPoint) this.endPoints.second).translate(f14 + f16, 0.0f);
            if (i5 == 0 && f16 + fLerp < f15 + f5) {
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair = this.endPoints;
                DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint = (DrawingDelegate.PathPoint) pair.first;
                float f19 = this.displayedTrackThickness;
                drawRoundedBlock(canvas, paint, pathPoint, f17, f19, f5, (DrawingDelegate.PathPoint) pair.second, f18, f19, fLerp, true);
                return;
            }
            if (f15 - f5 > f16 - fLerp) {
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair2 = this.endPoints;
                DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint2 = (DrawingDelegate.PathPoint) pair2.second;
                float f20 = this.displayedTrackThickness;
                drawRoundedBlock(canvas, paint, pathPoint2, f18, f20, fLerp, (DrawingDelegate.PathPoint) pair2.first, f17, f20, f5, false);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(((LinearProgressIndicatorSpec) this.spec).useStrokeCap() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (!z2) {
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair3 = this.endPoints;
                DrawingDelegate.PathPoint pathPoint3 = (DrawingDelegate.PathPoint) pair3.first;
                float f21 = pathPoint3.posVec[0];
                float f22 = pathPoint3.posVec[1];
                DrawingDelegate.PathPoint pathPoint4 = (DrawingDelegate.PathPoint) pair3.second;
                canvas.drawLine(f21, f22, pathPoint4.posVec[0], pathPoint4.posVec[1], paint);
            } else {
                PathMeasure pathMeasure = this.activePathMeasure;
                Path path = this.displayedActivePath;
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair4 = this.endPoints;
                float f23 = this.trackLength;
                calculateDisplayedPath(pathMeasure, path, pair4, f15 / f23, f16 / f23, f3, f4);
                canvas.drawPath(this.displayedActivePath, paint);
            }
            if (((LinearProgressIndicatorSpec) this.spec).useStrokeCap()) {
                return;
            }
            if (f15 > 0.0f && f5 > 0.0f) {
                drawRoundedBlock(canvas, paint, (DrawingDelegate.PathPoint) this.endPoints.first, f17, this.displayedTrackThickness, f5);
            }
            if (f16 >= this.trackLength || fLerp <= 0.0f) {
                return;
            }
            drawRoundedBlock(canvas, paint, (DrawingDelegate.PathPoint) this.endPoints.second, f18, this.displayedTrackThickness, fLerp);
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, int i2, int i3) {
        float fFloatValue;
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i2, i3);
        this.drawingDeterminateIndicator = false;
        if (((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize <= 0 || iCompositeARGBWithAlpha == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iCompositeARGBWithAlpha);
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.spec;
        if (linearProgressIndicatorSpec.trackStopIndicatorPadding != null) {
            fFloatValue = linearProgressIndicatorSpec.trackStopIndicatorPadding.floatValue() + (((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize / 2.0f);
        } else {
            fFloatValue = this.displayedTrackThickness / 2.0f;
        }
        DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint = new DrawingDelegate.PathPoint(new float[]{(this.trackLength / 2.0f) - fFloatValue, 0.0f}, new float[]{1.0f, 0.0f});
        LinearProgressIndicatorSpec linearProgressIndicatorSpec2 = (LinearProgressIndicatorSpec) this.spec;
        drawRoundedBlock(canvas, paint, pathPoint, linearProgressIndicatorSpec2.trackStopIndicatorSize, linearProgressIndicatorSpec2.trackStopIndicatorSize, (this.displayedCornerRadius * linearProgressIndicatorSpec2.trackStopIndicatorSize) / this.displayedTrackThickness);
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint, float f, float f2, float f3) {
        drawRoundedBlock(canvas, paint, pathPoint, f, f2, f3, null, 0.0f, 0.0f, 0.0f, false);
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint, float f, float f2, float f3, @Nullable DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint2, float f4, float f5, float f6, boolean z) {
        float f7;
        float f8;
        float f9;
        float fMin = Math.min(f2, this.displayedTrackThickness);
        float f10 = (-f) / 2.0f;
        float f11 = (-fMin) / 2.0f;
        float f12 = f / 2.0f;
        float f13 = fMin / 2.0f;
        RectF rectF = new RectF(f10, f11, f12, f13);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pathPoint2 != null) {
            float fMin2 = Math.min(f5, this.displayedTrackThickness);
            float fMin3 = Math.min(f4 / 2.0f, (f6 * fMin2) / this.displayedTrackThickness);
            RectF rectF2 = new RectF();
            if (z) {
                float f14 = (pathPoint2.posVec[0] - fMin3) - (pathPoint.posVec[0] - f3);
                if (f14 > 0.0f) {
                    pathPoint2.translate((-f14) / 2.0f, 0.0f);
                    f9 = f4 + f14;
                } else {
                    f9 = f4;
                }
                rectF2.set(0.0f, f11, f12, f13);
                f7 = 2.0f;
            } else {
                float f15 = (pathPoint2.posVec[0] + fMin3) - (pathPoint.posVec[0] + f3);
                if (f15 < 0.0f) {
                    f7 = 2.0f;
                    pathPoint2.translate((-f15) / 2.0f, 0.0f);
                    f8 = f4 - f15;
                } else {
                    f7 = 2.0f;
                    f8 = f4;
                }
                rectF2.set(f10, f11, 0.0f, f13);
                f9 = f8;
            }
            RectF rectF3 = new RectF((-f9) / f7, (-fMin2) / f7, f9 / f7, fMin2 / f7);
            float[] fArr = pathPoint2.posVec;
            canvas.translate(fArr[0], fArr[1]);
            canvas.rotate(vectorToCanvasRotation(pathPoint2.tanVec));
            Path path = new Path();
            path.addRoundRect(rectF3, fMin3, fMin3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-vectorToCanvasRotation(pathPoint2.tanVec));
            float[] fArr2 = pathPoint2.posVec;
            canvas.translate(-fArr2[0], -fArr2[1]);
            float[] fArr3 = pathPoint.posVec;
            canvas.translate(fArr3[0], fArr3[1]);
            canvas.rotate(vectorToCanvasRotation(pathPoint.tanVec));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            float[] fArr4 = pathPoint.posVec;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(vectorToCanvasRotation(pathPoint.tanVec));
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void invalidateCachedPaths() {
        this.cachedActivePath.rewind();
        if (((LinearProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator)) {
            int i2 = this.drawingDeterminateIndicator ? ((LinearProgressIndicatorSpec) this.spec).wavelengthDeterminate : ((LinearProgressIndicatorSpec) this.spec).wavelengthIndeterminate;
            float f = this.trackLength;
            int i3 = (int) (f / i2);
            this.adjustedWavelength = f / i3;
            for (int i4 = 0; i4 <= i3; i4++) {
                int i5 = i4 << 1;
                float f2 = i5 + 1;
                this.cachedActivePath.cubicTo(i5 + 0.48f, 0.0f, f2 - 0.48f, 1.0f, f2, 1.0f);
                float f3 = i5 + 2;
                this.cachedActivePath.cubicTo(f2 + 0.48f, 1.0f, f3 - 0.48f, 0.0f, f3, 0.0f);
            }
            this.transform.reset();
            this.transform.setScale(this.adjustedWavelength / 2.0f, -2.0f);
            this.transform.postTranslate(0.0f, 1.0f);
            this.cachedActivePath.transform(this.transform);
        } else {
            this.cachedActivePath.lineTo(this.trackLength, 0.0f);
        }
        this.activePathMeasure.setPath(this.cachedActivePath, false);
    }

    private void calculateDisplayedPath(@NonNull PathMeasure pathMeasure, @NonNull Path path, @NonNull Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair, float f, float f2, float f3, float f4) {
        int i2 = this.drawingDeterminateIndicator ? ((LinearProgressIndicatorSpec) this.spec).wavelengthDeterminate : ((LinearProgressIndicatorSpec) this.spec).wavelengthIndeterminate;
        if (pathMeasure == this.activePathMeasure && i2 != this.cachedWavelength) {
            this.cachedWavelength = i2;
            invalidateCachedPaths();
        }
        path.rewind();
        float f5 = (-this.trackLength) / 2.0f;
        boolean zHasWavyEffect = ((LinearProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator);
        if (zHasWavyEffect) {
            float f6 = this.trackLength;
            float f7 = this.adjustedWavelength;
            float f8 = f6 / f7;
            float f9 = f4 / f8;
            float f10 = f8 / (f8 + 1.0f);
            f = (f + f9) * f10;
            f2 = (f2 + f9) * f10;
            f5 -= f4 * f7;
        }
        float length = f * pathMeasure.getLength();
        float length2 = f2 * pathMeasure.getLength();
        pathMeasure.getSegment(length, length2, path, true);
        DrawingDelegate.PathPoint pathPoint = (DrawingDelegate.PathPoint) pair.first;
        pathPoint.reset();
        pathMeasure.getPosTan(length, pathPoint.posVec, pathPoint.tanVec);
        DrawingDelegate.PathPoint pathPoint2 = (DrawingDelegate.PathPoint) pair.second;
        pathPoint2.reset();
        pathMeasure.getPosTan(length2, pathPoint2.posVec, pathPoint2.tanVec);
        this.transform.reset();
        this.transform.setTranslate(f5, 0.0f);
        pathPoint.translate(f5, 0.0f);
        pathPoint2.translate(f5, 0.0f);
        if (zHasWavyEffect) {
            float f11 = this.displayedAmplitude * f3;
            this.transform.postScale(1.0f, f11);
            pathPoint.scale(1.0f, f11);
            pathPoint2.scale(1.0f, f11);
        }
        path.transform(this.transform);
    }
}
