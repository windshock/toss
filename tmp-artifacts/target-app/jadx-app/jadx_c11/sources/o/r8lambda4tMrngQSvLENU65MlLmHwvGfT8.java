package o;

import android.graphics.Shader;
import android.text.TextPaint;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.bindChildren;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda4tMrngQSvLENU65MlLmHwvGfT8 extends TextPaint {
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private hasMoreElements onExtraCallback;
    private bindChildren onExtraCallbackWithResult;
    private ExifSpeedConverter onNavigationEvent;
    private final Exif1 onWarmupCompleted;

    public r8lambda4tMrngQSvLENU65MlLmHwvGfT8(int i, float f) {
        super(i);
        ((TextPaint) this).density = f;
        this.onWarmupCompleted = withType.onWarmupCompleted(this);
        this.onExtraCallbackWithResult = bindChildren.Companion.onWarmupCompleted();
        this.onNavigationEvent = ExifSpeedConverter.Companion.onNavigationEvent();
    }

    public final void onExtraCallbackWithResult(@Nullable bindChildren bindchildren) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (bindchildren != null) {
            int i4 = i3 + 65;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, bindchildren)) {
                return;
            }
            int i6 = IAuthTabCallback + 93;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            this.onExtraCallbackWithResult = bindchildren;
            bindChildren.onNavigationEvent onnavigationevent = bindChildren.Companion;
            setUnderlineText(bindchildren.onNavigationEvent(onnavigationevent.IAuthTabCallback()));
            setStrikeThruText(this.onExtraCallbackWithResult.onNavigationEvent(onnavigationevent.onExtraCallback()));
        }
    }

    public final void onExtraCallback(@Nullable ExifSpeedConverter exifSpeedConverter) {
        int i = 2 % 2;
        if (exifSpeedConverter != null) {
            int i2 = asBinder + 111;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (!Intrinsics.areEqual(this.onNavigationEvent, exifSpeedConverter)) {
                    this.onNavigationEvent = exifSpeedConverter;
                    if (Intrinsics.areEqual(exifSpeedConverter, ExifSpeedConverter.Companion.onNavigationEvent())) {
                        int i3 = IAuthTabCallback + 27;
                        asBinder = i3 % 128;
                        if (i3 % 2 != 0) {
                            clearShadowLayer();
                            return;
                        } else {
                            clearShadowLayer();
                            obj.hashCode();
                            throw null;
                        }
                    }
                    setShadowLayer(r8lambdalb_N4iUVLbnWVSot7IGZUP33tOo.onWarmupCompleted(this.onNavigationEvent.onNavigationEvent()), Float.intBitsToFloat((int) (this.onNavigationEvent.onExtraCallback() >> 32)), Float.intBitsToFloat((int) this.onNavigationEvent.onExtraCallback()), ByteOrderedDataOutputStream.onNavigationEvent(this.onNavigationEvent.IAuthTabCallback()));
                    int i4 = asBinder + 61;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else {
                Intrinsics.areEqual(this.onNavigationEvent, exifSpeedConverter);
                obj.hashCode();
                throw null;
            }
        }
        int i6 = IAuthTabCallback + 5;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void onExtraCallback(long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (j != 16) {
            this.onWarmupCompleted.onExtraCallback(j);
            this.onWarmupCompleted.onNavigationEvent((Shader) null);
            int i3 = IAuthTabCallback + 7;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 % 5;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (r7 != 9205357640488583168L) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@Nullable readFully readfully, long j, float f) {
        float fCoerceIn;
        int i = 2 % 2;
        int i2 = asBinder + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!(readfully instanceof createString) || ((createString) readfully).onExtraCallbackWithResult() == 16) {
            if (readfully instanceof ExifAttribute) {
                int i4 = IAuthTabCallback + 87;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            }
            if (readfully == null) {
                this.onWarmupCompleted.onNavigationEvent((Shader) null);
                return;
            }
            return;
        }
        Exif1 exif1 = this.onWarmupCompleted;
        if (Float.isNaN(f)) {
            int i6 = IAuthTabCallback + 121;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            fCoerceIn = this.onWarmupCompleted.onNavigationEvent();
        } else {
            fCoerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f);
        }
        readfully.onWarmupCompleted(j, exif1, fCoerceIn);
    }

    public final void onNavigationEvent(@Nullable hasMoreElements hasmoreelements) {
        int i = 2 % 2;
        if (hasmoreelements == null || Intrinsics.areEqual(this.onExtraCallback, hasmoreelements)) {
            return;
        }
        this.onExtraCallback = hasmoreelements;
        if (Intrinsics.areEqual(hasmoreelements, ExifDataBuilder2.onExtraCallback)) {
            int i2 = asBinder + 47;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                this.onWarmupCompleted.onWarmupCompleted(save.Companion.onNavigationEvent());
                return;
            } else {
                this.onWarmupCompleted.onWarmupCompleted(save.Companion.onNavigationEvent());
                int i3 = 37 / 0;
                return;
            }
        }
        if (!(hasmoreelements instanceof ExifOutputStream)) {
            throw new NoWhenBranchMatchedException();
        }
        int i4 = IAuthTabCallback + 67;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        this.onWarmupCompleted.onWarmupCompleted(save.Companion.onWarmupCompleted());
        ExifOutputStream exifOutputStream = (ExifOutputStream) hasmoreelements;
        this.onWarmupCompleted.onNavigationEvent(exifOutputStream.asBinder());
        this.onWarmupCompleted.IAuthTabCallback(exifOutputStream.onExtraCallback());
        this.onWarmupCompleted.onExtraCallback(exifOutputStream.onWarmupCompleted());
        this.onWarmupCompleted.onNavigationEvent(exifOutputStream.onExtraCallbackWithResult());
        this.onWarmupCompleted.onNavigationEvent(exifOutputStream.onNavigationEvent());
    }
}
