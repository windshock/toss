package o;

import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.SidecarAdapterExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SidecarAdapterExternalSyntheticLambda1 implements ImageAnalysis.Analyzer {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private long IAuthTabCallback;
    private final Lazy onExtraCallback;
    private final onNavigationEvent onExtraCallbackWithResult;
    private final List<Integer> onNavigationEvent;
    private final long onWarmupCompleted;

    public interface onNavigationEvent {
        void onDetected(@NotNull onExtraCallbackWithResult onextracallbackwithresult);
    }

    public static final /* synthetic */ class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        public static final /* synthetic */ EnumEntries<BarcodeFormat> onNavigationEvent = access15300.onExtraCallbackWithResult(BarcodeFormat.values());
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 85;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }
    }

    public static /* synthetic */ MultiFormatReader onExtraCallback(List list) {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(list);
        }
        onExtraCallbackWithResult(list);
        throw null;
    }

    public SidecarAdapterExternalSyntheticLambda1(@NotNull final List<? extends BarcodeFormat> list, long j, @NotNull onNavigationEvent onnavigationevent) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        this.onExtraCallbackWithResult = onnavigationevent;
        this.onNavigationEvent = CollectionsKt.mutableListOf(new Integer[]{35, 39});
        this.onWarmupCompleted = 1000 / j;
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.barcodeprocessor.BarcodeProcessor$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 1;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                MultiFormatReader multiFormatReaderOnExtraCallback = SidecarAdapterExternalSyntheticLambda1.onExtraCallback(list);
                int i4 = IAuthTabCallback + 7;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return multiFormatReaderOnExtraCallback;
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SidecarAdapterExternalSyntheticLambda1(List list, long j, onNavigationEvent onnavigationevent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallbackStub + 75;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                list = onWarmupCompleted.onNavigationEvent;
                int i3 = IAuthTabCallbackStub + 45;
                onTransact = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 / 3;
                } else {
                    int i5 = 2 % 2;
                }
            } else {
                EnumEntries<BarcodeFormat> enumEntries = onWarmupCompleted.onNavigationEvent;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        if ((i & 2) != 0) {
            int i6 = 2 % 2;
            j = 1;
        }
        this(list, j, onnavigationevent);
    }

    private final MultiFormatReader IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        MultiFormatReader multiFormatReader = (MultiFormatReader) this.onExtraCallback.getValue();
        int i3 = onTransact + 27;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return multiFormatReader;
        }
        obj.hashCode();
        throw null;
    }

    private static final MultiFormatReader onExtraCallbackWithResult(List list) {
        int i = 2 % 2;
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        DecodeHintType decodeHintType = DecodeHintType.TRY_HARDER;
        Boolean bool = Boolean.TRUE;
        multiFormatReader.setHints(access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(decodeHintType, bool), getWrite.IAuthTabCallback(DecodeHintType.ALSO_INVERTED, bool), getWrite.IAuthTabCallback(DecodeHintType.POSSIBLE_FORMATS, list)}));
        int i2 = onTransact + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return multiFormatReader;
    }

    public void analyze(@NotNull ImageProxy imageProxy) {
        Object obj;
        onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(imageProxy, "");
        List<Integer> list = this.onNavigationEvent;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        int i2 = IAuthTabCallbackStub + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            if (((Number) it.next()).intValue() == imageProxy.getFormat()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.IAuthTabCallback < this.onWarmupCompleted) {
                    imageProxy.close();
                    return;
                }
                ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
                Intrinsics.checkNotNullExpressionValue(buffer, "");
                PlanarYUVLuminanceSource planarYUVLuminanceSource = new PlanarYUVLuminanceSource(IAuthTabCallback(buffer), imageProxy.getWidth(), imageProxy.getHeight(), 0, 0, imageProxy.getWidth(), imageProxy.getHeight(), false);
                try {
                    Result.Companion companion = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(IAuthTabCallback().decodeWithState(new BinaryBitmap(new HybridBinarizer(planarYUVLuminanceSource))));
                } catch (Throwable th) {
                    Result.Companion companion2 = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                }
                Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
                if (th2 == null) {
                    int i4 = IAuthTabCallbackStub + 3;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    com.google.zxing.Result result = (com.google.zxing.Result) obj;
                    Intrinsics.checkNotNull(result);
                    onextracallbackwithresultOnNavigationEvent = onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(onExtraCallbackWithResult.IAuthTabCallback.onExtraCallbackWithResult(result));
                } else {
                    onExtraCallbackWithResult.C0020onExtraCallbackWithResult c0020onExtraCallbackWithResultOnExtraCallback = onExtraCallbackWithResult.C0020onExtraCallbackWithResult.onExtraCallback(onExtraCallbackWithResult.C0020onExtraCallbackWithResult.onNavigationEvent(th2));
                    int i6 = IAuthTabCallbackStub + 39;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                    onextracallbackwithresultOnNavigationEvent = c0020onExtraCallbackWithResultOnExtraCallback;
                }
                this.onExtraCallbackWithResult.onDetected(onextracallbackwithresultOnNavigationEvent);
                this.IAuthTabCallback = jCurrentTimeMillis;
                imageProxy.close();
                return;
            }
        }
    }

    private final byte[] IAuthTabCallback(ByteBuffer byteBuffer) {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        int i4 = onTransact + 119;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return bArr;
    }

    public interface onExtraCallbackWithResult {

        @JvmInline
        public static final class IAuthTabCallback implements onExtraCallbackWithResult {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            private final com.google.zxing.Result onWarmupCompleted;

            public static String IAuthTabCallback(com.google.zxing.Result result) {
                int i = 2 % 2;
                String str = "Detected(result=" + result + ")";
                int i2 = onExtraCallback + 85;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public static com.google.zxing.Result onExtraCallbackWithResult(@NotNull com.google.zxing.Result result) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 69;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(result, "");
                int i4 = IAuthTabCallback + 49;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 0 / 0;
                }
                return result;
            }

            public static final /* synthetic */ IAuthTabCallback onNavigationEvent(com.google.zxing.Result result) {
                int i = 2 % 2;
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(result);
                int i2 = IAuthTabCallback + 1;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return iAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static int onWarmupCompleted(com.google.zxing.Result result) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 3;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = result.hashCode();
                int i4 = onExtraCallback + 73;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public static boolean onWarmupCompleted(com.google.zxing.Result result, Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 45;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                if (obj instanceof IAuthTabCallback) {
                    return Intrinsics.areEqual(result, ((IAuthTabCallback) obj).onExtraCallbackWithResult());
                }
                int i5 = i3 + 9;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 20 / 0;
                }
                return false;
            }

            public boolean equals(Object obj) {
                boolean zOnWarmupCompleted;
                int i = 2 % 2;
                int i2 = onExtraCallback + 15;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    zOnWarmupCompleted = onWarmupCompleted(this.onWarmupCompleted, obj);
                    int i3 = 27 / 0;
                } else {
                    zOnWarmupCompleted = onWarmupCompleted(this.onWarmupCompleted, obj);
                }
                int i4 = IAuthTabCallback + 61;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return zOnWarmupCompleted;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 53;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                com.google.zxing.Result result = this.onWarmupCompleted;
                if (i3 != 0) {
                    return onWarmupCompleted(result);
                }
                onWarmupCompleted(result);
                throw null;
            }

            public final /* synthetic */ com.google.zxing.Result onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 93;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                com.google.zxing.Result result = this.onWarmupCompleted;
                int i5 = i3 + 25;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return result;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 43;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                String strIAuthTabCallback = IAuthTabCallback(this.onWarmupCompleted);
                int i4 = IAuthTabCallback + 39;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return strIAuthTabCallback;
            }

            private /* synthetic */ IAuthTabCallback(com.google.zxing.Result result) {
                this.onWarmupCompleted = result;
            }
        }

        @JvmInline
        /* renamed from: o.SidecarAdapterExternalSyntheticLambda1$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class C0020onExtraCallbackWithResult implements onExtraCallbackWithResult {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            private final Throwable onWarmupCompleted;

            public static String IAuthTabCallback(Throwable th) {
                int i = 2 % 2;
                String str = "Error(error=" + th + ")";
                int i2 = onExtraCallbackWithResult + 37;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 24 / 0;
                }
                return str;
            }

            public static final /* synthetic */ C0020onExtraCallbackWithResult onExtraCallback(Throwable th) {
                int i = 2 % 2;
                C0020onExtraCallbackWithResult c0020onExtraCallbackWithResult = new C0020onExtraCallbackWithResult(th);
                int i2 = onExtraCallback + 69;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return c0020onExtraCallbackWithResult;
            }

            public static int onExtraCallbackWithResult(Throwable th) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 125;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = th.hashCode();
                int i4 = onExtraCallback + 89;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return iHashCode;
                }
                throw null;
            }

            public static boolean onExtraCallbackWithResult(Throwable th, Object obj) {
                int i = 2 % 2;
                if (!(obj instanceof C0020onExtraCallbackWithResult)) {
                    int i2 = onExtraCallbackWithResult + 119;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(th, ((C0020onExtraCallbackWithResult) obj).onExtraCallback())) {
                    int i4 = onExtraCallbackWithResult + 1;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                int i6 = onExtraCallback + 19;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 73 / 0;
                }
                return true;
            }

            public static Throwable onNavigationEvent(@NotNull Throwable th) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 23;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(th, "");
                if (i3 != 0) {
                    int i4 = 77 / 0;
                }
                int i5 = onExtraCallbackWithResult + 121;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return th;
                }
                throw null;
            }

            public boolean equals(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 9;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(this.onWarmupCompleted, obj);
                int i4 = onExtraCallbackWithResult + 69;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return zOnExtraCallbackWithResult;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 35;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int iOnExtraCallbackWithResult = onExtraCallbackWithResult(this.onWarmupCompleted);
                if (i3 == 0) {
                    int i4 = 21 / 0;
                }
                return iOnExtraCallbackWithResult;
            }

            public final /* synthetic */ Throwable onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 83;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                Throwable th = this.onWarmupCompleted;
                int i5 = i3 + 61;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return th;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 13;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                String strIAuthTabCallback = IAuthTabCallback(this.onWarmupCompleted);
                if (i3 == 0) {
                    int i4 = 38 / 0;
                }
                return strIAuthTabCallback;
            }

            private /* synthetic */ C0020onExtraCallbackWithResult(Throwable th) {
                this.onWarmupCompleted = th;
            }
        }
    }
}
