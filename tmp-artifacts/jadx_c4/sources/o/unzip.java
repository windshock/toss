package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Base64;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.core.webkit.bridge.image.Image;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import im.toss.uikit.drawable.RotateTransformation;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import kotlinx.coroutines.rx2.RxSingleKt;
import o.RecomposerawaitIdle2;
import o.unzip;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class unzip {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final Context IAuthTabCallback;
    private final int onExtraCallback;

    static final class onExtraCallback extends ContinuationImpl {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        float F$0;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws FileNotFoundException {
            unzip unzipVar;
            Context context;
            String str;
            int i;
            float f;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 19;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            if (i4 != 0) {
                unzipVar = unzip.this;
                context = null;
                str = null;
                i = 0;
                f = 2.0f;
            } else {
                unzipVar = unzip.this;
                context = null;
                str = null;
                i = 0;
                f = 0.0f;
            }
            Object objIAuthTabCallback = unzip.IAuthTabCallback(unzipVar, context, str, i, f, this);
            int i5 = onNavigationEvent + 23;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 42 / 0;
            }
            return objIAuthTabCallback;
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws FileNotFoundException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = unzip.this.IAuthTabCallback((String) null, (access13800<? super String>) this);
            int i4 = onExtraCallback + 61;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }
    }

    public static /* synthetic */ Uri IAuthTabCallback(unzip unzipVar, Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Uri uriOnWarmupCompleted = onWarmupCompleted(unzipVar, bitmap);
        int i4 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return uriOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Bitmap bitmapOnExtraCallback = onExtraCallback(function1, obj);
        int i4 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return bitmapOnExtraCallback;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~((~i3) | i6);
        int i11 = i9 | i10 | (~(i6 | i5));
        int i12 = (~(i5 | i3)) | (~(i7 | i3));
        int i13 = i8 | i10;
        int i14 = i3 + i6 + i4 + (793188503 * i2) + (2090109681 * i);
        int i15 = i14 * i14;
        int i16 = (837707615 * i3) + 1286602752 + ((-1676358574) * i6) + (i11 * (-838022063)) + (1676044126 * i12) + ((-838022063) * i13) + ((-838336512) * i4) + (1186463744 * i2) + (1166540800 * i) + ((-1956446208) * i15);
        int i17 = ((i3 * 1389925299) - 652765764) + (i6 * 1389927018) + (i11 * 573) + (i12 * (-1146)) + (i13 * 573) + (i4 * 1389926445) + (i2 * (-1551828341)) + (i * (-2047638435)) + (i15 * 1214709760);
        int i18 = i16 + (i17 * i17 * 445972480);
        if (i18 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i18 == 2) {
            return IAuthTabCallback(objArr);
        }
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i19 = 2 % 2;
        int i20 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i20 % 128;
        int i21 = i20 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Uri uri = (Uri) function1.invoke(obj);
        int i22 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i22 % 128;
        int i23 = i22 % 2;
        return uri;
    }

    public static /* synthetic */ Uri onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult4 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = JsParamKeys.onExtraCallbackWithResult();
        Uri uri = (Uri) onExtraCallback(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult6, 1873874710, iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult4, new Object[]{function1, obj}, -1873874710);
        int i3 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 57 / 0;
        }
        return uri;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        unzip unzipVar = (unzip) objArr[0];
        Uri uri = (Uri) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Bitmap bitmapOnNavigationEvent = onNavigationEvent(unzipVar, uri);
        int i4 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return bitmapOnNavigationEvent;
    }

    public unzip(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback = context;
        this.onExtraCallback = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ unzip(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onNavigationEvent + 107;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 41;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 % 2;
            } else {
                int i8 = 2 % 2;
            }
            i = -1;
        }
        this(context, i);
    }

    public static final /* synthetic */ int IAuthTabCallback(unzip unzipVar) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int i4 = unzipVar.onExtraCallback;
        if (i3 != 0) {
            return i4;
        }
        throw null;
    }

    public static final /* synthetic */ Object IAuthTabCallback(unzip unzipVar, Context context, String str, int i, float f, access13800 access13800Var) throws FileNotFoundException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object objIAuthTabCallback = unzipVar.IAuthTabCallback(context, str, i, f, access13800Var);
        int i5 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ Context onExtraCallback(unzip unzipVar) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Context context = unzipVar.IAuthTabCallback;
        int i5 = i3 + 85;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull String str, @NotNull access13800<? super String> access13800Var) throws FileNotFoundException {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i2 = onextracallbackwithresult.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onExtraCallbackWithResult + 107;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                onextracallbackwithresult.label = i2 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
        Object objOnWarmupCompleted = onextracallbackwithresult2.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i5 = onextracallbackwithresult2.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            writeRaw writerawOnExtraCallbackWithResult = CommonModule_share.IAuthTabCallback.onExtraCallbackWithResult(this.IAuthTabCallback, Uri.parse(str));
            onextracallbackwithresult2.L$0 = str;
            onextracallbackwithresult2.label = 1;
            objOnWarmupCompleted = RxAwaitKt.onWarmupCompleted(writerawOnExtraCallbackWithResult, onextracallbackwithresult2);
            if (objOnWarmupCompleted != objOnWarmupCompleted2) {
            }
            return objOnWarmupCompleted2;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objOnWarmupCompleted;
            if (iAuthTabCallback == null) {
                return "";
            }
            int i6 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                String strOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
                return strOnExtraCallbackWithResult != null ? strOnExtraCallbackWithResult : "";
            }
            iAuthTabCallback.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        str = (String) onextracallbackwithresult2.L$0;
        ResultKt.onNavigationEvent(objOnWarmupCompleted);
        String str2 = str;
        Float f = (Float) objOnWarmupCompleted;
        Context context = this.IAuthTabCallback;
        int i7 = this.onExtraCallback;
        Intrinsics.checkNotNull(f);
        float fFloatValue = f.floatValue();
        onextracallbackwithresult2.L$0 = access15400.onNavigationEvent(str2);
        onextracallbackwithresult2.L$1 = access15400.onNavigationEvent(f);
        onextracallbackwithresult2.label = 2;
        objOnWarmupCompleted = IAuthTabCallback(context, str2, i7, fFloatValue, onextracallbackwithresult2);
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends Image>>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ List<String> $rawImageUrls;
        int label;
        final /* synthetic */ unzip this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(List<String> list, unzip unzipVar, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$rawImageUrls = list;
            this.this$0 = unzipVar;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$rawImageUrls, this.this$0, access13800Var);
            int i2 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 13 / 0;
            }
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super List<Image>> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super List<Image>> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$rawImageUrls, this.this$0, null);
            this.label = 1;
            Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(anonymousClass4, this);
            if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                int i4 = IAuthTabCallback + 89;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }
            int i6 = onExtraCallbackWithResult + 61;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            obj2.hashCode();
            throw null;
        }

        /* renamed from: o.unzip$onWarmupCompleted$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends Image>>, Object> {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            final /* synthetic */ List<String> $rawImageUrls;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ unzip this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(List<String> list, unzip unzipVar, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.$rawImageUrls = list;
                this.this$0 = unzipVar;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super List<Image>> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 85;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 79;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$rawImageUrls, this.this$0, access13800Var);
                anonymousClass4.L$0 = obj;
                int i2 = onNavigationEvent + 63;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass4;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 69;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
                int i4 = onNavigationEvent + 39;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objIAuthTabCallback;
            }

            /* renamed from: o.unzip$onWarmupCompleted$4$onWarmupCompleted, reason: collision with other inner class name */
            static final class C0032onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Image>, Object> {
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;
                final /* synthetic */ String $url;
                Object L$0;
                int label;
                final /* synthetic */ unzip this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0032onWarmupCompleted(unzip unzipVar, String str, access13800<? super C0032onWarmupCompleted> access13800Var) {
                    super(2, access13800Var);
                    this.this$0 = unzipVar;
                    this.$url = str;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    C0032onWarmupCompleted c0032onWarmupCompleted = new C0032onWarmupCompleted(this.this$0, this.$url, access13800Var);
                    int i2 = onExtraCallback + 85;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return c0032onWarmupCompleted;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) throws FileNotFoundException {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 53;
                    onExtraCallback = i2 % 128;
                    findResAndMsg findresandmsg = (findResAndMsg) obj;
                    access13800<? super Image> access13800Var = (access13800) obj2;
                    if (i2 % 2 == 0) {
                        onExtraCallbackWithResult(findresandmsg, access13800Var);
                        throw null;
                    }
                    Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
                    int i3 = onNavigationEvent + 57;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnExtraCallbackWithResult;
                }

                public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Image> access13800Var) throws FileNotFoundException {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 47;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    C0032onWarmupCompleted c0032onWarmupCompletedCreate = create(findresandmsg, access13800Var);
                    Unit unit = Unit.INSTANCE;
                    if (i3 == 0) {
                        c0032onWarmupCompletedCreate.invokeSuspend(unit);
                        throw null;
                    }
                    Object objInvokeSuspend = c0032onWarmupCompletedCreate.invokeSuspend(unit);
                    int i4 = onNavigationEvent + 103;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }

                /* renamed from: o.unzip$onWarmupCompleted$4$onWarmupCompleted$onExtraCallback */
                static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super CommonModule_setIosSwipeGestureEnabled>, Object> {
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;
                    final /* synthetic */ String $url;
                    int label;
                    final /* synthetic */ unzip this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    onExtraCallback(unzip unzipVar, String str, access13800<? super onExtraCallback> access13800Var) {
                        super(2, access13800Var);
                        this.this$0 = unzipVar;
                        this.$url = str;
                    }

                    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                        int i = 2 % 2;
                        onExtraCallback onextracallback = new onExtraCallback(this.this$0, this.$url, access13800Var);
                        int i2 = onWarmupCompleted + 49;
                        onNavigationEvent = i2 % 128;
                        int i3 = i2 % 2;
                        return onextracallback;
                    }

                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = onWarmupCompleted + 13;
                        onNavigationEvent = i2 % 128;
                        findResAndMsg findresandmsg = (findResAndMsg) obj;
                        access13800<? super CommonModule_setIosSwipeGestureEnabled> access13800Var = (access13800) obj2;
                        if (i2 % 2 == 0) {
                            onWarmupCompleted(findresandmsg, access13800Var);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
                        int i3 = onWarmupCompleted + 41;
                        onNavigationEvent = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i4 = 26 / 0;
                        }
                        return objOnWarmupCompleted;
                    }

                    public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super CommonModule_setIosSwipeGestureEnabled> access13800Var) {
                        int i = 2 % 2;
                        int i2 = onWarmupCompleted + 123;
                        onNavigationEvent = i2 % 128;
                        int i3 = i2 % 2;
                        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                        int i4 = onNavigationEvent + 9;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        return objInvokeSuspend;
                    }

                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = onWarmupCompleted + 45;
                        onNavigationEvent = i2 % 128;
                        int i3 = i2 % 2;
                        ResultKt.onNavigationEvent(obj);
                        CommonModule_setIosSwipeGestureEnabled commonModule_setIosSwipeGestureEnabled = (CommonModule_setIosSwipeGestureEnabled) CommonModule_share.onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 1336674902, -1336674902, new Object[]{CommonModule_share.IAuthTabCallback, unzip.onExtraCallback(this.this$0), Uri.parse(this.$url)});
                        int i4 = onWarmupCompleted + 65;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                        return commonModule_setIosSwipeGestureEnabled;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[PHI: r1
                  0x0046: PHI (r1v15 java.lang.Object) = (r1v4 java.lang.Object), (r1v16 java.lang.Object) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00ae A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r1 r4
                  0x0025: PHI (r1v5 java.lang.Object) = (r1v4 java.lang.Object), (r1v16 java.lang.Object) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
                  0x0025: PHI (r4v1 int) = (r4v0 int), (r4v6 int) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws FileNotFoundException {
                    Object objOnWarmupCompleted;
                    int i;
                    CommonModule_setIosSwipeGestureEnabled commonModule_setIosSwipeGestureEnabled;
                    IAuthTabCallback iAuthTabCallback;
                    Object objIAuthTabCallback;
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 99;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0) {
                        objOnWarmupCompleted = access14300.onWarmupCompleted();
                        i = this.label;
                        if (i != 0) {
                        }
                        CommonModule_setIosSwipeGestureEnabled commonModule_setIosSwipeGestureEnabled2 = (CommonModule_setIosSwipeGestureEnabled) obj;
                        unzip unzipVar = this.this$0;
                        Context contextOnExtraCallback = unzip.onExtraCallback(unzipVar);
                        String str = this.$url;
                        int iIAuthTabCallback = unzip.IAuthTabCallback(this.this$0);
                        float fOnExtraCallbackWithResult = commonModule_setIosSwipeGestureEnabled2.onExtraCallbackWithResult();
                        this.L$0 = commonModule_setIosSwipeGestureEnabled2;
                        this.label = 2;
                        objIAuthTabCallback = unzip.IAuthTabCallback(unzipVar, contextOnExtraCallback, str, iIAuthTabCallback, fOnExtraCallbackWithResult, this);
                        if (objIAuthTabCallback != objOnWarmupCompleted) {
                        }
                        return objOnWarmupCompleted;
                    }
                    objOnWarmupCompleted = access14300.onWarmupCompleted();
                    i = this.label;
                    int i4 = 12 / 0;
                    if (i == 0) {
                        ResultKt.onNavigationEvent(obj);
                        GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                        onExtraCallback onextracallback = new onExtraCallback(this.this$0, this.$url, null);
                        this.label = 1;
                        obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallback, this);
                        if (obj != objOnWarmupCompleted) {
                        }
                        return objOnWarmupCompleted;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i5 = onExtraCallback + 75;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        commonModule_setIosSwipeGestureEnabled = (CommonModule_setIosSwipeGestureEnabled) this.L$0;
                        ResultKt.onNavigationEvent(obj);
                        iAuthTabCallback = (IAuthTabCallback) obj;
                        if (iAuthTabCallback != null) {
                            return null;
                        }
                        int i7 = onNavigationEvent + 11;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        Image.Companion companion = Image.Companion;
                        String strOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
                        int iOnNavigationEvent = iAuthTabCallback.onNavigationEvent();
                        int iOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted();
                        long jOnExtraCallback = iAuthTabCallback.onExtraCallback();
                        Long lOnExtraCallback = commonModule_setIosSwipeGestureEnabled.onExtraCallback();
                        if (i8 != 0) {
                            return companion.onNavigationEvent(strOnExtraCallbackWithResult, iOnNavigationEvent, iOnWarmupCompleted, jOnExtraCallback, lOnExtraCallback);
                        }
                        companion.onNavigationEvent(strOnExtraCallbackWithResult, iOnNavigationEvent, iOnWarmupCompleted, jOnExtraCallback, lOnExtraCallback);
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj);
                    CommonModule_setIosSwipeGestureEnabled commonModule_setIosSwipeGestureEnabled22 = (CommonModule_setIosSwipeGestureEnabled) obj;
                    unzip unzipVar2 = this.this$0;
                    Context contextOnExtraCallback2 = unzip.onExtraCallback(unzipVar2);
                    String str2 = this.$url;
                    int iIAuthTabCallback2 = unzip.IAuthTabCallback(this.this$0);
                    float fOnExtraCallbackWithResult2 = commonModule_setIosSwipeGestureEnabled22.onExtraCallbackWithResult();
                    this.L$0 = commonModule_setIosSwipeGestureEnabled22;
                    this.label = 2;
                    objIAuthTabCallback = unzip.IAuthTabCallback(unzipVar2, contextOnExtraCallback2, str2, iIAuthTabCallback2, fOnExtraCallbackWithResult2, this);
                    if (objIAuthTabCallback != objOnWarmupCompleted) {
                        commonModule_setIosSwipeGestureEnabled = commonModule_setIosSwipeGestureEnabled22;
                        obj = objIAuthTabCallback;
                        iAuthTabCallback = (IAuthTabCallback) obj;
                        if (iAuthTabCallback != null) {
                        }
                    }
                    return objOnWarmupCompleted;
                }
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 19;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 != 0) {
                    int i5 = onExtraCallbackWithResult + 59;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    List<String> list = this.$rawImageUrls;
                    unzip unzipVar = this.this$0;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(maybeUpdateAnimatable.onExtraCallback(findresandmsg, putChannelInfo.onWarmupCompleted(), (setRandomHost) null, new C0032onWarmupCompleted(unzipVar, (String) it.next(), null), 2, (Object) null));
                    }
                    this.L$0 = access15400.onNavigationEvent(findresandmsg);
                    this.label = 1;
                    obj = ResourceCallback.IAuthTabCallback(arrayList, this);
                    if (obj == objOnWarmupCompleted) {
                        int i7 = onNavigationEvent + 5;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        return objOnWarmupCompleted;
                    }
                }
                return CollectionsKt.filterNotNull((Iterable) obj);
            }
        }
    }

    public final writeRaw<List<Image>> onExtraCallbackWithResult(@NotNull List<String> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        writeRaw<List<Image>> writerawIAuthTabCallback = RxSingleKt.IAuthTabCallback((CoroutineContext) null, new onWarmupCompleted(list, this, null), 1, (Object) null);
        int i2 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return writerawIAuthTabCallback;
        }
        throw null;
    }

    private static final Bitmap onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Bitmap bitmap = (Bitmap) function1.invoke(obj);
        int i4 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return bitmap;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Bitmap onNavigationEvent(unzip unzipVar, Uri uri) {
        BitmapDrawable bitmapDrawable;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Drawable drawableCreateFromStream = Drawable.createFromStream(unzipVar.IAuthTabCallback.getContentResolver().openInputStream(uri), uri.toString());
        if (!(drawableCreateFromStream instanceof BitmapDrawable)) {
            int i2 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            bitmapDrawable = null;
        } else {
            bitmapDrawable = (BitmapDrawable) drawableCreateFromStream;
        }
        if (bitmapDrawable == null) {
            return null;
        }
        int i4 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return bitmapDrawable.getBitmap();
    }

    private static final Uri onWarmupCompleted(unzip unzipVar, Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bitmap, "");
        Uri uriOnExtraCallbackWithResult = AFj1qSDK.onNavigationEvent.onExtraCallbackWithResult(unzipVar.IAuthTabCallback, bitmap);
        if (uriOnExtraCallbackWithResult == null) {
            int i4 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                Uri uri = Uri.EMPTY;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            uriOnExtraCallbackWithResult = Uri.EMPTY;
        }
        int i5 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return uriOnExtraCallbackWithResult;
    }

    public final writeRaw<List<Uri>> onNavigationEvent(@NotNull List<? extends Uri> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        getByteBuffer getbytebufferOnExtraCallback = getByteBuffer.onExtraCallback(list);
        final Function1 function1 = new Function1() { // from class: im.toss.core.webkit.bridge.image.PhotoConverter$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 47;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {this.f$0, (Uri) obj};
                int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
                if (i4 != 0) {
                    return (Bitmap) unzip.onExtraCallback(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -1508822672, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, objArr, 1508822673);
                }
                int i5 = 44 / 0;
                return (Bitmap) unzip.onExtraCallback(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -1508822672, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, objArr, 1508822673);
            }
        };
        getByteBuffer getbytebufferAsInterface = getbytebufferOnExtraCallback.asInterface(new deserializeIntNullableCollection() { // from class: im.toss.core.webkit.bridge.image.PhotoConverter$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object apply(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 99;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {function1, obj};
                int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
                Bitmap bitmap = (Bitmap) unzip.onExtraCallback(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 1321888044, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, objArr, -1321888042);
                int i5 = onWarmupCompleted + 61;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return bitmap;
            }
        });
        final Function1 function12 = new Function1() { // from class: im.toss.core.webkit.bridge.image.PhotoConverter$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 121;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Uri uriIAuthTabCallback = unzip.IAuthTabCallback(this.f$0, (Bitmap) obj);
                int i5 = onNavigationEvent + 63;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return uriIAuthTabCallback;
                }
                throw null;
            }
        };
        writeRaw<List<Uri>> writerawIAuthTabCallback = getbytebufferAsInterface.asInterface(new deserializeIntNullableCollection() { // from class: im.toss.core.webkit.bridge.image.PhotoConverter$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object apply(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 11;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Uri uriOnExtraCallbackWithResult = unzip.onExtraCallbackWithResult(function12, obj);
                int i5 = onWarmupCompleted + 79;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 11 / 0;
                }
                return uriOnExtraCallbackWithResult;
            }
        }).writeTypedObject().onNavigationEvent(clearTid.onExtraCallback()).IAuthTabCallback(NetConverter3.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        int i2 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return writerawIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Context $context;
        final /* synthetic */ float $rotateDegrees;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(Context context, String str, float f, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
            this.$url = str;
            this.$rotateDegrees = f;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 55;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$context, this.$url, this.$rotateDegrees, access13800Var);
            int i2 = onExtraCallback + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 55;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onExtraCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult = CarouselKtExternalSyntheticLambda5.onWarmupCompleted(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(this.$context), RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(this.$context).onExtraCallback(this.$url), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new RotateTransformation(this.$rotateDegrees)}).onExtraCallbackWithResult()).onExtraCallbackWithResult();
            if (carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult == null) {
                return null;
            }
            int i3 = onExtraCallback + 49;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Bitmap bitmapOnExtraCallbackWithResult = CarouselPagerStateExternalSyntheticLambda1.onExtraCallbackWithResult(carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult, 0, 0, 3, (Object) null);
            int i5 = onExtraCallback + 29;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return bitmapOnExtraCallbackWithResult;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(Context context, String str, int i, float f, access13800<? super IAuthTabCallback> access13800Var) throws FileNotFoundException {
        onExtraCallback onextracallback;
        int height;
        int i2 = 2 % 2;
        Object obj = null;
        if (access13800Var instanceof onExtraCallback) {
            int i3 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = ((onExtraCallback) access13800Var).label;
                obj.hashCode();
                throw null;
            }
            onextracallback = (onExtraCallback) access13800Var;
            int i5 = onextracallback.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i5 - 2147483648;
                int i6 = onNavigationEvent + 71;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object objOnExtraCallback = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i8 = onextracallback.label;
        if (i8 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            onNavigationEvent onnavigationevent = new onNavigationEvent(context, str, f, null);
            onextracallback.L$0 = context;
            onextracallback.L$1 = access15400.onNavigationEvent(str);
            onextracallback.I$0 = i;
            onextracallback.F$0 = f;
            onextracallback.label = 1;
            objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onnavigationevent, onextracallback);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                int i9 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 29 / 0;
                }
                return objOnWarmupCompleted;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i11 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            i = onextracallback.I$0;
            context = (Context) onextracallback.L$0;
            ResultKt.onNavigationEvent(objOnExtraCallback);
        }
        Bitmap bitmap = (Bitmap) objOnExtraCallback;
        int width = bitmap != null ? bitmap.getWidth() : 0;
        if (bitmap != null) {
            int i13 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            height = bitmap.getHeight();
        } else {
            height = 0;
        }
        if (i == -1) {
            i = width;
        }
        Bitmap bitmapOnWarmupCompleted = onWarmupCompleted(bitmap, i, (int) (height * (i / width)));
        if (bitmapOnWarmupCompleted == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmapOnWarmupCompleted.compress(Bitmap.CompressFormat.JPEG, 70, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            CloseableKt.closeFinally(byteArrayOutputStream, (Throwable) null);
            String strEncodeToString = Base64.encodeToString(byteArray, 2);
            String str2 = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            String str3 = str2 + "_" + StringsKt.substringBefore$default(string, "-", (String) null, 2, (Object) null) + ".txt";
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(str3, 0);
            try {
                Intrinsics.checkNotNull(strEncodeToString);
                byte[] bytes = strEncodeToString.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                fileOutputStreamOpenFileOutput.write(bytes);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStreamOpenFileOutput, (Throwable) null);
                return new IAuthTabCallback(context.getFilesDir().getAbsolutePath() + File.separator + str3, bitmapOnWarmupCompleted.getWidth(), bitmapOnWarmupCompleted.getHeight(), byteArray.length);
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r4.getWidth() > 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return android.graphics.Bitmap.createScaledBitmap(r4, r5, r6, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r4.getWidth() > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Bitmap onWarmupCompleted(Bitmap bitmap, int i, int i2) {
        int i3 = 2 % 2;
        if (bitmap != null) {
            int i4 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 46 / 0;
            }
        }
        int i6 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    static final class IAuthTabCallback {
        private static int asInterface = 1;
        private static int onWarmupCompleted;
        private final String IAuthTabCallback;
        private final long onExtraCallback;
        private final int onExtraCallbackWithResult;
        private final int onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (!Intrinsics.areEqual(this.IAuthTabCallback, iAuthTabCallback.IAuthTabCallback)) {
                return false;
            }
            if (this.onNavigationEvent != iAuthTabCallback.onNavigationEvent) {
                int i2 = asInterface + 79;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (this.onExtraCallbackWithResult == iAuthTabCallback.onExtraCallbackWithResult) {
                return this.onExtraCallback == iAuthTabCallback.onExtraCallback;
            }
            int i4 = onWarmupCompleted + 65;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            asInterface = i2 % 128;
            int iHashCode = i2 % 2 == 0 ? (((((this.IAuthTabCallback.hashCode() * 21) - Integer.hashCode(this.onNavigationEvent)) << 91) + Integer.hashCode(this.onExtraCallbackWithResult)) << 117) >> Long.hashCode(this.onExtraCallback) : (((((this.IAuthTabCallback.hashCode() * 31) + Integer.hashCode(this.onNavigationEvent)) * 31) + Integer.hashCode(this.onExtraCallbackWithResult)) * 31) + Long.hashCode(this.onExtraCallback);
            int i3 = onWarmupCompleted + 91;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ConvertedImage(path=" + this.IAuthTabCallback + ", width=" + this.onNavigationEvent + ", height=" + this.onExtraCallbackWithResult + ", fileSize=" + this.onExtraCallback + ")";
            int i2 = asInterface + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public IAuthTabCallback(@NotNull String str, int i, int i2, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallback = str;
            this.onNavigationEvent = i;
            this.onExtraCallbackWithResult = i2;
            this.onExtraCallback = j;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface + 35;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i3 + 117;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final int onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asInterface + 125;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onNavigationEvent;
            }
            throw null;
        }

        public final int onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 87;
            asInterface = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = this.onExtraCallbackWithResult;
            int i5 = i2 + 65;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return i4;
            }
            obj.hashCode();
            throw null;
        }

        public final long onExtraCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 43;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            long j = this.onExtraCallback;
            int i4 = i3 + 53;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return j;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ Bitmap onWarmupCompleted(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return (Bitmap) onExtraCallback(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 1321888044, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{function1, obj}, -1321888042);
    }

    public static /* synthetic */ Bitmap onWarmupCompleted(unzip unzipVar, Uri uri) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return (Bitmap) onExtraCallback(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -1508822672, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{unzipVar, uri}, 1508822673);
    }

    private static final Uri IAuthTabCallback(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return (Uri) onExtraCallback(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 1873874710, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{function1, obj}, -1873874710);
    }
}
