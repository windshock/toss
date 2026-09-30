package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.components.tuba.variable.v1.model.CdnVar;
import im.toss.components.tuba.variable.v1.model.CdnVars;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.AUTextView;
import o.RealViewSizeResolver;
import o.adInfo;
import okhttp3.Headers;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.HttpException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealViewSizeResolver implements RequestService_androidKt {
    private final ViewTargetRequestDelegate onExtraCallbackWithResult;
    private static final byte[] $$a = {0, Byte.MIN_VALUE, 34, -14, 68};
    private static final int $$b = 1;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static char[] IAuthTabCallback = {27250, 27348, 27276, 27271, 27271, 27269, 27267, 27273, 27274, 27276, 27379, 27381, 27377, 27275, 27345, 27373, 27268, 27374, 27186, 27371, 27274, 27275, 27267, 27268, 27276, 27345, 27186, 27348, 27378, 27376, 27277, 27271, 27274, 27349, 27186, 27375, 27274, 27269, 27269, 27272, 27279, 27345, 27186, 27370, 27271, 27273, 27273, 27198, 27302, 27320, 27470, 27466, 27471, 27325, 27316, 27326, 27297, 27321, 27470, 27297, 27250, 27169, 27174, 27352, 27489, 27488, 27492, 27466, 27313, 27496, 27497, 27490};
    private static long onNavigationEvent = 6528555395945443097L;
    private static int onExtraCallback = -1776194565;
    private static char onWarmupCompleted = 27643;

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = RealViewSizeResolver.this.onNavigationEvent(null, this);
            int i4 = onNavigationEvent + 37;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, short s2) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = (b * 3) + 5;
        int i4 = s2 * 3;
        ?? r7 = s + 109;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            byte b2 = r7;
            i = 0;
            int i5 = i3;
            i3++;
            i2 = i5 + (-b2);
            int i6 = i2;
            int i7 = i3;
            bArr2[i] = (byte) i6;
            if (i == i4) {
                return new String(bArr2, 0);
            }
            i++;
            b2 = bArr[i7];
            i5 = i6;
            i3 = i7;
            i3++;
            i2 = i5 + (-b2);
            int i62 = i2;
            int i72 = i3;
            bArr2[i] = (byte) i62;
            if (i == i4) {
            }
        } else {
            i = 0;
            i2 = r7;
            int i622 = i2;
            int i722 = i3;
            bArr2[i] = (byte) i622;
            if (i == i4) {
            }
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(adinfo);
        int i4 = asInterface + 89;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    @Inject
    public RealViewSizeResolver(@NotNull ViewTargetRequestDelegate viewTargetRequestDelegate) {
        Intrinsics.checkNotNullParameter(viewTargetRequestDelegate, "");
        this.onExtraCallbackWithResult = viewTargetRequestDelegate;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0216 A[PHI: r10 r13
      0x0216: PHI (r10v14 kotlinx.serialization.json.JsonPrimitive) = (r10v13 kotlinx.serialization.json.JsonPrimitive), (r10v21 kotlinx.serialization.json.JsonPrimitive) binds: [B:71:0x0214, B:68:0x01fb] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r13v4 java.lang.String) = (r13v3 java.lang.String), (r13v8 java.lang.String) binds: [B:71:0x0214, B:68:0x01fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0291 A[PHI: r10 r13
      0x0291: PHI (r10v16 kotlinx.serialization.json.JsonPrimitive) = 
      (r10v13 kotlinx.serialization.json.JsonPrimitive)
      (r10v14 kotlinx.serialization.json.JsonPrimitive)
      (r10v21 kotlinx.serialization.json.JsonPrimitive)
     binds: [B:71:0x0214, B:91:0x027d, B:68:0x01fb] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r13v6 java.lang.String) = (r13v3 java.lang.String), (r13v4 java.lang.String), (r13v8 java.lang.String) binds: [B:71:0x0214, B:91:0x027d, B:68:0x01fb] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.RequestService_androidKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onNavigationEvent(@Nullable String str, @NotNull access13800<? super CdnVars> access13800Var) throws Throwable {
        onExtraCallback onextracallback;
        String str2;
        String strString;
        JsonArray jsonArrayOnWarmupCompleted;
        JsonArray jsonArrayOnWarmupCompleted2;
        List listEmptyList;
        String str3;
        JsonPrimitive jsonPrimitiveOnNavigationEvent;
        Object next;
        CdnVar.VersionConstraints versionConstraints;
        String strOnWarmupCompleted;
        JsonPrimitive jsonPrimitiveOnNavigationEvent2;
        CdnVar.VersionConstraints versionConstraints2;
        Object next2;
        String strOnWarmupCompleted2;
        JsonPrimitive jsonPrimitiveOnNavigationEvent3;
        int i = 2;
        int i2 = 2 % 2;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i3 = onextracallback.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i3 - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object objIAuthTabCallback = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = onextracallback.label;
        int i5 = 0;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            ViewTargetRequestDelegate viewTargetRequestDelegate = this.onExtraCallbackWithResult;
            onextracallback.L$0 = str;
            onextracallback.label = 1;
            objIAuthTabCallback = viewTargetRequestDelegate.IAuthTabCallback(onextracallback);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            str2 = str;
        } else {
            if (i4 != 1) {
                Object[] objArr = new Object[1];
                a(new int[]{0, 47, 89, 10}, false, new byte[]{1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0}, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i6 = IAuthTabCallbackStub + 93;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            str2 = (String) onextracallback.L$0;
            ResultKt.onNavigationEvent(objIAuthTabCallback);
        }
        retrofit2.Response response = (retrofit2.Response) objIAuthTabCallback;
        if (!response.onExtraCallbackWithResult()) {
            throw new HttpException(response);
        }
        boolean z = response.IAuthTabCallbackStub().cacheResponse() != null;
        Headers headersIAuthTabCallback = response.IAuthTabCallback();
        Object[] objArr2 = new Object[1];
        a(new int[]{47, 4, 156, 0}, false, new byte[]{1, 1, 1, 0}, objArr2);
        String str4 = headersIAuthTabCallback.get(((String) objArr2[0]).intern());
        if (str4 == null) {
            Object[] objArr3 = new Object[1];
            b(ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) Color.blue(0), new char[]{5078, 4459, 27625, 61359, 62467, 17660, 54932, 44725, 1224, 21256, 29362, 37445, 11276, 57428, 54509, 41672, 20406, 192, 37792, 55721, 31647, 39790, 30980, 64888}, new char[]{348, 42908, 5716, 32129}, new char[]{50402, 25064, 6844, 13984}, objArr3);
            throw new IllegalStateException(((String) objArr3[0]).intern());
        }
        if (!(!z) && str2 != null && str2.length() != 0 && Intrinsics.areEqual(str4, str2)) {
            return new CdnVars(str4, null);
        }
        wie2 wie2VarOnWarmupCompleted = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.components.tuba.variable.v1.remote.TubaVariableRemoteDataSourceImpl$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = onWarmupCompleted + 109;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                Unit unitIAuthTabCallback = RealViewSizeResolver.IAuthTabCallback((adInfo) obj);
                int i11 = IAuthTabCallback + 73;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                return unitIAuthTabCallback;
            }
        }, 1, (Object) null);
        ResponseBody responseBody = (ResponseBody) response.onExtraCallback();
        if (responseBody == null || (strString = responseBody.string()) == null) {
            Object[] objArr4 = new Object[1];
            a(new int[]{63, 9, 190, 0}, false, new byte[]{0, 1, 1, 0, 0, 0, 1, 1, 1}, objArr4);
            throw new IOException(((String) objArr4[0]).intern());
        }
        JsonObject jsonObjectOnExtraCallbackWithResult = initRenderFinish.onExtraCallbackWithResult(wie2VarOnWarmupCompleted.onExtraCallback(strString));
        Object[] objArr5 = new Object[1];
        a(new int[]{51, 9, 142, 1}, true, null, objArr5);
        JsonElement jsonElement = (JsonElement) jsonObjectOnExtraCallbackWithResult.get(((String) objArr5[0]).intern());
        JsonObject jsonObjectOnExtraCallbackWithResult2 = jsonElement != null ? initRenderFinish.onExtraCallbackWithResult(jsonElement) : null;
        Object[] objArr6 = new Object[1];
        b((ViewConfiguration.getJumpTapTimeout() >> 16) - 606495109, (char) (KeyEvent.getDeadChar(0, 0) + 15315), new char[]{37532, 61761, 27765, 33628, 51116, 14882, 63441, 62215, 8389, 52210, 1403, 45556, 26257, 46836, 36941, 52897, 21095}, new char[]{31683, 55710, 54235, 37947}, new char[]{50402, 25064, 6844, 13984}, objArr6);
        JsonElement jsonElement2 = (JsonElement) jsonObjectOnExtraCallbackWithResult.get(((String) objArr6[0]).intern());
        if (jsonElement2 != null) {
            jsonArrayOnWarmupCompleted = initRenderFinish.onWarmupCompleted(jsonElement2);
            int i8 = IAuthTabCallbackStub + 27;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
        } else {
            jsonArrayOnWarmupCompleted = null;
        }
        Object[] objArr7 = new Object[1];
        b((-556937480) - Color.red(0), (char) (34201 - (KeyEvent.getMaxKeyCode() >> 16)), new char[]{32247, 35135, 47474, 19795, 32879, 49332, 14376, 12156, 45934, 2342, 9823, 35673, 59970, 9563, 48586, 8776, 47456}, new char[]{63617, 52686, 39390, 12933}, new char[]{50402, 25064, 6844, 13984}, objArr7);
        JsonElement jsonElement3 = (JsonElement) jsonObjectOnExtraCallbackWithResult.get(((String) objArr7[0]).intern());
        if (jsonElement3 != null) {
            int i10 = IAuthTabCallbackStub + 29;
            asInterface = i10 % 128;
            if (i10 % 2 == 0) {
                initRenderFinish.onWarmupCompleted(jsonElement3);
                throw null;
            }
            jsonArrayOnWarmupCompleted2 = initRenderFinish.onWarmupCompleted(jsonElement3);
        } else {
            jsonArrayOnWarmupCompleted2 = null;
        }
        if (jsonObjectOnExtraCallbackWithResult2 != null) {
            int i11 = IAuthTabCallbackStub + 19;
            asInterface = i11 % 128;
            if (i11 % 2 == 0) {
                jsonObjectOnExtraCallbackWithResult2.entrySet();
                throw null;
            }
            Set setEntrySet = jsonObjectOnExtraCallbackWithResult2.entrySet();
            if (setEntrySet != null) {
                Set set = setEntrySet;
                listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int i12 = IAuthTabCallbackStub + 85;
                    asInterface = i12 % 128;
                    int i13 = 60;
                    int i14 = 3;
                    if (i12 % i == 0) {
                        Map.Entry entry = (Map.Entry) it.next();
                        str3 = (String) entry.getKey();
                        jsonPrimitiveOnNavigationEvent = initRenderFinish.onNavigationEvent((JsonElement) entry.getValue());
                        int i15 = 85 / i5;
                        if (jsonArrayOnWarmupCompleted != null) {
                            Iterator it2 = jsonArrayOnWarmupCompleted.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                JsonObject jsonObjectOnExtraCallbackWithResult3 = initRenderFinish.onExtraCallbackWithResult((JsonElement) next);
                                int[] iArr = {i13, i14, i5, i14};
                                byte[] bArr = new byte[i14];
                                // fill-array-data instruction
                                bArr[0] = 1;
                                bArr[1] = 0;
                                bArr[2] = 0;
                                Object[] objArr8 = new Object[1];
                                a(iArr, true, bArr, objArr8);
                                JsonElement jsonElement4 = (JsonElement) jsonObjectOnExtraCallbackWithResult3.get(((String) objArr8[0]).intern());
                                if (jsonElement4 == null || (jsonPrimitiveOnNavigationEvent2 = initRenderFinish.onNavigationEvent(jsonElement4)) == null) {
                                    strOnWarmupCompleted = null;
                                } else {
                                    int i16 = IAuthTabCallbackStub + 107;
                                    asInterface = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        jsonPrimitiveOnNavigationEvent2.onWarmupCompleted();
                                        Object obj = null;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    strOnWarmupCompleted = jsonPrimitiveOnNavigationEvent2.onWarmupCompleted();
                                }
                                if (Intrinsics.areEqual(strOnWarmupCompleted, str3)) {
                                    break;
                                }
                                i5 = 0;
                                i13 = 60;
                                i14 = 3;
                            }
                            JsonElement jsonElement5 = (JsonElement) next;
                            if (jsonElement5 != null) {
                                wie2VarOnWarmupCompleted.onExtraCallback();
                                versionConstraints = (CdnVar.VersionConstraints) wie2VarOnWarmupCompleted.onExtraCallbackWithResult(CdnVar.VersionConstraints.Companion.serializer(), jsonElement5);
                            } else {
                                versionConstraints = null;
                            }
                        }
                    } else {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        str3 = (String) entry2.getKey();
                        jsonPrimitiveOnNavigationEvent = initRenderFinish.onNavigationEvent((JsonElement) entry2.getValue());
                        if (jsonArrayOnWarmupCompleted != null) {
                        }
                    }
                    if (jsonArrayOnWarmupCompleted2 != null) {
                        Iterator it3 = jsonArrayOnWarmupCompleted2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it3.next();
                            JsonObject jsonObjectOnExtraCallbackWithResult4 = initRenderFinish.onExtraCallbackWithResult((JsonElement) next2);
                            Object[] objArr9 = new Object[1];
                            a(new int[]{60, 3, 0, 3}, true, new byte[]{1, 0, 0}, objArr9);
                            JsonElement jsonElement6 = (JsonElement) jsonObjectOnExtraCallbackWithResult4.get(((String) objArr9[0]).intern());
                            if (jsonElement6 == null || (jsonPrimitiveOnNavigationEvent3 = initRenderFinish.onNavigationEvent(jsonElement6)) == null) {
                                strOnWarmupCompleted2 = null;
                            } else {
                                int i17 = IAuthTabCallbackStub + 11;
                                asInterface = i17 % 128;
                                if (i17 % 2 == 0) {
                                    jsonPrimitiveOnNavigationEvent3.onWarmupCompleted();
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                strOnWarmupCompleted2 = jsonPrimitiveOnNavigationEvent3.onWarmupCompleted();
                            }
                            if (Intrinsics.areEqual(strOnWarmupCompleted2, str3)) {
                                int i18 = IAuthTabCallbackStub + 107;
                                asInterface = i18 % 128;
                                if (i18 % 2 == 0) {
                                    throw null;
                                }
                            }
                        }
                        JsonElement jsonElement7 = (JsonElement) next2;
                        if (jsonElement7 != null) {
                            int i19 = IAuthTabCallbackStub + 69;
                            asInterface = i19 % 128;
                            int i20 = i19 % 2;
                            wie2VarOnWarmupCompleted.onExtraCallback();
                            versionConstraints2 = (CdnVar.VersionConstraints) wie2VarOnWarmupCompleted.onExtraCallbackWithResult(CdnVar.VersionConstraints.Companion.serializer(), jsonElement7);
                        } else {
                            versionConstraints2 = null;
                        }
                    }
                    listEmptyList.add(new CdnVar(str3, jsonPrimitiveOnNavigationEvent, versionConstraints, versionConstraints2));
                    i = 2;
                    i5 = 0;
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
        }
        CdnVars cdnVars = new CdnVars(str4, listEmptyList);
        int i21 = asInterface + 39;
        IAuthTabCallbackStub = i21 % 128;
        if (i21 % 2 != 0) {
            int i22 = 81 / 0;
        }
        return cdnVars;
    }

    private static final Unit onExtraCallback(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(adinfo, "");
            adinfo.IAuthTabCallbackDefault(false);
            adinfo.IAuthTabCallback(false);
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 186882589, new Object[]{adinfo, false}, iOnExtraCallback2, iOnExtraCallback);
            adinfo.onExtraCallbackWithResult(false);
        } else {
            Intrinsics.checkNotNullParameter(adinfo, "");
            adinfo.IAuthTabCallbackDefault(true);
            adinfo.IAuthTabCallback(true);
            int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback4 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 186882589, new Object[]{adinfo, true}, iOnExtraCallback4, iOnExtraCallback3);
            adinfo.onExtraCallbackWithResult(true);
        }
        return Unit.INSTANCE;
    }

    private static void b(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $11 + 79;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $11 + 37;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", i3);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 44;
                    int iCombineMeasuredStates = View.combineMeasuredStates(i3, i3) + 1451;
                    byte b = $$a[i3];
                    String str$$c = $$c(b, (byte) $$b, b);
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(offsetAfter, packedPositionChild, iCombineMeasuredStates, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char cResolveSizeAndState = (char) (49123 - View.resolveSizeAndState(i3, i3, i3));
                    int i8 = 45 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3) + 1494;
                    byte b2 = $$a[i3];
                    byte b3 = b2;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveSizeAndState, i8, iMakeMeasureSpec, 1533236389, false, $$c(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23971), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 50, 22938 - MotionEvent.axisFromString(""), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    c2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 45848), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 28, 12578 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = IAuthTabCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 1;
                $10 = i8 % 128;
                int i9 = i8 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 35283), 35 - (ViewConfiguration.getFadingEdgeLength() >> 16), 14239 - TextUtils.getOffsetBefore("", 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    i = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = $10 + 89;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i12 = $11 + 91;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr5 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i14 = $11 + 49;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i16 = $11 + 49;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        int i17 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 10935), 64 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.getCapsMode("", 0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[i17] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            throw null;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    int i18 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 10935), 65 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), Drawable.resolveOpacity(0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i18] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i19 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 29 - TextUtils.indexOf("", "", 0, 0), 17656 - ((byte) KeyEvent.getModifierMetaStateMask()), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i19] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - TextUtils.getOffsetBefore("", 0)), 70 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 12486 - (ViewConfiguration.getTouchSlop() >> 8), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            int i20 = $11 + 1;
            $10 = i20 % 128;
            if (i20 % 2 != 0) {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr4, 1, cArr6, 0, i4);
                System.arraycopy(cArr6, 0, cArr4, i4 >>> i6, i6);
                System.arraycopy(cArr6, i6, cArr4, 0, i4 - i6);
            } else {
                char[] cArr7 = new char[i4];
                System.arraycopy(cArr4, 0, cArr7, 0, i4);
                int i21 = i4 - i6;
                System.arraycopy(cArr7, 0, cArr4, i21, i6);
                System.arraycopy(cArr7, i6, cArr4, 0, i21);
            }
        }
        if (z) {
            int i22 = $11 + 7;
            $10 = i22 % 128;
            if (i22 % 2 != 0) {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            int i23 = $11 + 81;
            $10 = i23 % 128;
            if (i23 % 2 != 0) {
                int i24 = 5 % 4;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }
}
