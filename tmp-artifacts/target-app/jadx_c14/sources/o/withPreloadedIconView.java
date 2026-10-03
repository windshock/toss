package o;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import j$.time.ZoneId;
import java.lang.reflect.Method;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import o.wie2;
import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class withPreloadedIconView implements Interceptor {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private static char onExtraCallback = 32091;
    private static char onExtraCallbackWithResult = 10610;
    private static char onNavigationEvent = 42440;
    private static char onWarmupCompleted = 33666;

    public Response intercept(@NotNull Interceptor.Chain chain) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(chain, "");
        Response responseProceed = chain.proceed(onExtraCallbackWithResult(chain.request()));
        int i4 = asBinder + 43;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return responseProceed;
    }

    private final Request onExtraCallbackWithResult(Request request) throws Throwable {
        JsonElement jsonElementIAuthTabCallback;
        int i = 2 % 2;
        Request.Builder builderNewBuilder = request.newBuilder();
        RequestBody requestBodyBody = request.body();
        if (requestBodyBody != null) {
            if (requestBodyBody.contentLength() > 0) {
                if (!(requestBodyBody instanceof FormBody)) {
                    requestBodyBody = null;
                } else {
                    int i2 = asBinder + 113;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                }
            }
            if (requestBodyBody != null && (jsonElementIAuthTabCallback = IAuthTabCallback(requestBodyBody)) != null) {
                TTBaseActivity tTBaseActivity = new TTBaseActivity();
                try {
                    wie2.IAuthTabCallback iAuthTabCallback = wie2.Default;
                    iAuthTabCallback.onExtraCallback();
                    HomeWatcherReceiver.IAuthTabCallback(iAuthTabCallback, JsonElement.Companion.serializer(), jsonElementIAuthTabCallback, tTBaseActivity);
                    builderNewBuilder.method(request.method(), RequestBody.Companion.create(tTBaseActivity.writeTypedObject(), gc.onWarmupCompleted.onWarmupCompleted()));
                    CloseableKt.closeFinally(tTBaseActivity, (Throwable) null);
                } finally {
                }
            }
        }
        Object[] objArr = new Object[1];
        a(new char[]{25813, 20367, 10589, 43286, 35192, 16915, 62750, 25660, 9835, 21595}, 10 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
        builderNewBuilder.addHeader(((String) objArr[0]).intern(), zzaj.onNavigationEvent().access100());
        Object[] objArr2 = new Object[1];
        a(new char[]{22958, 46639, 8920, 23376, 24058, 4529, 41891, 13836, 49810, 41685, 4662, 23296, 19464, 29172}, 13 - TextUtils.getOffsetAfter("", 0), objArr2);
        builderNewBuilder.addHeader(((String) objArr2[0]).intern(), getStartTimeMillis.Companion.onExtraCallback().onExtraCallback());
        String id = ZoneId.systemDefault().getId();
        Intrinsics.checkNotNullExpressionValue(id, "");
        Object[] objArr3 = new Object[1];
        a(new char[]{22958, 46639, 8920, 23376, 24058, 4529, 8566, 57386, 59789, 6434}, 9 - (ViewConfiguration.getScrollBarSize() >> 8), objArr3);
        builderNewBuilder.addHeader(((String) objArr3[0]).intern(), id);
        Resources resourcesOnExtraCallback = followRedirects.onExtraCallbackWithResult.onExtraCallback();
        if (resourcesOnExtraCallback != null && generateLink.IAuthTabCallback(resourcesOnExtraCallback)) {
            int i4 = IAuthTabCallback + 17;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr4 = new Object[1];
            a(new char[]{22958, 46639, 8920, 23376, 24058, 4529, 53474, 49251, 16966, 39686, 28051, 3868, 62692, 12989, 9415, 318, 35855, 50965, 9415, 318, 61443, 43523, 19464, 29172}, 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
            String strIntern = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            a(new char[]{45322, 58255, 45699, 26411}, 5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr5);
            builderNewBuilder.addHeader(strIntern, ((String) objArr5[0]).intern());
            int i6 = asBinder + 119;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 3;
            }
        }
        Request requestBuild = builderNewBuilder.build();
        int i8 = IAuthTabCallback + 77;
        asBinder = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 53 / 0;
        }
        return requestBuild;
    }

    private final JsonElement IAuthTabCallback(RequestBody requestBody) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            if (!(requestBody instanceof FormBody)) {
                return JsonNull.INSTANCE;
            }
            PangleEncryptManager pangleEncryptManager = new PangleEncryptManager();
            FormBody formBody = (FormBody) requestBody;
            int size = formBody.size();
            for (int i3 = 0; i3 < size; i3++) {
                dynamicTrack.onExtraCallback(pangleEncryptManager, formBody.name(i3), formBody.value(i3));
            }
            JsonObject jsonObjectOnExtraCallbackWithResult = pangleEncryptManager.onExtraCallbackWithResult();
            int i4 = IAuthTabCallback + 101;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return jsonObjectOnExtraCallbackWithResult;
        }
        boolean z = requestBody instanceof FormBody;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 25;
            $10 = i4 % 128;
            int i5 = 58224;
            if (i4 % 2 != 0) {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            } else {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i6 = i3;
            while (i6 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i7 = (c2 + i5) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i8 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i8);
                    objArr2[1] = Integer.valueOf(i7);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(i3, i3);
                        int scrollBarFadeDuration = 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int i9 = 12435 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMakeMeasureSpec, scrollBarFadeDuration, i9, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 10 - View.MeasureSpec.makeMeasureSpec(0, 0), 12434 - (Process.myPid() >> 22), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    int i10 = $10 + 19;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 16014), 14 - Color.red(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i12 = $11 + 21;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
