package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.DisplayMetrics;
import java.io.ByteArrayOutputStream;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import o.RecomposerawaitIdle2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class rExternalSyntheticLambda1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        float F$0;
        float F$1;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            String str;
            Context context;
            float f;
            float f2;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            if (i3 != 0) {
                str = null;
                context = null;
                f = 1.0f;
                f2 = 2.0f;
            } else {
                str = null;
                context = null;
                f = 0.0f;
                f2 = 0.0f;
            }
            Object objOnExtraCallback = rExternalSyntheticLambda1.onExtraCallback(str, context, f, f2, 0, this);
            int i4 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 75 / 0;
            }
            return objOnExtraCallback;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onExtraCallback(@NotNull String str, @NotNull Context context, float f, float f2, int i, @NotNull access13800<? super Bitmap> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        String str2;
        int i2;
        int i3 = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            int i4 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = ((IAuthTabCallback) access13800Var).label;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i6 = iAuthTabCallback.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i6 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
                int i7 = onExtraCallbackWithResult + 13;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        Object objOnNavigationEvent = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i9 = iAuthTabCallback.label;
        if (i9 == 0) {
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int iOnExtraCallback = getBacktraceNoteBytes.onExtraCallback(displayMetrics.density * f);
            CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context);
            RecomposerawaitIdle2 recomposerawaitIdle2OnExtraCallbackWithResult = RecomposerrecompositionRunner2.IAuthTabCallback(Recomposerjoin2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(str).onExtraCallback(iOnExtraCallback, iOnExtraCallback), false), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new r0d(f2 / f, i)}).onExtraCallbackWithResult();
            iAuthTabCallback.L$0 = str;
            iAuthTabCallback.L$1 = access15400.onNavigationEvent(context);
            iAuthTabCallback.L$2 = access15400.onNavigationEvent(displayMetrics);
            iAuthTabCallback.F$0 = f;
            iAuthTabCallback.F$1 = f2;
            iAuthTabCallback.I$0 = i;
            iAuthTabCallback.I$1 = iOnExtraCallback;
            iAuthTabCallback.label = 1;
            objOnNavigationEvent = carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult.onNavigationEvent(recomposerawaitIdle2OnExtraCallbackWithResult, iAuthTabCallback);
            if (objOnNavigationEvent == objOnWarmupCompleted) {
                int i10 = onNavigationEvent + 51;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                return objOnWarmupCompleted;
            }
            str2 = str;
            i2 = iOnExtraCallback;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = onExtraCallbackWithResult + 103;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 != 0) {
                i2 = iAuthTabCallback.I$1;
                str2 = (String) iAuthTabCallback.L$0;
                ResultKt.onNavigationEvent(objOnNavigationEvent);
                int i13 = 12 / 0;
            } else {
                i2 = iAuthTabCallback.I$1;
                str2 = (String) iAuthTabCallback.L$0;
                ResultKt.onNavigationEvent(objOnNavigationEvent);
            }
        }
        CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult = ((RecomposerErrorInformation) objOnNavigationEvent).onExtraCallbackWithResult();
        if (carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult != null) {
            return CarouselPagerStateExternalSyntheticLambda1.onNavigationEvent(carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult, i2, i2, Bitmap.Config.ARGB_8888);
        }
        throw new IllegalArgumentException(("Failed to load image: " + str2).toString());
    }

    public static /* synthetic */ String onExtraCallback(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0 && (i2 & 1) != 0) {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        if ((i2 & 2) != 0) {
            int i5 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i5 % 128;
            i = i5 % 2 != 0 ? 40 : 100;
        }
        String strIAuthTabCallback = IAuthTabCallback(bitmap, compressFormat, i);
        int i6 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return strIAuthTabCallback;
    }

    public static final String IAuthTabCallback(@NotNull Bitmap bitmap, @NotNull Bitmap.CompressFormat compressFormat, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(bitmap, "");
        Intrinsics.checkNotNullParameter(compressFormat, "");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, i, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        int i3 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return strEncodeToString;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Bitmap IAuthTabCallback(@NotNull String str) {
        Bitmap bitmapDecodeByteArray;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            byte[] bArrDecode = Base64.decode(str, 2);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 1, bArrDecode.length);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            byte[] bArrDecode2 = Base64.decode(str, 2);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode2, 0, bArrDecode2.length);
        }
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeByteArray, "");
        return bitmapDecodeByteArray;
    }
}
