package im.toss.utils;

import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import im.toss.utils.RxUtils$;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.BreadcrumbTypeCompanion;
import o.JsonReaderUnknownNumberParsing;
import o.JsonReaderWithObjectReader;
import o.JsonReaderWithReader;
import o.MapConverter;
import o.MapConverter1;
import o.NetConverter3;
import o.advance;
import o.clearTid;
import o.deserializeDecimalCollection;
import o.deserializeFloatNullableCollection;
import o.deserializeIp;
import o.deserializeUri;
import o.getByteBuffer;
import o.r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk;
import o.serializeRaw;
import o.wasNull;
import o.writeAscii;
import o.writeQuotedString;
import o.writeRaw;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RxUtils {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    public static final RxUtils onNavigationEvent = new RxUtils();
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallback + 67;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(Function2 function2, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = onNavigationEvent(new Object[]{function2, obj, obj2}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1656516002, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1656516007, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
        int i4 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Object obj = objArr[0];
        writeRaw writeraw = (writeRaw) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return (deserializeIp) onNavigationEvent(new Object[]{obj, writeraw}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1516430223, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1516430219, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(BreadcrumbTypeCompanion breadcrumbTypeCompanion) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        asBinder(breadcrumbTypeCompanion);
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Object obj = objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = onExtraCallback(obj, jLongValue);
        int i4 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallback;
    }

    private static final Object onExtraCallback(Object obj, long j) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        int i4 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return obj;
    }

    public static /* synthetic */ void onExtraCallback(BreadcrumbTypeCompanion breadcrumbTypeCompanion) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(breadcrumbTypeCompanion);
        int i4 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallback(deserializeDecimalCollection deserializedecimalcollection, JsonReaderWithObjectReader jsonReaderWithObjectReader) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(deserializedecimalcollection, jsonReaderWithObjectReader);
        int i4 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(String str, JsonReaderWithObjectReader jsonReaderWithObjectReader) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(str, jsonReaderWithObjectReader);
        int i4 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(deserializeDecimalCollection deserializedecimalcollection, JsonReaderWithObjectReader jsonReaderWithObjectReader) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(deserializedecimalcollection, jsonReaderWithObjectReader);
        int i4 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onNavigationEvent(Object obj, long j) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = onWarmupCompleted(obj, j);
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        int i5 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return objOnWarmupCompleted;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Object obj = objArr[0];
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing = (JsonReaderUnknownNumberParsing) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnNavigationEvent = onNavigationEvent(obj, jsonReaderUnknownNumberParsing);
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        int i5 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnNavigationEvent;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i);
        int i11 = ~i4;
        int i12 = (~(i8 | i11 | i2)) | i10;
        int i13 = (~(i | i11)) | (~(i7 | i11));
        int i14 = i2 + i4 + i5 + (1941422536 * i6) + ((-555707305) * i3);
        int i15 = i14 * i14;
        int i16 = (i2 * (-2131549542)) + 177471488 + ((-2131549542) * i4) + (i9 * (-207299225)) + (i12 * (-207299225)) + ((-207299225) * i13) + (1956118528 * i5) + ((-1363148800) * i6) + (2141716480 * i3) + ((-573308928) * i15);
        int i17 = ((i2 * 487360618) - 1291405921) + (i4 * 487360618) + (i9 * 543) + (i12 * 543) + (i13 * 543) + (i5 * 487361161) + (i6 * (-1188264952)) + (i3 * 624576655) + (i15 * (-25952256));
        switch (i16 + (i17 * i17 * 74186752)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asBinder(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    private static final String onNavigationEvent(String str, long j) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int i4 = onWarmupCompleted + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onNavigationEvent(MapConverter mapConverter, deserializeDecimalCollection deserializedecimalcollection, JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) onNavigationEvent(new Object[]{mapConverter, deserializedecimalcollection, jsonReaderUnknownNumberParsing}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 94914992, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -94914989, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
        int i4 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onNavigationEvent(deserializeDecimalCollection deserializedecimalcollection, JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(deserializedecimalcollection, jsonReaderUnknownNumberParsing);
            throw null;
        }
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskIAuthTabCallback = IAuthTabCallback(deserializedecimalcollection, jsonReaderUnknownNumberParsing);
        int i3 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskIAuthTabCallback;
    }

    public static /* synthetic */ writeAscii onNavigationEvent(Object obj, advance advanceVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        writeAscii writeasciiIAuthTabCallback = IAuthTabCallback(obj, advanceVar);
        int i4 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return writeasciiIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(BreadcrumbTypeCompanion breadcrumbTypeCompanion) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(breadcrumbTypeCompanion);
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        int i5 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onNavigationEvent(deserializeDecimalCollection deserializedecimalcollection, JsonReaderWithObjectReader jsonReaderWithObjectReader) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        IAuthTabCallback(deserializedecimalcollection, jsonReaderWithObjectReader);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final Object onWarmupCompleted(Object obj, long j) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        int i4 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return obj;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String str = (String) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(str, jLongValue);
        }
        onNavigationEvent(str, jLongValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onWarmupCompleted(deserializeDecimalCollection deserializedecimalcollection, JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnExtraCallback = onExtraCallback(deserializedecimalcollection, jsonReaderUnknownNumberParsing);
        int i4 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ serializeRaw onWarmupCompleted(Object obj, getByteBuffer getbytebuffer) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback(obj, getbytebuffer);
            obj2.hashCode();
            throw null;
        }
        serializeRaw serializerawIAuthTabCallback = IAuthTabCallback(obj, getbytebuffer);
        int i3 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return serializerawIAuthTabCallback;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Collection collection, JsonReaderWithObjectReader jsonReaderWithObjectReader) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(collection, jsonReaderWithObjectReader);
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(BreadcrumbTypeCompanion breadcrumbTypeCompanion) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(new Object[]{breadcrumbTypeCompanion}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 813353052, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -813353045, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
            int i3 = 94 / 0;
        } else {
            onNavigationEvent(new Object[]{breadcrumbTypeCompanion}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 813353052, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -813353045, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
        }
        int i4 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private RxUtils() {
    }

    @JvmStatic
    public static final <T> MapConverter1<T, T> onWarmupCompleted(@Nullable final Object obj) {
        int i = 2 % 2;
        MapConverter1<T, T> mapConverter1 = new MapConverter1() { // from class: im.toss.utils.RxUtils$$ExternalSyntheticLambda19
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // o.MapConverter1
            public final serializeRaw apply(getByteBuffer getbytebuffer) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 83;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Object obj2 = obj;
                if (i4 == 0) {
                    return RxUtils.onWarmupCompleted(obj2, getbytebuffer);
                }
                RxUtils.onWarmupCompleted(obj2, getbytebuffer);
                throw null;
            }
        };
        int i2 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return mapConverter1;
    }

    private static final serializeRaw IAuthTabCallback(Object obj, getByteBuffer getbytebuffer) {
        final BreadcrumbTypeCompanion breadcrumbTypeCompanionOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getbytebuffer, "");
        getByteBuffer getbytebufferOnExtraCallbackWithResult = getbytebuffer.onNavigationEvent(clearTid.onExtraCallback()).onExtraCallbackWithResult(NetConverter3.onExtraCallback());
        if (obj == null || (breadcrumbTypeCompanionOnExtraCallbackWithResult = BreadcrumbTypeCompanion.Companion.onExtraCallbackWithResult(obj)) == null) {
            return getbytebufferOnExtraCallbackWithResult;
        }
        getByteBuffer getbytebufferOnExtraCallback = getbytebufferOnExtraCallbackWithResult.onExtraCallback(new deserializeDecimalCollection() { // from class: im.toss.utils.RxUtils$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // o.deserializeDecimalCollection
            public final void run() {
                int i4 = 2 % 2;
                int i5 = IAuthTabCallback + 125;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                RxUtils.IAuthTabCallback(breadcrumbTypeCompanionOnExtraCallbackWithResult);
                int i7 = IAuthTabCallback + 37;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }
        });
        int i4 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return getbytebufferOnExtraCallback;
    }

    private static final void asBinder(BreadcrumbTypeCompanion breadcrumbTypeCompanion) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        breadcrumbTypeCompanion.onExtraCallback();
        int i4 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @JvmStatic
    public static final <T> writeQuotedString<T, T> IAuthTabCallback(@Nullable final Object obj) {
        int i = 2 % 2;
        writeQuotedString<T, T> writequotedstring = new writeQuotedString() { // from class: im.toss.utils.RxUtils$$ExternalSyntheticLambda6
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // o.writeQuotedString
            public final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk apply(JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 59;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) RxUtils.onNavigationEvent(new Object[]{obj, jsonReaderUnknownNumberParsing}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1076144302, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1076144300, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
                int i4 = onExtraCallbackWithResult + 87;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
            }
        };
        int i2 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return writequotedstring;
    }

    private static final void onExtraCallbackWithResult(BreadcrumbTypeCompanion breadcrumbTypeCompanion) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        breadcrumbTypeCompanion.onExtraCallback();
        int i4 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onNavigationEvent(Object obj, JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(jsonReaderUnknownNumberParsing, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsing.onExtraCallback(clearTid.onExtraCallback()).onWarmupCompleted(NetConverter3.onExtraCallback());
        if (obj != null) {
            int i4 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                BreadcrumbTypeCompanion.Companion.onExtraCallbackWithResult(obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            final BreadcrumbTypeCompanion breadcrumbTypeCompanionOnExtraCallbackWithResult = BreadcrumbTypeCompanion.Companion.onExtraCallbackWithResult(obj);
            if (breadcrumbTypeCompanionOnExtraCallbackWithResult != null) {
                JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback = jsonReaderUnknownNumberParsingOnWarmupCompleted.IAuthTabCallback(new deserializeDecimalCollection() { // from class: im.toss.utils.RxUtils$$ExternalSyntheticLambda7
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // o.deserializeDecimalCollection
                    public final void run() {
                        int i5 = 2 % 2;
                        int i6 = onWarmupCompleted + 115;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        RxUtils.onNavigationEvent(breadcrumbTypeCompanionOnExtraCallbackWithResult);
                        int i8 = onWarmupCompleted + 37;
                        onExtraCallbackWithResult = i8 % 128;
                        if (i8 % 2 != 0) {
                            throw null;
                        }
                    }
                });
                int i5 = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return jsonReaderUnknownNumberParsingIAuthTabCallback;
            }
        }
        return jsonReaderUnknownNumberParsingOnWarmupCompleted;
    }

    @JvmStatic
    public static final <T> deserializeUri<T, T> onExtraCallbackWithResult(@Nullable final Object obj) {
        int i = 2 % 2;
        deserializeUri<T, T> deserializeuri = new deserializeUri() { // from class: im.toss.utils.RxUtils$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // o.deserializeUri
            public final deserializeIp apply(writeRaw writeraw) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 85;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                deserializeIp deserializeip = (deserializeIp) RxUtils.onNavigationEvent(new Object[]{obj, writeraw}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -406317851, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 406317851, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
                int i5 = onWarmupCompleted + 55;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return deserializeip;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        };
        int i2 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return deserializeuri;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        BreadcrumbTypeCompanion breadcrumbTypeCompanion = (BreadcrumbTypeCompanion) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        breadcrumbTypeCompanion.onExtraCallback();
        int i4 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004f A[PHI: r5
      0x004f: PHI (r5v5 o.writeRaw) = (r5v4 o.writeRaw), (r5v9 o.writeRaw) binds: [B:8:0x004d, B:5:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        writeRaw writerawIAuthTabCallback;
        Object obj = objArr[0];
        writeRaw writeraw = (writeRaw) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writerawIAuthTabCallback = writeraw.onNavigationEvent(clearTid.onExtraCallback()).IAuthTabCallback(NetConverter3.onExtraCallback());
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            int i3 = 59 / 0;
            if (obj != null) {
                final BreadcrumbTypeCompanion breadcrumbTypeCompanionOnExtraCallbackWithResult = BreadcrumbTypeCompanion.Companion.onExtraCallbackWithResult(obj);
                if (breadcrumbTypeCompanionOnExtraCallbackWithResult != null) {
                    writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onWarmupCompleted(new deserializeDecimalCollection() { // from class: im.toss.utils.RxUtils$$ExternalSyntheticLambda2
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        @Override // o.deserializeDecimalCollection
                        public final void run() {
                            int i4 = 2 % 2;
                            int i5 = IAuthTabCallback + 29;
                            onWarmupCompleted = i5 % 128;
                            int i6 = i5 % 2;
                            RxUtils.onWarmupCompleted(breadcrumbTypeCompanionOnExtraCallbackWithResult);
                            int i7 = IAuthTabCallback + 83;
                            onWarmupCompleted = i7 % 128;
                            if (i7 % 2 != 0) {
                                int i8 = 78 / 0;
                            }
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
                    return writerawOnWarmupCompleted;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writerawIAuthTabCallback = writeraw.onNavigationEvent(clearTid.onExtraCallback()).IAuthTabCallback(NetConverter3.onExtraCallback());
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            if (obj != null) {
            }
        }
        int i4 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return writerawIAuthTabCallback;
    }

    private static final writeAscii IAuthTabCallback(Object obj, advance advanceVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(advanceVar, "");
            Intrinsics.checkNotNullExpressionValue(advanceVar.IAuthTabCallback(clearTid.onExtraCallback()).onNavigationEvent(NetConverter3.onExtraCallback()), "");
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(advanceVar, "");
        advance advanceVarOnNavigationEvent = advanceVar.IAuthTabCallback(clearTid.onExtraCallback()).onNavigationEvent(NetConverter3.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(advanceVarOnNavigationEvent, "");
        if (obj != null) {
            int i3 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                BreadcrumbTypeCompanion.Companion.onExtraCallbackWithResult(obj);
                obj2.hashCode();
                throw null;
            }
            BreadcrumbTypeCompanion breadcrumbTypeCompanionOnExtraCallbackWithResult = BreadcrumbTypeCompanion.Companion.onExtraCallbackWithResult(obj);
            if (breadcrumbTypeCompanionOnExtraCallbackWithResult != null) {
                advance advanceVarIAuthTabCallback = advanceVarOnNavigationEvent.IAuthTabCallback((deserializeDecimalCollection) new RxUtils$.ExternalSyntheticLambda12(breadcrumbTypeCompanionOnExtraCallbackWithResult));
                Intrinsics.checkNotNullExpressionValue(advanceVarIAuthTabCallback, "");
                int i4 = onExtraCallbackWithResult + 97;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return advanceVarIAuthTabCallback;
            }
        }
        return advanceVarOnNavigationEvent;
    }

    private static final void IAuthTabCallbackDefault(BreadcrumbTypeCompanion breadcrumbTypeCompanion) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        breadcrumbTypeCompanion.onExtraCallback();
        int i4 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk IAuthTabCallback(deserializeDecimalCollection deserializedecimalcollection, JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonReaderUnknownNumberParsing, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback = jsonReaderUnknownNumberParsing.IAuthTabCallback(JsonReaderUnknownNumberParsing.onExtraCallback((JsonReaderWithReader) new RxUtils$.ExternalSyntheticLambda13(deserializedecimalcollection), wasNull.LATEST));
        int i2 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return jsonReaderUnknownNumberParsingIAuthTabCallback;
    }

    private static final void onWarmupCompleted(deserializeDecimalCollection deserializedecimalcollection, JsonReaderWithObjectReader jsonReaderWithObjectReader) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(jsonReaderWithObjectReader, "");
        if (jsonReaderWithObjectReader.onWarmupCompleted()) {
            return;
        }
        try {
            deserializedecimalcollection.run();
            jsonReaderWithObjectReader.onNavigationEvent();
            int i4 = onExtraCallbackWithResult + 79;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            jsonReaderWithObjectReader.onExtraCallback(th);
        }
    }

    private static final void IAuthTabCallbackDefault(deserializeDecimalCollection deserializedecimalcollection, JsonReaderWithObjectReader jsonReaderWithObjectReader) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonReaderWithObjectReader, "");
        if (!jsonReaderWithObjectReader.onWarmupCompleted()) {
            int i2 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    deserializedecimalcollection.run();
                    jsonReaderWithObjectReader.IAuthTabCallback(0L);
                    jsonReaderWithObjectReader.onNavigationEvent();
                    return;
                } else {
                    deserializedecimalcollection.run();
                    jsonReaderWithObjectReader.IAuthTabCallback(1L);
                    jsonReaderWithObjectReader.onNavigationEvent();
                    return;
                }
            } catch (Throwable th) {
                jsonReaderWithObjectReader.onExtraCallback(th);
            }
        }
        int i3 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i2 % 128;
        Object obj3 = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            function2.invoke(obj, obj2);
            obj3.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Object objInvoke = function2.invoke(obj, obj2);
        int i3 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return objInvoke;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        MapConverter mapConverter = (MapConverter) objArr[0];
        final deserializeDecimalCollection deserializedecimalcollection = (deserializeDecimalCollection) objArr[1];
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing = (JsonReaderUnknownNumberParsing) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonReaderUnknownNumberParsing, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback = JsonReaderUnknownNumberParsing.onExtraCallback(new JsonReaderWithReader() { // from class: im.toss.utils.RxUtils$$ExternalSyntheticLambda16
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // o.JsonReaderWithReader
            public final void subscribe(JsonReaderWithObjectReader jsonReaderWithObjectReader) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 69;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    RxUtils.onExtraCallback(deserializedecimalcollection, jsonReaderWithObjectReader);
                    int i4 = 75 / 0;
                } else {
                    RxUtils.onExtraCallback(deserializedecimalcollection, jsonReaderWithObjectReader);
                }
                int i5 = onNavigationEvent + 79;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 54 / 0;
                }
            }
        }, wasNull.LATEST);
        final Function2 function2 = new Function2() { // from class: im.toss.utils.RxUtils$$ExternalSyntheticLambda17
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 57;
                IAuthTabCallback = i3 % 128;
                Long l = (Long) obj2;
                if (i3 % 2 == 0) {
                    return RxUtils.onNavigationEvent(new Object[]{obj, Long.valueOf(l.longValue())}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 208235583, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -208235577, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
                }
                int i4 = 57 / 0;
                return RxUtils.onNavigationEvent(new Object[]{obj, Long.valueOf(l.longValue())}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 208235583, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -208235577, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
            }
        };
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback2 = jsonReaderUnknownNumberParsing.onExtraCallback(jsonReaderUnknownNumberParsingOnExtraCallback, new deserializeFloatNullableCollection() { // from class: im.toss.utils.RxUtils$$ExternalSyntheticLambda18
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // o.deserializeFloatNullableCollection
            public final Object apply(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 67;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Object objIAuthTabCallback = RxUtils.IAuthTabCallback(function2, obj, obj2);
                int i5 = onExtraCallback + 113;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return objIAuthTabCallback;
                }
                throw null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnExtraCallback2, "");
        if (mapConverter == null) {
            int i2 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return jsonReaderUnknownNumberParsingOnExtraCallback2;
            }
            throw null;
        }
        int i3 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback3 = jsonReaderUnknownNumberParsingOnExtraCallback2.onExtraCallback(mapConverter);
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnExtraCallback3, "");
        if (i4 == 0) {
            throw null;
        }
        int i5 = onWarmupCompleted + 19;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return jsonReaderUnknownNumberParsingOnExtraCallback3;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onExtraCallback(deserializeDecimalCollection deserializedecimalcollection, JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonReaderUnknownNumberParsing, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnNavigationEvent = jsonReaderUnknownNumberParsing.onNavigationEvent(JsonReaderUnknownNumberParsing.onExtraCallback((JsonReaderWithReader) new RxUtils$.ExternalSyntheticLambda8(deserializedecimalcollection), wasNull.LATEST));
        int i2 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 34 / 0;
        }
        return jsonReaderUnknownNumberParsingOnNavigationEvent;
    }

    private static final void IAuthTabCallback(deserializeDecimalCollection deserializedecimalcollection, JsonReaderWithObjectReader jsonReaderWithObjectReader) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(jsonReaderWithObjectReader, "");
        if (jsonReaderWithObjectReader.onWarmupCompleted()) {
            int i4 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        try {
            deserializedecimalcollection.run();
            jsonReaderWithObjectReader.onNavigationEvent();
        } catch (Throwable th) {
            jsonReaderWithObjectReader.onExtraCallback(th);
        }
    }

    private static final void onWarmupCompleted(String str, JsonReaderWithObjectReader jsonReaderWithObjectReader) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonReaderWithObjectReader, "");
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "");
        int length = charArray.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                sb.append(charArray[i2]);
                jsonReaderWithObjectReader.IAuthTabCallback(sb.toString());
                i2 += 23;
            } else {
                sb.append(charArray[i2]);
                jsonReaderWithObjectReader.IAuthTabCallback(sb.toString());
                i2++;
            }
        }
        jsonReaderWithObjectReader.onNavigationEvent();
        int i4 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onNavigationEvent(Collection collection, JsonReaderWithObjectReader jsonReaderWithObjectReader) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonReaderWithObjectReader, "");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            int i2 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                jsonReaderWithObjectReader.IAuthTabCallback(it.next());
                int i3 = 80 / 0;
            } else {
                jsonReaderWithObjectReader.IAuthTabCallback(it.next());
            }
        }
        jsonReaderWithObjectReader.onNavigationEvent();
        int i4 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onWarmupCompleted(Object obj, JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing) {
        return (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) onNavigationEvent(new Object[]{obj, jsonReaderUnknownNumberParsing}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1076144302, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1076144300, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }

    public static /* synthetic */ String onExtraCallbackWithResult(String str, long j) {
        return (String) onNavigationEvent(new Object[]{str, Long.valueOf(j)}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1944475388, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1944475387, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }

    public static /* synthetic */ deserializeIp IAuthTabCallback(Object obj, writeRaw writeraw) {
        return (deserializeIp) onNavigationEvent(new Object[]{obj, writeraw}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -406317851, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 406317851, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }

    private static final deserializeIp onExtraCallbackWithResult(Object obj, writeRaw writeraw) {
        return (deserializeIp) onNavigationEvent(new Object[]{obj, writeraw}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1516430223, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1516430219, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }

    private static final void IAuthTabCallbackStub(BreadcrumbTypeCompanion breadcrumbTypeCompanion) {
        onNavigationEvent(new Object[]{breadcrumbTypeCompanion}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 813353052, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -813353045, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk IAuthTabCallback(MapConverter mapConverter, deserializeDecimalCollection deserializedecimalcollection, JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing) {
        return (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) onNavigationEvent(new Object[]{mapConverter, deserializedecimalcollection, jsonReaderUnknownNumberParsing}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 94914992, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -94914989, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }

    private static final Object onWarmupCompleted(Function2 function2, Object obj, Object obj2) {
        return onNavigationEvent(new Object[]{function2, obj, obj2}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1656516002, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1656516007, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }
}
