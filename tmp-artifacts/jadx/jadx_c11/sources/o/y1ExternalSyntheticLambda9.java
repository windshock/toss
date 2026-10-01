package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RenderEffect;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.Exif1;
import o.ExtensionsManager1;
import o.getSupportedHighSpeedResolutions;
import o.setIso;
import o.y1ExternalSyntheticLambda9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class y1ExternalSyntheticLambda9 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ float IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fAsInterface = asInterface(getsupportedhighspeedresolutions);
        int i4 = onNavigationEvent + 101;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return fAsInterface;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {Long.valueOf(jLongValue)};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int[] iArr = (int[]) onExtraCallbackWithResult(341850354, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr2, -341850350, zzgc.onExtraCallbackWithResult());
        int i4 = onNavigationEvent + 65;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return iArr;
    }

    public static final /* synthetic */ void onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {getsupportedhighspeedresolutions, Float.valueOf(f)};
            onExtraCallbackWithResult(1442188638, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, -1442188630, zzgc.onExtraCallbackWithResult());
        } else {
            Object[] objArr2 = {getsupportedhighspeedresolutions, Float.valueOf(f)};
            onExtraCallbackWithResult(1442188638, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr2, -1442188630, zzgc.onExtraCallbackWithResult());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final int onExtraCallbackWithResult(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent;
        int i5 = i4 + 119;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        int i7 = (i & 16777215) | (i2 << 24);
        int i8 = i4 + 119;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            return i7;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = i8 | i;
        int i10 = (~(i7 | i8)) | (~(i7 | i)) | (~i9);
        int i11 = ~i;
        int i12 = (~(i4 | i11 | i5)) | (~(i7 | i11 | i8)) | (~(i9 | i5));
        int i13 = ~(i8 | i11 | i5);
        int i14 = i + i5 + i3 + ((-973178360) * i2) + (1542423572 * i6);
        int i15 = i14 * i14;
        int i16 = (i * (-490823948)) + 944362368 + (i5 * (-490821954)) + (i10 * (-997)) + (i12 * 997) + (i13 * 997) + ((-490822951) * i3) + (2145288392 * i2) + (779328756 * i6) + (i15 * (-1138819072));
        switch ((((-1657973228) * i) - 1073741824) + ((-187520530) * i5) + ((-735226349) * i10) + (i12 * 735226349) + (735226349 * i13) + ((-922746880) * i3) + (1207959552 * i2) + ((-1275068416) * i6) + (196542464 * i15) + (i16 * i16 * 1440284672)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                Exif1 exif1 = (Exif1) objArr[0];
                int[] iArr = (int[]) objArr[1];
                float[] fArr = (float[]) objArr[2];
                Exif1 exif12 = (Exif1) objArr[3];
                int[] iArr2 = (int[]) objArr[4];
                float[] fArr2 = (float[]) objArr[5];
                RectF rectF = (RectF) objArr[6];
                RectF rectF2 = (RectF) objArr[7];
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[8];
                getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[9];
                ExtensionsManager1 extensionsManager1 = (ExtensionsManager1) objArr[10];
                int i17 = 2 % 2;
                int i18 = onNavigationEvent + 15;
                onWarmupCompleted = i18 % 128;
                int i19 = i18 % 2;
                Unit unitOnNavigationEvent = onNavigationEvent(exif1, iArr, fArr, exif12, iArr2, fArr2, rectF, rectF2, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions, extensionsManager1);
                int i20 = onWarmupCompleted + 25;
                onNavigationEvent = i20 % 128;
                int i21 = i20 % 2;
                return unitOnNavigationEvent;
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[0];
                getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2 = (getSupportedHighSpeedResolutions) objArr[1];
                RectF rectF3 = (RectF) objArr[2];
                Paint paint = (Paint) objArr[3];
                RectF rectF4 = (RectF) objArr[4];
                Paint paint2 = (Paint) objArr[5];
                setIso setiso = (setIso) objArr[6];
                int i22 = 2 % 2;
                int i23 = onWarmupCompleted + 71;
                onNavigationEvent = i23 % 128;
                int i24 = i23 % 2;
                Unit unitOnWarmupCompleted = onWarmupCompleted(getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutions2, rectF3, paint, rectF4, paint2, setiso);
                int i25 = onNavigationEvent + 15;
                onWarmupCompleted = i25 % 128;
                int i26 = i25 % 2;
                return unitOnWarmupCompleted;
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RectF rectF, Exif1 exif1, RectF rectF2, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Exif1 exif12, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions3, setIso setiso) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(rectF, exif1, rectF2, getsupportedhighspeedresolutions, getsupportedhighspeedresolutionsfor, exif12, getsupportedhighspeedresolutions2, getsupportedhighspeedresolutions3, setiso);
        int i4 = onWarmupCompleted + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, RectF rectF, Exif1 exif1, setIso setiso) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions, rectF, exif1, setiso);
        }
        onWarmupCompleted(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions, rectF, exif1, setiso);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ float onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallbackDefault = IAuthTabCallbackDefault(getsupportedhighspeedresolutions);
        int i4 = onNavigationEvent + 69;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return fIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Paint paint, int[] iArr, float[] fArr, Paint paint2, int[] iArr2, float[] fArr2, RectF rectF, RectF rectF2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, ExtensionsManager1 extensionsManager1) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {paint, iArr, fArr, paint2, iArr2, fArr2, rectF, rectF2, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions, extensionsManager1};
            int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
            unit = (Unit) onExtraCallbackWithResult(-809273453, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, 809273454, zzgc.onExtraCallbackWithResult());
            int i3 = 23 / 0;
        } else {
            Object[] objArr2 = {paint, iArr, fArr, paint2, iArr2, fArr2, rectF, rectF2, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions, extensionsManager1};
            int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
            unit = (Unit) onExtraCallbackWithResult(-809273453, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr2, 809273454, zzgc.onExtraCallbackWithResult());
        }
        int i4 = onWarmupCompleted + 79;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {getsupportedhighspeedresolutions, Float.valueOf(f)};
            onExtraCallbackWithResult(-818035043, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, 818035050, zzgc.onExtraCallbackWithResult());
        } else {
            Object[] objArr2 = {getsupportedhighspeedresolutions, Float.valueOf(f)};
            onExtraCallbackWithResult(-818035043, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr2, 818035050, zzgc.onExtraCallbackWithResult());
            throw null;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(Exif1 exif1, RectF rectF, RectF rectF2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Lazy lazy, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(exif1, rectF, rectF2, getsupportedhighspeedresolutionsfor, lazy, extensionsManager1);
        int i4 = onWarmupCompleted + 77;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static final /* synthetic */ void onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(getsupportedhighspeedresolutions, f);
        int i4 = onWarmupCompleted + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final int[] onNavigationEvent(Lazy<int[]> lazy) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int[] iArr = (int[]) lazy.getValue();
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        int i5 = onNavigationEvent + 115;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return iArr;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int[] iArr;
        long jLongValue = ((Number) objArr[0]).longValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(ByteOrderedDataOutputStream.onNavigationEvent(jLongValue), 123);
            int iOnExtraCallbackWithResult2 = onExtraCallbackWithResult(ByteOrderedDataOutputStream.onNavigationEvent(jLongValue), 0);
            iArr = new int[5];
            iArr[0] = iOnExtraCallbackWithResult;
            iArr[0] = iOnExtraCallbackWithResult2;
        } else {
            iArr = new int[]{onExtraCallbackWithResult(ByteOrderedDataOutputStream.onNavigationEvent(jLongValue), 25), onExtraCallbackWithResult(ByteOrderedDataOutputStream.onNavigationEvent(jLongValue), 0)};
        }
        int i3 = onNavigationEvent + 109;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return iArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSupportedHighSpeedResolutions $dimAlpha$delegate;
        final /* synthetic */ float $dimTargetAlpha;
        final /* synthetic */ getSupportedHighSpeedResolutions $gradientAlpha;
        final /* synthetic */ getSupportedHighSpeedResolutions $gradientScale$delegate;
        final /* synthetic */ updateFocusedState<Float> $inSpec;
        final /* synthetic */ updateFocusedState<Float> $outSpec;
        final /* synthetic */ int $playCount;
        final /* synthetic */ findResAndMsg $scope;
        final /* synthetic */ int $totalInDuration;
        final /* synthetic */ getSupportedHighSpeedResolutions $viewScale$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(findResAndMsg findresandmsg, int i, updateFocusedState<Float> updatefocusedstate, updateFocusedState<Float> updatefocusedstate2, int i2, float f, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions3, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions4, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$scope = findresandmsg;
            this.$playCount = i;
            this.$inSpec = updatefocusedstate;
            this.$outSpec = updatefocusedstate2;
            this.$totalInDuration = i2;
            this.$dimTargetAlpha = f;
            this.$gradientAlpha = getsupportedhighspeedresolutions;
            this.$viewScale$delegate = getsupportedhighspeedresolutions2;
            this.$dimAlpha$delegate = getsupportedhighspeedresolutions3;
            this.$gradientScale$delegate = getsupportedhighspeedresolutions4;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onextracallbackCreate.invokeSuspend(unit);
            }
            onextracallbackCreate.invokeSuspend(unit);
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$scope, this.$playCount, this.$inSpec, this.$outSpec, this.$totalInDuration, this.$dimTargetAlpha, this.$gradientAlpha, this.$viewScale$delegate, this.$dimAlpha$delegate, this.$gradientScale$delegate, access13800Var);
            int i2 = onNavigationEvent + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = 57 / 0;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            maybeUpdateAnimatable.onNavigationEvent(this.$scope, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass5(this.$playCount, this.$inSpec, this.$outSpec, this.$totalInDuration, this.$dimTargetAlpha, this.$gradientAlpha, this.$viewScale$delegate, this.$dimAlpha$delegate, this.$gradientScale$delegate, null), 3, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i3 = onNavigationEvent + 47;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        /* renamed from: o.y1ExternalSyntheticLambda9$onExtraCallback$5, reason: invalid class name */
        public static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ getSupportedHighSpeedResolutions $dimAlpha$delegate;
            final /* synthetic */ float $dimTargetAlpha;
            final /* synthetic */ getSupportedHighSpeedResolutions $gradientAlpha;
            final /* synthetic */ getSupportedHighSpeedResolutions $gradientScale$delegate;
            final /* synthetic */ updateFocusedState<Float> $inSpec;
            final /* synthetic */ updateFocusedState<Float> $outSpec;
            final /* synthetic */ int $playCount;
            final /* synthetic */ int $totalInDuration;
            final /* synthetic */ getSupportedHighSpeedResolutions $viewScale$delegate;
            float F$0;
            int I$0;
            int I$1;
            int I$2;
            int I$3;
            int I$4;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(int i, updateFocusedState<Float> updatefocusedstate, updateFocusedState<Float> updatefocusedstate2, int i2, float f, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions3, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions4, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.$playCount = i;
                this.$inSpec = updatefocusedstate;
                this.$outSpec = updatefocusedstate2;
                this.$totalInDuration = i2;
                this.$dimTargetAlpha = f;
                this.$gradientAlpha = getsupportedhighspeedresolutions;
                this.$viewScale$delegate = getsupportedhighspeedresolutions2;
                this.$dimAlpha$delegate = getsupportedhighspeedresolutions3;
                this.$gradientScale$delegate = getsupportedhighspeedresolutions4;
            }

            public static /* synthetic */ Unit IAuthTabCallback(int i, float f, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions3, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions4, float f2, float f3) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 57;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = onNavigationEvent(i, f, getsupportedhighspeedresolutions, getsupportedhighspeedresolutions2, getsupportedhighspeedresolutions3, getsupportedhighspeedresolutions4, f2, f3);
                int i5 = onExtraCallback + 37;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 47 / 0;
                }
                return unitOnNavigationEvent;
            }

            public static /* synthetic */ Unit IAuthTabCallback(int i, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions3, float f2, float f3) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 81;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, getsupportedhighspeedresolutions, f, getsupportedhighspeedresolutions2, getsupportedhighspeedresolutions3, f2, f3);
                int i5 = onExtraCallback + 77;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$playCount, this.$inSpec, this.$outSpec, this.$totalInDuration, this.$dimTargetAlpha, this.$gradientAlpha, this.$viewScale$delegate, this.$dimAlpha$delegate, this.$gradientScale$delegate, access13800Var);
                int i2 = onExtraCallback + 57;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 57;
                onWarmupCompleted = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    return onExtraCallbackWithResult(findresandmsg, access13800Var);
                }
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
                int i3 = 83 / 0;
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 101;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass5 anonymousClass5Create = create(findresandmsg, access13800Var);
                if (i3 != 0) {
                    return anonymousClass5Create.invokeSuspend(Unit.INSTANCE);
                }
                anonymousClass5Create.invokeSuspend(Unit.INSTANCE);
                throw null;
            }

            private static final Unit onNavigationEvent(int i, float f, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions3, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions4, float f2, float f3) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 109;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                getIconContentView geticoncontentview = getIconContentView.onWarmupCompleted;
                float f4 = i;
                float fOnExtraCallback = geticoncontentview.IAuthTabCallback().onExtraCallback() / f4;
                y1ExternalSyntheticLambda9.onNavigationEvent(getsupportedhighspeedresolutions2, (geticoncontentview.IAuthTabCallback().onNavigationEvent().getInterpolation(Math.min(1.0f, f2 / fOnExtraCallback)) * 0.02f) + 1.0f);
                y1ExternalSyntheticLambda9.onExtraCallback(getsupportedhighspeedresolutions3, f * geticoncontentview.IAuthTabCallback().onNavigationEvent().getInterpolation(Math.min(1.0f, Math.max(0.0f, f2 - (480.0f / f4)) / fOnExtraCallback)));
                float f5 = f2 - (80.0f / f4);
                getsupportedhighspeedresolutions.onNavigationEvent(geticoncontentview.IAuthTabCallback().onNavigationEvent().getInterpolation(Math.min(1.0f, Math.max(0.0f, f5) / fOnExtraCallback)));
                y1ExternalSyntheticLambda9.onWarmupCompleted(getsupportedhighspeedresolutions4, geticoncontentview.IAuthTabCallbackStub().onNavigationEvent().getInterpolation(Math.min(1.0f, Math.max(0.0f, f5) / (geticoncontentview.IAuthTabCallbackStub().onExtraCallback() / f4))));
                Unit unit = Unit.INSTANCE;
                int i5 = onExtraCallback + 19;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            private static final Unit onExtraCallbackWithResult(int i, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions3, float f2, float f3) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 5;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                getIconContentView geticoncontentview = getIconContentView.onWarmupCompleted;
                float fOnExtraCallback = geticoncontentview.IAuthTabCallback().onExtraCallback() / i;
                float interpolation = geticoncontentview.IAuthTabCallbackStub().onNavigationEvent().getInterpolation(f2);
                y1ExternalSyntheticLambda9.onNavigationEvent(getsupportedhighspeedresolutions2, 1.02f - (geticoncontentview.IAuthTabCallback().onNavigationEvent().getInterpolation(Math.min(1.0f, f2 / fOnExtraCallback)) * 0.02f));
                float f4 = 1.0f - interpolation;
                getsupportedhighspeedresolutions.onNavigationEvent(f4);
                y1ExternalSyntheticLambda9.onExtraCallback(getsupportedhighspeedresolutions3, f * f4);
                Unit unit = Unit.INSTANCE;
                int i5 = onExtraCallback + 37;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0175  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x018b  */
            /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0175 -> B:19:0x0183). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                getSupportedHighSpeedResolutions getsupportedhighspeedresolutions;
                updateFocusedState updatefocusedstate;
                updateFocusedState updatefocusedstate2;
                getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2;
                int i;
                int i2;
                int i3;
                getSupportedHighSpeedResolutions getsupportedhighspeedresolutions3;
                float f;
                getSupportedHighSpeedResolutions getsupportedhighspeedresolutions4;
                getSupportedHighSpeedResolutions getsupportedhighspeedresolutions5;
                getSupportedHighSpeedResolutions getsupportedhighspeedresolutions6;
                int i4;
                float f2;
                int i5;
                int i6;
                getSupportedHighSpeedResolutions getsupportedhighspeedresolutions7;
                getSupportedHighSpeedResolutions getsupportedhighspeedresolutions8;
                updateFocusedState updatefocusedstate3;
                updateFocusedState updatefocusedstate4;
                int i7;
                Function2 function2;
                updateFocusedState updatefocusedstate5;
                Object obj2;
                int i8 = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i9 = this.label;
                if (i9 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    int i10 = this.$playCount;
                    updateFocusedState updatefocusedstate6 = this.$inSpec;
                    updateFocusedState updatefocusedstate7 = this.$outSpec;
                    int i11 = this.$totalInDuration;
                    float f3 = this.$dimTargetAlpha;
                    getsupportedhighspeedresolutions = this.$gradientAlpha;
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions9 = this.$viewScale$delegate;
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions10 = this.$dimAlpha$delegate;
                    updatefocusedstate = updatefocusedstate6;
                    updatefocusedstate2 = updatefocusedstate7;
                    getsupportedhighspeedresolutions2 = this.$gradientScale$delegate;
                    i = 0;
                    i2 = i10;
                    i3 = i11;
                    getsupportedhighspeedresolutions3 = getsupportedhighspeedresolutions9;
                    f = f3;
                    getsupportedhighspeedresolutions4 = getsupportedhighspeedresolutions10;
                    if (i < i2) {
                    }
                } else if (i9 == 1) {
                    i7 = this.I$4;
                    int i12 = this.I$3;
                    int i13 = this.I$2;
                    float f4 = this.F$0;
                    int i14 = this.I$1;
                    int i15 = this.I$0;
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions11 = (getSupportedHighSpeedResolutions) this.L$5;
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions12 = (getSupportedHighSpeedResolutions) this.L$4;
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions13 = (getSupportedHighSpeedResolutions) this.L$3;
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions14 = (getSupportedHighSpeedResolutions) this.L$2;
                    updateFocusedState updatefocusedstate8 = (updateFocusedState) this.L$1;
                    updateFocusedState updatefocusedstate9 = (updateFocusedState) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    f2 = f4;
                    i4 = i15;
                    updatefocusedstate4 = updatefocusedstate9;
                    getsupportedhighspeedresolutions8 = getsupportedhighspeedresolutions14;
                    i5 = i14;
                    getsupportedhighspeedresolutions6 = getsupportedhighspeedresolutions11;
                    getsupportedhighspeedresolutions7 = getsupportedhighspeedresolutions13;
                    updatefocusedstate3 = updatefocusedstate8;
                    i = i13;
                    getsupportedhighspeedresolutions5 = getsupportedhighspeedresolutions12;
                    i6 = i12;
                    final int i16 = i5;
                    Object obj3 = objOnWarmupCompleted;
                    updateFocusedState updatefocusedstate10 = updatefocusedstate4;
                    final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions15 = getsupportedhighspeedresolutions8;
                    int i17 = i7;
                    updatefocusedstate5 = updatefocusedstate3;
                    final float f5 = f2;
                    int i18 = i6;
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions16 = getsupportedhighspeedresolutions8;
                    final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions17 = getsupportedhighspeedresolutions7;
                    int i19 = i;
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions18 = getsupportedhighspeedresolutions7;
                    final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions19 = getsupportedhighspeedresolutions5;
                    function2 = new Function2() { // from class: im.toss.tds.compose.component.extension.HighlightModifiersKt$blinkHighlight$1$1$1$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj4, Object obj5) {
                            int i20 = 2 % 2;
                            int i21 = IAuthTabCallback + 75;
                            onNavigationEvent = i21 % 128;
                            int i22 = i21 % 2;
                            Object obj6 = null;
                            int i23 = i16;
                            getSupportedHighSpeedResolutions getsupportedhighspeedresolutions20 = getsupportedhighspeedresolutions15;
                            if (i22 == 0) {
                                y1ExternalSyntheticLambda9.onExtraCallback.AnonymousClass5.IAuthTabCallback(i23, getsupportedhighspeedresolutions20, f5, getsupportedhighspeedresolutions17, getsupportedhighspeedresolutions19, ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                                throw null;
                            }
                            Unit unitIAuthTabCallback = y1ExternalSyntheticLambda9.onExtraCallback.AnonymousClass5.IAuthTabCallback(i23, getsupportedhighspeedresolutions20, f5, getsupportedhighspeedresolutions17, getsupportedhighspeedresolutions19, ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                            int i24 = onNavigationEvent + 75;
                            IAuthTabCallback = i24 % 128;
                            if (i24 % 2 == 0) {
                                return unitIAuthTabCallback;
                            }
                            obj6.hashCode();
                            throw null;
                        }
                    };
                    this.L$0 = updatefocusedstate10;
                    this.L$1 = updatefocusedstate5;
                    this.L$2 = getsupportedhighspeedresolutions16;
                    this.L$3 = getsupportedhighspeedresolutions18;
                    this.L$4 = getsupportedhighspeedresolutions5;
                    this.L$5 = getsupportedhighspeedresolutions6;
                    this.I$0 = i4;
                    this.I$1 = i5;
                    this.F$0 = f2;
                    this.I$2 = i19;
                    this.I$3 = i18;
                    this.I$4 = i17;
                    this.label = 2;
                    obj2 = obj3;
                    if (getShowText.onWarmupCompleted(0.0f, 1.0f, 0.0f, updatefocusedstate5, function2, this, 4, (Object) null) != obj2) {
                    }
                } else {
                    if (i9 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i20 = onExtraCallback + 25;
                    onWarmupCompleted = i20 % 128;
                    int i21 = i20 % 2;
                    int i22 = this.I$2;
                    float f6 = this.F$0;
                    int i23 = this.I$1;
                    int i24 = this.I$0;
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions20 = (getSupportedHighSpeedResolutions) this.L$5;
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions21 = (getSupportedHighSpeedResolutions) this.L$4;
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions22 = (getSupportedHighSpeedResolutions) this.L$3;
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions23 = (getSupportedHighSpeedResolutions) this.L$2;
                    updateFocusedState updatefocusedstate11 = (updateFocusedState) this.L$1;
                    updatefocusedstate = (updateFocusedState) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    i2 = i24;
                    getsupportedhighspeedresolutions3 = getsupportedhighspeedresolutions22;
                    updatefocusedstate2 = updatefocusedstate11;
                    f = f6;
                    obj2 = objOnWarmupCompleted;
                    boolean z = true;
                    i3 = i23;
                    getsupportedhighspeedresolutions2 = getsupportedhighspeedresolutions20;
                    getsupportedhighspeedresolutions4 = getsupportedhighspeedresolutions21;
                    getsupportedhighspeedresolutions = getsupportedhighspeedresolutions23;
                    i = i22 + 1;
                    objOnWarmupCompleted = obj2;
                    if (i < i2) {
                        final int i25 = i3;
                        final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions24 = getsupportedhighspeedresolutions2;
                        final float f7 = f;
                        final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions25 = getsupportedhighspeedresolutions3;
                        final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions26 = getsupportedhighspeedresolutions;
                        final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions27 = getsupportedhighspeedresolutions4;
                        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions28 = getsupportedhighspeedresolutions;
                        f2 = f;
                        Function2 function22 = new Function2() { // from class: im.toss.tds.compose.component.extension.HighlightModifiersKt$blinkHighlight$1$1$1$$ExternalSyntheticLambda0
                            private static int onNavigationEvent = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj4, Object obj5) {
                                int i26 = 2 % 2;
                                int i27 = onWarmupCompleted + 27;
                                onNavigationEvent = i27 % 128;
                                if (i27 % 2 == 0) {
                                    return y1ExternalSyntheticLambda9.onExtraCallback.AnonymousClass5.IAuthTabCallback(i25, f7, getsupportedhighspeedresolutions26, getsupportedhighspeedresolutions25, getsupportedhighspeedresolutions27, getsupportedhighspeedresolutions24, ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                                }
                                y1ExternalSyntheticLambda9.onExtraCallback.AnonymousClass5.IAuthTabCallback(i25, f7, getsupportedhighspeedresolutions26, getsupportedhighspeedresolutions25, getsupportedhighspeedresolutions27, getsupportedhighspeedresolutions24, ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                                Object obj6 = null;
                                obj6.hashCode();
                                throw null;
                            }
                        };
                        this.L$0 = updatefocusedstate;
                        this.L$1 = updatefocusedstate2;
                        this.L$2 = getsupportedhighspeedresolutions28;
                        this.L$3 = getsupportedhighspeedresolutions25;
                        this.L$4 = getsupportedhighspeedresolutions27;
                        this.L$5 = getsupportedhighspeedresolutions24;
                        this.I$0 = i2;
                        this.I$1 = i3;
                        this.F$0 = f2;
                        this.I$2 = i;
                        this.I$3 = i;
                        this.I$4 = 0;
                        this.label = 1;
                        int i26 = i3;
                        if (getShowText.onWarmupCompleted(0.0f, 1.0f, 0.0f, updatefocusedstate, function22, this, 4, (Object) null) == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                        getsupportedhighspeedresolutions8 = getsupportedhighspeedresolutions28;
                        i6 = i;
                        updatefocusedstate4 = updatefocusedstate;
                        updatefocusedstate3 = updatefocusedstate2;
                        getsupportedhighspeedresolutions5 = getsupportedhighspeedresolutions27;
                        i7 = 0;
                        getsupportedhighspeedresolutions6 = getsupportedhighspeedresolutions24;
                        getsupportedhighspeedresolutions7 = getsupportedhighspeedresolutions25;
                        i4 = i2;
                        i5 = i26;
                        final int i162 = i5;
                        Object obj32 = objOnWarmupCompleted;
                        updateFocusedState updatefocusedstate102 = updatefocusedstate4;
                        final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions152 = getsupportedhighspeedresolutions8;
                        int i172 = i7;
                        updatefocusedstate5 = updatefocusedstate3;
                        final float f52 = f2;
                        int i182 = i6;
                        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions162 = getsupportedhighspeedresolutions8;
                        final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions172 = getsupportedhighspeedresolutions7;
                        int i192 = i;
                        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions182 = getsupportedhighspeedresolutions7;
                        final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions192 = getsupportedhighspeedresolutions5;
                        function2 = new Function2() { // from class: im.toss.tds.compose.component.extension.HighlightModifiersKt$blinkHighlight$1$1$1$$ExternalSyntheticLambda1
                            private static int IAuthTabCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj4, Object obj5) {
                                int i202 = 2 % 2;
                                int i212 = IAuthTabCallback + 75;
                                onNavigationEvent = i212 % 128;
                                int i222 = i212 % 2;
                                Object obj6 = null;
                                int i232 = i162;
                                getSupportedHighSpeedResolutions getsupportedhighspeedresolutions202 = getsupportedhighspeedresolutions152;
                                if (i222 == 0) {
                                    y1ExternalSyntheticLambda9.onExtraCallback.AnonymousClass5.IAuthTabCallback(i232, getsupportedhighspeedresolutions202, f52, getsupportedhighspeedresolutions172, getsupportedhighspeedresolutions192, ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                                    throw null;
                                }
                                Unit unitIAuthTabCallback = y1ExternalSyntheticLambda9.onExtraCallback.AnonymousClass5.IAuthTabCallback(i232, getsupportedhighspeedresolutions202, f52, getsupportedhighspeedresolutions172, getsupportedhighspeedresolutions192, ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                                int i242 = onNavigationEvent + 75;
                                IAuthTabCallback = i242 % 128;
                                if (i242 % 2 == 0) {
                                    return unitIAuthTabCallback;
                                }
                                obj6.hashCode();
                                throw null;
                            }
                        };
                        this.L$0 = updatefocusedstate102;
                        this.L$1 = updatefocusedstate5;
                        this.L$2 = getsupportedhighspeedresolutions162;
                        this.L$3 = getsupportedhighspeedresolutions182;
                        this.L$4 = getsupportedhighspeedresolutions5;
                        this.L$5 = getsupportedhighspeedresolutions6;
                        this.I$0 = i4;
                        this.I$1 = i5;
                        this.F$0 = f2;
                        this.I$2 = i192;
                        this.I$3 = i182;
                        this.I$4 = i172;
                        this.label = 2;
                        obj2 = obj32;
                        if (getShowText.onWarmupCompleted(0.0f, 1.0f, 0.0f, updatefocusedstate5, function2, this, 4, (Object) null) != obj2) {
                            return obj2;
                        }
                        i3 = i5;
                        f = f2;
                        i2 = i4;
                        getsupportedhighspeedresolutions3 = getsupportedhighspeedresolutions182;
                        getsupportedhighspeedresolutions2 = getsupportedhighspeedresolutions6;
                        getsupportedhighspeedresolutions4 = getsupportedhighspeedresolutions5;
                        i22 = i192;
                        getsupportedhighspeedresolutions = getsupportedhighspeedresolutions162;
                        updatefocusedstate2 = updatefocusedstate5;
                        updatefocusedstate = updatefocusedstate102;
                        z = true;
                        i = i22 + 1;
                        objOnWarmupCompleted = obj2;
                        if (i < i2) {
                            Unit unit = Unit.INSTANCE;
                            int i27 = onExtraCallback + 65;
                            onWarmupCompleted = i27 % 128;
                            if (i27 % 2 == 0) {
                                return unit;
                            }
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }
                    }
                }
            }
        }
    }

    private static final Unit onExtraCallback(Exif1 exif1, RectF rectF, RectF rectF2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Lazy lazy, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor, extensionsManager1.onExtraCallbackWithResult());
        float fOnExtraCallbackWithResult = (int) (extensionsManager1.onExtraCallbackWithResult() >> 32);
        float fOnExtraCallbackWithResult2 = (int) extensionsManager1.onExtraCallbackWithResult();
        onExtraCallback(exif1, fOnExtraCallbackWithResult, fOnExtraCallbackWithResult, onNavigationEvent((Lazy<int[]>) lazy), new float[]{0.0f, 1.0f}, 0.0f, 0.0f, 48, null);
        rectF.set(0.0f, 0.0f, fOnExtraCallbackWithResult, fOnExtraCallbackWithResult);
        rectF2.set(0.0f, 0.0f, fOnExtraCallbackWithResult, fOnExtraCallbackWithResult2);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 3;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        float f;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        int i5 = (i3 & 1) != 0 ? 1 : i;
        long j2 = (i3 & 2) != 0 ? 1500L : j;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-744222657, i2, -1, "im.toss.tds.compose.component.extension.blinkHighlight (HighlightModifiers.kt:44)");
        }
        final long jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent.onExtraCallbackWithResult()}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue();
        boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jLongValue);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        Object obj = null;
        if (!zOnWarmupCompleted) {
            int i6 = onNavigationEvent + 85;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                obj.hashCode();
                throw null;
            }
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.extension.HighlightModifiersKt$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i7 = 2 % 2;
                        int i8 = onWarmupCompleted + 1;
                        IAuthTabCallback = i8 % 128;
                        Object obj2 = null;
                        if (i8 % 2 == 0) {
                            Object[] objArr = {Long.valueOf(jLongValue)};
                            obj2.hashCode();
                            throw null;
                        }
                        Object[] objArr2 = {Long.valueOf(jLongValue)};
                        int[] iArr = (int[]) y1ExternalSyntheticLambda9.onExtraCallbackWithResult(-526271324, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr2, 526271329, zzgc.onExtraCallbackWithResult());
                        int i9 = onWarmupCompleted + 125;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 != 0) {
                            return iArr;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
        }
        final Lazy lazyOnExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult((Function0) objOnMinimized);
        final Exif1 exif1OnNavigationEvent = withType.onNavigationEvent();
        exif1OnNavigationEvent.onExtraCallbackWithResult(0.0f);
        final Exif1 exif1OnNavigationEvent2 = withType.onNavigationEvent();
        exif1OnNavigationEvent2.onExtraCallback(jLongValue);
        exif1OnNavigationEvent2.onExtraCallbackWithResult(0.0f);
        final RectF rectF = new RectF();
        final RectF rectF2 = new RectF();
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
            int i7 = onWarmupCompleted + 93;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult));
                obj.hashCode();
                throw null;
            }
            objOnMinimized2 = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized2;
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
            int i8 = onWarmupCompleted + 3;
            onNavigationEvent = i8 % 128;
            objOnMinimized3 = i8 % 2 != 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(ExtensionsManager1.onNavigationEvent(ExtensionsManager1.Companion.onNavigationEvent()), (CameraPresenceProviderExternalSyntheticLambda0) null, 4, (Object) null) : CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(ExtensionsManager1.onNavigationEvent(ExtensionsManager1.Companion.onNavigationEvent()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized4 = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
            int i9 = onNavigationEvent + 123;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
        }
        final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objOnMinimized4;
        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
            f = 0.0f;
            objOnMinimized5 = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
        } else {
            f = 0.0f;
        }
        final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2 = (getSupportedHighSpeedResolutions) objOnMinimized5;
        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized6 = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(f);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
        }
        final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions3 = (getSupportedHighSpeedResolutions) objOnMinimized6;
        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
            int i11 = onWarmupCompleted + 23;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            objOnMinimized7 = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(1.0f);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
        }
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions4 = (getSupportedHighSpeedResolutions) objOnMinimized7;
        getIconContentView geticoncontentview = getIconContentView.onWarmupCompleted;
        int iMax = Math.max(geticoncontentview.IAuthTabCallback().onExtraCallback() + 480, geticoncontentview.IAuthTabCallbackStub().onExtraCallback() + 80);
        int iMax2 = Math.max(geticoncontentview.IAuthTabCallback().onExtraCallback() + 480, geticoncontentview.IAuthTabCallbackStub().onExtraCallback() + 80);
        getCallToActionButton getcalltoactionbutton = getCallToActionButton.onExtraCallback;
        getThumbPosition getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(iMax2, 0, getcalltoactionbutton.IAuthTabCallback(), 2, (Object) null);
        getThumbPosition getthumbpositionOnExtraCallback = onQueryRefine.onExtraCallback(geticoncontentview.IAuthTabCallbackStub().onExtraCallback(), (int) j2, getcalltoactionbutton.IAuthTabCallback());
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
        boolean z = (((i2 & 112) ^ 48) > 32 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i5)) || (i2 & 48) == 32;
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getthumbpositionOnExtraCallbackWithResult);
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iMax);
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getthumbpositionOnExtraCallback);
        Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent | zOnExtraCallback | z | zOnExtraCallback2 | zOnNavigationEvent2) || objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized8 = new onExtraCallback(findresandmsg, i5, getthumbpositionOnExtraCallbackWithResult, getthumbpositionOnExtraCallback, iMax, 0.039215688f, getsupportedhighspeedresolutions2, getsupportedhighspeedresolutions4, getsupportedhighspeedresolutions, getsupportedhighspeedresolutions3, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized8);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent("BlinkEffect", (Function2) objOnMinimized8, cameraCaptureResultEmptyCameraCaptureResult, 6);
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = setExtensionStrength.onExtraCallback(attachTimestamp.onExtraCallback(quirksExternalSyntheticBackport0, onExtraCallback(getsupportedhighspeedresolutions4), onExtraCallback(getsupportedhighspeedresolutions4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (toMetersPerSecond) null, false, (RenderEffect) null, 0L, 0L, 0, 0, (seek) null, 524284, (Object) null));
        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(exif1OnNavigationEvent);
        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(lazyOnExtraCallbackWithResult);
        boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(rectF);
        boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(rectF2);
        Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnExtraCallback3 | zOnExtraCallback4 | zOnExtraCallback5 | zOnExtraCallback6) || objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized9 = new Function1() { // from class: im.toss.tds.compose.component.extension.HighlightModifiersKt$$ExternalSyntheticLambda5
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = onNavigationEvent + 117;
                    onWarmupCompleted = i14 % 128;
                    if (i14 % 2 != 0) {
                        return y1ExternalSyntheticLambda9.onWarmupCompleted(exif1OnNavigationEvent, rectF, rectF2, getsupportedhighspeedresolutionsfor, lazyOnExtraCallbackWithResult, (ExtensionsManager1) obj2);
                    }
                    y1ExternalSyntheticLambda9.onWarmupCompleted(exif1OnNavigationEvent, rectF, rectF2, getsupportedhighspeedresolutionsfor, lazyOnExtraCallbackWithResult, (ExtensionsManager1) obj2);
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized9);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized9);
        boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(rectF);
        boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(exif1OnNavigationEvent);
        boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(rectF2);
        boolean zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(exif1OnNavigationEvent2);
        Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnExtraCallback7 | zOnExtraCallback8 | zOnExtraCallback9 | zOnExtraCallback10)) {
            int i13 = onWarmupCompleted + 101;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            if (objOnMinimized10 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized10 = new Function1() { // from class: im.toss.tds.compose.component.extension.HighlightModifiersKt$$ExternalSyntheticLambda6
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2) {
                        int i15 = 2 % 2;
                        int i16 = IAuthTabCallback + 91;
                        onWarmupCompleted = i16 % 128;
                        int i17 = i16 % 2;
                        RectF rectF3 = rectF2;
                        Exif1 exif1 = exif1OnNavigationEvent2;
                        if (i17 != 0) {
                            y1ExternalSyntheticLambda9.onExtraCallbackWithResult(rectF3, exif1, rectF, getsupportedhighspeedresolutions3, getsupportedhighspeedresolutionsfor, exif1OnNavigationEvent, getsupportedhighspeedresolutions2, getsupportedhighspeedresolutions, (setIso) obj2);
                            throw null;
                        }
                        Unit unitOnExtraCallbackWithResult = y1ExternalSyntheticLambda9.onExtraCallbackWithResult(rectF3, exif1, rectF, getsupportedhighspeedresolutions3, getsupportedhighspeedresolutionsfor, exif1OnNavigationEvent, getsupportedhighspeedresolutions2, getsupportedhighspeedresolutions, (setIso) obj2);
                        int i18 = IAuthTabCallback + 59;
                        onWarmupCompleted = i18 % 128;
                        int i19 = i18 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized10);
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport0.onExtraCallback(SessionProcessorSurface.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Function1) objOnMinimized10));
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return quirksExternalSyntheticBackport0OnExtraCallback2;
    }

    public static final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Object obj, int i, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) throws Throwable {
        int i4;
        long j2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Object obj2 = (i3 & 1) != 0 ? "ShineEffect" : obj;
        if ((i3 & 2) != 0) {
            int i6 = onNavigationEvent + 107;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            i4 = 1;
        } else {
            i4 = i;
        }
        if ((i3 & 4) != 0) {
            int i8 = onWarmupCompleted + 95;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            j2 = 100;
        } else {
            j2 = j;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1751478418, i2, -1, "im.toss.tds.compose.component.extension.shineHighlight (HighlightModifiers.kt:158)");
        }
        if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0)) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1264286475);
            quirksExternalSyntheticBackport0OnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, obj2, i4, j2, cameraCaptureResultEmptyCameraCaptureResult, i2 & 8190, 0);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1264364874);
            Object[] objArr = {quirksExternalSyntheticBackport0, obj2, Integer.valueOf(i4), Long.valueOf(j2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2 & 8190), 0};
            quirksExternalSyntheticBackport0OnExtraCallback = (QuirksExternalSyntheticBackport0) onExtraCallbackWithResult(369647232, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, -369647230, zzgc.onExtraCallbackWithResult());
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = onNavigationEvent + 57;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSupportedHighSpeedResolutions $boxWidth$delegate;
        final /* synthetic */ int $playCount;
        final /* synthetic */ findResAndMsg $scope;
        final /* synthetic */ updateFocusedState<Float> $translateSpec;
        final /* synthetic */ getSupportedHighSpeedResolutions $translateX;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(findResAndMsg findresandmsg, int i, updateFocusedState<Float> updatefocusedstate, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$scope = findresandmsg;
            this.$playCount = i;
            this.$translateSpec = updatefocusedstate;
            this.$translateX = getsupportedhighspeedresolutions;
            this.$boxWidth$delegate = getsupportedhighspeedresolutions2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$scope, this.$playCount, this.$translateSpec, this.$translateX, this.$boxWidth$delegate, access13800Var);
            int i2 = onWarmupCompleted + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 111;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 21 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            maybeUpdateAnimatable.onNavigationEvent(this.$scope, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass5(this.$playCount, this.$translateSpec, this.$translateX, this.$boxWidth$delegate, null), 3, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallback + 67;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }

        /* renamed from: o.y1ExternalSyntheticLambda9$IAuthTabCallback$5, reason: invalid class name */
        public static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ getSupportedHighSpeedResolutions $boxWidth$delegate;
            final /* synthetic */ int $playCount;
            final /* synthetic */ updateFocusedState<Float> $translateSpec;
            final /* synthetic */ getSupportedHighSpeedResolutions $translateX;
            int I$0;
            int I$1;
            int I$2;
            int I$3;
            Object L$0;
            Object L$1;
            Object L$2;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(int i, updateFocusedState<Float> updatefocusedstate, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.$playCount = i;
                this.$translateSpec = updatefocusedstate;
                this.$translateX = getsupportedhighspeedresolutions;
                this.$boxWidth$delegate = getsupportedhighspeedresolutions2;
            }

            public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, float f, float f2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 79;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return onExtraCallbackWithResult(getsupportedhighspeedresolutions, getsupportedhighspeedresolutions2, f, f2);
                }
                onExtraCallbackWithResult(getsupportedhighspeedresolutions, getsupportedhighspeedresolutions2, f, f2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$playCount, this.$translateSpec, this.$translateX, this.$boxWidth$delegate, access13800Var);
                int i2 = onExtraCallback + 91;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 1;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallbackWithResult + 5;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 21;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallbackWithResult + 59;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 42 / 0;
                }
                return objInvokeSuspend;
            }

            private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, float f, float f2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 79;
                onExtraCallback = i2 % 128;
                getsupportedhighspeedresolutions.onNavigationEvent(i2 % 2 == 0 ? (-y1ExternalSyntheticLambda9.IAuthTabCallback(getsupportedhighspeedresolutions2)) * ((y1ExternalSyntheticLambda9.IAuthTabCallback(getsupportedhighspeedresolutions2) - f) / 0.0f) : (-y1ExternalSyntheticLambda9.IAuthTabCallback(getsupportedhighspeedresolutions2)) + (y1ExternalSyntheticLambda9.IAuthTabCallback(getsupportedhighspeedresolutions2) * f * 2.0f));
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0095 -> B:21:0x009a). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                int i;
                updateFocusedState updatefocusedstate;
                final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions;
                final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2;
                int i2;
                int i3 = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 != 0) {
                    int i5 = onExtraCallback;
                    int i6 = i5 + 45;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0 ? i4 != 1 : i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = i5 + 107;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = this.I$1;
                    int i10 = this.I$0;
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions3 = (getSupportedHighSpeedResolutions) this.L$2;
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions4 = (getSupportedHighSpeedResolutions) this.L$1;
                    updateFocusedState updatefocusedstate2 = (updateFocusedState) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    i = i10;
                    getsupportedhighspeedresolutions2 = getsupportedhighspeedresolutions3;
                    getsupportedhighspeedresolutions = getsupportedhighspeedresolutions4;
                    updatefocusedstate = updatefocusedstate2;
                    i2 = i9 + 1;
                    int i11 = onExtraCallbackWithResult + 39;
                    onExtraCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 5 % 3;
                    }
                    if (i2 < i) {
                        Function2 function2 = new Function2() { // from class: im.toss.tds.compose.component.extension.HighlightModifiersKt$shineHighlightLightMode$1$1$1$$ExternalSyntheticLambda0
                            private static int onExtraCallbackWithResult = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i13 = 2 % 2;
                                int i14 = onExtraCallbackWithResult + 37;
                                onNavigationEvent = i14 % 128;
                                int i15 = i14 % 2;
                                getSupportedHighSpeedResolutions getsupportedhighspeedresolutions5 = getsupportedhighspeedresolutions;
                                if (i15 != 0) {
                                    return y1ExternalSyntheticLambda9.IAuthTabCallback.AnonymousClass5.onNavigationEvent(getsupportedhighspeedresolutions5, getsupportedhighspeedresolutions2, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                                }
                                y1ExternalSyntheticLambda9.IAuthTabCallback.AnonymousClass5.onNavigationEvent(getsupportedhighspeedresolutions5, getsupportedhighspeedresolutions2, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                                throw null;
                            }
                        };
                        this.L$0 = updatefocusedstate;
                        this.L$1 = getsupportedhighspeedresolutions;
                        this.L$2 = getsupportedhighspeedresolutions2;
                        this.I$0 = i;
                        this.I$1 = i2;
                        this.I$2 = i2;
                        this.I$3 = 0;
                        this.label = 1;
                        updateFocusedState updatefocusedstate3 = updatefocusedstate;
                        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions5 = getsupportedhighspeedresolutions;
                        if (getShowText.onWarmupCompleted(0.0f, 1.0f, 0.0f, updatefocusedstate, function2, this, 4, (Object) null) == objOnWarmupCompleted) {
                            int i13 = onExtraCallback + 11;
                            onExtraCallbackWithResult = i13 % 128;
                            if (i13 % 2 != 0) {
                                int i14 = 45 / 0;
                            }
                            return objOnWarmupCompleted;
                        }
                        i9 = i2;
                        getsupportedhighspeedresolutions = getsupportedhighspeedresolutions5;
                        updatefocusedstate = updatefocusedstate3;
                        i2 = i9 + 1;
                        int i112 = onExtraCallbackWithResult + 39;
                        onExtraCallback = i112 % 128;
                        if (i112 % 2 == 0) {
                        }
                        if (i2 < i) {
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    ResultKt.onNavigationEvent(obj);
                    int i15 = this.$playCount;
                    i = i15;
                    updatefocusedstate = this.$translateSpec;
                    getsupportedhighspeedresolutions = this.$translateX;
                    getsupportedhighspeedresolutions2 = this.$boxWidth$delegate;
                    i2 = 0;
                    if (i2 < i) {
                    }
                }
            }
        }
    }

    private static final Unit onNavigationEvent(Exif1 exif1, int[] iArr, float[] fArr, Exif1 exif12, int[] iArr2, float[] fArr2, RectF rectF, RectF rectF2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor, extensionsManager1.onExtraCallbackWithResult());
        asBinder(getsupportedhighspeedresolutions, (int) (extensionsManager1.onExtraCallbackWithResult() >> 32));
        float fOnExtraCallbackWithResult = (int) (extensionsManager1.onExtraCallbackWithResult() >> 32);
        float fOnExtraCallbackWithResult2 = (int) extensionsManager1.onExtraCallbackWithResult();
        onWarmupCompleted(exif1, fOnExtraCallbackWithResult, fOnExtraCallbackWithResult, 140.0d, iArr, fArr, 0.0f, 0.0f, 96, null);
        onWarmupCompleted(exif12, fOnExtraCallbackWithResult, fOnExtraCallbackWithResult2, 0.0d, iArr2, fArr2, 0.0f, 0.0f, 96, null);
        rectF.set(0.0f, 0.0f, fOnExtraCallbackWithResult, fOnExtraCallbackWithResult);
        rectF2.set(0.0f, 0.0f, fOnExtraCallbackWithResult, fOnExtraCallbackWithResult2);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, RectF rectF, Exif1 exif1, setIso setiso) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        setiso.onWarmupCompleted();
        float fOnNavigationEvent = (int) (onNavigationEvent((getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor) >> 32);
        float fOnNavigationEvent2 = (int) onNavigationEvent((getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor);
        readShort readshortOnNavigationEvent = setiso.onExtraCallback().onNavigationEvent();
        readshortOnNavigationEvent.onNavigationEvent(getsupportedhighspeedresolutions.onNavigationEvent(), 0.0f);
        readshortOnNavigationEvent.onNavigationEvent((fOnNavigationEvent - fOnNavigationEvent) / 2.0f, -((fOnNavigationEvent - fOnNavigationEvent2) / 2.0f));
        readshortOnNavigationEvent.onExtraCallbackWithResult(new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom), exif1);
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 89 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        RectF rectF;
        float f;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        Object obj = objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        long jLongValue = ((Number) objArr[3]).longValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue2 = ((Number) objArr[5]).intValue();
        int iIntValue3 = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if ((iIntValue3 & 1) != 0) {
            int i5 = i2 + 95;
            onNavigationEvent = i5 % 128;
            obj = "ShineEffect";
            if (i5 % 2 != 0) {
                int i6 = 99 / 0;
            }
        }
        if ((iIntValue3 & 2) != 0) {
            iIntValue = 1;
        }
        if ((iIntValue3 & 4) != 0) {
            int i7 = i2 + 35;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            jLongValue = 100;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(263100857, iIntValue2, -1, "im.toss.tds.compose.component.extension.shineHighlightLightMode (HighlightModifiers.kt:167)");
        }
        final Exif1 exif1OnNavigationEvent = withType.onNavigationEvent();
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            int i9 = onNavigationEvent + 59;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            objOnMinimized = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objOnMinimized;
        final int[] iArr = {Color.parseColor("#00FFFFFF"), Color.parseColor("#CCFFFFFF"), Color.parseColor("#00FFFFFF")};
        final float[] fArr = {0.3f, 0.5f, 0.7f};
        final RectF rectF2 = new RectF();
        final Exif1 exif1OnNavigationEvent2 = withType.onNavigationEvent();
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
        final int[] iArr2 = {ByteOrderedDataOutputStream.onNavigationEvent(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IPostMessageService_Parcel()), 0, 0, ByteOrderedDataOutputStream.onNavigationEvent(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IPostMessageService_Parcel())};
        final float[] fArr2 = {0.0f, 0.4f, 0.6f, 1.0f};
        RectF rectF3 = new RectF();
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        Object obj2 = null;
        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
            int i11 = onNavigationEvent + 29;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult));
                obj2.hashCode();
                throw null;
            }
            objOnMinimized2 = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized2;
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
            int i12 = onNavigationEvent + 85;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            rectF = rectF3;
            objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(ExtensionsManager1.onNavigationEvent(ExtensionsManager1.Companion.onNavigationEvent()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
        } else {
            rectF = rectF3;
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
            f = 0.0f;
            objOnMinimized4 = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
        } else {
            f = 0.0f;
        }
        final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2 = (getSupportedHighSpeedResolutions) objOnMinimized4;
        getThumbPosition getthumbpositionOnExtraCallback = onQueryRefine.onExtraCallback(2200, (int) jLongValue, getCallToActionButton.onExtraCallback.IAuthTabCallback(0.7f, f, 0.7f, 1.0f));
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
        boolean z = (((iIntValue2 & 896) ^ 384) > 256 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iIntValue)) || (iIntValue2 & 384) == 256;
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getthumbpositionOnExtraCallback);
        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnExtraCallback | z | zOnNavigationEvent) || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized5 = new IAuthTabCallback(findresandmsg, iIntValue, getthumbpositionOnExtraCallback, getsupportedhighspeedresolutions2, getsupportedhighspeedresolutions, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(obj, (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue2 >> 3) & 14);
        final RectF rectF4 = rectF;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = setExtensionStrength.onExtraCallback(attachTimestamp.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (toMetersPerSecond) null, false, (RenderEffect) null, 0L, 0L, 0, 0, (seek) null, 524287, (Object) null));
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(exif1OnNavigationEvent);
        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iArr);
        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(fArr);
        boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(exif1OnNavigationEvent2);
        boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iArr2);
        boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(fArr2);
        boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(rectF2);
        boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(rectF4);
        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnExtraCallback2 | zOnExtraCallback3 | zOnExtraCallback4 | zOnExtraCallback5 | zOnExtraCallback6 | zOnExtraCallback7 | zOnExtraCallback8 | zOnExtraCallback9) || objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized6 = new Function1() { // from class: im.toss.tds.compose.component.extension.HighlightModifiersKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj3) {
                    int i14 = 2 % 2;
                    int i15 = IAuthTabCallback + 89;
                    onNavigationEvent = i15 % 128;
                    int i16 = i15 % 2;
                    Object[] objArr2 = {exif1OnNavigationEvent, iArr, fArr, exif1OnNavigationEvent2, iArr2, fArr2, rectF2, rectF4, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions, (ExtensionsManager1) obj3};
                    int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
                    Unit unit = (Unit) y1ExternalSyntheticLambda9.onExtraCallbackWithResult(1697741497, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr2, -1697741494, zzgc.onExtraCallbackWithResult());
                    int i17 = onNavigationEvent + 113;
                    IAuthTabCallback = i17 % 128;
                    if (i17 % 2 != 0) {
                        int i18 = 42 / 0;
                    }
                    return unit;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized6);
        boolean zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(rectF2);
        boolean zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(exif1OnNavigationEvent);
        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnExtraCallback10 | zOnExtraCallback11) || objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized7 = new Function1() { // from class: im.toss.tds.compose.component.extension.HighlightModifiersKt$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj3) {
                    int i14 = 2 % 2;
                    int i15 = onExtraCallback + 9;
                    onExtraCallbackWithResult = i15 % 128;
                    Object obj4 = null;
                    if (i15 % 2 != 0) {
                        y1ExternalSyntheticLambda9.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions2, rectF2, exif1OnNavigationEvent, (setIso) obj3);
                        throw null;
                    }
                    Unit unitOnExtraCallbackWithResult = y1ExternalSyntheticLambda9.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions2, rectF2, exif1OnNavigationEvent, (setIso) obj3);
                    int i16 = onExtraCallback + 121;
                    onExtraCallbackWithResult = i16 % 128;
                    if (i16 % 2 == 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    obj4.hashCode();
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport0.onExtraCallback(SessionProcessorSurface.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Function1) objOnMinimized7));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return quirksExternalSyntheticBackport0OnExtraCallback2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ getSupportedHighSpeedResolutions $boxWidth$delegate;
        final /* synthetic */ int $playCount;
        final /* synthetic */ findResAndMsg $scope;
        final /* synthetic */ updateFocusedState<Float> $translateSpec;
        final /* synthetic */ getSupportedHighSpeedResolutions $translateX;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(findResAndMsg findresandmsg, int i, updateFocusedState<Float> updatefocusedstate, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$scope = findresandmsg;
            this.$playCount = i;
            this.$translateSpec = updatefocusedstate;
            this.$translateX = getsupportedhighspeedresolutions;
            this.$boxWidth$delegate = getsupportedhighspeedresolutions2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$scope, this.$playCount, this.$translateSpec, this.$translateX, this.$boxWidth$delegate, access13800Var);
            int i2 = onExtraCallback + 37;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 37;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 29;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            maybeUpdateAnimatable.onNavigationEvent(this.$scope, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass3(this.$playCount, this.$translateSpec, this.$translateX, this.$boxWidth$delegate, null), 3, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallback + 87;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }

        /* renamed from: o.y1ExternalSyntheticLambda9$onNavigationEvent$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ getSupportedHighSpeedResolutions $boxWidth$delegate;
            final /* synthetic */ int $playCount;
            final /* synthetic */ updateFocusedState<Float> $translateSpec;
            final /* synthetic */ getSupportedHighSpeedResolutions $translateX;
            int I$0;
            int I$1;
            int I$2;
            int I$3;
            Object L$0;
            Object L$1;
            Object L$2;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(int i, updateFocusedState<Float> updatefocusedstate, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, access13800<? super AnonymousClass3> access13800Var) {
                super(2, access13800Var);
                this.$playCount = i;
                this.$translateSpec = updatefocusedstate;
                this.$translateX = getsupportedhighspeedresolutions;
                this.$boxWidth$delegate = getsupportedhighspeedresolutions2;
            }

            public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, float f, float f2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 1;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = onWarmupCompleted(getsupportedhighspeedresolutions, getsupportedhighspeedresolutions2, f, f2);
                int i4 = IAuthTabCallback + 75;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 61 / 0;
                }
                return unitOnWarmupCompleted;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$playCount, this.$translateSpec, this.$translateX, this.$boxWidth$delegate, access13800Var);
                int i2 = IAuthTabCallback + 55;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 47 / 0;
                }
                return anonymousClass3;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 19;
                onNavigationEvent = i2 % 128;
                Object obj3 = null;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    onExtraCallback(findresandmsg, access13800Var);
                    throw null;
                }
                Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i3 = IAuthTabCallback + 41;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return objOnExtraCallback;
                }
                obj3.hashCode();
                throw null;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 67;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 59;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 54 / 0;
                }
                return objInvokeSuspend;
            }

            private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, float f, float f2) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 1;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                getsupportedhighspeedresolutions.onNavigationEvent((-y1ExternalSyntheticLambda9.onNavigationEvent(getsupportedhighspeedresolutions2)) + (y1ExternalSyntheticLambda9.onNavigationEvent(getsupportedhighspeedresolutions2) * f * 2.0f));
                Unit unit = Unit.INSTANCE;
                int i4 = onNavigationEvent + 3;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0083 -> B:18:0x0086). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                int i;
                updateFocusedState updatefocusedstate;
                final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions;
                final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2;
                int i2;
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 109;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i6 = this.label;
                if (i6 != 0) {
                    int i7 = IAuthTabCallback + 1;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 != 0 ? i6 != 1 : i6 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i8 = this.I$1;
                    int i9 = this.I$0;
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions3 = (getSupportedHighSpeedResolutions) this.L$2;
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions4 = (getSupportedHighSpeedResolutions) this.L$1;
                    updateFocusedState updatefocusedstate2 = (updateFocusedState) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    i = i9;
                    getsupportedhighspeedresolutions2 = getsupportedhighspeedresolutions3;
                    getsupportedhighspeedresolutions = getsupportedhighspeedresolutions4;
                    updatefocusedstate = updatefocusedstate2;
                    i2 = i8 + 1;
                    if (i2 < i) {
                        Function2 function2 = new Function2() { // from class: im.toss.tds.compose.component.extension.HighlightModifiersKt$shineHighlightDarkMode$1$1$1$$ExternalSyntheticLambda0
                            private static int onExtraCallbackWithResult = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i10 = 2 % 2;
                                int i11 = onExtraCallbackWithResult + 79;
                                onWarmupCompleted = i11 % 128;
                                int i12 = i11 % 2;
                                getSupportedHighSpeedResolutions getsupportedhighspeedresolutions5 = getsupportedhighspeedresolutions;
                                if (i12 != 0) {
                                    return y1ExternalSyntheticLambda9.onNavigationEvent.AnonymousClass3.onExtraCallback(getsupportedhighspeedresolutions5, getsupportedhighspeedresolutions2, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                                }
                                y1ExternalSyntheticLambda9.onNavigationEvent.AnonymousClass3.onExtraCallback(getsupportedhighspeedresolutions5, getsupportedhighspeedresolutions2, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                        };
                        this.L$0 = updatefocusedstate;
                        this.L$1 = getsupportedhighspeedresolutions;
                        this.L$2 = getsupportedhighspeedresolutions2;
                        this.I$0 = i;
                        this.I$1 = i2;
                        this.I$2 = i2;
                        this.I$3 = 0;
                        this.label = 1;
                        updateFocusedState updatefocusedstate3 = updatefocusedstate;
                        if (getShowText.onWarmupCompleted(0.0f, 1.0f, 0.0f, updatefocusedstate, function2, this, 4, (Object) null) == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                        i8 = i2;
                        updatefocusedstate = updatefocusedstate3;
                        i2 = i8 + 1;
                        if (i2 < i) {
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    ResultKt.onNavigationEvent(obj);
                    int i10 = this.$playCount;
                    i = i10;
                    updatefocusedstate = this.$translateSpec;
                    getsupportedhighspeedresolutions = this.$translateX;
                    getsupportedhighspeedresolutions2 = this.$boxWidth$delegate;
                    i2 = 0;
                    if (i2 < i) {
                    }
                }
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Paint paint = (Paint) objArr[0];
        int[] iArr = (int[]) objArr[1];
        float[] fArr = (float[]) objArr[2];
        Paint paint2 = (Paint) objArr[3];
        int[] iArr2 = (int[]) objArr[4];
        float[] fArr2 = (float[]) objArr[5];
        RectF rectF = (RectF) objArr[6];
        RectF rectF2 = (RectF) objArr[7];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[8];
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[9];
        ExtensionsManager1 extensionsManager1 = (ExtensionsManager1) objArr[10];
        int i = 2 % 2;
        onExtraCallback((getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor, extensionsManager1.onExtraCallbackWithResult());
        IAuthTabCallbackStub(getsupportedhighspeedresolutions, (int) (extensionsManager1.onExtraCallbackWithResult() >> 32));
        float fOnExtraCallbackWithResult = (int) (extensionsManager1.onExtraCallbackWithResult() >> 32);
        float fOnExtraCallbackWithResult2 = (int) extensionsManager1.onExtraCallbackWithResult();
        onNavigationEvent(paint, fOnExtraCallbackWithResult, fOnExtraCallbackWithResult, 140.0d, iArr, fArr, 0.0f, 0.0f, 96, null);
        onNavigationEvent(paint2, fOnExtraCallbackWithResult, fOnExtraCallbackWithResult2, 0.0d, iArr2, fArr2, 0.0f, 0.0f, 96, null).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        rectF.set(0.0f, 0.0f, fOnExtraCallbackWithResult, fOnExtraCallbackWithResult);
        rectF2.set(0.0f, 0.0f, fOnExtraCallbackWithResult, fOnExtraCallbackWithResult2);
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final QuirksExternalSyntheticBackport0 onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Object obj, int i, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) throws Throwable {
        int i4;
        float f;
        Paint paint;
        RectF rectF;
        RectF rectF2;
        float[] fArr;
        float[] fArr2;
        Throwable th;
        final RectF rectF3;
        Paint paint2;
        int i5 = 2 % 2;
        Object obj2 = (i3 & 1) != 0 ? "ShineEffect" : obj;
        if ((i3 & 2) != 0) {
            int i6 = onWarmupCompleted + 39;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            i4 = 1;
        } else {
            i4 = i;
        }
        long j2 = (i3 & 4) != 0 ? 100L : j;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onWarmupCompleted + 41;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1440406965, i2, -1, "im.toss.tds.compose.component.extension.shineHighlightDarkMode (HighlightModifiers.kt:260)");
        }
        final Paint paint3 = new Paint();
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objOnMinimized;
        final int[] iArr = {Color.parseColor("#0017171C"), Color.parseColor("#0AFFFFFF"), Color.parseColor("#0017171C")};
        float[] fArr3 = {0.4f, 0.5f, 0.6f};
        RectF rectF4 = new RectF();
        Paint paint4 = new Paint();
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
        final int[] iArr2 = {ByteOrderedDataOutputStream.onNavigationEvent(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IPostMessageService_Parcel()), 0, 0, ByteOrderedDataOutputStream.onNavigationEvent(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IPostMessageService_Parcel())};
        float[] fArr4 = {0.0f, 0.4f, 0.6f, 1.0f};
        RectF rectF5 = new RectF();
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized2 = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized2;
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(ExtensionsManager1.onNavigationEvent(ExtensionsManager1.Companion.onNavigationEvent()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
            objOnMinimized3 = getsupportedhighspeedresolutionsforOnWarmupCompleted;
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
            int i10 = onNavigationEvent + 1;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 == 0) {
                objOnMinimized4 = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(1.0f);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                f = 0.0f;
            } else {
                f = 0.0f;
                objOnMinimized4 = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
            }
        } else {
            f = 0.0f;
        }
        final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2 = (getSupportedHighSpeedResolutions) objOnMinimized4;
        getThumbPosition getthumbpositionOnExtraCallback = onQueryRefine.onExtraCallback(2200, (int) j2, getCallToActionButton.onExtraCallback.IAuthTabCallback(0.7f, f, 0.7f, 1.0f));
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
        boolean z = (((i2 & 896) ^ 384) > 256 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i4)) || (i2 & 384) == 256;
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getthumbpositionOnExtraCallback);
        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (((zOnExtraCallback | z) || zOnNavigationEvent) || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
            paint = paint4;
            rectF = rectF4;
            rectF2 = rectF5;
            fArr = fArr4;
            fArr2 = fArr3;
            th = null;
            onNavigationEvent onnavigationevent = new onNavigationEvent(findresandmsg, i4, getthumbpositionOnExtraCallback, getsupportedhighspeedresolutions2, getsupportedhighspeedresolutions, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(onnavigationevent);
            objOnMinimized5 = onnavigationevent;
        } else {
            paint = paint4;
            fArr = fArr4;
            rectF = rectF4;
            rectF2 = rectF5;
            fArr2 = fArr3;
            th = null;
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(obj2, (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult, (i2 >> 3) & 14);
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = setExtensionStrength.onExtraCallback(attachTimestamp.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (toMetersPerSecond) null, false, (RenderEffect) null, 0L, 0L, 0, 0, (seek) null, 524287, (Object) null));
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(paint3);
        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iArr);
        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(fArr2);
        boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(paint);
        boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iArr2);
        final float[] fArr5 = fArr;
        boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(fArr5);
        boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(rectF);
        final RectF rectF6 = rectF2;
        boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(rectF6);
        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (((zOnExtraCallback2 | zOnExtraCallback3 | zOnExtraCallback4 | zOnExtraCallback5 | zOnExtraCallback6 | zOnExtraCallback7 | zOnExtraCallback8) || zOnExtraCallback9) || objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
            rectF3 = rectF;
            paint2 = paint3;
            final float[] fArr6 = fArr2;
            final Paint paint5 = paint;
            Function1 function1 = new Function1() { // from class: im.toss.tds.compose.component.extension.HighlightModifiersKt$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj3) {
                    int i11 = 2 % 2;
                    int i12 = onExtraCallback + 113;
                    onNavigationEvent = i12 % 128;
                    int i13 = i12 % 2;
                    Paint paint6 = paint3;
                    int[] iArr3 = iArr;
                    if (i13 == 0) {
                        y1ExternalSyntheticLambda9.onNavigationEvent(paint6, iArr3, fArr6, paint5, iArr2, fArr5, rectF3, rectF6, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions, (ExtensionsManager1) obj3);
                        throw null;
                    }
                    Unit unitOnNavigationEvent = y1ExternalSyntheticLambda9.onNavigationEvent(paint6, iArr3, fArr6, paint5, iArr2, fArr5, rectF3, rectF6, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions, (ExtensionsManager1) obj3);
                    int i14 = onNavigationEvent + 83;
                    onExtraCallback = i14 % 128;
                    if (i14 % 2 == 0) {
                        return unitOnNavigationEvent;
                    }
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function1);
            objOnMinimized6 = function1;
        } else {
            paint2 = paint3;
            rectF3 = rectF;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized6);
        boolean zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(rectF3);
        boolean zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(paint2);
        boolean zOnExtraCallback12 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(rectF6);
        boolean zOnExtraCallback13 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(paint);
        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnExtraCallback10 | zOnExtraCallback11 | zOnExtraCallback12 | zOnExtraCallback13)) {
            int i11 = onNavigationEvent + 99;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 == 0) {
                onwarmupcompleted.onExtraCallback();
                th.hashCode();
                throw th;
            }
            if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                final Paint paint6 = paint;
                final RectF rectF7 = rectF3;
                final Paint paint7 = paint2;
                objOnMinimized7 = new Function1() { // from class: im.toss.tds.compose.component.extension.HighlightModifiersKt$$ExternalSyntheticLambda3
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj3) {
                        int i12 = 2 % 2;
                        int i13 = onExtraCallback + 83;
                        onExtraCallbackWithResult = i13 % 128;
                        int i14 = i13 % 2;
                        Object[] objArr = {getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions2, rectF6, paint6, rectF7, paint7, (setIso) obj3};
                        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
                        Unit unit = (Unit) y1ExternalSyntheticLambda9.onExtraCallbackWithResult(229762783, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, -229762777, zzgc.onExtraCallbackWithResult());
                        int i15 = onExtraCallback + 61;
                        onExtraCallbackWithResult = i15 % 128;
                        if (i15 % 2 == 0) {
                            return unit;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport0.onExtraCallback(SessionProcessorSurface.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Function1) objOnMinimized7));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return quirksExternalSyntheticBackport0OnExtraCallback2;
    }

    static /* synthetic */ Exif1 onExtraCallback(Exif1 exif1, float f, float f2, int[] iArr, float[] fArr, float f3, float f4, int i, Object obj) {
        float f5;
        float f6;
        int i2 = 2 % 2;
        if ((i & 16) != 0) {
            int i3 = onNavigationEvent + 117;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            f5 = 0.0f;
        } else {
            f5 = f3;
        }
        if ((i & 32) != 0) {
            int i5 = onWarmupCompleted + 95;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            f6 = 0.0f;
        } else {
            f6 = f4;
        }
        Exif1 exif1OnExtraCallbackWithResult = onExtraCallbackWithResult(exif1, f, f2, iArr, fArr, f5, f6);
        int i7 = onWarmupCompleted + 97;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 80 / 0;
        }
        return exif1OnExtraCallbackWithResult;
    }

    private static final Exif1 onExtraCallbackWithResult(Exif1 exif1, float f, float f2, int[] iArr, float[] fArr, float f3, float f4) {
        int i = 2 % 2;
        float fMin = Float.min(f, f2);
        if (fMin <= 0.0f) {
            int i2 = onNavigationEvent + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return exif1;
        }
        float f5 = fMin / 2.0f;
        exif1.onNavigationEvent(new RadialGradient(f3 + f5, f4 + f5, f5, iArr, fArr, Shader.TileMode.CLAMP));
        int i4 = onNavigationEvent + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return exif1;
    }

    public static /* synthetic */ Exif1 onWarmupCompleted(Exif1 exif1, float f, float f2, double d, int[] iArr, float[] fArr, float f3, float f4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 75;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if ((i & 32) != 0) {
            f3 = 0.0f;
        }
        if ((i & 64) != 0) {
            int i6 = i4 + 91;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            f4 = 0.0f;
        }
        Exif1 exif12 = (Exif1) onExtraCallbackWithResult(751709486, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{exif1, Float.valueOf(f), Float.valueOf(f2), Double.valueOf(d), iArr, fArr, Float.valueOf(f3), Float.valueOf(f4)}, -751709486, zzgc.onExtraCallbackWithResult());
        int i8 = onNavigationEvent + 39;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            return exif12;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Exif1 exif1 = (Exif1) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        float fFloatValue2 = ((Number) objArr[2]).floatValue();
        double dDoubleValue = ((Number) objArr[3]).doubleValue();
        int[] iArr = (int[]) objArr[4];
        float[] fArr = (float[]) objArr[5];
        float fFloatValue3 = ((Number) objArr[6]).floatValue();
        float fFloatValue4 = ((Number) objArr[7]).floatValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(exif1, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(fArr, "");
        double radians = Math.toRadians(dDoubleValue);
        double dSin = Math.sin(radians);
        double dCos = Math.cos(radians);
        double d = fFloatValue / 2.0f;
        double d2 = fFloatValue2 / 2.0f;
        exif1.onNavigationEvent(new LinearGradient(fFloatValue3 + ((float) ((dSin + 1.0d) * d)), fFloatValue4 + ((float) (d2 * (1.0d - dCos))), fFloatValue3 + ((float) (d * (1.0d - dSin))), fFloatValue4 + ((float) (d2 * (dCos + 1.0d))), iArr, fArr, Shader.TileMode.CLAMP));
        int i2 = onWarmupCompleted + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return exif1;
    }

    public static /* synthetic */ Paint onNavigationEvent(Paint paint, float f, float f2, double d, int[] iArr, float[] fArr, float f3, float f4, int i, Object obj) {
        float f5;
        int i2 = 2 % 2;
        float f6 = (i & 32) != 0 ? 0.0f : f3;
        if ((i & 64) != 0) {
            int i3 = onNavigationEvent + 107;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 83;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            f5 = 0.0f;
        } else {
            f5 = f4;
        }
        return onWarmupCompleted(paint, f, f2, d, iArr, fArr, f6, f5);
    }

    public static final Paint onWarmupCompleted(@NotNull Paint paint, float f, float f2, double d, @NotNull int[] iArr, @NotNull float[] fArr, float f3, float f4) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(paint, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(fArr, "");
        double radians = Math.toRadians(d);
        double dSin = Math.sin(radians);
        double dCos = Math.cos(radians);
        double d2 = f / 2.0f;
        double d3 = f2 / 2.0f;
        paint.setShader(new LinearGradient(f3 + ((float) ((dSin + 1.0d) * d2)), f4 + ((float) (d3 * (1.0d - dCos))), f3 + ((float) (d2 * (1.0d - dSin))), f4 + ((float) (d3 * (dCos + 1.0d))), iArr, fArr, Shader.TileMode.CLAMP));
        int i2 = onNavigationEvent + 111;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return paint;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(RectF rectF, Exif1 exif1, RectF rectF2, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Exif1 exif12, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions3, setIso setiso) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        setiso.onWarmupCompleted();
        readShort readshortOnNavigationEvent = setiso.onExtraCallback().onNavigationEvent();
        setFlashState setflashstateOnExtraCallback = setiso.onExtraCallback();
        long jOnExtraCallback = setflashstateOnExtraCallback.onExtraCallback();
        setflashstateOnExtraCallback.onNavigationEvent().onNavigationEvent();
        try {
            ExifDataBuilder1 exifDataBuilder1OnTransact = setflashstateOnExtraCallback.onTransact();
            float fWidth = (rectF2.width() * (1.0f - onWarmupCompleted(getsupportedhighspeedresolutions))) / 2.0f;
            exifDataBuilder1OnTransact.onWarmupCompleted(fWidth, (-((rectF2.width() - ((int) onExtraCallback((getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor))) / 2.0f)) + fWidth);
            ExifDataBuilder1.onExtraCallbackWithResult(exifDataBuilder1OnTransact, onWarmupCompleted(getsupportedhighspeedresolutions), onWarmupCompleted(getsupportedhighspeedresolutions), 0L, 4, (Object) null);
            Rect rect = new Rect(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
            exif12.onExtraCallbackWithResult(getsupportedhighspeedresolutions2.onNavigationEvent());
            Unit unit = Unit.INSTANCE;
            readshortOnNavigationEvent.onExtraCallbackWithResult(rect, exif12);
            setflashstateOnExtraCallback.onNavigationEvent().IAuthTabCallback();
            setflashstateOnExtraCallback.onExtraCallbackWithResult(jOnExtraCallback);
            Rect rect2 = new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
            exif1.onExtraCallbackWithResult(onExtraCallbackWithResult(getsupportedhighspeedresolutions3));
            readshortOnNavigationEvent.onExtraCallbackWithResult(rect2, exif1);
            int i2 = onWarmupCompleted + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return unit;
        } catch (Throwable th) {
            setflashstateOnExtraCallback.onNavigationEvent().IAuthTabCallback();
            setflashstateOnExtraCallback.onExtraCallbackWithResult(jOnExtraCallback);
            throw th;
        }
    }

    private static final long onExtraCallback(getSupportedHighSpeedResolutionsFor<ExtensionsManager1> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ExtensionsManager1 extensionsManager1 = (ExtensionsManager1) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            return extensionsManager1.onExtraCallbackWithResult();
        }
        long jOnExtraCallbackWithResult = extensionsManager1.onExtraCallbackWithResult();
        int i4 = 71 / 0;
        return jOnExtraCallbackWithResult;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<ExtensionsManager1> getsupportedhighspeedresolutionsfor, long j) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(ExtensionsManager1.onNavigationEvent(j));
        int i4 = onNavigationEvent + 73;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final float onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        int i5 = onWarmupCompleted + 125;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return fOnNavigationEvent;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(fFloatValue);
        int i4 = onNavigationEvent + 59;
        onWarmupCompleted = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final float onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        int i4 = onWarmupCompleted + 83;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return fOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        int i4 = onNavigationEvent + 13;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final float onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        return fOnNavigationEvent;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(fFloatValue);
        int i4 = onWarmupCompleted + 37;
        onNavigationEvent = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final float asInterface(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        int i4 = onNavigationEvent + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return fOnNavigationEvent;
        }
        throw null;
    }

    private static final void asBinder(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        int i4 = onWarmupCompleted + 25;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final long onNavigationEvent(getSupportedHighSpeedResolutionsFor<ExtensionsManager1> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        long jOnExtraCallbackWithResult = ((ExtensionsManager1) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 35;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return jOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<ExtensionsManager1> getsupportedhighspeedresolutionsfor, long j) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(ExtensionsManager1.onNavigationEvent(j));
        int i4 = onWarmupCompleted + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, RectF rectF, Paint paint, RectF rectF2, Paint paint2, setIso setiso) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        setiso.onWarmupCompleted();
        float fOnWarmupCompleted = (int) (onWarmupCompleted((getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor) >> 32);
        float fOnWarmupCompleted2 = (int) onWarmupCompleted((getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor);
        readShort readshortOnNavigationEvent = setiso.onExtraCallback().onNavigationEvent();
        readshortOnNavigationEvent.onNavigationEvent(getsupportedhighspeedresolutions.onNavigationEvent(), 0.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (onWarmupCompleted((getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor) >> 32), (int) onWarmupCompleted((getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int iSave = canvas.save();
        try {
            canvas.translate((fOnWarmupCompleted - fOnWarmupCompleted) / 2.0f, -((fOnWarmupCompleted - fOnWarmupCompleted2) / 2.0f));
            canvas.drawRect(rectF2, paint2);
            canvas.restoreToCount(iSave);
            canvas.drawRect(rectF, paint);
            ExecutedBy.onExtraCallback(readshortOnNavigationEvent).drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
            Unit unit = Unit.INSTANCE;
            int i2 = onWarmupCompleted + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return unit;
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    private static final float IAuthTabCallbackDefault(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        int i4 = onNavigationEvent + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    private static final void IAuthTabCallbackStub(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        int i4 = onNavigationEvent + 53;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final long onWarmupCompleted(getSupportedHighSpeedResolutionsFor<ExtensionsManager1> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ExtensionsManager1 extensionsManager1 = (ExtensionsManager1) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            return extensionsManager1.onExtraCallbackWithResult();
        }
        extensionsManager1.onExtraCallbackWithResult();
        throw null;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<ExtensionsManager1> getsupportedhighspeedresolutionsfor, long j) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(ExtensionsManager1.onNavigationEvent(j));
        int i4 = onWarmupCompleted + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int[] onNavigationEvent(long j) {
        Object[] objArr = {Long.valueOf(j)};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (int[]) onExtraCallbackWithResult(-526271324, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, 526271329, zzgc.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, RectF rectF, Paint paint, RectF rectF2, Paint paint2, setIso setiso) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions, rectF, paint, rectF2, paint2, setiso};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(229762783, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, -229762777, zzgc.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit IAuthTabCallback(Exif1 exif1, int[] iArr, float[] fArr, Exif1 exif12, int[] iArr2, float[] fArr2, RectF rectF, RectF rectF2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, ExtensionsManager1 extensionsManager1) {
        Object[] objArr = {exif1, iArr, fArr, exif12, iArr2, fArr2, rectF, rectF2, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions, extensionsManager1};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(1697741497, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, -1697741494, zzgc.onExtraCallbackWithResult());
    }

    public static final Exif1 onWarmupCompleted(@NotNull Exif1 exif1, float f, float f2, double d, @NotNull int[] iArr, @NotNull float[] fArr, float f3, float f4) {
        Object[] objArr = {exif1, Float.valueOf(f), Float.valueOf(f2), Double.valueOf(d), iArr, fArr, Float.valueOf(f3), Float.valueOf(f4)};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (Exif1) onExtraCallbackWithResult(751709486, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, -751709486, zzgc.onExtraCallbackWithResult());
    }

    private static final int[] onExtraCallbackWithResult(long j) {
        Object[] objArr = {Long.valueOf(j)};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (int[]) onExtraCallbackWithResult(341850354, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, -341850350, zzgc.onExtraCallbackWithResult());
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        Object[] objArr = {getsupportedhighspeedresolutions, Float.valueOf(f)};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        onExtraCallbackWithResult(-818035043, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, 818035050, zzgc.onExtraCallbackWithResult());
    }

    private static final void onTransact(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        Object[] objArr = {getsupportedhighspeedresolutions, Float.valueOf(f)};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        onExtraCallbackWithResult(1442188638, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, -1442188630, zzgc.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallbackWithResult(Paint paint, int[] iArr, float[] fArr, Paint paint2, int[] iArr2, float[] fArr2, RectF rectF, RectF rectF2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, ExtensionsManager1 extensionsManager1) {
        Object[] objArr = {paint, iArr, fArr, paint2, iArr2, fArr2, rectF, rectF2, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutions, extensionsManager1};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(-809273453, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, 809273454, zzgc.onExtraCallbackWithResult());
    }

    private static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Object obj, int i, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, obj, Integer.valueOf(i), Long.valueOf(j), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (QuirksExternalSyntheticBackport0) onExtraCallbackWithResult(369647232, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, -369647230, zzgc.onExtraCallbackWithResult());
    }
}
