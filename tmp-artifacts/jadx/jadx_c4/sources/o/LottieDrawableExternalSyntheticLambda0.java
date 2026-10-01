package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.usshome.UssHomeItemAdapter$;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.LottieCompositionFactoryExternalSyntheticLambda12;
import o.LottieCompositionFactoryExternalSyntheticLambda7;
import o.LottieDrawableExternalSyntheticLambda0;
import o.LottieDrawableExternalSyntheticLambda1;
import o.QuirksExternalSyntheticBackport0;
import o.flipHorizontally;
import o.isQueryRefinementEnabled;
import o.onItemClicked;
import o.toPreviewOnlyRange;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LottieDrawableExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback;
    private static int onNavigationEvent;
    private static final Function2<LottieCompositionFactoryExternalSyntheticLambda7, Integer, onItemClicked<Float>> onExtraCallbackWithResult = new Function2() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayPresetsKt$$ExternalSyntheticLambda2
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i2 % 128;
            LottieCompositionFactoryExternalSyntheticLambda7 lottieCompositionFactoryExternalSyntheticLambda7 = (LottieCompositionFactoryExternalSyntheticLambda7) obj;
            Integer num = (Integer) obj2;
            if (i2 % 2 == 0) {
                return LottieDrawableExternalSyntheticLambda0.onExtraCallback(lottieCompositionFactoryExternalSyntheticLambda7, num.intValue());
            }
            onItemClicked onitemclickedOnExtraCallback = LottieDrawableExternalSyntheticLambda0.onExtraCallback(lottieCompositionFactoryExternalSyntheticLambda7, num.intValue());
            int i3 = 60 / 0;
            return onitemclickedOnExtraCallback;
        }
    };
    private static final Function2<LottieCompositionFactoryExternalSyntheticLambda7, Integer, onItemClicked<Float>> onWarmupCompleted = new Function2() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayPresetsKt$$ExternalSyntheticLambda3
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onItemClicked onitemclickedIAuthTabCallback = LottieDrawableExternalSyntheticLambda0.IAuthTabCallback((LottieCompositionFactoryExternalSyntheticLambda7) obj, ((Integer) obj2).intValue());
            int i4 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onitemclickedIAuthTabCallback;
        }
    };

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objArr[0];
        isQueryRefinementEnabled isqueryrefinementenabled2 = (isQueryRefinementEnabled) objArr[1];
        isQueryRefinementEnabled isqueryrefinementenabled3 = (isQueryRefinementEnabled) objArr[2];
        flipHorizontally fliphorizontally = (flipHorizontally) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(isqueryrefinementenabled, isqueryrefinementenabled2, isqueryrefinementenabled3, fliphorizontally);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(isqueryrefinementenabled, isqueryrefinementenabled2, isqueryrefinementenabled3, fliphorizontally);
        int i3 = IAuthTabCallback + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ onItemClicked IAuthTabCallback(LottieCompositionFactoryExternalSyntheticLambda7 lottieCompositionFactoryExternalSyntheticLambda7, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 89;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            onWarmupCompleted(lottieCompositionFactoryExternalSyntheticLambda7, i);
            obj.hashCode();
            throw null;
        }
        onItemClicked onitemclickedOnWarmupCompleted = onWarmupCompleted(lottieCompositionFactoryExternalSyntheticLambda7, i);
        int i4 = onExtraCallback + 43;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return onitemclickedOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1 = (LottieDrawableExternalSyntheticLambda1) objArr[0];
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12 = (LottieCompositionFactoryExternalSyntheticLambda12) objArr[1];
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda122 = (LottieCompositionFactoryExternalSyntheticLambda12) objArr[2];
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda123 = (LottieCompositionFactoryExternalSyntheticLambda12) objArr[3];
        Function2 function2 = (Function2) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        IAuthTabCallback = i2 % 128;
        onExtraCallbackWithResult(lottieDrawableExternalSyntheticLambda1, lottieCompositionFactoryExternalSyntheticLambda12, lottieCompositionFactoryExternalSyntheticLambda122, lottieCompositionFactoryExternalSyntheticLambda123, function2, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 75;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ onItemClicked onExtraCallback(LottieCompositionFactoryExternalSyntheticLambda7 lottieCompositionFactoryExternalSyntheticLambda7, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        onItemClicked onitemclickedOnExtraCallbackWithResult = onExtraCallbackWithResult(lottieCompositionFactoryExternalSyntheticLambda7, i);
        int i5 = IAuthTabCallback + 19;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return onitemclickedOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~((~i4) | i5);
        int i11 = i9 | i10 | (~(i5 | i));
        int i12 = (~(i | i4)) | (~(i7 | i4));
        int i13 = i8 | i10;
        int i14 = i4 + i5 + i6 + (793188503 * i3) + (2090109681 * i2);
        int i15 = i14 * i14;
        int i16 = (837707615 * i4) + 1286602752 + ((-1676358574) * i5) + (i11 * (-838022063)) + (1676044126 * i12) + ((-838022063) * i13) + ((-838336512) * i6) + (1186463744 * i3) + (1166540800 * i2) + ((-1956446208) * i15);
        int i17 = ((i4 * 1389925299) - 652765764) + (i5 * 1389927018) + (i11 * 573) + (i12 * (-1146)) + (i13 * 573) + (i6 * 1389926445) + (i3 * (-1551828341)) + (i2 * (-2047638435)) + (i15 * 1214709760);
        int i18 = i16 + (i17 * i17 * 445972480);
        return i18 != 1 ? i18 != 2 ? onExtraCallback(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(getsupportedhighspeedresolutionsfor, z);
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1 = (LottieDrawableExternalSyntheticLambda1) objArr[0];
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12 = (LottieCompositionFactoryExternalSyntheticLambda12) objArr[1];
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda122 = (LottieCompositionFactoryExternalSyntheticLambda12) objArr[2];
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda123 = (LottieCompositionFactoryExternalSyntheticLambda12) objArr[3];
        Function2 function2 = (Function2) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue3 = ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {lottieDrawableExternalSyntheticLambda1, lottieCompositionFactoryExternalSyntheticLambda12, lottieCompositionFactoryExternalSyntheticLambda122, lottieCompositionFactoryExternalSyntheticLambda123, function2, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue3)};
        Unit unit = (Unit) onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr2, -1139647078, 1139647078, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
        int i4 = IAuthTabCallback + 69;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return unit;
    }

    public static final /* synthetic */ void onWarmupCompleted(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda122, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda123, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(lottieDrawableExternalSyntheticLambda1, lottieCompositionFactoryExternalSyntheticLambda12, lottieCompositionFactoryExternalSyntheticLambda122, lottieCompositionFactoryExternalSyntheticLambda123, function2, cameraCaptureResultEmptyCameraCaptureResult, i, i2);
        int i6 = onExtraCallback + 49;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 24 / 0;
        }
    }

    public static final Function2<LottieCompositionFactoryExternalSyntheticLambda7, Integer, onItemClicked<Float>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Function2<LottieCompositionFactoryExternalSyntheticLambda7, Integer, onItemClicked<Float>> function2 = onExtraCallbackWithResult;
        int i5 = i3 + 103;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    static {
        int i = IAuthTabCallbackStub + 33;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 28 / 0;
        }
    }

    private static final onItemClicked onExtraCallbackWithResult(LottieCompositionFactoryExternalSyntheticLambda7 lottieCompositionFactoryExternalSyntheticLambda7, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(lottieCompositionFactoryExternalSyntheticLambda7, "");
        if (!Intrinsics.areEqual(lottieCompositionFactoryExternalSyntheticLambda7, LottieCompositionFactoryExternalSyntheticLambda7.onWarmupCompleted.onExtraCallback)) {
            return getSplitTrack.onExtraCallbackWithResult(getIconContentView.onWarmupCompleted.IAuthTabCallback(), i);
        }
        int i3 = onExtraCallback + 121;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        getThumbPosition getthumbpositionOnExtraCallback = onQueryRefine.onExtraCallback(1000, i, getCallToActionButton.onExtraCallback.onTransact());
        int i5 = IAuthTabCallback + 61;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return getthumbpositionOnExtraCallback;
    }

    public static final Function2<LottieCompositionFactoryExternalSyntheticLambda7, Integer, onItemClicked<Float>> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 71;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Function2<LottieCompositionFactoryExternalSyntheticLambda7, Integer, onItemClicked<Float>> function2 = onWarmupCompleted;
        int i5 = i2 + 17;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return function2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final onItemClicked onWarmupCompleted(LottieCompositionFactoryExternalSyntheticLambda7 lottieCompositionFactoryExternalSyntheticLambda7, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(lottieCompositionFactoryExternalSyntheticLambda7, "");
        if (Intrinsics.areEqual(lottieCompositionFactoryExternalSyntheticLambda7, LottieCompositionFactoryExternalSyntheticLambda7.onWarmupCompleted.onExtraCallback)) {
            return onQueryRefine.onExtraCallback(1000, i, new getStarRatingContentViewGroup(100.0d, 11.0d));
        }
        getThumbPosition getthumbpositionOnExtraCallbackWithResult = getSplitTrack.onExtraCallbackWithResult(getIconContentView.onWarmupCompleted.onExtraCallback(), i);
        int i5 = IAuthTabCallback + 13;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return getthumbpositionOnExtraCallbackWithResult;
    }

    private static final Unit onWarmupCompleted(isQueryRefinementEnabled isqueryrefinementenabled, isQueryRefinementEnabled isqueryrefinementenabled2, isQueryRefinementEnabled isqueryrefinementenabled3, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallbackStub(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue());
        fliphorizontally.IAuthTabCallbackStubProxy(((Number) isqueryrefinementenabled2.IAuthTabCallback()).floatValue());
        fliphorizontally.getInterfaceDescriptor(((Number) isqueryrefinementenabled2.IAuthTabCallback()).floatValue());
        fliphorizontally.access000(((Number) isqueryrefinementenabled3.IAuthTabCallback()).floatValue());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 105;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return unit;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $opacity;
        final /* synthetic */ LottieCompositionFactoryExternalSyntheticLambda12 $opacityAnimState;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$opacityAnimState = lottieCompositionFactoryExternalSyntheticLambda12;
            this.$opacity = isqueryrefinementenabled;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$opacityAnimState, this.$opacity, access13800Var);
            onwarmupcompleted.L$0 = obj;
            int i2 = onExtraCallback + 19;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 39;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 99;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 73;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 45;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            Object obj2 = null;
            ResultKt.onNavigationEvent(obj);
            if (i6 != 0) {
                obj2.hashCode();
                throw null;
            }
            LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12 = this.$opacityAnimState;
            if (lottieCompositionFactoryExternalSyntheticLambda12 != null) {
                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(this.$opacity, lottieCompositionFactoryExternalSyntheticLambda12, null), 3, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
            int i7 = onWarmupCompleted + 97;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 11 / 0;
            }
            return unit;
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ LottieCompositionFactoryExternalSyntheticLambda12 $it;
            final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $opacity;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallbackWithResult(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
                this.$opacity = isqueryrefinementenabled;
                this.$it = lottieCompositionFactoryExternalSyntheticLambda12;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$opacity, this.$it, access13800Var);
                int i2 = onExtraCallbackWithResult + 67;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return onextracallbackwithresult;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 15;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallbackWithResult + 7;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return objOnWarmupCompleted;
                }
                throw null;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 91;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    return onextracallbackwithresultCreate.invokeSuspend(unit);
                }
                onextracallbackwithresultCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[PHI: r1
              0x0039: PHI (r1v6 java.lang.Object) = (r1v4 java.lang.Object), (r1v7 java.lang.Object) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r3
              0x0022: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objOnWarmupCompleted;
                int i;
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 27;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    objOnWarmupCompleted = access14300.onWarmupCompleted();
                    i = this.label;
                    int i4 = 2 / 0;
                    if (i == 0) {
                        ResultKt.onNavigationEvent(obj);
                        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$opacity;
                        Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(this.$it.onNavigationEvent());
                        onItemClicked<Float> onitemclickedOnExtraCallbackWithResult = this.$it.onExtraCallbackWithResult();
                        this.label = 1;
                        if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, onitemclickedOnExtraCallbackWithResult, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                        int i5 = onNavigationEvent + 5;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                    }
                } else {
                    objOnWarmupCompleted = access14300.onWarmupCompleted();
                    i = this.label;
                    if (i != 0) {
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $scale;
        final /* synthetic */ LottieCompositionFactoryExternalSyntheticLambda12 $scaleAnimState;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$scaleAnimState = lottieCompositionFactoryExternalSyntheticLambda12;
            this.$scale = isqueryrefinementenabled;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$scaleAnimState, this.$scale, access13800Var);
            onnavigationevent.L$0 = obj;
            int i2 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return onnavigationeventCreate.invokeSuspend(unit);
            }
            onnavigationeventCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i3 != 0) {
                throw null;
            }
            LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12 = this.$scaleAnimState;
            if (lottieCompositionFactoryExternalSyntheticLambda12 != null) {
                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(this.$scale, lottieCompositionFactoryExternalSyntheticLambda12, null), 3, (Object) null);
                int i4 = IAuthTabCallback + 19;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
            return Unit.INSTANCE;
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ LottieCompositionFactoryExternalSyntheticLambda12 $it;
            final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $scale;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallbackWithResult(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
                this.$scale = isqueryrefinementenabled;
                this.$it = lottieCompositionFactoryExternalSyntheticLambda12;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$scale, this.$it, access13800Var);
                int i2 = onWarmupCompleted + 57;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return onextracallbackwithresult;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 105;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallbackWithResult + 47;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 67;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                if (i3 != 0) {
                    int i4 = 76 / 0;
                }
                int i5 = onWarmupCompleted + 121;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$scale;
                    Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(this.$it.onNavigationEvent());
                    onItemClicked<Float> onitemclickedOnExtraCallbackWithResult = this.$it.onExtraCallbackWithResult();
                    this.label = 1;
                    if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, onitemclickedOnExtraCallbackWithResult, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                        int i3 = onWarmupCompleted;
                        int i4 = i3 + 3;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                        int i6 = i3 + 49;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $translationY;
        final /* synthetic */ LottieCompositionFactoryExternalSyntheticLambda12 $translationYAnimState;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$translationYAnimState = lottieCompositionFactoryExternalSyntheticLambda12;
            this.$translationY = isqueryrefinementenabled;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onextracallbackCreate.invokeSuspend(unit);
            }
            onextracallbackCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$translationYAnimState, this.$translationY, access13800Var);
            onextracallback.L$0 = obj;
            int i2 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12 = this.$translationYAnimState;
            if (lottieCompositionFactoryExternalSyntheticLambda12 != null) {
                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(this.$translationY, lottieCompositionFactoryExternalSyntheticLambda12, null), 3, (Object) null);
                int i4 = IAuthTabCallback + 29;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
            return Unit.INSTANCE;
        }

        static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ LottieCompositionFactoryExternalSyntheticLambda12 $it;
            final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $translationY;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onWarmupCompleted(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12, access13800<? super onWarmupCompleted> access13800Var) {
                super(2, access13800Var);
                this.$translationY = isqueryrefinementenabled;
                this.$it = lottieCompositionFactoryExternalSyntheticLambda12;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$translationY, this.$it, access13800Var);
                int i2 = onWarmupCompleted + 81;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return onwarmupcompleted;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 73;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
                if (i3 != 0) {
                    int i4 = 85 / 0;
                }
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 105;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallbackWithResult + 67;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 41;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$translationY;
                    Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(this.$it.onNavigationEvent());
                    onItemClicked<Float> onitemclickedOnExtraCallbackWithResult = this.$it.onExtraCallbackWithResult();
                    this.label = 1;
                    if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, onitemclickedOnExtraCallbackWithResult, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                        int i5 = onExtraCallbackWithResult + 47;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = onExtraCallbackWithResult + 9;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    ResultKt.onNavigationEvent(obj);
                    int i9 = onExtraCallbackWithResult + 9;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                }
                return Unit.INSTANCE;
            }
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ LottieDrawableExternalSyntheticLambda1 $overlayState;
        final /* synthetic */ boolean $visible;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $visibleState$delegate;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(boolean z, LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$visible = z;
            this.$overlayState = lottieDrawableExternalSyntheticLambda1;
            this.$visibleState$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$visible, this.$overlayState, this.$visibleState$delegate, access13800Var);
            onextracallbackwithresult.L$0 = obj;
            int i2 = IAuthTabCallback + 33;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return onextracallbackwithresultCreate.invokeSuspend(unit);
            }
            onextracallbackwithresultCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 79;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 81;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (this.$visible) {
                LottieDrawableExternalSyntheticLambda0.onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor) this.$visibleState$delegate, true);
            } else {
                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass2(this.$overlayState, this.$visibleState$delegate, null), 3, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
            int i7 = IAuthTabCallback + 87;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }

        /* renamed from: o.LottieDrawableExternalSyntheticLambda0$onExtraCallbackWithResult$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ LottieDrawableExternalSyntheticLambda1 $overlayState;
            final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $visibleState$delegate;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
                this.$overlayState = lottieDrawableExternalSyntheticLambda1;
                this.$visibleState$delegate = getsupportedhighspeedresolutionsfor;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 57;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallback + 73;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$overlayState, this.$visibleState$delegate, access13800Var);
                int i2 = onExtraCallbackWithResult + 47;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass2;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 33;
                onExtraCallback = i2 % 128;
                Object obj3 = null;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    IAuthTabCallback(findresandmsg, access13800Var);
                    obj3.hashCode();
                    throw null;
                }
                Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                int i3 = onExtraCallback + 31;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    return objIAuthTabCallback;
                }
                obj3.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[PHI: r1
              0x0044: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r4
              0x0024: PHI (r4v1 int) = (r4v0 int), (r4v3 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objOnWarmupCompleted;
                int i;
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 41;
                onExtraCallback = i3 % 128;
                try {
                    if (i3 % 2 == 0) {
                        objOnWarmupCompleted = access14300.onWarmupCompleted();
                        i = this.label;
                        int i4 = 21 / 0;
                        if (i == 0) {
                            ResultKt.onNavigationEvent(obj);
                            long jOnExtraCallback = this.$overlayState.onExtraCallback();
                            this.label = 1;
                            if (formatMsgs.onWarmupCompleted(jOnExtraCallback, this) == objOnWarmupCompleted) {
                                int i5 = onExtraCallback + 95;
                                onExtraCallbackWithResult = i5 % 128;
                                if (i5 % 2 != 0) {
                                    int i6 = 91 / 0;
                                }
                                return objOnWarmupCompleted;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i7 = onExtraCallback + 65;
                            onExtraCallbackWithResult = i7 % 128;
                            if (i7 % 2 != 0) {
                                ResultKt.onNavigationEvent(obj);
                                int i8 = 90 / 0;
                            } else {
                                ResultKt.onNavigationEvent(obj);
                            }
                        }
                    } else {
                        objOnWarmupCompleted = access14300.onWarmupCompleted();
                        i = this.label;
                        if (i != 0) {
                        }
                    }
                    LottieDrawableExternalSyntheticLambda0.onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor) this.$visibleState$delegate, false);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    LottieDrawableExternalSyntheticLambda0.onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor) this.$visibleState$delegate, false);
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(final LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda122, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda123, final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda124;
        int i4;
        int i5;
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda125;
        int i6;
        int i7;
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda126;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z;
        boolean z2;
        int i8;
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda127;
        Object obj;
        float f;
        float fIAuthTabCallback;
        final isQueryRefinementEnabled isqueryrefinementenabled;
        boolean zOnExtraCallback;
        boolean zOnExtraCallback2;
        boolean zOnExtraCallback3;
        Object objOnMinimized;
        isQueryRefinementEnabled isqueryrefinementenabled2;
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda128;
        boolean z3;
        boolean zOnExtraCallback4;
        Object objOnMinimized2;
        isQueryRefinementEnabled isqueryrefinementenabled3;
        boolean z4;
        boolean zOnExtraCallback5;
        Object objOnMinimized3;
        isQueryRefinementEnabled isqueryrefinementenabled4;
        boolean z5;
        boolean zOnExtraCallback6;
        Object objOnMinimized4;
        boolean z6;
        boolean zOnExtraCallback7;
        boolean z7;
        Object objOnMinimized5;
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda129 = lottieCompositionFactoryExternalSyntheticLambda123;
        int i9 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-2103978673);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieDrawableExternalSyntheticLambda1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            int i11 = IAuthTabCallback + 115;
            onExtraCallback = i11 % 128;
            i3 = i11 % 2 != 0 ? i3 | 40 : i3 | 48;
        } else {
            if ((i & 48) == 0) {
                lottieCompositionFactoryExternalSyntheticLambda124 = lottieCompositionFactoryExternalSyntheticLambda12;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda124)) {
                    int i12 = IAuthTabCallback + 55;
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            i5 = i2 & 4;
            if (i5 != 0) {
                if ((i & 384) == 0) {
                    int i14 = IAuthTabCallback + 15;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    lottieCompositionFactoryExternalSyntheticLambda125 = lottieCompositionFactoryExternalSyntheticLambda122;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda125) ? 256 : 128;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    int i16 = onExtraCallback + 71;
                    IAuthTabCallback = i16 % 128;
                    if (i16 % 2 == 0) {
                        int i17 = 59 / 0;
                        i7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda129) ? 2048 : 1024;
                    } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda129)) {
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 16384 : 8192;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) != 9362, i3 & 1)) {
                    int i18 = IAuthTabCallback + 41;
                    int i19 = i18 % 128;
                    onExtraCallback = i19;
                    int i20 = i18 % 2;
                    if (i10 != 0) {
                        lottieCompositionFactoryExternalSyntheticLambda124 = null;
                    }
                    if (i5 != 0) {
                        lottieCompositionFactoryExternalSyntheticLambda125 = null;
                    }
                    if (i6 != 0) {
                        int i21 = i19 + 25;
                        IAuthTabCallback = i21 % 128;
                        int i22 = i21 % 2;
                        lottieCompositionFactoryExternalSyntheticLambda129 = null;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2103978673, i3, -1, "im.toss.compose.widget.point.overlay.PresetContent (PointComponentOverlayPresets.kt:89)");
                    }
                    boolean zOnNavigationEvent = lottieDrawableExternalSyntheticLambda1.onNavigationEvent();
                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized6 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                    }
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized6;
                    int i23 = i3 & 112;
                    if (i23 == 32) {
                        int i24 = onExtraCallback + 83;
                        IAuthTabCallback = i24 % 128;
                        int i25 = i24 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (z || objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                        isQueryRefinementEnabled isqueryrefinementenabledOnWarmupCompleted = isIconified.onWarmupCompleted(lottieCompositionFactoryExternalSyntheticLambda124 != null ? lottieCompositionFactoryExternalSyntheticLambda124.IAuthTabCallback() : 1.0f, 0.0f, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(isqueryrefinementenabledOnWarmupCompleted);
                        objOnMinimized7 = isqueryrefinementenabledOnWarmupCompleted;
                    }
                    final isQueryRefinementEnabled isqueryrefinementenabled5 = (isQueryRefinementEnabled) objOnMinimized7;
                    int i26 = i3 & 896;
                    boolean z8 = i26 == 256;
                    Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (z8 || objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                        isQueryRefinementEnabled isqueryrefinementenabledOnWarmupCompleted2 = isIconified.onWarmupCompleted(lottieCompositionFactoryExternalSyntheticLambda125 != null ? lottieCompositionFactoryExternalSyntheticLambda125.IAuthTabCallback() : 1.0f, 0.0f, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(isqueryrefinementenabledOnWarmupCompleted2);
                        objOnMinimized8 = isqueryrefinementenabledOnWarmupCompleted2;
                    }
                    final isQueryRefinementEnabled isqueryrefinementenabled6 = (isQueryRefinementEnabled) objOnMinimized8;
                    int i27 = i3 & 7168;
                    boolean z9 = i27 == 2048;
                    Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (z9) {
                        z2 = zOnNavigationEvent;
                        i8 = 2;
                    } else {
                        int i28 = onExtraCallback + 109;
                        z2 = zOnNavigationEvent;
                        IAuthTabCallback = i28 % 128;
                        i8 = 2;
                        int i29 = i28 % 2;
                        if (objOnMinimized9 != onwarmupcompleted.onExtraCallback()) {
                            lottieCompositionFactoryExternalSyntheticLambda127 = lottieCompositionFactoryExternalSyntheticLambda129;
                        }
                        isqueryrefinementenabled = (isQueryRefinementEnabled) objOnMinimized9;
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled5);
                        zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled6);
                        zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(zOnExtraCallback | zOnExtraCallback2 | zOnExtraCallback3) || objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized = new Function1() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayPresetsKt$$ExternalSyntheticLambda0
                                private static int IAuthTabCallback = 1;
                                private static int onExtraCallbackWithResult;

                                public final Object invoke(Object obj2) {
                                    int i30 = 2 % 2;
                                    int i31 = onExtraCallbackWithResult + 15;
                                    IAuthTabCallback = i31 % 128;
                                    int i32 = i31 % 2;
                                    isQueryRefinementEnabled isqueryrefinementenabled7 = isqueryrefinementenabled5;
                                    if (i32 != 0) {
                                        Object[] objArr = {isqueryrefinementenabled7, isqueryrefinementenabled6, isqueryrefinementenabled, (flipHorizontally) obj2};
                                        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                                        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                                        return (Unit) LottieDrawableExternalSyntheticLambda0.onExtraCallbackWithResult(iOnWarmupCompleted, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, -1657376307, 1657376308, iOnWarmupCompleted2);
                                    }
                                    Object[] objArr2 = {isqueryrefinementenabled7, isqueryrefinementenabled6, isqueryrefinementenabled, (flipHorizontally) obj2};
                                    int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                                    int iOnWarmupCompleted4 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(onextracallback, (Function1) objOnMinimized);
                        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() != null) {
                            lottieCompositionFactoryExternalSyntheticLambda128 = lottieCompositionFactoryExternalSyntheticLambda125;
                            int i30 = onExtraCallback + 107;
                            isqueryrefinementenabled2 = isqueryrefinementenabled6;
                            IAuthTabCallback = i30 % 128;
                            int i31 = i30 % 2;
                            getAwbState.onExtraCallback();
                        } else {
                            isqueryrefinementenabled2 = isqueryrefinementenabled6;
                            lottieCompositionFactoryExternalSyntheticLambda128 = lottieCompositionFactoryExternalSyntheticLambda125;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                        if (onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1912713325);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else {
                            int i32 = onExtraCallback + 45;
                            IAuthTabCallback = i32 % 128;
                            int i33 = i32 % 2;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1912681612);
                            function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i3 >> 12) & 14));
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        z3 = i23 != 32;
                        zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled5);
                        objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(z3 | zOnExtraCallback4) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized2 = new onWarmupCompleted(lottieCompositionFactoryExternalSyntheticLambda124, isqueryrefinementenabled5, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda124, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 3) & 14);
                        if (i26 != 256) {
                            z4 = true;
                            isqueryrefinementenabled3 = isqueryrefinementenabled2;
                        } else {
                            isqueryrefinementenabled3 = isqueryrefinementenabled2;
                            z4 = false;
                        }
                        zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled3);
                        objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((!z4 && !zOnExtraCallback5) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                            lottieCompositionFactoryExternalSyntheticLambda125 = lottieCompositionFactoryExternalSyntheticLambda128;
                            objOnMinimized3 = new onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda125, isqueryrefinementenabled3, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                        } else {
                            lottieCompositionFactoryExternalSyntheticLambda125 = lottieCompositionFactoryExternalSyntheticLambda128;
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda125, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 6) & 14);
                        if (i27 != 2048) {
                            z5 = true;
                            isqueryrefinementenabled4 = isqueryrefinementenabled;
                        } else {
                            isqueryrefinementenabled4 = isqueryrefinementenabled;
                            z5 = false;
                        }
                        zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled4);
                        objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((!z5 && !zOnExtraCallback6) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                            lottieCompositionFactoryExternalSyntheticLambda126 = lottieCompositionFactoryExternalSyntheticLambda127;
                            objOnMinimized4 = new onExtraCallback(lottieCompositionFactoryExternalSyntheticLambda126, isqueryrefinementenabled4, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                        } else {
                            lottieCompositionFactoryExternalSyntheticLambda126 = lottieCompositionFactoryExternalSyntheticLambda127;
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda126, (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 9) & 14);
                        z6 = z2;
                        zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z6);
                        z7 = (i3 & 14) != 4;
                        objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(zOnExtraCallback7 | z7) || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized5 = new onExtraCallbackWithResult(z6, lottieDrawableExternalSyntheticLambda1, getsupportedhighspeedresolutionsfor, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z6), (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                    if (lottieCompositionFactoryExternalSyntheticLambda129 != null) {
                        fIAuthTabCallback = lottieCompositionFactoryExternalSyntheticLambda129.IAuthTabCallback();
                        lottieCompositionFactoryExternalSyntheticLambda127 = lottieCompositionFactoryExternalSyntheticLambda129;
                        obj = null;
                        f = 0.0f;
                    } else {
                        lottieCompositionFactoryExternalSyntheticLambda127 = lottieCompositionFactoryExternalSyntheticLambda129;
                        obj = null;
                        f = 0.0f;
                        fIAuthTabCallback = 0.0f;
                    }
                    objOnMinimized9 = isIconified.onWarmupCompleted(fIAuthTabCallback, f, i8, obj);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized9);
                    isqueryrefinementenabled = (isQueryRefinementEnabled) objOnMinimized9;
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled5);
                    zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled6);
                    zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(zOnExtraCallback | zOnExtraCallback2 | zOnExtraCallback3)) {
                        objOnMinimized = new Function1() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayPresetsKt$$ExternalSyntheticLambda0
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallbackWithResult;

                            public final Object invoke(Object obj2) {
                                int i302 = 2 % 2;
                                int i312 = onExtraCallbackWithResult + 15;
                                IAuthTabCallback = i312 % 128;
                                int i322 = i312 % 2;
                                isQueryRefinementEnabled isqueryrefinementenabled7 = isqueryrefinementenabled5;
                                if (i322 != 0) {
                                    Object[] objArr = {isqueryrefinementenabled7, isqueryrefinementenabled6, isqueryrefinementenabled, (flipHorizontally) obj2};
                                    int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                                    int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                                    return (Unit) LottieDrawableExternalSyntheticLambda0.onExtraCallbackWithResult(iOnWarmupCompleted, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, -1657376307, 1657376308, iOnWarmupCompleted2);
                                }
                                Object[] objArr2 = {isqueryrefinementenabled7, isqueryrefinementenabled6, isqueryrefinementenabled, (flipHorizontally) obj2};
                                int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                                int iOnWarmupCompleted4 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = attachTimestamp.IAuthTabCallback(onextracallback2, (Function1) objOnMinimized);
                        component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                        int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback2);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() != null) {
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                        if (onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        if (i23 != 32) {
                        }
                        zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled5);
                        objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(z3 | zOnExtraCallback4)) {
                            objOnMinimized2 = new onWarmupCompleted(lottieCompositionFactoryExternalSyntheticLambda124, isqueryrefinementenabled5, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                            isZslDisabledByByUserCaseConfig.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda124, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 3) & 14);
                            if (i26 != 256) {
                            }
                            zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled3);
                            objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(z4 | zOnExtraCallback5)) {
                                lottieCompositionFactoryExternalSyntheticLambda125 = lottieCompositionFactoryExternalSyntheticLambda128;
                                objOnMinimized3 = new onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda125, isqueryrefinementenabled3, null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                isZslDisabledByByUserCaseConfig.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda125, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 6) & 14);
                                if (i27 != 2048) {
                                }
                                zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled4);
                                objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!(z5 | zOnExtraCallback6)) {
                                    lottieCompositionFactoryExternalSyntheticLambda126 = lottieCompositionFactoryExternalSyntheticLambda127;
                                    objOnMinimized4 = new onExtraCallback(lottieCompositionFactoryExternalSyntheticLambda126, isqueryrefinementenabled4, null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                                    isZslDisabledByByUserCaseConfig.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda126, (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 9) & 14);
                                    z6 = z2;
                                    zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z6);
                                    if ((i3 & 14) != 4) {
                                    }
                                    objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!(zOnExtraCallback7 | z7)) {
                                        objOnMinimized5 = new onExtraCallbackWithResult(z6, lottieDrawableExternalSyntheticLambda1, getsupportedhighspeedresolutionsfor, null);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                                        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z6), (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    lottieCompositionFactoryExternalSyntheticLambda126 = lottieCompositionFactoryExternalSyntheticLambda129;
                }
                final LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda1210 = lottieCompositionFactoryExternalSyntheticLambda124;
                final LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda1211 = lottieCompositionFactoryExternalSyntheticLambda125;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda1212 = lottieCompositionFactoryExternalSyntheticLambda126;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayPresetsKt$$ExternalSyntheticLambda1
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2, Object obj3) {
                            int i34 = 2 % 2;
                            int i35 = onWarmupCompleted + 47;
                            onNavigationEvent = i35 % 128;
                            int i36 = i35 % 2;
                            LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda12 = lottieDrawableExternalSyntheticLambda1;
                            LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda1213 = lottieCompositionFactoryExternalSyntheticLambda1210;
                            LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda1214 = lottieCompositionFactoryExternalSyntheticLambda1211;
                            LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda1215 = lottieCompositionFactoryExternalSyntheticLambda1212;
                            Function2 function22 = function2;
                            int i37 = i;
                            int i38 = i2;
                            int iIntValue = ((Integer) obj3).intValue();
                            Object[] objArr = {lottieDrawableExternalSyntheticLambda12, lottieCompositionFactoryExternalSyntheticLambda1213, lottieCompositionFactoryExternalSyntheticLambda1214, lottieCompositionFactoryExternalSyntheticLambda1215, function22, Integer.valueOf(i37), Integer.valueOf(i38), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                            int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                            int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                            Unit unit = (Unit) LottieDrawableExternalSyntheticLambda0.onExtraCallbackWithResult(iOnWarmupCompleted, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, -485843542, 485843544, iOnWarmupCompleted2);
                            int i39 = onWarmupCompleted + 75;
                            onNavigationEvent = i39 % 128;
                            int i40 = i39 % 2;
                            return unit;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            lottieCompositionFactoryExternalSyntheticLambda125 = lottieCompositionFactoryExternalSyntheticLambda122;
            i6 = i2 & 8;
            if (i6 != 0) {
            }
            if ((i & 24576) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) != 9362, i3 & 1)) {
            }
            final LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12102 = lottieCompositionFactoryExternalSyntheticLambda124;
            final LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12112 = lottieCompositionFactoryExternalSyntheticLambda125;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        lottieCompositionFactoryExternalSyntheticLambda124 = lottieCompositionFactoryExternalSyntheticLambda12;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        lottieCompositionFactoryExternalSyntheticLambda125 = lottieCompositionFactoryExternalSyntheticLambda122;
        i6 = i2 & 8;
        if (i6 != 0) {
        }
        if ((i & 24576) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) != 9362, i3 & 1)) {
        }
        final LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda121022 = lottieCompositionFactoryExternalSyntheticLambda124;
        final LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda121122 = lottieCompositionFactoryExternalSyntheticLambda125;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            return bool.booleanValue();
        }
        int i4 = 94 / 0;
        return bool.booleanValue();
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda122, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda123, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {lottieDrawableExternalSyntheticLambda1, lottieCompositionFactoryExternalSyntheticLambda12, lottieCompositionFactoryExternalSyntheticLambda122, lottieCompositionFactoryExternalSyntheticLambda123, function2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(iOnWarmupCompleted, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, -485843542, 485843544, iOnWarmupCompleted2);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(isQueryRefinementEnabled isqueryrefinementenabled, isQueryRefinementEnabled isqueryrefinementenabled2, isQueryRefinementEnabled isqueryrefinementenabled3, flipHorizontally fliphorizontally) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(iOnWarmupCompleted, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{isqueryrefinementenabled, isqueryrefinementenabled2, isqueryrefinementenabled3, fliphorizontally}, -1657376307, 1657376308, iOnWarmupCompleted2);
    }

    private static final Unit onNavigationEvent(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda122, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda123, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {lottieDrawableExternalSyntheticLambda1, lottieCompositionFactoryExternalSyntheticLambda12, lottieCompositionFactoryExternalSyntheticLambda122, lottieCompositionFactoryExternalSyntheticLambda123, function2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(iOnWarmupCompleted, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, -1139647078, 1139647078, iOnWarmupCompleted2);
    }
}
