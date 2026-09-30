package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import im.toss.features.edoc.register.AptPasswordActivity$;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import o.BroadcastFrameClockExternalSyntheticLambda0;
import o.CarouselKtCarousel4ExternalSyntheticLambda0;
import o.CarouselKtExternalSyntheticLambda14;
import o.CarouselKtExternalSyntheticLambda8;
import o.CompositionLocalKtExternalSyntheticLambda1;
import o.MovableContentKtExternalSyntheticLambda15;
import o.RecomposerKtwithRunningRecomposer21;
import o.RecomposerrunRecomposeAndApplyChanges2;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.createLayoutState;
import o.directory;
import o.getCacheokhttp;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getCacheokhttp {
    private static final Interceptor IAuthTabCallback;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 0;
    private static final String onExtraCallback;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final getCacheokhttp onWarmupCompleted = new getCacheokhttp();

    public static /* synthetic */ Drawable IAuthTabCallback(int i, RecomposerrunRecomposeAndApplyChanges2 recomposerrunRecomposeAndApplyChanges2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallback(i, recomposerrunRecomposeAndApplyChanges2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Drawable drawableOnExtraCallback = onExtraCallback(i, recomposerrunRecomposeAndApplyChanges2);
        int i4 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return drawableOnExtraCallback;
    }

    public static /* synthetic */ CarouselKtExternalSyntheticLambda8 IAuthTabCallback(Context context, AppLovinPostbackListener appLovinPostbackListener, Context context2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8 = (CarouselKtExternalSyntheticLambda8) onNavigationEvent(new Object[]{context, appLovinPostbackListener, context2}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1186212694, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1186212693, iOnWarmupCompleted2, iOnWarmupCompleted);
        int i4 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return carouselKtExternalSyntheticLambda8;
    }

    public static /* synthetic */ MovableContentKtExternalSyntheticLambda15 IAuthTabCallback() {
        MovableContentKtExternalSyntheticLambda15 movableContentKtExternalSyntheticLambda15OnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            movableContentKtExternalSyntheticLambda15OnNavigationEvent = onNavigationEvent();
            int i3 = 56 / 0;
        } else {
            movableContentKtExternalSyntheticLambda15OnNavigationEvent = onNavigationEvent();
        }
        int i4 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return movableContentKtExternalSyntheticLambda15OnNavigationEvent;
    }

    public static /* synthetic */ Call.Factory IAuthTabCallback(AppLovinPostbackListener appLovinPostbackListener, Interceptor interceptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Call.Factory factoryOnNavigationEvent = onNavigationEvent(appLovinPostbackListener, interceptor);
        int i4 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return factoryOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        Interceptor.Chain chain = (Interceptor.Chain) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Response responseOnWarmupCompleted = onWarmupCompleted(zBooleanValue, chain);
        int i4 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return responseOnWarmupCompleted;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (~((~i6) | i4)) | i2;
        int i8 = ~i2;
        int i9 = (~(i8 | i4)) | (~(i8 | i6)) | (~(i4 | i6));
        int i10 = (~(i6 | (~i4))) | i8;
        int i11 = i2 + i4 + i5 + ((-2137991558) * i3) + (111092868 * i);
        int i12 = i11 * i11;
        int i13 = (((-431794203) * i2) - 566755328) + (427185167 * i4) + (i7 * 1717982222) + (1717982222 * i9) + ((-1717982222) * i10) + ((-1290797056) * i5) + ((-1247805440) * i3) + ((-1807745024) * i) + ((-591921152) * i12);
        int i14 = (i2 * (-1469267343)) + 1003592187 + (i4 * (-1469268429)) + (i7 * (-362)) + (i9 * (-362)) + (i10 * 362) + (i5 * (-1469268067)) + (i3 * 1951436498) + (i * (-746069772)) + (i12 * (-1529348096));
        int i15 = i13 + (i14 * i14 * 1762131968);
        return i15 != 1 ? i15 != 2 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Response onNavigationEvent(Interceptor.Chain chain) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Response responseOnWarmupCompleted = onWarmupCompleted(chain);
        int i4 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return responseOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getCacheokhttp() {
    }

    static {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add("image/webp");
        listCreateListBuilder.add("*/*");
        onExtraCallback = CollectionsKt.joinToString$default(CollectionsKt.build(listCreateListBuilder), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        IAuthTabCallback = new Interceptor() { // from class: im.toss.tds.foundation.coil.CoilInitializer$$ExternalSyntheticLambda4
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Response intercept(Interceptor.Chain chain) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 63;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Response responseOnNavigationEvent = getCacheokhttp.onNavigationEvent(chain);
                int i4 = onWarmupCompleted + 75;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return responseOnNavigationEvent;
            }
        };
        int i = asInterface + 65;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (jLongValue < 1024) {
            return jLongValue + "B";
        }
        double d = jLongValue;
        int iLog = (int) (Math.log(d) / Math.log(1024.0d));
        if (iLog > 0) {
            int i3 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (iLog < 7) {
                String str = String.format("%.1f%sB", Arrays.copyOf(new Object[]{Double.valueOf(d / Math.pow(1024.0d, iLog)), Character.valueOf("KMGTPE".charAt(iLog - 1))}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "");
                return str;
            }
        }
        return jLongValue + "B";
    }

    private static final Response onWarmupCompleted(Interceptor.Chain chain) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(chain, "");
            chain.proceed(chain.request().newBuilder().header("Accept", onExtraCallback).build());
            throw null;
        }
        Intrinsics.checkNotNullParameter(chain, "");
        Response responseProceed = chain.proceed(chain.request().newBuilder().header("Accept", onExtraCallback).build());
        int i3 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return responseProceed;
    }

    private final int onNavigationEvent(Context context) {
        int i = 2 % 2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setTo(context.getResources().getDisplayMetrics());
        try {
            DisplayManager displayManager = (DisplayManager) ContextCompat.getSystemService(context, DisplayManager.class);
            if (displayManager != null) {
                int i2 = onExtraCallbackWithResult + 119;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Display display = displayManager.getDisplay(0);
                if (display != null) {
                    display.getRealMetrics(displayMetrics);
                    int i4 = onNavigationEvent + 53;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        } catch (Exception unused) {
        }
        return Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public final void onExtraCallback(@NotNull final AppLovinPostbackListener appLovinPostbackListener) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinPostbackListener, "");
        final Context contextOnExtraCallback = appLovinPostbackListener.onExtraCallback();
        CarouselKtCarousel4ExternalSyntheticLambda0.onWarmupCompleted(new CarouselKtCarousel4ExternalSyntheticLambda0.IAuthTabCallback() { // from class: im.toss.tds.foundation.coil.CoilInitializer$$ExternalSyntheticLambda5
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final CarouselKtExternalSyntheticLambda8 newImageLoader(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 25;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Context context2 = contextOnExtraCallback;
                if (i4 != 0) {
                    return getCacheokhttp.IAuthTabCallback(context2, appLovinPostbackListener, context);
                }
                getCacheokhttp.IAuthTabCallback(context2, appLovinPostbackListener, context);
                throw null;
            }
        });
        int i2 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[PHI: r4
      0x004b: PHI (r4v7 java.lang.Long) = (r4v6 java.lang.Long), (r4v8 java.lang.Long) binds: [B:14:0x0049, B:11:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Response onWarmupCompleted(boolean z, Interceptor.Chain chain) {
        long jLongValue;
        String str;
        Long longOrNull;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(chain, "");
        Response responseProceed = chain.proceed(chain.request());
        if (z && Log.isLoggable("CoilImageBytes", 3)) {
            String strHeader$default = Response.header$default(responseProceed, "Content-Length", (String) null, 2, (Object) null);
            if (strHeader$default != null) {
                int i4 = onNavigationEvent + 93;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    longOrNull = StringsKt.toLongOrNull(strHeader$default);
                    int i5 = 75 / 0;
                    jLongValue = longOrNull != null ? longOrNull.longValue() : -1L;
                } else {
                    longOrNull = StringsKt.toLongOrNull(strHeader$default);
                    if (longOrNull != null) {
                    }
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Locale locale = Locale.US;
                String str2 = jLongValue >= 1048576 ? "[!]" : "   ";
                if (jLongValue < 0) {
                    int i6 = onExtraCallbackWithResult + 29;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    str = "?";
                } else {
                    Object[] objArr = {onWarmupCompleted, Long.valueOf(jLongValue)};
                    int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
                    str = (String) onNavigationEvent(objArr, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1543161132, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1543161132, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted);
                }
                Intrinsics.checkNotNullExpressionValue(String.format(locale, "%s %9s %-10s url=%s", Arrays.copyOf(new Object[]{str2, str, Response.header$default(responseProceed, "Content-Type", (String) null, 2, (Object) null), chain.request().url()}, 4)), "");
                int i8 = onExtraCallbackWithResult + 67;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 4 % 3;
                }
            }
        }
        int i10 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 17 / 0;
        }
        return responseProceed;
    }

    private static final Drawable onExtraCallback(int i, RecomposerrunRecomposeAndApplyChanges2 recomposerrunRecomposeAndApplyChanges2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(recomposerrunRecomposeAndApplyChanges2, "");
        Drawable drawable = ContextCompat.getDrawable(recomposerrunRecomposeAndApplyChanges2.onExtraCallbackWithResult(), i);
        int i5 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return drawable;
    }

    private static final Call.Factory onNavigationEvent(AppLovinPostbackListener appLovinPostbackListener, Interceptor interceptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        OkHttpClient.Builder builderIAuthTabCallback = appLovinPostbackListener.onTransact().IAuthTabCallback();
        builderIAuthTabCallback.addInterceptor(IAuthTabCallback);
        builderIAuthTabCallback.addInterceptor(interceptor);
        okhttp3.OkHttpClient okHttpClientBuild = builderIAuthTabCallback.build();
        int i4 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return okHttpClientBuild;
    }

    private static final MovableContentKtExternalSyntheticLambda15 onNavigationEvent() {
        int i = 2 % 2;
        Object obj = null;
        RecomposeScope recomposeScope = new RecomposeScope((Function0) null, 1, (DefaultConstructorMarker) null);
        int i2 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return recomposeScope;
        }
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback extends CarouselKtExternalSyntheticLambda2 {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ boolean IAuthTabCallback;
        final /* synthetic */ Context onExtraCallback;

        onExtraCallback(boolean z, Context context) {
            this.IAuthTabCallback = z;
            this.onExtraCallback = context;
        }

        public void onNavigationEvent(RecomposerawaitIdle2 recomposerawaitIdle2, RecomposerKt recomposerKt) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(recomposerawaitIdle2, "");
            Intrinsics.checkNotNullParameter(recomposerKt, "");
            if (this.IAuthTabCallback) {
                int i2 = onExtraCallbackWithResult + 35;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                if (Log.isLoggable("CoilImage", 3)) {
                    int i4 = onWarmupCompleted + 69;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult = recomposerKt.onExtraCallbackWithResult();
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    Locale locale = Locale.US;
                    int iOnExtraCallbackWithResult = carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult.onExtraCallbackWithResult();
                    int iOnWarmupCompleted = carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult.onWarmupCompleted();
                    long jOnExtraCallback = carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult.onExtraCallback() / 1024;
                    Intrinsics.checkNotNullExpressionValue(String.format(locale, "w=%4d, h=%4d, mem=%,5dKB, source=%s, url=%s", Arrays.copyOf(new Object[]{Integer.valueOf(iOnExtraCallbackWithResult), Integer.valueOf(iOnWarmupCompleted), Long.valueOf(jOnExtraCallback), recomposerKt.onNavigationEvent(), recomposerawaitIdle2.onExtraCallbackWithResult()}, 5)), "");
                }
            }
            CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult2 = recomposerKt.onExtraCallbackWithResult();
            Resources resources = this.onExtraCallback.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Drawable drawableOnWarmupCompleted = CarouselPagerStateExternalSyntheticLambda1.onWarmupCompleted(carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult2, resources);
            if (drawableOnWarmupCompleted instanceof createLayoutState) {
                final WeakReference weakReference = new WeakReference(drawableOnWarmupCompleted);
                TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9IAuthTabCallback = Recomposerjoin2.IAuthTabCallback(recomposerawaitIdle2);
                if (textFieldKeyInputExternalSyntheticLambda9IAuthTabCallback != null) {
                    textFieldKeyInputExternalSyntheticLambda9IAuthTabCallback.IAuthTabCallback(new DefaultLifecycleObserver() { // from class: im.toss.tds.foundation.coil.CoilInitializer$initialize$1$1$onSuccess$1
                        private static int onNavigationEvent = 0;
                        private static int onWarmupCompleted = 1;

                        public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                            int i6 = 2 % 2;
                            int i7 = onWarmupCompleted + 89;
                            onNavigationEvent = i7 % 128;
                            int i8 = i7 % 2;
                            super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
                            if (i8 != 0) {
                                throw null;
                            }
                            int i9 = onNavigationEvent + 17;
                            onWarmupCompleted = i9 % 128;
                            int i10 = i9 % 2;
                        }

                        public /* bridge */ void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                            int i6 = 2 % 2;
                            int i7 = onWarmupCompleted + 39;
                            onNavigationEvent = i7 % 128;
                            int i8 = i7 % 2;
                            super.onPause(textFieldScrollKtExternalSyntheticLambda0);
                            int i9 = onWarmupCompleted + 41;
                            onNavigationEvent = i9 % 128;
                            int i10 = i9 % 2;
                        }

                        public /* bridge */ void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                            int i6 = 2 % 2;
                            int i7 = onNavigationEvent + 11;
                            onWarmupCompleted = i7 % 128;
                            int i8 = i7 % 2;
                            super.onResume(textFieldScrollKtExternalSyntheticLambda0);
                            int i9 = onWarmupCompleted + 13;
                            onNavigationEvent = i9 % 128;
                            int i10 = i9 % 2;
                        }

                        public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                            int i6 = 2 % 2;
                            int i7 = onNavigationEvent + 13;
                            onWarmupCompleted = i7 % 128;
                            int i8 = i7 % 2;
                            super.onStart(textFieldScrollKtExternalSyntheticLambda0);
                            int i9 = onWarmupCompleted + 81;
                            onNavigationEvent = i9 % 128;
                            int i10 = i9 % 2;
                        }

                        public /* bridge */ void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                            int i6 = 2 % 2;
                            int i7 = onWarmupCompleted + 29;
                            onNavigationEvent = i7 % 128;
                            int i8 = i7 % 2;
                            super.onStop(textFieldScrollKtExternalSyntheticLambda0);
                            if (i8 == 0) {
                                return;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }

                        public void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                            int i6 = 2 % 2;
                            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                            createLayoutState createlayoutstate = weakReference.get();
                            if (createlayoutstate != null) {
                                createlayoutstate.IAuthTabCallback();
                                int i7 = onNavigationEvent + 7;
                                onWarmupCompleted = i7 % 128;
                                int i8 = i7 % 2;
                            }
                            textFieldScrollKtExternalSyntheticLambda0.getLifecycle().onExtraCallbackWithResult(this);
                            int i9 = onNavigationEvent + 67;
                            onWarmupCompleted = i9 % 128;
                            int i10 = i9 % 2;
                        }
                    });
                    int i6 = onWarmupCompleted + 69;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        final boolean z;
        Context context = (Context) objArr[0];
        final AppLovinPostbackListener appLovinPostbackListener = (AppLovinPostbackListener) objArr[1];
        Context context2 = (Context) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context2, "");
            if ((context.getApplicationInfo().flags & 2) != 0) {
                int i3 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(context2, "");
            if ((context.getApplicationInfo().flags & 2) != 0) {
            }
        }
        final Interceptor interceptor = new Interceptor() { // from class: im.toss.tds.foundation.coil.CoilInitializer$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Response intercept(Interceptor.Chain chain) {
                Response response;
                int i5 = 2 % 2;
                int i6 = onExtraCallbackWithResult + 15;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    Object[] objArr2 = {Boolean.valueOf(z), chain};
                    int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
                    int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
                    response = (Response) getCacheokhttp.onNavigationEvent(objArr2, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1689902775, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1689902773, iOnWarmupCompleted2, iOnWarmupCompleted);
                    int i7 = 13 / 0;
                } else {
                    Object[] objArr3 = {Boolean.valueOf(z), chain};
                    int iOnWarmupCompleted3 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
                    int iOnWarmupCompleted4 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
                    response = (Response) getCacheokhttp.onNavigationEvent(objArr3, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1689902775, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1689902773, iOnWarmupCompleted4, iOnWarmupCompleted3);
                }
                int i8 = onExtraCallbackWithResult + 63;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                return response;
            }
        };
        CarouselKtExternalSyntheticLambda14.onNavigationEvent onnavigationevent = new CarouselKtExternalSyntheticLambda14.onNavigationEvent();
        onnavigationevent.onExtraCallbackWithResult(new LinkComposerExternalSyntheticLambda5() { // from class: im.toss.tds.foundation.coil.CoilInitializer$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object map(Object obj, RecomposerrunRecomposeAndApplyChanges2 recomposerrunRecomposeAndApplyChanges2) {
                int i5 = 2 % 2;
                int i6 = IAuthTabCallback + 57;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                int iIntValue = ((Integer) obj).intValue();
                if (i7 == 0) {
                    return getCacheokhttp.IAuthTabCallback(iIntValue, recomposerrunRecomposeAndApplyChanges2);
                }
                getCacheokhttp.IAuthTabCallback(iIntValue, recomposerrunRecomposeAndApplyChanges2);
                throw null;
            }
        }, Reflection.getOrCreateKotlinClass(Integer.class));
        onnavigationevent.IAuthTabCallback(new directory.onNavigationEvent());
        if (Build.VERSION.SDK_INT >= 28) {
            onnavigationevent.IAuthTabCallback(new BroadcastFrameClockExternalSyntheticLambda0.onWarmupCompleted(false, 1, (DefaultConstructorMarker) null));
        } else {
            onnavigationevent.IAuthTabCallback(new CompositionLocalKtExternalSyntheticLambda1.onNavigationEvent(false, 1, (DefaultConstructorMarker) null));
        }
        onnavigationevent.onExtraCallback(RecomposerExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.tds.foundation.coil.CoilInitializer$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i5 = 2 % 2;
                int i6 = onWarmupCompleted + 1;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                Call.Factory factoryIAuthTabCallback = getCacheokhttp.IAuthTabCallback(appLovinPostbackListener, interceptor);
                int i8 = onWarmupCompleted + 105;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 32 / 0;
                }
                return factoryIAuthTabCallback;
            }
        }, new Function0() { // from class: im.toss.tds.foundation.coil.CoilInitializer$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                MovableContentKtExternalSyntheticLambda15 movableContentKtExternalSyntheticLambda15IAuthTabCallback;
                int i5 = 2 % 2;
                int i6 = onNavigationEvent + 113;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    movableContentKtExternalSyntheticLambda15IAuthTabCallback = getCacheokhttp.IAuthTabCallback();
                    int i7 = 42 / 0;
                } else {
                    movableContentKtExternalSyntheticLambda15IAuthTabCallback = getCacheokhttp.IAuthTabCallback();
                }
                int i8 = onNavigationEvent + 99;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                return movableContentKtExternalSyntheticLambda15IAuthTabCallback;
            }
        }), Reflection.getOrCreateKotlinClass(CarouselStateanimateScrollToItem21ExternalSyntheticLambda0.class));
        appLovinPostbackListener.IAuthTabCallback().onNavigationEvent().invoke(onnavigationevent);
        CarouselKtExternalSyntheticLambda14 carouselKtExternalSyntheticLambda14OnNavigationEvent = onnavigationevent.onNavigationEvent();
        int iOnNavigationEvent = RecordingApplier.onNavigationEvent(onWarmupCompleted.onNavigationEvent(context));
        return Recomposerjoin2.onNavigationEvent(CarouselKtCarousel2ExternalSyntheticLambda0.onExtraCallbackWithResult(RecomposerrecompositionRunner2.onExtraCallback(new CarouselKtExternalSyntheticLambda8.IAuthTabCallback(context).onWarmupCompleted(carouselKtExternalSyntheticLambda14OnNavigationEvent), new RememberObserverHolder(RecomposerKtwithRunningRecomposer21.onNavigationEvent.onWarmupCompleted(iOnNavigationEvent), RecomposerKtwithRunningRecomposer21.onNavigationEvent.onWarmupCompleted(iOnNavigationEvent))), TextFieldImplKtCommonDecorationBox3decoratedPlaceholder1ExternalSyntheticLambda0.onExtraCallback), false).onWarmupCompleted(new onExtraCallback(z, context)).onNavigationEvent();
    }

    public static /* synthetic */ Response onExtraCallback(boolean z, Interceptor.Chain chain) {
        Object[] objArr = {Boolean.valueOf(z), chain};
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return (Response) onNavigationEvent(objArr, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1689902775, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1689902773, iOnWarmupCompleted2, iOnWarmupCompleted);
    }

    private static final CarouselKtExternalSyntheticLambda8 onExtraCallbackWithResult(Context context, AppLovinPostbackListener appLovinPostbackListener, Context context2) {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return (CarouselKtExternalSyntheticLambda8) onNavigationEvent(new Object[]{context, appLovinPostbackListener, context2}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1186212694, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1186212693, iOnWarmupCompleted2, iOnWarmupCompleted);
    }

    private final String onWarmupCompleted(long j) {
        Object[] objArr = {this, Long.valueOf(j)};
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return (String) onNavigationEvent(objArr, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1543161132, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1543161132, iOnWarmupCompleted2, iOnWarmupCompleted);
    }
}
