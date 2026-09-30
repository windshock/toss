package im.toss.uikit.widget.mobileId;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Process;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.GeckoHubImp1;
import o.TimelineExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14100;
import o.access15400;
import o.findResAndMsg;
import o.generateInviteUrl;
import o.onLoadStarted;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class MobileIdCardHologramMaskView extends View {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static long asInterface = -1208582726904886380L;
    private static int onTransact = 1;
    private final String IAuthTabCallback;
    private final Paint IAuthTabCallbackDefault;
    private Bitmap asBinder;
    private float onExtraCallback;
    private Bitmap onExtraCallbackWithResult;
    private Bitmap onNavigationEvent;
    private float onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MobileIdCardHologramMaskView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileIdCardHologramMaskView(@NotNull Context context, @Nullable AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Object[] objArr = new Object[1];
        a(new char[]{1431, 41868, 541, 1535, 37728, 16888, 25433, 53312, 51076, 20814, 8610, 5631, 33060, 5792, 59276, 22276, 17118, 54359, 43619, 39268, 3192, 39399, 26846, 55966, 52766, 24473, 12066, 7225, 35759, 7547, 60672, 24991, 21845, 8925, 45985, 41973, 5851, 57469, 30286, 58709, 53401, 42503, 13544, 9983, 37435, 27579, 64140, 26644, 24542, 10586, 47402, 43581, 6517, 61179, 32735, 61396, 56082, 44166, 16928, 12605, 42166, 29223, 6, 29406, 26183, 14298, 50858}, ViewConfiguration.getEdgeSlop() >> 16, objArr);
        this.IAuthTabCallback = ((String) objArr[0]).intern();
        this.IAuthTabCallbackDefault = new Paint(1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MobileIdCardHologramMaskView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = IAuthTabCallbackStub + 51;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 99;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public static final /* synthetic */ void IAuthTabCallback(MobileIdCardHologramMaskView mobileIdCardHologramMaskView, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        mobileIdCardHologramMaskView.onExtraCallbackWithResult(bitmap, bitmap2, bitmap3);
        int i4 = onTransact + 83;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
    }

    public static final /* synthetic */ String onWarmupCompleted(MobileIdCardHologramMaskView mobileIdCardHologramMaskView) {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        String str = mobileIdCardHologramMaskView.IAuthTabCallback;
        int i5 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return str;
    }

    public static final class onExtraCallbackWithResult implements View.OnLayoutChangeListener {
        private static int asInterface = 1;
        private static int onTransact;
        final /* synthetic */ findResAndMsg IAuthTabCallback;
        final /* synthetic */ MobileIdCardHologramMaskView onExtraCallback;
        final /* synthetic */ Function0 onExtraCallbackWithResult;
        final /* synthetic */ String onNavigationEvent;
        final /* synthetic */ String onWarmupCompleted;

        public onExtraCallbackWithResult(findResAndMsg findresandmsg, MobileIdCardHologramMaskView mobileIdCardHologramMaskView, Function0 function0, String str, String str2) {
            this.IAuthTabCallback = findresandmsg;
            this.onExtraCallback = mobileIdCardHologramMaskView;
            this.onExtraCallbackWithResult = function0;
            this.onNavigationEvent = str;
            this.onWarmupCompleted = str2;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            view.removeOnLayoutChangeListener(this);
            onLoadStarted.onExtraCallback(this.IAuthTabCallback, null, null, this.onExtraCallback.new onWarmupCompleted(this.onExtraCallbackWithResult, this.onNavigationEvent, this.onWarmupCompleted, null), 3, null);
            int i10 = asInterface + 39;
            onTransact = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 61 / 0;
            }
        }
    }

    public final void onNavigationEvent(float f, float f2) {
        float fCoerceIn;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            this.onWarmupCompleted = RangesKt___RangesKt.coerceIn(f, 1.0f, 1.0f);
            fCoerceIn = RangesKt___RangesKt.coerceIn(f2, 2.0f, 0.0f);
        } else {
            this.onWarmupCompleted = RangesKt___RangesKt.coerceIn(f, 0.0f, 1.0f);
            fCoerceIn = RangesKt___RangesKt.coerceIn(f2, 0.0f, 1.0f);
        }
        this.onExtraCallback = fCoerceIn;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ String $fillImageUrl;
        final /* synthetic */ Function0<Unit> $onComplete;
        final /* synthetic */ String $strokeImageUrl;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(Function0<Unit> function0, String str, String str2, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$onComplete = function0;
            this.$fillImageUrl = str;
            this.$strokeImageUrl = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = MobileIdCardHologramMaskView.this.new onWarmupCompleted(this.$onComplete, this.$fillImageUrl, this.$strokeImageUrl, access13800Var);
            onwarmupcompleted.L$0 = obj;
            int i2 = onExtraCallback + 41;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onExtraCallback = i2 % 128;
            Object obj = null;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(findresandmsg2, access13800Var2);
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg2, access13800Var2);
            int i3 = onExtraCallback + 85;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            obj.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onWarmupCompleted) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 101;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ String $fillImageUrl;
            int label;
            final /* synthetic */ MobileIdCardHologramMaskView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallbackWithResult(MobileIdCardHologramMaskView mobileIdCardHologramMaskView, String str, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
                this.this$0 = mobileIdCardHologramMaskView;
                this.$fillImageUrl = str;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 57;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((onExtraCallbackWithResult) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 79;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.this$0, this.$fillImageUrl, access13800Var);
                int i2 = onWarmupCompleted + 75;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return onextracallbackwithresult;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 101;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                int i4 = IAuthTabCallback + 89;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objIAuthTabCallback;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onWarmupCompleted + 27;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    return obj;
                }
                ResultKt.onNavigationEvent(obj);
                MobileIdCardHologramMaskView mobileIdCardHologramMaskView = this.this$0;
                String str = this.$fillImageUrl;
                Integer numOnNavigationEvent = access14000.onNavigationEvent(mobileIdCardHologramMaskView.getHeight());
                Integer numOnNavigationEvent2 = access14000.onNavigationEvent(this.this$0.getWidth());
                this.label = 1;
                Object objIAuthTabCallback = generateInviteUrl.IAuthTabCallback(mobileIdCardHologramMaskView, str, numOnNavigationEvent, numOnNavigationEvent2, this);
                if (objIAuthTabCallback != objOnExtraCallback) {
                    return objIAuthTabCallback;
                }
                int i4 = onWarmupCompleted + 85;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallback;
            }
        }

        static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ String $strokeImageUrl;
            int label;
            final /* synthetic */ MobileIdCardHologramMaskView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallback(MobileIdCardHologramMaskView mobileIdCardHologramMaskView, String str, access13800<? super onExtraCallback> access13800Var) {
                super(2, access13800Var);
                this.this$0 = mobileIdCardHologramMaskView;
                this.$strokeImageUrl = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallback onextracallback = new onExtraCallback(this.this$0, this.$strokeImageUrl, access13800Var);
                int i2 = IAuthTabCallback + 55;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 98 / 0;
                }
                return onextracallback;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 59;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i4 = IAuthTabCallback + 69;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return objOnExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 45;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((onExtraCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 43;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = IAuthTabCallback;
                    int i4 = i3 + 13;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0 ? i2 != 1 : i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = i3 + 61;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    ResultKt.onNavigationEvent(obj);
                    return obj;
                }
                ResultKt.onNavigationEvent(obj);
                MobileIdCardHologramMaskView mobileIdCardHologramMaskView = this.this$0;
                String str = this.$strokeImageUrl;
                Integer numOnNavigationEvent = access14000.onNavigationEvent(mobileIdCardHologramMaskView.getHeight());
                Integer numOnNavigationEvent2 = access14000.onNavigationEvent(this.this$0.getWidth());
                this.label = 1;
                Object objIAuthTabCallback = generateInviteUrl.IAuthTabCallback(mobileIdCardHologramMaskView, str, numOnNavigationEvent, numOnNavigationEvent2, this);
                if (objIAuthTabCallback != objOnExtraCallback) {
                    return objIAuthTabCallback;
                }
                int i7 = IAuthTabCallback + 41;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    return objOnExtraCallback;
                }
                throw null;
            }
        }

        public static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            public static int onExtraCallbackWithResult;
            public static int onNavigationEvent;
            int label;
            final /* synthetic */ MobileIdCardHologramMaskView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IAuthTabCallback(MobileIdCardHologramMaskView mobileIdCardHologramMaskView, access13800<? super IAuthTabCallback> access13800Var) {
                super(2, access13800Var);
                this.this$0 = mobileIdCardHologramMaskView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.this$0, access13800Var);
                int i2 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return iAuthTabCallback;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 111;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i4 = IAuthTabCallback + 103;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return objOnExtraCallback;
                }
                throw null;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                Object objInvokeSuspend;
                int i = 2 % 2;
                int i2 = onExtraCallback + 17;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) create(findresandmsg, access13800Var);
                if (i3 != 0) {
                    objInvokeSuspend = iAuthTabCallback.invokeSuspend(Unit.INSTANCE);
                    int i4 = 68 / 0;
                } else {
                    objInvokeSuspend = iAuthTabCallback.invokeSuspend(Unit.INSTANCE);
                }
                int i5 = onExtraCallback + 83;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    return obj;
                }
                ResultKt.onNavigationEvent(obj);
                MobileIdCardHologramMaskView mobileIdCardHologramMaskView = this.this$0;
                String strOnWarmupCompleted = MobileIdCardHologramMaskView.onWarmupCompleted(mobileIdCardHologramMaskView);
                Integer numOnNavigationEvent = access14000.onNavigationEvent((int) (this.this$0.getHeight() * 1.3f));
                Integer numOnNavigationEvent2 = access14000.onNavigationEvent((int) (this.this$0.getHeight() * 1.3f));
                this.label = 1;
                Object objIAuthTabCallback = generateInviteUrl.IAuthTabCallback(mobileIdCardHologramMaskView, strOnWarmupCompleted, numOnNavigationEvent, numOnNavigationEvent2, this);
                if (objIAuthTabCallback == objOnExtraCallback) {
                    int i3 = IAuthTabCallback + 71;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 15 / 0;
                    }
                    return objOnExtraCallback;
                }
                int i5 = IAuthTabCallback + 1;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 74 / 0;
                }
                return objIAuthTabCallback;
            }

            public static int onNavigationEvent() {
                int i = onNavigationEvent;
                int i2 = i % 7396049;
                onNavigationEvent = i + 1;
                if (i2 != 0) {
                    return onExtraCallbackWithResult;
                }
                int iMyUid = Process.myUid();
                onExtraCallbackWithResult = iMyUid;
                return iMyUid;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0131  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            GeckoHubImp1 geckoHubImp1;
            GeckoHubImp1 geckoHubImp12;
            GeckoHubImp1 geckoHubImp13;
            MobileIdCardHologramMaskView mobileIdCardHologramMaskView;
            Bitmap bitmap;
            MobileIdCardHologramMaskView mobileIdCardHologramMaskView2;
            Object objIAuthTabCallback;
            Bitmap bitmap2;
            Bitmap bitmap3;
            MobileIdCardHologramMaskView mobileIdCardHologramMaskView3;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                access14100.onExtraCallback();
                throw null;
            }
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                GeckoHubImp1 geckoHubImp1OnWarmupCompleted = onLoadStarted.onWarmupCompleted(findresandmsg, null, null, new onExtraCallbackWithResult(MobileIdCardHologramMaskView.this, this.$fillImageUrl, null), 3, null);
                GeckoHubImp1 geckoHubImp1OnWarmupCompleted2 = onLoadStarted.onWarmupCompleted(findresandmsg, null, null, new onExtraCallback(MobileIdCardHologramMaskView.this, this.$strokeImageUrl, null), 3, null);
                GeckoHubImp1 geckoHubImp1OnWarmupCompleted3 = onLoadStarted.onWarmupCompleted(findresandmsg, null, null, new IAuthTabCallback(MobileIdCardHologramMaskView.this, null), 3, null);
                MobileIdCardHologramMaskView mobileIdCardHologramMaskView4 = MobileIdCardHologramMaskView.this;
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = access15400.onNavigationEvent(geckoHubImp1OnWarmupCompleted);
                this.L$2 = geckoHubImp1OnWarmupCompleted2;
                this.L$3 = geckoHubImp1OnWarmupCompleted3;
                this.L$4 = mobileIdCardHologramMaskView4;
                this.label = 1;
                Object objIAuthTabCallback2 = geckoHubImp1OnWarmupCompleted.IAuthTabCallback(this);
                if (objIAuthTabCallback2 != objOnExtraCallback) {
                    geckoHubImp1 = geckoHubImp1OnWarmupCompleted;
                    obj = objIAuthTabCallback2;
                    geckoHubImp12 = geckoHubImp1OnWarmupCompleted2;
                    geckoHubImp13 = geckoHubImp1OnWarmupCompleted3;
                    mobileIdCardHologramMaskView = mobileIdCardHologramMaskView4;
                }
                int i4 = onNavigationEvent + 105;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallback;
            }
            if (i3 != 1) {
                int i6 = onNavigationEvent;
                int i7 = i6 + 9;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i9 = i6 + 21;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    bitmap2 = (Bitmap) this.L$6;
                    bitmap3 = (Bitmap) this.L$5;
                    mobileIdCardHologramMaskView3 = (MobileIdCardHologramMaskView) this.L$4;
                    ResultKt.onNavigationEvent(obj);
                    MobileIdCardHologramMaskView.IAuthTabCallback(mobileIdCardHologramMaskView3, bitmap3, bitmap2, (Bitmap) obj);
                    this.$onComplete.invoke();
                    MobileIdCardHologramMaskView.this.invalidate();
                    return Unit.INSTANCE;
                }
                bitmap = (Bitmap) this.L$5;
                mobileIdCardHologramMaskView2 = (MobileIdCardHologramMaskView) this.L$4;
                geckoHubImp13 = (GeckoHubImp1) this.L$3;
                geckoHubImp12 = (GeckoHubImp1) this.L$2;
                geckoHubImp1 = (GeckoHubImp1) this.L$1;
                ResultKt.onNavigationEvent(obj);
                Bitmap bitmap4 = (Bitmap) obj;
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = access15400.onNavigationEvent(geckoHubImp1);
                this.L$2 = access15400.onNavigationEvent(geckoHubImp12);
                this.L$3 = access15400.onNavigationEvent(geckoHubImp13);
                this.L$4 = mobileIdCardHologramMaskView2;
                this.L$5 = bitmap;
                this.L$6 = bitmap4;
                this.label = 3;
                objIAuthTabCallback = geckoHubImp13.IAuthTabCallback(this);
                if (objIAuthTabCallback != objOnExtraCallback) {
                    bitmap2 = bitmap4;
                    obj = objIAuthTabCallback;
                    bitmap3 = bitmap;
                    mobileIdCardHologramMaskView3 = mobileIdCardHologramMaskView2;
                    MobileIdCardHologramMaskView.IAuthTabCallback(mobileIdCardHologramMaskView3, bitmap3, bitmap2, (Bitmap) obj);
                    this.$onComplete.invoke();
                    MobileIdCardHologramMaskView.this.invalidate();
                    return Unit.INSTANCE;
                }
                int i42 = onNavigationEvent + 105;
                onExtraCallback = i42 % 128;
                int i52 = i42 % 2;
                return objOnExtraCallback;
            }
            mobileIdCardHologramMaskView = (MobileIdCardHologramMaskView) this.L$4;
            GeckoHubImp1 geckoHubImp14 = (GeckoHubImp1) this.L$3;
            GeckoHubImp1 geckoHubImp15 = (GeckoHubImp1) this.L$2;
            GeckoHubImp1 geckoHubImp16 = (GeckoHubImp1) this.L$1;
            ResultKt.onNavigationEvent(obj);
            geckoHubImp1 = geckoHubImp16;
            geckoHubImp12 = geckoHubImp15;
            geckoHubImp13 = geckoHubImp14;
            Bitmap bitmap5 = (Bitmap) obj;
            this.L$0 = access15400.onNavigationEvent(findresandmsg);
            this.L$1 = access15400.onNavigationEvent(geckoHubImp1);
            this.L$2 = access15400.onNavigationEvent(geckoHubImp12);
            this.L$3 = geckoHubImp13;
            this.L$4 = mobileIdCardHologramMaskView;
            this.L$5 = bitmap5;
            this.label = 2;
            Object objIAuthTabCallback3 = geckoHubImp12.IAuthTabCallback(this);
            if (objIAuthTabCallback3 != objOnExtraCallback) {
                int i11 = onNavigationEvent + 9;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                MobileIdCardHologramMaskView mobileIdCardHologramMaskView5 = mobileIdCardHologramMaskView;
                bitmap = bitmap5;
                obj = objIAuthTabCallback3;
                mobileIdCardHologramMaskView2 = mobileIdCardHologramMaskView5;
                Bitmap bitmap42 = (Bitmap) obj;
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = access15400.onNavigationEvent(geckoHubImp1);
                this.L$2 = access15400.onNavigationEvent(geckoHubImp12);
                this.L$3 = access15400.onNavigationEvent(geckoHubImp13);
                this.L$4 = mobileIdCardHologramMaskView2;
                this.L$5 = bitmap;
                this.L$6 = bitmap42;
                this.label = 3;
                objIAuthTabCallback = geckoHubImp13.IAuthTabCallback(this);
                if (objIAuthTabCallback != objOnExtraCallback) {
                }
            }
            int i422 = onNavigationEvent + 105;
            onExtraCallback = i422 % 128;
            int i522 = i422 % 2;
            return objOnExtraCallback;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(asInterface ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 3;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(asInterface)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 45812), KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 84, Color.argb(0, 0, 0, 0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14184 - ((byte) KeyEvent.getModifierMetaStateMask())), 19 - View.resolveSizeAndState(0, 0, 0), 8808 - Color.alpha(0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 7;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i7 = 6 / 0;
            objArr[0] = str;
        }
    }

    private final Bitmap IAuthTabCallback(Bitmap bitmap) {
        int i = 2 % 2;
        Object obj = null;
        if (bitmap == null) {
            int i2 = onTransact + 7;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(-90.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        int i4 = IAuthTabCallbackStub + 99;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return bitmapCreateBitmap;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        Bitmap bitmapExtractAlpha;
        int i = 2 % 2;
        int i2 = onTransact + 9;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallbackWithResult = IAuthTabCallback(bitmap);
            this.asBinder = IAuthTabCallback(bitmap2);
            int i3 = 36 / 0;
            if (bitmap3 != null) {
                int i4 = IAuthTabCallbackStub + 97;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                bitmapExtractAlpha = bitmap3.extractAlpha();
                int i6 = onTransact + 65;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
            } else {
                bitmapExtractAlpha = null;
            }
        } else {
            this.onExtraCallbackWithResult = IAuthTabCallback(bitmap);
            this.asBinder = IAuthTabCallback(bitmap2);
            if (bitmap3 != null) {
            }
        }
        this.onNavigationEvent = bitmapExtractAlpha;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Bitmap bitmap;
        int i = 2 % 2;
        int i2 = onTransact + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        Bitmap bitmap2 = this.onExtraCallbackWithResult;
        if (bitmap2 != null) {
            int i4 = IAuthTabCallbackStub + 29;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            Bitmap bitmap3 = this.asBinder;
            if (bitmap3 == null || (bitmap = this.onNavigationEvent) == null) {
                return;
            }
            float width = getWidth();
            float height = getHeight();
            float width2 = (this.onWarmupCompleted * width) - (bitmap.getWidth() / 2.0f);
            float height2 = (this.onExtraCallback * height) - (bitmap.getHeight() / 2.0f);
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, width, height, null);
            canvas.saveLayer(0.0f, 0.0f, width, height, null);
            canvas.drawBitmap(bitmap, width2, height2, this.IAuthTabCallbackDefault);
            Paint paint = this.IAuthTabCallbackDefault;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, this.IAuthTabCallbackDefault);
            this.IAuthTabCallbackDefault.setXfermode(null);
            canvas.restore();
            canvas.saveLayer(0.0f, 0.0f, width, height, null);
            canvas.drawBitmap(bitmap, width2, height2, this.IAuthTabCallbackDefault);
            this.IAuthTabCallbackDefault.setXfermode(new PorterDuffXfermode(mode));
            canvas.drawBitmap(bitmap3, 0.0f, 0.0f, this.IAuthTabCallbackDefault);
            this.IAuthTabCallbackDefault.setXfermode(null);
            canvas.restore();
            canvas.restoreToCount(iSaveLayer);
        }
    }

    public final void IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull findResAndMsg findresandmsg, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (!(!isLaidOut())) {
            int i2 = IAuthTabCallbackStub + 65;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (!isLayoutRequested()) {
                onLoadStarted.onExtraCallback(findresandmsg, null, null, new onWarmupCompleted(function0, str, str2, null), 3, null);
                int i4 = IAuthTabCallbackStub + 71;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
        }
        addOnLayoutChangeListener(new onExtraCallbackWithResult(findresandmsg, this, function0, str, str2));
    }
}
